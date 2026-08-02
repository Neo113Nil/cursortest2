package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.yj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1839yj implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f16463k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Cj f16464l;

    public /* synthetic */ RunnableC1839yj(Cj cj, int i) {
        this.f16463k = i;
        this.f16464l = cj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16463k) {
            case 0:
                Cj cj = this.f16464l;
                try {
                    Gj gj = cj.f8059k;
                    int D5 = gj.D();
                    Kj kj = cj.f8063o;
                    if (D5 == 1) {
                        W8 w8 = kj.f10211a;
                        if (w8 != null) {
                            cj.r();
                            S8 s8 = (S8) cj.f8064p.d();
                            Parcel N5 = w8.N();
                            F5.e(N5, s8);
                            w8.d1(N5, 1);
                            return;
                        }
                        return;
                    }
                    if (D5 == 2) {
                        V8 v8 = kj.f10212b;
                        if (v8 != null) {
                            cj.r();
                            R8 r8 = (R8) cj.f8065q.d();
                            Parcel N6 = v8.N();
                            F5.e(N6, r8);
                            v8.d1(N6, 1);
                            return;
                        }
                        return;
                    }
                    if (D5 == 3) {
                        String a5 = gj.a();
                        InterfaceC0746a9 interfaceC0746a9 = a5 == null ? null : (InterfaceC0746a9) kj.f.get(a5);
                        if (interfaceC0746a9 != null) {
                            if (cj.f8059k.R() != null) {
                                cj.y("Google", true);
                            }
                            interfaceC0746a9.j0((U8) cj.f8068t.d());
                            return;
                        }
                        return;
                    }
                    if (D5 == 6) {
                        InterfaceC0924e9 interfaceC0924e9 = kj.f10213c;
                        if (interfaceC0924e9 != null) {
                            cj.r();
                            interfaceC0924e9.l0((InterfaceC1192k9) cj.f8066r.d());
                            return;
                        }
                        return;
                    }
                    if (D5 != 7) {
                        U2.j.f("Wrong native template id!");
                        return;
                    }
                    C0800ba c0800ba = kj.f10215e;
                    if (c0800ba != null) {
                        Y9 y9 = (Y9) cj.f8067s.d();
                        Parcel N7 = c0800ba.N();
                        F5.e(N7, y9);
                        c0800ba.d1(N7, 1);
                        return;
                    }
                    return;
                } catch (RemoteException e3) {
                    U2.j.g("RemoteException when notifyAdLoad is called", e3);
                    return;
                }
            default:
                Cj cj2 = this.f16464l;
                cj2.f8060l.h();
                Gj gj2 = cj2.f8059k;
                synchronized (gj2) {
                    try {
                        InterfaceC0677Re interfaceC0677Re = gj2.i;
                        if (interfaceC0677Re != null) {
                            interfaceC0677Re.destroy();
                            gj2.i = null;
                        }
                        InterfaceC0677Re interfaceC0677Re2 = gj2.f9233j;
                        if (interfaceC0677Re2 != null) {
                            interfaceC0677Re2.destroy();
                            gj2.f9233j = null;
                        }
                        InterfaceC0677Re interfaceC0677Re3 = gj2.f9234k;
                        if (interfaceC0677Re3 != null) {
                            interfaceC0677Re3.destroy();
                            gj2.f9234k = null;
                        }
                        E3.a aVar = gj2.f9236m;
                        if (aVar != null) {
                            aVar.cancel(false);
                            gj2.f9236m = null;
                        }
                        C0634Ld c0634Ld = gj2.f9237n;
                        if (c0634Ld != null) {
                            c0634Ld.cancel(false);
                            gj2.f9237n = null;
                        }
                        gj2.f9235l = null;
                        gj2.f9245v.clear();
                        gj2.f9246w.clear();
                        gj2.f9227b = null;
                        gj2.f9228c = null;
                        gj2.f9229d = null;
                        gj2.f9230e = null;
                        gj2.f9232h = null;
                        gj2.f9238o = null;
                        gj2.f9239p = null;
                        gj2.f9240q = null;
                        gj2.f9242s = null;
                        gj2.f9243t = null;
                        gj2.f9244u = null;
                    } finally {
                    }
                }
                return;
        }
    }
}
