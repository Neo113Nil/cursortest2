package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.b;

/* loaded from: classes4.dex */
public final class zzi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int z = b.z(parcel);
        int i = -1;
        long j = 0;
        String str = null;
        String str2 = null;
        double d = 0.0d;
        int i2 = 0;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    i2 = b.t(parcel, readInt);
                    break;
                case 3:
                    str = b.g(parcel, readInt);
                    break;
                case 4:
                    d = b.o(parcel, readInt);
                    break;
                case 5:
                    str2 = b.g(parcel, readInt);
                    break;
                case 6:
                    j = b.v(parcel, readInt);
                    break;
                case 7:
                    i = b.t(parcel, readInt);
                    break;
                default:
                    b.y(parcel, readInt);
                    break;
            }
        }
        b.l(parcel, z);
        return new LoyaltyPointsBalance(i2, str, d, str2, j, i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LoyaltyPointsBalance[i];
    }
}
