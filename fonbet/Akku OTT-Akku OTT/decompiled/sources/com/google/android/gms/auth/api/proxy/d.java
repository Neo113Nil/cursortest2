package com.google.android.gms.auth.api.proxy;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public final class d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int z = com.google.android.gms.common.internal.safeparcel.b.z(parcel);
        PendingIntent pendingIntent = null;
        Bundle bundle = null;
        byte[] bArr = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i2 = com.google.android.gms.common.internal.safeparcel.b.t(parcel, readInt);
            } else if (c == 2) {
                pendingIntent = (PendingIntent) com.google.android.gms.common.internal.safeparcel.b.f(parcel, readInt, PendingIntent.CREATOR);
            } else if (c == 3) {
                i3 = com.google.android.gms.common.internal.safeparcel.b.t(parcel, readInt);
            } else if (c == 4) {
                bundle = com.google.android.gms.common.internal.safeparcel.b.b(parcel, readInt);
            } else if (c == 5) {
                bArr = com.google.android.gms.common.internal.safeparcel.b.c(parcel, readInt);
            } else if (c != 1000) {
                com.google.android.gms.common.internal.safeparcel.b.y(parcel, readInt);
            } else {
                i = com.google.android.gms.common.internal.safeparcel.b.t(parcel, readInt);
            }
        }
        com.google.android.gms.common.internal.safeparcel.b.l(parcel, z);
        return new b(i, i2, pendingIntent, i3, bundle, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new b[i];
    }
}
