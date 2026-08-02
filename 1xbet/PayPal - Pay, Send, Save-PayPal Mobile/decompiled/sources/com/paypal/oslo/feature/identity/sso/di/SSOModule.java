package com.paypal.oslo.feature.identity.sso.di;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000bH'¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u000fH'¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0013H'¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u0017H'¢\u0006\u0004\b\u0019\u0010\u001aÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/identity/sso/di/SSOModule;", "", "Lcom/paypal/oslo/feature/identity/sso/data/repository/TokenToCodeRepositoryImpl;", "impl", "Lcom/paypal/oslo/feature/identity/sso/domain/repository/TokenToCodeRepository;", "bindTokenToCodeRepository", "(Lcom/paypal/oslo/feature/identity/sso/data/repository/TokenToCodeRepositoryImpl;)Lcom/paypal/oslo/feature/identity/sso/domain/repository/TokenToCodeRepository;", "Lcom/paypal/oslo/feature/identity/sso/IdentitySessionTransferImpl;", "Lcom/paypal/oslo/core/identity/domain/IdentitySessionTransfer;", "identitySessionTransferSSO", "(Lcom/paypal/oslo/feature/identity/sso/IdentitySessionTransferImpl;)Lcom/paypal/oslo/core/identity/domain/IdentitySessionTransfer;", "Lcom/paypal/oslo/feature/identity/sso/ExchangeTokenToCode;", "Lcom/paypal/oslo/feature/identity/api/TokenToCodeExchange;", "bindTokenToCodeExchange", "(Lcom/paypal/oslo/feature/identity/sso/ExchangeTokenToCode;)Lcom/paypal/oslo/feature/identity/api/TokenToCodeExchange;", "Lcom/paypal/oslo/feature/identity/sso/data/repository/CodeToTokenRepositoryImpl;", "Lcom/paypal/oslo/feature/identity/sso/domain/repository/CodeToTokenRepository;", "bindCodeToTokenRepository", "(Lcom/paypal/oslo/feature/identity/sso/data/repository/CodeToTokenRepositoryImpl;)Lcom/paypal/oslo/feature/identity/sso/domain/repository/CodeToTokenRepository;", "Lcom/paypal/oslo/feature/identity/sso/CodeToTokenExchangeImpl;", "Lcom/paypal/oslo/feature/identity/api/CodeToTokenExchange;", "bindCodeToTokenExchange", "(Lcom/paypal/oslo/feature/identity/sso/CodeToTokenExchangeImpl;)Lcom/paypal/oslo/feature/identity/api/CodeToTokenExchange;", "Lcom/paypal/oslo/feature/identity/sso/data/repository/checkout/CheckoutWebSSOIntentStoreImpl;", "Lcom/paypal/oslo/feature/identity/sso/domain/repository/checkout/CheckoutWebSSOIntentStore;", "bindCheckoutWebSSOIntentStore", "(Lcom/paypal/oslo/feature/identity/sso/data/repository/checkout/CheckoutWebSSOIntentStoreImpl;)Lcom/paypal/oslo/feature/identity/sso/domain/repository/checkout/CheckoutWebSSOIntentStore;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes13.dex */
public interface SSOModule {
    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.feature.identity.sso.domain.repository.checkout.CheckoutWebSSOIntentStore bindCheckoutWebSSOIntentStore(com.paypal.oslo.feature.identity.sso.data.repository.checkout.CheckoutWebSSOIntentStoreImpl impl);

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.feature.identity.api.CodeToTokenExchange bindCodeToTokenExchange(com.paypal.oslo.feature.identity.sso.CodeToTokenExchangeImpl impl);

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.feature.identity.sso.domain.repository.CodeToTokenRepository bindCodeToTokenRepository(com.paypal.oslo.feature.identity.sso.data.repository.CodeToTokenRepositoryImpl impl);

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.feature.identity.api.TokenToCodeExchange bindTokenToCodeExchange(com.paypal.oslo.feature.identity.sso.ExchangeTokenToCode impl);

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.feature.identity.sso.domain.repository.TokenToCodeRepository bindTokenToCodeRepository(com.paypal.oslo.feature.identity.sso.data.repository.TokenToCodeRepositoryImpl impl);

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.core.identity.domain.IdentitySessionTransfer identitySessionTransferSSO(com.paypal.oslo.feature.identity.sso.IdentitySessionTransferImpl impl);
}
