package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

/* loaded from: classes4.dex */
public final class zzpm implements Parcelable.Creator {
    public static void zza(zzpl zzplVar, Parcel parcel, int i) {
        int i2 = zzplVar.zza;
        int q = c.q(parcel, 20293);
        c.s(parcel, 1, 4);
        parcel.writeInt(i2);
        c.l(parcel, 2, zzplVar.zzb, false);
        long j = zzplVar.zzc;
        c.s(parcel, 3, 8);
        parcel.writeLong(j);
        c.j(parcel, 4, zzplVar.zzd);
        c.l(parcel, 6, zzplVar.zze, false);
        c.l(parcel, 7, zzplVar.zzf, false);
        c.d(parcel, 8, zzplVar.zzg);
        c.r(parcel, q);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int z = b.z(parcel);
        String str = null;
        Long l = null;
        Float f = null;
        String str2 = null;
        String str3 = null;
        Double d = null;
        long j = 0;
        int i = 0;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = b.t(parcel, readInt);
                    break;
                case 2:
                    str = b.g(parcel, readInt);
                    break;
                case 3:
                    j = b.v(parcel, readInt);
                    break;
                case 4:
                    l = b.w(parcel, readInt);
                    break;
                case 5:
                    f = b.r(parcel, readInt);
                    break;
                case 6:
                    str2 = b.g(parcel, readInt);
                    break;
                case 7:
                    str3 = b.g(parcel, readInt);
                    break;
                case '\b':
                    d = b.p(parcel, readInt);
                    break;
                default:
                    b.y(parcel, readInt);
                    break;
            }
        }
        b.l(parcel, z);
        return new zzpl(i, str, j, l, f, str2, str3, d);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzpl[i];
    }
}
