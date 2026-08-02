package com.paypal.oslo.feature.onboarding.shared.variants.domain;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001:\b\u000b\f\r\u000e\u000f\u0010\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0007¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/shared/variants/domain/OnboardingVariants;", "", "<init>", "()V", "", "Lcom/paypal/oslo/feature/onboarding/shared/variants/domain/VariantKey;", "", "variants", "Ljava/util/Map;", "getVariants", "()Ljava/util/Map;", "PhoneEntry", "EmailEntry", "Password", "AddressVariantKeys", "TermsVariantKeys", "PersonalInfo", "AddressInfo", "BottomNavigation"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OnboardingVariants {
    public static final com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants INSTANCE = new com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants();
    private static final java.util.Map<com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey, java.lang.Integer> variants = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16192boximpl(com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.PhoneEntry.INSTANCE.m16171getHeaderVbOBBVs()), java.lang.Integer.valueOf(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_phone_entry_header_title)), kotlin.TuplesKt.to(com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16192boximpl(com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.PhoneEntry.INSTANCE.m16175getSubheaderVbOBBVs()), java.lang.Integer.valueOf(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_phone_entry_header_subtitle)), kotlin.TuplesKt.to(com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16192boximpl(com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.PhoneEntry.INSTANCE.m16173getPhoneLabelVbOBBVs()), java.lang.Integer.valueOf(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_phone_entry_label)), kotlin.TuplesKt.to(com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16192boximpl(com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.PhoneEntry.INSTANCE.m16172getPhoneHelperVbOBBVs()), java.lang.Integer.valueOf(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_phone_entry_helper)), kotlin.TuplesKt.to(com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16192boximpl(com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.PhoneEntry.INSTANCE.m16174getPhonePlaceholderVbOBBVs()), java.lang.Integer.valueOf(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_phone_number_example)), kotlin.TuplesKt.to(com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16192boximpl(com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.EmailEntry.INSTANCE.m16162getHeaderVbOBBVs()), java.lang.Integer.valueOf(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_email_entry_header_title)), kotlin.TuplesKt.to(com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16192boximpl(com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.EmailEntry.INSTANCE.m16163getSubheaderVbOBBVs()), java.lang.Integer.valueOf(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_email_entry_header_subtitle)), kotlin.TuplesKt.to(com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16192boximpl(com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.EmailEntry.INSTANCE.m16161getEmailLabelVbOBBVs()), java.lang.Integer.valueOf(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_email_entry_label)), kotlin.TuplesKt.to(com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16192boximpl(com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.Password.INSTANCE.m16164getHeaderVbOBBVs()), java.lang.Integer.valueOf(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_password_header_title)), kotlin.TuplesKt.to(com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16192boximpl(com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.Password.INSTANCE.m16166getSubheaderVbOBBVs()), java.lang.Integer.valueOf(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_password_header_subtitle)), kotlin.TuplesKt.to(com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16192boximpl(com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.Password.INSTANCE.m16165getPasswordLabelVbOBBVs()), java.lang.Integer.valueOf(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_password_label)), kotlin.TuplesKt.to(com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16192boximpl(com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.PersonalInfo.INSTANCE.m16168getHeaderVbOBBVs()), java.lang.Integer.valueOf(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_personal_info_header_title)), kotlin.TuplesKt.to(com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16192boximpl(com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.PersonalInfo.INSTANCE.m16170getSubheaderVbOBBVs()), java.lang.Integer.valueOf(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_personal_info_header_subtitle)), kotlin.TuplesKt.to(com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16192boximpl(com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.PersonalInfo.INSTANCE.m16167getFirstNameLabelVbOBBVs()), java.lang.Integer.valueOf(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_name_label_first_name)), kotlin.TuplesKt.to(com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16192boximpl(com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.PersonalInfo.INSTANCE.m16169getLastNameLabelVbOBBVs()), java.lang.Integer.valueOf(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_name_label_last_name)), kotlin.TuplesKt.to(com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16192boximpl(com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.PersonalInfo.INSTANCE.getAddress().m16151getAddressLabelVbOBBVs()), java.lang.Integer.valueOf(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_address_label)), kotlin.TuplesKt.to(com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16192boximpl(com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.PersonalInfo.INSTANCE.getAddress().m16158getEditAddressManuallyVbOBBVs()), java.lang.Integer.valueOf(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_personal_info_link_link_text)), kotlin.TuplesKt.to(com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16192boximpl(com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.PersonalInfo.INSTANCE.getAddress().m16152getAddressLine1VbOBBVs()), java.lang.Integer.valueOf(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_personal_info_address_address_line1_label)), kotlin.TuplesKt.to(com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16192boximpl(com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.PersonalInfo.INSTANCE.getAddress().m16153getAddressLine2VbOBBVs()), java.lang.Integer.valueOf(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_personal_info_address_address_line2_label)), kotlin.TuplesKt.to(com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16192boximpl(com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.PersonalInfo.INSTANCE.getAddress().m16150getAddressAdminArea2VbOBBVs()), java.lang.Integer.valueOf(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_personal_info_address_admin_area2_label)), kotlin.TuplesKt.to(com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16192boximpl(com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.PersonalInfo.INSTANCE.getAddress().m16155getAddressStateDropdownLabelVbOBBVs()), java.lang.Integer.valueOf(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_personal_info_address_dropdown_label)), kotlin.TuplesKt.to(com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16192boximpl(com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.PersonalInfo.INSTANCE.getAddress().m16156getAddressStateDropdownSearchLabelVbOBBVs()), java.lang.Integer.valueOf(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_personal_info_address_dropdown_search_label)), kotlin.TuplesKt.to(com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16192boximpl(com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.PersonalInfo.INSTANCE.getAddress().m16157getAddressStateDropdownSearchNoResultsVbOBBVs()), java.lang.Integer.valueOf(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_personal_info_address_dropdown_search_no_results)), kotlin.TuplesKt.to(com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16192boximpl(com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.PersonalInfo.INSTANCE.getAddress().m16154getAddressPostalCodeVbOBBVs()), java.lang.Integer.valueOf(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_personal_info_address_postal_code_label)), kotlin.TuplesKt.to(com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16192boximpl(com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.PersonalInfo.INSTANCE.getTerms().m16189getTermsTextVbOBBVs()), java.lang.Integer.valueOf(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_personal_info_terms_and_conditions_terms_and_conditions_text)), kotlin.TuplesKt.to(com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16192boximpl(com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.PersonalInfo.INSTANCE.getTerms().m16185getTermsESignConsentLabelVbOBBVs()), java.lang.Integer.valueOf(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_personal_info_terms_and_conditions_terms_and_conditions_link_esign_consent_label)), kotlin.TuplesKt.to(com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16192boximpl(com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.PersonalInfo.INSTANCE.getTerms().m16186getTermsESignConsentUrlVbOBBVs()), java.lang.Integer.valueOf(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_personal_info_terms_and_conditions_terms_and_conditions_link_esign_consent_url)), kotlin.TuplesKt.to(com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16192boximpl(com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.PersonalInfo.INSTANCE.getTerms().m16190getTermsUserAgreementLabelVbOBBVs()), java.lang.Integer.valueOf(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_personal_info_terms_and_conditions_terms_and_conditions_link_user_agreement_label)), kotlin.TuplesKt.to(com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16192boximpl(com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.PersonalInfo.INSTANCE.getTerms().m16191getTermsUserAgreementUrlVbOBBVs()), java.lang.Integer.valueOf(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_personal_info_terms_and_conditions_terms_and_conditions_link_user_agreement_url)), kotlin.TuplesKt.to(com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16192boximpl(com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.PersonalInfo.INSTANCE.getTerms().m16187getTermsPrivacyStatementLabelVbOBBVs()), java.lang.Integer.valueOf(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_personal_info_terms_and_conditions_terms_and_conditions_link_privacy_statement_label)), kotlin.TuplesKt.to(com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16192boximpl(com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.PersonalInfo.INSTANCE.getTerms().m16188getTermsPrivacyStatementUrlVbOBBVs()), java.lang.Integer.valueOf(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_personal_info_terms_and_conditions_terms_and_conditions_link_privacy_statement_url)), kotlin.TuplesKt.to(com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16192boximpl(com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.AddressInfo.INSTANCE.m16138getHeaderVbOBBVs()), java.lang.Integer.valueOf(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_personal_info_header_title)), kotlin.TuplesKt.to(com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16192boximpl(com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.AddressInfo.INSTANCE.getAddress().m16151getAddressLabelVbOBBVs()), java.lang.Integer.valueOf(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_address_label)), kotlin.TuplesKt.to(com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16192boximpl(com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.AddressInfo.INSTANCE.getAddress().m16158getEditAddressManuallyVbOBBVs()), java.lang.Integer.valueOf(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_personal_info_link_link_text)), kotlin.TuplesKt.to(com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16192boximpl(com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.AddressInfo.INSTANCE.getAddress().m16152getAddressLine1VbOBBVs()), java.lang.Integer.valueOf(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_personal_info_address_address_line1_label)), kotlin.TuplesKt.to(com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16192boximpl(com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.AddressInfo.INSTANCE.getAddress().m16153getAddressLine2VbOBBVs()), java.lang.Integer.valueOf(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_personal_info_address_address_line2_label)), kotlin.TuplesKt.to(com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16192boximpl(com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.AddressInfo.INSTANCE.getAddress().m16150getAddressAdminArea2VbOBBVs()), java.lang.Integer.valueOf(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_personal_info_address_admin_area2_label)), kotlin.TuplesKt.to(com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16192boximpl(com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.AddressInfo.INSTANCE.getAddress().m16155getAddressStateDropdownLabelVbOBBVs()), java.lang.Integer.valueOf(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_personal_info_address_dropdown_label)), kotlin.TuplesKt.to(com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16192boximpl(com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.AddressInfo.INSTANCE.getAddress().m16156getAddressStateDropdownSearchLabelVbOBBVs()), java.lang.Integer.valueOf(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_personal_info_address_dropdown_search_label)), kotlin.TuplesKt.to(com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16192boximpl(com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.AddressInfo.INSTANCE.getAddress().m16157getAddressStateDropdownSearchNoResultsVbOBBVs()), java.lang.Integer.valueOf(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_personal_info_address_dropdown_search_no_results)), kotlin.TuplesKt.to(com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16192boximpl(com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.AddressInfo.INSTANCE.getAddress().m16154getAddressPostalCodeVbOBBVs()), java.lang.Integer.valueOf(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_personal_info_address_postal_code_label)), kotlin.TuplesKt.to(com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16192boximpl(com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.AddressInfo.INSTANCE.getTerms().m16189getTermsTextVbOBBVs()), java.lang.Integer.valueOf(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_personal_info_terms_and_conditions_terms_and_conditions_text)), kotlin.TuplesKt.to(com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16192boximpl(com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.AddressInfo.INSTANCE.getTerms().m16185getTermsESignConsentLabelVbOBBVs()), java.lang.Integer.valueOf(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_personal_info_terms_and_conditions_terms_and_conditions_link_esign_consent_label)), kotlin.TuplesKt.to(com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16192boximpl(com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.AddressInfo.INSTANCE.getTerms().m16186getTermsESignConsentUrlVbOBBVs()), java.lang.Integer.valueOf(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_personal_info_terms_and_conditions_terms_and_conditions_link_esign_consent_url)), kotlin.TuplesKt.to(com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16192boximpl(com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.AddressInfo.INSTANCE.getTerms().m16190getTermsUserAgreementLabelVbOBBVs()), java.lang.Integer.valueOf(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_personal_info_terms_and_conditions_terms_and_conditions_link_user_agreement_label)), kotlin.TuplesKt.to(com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16192boximpl(com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.AddressInfo.INSTANCE.getTerms().m16191getTermsUserAgreementUrlVbOBBVs()), java.lang.Integer.valueOf(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_personal_info_terms_and_conditions_terms_and_conditions_link_user_agreement_url)), kotlin.TuplesKt.to(com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16192boximpl(com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.AddressInfo.INSTANCE.getTerms().m16187getTermsPrivacyStatementLabelVbOBBVs()), java.lang.Integer.valueOf(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_personal_info_terms_and_conditions_terms_and_conditions_link_privacy_statement_label)), kotlin.TuplesKt.to(com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16192boximpl(com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.AddressInfo.INSTANCE.getTerms().m16188getTermsPrivacyStatementUrlVbOBBVs()), java.lang.Integer.valueOf(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_personal_info_terms_and_conditions_terms_and_conditions_link_privacy_statement_url)), kotlin.TuplesKt.to(com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16192boximpl(com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.BottomNavigation.INSTANCE.m16160getNextVbOBBVs()), java.lang.Integer.valueOf(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_next)), kotlin.TuplesKt.to(com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16192boximpl(com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.BottomNavigation.INSTANCE.m16159getCreateAccountVbOBBVs()), java.lang.Integer.valueOf(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_create_account)));
    public static final int $stable = 8;

    private OnboardingVariants() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/shared/variants/domain/OnboardingVariants$PhoneEntry;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/onboarding/shared/variants/domain/VariantKey;", "Header", "Ljava/lang/String;", "getHeader-VbOBBVs", "()Ljava/lang/String;", "Subheader", "getSubheader-VbOBBVs", "PhoneLabel", "getPhoneLabel-VbOBBVs", "PhoneHelper", "getPhoneHelper-VbOBBVs", "PhonePlaceholder", "getPhonePlaceholder-VbOBBVs"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PhoneEntry {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.PhoneEntry INSTANCE = new com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.PhoneEntry();
        private static final java.lang.String Header = com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16193constructorimpl("phone_entry.header.header.label");
        private static final java.lang.String Subheader = com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16193constructorimpl("phone_entry.header.subheader.label");
        private static final java.lang.String PhoneLabel = com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16193constructorimpl("phone_entry.phone.phone.label");
        private static final java.lang.String PhoneHelper = com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16193constructorimpl("phone_entry.phone.phone.helper");
        private static final java.lang.String PhonePlaceholder = com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16193constructorimpl("phone_entry.phone.phone.placeholder");

        private PhoneEntry() {
        }

        /* renamed from: getHeader-VbOBBVs, reason: not valid java name */
        public final java.lang.String m16171getHeaderVbOBBVs() {
            return Header;
        }

        /* renamed from: getSubheader-VbOBBVs, reason: not valid java name */
        public final java.lang.String m16175getSubheaderVbOBBVs() {
            return Subheader;
        }

        /* renamed from: getPhoneLabel-VbOBBVs, reason: not valid java name */
        public final java.lang.String m16173getPhoneLabelVbOBBVs() {
            return PhoneLabel;
        }

        /* renamed from: getPhoneHelper-VbOBBVs, reason: not valid java name */
        public final java.lang.String m16172getPhoneHelperVbOBBVs() {
            return PhoneHelper;
        }

        /* renamed from: getPhonePlaceholder-VbOBBVs, reason: not valid java name */
        public final java.lang.String m16174getPhonePlaceholderVbOBBVs() {
            return PhonePlaceholder;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/shared/variants/domain/OnboardingVariants$EmailEntry;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/onboarding/shared/variants/domain/VariantKey;", "Header", "Ljava/lang/String;", "getHeader-VbOBBVs", "()Ljava/lang/String;", "Subheader", "getSubheader-VbOBBVs", "EmailLabel", "getEmailLabel-VbOBBVs"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class EmailEntry {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.EmailEntry INSTANCE = new com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.EmailEntry();
        private static final java.lang.String Header = com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16193constructorimpl("email.header.header.label");
        private static final java.lang.String Subheader = com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16193constructorimpl("email.header.subheader.label");
        private static final java.lang.String EmailLabel = com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16193constructorimpl("email.email.email.label");

        private EmailEntry() {
        }

        /* renamed from: getHeader-VbOBBVs, reason: not valid java name */
        public final java.lang.String m16162getHeaderVbOBBVs() {
            return Header;
        }

        /* renamed from: getSubheader-VbOBBVs, reason: not valid java name */
        public final java.lang.String m16163getSubheaderVbOBBVs() {
            return Subheader;
        }

        /* renamed from: getEmailLabel-VbOBBVs, reason: not valid java name */
        public final java.lang.String m16161getEmailLabelVbOBBVs() {
            return EmailLabel;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/shared/variants/domain/OnboardingVariants$Password;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/onboarding/shared/variants/domain/VariantKey;", "Header", "Ljava/lang/String;", "getHeader-VbOBBVs", "()Ljava/lang/String;", "Subheader", "getSubheader-VbOBBVs", "PasswordLabel", "getPasswordLabel-VbOBBVs"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Password {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.Password INSTANCE = new com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.Password();
        private static final java.lang.String Header = com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16193constructorimpl("password.header.header.label");
        private static final java.lang.String Subheader = com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16193constructorimpl("password.header.subheader.label");
        private static final java.lang.String PasswordLabel = com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16193constructorimpl("password.password.password.label");

        private Password() {
        }

        /* renamed from: getHeader-VbOBBVs, reason: not valid java name */
        public final java.lang.String m16164getHeaderVbOBBVs() {
            return Header;
        }

        /* renamed from: getSubheader-VbOBBVs, reason: not valid java name */
        public final java.lang.String m16166getSubheaderVbOBBVs() {
            return Subheader;
        }

        /* renamed from: getPasswordLabel-VbOBBVs, reason: not valid java name */
        public final java.lang.String m16165getPasswordLabelVbOBBVs() {
            return PasswordLabel;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\b\u0018\u0000 72\u00020\u0001:\u00017BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000fJ\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000fJ\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u000fJ\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u000fJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u000fJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u000fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u000fJj\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010)\u001a\u00020(HÖ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010,\u001a\u00020+HÖ\u0001¢\u0006\u0004\b,\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b/\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b0\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b1\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b2\u0010\u000fR\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b3\u0010\u000fR\u001a\u0010\t\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b4\u0010\u000fR\u001a\u0010\n\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b5\u0010\u000fR\u001a\u0010\u000b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010-\u001a\u0004\b6\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/shared/variants/domain/OnboardingVariants$AddressVariantKeys;", "", "Lcom/paypal/oslo/feature/onboarding/shared/variants/domain/VariantKey;", "addressLabel", "editAddressManually", "addressLine1", "addressLine2", "addressAdminArea2", "addressStateDropdownLabel", "addressStateDropdownSearchLabel", "addressStateDropdownSearchNoResults", "addressPostalCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-VbOBBVs", "()Ljava/lang/String;", "component1", "component2-VbOBBVs", "component2", "component3-VbOBBVs", "component3", "component4-VbOBBVs", "component4", "component5-VbOBBVs", "component5", "component6-VbOBBVs", "component6", "component7-VbOBBVs", "component7", "component8-VbOBBVs", "component8", "component9-VbOBBVs", "component9", "copy-1ASbF7Q", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/onboarding/shared/variants/domain/OnboardingVariants$AddressVariantKeys;", "copy", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "Ljava/lang/String;", "getAddressLabel-VbOBBVs", "getEditAddressManually-VbOBBVs", "getAddressLine1-VbOBBVs", "getAddressLine2-VbOBBVs", "getAddressAdminArea2-VbOBBVs", "getAddressStateDropdownLabel-VbOBBVs", "getAddressStateDropdownSearchLabel-VbOBBVs", "getAddressStateDropdownSearchNoResults-VbOBBVs", "getAddressPostalCode-VbOBBVs", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AddressVariantKeys {
        public static final int $stable = 0;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.AddressVariantKeys.Companion INSTANCE = new com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.AddressVariantKeys.Companion(null);
        private final java.lang.String addressAdminArea2;
        private final java.lang.String addressLabel;
        private final java.lang.String addressLine1;
        private final java.lang.String addressLine2;
        private final java.lang.String addressPostalCode;
        private final java.lang.String addressStateDropdownLabel;
        private final java.lang.String addressStateDropdownSearchLabel;
        private final java.lang.String addressStateDropdownSearchNoResults;
        private final java.lang.String editAddressManually;

        private AddressVariantKeys(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str7, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str8, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str9, "");
            this.addressLabel = str;
            this.editAddressManually = str2;
            this.addressLine1 = str3;
            this.addressLine2 = str4;
            this.addressAdminArea2 = str5;
            this.addressStateDropdownLabel = str6;
            this.addressStateDropdownSearchLabel = str7;
            this.addressStateDropdownSearchNoResults = str8;
            this.addressPostalCode = str9;
        }

        /* renamed from: getAddressLabel-VbOBBVs, reason: not valid java name */
        public final java.lang.String m16151getAddressLabelVbOBBVs() {
            return this.addressLabel;
        }

        /* renamed from: getEditAddressManually-VbOBBVs, reason: not valid java name */
        public final java.lang.String m16158getEditAddressManuallyVbOBBVs() {
            return this.editAddressManually;
        }

        /* renamed from: getAddressLine1-VbOBBVs, reason: not valid java name */
        public final java.lang.String m16152getAddressLine1VbOBBVs() {
            return this.addressLine1;
        }

        /* renamed from: getAddressLine2-VbOBBVs, reason: not valid java name */
        public final java.lang.String m16153getAddressLine2VbOBBVs() {
            return this.addressLine2;
        }

        /* renamed from: getAddressAdminArea2-VbOBBVs, reason: not valid java name */
        public final java.lang.String m16150getAddressAdminArea2VbOBBVs() {
            return this.addressAdminArea2;
        }

        /* renamed from: getAddressStateDropdownLabel-VbOBBVs, reason: not valid java name */
        public final java.lang.String m16155getAddressStateDropdownLabelVbOBBVs() {
            return this.addressStateDropdownLabel;
        }

        /* renamed from: getAddressStateDropdownSearchLabel-VbOBBVs, reason: not valid java name */
        public final java.lang.String m16156getAddressStateDropdownSearchLabelVbOBBVs() {
            return this.addressStateDropdownSearchLabel;
        }

        /* renamed from: getAddressStateDropdownSearchNoResults-VbOBBVs, reason: not valid java name */
        public final java.lang.String m16157getAddressStateDropdownSearchNoResultsVbOBBVs() {
            return this.addressStateDropdownSearchNoResults;
        }

        /* renamed from: getAddressPostalCode-VbOBBVs, reason: not valid java name */
        public final java.lang.String m16154getAddressPostalCodeVbOBBVs() {
            return this.addressPostalCode;
        }

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/shared/variants/domain/OnboardingVariants$AddressVariantKeys$Companion;", "", "<init>", "()V", "", "stepPrefix", "Lcom/paypal/oslo/feature/onboarding/shared/variants/domain/OnboardingVariants$AddressVariantKeys;", "create", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/onboarding/shared/variants/domain/OnboardingVariants$AddressVariantKeys;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.AddressVariantKeys create(java.lang.String stepPrefix) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepPrefix, "");
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(stepPrefix);
                sb.append(".address.compressed_address.label");
                java.lang.String m16193constructorimpl = com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16193constructorimpl(sb.toString());
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(stepPrefix);
                sb2.append(".link.link.label");
                java.lang.String m16193constructorimpl2 = com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16193constructorimpl(sb2.toString());
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                sb3.append(stepPrefix);
                sb3.append(".address.address_line1.label");
                java.lang.String m16193constructorimpl3 = com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16193constructorimpl(sb3.toString());
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                sb4.append(stepPrefix);
                sb4.append(".address.address_line2.label");
                java.lang.String m16193constructorimpl4 = com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16193constructorimpl(sb4.toString());
                java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
                sb5.append(stepPrefix);
                sb5.append(".address.admin_area2.label");
                java.lang.String m16193constructorimpl5 = com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16193constructorimpl(sb5.toString());
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(stepPrefix);
                sb6.append(".address.admin_area1.label");
                java.lang.String m16193constructorimpl6 = com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16193constructorimpl(sb6.toString());
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                sb7.append(stepPrefix);
                sb7.append(".address.admin_area1.search.label");
                java.lang.String m16193constructorimpl7 = com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16193constructorimpl(sb7.toString());
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                sb8.append(stepPrefix);
                sb8.append(".address.admin_area1.search.no_results");
                java.lang.String m16193constructorimpl8 = com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16193constructorimpl(sb8.toString());
                java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
                sb9.append(stepPrefix);
                sb9.append(".address.postal_code.label");
                return new com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.AddressVariantKeys(m16193constructorimpl, m16193constructorimpl2, m16193constructorimpl3, m16193constructorimpl4, m16193constructorimpl5, m16193constructorimpl6, m16193constructorimpl7, m16193constructorimpl8, com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16193constructorimpl(sb9.toString()), null);
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            java.lang.String m16197toStringimpl = com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16197toStringimpl(this.addressLabel);
            java.lang.String m16197toStringimpl2 = com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16197toStringimpl(this.editAddressManually);
            java.lang.String m16197toStringimpl3 = com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16197toStringimpl(this.addressLine1);
            java.lang.String m16197toStringimpl4 = com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16197toStringimpl(this.addressLine2);
            java.lang.String m16197toStringimpl5 = com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16197toStringimpl(this.addressAdminArea2);
            java.lang.String m16197toStringimpl6 = com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16197toStringimpl(this.addressStateDropdownLabel);
            java.lang.String m16197toStringimpl7 = com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16197toStringimpl(this.addressStateDropdownSearchLabel);
            java.lang.String m16197toStringimpl8 = com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16197toStringimpl(this.addressStateDropdownSearchNoResults);
            java.lang.String m16197toStringimpl9 = com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16197toStringimpl(this.addressPostalCode);
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AddressVariantKeys(addressLabel=");
            sb.append(m16197toStringimpl);
            sb.append(", editAddressManually=");
            sb.append(m16197toStringimpl2);
            sb.append(", addressLine1=");
            sb.append(m16197toStringimpl3);
            sb.append(", addressLine2=");
            sb.append(m16197toStringimpl4);
            sb.append(", addressAdminArea2=");
            sb.append(m16197toStringimpl5);
            sb.append(", addressStateDropdownLabel=");
            sb.append(m16197toStringimpl6);
            sb.append(", addressStateDropdownSearchLabel=");
            sb.append(m16197toStringimpl7);
            sb.append(", addressStateDropdownSearchNoResults=");
            sb.append(m16197toStringimpl8);
            sb.append(", addressPostalCode=");
            sb.append(m16197toStringimpl9);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((((((((((((com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16196hashCodeimpl(this.addressLabel) * 31) + com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16196hashCodeimpl(this.editAddressManually)) * 31) + com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16196hashCodeimpl(this.addressLine1)) * 31) + com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16196hashCodeimpl(this.addressLine2)) * 31) + com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16196hashCodeimpl(this.addressAdminArea2)) * 31) + com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16196hashCodeimpl(this.addressStateDropdownLabel)) * 31) + com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16196hashCodeimpl(this.addressStateDropdownSearchLabel)) * 31) + com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16196hashCodeimpl(this.addressStateDropdownSearchNoResults)) * 31) + com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16196hashCodeimpl(this.addressPostalCode);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.AddressVariantKeys)) {
                return false;
            }
            com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.AddressVariantKeys addressVariantKeys = (com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.AddressVariantKeys) other;
            return com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16195equalsimpl0(this.addressLabel, addressVariantKeys.addressLabel) && com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16195equalsimpl0(this.editAddressManually, addressVariantKeys.editAddressManually) && com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16195equalsimpl0(this.addressLine1, addressVariantKeys.addressLine1) && com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16195equalsimpl0(this.addressLine2, addressVariantKeys.addressLine2) && com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16195equalsimpl0(this.addressAdminArea2, addressVariantKeys.addressAdminArea2) && com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16195equalsimpl0(this.addressStateDropdownLabel, addressVariantKeys.addressStateDropdownLabel) && com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16195equalsimpl0(this.addressStateDropdownSearchLabel, addressVariantKeys.addressStateDropdownSearchLabel) && com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16195equalsimpl0(this.addressStateDropdownSearchNoResults, addressVariantKeys.addressStateDropdownSearchNoResults) && com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16195equalsimpl0(this.addressPostalCode, addressVariantKeys.addressPostalCode);
        }

        /* renamed from: copy-1ASbF7Q, reason: not valid java name */
        public final com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.AddressVariantKeys m16149copy1ASbF7Q(java.lang.String addressLabel, java.lang.String editAddressManually, java.lang.String addressLine1, java.lang.String addressLine2, java.lang.String addressAdminArea2, java.lang.String addressStateDropdownLabel, java.lang.String addressStateDropdownSearchLabel, java.lang.String addressStateDropdownSearchNoResults, java.lang.String addressPostalCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressLabel, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(editAddressManually, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressLine1, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressLine2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressAdminArea2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressStateDropdownLabel, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressStateDropdownSearchLabel, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressStateDropdownSearchNoResults, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressPostalCode, "");
            return new com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.AddressVariantKeys(addressLabel, editAddressManually, addressLine1, addressLine2, addressAdminArea2, addressStateDropdownLabel, addressStateDropdownSearchLabel, addressStateDropdownSearchNoResults, addressPostalCode, null);
        }

        /* renamed from: component9-VbOBBVs, reason: not valid java name and from getter */
        public final java.lang.String getAddressPostalCode() {
            return this.addressPostalCode;
        }

        /* renamed from: component8-VbOBBVs, reason: not valid java name and from getter */
        public final java.lang.String getAddressStateDropdownSearchNoResults() {
            return this.addressStateDropdownSearchNoResults;
        }

        /* renamed from: component7-VbOBBVs, reason: not valid java name and from getter */
        public final java.lang.String getAddressStateDropdownSearchLabel() {
            return this.addressStateDropdownSearchLabel;
        }

        /* renamed from: component6-VbOBBVs, reason: not valid java name and from getter */
        public final java.lang.String getAddressStateDropdownLabel() {
            return this.addressStateDropdownLabel;
        }

        /* renamed from: component5-VbOBBVs, reason: not valid java name and from getter */
        public final java.lang.String getAddressAdminArea2() {
            return this.addressAdminArea2;
        }

        /* renamed from: component4-VbOBBVs, reason: not valid java name and from getter */
        public final java.lang.String getAddressLine2() {
            return this.addressLine2;
        }

        /* renamed from: component3-VbOBBVs, reason: not valid java name and from getter */
        public final java.lang.String getAddressLine1() {
            return this.addressLine1;
        }

        /* renamed from: component2-VbOBBVs, reason: not valid java name and from getter */
        public final java.lang.String getEditAddressManually() {
            return this.editAddressManually;
        }

        /* renamed from: component1-VbOBBVs, reason: not valid java name and from getter */
        public final java.lang.String getAddressLabel() {
            return this.addressLabel;
        }

        public /* synthetic */ AddressVariantKeys(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, str5, str6, str7, str8, str9);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u0000 /2\u00020\u0001:\u0001/B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\rJ\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJ\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\rJ\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\rJ\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\rJV\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b*\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b+\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b,\u0010\rR\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b-\u0010\rR\u001a\u0010\t\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b.\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/shared/variants/domain/OnboardingVariants$TermsVariantKeys;", "", "Lcom/paypal/oslo/feature/onboarding/shared/variants/domain/VariantKey;", "termsText", "termsESignConsentLabel", "termsESignConsentUrl", "termsUserAgreementLabel", "termsUserAgreementUrl", "termsPrivacyStatementLabel", "termsPrivacyStatementUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-VbOBBVs", "()Ljava/lang/String;", "component1", "component2-VbOBBVs", "component2", "component3-VbOBBVs", "component3", "component4-VbOBBVs", "component4", "component5-VbOBBVs", "component5", "component6-VbOBBVs", "component6", "component7-VbOBBVs", "component7", "copy-DCFNlUc", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/onboarding/shared/variants/domain/OnboardingVariants$TermsVariantKeys;", "copy", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "Ljava/lang/String;", "getTermsText-VbOBBVs", "getTermsESignConsentLabel-VbOBBVs", "getTermsESignConsentUrl-VbOBBVs", "getTermsUserAgreementLabel-VbOBBVs", "getTermsUserAgreementUrl-VbOBBVs", "getTermsPrivacyStatementLabel-VbOBBVs", "getTermsPrivacyStatementUrl-VbOBBVs", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TermsVariantKeys {
        public static final int $stable = 0;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.TermsVariantKeys.Companion INSTANCE = new com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.TermsVariantKeys.Companion(null);
        private final java.lang.String termsESignConsentLabel;
        private final java.lang.String termsESignConsentUrl;
        private final java.lang.String termsPrivacyStatementLabel;
        private final java.lang.String termsPrivacyStatementUrl;
        private final java.lang.String termsText;
        private final java.lang.String termsUserAgreementLabel;
        private final java.lang.String termsUserAgreementUrl;

        private TermsVariantKeys(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str7, "");
            this.termsText = str;
            this.termsESignConsentLabel = str2;
            this.termsESignConsentUrl = str3;
            this.termsUserAgreementLabel = str4;
            this.termsUserAgreementUrl = str5;
            this.termsPrivacyStatementLabel = str6;
            this.termsPrivacyStatementUrl = str7;
        }

        /* renamed from: getTermsText-VbOBBVs, reason: not valid java name */
        public final java.lang.String m16189getTermsTextVbOBBVs() {
            return this.termsText;
        }

        /* renamed from: getTermsESignConsentLabel-VbOBBVs, reason: not valid java name */
        public final java.lang.String m16185getTermsESignConsentLabelVbOBBVs() {
            return this.termsESignConsentLabel;
        }

        /* renamed from: getTermsESignConsentUrl-VbOBBVs, reason: not valid java name */
        public final java.lang.String m16186getTermsESignConsentUrlVbOBBVs() {
            return this.termsESignConsentUrl;
        }

        /* renamed from: getTermsUserAgreementLabel-VbOBBVs, reason: not valid java name */
        public final java.lang.String m16190getTermsUserAgreementLabelVbOBBVs() {
            return this.termsUserAgreementLabel;
        }

        /* renamed from: getTermsUserAgreementUrl-VbOBBVs, reason: not valid java name */
        public final java.lang.String m16191getTermsUserAgreementUrlVbOBBVs() {
            return this.termsUserAgreementUrl;
        }

        /* renamed from: getTermsPrivacyStatementLabel-VbOBBVs, reason: not valid java name */
        public final java.lang.String m16187getTermsPrivacyStatementLabelVbOBBVs() {
            return this.termsPrivacyStatementLabel;
        }

        /* renamed from: getTermsPrivacyStatementUrl-VbOBBVs, reason: not valid java name */
        public final java.lang.String m16188getTermsPrivacyStatementUrlVbOBBVs() {
            return this.termsPrivacyStatementUrl;
        }

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/shared/variants/domain/OnboardingVariants$TermsVariantKeys$Companion;", "", "<init>", "()V", "", "stepPrefix", "Lcom/paypal/oslo/feature/onboarding/shared/variants/domain/OnboardingVariants$TermsVariantKeys;", "create", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/onboarding/shared/variants/domain/OnboardingVariants$TermsVariantKeys;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.TermsVariantKeys create(java.lang.String stepPrefix) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepPrefix, "");
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(stepPrefix);
                sb.append(".terms_and_conditions.terms_and_conditions.text");
                java.lang.String m16193constructorimpl = com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16193constructorimpl(sb.toString());
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(stepPrefix);
                sb2.append(".terms_and_conditions.terms_and_conditions.link.esign_consent.label");
                java.lang.String m16193constructorimpl2 = com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16193constructorimpl(sb2.toString());
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                sb3.append(stepPrefix);
                sb3.append(".terms_and_conditions.terms_and_conditions.link.esign_consent.url");
                java.lang.String m16193constructorimpl3 = com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16193constructorimpl(sb3.toString());
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                sb4.append(stepPrefix);
                sb4.append(".terms_and_conditions.terms_and_conditions.link.user_agreement.label");
                java.lang.String m16193constructorimpl4 = com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16193constructorimpl(sb4.toString());
                java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
                sb5.append(stepPrefix);
                sb5.append(".terms_and_conditions.terms_and_conditions.link.user_agreement.url");
                java.lang.String m16193constructorimpl5 = com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16193constructorimpl(sb5.toString());
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(stepPrefix);
                sb6.append(".terms_and_conditions.terms_and_conditions.link.privacy_statement.label");
                java.lang.String m16193constructorimpl6 = com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16193constructorimpl(sb6.toString());
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                sb7.append(stepPrefix);
                sb7.append(".terms_and_conditions.terms_and_conditions.link.privacy_statement.url");
                return new com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.TermsVariantKeys(m16193constructorimpl, m16193constructorimpl2, m16193constructorimpl3, m16193constructorimpl4, m16193constructorimpl5, m16193constructorimpl6, com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16193constructorimpl(sb7.toString()), null);
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            java.lang.String m16197toStringimpl = com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16197toStringimpl(this.termsText);
            java.lang.String m16197toStringimpl2 = com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16197toStringimpl(this.termsESignConsentLabel);
            java.lang.String m16197toStringimpl3 = com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16197toStringimpl(this.termsESignConsentUrl);
            java.lang.String m16197toStringimpl4 = com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16197toStringimpl(this.termsUserAgreementLabel);
            java.lang.String m16197toStringimpl5 = com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16197toStringimpl(this.termsUserAgreementUrl);
            java.lang.String m16197toStringimpl6 = com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16197toStringimpl(this.termsPrivacyStatementLabel);
            java.lang.String m16197toStringimpl7 = com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16197toStringimpl(this.termsPrivacyStatementUrl);
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TermsVariantKeys(termsText=");
            sb.append(m16197toStringimpl);
            sb.append(", termsESignConsentLabel=");
            sb.append(m16197toStringimpl2);
            sb.append(", termsESignConsentUrl=");
            sb.append(m16197toStringimpl3);
            sb.append(", termsUserAgreementLabel=");
            sb.append(m16197toStringimpl4);
            sb.append(", termsUserAgreementUrl=");
            sb.append(m16197toStringimpl5);
            sb.append(", termsPrivacyStatementLabel=");
            sb.append(m16197toStringimpl6);
            sb.append(", termsPrivacyStatementUrl=");
            sb.append(m16197toStringimpl7);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((((((((com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16196hashCodeimpl(this.termsText) * 31) + com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16196hashCodeimpl(this.termsESignConsentLabel)) * 31) + com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16196hashCodeimpl(this.termsESignConsentUrl)) * 31) + com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16196hashCodeimpl(this.termsUserAgreementLabel)) * 31) + com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16196hashCodeimpl(this.termsUserAgreementUrl)) * 31) + com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16196hashCodeimpl(this.termsPrivacyStatementLabel)) * 31) + com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16196hashCodeimpl(this.termsPrivacyStatementUrl);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.TermsVariantKeys)) {
                return false;
            }
            com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.TermsVariantKeys termsVariantKeys = (com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.TermsVariantKeys) other;
            return com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16195equalsimpl0(this.termsText, termsVariantKeys.termsText) && com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16195equalsimpl0(this.termsESignConsentLabel, termsVariantKeys.termsESignConsentLabel) && com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16195equalsimpl0(this.termsESignConsentUrl, termsVariantKeys.termsESignConsentUrl) && com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16195equalsimpl0(this.termsUserAgreementLabel, termsVariantKeys.termsUserAgreementLabel) && com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16195equalsimpl0(this.termsUserAgreementUrl, termsVariantKeys.termsUserAgreementUrl) && com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16195equalsimpl0(this.termsPrivacyStatementLabel, termsVariantKeys.termsPrivacyStatementLabel) && com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16195equalsimpl0(this.termsPrivacyStatementUrl, termsVariantKeys.termsPrivacyStatementUrl);
        }

        /* renamed from: copy-DCFNlUc, reason: not valid java name */
        public final com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.TermsVariantKeys m16184copyDCFNlUc(java.lang.String termsText, java.lang.String termsESignConsentLabel, java.lang.String termsESignConsentUrl, java.lang.String termsUserAgreementLabel, java.lang.String termsUserAgreementUrl, java.lang.String termsPrivacyStatementLabel, java.lang.String termsPrivacyStatementUrl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(termsText, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(termsESignConsentLabel, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(termsESignConsentUrl, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(termsUserAgreementLabel, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(termsUserAgreementUrl, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(termsPrivacyStatementLabel, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(termsPrivacyStatementUrl, "");
            return new com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.TermsVariantKeys(termsText, termsESignConsentLabel, termsESignConsentUrl, termsUserAgreementLabel, termsUserAgreementUrl, termsPrivacyStatementLabel, termsPrivacyStatementUrl, null);
        }

        /* renamed from: component7-VbOBBVs, reason: not valid java name and from getter */
        public final java.lang.String getTermsPrivacyStatementUrl() {
            return this.termsPrivacyStatementUrl;
        }

        /* renamed from: component6-VbOBBVs, reason: not valid java name and from getter */
        public final java.lang.String getTermsPrivacyStatementLabel() {
            return this.termsPrivacyStatementLabel;
        }

        /* renamed from: component5-VbOBBVs, reason: not valid java name and from getter */
        public final java.lang.String getTermsUserAgreementUrl() {
            return this.termsUserAgreementUrl;
        }

        /* renamed from: component4-VbOBBVs, reason: not valid java name and from getter */
        public final java.lang.String getTermsUserAgreementLabel() {
            return this.termsUserAgreementLabel;
        }

        /* renamed from: component3-VbOBBVs, reason: not valid java name and from getter */
        public final java.lang.String getTermsESignConsentUrl() {
            return this.termsESignConsentUrl;
        }

        /* renamed from: component2-VbOBBVs, reason: not valid java name and from getter */
        public final java.lang.String getTermsESignConsentLabel() {
            return this.termsESignConsentLabel;
        }

        /* renamed from: component1-VbOBBVs, reason: not valid java name and from getter */
        public final java.lang.String getTermsText() {
            return this.termsText;
        }

        /* renamed from: copy-DCFNlUc$default, reason: not valid java name */
        public static /* synthetic */ com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.TermsVariantKeys m16176copyDCFNlUc$default(com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.TermsVariantKeys termsVariantKeys, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = termsVariantKeys.termsText;
            }
            if ((i & 2) != 0) {
                str2 = termsVariantKeys.termsESignConsentLabel;
            }
            java.lang.String str8 = str2;
            if ((i & 4) != 0) {
                str3 = termsVariantKeys.termsESignConsentUrl;
            }
            java.lang.String str9 = str3;
            if ((i & 8) != 0) {
                str4 = termsVariantKeys.termsUserAgreementLabel;
            }
            java.lang.String str10 = str4;
            if ((i & 16) != 0) {
                str5 = termsVariantKeys.termsUserAgreementUrl;
            }
            java.lang.String str11 = str5;
            if ((i & 32) != 0) {
                str6 = termsVariantKeys.termsPrivacyStatementLabel;
            }
            java.lang.String str12 = str6;
            if ((i & 64) != 0) {
                str7 = termsVariantKeys.termsPrivacyStatementUrl;
            }
            return termsVariantKeys.m16184copyDCFNlUc(str, str8, str9, str10, str11, str12, str7);
        }

        public /* synthetic */ TermsVariantKeys(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, str5, str6, str7);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001a\u0010\u0010\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\u00148\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/shared/variants/domain/OnboardingVariants$PersonalInfo;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/onboarding/shared/variants/domain/VariantKey;", "Header", "Ljava/lang/String;", "getHeader-VbOBBVs", "()Ljava/lang/String;", "Subheader", "getSubheader-VbOBBVs", "FirstNameLabel", "getFirstNameLabel-VbOBBVs", "LastNameLabel", "getLastNameLabel-VbOBBVs", "Lcom/paypal/oslo/feature/onboarding/shared/variants/domain/OnboardingVariants$AddressVariantKeys;", "Address", "Lcom/paypal/oslo/feature/onboarding/shared/variants/domain/OnboardingVariants$AddressVariantKeys;", "getAddress", "()Lcom/paypal/oslo/feature/onboarding/shared/variants/domain/OnboardingVariants$AddressVariantKeys;", "Lcom/paypal/oslo/feature/onboarding/shared/variants/domain/OnboardingVariants$TermsVariantKeys;", "Terms", "Lcom/paypal/oslo/feature/onboarding/shared/variants/domain/OnboardingVariants$TermsVariantKeys;", "getTerms", "()Lcom/paypal/oslo/feature/onboarding/shared/variants/domain/OnboardingVariants$TermsVariantKeys;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PersonalInfo {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.PersonalInfo INSTANCE = new com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.PersonalInfo();
        private static final java.lang.String Header = com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16193constructorimpl("personal_info.header.header.label");
        private static final java.lang.String Subheader = com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16193constructorimpl("personal_info.header.subheader.label");
        private static final java.lang.String FirstNameLabel = com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16193constructorimpl("personal_info.name.first_name.label");
        private static final java.lang.String LastNameLabel = com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16193constructorimpl("personal_info.name.last_name.label");
        private static final com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.AddressVariantKeys Address = com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.AddressVariantKeys.INSTANCE.create(com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics.PersonalInfoAnalytics.ScreenId);
        private static final com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.TermsVariantKeys Terms = com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.TermsVariantKeys.INSTANCE.create(com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics.PersonalInfoAnalytics.ScreenId);

        private PersonalInfo() {
        }

        /* renamed from: getHeader-VbOBBVs, reason: not valid java name */
        public final java.lang.String m16168getHeaderVbOBBVs() {
            return Header;
        }

        /* renamed from: getSubheader-VbOBBVs, reason: not valid java name */
        public final java.lang.String m16170getSubheaderVbOBBVs() {
            return Subheader;
        }

        /* renamed from: getFirstNameLabel-VbOBBVs, reason: not valid java name */
        public final java.lang.String m16167getFirstNameLabelVbOBBVs() {
            return FirstNameLabel;
        }

        /* renamed from: getLastNameLabel-VbOBBVs, reason: not valid java name */
        public final java.lang.String m16169getLastNameLabelVbOBBVs() {
            return LastNameLabel;
        }

        public final com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.AddressVariantKeys getAddress() {
            return Address;
        }

        public final com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.TermsVariantKeys getTerms() {
            return Terms;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/shared/variants/domain/OnboardingVariants$AddressInfo;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/onboarding/shared/variants/domain/VariantKey;", "Header", "Ljava/lang/String;", "getHeader-VbOBBVs", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/onboarding/shared/variants/domain/OnboardingVariants$AddressVariantKeys;", "Address", "Lcom/paypal/oslo/feature/onboarding/shared/variants/domain/OnboardingVariants$AddressVariantKeys;", "getAddress", "()Lcom/paypal/oslo/feature/onboarding/shared/variants/domain/OnboardingVariants$AddressVariantKeys;", "Lcom/paypal/oslo/feature/onboarding/shared/variants/domain/OnboardingVariants$TermsVariantKeys;", "Terms", "Lcom/paypal/oslo/feature/onboarding/shared/variants/domain/OnboardingVariants$TermsVariantKeys;", "getTerms", "()Lcom/paypal/oslo/feature/onboarding/shared/variants/domain/OnboardingVariants$TermsVariantKeys;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AddressInfo {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.AddressInfo INSTANCE = new com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.AddressInfo();
        private static final java.lang.String Header = com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16193constructorimpl("address_info.header.header.label");
        private static final com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.AddressVariantKeys Address = com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.AddressVariantKeys.INSTANCE.create("address_info");
        private static final com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.TermsVariantKeys Terms = com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.TermsVariantKeys.INSTANCE.create("address_info");

        private AddressInfo() {
        }

        /* renamed from: getHeader-VbOBBVs, reason: not valid java name */
        public final java.lang.String m16138getHeaderVbOBBVs() {
            return Header;
        }

        public final com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.AddressVariantKeys getAddress() {
            return Address;
        }

        public final com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.TermsVariantKeys getTerms() {
            return Terms;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/shared/variants/domain/OnboardingVariants$BottomNavigation;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/onboarding/shared/variants/domain/VariantKey;", "Next", "Ljava/lang/String;", "getNext-VbOBBVs", "()Ljava/lang/String;", "CreateAccount", "getCreateAccount-VbOBBVs"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class BottomNavigation {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.BottomNavigation INSTANCE = new com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.BottomNavigation();
        private static final java.lang.String Next = com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16193constructorimpl("bottom_navigation.button.next.label");
        private static final java.lang.String CreateAccount = com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16193constructorimpl("bottom_navigation.button.create_account.label");

        private BottomNavigation() {
        }

        /* renamed from: getNext-VbOBBVs, reason: not valid java name */
        public final java.lang.String m16160getNextVbOBBVs() {
            return Next;
        }

        /* renamed from: getCreateAccount-VbOBBVs, reason: not valid java name */
        public final java.lang.String m16159getCreateAccountVbOBBVs() {
            return CreateAccount;
        }
    }

    public final java.util.Map<com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey, java.lang.Integer> getVariants() {
        return variants;
    }
}
