package com.zettle.sdk.commons.thread;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\nH&¢\u0006\u0004\b\f\u0010\rJ5\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\nH&¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/zettle/sdk/commons/thread/EventsLoop;", "", "Lkotlinx/coroutines/CoroutineDispatcher;", "asDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "", "tag", "", com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics.ITEM_CANCEL, "(Ljava/lang/String;)V", "Lkotlin/Function0;", "action", "post", "(Lkotlin/jvm/functions/Function0;)V", "", "delay", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "schedule", "(Ljava/lang/String;JLjava/util/concurrent/TimeUnit;Lkotlin/jvm/functions/Function0;)V", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface EventsLoop {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.commons.thread.EventsLoop.Companion INSTANCE = com.zettle.sdk.commons.thread.EventsLoop.Companion.getHighSpeedVideoSizes;

    kotlinx.coroutines.CoroutineDispatcher asDispatcher();

    void cancel(java.lang.String tag);

    void post(kotlin.jvm.functions.Function0<kotlin.Unit> action);

    void schedule(java.lang.String tag, long delay, java.util.concurrent.TimeUnit timeUnit, kotlin.jvm.functions.Function0<kotlin.Unit> action);

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR!\u0010\u000e\u001a\u00020\u00068GX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\b\t\u0010\n\u0012\u0004\b\r\u0010\u0003\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0011\u001a\u00020\u00068GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\f"}, d2 = {"Lcom/zettle/sdk/commons/thread/EventsLoop$Companion;", "", "<init>", "()V", "", "name", "Lcom/zettle/sdk/commons/thread/EventsLoop;", "create", "(Ljava/lang/String;)Lcom/zettle/sdk/commons/thread/EventsLoop;", "background$delegate", "Lkotlin/Lazy;", "getBackground", "()Lcom/zettle/sdk/commons/thread/EventsLoop;", "getBackground$annotations", com.datadog.android.rum.internal.metric.SessionEndedMetric.VIEW_COUNTS_BG_KEY, "main$delegate", "getMain", "main"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.zettle.sdk.commons.thread.EventsLoop.Companion getHighSpeedVideoSizes = new com.zettle.sdk.commons.thread.EventsLoop.Companion();

        /* renamed from: background$delegate, reason: from kotlin metadata */
        private static final kotlin.Lazy<com.zettle.sdk.commons.thread.EventsLoop> background = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.zettle.sdk.commons.thread.EventsLoop>() { // from class: com.zettle.sdk.commons.thread.EventsLoop$Companion$background$2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
            public final com.zettle.sdk.commons.thread.EventsLoop invoke() {
                return com.zettle.sdk.commons.thread.EventsLoop.Companion.getHighSpeedVideoSizes.create(com.datadog.android.rum.internal.metric.SessionEndedMetric.VIEW_COUNTS_BG_KEY);
            }
        });

        /* renamed from: main$delegate, reason: from kotlin metadata */
        private static final kotlin.Lazy<com.zettle.sdk.commons.thread.EventsLoopImpl> main = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.zettle.sdk.commons.thread.EventsLoopImpl>() { // from class: com.zettle.sdk.commons.thread.EventsLoop$Companion$main$2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
            public final com.zettle.sdk.commons.thread.EventsLoopImpl invoke() {
                return com.zettle.sdk.commons.thread.EventsLoop.Companion.access$create(com.zettle.sdk.commons.thread.EventsLoop.Companion.getHighSpeedVideoSizes, new android.os.Handler(android.os.Looper.getMainLooper()));
            }
        });

        public static /* synthetic */ void getBackground$annotations() {
        }

        private Companion() {
        }

        public final com.zettle.sdk.commons.thread.EventsLoop getBackground() {
            return background.getValue();
        }

        public final com.zettle.sdk.commons.thread.EventsLoop getMain() {
            return main.getValue();
        }

        public static final /* synthetic */ com.zettle.sdk.commons.thread.EventsLoopImpl access$create(com.zettle.sdk.commons.thread.EventsLoop.Companion companion, android.os.Handler handler) {
            return new com.zettle.sdk.commons.thread.EventsLoopImpl(com.zettle.sdk.commons.thread.EventsLoop$Companion$create$3.Camera2StreamConfigurationMap, android.os.Build.VERSION.SDK_INT, handler);
        }

        public final com.zettle.sdk.commons.thread.EventsLoop create(java.lang.String name2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            final com.zettle.sdk.commons.thread.EventsLoopImpl eventsLoopImpl = new com.zettle.sdk.commons.thread.EventsLoopImpl(com.zettle.sdk.commons.thread.EventsLoop$Companion$create$3.Camera2StreamConfigurationMap, android.os.Build.VERSION.SDK_INT, null);
            com.zettle.sdk.commons.thread.MonitoredThreads.INSTANCE.handlerThread(name2, new kotlin.jvm.functions.Function1<android.os.Looper, kotlin.Unit>() { // from class: com.zettle.sdk.commons.thread.EventsLoop$Companion$create$1
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ kotlin.Unit invoke(android.os.Looper looper) {
                    getHighSpeedVideoFpsRangesFor(looper);
                    return kotlin.Unit.INSTANCE;
                }

                public final void getHighSpeedVideoFpsRangesFor(android.os.Looper looper) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(looper, "");
                    com.zettle.sdk.commons.thread.EventsLoopImpl.this.initHandler(new android.os.Handler(looper));
                }

                {
                    super(1);
                }
            }).start();
            return eventsLoopImpl;
        }
    }
}
