package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ModuleEvent;

/* renamed from: io.appmetrica.analytics.impl.ai, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0369ai implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ModuleEvent f6997a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0653li f6998b;

    public RunnableC0369ai(C0653li c0653li, ModuleEvent moduleEvent) {
        this.f6998b = c0653li;
        this.f6997a = moduleEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0653li c0653li = this.f6998b;
        C0653li.a(c0653li.f7815a, c0653li.f7818d, c0653li.f7819e).reportEvent(this.f6997a);
    }
}
