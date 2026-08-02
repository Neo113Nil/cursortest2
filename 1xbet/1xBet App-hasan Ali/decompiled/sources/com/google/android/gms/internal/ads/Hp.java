package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class Hp implements InterfaceC1592t5 {
    public static final Parcelable.Creator<Hp> CREATOR = new C0730Zb(11);

    /* renamed from: k, reason: collision with root package name */
    public final float f9488k;

    /* renamed from: l, reason: collision with root package name */
    public final float f9489l;

    public Hp(float f, float f5) {
        boolean z3 = false;
        if (f >= -90.0f && f <= 90.0f && f5 >= -180.0f && f5 <= 180.0f) {
            z3 = true;
        }
        AbstractC1668us.W("Invalid latitude or longitude", z3);
        this.f9488k = f;
        this.f9489l = f5;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1592t5
    public final /* synthetic */ void d(C1412p4 c1412p4) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Hp.class == obj.getClass()) {
            Hp hp = (Hp) obj;
            if (this.f9488k == hp.f9488k && this.f9489l == hp.f9489l) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f9488k).hashCode() + 527) * 31) + Float.valueOf(this.f9489l).hashCode();
    }

    public final String toString() {
        return "xyz: latitude=" + this.f9488k + ", longitude=" + this.f9489l;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f9488k);
        parcel.writeFloat(this.f9489l);
    }

    public /* synthetic */ Hp(Parcel parcel) {
        this.f9488k = parcel.readFloat();
        this.f9489l = parcel.readFloat();
    }
}
