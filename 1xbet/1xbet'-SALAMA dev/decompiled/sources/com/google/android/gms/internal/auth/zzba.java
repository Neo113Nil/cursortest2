package com.google.android.gms.internal.auth;

import Q0.a;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zzba implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iA0 = a.a0(parcel);
        int iN = 0;
        String strN = null;
        byte[] bArrK = null;
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
                bArrK = a.k(i7, parcel);
            }
        }
        a.y(iA0, parcel);
        return new zzaz(iN, strN, bArrK);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new zzaz[i7];
    }
}
