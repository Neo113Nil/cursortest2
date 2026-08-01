package com.google.android.gms.internal.ads;

import com.google.android.material.internal.ViewUtils;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzagg {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    private static final int[] zzc = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    private static final int[] zzd = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, ViewUtils.EDGE_TO_EDGE_FLAGS, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
    private static final int[] zze = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};
    private static final int[] zzf = {5, 8, 10, 12};
    private static final int[] zzg = {6, 9, 12, 15};
    private static final int[] zzh = {2, 4, 6, 8};
    private static final int[] zzi = {9, 11, 13, 16};
    private static final int[] zzj = {5, 8, 10, 12};

    public static boolean zza(String str) {
        return Objects.equals(str, "audio/vnd.dts") || Objects.equals(str, "audio/vnd.dts.hd");
    }

    public static int zzb(int i) {
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

    public static zzv zzc(byte[] bArr, String str, String str2, int i, String str3, zzq zzqVar) {
        zzet zzl = zzl(bArr);
        zzl.zzh(60);
        int i2 = zzb[zzl.zzj(6)];
        int i3 = zzc[zzl.zzj(4)];
        int zzj2 = zzl.zzj(5);
        int i4 = zzj2 >= 29 ? -1 : (zzd[zzj2] * 1000) / 2;
        zzl.zzh(10);
        int i5 = i2 + (zzl.zzj(2) > 0 ? 1 : 0);
        zzt zztVar = new zzt();
        zztVar.zza(str);
        zztVar.zzn("video/mp2t");
        zztVar.zzo("audio/vnd.dts");
        zztVar.zzi(i4);
        zztVar.zzH(i5);
        zztVar.zzJ(i3);
        zztVar.zzs(null);
        zztVar.zze(str2);
        zztVar.zzg(i);
        return zztVar.zzQ();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int zzd(byte[] bArr) {
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

    /* JADX WARN: Code restructure failed: missing block: B:133:0x022a, code lost:
    
        if ((r0.zzj(12) & 256) != 0) goto L116;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzagf zze(byte[] bArr) throws zzat {
        boolean z;
        int i;
        int i2;
        int[] iArr;
        int i3;
        String str;
        int i4;
        long j;
        int i5;
        boolean z2;
        boolean z3;
        int i6;
        int i7;
        zzet zzl = zzl(bArr);
        zzl.zzh(40);
        int zzj2 = zzl.zzj(2);
        boolean zzi2 = zzl.zzi();
        int i8 = true != zzi2 ? 16 : 20;
        zzl.zzh(true != zzi2 ? 8 : 12);
        int zzj3 = zzl.zzj(i8) + 1;
        boolean zzi3 = zzl.zzi();
        if (zzi3) {
            i = zzl.zzj(2);
            int zzj4 = zzl.zzj(3) + 1;
            if (zzl.zzi()) {
                zzl.zzh(36);
            }
            int zzj5 = zzl.zzj(3) + 1;
            int zzj6 = zzl.zzj(3) + 1;
            if (zzj5 != 1 || zzj6 != 1) {
                throw zzat.zzc("Multiple audio presentations or assets not supported");
            }
            int i9 = zzj2 + 1;
            int zzj7 = zzl.zzj(i9);
            for (int i10 = 0; i10 < i9; i10++) {
                if (((zzj7 >> i10) & 1) == 1) {
                    zzl.zzh(8);
                }
            }
            z = zzl.zzi();
            if (z) {
                zzl.zzh(2);
                int zzj8 = (zzl.zzj(2) + 1) << 2;
                int zzj9 = zzl.zzj(2) + 1;
                iArr = new int[zzj9];
                for (int i11 = 0; i11 < zzj9; i11++) {
                    iArr[i11] = zzj(zzl.zzj(zzj8));
                }
            } else {
                iArr = null;
            }
            i2 = zzj4 * 512;
        } else {
            z = false;
            i = -1;
            i2 = 0;
            iArr = null;
        }
        zzl.zzh(i8);
        zzl.zzh(12);
        if (zzi3) {
            if (zzl.zzi()) {
                zzl.zzh(4);
            }
            if (zzl.zzi()) {
                zzl.zzh(24);
            }
            if (zzl.zzi()) {
                zzl.zzo(zzl.zzj(10) + 1);
            }
            int i12 = 5;
            zzl.zzh(5);
            int i13 = zze[zzl.zzj(4)];
            int zzj10 = zzl.zzj(8) + 1;
            if (zzl.zzi()) {
                z2 = zzj10 > 2 ? zzl.zzi() : false;
                z3 = zzj10 > 6 ? zzl.zzi() : false;
                if (zzl.zzi()) {
                    i7 = (zzl.zzj(2) + 1) << 2;
                    zzl.zzh(i7);
                } else {
                    i7 = 0;
                }
                int zzj11 = zzl.zzj(3);
                int[] iArr2 = new int[zzj11];
                for (int i14 = 0; i14 < zzj11; i14++) {
                    iArr2[i14] = zzl.zzj(i7);
                }
                int i15 = 0;
                while (i15 < zzj11) {
                    int zzj12 = zzj(iArr2[i15]);
                    int zzj13 = zzl.zzj(i12) + 1;
                    int i16 = 0;
                    while (i16 < zzj12) {
                        zzl.zzh(Integer.bitCount(zzl.zzj(zzj13)) * 5);
                        i16++;
                        zzj11 = zzj11;
                    }
                    i15++;
                    i12 = 5;
                }
            } else {
                zzl.zzh(3);
                z2 = false;
                z3 = false;
            }
            boolean zzi4 = zzl.zzi();
            if (zzi4) {
                zzl.zzh(8);
            }
            if (zzl.zzi()) {
                zzl.zzh(5);
            }
            if (zzi4 && z2) {
                zzl.zzh(8);
            }
            if (z && zzl.zzi()) {
                iArr.getClass();
                zzl.zzh(7);
                if (zzl.zzj(2) < 3) {
                    zzl.zzh(3);
                } else {
                    zzl.zzh(8);
                }
                boolean zzi5 = zzl.zzi();
                for (int i17 : iArr) {
                    if (zzi5) {
                        zzl.zzh(i17 * 6);
                    } else {
                        zzl.zzh(6);
                    }
                }
                int[] iArr3 = new int[3];
                int i18 = 0;
                iArr3[0] = zzj10;
                if (z3) {
                    iArr3[1] = 6;
                    i6 = 2;
                } else {
                    i6 = 1;
                }
                if (z2) {
                    iArr3[i6] = 2;
                    i6++;
                }
                int length = iArr.length;
                int i19 = 0;
                while (i19 < length) {
                    int i20 = iArr[i19];
                    int i21 = i18;
                    while (i21 < i6) {
                        int i22 = iArr3[i21];
                        while (i18 < i22) {
                            zzl.zzh(Integer.bitCount(zzl.zzj(i20)) * 6);
                            i18++;
                            iArr3 = iArr3;
                        }
                        i21++;
                        i18 = 0;
                    }
                    i19++;
                    i18 = 0;
                }
            }
            int zzj14 = zzl.zzj(2);
            String str2 = "audio/vnd.dts.hd;profile=lbr";
            if (zzj14 != 0) {
                if (zzj14 != 1) {
                    if (zzj14 != 2) {
                        StringBuilder sb = new StringBuilder(String.valueOf(zzj14).length() + 42);
                        sb.append("Unsupported coding mode in DTS HD header: ");
                        sb.append(zzj14);
                        throw zzat.zzb(sb.toString(), null);
                    }
                    i3 = i13;
                    i4 = zzj10;
                    str = str2;
                }
                str2 = "audio/vnd.dts.hd";
                i3 = i13;
                i4 = zzj10;
                str = str2;
            }
        } else {
            i3 = -2147483647;
            str = null;
            i4 = -1;
        }
        if (zzi3) {
            if (i == 0) {
                i5 = 32000;
            } else if (i == 1) {
                i5 = 44100;
            } else {
                if (i != 2) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 51);
                    sb2.append("Unsupported reference clock code in DTS HD header: ");
                    sb2.append(i);
                    throw zzat.zzb(sb2.toString(), null);
                }
                i5 = 48000;
            }
            j = zzfm.zzw(i2, 1000000L, i5, RoundingMode.DOWN);
        } else {
            j = -9223372036854775807L;
        }
        return new zzagf(str, i4, i3, zzj3, j, 0, null);
    }

    public static int zzf(byte[] bArr) {
        zzet zzl = zzl(bArr);
        zzl.zzh(42);
        return zzl.zzj(true != zzl.zzi() ? 8 : 12) + 1;
    }

    public static zzagf zzg(byte[] bArr, AtomicInteger atomicInteger) throws zzat {
        long j;
        int i;
        int i2;
        int i3;
        zzet zzl = zzl(bArr);
        int zzj2 = zzl.zzj(32);
        int zzk = zzk(zzl, zzf, true);
        int i4 = zzk + 1;
        char c = zzj2 == 1078008818 ? (char) 1 : (char) 0;
        if (c == 0) {
            j = -9223372036854775807L;
            i = -2147483647;
        } else {
            if (!zzl.zzi()) {
                throw zzat.zzc("Only supports full channel mask-based audio presentation");
            }
            int i5 = zzk - 1;
            if (((bArr[zzk] & 255) | ((char) (bArr[i5] << 8))) != zzfm.zzM(bArr, 0, i5, 65535)) {
                throw zzat.zzb("CRC check failed", null);
            }
            int zzj3 = zzl.zzj(2);
            if (zzj3 == 0) {
                i2 = 512;
            } else if (zzj3 == 1) {
                i2 = 480;
            } else {
                if (zzj3 != 2) {
                    StringBuilder sb = new StringBuilder(String.valueOf(zzj3).length() + 51);
                    sb.append("Unsupported base duration index in DTS UHD header: ");
                    sb.append(zzj3);
                    throw zzat.zzb(sb.toString(), null);
                }
                i2 = 384;
            }
            int zzj4 = zzl.zzj(3) + 1;
            int zzj5 = zzl.zzj(2);
            if (zzj5 == 0) {
                i3 = 32000;
            } else if (zzj5 == 1) {
                i3 = 44100;
            } else {
                if (zzj5 != 2) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(zzj5).length() + 48);
                    sb2.append("Unsupported clock rate index in DTS UHD header: ");
                    sb2.append(zzj5);
                    throw zzat.zzb(sb2.toString(), null);
                }
                i3 = 48000;
            }
            if (zzl.zzi()) {
                zzl.zzh(36);
            }
            i = (1 << zzl.zzj(2)) * i3;
            j = zzfm.zzw(i2 * zzj4, 1000000L, i3, RoundingMode.DOWN);
        }
        int i6 = i;
        long j2 = j;
        int i7 = 0;
        for (char c2 = 0; c2 < c; c2 = 1) {
            i7 += zzk(zzl, zzg, true);
        }
        for (int i8 = 0; i8 <= 0; i8++) {
            if (c != 0) {
                atomicInteger.set(zzk(zzl, zzh, true));
            }
            i7 += atomicInteger.get() != 0 ? zzk(zzl, zzi, true) : 0;
        }
        return new zzagf("audio/vnd.dts.uhd;profile=p2", 2, i6, i4 + i7, j2, 0, null);
    }

    public static int zzh(byte[] bArr) {
        zzet zzl = zzl(bArr);
        zzl.zzh(32);
        return zzk(zzl, zzj, true) + 1;
    }

    public static zzv zzi(zzagi zzagiVar, int i, zzv zzvVar) throws IOException {
        zzeu zzeuVar = new zzeu(i);
        if (zzagiVar.zzh(zzeuVar.zzi(), 0, i, true)) {
            zzagiVar.zzl();
            int zzr = zzeuVar.zzr();
            if (zzb(zzr) == 1) {
                if (zzeuVar.zzd() >= 10) {
                    byte[] bArr = new byte[10];
                    zzeuVar.zzm(bArr, 0, 10);
                    int zzd2 = zzd(bArr);
                    if (zzeuVar.zze() >= zzd2 + 4) {
                        zzeuVar.zzh(zzd2);
                        zzr = zzeuVar.zzr();
                    }
                }
            }
            if (zzb(zzr) == 2 && zzeuVar.zzd() >= 7) {
                int zzg2 = zzeuVar.zzg();
                byte[] bArr2 = new byte[7];
                zzeuVar.zzm(bArr2, 0, 7);
                zzeuVar.zzh(zzg2);
                int zzf2 = zzf(bArr2);
                if (zzf2 > 0 && zzeuVar.zzd() >= zzf2) {
                    byte[] bArr3 = new byte[zzf2];
                    zzeuVar.zzm(bArr3, 0, zzf2);
                    String str = zze(bArr3).zza;
                    String str2 = zzvVar.zzp;
                    if (str == null) {
                        str = "audio/vnd.dts.hd";
                    }
                    if (!Objects.equals(str2, str)) {
                        zzt zza2 = zzvVar.zza();
                        zza2.zzo(str);
                        return zza2.zzQ();
                    }
                }
            }
        }
        return zzvVar;
    }

    private static int zzj(int i) {
        int i2 = i & 1;
        if ((i & 2) != 0) {
            i2 += 2;
        }
        if ((i & 4) != 0) {
            i2 += 2;
        }
        if ((i & 8) != 0) {
            i2++;
        }
        if ((i & 16) != 0) {
            i2++;
        }
        if ((i & 32) != 0) {
            i2 += 2;
        }
        if ((i & 64) != 0) {
            i2 += 2;
        }
        if ((i & 128) != 0) {
            i2++;
        }
        if ((i & 256) != 0) {
            i2++;
        }
        if ((i & 512) != 0) {
            i2 += 2;
        }
        if ((i & 1024) != 0) {
            i2 += 2;
        }
        if ((i & 2048) != 0) {
            i2 += 2;
        }
        if ((i & 4096) != 0) {
            i2++;
        }
        if ((i & 8192) != 0) {
            i2 += 2;
        }
        if ((i & 16384) != 0) {
            i2++;
        }
        return (i & 32768) != 0 ? i2 + 2 : i2;
    }

    private static int zzk(zzet zzetVar, int[] iArr, boolean z) {
        int i = 0;
        for (int i2 = 0; i2 < 3 && zzetVar.zzi(); i2++) {
            i++;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            i3 += 1 << iArr[i4];
        }
        return i3 + zzetVar.zzj(iArr[i]);
    }

    private static zzet zzl(byte[] bArr) {
        byte b = bArr[0];
        if (b == Byte.MAX_VALUE || b == 100 || b == 64 || b == 113) {
            return new zzet(bArr, bArr.length);
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
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
        zzet zzetVar = new zzet(copyOf, length);
        if (copyOf[0] == 31) {
            zzet zzetVar2 = new zzet(copyOf, length);
            while (zzetVar2.zzc() >= 16) {
                zzetVar2.zzh(2);
                zzetVar.zzp(zzetVar2.zzj(14), 14);
            }
        }
        zzetVar.zzb(copyOf, copyOf.length);
        return zzetVar;
    }
}
