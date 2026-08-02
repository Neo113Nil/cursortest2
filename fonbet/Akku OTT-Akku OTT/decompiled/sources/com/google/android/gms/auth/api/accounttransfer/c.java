package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.ArrayList;
import java.util.HashSet;

/* loaded from: classes4.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int z = com.google.android.gms.common.internal.safeparcel.b.z(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        ArrayList arrayList = null;
        e eVar = null;
        int i2 = 0;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = com.google.android.gms.common.internal.safeparcel.b.t(parcel, readInt);
                hashSet.add(1);
            } else if (c == 2) {
                arrayList = com.google.android.gms.common.internal.safeparcel.b.k(parcel, readInt, g.CREATOR);
                hashSet.add(2);
            } else if (c == 3) {
                i2 = com.google.android.gms.common.internal.safeparcel.b.t(parcel, readInt);
                hashSet.add(3);
            } else if (c != 4) {
                com.google.android.gms.common.internal.safeparcel.b.y(parcel, readInt);
            } else {
                eVar = (e) com.google.android.gms.common.internal.safeparcel.b.f(parcel, readInt, e.CREATOR);
                hashSet.add(4);
            }
        }
        if (parcel.dataPosition() == z) {
            return new b(hashSet, i, arrayList, i2, eVar);
        }
        throw new b.a(android.support.v4.media.a.a(z, "Overread allowed size end="), parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new b[i];
    }
}
