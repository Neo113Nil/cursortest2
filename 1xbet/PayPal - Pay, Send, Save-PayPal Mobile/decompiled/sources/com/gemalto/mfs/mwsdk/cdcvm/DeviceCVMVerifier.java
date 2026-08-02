package com.gemalto.mfs.mwsdk.cdcvm;

/* loaded from: classes8.dex */
public interface DeviceCVMVerifier {
    void confirmCredential(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2);

    void onDelegatedAuthCancelled();

    void onDelegatedAuthPerformed(long j);

    void setCVMType(com.gemalto.mfs.mwsdk.payment.CVMType cVMType);

    void setDeviceCVMVerifyListener(com.gemalto.mfs.mwsdk.cdcvm.DeviceCVMVerifyListener deviceCVMVerifyListener);

    void setKeyguardActivity(android.app.Activity activity);

    void setKeyguardActivity(android.app.Activity activity, java.lang.Class cls);

    @util.h.xy.a.a
    void startAuthentication(com.gemalto.mfs.mwsdk.cdcvm.DeviceCVMVerifierInput deviceCVMVerifierInput);
}
