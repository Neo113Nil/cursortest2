package com.paypal.oslo.feature.subscriptions.analytics.shared.detail;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001f\u001eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\r\u0010\fJ\u001d\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\u00020\u000f8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\u00148\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\u00020\u00198\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/analytics/shared/detail/UpdateFiScreenAnalytics;", "Lcom/paypal/oslo/feature/subscriptions/analytics/shared/CommonScreenAnalytics;", "Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "agreementType", "<init>", "(Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;)V", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/domain/MerchantContext;", "merchant", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/BusinessFlowContext;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW, "Lcom/paypal/oslo/feature/subscriptions/analytics/shared/ItemAnalytics;", "learnMore", "(Lcom/paypal/oslo/core/telemetry/analytics/schema/context/domain/MerchantContext;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/BusinessFlowContext;)Lcom/paypal/oslo/feature/subscriptions/analytics/shared/ItemAnalytics;", "updatePaymentMethod", "backButton", "Lcom/paypal/oslo/feature/subscriptions/api/analytics/SubscriptionsUserIntentContext$Detail;", "subscriptionUserIntent", "Lcom/paypal/oslo/feature/subscriptions/api/analytics/SubscriptionsUserIntentContext$Detail;", "getSubscriptionUserIntent", "()Lcom/paypal/oslo/feature/subscriptions/api/analytics/SubscriptionsUserIntentContext$Detail;", "Lcom/paypal/oslo/feature/subscriptions/analytics/shared/detail/UpdateFiScreenAnalytics$FiSelectorModule;", "fiSelector", "Lcom/paypal/oslo/feature/subscriptions/analytics/shared/detail/UpdateFiScreenAnalytics$FiSelectorModule;", "getFiSelector", "()Lcom/paypal/oslo/feature/subscriptions/analytics/shared/detail/UpdateFiScreenAnalytics$FiSelectorModule;", "Lcom/paypal/oslo/feature/subscriptions/analytics/shared/ErrorModule;", "errorModule", "Lcom/paypal/oslo/feature/subscriptions/analytics/shared/ErrorModule;", "getErrorModule", "()Lcom/paypal/oslo/feature/subscriptions/analytics/shared/ErrorModule;", "Companion", "FiSelectorModule"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class UpdateFiScreenAnalytics extends com.paypal.oslo.feature.subscriptions.analytics.shared.CommonScreenAnalytics {
    public static final java.lang.String ADD_PAYMENT_METHOD_BUTTON = "add_payment_method_button";
    public static final java.lang.String BACK_BUTTON = "back_button";
    public static final java.lang.String FI_ROW = "fi_row";
    public static final java.lang.String LEARN_MORE_LINK = "learn_more_link";
    public static final java.lang.String UPDATE_PAYMENT_METHOD_BUTTON = "update_payment_method_button";
    private final com.paypal.oslo.feature.subscriptions.analytics.shared.ErrorModule errorModule;
    private final com.paypal.oslo.feature.subscriptions.analytics.shared.detail.UpdateFiScreenAnalytics.FiSelectorModule fiSelector;
    private final com.paypal.oslo.feature.subscriptions.api.analytics.SubscriptionsUserIntentContext.Detail subscriptionUserIntent;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.subscriptions.analytics.shared.detail.UpdateFiScreenAnalytics.Companion INSTANCE = new com.paypal.oslo.feature.subscriptions.analytics.shared.detail.UpdateFiScreenAnalytics.Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateFiScreenAnalytics(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType) {
        super(agreementType);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementType, "");
        this.subscriptionUserIntent = new com.paypal.oslo.feature.subscriptions.api.analytics.SubscriptionsUserIntentContext.Detail(com.paypal.oslo.feature.subscriptions.api.analytics.AnalyticsScreenNames.INSTANCE.updateFiScreenName(agreementType), agreementType);
        this.fiSelector = new com.paypal.oslo.feature.subscriptions.analytics.shared.detail.UpdateFiScreenAnalytics.FiSelectorModule(getSubscriptionUserIntent());
        this.errorModule = new com.paypal.oslo.feature.subscriptions.analytics.shared.ErrorModule(getSubscriptionUserIntent(), INSTANCE.errorModuleName(agreementType));
    }

    @Override // com.paypal.oslo.feature.subscriptions.analytics.shared.CommonScreenAnalytics
    public final com.paypal.oslo.feature.subscriptions.api.analytics.SubscriptionsUserIntentContext.Detail getSubscriptionUserIntent() {
        return this.subscriptionUserIntent;
    }

    public final com.paypal.oslo.feature.subscriptions.analytics.shared.ItemAnalytics learnMore(com.paypal.oslo.core.telemetry.analytics.schema.context.domain.MerchantContext merchant, com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext flow) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchant, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flow, "");
        return new com.paypal.oslo.feature.subscriptions.analytics.shared.ItemAnalytics(getSubscriptionUserIntent().withAction(""), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("learn_more_link", 0, 2, null), kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext[]{merchant, flow}));
    }

    public final com.paypal.oslo.feature.subscriptions.analytics.shared.ItemAnalytics updatePaymentMethod(com.paypal.oslo.core.telemetry.analytics.schema.context.domain.MerchantContext merchant, com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext flow) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchant, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flow, "");
        return new com.paypal.oslo.feature.subscriptions.analytics.shared.ItemAnalytics(getSubscriptionUserIntent().withAction(""), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("update_payment_method_button", 0, 2, null), kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext[]{merchant, flow}));
    }

    public final com.paypal.oslo.feature.subscriptions.analytics.shared.ItemAnalytics backButton(com.paypal.oslo.core.telemetry.analytics.schema.context.domain.MerchantContext merchant, com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext flow) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchant, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flow, "");
        return new com.paypal.oslo.feature.subscriptions.analytics.shared.ItemAnalytics(getSubscriptionUserIntent().withAction(""), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("back_button", 0, 2, null), kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext[]{merchant, flow}));
    }

    public final com.paypal.oslo.feature.subscriptions.analytics.shared.detail.UpdateFiScreenAnalytics.FiSelectorModule getFiSelector() {
        return this.fiSelector;
    }

    public final com.paypal.oslo.feature.subscriptions.analytics.shared.ErrorModule getErrorModule() {
        return this.errorModule;
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\r\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/analytics/shared/detail/UpdateFiScreenAnalytics$FiSelectorModule;", "Lcom/paypal/oslo/feature/subscriptions/analytics/shared/SubscriptionsAnalyticsModule;", "Lcom/paypal/oslo/feature/subscriptions/api/analytics/SubscriptionsUserIntentContext;", "intent", "<init>", "(Lcom/paypal/oslo/feature/subscriptions/api/analytics/SubscriptionsUserIntentContext;)V", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/domain/MerchantContext;", "merchant", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/BusinessFlowContext;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW, "Lcom/paypal/oslo/feature/subscriptions/analytics/shared/ItemAnalytics;", "fiRow", "(Lcom/paypal/oslo/core/telemetry/analytics/schema/context/domain/MerchantContext;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/BusinessFlowContext;)Lcom/paypal/oslo/feature/subscriptions/analytics/shared/ItemAnalytics;", "addPaymentMethod", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class FiSelectorModule extends com.paypal.oslo.feature.subscriptions.analytics.shared.SubscriptionsAnalyticsModule {
        public static final java.lang.String NAME = "fi_selector";
        public static final java.lang.String SHOWN_ACTION = "fi_selector";
        public static final int $stable = 8;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FiSelectorModule(com.paypal.oslo.feature.subscriptions.api.analytics.SubscriptionsUserIntentContext subscriptionsUserIntentContext) {
            super("fi_selector", "fi_selector", subscriptionsUserIntentContext);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subscriptionsUserIntentContext, "");
        }

        public final com.paypal.oslo.feature.subscriptions.analytics.shared.ItemAnalytics fiRow(com.paypal.oslo.core.telemetry.analytics.schema.context.domain.MerchantContext merchant, com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext flow) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchant, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flow, "");
            return new com.paypal.oslo.feature.subscriptions.analytics.shared.ItemAnalytics(getSubscriptionUserIntent().withAction(""), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("fi_row", 0, 2, null), kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext[]{merchant, flow}));
        }

        public final com.paypal.oslo.feature.subscriptions.analytics.shared.ItemAnalytics addPaymentMethod(com.paypal.oslo.core.telemetry.analytics.schema.context.domain.MerchantContext merchant, com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext flow) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchant, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flow, "");
            return new com.paypal.oslo.feature.subscriptions.analytics.shared.ItemAnalytics(getSubscriptionUserIntent().withAction(""), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("add_payment_method_button", 0, 2, null), kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext[]{merchant, flow}));
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/analytics/shared/detail/UpdateFiScreenAnalytics$Companion;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "agreementType", "", "errorModuleName", "(Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;)Ljava/lang/String;", "LEARN_MORE_LINK", "Ljava/lang/String;", "UPDATE_PAYMENT_METHOD_BUTTON", "BACK_BUTTON", "FI_ROW", "ADD_PAYMENT_METHOD_BUTTON"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String errorModuleName(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementType, "");
            if (kotlin.jvm.internal.Intrinsics.areEqual(agreementType, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Subscription.INSTANCE)) {
                return "subscription_update_fi_error";
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(agreementType, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Business.INSTANCE)) {
                return "business_update_fi_error";
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
