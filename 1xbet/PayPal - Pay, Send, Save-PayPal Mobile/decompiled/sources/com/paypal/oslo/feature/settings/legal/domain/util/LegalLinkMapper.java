package com.paypal.oslo.feature.settings.legal.domain.util;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\rR \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/settings/legal/domain/util/LegalLinkMapper;", "", "<init>", "()V", "", "url", "Ljava/util/Locale;", "locale", "formatUrlWithLocale", "(Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;", "id", "", "getLegalTitleStringResId", "(Ljava/lang/String;)Ljava/lang/Integer;", "getLegalSubtitleStringResId", "", "getHighSpeedVideoSizes", "Ljava/util/Map;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class LegalLinkMapper {
    public static final com.paypal.oslo.feature.settings.legal.domain.util.LegalLinkMapper INSTANCE = new com.paypal.oslo.feature.settings.legal.domain.util.LegalLinkMapper();

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private static final java.util.Map<java.lang.String, java.lang.Integer> Camera2StreamConfigurationMap = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("user_agreement", java.lang.Integer.valueOf(com.paypal.oslo.feature.settings.R.string.feature_settings_legal_user_agreement)), kotlin.TuplesKt.to("purchase_protection", java.lang.Integer.valueOf(com.paypal.oslo.feature.settings.R.string.feature_settings_legal_purchase_protection)), kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.ui.review.composables.ReviewDisclaimerHelper.SELLER_PROTECTION_LINK_TAG, java.lang.Integer.valueOf(com.paypal.oslo.feature.settings.R.string.feature_settings_legal_seller_protection)), kotlin.TuplesKt.to("acceptable_use_policy", java.lang.Integer.valueOf(com.paypal.oslo.feature.settings.R.string.feature_settings_legal_acceptable_user_policy)), kotlin.TuplesKt.to("paypal_balance_terms_and_conditions", java.lang.Integer.valueOf(com.paypal.oslo.feature.settings.R.string.feature_settings_legal_paypal_balance)), kotlin.TuplesKt.to("paypal_balance_short_form_disclosure", java.lang.Integer.valueOf(com.paypal.oslo.feature.settings.R.string.feature_settings_legal_paypal_balance)), kotlin.TuplesKt.to("paypal_balance_long_form_disclosure", java.lang.Integer.valueOf(com.paypal.oslo.feature.settings.R.string.feature_settings_legal_paypal_balance)), kotlin.TuplesKt.to(com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.authorization.AddBankAuthorizeModalKt.AnnotationPrivacyPolicy, java.lang.Integer.valueOf(com.paypal.oslo.feature.settings.R.string.feature_settings_legal_privacy_policy)), kotlin.TuplesKt.to("legal_notices", java.lang.Integer.valueOf(com.paypal.oslo.feature.settings.R.string.feature_settings_legal_notices)), kotlin.TuplesKt.to("license_agreement", java.lang.Integer.valueOf(com.paypal.oslo.feature.settings.R.string.feature_settings_legal_license_agreement)), kotlin.TuplesKt.to("delivery_policy", java.lang.Integer.valueOf(com.paypal.oslo.feature.settings.R.string.feature_settings_legal_delivery_policy)), kotlin.TuplesKt.to("acknowledgements", java.lang.Integer.valueOf(com.paypal.oslo.feature.settings.R.string.feature_settings_legal_acknowledgements)), kotlin.TuplesKt.to("state_licenses", java.lang.Integer.valueOf(com.paypal.oslo.feature.settings.R.string.feature_settings_legal_state_licenses)), kotlin.TuplesKt.to("program_banks", java.lang.Integer.valueOf(com.paypal.oslo.feature.settings.R.string.feature_settings_legal_program_banks)), kotlin.TuplesKt.to("product_disclosure_statement", java.lang.Integer.valueOf(com.paypal.oslo.feature.settings.R.string.feature_settings_legal_product_disclosure_statement)), kotlin.TuplesKt.to("key_payment_and_service_information", java.lang.Integer.valueOf(com.paypal.oslo.feature.settings.R.string.feature_settings_legal_key_payment_and_service_information)));

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private static final java.util.Map<java.lang.String, java.lang.Integer> getHighSpeedVideoSizes = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("paypal_balance_terms_and_conditions", java.lang.Integer.valueOf(com.paypal.oslo.feature.settings.R.string.feature_settings_legal_paypal_balance_terms_and_conditions_subtitle)), kotlin.TuplesKt.to("paypal_balance_short_form_disclosure", java.lang.Integer.valueOf(com.paypal.oslo.feature.settings.R.string.feature_settings_legal_paypal_balance_short_form_disclosure_subtitle)), kotlin.TuplesKt.to("paypal_balance_long_form_disclosure", java.lang.Integer.valueOf(com.paypal.oslo.feature.settings.R.string.feature_settings_legal_paypal_balance_long_form_disclosure_subtitle)));
    public static final int $stable = 8;

    private LegalLinkMapper() {
    }

    public static /* synthetic */ java.lang.String formatUrlWithLocale$default(com.paypal.oslo.feature.settings.legal.domain.util.LegalLinkMapper legalLinkMapper, java.lang.String str, java.util.Locale locale, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            locale = java.util.Locale.getDefault();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
        }
        return legalLinkMapper.formatUrlWithLocale(str, locale);
    }

    public final java.lang.String formatUrlWithLocale(java.lang.String url, java.util.Locale locale) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locale, "");
        java.lang.String language = locale.getLanguage();
        java.lang.String language2 = locale.getLanguage();
        java.lang.String country = locale.getCountry();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(language2);
        sb.append("_");
        sb.append(country);
        java.lang.String obj = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNull(language);
        return kotlin.text.StringsKt.replace$default(kotlin.text.StringsKt.replace$default(kotlin.text.StringsKt.replace$default(kotlin.text.StringsKt.replace$default(url, "%1$s", language, false, 4, (java.lang.Object) null), "%2$s", obj, false, 4, (java.lang.Object) null), "%251$s", language, false, 4, (java.lang.Object) null), "%252$s", obj, false, 4, (java.lang.Object) null);
    }

    public final java.lang.Integer getLegalTitleStringResId(java.lang.String id) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        java.lang.Integer num = Camera2StreamConfigurationMap.get(id);
        if (num == null) {
            com.paypal.android.logger.standardized.LoggerExtensionsKt.w$default(com.paypal.oslo.feature.settings.LoggerKt.log, com.paypal.android.logger.categories.Data.Warning.INSTANCE, "Legal link ID not found in map", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("id", id)), null, 8, null);
        }
        return num;
    }

    public final java.lang.Integer getLegalSubtitleStringResId(java.lang.String id) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        return getHighSpeedVideoSizes.get(id);
    }
}
