package com.apollographql.apollo.internal;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u0007\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/apollographql/apollo/internal/ApolloClientListener;", "", "Lcom/apollographql/apollo/api/ApolloRequest;", "request", "", "requestStarted", "(Lcom/apollographql/apollo/api/ApolloRequest;)V", "requestCompleted"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ApolloClientListener {
    void requestCompleted(com.apollographql.apollo.api.ApolloRequest<?> request);

    void requestStarted(com.apollographql.apollo.api.ApolloRequest<?> request);
}
