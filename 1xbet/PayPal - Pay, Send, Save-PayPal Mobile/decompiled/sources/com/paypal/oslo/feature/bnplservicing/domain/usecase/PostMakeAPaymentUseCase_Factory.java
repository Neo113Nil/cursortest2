package com.paypal.oslo.feature.bnplservicing.domain.usecase;

/* loaded from: classes11.dex */
public final class PostMakeAPaymentUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplservicing.domain.usecase.PostMakeAPaymentUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.domain.repository.MakeAPaymentRepository> getHighSpeedVideoSizes;

    private PostMakeAPaymentUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.domain.repository.MakeAPaymentRepository> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplservicing.domain.usecase.PostMakeAPaymentUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.bnplservicing.domain.usecase.PostMakeAPaymentUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.domain.repository.MakeAPaymentRepository> provider) {
        return new com.paypal.oslo.feature.bnplservicing.domain.usecase.PostMakeAPaymentUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.bnplservicing.domain.usecase.PostMakeAPaymentUseCase newInstance(com.paypal.oslo.feature.bnplservicing.domain.repository.MakeAPaymentRepository makeAPaymentRepository) {
        return new com.paypal.oslo.feature.bnplservicing.domain.usecase.PostMakeAPaymentUseCase(makeAPaymentRepository);
    }
}
