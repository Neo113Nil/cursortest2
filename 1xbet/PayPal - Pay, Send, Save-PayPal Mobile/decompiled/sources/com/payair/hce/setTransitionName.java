package com.payair.hce;

/* loaded from: classes4.dex */
public final class setTransitionName extends com.payair.hce.getMagstripeCvmIssuerOptions implements com.payair.hce.CardAlternateContactlessPaymentDataJson {
    private com.payair.hce.getTrack2Equivalent valueOf;
    private com.payair.hce.IccPrivateKeyCrtComponentsJson values;
    private com.payair.hce.getPan writeReplace;

    public setTransitionName(com.payair.hce.IccPrivateKeyCrtComponentsJson iccPrivateKeyCrtComponentsJson, com.payair.hce.getPan getpan, com.payair.hce.getTrack2Equivalent gettrack2equivalent) {
        this.values = iccPrivateKeyCrtComponentsJson;
        this.writeReplace = getpan;
        this.valueOf = gettrack2equivalent;
    }

    @Override // com.payair.hce.getMagstripeCvmIssuerOptions
    public final void writeReplace(com.payair.hce.getRemotePaymentData getremotepaymentdata, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            getremotepaymentdata.writeReplace();
        } else {
            ((com.payair.hce.setScrollCaptureHint) obj).AlternateContactlessPaymentDataJson(this.values, getremotepaymentdata, this.valueOf);
        }
    }

    @Override // com.payair.hce.getMagstripeCvmIssuerOptions
    public final java.lang.Object AlternateContactlessPaymentDataJson(com.payair.hce.getAckAutomaticallyResetByApplication getackautomaticallyresetbyapplication) throws java.io.IOException {
        if (getackautomaticallyresetbyapplication.getProfileVersion() == com.payair.hce.getAckPreEntryAllowed.NULL) {
            getackautomaticallyresetbyapplication.getCvrMaskAnd();
            return null;
        }
        com.payair.hce.setScrollCaptureHint setscrollcapturehint = new com.payair.hce.setScrollCaptureHint();
        setscrollcapturehint.DigitizedCardProfile(this.values, getackautomaticallyresetbyapplication, this.writeReplace);
        return setscrollcapturehint;
    }
}
