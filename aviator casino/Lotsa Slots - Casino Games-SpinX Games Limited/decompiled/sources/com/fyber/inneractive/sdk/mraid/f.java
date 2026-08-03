package com.fyber.inneractive.sdk.mraid;

/* loaded from: classes3.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f3823a;
    public final java.util.Map b;
    public final com.fyber.inneractive.sdk.web.i0 c;
    public final com.fyber.inneractive.sdk.util.g1 d;

    public f(java.util.Map map, com.fyber.inneractive.sdk.web.i0 i0Var, com.fyber.inneractive.sdk.util.g1 g1Var) {
        this.b = map;
        this.d = g1Var;
        this.c = i0Var;
    }

    public final int a(java.lang.String str) {
        java.lang.String str2 = (java.lang.String) this.b.get(str);
        if (str2 == null) {
            return -1;
        }
        try {
            return java.lang.Integer.parseInt(str2, 10);
        } catch (java.lang.NumberFormatException unused) {
            return -1;
        }
    }

    public abstract void a();

    public abstract boolean b();
}
