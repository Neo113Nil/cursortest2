package com.paypal.oslo.feature.identity.moreoptions.domain.usecase;

/* loaded from: classes12.dex */
public final class GetAuthOptionsUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.moreoptions.domain.usecase.GetAuthOptionsUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.moreoptions.domain.repository.MoreOptionRepository> getHighSpeedVideoSizes;

    private GetAuthOptionsUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.moreoptions.domain.repository.MoreOptionRepository> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.moreoptions.domain.usecase.GetAuthOptionsUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.identity.moreoptions.domain.usecase.GetAuthOptionsUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.moreoptions.domain.repository.MoreOptionRepository> provider) {
        return new com.paypal.oslo.feature.identity.moreoptions.domain.usecase.GetAuthOptionsUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.identity.moreoptions.domain.usecase.GetAuthOptionsUseCase newInstance(com.paypal.oslo.feature.identity.moreoptions.domain.repository.MoreOptionRepository moreOptionRepository) {
        return new com.paypal.oslo.feature.identity.moreoptions.domain.usecase.GetAuthOptionsUseCase(moreOptionRepository);
    }
}
