package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zzbtz implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iA0 = Q0.a.a0(parcel);
        String strN = null;
        while (parcel.dataPosition() < iA0) {
            int i7 = parcel.readInt();
            if (((char) i7) != 1) {
                Q0.a.X(i7, parcel);
            } else {
                strN = Q0.a.n(i7, parcel);
            }
        }
        Q0.a.y(iA0, parcel);
        return new zzbty(strN);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new zzbty[i7];
    }
}
