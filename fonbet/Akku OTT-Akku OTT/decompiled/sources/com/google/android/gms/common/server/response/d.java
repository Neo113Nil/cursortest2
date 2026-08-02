package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.a;

/* loaded from: classes4.dex */
public final class d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int z = com.google.android.gms.common.internal.safeparcel.b.z(parcel);
        String str = null;
        String str2 = null;
        com.google.android.gms.common.server.converter.b bVar = null;
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        boolean z3 = false;
        int i4 = 0;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = com.google.android.gms.common.internal.safeparcel.b.t(parcel, readInt);
                    break;
                case 2:
                    i2 = com.google.android.gms.common.internal.safeparcel.b.t(parcel, readInt);
                    break;
                case 3:
                    z2 = com.google.android.gms.common.internal.safeparcel.b.m(parcel, readInt);
                    break;
                case 4:
                    i3 = com.google.android.gms.common.internal.safeparcel.b.t(parcel, readInt);
                    break;
                case 5:
                    z3 = com.google.android.gms.common.internal.safeparcel.b.m(parcel, readInt);
                    break;
                case 6:
                    str = com.google.android.gms.common.internal.safeparcel.b.g(parcel, readInt);
                    break;
                case 7:
                    i4 = com.google.android.gms.common.internal.safeparcel.b.t(parcel, readInt);
                    break;
                case '\b':
                    str2 = com.google.android.gms.common.internal.safeparcel.b.g(parcel, readInt);
                    break;
                case '\t':
                    bVar = (com.google.android.gms.common.server.converter.b) com.google.android.gms.common.internal.safeparcel.b.f(parcel, readInt, com.google.android.gms.common.server.converter.b.CREATOR);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.b.y(parcel, readInt);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.b.l(parcel, z);
        return new a.C0113a(i, i2, z2, i3, z3, str, i4, str2, bVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new a.C0113a[i];
    }
}
