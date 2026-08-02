package com.paypal.oslo.feature.contacts.data.remoteconfig;

/* loaded from: classes12.dex */
public final class ContactsFeatureGateManagerImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.contacts.data.remoteconfig.ContactsFeatureGateManagerImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> getHighSpeedVideoSizes;

    private ContactsFeatureGateManagerImpl_Factory(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.contacts.data.remoteconfig.ContactsFeatureGateManagerImpl get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.contacts.data.remoteconfig.ContactsFeatureGateManagerImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider) {
        return new com.paypal.oslo.feature.contacts.data.remoteconfig.ContactsFeatureGateManagerImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.contacts.data.remoteconfig.ContactsFeatureGateManagerImpl newInstance(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate) {
        return new com.paypal.oslo.feature.contacts.data.remoteconfig.ContactsFeatureGateManagerImpl(featureGate);
    }
}
