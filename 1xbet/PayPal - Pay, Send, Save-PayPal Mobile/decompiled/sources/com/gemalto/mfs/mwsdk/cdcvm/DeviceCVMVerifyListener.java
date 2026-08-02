package com.gemalto.mfs.mwsdk.cdcvm;

/* loaded from: classes8.dex */
public interface DeviceCVMVerifyListener {
    void onVerifyError(com.gemalto.mfs.mwsdk.sdkconfig.SDKError<java.lang.Integer> sDKError);

    void onVerifyFailed();

    void onVerifyHelp(int i, java.lang.CharSequence charSequence);

    void onVerifySuccess();
}
