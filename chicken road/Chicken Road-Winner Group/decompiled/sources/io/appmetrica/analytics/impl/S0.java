package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class S0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f6542a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0817s1 f6543b;

    public S0(C0817s1 c0817s1, String str) {
        this.f6543b = c0817s1;
        this.f6542a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0946x0 c0946x0 = this.f6543b.f8271a;
        String str = this.f6542a;
        c0946x0.getClass();
        C0920w0.c().setUserProfileID(str);
    }
}
