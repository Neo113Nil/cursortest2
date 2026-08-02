package com.paypal.oslo.feature.subscriptions.analytics.vaultedbusinesses;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0004\u001d\u001e\u001f\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006R\u001a\u0010\t\u001a\u00020\b8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\u00020\u00178\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/analytics/vaultedbusinesses/SettingsLinkedBusinessesScreenAnalytics;", "Lcom/paypal/oslo/feature/subscriptions/analytics/shared/CommonScreenAnalytics;", "<init>", "()V", "Lcom/paypal/oslo/feature/subscriptions/analytics/shared/ItemAnalytics;", "closeButton", "()Lcom/paypal/oslo/feature/subscriptions/analytics/shared/ItemAnalytics;", "infoButton", "Lcom/paypal/oslo/feature/subscriptions/api/analytics/SubscriptionsUserIntentContext$Hub;", "subscriptionUserIntent", "Lcom/paypal/oslo/feature/subscriptions/api/analytics/SubscriptionsUserIntentContext$Hub;", "getSubscriptionUserIntent", "()Lcom/paypal/oslo/feature/subscriptions/api/analytics/SubscriptionsUserIntentContext$Hub;", "Lcom/paypal/oslo/feature/subscriptions/analytics/vaultedbusinesses/SettingsLinkedBusinessesScreenAnalytics$EmptyStateModule;", "emptyStateModule", "Lcom/paypal/oslo/feature/subscriptions/analytics/vaultedbusinesses/SettingsLinkedBusinessesScreenAnalytics$EmptyStateModule;", "getEmptyStateModule", "()Lcom/paypal/oslo/feature/subscriptions/analytics/vaultedbusinesses/SettingsLinkedBusinessesScreenAnalytics$EmptyStateModule;", "Lcom/paypal/oslo/feature/subscriptions/analytics/vaultedbusinesses/SettingsLinkedBusinessesScreenAnalytics$ErrorStateModule;", "errorStateModule", "Lcom/paypal/oslo/feature/subscriptions/analytics/vaultedbusinesses/SettingsLinkedBusinessesScreenAnalytics$ErrorStateModule;", "getErrorStateModule", "()Lcom/paypal/oslo/feature/subscriptions/analytics/vaultedbusinesses/SettingsLinkedBusinessesScreenAnalytics$ErrorStateModule;", "Lcom/paypal/oslo/feature/subscriptions/analytics/vaultedbusinesses/SettingsLinkedBusinessesScreenAnalytics$LinkedListModule;", "linkedListModule", "Lcom/paypal/oslo/feature/subscriptions/analytics/vaultedbusinesses/SettingsLinkedBusinessesScreenAnalytics$LinkedListModule;", "getLinkedListModule", "()Lcom/paypal/oslo/feature/subscriptions/analytics/vaultedbusinesses/SettingsLinkedBusinessesScreenAnalytics$LinkedListModule;", "Companion", "EmptyStateModule", "ErrorStateModule", "LinkedListModule"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SettingsLinkedBusinessesScreenAnalytics extends com.paypal.oslo.feature.subscriptions.analytics.shared.CommonScreenAnalytics {
    public static final java.lang.String ACTION_CLOSE_BUTTON = "dismiss";
    public static final java.lang.String ACTION_INFO_BUTTON = "view_linked_businesses";
    public static final java.lang.String CLOSE_BUTTON = "close_button";
    public static final java.lang.String INFO_BUTTON = "info_button";
    private final com.paypal.oslo.feature.subscriptions.analytics.vaultedbusinesses.SettingsLinkedBusinessesScreenAnalytics.EmptyStateModule emptyStateModule;
    private final com.paypal.oslo.feature.subscriptions.analytics.vaultedbusinesses.SettingsLinkedBusinessesScreenAnalytics.ErrorStateModule errorStateModule;
    private final com.paypal.oslo.feature.subscriptions.analytics.vaultedbusinesses.SettingsLinkedBusinessesScreenAnalytics.LinkedListModule linkedListModule;
    private final com.paypal.oslo.feature.subscriptions.api.analytics.SubscriptionsUserIntentContext.Hub subscriptionUserIntent;
    public static final int $stable = 8;

    public SettingsLinkedBusinessesScreenAnalytics() {
        super(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Business.INSTANCE);
        this.subscriptionUserIntent = new com.paypal.oslo.feature.subscriptions.api.analytics.SubscriptionsUserIntentContext.Hub(com.paypal.oslo.feature.subscriptions.api.analytics.AnalyticsScreenNames.SCREEN_SETTINGS_LINKED_BUSINESSES, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Business.INSTANCE);
        this.emptyStateModule = new com.paypal.oslo.feature.subscriptions.analytics.vaultedbusinesses.SettingsLinkedBusinessesScreenAnalytics.EmptyStateModule(getSubscriptionUserIntent());
        this.errorStateModule = new com.paypal.oslo.feature.subscriptions.analytics.vaultedbusinesses.SettingsLinkedBusinessesScreenAnalytics.ErrorStateModule(getSubscriptionUserIntent());
        this.linkedListModule = new com.paypal.oslo.feature.subscriptions.analytics.vaultedbusinesses.SettingsLinkedBusinessesScreenAnalytics.LinkedListModule(getSubscriptionUserIntent());
    }

    @Override // com.paypal.oslo.feature.subscriptions.analytics.shared.CommonScreenAnalytics
    public final com.paypal.oslo.feature.subscriptions.api.analytics.SubscriptionsUserIntentContext.Hub getSubscriptionUserIntent() {
        return this.subscriptionUserIntent;
    }

    public final com.paypal.oslo.feature.subscriptions.analytics.vaultedbusinesses.SettingsLinkedBusinessesScreenAnalytics.EmptyStateModule getEmptyStateModule() {
        return this.emptyStateModule;
    }

    public final com.paypal.oslo.feature.subscriptions.analytics.vaultedbusinesses.SettingsLinkedBusinessesScreenAnalytics.ErrorStateModule getErrorStateModule() {
        return this.errorStateModule;
    }

    public final com.paypal.oslo.feature.subscriptions.analytics.vaultedbusinesses.SettingsLinkedBusinessesScreenAnalytics.LinkedListModule getLinkedListModule() {
        return this.linkedListModule;
    }

    public final com.paypal.oslo.feature.subscriptions.analytics.shared.ItemAnalytics closeButton() {
        return new com.paypal.oslo.feature.subscriptions.analytics.shared.ItemAnalytics(getSubscriptionUserIntent().withAction("dismiss"), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("close_button", 0, 2, null), null, 4, null);
    }

    public final com.paypal.oslo.feature.subscriptions.analytics.shared.ItemAnalytics infoButton() {
        return new com.paypal.oslo.feature.subscriptions.analytics.shared.ItemAnalytics(getSubscriptionUserIntent().withAction("view_linked_businesses"), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("info_button", 0, 2, null), null, 4, null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/analytics/vaultedbusinesses/SettingsLinkedBusinessesScreenAnalytics$EmptyStateModule;", "Lcom/paypal/oslo/feature/subscriptions/analytics/shared/SubscriptionsAnalyticsModule;", "Lcom/paypal/oslo/feature/subscriptions/api/analytics/SubscriptionsUserIntentContext;", "intent", "<init>", "(Lcom/paypal/oslo/feature/subscriptions/api/analytics/SubscriptionsUserIntentContext;)V", "Lcom/paypal/oslo/feature/subscriptions/analytics/shared/ItemAnalytics;", "linkBusinessesButton", "()Lcom/paypal/oslo/feature/subscriptions/analytics/shared/ItemAnalytics;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class EmptyStateModule extends com.paypal.oslo.feature.subscriptions.analytics.shared.SubscriptionsAnalyticsModule {
        public static final java.lang.String LINK_BUSINESSES_BUTTON = "link_businesses_button";
        public static final java.lang.String NAME = "linked_businesses_empty_state";
        public static final java.lang.String SHOWN_ACTION = "view_linked_businesses";
        public static final int $stable = 8;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EmptyStateModule(com.paypal.oslo.feature.subscriptions.api.analytics.SubscriptionsUserIntentContext subscriptionsUserIntentContext) {
            super("view_linked_businesses", NAME, subscriptionsUserIntentContext);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subscriptionsUserIntentContext, "");
        }

        public final com.paypal.oslo.feature.subscriptions.analytics.shared.ItemAnalytics linkBusinessesButton() {
            return new com.paypal.oslo.feature.subscriptions.analytics.shared.ItemAnalytics(getSubscriptionUserIntent().withAction("link_paypal"), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(LINK_BUSINESSES_BUTTON, 0, 2, null), null, 4, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/analytics/vaultedbusinesses/SettingsLinkedBusinessesScreenAnalytics$ErrorStateModule;", "Lcom/paypal/oslo/feature/subscriptions/analytics/shared/SubscriptionsAnalyticsModule;", "Lcom/paypal/oslo/feature/subscriptions/api/analytics/SubscriptionsUserIntentContext;", "intent", "<init>", "(Lcom/paypal/oslo/feature/subscriptions/api/analytics/SubscriptionsUserIntentContext;)V", "Lcom/paypal/oslo/feature/subscriptions/analytics/shared/ItemAnalytics;", "tryAgainButton", "()Lcom/paypal/oslo/feature/subscriptions/analytics/shared/ItemAnalytics;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ErrorStateModule extends com.paypal.oslo.feature.subscriptions.analytics.shared.SubscriptionsAnalyticsModule {
        public static final java.lang.String NAME = "linked_businesses_error_state";
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

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/analytics/vaultedbusinesses/SettingsLinkedBusinessesScreenAnalytics$LinkedListModule;", "Lcom/paypal/oslo/feature/subscriptions/analytics/shared/SubscriptionsAnalyticsModule;", "Lcom/paypal/oslo/feature/subscriptions/api/analytics/SubscriptionsUserIntentContext;", "intent", "<init>", "(Lcom/paypal/oslo/feature/subscriptions/api/analytics/SubscriptionsUserIntentContext;)V", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/domain/MerchantContext;", "merchant", "Lcom/paypal/oslo/feature/subscriptions/analytics/shared/ItemAnalytics;", "businessRow", "(Lcom/paypal/oslo/core/telemetry/analytics/schema/context/domain/MerchantContext;)Lcom/paypal/oslo/feature/subscriptions/analytics/shared/ItemAnalytics;", "bulkFiButton", "()Lcom/paypal/oslo/feature/subscriptions/analytics/shared/ItemAnalytics;", "addBusinessButton", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class LinkedListModule extends com.paypal.oslo.feature.subscriptions.analytics.shared.SubscriptionsAnalyticsModule {
        public static final java.lang.String ADD_BUSINESS_BUTTON = "add_business_button";
        public static final java.lang.String BULK_FI_BUTTON = "bulk_fi_button";
        public static final java.lang.String BUSINESS_ROW = "business_row";
        public static final java.lang.String NAME = "linked_businesses_list";
        public static final java.lang.String SHOWN_ACTION = "view_linked_businesses";
        public static final int $stable = 8;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LinkedListModule(com.paypal.oslo.feature.subscriptions.api.analytics.SubscriptionsUserIntentContext subscriptionsUserIntentContext) {
            super("view_linked_businesses", NAME, subscriptionsUserIntentContext);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subscriptionsUserIntentContext, "");
        }

        public final com.paypal.oslo.feature.subscriptions.analytics.shared.ItemAnalytics businessRow(com.paypal.oslo.core.telemetry.analytics.schema.context.domain.MerchantContext merchant) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchant, "");
            return new com.paypal.oslo.feature.subscriptions.analytics.shared.ItemAnalytics(getSubscriptionUserIntent().withAction(com.paypal.oslo.feature.subscriptions.api.analytics.AnalyticsScreenNames.ACTION_SCREEN_BUSINESS_DETAIL), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(BUSINESS_ROW, 0, 2, null), kotlin.collections.CollectionsKt.listOf(merchant));
        }

        public final com.paypal.oslo.feature.subscriptions.analytics.shared.ItemAnalytics bulkFiButton() {
            return new com.paypal.oslo.feature.subscriptions.analytics.shared.ItemAnalytics(getSubscriptionUserIntent().withAction(com.paypal.oslo.feature.subscriptions.api.analytics.AnalyticsScreenNames.ACTION_BUSINESSES_BULK_FI), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("bulk_fi_button", 0, 2, null), null, 4, null);
        }

        public final com.paypal.oslo.feature.subscriptions.analytics.shared.ItemAnalytics addBusinessButton() {
            return new com.paypal.oslo.feature.subscriptions.analytics.shared.ItemAnalytics(getSubscriptionUserIntent().withAction("link_paypal"), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(ADD_BUSINESS_BUTTON, 0, 2, null), null, 4, null);
        }
    }
}
