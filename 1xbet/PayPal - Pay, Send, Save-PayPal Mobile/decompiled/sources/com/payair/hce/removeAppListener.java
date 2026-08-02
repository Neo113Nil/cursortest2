package com.payair.hce;

/* loaded from: classes4.dex */
public final class removeAppListener extends com.payair.hce.getMagstripeCvmIssuerOptions implements com.payair.hce.CardAlternateContactlessPaymentDataJson {
    private com.payair.hce.IccPrivateKeyCrtComponentsJson DigitizedCardProfile;
    private com.payair.hce.getPan valueOf;
    private com.payair.hce.getTrack2Equivalent values;

    public removeAppListener(com.payair.hce.IccPrivateKeyCrtComponentsJson iccPrivateKeyCrtComponentsJson, com.payair.hce.getPan getpan, com.payair.hce.getTrack2Equivalent gettrack2equivalent) {
        this.DigitizedCardProfile = iccPrivateKeyCrtComponentsJson;
        this.valueOf = getpan;
        this.values = gettrack2equivalent;
    }

    @Override // com.payair.hce.getMagstripeCvmIssuerOptions
    public final void writeReplace(com.payair.hce.getRemotePaymentData getremotepaymentdata, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            getremotepaymentdata.writeReplace();
            return;
        }
        com.mastercard.mpsdk.card.profile.v2.MchipCardProfileV2Json mchipCardProfileV2Json = (com.mastercard.mpsdk.card.profile.v2.MchipCardProfileV2Json) obj;
        com.payair.hce.IccPrivateKeyCrtComponentsJson iccPrivateKeyCrtComponentsJson = this.DigitizedCardProfile;
        com.payair.hce.getTrack2Equivalent gettrack2equivalent = this.values;
        getremotepaymentdata.AlternateContactlessPaymentDataJson();
        if (mchipCardProfileV2Json != mchipCardProfileV2Json.commonData) {
            gettrack2equivalent.writeReplace(getremotepaymentdata, 67);
            com.mastercard.mpsdk.card.profile.v2.CommonDataV2Json commonDataV2Json = mchipCardProfileV2Json.commonData;
            com.payair.hce.getApplicationExpiryDate.values(iccPrivateKeyCrtComponentsJson, com.mastercard.mpsdk.card.profile.v2.CommonDataV2Json.class, commonDataV2Json).writeReplace(getremotepaymentdata, commonDataV2Json);
        }
        if (mchipCardProfileV2Json != mchipCardProfileV2Json.contactlessPaymentData) {
            gettrack2equivalent.writeReplace(getremotepaymentdata, 31);
            com.mastercard.mpsdk.card.profile.v2.ContactlessPaymentDataV2Json contactlessPaymentDataV2Json = mchipCardProfileV2Json.contactlessPaymentData;
            com.payair.hce.getApplicationExpiryDate.values(iccPrivateKeyCrtComponentsJson, com.mastercard.mpsdk.card.profile.v2.ContactlessPaymentDataV2Json.class, contactlessPaymentDataV2Json).writeReplace(getremotepaymentdata, contactlessPaymentDataV2Json);
        }
        if (mchipCardProfileV2Json != mchipCardProfileV2Json.dsrpData) {
            gettrack2equivalent.writeReplace(getremotepaymentdata, 43);
            com.mastercard.mpsdk.card.profile.v2.DsrpDataV2Json dsrpDataV2Json = mchipCardProfileV2Json.dsrpData;
            com.payair.hce.getApplicationExpiryDate.values(iccPrivateKeyCrtComponentsJson, com.mastercard.mpsdk.card.profile.v2.DsrpDataV2Json.class, dsrpDataV2Json).writeReplace(getremotepaymentdata, dsrpDataV2Json);
        }
        getremotepaymentdata.values();
    }

    @Override // com.payair.hce.getMagstripeCvmIssuerOptions
    public final java.lang.Object AlternateContactlessPaymentDataJson(com.payair.hce.getAckAutomaticallyResetByApplication getackautomaticallyresetbyapplication) throws java.io.IOException {
        if (getackautomaticallyresetbyapplication.getProfileVersion() == com.payair.hce.getAckPreEntryAllowed.NULL) {
            getackautomaticallyresetbyapplication.getCvrMaskAnd();
            return null;
        }
        com.mastercard.mpsdk.card.profile.v2.MchipCardProfileV2Json mchipCardProfileV2Json = new com.mastercard.mpsdk.card.profile.v2.MchipCardProfileV2Json();
        com.payair.hce.IccPrivateKeyCrtComponentsJson iccPrivateKeyCrtComponentsJson = this.DigitizedCardProfile;
        com.payair.hce.getPan getpan = this.valueOf;
        getackautomaticallyresetbyapplication.writeReplace();
        while (getackautomaticallyresetbyapplication.values()) {
            int AlternateContactlessPaymentDataJson = getpan.AlternateContactlessPaymentDataJson(getackautomaticallyresetbyapplication);
            boolean z = getackautomaticallyresetbyapplication.getProfileVersion() != com.payair.hce.getAckPreEntryAllowed.NULL;
            if (AlternateContactlessPaymentDataJson != 25) {
                if (AlternateContactlessPaymentDataJson != 45) {
                    if (AlternateContactlessPaymentDataJson != 89) {
                        getackautomaticallyresetbyapplication.getCvrMaskAnd();
                    } else if (z) {
                        mchipCardProfileV2Json.contactlessPaymentData = (com.mastercard.mpsdk.card.profile.v2.ContactlessPaymentDataV2Json) iccPrivateKeyCrtComponentsJson.valueOf(new com.payair.hce.getPinAlwaysRequiredIfCurrencyProvided(com.mastercard.mpsdk.card.profile.v2.ContactlessPaymentDataV2Json.class)).AlternateContactlessPaymentDataJson(getackautomaticallyresetbyapplication);
                    } else {
                        mchipCardProfileV2Json.contactlessPaymentData = null;
                        getackautomaticallyresetbyapplication.RecordsJson();
                    }
                } else if (z) {
                    mchipCardProfileV2Json.commonData = (com.mastercard.mpsdk.card.profile.v2.CommonDataV2Json) iccPrivateKeyCrtComponentsJson.valueOf(new com.payair.hce.getPinAlwaysRequiredIfCurrencyProvided(com.mastercard.mpsdk.card.profile.v2.CommonDataV2Json.class)).AlternateContactlessPaymentDataJson(getackautomaticallyresetbyapplication);
                } else {
                    mchipCardProfileV2Json.commonData = null;
                    getackautomaticallyresetbyapplication.RecordsJson();
                }
            } else if (z) {
                mchipCardProfileV2Json.dsrpData = (com.mastercard.mpsdk.card.profile.v2.DsrpDataV2Json) iccPrivateKeyCrtComponentsJson.valueOf(new com.payair.hce.getPinAlwaysRequiredIfCurrencyProvided(com.mastercard.mpsdk.card.profile.v2.DsrpDataV2Json.class)).AlternateContactlessPaymentDataJson(getackautomaticallyresetbyapplication);
            } else {
                mchipCardProfileV2Json.dsrpData = null;
                getackautomaticallyresetbyapplication.RecordsJson();
            }
        }
        getackautomaticallyresetbyapplication.DigitizedCardProfile();
        return mchipCardProfileV2Json;
    }
}
