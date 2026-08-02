package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import k4.AbstractC2036a;
import n3.AbstractC2187a;

/* renamed from: com.google.android.gms.internal.ads.wd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1743wd extends AbstractC2187a {
    public static final Parcelable.Creator<C1743wd> CREATOR = new C0730Zb(9);

    /* renamed from: k, reason: collision with root package name */
    public final String f16117k;

    /* renamed from: l, reason: collision with root package name */
    public final String f16118l;

    /* renamed from: m, reason: collision with root package name */
    public final Q2.a1 f16119m;

    /* renamed from: n, reason: collision with root package name */
    public final Q2.X0 f16120n;

    /* renamed from: o, reason: collision with root package name */
    public final int f16121o;

    /* renamed from: p, reason: collision with root package name */
    public final String f16122p;

    public C1743wd(String str, String str2, Q2.a1 a1Var, Q2.X0 x02, int i, String str3) {
        this.f16117k = str;
        this.f16118l = str2;
        this.f16119m = a1Var;
        this.f16120n = x02;
        this.f16121o = i;
        this.f16122p = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k02 = AbstractC2036a.k0(parcel, 20293);
        AbstractC2036a.f0(parcel, 1, this.f16117k);
        AbstractC2036a.f0(parcel, 2, this.f16118l);
        AbstractC2036a.e0(parcel, 3, this.f16119m, i);
        AbstractC2036a.e0(parcel, 4, this.f16120n, i);
        AbstractC2036a.n0(parcel, 5, 4);
        parcel.writeInt(this.f16121o);
        AbstractC2036a.f0(parcel, 6, this.f16122p);
        AbstractC2036a.m0(parcel, k02);
    }
}
