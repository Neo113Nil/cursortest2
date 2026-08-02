package com.paypal.oslo.feature.searchandintelligence.data.repository;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0005\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/error/CallError;", "Lcom/paypal/oslo/core/network/http/error/NetworkError;", "toNetworkError", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;)Lcom/paypal/oslo/core/network/http/error/NetworkError;", "cause", "noDataError"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ErrorExtensionsKt {
    public static final com.paypal.oslo.core.network.http.error.NetworkError toNetworkError(com.paypal.oslo.core.network.graphql.error.CallError callError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) {
            return noDataError(callError);
        }
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
            return ((com.paypal.oslo.core.network.graphql.error.CallError.Network) callError).getError();
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static /* synthetic */ com.paypal.oslo.core.network.http.error.NetworkError noDataError$default(com.paypal.oslo.core.network.graphql.error.CallError callError, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            callError = null;
        }
        return noDataError(callError);
    }

    public static final com.paypal.oslo.core.network.http.error.NetworkError noDataError(com.paypal.oslo.core.network.graphql.error.CallError callError) {
        return new com.paypal.oslo.core.network.http.error.NetworkError.UnknownError(new com.paypal.oslo.feature.searchandintelligence.data.repository.NoDataException(callError));
    }
}
