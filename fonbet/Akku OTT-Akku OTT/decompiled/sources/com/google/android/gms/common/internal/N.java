package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.C0852b;

/* loaded from: classes4.dex */
public final class N implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int z = com.google.android.gms.common.internal.safeparcel.b.z(parcel);
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        IBinder iBinder = null;
        C0852b c0852b = null;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = com.google.android.gms.common.internal.safeparcel.b.t(parcel, readInt);
            } else if (c == 2) {
                iBinder = com.google.android.gms.common.internal.safeparcel.b.s(parcel, readInt);
            } else if (c == 3) {
                c0852b = (C0852b) com.google.android.gms.common.internal.safeparcel.b.f(parcel, readInt, C0852b.CREATOR);
            } else if (c == 4) {
                z2 = com.google.android.gms.common.internal.safeparcel.b.m(parcel, readInt);
            } else if (c != 5) {
                com.google.android.gms.common.internal.safeparcel.b.y(parcel, readInt);
            } else {
                z3 = com.google.android.gms.common.internal.safeparcel.b.m(parcel, readInt);
            }
        }
        com.google.android.gms.common.internal.safeparcel.b.l(parcel, z);
        return new M(i, iBinder, c0852b, z2, z3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new M[i];
    }
}
