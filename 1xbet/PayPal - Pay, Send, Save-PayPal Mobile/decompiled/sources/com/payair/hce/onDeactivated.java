package com.payair.hce;

/* loaded from: classes4.dex */
public final class onDeactivated extends com.payair.hce.getMagstripeCvmIssuerOptions implements com.payair.hce.CardAlternateContactlessPaymentDataJson {
    private com.payair.hce.getPan AlternateContactlessPaymentDataJson;
    private com.payair.hce.getTrack2Equivalent valueOf;
    private com.payair.hce.IccPrivateKeyCrtComponentsJson writeReplace;

    public onDeactivated(com.payair.hce.IccPrivateKeyCrtComponentsJson iccPrivateKeyCrtComponentsJson, com.payair.hce.getPan getpan, com.payair.hce.getTrack2Equivalent gettrack2equivalent) {
        this.writeReplace = iccPrivateKeyCrtComponentsJson;
        this.AlternateContactlessPaymentDataJson = getpan;
        this.valueOf = gettrack2equivalent;
    }

    @Override // com.payair.hce.getMagstripeCvmIssuerOptions
    public final void writeReplace(com.payair.hce.getRemotePaymentData getremotepaymentdata, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            getremotepaymentdata.writeReplace();
            return;
        }
        com.mastercard.mpsdk.card.profile.RecordsJson recordsJson = (com.mastercard.mpsdk.card.profile.RecordsJson) obj;
        com.payair.hce.getTrack2Equivalent gettrack2equivalent = this.valueOf;
        getremotepaymentdata.AlternateContactlessPaymentDataJson();
        gettrack2equivalent.writeReplace(getremotepaymentdata, 90);
        getremotepaymentdata.writeReplace(java.lang.Integer.valueOf(recordsJson.recordNumber));
        if (recordsJson != recordsJson.sfi) {
            gettrack2equivalent.writeReplace(getremotepaymentdata, 17);
            getremotepaymentdata.DigitizedCardProfile(recordsJson.sfi);
        }
        if (recordsJson != recordsJson.recordValue) {
            gettrack2equivalent.writeReplace(getremotepaymentdata, 34);
            getremotepaymentdata.DigitizedCardProfile(recordsJson.recordValue);
        }
        getremotepaymentdata.values();
    }

    @Override // com.payair.hce.getMagstripeCvmIssuerOptions
    public final java.lang.Object AlternateContactlessPaymentDataJson(com.payair.hce.getAckAutomaticallyResetByApplication getackautomaticallyresetbyapplication) throws java.io.IOException {
        if (getackautomaticallyresetbyapplication.getProfileVersion() == com.payair.hce.getAckPreEntryAllowed.NULL) {
            getackautomaticallyresetbyapplication.getCvrMaskAnd();
            return null;
        }
        com.mastercard.mpsdk.card.profile.RecordsJson recordsJson = new com.mastercard.mpsdk.card.profile.RecordsJson();
        com.payair.hce.getPan getpan = this.AlternateContactlessPaymentDataJson;
        getackautomaticallyresetbyapplication.writeReplace();
        while (getackautomaticallyresetbyapplication.values()) {
            int AlternateContactlessPaymentDataJson = getpan.AlternateContactlessPaymentDataJson(getackautomaticallyresetbyapplication);
            boolean z = getackautomaticallyresetbyapplication.getProfileVersion() != com.payair.hce.getAckPreEntryAllowed.NULL;
            if (AlternateContactlessPaymentDataJson != 55) {
                if (AlternateContactlessPaymentDataJson != 74) {
                    if (AlternateContactlessPaymentDataJson != 88) {
                        getackautomaticallyresetbyapplication.getCvrMaskAnd();
                    } else if (z) {
                        recordsJson.sfi = getackautomaticallyresetbyapplication.getProfileVersion() != com.payair.hce.getAckPreEntryAllowed.BOOLEAN ? getackautomaticallyresetbyapplication.getAid() : java.lang.Boolean.toString(getackautomaticallyresetbyapplication.IccPrivateKeyCrtComponentsJson());
                    } else {
                        recordsJson.sfi = null;
                        getackautomaticallyresetbyapplication.RecordsJson();
                    }
                } else if (z) {
                    recordsJson.recordValue = getackautomaticallyresetbyapplication.getProfileVersion() != com.payair.hce.getAckPreEntryAllowed.BOOLEAN ? getackautomaticallyresetbyapplication.getAid() : java.lang.Boolean.toString(getackautomaticallyresetbyapplication.IccPrivateKeyCrtComponentsJson());
                } else {
                    recordsJson.recordValue = null;
                    getackautomaticallyresetbyapplication.RecordsJson();
                }
            } else if (z) {
                try {
                    recordsJson.recordNumber = getackautomaticallyresetbyapplication.getCiacDecline();
                } catch (java.lang.NumberFormatException e) {
                    throw new com.payair.hce.getDualTapResetTimeout(e);
                }
            } else {
                getackautomaticallyresetbyapplication.RecordsJson();
            }
        }
        getackautomaticallyresetbyapplication.DigitizedCardProfile();
        return recordsJson;
    }
}
