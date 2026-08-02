package com.paypal.oslo.feature.identity.shared.di;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/identity/shared/di/ConfigModule;", "", "<init>", "()V", "Lcom/paypal/oslo/core/identity/config/AuthConfigProvider;", "authConfigProvider", "Lcom/paypal/oslo/feature/identity/shared/domain/model/AuthenticationConfig;", "provideAuthenticationConfig", "(Lcom/paypal/oslo/core/identity/config/AuthConfigProvider;)Lcom/paypal/oslo/feature/identity/shared/domain/model/AuthenticationConfig;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes5.dex */
public final class ConfigModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.identity.shared.di.ConfigModule INSTANCE = new com.paypal.oslo.feature.identity.shared.di.ConfigModule();

    private ConfigModule() {
    }

    @dagger.Provides
    public final com.paypal.oslo.feature.identity.shared.domain.model.AuthenticationConfig provideAuthenticationConfig(com.paypal.oslo.core.identity.config.AuthConfigProvider authConfigProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authConfigProvider, "");
        return com.paypal.oslo.feature.identity.shared.data.mapper.AuthenticationConfigMapperKt.toAuthenticationConfig(authConfigProvider.getConfig());
    }
}
