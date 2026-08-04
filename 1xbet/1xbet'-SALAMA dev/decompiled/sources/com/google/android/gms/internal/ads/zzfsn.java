package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzfsn {
    public static String zza(String str) {
        int length = str.length();
        int i7 = 0;
        while (i7 < length) {
            if (zze(str.charAt(i7))) {
                char[] charArray = str.toCharArray();
                while (i7 < length) {
                    char c3 = charArray[i7];
                    if (zze(c3)) {
                        charArray[i7] = (char) (c3 ^ ' ');
                    }
                    i7++;
                }
                return String.valueOf(charArray);
            }
            i7++;
        }
        return str;
    }

    public static String zzb(String str) {
        int length = str.length();
        int i7 = 0;
        while (i7 < length) {
            if (zzd(str.charAt(i7))) {
                char[] charArray = str.toCharArray();
                while (i7 < length) {
                    char c3 = charArray[i7];
                    if (zzd(c3)) {
                        charArray[i7] = (char) (c3 ^ ' ');
                    }
                    i7++;
                }
                return String.valueOf(charArray);
            }
            i7++;
        }
        return str;
    }

    public static boolean zzc(CharSequence charSequence, CharSequence charSequence2) {
        int iZzf;
        int length = charSequence.length();
        if (charSequence == charSequence2) {
            return true;
        }
        if (length != charSequence2.length()) {
            return false;
        }
        for (int i7 = 0; i7 < length; i7++) {
            char cCharAt = charSequence.charAt(i7);
            char cCharAt2 = charSequence2.charAt(i7);
            if (cCharAt != cCharAt2 && ((iZzf = zzf(cCharAt)) >= 26 || iZzf != zzf(cCharAt2))) {
                return false;
            }
        }
        return true;
    }

    public static boolean zzd(char c3) {
        return c3 >= 'a' && c3 <= 'z';
    }

    public static boolean zze(char c3) {
        return c3 >= 'A' && c3 <= 'Z';
    }

    private static int zzf(char c3) {
        return (char) ((c3 | ' ') - 97);
    }
}
