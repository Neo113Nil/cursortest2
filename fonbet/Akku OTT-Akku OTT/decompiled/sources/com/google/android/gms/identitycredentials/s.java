package com.google.android.gms.identitycredentials;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* loaded from: classes4.dex */
public final class s implements Parcelable.Creator<r> {
    @Override // android.os.Parcelable.Creator
    @NonNull
    public final r createFromParcel(@NonNull Parcel parcel) {
        int z = com.google.android.gms.common.internal.safeparcel.b.z(parcel);
        while (parcel.dataPosition() < z) {
            com.google.android.gms.common.internal.safeparcel.b.y(parcel, parcel.readInt());
        }
        com.google.android.gms.common.internal.safeparcel.b.l(parcel, z);
        return new r();
    }

    @Override // android.os.Parcelable.Creator
    @NonNull
    public final r[] newArray(int i) {
        return new r[i];
    }
}
