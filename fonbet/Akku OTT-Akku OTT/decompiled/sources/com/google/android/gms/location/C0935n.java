package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.location.zzbe;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.location.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0935n implements Parcelable.Creator<C0926e> {
    @Override // android.os.Parcelable.Creator
    public final C0926e createFromParcel(Parcel parcel) {
        int z = com.google.android.gms.common.internal.safeparcel.b.z(parcel);
        String str = "";
        ArrayList arrayList = null;
        int i = 0;
        String str2 = null;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                arrayList = com.google.android.gms.common.internal.safeparcel.b.k(parcel, readInt, zzbe.CREATOR);
            } else if (c == 2) {
                i = com.google.android.gms.common.internal.safeparcel.b.t(parcel, readInt);
            } else if (c == 3) {
                str = com.google.android.gms.common.internal.safeparcel.b.g(parcel, readInt);
            } else if (c != 4) {
                com.google.android.gms.common.internal.safeparcel.b.y(parcel, readInt);
            } else {
                str2 = com.google.android.gms.common.internal.safeparcel.b.g(parcel, readInt);
            }
        }
        com.google.android.gms.common.internal.safeparcel.b.l(parcel, z);
        return new C0926e(arrayList, i, str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C0926e[] newArray(int i) {
        return new C0926e[i];
    }
}
