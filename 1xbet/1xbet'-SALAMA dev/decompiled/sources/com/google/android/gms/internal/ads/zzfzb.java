package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class zzfzb {
    public static long zza(double d7) {
        zzfth.zzf(zzb(d7), "not a normal value");
        int exponent = Math.getExponent(d7);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d7) & 4503599627370495L;
        return exponent == -1023 ? jDoubleToRawLongBits + jDoubleToRawLongBits : jDoubleToRawLongBits | 4503599627370496L;
    }

    public static boolean zzb(double d7) {
        return Math.getExponent(d7) <= 1023;
    }
}
