package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.Revenue;

/* loaded from: classes.dex */
public final class Th implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Revenue f6669a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0653li f6670b;

    public Th(C0653li c0653li, Revenue revenue) {
        this.f6670b = c0653li;
        this.f6669a = revenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0653li c0653li = this.f6670b;
        C0653li.a(c0653li.f7815a, c0653li.f7818d, c0653li.f7819e).reportRevenue(this.f6669a);
    }
}
