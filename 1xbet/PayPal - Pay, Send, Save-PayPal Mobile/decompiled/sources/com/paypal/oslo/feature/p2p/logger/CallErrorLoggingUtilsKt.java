package com.paypal.oslo.feature.p2p.logger;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a'\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\t\u0010\n\u001a#\u0010\u000e\u001a\u00020\b2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000b2\u0006\u0010\r\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/error/CallError;", "", "", "toLoggingAttributes", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;)Ljava/util/Map;", "callError", "networkErrorMessage", "graphqlErrorMessage", "", "logCallError", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/paypal/oslo/core/network/graphql/GraphQLData;", "graphQLData", "errorMessage", "logNoDataError", "(Lcom/paypal/oslo/core/network/graphql/GraphQLData;Ljava/lang/String;)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CallErrorLoggingUtilsKt {
    public static final java.util.Map<java.lang.String, java.lang.String> toLoggingAttributes(com.paypal.oslo.core.network.graphql.error.CallError callError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
            com.paypal.oslo.core.network.http.error.NetworkError error = ((com.paypal.oslo.core.network.graphql.error.CallError.Network) callError).getError();
            if (error instanceof com.paypal.oslo.core.network.http.error.NetworkError.HttpError) {
                kotlin.Pair[] pairArr = new kotlin.Pair[2];
                com.paypal.oslo.core.network.http.error.NetworkError.HttpError httpError = (com.paypal.oslo.core.network.http.error.NetworkError.HttpError) error;
                pairArr[0] = kotlin.TuplesKt.to("errorCode", java.lang.String.valueOf(httpError.getCode()));
                java.lang.String message = httpError.getMessage();
                if (message == null) {
                    message = "HTTP ".concat(java.lang.String.valueOf(httpError.getCode()));
                }
                pairArr[1] = kotlin.TuplesKt.to("message", message);
                return kotlin.collections.MapsKt.mapOf(pairArr);
            }
            if (error instanceof com.paypal.oslo.core.network.http.error.NetworkError.NoInternet) {
                kotlin.Pair[] pairArr2 = new kotlin.Pair[2];
                pairArr2[0] = kotlin.TuplesKt.to("errorCode", com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsErrorDescriptions.Network.NO_INTERNET_CODE);
                java.lang.String message2 = ((com.paypal.oslo.core.network.http.error.NetworkError.NoInternet) error).getCause().getMessage();
                if (message2 == null) {
                    message2 = com.paypal.oslo.feature.qrc.ui.utils.Constants.INTERNET_ERROR;
                }
                pairArr2[1] = kotlin.TuplesKt.to("message", message2);
                return kotlin.collections.MapsKt.mapOf(pairArr2);
            }
            if (!(error instanceof com.paypal.oslo.core.network.http.error.NetworkError.UnknownError)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            kotlin.Pair[] pairArr3 = new kotlin.Pair[2];
            pairArr3[0] = kotlin.TuplesKt.to("errorCode", "UNKNOWN");
            java.lang.String message3 = ((com.paypal.oslo.core.network.http.error.NetworkError.UnknownError) error).getCause().getMessage();
            if (message3 == null) {
                message3 = "Unknown network error";
            }
            pairArr3[1] = kotlin.TuplesKt.to("message", message3);
            return kotlin.collections.MapsKt.mapOf(pairArr3);
        }
        if (!(callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorCode", "GRAPHQL_ERROR"), kotlin.TuplesKt.to("message", ((com.paypal.oslo.core.network.graphql.error.GraphQLError) arrow.core.NonEmptyList.m9583getHeadimpl(((com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError).m11659getErrors1X0FAY())).getMessage()));
    }

    public static final void logCallError(com.paypal.oslo.core.network.graphql.error.CallError callError, java.lang.String str, java.lang.String str2) {
        java.lang.Throwable th;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
            com.paypal.oslo.core.network.http.error.NetworkError error = ((com.paypal.oslo.core.network.graphql.error.CallError.Network) callError).getError();
            if (error instanceof com.paypal.oslo.core.network.http.error.NetworkError.NoInternet) {
                th = ((com.paypal.oslo.core.network.http.error.NetworkError.NoInternet) error).getCause();
            } else if (error instanceof com.paypal.oslo.core.network.http.error.NetworkError.UnknownError) {
                th = ((com.paypal.oslo.core.network.http.error.NetworkError.UnknownError) error).getCause();
            } else {
                if (!(error instanceof com.paypal.oslo.core.network.http.error.NetworkError.HttpError)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                th = null;
            }
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.p2p.LoggerKt.log, str, toLoggingAttributes(callError), null, th, 4, null);
            return;
        }
        if (!(callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.core.network.graphql.error.CallError.GraphQL graphQL = (com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError;
        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.p2p.LoggerKt.log, str2, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.ERROR_COUNT, java.lang.String.valueOf(arrow.core.NonEmptyList.m9584getSizeimpl(graphQL.m11659getErrors1X0FAY()))), kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FIRST_ERROR, ((com.paypal.oslo.core.network.graphql.error.GraphQLError) arrow.core.NonEmptyList.m9583getHeadimpl(graphQL.m11659getErrors1X0FAY())).getMessage()), kotlin.TuplesKt.to("correlationId", "none")), null, null, 12, null);
    }

    public static final void logNoDataError(com.paypal.oslo.core.network.graphql.GraphQLData<?> graphQLData, java.lang.String str) {
        java.lang.String str2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphQLData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.Object obj = graphQLData.getExtensions().get("correlationId");
        if (obj == null || (str2 = obj.toString()) == null) {
            str2 = "none";
        }
        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.p2p.LoggerKt.log, str, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("correlationId", str2)), null, null, 12, null);
    }
}
