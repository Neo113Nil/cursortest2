package com.gemalto.mfs.mwsdk.provisioning.sdkconfig;

/* loaded from: classes3.dex */
public interface ReplenishmentPrepService {
    com.gemalto.mfs.mwsdk.cdcvm.DeviceCVMVerifier getDeviceCVMVerifier();

    void needsAuthentication(com.gemalto.mfs.mwsdk.provisioning.listener.AuthenticationStateListener authenticationStateListener);

    void needsAuthentication(com.gemalto.mfs.mwsdk.provisioning.listener.AuthenticationStateListener authenticationStateListener, java.lang.String str);

    void prepareForReplenishment(com.gemalto.mfs.mwsdk.provisioning.listener.ReplenishmentPrepListener replenishmentPrepListener);
}
