package com.nimbusds.jose.util;

/* loaded from: classes4.dex */
final class Base64Codec {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    static int tpEq(int i, int i2) {
        int i3 = i ^ i2;
        return ((i3 - 1) & (~i3)) >>> 63;
    }

    static int tpGT(int i, int i2) {
        return (int) ((i2 - i) >>> 63);
    }

    static int tpLT(int i, int i2) {
        return (int) ((i - i2) >>> 63);
    }

    static int tpSelect(int i, int i2, int i3) {
        return ((i - 1) & (i3 ^ i2)) ^ i2;
    }

    Base64Codec() {
    }

    static int computeEncodedLength(int i, boolean z) {
        if (i == 0) {
            return 0;
        }
        if (z) {
            int i2 = (i / 3) << 2;
            int i3 = i % 3;
            return i3 == 0 ? i2 : i2 + i3 + 1;
        }
        return (((i - 1) / 3) + 1) << 2;
    }

    static byte encodeDigitBase64(int i) {
        int tpLT = tpLT(i, 26);
        int tpGT = tpGT(i, 25);
        int tpLT2 = tpLT(i, 52);
        int tpGT2 = tpGT(i, 51);
        int tpLT3 = tpLT(i, 62);
        int tpEq = tpEq(i, 62);
        int tpEq2 = tpEq(i, 63);
        return (byte) (tpSelect(tpGT2 & tpLT3, i - 4, 0) | tpSelect(tpLT, i + 65, 0) | tpSelect(tpGT & tpLT2, i + 71, 0) | tpSelect(tpEq, 43, 0) | tpSelect(tpEq2, 47, 0));
    }

    static byte encodeDigitBase64URL(int i) {
        int tpLT = tpLT(i, 26);
        int tpGT = tpGT(i, 25);
        int tpLT2 = tpLT(i, 52);
        int tpGT2 = tpGT(i, 51);
        int tpLT3 = tpLT(i, 62);
        int tpEq = tpEq(i, 62);
        int tpEq2 = tpEq(i, 63);
        return (byte) (tpSelect(tpGT2 & tpLT3, i - 4, 0) | tpSelect(tpLT, i + 65, 0) | tpSelect(tpGT & tpLT2, i + 71, 0) | tpSelect(tpEq, 45, 0) | tpSelect(tpEq2, 95, 0));
    }

    static int decodeDigit(byte b) {
        int tpGT = tpGT(b, 64) & tpLT(b, 91);
        int tpGT2 = tpGT(b, 96) & tpLT(b, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
        int tpGT3 = tpGT(b, 47) & tpLT(b, 58);
        int tpEq = tpEq(b, 45) | tpEq(b, 43);
        int tpEq2 = tpEq(b, 47) | tpEq(b, 95);
        int tpSelect = tpSelect(tpGT, b + com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, 0);
        int tpSelect2 = tpSelect(tpGT2, b - 71, 0);
        return tpSelect(tpGT3, b + 4, 0) | tpSelect | tpSelect2 | tpSelect(tpEq, 62, 0) | tpSelect(tpEq2, 63, 0) | tpSelect(tpGT | tpGT2 | tpGT3 | tpEq | tpEq2, 0, -1);
    }

    public static java.lang.String encodeToString(byte[] bArr, boolean z) {
        int i;
        int length = bArr != null ? bArr.length : 0;
        if (length == 0) {
            return "";
        }
        int i2 = (length / 3) * 3;
        int computeEncodedLength = computeEncodedLength(length, z);
        byte[] bArr2 = new byte[computeEncodedLength];
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = i3 + 3;
            int i6 = (bArr[i3 + 2] & 255) | ((bArr[i3] & 255) << 16) | ((bArr[i3 + 1] & 255) << 8);
            if (z) {
                bArr2[i4] = encodeDigitBase64URL((i6 >>> 18) & 63);
                bArr2[i4 + 1] = encodeDigitBase64URL((i6 >>> 12) & 63);
                bArr2[i4 + 2] = encodeDigitBase64URL((i6 >>> 6) & 63);
                i = i4 + 4;
                bArr2[i4 + 3] = encodeDigitBase64URL(i6 & 63);
            } else {
                bArr2[i4] = encodeDigitBase64((i6 >>> 18) & 63);
                bArr2[i4 + 1] = encodeDigitBase64((i6 >>> 12) & 63);
                bArr2[i4 + 2] = encodeDigitBase64((i6 >>> 6) & 63);
                i = i4 + 4;
                bArr2[i4 + 3] = encodeDigitBase64(i6 & 63);
            }
            i4 = i;
            i3 = i5;
        }
        int i7 = length - i2;
        if (i7 > 0) {
            int i8 = ((bArr[i2] & 255) << 10) | (i7 == 2 ? (bArr[length - 1] & 255) << 2 : 0);
            if (!z) {
                bArr2[computeEncodedLength - 4] = encodeDigitBase64(i8 >> 12);
                bArr2[computeEncodedLength - 3] = encodeDigitBase64((i8 >>> 6) & 63);
                bArr2[computeEncodedLength - 2] = i7 == 2 ? encodeDigitBase64(i8 & 63) : (byte) 61;
                bArr2[computeEncodedLength - 1] = kotlin.io.encoding.Base64.padSymbol;
            } else if (i7 == 2) {
                bArr2[computeEncodedLength - 3] = encodeDigitBase64URL(i8 >> 12);
                bArr2[computeEncodedLength - 2] = encodeDigitBase64URL((i8 >>> 6) & 63);
                bArr2[computeEncodedLength - 1] = encodeDigitBase64URL(i8 & 63);
            } else {
                bArr2[computeEncodedLength - 2] = encodeDigitBase64URL(i8 >> 12);
                bArr2[computeEncodedLength - 1] = encodeDigitBase64URL((i8 >>> 6) & 63);
            }
        }
        return new java.lang.String(bArr2, com.nimbusds.jose.util.StandardCharset.UTF_8);
    }

    public static byte[] decode(java.lang.String str) {
        if (str == null || str.isEmpty()) {
            return new byte[0];
        }
        byte[] bytes = str.getBytes(com.nimbusds.jose.util.StandardCharset.UTF_8);
        int length = bytes.length;
        byte[] bArr = new byte[checkedCast((length * 6) >> 3)];
        int i = 0;
        int i2 = 0;
        while (i < bytes.length) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < 4 && i < length) {
                int decodeDigit = decodeDigit(bytes[i]);
                if (decodeDigit >= 0) {
                    i4 |= decodeDigit << (18 - (i3 * 6));
                    i3++;
                }
                i++;
            }
            if (i3 >= 2) {
                int i5 = i2 + 1;
                bArr[i2] = (byte) (i4 >> 16);
                if (i3 >= 3) {
                    int i6 = i2 + 2;
                    bArr[i5] = (byte) (i4 >> 8);
                    if (i3 >= 4) {
                        i2 += 3;
                        bArr[i6] = (byte) i4;
                    } else {
                        i2 = i6;
                    }
                } else {
                    i2 = i5;
                }
            }
        }
        return java.util.Arrays.copyOf(bArr, i2);
    }

    private static int checkedCast(long j) {
        int i = (int) j;
        if (i == j) {
            return i;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(j);
        sb.append(" cannot be cast to int without changing its value.");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }
}
