package com.paypal.oslo.feature.subscriptions.shared.data.error;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/error/CallError;", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/error/SubscriptionsError;", "toSubscriptionsError", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;)Lcom/paypal/oslo/feature/subscriptions/shared/domain/error/SubscriptionsError;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CallErrorMapperKt {
    public static final com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError toSubscriptionsError(com.paypal.oslo.core.network.graphql.error.CallError callError) {
        com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError.Network network;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
            com.paypal.oslo.core.network.http.error.NetworkError error = ((com.paypal.oslo.core.network.graphql.error.CallError.Network) callError).getError();
            if (error instanceof com.paypal.oslo.core.network.http.error.NetworkError.HttpError) {
                com.paypal.oslo.core.network.http.error.NetworkError.HttpError httpError = (com.paypal.oslo.core.network.http.error.NetworkError.HttpError) error;
                int code = httpError.getCode();
                java.lang.String message = httpError.getMessage();
                if (message == null) {
                    message = "HTTP error ".concat(java.lang.String.valueOf(httpError.getCode()));
                }
                network = new com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError.Network(java.lang.String.valueOf(code), message, null, 4, null);
            } else if (error instanceof com.paypal.oslo.core.network.http.error.NetworkError.NoInternet) {
                network = new com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError.Network(com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsErrorDescriptions.Network.NO_INTERNET_CODE, com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsErrorDescriptions.Network.NO_INTERNET_DESCRIPTION, null, 4, null);
            } else {
                if (!(error instanceof com.paypal.oslo.core.network.http.error.NetworkError.UnknownError)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                network = new com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError.Network("UNKNOWN", com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsErrorDescriptions.Network.UNKNOWN_DESCRIPTION, null, 4, null);
            }
            return network;
        }
        if (!(callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.core.network.graphql.error.CallError.GraphQL graphQL = (com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError;
        java.lang.String message2 = ((com.paypal.oslo.core.network.graphql.error.GraphQLError) kotlin.collections.CollectionsKt.first((java.util.List) arrow.core.NonEmptyList.m9567boximpl(graphQL.m11659getErrors1X0FAY()))).getMessage();
        java.util.List<com.paypal.oslo.core.network.graphql.error.GraphQLError> m11659getErrors1X0FAY = graphQL.m11659getErrors1X0FAY();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(m11659getErrors1X0FAY, 10));
        java.util.Iterator<T> it = m11659getErrors1X0FAY.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.paypal.oslo.core.network.graphql.error.GraphQLError) it.next()).getMessage());
        }
        return new com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError.Business.PartialDataAvailable(arrow.core.NonEmptyList.m9567boximpl(arrow.core.NonEmptyList.m9570constructorimpl(arrayList)), "GRAPHQL_ERROR", message2, null, 8, null);
    }
}
