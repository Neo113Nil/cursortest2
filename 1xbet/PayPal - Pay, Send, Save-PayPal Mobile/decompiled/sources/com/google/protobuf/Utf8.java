package com.google.protobuf;

/* loaded from: classes9.dex */
final class Utf8 {
    private static final long ASCII_MASK_LONG = -9187201950435737472L;
    static final int COMPLETE = 0;
    static final int MALFORMED = -1;
    static final int MAX_BYTES_PER_CHAR = 3;
    private static final int UNSAFE_COUNT_ASCII_THRESHOLD = 16;
    private static final com.google.protobuf.Utf8.Processor processor;

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    static {
        com.google.protobuf.Utf8.Processor safeProcessor;
        if (com.google.protobuf.Utf8.UnsafeProcessor.isAvailable() && !com.google.protobuf.Android.isOnAndroidDevice()) {
            safeProcessor = new com.google.protobuf.Utf8.UnsafeProcessor();
        } else {
            safeProcessor = new com.google.protobuf.Utf8.SafeProcessor();
        }
        processor = safeProcessor;
    }

    static boolean isValidUtf8(byte[] bArr) {
        return processor.isValidUtf8(bArr, 0, bArr.length);
    }

    static boolean isValidUtf8(byte[] bArr, int i, int i2) {
        return processor.isValidUtf8(bArr, i, i2);
    }

