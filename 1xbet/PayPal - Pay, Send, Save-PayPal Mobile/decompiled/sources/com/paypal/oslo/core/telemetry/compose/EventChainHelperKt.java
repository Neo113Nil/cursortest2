package com.paypal.oslo.core.telemetry.compose;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u001d\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000*\u00020\u0006H\u0000¢\u0006\u0004\b\n\u0010\u000b\"\u0014\u0010\r\u001a\u00020\f8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"", "Lcom/paypal/oslo/core/telemetry/analytics/context/AnalyticsContext;", "domainContexts", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "buildUserIntent", "(Ljava/util/List;)Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "Lcom/paypal/pds/analytics/AnalyticsChainHolder;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext;", "buildUIContext", "(Lcom/paypal/pds/analytics/AnalyticsChainHolder;)Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext;", "buildDomainContexts", "(Lcom/paypal/pds/analytics/AnalyticsChainHolder;)Ljava/util/List;", "", "Unknown", "Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class EventChainHelperKt {
    public static final java.lang.String Unknown = "unknown";

    public static final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext buildUserIntent(java.util.List<? extends com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (obj instanceof com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext) {
                arrayList.add(obj);
            }
        }
        com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext = (com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) arrayList);
        return userIntentContext == null ? new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext("unknown", "unknown", "unknown") : userIntentContext;
    }

    public static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext buildUIContext(com.paypal.pds.analytics.AnalyticsChainHolder analyticsChainHolder) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsChainHolder, "");
        androidx.navigation3.runtime.NavKey navKey = (androidx.navigation3.runtime.NavKey) analyticsChainHolder.get(com.paypal.oslo.core.telemetry.compose.PDSKeys.INSTANCE.getScreen());
        if (navKey != null) {
            str = com.paypal.oslo.core.telemetry.compose.DestinationAnalyticsDataKt.analyticsFromDestination(navKey).getId();
        } else {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.telemetry.LoggerKt.log, "Screen key is missing or has an incompatible type; using 'unknown' as screen name", null, null, 6, null);
            str = "unknown";
        }
        return new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen(str), (com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module) analyticsChainHolder.get(com.paypal.oslo.core.telemetry.compose.PDSKeys.INSTANCE.getModule()), (com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component) analyticsChainHolder.get(com.paypal.oslo.core.telemetry.compose.PDSKeys.INSTANCE.getComponent()), (com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item) analyticsChainHolder.get(com.paypal.oslo.core.telemetry.compose.PDSKeys.INSTANCE.getItem()));
    }

    public static final java.util.List<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> buildDomainContexts(com.paypal.pds.analytics.AnalyticsChainHolder analyticsChainHolder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsChainHolder, "");
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        analyticsChainHolder.traverseAncestors(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.telemetry.compose.EventChainHelperKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(com.paypal.oslo.core.telemetry.compose.EventChainHelperKt.m11691$r8$lambda$PXgAYEjcMx7QVAIdAGoehytqc(arrayList, (java.util.Map) obj));
            }
        });
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            if (hashSet.add(com.paypal.oslo.core.telemetry.analytics.context.ContextKeysKt.getContextKey((com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext) obj))) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    /* renamed from: $r8$lambda$P-XgAYEjcM-x7QVAIdAGoehytqc, reason: not valid java name */
    public static /* synthetic */ boolean m11691$r8$lambda$PXgAYEjcMx7QVAIdAGoehytqc(java.util.List list, java.util.Map map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        java.lang.Object obj = map.get(com.paypal.oslo.core.telemetry.compose.PDSKeys.INSTANCE.getAnalyticsContext());
        if (!(obj instanceof java.util.List)) {
            return true;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj2 : (java.lang.Iterable) obj) {
            if (obj2 instanceof com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext) {
                arrayList.add(obj2);
            }
        }
        list.addAll(arrayList);
        return true;
    }
}
