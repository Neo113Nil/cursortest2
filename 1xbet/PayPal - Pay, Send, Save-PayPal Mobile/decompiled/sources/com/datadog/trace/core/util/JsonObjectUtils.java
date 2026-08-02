package com.datadog.trace.core.util;

/* loaded from: classes3.dex */
public class JsonObjectUtils {
    public static java.lang.String getAsString(com.google.gson.JsonObject jsonObject, java.lang.String str) {
        com.google.gson.JsonElement jsonElement = jsonObject.get(str);
        if (jsonElement == null || !jsonElement.isJsonPrimitive()) {
            return null;
        }
        return jsonElement.getAsJsonPrimitive().getAsString();
    }

    public static java.util.Map<java.lang.String, java.lang.String> safeGetAsMap(com.google.gson.JsonObject jsonObject, java.lang.String str) {
        com.google.gson.JsonElement jsonElement = jsonObject.get(str);
        if (jsonElement == null || !jsonElement.isJsonObject()) {
            return null;
        }
        com.google.gson.JsonObject asJsonObject = jsonElement.getAsJsonObject();
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.util.Map.Entry<java.lang.String, com.google.gson.JsonElement> entry : asJsonObject.entrySet()) {
            com.google.gson.JsonElement value = entry.getValue();
            if (value.isJsonPrimitive()) {
                hashMap.put(entry.getKey(), value.getAsJsonPrimitive().getAsString());
            }
        }
        return hashMap;
    }
}
