package com.paypal.oslo.core.network.graphql;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/ApolloClientFactory;", "", "<init>", "()V", "Lokhttp3/Call$Factory;", "callFactory", "Lcom/apollographql/apollo/cache/normalized/ApolloStore;", "apolloStore", "Lcom/paypal/oslo/core/network/graphql/config/GraphQlConfig;", "config", "Lcom/apollographql/apollo/api/http/HttpRequestComposer;", "httpRequestComposer", "", "Lcom/apollographql/apollo/interceptor/ApolloInterceptor;", "pluginInterceptors", "Lcom/apollographql/apollo/cache/normalized/FetchPolicy;", "defaultFetchPolicy", "Lcom/apollographql/apollo/ApolloClient;", "create", "(Lokhttp3/Call$Factory;Lcom/apollographql/apollo/cache/normalized/ApolloStore;Lcom/paypal/oslo/core/network/graphql/config/GraphQlConfig;Lcom/apollographql/apollo/api/http/HttpRequestComposer;Ljava/util/Set;Lcom/apollographql/apollo/cache/normalized/FetchPolicy;)Lcom/apollographql/apollo/ApolloClient;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ApolloClientFactory {
    public static final com.paypal.oslo.core.network.graphql.ApolloClientFactory INSTANCE = new com.paypal.oslo.core.network.graphql.ApolloClientFactory();

    private ApolloClientFactory() {
    }

    public static /* synthetic */ com.apollographql.apollo.ApolloClient create$default(com.paypal.oslo.core.network.graphql.ApolloClientFactory apolloClientFactory, okhttp3.Call.Factory factory, com.apollographql.apollo.cache.normalized.ApolloStore apolloStore, com.paypal.oslo.core.network.graphql.config.GraphQlConfig graphQlConfig, com.apollographql.apollo.api.http.HttpRequestComposer httpRequestComposer, java.util.Set set, com.apollographql.apollo.cache.normalized.FetchPolicy fetchPolicy, int i, java.lang.Object obj) {
        if ((i & 32) != 0) {
            fetchPolicy = com.apollographql.apollo.cache.normalized.FetchPolicy.NetworkFirst;
        }
        return apolloClientFactory.create(factory, apolloStore, graphQlConfig, httpRequestComposer, set, fetchPolicy);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.apollographql.apollo.ApolloClient create(okhttp3.Call.Factory callFactory, com.apollographql.apollo.cache.normalized.ApolloStore apolloStore, com.paypal.oslo.core.network.graphql.config.GraphQlConfig config, com.apollographql.apollo.api.http.HttpRequestComposer httpRequestComposer, java.util.Set<? extends com.apollographql.apollo.interceptor.ApolloInterceptor> pluginInterceptors, com.apollographql.apollo.cache.normalized.FetchPolicy defaultFetchPolicy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callFactory, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestComposer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pluginInterceptors, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultFetchPolicy, "");
        com.apollographql.apollo.network.http.HttpNetworkTransport build = new com.apollographql.apollo.network.http.HttpNetworkTransport.Builder().httpEngine(com.apollographql.apollo.network.http.DefaultHttpEngine.DefaultHttpEngine(callFactory)).httpRequestComposer(httpRequestComposer).addInterceptor(new com.apollographql.apollo.network.http.ApolloClientAwarenessInterceptor(config.getClientName(), config.getAppVersion())).build();
        com.apollographql.apollo.ApolloClient.Builder builder = new com.apollographql.apollo.ApolloClient.Builder();
        builder.addInterceptor(new com.paypal.oslo.core.network.graphql.interceptor.FeatureModuleInterceptor(null, 1, 0 == true ? 1 : 0));
        java.util.Iterator<T> it = pluginInterceptors.iterator();
        while (it.hasNext()) {
            builder.addInterceptor((com.apollographql.apollo.interceptor.ApolloInterceptor) it.next());
        }
        com.apollographql.apollo.ApolloClient.Builder builder2 = builder;
        com.apollographql.apollo.cache.normalized.NormalizedCache.fetchPolicy(builder2, defaultFetchPolicy);
        com.apollographql.apollo.cache.normalized.NormalizedCache.memoryCacheOnly(builder2, true);
        builder.networkTransport(build);
        if (apolloStore != null) {
            com.apollographql.apollo.cache.normalized.NormalizedCache.store$default(builder, apolloStore, false, 2, null);
        }
        builder.addInterceptor(new com.paypal.oslo.core.network.graphql.interceptor.OperationTrackingInterceptor());
        if (config.getPersistedQueriesEnabled().getValue().booleanValue()) {
            com.apollographql.apollo.ApolloClient.Builder.autoPersistedQueries$default(builder, com.apollographql.apollo.api.http.HttpMethod.Post, com.apollographql.apollo.api.http.HttpMethod.Post, false, 4, null);
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.core.network.graphql.LoggerKt.log, "Auto-persisted queries enabled via configuration with POST method", null, null, 6, null);
        } else {
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.core.network.graphql.LoggerKt.log, "Auto-persisted queries disabled via configuration - using normal queries", null, null, 6, null);
        }
        com.apollographql.apollo.ApolloClient build2 = builder.build();
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.core.network.graphql.LoggerKt.log, "ApolloClient initialization completed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("client_name", config.getClientName()), kotlin.TuplesKt.to(com.paypal.oslo.feature.invoicing.domain.InvoiceUrlBuilder.QUERY_PARAM_APP_VERSION, config.getAppVersion()), kotlin.TuplesKt.to("base_url", config.getBaseUrl()), kotlin.TuplesKt.to("plugin_interceptors_count", java.lang.Integer.valueOf(pluginInterceptors.size()))), null, 4, null);
        return build2;
    }
}
