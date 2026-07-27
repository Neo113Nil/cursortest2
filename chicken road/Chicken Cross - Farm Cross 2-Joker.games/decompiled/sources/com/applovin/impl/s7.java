package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Locale;
import java.util.UUID;

/* loaded from: classes5.dex */
public final class s7 {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f4432a;
    private String b;
    private final String c = a(e5.l);
    private final String d = a(e5.m);
    private String e = (String) f5.a(e5.n, (Object) null, com.applovin.impl.sdk.l.p());
    private String f = (String) f5.a(e5.o, (Object) null, com.applovin.impl.sdk.l.p());

    public s7(com.applovin.impl.sdk.l lVar) {
        this.f4432a = lVar;
        a(f());
    }

    private String f() {
        if (!((Boolean) this.f4432a.a(c5.S3)).booleanValue()) {
            this.f4432a.c(e5.k);
        }
        String str = (String) this.f4432a.a(e5.k);
        if (!StringUtils.isValidString(str)) {
            return null;
        }
        this.f4432a.Q();
        if (com.applovin.impl.sdk.p.a()) {
            this.f4432a.Q().a("AppLovinSdk", "Using identifier (" + str + ") from previous session");
        }
        return str;
    }

    public String a() {
        return this.d;
    }

    public String b() {
        return this.e;
    }

    public String c() {
        return this.c;
    }

    public String d() {
        return this.f;
    }

    public String e() {
        return this.b;
    }

    private String a(e5 e5Var) {
        String str = (String) f5.a(e5Var, (Object) null, com.applovin.impl.sdk.l.p());
        if (StringUtils.isValidString(str)) {
            return str;
        }
        String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
        f5.b(e5Var, lowerCase, com.applovin.impl.sdk.l.p());
        return lowerCase;
    }

    public void b(String str) {
        this.e = str;
        f5.b(e5.n, str, com.applovin.impl.sdk.l.p());
    }

    public void c(String str) {
        this.f = str;
        f5.b(e5.o, str, com.applovin.impl.sdk.l.p());
    }

    public void a(String str) {
        if (((Boolean) this.f4432a.a(c5.S3)).booleanValue()) {
            this.f4432a.b(e5.k, str);
        }
        this.b = str;
        this.f4432a.u().b(str, a());
    }

    public static String a(com.applovin.impl.sdk.l lVar) {
        e5 e5Var = e5.p;
        String str = (String) lVar.a(e5Var);
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String valueOf = String.valueOf(((int) (Math.random() * 100.0d)) + 1);
        lVar.b(e5Var, valueOf);
        return valueOf;
    }
}
