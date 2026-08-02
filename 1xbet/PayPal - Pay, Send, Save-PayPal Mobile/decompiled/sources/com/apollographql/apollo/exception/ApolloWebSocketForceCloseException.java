package com.apollographql.apollo.exception;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/apollographql/apollo/exception/ApolloWebSocketForceCloseException;", "Lcom/apollographql/apollo/exception/ApolloException;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ApolloWebSocketForceCloseException extends com.apollographql.apollo.exception.ApolloException {
    public static final com.apollographql.apollo.exception.ApolloWebSocketForceCloseException INSTANCE = new com.apollographql.apollo.exception.ApolloWebSocketForceCloseException();

    public final int hashCode() {
        return 1630789127;
    }

    private ApolloWebSocketForceCloseException() {
        super("closeConnection() was called", null, 2, null);
    }

    @Override // java.lang.Throwable
    public final java.lang.String toString() {
        return "ApolloWebSocketForceCloseException";
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.apollographql.apollo.exception.ApolloWebSocketForceCloseException)) {
            return false;
        }
        return true;
    }
}
