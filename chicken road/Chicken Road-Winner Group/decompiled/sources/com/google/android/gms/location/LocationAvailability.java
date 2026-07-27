package com.google.android.gms.location;

import F2.b;
import H.j;
import T0.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import f1.c;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class LocationAvailability extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new j(21);

    /* renamed from: a, reason: collision with root package name */
    public int f2859a;

    /* renamed from: b, reason: collision with root package name */
    public int f2860b;

    /* renamed from: c, reason: collision with root package name */
    public long f2861c;

    /* renamed from: d, reason: collision with root package name */
    public int f2862d;

    /* renamed from: e, reason: collision with root package name */
    public c[] f2863e;

    public final boolean equals(Object obj) {
        if (obj instanceof LocationAvailability) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            if (this.f2859a == locationAvailability.f2859a && this.f2860b == locationAvailability.f2860b && this.f2861c == locationAvailability.f2861c && this.f2862d == locationAvailability.f2862d && Arrays.equals(this.f2863e, locationAvailability.f2863e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2862d), Integer.valueOf(this.f2859a), Integer.valueOf(this.f2860b), Long.valueOf(this.f2861c), this.f2863e});
    }

    public final String toString() {
        boolean z3 = this.f2862d < 1000;
        StringBuilder sb = new StringBuilder(48);
        sb.append("LocationAvailability[isLocationAvailable: ");
        sb.append(z3);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int Q2 = b.Q(parcel, 20293);
        b.S(parcel, 1, 4);
        parcel.writeInt(this.f2859a);
        b.S(parcel, 2, 4);
        parcel.writeInt(this.f2860b);
        b.S(parcel, 3, 8);
        parcel.writeLong(this.f2861c);
        b.S(parcel, 4, 4);
        parcel.writeInt(this.f2862d);
        b.O(parcel, 5, this.f2863e, i3);
        b.R(parcel, Q2);
    }
}
