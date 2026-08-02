package com.payair.hce;

/* loaded from: classes4.dex */
public final class onCreate extends com.payair.hce.getMagstripeCvmIssuerOptions implements com.payair.hce.CardAlternateContactlessPaymentDataJson {
    private com.payair.hce.IccPrivateKeyCrtComponentsJson valueOf;
    private com.payair.hce.getPan values;
    private com.payair.hce.getTrack2Equivalent writeReplace;

    public onCreate(com.payair.hce.IccPrivateKeyCrtComponentsJson iccPrivateKeyCrtComponentsJson, com.payair.hce.getPan getpan, com.payair.hce.getTrack2Equivalent gettrack2equivalent) {
        this.valueOf = iccPrivateKeyCrtComponentsJson;
        this.values = getpan;
        this.writeReplace = gettrack2equivalent;
    }

    @Override // com.payair.hce.getMagstripeCvmIssuerOptions
    public final void writeReplace(com.payair.hce.getRemotePaymentData getremotepaymentdata, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            getremotepaymentdata.writeReplace();
            return;
        }
        com.mastercard.mpsdk.card.profile.IccPrivateKeyCrtComponentsJson iccPrivateKeyCrtComponentsJson = (com.mastercard.mpsdk.card.profile.IccPrivateKeyCrtComponentsJson) obj;
        com.payair.hce.getTrack2Equivalent gettrack2equivalent = this.writeReplace;
        getremotepaymentdata.AlternateContactlessPaymentDataJson();
        if (iccPrivateKeyCrtComponentsJson != iccPrivateKeyCrtComponentsJson.p) {
            gettrack2equivalent.writeReplace(getremotepaymentdata, 42);
            getremotepaymentdata.DigitizedCardProfile(iccPrivateKeyCrtComponentsJson.p);
        }
        if (iccPrivateKeyCrtComponentsJson != iccPrivateKeyCrtComponentsJson.q) {
            gettrack2equivalent.writeReplace(getremotepaymentdata, 62);
            getremotepaymentdata.DigitizedCardProfile(iccPrivateKeyCrtComponentsJson.q);
        }
        if (iccPrivateKeyCrtComponentsJson != iccPrivateKeyCrtComponentsJson.dp) {
            gettrack2equivalent.writeReplace(getremotepaymentdata, 66);
            getremotepaymentdata.DigitizedCardProfile(iccPrivateKeyCrtComponentsJson.dp);
        }
        if (iccPrivateKeyCrtComponentsJson != iccPrivateKeyCrtComponentsJson.dq) {
            gettrack2equivalent.writeReplace(getremotepaymentdata, 1);
            getremotepaymentdata.DigitizedCardProfile(iccPrivateKeyCrtComponentsJson.dq);
        }
        if (iccPrivateKeyCrtComponentsJson != iccPrivateKeyCrtComponentsJson.u) {
            gettrack2equivalent.writeReplace(getremotepaymentdata, 69);
            getremotepaymentdata.DigitizedCardProfile(iccPrivateKeyCrtComponentsJson.u);
        }
        getremotepaymentdata.values();
    }

    @Override // com.payair.hce.getMagstripeCvmIssuerOptions
    public final java.lang.Object AlternateContactlessPaymentDataJson(com.payair.hce.getAckAutomaticallyResetByApplication getackautomaticallyresetbyapplication) throws java.io.IOException {
        if (getackautomaticallyresetbyapplication.getProfileVersion() == com.payair.hce.getAckPreEntryAllowed.NULL) {
            getackautomaticallyresetbyapplication.getCvrMaskAnd();
            return null;
        }
        com.mastercard.mpsdk.card.profile.IccPrivateKeyCrtComponentsJson iccPrivateKeyCrtComponentsJson = new com.mastercard.mpsdk.card.profile.IccPrivateKeyCrtComponentsJson();
        com.payair.hce.getPan getpan = this.values;
        getackautomaticallyresetbyapplication.writeReplace();
        while (getackautomaticallyresetbyapplication.values()) {
            int AlternateContactlessPaymentDataJson = getpan.AlternateContactlessPaymentDataJson(getackautomaticallyresetbyapplication);
            boolean z = getackautomaticallyresetbyapplication.getProfileVersion() != com.payair.hce.getAckPreEntryAllowed.NULL;
            if (AlternateContactlessPaymentDataJson != 7) {
                if (AlternateContactlessPaymentDataJson != 20) {
                    if (AlternateContactlessPaymentDataJson != 58) {
                        if (AlternateContactlessPaymentDataJson != 79) {
                            if (AlternateContactlessPaymentDataJson != 90) {
                                getackautomaticallyresetbyapplication.getCvrMaskAnd();
                            } else if (z) {
                                iccPrivateKeyCrtComponentsJson.dq = getackautomaticallyresetbyapplication.getProfileVersion() != com.payair.hce.getAckPreEntryAllowed.BOOLEAN ? getackautomaticallyresetbyapplication.getAid() : java.lang.Boolean.toString(getackautomaticallyresetbyapplication.IccPrivateKeyCrtComponentsJson());
                            } else {
                                iccPrivateKeyCrtComponentsJson.dq = null;
                                getackautomaticallyresetbyapplication.RecordsJson();
                            }
                        } else if (z) {
                            iccPrivateKeyCrtComponentsJson.q = getackautomaticallyresetbyapplication.getProfileVersion() != com.payair.hce.getAckPreEntryAllowed.BOOLEAN ? getackautomaticallyresetbyapplication.getAid() : java.lang.Boolean.toString(getackautomaticallyresetbyapplication.IccPrivateKeyCrtComponentsJson());
                        } else {
                            iccPrivateKeyCrtComponentsJson.q = null;
                            getackautomaticallyresetbyapplication.RecordsJson();
                        }
                    } else if (z) {
                        iccPrivateKeyCrtComponentsJson.u = getackautomaticallyresetbyapplication.getProfileVersion() != com.payair.hce.getAckPreEntryAllowed.BOOLEAN ? getackautomaticallyresetbyapplication.getAid() : java.lang.Boolean.toString(getackautomaticallyresetbyapplication.IccPrivateKeyCrtComponentsJson());
                    } else {
                        iccPrivateKeyCrtComponentsJson.u = null;
                        getackautomaticallyresetbyapplication.RecordsJson();
                    }
                } else if (z) {
                    iccPrivateKeyCrtComponentsJson.dp = getackautomaticallyresetbyapplication.getProfileVersion() != com.payair.hce.getAckPreEntryAllowed.BOOLEAN ? getackautomaticallyresetbyapplication.getAid() : java.lang.Boolean.toString(getackautomaticallyresetbyapplication.IccPrivateKeyCrtComponentsJson());
                } else {
                    iccPrivateKeyCrtComponentsJson.dp = null;
                    getackautomaticallyresetbyapplication.RecordsJson();
                }
            } else if (z) {
                iccPrivateKeyCrtComponentsJson.p = getackautomaticallyresetbyapplication.getProfileVersion() != com.payair.hce.getAckPreEntryAllowed.BOOLEAN ? getackautomaticallyresetbyapplication.getAid() : java.lang.Boolean.toString(getackautomaticallyresetbyapplication.IccPrivateKeyCrtComponentsJson());
            } else {
                iccPrivateKeyCrtComponentsJson.p = null;
                getackautomaticallyresetbyapplication.RecordsJson();
            }
        }
        getackautomaticallyresetbyapplication.DigitizedCardProfile();
        return iccPrivateKeyCrtComponentsJson;
    }
}
