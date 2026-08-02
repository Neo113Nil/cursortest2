package com.google.android.gms.internal.ads;

import I.C0160m;
import a3.AbstractC0467k;
import n.AbstractC2107A;

/* renamed from: com.google.android.gms.internal.ads.iC, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1107iC implements InterfaceC1554sC {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1464qB f13880a;

    /* renamed from: b, reason: collision with root package name */
    public final C1543s1 f13881b;

    public C1107iC(C1543s1 c1543s1, AbstractC1464qB abstractC1464qB) {
        Fz fz = HB.f9337a;
        this.f13881b = c1543s1;
        this.f13880a = abstractC1464qB;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1554sC
    public final void a(Object obj) {
        this.f13881b.getClass();
        C1779xC c1779xC = ((MB) obj).zzt;
        if (c1779xC.f16276e) {
            c1779xC.f16276e = false;
        }
        Fz fz = HB.f9337a;
        throw AbstractC2107A.p(obj);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1554sC
    public final MB b() {
        AbstractC1464qB abstractC1464qB = this.f13880a;
        return abstractC1464qB instanceof MB ? ((MB) abstractC1464qB).n() : ((KB) ((MB) abstractC1464qB).s(5, null)).c();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1554sC
    public final boolean c(MB mb, MB mb2) {
        return mb.zzt.equals(mb2.zzt);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1554sC
    public final void d(Object obj, Object obj2) {
        AbstractC1599tC.s(obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1554sC
    public final int e(MB mb) {
        return mb.zzt.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1554sC
    public final void f(Object obj, byte[] bArr, int i, int i5, C1598tB c1598tB) {
        MB mb = (MB) obj;
        if (mb.zzt == C1779xC.f) {
            mb.zzt = C1779xC.b();
        }
        throw AbstractC2107A.p(obj);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1554sC
    public final boolean g(Object obj) {
        throw AbstractC2107A.p(obj);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1554sC
    public final void h(Object obj, C0160m c0160m, GB gb) {
        this.f13881b.getClass();
        C1543s1.q(obj);
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1554sC
    public final int i(MB mb) {
        C1779xC c1779xC = mb.zzt;
        int i = c1779xC.f16275d;
        if (i != -1) {
            return i;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < c1779xC.f16272a; i6++) {
            int i7 = c1779xC.f16273b[i6] >>> 3;
            AbstractC1823yB abstractC1823yB = (AbstractC1823yB) c1779xC.f16274c[i6];
            int p02 = EB.p0(8);
            int p03 = EB.p0(i7) + EB.p0(16);
            int p04 = EB.p0(24);
            int g5 = abstractC1823yB.g();
            i5 += p02 + p02 + p03 + AbstractC0467k.s(g5, g5, p04);
        }
        c1779xC.f16275d = i5;
        return i5;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1554sC
    public final void j(Object obj, Ps ps) {
        throw AbstractC2107A.p(obj);
    }
}
