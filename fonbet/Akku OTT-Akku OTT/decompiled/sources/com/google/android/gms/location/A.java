package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes4.dex */
public final class A implements Parcelable.Creator<LocationResult> {
    @Override // android.os.Parcelable.Creator
    public final LocationResult createFromParcel(Parcel parcel) {
        int z = com.google.android.gms.common.internal.safeparcel.b.z(parcel);
        List<Location> list = LocationResult.b;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                com.google.android.gms.common.internal.safeparcel.b.y(parcel, readInt);
            } else {
                list = com.google.android.gms.common.internal.safeparcel.b.k(parcel, readInt, Location.CREATOR);
            }
        }
        com.google.android.gms.common.internal.safeparcel.b.l(parcel, z);
        return new LocationResult(list);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationResult[] newArray(int i) {
        return new LocationResult[i];
    }
}
