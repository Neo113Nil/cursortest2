package com.google.android.recaptcha.internal;

import java.math.RoundingMode;

/* loaded from: classes.dex */
public final class zzib {
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
    
        if (((r0 & 1) & (r7 != java.math.RoundingMode.HALF_EVEN ? 0 : 1)) != 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
    
        if (r1 > 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
    
        if (r5 > 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
        if (r5 < 0) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int zza(int i7, int i8, RoundingMode roundingMode) {
        roundingMode.getClass();
        if (i8 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i9 = i7 / i8;
        int i10 = i7 - (i8 * i9);
        if (i10 != 0) {
            int i11 = ((i7 ^ i8) >> 31) | 1;
            switch (zzia.zza[roundingMode.ordinal()]) {
                case 1:
                    zzid.zzb(false);
                case 2:
                    return i9;
                case 3:
                    break;
                case 4:
                    return i9 + i11;
                case 5:
                    break;
                case 6:
                case 7:
                case 8:
                    int abs = Math.abs(i10);
                    int abs2 = abs - (Math.abs(i8) - abs);
                    if (abs2 == 0) {
                        if (roundingMode != RoundingMode.HALF_UP) {
                            break;
                        }
                        return i9 + i11;
                    }
                    break;
                default:
                    throw new AssertionError();
            }
        }
        return i9;
    }

    public static int zzb(int i7, RoundingMode roundingMode) {
        if (i7 <= 0) {
            throw new IllegalArgumentException("x (0) must be > 0");
        }
        switch (zzia.zza[roundingMode.ordinal()]) {
            case 1:
                zzid.zzb(((i7 + (-1)) & i7) == 0);
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(i7 - 1);
            case 6:
            case 7:
            case 8:
                int numberOfLeadingZeros = Integer.numberOfLeadingZeros(i7);
                return (31 - numberOfLeadingZeros) + ((((-1257966797) >>> numberOfLeadingZeros) - i7) >>> 31);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i7);
    }
}
