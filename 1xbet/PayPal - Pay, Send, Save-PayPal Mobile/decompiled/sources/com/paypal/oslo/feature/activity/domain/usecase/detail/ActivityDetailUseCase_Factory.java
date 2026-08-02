package com.paypal.oslo.feature.activity.domain.usecase.detail;

/* loaded from: classes10.dex */
public final class ActivityDetailUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.activity.domain.usecase.detail.ActivityDetailUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.repository.detail.IActivityTransactionDetailRepository> getHighResolutionOutputSizeshNQ4ISI;

    private ActivityDetailUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.repository.detail.IActivityTransactionDetailRepository> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.activity.domain.usecase.detail.ActivityDetailUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.activity.domain.usecase.detail.ActivityDetailUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.repository.detail.IActivityTransactionDetailRepository> provider) {
        return new com.paypal.oslo.feature.activity.domain.usecase.detail.ActivityDetailUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.activity.domain.usecase.detail.ActivityDetailUseCase newInstance(com.paypal.oslo.feature.activity.domain.repository.detail.IActivityTransactionDetailRepository iActivityTransactionDetailRepository) {
        return new com.paypal.oslo.feature.activity.domain.usecase.detail.ActivityDetailUseCase(iActivityTransactionDetailRepository);
    }
}
