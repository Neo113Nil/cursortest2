package com.paypal.oslo.feature.publicprofile.ui.publicprofile.viewmodel;

/* loaded from: classes13.dex */
public final class PublicProfileViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.publicprofile.ui.publicprofile.viewmodel.PublicProfileViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.publicprofile.domain.usecase.DeleteContactUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.LocaleInformation> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.activity.api.provider.IActivityWidgetProvider> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.publicprofile.domain.usecase.GetPublicProfileUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.publicprofile.domain.usecase.BlockContactUseCase> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.publicprofile.domain.usecase.UnblockContactUseCase> getHighSpeedVideoSizesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.publicprofile.ui.publicprofile.reducer.PublicProfileReducer> getInputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.publicprofile.domain.usecase.ToggleFavoriteContactUseCase> getOutputFormats;

    private PublicProfileViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.publicprofile.domain.usecase.GetPublicProfileUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.publicprofile.domain.usecase.ToggleFavoriteContactUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.publicprofile.domain.usecase.DeleteContactUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.publicprofile.domain.usecase.BlockContactUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.publicprofile.domain.usecase.UnblockContactUseCase> provider5, dagger.internal.Provider<com.paypal.oslo.feature.publicprofile.ui.publicprofile.reducer.PublicProfileReducer> provider6, dagger.internal.Provider<com.paypal.oslo.feature.activity.api.provider.IActivityWidgetProvider> provider7, dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.LocaleInformation> provider8) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getOutputFormats = provider2;
        this.Camera2StreamConfigurationMap = provider3;
        this.getHighSpeedVideoSizes = provider4;
        this.getHighSpeedVideoSizesFor = provider5;
        this.getInputSizeshNQ4ISI = provider6;
        this.getHighSpeedVideoFpsRanges = provider7;
        this.getHighResolutionOutputSizeshNQ4ISI = provider8;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.publicprofile.ui.publicprofile.viewmodel.PublicProfileViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getOutputFormats.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoSizesFor.get(), this.getInputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.publicprofile.ui.publicprofile.viewmodel.PublicProfileViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.publicprofile.domain.usecase.GetPublicProfileUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.publicprofile.domain.usecase.ToggleFavoriteContactUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.publicprofile.domain.usecase.DeleteContactUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.publicprofile.domain.usecase.BlockContactUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.publicprofile.domain.usecase.UnblockContactUseCase> provider5, dagger.internal.Provider<com.paypal.oslo.feature.publicprofile.ui.publicprofile.reducer.PublicProfileReducer> provider6, dagger.internal.Provider<com.paypal.oslo.feature.activity.api.provider.IActivityWidgetProvider> provider7, dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.LocaleInformation> provider8) {
        return new com.paypal.oslo.feature.publicprofile.ui.publicprofile.viewmodel.PublicProfileViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static com.paypal.oslo.feature.publicprofile.ui.publicprofile.viewmodel.PublicProfileViewModel newInstance(com.paypal.oslo.feature.publicprofile.domain.usecase.GetPublicProfileUseCase getPublicProfileUseCase, com.paypal.oslo.feature.publicprofile.domain.usecase.ToggleFavoriteContactUseCase toggleFavoriteContactUseCase, com.paypal.oslo.feature.publicprofile.domain.usecase.DeleteContactUseCase deleteContactUseCase, com.paypal.oslo.feature.publicprofile.domain.usecase.BlockContactUseCase blockContactUseCase, com.paypal.oslo.feature.publicprofile.domain.usecase.UnblockContactUseCase unblockContactUseCase, com.paypal.oslo.feature.publicprofile.ui.publicprofile.reducer.PublicProfileReducer publicProfileReducer, com.paypal.oslo.feature.activity.api.provider.IActivityWidgetProvider iActivityWidgetProvider, com.paypal.oslo.core.appidentity.domain.LocaleInformation localeInformation) {
        return new com.paypal.oslo.feature.publicprofile.ui.publicprofile.viewmodel.PublicProfileViewModel(getPublicProfileUseCase, toggleFavoriteContactUseCase, deleteContactUseCase, blockContactUseCase, unblockContactUseCase, publicProfileReducer, iActivityWidgetProvider, localeInformation);
    }
}
