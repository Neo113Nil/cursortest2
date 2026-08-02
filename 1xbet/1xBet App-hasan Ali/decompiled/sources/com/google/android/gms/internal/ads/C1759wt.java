package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import k4.AbstractC2036a;
import n3.AbstractC2187a;

/* renamed from: com.google.android.gms.internal.ads.wt, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1759wt extends AbstractC2187a {
    public static final Parcelable.Creator<C1759wt> CREATOR = new C0730Zb(17);

    /* renamed from: k, reason: collision with root package name */
    public final int f16179k;

    /* renamed from: l, reason: collision with root package name */
    public final int f16180l;

    /* renamed from: m, reason: collision with root package name */
    public final String f16181m;

    /* renamed from: n, reason: collision with root package name */
    public final String f16182n;

    /* renamed from: o, reason: collision with root package name */
    public final int f16183o;

    public C1759wt(int i, int i5, int i6, String str, String str2) {
        this.f16179k = i;
        this.f16180l = i5;
        this.f16181m = str;
        this.f16182n = str2;
        this.f16183o = i6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k02 = AbstractC2036a.k0(parcel, 20293);
        AbstractC2036a.n0(parcel, 1, 4);
        parcel.writeInt(this.f16179k);
        AbstractC2036a.n0(parcel, 2, 4);
        parcel.writeInt(this.f16180l);
        AbstractC2036a.f0(parcel, 3, this.f16181m);
        AbstractC2036a.f0(parcel, 4, this.f16182n);
        AbstractC2036a.n0(parcel, 5, 4);
        parcel.writeInt(this.f16183o);
        AbstractC2036a.m0(parcel, k02);
    }
}
