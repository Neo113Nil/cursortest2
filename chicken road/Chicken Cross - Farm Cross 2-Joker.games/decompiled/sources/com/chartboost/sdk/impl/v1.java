package com.chartboost.sdk.impl;

/* loaded from: classes4.dex */
public class v1 implements Runnable {
    public final u1 b;
    public final boolean c;

    public v1(u1 u1Var, boolean z, int i) {
        this.b = u1Var;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.b.a(this.c);
    }
}
