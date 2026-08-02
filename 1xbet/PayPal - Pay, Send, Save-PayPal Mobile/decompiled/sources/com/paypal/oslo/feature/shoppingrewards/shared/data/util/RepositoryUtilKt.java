package com.paypal.oslo.feature.shoppingrewards.shared.data.util;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/error/CallError;", "callError", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/repository/DataResultError;", "mapToDomainError", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;)Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/repository/DataResultError;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class RepositoryUtilKt {
    public static final com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError mapToDomainError(com.paypal.oslo.core.network.graphql.error.CallError callError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
            com.paypal.oslo.core.network.http.error.NetworkError error = ((com.paypal.oslo.core.network.graphql.error.CallError.Network) callError).getError();
            if (error instanceof com.paypal.oslo.core.network.http.error.NetworkError.HttpError) {
                com.paypal.oslo.core.network.http.error.NetworkError.HttpError httpError = (com.paypal.oslo.core.network.http.error.NetworkError.HttpError) error;
                return new com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError.HttpError(httpError.getCode(), httpError.getMessage(), httpError.getBody(), null, 8, null);
            }
            if (error instanceof com.paypal.oslo.core.network.http.error.NetworkError.UnknownError) {
                return com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError.Unknown.INSTANCE;
            }
            if (error instanceof com.paypal.oslo.core.network.http.error.NetworkError.NoInternet) {
                return com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError.NoInternet.INSTANCE;
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }
        if (!(callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return new com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError.ServerSideError(((com.paypal.oslo.core.network.graphql.error.GraphQLError) arrow.core.NonEmptyList.m9578firstOrNullimpl(((com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError).m11659getErrors1X0FAY())).getCorrelationId());
    }
}
