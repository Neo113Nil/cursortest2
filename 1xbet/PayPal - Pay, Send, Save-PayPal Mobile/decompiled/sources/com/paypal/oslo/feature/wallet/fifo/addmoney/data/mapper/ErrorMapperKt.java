package com.paypal.oslo.feature.wallet.fifo.addmoney.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001f\u0010\u0006\u001a\u0004\u0018\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Larrow/core/NonEmptyList;", "Lcom/paypal/oslo/core/network/graphql/error/GraphQLError;", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ERRORS_KEY, "", "getIssue-GZgkXh4", "(Ljava/util/List;)Ljava/lang/String;", "getIssue"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ErrorMapperKt {
    /* renamed from: getIssue-GZgkXh4, reason: not valid java name */
    public static final java.lang.String m21255getIssueGZgkXh4(java.util.List<com.paypal.oslo.core.network.graphql.error.GraphQLError> list) {
        java.lang.Object firstOrNull;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "GraphQL errors received", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", kotlin.collections.CollectionsKt.joinToString$default(arrow.core.NonEmptyList.m9567boximpl(list), null, null, null, 0, null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.fifo.addmoney.data.mapper.ErrorMapperKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.wallet.fifo.addmoney.data.mapper.ErrorMapperKt.m21254$r8$lambda$C8WAbPuOVDRzHHVqgnVFfFhcE((com.paypal.oslo.core.network.graphql.error.GraphQLError) obj);
            }
        }, 31, null))), null, 4, null);
        java.util.Map<java.lang.String, java.lang.Object> extensions = ((com.paypal.oslo.core.network.graphql.error.GraphQLError) kotlin.collections.CollectionsKt.first((java.util.List) arrow.core.NonEmptyList.m9567boximpl(list))).getExtensions();
        java.lang.Object obj = extensions != null ? extensions.get("details") : null;
        java.util.List list2 = obj instanceof java.util.List ? (java.util.List) obj : null;
        java.util.Map map = (list2 == null || (firstOrNull = kotlin.collections.CollectionsKt.firstOrNull((java.util.List<? extends java.lang.Object>) list2)) == null || !(firstOrNull instanceof java.util.Map)) ? null : (java.util.Map) firstOrNull;
        java.lang.Object obj2 = map != null ? map.get(com.paypal.oslo.feature.identity.shared.data.mapper.GraphQLErrorMapper.KEY_ISSUE) : null;
        java.lang.String str = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
        if (map != null && str == null) {
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.wallet.LoggerKt.log;
            java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(map.getClass()).getSimpleName();
            com.paypal.android.logger.Logger.w$default(logger, "Unexpected details structure in GraphQL error extensions", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("detailsType", simpleName != null ? simpleName : "")), null, 4, null);
        }
        return str;
    }

    /* renamed from: $r8$lambda$C8W-AbPuOVDRzHHVqgn-VFfFhcE, reason: not valid java name */
    public static /* synthetic */ java.lang.CharSequence m21254$r8$lambda$C8WAbPuOVDRzHHVqgnVFfFhcE(com.paypal.oslo.core.network.graphql.error.GraphQLError graphQLError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphQLError, "");
        java.util.Map<java.lang.String, java.lang.Object> extensions = graphQLError.getExtensions();
        return java.lang.String.valueOf(extensions != null ? extensions.get("details") : null);
    }
}
