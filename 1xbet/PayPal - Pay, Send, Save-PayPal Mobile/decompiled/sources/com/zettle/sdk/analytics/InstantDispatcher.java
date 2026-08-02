package com.zettle.sdk.analytics;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0002\u0013\u0012B\u001f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0015\u0010\u000f\u001a\u00020\f8CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/zettle/sdk/analytics/InstantDispatcher;", "Lcom/zettle/sdk/analytics/Scheduler;", "Lcom/zettle/sdk/commons/thread/EventsLoop;", "eventsLoop", "Lkotlin/Function0;", "Lcom/zettle/sdk/analytics/AnalyticsManager;", "provideManager", "<init>", "(Lcom/zettle/sdk/commons/thread/EventsLoop;Lkotlin/jvm/functions/Function0;)V", "", "schedule", "()V", "Lcom/zettle/sdk/analytics/InstantDispatcher$AnalyticsManagerStateObserver;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/Lazy;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "Lkotlin/jvm/functions/Function0;", "Companion", "AnalyticsManagerStateObserver"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class InstantDispatcher implements com.zettle.sdk.analytics.Scheduler {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.analytics.InstantDispatcher.Companion INSTANCE = new com.zettle.sdk.analytics.InstantDispatcher.Companion(null);

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.Lazy getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<com.zettle.sdk.analytics.AnalyticsManager> getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: Multi-variable type inference failed */
    public InstantDispatcher(final com.zettle.sdk.commons.thread.EventsLoop eventsLoop, kotlin.jvm.functions.Function0<? extends com.zettle.sdk.analytics.AnalyticsManager> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventsLoop, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        this.getHighResolutionOutputSizeshNQ4ISI = function0;
        this.getHighSpeedVideoSizes = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.zettle.sdk.analytics.InstantDispatcher.AnalyticsManagerStateObserver>() { // from class: com.zettle.sdk.analytics.InstantDispatcher$observer$2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
            public final com.zettle.sdk.analytics.InstantDispatcher.AnalyticsManagerStateObserver invoke() {
                kotlin.jvm.functions.Function0 function02;
                function02 = com.zettle.sdk.analytics.InstantDispatcher.this.getHighResolutionOutputSizeshNQ4ISI;
                return new com.zettle.sdk.analytics.InstantDispatcher.AnalyticsManagerStateObserver((com.zettle.sdk.analytics.AnalyticsManager) function02.invoke(), eventsLoop);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    public /* synthetic */ InstantDispatcher(com.zettle.sdk.commons.thread.EventsLoop eventsLoop, kotlin.jvm.functions.Function0 function0, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.zettle.sdk.analytics.AnalyticsKt.getAnalyticsLoop(com.zettle.sdk.commons.thread.EventsLoop.INSTANCE) : eventsLoop, function0);
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\t\u001a\u00020\b8\u0007@\u0007X\u0086\f¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/zettle/sdk/analytics/InstantDispatcher$AnalyticsManagerStateObserver;", "", "Lcom/zettle/sdk/analytics/AnalyticsManager;", "p0", "Lcom/zettle/sdk/commons/thread/EventsLoop;", "p1", "<init>", "(Lcom/zettle/sdk/analytics/AnalyticsManager;Lcom/zettle/sdk/commons/thread/EventsLoop;)V", "", "getHighResolutionOutputSizeshNQ4ISI", "Z", "Lcom/zettle/sdk/commons/state/StateObserver;", "Lcom/zettle/sdk/analytics/AnalyticsManager$State;", "Camera2StreamConfigurationMap", "Lcom/zettle/sdk/commons/state/StateObserver;", "getHighSpeedVideoSizes"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class AnalyticsManagerStateObserver {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private final com.zettle.sdk.commons.state.StateObserver<com.zettle.sdk.analytics.AnalyticsManager.State> getHighSpeedVideoSizes;
        boolean getHighResolutionOutputSizeshNQ4ISI;

        public AnalyticsManagerStateObserver(com.zettle.sdk.analytics.AnalyticsManager analyticsManager, com.zettle.sdk.commons.thread.EventsLoop eventsLoop) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsManager, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventsLoop, "");
            com.zettle.sdk.commons.state.StateObserver<com.zettle.sdk.analytics.AnalyticsManager.State> stateObserver = new com.zettle.sdk.commons.state.StateObserver<com.zettle.sdk.analytics.AnalyticsManager.State>() { // from class: com.zettle.sdk.analytics.InstantDispatcher$AnalyticsManagerStateObserver$special$$inlined$stateObserver$1
                @Override // com.zettle.sdk.commons.state.StateObserver
                public final void onNext(com.zettle.sdk.analytics.AnalyticsManager.State state) {
                    com.zettle.sdk.analytics.InstantDispatcher.AnalyticsManagerStateObserver.this.getHighResolutionOutputSizeshNQ4ISI = state instanceof com.zettle.sdk.analytics.AnalyticsManager.State.Working;
                }
            };
            this.getHighSpeedVideoSizes = stateObserver;
            analyticsManager.getState().addObserver(stateObserver, eventsLoop);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/analytics/InstantDispatcher$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/zettle/sdk/analytics/InstantDispatcher;", "create", "(Landroid/content/Context;)Lcom/zettle/sdk/analytics/InstantDispatcher;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final com.zettle.sdk.analytics.InstantDispatcher create(final android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            return new com.zettle.sdk.analytics.InstantDispatcher(null, new kotlin.jvm.functions.Function0<com.zettle.sdk.analytics.AnalyticsManager>() { // from class: com.zettle.sdk.analytics.InstantDispatcher$Companion$create$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                public final com.zettle.sdk.analytics.AnalyticsManager invoke() {
                    return com.zettle.sdk.analytics.AnalyticsManager.Companion.getInstance$default(com.zettle.sdk.analytics.AnalyticsManager.INSTANCE, context, false, 2, null);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, 1, 0 == true ? 1 : 0);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.zettle.sdk.analytics.Scheduler
    public final void schedule() {
        if (((com.zettle.sdk.analytics.InstantDispatcher.AnalyticsManagerStateObserver) this.getHighSpeedVideoSizes.getValue()).getHighResolutionOutputSizeshNQ4ISI) {
            return;
        }
        this.getHighResolutionOutputSizeshNQ4ISI.invoke().startDispatching();
    }
}
