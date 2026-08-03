package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.id, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0434id extends io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.C0563nd f6096a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.ModuleEvent f6097b;

    public C0434id(io.appmetrica.analytics.impl.C0563nd c0563nd, io.appmetrica.analytics.ModuleEvent moduleEvent) {
        this.f6096a = c0563nd;
        this.f6097b = moduleEvent;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        io.appmetrica.analytics.impl.C0563nd.a(this.f6096a).reportEvent(this.f6097b);
    }
}
