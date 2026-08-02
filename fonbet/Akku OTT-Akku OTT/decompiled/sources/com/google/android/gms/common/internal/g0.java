package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.C0854d;

/* loaded from: classes4.dex */
public final class g0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int z = com.google.android.gms.common.internal.safeparcel.b.z(parcel);
        Bundle bundle = null;
        C0864f c0864f = null;
        int i = 0;
        C0854d[] c0854dArr = null;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                bundle = com.google.android.gms.common.internal.safeparcel.b.b(parcel, readInt);
            } else if (c == 2) {
                c0854dArr = (C0854d[]) com.google.android.gms.common.internal.safeparcel.b.j(parcel, readInt, C0854d.CREATOR);
            } else if (c == 3) {
                i = com.google.android.gms.common.internal.safeparcel.b.t(parcel, readInt);
            } else if (c != 4) {
                com.google.android.gms.common.internal.safeparcel.b.y(parcel, readInt);
            } else {
                c0864f = (C0864f) com.google.android.gms.common.internal.safeparcel.b.f(parcel, readInt, C0864f.CREATOR);
            }
        }
        com.google.android.gms.common.internal.safeparcel.b.l(parcel, z);
        f0 f0Var = new f0();
        f0Var.a = bundle;
        f0Var.b = c0854dArr;
        f0Var.c = i;
        f0Var.d = c0864f;
        return f0Var;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new f0[i];
    }
}
