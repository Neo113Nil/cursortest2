package com.paypal.oslo.feature.savings.domain.util;

/* loaded from: classes14.dex */
public final class GoalsFieldValidator_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.savings.domain.util.GoalsFieldValidator> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.usecase.FetchGoalsUseCase> getHighSpeedVideoSizes;

    private GoalsFieldValidator_Factory(dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.usecase.FetchGoalsUseCase> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.savings.domain.util.GoalsFieldValidator get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.savings.domain.util.GoalsFieldValidator_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.usecase.FetchGoalsUseCase> provider) {
        return new com.paypal.oslo.feature.savings.domain.util.GoalsFieldValidator_Factory(provider);
    }

    public static com.paypal.oslo.feature.savings.domain.util.GoalsFieldValidator newInstance(com.paypal.oslo.feature.savings.domain.usecase.FetchGoalsUseCase fetchGoalsUseCase) {
        return new com.paypal.oslo.feature.savings.domain.util.GoalsFieldValidator(fetchGoalsUseCase);
    }
}
