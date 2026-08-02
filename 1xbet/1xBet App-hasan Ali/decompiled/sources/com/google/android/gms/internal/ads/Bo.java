package com.google.android.gms.internal.ads;

import Q2.InterfaceC0392x;
import android.content.Context;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class Bo extends Q2.F {

    /* renamed from: k, reason: collision with root package name */
    public final Context f7883k;

    /* renamed from: l, reason: collision with root package name */
    public final C0554Af f7884l;

    /* renamed from: m, reason: collision with root package name */
    public final Vq f7885m;

    /* renamed from: n, reason: collision with root package name */
    public final Z1 f7886n;

    /* renamed from: o, reason: collision with root package name */
    public InterfaceC0392x f7887o;

    public Bo(C0554Af c0554Af, Context context, String str) {
        Vq vq = new Vq();
        this.f7885m = vq;
        this.f7886n = new Z1();
        this.f7884l = c0554Af;
        vq.f11945c = str;
        this.f7883k = context;
    }

    @Override // Q2.G
    public final void D0(C0835c9 c0835c9, Q2.a1 a1Var) {
        this.f7886n.f12441n = c0835c9;
        this.f7885m.f11944b = a1Var;
    }

    @Override // Q2.G
    public final void G2(W8 w8) {
        this.f7886n.f12438k = w8;
    }

    @Override // Q2.G
    public final void L1(B8 b8) {
        this.f7885m.f11949h = b8;
    }

    @Override // Q2.G
    public final void T0(Q2.U u5) {
        this.f7885m.f11961u = u5;
    }

    @Override // Q2.G
    public final void T2(C0800ba c0800ba) {
        this.f7886n.f12442o = c0800ba;
    }

    @Override // Q2.G
    public final void Y2(InterfaceC0924e9 interfaceC0924e9) {
        this.f7886n.f12440m = interfaceC0924e9;
    }

    @Override // Q2.G
    public final Q2.D b() {
        Z1 z12 = this.f7886n;
        z12.getClass();
        Kj kj = new Kj(z12);
        ArrayList arrayList = new ArrayList();
        if (kj.f10213c != null) {
            arrayList.add(Integer.toString(6));
        }
        if (kj.f10211a != null) {
            arrayList.add(Integer.toString(1));
        }
        if (kj.f10212b != null) {
            arrayList.add(Integer.toString(2));
        }
        r.Q q5 = kj.f;
        if (!q5.isEmpty()) {
            arrayList.add(Integer.toString(3));
        }
        if (kj.f10215e != null) {
            arrayList.add(Integer.toString(7));
        }
        Vq vq = this.f7885m;
        vq.f = arrayList;
        ArrayList arrayList2 = new ArrayList(q5.f18961m);
        for (int i = 0; i < q5.f18961m; i++) {
            arrayList2.add((String) q5.f(i));
        }
        vq.f11948g = arrayList2;
        if (vq.f11944b == null) {
            vq.f11944b = Q2.a1.b();
        }
        InterfaceC0392x interfaceC0392x = this.f7887o;
        return new Co(this.f7883k, this.f7884l, this.f7885m, kj, interfaceC0392x);
    }

    @Override // Q2.G
    public final void h2(M2.d dVar) {
        Vq vq = this.f7885m;
        vq.f11951k = dVar;
        if (dVar != null) {
            vq.f11947e = dVar.f3612k;
            vq.f11952l = dVar.f3613l;
        }
    }

    @Override // Q2.G
    public final void i3(String str, InterfaceC0746a9 interfaceC0746a9, Y8 y8) {
        Z1 z12 = this.f7886n;
        ((r.Q) z12.f12443p).put(str, interfaceC0746a9);
        if (y8 != null) {
            ((r.Q) z12.f12444q).put(str, y8);
        }
    }

    @Override // Q2.G
    public final void j2(InterfaceC0392x interfaceC0392x) {
        this.f7887o = interfaceC0392x;
    }

    @Override // Q2.G
    public final void l3(M2.a aVar) {
        Vq vq = this.f7885m;
        vq.f11950j = aVar;
        if (aVar != null) {
            vq.f11947e = aVar.f3604k;
        }
    }

    @Override // Q2.G
    public final void q2(V8 v8) {
        this.f7886n.f12439l = v8;
    }

    @Override // Q2.G
    public final void s2(X9 x9) {
        Vq vq = this.f7885m;
        vq.f11954n = x9;
        vq.f11946d = new Q2.V0(false, true, false);
    }
}
