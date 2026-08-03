package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzct {
    private final int zza;
    private final int zzb;
    private final float zzc;
    private final float zzd;
    private final float zze;
    private final int zzf;
    private final int zzg;
    private final int zzh;
    private final com.google.android.gms.internal.ads.zzcr zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private double zzq;

    public zzct(int i, int i2, float f, float f2, int i3, boolean z) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = f;
        this.zzd = f2;
        this.zze = i / i3;
        this.zzf = i / 400;
        int i4 = i / 65;
        this.zzg = i4;
        this.zzh = i4 + i4;
        this.zzi = z ? new com.google.android.gms.internal.ads.zzcq(this) : new com.google.android.gms.internal.ads.zzcs(this);
    }

    private final void zzo(int i, int i2) {
        com.google.android.gms.internal.ads.zzcr zzcrVar = this.zzi;
        zzcrVar.zzk(i2);
        java.lang.Object zzr = zzcrVar.zzr();
        java.lang.Object zzq = zzcrVar.zzq();
        int i3 = this.zzk;
        int i4 = this.zzb;
        java.lang.System.arraycopy(zzr, i * i4, zzq, i3 * i4, i2 * i4);
        this.zzk += i2;
    }

    public final int zza() {
        return this.zzj * this.zzb * this.zzi.zza();
    }

    public final void zzb(java.nio.ByteBuffer byteBuffer) {
        com.google.android.gms.internal.ads.zzcr zzcrVar = this.zzi;
        int remaining = byteBuffer.remaining();
        int zza = remaining / (this.zzb * zzcrVar.zza());
        zzcrVar.zzj(zza);
        zzcrVar.zzn(byteBuffer, remaining);
        this.zzj += zza;
        zzp();
    }

    public final void zzc(java.nio.ByteBuffer byteBuffer) {
        com.google.android.gms.internal.ads.zzgtj.zzi(this.zzk >= 0);
        int i = this.zzb;
        int remaining = byteBuffer.remaining();
        com.google.android.gms.internal.ads.zzcr zzcrVar = this.zzi;
        int min = java.lang.Math.min(remaining / (zzcrVar.zza() * i), this.zzk);
        zzcrVar.zzo(byteBuffer, min);
        this.zzk -= min;
        java.lang.System.arraycopy(zzcrVar.zzq(), min * i, zzcrVar.zzq(), 0, this.zzk * i);
    }

    public final void zzd() {
        int i = this.zzj;
        int i2 = this.zzo;
        int i3 = this.zzk;
        float f = this.zzc;
        float f2 = this.zzd;
        int i4 = i3 + ((int) (((((((i - i2) / (f / f2)) + i2) + this.zzq) + this.zzl) / (this.zze * f2)) + 0.5d));
        this.zzq = 0.0d;
        int i5 = this.zzh;
        int i6 = i5 + i5;
        com.google.android.gms.internal.ads.zzcr zzcrVar = this.zzi;
        zzcrVar.zzj(i + i6);
        zzcrVar.zzm(i * this.zzb, i6);
        this.zzj += i6;
        zzp();
        if (this.zzk > i4) {
            this.zzk = java.lang.Math.max(i4, 0);
        }
        this.zzj = 0;
        this.zzo = 0;
        this.zzl = 0;
    }

    public final void zze() {
        this.zzj = 0;
        this.zzk = 0;
        this.zzl = 0;
        this.zzm = 0;
        this.zzn = 0;
        this.zzo = 0;
        this.zzp = 0;
        this.zzq = 0.0d;
        this.zzi.zzg();
    }

    public final int zzf() {
        com.google.android.gms.internal.ads.zzgtj.zzi(this.zzk >= 0);
        return this.zzk * this.zzb * this.zzi.zza();
    }

    final /* synthetic */ int zzg() {
        return this.zzb;
    }

    final /* synthetic */ int zzh() {
        return this.zzh;
    }

    final /* synthetic */ int zzi() {
        return this.zzj;
    }

    final /* synthetic */ int zzj() {
        return this.zzk;
    }

    final /* synthetic */ int zzk() {
        return this.zzl;
    }

    final /* synthetic */ int zzl() {
        return this.zzm;
    }

    final /* synthetic */ int zzm() {
        return this.zzn;
    }

    final /* synthetic */ int zzn() {
        return this.zzp;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzp() {
        int i;
        int i2;
        int i3;
        float f;
        int i4;
        int i5;
        int i6;
        float f2;
        int i7;
        int i8;
        int i9;
        long j;
        long j2;
        float f3 = this.zzc;
        float f4 = this.zzd;
        double d = f3 / f4;
        int i10 = 0;
        int i11 = 1;
        int i12 = this.zzk;
        if (d > 1.0000100135803223d || d < 0.9999899864196777d) {
            int i13 = this.zzj;
            int i14 = this.zzh;
            if (i13 >= i14) {
                int i15 = 0;
                while (true) {
                    int i16 = this.zzo;
                    if (i16 > 0) {
                        int min = java.lang.Math.min(i14, i16);
                        zzo(i15, min);
                        this.zzo -= min;
                        i15 += min;
                        f = f4;
                        i = i12;
                        i4 = i14;
                    } else {
                        int i17 = this.zza;
                        int i18 = i17 > 4000 ? i17 / com.vungle.ads.internal.protos.Sdk.SDKError.Reason.VUNGLE_OIT_CREATION_ERROR_VALUE : 1;
                        int i19 = this.zzb;
                        if (i19 == i11) {
                            if (i18 == i11) {
                                i2 = this.zzi.zzf(i15, this.zzf, this.zzg);
                                i = i12;
                                i3 = 1;
                                com.google.android.gms.internal.ads.zzcr zzcrVar = this.zzi;
                                int i20 = !zzcrVar.zzc() ? this.zzp : i2;
                                int i21 = i15 + i20;
                                zzcrVar.zzi();
                                this.zzp = i2;
                                f = f4;
                                double d2 = i20;
                                if (d <= 1.0d) {
                                    double d3 = (-1.0d) + d;
                                    if (d >= 2.0d) {
                                        double d4 = (d2 / d3) + this.zzq;
                                        int round = (int) java.lang.Math.round(d4);
                                        this.zzq = d4 - round;
                                        i4 = i14;
                                        i6 = round;
                                    } else {
                                        i4 = i14;
                                        double d5 = ((d2 * (2.0d - d)) / d3) + this.zzq;
                                        int round2 = (int) java.lang.Math.round(d5);
                                        this.zzo = round2;
                                        this.zzq = d5 - round2;
                                        i6 = i20;
                                    }
                                    zzcrVar.zzk(i6);
                                    zzcrVar.zzh(i6, i3, this.zzk, i15, i21);
                                    this.zzk += i6;
                                    i15 += i20 + i6;
                                } else {
                                    i4 = i14;
                                    int i22 = i20;
                                    double d6 = 1.0d - d;
                                    if (d < 0.5d) {
                                        double d7 = ((d2 * d) / d6) + this.zzq;
                                        int round3 = (int) java.lang.Math.round(d7);
                                        this.zzq = d7 - round3;
                                        i5 = round3;
                                    } else {
                                        double d8 = ((d2 * ((d + d) - 1.0d)) / d6) + this.zzq;
                                        int round4 = (int) java.lang.Math.round(d8);
                                        this.zzo = round4;
                                        this.zzq = d8 - round4;
                                        i5 = i22;
                                    }
                                    int i23 = i22 + i5;
                                    zzcrVar.zzk(i23);
                                    java.lang.System.arraycopy(zzcrVar.zzr(), i15 * i3, zzcrVar.zzq(), this.zzk * i3, i22 * i3);
                                    zzcrVar.zzh(i5, i3, this.zzk + i22, i21, i15);
                                    this.zzk += i23;
                                    i15 += i5;
                                }
                            } else {
                                i19 = 1;
                            }
                        }
                        com.google.android.gms.internal.ads.zzcr zzcrVar2 = this.zzi;
                        zzcrVar2.zzd(i15, i18);
                        int i24 = this.zzf;
                        int i25 = this.zzg;
                        i = i12;
                        int zze = zzcrVar2.zze(i10, i24 / i18, i25 / i18);
                        if (i18 != i11) {
                            int i26 = zze * i18;
                            int i27 = i18 * 4;
                            int i28 = i26 - i27;
                            if (i28 >= i24) {
                                i24 = i28;
                            }
                            int i29 = i26 + i27;
                            if (i29 <= i25) {
                                i25 = i29;
                            }
                            if (i19 == i11) {
                                i2 = zzcrVar2.zzf(i15, i24, i25);
                            } else {
                                zzcrVar2.zzd(i15, i11);
                                i2 = zzcrVar2.zze(i10, i24, i25);
                            }
                        } else {
                            i2 = zze;
                        }
                        i3 = i19;
                        com.google.android.gms.internal.ads.zzcr zzcrVar3 = this.zzi;
                        if (!zzcrVar3.zzc()) {
                        }
                        int i212 = i15 + i20;
                        zzcrVar3.zzi();
                        this.zzp = i2;
                        f = f4;
                        double d22 = i20;
                        if (d <= 1.0d) {
                        }
                    }
                    if (i15 + i4 > i13) {
                        break;
                    }
                    i12 = i;
                    f4 = f;
                    i14 = i4;
                    i10 = 0;
                    i11 = 1;
                }
                int i30 = this.zzj - i15;
                com.google.android.gms.internal.ads.zzcr zzcrVar4 = this.zzi;
                int i31 = this.zzb;
                java.lang.System.arraycopy(zzcrVar4.zzr(), i15 * i31, zzcrVar4.zzr(), 0, i31 * i30);
                this.zzj = i30;
                f2 = this.zze * f;
                if (f2 != 1.0f || this.zzk == (i7 = i)) {
                }
                int i32 = this.zza;
                float f5 = i32 / f2;
                long j3 = i32;
                long j4 = (long) f5;
                while (j4 != 0 && j3 != 0 && j4 % 2 == 0 && j3 % 2 == 0) {
                    j4 /= 2;
                    j3 /= 2;
                }
                int i33 = this.zzk - i7;
                com.google.android.gms.internal.ads.zzcr zzcrVar5 = this.zzi;
                zzcrVar5.zzl(i33);
                int i34 = this.zzb;
                java.lang.System.arraycopy(zzcrVar5.zzq(), i7 * i34, zzcrVar5.zzp(), this.zzl * i34, i33 * i34);
                this.zzk = i7;
                this.zzl += i33;
                int i35 = 0;
                while (true) {
                    i8 = this.zzl - 1;
                    if (i35 >= i8) {
                        break;
                    }
                    while (true) {
                        i9 = this.zzm + 1;
                        j = i9;
                        long j5 = j * j4;
                        j2 = this.zzn;
                        if (j5 <= j2 * j3) {
                            break;
                        }
                        zzcrVar5.zzk(1);
                        zzcrVar5.zzb(i35, j3, j4);
                        this.zzn++;
                        this.zzk++;
                    }
                    this.zzm = i9;
                    if (j == j3) {
                        this.zzm = 0;
                        com.google.android.gms.internal.ads.zzgtj.zzi(j2 == j4);
                        this.zzn = 0;
                    }
                    i35++;
                }
                if (i8 != 0) {
                    java.lang.System.arraycopy(zzcrVar5.zzp(), i8 * i34, zzcrVar5.zzp(), 0, (this.zzl - i8) * i34);
                    this.zzl -= i8;
                    return;
                }
                return;
            }
        } else {
            zzo(0, this.zzj);
            this.zzj = 0;
        }
        f = f4;
        i = i12;
        f2 = this.zze * f;
        if (f2 != 1.0f) {
        }
    }
}
