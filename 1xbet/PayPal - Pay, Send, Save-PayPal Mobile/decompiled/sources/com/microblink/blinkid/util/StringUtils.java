package com.microblink.blinkid.util;

/* loaded from: classes10.dex */
public class StringUtils {
    static {
        java.util.HashSet hashSet = new java.util.HashSet(10);
        for (char c = '0'; c <= '9'; c = (char) (c + 1)) {
            hashSet.add(java.lang.Character.valueOf(c));
        }
        java.util.Collections.unmodifiableSet(hashSet);
        java.util.HashSet hashSet2 = new java.util.HashSet(36);
        for (char c2 = '0'; c2 <= '9'; c2 = (char) (c2 + 1)) {
            hashSet2.add(java.lang.Character.valueOf(c2));
        }
        for (char c3 = 'A'; c3 <= 'Z'; c3 = (char) (c3 + 1)) {
            hashSet2.add(java.lang.Character.valueOf(c3));
        }
        for (char c4 = 'a'; c4 <= 'z'; c4 = (char) (c4 + 1)) {
            hashSet2.add(java.lang.Character.valueOf(c4));
        }
        java.util.Collections.unmodifiableSet(hashSet2);
        java.util.HashSet hashSet3 = new java.util.HashSet(36);
        for (char c5 = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask; c5 <= '9'; c5 = (char) (c5 + 1)) {
            hashSet3.add(java.lang.Character.valueOf(c5));
        }
        for (char c6 = 'A'; c6 <= 'Z'; c6 = (char) (c6 + 1)) {
            hashSet3.add(java.lang.Character.valueOf(c6));
        }
        java.util.Collections.unmodifiableSet(hashSet3);
    }

    public static java.lang.String convertByteArrayToString(byte[] bArr) {
        java.lang.String[] strArr = {"UTF-8", "ISO-8859-1", codec.CharEncoding.UTF_16, "US-ASCII"};
        for (int i = 0; i < 4; i++) {
            try {
                return java.nio.charset.Charset.forName(strArr[i]).newDecoder().decode(java.nio.ByteBuffer.wrap(bArr)).toString();
            } catch (java.nio.charset.CharacterCodingException unused) {
            }
        }
        return new java.lang.String(bArr, java.nio.charset.Charset.forName("US-ASCII"));
    }

    public static int stringDistance(java.lang.String str, java.lang.String str2, int i, int i2, int i3, int i4) {
        int length = str.length();
        int length2 = str2.length();
        if (length == 0 && length2 == 0) {
            return 0;
        }
        if (length == 0 && length2 > 0) {
            return length2;
        }
        if (length > 0 && length2 == 0) {
            return length;
        }
        if (length <= 0 || length2 <= 0) {
            return 0;
        }
        int i5 = length + 1;
        int i6 = length2 + 1;
        int i7 = i6 * i5;
        int[] iArr = new int[i7];
        for (int i8 = 0; i8 < i5; i8++) {
            iArr[i8] = i8;
        }
        for (int i9 = 0; i9 < i6; i9++) {
            iArr[i9 * i5] = i9;
        }
        for (int i10 = 1; i10 < i5; i10++) {
            for (int i11 = 1; i11 < i6; i11++) {
                int i12 = i11 - 1;
                int i13 = str.charAt(i10 + (-1)) == str2.charAt(i12) ? -i : i2;
                int i14 = (i11 * i5) + i10;
                int i15 = (i12 * i5) + i10;
                iArr[i14] = java.lang.Math.min(iArr[i15] + i3, java.lang.Math.min(iArr[i14 - 1] + i4, iArr[i15 - 1] + i13));
            }
        }
        return iArr[i7 - 1];
    }
}
