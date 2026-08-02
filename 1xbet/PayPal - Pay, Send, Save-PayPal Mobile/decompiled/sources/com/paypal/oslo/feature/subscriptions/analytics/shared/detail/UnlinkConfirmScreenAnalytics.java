package com.paypal.oslo.feature.subscriptions.analytics.shared.detail;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0002\u0016\u0015B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\u00020\u00068\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/analytics/shared/detail/UnlinkConfirmScreenAnalytics;", "Lcom/paypal/oslo/feature/subscriptions/analytics/shared/CommonScreenAnalytics;", "Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "agreementType", "<init>", "(Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;)V", "Lcom/paypal/oslo/feature/subscriptions/api/analytics/SubscriptionsUserIntentContext$Detail;", "subscriptionUserIntent", "Lcom/paypal/oslo/feature/subscriptions/api/analytics/SubscriptionsUserIntentContext$Detail;", "getSubscriptionUserIntent", "()Lcom/paypal/oslo/feature/subscriptions/api/analytics/SubscriptionsUserIntentContext$Detail;", "Lcom/paypal/oslo/feature/subscriptions/analytics/shared/detail/UnlinkConfirmScreenAnalytics$ConfirmationModule;", "confirmation", "Lcom/paypal/oslo/feature/subscriptions/analytics/shared/detail/UnlinkConfirmScreenAnalytics$ConfirmationModule;", "getConfirmation", "()Lcom/paypal/oslo/feature/subscriptions/analytics/shared/detail/UnlinkConfirmScreenAnalytics$ConfirmationModule;", "Lcom/paypal/oslo/feature/subscriptions/analytics/shared/ErrorModule;", "errorModule", "Lcom/paypal/oslo/feature/subscriptions/analytics/shared/ErrorModule;", "getErrorModule", "()Lcom/paypal/oslo/feature/subscriptions/analytics/shared/ErrorModule;", "Companion", "ConfirmationModule"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class UnlinkConfirmScreenAnalytics extends com.paypal.oslo.feature.subscriptions.analytics.shared.CommonScreenAnalytics {
    public static final java.lang.String ERROR_MODULE_NAME = "unlink_error_state";
    public static final java.lang.String KEEP_LINKED_BUTTON = "keep_linked_button";
    public static final java.lang.String UNLINK_PAYPAL_BUTTON = "unlink_paypal_button";
    private final com.paypal.oslo.feature.subscriptions.analytics.shared.detail.UnlinkConfirmScreenAnalytics.ConfirmationModule confirmation;
    private final com.paypal.oslo.feature.subscriptions.analytics.shared.ErrorModule errorModule;
    private final com.paypal.oslo.feature.subscriptions.api.analytics.SubscriptionsUserIntentContext.Detail subscriptionUserIntent;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnlinkConfirmScreenAnalytics(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType) {
        super(agreementType);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementType, "");
        this.subscriptionUserIntent = new com.paypal.oslo.feature.subscriptions.api.analytics.SubscriptionsUserIntentContext.Detail(com.paypal.oslo.feature.subscriptions.api.analytics.AnalyticsScreenNames.INSTANCE.unlinkConfirmScreenName(agreementType), agreementType);
        this.confirmation = new com.paypal.oslo.feature.subscriptions.analytics.shared.detail.UnlinkConfirmScreenAnalytics.ConfirmationModule(getSubscriptionUserIntent());
        this.errorModule = new com.paypal.oslo.feature.subscriptions.analytics.shared.ErrorModule(getSubscriptionUserIntent(), ERROR_MODULE_NAME);
    }

    @Override // com.paypal.oslo.feature.subscriptions.analytics.shared.CommonScreenAnalytics
    public final com.paypal.oslo.feature.subscriptions.api.analytics.SubscriptionsUserIntentContext.Detail getSubscriptionUserIntent() {
        return this.subscriptionUserIntent;
    }

    public final com.paypal.oslo.feature.subscriptions.analytics.shared.detail.UnlinkConfirmScreenAnalytics.ConfirmationModule getConfirmation() {
        return this.confirmation;
    }

    public final com.paypal.oslo.feature.subscriptions.analytics.shared.ErrorModule getErrorModule() {
        return this.errorModule;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/analytics/shared/detail/UnlinkConfirmScreenAnalytics$ConfirmationModule;", "Lcom/paypal/oslo/feature/subscriptions/analytics/shared/SubscriptionsAnalyticsModule;", "Lcom/paypal/oslo/feature/subscriptions/api/analytics/SubscriptionsUserIntentContext;", "intent", "<init>", "(Lcom/paypal/oslo/feature/subscriptions/api/analytics/SubscriptionsUserIntentContext;)V", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/domain/MerchantContext;", "merchant", "Lcom/paypal/oslo/feature/subscriptions/analytics/shared/ItemAnalytics;", "unlinkButton", "(Lcom/paypal/oslo/core/telemetry/analytics/schema/context/domain/MerchantContext;)Lcom/paypal/oslo/feature/subscriptions/analytics/shared/ItemAnalytics;", "keepLinkedButton", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ConfirmationModule extends com.paypal.oslo.feature.subscriptions.analytics.shared.SubscriptionsAnalyticsModule {
        public static final java.lang.String NAME = "unlink_confirmation";
        public static final java.lang.String SHOWN_ACTION = "unlink_confirmation";
        public static final int $stable = 8;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConfirmationModule(com.paypal.oslo.feature.subscriptions.api.analytics.SubscriptionsUserIntentContext subscriptionsUserIntentContext) {
            super("unlink_confirmation", "unlink_confirmation", subscriptionsUserIntentContext);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subscriptionsUserIntentContext, "");
        }

        public final com.paypal.oslo.feature.subscriptions.analytics.shared.ItemAnalytics unlinkButton(com.paypal.oslo.core.telemetry.analytics.schema.context.domain.MerchantContext merchant) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchant, "");
            return new com.paypal.oslo.feature.subscriptions.analytics.shared.ItemAnalytics(getSubscriptionUserIntent().withAction(""), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("unlink_paypal_button", 0, 2, null), kotlin.collections.CollectionsKt.listOf(merchant));
        }

        public final com.paypal.oslo.feature.subscriptions.analytics.shared.ItemAnalytics keepLinkedButton(com.paypal.oslo.core.telemetry.analytics.schema.context.domain.MerchantContext merchant) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchant, "");
            return new com.paypal.oslo.feature.subscriptions.analytics.shared.ItemAnalytics(getSubscriptionUserIntent().withAction(""), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(com.paypal.oslo.feature.subscriptions.analytics.shared.detail.UnlinkConfirmScreenAnalytics.KEEP_LINKED_BUTTON, 0, 2, null), kotlin.collections.CollectionsKt.listOf(merchant));
        }
    }
}
