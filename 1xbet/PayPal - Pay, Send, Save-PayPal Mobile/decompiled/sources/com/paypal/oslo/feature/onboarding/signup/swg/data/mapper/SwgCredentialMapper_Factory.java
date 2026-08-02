package com.paypal.oslo.feature.onboarding.signup.swg.data.mapper;

/* loaded from: classes13.dex */
public final class SwgCredentialMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.onboarding.signup.swg.data.mapper.SwgCredentialMapper> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.onboarding.errorstruct.domain.mapper.ErrorMapper> getHighSpeedVideoFpsRanges;

    private SwgCredentialMapper_Factory(dagger.internal.Provider<com.paypal.oslo.feature.onboarding.errorstruct.domain.mapper.ErrorMapper> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.onboarding.signup.swg.data.mapper.SwgCredentialMapper get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.onboarding.signup.swg.data.mapper.SwgCredentialMapper_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.onboarding.errorstruct.domain.mapper.ErrorMapper> provider) {
        return new com.paypal.oslo.feature.onboarding.signup.swg.data.mapper.SwgCredentialMapper_Factory(provider);
    }

    public static com.paypal.oslo.feature.onboarding.signup.swg.data.mapper.SwgCredentialMapper newInstance(com.paypal.oslo.feature.onboarding.errorstruct.domain.mapper.ErrorMapper errorMapper) {
        return new com.paypal.oslo.feature.onboarding.signup.swg.data.mapper.SwgCredentialMapper(errorMapper);
    }
}
