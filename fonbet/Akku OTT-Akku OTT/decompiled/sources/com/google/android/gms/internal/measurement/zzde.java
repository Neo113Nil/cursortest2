package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.b;

/* loaded from: classes4.dex */
public final class zzde implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int z = b.z(parcel);
        Bundle bundle = null;
        String str = null;
        boolean z2 = false;
        long j = 0;
        long j2 = 0;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                j = b.v(parcel, readInt);
            } else if (c == 2) {
                j2 = b.v(parcel, readInt);
            } else if (c == 3) {
                z2 = b.m(parcel, readInt);
            } else if (c == 7) {
                bundle = b.b(parcel, readInt);
            } else if (c != '\b') {
                b.y(parcel, readInt);
            } else {
                str = b.g(parcel, readInt);
            }
        }
        b.l(parcel, z);
        return new zzdd(j, j2, z2, bundle, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzdd[i];
    }
}
