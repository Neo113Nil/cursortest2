package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class zzbli implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int a02 = Q0.a.a0(parcel);
        String str = null;
        Bundle bundle = null;
        while (parcel.dataPosition() < a02) {
            int readInt = parcel.readInt();
            char c3 = (char) readInt;
            if (c3 == 1) {
                str = Q0.a.n(readInt, parcel);
            } else if (c3 != 2) {
                Q0.a.X(readInt, parcel);
            } else {
                bundle = Q0.a.j(readInt, parcel);
            }
        }
        Q0.a.y(a02, parcel);
        return new zzblh(str, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new zzblh[i7];
    }
}
