package com.paypal.oslo.feature.qrc.domain.usecase;

/* loaded from: classes14.dex */
public final class CheckQrcEligibilityUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.qrc.domain.usecase.CheckQrcEligibilityUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.qrc.domain.repository.EnrollmentRepository> getHighSpeedVideoFpsRangesFor;

    private CheckQrcEligibilityUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.qrc.domain.repository.EnrollmentRepository> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.qrc.domain.usecase.CheckQrcEligibilityUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.qrc.domain.usecase.CheckQrcEligibilityUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.qrc.domain.repository.EnrollmentRepository> provider) {
        return new com.paypal.oslo.feature.qrc.domain.usecase.CheckQrcEligibilityUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.qrc.domain.usecase.CheckQrcEligibilityUseCase newInstance(com.paypal.oslo.feature.qrc.domain.repository.EnrollmentRepository enrollmentRepository) {
        return new com.paypal.oslo.feature.qrc.domain.usecase.CheckQrcEligibilityUseCase(enrollmentRepository);
    }
}
