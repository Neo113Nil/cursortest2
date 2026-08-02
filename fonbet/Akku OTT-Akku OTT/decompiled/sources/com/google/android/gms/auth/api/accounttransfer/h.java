package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.HashSet;

/* loaded from: classes4.dex */
public final class h implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int z = com.google.android.gms.common.internal.safeparcel.b.z(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        i iVar = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = com.google.android.gms.common.internal.safeparcel.b.t(parcel, readInt);
                hashSet.add(1);
            } else if (c == 2) {
                iVar = (i) com.google.android.gms.common.internal.safeparcel.b.f(parcel, readInt, i.CREATOR);
                hashSet.add(2);
            } else if (c == 3) {
                str = com.google.android.gms.common.internal.safeparcel.b.g(parcel, readInt);
                hashSet.add(3);
            } else if (c == 4) {
                str2 = com.google.android.gms.common.internal.safeparcel.b.g(parcel, readInt);
                hashSet.add(4);
            } else if (c != 5) {
                com.google.android.gms.common.internal.safeparcel.b.y(parcel, readInt);
            } else {
                str3 = com.google.android.gms.common.internal.safeparcel.b.g(parcel, readInt);
                hashSet.add(5);
            }
        }
        if (parcel.dataPosition() == z) {
            return new g(hashSet, i, iVar, str, str2, str3);
        }
        throw new b.a(android.support.v4.media.a.a(z, "Overread allowed size end="), parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new g[i];
    }
}
