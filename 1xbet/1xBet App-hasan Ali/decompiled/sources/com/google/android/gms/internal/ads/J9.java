package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import k4.AbstractC2036a;
import n3.AbstractC2187a;

/* loaded from: classes.dex */
public final class J9 extends AbstractC2187a {
    public static final Parcelable.Creator<J9> CREATOR = new C1812y0(24);

    /* renamed from: k, reason: collision with root package name */
    public final String f9871k;

    /* renamed from: l, reason: collision with root package name */
    public final String[] f9872l;

    /* renamed from: m, reason: collision with root package name */
    public final String[] f9873m;

    public J9(String str, String[] strArr, String[] strArr2) {
        this.f9871k = str;
        this.f9872l = strArr;
        this.f9873m = strArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k02 = AbstractC2036a.k0(parcel, 20293);
        AbstractC2036a.f0(parcel, 1, this.f9871k);
        AbstractC2036a.g0(parcel, 2, this.f9872l);
        AbstractC2036a.g0(parcel, 3, this.f9873m);
        AbstractC2036a.m0(parcel, k02);
    }
}
