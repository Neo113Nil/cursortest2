package com.apollographql.apollo.network.websocket;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003J'\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00062\u000e\u0010\u0005\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004H&¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/apollographql/apollo/network/websocket/SubscriptionParser;", "Lcom/apollographql/apollo/api/Operation$Data;", "D", "", "Lcom/apollographql/apollo/api/json/ApolloJsonElement;", "response", "Lcom/apollographql/apollo/api/ApolloResponse;", "parse", "(Ljava/lang/Object;)Lcom/apollographql/apollo/api/ApolloResponse;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface SubscriptionParser<D extends com.apollographql.apollo.api.Operation.Data> {
    com.apollographql.apollo.api.ApolloResponse<D> parse(java.lang.Object response);
}
