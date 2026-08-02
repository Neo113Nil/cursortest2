package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.facebook.S;
import com.facebook.internal.C0705a;
import com.facebook.z;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class S {
    public static final S a = new S();
    public static final AtomicBoolean b = new AtomicBoolean(false);
    public static final AtomicBoolean c = new AtomicBoolean(false);
    public static final a d = new a(true, "com.facebook.sdk.AutoInitEnabled");
    public static final a e = new a(true, "com.facebook.sdk.AutoLogAppEventsEnabled");
    public static final a f = new a(true, "com.facebook.sdk.AdvertiserIDCollectionEnabled");
    public static final a g = new a(false, "auto_event_setup_enabled");
    public static final a h = new a(true, "com.facebook.sdk.MonitorEnabled");
    public static SharedPreferences i;

    public static final class a {
        public final boolean a;
        public final String b;
        public Boolean c;
        public long d;

        public a(boolean z, String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.a = z;
            this.b = key;
        }

        public final boolean a() {
            Boolean bool = this.c;
            return bool != null ? bool.booleanValue() : this.a;
        }
    }

    @JvmStatic
    public static final boolean b() {
        if (com.facebook.internal.instrument.crashshield.a.b(S.class)) {
            return false;
        }
        try {
            a.e();
            return f.a();
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, S.class);
            return false;
        }
    }

    @JvmStatic
    public static final boolean c() {
        if (com.facebook.internal.instrument.crashshield.a.b(S.class)) {
            return false;
        }
        try {
            S s = a;
            s.e();
            return s.a();
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, S.class);
            return false;
        }
    }

    @JvmStatic
    public static final Boolean i() {
        String str = "";
        if (com.facebook.internal.instrument.crashshield.a.b(S.class)) {
            return null;
        }
        try {
            a.k();
            try {
                SharedPreferences sharedPreferences = i;
                if (sharedPreferences == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("userSettingPref");
                    sharedPreferences = null;
                }
                String string = sharedPreferences.getString(e.b, "");
                if (string != null) {
                    str = string;
                }
                if (str.length() > 0) {
                    return Boolean.valueOf(new JSONObject(str).getBoolean("value"));
                }
            } catch (JSONException unused) {
                com.facebook.internal.E e2 = com.facebook.internal.E.a;
                w wVar = w.a;
            }
            return null;
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, S.class);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0042, code lost:
    
        if (r2 != null) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a() {
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return false;
        }
        try {
            HashMap c2 = com.facebook.internal.p.c();
            if (c2 != null && !c2.isEmpty()) {
                Boolean bool = (Boolean) c2.get("auto_log_app_events_enabled");
                Boolean bool2 = (Boolean) c2.get("auto_log_app_events_default");
                if (bool != null) {
                    return bool.booleanValue();
                }
                Boolean bool3 = null;
                if (!com.facebook.internal.instrument.crashshield.a.b(this)) {
                    try {
                        Boolean i2 = i();
                        if (i2 == null) {
                            i2 = f();
                        }
                        bool3 = i2;
                    } catch (Throwable th) {
                        com.facebook.internal.instrument.crashshield.a.a(th, this);
                    }
                }
                if (bool3 != null) {
                    return bool3.booleanValue();
                }
                if (bool2 != null) {
                    return bool2.booleanValue();
                }
                return true;
            }
            return e.a();
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.a.a(th2, this);
            return false;
        }
    }

    public final void d() {
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return;
        }
        try {
            a aVar = g;
            j(aVar);
            final long currentTimeMillis = System.currentTimeMillis();
            if (aVar.c == null || currentTimeMillis - aVar.d >= 604800000) {
                aVar.c = null;
                aVar.d = 0L;
                if (c.compareAndSet(false, true)) {
                    w.c().execute(new Runnable() { // from class: com.facebook.Q
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.facebook.internal.n k;
                            long j = currentTimeMillis;
                            if (com.facebook.internal.instrument.crashshield.a.b(S.class)) {
                                return;
                            }
                            try {
                                if (S.f.a() && (k = com.facebook.internal.p.k(w.b(), false)) != null && k.g) {
                                    Context a2 = w.a();
                                    C0705a.Companion.getClass();
                                    C0705a a3 = C0705a.C0089a.a(a2);
                                    String a4 = (a3 == null || a3.a() == null) ? null : a3.a();
                                    if (a4 != null) {
                                        Bundle bundle = new Bundle();
                                        bundle.putString("advertiser_id", a4);
                                        bundle.putString("fields", "auto_event_setup_enabled");
                                        z.Companion.getClass();
                                        z g2 = z.c.g(null, "app", null);
                                        Intrinsics.checkNotNullParameter(bundle, "<set-?>");
                                        g2.d = bundle;
                                        JSONObject jSONObject = g2.c().b;
                                        if (jSONObject != null) {
                                            S.a aVar2 = S.g;
                                            aVar2.c = Boolean.valueOf(jSONObject.optBoolean("auto_event_setup_enabled", false));
                                            aVar2.d = j;
                                            S.a.l(aVar2);
                                        }
                                    }
                                }
                                S.c.set(false);
                            } catch (Throwable th) {
                                com.facebook.internal.instrument.crashshield.a.a(th, S.class);
                            }
                        }
                    });
                }
            }
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, this);
        }
    }

    public final void e() {
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return;
        }
        try {
            if (w.q.get()) {
                if (b.compareAndSet(false, true)) {
                    SharedPreferences sharedPreferences = w.a().getSharedPreferences("com.facebook.sdk.USER_SETTINGS", 0);
                    Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getApplicationContext()\n…GS, Context.MODE_PRIVATE)");
                    i = sharedPreferences;
                    a[] aVarArr = {e, f, d};
                    if (!com.facebook.internal.instrument.crashshield.a.b(this)) {
                        for (int i2 = 0; i2 < 3; i2++) {
                            try {
                                a aVar = aVarArr[i2];
                                if (aVar == g) {
                                    d();
                                } else if (aVar.c == null) {
                                    j(aVar);
                                    if (aVar.c == null) {
                                        g(aVar);
                                    }
                                } else {
                                    l(aVar);
                                }
                            } catch (Throwable th) {
                                com.facebook.internal.instrument.crashshield.a.a(th, this);
                            }
                        }
                    }
                    d();
                    if (!com.facebook.internal.instrument.crashshield.a.b(this)) {
                        try {
                            Context a2 = w.a();
                            ApplicationInfo applicationInfo = a2.getPackageManager().getApplicationInfo(a2.getPackageName(), 128);
                            Intrinsics.checkNotNullExpressionValue(applicationInfo, "ctx.packageManager.getAp…ageManager.GET_META_DATA)");
                            Bundle bundle = applicationInfo.metaData;
                            if (bundle != null) {
                                bundle.containsKey("com.facebook.sdk.AdvertiserIDCollectionEnabled");
                                b();
                            }
                        } catch (PackageManager.NameNotFoundException unused) {
                        } catch (Throwable th2) {
                            com.facebook.internal.instrument.crashshield.a.a(th2, this);
                        }
                    }
                    h();
                }
            }
        } catch (Throwable th3) {
            com.facebook.internal.instrument.crashshield.a.a(th3, this);
        }
    }

    public final Boolean f() {
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return null;
        }
        try {
            k();
            try {
                Context a2 = w.a();
                ApplicationInfo applicationInfo = a2.getPackageManager().getApplicationInfo(a2.getPackageName(), 128);
                Intrinsics.checkNotNullExpressionValue(applicationInfo, "ctx.packageManager.getAp…ageManager.GET_META_DATA)");
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    a aVar = e;
                    if (bundle.containsKey(aVar.b)) {
                        return Boolean.valueOf(applicationInfo.metaData.getBoolean(aVar.b));
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
                com.facebook.internal.E e2 = com.facebook.internal.E.a;
                w wVar = w.a;
            }
            return null;
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, this);
            return null;
        }
    }

    public final void g(a aVar) {
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return;
        }
        try {
            k();
            try {
                Context a2 = w.a();
                ApplicationInfo applicationInfo = a2.getPackageManager().getApplicationInfo(a2.getPackageName(), 128);
                Intrinsics.checkNotNullExpressionValue(applicationInfo, "ctx.packageManager.getAp…ageManager.GET_META_DATA)");
                Bundle bundle = applicationInfo.metaData;
                if (bundle == null || !bundle.containsKey(aVar.b)) {
                    return;
                }
                aVar.c = Boolean.valueOf(applicationInfo.metaData.getBoolean(aVar.b, aVar.a));
            } catch (PackageManager.NameNotFoundException unused) {
                com.facebook.internal.E e2 = com.facebook.internal.E.a;
                w wVar = w.a;
            }
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h() {
        int i2;
        int i3;
        Bundle parameters;
        ApplicationInfo applicationInfo;
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return;
        }
        try {
            if (b.get() && w.q.get()) {
                Context a2 = w.a();
                int i4 = (d.a() ? 1 : 0) | ((e.a() ? 1 : 0) << 1) | ((f.a() ? 1 : 0) << 2) | ((h.a() ? 1 : 0) << 3);
                SharedPreferences sharedPreferences = i;
                if (sharedPreferences == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("userSettingPref");
                    sharedPreferences = null;
                }
                int i5 = sharedPreferences.getInt("com.facebook.sdk.USER_SETTINGS_BITMASK", 0);
                if (i5 != i4) {
                    SharedPreferences sharedPreferences2 = i;
                    if (sharedPreferences2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("userSettingPref");
                        sharedPreferences2 = null;
                    }
                    sharedPreferences2.edit().putInt("com.facebook.sdk.USER_SETTINGS_BITMASK", i4).apply();
                    try {
                        applicationInfo = a2.getPackageManager().getApplicationInfo(a2.getPackageName(), 128);
                        Intrinsics.checkNotNullExpressionValue(applicationInfo, "ctx.packageManager.getAp…ageManager.GET_META_DATA)");
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                    if (applicationInfo.metaData != null) {
                        String[] strArr = {"com.facebook.sdk.AutoInitEnabled", "com.facebook.sdk.AutoLogAppEventsEnabled", "com.facebook.sdk.AdvertiserIDCollectionEnabled", "com.facebook.sdk.MonitorEnabled"};
                        boolean[] zArr = {true, true, true, true};
                        i2 = 0;
                        i3 = 0;
                        for (int i6 = 0; i6 < 4; i6++) {
                            try {
                                i3 |= (applicationInfo.metaData.containsKey(strArr[i6]) ? 1 : 0) << i6;
                                i2 |= (applicationInfo.metaData.getBoolean(strArr[i6], zArr[i6]) ? 1 : 0) << i6;
                            } catch (PackageManager.NameNotFoundException unused2) {
                            }
                        }
                        com.facebook.appevents.p loggerImpl = new com.facebook.appevents.p(a2, (String) null);
                        Intrinsics.checkNotNullParameter(loggerImpl, "loggerImpl");
                        parameters = new Bundle();
                        parameters.putInt("usage", i3);
                        parameters.putInt("initial", i2);
                        parameters.putInt("previous", i5);
                        parameters.putInt("current", i4);
                        Intrinsics.checkNotNullParameter(parameters, "parameters");
                        if (!((parameters.getInt("previous") & 2) == 0) || c()) {
                            loggerImpl.h(parameters, "fb_sdk_settings_changed");
                        }
                        return;
                    }
                    i2 = 0;
                    i3 = 0;
                    com.facebook.appevents.p loggerImpl2 = new com.facebook.appevents.p(a2, (String) null);
                    Intrinsics.checkNotNullParameter(loggerImpl2, "loggerImpl");
                    parameters = new Bundle();
                    parameters.putInt("usage", i3);
                    parameters.putInt("initial", i2);
                    parameters.putInt("previous", i5);
                    parameters.putInt("current", i4);
                    Intrinsics.checkNotNullParameter(parameters, "parameters");
                    if ((parameters.getInt("previous") & 2) == 0) {
                    }
                    loggerImpl2.h(parameters, "fb_sdk_settings_changed");
                }
            }
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, this);
        }
    }

    public final void j(a aVar) {
        String str = "";
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return;
        }
        try {
            k();
            try {
                SharedPreferences sharedPreferences = i;
                if (sharedPreferences == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("userSettingPref");
                    sharedPreferences = null;
                }
                String string = sharedPreferences.getString(aVar.b, "");
                if (string != null) {
                    str = string;
                }
                if (str.length() > 0) {
                    JSONObject jSONObject = new JSONObject(str);
                    aVar.c = Boolean.valueOf(jSONObject.getBoolean("value"));
                    aVar.d = jSONObject.getLong("last_timestamp");
                }
            } catch (JSONException unused) {
                com.facebook.internal.E e2 = com.facebook.internal.E.a;
                w wVar = w.a;
            }
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, this);
        }
    }

    public final void k() {
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return;
        }
        try {
            if (b.get()) {
            } else {
                throw new x("The UserSettingManager has not been initialized successfully");
            }
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, this);
        }
    }

    public final void l(a aVar) {
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return;
        }
        try {
            k();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("value", aVar.c);
                jSONObject.put("last_timestamp", aVar.d);
                SharedPreferences sharedPreferences = i;
                if (sharedPreferences == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("userSettingPref");
                    sharedPreferences = null;
                }
                sharedPreferences.edit().putString(aVar.b, jSONObject.toString()).apply();
                h();
            } catch (Exception unused) {
                com.facebook.internal.E e2 = com.facebook.internal.E.a;
                w wVar = w.a;
            }
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, this);
        }
    }
}
