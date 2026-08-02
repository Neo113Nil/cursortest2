package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.b;

/* loaded from: classes4.dex */
public final class zzq implements Parcelable.Creator<StreetViewPanoramaOrientation> {
    @Override // android.os.Parcelable.Creator
    public final StreetViewPanoramaOrientation createFromParcel(Parcel parcel) {
        int z = b.z(parcel);
        float f = 0.0f;
        float f2 = 0.0f;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                f = b.q(parcel, readInt);
            } else if (c != 3) {
                b.y(parcel, readInt);
            } else {
                f2 = b.q(parcel, readInt);
            }
        }
        b.l(parcel, z);
        return new StreetViewPanoramaOrientation(f, f2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ StreetViewPanoramaOrientation[] newArray(int i) {
        return new StreetViewPanoramaOrientation[i];
    }
}
