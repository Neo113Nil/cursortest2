package com.paypal.oslo.feature.oneonboarding.data.repository;

/* loaded from: classes13.dex */
public final class CosFlowStepRepository_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.oneonboarding.data.repository.CosFlowStepRepository> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.oneonboarding.data.builder.OneOnboardingQueryBuilder> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.oneonboarding.data.parser.OneOnboardingComponentParser> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.oneonboarding.data.mapper.CallErrorMapper> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.oneonboarding.data.repository.PostAccountCreationHandler> getHighSpeedVideoSizes;

    private CosFlowStepRepository_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.oneonboarding.data.builder.OneOnboardingQueryBuilder> provider2, dagger.internal.Provider<com.paypal.oslo.feature.oneonboarding.data.parser.OneOnboardingComponentParser> provider3, dagger.internal.Provider<com.paypal.oslo.feature.oneonboarding.data.repository.PostAccountCreationHandler> provider4, dagger.internal.Provider<com.paypal.oslo.feature.oneonboarding.data.mapper.CallErrorMapper> provider5) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
        this.getHighSpeedVideoSizes = provider4;
        this.getHighSpeedVideoFpsRangesFor = provider5;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.oneonboarding.data.repository.CosFlowStepRepository get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.oneonboarding.data.repository.CosFlowStepRepository_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.oneonboarding.data.builder.OneOnboardingQueryBuilder> provider2, dagger.internal.Provider<com.paypal.oslo.feature.oneonboarding.data.parser.OneOnboardingComponentParser> provider3, dagger.internal.Provider<com.paypal.oslo.feature.oneonboarding.data.repository.PostAccountCreationHandler> provider4, dagger.internal.Provider<com.paypal.oslo.feature.oneonboarding.data.mapper.CallErrorMapper> provider5) {
        return new com.paypal.oslo.feature.oneonboarding.data.repository.CosFlowStepRepository_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static com.paypal.oslo.feature.oneonboarding.data.repository.CosFlowStepRepository newInstance(com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.feature.oneonboarding.data.builder.OneOnboardingQueryBuilder oneOnboardingQueryBuilder, com.paypal.oslo.feature.oneonboarding.data.parser.OneOnboardingComponentParser oneOnboardingComponentParser, com.paypal.oslo.feature.oneonboarding.data.repository.PostAccountCreationHandler postAccountCreationHandler, com.paypal.oslo.feature.oneonboarding.data.mapper.CallErrorMapper callErrorMapper) {
        return new com.paypal.oslo.feature.oneonboarding.data.repository.CosFlowStepRepository(apolloClient, oneOnboardingQueryBuilder, oneOnboardingComponentParser, postAccountCreationHandler, callErrorMapper);
    }
}
