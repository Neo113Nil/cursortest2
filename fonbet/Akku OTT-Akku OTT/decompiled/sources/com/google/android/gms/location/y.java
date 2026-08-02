package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public final class y implements Parcelable.Creator<LocationAvailability> {
    @Override // android.os.Parcelable.Creator
    public final LocationAvailability createFromParcel(Parcel parcel) {
        int z = com.google.android.gms.common.internal.safeparcel.b.z(parcel);
        int i = 1000;
        long j = 0;
        I[] iArr = null;
        int i2 = 1;
        int i3 = 1;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i2 = com.google.android.gms.common.internal.safeparcel.b.t(parcel, readInt);
            } else if (c == 2) {
                i3 = com.google.android.gms.common.internal.safeparcel.b.t(parcel, readInt);
            } else if (c == 3) {
                j = com.google.android.gms.common.internal.safeparcel.b.v(parcel, readInt);
            } else if (c == 4) {
                i = com.google.android.gms.common.internal.safeparcel.b.t(parcel, readInt);
            } else if (c != 5) {
                com.google.android.gms.common.internal.safeparcel.b.y(parcel, readInt);
            } else {
                iArr = (I[]) com.google.android.gms.common.internal.safeparcel.b.j(parcel, readInt, I.CREATOR);
            }
        }
        com.google.android.gms.common.internal.safeparcel.b.l(parcel, z);
        LocationAvailability locationAvailability = new LocationAvailability();
        locationAvailability.d = i;
        locationAvailability.a = i2;
        locationAvailability.b = i3;
        locationAvailability.c = j;
        locationAvailability.e = iArr;
        return locationAvailability;
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationAvailability[] newArray(int i) {
        return new LocationAvailability[i];
    }
}
