package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public final class q0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int z = com.google.android.gms.common.internal.safeparcel.b.z(parcel);
        H h = null;
        t0 t0Var = null;
        C0894f c0894f = null;
        v0 v0Var = null;
        String str = null;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                h = (H) com.google.android.gms.common.internal.safeparcel.b.f(parcel, readInt, H.CREATOR);
            } else if (c == 2) {
                t0Var = (t0) com.google.android.gms.common.internal.safeparcel.b.f(parcel, readInt, t0.CREATOR);
            } else if (c == 3) {
                c0894f = (C0894f) com.google.android.gms.common.internal.safeparcel.b.f(parcel, readInt, C0894f.CREATOR);
            } else if (c == 4) {
                v0Var = (v0) com.google.android.gms.common.internal.safeparcel.b.f(parcel, readInt, v0.CREATOR);
            } else if (c != 5) {
                com.google.android.gms.common.internal.safeparcel.b.y(parcel, readInt);
            } else {
                str = com.google.android.gms.common.internal.safeparcel.b.g(parcel, readInt);
            }
        }
        com.google.android.gms.common.internal.safeparcel.b.l(parcel, z);
        return new C0892e(h, t0Var, c0894f, v0Var, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C0892e[i];
    }
}
