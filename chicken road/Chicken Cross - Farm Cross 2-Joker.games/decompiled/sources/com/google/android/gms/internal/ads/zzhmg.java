package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzhmg {
    final long[] zza;
    final long[] zzb;
    final long[] zzc;

    zzhmg() {
        this(new long[10], new long[10], new long[10]);
    }

    zzhmg(long[] jArr, long[] jArr2, long[] jArr3) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = jArr3;
    }

    static zzhmg zza(zzhmg zzhmgVar, zzhmf zzhmfVar) {
        zzhmg zzhmgVar2 = zzhmfVar.zza;
        long[] jArr = zzhmgVar.zza;
        long[] jArr2 = zzhmgVar2.zza;
        long[] jArr3 = zzhmfVar.zzb;
        zzhmp.zze(jArr, jArr2, jArr3);
        long[] jArr4 = zzhmgVar.zzb;
        long[] jArr5 = zzhmgVar2.zzb;
        long[] jArr6 = zzhmgVar2.zzc;
        zzhmp.zze(jArr4, jArr5, jArr6);
        zzhmp.zze(zzhmgVar.zzc, jArr6, jArr3);
        return zzhmgVar;
    }

    final byte[] zzb() {
        long[] jArr = new long[10];
        long[] jArr2 = new long[10];
        long[] jArr3 = new long[10];
        int i = zzhmp.zza;
        long[] jArr4 = new long[10];
        long[] jArr5 = new long[10];
        long[] jArr6 = new long[10];
        long[] jArr7 = new long[10];
        long[] jArr8 = new long[10];
        long[] jArr9 = new long[10];
        long[] jArr10 = new long[10];
        long[] jArr11 = new long[10];
        long[] jArr12 = new long[10];
        long[] jArr13 = new long[10];
        long[] jArr14 = this.zzc;
        zzhmp.zzf(jArr4, jArr14);
        zzhmp.zzf(jArr13, jArr4);
        zzhmp.zzf(jArr12, jArr13);
        zzhmp.zze(jArr5, jArr12, jArr14);
        zzhmp.zze(jArr6, jArr5, jArr4);
        zzhmp.zzf(jArr12, jArr6);
        zzhmp.zze(jArr7, jArr12, jArr5);
        zzhmp.zzf(jArr12, jArr7);
        zzhmp.zzf(jArr13, jArr12);
        zzhmp.zzf(jArr12, jArr13);
        zzhmp.zzf(jArr13, jArr12);
        zzhmp.zzf(jArr12, jArr13);
        zzhmp.zze(jArr8, jArr12, jArr7);
        zzhmp.zzf(jArr12, jArr8);
        zzhmp.zzf(jArr13, jArr12);
        for (int i2 = 2; i2 < 10; i2 += 2) {
            zzhmp.zzf(jArr12, jArr13);
            zzhmp.zzf(jArr13, jArr12);
        }
        zzhmp.zze(jArr9, jArr13, jArr8);
        zzhmp.zzf(jArr12, jArr9);
        zzhmp.zzf(jArr13, jArr12);
        for (int i3 = 2; i3 < 20; i3 += 2) {
            zzhmp.zzf(jArr12, jArr13);
            zzhmp.zzf(jArr13, jArr12);
        }
        zzhmp.zze(jArr12, jArr13, jArr9);
        zzhmp.zzf(jArr13, jArr12);
        zzhmp.zzf(jArr12, jArr13);
        for (int i4 = 2; i4 < 10; i4 += 2) {
            zzhmp.zzf(jArr13, jArr12);
            zzhmp.zzf(jArr12, jArr13);
        }
        zzhmp.zze(jArr10, jArr12, jArr8);
        zzhmp.zzf(jArr12, jArr10);
        zzhmp.zzf(jArr13, jArr12);
        for (int i5 = 2; i5 < 50; i5 += 2) {
            zzhmp.zzf(jArr12, jArr13);
            zzhmp.zzf(jArr13, jArr12);
        }
        zzhmp.zze(jArr11, jArr13, jArr10);
        zzhmp.zzf(jArr13, jArr11);
        zzhmp.zzf(jArr12, jArr13);
        for (int i6 = 2; i6 < 100; i6 += 2) {
            zzhmp.zzf(jArr13, jArr12);
            zzhmp.zzf(jArr12, jArr13);
        }
        zzhmp.zze(jArr13, jArr12, jArr11);
        zzhmp.zzf(jArr12, jArr13);
        zzhmp.zzf(jArr13, jArr12);
        for (int i7 = 2; i7 < 50; i7 += 2) {
            zzhmp.zzf(jArr12, jArr13);
            zzhmp.zzf(jArr13, jArr12);
        }
        zzhmp.zze(jArr12, jArr13, jArr10);
        zzhmp.zzf(jArr13, jArr12);
        zzhmp.zzf(jArr12, jArr13);
        zzhmp.zzf(jArr13, jArr12);
        zzhmp.zzf(jArr12, jArr13);
        zzhmp.zzf(jArr13, jArr12);
        zzhmp.zze(jArr, jArr13, jArr6);
        zzhmp.zze(jArr2, this.zza, jArr);
        zzhmp.zze(jArr3, this.zzb, jArr);
        byte[] zzh = zzhmp.zzh(jArr3);
        zzh[31] = (byte) ((zzhmi.zzf(jArr2) << 7) ^ zzh[31]);
        return zzh;
    }

    zzhmg(zzhmf zzhmfVar) {
        this();
        zza(this, zzhmfVar);
    }

    zzhmg(zzhmg zzhmgVar) {
        this.zza = Arrays.copyOf(zzhmgVar.zza, 10);
        this.zzb = Arrays.copyOf(zzhmgVar.zzb, 10);
        this.zzc = Arrays.copyOf(zzhmgVar.zzc, 10);
    }
}
