package com.apollographql.apollo.network.http;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0005"}, d2 = {"Lcom/apollographql/apollo/network/http/HttpEngine;", "", "url", "Lcom/apollographql/apollo/network/http/HttpCall;", "get", "(Lcom/apollographql/apollo/network/http/HttpEngine;Ljava/lang/String;)Lcom/apollographql/apollo/network/http/HttpCall;", "post"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HttpEngineKt {
    public static final com.apollographql.apollo.network.http.HttpCall get(com.apollographql.apollo.network.http.HttpEngine httpEngine, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpEngine, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return new com.apollographql.apollo.network.http.HttpCall(httpEngine, com.apollographql.apollo.api.http.HttpMethod.Get, str);
    }

    public static final com.apollographql.apollo.network.http.HttpCall post(com.apollographql.apollo.network.http.HttpEngine httpEngine, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpEngine, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return new com.apollographql.apollo.network.http.HttpCall(httpEngine, com.apollographql.apollo.api.http.HttpMethod.Post, str);
    }
}
