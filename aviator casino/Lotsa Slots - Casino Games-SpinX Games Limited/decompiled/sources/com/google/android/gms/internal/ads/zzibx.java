package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzibx {
    public static java.math.BigDecimal zza(java.lang.String str) throws java.lang.NumberFormatException {
        zzc(str);
        java.math.BigDecimal bigDecimal = new java.math.BigDecimal(str);
        if (java.lang.Math.abs(bigDecimal.scale()) < 10000) {
            return bigDecimal;
        }
        java.lang.String.valueOf(str);
        throw new java.lang.NumberFormatException("Number has unsupported scale: ".concat(java.lang.String.valueOf(str)));
    }

    public static java.math.BigInteger zzb(java.lang.String str) throws java.lang.NumberFormatException {
        zzc(str);
        return new java.math.BigInteger(str);
    }

    private static void zzc(java.lang.String str) {
        if (str.length() <= 10000) {
            return;
        }
        java.lang.String substring = str.substring(0, 30);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(substring).length() + 28);
        sb.append("Number string too large: ");
        sb.append(substring);
        sb.append("...");
        throw new java.lang.NumberFormatException(sb.toString());
    }
}
