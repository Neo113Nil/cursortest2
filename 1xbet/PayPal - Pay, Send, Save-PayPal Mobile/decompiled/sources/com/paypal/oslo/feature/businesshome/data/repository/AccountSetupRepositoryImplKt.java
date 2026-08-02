package com.paypal.oslo.feature.businesshome.data.repository;

@kotlin.Metadata(d1 = {"\u0000\u0000"}, d2 = {}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AccountSetupRepositoryImplKt {
    public static final /* synthetic */ com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupError access$toAccountSetupError(com.paypal.oslo.core.network.graphql.error.CallError callError) {
        java.util.Map mapOf;
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
            com.paypal.oslo.core.network.http.error.NetworkError error = ((com.paypal.oslo.core.network.graphql.error.CallError.Network) callError).getError();
            if (error instanceof com.paypal.oslo.core.network.http.error.NetworkError.NoInternet) {
                kotlin.Pair[] pairArr = new kotlin.Pair[2];
                pairArr[0] = kotlin.TuplesKt.to("type", "NoInternet");
                java.lang.String message = ((com.paypal.oslo.core.network.http.error.NetworkError.NoInternet) error).getCause().getMessage();
                pairArr[1] = kotlin.TuplesKt.to("cause", message != null ? message : "");
                mapOf = kotlin.collections.MapsKt.mapOf(pairArr);
            } else if (error instanceof com.paypal.oslo.core.network.http.error.NetworkError.UnknownError) {
                kotlin.Pair[] pairArr2 = new kotlin.Pair[2];
                pairArr2[0] = kotlin.TuplesKt.to("type", "UnknownError");
                java.lang.String message2 = ((com.paypal.oslo.core.network.http.error.NetworkError.UnknownError) error).getCause().getMessage();
                pairArr2[1] = kotlin.TuplesKt.to("cause", message2 != null ? message2 : "");
                mapOf = kotlin.collections.MapsKt.mapOf(pairArr2);
            } else {
                if (!(error instanceof com.paypal.oslo.core.network.http.error.NetworkError.HttpError)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                mapOf = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("type", "HttpError"), kotlin.TuplesKt.to("code", java.lang.String.valueOf(((com.paypal.oslo.core.network.http.error.NetworkError.HttpError) error).getCode())));
            }
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.businesshome.LoggerKt.log, "Account setup network error", mapOf, null, 4, null);
            return com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupError.NetworkError.INSTANCE;
        }
        if (!(callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.businesshome.LoggerKt.log;
        kotlin.Pair[] pairArr3 = new kotlin.Pair[3];
        com.paypal.oslo.core.network.graphql.error.CallError.GraphQL graphQL = (com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError;
        java.lang.String errorCode = ((com.paypal.oslo.core.network.graphql.error.GraphQLError) arrow.core.NonEmptyList.m9583getHeadimpl(graphQL.m11659getErrors1X0FAY())).getErrorCode();
        if (errorCode == null) {
            errorCode = "";
        }
        pairArr3[0] = kotlin.TuplesKt.to("errorCode", errorCode);
        java.lang.String correlationId = ((com.paypal.oslo.core.network.graphql.error.GraphQLError) arrow.core.NonEmptyList.m9583getHeadimpl(graphQL.m11659getErrors1X0FAY())).getCorrelationId();
        if (correlationId == null) {
            correlationId = "";
        }
        pairArr3[1] = kotlin.TuplesKt.to("correlationId", correlationId);
        java.util.List<java.lang.Object> path = ((com.paypal.oslo.core.network.graphql.error.GraphQLError) arrow.core.NonEmptyList.m9583getHeadimpl(graphQL.m11659getErrors1X0FAY())).getPath();
        java.lang.String joinToString$default = path != null ? kotlin.collections.CollectionsKt.joinToString$default(path, ".", null, null, 0, null, null, 62, null) : null;
        pairArr3[2] = kotlin.TuplesKt.to("path", joinToString$default != null ? joinToString$default : "");
        com.paypal.android.logger.Logger.w$default(logger, "Account setup server error", kotlin.collections.MapsKt.mapOf(pairArr3), null, 4, null);
        return com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupError.ServerError.INSTANCE;
    }
}
