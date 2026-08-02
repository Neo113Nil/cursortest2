package com.paypal.oslo.feature.ads.ui.widget;

/* loaded from: classes11.dex */
public final class AdWidgetViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.ads.ui.widget.AdWidgetViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.ads.domain.usecase.GetAdDataUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.ads.domain.usecase.TriggerImpressionUseCase> getHighSpeedVideoFpsRanges;

    private AdWidgetViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.ads.domain.usecase.GetAdDataUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.ads.domain.usecase.TriggerImpressionUseCase> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.ads.ui.widget.AdWidgetViewModel get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.ads.ui.widget.AdWidgetViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.ads.domain.usecase.GetAdDataUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.ads.domain.usecase.TriggerImpressionUseCase> provider2) {
        return new com.paypal.oslo.feature.ads.ui.widget.AdWidgetViewModel_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.ads.ui.widget.AdWidgetViewModel newInstance(com.paypal.oslo.feature.ads.domain.usecase.GetAdDataUseCase getAdDataUseCase, com.paypal.oslo.feature.ads.domain.usecase.TriggerImpressionUseCase triggerImpressionUseCase) {
        return new com.paypal.oslo.feature.ads.ui.widget.AdWidgetViewModel(getAdDataUseCase, triggerImpressionUseCase);
    }
}
