package io.sentry.android.replay.capture;

import A6.d;
import Y4.D;
import android.view.MotionEvent;
import androidx.compose.runtime.internal.StabilityInferred;
import f6.C1116i;
import f6.InterfaceC1109b;
import g6.AbstractC1165n;
import io.sentry.Breadcrumb;
import io.sentry.DateUtils;
import io.sentry.IScopes;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.SentryReplayEvent;
import io.sentry.android.replay.ReplayCache;
import io.sentry.android.replay.ScreenshotRecorderConfig;
import io.sentry.android.replay.capture.CaptureStrategy;
import io.sentry.android.replay.gestures.ReplayGestureConverter;
import io.sentry.android.replay.util.ExecutorsKt;
import io.sentry.protocol.SentryId;
import io.sentry.rrweb.RRWebEvent;
import io.sentry.rrweb.RRWebIncrementalSnapshotEvent;
import io.sentry.rrweb.RRWebOptionsEvent;
import io.sentry.transport.ICurrentDateProvider;
import java.io.File;
import java.util.Date;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function1;
import s6.a;
import s6.o;
import t6.e;
import t6.h;
import t6.i;
import t6.j;
import t6.q;
import w6.b;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public abstract class BaseCaptureStrategy implements CaptureStrategy {
    static final /* synthetic */ d[] $$delegatedProperties;
    public static final int $stable;
    public static final Companion Companion;
    private static final String TAG = "CaptureStrategy";
    private ReplayCache cache;
    private final Deque<RRWebEvent> currentEvents;
    private final b currentReplayId$delegate;
    private final b currentSegment$delegate;
    private final ICurrentDateProvider dateProvider;
    private final ReplayGestureConverter gestureConverter;
    private final AtomicBoolean isTerminating;
    private final SentryOptions options;
    private final InterfaceC1109b persistingExecutor$delegate;
    private final b recorderConfig$delegate;
    private final Function1 replayCacheProvider;
    private final ScheduledExecutorService replayExecutor;
    private final AtomicLong replayStartTimestamp;
    private final b replayType$delegate;
    private final IScopes scopes;
    private final b screenAtStart$delegate;
    private final b segmentTimestamp$delegate;

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        private Companion() {
        }
    }

    public static final class ReplayPersistingExecutorServiceThreadFactory implements ThreadFactory {
        private int cnt;

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            h.e(runnable, "r");
            StringBuilder sb = new StringBuilder("SentryReplayPersister-");
            int i7 = this.cnt;
            this.cnt = i7 + 1;
            sb.append(i7);
            Thread thread = new Thread(runnable, sb.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    static {
        j jVar = new j("recorderConfig", "getRecorderConfig()Lio/sentry/android/replay/ScreenshotRecorderConfig;");
        q.f16473a.getClass();
        $$delegatedProperties = new d[]{jVar, new j("segmentTimestamp", "getSegmentTimestamp()Ljava/util/Date;"), new j("screenAtStart", "getScreenAtStart()Ljava/lang/String;"), new j("currentReplayId", "getCurrentReplayId()Lio/sentry/protocol/SentryId;"), new j("currentSegment", "getCurrentSegment()I"), new j("replayType", "getReplayType()Lio/sentry/SentryReplayEvent$ReplayType;")};
        Companion = new Companion(null);
        $stable = 8;
    }

    public BaseCaptureStrategy(SentryOptions sentryOptions, IScopes iScopes, ICurrentDateProvider iCurrentDateProvider, ScheduledExecutorService scheduledExecutorService, Function1 function1) {
        h.e(sentryOptions, RRWebOptionsEvent.EVENT_TAG);
        h.e(iCurrentDateProvider, "dateProvider");
        h.e(scheduledExecutorService, "replayExecutor");
        this.options = sentryOptions;
        this.scopes = iScopes;
        this.dateProvider = iCurrentDateProvider;
        this.replayExecutor = scheduledExecutorService;
        this.replayCacheProvider = function1;
        this.persistingExecutor$delegate = D.C(BaseCaptureStrategy$persistingExecutor$2.INSTANCE);
        this.gestureConverter = new ReplayGestureConverter(iCurrentDateProvider);
        this.isTerminating = new AtomicBoolean(false);
        final String str = "";
        final Object obj = null;
        this.recorderConfig$delegate = new b(obj, this, str, this) { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomicNullable$default$1
            final /* synthetic */ String $propertyName;
            final /* synthetic */ BaseCaptureStrategy this$0;
            final /* synthetic */ BaseCaptureStrategy this$0$inline_fun;
            private final AtomicReference<ScreenshotRecorderConfig> value;

            /* renamed from: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomicNullable$default$1$2, reason: invalid class name */
            public static final class AnonymousClass2 extends i implements a {
                final /* synthetic */ Object $oldValue;
                final /* synthetic */ String $propertyName;
                final /* synthetic */ Object $value;
                final /* synthetic */ BaseCaptureStrategy this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(String str, Object obj, Object obj2, BaseCaptureStrategy baseCaptureStrategy) {
                    super(0);
                    this.$propertyName = str;
                    this.$oldValue = obj;
                    this.$value = obj2;
                    this.this$0 = baseCaptureStrategy;
                }

                @Override // s6.a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m18invoke();
                    return C1116i.f13008a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m18invoke() {
                    Object obj = this.$oldValue;
                    ScreenshotRecorderConfig screenshotRecorderConfig = (ScreenshotRecorderConfig) this.$value;
                    if (screenshotRecorderConfig == null) {
                        return;
                    }
                    ReplayCache cache = this.this$0.getCache();
                    if (cache != null) {
                        cache.persistSegmentValues$sentry_android_replay_release(ReplayCache.SEGMENT_KEY_HEIGHT, String.valueOf(screenshotRecorderConfig.getRecordingHeight()));
                    }
                    ReplayCache cache2 = this.this$0.getCache();
                    if (cache2 != null) {
                        cache2.persistSegmentValues$sentry_android_replay_release(ReplayCache.SEGMENT_KEY_WIDTH, String.valueOf(screenshotRecorderConfig.getRecordingWidth()));
                    }
                    ReplayCache cache3 = this.this$0.getCache();
                    if (cache3 != null) {
                        cache3.persistSegmentValues$sentry_android_replay_release(ReplayCache.SEGMENT_KEY_FRAME_RATE, String.valueOf(screenshotRecorderConfig.getFrameRate()));
                    }
                    ReplayCache cache4 = this.this$0.getCache();
                    if (cache4 != null) {
                        cache4.persistSegmentValues$sentry_android_replay_release(ReplayCache.SEGMENT_KEY_BIT_RATE, String.valueOf(screenshotRecorderConfig.getBitRate()));
                    }
                }
            }

            {
                this.this$0$inline_fun = this;
                this.$propertyName = str;
                this.this$0 = this;
                this.value = new AtomicReference<>(obj);
            }

            private final void runInBackground(final a aVar) {
                SentryOptions sentryOptions2;
                SentryOptions sentryOptions3;
                ScheduledExecutorService persistingExecutor;
                SentryOptions sentryOptions4;
                sentryOptions2 = this.this$0$inline_fun.options;
                if (sentryOptions2.getThreadChecker().isMainThread()) {
                    persistingExecutor = this.this$0$inline_fun.getPersistingExecutor();
                    sentryOptions4 = this.this$0$inline_fun.options;
                    ExecutorsKt.submitSafely(persistingExecutor, sentryOptions4, "CaptureStrategy.runInBackground", new Runnable() { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomicNullable$default$1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            a.this.invoke();
                        }
                    });
                } else {
                    try {
                        aVar.invoke();
                    } catch (Throwable th) {
                        sentryOptions3 = this.this$0$inline_fun.options;
                        sentryOptions3.getLogger().log(SentryLevel.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
                    }
                }
            }

            @Override // w6.a
            public ScreenshotRecorderConfig getValue(Object obj2, d dVar) {
                h.e(dVar, "property");
                return this.value.get();
            }

            @Override // w6.b
            public void setValue(Object obj2, d dVar, ScreenshotRecorderConfig screenshotRecorderConfig) {
                h.e(dVar, "property");
                ScreenshotRecorderConfig andSet = this.value.getAndSet(screenshotRecorderConfig);
                if (h.a(andSet, screenshotRecorderConfig)) {
                    return;
                }
                runInBackground(new AnonymousClass2(this.$propertyName, andSet, screenshotRecorderConfig, this.this$0));
            }
        };
        final String str2 = ReplayCache.SEGMENT_KEY_TIMESTAMP;
        this.segmentTimestamp$delegate = new b(obj, this, str2, this) { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomicNullable$default$2
            final /* synthetic */ String $propertyName;
            final /* synthetic */ BaseCaptureStrategy this$0;
            final /* synthetic */ BaseCaptureStrategy this$0$inline_fun;
            private final AtomicReference<Date> value;

            /* renamed from: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomicNullable$default$2$2, reason: invalid class name */
            public static final class AnonymousClass2 extends i implements a {
                final /* synthetic */ Object $oldValue;
                final /* synthetic */ String $propertyName;
                final /* synthetic */ Object $value;
                final /* synthetic */ BaseCaptureStrategy this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(String str, Object obj, Object obj2, BaseCaptureStrategy baseCaptureStrategy) {
                    super(0);
                    this.$propertyName = str;
                    this.$oldValue = obj;
                    this.$value = obj2;
                    this.this$0 = baseCaptureStrategy;
                }

                @Override // s6.a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m19invoke();
                    return C1116i.f13008a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m19invoke() {
                    Object obj = this.$oldValue;
                    Date date = (Date) this.$value;
                    ReplayCache cache = this.this$0.getCache();
                    if (cache != null) {
                        cache.persistSegmentValues$sentry_android_replay_release(ReplayCache.SEGMENT_KEY_TIMESTAMP, date == null ? null : DateUtils.getTimestamp(date));
                    }
                }
            }

            {
                this.this$0$inline_fun = this;
                this.$propertyName = str2;
                this.this$0 = this;
                this.value = new AtomicReference<>(obj);
            }

            private final void runInBackground(final a aVar) {
                SentryOptions sentryOptions2;
                SentryOptions sentryOptions3;
                ScheduledExecutorService persistingExecutor;
                SentryOptions sentryOptions4;
                sentryOptions2 = this.this$0$inline_fun.options;
                if (sentryOptions2.getThreadChecker().isMainThread()) {
                    persistingExecutor = this.this$0$inline_fun.getPersistingExecutor();
                    sentryOptions4 = this.this$0$inline_fun.options;
                    ExecutorsKt.submitSafely(persistingExecutor, sentryOptions4, "CaptureStrategy.runInBackground", new Runnable() { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomicNullable$default$2.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            a.this.invoke();
                        }
                    });
                } else {
                    try {
                        aVar.invoke();
                    } catch (Throwable th) {
                        sentryOptions3 = this.this$0$inline_fun.options;
                        sentryOptions3.getLogger().log(SentryLevel.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
                    }
                }
            }

            @Override // w6.a
            public Date getValue(Object obj2, d dVar) {
                h.e(dVar, "property");
                return this.value.get();
            }

            @Override // w6.b
            public void setValue(Object obj2, d dVar, Date date) {
                h.e(dVar, "property");
                Date andSet = this.value.getAndSet(date);
                if (h.a(andSet, date)) {
                    return;
                }
                runInBackground(new AnonymousClass2(this.$propertyName, andSet, date, this.this$0));
            }
        };
        this.replayStartTimestamp = new AtomicLong();
        final Object obj2 = null;
        final String str3 = ReplayCache.SEGMENT_KEY_REPLAY_SCREEN_AT_START;
        this.screenAtStart$delegate = new b(obj2, this, str3, this, str3) { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomicNullable$default$3
            final /* synthetic */ String $propertyName;
            final /* synthetic */ String $propertyName$inlined;
            final /* synthetic */ BaseCaptureStrategy this$0;
            final /* synthetic */ BaseCaptureStrategy this$0$inline_fun;
            private final AtomicReference<String> value;

            /* renamed from: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomicNullable$default$3$2, reason: invalid class name */
            public static final class AnonymousClass2 extends i implements a {
                final /* synthetic */ Object $oldValue;
                final /* synthetic */ String $propertyName;
                final /* synthetic */ String $propertyName$inlined;
                final /* synthetic */ Object $value;
                final /* synthetic */ BaseCaptureStrategy this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(String str, Object obj, Object obj2, BaseCaptureStrategy baseCaptureStrategy, String str2) {
                    super(0);
                    this.$propertyName = str;
                    this.$oldValue = obj;
                    this.$value = obj2;
                    this.this$0 = baseCaptureStrategy;
                    this.$propertyName$inlined = str2;
                }

                @Override // s6.a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m20invoke();
                    return C1116i.f13008a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m20invoke() {
                    Object obj = this.$value;
                    ReplayCache cache = this.this$0.getCache();
                    if (cache != null) {
                        cache.persistSegmentValues$sentry_android_replay_release(this.$propertyName$inlined, String.valueOf(obj));
                    }
                }
            }

            {
                this.this$0$inline_fun = this;
                this.$propertyName = str3;
                this.this$0 = this;
                this.$propertyName$inlined = str3;
                this.value = new AtomicReference<>(obj2);
            }

            private final void runInBackground(final a aVar) {
                SentryOptions sentryOptions2;
                SentryOptions sentryOptions3;
                ScheduledExecutorService persistingExecutor;
                SentryOptions sentryOptions4;
                sentryOptions2 = this.this$0$inline_fun.options;
                if (sentryOptions2.getThreadChecker().isMainThread()) {
                    persistingExecutor = this.this$0$inline_fun.getPersistingExecutor();
                    sentryOptions4 = this.this$0$inline_fun.options;
                    ExecutorsKt.submitSafely(persistingExecutor, sentryOptions4, "CaptureStrategy.runInBackground", new Runnable() { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomicNullable$default$3.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            a.this.invoke();
                        }
                    });
                } else {
                    try {
                        aVar.invoke();
                    } catch (Throwable th) {
                        sentryOptions3 = this.this$0$inline_fun.options;
                        sentryOptions3.getLogger().log(SentryLevel.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
                    }
                }
            }

            @Override // w6.a
            public String getValue(Object obj3, d dVar) {
                h.e(dVar, "property");
                return this.value.get();
            }

            @Override // w6.b
            public void setValue(Object obj3, d dVar, String str4) {
                h.e(dVar, "property");
                String andSet = this.value.getAndSet(str4);
                if (h.a(andSet, str4)) {
                    return;
                }
                runInBackground(new AnonymousClass2(this.$propertyName, andSet, str4, this.this$0, this.$propertyName$inlined));
            }
        };
        final SentryId sentryId = SentryId.EMPTY_ID;
        final String str4 = ReplayCache.SEGMENT_KEY_REPLAY_ID;
        this.currentReplayId$delegate = new b(sentryId, this, str4, this, str4) { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomic$default$1
            final /* synthetic */ String $propertyName;
            final /* synthetic */ String $propertyName$inlined;
            final /* synthetic */ BaseCaptureStrategy this$0;
            final /* synthetic */ BaseCaptureStrategy this$0$inline_fun;
            private final AtomicReference<SentryId> value;

            /* renamed from: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomic$default$1$2, reason: invalid class name */
            public static final class AnonymousClass2 extends i implements a {
                final /* synthetic */ Object $oldValue;
                final /* synthetic */ String $propertyName;
                final /* synthetic */ String $propertyName$inlined;
                final /* synthetic */ Object $value;
                final /* synthetic */ BaseCaptureStrategy this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(String str, Object obj, Object obj2, BaseCaptureStrategy baseCaptureStrategy, String str2) {
                    super(0);
                    this.$propertyName = str;
                    this.$oldValue = obj;
                    this.$value = obj2;
                    this.this$0 = baseCaptureStrategy;
                    this.$propertyName$inlined = str2;
                }

                @Override // s6.a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m15invoke();
                    return C1116i.f13008a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m15invoke() {
                    Object obj = this.$value;
                    ReplayCache cache = this.this$0.getCache();
                    if (cache != null) {
                        cache.persistSegmentValues$sentry_android_replay_release(this.$propertyName$inlined, String.valueOf(obj));
                    }
                }
            }

            {
                this.this$0$inline_fun = this;
                this.$propertyName = str4;
                this.this$0 = this;
                this.$propertyName$inlined = str4;
                this.value = new AtomicReference<>(sentryId);
            }

            private final void runInBackground(final a aVar) {
                SentryOptions sentryOptions2;
                SentryOptions sentryOptions3;
                ScheduledExecutorService persistingExecutor;
                SentryOptions sentryOptions4;
                sentryOptions2 = this.this$0$inline_fun.options;
                if (sentryOptions2.getThreadChecker().isMainThread()) {
                    persistingExecutor = this.this$0$inline_fun.getPersistingExecutor();
                    sentryOptions4 = this.this$0$inline_fun.options;
                    ExecutorsKt.submitSafely(persistingExecutor, sentryOptions4, "CaptureStrategy.runInBackground", new Runnable() { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomic$default$1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            a.this.invoke();
                        }
                    });
                } else {
                    try {
                        aVar.invoke();
                    } catch (Throwable th) {
                        sentryOptions3 = this.this$0$inline_fun.options;
                        sentryOptions3.getLogger().log(SentryLevel.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
                    }
                }
            }

            @Override // w6.a
            public SentryId getValue(Object obj3, d dVar) {
                h.e(dVar, "property");
                return this.value.get();
            }

            @Override // w6.b
            public void setValue(Object obj3, d dVar, SentryId sentryId2) {
                h.e(dVar, "property");
                SentryId andSet = this.value.getAndSet(sentryId2);
                if (h.a(andSet, sentryId2)) {
                    return;
                }
                runInBackground(new AnonymousClass2(this.$propertyName, andSet, sentryId2, this.this$0, this.$propertyName$inlined));
            }
        };
        final int i7 = -1;
        final String str5 = ReplayCache.SEGMENT_KEY_ID;
        this.currentSegment$delegate = new b(i7, this, str5, this, str5) { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomic$default$2
            final /* synthetic */ String $propertyName;
            final /* synthetic */ String $propertyName$inlined;
            final /* synthetic */ BaseCaptureStrategy this$0;
            final /* synthetic */ BaseCaptureStrategy this$0$inline_fun;
            private final AtomicReference<Integer> value;

            /* renamed from: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomic$default$2$2, reason: invalid class name */
            public static final class AnonymousClass2 extends i implements a {
                final /* synthetic */ Object $oldValue;
                final /* synthetic */ String $propertyName;
                final /* synthetic */ String $propertyName$inlined;
                final /* synthetic */ Object $value;
                final /* synthetic */ BaseCaptureStrategy this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(String str, Object obj, Object obj2, BaseCaptureStrategy baseCaptureStrategy, String str2) {
                    super(0);
                    this.$propertyName = str;
                    this.$oldValue = obj;
                    this.$value = obj2;
                    this.this$0 = baseCaptureStrategy;
                    this.$propertyName$inlined = str2;
                }

                @Override // s6.a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m16invoke();
                    return C1116i.f13008a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m16invoke() {
                    Object obj = this.$value;
                    ReplayCache cache = this.this$0.getCache();
                    if (cache != null) {
                        cache.persistSegmentValues$sentry_android_replay_release(this.$propertyName$inlined, String.valueOf(obj));
                    }
                }
            }

            {
                this.this$0$inline_fun = this;
                this.$propertyName = str5;
                this.this$0 = this;
                this.$propertyName$inlined = str5;
                this.value = new AtomicReference<>(i7);
            }

            private final void runInBackground(final a aVar) {
                SentryOptions sentryOptions2;
                SentryOptions sentryOptions3;
                ScheduledExecutorService persistingExecutor;
                SentryOptions sentryOptions4;
                sentryOptions2 = this.this$0$inline_fun.options;
                if (sentryOptions2.getThreadChecker().isMainThread()) {
                    persistingExecutor = this.this$0$inline_fun.getPersistingExecutor();
                    sentryOptions4 = this.this$0$inline_fun.options;
                    ExecutorsKt.submitSafely(persistingExecutor, sentryOptions4, "CaptureStrategy.runInBackground", new Runnable() { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomic$default$2.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            a.this.invoke();
                        }
                    });
                } else {
                    try {
                        aVar.invoke();
                    } catch (Throwable th) {
                        sentryOptions3 = this.this$0$inline_fun.options;
                        sentryOptions3.getLogger().log(SentryLevel.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
                    }
                }
            }

            @Override // w6.a
            public Integer getValue(Object obj3, d dVar) {
                h.e(dVar, "property");
                return this.value.get();
            }

            @Override // w6.b
            public void setValue(Object obj3, d dVar, Integer num) {
                h.e(dVar, "property");
                Integer andSet = this.value.getAndSet(num);
                if (h.a(andSet, num)) {
                    return;
                }
                runInBackground(new AnonymousClass2(this.$propertyName, andSet, num, this.this$0, this.$propertyName$inlined));
            }
        };
        final Object obj3 = null;
        final String str6 = ReplayCache.SEGMENT_KEY_REPLAY_TYPE;
        this.replayType$delegate = new b(obj3, this, str6, this, str6) { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomic$default$3
            final /* synthetic */ String $propertyName;
            final /* synthetic */ String $propertyName$inlined;
            final /* synthetic */ BaseCaptureStrategy this$0;
            final /* synthetic */ BaseCaptureStrategy this$0$inline_fun;
            private final AtomicReference<SentryReplayEvent.ReplayType> value;

            /* renamed from: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomic$default$3$2, reason: invalid class name */
            public static final class AnonymousClass2 extends i implements a {
                final /* synthetic */ Object $oldValue;
                final /* synthetic */ String $propertyName;
                final /* synthetic */ String $propertyName$inlined;
                final /* synthetic */ Object $value;
                final /* synthetic */ BaseCaptureStrategy this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(String str, Object obj, Object obj2, BaseCaptureStrategy baseCaptureStrategy, String str2) {
                    super(0);
                    this.$propertyName = str;
                    this.$oldValue = obj;
                    this.$value = obj2;
                    this.this$0 = baseCaptureStrategy;
                    this.$propertyName$inlined = str2;
                }

                @Override // s6.a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m17invoke();
                    return C1116i.f13008a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m17invoke() {
                    Object obj = this.$value;
                    ReplayCache cache = this.this$0.getCache();
                    if (cache != null) {
                        cache.persistSegmentValues$sentry_android_replay_release(this.$propertyName$inlined, String.valueOf(obj));
                    }
                }
            }

            {
                this.this$0$inline_fun = this;
                this.$propertyName = str6;
                this.this$0 = this;
                this.$propertyName$inlined = str6;
                this.value = new AtomicReference<>(obj3);
            }

            private final void runInBackground(final a aVar) {
                SentryOptions sentryOptions2;
                SentryOptions sentryOptions3;
                ScheduledExecutorService persistingExecutor;
                SentryOptions sentryOptions4;
                sentryOptions2 = this.this$0$inline_fun.options;
                if (sentryOptions2.getThreadChecker().isMainThread()) {
                    persistingExecutor = this.this$0$inline_fun.getPersistingExecutor();
                    sentryOptions4 = this.this$0$inline_fun.options;
                    ExecutorsKt.submitSafely(persistingExecutor, sentryOptions4, "CaptureStrategy.runInBackground", new Runnable() { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomic$default$3.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            a.this.invoke();
                        }
                    });
                } else {
                    try {
                        aVar.invoke();
                    } catch (Throwable th) {
                        sentryOptions3 = this.this$0$inline_fun.options;
                        sentryOptions3.getLogger().log(SentryLevel.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
                    }
                }
            }

            @Override // w6.a
            public SentryReplayEvent.ReplayType getValue(Object obj4, d dVar) {
                h.e(dVar, "property");
                return this.value.get();
            }

            @Override // w6.b
            public void setValue(Object obj4, d dVar, SentryReplayEvent.ReplayType replayType) {
                h.e(dVar, "property");
                SentryReplayEvent.ReplayType andSet = this.value.getAndSet(replayType);
                if (h.a(andSet, replayType)) {
                    return;
                }
                runInBackground(new AnonymousClass2(this.$propertyName, andSet, replayType, this.this$0, this.$propertyName$inlined));
            }
        };
        this.currentEvents = new ConcurrentLinkedDeque();
    }

    public static /* synthetic */ CaptureStrategy.ReplaySegment createSegmentInternal$default(BaseCaptureStrategy baseCaptureStrategy, long j, Date date, SentryId sentryId, int i7, int i8, int i9, int i10, int i11, SentryReplayEvent.ReplayType replayType, ReplayCache replayCache, String str, List list, Deque deque, int i12, Object obj) {
        if (obj == null) {
            return baseCaptureStrategy.createSegmentInternal(j, date, sentryId, i7, i8, i9, i10, i11, (i12 & 256) != 0 ? baseCaptureStrategy.getReplayType() : replayType, (i12 & 512) != 0 ? baseCaptureStrategy.cache : replayCache, (i12 & 1024) != 0 ? baseCaptureStrategy.getScreenAtStart() : str, (i12 & 2048) != 0 ? null : list, (i12 & 4096) != 0 ? baseCaptureStrategy.currentEvents : deque);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createSegmentInternal");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ScheduledExecutorService getPersistingExecutor() {
        Object value = this.persistingExecutor$delegate.getValue();
        h.d(value, "<get-persistingExecutor>(...)");
        return (ScheduledExecutorService) value;
    }

    private final <T> b persistableAtomic(T t7, String str, o oVar) {
        return new BaseCaptureStrategy$persistableAtomicNullable$2(t7, this, oVar, str);
    }

    public static /* synthetic */ b persistableAtomic$default(BaseCaptureStrategy baseCaptureStrategy, Object obj, String str, o oVar, int i7, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: persistableAtomic");
        }
        if ((i7 & 1) != 0) {
            obj = null;
        }
        if ((i7 & 4) != 0) {
            oVar = new BaseCaptureStrategy$persistableAtomic$1(baseCaptureStrategy, str);
        }
        return new BaseCaptureStrategy$persistableAtomicNullable$2(obj, baseCaptureStrategy, oVar, str);
    }

    private final <T> b persistableAtomicNullable(T t7, String str, o oVar) {
        return new BaseCaptureStrategy$persistableAtomicNullable$2(t7, this, oVar, str);
    }

    public static /* synthetic */ b persistableAtomicNullable$default(BaseCaptureStrategy baseCaptureStrategy, Object obj, String str, o oVar, int i7, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: persistableAtomicNullable");
        }
        if ((i7 & 1) != 0) {
            obj = null;
        }
        if ((i7 & 4) != 0) {
            oVar = new BaseCaptureStrategy$persistableAtomicNullable$1(baseCaptureStrategy, str);
        }
        return new BaseCaptureStrategy$persistableAtomicNullable$2(obj, baseCaptureStrategy, oVar, str);
    }

    public final CaptureStrategy.ReplaySegment createSegmentInternal(long j, Date date, SentryId sentryId, int i7, int i8, int i9, int i10, int i11, SentryReplayEvent.ReplayType replayType, ReplayCache replayCache, String str, List<Breadcrumb> list, Deque<RRWebEvent> deque) {
        h.e(date, "currentSegmentTimestamp");
        h.e(sentryId, "replayId");
        h.e(replayType, "replayType");
        h.e(deque, "events");
        return CaptureStrategy.Companion.createSegment(this.scopes, this.options, j, date, sentryId, i7, i8, i9, replayType, replayCache, i10, i11, str, list, deque);
    }

    public final ReplayCache getCache() {
        return this.cache;
    }

    public final Deque<RRWebEvent> getCurrentEvents() {
        return this.currentEvents;
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public SentryId getCurrentReplayId() {
        return (SentryId) this.currentReplayId$delegate.getValue(this, $$delegatedProperties[3]);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public int getCurrentSegment() {
        return ((Number) this.currentSegment$delegate.getValue(this, $$delegatedProperties[4])).intValue();
    }

    public final ScreenshotRecorderConfig getRecorderConfig() {
        return (ScreenshotRecorderConfig) this.recorderConfig$delegate.getValue(this, $$delegatedProperties[0]);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public File getReplayCacheDir() {
        ReplayCache replayCache = this.cache;
        if (replayCache != null) {
            return replayCache.getReplayCacheDir$sentry_android_replay_release();
        }
        return null;
    }

    public final ScheduledExecutorService getReplayExecutor() {
        return this.replayExecutor;
    }

    public final AtomicLong getReplayStartTimestamp() {
        return this.replayStartTimestamp;
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public SentryReplayEvent.ReplayType getReplayType() {
        return (SentryReplayEvent.ReplayType) this.replayType$delegate.getValue(this, $$delegatedProperties[5]);
    }

    public final String getScreenAtStart() {
        return (String) this.screenAtStart$delegate.getValue(this, $$delegatedProperties[2]);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public Date getSegmentTimestamp() {
        return (Date) this.segmentTimestamp$delegate.getValue(this, $$delegatedProperties[1]);
    }

    public final AtomicBoolean isTerminating() {
        return this.isTerminating;
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void onConfigurationChanged(ScreenshotRecorderConfig screenshotRecorderConfig) {
        h.e(screenshotRecorderConfig, "recorderConfig");
        setRecorderConfig(screenshotRecorderConfig);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void onScreenChanged(String str) {
        CaptureStrategy.DefaultImpls.onScreenChanged(this, str);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void onTouchEvent(MotionEvent motionEvent) {
        List<RRWebIncrementalSnapshotEvent> convert;
        h.e(motionEvent, "event");
        ScreenshotRecorderConfig recorderConfig = getRecorderConfig();
        if (recorderConfig == null || (convert = this.gestureConverter.convert(motionEvent, recorderConfig)) == null) {
            return;
        }
        AbstractC1165n.O0(this.currentEvents, convert);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void pause() {
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void resume() {
        setSegmentTimestamp(DateUtils.getCurrentDateTime());
    }

    public final void setCache(ReplayCache replayCache) {
        this.cache = replayCache;
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void setCurrentReplayId(SentryId sentryId) {
        h.e(sentryId, "<set-?>");
        this.currentReplayId$delegate.setValue(this, $$delegatedProperties[3], sentryId);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void setCurrentSegment(int i7) {
        this.currentSegment$delegate.setValue(this, $$delegatedProperties[4], Integer.valueOf(i7));
    }

    public final void setRecorderConfig(ScreenshotRecorderConfig screenshotRecorderConfig) {
        this.recorderConfig$delegate.setValue(this, $$delegatedProperties[0], screenshotRecorderConfig);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void setReplayType(SentryReplayEvent.ReplayType replayType) {
        h.e(replayType, "<set-?>");
        this.replayType$delegate.setValue(this, $$delegatedProperties[5], replayType);
    }

    public final void setScreenAtStart(String str) {
        this.screenAtStart$delegate.setValue(this, $$delegatedProperties[2], str);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void setSegmentTimestamp(Date date) {
        this.segmentTimestamp$delegate.setValue(this, $$delegatedProperties[1], date);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void start(int i7, SentryId sentryId, SentryReplayEvent.ReplayType replayType) {
        ReplayCache replayCache;
        h.e(sentryId, "replayId");
        Function1 function1 = this.replayCacheProvider;
        if (function1 == null || (replayCache = (ReplayCache) function1.invoke(sentryId)) == null) {
            replayCache = new ReplayCache(this.options, sentryId);
        }
        this.cache = replayCache;
        setCurrentReplayId(sentryId);
        setCurrentSegment(i7);
        if (replayType == null) {
            replayType = this instanceof SessionCaptureStrategy ? SentryReplayEvent.ReplayType.SESSION : SentryReplayEvent.ReplayType.BUFFER;
        }
        setReplayType(replayType);
        setSegmentTimestamp(DateUtils.getCurrentDateTime());
        this.replayStartTimestamp.set(this.dateProvider.getCurrentTimeMillis());
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void stop() {
        ReplayCache replayCache = this.cache;
        if (replayCache != null) {
            replayCache.close();
        }
        this.replayStartTimestamp.set(0L);
        setSegmentTimestamp(null);
        SentryId sentryId = SentryId.EMPTY_ID;
        h.d(sentryId, "EMPTY_ID");
        setCurrentReplayId(sentryId);
    }

    public /* synthetic */ BaseCaptureStrategy(SentryOptions sentryOptions, IScopes iScopes, ICurrentDateProvider iCurrentDateProvider, ScheduledExecutorService scheduledExecutorService, Function1 function1, int i7, e eVar) {
        this(sentryOptions, iScopes, iCurrentDateProvider, scheduledExecutorService, (i7 & 16) != 0 ? null : function1);
    }
}
