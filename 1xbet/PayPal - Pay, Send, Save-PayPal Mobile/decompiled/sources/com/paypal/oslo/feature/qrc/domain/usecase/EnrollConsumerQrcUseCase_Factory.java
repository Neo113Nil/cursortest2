package com.paypal.oslo.feature.qrc.domain.usecase;

/* loaded from: classes14.dex */
public final class EnrollConsumerQrcUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.qrc.domain.usecase.EnrollConsumerQrcUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.qrc.domain.repository.EnrollmentRepository> getHighSpeedVideoFpsRanges;

    private EnrollConsumerQrcUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.qrc.domain.repository.EnrollmentRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.qrc.domain.usecase.EnrollConsumerQrcUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.qrc.domain.usecase.EnrollConsumerQrcUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.qrc.domain.repository.EnrollmentRepository> provider) {
        return new com.paypal.oslo.feature.qrc.domain.usecase.EnrollConsumerQrcUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.qrc.domain.usecase.EnrollConsumerQrcUseCase newInstance(com.paypal.oslo.feature.qrc.domain.repository.EnrollmentRepository enrollmentRepository) {
        return new com.paypal.oslo.feature.qrc.domain.usecase.EnrollConsumerQrcUseCase(enrollmentRepository);
    }
}
