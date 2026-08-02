package com.datadog.android.trace.internal.domain.event;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010&\n\u0002\u0010\u0000\n\u0002\b\b\b\u0000\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0011\u001a\u0004\u0018\u00010\f*\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/datadog/android/trace/internal/domain/event/SpanEventSerializer;", "Lcom/datadog/android/trace/internal/storage/ContextAwareSerializer;", "Lcom/datadog/android/trace/model/SpanEvent;", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "Lcom/datadog/android/core/constraints/DataConstraints;", "dataConstraints", "<init>", "(Lcom/datadog/android/api/InternalLogger;Lcom/datadog/android/core/constraints/DataConstraints;)V", "Lcom/datadog/android/api/context/DatadogContext;", "datadogContext", "model", "", "serialize", "(Lcom/datadog/android/api/context/DatadogContext;Lcom/datadog/android/trace/model/SpanEvent;)Ljava/lang/String;", "", "", "Camera2StreamConfigurationMap", "(Ljava/util/Map$Entry;)Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Lcom/datadog/android/core/constraints/DataConstraints;", "getHighSpeedVideoSizes", "Lcom/datadog/android/api/InternalLogger;", "getHighResolutionOutputSizeshNQ4ISI", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SpanEventSerializer implements com.datadog.android.trace.internal.storage.ContextAwareSerializer<com.datadog.android.trace.model.SpanEvent> {
    public static final java.lang.String META_ACCOUNT_KEY_PREFIX = "meta.account";
    public static final java.lang.String META_USR_KEY_PREFIX = "meta.usr";
    public static final java.lang.String METRICS_KEY_PREFIX = "metrics";
    public static final java.lang.String TAG_ENV = "env";
    public static final java.lang.String TAG_SPANS = "spans";
    private final com.datadog.android.core.constraints.DataConstraints getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.datadog.android.api.InternalLogger getHighResolutionOutputSizeshNQ4ISI;

    public SpanEventSerializer(com.datadog.android.api.InternalLogger internalLogger, com.datadog.android.core.constraints.DataConstraints dataConstraints) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataConstraints, "");
        this.getHighResolutionOutputSizeshNQ4ISI = internalLogger;
        this.getHighSpeedVideoFpsRangesFor = dataConstraints;
    }

    public /* synthetic */ SpanEventSerializer(com.datadog.android.api.InternalLogger internalLogger, com.datadog.android.core.constraints.DatadogDataConstraints datadogDataConstraints, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(internalLogger, (i & 2) != 0 ? new com.datadog.android.core.constraints.DatadogDataConstraints(internalLogger) : datadogDataConstraints);
    }

    private final java.lang.String Camera2StreamConfigurationMap(final java.util.Map.Entry<java.lang.String, ? extends java.lang.Object> entry) {
        try {
            java.lang.Object value = entry.getValue();
            if (!kotlin.jvm.internal.Intrinsics.areEqual(value, com.datadog.android.internal.utils.MapUtilsKt.getNULL_MAP_VALUE()) && value != null) {
                return value instanceof java.util.Date ? java.lang.String.valueOf(((java.util.Date) value).getTime()) : value instanceof com.google.gson.JsonPrimitive ? ((com.google.gson.JsonPrimitive) value).getAsString() : value.toString();
            }
            return null;
        } catch (java.lang.Exception e) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighResolutionOutputSizeshNQ4ISI, com.datadog.android.api.InternalLogger.Level.ERROR, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.datadog.android.api.InternalLogger.Target[]{com.datadog.android.api.InternalLogger.Target.USER, com.datadog.android.api.InternalLogger.Target.TELEMETRY}), (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.trace.internal.domain.event.SpanEventSerializer$valueToMetaStringOrNull$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    java.lang.String key = entry.getKey();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Error converting value for key ");
                    sb.append((java.lang.Object) key);
                    sb.append(" to meta string, it will be dropped.");
                    return sb.toString();
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
            return null;
        }
    }

    @Override // com.datadog.android.trace.internal.storage.ContextAwareSerializer
    public final java.lang.String serialize(com.datadog.android.api.context.DatadogContext datadogContext, com.datadog.android.trace.model.SpanEvent model) {
        com.datadog.android.trace.model.SpanEvent.Account account;
        com.datadog.android.trace.model.SpanEvent.Meta copy;
        com.datadog.android.trace.model.SpanEvent copy2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(datadogContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(model, "");
        com.datadog.android.trace.model.SpanEvent.Usr usr = model.getMeta().getUsr();
        java.util.Map validateAttributes$default = com.datadog.android.core.constraints.DataConstraints.DefaultImpls.validateAttributes$default(this.getHighSpeedVideoFpsRangesFor, usr.getAdditionalProperties(), META_USR_KEY_PREFIX, null, null, 12, null);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(validateAttributes$default.size()));
        for (java.util.Map.Entry<java.lang.String, ? extends java.lang.Object> entry : validateAttributes$default.entrySet()) {
            linkedHashMap.put(entry.getKey(), Camera2StreamConfigurationMap(entry));
        }
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry2 : linkedHashMap.entrySet()) {
            if (((java.lang.String) entry2.getValue()) != null) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        com.datadog.android.trace.model.SpanEvent.Usr copy$default = com.datadog.android.trace.model.SpanEvent.Usr.copy$default(usr, null, null, null, kotlin.collections.MapsKt.toMutableMap(linkedHashMap2), 7, null);
        com.datadog.android.trace.model.SpanEvent.Account account2 = model.getMeta().getAccount();
        if (account2 != null) {
            java.util.Map validateAttributes$default2 = com.datadog.android.core.constraints.DataConstraints.DefaultImpls.validateAttributes$default(this.getHighSpeedVideoFpsRangesFor, account2.getAdditionalProperties(), META_ACCOUNT_KEY_PREFIX, null, null, 12, null);
            java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(validateAttributes$default2.size()));
            for (java.util.Map.Entry<java.lang.String, ? extends java.lang.Object> entry3 : validateAttributes$default2.entrySet()) {
                linkedHashMap3.put(entry3.getKey(), Camera2StreamConfigurationMap(entry3));
            }
            java.util.LinkedHashMap linkedHashMap4 = new java.util.LinkedHashMap();
            for (java.util.Map.Entry entry4 : linkedHashMap3.entrySet()) {
                if (((java.lang.String) entry4.getValue()) != null) {
                    linkedHashMap4.put(entry4.getKey(), entry4.getValue());
                }
            }
            account = com.datadog.android.trace.model.SpanEvent.Account.copy$default(account2, null, null, kotlin.collections.MapsKt.toMutableMap(linkedHashMap4), 3, null);
        } else {
            account = null;
        }
        com.datadog.android.trace.model.SpanEvent.Metrics metrics = model.getMetrics();
        com.datadog.android.trace.model.SpanEvent.Metrics copy$default2 = com.datadog.android.trace.model.SpanEvent.Metrics.copy$default(metrics, null, com.datadog.android.core.constraints.DataConstraints.DefaultImpls.validateAttributes$default(this.getHighSpeedVideoFpsRangesFor, metrics.getAdditionalProperties(), METRICS_KEY_PREFIX, null, null, 12, null), 1, null);
        copy = r17.copy((r22 & 1) != 0 ? r17.version : null, (r22 & 2) != 0 ? r17.dd : null, (r22 & 4) != 0 ? r17.span : null, (r22 & 8) != 0 ? r17.tracer : null, (r22 & 16) != 0 ? r17.usr : copy$default, (r22 & 32) != 0 ? r17.account : account, (r22 & 64) != 0 ? r17.network : null, (r22 & 128) != 0 ? r17.device : null, (r22 & 256) != 0 ? r17.os : null, (r22 & 512) != 0 ? model.getMeta().additionalProperties : null);
        copy2 = model.copy((r30 & 1) != 0 ? model.traceId : null, (r30 & 2) != 0 ? model.spanId : null, (r30 & 4) != 0 ? model.parentId : null, (r30 & 8) != 0 ? model.resource : null, (r30 & 16) != 0 ? model.name : null, (r30 & 32) != 0 ? model.service : null, (r30 & 64) != 0 ? model.duration : 0L, (r30 & 128) != 0 ? model.start : 0L, (r30 & 256) != 0 ? model.error : 0L, (r30 & 512) != 0 ? model.metrics : copy$default2, (r30 & 1024) != 0 ? model.meta : copy);
        com.google.gson.JsonElement json = copy2.toJson();
        com.google.gson.JsonArray jsonArray = new com.google.gson.JsonArray(1);
        jsonArray.add(json);
        com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
        jsonObject.add(TAG_SPANS, jsonArray);
        jsonObject.addProperty("env", datadogContext.getEnv());
        java.lang.String obj = jsonObject.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }
}
