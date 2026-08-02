package com.paypal.oslo.feature.identity.moreoptions.ui;

/* loaded from: classes12.dex */
public final class MoreOptionsViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.moreoptions.domain.usecase.MapToAuthOptionUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsReducer> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.moreoptions.domain.usecase.MoreOptionUseCase> getHighSpeedVideoSizes;

    private MoreOptionsViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.moreoptions.domain.usecase.MoreOptionUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.identity.moreoptions.domain.usecase.MapToAuthOptionUseCase> provider3) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.Camera2StreamConfigurationMap = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.moreoptions.domain.usecase.MoreOptionUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.identity.moreoptions.domain.usecase.MapToAuthOptionUseCase> provider3) {
        return new com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsViewModel_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsViewModel newInstance(com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsReducer moreOptionsReducer, com.paypal.oslo.feature.identity.moreoptions.domain.usecase.MoreOptionUseCase moreOptionUseCase, com.paypal.oslo.feature.identity.moreoptions.domain.usecase.MapToAuthOptionUseCase mapToAuthOptionUseCase) {
        return new com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsViewModel(moreOptionsReducer, moreOptionUseCase, mapToAuthOptionUseCase);
    }
}
