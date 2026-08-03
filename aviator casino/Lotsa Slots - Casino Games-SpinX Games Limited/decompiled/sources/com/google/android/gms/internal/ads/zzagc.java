package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzagc {
    @org.checkerframework.dataflow.qual.Pure
    public static void zza(boolean z, java.lang.String str) throws com.google.android.gms.internal.ads.zzat {
        if (!z) {
            throw com.google.android.gms.internal.ads.zzat.zzb(str, null);
        }
    }

    public static int zzb(com.google.android.gms.internal.ads.zzafz zzafzVar, byte[] bArr, int i, int i2) throws java.io.IOException {
        int i3 = 0;
        while (i3 < i2) {
            int zzg = zzafzVar.zzg(bArr, i + i3, i2 - i3);
            if (zzg == -1) {
                break;
            }
            i3 += zzg;
        }
        return i3;
    }

    public static boolean zzc(com.google.android.gms.internal.ads.zzafz zzafzVar, byte[] bArr, int i, int i2) throws java.io.IOException {
        try {
            zzafzVar.zzc(bArr, i, i2);
            return true;
        } catch (java.io.EOFException unused) {
            return false;
        }
    }

    public static boolean zzd(com.google.android.gms.internal.ads.zzafz zzafzVar, int i) throws java.io.IOException {
        try {
            zzafzVar.zzf(i);
            return true;
        } catch (java.io.EOFException unused) {
            return false;
        }
    }

    public static boolean zze(com.google.android.gms.internal.ads.zzafz zzafzVar, byte[] bArr, int i, int i2, boolean z) throws java.io.IOException {
        try {
            return zzafzVar.zzh(bArr, 0, i2, z);
        } catch (java.io.EOFException e) {
            if (z) {
                return false;
            }
            throw e;
        }
    }

    public static int zzf(int i) {
        if (i == 20) {
            return androidx.media3.extractor.OpusUtil.MAX_BYTES_PER_SECOND;
        }
        if (i == 30) {
            return 2250000;
        }
        switch (i) {
            case 5:
                return 80000;
            case 6:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            default:
                switch (i) {
                    case 14:
                        return 3062500;
                    case 15:
                        return 8000;
                    case 16:
                        return 256000;
                    case 17:
                        return 336000;
                    case 18:
                        return 768000;
                    default:
                        return -2147483647;
                }
        }
    }
}
