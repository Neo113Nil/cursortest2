package com.paypal.oslo.feature.identity.challenges.shared.data.repository;

/* loaded from: classes12.dex */
public final class NotifyChallengeRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.challenges.shared.data.repository.NotifyChallengeRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.storage.IdentityTokenStorage> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<java.util.Set<kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.login.domain.model.LoginRequest, com.paypal.oslo.feature.identity.login.data.BuilderResult>>> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.shared.domain.model.AuthenticationConfig> getHighSpeedVideoSizes;

    private NotifyChallengeRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.shared.domain.model.AuthenticationConfig> provider2, dagger.internal.Provider<java.util.Set<kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.login.domain.model.LoginRequest, com.paypal.oslo.feature.identity.login.data.BuilderResult>>> provider3, dagger.internal.Provider<com.paypal.oslo.feature.identity.storage.IdentityTokenStorage> provider4) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
        this.getHighResolutionOutputSizeshNQ4ISI = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.challenges.shared.data.repository.NotifyChallengeRepositoryImpl get() {
        return newInstance(dagger.internal.DoubleCheck.lazy((dagger.internal.Provider) this.getHighSpeedVideoFpsRanges), this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.identity.challenges.shared.data.repository.NotifyChallengeRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.shared.domain.model.AuthenticationConfig> provider2, dagger.internal.Provider<java.util.Set<kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.login.domain.model.LoginRequest, com.paypal.oslo.feature.identity.login.data.BuilderResult>>> provider3, dagger.internal.Provider<com.paypal.oslo.feature.identity.storage.IdentityTokenStorage> provider4) {
        return new com.paypal.oslo.feature.identity.challenges.shared.data.repository.NotifyChallengeRepositoryImpl_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.identity.challenges.shared.data.repository.NotifyChallengeRepositoryImpl newInstance(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy, javax.inject.Provider<com.paypal.oslo.feature.identity.shared.domain.model.AuthenticationConfig> provider, java.util.Set<kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.login.domain.model.LoginRequest, com.paypal.oslo.feature.identity.login.data.BuilderResult>> set, com.paypal.oslo.feature.identity.storage.IdentityTokenStorage identityTokenStorage) {
        return new com.paypal.oslo.feature.identity.challenges.shared.data.repository.NotifyChallengeRepositoryImpl(lazy, provider, set, identityTokenStorage);
    }
}
