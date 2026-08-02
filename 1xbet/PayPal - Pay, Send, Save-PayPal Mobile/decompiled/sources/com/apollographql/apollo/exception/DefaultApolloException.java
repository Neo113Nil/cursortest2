package com.apollographql.apollo.exception;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/apollographql/apollo/exception/DefaultApolloException;", "Lcom/apollographql/apollo/exception/ApolloException;", "", "message", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DefaultApolloException extends com.apollographql.apollo.exception.ApolloException {
    public DefaultApolloException(java.lang.String str, java.lang.Throwable th) {
        super(str, th, null);
    }

    public /* synthetic */ DefaultApolloException(java.lang.String str, java.lang.Throwable th, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultApolloException() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
