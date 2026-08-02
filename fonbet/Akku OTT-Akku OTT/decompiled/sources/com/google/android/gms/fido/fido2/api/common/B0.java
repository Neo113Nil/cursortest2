package com.google.android.gms.fido.fido2.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public final class B0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int z = com.google.android.gms.common.internal.safeparcel.b.z(parcel);
        C0916u c0916u = null;
        Uri uri = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                c0916u = (C0916u) com.google.android.gms.common.internal.safeparcel.b.f(parcel, readInt, C0916u.CREATOR);
            } else if (c == 3) {
                uri = (Uri) com.google.android.gms.common.internal.safeparcel.b.f(parcel, readInt, Uri.CREATOR);
            } else if (c != 4) {
                com.google.android.gms.common.internal.safeparcel.b.y(parcel, readInt);
            } else {
                bArr = com.google.android.gms.common.internal.safeparcel.b.c(parcel, readInt);
            }
        }
        com.google.android.gms.common.internal.safeparcel.b.l(parcel, z);
        return new C0906l(c0916u, uri, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C0906l[i];
    }
}
