package io.sentry.android.replay;

import C6.o;
import Y4.D;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.MotionEvent;
import androidx.compose.runtime.internal.StabilityInferred;
import io.sentry.Breadcrumb;
import io.sentry.DataCategory;
import io.sentry.Hint;
import io.sentry.IConnectionStatusProvider;
import io.sentry.IScope;
import io.sentry.IScopes;
import io.sentry.ISentryExecutorService;
import io.sentry.ISentryLifecycleToken;
import io.sentry.Integration;
import io.sentry.NoOpReplayBreadcrumbConverter;
import io.sentry.ReplayBreadcrumbConverter;
import io.sentry.ReplayController;
import io.sentry.SentryIntegrationPackageStorage;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.SentryReplayOptions;
import io.sentry.android.replay.capture.BufferCaptureStrategy;
import io.sentry.android.replay.capture.CaptureStrategy;
import io.sentry.android.replay.capture.SessionCaptureStrategy;
import io.sentry.android.replay.gestures.GestureRecorder;
import io.sentry.android.replay.gestures.TouchRecorderCallback;
import io.sentry.android.replay.util.ContextKt;
import io.sentry.android.replay.util.ExecutorsKt;
import io.sentry.android.replay.util.MainLooperHandler;
import io.sentry.android.replay.util.SamplingKt;
import io.sentry.cache.PersistingScopeObserver;
import io.sentry.hints.Backfillable;
import io.sentry.protocol.SentryId;
import io.sentry.rrweb.RRWebOptionsEvent;
import io.sentry.transport.ICurrentDateProvider;
import io.sentry.transport.RateLimiter;
import io.sentry.util.AutoClosableReentrantLock;
import io.sentry.util.FileUtils;
import io.sentry.util.HintUtils;
import io.sentry.util.IntegrationUtils;
import io.sentry.util.Random;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import t6.e;
import t6.h;
import t6.i;
import t6.p;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class ReplayIntegration implements Integration, Closeable, ScreenshotRecorderCallback, TouchRecorderCallback, ReplayController, IConnectionStatusProvider.IConnectionStatusObserver, RateLimiter.IRateLimitObserver, WindowCallback {
    private CaptureStrategy captureStrategy;
    private final Context context;
    private final ICurrentDateProvider dateProvider;
    private boolean debugMaskingEnabled;
    private GestureRecorder gestureRecorder;
    private s6.a gestureRecorderProvider;
    private final AtomicBoolean isEnabled;
    private final AtomicBoolean isManualPause;
    private final ReplayLifecycle lifecycle;
    private final AutoClosableReentrantLock lifecycleLock;
    private MainLooperHandler mainLooperHandler;
    private SentryOptions options;
    private final p044f6.b random$delegate;
    private Recorder recorder;
    private final s6.a recorderProvider;
    private ReplayBreadcrumbConverter replayBreadcrumbConverter;
    private final Function1 replayCacheProvider;
    private Function1 replayCaptureStrategyProvider;
    private final p044f6.b replayExecutor$delegate;
    private final p044f6.b rootViewsSpy$delegate;
    private IScopes scopes;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        private Companion() {
        }
    }

    public static final class PreviousReplayHint implements Backfillable {
        @Override // io.sentry.hints.Backfillable
        public boolean shouldEnrich() {
            return false;
        }
    }

    public static final class ReplayExecutorServiceThreadFactory implements ThreadFactory {
        private int cnt;

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            h.e(runnable, "r");
            StringBuilder sb = new StringBuilder("SentryReplayIntegration-");
            int i7 = this.cnt;
            this.cnt = i7 + 1;
            sb.append(i7);
            Thread thread = new Thread(runnable, sb.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    /* JADX INFO: renamed from: io.sentry.android.replay.ReplayIntegration$captureReplay$1, reason: invalid class name */
    public static final class AnonymousClass1 extends i implements Function1 {
        public AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Date) obj);
            return p044f6.i.f13014a;
        }

        public final void invoke(Date date) {
            h.e(date, "newTimestamp");
            CaptureStrategy captureStrategy = ReplayIntegration.this.captureStrategy;
            if (captureStrategy != null) {
                CaptureStrategy captureStrategy2 = ReplayIntegration.this.captureStrategy;
                Integer numValueOf = captureStrategy2 != null ? Integer.valueOf(captureStrategy2.getCurrentSegment()) : null;
                h.b(numValueOf);
                captureStrategy.setCurrentSegment(numValueOf.intValue() + 1);
            }
            CaptureStrategy captureStrategy3 = ReplayIntegration.this.captureStrategy;
            if (captureStrategy3 == null) {
                return;
            }
            captureStrategy3.setSegmentTimestamp(date);
        }
    }

    /* JADX INFO: renamed from: io.sentry.android.replay.ReplayIntegration$onScreenshotRecorded$2, reason: invalid class name */
    public static final class AnonymousClass2 extends i implements Function2 {
        final /* synthetic */ Bitmap $bitmap;
        final /* synthetic */ p $screen;
        final /* synthetic */ ReplayIntegration this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Bitmap bitmap, p pVar, ReplayIntegration replayIntegration) {
            super(2);
            this.$bitmap = bitmap;
            this.$screen = pVar;
            this.this$0 = replayIntegration;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws IOException {
            invoke((ReplayCache) obj, ((Number) obj2).longValue());
            return p044f6.i.f13014a;
        }

        public final void invoke(ReplayCache replayCache, long j) throws IOException {
            h.e(replayCache, "$this$onScreenshotRecorded");
            replayCache.addFrame$sentry_android_replay_release(this.$bitmap, j, (String) this.$screen.f16478a);
            this.this$0.checkCanRecord();
        }
    }

    /* JADX INFO: renamed from: io.sentry.android.replay.ReplayIntegration$onScreenshotRecorded$3, reason: invalid class name */
    public static final class AnonymousClass3 extends i implements Function2 {
        final /* synthetic */ long $frameTimestamp;
        final /* synthetic */ File $screenshot;
        final /* synthetic */ ReplayIntegration this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(File file, long j, ReplayIntegration replayIntegration) {
            super(2);
            this.$screenshot = file;
            this.$frameTimestamp = j;
            this.this$0 = replayIntegration;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((ReplayCache) obj, ((Number) obj2).longValue());
            return p044f6.i.f13014a;
        }

        public final void invoke(ReplayCache replayCache, long j) {
            h.e(replayCache, "$this$onScreenshotRecorded");
            ReplayCache.addFrame$default(replayCache, this.$screenshot, this.$frameTimestamp, null, 4, null);
            this.this$0.checkCanRecord();
        }
    }

    static {
        SentryIntegrationPackageStorage.getInstance().addPackage("maven:io.sentry:sentry-android-replay", "8.17.0");
    }

    public ReplayIntegration(Context context, ICurrentDateProvider iCurrentDateProvider, s6.a aVar, Function1 function1) {
        h.e(context, "context");
        h.e(iCurrentDateProvider, "dateProvider");
        this.context = context;
        this.dateProvider = iCurrentDateProvider;
        this.recorderProvider = aVar;
        this.replayCacheProvider = function1;
        this.random$delegate = D.C(ReplayIntegration$random$2.INSTANCE);
        this.rootViewsSpy$delegate = D.C(ReplayIntegration$rootViewsSpy$2.INSTANCE);
        this.replayExecutor$delegate = D.C(ReplayIntegration$replayExecutor$2.INSTANCE);
        this.isEnabled = new AtomicBoolean(false);
        this.isManualPause = new AtomicBoolean(false);
        NoOpReplayBreadcrumbConverter noOpReplayBreadcrumbConverter = NoOpReplayBreadcrumbConverter.getInstance();
        h.d(noOpReplayBreadcrumbConverter, "getInstance()");
        this.replayBreadcrumbConverter = noOpReplayBreadcrumbConverter;
        this.mainLooperHandler = new MainLooperHandler(null, 1, null);
        this.lifecycleLock = new AutoClosableReentrantLock();
        this.lifecycle = new ReplayLifecycle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkCanRecord() {
        IScopes iScopes;
        IScopes iScopes2;
        RateLimiter rateLimiter;
        RateLimiter rateLimiter2;
        if (this.captureStrategy instanceof SessionCaptureStrategy) {
            SentryOptions sentryOptions = this.options;
            if (sentryOptions == null) {
                h.h(RRWebOptionsEvent.EVENT_TAG);
                throw null;
            }
            if (sentryOptions.getConnectionStatusProvider().getConnectionStatus() == IConnectionStatusProvider.ConnectionStatus.DISCONNECTED || !(((iScopes = this.scopes) == null || (rateLimiter2 = iScopes.getRateLimiter()) == null || !rateLimiter2.isActiveForCategory(DataCategory.All)) && ((iScopes2 = this.scopes) == null || (rateLimiter = iScopes2.getRateLimiter()) == null || !rateLimiter.isActiveForCategory(DataCategory.Replay)))) {
                pauseInternal();
            }
        }
    }

    private final void cleanupReplays(String str) {
        File[] fileArrListFiles;
        SentryOptions sentryOptions = this.options;
        if (sentryOptions == null) {
            h.h(RRWebOptionsEvent.EVENT_TAG);
            throw null;
        }
        String cacheDirPath = sentryOptions.getCacheDirPath();
        if (cacheDirPath == null || (fileArrListFiles = new File(cacheDirPath).listFiles()) == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            String name = file.getName();
            h.d(name, "name");
            if (o.B0(name, "replay_")) {
                String string = getReplayId().toString();
                h.d(string, "replayId.toString()");
                if (!o.p0(name, string, false) && (o.u0(str) || !o.p0(name, str, false))) {
                    FileUtils.deleteRecursively(file);
                }
            }
        }
    }

    public static /* synthetic */ void cleanupReplays$default(ReplayIntegration replayIntegration, String str, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = "";
        }
        replayIntegration.cleanupReplays(str);
    }

    private final void finalizePreviousReplay() {
        SentryOptions sentryOptions = this.options;
        if (sentryOptions == null) {
            h.h(RRWebOptionsEvent.EVENT_TAG);
            throw null;
        }
        ISentryExecutorService executorService = sentryOptions.getExecutorService();
        h.d(executorService, "options.executorService");
        SentryOptions sentryOptions2 = this.options;
        if (sentryOptions2 != null) {
            ExecutorsKt.submitSafely(executorService, sentryOptions2, "ReplayIntegration.finalize_previous_replay", new io.sentry.android.core.internal.modules.a(this, 1));
        } else {
            h.h(RRWebOptionsEvent.EVENT_TAG);
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void finalizePreviousReplay$lambda$10(ReplayIntegration replayIntegration) {
        h.e(replayIntegration, "this$0");
        SentryOptions sentryOptions = replayIntegration.options;
        if (sentryOptions == null) {
            h.h(RRWebOptionsEvent.EVENT_TAG);
            throw null;
        }
        PersistingScopeObserver persistingScopeObserverFindPersistingScopeObserver = sentryOptions.findPersistingScopeObserver();
        if (persistingScopeObserverFindPersistingScopeObserver != null) {
            SentryOptions sentryOptions2 = replayIntegration.options;
            if (sentryOptions2 == null) {
                h.h(RRWebOptionsEvent.EVENT_TAG);
                throw null;
            }
            String str = (String) persistingScopeObserverFindPersistingScopeObserver.read(sentryOptions2, PersistingScopeObserver.REPLAY_FILENAME, String.class);
            if (str != null) {
                SentryId sentryId = new SentryId(str);
                if (sentryId.equals(SentryId.EMPTY_ID)) {
                    cleanupReplays$default(replayIntegration, null, 1, null);
                    return;
                }
                ReplayCache.Companion companion = ReplayCache.Companion;
                SentryOptions sentryOptions3 = replayIntegration.options;
                if (sentryOptions3 == null) {
                    h.h(RRWebOptionsEvent.EVENT_TAG);
                    throw null;
                }
                LastSegmentData lastSegmentDataFromDisk$sentry_android_replay_release = companion.fromDisk$sentry_android_replay_release(sentryOptions3, sentryId, replayIntegration.replayCacheProvider);
                if (lastSegmentDataFromDisk$sentry_android_replay_release == null) {
                    cleanupReplays$default(replayIntegration, null, 1, null);
                    return;
                }
                SentryOptions sentryOptions4 = replayIntegration.options;
                if (sentryOptions4 == null) {
                    h.h(RRWebOptionsEvent.EVENT_TAG);
                    throw null;
                }
                Object obj = persistingScopeObserverFindPersistingScopeObserver.read(sentryOptions4, PersistingScopeObserver.BREADCRUMBS_FILENAME, List.class);
                List<Breadcrumb> list = obj instanceof List ? (List) obj : null;
                CaptureStrategy.Companion companion2 = CaptureStrategy.Companion;
                IScopes iScopes = replayIntegration.scopes;
                SentryOptions sentryOptions5 = replayIntegration.options;
                if (sentryOptions5 == null) {
                    h.h(RRWebOptionsEvent.EVENT_TAG);
                    throw null;
                }
                CaptureStrategy.ReplaySegment replaySegmentCreateSegment = companion2.createSegment(iScopes, sentryOptions5, lastSegmentDataFromDisk$sentry_android_replay_release.getDuration(), lastSegmentDataFromDisk$sentry_android_replay_release.getTimestamp(), sentryId, lastSegmentDataFromDisk$sentry_android_replay_release.getId(), lastSegmentDataFromDisk$sentry_android_replay_release.getRecorderConfig().getRecordingHeight(), lastSegmentDataFromDisk$sentry_android_replay_release.getRecorderConfig().getRecordingWidth(), lastSegmentDataFromDisk$sentry_android_replay_release.getReplayType(), lastSegmentDataFromDisk$sentry_android_replay_release.getCache(), lastSegmentDataFromDisk$sentry_android_replay_release.getRecorderConfig().getFrameRate(), lastSegmentDataFromDisk$sentry_android_replay_release.getRecorderConfig().getBitRate(), lastSegmentDataFromDisk$sentry_android_replay_release.getScreenAtStart(), list, new LinkedList(lastSegmentDataFromDisk$sentry_android_replay_release.getEvents()));
                if (replaySegmentCreateSegment instanceof CaptureStrategy.ReplaySegment.Created) {
                    Hint hintCreateWithTypeCheckHint = HintUtils.createWithTypeCheckHint(new PreviousReplayHint());
                    IScopes iScopes2 = replayIntegration.scopes;
                    h.d(hintCreateWithTypeCheckHint, "hint");
                    ((CaptureStrategy.ReplaySegment.Created) replaySegmentCreateSegment).capture(iScopes2, hintCreateWithTypeCheckHint);
                }
                replayIntegration.cleanupReplays(str);
                return;
            }
        }
        cleanupReplays$default(replayIntegration, null, 1, null);
    }

    private final Random getRandom() {
        return (Random) this.random$delegate.getValue();
    }

    private final ScheduledExecutorService getReplayExecutor() {
        return (ScheduledExecutorService) this.replayExecutor$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onScreenshotRecorded$lambda$4(p pVar, IScope iScope) {
        h.e(pVar, "$screen");
        h.e(iScope, "it");
        String screen = iScope.getScreen();
        pVar.f16478a = screen != null ? o.D0(screen, screen) : null;
    }

    private final void pauseInternal() {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lifecycleLock.acquire();
        try {
            if (this.isEnabled.get()) {
                ReplayLifecycle replayLifecycle = this.lifecycle;
                ReplayState replayState = ReplayState.PAUSED;
                if (replayLifecycle.isAllowed(replayState)) {
                    Recorder recorder = this.recorder;
                    if (recorder != null) {
                        recorder.pause();
                    }
                    CaptureStrategy captureStrategy = this.captureStrategy;
                    if (captureStrategy != null) {
                        captureStrategy.pause();
                    }
                    this.lifecycle.setCurrentState$sentry_android_replay_release(replayState);
                    q6.a.a(iSentryLifecycleTokenAcquire, null);
                    return;
                }
            }
            q6.a.a(iSentryLifecycleTokenAcquire, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                q6.a.a(iSentryLifecycleTokenAcquire, th);
                throw th2;
            }
        }
    }

    private final void registerRootViewListeners() {
        if (this.recorder instanceof OnRootViewsChangedListener) {
            CopyOnWriteArrayList<OnRootViewsChangedListener> listeners = getRootViewsSpy$sentry_android_replay_release().getListeners();
            Recorder recorder = this.recorder;
            h.c(recorder, "null cannot be cast to non-null type io.sentry.android.replay.OnRootViewsChangedListener");
            listeners.add((OnRootViewsChangedListener) recorder);
        }
        getRootViewsSpy$sentry_android_replay_release().getListeners().add(this.gestureRecorder);
    }

    private final void resumeInternal() {
        IScopes iScopes;
        IScopes iScopes2;
        RateLimiter rateLimiter;
        RateLimiter rateLimiter2;
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lifecycleLock.acquire();
        try {
            if (this.isEnabled.get()) {
                ReplayLifecycle replayLifecycle = this.lifecycle;
                ReplayState replayState = ReplayState.RESUMED;
                if (replayLifecycle.isAllowed(replayState)) {
                    if (!this.isManualPause.get()) {
                        SentryOptions sentryOptions = this.options;
                        if (sentryOptions == null) {
                            h.h(RRWebOptionsEvent.EVENT_TAG);
                            throw null;
                        }
                        if (sentryOptions.getConnectionStatusProvider().getConnectionStatus() != IConnectionStatusProvider.ConnectionStatus.DISCONNECTED && (((iScopes = this.scopes) == null || (rateLimiter2 = iScopes.getRateLimiter()) == null || !rateLimiter2.isActiveForCategory(DataCategory.All)) && ((iScopes2 = this.scopes) == null || (rateLimiter = iScopes2.getRateLimiter()) == null || !rateLimiter.isActiveForCategory(DataCategory.Replay)))) {
                            this.lifecycle.setCurrentState$sentry_android_replay_release(replayState);
                            CaptureStrategy captureStrategy = this.captureStrategy;
                            if (captureStrategy != null) {
                                captureStrategy.resume();
                            }
                            Recorder recorder = this.recorder;
                            if (recorder != null) {
                                recorder.resume();
                            }
                            q6.a.a(iSentryLifecycleTokenAcquire, null);
                            return;
                        }
                    }
                    q6.a.a(iSentryLifecycleTokenAcquire, null);
                    return;
                }
            }
            q6.a.a(iSentryLifecycleTokenAcquire, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                q6.a.a(iSentryLifecycleTokenAcquire, th);
                throw th2;
            }
        }
    }

    private final void unregisterRootViewListeners() {
        if (this.recorder instanceof OnRootViewsChangedListener) {
            CopyOnWriteArrayList<OnRootViewsChangedListener> listeners = getRootViewsSpy$sentry_android_replay_release().getListeners();
            Recorder recorder = this.recorder;
            h.c(recorder, "null cannot be cast to non-null type io.sentry.android.replay.OnRootViewsChangedListener");
            listeners.remove((OnRootViewsChangedListener) recorder);
        }
        getRootViewsSpy$sentry_android_replay_release().getListeners().remove(this.gestureRecorder);
    }

    @Override // io.sentry.ReplayController
    public void captureReplay(Boolean bool) {
        if (this.isEnabled.get() && isRecording()) {
            SentryId sentryId = SentryId.EMPTY_ID;
            CaptureStrategy captureStrategy = this.captureStrategy;
            if (sentryId.equals(captureStrategy != null ? captureStrategy.getCurrentReplayId() : null)) {
                SentryOptions sentryOptions = this.options;
                if (sentryOptions != null) {
                    sentryOptions.getLogger().log(SentryLevel.DEBUG, "Replay id is not set, not capturing for event", new Object[0]);
                    return;
                } else {
                    h.h(RRWebOptionsEvent.EVENT_TAG);
                    throw null;
                }
            }
            CaptureStrategy captureStrategy2 = this.captureStrategy;
            if (captureStrategy2 != null) {
                captureStrategy2.captureReplay(h.a(bool, Boolean.TRUE), new AnonymousClass1());
            }
            CaptureStrategy captureStrategy3 = this.captureStrategy;
            this.captureStrategy = captureStrategy3 != null ? captureStrategy3.convert() : null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        RateLimiter rateLimiter;
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lifecycleLock.acquire();
        try {
            if (this.isEnabled.get()) {
                ReplayLifecycle replayLifecycle = this.lifecycle;
                ReplayState replayState = ReplayState.CLOSED;
                if (replayLifecycle.isAllowed(replayState)) {
                    SentryOptions sentryOptions = this.options;
                    if (sentryOptions == null) {
                        h.h(RRWebOptionsEvent.EVENT_TAG);
                        throw null;
                    }
                    sentryOptions.getConnectionStatusProvider().removeConnectionStatusObserver(this);
                    IScopes iScopes = this.scopes;
                    if (iScopes != null && (rateLimiter = iScopes.getRateLimiter()) != null) {
                        rateLimiter.removeRateLimitObserver(this);
                    }
                    stop();
                    Recorder recorder = this.recorder;
                    if (recorder != null) {
                        recorder.close();
                    }
                    this.recorder = null;
                    getRootViewsSpy$sentry_android_replay_release().close();
                    ScheduledExecutorService replayExecutor = getReplayExecutor();
                    h.d(replayExecutor, "replayExecutor");
                    SentryOptions sentryOptions2 = this.options;
                    if (sentryOptions2 == null) {
                        h.h(RRWebOptionsEvent.EVENT_TAG);
                        throw null;
                    }
                    ExecutorsKt.gracefullyShutdown(replayExecutor, sentryOptions2);
                    this.lifecycle.setCurrentState$sentry_android_replay_release(replayState);
                    q6.a.a(iSentryLifecycleTokenAcquire, null);
                    return;
                }
            }
            q6.a.a(iSentryLifecycleTokenAcquire, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                q6.a.a(iSentryLifecycleTokenAcquire, th);
                throw th2;
            }
        }
    }

    @Override // io.sentry.IReplayApi
    public void disableDebugMaskingOverlay() {
        this.debugMaskingEnabled = false;
    }

    @Override // io.sentry.IReplayApi
    public void enableDebugMaskingOverlay() {
        this.debugMaskingEnabled = true;
    }

    @Override // io.sentry.ReplayController
    public ReplayBreadcrumbConverter getBreadcrumbConverter() {
        return this.replayBreadcrumbConverter;
    }

    public final File getReplayCacheDir() {
        CaptureStrategy captureStrategy = this.captureStrategy;
        if (captureStrategy != null) {
            return captureStrategy.getReplayCacheDir();
        }
        return null;
    }

    @Override // io.sentry.ReplayController
    public SentryId getReplayId() {
        SentryId currentReplayId;
        CaptureStrategy captureStrategy = this.captureStrategy;
        if (captureStrategy != null && (currentReplayId = captureStrategy.getCurrentReplayId()) != null) {
            return currentReplayId;
        }
        SentryId sentryId = SentryId.EMPTY_ID;
        h.d(sentryId, "EMPTY_ID");
        return sentryId;
    }

    public final RootViewsSpy getRootViewsSpy$sentry_android_replay_release() {
        return (RootViewsSpy) this.rootViewsSpy$delegate.getValue();
    }

    @Override // io.sentry.ReplayController
    public boolean isDebugMaskingOverlayEnabled() {
        return this.debugMaskingEnabled;
    }

    public final AtomicBoolean isEnabled$sentry_android_replay_release() {
        return this.isEnabled;
    }

    public final AtomicBoolean isManualPause$sentry_android_replay_release() {
        return this.isManualPause;
    }

    @Override // io.sentry.ReplayController
    public boolean isRecording() {
        return this.lifecycle.getCurrentState$sentry_android_replay_release().compareTo(ReplayState.STARTED) >= 0 && this.lifecycle.getCurrentState$sentry_android_replay_release().compareTo(ReplayState.STOPPED) < 0;
    }

    public final void onConfigurationChanged(ScreenshotRecorderConfig screenshotRecorderConfig) {
        Recorder recorder;
        h.e(screenshotRecorderConfig, "config");
        if (this.isEnabled.get() && isRecording()) {
            CaptureStrategy captureStrategy = this.captureStrategy;
            if (captureStrategy != null) {
                captureStrategy.onConfigurationChanged(screenshotRecorderConfig);
            }
            Recorder recorder2 = this.recorder;
            if (recorder2 != null) {
                recorder2.onConfigurationChanged(screenshotRecorderConfig);
            }
            if (this.lifecycle.getCurrentState$sentry_android_replay_release() != ReplayState.PAUSED || (recorder = this.recorder) == null) {
                return;
            }
            recorder.pause();
        }
    }

    @Override // io.sentry.IConnectionStatusProvider.IConnectionStatusObserver
    public void onConnectionStatusChanged(IConnectionStatusProvider.ConnectionStatus connectionStatus) {
        h.e(connectionStatus, "status");
        if (this.captureStrategy instanceof SessionCaptureStrategy) {
            if (connectionStatus == IConnectionStatusProvider.ConnectionStatus.DISCONNECTED) {
                pauseInternal();
            } else {
                resumeInternal();
            }
        }
    }

    @Override // io.sentry.transport.RateLimiter.IRateLimitObserver
    public void onRateLimitChanged(RateLimiter rateLimiter) {
        h.e(rateLimiter, "rateLimiter");
        if (this.captureStrategy instanceof SessionCaptureStrategy) {
            if (rateLimiter.isActiveForCategory(DataCategory.All) || rateLimiter.isActiveForCategory(DataCategory.Replay)) {
                pauseInternal();
            } else {
                resumeInternal();
            }
        }
    }

    @Override // io.sentry.android.replay.ScreenshotRecorderCallback
    public void onScreenshotRecorded(Bitmap bitmap) {
        h.e(bitmap, "bitmap");
        p pVar = new p();
        IScopes iScopes = this.scopes;
        if (iScopes != null) {
            iScopes.configureScope(new b(pVar, 0));
        }
        CaptureStrategy captureStrategy = this.captureStrategy;
        if (captureStrategy != null) {
            captureStrategy.onScreenshotRecorded(bitmap, new AnonymousClass2(bitmap, pVar, this));
        }
    }

    @Override // io.sentry.android.replay.gestures.TouchRecorderCallback
    public void onTouchEvent(MotionEvent motionEvent) {
        CaptureStrategy captureStrategy;
        h.e(motionEvent, "event");
        if (this.isEnabled.get() && this.lifecycle.isTouchRecordingAllowed() && (captureStrategy = this.captureStrategy) != null) {
            captureStrategy.onTouchEvent(motionEvent);
        }
    }

    @Override // io.sentry.android.replay.WindowCallback
    public void onWindowSizeChanged(int i7, int i8) {
        if (this.isEnabled.get() && isRecording()) {
            SentryOptions sentryOptions = this.options;
            if (sentryOptions == null) {
                h.h(RRWebOptionsEvent.EVENT_TAG);
                throw null;
            }
            if (sentryOptions.getSessionReplay().isTrackConfiguration()) {
                ScreenshotRecorderConfig.Companion companion = ScreenshotRecorderConfig.Companion;
                Context context = this.context;
                SentryOptions sentryOptions2 = this.options;
                if (sentryOptions2 == null) {
                    h.h(RRWebOptionsEvent.EVENT_TAG);
                    throw null;
                }
                SentryReplayOptions sessionReplay = sentryOptions2.getSessionReplay();
                h.d(sessionReplay, "options.sessionReplay");
                onConfigurationChanged(companion.fromSize(context, sessionReplay, i7, i8));
            }
        }
    }

    @Override // io.sentry.ReplayController
    public void pause() {
        this.isManualPause.set(true);
        pauseInternal();
    }

    @Override // io.sentry.Integration
    public void register(IScopes iScopes, SentryOptions sentryOptions) {
        Recorder windowRecorder;
        GestureRecorder gestureRecorder;
        h.e(iScopes, "scopes");
        h.e(sentryOptions, RRWebOptionsEvent.EVENT_TAG);
        this.options = sentryOptions;
        if (Build.VERSION.SDK_INT < 26) {
            sentryOptions.getLogger().log(SentryLevel.INFO, "Session replay is only supported on API 26 and above", new Object[0]);
            return;
        }
        if (!sentryOptions.getSessionReplay().isSessionReplayEnabled() && !sentryOptions.getSessionReplay().isSessionReplayForErrorsEnabled()) {
            sentryOptions.getLogger().log(SentryLevel.INFO, "Session replay is disabled, no sample rate specified", new Object[0]);
            return;
        }
        this.scopes = iScopes;
        s6.a aVar = this.recorderProvider;
        if (aVar == null || (windowRecorder = (Recorder) aVar.invoke()) == null) {
            MainLooperHandler mainLooperHandler = this.mainLooperHandler;
            ScheduledExecutorService replayExecutor = getReplayExecutor();
            h.d(replayExecutor, "replayExecutor");
            windowRecorder = new WindowRecorder(sentryOptions, this, this, mainLooperHandler, replayExecutor);
        }
        this.recorder = windowRecorder;
        s6.a aVar2 = this.gestureRecorderProvider;
        if (aVar2 == null || (gestureRecorder = (GestureRecorder) aVar2.invoke()) == null) {
            gestureRecorder = new GestureRecorder(sentryOptions, this);
        }
        this.gestureRecorder = gestureRecorder;
        this.isEnabled.set(true);
        sentryOptions.getConnectionStatusProvider().addConnectionStatusObserver(this);
        RateLimiter rateLimiter = iScopes.getRateLimiter();
        if (rateLimiter != null) {
            rateLimiter.addRateLimitObserver(this);
        }
        IntegrationUtils.addIntegrationToSdkVersion("Replay");
        finalizePreviousReplay();
    }

    @Override // io.sentry.ReplayController
    public void resume() {
        this.isManualPause.set(false);
        resumeInternal();
    }

    @Override // io.sentry.ReplayController
    public void setBreadcrumbConverter(ReplayBreadcrumbConverter replayBreadcrumbConverter) {
        h.e(replayBreadcrumbConverter, "converter");
        this.replayBreadcrumbConverter = replayBreadcrumbConverter;
    }

    @Override // io.sentry.ReplayController
    public void start() {
        CaptureStrategy bufferCaptureStrategy;
        CaptureStrategy captureStrategy;
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lifecycleLock.acquire();
        try {
            if (!this.isEnabled.get()) {
                q6.a.a(iSentryLifecycleTokenAcquire, null);
                return;
            }
            ReplayLifecycle replayLifecycle = this.lifecycle;
            ReplayState replayState = ReplayState.STARTED;
            if (!replayLifecycle.isAllowed(replayState)) {
                SentryOptions sentryOptions = this.options;
                if (sentryOptions == null) {
                    h.h(RRWebOptionsEvent.EVENT_TAG);
                    throw null;
                }
                sentryOptions.getLogger().log(SentryLevel.DEBUG, "Session replay is already being recorded, not starting a new one", new Object[0]);
                q6.a.a(iSentryLifecycleTokenAcquire, null);
                return;
            }
            Random random = getRandom();
            SentryOptions sentryOptions2 = this.options;
            if (sentryOptions2 == null) {
                h.h(RRWebOptionsEvent.EVENT_TAG);
                throw null;
            }
            boolean zSample = SamplingKt.sample(random, sentryOptions2.getSessionReplay().getSessionSampleRate());
            if (!zSample) {
                SentryOptions sentryOptions3 = this.options;
                if (sentryOptions3 == null) {
                    h.h(RRWebOptionsEvent.EVENT_TAG);
                    throw null;
                }
                if (!sentryOptions3.getSessionReplay().isSessionReplayForErrorsEnabled()) {
                    SentryOptions sentryOptions4 = this.options;
                    if (sentryOptions4 == null) {
                        h.h(RRWebOptionsEvent.EVENT_TAG);
                        throw null;
                    }
                    sentryOptions4.getLogger().log(SentryLevel.INFO, "Session replay is not started, full session was not sampled and onErrorSampleRate is not specified", new Object[0]);
                    q6.a.a(iSentryLifecycleTokenAcquire, null);
                    return;
                }
            }
            this.lifecycle.setCurrentState$sentry_android_replay_release(replayState);
            Function1 function1 = this.replayCaptureStrategyProvider;
            if (function1 == null || (captureStrategy = (CaptureStrategy) function1.invoke(Boolean.valueOf(zSample))) == null) {
                if (zSample) {
                    SentryOptions sentryOptions5 = this.options;
                    if (sentryOptions5 == null) {
                        h.h(RRWebOptionsEvent.EVENT_TAG);
                        throw null;
                    }
                    IScopes iScopes = this.scopes;
                    ICurrentDateProvider iCurrentDateProvider = this.dateProvider;
                    ScheduledExecutorService replayExecutor = getReplayExecutor();
                    h.d(replayExecutor, "replayExecutor");
                    bufferCaptureStrategy = new SessionCaptureStrategy(sentryOptions5, iScopes, iCurrentDateProvider, replayExecutor, this.replayCacheProvider);
                } else {
                    SentryOptions sentryOptions6 = this.options;
                    if (sentryOptions6 == null) {
                        h.h(RRWebOptionsEvent.EVENT_TAG);
                        throw null;
                    }
                    IScopes iScopes2 = this.scopes;
                    ICurrentDateProvider iCurrentDateProvider2 = this.dateProvider;
                    Random random2 = getRandom();
                    ScheduledExecutorService replayExecutor2 = getReplayExecutor();
                    h.d(replayExecutor2, "replayExecutor");
                    bufferCaptureStrategy = new BufferCaptureStrategy(sentryOptions6, iScopes2, iCurrentDateProvider2, random2, replayExecutor2, this.replayCacheProvider);
                }
                captureStrategy = bufferCaptureStrategy;
            }
            this.captureStrategy = captureStrategy;
            Recorder recorder = this.recorder;
            if (recorder != null) {
                recorder.start();
            }
            CaptureStrategy captureStrategy2 = this.captureStrategy;
            if (captureStrategy2 != null) {
                CaptureStrategy.DefaultImpls.start$default(captureStrategy2, 0, null, null, 7, null);
            }
            registerRootViewListeners();
            q6.a.a(iSentryLifecycleTokenAcquire, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                q6.a.a(iSentryLifecycleTokenAcquire, th);
                throw th2;
            }
        }
    }

    @Override // io.sentry.ReplayController
    public void stop() {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lifecycleLock.acquire();
        try {
            if (this.isEnabled.get()) {
                ReplayLifecycle replayLifecycle = this.lifecycle;
                ReplayState replayState = ReplayState.STOPPED;
                if (replayLifecycle.isAllowed(replayState)) {
                    unregisterRootViewListeners();
                    Recorder recorder = this.recorder;
                    if (recorder != null) {
                        recorder.reset();
                    }
                    Recorder recorder2 = this.recorder;
                    if (recorder2 != null) {
                        recorder2.stop();
                    }
                    GestureRecorder gestureRecorder = this.gestureRecorder;
                    if (gestureRecorder != null) {
                        gestureRecorder.stop();
                    }
                    CaptureStrategy captureStrategy = this.captureStrategy;
                    if (captureStrategy != null) {
                        captureStrategy.stop();
                    }
                    this.captureStrategy = null;
                    this.lifecycle.setCurrentState$sentry_android_replay_release(replayState);
                    q6.a.a(iSentryLifecycleTokenAcquire, null);
                    return;
                }
            }
            q6.a.a(iSentryLifecycleTokenAcquire, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                q6.a.a(iSentryLifecycleTokenAcquire, th);
                throw th2;
            }
        }
    }

    @Override // io.sentry.android.replay.ScreenshotRecorderCallback
    public void onScreenshotRecorded(File file, long j) {
        h.e(file, "screenshot");
        CaptureStrategy captureStrategy = this.captureStrategy;
        if (captureStrategy != null) {
            CaptureStrategy.DefaultImpls.onScreenshotRecorded$default(captureStrategy, null, new AnonymousClass3(file, j, this), 1, null);
        }
    }

    public /* synthetic */ ReplayIntegration(Context context, ICurrentDateProvider iCurrentDateProvider, s6.a aVar, Function1 function1, int i7, e eVar) {
        this(context, iCurrentDateProvider, (i7 & 4) != 0 ? null : aVar, (i7 & 8) != 0 ? null : function1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReplayIntegration(Context context, ICurrentDateProvider iCurrentDateProvider) {
        this(ContextKt.appContext(context), iCurrentDateProvider, null, null);
        h.e(context, "context");
        h.e(iCurrentDateProvider, "dateProvider");
    }

    public /* synthetic */ ReplayIntegration(Context context, ICurrentDateProvider iCurrentDateProvider, s6.a aVar, Function1 function1, Function1 function2, MainLooperHandler mainLooperHandler, s6.a aVar2, int i7, e eVar) {
        this(context, iCurrentDateProvider, aVar, function1, (i7 & 16) != 0 ? null : function2, (i7 & 32) != 0 ? null : mainLooperHandler, (i7 & 64) != 0 ? null : aVar2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReplayIntegration(Context context, ICurrentDateProvider iCurrentDateProvider, s6.a aVar, Function1 function1, Function1 function2, MainLooperHandler mainLooperHandler, s6.a aVar2) {
        this(ContextKt.appContext(context), iCurrentDateProvider, aVar, function1);
        h.e(context, "context");
        h.e(iCurrentDateProvider, "dateProvider");
        this.replayCaptureStrategyProvider = function2;
        this.mainLooperHandler = mainLooperHandler == null ? new MainLooperHandler(null, 1, null) : mainLooperHandler;
        this.gestureRecorderProvider = aVar2;
    }
}
