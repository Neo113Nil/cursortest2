package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;

/* loaded from: classes.dex */
public final class W0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdRevenue f6769a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0817s1 f6770b;

    public W0(C0817s1 c0817s1, AdRevenue adRevenue) {
        this.f6770b = c0817s1;
        this.f6769a = adRevenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0817s1.a(this.f6770b).reportAdRevenue(this.f6769a);
    }
}
