package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzano {
    public static int zza(byte[] bArr, int i7, int i8) {
        while (i7 < i8 && bArr[i7] != 71) {
            i7++;
        }
        return i7;
    }

    public static long zzb(zzed zzedVar, int i7, int i8) {
        zzedVar.zzL(i7);
        if (zzedVar.zzb() < 5) {
            return -9223372036854775807L;
        }
        int iZzg = zzedVar.zzg();
        if ((8388608 & iZzg) != 0 || ((iZzg >> 8) & 8191) != i8 || (iZzg & 32) == 0 || zzedVar.zzm() < 7 || zzedVar.zzb() < 7 || (zzedVar.zzm() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        zzedVar.zzH(bArr, 0, 6);
        long j = bArr[0];
        long j3 = bArr[1];
        long j7 = bArr[2];
        long j8 = bArr[3] & 255;
        return ((j & 255) << 25) | ((j3 & 255) << 17) | ((j7 & 255) << 9) | (j8 + j8) | ((((long) bArr[4]) & 255) >> 7);
    }
}
