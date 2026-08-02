package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public final class y0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int z = com.google.android.gms.common.internal.safeparcel.b.z(parcel);
        byte[] bArr = null;
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        String[] strArr = null;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                bArr = com.google.android.gms.common.internal.safeparcel.b.c(parcel, readInt);
            } else if (c == 3) {
                bArr2 = com.google.android.gms.common.internal.safeparcel.b.c(parcel, readInt);
            } else if (c == 4) {
                bArr3 = com.google.android.gms.common.internal.safeparcel.b.c(parcel, readInt);
            } else if (c != 5) {
                com.google.android.gms.common.internal.safeparcel.b.y(parcel, readInt);
            } else {
                strArr = com.google.android.gms.common.internal.safeparcel.b.h(parcel, readInt);
            }
        }
        com.google.android.gms.common.internal.safeparcel.b.l(parcel, z);
        return new C0898h(bArr, bArr2, bArr3, strArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C0898h[i];
    }
}
