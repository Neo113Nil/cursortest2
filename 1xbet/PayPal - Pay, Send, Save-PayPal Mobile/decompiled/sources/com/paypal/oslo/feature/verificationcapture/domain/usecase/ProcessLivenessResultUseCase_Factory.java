package com.paypal.oslo.feature.verificationcapture.domain.usecase;

/* loaded from: classes15.dex */
public final class ProcessLivenessResultUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.verificationcapture.domain.usecase.ProcessLivenessResultUseCase> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.verificationcapture.domain.usecase.ProcessLivenessResultUseCase get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.verificationcapture.domain.usecase.ProcessLivenessResultUseCase_Factory create() {
        return com.paypal.oslo.feature.verificationcapture.domain.usecase.ProcessLivenessResultUseCase_Factory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static com.paypal.oslo.feature.verificationcapture.domain.usecase.ProcessLivenessResultUseCase newInstance() {
        return new com.paypal.oslo.feature.verificationcapture.domain.usecase.ProcessLivenessResultUseCase();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.verificationcapture.domain.usecase.ProcessLivenessResultUseCase_Factory getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.verificationcapture.domain.usecase.ProcessLivenessResultUseCase_Factory();

        private InstanceHolder() {
        }
    }
}
