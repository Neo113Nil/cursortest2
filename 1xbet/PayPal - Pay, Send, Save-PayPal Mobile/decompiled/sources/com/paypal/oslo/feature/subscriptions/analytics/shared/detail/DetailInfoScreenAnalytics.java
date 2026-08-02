package com.paypal.oslo.feature.subscriptions.analytics.shared.detail;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0002\u0016\u0015B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\u00020\u000b8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/analytics/shared/detail/DetailInfoScreenAnalytics;", "Lcom/paypal/oslo/feature/subscriptions/analytics/shared/CommonScreenAnalytics;", "Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "agreementType", "<init>", "(Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;)V", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/domain/MerchantContext;", "merchant", "Lcom/paypal/oslo/feature/subscriptions/analytics/shared/ItemAnalytics;", "closeButton", "(Lcom/paypal/oslo/core/telemetry/analytics/schema/context/domain/MerchantContext;)Lcom/paypal/oslo/feature/subscriptions/analytics/shared/ItemAnalytics;", "Lcom/paypal/oslo/feature/subscriptions/api/analytics/SubscriptionsUserIntentContext$Detail;", "subscriptionUserIntent", "Lcom/paypal/oslo/feature/subscriptions/api/analytics/SubscriptionsUserIntentContext$Detail;", "getSubscriptionUserIntent", "()Lcom/paypal/oslo/feature/subscriptions/api/analytics/SubscriptionsUserIntentContext$Detail;", "Lcom/paypal/oslo/feature/subscriptions/analytics/shared/detail/DetailInfoScreenAnalytics$InfoDetailsModule;", "infoDetailsModule", "Lcom/paypal/oslo/feature/subscriptions/analytics/shared/detail/DetailInfoScreenAnalytics$InfoDetailsModule;", "getInfoDetailsModule", "()Lcom/paypal/oslo/feature/subscriptions/analytics/shared/detail/DetailInfoScreenAnalytics$InfoDetailsModule;", "Companion", "InfoDetailsModule"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DetailInfoScreenAnalytics extends com.paypal.oslo.feature.subscriptions.analytics.shared.CommonScreenAnalytics {
    public static final java.lang.String CLOSE_BUTTON = "close_button";
    public static final java.lang.String COPY_BILLING_ID_BUTTON = "copy_billing_id_button";
    public static final java.lang.String COPY_BUSINESS_CONTACT_BUTTON = "copy_business_contact_button";
    private final com.paypal.oslo.feature.subscriptions.analytics.shared.detail.DetailInfoScreenAnalytics.InfoDetailsModule infoDetailsModule;
    private final com.paypal.oslo.feature.subscriptions.api.analytics.SubscriptionsUserIntentContext.Detail subscriptionUserIntent;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailInfoScreenAnalytics(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType) {
        super(agreementType);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementType, "");
        this.subscriptionUserIntent = new com.paypal.oslo.feature.subscriptions.api.analytics.SubscriptionsUserIntentContext.Detail(com.paypal.oslo.feature.subscriptions.api.analytics.AnalyticsScreenNames.INSTANCE.detailInfoScreenName(agreementType), agreementType);
        this.infoDetailsModule = new com.paypal.oslo.feature.subscriptions.analytics.shared.detail.DetailInfoScreenAnalytics.InfoDetailsModule(getSubscriptionUserIntent());
    }

    @Override // com.paypal.oslo.feature.subscriptions.analytics.shared.CommonScreenAnalytics
    public final com.paypal.oslo.feature.subscriptions.api.analytics.SubscriptionsUserIntentContext.Detail getSubscriptionUserIntent() {
        return this.subscriptionUserIntent;
    }

    public final com.paypal.oslo.feature.subscriptions.analytics.shared.ItemAnalytics closeButton(com.paypal.oslo.core.telemetry.analytics.schema.context.domain.MerchantContext merchant) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchant, "");
        return new com.paypal.oslo.feature.subscriptions.analytics.shared.ItemAnalytics(getSubscriptionUserIntent().withAction(""), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("close_button", 0, 2, null), kotlin.collections.CollectionsKt.listOf(merchant));
    }

    public final com.paypal.oslo.feature.subscriptions.analytics.shared.detail.DetailInfoScreenAnalytics.InfoDetailsModule getInfoDetailsModule() {
        return this.infoDetailsModule;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/analytics/shared/detail/DetailInfoScreenAnalytics$InfoDetailsModule;", "Lcom/paypal/oslo/feature/subscriptions/analytics/shared/SubscriptionsAnalyticsModule;", "Lcom/paypal/oslo/feature/subscriptions/api/analytics/SubscriptionsUserIntentContext;", "intent", "<init>", "(Lcom/paypal/oslo/feature/subscriptions/api/analytics/SubscriptionsUserIntentContext;)V", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/domain/MerchantContext;", "merchant", "Lcom/paypal/oslo/feature/subscriptions/analytics/shared/ItemAnalytics;", "copyBillingId", "(Lcom/paypal/oslo/core/telemetry/analytics/schema/context/domain/MerchantContext;)Lcom/paypal/oslo/feature/subscriptions/analytics/shared/ItemAnalytics;", "copyBusinessContact", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class InfoDetailsModule extends com.paypal.oslo.feature.subscriptions.analytics.shared.SubscriptionsAnalyticsModule {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.subscriptions.analytics.shared.detail.DetailInfoScreenAnalytics.InfoDetailsModule.Companion INSTANCE = new com.paypal.oslo.feature.subscriptions.analytics.shared.detail.DetailInfoScreenAnalytics.InfoDetailsModule.Companion(null);
        public static final int $stable = 8;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public InfoDetailsModule(com.paypal.oslo.feature.subscriptions.api.analytics.SubscriptionsUserIntentContext subscriptionsUserIntentContext) {
            super(r0.getShownAction(subscriptionsUserIntentContext.getAgreementType()), r0.getName(subscriptionsUserIntentContext.getAgreementType()), subscriptionsUserIntentContext);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subscriptionsUserIntentContext, "");
            com.paypal.oslo.feature.subscriptions.analytics.shared.detail.DetailInfoScreenAnalytics.InfoDetailsModule.Companion companion = INSTANCE;
        }

        public final com.paypal.oslo.feature.subscriptions.analytics.shared.ItemAnalytics copyBillingId(com.paypal.oslo.core.telemetry.analytics.schema.context.domain.MerchantContext merchant) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchant, "");
            return new com.paypal.oslo.feature.subscriptions.analytics.shared.ItemAnalytics(getSubscriptionUserIntent().withAction(""), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(com.paypal.oslo.feature.subscriptions.analytics.shared.detail.DetailInfoScreenAnalytics.COPY_BILLING_ID_BUTTON, 0, 2, null), kotlin.collections.CollectionsKt.listOf(merchant));
        }

        public final com.paypal.oslo.feature.subscriptions.analytics.shared.ItemAnalytics copyBusinessContact(com.paypal.oslo.core.telemetry.analytics.schema.context.domain.MerchantContext merchant) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchant, "");
            return new com.paypal.oslo.feature.subscriptions.analytics.shared.ItemAnalytics(getSubscriptionUserIntent().withAction(""), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(com.paypal.oslo.feature.subscriptions.analytics.shared.detail.DetailInfoScreenAnalytics.COPY_BUSINESS_CONTACT_BUTTON, 0, 2, null), kotlin.collections.CollectionsKt.listOf(merchant));
        }

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/analytics/shared/detail/DetailInfoScreenAnalytics$InfoDetailsModule$Companion;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "agreementType", "", "getName", "(Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;)Ljava/lang/String;", "getShownAction"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final java.lang.String getName(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementType, "");
                if (kotlin.jvm.internal.Intrinsics.areEqual(agreementType, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Subscription.INSTANCE)) {
                    return "subscription_info_details";
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(agreementType, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Business.INSTANCE)) {
                    return "business_info_details";
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }

            public final java.lang.String getShownAction(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementType, "");
                return getName(agreementType);
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }
}
