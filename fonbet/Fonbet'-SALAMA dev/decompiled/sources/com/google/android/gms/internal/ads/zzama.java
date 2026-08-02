package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;
import java.util.Collections;

/* loaded from: classes.dex */
public final class zzama implements zzaly {
    private static final double[] zza = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    private String zzb;
    private zzaeb zzc;
    private final zzanp zzd;
    private final String zze;
    private final zzed zzf;
    private final zzamq zzg;
    private final boolean[] zzh = new boolean[4];
    private final zzalz zzi = new zzalz(128);
    private long zzj;
    private boolean zzk;
    private boolean zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private boolean zzq;
    private boolean zzr;

    public zzama(zzanp zzanpVar, String str) {
        zzed zzedVar;
        this.zzd = zzanpVar;
        this.zze = str;
        if (zzanpVar != null) {
            this.zzg = new zzamq(178, 128);
            zzedVar = new zzed();
        } else {
            zzedVar = null;
            this.zzg = null;
        }
        this.zzf = zzedVar;
        this.zzn = -9223372036854775807L;
        this.zzp = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01dc  */
    @Override // com.google.android.gms.internal.ads.zzaly
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(zzed zzedVar) {
        int i7;
        int i8;
        zzamq zzamqVar;
        int i9;
        long j;
        boolean z4;
        boolean z7;
        long j3;
        int i10;
        float f7;
        int i11;
        int i12;
        char c3 = 4;
        zzcv.zzb(this.zzc);
        int zzd = zzedVar.zzd();
        int zze = zzedVar.zze();
        byte[] zzN = zzedVar.zzN();
        this.zzj += zzedVar.zzb();
        this.zzc.zzr(zzedVar, zzedVar.zzb());
        while (true) {
            int zza2 = zzfj.zza(zzN, zzd, zze, this.zzh);
            if (zza2 == zze) {
                break;
            }
            int i13 = zza2 + 3;
            int i14 = zzedVar.zzN()[i13] & 255;
            int i15 = zza2 - zzd;
            if (!this.zzl) {
                if (i15 > 0) {
                    this.zzi.zza(zzN, zzd, zza2);
                }
                if (this.zzi.zzc(i14, i15 < 0 ? -i15 : 0)) {
                    zzalz zzalzVar = this.zzi;
                    String str = this.zzb;
                    str.getClass();
                    String str2 = this.zze;
                    byte[] copyOf = Arrays.copyOf(zzalzVar.zzc, zzalzVar.zza);
                    int i16 = copyOf[c3] & 255;
                    byte b7 = copyOf[5];
                    int i17 = copyOf[6] & 255;
                    i8 = i13;
                    i7 = zze;
                    int i18 = ((b7 & 255) >> 4) | (i16 << 4);
                    int i19 = (copyOf[7] & 240) >> 4;
                    int i20 = ((b7 & 15) << 8) | i17;
                    if (i19 != 2) {
                        if (i19 == 3) {
                            i11 = i20 * 16;
                            i12 = i18 * 9;
                        } else if (i19 != 4) {
                            f7 = 1.0f;
                        } else {
                            i11 = i20 * 121;
                            i12 = i18 * 100;
                        }
                        f7 = i11 / i12;
                    } else {
                        f7 = (i20 * 4) / (i18 * 3);
                    }
                    zzx zzxVar = new zzx();
                    zzxVar.zzO(str);
                    zzxVar.zzE(str2);
                    zzxVar.zzad("video/mpeg2");
                    zzxVar.zzai(i18);
                    zzxVar.zzM(i20);
                    zzxVar.zzZ(f7);
                    zzxVar.zzP(Collections.singletonList(copyOf));
                    zzz zzaj = zzxVar.zzaj();
                    int i21 = (copyOf[7] & 15) - 1;
                    long j7 = 0;
                    if (i21 >= 0 && i21 < 8) {
                        double d7 = zza[i21];
                        byte b8 = copyOf[zzalzVar.zzb + 9];
                        int i22 = (b8 & 96) >> 5;
                        if (i22 != (b8 & 31)) {
                            d7 *= (i22 + 1.0d) / (r2 + 1);
                        }
                        j7 = (long) (1000000.0d / d7);
                    }
                    Pair create = Pair.create(zzaj, Long.valueOf(j7));
                    this.zzc.zzm((zzz) create.first);
                    this.zzm = ((Long) create.second).longValue();
                    this.zzl = true;
                    zzamqVar = this.zzg;
                    if (zzamqVar != null) {
                        if (i15 > 0) {
                            zzamqVar.zza(zzN, zzd, zza2);
                            i10 = 0;
                        } else {
                            i10 = -i15;
                        }
                        if (this.zzg.zzd(i10)) {
                            zzamq zzamqVar2 = this.zzg;
                            int zzc = zzfj.zzc(zzamqVar2.zza, zzamqVar2.zzb);
                            zzed zzedVar2 = this.zzf;
                            int i23 = zzen.zza;
                            zzedVar2.zzJ(this.zzg.zza, zzc);
                            this.zzd.zza(this.zzp, this.zzf);
                        }
                        if (i14 == 178) {
                            if (zzedVar.zzN()[zza2 + 2] == 1) {
                                this.zzg.zzc(178);
                            }
                            i14 = 178;
                            if (i14 != 0 || i14 == 179) {
                                i9 = i7 - zza2;
                                if (this.zzr && this.zzl) {
                                    j3 = this.zzp;
                                    if (j3 != -9223372036854775807L) {
                                        this.zzc.zzt(j3, this.zzq ? 1 : 0, ((int) (this.zzj - this.zzo)) - i9, i9, null);
                                    }
                                }
                                if (this.zzk || this.zzr) {
                                    this.zzo = this.zzj - i9;
                                    j = this.zzn;
                                    if (j == -9223372036854775807L) {
                                        long j8 = this.zzp;
                                        j = j8 != -9223372036854775807L ? j8 + this.zzm : -9223372036854775807L;
                                    }
                                    this.zzp = j;
                                    z4 = false;
                                    this.zzq = false;
                                    this.zzn = -9223372036854775807L;
                                    z7 = true;
                                    this.zzk = true;
                                } else {
                                    z4 = false;
                                    z7 = true;
                                }
                                this.zzr = i14 == 0 ? z7 : z4;
                            } else if (i14 == 184) {
                                this.zzq = true;
                            }
                            zzd = i8;
                            zze = i7;
                            c3 = 4;
                        }
                    }
                    if (i14 != 0) {
                    }
                    i9 = i7 - zza2;
                    if (this.zzr) {
                        j3 = this.zzp;
                        if (j3 != -9223372036854775807L) {
                        }
                    }
                    if (this.zzk) {
                    }
                    this.zzo = this.zzj - i9;
                    j = this.zzn;
                    if (j == -9223372036854775807L) {
                    }
                    this.zzp = j;
                    z4 = false;
                    this.zzq = false;
                    this.zzn = -9223372036854775807L;
                    z7 = true;
                    this.zzk = true;
                    this.zzr = i14 == 0 ? z7 : z4;
                    zzd = i8;
                    zze = i7;
                    c3 = 4;
                }
            }
            i7 = zze;
            i8 = i13;
            zzamqVar = this.zzg;
            if (zzamqVar != null) {
            }
            if (i14 != 0) {
            }
            i9 = i7 - zza2;
            if (this.zzr) {
            }
            if (this.zzk) {
            }
            this.zzo = this.zzj - i9;
            j = this.zzn;
            if (j == -9223372036854775807L) {
            }
            this.zzp = j;
            z4 = false;
            this.zzq = false;
            this.zzn = -9223372036854775807L;
            z7 = true;
            this.zzk = true;
            this.zzr = i14 == 0 ? z7 : z4;
            zzd = i8;
            zze = i7;
            c3 = 4;
        }
        if (!this.zzl) {
            this.zzi.zza(zzN, zzd, zze);
        }
        zzamq zzamqVar3 = this.zzg;
        if (zzamqVar3 != null) {
            zzamqVar3.zza(zzN, zzd, zze);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaly
    public final void zzb(zzacy zzacyVar, zzanm zzanmVar) {
        zzanmVar.zzc();
        this.zzb = zzanmVar.zzb();
        this.zzc = zzacyVar.zzw(zzanmVar.zza(), 2);
        zzanp zzanpVar = this.zzd;
        if (zzanpVar != null) {
            zzanpVar.zzb(zzacyVar, zzanmVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaly
    public final void zzc(boolean z4) {
        zzcv.zzb(this.zzc);
        if (z4) {
            boolean z7 = this.zzq;
            long j = this.zzj - this.zzo;
            this.zzc.zzt(this.zzp, z7 ? 1 : 0, (int) j, 0, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaly
    public final void zzd(long j, int i7) {
        this.zzn = j;
    }

    @Override // com.google.android.gms.internal.ads.zzaly
    public final void zze() {
        zzfj.zzi(this.zzh);
        this.zzi.zzb();
        zzamq zzamqVar = this.zzg;
        if (zzamqVar != null) {
            zzamqVar.zzb();
        }
        this.zzj = 0L;
        this.zzk = false;
        this.zzn = -9223372036854775807L;
        this.zzp = -9223372036854775807L;
    }
}
