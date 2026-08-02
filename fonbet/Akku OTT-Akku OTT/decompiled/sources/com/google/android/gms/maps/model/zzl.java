package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class zzl implements Parcelable.Creator<PolygonOptions> {
    @Override // android.os.Parcelable.Creator
    public final PolygonOptions createFromParcel(Parcel parcel) {
        int z = b.z(parcel);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = null;
        float f = 0.0f;
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        int i3 = 0;
        ArrayList arrayList3 = null;
        float f2 = 0.0f;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    arrayList3 = b.k(parcel, readInt, LatLng.CREATOR);
                    break;
                case 3:
                    ClassLoader classLoader = zzl.class.getClassLoader();
                    int x = b.x(parcel, readInt);
                    int dataPosition = parcel.dataPosition();
                    if (x != 0) {
                        parcel.readList(arrayList, classLoader);
                        parcel.setDataPosition(dataPosition + x);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    f2 = b.q(parcel, readInt);
                    break;
                case 5:
                    i = b.t(parcel, readInt);
                    break;
                case 6:
                    i2 = b.t(parcel, readInt);
                    break;
                case 7:
                    f = b.q(parcel, readInt);
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
                    i3 = b.t(parcel, readInt);
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
        return new PolygonOptions(arrayList3, arrayList, f2, i, i2, f, z2, z3, z4, i3, arrayList2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ PolygonOptions[] newArray(int i) {
        return new PolygonOptions[i];
    }
}
