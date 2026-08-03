package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Yh implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.Qn f5345a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.C0387gi f5346b;

    public Yh(io.appmetrica.analytics.impl.C0387gi c0387gi, io.appmetrica.analytics.impl.Qn qn) {
        this.f5346b = c0387gi;
        this.f5345a = qn;
    }

    @Override // java.lang.Runnable
    public final void run() {
        io.appmetrica.analytics.impl.C0387gi c0387gi = this.f5346b;
        io.appmetrica.analytics.impl.C0387gi.a(c0387gi.f5991a, c0387gi.f5994d, c0387gi.f5995e).a(this.f5345a);
    }
}
