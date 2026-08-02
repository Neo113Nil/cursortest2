package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
public final class zzalp implements zzacv {
    private final zzalq zza = new zzalq(null, 0, "audio/ac3");
    private final zzed zzb = new zzed(2786);
    private boolean zzc;

    @Override // com.google.android.gms.internal.ads.zzacv
    public final int zzb(zzacw zzacwVar, zzadr zzadrVar) {
        int zza = zzacwVar.zza(this.zzb.zzN(), 0, 2786);
        if (zza == -1) {
            return -1;
        }
        this.zzb.zzL(0);
        this.zzb.zzK(zza);
        if (!this.zzc) {
            this.zza.zzd(0L, 4);
            this.zzc = true;
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
        this.zza.zzb(zzacyVar, new zzanm(Integer.MIN_VALUE, 0, 1));
        zzacyVar.zzG();
        zzacyVar.zzP(new zzadt(-9223372036854775807L, 0L));
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final void zzf(long j, long j3) {
        this.zzc = false;
        this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final boolean zzi(zzacw zzacwVar) {
        zzed zzedVar = new zzed(10);
        int i7 = 0;
        while (true) {
            zzack zzackVar = (zzack) zzacwVar;
            zzackVar.zzm(zzedVar.zzN(), 0, 10, false);
            zzedVar.zzL(0);
            if (zzedVar.zzo() != 4801587) {
                break;
            }
            zzedVar.zzM(3);
            int zzl = zzedVar.zzl();
            i7 += zzl + 10;
            zzackVar.zzl(zzl, false);
        }
        zzacwVar.zzj();
        zzack zzackVar2 = (zzack) zzacwVar;
        zzackVar2.zzl(i7, false);
        int i8 = 0;
        int i9 = i7;
        while (true) {
            zzackVar2.zzm(zzedVar.zzN(), 0, 6, false);
            zzedVar.zzL(0);
            if (zzedVar.zzq() != 2935) {
                zzacwVar.zzj();
                i9++;
                if (i9 - i7 >= 8192) {
                    return false;
                }
                zzackVar2.zzl(i9, false);
                i8 = 0;
            } else {
                i8++;
                if (i8 >= 4) {
                    return true;
                }
                int zzb = zzabu.zzb(zzedVar.zzN());
                if (zzb == -1) {
                    return false;
                }
                zzackVar2.zzl(zzb - 6, false);
            }
        }
    }
}
