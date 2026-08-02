package com.paypal.oslo.feature.subscriptions.analytics.shared.bulkfi;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0002\u0019\u0018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\t8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/analytics/shared/bulkfi/BulkFiScreenAnalytics;", "Lcom/paypal/oslo/feature/subscriptions/analytics/shared/CommonScreenAnalytics;", "Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "agreementType", "<init>", "(Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;)V", "Lcom/paypal/oslo/feature/subscriptions/analytics/shared/ItemAnalytics;", "closeButton", "()Lcom/paypal/oslo/feature/subscriptions/analytics/shared/ItemAnalytics;", "Lcom/paypal/oslo/feature/subscriptions/api/analytics/SubscriptionsUserIntentContext$BulkFi;", "subscriptionUserIntent", "Lcom/paypal/oslo/feature/subscriptions/api/analytics/SubscriptionsUserIntentContext$BulkFi;", "getSubscriptionUserIntent", "()Lcom/paypal/oslo/feature/subscriptions/api/analytics/SubscriptionsUserIntentContext$BulkFi;", "Lcom/paypal/oslo/feature/subscriptions/analytics/shared/bulkfi/BulkFiScreenAnalytics$SelectionListModule;", "selectionListModule", "Lcom/paypal/oslo/feature/subscriptions/analytics/shared/bulkfi/BulkFiScreenAnalytics$SelectionListModule;", "getSelectionListModule", "()Lcom/paypal/oslo/feature/subscriptions/analytics/shared/bulkfi/BulkFiScreenAnalytics$SelectionListModule;", "Lcom/paypal/oslo/feature/subscriptions/analytics/shared/ErrorModule;", "errorModule", "Lcom/paypal/oslo/feature/subscriptions/analytics/shared/ErrorModule;", "getErrorModule", "()Lcom/paypal/oslo/feature/subscriptions/analytics/shared/ErrorModule;", "Companion", "SelectionListModule"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class BulkFiScreenAnalytics extends com.paypal.oslo.feature.subscriptions.analytics.shared.CommonScreenAnalytics {
    public static final java.lang.String ACTION_CLOSE_BUTTON = "dismiss";
    public static final java.lang.String CLOSE_BUTTON = "close_button";
    private final com.paypal.oslo.feature.subscriptions.analytics.shared.ErrorModule errorModule;
    private final com.paypal.oslo.feature.subscriptions.analytics.shared.bulkfi.BulkFiScreenAnalytics.SelectionListModule selectionListModule;
    private final com.paypal.oslo.feature.subscriptions.api.analytics.SubscriptionsUserIntentContext.BulkFi subscriptionUserIntent;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.subscriptions.analytics.shared.bulkfi.BulkFiScreenAnalytics.Companion INSTANCE = new com.paypal.oslo.feature.subscriptions.analytics.shared.bulkfi.BulkFiScreenAnalytics.Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BulkFiScreenAnalytics(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType) {
        super(agreementType);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementType, "");
        this.subscriptionUserIntent = new com.paypal.oslo.feature.subscriptions.api.analytics.SubscriptionsUserIntentContext.BulkFi(com.paypal.oslo.feature.subscriptions.api.analytics.AnalyticsScreenNames.INSTANCE.bulkFiScreenNameWithAction(agreementType).getScreenName(), agreementType);
        this.selectionListModule = new com.paypal.oslo.feature.subscriptions.analytics.shared.bulkfi.BulkFiScreenAnalytics.SelectionListModule(getSubscriptionUserIntent());
        this.errorModule = new com.paypal.oslo.feature.subscriptions.analytics.shared.ErrorModule(getSubscriptionUserIntent(), INSTANCE.errorModuleName(agreementType));
    }

    @Override // com.paypal.oslo.feature.subscriptions.analytics.shared.CommonScreenAnalytics
    public final com.paypal.oslo.feature.subscriptions.api.analytics.SubscriptionsUserIntentContext.BulkFi getSubscriptionUserIntent() {
        return this.subscriptionUserIntent;
    }

    public final com.paypal.oslo.feature.subscriptions.analytics.shared.ItemAnalytics closeButton() {
        return new com.paypal.oslo.feature.subscriptions.analytics.shared.ItemAnalytics(getSubscriptionUserIntent().withAction("dismiss"), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("close_button", 0, 2, null), null, 4, null);
    }

    public final com.paypal.oslo.feature.subscriptions.analytics.shared.bulkfi.BulkFiScreenAnalytics.SelectionListModule getSelectionListModule() {
        return this.selectionListModule;
    }

    public final com.paypal.oslo.feature.subscriptions.analytics.shared.ErrorModule getErrorModule() {
        return this.errorModule;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/analytics/shared/bulkfi/BulkFiScreenAnalytics$SelectionListModule;", "Lcom/paypal/oslo/feature/subscriptions/analytics/shared/SubscriptionsAnalyticsModule;", "Lcom/paypal/oslo/feature/subscriptions/api/analytics/SubscriptionsUserIntentContext;", "intent", "<init>", "(Lcom/paypal/oslo/feature/subscriptions/api/analytics/SubscriptionsUserIntentContext;)V", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/domain/MerchantContext;", "merchant", "Lcom/paypal/oslo/feature/subscriptions/analytics/shared/ItemAnalytics;", "checkbox", "(Lcom/paypal/oslo/core/telemetry/analytics/schema/context/domain/MerchantContext;)Lcom/paypal/oslo/feature/subscriptions/analytics/shared/ItemAnalytics;", "continueButton", "()Lcom/paypal/oslo/feature/subscriptions/analytics/shared/ItemAnalytics;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class SelectionListModule extends com.paypal.oslo.feature.subscriptions.analytics.shared.SubscriptionsAnalyticsModule {
        public static final java.lang.String CONTINUE_BUTTON = "continue_button";

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.subscriptions.analytics.shared.bulkfi.BulkFiScreenAnalytics.SelectionListModule.Companion INSTANCE = new com.paypal.oslo.feature.subscriptions.analytics.shared.bulkfi.BulkFiScreenAnalytics.SelectionListModule.Companion(null);
        public static final int $stable = 8;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SelectionListModule(com.paypal.oslo.feature.subscriptions.api.analytics.SubscriptionsUserIntentContext subscriptionsUserIntentContext) {
            super(com.paypal.oslo.feature.subscriptions.analytics.shared.bulkfi.BulkFiScreenAnalytics.INSTANCE.getCommonAction(subscriptionsUserIntentContext.getAgreementType()), INSTANCE.getName(subscriptionsUserIntentContext.getAgreementType()), subscriptionsUserIntentContext);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subscriptionsUserIntentContext, "");
        }

        public final com.paypal.oslo.feature.subscriptions.analytics.shared.ItemAnalytics checkbox(com.paypal.oslo.core.telemetry.analytics.schema.context.domain.MerchantContext merchant) {
            java.lang.String str;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchant, "");
            com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext withAction = getSubscriptionUserIntent().withAction(com.paypal.oslo.feature.subscriptions.analytics.shared.bulkfi.BulkFiScreenAnalytics.INSTANCE.getCommonAction(getSubscriptionUserIntent().getAgreementType()));
            com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType = getSubscriptionUserIntent().getAgreementType();
            if (kotlin.jvm.internal.Intrinsics.areEqual(agreementType, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Business.INSTANCE)) {
                str = "business_checkbox";
            } else {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(agreementType, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Subscription.INSTANCE)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                str = "subscription_checkbox";
            }
            return new com.paypal.oslo.feature.subscriptions.analytics.shared.ItemAnalytics(withAction, new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(str, 0, 2, null), kotlin.collections.CollectionsKt.listOf(merchant));
        }

        public final com.paypal.oslo.feature.subscriptions.analytics.shared.ItemAnalytics continueButton() {
            return new com.paypal.oslo.feature.subscriptions.analytics.shared.ItemAnalytics(getSubscriptionUserIntent().withAction(com.paypal.oslo.feature.subscriptions.analytics.shared.bulkfi.BulkFiScreenAnalytics.INSTANCE.getCommonAction(getSubscriptionUserIntent().getAgreementType())), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("continue_button", 0, 2, null), null, 4, null);
        }

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/analytics/shared/bulkfi/BulkFiScreenAnalytics$SelectionListModule$Companion;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "agreementType", "", "getName", "(Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;)Ljava/lang/String;", "CONTINUE_BUTTON", "Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final java.lang.String getName(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementType, "");
                if (kotlin.jvm.internal.Intrinsics.areEqual(agreementType, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Subscription.INSTANCE)) {
                    return "subscription_selection_list";
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(agreementType, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Business.INSTANCE)) {
                    return "business_selection_list";
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/analytics/shared/bulkfi/BulkFiScreenAnalytics$Companion;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "agreementType", "", "getCommonAction", "(Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;)Ljava/lang/String;", "errorModuleName", "CLOSE_BUTTON", "Ljava/lang/String;", "ACTION_CLOSE_BUTTON"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getCommonAction(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementType, "");
            if (kotlin.jvm.internal.Intrinsics.areEqual(agreementType, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Subscription.INSTANCE)) {
                return com.paypal.oslo.feature.subscriptions.api.analytics.AnalyticsScreenNames.ACTION_SUBSCRIPTIONS_BULK_FI;
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(agreementType, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Business.INSTANCE)) {
                return com.paypal.oslo.feature.subscriptions.api.analytics.AnalyticsScreenNames.ACTION_BUSINESSES_BULK_FI;
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }

        public final java.lang.String errorModuleName(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementType, "");
            if (kotlin.jvm.internal.Intrinsics.areEqual(agreementType, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Subscription.INSTANCE)) {
                return "subscription_error_state";
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(agreementType, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Business.INSTANCE)) {
                return "business_error_state";
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
