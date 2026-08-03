package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Fj implements io.appmetrica.analytics.impl.Qa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.ModuleEvent f4297a;

    public Fj(io.appmetrica.analytics.ModuleEvent moduleEvent) {
        this.f4297a = moduleEvent;
    }

    @Override // io.appmetrica.analytics.impl.Qa
    public final void a(io.appmetrica.analytics.impl.Ra ra) {
        ra.reportEvent(this.f4297a);
    }
}
