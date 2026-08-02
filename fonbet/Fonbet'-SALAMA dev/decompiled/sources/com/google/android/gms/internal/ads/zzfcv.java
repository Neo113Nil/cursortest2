package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class zzfcv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int a02 = Q0.a.a0(parcel);
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        String str = null;
        while (parcel.dataPosition() < a02) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i7 = Q0.a.N(readInt, parcel);
                    break;
                case 2:
                    i8 = Q0.a.N(readInt, parcel);
                    break;
                case 3:
                    i9 = Q0.a.N(readInt, parcel);
                    break;
                case 4:
                    i10 = Q0.a.N(readInt, parcel);
                    break;
                case 5:
                    str = Q0.a.n(readInt, parcel);
                    break;
                case 6:
                    i11 = Q0.a.N(readInt, parcel);
                    break;
                case 7:
                    i12 = Q0.a.N(readInt, parcel);
                    break;
                default:
                    Q0.a.X(readInt, parcel);
                    break;
            }
        }
        Q0.a.y(a02, parcel);
        return new zzfcu(i7, i8, i9, i10, str, i11, i12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new zzfcu[i7];
    }
}
