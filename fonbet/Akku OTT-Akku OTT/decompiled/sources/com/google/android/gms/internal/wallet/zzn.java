package com.google.android.gms.internal.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;
import com.google.android.gms.common.internal.safeparcel.b;

/* loaded from: classes4.dex */
public final class zzn implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int z = b.z(parcel);
        String[] strArr = null;
        int[] iArr = null;
        RemoteViews remoteViews = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                strArr = b.h(parcel, readInt);
            } else if (c == 2) {
                iArr = b.d(parcel, readInt);
            } else if (c == 3) {
                remoteViews = (RemoteViews) b.f(parcel, readInt, RemoteViews.CREATOR);
            } else if (c != 4) {
                b.y(parcel, readInt);
            } else {
                bArr = b.c(parcel, readInt);
            }
        }
        b.l(parcel, z);
        return new zzm(strArr, iArr, remoteViews, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzm[i];
    }
}
