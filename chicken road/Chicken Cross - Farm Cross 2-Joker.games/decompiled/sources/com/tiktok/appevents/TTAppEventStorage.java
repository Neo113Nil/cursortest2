package com.tiktok.appevents;

import android.app.Application;
import com.tiktok.TikTokBusinessSdk;
import com.tiktok.util.IOUtils;
import com.tiktok.util.JSON;
import com.tiktok.util.TTLogger;
import com.tiktok.util.TTUtil;
import io.ktor.http.ContentDisposition;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes7.dex */
class TTAppEventStorage {
    private static final String EVENT_STORAGE_FILE = "events_cache";
    private static final int MAX_PERSIST_EVENTS_NUM = 500;
    private static final String TAG = "TTAppEventStorage";
    private static final TTLogger logger = new TTLogger(TAG, TikTokBusinessSdk.getLogLevel());

    TTAppEventStorage() {
    }

    public static synchronized void persist(List<TTAppEvent> failedEvents) {
        TTLogger tTLogger;
        synchronized (TTAppEventStorage.class) {
            TTUtil.checkThread(TAG);
            try {
                tTLogger = logger;
                tTLogger.debug("Tried to persist to disk", new Object[0]);
            } catch (Throwable unused) {
            }
            if (!TikTokBusinessSdk.isSystemActivated()) {
                tTLogger.debug("Quit persisting to disk because global switch is turned off", new Object[0]);
                return;
            }
            List<TTAppEvent> exportAllEvents = TTAppEventsQueue.exportAllEvents();
            TTAppEventPersist readFromDisk = readFromDisk();
            if (exportAllEvents.isEmpty() && readFromDisk.isEmpty() && (failedEvents == null || failedEvents.isEmpty())) {
                return;
            }
            TTAppEventPersist tTAppEventPersist = new TTAppEventPersist();
            if (failedEvents != null) {
                tTAppEventPersist.addEvents(failedEvents);
            }
            tTAppEventPersist.addEvents(readFromDisk.getAppEvents());
            tTAppEventPersist.addEvents(exportAllEvents);
            discardOldEvents(tTAppEventPersist, 500);
            saveToDisk(tTAppEventPersist);
        }
    }

    private static void discardOldEvents(TTAppEventPersist ttAppEventPersist, int maxPersistNum) {
        List<TTAppEvent> appEvents;
        int size;
        if (ttAppEventPersist == null || ttAppEventPersist.isEmpty() || (size = (appEvents = ttAppEventPersist.getAppEvents()).size()) <= maxPersistNum) {
            return;
        }
        logger.debug("Way too many events(%d), slim it!", Integer.valueOf(size));
        int i = size - maxPersistNum;
        TTAppEventLogger.totalDumped += i;
        TikTokBusinessSdk.diskListener.onDumped(TTAppEventLogger.totalDumped);
        ttAppEventPersist.setAppEvents(new ArrayList(appEvents.subList(i, size)));
    }

    private static boolean saveToDisk(TTAppEventPersist appEventPersist) {
        ObjectOutputStream objectOutputStream;
        boolean z = false;
        if (appEventPersist.isEmpty()) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(TikTokBusinessSdk.getApplicationContext().openFileOutput(EVENT_STORAGE_FILE, 0)));
            try {
                objectOutputStream.writeObject(appEventPersist);
                logger.debug("Saving %d events to disk", Integer.valueOf(appEventPersist.getAppEvents().size()));
                if (TikTokBusinessSdk.diskListener != null) {
                    TikTokBusinessSdk.diskListener.onDiskChange(appEventPersist.getAppEvents().size(), false);
                }
                IOUtils.close(objectOutputStream);
                z = true;
            } catch (Throwable th) {
                th = th;
                try {
                    TTCrashHandler.handleCrash(TAG, th, 2);
                    IOUtils.close(objectOutputStream);
                    long currentTimeMillis2 = System.currentTimeMillis();
                    JSONObject metaWithTS = TTUtil.getMetaWithTS(Long.valueOf(currentTimeMillis));
                    JSON.putLong(metaWithTS, "latency", currentTimeMillis2 - currentTimeMillis);
                    JSON.putBoolean(metaWithTS, "success", z);
                    JSON.putInt(metaWithTS, ContentDisposition.Parameters.Size, appEventPersist.getAppEvents().size());
                    TikTokBusinessSdk.getAppEventLogger().monitorMetric("file_w", metaWithTS, null);
                    return z;
                } catch (Throwable th2) {
                    IOUtils.close(objectOutputStream);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            objectOutputStream = null;
        }
        try {
            long currentTimeMillis22 = System.currentTimeMillis();
            JSONObject metaWithTS2 = TTUtil.getMetaWithTS(Long.valueOf(currentTimeMillis));
            JSON.putLong(metaWithTS2, "latency", currentTimeMillis22 - currentTimeMillis);
            JSON.putBoolean(metaWithTS2, "success", z);
            JSON.putInt(metaWithTS2, ContentDisposition.Parameters.Size, appEventPersist.getAppEvents().size());
            TikTokBusinessSdk.getAppEventLogger().monitorMetric("file_w", metaWithTS2, null);
        } catch (Throwable unused) {
        }
        return z;
    }

