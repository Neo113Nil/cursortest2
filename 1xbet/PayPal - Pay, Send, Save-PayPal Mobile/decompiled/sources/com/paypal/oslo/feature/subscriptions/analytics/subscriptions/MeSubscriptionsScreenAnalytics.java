package com.paypal.oslo.feature.subscriptions.analytics.subscriptions;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0003\u0018\u0019\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/analytics/subscriptions/MeSubscriptionsScreenAnalytics;", "Lcom/paypal/oslo/feature/subscriptions/analytics/shared/CommonScreenAnalytics;", "<init>", "()V", "Lcom/paypal/oslo/feature/subscriptions/api/analytics/SubscriptionsUserIntentContext$Hub;", "subscriptionUserIntent", "Lcom/paypal/oslo/feature/subscriptions/api/analytics/SubscriptionsUserIntentContext$Hub;", "getSubscriptionUserIntent", "()Lcom/paypal/oslo/feature/subscriptions/api/analytics/SubscriptionsUserIntentContext$Hub;", "Lcom/paypal/oslo/feature/subscriptions/analytics/subscriptions/MeSubscriptionsScreenAnalytics$EmptyStateModule;", "emptyStateModule", "Lcom/paypal/oslo/feature/subscriptions/analytics/subscriptions/MeSubscriptionsScreenAnalytics$EmptyStateModule;", "getEmptyStateModule", "()Lcom/paypal/oslo/feature/subscriptions/analytics/subscriptions/MeSubscriptionsScreenAnalytics$EmptyStateModule;", "Lcom/paypal/oslo/feature/subscriptions/analytics/subscriptions/MeSubscriptionsScreenAnalytics$ErrorStateModule;", "errorStateModule", "Lcom/paypal/oslo/feature/subscriptions/analytics/subscriptions/MeSubscriptionsScreenAnalytics$ErrorStateModule;", "getErrorStateModule", "()Lcom/paypal/oslo/feature/subscriptions/analytics/subscriptions/MeSubscriptionsScreenAnalytics$ErrorStateModule;", "Lcom/paypal/oslo/feature/subscriptions/analytics/subscriptions/MeSubscriptionsScreenAnalytics$LinkedListModule;", "linkedListModule", "Lcom/paypal/oslo/feature/subscriptions/analytics/subscriptions/MeSubscriptionsScreenAnalytics$LinkedListModule;", "getLinkedListModule", "()Lcom/paypal/oslo/feature/subscriptions/analytics/subscriptions/MeSubscriptionsScreenAnalytics$LinkedListModule;", "EmptyStateModule", "ErrorStateModule", "LinkedListModule"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MeSubscriptionsScreenAnalytics extends com.paypal.oslo.feature.subscriptions.analytics.shared.CommonScreenAnalytics {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.subscriptions.analytics.subscriptions.MeSubscriptionsScreenAnalytics.EmptyStateModule emptyStateModule;
    private final com.paypal.oslo.feature.subscriptions.analytics.subscriptions.MeSubscriptionsScreenAnalytics.ErrorStateModule errorStateModule;
    private final com.paypal.oslo.feature.subscriptions.analytics.subscriptions.MeSubscriptionsScreenAnalytics.LinkedListModule linkedListModule;
    private final com.paypal.oslo.feature.subscriptions.api.analytics.SubscriptionsUserIntentContext.Hub subscriptionUserIntent;

    public MeSubscriptionsScreenAnalytics() {
        super(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Subscription.INSTANCE);
        this.subscriptionUserIntent = new com.paypal.oslo.feature.subscriptions.api.analytics.SubscriptionsUserIntentContext.Hub(com.paypal.oslo.feature.subscriptions.api.analytics.AnalyticsScreenNames.SCREEN_ME_SUBSCRIPTIONS, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Subscription.INSTANCE);
        this.emptyStateModule = new com.paypal.oslo.feature.subscriptions.analytics.subscriptions.MeSubscriptionsScreenAnalytics.EmptyStateModule(getSubscriptionUserIntent());
        this.errorStateModule = new com.paypal.oslo.feature.subscriptions.analytics.subscriptions.MeSubscriptionsScreenAnalytics.ErrorStateModule(getSubscriptionUserIntent());
        this.linkedListModule = new com.paypal.oslo.feature.subscriptions.analytics.subscriptions.MeSubscriptionsScreenAnalytics.LinkedListModule(getSubscriptionUserIntent());
    }

    @Override // com.paypal.oslo.feature.subscriptions.analytics.shared.CommonScreenAnalytics
    public final com.paypal.oslo.feature.subscriptions.api.analytics.SubscriptionsUserIntentContext.Hub getSubscriptionUserIntent() {
        return this.subscriptionUserIntent;
    }

    public final com.paypal.oslo.feature.subscriptions.analytics.subscriptions.MeSubscriptionsScreenAnalytics.EmptyStateModule getEmptyStateModule() {
        return this.emptyStateModule;
    }

    public final com.paypal.oslo.feature.subscriptions.analytics.subscriptions.MeSubscriptionsScreenAnalytics.ErrorStateModule getErrorStateModule() {
        return this.errorStateModule;
    }

    public final com.paypal.oslo.feature.subscriptions.analytics.subscriptions.MeSubscriptionsScreenAnalytics.LinkedListModule getLinkedListModule() {
        return this.linkedListModule;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/analytics/subscriptions/MeSubscriptionsScreenAnalytics$EmptyStateModule;", "Lcom/paypal/oslo/feature/subscriptions/analytics/shared/SubscriptionsAnalyticsModule;", "Lcom/paypal/oslo/feature/subscriptions/api/analytics/SubscriptionsUserIntentContext;", "intent", "<init>", "(Lcom/paypal/oslo/feature/subscriptions/api/analytics/SubscriptionsUserIntentContext;)V", "Lcom/paypal/oslo/feature/subscriptions/analytics/shared/ItemAnalytics;", "linkSubscriptionsButton", "()Lcom/paypal/oslo/feature/subscriptions/analytics/shared/ItemAnalytics;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class EmptyStateModule extends com.paypal.oslo.feature.subscriptions.analytics.shared.SubscriptionsAnalyticsModule {
        public static final java.lang.String LINK_SUBSCRIPTIONS_BUTTON = "link_subscriptions_button";
        public static final java.lang.String NAME = "subscriptions_empty_state";
        public static final java.lang.String SHOWN_ACTION = "view_subscriptions";
        public static final int $stable = 8;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EmptyStateModule(com.paypal.oslo.feature.subscriptions.api.analytics.SubscriptionsUserIntentContext subscriptionsUserIntentContext) {
            super("view_subscriptions", NAME, subscriptionsUserIntentContext);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subscriptionsUserIntentContext, "");
        }

        public final com.paypal.oslo.feature.subscriptions.analytics.shared.ItemAnalytics linkSubscriptionsButton() {
            return new com.paypal.oslo.feature.subscriptions.analytics.shared.ItemAnalytics(getSubscriptionUserIntent().withAction("link_paypal"), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(LINK_SUBSCRIPTIONS_BUTTON, 0, 2, null), null, 4, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/analytics/subscriptions/MeSubscriptionsScreenAnalytics$ErrorStateModule;", "Lcom/paypal/oslo/feature/subscriptions/analytics/shared/SubscriptionsAnalyticsModule;", "Lcom/paypal/oslo/feature/subscriptions/api/analytics/SubscriptionsUserIntentContext;", "intent", "<init>", "(Lcom/paypal/oslo/feature/subscriptions/api/analytics/SubscriptionsUserIntentContext;)V", "Lcom/paypal/oslo/feature/subscriptions/analytics/shared/ItemAnalytics;", "tryAgainButton", "()Lcom/paypal/oslo/feature/subscriptions/analytics/shared/ItemAnalytics;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ErrorStateModule extends com.paypal.oslo.feature.subscriptions.analytics.shared.SubscriptionsAnalyticsModule {
        public static final java.lang.String NAME = "subscriptions_error_state";
        public static final java.lang.String SHOWN_ACTION = "view_error_state";
        public static final java.lang.String TRY_AGAIN_BUTTON = "try_again_button";
        public static final int $stable = 8;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ErrorStateModule(com.paypal.oslo.feature.subscriptions.api.analytics.SubscriptionsUserIntentContext subscriptionsUserIntentContext) {
            super("view_error_state", NAME, subscriptionsUserIntentContext);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subscriptionsUserIntentContext, "");
        }

        public final com.paypal.oslo.feature.subscriptions.analytics.shared.ItemAnalytics tryAgainButton() {
            return new com.paypal.oslo.feature.subscriptions.analytics.shared.ItemAnalytics(getSubscriptionUserIntent().withAction("retry"), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("try_again_button", 0, 2, null), null, 4, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\fJ\r\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/analytics/subscriptions/MeSubscriptionsScreenAnalytics$LinkedListModule;", "Lcom/paypal/oslo/feature/subscriptions/analytics/shared/SubscriptionsAnalyticsModule;", "Lcom/paypal/oslo/feature/subscriptions/api/analytics/SubscriptionsUserIntentContext;", "intent", "<init>", "(Lcom/paypal/oslo/feature/subscriptions/api/analytics/SubscriptionsUserIntentContext;)V", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/domain/MerchantContext;", "merchant", "Lcom/paypal/oslo/feature/subscriptions/analytics/shared/ItemAnalytics;", "subscriptionRow", "(Lcom/paypal/oslo/core/telemetry/analytics/schema/context/domain/MerchantContext;)Lcom/paypal/oslo/feature/subscriptions/analytics/shared/ItemAnalytics;", "bulkFiButton", "()Lcom/paypal/oslo/feature/subscriptions/analytics/shared/ItemAnalytics;", "infoButton", "addSubscriptionButton", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class LinkedListModule extends com.paypal.oslo.feature.subscriptions.analytics.shared.SubscriptionsAnalyticsModule {
        public static final java.lang.String ADD_SUBSCRIPTION_BUTTON = "add_subscription_button";
        public static final java.lang.String BULK_FI_BUTTON = "bulk_fi_button";
        public static final java.lang.String INFO_BUTTON = "info_button";
        public static final java.lang.String NAME = "subscriptions_linked_list";
        public static final java.lang.String SHOWN_ACTION = "view_subscriptions";
        public static final java.lang.String SUBSCRIPTION_ROW = "subscription_row";
        public static final int $stable = 8;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LinkedListModule(com.paypal.oslo.feature.subscriptions.api.analytics.SubscriptionsUserIntentContext subscriptionsUserIntentContext) {
            super("view_subscriptions", NAME, subscriptionsUserIntentContext);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subscriptionsUserIntentContext, "");
        }

        public final com.paypal.oslo.feature.subscriptions.analytics.shared.ItemAnalytics subscriptionRow(com.paypal.oslo.core.telemetry.analytics.schema.context.domain.MerchantContext merchant) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchant, "");
            return new com.paypal.oslo.feature.subscriptions.analytics.shared.ItemAnalytics(getSubscriptionUserIntent().withAction(com.paypal.oslo.feature.subscriptions.api.analytics.AnalyticsScreenNames.ACTION_SCREEN_SUBSCRIPTION_DETAIL), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(SUBSCRIPTION_ROW, 0, 2, null), kotlin.collections.CollectionsKt.listOf(merchant));
        }

        public final com.paypal.oslo.feature.subscriptions.analytics.shared.ItemAnalytics bulkFiButton() {
            return new com.paypal.oslo.feature.subscriptions.analytics.shared.ItemAnalytics(getSubscriptionUserIntent().withAction(com.paypal.oslo.feature.subscriptions.api.analytics.AnalyticsScreenNames.ACTION_SUBSCRIPTIONS_BULK_FI), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("bulk_fi_button", 0, 2, null), null, 4, null);
        }

        public final com.paypal.oslo.feature.subscriptions.analytics.shared.ItemAnalytics infoButton() {
            return new com.paypal.oslo.feature.subscriptions.analytics.shared.ItemAnalytics(getSubscriptionUserIntent().withAction("info"), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("info_button", 0, 2, null), null, 4, null);
        }

        public final com.paypal.oslo.feature.subscriptions.analytics.shared.ItemAnalytics addSubscriptionButton() {
            return new com.paypal.oslo.feature.subscriptions.analytics.shared.ItemAnalytics(getSubscriptionUserIntent().withAction("link_paypal"), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(ADD_SUBSCRIPTION_BUTTON, 0, 2, null), null, 4, null);
        }
    }
}
