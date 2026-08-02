package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public final class r implements Parcelable.Creator {
    public static final r a = new r();

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int dataPosition = parcel.dataPosition();
        if (parcel.readInt() != -204102970) {
            parcel.setDataPosition(dataPosition - 4);
            return c.b;
        }
        int z = com.google.android.gms.common.internal.safeparcel.b.z(parcel);
        e eVar = null;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                com.google.android.gms.common.internal.safeparcel.b.y(parcel, readInt);
            } else {
                eVar = (e) com.google.android.gms.common.internal.safeparcel.b.f(parcel, readInt, e.CREATOR);
            }
        }
        com.google.android.gms.common.internal.safeparcel.b.l(parcel, z);
        return new c(eVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new c[i];
    }
}
