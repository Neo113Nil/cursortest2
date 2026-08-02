package com.payair.hce;

/* loaded from: classes4.dex */
public final class setType extends com.payair.hce.getMagstripeCvmIssuerOptions implements com.payair.hce.CardAlternateContactlessPaymentDataJson {
    private com.payair.hce.IccPrivateKeyCrtComponentsJson AlternateContactlessPaymentDataJson;
    private com.payair.hce.getTrack2Equivalent DigitizedCardProfile;
    private com.payair.hce.getPan values;

    public setType(com.payair.hce.IccPrivateKeyCrtComponentsJson iccPrivateKeyCrtComponentsJson, com.payair.hce.getPan getpan, com.payair.hce.getTrack2Equivalent gettrack2equivalent) {
        this.AlternateContactlessPaymentDataJson = iccPrivateKeyCrtComponentsJson;
        this.values = getpan;
        this.DigitizedCardProfile = gettrack2equivalent;
    }

    @Override // com.payair.hce.getMagstripeCvmIssuerOptions
    public final void writeReplace(com.payair.hce.getRemotePaymentData getremotepaymentdata, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            getremotepaymentdata.writeReplace();
            return;
        }
        com.mastercard.mpsdk.card.profile.v2.TrackConstructionDataV2Json trackConstructionDataV2Json = (com.mastercard.mpsdk.card.profile.v2.TrackConstructionDataV2Json) obj;
        com.payair.hce.getTrack2Equivalent gettrack2equivalent = this.DigitizedCardProfile;
        getremotepaymentdata.AlternateContactlessPaymentDataJson();
        if (trackConstructionDataV2Json != trackConstructionDataV2Json.pCvc3) {
            gettrack2equivalent.writeReplace(getremotepaymentdata, 61);
            getremotepaymentdata.DigitizedCardProfile(trackConstructionDataV2Json.pCvc3);
        }
        if (trackConstructionDataV2Json != trackConstructionDataV2Json.pUnAtc) {
            gettrack2equivalent.writeReplace(getremotepaymentdata, 29);
            getremotepaymentdata.DigitizedCardProfile(trackConstructionDataV2Json.pUnAtc);
        }
        if (trackConstructionDataV2Json != trackConstructionDataV2Json.nAtc) {
            gettrack2equivalent.writeReplace(getremotepaymentdata, 35);
            getremotepaymentdata.DigitizedCardProfile(trackConstructionDataV2Json.nAtc);
        }
        if (trackConstructionDataV2Json != trackConstructionDataV2Json.trackData) {
            gettrack2equivalent.writeReplace(getremotepaymentdata, 36);
            getremotepaymentdata.DigitizedCardProfile(trackConstructionDataV2Json.trackData);
        }
        getremotepaymentdata.values();
    }

    @Override // com.payair.hce.getMagstripeCvmIssuerOptions
    public final java.lang.Object AlternateContactlessPaymentDataJson(com.payair.hce.getAckAutomaticallyResetByApplication getackautomaticallyresetbyapplication) throws java.io.IOException {
        if (getackautomaticallyresetbyapplication.getProfileVersion() == com.payair.hce.getAckPreEntryAllowed.NULL) {
            getackautomaticallyresetbyapplication.getCvrMaskAnd();
            return null;
        }
        com.mastercard.mpsdk.card.profile.v2.TrackConstructionDataV2Json trackConstructionDataV2Json = new com.mastercard.mpsdk.card.profile.v2.TrackConstructionDataV2Json();
        com.payair.hce.getPan getpan = this.values;
        getackautomaticallyresetbyapplication.writeReplace();
        while (getackautomaticallyresetbyapplication.values()) {
            int AlternateContactlessPaymentDataJson = getpan.AlternateContactlessPaymentDataJson(getackautomaticallyresetbyapplication);
            boolean z = getackautomaticallyresetbyapplication.getProfileVersion() != com.payair.hce.getAckPreEntryAllowed.NULL;
            if (AlternateContactlessPaymentDataJson != 12) {
                if (AlternateContactlessPaymentDataJson != 29) {
                    if (AlternateContactlessPaymentDataJson != 44) {
                        if (AlternateContactlessPaymentDataJson != 86) {
                            getackautomaticallyresetbyapplication.getCvrMaskAnd();
                        } else if (z) {
                            trackConstructionDataV2Json.nAtc = getackautomaticallyresetbyapplication.getProfileVersion() != com.payair.hce.getAckPreEntryAllowed.BOOLEAN ? getackautomaticallyresetbyapplication.getAid() : java.lang.Boolean.toString(getackautomaticallyresetbyapplication.IccPrivateKeyCrtComponentsJson());
                        } else {
                            trackConstructionDataV2Json.nAtc = null;
                            getackautomaticallyresetbyapplication.RecordsJson();
                        }
                    } else if (z) {
                        trackConstructionDataV2Json.trackData = getackautomaticallyresetbyapplication.getProfileVersion() != com.payair.hce.getAckPreEntryAllowed.BOOLEAN ? getackautomaticallyresetbyapplication.getAid() : java.lang.Boolean.toString(getackautomaticallyresetbyapplication.IccPrivateKeyCrtComponentsJson());
                    } else {
                        trackConstructionDataV2Json.trackData = null;
                        getackautomaticallyresetbyapplication.RecordsJson();
                    }
                } else if (z) {
                    trackConstructionDataV2Json.pCvc3 = getackautomaticallyresetbyapplication.getProfileVersion() != com.payair.hce.getAckPreEntryAllowed.BOOLEAN ? getackautomaticallyresetbyapplication.getAid() : java.lang.Boolean.toString(getackautomaticallyresetbyapplication.IccPrivateKeyCrtComponentsJson());
                } else {
                    trackConstructionDataV2Json.pCvc3 = null;
                    getackautomaticallyresetbyapplication.RecordsJson();
                }
            } else if (z) {
                trackConstructionDataV2Json.pUnAtc = getackautomaticallyresetbyapplication.getProfileVersion() != com.payair.hce.getAckPreEntryAllowed.BOOLEAN ? getackautomaticallyresetbyapplication.getAid() : java.lang.Boolean.toString(getackautomaticallyresetbyapplication.IccPrivateKeyCrtComponentsJson());
            } else {
                trackConstructionDataV2Json.pUnAtc = null;
                getackautomaticallyresetbyapplication.RecordsJson();
            }
        }
        getackautomaticallyresetbyapplication.DigitizedCardProfile();
        return trackConstructionDataV2Json;
    }
}
