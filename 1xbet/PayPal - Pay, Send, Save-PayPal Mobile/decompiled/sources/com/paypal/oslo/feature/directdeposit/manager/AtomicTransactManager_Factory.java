package com.paypal.oslo.feature.directdeposit.manager;

/* loaded from: classes12.dex */
public final class AtomicTransactManager_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.directdeposit.manager.AtomicTransactManager> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.directdeposit.manager.AtomicTransactManager get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.directdeposit.manager.AtomicTransactManager_Factory create() {
        return com.paypal.oslo.feature.directdeposit.manager.AtomicTransactManager_Factory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.feature.directdeposit.manager.AtomicTransactManager newInstance() {
        return new com.paypal.oslo.feature.directdeposit.manager.AtomicTransactManager();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.directdeposit.manager.AtomicTransactManager_Factory getHighSpeedVideoSizes = new com.paypal.oslo.feature.directdeposit.manager.AtomicTransactManager_Factory();

        private InstanceHolder() {
        }
    }
}
