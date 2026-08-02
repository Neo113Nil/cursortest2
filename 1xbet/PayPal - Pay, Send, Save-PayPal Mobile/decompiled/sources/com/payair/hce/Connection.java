package com.payair.hce;

/* loaded from: classes4.dex */
public final class Connection extends com.payair.hce.getMagstripeCvmIssuerOptions implements com.payair.hce.CardAlternateContactlessPaymentDataJson {
    private com.payair.hce.getTrack2Equivalent AlternateContactlessPaymentDataJson;
    private com.payair.hce.getPan valueOf;
    private com.payair.hce.IccPrivateKeyCrtComponentsJson values;

    public Connection(com.payair.hce.IccPrivateKeyCrtComponentsJson iccPrivateKeyCrtComponentsJson, com.payair.hce.getPan getpan, com.payair.hce.getTrack2Equivalent gettrack2equivalent) {
        this.values = iccPrivateKeyCrtComponentsJson;
        this.valueOf = getpan;
        this.AlternateContactlessPaymentDataJson = gettrack2equivalent;
    }

    @Override // com.payair.hce.getMagstripeCvmIssuerOptions
    public final void writeReplace(com.payair.hce.getRemotePaymentData getremotepaymentdata, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            getremotepaymentdata.writeReplace();
            return;
        }
        com.mastercard.mpsdk.card.profile.v2.DsrpDataV2Json dsrpDataV2Json = (com.mastercard.mpsdk.card.profile.v2.DsrpDataV2Json) obj;
        com.payair.hce.getTrack2Equivalent gettrack2equivalent = this.AlternateContactlessPaymentDataJson;
        getremotepaymentdata.AlternateContactlessPaymentDataJson();
        if (dsrpDataV2Json != dsrpDataV2Json.aip) {
            gettrack2equivalent.writeReplace(getremotepaymentdata, 3);
            getremotepaymentdata.DigitizedCardProfile(dsrpDataV2Json.aip);
        }
        if (dsrpDataV2Json != dsrpDataV2Json.expirationDate) {
            gettrack2equivalent.writeReplace(getremotepaymentdata, 13);
            getremotepaymentdata.DigitizedCardProfile(dsrpDataV2Json.expirationDate);
        }
        if (dsrpDataV2Json != dsrpDataV2Json.panSequenceNumber) {
            gettrack2equivalent.writeReplace(getremotepaymentdata, 70);
            getremotepaymentdata.DigitizedCardProfile(dsrpDataV2Json.panSequenceNumber);
        }
        if (dsrpDataV2Json != dsrpDataV2Json.track2Equivalent) {
            gettrack2equivalent.writeReplace(getremotepaymentdata, 11);
            getremotepaymentdata.DigitizedCardProfile(dsrpDataV2Json.track2Equivalent);
        }
        if (dsrpDataV2Json != dsrpDataV2Json.issuerApplicationData) {
            gettrack2equivalent.writeReplace(getremotepaymentdata, 88);
            getremotepaymentdata.DigitizedCardProfile(dsrpDataV2Json.issuerApplicationData);
        }
        if (dsrpDataV2Json != dsrpDataV2Json.cvmModel) {
            gettrack2equivalent.writeReplace(getremotepaymentdata, 54);
            getremotepaymentdata.DigitizedCardProfile(dsrpDataV2Json.cvmModel);
        }
        if (dsrpDataV2Json != dsrpDataV2Json.umdGeneration) {
            gettrack2equivalent.writeReplace(getremotepaymentdata, 79);
            getremotepaymentdata.DigitizedCardProfile(dsrpDataV2Json.umdGeneration);
        }
        if (dsrpDataV2Json != dsrpDataV2Json.ucafVersion) {
            gettrack2equivalent.writeReplace(getremotepaymentdata, 26);
            getremotepaymentdata.DigitizedCardProfile(dsrpDataV2Json.ucafVersion);
        }
        if (dsrpDataV2Json != dsrpDataV2Json.par) {
            gettrack2equivalent.writeReplace(getremotepaymentdata, 7);
            getremotepaymentdata.DigitizedCardProfile(dsrpDataV2Json.par);
        }
        getremotepaymentdata.values();
    }

    @Override // com.payair.hce.getMagstripeCvmIssuerOptions
    public final java.lang.Object AlternateContactlessPaymentDataJson(com.payair.hce.getAckAutomaticallyResetByApplication getackautomaticallyresetbyapplication) throws java.io.IOException {
        if (getackautomaticallyresetbyapplication.getProfileVersion() == com.payair.hce.getAckPreEntryAllowed.NULL) {
            getackautomaticallyresetbyapplication.getCvrMaskAnd();
            return null;
        }
        com.mastercard.mpsdk.card.profile.v2.DsrpDataV2Json dsrpDataV2Json = new com.mastercard.mpsdk.card.profile.v2.DsrpDataV2Json();
        com.payair.hce.getPan getpan = this.valueOf;
        getackautomaticallyresetbyapplication.writeReplace();
        while (getackautomaticallyresetbyapplication.values()) {
            int AlternateContactlessPaymentDataJson = getpan.AlternateContactlessPaymentDataJson(getackautomaticallyresetbyapplication);
            boolean z = getackautomaticallyresetbyapplication.getProfileVersion() != com.payair.hce.getAckPreEntryAllowed.NULL;
            if (AlternateContactlessPaymentDataJson != 1) {
                if (AlternateContactlessPaymentDataJson != 5) {
                    if (AlternateContactlessPaymentDataJson != 11) {
                        if (AlternateContactlessPaymentDataJson != 16) {
                            if (AlternateContactlessPaymentDataJson != 18) {
                                if (AlternateContactlessPaymentDataJson != 52) {
                                    if (AlternateContactlessPaymentDataJson != 70) {
                                        if (AlternateContactlessPaymentDataJson != 78) {
                                            if (AlternateContactlessPaymentDataJson != 85) {
                                                getackautomaticallyresetbyapplication.getCvrMaskAnd();
                                            } else if (z) {
                                                dsrpDataV2Json.par = getackautomaticallyresetbyapplication.getProfileVersion() != com.payair.hce.getAckPreEntryAllowed.BOOLEAN ? getackautomaticallyresetbyapplication.getAid() : java.lang.Boolean.toString(getackautomaticallyresetbyapplication.IccPrivateKeyCrtComponentsJson());
                                            } else {
                                                dsrpDataV2Json.par = null;
                                                getackautomaticallyresetbyapplication.RecordsJson();
                                            }
                                        } else if (z) {
                                            dsrpDataV2Json.issuerApplicationData = getackautomaticallyresetbyapplication.getProfileVersion() != com.payair.hce.getAckPreEntryAllowed.BOOLEAN ? getackautomaticallyresetbyapplication.getAid() : java.lang.Boolean.toString(getackautomaticallyresetbyapplication.IccPrivateKeyCrtComponentsJson());
                                        } else {
                                            dsrpDataV2Json.issuerApplicationData = null;
                                            getackautomaticallyresetbyapplication.RecordsJson();
                                        }
                                    } else if (z) {
                                        dsrpDataV2Json.aip = getackautomaticallyresetbyapplication.getProfileVersion() != com.payair.hce.getAckPreEntryAllowed.BOOLEAN ? getackautomaticallyresetbyapplication.getAid() : java.lang.Boolean.toString(getackautomaticallyresetbyapplication.IccPrivateKeyCrtComponentsJson());
                                    } else {
                                        dsrpDataV2Json.aip = null;
                                        getackautomaticallyresetbyapplication.RecordsJson();
                                    }
                                } else if (z) {
                                    dsrpDataV2Json.cvmModel = getackautomaticallyresetbyapplication.getProfileVersion() != com.payair.hce.getAckPreEntryAllowed.BOOLEAN ? getackautomaticallyresetbyapplication.getAid() : java.lang.Boolean.toString(getackautomaticallyresetbyapplication.IccPrivateKeyCrtComponentsJson());
                                } else {
                                    dsrpDataV2Json.cvmModel = null;
                                    getackautomaticallyresetbyapplication.RecordsJson();
                                }
                            } else if (z) {
                                dsrpDataV2Json.ucafVersion = getackautomaticallyresetbyapplication.getProfileVersion() != com.payair.hce.getAckPreEntryAllowed.BOOLEAN ? getackautomaticallyresetbyapplication.getAid() : java.lang.Boolean.toString(getackautomaticallyresetbyapplication.IccPrivateKeyCrtComponentsJson());
                            } else {
                                dsrpDataV2Json.ucafVersion = null;
                                getackautomaticallyresetbyapplication.RecordsJson();
                            }
                        } else if (z) {
                            dsrpDataV2Json.umdGeneration = getackautomaticallyresetbyapplication.getProfileVersion() != com.payair.hce.getAckPreEntryAllowed.BOOLEAN ? getackautomaticallyresetbyapplication.getAid() : java.lang.Boolean.toString(getackautomaticallyresetbyapplication.IccPrivateKeyCrtComponentsJson());
                        } else {
                            dsrpDataV2Json.umdGeneration = null;
                            getackautomaticallyresetbyapplication.RecordsJson();
                        }
                    } else if (z) {
                        dsrpDataV2Json.panSequenceNumber = getackautomaticallyresetbyapplication.getProfileVersion() != com.payair.hce.getAckPreEntryAllowed.BOOLEAN ? getackautomaticallyresetbyapplication.getAid() : java.lang.Boolean.toString(getackautomaticallyresetbyapplication.IccPrivateKeyCrtComponentsJson());
                    } else {
                        dsrpDataV2Json.panSequenceNumber = null;
                        getackautomaticallyresetbyapplication.RecordsJson();
                    }
                } else if (z) {
                    dsrpDataV2Json.expirationDate = getackautomaticallyresetbyapplication.getProfileVersion() != com.payair.hce.getAckPreEntryAllowed.BOOLEAN ? getackautomaticallyresetbyapplication.getAid() : java.lang.Boolean.toString(getackautomaticallyresetbyapplication.IccPrivateKeyCrtComponentsJson());
                } else {
                    dsrpDataV2Json.expirationDate = null;
                    getackautomaticallyresetbyapplication.RecordsJson();
                }
            } else if (z) {
                dsrpDataV2Json.track2Equivalent = getackautomaticallyresetbyapplication.getProfileVersion() != com.payair.hce.getAckPreEntryAllowed.BOOLEAN ? getackautomaticallyresetbyapplication.getAid() : java.lang.Boolean.toString(getackautomaticallyresetbyapplication.IccPrivateKeyCrtComponentsJson());
            } else {
                dsrpDataV2Json.track2Equivalent = null;
                getackautomaticallyresetbyapplication.RecordsJson();
            }
        }
        getackautomaticallyresetbyapplication.DigitizedCardProfile();
        return dsrpDataV2Json;
    }
}
