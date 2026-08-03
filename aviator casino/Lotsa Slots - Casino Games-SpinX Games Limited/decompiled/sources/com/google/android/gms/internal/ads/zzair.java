package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzair implements com.google.android.gms.internal.ads.zzafy {
    private com.google.android.gms.internal.ads.zzagb zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private com.google.android.gms.internal.ads.zzaix zzg;
    private com.google.android.gms.internal.ads.zzafz zzh;
    private com.google.android.gms.internal.ads.zzahg zzi;
    private com.google.android.gms.internal.ads.zzamc zzj;
    private final com.google.android.gms.internal.ads.zzet zza = new com.google.android.gms.internal.ads.zzet(2);
    private long zzf = -1;

    private final int zzh(com.google.android.gms.internal.ads.zzafz zzafzVar) throws java.io.IOException {
        com.google.android.gms.internal.ads.zzet zzetVar = this.zza;
        zzetVar.zza(2);
        ((com.google.android.gms.internal.ads.zzafp) zzafzVar).zzh(zzetVar.zzi(), 0, 2, false);
        return zzetVar.zzt();
    }

    private final int zzi(com.google.android.gms.internal.ads.zzafz zzafzVar) throws java.io.IOException {
        com.google.android.gms.internal.ads.zzet zzetVar = this.zza;
        zzetVar.zza(2);
        zzafzVar.zzi(zzetVar.zzi(), 0, 2);
        return zzetVar.zzt() - 2;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zza(com.google.android.gms.internal.ads.zzafz zzafzVar) throws java.io.IOException {
        int zzi;
        if (zzh(zzafzVar) == 65496) {
            while (true) {
                int zzh = zzh(zzafzVar);
                this.zzd = zzh;
                if (zzh == 65498 || (zzi = zzi(zzafzVar)) < 0) {
                    break;
                }
                if (this.zzd != 65505) {
                    ((com.google.android.gms.internal.ads.zzafp) zzafzVar).zzj(zzi, false);
                } else {
                    com.google.android.gms.internal.ads.zzet zzetVar = this.zza;
                    zzetVar.zza(zzi);
                    ((com.google.android.gms.internal.ads.zzafp) zzafzVar).zzh(zzetVar.zzi(), 0, zzi, false);
                    if (java.util.Objects.equals(zzetVar.zzM((char) 0), "http://ns.adobe.com/xap/1.0/") && com.google.android.gms.internal.ads.zzaiu.zzb(zzetVar.zzM((char) 0))) {
                        return true;
                    }
                }
            }
        }
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
        this.zzb = zzagbVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0199  */
    @Override // com.google.android.gms.internal.ads.zzafy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzd(com.google.android.gms.internal.ads.zzafz zzafzVar, com.google.android.gms.internal.ads.zzagy zzagyVar) throws java.io.IOException {
        java.lang.String zzM;
        com.google.android.gms.internal.ads.zzait zza;
        com.google.android.gms.internal.ads.zzaix zzaixVar;
        long j;
        int i = this.zzc;
        if (i == 0) {
            com.google.android.gms.internal.ads.zzet zzetVar = this.zza;
            zzetVar.zza(2);
            zzafzVar.zzc(zzetVar.zzi(), 0, 2);
            int zzt = zzetVar.zzt();
            this.zzd = zzt;
            if (zzt == 65498) {
                if (this.zzf != -1) {
                    this.zzc = 4;
                    return 0;
                }
                zzj();
                return 0;
            }
            if ((zzt >= 65488 && zzt <= 65497) || zzt == 65281) {
                return 0;
            }
            this.zzc = 1;
            return 0;
        }
        if (i == 1) {
            this.zze = zzi(zzafzVar);
            zzafzVar.zzf(2);
            this.zzc = 2;
            return 0;
        }
        if (i != 2) {
            if (i != 4) {
                if (i != 5) {
                    if (i == 6) {
                        return -1;
                    }
                    throw new java.lang.IllegalStateException();
                }
                if (this.zzi == null || zzafzVar != this.zzh) {
                    this.zzh = zzafzVar;
                    this.zzi = new com.google.android.gms.internal.ads.zzahg(zzafzVar, this.zzf);
                }
                com.google.android.gms.internal.ads.zzamc zzamcVar = this.zzj;
                zzamcVar.getClass();
                int zzd = zzamcVar.zzd(this.zzi, zzagyVar);
                if (zzd == 1) {
                    zzagyVar.zza += this.zzf;
                }
                return zzd;
            }
            long zzn = zzafzVar.zzn();
            long j2 = this.zzf;
            if (zzn != j2) {
                zzagyVar.zza = j2;
                return 1;
            }
            if (zzafzVar.zzh(this.zza.zzi(), 0, 1, true)) {
                zzafzVar.zzl();
                if (this.zzj == null) {
                    this.zzj = new com.google.android.gms.internal.ads.zzamc(com.google.android.gms.internal.ads.zzanj.zza, 8);
                }
                com.google.android.gms.internal.ads.zzahg zzahgVar = new com.google.android.gms.internal.ads.zzahg(zzafzVar, this.zzf);
                this.zzi = zzahgVar;
                if (this.zzj.zza(zzahgVar)) {
                    com.google.android.gms.internal.ads.zzamc zzamcVar2 = this.zzj;
                    long j3 = this.zzf;
                    com.google.android.gms.internal.ads.zzagb zzagbVar = this.zzb;
                    zzagbVar.getClass();
                    zzamcVar2.zzc(new com.google.android.gms.internal.ads.zzahi(j3, zzagbVar));
                    com.google.android.gms.internal.ads.zzaix zzaixVar2 = this.zzg;
                    zzaixVar2.getClass();
                    com.google.android.gms.internal.ads.zzagb zzagbVar2 = this.zzb;
                    zzagbVar2.getClass();
                    com.google.android.gms.internal.ads.zzahk zzu = zzagbVar2.zzu(1024, 4);
                    com.google.android.gms.internal.ads.zzt zztVar = new com.google.android.gms.internal.ads.zzt();
                    zztVar.zzn("image/jpeg");
                    zztVar.zzl(new com.google.android.gms.internal.ads.zzap(-9223372036854775807L, zzaixVar2));
                    zzu.zzA(zztVar.zzO());
                    this.zzc = 5;
                } else {
                    zzj();
                }
            } else {
                zzj();
            }
            return 0;
        }
        if (this.zzd == 65505) {
            com.google.android.gms.internal.ads.zzet zzetVar2 = new com.google.android.gms.internal.ads.zzet(this.zze);
            zzafzVar.zzc(zzetVar2.zzi(), 0, this.zze);
            if (this.zzg == null && "http://ns.adobe.com/xap/1.0/".equals(zzetVar2.zzM((char) 0)) && (zzM = zzetVar2.zzM((char) 0)) != null) {
                long zzo = zzafzVar.zzo();
                if (zzo != -1 && (zza = com.google.android.gms.internal.ads.zzaiu.zza(zzM)) != null) {
                    java.util.List list = zza.zzb;
                    if (list.size() >= 2) {
                        long j4 = -1;
                        long j5 = -1;
                        long j6 = -1;
                        long j7 = -1;
                        for (int size = list.size() - 1; size >= 0; size--) {
                            com.google.android.gms.internal.ads.zzais zzaisVar = (com.google.android.gms.internal.ads.zzais) list.get(size);
                            java.lang.String str = zzaisVar.zza;
                            boolean z = str.equals("video/mp4") || str.equals("video/quicktime");
                            if (size == 0) {
                                zzo -= zzaisVar.zzc;
                                j = 0;
                            } else {
                                j = zzo - zzaisVar.zzb;
                            }
                            long j8 = zzo;
                            zzo = j;
                            if (z && zzo != j8) {
                                j7 = j8 - zzo;
                                j6 = zzo;
                            }
                            if (size == 0) {
                                j5 = j8;
                            }
                            if (size == 0) {
                                j4 = zzo;
                            }
                        }
                        if (j6 != -1 && j7 != -1 && j4 != -1 && j5 != -1) {
                            zzaixVar = new com.google.android.gms.internal.ads.zzaix(j4, j5, zza.zza, j6, j7);
                            this.zzg = zzaixVar;
                            if (zzaixVar != null) {
                                this.zzf = zzaixVar.zzd;
                            }
                        }
                    }
                }
                zzaixVar = null;
                this.zzg = zzaixVar;
                if (zzaixVar != null) {
                }
            }
        } else {
            zzafzVar.zzf(this.zze);
        }
        this.zzc = 0;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public /* synthetic */ com.google.android.gms.internal.ads.zzafy zzg() {
        return com.google.android.gms.internal.ads.zzafy.CC.$default$zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zze(long j, long j2) {
        if (j == 0) {
            this.zzc = 0;
            this.zzj = null;
        } else if (this.zzc == 5) {
            com.google.android.gms.internal.ads.zzamc zzamcVar = this.zzj;
            zzamcVar.getClass();
            zzamcVar.zze(j, j2);
        }
    }

    private final void zzj() {
        com.google.android.gms.internal.ads.zzagb zzagbVar = this.zzb;
        zzagbVar.getClass();
        zzagbVar.zzv();
        this.zzb.zzw(new com.google.android.gms.internal.ads.zzaha(-9223372036854775807L, 0L));
        this.zzc = 6;
    }
}
