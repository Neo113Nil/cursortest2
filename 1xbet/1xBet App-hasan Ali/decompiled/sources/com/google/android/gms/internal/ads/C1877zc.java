package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import k4.AbstractC2036a;
import n3.AbstractC2187a;

/* renamed from: com.google.android.gms.internal.ads.zc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1877zc extends AbstractC2187a {
    public static final Parcelable.Creator<C1877zc> CREATOR = new C0730Zb(5);

    /* renamed from: k, reason: collision with root package name */
    public final Q2.X0 f16608k;

    /* renamed from: l, reason: collision with root package name */
    public final String f16609l;

    public C1877zc(Q2.X0 x02, String str) {
        this.f16608k = x02;
        this.f16609l = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k02 = AbstractC2036a.k0(parcel, 20293);
        AbstractC2036a.e0(parcel, 2, this.f16608k, i);
        AbstractC2036a.f0(parcel, 3, this.f16609l);
        AbstractC2036a.m0(parcel, k02);
    }
}
