package com.zettle.sdk.analytics;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "getHighSpeedVideoFpsRanges", "()V"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
final class AnalyticsManagerImpl$action$1 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<kotlin.Unit> {
    final /* synthetic */ com.zettle.sdk.analytics.AnalyticsManagerImpl.Action $getHighSpeedVideoSizes;
    final /* synthetic */ com.zettle.sdk.analytics.AnalyticsManagerImpl getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ kotlin.Unit invoke() {
        getHighSpeedVideoFpsRanges();
        return kotlin.Unit.INSTANCE;
    }

    public final void getHighSpeedVideoFpsRanges() {
        com.zettle.sdk.commons.state.MutableState<com.zettle.sdk.analytics.AnalyticsManager.State> state = this.getHighSpeedVideoFpsRangesFor.getState();
        final com.zettle.sdk.analytics.AnalyticsManagerImpl analyticsManagerImpl = this.getHighSpeedVideoFpsRangesFor;
        final com.zettle.sdk.analytics.AnalyticsManagerImpl.Action action = this.$getHighSpeedVideoSizes;
        state.update(new kotlin.jvm.functions.Function1<com.zettle.sdk.analytics.AnalyticsManager.State, com.zettle.sdk.analytics.AnalyticsManager.State>() { // from class: com.zettle.sdk.analytics.AnalyticsManagerImpl$action$1.1
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
            public final com.zettle.sdk.analytics.AnalyticsManager.State invoke(com.zettle.sdk.analytics.AnalyticsManager.State state2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state2, "");
                com.zettle.sdk.analytics.AnalyticsManager.State reduce$core_publicRelease = com.zettle.sdk.analytics.AnalyticsManagerImpl.this.reduce$core_publicRelease(state2, action);
                com.zettle.sdk.analytics.AnalyticsManagerImpl.Action action2 = action;
                com.zettle.sdk.commons.util.Log analytics = com.zettle.sdk.analytics.AnalyticsKt.getAnalytics(com.zettle.sdk.commons.util.Log.INSTANCE);
                java.lang.StringBuilder sb = new java.lang.StringBuilder("State: ");
                sb.append(state2);
                sb.append(" -> ");
                sb.append(reduce$core_publicRelease);
                sb.append(". Action: ");
                sb.append(action2);
                com.zettle.sdk.commons.util.Log.DefaultImpls.d$default(analytics, sb.toString(), null, 2, null);
                return reduce$core_publicRelease;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AnalyticsManagerImpl$action$1(com.zettle.sdk.analytics.AnalyticsManagerImpl analyticsManagerImpl, com.zettle.sdk.analytics.AnalyticsManagerImpl.Action action) {
        super(0);
        this.getHighSpeedVideoFpsRangesFor = analyticsManagerImpl;
        this.$getHighSpeedVideoSizes = action;
    }
}
