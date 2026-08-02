package com.datadog.trace.core.util;

/* loaded from: classes3.dex */
public class MapUtils {
    public static <V, K> V computeIfAbsent(K k, java.util.Map<K, V> map, com.datadog.android.trace.internal.compat.function.Function<? super K, ? extends V> function) {
        V apply;
        java.util.Objects.requireNonNull(function);
        V v = map.get(k);
        if (v != null || (apply = function.apply(k)) == null) {
            return v;
        }
        map.put(k, apply);
        return apply;
    }

    public static com.google.gson.JsonObject getAsJsonObject(java.util.Map<java.lang.String, java.lang.String> map) {
        com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
            jsonObject.addProperty(entry.getKey(), entry.getValue());
        }
        return jsonObject;
    }
}
