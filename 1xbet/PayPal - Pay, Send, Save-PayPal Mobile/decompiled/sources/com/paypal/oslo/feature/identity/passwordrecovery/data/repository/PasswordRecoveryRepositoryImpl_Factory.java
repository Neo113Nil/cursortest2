package com.paypal.oslo.feature.identity.passwordrecovery.data.repository;

/* loaded from: classes12.dex */
public final class PasswordRecoveryRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.passwordrecovery.data.repository.PasswordRecoveryRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.shared.domain.model.AuthenticationConfig> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<java.util.Set<kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.login.domain.model.LoginRequest, com.paypal.oslo.feature.identity.login.data.BuilderResult>>> getHighSpeedVideoSizes;

    private PasswordRecoveryRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.shared.domain.model.AuthenticationConfig> provider2, dagger.internal.Provider<java.util.Set<kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.login.domain.model.LoginRequest, com.paypal.oslo.feature.identity.login.data.BuilderResult>>> provider3) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.getHighSpeedVideoSizes = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.passwordrecovery.data.repository.PasswordRecoveryRepositoryImpl get() {
        return newInstance(dagger.internal.DoubleCheck.lazy((dagger.internal.Provider) this.Camera2StreamConfigurationMap), this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.identity.passwordrecovery.data.repository.PasswordRecoveryRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.shared.domain.model.AuthenticationConfig> provider2, dagger.internal.Provider<java.util.Set<kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.login.domain.model.LoginRequest, com.paypal.oslo.feature.identity.login.data.BuilderResult>>> provider3) {
        return new com.paypal.oslo.feature.identity.passwordrecovery.data.repository.PasswordRecoveryRepositoryImpl_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.identity.passwordrecovery.data.repository.PasswordRecoveryRepositoryImpl newInstance(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy, javax.inject.Provider<com.paypal.oslo.feature.identity.shared.domain.model.AuthenticationConfig> provider, java.util.Set<kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.login.domain.model.LoginRequest, com.paypal.oslo.feature.identity.login.data.BuilderResult>> set) {
        return new com.paypal.oslo.feature.identity.passwordrecovery.data.repository.PasswordRecoveryRepositoryImpl(lazy, provider, set);
    }
}
