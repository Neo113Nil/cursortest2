package com.payair.hce;

/* loaded from: classes4.dex */
public final class setMapTrackballToArrowKeys extends com.payair.hce.getMagstripeCvmIssuerOptions implements com.payair.hce.CardAlternateContactlessPaymentDataJson {
    private com.payair.hce.getPan DigitizedCardProfile;
    private com.payair.hce.getTrack2Equivalent values;
    private com.payair.hce.IccPrivateKeyCrtComponentsJson writeReplace;

    public setMapTrackballToArrowKeys(com.payair.hce.IccPrivateKeyCrtComponentsJson iccPrivateKeyCrtComponentsJson, com.payair.hce.getPan getpan, com.payair.hce.getTrack2Equivalent gettrack2equivalent) {
        this.writeReplace = iccPrivateKeyCrtComponentsJson;
        this.DigitizedCardProfile = getpan;
        this.values = gettrack2equivalent;
    }

    @Override // com.payair.hce.getMagstripeCvmIssuerOptions
    public final void writeReplace(com.payair.hce.getRemotePaymentData getremotepaymentdata, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            getremotepaymentdata.writeReplace();
        } else {
            ((com.payair.hce.setWebViewRenderProcessClient) obj).valueOf(getremotepaymentdata, this.values);
        }
    }

    @Override // com.payair.hce.getMagstripeCvmIssuerOptions
    public final java.lang.Object AlternateContactlessPaymentDataJson(com.payair.hce.getAckAutomaticallyResetByApplication getackautomaticallyresetbyapplication) throws java.io.IOException {
        if (getackautomaticallyresetbyapplication.getProfileVersion() == com.payair.hce.getAckPreEntryAllowed.NULL) {
            getackautomaticallyresetbyapplication.getCvrMaskAnd();
            return null;
        }
        com.payair.hce.setWebViewRenderProcessClient setwebviewrenderprocessclient = new com.payair.hce.setWebViewRenderProcessClient();
        setwebviewrenderprocessclient.writeReplace(getackautomaticallyresetbyapplication, this.DigitizedCardProfile);
        return setwebviewrenderprocessclient;
    }
}
