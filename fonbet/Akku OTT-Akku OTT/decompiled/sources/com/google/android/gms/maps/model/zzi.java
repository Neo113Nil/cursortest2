package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.b;

/* loaded from: classes4.dex */
public final class zzi implements Parcelable.Creator<MarkerOptions> {
    @Override // android.os.Parcelable.Creator
    public final MarkerOptions createFromParcel(Parcel parcel) {
        int z = b.z(parcel);
        LatLng latLng = null;
        String str = null;
        String str2 = null;
        IBinder iBinder = null;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        float f6 = 0.5f;
        float f7 = 1.0f;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    latLng = (LatLng) b.f(parcel, readInt, LatLng.CREATOR);
                    break;
                case 3:
                    str = b.g(parcel, readInt);
                    break;
                case 4:
                    str2 = b.g(parcel, readInt);
                    break;
                case 5:
                    iBinder = b.s(parcel, readInt);
                    break;
                case 6:
                    f = b.q(parcel, readInt);
                    break;
                case 7:
                    f2 = b.q(parcel, readInt);
                    break;
                case '\b':
                    z2 = b.m(parcel, readInt);
                    break;
                case '\t':
                    z3 = b.m(parcel, readInt);
                    break;
                case '\n':
                    z4 = b.m(parcel, readInt);
                    break;
                case 11:
                    f3 = b.q(parcel, readInt);
                    break;
                case '\f':
                    f6 = b.q(parcel, readInt);
                    break;
                case '\r':
                    f4 = b.q(parcel, readInt);
                    break;
                case 14:
                    f7 = b.q(parcel, readInt);
                    break;
                case 15:
                    f5 = b.q(parcel, readInt);
                    break;
                default:
                    b.y(parcel, readInt);
                    break;
            }
        }
        b.l(parcel, z);
        return new MarkerOptions(latLng, str, str2, iBinder, f, f2, z2, z3, z4, f3, f6, f4, f7, f5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ MarkerOptions[] newArray(int i) {
        return new MarkerOptions[i];
    }
}
