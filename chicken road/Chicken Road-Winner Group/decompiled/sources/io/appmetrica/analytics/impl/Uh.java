package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;

/* loaded from: classes.dex */
public final class Uh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdRevenue f6723a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0653li f6724b;

    public Uh(C0653li c0653li, AdRevenue adRevenue) {
        this.f6724b = c0653li;
        this.f6723a = adRevenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0653li c0653li = this.f6724b;
        C0653li.a(c0653li.f7815a, c0653li.f7818d, c0653li.f7819e).reportAdRevenue(this.f6723a);
    }
}
