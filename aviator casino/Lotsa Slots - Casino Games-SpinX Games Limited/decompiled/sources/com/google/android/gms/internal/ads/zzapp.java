package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzapp implements com.google.android.gms.internal.ads.zzapt {
    private static final byte[] zza = {73, 68, 51};
    private final boolean zzb;
    private final java.lang.String zze;
    private final int zzf;
    private final java.lang.String zzg;
    private java.lang.String zzh;
    private com.google.android.gms.internal.ads.zzahk zzi;
    private com.google.android.gms.internal.ads.zzahk zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private boolean zzn;
    private boolean zzo;
    private int zzr;
    private boolean zzs;
    private int zzu;
    private com.google.android.gms.internal.ads.zzahk zzw;
    private long zzx;
    private final com.google.android.gms.internal.ads.zzes zzc = new com.google.android.gms.internal.ads.zzes(new byte[7], 7);
    private final com.google.android.gms.internal.ads.zzet zzd = new com.google.android.gms.internal.ads.zzet(java.util.Arrays.copyOf(zza, 10));
    private int zzp = -1;
    private int zzq = -1;
    private long zzt = -9223372036854775807L;
    private long zzv = -9223372036854775807L;

    public zzapp(boolean z, java.lang.String str, int i, java.lang.String str2) {
        this.zzb = z;
        this.zze = str;
        this.zzf = i;
        this.zzg = str2;
        zzi();
    }

    public static boolean zzf(int i) {
        return (i & 65526) == 65520;
    }

    private final void zzg() {
        this.zzo = false;
        zzi();
    }

    private final boolean zzh(com.google.android.gms.internal.ads.zzet zzetVar, byte[] bArr, int i) {
        int min = java.lang.Math.min(zzetVar.zzd(), i - this.zzl);
        zzetVar.zzm(bArr, this.zzl, min);
        int i2 = this.zzl + min;
        this.zzl = i2;
        return i2 == i;
    }

    private final void zzi() {
        this.zzk = 0;
        this.zzl = 0;
        this.zzm = 256;
    }

    private final void zzj(com.google.android.gms.internal.ads.zzahk zzahkVar, long j, int i, int i2) {
        this.zzk = 4;
        this.zzl = i;
        this.zzw = zzahkVar;
        this.zzx = j;
        this.zzu = i2;
    }

    private final void zzk() {
        this.zzk = 3;
        this.zzl = 0;
    }

    private static final boolean zzl(byte b, byte b2) {
        return zzf((b2 & 255) | androidx.core.view.MotionEventCompat.ACTION_POINTER_INDEX_MASK);
    }

    private static final boolean zzm(com.google.android.gms.internal.ads.zzet zzetVar, byte[] bArr, int i) {
        if (zzetVar.zzd() < i) {
            return false;
        }
        zzetVar.zzm(bArr, 0, i);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zza() {
        this.zzv = -9223372036854775807L;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zzb(com.google.android.gms.internal.ads.zzagb zzagbVar, com.google.android.gms.internal.ads.zzarh zzarhVar) {
        zzarhVar.zza();
        this.zzh = zzarhVar.zzc();
        com.google.android.gms.internal.ads.zzahk zzu = zzagbVar.zzu(zzarhVar.zzb(), 1);
        this.zzi = zzu;
        this.zzw = zzu;
        if (!this.zzb) {
            this.zzj = new com.google.android.gms.internal.ads.zzafv();
            return;
        }
        zzarhVar.zza();
        com.google.android.gms.internal.ads.zzahk zzu2 = zzagbVar.zzu(zzarhVar.zzb(), 5);
        this.zzj = zzu2;
        com.google.android.gms.internal.ads.zzt zztVar = new com.google.android.gms.internal.ads.zzt();
        zztVar.zza(zzarhVar.zzc());
        zztVar.zzn(this.zzg);
        zztVar.zzo("application/id3");
        zzu2.zzA(zztVar.zzO());
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zzc(long j, int i) {
        this.zzv = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02ac  */
    @Override // com.google.android.gms.internal.ads.zzapt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzd(com.google.android.gms.internal.ads.zzet zzetVar) throws com.google.android.gms.internal.ads.zzat {
        int i;
        byte b;
        int i2;
        int i3;
        this.zzi.getClass();
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        while (zzetVar.zzd() > 0) {
            int i4 = this.zzk;
            int i5 = 2;
            if (i4 == 0) {
                byte[] zzi = zzetVar.zzi();
                int zzg = zzetVar.zzg();
                int zze = zzetVar.zze();
                while (true) {
                    if (zzg >= zze) {
                        zzetVar.zzh(zzg);
                        break;
                    }
                    i = zzg + 1;
                    b = zzi[zzg];
                    int i6 = b & 255;
                    if (this.zzm == 512 && zzl((byte) -1, (byte) i6)) {
                        if (!this.zzo) {
                            int i7 = zzg - 1;
                            zzetVar.zzh(zzg);
                            com.google.android.gms.internal.ads.zzes zzesVar = this.zzc;
                            if (zzm(zzetVar, zzesVar.zza, 1)) {
                                zzesVar.zzf(4);
                                int zzj = zzesVar.zzj(1);
                                int i8 = this.zzp;
                                if (i8 == -1 || zzj == i8) {
                                    if (this.zzq != -1) {
                                        if (!zzm(zzetVar, zzesVar.zza, 1)) {
                                            break;
                                        }
                                        zzesVar.zzf(i5);
                                        if (zzesVar.zzj(4) == this.zzq) {
                                            zzetVar.zzh(zzg + 1);
                                        }
                                    }
                                    if (!zzm(zzetVar, zzesVar.zza, 4)) {
                                        break;
                                    }
                                    zzesVar.zzf(14);
                                    int zzj2 = zzesVar.zzj(13);
                                    if (zzj2 >= 7) {
                                        byte[] zzi2 = zzetVar.zzi();
                                        int zze2 = zzetVar.zze();
                                        int i9 = i7 + zzj2;
                                        if (i9 < zze2) {
                                            byte b2 = zzi2[i9];
                                            if (b2 != -1) {
                                                if (b2 == 73) {
                                                    int i10 = i9 + 1;
                                                    if (i10 == zze2) {
                                                        break;
                                                    }
                                                    if (zzi2[i10] == 68) {
                                                        int i11 = i9 + 2;
                                                        if (i11 == zze2) {
                                                            break;
                                                        } else if (zzi2[i11] == 51) {
                                                            break;
                                                        }
                                                    }
                                                }
                                            } else {
                                                int i12 = i9 + 1;
                                                if (i12 == zze2) {
                                                    break;
                                                }
                                                byte b3 = zzi2[i12];
                                                if (zzl((byte) -1, b3) && ((b3 & 8) >> 3) == zzj) {
                                                    break;
                                                }
                                            }
                                        } else {
                                            break;
                                        }
                                    }
                                    int i13 = this.zzm;
                                    i2 = i13 | i6;
                                    if (i2 != 329) {
                                        i3 = 768;
                                    } else if (i2 == 511) {
                                        i3 = 512;
                                    } else if (i2 == 836) {
                                        i3 = 1024;
                                    } else {
                                        if (i2 == 1075) {
                                            this.zzk = 2;
                                            this.zzl = 3;
                                            this.zzu = 0;
                                            this.zzd.zzh(0);
                                            zzetVar.zzh(i);
                                            break;
                                        }
                                        if (i13 != 256) {
                                            this.zzm = 256;
                                            i5 = 2;
                                        } else {
                                            zzg = i;
                                            i5 = 2;
                                        }
                                    }
                                    this.zzm = i3;
                                    zzg = i;
                                    i5 = 2;
                                }
                            }
                        } else {
                            break;
                        }
                    }
                    int i132 = this.zzm;
                    i2 = i132 | i6;
                    if (i2 != 329) {
                    }
                    this.zzm = i3;
                    zzg = i;
                    i5 = 2;
                }
                this.zzr = (b & 8) >> 3;
                this.zzn = 1 == ((b & 1) ^ 1);
                if (this.zzo) {
                    zzk();
                } else {
                    this.zzk = 1;
                    this.zzl = 0;
                }
                zzetVar.zzh(i);
            } else if (i4 != 1) {
                if (i4 == 2) {
                    com.google.android.gms.internal.ads.zzet zzetVar2 = this.zzd;
                    if (zzh(zzetVar, zzetVar2.zzi(), 10)) {
                        this.zzj.zzc(zzetVar2, 10);
                        zzetVar2.zzh(6);
                        zzj(this.zzj, 0L, 10, zzetVar2.zzG() + 10);
                    }
                } else if (i4 != 3) {
                    int min = java.lang.Math.min(zzetVar.zzd(), this.zzu - this.zzl);
                    this.zzw.zzc(zzetVar, min);
                    int i14 = this.zzl + min;
                    this.zzl = i14;
                    if (i14 == this.zzu) {
                        com.google.android.gms.internal.ads.zzgtj.zzi(this.zzv != -9223372036854775807L);
                        this.zzw.zze(this.zzv, 1, this.zzu, 0, null);
                        this.zzv += this.zzx;
                        zzi();
                    }
                } else {
                    int i15 = true != this.zzn ? 5 : 7;
                    com.google.android.gms.internal.ads.zzes zzesVar2 = this.zzc;
                    if (zzh(zzetVar, zzesVar2.zza, i15)) {
                        zzesVar2.zzf(0);
                        if (this.zzs) {
                            zzesVar2.zzh(10);
                        } else {
                            int zzj3 = zzesVar2.zzj(2) + 1;
                            if (zzj3 != 2) {
                                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(zzj3).length() + 50);
                                sb.append("Detected audio object type: ");
                                sb.append(zzj3);
                                sb.append(", but assuming AAC LC.");
                                com.google.android.gms.internal.ads.zzeg.zzc("AdtsReader", sb.toString());
                            }
                            zzesVar2.zzh(5);
                            int zzj4 = zzesVar2.zzj(3);
                            int i16 = this.zzq;
                            int i17 = com.google.android.gms.internal.ads.zzaew.zza;
                            byte[] bArr = {(byte) (((i16 >> 1) & 7) | 16), (byte) (((zzj4 << 3) & 120) | ((i16 << 7) & 128))};
                            com.google.android.gms.internal.ads.zzaev zza2 = com.google.android.gms.internal.ads.zzaew.zza(bArr);
                            com.google.android.gms.internal.ads.zzt zztVar = new com.google.android.gms.internal.ads.zzt();
                            zztVar.zza(this.zzh);
                            zztVar.zzn(this.zzg);
                            zztVar.zzo("audio/mp4a-latm");
                            zztVar.zzk(zza2.zzc);
                            zztVar.zzG(zza2.zzb);
                            zztVar.zzH(zza2.zza);
                            zztVar.zzr(java.util.Collections.singletonList(bArr));
                            zztVar.zze(this.zze);
                            zztVar.zzg(this.zzf);
                            com.google.android.gms.internal.ads.zzv zzO = zztVar.zzO();
                            this.zzt = 1024000000 / zzO.zzI;
                            this.zzi.zzA(zzO);
                            this.zzs = true;
                        }
                        zzesVar2.zzh(4);
                        int zzj5 = zzesVar2.zzj(13);
                        zzj(this.zzi, this.zzt, 0, this.zzn ? zzj5 - 9 : zzj5 - 7);
                    }
                }
            } else if (zzetVar.zzd() != 0) {
                com.google.android.gms.internal.ads.zzes zzesVar3 = this.zzc;
                zzesVar3.zza[0] = zzetVar.zzi()[zzetVar.zzg()];
                zzesVar3.zzf(2);
                int zzj6 = zzesVar3.zzj(4);
                int i18 = this.zzq;
                if (i18 == -1 || zzj6 == i18) {
                    if (!this.zzo) {
                        this.zzo = true;
                        this.zzp = this.zzr;
                        this.zzq = zzj6;
                    }
                    zzk();
                } else {
                    zzg();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zze(boolean z) {
    }
}
