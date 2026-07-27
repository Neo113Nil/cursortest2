package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.x1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0240x1 implements D1 {

    /* renamed from: a, reason: collision with root package name */
    public final S0 f2853a;

    /* renamed from: b, reason: collision with root package name */
    public final C0184e1 f2854b;

    public C0240x1(C0184e1 c0184e1, S0 s02) {
        C0184e1 c0184e12 = AbstractC0175b1.f2725a;
        this.f2854b = c0184e1;
        this.f2853a = s02;
    }

    @Override // com.google.android.gms.internal.play_billing.D1
    public final void a(Object obj) {
        this.f2854b.getClass();
        H1 h12 = ((AbstractC0190g1) obj).zzc;
        if (h12.f2635e) {
            h12.f2635e = false;
        }
        C0184e1 c0184e1 = AbstractC0175b1.f2725a;
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.android.gms.internal.play_billing.D1
    public final void b(Object obj, byte[] bArr, int i3, int i4, V0 v0) {
        AbstractC0190g1 abstractC0190g1 = (AbstractC0190g1) obj;
        if (abstractC0190g1.zzc == H1.f) {
            abstractC0190g1.zzc = H1.b();
        }
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.android.gms.internal.play_billing.D1
    public final int c(AbstractC0190g1 abstractC0190g1) {
        H1 h12 = abstractC0190g1.zzc;
        int i3 = h12.f2634d;
        if (i3 != -1) {
            return i3;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < h12.f2631a; i5++) {
            int i6 = h12.f2632b[i5] >>> 3;
            Y0 y02 = (Y0) h12.f2633c[i5];
            int d02 = Z0.d0(8);
            int d03 = Z0.d0(i6) + Z0.d0(16);
            int d04 = Z0.d0(24);
            int d3 = y02.d();
            i4 += d02 + d02 + d03 + B0.c.e(d3, d3, d04);
        }
        h12.f2634d = i4;
        return i4;
    }

    @Override // com.google.android.gms.internal.play_billing.D1
    public final void d(Object obj, Object obj2) {
        E1.p(obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.D1
    public final int e(AbstractC0190g1 abstractC0190g1) {
        return abstractC0190g1.zzc.hashCode();
    }

    @Override // com.google.android.gms.internal.play_billing.D1
    public final boolean f(AbstractC0190g1 abstractC0190g1, AbstractC0190g1 abstractC0190g12) {
        return abstractC0190g1.zzc.equals(abstractC0190g12.zzc);
    }

    @Override // com.google.android.gms.internal.play_billing.D1
    public final AbstractC0190g1 g() {
        S0 s02 = this.f2853a;
        return s02 instanceof AbstractC0190g1 ? (AbstractC0190g1) ((AbstractC0190g1) s02).d(4) : ((AbstractC0187f1) ((AbstractC0190g1) s02).d(5)).c();
    }

    @Override // com.google.android.gms.internal.play_billing.D1
    public final void h(Object obj, C0222r1 c0222r1) {
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.android.gms.internal.play_billing.D1
    public final boolean i(Object obj) {
        obj.getClass();
        throw new ClassCastException();
    }
}
