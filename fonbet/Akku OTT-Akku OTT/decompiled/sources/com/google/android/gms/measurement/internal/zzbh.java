package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

/* loaded from: classes4.dex */
public final class zzbh implements Parcelable.Creator {
    public static void zza(zzbg zzbgVar, Parcel parcel, int i) {
        String str = zzbgVar.zza;
        int q = c.q(parcel, 20293);
        c.l(parcel, 2, str, false);
        c.k(parcel, 3, zzbgVar.zzb, i, false);
        c.l(parcel, 4, zzbgVar.zzc, false);
        long j = zzbgVar.zzd;
        c.s(parcel, 5, 8);
        parcel.writeLong(j);
        c.r(parcel, q);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int z = b.z(parcel);
        long j = 0;
        String str = null;
        zzbe zzbeVar = null;
        String str2 = null;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                str = b.g(parcel, readInt);
            } else if (c == 3) {
                zzbeVar = (zzbe) b.f(parcel, readInt, zzbe.CREATOR);
            } else if (c == 4) {
                str2 = b.g(parcel, readInt);
            } else if (c != 5) {
                b.y(parcel, readInt);
            } else {
                j = b.v(parcel, readInt);
            }
        }
        b.l(parcel, z);
        return new zzbg(str, zzbeVar, str2, j);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbg[i];
    }
}
