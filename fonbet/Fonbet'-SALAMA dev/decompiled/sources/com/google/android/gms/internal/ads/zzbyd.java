package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class zzbyd implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int a02 = Q0.a.a0(parcel);
        String str = null;
        String str2 = null;
        com.google.android.gms.ads.internal.client.zzr zzrVar = null;
        com.google.android.gms.ads.internal.client.zzm zzmVar = null;
        String str3 = null;
        int i7 = 0;
        while (parcel.dataPosition() < a02) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    str = Q0.a.n(readInt, parcel);
                    break;
                case 2:
                    str2 = Q0.a.n(readInt, parcel);
                    break;
                case 3:
                    zzrVar = (com.google.android.gms.ads.internal.client.zzr) Q0.a.m(parcel, readInt, com.google.android.gms.ads.internal.client.zzr.CREATOR);
                    break;
                case 4:
                    zzmVar = (com.google.android.gms.ads.internal.client.zzm) Q0.a.m(parcel, readInt, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    break;
                case 5:
                    i7 = Q0.a.N(readInt, parcel);
                    break;
                case 6:
                    str3 = Q0.a.n(readInt, parcel);
                    break;
                default:
                    Q0.a.X(readInt, parcel);
                    break;
            }
        }
        Q0.a.y(a02, parcel);
        return new zzbyc(str, str2, zzrVar, zzmVar, i7, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new zzbyc[i7];
    }
}
