package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbbd;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
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
        zzec zzg2 = zzg(bArr);
        zzg2.zzn(42);
        return zzg2.zzd(true != zzg2.zzp() ? 8 : 12) + 1;
    }

    public static int zzb(byte[] bArr) {
        zzec zzg2 = zzg(bArr);
        zzg2.zzn(32);
        return zzf(zzg2, zzj, true) + 1;
    }

    public static zzz zzc(byte[] bArr, String str, String str2, int i7, String str3, zzs zzsVar) {
        zzec zzg2 = zzg(bArr);
        zzg2.zzn(60);
        int i8 = zzb[zzg2.zzd(6)];
        int i9 = zzc[zzg2.zzd(4)];
        int zzd2 = zzg2.zzd(5);
        int i10 = zzd2 >= 29 ? -1 : (zzd[zzd2] * zzbbd.zzq.zzf) / 2;
        zzg2.zzn(10);
        int i11 = i8 + (zzg2.zzd(2) > 0 ? 1 : 0);
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

    public static zzacs zzd(byte[] bArr) {
        int i7;
        int i8;
        int i9;
        long j;
        int i10;
        zzec zzg2 = zzg(bArr);
        zzg2.zzn(40);
        int zzd2 = zzg2.zzd(2);
        boolean zzp = zzg2.zzp();
        int i11 = true != zzp ? 16 : 20;
        zzg2.zzn(true != zzp ? 8 : 12);
        int zzd3 = zzg2.zzd(i11) + 1;
        boolean zzp2 = zzg2.zzp();
        int i12 = 0;
        if (zzp2) {
            i7 = zzg2.zzd(2);
            int zzd4 = zzg2.zzd(3) + 1;
            if (zzg2.zzp()) {
                zzg2.zzn(36);
            }
            int zzd5 = zzg2.zzd(3) + 1;
            int zzd6 = zzg2.zzd(3) + 1;
            if (zzd5 != 1 || zzd6 != 1) {
                throw zzaz.zzc("Multiple audio presentations or assets not supported");
            }
            int i13 = zzd2 + 1;
            int zzd7 = zzg2.zzd(i13);
            for (int i14 = 0; i14 < i13; i14++) {
                if (((zzd7 >> i14) & 1) == 1) {
                    zzg2.zzn(8);
                }
            }
            int i15 = zzd4 * 512;
            if (zzg2.zzp()) {
                zzg2.zzn(2);
                int zzd8 = (zzg2.zzd(2) + 1) << 2;
                int zzd9 = zzg2.zzd(2) + 1;
                while (i12 < zzd9) {
                    zzg2.zzn(zzd8);
                    i12++;
                }
            }
            i12 = i15;
        } else {
            i7 = -1;
        }
        zzg2.zzn(i11);
        zzg2.zzn(12);
        if (zzp2) {
            if (zzg2.zzp()) {
                zzg2.zzn(4);
            }
            if (zzg2.zzp()) {
                zzg2.zzn(24);
            }
            if (zzg2.zzp()) {
                zzg2.zzo(zzg2.zzd(10) + 1);
            }
            zzg2.zzn(5);
            int i16 = zze[zzg2.zzd(4)];
            i9 = zzg2.zzd(8) + 1;
            i8 = i16;
        } else {
            i8 = -2147483647;
            i9 = -1;
        }
        if (zzp2) {
            if (i7 == 0) {
                i10 = 32000;
            } else if (i7 == 1) {
                i10 = 44100;
            } else {
                if (i7 != 2) {
                    throw zzaz.zza("Unsupported reference clock code in DTS HD header: " + i7, null);
                }
                i10 = 48000;
            }
            j = zzen.zzu(i12, 1000000L, i10, RoundingMode.DOWN);
        } else {
            j = -9223372036854775807L;
        }
        return new zzacs("audio/vnd.dts.hd;profile=lbr", i9, i8, zzd3, j, 0, null);
    }

    public static zzacs zze(byte[] bArr, AtomicInteger atomicInteger) {
        long j;
        int i7;
        int i8;
        int i9;
        zzec zzg2 = zzg(bArr);
        int zzd2 = zzg2.zzd(32);
        int zzf2 = zzf(zzg2, zzf, true);
        int i10 = zzf2 + 1;
        char c3 = zzd2 == 1078008818 ? (char) 1 : (char) 0;
        if (c3 == 0) {
            j = -9223372036854775807L;
            i7 = -2147483647;
        } else {
            if (!zzg2.zzp()) {
                throw zzaz.zzc("Only supports full channel mask-based audio presentation");
            }
            int i11 = zzf2 - 1;
            if (((bArr[zzf2] & 255) | ((char) (bArr[i11] << 8))) != zzen.zze(bArr, 0, i11, 65535)) {
                throw zzaz.zza("CRC check failed", null);
            }
            int zzd3 = zzg2.zzd(2);
            if (zzd3 == 0) {
                i8 = 512;
            } else if (zzd3 == 1) {
                i8 = 480;
            } else {
                if (zzd3 != 2) {
                    throw zzaz.zza("Unsupported base duration index in DTS UHD header: " + zzd3, null);
                }
                i8 = 384;
            }
            int zzd4 = zzg2.zzd(3) + 1;
            int zzd5 = zzg2.zzd(2);
            if (zzd5 == 0) {
                i9 = 32000;
            } else if (zzd5 == 1) {
                i9 = 44100;
            } else {
                if (zzd5 != 2) {
                    throw zzaz.zza("Unsupported clock rate index in DTS UHD header: " + zzd5, null);
                }
                i9 = 48000;
            }
            if (zzg2.zzp()) {
                zzg2.zzn(36);
            }
            i7 = (1 << zzg2.zzd(2)) * i9;
            j = zzen.zzu(i8 * zzd4, 1000000L, i9, RoundingMode.DOWN);
        }
        int i12 = i7;
        long j3 = j;
        int i13 = 0;
        for (char c4 = 0; c4 < c3; c4 = 1) {
            i13 += zzf(zzg2, zzg, true);
        }
        for (int i14 = 0; i14 <= 0; i14++) {
            if (c3 != 0) {
                atomicInteger.set(zzf(zzg2, zzh, true));
            }
            i13 += atomicInteger.get() != 0 ? zzf(zzg2, zzi, true) : 0;
        }
        return new zzacs("audio/vnd.dts.uhd;profile=p2", 2, i12, i10 + i13, j3, 0, null);
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
        if (b7 == Byte.MAX_VALUE || b7 == 100 || b7 == 64 || b7 == 113) {
            return new zzec(bArr, bArr.length);
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        byte b8 = copyOf[0];
        if (b8 == -2 || b8 == -1 || b8 == 37 || b8 == -14 || b8 == -24) {
            for (int i7 = 0; i7 < copyOf.length - 1; i7 += 2) {
                byte b9 = copyOf[i7];
                int i8 = i7 + 1;
                copyOf[i7] = copyOf[i8];
                copyOf[i8] = b9;
            }
        }
        int length = copyOf.length;
        zzec zzecVar = new zzec(copyOf, length);
        if (copyOf[0] == 31) {
            zzec zzecVar2 = new zzec(copyOf, length);
            while (zzecVar2.zza() >= 16) {
                zzecVar2.zzn(2);
                zzecVar.zzg(zzecVar2.zzd(14), 14);
            }
        }
        zzecVar.zzk(copyOf, copyOf.length);
        return zzecVar;
    }
}
