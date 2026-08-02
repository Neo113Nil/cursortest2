package com.paypal.oslo.feature.qrc.ui.enrollment;

/* loaded from: classes14.dex */
public final class EnrollmentViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.qrc.domain.usecase.CheckQrcEligibilityUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentReducer> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.qrc.domain.usecase.EnrollConsumerQrcUseCase> getHighSpeedVideoFpsRanges;

    private EnrollmentViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.qrc.domain.usecase.CheckQrcEligibilityUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.qrc.domain.usecase.EnrollConsumerQrcUseCase> provider3) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentViewModel get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.qrc.domain.usecase.CheckQrcEligibilityUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.qrc.domain.usecase.EnrollConsumerQrcUseCase> provider3) {
        return new com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentViewModel_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentViewModel newInstance(com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentReducer enrollmentReducer, com.paypal.oslo.feature.qrc.domain.usecase.CheckQrcEligibilityUseCase checkQrcEligibilityUseCase, com.paypal.oslo.feature.qrc.domain.usecase.EnrollConsumerQrcUseCase enrollConsumerQrcUseCase) {
        return new com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentViewModel(enrollmentReducer, checkQrcEligibilityUseCase, enrollConsumerQrcUseCase);
    }
}
