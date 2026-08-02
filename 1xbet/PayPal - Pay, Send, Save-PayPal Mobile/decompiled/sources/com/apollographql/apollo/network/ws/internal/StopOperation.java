package com.apollographql.apollo.network.ws.internal;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\n"}, d2 = {"Lcom/apollographql/apollo/network/ws/internal/StopOperation;", "Lcom/apollographql/apollo/api/Operation$Data;", "D", "Lcom/apollographql/apollo/network/ws/internal/Command;", "Lcom/apollographql/apollo/api/ApolloRequest;", "request", "<init>", "(Lcom/apollographql/apollo/api/ApolloRequest;)V", "Lcom/apollographql/apollo/api/ApolloRequest;", "getRequest", "()Lcom/apollographql/apollo/api/ApolloRequest;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StopOperation<D extends com.apollographql.apollo.api.Operation.Data> implements com.apollographql.apollo.network.ws.internal.Command {
    private final com.apollographql.apollo.api.ApolloRequest<D> request;

    public StopOperation(com.apollographql.apollo.api.ApolloRequest<D> apolloRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloRequest, "");
        this.request = apolloRequest;
    }

    public final com.apollographql.apollo.api.ApolloRequest<D> getRequest() {
        return this.request;
    }
}
