package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.identity.intents.model.UserAddress;

/* loaded from: classes4.dex */
public final class zze implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int z = b.z(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        UserAddress userAddress = null;
        int i = 0;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                str = b.g(parcel, readInt);
            } else if (c == 2) {
                str2 = b.g(parcel, readInt);
            } else if (c == 3) {
                str3 = b.g(parcel, readInt);
            } else if (c == 4) {
                i = b.t(parcel, readInt);
            } else if (c != 5) {
                b.y(parcel, readInt);
            } else {
                userAddress = (UserAddress) b.f(parcel, readInt, UserAddress.CREATOR);
            }
        }
        b.l(parcel, z);
        return new CardInfo(str, str2, str3, i, userAddress);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CardInfo[i];
    }
}
