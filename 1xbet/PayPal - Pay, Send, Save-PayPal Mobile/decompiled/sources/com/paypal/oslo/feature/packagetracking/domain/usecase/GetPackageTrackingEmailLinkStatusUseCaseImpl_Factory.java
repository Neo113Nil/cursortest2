package com.paypal.oslo.feature.packagetracking.domain.usecase;

/* loaded from: classes13.dex */
public final class GetPackageTrackingEmailLinkStatusUseCaseImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.packagetracking.domain.usecase.GetPackageTrackingEmailLinkStatusUseCaseImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.usecase.GetEmailLinkStatusUseCase> Camera2StreamConfigurationMap;

    private GetPackageTrackingEmailLinkStatusUseCaseImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.usecase.GetEmailLinkStatusUseCase> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.packagetracking.domain.usecase.GetPackageTrackingEmailLinkStatusUseCaseImpl get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.packagetracking.domain.usecase.GetPackageTrackingEmailLinkStatusUseCaseImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.usecase.GetEmailLinkStatusUseCase> provider) {
        return new com.paypal.oslo.feature.packagetracking.domain.usecase.GetPackageTrackingEmailLinkStatusUseCaseImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.packagetracking.domain.usecase.GetPackageTrackingEmailLinkStatusUseCaseImpl newInstance(com.paypal.oslo.feature.packagetracking.domain.usecase.GetEmailLinkStatusUseCase getEmailLinkStatusUseCase) {
        return new com.paypal.oslo.feature.packagetracking.domain.usecase.GetPackageTrackingEmailLinkStatusUseCaseImpl(getEmailLinkStatusUseCase);
    }
}
