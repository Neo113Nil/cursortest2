package com.paypal.oslo.core.network.graphql.interceptor;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\n\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/interceptor/OperationTrackingInterceptor;", "Lcom/apollographql/apollo/interceptor/ApolloInterceptor;", "<init>", "()V", "Lcom/apollographql/apollo/api/Operation$Data;", "D", "Lcom/apollographql/apollo/api/ApolloRequest;", "request", "Lcom/apollographql/apollo/interceptor/ApolloInterceptorChain;", "chain", "Lkotlinx/coroutines/flow/Flow;", "Lcom/apollographql/apollo/api/ApolloResponse;", "intercept", "(Lcom/apollographql/apollo/api/ApolloRequest;Lcom/apollographql/apollo/interceptor/ApolloInterceptorChain;)Lkotlinx/coroutines/flow/Flow;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OperationTrackingInterceptor implements com.apollographql.apollo.interceptor.ApolloInterceptor {
    public static final java.lang.String HEADER_OPERATION_ID = "X-APOLLO-OPERATION-ID";
    public static final java.lang.String HEADER_OPERATION_NAME = "X-APOLLO-OPERATION-NAME";
    public static final java.lang.String HEADER_OPERATION_TYPE = "X-APOLLO-OPERATION-TYPE";

    @Override // com.apollographql.apollo.interceptor.ApolloInterceptor
    public final <D extends com.apollographql.apollo.api.Operation.Data> kotlinx.coroutines.flow.Flow<com.apollographql.apollo.api.ApolloResponse<D>> intercept(com.apollographql.apollo.api.ApolloRequest<D> request, com.apollographql.apollo.interceptor.ApolloInterceptorChain chain) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chain, "");
        com.apollographql.apollo.api.ApolloRequest.Builder<D> addHttpHeader = request.newBuilder().addHttpHeader(HEADER_OPERATION_NAME, request.getOperation().name());
        com.apollographql.apollo.api.Operation<D> operation = request.getOperation();
        if (operation instanceof com.apollographql.apollo.api.Query) {
            str = "query";
        } else if (operation instanceof com.apollographql.apollo.api.Mutation) {
            str = "mutation";
        } else {
            str = operation instanceof com.apollographql.apollo.api.Subscription ? "subscription" : "unknown";
        }
        return chain.proceed(addHttpHeader.addHttpHeader(HEADER_OPERATION_TYPE, str).addHttpHeader(HEADER_OPERATION_ID, request.getOperation().id()).build());
    }
}
