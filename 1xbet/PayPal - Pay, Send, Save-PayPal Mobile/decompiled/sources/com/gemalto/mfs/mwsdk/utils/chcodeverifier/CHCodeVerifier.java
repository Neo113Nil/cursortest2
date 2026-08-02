package com.gemalto.mfs.mwsdk.utils.chcodeverifier;

/* loaded from: classes3.dex */
public interface CHCodeVerifier {
    com.gemalto.mfs.mwsdk.utils.chcodeverifier.SecureCodeInputer getSecureCodeInputer();

    void inputCode(java.lang.String str);

    void setCHCodeVerifierListener(com.gemalto.mfs.mwsdk.utils.chcodeverifier.CHCodeVerifierListener cHCodeVerifierListener);

    void setCVMType(com.gemalto.mfs.mwsdk.payment.CVMType cVMType);
}
