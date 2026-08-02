package com.paypal.oslo.feature.bnplservicing.domain.usecase.paylaterhub;

/* loaded from: classes11.dex */
public final class RefreshPlansUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplservicing.domain.usecase.paylaterhub.RefreshPlansUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.domain.repository.PayLaterHubRepository> getHighSpeedVideoSizes;

    private RefreshPlansUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.domain.repository.PayLaterHubRepository> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplservicing.domain.usecase.paylaterhub.RefreshPlansUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.bnplservicing.domain.usecase.paylaterhub.RefreshPlansUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.domain.repository.PayLaterHubRepository> provider) {
        return new com.paypal.oslo.feature.bnplservicing.domain.usecase.paylaterhub.RefreshPlansUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.bnplservicing.domain.usecase.paylaterhub.RefreshPlansUseCase newInstance(com.paypal.oslo.feature.bnplservicing.domain.repository.PayLaterHubRepository payLaterHubRepository) {
        return new com.paypal.oslo.feature.bnplservicing.domain.usecase.paylaterhub.RefreshPlansUseCase(payLaterHubRepository);
    }
}
