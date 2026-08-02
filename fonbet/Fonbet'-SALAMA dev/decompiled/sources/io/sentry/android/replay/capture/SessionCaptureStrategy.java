package io.sentry.android.replay.capture;

import C6.o;
import R5.F;
import R5.RunnableC0419o;
import android.graphics.Bitmap;
import androidx.compose.runtime.internal.StabilityInferred;
import h4.C1206i;
import io.sentry.IScope;
import io.sentry.IScopes;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.SentryReplayEvent;
import io.sentry.android.replay.ReplayCache;
import io.sentry.android.replay.ScreenshotRecorderConfig;
import io.sentry.android.replay.capture.CaptureStrategy;
import io.sentry.android.replay.util.ExecutorsKt;
import io.sentry.protocol.SentryId;
import io.sentry.rrweb.RRWebOptionsEvent;
import io.sentry.transport.ICurrentDateProvider;
import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import q5.q;
import t6.e;
import t6.h;
import w1.L;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class SessionCaptureStrategy extends BaseCaptureStrategy {
    private static final String TAG = "SessionCaptureStrategy";
    private final ICurrentDateProvider dateProvider;
    private final SentryOptions options;
    private final IScopes scopes;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ SessionCaptureStrategy(SentryOptions sentryOptions, IScopes iScopes, ICurrentDateProvider iCurrentDateProvider, ScheduledExecutorService scheduledExecutorService, Function1 function1, int i7, e eVar) {
        this(sentryOptions, iScopes, iCurrentDateProvider, scheduledExecutorService, (i7 & 16) != 0 ? null : function1);
    }

    private final void createCurrentSegment(String str, Function1 function1) {
        ScreenshotRecorderConfig recorderConfig = getRecorderConfig();
        if (recorderConfig == null) {
            this.options.getLogger().log(SentryLevel.DEBUG, L.i("Recorder config is not set, not creating segment for task: ", str), new Object[0]);
            return;
        }
        long currentTimeMillis = this.dateProvider.getCurrentTimeMillis();
        Date segmentTimestamp = getSegmentTimestamp();
        if (segmentTimestamp == null) {
            return;
        }
        ExecutorsKt.submitSafely(getReplayExecutor(), this.options, L.i("SessionCaptureStrategy.", str), new RunnableC0419o(this, currentTimeMillis - segmentTimestamp.getTime(), segmentTimestamp, getCurrentReplayId(), recorderConfig, function1, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createCurrentSegment$lambda$4(SessionCaptureStrategy sessionCaptureStrategy, long j, Date date, SentryId sentryId, ScreenshotRecorderConfig screenshotRecorderConfig, Function1 function1) {
        h.e(sessionCaptureStrategy, "this$0");
        h.e(date, "$currentSegmentTimestamp");
        h.e(sentryId, "$replayId");
        h.e(function1, "$onSegmentCreated");
        function1.invoke(BaseCaptureStrategy.createSegmentInternal$default(sessionCaptureStrategy, j, date, sentryId, sessionCaptureStrategy.getCurrentSegment(), screenshotRecorderConfig.getRecordingHeight(), screenshotRecorderConfig.getRecordingWidth(), screenshotRecorderConfig.getFrameRate(), screenshotRecorderConfig.getBitRate(), null, null, null, null, null, 7936, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onScreenshotRecorded$lambda$3(SessionCaptureStrategy sessionCaptureStrategy, Function2 function2, long j, ScreenshotRecorderConfig screenshotRecorderConfig) {
        SessionCaptureStrategy sessionCaptureStrategy2;
        h.e(sessionCaptureStrategy, "this$0");
        h.e(function2, "$store");
        ReplayCache cache = sessionCaptureStrategy.getCache();
        if (cache != null) {
            function2.invoke(cache, Long.valueOf(j));
        }
        Date segmentTimestamp = sessionCaptureStrategy.getSegmentTimestamp();
        if (segmentTimestamp == null) {
            sessionCaptureStrategy.options.getLogger().log(SentryLevel.DEBUG, "Segment timestamp is not set, not recording frame", new Object[0]);
            return;
        }
        if (sessionCaptureStrategy.isTerminating().get()) {
            sessionCaptureStrategy.options.getLogger().log(SentryLevel.DEBUG, "Not capturing segment, because the app is terminating, will be captured on next launch", new Object[0]);
            return;
        }
        if (screenshotRecorderConfig == null) {
            sessionCaptureStrategy.options.getLogger().log(SentryLevel.DEBUG, "Recorder config is not set, not recording frame", new Object[0]);
            return;
        }
        long currentTimeMillis = sessionCaptureStrategy.dateProvider.getCurrentTimeMillis();
        if (currentTimeMillis - segmentTimestamp.getTime() >= sessionCaptureStrategy.options.getSessionReplay().getSessionSegmentDuration()) {
            CaptureStrategy.ReplaySegment createSegmentInternal$default = BaseCaptureStrategy.createSegmentInternal$default(sessionCaptureStrategy, sessionCaptureStrategy.options.getSessionReplay().getSessionSegmentDuration(), segmentTimestamp, sessionCaptureStrategy.getCurrentReplayId(), sessionCaptureStrategy.getCurrentSegment(), screenshotRecorderConfig.getRecordingHeight(), screenshotRecorderConfig.getRecordingWidth(), screenshotRecorderConfig.getFrameRate(), screenshotRecorderConfig.getBitRate(), null, null, null, null, null, 7936, null);
            if (createSegmentInternal$default instanceof CaptureStrategy.ReplaySegment.Created) {
                CaptureStrategy.ReplaySegment.Created created = (CaptureStrategy.ReplaySegment.Created) createSegmentInternal$default;
                sessionCaptureStrategy2 = sessionCaptureStrategy;
                CaptureStrategy.ReplaySegment.Created.capture$default(created, sessionCaptureStrategy2.scopes, null, 2, null);
                sessionCaptureStrategy2.setCurrentSegment(sessionCaptureStrategy.getCurrentSegment() + 1);
                sessionCaptureStrategy2.setSegmentTimestamp(created.getReplay().getTimestamp());
            } else {
                sessionCaptureStrategy2 = sessionCaptureStrategy;
            }
        } else {
            sessionCaptureStrategy2 = sessionCaptureStrategy;
        }
        if (currentTimeMillis - sessionCaptureStrategy.getReplayStartTimestamp().get() >= sessionCaptureStrategy2.options.getSessionReplay().getSessionDuration()) {
            sessionCaptureStrategy2.options.getReplayController().stop();
            sessionCaptureStrategy2.options.getLogger().log(SentryLevel.INFO, "Session replay deadline exceeded (1h), stopping recording", new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void start$lambda$0(SessionCaptureStrategy sessionCaptureStrategy, IScope iScope) {
        h.e(sessionCaptureStrategy, "this$0");
        h.e(iScope, "it");
        iScope.setReplayId(sessionCaptureStrategy.getCurrentReplayId());
        String screen = iScope.getScreen();
        sessionCaptureStrategy.setScreenAtStart(screen != null ? o.D0(screen, screen) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void stop$lambda$1(IScope iScope) {
        h.e(iScope, "it");
        iScope.setReplayId(SentryId.EMPTY_ID);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void captureReplay(boolean z4, Function1 function1) {
        h.e(function1, "onSegmentSent");
        if (this.options.getSessionReplay().isDebug()) {
            this.options.getLogger().log(SentryLevel.DEBUG, "Replay is already running in 'session' mode, not capturing for event", new Object[0]);
        }
        isTerminating().set(z4);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public CaptureStrategy convert() {
        return this;
    }

    @Override // io.sentry.android.replay.capture.BaseCaptureStrategy, io.sentry.android.replay.capture.CaptureStrategy
    public void onConfigurationChanged(ScreenshotRecorderConfig screenshotRecorderConfig) {
        h.e(screenshotRecorderConfig, "recorderConfig");
        createCurrentSegment("onConfigurationChanged", new SessionCaptureStrategy$onConfigurationChanged$1(this));
        super.onConfigurationChanged(screenshotRecorderConfig);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void onScreenshotRecorded(Bitmap bitmap, Function2 function2) {
        h.e(function2, "store");
        ScreenshotRecorderConfig recorderConfig = getRecorderConfig();
        ExecutorsKt.submitSafely(getReplayExecutor(), this.options, "SessionCaptureStrategy.add_frame", new q(this, function2, this.dateProvider.getCurrentTimeMillis(), recorderConfig, 2));
    }

    @Override // io.sentry.android.replay.capture.BaseCaptureStrategy, io.sentry.android.replay.capture.CaptureStrategy
    public void pause() {
        createCurrentSegment("pause", new SessionCaptureStrategy$pause$1(this));
        super.pause();
    }

    @Override // io.sentry.android.replay.capture.BaseCaptureStrategy, io.sentry.android.replay.capture.CaptureStrategy
    public void start(int i7, SentryId sentryId, SentryReplayEvent.ReplayType replayType) {
        h.e(sentryId, "replayId");
        super.start(i7, sentryId, replayType);
        IScopes iScopes = this.scopes;
        if (iScopes != null) {
            iScopes.configureScope(new F(this, 9));
        }
    }

    @Override // io.sentry.android.replay.capture.BaseCaptureStrategy, io.sentry.android.replay.capture.CaptureStrategy
    public void stop() {
        ReplayCache cache = getCache();
        createCurrentSegment("stop", new SessionCaptureStrategy$stop$1(this, cache != null ? cache.getReplayCacheDir$sentry_android_replay_release() : null));
        IScopes iScopes = this.scopes;
        if (iScopes != null) {
            iScopes.configureScope(new C1206i(3));
        }
        super.stop();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionCaptureStrategy(SentryOptions sentryOptions, IScopes iScopes, ICurrentDateProvider iCurrentDateProvider, ScheduledExecutorService scheduledExecutorService, Function1 function1) {
        super(sentryOptions, iScopes, iCurrentDateProvider, scheduledExecutorService, function1);
        h.e(sentryOptions, RRWebOptionsEvent.EVENT_TAG);
        h.e(iCurrentDateProvider, "dateProvider");
        h.e(scheduledExecutorService, "executor");
        this.options = sentryOptions;
        this.scopes = iScopes;
        this.dateProvider = iCurrentDateProvider;
    }
}
