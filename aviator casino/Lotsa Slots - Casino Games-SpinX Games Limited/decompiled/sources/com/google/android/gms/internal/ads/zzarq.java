package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzarq implements com.google.android.gms.internal.ads.zzafy {
    private com.google.android.gms.internal.ads.zzagb zza;
    private com.google.android.gms.internal.ads.zzahk zzb;
    private com.google.android.gms.internal.ads.zzarn zze;
    private int zzc = 0;
    private long zzd = -1;
    private int zzf = -1;
    private long zzg = -1;

    static {
        int i = com.google.android.gms.internal.ads.zzarp.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zza(com.google.android.gms.internal.ads.zzafz zzafzVar) throws java.io.IOException {
        return com.google.android.gms.internal.ads.zzart.zza(zzafzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public /* synthetic */ java.util.List zzb() {
        java.util.List zzi;
        zzi = com.google.android.gms.internal.ads.zzgwm.zzi();
        return zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zzc(com.google.android.gms.internal.ads.zzagb zzagbVar) {
        this.zza = zzagbVar;
        this.zzb = zzagbVar.zzu(0, 1);
        zzagbVar.zzv();
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0127  */
    @Override // com.google.android.gms.internal.ads.zzafy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzd(com.google.android.gms.internal.ads.zzafz zzafzVar, com.google.android.gms.internal.ads.zzagy zzagyVar) throws java.io.IOException {
        int zzB;
        int i;
        this.zzb.getClass();
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        int i2 = this.zzc;
        if (i2 == 0) {
            com.google.android.gms.internal.ads.zzgtj.zzi(zzafzVar.zzn() == 0);
            int i3 = this.zzf;
            if (i3 != -1) {
                zzafzVar.zzf(i3);
                this.zzc = 4;
            } else {
                if (!com.google.android.gms.internal.ads.zzart.zza(zzafzVar)) {
                    throw com.google.android.gms.internal.ads.zzat.zzb("Unsupported or unrecognized wav file type.", null);
                }
                zzafzVar.zzf((int) (zzafzVar.zzm() - zzafzVar.zzn()));
                this.zzc = 1;
            }
            return 0;
        }
        long j = -1;
        if (i2 == 1) {
            int i4 = com.google.android.gms.internal.ads.zzart.zza;
            com.google.android.gms.internal.ads.zzet zzetVar = new com.google.android.gms.internal.ads.zzet(8);
            com.google.android.gms.internal.ads.zzars zza = com.google.android.gms.internal.ads.zzars.zza(zzafzVar, zzetVar);
            if (zza.zza != 1685272116) {
                zzafzVar.zzl();
            } else {
                zzafzVar.zzk(8);
                zzetVar.zzh(0);
                zzafzVar.zzi(zzetVar.zzi(), 0, 8);
                j = zzetVar.zzE();
                zzafzVar.zzf(((int) zza.zzb) + 8);
            }
            this.zzd = j;
            this.zzc = 2;
            return 0;
        }
        if (i2 == 2) {
            com.google.android.gms.internal.ads.zzarr zzb = com.google.android.gms.internal.ads.zzart.zzb(zzafzVar);
            int i5 = zzb.zza;
            if (i5 == 17) {
                this.zze = new com.google.android.gms.internal.ads.zzarm(this.zza, this.zzb, zzb);
            } else if (i5 == 6) {
                this.zze = new com.google.android.gms.internal.ads.zzaro(this.zza, this.zzb, zzb, "audio/g711-alaw", -1);
            } else if (i5 == 7) {
                this.zze = new com.google.android.gms.internal.ads.zzaro(this.zza, this.zzb, zzb, "audio/g711-mlaw", -1);
            } else {
                int i6 = zzb.zze;
                if (i5 != 1) {
                    if (i5 == 3) {
                        zzB = com.google.android.gms.internal.ads.zzfl.zzC(i6);
                        i = zzB;
                        if (i == 0) {
                        }
                    } else if (i5 != 65534) {
                        i = 0;
                        if (i == 0) {
                            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i5).length() + 29);
                            sb.append("Unsupported WAV format type: ");
                            sb.append(i5);
                            throw com.google.android.gms.internal.ads.zzat.zzc(sb.toString());
                        }
                        this.zze = new com.google.android.gms.internal.ads.zzaro(this.zza, this.zzb, zzb, "audio/raw", i);
                    }
                }
                zzB = com.google.android.gms.internal.ads.zzfl.zzB(i6, java.nio.ByteOrder.LITTLE_ENDIAN);
                i = zzB;
                if (i == 0) {
                }
            }
            this.zzc = 3;
            return 0;
        }
        if (i2 != 3) {
            com.google.android.gms.internal.ads.zzgtj.zzi(this.zzg != -1);
            long zzn = this.zzg - zzafzVar.zzn();
            com.google.android.gms.internal.ads.zzarn zzarnVar = this.zze;
            zzarnVar.getClass();
            return zzarnVar.zzc(zzafzVar, zzn) ? -1 : 0;
        }
        android.util.Pair zzc = com.google.android.gms.internal.ads.zzart.zzc(zzafzVar);
        this.zzf = ((java.lang.Long) zzc.first).intValue();
        long longValue = ((java.lang.Long) zzc.second).longValue();
        long j2 = this.zzd;
        if (j2 != -1 && longValue == 4294967295L) {
            longValue = j2;
        }
        long j3 = this.zzf + longValue;
        this.zzg = j3;
        long zzo = zzafzVar.zzo();
        if (zzo != -1 && j3 > zzo) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(j3).length() + 29 + java.lang.String.valueOf(zzo).length());
            sb2.append("Data exceeds input length: ");
            sb2.append(j3);
            sb2.append(", ");
            sb2.append(zzo);
            com.google.android.gms.internal.ads.zzeg.zzc("WavExtractor", sb2.toString());
            this.zzg = zzo;
            j3 = zzo;
        }
        com.google.android.gms.internal.ads.zzarn zzarnVar2 = this.zze;
        zzarnVar2.getClass();
        zzarnVar2.zzb(this.zzf, j3);
        this.zzc = 4;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zze(long j, long j2) {
        this.zzc = j == 0 ? 0 : 4;
        com.google.android.gms.internal.ads.zzarn zzarnVar = this.zze;
        if (zzarnVar != null) {
            zzarnVar.zza(j2);
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
