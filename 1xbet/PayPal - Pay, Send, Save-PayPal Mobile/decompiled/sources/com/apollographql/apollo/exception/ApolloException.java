package com.apollographql.apollo.exception;

@kotlin.Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00060\u0001j\u0002`\u0002B!\b\u0004\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b\u0082\u0001\u0013\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b"}, d2 = {"Lcom/apollographql/apollo/exception/ApolloException;", "Ljava/lang/RuntimeException;", "Lkotlin/getHighSpeedVideoFpsRangesFor;", "", "p0", "", "p1", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "Lcom/apollographql/apollo/exception/ApolloCompositeException;", "Lcom/apollographql/apollo/exception/ApolloGraphQLException;", "Lcom/apollographql/apollo/exception/ApolloHttpException;", "Lcom/apollographql/apollo/exception/ApolloNetworkException;", "Lcom/apollographql/apollo/exception/ApolloParseException;", "Lcom/apollographql/apollo/exception/ApolloWebSocketClosedException;", "Lcom/apollographql/apollo/exception/ApolloWebSocketForceCloseException;", "Lcom/apollographql/apollo/exception/AutoPersistedQueriesNotSupported;", "Lcom/apollographql/apollo/exception/CacheMissException;", "Lcom/apollographql/apollo/exception/DefaultApolloException;", "Lcom/apollographql/apollo/exception/HttpCacheMissException;", "Lcom/apollographql/apollo/exception/JsonDataException;", "Lcom/apollographql/apollo/exception/JsonEncodingException;", "Lcom/apollographql/apollo/exception/MissingValueException;", "Lcom/apollographql/apollo/exception/NoDataException;", "Lcom/apollographql/apollo/exception/NullOrMissingField;", "Lcom/apollographql/apollo/exception/RouterError;", "Lcom/apollographql/apollo/exception/SubscriptionConnectionException;", "Lcom/apollographql/apollo/exception/SubscriptionOperationException;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class ApolloException extends java.lang.RuntimeException {
    private ApolloException(java.lang.String str, java.lang.Throwable th) {
        super(str, th);
    }

    public /* synthetic */ ApolloException(java.lang.String str, java.lang.Throwable th, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : th, null);
    }

    public /* synthetic */ ApolloException(java.lang.String str, java.lang.Throwable th, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, th);
    }
}
