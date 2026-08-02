package com.paypal.oslo.feature.subscriptions.analytics.shared.bulkfi;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00172\u00020\u0001:\u0002\u0018\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\nJ\u0015\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\nR\u001a\u0010\u000e\u001a\u00020\r8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/analytics/shared/bulkfi/BulkSelectFiScreenAnalytics;", "Lcom/paypal/oslo/feature/subscriptions/analytics/shared/CommonScreenAnalytics;", "Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "agreementType", "<init>", "(Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;)V", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/BusinessFlowContext;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW, "Lcom/paypal/oslo/feature/subscriptions/analytics/shared/ItemAnalytics;", "learnMore", "(Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/BusinessFlowContext;)Lcom/paypal/oslo/feature/subscriptions/analytics/shared/ItemAnalytics;", "updatePaymentMethod", "backButton", "Lcom/paypal/oslo/feature/subscriptions/api/analytics/SubscriptionsUserIntentContext$BulkFi;", "subscriptionUserIntent", "Lcom/paypal/oslo/feature/subscriptions/api/analytics/SubscriptionsUserIntentContext$BulkFi;", "getSubscriptionUserIntent", "()Lcom/paypal/oslo/feature/subscriptions/api/analytics/SubscriptionsUserIntentContext$BulkFi;", "Lcom/paypal/oslo/feature/subscriptions/analytics/shared/bulkfi/BulkSelectFiScreenAnalytics$FiSelectorModule;", "fiSelector", "Lcom/paypal/oslo/feature/subscriptions/analytics/shared/bulkfi/BulkSelectFiScreenAnalytics$FiSelectorModule;", "getFiSelector", "()Lcom/paypal/oslo/feature/subscriptions/analytics/shared/bulkfi/BulkSelectFiScreenAnalytics$FiSelectorModule;", "Companion", "FiSelectorModule"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class BulkSelectFiScreenAnalytics extends com.paypal.oslo.feature.subscriptions.analytics.shared.CommonScreenAnalytics {
    public static final java.lang.String BACK_BUTTON = "back_button";
    public static final java.lang.String LEARN_MORE_LINK = "learn_more_link";
    public static final java.lang.String UPDATE_PAYMENT_METHOD_BUTTON = "update_payment_method_button";
    private final com.paypal.oslo.feature.subscriptions.analytics.shared.bulkfi.BulkSelectFiScreenAnalytics.FiSelectorModule fiSelector;
    private final com.paypal.oslo.feature.subscriptions.api.analytics.SubscriptionsUserIntentContext.BulkFi subscriptionUserIntent;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BulkSelectFiScreenAnalytics(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType) {
        super(agreementType);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementType, "");
        this.subscriptionUserIntent = new com.paypal.oslo.feature.subscriptions.api.analytics.SubscriptionsUserIntentContext.BulkFi("bulk_fi_update_select_fi", agreementType);
        this.fiSelector = new com.paypal.oslo.feature.subscriptions.analytics.shared.bulkfi.BulkSelectFiScreenAnalytics.FiSelectorModule(getSubscriptionUserIntent());
    }

    @Override // com.paypal.oslo.feature.subscriptions.analytics.shared.CommonScreenAnalytics
    public final com.paypal.oslo.feature.subscriptions.api.analytics.SubscriptionsUserIntentContext.BulkFi getSubscriptionUserIntent() {
        return this.subscriptionUserIntent;
    }

    public final com.paypal.oslo.feature.subscriptions.analytics.shared.ItemAnalytics learnMore(com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext flow) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flow, "");
        return new com.paypal.oslo.feature.subscriptions.analytics.shared.ItemAnalytics(getSubscriptionUserIntent().withAction(""), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("learn_more_link", 0, 2, null), kotlin.collections.CollectionsKt.listOf(flow));
    }

    public final com.paypal.oslo.feature.subscriptions.analytics.shared.ItemAnalytics updatePaymentMethod(com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext flow) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flow, "");
        return new com.paypal.oslo.feature.subscriptions.analytics.shared.ItemAnalytics(getSubscriptionUserIntent().withAction(""), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("update_payment_method_button", 0, 2, null), kotlin.collections.CollectionsKt.listOf(flow));
    }

    public final com.paypal.oslo.feature.subscriptions.analytics.shared.ItemAnalytics backButton(com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext flow) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flow, "");
        return new com.paypal.oslo.feature.subscriptions.analytics.shared.ItemAnalytics(getSubscriptionUserIntent().withAction(""), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("back_button", 0, 2, null), kotlin.collections.CollectionsKt.listOf(flow));
    }

    public final com.paypal.oslo.feature.subscriptions.analytics.shared.bulkfi.BulkSelectFiScreenAnalytics.FiSelectorModule getFiSelector() {
        return this.fiSelector;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/analytics/shared/bulkfi/BulkSelectFiScreenAnalytics$FiSelectorModule;", "Lcom/paypal/oslo/feature/subscriptions/analytics/shared/SubscriptionsAnalyticsModule;", "Lcom/paypal/oslo/feature/subscriptions/api/analytics/SubscriptionsUserIntentContext;", "intent", "<init>", "(Lcom/paypal/oslo/feature/subscriptions/api/analytics/SubscriptionsUserIntentContext;)V", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/BusinessFlowContext;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW, "Lcom/paypal/oslo/feature/subscriptions/analytics/shared/ItemAnalytics;", "fiRow", "(Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/BusinessFlowContext;)Lcom/paypal/oslo/feature/subscriptions/analytics/shared/ItemAnalytics;", "addPaymentMethod", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class FiSelectorModule extends com.paypal.oslo.feature.subscriptions.analytics.shared.SubscriptionsAnalyticsModule {
        public static final java.lang.String ADD_PAYMENT_METHOD_BUTTON = "add_payment_method_button";
        public static final java.lang.String FI_ROW = "fi_row";
        public static final java.lang.String NAME = "fi_selector";
        public static final java.lang.String SHOWN_ACTION = "fi_selector";
        public static final int $stable = 8;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FiSelectorModule(com.paypal.oslo.feature.subscriptions.api.analytics.SubscriptionsUserIntentContext subscriptionsUserIntentContext) {
            super("fi_selector", "fi_selector", subscriptionsUserIntentContext);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subscriptionsUserIntentContext, "");
        }

        public final com.paypal.oslo.feature.subscriptions.analytics.shared.ItemAnalytics fiRow(com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext flow) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flow, "");
            return new com.paypal.oslo.feature.subscriptions.analytics.shared.ItemAnalytics(getSubscriptionUserIntent().withAction(""), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("fi_row", 0, 2, null), kotlin.collections.CollectionsKt.listOf(flow));
        }

        public final com.paypal.oslo.feature.subscriptions.analytics.shared.ItemAnalytics addPaymentMethod(com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext flow) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flow, "");
            return new com.paypal.oslo.feature.subscriptions.analytics.shared.ItemAnalytics(getSubscriptionUserIntent().withAction(""), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("add_payment_method_button", 0, 2, null), kotlin.collections.CollectionsKt.listOf(flow));
        }
    }
}