    private static void deleteFile(File f) {
        try {
            if (f.exists()) {
                f.delete();
            }
        } catch (Throwable unused) {
        }
    }

    static synchronized TTAppEventPersist readFromDisk() {
        FileInputStream fileInputStream;
        synchronized (TTAppEventStorage.class) {
            long currentTimeMillis = System.currentTimeMillis();
            TTUtil.checkThread(TAG);
            Application applicationContext = TikTokBusinessSdk.getApplicationContext();
            File file = new File(applicationContext.getFilesDir(), EVENT_STORAGE_FILE);
            if (!file.exists()) {
                return new TTAppEventPersist();
            }
            TTAppEventPersist tTAppEventPersist = new TTAppEventPersist();
            try {
                fileInputStream = applicationContext.openFileInput(EVENT_STORAGE_FILE);
                try {
                    tTAppEventPersist = TTSafeReadObjectUtil.safeReadTTAppEventPersist(fileInputStream);
                    logger.debug("disk read data: %s", tTAppEventPersist);
                    deleteFile(file);
                    if (TikTokBusinessSdk.diskListener != null) {
                        TikTokBusinessSdk.diskListener.onDiskChange(0, true);
                    }
                    IOUtils.close(fileInputStream);
                } catch (Throwable th) {
                    th = th;
                    try {
                        deleteFile(file);
                        TTCrashHandler.handleCrash(TAG, th, 2);
                        IOUtils.close(fileInputStream);
                        long currentTimeMillis2 = System.currentTimeMillis();
                        JSONObject metaWithTS = TTUtil.getMetaWithTS(Long.valueOf(currentTimeMillis2));
                        JSON.putLong(metaWithTS, "latency", currentTimeMillis2 - currentTimeMillis);
                        JSON.putInt(metaWithTS, ContentDisposition.Parameters.Size, tTAppEventPersist.getAppEvents().size());
                        TikTokBusinessSdk.getAppEventLogger().monitorMetric("file_r", metaWithTS, null);
                        return tTAppEventPersist;
                    } catch (Throwable th2) {
                        IOUtils.close(fileInputStream);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                fileInputStream = null;
            }
            try {
                long currentTimeMillis22 = System.currentTimeMillis();
                JSONObject metaWithTS2 = TTUtil.getMetaWithTS(Long.valueOf(currentTimeMillis22));
                JSON.putLong(metaWithTS2, "latency", currentTimeMillis22 - currentTimeMillis);
                JSON.putInt(metaWithTS2, ContentDisposition.Parameters.Size, tTAppEventPersist.getAppEvents().size());
                TikTokBusinessSdk.getAppEventLogger().monitorMetric("file_r", metaWithTS2, null);
            } catch (Throwable unused) {
            }
            return tTAppEventPersist;
        }
    }

    public static synchronized void clearAll() {
        synchronized (TTAppEventStorage.class) {
            TTUtil.checkThread(TAG);
            try {
                deleteFile(new File(TikTokBusinessSdk.getApplicationContext().getFilesDir(), EVENT_STORAGE_FILE));
            } catch (Throwable unused) {
            }
            if (TikTokBusinessSdk.diskListener != null) {
                TikTokBusinessSdk.diskListener.onDiskChange(0, true);
            }
        }
    }
}
