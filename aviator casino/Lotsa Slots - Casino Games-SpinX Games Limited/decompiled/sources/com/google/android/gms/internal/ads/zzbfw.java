package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
@javax.annotation.ParametersAreNonnullByDefault
/* loaded from: classes4.dex */
public final class zzbfw {
    public static int zza(java.lang.String str) {
        byte[] bytes = str.getBytes(java.nio.charset.StandardCharsets.UTF_8);
        return com.google.android.gms.common.util.MurmurHash3.murmurhash3_x86_32(bytes, 0, bytes.length, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ee, code lost:
    
        if (true != r4) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0101, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0100, code lost:
    
        r5 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00fe, code lost:
    
        if (true != r4) goto L69;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.String[] zzb(java.lang.String str, boolean z) {
        if (str == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        char[] charArray = str.toCharArray();
        int i = 0;
        boolean z2 = false;
        int i2 = 0;
        while (i < str.length()) {
            int codePointAt = java.lang.Character.codePointAt(charArray, i);
            int charCount = java.lang.Character.charCount(codePointAt);
            if (java.lang.Character.isLetter(codePointAt)) {
                java.lang.Character.UnicodeBlock of = java.lang.Character.UnicodeBlock.of(codePointAt);
                if (of.equals(java.lang.Character.UnicodeBlock.BOPOMOFO) || of.equals(java.lang.Character.UnicodeBlock.BOPOMOFO_EXTENDED) || of.equals(java.lang.Character.UnicodeBlock.CJK_COMPATIBILITY) || of.equals(java.lang.Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS) || of.equals(java.lang.Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT) || of.equals(java.lang.Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS) || of.equals(java.lang.Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A) || of.equals(java.lang.Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B) || of.equals(java.lang.Character.UnicodeBlock.ENCLOSED_CJK_LETTERS_AND_MONTHS) || of.equals(java.lang.Character.UnicodeBlock.HANGUL_JAMO) || of.equals(java.lang.Character.UnicodeBlock.HANGUL_SYLLABLES) || of.equals(java.lang.Character.UnicodeBlock.HIRAGANA) || of.equals(java.lang.Character.UnicodeBlock.KATAKANA) || of.equals(java.lang.Character.UnicodeBlock.KATAKANA_PHONETIC_EXTENSIONS) || ((codePointAt >= 65382 && codePointAt <= 65437) || (codePointAt >= 65441 && codePointAt <= 65500))) {
                    if (z2) {
                        arrayList.add(new java.lang.String(charArray, i2, i - i2));
                    }
                    arrayList.add(new java.lang.String(charArray, i, charCount));
                    z2 = false;
                    i += charCount;
                }
            }
            if (!java.lang.Character.isLetterOrDigit(codePointAt) && java.lang.Character.getType(codePointAt) != 6 && java.lang.Character.getType(codePointAt) != 8) {
                if (!z || java.lang.Character.charCount(codePointAt) != 1 || java.lang.Character.toChars(codePointAt)[0] != '\'') {
                    if (z2) {
                        arrayList.add(new java.lang.String(charArray, i2, i - i2));
                    }
                    z2 = false;
                }
            }
            i += charCount;
        }
        if (z2) {
            arrayList.add(new java.lang.String(charArray, i2, i - i2));
        }
        return (java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]);
    }
}
