package com.payair.hce;

/* loaded from: classes4.dex */
public final class getTokenType extends com.payair.hce.getMagstripeCvmIssuerOptions implements com.payair.hce.CardAlternateContactlessPaymentDataJson {
    private com.payair.hce.IccPrivateKeyCrtComponentsJson AlternateContactlessPaymentDataJson;
    private com.payair.hce.getPan valueOf;
    private com.payair.hce.getTrack2Equivalent values;

    public getTokenType(com.payair.hce.IccPrivateKeyCrtComponentsJson iccPrivateKeyCrtComponentsJson, com.payair.hce.getPan getpan, com.payair.hce.getTrack2Equivalent gettrack2equivalent) {
        this.AlternateContactlessPaymentDataJson = iccPrivateKeyCrtComponentsJson;
        this.valueOf = getpan;
        this.values = gettrack2equivalent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.payair.hce.getMagstripeCvmIssuerOptions
    public final void writeReplace(com.payair.hce.getRemotePaymentData getremotepaymentdata, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            getremotepaymentdata.writeReplace();
            return;
        }
        com.mastercard.mpsdk.card.profile.v2.ContactlessPaymentDataV2Json contactlessPaymentDataV2Json = (com.mastercard.mpsdk.card.profile.v2.ContactlessPaymentDataV2Json) obj;
        com.payair.hce.IccPrivateKeyCrtComponentsJson iccPrivateKeyCrtComponentsJson = this.AlternateContactlessPaymentDataJson;
        com.payair.hce.getTrack2Equivalent gettrack2equivalent = this.values;
        getremotepaymentdata.AlternateContactlessPaymentDataJson();
        if (contactlessPaymentDataV2Json != contactlessPaymentDataV2Json.aid) {
            gettrack2equivalent.writeReplace(getremotepaymentdata, 86);
            getremotepaymentdata.DigitizedCardProfile(contactlessPaymentDataV2Json.aid);
        }
        if (contactlessPaymentDataV2Json != contactlessPaymentDataV2Json.ppseFci) {
            gettrack2equivalent.writeReplace(getremotepaymentdata, 59);
            getremotepaymentdata.DigitizedCardProfile(contactlessPaymentDataV2Json.ppseFci);
        }
        if (contactlessPaymentDataV2Json != contactlessPaymentDataV2Json.paymentFci) {
            gettrack2equivalent.writeReplace(getremotepaymentdata, 9);
            getremotepaymentdata.DigitizedCardProfile(contactlessPaymentDataV2Json.paymentFci);
        }
        if (contactlessPaymentDataV2Json != contactlessPaymentDataV2Json.gpoResponse) {
            gettrack2equivalent.writeReplace(getremotepaymentdata, 37);
            getremotepaymentdata.DigitizedCardProfile(contactlessPaymentDataV2Json.gpoResponse);
        }
        if (contactlessPaymentDataV2Json != contactlessPaymentDataV2Json.cdol1RelatedDataLength) {
            gettrack2equivalent.writeReplace(getremotepaymentdata, 53);
            java.lang.Integer num = contactlessPaymentDataV2Json.cdol1RelatedDataLength;
            com.payair.hce.getApplicationExpiryDate.values(iccPrivateKeyCrtComponentsJson, java.lang.Integer.class, num).writeReplace(getremotepaymentdata, num);
        }
        if (contactlessPaymentDataV2Json != contactlessPaymentDataV2Json.issuerApplicationData) {
            gettrack2equivalent.writeReplace(getremotepaymentdata, 88);
            getremotepaymentdata.DigitizedCardProfile(contactlessPaymentDataV2Json.issuerApplicationData);
        }
        if (contactlessPaymentDataV2Json != contactlessPaymentDataV2Json.pinIvCvc3Track2) {
            gettrack2equivalent.writeReplace(getremotepaymentdata, 40);
            getremotepaymentdata.DigitizedCardProfile(contactlessPaymentDataV2Json.pinIvCvc3Track2);
        }
        if (contactlessPaymentDataV2Json != contactlessPaymentDataV2Json.isUsAipMaskingSupported) {
            gettrack2equivalent.writeReplace(getremotepaymentdata, 30);
            getremotepaymentdata.valueOf(contactlessPaymentDataV2Json.isUsAipMaskingSupported);
        }
        if (contactlessPaymentDataV2Json != contactlessPaymentDataV2Json.isTransitSupported) {
            gettrack2equivalent.writeReplace(getremotepaymentdata, 80);
            getremotepaymentdata.valueOf(contactlessPaymentDataV2Json.isTransitSupported);
        }
        if (contactlessPaymentDataV2Json != contactlessPaymentDataV2Json.umdGeneration) {
            gettrack2equivalent.writeReplace(getremotepaymentdata, 79);
            getremotepaymentdata.DigitizedCardProfile(contactlessPaymentDataV2Json.umdGeneration);
        }
        if (contactlessPaymentDataV2Json != contactlessPaymentDataV2Json.cvmModel) {
            gettrack2equivalent.writeReplace(getremotepaymentdata, 54);
            getremotepaymentdata.DigitizedCardProfile(contactlessPaymentDataV2Json.cvmModel);
        }
        if (contactlessPaymentDataV2Json != contactlessPaymentDataV2Json.alternateContactlessPaymentData) {
            gettrack2equivalent.writeReplace(getremotepaymentdata, 89);
            com.mastercard.mpsdk.card.profile.AlternateContactlessPaymentDataJson alternateContactlessPaymentDataJson = contactlessPaymentDataV2Json.alternateContactlessPaymentData;
            com.payair.hce.getApplicationExpiryDate.values(iccPrivateKeyCrtComponentsJson, com.mastercard.mpsdk.card.profile.AlternateContactlessPaymentDataJson.class, alternateContactlessPaymentDataJson).writeReplace(getremotepaymentdata, alternateContactlessPaymentDataJson);
        }
        if (contactlessPaymentDataV2Json != contactlessPaymentDataV2Json.protectedIccPrivateKeyCrtComponents) {
            gettrack2equivalent.writeReplace(getremotepaymentdata, 49);
            com.mastercard.mpsdk.card.profile.IccPrivateKeyCrtComponentsJson iccPrivateKeyCrtComponentsJson2 = contactlessPaymentDataV2Json.protectedIccPrivateKeyCrtComponents;
            com.payair.hce.getApplicationExpiryDate.values(iccPrivateKeyCrtComponentsJson, com.mastercard.mpsdk.card.profile.IccPrivateKeyCrtComponentsJson.class, iccPrivateKeyCrtComponentsJson2).writeReplace(getremotepaymentdata, iccPrivateKeyCrtComponentsJson2);
        }
        if (contactlessPaymentDataV2Json != contactlessPaymentDataV2Json.track1ConstructionData) {
            gettrack2equivalent.writeReplace(getremotepaymentdata, 92);
            com.mastercard.mpsdk.card.profile.v2.TrackConstructionDataV2Json trackConstructionDataV2Json = contactlessPaymentDataV2Json.track1ConstructionData;
            com.payair.hce.getApplicationExpiryDate.values(iccPrivateKeyCrtComponentsJson, com.mastercard.mpsdk.card.profile.v2.TrackConstructionDataV2Json.class, trackConstructionDataV2Json).writeReplace(getremotepaymentdata, trackConstructionDataV2Json);
        }
        if (contactlessPaymentDataV2Json != contactlessPaymentDataV2Json.track2ConstructionData) {
            gettrack2equivalent.writeReplace(getremotepaymentdata, 19);
            com.mastercard.mpsdk.card.profile.v2.TrackConstructionDataV2Json trackConstructionDataV2Json2 = contactlessPaymentDataV2Json.track2ConstructionData;
            com.payair.hce.getApplicationExpiryDate.values(iccPrivateKeyCrtComponentsJson, com.mastercard.mpsdk.card.profile.v2.TrackConstructionDataV2Json.class, trackConstructionDataV2Json2).writeReplace(getremotepaymentdata, trackConstructionDataV2Json2);
        }
        if (contactlessPaymentDataV2Json != contactlessPaymentDataV2Json.records) {
            gettrack2equivalent.writeReplace(getremotepaymentdata, 24);
            com.mastercard.mpsdk.card.profile.RecordsJson[] recordsJsonArr = contactlessPaymentDataV2Json.records;
            com.payair.hce.getApplicationExpiryDate.values(iccPrivateKeyCrtComponentsJson, com.mastercard.mpsdk.card.profile.RecordsJson[].class, recordsJsonArr).writeReplace(getremotepaymentdata, recordsJsonArr);
        }
        getremotepaymentdata.values();
    }

