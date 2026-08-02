package com.paypal.oslo.feature.userprofile.domain.utils;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/error/GraphQLError;", "", "Lcom/paypal/oslo/feature/userprofile/domain/model/GraphQLErrorDetail;", "extractDetails", "(Lcom/paypal/oslo/core/network/graphql/error/GraphQLError;)Ljava/util/List;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class GraphQLErrorExtensionsKt {
    public static final java.util.List<com.paypal.oslo.feature.userprofile.domain.model.GraphQLErrorDetail> extractDetails(com.paypal.oslo.core.network.graphql.error.GraphQLError graphQLError) {
        com.paypal.oslo.feature.userprofile.domain.model.GraphQLErrorDetail graphQLErrorDetail;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphQLError, "");
        java.util.Map<java.lang.String, java.lang.Object> extensions = graphQLError.getExtensions();
        java.lang.Object obj = extensions != null ? extensions.get("details") : null;
        java.util.List list = obj instanceof java.util.List ? (java.util.List) obj : null;
        if (list == null) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.userprofile.LoggerKt.log, "Invalid or missing 'details' in extensions", kotlin.collections.MapsKt.emptyMap(), null, 4, null);
            return kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj2 : list) {
            java.util.Map map = obj2 instanceof java.util.Map ? (java.util.Map) obj2 : null;
            if (map == null) {
                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.userprofile.LoggerKt.log, "Invalid detail item", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("detailItem", java.lang.String.valueOf(obj2))), null, 4, null);
                graphQLErrorDetail = null;
            } else {
                java.lang.Object obj3 = map.get(com.paypal.oslo.feature.identity.shared.data.mapper.GraphQLErrorMapper.KEY_ISSUE);
                java.lang.String str = obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null;
                if (str == null && map.containsKey(com.paypal.oslo.feature.identity.shared.data.mapper.GraphQLErrorMapper.KEY_ISSUE)) {
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.userprofile.LoggerKt.log, "Invalid type for 'issue' field", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("issueValue", java.lang.String.valueOf(map.get(com.paypal.oslo.feature.identity.shared.data.mapper.GraphQLErrorMapper.KEY_ISSUE)))), null, 4, null);
                }
                java.lang.Object obj4 = map.get(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION);
                java.lang.String str2 = obj4 instanceof java.lang.String ? (java.lang.String) obj4 : null;
                java.lang.Object obj5 = map.get("field");
                java.lang.String str3 = obj5 instanceof java.lang.String ? (java.lang.String) obj5 : null;
                java.lang.Object obj6 = map.get(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
                graphQLErrorDetail = new com.paypal.oslo.feature.userprofile.domain.model.GraphQLErrorDetail(str, str2, str3, obj6 instanceof java.lang.String ? (java.lang.String) obj6 : null);
            }
            if (graphQLErrorDetail != null) {
                arrayList.add(graphQLErrorDetail);
            }
        }
        return arrayList;
    }
}
