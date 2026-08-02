package com.apollographql.apollo.cache.normalized.internal;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u001a\u0010\u0001\u001a\u00020\u00008\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/apollographql/apollo/exception/DefaultApolloException;", "WatcherSentinel", "Lcom/apollographql/apollo/exception/DefaultApolloException;", "getWatcherSentinel", "()Lcom/apollographql/apollo/exception/DefaultApolloException;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WatcherInterceptorKt {
    private static final com.apollographql.apollo.exception.DefaultApolloException WatcherSentinel = new com.apollographql.apollo.exception.DefaultApolloException("The watcher has started", null, 2, null);

    public static final com.apollographql.apollo.exception.DefaultApolloException getWatcherSentinel() {
        return WatcherSentinel;
    }
}
