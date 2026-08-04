package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class zzazc {
    public static int zza(String str) {
        byte[] bytes;
        int length;
        int i7;
        int i8;
        int i9;
        try {
            bytes = str.getBytes("UTF-8");
            while (true) {
                i9 = length & (-4);
                if (i7 >= i9) {
                    break;
                }
                int i10 = ((bytes[i7] & 255) | ((bytes[i7 + 1] & 255) << 8) | ((bytes[i7 + 2] & 255) << 16) | (bytes[i7 + 3] << 24)) * (-862048943);
                int i11 = i8 ^ (((i10 >>> 17) | (i10 << 15)) * 461845907);
                i8 = (((i11 >>> 19) | (i11 << 13)) * 5) - 430675100;
                i7 += 4;
            }
        } catch (UnsupportedEncodingException unused) {
            bytes = str.getBytes();
        }
        length = bytes.length;
        int i12 = 0;
        i7 = 0;
        i8 = 0;
        int i13 = length & 3;
        if (i13 == 1) {
            int i14 = ((bytes[i9] & 255) | i12) * (-862048943);
            i8 ^= ((i14 >>> 17) | (i14 << 15)) * 461845907;
        } else {
            if (i13 != 2) {
                i12 = i13 == 3 ? (bytes[i9 + 2] & 255) << 16 : 0;
            }
            i12 |= (bytes[i9 + 1] & 255) << 8;
            int i15 = ((bytes[i9] & 255) | i12) * (-862048943);
            i8 ^= ((i15 >>> 17) | (i15 << 15)) * 461845907;
        }
        int i16 = i8 ^ length;
        int i17 = (i16 ^ (i16 >>> 16)) * (-2048144789);
        int i18 = (i17 ^ (i17 >>> 13)) * (-1028477387);
        return i18 ^ (i18 >>> 16);
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:69:0x0100 A[DONT_INVERT] */
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
            int iCodePointAt = Character.codePointAt(charArray, i7);
            int iCharCount = Character.charCount(iCodePointAt);
            if (Character.isLetter(iCodePointAt)) {
                Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(iCodePointAt);
                if (unicodeBlockOf.equals(Character.UnicodeBlock.BOPOMOFO) || unicodeBlockOf.equals(Character.UnicodeBlock.BOPOMOFO_EXTENDED) || unicodeBlockOf.equals(Character.UnicodeBlock.CJK_COMPATIBILITY) || unicodeBlockOf.equals(Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS) || unicodeBlockOf.equals(Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT) || unicodeBlockOf.equals(Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS) || unicodeBlockOf.equals(Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A) || unicodeBlockOf.equals(Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B) || unicodeBlockOf.equals(Character.UnicodeBlock.ENCLOSED_CJK_LETTERS_AND_MONTHS) || unicodeBlockOf.equals(Character.UnicodeBlock.HANGUL_JAMO) || unicodeBlockOf.equals(Character.UnicodeBlock.HANGUL_SYLLABLES) || unicodeBlockOf.equals(Character.UnicodeBlock.HIRAGANA) || unicodeBlockOf.equals(Character.UnicodeBlock.KATAKANA) || unicodeBlockOf.equals(Character.UnicodeBlock.KATAKANA_PHONETIC_EXTENSIONS) || ((iCodePointAt >= 65382 && iCodePointAt <= 65437) || (iCodePointAt >= 65441 && iCodePointAt <= 65500))) {
                    if (z7) {
                        arrayList.add(new String(charArray, i8, i7 - i8));
                    }
                    arrayList.add(new String(charArray, i7, iCharCount));
                } else {
                    if (!Character.isLetterOrDigit(iCodePointAt) || Character.getType(iCodePointAt) == 6 || Character.getType(iCodePointAt) == 8) {
                        if (true != z7) {
                            i8 = i7;
                        }
                    } else if (z4 && Character.charCount(iCodePointAt) == 1 && Character.toChars(iCodePointAt)[0] == '\'') {
                        if (true != z7) {
                            i8 = i7;
                        }
                    } else if (z7) {
                        arrayList.add(new String(charArray, i8, i7 - i8));
                    }
                    z7 = true;
                }
                z7 = false;
            } else {
                if (Character.isLetterOrDigit(iCodePointAt)) {
                    if (true != z7) {
                        i8 = i7;
                    }
                } else if (true != z7) {
                    i8 = i7;
                }
                z7 = true;
            }
            i7 += iCharCount;
        }
        if (z7) {
            arrayList.add(new String(charArray, i8, i7 - i8));
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }
}
