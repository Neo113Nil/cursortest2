package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.identity.intents.model.UserAddress;

/* loaded from: classes4.dex */
public final class zzl implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int z = b.z(parcel);
        String str = null;
        String str2 = null;
        zzaj zzajVar = null;
        String str3 = null;
        zza zzaVar = null;
        zza zzaVar2 = null;
        String[] strArr = null;
        UserAddress userAddress = null;
        UserAddress userAddress2 = null;
        InstrumentInfo[] instrumentInfoArr = null;
        PaymentMethodToken paymentMethodToken = null;
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
                    zzajVar = (zzaj) b.f(parcel, readInt, zzaj.CREATOR);
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
                    strArr = b.h(parcel, readInt);
                    break;
                case '\t':
                    userAddress = (UserAddress) b.f(parcel, readInt, UserAddress.CREATOR);
                    break;
                case '\n':
                    userAddress2 = (UserAddress) b.f(parcel, readInt, UserAddress.CREATOR);
                    break;
                case 11:
                    instrumentInfoArr = (InstrumentInfo[]) b.j(parcel, readInt, InstrumentInfo.CREATOR);
                    break;
                case '\f':
                    paymentMethodToken = (PaymentMethodToken) b.f(parcel, readInt, PaymentMethodToken.CREATOR);
                    break;
                default:
                    b.y(parcel, readInt);
                    break;
            }
        }
        b.l(parcel, z);
        return new FullWallet(str, str2, zzajVar, str3, zzaVar, zzaVar2, strArr, userAddress, userAddress2, instrumentInfoArr, paymentMethodToken);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new FullWallet[i];
    }
}
