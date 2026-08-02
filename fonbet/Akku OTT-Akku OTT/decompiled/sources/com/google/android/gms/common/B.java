package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public final class B implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int z = com.google.android.gms.common.internal.safeparcel.b.z(parcel);
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        String str = null;
        IBinder iBinder = null;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    str = com.google.android.gms.common.internal.safeparcel.b.g(parcel, readInt);
                    break;
                case 2:
                    z2 = com.google.android.gms.common.internal.safeparcel.b.m(parcel, readInt);
                    break;
                case 3:
                    z3 = com.google.android.gms.common.internal.safeparcel.b.m(parcel, readInt);
                    break;
                case 4:
                    iBinder = com.google.android.gms.common.internal.safeparcel.b.s(parcel, readInt);
                    break;
                case 5:
                    z4 = com.google.android.gms.common.internal.safeparcel.b.m(parcel, readInt);
                    break;
                case 6:
                    z5 = com.google.android.gms.common.internal.safeparcel.b.m(parcel, readInt);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.b.y(parcel, readInt);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.b.l(parcel, z);
        return new A(str, z2, z3, iBinder, z4, z5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new A[i];
    }
}
