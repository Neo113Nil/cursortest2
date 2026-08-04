package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* JADX INFO: loaded from: classes.dex */
final class zzans implements zzanr {
    private final zzacy zza;
    private final zzaeb zzb;
    private final zzanu zzc;
    private final zzz zzd;
    private final int zze;
    private long zzf;
    private int zzg;
    private long zzh;

    public zzans(zzacy zzacyVar, zzaeb zzaebVar, zzanu zzanuVar, String str, int i7) throws zzaz {
        this.zza = zzacyVar;
        this.zzb = zzaebVar;
        this.zzc = zzanuVar;
        int i8 = zzanuVar.zzb * zzanuVar.zze;
        int i9 = zzanuVar.zzd;
        int i10 = i8 / 8;
        if (i9 != i10) {
            throw zzaz.zza("Expected block size: " + i10 + "; got: " + i9, null);
        }
        int i11 = zzanuVar.zzc * i10;
        int i12 = i11 * 8;
        int iMax = Math.max(i10, i11 / 10);
        this.zze = iMax;
        zzx zzxVar = new zzx();
        zzxVar.zzE("audio/wav");
        zzxVar.zzad(str);
        zzxVar.zzA(i12);
        zzxVar.zzY(i12);
        zzxVar.zzT(iMax);
        zzxVar.zzB(zzanuVar.zzb);
        zzxVar.zzae(zzanuVar.zzc);
        zzxVar.zzX(i7);
        this.zzd = zzxVar.zzaj();
    }

    @Override // com.google.android.gms.internal.ads.zzanr
    public final void zza(int i7, long j) {
        zzanx zzanxVar = new zzanx(this.zzc, 1, i7, j);
        this.zza.zzP(zzanxVar);
        this.zzb.zzm(this.zzd);
        this.zzb.zzl(zzanxVar.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzanr
    public final void zzb(long j) {
        this.zzf = j;
        this.zzg = 0;
        this.zzh = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzanr
    public final boolean zzc(zzacw zzacwVar, long j) {
        int i7;
        int i8;
        long j3 = j;
        while (j3 > 0 && (i7 = this.zzg) < (i8 = this.zze)) {
            int iZzf = this.zzb.zzf(zzacwVar, (int) Math.min(i8 - i7, j3), true);
            if (iZzf == -1) {
                j3 = 0;
            } else {
                this.zzg += iZzf;
                j3 -= (long) iZzf;
            }
        }
        zzanu zzanuVar = this.zzc;
        int i9 = this.zzg;
        int i10 = zzanuVar.zzd;
        int i11 = i9 / i10;
        if (i11 > 0) {
            long jZzu = this.zzf + zzen.zzu(this.zzh, 1000000L, zzanuVar.zzc, RoundingMode.DOWN);
            int i12 = i11 * i10;
            int i13 = this.zzg - i12;
            this.zzb.zzt(jZzu, 1, i12, i13, null);
            this.zzh += (long) i11;
            this.zzg = i13;
        }
        return j3 <= 0;
    }
}
