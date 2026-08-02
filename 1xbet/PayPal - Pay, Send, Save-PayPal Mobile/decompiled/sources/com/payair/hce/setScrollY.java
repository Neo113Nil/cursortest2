package com.payair.hce;

/* loaded from: classes4.dex */
public final class setScrollY extends com.payair.hce.getMagstripeCvmIssuerOptions implements com.payair.hce.CardAlternateContactlessPaymentDataJson {
    private com.payair.hce.getPan AlternateContactlessPaymentDataJson;
    private com.payair.hce.getTrack2Equivalent DigitizedCardProfile;
    private com.payair.hce.IccPrivateKeyCrtComponentsJson writeReplace;

    public setScrollY(com.payair.hce.IccPrivateKeyCrtComponentsJson iccPrivateKeyCrtComponentsJson, com.payair.hce.getPan getpan, com.payair.hce.getTrack2Equivalent gettrack2equivalent) {
        this.writeReplace = iccPrivateKeyCrtComponentsJson;
        this.AlternateContactlessPaymentDataJson = getpan;
        this.DigitizedCardProfile = gettrack2equivalent;
    }

    @Override // com.payair.hce.getMagstripeCvmIssuerOptions
    public final void writeReplace(com.payair.hce.getRemotePaymentData getremotepaymentdata, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            getremotepaymentdata.writeReplace();
        } else {
            ((com.payair.hce.setFilterTouchesWhenObscured) obj).AlternateContactlessPaymentDataJson(this.writeReplace, getremotepaymentdata, this.DigitizedCardProfile);
        }
    }

    @Override // com.payair.hce.getMagstripeCvmIssuerOptions
    public final java.lang.Object AlternateContactlessPaymentDataJson(com.payair.hce.getAckAutomaticallyResetByApplication getackautomaticallyresetbyapplication) throws java.io.IOException {
        if (getackautomaticallyresetbyapplication.getProfileVersion() == com.payair.hce.getAckPreEntryAllowed.NULL) {
            getackautomaticallyresetbyapplication.getCvrMaskAnd();
            return null;
        }
        com.payair.hce.setFilterTouchesWhenObscured setfiltertoucheswhenobscured = new com.payair.hce.setFilterTouchesWhenObscured();
        setfiltertoucheswhenobscured.AlternateContactlessPaymentDataJson(this.writeReplace, getackautomaticallyresetbyapplication, this.AlternateContactlessPaymentDataJson);
        return setfiltertoucheswhenobscured;
    }
}
