package com.gemalto.mfs.mwsdk.provisioning.listener;

/* loaded from: classes8.dex */
public interface WalletSecureEnrollmentListener {
    void onError(com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentError walletSecureEnrollmentError);

    void onProgressUpdate(com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentState walletSecureEnrollmentState);
}
