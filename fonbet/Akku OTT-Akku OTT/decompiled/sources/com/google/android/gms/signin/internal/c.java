package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int z = com.google.android.gms.common.internal.safeparcel.b.z(parcel);
        Intent intent = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = com.google.android.gms.common.internal.safeparcel.b.t(parcel, readInt);
            } else if (c == 2) {
                i2 = com.google.android.gms.common.internal.safeparcel.b.t(parcel, readInt);
            } else if (c != 3) {
                com.google.android.gms.common.internal.safeparcel.b.y(parcel, readInt);
            } else {
                intent = (Intent) com.google.android.gms.common.internal.safeparcel.b.f(parcel, readInt, Intent.CREATOR);
            }
        }
        com.google.android.gms.common.internal.safeparcel.b.l(parcel, z);
        return new b(i, i2, intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new b[i];
    }
}
