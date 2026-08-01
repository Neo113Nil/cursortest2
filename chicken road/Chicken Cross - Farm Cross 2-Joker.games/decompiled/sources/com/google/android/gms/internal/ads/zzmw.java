package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzmw {
    private static final zzxo zzu = new zzxo(new Object(), -1);
    public final zzbf zza;
    public final zzxo zzb;
    public final long zzc;
    public final long zzd;
    public final int zze;
    public final zzjn zzf;
    public final boolean zzg;
    public final zzzr zzh;
    public final zzabm zzi;
    public final List zzj;
    public final zzxo zzk;
    public final boolean zzl;
    public final int zzm;
    public final int zzn;
    public final zzav zzo;
    public final boolean zzp = false;
    public volatile long zzq;
    public volatile long zzr;
    public volatile long zzs;
    public volatile long zzt;

    public zzmw(zzbf zzbfVar, zzxo zzxoVar, long j, long j2, int i, zzjn zzjnVar, boolean z, zzzr zzzrVar, zzabm zzabmVar, List list, zzxo zzxoVar2, boolean z2, int i2, int i3, zzav zzavVar, long j3, long j4, long j5, long j6, boolean z3) {
        this.zza = zzbfVar;
        this.zzb = zzxoVar;
        this.zzc = j;
        this.zzd = j2;
        this.zze = i;
        this.zzf = zzjnVar;
        this.zzg = z;
        this.zzh = zzzrVar;
        this.zzi = zzabmVar;
        this.zzj = list;
        this.zzk = zzxoVar2;
        this.zzl = z2;
        this.zzm = i2;
        this.zzn = i3;
        this.zzo = zzavVar;
        this.zzq = j3;
        this.zzr = j4;
        this.zzs = j5;
        this.zzt = j6;
    }

    public static zzmw zza(zzabm zzabmVar) {
        zzbf zzbfVar = zzbf.zza;
        zzxo zzxoVar = zzu;
        return new zzmw(zzbfVar, zzxoVar, -9223372036854775807L, 0L, 1, null, false, zzzr.zza, zzabmVar, zzgxm.zzi(), zzxoVar, false, 1, 0, zzav.zza, 0L, 0L, 0L, 0L, false);
    }

    public static zzxo zzb() {
        return zzu;
    }

    public final zzmw zzc(zzxo zzxoVar, long j, long j2, long j3, long j4, zzzr zzzrVar, zzabm zzabmVar, List list) {
        zzxo zzxoVar2 = this.zzk;
        boolean z = this.zzl;
        int i = this.zzm;
        int i2 = this.zzn;
        zzav zzavVar = this.zzo;
        long j5 = this.zzq;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        return new zzmw(this.zza, zzxoVar, j2, j3, this.zze, this.zzf, this.zzg, zzzrVar, zzabmVar, list, zzxoVar2, z, i, i2, zzavVar, j5, j4, j, elapsedRealtime, false);
    }

    public final zzmw zzd(zzbf zzbfVar) {
        return new zzmw(zzbfVar, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final zzmw zze(int i) {
        return new zzmw(this.zza, this.zzb, this.zzc, this.zzd, i, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final zzmw zzf(zzjn zzjnVar) {
        return new zzmw(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzjnVar, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final zzmw zzg(boolean z) {
        return new zzmw(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, z, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final zzmw zzh(zzxo zzxoVar) {
        return new zzmw(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, zzxoVar, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final zzmw zzi(boolean z, int i, int i2) {
        return new zzmw(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, z, i, i2, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final boolean zzj() {
        return this.zze == 3 && this.zzl && this.zzn == 0;
    }
}
