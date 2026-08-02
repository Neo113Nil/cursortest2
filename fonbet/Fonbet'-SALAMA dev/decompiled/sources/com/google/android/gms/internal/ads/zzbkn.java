package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class zzbkn implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int a02 = Q0.a.a0(parcel);
        long j = 0;
        boolean z4 = false;
        int i7 = 0;
        boolean z7 = false;
        String str = null;
        byte[] bArr = null;
        String[] strArr = null;
        String[] strArr2 = null;
        while (parcel.dataPosition() < a02) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    z4 = Q0.a.K(readInt, parcel);
                    break;
                case 2:
                    str = Q0.a.n(readInt, parcel);
                    break;
                case 3:
                    i7 = Q0.a.N(readInt, parcel);
                    break;
                case 4:
                    bArr = Q0.a.k(readInt, parcel);
                    break;
                case 5:
                    strArr = Q0.a.o(readInt, parcel);
                    break;
                case 6:
                    strArr2 = Q0.a.o(readInt, parcel);
                    break;
                case 7:
                    z7 = Q0.a.K(readInt, parcel);
                    break;
                case '\b':
                    j = Q0.a.P(readInt, parcel);
                    break;
                default:
                    Q0.a.X(readInt, parcel);
                    break;
            }
        }
        Q0.a.y(a02, parcel);
        return new zzbkm(z4, str, i7, bArr, strArr, strArr2, z7, j);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new zzbkm[i7];
    }
}