    static int partialIsValidUtf8(int i, byte[] bArr, int i2, int i3) {
        return processor.partialIsValidUtf8(i, bArr, i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            return incompleteStateFor(b);
        }
        if (i3 == 1) {
            return incompleteStateFor(b, bArr[i]);
        }
        if (i3 == 2) {
            return incompleteStateFor(b, bArr[i], bArr[i + 1]);
        }
        throw new java.lang.AssertionError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(java.nio.ByteBuffer byteBuffer, int i, int i2, int i3) {
        if (i3 == 0) {
            return incompleteStateFor(i);
        }
        if (i3 == 1) {
            return incompleteStateFor(i, byteBuffer.get(i2));
        }
        if (i3 == 2) {
            return incompleteStateFor(i, byteBuffer.get(i2), byteBuffer.get(i2 + 1));
        }
        throw new java.lang.AssertionError();
    }

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

    static int encodedLength(java.lang.CharSequence charSequence) {
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
                    if (java.lang.Character.codePointAt(charSequence, i) < 65536) {
                        throw new com.google.protobuf.Utf8.UnpairedSurrogateException(i, length);
                    }
                    i++;
                }
            }
            i++;
        }
        return i2;
    }

    static int encode(java.lang.CharSequence charSequence, byte[] bArr, int i, int i2) {
        return processor.encodeUtf8(charSequence, bArr, i, i2);
    }

    static boolean isValidUtf8(java.nio.ByteBuffer byteBuffer) {
        return processor.isValidUtf8(byteBuffer, byteBuffer.position(), byteBuffer.remaining());
    }

    static int partialIsValidUtf8(int i, java.nio.ByteBuffer byteBuffer, int i2, int i3) {
        return processor.partialIsValidUtf8(i, byteBuffer, i2, i3);
    }

    static java.lang.String decodeUtf8(java.nio.ByteBuffer byteBuffer, int i, int i2) throws com.google.protobuf.InvalidProtocolBufferException {
        return processor.decodeUtf8(byteBuffer, i, i2);
    }

    static java.lang.String decodeUtf8(byte[] bArr, int i, int i2) throws com.google.protobuf.InvalidProtocolBufferException {
        return processor.decodeUtf8(bArr, i, i2);
    }

    static void encodeUtf8(java.lang.CharSequence charSequence, java.nio.ByteBuffer byteBuffer) {
        processor.encodeUtf8(charSequence, byteBuffer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int estimateConsecutiveAscii(java.nio.ByteBuffer byteBuffer, int i, int i2) {
        int i3 = i;
        while (i3 < i2 - 7 && (byteBuffer.getLong(i3) & (-9187201950435737472L)) == 0) {
            i3 += 8;
        }
        return i3 - i;
    }

    static abstract class Processor {
        abstract java.lang.String decodeUtf8(byte[] bArr, int i, int i2) throws com.google.protobuf.InvalidProtocolBufferException;

        abstract java.lang.String decodeUtf8Direct(java.nio.ByteBuffer byteBuffer, int i, int i2) throws com.google.protobuf.InvalidProtocolBufferException;

        abstract int encodeUtf8(java.lang.CharSequence charSequence, byte[] bArr, int i, int i2);

        abstract void encodeUtf8Direct(java.lang.CharSequence charSequence, java.nio.ByteBuffer byteBuffer);

        abstract int partialIsValidUtf8(int i, byte[] bArr, int i2, int i3);

        abstract int partialIsValidUtf8Direct(int i, java.nio.ByteBuffer byteBuffer, int i2, int i3);

        Processor() {
        }

        final boolean isValidUtf8(byte[] bArr, int i, int i2) {
            return partialIsValidUtf8(0, bArr, i, i2) == 0;
        }

        final boolean isValidUtf8(java.nio.ByteBuffer byteBuffer, int i, int i2) {
            return partialIsValidUtf8(0, byteBuffer, i, i2) == 0;
        }

        final int partialIsValidUtf8(int i, java.nio.ByteBuffer byteBuffer, int i2, int i3) {
            if (byteBuffer.hasArray()) {
                int arrayOffset = byteBuffer.arrayOffset();
                return partialIsValidUtf8(i, byteBuffer.array(), i2 + arrayOffset, arrayOffset + i3);
            }
            if (byteBuffer.isDirect()) {
                return partialIsValidUtf8Direct(i, byteBuffer, i2, i3);
            }
            return partialIsValidUtf8Default(i, byteBuffer, i2, i3);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
        
            if (r8.get(r9) <= (-65)) goto L53;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x004a, code lost:
        
            if (r8.get(r9) > (-65)) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x008d, code lost:
        
            if (r8.get(r9) > (-65)) goto L54;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        final int partialIsValidUtf8Default(int i, java.nio.ByteBuffer byteBuffer, int i2, int i3) {
            byte b;
            int i4;
            if (i != 0) {
                if (i2 >= i3) {
                    return i;
                }
                byte b2 = (byte) i;
                if (b2 < -32) {
                    if (b2 >= -62) {
                        i4 = i2 + 1;
                    }
                    return -1;
                }
                if (b2 < -16) {
                    byte b3 = (byte) (~(i >> 8));
                    if (b3 == 0) {
                        int i5 = i2 + 1;
                        byte b4 = byteBuffer.get(i2);
                        if (i5 >= i3) {
                            return com.google.protobuf.Utf8.incompleteStateFor(b2, b4);
                        }
                        i2 = i5;
                        b3 = b4;
                    }
                    if (b3 <= -65 && ((b2 != -32 || b3 >= -96) && (b2 != -19 || b3 < -96))) {
                        i4 = i2 + 1;
                    }
                    return -1;
                }
                byte b5 = (byte) (~(i >> 8));
                if (b5 == 0) {
                    int i6 = i2 + 1;
                    b5 = byteBuffer.get(i2);
                    if (i6 >= i3) {
                        return com.google.protobuf.Utf8.incompleteStateFor(b2, b5);
                    }
                    i2 = i6;
                    b = 0;
                } else {
                    b = (byte) (i >> 16);
                }
                if (b == 0) {
                    int i7 = i2 + 1;
                    byte b6 = byteBuffer.get(i2);
                    if (i7 >= i3) {
                        return com.google.protobuf.Utf8.incompleteStateFor(b2, b5, b6);
                    }
                    i2 = i7;
                    b = b6;
                }
                if (b5 <= -65 && (((b2 << com.google.common.base.Ascii.FS) + (b5 + com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4)) >> 30) == 0 && b <= -65) {
                    i4 = i2 + 1;
                }
                return -1;
                i2 = i4;
            }
            return partialIsValidUtf8(byteBuffer, i2, i3);
        }

        private static int partialIsValidUtf8(java.nio.ByteBuffer byteBuffer, int i, int i2) {
            int estimateConsecutiveAscii = i + com.google.protobuf.Utf8.estimateConsecutiveAscii(byteBuffer, i, i2);
            while (estimateConsecutiveAscii < i2) {
                int i3 = estimateConsecutiveAscii + 1;
                byte b = byteBuffer.get(estimateConsecutiveAscii);
                if (b < 0) {
                    if (b < -32) {
                        if (i3 >= i2) {
                            return b;
                        }
                        if (b < -62 || byteBuffer.get(i3) > -65) {
                            return -1;
                        }
                        estimateConsecutiveAscii += 2;
                    } else {
                        if (b >= -16) {
                            if (i3 >= i2 - 2) {
                                return com.google.protobuf.Utf8.incompleteStateFor(byteBuffer, b, i3, i2 - i3);
                            }
                            byte b2 = byteBuffer.get(i3);
                            if (b2 <= -65 && (((b << com.google.common.base.Ascii.FS) + (b2 + com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4)) >> 30) == 0 && byteBuffer.get(estimateConsecutiveAscii + 2) <= -65) {
                                i3 = estimateConsecutiveAscii + 4;
                                if (byteBuffer.get(estimateConsecutiveAscii + 3) > -65) {
                                }
                            }
                            return -1;
                        }
                        if (i3 >= i2 - 1) {
                            return com.google.protobuf.Utf8.incompleteStateFor(byteBuffer, b, i3, i2 - i3);
                        }
                        byte b3 = byteBuffer.get(i3);
                        if (b3 > -65 || ((b == -32 && b3 < -96) || ((b == -19 && b3 >= -96) || byteBuffer.get(estimateConsecutiveAscii + 2) > -65))) {
                            return -1;
                        }
                        estimateConsecutiveAscii += 3;
                    }
                }
                estimateConsecutiveAscii = i3;
            }
            return 0;
        }

        final java.lang.String decodeUtf8(java.nio.ByteBuffer byteBuffer, int i, int i2) throws com.google.protobuf.InvalidProtocolBufferException {
            if (byteBuffer.hasArray()) {
                return decodeUtf8(byteBuffer.array(), byteBuffer.arrayOffset() + i, i2);
            }
            if (byteBuffer.isDirect()) {
                return decodeUtf8Direct(byteBuffer, i, i2);
            }
            return decodeUtf8Default(byteBuffer, i, i2);
        }

        final java.lang.String decodeUtf8Default(java.nio.ByteBuffer byteBuffer, int i, int i2) throws com.google.protobuf.InvalidProtocolBufferException {
            if ((i | i2 | ((byteBuffer.limit() - i) - i2)) < 0) {
                throw new java.lang.ArrayIndexOutOfBoundsException(java.lang.String.format("buffer limit=%d, index=%d, limit=%d", java.lang.Integer.valueOf(byteBuffer.limit()), java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)));
            }
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte b = byteBuffer.get(i);
                if (!com.google.protobuf.Utf8.DecodeUtil.isOneByte(b)) {
                    break;
                }
                i++;
                com.google.protobuf.Utf8.DecodeUtil.handleOneByte(b, cArr, i4);
                i4++;
            }
            int i5 = i4;
            while (i < i3) {
                int i6 = i + 1;
                byte b2 = byteBuffer.get(i);
                if (com.google.protobuf.Utf8.DecodeUtil.isOneByte(b2)) {
                    com.google.protobuf.Utf8.DecodeUtil.handleOneByte(b2, cArr, i5);
                    i5++;
                    i = i6;
                    while (i < i3) {
                        byte b3 = byteBuffer.get(i);
                        if (com.google.protobuf.Utf8.DecodeUtil.isOneByte(b3)) {
                            i++;
                            com.google.protobuf.Utf8.DecodeUtil.handleOneByte(b3, cArr, i5);
                            i5++;
                        }
                    }
                } else if (com.google.protobuf.Utf8.DecodeUtil.isTwoBytes(b2)) {
                    if (i6 >= i3) {
                        throw com.google.protobuf.InvalidProtocolBufferException.invalidUtf8();
                    }
                    i += 2;
                    com.google.protobuf.Utf8.DecodeUtil.handleTwoBytes(b2, byteBuffer.get(i6), cArr, i5);
                    i5++;
                } else if (com.google.protobuf.Utf8.DecodeUtil.isThreeBytes(b2)) {
                    if (i6 >= i3 - 1) {
                        throw com.google.protobuf.InvalidProtocolBufferException.invalidUtf8();
                    }
                    com.google.protobuf.Utf8.DecodeUtil.handleThreeBytes(b2, byteBuffer.get(i6), byteBuffer.get(i + 2), cArr, i5);
                    i5++;
                    i += 3;
                } else {
                    if (i6 >= i3 - 2) {
                        throw com.google.protobuf.InvalidProtocolBufferException.invalidUtf8();
                    }
                    com.google.protobuf.Utf8.DecodeUtil.handleFourBytes(b2, byteBuffer.get(i6), byteBuffer.get(i + 2), byteBuffer.get(i + 3), cArr, i5);
                    i5 += 2;
                    i += 4;
                }
            }
            return new java.lang.String(cArr, 0, i5);
        }

        final void encodeUtf8(java.lang.CharSequence charSequence, java.nio.ByteBuffer byteBuffer) {
            if (byteBuffer.hasArray()) {
                int arrayOffset = byteBuffer.arrayOffset();
                com.google.protobuf.Java8Compatibility.position(byteBuffer, com.google.protobuf.Utf8.encode(charSequence, byteBuffer.array(), byteBuffer.position() + arrayOffset, byteBuffer.remaining()) - arrayOffset);
            } else if (byteBuffer.isDirect()) {
                encodeUtf8Direct(charSequence, byteBuffer);
            } else {
                encodeUtf8Default(charSequence, byteBuffer);
            }
        }

        final void encodeUtf8Default(java.lang.CharSequence charSequence, java.nio.ByteBuffer byteBuffer) {
            int i;
            int i2;
            int length = charSequence.length();
            int position = byteBuffer.position();
            int i3 = 0;
            while (i3 < length) {
                try {
                    char charAt = charSequence.charAt(i3);
                    if (charAt >= 128) {
                        break;
                    }
                    byteBuffer.put(position + i3, (byte) charAt);
                    i3++;
                } catch (java.lang.IndexOutOfBoundsException unused) {
                    i = position;
                    int position2 = byteBuffer.position();
                    int max = java.lang.Math.max(i3, (i - byteBuffer.position()) + 1);
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed writing ");
                    sb.append(charSequence.charAt(i3));
                    sb.append(" at index ");
                    sb.append(position2 + max);
                    throw new java.lang.ArrayIndexOutOfBoundsException(sb.toString());
                }
            }
            if (i3 == length) {
                com.google.protobuf.Java8Compatibility.position(byteBuffer, position + i3);
                return;
            }
            int i4 = position + i3;
            while (i3 < length) {
                char charAt2 = charSequence.charAt(i3);
                if (charAt2 < 128) {
                    byteBuffer.put(i4, (byte) charAt2);
                } else if (charAt2 < 2048) {
                    int i5 = i4 + 1;
                    try {
                        byteBuffer.put(i4, (byte) ((charAt2 >>> 6) | 192));
                        byteBuffer.put(i5, (byte) ((charAt2 & '?') | 128));
                        i4 = i5;
                    } catch (java.lang.IndexOutOfBoundsException unused2) {
                        i = i5;
                        int position22 = byteBuffer.position();
                        int max2 = java.lang.Math.max(i3, (i - byteBuffer.position()) + 1);
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Failed writing ");
                        sb2.append(charSequence.charAt(i3));
                        sb2.append(" at index ");
                        sb2.append(position22 + max2);
                        throw new java.lang.ArrayIndexOutOfBoundsException(sb2.toString());
                    }
                } else if (charAt2 < 55296 || 57343 < charAt2) {
                    int i6 = i4 + 1;
                    byteBuffer.put(i4, (byte) ((charAt2 >>> '\f') | 224));
                    i4 += 2;
                    byteBuffer.put(i6, (byte) (((charAt2 >>> 6) & 63) | 128));
                    byteBuffer.put(i4, (byte) ((charAt2 & '?') | 128));
                } else {
                    int i7 = i3 + 1;
                    if (i7 != length) {
                        try {
                            char charAt3 = charSequence.charAt(i7);
                            if (java.lang.Character.isSurrogatePair(charAt2, charAt3)) {
                                int codePoint = java.lang.Character.toCodePoint(charAt2, charAt3);
                                i2 = i4 + 1;
                                try {
                                    byteBuffer.put(i4, (byte) ((codePoint >>> 18) | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE));
                                    i = i4 + 2;
                                } catch (java.lang.IndexOutOfBoundsException unused3) {
                                    i = i2;
                                    i3 = i7;
                                    int position222 = byteBuffer.position();
                                    int max22 = java.lang.Math.max(i3, (i - byteBuffer.position()) + 1);
                                    java.lang.StringBuilder sb22 = new java.lang.StringBuilder("Failed writing ");
                                    sb22.append(charSequence.charAt(i3));
                                    sb22.append(" at index ");
                                    sb22.append(position222 + max22);
                                    throw new java.lang.ArrayIndexOutOfBoundsException(sb22.toString());
                                }
                                try {
                                    byteBuffer.put(i2, (byte) (((codePoint >>> 12) & 63) | 128));
                                    i4 += 3;
                                    byteBuffer.put(i, (byte) (((codePoint >>> 6) & 63) | 128));
                                    byteBuffer.put(i4, (byte) ((codePoint & 63) | 128));
                                    i3 = i7;
                                } catch (java.lang.IndexOutOfBoundsException unused4) {
                                    i3 = i7;
                                    int position2222 = byteBuffer.position();
                                    int max222 = java.lang.Math.max(i3, (i - byteBuffer.position()) + 1);
                                    java.lang.StringBuilder sb222 = new java.lang.StringBuilder("Failed writing ");
                                    sb222.append(charSequence.charAt(i3));
                                    sb222.append(" at index ");
                                    sb222.append(position2222 + max222);
                                    throw new java.lang.ArrayIndexOutOfBoundsException(sb222.toString());
                                }
                            } else {
                                i3 = i7;
                            }
                        } catch (java.lang.IndexOutOfBoundsException unused5) {
                            i2 = i4;
                        }
                    }
                    throw new com.google.protobuf.Utf8.UnpairedSurrogateException(i3, length);
                }
                i3++;
                i4++;
            }
            com.google.protobuf.Java8Compatibility.position(byteBuffer, i4);
        }
    }

    static final class SafeProcessor extends com.google.protobuf.Utf8.Processor {
        SafeProcessor() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
        
            if (r8[r9] <= (-65)) goto L53;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0044, code lost:
        
            if (r8[r9] > (-65)) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x0081, code lost:
        
            if (r8[r9] > (-65)) goto L54;
         */
        @Override // com.google.protobuf.Utf8.Processor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        final int partialIsValidUtf8(int i, byte[] bArr, int i2, int i3) {
            byte b;
            int i4;
            if (i != 0) {
                if (i2 >= i3) {
                    return i;
                }
                byte b2 = (byte) i;
                if (b2 < -32) {
                    if (b2 >= -62) {
                        i4 = i2 + 1;
                    }
                    return -1;
                }
                if (b2 < -16) {
                    byte b3 = (byte) (~(i >> 8));
                    if (b3 == 0) {
                        int i5 = i2 + 1;
                        byte b4 = bArr[i2];
                        if (i5 >= i3) {
                            return com.google.protobuf.Utf8.incompleteStateFor(b2, b4);
                        }
                        i2 = i5;
                        b3 = b4;
                    }
                    if (b3 <= -65 && ((b2 != -32 || b3 >= -96) && (b2 != -19 || b3 < -96))) {
                        i4 = i2 + 1;
                    }
                    return -1;
                }
                byte b5 = (byte) (~(i >> 8));
                if (b5 == 0) {
                    int i6 = i2 + 1;
                    b5 = bArr[i2];
                    if (i6 >= i3) {
                        return com.google.protobuf.Utf8.incompleteStateFor(b2, b5);
                    }
                    i2 = i6;
                    b = 0;
                } else {
                    b = (byte) (i >> 16);
                }
                if (b == 0) {
                    int i7 = i2 + 1;
                    byte b6 = bArr[i2];
                    if (i7 >= i3) {
                        return com.google.protobuf.Utf8.incompleteStateFor(b2, b5, b6);
                    }
                    i2 = i7;
                    b = b6;
                }
                if (b5 <= -65 && (((b2 << com.google.common.base.Ascii.FS) + (b5 + com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4)) >> 30) == 0 && b <= -65) {
                    i4 = i2 + 1;
                }
                return -1;
                i2 = i4;
            }
            return partialIsValidUtf8(bArr, i2, i3);
        }

        @Override // com.google.protobuf.Utf8.Processor
        final int partialIsValidUtf8Direct(int i, java.nio.ByteBuffer byteBuffer, int i2, int i3) {
            return partialIsValidUtf8Default(i, byteBuffer, i2, i3);
        }

        @Override // com.google.protobuf.Utf8.Processor
        final java.lang.String decodeUtf8(byte[] bArr, int i, int i2) throws com.google.protobuf.InvalidProtocolBufferException {
            if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
                throw new java.lang.ArrayIndexOutOfBoundsException(java.lang.String.format("buffer length=%d, index=%d, size=%d", java.lang.Integer.valueOf(bArr.length), java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)));
            }
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte b = bArr[i];
                if (!com.google.protobuf.Utf8.DecodeUtil.isOneByte(b)) {
                    break;
                }
                i++;
                com.google.protobuf.Utf8.DecodeUtil.handleOneByte(b, cArr, i4);
                i4++;
            }
            int i5 = i4;
            while (i < i3) {
                int i6 = i + 1;
                byte b2 = bArr[i];
                if (com.google.protobuf.Utf8.DecodeUtil.isOneByte(b2)) {
                    com.google.protobuf.Utf8.DecodeUtil.handleOneByte(b2, cArr, i5);
                    i5++;
                    i = i6;
                    while (i < i3) {
                        byte b3 = bArr[i];
                        if (com.google.protobuf.Utf8.DecodeUtil.isOneByte(b3)) {
                            i++;
                            com.google.protobuf.Utf8.DecodeUtil.handleOneByte(b3, cArr, i5);
                            i5++;
                        }
                    }
                } else if (com.google.protobuf.Utf8.DecodeUtil.isTwoBytes(b2)) {
                    if (i6 >= i3) {
                        throw com.google.protobuf.InvalidProtocolBufferException.invalidUtf8();
                    }
                    i += 2;
                    com.google.protobuf.Utf8.DecodeUtil.handleTwoBytes(b2, bArr[i6], cArr, i5);
                    i5++;
                } else if (com.google.protobuf.Utf8.DecodeUtil.isThreeBytes(b2)) {
                    if (i6 >= i3 - 1) {
                        throw com.google.protobuf.InvalidProtocolBufferException.invalidUtf8();
                    }
                    com.google.protobuf.Utf8.DecodeUtil.handleThreeBytes(b2, bArr[i6], bArr[i + 2], cArr, i5);
                    i5++;
                    i += 3;
                } else {
                    if (i6 >= i3 - 2) {
                        throw com.google.protobuf.InvalidProtocolBufferException.invalidUtf8();
                    }
                    com.google.protobuf.Utf8.DecodeUtil.handleFourBytes(b2, bArr[i6], bArr[i + 2], bArr[i + 3], cArr, i5);
                    i5 += 2;
                    i += 4;
                }
            }
            return new java.lang.String(cArr, 0, i5);
        }

        @Override // com.google.protobuf.Utf8.Processor
        final java.lang.String decodeUtf8Direct(java.nio.ByteBuffer byteBuffer, int i, int i2) throws com.google.protobuf.InvalidProtocolBufferException {
            return decodeUtf8Default(byteBuffer, i, i2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
        
            return r10 + r0;
         */
        @Override // com.google.protobuf.Utf8.Processor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        final int encodeUtf8(java.lang.CharSequence charSequence, byte[] bArr, int i, int i2) {
            int i3;
            int i4;
            int i5;
            char charAt;
            int length = charSequence.length();
            int i6 = i2 + i;
            int i7 = 0;
            while (i7 < length && (i5 = i7 + i) < i6 && (charAt = charSequence.charAt(i7)) < 128) {
                bArr[i5] = (byte) charAt;
                i7++;
            }
            int i8 = i + i7;
            while (i7 < length) {
                char charAt2 = charSequence.charAt(i7);
                if (charAt2 >= 128 || i8 >= i6) {
                    if (charAt2 < 2048 && i8 <= i6 - 2) {
                        bArr[i8] = (byte) ((charAt2 >>> 6) | 960);
                        i3 = i8 + 2;
                        bArr[i8 + 1] = (byte) ((charAt2 & '?') | 128);
                    } else {
                        if ((charAt2 >= 55296 && 57343 >= charAt2) || i8 > i6 - 3) {
                            if (i8 <= i6 - 4) {
                                int i9 = i7 + 1;
                                if (i9 != charSequence.length()) {
                                    char charAt3 = charSequence.charAt(i9);
                                    if (java.lang.Character.isSurrogatePair(charAt2, charAt3)) {
                                        int codePoint = java.lang.Character.toCodePoint(charAt2, charAt3);
                                        bArr[i8] = (byte) ((codePoint >>> 18) | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
                                        bArr[i8 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                        bArr[i8 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                        bArr[i8 + 3] = (byte) ((codePoint & 63) | 128);
                                        i8 += 4;
                                        i7 = i9;
                                    } else {
                                        i7 = i9;
                                    }
                                }
                                throw new com.google.protobuf.Utf8.UnpairedSurrogateException(i7 - 1, length);
                            }
                            if (55296 <= charAt2 && charAt2 <= 57343 && ((i4 = i7 + 1) == charSequence.length() || !java.lang.Character.isSurrogatePair(charAt2, charSequence.charAt(i4)))) {
                                throw new com.google.protobuf.Utf8.UnpairedSurrogateException(i7, length);
                            }
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed writing ");
                            sb.append(charAt2);
                            sb.append(" at index ");
                            sb.append(i8);
                            throw new java.lang.ArrayIndexOutOfBoundsException(sb.toString());
                        }
                        bArr[i8] = (byte) ((charAt2 >>> '\f') | androidx.window.core.layout.WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND);
                        bArr[i8 + 1] = (byte) (((charAt2 >>> 6) & 63) | 128);
                        i3 = i8 + 3;
                        bArr[i8 + 2] = (byte) ((charAt2 & '?') | 128);
                    }
                    i8 = i3;
                } else {
                    bArr[i8] = (byte) charAt2;
                    i8++;
                }
                i7++;
            }
            return i8;
        }

        @Override // com.google.protobuf.Utf8.Processor
        final void encodeUtf8Direct(java.lang.CharSequence charSequence, java.nio.ByteBuffer byteBuffer) {
            encodeUtf8Default(charSequence, byteBuffer);
        }

        private static int partialIsValidUtf8(byte[] bArr, int i, int i2) {
            while (i < i2 && bArr[i] >= 0) {
                i++;
            }
            if (i >= i2) {
                return 0;
            }
            return partialIsValidUtf8NonAscii(bArr, i, i2);
        }

        private static int partialIsValidUtf8NonAscii(byte[] bArr, int i, int i2) {
            while (i < i2) {
                int i3 = i + 1;
                byte b = bArr[i];
                if (b < 0) {
                    if (b < -32) {
                        if (i3 >= i2) {
                            return b;
                        }
                        if (b >= -62) {
                            i += 2;
                            if (bArr[i3] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b >= -16) {
                        if (i3 >= i2 - 2) {
                            return com.google.protobuf.Utf8.incompleteStateFor(bArr, i3, i2);
                        }
                        byte b2 = bArr[i3];
                        if (b2 <= -65 && (((b << com.google.common.base.Ascii.FS) + (b2 + com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4)) >> 30) == 0 && bArr[i + 2] <= -65) {
                            i3 = i + 4;
                            if (bArr[i + 3] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (i3 >= i2 - 1) {
                        return com.google.protobuf.Utf8.incompleteStateFor(bArr, i3, i2);
                    }
                    byte b3 = bArr[i3];
                    if (b3 <= -65 && ((b != -32 || b3 >= -96) && (b != -19 || b3 < -96))) {
                        i3 = i + 3;
                        if (bArr[i + 2] > -65) {
                        }
                    }
                    return -1;
                }
                i = i3;
            }
            return 0;
        }
    }

    static final class UnsafeProcessor extends com.google.protobuf.Utf8.Processor {
        UnsafeProcessor() {
        }

        static boolean isAvailable() {
            return com.google.protobuf.UnsafeUtil.hasUnsafeArrayOperations() && com.google.protobuf.UnsafeUtil.hasUnsafeByteBufferOperations();
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x0055, code lost:
        
            if (com.google.protobuf.UnsafeUtil.getByte(r12, r0) <= (-65)) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x0099, code lost:
        
            if (com.google.protobuf.UnsafeUtil.getByte(r12, r0) > (-65)) goto L57;
         */
        @Override // com.google.protobuf.Utf8.Processor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        final int partialIsValidUtf8(int i, byte[] bArr, int i2, int i3) {
            byte b;
            long j;
            if ((i2 | i3 | (bArr.length - i3)) < 0) {
                throw new java.lang.ArrayIndexOutOfBoundsException(java.lang.String.format("Array length=%d, index=%d, limit=%d", java.lang.Integer.valueOf(bArr.length), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3)));
            }
            long j2 = i2;
            long j3 = i3;
            if (i != 0) {
                if (j2 >= j3) {
                    return i;
                }
                byte b2 = (byte) i;
                if (b2 >= -32) {
                    if (b2 < -16) {
                        byte b3 = (byte) (~(i >> 8));
                        if (b3 == 0) {
                            long j4 = j2 + 1;
                            b3 = com.google.protobuf.UnsafeUtil.getByte(bArr, j2);
                            if (j4 >= j3) {
                                return com.google.protobuf.Utf8.incompleteStateFor(b2, b3);
                            }
                            j2 = j4;
                        }
                        if (b3 <= -65 && ((b2 != -32 || b3 >= -96) && (b2 != -19 || b3 < -96))) {
                            j = 1 + j2;
                        }
                        return -1;
                    }
                    byte b4 = (byte) (~(i >> 8));
                    if (b4 == 0) {
                        long j5 = j2 + 1;
                        b4 = com.google.protobuf.UnsafeUtil.getByte(bArr, j2);
                        if (j5 >= j3) {
                            return com.google.protobuf.Utf8.incompleteStateFor(b2, b4);
                        }
                        b = 0;
                        j2 = j5;
                    } else {
                        b = (byte) (i >> 16);
                    }
                    if (b == 0) {
                        long j6 = j2 + 1;
                        b = com.google.protobuf.UnsafeUtil.getByte(bArr, j2);
                        if (j6 >= j3) {
                            return com.google.protobuf.Utf8.incompleteStateFor(b2, b4, b);
                        }
                        j2 = j6;
                    }
                    if (b4 <= -65 && (((b2 << com.google.common.base.Ascii.FS) + (b4 + com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4)) >> 30) == 0 && b <= -65) {
                        j = 1 + j2;
                    }
                    return -1;
                    j2 = j;
                } else {
                    if (b2 < -62 || com.google.protobuf.UnsafeUtil.getByte(bArr, j2) > -65) {
                        return -1;
                    }
                    j2++;
                }
            }
            return partialIsValidUtf8(bArr, j2, (int) (j3 - j2));
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
        
            if (com.google.protobuf.UnsafeUtil.getByte(r0) <= (-65)) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0060, code lost:
        
            if (com.google.protobuf.UnsafeUtil.getByte(r0) > (-65)) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x00a2, code lost:
        
            if (com.google.protobuf.UnsafeUtil.getByte(r0) > (-65)) goto L56;
         */
        @Override // com.google.protobuf.Utf8.Processor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        final int partialIsValidUtf8Direct(int i, java.nio.ByteBuffer byteBuffer, int i2, int i3) {
            byte b;
            long j;
            if ((i2 | i3 | (byteBuffer.limit() - i3)) < 0) {
                throw new java.lang.ArrayIndexOutOfBoundsException(java.lang.String.format("buffer limit=%d, index=%d, limit=%d", java.lang.Integer.valueOf(byteBuffer.limit()), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3)));
            }
            long addressOffset = com.google.protobuf.UnsafeUtil.addressOffset(byteBuffer) + i2;
            long j2 = (i3 - i2) + addressOffset;
            if (i != 0) {
                if (addressOffset >= j2) {
                    return i;
                }
                byte b2 = (byte) i;
                if (b2 < -32) {
                    if (b2 >= -62) {
                        j = 1 + addressOffset;
                    }
                    return -1;
                }
                if (b2 < -16) {
                    byte b3 = (byte) (~(i >> 8));
                    if (b3 == 0) {
                        long j3 = addressOffset + 1;
                        b3 = com.google.protobuf.UnsafeUtil.getByte(addressOffset);
                        if (j3 >= j2) {
                            return com.google.protobuf.Utf8.incompleteStateFor(b2, b3);
                        }
                        addressOffset = j3;
                    }
                    if (b3 <= -65 && ((b2 != -32 || b3 >= -96) && (b2 != -19 || b3 < -96))) {
                        j = 1 + addressOffset;
                    }
                    return -1;
                }
                byte b4 = (byte) (~(i >> 8));
                if (b4 == 0) {
                    long j4 = addressOffset + 1;
                    b4 = com.google.protobuf.UnsafeUtil.getByte(addressOffset);
                    if (j4 >= j2) {
                        return com.google.protobuf.Utf8.incompleteStateFor(b2, b4);
                    }
                    b = 0;
                    addressOffset = j4;
                } else {
                    b = (byte) (i >> 16);
                }
                if (b == 0) {
                    long j5 = addressOffset + 1;
                    b = com.google.protobuf.UnsafeUtil.getByte(addressOffset);
                    if (j5 >= j2) {
                        return com.google.protobuf.Utf8.incompleteStateFor(b2, b4, b);
                    }
                    addressOffset = j5;
                }
                if (b4 <= -65 && (((b2 << com.google.common.base.Ascii.FS) + (b4 + com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4)) >> 30) == 0 && b <= -65) {
                    j = 1 + addressOffset;
                }
                return -1;
                addressOffset = j;
            }
            return partialIsValidUtf8(addressOffset, (int) (j2 - addressOffset));
        }

        @Override // com.google.protobuf.Utf8.Processor
        final java.lang.String decodeUtf8(byte[] bArr, int i, int i2) throws com.google.protobuf.InvalidProtocolBufferException {
            java.lang.String str = new java.lang.String(bArr, i, i2, com.google.protobuf.Internal.UTF_8);
            if (!str.contains("�") || java.util.Arrays.equals(str.getBytes(com.google.protobuf.Internal.UTF_8), java.util.Arrays.copyOfRange(bArr, i, i2 + i))) {
                return str;
            }
            throw com.google.protobuf.InvalidProtocolBufferException.invalidUtf8();
        }

        @Override // com.google.protobuf.Utf8.Processor
        final java.lang.String decodeUtf8Direct(java.nio.ByteBuffer byteBuffer, int i, int i2) throws com.google.protobuf.InvalidProtocolBufferException {
            if ((i | i2 | ((byteBuffer.limit() - i) - i2)) < 0) {
                throw new java.lang.ArrayIndexOutOfBoundsException(java.lang.String.format("buffer limit=%d, index=%d, limit=%d", java.lang.Integer.valueOf(byteBuffer.limit()), java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)));
            }
            long addressOffset = com.google.protobuf.UnsafeUtil.addressOffset(byteBuffer) + i;
            long j = i2 + addressOffset;
            char[] cArr = new char[i2];
            int i3 = 0;
            while (addressOffset < j) {
                byte b = com.google.protobuf.UnsafeUtil.getByte(addressOffset);
                if (!com.google.protobuf.Utf8.DecodeUtil.isOneByte(b)) {
                    break;
                }
                addressOffset++;
                com.google.protobuf.Utf8.DecodeUtil.handleOneByte(b, cArr, i3);
                i3++;
            }
            int i4 = i3;
            while (addressOffset < j) {
                long j2 = addressOffset + 1;
                byte b2 = com.google.protobuf.UnsafeUtil.getByte(addressOffset);
                if (com.google.protobuf.Utf8.DecodeUtil.isOneByte(b2)) {
                    com.google.protobuf.Utf8.DecodeUtil.handleOneByte(b2, cArr, i4);
                    i4++;
                    addressOffset = j2;
                    while (addressOffset < j) {
                        byte b3 = com.google.protobuf.UnsafeUtil.getByte(addressOffset);
                        if (com.google.protobuf.Utf8.DecodeUtil.isOneByte(b3)) {
                            addressOffset++;
                            com.google.protobuf.Utf8.DecodeUtil.handleOneByte(b3, cArr, i4);
                            i4++;
                        }
                    }
                } else if (com.google.protobuf.Utf8.DecodeUtil.isTwoBytes(b2)) {
                    if (j2 >= j) {
                        throw com.google.protobuf.InvalidProtocolBufferException.invalidUtf8();
                    }
                    addressOffset += 2;
                    com.google.protobuf.Utf8.DecodeUtil.handleTwoBytes(b2, com.google.protobuf.UnsafeUtil.getByte(j2), cArr, i4);
                    i4++;
                } else if (com.google.protobuf.Utf8.DecodeUtil.isThreeBytes(b2)) {
                    if (j2 >= j - 1) {
                        throw com.google.protobuf.InvalidProtocolBufferException.invalidUtf8();
                    }
                    com.google.protobuf.Utf8.DecodeUtil.handleThreeBytes(b2, com.google.protobuf.UnsafeUtil.getByte(j2), com.google.protobuf.UnsafeUtil.getByte(addressOffset + 2), cArr, i4);
                    i4++;
                    addressOffset = 3 + addressOffset;
                } else {
                    if (j2 >= j - 2) {
                        throw com.google.protobuf.InvalidProtocolBufferException.invalidUtf8();
                    }
                    com.google.protobuf.Utf8.DecodeUtil.handleFourBytes(b2, com.google.protobuf.UnsafeUtil.getByte(j2), com.google.protobuf.UnsafeUtil.getByte(2 + addressOffset), com.google.protobuf.UnsafeUtil.getByte(addressOffset + 3), cArr, i4);
                    i4 += 2;
                    addressOffset += 4;
                }
            }
            return new java.lang.String(cArr, 0, i4);
        }

        @Override // com.google.protobuf.Utf8.Processor
        final int encodeUtf8(java.lang.CharSequence charSequence, byte[] bArr, int i, int i2) {
            long j;
            java.lang.String str;
            java.lang.String str2;
            int i3;
            char charAt;
            long j2 = i;
            long j3 = i2 + j2;
            int length = charSequence.length();
            java.lang.String str3 = " at index ";
            java.lang.String str4 = "Failed writing ";
            if (length > i2 || bArr.length - i2 < i) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed writing ");
                sb.append(charSequence.charAt(length - 1));
                sb.append(" at index ");
                sb.append(i + i2);
                throw new java.lang.ArrayIndexOutOfBoundsException(sb.toString());
            }
            int i4 = 0;
            while (true) {
                j = 1;
                if (i4 >= length || (charAt = charSequence.charAt(i4)) >= 128) {
                    break;
                }
                com.google.protobuf.UnsafeUtil.putByte(bArr, j2, (byte) charAt);
                i4++;
                j2++;
            }
            if (i4 == length) {
                return (int) j2;
            }
            while (i4 < length) {
                char charAt2 = charSequence.charAt(i4);
                if (charAt2 < 128 && j2 < j3) {
                    com.google.protobuf.UnsafeUtil.putByte(bArr, j2, (byte) charAt2);
                    j2 += j;
                    str = str3;
                    str2 = str4;
                } else if (charAt2 < 2048 && j2 <= j3 - 2) {
                    com.google.protobuf.UnsafeUtil.putByte(bArr, j2, (byte) ((charAt2 >>> 6) | 960));
                    com.google.protobuf.UnsafeUtil.putByte(bArr, j2 + j, (byte) ((charAt2 & '?') | 128));
                    str = str3;
                    str2 = str4;
                    j2 = 2 + j2;
                } else {
                    if ((charAt2 >= 55296 && 57343 >= charAt2) || j2 > j3 - 3) {
                        str = str3;
                        str2 = str4;
                        if (j2 <= j3 - 4) {
                            int i5 = i4 + 1;
                            if (i5 != length) {
                                char charAt3 = charSequence.charAt(i5);
                                if (java.lang.Character.isSurrogatePair(charAt2, charAt3)) {
                                    int codePoint = java.lang.Character.toCodePoint(charAt2, charAt3);
                                    com.google.protobuf.UnsafeUtil.putByte(bArr, j2, (byte) ((codePoint >>> 18) | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE));
                                    com.google.protobuf.UnsafeUtil.putByte(bArr, j2 + j, (byte) (((codePoint >>> 12) & 63) | 128));
                                    com.google.protobuf.UnsafeUtil.putByte(bArr, j2 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                    com.google.protobuf.UnsafeUtil.putByte(bArr, j2 + 3, (byte) ((codePoint & 63) | 128));
                                    j2 = 4 + j2;
                                    i4 = i5;
                                } else {
                                    i4 = i5;
                                }
                            }
                            throw new com.google.protobuf.Utf8.UnpairedSurrogateException(i4 - 1, length);
                        }
                        if (55296 <= charAt2 && charAt2 <= 57343 && ((i3 = i4 + 1) == length || !java.lang.Character.isSurrogatePair(charAt2, charSequence.charAt(i3)))) {
                            throw new com.google.protobuf.Utf8.UnpairedSurrogateException(i4, length);
                        }
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(str2);
                        sb2.append(charAt2);
                        sb2.append(str);
                        sb2.append(j2);
                        throw new java.lang.ArrayIndexOutOfBoundsException(sb2.toString());
                    }
                    com.google.protobuf.UnsafeUtil.putByte(bArr, j2, (byte) ((charAt2 >>> '\f') | androidx.window.core.layout.WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND));
                    str = str3;
                    str2 = str4;
                    com.google.protobuf.UnsafeUtil.putByte(bArr, j2 + j, (byte) (((charAt2 >>> 6) & 63) | 128));
                    com.google.protobuf.UnsafeUtil.putByte(bArr, j2 + 2, (byte) ((charAt2 & '?') | 128));
                    j2 += 3;
                }
                i4++;
                str3 = str;
                str4 = str2;
                j = 1;
            }
            return (int) j2;
        }

        @Override // com.google.protobuf.Utf8.Processor
        final void encodeUtf8Direct(java.lang.CharSequence charSequence, java.nio.ByteBuffer byteBuffer) {
            long j;
            char c;
            long j2;
            char c2;
            int i;
            char charAt;
            long addressOffset = com.google.protobuf.UnsafeUtil.addressOffset(byteBuffer);
            long position = byteBuffer.position() + addressOffset;
            long limit = byteBuffer.limit() + addressOffset;
            int length = charSequence.length();
            if (length > limit - position) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed writing ");
                sb.append(charSequence.charAt(length - 1));
                sb.append(" at index ");
                sb.append(byteBuffer.limit());
                throw new java.lang.ArrayIndexOutOfBoundsException(sb.toString());
            }
            int i2 = 0;
            while (true) {
                j = 1;
                c = 128;
                if (i2 >= length || (charAt = charSequence.charAt(i2)) >= 128) {
                    break;
                }
                com.google.protobuf.UnsafeUtil.putByte(position, (byte) charAt);
                i2++;
                position++;
            }
            if (i2 == length) {
                com.google.protobuf.Java8Compatibility.position(byteBuffer, (int) (position - addressOffset));
                return;
            }
            while (i2 < length) {
                char charAt2 = charSequence.charAt(i2);
                if (charAt2 < c && position < limit) {
                    com.google.protobuf.UnsafeUtil.putByte(position, (byte) charAt2);
                    position += j;
                    j2 = limit;
                    c2 = c;
                } else if (charAt2 < 2048 && position <= limit - 2) {
                    com.google.protobuf.UnsafeUtil.putByte(position, (byte) ((charAt2 >>> 6) | 960));
                    com.google.protobuf.UnsafeUtil.putByte(position + 1, (byte) ((charAt2 & '?') | c));
                    j2 = limit;
                    c2 = c;
                    position += 2;
                } else {
                    if ((charAt2 >= 55296 && 57343 >= charAt2) || position > limit - 3) {
                        if (position <= limit - 4) {
                            int i3 = i2 + 1;
                            if (i3 != length) {
                                char charAt3 = charSequence.charAt(i3);
                                if (java.lang.Character.isSurrogatePair(charAt2, charAt3)) {
                                    int codePoint = java.lang.Character.toCodePoint(charAt2, charAt3);
                                    com.google.protobuf.UnsafeUtil.putByte(position, (byte) ((codePoint >>> 18) | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE));
                                    j2 = limit;
                                    com.google.protobuf.UnsafeUtil.putByte(position + 1, (byte) (((codePoint >>> 12) & 63) | 128));
                                    com.google.protobuf.UnsafeUtil.putByte(position + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                    c2 = 128;
                                    com.google.protobuf.UnsafeUtil.putByte(position + 3, (byte) ((codePoint & 63) | 128));
                                    i2 = i3;
                                    position += 4;
                                } else {
                                    i2 = i3;
                                }
                            }
                            throw new com.google.protobuf.Utf8.UnpairedSurrogateException(i2 - 1, length);
                        }
                        if (55296 > charAt2 || charAt2 > 57343 || ((i = i2 + 1) != length && java.lang.Character.isSurrogatePair(charAt2, charSequence.charAt(i)))) {
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Failed writing ");
                            sb2.append(charAt2);
                            sb2.append(" at index ");
                            sb2.append(position);
                            throw new java.lang.ArrayIndexOutOfBoundsException(sb2.toString());
                        }
                        throw new com.google.protobuf.Utf8.UnpairedSurrogateException(i2, length);
                    }
                    com.google.protobuf.UnsafeUtil.putByte(position, (byte) ((charAt2 >>> '\f') | androidx.window.core.layout.WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND));
                    com.google.protobuf.UnsafeUtil.putByte(position + 1, (byte) (((charAt2 >>> 6) & 63) | c));
                    com.google.protobuf.UnsafeUtil.putByte(position + 2, (byte) ((charAt2 & '?') | 128));
                    j2 = limit;
                    position += 3;
                    c2 = 128;
                }
                i2++;
                c = c2;
                limit = j2;
                j = 1;
            }
            com.google.protobuf.Java8Compatibility.position(byteBuffer, (int) (position - addressOffset));
        }

        private static int unsafeEstimateConsecutiveAscii(byte[] bArr, long j, int i) {
            int i2 = 0;
            if (i < 16) {
                return 0;
            }
            int i3 = (int) j;
            while (i2 < 8 - (i3 & 7)) {
                if (com.google.protobuf.UnsafeUtil.getByte(bArr, j) < 0) {
                    return i2;
                }
                i2++;
                j++;
            }
            while (true) {
                int i4 = i2 + 8;
                if (i4 > i || (com.google.protobuf.UnsafeUtil.getLong((java.lang.Object) bArr, com.google.protobuf.UnsafeUtil.BYTE_ARRAY_BASE_OFFSET + j) & (-9187201950435737472L)) != 0) {
                    break;
                }
                j += 8;
                i2 = i4;
            }
            while (i2 < i) {
                if (com.google.protobuf.UnsafeUtil.getByte(bArr, j) < 0) {
                    return i2;
                }
                i2++;
                j++;
            }
            return i;
        }

        private static int unsafeEstimateConsecutiveAscii(long j, int i) {
            if (i < 16) {
                return 0;
            }
            int i2 = (int) ((-j) & 7);
            int i3 = i2;
            while (i3 > 0) {
                if (com.google.protobuf.UnsafeUtil.getByte(j) < 0) {
                    return i2 - i3;
                }
                i3--;
                j++;
            }
            int i4 = i - i2;
            while (i4 >= 8 && (com.google.protobuf.UnsafeUtil.getLong(j) & (-9187201950435737472L)) == 0) {
                j += 8;
                i4 -= 8;
            }
            return i - i4;
        }

        /* JADX WARN: Code restructure failed: missing block: B:67:0x0037, code lost:
        
            return -1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static int partialIsValidUtf8(byte[] bArr, long j, int i) {
            long j2;
            int unsafeEstimateConsecutiveAscii = unsafeEstimateConsecutiveAscii(bArr, j, i);
            int i2 = i - unsafeEstimateConsecutiveAscii;
            long j3 = j + unsafeEstimateConsecutiveAscii;
            while (true) {
                byte b = 0;
                while (true) {
                    if (i2 <= 0) {
                        break;
                    }
                    long j4 = j3 + 1;
                    b = com.google.protobuf.UnsafeUtil.getByte(bArr, j3);
                    if (b < 0) {
                        j3 = j4;
                        break;
                    }
                    i2--;
                    j3 = j4;
                }
                if (i2 == 0) {
                    return 0;
                }
                int i3 = i2 - 1;
                if (b >= -32) {
                    if (b >= -16) {
                        if (i3 < 3) {
                            return unsafeIncompleteStateFor(bArr, b, j3, i3);
                        }
                        i2 -= 4;
                        byte b2 = com.google.protobuf.UnsafeUtil.getByte(bArr, j3);
                        if (b2 > -65 || (((b << com.google.common.base.Ascii.FS) + (b2 + com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4)) >> 30) != 0 || com.google.protobuf.UnsafeUtil.getByte(bArr, 1 + j3) > -65) {
                            break;
                        }
                        j2 = 3 + j3;
                        if (com.google.protobuf.UnsafeUtil.getByte(bArr, j3 + 2) > -65) {
                            break;
                        }
                    } else {
                        if (i3 < 2) {
                            return unsafeIncompleteStateFor(bArr, b, j3, i3);
                        }
                        i2 -= 3;
                        byte b3 = com.google.protobuf.UnsafeUtil.getByte(bArr, j3);
                        if (b3 > -65 || ((b == -32 && b3 < -96) || (b == -19 && b3 >= -96))) {
                            break;
                        }
                        j2 = j3 + 2;
                        if (com.google.protobuf.UnsafeUtil.getByte(bArr, j3 + 1) > -65) {
                            break;
                        }
                    }
                    j3 = j2;
                } else {
                    if (i3 == 0) {
                        return b;
                    }
                    i2 -= 2;
                    if (b < -62 || com.google.protobuf.UnsafeUtil.getByte(bArr, j3) > -65) {
                        break;
                    }
                    j3++;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:67:0x0037, code lost:
        
            return -1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static int partialIsValidUtf8(long j, int i) {
            long j2;
            int unsafeEstimateConsecutiveAscii = unsafeEstimateConsecutiveAscii(j, i);
            long j3 = j + unsafeEstimateConsecutiveAscii;
            int i2 = i - unsafeEstimateConsecutiveAscii;
            while (true) {
                byte b = 0;
                while (true) {
                    if (i2 <= 0) {
                        break;
                    }
                    long j4 = j3 + 1;
                    b = com.google.protobuf.UnsafeUtil.getByte(j3);
                    if (b < 0) {
                        j3 = j4;
                        break;
                    }
                    i2--;
                    j3 = j4;
                }
                if (i2 == 0) {
                    return 0;
                }
                int i3 = i2 - 1;
                if (b >= -32) {
                    if (b >= -16) {
                        if (i3 < 3) {
                            return unsafeIncompleteStateFor(j3, b, i3);
                        }
                        i2 -= 4;
                        byte b2 = com.google.protobuf.UnsafeUtil.getByte(j3);
                        if (b2 > -65 || (((b << com.google.common.base.Ascii.FS) + (b2 + com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4)) >> 30) != 0 || com.google.protobuf.UnsafeUtil.getByte(1 + j3) > -65) {
                            break;
                        }
                        j2 = 3 + j3;
                        if (com.google.protobuf.UnsafeUtil.getByte(j3 + 2) > -65) {
                            break;
                        }
                    } else {
                        if (i3 < 2) {
                            return unsafeIncompleteStateFor(j3, b, i3);
                        }
                        i2 -= 3;
                        byte b3 = com.google.protobuf.UnsafeUtil.getByte(j3);
                        if (b3 > -65 || ((b == -32 && b3 < -96) || (b == -19 && b3 >= -96))) {
                            break;
                        }
                        j2 = j3 + 2;
                        if (com.google.protobuf.UnsafeUtil.getByte(j3 + 1) > -65) {
                            break;
                        }
                    }
                    j3 = j2;
                } else {
                    if (i3 == 0) {
                        return b;
                    }
                    i2 -= 2;
                    if (b < -62 || com.google.protobuf.UnsafeUtil.getByte(j3) > -65) {
                        break;
                    }
                    j3++;
                }
            }
        }

        private static int unsafeIncompleteStateFor(byte[] bArr, int i, long j, int i2) {
            if (i2 == 0) {
                return com.google.protobuf.Utf8.incompleteStateFor(i);
            }
            if (i2 == 1) {
                return com.google.protobuf.Utf8.incompleteStateFor(i, com.google.protobuf.UnsafeUtil.getByte(bArr, j));
            }
            if (i2 == 2) {
                return com.google.protobuf.Utf8.incompleteStateFor(i, com.google.protobuf.UnsafeUtil.getByte(bArr, j), com.google.protobuf.UnsafeUtil.getByte(bArr, j + 1));
            }
            throw new java.lang.AssertionError();
        }

        private static int unsafeIncompleteStateFor(long j, int i, int i2) {
            if (i2 == 0) {
                return com.google.protobuf.Utf8.incompleteStateFor(i);
            }
            if (i2 == 1) {
                return com.google.protobuf.Utf8.incompleteStateFor(i, com.google.protobuf.UnsafeUtil.getByte(j));
            }
            if (i2 == 2) {
                return com.google.protobuf.Utf8.incompleteStateFor(i, com.google.protobuf.UnsafeUtil.getByte(j), com.google.protobuf.UnsafeUtil.getByte(j + 1));
            }
            throw new java.lang.AssertionError();
        }
    }

    static class DecodeUtil {
        private static char highSurrogate(int i) {
            return (char) ((i >>> 10) + 55232);
        }

        private static boolean isNotTrailingByte(byte b) {
            return b > -65;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isOneByte(byte b) {
            return b >= 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isThreeBytes(byte b) {
            return b < -16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isTwoBytes(byte b) {
            return b < -32;
        }

        private static char lowSurrogate(int i) {
            return (char) ((i & 1023) + 56320);
        }

        private static int trailingByteValue(byte b) {
            return b & 63;
        }

        private DecodeUtil() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleOneByte(byte b, char[] cArr, int i) {
            cArr[i] = (char) b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleTwoBytes(byte b, byte b2, char[] cArr, int i) throws com.google.protobuf.InvalidProtocolBufferException {
            if (b < -62 || isNotTrailingByte(b2)) {
                throw com.google.protobuf.InvalidProtocolBufferException.invalidUtf8();
            }
            cArr[i] = (char) (((b & com.google.common.base.Ascii.US) << 6) | trailingByteValue(b2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleThreeBytes(byte b, byte b2, byte b3, char[] cArr, int i) throws com.google.protobuf.InvalidProtocolBufferException {
            if (isNotTrailingByte(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || isNotTrailingByte(b3)))) {
                throw com.google.protobuf.InvalidProtocolBufferException.invalidUtf8();
            }
            cArr[i] = (char) (((b & com.google.common.base.Ascii.SI) << 12) | (trailingByteValue(b2) << 6) | trailingByteValue(b3));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleFourBytes(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws com.google.protobuf.InvalidProtocolBufferException {
            if (isNotTrailingByte(b2) || (((b << com.google.common.base.Ascii.FS) + (b2 + com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4)) >> 30) != 0 || isNotTrailingByte(b3) || isNotTrailingByte(b4)) {
                throw com.google.protobuf.InvalidProtocolBufferException.invalidUtf8();
            }
            int trailingByteValue = ((b & 7) << 18) | (trailingByteValue(b2) << 12) | (trailingByteValue(b3) << 6) | trailingByteValue(b4);
            cArr[i] = highSurrogate(trailingByteValue);
            cArr[i + 1] = lowSurrogate(trailingByteValue);
        }
    }

    private Utf8() {
    }
}
