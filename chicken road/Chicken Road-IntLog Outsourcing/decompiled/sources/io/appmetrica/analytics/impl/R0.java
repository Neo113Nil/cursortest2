package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class R0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f7353a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0966s1 f7354b;

    public R0(C0966s1 c0966s1, boolean z) {
        this.f7354b = c0966s1;
        this.f7353a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1095x0 c1095x0 = this.f7354b.f9216a;
        boolean z = this.f7353a;
        c1095x0.getClass();
        C1069w0.c().setDataSendingEnabled(z);
    }
}
