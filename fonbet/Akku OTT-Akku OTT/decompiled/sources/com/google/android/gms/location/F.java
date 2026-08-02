package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class F implements Parcelable.Creator<C0930i> {
    @Override // android.os.Parcelable.Creator
    public final C0930i createFromParcel(Parcel parcel) {
        int z = com.google.android.gms.common.internal.safeparcel.b.z(parcel);
        ArrayList arrayList = null;
        boolean z2 = false;
        boolean z3 = false;
        D d = null;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                arrayList = com.google.android.gms.common.internal.safeparcel.b.k(parcel, readInt, LocationRequest.CREATOR);
            } else if (c == 2) {
                z2 = com.google.android.gms.common.internal.safeparcel.b.m(parcel, readInt);
            } else if (c == 3) {
                z3 = com.google.android.gms.common.internal.safeparcel.b.m(parcel, readInt);
            } else if (c != 5) {
                com.google.android.gms.common.internal.safeparcel.b.y(parcel, readInt);
            } else {
                d = (D) com.google.android.gms.common.internal.safeparcel.b.f(parcel, readInt, D.CREATOR);
            }
        }
        com.google.android.gms.common.internal.safeparcel.b.l(parcel, z);
        return new C0930i(arrayList, z2, z3, d);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C0930i[] newArray(int i) {
        return new C0930i[i];
    }
}
