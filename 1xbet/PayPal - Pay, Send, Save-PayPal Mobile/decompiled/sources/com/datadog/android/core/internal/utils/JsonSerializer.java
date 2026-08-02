package com.datadog.android.core.internal.utils;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0006\u0010\u0007J3\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b*\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/datadog/android/core/internal/utils/JsonSerializer;", "", "<init>", "()V", "item", "Lcom/google/gson/JsonElement;", "toJsonElement", "(Ljava/lang/Object;)Lcom/google/gson/JsonElement;", "", "", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "safeMapValuesToJson", "(Ljava/util/Map;Lcom/datadog/android/api/InternalLogger;)Ljava/util/Map;", "ITEM_SERIALIZATION_ERROR", "Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class JsonSerializer {
    public static final com.datadog.android.core.internal.utils.JsonSerializer INSTANCE = new com.datadog.android.core.internal.utils.JsonSerializer();
    public static final java.lang.String ITEM_SERIALIZATION_ERROR = "Error serializing value for key %s, value was dropped.";

    private JsonSerializer() {
    }

    public final com.google.gson.JsonElement toJsonElement(java.lang.Object item) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(item, com.datadog.android.internal.utils.MapUtilsKt.getNULL_MAP_VALUE())) {
            com.google.gson.JsonNull jsonNull = com.google.gson.JsonNull.INSTANCE;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jsonNull, "");
            return jsonNull;
        }
        if (item == null) {
            com.google.gson.JsonNull jsonNull2 = com.google.gson.JsonNull.INSTANCE;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jsonNull2, "");
            return jsonNull2;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(item, com.google.gson.JsonNull.INSTANCE)) {
            com.google.gson.JsonNull jsonNull3 = com.google.gson.JsonNull.INSTANCE;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jsonNull3, "");
            return jsonNull3;
        }
        if (item instanceof java.lang.Boolean) {
            return new com.google.gson.JsonPrimitive((java.lang.Boolean) item);
        }
        if (!(item instanceof java.lang.Integer) && !(item instanceof java.lang.Long) && !(item instanceof java.lang.Float) && !(item instanceof java.lang.Double)) {
            if (item instanceof java.lang.String) {
                return new com.google.gson.JsonPrimitive((java.lang.String) item);
            }
            if (item instanceof java.util.Date) {
                return new com.google.gson.JsonPrimitive(java.lang.Long.valueOf(((java.util.Date) item).getTime()));
            }
            if (item instanceof com.google.gson.JsonArray) {
                return (com.google.gson.JsonElement) item;
            }
            if (item instanceof java.lang.Iterable) {
                return com.datadog.android.core.internal.utils.MiscUtilsKt.toJsonArray((java.lang.Iterable<?>) item);
            }
            if (item instanceof java.util.Map) {
                return com.datadog.android.core.internal.utils.MiscUtilsKt.toJsonObject((java.util.Map<?, ?>) item);
            }
            if (!(item instanceof com.google.gson.JsonObject) && !(item instanceof com.google.gson.JsonPrimitive)) {
                return item instanceof org.json.JSONObject ? com.datadog.android.core.internal.utils.MiscUtilsKt.toJsonObject((org.json.JSONObject) item) : item instanceof org.json.JSONArray ? com.datadog.android.core.internal.utils.MiscUtilsKt.toJsonArray((org.json.JSONArray) item) : new com.google.gson.JsonPrimitive(item.toString());
            }
            return (com.google.gson.JsonElement) item;
        }
        return new com.google.gson.JsonPrimitive((java.lang.Number) item);
    }

    public final java.util.Map<java.lang.String, com.google.gson.JsonElement> safeMapValuesToJson(java.util.Map<java.lang.String, ? extends java.lang.Object> map, com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (final java.util.Map.Entry<java.lang.String, ? extends java.lang.Object> entry : map.entrySet()) {
            try {
                kotlin.Pair pair = kotlin.TuplesKt.to(entry.getKey(), INSTANCE.toJsonElement(entry.getValue()));
                linkedHashMap.put(pair.getFirst(), pair.getSecond());
            } catch (java.lang.Exception e) {
                com.datadog.android.api.InternalLogger.DefaultImpls.log$default(internalLogger, com.datadog.android.api.InternalLogger.Level.ERROR, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.datadog.android.api.InternalLogger.Target[]{com.datadog.android.api.InternalLogger.Target.USER, com.datadog.android.api.InternalLogger.Target.TELEMETRY}), (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.utils.JsonSerializer$safeMapValuesToJson$1$1
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                    public final java.lang.String invoke() {
                        java.lang.String format = java.lang.String.format(java.util.Locale.US, com.datadog.android.core.internal.utils.JsonSerializer.ITEM_SERIALIZATION_ERROR, java.util.Arrays.copyOf(new java.lang.Object[]{entry.getKey()}, 1));
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                        return format;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }
                }, (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
            }
        }
        return linkedHashMap;
    }
}
