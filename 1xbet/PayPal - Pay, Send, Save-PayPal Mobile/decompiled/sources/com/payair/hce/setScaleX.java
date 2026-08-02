package com.payair.hce;

/* loaded from: classes4.dex */
public final class setScaleX extends com.payair.hce.getMagstripeCvmIssuerOptions implements com.payair.hce.CardAlternateContactlessPaymentDataJson {
    private com.payair.hce.getTrack2Equivalent AlternateContactlessPaymentDataJson;
    private com.payair.hce.getPan values;
    private com.payair.hce.IccPrivateKeyCrtComponentsJson writeReplace;

    public setScaleX(com.payair.hce.IccPrivateKeyCrtComponentsJson iccPrivateKeyCrtComponentsJson, com.payair.hce.getPan getpan, com.payair.hce.getTrack2Equivalent gettrack2equivalent) {
        this.writeReplace = iccPrivateKeyCrtComponentsJson;
        this.values = getpan;
        this.AlternateContactlessPaymentDataJson = gettrack2equivalent;
    }

    @Override // com.payair.hce.getMagstripeCvmIssuerOptions
    public final void writeReplace(com.payair.hce.getRemotePaymentData getremotepaymentdata, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            getremotepaymentdata.writeReplace();
        } else {
            ((com.payair.hce.setElevation) obj).writeReplace(getremotepaymentdata, this.AlternateContactlessPaymentDataJson);
        }
    }

    @Override // com.payair.hce.getMagstripeCvmIssuerOptions
    public final java.lang.Object AlternateContactlessPaymentDataJson(com.payair.hce.getAckAutomaticallyResetByApplication getackautomaticallyresetbyapplication) throws java.io.IOException {
        if (getackautomaticallyresetbyapplication.getProfileVersion() == com.payair.hce.getAckPreEntryAllowed.NULL) {
            getackautomaticallyresetbyapplication.getCvrMaskAnd();
            return null;
        }
        com.payair.hce.setElevation setelevation = new com.payair.hce.setElevation();
        setelevation.values(getackautomaticallyresetbyapplication, this.values);
        return setelevation;
    }
}
