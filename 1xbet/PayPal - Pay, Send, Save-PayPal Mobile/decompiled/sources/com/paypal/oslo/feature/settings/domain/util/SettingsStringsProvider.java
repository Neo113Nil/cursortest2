package com.paypal.oslo.feature.settings.domain.util;

@kotlin.Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\u0004\u001a\u00020\u0003*\u00020\u00022\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0006\"\u00020\u0001H&¢\u0006\u0004\b\u0004\u0010\bJ\u000f\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H&¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH&¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH&¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H&¢\u0006\u0004\b\"\u0010#À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/settings/domain/util/SettingsStringsProvider;", "", "", "", "stringValue", "(I)Ljava/lang/String;", "", "args", "(I[Ljava/lang/Object;)Ljava/lang/String;", "Lcom/paypal/oslo/feature/settings/domain/util/AccountSettingsStrings;", "getAccountStrings", "()Lcom/paypal/oslo/feature/settings/domain/util/AccountSettingsStrings;", "Lcom/paypal/oslo/feature/settings/domain/util/PaymentPreferencesStrings;", "getPaymentPreferencesStrings", "()Lcom/paypal/oslo/feature/settings/domain/util/PaymentPreferencesStrings;", "Lcom/paypal/oslo/feature/settings/domain/util/DataAndPrivacyStrings;", "getDataAndPrivacyStrings", "()Lcom/paypal/oslo/feature/settings/domain/util/DataAndPrivacyStrings;", "Lcom/paypal/oslo/feature/settings/domain/util/NotificationsStrings;", "getNotificationPreferencesStrings", "()Lcom/paypal/oslo/feature/settings/domain/util/NotificationsStrings;", "Lcom/paypal/oslo/feature/settings/domain/util/HelpAndSupportStrings;", "getHelpAndSupportStrings", "()Lcom/paypal/oslo/feature/settings/domain/util/HelpAndSupportStrings;", "Lcom/paypal/oslo/feature/settings/domain/util/FooterSettingsStrings;", "getFooterStrings", "()Lcom/paypal/oslo/feature/settings/domain/util/FooterSettingsStrings;", "Lcom/paypal/oslo/feature/settings/domain/util/LegalStrings;", "getLegalStrings", "()Lcom/paypal/oslo/feature/settings/domain/util/LegalStrings;", "Lcom/paypal/oslo/feature/settings/domain/util/SettingsScreenStrings;", "getScreenStrings", "()Lcom/paypal/oslo/feature/settings/domain/util/SettingsScreenStrings;", "Lcom/paypal/oslo/feature/settings/domain/util/CloseAccountStrings;", "getCloseAccountStrings", "()Lcom/paypal/oslo/feature/settings/domain/util/CloseAccountStrings;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface SettingsStringsProvider {
    com.paypal.oslo.feature.settings.domain.util.AccountSettingsStrings getAccountStrings();

    com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings getCloseAccountStrings();

    com.paypal.oslo.feature.settings.domain.util.DataAndPrivacyStrings getDataAndPrivacyStrings();

    com.paypal.oslo.feature.settings.domain.util.FooterSettingsStrings getFooterStrings();

    com.paypal.oslo.feature.settings.domain.util.HelpAndSupportStrings getHelpAndSupportStrings();

    com.paypal.oslo.feature.settings.domain.util.LegalStrings getLegalStrings();

    com.paypal.oslo.feature.settings.domain.util.NotificationsStrings getNotificationPreferencesStrings();

    com.paypal.oslo.feature.settings.domain.util.PaymentPreferencesStrings getPaymentPreferencesStrings();

    com.paypal.oslo.feature.settings.domain.util.SettingsScreenStrings getScreenStrings();

    java.lang.String stringValue(int i);

    java.lang.String stringValue(int i, java.lang.Object... objArr);
}
