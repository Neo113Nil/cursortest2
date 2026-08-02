package com.apollographql.apollo.api;

@kotlin.Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a%\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\t\u0010\n\u001a\u001f\u0010\f\u001a\u0004\u0018\u00010\u000b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\f\u0010\r\u001a\u001d\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u000e\u0010\u0006\"!\u0010\u0010\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00018G¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"V", "Lcom/apollographql/apollo/api/FieldResult;", "fallback", "getOrElse", "(Lcom/apollographql/apollo/api/FieldResult;Ljava/lang/Object;)Ljava/lang/Object;", "getOrNull", "(Lcom/apollographql/apollo/api/FieldResult;)Ljava/lang/Object;", "Ljava/lang/Exception;", "Lkotlin/getHighResolutionOutputSizeshNQ4ISI;", "exceptionOrNull", "(Lcom/apollographql/apollo/api/FieldResult;)Ljava/lang/Exception;", "Lcom/apollographql/apollo/api/Error;", "graphQLErrorOrNull", "(Lcom/apollographql/apollo/api/FieldResult;)Lcom/apollographql/apollo/api/Error;", "getOrThrow", "", "isSuccess", "(Lcom/apollographql/apollo/api/FieldResult;)Z"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FieldResultKt {
    public static final <V> boolean isSuccess(com.apollographql.apollo.api.FieldResult<? extends V> fieldResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fieldResult, "");
        return fieldResult instanceof com.apollographql.apollo.api.FieldResult.Success;
    }

    public static final <V> V getOrElse(com.apollographql.apollo.api.FieldResult<? extends V> fieldResult, V v) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fieldResult, "");
        return fieldResult instanceof com.apollographql.apollo.api.FieldResult.Success ? (V) ((com.apollographql.apollo.api.FieldResult.Success) fieldResult).getValue() : v;
    }

    public static final <V> V getOrNull(com.apollographql.apollo.api.FieldResult<? extends V> fieldResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fieldResult, "");
        if (fieldResult instanceof com.apollographql.apollo.api.FieldResult.Success) {
            return (V) ((com.apollographql.apollo.api.FieldResult.Success) fieldResult).getValue();
        }
        return null;
    }

    public static final <V> java.lang.Exception exceptionOrNull(com.apollographql.apollo.api.FieldResult<? extends V> fieldResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fieldResult, "");
        if (fieldResult instanceof com.apollographql.apollo.api.FieldResult.Failure) {
            return ((com.apollographql.apollo.api.FieldResult.Failure) fieldResult).getException();
        }
        return null;
    }

    public static final <V> com.apollographql.apollo.api.Error graphQLErrorOrNull(com.apollographql.apollo.api.FieldResult<? extends V> fieldResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fieldResult, "");
        java.lang.Exception exceptionOrNull = exceptionOrNull(fieldResult);
        com.apollographql.apollo.exception.ApolloGraphQLException apolloGraphQLException = exceptionOrNull instanceof com.apollographql.apollo.exception.ApolloGraphQLException ? (com.apollographql.apollo.exception.ApolloGraphQLException) exceptionOrNull : null;
        if (apolloGraphQLException != null) {
            return apolloGraphQLException.getError();
        }
        return null;
    }

    public static final <V> V getOrThrow(com.apollographql.apollo.api.FieldResult<? extends V> fieldResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fieldResult, "");
        if (fieldResult instanceof com.apollographql.apollo.api.FieldResult.Success) {
            return (V) ((com.apollographql.apollo.api.FieldResult.Success) fieldResult).getValue();
        }
        if (fieldResult instanceof com.apollographql.apollo.api.FieldResult.Failure) {
            throw new com.apollographql.apollo.exception.DefaultApolloException("Field error", ((com.apollographql.apollo.api.FieldResult.Failure) fieldResult).getException());
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
