package com.google.android.gms.internal.ads;

import android.util.Pair;
import e1.k;
import java.util.List;

/* loaded from: classes.dex */
public final class zzant implements zzacv {
    private zzacy zza;
    private zzaeb zzb;
    private zzanr zze;
    private int zzc = 0;
    private long zzd = -1;
    private int zzf = -1;
    private long zzg = -1;

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00df, code lost:
    
        if (r1 != 65534) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e6, code lost:
    
        if (r2 == 32) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0103  */
    @Override // com.google.android.gms.internal.ads.zzacv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzb(zzacw zzacwVar, zzadr zzadrVar) {
        int i7;
        zzcv.zzb(this.zzb);
        int i8 = zzen.zza;
        int i9 = this.zzc;
        int i10 = 4;
        if (i9 == 0) {
            zzcv.zzf(zzacwVar.zzf() == 0);
            int i11 = this.zzf;
            if (i11 != -1) {
                zzacwVar.zzk(i11);
                this.zzc = 4;
            } else {
                if (!zzanw.zzc(zzacwVar)) {
                    throw zzaz.zza("Unsupported or unrecognized wav file type.", null);
                }
                zzacwVar.zzk((int) (zzacwVar.zze() - zzacwVar.zzf()));
                this.zzc = 1;
            }
            return 0;
        }
        long j = -1;
        if (i9 == 1) {
            zzed zzedVar = new zzed(8);
            zzanv zza = zzanv.zza(zzacwVar, zzedVar);
            if (zza.zza != 1685272116) {
                zzacwVar.zzj();
            } else {
                zzacwVar.zzg(8);
                zzedVar.zzL(0);
                zzacwVar.zzh(zzedVar.zzN(), 0, 8);
                j = zzedVar.zzr();
                zzacwVar.zzk(((int) zza.zzb) + 8);
            }
            this.zzd = j;
            this.zzc = 2;
            return 0;
        }
        if (i9 == 2) {
            zzanu zzb = zzanw.zzb(zzacwVar);
            int i12 = zzb.zza;
            if (i12 == 17) {
                this.zze = new zzanq(this.zza, this.zzb, zzb);
            } else if (i12 == 6) {
                this.zze = new zzans(this.zza, this.zzb, zzb, "audio/g711-alaw", -1);
            } else if (i12 == 7) {
                this.zze = new zzans(this.zza, this.zzb, zzb, "audio/g711-mlaw", -1);
            } else {
                int i13 = zzb.zze;
                if (i12 != 1) {
                    if (i12 != 3) {
                    }
                    i7 = 0;
                    if (i7 != 0) {
                        throw zzaz.zzc("Unsupported WAV format type: " + i12);
                    }
                    this.zze = new zzans(this.zza, this.zzb, zzb, "audio/raw", i7);
                }
                i10 = zzen.zzn(i13);
                i7 = i10;
                if (i7 != 0) {
                }
            }
            this.zzc = 3;
            return 0;
        }
        if (i9 != 3) {
            zzcv.zzf(this.zzg != -1);
            long zzf = this.zzg - zzacwVar.zzf();
            zzanr zzanrVar = this.zze;
            zzanrVar.getClass();
            return zzanrVar.zzc(zzacwVar, zzf) ? -1 : 0;
        }
        Pair zza2 = zzanw.zza(zzacwVar);
        this.zzf = ((Long) zza2.first).intValue();
        long longValue = ((Long) zza2.second).longValue();
        long j3 = this.zzd;
        if (j3 != -1 && longValue == 4294967295L) {
            longValue = j3;
        }
        long j7 = this.zzf + longValue;
        this.zzg = j7;
        long zzd = zzacwVar.zzd();
        if (zzd != -1 && j7 > zzd) {
            StringBuilder j8 = k.j("Data exceeds input length: ", ", ", j7);
            j8.append(zzd);
            zzdq.zzf("WavExtractor", j8.toString());
            this.zzg = zzd;
            j7 = zzd;
        }
        zzanr zzanrVar2 = this.zze;
        zzanrVar2.getClass();
        zzanrVar2.zza(this.zzf, j7);
        this.zzc = 4;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final /* synthetic */ zzacv zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final /* synthetic */ List zzd() {
        return zzfwh.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final void zze(zzacy zzacyVar) {
        this.zza = zzacyVar;
        this.zzb = zzacyVar.zzw(0, 1);
        zzacyVar.zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final void zzf(long j, long j3) {
        this.zzc = j == 0 ? 0 : 4;
        zzanr zzanrVar = this.zze;
        if (zzanrVar != null) {
            zzanrVar.zzb(j3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final boolean zzi(zzacw zzacwVar) {
        return zzanw.zzc(zzacwVar);
    }
}
