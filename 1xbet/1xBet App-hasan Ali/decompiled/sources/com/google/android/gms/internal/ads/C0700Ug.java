package com.google.android.gms.internal.ads;

import Q2.C0375o;
import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import java.util.ArrayList;
import r.C2327e;

/* renamed from: com.google.android.gms.internal.ads.Ug, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0700Ug implements InterfaceC0808bi, Vh {

    /* renamed from: k, reason: collision with root package name */
    public final Context f11775k;

    /* renamed from: l, reason: collision with root package name */
    public final InterfaceC0677Re f11776l;

    /* renamed from: m, reason: collision with root package name */
    public final Lq f11777m;

    /* renamed from: n, reason: collision with root package name */
    public final U2.a f11778n;

    /* renamed from: o, reason: collision with root package name */
    public C1169jn f11779o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f11780p;

    /* renamed from: q, reason: collision with root package name */
    public final C1125in f11781q;

    public C0700Ug(Context context, InterfaceC0677Re interfaceC0677Re, Lq lq, U2.a aVar, C1125in c1125in) {
        this.f11775k = context;
        this.f11776l = interfaceC0677Re;
        this.f11777m = lq;
        this.f11778n = aVar;
        this.f11781q = c1125in;
    }

    public final synchronized void a() {
        int i;
        int i5;
        try {
            if (this.f11777m.f10482T && this.f11776l != null) {
                Context context = this.f11775k;
                P2.o oVar = P2.o.f4767B;
                oVar.f4789w.getClass();
                if (Oi.j(context)) {
                    U2.a aVar = this.f11778n;
                    String str = aVar.f5853l + "." + aVar.f5854m;
                    Hq hq = this.f11777m.f10484V;
                    String str2 = hq.g() + (-1) != 1 ? "javascript" : null;
                    if (hq.g() == 1) {
                        i = 2;
                        i5 = 3;
                    } else if (this.f11777m.f10497e == 1) {
                        i = 3;
                        i5 = 1;
                    } else {
                        i = 1;
                        i5 = 1;
                    }
                    InterfaceC0677Re interfaceC0677Re = this.f11776l;
                    Lq lq = this.f11777m;
                    Oi oi = oVar.f4789w;
                    WebView m02 = interfaceC0677Re.m0();
                    String str3 = lq.f10510l0;
                    oi.getClass();
                    this.f11779o = Oi.b(i, i5, m02, str, str2, str3);
                    View K = this.f11776l.K();
                    C1169jn c1169jn = this.f11779o;
                    if (c1169jn != null) {
                        C1893zs c1893zs = c1169jn.f14142a;
                        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.S4)).booleanValue()) {
                            InterfaceC0677Re interfaceC0677Re2 = this.f11776l;
                            Oi oi2 = oVar.f4789w;
                            WebView m03 = interfaceC0677Re2.m0();
                            oi2.getClass();
                            Oi.h(c1893zs, m03);
                            ArrayList P02 = this.f11776l.P0();
                            int size = P02.size();
                            int i6 = 0;
                            while (i6 < size) {
                                Object obj = P02.get(i6);
                                i6++;
                                P2.o.f4767B.f4789w.getClass();
                                Oi.p(new RunnableC0902dn(c1893zs, (View) obj, 0));
                            }
                        } else {
                            oVar.f4789w.getClass();
                            Oi.h(c1893zs, K);
                        }
                        this.f11776l.U0(this.f11779o);
                        P2.o.f4767B.f4789w.getClass();
                        Oi.i(c1893zs);
                        this.f11780p = true;
                        this.f11776l.a("onSdkLoaded", new C2327e(0));
                    }
                }
            }
        } finally {
        }
    }

    public final boolean b() {
        C0375o c0375o;
        if (!((Boolean) Q2.r.f5053d.f5056c.a(F7.T4)).booleanValue()) {
            return false;
        }
        C1125in c1125in = this.f11781q;
        synchronized (c1125in) {
            c0375o = c1125in.f;
        }
        return c0375o != null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0808bi
    public final synchronized void j0() {
        if (b()) {
            this.f11781q.b();
        } else {
            if (this.f11780p) {
                return;
            }
            a();
        }
    }

    @Override // com.google.android.gms.internal.ads.Vh
    public final synchronized void t() {
        InterfaceC0677Re interfaceC0677Re;
        if (b()) {
            this.f11781q.a();
            return;
        }
        if (!this.f11780p) {
            a();
        }
        if (!this.f11777m.f10482T || this.f11779o == null || (interfaceC0677Re = this.f11776l) == null) {
            return;
        }
        interfaceC0677Re.a("onSdkImpression", new C2327e(0));
    }
}
