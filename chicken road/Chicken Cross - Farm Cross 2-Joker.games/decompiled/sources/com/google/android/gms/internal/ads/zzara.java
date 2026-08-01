package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzara implements zzarw {
    private final zzaqh zza;
    private final zzet zzb = new zzet(new byte[10], 10);
    private int zzc = 0;
    private int zzd;
    private zzfj zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;

    public zzara(zzaqh zzaqhVar) {
        this.zza = zzaqhVar;
    }

    private final void zze(int i) {
        this.zzc = i;
        this.zzd = 0;
    }

    private final boolean zzf(zzeu zzeuVar, byte[] bArr, int i) {
        int min = Math.min(zzeuVar.zzd(), i - this.zzd);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            zzeuVar.zzk(min);
        } else {
            zzeuVar.zzm(bArr, this.zzd, min);
        }
        int i2 = this.zzd + min;
        this.zzd = i2;
        return i2 == i;
    }

    @Override // com.google.android.gms.internal.ads.zzarw
    public final void zza(zzfj zzfjVar, zzagk zzagkVar, zzarv zzarvVar) {
        this.zze = zzfjVar;
        this.zza.zzb(zzagkVar, zzarvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzarw
    public final void zzb() {
        this.zzc = 0;
        this.zzd = 0;
        this.zzh = false;
        this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzarw
    public final void zzc(zzeu zzeuVar, int i) throws zzat {
        int i2;
        int i3;
        int i4;
        long j;
        char c;
        this.zze.getClass();
        int i5 = -1;
        int i6 = 2;
        int i7 = 1;
        if ((i & 1) != 0) {
            int i8 = this.zzc;
            if (i8 != 0 && i8 != 1) {
                if (i8 != 2) {
                    int i9 = this.zzj;
                    if (i9 != -1) {
                        StringBuilder sb = new StringBuilder(String.valueOf(i9).length() + 48);
                        sb.append("Unexpected start indicator: expected ");
                        sb.append(i9);
                        sb.append(" more bytes");
                        zzeh.zzc("PesReader", sb.toString());
                    }
                    this.zza.zzf();
                } else {
                    zzeh.zzc("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            if (zzeuVar.zze() == 0) {
                this.zza.zzn();
            }
            zze(1);
        }
        int i10 = i;
        while (zzeuVar.zzd() > 0) {
            int i11 = this.zzc;
            if (i11 != 0) {
                if (i11 != i7) {
                    if (i11 != i6) {
                        int zzd = zzeuVar.zzd();
                        int i12 = this.zzj;
                        int i13 = i12 != i5 ? zzd - i12 : 0;
                        if (i13 > 0) {
                            zzd -= i13;
                            zzeuVar.zzf(zzeuVar.zzg() + zzd);
                        }
                        zzaqh zzaqhVar = this.zza;
                        zzaqhVar.zzd(zzeuVar);
                        int i14 = this.zzj;
                        if (i14 != i5) {
                            int i15 = i14 - zzd;
                            this.zzj = i15;
                            if (i15 == 0) {
                                zzaqhVar.zzf();
                                zze(i7);
                            }
                        }
                    } else {
                        int min = Math.min(10, this.zzi);
                        zzet zzetVar = this.zzb;
                        if (zzf(zzeuVar, zzetVar.zza, min) && zzf(zzeuVar, null, this.zzi)) {
                            zzetVar.zzf(0);
                            if (this.zzf) {
                                zzetVar.zzh(4);
                                long zzj = zzetVar.zzj(3);
                                zzetVar.zzh(i7);
                                int zzj2 = zzetVar.zzj(15) << 15;
                                zzetVar.zzh(i7);
                                long zzj3 = zzetVar.zzj(15);
                                zzetVar.zzh(i7);
                                if (this.zzh || !this.zzg) {
                                    c = 30;
                                } else {
                                    zzetVar.zzh(4);
                                    zzetVar.zzh(i7);
                                    int zzj4 = zzetVar.zzj(15) << 15;
                                    zzetVar.zzh(i7);
                                    long zzj5 = zzetVar.zzj(15);
                                    zzetVar.zzh(i7);
                                    this.zze.zze(zzj4 | (zzetVar.zzj(3) << 30) | zzj5);
                                    this.zzh = true;
                                    c = 30;
                                }
                                j = this.zze.zze(zzj3 | (zzj << c) | zzj2);
                            } else {
                                j = -9223372036854775807L;
                            }
                            i10 |= true != this.zzk ? 0 : 4;
                            this.zza.zzc(j, i10);
                            zze(3);
                            i5 = -1;
                            i6 = 2;
                            i7 = 1;
                        }
                    }
                    i2 = i6;
                    i3 = i7;
                } else {
                    zzet zzetVar2 = this.zzb;
                    if (zzf(zzeuVar, zzetVar2.zza, 9)) {
                        zzetVar2.zzf(0);
                        int zzj6 = zzetVar2.zzj(24);
                        i3 = 1;
                        if (zzj6 != 1) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(zzj6).length() + 30);
                            sb2.append("Unexpected start code prefix: ");
                            sb2.append(zzj6);
                            zzeh.zzc("PesReader", sb2.toString());
                            i5 = -1;
                            this.zzj = -1;
                            i4 = 0;
                            i2 = 2;
                        } else {
                            zzetVar2.zzh(8);
                            int zzj7 = zzetVar2.zzj(16);
                            zzetVar2.zzh(5);
                            this.zzk = zzetVar2.zzi();
                            i2 = 2;
                            zzetVar2.zzh(2);
                            this.zzf = zzetVar2.zzi();
                            this.zzg = zzetVar2.zzi();
                            zzetVar2.zzh(6);
                            int zzj8 = zzetVar2.zzj(8);
                            this.zzi = zzj8;
                            if (zzj7 == 0) {
                                this.zzj = -1;
                                i5 = -1;
                            } else {
                                int i16 = (zzj7 - 3) - zzj8;
                                this.zzj = i16;
                                if (i16 < 0) {
                                    StringBuilder sb3 = new StringBuilder(String.valueOf(i16).length() + 36);
                                    sb3.append("Found negative packet payload size: ");
                                    sb3.append(i16);
                                    zzeh.zzc("PesReader", sb3.toString());
                                    i5 = -1;
                                    this.zzj = -1;
                                } else {
                                    i5 = -1;
                                }
                            }
                            i4 = 2;
                        }
                        zze(i4);
                    } else {
                        i5 = -1;
                        i3 = 1;
                        i2 = 2;
                    }
                }
            } else {
                i2 = i6;
                i3 = i7;
                zzeuVar.zzk(zzeuVar.zzd());
            }
            i7 = i3;
            i6 = i2;
        }
    }

    public final boolean zzd(boolean z) {
        int i = this.zzc;
        if (i == 3) {
            if (this.zzj != -1) {
                return false;
            }
        } else if (i != 1) {
            return false;
        }
        return true;
    }
}
