package com.apollographql.apollo.network.http;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00060\u0001j\u0002`\u0002J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H¦@¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/apollographql/apollo/network/http/HttpEngine;", "Ljava/io/Closeable;", "Lokio/getOutputFormats;", "Lcom/apollographql/apollo/api/http/HttpRequest;", "request", "Lcom/apollographql/apollo/api/http/HttpResponse;", "execute", "(Lcom/apollographql/apollo/api/http/HttpRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "dispose", "()V", "close"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface HttpEngine extends java.io.Closeable {
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Use close", replaceWith = @kotlin.ReplaceWith(expression = "close()", imports = {}))
    default void dispose() {
    }

    java.lang.Object execute(com.apollographql.apollo.api.http.HttpRequest httpRequest, kotlin.coroutines.Continuation<? super com.apollographql.apollo.api.http.HttpResponse> continuation) throws com.apollographql.apollo.exception.ApolloNetworkException, java.util.concurrent.CancellationException;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    default void close() {
        dispose();
    }
}
