package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhab {
    public static long zzb(long j, long j2) {
        com.google.android.gms.internal.ads.zzhac.zza("a", j);
        com.google.android.gms.internal.ads.zzhac.zza("b", j2);
        if (j == 0) {
            return j2;
        }
        if (j2 == 0) {
            return j;
        }
        int numberOfTrailingZeros = java.lang.Long.numberOfTrailingZeros(j);
        long j3 = j >> numberOfTrailingZeros;
        int numberOfTrailingZeros2 = java.lang.Long.numberOfTrailingZeros(j2);
        long j4 = j2 >> numberOfTrailingZeros2;
        while (j3 != j4) {
            long j5 = j3 - j4;
            long j6 = (j5 >> 63) & j5;
            long j7 = (j5 - j6) - j6;
            j3 = j7 >> java.lang.Long.numberOfTrailingZeros(j7);
            j4 += j6;
        }
        return j3 << java.lang.Math.min(numberOfTrailingZeros, numberOfTrailingZeros2);
    }

    public static long zzc(long j, long j2) {
        int numberOfLeadingZeros = java.lang.Long.numberOfLeadingZeros(j) + java.lang.Long.numberOfLeadingZeros(~j) + java.lang.Long.numberOfLeadingZeros(j2) + java.lang.Long.numberOfLeadingZeros(~j2);
        if (numberOfLeadingZeros > 65) {
            return j * j2;
        }
        long j3 = ((j ^ j2) >>> 63) + Long.MAX_VALUE;
        if ((numberOfLeadingZeros < 64) || ((j2 == Long.MIN_VALUE) & (j < 0))) {
            return j3;
        }
        long j4 = j * j2;
        return (j == 0 || j4 / j == j2) ? j4 : j3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
    
        if (r8 > 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
    
        if (r8 < 0) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long zza(long j, long j2, java.math.RoundingMode roundingMode) {
        roundingMode.getClass();
        long j3 = j / j2;
        long j4 = j - (j2 * j3);
        if (j4 != 0) {
            int i = ((int) ((j ^ j2) >> 63)) | 1;
            switch (com.google.android.gms.internal.ads.zzhaa.zza[roundingMode.ordinal()]) {
                case 1:
                    com.google.android.gms.internal.ads.zzhac.zzb(false);
                case 2:
                case 3:
                    break;
                case 4:
                    return j3 + i;
                case 5:
                    break;
                case 6:
                case 7:
                case 8:
                    long abs = java.lang.Math.abs(j4);
                    long abs2 = abs - (java.lang.Math.abs(j2) - abs);
                    return abs2 != 0 ? j3 : j3;
                default:
                    throw new java.lang.AssertionError();
            }
        }
    }
}
