package com.paypal.oslo.feature.pools.data.error;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/error/CallError;", "Lcom/paypal/oslo/feature/pools/domain/error/PoolError;", "toPoolError", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;)Lcom/paypal/oslo/feature/pools/domain/error/PoolError;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PoolErrorMapperKt {
    public static final com.paypal.oslo.feature.pools.domain.error.PoolError toPoolError(com.paypal.oslo.core.network.graphql.error.CallError callError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        if (!(callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network)) {
            if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) {
                return new com.paypal.oslo.feature.pools.domain.error.PoolError.Business.PartialDataAvailable(((com.paypal.oslo.core.network.graphql.error.GraphQLError) arrow.core.NonEmptyList.m9583getHeadimpl(((com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError).m11659getErrors1X0FAY())).getErrorCode());
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.core.network.http.error.NetworkError error = ((com.paypal.oslo.core.network.graphql.error.CallError.Network) callError).getError();
        if (error instanceof com.paypal.oslo.core.network.http.error.NetworkError.HttpError) {
            com.paypal.oslo.core.network.http.error.NetworkError.HttpError httpError = (com.paypal.oslo.core.network.http.error.NetworkError.HttpError) error;
            java.lang.String valueOf = java.lang.String.valueOf(httpError.getCode());
            int code = httpError.getCode();
            if (code != 401) {
                if (code == 500 || code == 503) {
                    return new com.paypal.oslo.feature.pools.domain.error.PoolError.Business.ServerError(valueOf);
                }
                if (code != 403) {
                    if (code == 404) {
                        return new com.paypal.oslo.feature.pools.domain.error.PoolError.Business.DataNotFound(valueOf);
                    }
                    return new com.paypal.oslo.feature.pools.domain.error.PoolError.Network(valueOf);
                }
            }
            return new com.paypal.oslo.feature.pools.domain.error.PoolError.Business.Unauthorized(valueOf);
        }
        return new com.paypal.oslo.feature.pools.domain.error.PoolError.Network(null, 1, null);
    }
}
