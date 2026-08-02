package com.google.android.gms.internal.auth;

import Q0.a;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class zzba implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int a02 = a.a0(parcel);
        int i7 = 0;
        String str = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < a02) {
            int readInt = parcel.readInt();
            char c3 = (char) readInt;
            if (c3 == 1) {
                i7 = a.N(readInt, parcel);
            } else if (c3 == 2) {
                str = a.n(readInt, parcel);
            } else if (c3 != 3) {
                a.X(readInt, parcel);
            } else {
                bArr = a.k(readInt, parcel);
            }
        }
        a.y(a02, parcel);
        return new zzaz(i7, str, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new zzaz[i7];
    }
}
