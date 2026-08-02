package com.gemalto.mfs.mwsdk.sdkconfig;

/* loaded from: classes3.dex */
public interface SDKControllerListener {
    void onError(com.gemalto.mfs.mwsdk.sdkconfig.SDKError<com.gemalto.mfs.mwsdk.sdkconfig.SDKInitializeErrorCode> sDKError);

    void onSetupComplete();

    void onSetupProgress(com.gemalto.mfs.mwsdk.sdkconfig.SDKSetupProgressState sDKSetupProgressState, java.lang.String str);
}
