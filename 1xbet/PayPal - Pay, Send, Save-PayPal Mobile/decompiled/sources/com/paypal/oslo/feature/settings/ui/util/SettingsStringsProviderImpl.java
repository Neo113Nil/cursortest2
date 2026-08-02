package com.paypal.oslo.feature.settings.ui.util;

@kotlin.Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ'\u0010\b\u001a\u00020\u0007*\u00020\u00062\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n\"\u00020\u000bH\u0016¢\u0006\u0004\b\b\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010+"}, d2 = {"Lcom/paypal/oslo/feature/settings/ui/util/SettingsStringsProviderImpl;", "Lcom/paypal/oslo/feature/settings/domain/util/SettingsStringsProvider;", "Landroid/content/res/Resources;", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_RESOURCES_KEY, "<init>", "(Landroid/content/res/Resources;)V", "", "", "stringValue", "(I)Ljava/lang/String;", "", "", "args", "(I[Ljava/lang/Object;)Ljava/lang/String;", "Lcom/paypal/oslo/feature/settings/domain/util/AccountSettingsStrings;", "getAccountStrings", "()Lcom/paypal/oslo/feature/settings/domain/util/AccountSettingsStrings;", "Lcom/paypal/oslo/feature/settings/domain/util/PaymentPreferencesStrings;", "getPaymentPreferencesStrings", "()Lcom/paypal/oslo/feature/settings/domain/util/PaymentPreferencesStrings;", "Lcom/paypal/oslo/feature/settings/domain/util/DataAndPrivacyStrings;", "getDataAndPrivacyStrings", "()Lcom/paypal/oslo/feature/settings/domain/util/DataAndPrivacyStrings;", "Lcom/paypal/oslo/feature/settings/domain/util/NotificationsStrings;", "getNotificationPreferencesStrings", "()Lcom/paypal/oslo/feature/settings/domain/util/NotificationsStrings;", "Lcom/paypal/oslo/feature/settings/domain/util/HelpAndSupportStrings;", "getHelpAndSupportStrings", "()Lcom/paypal/oslo/feature/settings/domain/util/HelpAndSupportStrings;", "Lcom/paypal/oslo/feature/settings/domain/util/FooterSettingsStrings;", "getFooterStrings", "()Lcom/paypal/oslo/feature/settings/domain/util/FooterSettingsStrings;", "Lcom/paypal/oslo/feature/settings/domain/util/LegalStrings;", "getLegalStrings", "()Lcom/paypal/oslo/feature/settings/domain/util/LegalStrings;", "Lcom/paypal/oslo/feature/settings/domain/util/SettingsScreenStrings;", "getScreenStrings", "()Lcom/paypal/oslo/feature/settings/domain/util/SettingsScreenStrings;", "Lcom/paypal/oslo/feature/settings/domain/util/CloseAccountStrings;", "getCloseAccountStrings", "()Lcom/paypal/oslo/feature/settings/domain/util/CloseAccountStrings;", "Landroid/content/res/Resources;", "getResources", "()Landroid/content/res/Resources;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SettingsStringsProviderImpl implements com.paypal.oslo.feature.settings.domain.util.SettingsStringsProvider {
    public static final int $stable = 8;
    private final android.content.res.Resources resources;

    public SettingsStringsProviderImpl(android.content.res.Resources resources) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resources, "");
        this.resources = resources;
    }

    public final android.content.res.Resources getResources() {
        return this.resources;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.SettingsStringsProvider
    public final java.lang.String stringValue(int i) {
        java.lang.String string = this.resources.getString(i);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.SettingsStringsProvider
    public final java.lang.String stringValue(int i, java.lang.Object... objArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objArr, "");
        java.lang.String string = this.resources.getString(i, java.util.Arrays.copyOf(objArr, objArr.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.SettingsStringsProvider
    public final com.paypal.oslo.feature.settings.domain.util.AccountSettingsStrings getAccountStrings() {
        return new com.paypal.oslo.feature.settings.domain.util.AccountSettingsStrings() { // from class: com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl$getAccountStrings$1
            @Override // com.paypal.oslo.feature.settings.domain.util.AccountSettingsStrings
            public final java.lang.String getTitle() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_account_title);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.AccountSettingsStrings
            public final java.lang.String getProfileName() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_account_profile_name);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.AccountSettingsStrings
            public final java.lang.String getEmail() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_account_email);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.AccountSettingsStrings
            public final java.lang.String getEmailNegativeBadge() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_account_email_unconfirmed);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.AccountSettingsStrings
            public final java.lang.String getPhoneNumber() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_account_phone_number);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.AccountSettingsStrings
            public final java.lang.String getAddress() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_account_address);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.AccountSettingsStrings
            public final java.lang.String getProfileVisibility() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_account_profile_visibility);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.AccountSettingsStrings
            public final java.lang.String getProfileVisibilitySubtitle() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_account_profile_visibility_detail);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.AccountSettingsStrings
            public final java.lang.String getProfileVisibilityPositiveBadge() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_account_account_visibility_public);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.AccountSettingsStrings
            public final java.lang.String getProfileVisibilityNegativeBadge() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_account_account_visibility_private);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.AccountSettingsStrings
            public final java.lang.String getStatementsAndTaxes() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_account_statements_and_tax_info);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.AccountSettingsStrings
            public final java.lang.String getStatementsAndTaxesSubtitle() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_account_statements_and_tax_info_detail);
            }
        };
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.SettingsStringsProvider
    public final com.paypal.oslo.feature.settings.domain.util.PaymentPreferencesStrings getPaymentPreferencesStrings() {
        return new com.paypal.oslo.feature.settings.domain.util.PaymentPreferencesStrings() { // from class: com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl$getPaymentPreferencesStrings$1
            @Override // com.paypal.oslo.feature.settings.domain.util.PaymentPreferencesStrings
            public final java.lang.String getTitle() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_payment_preferences_title);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.PaymentPreferencesStrings
            public final java.lang.String getActivate() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_activate);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.PaymentPreferencesStrings
            public final java.lang.String getEnabled() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_enabled);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.PaymentPreferencesStrings
            public final java.lang.String getOn() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_on);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.PaymentPreferencesStrings
            public final java.lang.String getOff() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_off);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.PaymentPreferencesStrings
            public final java.lang.String getOnlinePayments() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_payment_preferences_online_payments);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.PaymentPreferencesStrings
            public final java.lang.String getOnlinePaymentsFallbackText() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_payment_preferences_online_payments_fallback_text);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.PaymentPreferencesStrings
            public final java.lang.String getLinkedBusinesses() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_payment_preferences_linked_businesses);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.PaymentPreferencesStrings
            public final java.lang.String getLinkedBusinessesSubtitle() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_payment_preferences_linked_businesses_subtitle);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.PaymentPreferencesStrings
            public final java.lang.String getInStorePayments() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_payment_preferences_in_store_payments);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.PaymentPreferencesStrings
            public final java.lang.String getInStorePaymentsFallbackText() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_payment_preferences_in_store_payments_fallback_text);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.PaymentPreferencesStrings
            public final java.lang.String getMoneyManagement() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_payment_preferences_money_management);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.PaymentPreferencesStrings
            public final java.lang.String getPaypalBalance() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_payment_preferences_paypal_balance);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.PaymentPreferencesStrings
            public final java.lang.String getManageYourBalanceOptions() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_payment_preferences_paypal_manage_your_balance_option);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.PaymentPreferencesStrings
            public final java.lang.String getAutoReload() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_payment_preferences_paypal_auto_reload);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.PaymentPreferencesStrings
            public final java.lang.String getPaypalCreditCard() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_payment_preferences_paypal_credit_card);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.PaymentPreferencesStrings
            public final java.lang.String getAutoPay() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_payment_preferences_paypal_auto_pay);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.PaymentPreferencesStrings
            public final java.lang.String getPaypalCardFallbackText() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_payment_preferences_paypal_card_fallback_text);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.PaymentPreferencesStrings
            public final java.lang.String getPayPalSmartRoute() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_payment_preferences_paypal_paypal_smart_route);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.PaymentPreferencesStrings
            public final java.lang.String getPaypalCashbackCard() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_payment_preferences_paypal_cashback_card);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.PaymentPreferencesStrings
            public final java.lang.String getPaypalSavings() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_payment_preferences_paypal_savings);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.PaymentPreferencesStrings
            public final java.lang.String getAutoSave() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_payment_preferences_auto_save);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.PaymentPreferencesStrings
            public final java.lang.String getManageYourSavingsOptions() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_payment_preferences_paypal_manage_your_savings_option);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.PaymentPreferencesStrings
            public final java.lang.String getCrypto() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_payment_preferences_crypto);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.PaymentPreferencesStrings
            public final java.lang.String getCryptoFallbackText() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_payment_preferences_crypto_fallback_text);
            }
        };
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.SettingsStringsProvider
    public final com.paypal.oslo.feature.settings.domain.util.DataAndPrivacyStrings getDataAndPrivacyStrings() {
        return new com.paypal.oslo.feature.settings.domain.util.DataAndPrivacyStrings() { // from class: com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl$getDataAndPrivacyStrings$1
            @Override // com.paypal.oslo.feature.settings.domain.util.DataAndPrivacyStrings
            public final java.lang.String getTitle() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_data_and_privacy_title);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.DataAndPrivacyStrings
            public final java.lang.String getManageAccountHeader() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_data_and_privacy_manage_account_header);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.DataAndPrivacyStrings
            public final java.lang.String getPasskey() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_data_and_privacy_passkeys);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.DataAndPrivacyStrings
            public final java.lang.String getPasskeySubtitle() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_data_and_privacy_passkeys_subtitle);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.DataAndPrivacyStrings
            public final java.lang.String getPasskeyDisabled() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_security_and_privacy_passkey_disabled);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.DataAndPrivacyStrings
            public final java.lang.String getFingerprintScan() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_data_and_privacy_face_and_touch_id);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.DataAndPrivacyStrings
            public final java.lang.String getFingerprintScanSubtitle() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_data_and_privacy_face_and_touch_id_subtitle);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.DataAndPrivacyStrings
            public final java.lang.String getLls() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_data_and_privacy_lls);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.DataAndPrivacyStrings
            public final java.lang.String getLlsSubtitle() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_data_and_privacy_lls_subtitle);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.DataAndPrivacyStrings
            public final java.lang.String getLlsOptInTitle() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_lls_opt_in_title);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.DataAndPrivacyStrings
            public final java.lang.String getLlsOptInDescription() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_lls_opt_in_description);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.DataAndPrivacyStrings
            public final java.lang.String getLlsOptInConfirm() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_lls_opt_in_confirm);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.DataAndPrivacyStrings
            public final java.lang.String getLlsOptInCancel() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_lls_opt_in_cancel);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.DataAndPrivacyStrings
            public final java.lang.String getVerificationMethods() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_data_and_privacy_verification_methods);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.DataAndPrivacyStrings
            public final java.lang.String getVerificationMethodsSubtitle() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_data_and_privacy_verification_methods_subtitle);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.DataAndPrivacyStrings
            public final java.lang.String getLoginDevices() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_data_and_privacy_login_devices);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.DataAndPrivacyStrings
            public final java.lang.String getLoginDevicesSubtitle() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_data_and_privacy_login_devices_subtitle);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.DataAndPrivacyStrings
            public final java.lang.String getPassword() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_security_and_privacy_password);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.DataAndPrivacyStrings
            public final java.lang.String getPasswordSubtitle() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_security_and_privacy_password_subtitle);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.DataAndPrivacyStrings
            public final java.lang.String getBlockedContacts() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_data_and_privacy_blocked_contacts);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.DataAndPrivacyStrings
            public final java.lang.String getBlockedContactsSubtitle() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_data_and_privacy_blocked_contacts_subtitle);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.DataAndPrivacyStrings
            public final java.lang.String getUseAnAuthenticatorApp() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_data_and_privacy_use_an_authenticator_app);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.DataAndPrivacyStrings
            public final java.lang.String getManagedLoginSessions() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_data_and_privacy_managed_login_sessions);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.DataAndPrivacyStrings
            public final java.lang.String getPersonalizedShopping() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_data_and_privacy_personalized_shopping);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.DataAndPrivacyStrings
            public final java.lang.String getPersonalizedShoppingSubtitle() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_data_and_privacy_personalized_shopping_subtitle);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.DataAndPrivacyStrings
            public final java.lang.String getPersonalizedAds() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_data_and_privacy_personalized_ads);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.DataAndPrivacyStrings
            public final java.lang.String getPersonalizedAdsSubtitle() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_data_and_privacy_personalized_ads_subtitle);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.DataAndPrivacyStrings
            public final java.lang.String getDownloadDeleteData() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_data_and_privacy_download_delete_data);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.DataAndPrivacyStrings
            public final java.lang.String getDownloadDeleteDataSubtitle() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_data_and_privacy_download_delete_data_subtitle);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.DataAndPrivacyStrings
            public final java.lang.String getConnectedApps() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_data_and_privacy_connected_apps);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.DataAndPrivacyStrings
            public final java.lang.String getConnectedAppsSubtitle() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_data_and_privacy_connected_apps_subtitle);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.DataAndPrivacyStrings
            public final java.lang.String getAdded() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_added);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.DataAndPrivacyStrings
            public final java.lang.String getBiometricErrorMessage() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_data_and_privacy_biometric_error);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.DataAndPrivacyStrings
            public final java.lang.String getLlsErrorMessage() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_data_and_privacy_lls_error);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.DataAndPrivacyStrings
            public final java.lang.String getManageYourCollectedAndSharedDataHeader() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_manage_your_collected_and_shared_data_header);
            }
        };
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.SettingsStringsProvider
    public final com.paypal.oslo.feature.settings.domain.util.NotificationsStrings getNotificationPreferencesStrings() {
        return new com.paypal.oslo.feature.settings.domain.util.NotificationsStrings() { // from class: com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl$getNotificationPreferencesStrings$1
            @Override // com.paypal.oslo.feature.settings.domain.util.NotificationsStrings
            public final java.lang.String getTitle() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_notifications_title);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.NotificationsStrings
            public final java.lang.String getReceivePushNotifications() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_receive_push_enabler_tile_title);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.NotificationsStrings
            public final java.lang.String getReceivePushNotificationsSubtitle() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_receive_push_enabler_tile_subtitle);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.NotificationsStrings
            public final java.lang.String getTurnOn() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_receive_push_enabler_cta_button_text);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.NotificationsStrings
            public final java.lang.String getPushNotifications() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_notifications_push_notifications);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.NotificationsStrings
            public final java.lang.String getSmsAndEmail() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_notifications_sms_email);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.NotificationsStrings
            public final java.lang.String getGeneralNotifications() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_notifications_general_notifications);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.NotificationsStrings
            public final java.lang.String getMarketing() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_notifications_marketing);
            }
        };
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.SettingsStringsProvider
    public final com.paypal.oslo.feature.settings.domain.util.HelpAndSupportStrings getHelpAndSupportStrings() {
        return new com.paypal.oslo.feature.settings.domain.util.HelpAndSupportStrings() { // from class: com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl$getHelpAndSupportStrings$1
            @Override // com.paypal.oslo.feature.settings.domain.util.HelpAndSupportStrings
            public final java.lang.String getTitle() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_help_and_support_title);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.HelpAndSupportStrings
            public final java.lang.String getMessageCenter() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_help_and_support_message_center);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.HelpAndSupportStrings
            public final java.lang.String getHelpCenter() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_help_and_support_help_center);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.HelpAndSupportStrings
            public final java.lang.String getHelpCenterSubtitle() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_help_and_support_help_center_subtitle);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.HelpAndSupportStrings
            public final java.lang.String getPaypalAssistant() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_help_and_support_paypal_assistant);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.HelpAndSupportStrings
            public final java.lang.String getPaypalAssistantSubtitle() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_help_and_support_paypal_assistant_subtitle);
            }
        };
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.SettingsStringsProvider
    public final com.paypal.oslo.feature.settings.domain.util.FooterSettingsStrings getFooterStrings() {
        return new com.paypal.oslo.feature.settings.domain.util.FooterSettingsStrings() { // from class: com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl$getFooterStrings$1
            @Override // com.paypal.oslo.feature.settings.domain.util.FooterSettingsStrings
            public final java.lang.String getLoggingOut() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_footer_logging_out);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.FooterSettingsStrings
            public final java.lang.String getVersion(java.lang.String versionNumber) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(versionNumber, "");
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_footer_version, versionNumber);
            }
        };
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.SettingsStringsProvider
    public final com.paypal.oslo.feature.settings.domain.util.LegalStrings getLegalStrings() {
        return new com.paypal.oslo.feature.settings.domain.util.LegalStrings() { // from class: com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl$getLegalStrings$1
            @Override // com.paypal.oslo.feature.settings.domain.util.LegalStrings
            public final java.lang.String getLegalHub() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_legal_legal_hub);
            }
        };
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.SettingsStringsProvider
    public final com.paypal.oslo.feature.settings.domain.util.SettingsScreenStrings getScreenStrings() {
        return new com.paypal.oslo.feature.settings.domain.util.SettingsScreenStrings() { // from class: com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl$getScreenStrings$1
            @Override // com.paypal.oslo.feature.settings.domain.util.SettingsScreenStrings
            public final java.lang.String getScreenError() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_screen_error);
            }
        };
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.SettingsStringsProvider
    public final com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings getCloseAccountStrings() {
        return new com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings() { // from class: com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl$getCloseAccountStrings$1
            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getContinue() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_footer_continue);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getCancel() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_footer_cancel);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getConfirm() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_footer_confirm);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getCloseAccount() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_footer_close_account);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getL2EligibleBeforeClose() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_l2_eligible_before_close);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getL2EligibleSendEmail() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_l2_eligible_send_email);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getL2EligiblePrimaryEmail() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_l2_eligible_primary_email);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getL2EligibleChangeEmail() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_l2_eligible_change_email);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getL2EligibleWeCanHelp() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_l2_eligible_we_can_help);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getL2EligibleWeCanHelpReOpened() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_l2_eligible_we_can_help_re_opened);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getL2EligibleOnceClosed() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_l2_eligible_once_closed);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getL2EligibleIfYouDeleteData() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_l2_eligible_if_you_delete_data);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getL2EligibleYourFeedbackMatters() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_l2_eligible_your_feedback_matters);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getL2EligibleYourShareFeedback() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_l2_eligible_your_share_feedback);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getL2IneligibleTitle() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_l2_ineligible_title);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getL2IneligibleWeWereUnableToClose() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_l2_ineligible_we_were_unable_to_close);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getL2IneligibleGenericErrorDesc() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_l2_ineligible_generic_error_desc);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getL2IneligibleDescription() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_l2_ineligible_description);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getL2IneligibleThingsToDo() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_l2_ineligible_things_to_do);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getL2IneligiblePayOutstandingBalances() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_l2_ineligible_pay_outstanding_balances);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getL2IneligiblePayOutstandingAmount() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_l2_ineligible_pay_outstanding_amount);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getL2IneligibleClosePaypalCredit() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_l2_ineligible_close_payPal_credit);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getL2IneligibleWaitPendingTransactions() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_l2_ineligible_wait_pending_transactions);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getL2IneligibleTransferYourFunds() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_l2_ineligible_transfer_your_funds);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getL2IneligiblePayOffAnyOpenPaymentPlans() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_l2_ineligible_pay_off_any_open_payment_plans);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getL2IneligibleResolveAccountLimitation() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_l2_ineligible_resolve_account_limitation);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getL2IneligibleCloseAnyOpenPools() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_l2_ineligible_close_any_open_pools);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getL2IneligibleTransferRemainingBalance() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_l2_ineligible_transfer_remaining_balance);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getL2IneligibleIfYouNeedHelp() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_l2_ineligible_if_you_need_help);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getL2IneligibleBeforeYouCloseYourAccount() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_l2_ineligible_before_you_close_your_Account);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getL2IneligibleYouCanChangeYourEmail() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_l2_ineligible_you_can_change_your_email);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getL2IneligibleSorryYouCannotCloseAccount() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_l2_ineligible_sorry_you_cannot_close_account);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getL2IneligibleSorryYouCannotCloseAccountRecurringSub() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_l2_ineligible_sorry_you_cannot_close_account_recurring_sub);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getL2IneligibleThereChargeback() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_l2_ineligible_there_chargeback);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getL2IneligibleTherePreApprovedPayment() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_l2_ineligible_there_pre_approved_payment);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getL2IneligibleYouHaveGiftCard() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_l2_ineligible_you_have_gift_card);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getL2IneligibleSomeoneSentYouPayment() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_l2_ineligible_someone_sent_you_payment);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getL2IneligiblePendingTransactionSubscription() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_l2_ineligible_pending_transaction_subscription);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getL2IneligibleUnresolvedActions() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_l2_ineligible_unresolved_actions);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getL2IneligibleTryAgainLater() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_l2_ineligible_try_again_later);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getL2IneligibleSorry() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_l2_ineligible_sorry);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getL2IneligibleAreYouSureClose() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_l2_ineligible_are_you_sure_close);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getL2IneligibleOnceYouClosePaypal() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_l2_ineligible_once_you_close_paypal);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getL2IneligibleShopPayOrReceive() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_l2_ineligible_shop_pay_or_receive);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getL2IneligibleTakeAdvantage() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_l2_ineligible_take_advantage);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getL2IneligibleViewYourTransaction() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_l2_ineligible_view_your_transaction);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getL2IneligibleIfYouHaveScheduledIncomplete() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_l2_ineligible_if_you_have_scheduled_incomplete);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getL2IneligibleIfYouLikeCloseAccountContact() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_l2_ineligible_if_you_like_close_account_contact);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getL2IneligibleIfYouLikeCloseXoomAccount() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_l2_ineligible_if_you_like_close_xoom_account);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getRedeemYourPayPalRewardsPoints() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_ineligible_redeem_your_paypal_reward_points);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getRedeemYourPayPalRewardsPointsDescription() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_ineligible_redeem_your_paypal_reward_points_description);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getSomethingThatNeedsToBeResolved() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_ineligible_something_that_needs_to_be_resolved);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getLinkLetUsKnow() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_link_let_us_know);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getLinkHelpCenter() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_link_help_center);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getLinkSettings() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_link_settings);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getLinkWallet() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_link_wallet);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getLinkTransactions() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_link_transactions);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getLinkSubscriptions() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_link_subscriptions);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getLinkResolutionCenter() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_link_resolution_center);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getLinkContactUs() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_link_contact_us);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getLinkDeleteYourData() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_link_delete_your_data);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getLinkPassword() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_link_password);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getLinkReviewYourLinkedBanks() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_link_review_your_linked_banks);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getLinkClosingYourXoomAccount() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_link_closing_your_xoom_account);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getLinkCloseYourAccount() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_link_close_your_account);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getLinkCustomerService() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_link_customer_service);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getL3IneligiblePaymentTransferred() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_l3_ineligible_payment_transferred);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getL3IneligibleToReceivePayment() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_l3_ineligible_to_receive_payment);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getL3IneligiblePayDueAmount() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_l3_ineligible_pay_due_amount);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getL3IneligibleContactCustomerSer() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_l3_ineligible_contact_customer_ser);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getL3IneligibleHelpClosePaypalCredit() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_l3_ineligible_help_close_paypal_credit);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getL3IneligibleKeepPaypalCredit() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_l3_ineligible_keep_paypal_credit);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getL2IneligibleBusinessHelpContactUs() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_l2_ineligible_business_help_contactus);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getL2IneligibleBusinessClosingAccount() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_l2_ineligible_business_closing_account);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getL2IneligibleBusinessNote() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_l2_ineligible_business_note);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getL2IneligibleBusinessReasonOne() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_l2_ineligible_business_reason_one);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getL2IneligibleBusinessReasonTwo() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_l2_ineligible_business_reason_two);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getL2IneligibleBusinessConfirmation() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_l2_ineligible_business_confirmation);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getL2IneligibleBusinessContactUs() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_l2_ineligible_business_contact_us);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getL2IneligibleBusinessReasonTitle() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_l2_ineligible_business_reason_title);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getL2IneligibleBusinessDoYouCloseAccount() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_l2_ineligible_business_do_you_close_account);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getL2IneligibleBusinessPlsEnterConcern() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_l2_ineligible_business_pls_enter_concern);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getL2IneligibleBusinessComments() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_l2_ineligible_business_comments);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getL2IneligibleBusinessEnterComments() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_l2_ineligible_business_enter_comments);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getL2IneligibleBusinessChooseReasons() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_l2_ineligible_business_choose_reasons);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getL2EligibleBusinessTitle() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_l2_eligible_business_title);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getL2EligibleBusinessHelpCenterContactUs() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_l2_eligible_business_help_center_contact_us);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getL2EligibleBusinessClosingAccountFinal() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_l2_eligible_business_closing_account_final);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getL2EligibleBusinessCheckProcessingNote() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_l2_eligible_business_check_processing_note);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getL2EligibleBusinessNoteLabel() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_l2_eligible_business_note_label);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getL2EligibleBusinessReasonTitle() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_l2_eligible_business_reason_title);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getL2EligibleBusinessReasonDescription() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_l2_eligible_business_reason_description);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getL2EligibleBusinessChooseReasons() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_l2_eligible_business_choose_reasons);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getL2EligibleBusinessReasonHaveAnotherAccount() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_l2_eligible_business_reason_have_another_account);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getL2EligibleBusinessReasonDontUseAnymore() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_l2_eligible_business_reason_dont_use_anymore);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getL2EligibleBusinessReasonSwitchingService() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_l2_eligible_business_reason_switching_service);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getL2EligibleBusinessReasonPrivacyConcern() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_l2_eligible_business_reason_privacy_concern);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getL2EligibleBusinessReasonNotSatisfied() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_l2_eligible_business_reason_not_satisfied);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getL2EligibleBusinessCommentsLabel() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_l2_eligible_business_comments_label);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getL2EligibleBusinessCommentsDescription() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_l2_eligible_business_comments_description);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getL2EligibleBusinessEnterComments() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_l2_eligible_business_enter_comments);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getL2EligibleBusinessDoYouWantToClose() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_l2_eligible_business_do_you_want_to_close);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getL2EligibleBusinessForgotPassword() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_l2_eligible_business_forgot_password);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getL2EligibleBusinessContactUsTitle() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_l2_eligible_business_contact_us_title);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getL2EligibleBusinessSatisfactionImportant() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_l2_eligible_business_satisfaction_important);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getL2EligibleBusinessPleaseContactUs() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_l2_eligible_business_please_contact_us);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getL2EligibleBusinessStillCloseConfirm() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_l2_eligible_business_still_close_confirm);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getL2EligibleBusinessErrorTitle() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_l2_eligible_business_error_title);
            }

            @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
            public final java.lang.String getL2EligibleBusinessErrorMessage() {
                return com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl.this.stringValue(com.paypal.oslo.feature.settings.R.string.feature_settings_close_account_l2_eligible_business_error_message);
            }
        };
    }
}
