package com.paypal.oslo.feature.identity.moreoptions.domain.usecase;

/* loaded from: classes12.dex */
public final class MapToAuthOptionUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.moreoptions.domain.usecase.MapToAuthOptionUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.moreoptions.domain.repository.MoreOptionRepository> getHighSpeedVideoSizes;

    private MapToAuthOptionUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.moreoptions.domain.repository.MoreOptionRepository> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.moreoptions.domain.usecase.MapToAuthOptionUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.identity.moreoptions.domain.usecase.MapToAuthOptionUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.moreoptions.domain.repository.MoreOptionRepository> provider) {
        return new com.paypal.oslo.feature.identity.moreoptions.domain.usecase.MapToAuthOptionUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.identity.moreoptions.domain.usecase.MapToAuthOptionUseCase newInstance(com.paypal.oslo.feature.identity.moreoptions.domain.repository.MoreOptionRepository moreOptionRepository) {
        return new com.paypal.oslo.feature.identity.moreoptions.domain.usecase.MapToAuthOptionUseCase(moreOptionRepository);
    }
}
