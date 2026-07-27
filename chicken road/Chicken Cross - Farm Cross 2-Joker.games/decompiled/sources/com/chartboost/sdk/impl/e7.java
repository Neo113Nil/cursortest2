package com.chartboost.sdk.impl;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.LocaleList;
import com.ironsource.U3;
import com.unity3d.services.core.properties.MadeWithUnityDetector;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class e7 {
    public static boolean b;
    public static Application c;
    public static q6 d;

    /* renamed from: a, reason: collision with root package name */
    public static final e7 f4748a = new e7();
    public static String e = "not available";
    public static String f = "not available";
    public static String g = "not available";
    public static String h = "not available";
    public static String i = "not available";
    public static String j = "not available";
    public static String k = "not available";
    public static String l = "not available";
    public static String m = "native";
    public static String n = "unknown";

    public final void a(Application app, q6 dm) {
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(dm, "dm");
        if (b) {
            return;
        }
        c = app;
        d = dm;
        try {
            e = Build.MANUFACTURER;
            f = Build.MODEL;
            g = "Android " + Build.VERSION.RELEASE;
            h = o() ? "Amazon" : U3.d;
            m = a(this, null, 1, null);
            String country = Locale.getDefault().getCountry();
            if (country == null) {
                country = "Cannot retrieve country";
            }
            i = country;
            String n2 = n();
            if (n2 == null) {
                n2 = "Cannot retrieve language";
            }
            j = n2;
            l = l3.a();
            String a2 = a(app);
            if (a2 == null) {
                a2 = "Unknown version";
            }
            k = a2;
        } catch (Exception e2) {
            mb.b("Failed to initialize EnvironmentManager", e2);
        }
        b = true;
    }

    public final String b() {
        a();
        return m;
    }

    public final String c() {
        a();
        return k;
    }

    public final Application d() {
        return c;
    }

    public final String e() {
        a();
        return i;
    }

    public final String f() {
        a();
        return n;
    }

    public final String g() {
        a();
        return j;
    }

    public final String h() {
        a();
        return e;
    }

    public final String i() {
        a();
        return f;
    }

    public final String j() {
        a();
        return g;
    }

    public final String k() {
        a();
        return h;
    }

    public final String l() {
        a();
        return l;
    }

    public final q6 m() {
        a();
        return d;
    }

    public final boolean o() {
        return StringsKt.equals("Amazon", Build.MANUFACTURER, true);
    }

    public final boolean p() {
        return b;
    }

    public final String n() {
        try {
            return LocaleList.getDefault().get(0).getLanguage();
        } catch (Exception e2) {
            mb.a("Cannot retrieve language", e2);
            return null;
        }
    }

    public final void a() {
        if (b) {
            return;
        }
        mb.b("EnvironmentManager not initialized. Call init() first.", (Throwable) null, 2, (Object) null);
    }

    public static /* synthetic */ String a(e7 e7Var, ClassLoader classLoader, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            classLoader = e7Var.getClass().getClassLoader();
        }
        return e7Var.a(classLoader);
    }

    public final String a(ClassLoader classLoader) {
        try {
            Class.forName(MadeWithUnityDetector.UNITY_PLAYER_CLASS_NAME, false, classLoader);
            return "unity";
        } catch (ClassNotFoundException unused) {
            return "native";
        } catch (Throwable th) {
            mb.b("Failed to detect app engine", th);
            return "unknown";
        }
    }

    public final String a(Context context) {
        PackageInfo packageInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            String packageName = context.getPackageName();
            if (packageManager != null && packageName != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    packageInfo = packageManager.getPackageInfo(packageName, PackageManager.PackageInfoFlags.of(0L));
                } else {
                    packageInfo = packageManager.getPackageInfo(packageName, 0);
                }
                if (packageInfo != null) {
                    return packageInfo.versionName;
                }
            }
            return null;
        } catch (Exception e2) {
            mb.b("Exception while retrieving appVersion: " + e2.getMessage(), (Throwable) null, 2, (Object) null);
            return null;
        }
    }
}
