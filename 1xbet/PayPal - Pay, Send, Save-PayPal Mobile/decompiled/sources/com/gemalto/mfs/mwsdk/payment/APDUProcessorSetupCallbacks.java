package com.gemalto.mfs.mwsdk.payment;

/* loaded from: classes8.dex */
public interface APDUProcessorSetupCallbacks {
    boolean setupCardActivation();

    com.gemalto.mfs.mwsdk.payment.PaymentServiceListener setupListener();

    void setupPluginRegistration();
}
