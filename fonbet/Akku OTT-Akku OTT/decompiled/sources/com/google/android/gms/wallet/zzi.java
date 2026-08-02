package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.b;

/* loaded from: classes4.dex */
public final class zzi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int z = b.z(parcel);
        int i = 0;
        LoyaltyWalletObject loyaltyWalletObject = null;
        OfferWalletObject offerWalletObject = null;
        GiftCardWalletObject giftCardWalletObject = null;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                loyaltyWalletObject = (LoyaltyWalletObject) b.f(parcel, readInt, LoyaltyWalletObject.CREATOR);
            } else if (c == 3) {
                offerWalletObject = (OfferWalletObject) b.f(parcel, readInt, OfferWalletObject.CREATOR);
            } else if (c == 4) {
                giftCardWalletObject = (GiftCardWalletObject) b.f(parcel, readInt, GiftCardWalletObject.CREATOR);
            } else if (c != 5) {
                b.y(parcel, readInt);
            } else {
                i = b.t(parcel, readInt);
            }
        }
        b.l(parcel, z);
        return new CreateWalletObjectsRequest(loyaltyWalletObject, offerWalletObject, giftCardWalletObject, i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CreateWalletObjectsRequest[i];
    }
}
