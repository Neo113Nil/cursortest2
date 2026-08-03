package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Jh implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Throwable f4502a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.C0387gi f4503b;

    public Jh(io.appmetrica.analytics.impl.C0387gi c0387gi, java.lang.Throwable th) {
        this.f4503b = c0387gi;
        this.f4502a = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        io.appmetrica.analytics.impl.C0387gi c0387gi = this.f4503b;
        io.appmetrica.analytics.impl.C0387gi.a(c0387gi.f5991a, c0387gi.f5994d, c0387gi.f5995e).reportUnhandledException(this.f4502a);
    }
}
