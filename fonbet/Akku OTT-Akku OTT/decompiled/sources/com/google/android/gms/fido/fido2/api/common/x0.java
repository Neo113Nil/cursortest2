package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public final class x0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int z = com.google.android.gms.common.internal.safeparcel.b.z(parcel);
        byte[] bArr = null;
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        byte[] bArr4 = null;
        byte[] bArr5 = null;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                bArr = com.google.android.gms.common.internal.safeparcel.b.c(parcel, readInt);
            } else if (c == 3) {
                bArr2 = com.google.android.gms.common.internal.safeparcel.b.c(parcel, readInt);
            } else if (c == 4) {
                bArr3 = com.google.android.gms.common.internal.safeparcel.b.c(parcel, readInt);
            } else if (c == 5) {
                bArr4 = com.google.android.gms.common.internal.safeparcel.b.c(parcel, readInt);
            } else if (c != 6) {
                com.google.android.gms.common.internal.safeparcel.b.y(parcel, readInt);
            } else {
                bArr5 = com.google.android.gms.common.internal.safeparcel.b.c(parcel, readInt);
            }
        }
        com.google.android.gms.common.internal.safeparcel.b.l(parcel, z);
        return new C0896g(bArr, bArr2, bArr3, bArr4, bArr5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C0896g[i];
    }
}
