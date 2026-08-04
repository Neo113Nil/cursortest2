package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class zzbm {
    public static final Object zza = new Object();
    private static final zzap zzp;

    @Deprecated
    public Object zzc;
    public long zze;
    public long zzf;
    public long zzg;
    public boolean zzh;
    public boolean zzi;
    public zzaj zzj;
    public boolean zzk;
    public long zzl;
    public long zzm;
    public int zzn;
    public int zzo;
    public Object zzb = zza;
    public zzap zzd = zzp;

    static {
        zzad zzadVar = new zzad();
        zzadVar.zza("androidx.media3.common.Timeline");
        zzadVar.zzb(Uri.EMPTY);
        zzp = zzadVar.zzc();
        int i7 = zzen.zza;
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
        Integer.toString(12, 36);
        Integer.toString(13, 36);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbm.class.equals(obj.getClass())) {
            zzbm zzbmVar = (zzbm) obj;
            Object obj2 = this.zzb;
            Object obj3 = zzbmVar.zzb;
            int i7 = zzen.zza;
            if (Objects.equals(obj2, obj3) && Objects.equals(this.zzd, zzbmVar.zzd) && Objects.equals(this.zzj, zzbmVar.zzj) && this.zze == zzbmVar.zze && this.zzf == zzbmVar.zzf && this.zzg == zzbmVar.zzg && this.zzh == zzbmVar.zzh && this.zzi == zzbmVar.zzi && this.zzk == zzbmVar.zzk && this.zzm == zzbmVar.zzm && this.zzn == zzbmVar.zzn && this.zzo == zzbmVar.zzo) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.zzb.hashCode() + 217) * 31) + this.zzd.hashCode();
        zzaj zzajVar = this.zzj;
        int iHashCode2 = ((iHashCode * 961) + (zzajVar == null ? 0 : zzajVar.hashCode())) * 31;
        long j = this.zze;
        int i7 = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        long j3 = this.zzf;
        int i8 = (i7 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j7 = this.zzg;
        int i9 = ((((((i8 + ((int) (j7 ^ (j7 >>> 32)))) * 31) + (this.zzh ? 1 : 0)) * 31) + (this.zzi ? 1 : 0)) * 31) + (this.zzk ? 1 : 0);
        long j8 = this.zzm;
        return ((((((i9 * 961) + ((int) (j8 ^ (j8 >>> 32)))) * 31) + this.zzn) * 31) + this.zzo) * 31;
    }

    public final zzbm zza(Object obj, zzap zzapVar, Object obj2, long j, long j3, long j7, boolean z4, boolean z7, zzaj zzajVar, long j8, long j9, int i7, int i8, long j10) {
        this.zzb = obj;
        this.zzd = zzapVar == null ? zzp : zzapVar;
        this.zzc = null;
        this.zze = -9223372036854775807L;
        this.zzf = -9223372036854775807L;
        this.zzg = -9223372036854775807L;
        this.zzh = z4;
        this.zzi = z7;
        this.zzj = zzajVar;
        this.zzl = 0L;
        this.zzm = j9;
        this.zzn = 0;
        this.zzo = 0;
        this.zzk = false;
        return this;
    }

    public final boolean zzb() {
        return this.zzj != null;
    }
}
