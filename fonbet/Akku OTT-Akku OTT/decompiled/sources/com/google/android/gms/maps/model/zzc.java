package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class zzc implements Parcelable.Creator<CircleOptions> {
    @Override // android.os.Parcelable.Creator
    public final CircleOptions createFromParcel(Parcel parcel) {
        int z = b.z(parcel);
        LatLng latLng = null;
        ArrayList arrayList = null;
        double d = 0.0d;
        float f = 0.0f;
        float f2 = 0.0f;
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    latLng = (LatLng) b.f(parcel, readInt, LatLng.CREATOR);
                    break;
                case 3:
                    d = b.o(parcel, readInt);
                    break;
                case 4:
                    f = b.q(parcel, readInt);
                    break;
                case 5:
                    i = b.t(parcel, readInt);
                    break;
                case 6:
                    i2 = b.t(parcel, readInt);
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
                    arrayList = b.k(parcel, readInt, PatternItem.CREATOR);
                    break;
                default:
                    b.y(parcel, readInt);
                    break;
            }
        }
        b.l(parcel, z);
        return new CircleOptions(latLng, d, f, i, i2, f2, z2, z3, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CircleOptions[] newArray(int i) {
        return new CircleOptions[i];
    }
}
