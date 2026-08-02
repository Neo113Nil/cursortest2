package com.gemalto.mfs.mwsdk.provisioning.sdkconfig;

/* loaded from: classes3.dex */
public interface WalletSecureEnrollmentBusinessService extends com.gemalto.mfs.mwsdk.sdkconfig.BusinessService {
    com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentState getState();

    void startWalletSecureEnrollment() throws com.gemalto.mfs.mwsdk.provisioning.exception.WalletSecureEnrollmentException;

    boolean startWalletSecureEnrollment(com.gemalto.mfs.mwsdk.provisioning.listener.WalletSecureEnrollmentListener walletSecureEnrollmentListener);
}
