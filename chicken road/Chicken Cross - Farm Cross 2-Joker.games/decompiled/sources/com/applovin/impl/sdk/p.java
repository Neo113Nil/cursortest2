package com.applovin.impl.sdk;

import android.text.TextUtils;
import android.util.Log;
import com.applovin.impl.c5;
import com.applovin.impl.z2;
import com.ironsource.U3;

/* loaded from: classes5.dex */
public class p {
    private static boolean b;

    /* renamed from: a, reason: collision with root package name */
    private final l f4501a;

    p(l lVar) {
        this.f4501a = lVar;
        a("SDK Session Begin");
    }

    public static void a(boolean z) {
        b = z;
    }

    public static void c(String str, String str2, Throwable th) {
        if (!b || a()) {
            Log.e("AppLovinSdk", U3.j.d + str + "] " + str2, th);
        }
    }

    public static void e(String str, String str2) {
        g(str, str2);
    }

    public static void g(String str, String str2) {
        if (!b || a()) {
            Log.d("AppLovinSdk", U3.j.d + str + "] " + str2);
        }
    }

    public static void h(String str, String str2) {
        c(str, str2, null);
    }

    public static void i(String str, String str2) {
        if (!b || a()) {
            Log.i("AppLovinSdk", U3.j.d + str + "] " + str2);
        }
    }

    public static void j(String str, String str2) {
        if (!b || a()) {
            Log.w("AppLovinSdk", U3.j.d + str + "] " + str2);
        }
    }

    public static void l(String str, String str2) {
        l lVar = l.E0;
        if (lVar == null) {
            return;
        }
        lVar.Q();
        if (a()) {
            l.E0.Q().k(str, str2);
        }
    }

    public void b(String str, String str2) {
        a(str, str2, null);
    }

    public void d(String str, String str2) {
        Log.i("AppLovinSdk", U3.j.d + str + "] " + str2);
    }

    public void f(String str, String str2) {
        int intValue;
        if (a(this.f4501a) && !TextUtils.isEmpty(str2) && (intValue = ((Integer) this.f4501a.a(c5.r)).intValue()) > 0) {
            int length = str2.length();
            int i = ((length + intValue) - 1) / intValue;
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = i2 * intValue;
                a(str, str2.substring(i3, Math.min(length, i3 + intValue)));
            }
        }
    }

    public void k(String str, String str2) {
        d(str, str2, null);
    }

    private void a(String str) {
        z2 z2Var = new z2();
        z2Var.a().a(str).a();
        g("AppLovinSdk", z2Var.toString());
    }

    public static void b(String str, String str2, Throwable th) {
        l lVar = l.E0;
        if (lVar == null) {
            return;
        }
        lVar.Q();
        if (a()) {
            l.E0.Q().a(str, str2, th);
        }
    }

    public void d(String str, String str2, Throwable th) {
        Log.w("AppLovinSdk", U3.j.d + str + "] " + str2, th);
    }

    public static void c(String str, String str2) {
        b(str, str2, null);
    }

    public void a(String str, Throwable th) {
        for (Throwable th2 : th.getSuppressed()) {
            b(str, th2.toString());
        }
    }

    public void a(String str, String str2) {
        Log.d("AppLovinSdk", U3.j.d + str + "] " + str2);
    }

    public void a(String str, String str2, Throwable th) {
        Log.e("AppLovinSdk", U3.j.d + str + "] " + str2, th);
    }

    public static boolean a() {
        return a(l.E0);
    }

    public static boolean a(l lVar) {
        return lVar != null && lVar.q0().c();
    }
}
