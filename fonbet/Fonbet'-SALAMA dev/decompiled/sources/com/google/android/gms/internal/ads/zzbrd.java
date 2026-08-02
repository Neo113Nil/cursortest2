package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class zzbrd implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int a02 = Q0.a.a0(parcel);
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (parcel.dataPosition() < a02) {
            int readInt = parcel.readInt();
            char c3 = (char) readInt;
            if (c3 == 1) {
                i7 = Q0.a.N(readInt, parcel);
            } else if (c3 == 2) {
                i8 = Q0.a.N(readInt, parcel);
            } else if (c3 != 3) {
                Q0.a.X(readInt, parcel);
            } else {
                i9 = Q0.a.N(readInt, parcel);
            }
        }
        Q0.a.y(a02, parcel);
        return new zzbrc(i7, i8, i9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new zzbrc[i7];
    }
}
