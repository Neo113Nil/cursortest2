package com.paypal.oslo.feature.inappcheckout.domain.usecase;

/* loaded from: classes13.dex */
public final class UpdateCardUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.domain.usecase.UpdateCardUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.repository.UpdateCardRepository> getHighSpeedVideoSizes;

    private UpdateCardUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.repository.UpdateCardRepository> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.domain.usecase.UpdateCardUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.usecase.UpdateCardUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.repository.UpdateCardRepository> provider) {
        return new com.paypal.oslo.feature.inappcheckout.domain.usecase.UpdateCardUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.usecase.UpdateCardUseCase newInstance(com.paypal.oslo.feature.inappcheckout.domain.repository.UpdateCardRepository updateCardRepository) {
        return new com.paypal.oslo.feature.inappcheckout.domain.usecase.UpdateCardUseCase(updateCardRepository);
    }
}
