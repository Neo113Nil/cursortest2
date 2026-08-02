package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class zzq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int z = b.z(parcel);
        ArrayList<Integer> arrayList = null;
        String str = null;
        String str2 = null;
        ArrayList<Integer> arrayList2 = null;
        String str3 = null;
        boolean z2 = false;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    arrayList = b.e(parcel, readInt);
                    break;
                case 3:
                default:
                    b.y(parcel, readInt);
                    break;
                case 4:
                    str = b.g(parcel, readInt);
                    break;
                case 5:
                    str2 = b.g(parcel, readInt);
                    break;
                case 6:
                    arrayList2 = b.e(parcel, readInt);
                    break;
                case 7:
                    z2 = b.m(parcel, readInt);
                    break;
                case '\b':
                    str3 = b.g(parcel, readInt);
                    break;
            }
        }
        b.l(parcel, z);
        return new IsReadyToPayRequest(arrayList, str, str2, arrayList2, z2, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new IsReadyToPayRequest[i];
    }
}
