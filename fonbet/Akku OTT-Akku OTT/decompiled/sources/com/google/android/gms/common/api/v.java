package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.C0852b;

/* loaded from: classes4.dex */
public final class v implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int z = com.google.android.gms.common.internal.safeparcel.b.z(parcel);
        String str = null;
        C0852b c0852b = null;
        int i = 0;
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = com.google.android.gms.common.internal.safeparcel.b.t(parcel, readInt);
            } else if (c == 2) {
                str = com.google.android.gms.common.internal.safeparcel.b.g(parcel, readInt);
            } else if (c == 3) {
                pendingIntent = (PendingIntent) com.google.android.gms.common.internal.safeparcel.b.f(parcel, readInt, PendingIntent.CREATOR);
            } else if (c != 4) {
                com.google.android.gms.common.internal.safeparcel.b.y(parcel, readInt);
            } else {
                c0852b = (C0852b) com.google.android.gms.common.internal.safeparcel.b.f(parcel, readInt, C0852b.CREATOR);
            }
        }
        com.google.android.gms.common.internal.safeparcel.b.l(parcel, z);
        return new Status(i, str, pendingIntent, c0852b);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new Status[i];
    }
}
