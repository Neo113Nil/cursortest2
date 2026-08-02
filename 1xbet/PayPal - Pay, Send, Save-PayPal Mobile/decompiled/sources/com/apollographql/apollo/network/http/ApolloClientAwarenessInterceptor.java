package com.apollographql.apollo.network.http;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/apollographql/apollo/network/http/ApolloClientAwarenessInterceptor;", "Lcom/apollographql/apollo/network/http/HttpInterceptor;", "", "clientName", "clientVersion", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/apollographql/apollo/api/http/HttpRequest;", "request", "Lcom/apollographql/apollo/network/http/HttpInterceptorChain;", "chain", "Lcom/apollographql/apollo/api/http/HttpResponse;", "intercept", "(Lcom/apollographql/apollo/api/http/HttpRequest;Lcom/apollographql/apollo/network/http/HttpInterceptorChain;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/apollographql/apollo/api/http/HttpHeader;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/List;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ApolloClientAwarenessInterceptor implements com.apollographql.apollo.network.http.HttpInterceptor {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.List<com.apollographql.apollo.api.http.HttpHeader> getHighSpeedVideoFpsRanges;

    public ApolloClientAwarenessInterceptor(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.getHighSpeedVideoFpsRanges = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.http.HttpHeader[]{new com.apollographql.apollo.api.http.HttpHeader("apollographql-client-name", str), new com.apollographql.apollo.api.http.HttpHeader("apollographql-client-version", str2)});
    }

    @Override // com.apollographql.apollo.network.http.HttpInterceptor
    public final java.lang.Object intercept(com.apollographql.apollo.api.http.HttpRequest httpRequest, com.apollographql.apollo.network.http.HttpInterceptorChain httpInterceptorChain, kotlin.coroutines.Continuation<? super com.apollographql.apollo.api.http.HttpResponse> continuation) {
        return httpInterceptorChain.proceed(com.apollographql.apollo.api.http.HttpRequest.newBuilder$default(httpRequest, null, null, 3, null).addHeaders(this.getHighSpeedVideoFpsRanges).build(), continuation);
    }
}
