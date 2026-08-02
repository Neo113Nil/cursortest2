package com.datadog.trace.util;

/* loaded from: classes3.dex */
public final class PercentEscaper {
    private static final char[] getHighSpeedVideoSizes = "0123456789ABCDEF".toCharArray();
    private static final boolean[] Camera2StreamConfigurationMap = getHighSpeedVideoSizes("\",;\\()/:<=>?@[]{} ");
    private static final boolean[] getHighSpeedVideoFpsRanges = getHighSpeedVideoSizes("\",;\\ ");

    public static com.datadog.trace.util.PercentEscaper create() {
        return new com.datadog.trace.util.PercentEscaper();
    }

    private static boolean[] getHighSpeedVideoSizes(java.lang.String str) {
        char[] charArray = str.toCharArray();
        int i = -1;
        for (char c : charArray) {
            i = java.lang.Math.max((int) c, i);
        }
        boolean[] zArr = new boolean[i + 1];
        for (char c2 : charArray) {
            zArr[c2] = true;
        }
        return zArr;
    }

    public final com.datadog.trace.util.PercentEscaper.Escaped escapeKey(java.lang.String str) {
        return escape(str, Camera2StreamConfigurationMap);
    }

    public final com.datadog.trace.util.PercentEscaper.Escaped escapeValue(java.lang.String str) {
        return escape(str, getHighSpeedVideoFpsRanges);
    }

