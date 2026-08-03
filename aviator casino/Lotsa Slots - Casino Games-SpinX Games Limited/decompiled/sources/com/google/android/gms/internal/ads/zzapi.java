package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzapi implements com.google.android.gms.internal.ads.zzafy {
    private final com.google.android.gms.internal.ads.zzapj zza = new com.google.android.gms.internal.ads.zzapj(null, 0, "audio/ac3");
    private final com.google.android.gms.internal.ads.zzet zzb = new com.google.android.gms.internal.ads.zzet(2786);
    private boolean zzc;

    static {
        int i = com.google.android.gms.internal.ads.zzaph.zza;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003a, code lost:
    
        r9.zzl();
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0043, code lost:
    
        if ((r4 - r3) >= 8192) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0049, code lost:
    
        return false;
     */
    @Override // com.google.android.gms.internal.ads.zzafy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zza(com.google.android.gms.internal.ads.zzafz zzafzVar) throws java.io.IOException {
        com.google.android.gms.internal.ads.zzafp zzafpVar;
        com.google.android.gms.internal.ads.zzet zzetVar = new com.google.android.gms.internal.ads.zzet(10);
        int i = 0;
        while (true) {
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
        int i2 = i;
        while (true) {
            int i3 = 0;
            while (true) {
                zzafpVar.zzh(zzetVar.zzi(), 0, 6, false);
                zzetVar.zzh(0);
                if (zzetVar.zzt() != 2935) {
                    break;
                }
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                int zzd = com.google.android.gms.internal.ads.zzaey.zzd(zzetVar.zzi());
                if (zzd == -1) {
                    return false;
                }
                zzafpVar.zzj(zzd - 6, false);
            }
            zzafpVar.zzj(i2, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public /* synthetic */ java.util.List zzb() {
        java.util.List zzi;
        zzi = com.google.android.gms.internal.ads.zzgwm.zzi();
        return zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zzc(com.google.android.gms.internal.ads.zzagb zzagbVar) {
        this.zza.zzb(zzagbVar, new com.google.android.gms.internal.ads.zzarh(Integer.MIN_VALUE, 0, 1));
        zzagbVar.zzv();
        zzagbVar.zzw(new com.google.android.gms.internal.ads.zzaha(-9223372036854775807L, 0L));
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final int zzd(com.google.android.gms.internal.ads.zzafz zzafzVar, com.google.android.gms.internal.ads.zzagy zzagyVar) throws java.io.IOException {
        com.google.android.gms.internal.ads.zzet zzetVar = this.zzb;
        int zza = zzafzVar.zza(zzetVar.zzi(), 0, 2786);
        if (zza == -1) {
            return -1;
        }
        zzetVar.zzh(0);
        zzetVar.zzf(zza);
        if (!this.zzc) {
            this.zza.zzc(0L, 4);
            this.zzc = true;
        }
        this.zza.zzd(zzetVar);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zze(long j, long j2) {
        this.zzc = false;
        this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public /* synthetic */ com.google.android.gms.internal.ads.zzafy zzg() {
        return com.google.android.gms.internal.ads.zzafy.CC.$default$zzg(this);
    }
}
