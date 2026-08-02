package com.paypal.oslo.feature.userprofile.ui.viewmodel;

/* loaded from: classes15.dex */
public final class DeleteEmailViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.userprofile.ui.viewmodel.DeleteEmailViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.usecase.RemoveEmailUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorHandler> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<android.content.Context> getHighSpeedVideoFpsRangesFor;

    private DeleteEmailViewModel_Factory(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.usecase.RemoveEmailUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorHandler> provider3) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.userprofile.ui.viewmodel.DeleteEmailViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.userprofile.ui.viewmodel.DeleteEmailViewModel_Factory create(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.usecase.RemoveEmailUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorHandler> provider3) {
        return new com.paypal.oslo.feature.userprofile.ui.viewmodel.DeleteEmailViewModel_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.userprofile.ui.viewmodel.DeleteEmailViewModel newInstance(android.content.Context context, com.paypal.oslo.feature.userprofile.domain.usecase.RemoveEmailUseCase removeEmailUseCase, com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorHandler emailErrorHandler) {
        return new com.paypal.oslo.feature.userprofile.ui.viewmodel.DeleteEmailViewModel(context, removeEmailUseCase, emailErrorHandler);
    }
}
