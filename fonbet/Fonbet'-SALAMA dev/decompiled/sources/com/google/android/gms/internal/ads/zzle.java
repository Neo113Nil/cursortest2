package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.List;

/* loaded from: classes.dex */
final class zzle {
    private static final zzuq zzu = new zzuq(new Object(), -1);
    public final zzbn zza;
    public final zzuq zzb;
    public final long zzc;
    public final long zzd;
    public final int zze;
    public final zzia zzf;
    public final boolean zzg;
    public final zzwv zzh;
    public final zzyo zzi;
    public final List zzj;
    public final zzuq zzk;
    public final boolean zzl;
    public final int zzm;
    public final int zzn;
    public final zzbb zzo;
    public final boolean zzp = false;
    public volatile long zzq;
    public volatile long zzr;
    public volatile long zzs;
    public volatile long zzt;

    public zzle(zzbn zzbnVar, zzuq zzuqVar, long j, long j3, int i7, zzia zziaVar, boolean z4, zzwv zzwvVar, zzyo zzyoVar, List list, zzuq zzuqVar2, boolean z7, int i8, int i9, zzbb zzbbVar, long j7, long j8, long j9, long j10, boolean z8) {
        this.zza = zzbnVar;
        this.zzb = zzuqVar;
        this.zzc = j;
        this.zzd = j3;
        this.zze = i7;
        this.zzf = zziaVar;
        this.zzg = z4;
        this.zzh = zzwvVar;
        this.zzi = zzyoVar;
        this.zzj = list;
        this.zzk = zzuqVar2;
        this.zzl = z7;
        this.zzm = i8;
        this.zzn = i9;
        this.zzo = zzbbVar;
        this.zzq = j7;
        this.zzr = j8;
        this.zzs = j9;
        this.zzt = j10;
    }

    public static zzle zzh(zzyo zzyoVar) {
        zzbn zzbnVar = zzbn.zza;
        zzuq zzuqVar = zzu;
        return new zzle(zzbnVar, zzuqVar, -9223372036854775807L, 0L, 1, null, false, zzwv.zza, zzyoVar, zzfwh.zzn(), zzuqVar, false, 1, 0, zzbb.zza, 0L, 0L, 0L, 0L, false);
    }

    public static zzuq zzi() {
        return zzu;
    }

    public final zzle zza(boolean z4) {
        return new zzle(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, z4, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final zzle zzb(zzuq zzuqVar) {
        return new zzle(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, zzuqVar, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final zzle zzc(zzuq zzuqVar, long j, long j3, long j7, long j8, zzwv zzwvVar, zzyo zzyoVar, List list) {
        zzuq zzuqVar2 = this.zzk;
        boolean z4 = this.zzl;
        int i7 = this.zzm;
        int i8 = this.zzn;
        zzbb zzbbVar = this.zzo;
        long j9 = this.zzq;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        return new zzle(this.zza, zzuqVar, j3, j7, this.zze, this.zzf, this.zzg, zzwvVar, zzyoVar, list, zzuqVar2, z4, i7, i8, zzbbVar, j9, j8, j, elapsedRealtime, false);
    }

    public final zzle zzd(boolean z4, int i7, int i8) {
        return new zzle(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, z4, i7, i8, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final zzle zze(zzia zziaVar) {
        return new zzle(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zziaVar, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final zzle zzf(int i7) {
        return new zzle(this.zza, this.zzb, this.zzc, this.zzd, i7, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final zzle zzg(zzbn zzbnVar) {
        return new zzle(zzbnVar, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final boolean zzj() {
        return this.zze == 3 && this.zzl && this.zzn == 0;
    }
}
