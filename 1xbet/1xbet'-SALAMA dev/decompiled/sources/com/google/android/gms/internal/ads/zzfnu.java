package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zzfnu implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iA0 = Q0.a.a0(parcel);
        int iN = 0;
        byte[] bArrK = null;
        int iN2 = 0;
        while (parcel.dataPosition() < iA0) {
            int i7 = parcel.readInt();
            char c3 = (char) i7;
            if (c3 == 1) {
                iN = Q0.a.N(i7, parcel);
            } else if (c3 == 2) {
                bArrK = Q0.a.k(i7, parcel);
            } else if (c3 != 3) {
                Q0.a.X(i7, parcel);
            } else {
                iN2 = Q0.a.N(i7, parcel);
            }
        }
        Q0.a.y(iA0, parcel);
        return new zzfnt(iN, bArrK, iN2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new zzfnt[i7];
    }
}
