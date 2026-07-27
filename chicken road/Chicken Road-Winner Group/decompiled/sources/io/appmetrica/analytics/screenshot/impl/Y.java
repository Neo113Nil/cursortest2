package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* loaded from: classes.dex */
public final class Y implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C1026g f9017a;

    /* renamed from: b, reason: collision with root package name */
    public final c0 f9018b;

    /* renamed from: c, reason: collision with root package name */
    public final r f9019c;

    public Y() {
        this(null, null, null, 7, null);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Q fromModel(W w3) {
        Q q3 = new Q();
        C1024e c1024e = w3.f9011a;
        q3.f9004a = c1024e != null ? this.f9017a.fromModel(c1024e) : null;
        a0 a0Var = w3.f9012b;
        q3.f9005b = a0Var != null ? this.f9018b.fromModel(a0Var) : null;
        C1035p c1035p = w3.f9013c;
        q3.f9006c = c1035p != null ? this.f9019c.fromModel(c1035p) : null;
        return q3;
    }

    public Y(C1026g c1026g, c0 c0Var, r rVar) {
        this.f9017a = c1026g;
        this.f9018b = c0Var;
        this.f9019c = rVar;
    }

    public /* synthetic */ Y(C1026g c1026g, c0 c0Var, r rVar, int i3, kotlin.jvm.internal.f fVar) {
        this((i3 & 1) != 0 ? new C1026g() : c1026g, (i3 & 2) != 0 ? new c0() : c0Var, (i3 & 4) != 0 ? new r() : rVar);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final W toModel(Q q3) {
        C1024e c1024e;
        a0 a0Var;
        N n3 = q3.f9004a;
        if (n3 != null) {
            this.f9017a.getClass();
            c1024e = new C1024e(n3.f8995a);
        } else {
            c1024e = null;
        }
        P p3 = q3.f9005b;
        if (p3 != null) {
            this.f9018b.getClass();
            a0Var = new a0(p3.f9001a, p3.f9002b);
        } else {
            a0Var = null;
        }
        O o3 = q3.f9006c;
        return new W(c1024e, a0Var, o3 != null ? this.f9019c.toModel(o3) : null);
    }
}
