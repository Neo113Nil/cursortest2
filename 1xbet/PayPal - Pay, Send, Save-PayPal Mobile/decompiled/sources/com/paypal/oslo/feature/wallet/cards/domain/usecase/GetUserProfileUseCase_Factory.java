package com.paypal.oslo.feature.wallet.cards.domain.usecase;

/* loaded from: classes15.dex */
public final class GetUserProfileUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.wallet.cards.domain.usecase.GetUserProfileUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> getHighResolutionOutputSizeshNQ4ISI;

    private GetUserProfileUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.wallet.cards.domain.usecase.GetUserProfileUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.wallet.cards.domain.usecase.GetUserProfileUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider) {
        return new com.paypal.oslo.feature.wallet.cards.domain.usecase.GetUserProfileUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.wallet.cards.domain.usecase.GetUserProfileUseCase newInstance(com.paypal.oslo.core.userstore.UserStore userStore) {
        return new com.paypal.oslo.feature.wallet.cards.domain.usecase.GetUserProfileUseCase(userStore);
    }
}
