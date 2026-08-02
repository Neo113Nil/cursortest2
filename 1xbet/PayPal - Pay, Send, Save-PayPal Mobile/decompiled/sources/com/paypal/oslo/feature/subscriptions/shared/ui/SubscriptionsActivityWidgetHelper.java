package com.paypal.oslo.feature.subscriptions.shared.ui;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/shared/ui/SubscriptionsActivityWidgetHelper;", "", "Lcom/paypal/oslo/feature/activity/api/provider/IActivityWidgetProvider;", "activityWidgetProvider", "<init>", "(Lcom/paypal/oslo/feature/activity/api/provider/IActivityWidgetProvider;)V", "", "agreementId", "Lcom/paypal/oslo/feature/activity/api/widget/IActivityWidget;", "createActivityWidgetForSubscriptionDetails", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/activity/api/widget/IActivityWidget;", "Lcom/paypal/oslo/feature/activity/api/provider/IActivityWidgetProvider;", "getActivityWidgetProvider", "()Lcom/paypal/oslo/feature/activity/api/provider/IActivityWidgetProvider;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SubscriptionsActivityWidgetHelper {
    private final com.paypal.oslo.feature.activity.api.provider.IActivityWidgetProvider activityWidgetProvider;
    public static final int $stable = 8;

    @javax.inject.Inject
    public SubscriptionsActivityWidgetHelper(com.paypal.oslo.feature.activity.api.provider.IActivityWidgetProvider iActivityWidgetProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iActivityWidgetProvider, "");
        this.activityWidgetProvider = iActivityWidgetProvider;
    }

    public final com.paypal.oslo.feature.activity.api.provider.IActivityWidgetProvider getActivityWidgetProvider() {
        return this.activityWidgetProvider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.paypal.oslo.feature.activity.api.widget.IActivityWidget createActivityWidgetForSubscriptionDetails(java.lang.String agreementId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementId, "");
        java.util.Date date = new java.util.Date();
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(1, -3);
        java.util.Date time = calendar.getTime();
        return this.activityWidgetProvider.createWidget(new com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetConfiguration.Builder("SubscriptionDetailsActivityWidget").setUiConfig(new com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetUIConfig(false, null, true, com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetViewType.WIDGET_WITH_SINGLE_COUNTER_PARTY, false, 19, null)).setWidgetTxnFetchCount(3).setFiltersConfig(new com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetFiltersConfig(time, date, (java.lang.String) null, (java.lang.Boolean) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, kotlin.collections.CollectionsKt.listOf(agreementId), (java.util.List) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, (java.lang.String) (0 == true ? 1 : 0), (java.util.List) (0 == true ? 1 : 0), (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.lang.String) null, 16777084, (kotlin.jvm.internal.DefaultConstructorMarker) null)).build());
    }
}
