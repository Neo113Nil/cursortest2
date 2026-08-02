package com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel;

/* loaded from: classes13.dex */
public final class CardSharedViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardSharedViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.GetFIMetadataUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.GetCardFormDataUseCase> getHighSpeedVideoFpsRanges;

    private CardSharedViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.GetCardFormDataUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.GetFIMetadataUseCase> provider2) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardSharedViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardSharedViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.GetCardFormDataUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.GetFIMetadataUseCase> provider2) {
        return new com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardSharedViewModel_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardSharedViewModel newInstance(com.paypal.oslo.feature.inappcheckout.domain.usecase.GetCardFormDataUseCase getCardFormDataUseCase, com.paypal.oslo.feature.inappcheckout.domain.usecase.GetFIMetadataUseCase getFIMetadataUseCase) {
        return new com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardSharedViewModel(getCardFormDataUseCase, getFIMetadataUseCase);
    }
}
