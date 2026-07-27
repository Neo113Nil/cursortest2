package io.appmetrica.analytics.impl;

import e2.AbstractC0293h;
import java.util.List;

/* loaded from: classes.dex */
public final class U4 {

    /* renamed from: a, reason: collision with root package name */
    public final E5 f6711a;

    /* renamed from: b, reason: collision with root package name */
    public final Lc f6712b;

    /* renamed from: c, reason: collision with root package name */
    public final Lc f6713c;

    public U4(S6 s6, Vg vg) {
        C1010ze c1010ze = new C1010ze(s6);
        this.f6711a = new E5(s6);
        this.f6712b = new Lc(c1010ze, new T4(vg));
        this.f6713c = new Lc(c1010ze, S4.f6551a);
    }

    public final List<K8> a() {
        return AbstractC0293h.S(this.f6711a, this.f6712b);
    }

    public final List<K8> b() {
        return X0.a.z(this.f6713c);
    }
}
