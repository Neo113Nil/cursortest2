package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.TotpMultiFactorInfo;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class zzap implements Parcelable.Creator<zzam> {
    @Override // android.os.Parcelable.Creator
    public final zzam createFromParcel(Parcel parcel) {
        int z = b.z(parcel);
        String str = null;
        String str2 = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        zzaf zzafVar = null;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                str = b.g(parcel, readInt);
            } else if (c == 2) {
                str2 = b.g(parcel, readInt);
            } else if (c == 3) {
                arrayList = b.k(parcel, readInt, PhoneMultiFactorInfo.CREATOR);
            } else if (c == 4) {
                arrayList2 = b.k(parcel, readInt, TotpMultiFactorInfo.CREATOR);
            } else if (c != 5) {
                b.y(parcel, readInt);
            } else {
                zzafVar = (zzaf) b.f(parcel, readInt, zzaf.CREATOR);
            }
        }
        b.l(parcel, z);
        return new zzam(str, str2, arrayList, arrayList2, zzafVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzam[] newArray(int i) {
        return new zzam[i];
    }
}
