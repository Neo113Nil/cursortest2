package com.payair.hce;

/* loaded from: classes4.dex */
public final class processCommandApdu extends com.payair.hce.getMagstripeCvmIssuerOptions implements com.payair.hce.CardAlternateContactlessPaymentDataJson {
    private com.payair.hce.getTrack2Equivalent DigitizedCardProfile;
    private com.payair.hce.getPan values;
    private com.payair.hce.IccPrivateKeyCrtComponentsJson writeReplace;

    public processCommandApdu(com.payair.hce.IccPrivateKeyCrtComponentsJson iccPrivateKeyCrtComponentsJson, com.payair.hce.getPan getpan, com.payair.hce.getTrack2Equivalent gettrack2equivalent) {
        this.writeReplace = iccPrivateKeyCrtComponentsJson;
        this.values = getpan;
        this.DigitizedCardProfile = gettrack2equivalent;
    }

    @Override // com.payair.hce.getMagstripeCvmIssuerOptions
    public final void writeReplace(com.payair.hce.getRemotePaymentData getremotepaymentdata, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            getremotepaymentdata.writeReplace();
            return;
        }
        com.mastercard.mpsdk.card.profile.v2.CommonDataV2Json commonDataV2Json = (com.mastercard.mpsdk.card.profile.v2.CommonDataV2Json) obj;
        com.payair.hce.getTrack2Equivalent gettrack2equivalent = this.DigitizedCardProfile;
        getremotepaymentdata.AlternateContactlessPaymentDataJson();
        if (commonDataV2Json != commonDataV2Json.digitizedCardId) {
            gettrack2equivalent.writeReplace(getremotepaymentdata, 46);
            getremotepaymentdata.DigitizedCardProfile(commonDataV2Json.digitizedCardId);
        }
        if (commonDataV2Json != commonDataV2Json.cardCountryCode) {
            gettrack2equivalent.writeReplace(getremotepaymentdata, 91);
            getremotepaymentdata.DigitizedCardProfile(commonDataV2Json.cardCountryCode);
        }
        if (commonDataV2Json != commonDataV2Json.pan) {
            gettrack2equivalent.writeReplace(getremotepaymentdata, 83);
            getremotepaymentdata.DigitizedCardProfile(commonDataV2Json.pan);
        }
        if (commonDataV2Json != commonDataV2Json.productType) {
            gettrack2equivalent.writeReplace(getremotepaymentdata, 5);
            getremotepaymentdata.DigitizedCardProfile(commonDataV2Json.productType);
        }
        if (commonDataV2Json != commonDataV2Json.accountType) {
            gettrack2equivalent.writeReplace(getremotepaymentdata, 84);
            getremotepaymentdata.DigitizedCardProfile(commonDataV2Json.accountType);
        }
        gettrack2equivalent.writeReplace(getremotepaymentdata, 28);
        getremotepaymentdata.valueOf(commonDataV2Json.isTransactionIdRequired);
        getremotepaymentdata.values();
    }

    @Override // com.payair.hce.getMagstripeCvmIssuerOptions
    public final java.lang.Object AlternateContactlessPaymentDataJson(com.payair.hce.getAckAutomaticallyResetByApplication getackautomaticallyresetbyapplication) throws java.io.IOException {
        if (getackautomaticallyresetbyapplication.getProfileVersion() == com.payair.hce.getAckPreEntryAllowed.NULL) {
            getackautomaticallyresetbyapplication.getCvrMaskAnd();
            return null;
        }
        com.mastercard.mpsdk.card.profile.v2.CommonDataV2Json commonDataV2Json = new com.mastercard.mpsdk.card.profile.v2.CommonDataV2Json();
        com.payair.hce.IccPrivateKeyCrtComponentsJson iccPrivateKeyCrtComponentsJson = this.writeReplace;
        com.payair.hce.getPan getpan = this.values;
        getackautomaticallyresetbyapplication.writeReplace();
        while (getackautomaticallyresetbyapplication.values()) {
            int AlternateContactlessPaymentDataJson = getpan.AlternateContactlessPaymentDataJson(getackautomaticallyresetbyapplication);
            boolean z = getackautomaticallyresetbyapplication.getProfileVersion() != com.payair.hce.getAckPreEntryAllowed.NULL;
            if (AlternateContactlessPaymentDataJson != 14) {
                if (AlternateContactlessPaymentDataJson != 69) {
                    if (AlternateContactlessPaymentDataJson != 80) {
                        if (AlternateContactlessPaymentDataJson != 92) {
                            if (AlternateContactlessPaymentDataJson != 38) {
                                if (AlternateContactlessPaymentDataJson != 39) {
                                    getackautomaticallyresetbyapplication.getCvrMaskAnd();
                                } else if (z) {
                                    commonDataV2Json.productType = getackautomaticallyresetbyapplication.getProfileVersion() != com.payair.hce.getAckPreEntryAllowed.BOOLEAN ? getackautomaticallyresetbyapplication.getAid() : java.lang.Boolean.toString(getackautomaticallyresetbyapplication.IccPrivateKeyCrtComponentsJson());
                                } else {
                                    commonDataV2Json.productType = null;
                                    getackautomaticallyresetbyapplication.RecordsJson();
                                }
                            } else if (z) {
                                commonDataV2Json.accountType = getackautomaticallyresetbyapplication.getProfileVersion() != com.payair.hce.getAckPreEntryAllowed.BOOLEAN ? getackautomaticallyresetbyapplication.getAid() : java.lang.Boolean.toString(getackautomaticallyresetbyapplication.IccPrivateKeyCrtComponentsJson());
                            } else {
                                commonDataV2Json.accountType = null;
                                getackautomaticallyresetbyapplication.RecordsJson();
                            }
                        } else if (z) {
                            commonDataV2Json.cardCountryCode = getackautomaticallyresetbyapplication.getProfileVersion() != com.payair.hce.getAckPreEntryAllowed.BOOLEAN ? getackautomaticallyresetbyapplication.getAid() : java.lang.Boolean.toString(getackautomaticallyresetbyapplication.IccPrivateKeyCrtComponentsJson());
                        } else {
                            commonDataV2Json.cardCountryCode = null;
                            getackautomaticallyresetbyapplication.RecordsJson();
                        }
                    } else if (z) {
                        commonDataV2Json.isTransactionIdRequired = ((java.lang.Boolean) iccPrivateKeyCrtComponentsJson.valueOf(new com.payair.hce.getPinAlwaysRequiredIfCurrencyProvided(java.lang.Boolean.class)).AlternateContactlessPaymentDataJson(getackautomaticallyresetbyapplication)).booleanValue();
                    } else {
                        getackautomaticallyresetbyapplication.RecordsJson();
                    }
                } else if (z) {
                    commonDataV2Json.digitizedCardId = getackautomaticallyresetbyapplication.getProfileVersion() != com.payair.hce.getAckPreEntryAllowed.BOOLEAN ? getackautomaticallyresetbyapplication.getAid() : java.lang.Boolean.toString(getackautomaticallyresetbyapplication.IccPrivateKeyCrtComponentsJson());
                } else {
                    commonDataV2Json.digitizedCardId = null;
                    getackautomaticallyresetbyapplication.RecordsJson();
                }
            } else if (z) {
                commonDataV2Json.pan = getackautomaticallyresetbyapplication.getProfileVersion() != com.payair.hce.getAckPreEntryAllowed.BOOLEAN ? getackautomaticallyresetbyapplication.getAid() : java.lang.Boolean.toString(getackautomaticallyresetbyapplication.IccPrivateKeyCrtComponentsJson());
            } else {
                commonDataV2Json.pan = null;
                getackautomaticallyresetbyapplication.RecordsJson();
            }
        }
        getackautomaticallyresetbyapplication.DigitizedCardProfile();
        return commonDataV2Json;
    }
}
