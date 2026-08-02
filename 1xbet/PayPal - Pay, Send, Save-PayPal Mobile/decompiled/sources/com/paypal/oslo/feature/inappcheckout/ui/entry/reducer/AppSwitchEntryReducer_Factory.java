package com.paypal.oslo.feature.inappcheckout.ui.entry.reducer;

/* loaded from: classes13.dex */
public final class AppSwitchEntryReducer_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.ui.entry.reducer.AppSwitchEntryReducer> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.loader.domain.usecase.LoaderTypeUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger> getHighSpeedVideoFpsRanges;

    private AppSwitchEntryReducer_Factory(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.loader.domain.usecase.LoaderTypeUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.ui.entry.reducer.AppSwitchEntryReducer get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.ui.entry.reducer.AppSwitchEntryReducer_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.loader.domain.usecase.LoaderTypeUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger> provider2) {
        return new com.paypal.oslo.feature.inappcheckout.ui.entry.reducer.AppSwitchEntryReducer_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.inappcheckout.ui.entry.reducer.AppSwitchEntryReducer newInstance(com.paypal.oslo.feature.inappcheckout.features.loader.domain.usecase.LoaderTypeUseCase loaderTypeUseCase, com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger) {
        return new com.paypal.oslo.feature.inappcheckout.ui.entry.reducer.AppSwitchEntryReducer(loaderTypeUseCase, checkoutLogger);
    }
}
