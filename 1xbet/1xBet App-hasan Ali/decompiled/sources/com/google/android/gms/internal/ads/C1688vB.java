package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.vB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1688vB extends C1733wB {

    /* renamed from: n, reason: collision with root package name */
    public final int f15970n;

    /* renamed from: o, reason: collision with root package name */
    public final int f15971o;

    public C1688vB(byte[] bArr, int i, int i5) {
        super(bArr);
        AbstractC1823yB.o(i, i + i5, bArr.length);
        this.f15970n = i;
        this.f15971o = i5;
    }

    @Override // com.google.android.gms.internal.ads.C1733wB, com.google.android.gms.internal.ads.AbstractC1823yB
    public final byte d(int i) {
        AbstractC1823yB.s(i, this.f15971o);
        return this.f16097m[this.f15970n + i];
    }

    @Override // com.google.android.gms.internal.ads.C1733wB, com.google.android.gms.internal.ads.AbstractC1823yB
    public final byte e(int i) {
        return this.f16097m[this.f15970n + i];
    }

    @Override // com.google.android.gms.internal.ads.C1733wB, com.google.android.gms.internal.ads.AbstractC1823yB
    public final int g() {
        return this.f15971o;
    }

    @Override // com.google.android.gms.internal.ads.C1733wB, com.google.android.gms.internal.ads.AbstractC1823yB
    public final void h(int i, int i5, int i6, byte[] bArr) {
        System.arraycopy(this.f16097m, this.f15970n + i, bArr, i5, i6);
    }

    @Override // com.google.android.gms.internal.ads.C1733wB
    public final int t() {
        return this.f15970n;
    }
}
