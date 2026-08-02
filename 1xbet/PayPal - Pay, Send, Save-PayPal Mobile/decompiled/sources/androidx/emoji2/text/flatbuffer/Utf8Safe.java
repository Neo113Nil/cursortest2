package androidx.emoji2.text.flatbuffer;

/* loaded from: classes3.dex */
public final class Utf8Safe extends androidx.emoji2.text.flatbuffer.Utf8 {
    public static java.lang.String decodeUtf8Array(byte[] bArr, int i, int i2) {
        if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
            throw new java.lang.ArrayIndexOutOfBoundsException(java.lang.String.format("buffer length=%d, index=%d, size=%d", java.lang.Integer.valueOf(bArr.length), java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)));
        }
        int i3 = i + i2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (i < i3) {
            byte b = bArr[i];
            if (!androidx.emoji2.text.flatbuffer.Utf8.DecodeUtil.getHighResolutionOutputSizeshNQ4ISI(b)) {
                break;
            }
            i++;
            androidx.emoji2.text.flatbuffer.Utf8.DecodeUtil.getHighResolutionOutputSizeshNQ4ISI(b, cArr, i4);
            i4++;
        }
        int i5 = i4;
        while (i < i3) {
            int i6 = i + 1;
            byte b2 = bArr[i];
            if (androidx.emoji2.text.flatbuffer.Utf8.DecodeUtil.getHighResolutionOutputSizeshNQ4ISI(b2)) {
                androidx.emoji2.text.flatbuffer.Utf8.DecodeUtil.getHighResolutionOutputSizeshNQ4ISI(b2, cArr, i5);
                i5++;
                i = i6;
                while (i < i3) {
                    byte b3 = bArr[i];
                    if (androidx.emoji2.text.flatbuffer.Utf8.DecodeUtil.getHighResolutionOutputSizeshNQ4ISI(b3)) {
                        i++;
                        androidx.emoji2.text.flatbuffer.Utf8.DecodeUtil.getHighResolutionOutputSizeshNQ4ISI(b3, cArr, i5);
                        i5++;
                    }
                }
            } else if (androidx.emoji2.text.flatbuffer.Utf8.DecodeUtil.getHighSpeedVideoFpsRanges(b2)) {
                if (i6 >= i3) {
                    throw new java.lang.IllegalArgumentException("Invalid UTF-8");
                }
                i += 2;
                androidx.emoji2.text.flatbuffer.Utf8.DecodeUtil.Camera2StreamConfigurationMap(b2, bArr[i6], cArr, i5);
                i5++;
            } else if (androidx.emoji2.text.flatbuffer.Utf8.DecodeUtil.getHighSpeedVideoFpsRangesFor(b2)) {
                if (i6 >= i3 - 1) {
                    throw new java.lang.IllegalArgumentException("Invalid UTF-8");
                }
                androidx.emoji2.text.flatbuffer.Utf8.DecodeUtil.getHighSpeedVideoFpsRangesFor(b2, bArr[i6], bArr[i + 2], cArr, i5);
                i5++;
                i += 3;
            } else {
                if (i6 >= i3 - 2) {
                    throw new java.lang.IllegalArgumentException("Invalid UTF-8");
                }
                androidx.emoji2.text.flatbuffer.Utf8.DecodeUtil.getHighResolutionOutputSizeshNQ4ISI(b2, bArr[i6], bArr[i + 2], bArr[i + 3], cArr, i5);
                i5 += 2;
                i += 4;
            }
        }
        return new java.lang.String(cArr, 0, i5);
    }

    public static java.lang.String decodeUtf8Buffer(java.nio.ByteBuffer byteBuffer, int i, int i2) {
        if ((i | i2 | ((byteBuffer.limit() - i) - i2)) < 0) {
            throw new java.lang.ArrayIndexOutOfBoundsException(java.lang.String.format("buffer limit=%d, index=%d, limit=%d", java.lang.Integer.valueOf(byteBuffer.limit()), java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)));
        }
        int i3 = i + i2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (i < i3) {
            byte b = byteBuffer.get(i);
            if (!androidx.emoji2.text.flatbuffer.Utf8.DecodeUtil.getHighResolutionOutputSizeshNQ4ISI(b)) {
                break;
            }
            i++;
            androidx.emoji2.text.flatbuffer.Utf8.DecodeUtil.getHighResolutionOutputSizeshNQ4ISI(b, cArr, i4);
            i4++;
        }
        int i5 = i4;
        while (i < i3) {
            int i6 = i + 1;
            byte b2 = byteBuffer.get(i);
            if (androidx.emoji2.text.flatbuffer.Utf8.DecodeUtil.getHighResolutionOutputSizeshNQ4ISI(b2)) {
                androidx.emoji2.text.flatbuffer.Utf8.DecodeUtil.getHighResolutionOutputSizeshNQ4ISI(b2, cArr, i5);
                i5++;
                i = i6;
                while (i < i3) {
                    byte b3 = byteBuffer.get(i);
                    if (androidx.emoji2.text.flatbuffer.Utf8.DecodeUtil.getHighResolutionOutputSizeshNQ4ISI(b3)) {
                        i++;
                        androidx.emoji2.text.flatbuffer.Utf8.DecodeUtil.getHighResolutionOutputSizeshNQ4ISI(b3, cArr, i5);
                        i5++;
                    }
                }
            } else if (androidx.emoji2.text.flatbuffer.Utf8.DecodeUtil.getHighSpeedVideoFpsRanges(b2)) {
                if (i6 >= i3) {
                    throw new java.lang.IllegalArgumentException("Invalid UTF-8");
                }
                i += 2;
                androidx.emoji2.text.flatbuffer.Utf8.DecodeUtil.Camera2StreamConfigurationMap(b2, byteBuffer.get(i6), cArr, i5);
                i5++;
            } else if (androidx.emoji2.text.flatbuffer.Utf8.DecodeUtil.getHighSpeedVideoFpsRangesFor(b2)) {
                if (i6 >= i3 - 1) {
                    throw new java.lang.IllegalArgumentException("Invalid UTF-8");
                }
                androidx.emoji2.text.flatbuffer.Utf8.DecodeUtil.getHighSpeedVideoFpsRangesFor(b2, byteBuffer.get(i6), byteBuffer.get(i + 2), cArr, i5);
                i5++;
                i += 3;
            } else {
                if (i6 >= i3 - 2) {
                    throw new java.lang.IllegalArgumentException("Invalid UTF-8");
                }
                androidx.emoji2.text.flatbuffer.Utf8.DecodeUtil.getHighResolutionOutputSizeshNQ4ISI(b2, byteBuffer.get(i6), byteBuffer.get(i + 2), byteBuffer.get(i + 3), cArr, i5);
                i5 += 2;
                i += 4;
            }
        }
        return new java.lang.String(cArr, 0, i5);
    }

    @Override // androidx.emoji2.text.flatbuffer.Utf8
    public final java.lang.String decodeUtf8(java.nio.ByteBuffer byteBuffer, int i, int i2) throws java.lang.IllegalArgumentException {
        if (byteBuffer.hasArray()) {
            return decodeUtf8Array(byteBuffer.array(), byteBuffer.arrayOffset() + i, i2);
        }
        return decodeUtf8Buffer(byteBuffer, i, i2);
    }

    @Override // androidx.emoji2.text.flatbuffer.Utf8
    public final void encodeUtf8(java.lang.CharSequence charSequence, java.nio.ByteBuffer byteBuffer) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        char charAt;
        char c = 2048;
        int i6 = 0;
        if (byteBuffer.hasArray()) {
            int arrayOffset = byteBuffer.arrayOffset();
            byte[] array = byteBuffer.array();
            int position = byteBuffer.position();
            int remaining = byteBuffer.remaining();
            int i7 = position + arrayOffset;
            int length = charSequence.length();
            int i8 = remaining + i7;
            while (i6 < length) {
                int i9 = i6 + i7;
                if (i9 >= i8 || (charAt = charSequence.charAt(i6)) >= 128) {
                    break;
                }
                array[i9] = (byte) charAt;
                i6++;
            }
            if (i6 == length) {
                i3 = i7 + length;
            } else {
                i3 = i7 + i6;
                while (i6 < length) {
                    char charAt2 = charSequence.charAt(i6);
                    if (charAt2 >= 128 || i3 >= i8) {
                        if (charAt2 < c && i3 <= i8 - 2) {
                            array[i3] = (byte) ((charAt2 >>> 6) | 960);
                            i4 = i3 + 2;
                            array[i3 + 1] = (byte) ((charAt2 & '?') | 128);
                        } else {
                            if ((charAt2 >= 55296 && 57343 >= charAt2) || i3 > i8 - 3) {
                                if (i3 <= i8 - 4) {
                                    int i10 = i6 + 1;
                                    if (i10 != charSequence.length()) {
                                        char charAt3 = charSequence.charAt(i10);
                                        if (java.lang.Character.isSurrogatePair(charAt2, charAt3)) {
                                            int codePoint = java.lang.Character.toCodePoint(charAt2, charAt3);
                                            array[i3] = (byte) ((codePoint >>> 18) | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
                                            array[i3 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                            array[i3 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                            array[i3 + 3] = (byte) ((codePoint & 63) | 128);
                                            i3 += 4;
                                            i6 = i10;
                                        } else {
                                            i6 = i10;
                                        }
                                    }
                                    throw new androidx.emoji2.text.flatbuffer.Utf8Safe.UnpairedSurrogateException(i6 - 1, length);
                                }
                                if (55296 <= charAt2 && charAt2 <= 57343 && ((i5 = i6 + 1) == charSequence.length() || !java.lang.Character.isSurrogatePair(charAt2, charSequence.charAt(i5)))) {
                                    throw new androidx.emoji2.text.flatbuffer.Utf8Safe.UnpairedSurrogateException(i6, length);
                                }
                                java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed writing ");
                                sb.append(charAt2);
                                sb.append(" at index ");
                                sb.append(i3);
                                throw new java.lang.ArrayIndexOutOfBoundsException(sb.toString());
                            }
                            array[i3] = (byte) ((charAt2 >>> '\f') | androidx.window.core.layout.WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND);
                            array[i3 + 1] = (byte) (((charAt2 >>> 6) & 63) | 128);
                            i4 = i3 + 3;
                            array[i3 + 2] = (byte) ((charAt2 & '?') | 128);
                        }
                        i3 = i4;
                    } else {
                        array[i3] = (byte) charAt2;
                        i3++;
                    }
                    i6++;
                    c = 2048;
                }
            }
            byteBuffer.position(i3 - arrayOffset);
            return;
        }
        int length2 = charSequence.length();
        int position2 = byteBuffer.position();
        while (i6 < length2) {
            try {
                char charAt4 = charSequence.charAt(i6);
                if (charAt4 >= 128) {
                    break;
                }
                byteBuffer.put(position2 + i6, (byte) charAt4);
                i6++;
            } catch (java.lang.IndexOutOfBoundsException unused) {
                i = position2;
                int position3 = byteBuffer.position();
                int max = java.lang.Math.max(i6, (i - byteBuffer.position()) + 1);
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Failed writing ");
                sb2.append(charSequence.charAt(i6));
                sb2.append(" at index ");
                sb2.append(position3 + max);
                throw new java.lang.ArrayIndexOutOfBoundsException(sb2.toString());
            }
        }
        if (i6 == length2) {
            byteBuffer.position(position2 + i6);
            return;
        }
        int i11 = position2 + i6;
        while (i6 < length2) {
            char charAt5 = charSequence.charAt(i6);
            if (charAt5 < 128) {
                byteBuffer.put(i11, (byte) charAt5);
            } else if (charAt5 < 2048) {
                int i12 = i11 + 1;
                try {
                    byteBuffer.put(i11, (byte) ((charAt5 >>> 6) | 192));
                    byteBuffer.put(i12, (byte) ((charAt5 & '?') | 128));
                    i11 = i12;
                } catch (java.lang.IndexOutOfBoundsException unused2) {
                    i = i12;
                    int position32 = byteBuffer.position();
                    int max2 = java.lang.Math.max(i6, (i - byteBuffer.position()) + 1);
                    java.lang.StringBuilder sb22 = new java.lang.StringBuilder("Failed writing ");
                    sb22.append(charSequence.charAt(i6));
                    sb22.append(" at index ");
                    sb22.append(position32 + max2);
                    throw new java.lang.ArrayIndexOutOfBoundsException(sb22.toString());
                }
            } else if (charAt5 < 55296 || 57343 < charAt5) {
                int i13 = i11 + 1;
                byteBuffer.put(i11, (byte) ((charAt5 >>> '\f') | 224));
                i11 += 2;
                byteBuffer.put(i13, (byte) (((charAt5 >>> 6) & 63) | 128));
                byteBuffer.put(i11, (byte) ((charAt5 & '?') | 128));
            } else {
                int i14 = i6 + 1;
                if (i14 != length2) {
                    try {
                        char charAt6 = charSequence.charAt(i14);
                        if (java.lang.Character.isSurrogatePair(charAt5, charAt6)) {
                            int codePoint2 = java.lang.Character.toCodePoint(charAt5, charAt6);
                            i2 = i11 + 1;
                            try {
                                byteBuffer.put(i11, (byte) ((codePoint2 >>> 18) | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE));
                                i = i11 + 2;
                            } catch (java.lang.IndexOutOfBoundsException unused3) {
                                i = i2;
                                i6 = i14;
                                int position322 = byteBuffer.position();
                                int max22 = java.lang.Math.max(i6, (i - byteBuffer.position()) + 1);
                                java.lang.StringBuilder sb222 = new java.lang.StringBuilder("Failed writing ");
                                sb222.append(charSequence.charAt(i6));
                                sb222.append(" at index ");
                                sb222.append(position322 + max22);
                                throw new java.lang.ArrayIndexOutOfBoundsException(sb222.toString());
                            }
                            try {
                                byteBuffer.put(i2, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                i11 += 3;
                                byteBuffer.put(i, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                byteBuffer.put(i11, (byte) ((codePoint2 & 63) | 128));
                                i6 = i14;
                            } catch (java.lang.IndexOutOfBoundsException unused4) {
                                i6 = i14;
                                int position3222 = byteBuffer.position();
                                int max222 = java.lang.Math.max(i6, (i - byteBuffer.position()) + 1);
                                java.lang.StringBuilder sb2222 = new java.lang.StringBuilder("Failed writing ");
                                sb2222.append(charSequence.charAt(i6));
                                sb2222.append(" at index ");
                                sb2222.append(position3222 + max222);
                                throw new java.lang.ArrayIndexOutOfBoundsException(sb2222.toString());
                            }
                        } else {
                            i6 = i14;
                        }
                    } catch (java.lang.IndexOutOfBoundsException unused5) {
                        i2 = i11;
                    }
                }
                throw new androidx.emoji2.text.flatbuffer.Utf8Safe.UnpairedSurrogateException(i6, length2);
            }
            i6++;
            i11++;
        }
        byteBuffer.position(i11);
    }

    /* loaded from: classes7.dex */
    static class UnpairedSurrogateException extends java.lang.IllegalArgumentException {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        UnpairedSurrogateException(int i, int i2) {
            super(r0.toString());
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unpaired surrogate at index ");
            sb.append(i);
            sb.append(" of ");
            sb.append(i2);
        }
    }

    @Override // androidx.emoji2.text.flatbuffer.Utf8
    public final int encodedLength(java.lang.CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (java.lang.Character.codePointAt(charSequence, i2) < 65536) {
                                throw new androidx.emoji2.text.flatbuffer.Utf8Safe.UnpairedSurrogateException(i2, length2);
                            }
                            i2++;
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UTF-8 length does not fit in int: ");
        sb.append(i3 + 4294967296L);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }
}
