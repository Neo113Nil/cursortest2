package io.sentry.android.replay.capture;

import K5.a;
import R5.F;
import R5.RunnableC0419o;
import android.graphics.Bitmap;
import android.view.MotionEvent;
import androidx.compose.runtime.internal.StabilityInferred;
import io.sentry.DateUtils;
import io.sentry.IScope;
import io.sentry.IScopes;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.SentryReplayEvent;
import io.sentry.android.core.m;
import io.sentry.android.replay.ReplayCache;
import io.sentry.android.replay.ReplayFrame;
import io.sentry.android.replay.ScreenshotRecorderConfig;
import io.sentry.android.replay.util.ExecutorsKt;
import io.sentry.android.replay.util.SamplingKt;
import io.sentry.protocol.SentryId;
import io.sentry.rrweb.RRWebOptionsEvent;
import io.sentry.transport.ICurrentDateProvider;
import io.sentry.util.FileUtils;
import io.sentry.util.Random;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import p155w1.L;
import t6.e;
import t6.h;
import t6.i;
import t6.n;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class BufferCaptureStrategy extends BaseCaptureStrategy {
    private static final long ENVELOPE_PROCESSING_DELAY = 100;
    private static final String TAG = "BufferCaptureStrategy";
    private final List<CaptureStrategy.ReplaySegment.Created> bufferedSegments;
    private final ICurrentDateProvider dateProvider;
    private final SentryOptions options;
    private final Random random;
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

    /* JADX INFO: renamed from: io.sentry.android.replay.capture.BufferCaptureStrategy$captureReplay$2, reason: invalid class name */
    public static final class AnonymousClass2 extends i implements Function1 {
        final /* synthetic */ Function1 $onSegmentSent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Function1 function1) {
            super(1);
            this.$onSegmentSent = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws InterruptedException {
            invoke((CaptureStrategy.ReplaySegment) obj);
            return p044f6.i.f13014a;
        }

        public final void invoke(CaptureStrategy.ReplaySegment replaySegment) throws InterruptedException {
            h.e(replaySegment, "segment");
            BufferCaptureStrategy bufferCaptureStrategy = BufferCaptureStrategy.this;
            bufferCaptureStrategy.capture(bufferCaptureStrategy.bufferedSegments);
            if (replaySegment instanceof CaptureStrategy.ReplaySegment.Created) {
                CaptureStrategy.ReplaySegment.Created created = (CaptureStrategy.ReplaySegment.Created) replaySegment;
                CaptureStrategy.ReplaySegment.Created.capture$default(created, BufferCaptureStrategy.this.scopes, null, 2, null);
                Function1 function1 = this.$onSegmentSent;
                Date timestamp = created.getReplay().getTimestamp();
                h.d(timestamp, "segment.replay.timestamp");
                function1.invoke(timestamp);
            }
        }
    }

    /* JADX INFO: renamed from: io.sentry.android.replay.capture.BufferCaptureStrategy$onConfigurationChanged$1, reason: invalid class name */
    public static final class AnonymousClass1 extends i implements Function1 {
        public AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((CaptureStrategy.ReplaySegment) obj);
            return p044f6.i.f13014a;
        }

        public final void invoke(CaptureStrategy.ReplaySegment replaySegment) {
            h.e(replaySegment, "segment");
            if (replaySegment instanceof CaptureStrategy.ReplaySegment.Created) {
                BufferCaptureStrategy.this.bufferedSegments.add(replaySegment);
                BufferCaptureStrategy bufferCaptureStrategy = BufferCaptureStrategy.this;
                bufferCaptureStrategy.setCurrentSegment(bufferCaptureStrategy.getCurrentSegment() + 1);
            }
        }
    }

    /* JADX INFO: renamed from: io.sentry.android.replay.capture.BufferCaptureStrategy$pause$1, reason: invalid class name and case insensitive filesystem */
    public static final class C09201 extends i implements Function1 {
        public C09201() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((CaptureStrategy.ReplaySegment) obj);
            return p044f6.i.f13014a;
        }

        public final void invoke(CaptureStrategy.ReplaySegment replaySegment) {
            h.e(replaySegment, "segment");
            if (replaySegment instanceof CaptureStrategy.ReplaySegment.Created) {
                BufferCaptureStrategy.this.bufferedSegments.add(replaySegment);
                BufferCaptureStrategy bufferCaptureStrategy = BufferCaptureStrategy.this;
                bufferCaptureStrategy.setCurrentSegment(bufferCaptureStrategy.getCurrentSegment() + 1);
            }
        }
    }

    /* JADX INFO: renamed from: io.sentry.android.replay.capture.BufferCaptureStrategy$rotate$1, reason: invalid class name and case insensitive filesystem */
    public static final class C09211 extends i implements Function1 {
        final /* synthetic */ long $bufferLimit;
        final /* synthetic */ n $removed;
        final /* synthetic */ BufferCaptureStrategy this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C09211(long j, BufferCaptureStrategy bufferCaptureStrategy, n nVar) {
            super(1);
            this.$bufferLimit = j;
            this.this$0 = bufferCaptureStrategy;
            this.$removed = nVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(CaptureStrategy.ReplaySegment.Created created) {
            h.e(created, "it");
            if (created.getReplay().getTimestamp().getTime() >= this.$bufferLimit) {
                return Boolean.FALSE;
            }
            BufferCaptureStrategy bufferCaptureStrategy = this.this$0;
            bufferCaptureStrategy.setCurrentSegment(bufferCaptureStrategy.getCurrentSegment() - 1);
            this.this$0.deleteFile(created.getReplay().getVideoFile());
            this.$removed.f16476a = true;
            return Boolean.TRUE;
        }
    }

    public /* synthetic */ BufferCaptureStrategy(SentryOptions sentryOptions, IScopes iScopes, ICurrentDateProvider iCurrentDateProvider, Random random, ScheduledExecutorService scheduledExecutorService, Function1 function1, int i7, e eVar) {
        this(sentryOptions, iScopes, iCurrentDateProvider, random, scheduledExecutorService, (i7 & 32) != 0 ? null : function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void capture(List<CaptureStrategy.ReplaySegment.Created> list) throws InterruptedException {
        h.e(list, "<this>");
        CaptureStrategy.ReplaySegment.Created createdRemove = list.isEmpty() ? null : list.remove(0);
        while (createdRemove != null) {
            CaptureStrategy.ReplaySegment.Created.capture$default(createdRemove, this.scopes, null, 2, null);
            createdRemove = list.isEmpty() ? null : list.remove(0);
            Thread.sleep(ENVELOPE_PROCESSING_DELAY);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void captureReplay$lambda$1(BufferCaptureStrategy bufferCaptureStrategy, IScope iScope) {
        h.e(bufferCaptureStrategy, "this$0");
        h.e(iScope, "it");
        iScope.setReplayId(bufferCaptureStrategy.getCurrentReplayId());
    }

    private final void createCurrentSegment(String str, Function1 function1) {
        Date dateTime;
        List<ReplayFrame> frames$sentry_android_replay_release;
        ScreenshotRecorderConfig recorderConfig = getRecorderConfig();
        if (recorderConfig == null) {
            this.options.getLogger().log(SentryLevel.DEBUG, L.i("Recorder config is not set, not creating segment for task: ", str), new Object[0]);
            return;
        }
        long errorReplayDuration = this.options.getSessionReplay().getErrorReplayDuration();
        long currentTimeMillis = this.dateProvider.getCurrentTimeMillis();
        ReplayCache cache = getCache();
        if (cache == null || (frames$sentry_android_replay_release = cache.getFrames$sentry_android_replay_release()) == null || !(!frames$sentry_android_replay_release.isEmpty())) {
            dateTime = DateUtils.getDateTime(currentTimeMillis - errorReplayDuration);
        } else {
            ReplayCache cache2 = getCache();
            h.b(cache2);
            dateTime = DateUtils.getDateTime(((ReplayFrame) p050g6.h.Q0(cache2.getFrames$sentry_android_replay_release())).getTimestamp());
        }
        Date date = dateTime;
        h.d(date, "if (cache?.frames?.isNot…orReplayDuration)\n      }");
        ExecutorsKt.submitSafely(getReplayExecutor(), this.options, L.i("BufferCaptureStrategy.", str), new RunnableC0419o(this, currentTimeMillis - date.getTime(), date, getCurrentReplayId(), recorderConfig, function1, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createCurrentSegment$lambda$4(BufferCaptureStrategy bufferCaptureStrategy, long j, Date date, SentryId sentryId, ScreenshotRecorderConfig screenshotRecorderConfig, Function1 function1) {
        h.e(bufferCaptureStrategy, "this$0");
        h.e(date, "$currentSegmentTimestamp");
        h.e(sentryId, "$replayId");
        h.e(function1, "$onSegmentCreated");
        function1.invoke(BaseCaptureStrategy.createSegmentInternal$default(bufferCaptureStrategy, j, date, sentryId, bufferCaptureStrategy.getCurrentSegment(), screenshotRecorderConfig.getRecordingHeight(), screenshotRecorderConfig.getRecordingWidth(), screenshotRecorderConfig.getFrameRate(), screenshotRecorderConfig.getBitRate(), null, null, null, null, null, 7936, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void deleteFile(File file) {
        if (file == null) {
            return;
        }
        try {
            if (file.delete()) {
                return;
            }
            this.options.getLogger().log(SentryLevel.ERROR, "Failed to delete replay segment: %s", file.getAbsolutePath());
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, th, "Failed to delete replay segment: %s", file.getAbsolutePath());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onScreenshotRecorded$lambda$2(BufferCaptureStrategy bufferCaptureStrategy, Function2 function2, long j) {
        h.e(bufferCaptureStrategy, "this$0");
        h.e(function2, "$store");
        ReplayCache cache = bufferCaptureStrategy.getCache();
        if (cache != null) {
            function2.invoke(cache, Long.valueOf(j));
        }
        long currentTimeMillis = bufferCaptureStrategy.dateProvider.getCurrentTimeMillis() - bufferCaptureStrategy.options.getSessionReplay().getErrorReplayDuration();
        ReplayCache cache2 = bufferCaptureStrategy.getCache();
        bufferCaptureStrategy.setScreenAtStart(cache2 != null ? cache2.rotate$sentry_android_replay_release(currentTimeMillis) : null);
        bufferCaptureStrategy.rotate(bufferCaptureStrategy.bufferedSegments, currentTimeMillis);
    }

    private final void rotate(List<CaptureStrategy.ReplaySegment.Created> list, long j) {
        n nVar = new n();
        p050g6.n.P0(list, new C09211(j, this, nVar));
        if (nVar.f16476a) {
            int i7 = 0;
            for (Object obj : list) {
                int i8 = i7 + 1;
                if (i7 < 0) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                ((CaptureStrategy.ReplaySegment.Created) obj).setSegmentId(i7);
                i7 = i8;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void stop$lambda$0(File file, BufferCaptureStrategy bufferCaptureStrategy) {
        h.e(bufferCaptureStrategy, "this$0");
        FileUtils.deleteRecursively(file);
        bufferCaptureStrategy.setCurrentSegment(-1);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void captureReplay(boolean z4, Function1 function1) {
        h.e(function1, "onSegmentSent");
        if (!SamplingKt.sample(this.random, this.options.getSessionReplay().getOnErrorSampleRate())) {
            this.options.getLogger().log(SentryLevel.INFO, "Replay wasn't sampled by onErrorSampleRate, not capturing for event", new Object[0]);
            return;
        }
        IScopes iScopes = this.scopes;
        if (iScopes != null) {
            iScopes.configureScope(new F(this, 8));
        }
        if (!z4) {
            createCurrentSegment("capture_replay", new AnonymousClass2(function1));
        } else {
            isTerminating().set(true);
            this.options.getLogger().log(SentryLevel.DEBUG, "Not capturing replay for crashed event, will be captured on next launch", new Object[0]);
        }
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public CaptureStrategy convert() {
        if (isTerminating().get()) {
            this.options.getLogger().log(SentryLevel.DEBUG, "Not converting to session mode, because the process is about to terminate", new Object[0]);
            return this;
        }
        SessionCaptureStrategy sessionCaptureStrategy = new SessionCaptureStrategy(this.options, this.scopes, this.dateProvider, getReplayExecutor(), null, 16, null);
        sessionCaptureStrategy.start(getCurrentSegment(), getCurrentReplayId(), SentryReplayEvent.ReplayType.BUFFER);
        return sessionCaptureStrategy;
    }

    @Override // io.sentry.android.replay.capture.BaseCaptureStrategy, io.sentry.android.replay.capture.CaptureStrategy
    public void onConfigurationChanged(ScreenshotRecorderConfig screenshotRecorderConfig) {
        h.e(screenshotRecorderConfig, "recorderConfig");
        createCurrentSegment("configuration_changed", new AnonymousClass1());
        super.onConfigurationChanged(screenshotRecorderConfig);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void onScreenshotRecorded(Bitmap bitmap, Function2 function2) {
        h.e(function2, "store");
        ExecutorsKt.submitSafely(getReplayExecutor(), this.options, "BufferCaptureStrategy.add_frame", new m(this, function2, this.dateProvider.getCurrentTimeMillis(), 1));
    }

    @Override // io.sentry.android.replay.capture.BaseCaptureStrategy, io.sentry.android.replay.capture.CaptureStrategy
    public void onTouchEvent(MotionEvent motionEvent) {
        h.e(motionEvent, "event");
        super.onTouchEvent(motionEvent);
        CaptureStrategy.Companion.rotateEvents$sentry_android_replay_release$default(CaptureStrategy.Companion, getCurrentEvents(), this.dateProvider.getCurrentTimeMillis() - this.options.getSessionReplay().getErrorReplayDuration(), null, 4, null);
    }

    @Override // io.sentry.android.replay.capture.BaseCaptureStrategy, io.sentry.android.replay.capture.CaptureStrategy
    public void pause() {
        createCurrentSegment("pause", new C09201());
        super.pause();
    }

    @Override // io.sentry.android.replay.capture.BaseCaptureStrategy, io.sentry.android.replay.capture.CaptureStrategy
    public void stop() {
        ReplayCache cache = getCache();
        ExecutorsKt.submitSafely(getReplayExecutor(), this.options, "BufferCaptureStrategy.stop", new a(24, cache != null ? cache.getReplayCacheDir$sentry_android_replay_release() : null, this));
        super.stop();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BufferCaptureStrategy(SentryOptions sentryOptions, IScopes iScopes, ICurrentDateProvider iCurrentDateProvider, Random random, ScheduledExecutorService scheduledExecutorService, Function1 function1) {
        super(sentryOptions, iScopes, iCurrentDateProvider, scheduledExecutorService, function1);
        h.e(sentryOptions, RRWebOptionsEvent.EVENT_TAG);
        h.e(iCurrentDateProvider, "dateProvider");
        h.e(random, "random");
        h.e(scheduledExecutorService, "executor");
        this.options = sentryOptions;
        this.scopes = iScopes;
        this.dateProvider = iCurrentDateProvider;
        this.random = random;
        this.bufferedSegments = new ArrayList();
    }
}
