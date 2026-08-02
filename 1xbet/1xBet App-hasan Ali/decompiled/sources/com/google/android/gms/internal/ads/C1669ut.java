package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import k4.AbstractC2036a;
import n3.AbstractC2187a;

/* renamed from: com.google.android.gms.internal.ads.ut, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1669ut extends AbstractC2187a {
    public static final Parcelable.Creator<C1669ut> CREATOR = new C0730Zb(16);

    /* renamed from: k, reason: collision with root package name */
    public final int f15921k;

    /* renamed from: l, reason: collision with root package name */
    public C1367o4 f15922l = null;

    /* renamed from: m, reason: collision with root package name */
    public byte[] f15923m;

    public C1669ut(int i, byte[] bArr) {
        this.f15921k = i;
        this.f15923m = bArr;
        a();
    }

    public final void a() {
        C1367o4 c1367o4 = this.f15922l;
        if (c1367o4 != null || this.f15923m == null) {
            if (c1367o4 == null || this.f15923m != null) {
                if (c1367o4 != null && this.f15923m != null) {
                    throw new IllegalStateException("Invalid internal representation - full");
                }
                if (c1367o4 != null || this.f15923m != null) {
                    throw new IllegalStateException("Impossible");
                }
                throw new IllegalStateException("Invalid internal representation - empty");
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k02 = AbstractC2036a.k0(parcel, 20293);
        AbstractC2036a.n0(parcel, 1, 4);
        parcel.writeInt(this.f15921k);
        byte[] bArr = this.f15923m;
        if (bArr == null) {
            bArr = this.f15922l.d();
        }
        AbstractC2036a.c0(parcel, 2, bArr);
        AbstractC2036a.m0(parcel, k02);
    }
}
