package com.paypal.oslo.core.appidentity.data;

/* loaded from: classes10.dex */
public final class DeviceInformationProvider_Factory implements dagger.internal.Factory<com.paypal.oslo.core.appidentity.data.DeviceInformationProvider> {
    private final dagger.internal.Provider<android.content.Context> getHighSpeedVideoSizes;

    private DeviceInformationProvider_Factory(dagger.internal.Provider<android.content.Context> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.appidentity.data.DeviceInformationProvider get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.core.appidentity.data.DeviceInformationProvider_Factory create(dagger.internal.Provider<android.content.Context> provider) {
        return new com.paypal.oslo.core.appidentity.data.DeviceInformationProvider_Factory(provider);
    }

    public static com.paypal.oslo.core.appidentity.data.DeviceInformationProvider newInstance(android.content.Context context) {
        return new com.paypal.oslo.core.appidentity.data.DeviceInformationProvider(context);
    }
}
