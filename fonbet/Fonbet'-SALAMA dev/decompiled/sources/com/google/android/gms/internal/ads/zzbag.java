package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class zzbag implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int a02 = Q0.a.a0(parcel);
        boolean z4 = false;
        boolean z7 = false;
        boolean z8 = false;
        long j = 0;
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < a02) {
            int readInt = parcel.readInt();
            char c3 = (char) readInt;
            if (c3 == 2) {
                parcelFileDescriptor = (ParcelFileDescriptor) Q0.a.m(parcel, readInt, ParcelFileDescriptor.CREATOR);
            } else if (c3 == 3) {
                z4 = Q0.a.K(readInt, parcel);
            } else if (c3 == 4) {
                z7 = Q0.a.K(readInt, parcel);
            } else if (c3 == 5) {
                j = Q0.a.P(readInt, parcel);
            } else if (c3 != 6) {
                Q0.a.X(readInt, parcel);
            } else {
                z8 = Q0.a.K(readInt, parcel);
            }
        }
        Q0.a.y(a02, parcel);
        return new zzbaf(parcelFileDescriptor, z4, z7, j, z8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new zzbaf[i7];
    }
}
