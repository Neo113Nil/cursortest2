package com.google.android.gms.internal.ads;

import W5.AbstractC0486a1;

/* loaded from: classes.dex */
public final class zzado {
    private static final String[] zza = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    private static final int[] zzb = {44100, 48000, 32000};
    private static final int[] zzc = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
    private static final int[] zzd = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};
    private static final int[] zze = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    private static final int[] zzf = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
    private static final int[] zzg = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static int zzb(int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        if (!zzm(i7) || (i8 = (i7 >>> 19) & 3) == 1 || (i9 = (i7 >>> 17) & 3) == 0 || (i10 = (i7 >>> 12) & 15) == 0 || i10 == 15 || (i11 = (i7 >>> 10) & 3) == 3) {
            return -1;
        }
        int i12 = i10 - 1;
        int i13 = zzb[i11];
        if (i8 == 2) {
            i13 /= 2;
        } else if (i8 == 0) {
            i13 /= 4;
        }
        int i14 = (i7 >>> 9) & 1;
        if (i9 == 3) {
            return ((((i8 == 3 ? zzc[i12] : zzd[i12]) * 12) / i13) + i14) * 4;
        }
        int i15 = i8 == 3 ? i9 == 2 ? zze[i12] : zzf[i12] : zzg[i12];
        if (i8 == 3) {
            return AbstractC0486a1.q(i15, 144, i13, i14);
        }
        return AbstractC0486a1.q(i9 == 1 ? 72 : 144, i15, i13, i14);
    }

    public static int zzc(int i7) {
        int i8;
        int i9;
        if (!zzm(i7) || (i8 = (i7 >>> 19) & 3) == 1 || (i9 = (i7 >>> 17) & 3) == 0) {
            return -1;
        }
        int i10 = i7 >>> 12;
        int i11 = (i7 >>> 10) & 3;
        int i12 = i10 & 15;
        if (i12 == 0 || i12 == 15 || i11 == 3) {
            return -1;
        }
        return zzl(i8, i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzl(int i7, int i8) {
        return i8 != 1 ? i8 != 2 ? 384 : 1152 : i7 == 3 ? 1152 : 576;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzm(int i7) {
        return (i7 & (-2097152)) == -2097152;
    }
}
