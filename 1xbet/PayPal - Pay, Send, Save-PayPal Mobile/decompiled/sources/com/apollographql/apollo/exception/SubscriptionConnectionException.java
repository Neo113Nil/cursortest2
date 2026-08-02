package com.apollographql.apollo.exception;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/apollographql/apollo/exception/SubscriptionConnectionException;", "Lcom/apollographql/apollo/exception/ApolloException;", "", "payload", "<init>", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "getPayload", "()Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SubscriptionConnectionException extends com.apollographql.apollo.exception.ApolloException {
    private final java.lang.Object payload;

    public final java.lang.Object getPayload() {
        return this.payload;
    }

    public SubscriptionConnectionException(java.lang.Object obj) {
        super("Subscription connection error", null, 2, null);
        this.payload = obj;
    }
}
