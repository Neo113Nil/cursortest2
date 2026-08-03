package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Hj implements io.appmetrica.analytics.impl.Qa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.AdRevenue f4391a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f4392b;

    public Hj(io.appmetrica.analytics.AdRevenue adRevenue, boolean z2) {
        this.f4391a = adRevenue;
        this.f4392b = z2;
    }

    @Override // io.appmetrica.analytics.impl.Qa
    public final void a(io.appmetrica.analytics.impl.Ra ra) {
        ra.reportAdRevenue(this.f4391a, this.f4392b);
    }
}
