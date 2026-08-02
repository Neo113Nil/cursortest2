package com.datadog.android.core.internal.utils;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001aA\u0010\u000b\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0080\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a=\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\u000b\u0010\u000e\u001a!\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0010*\u00020\u000fH\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0017\u0010\u0015\u001a\u0004\u0018\u00010\u0012*\u0004\u0018\u00010\u0012H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0017\u0010\u0019\u001a\u00020\u0018*\u0006\u0012\u0002\b\u00030\u0017H\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0013\u0010\u0019\u001a\u00020\u0018*\u00020\u001bH\u0000¢\u0006\u0004\b\u0019\u0010\u001c\u001a\u001b\u0010\u001d\u001a\u00020\u0018*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0010H\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0013\u0010\u001d\u001a\u00020\u0018*\u00020\u001fH\u0000¢\u0006\u0004\b\u001d\u0010 \u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Lkotlin/Function0;", "", "block", "", "times", "", "loopsDelayInNanos", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "Lcom/datadog/android/internal/time/TimeProvider;", "timeProvider", "retryWithDelay", "(Lkotlin/jvm/functions/Function0;IJLcom/datadog/android/api/InternalLogger;Lcom/datadog/android/internal/time/TimeProvider;)Z", "retryDelayNs", "(IJLcom/datadog/android/api/InternalLogger;Lcom/datadog/android/internal/time/TimeProvider;Lkotlin/jvm/functions/Function0;)Z", "Lcom/google/gson/JsonObject;", "", "", "", "asDeepMap", "(Lcom/google/gson/JsonObject;)Ljava/util/Map;", "fromJsonElement", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "Lcom/google/gson/JsonElement;", "toJsonArray", "(Ljava/lang/Iterable;)Lcom/google/gson/JsonElement;", "Lorg/json/JSONArray;", "(Lorg/json/JSONArray;)Lcom/google/gson/JsonElement;", "toJsonObject", "(Ljava/util/Map;)Lcom/google/gson/JsonElement;", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)Lcom/google/gson/JsonElement;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MiscUtilsKt {
    public static final boolean retryWithDelay(kotlin.jvm.functions.Function0<java.lang.Boolean> function0, int i, long j, com.datadog.android.api.InternalLogger internalLogger, com.datadog.android.internal.time.TimeProvider timeProvider) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeProvider, "");
        long deviceElapsedTimeNanos = timeProvider.getDeviceElapsedTimeNanos() - j;
        int i3 = 1;
        boolean z = false;
        while (i3 <= i && !z) {
            if (timeProvider.getDeviceElapsedTimeNanos() - deviceElapsedTimeNanos >= j) {
                try {
                    z = function0.invoke().booleanValue();
                    i2 = i3;
                } catch (java.lang.Exception e) {
                    i2 = i3;
                    com.datadog.android.api.InternalLogger.DefaultImpls.log$default(internalLogger, com.datadog.android.api.InternalLogger.Level.ERROR, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.datadog.android.api.InternalLogger.Target[]{com.datadog.android.api.InternalLogger.Target.MAINTAINER, com.datadog.android.api.InternalLogger.Target.TELEMETRY}), (kotlin.jvm.functions.Function0) com.datadog.android.core.internal.utils.MiscUtilsKt$retryWithDelay$1.INSTANCE, (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
                    z = false;
                }
                deviceElapsedTimeNanos = timeProvider.getDeviceElapsedTimeNanos();
                i3 = i2 + 1;
            }
        }
        return z;
    }

    public static final java.lang.Object fromJsonElement(java.lang.Object obj) {
        if (obj instanceof com.google.gson.JsonNull) {
            return null;
        }
        if (!(obj instanceof com.google.gson.JsonPrimitive)) {
            return obj instanceof com.google.gson.JsonObject ? asDeepMap((com.google.gson.JsonObject) obj) : obj;
        }
        com.google.gson.JsonPrimitive jsonPrimitive = (com.google.gson.JsonPrimitive) obj;
        if (jsonPrimitive.isBoolean()) {
            return java.lang.Boolean.valueOf(jsonPrimitive.getAsBoolean());
        }
        if (jsonPrimitive.isNumber()) {
            return jsonPrimitive.getAsNumber();
        }
        return jsonPrimitive.isString() ? jsonPrimitive.getAsString() : obj;
    }

    public static final com.google.gson.JsonElement toJsonArray(java.lang.Iterable<?> iterable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable, "");
        com.google.gson.JsonArray jsonArray = new com.google.gson.JsonArray();
        java.util.Iterator<?> it = iterable.iterator();
        while (it.hasNext()) {
            jsonArray.add(com.datadog.android.core.internal.utils.JsonSerializer.INSTANCE.toJsonElement(it.next()));
        }
        return jsonArray;
    }

    public static final com.google.gson.JsonElement toJsonObject(java.util.Map<?, ?> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
        for (java.util.Map.Entry<?, ?> entry : map.entrySet()) {
            jsonObject.add(java.lang.String.valueOf(entry.getKey()), com.datadog.android.core.internal.utils.JsonSerializer.INSTANCE.toJsonElement(entry.getValue()));
        }
        return jsonObject;
    }

    public static final com.google.gson.JsonElement toJsonObject(org.json.JSONObject jSONObject) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jSONObject, "");
        com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
        java.util.Iterator<java.lang.String> keys = jSONObject.keys();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(keys, "");
        while (keys.hasNext()) {
            java.lang.String next = keys.next();
            jsonObject.add(next, com.datadog.android.core.internal.utils.JsonSerializer.INSTANCE.toJsonElement(jSONObject.get(next)));
        }
        return jsonObject;
    }

    public static final com.google.gson.JsonElement toJsonArray(org.json.JSONArray jSONArray) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jSONArray, "");
        com.google.gson.JsonArray jsonArray = new com.google.gson.JsonArray();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            jsonArray.add(com.datadog.android.core.internal.utils.JsonSerializer.INSTANCE.toJsonElement(jSONArray.get(i)));
        }
        return jsonArray;
    }

    public static final java.util.Map<java.lang.String, java.lang.Object> asDeepMap(com.google.gson.JsonObject jsonObject) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Set<java.util.Map.Entry<java.lang.String, com.google.gson.JsonElement>> entrySet = jsonObject.entrySet();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(entrySet, "");
        java.util.Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            java.lang.Object key = entry.getKey();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "");
            linkedHashMap.put(key, fromJsonElement(entry.getValue()));
        }
        return linkedHashMap;
    }

    public static final boolean retryWithDelay(int i, long j, com.datadog.android.api.InternalLogger internalLogger, com.datadog.android.internal.time.TimeProvider timeProvider, kotlin.jvm.functions.Function0<java.lang.Boolean> function0) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        long deviceElapsedTimeNanos = timeProvider.getDeviceElapsedTimeNanos() - j;
        int i3 = 1;
        boolean z = false;
        while (i3 <= i && !z) {
            if (timeProvider.getDeviceElapsedTimeNanos() - deviceElapsedTimeNanos >= j) {
                try {
                    z = function0.invoke().booleanValue();
                    i2 = i3;
                } catch (java.lang.Exception e) {
                    i2 = i3;
                    com.datadog.android.api.InternalLogger.DefaultImpls.log$default(internalLogger, com.datadog.android.api.InternalLogger.Level.ERROR, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.datadog.android.api.InternalLogger.Target[]{com.datadog.android.api.InternalLogger.Target.MAINTAINER, com.datadog.android.api.InternalLogger.Target.TELEMETRY}), (kotlin.jvm.functions.Function0) com.datadog.android.core.internal.utils.MiscUtilsKt$retryWithDelay$1.INSTANCE, (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
                    z = false;
                }
                deviceElapsedTimeNanos = timeProvider.getDeviceElapsedTimeNanos();
                i3 = i2 + 1;
            }
        }
        return z;
    }
}
