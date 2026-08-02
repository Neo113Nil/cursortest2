package com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.error;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0004H\u0000¢\u0006\u0004\b\u0002\u0010\u0005"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/error/CallError;", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/domain/error/ApiCallError;", "mapToApiCallError", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;)Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/domain/error/ApiCallError;", "Lcom/paypal/oslo/core/network/http/error/NetworkError;", "(Lcom/paypal/oslo/core/network/http/error/NetworkError;)Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/domain/error/ApiCallError;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ErrorMapperKt {
    public static final com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.error.ApiCallError mapToApiCallError(com.paypal.oslo.core.network.graphql.error.CallError callError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) {
            java.util.List<com.paypal.oslo.core.network.graphql.error.GraphQLError> m11659getErrors1X0FAY = ((com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError).m11659getErrors1X0FAY();
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(m11659getErrors1X0FAY, 10));
            java.util.Iterator<T> it = m11659getErrors1X0FAY.iterator();
            while (it.hasNext()) {
                arrayList.add(((com.paypal.oslo.core.network.graphql.error.GraphQLError) it.next()).getMessage());
            }
            return new com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.error.ApiCallError.RequestFailed((java.lang.String) arrow.core.NonEmptyList.m9578firstOrNullimpl(arrow.core.NonEmptyList.m9570constructorimpl(arrayList)));
        }
        if (!(callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return mapToApiCallError(((com.paypal.oslo.core.network.graphql.error.CallError.Network) callError).getError());
    }

    public static final com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.error.ApiCallError mapToApiCallError(com.paypal.oslo.core.network.http.error.NetworkError networkError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkError, "");
        if (networkError instanceof com.paypal.oslo.core.network.http.error.NetworkError.HttpError) {
            com.paypal.oslo.core.network.http.error.NetworkError.HttpError httpError = (com.paypal.oslo.core.network.http.error.NetworkError.HttpError) networkError;
            int code = httpError.getCode();
            java.lang.String message = httpError.getMessage();
            if (message == null) {
                message = "http error";
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("HTTP error ");
            sb.append(code);
            sb.append(": ");
            sb.append(message);
            return new com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.error.ApiCallError.RequestFailed(sb.toString());
        }
        if (networkError instanceof com.paypal.oslo.core.network.http.error.NetworkError.NoInternet) {
            java.lang.String message2 = ((com.paypal.oslo.core.network.http.error.NetworkError.NoInternet) networkError).getCause().getMessage();
            if (message2 == null) {
                message2 = "network error";
            }
            return new com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.error.ApiCallError.RequestFailed("No internet connection: ".concat(java.lang.String.valueOf(message2)));
        }
        if (!(networkError instanceof com.paypal.oslo.core.network.http.error.NetworkError.UnknownError)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        java.lang.String message3 = ((com.paypal.oslo.core.network.http.error.NetworkError.UnknownError) networkError).getCause().getMessage();
        if (message3 == null) {
            message3 = "unknown error";
        }
        return new com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.error.ApiCallError.RequestFailed("Unknown error: ".concat(java.lang.String.valueOf(message3)));
    }
}
