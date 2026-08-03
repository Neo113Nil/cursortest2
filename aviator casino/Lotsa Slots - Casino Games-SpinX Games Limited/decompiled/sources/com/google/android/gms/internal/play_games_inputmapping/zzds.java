package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
public final class zzds {
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

    public static java.lang.String zzc(java.lang.String str) {
        if (str.isEmpty()) {
            throw new java.lang.IllegalArgumentException("identifier must not be empty");
        }
        if (!zzd(str.charAt(0))) {
            throw new java.lang.IllegalArgumentException(str.length() != 0 ? "identifier must start with an ASCII letter: ".concat(str) : new java.lang.String("identifier must start with an ASCII letter: "));
        }
        for (int i = 1; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (!zzd(charAt) && ((charAt < '0' || charAt > '9') && charAt != '_')) {
                throw new java.lang.IllegalArgumentException(str.length() != 0 ? "identifier must contain only ASCII letters, digits or underscore: ".concat(str) : new java.lang.String("identifier must contain only ASCII letters, digits or underscore: "));
            }
        }
        return str;
    }

    private static boolean zzd(char c) {
        if (c < 'a' || c > 'z') {
            return c >= 'A' && c <= 'Z';
        }
        return true;
    }
}
