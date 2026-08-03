package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Oh implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.Revenue f4775a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.C0387gi f4776b;

    public Oh(io.appmetrica.analytics.impl.C0387gi c0387gi, io.appmetrica.analytics.Revenue revenue) {
        this.f4776b = c0387gi;
        this.f4775a = revenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        io.appmetrica.analytics.impl.C0387gi c0387gi = this.f4776b;
        io.appmetrica.analytics.impl.C0387gi.a(c0387gi.f5991a, c0387gi.f5994d, c0387gi.f5995e).reportRevenue(this.f4775a);
    }
}
