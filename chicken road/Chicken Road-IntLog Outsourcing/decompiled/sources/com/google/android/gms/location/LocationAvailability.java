package com.google.android.gms.location;

import B1.c;
import E1.g;
import a.AbstractC0169a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import p1.AbstractC1380a;

/* loaded from: classes.dex */
public final class LocationAvailability extends AbstractC1380a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new c(2);

    /* renamed from: a, reason: collision with root package name */
    public int f5296a;

    /* renamed from: b, reason: collision with root package name */
    public int f5297b;

    /* renamed from: c, reason: collision with root package name */
    public long f5298c;

    /* renamed from: d, reason: collision with root package name */
    public int f5299d;

    /* renamed from: e, reason: collision with root package name */
    public g[] f5300e;

    public final boolean equals(Object obj) {
        if (obj instanceof LocationAvailability) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            if (this.f5296a == locationAvailability.f5296a && this.f5297b == locationAvailability.f5297b && this.f5298c == locationAvailability.f5298c && this.f5299d == locationAvailability.f5299d && Arrays.equals(this.f5300e, locationAvailability.f5300e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f5299d), Integer.valueOf(this.f5296a), Integer.valueOf(this.f5297b), Long.valueOf(this.f5298c), this.f5300e});
    }

    public final String toString() {
        boolean z = this.f5299d < 1000;
        StringBuilder sb = new StringBuilder(48);
        sb.append("LocationAvailability[isLocationAvailable: ");
        sb.append(z);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int R5 = AbstractC0169a.R(parcel, 20293);
        AbstractC0169a.T(parcel, 1, 4);
        parcel.writeInt(this.f5296a);
        AbstractC0169a.T(parcel, 2, 4);
        parcel.writeInt(this.f5297b);
        AbstractC0169a.T(parcel, 3, 8);
        parcel.writeLong(this.f5298c);
        AbstractC0169a.T(parcel, 4, 4);
        parcel.writeInt(this.f5299d);
        AbstractC0169a.P(parcel, 5, this.f5300e, i2);
        AbstractC0169a.S(parcel, R5);
    }
}
