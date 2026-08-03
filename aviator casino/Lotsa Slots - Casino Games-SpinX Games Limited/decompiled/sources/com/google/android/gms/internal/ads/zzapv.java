package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzapv implements com.google.android.gms.internal.ads.zzapt {
    private static final double[] zzc = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    private java.lang.String zza;
    private com.google.android.gms.internal.ads.zzahk zzb;
    private final com.google.android.gms.internal.ads.zzarl zzd;
    private final java.lang.String zze;
    private final com.google.android.gms.internal.ads.zzet zzf;
    private final com.google.android.gms.internal.ads.zzaqk zzg;
    private final boolean[] zzh = new boolean[4];
    private final com.google.android.gms.internal.ads.zzapu zzi = new com.google.android.gms.internal.ads.zzapu(128);
    private long zzj;
    private boolean zzk;
    private boolean zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private boolean zzq;
    private boolean zzr;

    zzapv(com.google.android.gms.internal.ads.zzarl zzarlVar, java.lang.String str) {
        com.google.android.gms.internal.ads.zzet zzetVar;
        this.zzd = zzarlVar;
        this.zze = str;
        if (zzarlVar != null) {
            this.zzg = new com.google.android.gms.internal.ads.zzaqk(178, 128);
            zzetVar = new com.google.android.gms.internal.ads.zzet();
        } else {
            zzetVar = null;
            this.zzg = null;
        }
        this.zzf = zzetVar;
        this.zzn = -9223372036854775807L;
        this.zzp = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zza() {
        com.google.android.gms.internal.ads.zzgp.zzj(this.zzh);
        this.zzi.zza();
        com.google.android.gms.internal.ads.zzaqk zzaqkVar = this.zzg;
        if (zzaqkVar != null) {
            zzaqkVar.zza();
        }
        this.zzj = 0L;
        this.zzk = false;
        this.zzn = -9223372036854775807L;
        this.zzp = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zzb(com.google.android.gms.internal.ads.zzagb zzagbVar, com.google.android.gms.internal.ads.zzarh zzarhVar) {
        zzarhVar.zza();
        this.zza = zzarhVar.zzc();
        this.zzb = zzagbVar.zzu(zzarhVar.zzb(), 2);
        com.google.android.gms.internal.ads.zzarl zzarlVar = this.zzd;
        if (zzarlVar != null) {
            zzarlVar.zza(zzagbVar, zzarhVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zzc(long j, int i) {
        this.zzn = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01c6  */
    @Override // com.google.android.gms.internal.ads.zzapt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzd(com.google.android.gms.internal.ads.zzet zzetVar) {
        int i;
        int i2;
        com.google.android.gms.internal.ads.zzaqk zzaqkVar;
        int i3;
        long j;
        long j2;
        int i4;
        int i5;
        int i6;
        float f;
        int i7;
        long j3;
        byte b;
        int i8;
        this.zzb.getClass();
        int zzg = zzetVar.zzg();
        int zze = zzetVar.zze();
        byte[] zzi = zzetVar.zzi();
        this.zzj += zzetVar.zzd();
        this.zzb.zzc(zzetVar, zzetVar.zzd());
        while (true) {
            int zzi2 = com.google.android.gms.internal.ads.zzgp.zzi(zzi, zzg, zze, this.zzh);
            if (zzi2 == zze) {
                break;
            }
            int i9 = zzi2 + 3;
            int i10 = zzetVar.zzi()[i9] & 255;
            int i11 = zzi2 - zzg;
            if (!this.zzl) {
                if (i11 > 0) {
                    this.zzi.zzc(zzi, zzg, zzi2);
                }
                int i12 = i11 < 0 ? -i11 : 0;
                com.google.android.gms.internal.ads.zzapu zzapuVar = this.zzi;
                if (zzapuVar.zzb(i10, i12)) {
                    java.lang.String str = this.zza;
                    str.getClass();
                    java.lang.String str2 = this.zze;
                    byte[] copyOf = java.util.Arrays.copyOf(zzapuVar.zzc, zzapuVar.zza);
                    int i13 = copyOf[4] & 255;
                    byte b2 = copyOf[5];
                    int i14 = copyOf[6] & 255;
                    i2 = i9;
                    i = zze;
                    int i15 = (i13 << 4) | ((b2 & 255) >> 4);
                    int i16 = (copyOf[7] & 240) >> 4;
                    int i17 = i14 | ((b2 & com.google.common.base.Ascii.SI) << 8);
                    if (i16 == 2) {
                        i5 = i17 * 4;
                        i6 = i15 * 3;
                    } else if (i16 == 3) {
                        i5 = i17 * 16;
                        i6 = i15 * 9;
                    } else if (i16 != 4) {
                        f = 1.0f;
                        com.google.android.gms.internal.ads.zzt zztVar = new com.google.android.gms.internal.ads.zzt();
                        zztVar.zza(str);
                        zztVar.zzn(str2);
                        zztVar.zzo("video/mpeg2");
                        zztVar.zzv(i15);
                        zztVar.zzw(i17);
                        zztVar.zzB(f);
                        zztVar.zzr(java.util.Collections.singletonList(copyOf));
                        com.google.android.gms.internal.ads.zzv zzO = zztVar.zzO();
                        i7 = (copyOf[7] & com.google.common.base.Ascii.SI) - 1;
                        j3 = 0;
                        if (i7 >= 0 && i7 < 8) {
                            double d = zzc[i7];
                            b = copyOf[zzapuVar.zzb + 9];
                            i8 = (b & 96) >> 5;
                            if (i8 != (b & com.google.common.base.Ascii.US)) {
                                d *= (i8 + 1.0d) / (r9 + 1);
                            }
                            j3 = (long) (1000000.0d / d);
                        }
                        android.util.Pair create = android.util.Pair.create(zzO, java.lang.Long.valueOf(j3));
                        this.zzb.zzA((com.google.android.gms.internal.ads.zzv) create.first);
                        this.zzm = ((java.lang.Long) create.second).longValue();
                        this.zzl = true;
                        zzaqkVar = this.zzg;
                        if (zzaqkVar != null) {
                            if (i11 > 0) {
                                zzaqkVar.zzd(zzi, zzg, zzi2);
                                i4 = 0;
                            } else {
                                i4 = -i11;
                            }
                            if (zzaqkVar.zze(i4)) {
                                int zza = com.google.android.gms.internal.ads.zzgp.zza(zzaqkVar.zza, zzaqkVar.zzb);
                                com.google.android.gms.internal.ads.zzet zzetVar2 = this.zzf;
                                java.lang.String str3 = com.google.android.gms.internal.ads.zzfl.zza;
                                zzetVar2.zzb(zzaqkVar.zza, zza);
                                this.zzd.zzb(this.zzp, zzetVar2);
                            }
                            if (i10 == 178) {
                                if (zzetVar.zzi()[zzi2 + 2] == 1) {
                                    zzaqkVar.zzc(178);
                                }
                                i10 = 178;
                            }
                        }
                        if (i10 != 0 || i10 == 179) {
                            i3 = i - zzi2;
                            if (this.zzr && this.zzl) {
                                j2 = this.zzp;
                                if (j2 != -9223372036854775807L) {
                                    this.zzb.zze(j2, this.zzq ? 1 : 0, ((int) (this.zzj - this.zzo)) - i3, i3, null);
                                }
                            }
                            if (this.zzk || this.zzr) {
                                this.zzo = this.zzj - i3;
                                j = this.zzn;
                                if (j == -9223372036854775807L) {
                                    long j4 = this.zzp;
                                    j = j4 != -9223372036854775807L ? j4 + this.zzm : -9223372036854775807L;
                                }
                                this.zzp = j;
                                this.zzq = false;
                                this.zzn = -9223372036854775807L;
                                this.zzk = true;
                            }
                            this.zzr = i10 == 0;
                        } else if (i10 == 184) {
                            this.zzq = true;
                        }
                        zzg = i2;
                        zze = i;
                    } else {
                        i5 = i17 * 121;
                        i6 = i15 * 100;
                    }
                    f = i5 / i6;
                    com.google.android.gms.internal.ads.zzt zztVar2 = new com.google.android.gms.internal.ads.zzt();
                    zztVar2.zza(str);
                    zztVar2.zzn(str2);
                    zztVar2.zzo("video/mpeg2");
                    zztVar2.zzv(i15);
                    zztVar2.zzw(i17);
                    zztVar2.zzB(f);
                    zztVar2.zzr(java.util.Collections.singletonList(copyOf));
                    com.google.android.gms.internal.ads.zzv zzO2 = zztVar2.zzO();
                    i7 = (copyOf[7] & com.google.common.base.Ascii.SI) - 1;
                    j3 = 0;
                    if (i7 >= 0) {
                        double d2 = zzc[i7];
                        b = copyOf[zzapuVar.zzb + 9];
                        i8 = (b & 96) >> 5;
                        if (i8 != (b & com.google.common.base.Ascii.US)) {
                        }
                        j3 = (long) (1000000.0d / d2);
                    }
                    android.util.Pair create2 = android.util.Pair.create(zzO2, java.lang.Long.valueOf(j3));
                    this.zzb.zzA((com.google.android.gms.internal.ads.zzv) create2.first);
                    this.zzm = ((java.lang.Long) create2.second).longValue();
                    this.zzl = true;
                    zzaqkVar = this.zzg;
                    if (zzaqkVar != null) {
                    }
                    if (i10 != 0) {
                    }
                    i3 = i - zzi2;
                    if (this.zzr) {
                        j2 = this.zzp;
                        if (j2 != -9223372036854775807L) {
                        }
                    }
                    if (this.zzk) {
                    }
                    this.zzo = this.zzj - i3;
                    j = this.zzn;
                    if (j == -9223372036854775807L) {
                    }
                    this.zzp = j;
                    this.zzq = false;
                    this.zzn = -9223372036854775807L;
                    this.zzk = true;
                    this.zzr = i10 == 0;
                    zzg = i2;
                    zze = i;
                }
            }
            i = zze;
            i2 = i9;
            zzaqkVar = this.zzg;
            if (zzaqkVar != null) {
            }
            if (i10 != 0) {
            }
            i3 = i - zzi2;
            if (this.zzr) {
            }
            if (this.zzk) {
            }
            this.zzo = this.zzj - i3;
            j = this.zzn;
            if (j == -9223372036854775807L) {
            }
            this.zzp = j;
            this.zzq = false;
            this.zzn = -9223372036854775807L;
            this.zzk = true;
            this.zzr = i10 == 0;
            zzg = i2;
            zze = i;
        }
        if (!this.zzl) {
            this.zzi.zzc(zzi, zzg, zze);
        }
        com.google.android.gms.internal.ads.zzaqk zzaqkVar2 = this.zzg;
        if (zzaqkVar2 != null) {
            zzaqkVar2.zzd(zzi, zzg, zze);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zze(boolean z) {
        com.google.android.gms.internal.ads.zzahk zzahkVar = this.zzb;
        zzahkVar.getClass();
        if (z) {
            boolean z2 = this.zzq;
            long j = this.zzj - this.zzo;
            zzahkVar.zze(this.zzp, z2 ? 1 : 0, (int) j, 0, null);
        }
    }
}
