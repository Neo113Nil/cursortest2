package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import k4.AbstractC2036a;
import n3.AbstractC2187a;

/* renamed from: com.google.android.gms.internal.ads.ub, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1651ub extends AbstractC2187a {
    public static final Parcelable.Creator<C1651ub> CREATOR = new C1812y0(29);

    /* renamed from: k, reason: collision with root package name */
    public final int f15863k;

    /* renamed from: l, reason: collision with root package name */
    public final int f15864l;

    /* renamed from: m, reason: collision with root package name */
    public final int f15865m;

    public C1651ub(int i, int i5, int i6) {
        this.f15863k = i;
        this.f15864l = i5;
        this.f15865m = i6;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C1651ub)) {
            C1651ub c1651ub = (C1651ub) obj;
            if (c1651ub.f15865m == this.f15865m && c1651ub.f15864l == this.f15864l && c1651ub.f15863k == this.f15863k) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new int[]{this.f15863k, this.f15864l, this.f15865m});
    }

    public final String toString() {
        return this.f15863k + "." + this.f15864l + "." + this.f15865m;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k02 = AbstractC2036a.k0(parcel, 20293);
        AbstractC2036a.n0(parcel, 1, 4);
        parcel.writeInt(this.f15863k);
        AbstractC2036a.n0(parcel, 2, 4);
        parcel.writeInt(this.f15864l);
        AbstractC2036a.n0(parcel, 3, 4);
        parcel.writeInt(this.f15865m);
        AbstractC2036a.m0(parcel, k02);
    }
}
