package com.google.android.gms.internal.ads;

import Q2.C0387u0;
import Q2.InterfaceC0347a;

/* renamed from: com.google.android.gms.internal.ads.gl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1034gl implements InterfaceC1434pi, InterfaceC0808bi, Ph, Vh, InterfaceC0347a, Bi {

    /* renamed from: k, reason: collision with root package name */
    public final C1773x6 f13642k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f13643l = false;

    public C1034gl(C1773x6 c1773x6, C1666uq c1666uq) {
        this.f13642k = c1773x6;
        c1773x6.b(2);
        if (c1666uq != null) {
            c1773x6.b(1101);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1434pi
    public final void B0(Sq sq) {
        this.f13642k.a(new U4(19, sq));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1434pi
    public final void D(C1428pc c1428pc) {
    }

    @Override // com.google.android.gms.internal.ads.Bi
    public final void L0(C0789b7 c0789b7) {
        C1773x6 c1773x6 = this.f13642k;
        synchronized (c1773x6) {
            if (c1773x6.f16228c) {
                try {
                    c1773x6.f16227b.i(c0789b7);
                } catch (NullPointerException e3) {
                    P2.o.f4767B.f4774g.i("AdMobClearcutLogger.modify", e3);
                }
            }
        }
        this.f13642k.b(1102);
    }

    @Override // com.google.android.gms.internal.ads.Bi
    public final void g() {
        this.f13642k.b(1109);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0808bi
    public final void j0() {
        this.f13642k.b(3);
    }

    @Override // com.google.android.gms.internal.ads.Bi
    public final void k(boolean z3) {
        this.f13642k.b(true != z3 ? 1108 : 1107);
    }

    @Override // com.google.android.gms.internal.ads.Ph
    public final void l0(C0387u0 c0387u0) {
        int i = c0387u0.f5058k;
        C1773x6 c1773x6 = this.f13642k;
        switch (i) {
            case 1:
                c1773x6.b(101);
                break;
            case 2:
                c1773x6.b(102);
                break;
            case 3:
                c1773x6.b(5);
                break;
            case 4:
                c1773x6.b(103);
                break;
            case 5:
                c1773x6.b(104);
                break;
            case 6:
                c1773x6.b(105);
                break;
            case 7:
                c1773x6.b(106);
                break;
            default:
                c1773x6.b(4);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.Bi
    public final void o(C0789b7 c0789b7) {
        C1773x6 c1773x6 = this.f13642k;
        synchronized (c1773x6) {
            if (c1773x6.f16228c) {
                try {
                    c1773x6.f16227b.i(c0789b7);
                } catch (NullPointerException e3) {
                    P2.o.f4767B.f4774g.i("AdMobClearcutLogger.modify", e3);
                }
            }
        }
        this.f13642k.b(1104);
    }

    @Override // com.google.android.gms.internal.ads.Bi
    public final void o0(boolean z3) {
        this.f13642k.b(true != z3 ? 1106 : 1105);
    }

    @Override // com.google.android.gms.internal.ads.Vh
    public final synchronized void t() {
        this.f13642k.b(6);
    }

    @Override // com.google.android.gms.internal.ads.Bi
    public final void y(C0789b7 c0789b7) {
        C1773x6 c1773x6 = this.f13642k;
        synchronized (c1773x6) {
            if (c1773x6.f16228c) {
                try {
                    c1773x6.f16227b.i(c0789b7);
                } catch (NullPointerException e3) {
                    P2.o.f4767B.f4774g.i("AdMobClearcutLogger.modify", e3);
                }
            }
        }
        this.f13642k.b(1103);
    }

    @Override // Q2.InterfaceC0347a
    public final synchronized void z() {
        if (this.f13643l) {
            this.f13642k.b(8);
        } else {
            this.f13642k.b(7);
            this.f13643l = true;
        }
    }
}
