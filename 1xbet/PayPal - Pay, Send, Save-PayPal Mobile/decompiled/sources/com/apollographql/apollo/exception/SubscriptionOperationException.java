package com.apollographql.apollo.exception;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\n"}, d2 = {"Lcom/apollographql/apollo/exception/SubscriptionOperationException;", "Lcom/apollographql/apollo/exception/ApolloException;", "", "operationName", "", "payload", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "Ljava/lang/Object;", "getPayload", "()Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SubscriptionOperationException extends com.apollographql.apollo.exception.ApolloException {
    private final java.lang.Object payload;

    public final java.lang.Object getPayload() {
        return this.payload;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriptionOperationException(java.lang.String str, java.lang.Object obj) {
        super("Operation error ".concat(java.lang.String.valueOf(str)), null, 2, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.payload = obj;
    }
}
