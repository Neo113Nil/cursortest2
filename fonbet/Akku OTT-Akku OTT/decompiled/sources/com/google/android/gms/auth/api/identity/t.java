package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.C0810d;

/* loaded from: classes4.dex */
public final class t implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int z = com.google.android.gms.common.internal.safeparcel.b.z(parcel);
        boolean z2 = false;
        int i = 0;
        boolean z3 = false;
        C0810d.C0107d c0107d = null;
        C0810d.a aVar = null;
        String str = null;
        C0810d.c cVar = null;
        C0810d.b bVar = null;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    c0107d = (C0810d.C0107d) com.google.android.gms.common.internal.safeparcel.b.f(parcel, readInt, C0810d.C0107d.CREATOR);
                    break;
                case 2:
                    aVar = (C0810d.a) com.google.android.gms.common.internal.safeparcel.b.f(parcel, readInt, C0810d.a.CREATOR);
                    break;
                case 3:
                    str = com.google.android.gms.common.internal.safeparcel.b.g(parcel, readInt);
                    break;
                case 4:
                    z2 = com.google.android.gms.common.internal.safeparcel.b.m(parcel, readInt);
                    break;
                case 5:
                    i = com.google.android.gms.common.internal.safeparcel.b.t(parcel, readInt);
                    break;
                case 6:
                    cVar = (C0810d.c) com.google.android.gms.common.internal.safeparcel.b.f(parcel, readInt, C0810d.c.CREATOR);
                    break;
                case 7:
                    bVar = (C0810d.b) com.google.android.gms.common.internal.safeparcel.b.f(parcel, readInt, C0810d.b.CREATOR);
                    break;
                case '\b':
                    z3 = com.google.android.gms.common.internal.safeparcel.b.m(parcel, readInt);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.b.y(parcel, readInt);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.b.l(parcel, z);
        return new C0810d(c0107d, aVar, str, z2, i, cVar, bVar, z3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C0810d[i];
    }
}
