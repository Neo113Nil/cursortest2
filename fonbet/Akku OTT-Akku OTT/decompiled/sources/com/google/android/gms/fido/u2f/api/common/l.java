package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public final class l implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int z = com.google.android.gms.common.internal.safeparcel.b.z(parcel);
        b bVar = null;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                bVar = (b) com.google.android.gms.common.internal.safeparcel.b.f(parcel, readInt, b.CREATOR);
            } else if (c == 3) {
                str = com.google.android.gms.common.internal.safeparcel.b.g(parcel, readInt);
            } else if (c != 4) {
                com.google.android.gms.common.internal.safeparcel.b.y(parcel, readInt);
            } else {
                str2 = com.google.android.gms.common.internal.safeparcel.b.g(parcel, readInt);
            }
        }
        com.google.android.gms.common.internal.safeparcel.b.l(parcel, z);
        return new e(bVar, str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new e[i];
    }
}
