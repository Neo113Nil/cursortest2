package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzarj {
    public static int zza(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] != 71) {
            i++;
        }
        return i;
    }

    public static long zzb(com.google.android.gms.internal.ads.zzet zzetVar, int i, int i2) {
        zzetVar.zzh(i);
        if (zzetVar.zzd() < 5) {
            return -9223372036854775807L;
        }
        int zzB = zzetVar.zzB();
        if ((8388608 & zzB) != 0 || ((zzB >> 8) & 8191) != i2 || (zzB & 32) == 0 || zzetVar.zzs() < 7 || zzetVar.zzd() < 7 || (zzetVar.zzs() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        zzetVar.zzm(bArr, 0, 6);
        long j = bArr[0];
        long j2 = bArr[1];
        long j3 = bArr[2];
        long j4 = bArr[3] & 255;
        return ((j & 255) << 25) | ((j2 & 255) << 17) | ((j3 & 255) << 9) | (j4 + j4) | ((bArr[4] & 255) >> 7);
    }
}
