package com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.usecase;

/* loaded from: classes13.dex */
public final class UpdateAdobePushConsentUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.usecase.UpdateAdobePushConsentUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.provider.PushConsentProvider> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.core.telemetry.vendors.adobe.AdobePushManager> getHighSpeedVideoFpsRangesFor;

    private UpdateAdobePushConsentUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.core.telemetry.vendors.adobe.AdobePushManager> provider, dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.provider.PushConsentProvider> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.usecase.UpdateAdobePushConsentUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.usecase.UpdateAdobePushConsentUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.core.telemetry.vendors.adobe.AdobePushManager> provider, dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.provider.PushConsentProvider> provider2) {
        return new com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.usecase.UpdateAdobePushConsentUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.usecase.UpdateAdobePushConsentUseCase newInstance(com.paypal.oslo.core.telemetry.vendors.adobe.AdobePushManager adobePushManager, com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.provider.PushConsentProvider pushConsentProvider) {
        return new com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.usecase.UpdateAdobePushConsentUseCase(adobePushManager, pushConsentProvider);
    }
}
