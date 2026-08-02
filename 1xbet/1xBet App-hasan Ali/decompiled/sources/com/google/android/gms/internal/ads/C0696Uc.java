package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import k4.AbstractC2036a;
import n3.AbstractC2187a;

/* renamed from: com.google.android.gms.internal.ads.Uc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0696Uc extends AbstractC2187a {
    public static final Parcelable.Creator<C0696Uc> CREATOR = new C0730Zb(7);

    /* renamed from: k, reason: collision with root package name */
    public final String f11769k;

    /* renamed from: l, reason: collision with root package name */
    public final String f11770l;

    public C0696Uc(String str, String str2) {
        this.f11769k = str;
        this.f11770l = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k02 = AbstractC2036a.k0(parcel, 20293);
        AbstractC2036a.f0(parcel, 1, this.f11769k);
        AbstractC2036a.f0(parcel, 2, this.f11770l);
        AbstractC2036a.m0(parcel, k02);
    }
}
