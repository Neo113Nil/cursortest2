package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class S0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f7407a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0966s1 f7408b;

    public S0(C0966s1 c0966s1, String str) {
        this.f7408b = c0966s1;
        this.f7407a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1095x0 c1095x0 = this.f7408b.f9216a;
        String str = this.f7407a;
        c1095x0.getClass();
        C1069w0.c().setUserProfileID(str);
    }
}
