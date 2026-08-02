package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
public final class zzalt implements zzacv {
    private final zzalu zza;
    private final zzed zzb;
    private final zzed zzc;
    private final zzec zzd;
    private zzacy zze;
    private long zzf;
    private long zzg;
    private boolean zzh;
    private boolean zzi;

    public zzalt() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final int zzb(zzacw zzacwVar, zzadr zzadrVar) {
        zzcv.zzb(this.zze);
        int zza = zzacwVar.zza(this.zzb.zzN(), 0, 2048);
        if (!this.zzi) {
            this.zze.zzP(new zzadt(-9223372036854775807L, 0L));
            this.zzi = true;
        }
        if (zza == -1) {
            return -1;
        }
        this.zzb.zzL(0);
        this.zzb.zzK(zza);
        if (!this.zzh) {
            this.zza.zzd(this.zzf, 4);
            this.zzh = true;
        }
        this.zza.zza(this.zzb);
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
        this.zze = zzacyVar;
        this.zza.zzb(zzacyVar, new zzanm(Integer.MIN_VALUE, 0, 1));
        zzacyVar.zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final void zzf(long j, long j3) {
        this.zzh = false;
        this.zza.zze();
        this.zzf = j3;
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final boolean zzi(zzacw zzacwVar) {
        int i7 = 0;
        while (true) {
            zzack zzackVar = (zzack) zzacwVar;
            zzackVar.zzm(this.zzc.zzN(), 0, 10, false);
            this.zzc.zzL(0);
            if (this.zzc.zzo() != 4801587) {
                break;
            }
            this.zzc.zzM(3);
            int zzl = this.zzc.zzl();
            i7 += zzl + 10;
            zzackVar.zzl(zzl, false);
        }
        zzacwVar.zzj();
        zzack zzackVar2 = (zzack) zzacwVar;
        zzackVar2.zzl(i7, false);
        if (this.zzg == -1) {
            this.zzg = i7;
        }
        int i8 = 0;
        int i9 = 0;
        int i10 = i7;
        do {
            zzackVar2.zzm(this.zzc.zzN(), 0, 2, false);
            this.zzc.zzL(0);
            if (zzalu.zzf(this.zzc.zzq())) {
                i8++;
                if (i8 >= 4 && i9 > 188) {
                    return true;
                }
                zzackVar2.zzm(this.zzc.zzN(), 0, 4, false);
                this.zzd.zzl(14);
                int zzd = this.zzd.zzd(13);
                if (zzd <= 6) {
                    i10++;
                    zzacwVar.zzj();
                    zzackVar2.zzl(i10, false);
                } else {
                    zzackVar2.zzl(zzd - 6, false);
                    i9 += zzd;
                }
            } else {
                i10++;
                zzacwVar.zzj();
                zzackVar2.zzl(i10, false);
            }
            i8 = 0;
            i9 = 0;
        } while (i10 - i7 < 8192);
        return false;
    }

    public zzalt(int i7) {
        this.zza = new zzalu(true, null, 0, "audio/mp4a-latm");
        this.zzb = new zzed(2048);
        this.zzg = -1L;
        zzed zzedVar = new zzed(10);
        this.zzc = zzedVar;
        byte[] zzN = zzedVar.zzN();
        this.zzd = new zzec(zzN, zzN.length);
    }
}
