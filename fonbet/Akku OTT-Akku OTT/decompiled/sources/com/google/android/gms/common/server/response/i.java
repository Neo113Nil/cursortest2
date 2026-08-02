package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class i implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int z = com.google.android.gms.common.internal.safeparcel.b.z(parcel);
        ArrayList arrayList = null;
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = com.google.android.gms.common.internal.safeparcel.b.t(parcel, readInt);
            } else if (c == 2) {
                arrayList = com.google.android.gms.common.internal.safeparcel.b.k(parcel, readInt, f.CREATOR);
            } else if (c != 3) {
                com.google.android.gms.common.internal.safeparcel.b.y(parcel, readInt);
            } else {
                str = com.google.android.gms.common.internal.safeparcel.b.g(parcel, readInt);
            }
        }
        com.google.android.gms.common.internal.safeparcel.b.l(parcel, z);
        return new h(i, str, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new h[i];
    }
}
