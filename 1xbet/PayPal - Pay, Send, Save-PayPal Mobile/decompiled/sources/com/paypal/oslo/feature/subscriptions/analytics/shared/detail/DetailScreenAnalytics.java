package com.paypal.oslo.feature.subscriptions.analytics.shared.detail;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u001f2\u00020\u0001:\u0003 !\u001fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\bR\u001a\u0010\f\u001a\u00020\u000b8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\u00158\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\u00020\u001a8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/analytics/shared/detail/DetailScreenAnalytics;", "Lcom/paypal/oslo/feature/subscriptions/analytics/shared/CommonScreenAnalytics;", "Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "agreementType", "<init>", "(Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;)V", "Lcom/paypal/oslo/feature/subscriptions/analytics/shared/ItemAnalytics;", "manageButton", "()Lcom/paypal/oslo/feature/subscriptions/analytics/shared/ItemAnalytics;", "infoButton", "closeButton", "Lcom/paypal/oslo/feature/subscriptions/api/analytics/SubscriptionsUserIntentContext$Detail;", "subscriptionUserIntent", "Lcom/paypal/oslo/feature/subscriptions/api/analytics/SubscriptionsUserIntentContext$Detail;", "getSubscriptionUserIntent", "()Lcom/paypal/oslo/feature/subscriptions/api/analytics/SubscriptionsUserIntentContext$Detail;", "Lcom/paypal/oslo/feature/subscriptions/analytics/shared/detail/DetailScreenAnalytics$PayingWithModule;", "payingWithModule", "Lcom/paypal/oslo/feature/subscriptions/analytics/shared/detail/DetailScreenAnalytics$PayingWithModule;", "getPayingWithModule", "()Lcom/paypal/oslo/feature/subscriptions/analytics/shared/detail/DetailScreenAnalytics$PayingWithModule;", "Lcom/paypal/oslo/feature/subscriptions/analytics/shared/detail/DetailScreenAnalytics$RecentActivityModule;", "recentActivityModule", "Lcom/paypal/oslo/feature/subscriptions/analytics/shared/detail/DetailScreenAnalytics$RecentActivityModule;", "getRecentActivityModule", "()Lcom/paypal/oslo/feature/subscriptions/analytics/shared/detail/DetailScreenAnalytics$RecentActivityModule;", "Lcom/paypal/oslo/feature/subscriptions/analytics/shared/ErrorModule;", "errorModule", "Lcom/paypal/oslo/feature/subscriptions/analytics/shared/ErrorModule;", "getErrorModule", "()Lcom/paypal/oslo/feature/subscriptions/analytics/shared/ErrorModule;", "Companion", "PayingWithModule", "RecentActivityModule"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DetailScreenAnalytics extends com.paypal.oslo.feature.subscriptions.analytics.shared.CommonScreenAnalytics {
    public static final java.lang.String ACTION_CLOSE_BUTTON = "dismiss";
    public static final java.lang.String CLOSE_BUTTON = "close_button";
    public static final java.lang.String INFO_BUTTON = "info_button";
    public static final java.lang.String MANAGE_BUTTON = "manage_button";
    public static final java.lang.String UPDATE_BUTTON = "update_button";
    private final com.paypal.oslo.feature.subscriptions.analytics.shared.ErrorModule errorModule;
    private final com.paypal.oslo.feature.subscriptions.analytics.shared.detail.DetailScreenAnalytics.PayingWithModule payingWithModule;
    private final com.paypal.oslo.feature.subscriptions.analytics.shared.detail.DetailScreenAnalytics.RecentActivityModule recentActivityModule;
    private final com.paypal.oslo.feature.subscriptions.api.analytics.SubscriptionsUserIntentContext.Detail subscriptionUserIntent;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.subscriptions.analytics.shared.detail.DetailScreenAnalytics.Companion INSTANCE = new com.paypal.oslo.feature.subscriptions.analytics.shared.detail.DetailScreenAnalytics.Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailScreenAnalytics(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType) {
        super(agreementType);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementType, "");
        this.subscriptionUserIntent = new com.paypal.oslo.feature.subscriptions.api.analytics.SubscriptionsUserIntentContext.Detail(com.paypal.oslo.feature.subscriptions.api.analytics.AnalyticsScreenNames.INSTANCE.agreementDetailsScreenNameWithAction(agreementType).getScreenName(), agreementType);
        this.payingWithModule = new com.paypal.oslo.feature.subscriptions.analytics.shared.detail.DetailScreenAnalytics.PayingWithModule(getSubscriptionUserIntent());
        this.recentActivityModule = new com.paypal.oslo.feature.subscriptions.analytics.shared.detail.DetailScreenAnalytics.RecentActivityModule(getSubscriptionUserIntent());
        this.errorModule = new com.paypal.oslo.feature.subscriptions.analytics.shared.ErrorModule(getSubscriptionUserIntent(), INSTANCE.errorModuleName(agreementType));
    }

    @Override // com.paypal.oslo.feature.subscriptions.analytics.shared.CommonScreenAnalytics
    public final com.paypal.oslo.feature.subscriptions.api.analytics.SubscriptionsUserIntentContext.Detail getSubscriptionUserIntent() {
        return this.subscriptionUserIntent;
    }

    public final com.paypal.oslo.feature.subscriptions.analytics.shared.ItemAnalytics manageButton() {
        return new com.paypal.oslo.feature.subscriptions.analytics.shared.ItemAnalytics(getSubscriptionUserIntent().withAction(INSTANCE.actionManageButton(getAgreementType())), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(MANAGE_BUTTON, 0, 2, null), null, 4, null);
    }

    public final com.paypal.oslo.feature.subscriptions.analytics.shared.ItemAnalytics infoButton() {
        return new com.paypal.oslo.feature.subscriptions.analytics.shared.ItemAnalytics(getSubscriptionUserIntent().withAction(INSTANCE.actionInfoButton(getAgreementType())), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("info_button", 0, 2, null), null, 4, null);
    }

    public final com.paypal.oslo.feature.subscriptions.analytics.shared.ItemAnalytics closeButton() {
        return new com.paypal.oslo.feature.subscriptions.analytics.shared.ItemAnalytics(getSubscriptionUserIntent().withAction("dismiss"), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("close_button", 0, 2, null), null, 4, null);
    }

    public final com.paypal.oslo.feature.subscriptions.analytics.shared.detail.DetailScreenAnalytics.PayingWithModule getPayingWithModule() {
        return this.payingWithModule;
    }

    public final com.paypal.oslo.feature.subscriptions.analytics.shared.detail.DetailScreenAnalytics.RecentActivityModule getRecentActivityModule() {
        return this.recentActivityModule;
    }

    public final com.paypal.oslo.feature.subscriptions.analytics.shared.ErrorModule getErrorModule() {
        return this.errorModule;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/analytics/shared/detail/DetailScreenAnalytics$PayingWithModule;", "Lcom/paypal/oslo/feature/subscriptions/analytics/shared/SubscriptionsAnalyticsModule;", "Lcom/paypal/oslo/feature/subscriptions/api/analytics/SubscriptionsUserIntentContext;", "intent", "<init>", "(Lcom/paypal/oslo/feature/subscriptions/api/analytics/SubscriptionsUserIntentContext;)V", "Lcom/paypal/oslo/feature/subscriptions/analytics/shared/ItemAnalytics;", "updateButton", "()Lcom/paypal/oslo/feature/subscriptions/analytics/shared/ItemAnalytics;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PayingWithModule extends com.paypal.oslo.feature.subscriptions.analytics.shared.SubscriptionsAnalyticsModule {
        public static final java.lang.String ACTION_UPDATE_BUTTON = "update_payment_method";
        public static final java.lang.String NAME = "paying_with";

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.subscriptions.analytics.shared.detail.DetailScreenAnalytics.PayingWithModule.Companion INSTANCE = new com.paypal.oslo.feature.subscriptions.analytics.shared.detail.DetailScreenAnalytics.PayingWithModule.Companion(null);
        public static final int $stable = 8;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PayingWithModule(com.paypal.oslo.feature.subscriptions.api.analytics.SubscriptionsUserIntentContext subscriptionsUserIntentContext) {
            super(INSTANCE.showAction(subscriptionsUserIntentContext.getAgreementType()), NAME, subscriptionsUserIntentContext);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subscriptionsUserIntentContext, "");
        }

        public final com.paypal.oslo.feature.subscriptions.analytics.shared.ItemAnalytics updateButton() {
            return new com.paypal.oslo.feature.subscriptions.analytics.shared.ItemAnalytics(getSubscriptionUserIntent().withAction(ACTION_UPDATE_BUTTON), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("update_button", 0, 2, null), null, 4, null);
        }

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/analytics/shared/detail/DetailScreenAnalytics$PayingWithModule$Companion;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "agreementType", "", "showAction", "(Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;)Ljava/lang/String;", "NAME", "Ljava/lang/String;", "ACTION_UPDATE_BUTTON"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final java.lang.String showAction(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementType, "");
                if (kotlin.jvm.internal.Intrinsics.areEqual(agreementType, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Business.INSTANCE)) {
                    return com.paypal.oslo.feature.subscriptions.api.analytics.AnalyticsScreenNames.ACTION_SCREEN_BUSINESS_DETAIL;
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(agreementType, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Subscription.INSTANCE)) {
                    return com.paypal.oslo.feature.subscriptions.api.analytics.AnalyticsScreenNames.ACTION_SCREEN_SUBSCRIPTION_DETAIL;
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/analytics/shared/detail/DetailScreenAnalytics$RecentActivityModule;", "Lcom/paypal/oslo/feature/subscriptions/analytics/shared/SubscriptionsAnalyticsModule;", "Lcom/paypal/oslo/feature/subscriptions/api/analytics/SubscriptionsUserIntentContext;", "intent", "<init>", "(Lcom/paypal/oslo/feature/subscriptions/api/analytics/SubscriptionsUserIntentContext;)V", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class RecentActivityModule extends com.paypal.oslo.feature.subscriptions.analytics.shared.SubscriptionsAnalyticsModule {
        public static final java.lang.String NAME = "recent_activity";

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.subscriptions.analytics.shared.detail.DetailScreenAnalytics.RecentActivityModule.Companion INSTANCE = new com.paypal.oslo.feature.subscriptions.analytics.shared.detail.DetailScreenAnalytics.RecentActivityModule.Companion(null);
        public static final int $stable = 8;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RecentActivityModule(com.paypal.oslo.feature.subscriptions.api.analytics.SubscriptionsUserIntentContext subscriptionsUserIntentContext) {
            super(INSTANCE.showAction(subscriptionsUserIntentContext.getAgreementType()), NAME, subscriptionsUserIntentContext);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subscriptionsUserIntentContext, "");
        }

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/analytics/shared/detail/DetailScreenAnalytics$RecentActivityModule$Companion;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "agreementType", "", "showAction", "(Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;)Ljava/lang/String;", "NAME", "Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final java.lang.String showAction(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementType, "");
                if (kotlin.jvm.internal.Intrinsics.areEqual(agreementType, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Business.INSTANCE)) {
                    return com.paypal.oslo.feature.subscriptions.api.analytics.AnalyticsScreenNames.ACTION_SCREEN_BUSINESS_DETAIL;
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(agreementType, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Subscription.INSTANCE)) {
                    return com.paypal.oslo.feature.subscriptions.api.analytics.AnalyticsScreenNames.ACTION_SCREEN_SUBSCRIPTION_DETAIL;
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u0014\u0010\u0010\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/analytics/shared/detail/DetailScreenAnalytics$Companion;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "agreementType", "", "actionInfoButton", "(Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;)Ljava/lang/String;", "actionManageButton", "errorModuleName", "MANAGE_BUTTON", "Ljava/lang/String;", "INFO_BUTTON", "CLOSE_BUTTON", "UPDATE_BUTTON", "ACTION_CLOSE_BUTTON"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String actionInfoButton(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementType, "");
            if (kotlin.jvm.internal.Intrinsics.areEqual(agreementType, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Business.INSTANCE)) {
                return "view_business_detail_info";
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(agreementType, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Subscription.INSTANCE)) {
                return "view_subscription_detail_info";
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }

        public final java.lang.String actionManageButton(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementType, "");
            if (kotlin.jvm.internal.Intrinsics.areEqual(agreementType, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Business.INSTANCE)) {
                return "manage_subscription";
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(agreementType, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Subscription.INSTANCE)) {
                return "manage_linked_business";
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }

        public final java.lang.String errorModuleName(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementType, "");
            if (kotlin.jvm.internal.Intrinsics.areEqual(agreementType, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Subscription.INSTANCE)) {
                return "subscription_detail_error";
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(agreementType, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Business.INSTANCE)) {
                return "business_detail_error";
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
