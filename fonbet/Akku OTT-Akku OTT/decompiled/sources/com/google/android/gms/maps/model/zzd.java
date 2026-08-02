package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.b;

/* loaded from: classes4.dex */
public final class zzd implements Parcelable.Creator<GroundOverlayOptions> {
    @Override // android.os.Parcelable.Creator
    public final GroundOverlayOptions createFromParcel(Parcel parcel) {
        int z = b.z(parcel);
        IBinder iBinder = null;
        LatLng latLng = null;
        LatLngBounds latLngBounds = null;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    iBinder = b.s(parcel, readInt);
                    break;
                case 3:
                    latLng = (LatLng) b.f(parcel, readInt, LatLng.CREATOR);
                    break;
                case 4:
                    f = b.q(parcel, readInt);
                    break;
                case 5:
                    f2 = b.q(parcel, readInt);
                    break;
                case 6:
                    latLngBounds = (LatLngBounds) b.f(parcel, readInt, LatLngBounds.CREATOR);
                    break;
                case 7:
                    f3 = b.q(parcel, readInt);
                    break;
                case '\b':
                    f4 = b.q(parcel, readInt);
                    break;
                case '\t':
                    z2 = b.m(parcel, readInt);
                    break;
                case '\n':
                    f5 = b.q(parcel, readInt);
                    break;
                case 11:
                    f6 = b.q(parcel, readInt);
                    break;
                case '\f':
                    f7 = b.q(parcel, readInt);
                    break;
                case '\r':
                    z3 = b.m(parcel, readInt);
                    break;
                default:
                    b.y(parcel, readInt);
                    break;
            }
        }
        b.l(parcel, z);
        return new GroundOverlayOptions(iBinder, latLng, f, f2, latLngBounds, f3, f4, z2, f5, f6, f7, z3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GroundOverlayOptions[] newArray(int i) {
        return new GroundOverlayOptions[i];
    }
}
