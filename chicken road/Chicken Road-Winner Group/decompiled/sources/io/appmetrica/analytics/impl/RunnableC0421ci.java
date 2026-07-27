package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;

/* renamed from: io.appmetrica.analytics.impl.ci, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0421ci implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdRevenue f7114a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f7115b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0653li f7116c;

    public RunnableC0421ci(C0653li c0653li, AdRevenue adRevenue, boolean z3) {
        this.f7116c = c0653li;
        this.f7114a = adRevenue;
        this.f7115b = z3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0653li c0653li = this.f7116c;
        C0653li.a(c0653li.f7815a, c0653li.f7818d, c0653li.f7819e).reportAdRevenue(this.f7114a, this.f7115b);
    }
}
