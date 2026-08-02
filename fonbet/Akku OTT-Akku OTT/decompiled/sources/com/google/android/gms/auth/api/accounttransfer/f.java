package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class f implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int z = com.google.android.gms.common.internal.safeparcel.b.z(parcel);
        ArrayList<String> arrayList = null;
        ArrayList<String> arrayList2 = null;
        ArrayList<String> arrayList3 = null;
        ArrayList<String> arrayList4 = null;
        ArrayList<String> arrayList5 = null;
        int i = 0;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = com.google.android.gms.common.internal.safeparcel.b.t(parcel, readInt);
                    break;
                case 2:
                    arrayList = com.google.android.gms.common.internal.safeparcel.b.i(parcel, readInt);
                    break;
                case 3:
                    arrayList2 = com.google.android.gms.common.internal.safeparcel.b.i(parcel, readInt);
                    break;
                case 4:
                    arrayList3 = com.google.android.gms.common.internal.safeparcel.b.i(parcel, readInt);
                    break;
                case 5:
                    arrayList4 = com.google.android.gms.common.internal.safeparcel.b.i(parcel, readInt);
                    break;
                case 6:
                    arrayList5 = com.google.android.gms.common.internal.safeparcel.b.i(parcel, readInt);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.b.y(parcel, readInt);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.b.l(parcel, z);
        return new e(i, arrayList, arrayList2, arrayList3, arrayList4, arrayList5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new e[i];
    }
}
