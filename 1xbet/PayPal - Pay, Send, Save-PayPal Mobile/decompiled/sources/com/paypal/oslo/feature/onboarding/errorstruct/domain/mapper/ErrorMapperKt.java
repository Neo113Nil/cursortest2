package com.paypal.oslo.feature.onboarding.errorstruct.domain.mapper;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/error/CallError;", "Lcom/paypal/oslo/feature/onboarding/errorstruct/domain/model/ApiCallError;", "mapToApiCallError", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;)Lcom/paypal/oslo/feature/onboarding/errorstruct/domain/model/ApiCallError;", "Lcom/paypal/oslo/core/network/graphql/error/GraphQLError;", "Lcom/paypal/oslo/feature/onboarding/errorstruct/domain/model/ApiCallError$RequestError;", "Camera2StreamConfigurationMap", "(Lcom/paypal/oslo/core/network/graphql/error/GraphQLError;)Lcom/paypal/oslo/feature/onboarding/errorstruct/domain/model/ApiCallError$RequestError;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ErrorMapperKt {
    public static final com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError mapToApiCallError(com.paypal.oslo.core.network.graphql.error.CallError callError) {
        com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.Network.Timeout timeout;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        if (!(callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network)) {
            if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) {
                return Camera2StreamConfigurationMap((com.paypal.oslo.core.network.graphql.error.GraphQLError) arrow.core.NonEmptyList.m9583getHeadimpl(((com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError).m11659getErrors1X0FAY()));
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.core.network.http.error.NetworkError error = ((com.paypal.oslo.core.network.graphql.error.CallError.Network) callError).getError();
        if (error instanceof com.paypal.oslo.core.network.http.error.NetworkError.NoInternet) {
            java.lang.String message = ((com.paypal.oslo.core.network.http.error.NetworkError.NoInternet) error).getCause().getMessage();
            timeout = new com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.Network.NoInternet("No internet connection: ".concat(java.lang.String.valueOf(message != null ? message : "unknown")));
        } else if (error instanceof com.paypal.oslo.core.network.http.error.NetworkError.HttpError) {
            com.paypal.oslo.core.network.http.error.NetworkError.HttpError httpError = (com.paypal.oslo.core.network.http.error.NetworkError.HttpError) error;
            int code = httpError.getCode();
            int code2 = httpError.getCode();
            java.lang.String message2 = httpError.getMessage();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("HTTP error ");
            sb.append(code2);
            sb.append(": ");
            sb.append(message2);
            timeout = new com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.Network.HttpError(code, sb.toString());
        } else {
            if (!(error instanceof com.paypal.oslo.core.network.http.error.NetworkError.UnknownError)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.oslo.core.network.http.error.NetworkError.UnknownError unknownError = (com.paypal.oslo.core.network.http.error.NetworkError.UnknownError) error;
            java.lang.Throwable cause = unknownError.getCause();
            if ((cause instanceof java.net.SocketTimeoutException) || (cause instanceof java.io.InterruptedIOException) || (cause instanceof java.util.concurrent.TimeoutException)) {
                java.lang.String message3 = unknownError.getCause().getMessage();
                timeout = new com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.Network.Timeout("Request timed out: ".concat(java.lang.String.valueOf(message3 != null ? message3 : "unknown")));
            } else {
                java.lang.String message4 = unknownError.getCause().getMessage();
                timeout = new com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.Network.Unknown("Unknown network error: ".concat(java.lang.String.valueOf(message4 != null ? message4 : "unknown")));
            }
        }
        return timeout;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x007d, code lost:
    
        if (r4 == null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.RequestError Camera2StreamConfigurationMap(com.paypal.oslo.core.network.graphql.error.GraphQLError graphQLError) {
        java.util.ArrayList emptyList;
        com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode cosErrorCode;
        com.paypal.oslo.feature.onboarding.errorstruct.domain.model.Issue issue;
        java.lang.Object obj;
        java.util.Map<java.lang.String, java.lang.Object> extensions = graphQLError.getExtensions();
        java.lang.Object obj2 = extensions != null ? extensions.get("details") : null;
        java.util.List list = obj2 instanceof java.util.List ? (java.util.List) obj2 : null;
        if (list == null) {
            emptyList = kotlin.collections.CollectionsKt.emptyList();
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj3 : list) {
                java.util.Map map = obj3 instanceof java.util.Map ? (java.util.Map) obj3 : null;
                if (map == null) {
                    issue = null;
                } else {
                    java.lang.Object obj4 = map.get(com.paypal.oslo.feature.identity.shared.data.mapper.GraphQLErrorMapper.KEY_ISSUE);
                    java.lang.String str = obj4 instanceof java.lang.String ? (java.lang.String) obj4 : null;
                    if (str != null) {
                        java.lang.Object obj5 = (java.lang.Enum) com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode.UNKNOWN;
                        try {
                            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                            java.lang.String upperCase = str.toUpperCase(java.util.Locale.ROOT);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
                            obj = kotlin.Result.m23436constructorimpl(com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode.valueOf(upperCase));
                        } catch (java.lang.Throwable th) {
                            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                            obj = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
                        }
                        if (kotlin.Result.m23439exceptionOrNullimpl(obj) == null) {
                            obj5 = obj;
                        }
                        cosErrorCode = (java.lang.Enum) obj5;
                    }
                    cosErrorCode = com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode.UNKNOWN;
                    java.lang.Object obj6 = map.get(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION);
                    java.lang.String str2 = obj6 instanceof java.lang.String ? (java.lang.String) obj6 : null;
                    java.lang.Object obj7 = map.get("field");
                    java.lang.String str3 = obj7 instanceof java.lang.String ? (java.lang.String) obj7 : null;
                    java.lang.Object obj8 = map.get(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
                    issue = new com.paypal.oslo.feature.onboarding.errorstruct.domain.model.Issue(cosErrorCode, str2, str3, obj8 instanceof java.lang.String ? (java.lang.String) obj8 : null);
                }
                if (issue != null) {
                    arrayList.add(issue);
                }
            }
            emptyList = arrayList;
        }
        return new com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.RequestError(emptyList);
    }
}
