package com.paypal.oslo.feature.subscriptions.analytics.subscriptions;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/analytics/subscriptions/MeSubscriptionsInfoScreenAnalytics;", "Lcom/paypal/oslo/feature/subscriptions/analytics/shared/CommonScreenAnalytics;", "<init>", "()V", "Lcom/paypal/oslo/feature/subscriptions/api/analytics/SubscriptionsUserIntentContext$Hub;", "subscriptionUserIntent", "Lcom/paypal/oslo/feature/subscriptions/api/analytics/SubscriptionsUserIntentContext$Hub;", "getSubscriptionUserIntent", "()Lcom/paypal/oslo/feature/subscriptions/api/analytics/SubscriptionsUserIntentContext$Hub;", "Lcom/paypal/oslo/feature/subscriptions/analytics/subscriptions/MeSubscriptionsInfoScreenAnalytics$InfoContentModule;", "infoContentModule", "Lcom/paypal/oslo/feature/subscriptions/analytics/subscriptions/MeSubscriptionsInfoScreenAnalytics$InfoContentModule;", "getInfoContentModule", "()Lcom/paypal/oslo/feature/subscriptions/analytics/subscriptions/MeSubscriptionsInfoScreenAnalytics$InfoContentModule;", "InfoContentModule"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MeSubscriptionsInfoScreenAnalytics extends com.paypal.oslo.feature.subscriptions.analytics.shared.CommonScreenAnalytics {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.subscriptions.analytics.subscriptions.MeSubscriptionsInfoScreenAnalytics.InfoContentModule infoContentModule;
    private final com.paypal.oslo.feature.subscriptions.api.analytics.SubscriptionsUserIntentContext.Hub subscriptionUserIntent;

    public MeSubscriptionsInfoScreenAnalytics() {
        super(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Subscription.INSTANCE);
        this.subscriptionUserIntent = new com.paypal.oslo.feature.subscriptions.api.analytics.SubscriptionsUserIntentContext.Hub(com.paypal.oslo.feature.subscriptions.api.analytics.AnalyticsScreenNames.SUBSCRIPTIONS_HUB_INFO, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Subscription.INSTANCE);
        this.infoContentModule = new com.paypal.oslo.feature.subscriptions.analytics.subscriptions.MeSubscriptionsInfoScreenAnalytics.InfoContentModule(getSubscriptionUserIntent());
    }

    @Override // com.paypal.oslo.feature.subscriptions.analytics.shared.CommonScreenAnalytics
    public final com.paypal.oslo.feature.subscriptions.api.analytics.SubscriptionsUserIntentContext.Hub getSubscriptionUserIntent() {
        return this.subscriptionUserIntent;
    }

    public final com.paypal.oslo.feature.subscriptions.analytics.subscriptions.MeSubscriptionsInfoScreenAnalytics.InfoContentModule getInfoContentModule() {
        return this.infoContentModule;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/analytics/subscriptions/MeSubscriptionsInfoScreenAnalytics$InfoContentModule;", "Lcom/paypal/oslo/feature/subscriptions/analytics/shared/SubscriptionsAnalyticsModule;", "Lcom/paypal/oslo/feature/subscriptions/api/analytics/SubscriptionsUserIntentContext;", "intent", "<init>", "(Lcom/paypal/oslo/feature/subscriptions/api/analytics/SubscriptionsUserIntentContext;)V", "Lcom/paypal/oslo/feature/subscriptions/analytics/shared/ItemAnalytics;", "closeButton", "()Lcom/paypal/oslo/feature/subscriptions/analytics/shared/ItemAnalytics;", "linkedBusinessLink", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class InfoContentModule extends com.paypal.oslo.feature.subscriptions.analytics.shared.SubscriptionsAnalyticsModule {
        public static final java.lang.String NAME = "subscriptions_info_details";
        public static final java.lang.String SHOWN_ACTION = "view_subscriptions_info";
        public static final int $stable = 8;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InfoContentModule(com.paypal.oslo.feature.subscriptions.api.analytics.SubscriptionsUserIntentContext subscriptionsUserIntentContext) {
            super("view_subscriptions_info", NAME, subscriptionsUserIntentContext);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subscriptionsUserIntentContext, "");
        }

        public final com.paypal.oslo.feature.subscriptions.analytics.shared.ItemAnalytics closeButton() {
            return new com.paypal.oslo.feature.subscriptions.analytics.shared.ItemAnalytics(getSubscriptionUserIntent().withAction("dismiss"), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("close_button", 0, 2, null), null, 4, null);
        }

        public final com.paypal.oslo.feature.subscriptions.analytics.shared.ItemAnalytics linkedBusinessLink() {
            return new com.paypal.oslo.feature.subscriptions.analytics.shared.ItemAnalytics(getSubscriptionUserIntent().withAction("view_linked_businesses"), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("linked_business_link", 0, 2, null), null, 4, null);
        }
    }
}
