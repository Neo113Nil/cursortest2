package com.paypal.oslo.core.network.graphql.interceptor;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J;\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0\f\"\b\b\u0000\u0010\u0007*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/interceptor/FeatureModuleInterceptor;", "Lcom/apollographql/apollo/interceptor/ApolloInterceptor;", "Lcom/paypal/oslo/core/network/graphql/interceptor/PackageNameExtractor;", "packageExtractor", "<init>", "(Lcom/paypal/oslo/core/network/graphql/interceptor/PackageNameExtractor;)V", "Lcom/apollographql/apollo/api/Operation$Data;", "D", "Lcom/apollographql/apollo/api/ApolloRequest;", "request", "Lcom/apollographql/apollo/interceptor/ApolloInterceptorChain;", "chain", "Lkotlinx/coroutines/flow/Flow;", "Lcom/apollographql/apollo/api/ApolloResponse;", "intercept", "(Lcom/apollographql/apollo/api/ApolloRequest;Lcom/apollographql/apollo/interceptor/ApolloInterceptorChain;)Lkotlinx/coroutines/flow/Flow;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/network/graphql/interceptor/PackageNameExtractor;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FeatureModuleInterceptor implements com.apollographql.apollo.interceptor.ApolloInterceptor {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.network.graphql.interceptor.PackageNameExtractor getHighSpeedVideoFpsRanges;

    public FeatureModuleInterceptor(com.paypal.oslo.core.network.graphql.interceptor.PackageNameExtractor packageNameExtractor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageNameExtractor, "");
        this.getHighSpeedVideoFpsRanges = packageNameExtractor;
    }

    public /* synthetic */ FeatureModuleInterceptor(com.paypal.oslo.core.network.graphql.interceptor.PackageNameExtractor packageNameExtractor, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new com.paypal.oslo.core.network.graphql.interceptor.PackageNameExtractor() : packageNameExtractor);
    }

    @Override // com.apollographql.apollo.interceptor.ApolloInterceptor
    public final <D extends com.apollographql.apollo.api.Operation.Data> kotlinx.coroutines.flow.Flow<com.apollographql.apollo.api.ApolloResponse<D>> intercept(com.apollographql.apollo.api.ApolloRequest<D> request, com.apollographql.apollo.interceptor.ApolloInterceptorChain chain) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chain, "");
        com.apollographql.apollo.api.Operation<D> operation = request.getOperation();
        java.lang.String packageName$graphql_release = this.getHighSpeedVideoFpsRanges.getPackageName$graphql_release(operation);
        java.lang.String name2 = operation.getClass().getName();
        if (packageName$graphql_release == null) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.core.network.graphql.LoggerKt.log, "GraphQL operation has null package name, using 'unknown'", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("operationClass", name2)), null, 4, null);
            packageName$graphql_release = "unknown";
        }
        return chain.proceed(request.newBuilder().addHttpHeader(com.paypal.oslo.core.network.http.NetworkConstants.MODULE_NAME_HEADER, packageName$graphql_release).build());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FeatureModuleInterceptor() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
