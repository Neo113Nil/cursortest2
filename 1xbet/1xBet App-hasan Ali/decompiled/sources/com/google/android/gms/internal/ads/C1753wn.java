package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* renamed from: com.google.android.gms.internal.ads.wn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1753wn implements InterfaceC1165jj {

    /* renamed from: k, reason: collision with root package name */
    public final U2.a f16152k;

    /* renamed from: l, reason: collision with root package name */
    public final C0634Ld f16153l;

    /* renamed from: m, reason: collision with root package name */
    public final Lq f16154m;

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC0677Re f16155n;

    /* renamed from: o, reason: collision with root package name */
    public final Wq f16156o;

    /* renamed from: p, reason: collision with root package name */
    public final A9 f16157p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f16158q;

    /* renamed from: r, reason: collision with root package name */
    public final BinderC0857cn f16159r;

    /* renamed from: s, reason: collision with root package name */
    public final C1482ql f16160s;

    public C1753wn(U2.a aVar, C0634Ld c0634Ld, Lq lq, InterfaceC0677Re interfaceC0677Re, Wq wq, boolean z3, A9 a9, BinderC0857cn binderC0857cn, C1482ql c1482ql) {
        this.f16152k = aVar;
        this.f16153l = c0634Ld;
        this.f16154m = lq;
        this.f16155n = interfaceC0677Re;
        this.f16156o = wq;
        this.f16158q = z3;
        this.f16157p = a9;
        this.f16159r = binderC0857cn;
        this.f16160s = c1482ql;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1165jj
    public final void z(boolean z3, Context context, Sh sh) {
        boolean z5;
        C0562Bf c0562Bf = (C0562Bf) AbstractC1400ot.n0(this.f16153l);
        InterfaceC0677Re interfaceC0677Re = this.f16155n;
        interfaceC0677Re.p0(true);
        A9 a9 = this.f16157p;
        boolean z6 = this.f16158q;
        boolean c5 = z6 ? a9.c(true) : true;
        if (z6) {
            synchronized (a9) {
                z5 = a9.f7540b;
            }
        } else {
            z5 = false;
        }
        float a5 = z6 ? a9.a() : 0.0f;
        Lq lq = this.f16154m;
        P2.h hVar = new P2.h(c5, true, z5, a5, z3, lq.f10477O, false);
        if (sh != null) {
            sh.c();
        }
        Q1.j jVar = P2.o.f4767B.f4770b;
        C1077hj c1077hj = (C1077hj) c0562Bf.f7835P.d();
        int i = lq.f10479Q;
        Wq wq = this.f16156o;
        if (i == -1) {
            Q2.d1 d1Var = wq.f12102j;
            if (d1Var != null) {
                int i5 = d1Var.f5009k;
                if (i5 == 1) {
                    i = 7;
                } else if (i5 == 2) {
                    i = 6;
                }
            }
            U2.j.d("Error setting app open orientation; no targeting orientation available.");
            i = lq.f10479Q;
        }
        int i6 = i;
        String str = lq.f10466B;
        Pq pq = lq.f10523s;
        Q1.j.g(context, new AdOverlayInfoParcel(c1077hj, this.f16155n, i6, this.f16152k, str, hVar, pq.f11127b, pq.f11126a, wq.f, sh, lq.b() ? this.f16159r : null, interfaceC0677Re.t()), true, this.f16160s);
    }
}
