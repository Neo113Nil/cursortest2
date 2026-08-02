package com.paypal.oslo.feature.identity.otplogin.generateotp.data.repository;

/* loaded from: classes12.dex */
public final class OtpGenerationRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.otplogin.generateotp.data.repository.OtpGenerationRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.shared.domain.model.AuthenticationConfig> getHighSpeedVideoFpsRangesFor;

    private OtpGenerationRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.shared.domain.model.AuthenticationConfig> provider2) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.otplogin.generateotp.data.repository.OtpGenerationRepositoryImpl get() {
        return newInstance(dagger.internal.DoubleCheck.lazy((dagger.internal.Provider) this.getHighSpeedVideoFpsRanges), this.getHighSpeedVideoFpsRangesFor);
    }

    public static com.paypal.oslo.feature.identity.otplogin.generateotp.data.repository.OtpGenerationRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.shared.domain.model.AuthenticationConfig> provider2) {
        return new com.paypal.oslo.feature.identity.otplogin.generateotp.data.repository.OtpGenerationRepositoryImpl_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.identity.otplogin.generateotp.data.repository.OtpGenerationRepositoryImpl newInstance(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy, javax.inject.Provider<com.paypal.oslo.feature.identity.shared.domain.model.AuthenticationConfig> provider) {
        return new com.paypal.oslo.feature.identity.otplogin.generateotp.data.repository.OtpGenerationRepositoryImpl(lazy, provider);
    }
}
