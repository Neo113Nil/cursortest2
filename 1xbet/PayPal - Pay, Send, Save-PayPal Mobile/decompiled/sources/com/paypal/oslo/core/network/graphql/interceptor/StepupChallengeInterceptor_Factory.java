package com.paypal.oslo.core.network.graphql.interceptor;

/* loaded from: classes10.dex */
public final class StepupChallengeInterceptor_Factory implements dagger.internal.Factory<com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor> {
    private final dagger.internal.Provider<com.paypal.oslo.core.identity.stepup.StepupChallengeHandler> getHighSpeedVideoSizes;

    private StepupChallengeInterceptor_Factory(dagger.internal.Provider<com.paypal.oslo.core.identity.stepup.StepupChallengeHandler> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor_Factory create(dagger.internal.Provider<com.paypal.oslo.core.identity.stepup.StepupChallengeHandler> provider) {
        return new com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor_Factory(provider);
    }

    public static com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor newInstance(com.paypal.oslo.core.identity.stepup.StepupChallengeHandler stepupChallengeHandler) {
        return new com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor(stepupChallengeHandler);
    }
}
