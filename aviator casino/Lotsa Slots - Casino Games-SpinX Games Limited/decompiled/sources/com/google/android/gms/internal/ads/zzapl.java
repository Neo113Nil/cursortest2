package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzapl implements com.google.android.gms.internal.ads.zzafy {
    private final com.google.android.gms.internal.ads.zzapm zza = new com.google.android.gms.internal.ads.zzapm(null, 0, "audio/ac4");
    private final com.google.android.gms.internal.ads.zzet zzb = new com.google.android.gms.internal.ads.zzet(16384);
    private boolean zzc;

    static {
        int i = com.google.android.gms.internal.ads.zzapk.zza;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0042, code lost:
    
        r16.zzl();
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
    
        if ((r4 - r3) >= 8192) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
    
        return false;
     */
    @Override // com.google.android.gms.internal.ads.zzafy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zza(com.google.android.gms.internal.ads.zzafz zzafzVar) throws java.io.IOException {
        com.google.android.gms.internal.ads.zzafp zzafpVar;
        int i;
        com.google.android.gms.internal.ads.zzet zzetVar = new com.google.android.gms.internal.ads.zzet(10);
        int i2 = 0;
        while (true) {
            zzafpVar = (com.google.android.gms.internal.ads.zzafp) zzafzVar;
            zzafpVar.zzh(zzetVar.zzi(), 0, 10, false);
            zzetVar.zzh(0);
            if (zzetVar.zzx() != 4801587) {
                break;
            }
            zzetVar.zzk(3);
            int zzG = zzetVar.zzG();
            i2 += zzG + 10;
            zzafpVar.zzj(zzG, false);
        }
        zzafzVar.zzl();
        zzafpVar.zzj(i2, false);
        int i3 = i2;
        while (true) {
            int i4 = 0;
            while (true) {
                int i5 = 7;
                zzafpVar.zzh(zzetVar.zzi(), 0, 7, false);
                zzetVar.zzh(0);
                int zzt = zzetVar.zzt();
                if (zzt != 44096 && zzt != 44097) {
                    break;
                }
                i4++;
                if (i4 >= 4) {
                    return true;
                }
                byte[] zzi = zzetVar.zzi();
                int i6 = com.google.android.gms.internal.ads.zzafb.zza;
                if (zzi.length < 7) {
                    i = -1;
                } else {
                    int i7 = ((zzi[2] & 255) << 8) | (zzi[3] & 255);
                    if (i7 == 65535) {
                        i7 = ((zzi[4] & 255) << 16) | ((zzi[5] & 255) << 8) | (zzi[6] & 255);
                    } else {
                        i5 = 4;
                    }
                    if (zzt == 44097) {
                        i5 += 2;
                    }
                    i = i7 + i5;
                }
                if (i == -1) {
                    return false;
                }
                zzafpVar.zzj(i - 7, false);
            }
            zzafpVar.zzj(i3, false);
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
        int zza = zzafzVar.zza(zzetVar.zzi(), 0, 16384);
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
