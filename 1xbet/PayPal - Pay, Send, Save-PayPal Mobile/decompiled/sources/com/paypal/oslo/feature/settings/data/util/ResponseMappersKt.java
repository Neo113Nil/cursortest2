package com.paypal.oslo.feature.settings.data.util;

@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\u0014H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0013\u0010\u001a\u001a\u00020\u0019*\u00020\u0018H\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u001d*\u00020\u001cH\u0000¢\u0006\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/settings/data/model/SettingsMockResponse;", "Lcom/paypal/oslo/feature/settings/domain/model/SettingsResult;", "mapToSettingsResult", "(Lcom/paypal/oslo/feature/settings/data/model/SettingsMockResponse;)Lcom/paypal/oslo/feature/settings/domain/model/SettingsResult;", "Lcom/paypal/oslo/feature/settings/data/model/AccountSettingsMockResponse;", "Lcom/paypal/oslo/feature/settings/domain/model/AccountSettingsData;", "mapToAccountSettingsData", "(Lcom/paypal/oslo/feature/settings/data/model/AccountSettingsMockResponse;)Lcom/paypal/oslo/feature/settings/domain/model/AccountSettingsData;", "Lcom/paypal/oslo/feature/settings/data/model/PaymentPreferencesMockResponse;", "Lcom/paypal/oslo/feature/settings/domain/model/PaymentPreferencesSettingsData;", "mapToPaymentPreferencesSettingsData", "(Lcom/paypal/oslo/feature/settings/data/model/PaymentPreferencesMockResponse;)Lcom/paypal/oslo/feature/settings/domain/model/PaymentPreferencesSettingsData;", "Lcom/paypal/oslo/feature/settings/data/model/DataAndPrivacyMockResponse;", "Lcom/paypal/oslo/feature/settings/domain/model/DataAndPrivacySettingsData;", "mapToDataAndPrivacySettingsData", "(Lcom/paypal/oslo/feature/settings/data/model/DataAndPrivacyMockResponse;)Lcom/paypal/oslo/feature/settings/domain/model/DataAndPrivacySettingsData;", "Lcom/paypal/oslo/feature/settings/data/model/NotificationPreferencesMockResponse;", "Lcom/paypal/oslo/feature/settings/domain/model/NotificationPreferencesSettingsData;", "mapToNotificationPreferencesSettingsData", "(Lcom/paypal/oslo/feature/settings/data/model/NotificationPreferencesMockResponse;)Lcom/paypal/oslo/feature/settings/domain/model/NotificationPreferencesSettingsData;", "Lcom/paypal/oslo/feature/settings/data/model/HelpAndSupportMockResponse;", "Lcom/paypal/oslo/feature/settings/domain/model/HelpAndSupportSettingsData;", "mapToHelpAndSupportSettingsData", "(Lcom/paypal/oslo/feature/settings/data/model/HelpAndSupportMockResponse;)Lcom/paypal/oslo/feature/settings/domain/model/HelpAndSupportSettingsData;", "Lcom/paypal/oslo/feature/settings/data/model/SettingsItemMockResponse;", "Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemData;", "mapToSettingsItemData", "(Lcom/paypal/oslo/feature/settings/data/model/SettingsItemMockResponse;)Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemData;", "Lcom/paypal/oslo/feature/settings/data/model/BadgeStateMockResponse;", "Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemStatus;", "mapToStatus", "(Lcom/paypal/oslo/feature/settings/data/model/BadgeStateMockResponse;)Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemStatus;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ResponseMappersKt {
    public static final com.paypal.oslo.feature.settings.domain.model.SettingsResult mapToSettingsResult(com.paypal.oslo.feature.settings.data.model.SettingsMockResponse settingsMockResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsMockResponse, "");
        com.paypal.oslo.feature.settings.domain.model.AccountSettingsData mapToAccountSettingsData = mapToAccountSettingsData(settingsMockResponse.getAccountSettingsMockResponse());
        com.paypal.oslo.feature.settings.data.model.PaymentPreferencesMockResponse paymentPreferencesMockResponse = settingsMockResponse.getPaymentPreferencesMockResponse();
        com.paypal.oslo.feature.settings.domain.model.PaymentPreferencesSettingsData mapToPaymentPreferencesSettingsData = paymentPreferencesMockResponse != null ? mapToPaymentPreferencesSettingsData(paymentPreferencesMockResponse) : null;
        com.paypal.oslo.feature.settings.data.model.DataAndPrivacyMockResponse dataAndPrivacyMockResponse = settingsMockResponse.getDataAndPrivacyMockResponse();
        com.paypal.oslo.feature.settings.domain.model.DataAndPrivacySettingsData mapToDataAndPrivacySettingsData = dataAndPrivacyMockResponse != null ? mapToDataAndPrivacySettingsData(dataAndPrivacyMockResponse) : null;
        com.paypal.oslo.feature.settings.data.model.NotificationPreferencesMockResponse notificationPreferencesMockResponse = settingsMockResponse.getNotificationPreferencesMockResponse();
        com.paypal.oslo.feature.settings.domain.model.NotificationPreferencesSettingsData mapToNotificationPreferencesSettingsData = notificationPreferencesMockResponse != null ? mapToNotificationPreferencesSettingsData(notificationPreferencesMockResponse) : null;
        com.paypal.oslo.feature.settings.data.model.HelpAndSupportMockResponse helpAndSupportMockResponse = settingsMockResponse.getHelpAndSupportMockResponse();
        return new com.paypal.oslo.feature.settings.domain.model.SettingsResult(mapToAccountSettingsData, mapToPaymentPreferencesSettingsData, mapToDataAndPrivacySettingsData, mapToNotificationPreferencesSettingsData, helpAndSupportMockResponse != null ? mapToHelpAndSupportSettingsData(helpAndSupportMockResponse) : null);
    }

    public static final com.paypal.oslo.feature.settings.domain.model.AccountSettingsData mapToAccountSettingsData(com.paypal.oslo.feature.settings.data.model.AccountSettingsMockResponse accountSettingsMockResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountSettingsMockResponse, "");
        return new com.paypal.oslo.feature.settings.domain.model.AccountSettingsData(mapToSettingsItemData(accountSettingsMockResponse.getProfileName()), mapToSettingsItemData(accountSettingsMockResponse.getEmail()), mapToSettingsItemData(accountSettingsMockResponse.getPhoneNumber()), null, null, mapToSettingsItemData(accountSettingsMockResponse.getProfileVisibility()), mapToSettingsItemData(accountSettingsMockResponse.getStatementAndTaxes()), 16, null);
    }

    public static final com.paypal.oslo.feature.settings.domain.model.PaymentPreferencesSettingsData mapToPaymentPreferencesSettingsData(com.paypal.oslo.feature.settings.data.model.PaymentPreferencesMockResponse paymentPreferencesMockResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentPreferencesMockResponse, "");
        return new com.paypal.oslo.feature.settings.domain.model.PaymentPreferencesSettingsData(mapToSettingsItemData(paymentPreferencesMockResponse.getOnlinePayments()), mapToSettingsItemData(paymentPreferencesMockResponse.getYourSubscriptions()), mapToSettingsItemData(paymentPreferencesMockResponse.getLinkedBusinesses()), mapToSettingsItemData(paymentPreferencesMockResponse.getInStorePayments()), mapToSettingsItemData(paymentPreferencesMockResponse.getMoneyManagement()), mapToSettingsItemData(paymentPreferencesMockResponse.getPaypalBalance()), mapToSettingsItemData(paymentPreferencesMockResponse.getPaypalCredit()), mapToSettingsItemData(paymentPreferencesMockResponse.getPaypalCashbackCard()), mapToSettingsItemData(paymentPreferencesMockResponse.getPaypalSavings()), mapToSettingsItemData(paymentPreferencesMockResponse.getAutoSave()), mapToSettingsItemData(paymentPreferencesMockResponse.getCrypto()));
    }

    public static final com.paypal.oslo.feature.settings.domain.model.DataAndPrivacySettingsData mapToDataAndPrivacySettingsData(com.paypal.oslo.feature.settings.data.model.DataAndPrivacyMockResponse dataAndPrivacyMockResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataAndPrivacyMockResponse, "");
        return new com.paypal.oslo.feature.settings.domain.model.DataAndPrivacySettingsData(mapToSettingsItemData(dataAndPrivacyMockResponse.getPasskey()), mapToSettingsItemData(dataAndPrivacyMockResponse.getFingerprintScan()), mapToSettingsItemData(dataAndPrivacyMockResponse.getLls()), mapToSettingsItemData(dataAndPrivacyMockResponse.getUseAnAuthenticatorApp()), mapToSettingsItemData(dataAndPrivacyMockResponse.getManagedLoginSessions()), mapToSettingsItemData(dataAndPrivacyMockResponse.getAdsAndShoppingData()), mapToSettingsItemData(dataAndPrivacyMockResponse.getPersonalizedShopping()), mapToSettingsItemData(dataAndPrivacyMockResponse.getPersonalizedAds()), mapToSettingsItemData(dataAndPrivacyMockResponse.getDownloadDeleteData()), mapToSettingsItemData(dataAndPrivacyMockResponse.getConnectedApps()));
    }

    public static final com.paypal.oslo.feature.settings.domain.model.NotificationPreferencesSettingsData mapToNotificationPreferencesSettingsData(com.paypal.oslo.feature.settings.data.model.NotificationPreferencesMockResponse notificationPreferencesMockResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notificationPreferencesMockResponse, "");
        return new com.paypal.oslo.feature.settings.domain.model.NotificationPreferencesSettingsData(mapToSettingsItemData(notificationPreferencesMockResponse.getGeneralNotifications()), mapToSettingsItemData(notificationPreferencesMockResponse.getPushNotifications()), mapToSettingsItemData(notificationPreferencesMockResponse.getSmsAndEmail()), mapToSettingsItemData(notificationPreferencesMockResponse.getMarketing()));
    }

    public static final com.paypal.oslo.feature.settings.domain.model.HelpAndSupportSettingsData mapToHelpAndSupportSettingsData(com.paypal.oslo.feature.settings.data.model.HelpAndSupportMockResponse helpAndSupportMockResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(helpAndSupportMockResponse, "");
        return new com.paypal.oslo.feature.settings.domain.model.HelpAndSupportSettingsData(mapToSettingsItemData(helpAndSupportMockResponse.getHelpCenter()), mapToSettingsItemData(helpAndSupportMockResponse.getMessageCenter()), mapToSettingsItemData(helpAndSupportMockResponse.getPaypalAssistant()));
    }

    public static final com.paypal.oslo.feature.settings.domain.model.SettingsItemData mapToSettingsItemData(com.paypal.oslo.feature.settings.data.model.SettingsItemMockResponse settingsItemMockResponse) {
        com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus.Action action;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsItemMockResponse, "");
        java.lang.String value = settingsItemMockResponse.getValue();
        com.paypal.oslo.feature.settings.data.model.BadgeStateMockResponse badgeState = settingsItemMockResponse.getBadgeState();
        if (badgeState == null || (action = mapToStatus(badgeState)) == null) {
            java.lang.Boolean toggleState = settingsItemMockResponse.getToggleState();
            if (toggleState != null) {
                action = new com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus.Toggle(toggleState.booleanValue());
            } else {
                action = settingsItemMockResponse.getHasAction() != null ? com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus.Action.INSTANCE : null;
            }
        }
        return new com.paypal.oslo.feature.settings.domain.model.SettingsItemData(value, action);
    }

    public static final com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus mapToStatus(com.paypal.oslo.feature.settings.data.model.BadgeStateMockResponse badgeStateMockResponse) {
        com.paypal.oslo.feature.settings.domain.model.BadgeType badgeType;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(badgeStateMockResponse, "");
        int i = com.paypal.oslo.feature.settings.data.util.ResponseMappersKt.WhenMappings.$EnumSwitchMapping$0[badgeStateMockResponse.ordinal()];
        if (i == 1) {
            badgeType = com.paypal.oslo.feature.settings.domain.model.BadgeType.Positive;
        } else {
            if (i != 2) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            badgeType = com.paypal.oslo.feature.settings.domain.model.BadgeType.Negative;
        }
        return new com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus.Badge(badgeType);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.settings.data.model.BadgeStateMockResponse.values().length];
            try {
                iArr[com.paypal.oslo.feature.settings.data.model.BadgeStateMockResponse.Positive.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.settings.data.model.BadgeStateMockResponse.Negative.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
