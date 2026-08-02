package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public final class E implements Parcelable.Creator<D> {
    @Override // android.os.Parcelable.Creator
    public final D createFromParcel(Parcel parcel) {
        int z = com.google.android.gms.common.internal.safeparcel.b.z(parcel);
        String str = "";
        String str2 = "";
        String str3 = str2;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                str2 = com.google.android.gms.common.internal.safeparcel.b.g(parcel, readInt);
            } else if (c == 2) {
                str3 = com.google.android.gms.common.internal.safeparcel.b.g(parcel, readInt);
            } else if (c != 5) {
                com.google.android.gms.common.internal.safeparcel.b.y(parcel, readInt);
            } else {
                str = com.google.android.gms.common.internal.safeparcel.b.g(parcel, readInt);
            }
        }
        com.google.android.gms.common.internal.safeparcel.b.l(parcel, z);
        return new D(str, str2, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ D[] newArray(int i) {
        return new D[i];
    }
}
