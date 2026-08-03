package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgzx {
    static long zza(double d) {
        com.google.android.gms.internal.ads.zzgtj.zzb(zzb(d), "not a normal value");
        int exponent = java.lang.Math.getExponent(d);
        long doubleToRawLongBits = java.lang.Double.doubleToRawLongBits(d) & 4503599627370495L;
        return exponent == -1023 ? doubleToRawLongBits + doubleToRawLongBits : doubleToRawLongBits | 4503599627370496L;
    }

    static boolean zzb(double d) {
        return java.lang.Math.getExponent(d) <= 1023;
    }
}
