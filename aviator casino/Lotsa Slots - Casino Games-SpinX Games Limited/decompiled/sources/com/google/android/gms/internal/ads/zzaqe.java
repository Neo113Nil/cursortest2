package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzaqe implements com.google.android.gms.internal.ads.zzapt {
    private final java.lang.String zza;
    private final int zzb;
    private final java.lang.String zzc = "video/mp2t";
    private final com.google.android.gms.internal.ads.zzet zzd;
    private final com.google.android.gms.internal.ads.zzes zze;
    private com.google.android.gms.internal.ads.zzahk zzf;
    private java.lang.String zzg;
    private com.google.android.gms.internal.ads.zzv zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private boolean zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private boolean zzr;
    private long zzs;
    private int zzt;
    private long zzu;
    private int zzv;
    private java.lang.String zzw;

    public zzaqe(java.lang.String str, int i, java.lang.String str2) {
        this.zza = str;
        this.zzb = i;
        com.google.android.gms.internal.ads.zzet zzetVar = new com.google.android.gms.internal.ads.zzet(1024);
        this.zzd = zzetVar;
        byte[] zzi = zzetVar.zzi();
        this.zze = new com.google.android.gms.internal.ads.zzes(zzi, zzi.length);
        this.zzm = -9223372036854775807L;
    }

    private final int zzf(com.google.android.gms.internal.ads.zzes zzesVar) throws com.google.android.gms.internal.ads.zzat {
        int zzc = zzesVar.zzc();
        com.google.android.gms.internal.ads.zzaev zzb = com.google.android.gms.internal.ads.zzaew.zzb(zzesVar, true);
        this.zzw = zzb.zzc;
        this.zzt = zzb.zza;
        this.zzv = zzb.zzb;
        return zzc - zzesVar.zzc();
    }

    private static long zzg(com.google.android.gms.internal.ads.zzes zzesVar) {
        return zzesVar.zzj((zzesVar.zzj(2) + 1) * 8);
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zza() {
        this.zzi = 0;
        this.zzm = -9223372036854775807L;
        this.zzn = false;
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zzb(com.google.android.gms.internal.ads.zzagb zzagbVar, com.google.android.gms.internal.ads.zzarh zzarhVar) {
        zzarhVar.zza();
        this.zzf = zzagbVar.zzu(zzarhVar.zzb(), 1);
        this.zzg = zzarhVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zzc(long j, int i) {
        this.zzm = j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x015a, code lost:
    
        if (r14.zzn == false) goto L89;
     */
    @Override // com.google.android.gms.internal.ads.zzapt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzd(com.google.android.gms.internal.ads.zzet zzetVar) throws com.google.android.gms.internal.ads.zzat {
        int i;
        int i2;
        int i3;
        boolean zzi;
        this.zzf.getClass();
        while (zzetVar.zzd() > 0) {
            int i4 = this.zzi;
            if (i4 != 0) {
                if (i4 == 1) {
                    int zzs = zzetVar.zzs();
                    if ((zzs & 224) == 224) {
                        this.zzl = zzs;
                        this.zzi = 2;
                    } else if (zzs != 86) {
                        this.zzi = 0;
                    }
                } else if (i4 != 2) {
                    int min = java.lang.Math.min(zzetVar.zzd(), this.zzk - this.zzj);
                    com.google.android.gms.internal.ads.zzes zzesVar = this.zze;
                    zzetVar.zzm(zzesVar.zza, this.zzj, min);
                    int i5 = this.zzj + min;
                    this.zzj = i5;
                    if (i5 == this.zzk) {
                        zzesVar.zzf(0);
                        if (!zzesVar.zzi()) {
                            this.zzn = true;
                            int zzj = zzesVar.zzj(1);
                            if (zzj == 1) {
                                i3 = zzesVar.zzj(1);
                                i2 = 1;
                            } else {
                                i2 = zzj;
                                i3 = 0;
                            }
                            this.zzo = i3;
                            if (i3 != 0) {
                                throw com.google.android.gms.internal.ads.zzat.zzb(null, null);
                            }
                            if (i2 == 1) {
                                zzg(zzesVar);
                                i2 = 1;
                            }
                            if (!zzesVar.zzi()) {
                                throw com.google.android.gms.internal.ads.zzat.zzb(null, null);
                            }
                            this.zzp = zzesVar.zzj(6);
                            int zzj2 = zzesVar.zzj(4);
                            int zzj3 = zzesVar.zzj(3);
                            if (zzj2 != 0 || zzj3 != 0) {
                                throw com.google.android.gms.internal.ads.zzat.zzb(null, null);
                            }
                            if (i2 == 0) {
                                int zzd = zzesVar.zzd();
                                int zzf = zzf(zzesVar);
                                zzesVar.zzf(zzd);
                                byte[] bArr = new byte[(zzf + 7) / 8];
                                zzesVar.zzl(bArr, 0, zzf);
                                com.google.android.gms.internal.ads.zzt zztVar = new com.google.android.gms.internal.ads.zzt();
                                zztVar.zza(this.zzg);
                                zztVar.zzn(this.zzc);
                                zztVar.zzo("audio/mp4a-latm");
                                zztVar.zzk(this.zzw);
                                zztVar.zzG(this.zzv);
                                zztVar.zzH(this.zzt);
                                zztVar.zzr(java.util.Collections.singletonList(bArr));
                                zztVar.zze(this.zza);
                                zztVar.zzg(this.zzb);
                                com.google.android.gms.internal.ads.zzv zzO = zztVar.zzO();
                                if (!zzO.equals(this.zzh)) {
                                    this.zzh = zzO;
                                    this.zzu = 1024000000 / zzO.zzI;
                                    this.zzf.zzA(zzO);
                                }
                            } else {
                                zzesVar.zzh(((int) zzg(zzesVar)) - zzf(zzesVar));
                            }
                            int zzj4 = zzesVar.zzj(3);
                            this.zzq = zzj4;
                            if (zzj4 == 0) {
                                zzesVar.zzh(8);
                            } else if (zzj4 == 1) {
                                zzesVar.zzh(9);
                            } else if (zzj4 == 3 || zzj4 == 4 || zzj4 == 5) {
                                zzesVar.zzh(6);
                            } else {
                                if (zzj4 != 6 && zzj4 != 7) {
                                    throw new java.lang.IllegalStateException();
                                }
                                zzesVar.zzh(1);
                            }
                            boolean zzi2 = zzesVar.zzi();
                            this.zzr = zzi2;
                            this.zzs = 0L;
                            if (zzi2) {
                                if (i2 != 1) {
                                    do {
                                        zzi = zzesVar.zzi();
                                        this.zzs = (this.zzs << 8) + zzesVar.zzj(8);
                                    } while (zzi);
                                } else {
                                    this.zzs = zzg(zzesVar);
                                }
                            }
                            if (zzesVar.zzi()) {
                                zzesVar.zzh(8);
                            }
                        }
                        if (this.zzo != 0) {
                            throw com.google.android.gms.internal.ads.zzat.zzb(null, null);
                        }
                        if (this.zzp != 0) {
                            throw com.google.android.gms.internal.ads.zzat.zzb(null, null);
                        }
                        if (this.zzq != 0) {
                            throw com.google.android.gms.internal.ads.zzat.zzb(null, null);
                        }
                        int i6 = 0;
                        while (true) {
                            int zzj5 = zzesVar.zzj(8);
                            i = i6 + zzj5;
                            if (zzj5 != 255) {
                                break;
                            } else {
                                i6 = i;
                            }
                        }
                        int zzd2 = zzesVar.zzd();
                        if ((zzd2 & 7) == 0) {
                            this.zzd.zzh(zzd2 >> 3);
                        } else {
                            com.google.android.gms.internal.ads.zzet zzetVar2 = this.zzd;
                            zzesVar.zzl(zzetVar2.zzi(), 0, i * 8);
                            zzetVar2.zzh(0);
                        }
                        this.zzf.zzc(this.zzd, i);
                        com.google.android.gms.internal.ads.zzgtj.zzi(this.zzm != -9223372036854775807L);
                        this.zzf.zze(this.zzm, 1, i, 0, null);
                        this.zzm += this.zzu;
                        if (this.zzr) {
                            zzesVar.zzh((int) this.zzs);
                        }
                        this.zzi = 0;
                    } else {
                        continue;
                    }
                } else {
                    int zzs2 = ((this.zzl & (-225)) << 8) | zzetVar.zzs();
                    this.zzk = zzs2;
                    com.google.android.gms.internal.ads.zzet zzetVar3 = this.zzd;
                    if (zzs2 > zzetVar3.zzi().length) {
                        zzetVar3.zza(zzs2);
                        com.google.android.gms.internal.ads.zzes zzesVar2 = this.zze;
                        byte[] zzi3 = zzetVar3.zzi();
                        zzesVar2.zzb(zzi3, zzi3.length);
                    }
                    this.zzj = 0;
                    this.zzi = 3;
                }
            } else if (zzetVar.zzs() == 86) {
                this.zzi = 1;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zze(boolean z) {
    }
}
