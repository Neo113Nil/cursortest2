package com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories;

/* loaded from: classes12.dex */
public final class BnplEmptyStateItemFactory_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.BnplEmptyStateItemFactory> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.BnplEmptyStateItemFactory get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.BnplEmptyStateItemFactory_Factory create() {
        return com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.BnplEmptyStateItemFactory_Factory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.BnplEmptyStateItemFactory newInstance() {
        return new com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.BnplEmptyStateItemFactory();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.BnplEmptyStateItemFactory_Factory getHighSpeedVideoSizes = new com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.BnplEmptyStateItemFactory_Factory();

        private InstanceHolder() {
        }
    }
}
