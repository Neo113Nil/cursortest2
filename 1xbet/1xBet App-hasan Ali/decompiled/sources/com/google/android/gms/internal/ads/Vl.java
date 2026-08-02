package com.google.android.gms.internal.ads;

import Q2.InterfaceC0368k0;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* loaded from: classes.dex */
public final class Vl implements S2.m, Cif {

    /* renamed from: k, reason: collision with root package name */
    public final Context f11929k;

    /* renamed from: l, reason: collision with root package name */
    public final U2.a f11930l;

    /* renamed from: m, reason: collision with root package name */
    public Ul f11931m;

    /* renamed from: n, reason: collision with root package name */
    public InterfaceC0677Re f11932n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f11933o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f11934p;

    /* renamed from: q, reason: collision with root package name */
    public long f11935q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC0368k0 f11936r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f11937s;

    public Vl(Context context, U2.a aVar) {
        this.f11929k = context;
        this.f11930l = aVar;
    }

    @Override // S2.m
    public final synchronized void N2() {
        this.f11934p = true;
        b("");
    }

    @Override // S2.m
    public final void Q1() {
    }

    @Override // S2.m
    public final void Z2() {
    }

    public final synchronized void a(InterfaceC0368k0 interfaceC0368k0, C1866z9 c1866z9, C1417p9 c1417p9, C1866z9 c1866z92) {
        if (c(interfaceC0368k0)) {
            try {
                P2.o oVar = P2.o.f4767B;
                V9 v9 = oVar.f4772d;
                InterfaceC0677Re f = V9.f(null, this.f11930l, this.f11929k, new C1586t(0, 0, 0), null, new C1773x6(), null, null, null, null, null, null, "", false, false);
                this.f11932n = f;
                C1028gf I5 = f.I();
                if (I5 == null) {
                    U2.j.i("Failed to obtain a web view for the ad inspector");
                    try {
                        oVar.f4774g.i("InspectorUi.openInspector 2", new NullPointerException("Failed to obtain a web view for the ad inspector"));
                        interfaceC0368k0.u0(AbstractC1803xs.I(17, "Failed to obtain a web view for the ad inspector", null));
                        return;
                    } catch (RemoteException e3) {
                        P2.o.f4767B.f4774g.i("InspectorUi.openInspector 3", e3);
                        return;
                    }
                }
                this.f11936r = interfaceC0368k0;
                I5.w(null, null, null, null, null, false, null, null, null, null, null, null, null, c1866z9, null, new C1417p9(5, this.f11929k), c1417p9, c1866z92, null);
                I5.f13619q = this;
                this.f11932n.loadUrl((String) Q2.r.f5053d.f5056c.a(F7.A8));
                Q1.j.g(this.f11929k, new AdOverlayInfoParcel(this, this.f11932n, this.f11930l), true, null);
                oVar.f4776j.getClass();
                this.f11935q = System.currentTimeMillis();
            } catch (C0719Xe e5) {
                U2.j.j("Failed to obtain a web view for the ad inspector", e5);
                try {
                    P2.o.f4767B.f4774g.i("InspectorUi.openInspector 0", e5);
                    interfaceC0368k0.u0(AbstractC1803xs.I(17, "Failed to obtain a web view for the ad inspector", null));
                } catch (RemoteException e6) {
                    P2.o.f4767B.f4774g.i("InspectorUi.openInspector 1", e6);
                }
            }
        }
    }

    public final synchronized void b(String str) {
        if (this.f11933o && this.f11934p) {
            AbstractC0613Id.f.execute(new Kw(28, this, str));
        }
    }

    public final synchronized boolean c(InterfaceC0368k0 interfaceC0368k0) {
        if (!((Boolean) Q2.r.f5053d.f5056c.a(F7.z8)).booleanValue()) {
            U2.j.i("Ad inspector had an internal error.");
            try {
                interfaceC0368k0.u0(AbstractC1803xs.I(16, null, null));
            } catch (RemoteException unused) {
            }
            return false;
        }
        if (this.f11931m == null) {
            U2.j.i("Ad inspector had an internal error.");
            try {
                P2.o.f4767B.f4774g.i("InspectorUi.shouldOpenUi", new NullPointerException("InspectorManager null"));
                interfaceC0368k0.u0(AbstractC1803xs.I(16, null, null));
            } catch (RemoteException unused2) {
            }
            return false;
        }
        if (!this.f11933o && !this.f11934p) {
            P2.o.f4767B.f4776j.getClass();
            if (System.currentTimeMillis() >= this.f11935q + ((Integer) r1.f5056c.a(F7.C8)).intValue()) {
                return true;
            }
        }
        U2.j.i("Ad inspector cannot be opened because it is already open.");
        try {
            interfaceC0368k0.u0(AbstractC1803xs.I(19, null, null));
        } catch (RemoteException unused3) {
        }
        return false;
    }

    @Override // S2.m
    public final synchronized void d1(int i) {
        this.f11932n.destroy();
        if (!this.f11937s) {
            T2.G.m("Inspector closed.");
            InterfaceC0368k0 interfaceC0368k0 = this.f11936r;
            if (interfaceC0368k0 != null) {
                try {
                    interfaceC0368k0.u0(null);
                } catch (RemoteException unused) {
                }
            }
        }
        this.f11934p = false;
        this.f11933o = false;
        this.f11935q = 0L;
        this.f11937s = false;
        this.f11936r = null;
    }

    @Override // S2.m
    public final void h1() {
    }

    @Override // com.google.android.gms.internal.ads.Cif
    public final synchronized void n(String str, int i, String str2, boolean z3) {
        if (z3) {
            T2.G.m("Ad inspector loaded.");
            this.f11933o = true;
            b("");
            return;
        }
        U2.j.i("Ad inspector failed to load.");
        try {
            P2.o.f4767B.f4774g.i("InspectorUi.onAdWebViewFinishedLoading 0", new Exception("Failed to load UI. Error code: " + i + ", Description: " + str + ", Failing URL: " + str2));
            InterfaceC0368k0 interfaceC0368k0 = this.f11936r;
            if (interfaceC0368k0 != null) {
                interfaceC0368k0.u0(AbstractC1803xs.I(17, null, null));
            }
        } catch (RemoteException e3) {
            P2.o.f4767B.f4774g.i("InspectorUi.onAdWebViewFinishedLoading 1", e3);
        }
        this.f11937s = true;
        this.f11932n.destroy();
    }

    @Override // S2.m
    public final void t1() {
    }
}
