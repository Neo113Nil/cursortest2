package com.paypal.oslo.core.appidentity.data;

/* loaded from: classes10.dex */
public final class AppGuidProviderImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.core.appidentity.data.AppGuidProviderImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.appidentity.data.AppGUID> Camera2StreamConfigurationMap;

    private AppGuidProviderImpl_Factory(dagger.internal.Provider<com.paypal.oslo.core.appidentity.data.AppGUID> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.appidentity.data.AppGuidProviderImpl get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.core.appidentity.data.AppGuidProviderImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.core.appidentity.data.AppGUID> provider) {
        return new com.paypal.oslo.core.appidentity.data.AppGuidProviderImpl_Factory(provider);
    }

    public static com.paypal.oslo.core.appidentity.data.AppGuidProviderImpl newInstance(com.paypal.oslo.core.appidentity.data.AppGUID appGUID) {
        return new com.paypal.oslo.core.appidentity.data.AppGuidProviderImpl(appGUID);
    }
}
