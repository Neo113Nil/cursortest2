package com.paypal.oslo.feature.settings.domain.util;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\bG\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0015\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0004R\u0014\u0010\u0017\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0004R\u0014\u0010\u0019\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0004R\u0014\u0010\u001b\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0004R\u0014\u0010\u001d\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0004R\u0014\u0010\u001f\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0004R\u0014\u0010!\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u0004R\u0014\u0010#\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u0004R\u0014\u0010%\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u0004R\u0014\u0010'\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u0004R\u0014\u0010)\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u0004R\u0014\u0010+\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u0004R\u0014\u0010-\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\u0004R\u0014\u0010/\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\u0004R\u0014\u00101\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b0\u0010\u0004R\u0014\u00103\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b2\u0010\u0004R\u0014\u00105\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b4\u0010\u0004R\u0014\u00107\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b6\u0010\u0004R\u0014\u00109\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b8\u0010\u0004R\u0014\u0010;\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b:\u0010\u0004R\u0014\u0010=\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b<\u0010\u0004R\u0014\u0010?\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b>\u0010\u0004R\u0014\u0010A\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b@\u0010\u0004R\u0014\u0010C\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\bB\u0010\u0004R\u0014\u0010E\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\bD\u0010\u0004R\u0014\u0010G\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\bF\u0010\u0004R\u0014\u0010I\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\bH\u0010\u0004À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/settings/domain/util/DataAndPrivacyStrings;", "", "", "getTitle", "()Ljava/lang/String;", "title", "getManageAccountHeader", "manageAccountHeader", "getPasskey", com.paypal.oslo.feature.identity.passkey.analytics.PasskeyAnalyticsConstants.FEATURE, "getPasskeySubtitle", "passkeySubtitle", "getPasskeyDisabled", "passkeyDisabled", "getFingerprintScan", "fingerprintScan", "getFingerprintScanSubtitle", "fingerprintScanSubtitle", "getLls", "lls", "getLlsSubtitle", "llsSubtitle", "getLlsOptInTitle", "llsOptInTitle", "getLlsOptInDescription", "llsOptInDescription", "getLlsOptInConfirm", "llsOptInConfirm", "getLlsOptInCancel", "llsOptInCancel", "getVerificationMethods", "verificationMethods", "getVerificationMethodsSubtitle", "verificationMethodsSubtitle", "getLoginDevices", "loginDevices", "getLoginDevicesSubtitle", "loginDevicesSubtitle", "getPassword", "password", "getPasswordSubtitle", "passwordSubtitle", "getBlockedContacts", "blockedContacts", "getBlockedContactsSubtitle", "blockedContactsSubtitle", "getUseAnAuthenticatorApp", "useAnAuthenticatorApp", "getManagedLoginSessions", "managedLoginSessions", "getPersonalizedShopping", "personalizedShopping", "getPersonalizedShoppingSubtitle", "personalizedShoppingSubtitle", "getPersonalizedAds", "personalizedAds", "getPersonalizedAdsSubtitle", "personalizedAdsSubtitle", "getDownloadDeleteData", "downloadDeleteData", "getDownloadDeleteDataSubtitle", "downloadDeleteDataSubtitle", "getConnectedApps", "connectedApps", "getConnectedAppsSubtitle", "connectedAppsSubtitle", "getAdded", "added", "getBiometricErrorMessage", "biometricErrorMessage", "getLlsErrorMessage", "llsErrorMessage", "getManageYourCollectedAndSharedDataHeader", "manageYourCollectedAndSharedDataHeader"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface DataAndPrivacyStrings {
    java.lang.String getAdded();

    java.lang.String getBiometricErrorMessage();

    java.lang.String getBlockedContacts();

    java.lang.String getBlockedContactsSubtitle();

    java.lang.String getConnectedApps();

    java.lang.String getConnectedAppsSubtitle();

    java.lang.String getDownloadDeleteData();

    java.lang.String getDownloadDeleteDataSubtitle();

    java.lang.String getFingerprintScan();

    java.lang.String getFingerprintScanSubtitle();

    java.lang.String getLls();

    java.lang.String getLlsErrorMessage();

    java.lang.String getLlsOptInCancel();

    java.lang.String getLlsOptInConfirm();

    java.lang.String getLlsOptInDescription();

    java.lang.String getLlsOptInTitle();

    java.lang.String getLlsSubtitle();

    java.lang.String getLoginDevices();

    java.lang.String getLoginDevicesSubtitle();

    java.lang.String getManageAccountHeader();

    java.lang.String getManageYourCollectedAndSharedDataHeader();

    java.lang.String getManagedLoginSessions();

    java.lang.String getPasskey();

    java.lang.String getPasskeyDisabled();

    java.lang.String getPasskeySubtitle();

    java.lang.String getPassword();

    java.lang.String getPasswordSubtitle();

    java.lang.String getPersonalizedAds();

    java.lang.String getPersonalizedAdsSubtitle();

    java.lang.String getPersonalizedShopping();

    java.lang.String getPersonalizedShoppingSubtitle();

    java.lang.String getTitle();

    java.lang.String getUseAnAuthenticatorApp();

    java.lang.String getVerificationMethods();

    java.lang.String getVerificationMethodsSubtitle();
}
