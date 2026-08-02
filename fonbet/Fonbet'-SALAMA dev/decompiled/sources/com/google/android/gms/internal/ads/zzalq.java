package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzalq implements zzaly {
    private final zzec zza;
    private final zzed zzb;
    private final String zzc;
    private final int zzd;
    private final String zze;
    private String zzf;
    private zzaeb zzg;
    private int zzh;
    private int zzi;
    private boolean zzj;
    private long zzk;
    private zzz zzl;
    private int zzm;
    private long zzn;

    public zzalq(String str, int i7, String str2) {
        zzec zzecVar = new zzec(new byte[128], 128);
        this.zza = zzecVar;
        this.zzb = new zzed(zzecVar.zza);
        this.zzh = 0;
        this.zzn = -9223372036854775807L;
        this.zzc = str;
        this.zzd = i7;
        this.zze = str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x009a, code lost:
    
        if (java.util.Objects.equals(r4, r2) == false) goto L25;
     */
    @Override // com.google.android.gms.internal.ads.zzaly
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(zzed zzedVar) {
        zzcv.zzb(this.zzg);
        while (zzedVar.zzb() > 0) {
            int i7 = this.zzh;
            if (i7 == 0) {
                while (true) {
                    if (zzedVar.zzb() <= 0) {
                        break;
                    }
                    if (this.zzj) {
                        int zzm = zzedVar.zzm();
                        if (zzm == 119) {
                            this.zzj = false;
                            this.zzh = 1;
                            zzed zzedVar2 = this.zzb;
                            zzedVar2.zzN()[0] = 11;
                            zzedVar2.zzN()[1] = 119;
                            this.zzi = 2;
                            break;
                        }
                        this.zzj = zzm == 11;
                    } else {
                        this.zzj = zzedVar.zzm() == 11;
                    }
                }
            } else if (i7 != 1) {
                int min = Math.min(zzedVar.zzb(), this.zzm - this.zzi);
                this.zzg.zzr(zzedVar, min);
                int i8 = this.zzi + min;
                this.zzi = i8;
                if (i8 == this.zzm) {
                    zzcv.zzf(this.zzn != -9223372036854775807L);
                    this.zzg.zzt(this.zzn, 1, this.zzm, 0, null);
                    this.zzn += this.zzk;
                    this.zzh = 0;
                }
            } else {
                byte[] zzN = this.zzb.zzN();
                int min2 = Math.min(zzedVar.zzb(), 128 - this.zzi);
                zzedVar.zzH(zzN, this.zzi, min2);
                int i9 = this.zzi + min2;
                this.zzi = i9;
                if (i9 == 128) {
                    this.zza.zzl(0);
                    zzabs zze = zzabu.zze(this.zza);
                    zzz zzzVar = this.zzl;
                    if (zzzVar != null && zze.zzc == zzzVar.zzE && zze.zzb == zzzVar.zzF) {
                        String str = zze.zza;
                        String str2 = zzzVar.zzo;
                        int i10 = zzen.zza;
                    }
                    zzx zzxVar = new zzx();
                    zzxVar.zzO(this.zzf);
                    zzxVar.zzE(this.zze);
                    zzxVar.zzad(zze.zza);
                    zzxVar.zzB(zze.zzc);
                    zzxVar.zzae(zze.zzb);
                    zzxVar.zzS(this.zzc);
                    zzxVar.zzab(this.zzd);
                    zzxVar.zzY(zze.zzf);
                    if ("audio/ac3".equals(zze.zza)) {
                        zzxVar.zzA(zze.zzf);
                    }
                    zzz zzaj = zzxVar.zzaj();
                    this.zzl = zzaj;
                    this.zzg.zzm(zzaj);
                    this.zzm = zze.zzd;
                    this.zzk = (zze.zze * 1000000) / this.zzl.zzF;
                    this.zzb.zzL(0);
                    this.zzg.zzr(this.zzb, 128);
                    this.zzh = 2;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaly
    public final void zzb(zzacy zzacyVar, zzanm zzanmVar) {
        zzanmVar.zzc();
        this.zzf = zzanmVar.zzb();
        this.zzg = zzacyVar.zzw(zzanmVar.zza(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzaly
    public final void zzc(boolean z4) {
    }

    @Override // com.google.android.gms.internal.ads.zzaly
    public final void zzd(long j, int i7) {
        this.zzn = j;
    }

    @Override // com.google.android.gms.internal.ads.zzaly
    public final void zze() {
        this.zzh = 0;
        this.zzi = 0;
        this.zzj = false;
        this.zzn = -9223372036854775807L;
    }
}
