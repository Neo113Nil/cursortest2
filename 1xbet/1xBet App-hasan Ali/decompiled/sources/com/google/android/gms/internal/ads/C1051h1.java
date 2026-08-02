package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.h1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1051h1 implements InterfaceC1006g1 {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f13698a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f13699b;

    /* renamed from: c, reason: collision with root package name */
    public final long f13700c;

    /* renamed from: d, reason: collision with root package name */
    public final long f13701d;

    /* renamed from: e, reason: collision with root package name */
    public final int f13702e;

    public C1051h1(long[] jArr, long[] jArr2, long j5, long j6, int i) {
        this.f13698a = jArr;
        this.f13699b = jArr2;
        this.f13700c = j5;
        this.f13701d = j6;
        this.f13702e = i;
    }

    @Override // com.google.android.gms.internal.ads.U
    public final long a() {
        return this.f13700c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1006g1
    public final long b(long j5) {
        return this.f13698a[AbstractC1260lo.j(this.f13699b, j5, true)];
    }

    @Override // com.google.android.gms.internal.ads.U
    public final T c(long j5) {
        long[] jArr = this.f13698a;
        int j6 = AbstractC1260lo.j(jArr, j5, true);
        long j7 = jArr[j6];
        long[] jArr2 = this.f13699b;
        V v4 = new V(j7, jArr2[j6]);
        if (j7 >= j5 || j6 == jArr.length - 1) {
            return new T(v4, v4);
        }
        int i = j6 + 1;
        return new T(v4, new V(jArr[i], jArr2[i]));
    }

    @Override // com.google.android.gms.internal.ads.U
    public final boolean g() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1006g1
    public final int i() {
        return this.f13702e;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1006g1
    public final long j() {
        return this.f13701d;
    }
}
