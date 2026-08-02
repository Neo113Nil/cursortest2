package com.paypal.oslo.feature.taptopay.di;

/* loaded from: classes15.dex */
public final class ReAuthModule_ProvideReAuthPromptManagerFactory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager get() {
        return provideReAuthPromptManager();
    }

    public static com.paypal.oslo.feature.taptopay.di.ReAuthModule_ProvideReAuthPromptManagerFactory create() {
        return com.paypal.oslo.feature.taptopay.di.ReAuthModule_ProvideReAuthPromptManagerFactory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager provideReAuthPromptManager() {
        return (com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.taptopay.di.ReAuthModule.INSTANCE.provideReAuthPromptManager());
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.taptopay.di.ReAuthModule_ProvideReAuthPromptManagerFactory getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.taptopay.di.ReAuthModule_ProvideReAuthPromptManagerFactory();

        private InstanceHolder() {
        }
    }
}
