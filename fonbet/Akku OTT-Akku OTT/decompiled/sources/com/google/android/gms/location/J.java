package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public final class J implements Parcelable.Creator<I> {
    @Override // android.os.Parcelable.Creator
    public final I createFromParcel(Parcel parcel) {
        int z = com.google.android.gms.common.internal.safeparcel.b.z(parcel);
        int i = 1;
        int i2 = 1;
        long j = -1;
        long j2 = -1;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = com.google.android.gms.common.internal.safeparcel.b.t(parcel, readInt);
            } else if (c == 2) {
                i2 = com.google.android.gms.common.internal.safeparcel.b.t(parcel, readInt);
            } else if (c == 3) {
                j = com.google.android.gms.common.internal.safeparcel.b.v(parcel, readInt);
            } else if (c != 4) {
                com.google.android.gms.common.internal.safeparcel.b.y(parcel, readInt);
            } else {
                j2 = com.google.android.gms.common.internal.safeparcel.b.v(parcel, readInt);
            }
        }
        com.google.android.gms.common.internal.safeparcel.b.l(parcel, z);
        return new I(i, i2, j, j2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ I[] newArray(int i) {
        return new I[i];
    }
}
