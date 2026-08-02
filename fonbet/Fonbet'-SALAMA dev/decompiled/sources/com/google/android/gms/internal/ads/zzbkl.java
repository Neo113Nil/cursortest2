package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class zzbkl implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int a02 = Q0.a.a0(parcel);
        String str = null;
        String[] strArr = null;
        String[] strArr2 = null;
        while (parcel.dataPosition() < a02) {
            int readInt = parcel.readInt();
            char c3 = (char) readInt;
            if (c3 == 1) {
                str = Q0.a.n(readInt, parcel);
            } else if (c3 == 2) {
                strArr = Q0.a.o(readInt, parcel);
            } else if (c3 != 3) {
                Q0.a.X(readInt, parcel);
            } else {
                strArr2 = Q0.a.o(readInt, parcel);
            }
        }
        Q0.a.y(a02, parcel);
        return new zzbkk(str, strArr, strArr2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new zzbkk[i7];
    }
}
