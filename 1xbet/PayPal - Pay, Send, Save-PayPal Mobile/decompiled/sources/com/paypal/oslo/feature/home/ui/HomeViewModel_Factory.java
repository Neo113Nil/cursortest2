package com.paypal.oslo.feature.home.ui;

/* loaded from: classes12.dex */
public final class HomeViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.home.ui.HomeViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.home.domain.loading.LoadingSectionProvider> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.home.ui.mvi.HomeReducer> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.home.domain.usecase.GetAccountSnapshotSectionUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.home.domain.usecase.GetHomeFeedSectionsUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.home.featureflags.HomeConfigManager> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.home.domain.usecase.RetrySectionUseCase> getHighSpeedVideoSizesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.home.domain.usecase.RefreshHomeFeedSectionsUseCase> getInputSizeshNQ4ISI;
    private final dagger.internal.Provider<androidx.view.SavedStateHandle> getOutputMinFrameDuration;

    private HomeViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.home.domain.usecase.GetHomeFeedSectionsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.home.domain.usecase.GetAccountSnapshotSectionUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.home.domain.usecase.RefreshHomeFeedSectionsUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.home.domain.usecase.RetrySectionUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.home.featureflags.HomeConfigManager> provider5, dagger.internal.Provider<androidx.view.SavedStateHandle> provider6, dagger.internal.Provider<com.paypal.oslo.feature.home.ui.mvi.HomeReducer> provider7, dagger.internal.Provider<com.paypal.oslo.feature.home.domain.loading.LoadingSectionProvider> provider8) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getInputSizeshNQ4ISI = provider3;
        this.getHighSpeedVideoSizesFor = provider4;
        this.getHighSpeedVideoSizes = provider5;
        this.getOutputMinFrameDuration = provider6;
        this.getHighResolutionOutputSizeshNQ4ISI = provider7;
        this.Camera2StreamConfigurationMap = provider8;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.home.ui.HomeViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get(), this.getInputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizesFor.get(), this.getHighSpeedVideoSizes.get(), this.getOutputMinFrameDuration.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.home.ui.HomeViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.home.domain.usecase.GetHomeFeedSectionsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.home.domain.usecase.GetAccountSnapshotSectionUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.home.domain.usecase.RefreshHomeFeedSectionsUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.home.domain.usecase.RetrySectionUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.home.featureflags.HomeConfigManager> provider5, dagger.internal.Provider<androidx.view.SavedStateHandle> provider6, dagger.internal.Provider<com.paypal.oslo.feature.home.ui.mvi.HomeReducer> provider7, dagger.internal.Provider<com.paypal.oslo.feature.home.domain.loading.LoadingSectionProvider> provider8) {
        return new com.paypal.oslo.feature.home.ui.HomeViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static com.paypal.oslo.feature.home.ui.HomeViewModel newInstance(com.paypal.oslo.feature.home.domain.usecase.GetHomeFeedSectionsUseCase getHomeFeedSectionsUseCase, com.paypal.oslo.feature.home.domain.usecase.GetAccountSnapshotSectionUseCase getAccountSnapshotSectionUseCase, com.paypal.oslo.feature.home.domain.usecase.RefreshHomeFeedSectionsUseCase refreshHomeFeedSectionsUseCase, com.paypal.oslo.feature.home.domain.usecase.RetrySectionUseCase retrySectionUseCase, com.paypal.oslo.feature.home.featureflags.HomeConfigManager homeConfigManager, androidx.view.SavedStateHandle savedStateHandle, com.paypal.oslo.feature.home.ui.mvi.HomeReducer homeReducer, com.paypal.oslo.feature.home.domain.loading.LoadingSectionProvider loadingSectionProvider) {
        return new com.paypal.oslo.feature.home.ui.HomeViewModel(getHomeFeedSectionsUseCase, getAccountSnapshotSectionUseCase, refreshHomeFeedSectionsUseCase, retrySectionUseCase, homeConfigManager, savedStateHandle, homeReducer, loadingSectionProvider);
    }
}
