package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;

/* loaded from: classes.dex */
public final class Mj implements Xa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdRevenue f6299a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f6300b;

    public Mj(AdRevenue adRevenue, boolean z3) {
        this.f6299a = adRevenue;
        this.f6300b = z3;
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final void a(Ya ya) {
        ya.reportAdRevenue(this.f6299a, this.f6300b);
    }
}
