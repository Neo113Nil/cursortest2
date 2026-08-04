package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zzbvi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iA0 = Q0.a.a0(parcel);
        com.google.android.gms.ads.internal.client.zzm zzmVar = null;
        String strN = null;
        while (parcel.dataPosition() < iA0) {
            int i7 = parcel.readInt();
            char c3 = (char) i7;
            if (c3 == 2) {
                zzmVar = (com.google.android.gms.ads.internal.client.zzm) Q0.a.m(parcel, i7, com.google.android.gms.ads.internal.client.zzm.CREATOR);
            } else if (c3 != 3) {
                Q0.a.X(i7, parcel);
            } else {
                strN = Q0.a.n(i7, parcel);
            }
        }
        Q0.a.y(iA0, parcel);
        return new zzbvh(zzmVar, strN);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new zzbvh[i7];
    }
}
