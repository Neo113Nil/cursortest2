package com.paypal.oslo.core.appidentity.data;

/* loaded from: classes10.dex */
public final class AppInformationProvider_Factory implements dagger.internal.Factory<com.paypal.oslo.core.appidentity.data.AppInformationProvider> {
    private final dagger.internal.Provider<com.paypal.oslo.core.appidentity.data.SessionReader> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.core.appidentity.data.SessionReader> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<android.content.Context> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.core.appidentity.data.AppGUID> getHighSpeedVideoSizes;

    private AppInformationProvider_Factory(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<com.paypal.oslo.core.appidentity.data.AppGUID> provider2, dagger.internal.Provider<com.paypal.oslo.core.appidentity.data.SessionReader> provider3, dagger.internal.Provider<com.paypal.oslo.core.appidentity.data.SessionReader> provider4) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.Camera2StreamConfigurationMap = provider3;
        this.getHighResolutionOutputSizeshNQ4ISI = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.appidentity.data.AppInformationProvider get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.core.appidentity.data.AppInformationProvider_Factory create(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<com.paypal.oslo.core.appidentity.data.AppGUID> provider2, dagger.internal.Provider<com.paypal.oslo.core.appidentity.data.SessionReader> provider3, dagger.internal.Provider<com.paypal.oslo.core.appidentity.data.SessionReader> provider4) {
        return new com.paypal.oslo.core.appidentity.data.AppInformationProvider_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.core.appidentity.data.AppInformationProvider newInstance(android.content.Context context, com.paypal.oslo.core.appidentity.data.AppGUID appGUID, com.paypal.oslo.core.appidentity.data.SessionReader sessionReader, com.paypal.oslo.core.appidentity.data.SessionReader sessionReader2) {
        return new com.paypal.oslo.core.appidentity.data.AppInformationProvider(context, appGUID, sessionReader, sessionReader2);
    }
}
