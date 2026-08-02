package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.fido.zzgx;

/* loaded from: classes4.dex */
public final class U implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int z = com.google.android.gms.common.internal.safeparcel.b.z(parcel);
        int i = 0;
        byte[] bArr = null;
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                bArr = com.google.android.gms.common.internal.safeparcel.b.c(parcel, readInt);
            } else if (c == 2) {
                bArr2 = com.google.android.gms.common.internal.safeparcel.b.c(parcel, readInt);
            } else if (c == 3) {
                bArr3 = com.google.android.gms.common.internal.safeparcel.b.c(parcel, readInt);
            } else if (c != 4) {
                com.google.android.gms.common.internal.safeparcel.b.y(parcel, readInt);
            } else {
                i = com.google.android.gms.common.internal.safeparcel.b.t(parcel, readInt);
            }
        }
        com.google.android.gms.common.internal.safeparcel.b.l(parcel, z);
        return new T(bArr == null ? null : zzgx.zzl(bArr, 0, bArr.length), bArr2 == null ? null : zzgx.zzl(bArr2, 0, bArr2.length), bArr3 != null ? zzgx.zzl(bArr3, 0, bArr3.length) : null, i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new T[i];
    }
}
