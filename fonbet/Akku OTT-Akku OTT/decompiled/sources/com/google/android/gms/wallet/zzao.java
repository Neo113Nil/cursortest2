package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.b;

/* loaded from: classes4.dex */
public final class zzao implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int z = b.z(parcel);
        String str = null;
        int i = 0;
        String str2 = null;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = b.t(parcel, readInt);
            } else if (c == 2) {
                str = b.g(parcel, readInt);
            } else if (c != 3) {
                b.y(parcel, readInt);
            } else {
                str2 = b.g(parcel, readInt);
            }
        }
        b.l(parcel, z);
        return new TransactionInfo(i, str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new TransactionInfo[i];
    }
}
