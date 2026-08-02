package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.util.ArrayUtils;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class zzf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int z = b.z(parcel);
        ArrayList newArrayList = ArrayUtils.newArrayList();
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                str = b.g(parcel, readInt);
            } else if (c == 3) {
                str2 = b.g(parcel, readInt);
            } else if (c != 4) {
                b.y(parcel, readInt);
            } else {
                newArrayList = b.k(parcel, readInt, LabelValue.CREATOR);
            }
        }
        b.l(parcel, z);
        return new LabelValueRow(str, str2, newArrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LabelValueRow[i];
    }
}
