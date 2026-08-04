package com.google.android.gms.internal.ads;

import java.math.RoundingMode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class zzacu {
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

    public static int zza(byte[] bArr) {
        zzec zzecVarZzg = zzg(bArr);
        zzecVarZzg.zzn(42);
        return zzecVarZzg.zzd(true != zzecVarZzg.zzp() ? 8 : 12) + 1;
    }

    public static int zzb(byte[] bArr) {
        zzec zzecVarZzg = zzg(bArr);
        zzecVarZzg.zzn(32);
        return zzf(zzecVarZzg, zzj, true) + 1;
    }

    public static zzz zzc(byte[] bArr, String str, String str2, int i7, String str3, zzs zzsVar) {
        zzec zzecVarZzg = zzg(bArr);
        zzecVarZzg.zzn(60);
        int i8 = zzb[zzecVarZzg.zzd(6)];
        int i9 = zzc[zzecVarZzg.zzd(4)];
        int iZzd = zzecVarZzg.zzd(5);
        int i10 = iZzd >= 29 ? -1 : (zzd[iZzd] * zzbbd.zzq.zzf) / 2;
        zzecVarZzg.zzn(10);
        int i11 = i8 + (zzecVarZzg.zzd(2) > 0 ? 1 : 0);
        zzx zzxVar = new zzx();
        zzxVar.zzO(str);
        zzxVar.zzE("video/mp2t");
        zzxVar.zzad("audio/vnd.dts");
        zzxVar.zzA(i10);
        zzxVar.zzB(i11);
        zzxVar.zzae(i9);
        zzxVar.zzH(null);
        zzxVar.zzS(str2);
        zzxVar.zzab(i7);
        return zzxVar.zzaj();
    }

    public static zzacs zzd(byte[] bArr) throws zzaz {
        int iZzd;
        int i7;
        int iZzd2;
        long jZzu;
        int i8;
        zzec zzecVarZzg = zzg(bArr);
        zzecVarZzg.zzn(40);
        int iZzd3 = zzecVarZzg.zzd(2);
        boolean zZzp = zzecVarZzg.zzp();
        int i9 = true != zZzp ? 16 : 20;
        zzecVarZzg.zzn(true != zZzp ? 8 : 12);
        int iZzd4 = zzecVarZzg.zzd(i9) + 1;
        boolean zZzp2 = zzecVarZzg.zzp();
        int i10 = 0;
        if (zZzp2) {
            iZzd = zzecVarZzg.zzd(2);
            int iZzd5 = zzecVarZzg.zzd(3) + 1;
            if (zzecVarZzg.zzp()) {
                zzecVarZzg.zzn(36);
            }
            int iZzd6 = zzecVarZzg.zzd(3) + 1;
            int iZzd7 = zzecVarZzg.zzd(3) + 1;
            if (iZzd6 != 1 || iZzd7 != 1) {
                throw zzaz.zzc("Multiple audio presentations or assets not supported");
            }
            int i11 = iZzd3 + 1;
            int iZzd8 = zzecVarZzg.zzd(i11);
            for (int i12 = 0; i12 < i11; i12++) {
                if (((iZzd8 >> i12) & 1) == 1) {
                    zzecVarZzg.zzn(8);
                }
            }
            int i13 = iZzd5 * 512;
            if (zzecVarZzg.zzp()) {
                zzecVarZzg.zzn(2);
                int iZzd9 = (zzecVarZzg.zzd(2) + 1) << 2;
                int iZzd10 = zzecVarZzg.zzd(2) + 1;
                while (i10 < iZzd10) {
                    zzecVarZzg.zzn(iZzd9);
                    i10++;
                }
            }
            i10 = i13;
        } else {
            iZzd = -1;
        }
        zzecVarZzg.zzn(i9);
        zzecVarZzg.zzn(12);
        if (zZzp2) {
            if (zzecVarZzg.zzp()) {
                zzecVarZzg.zzn(4);
            }
            if (zzecVarZzg.zzp()) {
                zzecVarZzg.zzn(24);
            }
            if (zzecVarZzg.zzp()) {
                zzecVarZzg.zzo(zzecVarZzg.zzd(10) + 1);
            }
            zzecVarZzg.zzn(5);
            int i14 = zze[zzecVarZzg.zzd(4)];
            iZzd2 = zzecVarZzg.zzd(8) + 1;
            i7 = i14;
        } else {
            i7 = -2147483647;
            iZzd2 = -1;
        }
        if (zZzp2) {
            if (iZzd == 0) {
                i8 = 32000;
            } else if (iZzd == 1) {
                i8 = 44100;
            } else {
                if (iZzd != 2) {
                    throw zzaz.zza("Unsupported reference clock code in DTS HD header: " + iZzd, null);
                }
                i8 = 48000;
            }
            jZzu = zzen.zzu(i10, 1000000L, i8, RoundingMode.DOWN);
        } else {
            jZzu = -9223372036854775807L;
        }
        return new zzacs("audio/vnd.dts.hd;profile=lbr", iZzd2, i7, iZzd4, jZzu, 0, null);
    }

    public static zzacs zze(byte[] bArr, AtomicInteger atomicInteger) throws zzaz {
        long jZzu;
        int iZzd;
        int i7;
        int i8;
        zzec zzecVarZzg = zzg(bArr);
        int iZzd2 = zzecVarZzg.zzd(32);
        int iZzf = zzf(zzecVarZzg, zzf, true);
        int i9 = iZzf + 1;
        char c3 = iZzd2 == 1078008818 ? (char) 1 : (char) 0;
        if (c3 == 0) {
            jZzu = -9223372036854775807L;
            iZzd = -2147483647;
        } else {
            if (!zzecVarZzg.zzp()) {
                throw zzaz.zzc("Only supports full channel mask-based audio presentation");
            }
            int i10 = iZzf - 1;
            if (((bArr[iZzf] & 255) | ((char) (bArr[i10] << 8))) != zzen.zze(bArr, 0, i10, 65535)) {
                throw zzaz.zza("CRC check failed", null);
            }
            int iZzd3 = zzecVarZzg.zzd(2);
            if (iZzd3 == 0) {
                i7 = 512;
            } else if (iZzd3 == 1) {
                i7 = 480;
            } else {
                if (iZzd3 != 2) {
                    throw zzaz.zza("Unsupported base duration index in DTS UHD header: " + iZzd3, null);
                }
                i7 = 384;
            }
            int iZzd4 = zzecVarZzg.zzd(3) + 1;
            int iZzd5 = zzecVarZzg.zzd(2);
            if (iZzd5 == 0) {
                i8 = 32000;
            } else if (iZzd5 == 1) {
                i8 = 44100;
            } else {
                if (iZzd5 != 2) {
                    throw zzaz.zza("Unsupported clock rate index in DTS UHD header: " + iZzd5, null);
                }
                i8 = 48000;
            }
            if (zzecVarZzg.zzp()) {
                zzecVarZzg.zzn(36);
            }
            iZzd = (1 << zzecVarZzg.zzd(2)) * i8;
            jZzu = zzen.zzu(i7 * iZzd4, 1000000L, i8, RoundingMode.DOWN);
        }
        int i11 = iZzd;
        long j = jZzu;
        int iZzf2 = 0;
        for (char c4 = 0; c4 < c3; c4 = 1) {
            iZzf2 += zzf(zzecVarZzg, zzg, true);
        }
        for (int i12 = 0; i12 <= 0; i12++) {
            if (c3 != 0) {
                atomicInteger.set(zzf(zzecVarZzg, zzh, true));
            }
            iZzf2 += atomicInteger.get() != 0 ? zzf(zzecVarZzg, zzi, true) : 0;
        }
        return new zzacs("audio/vnd.dts.uhd;profile=p2", 2, i11, i9 + iZzf2, j, 0, null);
    }

    private static int zzf(zzec zzecVar, int[] iArr, boolean z4) {
        int i7 = 0;
        for (int i8 = 0; i8 < 3 && zzecVar.zzp(); i8++) {
            i7++;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < i7; i10++) {
            i9 += 1 << iArr[i10];
        }
        return zzecVar.zzd(iArr[i7]) + i9;
    }

    private static zzec zzg(byte[] bArr) {
        byte b7 = bArr[0];
        if (b7 == 127 || b7 == 100 || b7 == 64 || b7 == 113) {
            return new zzec(bArr, bArr.length);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        byte b8 = bArrCopyOf[0];
        if (b8 == -2 || b8 == -1 || b8 == 37 || b8 == -14 || b8 == -24) {
            for (int i7 = 0; i7 < bArrCopyOf.length - 1; i7 += 2) {
                byte b9 = bArrCopyOf[i7];
                int i8 = i7 + 1;
                bArrCopyOf[i7] = bArrCopyOf[i8];
                bArrCopyOf[i8] = b9;
            }
        }
        int length = bArrCopyOf.length;
        zzec zzecVar = new zzec(bArrCopyOf, length);
        if (bArrCopyOf[0] == 31) {
            zzec zzecVar2 = new zzec(bArrCopyOf, length);
            while (zzecVar2.zza() >= 16) {
                zzecVar2.zzn(2);
                zzecVar.zzg(zzecVar2.zzd(14), 14);
            }
        }
        zzecVar.zzk(bArrCopyOf, bArrCopyOf.length);
        return zzecVar;
    }
}
