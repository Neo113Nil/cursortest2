package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zzbkn implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iA0 = Q0.a.a0(parcel);
        long jP = 0;
        boolean zK = false;
        int iN = 0;
        boolean zK2 = false;
        String strN = null;
        byte[] bArrK = null;
        String[] strArrO = null;
        String[] strArrO2 = null;
        while (parcel.dataPosition() < iA0) {
            int i7 = parcel.readInt();
            switch ((char) i7) {
                case 1:
                    zK = Q0.a.K(i7, parcel);
                    break;
                case 2:
                    strN = Q0.a.n(i7, parcel);
                    break;
                case 3:
                    iN = Q0.a.N(i7, parcel);
                    break;
                case 4:
                    bArrK = Q0.a.k(i7, parcel);
                    break;
                case 5:
                    strArrO = Q0.a.o(i7, parcel);
                    break;
                case 6:
                    strArrO2 = Q0.a.o(i7, parcel);
                    break;
                case 7:
                    zK2 = Q0.a.K(i7, parcel);
                    break;
                case '\b':
                    jP = Q0.a.P(i7, parcel);
                    break;
                default:
                    Q0.a.X(i7, parcel);
                    break;
            }
        }
        Q0.a.y(iA0, parcel);
        return new zzbkm(zK, strN, iN, bArrK, strArrO, strArrO2, zK2, jP);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new zzbkm[i7];
    }
}
