package com.paypal.oslo.core.telemetry.vendors.pie;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/core/telemetry/vendors/pie/PieClient;", "", "Lcom/paypal/oslo/core/telemetry/vendors/pie/PieService;", "pieService", "Lkotlinx/coroutines/CoroutineScope;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "<init>", "(Lcom/paypal/oslo/core/telemetry/vendors/pie/PieService;Lkotlinx/coroutines/CoroutineScope;)V", "Lcom/paypal/oslo/core/telemetry/analytics/event/EventType;", "eventType", "", "", com.datadog.android.rum.internal.RumFeature.EVENT_ATTRIBUTES_PROPERTY, "Lkotlinx/coroutines/Job;", "sendEvent", "(Lcom/paypal/oslo/core/telemetry/analytics/event/EventType;Ljava/util/Map;)Lkotlinx/coroutines/Job;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/telemetry/vendors/pie/PieService;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/CoroutineScope;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PieClient {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineScope getHighResolutionOutputSizeshNQ4ISI;
    private final com.paypal.oslo.core.telemetry.vendors.pie.PieService getHighSpeedVideoSizes;

    @javax.inject.Inject
    public PieClient(com.paypal.oslo.core.telemetry.vendors.pie.PieService pieService, @com.paypal.oslo.core.di.annotations.IoApplicationScope kotlinx.coroutines.CoroutineScope coroutineScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pieService, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        this.getHighSpeedVideoSizes = pieService;
        this.getHighResolutionOutputSizeshNQ4ISI = coroutineScope;
    }

    public final kotlinx.coroutines.Job sendEvent(com.paypal.oslo.core.telemetry.analytics.event.EventType eventType, java.util.Map<java.lang.String, ? extends java.lang.Object> attributes) {
        kotlinx.coroutines.Job launch$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "");
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighResolutionOutputSizeshNQ4ISI, null, null, new com.paypal.oslo.core.telemetry.vendors.pie.PieClient$sendEvent$1(this, eventType, attributes, null), 3, null);
        return launch$default;
    }

    public static final /* synthetic */ com.paypal.oslo.core.telemetry.vendors.pie.PieRequest access$buildPieRequest(com.paypal.oslo.core.telemetry.vendors.pie.PieClient pieClient, java.lang.String str, java.lang.String str2) {
        return new com.paypal.oslo.core.telemetry.vendors.pie.PieRequest(com.paypal.oslo.core.telemetry.util.TimeUtils.INSTANCE.currentFormattedUtcTime(), kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.telemetry.vendors.pie.PieRequest.Event(str, str2)));
    }

    public static final /* synthetic */ java.lang.String access$getPieId(com.paypal.oslo.core.telemetry.vendors.pie.PieClient pieClient, java.util.Map map) {
        java.lang.Object obj = map.get(com.paypal.oslo.core.telemetry.analytics.context.ContextKeysKt.key(new kotlin.jvm.internal.PropertyReference1Impl() { // from class: com.paypal.oslo.core.telemetry.vendors.pie.PieClient$getPieId$sorTypeToReference$1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public final java.lang.Object get(java.lang.Object obj2) {
                return ((com.paypal.oslo.core.telemetry.analytics.schema.context.domain.SORContext) obj2).getReferences();
            }
        }));
        java.util.Map map2 = obj instanceof java.util.Map ? (java.util.Map) obj : null;
        java.lang.Object obj2 = map2 != null ? map2.get(com.paypal.oslo.core.telemetry.analytics.schema.context.domain.SORType.PIE) : null;
        com.paypal.oslo.core.telemetry.analytics.schema.context.domain.SORReference sORReference = obj2 instanceof com.paypal.oslo.core.telemetry.analytics.schema.context.domain.SORReference ? (com.paypal.oslo.core.telemetry.analytics.schema.context.domain.SORReference) obj2 : null;
        if (sORReference != null) {
            return sORReference.getId();
        }
        return null;
    }

    public static final /* synthetic */ java.lang.String access$toActivityType(com.paypal.oslo.core.telemetry.vendors.pie.PieClient pieClient, com.paypal.oslo.core.telemetry.analytics.event.EventType eventType) {
        int i = com.paypal.oslo.core.telemetry.vendors.pie.PieClient.WhenMappings.$EnumSwitchMapping$0[eventType.ordinal()];
        if (i == 1) {
            return "IMPRESSION";
        }
        if (i == 2) {
            return "CLICK";
        }
        if (i == 3 || i == 4 || i == 5) {
            return null;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.core.telemetry.analytics.event.EventType.values().length];
            try {
                iArr[com.paypal.oslo.core.telemetry.analytics.event.EventType.Appeared.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.core.telemetry.analytics.event.EventType.Clicked.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.core.telemetry.analytics.event.EventType.Available.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.core.telemetry.analytics.event.EventType.Disappeared.ordinal()] = 4;
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
