package com.payair.hce;

/* loaded from: classes4.dex */
public final class deleteAll extends com.payair.hce.getMagstripeCvmIssuerOptions implements com.payair.hce.CardAlternateContactlessPaymentDataJson {
    private com.payair.hce.getPan AlternateContactlessPaymentDataJson;
    private com.payair.hce.IccPrivateKeyCrtComponentsJson DigitizedCardProfile;
    private com.payair.hce.getTrack2Equivalent values;

    public deleteAll(com.payair.hce.IccPrivateKeyCrtComponentsJson iccPrivateKeyCrtComponentsJson, com.payair.hce.getPan getpan, com.payair.hce.getTrack2Equivalent gettrack2equivalent) {
        this.DigitizedCardProfile = iccPrivateKeyCrtComponentsJson;
        this.AlternateContactlessPaymentDataJson = getpan;
        this.values = gettrack2equivalent;
    }

    @Override // com.payair.hce.getMagstripeCvmIssuerOptions
    public final void writeReplace(com.payair.hce.getRemotePaymentData getremotepaymentdata, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            getremotepaymentdata.writeReplace();
            return;
        }
        com.mastercard.mpsdk.card.profile.AlternateContactlessPaymentDataJson alternateContactlessPaymentDataJson = (com.mastercard.mpsdk.card.profile.AlternateContactlessPaymentDataJson) obj;
        com.payair.hce.getTrack2Equivalent gettrack2equivalent = this.values;
        getremotepaymentdata.AlternateContactlessPaymentDataJson();
        if (alternateContactlessPaymentDataJson != alternateContactlessPaymentDataJson.aid) {
            gettrack2equivalent.writeReplace(getremotepaymentdata, 86);
            getremotepaymentdata.DigitizedCardProfile(alternateContactlessPaymentDataJson.aid);
        }
        if (alternateContactlessPaymentDataJson != alternateContactlessPaymentDataJson.paymentFci) {
            gettrack2equivalent.writeReplace(getremotepaymentdata, 9);
            getremotepaymentdata.DigitizedCardProfile(alternateContactlessPaymentDataJson.paymentFci);
        }
        if (alternateContactlessPaymentDataJson != alternateContactlessPaymentDataJson.gpoResponse) {
            gettrack2equivalent.writeReplace(getremotepaymentdata, 37);
            getremotepaymentdata.DigitizedCardProfile(alternateContactlessPaymentDataJson.gpoResponse);
        }
        if (alternateContactlessPaymentDataJson != alternateContactlessPaymentDataJson.ciacDecline) {
            gettrack2equivalent.writeReplace(getremotepaymentdata, 20);
            getremotepaymentdata.DigitizedCardProfile(alternateContactlessPaymentDataJson.ciacDecline);
        }
        if (alternateContactlessPaymentDataJson != alternateContactlessPaymentDataJson.cvrMaskAnd) {
            gettrack2equivalent.writeReplace(getremotepaymentdata, 27);
            getremotepaymentdata.DigitizedCardProfile(alternateContactlessPaymentDataJson.cvrMaskAnd);
        }
        getremotepaymentdata.values();
    }

    @Override // com.payair.hce.getMagstripeCvmIssuerOptions
    public final java.lang.Object AlternateContactlessPaymentDataJson(com.payair.hce.getAckAutomaticallyResetByApplication getackautomaticallyresetbyapplication) throws java.io.IOException {
        if (getackautomaticallyresetbyapplication.getProfileVersion() == com.payair.hce.getAckPreEntryAllowed.NULL) {
            getackautomaticallyresetbyapplication.getCvrMaskAnd();
            return null;
        }
        com.mastercard.mpsdk.card.profile.AlternateContactlessPaymentDataJson alternateContactlessPaymentDataJson = new com.mastercard.mpsdk.card.profile.AlternateContactlessPaymentDataJson();
        com.payair.hce.getPan getpan = this.AlternateContactlessPaymentDataJson;
        getackautomaticallyresetbyapplication.writeReplace();
        while (getackautomaticallyresetbyapplication.values()) {
            int AlternateContactlessPaymentDataJson = getpan.AlternateContactlessPaymentDataJson(getackautomaticallyresetbyapplication);
            boolean z = getackautomaticallyresetbyapplication.getProfileVersion() != com.payair.hce.getAckPreEntryAllowed.NULL;
            if (AlternateContactlessPaymentDataJson != 3) {
                if (AlternateContactlessPaymentDataJson != 27) {
                    if (AlternateContactlessPaymentDataJson != 34) {
                        if (AlternateContactlessPaymentDataJson != 59) {
                            if (AlternateContactlessPaymentDataJson != 87) {
                                getackautomaticallyresetbyapplication.getCvrMaskAnd();
                            } else if (z) {
                                alternateContactlessPaymentDataJson.gpoResponse = getackautomaticallyresetbyapplication.getProfileVersion() != com.payair.hce.getAckPreEntryAllowed.BOOLEAN ? getackautomaticallyresetbyapplication.getAid() : java.lang.Boolean.toString(getackautomaticallyresetbyapplication.IccPrivateKeyCrtComponentsJson());
                            } else {
                                alternateContactlessPaymentDataJson.gpoResponse = null;
                                getackautomaticallyresetbyapplication.RecordsJson();
                            }
                        } else if (z) {
                            alternateContactlessPaymentDataJson.aid = getackautomaticallyresetbyapplication.getProfileVersion() != com.payair.hce.getAckPreEntryAllowed.BOOLEAN ? getackautomaticallyresetbyapplication.getAid() : java.lang.Boolean.toString(getackautomaticallyresetbyapplication.IccPrivateKeyCrtComponentsJson());
                        } else {
                            alternateContactlessPaymentDataJson.aid = null;
                            getackautomaticallyresetbyapplication.RecordsJson();
                        }
                    } else if (z) {
                        alternateContactlessPaymentDataJson.paymentFci = getackautomaticallyresetbyapplication.getProfileVersion() != com.payair.hce.getAckPreEntryAllowed.BOOLEAN ? getackautomaticallyresetbyapplication.getAid() : java.lang.Boolean.toString(getackautomaticallyresetbyapplication.IccPrivateKeyCrtComponentsJson());
                    } else {
                        alternateContactlessPaymentDataJson.paymentFci = null;
                        getackautomaticallyresetbyapplication.RecordsJson();
                    }
                } else if (z) {
                    alternateContactlessPaymentDataJson.cvrMaskAnd = getackautomaticallyresetbyapplication.getProfileVersion() != com.payair.hce.getAckPreEntryAllowed.BOOLEAN ? getackautomaticallyresetbyapplication.getAid() : java.lang.Boolean.toString(getackautomaticallyresetbyapplication.IccPrivateKeyCrtComponentsJson());
                } else {
                    alternateContactlessPaymentDataJson.cvrMaskAnd = null;
                    getackautomaticallyresetbyapplication.RecordsJson();
                }
            } else if (z) {
                alternateContactlessPaymentDataJson.ciacDecline = getackautomaticallyresetbyapplication.getProfileVersion() != com.payair.hce.getAckPreEntryAllowed.BOOLEAN ? getackautomaticallyresetbyapplication.getAid() : java.lang.Boolean.toString(getackautomaticallyresetbyapplication.IccPrivateKeyCrtComponentsJson());
            } else {
                alternateContactlessPaymentDataJson.ciacDecline = null;
                getackautomaticallyresetbyapplication.RecordsJson();
            }
        }
        getackautomaticallyresetbyapplication.DigitizedCardProfile();
        return alternateContactlessPaymentDataJson;
    }
}
