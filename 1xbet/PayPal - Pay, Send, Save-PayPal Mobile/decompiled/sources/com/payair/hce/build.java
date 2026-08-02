package com.payair.hce;

/* loaded from: classes4.dex */
public final class build<E> extends com.payair.hce.getMagstripeCvmIssuerOptions<java.lang.Object> {
    public static final com.payair.hce.getCardholderValidators DigitizedCardProfile = new com.payair.hce.getCardholderValidators() { // from class: com.payair.hce.build.1
        @Override // com.payair.hce.getCardholderValidators
        public final <T> com.payair.hce.getMagstripeCvmIssuerOptions<T> DigitizedCardProfile(com.payair.hce.IccPrivateKeyCrtComponentsJson iccPrivateKeyCrtComponentsJson, com.payair.hce.getPinAlwaysRequiredIfCurrencyProvided<T> getpinalwaysrequiredifcurrencyprovided) {
            java.lang.reflect.Type type = getpinalwaysrequiredifcurrencyprovided.AlternateContactlessPaymentDataJson;
            if (!(type instanceof java.lang.reflect.GenericArrayType) && (!(type instanceof java.lang.Class) || !((java.lang.Class) type).isArray())) {
                return null;
            }
            java.lang.reflect.Type values = com.payair.hce.getCdol1RelatedDataLength.values(type);
            return new com.payair.hce.build(iccPrivateKeyCrtComponentsJson, iccPrivateKeyCrtComponentsJson.valueOf(new com.payair.hce.getPinAlwaysRequiredIfCurrencyProvided<>(values)), com.payair.hce.getCdol1RelatedDataLength.valueOf(values));
        }
    };
    private final java.lang.Class<E> AlternateContactlessPaymentDataJson;
    private final com.payair.hce.getMagstripeCvmIssuerOptions<E> writeReplace;

    public build(com.payair.hce.IccPrivateKeyCrtComponentsJson iccPrivateKeyCrtComponentsJson, com.payair.hce.getMagstripeCvmIssuerOptions<E> getmagstripecvmissueroptions, java.lang.Class<E> cls) {
        this.writeReplace = new com.payair.hce.getU(iccPrivateKeyCrtComponentsJson, getmagstripecvmissueroptions, cls);
        this.AlternateContactlessPaymentDataJson = cls;
    }

    @Override // com.payair.hce.getMagstripeCvmIssuerOptions
    public final java.lang.Object AlternateContactlessPaymentDataJson(com.payair.hce.getAckAutomaticallyResetByApplication getackautomaticallyresetbyapplication) throws java.io.IOException {
        if (getackautomaticallyresetbyapplication.getProfileVersion() == com.payair.hce.getAckPreEntryAllowed.NULL) {
            getackautomaticallyresetbyapplication.RecordsJson();
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        getackautomaticallyresetbyapplication.AlternateContactlessPaymentDataJson();
        while (getackautomaticallyresetbyapplication.values()) {
            arrayList.add(this.writeReplace.AlternateContactlessPaymentDataJson(getackautomaticallyresetbyapplication));
        }
        getackautomaticallyresetbyapplication.valueOf();
        int size = arrayList.size();
        java.lang.Object newInstance = java.lang.reflect.Array.newInstance((java.lang.Class<?>) this.AlternateContactlessPaymentDataJson, size);
        for (int i = 0; i < size; i++) {
            java.lang.reflect.Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }

    @Override // com.payair.hce.getMagstripeCvmIssuerOptions
    public final void writeReplace(com.payair.hce.getRemotePaymentData getremotepaymentdata, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            getremotepaymentdata.writeReplace();
            return;
        }
        getremotepaymentdata.DigitizedCardProfile();
        int length = java.lang.reflect.Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.writeReplace.writeReplace(getremotepaymentdata, java.lang.reflect.Array.get(obj, i));
        }
        getremotepaymentdata.valueOf();
    }
}
