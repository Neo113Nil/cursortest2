package io.appmetrica.analytics.impl;

import android.location.Location;

/* loaded from: classes.dex */
public final class O0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Location f6345a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0817s1 f6346b;

    public O0(C0817s1 c0817s1, Location location) {
        this.f6346b = c0817s1;
        this.f6345a = location;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0946x0 c0946x0 = this.f6346b.f8271a;
        Location location = this.f6345a;
        c0946x0.getClass();
        C0920w0.c().a(location);
    }
}
