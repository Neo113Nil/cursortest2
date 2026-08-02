package com.payair.hce;

/* loaded from: classes4.dex */
public interface VisaRepersoInitializer extends com.payair.hce.copy {
    void initialize(com.payair.hce.onNewToken onnewtoken, com.payair.hce.hashCode hashcode, com.payair.hce.ExpirationDate expirationDate, com.payair.hce.setStatusMessage setstatusmessage, com.payair.hce.updateRNSInformation updaternsinformation, com.payair.hce.copydefault copydefaultVar);

    void processNotificationData(java.lang.String str) throws com.payair.hce.VisaReperso;

    java.lang.String requestDeleteCard(java.lang.String str, com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus[] singleUseKeyStatusArr);

    java.lang.String requestReplenish(java.lang.String str, com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus[] singleUseKeyStatusArr);
}
