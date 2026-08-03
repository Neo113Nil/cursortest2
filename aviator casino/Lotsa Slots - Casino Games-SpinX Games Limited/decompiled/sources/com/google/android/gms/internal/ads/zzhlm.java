package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhlm {
    public static boolean zza(java.lang.String str) {
        int length = str.length();
        int i = 0;
        while (i != length) {
            char charAt = str.charAt(i);
            int i2 = i + 1;
            if (!java.lang.Character.isSurrogate(charAt)) {
                i = i2;
            } else {
                if (java.lang.Character.isLowSurrogate(charAt) || i2 == length || !java.lang.Character.isLowSurrogate(str.charAt(i2))) {
                    return false;
                }
                i += 2;
            }
        }
        return true;
    }

    public static com.google.android.gms.internal.ads.zzibg zzb(java.lang.String str) throws java.io.IOException {
        try {
            com.google.android.gms.internal.ads.zzicd zzicdVar = new com.google.android.gms.internal.ads.zzicd(new java.io.StringReader(str));
            zzicdVar.zza(com.google.android.gms.internal.ads.zzibl.LEGACY_STRICT);
            return com.google.android.gms.internal.ads.zzhlk.zza(zzicdVar);
        } catch (java.lang.NumberFormatException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long zzc(java.lang.Number number) {
        if (number instanceof com.google.android.gms.internal.ads.zzhll) {
            return java.lang.Long.parseLong(number.toString());
        }
        throw new java.lang.IllegalArgumentException("does not contain a parsed number.");
    }
}
