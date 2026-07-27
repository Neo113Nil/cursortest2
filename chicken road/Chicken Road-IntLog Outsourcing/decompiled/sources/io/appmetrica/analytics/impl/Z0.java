package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.DeferredDeeplinkListener;

/* loaded from: classes.dex */
public final class Z0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DeferredDeeplinkListener f7762a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0966s1 f7763b;

    public Z0(C0966s1 c0966s1, DeferredDeeplinkListener deferredDeeplinkListener) {
        this.f7763b = c0966s1;
        this.f7762a = deferredDeeplinkListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7763b.f9216a.getClass();
        C1069w0 c1069w0 = C1069w0.f9490e;
        c1069w0.f().a(this.f7762a);
    }
}
