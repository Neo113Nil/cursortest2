package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.lang.Character;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class zzazc {
    public static int zza(String str) {
        byte[] bytes;
        int i7;
        try {
            bytes = str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            bytes = str.getBytes();
        }
        int length = bytes.length;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            i7 = length & (-4);
            if (i8 >= i7) {
                break;
            }
            int i10 = ((bytes[i8] & 255) | ((bytes[i8 + 1] & 255) << 8) | ((bytes[i8 + 2] & 255) << 16) | (bytes[i8 + 3] << 24)) * (-862048943);
            int i11 = i9 ^ (((i10 >>> 17) | (i10 << 15)) * 461845907);
            i9 = (((i11 >>> 19) | (i11 << 13)) * 5) - 430675100;
            i8 += 4;
        }
        int i12 = length & 3;
        if (i12 != 1) {
            if (i12 != 2) {
                r1 = i12 == 3 ? (bytes[i7 + 2] & 255) << 16 : 0;
                int i13 = i9 ^ length;
                int i14 = (i13 ^ (i13 >>> 16)) * (-2048144789);
                int i15 = (i14 ^ (i14 >>> 13)) * (-1028477387);
                return i15 ^ (i15 >>> 16);
            }
            r1 |= (bytes[i7 + 1] & 255) << 8;
        }
        int i16 = ((bytes[i7] & 255) | r1) * (-862048943);
        i9 ^= ((i16 >>> 17) | (i16 << 15)) * 461845907;
        int i132 = i9 ^ length;
        int i142 = (i132 ^ (i132 >>> 16)) * (-2048144789);
        int i152 = (i142 ^ (i142 >>> 13)) * (-1028477387);
        return i152 ^ (i152 >>> 16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ee, code lost:
    
        if (true != r4) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00f0, code lost:
    
        r5 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00f1, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0100, code lost:
    
        if (true != r4) goto L65;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String[] zzb(String str, boolean z4) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        char[] charArray = str.toCharArray();
        int i7 = 0;
        boolean z7 = false;
        int i8 = 0;
        while (i7 < str.length()) {
            int codePointAt = Character.codePointAt(charArray, i7);
            int charCount = Character.charCount(codePointAt);
            if (Character.isLetter(codePointAt)) {
                Character.UnicodeBlock of = Character.UnicodeBlock.of(codePointAt);
                if (of.equals(Character.UnicodeBlock.BOPOMOFO) || of.equals(Character.UnicodeBlock.BOPOMOFO_EXTENDED) || of.equals(Character.UnicodeBlock.CJK_COMPATIBILITY) || of.equals(Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS) || of.equals(Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT) || of.equals(Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS) || of.equals(Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A) || of.equals(Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B) || of.equals(Character.UnicodeBlock.ENCLOSED_CJK_LETTERS_AND_MONTHS) || of.equals(Character.UnicodeBlock.HANGUL_JAMO) || of.equals(Character.UnicodeBlock.HANGUL_SYLLABLES) || of.equals(Character.UnicodeBlock.HIRAGANA) || of.equals(Character.UnicodeBlock.KATAKANA) || of.equals(Character.UnicodeBlock.KATAKANA_PHONETIC_EXTENSIONS) || ((codePointAt >= 65382 && codePointAt <= 65437) || (codePointAt >= 65441 && codePointAt <= 65500))) {
                    if (z7) {
                        arrayList.add(new String(charArray, i8, i7 - i8));
                    }
                    arrayList.add(new String(charArray, i7, charCount));
                    z7 = false;
                    i7 += charCount;
                }
            }
            if (!Character.isLetterOrDigit(codePointAt) && Character.getType(codePointAt) != 6 && Character.getType(codePointAt) != 8) {
                if (!z4 || Character.charCount(codePointAt) != 1 || Character.toChars(codePointAt)[0] != '\'') {
                    if (z7) {
                        arrayList.add(new String(charArray, i8, i7 - i8));
                    }
                    z7 = false;
                }
            }
            i7 += charCount;
        }
        if (z7) {
            arrayList.add(new String(charArray, i8, i7 - i8));
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }
}
