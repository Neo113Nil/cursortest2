package com.paypal.oslo.feature.identity.stepup.data.repository;

/* loaded from: classes13.dex */
public final class StepupChallengeRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.stepup.data.repository.StepupChallengeRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.stepup.data.mapper.StepupChallengeMapper> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.stepup.data.mapper.StepupChallengeErrorMapper> getHighSpeedVideoFpsRangesFor;

    private StepupChallengeRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.stepup.data.mapper.StepupChallengeMapper> provider2, dagger.internal.Provider<com.paypal.oslo.feature.identity.stepup.data.mapper.StepupChallengeErrorMapper> provider3) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.stepup.data.repository.StepupChallengeRepositoryImpl get() {
        return newInstance(dagger.internal.DoubleCheck.lazy((dagger.internal.Provider) this.getHighResolutionOutputSizeshNQ4ISI), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.identity.stepup.data.repository.StepupChallengeRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.stepup.data.mapper.StepupChallengeMapper> provider2, dagger.internal.Provider<com.paypal.oslo.feature.identity.stepup.data.mapper.StepupChallengeErrorMapper> provider3) {
        return new com.paypal.oslo.feature.identity.stepup.data.repository.StepupChallengeRepositoryImpl_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.identity.stepup.data.repository.StepupChallengeRepositoryImpl newInstance(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy, com.paypal.oslo.feature.identity.stepup.data.mapper.StepupChallengeMapper stepupChallengeMapper, com.paypal.oslo.feature.identity.stepup.data.mapper.StepupChallengeErrorMapper stepupChallengeErrorMapper) {
        return new com.paypal.oslo.feature.identity.stepup.data.repository.StepupChallengeRepositoryImpl(lazy, stepupChallengeMapper, stepupChallengeErrorMapper);
    }
}
