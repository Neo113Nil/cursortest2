package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import s3.InterfaceC2360a;

/* loaded from: classes.dex */
public final class In extends AbstractBinderC0559Bc implements Zh {

    /* renamed from: k, reason: collision with root package name */
    public BinderC1215ko f9618k;

    /* renamed from: l, reason: collision with root package name */
    public D3.l f9619l;

    /* renamed from: m, reason: collision with root package name */
    public C1071hd f9620m;

    @Override // com.google.android.gms.internal.ads.InterfaceC0567Cc
    public final synchronized void H1(InterfaceC2360a interfaceC2360a) {
        BinderC1215ko binderC1215ko = this.f9618k;
        if (binderC1215ko != null) {
            binderC1215ko.f14286k.N2();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0567Cc
    public final synchronized void Q(InterfaceC2360a interfaceC2360a) {
        BinderC1215ko binderC1215ko = this.f9618k;
        if (binderC1215ko != null) {
            binderC1215ko.f14288m.n1(new Jh(8));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0567Cc
    public final synchronized void V0(InterfaceC2360a interfaceC2360a) {
        D3.l lVar = this.f9619l;
        if (lVar != null) {
            lVar.k();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0567Cc
    public final synchronized void W1(InterfaceC2360a interfaceC2360a) {
        BinderC1215ko binderC1215ko = this.f9618k;
        if (binderC1215ko != null) {
            binderC1215ko.W1(interfaceC2360a);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0567Cc
    public final synchronized void W2() {
        BinderC1215ko binderC1215ko = this.f9618k;
        if (binderC1215ko != null) {
            binderC1215ko.f14288m.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.Zh
    public final synchronized void Y(D3.l lVar) {
        this.f9619l = lVar;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0567Cc
    public final synchronized void c3(InterfaceC2360a interfaceC2360a) {
        C1071hd c1071hd = this.f9620m;
        if (c1071hd != null) {
            Executor executor = ((C0992fo) c1071hd.f13764o).f13501c;
            C1394on c1394on = (C1394on) c1071hd.f13763n;
            executor.execute(new K2.e(c1071hd, (Sq) c1071hd.f13761l, (Lq) c1071hd.f13762m, c1394on, 7));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0567Cc
    public final synchronized void f2(InterfaceC2360a interfaceC2360a) {
        BinderC1215ko binderC1215ko = this.f9618k;
        if (binderC1215ko != null) {
            binderC1215ko.f14289n.p();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0567Cc
    public final synchronized void o1() {
        C1071hd c1071hd = this.f9620m;
        if (c1071hd != null) {
            U2.j.i("Fail to initialize adapter ".concat(String.valueOf(((C1394on) c1071hd.f13763n).f14848a)));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0567Cc
    public final synchronized void p1(InterfaceC2360a interfaceC2360a, int i) {
        D3.l lVar = this.f9619l;
        if (lVar != null) {
            lVar.d(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0567Cc
    public final synchronized void u2(InterfaceC2360a interfaceC2360a, C0575Dc c0575Dc) {
        BinderC1215ko binderC1215ko = this.f9618k;
        if (binderC1215ko != null) {
            binderC1215ko.f14289n.v0(c0575Dc);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0567Cc
    public final synchronized void zze(InterfaceC2360a interfaceC2360a) {
        BinderC1215ko binderC1215ko = this.f9618k;
        if (binderC1215ko != null) {
            binderC1215ko.f14287l.z();
        }
    }
}
