package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.b;

/* loaded from: classes4.dex */
public final class zzy implements Parcelable.Creator<zzz> {
    @Override // android.os.Parcelable.Creator
    public final zzz createFromParcel(Parcel parcel) {
        int z = b.z(parcel);
        zzaf zzafVar = null;
        zzx zzxVar = null;
        com.google.firebase.auth.zze zzeVar = null;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                zzafVar = (zzaf) b.f(parcel, readInt, zzaf.CREATOR);
            } else if (c == 2) {
                zzxVar = (zzx) b.f(parcel, readInt, zzx.CREATOR);
            } else if (c != 3) {
                b.y(parcel, readInt);
            } else {
                zzeVar = (com.google.firebase.auth.zze) b.f(parcel, readInt, com.google.firebase.auth.zze.CREATOR);
            }
        }
        b.l(parcel, z);
        return new zzz(zzafVar, zzxVar, zzeVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzz[] newArray(int i) {
        return new zzz[i];
    }
}
