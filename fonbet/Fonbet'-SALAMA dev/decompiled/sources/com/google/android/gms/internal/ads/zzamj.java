package com.google.android.gms.internal.ads;

import java.util.Collections;

/* loaded from: classes.dex */
public final class zzamj implements zzaly {
    private final String zza;
    private final int zzb;
    private final String zzc = "video/mp2t";
    private final zzed zzd;
    private final zzec zze;
    private zzaeb zzf;
    private String zzg;
    private zzz zzh;
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
    private String zzw;

    public zzamj(String str, int i7, String str2) {
        this.zza = str;
        this.zzb = i7;
        zzed zzedVar = new zzed(1024);
        this.zzd = zzedVar;
        byte[] zzN = zzedVar.zzN();
        this.zze = new zzec(zzN, zzN.length);
        this.zzm = -9223372036854775807L;
    }

    private final int zzf(zzec zzecVar) {
        int zza = zzecVar.zza();
        zzabp zzb = zzabr.zzb(zzecVar, true);
        this.zzw = zzb.zzc;
        this.zzt = zzb.zza;
        this.zzv = zzb.zzb;
        return zza - zzecVar.zza();
    }

    private static long zzg(zzec zzecVar) {
        return zzecVar.zzd((zzecVar.zzd(2) + 1) * 8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x015e, code lost:
    
        if (r14.zzn == false) goto L89;
     */
    @Override // com.google.android.gms.internal.ads.zzaly
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(zzed zzedVar) {
        int i7;
        int i8;
        int i9;
        boolean zzp;
        zzcv.zzb(this.zzf);
        while (zzedVar.zzb() > 0) {
            int i10 = this.zzi;
            if (i10 != 0) {
                if (i10 == 1) {
                    int zzm = zzedVar.zzm();
                    if ((zzm & 224) == 224) {
                        this.zzl = zzm;
                        this.zzi = 2;
                    } else if (zzm != 86) {
                        this.zzi = 0;
                    }
                } else if (i10 != 2) {
                    int min = Math.min(zzedVar.zzb(), this.zzk - this.zzj);
                    zzedVar.zzH(this.zze.zza, this.zzj, min);
                    int i11 = this.zzj + min;
                    this.zzj = i11;
                    if (i11 == this.zzk) {
                        this.zze.zzl(0);
                        zzec zzecVar = this.zze;
                        if (!zzecVar.zzp()) {
                            this.zzn = true;
                            int zzd = zzecVar.zzd(1);
                            if (zzd == 1) {
                                i9 = zzecVar.zzd(1);
                                i8 = 1;
                            } else {
                                i8 = zzd;
                                i9 = 0;
                            }
                            this.zzo = i9;
                            if (i9 != 0) {
                                throw zzaz.zza(null, null);
                            }
                            if (i8 == 1) {
                                zzg(zzecVar);
                                i8 = 1;
                            }
                            if (!zzecVar.zzp()) {
                                throw zzaz.zza(null, null);
                            }
                            this.zzp = zzecVar.zzd(6);
                            int zzd2 = zzecVar.zzd(4);
                            int zzd3 = zzecVar.zzd(3);
                            if (zzd2 != 0 || zzd3 != 0) {
                                throw zzaz.zza(null, null);
                            }
                            if (i8 == 0) {
                                int zzc = zzecVar.zzc();
                                int zzf = zzf(zzecVar);
                                zzecVar.zzl(zzc);
                                byte[] bArr = new byte[(zzf + 7) / 8];
                                zzecVar.zzh(bArr, 0, zzf);
                                zzx zzxVar = new zzx();
                                zzxVar.zzO(this.zzg);
                                zzxVar.zzE(this.zzc);
                                zzxVar.zzad("audio/mp4a-latm");
                                zzxVar.zzC(this.zzw);
                                zzxVar.zzB(this.zzv);
                                zzxVar.zzae(this.zzt);
                                zzxVar.zzP(Collections.singletonList(bArr));
                                zzxVar.zzS(this.zza);
                                zzxVar.zzab(this.zzb);
                                zzz zzaj = zzxVar.zzaj();
                                if (!zzaj.equals(this.zzh)) {
                                    this.zzh = zzaj;
                                    this.zzu = 1024000000 / zzaj.zzF;
                                    this.zzf.zzm(zzaj);
                                }
                            } else {
                                zzecVar.zzn(((int) zzg(zzecVar)) - zzf(zzecVar));
                            }
                            int zzd4 = zzecVar.zzd(3);
                            this.zzq = zzd4;
                            if (zzd4 == 0) {
                                zzecVar.zzn(8);
                            } else if (zzd4 == 1) {
                                zzecVar.zzn(9);
                            } else if (zzd4 == 3 || zzd4 == 4 || zzd4 == 5) {
                                zzecVar.zzn(6);
                            } else {
                                if (zzd4 != 6 && zzd4 != 7) {
                                    throw new IllegalStateException();
                                }
                                zzecVar.zzn(1);
                            }
                            boolean zzp2 = zzecVar.zzp();
                            this.zzr = zzp2;
                            this.zzs = 0L;
                            if (zzp2) {
                                if (i8 != 1) {
                                    do {
                                        zzp = zzecVar.zzp();
                                        this.zzs = (this.zzs << 8) + zzecVar.zzd(8);
                                    } while (zzp);
                                } else {
                                    this.zzs = zzg(zzecVar);
                                }
                            }
                            if (zzecVar.zzp()) {
                                zzecVar.zzn(8);
                            }
                        }
                        if (this.zzo != 0) {
                            throw zzaz.zza(null, null);
                        }
                        if (this.zzp != 0) {
                            throw zzaz.zza(null, null);
                        }
                        if (this.zzq != 0) {
                            throw zzaz.zza(null, null);
                        }
                        int i12 = 0;
                        while (true) {
                            int zzd5 = zzecVar.zzd(8);
                            i7 = i12 + zzd5;
                            if (zzd5 != 255) {
                                break;
                            } else {
                                i12 = i7;
                            }
                        }
                        int zzc2 = zzecVar.zzc();
                        if ((zzc2 & 7) == 0) {
                            this.zzd.zzL(zzc2 >> 3);
                        } else {
                            zzecVar.zzh(this.zzd.zzN(), 0, i7 * 8);
                            this.zzd.zzL(0);
                        }
                        this.zzf.zzr(this.zzd, i7);
                        zzcv.zzf(this.zzm != -9223372036854775807L);
                        this.zzf.zzt(this.zzm, 1, i7, 0, null);
                        this.zzm += this.zzu;
                        if (this.zzr) {
                            zzecVar.zzn((int) this.zzs);
                        }
                        this.zzi = 0;
                    } else {
                        continue;
                    }
                } else {
                    int zzm2 = ((this.zzl & (-225)) << 8) | zzedVar.zzm();
                    this.zzk = zzm2;
                    zzed zzedVar2 = this.zzd;
                    if (zzm2 > zzedVar2.zzN().length) {
                        zzedVar2.zzI(zzm2);
                        zzec zzecVar2 = this.zze;
                        byte[] zzN = this.zzd.zzN();
                        zzecVar2.zzk(zzN, zzN.length);
                    }
                    this.zzj = 0;
                    this.zzi = 3;
                }
            } else if (zzedVar.zzm() == 86) {
                this.zzi = 1;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaly
    public final void zzb(zzacy zzacyVar, zzanm zzanmVar) {
        zzanmVar.zzc();
        this.zzf = zzacyVar.zzw(zzanmVar.zza(), 1);
        this.zzg = zzanmVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzaly
    public final void zzc(boolean z4) {
    }

    @Override // com.google.android.gms.internal.ads.zzaly
    public final void zzd(long j, int i7) {
        this.zzm = j;
    }

    @Override // com.google.android.gms.internal.ads.zzaly
    public final void zze() {
        this.zzi = 0;
        this.zzm = -9223372036854775807L;
        this.zzn = false;
    }
}
