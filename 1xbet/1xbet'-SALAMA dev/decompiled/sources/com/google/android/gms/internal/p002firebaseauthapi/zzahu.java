package com.google.android.gms.internal.p002firebaseauthapi;

import Q0.a;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zzahu implements Parcelable.Creator<zzahr> {
    @Override // android.os.Parcelable.Creator
    public final zzahr createFromParcel(Parcel parcel) {
        int iA0 = a.a0(parcel);
        String strN = null;
        String strN2 = null;
        String strN3 = null;
        String strN4 = null;
        String strN5 = null;
        String strN6 = null;
        String strN7 = null;
        String strN8 = null;
        String strN9 = null;
        String strN10 = null;
        String strN11 = null;
        String strN12 = null;
        String strN13 = null;
        boolean zK = false;
        boolean zK2 = false;
        boolean zK3 = false;
        while (parcel.dataPosition() < iA0) {
            int i7 = parcel.readInt();
            switch ((char) i7) {
                case 2:
                    strN = a.n(i7, parcel);
                    break;
                case 3:
                    strN2 = a.n(i7, parcel);
                    break;
                case 4:
                    strN3 = a.n(i7, parcel);
                    break;
                case 5:
                    strN4 = a.n(i7, parcel);
                    break;
                case 6:
                    strN5 = a.n(i7, parcel);
                    break;
                case 7:
                    strN6 = a.n(i7, parcel);
                    break;
                case '\b':
                    strN7 = a.n(i7, parcel);
                    break;
                case '\t':
                    strN8 = a.n(i7, parcel);
                    break;
                case '\n':
                    zK = a.K(i7, parcel);
                    break;
                case 11:
                    zK2 = a.K(i7, parcel);
                    break;
                case '\f':
                    strN9 = a.n(i7, parcel);
                    break;
                case '\r':
                    strN10 = a.n(i7, parcel);
                    break;
                case 14:
                    strN11 = a.n(i7, parcel);
                    break;
                case 15:
                    strN12 = a.n(i7, parcel);
                    break;
                case 16:
                    zK3 = a.K(i7, parcel);
                    break;
                case 17:
                    strN13 = a.n(i7, parcel);
                    break;
                default:
                    a.X(i7, parcel);
                    break;
            }
        }
        a.y(iA0, parcel);
        return new zzahr(strN, strN2, strN3, strN4, strN5, strN6, strN7, strN8, zK, zK2, strN9, strN10, strN11, strN12, zK3, strN13);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzahr[] newArray(int i7) {
        return new zzahr[i7];
    }
}
