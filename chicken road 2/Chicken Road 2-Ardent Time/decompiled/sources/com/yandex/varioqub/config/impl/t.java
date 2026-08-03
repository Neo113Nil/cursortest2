package com.yandex.varioqub.config.impl;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public java.util.Map f2726a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public java.util.Map f2727b = i1.C0200s.f3326a;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f2728c = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [i1.s] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.HashMap] */
    public final void a() {
        ?? r02;
        com.yandex.varioqub.config.model.ConfigValue configValue;
        if (this.f2728c.compareAndSet(false, true)) {
            android.content.Context context = com.yandex.varioqub.config.impl.AbstractC0105d.f2679a;
            if (context == null) {
                kotlin.jvm.internal.i.i("appContext");
                throw null;
            }
            java.lang.String string = context.getSharedPreferences(context.getPackageName() + "_varioqub_pref", 0).getString("activated_config_key", "");
            if (string == null || string.length() == 0) {
                r02 = i1.C0200s.f3326a;
            } else {
                org.json.JSONObject jSONObject = new org.json.JSONObject(string);
                r02 = new java.util.HashMap();
                java.util.Iterator<java.lang.String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    java.lang.String string2 = jSONObject.getString(next);
                    if (string2 == null || string2.length() == 0) {
                        configValue = null;
                    } else {
                        org.json.JSONObject jSONObject2 = new org.json.JSONObject(string2);
                        configValue = new com.yandex.varioqub.config.model.ConfigValue(jSONObject2.getString("value"), jSONObject2.getInt("sourceType"), jSONObject2.getLong("testId"));
                    }
                    if (configValue == null) {
                        throw new java.lang.NullPointerException("null cannot be cast to non-null type com.yandex.varioqub.config.model.ConfigValue");
                    }
                    r02.put(next, configValue);
                }
            }
            this.f2727b = r02;
        }
    }
}
