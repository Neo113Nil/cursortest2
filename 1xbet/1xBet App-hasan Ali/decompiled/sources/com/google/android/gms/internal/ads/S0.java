package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes.dex */
public final class S0 implements Parcelable {
    public static final Parcelable.Creator<S0> CREATOR = new C1812y0(17);

    /* renamed from: k, reason: collision with root package name */
    public final long f11480k;

    /* renamed from: l, reason: collision with root package name */
    public final long f11481l;

    /* renamed from: m, reason: collision with root package name */
    public final int f11482m;

    public S0(int i, long j5, long j6) {
        AbstractC1668us.S(j5 < j6);
        this.f11480k = j5;
        this.f11481l = j6;
        this.f11482m = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && S0.class == obj.getClass()) {
            S0 s02 = (S0) obj;
            if (this.f11480k == s02.f11480k && this.f11481l == s02.f11481l && this.f11482m == s02.f11482m) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f11480k), Long.valueOf(this.f11481l), Integer.valueOf(this.f11482m)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        return "Segment: startTimeMs=" + this.f11480k + ", endTimeMs=" + this.f11481l + ", speedDivisor=" + this.f11482m;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f11480k);
        parcel.writeLong(this.f11481l);
        parcel.writeInt(this.f11482m);
    }
}
