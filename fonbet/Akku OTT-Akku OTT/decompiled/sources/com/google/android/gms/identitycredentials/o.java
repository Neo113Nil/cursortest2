package com.google.android.gms.identitycredentials;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* loaded from: classes4.dex */
public final class o implements Parcelable.Creator<n> {
    @Override // android.os.Parcelable.Creator
    @NonNull
    public final n createFromParcel(@NonNull Parcel parcel) {
        int z = com.google.android.gms.common.internal.safeparcel.b.z(parcel);
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                com.google.android.gms.common.internal.safeparcel.b.y(parcel, readInt);
            } else {
                pendingIntent = (PendingIntent) com.google.android.gms.common.internal.safeparcel.b.f(parcel, readInt, PendingIntent.CREATOR);
            }
        }
        com.google.android.gms.common.internal.safeparcel.b.l(parcel, z);
        return new n(pendingIntent);
    }

    @Override // android.os.Parcelable.Creator
    @NonNull
    public final n[] newArray(int i) {
        return new n[i];
    }
}
