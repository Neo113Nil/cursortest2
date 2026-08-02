package com.paypal.oslo.feature.bnplacquisition.domain.usecase;

/* loaded from: classes11.dex */
public final class RemoveExistingPayLaterCardsUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.domain.usecase.RemoveExistingPayLaterCardsUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.api.domain.usecase.card.DeleteCardApi> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.api.domain.usecase.card.GetAllCardsApi> getHighSpeedVideoFpsRangesFor;

    private RemoveExistingPayLaterCardsUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.api.domain.usecase.card.GetAllCardsApi> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.api.domain.usecase.card.DeleteCardApi> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.domain.usecase.RemoveExistingPayLaterCardsUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.bnplacquisition.domain.usecase.RemoveExistingPayLaterCardsUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.api.domain.usecase.card.GetAllCardsApi> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.api.domain.usecase.card.DeleteCardApi> provider2) {
        return new com.paypal.oslo.feature.bnplacquisition.domain.usecase.RemoveExistingPayLaterCardsUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.bnplacquisition.domain.usecase.RemoveExistingPayLaterCardsUseCase newInstance(com.paypal.oslo.feature.taptopay.api.domain.usecase.card.GetAllCardsApi getAllCardsApi, com.paypal.oslo.feature.taptopay.api.domain.usecase.card.DeleteCardApi deleteCardApi) {
        return new com.paypal.oslo.feature.bnplacquisition.domain.usecase.RemoveExistingPayLaterCardsUseCase(getAllCardsApi, deleteCardApi);
    }
}
