package com.gemalto.mfs.mwsdk.provisioning.listener;

/* loaded from: classes3.dex */
public interface EnrollingServiceListener {
    void onCodeRequired(com.gemalto.mfs.mwsdk.utils.chcodeverifier.CHCodeVerifier cHCodeVerifier);

    void onComplete();

    void onError(com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError provisioningServiceError);

    void onStarted();
}
