package com.startapp.sdk.internal;

/* loaded from: classes.dex */
public final class w1 implements wd {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4551a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zd f4552b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x1 f4553c;

    /* JADX WARN: Multi-variable type inference failed */
    public w1(x1 x1Var, wd wdVar) {
        this.f4553c = x1Var;
        this.f4552b = (zd) wdVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.startapp.sdk.internal.wd, com.startapp.sdk.internal.zd] */
    @Override // com.startapp.sdk.internal.wd
    public final synchronized void a(Object obj) {
        if (this.f4551a) {
            return;
        }
        this.f4551a = true;
        this.f4553c.f4618c.removeCallbacksAndMessages(null);
        this.f4552b.a(obj);
    }
}
