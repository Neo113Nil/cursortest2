package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zzbag implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iA0 = Q0.a.a0(parcel);
        boolean zK = false;
        boolean zK2 = false;
        boolean zK3 = false;
        long jP = 0;
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < iA0) {
            int i7 = parcel.readInt();
            char c3 = (char) i7;
            if (c3 == 2) {
                parcelFileDescriptor = (ParcelFileDescriptor) Q0.a.m(parcel, i7, ParcelFileDescriptor.CREATOR);
            } else if (c3 == 3) {
                zK = Q0.a.K(i7, parcel);
            } else if (c3 == 4) {
                zK2 = Q0.a.K(i7, parcel);
            } else if (c3 == 5) {
                jP = Q0.a.P(i7, parcel);
            } else if (c3 != 6) {
                Q0.a.X(i7, parcel);
            } else {
                zK3 = Q0.a.K(i7, parcel);
            }
        }
        Q0.a.y(iA0, parcel);
        return new zzbaf(parcelFileDescriptor, zK, zK2, jP, zK3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new zzbaf[i7];
    }
}
