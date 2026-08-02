package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int z = com.google.android.gms.common.internal.safeparcel.b.z(parcel);
        Bundle bundle = null;
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
                bundle = com.google.android.gms.common.internal.safeparcel.b.b(parcel, readInt);
            }
        }
        com.google.android.gms.common.internal.safeparcel.b.l(parcel, z);
        return new a(i, i2, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new a[i];
    }
}
