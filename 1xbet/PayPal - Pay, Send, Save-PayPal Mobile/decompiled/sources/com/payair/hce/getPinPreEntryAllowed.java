package com.payair.hce;

/* loaded from: classes4.dex */
public final class getPinPreEntryAllowed<T> extends com.payair.hce.getMagstripeCvmIssuerOptions<T> {
    private final com.payair.hce.getPinAlwaysRequiredIfCurrencyProvided<T> AlternateContactlessPaymentDataJson;
    private final com.payair.hce.getApplicationLifeCycleData<T> DigitizedCardProfile;
    private com.payair.hce.getMagstripeCvmIssuerOptions<T> SdkCoreAlternateContactlessPaymentDataImpl;
    private final com.payair.hce.getCvrMaskAnd<T> valueOf;
    private com.payair.hce.IccPrivateKeyCrtComponentsJson values;
    private final com.payair.hce.getPinPreEntryAllowed<T>.valueOf getAid = new com.payair.hce.getPinPreEntryAllowed.valueOf(this, 0);
    private final com.payair.hce.getCardholderValidators writeReplace = null;

    public getPinPreEntryAllowed(com.payair.hce.getApplicationLifeCycleData<T> getapplicationlifecycledata, com.payair.hce.getCvrMaskAnd<T> getcvrmaskand, com.payair.hce.IccPrivateKeyCrtComponentsJson iccPrivateKeyCrtComponentsJson, com.payair.hce.getPinAlwaysRequiredIfCurrencyProvided<T> getpinalwaysrequiredifcurrencyprovided) {
        this.DigitizedCardProfile = getapplicationlifecycledata;
        this.valueOf = getcvrmaskand;
        this.values = iccPrivateKeyCrtComponentsJson;
        this.AlternateContactlessPaymentDataJson = getpinalwaysrequiredifcurrencyprovided;
    }

    @Override // com.payair.hce.getMagstripeCvmIssuerOptions
    public final T AlternateContactlessPaymentDataJson(com.payair.hce.getAckAutomaticallyResetByApplication getackautomaticallyresetbyapplication) throws java.io.IOException {
        if (this.valueOf == null) {
            com.payair.hce.getMagstripeCvmIssuerOptions<T> getmagstripecvmissueroptions = this.SdkCoreAlternateContactlessPaymentDataImpl;
            if (getmagstripecvmissueroptions == null) {
                getmagstripecvmissueroptions = this.values.DigitizedCardProfile(this.writeReplace, this.AlternateContactlessPaymentDataJson);
                this.SdkCoreAlternateContactlessPaymentDataImpl = getmagstripecvmissueroptions;
            }
            return getmagstripecvmissueroptions.AlternateContactlessPaymentDataJson(getackautomaticallyresetbyapplication);
        }
        if (com.payair.hce.getRecords.AlternateContactlessPaymentDataJson(getackautomaticallyresetbyapplication) instanceof com.payair.hce.SdkCoreBusinessLogicModuleImpl) {
            return null;
        }
        com.payair.hce.getCvrMaskAnd<T> getcvrmaskand = this.valueOf;
        java.lang.reflect.Type type = this.AlternateContactlessPaymentDataJson.AlternateContactlessPaymentDataJson;
        return getcvrmaskand.writeReplace();
    }

    @Override // com.payair.hce.getMagstripeCvmIssuerOptions
    public final void writeReplace(com.payair.hce.getRemotePaymentData getremotepaymentdata, T t) throws java.io.IOException {
        com.payair.hce.getApplicationLifeCycleData<T> getapplicationlifecycledata = this.DigitizedCardProfile;
        if (getapplicationlifecycledata == null) {
            com.payair.hce.getMagstripeCvmIssuerOptions<T> getmagstripecvmissueroptions = this.SdkCoreAlternateContactlessPaymentDataImpl;
            if (getmagstripecvmissueroptions == null) {
                getmagstripecvmissueroptions = this.values.DigitizedCardProfile(this.writeReplace, this.AlternateContactlessPaymentDataJson);
                this.SdkCoreAlternateContactlessPaymentDataImpl = getmagstripecvmissueroptions;
            }
            getmagstripecvmissueroptions.writeReplace(getremotepaymentdata, t);
            return;
        }
        if (t == null) {
            getremotepaymentdata.writeReplace();
            return;
        }
        java.lang.reflect.Type type = this.AlternateContactlessPaymentDataJson.AlternateContactlessPaymentDataJson;
        com.payair.hce.SdkCoreMChipCvmIssuerOptionsImpl.buildRecords.writeReplace(getremotepaymentdata, getapplicationlifecycledata.values());
    }

    final class valueOf {
        private valueOf() {
        }

        /* synthetic */ valueOf(com.payair.hce.getPinPreEntryAllowed getpinpreentryallowed, byte b) {
            this();
        }
    }
}
