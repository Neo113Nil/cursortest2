package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.b;

/* loaded from: classes4.dex */
public final class zzr implements Parcelable.Creator<StreetViewSource> {
    @Override // android.os.Parcelable.Creator
    public final StreetViewSource createFromParcel(Parcel parcel) {
        int z = b.z(parcel);
        int i = 0;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 2) {
                b.y(parcel, readInt);
            } else {
                i = b.t(parcel, readInt);
            }
        }
        b.l(parcel, z);
        return new StreetViewSource(i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ StreetViewSource[] newArray(int i) {
        return new StreetViewSource[i];
    }
}
