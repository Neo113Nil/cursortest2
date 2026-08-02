package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1095i0 {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0737a0 f13846a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13847b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13848c;

    /* renamed from: d, reason: collision with root package name */
    public final long f13849d;

    /* renamed from: e, reason: collision with root package name */
    public final int f13850e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public int f13851g;

    /* renamed from: h, reason: collision with root package name */
    public int f13852h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f13853j;

    /* renamed from: k, reason: collision with root package name */
    public long f13854k;

    /* renamed from: l, reason: collision with root package name */
    public long[] f13855l;

    /* renamed from: m, reason: collision with root package name */
    public int[] f13856m;

    public C1095i0(int i, int i5, long j5, int i6, InterfaceC0737a0 interfaceC0737a0) {
        i5 = i5 != 1 ? 2 : i5;
        this.f13849d = j5;
        this.f13850e = i6;
        this.f13846a = interfaceC0737a0;
        int i7 = (((i % 10) + 48) << 8) | ((i / 10) + 48);
        this.f13847b = (i5 == 2 ? 1667497984 : 1651965952) | i7;
        this.f13848c = i5 == 2 ? i7 | 1650720768 : -1;
        this.f13854k = -1L;
        this.f13855l = new long[512];
        this.f13856m = new int[512];
    }

    public final T a(long j5) {
        if (this.f13853j == 0) {
            V v4 = new V(0L, this.f13854k);
            return new T(v4, v4);
        }
        int i = (int) (j5 / ((this.f13849d * 1) / this.f13850e));
        int i5 = AbstractC1260lo.i(this.f13856m, i, true, true);
        if (this.f13856m[i5] == i) {
            V b3 = b(i5);
            return new T(b3, b3);
        }
        V b5 = b(i5);
        int i6 = i5 + 1;
        return i6 < this.f13855l.length ? new T(b5, b(i6)) : new T(b5, b5);
    }

    public final V b(int i) {
        return new V(((this.f13849d * 1) / this.f13850e) * this.f13856m[i], this.f13855l[i]);
    }
}
