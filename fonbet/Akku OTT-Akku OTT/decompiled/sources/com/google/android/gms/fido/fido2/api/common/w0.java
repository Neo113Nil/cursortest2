package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.fido.zzgx;

/* loaded from: classes4.dex */
public final class w0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int z = com.google.android.gms.common.internal.safeparcel.b.z(parcel);
        byte[] bArr = null;
        boolean z2 = false;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                z2 = com.google.android.gms.common.internal.safeparcel.b.m(parcel, readInt);
            } else if (c != 2) {
                com.google.android.gms.common.internal.safeparcel.b.y(parcel, readInt);
            } else {
                bArr = com.google.android.gms.common.internal.safeparcel.b.c(parcel, readInt);
            }
        }
        com.google.android.gms.common.internal.safeparcel.b.l(parcel, z);
        return new v0(z2, bArr != null ? zzgx.zzl(bArr, 0, bArr.length) : null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new v0[i];
    }
}
