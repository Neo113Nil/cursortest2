package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Aj implements io.appmetrica.analytics.impl.Qa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.AdRevenue f4070a;

    public Aj(io.appmetrica.analytics.AdRevenue adRevenue) {
        this.f4070a = adRevenue;
    }

    @Override // io.appmetrica.analytics.impl.Qa
    public final void a(io.appmetrica.analytics.impl.Ra ra) {
        ra.reportAdRevenue(this.f4070a);
    }
}
