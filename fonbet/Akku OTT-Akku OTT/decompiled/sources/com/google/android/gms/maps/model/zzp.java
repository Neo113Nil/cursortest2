package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.b;

/* loaded from: classes4.dex */
public final class zzp implements Parcelable.Creator<StreetViewPanoramaLocation> {
    @Override // android.os.Parcelable.Creator
    public final StreetViewPanoramaLocation createFromParcel(Parcel parcel) {
        int z = b.z(parcel);
        StreetViewPanoramaLink[] streetViewPanoramaLinkArr = null;
        LatLng latLng = null;
        String str = null;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                streetViewPanoramaLinkArr = (StreetViewPanoramaLink[]) b.j(parcel, readInt, StreetViewPanoramaLink.CREATOR);
            } else if (c == 3) {
                latLng = (LatLng) b.f(parcel, readInt, LatLng.CREATOR);
            } else if (c != 4) {
                b.y(parcel, readInt);
            } else {
                str = b.g(parcel, readInt);
            }
        }
        b.l(parcel, z);
        return new StreetViewPanoramaLocation(streetViewPanoramaLinkArr, latLng, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ StreetViewPanoramaLocation[] newArray(int i) {
        return new StreetViewPanoramaLocation[i];
    }
}
