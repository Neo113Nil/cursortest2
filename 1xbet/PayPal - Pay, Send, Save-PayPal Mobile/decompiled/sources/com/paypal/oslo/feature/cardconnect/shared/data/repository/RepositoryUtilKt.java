package com.paypal.oslo.feature.cardconnect.shared.data.repository;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/error/CallError;", "error", "Lcom/paypal/oslo/feature/cardconnect/shared/domain/model/DataResultError;", "mapToDomainError", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;)Lcom/paypal/oslo/feature/cardconnect/shared/domain/model/DataResultError;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class RepositoryUtilKt {
    public static final com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError mapToDomainError(com.paypal.oslo.core.network.graphql.error.CallError callError) {
        com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.Network.UnknownNetworkError unknownNetworkError;
        java.util.ArrayList arrayList;
        com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.GraphQLError.ErrorDetail errorDetail;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        java.util.ArrayList arrayList2 = null;
        if (!(callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL)) {
            if (!(callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.oslo.core.network.http.error.NetworkError error = ((com.paypal.oslo.core.network.graphql.error.CallError.Network) callError).getError();
            if (error instanceof com.paypal.oslo.core.network.http.error.NetworkError.NoInternet) {
                unknownNetworkError = com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.Network.NoInternet.INSTANCE;
            } else if (error instanceof com.paypal.oslo.core.network.http.error.NetworkError.HttpError) {
                com.paypal.oslo.core.network.http.error.NetworkError.HttpError httpError = (com.paypal.oslo.core.network.http.error.NetworkError.HttpError) error;
                unknownNetworkError = new com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.Network.HttpError(httpError.getCode(), null, httpError.getMessage(), httpError.getBody());
            } else {
                if (!(error instanceof com.paypal.oslo.core.network.http.error.NetworkError.UnknownError)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                unknownNetworkError = com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.Network.UnknownNetworkError.INSTANCE;
            }
            return unknownNetworkError;
        }
        com.paypal.oslo.core.network.graphql.error.GraphQLError graphQLError = (com.paypal.oslo.core.network.graphql.error.GraphQLError) kotlin.collections.CollectionsKt.first((java.util.List) arrow.core.NonEmptyList.m9567boximpl(((com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError).m11659getErrors1X0FAY()));
        java.util.Map<java.lang.String, java.lang.Object> extensions = graphQLError.getExtensions();
        if (extensions == null) {
            extensions = kotlin.collections.MapsKt.emptyMap();
        }
        java.lang.Object obj = extensions.get("name");
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (str == null) {
            str = "UNKNOWN";
        }
        java.lang.Object obj2 = extensions.get("service");
        java.lang.String str2 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
        java.lang.Object obj3 = extensions.get("details");
        java.util.List list = obj3 instanceof java.util.List ? (java.util.List) obj3 : null;
        if (list != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (java.lang.Object obj4 : list) {
                java.util.Map map = obj4 instanceof java.util.Map ? (java.util.Map) obj4 : null;
                if (map != null) {
                    java.lang.Object obj5 = map.get(com.paypal.oslo.feature.identity.shared.data.mapper.GraphQLErrorMapper.KEY_ISSUE);
                    java.lang.String str3 = obj5 instanceof java.lang.String ? (java.lang.String) obj5 : null;
                    java.lang.Object obj6 = map.get(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION);
                    java.lang.String str4 = obj6 instanceof java.lang.String ? (java.lang.String) obj6 : null;
                    java.lang.Object obj7 = map.get("field");
                    java.lang.String str5 = obj7 instanceof java.lang.String ? (java.lang.String) obj7 : null;
                    java.lang.Object obj8 = map.get(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
                    errorDetail = new com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.GraphQLError.ErrorDetail(str3, str4, str5, obj8 instanceof java.lang.String ? (java.lang.String) obj8 : null);
                } else {
                    errorDetail = null;
                }
                if (errorDetail != null) {
                    arrayList3.add(errorDetail);
                }
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        if (arrayList == null) {
            arrayList = kotlin.collections.CollectionsKt.emptyList();
        }
        com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.GraphQLError.GraphQLExtensions graphQLExtensions = new com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.GraphQLError.GraphQLExtensions(str, str2, arrayList);
        java.util.List<java.lang.Object> path = graphQLError.getPath();
        if (path != null) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            for (java.lang.Object obj9 : path) {
                java.lang.String str6 = obj9 instanceof java.lang.String ? (java.lang.String) obj9 : null;
                if (str6 != null) {
                    arrayList4.add(str6);
                }
            }
            arrayList2 = arrayList4;
        }
        return new com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.GraphQLError.GenericError(new com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.GraphQLError.GraphQLErrorDetail(graphQLError.getMessage(), arrayList2, graphQLExtensions), graphQLExtensions.getDebugId());
    }
}
