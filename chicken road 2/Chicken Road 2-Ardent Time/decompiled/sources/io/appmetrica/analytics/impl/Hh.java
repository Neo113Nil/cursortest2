package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Hh implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f4385a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Throwable f4386b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.C0387gi f4387c;

    public Hh(io.appmetrica.analytics.impl.C0387gi c0387gi, java.lang.String str, java.lang.Throwable th) {
        this.f4387c = c0387gi;
        this.f4385a = str;
        this.f4386b = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        io.appmetrica.analytics.impl.C0387gi c0387gi = this.f4387c;
        io.appmetrica.analytics.impl.C0387gi.a(c0387gi.f5991a, c0387gi.f5994d, c0387gi.f5995e).reportError(this.f4385a, this.f4386b);
    }
}
