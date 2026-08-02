package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.wallet.wobs.CommonWalletObject;

/* loaded from: classes4.dex */
public final class zzv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int z = b.z(parcel);
        String str = null;
        CommonWalletObject commonWalletObject = null;
        int i = 0;
        String str2 = null;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = b.t(parcel, readInt);
            } else if (c == 2) {
                str = b.g(parcel, readInt);
            } else if (c == 3) {
                str2 = b.g(parcel, readInt);
            } else if (c != 4) {
                b.y(parcel, readInt);
            } else {
                commonWalletObject = (CommonWalletObject) b.f(parcel, readInt, CommonWalletObject.CREATOR);
            }
        }
        b.l(parcel, z);
        return new OfferWalletObject(i, str, str2, commonWalletObject);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new OfferWalletObject[i];
    }
}
