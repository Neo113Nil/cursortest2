package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public final class k implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int z = com.google.android.gms.common.internal.safeparcel.b.z(parcel);
        int i = 0;
        Parcel parcel2 = null;
        h hVar = null;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = com.google.android.gms.common.internal.safeparcel.b.t(parcel, readInt);
            } else if (c == 2) {
                int x = com.google.android.gms.common.internal.safeparcel.b.x(parcel, readInt);
                int dataPosition = parcel.dataPosition();
                if (x == 0) {
                    parcel2 = null;
                } else {
                    Parcel obtain = Parcel.obtain();
                    obtain.appendFrom(parcel, dataPosition, x);
                    parcel.setDataPosition(dataPosition + x);
                    parcel2 = obtain;
                }
            } else if (c != 3) {
                com.google.android.gms.common.internal.safeparcel.b.y(parcel, readInt);
            } else {
                hVar = (h) com.google.android.gms.common.internal.safeparcel.b.f(parcel, readInt, h.CREATOR);
            }
        }
        com.google.android.gms.common.internal.safeparcel.b.l(parcel, z);
        return new c(i, parcel2, hVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new c[i];
    }
}
