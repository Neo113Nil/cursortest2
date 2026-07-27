package io.appmetrica.analytics.impl;

import a.AbstractC0169a;
import f4.InterfaceC0428e;
import g4.AbstractC0465j;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.jc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0744jc {

    /* renamed from: a, reason: collision with root package name */
    public final Vg f8529a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1129y9 f8530b;

    /* renamed from: c, reason: collision with root package name */
    public final C1047v4 f8531c;

    /* renamed from: d, reason: collision with root package name */
    public final C0541bf f8532d;

    /* renamed from: e, reason: collision with root package name */
    public final U4 f8533e;

    /* renamed from: f, reason: collision with root package name */
    public final Cc f8534f = new Cc();

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC0428e f8535g = AbstractC0169a.A(new C0719ic(this));

    public C0744jc(S6 s6, Vg vg, InterfaceC1129y9 interfaceC1129y9, C1047v4 c1047v4, C0541bf c0541bf) {
        this.f8529a = vg;
        this.f8530b = interfaceC1129y9;
        this.f8531c = c1047v4;
        this.f8532d = c0541bf;
        this.f8533e = new U4(s6, vg);
    }

    public final List<K8> a() {
        return this.f8533e.a();
    }

    public final List<K8> b() {
        return AbstractC0465j.N0(K1.b.W(this.f8533e.f7586c), K1.b.W((K8) this.f8535g.getValue()));
    }
}
