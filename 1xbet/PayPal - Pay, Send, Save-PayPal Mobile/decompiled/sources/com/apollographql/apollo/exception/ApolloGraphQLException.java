package com.apollographql.apollo.exception;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\n\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0017\b\u0016\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\f\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/apollographql/apollo/exception/ApolloGraphQLException;", "Lcom/apollographql/apollo/exception/ApolloException;", "Lcom/apollographql/apollo/api/Error;", "error", "<init>", "(Lcom/apollographql/apollo/api/Error;)V", "", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ERRORS_KEY, "(Ljava/util/List;)V", "Lcom/apollographql/apollo/api/Error;", "getError", "()Lcom/apollographql/apollo/api/Error;", "Ljava/util/List;", "getErrors", "()Ljava/util/List;", "getErrors$annotations", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ApolloGraphQLException extends com.apollographql.apollo.exception.ApolloException {
    private final com.apollographql.apollo.api.Error error;
    private final java.util.List<com.apollographql.apollo.api.Error> errors;

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Use error instead")
    public static /* synthetic */ void getErrors$annotations() {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ApolloGraphQLException(com.apollographql.apollo.api.Error error) {
        super(r0.toString(), null, 2, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GraphQL error: '");
        sb.append(error.getMessage());
        sb.append('\'');
        this.error = error;
        this.errors = kotlin.collections.CollectionsKt.listOf(error);
    }

    public final com.apollographql.apollo.api.Error getError() {
        return this.error;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ApolloGraphQLException(java.util.List<com.apollographql.apollo.api.Error> list) {
        this((com.apollographql.apollo.api.Error) kotlin.collections.CollectionsKt.first((java.util.List) list));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
    }

    public final java.util.List<com.apollographql.apollo.api.Error> getErrors() {
        return this.errors;
    }
}
