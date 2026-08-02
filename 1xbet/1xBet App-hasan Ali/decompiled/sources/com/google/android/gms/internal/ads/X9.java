package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import k4.AbstractC2036a;
import n3.AbstractC2187a;

/* loaded from: classes.dex */
public final class X9 extends AbstractC2187a {
    public static final Parcelable.Creator<X9> CREATOR = new C1812y0(28);

    /* renamed from: k, reason: collision with root package name */
    public final int f12154k;

    /* renamed from: l, reason: collision with root package name */
    public final int f12155l;

    /* renamed from: m, reason: collision with root package name */
    public final String f12156m;

    /* renamed from: n, reason: collision with root package name */
    public final int f12157n;

    public X9(int i, int i5, int i6, String str) {
        this.f12154k = i;
        this.f12155l = i5;
        this.f12156m = str;
        this.f12157n = i6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k02 = AbstractC2036a.k0(parcel, 20293);
        AbstractC2036a.n0(parcel, 1, 4);
        parcel.writeInt(this.f12155l);
        AbstractC2036a.f0(parcel, 2, this.f12156m);
        AbstractC2036a.n0(parcel, 3, 4);
        parcel.writeInt(this.f12157n);
        AbstractC2036a.n0(parcel, 1000, 4);
        parcel.writeInt(this.f12154k);
        AbstractC2036a.m0(parcel, k02);
    }
}
