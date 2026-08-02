package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.wallet.wobs.LabelValueRow;
import com.google.android.gms.wallet.wobs.LoyaltyPoints;
import com.google.android.gms.wallet.wobs.TextModuleData;
import com.google.android.gms.wallet.wobs.TimeInterval;
import com.google.android.gms.wallet.wobs.UriData;
import com.google.android.gms.wallet.wobs.WalletObjectMessage;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class zzs implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int z = b.z(parcel);
        ArrayList newArrayList = ArrayUtils.newArrayList();
        ArrayList newArrayList2 = ArrayUtils.newArrayList();
        ArrayList newArrayList3 = ArrayUtils.newArrayList();
        ArrayList arrayList = newArrayList;
        ArrayList arrayList2 = newArrayList2;
        ArrayList arrayList3 = newArrayList3;
        ArrayList newArrayList4 = ArrayUtils.newArrayList();
        ArrayList newArrayList5 = ArrayUtils.newArrayList();
        ArrayList newArrayList6 = ArrayUtils.newArrayList();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        TimeInterval timeInterval = null;
        String str11 = null;
        String str12 = null;
        LoyaltyPoints loyaltyPoints = null;
        int i = 0;
        boolean z2 = false;
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
                    str3 = b.g(parcel, readInt);
                    break;
                case 5:
                    str4 = b.g(parcel, readInt);
                    break;
                case 6:
                    str5 = b.g(parcel, readInt);
                    break;
                case 7:
                    str6 = b.g(parcel, readInt);
                    break;
                case '\b':
                    str7 = b.g(parcel, readInt);
                    break;
                case '\t':
                    str8 = b.g(parcel, readInt);
                    break;
                case '\n':
                    str9 = b.g(parcel, readInt);
                    break;
                case 11:
                    str10 = b.g(parcel, readInt);
                    break;
                case '\f':
                    i = b.t(parcel, readInt);
                    break;
                case '\r':
                    arrayList = b.k(parcel, readInt, WalletObjectMessage.CREATOR);
                    break;
                case 14:
                    timeInterval = (TimeInterval) b.f(parcel, readInt, TimeInterval.CREATOR);
                    break;
                case 15:
                    arrayList2 = b.k(parcel, readInt, LatLng.CREATOR);
                    break;
                case 16:
                    str11 = b.g(parcel, readInt);
                    break;
                case 17:
                    str12 = b.g(parcel, readInt);
                    break;
                case 18:
                    arrayList3 = b.k(parcel, readInt, LabelValueRow.CREATOR);
                    break;
                case 19:
                    z2 = b.m(parcel, readInt);
                    break;
                case 20:
                    newArrayList4 = b.k(parcel, readInt, UriData.CREATOR);
                    break;
                case 21:
                    newArrayList5 = b.k(parcel, readInt, TextModuleData.CREATOR);
                    break;
                case 22:
                    newArrayList6 = b.k(parcel, readInt, UriData.CREATOR);
                    break;
                case 23:
                    loyaltyPoints = (LoyaltyPoints) b.f(parcel, readInt, LoyaltyPoints.CREATOR);
                    break;
                default:
                    b.y(parcel, readInt);
                    break;
            }
        }
        b.l(parcel, z);
        return new LoyaltyWalletObject(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, i, arrayList, timeInterval, arrayList2, str11, str12, arrayList3, z2, newArrayList4, newArrayList5, newArrayList6, loyaltyPoints);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LoyaltyWalletObject[i];
    }
}
