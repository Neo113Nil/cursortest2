package com.paypal.oslo.feature.businesshome.data.repository.mock;

/* loaded from: classes11.dex */
public final class DemoAccountSetupRepository_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.businesshome.data.repository.mock.DemoAccountSetupRepository> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.businesshome.data.repository.mock.DemoAccountSetupRepository get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.businesshome.data.repository.mock.DemoAccountSetupRepository_Factory create() {
        return com.paypal.oslo.feature.businesshome.data.repository.mock.DemoAccountSetupRepository_Factory.InstanceHolder.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static com.paypal.oslo.feature.businesshome.data.repository.mock.DemoAccountSetupRepository newInstance() {
        return new com.paypal.oslo.feature.businesshome.data.repository.mock.DemoAccountSetupRepository();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.businesshome.data.repository.mock.DemoAccountSetupRepository_Factory getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.feature.businesshome.data.repository.mock.DemoAccountSetupRepository_Factory();

        private InstanceHolder() {
        }
    }
}
