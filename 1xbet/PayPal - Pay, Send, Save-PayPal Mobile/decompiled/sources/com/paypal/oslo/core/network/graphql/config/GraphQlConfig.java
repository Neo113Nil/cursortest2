package com.paypal.oslo.core.network.graphql.config;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0004R\u0014\u0010\u0012\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0004À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/config/GraphQlConfig;", "", "", "getBaseUrl", "()Ljava/lang/String;", "baseUrl", "Lcom/paypal/oslo/core/network/graphql/config/GraphQlCacheType;", "getCacheType", "()Lcom/paypal/oslo/core/network/graphql/config/GraphQlCacheType;", "cacheType", "Lkotlinx/coroutines/flow/StateFlow;", "", "getPersistedQueriesEnabled", "()Lkotlinx/coroutines/flow/StateFlow;", "persistedQueriesEnabled", "getClientName", "clientName", "getAppVersion", "appVersion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface GraphQlConfig {
    java.lang.String getAppVersion();

    java.lang.String getBaseUrl();

    com.paypal.oslo.core.network.graphql.config.GraphQlCacheType getCacheType();

    java.lang.String getClientName();

    kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> getPersistedQueriesEnabled();
}
