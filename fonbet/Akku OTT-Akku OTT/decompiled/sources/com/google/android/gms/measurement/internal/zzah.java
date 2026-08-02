package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.common.internal.safeparcel.c;

/* loaded from: classes4.dex */
public final class zzah extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<zzah> CREATOR = new zzai();

    @Nullable
    public String zza;
    public String zzb;
    public zzpl zzc;
    public long zzd;
    public boolean zze;

    @Nullable
    public String zzf;

    @Nullable
    public final zzbg zzg;
    public long zzh;

    @Nullable
    public zzbg zzi;
    public final long zzj;

    @Nullable
    public final zzbg zzk;

    public zzah(zzah zzahVar) {
        C0875q.g(zzahVar);
        this.zza = zzahVar.zza;
        this.zzb = zzahVar.zzb;
        this.zzc = zzahVar.zzc;
        this.zzd = zzahVar.zzd;
        this.zze = zzahVar.zze;
        this.zzf = zzahVar.zzf;
        this.zzg = zzahVar.zzg;
        this.zzh = zzahVar.zzh;
        this.zzi = zzahVar.zzi;
        this.zzj = zzahVar.zzj;
        this.zzk = zzahVar.zzk;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int q = c.q(parcel, 20293);
        c.l(parcel, 2, this.zza, false);
        c.l(parcel, 3, this.zzb, false);
        c.k(parcel, 4, this.zzc, i, false);
        long j = this.zzd;
        c.s(parcel, 5, 8);
        parcel.writeLong(j);
        boolean z = this.zze;
        c.s(parcel, 6, 4);
        parcel.writeInt(z ? 1 : 0);
        c.l(parcel, 7, this.zzf, false);
        c.k(parcel, 8, this.zzg, i, false);
        long j2 = this.zzh;
        c.s(parcel, 9, 8);
        parcel.writeLong(j2);
        c.k(parcel, 10, this.zzi, i, false);
        long j3 = this.zzj;
        c.s(parcel, 11, 8);
        parcel.writeLong(j3);
        c.k(parcel, 12, this.zzk, i, false);
        c.r(parcel, q);
    }

    public zzah(@Nullable String str, String str2, zzpl zzplVar, long j, boolean z, @Nullable String str3, @Nullable zzbg zzbgVar, long j2, @Nullable zzbg zzbgVar2, long j3, @Nullable zzbg zzbgVar3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzplVar;
        this.zzd = j;
        this.zze = z;
        this.zzf = str3;
        this.zzg = zzbgVar;
        this.zzh = j2;
        this.zzi = zzbgVar2;
        this.zzj = j3;
        this.zzk = zzbgVar3;
    }
}
