package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class zzbvi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int a02 = Q0.a.a0(parcel);
        com.google.android.gms.ads.internal.client.zzm zzmVar = null;
        String str = null;
        while (parcel.dataPosition() < a02) {
            int readInt = parcel.readInt();
            char c3 = (char) readInt;
            if (c3 == 2) {
                zzmVar = (com.google.android.gms.ads.internal.client.zzm) Q0.a.m(parcel, readInt, com.google.android.gms.ads.internal.client.zzm.CREATOR);
            } else if (c3 != 3) {
                Q0.a.X(readInt, parcel);
            } else {
                str = Q0.a.n(readInt, parcel);
            }
        }
        Q0.a.y(a02, parcel);
        return new zzbvh(zzmVar, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new zzbvh[i7];
    }
}
