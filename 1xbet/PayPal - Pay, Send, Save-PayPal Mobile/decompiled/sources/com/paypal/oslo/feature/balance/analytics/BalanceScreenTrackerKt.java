package com.paypal.oslo.feature.balance.analytics;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u001a;\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\f\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\f\u0010\r"}, d2 = {"", "screenId", "action", "feature", "", "Lcom/paypal/oslo/core/telemetry/analytics/context/AnalyticsContext;", "domainContexts", "", "trackBalanceScreen", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "errorCode", "errorType", "trackBalanceErrorScreen", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BalanceScreenTrackerKt {
    public static /* synthetic */ void trackBalanceScreen$default(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = com.paypal.oslo.feature.balance.analytics.BalanceAnalyticsConstants.BalanceHub.ACTION_VIEW;
        }
        if ((i & 4) != 0) {
            str3 = "balance_hub";
        }
        if ((i & 8) != 0) {
            list = kotlin.collections.CollectionsKt.emptyList();
        }
        trackBalanceScreen(str, str2, str3, list);
    }

    public static final void trackBalanceScreen(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List<? extends com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ScreenAppeared(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen(str), null, null, null, 14, null), new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext("balance", str3, str2), new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.NavigationContext("state_change", null, null), null, list, 8, null).track(com.paypal.oslo.feature.balance.AnalyticsTrackerKt.analyticsTracker);
    }

    public static final void trackBalanceErrorScreen(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        trackBalanceScreen$default(str, null, null, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext(str2, str2, str3, "api_call")), 6, null);
    }
}
