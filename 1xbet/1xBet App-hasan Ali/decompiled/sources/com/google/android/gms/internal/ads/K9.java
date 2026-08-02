package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import k4.AbstractC2036a;
import n3.AbstractC2187a;

/* loaded from: classes.dex */
public final class K9 extends AbstractC2187a {
    public static final Parcelable.Creator<K9> CREATOR = new C1812y0(25);

    /* renamed from: k, reason: collision with root package name */
    public final boolean f10132k;

    /* renamed from: l, reason: collision with root package name */
    public final String f10133l;

    /* renamed from: m, reason: collision with root package name */
    public final int f10134m;

    /* renamed from: n, reason: collision with root package name */
    public final byte[] f10135n;

    /* renamed from: o, reason: collision with root package name */
    public final String[] f10136o;

    /* renamed from: p, reason: collision with root package name */
    public final String[] f10137p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f10138q;

    /* renamed from: r, reason: collision with root package name */
    public final long f10139r;

    public K9(boolean z3, String str, int i, byte[] bArr, String[] strArr, String[] strArr2, boolean z5, long j5) {
        this.f10132k = z3;
        this.f10133l = str;
        this.f10134m = i;
        this.f10135n = bArr;
        this.f10136o = strArr;
        this.f10137p = strArr2;
        this.f10138q = z5;
        this.f10139r = j5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k02 = AbstractC2036a.k0(parcel, 20293);
        AbstractC2036a.n0(parcel, 1, 4);
        parcel.writeInt(this.f10132k ? 1 : 0);
        AbstractC2036a.f0(parcel, 2, this.f10133l);
        AbstractC2036a.n0(parcel, 3, 4);
        parcel.writeInt(this.f10134m);
        AbstractC2036a.c0(parcel, 4, this.f10135n);
        AbstractC2036a.g0(parcel, 5, this.f10136o);
        AbstractC2036a.g0(parcel, 6, this.f10137p);
        AbstractC2036a.n0(parcel, 7, 4);
        parcel.writeInt(this.f10138q ? 1 : 0);
        AbstractC2036a.n0(parcel, 8, 8);
        parcel.writeLong(this.f10139r);
        AbstractC2036a.m0(parcel, k02);
    }
}
