package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.identity.intents.model.UserAddress;

/* loaded from: classes4.dex */
public final class zzt implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int z = b.z(parcel);
        String str = null;
        String str2 = null;
        String[] strArr = null;
        String str3 = null;
        zza zzaVar = null;
        zza zzaVar2 = null;
        LoyaltyWalletObject[] loyaltyWalletObjectArr = null;
        OfferWalletObject[] offerWalletObjectArr = null;
        UserAddress userAddress = null;
        UserAddress userAddress2 = null;
        InstrumentInfo[] instrumentInfoArr = null;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = b.g(parcel, readInt);
                    break;
                case 3:
                    str2 = b.g(parcel, readInt);
                    break;
                case 4:
                    strArr = b.h(parcel, readInt);
                    break;
                case 5:
                    str3 = b.g(parcel, readInt);
                    break;
                case 6:
                    zzaVar = (zza) b.f(parcel, readInt, zza.CREATOR);
                    break;
                case 7:
                    zzaVar2 = (zza) b.f(parcel, readInt, zza.CREATOR);
                    break;
                case '\b':
                    loyaltyWalletObjectArr = (LoyaltyWalletObject[]) b.j(parcel, readInt, LoyaltyWalletObject.CREATOR);
                    break;
                case '\t':
                    offerWalletObjectArr = (OfferWalletObject[]) b.j(parcel, readInt, OfferWalletObject.CREATOR);
                    break;
                case '\n':
                    userAddress = (UserAddress) b.f(parcel, readInt, UserAddress.CREATOR);
                    break;
                case 11:
                    userAddress2 = (UserAddress) b.f(parcel, readInt, UserAddress.CREATOR);
                    break;
                case '\f':
                    instrumentInfoArr = (InstrumentInfo[]) b.j(parcel, readInt, InstrumentInfo.CREATOR);
                    break;
                default:
                    b.y(parcel, readInt);
                    break;
            }
        }
        b.l(parcel, z);
        return new MaskedWallet(str, str2, strArr, str3, zzaVar, zzaVar2, loyaltyWalletObjectArr, offerWalletObjectArr, userAddress, userAddress2, instrumentInfoArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new MaskedWallet[i];
    }
}
