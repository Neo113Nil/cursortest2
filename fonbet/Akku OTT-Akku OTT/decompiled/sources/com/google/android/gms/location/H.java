package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public final class H implements Parcelable.Creator<C0932k> {
    @Override // android.os.Parcelable.Creator
    public final C0932k createFromParcel(Parcel parcel) {
        int z = com.google.android.gms.common.internal.safeparcel.b.z(parcel);
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    z2 = com.google.android.gms.common.internal.safeparcel.b.m(parcel, readInt);
                    break;
                case 2:
                    z3 = com.google.android.gms.common.internal.safeparcel.b.m(parcel, readInt);
                    break;
                case 3:
                    z4 = com.google.android.gms.common.internal.safeparcel.b.m(parcel, readInt);
                    break;
                case 4:
                    z5 = com.google.android.gms.common.internal.safeparcel.b.m(parcel, readInt);
                    break;
                case 5:
                    z6 = com.google.android.gms.common.internal.safeparcel.b.m(parcel, readInt);
                    break;
                case 6:
                    z7 = com.google.android.gms.common.internal.safeparcel.b.m(parcel, readInt);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.b.y(parcel, readInt);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.b.l(parcel, z);
        return new C0932k(z2, z3, z4, z5, z6, z7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C0932k[] newArray(int i) {
        return new C0932k[i];
    }
}
