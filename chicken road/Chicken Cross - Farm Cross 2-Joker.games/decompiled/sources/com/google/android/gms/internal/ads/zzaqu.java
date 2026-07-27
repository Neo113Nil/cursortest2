package com.google.android.gms.internal.ads;

import androidx.core.view.ViewCompat;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzaqu implements zzaqh {
    private String zzf;
    private zzaht zzg;
    private boolean zzj;
    private int zzl;
    private int zzm;
    private int zzo;
    private int zzp;
    private int zzt;
    private boolean zzv;
    private final String zza = "video/mp2t";
    private int zze = 0;
    private final zzeu zzb = new zzeu(new byte[15], 2);
    private final zzet zzc = new zzet();
    private final zzeu zzd = new zzeu();
    private final zzaqv zzq = new zzaqv();
    private int zzr = -2147483647;
    private int zzs = -1;
    private long zzu = -1;
    private boolean zzk = true;
    private boolean zzn = true;
    private double zzh = -9.223372036854776E18d;
    private double zzi = -9.223372036854776E18d;

    public zzaqu(String str) {
    }

    private static final void zzg(zzeu zzeuVar, zzeu zzeuVar2, boolean z) {
        int zzg = zzeuVar.zzg();
        int min = Math.min(zzeuVar.zzd(), zzeuVar2.zzd());
        zzeuVar.zzm(zzeuVar2.zzi(), zzeuVar2.zzg(), min);
        zzeuVar2.zzk(min);
        if (z) {
            zzeuVar.zzh(zzg);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zza() {
        this.zze = 0;
        this.zzm = 0;
        this.zzb.zza(2);
        this.zzo = 0;
        this.zzp = 0;
        this.zzr = -2147483647;
        this.zzs = -1;
        this.zzt = 0;
        this.zzu = -1L;
        this.zzv = false;
        this.zzj = false;
        this.zzn = true;
        this.zzk = true;
        this.zzh = -9.223372036854776E18d;
        this.zzi = -9.223372036854776E18d;
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zzb(zzagk zzagkVar, zzarv zzarvVar) {
        zzarvVar.zza();
        this.zzf = zzarvVar.zzc();
        this.zzg = zzagkVar.zzs(zzarvVar.zzb(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zzc(long j, int i) {
        this.zzl = i;
        if (!this.zzk && (this.zzp != 0 || !this.zzn)) {
            this.zzj = true;
        }
        if (j != -9223372036854775807L) {
            double d = j;
            if (this.zzj) {
                this.zzi = d;
            } else {
                this.zzh = d;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zzd(zzeu zzeuVar) throws zzat {
        int i;
        this.zzg.getClass();
        while (zzeuVar.zzd() > 0) {
            int i2 = this.zze;
            int i3 = 0;
            if (i2 == 0) {
                int i4 = this.zzl;
                if ((i4 & 2) != 0) {
                    if ((i4 & 4) == 0) {
                        while (zzeuVar.zzd() > 0) {
                            int i5 = this.zzm << 8;
                            this.zzm = i5;
                            int zzs = i5 | zzeuVar.zzs();
                            this.zzm = zzs;
                            if ((zzs & ViewCompat.MEASURED_SIZE_MASK) == 12583333) {
                                zzeuVar.zzh(zzeuVar.zzg() - 3);
                                this.zzm = 0;
                            }
                        }
                    }
                    this.zze = 1;
                    break;
                }
                zzeuVar.zzh(zzeuVar.zze());
            } else if (i2 != 1) {
                zzaqv zzaqvVar = this.zzq;
                int i6 = zzaqvVar.zza;
                if (i6 == 1 || i6 == 17) {
                    zzg(zzeuVar, this.zzd, true);
                }
                int min = Math.min(zzeuVar.zzd(), zzaqvVar.zzc - this.zzo);
                this.zzg.zzc(zzeuVar, min);
                int i7 = this.zzo + min;
                this.zzo = i7;
                if (i7 == zzaqvVar.zzc) {
                    int i8 = zzaqvVar.zza;
                    if (i8 == 1) {
                        byte[] zzi = this.zzd.zzi();
                        zzaqw zzb = zzaqx.zzb(new zzet(zzi, zzi.length));
                        this.zzr = zzb.zzb;
                        this.zzs = zzb.zzc;
                        long j = this.zzu;
                        long j2 = zzaqvVar.zzb;
                        if (j != j2) {
                            this.zzu = j2;
                            int i9 = zzb.zza;
                            String str = "mhm1";
                            if (i9 != -1) {
                                String format = String.format(".%02X", Integer.valueOf(i9));
                                String.valueOf(format);
                                str = "mhm1".concat(String.valueOf(format));
                            }
                            byte[] bArr = zzb.zzd;
                            zzgxm zzgxmVar = null;
                            if (bArr != null && bArr.length > 0) {
                                zzgxmVar = zzgxm.zzk(zzfm.zzb, bArr);
                            }
                            zzt zztVar = new zzt();
                            zztVar.zza(this.zzf);
                            zztVar.zzn(this.zza);
                            zztVar.zzo("audio/mhm1");
                            zztVar.zzJ(this.zzr);
                            zztVar.zzk(str);
                            zztVar.zzr(zzgxmVar);
                            this.zzg.zzA(zztVar.zzQ());
                        }
                        this.zzv = true;
                    } else if (i8 == 17) {
                        byte[] zzi2 = this.zzd.zzi();
                        zzet zzetVar = new zzet(zzi2, zzi2.length);
                        if (zzetVar.zzi()) {
                            zzetVar.zzh(2);
                            i3 = zzetVar.zzj(13);
                        }
                        this.zzt = i3;
                    } else if (i8 == 2) {
                        if (this.zzv) {
                            this.zzk = false;
                            i = 1;
                        } else {
                            i = 0;
                        }
                        int i10 = this.zzs - this.zzt;
                        double d = this.zzr;
                        long round = Math.round(this.zzh);
                        if (this.zzj) {
                            this.zzj = false;
                            this.zzh = this.zzi;
                        } else {
                            this.zzh += (i10 * 1000000.0d) / d;
                        }
                        this.zzg.zze(round, i, this.zzp, 0, null);
                        this.zzv = false;
                        this.zzt = 0;
                        this.zzp = 0;
                    }
                    this.zze = 1;
                }
            } else {
                zzeu zzeuVar2 = this.zzb;
                zzg(zzeuVar, zzeuVar2, false);
                if (zzeuVar2.zzd() == 0) {
                    zzet zzetVar2 = this.zzc;
                    int zze = zzeuVar2.zze();
                    zzetVar2.zzb(zzeuVar2.zzi(), zze);
                    zzaqv zzaqvVar2 = this.zzq;
                    if (zzaqx.zza(zzetVar2, zzaqvVar2)) {
                        this.zzo = 0;
                        this.zzp += zzaqvVar2.zzc + zze;
                        zzeuVar2.zzh(0);
                        this.zzg.zzc(zzeuVar2, zzeuVar2.zze());
                        zzeuVar2.zza(2);
                        this.zzd.zza(zzaqvVar2.zzc);
                        this.zzn = true;
                        this.zze = 2;
                    } else if (zzeuVar2.zze() < 15) {
                        zzeuVar2.zzf(zzeuVar2.zze() + 1);
                    }
                }
                this.zzn = false;
            }
        }
    }
}
