package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Vh implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.ModuleEvent f5172a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.C0387gi f5173b;

    public Vh(io.appmetrica.analytics.impl.C0387gi c0387gi, io.appmetrica.analytics.ModuleEvent moduleEvent) {
        this.f5173b = c0387gi;
        this.f5172a = moduleEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        io.appmetrica.analytics.impl.C0387gi c0387gi = this.f5173b;
        io.appmetrica.analytics.impl.C0387gi.a(c0387gi.f5991a, c0387gi.f5994d, c0387gi.f5995e).reportEvent(this.f5172a);
    }
}
