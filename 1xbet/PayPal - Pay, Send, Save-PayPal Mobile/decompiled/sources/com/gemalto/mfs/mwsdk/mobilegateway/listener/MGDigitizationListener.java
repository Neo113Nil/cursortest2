package com.gemalto.mfs.mwsdk.mobilegateway.listener;

/* loaded from: classes3.dex */
public interface MGDigitizationListener {
    void onActivationRequired(com.gemalto.mfs.mwsdk.mobilegateway.enrollment.PendingCardActivation pendingCardActivation);

    void onCPSActivationCodeAcquired(java.lang.String str, byte[] bArr);

    void onComplete(java.lang.String str);

    void onError(java.lang.String str, com.gemalto.mfs.mwsdk.mobilegateway.MobileGatewayError mobileGatewayError);

    void onSelectIDVMethod(com.gemalto.mfs.mwsdk.mobilegateway.enrollment.IDVMethodSelector iDVMethodSelector);
}
