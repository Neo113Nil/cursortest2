package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.q1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1454q1 {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0737a0 f15073a;

    /* renamed from: d, reason: collision with root package name */
    public A1 f15076d;

    /* renamed from: e, reason: collision with root package name */
    public C1319n1 f15077e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public int f15078g;

    /* renamed from: h, reason: collision with root package name */
    public int f15079h;
    public int i;

    /* renamed from: l, reason: collision with root package name */
    public boolean f15082l;

    /* renamed from: b, reason: collision with root package name */
    public final C1858z1 f15074b = new C1858z1();

    /* renamed from: c, reason: collision with root package name */
    public final C1617tm f15075c = new C1617tm();

    /* renamed from: j, reason: collision with root package name */
    public final C1617tm f15080j = new C1617tm(1);

    /* renamed from: k, reason: collision with root package name */
    public final C1617tm f15081k = new C1617tm();

    public C1454q1(InterfaceC0737a0 interfaceC0737a0, A1 a12, C1319n1 c1319n1) {
        this.f15073a = interfaceC0737a0;
        this.f15076d = a12;
        this.f15077e = c1319n1;
        this.f15076d = a12;
        this.f15077e = c1319n1;
        interfaceC0737a0.e(a12.f7500a.f16207g);
        d();
    }

    public final int a() {
        int i = !this.f15082l ? this.f15076d.f7505g[this.f] : this.f15074b.f16532j[this.f] ? 1 : 0;
        return c() != null ? i | 1073741824 : i;
    }

    public final int b(int i, int i5) {
        C1617tm c1617tm;
        C1813y1 c5 = c();
        if (c5 == null) {
            return 0;
        }
        C1858z1 c1858z1 = this.f15074b;
        int i6 = c5.f16380d;
        if (i6 != 0) {
            c1617tm = c1858z1.f16536n;
        } else {
            int i7 = AbstractC1260lo.f14419a;
            byte[] bArr = c5.f16381e;
            i6 = bArr.length;
            C1617tm c1617tm2 = this.f15081k;
            c1617tm2.h(i6, bArr);
            c1617tm = c1617tm2;
        }
        boolean z3 = c1858z1.f16533k && c1858z1.f16534l[this.f];
        boolean z5 = z3 || i5 != 0;
        int i8 = true != z5 ? 0 : 128;
        C1617tm c1617tm3 = this.f15080j;
        c1617tm3.f15724a[0] = (byte) (i8 | i6);
        c1617tm3.j(0);
        InterfaceC0737a0 interfaceC0737a0 = this.f15073a;
        interfaceC0737a0.f(c1617tm3, 1, 1);
        interfaceC0737a0.f(c1617tm, i6, 1);
        if (!z5) {
            return i6 + 1;
        }
        C1617tm c1617tm4 = this.f15075c;
        if (!z3) {
            c1617tm4.g(8);
            byte[] bArr2 = c1617tm4.f15724a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = 0;
            bArr2[3] = (byte) i5;
            bArr2[4] = (byte) ((i >> 24) & 255);
            bArr2[5] = (byte) ((i >> 16) & 255);
            bArr2[6] = (byte) ((i >> 8) & 255);
            bArr2[7] = (byte) (i & 255);
            interfaceC0737a0.f(c1617tm4, 8, 1);
            return i6 + 9;
        }
        int i9 = i6 + 1;
        C1617tm c1617tm5 = c1858z1.f16536n;
        int z6 = c1617tm5.z();
        c1617tm5.k(-2);
        int i10 = (z6 * 6) + 2;
        if (i5 != 0) {
            c1617tm4.g(i10);
            byte[] bArr3 = c1617tm4.f15724a;
            c1617tm5.f(bArr3, 0, i10);
            int i11 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i5;
            bArr3[2] = (byte) ((i11 >> 8) & 255);
            bArr3[3] = (byte) (i11 & 255);
        } else {
            c1617tm4 = c1617tm5;
        }
        interfaceC0737a0.f(c1617tm4, i10, 1);
        return i9 + i10;
    }

    public final C1813y1 c() {
        if (!this.f15082l) {
            return null;
        }
        C1858z1 c1858z1 = this.f15074b;
        C1319n1 c1319n1 = c1858z1.f16525a;
        int i = AbstractC1260lo.f14419a;
        int i5 = c1319n1.f14565a;
        C1813y1 c1813y1 = c1858z1.f16535m;
        if (c1813y1 == null) {
            c1813y1 = this.f15076d.f7500a.f16211l[i5];
        }
        if (c1813y1 == null || !c1813y1.f16377a) {
            return null;
        }
        return c1813y1;
    }

    public final void d() {
        C1858z1 c1858z1 = this.f15074b;
        c1858z1.f16528d = 0;
        c1858z1.f16538p = 0L;
        c1858z1.f16539q = false;
        c1858z1.f16533k = false;
        c1858z1.f16537o = false;
        c1858z1.f16535m = null;
        this.f = 0;
        this.f15079h = 0;
        this.f15078g = 0;
        this.i = 0;
        this.f15082l = false;
    }

    public final boolean e() {
        this.f++;
        if (!this.f15082l) {
            return false;
        }
        int i = this.f15078g + 1;
        this.f15078g = i;
        int[] iArr = this.f15074b.f16530g;
        int i5 = this.f15079h;
        if (i != iArr[i5]) {
            return true;
        }
        this.f15079h = i5 + 1;
        this.f15078g = 0;
        return false;
    }
}
