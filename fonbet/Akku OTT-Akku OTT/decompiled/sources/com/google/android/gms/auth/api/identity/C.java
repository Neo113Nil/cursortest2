package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.C0810d;

/* loaded from: classes4.dex */
public final class C implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int z = com.google.android.gms.common.internal.safeparcel.b.z(parcel);
        byte[] bArr = null;
        boolean z2 = false;
        String str = null;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                z2 = com.google.android.gms.common.internal.safeparcel.b.m(parcel, readInt);
            } else if (c == 2) {
                bArr = com.google.android.gms.common.internal.safeparcel.b.c(parcel, readInt);
            } else if (c != 3) {
                com.google.android.gms.common.internal.safeparcel.b.y(parcel, readInt);
            } else {
                str = com.google.android.gms.common.internal.safeparcel.b.g(parcel, readInt);
            }
        }
        com.google.android.gms.common.internal.safeparcel.b.l(parcel, z);
        return new C0810d.c(str, bArr, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C0810d.c[i];
    }
}
