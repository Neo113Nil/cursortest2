package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public final class F0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int z = com.google.android.gms.common.internal.safeparcel.b.z(parcel);
        byte[] bArr = null;
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        long j = 0;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                j = com.google.android.gms.common.internal.safeparcel.b.v(parcel, readInt);
            } else if (c == 2) {
                bArr = com.google.android.gms.common.internal.safeparcel.b.c(parcel, readInt);
            } else if (c == 3) {
                bArr2 = com.google.android.gms.common.internal.safeparcel.b.c(parcel, readInt);
            } else if (c != 4) {
                com.google.android.gms.common.internal.safeparcel.b.y(parcel, readInt);
            } else {
                bArr3 = com.google.android.gms.common.internal.safeparcel.b.c(parcel, readInt);
            }
        }
        com.google.android.gms.common.internal.safeparcel.b.l(parcel, z);
        return new E0(j, bArr, bArr2, bArr3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new E0[i];
    }
}
