package com.payair.hce;

/* loaded from: classes4.dex */
public final class wipe implements com.payair.hce.getCardholderValidators {
    private final com.payair.hce.buildRecords AlternateContactlessPaymentDataJson;

    public wipe(com.payair.hce.buildRecords buildrecords) {
        this.AlternateContactlessPaymentDataJson = buildrecords;
    }

    static final class writeReplace<E> extends com.payair.hce.getMagstripeCvmIssuerOptions<java.util.Collection<E>> {
        private final com.payair.hce.getMagstripeCvmIssuerOptions<E> DigitizedCardProfile;
        private final com.payair.hce.getMaximumPinTry<? extends java.util.Collection<E>> valueOf;

        @Override // com.payair.hce.getMagstripeCvmIssuerOptions
        public final /* synthetic */ void writeReplace(com.payair.hce.getRemotePaymentData getremotepaymentdata, java.lang.Object obj) throws java.io.IOException {
            java.util.Collection collection = (java.util.Collection) obj;
            if (collection == null) {
                getremotepaymentdata.writeReplace();
                return;
            }
            getremotepaymentdata.DigitizedCardProfile();
            java.util.Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                this.DigitizedCardProfile.writeReplace(getremotepaymentdata, it.next());
            }
            getremotepaymentdata.valueOf();
        }

        public writeReplace(com.payair.hce.IccPrivateKeyCrtComponentsJson iccPrivateKeyCrtComponentsJson, java.lang.reflect.Type type, com.payair.hce.getMagstripeCvmIssuerOptions<E> getmagstripecvmissueroptions, com.payair.hce.getMaximumPinTry<? extends java.util.Collection<E>> getmaximumpintry) {
            this.DigitizedCardProfile = new com.payair.hce.getU(iccPrivateKeyCrtComponentsJson, getmagstripecvmissueroptions, type);
            this.valueOf = getmaximumpintry;
        }

        @Override // com.payair.hce.getMagstripeCvmIssuerOptions
        public final /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(com.payair.hce.getAckAutomaticallyResetByApplication getackautomaticallyresetbyapplication) throws java.io.IOException {
            if (getackautomaticallyresetbyapplication.getProfileVersion() == com.payair.hce.getAckPreEntryAllowed.NULL) {
                getackautomaticallyresetbyapplication.RecordsJson();
                return null;
            }
            java.util.Collection<E> DigitizedCardProfile = this.valueOf.DigitizedCardProfile();
            getackautomaticallyresetbyapplication.AlternateContactlessPaymentDataJson();
            while (getackautomaticallyresetbyapplication.values()) {
                DigitizedCardProfile.add(this.DigitizedCardProfile.AlternateContactlessPaymentDataJson(getackautomaticallyresetbyapplication));
            }
            getackautomaticallyresetbyapplication.valueOf();
            return DigitizedCardProfile;
        }
    }

    @Override // com.payair.hce.getCardholderValidators
    public final <T> com.payair.hce.getMagstripeCvmIssuerOptions<T> DigitizedCardProfile(com.payair.hce.IccPrivateKeyCrtComponentsJson iccPrivateKeyCrtComponentsJson, com.payair.hce.getPinAlwaysRequiredIfCurrencyProvided<T> getpinalwaysrequiredifcurrencyprovided) {
        java.lang.reflect.Type type = getpinalwaysrequiredifcurrencyprovided.AlternateContactlessPaymentDataJson;
        java.lang.Class<? super T> cls = getpinalwaysrequiredifcurrencyprovided.values;
        if (!java.util.Collection.class.isAssignableFrom(cls)) {
            return null;
        }
        java.lang.reflect.Type writeReplace2 = com.payair.hce.getCdol1RelatedDataLength.writeReplace(type, cls);
        return new com.payair.hce.wipe.writeReplace(iccPrivateKeyCrtComponentsJson, writeReplace2, iccPrivateKeyCrtComponentsJson.valueOf(new com.payair.hce.getPinAlwaysRequiredIfCurrencyProvided<>(writeReplace2)), this.AlternateContactlessPaymentDataJson.values(getpinalwaysrequiredifcurrencyprovided));
    }
}
