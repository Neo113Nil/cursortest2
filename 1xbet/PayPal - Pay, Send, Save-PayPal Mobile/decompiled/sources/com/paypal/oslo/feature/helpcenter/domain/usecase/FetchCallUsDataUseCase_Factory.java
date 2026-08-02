package com.paypal.oslo.feature.helpcenter.domain.usecase;

/* loaded from: classes12.dex */
public final class FetchCallUsDataUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.helpcenter.domain.usecase.FetchCallUsDataUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.helpcenter.domain.repository.CallUsRepository> getHighSpeedVideoFpsRangesFor;

    private FetchCallUsDataUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.helpcenter.domain.repository.CallUsRepository> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.helpcenter.domain.usecase.FetchCallUsDataUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.helpcenter.domain.usecase.FetchCallUsDataUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.helpcenter.domain.repository.CallUsRepository> provider) {
        return new com.paypal.oslo.feature.helpcenter.domain.usecase.FetchCallUsDataUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.helpcenter.domain.usecase.FetchCallUsDataUseCase newInstance(com.paypal.oslo.feature.helpcenter.domain.repository.CallUsRepository callUsRepository) {
        return new com.paypal.oslo.feature.helpcenter.domain.usecase.FetchCallUsDataUseCase(callUsRepository);
    }
}
