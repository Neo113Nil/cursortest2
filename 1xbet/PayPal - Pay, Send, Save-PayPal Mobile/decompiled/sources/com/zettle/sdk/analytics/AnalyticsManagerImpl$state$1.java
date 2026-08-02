package com.zettle.sdk.analytics;

@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
final /* synthetic */ class AnalyticsManagerImpl$state$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function2<com.zettle.sdk.analytics.AnalyticsManager.State, com.zettle.sdk.analytics.AnalyticsManager.State, kotlin.Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ kotlin.Unit invoke(com.zettle.sdk.analytics.AnalyticsManager.State state, com.zettle.sdk.analytics.AnalyticsManager.State state2) {
        com.zettle.sdk.analytics.AnalyticsManager.State state3 = state;
        com.zettle.sdk.analytics.AnalyticsManager.State state4 = state2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state4, "");
        ((com.zettle.sdk.analytics.AnalyticsManagerImpl) this.receiver).mutate$core_publicRelease(state3, state4);
        return kotlin.Unit.INSTANCE;
    }

    AnalyticsManagerImpl$state$1(java.lang.Object obj) {
        super(2, obj, com.zettle.sdk.analytics.AnalyticsManagerImpl.class, "mutate", "mutate$core_publicRelease(Lcom/zettle/sdk/analytics/AnalyticsManager$State;Lcom/zettle/sdk/analytics/AnalyticsManager$State;)V", 0);
    }
}
