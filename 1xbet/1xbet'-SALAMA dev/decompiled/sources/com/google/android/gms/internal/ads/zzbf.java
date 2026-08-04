package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzbf {
    public final Object zza;
    public final int zzb;
    public final zzap zzc;
    public final Object zzd;
    public final int zze;
    public final long zzf;
    public final long zzg;
    public final int zzh;
    public final int zzi;

    static {
        int i7 = zzen.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
    }

    public zzbf(Object obj, int i7, zzap zzapVar, Object obj2, int i8, long j, long j3, int i9, int i10) {
        this.zza = obj;
        this.zzb = i7;
        this.zzc = zzapVar;
        this.zzd = obj2;
        this.zze = i8;
        this.zzf = j;
        this.zzg = j3;
        this.zzh = i9;
        this.zzi = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbf.class == obj.getClass()) {
            zzbf zzbfVar = (zzbf) obj;
            if (this.zzb == zzbfVar.zzb && this.zze == zzbfVar.zze && this.zzf == zzbfVar.zzf && this.zzg == zzbfVar.zzg && this.zzh == zzbfVar.zzh && this.zzi == zzbfVar.zzi && zzfte.zza(this.zzc, zzbfVar.zzc) && zzfte.zza(this.zza, zzbfVar.zza) && zzfte.zza(this.zzd, zzbfVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, Integer.valueOf(this.zzb), this.zzc, this.zzd, Integer.valueOf(this.zze), Long.valueOf(this.zzf), Long.valueOf(this.zzg), Integer.valueOf(this.zzh), Integer.valueOf(this.zzi)});
    }
}
