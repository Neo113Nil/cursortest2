package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.DeferredDeeplinkListener;

/* loaded from: classes.dex */
public final class Z0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DeferredDeeplinkListener f6884a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0817s1 f6885b;

    public Z0(C0817s1 c0817s1, DeferredDeeplinkListener deferredDeeplinkListener) {
        this.f6885b = c0817s1;
        this.f6884a = deferredDeeplinkListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6885b.f8271a.getClass();
        C0920w0 c0920w0 = C0920w0.f8534e;
        c0920w0.f().a(this.f6884a);
    }
}
