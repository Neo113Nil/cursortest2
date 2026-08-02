package com.payair.hce;

/* loaded from: classes4.dex */
public final class performEnrollDas extends com.payair.hce.getMagstripeCvmIssuerOptions implements com.payair.hce.CardAlternateContactlessPaymentDataJson {
    private com.payair.hce.IccPrivateKeyCrtComponentsJson AlternateContactlessPaymentDataJson;
    private com.payair.hce.getPan DigitizedCardProfile;
    private com.payair.hce.getTrack2Equivalent writeReplace;

    public performEnrollDas(com.payair.hce.IccPrivateKeyCrtComponentsJson iccPrivateKeyCrtComponentsJson, com.payair.hce.getPan getpan, com.payair.hce.getTrack2Equivalent gettrack2equivalent) {
        this.AlternateContactlessPaymentDataJson = iccPrivateKeyCrtComponentsJson;
        this.DigitizedCardProfile = getpan;
        this.writeReplace = gettrack2equivalent;
    }

    @Override // com.payair.hce.getMagstripeCvmIssuerOptions
    public final void writeReplace(com.payair.hce.getRemotePaymentData getremotepaymentdata, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            getremotepaymentdata.writeReplace();
        } else {
            ((com.payair.hce.initializeVisaPaymentSdk) obj).DigitizedCardProfile(this.AlternateContactlessPaymentDataJson, getremotepaymentdata, this.writeReplace);
        }
    }

    @Override // com.payair.hce.getMagstripeCvmIssuerOptions
    public final java.lang.Object AlternateContactlessPaymentDataJson(com.payair.hce.getAckAutomaticallyResetByApplication getackautomaticallyresetbyapplication) throws java.io.IOException {
        if (getackautomaticallyresetbyapplication.getProfileVersion() == com.payair.hce.getAckPreEntryAllowed.NULL) {
            getackautomaticallyresetbyapplication.getCvrMaskAnd();
            return null;
        }
        com.payair.hce.initializeVisaPaymentSdk initializevisapaymentsdk = new com.payair.hce.initializeVisaPaymentSdk();
        initializevisapaymentsdk.AlternateContactlessPaymentDataJson(this.AlternateContactlessPaymentDataJson, getackautomaticallyresetbyapplication, this.DigitizedCardProfile);
        return initializevisapaymentsdk;
    }
}
