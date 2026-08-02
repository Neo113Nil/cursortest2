package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class zzbun implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int a02 = Q0.a.a0(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < a02) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 2) {
                Q0.a.X(readInt, parcel);
            } else {
                parcelFileDescriptor = (ParcelFileDescriptor) Q0.a.m(parcel, readInt, ParcelFileDescriptor.CREATOR);
            }
        }
        Q0.a.y(a02, parcel);
        return new zzbum(parcelFileDescriptor);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new zzbum[i7];
    }
}
