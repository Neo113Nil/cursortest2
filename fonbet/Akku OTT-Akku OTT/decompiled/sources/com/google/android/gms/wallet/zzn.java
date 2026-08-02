package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.wallet.wobs.CommonWalletObject;

/* loaded from: classes4.dex */
public final class zzn implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int z = b.z(parcel);
        CommonWalletObject commonWalletObject = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        long j = 0;
        long j2 = 0;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    commonWalletObject = (CommonWalletObject) b.f(parcel, readInt, CommonWalletObject.CREATOR);
                    break;
                case 3:
                    str = b.g(parcel, readInt);
                    break;
                case 4:
                    str2 = b.g(parcel, readInt);
                    break;
                case 5:
                    str3 = b.g(parcel, readInt);
                    break;
                case 6:
                    j = b.v(parcel, readInt);
                    break;
                case 7:
                    str4 = b.g(parcel, readInt);
                    break;
                case '\b':
                    j2 = b.v(parcel, readInt);
                    break;
                case '\t':
                    str5 = b.g(parcel, readInt);
                    break;
                default:
                    b.y(parcel, readInt);
                    break;
            }
        }
        b.l(parcel, z);
        return new GiftCardWalletObject(commonWalletObject, str, str2, str3, j, str4, j2, str5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GiftCardWalletObject[i];
    }
}
