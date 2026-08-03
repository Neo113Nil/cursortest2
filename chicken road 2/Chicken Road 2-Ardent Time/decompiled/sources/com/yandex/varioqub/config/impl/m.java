package com.yandex.varioqub.config.impl;

/* loaded from: classes.dex */
public abstract class m {
    public static android.content.SharedPreferences a() {
        android.content.Context context = com.yandex.varioqub.config.impl.AbstractC0105d.f2679a;
        if (context == null) {
            kotlin.jvm.internal.i.i("appContext");
            throw null;
        }
        return context.getSharedPreferences(context.getPackageName() + "_varioqub_pref", 0);
    }

    public static void b(java.util.HashMap hashMap) {
        android.content.SharedPreferences.Editor edit = a().edit();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            com.yandex.varioqub.config.model.ConfigValue configValue = (com.yandex.varioqub.config.model.ConfigValue) entry.getValue();
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("value", configValue.asString());
            jSONObject2.put("sourceType", configValue.getSourceType());
            jSONObject2.put("testId", configValue.getTestId());
            jSONObject.put(str, jSONObject2.toString());
        }
        edit.putString("fetched_config_key", jSONObject.toString()).apply();
    }

    public static void c(java.lang.String str) {
        a().edit().putString("identifier", str).apply();
    }

    public static void a(long j2) {
        a().edit().putLong("last_fetched_time_ms_key", j2).apply();
    }

    public static void a(java.util.HashMap hashMap) {
        android.content.SharedPreferences.Editor edit = a().edit();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            com.yandex.varioqub.config.model.ConfigValue configValue = (com.yandex.varioqub.config.model.ConfigValue) entry.getValue();
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("value", configValue.asString());
            jSONObject2.put("sourceType", configValue.getSourceType());
            jSONObject2.put("testId", configValue.getTestId());
            jSONObject.put(str, jSONObject2.toString());
        }
        edit.putString("activated_config_key", jSONObject.toString()).apply();
    }

    public static void b(java.lang.String str) {
        a().edit().putString("etag", str).apply();
    }

    public static java.util.LinkedHashSet b() {
        java.util.Set<java.lang.String> stringSet = a().getStringSet("varioqub_testids", new java.util.LinkedHashSet());
        if (stringSet == null) {
            stringSet = i1.C0201t.f3327a;
        }
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        java.util.Iterator<T> it = stringSet.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(java.lang.Long.valueOf(java.lang.Long.parseLong((java.lang.String) it.next())));
        }
        return linkedHashSet;
    }

    public static void a(boolean z2) {
        a().edit().putBoolean("should_notify_adapter", z2).apply();
    }

    public static void a(java.util.Set set) {
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(java.lang.String.valueOf(((java.lang.Number) it.next()).longValue()));
        }
        a().edit().putStringSet("varioqub_testids", linkedHashSet).apply();
    }

    public static void b(long j2) {
        a().edit().putLong("last_successful_fetched_time_ms_key", j2).apply();
    }

    public static void a(java.lang.String str) {
        a().edit().putString("config_version", str).apply();
    }
}
