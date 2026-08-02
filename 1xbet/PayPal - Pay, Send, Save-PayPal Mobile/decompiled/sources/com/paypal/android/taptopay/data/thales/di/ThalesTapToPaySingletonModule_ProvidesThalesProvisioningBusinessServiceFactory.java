package com.paypal.android.taptopay.data.thales.di;

/* loaded from: classes10.dex */
public final class ThalesTapToPaySingletonModule_ProvidesThalesProvisioningBusinessServiceFactory implements dagger.internal.Factory<com.gemalto.mfs.mwsdk.provisioning.sdkconfig.ProvisioningBusinessService> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.gemalto.mfs.mwsdk.provisioning.sdkconfig.ProvisioningBusinessService get() {
        return providesThalesProvisioningBusinessService();
    }

    public static com.paypal.android.taptopay.data.thales.di.ThalesTapToPaySingletonModule_ProvidesThalesProvisioningBusinessServiceFactory create() {
        return com.paypal.android.taptopay.data.thales.di.ThalesTapToPaySingletonModule_ProvidesThalesProvisioningBusinessServiceFactory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.gemalto.mfs.mwsdk.provisioning.sdkconfig.ProvisioningBusinessService providesThalesProvisioningBusinessService() {
        return (com.gemalto.mfs.mwsdk.provisioning.sdkconfig.ProvisioningBusinessService) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.android.taptopay.data.thales.di.ThalesTapToPaySingletonModule.INSTANCE.providesThalesProvisioningBusinessService());
    }

    static final class InstanceHolder {
        private static final com.paypal.android.taptopay.data.thales.di.ThalesTapToPaySingletonModule_ProvidesThalesProvisioningBusinessServiceFactory Camera2StreamConfigurationMap = new com.paypal.android.taptopay.data.thales.di.ThalesTapToPaySingletonModule_ProvidesThalesProvisioningBusinessServiceFactory();

        private InstanceHolder() {
        }
    }
}
