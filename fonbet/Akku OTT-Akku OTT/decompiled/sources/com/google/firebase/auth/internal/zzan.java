package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.TotpMultiFactorInfo;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class zzan implements Parcelable.Creator<zzal> {
    @Override // android.os.Parcelable.Creator
    public final zzal createFromParcel(Parcel parcel) {
        int z = b.z(parcel);
        ArrayList arrayList = null;
        zzam zzamVar = null;
        String str = null;
        com.google.firebase.auth.zze zzeVar = null;
        zzaf zzafVar = null;
        ArrayList arrayList2 = null;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    arrayList = b.k(parcel, readInt, PhoneMultiFactorInfo.CREATOR);
                    break;
                case 2:
                    zzamVar = (zzam) b.f(parcel, readInt, zzam.CREATOR);
                    break;
                case 3:
                    str = b.g(parcel, readInt);
                    break;
                case 4:
                    zzeVar = (com.google.firebase.auth.zze) b.f(parcel, readInt, com.google.firebase.auth.zze.CREATOR);
                    break;
                case 5:
                    zzafVar = (zzaf) b.f(parcel, readInt, zzaf.CREATOR);
                    break;
                case 6:
                    arrayList2 = b.k(parcel, readInt, TotpMultiFactorInfo.CREATOR);
                    break;
                default:
                    b.y(parcel, readInt);
                    break;
            }
        }
        b.l(parcel, z);
        return new zzal(arrayList, zzamVar, str, zzeVar, zzafVar, arrayList2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzal[] newArray(int i) {
        return new zzal[i];
    }
}
