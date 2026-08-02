package com.paypal.oslo.feature.identity.login.data.repository;

/* loaded from: classes12.dex */
public final class LoginRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.login.data.repository.LoginRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.checkoutdataprovider.domain.datastore.CheckoutOutputDataStore> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.checkoutdataprovider.domain.datastore.AuthCodeDataStore> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.checkoutdataprovider.domain.datastore.CheckoutInputDataStore> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.login.domain.BindSchemeProvider> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.GetRememberedUserUseCase> getHighSpeedVideoSizesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.login.ElapsedRealtimeProvider> getInputFormats;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.shared.data.mapper.GraphQLErrorMapper> getInputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.sso.domain.repository.checkout.CheckoutWebSSOIntentStore> getOutputFormats;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.shared.domain.model.AuthenticationConfig> getOutputMinFrameDuration;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.storage.IdentityTokenStorage> getOutputStallDuration;
    private final dagger.internal.Provider<java.util.Set<kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.login.domain.model.LoginRequest, com.paypal.oslo.feature.identity.login.data.BuilderResult>>> getOutputStallDurationlomOqCM;

    private LoginRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.shared.domain.model.AuthenticationConfig> provider2, dagger.internal.Provider<com.paypal.oslo.feature.identity.storage.IdentityTokenStorage> provider3, dagger.internal.Provider<java.util.Set<kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.login.domain.model.LoginRequest, com.paypal.oslo.feature.identity.login.data.BuilderResult>>> provider4, dagger.internal.Provider<com.paypal.oslo.feature.identity.login.domain.BindSchemeProvider> provider5, dagger.internal.Provider<com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.GetRememberedUserUseCase> provider6, dagger.internal.Provider<com.paypal.oslo.feature.identity.checkoutdataprovider.domain.datastore.CheckoutInputDataStore> provider7, dagger.internal.Provider<com.paypal.oslo.feature.identity.checkoutdataprovider.domain.datastore.CheckoutOutputDataStore> provider8, dagger.internal.Provider<com.paypal.oslo.feature.identity.checkoutdataprovider.domain.datastore.AuthCodeDataStore> provider9, dagger.internal.Provider<com.paypal.oslo.feature.identity.login.ElapsedRealtimeProvider> provider10, dagger.internal.Provider<com.paypal.oslo.feature.identity.shared.data.mapper.GraphQLErrorMapper> provider11, dagger.internal.Provider<com.paypal.oslo.feature.identity.sso.domain.repository.checkout.CheckoutWebSSOIntentStore> provider12) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getOutputMinFrameDuration = provider2;
        this.getOutputStallDuration = provider3;
        this.getOutputStallDurationlomOqCM = provider4;
        this.getHighSpeedVideoSizes = provider5;
        this.getHighSpeedVideoSizesFor = provider6;
        this.getHighSpeedVideoFpsRangesFor = provider7;
        this.Camera2StreamConfigurationMap = provider8;
        this.getHighSpeedVideoFpsRanges = provider9;
        this.getInputFormats = provider10;
        this.getInputSizeshNQ4ISI = provider11;
        this.getOutputFormats = provider12;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.login.data.repository.LoginRepositoryImpl get() {
        return newInstance(dagger.internal.DoubleCheck.lazy((dagger.internal.Provider) this.getHighResolutionOutputSizeshNQ4ISI), this.getOutputMinFrameDuration, this.getOutputStallDuration.get(), this.getOutputStallDurationlomOqCM.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoSizesFor.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get(), this.getInputFormats.get(), this.getInputSizeshNQ4ISI.get(), this.getOutputFormats.get());
    }

    public static com.paypal.oslo.feature.identity.login.data.repository.LoginRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.shared.domain.model.AuthenticationConfig> provider2, dagger.internal.Provider<com.paypal.oslo.feature.identity.storage.IdentityTokenStorage> provider3, dagger.internal.Provider<java.util.Set<kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.login.domain.model.LoginRequest, com.paypal.oslo.feature.identity.login.data.BuilderResult>>> provider4, dagger.internal.Provider<com.paypal.oslo.feature.identity.login.domain.BindSchemeProvider> provider5, dagger.internal.Provider<com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.GetRememberedUserUseCase> provider6, dagger.internal.Provider<com.paypal.oslo.feature.identity.checkoutdataprovider.domain.datastore.CheckoutInputDataStore> provider7, dagger.internal.Provider<com.paypal.oslo.feature.identity.checkoutdataprovider.domain.datastore.CheckoutOutputDataStore> provider8, dagger.internal.Provider<com.paypal.oslo.feature.identity.checkoutdataprovider.domain.datastore.AuthCodeDataStore> provider9, dagger.internal.Provider<com.paypal.oslo.feature.identity.login.ElapsedRealtimeProvider> provider10, dagger.internal.Provider<com.paypal.oslo.feature.identity.shared.data.mapper.GraphQLErrorMapper> provider11, dagger.internal.Provider<com.paypal.oslo.feature.identity.sso.domain.repository.checkout.CheckoutWebSSOIntentStore> provider12) {
        return new com.paypal.oslo.feature.identity.login.data.repository.LoginRepositoryImpl_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12);
    }

    public static com.paypal.oslo.feature.identity.login.data.repository.LoginRepositoryImpl newInstance(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy, javax.inject.Provider<com.paypal.oslo.feature.identity.shared.domain.model.AuthenticationConfig> provider, com.paypal.oslo.feature.identity.storage.IdentityTokenStorage identityTokenStorage, java.util.Set<kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.login.domain.model.LoginRequest, com.paypal.oslo.feature.identity.login.data.BuilderResult>> set, com.paypal.oslo.feature.identity.login.domain.BindSchemeProvider bindSchemeProvider, com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.GetRememberedUserUseCase getRememberedUserUseCase, com.paypal.oslo.feature.identity.checkoutdataprovider.domain.datastore.CheckoutInputDataStore checkoutInputDataStore, com.paypal.oslo.feature.identity.checkoutdataprovider.domain.datastore.CheckoutOutputDataStore checkoutOutputDataStore, com.paypal.oslo.feature.identity.checkoutdataprovider.domain.datastore.AuthCodeDataStore authCodeDataStore, com.paypal.oslo.feature.identity.login.ElapsedRealtimeProvider elapsedRealtimeProvider, com.paypal.oslo.feature.identity.shared.data.mapper.GraphQLErrorMapper graphQLErrorMapper, com.paypal.oslo.feature.identity.sso.domain.repository.checkout.CheckoutWebSSOIntentStore checkoutWebSSOIntentStore) {
        return new com.paypal.oslo.feature.identity.login.data.repository.LoginRepositoryImpl(lazy, provider, identityTokenStorage, set, bindSchemeProvider, getRememberedUserUseCase, checkoutInputDataStore, checkoutOutputDataStore, authCodeDataStore, elapsedRealtimeProvider, graphQLErrorMapper, checkoutWebSSOIntentStore);
    }
}
