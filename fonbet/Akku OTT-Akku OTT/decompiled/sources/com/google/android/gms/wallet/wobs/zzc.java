package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class zzc implements Parcelable.Creator {
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
        int i = 0;
        boolean z2 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        TimeInterval timeInterval = null;
        String str9 = null;
        String str10 = null;
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
                    i = b.t(parcel, readInt);
                    break;
                case 11:
                    arrayList = b.k(parcel, readInt, WalletObjectMessage.CREATOR);
                    break;
                case '\f':
                    timeInterval = (TimeInterval) b.f(parcel, readInt, TimeInterval.CREATOR);
                    break;
                case '\r':
                    arrayList2 = b.k(parcel, readInt, LatLng.CREATOR);
                    break;
                case 14:
                    str9 = b.g(parcel, readInt);
                    break;
                case 15:
                    str10 = b.g(parcel, readInt);
                    break;
                case 16:
                    arrayList3 = b.k(parcel, readInt, LabelValueRow.CREATOR);
                    break;
                case 17:
                    z2 = b.m(parcel, readInt);
                    break;
                case 18:
                    newArrayList4 = b.k(parcel, readInt, UriData.CREATOR);
                    break;
                case 19:
                    newArrayList5 = b.k(parcel, readInt, TextModuleData.CREATOR);
                    break;
                case 20:
                    newArrayList6 = b.k(parcel, readInt, UriData.CREATOR);
                    break;
                default:
                    b.y(parcel, readInt);
                    break;
            }
        }
        b.l(parcel, z);
        return new CommonWalletObject(str, str2, str3, str4, str5, str6, str7, str8, i, arrayList, timeInterval, arrayList2, str9, str10, arrayList3, z2, newArrayList4, newArrayList5, newArrayList6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CommonWalletObject[i];
    }
}
