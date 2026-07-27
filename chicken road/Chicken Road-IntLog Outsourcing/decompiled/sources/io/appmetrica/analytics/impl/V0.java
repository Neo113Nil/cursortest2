package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.Revenue;

/* loaded from: classes.dex */
public final class V0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Revenue f7610a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0966s1 f7611b;

    public V0(C0966s1 c0966s1, Revenue revenue) {
        this.f7611b = c0966s1;
        this.f7610a = revenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0966s1.a(this.f7611b).reportRevenue(this.f7610a);
    }
}
