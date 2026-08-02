package com.paypal.oslo.feature.onboarding.signup.data.mapper;

/* loaded from: classes13.dex */
public final class ConfirmationMapperImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.onboarding.signup.data.mapper.ConfirmationMapperImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.onboarding.errorstruct.domain.mapper.ErrorMapper> Camera2StreamConfigurationMap;

    private ConfirmationMapperImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.onboarding.errorstruct.domain.mapper.ErrorMapper> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.onboarding.signup.data.mapper.ConfirmationMapperImpl get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.onboarding.signup.data.mapper.ConfirmationMapperImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.onboarding.errorstruct.domain.mapper.ErrorMapper> provider) {
        return new com.paypal.oslo.feature.onboarding.signup.data.mapper.ConfirmationMapperImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.onboarding.signup.data.mapper.ConfirmationMapperImpl newInstance(com.paypal.oslo.feature.onboarding.errorstruct.domain.mapper.ErrorMapper errorMapper) {
        return new com.paypal.oslo.feature.onboarding.signup.data.mapper.ConfirmationMapperImpl(errorMapper);
    }
}
