package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public final class Y implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int z = com.google.android.gms.common.internal.safeparcel.b.z(parcel);
        String str = null;
        String str2 = null;
        byte[] bArr = null;
        C0898h c0898h = null;
        C0896g c0896g = null;
        C0900i c0900i = null;
        C0892e c0892e = null;
        String str3 = null;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    str = com.google.android.gms.common.internal.safeparcel.b.g(parcel, readInt);
                    break;
                case 2:
                    str2 = com.google.android.gms.common.internal.safeparcel.b.g(parcel, readInt);
                    break;
                case 3:
                    bArr = com.google.android.gms.common.internal.safeparcel.b.c(parcel, readInt);
                    break;
                case 4:
                    c0898h = (C0898h) com.google.android.gms.common.internal.safeparcel.b.f(parcel, readInt, C0898h.CREATOR);
                    break;
                case 5:
                    c0896g = (C0896g) com.google.android.gms.common.internal.safeparcel.b.f(parcel, readInt, C0896g.CREATOR);
                    break;
                case 6:
                    c0900i = (C0900i) com.google.android.gms.common.internal.safeparcel.b.f(parcel, readInt, C0900i.CREATOR);
                    break;
                case 7:
                    c0892e = (C0892e) com.google.android.gms.common.internal.safeparcel.b.f(parcel, readInt, C0892e.CREATOR);
                    break;
                case '\b':
                    str3 = com.google.android.gms.common.internal.safeparcel.b.g(parcel, readInt);
                    break;
                case '\t':
                    com.google.android.gms.common.internal.safeparcel.b.g(parcel, readInt);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.b.y(parcel, readInt);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.b.l(parcel, z);
        return new C0915t(str, str2, bArr, c0898h, c0896g, c0900i, c0892e, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C0915t[i];
    }
}
