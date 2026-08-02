package com.google.common.base;

/* loaded from: classes4.dex */
public final class Utf8 {
    public static int encodedLength(java.lang.CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        while (i < length && charSequence.charAt(i) < 128) {
            i++;
        }
        int i2 = length;
        while (true) {
            if (i < length) {
                char charAt = charSequence.charAt(i);
                if (charAt >= 2048) {
                    i2 += encodedLengthGeneral(charSequence, i);
                    break;
                }
                i2 += (127 - charAt) >>> 31;
                i++;
            } else {
                break;
            }
        }
        if (i2 >= length) {
            return i2;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UTF-8 length does not fit in int: ");
        sb.append(i2 + 4294967296L);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    private static int encodedLengthGeneral(java.lang.CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 0;
        while (i < length) {
            char charAt = charSequence.charAt(i);
            if (charAt < 2048) {
                i2 += (127 - charAt) >>> 31;
            } else {
                i2 += 2;
                if (55296 <= charAt && charAt <= 57343) {
                    if (java.lang.Character.codePointAt(charSequence, i) == charAt) {
                        throw new java.lang.IllegalArgumentException(unpairedSurrogateMsg(i));
                    }
                    i++;
                }
            }
            i++;
        }
        return i2;
    }

    public static boolean isWellFormed(byte[] bArr) {
        return isWellFormed(bArr, 0, bArr.length);
    }

    public static boolean isWellFormed(byte[] bArr, int i, int i2) {
        int i3 = i2 + i;
        com.google.common.base.Preconditions.checkPositionIndexes(i, i3, bArr.length);
        while (i < i3) {
            if (bArr[i] < 0) {
                return isWellFormedSlowPath(bArr, i, i3);
            }
            i++;
        }
        return true;
    }

    private static boolean isWellFormedSlowPath(byte[] bArr, int i, int i2) {
        byte b;
        byte b2;
        while (i < i2) {
            int i3 = i + 1;
            byte b3 = bArr[i];
            if (b3 < 0) {
                if (b3 < -32) {
                    if (i3 != i2 && b3 >= -62) {
                        i += 2;
                        if (bArr[i3] > -65) {
                        }
                    }
                    return false;
                }
                if (b3 >= -16) {
                    int i4 = i + 3;
                    if (i4 < i2 && (b2 = bArr[i3]) <= -65 && (((b3 << com.google.common.base.Ascii.FS) + (b2 + com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4)) >> 30) == 0 && bArr[i + 2] <= -65) {
                        i += 4;
                        if (bArr[i4] > -65) {
                        }
                    }
                    return false;
                }
                int i5 = i + 2;
                if (i5 < i2 && (b = bArr[i3]) <= -65 && ((b3 != -32 || b >= -96) && (b3 != -19 || b < -96))) {
                    i += 3;
                    if (bArr[i5] > -65) {
                    }
                }
                return false;
            }
            i = i3;
        }
        return true;
    }

    private static java.lang.String unpairedSurrogateMsg(int i) {
        return "Unpaired surrogate at index ".concat(java.lang.String.valueOf(i));
    }

    private Utf8() {
    }
}
