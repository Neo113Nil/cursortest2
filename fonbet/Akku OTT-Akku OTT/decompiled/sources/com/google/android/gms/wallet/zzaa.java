package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.identity.intents.model.UserAddress;

/* loaded from: classes4.dex */
public final class zzaa implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int z = b.z(parcel);
        String str = null;
        CardInfo cardInfo = null;
        UserAddress userAddress = null;
        PaymentMethodToken paymentMethodToken = null;
        String str2 = null;
        Bundle bundle = null;
        String str3 = null;
        Bundle bundle2 = null;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    str = b.g(parcel, readInt);
                    break;
                case 2:
                    cardInfo = (CardInfo) b.f(parcel, readInt, CardInfo.CREATOR);
                    break;
                case 3:
                    userAddress = (UserAddress) b.f(parcel, readInt, UserAddress.CREATOR);
                    break;
                case 4:
                    paymentMethodToken = (PaymentMethodToken) b.f(parcel, readInt, PaymentMethodToken.CREATOR);
                    break;
                case 5:
                    str2 = b.g(parcel, readInt);
                    break;
                case 6:
                    bundle = b.b(parcel, readInt);
                    break;
                case 7:
                    str3 = b.g(parcel, readInt);
                    break;
                case '\b':
                    bundle2 = b.b(parcel, readInt);
                    break;
                default:
                    b.y(parcel, readInt);
                    break;
            }
        }
        b.l(parcel, z);
        return new PaymentData(str, cardInfo, userAddress, paymentMethodToken, str2, bundle, str3, bundle2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PaymentData[i];
    }
}
