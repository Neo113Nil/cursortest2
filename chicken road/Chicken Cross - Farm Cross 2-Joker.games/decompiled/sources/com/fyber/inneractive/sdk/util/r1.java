package com.fyber.inneractive.sdk.util;

import com.ironsource.L6;

/* loaded from: classes4.dex */
public final class r1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f5967a;
    public final /* synthetic */ t1 b;

    public r1(t1 t1Var, String str) {
        this.b = t1Var;
        this.f5967a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.c.getSharedPreferences("fyber.ua", 0).edit().putString(L6.d0, this.f5967a).apply();
    }
}
