package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public final class h0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int z = com.google.android.gms.common.internal.safeparcel.b.z(parcel);
        C0876s c0876s = null;
        int[] iArr = null;
        int[] iArr2 = null;
        boolean z2 = false;
        boolean z3 = false;
        int i = 0;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    c0876s = (C0876s) com.google.android.gms.common.internal.safeparcel.b.f(parcel, readInt, C0876s.CREATOR);
                    break;
                case 2:
                    z2 = com.google.android.gms.common.internal.safeparcel.b.m(parcel, readInt);
                    break;
                case 3:
                    z3 = com.google.android.gms.common.internal.safeparcel.b.m(parcel, readInt);
                    break;
                case 4:
                    iArr = com.google.android.gms.common.internal.safeparcel.b.d(parcel, readInt);
                    break;
                case 5:
                    i = com.google.android.gms.common.internal.safeparcel.b.t(parcel, readInt);
                    break;
                case 6:
                    iArr2 = com.google.android.gms.common.internal.safeparcel.b.d(parcel, readInt);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.b.y(parcel, readInt);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.b.l(parcel, z);
        return new C0864f(c0876s, z2, z3, iArr, i, iArr2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C0864f[i];
    }
}
