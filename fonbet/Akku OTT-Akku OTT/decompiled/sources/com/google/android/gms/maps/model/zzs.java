package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.b;

/* loaded from: classes4.dex */
public final class zzs implements Parcelable.Creator<Tile> {
    @Override // android.os.Parcelable.Creator
    public final Tile createFromParcel(Parcel parcel) {
        int z = b.z(parcel);
        int i = 0;
        byte[] bArr = null;
        int i2 = 0;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                i = b.t(parcel, readInt);
            } else if (c == 3) {
                i2 = b.t(parcel, readInt);
            } else if (c != 4) {
                b.y(parcel, readInt);
            } else {
                bArr = b.c(parcel, readInt);
            }
        }
        b.l(parcel, z);
        return new Tile(i, i2, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Tile[] newArray(int i) {
        return new Tile[i];
    }
}
