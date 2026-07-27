package io.appmetrica.analytics.impl;

import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class Lc implements K8 {

    /* renamed from: a, reason: collision with root package name */
    public final Ae f7081a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1430a f7082b;

    public Lc(Ae ae, InterfaceC1430a interfaceC1430a) {
        this.f7081a = ae;
        this.f7082b = interfaceC1430a;
    }

    @Override // io.appmetrica.analytics.impl.K8
    public final boolean b() {
        return ((C1159ze) this.f7081a).f9646b.get() >= ((long) ((Number) this.f7082b.invoke()).intValue());
    }
}
