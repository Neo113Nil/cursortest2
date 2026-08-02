package com.payair.hce;

/* loaded from: classes4.dex */
public final class getApplicationExpiryDate {
    public static com.payair.hce.getMagstripeCvmIssuerOptions values(com.payair.hce.IccPrivateKeyCrtComponentsJson iccPrivateKeyCrtComponentsJson, java.lang.Class cls, java.lang.Object obj) {
        java.lang.Class cls2 = obj != null ? obj.getClass() : cls;
        com.payair.hce.getMagstripeCvmIssuerOptions valueOf = iccPrivateKeyCrtComponentsJson.valueOf(new com.payair.hce.getPinAlwaysRequiredIfCurrencyProvided(cls2));
        if (cls == cls2 || !((valueOf instanceof com.payair.hce.CardAlternateContactlessPaymentDataJson) || (valueOf instanceof com.payair.hce.getDq.DigitizedCardProfile))) {
            return valueOf;
        }
        com.payair.hce.getMagstripeCvmIssuerOptions valueOf2 = iccPrivateKeyCrtComponentsJson.valueOf(new com.payair.hce.getPinAlwaysRequiredIfCurrencyProvided(cls));
        return ((valueOf2 instanceof com.payair.hce.CardAlternateContactlessPaymentDataJson) || (valueOf2 instanceof com.payair.hce.getDq.DigitizedCardProfile)) ? valueOf : valueOf2;
    }
}
