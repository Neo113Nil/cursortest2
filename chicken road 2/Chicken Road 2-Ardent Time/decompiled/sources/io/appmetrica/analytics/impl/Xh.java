package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Xh implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.AdRevenue f5306a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f5307b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.C0387gi f5308c;

    public Xh(io.appmetrica.analytics.impl.C0387gi c0387gi, io.appmetrica.analytics.AdRevenue adRevenue, boolean z2) {
        this.f5308c = c0387gi;
        this.f5306a = adRevenue;
        this.f5307b = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        io.appmetrica.analytics.impl.C0387gi c0387gi = this.f5308c;
        io.appmetrica.analytics.impl.C0387gi.a(c0387gi.f5991a, c0387gi.f5994d, c0387gi.f5995e).reportAdRevenue(this.f5306a, this.f5307b);
    }
}
