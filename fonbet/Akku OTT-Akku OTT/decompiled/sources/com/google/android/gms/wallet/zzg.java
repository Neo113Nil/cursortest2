package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class zzg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int z = b.z(parcel);
        boolean z2 = false;
        boolean z3 = true;
        ArrayList<Integer> arrayList = null;
        int i = 0;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                arrayList = b.e(parcel, readInt);
            } else if (c == 2) {
                z3 = b.m(parcel, readInt);
            } else if (c == 3) {
                z2 = b.m(parcel, readInt);
            } else if (c != 4) {
                b.y(parcel, readInt);
            } else {
                i = b.t(parcel, readInt);
            }
        }
        b.l(parcel, z);
        return new CardRequirements(arrayList, z3, z2, i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CardRequirements[i];
    }
}
