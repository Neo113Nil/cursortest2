package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class H0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int z = com.google.android.gms.common.internal.safeparcel.b.z(parcel);
        ArrayList arrayList = null;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                com.google.android.gms.common.internal.safeparcel.b.y(parcel, readInt);
            } else {
                arrayList = com.google.android.gms.common.internal.safeparcel.b.k(parcel, readInt, E0.CREATOR);
            }
        }
        com.google.android.gms.common.internal.safeparcel.b.l(parcel, z);
        return new G0(arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new G0[i];
    }
}
