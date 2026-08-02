package com.paypal.oslo.feature.helpcenter.ui.viewmodel;

/* loaded from: classes12.dex */
public final class CallUsViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.helpcenter.ui.viewmodel.CallUsViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.helpcenter.domain.usecase.FetchCallUsDataUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.helpcenter.domain.remoteconfig.HelpCenterConfig.Manager> getHighSpeedVideoFpsRanges;

    private CallUsViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.helpcenter.domain.usecase.FetchCallUsDataUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.helpcenter.domain.remoteconfig.HelpCenterConfig.Manager> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.helpcenter.ui.viewmodel.CallUsViewModel get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.helpcenter.ui.viewmodel.CallUsViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.helpcenter.domain.usecase.FetchCallUsDataUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.helpcenter.domain.remoteconfig.HelpCenterConfig.Manager> provider2) {
        return new com.paypal.oslo.feature.helpcenter.ui.viewmodel.CallUsViewModel_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.helpcenter.ui.viewmodel.CallUsViewModel newInstance(com.paypal.oslo.feature.helpcenter.domain.usecase.FetchCallUsDataUseCase fetchCallUsDataUseCase, com.paypal.oslo.feature.helpcenter.domain.remoteconfig.HelpCenterConfig.Manager manager) {
        return new com.paypal.oslo.feature.helpcenter.ui.viewmodel.CallUsViewModel(fetchCallUsDataUseCase, manager);
    }
}
