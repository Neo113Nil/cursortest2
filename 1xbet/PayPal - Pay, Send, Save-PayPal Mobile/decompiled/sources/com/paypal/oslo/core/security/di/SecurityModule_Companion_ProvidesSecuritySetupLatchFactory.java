package com.paypal.oslo.core.security.di;

/* loaded from: classes5.dex */
public final class SecurityModule_Companion_ProvidesSecuritySetupLatchFactory implements dagger.internal.Factory<java.util.concurrent.CountDownLatch> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.util.concurrent.CountDownLatch get() {
        return providesSecuritySetupLatch();
    }

    public static com.paypal.oslo.core.security.di.SecurityModule_Companion_ProvidesSecuritySetupLatchFactory create() {
        return com.paypal.oslo.core.security.di.SecurityModule_Companion_ProvidesSecuritySetupLatchFactory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static java.util.concurrent.CountDownLatch providesSecuritySetupLatch() {
        return (java.util.concurrent.CountDownLatch) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.core.security.di.SecurityModule.INSTANCE.providesSecuritySetupLatch());
    }

    /* loaded from: classes10.dex */
    static final class InstanceHolder {
        static final com.paypal.oslo.core.security.di.SecurityModule_Companion_ProvidesSecuritySetupLatchFactory Camera2StreamConfigurationMap = new com.paypal.oslo.core.security.di.SecurityModule_Companion_ProvidesSecuritySetupLatchFactory();

        private InstanceHolder() {
        }
    }
}
