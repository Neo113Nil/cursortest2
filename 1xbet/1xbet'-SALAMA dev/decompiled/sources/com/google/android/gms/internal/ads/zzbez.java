package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zzbez implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iA0 = Q0.a.a0(parcel);
        int iN = 0;
        boolean zK = false;
        int iN2 = 0;
        boolean zK2 = false;
        int iN3 = 0;
        boolean zK3 = false;
        int iN4 = 0;
        int iN5 = 0;
        boolean zK4 = false;
        int iN6 = 0;
        com.google.android.gms.ads.internal.client.zzfx zzfxVar = null;
        while (parcel.dataPosition() < iA0) {
            int i7 = parcel.readInt();
            switch ((char) i7) {
                case 1:
                    iN = Q0.a.N(i7, parcel);
                    break;
                case 2:
                    zK = Q0.a.K(i7, parcel);
                    break;
                case 3:
                    iN2 = Q0.a.N(i7, parcel);
                    break;
                case 4:
                    zK2 = Q0.a.K(i7, parcel);
                    break;
                case 5:
                    iN3 = Q0.a.N(i7, parcel);
                    break;
                case 6:
                    zzfxVar = (com.google.android.gms.ads.internal.client.zzfx) Q0.a.m(parcel, i7, com.google.android.gms.ads.internal.client.zzfx.CREATOR);
                    break;
                case 7:
                    zK3 = Q0.a.K(i7, parcel);
                    break;
                case '\b':
                    iN4 = Q0.a.N(i7, parcel);
                    break;
                case '\t':
                    iN5 = Q0.a.N(i7, parcel);
                    break;
                case '\n':
                    zK4 = Q0.a.K(i7, parcel);
                    break;
                case 11:
                    iN6 = Q0.a.N(i7, parcel);
                    break;
                default:
                    Q0.a.X(i7, parcel);
                    break;
            }
        }
        Q0.a.y(iA0, parcel);
        return new zzbey(iN, zK, iN2, zK2, iN3, zzfxVar, zK3, iN4, iN5, zK4, iN6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new zzbey[i7];
    }
}
