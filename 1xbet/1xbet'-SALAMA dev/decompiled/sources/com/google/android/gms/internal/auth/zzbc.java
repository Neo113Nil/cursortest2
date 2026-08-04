package com.google.android.gms.internal.auth;

import Q0.a;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zzbc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iA0 = a.a0(parcel);
        int iN = 0;
        String strN = null;
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < iA0) {
            int i7 = parcel.readInt();
            char c3 = (char) i7;
            if (c3 == 1) {
                iN = a.N(i7, parcel);
            } else if (c3 == 2) {
                strN = a.n(i7, parcel);
            } else if (c3 != 3) {
                a.X(i7, parcel);
            } else {
                pendingIntent = (PendingIntent) a.m(parcel, i7, PendingIntent.CREATOR);
            }
        }
        a.y(iA0, parcel);
        return new zzbb(iN, strN, pendingIntent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new zzbb[i7];
    }
}
