package com.paypal.oslo.feature.savings.analytics;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u001a'\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\n\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"", "screenId", "", "Lcom/paypal/oslo/core/telemetry/analytics/context/AnalyticsContext;", "domainContexts", "", "trackSavingsScreen", "(Ljava/lang/String;Ljava/util/List;)V", "errorCode", "errorType", "trackSavingsErrorScreen", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SavingsScreenTrackerKt {
    public static /* synthetic */ void trackSavingsScreen$default(java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            list = kotlin.collections.CollectionsKt.emptyList();
        }
        trackSavingsScreen(str, list);
    }

    public static final void trackSavingsScreen(java.lang.String str, java.util.List<? extends com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ScreenAppeared(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen(str), null, null, null, 14, null), new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext("savings", "savings", "view"), new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.NavigationContext("state_change", null, null), null, list, 8, null).track(com.paypal.oslo.feature.savings.AnalyticsTrackerKt.analyticsTracker);
    }

    public static final void trackSavingsErrorScreen(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        trackSavingsScreen(str, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext(str2, str2, str3, "api_call")));
    }
}
