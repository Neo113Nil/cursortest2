package com.google.android.gms.internal.play_billing;

import b2.AbstractC0279e;

/* renamed from: com.google.android.gms.internal.play_billing.x1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0384x1 implements D1 {

    /* renamed from: a, reason: collision with root package name */
    public final S0 f5290a;

    /* renamed from: b, reason: collision with root package name */
    public final C0328e1 f5291b;

    public C0384x1(C0328e1 c0328e1, S0 s02) {
        C0328e1 c0328e12 = AbstractC0319b1.f5156a;
        this.f5291b = c0328e1;
        this.f5290a = s02;
    }

    @Override // com.google.android.gms.internal.play_billing.D1
    public final void a(Object obj) {
        this.f5291b.getClass();
        C0328e1.d(obj);
        C0328e1 c0328e1 = AbstractC0319b1.f5156a;
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.android.gms.internal.play_billing.D1
    public final void b(Object obj, byte[] bArr, int i2, int i3, V0 v02) {
        AbstractC0334g1 abstractC0334g1 = (AbstractC0334g1) obj;
        if (abstractC0334g1.zzc == H1.f5055f) {
            abstractC0334g1.zzc = H1.b();
        }
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.android.gms.internal.play_billing.D1
    public final int c(AbstractC0334g1 abstractC0334g1) {
        H1 h12 = abstractC0334g1.zzc;
        int i2 = h12.f5059d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i6 = 0; i6 < h12.f5056a; i6++) {
            int i7 = h12.f5057b[i6] >>> 3;
            Y0 y02 = (Y0) h12.f5058c[i6];
            int n02 = Z0.n0(8);
            int n03 = Z0.n0(i7) + Z0.n0(16);
            int n04 = Z0.n0(24);
            int d6 = y02.d();
            i3 += n02 + n02 + n03 + AbstractC0279e.c(d6, d6, n04);
        }
        h12.f5059d = i3;
        return i3;
    }

    @Override // com.google.android.gms.internal.play_billing.D1
    public final void d(Object obj, Object obj2) {
        E1.s(obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.D1
    public final int e(AbstractC0334g1 abstractC0334g1) {
        return abstractC0334g1.zzc.hashCode();
    }

    @Override // com.google.android.gms.internal.play_billing.D1
    public final AbstractC0334g1 f() {
        S0 s02 = this.f5290a;
        return s02 instanceof AbstractC0334g1 ? (AbstractC0334g1) ((AbstractC0334g1) s02).d(4) : ((AbstractC0331f1) ((AbstractC0334g1) s02).d(5)).c();
    }

    @Override // com.google.android.gms.internal.play_billing.D1
    public final boolean g(AbstractC0334g1 abstractC0334g1, Object obj) {
        return abstractC0334g1.zzc.equals(((AbstractC0334g1) obj).zzc);
    }

    @Override // com.google.android.gms.internal.play_billing.D1
    public final void h(Object obj, C0366r1 c0366r1) {
        AbstractC0279e.o(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.D1
    public final boolean i(Object obj) {
        AbstractC0279e.o(obj);
        throw null;
    }
}
