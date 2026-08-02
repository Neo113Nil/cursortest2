package com.paypal.oslo.feature.inappcheckout.di;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJL\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\f2\u0011\u0010\u0017\u001a\r\u0012\t\u0012\u00070\u0015¢\u0006\u0002\b\u00160\u00142\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001b\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/di/CheckoutGraphQlModule;", "", "<init>", "()V", "Lcom/paypal/oslo/core/network/graphql/config/GraphQlConfig;", "checkoutConfig", "Lcom/apollographql/apollo/api/http/DefaultHttpRequestComposer;", "provideDefaultHttpRequestComposer", "(Lcom/paypal/oslo/core/network/graphql/config/GraphQlConfig;)Lcom/apollographql/apollo/api/http/DefaultHttpRequestComposer;", "defaultComposer", "Lcom/paypal/oslo/core/security/RiskDataProvider;", "riskDataProvider", "Lcom/apollographql/apollo/api/http/HttpRequestComposer;", "provideHttpRequestComposer", "(Lcom/apollographql/apollo/api/http/DefaultHttpRequestComposer;Lcom/paypal/oslo/core/security/RiskDataProvider;)Lcom/apollographql/apollo/api/http/HttpRequestComposer;", "Lcom/paypal/oslo/core/network/http/DynamicOkHttpClientProvider;", "provider", "Landroid/content/Context;", "context", "httpRequestComposer", "", "Lcom/apollographql/apollo/interceptor/ApolloInterceptor;", "Lkotlin/jvm/JvmSuppressWildcards;", "pluginInterceptors", "Lcom/paypal/oslo/core/network/graphql/ApolloStoreFactory;", "storeFactory", "Lcom/apollographql/apollo/ApolloClient;", "provideApolloClient", "(Lcom/paypal/oslo/core/network/http/DynamicOkHttpClientProvider;Landroid/content/Context;Lcom/paypal/oslo/core/network/graphql/config/GraphQlConfig;Lcom/apollographql/apollo/api/http/HttpRequestComposer;Ljava/util/Set;Lcom/paypal/oslo/core/network/graphql/ApolloStoreFactory;)Lcom/apollographql/apollo/ApolloClient;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes5.dex */
public final class CheckoutGraphQlModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.inappcheckout.di.CheckoutGraphQlModule INSTANCE = new com.paypal.oslo.feature.inappcheckout.di.CheckoutGraphQlModule();

    private CheckoutGraphQlModule() {
    }

    @dagger.Provides
    public final com.apollographql.apollo.api.http.DefaultHttpRequestComposer provideDefaultHttpRequestComposer(com.paypal.oslo.core.network.graphql.config.GraphQlConfig checkoutConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutConfig, "");
        return new com.apollographql.apollo.api.http.DefaultHttpRequestComposer(checkoutConfig.getBaseUrl());
    }

    @dagger.Provides
    public final com.apollographql.apollo.api.http.HttpRequestComposer provideHttpRequestComposer(com.apollographql.apollo.api.http.DefaultHttpRequestComposer defaultComposer, com.paypal.oslo.core.security.RiskDataProvider riskDataProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultComposer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(riskDataProvider, "");
        return new com.paypal.oslo.core.network.graphql.RiskDataHttpRequestComposer(defaultComposer, riskDataProvider);
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final com.apollographql.apollo.ApolloClient provideApolloClient(com.paypal.oslo.core.network.http.DynamicOkHttpClientProvider provider, @dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context, com.paypal.oslo.core.network.graphql.config.GraphQlConfig checkoutConfig, com.apollographql.apollo.api.http.HttpRequestComposer httpRequestComposer, java.util.Set<com.apollographql.apollo.interceptor.ApolloInterceptor> pluginInterceptors, com.paypal.oslo.core.network.graphql.ApolloStoreFactory storeFactory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestComposer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pluginInterceptors, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storeFactory, "");
        return com.paypal.oslo.core.network.graphql.ApolloClientFactory.create$default(com.paypal.oslo.core.network.graphql.ApolloClientFactory.INSTANCE, provider.getCallFactory(), storeFactory.createOrNull(context, checkoutConfig), checkoutConfig, httpRequestComposer, pluginInterceptors, null, 32, null);
    }
}
