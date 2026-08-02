package com.paypal.oslo.app.di;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\nÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/app/di/AuthEnvironmentModule;", "", "Lcom/paypal/oslo/app/config/AuthConfigProviderImpl;", "impl", "Lcom/paypal/oslo/core/identity/config/AuthConfigProvider;", "bindAuthConfigProvider", "(Lcom/paypal/oslo/app/config/AuthConfigProviderImpl;)Lcom/paypal/oslo/core/identity/config/AuthConfigProvider;", "Lcom/paypal/oslo/app/identity/AppTokenProvider;", "Lcom/paypal/oslo/core/identity/domain/TokenProvider;", "bindAppTokenProvider", "(Lcom/paypal/oslo/app/identity/AppTokenProvider;)Lcom/paypal/oslo/core/identity/domain/TokenProvider;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes10.dex */
public interface AuthEnvironmentModule {
    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.core.identity.domain.TokenProvider bindAppTokenProvider(com.paypal.oslo.app.identity.AppTokenProvider impl);

    @dagger.Binds
    com.paypal.oslo.core.identity.config.AuthConfigProvider bindAuthConfigProvider(com.paypal.oslo.app.config.AuthConfigProviderImpl impl);
}