    @Override // com.payair.hce.getMagstripeCvmIssuerOptions
    public final java.lang.Object AlternateContactlessPaymentDataJson(com.payair.hce.getAckAutomaticallyResetByApplication getackautomaticallyresetbyapplication) throws java.io.IOException {
        if (getackautomaticallyresetbyapplication.getProfileVersion() == com.payair.hce.getAckPreEntryAllowed.NULL) {
            getackautomaticallyresetbyapplication.getCvrMaskAnd();
            return null;
        }
        com.mastercard.mpsdk.card.profile.v2.ContactlessPaymentDataV2Json contactlessPaymentDataV2Json = new com.mastercard.mpsdk.card.profile.v2.ContactlessPaymentDataV2Json();
        com.payair.hce.IccPrivateKeyCrtComponentsJson iccPrivateKeyCrtComponentsJson = this.AlternateContactlessPaymentDataJson;
        com.payair.hce.getPan getpan = this.valueOf;
        getackautomaticallyresetbyapplication.writeReplace();
        while (getackautomaticallyresetbyapplication.values()) {
            int AlternateContactlessPaymentDataJson = getpan.AlternateContactlessPaymentDataJson(getackautomaticallyresetbyapplication);
            boolean z = getackautomaticallyresetbyapplication.getProfileVersion() != com.payair.hce.getAckPreEntryAllowed.NULL;
            if (AlternateContactlessPaymentDataJson != 4) {
                if (AlternateContactlessPaymentDataJson != 16) {
                    if (AlternateContactlessPaymentDataJson != 22) {
                        if (AlternateContactlessPaymentDataJson != 24) {
                            if (AlternateContactlessPaymentDataJson != 32) {
                                if (AlternateContactlessPaymentDataJson != 34) {
                                    if (AlternateContactlessPaymentDataJson != 59) {
                                        if (AlternateContactlessPaymentDataJson != 73) {
                                            if (AlternateContactlessPaymentDataJson != 78) {
                                                if (AlternateContactlessPaymentDataJson != 87) {
                                                    if (AlternateContactlessPaymentDataJson != 8) {
                                                        if (AlternateContactlessPaymentDataJson != 9) {
                                                            if (AlternateContactlessPaymentDataJson != 51) {
                                                                if (AlternateContactlessPaymentDataJson != 52) {
                                                                    if (AlternateContactlessPaymentDataJson != 64) {
                                                                        if (AlternateContactlessPaymentDataJson != 65) {
                                                                            getackautomaticallyresetbyapplication.getCvrMaskAnd();
                                                                        } else if (z) {
                                                                            contactlessPaymentDataV2Json.isUsAipMaskingSupported = (java.lang.Boolean) iccPrivateKeyCrtComponentsJson.valueOf(new com.payair.hce.getPinAlwaysRequiredIfCurrencyProvided(java.lang.Boolean.class)).AlternateContactlessPaymentDataJson(getackautomaticallyresetbyapplication);
                                                                        } else {
                                                                            contactlessPaymentDataV2Json.isUsAipMaskingSupported = null;
                                                                            getackautomaticallyresetbyapplication.RecordsJson();
                                                                        }
                                                                    } else if (z) {
                                                                        contactlessPaymentDataV2Json.ppseFci = getackautomaticallyresetbyapplication.getProfileVersion() != com.payair.hce.getAckPreEntryAllowed.BOOLEAN ? getackautomaticallyresetbyapplication.getAid() : java.lang.Boolean.toString(getackautomaticallyresetbyapplication.IccPrivateKeyCrtComponentsJson());
                                                                    } else {
                                                                        contactlessPaymentDataV2Json.ppseFci = null;
                                                                        getackautomaticallyresetbyapplication.RecordsJson();
                                                                    }
                                                                } else if (z) {
                                                                    contactlessPaymentDataV2Json.cvmModel = getackautomaticallyresetbyapplication.getProfileVersion() != com.payair.hce.getAckPreEntryAllowed.BOOLEAN ? getackautomaticallyresetbyapplication.getAid() : java.lang.Boolean.toString(getackautomaticallyresetbyapplication.IccPrivateKeyCrtComponentsJson());
                                                                } else {
                                                                    contactlessPaymentDataV2Json.cvmModel = null;
                                                                    getackautomaticallyresetbyapplication.RecordsJson();
                                                                }
                                                            } else if (z) {
                                                                contactlessPaymentDataV2Json.alternateContactlessPaymentData = (com.mastercard.mpsdk.card.profile.AlternateContactlessPaymentDataJson) iccPrivateKeyCrtComponentsJson.valueOf(new com.payair.hce.getPinAlwaysRequiredIfCurrencyProvided(com.mastercard.mpsdk.card.profile.AlternateContactlessPaymentDataJson.class)).AlternateContactlessPaymentDataJson(getackautomaticallyresetbyapplication);
                                                            } else {
                                                                contactlessPaymentDataV2Json.alternateContactlessPaymentData = null;
                                                                getackautomaticallyresetbyapplication.RecordsJson();
                                                            }
                                                        } else if (z) {
                                                            contactlessPaymentDataV2Json.track1ConstructionData = (com.mastercard.mpsdk.card.profile.v2.TrackConstructionDataV2Json) iccPrivateKeyCrtComponentsJson.valueOf(new com.payair.hce.getPinAlwaysRequiredIfCurrencyProvided(com.mastercard.mpsdk.card.profile.v2.TrackConstructionDataV2Json.class)).AlternateContactlessPaymentDataJson(getackautomaticallyresetbyapplication);
                                                        } else {
                                                            contactlessPaymentDataV2Json.track1ConstructionData = null;
                                                            getackautomaticallyresetbyapplication.RecordsJson();
                                                        }
                                                    } else if (z) {
                                                        contactlessPaymentDataV2Json.cdol1RelatedDataLength = (java.lang.Integer) iccPrivateKeyCrtComponentsJson.valueOf(new com.payair.hce.getPinAlwaysRequiredIfCurrencyProvided(java.lang.Integer.class)).AlternateContactlessPaymentDataJson(getackautomaticallyresetbyapplication);
                                                    } else {
                                                        contactlessPaymentDataV2Json.cdol1RelatedDataLength = null;
                                                        getackautomaticallyresetbyapplication.RecordsJson();
                                                    }
                                                } else if (z) {
                                                    contactlessPaymentDataV2Json.gpoResponse = getackautomaticallyresetbyapplication.getProfileVersion() != com.payair.hce.getAckPreEntryAllowed.BOOLEAN ? getackautomaticallyresetbyapplication.getAid() : java.lang.Boolean.toString(getackautomaticallyresetbyapplication.IccPrivateKeyCrtComponentsJson());
                                                } else {
                                                    contactlessPaymentDataV2Json.gpoResponse = null;
                                                    getackautomaticallyresetbyapplication.RecordsJson();
                                                }
                                            } else if (z) {
                                                contactlessPaymentDataV2Json.issuerApplicationData = getackautomaticallyresetbyapplication.getProfileVersion() != com.payair.hce.getAckPreEntryAllowed.BOOLEAN ? getackautomaticallyresetbyapplication.getAid() : java.lang.Boolean.toString(getackautomaticallyresetbyapplication.IccPrivateKeyCrtComponentsJson());
                                            } else {
                                                contactlessPaymentDataV2Json.issuerApplicationData = null;
                                                getackautomaticallyresetbyapplication.RecordsJson();
                                            }
                                        } else if (z) {
                                            contactlessPaymentDataV2Json.protectedIccPrivateKeyCrtComponents = (com.mastercard.mpsdk.card.profile.IccPrivateKeyCrtComponentsJson) iccPrivateKeyCrtComponentsJson.valueOf(new com.payair.hce.getPinAlwaysRequiredIfCurrencyProvided(com.mastercard.mpsdk.card.profile.IccPrivateKeyCrtComponentsJson.class)).AlternateContactlessPaymentDataJson(getackautomaticallyresetbyapplication);
                                        } else {
                                            contactlessPaymentDataV2Json.protectedIccPrivateKeyCrtComponents = null;
                                            getackautomaticallyresetbyapplication.RecordsJson();
                                        }
                                    } else if (z) {
                                        contactlessPaymentDataV2Json.aid = getackautomaticallyresetbyapplication.getProfileVersion() != com.payair.hce.getAckPreEntryAllowed.BOOLEAN ? getackautomaticallyresetbyapplication.getAid() : java.lang.Boolean.toString(getackautomaticallyresetbyapplication.IccPrivateKeyCrtComponentsJson());
                                    } else {
                                        contactlessPaymentDataV2Json.aid = null;
                                        getackautomaticallyresetbyapplication.RecordsJson();
                                    }
                                } else if (z) {
                                    contactlessPaymentDataV2Json.paymentFci = getackautomaticallyresetbyapplication.getProfileVersion() != com.payair.hce.getAckPreEntryAllowed.BOOLEAN ? getackautomaticallyresetbyapplication.getAid() : java.lang.Boolean.toString(getackautomaticallyresetbyapplication.IccPrivateKeyCrtComponentsJson());
                                } else {
                                    contactlessPaymentDataV2Json.paymentFci = null;
                                    getackautomaticallyresetbyapplication.RecordsJson();
                                }
                            } else if (z) {
                                contactlessPaymentDataV2Json.records = (com.mastercard.mpsdk.card.profile.RecordsJson[]) iccPrivateKeyCrtComponentsJson.valueOf(new com.payair.hce.getPinAlwaysRequiredIfCurrencyProvided(com.mastercard.mpsdk.card.profile.RecordsJson[].class)).AlternateContactlessPaymentDataJson(getackautomaticallyresetbyapplication);
                            } else {
                                contactlessPaymentDataV2Json.records = null;
                                getackautomaticallyresetbyapplication.RecordsJson();
                            }
                        } else if (z) {
                            contactlessPaymentDataV2Json.pinIvCvc3Track2 = getackautomaticallyresetbyapplication.getProfileVersion() != com.payair.hce.getAckPreEntryAllowed.BOOLEAN ? getackautomaticallyresetbyapplication.getAid() : java.lang.Boolean.toString(getackautomaticallyresetbyapplication.IccPrivateKeyCrtComponentsJson());
                        } else {
                            contactlessPaymentDataV2Json.pinIvCvc3Track2 = null;
                            getackautomaticallyresetbyapplication.RecordsJson();
                        }
                    } else if (z) {
                        contactlessPaymentDataV2Json.track2ConstructionData = (com.mastercard.mpsdk.card.profile.v2.TrackConstructionDataV2Json) iccPrivateKeyCrtComponentsJson.valueOf(new com.payair.hce.getPinAlwaysRequiredIfCurrencyProvided(com.mastercard.mpsdk.card.profile.v2.TrackConstructionDataV2Json.class)).AlternateContactlessPaymentDataJson(getackautomaticallyresetbyapplication);
                    } else {
                        contactlessPaymentDataV2Json.track2ConstructionData = null;
                        getackautomaticallyresetbyapplication.RecordsJson();
                    }
                } else if (z) {
                    contactlessPaymentDataV2Json.umdGeneration = getackautomaticallyresetbyapplication.getProfileVersion() != com.payair.hce.getAckPreEntryAllowed.BOOLEAN ? getackautomaticallyresetbyapplication.getAid() : java.lang.Boolean.toString(getackautomaticallyresetbyapplication.IccPrivateKeyCrtComponentsJson());
                } else {
                    contactlessPaymentDataV2Json.umdGeneration = null;
                    getackautomaticallyresetbyapplication.RecordsJson();
                }
            } else if (z) {
                contactlessPaymentDataV2Json.isTransitSupported = (java.lang.Boolean) iccPrivateKeyCrtComponentsJson.valueOf(new com.payair.hce.getPinAlwaysRequiredIfCurrencyProvided(java.lang.Boolean.class)).AlternateContactlessPaymentDataJson(getackautomaticallyresetbyapplication);
            } else {
                contactlessPaymentDataV2Json.isTransitSupported = null;
                getackautomaticallyresetbyapplication.RecordsJson();
            }
        }
        getackautomaticallyresetbyapplication.DigitizedCardProfile();
        return contactlessPaymentDataV2Json;
    }
}
