package com.paypal.oslo.feature.subscriptions.analytics.shared.linklist;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0002\u0019\u0018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\t8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/analytics/shared/linklist/LinkListScreenAnalytics;", "Lcom/paypal/oslo/feature/subscriptions/analytics/shared/CommonScreenAnalytics;", "Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "agreementType", "<init>", "(Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;)V", "Lcom/paypal/oslo/feature/subscriptions/analytics/shared/ItemAnalytics;", "closeButton", "()Lcom/paypal/oslo/feature/subscriptions/analytics/shared/ItemAnalytics;", "Lcom/paypal/oslo/feature/subscriptions/api/analytics/SubscriptionsUserIntentContext$Hub;", "subscriptionUserIntent", "Lcom/paypal/oslo/feature/subscriptions/api/analytics/SubscriptionsUserIntentContext$Hub;", "getSubscriptionUserIntent", "()Lcom/paypal/oslo/feature/subscriptions/api/analytics/SubscriptionsUserIntentContext$Hub;", "Lcom/paypal/oslo/feature/subscriptions/analytics/shared/linklist/LinkListScreenAnalytics$MerchantListAnalyticsModule;", "merchantListAnalyticsModule", "Lcom/paypal/oslo/feature/subscriptions/analytics/shared/linklist/LinkListScreenAnalytics$MerchantListAnalyticsModule;", "getMerchantListAnalyticsModule", "()Lcom/paypal/oslo/feature/subscriptions/analytics/shared/linklist/LinkListScreenAnalytics$MerchantListAnalyticsModule;", "Lcom/paypal/oslo/feature/subscriptions/analytics/shared/ErrorModule;", "errorModule", "Lcom/paypal/oslo/feature/subscriptions/analytics/shared/ErrorModule;", "getErrorModule", "()Lcom/paypal/oslo/feature/subscriptions/analytics/shared/ErrorModule;", "Companion", "MerchantListAnalyticsModule"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class LinkListScreenAnalytics extends com.paypal.oslo.feature.subscriptions.analytics.shared.CommonScreenAnalytics {
    public static final java.lang.String ACTION_CLOSE = "dismiss";
    public static final java.lang.String CLOSE_BUTTON = "close_button";
    public static final java.lang.String HOW_TO_LINK_BUTTON = "how_to_link_button";
    private final com.paypal.oslo.feature.subscriptions.analytics.shared.ErrorModule errorModule;
    private final com.paypal.oslo.feature.subscriptions.analytics.shared.linklist.LinkListScreenAnalytics.MerchantListAnalyticsModule merchantListAnalyticsModule;
    private final com.paypal.oslo.feature.subscriptions.api.analytics.SubscriptionsUserIntentContext.Hub subscriptionUserIntent;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.subscriptions.analytics.shared.linklist.LinkListScreenAnalytics.Companion INSTANCE = new com.paypal.oslo.feature.subscriptions.analytics.shared.linklist.LinkListScreenAnalytics.Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkListScreenAnalytics(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType) {
        super(agreementType);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementType, "");
        this.subscriptionUserIntent = new com.paypal.oslo.feature.subscriptions.api.analytics.SubscriptionsUserIntentContext.Hub(com.paypal.oslo.feature.subscriptions.api.analytics.AnalyticsScreenNames.INSTANCE.linkListScreenNameWithAction(agreementType).getScreenName(), agreementType);
        this.merchantListAnalyticsModule = new com.paypal.oslo.feature.subscriptions.analytics.shared.linklist.LinkListScreenAnalytics.MerchantListAnalyticsModule(getSubscriptionUserIntent());
        this.errorModule = new com.paypal.oslo.feature.subscriptions.analytics.shared.ErrorModule(getSubscriptionUserIntent(), INSTANCE.errorModuleName(agreementType));
    }

    @Override // com.paypal.oslo.feature.subscriptions.analytics.shared.CommonScreenAnalytics
    public final com.paypal.oslo.feature.subscriptions.api.analytics.SubscriptionsUserIntentContext.Hub getSubscriptionUserIntent() {
        return this.subscriptionUserIntent;
    }

    public final com.paypal.oslo.feature.subscriptions.analytics.shared.ItemAnalytics closeButton() {
        return new com.paypal.oslo.feature.subscriptions.analytics.shared.ItemAnalytics(getSubscriptionUserIntent().withAction("dismiss"), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("close_button", 0, 2, null), null, 4, null);
    }

    public final com.paypal.oslo.feature.subscriptions.analytics.shared.linklist.LinkListScreenAnalytics.MerchantListAnalyticsModule getMerchantListAnalyticsModule() {
        return this.merchantListAnalyticsModule;
    }

    public final com.paypal.oslo.feature.subscriptions.analytics.shared.ErrorModule getErrorModule() {
        return this.errorModule;
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/analytics/shared/linklist/LinkListScreenAnalytics$MerchantListAnalyticsModule;", "Lcom/paypal/oslo/feature/subscriptions/analytics/shared/SubscriptionsAnalyticsModule;", "Lcom/paypal/oslo/feature/subscriptions/api/analytics/SubscriptionsUserIntentContext;", "intent", "<init>", "(Lcom/paypal/oslo/feature/subscriptions/api/analytics/SubscriptionsUserIntentContext;)V", "Lcom/paypal/oslo/feature/subscriptions/analytics/shared/ItemAnalytics;", "howToLinkButton", "()Lcom/paypal/oslo/feature/subscriptions/analytics/shared/ItemAnalytics;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/domain/MerchantContext;", "merchant", "linkButton", "(Lcom/paypal/oslo/core/telemetry/analytics/schema/context/domain/MerchantContext;)Lcom/paypal/oslo/feature/subscriptions/analytics/shared/ItemAnalytics;", "searchButton", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class MerchantListAnalyticsModule extends com.paypal.oslo.feature.subscriptions.analytics.shared.SubscriptionsAnalyticsModule {
        public static final java.lang.String ACTION_HOW_TO_LINK = "view_how_to_link";
        public static final java.lang.String ACTION_LINK_BUTTON = "link_merchant";
        public static final java.lang.String LINK_BUTTON = "link_button";
        public static final java.lang.String SEARCH_BUTTON = "search_button";

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.subscriptions.analytics.shared.linklist.LinkListScreenAnalytics.MerchantListAnalyticsModule.Companion INSTANCE = new com.paypal.oslo.feature.subscriptions.analytics.shared.linklist.LinkListScreenAnalytics.MerchantListAnalyticsModule.Companion(null);
        public static final int $stable = 8;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MerchantListAnalyticsModule(com.paypal.oslo.feature.subscriptions.api.analytics.SubscriptionsUserIntentContext subscriptionsUserIntentContext) {
            super(com.paypal.oslo.feature.subscriptions.analytics.shared.linklist.LinkListScreenAnalytics.INSTANCE.commonShownAction(subscriptionsUserIntentContext.getAgreementType()), INSTANCE.getName(subscriptionsUserIntentContext.getAgreementType()), subscriptionsUserIntentContext);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subscriptionsUserIntentContext, "");
        }

        public final com.paypal.oslo.feature.subscriptions.analytics.shared.ItemAnalytics howToLinkButton() {
            return new com.paypal.oslo.feature.subscriptions.analytics.shared.ItemAnalytics(getSubscriptionUserIntent().withAction(ACTION_HOW_TO_LINK), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(com.paypal.oslo.feature.subscriptions.analytics.shared.linklist.LinkListScreenAnalytics.HOW_TO_LINK_BUTTON, 0, 2, null), null, 4, null);
        }

        public final com.paypal.oslo.feature.subscriptions.analytics.shared.ItemAnalytics linkButton(com.paypal.oslo.core.telemetry.analytics.schema.context.domain.MerchantContext merchant) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchant, "");
            return new com.paypal.oslo.feature.subscriptions.analytics.shared.ItemAnalytics(getSubscriptionUserIntent().withAction(ACTION_LINK_BUTTON), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(LINK_BUTTON, 0, 2, null), kotlin.collections.CollectionsKt.listOf(merchant));
        }

        public final com.paypal.oslo.feature.subscriptions.analytics.shared.ItemAnalytics searchButton() {
            return new com.paypal.oslo.feature.subscriptions.analytics.shared.ItemAnalytics(getSubscriptionUserIntent().withAction("search_merchant"), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(SEARCH_BUTTON, 0, 2, null), null, 4, null);
        }

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/analytics/shared/linklist/LinkListScreenAnalytics$MerchantListAnalyticsModule$Companion;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "agreementType", "", "getName", "(Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;)Ljava/lang/String;", "LINK_BUTTON", "Ljava/lang/String;", "SEARCH_BUTTON", "ACTION_HOW_TO_LINK", "ACTION_LINK_BUTTON"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final java.lang.String getName(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementType, "");
                if (kotlin.jvm.internal.Intrinsics.areEqual(agreementType, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Subscription.INSTANCE)) {
                    return "subscriptions_merchant_list";
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(agreementType, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Business.INSTANCE)) {
                    return "businesses_merchant_list";
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/analytics/shared/linklist/LinkListScreenAnalytics$Companion;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "agreementType", "", "commonShownAction", "(Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;)Ljava/lang/String;", "errorModuleName", "HOW_TO_LINK_BUTTON", "Ljava/lang/String;", "CLOSE_BUTTON", "ACTION_CLOSE"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String commonShownAction(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementType, "");
            return com.paypal.oslo.feature.subscriptions.api.analytics.AnalyticsScreenNames.INSTANCE.linkListScreenNameWithAction(agreementType).getInitialScreenAction();
        }

        public final java.lang.String errorModuleName(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementType, "");
            if (kotlin.jvm.internal.Intrinsics.areEqual(agreementType, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Subscription.INSTANCE)) {
                return "link_list_error";
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(agreementType, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Business.INSTANCE)) {
                return "link_businesses_list_error";
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
