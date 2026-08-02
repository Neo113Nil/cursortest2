package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.fido.fido2.api.common.c0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0889c0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int z = com.google.android.gms.common.internal.safeparcel.b.z(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                str = com.google.android.gms.common.internal.safeparcel.b.g(parcel, readInt);
            } else if (c == 3) {
                str2 = com.google.android.gms.common.internal.safeparcel.b.g(parcel, readInt);
            } else if (c != 4) {
                com.google.android.gms.common.internal.safeparcel.b.y(parcel, readInt);
            } else {
                str3 = com.google.android.gms.common.internal.safeparcel.b.g(parcel, readInt);
            }
        }
        com.google.android.gms.common.internal.safeparcel.b.l(parcel, z);
        return new C0920y(str, str2, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C0920y[i];
    }
}
