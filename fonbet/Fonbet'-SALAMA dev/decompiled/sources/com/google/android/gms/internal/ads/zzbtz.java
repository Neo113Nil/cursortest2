package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class zzbtz implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int a02 = Q0.a.a0(parcel);
        String str = null;
        while (parcel.dataPosition() < a02) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                Q0.a.X(readInt, parcel);
            } else {
                str = Q0.a.n(readInt, parcel);
            }
        }
        Q0.a.y(a02, parcel);
        return new zzbty(str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new zzbty[i7];
    }
}
