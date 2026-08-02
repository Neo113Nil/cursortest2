package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
final class zzafj implements zzacv {
    private zzacy zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private zzagm zzg;
    private zzacw zzh;
    private zzafm zzi;
    private zzaii zzj;
    private final zzed zza = new zzed(6);
    private long zzf = -1;

    private final int zza(zzacw zzacwVar) {
        this.zza.zzI(2);
        ((zzack) zzacwVar).zzm(this.zza.zzN(), 0, 2, false);
        return this.zza.zzq();
    }

    private final void zzg() {
        zzacy zzacyVar = this.zzb;
        zzacyVar.getClass();
        zzacyVar.zzG();
        this.zzb.zzP(new zzadt(-9223372036854775807L, 0L));
        this.zzc = 6;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0188  */
    @Override // com.google.android.gms.internal.ads.zzacv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzb(zzacw zzacwVar, zzadr zzadrVar) {
        int i7;
        String zzy;
        zzafl zza;
        zzagm zzagmVar;
        long j;
        int i8 = this.zzc;
        long j3 = -1;
        if (i8 == 0) {
            this.zza.zzI(2);
            zzacwVar.zzi(this.zza.zzN(), 0, 2);
            int zzq = this.zza.zzq();
            this.zzd = zzq;
            if (zzq == 65498) {
                if (this.zzf != -1) {
                    this.zzc = 4;
                    return 0;
                }
                zzg();
                return 0;
            }
            if ((zzq >= 65488 && zzq <= 65497) || zzq == 65281) {
                return 0;
            }
            this.zzc = 1;
            return 0;
        }
        if (i8 == 1) {
            this.zza.zzI(2);
            zzacwVar.zzi(this.zza.zzN(), 0, 2);
            this.zze = this.zza.zzq() - 2;
            this.zzc = 2;
            return 0;
        }
        if (i8 != 2) {
            if (i8 != 4) {
                if (i8 != 5) {
                    if (i8 == 6) {
                        return -1;
                    }
                    throw new IllegalStateException();
                }
                if (this.zzi == null || zzacwVar != this.zzh) {
                    this.zzh = zzacwVar;
                    this.zzi = new zzafm(zzacwVar, this.zzf);
                }
                zzaii zzaiiVar = this.zzj;
                zzaiiVar.getClass();
                int zzb = zzaiiVar.zzb(this.zzi, zzadrVar);
                if (zzb == 1) {
                    zzadrVar.zza += this.zzf;
                }
                return zzb;
            }
            long zzf = zzacwVar.zzf();
            long j7 = this.zzf;
            if (zzf != j7) {
                zzadrVar.zza = j7;
                return 1;
            }
            if (zzacwVar.zzm(this.zza.zzN(), 0, 1, true)) {
                zzacwVar.zzj();
                if (this.zzj == null) {
                    this.zzj = new zzaii(zzajq.zza, 8);
                }
                zzafm zzafmVar = new zzafm(zzacwVar, this.zzf);
                this.zzi = zzafmVar;
                if (this.zzj.zzi(zzafmVar)) {
                    zzaii zzaiiVar2 = this.zzj;
                    long j8 = this.zzf;
                    zzacy zzacyVar = this.zzb;
                    zzacyVar.getClass();
                    zzaiiVar2.zze(new zzafo(j8, zzacyVar));
                    zzagm zzagmVar2 = this.zzg;
                    zzagmVar2.getClass();
                    zzacy zzacyVar2 = this.zzb;
                    zzacyVar2.getClass();
                    zzaeb zzw = zzacyVar2.zzw(1024, 4);
                    zzx zzxVar = new zzx();
                    zzxVar.zzE("image/jpeg");
                    zzxVar.zzW(new zzav(-9223372036854775807L, zzagmVar2));
                    zzw.zzm(zzxVar.zzaj());
                    this.zzc = 5;
                } else {
                    zzg();
                }
            } else {
                zzg();
            }
            return 0;
        }
        if (this.zzd == 65505) {
            zzed zzedVar = new zzed(this.zze);
            zzacwVar.zzi(zzedVar.zzN(), 0, this.zze);
            if (this.zzg != null || !"http://ns.adobe.com/xap/1.0/".equals(zzedVar.zzy((char) 0)) || (zzy = zzedVar.zzy((char) 0)) == null) {
                i7 = 0;
                this.zzc = i7;
                return i7;
            }
            long zzd = zzacwVar.zzd();
            if (zzd != -1 && (zza = zzafp.zza(zzy)) != null && zza.zzb.size() >= 2) {
                int size = zza.zzb.size() - 1;
                boolean z4 = false;
                long j9 = -1;
                long j10 = -1;
                long j11 = -1;
                long j12 = -1;
                while (size >= 0) {
                    zzafk zzafkVar = (zzafk) zza.zzb.get(size);
                    boolean equals = "video/mp4".equals(zzafkVar.zza) | z4;
                    if (size == 0) {
                        zzd -= zzafkVar.zzc;
                        j = 0;
                    } else {
                        j = zzd - zzafkVar.zzb;
                    }
                    long j13 = zzd;
                    zzd = j;
                    if (!equals || zzd == j13) {
                        z4 = equals;
                    } else {
                        j12 = j13 - zzd;
                        j11 = zzd;
                        z4 = false;
                    }
                    if (size == 0) {
                        j10 = j13;
                    }
                    if (size == 0) {
                        j9 = zzd;
                    }
                    size--;
                    j3 = -1;
                }
                long j14 = j3;
                if (j11 != j14 && j12 != j14 && j9 != j14 && j10 != j14) {
                    zzagmVar = new zzagm(j9, j10, zza.zza, j11, j12);
                    this.zzg = zzagmVar;
                    if (zzagmVar != null) {
                        this.zzf = zzagmVar.zzd;
                    }
                }
            }
            zzagmVar = null;
            this.zzg = zzagmVar;
            if (zzagmVar != null) {
            }
        } else {
            zzacwVar.zzk(this.zze);
        }
        i7 = 0;
        this.zzc = i7;
        return i7;
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
        this.zzb = zzacyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final void zzf(long j, long j3) {
        if (j == 0) {
            this.zzc = 0;
            this.zzj = null;
        } else if (this.zzc == 5) {
            zzaii zzaiiVar = this.zzj;
            zzaiiVar.getClass();
            zzaiiVar.zzf(j, j3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final boolean zzi(zzacw zzacwVar) {
        if (zza(zzacwVar) != 65496) {
            return false;
        }
        int zza = zza(zzacwVar);
        this.zzd = zza;
        if (zza == 65504) {
            this.zza.zzI(2);
            zzack zzackVar = (zzack) zzacwVar;
            zzackVar.zzm(this.zza.zzN(), 0, 2, false);
            zzackVar.zzl(this.zza.zzq() - 2, false);
            zza = zza(zzacwVar);
            this.zzd = zza;
        }
        if (zza == 65505) {
            zzack zzackVar2 = (zzack) zzacwVar;
            zzackVar2.zzl(2, false);
            this.zza.zzI(6);
            zzackVar2.zzm(this.zza.zzN(), 0, 6, false);
            if (this.zza.zzu() == 1165519206 && this.zza.zzq() == 0) {
                return true;
            }
        }
        return false;
    }
}
