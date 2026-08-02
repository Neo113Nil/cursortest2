package com.payair.hce;

/* loaded from: classes4.dex */
public class initializeVisaPaymentSdk extends com.payair.hce.NullActivityException {
    public initializeVisaPaymentSdk(byte[] bArr) {
        super(bArr);
    }

    public final /* synthetic */ void DigitizedCardProfile(com.payair.hce.IccPrivateKeyCrtComponentsJson iccPrivateKeyCrtComponentsJson, com.payair.hce.getRemotePaymentData getremotepaymentdata, com.payair.hce.getTrack2Equivalent gettrack2equivalent) {
        getremotepaymentdata.AlternateContactlessPaymentDataJson();
        writeReplace(iccPrivateKeyCrtComponentsJson, getremotepaymentdata, gettrack2equivalent);
        getremotepaymentdata.values();
    }

    public final /* synthetic */ void AlternateContactlessPaymentDataJson(com.payair.hce.IccPrivateKeyCrtComponentsJson iccPrivateKeyCrtComponentsJson, com.payair.hce.getAckAutomaticallyResetByApplication getackautomaticallyresetbyapplication, com.payair.hce.getPan getpan) {
        getackautomaticallyresetbyapplication.writeReplace();
        while (getackautomaticallyresetbyapplication.values()) {
            AlternateContactlessPaymentDataJson(iccPrivateKeyCrtComponentsJson, getackautomaticallyresetbyapplication, getpan.AlternateContactlessPaymentDataJson(getackautomaticallyresetbyapplication));
        }
        getackautomaticallyresetbyapplication.DigitizedCardProfile();
    }

    public /* synthetic */ initializeVisaPaymentSdk() {
    }
}
