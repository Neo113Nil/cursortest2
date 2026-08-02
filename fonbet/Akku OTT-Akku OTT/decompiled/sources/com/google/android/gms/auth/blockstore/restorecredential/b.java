package com.google.android.gms.auth.blockstore.restorecredential;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* loaded from: classes4.dex */
public final class b implements Parcelable.Creator<a> {
    @Override // android.os.Parcelable.Creator
    @NonNull
    public final a createFromParcel(@NonNull Parcel parcel) {
        int z = com.google.android.gms.common.internal.safeparcel.b.z(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                com.google.android.gms.common.internal.safeparcel.b.y(parcel, readInt);
            } else {
                bundle = com.google.android.gms.common.internal.safeparcel.b.b(parcel, readInt);
            }
        }
        com.google.android.gms.common.internal.safeparcel.b.l(parcel, z);
        return new a(bundle);
    }

    @Override // android.os.Parcelable.Creator
    @NonNull
    public final a[] newArray(int i) {
        return new a[i];
    }
}
