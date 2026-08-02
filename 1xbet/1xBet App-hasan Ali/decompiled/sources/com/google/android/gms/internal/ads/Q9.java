package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import k4.AbstractC2036a;
import n3.AbstractC2187a;

/* loaded from: classes.dex */
public final class Q9 extends AbstractC2187a {
    public static final Parcelable.Creator<Q9> CREATOR = new C1812y0(26);

    /* renamed from: k, reason: collision with root package name */
    public final String f11187k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f11188l;

    /* renamed from: m, reason: collision with root package name */
    public final int f11189m;

    /* renamed from: n, reason: collision with root package name */
    public final String f11190n;

    public Q9(String str, int i, String str2, boolean z3) {
        this.f11187k = str;
        this.f11188l = z3;
        this.f11189m = i;
        this.f11190n = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k02 = AbstractC2036a.k0(parcel, 20293);
        AbstractC2036a.f0(parcel, 1, this.f11187k);
        AbstractC2036a.n0(parcel, 2, 4);
        parcel.writeInt(this.f11188l ? 1 : 0);
        AbstractC2036a.n0(parcel, 3, 4);
        parcel.writeInt(this.f11189m);
        AbstractC2036a.f0(parcel, 4, this.f11190n);
        AbstractC2036a.m0(parcel, k02);
    }
}
