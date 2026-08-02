package com.paypal.oslo.feature.wallet.common.util;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "buildUserAgreementUrl", "()Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class LegalUrlBuilderKt {
    public static final java.lang.String buildUserAgreementUrl() {
        java.util.Locale locale = java.util.Locale.getDefault();
        java.lang.String country = locale.getCountry();
        if (country.length() == 0) {
            country = "US";
        }
        java.lang.String str = country;
        java.lang.String language = locale.getLanguage();
        if (language.length() == 0) {
            language = "en";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(language);
        sb.append("_");
        sb.append(str);
        java.lang.String obj = sb.toString();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("https://www.paypal.com/");
        sb2.append(str);
        sb2.append("/legalhub/paypal/useragreement-full?locale.x=");
        sb2.append(obj);
        return sb2.toString();
    }
}
