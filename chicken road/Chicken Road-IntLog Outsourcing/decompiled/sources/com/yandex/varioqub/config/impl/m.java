package com.yandex.varioqub.config.impl;

import android.content.Context;
import android.content.SharedPreferences;
import com.yandex.varioqub.config.model.ConfigValue;
import g4.C0473r;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class m {
    public static SharedPreferences a() {
        Context context = AbstractC0394d.f5413a;
        if (context == null) {
            kotlin.jvm.internal.i.l("appContext");
            throw null;
        }
        return context.getSharedPreferences(context.getPackageName() + "_varioqub_pref", 0);
    }

    public static void b(HashMap hashMap) {
        SharedPreferences.Editor edit = a().edit();
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            ConfigValue configValue = (ConfigValue) entry.getValue();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("value", configValue.asString());
            jSONObject2.put("sourceType", configValue.getSourceType());
            jSONObject2.put("testId", configValue.getTestId());
            jSONObject.put(str, jSONObject2.toString());
        }
        edit.putString("fetched_config_key", jSONObject.toString()).apply();
    }

    public static void c(String str) {
        a().edit().putString("identifier", str).apply();
    }

    public static void a(long j2) {
        a().edit().putLong("last_fetched_time_ms_key", j2).apply();
    }

    public static void a(HashMap hashMap) {
        SharedPreferences.Editor edit = a().edit();
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            ConfigValue configValue = (ConfigValue) entry.getValue();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("value", configValue.asString());
            jSONObject2.put("sourceType", configValue.getSourceType());
            jSONObject2.put("testId", configValue.getTestId());
            jSONObject.put(str, jSONObject2.toString());
        }
        edit.putString("activated_config_key", jSONObject.toString()).apply();
    }

    public static void b(String str) {
        a().edit().putString("etag", str).apply();
    }

    public static LinkedHashSet b() {
        Set<String> stringSet = a().getStringSet("varioqub_testids", new LinkedHashSet());
        if (stringSet == null) {
            stringSet = C0473r.f5752a;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = stringSet.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(Long.valueOf(Long.parseLong((String) it.next())));
        }
        return linkedHashSet;
    }

    public static void a(boolean z) {
        a().edit().putBoolean("should_notify_adapter", z).apply();
    }

    public static void a(Set set) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(String.valueOf(((Number) it.next()).longValue()));
        }
        a().edit().putStringSet("varioqub_testids", linkedHashSet).apply();
    }

    public static void b(long j2) {
        a().edit().putLong("last_successful_fetched_time_ms_key", j2).apply();
    }

    public static void a(String str) {
        a().edit().putString("config_version", str).apply();
    }
}
