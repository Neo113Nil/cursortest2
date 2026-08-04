package com.google.android.gms.internal.measurement;

import Y4.D;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zzcl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcl> CREATOR = new zzcm();
    public final long zza;
    public final long zzb;
    public final boolean zzc;
    public final String zzd;
    public final String zze;
    public final String zzf;
    public final Bundle zzg;
    public final String zzh;

    public zzcl(long j, long j3, boolean z4, String str, String str2, String str3, Bundle bundle, String str4) {
        this.zza = j;
        this.zzb = j3;
        this.zzc = z4;
        this.zzd = str;
        this.zze = str2;
        this.zzf = str3;
        this.zzg = bundle;
        this.zzh = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iX0 = D.x0(20293, parcel);
        long j = this.zza;
        D.B0(parcel, 1, 8);
        parcel.writeLong(j);
        long j3 = this.zzb;
        D.B0(parcel, 2, 8);
        parcel.writeLong(j3);
        boolean z4 = this.zzc;
        D.B0(parcel, 3, 4);
        parcel.writeInt(z4 ? 1 : 0);
        D.s0(parcel, 4, this.zzd, false);
        D.s0(parcel, 5, this.zze, false);
        D.s0(parcel, 6, this.zzf, false);
        D.k0(parcel, 7, this.zzg, false);
        D.s0(parcel, 8, this.zzh, false);
        D.z0(iX0, parcel);
    }
}
