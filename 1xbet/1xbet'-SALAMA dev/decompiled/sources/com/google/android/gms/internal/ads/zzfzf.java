package com.google.android.gms.internal.ads;

import W5.AbstractC0486a1;
import java.math.RoundingMode;
import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
public final class zzfzf {
    public static long zza(long j, long j3) {
        long j7 = j + j3;
        if (((j ^ j3) < 0) || ((j ^ j7) >= 0)) {
            return j7;
        }
        throw new ArithmeticException(AbstractC0486a1.i(k.j("overflow: checkedAdd(", ", ", j), j3, ")"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
    
        if (r8 > 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
    
        if (r8 < 0) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long zzb(long j, long j3, RoundingMode roundingMode) {
        roundingMode.getClass();
        long j7 = j / j3;
        long j8 = j - (j3 * j7);
        if (j8 != 0) {
            int i7 = ((int) ((j ^ j3) >> 63)) | 1;
            switch (zzfze.zza[roundingMode.ordinal()]) {
                case 1:
                    zzfzg.zzb(false);
                case 2:
                case 3:
                    break;
                case 4:
                    return j7 + ((long) i7);
                case 5:
                    break;
                case 6:
                case 7:
                case 8:
                    long jAbs = Math.abs(j8);
                    long jAbs2 = jAbs - (Math.abs(j3) - jAbs);
                    return jAbs2 != 0 ? j7 : j7;
                default:
                    throw new AssertionError();
            }
        }
    }

    public static long zzc(long j, long j3) {
        zzfzg.zza("a", j);
        zzfzg.zza("b", j3);
        if (j == 0) {
            return j3;
        }
        if (j3 == 0) {
            return j;
        }
        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j);
        long jNumberOfTrailingZeros = j >> iNumberOfTrailingZeros;
        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(j3);
        long j7 = j3 >> iNumberOfTrailingZeros2;
        while (jNumberOfTrailingZeros != j7) {
            long j8 = jNumberOfTrailingZeros - j7;
            long j9 = (j8 >> 63) & j8;
            long j10 = (j8 - j9) - j9;
            jNumberOfTrailingZeros = j10 >> Long.numberOfTrailingZeros(j10);
            j7 += j9;
        }
        return jNumberOfTrailingZeros << Math.min(iNumberOfTrailingZeros, iNumberOfTrailingZeros2);
    }

    public static long zzd(long j, long j3) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(~j3) + Long.numberOfLeadingZeros(j3) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(j);
        if (iNumberOfLeadingZeros > 65) {
            return j * j3;
        }
        long j7 = ((j ^ j3) >>> 63) + Long.MAX_VALUE;
        if ((iNumberOfLeadingZeros < 64) || ((j3 == Long.MIN_VALUE) & (j < 0))) {
            return j7;
        }
        long j8 = j * j3;
        return (j == 0 || j8 / j == j3) ? j8 : j7;
    }
}
