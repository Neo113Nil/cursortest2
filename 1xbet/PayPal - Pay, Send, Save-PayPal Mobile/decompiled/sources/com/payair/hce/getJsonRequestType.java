package com.payair.hce;

/* loaded from: classes4.dex */
public final class getJsonRequestType extends com.payair.hce.getMagstripeCvmIssuerOptions implements com.payair.hce.CardAlternateContactlessPaymentDataJson {
    private com.payair.hce.getTrack2Equivalent AlternateContactlessPaymentDataJson;
    private com.payair.hce.IccPrivateKeyCrtComponentsJson DigitizedCardProfile;
    private com.payair.hce.getPan values;

    public getJsonRequestType(com.payair.hce.IccPrivateKeyCrtComponentsJson iccPrivateKeyCrtComponentsJson, com.payair.hce.getPan getpan, com.payair.hce.getTrack2Equivalent gettrack2equivalent) {
        this.DigitizedCardProfile = iccPrivateKeyCrtComponentsJson;
        this.values = getpan;
        this.AlternateContactlessPaymentDataJson = gettrack2equivalent;
    }

    @Override // com.payair.hce.getMagstripeCvmIssuerOptions
    public final void writeReplace(com.payair.hce.getRemotePaymentData getremotepaymentdata, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            getremotepaymentdata.writeReplace();
            return;
        }
        com.mastercard.mpsdk.card.profile.v2.WalletRelatedDataV2Json walletRelatedDataV2Json = (com.mastercard.mpsdk.card.profile.v2.WalletRelatedDataV2Json) obj;
        com.payair.hce.getTrack2Equivalent gettrack2equivalent = this.AlternateContactlessPaymentDataJson;
        getremotepaymentdata.AlternateContactlessPaymentDataJson();
        if (walletRelatedDataV2Json != walletRelatedDataV2Json.cardholderValidator) {
            gettrack2equivalent.writeReplace(getremotepaymentdata, 47);
            getremotepaymentdata.DigitizedCardProfile(walletRelatedDataV2Json.cardholderValidator);
        }
        getremotepaymentdata.values();
    }

    @Override // com.payair.hce.getMagstripeCvmIssuerOptions
    public final java.lang.Object AlternateContactlessPaymentDataJson(com.payair.hce.getAckAutomaticallyResetByApplication getackautomaticallyresetbyapplication) throws java.io.IOException {
        if (getackautomaticallyresetbyapplication.getProfileVersion() == com.payair.hce.getAckPreEntryAllowed.NULL) {
            getackautomaticallyresetbyapplication.getCvrMaskAnd();
            return null;
        }
        com.mastercard.mpsdk.card.profile.v2.WalletRelatedDataV2Json walletRelatedDataV2Json = new com.mastercard.mpsdk.card.profile.v2.WalletRelatedDataV2Json();
        com.payair.hce.getPan getpan = this.values;
        getackautomaticallyresetbyapplication.writeReplace();
        while (getackautomaticallyresetbyapplication.values()) {
            int AlternateContactlessPaymentDataJson = getpan.AlternateContactlessPaymentDataJson(getackautomaticallyresetbyapplication);
            boolean z = getackautomaticallyresetbyapplication.getProfileVersion() != com.payair.hce.getAckPreEntryAllowed.NULL;
            if (AlternateContactlessPaymentDataJson != 63) {
                getackautomaticallyresetbyapplication.getCvrMaskAnd();
            } else if (z) {
                walletRelatedDataV2Json.cardholderValidator = getackautomaticallyresetbyapplication.getProfileVersion() != com.payair.hce.getAckPreEntryAllowed.BOOLEAN ? getackautomaticallyresetbyapplication.getAid() : java.lang.Boolean.toString(getackautomaticallyresetbyapplication.IccPrivateKeyCrtComponentsJson());
            } else {
                walletRelatedDataV2Json.cardholderValidator = null;
                getackautomaticallyresetbyapplication.RecordsJson();
            }
        }
        getackautomaticallyresetbyapplication.DigitizedCardProfile();
        return walletRelatedDataV2Json;
    }
}
