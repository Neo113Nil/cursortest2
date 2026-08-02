package com.paypal.oslo.feature.searchandintelligence.domain.logging;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0006H\u0000¢\u0006\u0004\b\u0002\u0010\u0007\u001a\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0006H\u0000¢\u0006\u0004\b\u0004\u0010\u0007\u001a\u0013\u0010\t\u001a\u00020\u0001*\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\bH\u0000¢\u0006\u0004\b\u0002\u0010\n\u001a\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\bH\u0000¢\u0006\u0004\b\u0004\u0010\n"}, d2 = {"Lcom/paypal/oslo/core/network/http/error/NetworkError;", "", "toErrorCode", "(Lcom/paypal/oslo/core/network/http/error/NetworkError;)Ljava/lang/String;", "toErrorMessage", "toErrorReason", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;)Ljava/lang/String;", "Lcom/paypal/oslo/core/network/sse/domain/error/SseError;", "toActionName", "(Lcom/paypal/oslo/core/network/sse/domain/error/SseError;)Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class LogFunctionsKt {
    public static final java.lang.String toErrorCode(com.paypal.oslo.core.network.http.error.NetworkError networkError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkError, "");
        if (networkError instanceof com.paypal.oslo.core.network.http.error.NetworkError.HttpError) {
            return java.lang.String.valueOf(((com.paypal.oslo.core.network.http.error.NetworkError.HttpError) networkError).getCode());
        }
        if (networkError instanceof com.paypal.oslo.core.network.http.error.NetworkError.NoInternet) {
            return com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsErrorDescriptions.Network.NO_INTERNET_CODE;
        }
        if (networkError instanceof com.paypal.oslo.core.network.http.error.NetworkError.UnknownError) {
            return "UNKNOWN";
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static final java.lang.String toErrorMessage(com.paypal.oslo.core.network.http.error.NetworkError networkError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkError, "");
        if (networkError instanceof com.paypal.oslo.core.network.http.error.NetworkError.HttpError) {
            return ((com.paypal.oslo.core.network.http.error.NetworkError.HttpError) networkError).getMessage();
        }
        if (networkError instanceof com.paypal.oslo.core.network.http.error.NetworkError.NoInternet) {
            return ((com.paypal.oslo.core.network.http.error.NetworkError.NoInternet) networkError).getCause().getMessage();
        }
        if (networkError instanceof com.paypal.oslo.core.network.http.error.NetworkError.UnknownError) {
            return ((com.paypal.oslo.core.network.http.error.NetworkError.UnknownError) networkError).getCause().getMessage();
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static final java.lang.String toErrorReason(com.paypal.oslo.core.network.http.error.NetworkError networkError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkError, "");
        if (networkError instanceof com.paypal.oslo.core.network.http.error.NetworkError.HttpError) {
            return "HTTP_ERROR";
        }
        if (networkError instanceof com.paypal.oslo.core.network.http.error.NetworkError.NoInternet) {
            return com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsErrorDescriptions.Network.NO_INTERNET_CODE;
        }
        if (networkError instanceof com.paypal.oslo.core.network.http.error.NetworkError.UnknownError) {
            return "UNKNOWN";
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static final java.lang.String toErrorCode(com.paypal.oslo.core.network.graphql.error.CallError callError) {
        java.lang.Object obj;
        java.lang.String obj2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) {
            java.util.Map<java.lang.String, java.lang.Object> extensions = ((com.paypal.oslo.core.network.graphql.error.GraphQLError) kotlin.collections.CollectionsKt.first((java.util.List) arrow.core.NonEmptyList.m9567boximpl(((com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError).m11659getErrors1X0FAY()))).getExtensions();
            return (extensions == null || (obj = extensions.get("code")) == null || (obj2 = obj.toString()) == null) ? "GRAPHQL_ERROR" : obj2;
        }
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
            return toErrorCode(((com.paypal.oslo.core.network.graphql.error.CallError.Network) callError).getError());
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static final java.lang.String toErrorMessage(com.paypal.oslo.core.network.graphql.error.CallError callError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) {
            return ((com.paypal.oslo.core.network.graphql.error.GraphQLError) kotlin.collections.CollectionsKt.first((java.util.List) arrow.core.NonEmptyList.m9567boximpl(((com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError).m11659getErrors1X0FAY()))).getMessage();
        }
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
            return toErrorMessage(((com.paypal.oslo.core.network.graphql.error.CallError.Network) callError).getError());
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static final java.lang.String toActionName(com.paypal.oslo.core.network.sse.domain.error.SseError sseError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sseError, "");
        if (sseError instanceof com.paypal.oslo.core.network.sse.domain.error.SseError.ConnectionError) {
            return "sni.sse.connection.failed";
        }
        if (sseError instanceof com.paypal.oslo.core.network.sse.domain.error.SseError.ParseError) {
            return "sni.sse.parsing.error";
        }
        if (sseError instanceof com.paypal.oslo.core.network.sse.domain.error.SseError.UnknownError) {
            return "sni.sse.connection.failed";
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static final java.lang.String toErrorCode(com.paypal.oslo.core.network.sse.domain.error.SseError sseError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sseError, "");
        if (sseError instanceof com.paypal.oslo.core.network.sse.domain.error.SseError.ConnectionError) {
            return toErrorCode(((com.paypal.oslo.core.network.sse.domain.error.SseError.ConnectionError) sseError).getError());
        }
        if (sseError instanceof com.paypal.oslo.core.network.sse.domain.error.SseError.ParseError) {
            return "PARSE_ERROR";
        }
        if (sseError instanceof com.paypal.oslo.core.network.sse.domain.error.SseError.UnknownError) {
            return "UNKNOWN";
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static final java.lang.String toErrorMessage(com.paypal.oslo.core.network.sse.domain.error.SseError sseError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sseError, "");
        if (sseError instanceof com.paypal.oslo.core.network.sse.domain.error.SseError.ConnectionError) {
            return toErrorMessage(((com.paypal.oslo.core.network.sse.domain.error.SseError.ConnectionError) sseError).getError());
        }
        if (sseError instanceof com.paypal.oslo.core.network.sse.domain.error.SseError.ParseError) {
            return ((com.paypal.oslo.core.network.sse.domain.error.SseError.ParseError) sseError).getThrowable().getMessage();
        }
        if (sseError instanceof com.paypal.oslo.core.network.sse.domain.error.SseError.UnknownError) {
            return ((com.paypal.oslo.core.network.sse.domain.error.SseError.UnknownError) sseError).getThrowable().getMessage();
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
