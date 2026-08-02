package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.b;

/* loaded from: classes4.dex */
public final class zzj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int z = b.z(parcel);
        String str = null;
        LoyaltyPointsBalance loyaltyPointsBalance = null;
        TimeInterval timeInterval = null;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                str = b.g(parcel, readInt);
            } else if (c == 3) {
                loyaltyPointsBalance = (LoyaltyPointsBalance) b.f(parcel, readInt, LoyaltyPointsBalance.CREATOR);
            } else if (c != 5) {
                b.y(parcel, readInt);
            } else {
                timeInterval = (TimeInterval) b.f(parcel, readInt, TimeInterval.CREATOR);
            }
        }
        b.l(parcel, z);
        return new LoyaltyPoints(str, loyaltyPointsBalance, timeInterval);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LoyaltyPoints[i];
    }
}
