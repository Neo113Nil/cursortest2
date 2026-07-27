package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class R0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f6489a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0817s1 f6490b;

    public R0(C0817s1 c0817s1, boolean z3) {
        this.f6490b = c0817s1;
        this.f6489a = z3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0946x0 c0946x0 = this.f6490b.f8271a;
        boolean z3 = this.f6489a;
        c0946x0.getClass();
        C0920w0.c().setDataSendingEnabled(z3);
    }
}
