package com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories;

/* loaded from: classes12.dex */
public final class BnplItemFactory_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.BnplItemFactory> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.BnplItemFactory get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.BnplItemFactory_Factory create() {
        return com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.BnplItemFactory_Factory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.BnplItemFactory newInstance() {
        return new com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.BnplItemFactory();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.BnplItemFactory_Factory getHighSpeedVideoSizes = new com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.BnplItemFactory_Factory();

        private InstanceHolder() {
        }
    }
}
