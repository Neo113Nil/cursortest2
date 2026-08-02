package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
public final class zzafc implements zzacv {
    private zzacy zzf;
    private boolean zzh;
    private long zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private boolean zzn;
    private zzafb zzo;
    private zzafg zzp;
    private final zzed zza = new zzed(4);
    private final zzed zzb = new zzed(9);
    private final zzed zzc = new zzed(11);
    private final zzed zzd = new zzed();
    private final zzafd zze = new zzafd();
    private int zzg = 1;

    private final zzed zza(zzacw zzacwVar) {
        if (this.zzl > this.zzd.zzc()) {
            zzed zzedVar = this.zzd;
            int zzc = zzedVar.zzc();
            zzedVar.zzJ(new byte[Math.max(zzc + zzc, this.zzl)], 0);
        } else {
            this.zzd.zzL(0);
        }
        this.zzd.zzK(this.zzl);
        zzacwVar.zzi(this.zzd.zzN(), 0, this.zzl);
        return this.zzd;
    }

    private final void zzg() {
        if (this.zzn) {
            return;
        }
        this.zzf.zzP(new zzadt(-9223372036854775807L, 0L));
        this.zzn = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0009 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzacv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzb(zzacw zzacwVar, zzadr zzadrVar) {
        boolean zzf;
        boolean z4;
        zzcv.zzb(this.zzf);
        while (true) {
            int i7 = this.zzg;
            int i8 = 8;
            if (i7 != 1) {
                if (i7 == 2) {
                    zzacwVar.zzk(this.zzj);
                    this.zzj = 0;
                    this.zzg = 3;
                } else if (i7 != 3) {
                    if (i7 != 4) {
                        throw new IllegalStateException();
                    }
                    long j = this.zzh ? this.zzi + this.zzm : this.zze.zzc() == -9223372036854775807L ? 0L : this.zzm;
                    int i9 = this.zzk;
                    if (i9 != 8) {
                        i8 = i9;
                    } else if (this.zzo != null) {
                        zzg();
                        zzf = this.zzo.zzf(zza(zzacwVar), j);
                        z4 = true;
                        if (!this.zzh && zzf) {
                            this.zzh = true;
                            this.zzi = this.zze.zzc() != -9223372036854775807L ? -this.zzm : 0L;
                        }
                        this.zzj = 4;
                        this.zzg = 2;
                        if (!z4) {
                            return 0;
                        }
                    }
                    if (i8 == 9) {
                        if (this.zzp != null) {
                            zzg();
                            zzf = this.zzp.zzf(zza(zzacwVar), j);
                            z4 = true;
                        }
                        zzacwVar.zzk(this.zzl);
                        zzf = false;
                        z4 = false;
                    } else {
                        if (i8 == 18 && !this.zzn) {
                            zzf = this.zze.zzf(zza(zzacwVar), j);
                            zzafd zzafdVar = this.zze;
                            long zzc = zzafdVar.zzc();
                            if (zzc != -9223372036854775807L) {
                                this.zzf.zzP(new zzadm(zzafdVar.zzd(), zzafdVar.zze(), zzc));
                                this.zzn = true;
                            }
                            z4 = true;
                        }
                        zzacwVar.zzk(this.zzl);
                        zzf = false;
                        z4 = false;
                    }
                    if (!this.zzh) {
                        this.zzh = true;
                        this.zzi = this.zze.zzc() != -9223372036854775807L ? -this.zzm : 0L;
                    }
                    this.zzj = 4;
                    this.zzg = 2;
                    if (!z4) {
                    }
                } else {
                    if (!zzacwVar.zzn(this.zzc.zzN(), 0, 11, true)) {
                        return -1;
                    }
                    this.zzc.zzL(0);
                    this.zzk = this.zzc.zzm();
                    this.zzl = this.zzc.zzo();
                    this.zzm = this.zzc.zzo();
                    this.zzm = (this.zzm | (this.zzc.zzm() << 24)) * 1000;
                    this.zzc.zzM(3);
                    this.zzg = 4;
                }
            } else {
                if (!zzacwVar.zzn(this.zzb.zzN(), 0, 9, true)) {
                    return -1;
                }
                this.zzb.zzL(0);
                this.zzb.zzM(4);
                int zzm = this.zzb.zzm();
                int i10 = zzm & 4;
                int i11 = zzm & 1;
                if (i10 != 0 && this.zzo == null) {
                    this.zzo = new zzafb(this.zzf.zzw(8, 1));
                }
                if (i11 != 0 && this.zzp == null) {
                    this.zzp = new zzafg(this.zzf.zzw(9, 2));
                }
                this.zzf.zzG();
                this.zzj = this.zzb.zzg() - 5;
                this.zzg = 2;
            }
        }
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
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final void zzf(long j, long j3) {
        if (j == 0) {
            this.zzg = 1;
            this.zzh = false;
        } else {
            this.zzg = 3;
        }
        this.zzj = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final boolean zzi(zzacw zzacwVar) {
        zzack zzackVar = (zzack) zzacwVar;
        zzackVar.zzm(this.zza.zzN(), 0, 3, false);
        this.zza.zzL(0);
        if (this.zza.zzo() != 4607062) {
            return false;
        }
        zzackVar.zzm(this.zza.zzN(), 0, 2, false);
        this.zza.zzL(0);
        if ((this.zza.zzq() & 250) != 0) {
            return false;
        }
        zzackVar.zzm(this.zza.zzN(), 0, 4, false);
        this.zza.zzL(0);
        int zzg = this.zza.zzg();
        zzacwVar.zzj();
        zzack zzackVar2 = (zzack) zzacwVar;
        zzackVar2.zzl(zzg, false);
        zzackVar2.zzm(this.zza.zzN(), 0, 4, false);
        this.zza.zzL(0);
        return this.zza.zzg() == 0;
    }
}
