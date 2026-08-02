package com.gemalto.mfs.mwsdk.mobilegateway.enrollment;

/* loaded from: classes3.dex */
public interface PendingCardActivation {
    void activate(int i, com.gemalto.mfs.mwsdk.mobilegateway.listener.MGDigitizationListener mGDigitizationListener);

    void activate(com.gemalto.mfs.mwsdk.mobilegateway.listener.MGDigitizationListener mGDigitizationListener);

    void activate(byte[] bArr, com.gemalto.mfs.mwsdk.mobilegateway.listener.MGDigitizationListener mGDigitizationListener);

    void activateWithTav(byte[] bArr, com.gemalto.mfs.mwsdk.mobilegateway.listener.MGDigitizationListener mGDigitizationListener);

    com.gemalto.mfs.mwsdk.mobilegateway.enrollment.AppToAppData getAppToAppData();

    com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardArt getCardArt();

    com.gemalto.mfs.mwsdk.mobilegateway.enrollment.PendingCardActivationState getState();

    com.gemalto.mfs.mwsdk.mobilegateway.enrollment.ThreeDSecure getThreeDSecure();

    void invokeIdvSelection(com.gemalto.mfs.mwsdk.mobilegateway.listener.MGDigitizationListener mGDigitizationListener);
}
