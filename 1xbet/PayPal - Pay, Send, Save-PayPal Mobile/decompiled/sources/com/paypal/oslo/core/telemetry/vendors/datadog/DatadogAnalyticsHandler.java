package com.paypal.oslo.core.telemetry.vendors.datadog;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rR\u0015\u0010\u0011\u001a\u00020\u000e8CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/core/telemetry/vendors/datadog/DatadogAnalyticsHandler;", "Lcom/paypal/oslo/core/telemetry/analytics/handler/AnalyticsHandler;", "Lcom/paypal/oslo/core/telemetry/analytics/transformer/AnalyticsRegistryResolver;", "analyticsRegistryResolver", "<init>", "(Lcom/paypal/oslo/core/telemetry/analytics/transformer/AnalyticsRegistryResolver;)V", "Lcom/paypal/oslo/core/telemetry/analytics/event/AnalyticsEvent;", "analyticsEvent", "", "handle", "(Lcom/paypal/oslo/core/telemetry/analytics/event/AnalyticsEvent;)V", "", "shouldHandle", "(Lcom/paypal/oslo/core/telemetry/analytics/event/AnalyticsEvent;)Z", "Lcom/paypal/oslo/core/telemetry/analytics/transformer/AnalyticsTransformerRegistry;", "getHighSpeedVideoSizes", "Lkotlin/properties/ReadOnlyProperty;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DatadogAnalyticsHandler implements com.paypal.oslo.core.telemetry.analytics.handler.AnalyticsHandler {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.properties.ReadOnlyProperty getHighSpeedVideoFpsRanges;
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighResolutionOutputSizeshNQ4ISI = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.core.telemetry.vendors.datadog.DatadogAnalyticsHandler.class, "registry", "getRegistry()Lcom/paypal/oslo/core/telemetry/analytics/transformer/AnalyticsTransformerRegistry;", 0))};
    public static final int $stable = 8;

    @javax.inject.Inject
    public DatadogAnalyticsHandler(com.paypal.oslo.core.telemetry.analytics.transformer.AnalyticsRegistryResolver analyticsRegistryResolver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsRegistryResolver, "");
        this.getHighSpeedVideoFpsRanges = com.paypal.oslo.core.telemetry.analytics.transformer.AnalyticsRegistryDelegateKt.analyticsRegistry(analyticsRegistryResolver, com.paypal.oslo.core.telemetry.analytics.transformer.ProviderType.DATADOG);
    }

    @Override // com.paypal.oslo.core.telemetry.analytics.handler.AnalyticsHandler
    public final void handle(com.paypal.oslo.core.telemetry.analytics.event.AnalyticsEvent analyticsEvent) {
        java.lang.String obj;
        com.datadog.android.rum.RumActionType rumActionType;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsEvent, "");
        java.util.List<java.lang.Object> contexts$telemetry_release = analyticsEvent.getContexts$telemetry_release();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj2 : contexts$telemetry_release) {
            if (obj2 instanceof com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext) {
                arrayList.add(obj2);
            }
        }
        com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext uIContext = (com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) arrayList);
        java.util.List<java.lang.Object> contexts$telemetry_release2 = analyticsEvent.getContexts$telemetry_release();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj3 : contexts$telemetry_release2) {
            if (obj3 instanceof com.paypal.oslo.core.telemetry.analytics.schema.context.MetadataContext) {
                arrayList2.add(obj3);
            }
        }
        com.paypal.oslo.core.telemetry.analytics.schema.context.MetadataContext metadataContext = (com.paypal.oslo.core.telemetry.analytics.schema.context.MetadataContext) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) arrayList2);
        if (uIContext == null) {
            obj = metadataContext != null ? metadataContext.getEventName() : null;
        } else {
            java.lang.String[] strArr = new java.lang.String[3];
            strArr[0] = uIContext.getScreen().getName();
            com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module module = uIContext.getModule();
            strArr[1] = module != null ? module.getName() : null;
            com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item item = uIContext.getItem();
            strArr[2] = item != null ? item.getName() : null;
            java.lang.String joinToString$default = kotlin.collections.CollectionsKt.joinToString$default(kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) strArr), "_", null, null, 0, null, null, 62, null);
            com.paypal.oslo.core.telemetry.analytics.event.EventType eventType = analyticsEvent.getEventType();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(joinToString$default);
            sb.append(" ");
            sb.append(eventType);
            obj = sb.toString();
        }
        if (obj == null) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.core.telemetry.LoggerKt.log, "Action name is required to send analytics events to Datadog, ignoring the event", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("event", analyticsEvent.getEventType().name())), null, 4, null);
            return;
        }
        int i = com.paypal.oslo.core.telemetry.vendors.datadog.DatadogAnalyticsHandler.WhenMappings.$EnumSwitchMapping$0[analyticsEvent.getEventType().ordinal()];
        if (i == 1) {
            rumActionType = com.datadog.android.rum.RumActionType.TAP;
        } else {
            if (i != 2 && i != 3 && i != 4 && i != 5) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            rumActionType = com.datadog.android.rum.RumActionType.CUSTOM;
        }
        java.util.Map<java.lang.String, ? extends java.lang.Object> map = (java.util.Map) ((com.paypal.oslo.core.telemetry.analytics.transformer.AnalyticsTransformerRegistry) this.getHighSpeedVideoFpsRanges.getValue(this, getHighResolutionOutputSizeshNQ4ISI[0])).transform(analyticsEvent.getContexts$telemetry_release());
        if (map == null) {
            map = kotlin.collections.MapsKt.emptyMap();
        }
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.telemetry.LoggerKt.log, "[Analytics] Sending event to Datadog", map, null, 4, null);
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.telemetry.LoggerKt.log, "[Pretty]", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("event", java.lang.String.valueOf(com.paypal.oslo.core.telemetry.util.PrintingUtilsKt.prettyPrint$default(com.paypal.oslo.core.telemetry.util.PrintingUtilsKt.only(map, "ui.screen.name"), 0, 0, 3, null)))), null, 4, null);
        com.datadog.android.rum.GlobalRumMonitor.get$default(null, 1, null).addAction(rumActionType, obj, map);
    }

    @Override // com.paypal.oslo.core.telemetry.analytics.handler.AnalyticsHandler
    public final boolean shouldHandle(com.paypal.oslo.core.telemetry.analytics.event.AnalyticsEvent analyticsEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsEvent, "");
        java.util.List<java.lang.Object> contexts$telemetry_release = analyticsEvent.getContexts$telemetry_release();
        if ((contexts$telemetry_release instanceof java.util.Collection) && contexts$telemetry_release.isEmpty()) {
            return false;
        }
        for (java.lang.Object obj : contexts$telemetry_release) {
            if ((obj instanceof com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext) || (obj instanceof com.paypal.oslo.core.telemetry.analytics.schema.context.MetadataContext)) {
                return true;
            }
        }
        return false;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.core.telemetry.analytics.event.EventType.values().length];
            try {
                iArr[com.paypal.oslo.core.telemetry.analytics.event.EventType.Clicked.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.core.telemetry.analytics.event.EventType.Appeared.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.core.telemetry.analytics.event.EventType.Disappeared.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.core.telemetry.analytics.event.EventType.Available.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.core.telemetry.analytics.event.EventType.Activity.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
