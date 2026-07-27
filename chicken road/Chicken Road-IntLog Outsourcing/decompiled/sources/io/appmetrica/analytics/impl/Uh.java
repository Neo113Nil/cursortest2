package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;

/* loaded from: classes.dex */
public final class Uh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdRevenue f7596a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0802li f7597b;

    public Uh(C0802li c0802li, AdRevenue adRevenue) {
        this.f7597b = c0802li;
        this.f7596a = adRevenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0802li c0802li = this.f7597b;
        C0802li.a(c0802li.f8739a, c0802li.f8742d, c0802li.f8743e).reportAdRevenue(this.f7596a);
    }
}
