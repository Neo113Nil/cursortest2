package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import k4.AbstractC2036a;
import n3.AbstractC2187a;

/* renamed from: com.google.android.gms.internal.ads.gc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1025gc extends AbstractC2187a {
    public static final Parcelable.Creator<C1025gc> CREATOR = new C0730Zb(3);

    /* renamed from: k, reason: collision with root package name */
    public final String f13589k;

    public C1025gc(String str) {
        this.f13589k = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k02 = AbstractC2036a.k0(parcel, 20293);
        AbstractC2036a.f0(parcel, 1, this.f13589k);
        AbstractC2036a.m0(parcel, k02);
    }
}
