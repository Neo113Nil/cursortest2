package com.paypal.oslo.feature.onboarding.signup.swg.data;

/* loaded from: classes13.dex */
public final class GoogleTokenCheckerImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.onboarding.signup.swg.data.GoogleTokenCheckerImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.swg.domain.repository.SwgCredentialRepository> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.swg.data.mapper.GoogleTokenCheckErrorMapper> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.swg.data.mapper.GoogleTokenCheckSuccessMapper> getHighSpeedVideoFpsRanges;

    private GoogleTokenCheckerImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.swg.domain.repository.SwgCredentialRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.swg.data.mapper.GoogleTokenCheckSuccessMapper> provider2, dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.swg.data.mapper.GoogleTokenCheckErrorMapper> provider3) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.onboarding.signup.swg.data.GoogleTokenCheckerImpl get() {
        return newInstance(dagger.internal.DoubleCheck.lazy((dagger.internal.Provider) this.Camera2StreamConfigurationMap), this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.onboarding.signup.swg.data.GoogleTokenCheckerImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.swg.domain.repository.SwgCredentialRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.swg.data.mapper.GoogleTokenCheckSuccessMapper> provider2, dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.swg.data.mapper.GoogleTokenCheckErrorMapper> provider3) {
        return new com.paypal.oslo.feature.onboarding.signup.swg.data.GoogleTokenCheckerImpl_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.onboarding.signup.swg.data.GoogleTokenCheckerImpl newInstance(dagger.Lazy<com.paypal.oslo.feature.onboarding.signup.swg.domain.repository.SwgCredentialRepository> lazy, com.paypal.oslo.feature.onboarding.signup.swg.data.mapper.GoogleTokenCheckSuccessMapper googleTokenCheckSuccessMapper, com.paypal.oslo.feature.onboarding.signup.swg.data.mapper.GoogleTokenCheckErrorMapper googleTokenCheckErrorMapper) {
        return new com.paypal.oslo.feature.onboarding.signup.swg.data.GoogleTokenCheckerImpl(lazy, googleTokenCheckSuccessMapper, googleTokenCheckErrorMapper);
    }
}
