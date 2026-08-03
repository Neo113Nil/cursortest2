package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzaqs implements com.google.android.gms.internal.ads.zzafy {
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private long zzh;
    private com.google.android.gms.internal.ads.zzaqo zzi;
    private com.google.android.gms.internal.ads.zzagb zzj;
    private boolean zzk;
    private final com.google.android.gms.internal.ads.zzfi zza = new com.google.android.gms.internal.ads.zzfi(0);
    private final com.google.android.gms.internal.ads.zzet zzc = new com.google.android.gms.internal.ads.zzet(4096);
    private final android.util.SparseArray zzb = new android.util.SparseArray();
    private final com.google.android.gms.internal.ads.zzaqp zzd = new com.google.android.gms.internal.ads.zzaqp();

    static {
        int i = com.google.android.gms.internal.ads.zzaqr.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zza(com.google.android.gms.internal.ads.zzafz zzafzVar) throws java.io.IOException {
        byte[] bArr = new byte[14];
        com.google.android.gms.internal.ads.zzafp zzafpVar = (com.google.android.gms.internal.ads.zzafp) zzafzVar;
        zzafpVar.zzh(bArr, 0, 14, false);
        if ((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) != 442 || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        zzafpVar.zzj(bArr[13] & 7, false);
        zzafpVar.zzh(bArr, 0, 3, false);
        return ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255)) == 1;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public /* synthetic */ java.util.List zzb() {
        java.util.List zzi;
        zzi = com.google.android.gms.internal.ads.zzgwm.zzi();
        return zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zzc(com.google.android.gms.internal.ads.zzagb zzagbVar) {
        this.zzj = zzagbVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x012d  */
    @Override // com.google.android.gms.internal.ads.zzafy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzd(com.google.android.gms.internal.ads.zzafz zzafzVar, com.google.android.gms.internal.ads.zzagy zzagyVar) throws java.io.IOException {
        com.google.android.gms.internal.ads.zzapt zzapvVar;
        com.google.android.gms.internal.ads.zzagb zzagbVar = this.zzj;
        zzagbVar.getClass();
        long zzo = zzafzVar.zzo();
        if (zzo != -1) {
            com.google.android.gms.internal.ads.zzaqp zzaqpVar = this.zzd;
            if (!zzaqpVar.zza()) {
                return zzaqpVar.zzc(zzafzVar, zzagyVar);
            }
        }
        if (!this.zzk) {
            this.zzk = true;
            com.google.android.gms.internal.ads.zzaqp zzaqpVar2 = this.zzd;
            if (zzaqpVar2.zzd() != -9223372036854775807L) {
                com.google.android.gms.internal.ads.zzaqo zzaqoVar = new com.google.android.gms.internal.ads.zzaqo(zzaqpVar2.zzb(), zzaqpVar2.zzd(), zzo);
                this.zzi = zzaqoVar;
                this.zzj.zzw(zzaqoVar.zza());
            } else {
                zzagbVar.zzw(new com.google.android.gms.internal.ads.zzaha(zzaqpVar2.zzd(), 0L));
            }
        }
        com.google.android.gms.internal.ads.zzaqo zzaqoVar2 = this.zzi;
        if (zzaqoVar2 != null && zzaqoVar2.zzc()) {
            return zzaqoVar2.zzd(zzafzVar, zzagyVar);
        }
        zzafzVar.zzl();
        long zzm = zzo != -1 ? zzo - zzafzVar.zzm() : -1L;
        if (zzm != -1 && zzm < 4) {
            return -1;
        }
        com.google.android.gms.internal.ads.zzet zzetVar = this.zzc;
        if (!zzafzVar.zzh(zzetVar.zzi(), 0, 4, true)) {
            return -1;
        }
        zzetVar.zzh(0);
        int zzB = zzetVar.zzB();
        if (zzB == 441) {
            return -1;
        }
        if (zzB == 442) {
            zzafzVar.zzi(zzetVar.zzi(), 0, 10);
            zzetVar.zzh(9);
            zzafzVar.zzf((zzetVar.zzs() & 7) + 14);
            return 0;
        }
        if (zzB == 443) {
            zzafzVar.zzi(zzetVar.zzi(), 0, 2);
            zzetVar.zzh(0);
            zzafzVar.zzf(zzetVar.zzt() + 6);
            return 0;
        }
        if ((zzB >> 8) != 1) {
            zzafzVar.zzf(1);
            return 0;
        }
        int i = zzB & 255;
        android.util.SparseArray sparseArray = this.zzb;
        com.google.android.gms.internal.ads.zzaqq zzaqqVar = (com.google.android.gms.internal.ads.zzaqq) sparseArray.get(i);
        if (!this.zze) {
            if (zzaqqVar == null) {
                com.google.android.gms.internal.ads.zzapt zzaptVar = null;
                if (i == 189) {
                    zzapvVar = new com.google.android.gms.internal.ads.zzapj(null, 0, "video/mp2p");
                    this.zzf = true;
                    this.zzh = zzafzVar.zzn();
                } else if ((zzB & 224) == 192) {
                    zzapvVar = new com.google.android.gms.internal.ads.zzaqf(null, 0, "video/mp2p");
                    this.zzf = true;
                    this.zzh = zzafzVar.zzn();
                } else {
                    if ((zzB & 240) == 224) {
                        zzapvVar = new com.google.android.gms.internal.ads.zzapv(null, "video/mp2p");
                        this.zzg = true;
                        this.zzh = zzafzVar.zzn();
                    }
                    if (zzaptVar != null) {
                        zzaptVar.zzb(this.zzj, new com.google.android.gms.internal.ads.zzarh(Integer.MIN_VALUE, i, 256));
                        zzaqqVar = new com.google.android.gms.internal.ads.zzaqq(zzaptVar, this.zza);
                        sparseArray.put(i, zzaqqVar);
                    }
                }
                zzaptVar = zzapvVar;
                if (zzaptVar != null) {
                }
            }
            boolean z = this.zzf;
            long j = android.support.v4.media.session.PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
            if (z && this.zzg) {
                j = this.zzh + android.support.v4.media.session.PlaybackStateCompat.ACTION_PLAY_FROM_URI;
            }
            if (zzafzVar.zzn() > j) {
                this.zze = true;
                this.zzj.zzv();
            }
        }
        zzafzVar.zzi(zzetVar.zzi(), 0, 2);
        zzetVar.zzh(0);
        int zzt = zzetVar.zzt() + 6;
        if (zzaqqVar == null) {
            zzafzVar.zzf(zzt);
        } else {
            zzetVar.zza(zzt);
            zzafzVar.zzc(zzetVar.zzi(), 0, zzt);
            zzetVar.zzh(6);
            zzaqqVar.zzb(zzetVar);
            zzetVar.zzf(zzetVar.zzj());
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if (r0 != r7) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034 A[LOOP:0: B:13:0x002c->B:15:0x0034, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzafy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zze(long j, long j2) {
        com.google.android.gms.internal.ads.zzaqo zzaqoVar;
        int i;
        android.util.SparseArray sparseArray;
        com.google.android.gms.internal.ads.zzfi zzfiVar = this.zza;
        if (zzfiVar.zzc() != -9223372036854775807L) {
            long zza = zzfiVar.zza();
            if (zza != -9223372036854775807L) {
                if (zza != 0) {
                }
            }
            zzaqoVar = this.zzi;
            i = 0;
            if (zzaqoVar != null) {
                zzaqoVar.zzb(j2);
            }
            while (true) {
                sparseArray = this.zzb;
                if (i < sparseArray.size()) {
                    return;
                }
                ((com.google.android.gms.internal.ads.zzaqq) sparseArray.valueAt(i)).zza();
                i++;
            }
        }
        zzfiVar.zzd(j2);
        zzaqoVar = this.zzi;
        i = 0;
        if (zzaqoVar != null) {
        }
        while (true) {
            sparseArray = this.zzb;
            if (i < sparseArray.size()) {
            }
            ((com.google.android.gms.internal.ads.zzaqq) sparseArray.valueAt(i)).zza();
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public /* synthetic */ com.google.android.gms.internal.ads.zzafy zzg() {
        return com.google.android.gms.internal.ads.zzafy.CC.$default$zzg(this);
    }
}
