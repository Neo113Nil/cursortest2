package com.google.android.gms.identitycredentials;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* loaded from: classes4.dex */
public final class q implements Parcelable.Creator<p> {
    @Override // android.os.Parcelable.Creator
    @NonNull
    public final p createFromParcel(@NonNull Parcel parcel) {
        int z = com.google.android.gms.common.internal.safeparcel.b.z(parcel);
        while (parcel.dataPosition() < z) {
            com.google.android.gms.common.internal.safeparcel.b.y(parcel, parcel.readInt());
        }
        com.google.android.gms.common.internal.safeparcel.b.l(parcel, z);
        return new p();
    }

    @Override // android.os.Parcelable.Creator
    @NonNull
    public final p[] newArray(int i) {
        return new p[i];
    }
}
