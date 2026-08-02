package com.paypal.oslo.core.telemetry.compose;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/navigation3/runtime/NavKey;", "Lcom/paypal/oslo/core/telemetry/compose/DestinationAnalyticsData;", "analyticsFromDestination", "(Landroidx/navigation3/runtime/NavKey;)Lcom/paypal/oslo/core/telemetry/compose/DestinationAnalyticsData;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DestinationAnalyticsDataKt {
    public static final com.paypal.oslo.core.telemetry.compose.DestinationAnalyticsData analyticsFromDestination(androidx.navigation3.runtime.NavKey navKey) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navKey, "");
        com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext = new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext("unknown", "unknown", "unknown");
        if (!(navKey instanceof com.paypal.oslo.core.telemetry.compose.api.DestinationAnalyticsContextProvider)) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.telemetry.LoggerKt.log, "DestinationAnalyticsContextProvider not provided", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("navKey", com.paypal.oslo.core.telemetry.util.NavKeyExtensionsKt.extractSimpleName(navKey))), null, 4, null);
            return new com.paypal.oslo.core.telemetry.compose.DestinationAnalyticsData("unknown", userIntentContext, null, null, kotlin.collections.CollectionsKt.emptyList());
        }
        com.paypal.oslo.core.telemetry.compose.api.ScreenAnalyticsDescriptor analyticsScreenDescriptor = ((com.paypal.oslo.core.telemetry.compose.api.DestinationAnalyticsContextProvider) navKey).toAnalyticsScreenDescriptor();
        java.util.Set<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> contexts = analyticsScreenDescriptor.getContexts();
        java.util.Set<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> set = contexts;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : set) {
            if (obj instanceof com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext) {
                arrayList.add(obj);
            }
        }
        com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext businessFlowContext = (com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) arrayList);
        com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntent = analyticsScreenDescriptor.getUserIntent();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : set) {
            if (obj2 instanceof com.paypal.oslo.core.telemetry.analytics.schema.context.standard.NavigationContext) {
                arrayList2.add(obj2);
            }
        }
        com.paypal.oslo.core.telemetry.analytics.schema.context.standard.NavigationContext navigationContext = (com.paypal.oslo.core.telemetry.analytics.schema.context.standard.NavigationContext) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) arrayList2);
        java.util.List list = kotlin.collections.CollectionsKt.toList(set);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj3 : list) {
            if (!(((com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext) obj3) instanceof com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext)) {
                arrayList3.add(obj3);
            }
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        for (java.lang.Object obj4 : arrayList3) {
            if (!(((com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext) obj4) instanceof com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext)) {
                arrayList4.add(obj4);
            }
        }
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        for (java.lang.Object obj5 : arrayList4) {
            if (!(((com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext) obj5) instanceof com.paypal.oslo.core.telemetry.analytics.schema.context.standard.NavigationContext)) {
                arrayList5.add(obj5);
            }
        }
        java.util.ArrayList arrayList6 = arrayList5;
        com.paypal.android.logger.Logger logger = com.paypal.oslo.core.telemetry.LoggerKt.log;
        kotlin.Pair[] pairArr = new kotlin.Pair[6];
        pairArr[0] = kotlin.TuplesKt.to("destination", analyticsScreenDescriptor.getId());
        pairArr[1] = kotlin.TuplesKt.to("contextCount", java.lang.String.valueOf(contexts.size()));
        if (businessFlowContext == null || (str = businessFlowContext.getName()) == null) {
            str = "none";
        }
        pairArr[2] = kotlin.TuplesKt.to("businessFlow", str);
        pairArr[3] = kotlin.TuplesKt.to("userIntent", userIntent.getProduct());
        pairArr[4] = kotlin.TuplesKt.to("domainContexts", java.lang.String.valueOf(arrayList6.size()));
        pairArr[5] = kotlin.TuplesKt.to("navKey", com.paypal.oslo.core.telemetry.util.NavKeyExtensionsKt.extractSimpleName(navKey));
        com.paypal.android.logger.Logger.d$default(logger, "Destination provided analytics contexts", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
        return new com.paypal.oslo.core.telemetry.compose.DestinationAnalyticsData(analyticsScreenDescriptor.getId(), userIntent, businessFlowContext, navigationContext, arrayList6);
    }
}
