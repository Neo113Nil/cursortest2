package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.DeferredDeeplinkParametersListener;

/* loaded from: classes.dex */
public final class Y0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DeferredDeeplinkParametersListener f6843a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0817s1 f6844b;

    public Y0(C0817s1 c0817s1, DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        this.f6844b = c0817s1;
        this.f6843a = deferredDeeplinkParametersListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6844b.f8271a.getClass();
        C0920w0 c0920w0 = C0920w0.f8534e;
        c0920w0.f().a(this.f6843a);
    }
}
