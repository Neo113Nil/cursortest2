package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.internal.p002firebaseauthapi.zzaiz;

/* loaded from: classes4.dex */
public final class zzas implements Parcelable.Creator<TotpMultiFactorInfo> {
    @Override // android.os.Parcelable.Creator
    public final TotpMultiFactorInfo createFromParcel(Parcel parcel) {
        int z = b.z(parcel);
        String str = null;
        String str2 = null;
        zzaiz zzaizVar = null;
        long j = 0;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                str = b.g(parcel, readInt);
            } else if (c == 2) {
                str2 = b.g(parcel, readInt);
            } else if (c == 3) {
                j = b.v(parcel, readInt);
            } else if (c != 4) {
                b.y(parcel, readInt);
            } else {
                zzaizVar = (zzaiz) b.f(parcel, readInt, zzaiz.CREATOR);
            }
        }
        b.l(parcel, z);
        return new TotpMultiFactorInfo(str, str2, j, zzaizVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ TotpMultiFactorInfo[] newArray(int i) {
        return new TotpMultiFactorInfo[i];
    }
}
