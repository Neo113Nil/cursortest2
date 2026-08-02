package com.apollographql.apollo.exception;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lcom/apollographql/apollo/exception/RouterError;", "Lcom/apollographql/apollo/exception/ApolloException;", "", "Lcom/apollographql/apollo/api/Error;", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ERRORS_KEY, "<init>", "(Ljava/util/List;)V", "Ljava/util/List;", "getErrors", "()Ljava/util/List;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RouterError extends com.apollographql.apollo.exception.ApolloException {
    private final java.util.List<com.apollographql.apollo.api.Error> errors;

    public final java.util.List<com.apollographql.apollo.api.Error> getErrors() {
        return this.errors;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public RouterError(java.util.List<com.apollographql.apollo.api.Error> list) {
        super(r0.toString(), null, 2, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Router error(s) (first: '");
        com.apollographql.apollo.api.Error error = (com.apollographql.apollo.api.Error) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) list);
        sb.append(error != null ? error.getMessage() : null);
        sb.append("')");
        this.errors = list;
    }
}
