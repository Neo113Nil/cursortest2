package io.appmetrica.analytics.impl;

import d2.C0277g;
import d2.InterfaceC0273c;
import e2.AbstractC0292g;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.jc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0595jc {

    /* renamed from: a, reason: collision with root package name */
    public final Vg f7614a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0980y9 f7615b;

    /* renamed from: c, reason: collision with root package name */
    public final C0898v4 f7616c;

    /* renamed from: d, reason: collision with root package name */
    public final C0392bf f7617d;

    /* renamed from: e, reason: collision with root package name */
    public final U4 f7618e;
    public final Cc f = new Cc();

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC0273c f7619g = new C0277g(new C0570ic(this));

    public C0595jc(S6 s6, Vg vg, InterfaceC0980y9 interfaceC0980y9, C0898v4 c0898v4, C0392bf c0392bf) {
        this.f7614a = vg;
        this.f7615b = interfaceC0980y9;
        this.f7616c = c0898v4;
        this.f7617d = c0392bf;
        this.f7618e = new U4(s6, vg);
    }

    public final List<K8> a() {
        return this.f7618e.a();
    }

    public final List<K8> b() {
        return AbstractC0292g.c0(X0.a.z(this.f7618e.f6713c), X0.a.z((K8) ((C0277g) this.f7619g).a()));
    }
}
