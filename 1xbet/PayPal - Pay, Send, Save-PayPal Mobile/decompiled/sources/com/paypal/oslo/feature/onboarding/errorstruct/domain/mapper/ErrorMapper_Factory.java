package com.paypal.oslo.feature.onboarding.errorstruct.domain.mapper;

/* loaded from: classes13.dex */
public final class ErrorMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.onboarding.errorstruct.domain.mapper.ErrorMapper> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.onboarding.errorstruct.domain.mapper.ErrorMapper get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.onboarding.errorstruct.domain.mapper.ErrorMapper_Factory create() {
        return com.paypal.oslo.feature.onboarding.errorstruct.domain.mapper.ErrorMapper_Factory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static com.paypal.oslo.feature.onboarding.errorstruct.domain.mapper.ErrorMapper newInstance() {
        return new com.paypal.oslo.feature.onboarding.errorstruct.domain.mapper.ErrorMapper();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.onboarding.errorstruct.domain.mapper.ErrorMapper_Factory getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.onboarding.errorstruct.domain.mapper.ErrorMapper_Factory();

        private InstanceHolder() {
        }
    }
}
