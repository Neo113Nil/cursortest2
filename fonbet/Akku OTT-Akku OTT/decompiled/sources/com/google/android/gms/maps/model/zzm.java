package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class zzm implements Parcelable.Creator<PolylineOptions> {
    @Override // android.os.Parcelable.Creator
    public final PolylineOptions createFromParcel(Parcel parcel) {
        int z = b.z(parcel);
        ArrayList arrayList = null;
        Cap cap = null;
        Cap cap2 = null;
        ArrayList arrayList2 = null;
        float f = 0.0f;
        float f2 = 0.0f;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        int i2 = 0;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    arrayList = b.k(parcel, readInt, LatLng.CREATOR);
                    break;
                case 3:
                    f = b.q(parcel, readInt);
                    break;
                case 4:
                    i = b.t(parcel, readInt);
                    break;
                case 5:
                    f2 = b.q(parcel, readInt);
                    break;
                case 6:
                    z2 = b.m(parcel, readInt);
                    break;
                case 7:
                    z3 = b.m(parcel, readInt);
                    break;
                case '\b':
                    z4 = b.m(parcel, readInt);
                    break;
                case '\t':
                    cap = (Cap) b.f(parcel, readInt, Cap.CREATOR);
                    break;
                case '\n':
                    cap2 = (Cap) b.f(parcel, readInt, Cap.CREATOR);
                    break;
                case 11:
                    i2 = b.t(parcel, readInt);
                    break;
                case '\f':
                    arrayList2 = b.k(parcel, readInt, PatternItem.CREATOR);
                    break;
                default:
                    b.y(parcel, readInt);
                    break;
            }
        }
        b.l(parcel, z);
        return new PolylineOptions(arrayList, f, i, f2, z2, z3, z4, cap, cap2, i2, arrayList2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ PolylineOptions[] newArray(int i) {
        return new PolylineOptions[i];
    }
}
