package com.paypal.oslo.feature.inappcheckout.domain.usecase;

/* loaded from: classes13.dex */
public final class AddCardUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.domain.usecase.AddCardUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.repository.AddCardRepository> getHighSpeedVideoSizes;

    private AddCardUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.repository.AddCardRepository> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.domain.usecase.AddCardUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.usecase.AddCardUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.repository.AddCardRepository> provider) {
        return new com.paypal.oslo.feature.inappcheckout.domain.usecase.AddCardUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.usecase.AddCardUseCase newInstance(com.paypal.oslo.feature.inappcheckout.domain.repository.AddCardRepository addCardRepository) {
        return new com.paypal.oslo.feature.inappcheckout.domain.usecase.AddCardUseCase(addCardRepository);
    }
}
