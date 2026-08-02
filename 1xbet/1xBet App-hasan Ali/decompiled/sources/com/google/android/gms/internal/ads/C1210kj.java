package com.google.android.gms.internal.ads;

import Q2.C0375o;
import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import java.util.ArrayList;
import r.C2327e;

/* renamed from: com.google.android.gms.internal.ads.kj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1210kj implements InterfaceC0808bi, S2.m, Vh {

    /* renamed from: k, reason: collision with root package name */
    public final Context f14263k;

    /* renamed from: l, reason: collision with root package name */
    public final InterfaceC0677Re f14264l;

    /* renamed from: m, reason: collision with root package name */
    public final Lq f14265m;

    /* renamed from: n, reason: collision with root package name */
    public final U2.a f14266n;

    /* renamed from: o, reason: collision with root package name */
    public final EnumC1818y6 f14267o;

    /* renamed from: p, reason: collision with root package name */
    public final C1125in f14268p;

    /* renamed from: q, reason: collision with root package name */
    public C1169jn f14269q;

    public C1210kj(Context context, InterfaceC0677Re interfaceC0677Re, Lq lq, U2.a aVar, EnumC1818y6 enumC1818y6, C1125in c1125in) {
        this.f14263k = context;
        this.f14264l = interfaceC0677Re;
        this.f14265m = lq;
        this.f14266n = aVar;
        this.f14267o = enumC1818y6;
        this.f14268p = c1125in;
    }

    @Override // S2.m
    public final void N2() {
        InterfaceC0677Re interfaceC0677Re;
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.Y4)).booleanValue() || (interfaceC0677Re = this.f14264l) == null) {
            return;
        }
        if (this.f14269q != null || a()) {
            if (this.f14269q != null) {
                interfaceC0677Re.a("onSdkImpression", new C2327e(0));
            } else {
                this.f14268p.a();
            }
        }
    }

    @Override // S2.m
    public final void Q1() {
    }

    @Override // S2.m
    public final void Z2() {
    }

    public final boolean a() {
        C0375o c0375o;
        if (!((Boolean) Q2.r.f5053d.f5056c.a(F7.T4)).booleanValue()) {
            return false;
        }
        C1125in c1125in = this.f14268p;
        synchronized (c1125in) {
            c0375o = c1125in.f;
        }
        return c0375o != null;
    }

    @Override // S2.m
    public final void d1(int i) {
        this.f14269q = null;
    }

    @Override // S2.m
    public final void h1() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0808bi
    public final void j0() {
        InterfaceC0677Re interfaceC0677Re;
        A7 a7 = F7.b5;
        Q2.r rVar = Q2.r.f5053d;
        if (!((Boolean) rVar.f5056c.a(a7)).booleanValue()) {
            EnumC1818y6 enumC1818y6 = EnumC1818y6.f16404s;
            EnumC1818y6 enumC1818y62 = this.f14267o;
            if (enumC1818y62 != enumC1818y6 && enumC1818y62 != EnumC1818y6.f16400o && enumC1818y62 != EnumC1818y6.f16407v) {
                return;
            }
        }
        Lq lq = this.f14265m;
        if (!lq.f10482T || (interfaceC0677Re = this.f14264l) == null) {
            return;
        }
        P2.o oVar = P2.o.f4767B;
        Oi oi = oVar.f4789w;
        Context context = this.f14263k;
        oi.getClass();
        if (Oi.j(context)) {
            if (a()) {
                this.f14268p.b();
                return;
            }
            U2.a aVar = this.f14266n;
            String str = aVar.f5853l + "." + aVar.f5854m;
            Hq hq = lq.f10484V;
            int i = 1;
            String str2 = hq.g() + (-1) != 1 ? "javascript" : null;
            int i5 = 2;
            if (hq.g() == 1) {
                i = 3;
            } else {
                i5 = lq.f10487Y == 2 ? 4 : 1;
            }
            int i6 = i5;
            int i7 = i;
            WebView m02 = interfaceC0677Re.m0();
            Oi oi2 = oVar.f4789w;
            oi2.getClass();
            this.f14269q = Oi.b(i6, i7, m02, str, str2, lq.f10510l0);
            View K = interfaceC0677Re.K();
            C1169jn c1169jn = this.f14269q;
            if (c1169jn != null) {
                boolean booleanValue = ((Boolean) rVar.f5056c.a(F7.S4)).booleanValue();
                C1893zs c1893zs = c1169jn.f14142a;
                if (booleanValue) {
                    WebView m03 = interfaceC0677Re.m0();
                    oi2.getClass();
                    Oi.h(c1893zs, m03);
                    ArrayList P02 = interfaceC0677Re.P0();
                    int size = P02.size();
                    int i8 = 0;
                    while (i8 < size) {
                        Object obj = P02.get(i8);
                        i8++;
                        P2.o.f4767B.f4789w.getClass();
                        Oi.p(new RunnableC0902dn(c1893zs, (View) obj, 0));
                    }
                } else {
                    oi2.getClass();
                    Oi.h(c1893zs, K);
                }
                interfaceC0677Re.U0(this.f14269q);
                P2.o.f4767B.f4789w.getClass();
                Oi.i(c1893zs);
                interfaceC0677Re.a("onSdkLoaded", new C2327e(0));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Vh
    public final void t() {
        InterfaceC0677Re interfaceC0677Re;
        if (a()) {
            this.f14268p.a();
        } else {
            if (this.f14269q == null || (interfaceC0677Re = this.f14264l) == null) {
                return;
            }
            if (((Boolean) Q2.r.f5053d.f5056c.a(F7.Y4)).booleanValue()) {
                interfaceC0677Re.a("onSdkImpression", new C2327e(0));
            }
        }
    }

    @Override // S2.m
    public final void t1() {
    }
}
