package com.paypal.oslo.core.network.graphql.di;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/di/HttpRequestComposerModule;", "", "<init>", "()V", "Lcom/paypal/oslo/core/network/graphql/config/GraphQlConfig;", "config", "Lcom/apollographql/apollo/api/http/DefaultHttpRequestComposer;", "provideDefaultHttpRequestComposer", "(Lcom/paypal/oslo/core/network/graphql/config/GraphQlConfig;)Lcom/apollographql/apollo/api/http/DefaultHttpRequestComposer;", "defaultComposer", "Lcom/paypal/oslo/core/security/RiskDataProvider;", "riskDataProvider", "Lcom/apollographql/apollo/api/http/HttpRequestComposer;", "provideHttpRequestComposer", "(Lcom/apollographql/apollo/api/http/DefaultHttpRequestComposer;Lcom/paypal/oslo/core/security/RiskDataProvider;)Lcom/apollographql/apollo/api/http/HttpRequestComposer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes4.dex */
public final class HttpRequestComposerModule {
    public static final com.paypal.oslo.core.network.graphql.di.HttpRequestComposerModule INSTANCE = new com.paypal.oslo.core.network.graphql.di.HttpRequestComposerModule();

    private HttpRequestComposerModule() {
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final com.apollographql.apollo.api.http.DefaultHttpRequestComposer provideDefaultHttpRequestComposer(com.paypal.oslo.core.network.graphql.config.GraphQlConfig config) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
        return new com.apollographql.apollo.api.http.DefaultHttpRequestComposer(config.getBaseUrl());
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final com.apollographql.apollo.api.http.HttpRequestComposer provideHttpRequestComposer(com.apollographql.apollo.api.http.DefaultHttpRequestComposer defaultComposer, com.paypal.oslo.core.security.RiskDataProvider riskDataProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultComposer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(riskDataProvider, "");
        return new com.paypal.oslo.core.network.graphql.RiskDataHttpRequestComposer(defaultComposer, riskDataProvider);
    }
}
