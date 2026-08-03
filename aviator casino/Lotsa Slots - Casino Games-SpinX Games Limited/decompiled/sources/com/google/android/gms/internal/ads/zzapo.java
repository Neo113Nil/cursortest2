package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzapo implements com.google.android.gms.internal.ads.zzafy {
    private final com.google.android.gms.internal.ads.zzapp zza;
    private final com.google.android.gms.internal.ads.zzet zzb;
    private final com.google.android.gms.internal.ads.zzet zzc;
    private final com.google.android.gms.internal.ads.zzes zzd;
    private com.google.android.gms.internal.ads.zzagb zze;
    private long zzf;
    private long zzg;
    private boolean zzh;
    private boolean zzi;

    static {
        int i = com.google.android.gms.internal.ads.zzapn.zza;
    }

    public zzapo() {
        throw null;
    }

    public zzapo(int i) {
        this.zza = new com.google.android.gms.internal.ads.zzapp(true, null, 0, "audio/mp4a-latm");
        this.zzb = new com.google.android.gms.internal.ads.zzet(2048);
        this.zzg = -1L;
        com.google.android.gms.internal.ads.zzet zzetVar = new com.google.android.gms.internal.ads.zzet(10);
        this.zzc = zzetVar;
        byte[] zzi = zzetVar.zzi();
        this.zzd = new com.google.android.gms.internal.ads.zzes(zzi, zzi.length);
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zza(com.google.android.gms.internal.ads.zzafz zzafzVar) throws java.io.IOException {
        com.google.android.gms.internal.ads.zzet zzetVar;
        com.google.android.gms.internal.ads.zzafp zzafpVar;
        int i = 0;
        while (true) {
            zzetVar = this.zzc;
            zzafpVar = (com.google.android.gms.internal.ads.zzafp) zzafzVar;
            zzafpVar.zzh(zzetVar.zzi(), 0, 10, false);
            zzetVar.zzh(0);
            if (zzetVar.zzx() != 4801587) {
                break;
            }
            zzetVar.zzk(3);
            int zzG = zzetVar.zzG();
            i += zzG + 10;
            zzafpVar.zzj(zzG, false);
        }
        zzafzVar.zzl();
        zzafpVar.zzj(i, false);
        if (this.zzg == -1) {
            this.zzg = i;
        }
        int i2 = i;
        int i3 = 0;
        int i4 = 0;
        do {
            zzafpVar.zzh(zzetVar.zzi(), 0, 2, false);
            zzetVar.zzh(0);
            if (com.google.android.gms.internal.ads.zzapp.zzf(zzetVar.zzt())) {
                i3++;
                if (i3 >= 4 && i4 > 188) {
                    return true;
                }
                zzafpVar.zzh(zzetVar.zzi(), 0, 4, false);
                com.google.android.gms.internal.ads.zzes zzesVar = this.zzd;
                zzesVar.zzf(14);
                int zzj = zzesVar.zzj(13);
                if (zzj <= 6) {
                    i2++;
                    zzafzVar.zzl();
                    zzafpVar.zzj(i2, false);
                } else {
                    zzafpVar.zzj(zzj - 6, false);
                    i4 += zzj;
                }
            } else {
                i2++;
                zzafzVar.zzl();
                zzafpVar.zzj(i2, false);
            }
            i3 = 0;
            i4 = 0;
        } while (i2 - i < 8192);
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public /* synthetic */ java.util.List zzb() {
        java.util.List zzi;
        zzi = com.google.android.gms.internal.ads.zzgwm.zzi();
        return zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zzc(com.google.android.gms.internal.ads.zzagb zzagbVar) {
        this.zze = zzagbVar;
        this.zza.zzb(zzagbVar, new com.google.android.gms.internal.ads.zzarh(Integer.MIN_VALUE, 0, 1));
        zzagbVar.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final int zzd(com.google.android.gms.internal.ads.zzafz zzafzVar, com.google.android.gms.internal.ads.zzagy zzagyVar) throws java.io.IOException {
        this.zze.getClass();
        com.google.android.gms.internal.ads.zzet zzetVar = this.zzb;
        int zza = zzafzVar.zza(zzetVar.zzi(), 0, 2048);
        if (!this.zzi) {
            this.zze.zzw(new com.google.android.gms.internal.ads.zzaha(-9223372036854775807L, 0L));
            this.zzi = true;
        }
        if (zza == -1) {
            return -1;
        }
        zzetVar.zzh(0);
        zzetVar.zzf(zza);
        if (!this.zzh) {
            this.zza.zzc(this.zzf, 4);
            this.zzh = true;
        }
        this.zza.zzd(zzetVar);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zze(long j, long j2) {
        this.zzh = false;
        this.zza.zza();
        this.zzf = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public /* synthetic */ com.google.android.gms.internal.ads.zzafy zzg() {
        return com.google.android.gms.internal.ads.zzafy.CC.$default$zzg(this);
    }
}
