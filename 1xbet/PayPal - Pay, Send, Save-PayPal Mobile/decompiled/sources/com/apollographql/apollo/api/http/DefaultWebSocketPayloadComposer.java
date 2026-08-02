package com.apollographql.apollo.api.http;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/apollographql/apollo/api/http/DefaultWebSocketPayloadComposer;", "Lcom/apollographql/apollo/api/http/WebSocketPayloadComposer;", "<init>", "()V", "Lcom/apollographql/apollo/api/Operation$Data;", "D", "Lcom/apollographql/apollo/api/ApolloRequest;", "apolloRequest", "", "", "", "compose", "(Lcom/apollographql/apollo/api/ApolloRequest;)Ljava/util/Map;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DefaultWebSocketPayloadComposer implements com.apollographql.apollo.api.http.WebSocketPayloadComposer {
    @Override // com.apollographql.apollo.api.http.WebSocketPayloadComposer
    public final <D extends com.apollographql.apollo.api.Operation.Data> java.util.Map<java.lang.String, java.lang.Object> compose(com.apollographql.apollo.api.ApolloRequest<D> apolloRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloRequest, "");
        return com.apollographql.apollo.api.http.DefaultHttpRequestComposer.INSTANCE.composePayload(apolloRequest);
    }
}
