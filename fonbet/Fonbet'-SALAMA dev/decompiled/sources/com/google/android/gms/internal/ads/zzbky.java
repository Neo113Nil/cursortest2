package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class zzbky implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int a02 = Q0.a.a0(parcel);
        String str = null;
        boolean z4 = false;
        int i7 = 0;
        String str2 = null;
        while (parcel.dataPosition() < a02) {
            int readInt = parcel.readInt();
            char c3 = (char) readInt;
            if (c3 == 1) {
                str = Q0.a.n(readInt, parcel);
            } else if (c3 == 2) {
                z4 = Q0.a.K(readInt, parcel);
            } else if (c3 == 3) {
                i7 = Q0.a.N(readInt, parcel);
            } else if (c3 != 4) {
                Q0.a.X(readInt, parcel);
            } else {
                str2 = Q0.a.n(readInt, parcel);
            }
        }
        Q0.a.y(a02, parcel);
        return new zzbkx(str, z4, i7, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new zzbkx[i7];
    }
}
