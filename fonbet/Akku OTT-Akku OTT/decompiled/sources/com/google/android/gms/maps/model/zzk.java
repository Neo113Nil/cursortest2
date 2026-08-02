package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.b;

/* loaded from: classes4.dex */
public final class zzk implements Parcelable.Creator<PointOfInterest> {
    @Override // android.os.Parcelable.Creator
    public final PointOfInterest createFromParcel(Parcel parcel) {
        int z = b.z(parcel);
        LatLng latLng = null;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                latLng = (LatLng) b.f(parcel, readInt, LatLng.CREATOR);
            } else if (c == 3) {
                str = b.g(parcel, readInt);
            } else if (c != 4) {
                b.y(parcel, readInt);
            } else {
                str2 = b.g(parcel, readInt);
            }
        }
        b.l(parcel, z);
        return new PointOfInterest(latLng, str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ PointOfInterest[] newArray(int i) {
        return new PointOfInterest[i];
    }
}
