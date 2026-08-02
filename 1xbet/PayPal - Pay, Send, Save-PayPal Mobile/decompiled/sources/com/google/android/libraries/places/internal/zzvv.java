package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzvv {
    public static java.lang.String zza(java.lang.String str, java.lang.String str2, boolean z) {
        if (str2.length() > 23) {
            int i = -1;
            for (int length = str2.length() - 1; length >= 0; length--) {
                char charAt = str2.charAt(length);
                if (charAt == '.' || charAt == '$') {
                    i = length;
                    break;
                }
            }
            str2 = str2.substring(i + 1);
        }
        java.lang.String concat = "".concat(java.lang.String.valueOf(str2));
        return concat.substring(0, java.lang.Math.min(concat.length(), 23));
    }

    public static int zzb(java.util.logging.Level level) {
        int intValue = level.intValue();
        if (intValue >= java.util.logging.Level.SEVERE.intValue()) {
            return 6;
        }
        if (intValue >= java.util.logging.Level.WARNING.intValue()) {
            return 5;
        }
        if (intValue >= java.util.logging.Level.INFO.intValue()) {
            return 4;
        }
        return intValue >= java.util.logging.Level.FINE.intValue() ? 3 : 2;
    }
}
