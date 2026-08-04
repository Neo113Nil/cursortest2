package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zzbyd implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iA0 = Q0.a.a0(parcel);
        String strN = null;
        String strN2 = null;
        com.google.android.gms.ads.internal.client.zzr zzrVar = null;
        com.google.android.gms.ads.internal.client.zzm zzmVar = null;
        String strN3 = null;
        int iN = 0;
        while (parcel.dataPosition() < iA0) {
            int i7 = parcel.readInt();
            switch ((char) i7) {
                case 1:
                    strN = Q0.a.n(i7, parcel);
                    break;
                case 2:
                    strN2 = Q0.a.n(i7, parcel);
                    break;
                case 3:
                    zzrVar = (com.google.android.gms.ads.internal.client.zzr) Q0.a.m(parcel, i7, com.google.android.gms.ads.internal.client.zzr.CREATOR);
                    break;
                case 4:
                    zzmVar = (com.google.android.gms.ads.internal.client.zzm) Q0.a.m(parcel, i7, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    break;
                case 5:
                    iN = Q0.a.N(i7, parcel);
                    break;
                case 6:
                    strN3 = Q0.a.n(i7, parcel);
                    break;
                default:
                    Q0.a.X(i7, parcel);
                    break;
            }
        }
        Q0.a.y(iA0, parcel);
        return new zzbyc(strN, strN2, zzrVar, zzmVar, iN, strN3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new zzbyc[i7];
    }
}
