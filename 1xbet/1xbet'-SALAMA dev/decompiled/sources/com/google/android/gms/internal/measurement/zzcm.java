package com.google.android.gms.internal.measurement;

import Q0.a;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zzcm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iA0 = a.a0(parcel);
        long jP = 0;
        long jP2 = 0;
        boolean zK = false;
        String strN = null;
        String strN2 = null;
        String strN3 = null;
        Bundle bundleJ = null;
        String strN4 = null;
        while (parcel.dataPosition() < iA0) {
            int i7 = parcel.readInt();
            switch ((char) i7) {
                case 1:
                    jP = a.P(i7, parcel);
                    break;
                case 2:
                    jP2 = a.P(i7, parcel);
                    break;
                case 3:
                    zK = a.K(i7, parcel);
                    break;
                case 4:
                    strN = a.n(i7, parcel);
                    break;
                case 5:
                    strN2 = a.n(i7, parcel);
                    break;
                case 6:
                    strN3 = a.n(i7, parcel);
                    break;
                case 7:
                    bundleJ = a.j(i7, parcel);
                    break;
                case '\b':
                    strN4 = a.n(i7, parcel);
                    break;
                default:
                    a.X(i7, parcel);
                    break;
            }
        }
        a.y(iA0, parcel);
        return new zzcl(jP, jP2, zK, strN, strN2, strN3, bundleJ, strN4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new zzcl[i7];
    }
}
