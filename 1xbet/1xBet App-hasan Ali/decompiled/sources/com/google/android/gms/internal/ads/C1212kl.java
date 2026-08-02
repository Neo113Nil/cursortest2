package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.kl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1212kl implements DD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14270a = 2;

    /* renamed from: b, reason: collision with root package name */
    public final CD f14271b;

    /* renamed from: c, reason: collision with root package name */
    public final ID f14272c;

    /* renamed from: d, reason: collision with root package name */
    public final ID f14273d;

    /* renamed from: e, reason: collision with root package name */
    public final ID f14274e;
    public final DD f;

    /* renamed from: g, reason: collision with root package name */
    public final ID f14275g;

    /* renamed from: h, reason: collision with root package name */
    public final ID f14276h;

    public C1212kl(C1565sf c1565sf, CD cd, CD cd2, C1119ih c1119ih, C1119ih c1119ih2, CD cd3, DD dd) {
        this.f14272c = c1565sf;
        this.f14271b = cd;
        this.f14273d = cd2;
        this.f = c1119ih;
        this.f14275g = c1119ih2;
        this.f14274e = cd3;
        this.f14276h = dd;
    }

    public An a() {
        return new An((C0594Ff) ((ED) this.f14272c).f8474a, (Context) this.f14271b.d(), (Executor) ((CD) this.f14273d).d(), (Wk) ((CD) this.f14274e).d(), ((Hh) this.f).a(), (InterfaceC1311mu) ((CD) this.f14275g).d(), (C1392ol) ((CD) this.f14276h).d());
    }

    @Override // com.google.android.gms.internal.ads.ID
    public final Object d() {
        switch (this.f14270a) {
            case 0:
                Context a5 = ((C1565sf) this.f14272c).a();
                C0817br c0817br = (C0817br) this.f14271b.d();
                C1482ql c1482ql = (C1482ql) ((CD) this.f14273d).d();
                Sq sq = (Sq) ((C1119ih) this.f).f13965b.f13186l;
                AbstractC1400ot.D(sq);
                return new C1167jl(a5, c0817br, c1482ql, sq, ((C1119ih) this.f14275g).a(), (Xm) ((CD) this.f14274e).d(), (String) ((DD) this.f14276h).d());
            case 1:
                return new C1392ol(((C1565sf) this.f14272c).a(), (C1616tl) this.f14273d.d(), ((C1790xf) this.f14274e).d(), ((Hh) this.f).a(), (String) this.f14271b.d(), (String) this.f14275g.d(), (P2.g) this.f14276h.d());
            case 2:
                return a();
            case 3:
                return new BinderC1084hq((C0554Af) ((ED) this.f14272c).f8474a, (Context) ((ED) this.f).f8474a, (String) ((ED) this.f14275g).f8474a, (C0949eq) this.f14271b.d(), (C0904dq) ((CD) this.f14273d).d(), ((C1745wf) this.f14276h).a(), (C1482ql) ((CD) this.f14274e).d());
            default:
                return new C1128iq((Context) ((ED) this.f14272c).f8474a, (Executor) this.f14271b.d(), (Q2.a1) ((ED) this.f).f8474a, (C0554Af) ((ED) this.f14275g).f8474a, (Eo) ((CD) this.f14273d).d(), (Go) ((CD) this.f14274e).d(), new Vq(), (C1838yi) ((CD) this.f14276h).d());
        }
    }

    public C1212kl(ED ed, CD cd, CD cd2, CD cd3, Hh hh, CD cd4, CD cd5) {
        this.f14272c = ed;
        this.f14271b = cd;
        this.f14273d = cd2;
        this.f14274e = cd3;
        this.f = hh;
        this.f14275g = cd4;
        this.f14276h = cd5;
    }

    public C1212kl(ED ed, CD cd, ED ed2, ED ed3, CD cd2, CD cd3, CD cd4) {
        this.f14272c = ed;
        this.f14271b = cd;
        this.f = ed2;
        this.f14275g = ed3;
        this.f14273d = cd2;
        this.f14274e = cd3;
        this.f14276h = cd4;
    }

    public C1212kl(ED ed, ED ed2, ED ed3, CD cd, CD cd2, C1745wf c1745wf, CD cd3) {
        this.f14272c = ed;
        this.f = ed2;
        this.f14275g = ed3;
        this.f14271b = cd;
        this.f14273d = cd2;
        this.f14276h = c1745wf;
        this.f14274e = cd3;
    }

    public C1212kl(ID id, ID id2, ID id3, Hh hh, CD cd, ID id4, ID id5) {
        this.f14272c = id;
        this.f14273d = id2;
        this.f14274e = id3;
        this.f = hh;
        this.f14271b = cd;
        this.f14275g = id4;
        this.f14276h = id5;
    }
}
