package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class Ln implements DD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10459a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final CD f10460b;

    /* renamed from: c, reason: collision with root package name */
    public final ED f10461c;

    /* renamed from: d, reason: collision with root package name */
    public final C1745wf f10462d;

    public Ln(CD cd, C1745wf c1745wf, ED ed) {
        this.f10460b = cd;
        this.f10462d = c1745wf;
        this.f10461c = ed;
    }

    @Override // com.google.android.gms.internal.ads.ID
    public final Object d() {
        switch (this.f10459a) {
            case 0:
                Context context = (Context) this.f10460b.d();
                U2.a a5 = this.f10462d.a();
                C0622Jf c0622Jf = (C0622Jf) this.f10461c.f8474a;
                C0606Hd c0606Hd = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd);
                return new Dn(context, a5, c0622Jf, c0606Hd);
            default:
                return new Dn((Context) this.f10460b.d(), (C1880zf) this.f10461c.f8474a, this.f10462d.a());
        }
    }

    public Ln(CD cd, ED ed, C1745wf c1745wf) {
        this.f10460b = cd;
        this.f10461c = ed;
        this.f10462d = c1745wf;
    }
}
