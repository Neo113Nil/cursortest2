package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zzfcv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iA0 = Q0.a.a0(parcel);
        int iN = 0;
        int iN2 = 0;
        int iN3 = 0;
        int iN4 = 0;
        int iN5 = 0;
        int iN6 = 0;
        String strN = null;
        while (parcel.dataPosition() < iA0) {
            int i7 = parcel.readInt();
            switch ((char) i7) {
                case 1:
                    iN = Q0.a.N(i7, parcel);
                    break;
                case 2:
                    iN2 = Q0.a.N(i7, parcel);
                    break;
                case 3:
                    iN3 = Q0.a.N(i7, parcel);
                    break;
                case 4:
                    iN4 = Q0.a.N(i7, parcel);
                    break;
                case 5:
                    strN = Q0.a.n(i7, parcel);
                    break;
                case 6:
                    iN5 = Q0.a.N(i7, parcel);
                    break;
                case 7:
                    iN6 = Q0.a.N(i7, parcel);
                    break;
                default:
                    Q0.a.X(i7, parcel);
                    break;
            }
        }
        Q0.a.y(iA0, parcel);
        return new zzfcu(iN, iN2, iN3, iN4, strN, iN5, iN6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new zzfcu[i7];
    }
}
