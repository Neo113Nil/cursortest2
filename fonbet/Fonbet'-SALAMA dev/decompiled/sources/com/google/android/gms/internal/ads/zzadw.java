package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
public final class zzadw implements zzacv {
    private final int zza;
    private final int zzb;
    private final String zzc;
    private int zzd;
    private int zze;
    private zzacy zzf;
    private zzaeb zzg;

    public zzadw(int i7, int i8, String str) {
        this.zza = i7;
        this.zzb = i8;
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final int zzb(zzacw zzacwVar, zzadr zzadrVar) {
        int i7 = this.zze;
        if (i7 != 1) {
            if (i7 == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        zzaeb zzaebVar = this.zzg;
        zzaebVar.getClass();
        int zzf = zzaebVar.zzf(zzacwVar, 1024, true);
        if (zzf == -1) {
            this.zze = 2;
            this.zzg.zzt(0L, 1, this.zzd, 0, null);
            this.zzd = 0;
        } else {
            this.zzd += zzf;
        }
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
        this.zzf = zzacyVar;
        zzaeb zzw = zzacyVar.zzw(1024, 4);
        this.zzg = zzw;
        zzx zzxVar = new zzx();
        String str = this.zzc;
        zzxVar.zzE(str);
        zzxVar.zzad(str);
        zzw.zzm(zzxVar.zzaj());
        this.zzf.zzG();
        this.zzf.zzP(new zzadx(-9223372036854775807L));
        this.zze = 1;
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final void zzf(long j, long j3) {
        if (j == 0 || this.zze == 1) {
            this.zze = 1;
            this.zzd = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final boolean zzi(zzacw zzacwVar) {
        zzcv.zzf((this.zza == -1 || this.zzb == -1) ? false : true);
        zzed zzedVar = new zzed(this.zzb);
        ((zzack) zzacwVar).zzm(zzedVar.zzN(), 0, this.zzb, false);
        return zzedVar.zzq() == this.zza;
    }
}
