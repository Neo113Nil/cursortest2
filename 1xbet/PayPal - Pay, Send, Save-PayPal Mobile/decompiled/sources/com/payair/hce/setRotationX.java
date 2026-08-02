package com.payair.hce;

/* loaded from: classes4.dex */
public final class setRotationX extends com.payair.hce.getMagstripeCvmIssuerOptions implements com.payair.hce.CardAlternateContactlessPaymentDataJson {
    private com.payair.hce.getPan DigitizedCardProfile;
    private com.payair.hce.IccPrivateKeyCrtComponentsJson valueOf;
    private com.payair.hce.getTrack2Equivalent writeReplace;

    public setRotationX(com.payair.hce.IccPrivateKeyCrtComponentsJson iccPrivateKeyCrtComponentsJson, com.payair.hce.getPan getpan, com.payair.hce.getTrack2Equivalent gettrack2equivalent) {
        this.valueOf = iccPrivateKeyCrtComponentsJson;
        this.DigitizedCardProfile = getpan;
        this.writeReplace = gettrack2equivalent;
    }

    @Override // com.payair.hce.getMagstripeCvmIssuerOptions
    public final void writeReplace(com.payair.hce.getRemotePaymentData getremotepaymentdata, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            getremotepaymentdata.writeReplace();
        } else {
            this.writeReplace.DigitizedCardProfile(getremotepaymentdata, obj == com.payair.hce.AuthenticationEnum.JWT ? 18 : obj == com.payair.hce.AuthenticationEnum.REDIRECT ? 48 : obj == com.payair.hce.AuthenticationEnum.BANKID ? 14 : -1);
        }
    }

    @Override // com.payair.hce.getMagstripeCvmIssuerOptions
    public final java.lang.Object AlternateContactlessPaymentDataJson(com.payair.hce.getAckAutomaticallyResetByApplication getackautomaticallyresetbyapplication) throws java.io.IOException {
        int values = this.DigitizedCardProfile.values(getackautomaticallyresetbyapplication);
        if (values == 31) {
            return com.payair.hce.AuthenticationEnum.JWT;
        }
        if (values == 42) {
            return com.payair.hce.AuthenticationEnum.BANKID;
        }
        if (values != 56) {
            return null;
        }
        return com.payair.hce.AuthenticationEnum.REDIRECT;
    }
}
