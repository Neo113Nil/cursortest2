package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zzbun implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iA0 = Q0.a.a0(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < iA0) {
            int i7 = parcel.readInt();
            if (((char) i7) != 2) {
                Q0.a.X(i7, parcel);
            } else {
                parcelFileDescriptor = (ParcelFileDescriptor) Q0.a.m(parcel, i7, ParcelFileDescriptor.CREATOR);
            }
        }
        Q0.a.y(iA0, parcel);
        return new zzbum(parcelFileDescriptor);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new zzbum[i7];
    }
}
