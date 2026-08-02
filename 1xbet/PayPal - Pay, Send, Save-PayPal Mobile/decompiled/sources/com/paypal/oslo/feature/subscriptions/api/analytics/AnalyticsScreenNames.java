package com.paypal.oslo.feature.subscriptions.api.analytics;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b(\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\rJ\u0015\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\rJ\u0015\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\bR\u0014\u0010\u0014\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0015R\u0014\u0010\u001b\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0015R\u0014\u0010\u001c\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0015R\u0014\u0010\u001d\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0015R\u0014\u0010\u001e\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0015R\u0014\u0010\u001f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0015R\u0014\u0010 \u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u0015R\u0014\u0010!\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u0015R\u0014\u0010\"\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u0015R\u0014\u0010#\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\u0015R\u0014\u0010$\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\u0015R\u0014\u0010%\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010\u0015R\u0014\u0010&\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\u0015R\u0014\u0010'\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010\u0015R\u0014\u0010(\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010\u0015R\u0014\u0010)\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010\u0015R\u0014\u0010*\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b*\u0010\u0015R\u0014\u0010+\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b+\u0010\u0015R\u0014\u0010,\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b,\u0010\u0015R\u0014\u0010-\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b-\u0010\u0015R\u0014\u0010.\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b.\u0010\u0015R\u0014\u0010/\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b/\u0010\u0015R\u0014\u00100\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b0\u0010\u0015R\u0014\u00101\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b1\u0010\u0015R\u0014\u00102\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b2\u0010\u0015R\u0014\u00103\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b3\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/api/analytics/AnalyticsScreenNames;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "agreementType", "Lcom/paypal/oslo/feature/subscriptions/api/analytics/ScreenNameAndAction;", "hubScreenNameWithAction", "(Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;)Lcom/paypal/oslo/feature/subscriptions/api/analytics/ScreenNameAndAction;", "agreementDetailsScreenNameWithAction", "linkListScreenNameWithAction", "", "detailInfoScreenName", "(Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;)Ljava/lang/String;", "manageOptionsScreenName", "unlinkConfirmScreenName", "unlinkSuccessScreenName", "updateFiScreenName", "updateFiSuccessScreenName", "bulkFiScreenNameWithAction", "SCREEN_ME_SUBSCRIPTIONS", "Ljava/lang/String;", "ACTION_VIEW_HUB", "SUBSCRIPTIONS_HUB_INFO", "ACTION_VIEW_SUBSCRIPTIONS_HUB_INFO", "SCREEN_SETTINGS_LINKED_BUSINESSES", "ACTION_VIEW_LINKED_BUSINESSES", "BUSINESSES_HUB_INFO", "ACTION_BUSINESS_HUB_INFO", "SCREEN_SUBSCRIPTION_DETAIL", "ACTION_SCREEN_SUBSCRIPTION_DETAIL", "SCREEN_BUSINESS_DETAIL", "ACTION_SCREEN_BUSINESS_DETAIL", "SUBSCRIPTION_DETAIL_INFO", "BUSINESS_DETAIL_INFO", "SUBSCRIPTIONS_LINK_LIST", "LINK_BUSINESSES_LIST", "SUBSCRIPTION_MANAGE_OPTIONS", "BUSINESS_MANAGE_OPTIONS", "SUBSCRIPTION_UNLINK_CONFIRM", "BUSINESS_UNLINK_CONFIRM", "SUBSCRIPTION_UNLINK_SUCCESS", "BUSINESS_UNLINK_SUCCESS", "SUBSCRIPTION_UPDATE_FI", "BUSINESS_UPDATE_FI", "SUBSCRIPTION_UPDATE_FI_SUCCESS", "BUSINESS_UPDATE_FI_SUCCESS", "SUBSCRIPTIONS_BULK_FI", "ACTION_SUBSCRIPTIONS_BULK_FI", "BUSINESSES_BULK_FI", "ACTION_BUSINESSES_BULK_FI", "BULK_FI_POST_UPDATE"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AnalyticsScreenNames {
    public static final java.lang.String ACTION_BUSINESSES_BULK_FI = "manage_payment_methods";
    public static final java.lang.String ACTION_BUSINESS_HUB_INFO = "view_linked_businesses";
    public static final java.lang.String ACTION_SCREEN_BUSINESS_DETAIL = "view_business_detail";
    public static final java.lang.String ACTION_SCREEN_SUBSCRIPTION_DETAIL = "view_subscription_detail";
    public static final java.lang.String ACTION_SUBSCRIPTIONS_BULK_FI = "update_payment_methods";
    public static final java.lang.String ACTION_VIEW_HUB = "view_subscriptions";
    public static final java.lang.String ACTION_VIEW_LINKED_BUSINESSES = "view_linked_businesses";
    public static final java.lang.String ACTION_VIEW_SUBSCRIPTIONS_HUB_INFO = "view_subscriptions_info";
    public static final java.lang.String BULK_FI_POST_UPDATE = "bulk_fi_post_update";
    public static final java.lang.String BUSINESSES_BULK_FI = "businesses_bulk_fi";
    public static final java.lang.String BUSINESSES_HUB_INFO = "settings_linked_businesses_info";
    public static final java.lang.String BUSINESS_DETAIL_INFO = "business_detail_info";
    public static final java.lang.String BUSINESS_MANAGE_OPTIONS = "business_manage_options";
    public static final java.lang.String BUSINESS_UNLINK_CONFIRM = "business_unlink_confirm";
    public static final java.lang.String BUSINESS_UNLINK_SUCCESS = "business_unlink_success";
    public static final java.lang.String BUSINESS_UPDATE_FI = "business_update_fi";
    public static final java.lang.String BUSINESS_UPDATE_FI_SUCCESS = "business_update_fi_success";
    public static final com.paypal.oslo.feature.subscriptions.api.analytics.AnalyticsScreenNames INSTANCE = new com.paypal.oslo.feature.subscriptions.api.analytics.AnalyticsScreenNames();
    public static final java.lang.String LINK_BUSINESSES_LIST = "link_businesses_list";
    public static final java.lang.String SCREEN_BUSINESS_DETAIL = "business_detail";
    public static final java.lang.String SCREEN_ME_SUBSCRIPTIONS = "me_subscriptions";
    public static final java.lang.String SCREEN_SETTINGS_LINKED_BUSINESSES = "settings_linked_businesses";
    public static final java.lang.String SCREEN_SUBSCRIPTION_DETAIL = "subscription_detail";
    public static final java.lang.String SUBSCRIPTIONS_BULK_FI = "subscriptions_bulk_fi";
    public static final java.lang.String SUBSCRIPTIONS_HUB_INFO = "me_subscriptions_info";
    public static final java.lang.String SUBSCRIPTIONS_LINK_LIST = "subscriptions_link_list";
    public static final java.lang.String SUBSCRIPTION_DETAIL_INFO = "subscription_detail_info";
    public static final java.lang.String SUBSCRIPTION_MANAGE_OPTIONS = "subscription_manage_options";
    public static final java.lang.String SUBSCRIPTION_UNLINK_CONFIRM = "subscription_unlink_confirm";
    public static final java.lang.String SUBSCRIPTION_UNLINK_SUCCESS = "subscription_unlink_success";
    public static final java.lang.String SUBSCRIPTION_UPDATE_FI = "subscription_update_fi";
    public static final java.lang.String SUBSCRIPTION_UPDATE_FI_SUCCESS = "subscription_update_fi_success";

    private AnalyticsScreenNames() {
    }

    public final com.paypal.oslo.feature.subscriptions.api.analytics.ScreenNameAndAction hubScreenNameWithAction(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType) {
        java.lang.String str;
        java.lang.String str2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementType, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(agreementType, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Subscription.INSTANCE)) {
            str = SCREEN_ME_SUBSCRIPTIONS;
        } else {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(agreementType, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Business.INSTANCE)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            str = SCREEN_SETTINGS_LINKED_BUSINESSES;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(agreementType, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Subscription.INSTANCE)) {
            str2 = "view_subscriptions";
        } else {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(agreementType, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Business.INSTANCE)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            str2 = "view_linked_businesses";
        }
        return new com.paypal.oslo.feature.subscriptions.api.analytics.ScreenNameAndAction(str, str2);
    }

    public final com.paypal.oslo.feature.subscriptions.api.analytics.ScreenNameAndAction agreementDetailsScreenNameWithAction(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType) {
        java.lang.String str;
        java.lang.String str2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementType, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(agreementType, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Subscription.INSTANCE)) {
            str = "subscription_detail";
        } else {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(agreementType, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Business.INSTANCE)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            str = "business_detail";
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(agreementType, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Subscription.INSTANCE)) {
            str2 = ACTION_SCREEN_SUBSCRIPTION_DETAIL;
        } else {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(agreementType, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Business.INSTANCE)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            str2 = ACTION_SCREEN_BUSINESS_DETAIL;
        }
        return new com.paypal.oslo.feature.subscriptions.api.analytics.ScreenNameAndAction(str, str2);
    }

    public final com.paypal.oslo.feature.subscriptions.api.analytics.ScreenNameAndAction linkListScreenNameWithAction(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType) {
        java.lang.String str;
        java.lang.String str2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementType, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(agreementType, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Subscription.INSTANCE)) {
            str = SUBSCRIPTIONS_LINK_LIST;
        } else {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(agreementType, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Business.INSTANCE)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            str = LINK_BUSINESSES_LIST;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(agreementType, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Subscription.INSTANCE)) {
            str2 = "view_link_list";
        } else {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(agreementType, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Business.INSTANCE)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            str2 = "link_paypal";
        }
        return new com.paypal.oslo.feature.subscriptions.api.analytics.ScreenNameAndAction(str, str2);
    }

    public final java.lang.String detailInfoScreenName(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementType, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(agreementType, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Subscription.INSTANCE)) {
            return SUBSCRIPTION_DETAIL_INFO;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(agreementType, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Business.INSTANCE)) {
            return BUSINESS_DETAIL_INFO;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public final java.lang.String manageOptionsScreenName(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementType, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(agreementType, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Subscription.INSTANCE)) {
            return SUBSCRIPTION_MANAGE_OPTIONS;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(agreementType, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Business.INSTANCE)) {
            return BUSINESS_MANAGE_OPTIONS;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public final java.lang.String unlinkConfirmScreenName(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementType, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(agreementType, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Subscription.INSTANCE)) {
            return SUBSCRIPTION_UNLINK_CONFIRM;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(agreementType, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Business.INSTANCE)) {
            return BUSINESS_UNLINK_CONFIRM;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public final java.lang.String unlinkSuccessScreenName(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementType, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(agreementType, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Subscription.INSTANCE)) {
            return SUBSCRIPTION_UNLINK_SUCCESS;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(agreementType, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Business.INSTANCE)) {
            return BUSINESS_UNLINK_SUCCESS;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public final java.lang.String updateFiScreenName(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementType, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(agreementType, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Subscription.INSTANCE)) {
            return SUBSCRIPTION_UPDATE_FI;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(agreementType, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Business.INSTANCE)) {
            return BUSINESS_UPDATE_FI;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public final java.lang.String updateFiSuccessScreenName(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementType, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(agreementType, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Subscription.INSTANCE)) {
            return SUBSCRIPTION_UPDATE_FI_SUCCESS;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(agreementType, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Business.INSTANCE)) {
            return BUSINESS_UPDATE_FI_SUCCESS;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public final com.paypal.oslo.feature.subscriptions.api.analytics.ScreenNameAndAction bulkFiScreenNameWithAction(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType) {
        java.lang.String str;
        java.lang.String str2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementType, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(agreementType, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Subscription.INSTANCE)) {
            str = SUBSCRIPTIONS_BULK_FI;
        } else {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(agreementType, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Business.INSTANCE)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            str = BUSINESSES_BULK_FI;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(agreementType, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Subscription.INSTANCE)) {
            str2 = ACTION_SUBSCRIPTIONS_BULK_FI;
        } else {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(agreementType, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Business.INSTANCE)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            str2 = ACTION_BUSINESSES_BULK_FI;
        }
        return new com.paypal.oslo.feature.subscriptions.api.analytics.ScreenNameAndAction(str, str2);
    }
}
