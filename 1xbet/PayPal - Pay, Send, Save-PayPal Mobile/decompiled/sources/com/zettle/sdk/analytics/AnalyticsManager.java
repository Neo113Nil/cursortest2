package com.zettle.sdk.analytics;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u00122\u00020\u0001:\u0002\u0012\u0013J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/zettle/sdk/analytics/AnalyticsManager;", "", "", "tag", "Lorg/json/JSONObject;", "json", "Lcom/zettle/sdk/analytics/Scheduler;", "scheduler", "", "dispatch", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/zettle/sdk/analytics/Scheduler;)V", "startDispatching", "()V", "Lcom/zettle/sdk/commons/state/State;", "Lcom/zettle/sdk/analytics/AnalyticsManager$State;", "getState", "()Lcom/zettle/sdk/commons/state/State;", "state", "Companion", "State"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface AnalyticsManager {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.analytics.AnalyticsManager.Companion INSTANCE = com.zettle.sdk.analytics.AnalyticsManager.Companion.getHighSpeedVideoFpsRanges;

    void dispatch(java.lang.String tag, org.json.JSONObject json, com.zettle.sdk.analytics.Scheduler scheduler);

    com.zettle.sdk.commons.state.State<com.zettle.sdk.analytics.AnalyticsManager.State> getState();

    void startDispatching();

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/zettle/sdk/analytics/AnalyticsManager$State;", "", "<init>", "()V", com.paypal.oslo.feature.consumerprivacy.ui.util.UiConstants.STATE_READY, "Working", "Lcom/zettle/sdk/analytics/AnalyticsManager$State$Ready;", "Lcom/zettle/sdk/analytics/AnalyticsManager$State$Working;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class State {

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/zettle/sdk/analytics/AnalyticsManager$State$Ready;", "Lcom/zettle/sdk/analytics/AnalyticsManager$State;", "<init>", "()V", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Ready extends com.zettle.sdk.analytics.AnalyticsManager.State {
            public static final com.zettle.sdk.analytics.AnalyticsManager.State.Ready INSTANCE = new com.zettle.sdk.analytics.AnalyticsManager.State.Ready();

            private Ready() {
                super(null);
            }

            public final java.lang.String toString() {
                return com.paypal.oslo.feature.consumerprivacy.ui.util.UiConstants.STATE_READY;
            }
        }

        private State() {
        }

        @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\u0012\u001e\u0010\u0007\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00030\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR/\u0010\u0007\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/zettle/sdk/analytics/AnalyticsManager$State$Working;", "Lcom/zettle/sdk/analytics/AnalyticsManager$State;", "", "Lkotlin/Pair;", "Lcom/zettle/sdk/analytics/Dispatcher;", "Lcom/zettle/sdk/commons/state/StateObserver;", "Lcom/zettle/sdk/analytics/Dispatcher$State;", "observers", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getObservers", "()Ljava/util/List;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Working extends com.zettle.sdk.analytics.AnalyticsManager.State {
            private final java.util.List<kotlin.Pair<com.zettle.sdk.analytics.Dispatcher, com.zettle.sdk.commons.state.StateObserver<com.zettle.sdk.analytics.Dispatcher.State>>> observers;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public Working(java.util.List<? extends kotlin.Pair<? extends com.zettle.sdk.analytics.Dispatcher, ? extends com.zettle.sdk.commons.state.StateObserver<com.zettle.sdk.analytics.Dispatcher.State>>> list) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
                this.observers = list;
            }

            public final java.util.List<kotlin.Pair<com.zettle.sdk.analytics.Dispatcher, com.zettle.sdk.commons.state.StateObserver<com.zettle.sdk.analytics.Dispatcher.State>>> getObservers() {
                return this.observers;
            }

            public final java.lang.String toString() {
                return "Working";
            }
        }

        public /* synthetic */ State(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0018\u0010\r\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/zettle/sdk/analytics/AnalyticsManager$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "isDebug", "Lcom/zettle/sdk/analytics/AnalyticsManager;", "getInstance", "(Landroid/content/Context;Z)Lcom/zettle/sdk/analytics/AnalyticsManager;", "getHighSpeedVideoSizes", "Lcom/zettle/sdk/analytics/AnalyticsManager;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.zettle.sdk.analytics.AnalyticsManager.Companion getHighSpeedVideoFpsRanges = new com.zettle.sdk.analytics.AnalyticsManager.Companion();

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private static volatile com.zettle.sdk.analytics.AnalyticsManager getHighResolutionOutputSizeshNQ4ISI;

        private Companion() {
        }

        public static /* synthetic */ com.zettle.sdk.analytics.AnalyticsManager getInstance$default(com.zettle.sdk.analytics.AnalyticsManager.Companion companion, android.content.Context context, boolean z, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return companion.getInstance(context, z);
        }

        public final com.zettle.sdk.analytics.AnalyticsManager getInstance(android.content.Context context, boolean isDebug) {
            com.zettle.sdk.analytics.AnalyticsManagerImpl analyticsManagerImpl;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            com.zettle.sdk.analytics.AnalyticsManager analyticsManager = getHighResolutionOutputSizeshNQ4ISI;
            if (analyticsManager != null) {
                return analyticsManager;
            }
            synchronized (this) {
                analyticsManagerImpl = getHighResolutionOutputSizeshNQ4ISI;
                if (analyticsManagerImpl == null) {
                    com.zettle.sdk.analytics.AnalyticsClient create = com.zettle.sdk.analytics.HerdAnalyticsClient.INSTANCE.create(isDebug);
                    com.zettle.sdk.analytics.AnalyticsClient create2 = com.zettle.sdk.analytics.GdpAnalyticsClient.INSTANCE.create(isDebug);
                    com.zettle.sdk.analytics.AnalyticsManagerImpl analyticsManagerImpl2 = new com.zettle.sdk.analytics.AnalyticsManagerImpl(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.zettle.sdk.analytics.AnalyticsClient[]{create, create2}), com.zettle.sdk.analytics.EventStorage.INSTANCE.create(context), com.zettle.sdk.analytics.AnalyticsKt.getAnalyticsLoop(com.zettle.sdk.commons.thread.EventsLoop.INSTANCE));
                    getHighResolutionOutputSizeshNQ4ISI = analyticsManagerImpl2;
                    analyticsManagerImpl = analyticsManagerImpl2;
                }
            }
            return analyticsManagerImpl;
        }
    }
}
