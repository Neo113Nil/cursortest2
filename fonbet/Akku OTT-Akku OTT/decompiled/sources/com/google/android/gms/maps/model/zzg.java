package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.b;

/* loaded from: classes4.dex */
public final class zzg implements Parcelable.Creator<LatLng> {
    @Override // android.os.Parcelable.Creator
    public final LatLng createFromParcel(Parcel parcel) {
        int z = b.z(parcel);
        double d = 0.0d;
        double d2 = 0.0d;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                d = b.o(parcel, readInt);
            } else if (c != 3) {
                b.y(parcel, readInt);
            } else {
                d2 = b.o(parcel, readInt);
            }
        }
        b.l(parcel, z);
        return new LatLng(d, d2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LatLng[] newArray(int i) {
        return new LatLng[i];
    }
}
