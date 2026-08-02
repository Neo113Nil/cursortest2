package com.paypal.oslo.core.identity.di;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\nH'¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000eH'¢\u0006\u0004\b\u000f\u0010\u0010À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/core/identity/di/AuthModule;", "", "Lcom/paypal/oslo/core/identity/AuthStateManager;", "impl", "Lcom/paypal/oslo/core/identity/AuthStateProvider;", "bindAuthStateProvider", "(Lcom/paypal/oslo/core/identity/AuthStateManager;)Lcom/paypal/oslo/core/identity/AuthStateProvider;", "Lcom/paypal/oslo/core/identity/AuthStateSetter;", "bindAuthStateSetter", "(Lcom/paypal/oslo/core/identity/AuthStateManager;)Lcom/paypal/oslo/core/identity/AuthStateSetter;", "Lcom/paypal/oslo/core/identity/AccessTokenInterceptor;", "Lokhttp3/Interceptor;", "bindAccessTokenInterceptor", "(Lcom/paypal/oslo/core/identity/AccessTokenInterceptor;)Lokhttp3/Interceptor;", "Lcom/paypal/oslo/core/identity/AccessTokenAuthenticator;", "bindAccessTokenAuthenticator", "(Lcom/paypal/oslo/core/identity/AccessTokenAuthenticator;)Lokhttp3/Interceptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes10.dex */
public interface AuthModule {
    @dagger.Binds
    @dagger.multibindings.IntoSet
    okhttp3.Interceptor bindAccessTokenAuthenticator(com.paypal.oslo.core.identity.AccessTokenAuthenticator impl);

    @dagger.Binds
    @dagger.multibindings.IntoSet
    okhttp3.Interceptor bindAccessTokenInterceptor(com.paypal.oslo.core.identity.AccessTokenInterceptor impl);

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.core.identity.AuthStateProvider bindAuthStateProvider(com.paypal.oslo.core.identity.AuthStateManager impl);

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.core.identity.AuthStateSetter bindAuthStateSetter(com.paypal.oslo.core.identity.AuthStateManager impl);
}
