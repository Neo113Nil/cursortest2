package com.paypal.oslo.feature.inappcheckout.domain.mapper;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/mapper/CallErrorMapper;", "", "<init>", "()V", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "error", "", "context", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/NativeXOErrorEntity;", "map", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;Ljava/lang/String;)Lcom/paypal/oslo/feature/inappcheckout/domain/entity/NativeXOErrorEntity;", "Lcom/paypal/oslo/core/network/http/error/NetworkError;", "networkError", "mapToNetworkError", "(Lcom/paypal/oslo/core/network/http/error/NetworkError;Ljava/lang/String;)Lcom/paypal/oslo/feature/inappcheckout/domain/entity/NativeXOErrorEntity;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CallErrorMapper {
    public static final int $stable = 0;

    @javax.inject.Inject
    public CallErrorMapper() {
    }

    public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity map$default(com.paypal.oslo.feature.inappcheckout.domain.mapper.CallErrorMapper callErrorMapper, com.paypal.oslo.core.network.graphql.error.CallError callError, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = com.paypal.oslo.feature.inappcheckout.Constants.API_CALL;
        }
        return callErrorMapper.map(callError, str);
    }

    public final com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity map(com.paypal.oslo.core.network.graphql.error.CallError error, java.lang.String context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        if (error instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
            com.paypal.oslo.core.network.graphql.error.CallError.Network network = (com.paypal.oslo.core.network.graphql.error.CallError.Network) error;
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.inappcheckout.LoggerKt.log, "Network error while ".concat(java.lang.String.valueOf(context)), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", network.toString())), null, 4, null);
            return mapToNetworkError(network.getError(), context);
        }
        if (!(error instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        java.util.List<com.paypal.oslo.core.network.graphql.error.GraphQLError> m11659getErrors1X0FAY = ((com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) error).m11659getErrors1X0FAY();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(m11659getErrors1X0FAY, 10));
        java.util.Iterator<T> it = m11659getErrors1X0FAY.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.paypal.oslo.core.network.graphql.error.GraphQLError) it.next()).getMessage());
        }
        java.lang.String joinToString$default = kotlin.collections.CollectionsKt.joinToString$default(arrow.core.NonEmptyList.m9567boximpl(arrow.core.NonEmptyList.m9570constructorimpl(arrayList)), ", ", null, null, 0, null, null, 62, null);
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.inappcheckout.LoggerKt.log, "GraphQL errors in response", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ERRORS_KEY, joinToString$default)), null, 4, null);
        return new com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity("GRAPHQL_ERROR", "GraphQL errors: ".concat(java.lang.String.valueOf(joinToString$default)), false, null, null, 24, null);
    }

    public final com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity mapToNetworkError(com.paypal.oslo.core.network.http.error.NetworkError networkError, java.lang.String context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkError, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        if (networkError instanceof com.paypal.oslo.core.network.http.error.NetworkError.HttpError) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed during ");
            sb.append(context);
            sb.append(" with error: ");
            sb.append(networkError);
            java.lang.String obj = sb.toString();
            int code = ((com.paypal.oslo.core.network.http.error.NetworkError.HttpError) networkError).getCode();
            return new com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity("NETWORK_ERROR", obj, 500 <= code && code < 600, null, null, 24, null);
        }
        if (networkError instanceof com.paypal.oslo.core.network.http.error.NetworkError.UnknownError) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Failed during ");
            sb2.append(context);
            sb2.append(" due to an unknown error: ");
            sb2.append(networkError);
            return new com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity("NETWORK_ERROR", sb2.toString(), false, null, null, 24, null);
        }
        if (!(networkError instanceof com.paypal.oslo.core.network.http.error.NetworkError.NoInternet)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Failed during ");
        sb3.append(context);
        sb3.append(" due to internet: ");
        sb3.append(networkError);
        return new com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity("NETWORK_ERROR", sb3.toString(), false, null, null, 24, null);
    }
}
