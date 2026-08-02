package com.payair.hce;

/* loaded from: classes4.dex */
public final class addAppListener extends com.payair.hce.getMagstripeCvmIssuerOptions implements com.payair.hce.CardAlternateContactlessPaymentDataJson {
    private com.payair.hce.getPan AlternateContactlessPaymentDataJson;
    private com.payair.hce.IccPrivateKeyCrtComponentsJson valueOf;
    private com.payair.hce.getTrack2Equivalent values;

    public addAppListener(com.payair.hce.IccPrivateKeyCrtComponentsJson iccPrivateKeyCrtComponentsJson, com.payair.hce.getPan getpan, com.payair.hce.getTrack2Equivalent gettrack2equivalent) {
        this.valueOf = iccPrivateKeyCrtComponentsJson;
        this.AlternateContactlessPaymentDataJson = getpan;
        this.values = gettrack2equivalent;
    }

    @Override // com.payair.hce.getMagstripeCvmIssuerOptions
    public final void writeReplace(com.payair.hce.getRemotePaymentData getremotepaymentdata, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            getremotepaymentdata.writeReplace();
        } else {
            ((com.mastercard.mpsdk.card.profile.v2.DigitizedCardProfileV2Json) obj).valueOf(this.valueOf, getremotepaymentdata, this.values);
        }
    }

    @Override // com.payair.hce.getMagstripeCvmIssuerOptions
    public final java.lang.Object AlternateContactlessPaymentDataJson(com.payair.hce.getAckAutomaticallyResetByApplication getackautomaticallyresetbyapplication) throws java.io.IOException {
        if (getackautomaticallyresetbyapplication.getProfileVersion() == com.payair.hce.getAckPreEntryAllowed.NULL) {
            getackautomaticallyresetbyapplication.getCvrMaskAnd();
            return null;
        }
        com.mastercard.mpsdk.card.profile.v2.DigitizedCardProfileV2Json digitizedCardProfileV2Json = new com.mastercard.mpsdk.card.profile.v2.DigitizedCardProfileV2Json();
        digitizedCardProfileV2Json.AlternateContactlessPaymentDataJson(this.valueOf, getackautomaticallyresetbyapplication, this.AlternateContactlessPaymentDataJson);
        return digitizedCardProfileV2Json;
    }
}
