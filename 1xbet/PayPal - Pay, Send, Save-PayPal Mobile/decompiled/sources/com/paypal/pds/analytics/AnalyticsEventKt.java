package com.paypal.pds.analytics;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a'\u0010\t\u001a\u00020\b*\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\u000e\u001a\u00020\r*\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a#\u0010\u0015\u001a\u00020\u0014*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/pds/analytics/AnalyticsEventScope;", "Lcom/paypal/pds/analytics/AnalyticsEvent$Click;", com.paypal.oslo.feature.merchantbanking.api.analytics.MerchantBankingAnalytics.AccountNumbersScreen.NAVIGATION_TYPE, "(Lcom/paypal/pds/analytics/AnalyticsEventScope;)Lcom/paypal/pds/analytics/AnalyticsEvent$Click;", "Lcom/paypal/pds/analytics/AnalyticsChainHolder;", "kidChain", "Lcom/paypal/pds/analytics/AnalyticsLeafState;", "kidState", "Lcom/paypal/pds/analytics/AnalyticsEvent$Show;", "show", "(Lcom/paypal/pds/analytics/AnalyticsEventScope;Lcom/paypal/pds/analytics/AnalyticsChainHolder;Lcom/paypal/pds/analytics/AnalyticsLeafState;)Lcom/paypal/pds/analytics/AnalyticsEvent$Show;", "", "dwellTime", "Lcom/paypal/pds/analytics/AnalyticsEvent$Hide;", "hide", "(Lcom/paypal/pds/analytics/AnalyticsEventScope;J)Lcom/paypal/pds/analytics/AnalyticsEvent$Hide;", "", "key", "", "initialValue", "Lcom/paypal/pds/analytics/AnalyticsEvent$Condition;", "condition", "(Lcom/paypal/pds/analytics/AnalyticsEventScope;Ljava/lang/String;Z)Lcom/paypal/pds/analytics/AnalyticsEvent$Condition;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class AnalyticsEventKt {
    public static final com.paypal.pds.analytics.AnalyticsEvent.Click click(com.paypal.pds.analytics.AnalyticsEventScope analyticsEventScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsEventScope, "");
        return new com.paypal.pds.analytics.AnalyticsEvent.Click(analyticsEventScope.getTimestamp(), analyticsEventScope.getChain());
    }

    public static final com.paypal.pds.analytics.AnalyticsEvent.Show show(com.paypal.pds.analytics.AnalyticsEventScope analyticsEventScope, com.paypal.pds.analytics.AnalyticsChainHolder analyticsChainHolder, com.paypal.pds.analytics.AnalyticsLeafState analyticsLeafState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsEventScope, "");
        return new com.paypal.pds.analytics.AnalyticsEvent.Show(analyticsChainHolder, analyticsLeafState, analyticsEventScope.getTimestamp(), analyticsEventScope.getChain());
    }

    public static final com.paypal.pds.analytics.AnalyticsEvent.Hide hide(com.paypal.pds.analytics.AnalyticsEventScope analyticsEventScope, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsEventScope, "");
        return new com.paypal.pds.analytics.AnalyticsEvent.Hide(j, analyticsEventScope.getTimestamp(), analyticsEventScope.getChain());
    }

    public static final com.paypal.pds.analytics.AnalyticsEvent.Condition condition(com.paypal.pds.analytics.AnalyticsEventScope analyticsEventScope, java.lang.String str, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsEventScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return new com.paypal.pds.analytics.AnalyticsEvent.Condition(str, z, analyticsEventScope.getTimestamp(), analyticsEventScope.getChain());
    }
}
