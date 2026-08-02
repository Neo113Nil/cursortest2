package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class zzalw implements zzaly {
    private final zzed zza;
    private final String zzc;
    private final int zzd;
    private String zzf;
    private zzaeb zzg;
    private int zzi;
    private int zzj;
    private long zzk;
    private zzz zzl;
    private int zzm;
    private int zzn;
    private int zzh = 0;
    private long zzq = -9223372036854775807L;
    private final AtomicInteger zzb = new AtomicInteger();
    private int zzo = -1;
    private int zzp = -1;
    private final String zze = "video/mp2t";

    public zzalw(String str, int i7, int i8, String str2) {
        this.zza = new zzed(new byte[i8]);
        this.zzc = str;
        this.zzd = i7;
    }

    private final void zzf(zzacs zzacsVar) {
        int i7;
        int i8 = zzacsVar.zzb;
        if (i8 == -2147483647 || (i7 = zzacsVar.zzc) == -1) {
            return;
        }
        zzz zzzVar = this.zzl;
        if (zzzVar != null && i7 == zzzVar.zzE && i8 == zzzVar.zzF) {
            String str = zzacsVar.zza;
            String str2 = zzzVar.zzo;
            int i9 = zzen.zza;
            if (Objects.equals(str, str2)) {
                return;
            }
        }
        zzz zzzVar2 = this.zzl;
        zzx zzxVar = zzzVar2 == null ? new zzx() : zzzVar2.zzb();
        zzxVar.zzO(this.zzf);
        zzxVar.zzE(this.zze);
        zzxVar.zzad(zzacsVar.zza);
        zzxVar.zzB(zzacsVar.zzc);
        zzxVar.zzae(zzacsVar.zzb);
        zzxVar.zzS(this.zzc);
        zzxVar.zzab(this.zzd);
        zzz zzaj = zzxVar.zzaj();
        this.zzl = zzaj;
        this.zzg.zzm(zzaj);
    }

    private final boolean zzg(zzed zzedVar, byte[] bArr, int i7) {
        int min = Math.min(zzedVar.zzb(), i7 - this.zzi);
        zzedVar.zzH(bArr, this.zzi, min);
        int i8 = this.zzi + min;
        this.zzi = i8;
        return i8 == i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01e6  */
    @Override // com.google.android.gms.internal.ads.zzaly
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(zzed zzedVar) {
        int i7;
        int i8;
        byte b7;
        boolean z4;
        int i9;
        int i10;
        byte b8;
        int i11;
        byte b9;
        int i12;
        zzcv.zzb(this.zzg);
        while (zzedVar.zzb() > 0) {
            int i13 = this.zzh;
            if (i13 == 0) {
                while (true) {
                    if (zzedVar.zzb() > 0) {
                        int i14 = this.zzj << 8;
                        this.zzj = i14;
                        int zzm = i14 | zzedVar.zzm();
                        this.zzj = zzm;
                        int i15 = (zzm == 2147385345 || zzm == -25230976 || zzm == 536864768 || zzm == -14745368) ? 1 : (zzm == 1683496997 || zzm == 622876772) ? 2 : (zzm == 1078008818 || zzm == -233094848) ? 3 : (zzm == 1908687592 || zzm == -398277519) ? 4 : 0;
                        this.zzn = i15;
                        if (i15 != 0) {
                            byte[] zzN = this.zza.zzN();
                            int i16 = this.zzj;
                            zzN[0] = (byte) ((i16 >> 24) & 255);
                            zzN[1] = (byte) ((i16 >> 16) & 255);
                            zzN[2] = (byte) ((i16 >> 8) & 255);
                            zzN[3] = (byte) (i16 & 255);
                            this.zzi = 4;
                            this.zzj = 0;
                            if (i15 == 3 || i15 == 4) {
                                this.zzh = 4;
                            } else if (i15 == 1) {
                                this.zzh = 1;
                            } else {
                                this.zzh = 2;
                            }
                        }
                    }
                }
            } else if (i13 != 1) {
                if (i13 != 2) {
                    if (i13 != 3) {
                        if (i13 != 4) {
                            if (i13 != 5) {
                                int min = Math.min(zzedVar.zzb(), this.zzm - this.zzi);
                                this.zzg.zzr(zzedVar, min);
                                int i17 = this.zzi + min;
                                this.zzi = i17;
                                if (i17 == this.zzm) {
                                    zzcv.zzf(this.zzq != -9223372036854775807L);
                                    this.zzg.zzt(this.zzq, this.zzn == 4 ? 0 : 1, this.zzm, 0, null);
                                    this.zzq += this.zzk;
                                    this.zzh = 0;
                                }
                            } else if (zzg(zzedVar, this.zza.zzN(), this.zzp)) {
                                zzacs zze = zzacu.zze(this.zza.zzN(), this.zzb);
                                if (this.zzn == 3) {
                                    zzf(zze);
                                }
                                this.zzm = zze.zzd;
                                long j = zze.zze;
                                this.zzk = j != -9223372036854775807L ? j : 0L;
                                this.zza.zzL(0);
                                this.zzg.zzr(this.zza, this.zzp);
                                this.zzh = 6;
                            }
                        } else if (zzg(zzedVar, this.zza.zzN(), 6)) {
                            int zzb = zzacu.zzb(this.zza.zzN());
                            this.zzp = zzb;
                            int i18 = this.zzi;
                            if (i18 > zzb) {
                                int i19 = i18 - zzb;
                                this.zzi = i18 - i19;
                                zzedVar.zzL(zzedVar.zzd() - i19);
                            }
                            this.zzh = 5;
                        }
                    } else if (zzg(zzedVar, this.zza.zzN(), this.zzo)) {
                        zzacs zzd = zzacu.zzd(this.zza.zzN());
                        zzf(zzd);
                        this.zzm = zzd.zzd;
                        long j3 = zzd.zze;
                        this.zzk = j3 != -9223372036854775807L ? j3 : 0L;
                        this.zza.zzL(0);
                        this.zzg.zzr(this.zza, this.zzo);
                        this.zzh = 6;
                    }
                } else if (zzg(zzedVar, this.zza.zzN(), 7)) {
                    this.zzo = zzacu.zza(this.zza.zzN());
                    this.zzh = 3;
                }
            } else if (zzg(zzedVar, this.zza.zzN(), 18)) {
                byte[] zzN2 = this.zza.zzN();
                if (this.zzl == null) {
                    zzz zzc = zzacu.zzc(zzN2, this.zzf, this.zzc, this.zzd, this.zze, null);
                    this.zzl = zzc;
                    this.zzg.zzm(zzc);
                }
                byte b10 = zzN2[0];
                if (b10 != -2) {
                    if (b10 == -1) {
                        i12 = ((zzN2[7] & 3) << 12) | ((zzN2[6] & 255) << 4) | ((zzN2[9] & 60) >> 2);
                    } else if (b10 != 31) {
                        i7 = (zzN2[5] & 3) << 12;
                        i8 = (zzN2[6] & 255) << 4;
                        b7 = zzN2[7];
                    } else {
                        i12 = ((zzN2[8] & 60) >> 2) | ((3 & zzN2[6]) << 12) | ((zzN2[7] & 255) << 4);
                    }
                    i9 = i12 + 1;
                    z4 = true;
                    if (z4) {
                        i9 = (i9 * 16) / 14;
                    }
                    this.zzm = i9;
                    if (b10 == -2) {
                        if (b10 == -1) {
                            i10 = (zzN2[4] & 7) << 4;
                            b9 = zzN2[7];
                        } else if (b10 != 31) {
                            i10 = (zzN2[4] & 1) << 6;
                            b8 = zzN2[5];
                        } else {
                            i10 = (zzN2[5] & 7) << 4;
                            b9 = zzN2[6];
                        }
                        i11 = b9 & 60;
                        this.zzk = zzfzk.zzb(zzen.zzt((((i11 >> 2) | i10) + 1) * 32, this.zzl.zzF));
                        this.zza.zzL(0);
                        this.zzg.zzr(this.zza, 18);
                        this.zzh = 6;
                    } else {
                        i10 = (zzN2[5] & 1) << 6;
                        b8 = zzN2[4];
                    }
                    i11 = b8 & 252;
                    this.zzk = zzfzk.zzb(zzen.zzt((((i11 >> 2) | i10) + 1) * 32, this.zzl.zzF));
                    this.zza.zzL(0);
                    this.zzg.zzr(this.zza, 18);
                    this.zzh = 6;
                } else {
                    i7 = (zzN2[4] & 3) << 12;
                    i8 = (zzN2[7] & 255) << 4;
                    b7 = zzN2[6];
                }
                i9 = (i7 | i8 | ((b7 & 240) >> 4)) + 1;
                z4 = false;
                if (z4) {
                }
                this.zzm = i9;
                if (b10 == -2) {
                }
                i11 = b8 & 252;
                this.zzk = zzfzk.zzb(zzen.zzt((((i11 >> 2) | i10) + 1) * 32, this.zzl.zzF));
                this.zza.zzL(0);
                this.zzg.zzr(this.zza, 18);
                this.zzh = 6;
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
        this.zzq = j;
    }

    @Override // com.google.android.gms.internal.ads.zzaly
    public final void zze() {
        this.zzh = 0;
        this.zzi = 0;
        this.zzj = 0;
        this.zzq = -9223372036854775807L;
        this.zzb.set(0);
    }
}