    private static boolean getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, boolean[] zArr) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt > '~' || charAt <= ' ') {
                return true;
            }
            if (charAt < zArr.length && zArr[charAt]) {
                return true;
            }
        }
        return false;
    }

    public final boolean keyNeedsEncoding(java.lang.String str) {
        return getHighResolutionOutputSizeshNQ4ISI(str, Camera2StreamConfigurationMap);
    }

    public final boolean valNeedsEncoding(java.lang.String str) {
        return getHighResolutionOutputSizeshNQ4ISI(str, getHighSpeedVideoFpsRanges);
    }

    public final com.datadog.trace.util.PercentEscaper.Escaped escape(java.lang.String str, boolean[] zArr) {
        int i;
        char[] cArr;
        char c;
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            char charAt = str.charAt(i2);
            if (charAt > '~' || charAt <= ' ' || (charAt < zArr.length && zArr[charAt])) {
                int length2 = str.length();
                char[] cArr2 = new char[1024];
                com.datadog.trace.util.PercentEscaper.Escaped escaped = new com.datadog.trace.util.PercentEscaper.Escaped("", i2);
                int i3 = 0;
                int i4 = 0;
                while (i2 < length2) {
                    if (i2 < length2) {
                        int i5 = i2 + 1;
                        char charAt2 = str.charAt(i2);
                        int i6 = charAt2;
                        if (charAt2 >= 55296) {
                            i6 = charAt2;
                            if (charAt2 <= 57343) {
                                if (charAt2 > 56319) {
                                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Unexpected low surrogate character '");
                                    sb.append(charAt2);
                                    sb.append("' with value ");
                                    sb.append((int) charAt2);
                                    sb.append(" at index ");
                                    sb.append(i2);
                                    sb.append(" in '");
                                    sb.append((java.lang.Object) str);
                                    sb.append("'");
                                    throw new java.lang.IllegalArgumentException(sb.toString());
                                }
                                if (i5 == length2) {
                                    i6 = -charAt2;
                                } else {
                                    char charAt3 = str.charAt(i5);
                                    if (!java.lang.Character.isLowSurrogate(charAt3)) {
                                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Expected low surrogate but got char '");
                                        sb2.append(charAt3);
                                        sb2.append("' with value ");
                                        sb2.append((int) charAt3);
                                        sb2.append(" at index ");
                                        sb2.append(i5);
                                        sb2.append(" in '");
                                        sb2.append((java.lang.Object) str);
                                        sb2.append("'");
                                        throw new java.lang.IllegalArgumentException(sb2.toString());
                                    }
                                    i6 = java.lang.Character.toCodePoint(charAt2, charAt3);
                                }
                            }
                        }
                        if (i6 < 0) {
                            throw new java.lang.IllegalArgumentException("Trailing high surrogate at end of input");
                        }
                        if (i6 < zArr.length && !zArr[i6]) {
                            cArr = null;
                            i = 2;
                        } else if (i6 <= 127) {
                            char[] cArr3 = getHighSpeedVideoSizes;
                            char[] cArr4 = {'%', cArr3[i6 >>> 4], cArr3[i6 & 15]};
                            escaped.size++;
                            i = 2;
                            cArr = cArr4;
                        } else {
                            if (i6 <= 2047) {
                                char[] cArr5 = getHighSpeedVideoSizes;
                                char[] cArr6 = {'%', cArr5[(i6 >>> 10) | 12], cArr5[(i6 >>> 6) & 15], '%', cArr5[((i6 >>> 4) & 3) | 8], cArr5[i6 & 15]};
                                escaped.size += 2;
                                cArr = cArr6;
                            } else if (i6 <= 65535) {
                                char[] cArr7 = getHighSpeedVideoSizes;
                                char c2 = cArr7[i6 & 15];
                                char[] cArr8 = {'%', 'E', cArr7[i6 >>> 12], '%', cArr7[((i6 >>> 10) & 3) | 8], cArr7[(i6 >>> 6) & 15], '%', cArr7[((i6 >>> 4) & 3) | 8], c2};
                                escaped.size += 3;
                                cArr = cArr8;
                            } else if (i6 <= 1114111) {
                                char[] cArr9 = getHighSpeedVideoSizes;
                                char c3 = cArr9[i6 & 15];
                                char c4 = cArr9[((i6 >>> 4) & 3) | 8];
                                char c5 = cArr9[(i6 >>> 6) & 15];
                                i = 2;
                                char[] cArr10 = {'%', 'F', cArr9[(i6 >>> 18) & 7], '%', cArr9[((i6 >>> 16) & 3) | 8], cArr9[(i6 >>> 12) & 15], '%', cArr9[((i6 >>> 10) & 3) | 8], c5, '%', c4, c3};
                                escaped.size += 4;
                                cArr = cArr10;
                            } else {
                                throw new java.lang.IllegalArgumentException("Invalid unicode character value ".concat(java.lang.String.valueOf(i6)));
                            }
                            i = 2;
                        }
                        int i7 = (java.lang.Character.isSupplementaryCodePoint(i6) ? i : 1) + i2;
                        if (cArr != null) {
                            int i8 = i2 - i3;
                            int i9 = i4 + i8;
                            int length3 = cArr.length + i9;
                            if (cArr2.length < length3) {
                                c = ' ';
                                int i10 = length3 + (length2 - i2) + 32;
                                if (i10 < 0) {
                                    throw new java.lang.AssertionError("Cannot increase internal buffer any further");
                                }
                                char[] cArr11 = new char[i10];
                                if (i4 > 0) {
                                    java.lang.System.arraycopy(cArr2, 0, cArr11, 0, i4);
                                }
                                cArr2 = cArr11;
                            } else {
                                c = ' ';
                            }
                            if (i8 > 0) {
                                str.getChars(i3, i2, cArr2, i4);
                                i4 = i9;
                            }
                            if (cArr.length > 0) {
                                java.lang.System.arraycopy(cArr, 0, cArr2, i4, cArr.length);
                                i4 += cArr.length;
                            }
                            i3 = i7;
                        } else {
                            c = ' ';
                        }
                        i2 = i7;
                        while (i2 < length2) {
                            char charAt4 = str.charAt(i2);
                            if (charAt4 >= zArr.length || !zArr[charAt4]) {
                                i2++;
                            }
                        }
                    } else {
                        throw new java.lang.IndexOutOfBoundsException("Index exceeds specified range");
                    }
                }
                int i11 = length2 - i3;
                if (i11 > 0) {
                    int i12 = i4 + i11;
                    if (cArr2.length < i12) {
                        if (i12 < 0) {
                            throw new java.lang.AssertionError("Cannot increase internal buffer any further");
                        }
                        char[] cArr12 = new char[i12];
                        if (i4 > 0) {
                            java.lang.System.arraycopy(cArr2, 0, cArr12, 0, i4);
                        }
                        cArr2 = cArr12;
                    }
                    str.getChars(i3, length2, cArr2, i4);
                    i4 = i12;
                }
                escaped.size += i11;
                escaped.data = new java.lang.String(cArr2, 0, i4);
                return escaped;
            }
            i2++;
        }
        return new com.datadog.trace.util.PercentEscaper.Escaped(str, length);
    }

    public static class Escaped {
        public java.lang.String data;
        public int size;

        public Escaped(java.lang.String str, int i) {
            this.data = str;
            this.size = i;
        }
    }
}
