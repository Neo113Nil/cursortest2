package com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase;

/* loaded from: classes14.dex */
public final class GetSpecialFinancingPageUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetSpecialFinancingPageUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.SpecialFinancingRepository> getHighSpeedVideoFpsRanges;

    private GetSpecialFinancingPageUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.SpecialFinancingRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetSpecialFinancingPageUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetSpecialFinancingPageUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.SpecialFinancingRepository> provider) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetSpecialFinancingPageUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetSpecialFinancingPageUseCase newInstance(com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.SpecialFinancingRepository specialFinancingRepository) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetSpecialFinancingPageUseCase(specialFinancingRepository);
    }
}
