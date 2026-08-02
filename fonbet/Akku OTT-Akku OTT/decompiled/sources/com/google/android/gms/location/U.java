package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public final class U implements Parcelable.Creator<T> {
    @Override // android.os.Parcelable.Creator
    public final T createFromParcel(Parcel parcel) {
        int z = com.google.android.gms.common.internal.safeparcel.b.z(parcel);
        boolean z2 = true;
        long j = 50;
        float f = 0.0f;
        long j2 = Long.MAX_VALUE;
        int i = Integer.MAX_VALUE;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                z2 = com.google.android.gms.common.internal.safeparcel.b.m(parcel, readInt);
            } else if (c == 2) {
                j = com.google.android.gms.common.internal.safeparcel.b.v(parcel, readInt);
            } else if (c == 3) {
                f = com.google.android.gms.common.internal.safeparcel.b.q(parcel, readInt);
            } else if (c == 4) {
                j2 = com.google.android.gms.common.internal.safeparcel.b.v(parcel, readInt);
            } else if (c != 5) {
                com.google.android.gms.common.internal.safeparcel.b.y(parcel, readInt);
            } else {
                i = com.google.android.gms.common.internal.safeparcel.b.t(parcel, readInt);
            }
        }
        com.google.android.gms.common.internal.safeparcel.b.l(parcel, z);
        return new T(z2, j, f, j2, i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ T[] newArray(int i) {
        return new T[i];
    }
}
