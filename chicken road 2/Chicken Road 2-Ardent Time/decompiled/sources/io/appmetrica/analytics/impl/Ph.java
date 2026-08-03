package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Ph implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.AdRevenue f4843a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.C0387gi f4844b;

    public Ph(io.appmetrica.analytics.impl.C0387gi c0387gi, io.appmetrica.analytics.AdRevenue adRevenue) {
        this.f4844b = c0387gi;
        this.f4843a = adRevenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        io.appmetrica.analytics.impl.C0387gi c0387gi = this.f4844b;
        io.appmetrica.analytics.impl.C0387gi.a(c0387gi.f5991a, c0387gi.f5994d, c0387gi.f5995e).reportAdRevenue(this.f4843a);
    }
}
