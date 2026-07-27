package com.applovin.impl;

import android.content.Context;
import android.content.SharedPreferences;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class d5 {

    /* renamed from: a, reason: collision with root package name */
    protected final com.applovin.impl.sdk.l f4177a;
    protected final Context b;
    protected final SharedPreferences c;
    private final Map d = new HashMap();
    private final Object e = new Object();

    public d5(com.applovin.impl.sdk.l lVar) {
        this.f4177a = lVar;
        Context p = com.applovin.impl.sdk.l.p();
        this.b = p;
        this.c = p.getSharedPreferences("com.applovin.sdk.1", 0);
        try {
            Class.forName(c5.class.getName());
            Class.forName(v3.class.getName());
        } catch (Throwable unused) {
        }
        d();
    }

    private void d() {
        String b = ((Boolean) f5.a(e5.j, Boolean.FALSE, com.applovin.impl.sdk.l.p())).booleanValue() ? "" : b();
        synchronized (this.e) {
            for (c5 c5Var : c5.c()) {
                try {
                    Object a2 = this.f4177a.a(b + c5Var.b(), null, c5Var.a().getClass(), this.c);
                    if (a2 != null) {
                        this.d.put(c5Var.b(), a2);
                    }
                } catch (Throwable th) {
                    com.applovin.impl.sdk.p.c("SettingsManager", "Unable to load \"" + c5Var.b() + "\"", th);
                    this.f4177a.E().a("SettingsManager", "initSettings", th);
                }
            }
        }
    }

    public Object a(c5 c5Var) {
        if (c5Var == null) {
            throw new IllegalArgumentException("No setting type specified");
        }
        synchronized (this.e) {
            Object obj = this.d.get(c5Var.b());
            if (obj == null) {
                return c5Var.a();
            }
            return c5Var.a(obj);
        }
    }

    public List b(c5 c5Var) {
        ArrayList arrayList = new ArrayList(6);
        Iterator it = c(c5Var).iterator();
        while (it.hasNext()) {
            arrayList.add(MaxAdFormat.formatFromString((String) it.next()));
        }
        return arrayList;
    }

    public List c(c5 c5Var) {
        return CollectionUtils.explode((String) a(c5Var));
    }

    public void e() {
        Boolean bool = (Boolean) f5.a(e5.j, Boolean.FALSE, com.applovin.impl.sdk.l.p());
        String b = b();
        synchronized (this.e) {
            SharedPreferences.Editor edit = this.c.edit();
            for (c5 c5Var : c5.c()) {
                Object obj = this.d.get(c5Var.b());
                if (obj != null) {
                    String b2 = c5Var.b();
                    this.f4177a.a(b + c5Var.b(), obj, edit);
                    if (bool.booleanValue()) {
                        this.f4177a.a(b2, obj, edit);
                    }
                }
            }
            if (((Boolean) this.f4177a.a(c5.M6)).booleanValue()) {
                f5.a(edit);
            } else {
                edit.apply();
            }
        }
    }

    public boolean c() {
        return this.f4177a.p0().isVerboseLoggingEnabled() || ((Boolean) a(c5.k)).booleanValue();
    }

    private String b() {
        return "com.applovin.sdk." + t7.f(this.f4177a.k0()) + ".";
    }

    public void a(c5 c5Var, Object obj) {
        if (c5Var == null) {
            throw new IllegalArgumentException("No setting type specified");
        }
        if (obj != null) {
            synchronized (this.e) {
                this.d.put(c5Var.b(), obj);
            }
            return;
        }
        throw new IllegalArgumentException("No new value specified");
    }

    public void a(JSONObject jSONObject) {
        synchronized (this.e) {
            boolean booleanValue = JsonUtils.getBoolean(jSONObject, c5.u.b(), Boolean.FALSE).booleanValue();
            HashMap hashMap = booleanValue ? new HashMap() : null;
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (next != null && next.length() > 0) {
                    try {
                        c5 a2 = c5.a(next);
                        if (a2 != null) {
                            Object a3 = booleanValue ? a(a2) : null;
                            Object a4 = a(next, jSONObject, a2.a());
                            this.d.put(a2.b(), a4);
                            if (a2 == c5.R5) {
                                this.d.put(c5.S5.b(), Long.valueOf(System.currentTimeMillis()));
                            }
                            if (booleanValue && !a4.equals(a3)) {
                                hashMap.put(a2, a3);
                            }
                        }
                    } catch (JSONException e) {
                        com.applovin.impl.sdk.p.c("SettingsManager", "Unable to parse JSON settingsValues array", e);
                        this.f4177a.E().a("SettingsManager", "loadSettingsException", e);
                    } catch (Throwable th) {
                        com.applovin.impl.sdk.p.c("SettingsManager", "Unable to convert setting object ", th);
                        this.f4177a.E().a("SettingsManager", "loadSettingsThrowable", th);
                    }
                }
            }
            if (booleanValue && hashMap.size() > 0) {
                z2 z2Var = new z2();
                z2Var.a("========== UPDATED SETTINGS ==========");
                for (c5 c5Var : hashMap.keySet()) {
                    z2Var.a(c5Var.b(), a(c5Var) + " (" + hashMap.get(c5Var) + ")");
                }
                z2Var.a("========== END ==========");
                this.f4177a.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    this.f4177a.Q().a("SettingsManager", z2Var.toString());
                }
            }
            f5.b(e5.j, (Boolean) a(c5.Z6), com.applovin.impl.sdk.l.p());
        }
    }

    public void a() {
        synchronized (this.e) {
            this.d.clear();
        }
        this.f4177a.a(this.c);
    }

    private static Object a(String str, JSONObject jSONObject, Object obj) {
        if (obj instanceof Boolean) {
            return Boolean.valueOf(jSONObject.getBoolean(str));
        }
        if (obj instanceof Float) {
            return Float.valueOf((float) jSONObject.getDouble(str));
        }
        if (obj instanceof Double) {
            return Double.valueOf(jSONObject.getDouble(str));
        }
        if (obj instanceof Integer) {
            return Integer.valueOf(jSONObject.getInt(str));
        }
        if (obj instanceof Long) {
            return Long.valueOf(jSONObject.getLong(str));
        }
        if (obj instanceof String) {
            return jSONObject.getString(str);
        }
        throw new RuntimeException("SDK Error: unknown value type: " + obj.getClass());
    }
}
