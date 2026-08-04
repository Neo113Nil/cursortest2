package io.sentry.android.replay;

import C6.o;
import Y4.D;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.internal.ads.zzbbd;
import io.sentry.DateUtils;
import io.sentry.ISentryLifecycleToken;
import io.sentry.ReplayRecording;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.SentryReplayEvent;
import io.sentry.android.replay.video.MuxerConfig;
import io.sentry.android.replay.video.SimpleVideoEncoder;
import io.sentry.protocol.SentryId;
import io.sentry.rrweb.RRWebEvent;
import io.sentry.rrweb.RRWebOptionsEvent;
import io.sentry.util.AutoClosableReentrantLock;
import io.sentry.util.FileUtils;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function1;
import p050g6.i;
import p050g6.n;
import p050g6.p;
import p113p3.f;
import p115p6.c;
import t6.e;
import t6.h;
import z6.g;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class ReplayCache implements Closeable {
    public static final String ONGOING_SEGMENT = ".ongoing_segment";
    public static final String SEGMENT_KEY_BIT_RATE = "config.bit-rate";
    public static final String SEGMENT_KEY_FRAME_RATE = "config.frame-rate";
    public static final String SEGMENT_KEY_HEIGHT = "config.height";
    public static final String SEGMENT_KEY_ID = "segment.id";
    public static final String SEGMENT_KEY_REPLAY_ID = "replay.id";
    public static final String SEGMENT_KEY_REPLAY_RECORDING = "replay.recording";
    public static final String SEGMENT_KEY_REPLAY_SCREEN_AT_START = "replay.screen-at-start";
    public static final String SEGMENT_KEY_REPLAY_TYPE = "replay.type";
    public static final String SEGMENT_KEY_TIMESTAMP = "segment.timestamp";
    public static final String SEGMENT_KEY_WIDTH = "config.width";
    private SimpleVideoEncoder encoder;
    private final AutoClosableReentrantLock encoderLock;
    private final List<ReplayFrame> frames;
    private final AtomicBoolean isClosed;
    private final AutoClosableReentrantLock lock;
    private final LinkedHashMap<String, String> ongoingSegment;
    private final p044f6.b ongoingSegmentFile$delegate;
    private final SentryOptions options;
    private final p044f6.b replayCacheDir$delegate;
    private final SentryId replayId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean fromDisk$lambda$3(ReplayCache replayCache, File file, String str) {
            h.e(replayCache, "$cache");
            h.d(str, "name");
            if (str.endsWith(".jpg")) {
                File file2 = new File(file, str);
                String name = file2.getName();
                h.d(name, "getName(...)");
                int iR0 = (6 & 2) != 0 ? o.r0(name) : 0;
                h.e(name, "<this>");
                h.e(".", "string");
                int iLastIndexOf = name.lastIndexOf(".", iR0);
                if (iLastIndexOf != -1) {
                    name = name.substring(0, iLastIndexOf);
                    h.d(name, "substring(...)");
                }
                Long lF0 = o.F0(name);
                if (lF0 != null) {
                    ReplayCache.addFrame$default(replayCache, file2, lF0.longValue(), null, 4, null);
                }
            }
            return false;
        }

        public static /* synthetic */ LastSegmentData fromDisk$sentry_android_replay_release$default(Companion companion, SentryOptions sentryOptions, SentryId sentryId, Function1 function1, int i7, Object obj) {
            if ((i7 & 4) != 0) {
                function1 = null;
            }
            return companion.fromDisk$sentry_android_replay_release(sentryOptions, sentryId, function1);
        }

        /* JADX WARN: Code duplicated, block: B:93:0x020e  */
        public final LastSegmentData fromDisk$sentry_android_replay_release(SentryOptions sentryOptions, SentryId sentryId, Function1 function1) {
            Date dateTime;
            SentryReplayEvent.ReplayType replayTypeValueOf;
            final ReplayCache replayCache;
            String str = "";
            h.e(sentryOptions, RRWebOptionsEvent.EVENT_TAG);
            h.e(sentryId, "replayId");
            File fileMakeReplayCacheDir = makeReplayCacheDir(sentryOptions, sentryId);
            File file = new File(fileMakeReplayCacheDir, ReplayCache.ONGOING_SEGMENT);
            Iterable linkedList = null;
            if (!file.exists()) {
                sentryOptions.getLogger().log(SentryLevel.DEBUG, "No ongoing segment found for replay: %s", sentryId);
                FileUtils.deleteRecursively(fileMakeReplayCacheDir);
                return null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), C6.a.f1581a), 8192);
            try {
                Iterator it = new B6.a(new B6.e(bufferedReader, 3)).iterator();
                while (it.hasNext()) {
                    List listA0 = o.A0((String) it.next(), new String[]{"="});
                    linkedHashMap.put((String) listA0.get(0), (String) listA0.get(1));
                }
                p115p6.a.e(bufferedReader, null);
                String str2 = (String) linkedHashMap.get(ReplayCache.SEGMENT_KEY_HEIGHT);
                Integer numE0 = str2 != null ? o.E0(str2) : null;
                String str3 = (String) linkedHashMap.get(ReplayCache.SEGMENT_KEY_WIDTH);
                Integer numE1 = str3 != null ? o.E0(str3) : null;
                String str4 = (String) linkedHashMap.get(ReplayCache.SEGMENT_KEY_FRAME_RATE);
                Integer numE2 = str4 != null ? o.E0(str4) : null;
                String str5 = (String) linkedHashMap.get(ReplayCache.SEGMENT_KEY_BIT_RATE);
                Integer numE3 = str5 != null ? o.E0(str5) : null;
                String str6 = (String) linkedHashMap.get(ReplayCache.SEGMENT_KEY_ID);
                Integer numE4 = str6 != null ? o.E0(str6) : null;
                try {
                    String str7 = (String) linkedHashMap.get(ReplayCache.SEGMENT_KEY_TIMESTAMP);
                    if (str7 == null) {
                        str7 = "";
                    }
                    dateTime = DateUtils.getDateTime(str7);
                } catch (Throwable unused) {
                    dateTime = null;
                }
                try {
                    String str8 = (String) linkedHashMap.get(ReplayCache.SEGMENT_KEY_REPLAY_TYPE);
                    if (str8 != null) {
                        str = str8;
                    }
                    replayTypeValueOf = SentryReplayEvent.ReplayType.valueOf(str);
                } catch (Throwable unused2) {
                    replayTypeValueOf = null;
                }
                if (numE0 == null || numE1 == null || numE2 == null || numE3 == null || numE4 == null || numE4.intValue() == -1 || dateTime == null || replayTypeValueOf == null) {
                    sentryOptions.getLogger().log(SentryLevel.DEBUG, "Incorrect segment values found for replay: %s, deleting the replay", sentryId);
                    FileUtils.deleteRecursively(fileMakeReplayCacheDir);
                    return null;
                }
                ScreenshotRecorderConfig screenshotRecorderConfig = new ScreenshotRecorderConfig(numE1.intValue(), numE0.intValue(), 1.0f, 1.0f, numE2.intValue(), numE3.intValue());
                if (function1 == null || (replayCache = (ReplayCache) function1.invoke(sentryId)) == null) {
                    replayCache = new ReplayCache(sentryOptions, sentryId);
                }
                File replayCacheDir$sentry_android_replay_release = replayCache.getReplayCacheDir$sentry_android_replay_release();
                if (replayCacheDir$sentry_android_replay_release != null) {
                    replayCacheDir$sentry_android_replay_release.listFiles(new FilenameFilter() { // from class: io.sentry.android.replay.a
                        @Override // java.io.FilenameFilter
                        public final boolean accept(File file2, String str9) {
                            return ReplayCache.Companion.fromDisk$lambda$3(replayCache, file2, str9);
                        }
                    });
                }
                if (replayCache.getFrames$sentry_android_replay_release().isEmpty()) {
                    sentryOptions.getLogger().log(SentryLevel.DEBUG, "No frames found for replay: %s, deleting the replay", sentryId);
                    FileUtils.deleteRecursively(fileMakeReplayCacheDir);
                    return null;
                }
                List<ReplayFrame> frames$sentry_android_replay_release = replayCache.getFrames$sentry_android_replay_release();
                if (frames$sentry_android_replay_release.size() > 1) {
                    Comparator comparator = new Comparator() { // from class: io.sentry.android.replay.ReplayCache$Companion$fromDisk$$inlined$sortBy$1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.Comparator
                        public final int compare(T t7, T t8) {
                            return f.t(Long.valueOf(((ReplayFrame) t7).getTimestamp()), Long.valueOf(((ReplayFrame) t8).getTimestamp()));
                        }
                    };
                    if (frames$sentry_android_replay_release.size() > 1) {
                        Collections.sort(frames$sentry_android_replay_release, comparator);
                    }
                }
                SentryReplayEvent.ReplayType replayType = SentryReplayEvent.ReplayType.SESSION;
                int iIntValue = replayTypeValueOf == replayType ? numE4.intValue() : 0;
                if (replayTypeValueOf != replayType) {
                    dateTime = DateUtils.getDateTime(((ReplayFrame) p050g6.h.Q0(replayCache.getFrames$sentry_android_replay_release())).getTimestamp());
                    h.d(dateTime, "{\n          // in buffer…st().timestamp)\n        }");
                }
                Date date = dateTime;
                List<ReplayFrame> frames$sentry_android_replay_release2 = replayCache.getFrames$sentry_android_replay_release();
                h.e(frames$sentry_android_replay_release2, "<this>");
                if (frames$sentry_android_replay_release2.isEmpty()) {
                    throw new NoSuchElementException("List is empty.");
                }
                long timestamp = (frames$sentry_android_replay_release2.get(i.L0(frames$sentry_android_replay_release2)).getTimestamp() - date.getTime()) + ((long) (zzbbd.zzq.zzf / numE2.intValue()));
                String str9 = (String) linkedHashMap.get(ReplayCache.SEGMENT_KEY_REPLAY_RECORDING);
                if (str9 != null) {
                    ReplayRecording replayRecording = (ReplayRecording) sentryOptions.getSerializer().deserialize(new StringReader(str9), ReplayRecording.class);
                    if ((replayRecording != null ? replayRecording.getPayload() : null) != null) {
                        List<? extends RRWebEvent> payload = replayRecording.getPayload();
                        h.b(payload);
                        linkedList = new LinkedList(payload);
                    }
                    if (linkedList == null) {
                        linkedList = p.f13308a;
                    }
                } else {
                    linkedList = p.f13308a;
                }
                return new LastSegmentData(screenshotRecorderConfig, replayCache, date, iIntValue, timestamp, replayTypeValueOf, (String) linkedHashMap.get(ReplayCache.SEGMENT_KEY_REPLAY_SCREEN_AT_START), p050g6.h.V0(new Comparator() { // from class: io.sentry.android.replay.ReplayCache$Companion$fromDisk$$inlined$sortedBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t7, T t8) {
                        return f.t(Long.valueOf(((RRWebEvent) t7).getTimestamp()), Long.valueOf(((RRWebEvent) t8).getTimestamp()));
                    }
                }, linkedList));
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    p115p6.a.e(bufferedReader, th);
                    throw th2;
                }
            }
        }

        public final File makeReplayCacheDir(SentryOptions sentryOptions, SentryId sentryId) {
            h.e(sentryOptions, RRWebOptionsEvent.EVENT_TAG);
            h.e(sentryId, "replayId");
            String cacheDirPath = sentryOptions.getCacheDirPath();
            if (cacheDirPath == null || cacheDirPath.length() == 0) {
                sentryOptions.getLogger().log(SentryLevel.WARNING, "SentryOptions.cacheDirPath is not set, session replay is no-op", new Object[0]);
                return null;
            }
            String cacheDirPath2 = sentryOptions.getCacheDirPath();
            h.b(cacheDirPath2);
            File file = new File(cacheDirPath2, "replay_" + sentryId);
            file.mkdirs();
            return file;
        }

        private Companion() {
        }
    }

    public ReplayCache(SentryOptions sentryOptions, SentryId sentryId) {
        h.e(sentryOptions, RRWebOptionsEvent.EVENT_TAG);
        h.e(sentryId, "replayId");
        this.options = sentryOptions;
        this.replayId = sentryId;
        this.isClosed = new AtomicBoolean(false);
        this.encoderLock = new AutoClosableReentrantLock();
        this.lock = new AutoClosableReentrantLock();
        this.replayCacheDir$delegate = D.C(new ReplayCache$replayCacheDir$2(this));
        this.frames = new ArrayList();
        this.ongoingSegment = new LinkedHashMap<>();
        this.ongoingSegmentFile$delegate = D.C(new ReplayCache$ongoingSegmentFile$2(this));
    }

    public static /* synthetic */ void addFrame$default(ReplayCache replayCache, File file, long j, String str, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            str = null;
        }
        replayCache.addFrame(file, j, str);
    }

    public static /* synthetic */ void addFrame$sentry_android_replay_release$default(ReplayCache replayCache, Bitmap bitmap, long j, String str, int i7, Object obj) throws IOException {
        if ((i7 & 4) != 0) {
            str = null;
        }
        replayCache.addFrame$sentry_android_replay_release(bitmap, j, str);
    }

    public static /* synthetic */ GeneratedVideo createVideoOf$default(ReplayCache replayCache, long j, long j3, int i7, int i8, int i9, int i10, int i11, File file, int i12, Object obj) {
        File file2;
        if ((i12 & 128) != 0) {
            file2 = new File(replayCache.getReplayCacheDir$sentry_android_replay_release(), i7 + ".mp4");
        } else {
            file2 = file;
        }
        return replayCache.createVideoOf(j, j3, i7, i8, i9, i10, i11, file2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void deleteFile(File file) {
        try {
            if (file.delete()) {
                return;
            }
            this.options.getLogger().log(SentryLevel.ERROR, "Failed to delete replay frame: %s", file.getAbsolutePath());
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, th, "Failed to delete replay frame: %s", file.getAbsolutePath());
        }
    }

    private final boolean encode(ReplayFrame replayFrame) {
        if (replayFrame == null) {
            return false;
        }
        try {
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(replayFrame.getScreenshot().getAbsolutePath());
            ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.encoderLock.acquire();
            try {
                SimpleVideoEncoder simpleVideoEncoder = this.encoder;
                if (simpleVideoEncoder != null) {
                    h.d(bitmapDecodeFile, "bitmap");
                    simpleVideoEncoder.encode(bitmapDecodeFile);
                }
                q6.a.a(iSentryLifecycleTokenAcquire, null);
                bitmapDecodeFile.recycle();
                return true;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    q6.a.a(iSentryLifecycleTokenAcquire, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            this.options.getLogger().log(SentryLevel.WARNING, "Unable to decode bitmap and encode it into a video, skipping frame", th3);
            return false;
        }
    }

    public final void addFrame(File file, long j, String str) {
        h.e(file, "screenshot");
        this.frames.add(new ReplayFrame(file, j, str));
    }

    public final void addFrame$sentry_android_replay_release(Bitmap bitmap, long j, String str) throws IOException {
        h.e(bitmap, "bitmap");
        if (getReplayCacheDir$sentry_android_replay_release() == null || bitmap.isRecycled()) {
            return;
        }
        File replayCacheDir$sentry_android_replay_release = getReplayCacheDir$sentry_android_replay_release();
        if (replayCacheDir$sentry_android_replay_release != null) {
            replayCacheDir$sentry_android_replay_release.mkdirs();
        }
        File file = new File(getReplayCacheDir$sentry_android_replay_release(), j + ".jpg");
        file.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            bitmap.compress(Bitmap.CompressFormat.JPEG, this.options.getSessionReplay().getQuality().screenshotQuality, fileOutputStream);
            fileOutputStream.flush();
            p115p6.a.e(fileOutputStream, null);
            addFrame(file, j, str);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                p115p6.a.e(fileOutputStream, th);
                throw th2;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.encoderLock.acquire();
        try {
            SimpleVideoEncoder simpleVideoEncoder = this.encoder;
            if (simpleVideoEncoder != null) {
                simpleVideoEncoder.release();
            }
            this.encoder = null;
            q6.a.a(iSentryLifecycleTokenAcquire, null);
            this.isClosed.set(true);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                q6.a.a(iSentryLifecycleTokenAcquire, th);
                throw th2;
            }
        }
    }

    public final GeneratedVideo createVideoOf(long j, long j3, int i7, int i8, int i9, int i10, int i11, File file) {
        ISentryLifecycleToken iSentryLifecycleToken;
        int i12;
        h.e(file, "videoFile");
        if (file.exists() && file.length() > 0) {
            file.delete();
        }
        if (this.frames.isEmpty()) {
            this.options.getLogger().log(SentryLevel.DEBUG, "No captured frames, skipping generating a video segment", new Object[0]);
            return null;
        }
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.encoderLock.acquire();
        try {
            iSentryLifecycleToken = iSentryLifecycleTokenAcquire;
            try {
                SimpleVideoEncoder simpleVideoEncoder = new SimpleVideoEncoder(this.options, new MuxerConfig(file, i9, i8, i10, i11, null, 32, null), null, 4, null);
                simpleVideoEncoder.start();
                q6.a.a(iSentryLifecycleToken, null);
                this.encoder = simpleVideoEncoder;
                long j7 = ((long) zzbbd.zzq.zzf) / ((long) i10);
                ReplayFrame replayFrame = (ReplayFrame) p050g6.h.Q0(this.frames);
                long j8 = j3 + j;
                z6.i iVar = j8 <= Long.MIN_VALUE ? z6.i.f18555d : new z6.i(j3, j8 - 1);
                h.e(iVar, "<this>");
                boolean z4 = j7 > 0;
                Long lValueOf = Long.valueOf(j7);
                if (!z4) {
                    throw new IllegalArgumentException("Step must be positive, was: " + lValueOf + '.');
                }
                long j9 = iVar.f18550c > 0 ? j7 : -j7;
                long j10 = iVar.f18548a;
                long j11 = new g(j10, iVar.f18549b, j9).f18549b;
                if ((j9 > 0 && j10 <= j11) || (j9 < 0 && j11 <= j10)) {
                    i12 = 0;
                    while (true) {
                        for (ReplayFrame replayFrame2 : this.frames) {
                            long j12 = j10 + j7;
                            long timestamp = replayFrame2.getTimestamp();
                            if (j10 <= timestamp && timestamp <= j12) {
                                replayFrame = replayFrame2;
                                break;
                            }
                            if (replayFrame2.getTimestamp() > j12) {
                                break;
                            }
                        }
                        if (encode(replayFrame)) {
                            i12++;
                        } else if (replayFrame != null) {
                            deleteFile(replayFrame.getScreenshot());
                            this.frames.remove(replayFrame);
                            replayFrame = null;
                        }
                        if (j10 == j11) {
                            break;
                        }
                        j10 += j9;
                    }
                } else {
                    i12 = 0;
                }
                if (i12 == 0) {
                    this.options.getLogger().log(SentryLevel.DEBUG, "Generated a video with no frames, not capturing a replay segment", new Object[0]);
                    deleteFile(file);
                    return null;
                }
                ISentryLifecycleToken iSentryLifecycleTokenAcquire2 = this.encoderLock.acquire();
                try {
                    SimpleVideoEncoder simpleVideoEncoder2 = this.encoder;
                    if (simpleVideoEncoder2 != null) {
                        simpleVideoEncoder2.release();
                    }
                    SimpleVideoEncoder simpleVideoEncoder3 = this.encoder;
                    long duration = simpleVideoEncoder3 != null ? simpleVideoEncoder3.getDuration() : 0L;
                    this.encoder = null;
                    q6.a.a(iSentryLifecycleTokenAcquire2, null);
                    rotate$sentry_android_replay_release(j8);
                    return new GeneratedVideo(file, i12, duration);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        q6.a.a(iSentryLifecycleTokenAcquire2, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                Throwable th4 = th;
                try {
                    throw th4;
                } catch (Throwable th5) {
                    q6.a.a(iSentryLifecycleToken, th4);
                    throw th5;
                }
            }
        } catch (Throwable th6) {
            th = th6;
            iSentryLifecycleToken = iSentryLifecycleTokenAcquire;
        }
    }

    public final List<ReplayFrame> getFrames$sentry_android_replay_release() {
        return this.frames;
    }

    public final File getOngoingSegmentFile$sentry_android_replay_release() {
        return (File) this.ongoingSegmentFile$delegate.getValue();
    }

    public final File getReplayCacheDir$sentry_android_replay_release() {
        return (File) this.replayCacheDir$delegate.getValue();
    }

    public final void persistSegmentValues$sentry_android_replay_release(String str, String str2) {
        File ongoingSegmentFile$sentry_android_replay_release;
        File ongoingSegmentFile$sentry_android_replay_release2;
        h.e(str, "key");
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            if (this.isClosed.get()) {
                q6.a.a(iSentryLifecycleTokenAcquire, null);
                return;
            }
            File ongoingSegmentFile$sentry_android_replay_release3 = getOngoingSegmentFile$sentry_android_replay_release();
            if ((ongoingSegmentFile$sentry_android_replay_release3 == null || !ongoingSegmentFile$sentry_android_replay_release3.exists()) && (ongoingSegmentFile$sentry_android_replay_release = getOngoingSegmentFile$sentry_android_replay_release()) != null) {
                ongoingSegmentFile$sentry_android_replay_release.createNewFile();
            }
            if (this.ongoingSegment.isEmpty() && (ongoingSegmentFile$sentry_android_replay_release2 = getOngoingSegmentFile$sentry_android_replay_release()) != null) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(ongoingSegmentFile$sentry_android_replay_release2), C6.a.f1581a), 8192);
                try {
                    B6.a aVar = new B6.a(new B6.e(bufferedReader, 3));
                    LinkedHashMap<String, String> linkedHashMap = this.ongoingSegment;
                    Iterator it = aVar.iterator();
                    while (it.hasNext()) {
                        List listA0 = o.A0((String) it.next(), new String[]{"="});
                        linkedHashMap.put((String) listA0.get(0), (String) listA0.get(1));
                    }
                    p115p6.a.e(bufferedReader, null);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        p115p6.a.e(bufferedReader, th);
                        throw th2;
                    }
                }
            }
            if (str2 == null) {
                this.ongoingSegment.remove(str);
            } else {
                this.ongoingSegment.put(str, str2);
            }
            File ongoingSegmentFile$sentry_android_replay_release4 = getOngoingSegmentFile$sentry_android_replay_release();
            if (ongoingSegmentFile$sentry_android_replay_release4 != null) {
                Set<Map.Entry<String, String>> setEntrySet = this.ongoingSegment.entrySet();
                h.d(setEntrySet, "ongoingSegment.entries");
                String strT0 = p050g6.h.T0(setEntrySet, "\n", null, null, ReplayCache$persistSegmentValues$1$2.INSTANCE, 30);
                Charset charset = C6.a.f1581a;
                h.e(strT0, "text");
                h.e(charset, "charset");
                FileOutputStream fileOutputStream = new FileOutputStream(ongoingSegmentFile$sentry_android_replay_release4);
                try {
                    c.n(fileOutputStream, strT0, charset);
                    p115p6.a.e(fileOutputStream, null);
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        p115p6.a.e(fileOutputStream, th3);
                        throw th4;
                    }
                }
            }
            q6.a.a(iSentryLifecycleTokenAcquire, null);
        } catch (Throwable th5) {
            try {
                throw th5;
            } catch (Throwable th6) {
                q6.a.a(iSentryLifecycleTokenAcquire, th5);
                throw th6;
            }
        }
    }

    public final String rotate$sentry_android_replay_release(long j) {
        t6.p pVar = new t6.p();
        n.P0(this.frames, new ReplayCache$rotate$1(j, this, pVar));
        return (String) pVar.f16478a;
    }
}
