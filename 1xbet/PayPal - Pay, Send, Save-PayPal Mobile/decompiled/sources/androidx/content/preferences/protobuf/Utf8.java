package androidx.content.preferences.protobuf;

/* loaded from: classes3.dex */
final class Utf8 {
    private static final androidx.datastore.preferences.protobuf.Utf8.Processor getHighSpeedVideoFpsRangesFor;

    static /* synthetic */ int Camera2StreamConfigurationMap(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    static /* synthetic */ int getHighResolutionOutputSizeshNQ4ISI(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    static /* synthetic */ int getHighSpeedVideoFpsRangesFor(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    static {
        androidx.datastore.preferences.protobuf.Utf8.Processor safeProcessor;
        if (androidx.datastore.preferences.protobuf.Utf8.UnsafeProcessor.getHighSpeedVideoSizes() && !androidx.content.preferences.protobuf.Android.getHighSpeedVideoFpsRangesFor()) {
            safeProcessor = new androidx.datastore.preferences.protobuf.Utf8.UnsafeProcessor();
        } else {
            safeProcessor = new androidx.datastore.preferences.protobuf.Utf8.SafeProcessor();
        }
        getHighSpeedVideoFpsRangesFor = safeProcessor;
    }

    static boolean Camera2StreamConfigurationMap(byte[] bArr) {
        return getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes(0, bArr, 0, bArr.length) == 0;
    }

    static boolean getHighSpeedVideoFpsRangesFor(byte[] bArr, int i, int i2) {
        return getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes(0, bArr, i, i2) == 0;
    }

    static int Camera2StreamConfigurationMap(int i, byte[] bArr, int i2, int i3) {
        return getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes(i, bArr, i2, i3);
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

    static int getHighResolutionOutputSizeshNQ4ISI(java.lang.String str) {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && str.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = str.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = str.length();
                while (i2 < length2) {
                    char charAt2 = str.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (java.lang.Character.codePointAt(str, i2) < 65536) {
                                throw new androidx.datastore.preferences.protobuf.Utf8.UnpairedSurrogateException(i2, length2);
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

    static int Camera2StreamConfigurationMap(java.lang.String str, byte[] bArr, int i, int i2) {
        return getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap(str, bArr, i, i2);
    }

    static boolean getHighResolutionOutputSizeshNQ4ISI(java.nio.ByteBuffer byteBuffer) {
        return getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor(0, byteBuffer, byteBuffer.position(), byteBuffer.remaining()) == 0;
    }

    static int getHighSpeedVideoFpsRanges(int i, java.nio.ByteBuffer byteBuffer, int i2, int i3) {
        return getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor(i, byteBuffer, i2, i3);
    }

    static java.lang.String getHighSpeedVideoFpsRanges(java.nio.ByteBuffer byteBuffer, int i, int i2) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        androidx.datastore.preferences.protobuf.Utf8.Processor processor = getHighSpeedVideoFpsRangesFor;
        if (byteBuffer.hasArray()) {
            return processor.getHighSpeedVideoFpsRanges(byteBuffer.array(), byteBuffer.arrayOffset() + i, i2);
        }
        if (byteBuffer.isDirect()) {
            return processor.getHighResolutionOutputSizeshNQ4ISI(byteBuffer, i, i2);
        }
        return androidx.datastore.preferences.protobuf.Utf8.Processor.Camera2StreamConfigurationMap(byteBuffer, i, i2);
    }

    static java.lang.String getHighSpeedVideoFpsRanges(byte[] bArr, int i, int i2) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges(bArr, i, i2);
    }

    static void Camera2StreamConfigurationMap(java.lang.String str, java.nio.ByteBuffer byteBuffer) {
        androidx.datastore.preferences.protobuf.Utf8.Processor processor = getHighSpeedVideoFpsRangesFor;
        if (byteBuffer.hasArray()) {
            int arrayOffset = byteBuffer.arrayOffset();
            androidx.content.preferences.protobuf.Java8Compatibility.getHighSpeedVideoFpsRanges(byteBuffer, processor.Camera2StreamConfigurationMap(str, byteBuffer.array(), byteBuffer.position() + arrayOffset, byteBuffer.remaining()) - arrayOffset);
        } else if (byteBuffer.isDirect()) {
            processor.getHighSpeedVideoFpsRangesFor(str, byteBuffer);
        } else {
            androidx.datastore.preferences.protobuf.Utf8.Processor.getHighResolutionOutputSizeshNQ4ISI(str, byteBuffer);
        }
    }

    static abstract class Processor {
        abstract int Camera2StreamConfigurationMap(java.lang.String str, byte[] bArr, int i, int i2);

        abstract int getHighResolutionOutputSizeshNQ4ISI(int i, java.nio.ByteBuffer byteBuffer, int i2, int i3);

        abstract java.lang.String getHighResolutionOutputSizeshNQ4ISI(java.nio.ByteBuffer byteBuffer, int i, int i2) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException;

        abstract java.lang.String getHighSpeedVideoFpsRanges(byte[] bArr, int i, int i2) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException;

        abstract void getHighSpeedVideoFpsRangesFor(java.lang.String str, java.nio.ByteBuffer byteBuffer);

        abstract int getHighSpeedVideoSizes(int i, byte[] bArr, int i2, int i3);

        Processor() {
        }

        final int getHighSpeedVideoFpsRangesFor(int i, java.nio.ByteBuffer byteBuffer, int i2, int i3) {
            if (byteBuffer.hasArray()) {
                int arrayOffset = byteBuffer.arrayOffset();
                return getHighSpeedVideoSizes(i, byteBuffer.array(), i2 + arrayOffset, arrayOffset + i3);
            }
            if (byteBuffer.isDirect()) {
                return getHighResolutionOutputSizeshNQ4ISI(i, byteBuffer, i2, i3);
            }
            return Camera2StreamConfigurationMap(i, byteBuffer, i2, i3);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
        
            if (r7.get(r8) <= (-65)) goto L53;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x004a, code lost:
        
            if (r7.get(r8) > (-65)) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x008d, code lost:
        
            if (r7.get(r8) > (-65)) goto L54;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        static int Camera2StreamConfigurationMap(int i, java.nio.ByteBuffer byteBuffer, int i2, int i3) {
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
                            return androidx.content.preferences.protobuf.Utf8.getHighSpeedVideoFpsRangesFor(b2, b4);
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
                        return androidx.content.preferences.protobuf.Utf8.getHighSpeedVideoFpsRangesFor(b2, b5);
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
                        return androidx.content.preferences.protobuf.Utf8.getHighResolutionOutputSizeshNQ4ISI(b2, b5, b6);
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
            return getHighSpeedVideoFpsRangesFor(byteBuffer, i2, i3);
        }

        private static int getHighSpeedVideoFpsRangesFor(java.nio.ByteBuffer byteBuffer, int i, int i2) {
            int highResolutionOutputSizeshNQ4ISI = i + androidx.content.preferences.protobuf.Utf8.getHighResolutionOutputSizeshNQ4ISI(byteBuffer, i, i2);
            while (highResolutionOutputSizeshNQ4ISI < i2) {
                int i3 = highResolutionOutputSizeshNQ4ISI + 1;
                byte b = byteBuffer.get(highResolutionOutputSizeshNQ4ISI);
                if (b < 0) {
                    if (b < -32) {
                        if (i3 >= i2) {
                            return b;
                        }
                        if (b < -62 || byteBuffer.get(i3) > -65) {
                            return -1;
                        }
                        highResolutionOutputSizeshNQ4ISI += 2;
                    } else {
                        if (b >= -16) {
                            if (i3 >= i2 - 2) {
                                return androidx.content.preferences.protobuf.Utf8.getHighResolutionOutputSizeshNQ4ISI(byteBuffer, b, i3, i2 - i3);
                            }
                            byte b2 = byteBuffer.get(i3);
                            if (b2 <= -65 && (((b << com.google.common.base.Ascii.FS) + (b2 + com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4)) >> 30) == 0 && byteBuffer.get(highResolutionOutputSizeshNQ4ISI + 2) <= -65) {
                                i3 = highResolutionOutputSizeshNQ4ISI + 4;
                                if (byteBuffer.get(highResolutionOutputSizeshNQ4ISI + 3) > -65) {
                                }
                            }
                            return -1;
                        }
                        if (i3 >= i2 - 1) {
                            return androidx.content.preferences.protobuf.Utf8.getHighResolutionOutputSizeshNQ4ISI(byteBuffer, b, i3, i2 - i3);
                        }
                        byte b3 = byteBuffer.get(i3);
                        if (b3 > -65 || ((b == -32 && b3 < -96) || ((b == -19 && b3 >= -96) || byteBuffer.get(highResolutionOutputSizeshNQ4ISI + 2) > -65))) {
                            return -1;
                        }
                        highResolutionOutputSizeshNQ4ISI += 3;
                    }
                }
                highResolutionOutputSizeshNQ4ISI = i3;
            }
            return 0;
        }

        static java.lang.String Camera2StreamConfigurationMap(java.nio.ByteBuffer byteBuffer, int i, int i2) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
            if ((i | i2 | ((byteBuffer.limit() - i) - i2)) < 0) {
                throw new java.lang.ArrayIndexOutOfBoundsException(java.lang.String.format("buffer limit=%d, index=%d, limit=%d", java.lang.Integer.valueOf(byteBuffer.limit()), java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)));
            }
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte b = byteBuffer.get(i);
                if (!androidx.datastore.preferences.protobuf.Utf8.DecodeUtil.getHighSpeedVideoFpsRangesFor(b)) {
                    break;
                }
                i++;
                androidx.datastore.preferences.protobuf.Utf8.DecodeUtil.Camera2StreamConfigurationMap(b, cArr, i4);
                i4++;
            }
            int i5 = i4;
            while (i < i3) {
                int i6 = i + 1;
                byte b2 = byteBuffer.get(i);
                if (androidx.datastore.preferences.protobuf.Utf8.DecodeUtil.getHighSpeedVideoFpsRangesFor(b2)) {
                    androidx.datastore.preferences.protobuf.Utf8.DecodeUtil.Camera2StreamConfigurationMap(b2, cArr, i5);
                    i5++;
                    i = i6;
                    while (i < i3) {
                        byte b3 = byteBuffer.get(i);
                        if (androidx.datastore.preferences.protobuf.Utf8.DecodeUtil.getHighSpeedVideoFpsRangesFor(b3)) {
                            i++;
                            androidx.datastore.preferences.protobuf.Utf8.DecodeUtil.Camera2StreamConfigurationMap(b3, cArr, i5);
                            i5++;
                        }
                    }
                } else if (androidx.datastore.preferences.protobuf.Utf8.DecodeUtil.getHighSpeedVideoSizes(b2)) {
                    if (i6 >= i3) {
                        throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighSpeedVideoSizes();
                    }
                    i += 2;
                    androidx.datastore.preferences.protobuf.Utf8.DecodeUtil.getHighResolutionOutputSizeshNQ4ISI(b2, byteBuffer.get(i6), cArr, i5);
                    i5++;
                } else if (androidx.datastore.preferences.protobuf.Utf8.DecodeUtil.getHighSpeedVideoFpsRanges(b2)) {
                    if (i6 >= i3 - 1) {
                        throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighSpeedVideoSizes();
                    }
                    androidx.datastore.preferences.protobuf.Utf8.DecodeUtil.getHighResolutionOutputSizeshNQ4ISI(b2, byteBuffer.get(i6), byteBuffer.get(i + 2), cArr, i5);
                    i5++;
                    i += 3;
                } else {
                    if (i6 >= i3 - 2) {
                        throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighSpeedVideoSizes();
                    }
                    androidx.datastore.preferences.protobuf.Utf8.DecodeUtil.getHighSpeedVideoFpsRangesFor(b2, byteBuffer.get(i6), byteBuffer.get(i + 2), byteBuffer.get(i + 3), cArr, i5);
                    i5 += 2;
                    i += 4;
                }
            }
            return new java.lang.String(cArr, 0, i5);
        }

        static void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, java.nio.ByteBuffer byteBuffer) {
            int i;
            int i2;
            int length = str.length();
            int position = byteBuffer.position();
            int i3 = 0;
            while (i3 < length) {
                try {
                    char charAt = str.charAt(i3);
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
                    sb.append(str.charAt(i3));
                    sb.append(" at index ");
                    sb.append(position2 + max);
                    throw new java.lang.ArrayIndexOutOfBoundsException(sb.toString());
                }
            }
            if (i3 == length) {
                androidx.content.preferences.protobuf.Java8Compatibility.getHighSpeedVideoFpsRanges(byteBuffer, position + i3);
                return;
            }
            int i4 = position + i3;
            while (i3 < length) {
                char charAt2 = str.charAt(i3);
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
                        sb2.append(str.charAt(i3));
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
                            char charAt3 = str.charAt(i7);
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
                                    sb22.append(str.charAt(i3));
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
                                    sb222.append(str.charAt(i3));
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
                    throw new androidx.datastore.preferences.protobuf.Utf8.UnpairedSurrogateException(i3, length);
                }
                i3++;
                i4++;
            }
            androidx.content.preferences.protobuf.Java8Compatibility.getHighSpeedVideoFpsRanges(byteBuffer, i4);
        }
    }

    static final class SafeProcessor extends androidx.datastore.preferences.protobuf.Utf8.Processor {
        SafeProcessor() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
        
            if (r13[r14] <= (-65)) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0046, code lost:
        
            if (r13[r14] > (-65)) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x0081, code lost:
        
            if (r13[r14] > (-65)) goto L49;
         */
        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        final int getHighSpeedVideoSizes(int i, byte[] bArr, int i2, int i3) {
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
                            return androidx.content.preferences.protobuf.Utf8.getHighSpeedVideoFpsRangesFor(b2, b4);
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
                        return androidx.content.preferences.protobuf.Utf8.getHighSpeedVideoFpsRangesFor(b2, b5);
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
                        return androidx.content.preferences.protobuf.Utf8.getHighResolutionOutputSizeshNQ4ISI(b2, b5, b6);
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
            while (i2 < i3 && bArr[i2] >= 0) {
                i2++;
            }
            if (i2 >= i3) {
                return 0;
            }
            while (i2 < i3) {
                int i8 = i2 + 1;
                byte b7 = bArr[i2];
                if (b7 < 0) {
                    if (b7 < -32) {
                        if (i8 >= i3) {
                            return b7;
                        }
                        if (b7 >= -62) {
                            i2 += 2;
                            if (bArr[i8] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b7 >= -16) {
                        if (i8 >= i3 - 2) {
                            return androidx.content.preferences.protobuf.Utf8.getHighResolutionOutputSizeshNQ4ISI(bArr, i8, i3);
                        }
                        byte b8 = bArr[i8];
                        if (b8 <= -65 && (((b7 << com.google.common.base.Ascii.FS) + (b8 + com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4)) >> 30) == 0 && bArr[i2 + 2] <= -65) {
                            i8 = i2 + 4;
                            if (bArr[i2 + 3] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (i8 >= i3 - 1) {
                        return androidx.content.preferences.protobuf.Utf8.getHighResolutionOutputSizeshNQ4ISI(bArr, i8, i3);
                    }
                    byte b9 = bArr[i8];
                    if (b9 <= -65 && ((b7 != -32 || b9 >= -96) && (b7 != -19 || b9 < -96))) {
                        i8 = i2 + 3;
                        if (bArr[i2 + 2] > -65) {
                        }
                    }
                    return -1;
                }
                i2 = i8;
            }
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        final int getHighResolutionOutputSizeshNQ4ISI(int i, java.nio.ByteBuffer byteBuffer, int i2, int i3) {
            return Camera2StreamConfigurationMap(i, byteBuffer, i2, i3);
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        final java.lang.String getHighSpeedVideoFpsRanges(byte[] bArr, int i, int i2) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
            if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
                throw new java.lang.ArrayIndexOutOfBoundsException(java.lang.String.format("buffer length=%d, index=%d, size=%d", java.lang.Integer.valueOf(bArr.length), java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)));
            }
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte b = bArr[i];
                if (!androidx.datastore.preferences.protobuf.Utf8.DecodeUtil.getHighSpeedVideoFpsRangesFor(b)) {
                    break;
                }
                i++;
                androidx.datastore.preferences.protobuf.Utf8.DecodeUtil.Camera2StreamConfigurationMap(b, cArr, i4);
                i4++;
            }
            int i5 = i4;
            while (i < i3) {
                int i6 = i + 1;
                byte b2 = bArr[i];
                if (androidx.datastore.preferences.protobuf.Utf8.DecodeUtil.getHighSpeedVideoFpsRangesFor(b2)) {
                    androidx.datastore.preferences.protobuf.Utf8.DecodeUtil.Camera2StreamConfigurationMap(b2, cArr, i5);
                    i5++;
                    i = i6;
                    while (i < i3) {
                        byte b3 = bArr[i];
                        if (androidx.datastore.preferences.protobuf.Utf8.DecodeUtil.getHighSpeedVideoFpsRangesFor(b3)) {
                            i++;
                            androidx.datastore.preferences.protobuf.Utf8.DecodeUtil.Camera2StreamConfigurationMap(b3, cArr, i5);
                            i5++;
                        }
                    }
                } else if (androidx.datastore.preferences.protobuf.Utf8.DecodeUtil.getHighSpeedVideoSizes(b2)) {
                    if (i6 >= i3) {
                        throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighSpeedVideoSizes();
                    }
                    i += 2;
                    androidx.datastore.preferences.protobuf.Utf8.DecodeUtil.getHighResolutionOutputSizeshNQ4ISI(b2, bArr[i6], cArr, i5);
                    i5++;
                } else if (androidx.datastore.preferences.protobuf.Utf8.DecodeUtil.getHighSpeedVideoFpsRanges(b2)) {
                    if (i6 >= i3 - 1) {
                        throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighSpeedVideoSizes();
                    }
                    androidx.datastore.preferences.protobuf.Utf8.DecodeUtil.getHighResolutionOutputSizeshNQ4ISI(b2, bArr[i6], bArr[i + 2], cArr, i5);
                    i5++;
                    i += 3;
                } else {
                    if (i6 >= i3 - 2) {
                        throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighSpeedVideoSizes();
                    }
                    androidx.datastore.preferences.protobuf.Utf8.DecodeUtil.getHighSpeedVideoFpsRangesFor(b2, bArr[i6], bArr[i + 2], bArr[i + 3], cArr, i5);
                    i5 += 2;
                    i += 4;
                }
            }
            return new java.lang.String(cArr, 0, i5);
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        final java.lang.String getHighResolutionOutputSizeshNQ4ISI(java.nio.ByteBuffer byteBuffer, int i, int i2) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
            return Camera2StreamConfigurationMap(byteBuffer, i, i2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
        
            return r10 + r0;
         */
        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        final int Camera2StreamConfigurationMap(java.lang.String str, byte[] bArr, int i, int i2) {
            int i3;
            int i4;
            int i5;
            char charAt;
            int length = str.length();
            int i6 = i2 + i;
            int i7 = 0;
            while (i7 < length && (i5 = i7 + i) < i6 && (charAt = str.charAt(i7)) < 128) {
                bArr[i5] = (byte) charAt;
                i7++;
            }
            int i8 = i + i7;
            while (i7 < length) {
                char charAt2 = str.charAt(i7);
                if (charAt2 >= 128 || i8 >= i6) {
                    if (charAt2 < 2048 && i8 <= i6 - 2) {
                        bArr[i8] = (byte) ((charAt2 >>> 6) | 960);
                        i3 = i8 + 2;
                        bArr[i8 + 1] = (byte) ((charAt2 & '?') | 128);
                    } else {
                        if ((charAt2 >= 55296 && 57343 >= charAt2) || i8 > i6 - 3) {
                            if (i8 <= i6 - 4) {
                                int i9 = i7 + 1;
                                if (i9 != str.length()) {
                                    char charAt3 = str.charAt(i9);
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
                                throw new androidx.datastore.preferences.protobuf.Utf8.UnpairedSurrogateException(i7 - 1, length);
                            }
                            if (55296 <= charAt2 && charAt2 <= 57343 && ((i4 = i7 + 1) == str.length() || !java.lang.Character.isSurrogatePair(charAt2, str.charAt(i4)))) {
                                throw new androidx.datastore.preferences.protobuf.Utf8.UnpairedSurrogateException(i7, length);
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

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        final void getHighSpeedVideoFpsRangesFor(java.lang.String str, java.nio.ByteBuffer byteBuffer) {
            getHighResolutionOutputSizeshNQ4ISI(str, byteBuffer);
        }
    }

    static final class UnsafeProcessor extends androidx.datastore.preferences.protobuf.Utf8.Processor {
        UnsafeProcessor() {
        }

        static boolean getHighSpeedVideoSizes() {
            return androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges() && androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizes();
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        final int getHighSpeedVideoSizes(int i, byte[] bArr, int i2, int i3) {
            int i4;
            long j;
            byte b;
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
                            b3 = androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizes(bArr, j2);
                            if (j4 >= j3) {
                                return androidx.content.preferences.protobuf.Utf8.getHighSpeedVideoFpsRangesFor(b2, b3);
                            }
                            j2 = j4;
                        }
                        if (b3 <= -65 && ((b2 != -32 || b3 >= -96) && (b2 != -19 || b3 < -96))) {
                            long j5 = j2 + 1;
                            if (androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizes(bArr, j2) <= -65) {
                                j2 = j5;
                            }
                        }
                        return -1;
                    }
                    byte b4 = (byte) (~(i >> 8));
                    if (b4 == 0) {
                        long j6 = j2 + 1;
                        b4 = androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizes(bArr, j2);
                        if (j6 >= j3) {
                            return androidx.content.preferences.protobuf.Utf8.getHighSpeedVideoFpsRangesFor(b2, b4);
                        }
                        j2 = j6;
                        b = 0;
                    } else {
                        b = (byte) (i >> 16);
                    }
                    if (b == 0) {
                        long j7 = j2 + 1;
                        b = androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizes(bArr, j2);
                        if (j7 >= j3) {
                            return androidx.content.preferences.protobuf.Utf8.getHighResolutionOutputSizeshNQ4ISI(b2, b4, b);
                        }
                        j2 = j7;
                    }
                    if (b4 <= -65 && (((b2 << com.google.common.base.Ascii.FS) + (b4 + com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4)) >> 30) == 0 && b <= -65) {
                        long j8 = j2 + 1;
                        if (androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizes(bArr, j2) <= -65) {
                            j2 = j8;
                        }
                    }
                    return -1;
                }
                if (b2 < -62 || androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizes(bArr, j2) > -65) {
                    return -1;
                }
                j2++;
            }
            int i5 = (int) (j3 - j2);
            if (i5 >= 16) {
                int i6 = (int) j2;
                long j9 = j2;
                i4 = 0;
                while (true) {
                    if (i4 >= 8 - (i6 & 7)) {
                        while (true) {
                            int i7 = i4 + 8;
                            if (i7 > i5 || (androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizesFor(bArr, androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor + j9) & (-9187201950435737472L)) != 0) {
                                break;
                            }
                            j9 += 8;
                            i4 = i7;
                        }
                        while (true) {
                            if (i4 >= i5) {
                                i4 = i5;
                                break;
                            }
                            if (androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizes(bArr, j9) < 0) {
                                break;
                            }
                            i4++;
                            j9++;
                        }
                    } else {
                        if (androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizes(bArr, j9) < 0) {
                            break;
                        }
                        i4++;
                        j9++;
                    }
                }
            } else {
                i4 = 0;
            }
            int i8 = i5 - i4;
            long j10 = j2 + i4;
            while (true) {
                byte b5 = 0;
                while (true) {
                    if (i8 <= 0) {
                        break;
                    }
                    long j11 = j10 + 1;
                    byte highSpeedVideoSizes = androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizes(bArr, j10);
                    if (highSpeedVideoSizes < 0) {
                        b5 = highSpeedVideoSizes;
                        j10 = j11;
                        break;
                    }
                    i8--;
                    b5 = highSpeedVideoSizes;
                    j10 = j11;
                }
                if (i8 == 0) {
                    return 0;
                }
                int i9 = i8 - 1;
                if (b5 >= -32) {
                    if (b5 < -16) {
                        if (i9 < 2) {
                            return getHighSpeedVideoSizes(bArr, b5, j10, i9);
                        }
                        i8 -= 3;
                        byte highSpeedVideoSizes2 = androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizes(bArr, j10);
                        if (highSpeedVideoSizes2 > -65) {
                            return -1;
                        }
                        if (b5 == -32 && highSpeedVideoSizes2 < -96) {
                            return -1;
                        }
                        if (b5 == -19 && highSpeedVideoSizes2 >= -96) {
                            return -1;
                        }
                        j = j10 + 2;
                        if (androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizes(bArr, j10 + 1) > -65) {
                            return -1;
                        }
                    } else {
                        if (i9 < 3) {
                            return getHighSpeedVideoSizes(bArr, b5, j10, i9);
                        }
                        i8 -= 4;
                        byte highSpeedVideoSizes3 = androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizes(bArr, j10);
                        if (highSpeedVideoSizes3 > -65 || (((b5 << com.google.common.base.Ascii.FS) + (highSpeedVideoSizes3 + com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4)) >> 30) != 0 || androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizes(bArr, j10 + 1) > -65) {
                            return -1;
                        }
                        j = 3 + j10;
                        if (androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizes(bArr, j10 + 2) > -65) {
                            return -1;
                        }
                    }
                    j10 = j;
                } else {
                    if (i9 == 0) {
                        return b5;
                    }
                    i8 -= 2;
                    if (b5 < -62 || androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizes(bArr, j10) > -65) {
                        return -1;
                    }
                    j10++;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:125:0x0123, code lost:
        
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
        
            if (androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(r2) <= (-65)) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x006b, code lost:
        
            if (androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(r2) > (-65)) goto L31;
         */
        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        final int getHighResolutionOutputSizeshNQ4ISI(int i, java.nio.ByteBuffer byteBuffer, int i2, int i3) {
            int i4;
            byte b;
            long j;
            if ((i2 | i3 | (byteBuffer.limit() - i3)) < 0) {
                throw new java.lang.ArrayIndexOutOfBoundsException(java.lang.String.format("buffer limit=%d, index=%d, limit=%d", java.lang.Integer.valueOf(byteBuffer.limit()), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3)));
            }
            long highSpeedVideoSizes = androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizes(byteBuffer) + i2;
            long j2 = (i3 - i2) + highSpeedVideoSizes;
            if (i != 0) {
                if (highSpeedVideoSizes >= j2) {
                    return i;
                }
                byte b2 = (byte) i;
                if (b2 < -32) {
                    if (b2 >= -62) {
                        j = highSpeedVideoSizes + 1;
                    }
                    return -1;
                }
                if (b2 < -16) {
                    byte b3 = (byte) (~(i >> 8));
                    if (b3 == 0) {
                        long j3 = highSpeedVideoSizes + 1;
                        b3 = androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes);
                        if (j3 >= j2) {
                            return androidx.content.preferences.protobuf.Utf8.getHighSpeedVideoFpsRangesFor(b2, b3);
                        }
                        highSpeedVideoSizes = j3;
                    }
                    if (b3 <= -65 && ((b2 != -32 || b3 >= -96) && (b2 != -19 || b3 < -96))) {
                        j = highSpeedVideoSizes + 1;
                    }
                    return -1;
                }
                byte b4 = (byte) (~(i >> 8));
                if (b4 == 0) {
                    long j4 = highSpeedVideoSizes + 1;
                    byte highSpeedVideoFpsRangesFor = androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes);
                    if (j4 >= j2) {
                        return androidx.content.preferences.protobuf.Utf8.getHighSpeedVideoFpsRangesFor(b2, highSpeedVideoFpsRangesFor);
                    }
                    b4 = highSpeedVideoFpsRangesFor;
                    highSpeedVideoSizes = j4;
                    b = 0;
                } else {
                    b = (byte) (i >> 16);
                }
                if (b == 0) {
                    long j5 = highSpeedVideoSizes + 1;
                    b = androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes);
                    if (j5 >= j2) {
                        return androidx.content.preferences.protobuf.Utf8.getHighResolutionOutputSizeshNQ4ISI(b2, b4, b);
                    }
                    highSpeedVideoSizes = j5;
                }
                if (b4 <= -65 && (((b2 << com.google.common.base.Ascii.FS) + (b4 + com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4)) >> 30) == 0 && b <= -65) {
                    long j6 = highSpeedVideoSizes + 1;
                    if (androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes) <= -65) {
                        highSpeedVideoSizes = j6;
                    }
                }
                return -1;
                highSpeedVideoSizes = j;
            }
            int i5 = (int) (j2 - highSpeedVideoSizes);
            if (i5 < 16) {
                i4 = 0;
            } else {
                int i6 = (int) ((-highSpeedVideoSizes) & 7);
                int i7 = i6;
                long j7 = highSpeedVideoSizes;
                while (true) {
                    if (i7 <= 0) {
                        int i8 = i5 - i6;
                        while (i8 >= 8 && (androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizes(j7) & (-9187201950435737472L)) == 0) {
                            j7 += 8;
                            i8 -= 8;
                        }
                        i4 = i5 - i8;
                    } else {
                        if (androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(j7) < 0) {
                            i4 = i6 - i7;
                            break;
                        }
                        i7--;
                        j7++;
                    }
                }
            }
            long j8 = highSpeedVideoSizes + i4;
            int i9 = i5 - i4;
            while (true) {
                byte b5 = 0;
                while (true) {
                    if (i9 <= 0) {
                        break;
                    }
                    long j9 = j8 + 1;
                    b5 = androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(j8);
                    if (b5 < 0) {
                        j8 = j9;
                        break;
                    }
                    i9--;
                    j8 = j9;
                }
                if (i9 != 0) {
                    int i10 = i9 - 1;
                    if (b5 >= -32) {
                        if (b5 >= -16) {
                            if (i10 < 3) {
                                return getHighSpeedVideoFpsRangesFor(j8, b5, i10);
                            }
                            i9 -= 4;
                            byte highSpeedVideoFpsRangesFor2 = androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(j8);
                            if (highSpeedVideoFpsRangesFor2 > -65 || (((b5 << com.google.common.base.Ascii.FS) + (highSpeedVideoFpsRangesFor2 + com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4)) >> 30) != 0 || androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(j8 + 1) > -65) {
                                break;
                            }
                            long j10 = 3 + j8;
                            if (androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(j8 + 2) > -65) {
                                break;
                            }
                            j8 = j10;
                        } else {
                            if (i10 < 2) {
                                return getHighSpeedVideoFpsRangesFor(j8, b5, i10);
                            }
                            i9 -= 3;
                            byte highSpeedVideoFpsRangesFor3 = androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(j8);
                            if (highSpeedVideoFpsRangesFor3 > -65 || ((b5 == -32 && highSpeedVideoFpsRangesFor3 < -96) || (b5 == -19 && highSpeedVideoFpsRangesFor3 >= -96))) {
                                break;
                            }
                            long j11 = 2 + j8;
                            if (androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(j8 + 1) > -65) {
                                break;
                            }
                            j8 = j11;
                        }
                    } else {
                        if (i10 == 0) {
                            return b5;
                        }
                        i9 -= 2;
                        if (b5 < -62 || androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(j8) > -65) {
                            break;
                        }
                        j8++;
                    }
                } else {
                    return 0;
                }
            }
            return -1;
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        final java.lang.String getHighSpeedVideoFpsRanges(byte[] bArr, int i, int i2) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
            java.lang.String str = new java.lang.String(bArr, i, i2, androidx.content.preferences.protobuf.Internal.getHighSpeedVideoSizes);
            if (str.indexOf(65533) < 0 || java.util.Arrays.equals(str.getBytes(androidx.content.preferences.protobuf.Internal.getHighSpeedVideoSizes), java.util.Arrays.copyOfRange(bArr, i, i2 + i))) {
                return str;
            }
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighSpeedVideoSizes();
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        final java.lang.String getHighResolutionOutputSizeshNQ4ISI(java.nio.ByteBuffer byteBuffer, int i, int i2) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
            if ((i | i2 | ((byteBuffer.limit() - i) - i2)) < 0) {
                throw new java.lang.ArrayIndexOutOfBoundsException(java.lang.String.format("buffer limit=%d, index=%d, limit=%d", java.lang.Integer.valueOf(byteBuffer.limit()), java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)));
            }
            long highSpeedVideoSizes = androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizes(byteBuffer) + i;
            long j = i2 + highSpeedVideoSizes;
            char[] cArr = new char[i2];
            int i3 = 0;
            while (highSpeedVideoSizes < j) {
                byte highSpeedVideoFpsRangesFor = androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes);
                if (!androidx.datastore.preferences.protobuf.Utf8.DecodeUtil.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor)) {
                    break;
                }
                highSpeedVideoSizes++;
                androidx.datastore.preferences.protobuf.Utf8.DecodeUtil.Camera2StreamConfigurationMap(highSpeedVideoFpsRangesFor, cArr, i3);
                i3++;
            }
            int i4 = i3;
            while (highSpeedVideoSizes < j) {
                long j2 = highSpeedVideoSizes + 1;
                byte highSpeedVideoFpsRangesFor2 = androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes);
                if (androidx.datastore.preferences.protobuf.Utf8.DecodeUtil.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor2)) {
                    androidx.datastore.preferences.protobuf.Utf8.DecodeUtil.Camera2StreamConfigurationMap(highSpeedVideoFpsRangesFor2, cArr, i4);
                    i4++;
                    highSpeedVideoSizes = j2;
                    while (highSpeedVideoSizes < j) {
                        byte highSpeedVideoFpsRangesFor3 = androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes);
                        if (androidx.datastore.preferences.protobuf.Utf8.DecodeUtil.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor3)) {
                            highSpeedVideoSizes++;
                            androidx.datastore.preferences.protobuf.Utf8.DecodeUtil.Camera2StreamConfigurationMap(highSpeedVideoFpsRangesFor3, cArr, i4);
                            i4++;
                        }
                    }
                } else if (androidx.datastore.preferences.protobuf.Utf8.DecodeUtil.getHighSpeedVideoSizes(highSpeedVideoFpsRangesFor2)) {
                    if (j2 >= j) {
                        throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighSpeedVideoSizes();
                    }
                    highSpeedVideoSizes += 2;
                    androidx.datastore.preferences.protobuf.Utf8.DecodeUtil.getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoFpsRangesFor2, androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(j2), cArr, i4);
                    i4++;
                } else if (androidx.datastore.preferences.protobuf.Utf8.DecodeUtil.getHighSpeedVideoFpsRanges(highSpeedVideoFpsRangesFor2)) {
                    if (j2 >= j - 1) {
                        throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighSpeedVideoSizes();
                    }
                    androidx.datastore.preferences.protobuf.Utf8.DecodeUtil.getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoFpsRangesFor2, androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(j2), androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes + 2), cArr, i4);
                    i4++;
                    highSpeedVideoSizes = 3 + highSpeedVideoSizes;
                } else {
                    if (j2 >= j - 2) {
                        throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighSpeedVideoSizes();
                    }
                    androidx.datastore.preferences.protobuf.Utf8.DecodeUtil.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor2, androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(j2), androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(2 + highSpeedVideoSizes), androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes + 3), cArr, i4);
                    i4 += 2;
                    highSpeedVideoSizes += 4;
                }
            }
            return new java.lang.String(cArr, 0, i4);
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        final int Camera2StreamConfigurationMap(java.lang.String str, byte[] bArr, int i, int i2) {
            long j;
            java.lang.String str2;
            java.lang.String str3;
            int i3;
            char charAt;
            long j2 = i;
            long j3 = i2 + j2;
            int length = str.length();
            java.lang.String str4 = " at index ";
            java.lang.String str5 = "Failed writing ";
            if (length > i2 || bArr.length - i2 < i) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed writing ");
                sb.append(str.charAt(length - 1));
                sb.append(" at index ");
                sb.append(i + i2);
                throw new java.lang.ArrayIndexOutOfBoundsException(sb.toString());
            }
            int i4 = 0;
            while (true) {
                j = 1;
                if (i4 >= length || (charAt = str.charAt(i4)) >= 128) {
                    break;
                }
                androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr, j2, (byte) charAt);
                i4++;
                j2++;
            }
            if (i4 == length) {
                return (int) j2;
            }
            while (i4 < length) {
                char charAt2 = str.charAt(i4);
                if (charAt2 < 128 && j2 < j3) {
                    androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr, j2, (byte) charAt2);
                    j2 += j;
                    str2 = str4;
                    str3 = str5;
                } else if (charAt2 < 2048 && j2 <= j3 - 2) {
                    androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr, j2, (byte) ((charAt2 >>> 6) | 960));
                    androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr, j2 + j, (byte) ((charAt2 & '?') | 128));
                    str2 = str4;
                    str3 = str5;
                    j2 = 2 + j2;
                } else {
                    if ((charAt2 >= 55296 && 57343 >= charAt2) || j2 > j3 - 3) {
                        str2 = str4;
                        str3 = str5;
                        if (j2 <= j3 - 4) {
                            int i5 = i4 + 1;
                            if (i5 != length) {
                                char charAt3 = str.charAt(i5);
                                if (java.lang.Character.isSurrogatePair(charAt2, charAt3)) {
                                    int codePoint = java.lang.Character.toCodePoint(charAt2, charAt3);
                                    androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr, j2, (byte) ((codePoint >>> 18) | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE));
                                    androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr, j2 + j, (byte) (((codePoint >>> 12) & 63) | 128));
                                    androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr, j2 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                    androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr, j2 + 3, (byte) ((codePoint & 63) | 128));
                                    j2 = 4 + j2;
                                    i4 = i5;
                                } else {
                                    i4 = i5;
                                }
                            }
                            throw new androidx.datastore.preferences.protobuf.Utf8.UnpairedSurrogateException(i4 - 1, length);
                        }
                        if (55296 <= charAt2 && charAt2 <= 57343 && ((i3 = i4 + 1) == length || !java.lang.Character.isSurrogatePair(charAt2, str.charAt(i3)))) {
                            throw new androidx.datastore.preferences.protobuf.Utf8.UnpairedSurrogateException(i4, length);
                        }
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(str3);
                        sb2.append(charAt2);
                        sb2.append(str2);
                        sb2.append(j2);
                        throw new java.lang.ArrayIndexOutOfBoundsException(sb2.toString());
                    }
                    androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr, j2, (byte) ((charAt2 >>> '\f') | androidx.window.core.layout.WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND));
                    str2 = str4;
                    str3 = str5;
                    androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr, j2 + j, (byte) (((charAt2 >>> 6) & 63) | 128));
                    androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(bArr, j2 + 2, (byte) ((charAt2 & '?') | 128));
                    j2 += 3;
                }
                i4++;
                str4 = str2;
                str5 = str3;
                j = 1;
            }
            return (int) j2;
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        final void getHighSpeedVideoFpsRangesFor(java.lang.String str, java.nio.ByteBuffer byteBuffer) {
            long j;
            char c;
            long j2;
            char c2;
            int i;
            char charAt;
            long highSpeedVideoSizes = androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizes(byteBuffer);
            long position = byteBuffer.position() + highSpeedVideoSizes;
            long limit = byteBuffer.limit() + highSpeedVideoSizes;
            int length = str.length();
            if (length > limit - position) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed writing ");
                sb.append(str.charAt(length - 1));
                sb.append(" at index ");
                sb.append(byteBuffer.limit());
                throw new java.lang.ArrayIndexOutOfBoundsException(sb.toString());
            }
            int i2 = 0;
            while (true) {
                j = 1;
                c = 128;
                if (i2 >= length || (charAt = str.charAt(i2)) >= 128) {
                    break;
                }
                androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(position, (byte) charAt);
                i2++;
                position++;
            }
            if (i2 == length) {
                androidx.content.preferences.protobuf.Java8Compatibility.getHighSpeedVideoFpsRanges(byteBuffer, (int) (position - highSpeedVideoSizes));
                return;
            }
            while (i2 < length) {
                char charAt2 = str.charAt(i2);
                if (charAt2 < c && position < limit) {
                    androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(position, (byte) charAt2);
                    position += j;
                    j2 = limit;
                    c2 = c;
                } else if (charAt2 < 2048 && position <= limit - 2) {
                    androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(position, (byte) ((charAt2 >>> 6) | 960));
                    androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(position + 1, (byte) ((charAt2 & '?') | c));
                    j2 = limit;
                    c2 = c;
                    position += 2;
                } else {
                    if ((charAt2 >= 55296 && 57343 >= charAt2) || position > limit - 3) {
                        if (position <= limit - 4) {
                            int i3 = i2 + 1;
                            if (i3 != length) {
                                char charAt3 = str.charAt(i3);
                                if (java.lang.Character.isSurrogatePair(charAt2, charAt3)) {
                                    int codePoint = java.lang.Character.toCodePoint(charAt2, charAt3);
                                    androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(position, (byte) ((codePoint >>> 18) | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE));
                                    j2 = limit;
                                    androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(position + 1, (byte) (((codePoint >>> 12) & 63) | 128));
                                    androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(position + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                    c2 = 128;
                                    androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(position + 3, (byte) ((codePoint & 63) | 128));
                                    i2 = i3;
                                    position += 4;
                                } else {
                                    i2 = i3;
                                }
                            }
                            throw new androidx.datastore.preferences.protobuf.Utf8.UnpairedSurrogateException(i2 - 1, length);
                        }
                        if (55296 > charAt2 || charAt2 > 57343 || ((i = i2 + 1) != length && java.lang.Character.isSurrogatePair(charAt2, str.charAt(i)))) {
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Failed writing ");
                            sb2.append(charAt2);
                            sb2.append(" at index ");
                            sb2.append(position);
                            throw new java.lang.ArrayIndexOutOfBoundsException(sb2.toString());
                        }
                        throw new androidx.datastore.preferences.protobuf.Utf8.UnpairedSurrogateException(i2, length);
                    }
                    androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(position, (byte) ((charAt2 >>> '\f') | androidx.window.core.layout.WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND));
                    androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(position + 1, (byte) (((charAt2 >>> 6) & 63) | c));
                    androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(position + 2, (byte) ((charAt2 & '?') | 128));
                    j2 = limit;
                    position += 3;
                    c2 = 128;
                }
                i2++;
                c = c2;
                limit = j2;
                j = 1;
            }
            androidx.content.preferences.protobuf.Java8Compatibility.getHighSpeedVideoFpsRanges(byteBuffer, (int) (position - highSpeedVideoSizes));
        }

        private static int getHighSpeedVideoSizes(byte[] bArr, int i, long j, int i2) {
            if (i2 == 0) {
                return androidx.content.preferences.protobuf.Utf8.Camera2StreamConfigurationMap(i);
            }
            if (i2 == 1) {
                return androidx.content.preferences.protobuf.Utf8.getHighSpeedVideoFpsRangesFor(i, androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizes(bArr, j));
            }
            if (i2 == 2) {
                return androidx.content.preferences.protobuf.Utf8.getHighResolutionOutputSizeshNQ4ISI(i, androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizes(bArr, j), androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizes(bArr, j + 1));
            }
            throw new java.lang.AssertionError();
        }

        private static int getHighSpeedVideoFpsRangesFor(long j, int i, int i2) {
            if (i2 == 0) {
                return androidx.content.preferences.protobuf.Utf8.Camera2StreamConfigurationMap(i);
            }
            if (i2 == 1) {
                return androidx.content.preferences.protobuf.Utf8.getHighSpeedVideoFpsRangesFor(i, androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(j));
            }
            if (i2 == 2) {
                return androidx.content.preferences.protobuf.Utf8.getHighResolutionOutputSizeshNQ4ISI(i, androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(j), androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(j + 1));
            }
            throw new java.lang.AssertionError();
        }
    }

    static class DecodeUtil {
        static /* synthetic */ boolean getHighSpeedVideoFpsRanges(byte b) {
            return b < -16;
        }

        static /* synthetic */ boolean getHighSpeedVideoFpsRangesFor(byte b) {
            return b >= 0;
        }

        static /* synthetic */ boolean getHighSpeedVideoSizes(byte b) {
            return b < -32;
        }

        private DecodeUtil() {
        }

        static /* synthetic */ void getHighSpeedVideoFpsRangesFor(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
            if (b2 > -65 || (((b << com.google.common.base.Ascii.FS) + (b2 + com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4)) >> 30) != 0 || b3 > -65 || b4 > -65) {
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighSpeedVideoSizes();
            }
            int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
            cArr[i] = (char) ((i2 >>> 10) + 55232);
            cArr[i + 1] = (char) ((i2 & 1023) + 56320);
        }

        static /* synthetic */ void Camera2StreamConfigurationMap(byte b, char[] cArr, int i) {
            cArr[i] = (char) b;
        }

        static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(byte b, byte b2, char[] cArr, int i) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
            if (b < -62 || b2 > -65) {
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighSpeedVideoSizes();
            }
            cArr[i] = (char) (((b & com.google.common.base.Ascii.US) << 6) | (b2 & 63));
        }

        static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(byte b, byte b2, byte b3, char[] cArr, int i) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
            if (b2 > -65 || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || b3 > -65))) {
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighSpeedVideoSizes();
            }
            cArr[i] = (char) (((b & com.google.common.base.Ascii.SI) << 12) | ((b2 & 63) << 6) | (b3 & 63));
        }
    }

    private Utf8() {
    }

    static /* synthetic */ int getHighResolutionOutputSizeshNQ4ISI(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            if (b > -12) {
                return -1;
            }
            return b;
        }
        if (i3 == 1) {
            byte b2 = bArr[i];
            if (b > -12 || b2 > -65) {
                return -1;
            }
            return (b2 << 8) ^ b;
        }
        if (i3 == 2) {
            byte b3 = bArr[i];
            byte b4 = bArr[i + 1];
            if (b > -12 || b3 > -65 || b4 > -65) {
                return -1;
            }
            return (b4 << 16) ^ ((b3 << 8) ^ b);
        }
        throw new java.lang.AssertionError();
    }

    static /* synthetic */ int getHighResolutionOutputSizeshNQ4ISI(java.nio.ByteBuffer byteBuffer, int i, int i2) {
        int i3 = i;
        while (i3 < i2 - 7 && (byteBuffer.getLong(i3) & (-9187201950435737472L)) == 0) {
            i3 += 8;
        }
        return i3 - i;
    }

    static /* synthetic */ int getHighResolutionOutputSizeshNQ4ISI(java.nio.ByteBuffer byteBuffer, int i, int i2, int i3) {
        int i4;
        if (i3 == 0) {
            if (i > -12) {
                return -1;
            }
            return i;
        }
        if (i3 == 1) {
            byte b = byteBuffer.get(i2);
            if (i > -12 || b > -65) {
                return -1;
            }
            i4 = b << 8;
        } else if (i3 == 2) {
            byte b2 = byteBuffer.get(i2);
            byte b3 = byteBuffer.get(i2 + 1);
            if (i > -12 || b2 > -65 || b3 > -65) {
                return -1;
            }
            i ^= b2 << 8;
            i4 = b3 << 16;
        } else {
            throw new java.lang.AssertionError();
        }
        return i4 ^ i;
    }
}
