package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class zzbez implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int a02 = Q0.a.a0(parcel);
        int i7 = 0;
        boolean z4 = false;
        int i8 = 0;
        boolean z7 = false;
        int i9 = 0;
        boolean z8 = false;
        int i10 = 0;
        int i11 = 0;
        boolean z9 = false;
        int i12 = 0;
        com.google.android.gms.ads.internal.client.zzfx zzfxVar = null;
        while (parcel.dataPosition() < a02) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i7 = Q0.a.N(readInt, parcel);
                    break;
                case 2:
                    z4 = Q0.a.K(readInt, parcel);
                    break;
                case 3:
                    i8 = Q0.a.N(readInt, parcel);
                    break;
                case 4:
                    z7 = Q0.a.K(readInt, parcel);
                    break;
                case 5:
                    i9 = Q0.a.N(readInt, parcel);
                    break;
                case 6:
                    zzfxVar = (com.google.android.gms.ads.internal.client.zzfx) Q0.a.m(parcel, readInt, com.google.android.gms.ads.internal.client.zzfx.CREATOR);
                    break;
                case 7:
                    z8 = Q0.a.K(readInt, parcel);
                    break;
                case '\b':
                    i10 = Q0.a.N(readInt, parcel);
                    break;
                case '\t':
                    i11 = Q0.a.N(readInt, parcel);
                    break;
                case '\n':
                    z9 = Q0.a.K(readInt, parcel);
                    break;
                case 11:
                    i12 = Q0.a.N(readInt, parcel);
                    break;
                default:
                    Q0.a.X(readInt, parcel);
                    break;
            }
        }
        Q0.a.y(a02, parcel);
        return new zzbey(i7, z4, i8, z7, i9, zzfxVar, z8, i10, i11, z9, i12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new zzbey[i7];
    }
}
