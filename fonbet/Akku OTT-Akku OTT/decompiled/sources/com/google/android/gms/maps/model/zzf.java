package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.b;

/* loaded from: classes4.dex */
public final class zzf implements Parcelable.Creator<LatLngBounds> {
    @Override // android.os.Parcelable.Creator
    public final LatLngBounds createFromParcel(Parcel parcel) {
        int z = b.z(parcel);
        LatLng latLng = null;
        LatLng latLng2 = null;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                latLng = (LatLng) b.f(parcel, readInt, LatLng.CREATOR);
            } else if (c != 3) {
                b.y(parcel, readInt);
            } else {
                latLng2 = (LatLng) b.f(parcel, readInt, LatLng.CREATOR);
            }
        }
        b.l(parcel, z);
        return new LatLngBounds(latLng, latLng2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LatLngBounds[] newArray(int i) {
        return new LatLngBounds[i];
    }
}
