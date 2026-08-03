package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.wj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0802wj implements io.appmetrica.analytics.impl.Qa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.Revenue f7031a;

    public C0802wj(io.appmetrica.analytics.Revenue revenue) {
        this.f7031a = revenue;
    }

    @Override // io.appmetrica.analytics.impl.Qa
    public final void a(io.appmetrica.analytics.impl.Ra ra) {
        ra.reportRevenue(this.f7031a);
    }
}
