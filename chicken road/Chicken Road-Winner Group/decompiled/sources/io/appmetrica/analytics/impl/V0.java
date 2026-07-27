package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.Revenue;

/* loaded from: classes.dex */
public final class V0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Revenue f6737a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0817s1 f6738b;

    public V0(C0817s1 c0817s1, Revenue revenue) {
        this.f6738b = c0817s1;
        this.f6737a = revenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0817s1.a(this.f6738b).reportRevenue(this.f6737a);
    }
}
