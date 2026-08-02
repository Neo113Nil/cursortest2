package com.apollographql.apollo.exception;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\n"}, d2 = {"Lcom/apollographql/apollo/exception/ApolloNetworkException;", "Lcom/apollographql/apollo/exception/ApolloException;", "", "message", "", "platformCause", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "Ljava/lang/Object;", "getPlatformCause", "()Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ApolloNetworkException extends com.apollographql.apollo.exception.ApolloException {
    private final java.lang.Object platformCause;

    public /* synthetic */ ApolloNetworkException(java.lang.String str, java.lang.Object obj, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : obj);
    }

    public final java.lang.Object getPlatformCause() {
        return this.platformCause;
    }

    public ApolloNetworkException(java.lang.String str, java.lang.Object obj) {
        super(str, obj instanceof java.lang.Throwable ? (java.lang.Throwable) obj : null, null);
        this.platformCause = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ApolloNetworkException() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
