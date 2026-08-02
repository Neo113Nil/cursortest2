package com.paypal.oslo.feature.onboarding.steps.nav.data;

/* loaded from: classes13.dex */
public final class CosFlowStepApi_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.onboarding.steps.nav.data.CosFlowStepApi> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.onboarding.steps.nav.data.CosFlowStepMapper> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRangesFor;

    private CosFlowStepApi_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.onboarding.steps.nav.data.CosFlowStepMapper> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.onboarding.steps.nav.data.CosFlowStepApi get() {
        return newInstance(dagger.internal.DoubleCheck.lazy((dagger.internal.Provider) this.getHighSpeedVideoFpsRangesFor), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.onboarding.steps.nav.data.CosFlowStepApi_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.onboarding.steps.nav.data.CosFlowStepMapper> provider2) {
        return new com.paypal.oslo.feature.onboarding.steps.nav.data.CosFlowStepApi_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.onboarding.steps.nav.data.CosFlowStepApi newInstance(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy, com.paypal.oslo.feature.onboarding.steps.nav.data.CosFlowStepMapper cosFlowStepMapper) {
        return new com.paypal.oslo.feature.onboarding.steps.nav.data.CosFlowStepApi(lazy, cosFlowStepMapper);
    }
}
