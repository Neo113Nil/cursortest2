package com.fyber.inneractive.sdk.util;

/* loaded from: classes3.dex */
public final class q1 implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f4307a;
    public final /* synthetic */ com.fyber.inneractive.sdk.util.s1 b;

    public q1(com.fyber.inneractive.sdk.util.s1 s1Var, java.lang.String str) {
        this.b = s1Var;
        this.f4307a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.c.getSharedPreferences("fyber.ua", 0).edit().putString(com.ironsource.M6.d0, this.f4307a).apply();
    }
}
