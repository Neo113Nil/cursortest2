package com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel;

/* loaded from: classes13.dex */
public final class CardFormViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardFormViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.ui.util.CardPayloadBuilder> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<android.content.Context> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.AddCardUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.GetCardBrandUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.GetStatesUseCase> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.UpdateCardUseCase> getOutputFormats;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.ui.card.reducer.CardFormReducer> getOutputMinFrameDuration;

    private CardFormViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.ui.card.reducer.CardFormReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.GetStatesUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.AddCardUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.UpdateCardUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.GetCardBrandUseCase> provider5, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.ui.util.CardPayloadBuilder> provider6, dagger.internal.Provider<android.content.Context> provider7) {
        this.getOutputMinFrameDuration = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
        this.getOutputFormats = provider4;
        this.getHighSpeedVideoFpsRangesFor = provider5;
        this.Camera2StreamConfigurationMap = provider6;
        this.getHighResolutionOutputSizeshNQ4ISI = provider7;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardFormViewModel get() {
        return newInstance(this.getOutputMinFrameDuration.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get(), this.getOutputFormats.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardFormViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.ui.card.reducer.CardFormReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.GetStatesUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.AddCardUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.UpdateCardUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.GetCardBrandUseCase> provider5, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.ui.util.CardPayloadBuilder> provider6, dagger.internal.Provider<android.content.Context> provider7) {
        return new com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardFormViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardFormViewModel newInstance(com.paypal.oslo.feature.inappcheckout.ui.card.reducer.CardFormReducer cardFormReducer, com.paypal.oslo.feature.inappcheckout.domain.usecase.GetStatesUseCase getStatesUseCase, com.paypal.oslo.feature.inappcheckout.domain.usecase.AddCardUseCase addCardUseCase, com.paypal.oslo.feature.inappcheckout.domain.usecase.UpdateCardUseCase updateCardUseCase, com.paypal.oslo.feature.inappcheckout.domain.usecase.GetCardBrandUseCase getCardBrandUseCase, com.paypal.oslo.feature.inappcheckout.ui.util.CardPayloadBuilder cardPayloadBuilder, android.content.Context context) {
        return new com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardFormViewModel(cardFormReducer, getStatesUseCase, addCardUseCase, updateCardUseCase, getCardBrandUseCase, cardPayloadBuilder, context);
    }
}
