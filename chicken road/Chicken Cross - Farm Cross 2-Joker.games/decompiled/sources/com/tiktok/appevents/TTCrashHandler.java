package com.tiktok.appevents;

import android.app.Application;
import android.text.TextUtils;
import com.tiktok.TikTokBusinessSdk;
import com.tiktok.util.HttpRequestUtil;
import com.tiktok.util.IOUtils;
import com.tiktok.util.JSON;
import com.tiktok.util.TTLogger;
import com.tiktok.util.TTUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class TTCrashHandler {
    private static final String CRASH_REPORT_FILE = "tt_crash_log";
    private static final int MONITOR_BATCH_MAX = 5;
    private static final int MONITOR_RETRY_LIMIT = 2;
    private static final String TAG = "TTCrashHandler";
    private static final TTLogger ttLogger = new TTLogger(TAG, TikTokBusinessSdk.getLogLevel());
    static volatile TTCrashReport crashReport = new TTCrashReport();

    public static void handleCrash(String originTag, Throwable ex, int type) {
        if (ex != null) {
            if (TextUtils.isEmpty(originTag)) {
                originTag = "";
            }
            ttLogger.error(ex, "Error caused by sdk at " + originTag + "\n" + ex.getMessage(), new Object[0]);
            persistException(ex, type);
        }
    }

    public static void retryLater(JSONObject monitor) {
        try {
            if (crashReport != null) {
                crashReport.addReport(monitor.toString(), System.currentTimeMillis(), 0);
            }
        } catch (Throwable unused) {
        }
    }

    public static void persistToFile() {
        try {
            if (crashReport == null || crashReport.reports.isEmpty()) {
                return;
            }
            saveToFile(crashReport);
            crashReport = new TTCrashReport();
        } catch (Throwable unused) {
        }
    }

    public static void initCrashReporter() {
        try {
            TTCrashReport readFromFile = readFromFile();
            if (readFromFile != null && readFromFile.reports != null) {
                crashReport.reports.addAll(readFromFile.reports);
            }
            try {
                File file = new File(TikTokBusinessSdk.getApplicationContext().getFilesDir(), CRASH_REPORT_FILE);
                if (file.exists()) {
                    file.delete();
                }
            } catch (Throwable unused) {
            }
            saveToFile(reportMonitor(crashReport));
            crashReport = new TTCrashReport();
        } catch (Throwable unused2) {
        }
    }

    private static TTCrashReport reportMonitor(TTCrashReport cr) {
        if (cr.reports == null || cr.reports.isEmpty()) {
            return cr;
        }
        TTCrashReport tTCrashReport = new TTCrashReport();
        try {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i < cr.reports.size()) {
                int i2 = i + 5;
                try {
                    List<TTCrashReport.Monitor> subList = cr.reports.subList(i, i2 > cr.reports.size() ? cr.reports.size() : i2);
                    JSONArray buildArr = JSON.buildArr();
                    Iterator<TTCrashReport.Monitor> it = subList.iterator();
                    while (it.hasNext()) {
                        try {
                            String str = it.next().monitor;
                            if (!TextUtils.isEmpty(str) && !arrayList.contains(str)) {
                                arrayList.add(str);
                                JSONObject build = JSON.build(str);
                                if (build != null && build.length() > 0) {
                                    JSON.putArr(buildArr, build);
                                }
                            }
                        } catch (Throwable unused) {
                        }
                    }
                    if (buildArr.length() > 0) {
                        JSONObject basePayloadWithTs = TTRequestBuilder.getBasePayloadWithTs();
                        JSON.putObject(basePayloadWithTs, "batch", buildArr);
                        HttpRequestUtil.HttpResponse reportMonitorEvent = TTRequest.reportMonitorEvent(basePayloadWithTs);
                        if (reportMonitorEvent == null || !reportMonitorEvent.isOK()) {
                            for (TTCrashReport.Monitor monitor : subList) {
                                tTCrashReport.addReport(monitor.monitor, System.currentTimeMillis(), monitor.attempt + 1);
                            }
                        }
                    }
                } catch (Throwable unused2) {
                }
                i = i2;
            }
        } catch (Throwable unused3) {
        }
        return tTCrashReport;
    }

    static class TTCrashReport implements Serializable {
        List<Monitor> reports = new CopyOnWriteArrayList();

        TTCrashReport() {
        }

        static class Monitor implements Serializable {
            public int attempt;
            public final String monitor;
            public long ts;

            public Monitor(String o, long t, int a2) {
                this.monitor = o;
                this.ts = t;
                this.attempt = a2;
            }
        }

        public void addReport(String o, long t, int a2) {
            if (a2 < 2) {
                this.reports.add(new Monitor(o, t, a2));
            }
        }
    }

    private static void persistException(Throwable ex, int type) {
        JSONObject jSONObject = null;
        try {
            JSONObject healthMonitorBase = TTRequestBuilder.getHealthMonitorBase();
            try {
                JSON.putObject(healthMonitorBase, "monitor", TTUtil.getMonitorException(ex, null, type));
                crashReport.addReport(healthMonitorBase.toString(), System.currentTimeMillis(), 0);
                saveToFile(crashReport);
                crashReport = new TTCrashReport();
            } catch (Throwable unused) {
                jSONObject = healthMonitorBase;
                if (jSONObject == null || !jSONObject.has("monitor")) {
                    return;
                }
                JSONArray buildArr = JSON.buildArr();
                JSON.putArr(buildArr, jSONObject);
                JSONObject basePayloadWithTs = TTRequestBuilder.getBasePayloadWithTs();
                JSON.putObject(basePayloadWithTs, "batch", buildArr);
                TTRequest.reportMonitorEvent(basePayloadWithTs);
            }
        } catch (Throwable unused2) {
        }
    }

    private static void saveToFile(TTCrashReport cr) {
        ObjectOutputStream objectOutputStream;
        if (cr == null || cr.reports == null || cr.reports.isEmpty()) {
            return;
        }
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream openFileOutput = TikTokBusinessSdk.getApplicationContext().openFileOutput(CRASH_REPORT_FILE, 0);
            try {
                objectOutputStream = new ObjectOutputStream(openFileOutput);
                try {
                    objectOutputStream.writeObject(cr);
                    IOUtils.close(openFileOutput, objectOutputStream);
                } catch (Throwable unused) {
                    fileOutputStream = openFileOutput;
                    try {
                        reportMonitor(cr);
                        IOUtils.close(fileOutputStream, objectOutputStream);
                    } catch (Throwable th) {
                        IOUtils.close(fileOutputStream, objectOutputStream);
                        throw th;
                    }
                }
            } catch (Throwable unused2) {
                objectOutputStream = null;
            }
        } catch (Throwable unused3) {
            objectOutputStream = null;
        }
    }

    private static TTCrashReport readFromFile() {
        FileInputStream fileInputStream;
        Application applicationContext = TikTokBusinessSdk.getApplicationContext();
        if (applicationContext == null) {
            return null;
        }
        try {
            fileInputStream = applicationContext.openFileInput(CRASH_REPORT_FILE);
        } catch (Throwable unused) {
            fileInputStream = null;
        }
        try {
            TTCrashReport safeReadTTCrashHandler = TTSafeReadObjectUtil.safeReadTTCrashHandler(fileInputStream);
            IOUtils.close(fileInputStream);
            return safeReadTTCrashHandler;
        } catch (Throwable unused2) {
            IOUtils.close(fileInputStream);
            return null;
        }
    }

    public static boolean isTTSDKRelatedException(Throwable e) {
        if (e == null) {
            return false;
        }
        Throwable th = null;
        while (e != null && e != th) {
            if (isTTSDKRelatedException(e.getStackTrace())) {
                return true;
            }
            th = e;
            e = e.getCause();
        }
        return false;
    }

    public static boolean isTTSDKRelatedException(StackTraceElement[] elts) {
        if (elts != null && elts.length >= 1) {
            for (StackTraceElement stackTraceElement : elts) {
                if (stackTraceElement != null && stackTraceElement.getClassName().startsWith("com.tiktok")) {
                    return true;
                }
            }
        }
        return false;
    }
}
