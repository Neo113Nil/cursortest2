package com.payair.hce;

/* loaded from: classes4.dex */
public final class setRotation extends com.payair.hce.getMagstripeCvmIssuerOptions implements com.payair.hce.CardAlternateContactlessPaymentDataJson {
    private com.payair.hce.getTrack2Equivalent DigitizedCardProfile;
    private com.payair.hce.IccPrivateKeyCrtComponentsJson valueOf;
    private com.payair.hce.getPan writeReplace;

    public setRotation(com.payair.hce.IccPrivateKeyCrtComponentsJson iccPrivateKeyCrtComponentsJson, com.payair.hce.getPan getpan, com.payair.hce.getTrack2Equivalent gettrack2equivalent) {
        this.valueOf = iccPrivateKeyCrtComponentsJson;
        this.writeReplace = getpan;
        this.DigitizedCardProfile = gettrack2equivalent;
    }

    @Override // com.payair.hce.getMagstripeCvmIssuerOptions
    public final void writeReplace(com.payair.hce.getRemotePaymentData getremotepaymentdata, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            getremotepaymentdata.writeReplace();
        } else {
            ((com.payair.hce.CardProfileMdesCmsCV2) obj).valueOf(this.valueOf, getremotepaymentdata, this.DigitizedCardProfile);
        }
    }

    @Override // com.payair.hce.getMagstripeCvmIssuerOptions
    public final java.lang.Object AlternateContactlessPaymentDataJson(com.payair.hce.getAckAutomaticallyResetByApplication getackautomaticallyresetbyapplication) throws java.io.IOException {
        if (getackautomaticallyresetbyapplication.getProfileVersion() == com.payair.hce.getAckPreEntryAllowed.NULL) {
            getackautomaticallyresetbyapplication.getCvrMaskAnd();
            return null;
        }
        com.payair.hce.CardProfileMdesCmsCV2 cardProfileMdesCmsCV2 = new com.payair.hce.CardProfileMdesCmsCV2();
        cardProfileMdesCmsCV2.writeReplace(this.valueOf, getackautomaticallyresetbyapplication, this.writeReplace);
        return cardProfileMdesCmsCV2;
    }
}
