package com.payair.hce;

/* loaded from: classes4.dex */
public final class setTooltipText extends com.payair.hce.getMagstripeCvmIssuerOptions implements com.payair.hce.CardAlternateContactlessPaymentDataJson {
    private com.payair.hce.getTrack2Equivalent AlternateContactlessPaymentDataJson;
    private com.payair.hce.getPan DigitizedCardProfile;
    private com.payair.hce.IccPrivateKeyCrtComponentsJson valueOf;

    public setTooltipText(com.payair.hce.IccPrivateKeyCrtComponentsJson iccPrivateKeyCrtComponentsJson, com.payair.hce.getPan getpan, com.payair.hce.getTrack2Equivalent gettrack2equivalent) {
        this.valueOf = iccPrivateKeyCrtComponentsJson;
        this.DigitizedCardProfile = getpan;
        this.AlternateContactlessPaymentDataJson = gettrack2equivalent;
    }

    @Override // com.payair.hce.getMagstripeCvmIssuerOptions
    public final void writeReplace(com.payair.hce.getRemotePaymentData getremotepaymentdata, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            getremotepaymentdata.writeReplace();
        } else {
            ((com.payair.hce.setOnCapturedPointerListener) obj).values(getremotepaymentdata, this.AlternateContactlessPaymentDataJson);
        }
    }

    @Override // com.payair.hce.getMagstripeCvmIssuerOptions
    public final java.lang.Object AlternateContactlessPaymentDataJson(com.payair.hce.getAckAutomaticallyResetByApplication getackautomaticallyresetbyapplication) throws java.io.IOException {
        if (getackautomaticallyresetbyapplication.getProfileVersion() == com.payair.hce.getAckPreEntryAllowed.NULL) {
            getackautomaticallyresetbyapplication.getCvrMaskAnd();
            return null;
        }
        com.payair.hce.setOnCapturedPointerListener setoncapturedpointerlistener = new com.payair.hce.setOnCapturedPointerListener();
        setoncapturedpointerlistener.values(getackautomaticallyresetbyapplication, this.DigitizedCardProfile);
        return setoncapturedpointerlistener;
    }
}
