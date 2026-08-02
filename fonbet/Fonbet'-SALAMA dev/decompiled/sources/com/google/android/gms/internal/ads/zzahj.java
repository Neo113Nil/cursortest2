package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzahj implements zzahg {
    private final long zza;
    private final int zzb;
    private final long zzc;
    private final int zzd;
    private final long zze;
    private final long zzf;
    private final long[] zzg;

    private zzahj(long j, int i7, long j3, int i8, long j7, long[] jArr) {
        this.zza = j;
        this.zzb = i7;
        this.zzc = j3;
        this.zzd = i8;
        this.zze = j7;
        this.zzg = jArr;
        this.zzf = j7 != -1 ? j + j7 : -1L;
    }

    public static zzahj zzb(zzahi zzahiVar, long j) {
        long[] jArr;
        long zza = zzahiVar.zza();
        if (zza == -9223372036854775807L) {
            return null;
        }
        long j3 = zzahiVar.zzc;
        if (j3 == -1 || (jArr = zzahiVar.zzf) == null) {
            zzadn zzadnVar = zzahiVar.zza;
            return new zzahj(j, zzadnVar.zzc, zza, zzadnVar.zzf, -1L, null);
        }
        zzadn zzadnVar2 = zzahiVar.zza;
        return new zzahj(j, zzadnVar2.zzc, zza, zzadnVar2.zzf, j3, jArr);
    }

    private final long zzf(int i7) {
        return (this.zzc * i7) / 100;
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzahg
    public final int zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzahg
    public final long zzd() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzahg
    public final long zze(long j) {
        if (!zzh()) {
            return 0L;
        }
        long j3 = j - this.zza;
        if (j3 <= this.zzb) {
            return 0L;
        }
        long[] jArr = this.zzg;
        zzcv.zzb(jArr);
        double d7 = (j3 * 256.0d) / this.zze;
        int zzd = zzen.zzd(jArr, (long) d7, true, true);
        long zzf = zzf(zzd);
        long j7 = jArr[zzd];
        int i7 = zzd + 1;
        long zzf2 = zzf(i7);
        return Math.round((j7 == (zzd == 99 ? 256L : jArr[i7]) ? 0.0d : (d7 - j7) / (r0 - j7)) * (zzf2 - zzf)) + zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final zzads zzg(long j) {
        if (!zzh()) {
            zzadv zzadvVar = new zzadv(0L, this.zza + this.zzb);
            return new zzads(zzadvVar, zzadvVar);
        }
        long j3 = this.zzc;
        int i7 = zzen.zza;
        long max = Math.max(0L, Math.min(j, j3));
        double d7 = (max * 100.0d) / this.zzc;
        double d8 = 0.0d;
        if (d7 > 0.0d) {
            if (d7 >= 100.0d) {
                d8 = 256.0d;
            } else {
                int i8 = (int) d7;
                long[] jArr = this.zzg;
                zzcv.zzb(jArr);
                double d9 = jArr[i8];
                d8 = (((i8 == 99 ? 256.0d : jArr[i8 + 1]) - d9) * (d7 - i8)) + d9;
            }
        }
        long j7 = this.zze;
        zzadv zzadvVar2 = new zzadv(max, this.zza + Math.max(this.zzb, Math.min(Math.round((d8 / 256.0d) * j7), j7 - 1)));
        return new zzads(zzadvVar2, zzadvVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final boolean zzh() {
        return this.zzg != null;
    }
}
