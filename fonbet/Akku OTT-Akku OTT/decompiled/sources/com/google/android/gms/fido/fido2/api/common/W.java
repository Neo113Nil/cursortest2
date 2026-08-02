package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public final class W implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int z = com.google.android.gms.common.internal.safeparcel.b.z(parcel);
        while (true) {
            byte[][] bArr = null;
            while (parcel.dataPosition() < z) {
                int readInt = parcel.readInt();
                if (((char) readInt) != 1) {
                    com.google.android.gms.common.internal.safeparcel.b.y(parcel, readInt);
                } else {
                    int x = com.google.android.gms.common.internal.safeparcel.b.x(parcel, readInt);
                    int dataPosition = parcel.dataPosition();
                    if (x == 0) {
                        break;
                    }
                    int readInt2 = parcel.readInt();
                    byte[][] bArr2 = new byte[readInt2][];
                    for (int i = 0; i < readInt2; i++) {
                        bArr2[i] = parcel.createByteArray();
                    }
                    parcel.setDataPosition(dataPosition + x);
                    bArr = bArr2;
                }
            }
            com.google.android.gms.common.internal.safeparcel.b.l(parcel, z);
            return new V(bArr);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new V[i];
    }
}
