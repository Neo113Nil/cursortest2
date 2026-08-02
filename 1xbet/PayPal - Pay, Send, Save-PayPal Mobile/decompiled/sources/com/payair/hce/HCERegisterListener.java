package com.payair.hce;

/* loaded from: classes4.dex */
public interface HCERegisterListener {
    void onDeviceAuthenticationUnsuccessful();

    void onGeneratePublicKeyUnsuccessful();

    void onGetCertOperationUnsuccessful(com.payair.hce.communication.JsonResponse jsonResponse);

    void onGetCertOperationUnsuccessful(java.lang.Integer num);

    void onRegisterOperationUnsuccessful(com.payair.hce.communication.JsonResponse jsonResponse);

    void onRegisterOperationUnsuccessful(java.lang.Integer num);

    void onRegistrationCompleted();
}
