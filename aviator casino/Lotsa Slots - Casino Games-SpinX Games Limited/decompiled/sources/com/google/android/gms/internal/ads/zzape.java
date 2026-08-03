package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzape {
    public static long zza(java.lang.String str) {
        java.lang.String str2 = com.google.android.gms.internal.ads.zzfl.zza;
        java.lang.String[] split = str.split("\\.", 2);
        long j = 0;
        for (java.lang.String str3 : split[0].split(":", -1)) {
            j = (j * 60) + java.lang.Long.parseLong(str3);
        }
        long j2 = j * 1000;
        if (split.length == 2) {
            java.lang.String trim = split[1].trim();
            if (trim.length() != 3) {
                java.lang.String.valueOf(trim);
                throw new java.lang.IllegalArgumentException("Expected 3 decimal places, got: ".concat(java.lang.String.valueOf(trim)));
            }
            j2 += java.lang.Long.parseLong(trim);
        }
        return j2 * 1000;
    }

    public static float zzb(java.lang.String str) throws java.lang.NumberFormatException {
        if (str.endsWith("%")) {
            return java.lang.Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new java.lang.NumberFormatException("Percentages must end with %");
    }
}
