package com.paypal.oslo.feature.pushnotification.tokenmanagement.data.provider;

/* loaded from: classes13.dex */
public final class CloudIdentityProviderImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.pushnotification.tokenmanagement.data.provider.CloudIdentityProviderImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.telemetry.vendors.adobe.AdobeProvider> getHighSpeedVideoFpsRangesFor;

    private CloudIdentityProviderImpl_Factory(dagger.internal.Provider<com.paypal.oslo.core.telemetry.vendors.adobe.AdobeProvider> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.pushnotification.tokenmanagement.data.provider.CloudIdentityProviderImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.pushnotification.tokenmanagement.data.provider.CloudIdentityProviderImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.core.telemetry.vendors.adobe.AdobeProvider> provider) {
        return new com.paypal.oslo.feature.pushnotification.tokenmanagement.data.provider.CloudIdentityProviderImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.pushnotification.tokenmanagement.data.provider.CloudIdentityProviderImpl newInstance(com.paypal.oslo.core.telemetry.vendors.adobe.AdobeProvider adobeProvider) {
        return new com.paypal.oslo.feature.pushnotification.tokenmanagement.data.provider.CloudIdentityProviderImpl(adobeProvider);
    }
}
