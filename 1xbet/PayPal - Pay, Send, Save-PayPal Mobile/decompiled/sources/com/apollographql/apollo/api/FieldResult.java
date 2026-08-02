package com.apollographql.apollo.api;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/apollographql/apollo/api/FieldResult;", "V", "", "Success", "Failure", "Lcom/apollographql/apollo/api/FieldResult$Failure;", "Lcom/apollographql/apollo/api/FieldResult$Success;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface FieldResult<V> {

    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00028\u00018\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/apollographql/apollo/api/FieldResult$Success;", "V", "Lcom/apollographql/apollo/api/FieldResult;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Success<V> implements com.apollographql.apollo.api.FieldResult<V> {
        private final V value;

        public Success(V v) {
            this.value = v;
        }

        public final V getValue() {
            return this.value;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lcom/apollographql/apollo/api/FieldResult$Failure;", "Lcom/apollographql/apollo/api/FieldResult;", "", "Lcom/apollographql/apollo/exception/ApolloException;", "exception", "<init>", "(Lcom/apollographql/apollo/exception/ApolloException;)V", "Lcom/apollographql/apollo/exception/ApolloException;", "getException", "()Lcom/apollographql/apollo/exception/ApolloException;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Failure implements com.apollographql.apollo.api.FieldResult {
        private final com.apollographql.apollo.exception.ApolloException exception;

        public Failure(com.apollographql.apollo.exception.ApolloException apolloException) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloException, "");
            this.exception = apolloException;
        }

        public final com.apollographql.apollo.exception.ApolloException getException() {
            return this.exception;
        }
    }
}
