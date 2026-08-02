package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* loaded from: classes.dex */
final class zzaiv implements zzajb {
    private final zzaja zza;
    private final long zzb;
    private final long zzc;
    private final zzajg zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;

    public zzaiv(zzajg zzajgVar, long j, long j3, long j7, long j8, boolean z4) {
        zzcv.zzd(j >= 0 && j3 > j);
        this.zzd = zzajgVar;
        this.zzb = j;
        this.zzc = j3;
        if (j7 == j3 - j || z4) {
            this.zzf = j8;
            this.zze = 4;
        } else {
            this.zze = 0;
        }
        this.zza = new zzaja();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00ab A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ac  */
    @Override // com.google.android.gms.internal.ads.zzajb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zzd(zzacw zzacwVar) {
        long max;
        int i7 = this.zze;
        if (i7 == 0) {
            long zzf = zzacwVar.zzf();
            this.zzg = zzf;
            this.zze = 1;
            long j = this.zzc - 65307;
            if (j > zzf) {
                return j;
            }
        } else if (i7 != 1) {
            if (i7 == 2) {
                long j3 = this.zzi;
                long j7 = this.zzj;
                if (j3 != j7) {
                    long zzf2 = zzacwVar.zzf();
                    if (this.zza.zzc(zzacwVar, j7)) {
                        this.zza.zzb(zzacwVar, false);
                        zzacwVar.zzj();
                        long j8 = this.zzh;
                        zzaja zzajaVar = this.zza;
                        long j9 = zzajaVar.zzb;
                        long j10 = j8 - j9;
                        int i8 = zzajaVar.zzd + zzajaVar.zze;
                        if (j10 < 0 || j10 >= 72000) {
                            if (j10 < 0) {
                                this.zzj = zzf2;
                                this.zzl = j9;
                            } else {
                                this.zzi = i8 + zzacwVar.zzf();
                                this.zzk = j9;
                            }
                            long j11 = this.zzj;
                            long j12 = this.zzi;
                            long j13 = j11 - j12;
                            if (j13 < 100000) {
                                this.zzj = j12;
                                max = j12;
                            } else {
                                long zzf3 = zzacwVar.zzf() - (i8 * (j10 <= 0 ? 2L : 1L));
                                int i9 = zzen.zza;
                                max = Math.max(j12, Math.min(((j10 * j13) / (this.zzl - this.zzk)) + zzf3, j11 - 1));
                            }
                        }
                    } else {
                        max = this.zzi;
                        if (max == zzf2) {
                            throw new IOException("No ogg page can be found.");
                        }
                    }
                    if (max == -1) {
                        return max;
                    }
                    this.zze = 3;
                }
                max = -1;
                if (max == -1) {
                }
            } else if (i7 != 3) {
                return -1L;
            }
            while (true) {
                this.zza.zzc(zzacwVar, -1L);
                this.zza.zzb(zzacwVar, false);
                zzaja zzajaVar2 = this.zza;
                if (zzajaVar2.zzb > this.zzh) {
                    zzacwVar.zzj();
                    this.zze = 4;
                    return -(this.zzk + 2);
                }
                zzacwVar.zzk(zzajaVar2.zzd + zzajaVar2.zze);
                this.zzi = zzacwVar.zzf();
                this.zzk = this.zza.zzb;
            }
        }
        this.zza.zza();
        if (!this.zza.zzc(zzacwVar, -1L)) {
            throw new EOFException();
        }
        this.zza.zzb(zzacwVar, false);
        zzaja zzajaVar3 = this.zza;
        zzacwVar.zzk(zzajaVar3.zzd + zzajaVar3.zze);
        long j14 = this.zza.zzb;
        while (true) {
            zzaja zzajaVar4 = this.zza;
            if ((zzajaVar4.zza & 4) == 4 || !zzajaVar4.zzc(zzacwVar, -1L) || zzacwVar.zzf() >= this.zzc || !this.zza.zzb(zzacwVar, true)) {
                break;
            }
            zzaja zzajaVar5 = this.zza;
            if (!zzacz.zze(zzacwVar, zzajaVar5.zzd + zzajaVar5.zze)) {
                break;
            }
            j14 = this.zza.zzb;
        }
        this.zzf = j14;
        this.zze = 4;
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzajb
    public final /* bridge */ /* synthetic */ zzadu zze() {
        zzaiu zzaiuVar = null;
        if (this.zzf != 0) {
            return new zzait(this, zzaiuVar);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzajb
    public final void zzg(long j) {
        long j3 = this.zzf - 1;
        int i7 = zzen.zza;
        this.zzh = Math.max(0L, Math.min(j, j3));
        this.zze = 2;
        this.zzi = this.zzb;
        this.zzj = this.zzc;
        this.zzk = 0L;
        this.zzl = this.zzf;
    }
}
