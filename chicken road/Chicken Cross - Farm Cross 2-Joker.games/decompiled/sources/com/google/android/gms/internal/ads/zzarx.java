package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzarx {
    public static int zza(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] != 71) {
            i++;
        }
        return i;
    }

    public static long zzb(zzeu zzeuVar, int i, int i2) {
        zzeuVar.zzh(i);
        if (zzeuVar.zzd() < 5) {
            return -9223372036854775807L;
        }
        int zzB = zzeuVar.zzB();
        if ((8388608 & zzB) != 0 || ((zzB >> 8) & 8191) != i2 || (zzB & 32) == 0 || zzeuVar.zzs() < 7 || zzeuVar.zzd() < 7 || (zzeuVar.zzs() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        zzeuVar.zzm(bArr, 0, 6);
        long j = bArr[0];
        long j2 = bArr[1];
        long j3 = bArr[2];
        long j4 = bArr[3] & 255;
        return ((j & 255) << 25) | ((j2 & 255) << 17) | ((j3 & 255) << 9) | (j4 + j4) | ((bArr[4] & 255) >> 7);
    }
}
