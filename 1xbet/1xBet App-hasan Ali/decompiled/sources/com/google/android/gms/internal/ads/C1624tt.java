package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import k4.AbstractC2036a;
import n3.AbstractC2187a;

/* renamed from: com.google.android.gms.internal.ads.tt, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1624tt extends AbstractC2187a {
    public static final Parcelable.Creator<C1624tt> CREATOR = new C0730Zb(15);

    /* renamed from: k, reason: collision with root package name */
    public final int f15736k;

    /* renamed from: l, reason: collision with root package name */
    public final String f15737l;

    /* renamed from: m, reason: collision with root package name */
    public final String f15738m;

    public C1624tt(int i, String str, String str2) {
        this.f15736k = i;
        this.f15737l = str;
        this.f15738m = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k02 = AbstractC2036a.k0(parcel, 20293);
        AbstractC2036a.n0(parcel, 1, 4);
        parcel.writeInt(this.f15736k);
        AbstractC2036a.f0(parcel, 2, this.f15737l);
        AbstractC2036a.f0(parcel, 3, this.f15738m);
        AbstractC2036a.m0(parcel, k02);
    }
}
