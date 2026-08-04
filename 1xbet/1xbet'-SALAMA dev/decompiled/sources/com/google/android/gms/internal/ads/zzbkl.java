package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zzbkl implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iA0 = Q0.a.a0(parcel);
        String strN = null;
        String[] strArrO = null;
        String[] strArrO2 = null;
        while (parcel.dataPosition() < iA0) {
            int i7 = parcel.readInt();
            char c3 = (char) i7;
            if (c3 == 1) {
                strN = Q0.a.n(i7, parcel);
            } else if (c3 == 2) {
                strArrO = Q0.a.o(i7, parcel);
            } else if (c3 != 3) {
                Q0.a.X(i7, parcel);
            } else {
                strArrO2 = Q0.a.o(i7, parcel);
            }
        }
        Q0.a.y(iA0, parcel);
        return new zzbkk(strN, strArrO, strArrO2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new zzbkk[i7];
    }
}
