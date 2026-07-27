package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;

/* loaded from: classes.dex */
public final class W0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdRevenue f7642a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0966s1 f7643b;

    public W0(C0966s1 c0966s1, AdRevenue adRevenue) {
        this.f7643b = c0966s1;
        this.f7642a = adRevenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0966s1.a(this.f7643b).reportAdRevenue(this.f7642a);
    }
}
