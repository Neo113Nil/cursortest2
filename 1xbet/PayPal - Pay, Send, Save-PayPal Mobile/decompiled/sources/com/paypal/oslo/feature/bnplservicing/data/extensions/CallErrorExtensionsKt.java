package com.paypal.oslo.feature.bnplservicing.data.extensions;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/error/CallError;", "", "correlationId", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;)Ljava/lang/String;", "errorDescription", "errorCode"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CallErrorExtensionsKt {
    public static final java.lang.String correlationId(com.paypal.oslo.core.network.graphql.error.CallError callError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) {
            return ((com.paypal.oslo.core.network.graphql.error.GraphQLError) arrow.core.NonEmptyList.m9583getHeadimpl(((com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError).m11659getErrors1X0FAY())).getCorrelationId();
        }
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
            return null;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static final java.lang.String errorDescription(com.paypal.oslo.core.network.graphql.error.CallError callError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) {
            return ((com.paypal.oslo.core.network.graphql.error.GraphQLError) arrow.core.NonEmptyList.m9583getHeadimpl(((com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError).m11659getErrors1X0FAY())).getMessage();
        }
        if (!(callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.core.network.http.error.NetworkError error = ((com.paypal.oslo.core.network.graphql.error.CallError.Network) callError).getError();
        if (!(error instanceof com.paypal.oslo.core.network.http.error.NetworkError.HttpError)) {
            if (error instanceof com.paypal.oslo.core.network.http.error.NetworkError.NoInternet) {
                return com.paypal.oslo.feature.qrc.ui.utils.Constants.INTERNET_ERROR;
            }
            if (!(error instanceof com.paypal.oslo.core.network.http.error.NetworkError.UnknownError)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            java.lang.String message = ((com.paypal.oslo.core.network.http.error.NetworkError.UnknownError) error).getCause().getMessage();
            return message == null ? "Unknown network error" : message;
        }
        com.paypal.oslo.core.network.http.error.NetworkError.HttpError httpError = (com.paypal.oslo.core.network.http.error.NetworkError.HttpError) error;
        int code = httpError.getCode();
        java.lang.String message2 = httpError.getMessage();
        if (message2 == null) {
            message2 = "Unknown";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("HTTP ");
        sb.append(code);
        sb.append(": ");
        sb.append(message2);
        return sb.toString();
    }

    public static final java.lang.String errorCode(com.paypal.oslo.core.network.graphql.error.CallError callError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) {
            java.lang.String errorCode = ((com.paypal.oslo.core.network.graphql.error.GraphQLError) arrow.core.NonEmptyList.m9583getHeadimpl(((com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError).m11659getErrors1X0FAY())).getErrorCode();
            return errorCode == null ? "0" : errorCode;
        }
        if (!(callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.core.network.http.error.NetworkError error = ((com.paypal.oslo.core.network.graphql.error.CallError.Network) callError).getError();
        if (error instanceof com.paypal.oslo.core.network.http.error.NetworkError.HttpError) {
            return "HTTP_".concat(java.lang.String.valueOf(((com.paypal.oslo.core.network.http.error.NetworkError.HttpError) error).getCode()));
        }
        if (error instanceof com.paypal.oslo.core.network.http.error.NetworkError.NoInternet) {
            return com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsErrorDescriptions.Network.NO_INTERNET_CODE;
        }
        if (error instanceof com.paypal.oslo.core.network.http.error.NetworkError.UnknownError) {
            return "UNKNOWN_NETWORK";
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
