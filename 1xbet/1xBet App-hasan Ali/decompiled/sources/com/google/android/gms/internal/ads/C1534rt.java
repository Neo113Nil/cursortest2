package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import k4.AbstractC2036a;
import n3.AbstractC2187a;

/* renamed from: com.google.android.gms.internal.ads.rt, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1534rt extends AbstractC2187a {
    public static final Parcelable.Creator<C1534rt> CREATOR = new C0730Zb(14);

    /* renamed from: k, reason: collision with root package name */
    public final int f15391k;

    /* renamed from: l, reason: collision with root package name */
    public final byte[] f15392l;

    public C1534rt(int i, byte[] bArr) {
        this.f15391k = i;
        this.f15392l = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k02 = AbstractC2036a.k0(parcel, 20293);
        AbstractC2036a.n0(parcel, 1, 4);
        parcel.writeInt(this.f15391k);
        AbstractC2036a.c0(parcel, 2, this.f15392l);
        AbstractC2036a.m0(parcel, k02);
    }
}
