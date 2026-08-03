package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzafx {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    private static final int[] zzc = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    private static final int[] zzd = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
    private static final int[] zze = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};
    private static final int[] zzf = {5, 8, 10, 12};
    private static final int[] zzg = {6, 9, 12, 15};
    private static final int[] zzh = {2, 4, 6, 8};
    private static final int[] zzi = {9, 11, 13, 16};
    private static final int[] zzj = {5, 8, 10, 12};

    public static int zza(int i) {
        if (i == 2147385345 || i == -25230976 || i == 536864768 || i == -14745368) {
            return 1;
        }
        if (i == 1683496997 || i == 622876772) {
            return 2;
        }
        if (i == 1078008818 || i == -233094848) {
            return 3;
        }
        return (i == 1908687592 || i == -398277519) ? 4 : 0;
    }

    public static com.google.android.gms.internal.ads.zzv zzb(byte[] bArr, java.lang.String str, java.lang.String str2, int i, java.lang.String str3, com.google.android.gms.internal.ads.zzq zzqVar) {
        com.google.android.gms.internal.ads.zzes zzi2 = zzi(bArr);
        zzi2.zzh(60);
        int i2 = zzb[zzi2.zzj(6)];
        int i3 = zzc[zzi2.zzj(4)];
        int zzj2 = zzi2.zzj(5);
        int i4 = zzj2 >= 29 ? -1 : (zzd[zzj2] * 1000) / 2;
        zzi2.zzh(10);
        int i5 = i2 + (zzi2.zzj(2) > 0 ? 1 : 0);
        com.google.android.gms.internal.ads.zzt zztVar = new com.google.android.gms.internal.ads.zzt();
        zztVar.zza(str);
        zztVar.zzn("video/mp2t");
        zztVar.zzo("audio/vnd.dts");
        zztVar.zzi(i4);
        zztVar.zzG(i5);
        zztVar.zzH(i3);
        zztVar.zzs(null);
        zztVar.zze(str2);
        zztVar.zzg(i);
        return zztVar.zzO();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int zzc(byte[] bArr) {
        int i;
        int i2;
        byte b;
        int i3;
        int i4;
        int i5;
        byte b2;
        boolean z = false;
        byte b3 = bArr[0];
        if (b3 != -2) {
            if (b3 == -1) {
                i4 = (bArr[7] & 3) << 12;
                i5 = (bArr[6] & 255) << 4;
                b2 = bArr[9];
            } else if (b3 != 31) {
                i = (bArr[5] & 3) << 12;
                i2 = (bArr[6] & 255) << 4;
                b = bArr[7];
            } else {
                i4 = (bArr[6] & 3) << 12;
                i5 = (bArr[7] & 255) << 4;
                b2 = bArr[8];
            }
            i3 = (((b2 & 60) >> 2) | i4 | i5) + 1;
            z = true;
            return !z ? (i3 * 16) / 14 : i3;
        }
        i = (bArr[4] & 3) << 12;
        i2 = (bArr[7] & 255) << 4;
        b = bArr[6];
        i3 = (((b & 240) >> 4) | i | i2) + 1;
        if (!z) {
        }
    }

    public static com.google.android.gms.internal.ads.zzafw zzd(byte[] bArr) throws com.google.android.gms.internal.ads.zzat {
        int i;
        int i2;
        int i3;
        long j;
        int i4;
        com.google.android.gms.internal.ads.zzes zzi2 = zzi(bArr);
        zzi2.zzh(40);
        int zzj2 = zzi2.zzj(2);
        boolean zzi3 = zzi2.zzi();
        int i5 = true != zzi3 ? 16 : 20;
        zzi2.zzh(true != zzi3 ? 8 : 12);
        int zzj3 = zzi2.zzj(i5) + 1;
        boolean zzi4 = zzi2.zzi();
        int i6 = 0;
        if (zzi4) {
            i = zzi2.zzj(2);
            int zzj4 = zzi2.zzj(3) + 1;
            if (zzi2.zzi()) {
                zzi2.zzh(36);
            }
            int zzj5 = zzi2.zzj(3) + 1;
            int zzj6 = zzi2.zzj(3) + 1;
            if (zzj5 != 1 || zzj6 != 1) {
                throw com.google.android.gms.internal.ads.zzat.zzc("Multiple audio presentations or assets not supported");
            }
            int i7 = zzj2 + 1;
            int zzj7 = zzi2.zzj(i7);
            for (int i8 = 0; i8 < i7; i8++) {
                if (((zzj7 >> i8) & 1) == 1) {
                    zzi2.zzh(8);
                }
            }
            int i9 = zzj4 * 512;
            if (zzi2.zzi()) {
                zzi2.zzh(2);
                int zzj8 = (zzi2.zzj(2) + 1) << 2;
                int zzj9 = zzi2.zzj(2) + 1;
                while (i6 < zzj9) {
                    zzi2.zzh(zzj8);
                    i6++;
                }
            }
            i6 = i9;
        } else {
            i = -1;
        }
        zzi2.zzh(i5);
        zzi2.zzh(12);
        if (zzi4) {
            if (zzi2.zzi()) {
                zzi2.zzh(4);
            }
            if (zzi2.zzi()) {
                zzi2.zzh(24);
            }
            if (zzi2.zzi()) {
                zzi2.zzo(zzi2.zzj(10) + 1);
            }
            zzi2.zzh(5);
            int i10 = zze[zzi2.zzj(4)];
            i2 = zzi2.zzj(8) + 1;
            i3 = i10;
        } else {
            i2 = -1;
            i3 = -2147483647;
        }
        if (zzi4) {
            if (i == 0) {
                i4 = 32000;
            } else if (i == 1) {
                i4 = 44100;
            } else {
                if (i != 2) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 51);
                    sb.append("Unsupported reference clock code in DTS HD header: ");
                    sb.append(i);
                    throw com.google.android.gms.internal.ads.zzat.zzb(sb.toString(), null);
                }
                i4 = 48000;
            }
            j = com.google.android.gms.internal.ads.zzfl.zzv(i6, 1000000L, i4, java.math.RoundingMode.DOWN);
        } else {
            j = -9223372036854775807L;
        }
        return new com.google.android.gms.internal.ads.zzafw("audio/vnd.dts.hd;profile=lbr", i2, i3, zzj3, j, 0, null);
    }

    public static int zze(byte[] bArr) {
        com.google.android.gms.internal.ads.zzes zzi2 = zzi(bArr);
        zzi2.zzh(42);
        return zzi2.zzj(true != zzi2.zzi() ? 8 : 12) + 1;
    }

    public static com.google.android.gms.internal.ads.zzafw zzf(byte[] bArr, java.util.concurrent.atomic.AtomicInteger atomicInteger) throws com.google.android.gms.internal.ads.zzat {
        long j;
        int i;
        int i2;
        int i3;
        com.google.android.gms.internal.ads.zzes zzi2 = zzi(bArr);
        int zzj2 = zzi2.zzj(32);
        int zzh2 = zzh(zzi2, zzf, true);
        int i4 = zzh2 + 1;
        char c = zzj2 == 1078008818 ? (char) 1 : (char) 0;
        if (c == 0) {
            j = -9223372036854775807L;
            i = -2147483647;
        } else {
            if (!zzi2.zzi()) {
                throw com.google.android.gms.internal.ads.zzat.zzc("Only supports full channel mask-based audio presentation");
            }
            int i5 = zzh2 - 1;
            if (((bArr[zzh2] & 255) | ((char) (bArr[i5] << 8))) != com.google.android.gms.internal.ads.zzfl.zzK(bArr, 0, i5, 65535)) {
                throw com.google.android.gms.internal.ads.zzat.zzb("CRC check failed", null);
            }
            int zzj3 = zzi2.zzj(2);
            if (zzj3 == 0) {
                i2 = 512;
            } else if (zzj3 == 1) {
                i2 = 480;
            } else {
                if (zzj3 != 2) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(zzj3).length() + 51);
                    sb.append("Unsupported base duration index in DTS UHD header: ");
                    sb.append(zzj3);
                    throw com.google.android.gms.internal.ads.zzat.zzb(sb.toString(), null);
                }
                i2 = 384;
            }
            int zzj4 = zzi2.zzj(3) + 1;
            int zzj5 = zzi2.zzj(2);
            if (zzj5 == 0) {
                i3 = 32000;
            } else if (zzj5 == 1) {
                i3 = 44100;
            } else {
                if (zzj5 != 2) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(zzj5).length() + 48);
                    sb2.append("Unsupported clock rate index in DTS UHD header: ");
                    sb2.append(zzj5);
                    throw com.google.android.gms.internal.ads.zzat.zzb(sb2.toString(), null);
                }
                i3 = 48000;
            }
            if (zzi2.zzi()) {
                zzi2.zzh(36);
            }
            i = (1 << zzi2.zzj(2)) * i3;
            j = com.google.android.gms.internal.ads.zzfl.zzv(i2 * zzj4, 1000000L, i3, java.math.RoundingMode.DOWN);
        }
        int i6 = 0;
        for (char c2 = 0; c2 < c; c2 = 1) {
            i6 += zzh(zzi2, zzg, true);
        }
        for (int i7 = 0; i7 <= 0; i7++) {
            if (c != 0) {
                atomicInteger.set(zzh(zzi2, zzh, true));
            }
            i6 += atomicInteger.get() != 0 ? zzh(zzi2, zzi, true) : 0;
        }
        return new com.google.android.gms.internal.ads.zzafw("audio/vnd.dts.uhd;profile=p2", 2, i, i4 + i6, j, 0, null);
    }

    public static int zzg(byte[] bArr) {
        com.google.android.gms.internal.ads.zzes zzi2 = zzi(bArr);
        zzi2.zzh(32);
        return zzh(zzi2, zzj, true) + 1;
    }

    private static int zzh(com.google.android.gms.internal.ads.zzes zzesVar, int[] iArr, boolean z) {
        int i = 0;
        for (int i2 = 0; i2 < 3 && zzesVar.zzi(); i2++) {
            i++;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            i3 += 1 << iArr[i4];
        }
        return i3 + zzesVar.zzj(iArr[i]);
    }

    private static com.google.android.gms.internal.ads.zzes zzi(byte[] bArr) {
        byte b = bArr[0];
        if (b == Byte.MAX_VALUE || b == 100 || b == 64 || b == 113) {
            return new com.google.android.gms.internal.ads.zzes(bArr, bArr.length);
        }
        byte[] copyOf = java.util.Arrays.copyOf(bArr, bArr.length);
        byte b2 = copyOf[0];
        if (b2 == -2 || b2 == -1 || b2 == 37 || b2 == -14 || b2 == -24) {
            for (int i = 0; i < copyOf.length - 1; i += 2) {
                byte b3 = copyOf[i];
                int i2 = i + 1;
                copyOf[i] = copyOf[i2];
                copyOf[i2] = b3;
            }
        }
        int length = copyOf.length;
        com.google.android.gms.internal.ads.zzes zzesVar = new com.google.android.gms.internal.ads.zzes(copyOf, length);
        if (copyOf[0] == 31) {
            com.google.android.gms.internal.ads.zzes zzesVar2 = new com.google.android.gms.internal.ads.zzes(copyOf, length);
            while (zzesVar2.zzc() >= 16) {
                zzesVar2.zzh(2);
                zzesVar.zzp(zzesVar2.zzj(14), 14);
            }
        }
        zzesVar.zzb(copyOf, copyOf.length);
        return zzesVar;
    }
}
