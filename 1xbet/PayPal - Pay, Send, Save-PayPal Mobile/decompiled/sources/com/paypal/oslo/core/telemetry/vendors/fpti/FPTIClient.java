package com.paypal.oslo.core.telemetry.vendors.fpti;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0002\u0015\u0016B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\f\u001a\u00020\u000b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0004\b\f\u0010\rJ/\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/core/telemetry/vendors/fpti/FPTIClient;", "", "Lcom/paypal/oslo/core/telemetry/vendors/fpti/FPTIService;", "fptiService", "Lkotlinx/coroutines/CoroutineScope;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "<init>", "(Lcom/paypal/oslo/core/telemetry/vendors/fpti/FPTIService;Lkotlinx/coroutines/CoroutineScope;)V", "", "", com.datadog.android.rum.internal.RumFeature.EVENT_ATTRIBUTES_PROPERTY, "Lkotlinx/coroutines/Job;", "sendEvent", "(Ljava/util/Map;)Lkotlinx/coroutines/Job;", "p0", "Camera2StreamConfigurationMap", "(Ljava/util/Map;)Ljava/util/Map;", "Lcom/paypal/oslo/core/telemetry/vendors/fpti/FPTIService;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/CoroutineScope;", "Companion", "Keys"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FPTIClient {

    @java.lang.Deprecated
    public static final java.lang.String COMPONENT = "oslo-android";

    @java.lang.Deprecated
    public static final java.lang.String EVENT_SOURCE = "mobile-native";

    @java.lang.Deprecated
    public static final java.lang.String SPACE_KEY = "SKXFMW";

    @java.lang.Deprecated
    public static final java.lang.String TENANT_NAME = "paypal";

    @java.lang.Deprecated
    public static final java.lang.String UNKNOWN_EVENT = "unknown_event";

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.telemetry.vendors.fpti.FPTIService getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineScope Camera2StreamConfigurationMap;
    private static final com.paypal.oslo.core.telemetry.vendors.fpti.FPTIClient.Companion Companion = new com.paypal.oslo.core.telemetry.vendors.fpti.FPTIClient.Companion(null);
    public static final int $stable = 8;

    @javax.inject.Inject
    public FPTIClient(com.paypal.oslo.core.telemetry.vendors.fpti.FPTIService fPTIService, @com.paypal.oslo.core.di.annotations.IoApplicationScope kotlinx.coroutines.CoroutineScope coroutineScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fPTIService, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        this.getHighSpeedVideoFpsRangesFor = fPTIService;
        this.Camera2StreamConfigurationMap = coroutineScope;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/core/telemetry/vendors/fpti/FPTIClient$Companion;", "", "<init>", "()V", "", "EVENT_SOURCE", "Ljava/lang/String;", "TENANT_NAME", "COMPONENT", "SPACE_KEY", "UNKNOWN_EVENT"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u001a\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\n\u0010\bR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u0005\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/core/telemetry/vendors/fpti/FPTIClient$Keys;", "", "<init>", "()V", "", "getHighSpeedVideoSizes", "Ljava/lang/String;", "Camera2StreamConfigurationMap", "()Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "", "getHighSpeedVideoSizesFor", "Ljava/util/Set;", "()Ljava/util/Set;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    static final class Keys {

        /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
        private static final java.util.Set<java.lang.String> getHighResolutionOutputSizeshNQ4ISI;
        public static final com.paypal.oslo.core.telemetry.vendors.fpti.FPTIClient.Keys INSTANCE = new com.paypal.oslo.core.telemetry.vendors.fpti.FPTIClient.Keys();
        private static final java.lang.String getHighSpeedVideoSizes = com.paypal.oslo.core.telemetry.analytics.context.ContextKeysKt.key(new kotlin.jvm.internal.PropertyReference1Impl() { // from class: com.paypal.oslo.core.telemetry.vendors.fpti.FPTIClient$Keys$EVENT_NAME$1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public final java.lang.Object get(java.lang.Object obj) {
                return ((com.paypal.oslo.core.telemetry.analytics.schema.context.MetadataContext) obj).getEventName();
            }
        });

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private static final java.lang.String getHighSpeedVideoFpsRanges = com.paypal.oslo.core.telemetry.analytics.context.ContextKeysKt.key(new kotlin.jvm.internal.PropertyReference1Impl() { // from class: com.paypal.oslo.core.telemetry.vendors.fpti.FPTIClient$Keys$PRODUCT$1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public final java.lang.Object get(java.lang.Object obj) {
                return ((com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext) obj).getProduct();
            }
        });

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private static final java.lang.String getHighSpeedVideoFpsRangesFor = com.paypal.oslo.core.telemetry.analytics.context.ContextKeysKt.key(new kotlin.jvm.internal.PropertyReference1Impl() { // from class: com.paypal.oslo.core.telemetry.vendors.fpti.FPTIClient$Keys$EVENT_TIME$1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public final java.lang.Object get(java.lang.Object obj) {
                return ((com.paypal.oslo.core.telemetry.analytics.schema.context.MetadataContext) obj).getEventTime();
            }
        });
        private static final java.lang.String Camera2StreamConfigurationMap = com.paypal.oslo.core.telemetry.analytics.context.ContextKeysKt.key(new kotlin.jvm.internal.PropertyReference1Impl() { // from class: com.paypal.oslo.core.telemetry.vendors.fpti.FPTIClient$Keys$ENCRYPTED_CUSTOMER_ID$1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public final java.lang.Object get(java.lang.Object obj) {
                return ((com.paypal.oslo.core.telemetry.analytics.schema.context.session.UserContext) obj).getId();
            }
        });

        private Keys() {
        }

        static {
            java.util.Set of = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new kotlin.reflect.KClass[]{kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.telemetry.analytics.schema.context.session.ApplicationContext.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.telemetry.analytics.schema.context.session.DeviceInfoContext.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.telemetry.analytics.schema.context.session.DeviceStateContext.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.telemetry.analytics.schema.context.session.UserContext.class)});
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(of, 10));
            java.util.Iterator it = of.iterator();
            while (it.hasNext()) {
                java.lang.String contextKey = com.paypal.oslo.core.telemetry.analytics.context.ContextKeyCache.INSTANCE.getMetadata((kotlin.reflect.KClass) it.next()).getContextKey();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(contextKey);
                sb.append(".");
                arrayList.add(sb.toString());
            }
            getHighResolutionOutputSizeshNQ4ISI = kotlin.collections.CollectionsKt.toSet(arrayList);
        }

        public static java.lang.String Camera2StreamConfigurationMap() {
            return getHighSpeedVideoSizes;
        }

        public static java.lang.String getHighSpeedVideoFpsRangesFor() {
            return getHighSpeedVideoFpsRanges;
        }

        public static java.lang.String getHighResolutionOutputSizeshNQ4ISI() {
            return getHighSpeedVideoFpsRangesFor;
        }

        public static java.lang.String getHighSpeedVideoFpsRanges() {
            return Camera2StreamConfigurationMap;
        }

        public static java.util.Set<java.lang.String> getHighSpeedVideoSizes() {
            return getHighResolutionOutputSizeshNQ4ISI;
        }
    }

    public final kotlinx.coroutines.Job sendEvent(java.util.Map<java.lang.String, ? extends java.lang.Object> attributes) {
        kotlinx.coroutines.Job launch$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "");
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.Camera2StreamConfigurationMap, null, null, new com.paypal.oslo.core.telemetry.vendors.fpti.FPTIClient$sendEvent$1(attributes, this, null), 3, null);
        return launch$default;
    }

    private static java.util.Map<java.lang.String, java.lang.Object> Camera2StreamConfigurationMap(java.util.Map<java.lang.String, ? extends java.lang.Object> p0) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry<java.lang.String, ? extends java.lang.Object> entry : p0.entrySet()) {
            java.lang.String key = entry.getKey();
            com.paypal.oslo.core.telemetry.vendors.fpti.FPTIClient.Keys keys = com.paypal.oslo.core.telemetry.vendors.fpti.FPTIClient.Keys.INSTANCE;
            java.util.Set<java.lang.String> highSpeedVideoSizes = com.paypal.oslo.core.telemetry.vendors.fpti.FPTIClient.Keys.getHighSpeedVideoSizes();
            if (!(highSpeedVideoSizes instanceof java.util.Collection) || !highSpeedVideoSizes.isEmpty()) {
                java.util.Iterator<T> it = highSpeedVideoSizes.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (kotlin.text.StringsKt.startsWith$default(key, (java.lang.String) it.next(), false, 2, (java.lang.Object) null)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                        break;
                    }
                }
            }
        }
        return linkedHashMap;
    }

    public static final /* synthetic */ com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest access$buildRequest(com.paypal.oslo.core.telemetry.vendors.fpti.FPTIClient fPTIClient, java.util.Map map) {
        com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.CommonEventParams commonEventParams = new com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.CommonEventParams(EVENT_SOURCE, new com.paypal.oslo.core.telemetry.util.AnyMap(Camera2StreamConfigurationMap(map)), "paypal");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            java.lang.String str = (java.lang.String) entry.getKey();
            com.paypal.oslo.core.telemetry.vendors.fpti.FPTIClient.Keys keys = com.paypal.oslo.core.telemetry.vendors.fpti.FPTIClient.Keys.INSTANCE;
            java.util.Set<java.lang.String> highSpeedVideoSizes = com.paypal.oslo.core.telemetry.vendors.fpti.FPTIClient.Keys.getHighSpeedVideoSizes();
            if (!(highSpeedVideoSizes instanceof java.util.Collection) || !highSpeedVideoSizes.isEmpty()) {
                java.util.Iterator<T> it2 = highSpeedVideoSizes.iterator();
                while (it2.hasNext()) {
                    if (kotlin.text.StringsKt.startsWith$default(str, (java.lang.String) it2.next(), false, 2, (java.lang.Object) null)) {
                        break;
                    }
                }
            }
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        com.paypal.oslo.core.telemetry.util.AnyMap anyMap = new com.paypal.oslo.core.telemetry.util.AnyMap(linkedHashMap);
        com.paypal.oslo.core.telemetry.vendors.fpti.FPTIClient.Keys keys2 = com.paypal.oslo.core.telemetry.vendors.fpti.FPTIClient.Keys.INSTANCE;
        java.lang.Object obj = map.get(com.paypal.oslo.core.telemetry.vendors.fpti.FPTIClient.Keys.Camera2StreamConfigurationMap());
        java.lang.String str2 = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (str2 == null) {
            str2 = UNKNOWN_EVENT;
        }
        java.lang.String str3 = str2;
        com.paypal.oslo.core.telemetry.vendors.fpti.FPTIClient.Keys keys3 = com.paypal.oslo.core.telemetry.vendors.fpti.FPTIClient.Keys.INSTANCE;
        java.lang.Object obj2 = map.get(com.paypal.oslo.core.telemetry.vendors.fpti.FPTIClient.Keys.getHighSpeedVideoFpsRangesFor());
        java.lang.String str4 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
        java.lang.String obj3 = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj3, "");
        com.paypal.oslo.core.telemetry.vendors.fpti.FPTIClient.Keys keys4 = com.paypal.oslo.core.telemetry.vendors.fpti.FPTIClient.Keys.INSTANCE;
        java.lang.Object obj4 = map.get(com.paypal.oslo.core.telemetry.vendors.fpti.FPTIClient.Keys.getHighResolutionOutputSizeshNQ4ISI());
        java.lang.String str5 = obj4 instanceof java.lang.String ? (java.lang.String) obj4 : null;
        if (str5 == null) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.telemetry.LoggerKt.log, "FPTI oslo event missing timestamp, falling back to current time", null, null, 6, null);
            str5 = com.paypal.oslo.core.telemetry.util.TimeUtils.INSTANCE.currentFormattedUtcTime();
        }
        java.util.List listOf = kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.EventParams(anyMap, str3, str4, COMPONENT, obj3, str5, SPACE_KEY));
        com.paypal.oslo.core.telemetry.vendors.fpti.FPTIClient.Keys keys5 = com.paypal.oslo.core.telemetry.vendors.fpti.FPTIClient.Keys.INSTANCE;
        java.lang.Object obj5 = map.get(com.paypal.oslo.core.telemetry.vendors.fpti.FPTIClient.Keys.getHighSpeedVideoFpsRanges());
        java.lang.String str6 = obj5 instanceof java.lang.String ? (java.lang.String) obj5 : null;
        com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.UserEvent userEvent = new com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.UserEvent(commonEventParams, listOf, str6 != null ? new com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest.User(str6) : null);
        java.lang.String obj6 = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj6, "");
        return new com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest(obj6, kotlin.collections.CollectionsKt.listOf(userEvent));
    }
}
