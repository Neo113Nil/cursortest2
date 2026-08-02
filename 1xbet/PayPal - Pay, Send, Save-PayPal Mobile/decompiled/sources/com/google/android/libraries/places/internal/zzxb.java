package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzxb {
    public static java.lang.Object zza(java.lang.Object obj, java.lang.String str) {
        if (obj != null) {
            return obj;
        }
        throw new java.lang.NullPointerException(str.concat(" must not be null"));
    }

    public static void zzb(boolean z, java.lang.String str) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(str);
        }
    }

    public static void zzc(boolean z, java.lang.String str) {
        if (!z) {
            throw new java.lang.IllegalStateException(str);
        }
    }

    public static java.lang.String zzd(java.lang.String str) {
        if (!zze(str.charAt(0))) {
            throw new java.lang.IllegalArgumentException("identifier must start with an ASCII letter: ".concat(str));
        }
        for (int i = 1; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (!zze(charAt) && ((charAt < '0' || charAt > '9') && charAt != '_')) {
                throw new java.lang.IllegalArgumentException("identifier must contain only ASCII letters, digits or underscore: ".concat(str));
            }
        }
        return str;
    }

    private static boolean zze(char c) {
        if (c < 'a' || c > 'z') {
            return c >= 'A' && c <= 'Z';
        }
        return true;
    }
}
