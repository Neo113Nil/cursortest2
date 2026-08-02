package com.gemalto.mfs.mwsdk.utils.chcodeverifier;

/* loaded from: classes8.dex */
public interface CHCodeVerifierListener {
    void maxRetryReached();

    void onVerificationError(int i, com.gemalto.mfs.mwsdk.sdkconfig.SDKError<com.gemalto.mfs.mwsdk.utils.chcodeverifier.CHCodeVerifierErrorCode> sDKError);

    void onVerificationSuccess();
}
