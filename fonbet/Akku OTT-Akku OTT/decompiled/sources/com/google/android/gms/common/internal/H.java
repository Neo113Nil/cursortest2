package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public final class H implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int z = com.google.android.gms.common.internal.safeparcel.b.z(parcel);
        int i = -1;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        String str = null;
        String str2 = null;
        long j = 0;
        long j2 = 0;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i2 = com.google.android.gms.common.internal.safeparcel.b.t(parcel, readInt);
                    break;
                case 2:
                    i3 = com.google.android.gms.common.internal.safeparcel.b.t(parcel, readInt);
                    break;
                case 3:
                    i4 = com.google.android.gms.common.internal.safeparcel.b.t(parcel, readInt);
                    break;
                case 4:
                    j = com.google.android.gms.common.internal.safeparcel.b.v(parcel, readInt);
                    break;
                case 5:
                    j2 = com.google.android.gms.common.internal.safeparcel.b.v(parcel, readInt);
                    break;
                case 6:
                    str = com.google.android.gms.common.internal.safeparcel.b.g(parcel, readInt);
                    break;
                case 7:
                    str2 = com.google.android.gms.common.internal.safeparcel.b.g(parcel, readInt);
                    break;
                case '\b':
                    i5 = com.google.android.gms.common.internal.safeparcel.b.t(parcel, readInt);
                    break;
                case '\t':
                    i = com.google.android.gms.common.internal.safeparcel.b.t(parcel, readInt);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.b.y(parcel, readInt);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.b.l(parcel, z);
        return new C0873o(i2, i3, i4, j, j2, str, str2, i5, i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C0873o[i];
    }
}
