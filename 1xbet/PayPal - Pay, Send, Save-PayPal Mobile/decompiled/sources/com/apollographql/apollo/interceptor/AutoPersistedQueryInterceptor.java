package com.apollographql.apollo.interceptor;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J;\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0\r\"\b\b\u0000\u0010\b*\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012"}, d2 = {"Lcom/apollographql/apollo/interceptor/AutoPersistedQueryInterceptor;", "Lcom/apollographql/apollo/interceptor/ApolloInterceptor;", "Lcom/apollographql/apollo/api/http/HttpMethod;", "httpMethodForHashedQueries", "httpMethodForDocumentQueries", "<init>", "(Lcom/apollographql/apollo/api/http/HttpMethod;Lcom/apollographql/apollo/api/http/HttpMethod;)V", "Lcom/apollographql/apollo/api/Operation$Data;", "D", "Lcom/apollographql/apollo/api/ApolloRequest;", "request", "Lcom/apollographql/apollo/interceptor/ApolloInterceptorChain;", "chain", "Lkotlinx/coroutines/flow/Flow;", "Lcom/apollographql/apollo/api/ApolloResponse;", "intercept", "(Lcom/apollographql/apollo/api/ApolloRequest;Lcom/apollographql/apollo/interceptor/ApolloInterceptorChain;)Lkotlinx/coroutines/flow/Flow;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/apollographql/apollo/api/http/HttpMethod;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AutoPersistedQueryInterceptor implements com.apollographql.apollo.interceptor.ApolloInterceptor {
    public static final java.lang.String PROTOCOL_NEGOTIATION_ERROR_NOT_SUPPORTED = "PersistedQueryNotSupported";
    public static final java.lang.String PROTOCOL_NEGOTIATION_ERROR_QUERY_NOT_FOUND = "PersistedQueryNotFound";

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.apollographql.apollo.api.http.HttpMethod getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.apollographql.apollo.api.http.HttpMethod getHighSpeedVideoSizes;

    public AutoPersistedQueryInterceptor(com.apollographql.apollo.api.http.HttpMethod httpMethod, com.apollographql.apollo.api.http.HttpMethod httpMethod2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpMethod, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpMethod2, "");
        this.getHighSpeedVideoFpsRanges = httpMethod;
        this.getHighSpeedVideoSizes = httpMethod2;
    }

    @Override // com.apollographql.apollo.interceptor.ApolloInterceptor
    public final <D extends com.apollographql.apollo.api.Operation.Data> kotlinx.coroutines.flow.Flow<com.apollographql.apollo.api.ApolloResponse<D>> intercept(com.apollographql.apollo.api.ApolloRequest<D> request, com.apollographql.apollo.interceptor.ApolloInterceptorChain chain) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chain, "");
        java.lang.Boolean enableAutoPersistedQueries = request.getEnableAutoPersistedQueries();
        if (enableAutoPersistedQueries != null && !enableAutoPersistedQueries.booleanValue()) {
            return chain.proceed(request);
        }
        boolean z = request.getOperation() instanceof com.apollographql.apollo.api.Mutation;
        return kotlinx.coroutines.flow.FlowKt.flow(new com.apollographql.apollo.interceptor.AutoPersistedQueryInterceptor$intercept$1(chain, request.newBuilder().httpMethod(z ? com.apollographql.apollo.api.http.HttpMethod.Post : this.getHighSpeedVideoFpsRanges).sendDocument(java.lang.Boolean.FALSE).sendApqExtensions(java.lang.Boolean.TRUE).build(), this, z, null));
    }

    public static final /* synthetic */ boolean access$isPersistedQueryNotFound(com.apollographql.apollo.interceptor.AutoPersistedQueryInterceptor autoPersistedQueryInterceptor, java.util.List list) {
        if (list == null) {
            return false;
        }
        java.util.List list2 = list;
        if ((list2 instanceof java.util.Collection) && list2.isEmpty()) {
            return false;
        }
        java.util.Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (kotlin.text.StringsKt.equals(((com.apollographql.apollo.api.Error) it.next()).getMessage(), PROTOCOL_NEGOTIATION_ERROR_QUERY_NOT_FOUND, true)) {
                return true;
            }
        }
        return false;
    }

    public static final /* synthetic */ boolean access$isPersistedQueryNotSupported(com.apollographql.apollo.interceptor.AutoPersistedQueryInterceptor autoPersistedQueryInterceptor, java.util.List list) {
        if (list == null) {
            return false;
        }
        java.util.List list2 = list;
        if ((list2 instanceof java.util.Collection) && list2.isEmpty()) {
            return false;
        }
        java.util.Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (kotlin.text.StringsKt.equals(((com.apollographql.apollo.api.Error) it.next()).getMessage(), PROTOCOL_NEGOTIATION_ERROR_NOT_SUPPORTED, true)) {
                return true;
            }
        }
        return false;
    }
}
