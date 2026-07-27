package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ModuleEvent;

/* renamed from: io.appmetrica.analytics.impl.ai, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0518ai implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ModuleEvent f7880a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0802li f7881b;

    public RunnableC0518ai(C0802li c0802li, ModuleEvent moduleEvent) {
        this.f7881b = c0802li;
        this.f7880a = moduleEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0802li c0802li = this.f7881b;
        C0802li.a(c0802li.f8739a, c0802li.f8742d, c0802li.f8743e).reportEvent(this.f7880a);
    }
}
