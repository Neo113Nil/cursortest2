package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class zzfnl implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int a02 = Q0.a.a0(parcel);
        byte[] bArr = null;
        int i7 = 0;
        while (parcel.dataPosition() < a02) {
            int readInt = parcel.readInt();
            char c3 = (char) readInt;
            if (c3 == 1) {
                i7 = Q0.a.N(readInt, parcel);
            } else if (c3 != 2) {
                Q0.a.X(readInt, parcel);
            } else {
                bArr = Q0.a.k(readInt, parcel);
            }
        }
        Q0.a.y(a02, parcel);
        return new zzfnk(i7, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new zzfnk[i7];
    }
}
