package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import k4.AbstractC2036a;
import n3.AbstractC2187a;

/* renamed from: com.google.android.gms.internal.ads.yt, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1849yt extends AbstractC2187a {
    public static final Parcelable.Creator<C1849yt> CREATOR = new C0730Zb(18);

    /* renamed from: k, reason: collision with root package name */
    public final int f16497k;

    /* renamed from: l, reason: collision with root package name */
    public final byte[] f16498l;

    /* renamed from: m, reason: collision with root package name */
    public final int f16499m;

    public C1849yt(byte[] bArr, int i, int i5) {
        this.f16497k = i;
        this.f16498l = bArr == null ? null : Arrays.copyOf(bArr, bArr.length);
        this.f16499m = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k02 = AbstractC2036a.k0(parcel, 20293);
        AbstractC2036a.n0(parcel, 1, 4);
        parcel.writeInt(this.f16497k);
        AbstractC2036a.c0(parcel, 2, this.f16498l);
        AbstractC2036a.n0(parcel, 3, 4);
        parcel.writeInt(this.f16499m);
        AbstractC2036a.m0(parcel, k02);
    }

    public C1849yt() {
        this(null, 1, 1);
    }
}
