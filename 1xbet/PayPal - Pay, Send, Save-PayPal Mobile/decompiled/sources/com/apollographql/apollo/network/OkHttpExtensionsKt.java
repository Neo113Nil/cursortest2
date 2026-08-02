package com.apollographql.apollo.network;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0019\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0004\b\u0006\u0010\t\u001a\u0019\u0010\u0002\u001a\u00020\n*\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0002\u0010\u000b\u001a\u0019\u0010\u0006\u001a\u00020\n*\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\f\u001a\u0019\u0010\u0002\u001a\u00020\r*\u00020\r2\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0002\u0010\u000e\u001a\u0019\u0010\u0012\u001a\u00020\u0011*\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0000¢\u0006\u0004\b\u0012\u0010\u0013\"\u001b\u0010\u0019\u001a\u00020\u00148AX\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/apollographql/apollo/ApolloClient$Builder;", "Lokhttp3/OkHttpClient;", "okHttpClient", "(Lcom/apollographql/apollo/ApolloClient$Builder;Lokhttp3/OkHttpClient;)Lcom/apollographql/apollo/ApolloClient$Builder;", "Lokhttp3/Call$Factory;", "callFactory", "okHttpCallFactory", "(Lcom/apollographql/apollo/ApolloClient$Builder;Lokhttp3/Call$Factory;)Lcom/apollographql/apollo/ApolloClient$Builder;", "Lkotlin/Function0;", "(Lcom/apollographql/apollo/ApolloClient$Builder;Lkotlin/jvm/functions/Function0;)Lcom/apollographql/apollo/ApolloClient$Builder;", "Lcom/apollographql/apollo/network/http/HttpNetworkTransport$Builder;", "(Lcom/apollographql/apollo/network/http/HttpNetworkTransport$Builder;Lokhttp3/OkHttpClient;)Lcom/apollographql/apollo/network/http/HttpNetworkTransport$Builder;", "(Lcom/apollographql/apollo/network/http/HttpNetworkTransport$Builder;Lokhttp3/Call$Factory;)Lcom/apollographql/apollo/network/http/HttpNetworkTransport$Builder;", "Lcom/apollographql/apollo/network/ws/WebSocketNetworkTransport$Builder;", "(Lcom/apollographql/apollo/network/ws/WebSocketNetworkTransport$Builder;Lokhttp3/OkHttpClient;)Lcom/apollographql/apollo/network/ws/WebSocketNetworkTransport$Builder;", "", "Lcom/apollographql/apollo/api/http/HttpHeader;", "Lokhttp3/Headers;", "toOkHttpHeaders", "(Ljava/util/List;)Lokhttp3/Headers;", "Lokhttp3/OkHttpClient$Builder;", "defaultOkHttpClientBuilder$delegate", "Lkotlin/Lazy;", "getDefaultOkHttpClientBuilder", "()Lokhttp3/OkHttpClient$Builder;", "defaultOkHttpClientBuilder"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OkHttpExtensionsKt {
    private static final kotlin.Lazy defaultOkHttpClientBuilder$delegate = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.apollographql.apollo.network.OkHttpExtensionsKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.apollographql.apollo.network.OkHttpExtensionsKt.$r8$lambda$LlIceTGUIRPU2jfnIy4st0Xgqa4();
        }
    });

    public static final com.apollographql.apollo.ApolloClient.Builder okHttpClient(com.apollographql.apollo.ApolloClient.Builder builder, okhttp3.OkHttpClient okHttpClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(okHttpClient, "");
        builder.httpEngine(com.apollographql.apollo.network.http.DefaultHttpEngine.DefaultHttpEngine(okHttpClient));
        builder.webSocketEngine(new com.apollographql.apollo.network.ws.DefaultWebSocketEngine(okHttpClient));
        return builder;
    }

    public static final com.apollographql.apollo.ApolloClient.Builder okHttpCallFactory(com.apollographql.apollo.ApolloClient.Builder builder, okhttp3.Call.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        builder.httpEngine(com.apollographql.apollo.network.http.DefaultHttpEngine.DefaultHttpEngine(factory));
        return builder;
    }

    public static final com.apollographql.apollo.ApolloClient.Builder okHttpCallFactory(com.apollographql.apollo.ApolloClient.Builder builder, kotlin.jvm.functions.Function0<? extends okhttp3.Call.Factory> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        builder.httpEngine(com.apollographql.apollo.network.http.DefaultHttpEngine.DefaultHttpEngine(function0));
        return builder;
    }

    public static final com.apollographql.apollo.network.http.HttpNetworkTransport.Builder okHttpClient(com.apollographql.apollo.network.http.HttpNetworkTransport.Builder builder, okhttp3.OkHttpClient okHttpClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(okHttpClient, "");
        builder.httpEngine(com.apollographql.apollo.network.http.DefaultHttpEngine.DefaultHttpEngine(okHttpClient));
        return builder;
    }

    public static final com.apollographql.apollo.network.http.HttpNetworkTransport.Builder okHttpCallFactory(com.apollographql.apollo.network.http.HttpNetworkTransport.Builder builder, okhttp3.Call.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        builder.httpEngine(com.apollographql.apollo.network.http.DefaultHttpEngine.DefaultHttpEngine(factory));
        return builder;
    }

    public static final com.apollographql.apollo.network.ws.WebSocketNetworkTransport.Builder okHttpClient(com.apollographql.apollo.network.ws.WebSocketNetworkTransport.Builder builder, okhttp3.OkHttpClient okHttpClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(okHttpClient, "");
        builder.webSocketEngine(new com.apollographql.apollo.network.ws.DefaultWebSocketEngine(okHttpClient));
        return builder;
    }

    public static final okhttp3.Headers toOkHttpHeaders(java.util.List<com.apollographql.apollo.api.http.HttpHeader> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        okhttp3.Headers.Builder builder = new okhttp3.Headers.Builder();
        for (com.apollographql.apollo.api.http.HttpHeader httpHeader : list) {
            builder.add(httpHeader.getName(), httpHeader.getValue());
        }
        return builder.build();
    }

    public static final okhttp3.OkHttpClient.Builder getDefaultOkHttpClientBuilder() {
        return (okhttp3.OkHttpClient.Builder) defaultOkHttpClientBuilder$delegate.getValue();
    }

    public static /* synthetic */ okhttp3.OkHttpClient.Builder $r8$lambda$LlIceTGUIRPU2jfnIy4st0Xgqa4() {
        return new okhttp3.OkHttpClient.Builder();
    }
}
