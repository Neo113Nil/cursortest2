package com.paypal.oslo.feature.taptopay.data.error;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\t\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\t\u0010\b\"\u0014\u0010\u000b\u001a\u00020\n8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/error/CallError;", "Lcom/paypal/oslo/feature/taptopay/domain/model/network/ServiceApiError;", "toServiceApiError", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;)Lcom/paypal/oslo/feature/taptopay/domain/model/network/ServiceApiError;", "", "message", "", "logError", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;Ljava/lang/String;)V", "logWarning", "", "GraphQLNullDataResponseCode", com.visa.cbp.getEncExpo.warmup}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CallErrorMapperKt {
    public static final int GraphQLNullDataResponseCode = 200;

    public static final com.paypal.oslo.feature.taptopay.domain.model.network.ServiceApiError toServiceApiError(com.paypal.oslo.core.network.graphql.error.CallError callError) {
        java.lang.String str = "";
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        if (!(callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network)) {
            if (!(callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            return new com.paypal.oslo.feature.taptopay.domain.model.network.ServiceApiError.ResponseError(200, kotlin.collections.CollectionsKt.joinToString$default(arrow.core.NonEmptyList.m9567boximpl(((com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError).m11659getErrors1X0FAY()), "; ", null, null, 0, null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taptopay.data.error.CallErrorMapperKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.taptopay.data.error.CallErrorMapperKt.$r8$lambda$p5qQoZPSln7pp32aNiQyKFmLQSc((com.paypal.oslo.core.network.graphql.error.GraphQLError) obj);
                }
            }, 30, null));
        }
        com.paypal.oslo.core.network.http.error.NetworkError error = ((com.paypal.oslo.core.network.graphql.error.CallError.Network) callError).getError();
        if (error instanceof com.paypal.oslo.core.network.http.error.NetworkError.NoInternet) {
            return com.paypal.oslo.feature.taptopay.domain.model.network.ServiceApiError.Offline.INSTANCE;
        }
        if (error instanceof com.paypal.oslo.core.network.http.error.NetworkError.HttpError) {
            com.paypal.oslo.core.network.http.error.NetworkError.HttpError httpError = (com.paypal.oslo.core.network.http.error.NetworkError.HttpError) error;
            int code = httpError.getCode();
            java.lang.String body = httpError.getBody();
            if (body == null) {
                java.lang.String message = httpError.getMessage();
                if (message != null) {
                    str = message;
                }
            } else {
                str = body;
            }
            return new com.paypal.oslo.feature.taptopay.domain.model.network.ServiceApiError.ResponseError(code, str);
        }
        if (error instanceof com.paypal.oslo.core.network.http.error.NetworkError.UnknownError) {
            return new com.paypal.oslo.feature.taptopay.domain.model.network.ServiceApiError.DefaultError(((com.paypal.oslo.core.network.http.error.NetworkError.UnknownError) error).getCause());
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static final void logError(com.paypal.oslo.core.network.graphql.error.CallError callError, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
            com.paypal.oslo.core.network.http.error.NetworkError error = ((com.paypal.oslo.core.network.graphql.error.CallError.Network) callError).getError();
            if (error instanceof com.paypal.oslo.core.network.http.error.NetworkError.NoInternet) {
                com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, str, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorType", "NoInternet")), null, ((com.paypal.oslo.core.network.http.error.NetworkError.NoInternet) error).getCause(), 4, null);
                return;
            }
            if (error instanceof com.paypal.oslo.core.network.http.error.NetworkError.HttpError) {
                com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.taptopay.LoggerKt.log;
                kotlin.Pair[] pairArr = new kotlin.Pair[4];
                pairArr[0] = kotlin.TuplesKt.to("errorType", "HttpError");
                com.paypal.oslo.core.network.http.error.NetworkError.HttpError httpError = (com.paypal.oslo.core.network.http.error.NetworkError.HttpError) error;
                pairArr[1] = kotlin.TuplesKt.to("code", java.lang.Integer.valueOf(httpError.getCode()));
                pairArr[2] = kotlin.TuplesKt.to("httpMessage", httpError.getMessage());
                pairArr[3] = kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.HAS_BODY_UI, java.lang.Boolean.valueOf(httpError.getBody() != null));
                com.paypal.android.logger.Logger.e$default(logger, str, kotlin.collections.MapsKt.mapOf(pairArr), null, null, 12, null);
                return;
            }
            if (!(error instanceof com.paypal.oslo.core.network.http.error.NetworkError.UnknownError)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, str, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorType", "UnknownError")), null, ((com.paypal.oslo.core.network.http.error.NetworkError.UnknownError) error).getCause(), 4, null);
            return;
        }
        if (!(callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.core.network.graphql.error.CallError.GraphQL graphQL = (com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError;
        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, str, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorType", "GraphQL"), kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.ERROR_COUNT, java.lang.Integer.valueOf(arrow.core.NonEmptyList.m9584getSizeimpl(graphQL.m11659getErrors1X0FAY()))), kotlin.TuplesKt.to("isCritical", java.lang.Boolean.valueOf(graphQL.isCritical()))), null, null, 12, null);
    }

    public static final void logWarning(com.paypal.oslo.core.network.graphql.error.CallError callError, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
            com.paypal.oslo.core.network.http.error.NetworkError error = ((com.paypal.oslo.core.network.graphql.error.CallError.Network) callError).getError();
            if (error instanceof com.paypal.oslo.core.network.http.error.NetworkError.NoInternet) {
                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, str, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorType", "NoInternet")), null, 4, null);
                return;
            }
            if (error instanceof com.paypal.oslo.core.network.http.error.NetworkError.HttpError) {
                com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.taptopay.LoggerKt.log;
                kotlin.Pair[] pairArr = new kotlin.Pair[4];
                pairArr[0] = kotlin.TuplesKt.to("errorType", "HttpError");
                com.paypal.oslo.core.network.http.error.NetworkError.HttpError httpError = (com.paypal.oslo.core.network.http.error.NetworkError.HttpError) error;
                pairArr[1] = kotlin.TuplesKt.to("code", java.lang.Integer.valueOf(httpError.getCode()));
                pairArr[2] = kotlin.TuplesKt.to("httpMessage", httpError.getMessage());
                pairArr[3] = kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.HAS_BODY_UI, java.lang.Boolean.valueOf(httpError.getBody() != null));
                com.paypal.android.logger.Logger.w$default(logger, str, kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
                return;
            }
            if (!(error instanceof com.paypal.oslo.core.network.http.error.NetworkError.UnknownError)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, str, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorType", "UnknownError")), null, 4, null);
            return;
        }
        if (!(callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.core.network.graphql.error.CallError.GraphQL graphQL = (com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError;
        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, str, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorType", "GraphQL"), kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.ERROR_COUNT, java.lang.Integer.valueOf(arrow.core.NonEmptyList.m9584getSizeimpl(graphQL.m11659getErrors1X0FAY()))), kotlin.TuplesKt.to("isCritical", java.lang.Boolean.valueOf(graphQL.isCritical()))), null, 4, null);
    }

    public static /* synthetic */ java.lang.CharSequence $r8$lambda$p5qQoZPSln7pp32aNiQyKFmLQSc(com.paypal.oslo.core.network.graphql.error.GraphQLError graphQLError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphQLError, "");
        return graphQLError.getMessage();
    }
}
