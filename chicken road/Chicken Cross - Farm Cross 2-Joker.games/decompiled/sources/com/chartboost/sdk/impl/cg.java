package com.chartboost.sdk.impl;

import android.os.Build;
import io.ktor.sse.ServerSentEventKt;
import java.util.Locale;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class cg {

    /* renamed from: a, reason: collision with root package name */
    public final String f4714a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final JSONObject m;
    public final String n;
    public final String o;
    public final Integer p;
    public final u3 q;
    public final we r;
    public final tg s;
    public final i9 t;
    public final kf u;
    public final qh v;
    public final f5 w;
    public final g6 x;
    public final dc y;

    public cg(String str, String str2, i9 i9Var, kf kfVar, u3 u3Var, tg tgVar, qh qhVar, we weVar, f5 f5Var, g6 g6Var, dc dcVar) {
        String str3;
        this.t = i9Var;
        this.u = kfVar;
        this.q = u3Var;
        this.s = tgVar;
        this.v = qhVar;
        this.r = weVar;
        this.h = str;
        this.i = str2;
        this.w = f5Var;
        this.x = g6Var;
        this.y = dcVar;
        String str4 = Build.PRODUCT;
        if ("sdk".equals(str4) || "google_sdk".equals(str4) || ((str3 = Build.MANUFACTURER) != null && str3.contains("Genymotion"))) {
            this.f4714a = "Android Simulator";
        } else {
            this.f4714a = Build.MODEL;
        }
        String str5 = Build.MANUFACTURER;
        this.k = str5 == null ? "unknown" : str5;
        this.j = str5 + ServerSentEventKt.SPACE + Build.MODEL;
        this.l = g6Var.b();
        this.b = "Android " + Build.VERSION.RELEASE;
        this.c = Locale.getDefault().getCountry();
        this.d = Locale.getDefault().getLanguage();
        this.g = "9.13.0";
        this.e = g6Var.i();
        this.f = g6Var.g();
        this.n = b(u3Var);
        this.m = a(u3Var);
        this.o = l3.a();
        this.p = kfVar.a();
    }

    public final JSONObject a(u3 u3Var) {
        return u3Var != null ? a(u3Var, new w3()) : new JSONObject();
    }

    public final String b(u3 u3Var) {
        return u3Var != null ? u3Var.d() : "";
    }

    public i9 c() {
        return this.t;
    }

    public dc d() {
        return this.y;
    }

    public Integer e() {
        return Integer.valueOf(this.x.f());
    }

    public we f() {
        return this.r;
    }

    public kf g() {
        return this.u;
    }

    public tg h() {
        return this.s;
    }

    public int i() {
        tg tgVar = this.s;
        if (tgVar != null) {
            return tgVar.f();
        }
        return -1;
    }

    public qh j() {
        return this.v;
    }

    public JSONObject a(u3 u3Var, w3 w3Var) {
        if (w3Var != null) {
            return w3Var.a(u3Var);
        }
        return new JSONObject();
    }

    public g6 b() {
        return this.x;
    }

    public f5 a() {
        return this.w;
    }
}
