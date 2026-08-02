package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class Dj implements DD {

    /* renamed from: a, reason: collision with root package name */
    public final a3.r f8339a;

    /* renamed from: b, reason: collision with root package name */
    public final CD f8340b;

    /* renamed from: c, reason: collision with root package name */
    public final C0650Nf f8341c;

    /* renamed from: d, reason: collision with root package name */
    public final DD f8342d;

    /* renamed from: e, reason: collision with root package name */
    public final Qj f8343e;
    public final ID f;

    /* renamed from: g, reason: collision with root package name */
    public final C1435pj f8344g;

    /* renamed from: h, reason: collision with root package name */
    public final CD f8345h;
    public final CD i;

    /* renamed from: j, reason: collision with root package name */
    public final CD f8346j;

    /* renamed from: k, reason: collision with root package name */
    public final CD f8347k;

    /* renamed from: l, reason: collision with root package name */
    public final CD f8348l;

    /* renamed from: m, reason: collision with root package name */
    public final C0637Lg f8349m;

    /* renamed from: n, reason: collision with root package name */
    public final CD f8350n;

    /* renamed from: o, reason: collision with root package name */
    public final C1745wf f8351o;

    /* renamed from: p, reason: collision with root package name */
    public final C1565sf f8352p;

    /* renamed from: q, reason: collision with root package name */
    public final CD f8353q;

    /* renamed from: r, reason: collision with root package name */
    public final CD f8354r;

    /* renamed from: s, reason: collision with root package name */
    public final CD f8355s;

    public Dj(a3.r rVar, CD cd, C0650Nf c0650Nf, DD dd, Qj qj, ID id, C1435pj c1435pj, CD cd2, CD cd3, CD cd4, CD cd5, CD cd6, C0637Lg c0637Lg, CD cd7, C1745wf c1745wf, C1565sf c1565sf, CD cd8, CD cd9, CD cd10) {
        this.f8339a = rVar;
        this.f8340b = cd;
        this.f8341c = c0650Nf;
        this.f8342d = dd;
        this.f8343e = qj;
        this.f = id;
        this.f8344g = c1435pj;
        this.f8345h = cd2;
        this.i = cd3;
        this.f8346j = cd4;
        this.f8347k = cd5;
        this.f8348l = cd6;
        this.f8349m = c0637Lg;
        this.f8350n = cd7;
        this.f8351o = c1745wf;
        this.f8352p = c1565sf;
        this.f8353q = cd8;
        this.f8354r = cd9;
        this.f8355s = cd10;
    }

    @Override // com.google.android.gms.internal.ads.ID
    public final Object d() {
        G7 a5 = this.f8339a.a();
        Executor executor = (Executor) this.f8340b.d();
        Gj a6 = this.f8341c.a();
        Jj jj = (Jj) this.f8342d.d();
        Pj a7 = this.f8343e.a();
        Ij ij = (Ij) this.f.d();
        Kj kj = (Kj) this.f8344g.f15020b.f14827l;
        AbstractC1400ot.D(kj);
        AD a8 = CD.a(new JD(this.f8345h));
        AD a9 = CD.a(new JD(this.i));
        AD a10 = CD.a(new JD(this.f8346j));
        AD a11 = CD.a(new JD(this.f8347k));
        AD a12 = CD.a(new JD(this.f8348l));
        C0637Lg c0637Lg = this.f8349m;
        C1116id c1116id = new C1116id(c0637Lg.f10452b.a(), c0637Lg.f10453c.a().f);
        Q4 q42 = (Q4) this.f8350n.d();
        U2.a a13 = this.f8351o.a();
        Context a14 = this.f8352p.a();
        Ej ej = (Ej) this.f8353q.d();
        Fo fo = (Fo) this.f8354r.d();
        return new Cj(a5, executor, a6, jj, a7, ij, kj, a8, a9, a10, a11, a12, c1116id, q42, a13, a14, ej, fo);
    }
}
