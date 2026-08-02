package com.paypal.oslo.feature.helpcenter.domain.usecase;

/* loaded from: classes12.dex */
public final class GetUserFirstNameUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.helpcenter.domain.usecase.GetUserFirstNameUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> getHighResolutionOutputSizeshNQ4ISI;

    private GetUserFirstNameUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.helpcenter.domain.usecase.GetUserFirstNameUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.helpcenter.domain.usecase.GetUserFirstNameUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider) {
        return new com.paypal.oslo.feature.helpcenter.domain.usecase.GetUserFirstNameUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.helpcenter.domain.usecase.GetUserFirstNameUseCase newInstance(com.paypal.oslo.core.userstore.UserStore userStore) {
        return new com.paypal.oslo.feature.helpcenter.domain.usecase.GetUserFirstNameUseCase(userStore);
    }
}
