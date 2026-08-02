package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.StrictMode;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class D7 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: g, reason: collision with root package name */
    public Context f8172g;

    /* renamed from: a, reason: collision with root package name */
    public final Object f8167a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final ConditionVariable f8168b = new ConditionVariable();

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f8169c = false;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f8170d = false;

    /* renamed from: e, reason: collision with root package name */
    public SharedPreferences f8171e = null;
    public Bundle f = new Bundle();

    /* renamed from: h, reason: collision with root package name */
    public JSONObject f8173h = new JSONObject();
    public boolean i = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean f8174j = false;

    public final Object a(A7 a7) {
        if (!this.f8168b.block(5000L)) {
            synchronized (this.f8167a) {
                try {
                    if (!this.f8170d) {
                        throw new IllegalStateException("Flags.initialize() was not called!");
                    }
                } finally {
                }
            }
        }
        if (!this.f8169c || this.f8171e == null || this.f8174j) {
            synchronized (this.f8167a) {
                if (this.f8169c && this.f8171e != null && !this.f8174j) {
                }
                return a7.f();
            }
        }
        int i = a7.f7534a;
        if (i != 2) {
            if (i == 1 && this.f8173h.has(a7.f7535b)) {
                return a7.a(this.f8173h);
            }
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                return a7.b(this.f8171e);
            } finally {
                StrictMode.setThreadPolicy(threadPolicy);
            }
        }
        Bundle bundle = this.f;
        if (bundle == null) {
            return a7.f();
        }
        switch (a7.f7538e) {
            case 0:
                String str = a7.f7535b;
                return bundle.containsKey("com.google.android.gms.ads.flag.".concat(str)) ? Boolean.valueOf(bundle.getBoolean("com.google.android.gms.ads.flag.".concat(str))) : (Boolean) a7.f();
            case 1:
                String str2 = a7.f7535b;
                return bundle.containsKey("com.google.android.gms.ads.flag.".concat(str2)) ? Integer.valueOf(bundle.getInt("com.google.android.gms.ads.flag.".concat(str2))) : (Integer) a7.f();
            case 2:
                String str3 = a7.f7535b;
                return bundle.containsKey("com.google.android.gms.ads.flag.".concat(str3)) ? Long.valueOf(bundle.getLong("com.google.android.gms.ads.flag.".concat(str3))) : (Long) a7.f();
            case 3:
                String str4 = a7.f7535b;
                return bundle.containsKey("com.google.android.gms.ads.flag.".concat(str4)) ? Float.valueOf(bundle.getFloat("com.google.android.gms.ads.flag.".concat(str4))) : (Float) a7.f();
            default:
                String str5 = a7.f7535b;
                return bundle.containsKey("com.google.android.gms.ads.flag.".concat(str5)) ? bundle.getString("com.google.android.gms.ads.flag.".concat(str5)) : (String) a7.f();
        }
    }

    public final Object b(A7 a7) {
        return (this.f8169c || this.f8170d) ? a(a7) : a7.f();
    }

    public final void c(SharedPreferences sharedPreferences) {
        if (sharedPreferences == null) {
            return;
        }
        try {
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                String string = sharedPreferences.getString("flag_configuration", "{}");
                StrictMode.setThreadPolicy(threadPolicy);
                this.f8173h = new JSONObject(string);
            } catch (Throwable th) {
                StrictMode.setThreadPolicy(threadPolicy);
                throw th;
            }
        } catch (JSONException unused) {
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            c(sharedPreferences);
        }
    }
}
