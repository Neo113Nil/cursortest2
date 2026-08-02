package com.gemalto.mfs.mwsdk.provisioning.listener;

/* loaded from: classes8.dex */
public interface AuthenticationStateListener {
    void onError(com.gemalto.mfs.mwsdk.sdkconfig.SDKError<com.gemalto.mfs.mwsdk.provisioning.model.NeedsAuthenticationErrorCode> sDKError);

    void onSuccess(com.gemalto.mfs.mwsdk.provisioning.model.AuthenticationState authenticationState);
}
