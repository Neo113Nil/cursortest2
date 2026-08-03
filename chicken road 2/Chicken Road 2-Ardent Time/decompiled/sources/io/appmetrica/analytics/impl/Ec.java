package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Ec implements io.appmetrica.analytics.impl.F8 {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.InterfaceC0745ue f4260a;

    /* renamed from: b, reason: collision with root package name */
    public final s1.InterfaceC0991a f4261b;

    public Ec(io.appmetrica.analytics.impl.InterfaceC0745ue interfaceC0745ue, s1.InterfaceC0991a interfaceC0991a) {
        this.f4260a = interfaceC0745ue;
        this.f4261b = interfaceC0991a;
    }

    @Override // io.appmetrica.analytics.impl.F8
    public final boolean b() {
        return ((io.appmetrica.analytics.impl.C0719te) this.f4260a).f6857b.get() >= ((long) ((java.lang.Number) this.f4261b.invoke()).intValue());
    }
}
