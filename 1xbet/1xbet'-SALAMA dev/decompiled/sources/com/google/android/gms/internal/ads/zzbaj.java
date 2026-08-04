package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zzbaj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iA0 = Q0.a.a0(parcel);
        boolean zK = false;
        int iN = 0;
        String strN = null;
        String strN2 = null;
        String strN3 = null;
        String strN4 = null;
        Bundle bundleJ = null;
        String strN5 = null;
        long jP = 0;
        long jP2 = 0;
        while (parcel.dataPosition() < iA0) {
            int i7 = parcel.readInt();
            switch ((char) i7) {
                case 2:
                    strN = Q0.a.n(i7, parcel);
                    break;
                case 3:
                    jP = Q0.a.P(i7, parcel);
                    break;
                case 4:
                    strN2 = Q0.a.n(i7, parcel);
                    break;
                case 5:
                    strN3 = Q0.a.n(i7, parcel);
                    break;
                case 6:
                    strN4 = Q0.a.n(i7, parcel);
                    break;
                case 7:
                    bundleJ = Q0.a.j(i7, parcel);
                    break;
                case '\b':
                    zK = Q0.a.K(i7, parcel);
                    break;
                case '\t':
                    jP2 = Q0.a.P(i7, parcel);
                    break;
                case '\n':
                    strN5 = Q0.a.n(i7, parcel);
                    break;
                case 11:
                    iN = Q0.a.N(i7, parcel);
                    break;
                default:
                    Q0.a.X(i7, parcel);
                    break;
            }
        }
        Q0.a.y(iA0, parcel);
        return new zzbai(strN, jP, strN2, strN3, strN4, bundleJ, zK, jP2, strN5, iN);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new zzbai[i7];
    }
}
