package com.mbridge.msdk.config.component.common.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: ComponentSharedPreferencesManager.java */
/* loaded from: classes6.dex */
public class b {
    private static b c;

    /* renamed from: a, reason: collision with root package name */
    private SharedPreferences f8970a;
    private final Map<String, Object> b = new ConcurrentHashMap();

    private b(Context context, String str) {
        if (context == null) {
            throw new IllegalArgumentException("Context cannot be null");
        }
        this.f8970a = context.getSharedPreferences(TextUtils.isEmpty(str) ? "mbridge_component_sp" : str, 0);
    }

    public static b a(Context context) {
        if (c == null) {
            synchronized (b.class) {
                if (c == null) {
                    c = new b(context, "mbridge_component_sp");
                }
            }
        }
        return c;
    }

    public void b(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        SharedPreferences.Editor edit = this.f8970a.edit();
        edit.putString(str, str2);
        edit.apply();
        a(str, (Object) str2);
    }

    public void b(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        SharedPreferences.Editor edit = this.f8970a.edit();
        edit.putInt(str, i);
        edit.apply();
        a(str, Integer.valueOf(i));
    }

    public String a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        Object a2 = a(str);
        if (a2 instanceof String) {
            return (String) a2;
        }
        String string = this.f8970a.getString(str, str2);
        a(str, (Object) string);
        return string;
    }

    public int a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        Object a2 = a(str);
        if (a2 instanceof Integer) {
            return ((Integer) a2).intValue();
        }
        int i2 = this.f8970a.getInt(str, i);
        a(str, Integer.valueOf(i2));
        return i2;
    }

    public long a(String str, long j) {
        if (TextUtils.isEmpty(str)) {
            return j;
        }
        Object a2 = a(str);
        if (a2 instanceof Long) {
            return ((Long) a2).longValue();
        }
        long j2 = this.f8970a.getLong(str, j);
        a(str, Long.valueOf(j2));
        return j2;
    }

    public float a(String str, float f) {
        if (TextUtils.isEmpty(str)) {
            return f;
        }
        Object a2 = a(str);
        if (a2 instanceof Float) {
            return ((Float) a2).floatValue();
        }
        float f2 = this.f8970a.getFloat(str, f);
        a(str, Float.valueOf(f2));
        return f2;
    }

    public boolean a(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return z;
        }
        Object a2 = a(str);
        if (a2 instanceof Boolean) {
            return ((Boolean) a2).booleanValue();
        }
        boolean z2 = this.f8970a.getBoolean(str, z);
        a(str, Boolean.valueOf(z2));
        return z2;
    }

    private Object a(String str) {
        return this.b.get(str);
    }

    private void a(String str, Object obj) {
        if (TextUtils.isEmpty(str) || obj == null) {
            return;
        }
        this.b.put(str, obj);
    }
}
