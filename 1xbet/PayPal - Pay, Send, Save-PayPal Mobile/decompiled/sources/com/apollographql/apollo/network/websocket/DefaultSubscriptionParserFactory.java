package com.apollographql.apollo.network.websocket;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0016¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/apollographql/apollo/network/websocket/DefaultSubscriptionParserFactory;", "Lcom/apollographql/apollo/network/websocket/SubscriptionParserFactory;", "<init>", "()V", "Lcom/apollographql/apollo/api/Operation$Data;", "D", "Lcom/apollographql/apollo/api/ApolloRequest;", "p0", "Lcom/apollographql/apollo/network/websocket/SubscriptionParser;", "createParser", "(Lcom/apollographql/apollo/api/ApolloRequest;)Lcom/apollographql/apollo/network/websocket/SubscriptionParser;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class DefaultSubscriptionParserFactory implements com.apollographql.apollo.network.websocket.SubscriptionParserFactory {
    public static final com.apollographql.apollo.network.websocket.DefaultSubscriptionParserFactory INSTANCE = new com.apollographql.apollo.network.websocket.DefaultSubscriptionParserFactory();

    private DefaultSubscriptionParserFactory() {
    }

    @Override // com.apollographql.apollo.network.websocket.SubscriptionParserFactory
    public final <D extends com.apollographql.apollo.api.Operation.Data> com.apollographql.apollo.network.websocket.SubscriptionParser<D> createParser(com.apollographql.apollo.api.ApolloRequest<D> p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        return new com.apollographql.apollo.network.websocket.DefaultSubscriptionParser(p0);
    }
}
