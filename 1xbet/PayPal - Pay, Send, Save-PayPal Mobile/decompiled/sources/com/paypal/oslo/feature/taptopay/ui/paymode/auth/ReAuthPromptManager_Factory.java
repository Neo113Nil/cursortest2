package com.paypal.oslo.feature.taptopay.ui.paymode.auth;

/* loaded from: classes15.dex */
public final class ReAuthPromptManager_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager_Factory create() {
        return com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager_Factory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager newInstance() {
        return new com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager_Factory getHighSpeedVideoSizes = new com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager_Factory();

        private InstanceHolder() {
        }
    }
}
