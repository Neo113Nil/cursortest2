package util.h.xy.e;

/* loaded from: classes5.dex */
public final class mb {
    private static final byte[] Camera2StreamConfigurationMap;
    private static char[] getHighResolutionOutputSizeshNQ4ISI = null;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static final byte[] getHighSpeedVideoFpsRangesFor;
    private static int getHighSpeedVideoSizes = 0;
    private static char getHighSpeedVideoSizesFor = 0;
    private static int[] getInputFormats = null;
    private static int getInputSizeshNQ4ISI = 0;
    private static char[] getOutputFormats = null;
    private static final byte[] getOutputMinFrameDuration;
    private static int getOutputMinFrameDurationlomOqCM = 0;
    private static long getOutputSizes = 0;
    private static final byte[] getOutputSizeshNQ4ISI;
    private static final byte[] getOutputStallDuration;
    private static final byte[] getOutputStallDurationlomOqCM;
    private static int getValidOutputFormatsForInputhNQ4ISI = 0;
    private static final byte[] isOutputSupportedFor;
    private static final byte[] isOutputSupportedForhNQ4ISI;
    private static int toString = 1;
    private static long unwrapAs;
    private final boolean ArtificialStackFrames = false;

    private static void getHighSpeedVideoFpsRangesFor(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] charArray = str.toCharArray();
        util.h.xz.b.a aVar = new util.h.xz.b.a();
        char[] m27721 = util.h.xz.b.a.m27721(getOutputSizes ^ 7817488252581312552L, charArray, i);
        aVar.f2623 = 4;
        while (aVar.f2623 < m27721.length) {
            aVar.f2624 = aVar.f2623 - 4;
            m27721[aVar.f2623] = (char) ((m27721[aVar.f2623] ^ m27721[aVar.f2623 % 4]) ^ (aVar.f2624 * (getOutputSizes ^ 7817488252581312552L)));
            aVar.f2623++;
        }
        objArr[0] = new java.lang.String(m27721, 4, m27721.length - 4);
    }

    static {
        getHighSpeedVideoFpsRangesFor();
        Camera2StreamConfigurationMap();
        getOutputMinFrameDurationlomOqCM = 0;
        getInputSizeshNQ4ISI = 1;
        int i = (getValidOutputFormatsForInputhNQ4ISI + 125) % 128;
        toString = i;
        getHighSpeedVideoSizesFor = (char) 5;
        getHighResolutionOutputSizeshNQ4ISI = new char[]{org.bouncycastle.pqc.math.linearalgebra.Matrix.MATRIX_TYPE_RANDOM_UT, 'T', 'F', '8', 'i', 'n', 't', io.ktor.util.date.GMTDateParser.DAY_OF_MONTH, 'o', 'a', 'l', 'H', io.ktor.util.date.GMTDateParser.MINUTES, 'c', 'S', 'A', '2', '5', '6', 'V', 'W', 'X', io.ktor.util.date.GMTDateParser.YEAR, org.bouncycastle.pqc.math.linearalgebra.Matrix.MATRIX_TYPE_ZERO, kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST};
        getInputFormats = new int[]{-1922895065, -1531580213, 1541342713, -1563990408, -1153509816, -584182864, 1095002151, -1996177478, -14971186, -2044607484, -2056754003, -1979014698, 339639481, -1270516384, 2099235123, 1633143558, -508444377, 1390261083};
        int i2 = i + 79;
        getValidOutputFormatsForInputhNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        getOutputStallDuration = new byte[]{1, 0};
        isOutputSupportedForhNQ4ISI = new byte[]{-13, -55, 10, -24, -61, 70, -109, -81, -58, -52, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.SI, -123, 41, -61};
        getOutputStallDurationlomOqCM = new byte[]{91, -88, -60, -57, com.google.common.base.Ascii.NAK, 77, -53, -56};
        getOutputMinFrameDuration = new byte[]{76, 60, 92, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, -87, -8, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, -119, -31, -7, com.visa.cbp.getEncExpo.kernelVersion, 1, -7, 104, -108};
        getOutputSizeshNQ4ISI = new byte[]{60, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, -66, -35, 59, 80, com.google.common.base.Ascii.SI, -10};
        Camera2StreamConfigurationMap = new byte[]{65, 4, -31, 91, -72, -125, 44, -26, -45, 102, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, -122, -107, -45, 45};
        getHighSpeedVideoFpsRangesFor = new byte[]{-23, -120, 88, 117, 71, -88, -95, 38};
        isOutputSupportedFor = new byte[]{2, 114, 42, 70, -82, -26, -38, 19, -55, 56, 62, -41, 67, 62, -117, com.google.common.base.Ascii.ESC, -110, 109, 10, 81, com.visa.cbp.getEncExpo.onUnminimized, com.visa.cbp.getEncExpo.registerForActivityResult, 86, -31, -54, -18, 94, 44, -18, 2, -60, -78};
        int i3 = 1 | 3;
        int i4 = i3 << 1;
        int i5 = -(i3 & (~(1 & 3)));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        getOutputMinFrameDurationlomOqCM = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = i + 3;
            getValidOutputFormatsForInputhNQ4ISI = i7 % 128;
            int i8 = i7 % 2;
        }
        int i9 = getValidOutputFormatsForInputhNQ4ISI + 47;
        toString = i9 % 128;
        if (i9 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(int i, int i2, char c, java.lang.Object[] objArr) {
        util.h.xz.b.rb rbVar = new util.h.xz.b.rb();
        long[] jArr = new long[i];
        rbVar.f2651 = 0;
        while (rbVar.f2651 < i) {
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 29) % 128;
            jArr[rbVar.f2651] = (((char) (getOutputFormats[rbVar.f2651 + i2] ^ 3446303986615426049L)) ^ (rbVar.f2651 * (3446303986615426049L ^ unwrapAs))) ^ c;
            rbVar.f2651++;
        }
        char[] cArr = new char[i];
        rbVar.f2651 = 0;
        int i3 = getHighSpeedVideoFpsRanges + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        getHighSpeedVideoSizes = i3 % 128;
        int i4 = i3 % 2;
        while (rbVar.f2651 < i) {
            cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
            rbVar.f2651++;
        }
        java.lang.String str = new java.lang.String(cArr);
        int i5 = getHighSpeedVideoSizes + 37;
        getHighSpeedVideoFpsRanges = i5 % 128;
        if (i5 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        objArr[0] = str;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final java.lang.String m26465() throws javax.crypto.NoSuchPaddingException, java.security.NoSuchAlgorithmException, java.security.InvalidAlgorithmParameterException, java.security.InvalidKeyException, javax.crypto.BadPaddingException, javax.crypto.IllegalBlockSizeException, java.lang.IllegalStateException, java.io.UnsupportedEncodingException, java.lang.IllegalArgumentException {
        int i = getOutputMinFrameDurationlomOqCM;
        int i2 = (((i & (-40)) | ((~i) & 39)) - (~((i & 39) << 1))) - 1;
        getInputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            getValidOutputFormatsForInputhNQ4ISI = (toString + 81) % 128;
            return getHighSpeedVideoSizes(getInputSizeshNQ4ISI(), isOutputSupportedFor);
        }
        int i3 = (getValidOutputFormatsForInputhNQ4ISI + 11) % 128;
        toString = i3;
        getValidOutputFormatsForInputhNQ4ISI = (i3 + 117) % 128;
        getHighSpeedVideoSizes(getInputSizeshNQ4ISI(), isOutputSupportedFor);
        throw new java.lang.ArithmeticException();
    }

    private static java.lang.String getHighSpeedVideoFpsRanges(int[] iArr, int i) {
        char[] cArr = new char[iArr.length << 1];
        int[] iArr2 = (int[]) getInputFormats.clone();
        int i2 = getInputSizeshNQ4ISI + 29;
        getOutputMinFrameDurationlomOqCM = i2 % 128;
        if (i2 % 2 != 0) {
            getValidOutputFormatsForInputhNQ4ISI = (toString + 89) % 128;
        }
        int i3 = 0;
        while (i3 < iArr.length) {
            toString = (getValidOutputFormatsForInputhNQ4ISI + 23) % 128;
            getInputSizeshNQ4ISI = (getOutputMinFrameDurationlomOqCM + 47) % 128;
            int i4 = iArr[i3];
            int i5 = iArr[i3 + 1];
            char[] cArr2 = {(char) (i4 >> 16), (char) i4, (char) (i5 >> 16), (char) i5};
            util.h.xy.b.ra.m25289(cArr2, iArr2, false);
            int i6 = i3 << 1;
            cArr[i6] = cArr2[0];
            cArr[i6 + 1] = cArr2[1];
            cArr[i6 + 2] = cArr2[2];
            cArr[i6 + 3] = cArr2[3];
            i3 += 2;
            int i7 = toString + 63;
            getValidOutputFormatsForInputhNQ4ISI = i7 % 128;
            getOutputMinFrameDurationlomOqCM = i7 % 2 != 0 ? (getInputSizeshNQ4ISI - 123) >> 23102 : (getInputSizeshNQ4ISI + 31) % 128;
        }
        return new java.lang.String(cArr, 0, i);
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final java.lang.String m26466(java.io.InputStream inputStream) throws javax.crypto.NoSuchPaddingException, java.security.NoSuchAlgorithmException, java.security.InvalidAlgorithmParameterException, java.security.InvalidKeyException, javax.crypto.BadPaddingException, javax.crypto.IllegalBlockSizeException, java.lang.IllegalStateException, java.io.IOException, java.lang.IllegalArgumentException {
        int i = toString + 115;
        int i2 = i % 128;
        getValidOutputFormatsForInputhNQ4ISI = i2;
        int i3 = i % 2;
        int i4 = getInputSizeshNQ4ISI;
        int i5 = i4 & 63;
        int i6 = -(-((i4 ^ 63) | i5));
        int i7 = (i5 & i6) + (i6 | i5);
        getOutputMinFrameDurationlomOqCM = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = i2 + 85;
            toString = i8 % 128;
            if (i8 % 2 != 0) {
                return Camera2StreamConfigurationMap(inputStream);
            }
        }
        Camera2StreamConfigurationMap(inputStream);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x00a4, code lost:
    
        if (((r5 >> 1) - 2) == 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00b4, code lost:
    
        r6 = r6 + 53;
        util.h.xy.e.mb.toString = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00bc, code lost:
    
        if ((r6 % 2) != 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00be, code lost:
    
        r10 = 4 / 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b1, code lost:
    
        if ((r5 % 2) == 0) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private java.lang.String getHighSpeedVideoSizes(byte[] bArr, byte[] bArr2) throws javax.crypto.NoSuchPaddingException, java.security.NoSuchAlgorithmException, java.security.InvalidAlgorithmParameterException, java.security.InvalidKeyException, javax.crypto.BadPaddingException, javax.crypto.IllegalBlockSizeException, java.lang.IllegalStateException, java.io.UnsupportedEncodingException, java.lang.IllegalArgumentException {
        java.lang.String str;
        byte[] bArr3;
        int i = getOutputMinFrameDurationlomOqCM;
        int i2 = ((i ^ 36) + ((i & 36) << 1)) - 1;
        getInputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            getValidOutputFormatsForInputhNQ4ISI = (toString + 119) % 128;
        }
        byte[] highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(Camera2StreamConfigurationMap, getHighSpeedVideoFpsRangesFor);
        byte[] highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor(isOutputSupportedForhNQ4ISI, getOutputStallDurationlomOqCM);
        byte[] highSpeedVideoFpsRangesFor3 = getHighSpeedVideoFpsRangesFor(bArr, highSpeedVideoFpsRangesFor2, getHighSpeedVideoFpsRangesFor(getOutputMinFrameDuration, getOutputSizeshNQ4ISI));
        if (highSpeedVideoFpsRangesFor3 != null) {
            getValidOutputFormatsForInputhNQ4ISI = (toString + 119) % 128;
            getOutputMinFrameDurationlomOqCM = (getInputSizeshNQ4ISI + 29) % 128;
            bArr3 = getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoFpsRangesFor3, highSpeedVideoFpsRangesFor);
            if (!java.util.Arrays.equals(bArr2, bArr3)) {
                throw new java.lang.IllegalStateException((java.lang.String) null);
            }
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(android.text.TextUtils.getOffsetBefore("", 0) + 4, 1 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (41136 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16)), objArr);
            str = new java.lang.String(highSpeedVideoFpsRangesFor3, getHighResolutionOutputSizeshNQ4ISI(com.google.common.base.Ascii.CAN, ((java.lang.String) objArr[0]).intern(), 4).intern());
            int i3 = toString + 117;
            int i4 = i3 % 128;
            getValidOutputFormatsForInputhNQ4ISI = i4;
            if (i3 % 2 != 0) {
                getInputSizeshNQ4ISI = (getOutputMinFrameDurationlomOqCM << (-81)) >> 21;
            } else {
                int i5 = getOutputMinFrameDurationlomOqCM + 87;
                getInputSizeshNQ4ISI = i5 % 128;
            }
        } else {
            toString = (getValidOutputFormatsForInputhNQ4ISI + 103) % 128;
            str = null;
            bArr3 = null;
        }
        getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoFpsRangesFor);
        getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoFpsRangesFor2);
        getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoFpsRangesFor3);
        getHighResolutionOutputSizeshNQ4ISI(bArr3);
        int i6 = (toString + 67) % 128;
        getValidOutputFormatsForInputhNQ4ISI = i6;
        int i7 = getOutputMinFrameDurationlomOqCM;
        int i8 = i7 ^ 97;
        int i9 = (i7 & 97) << 1;
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        getInputSizeshNQ4ISI = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
        toString = (i6 + 81) % 128;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x0063, code lost:
    
        if (r17.read(r8) == 4) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private java.lang.String Camera2StreamConfigurationMap(java.io.InputStream inputStream) throws javax.crypto.NoSuchPaddingException, java.security.NoSuchAlgorithmException, java.security.InvalidAlgorithmParameterException, java.security.InvalidKeyException, javax.crypto.BadPaddingException, javax.crypto.IllegalBlockSizeException, java.lang.IllegalStateException, java.io.IOException {
        short s;
        int i = (getValidOutputFormatsForInputhNQ4ISI + 9) % 128;
        toString = i;
        getValidOutputFormatsForInputhNQ4ISI = (i + 21) % 128;
        int i2 = getInputSizeshNQ4ISI;
        int i3 = (i2 | 73) << 1;
        int i4 = -((i2 & (-74)) | ((~i2) & 73));
        getOutputMinFrameDurationlomOqCM = ((i3 & i4) + (i4 | i3)) % 128;
        byte[] bArr = getOutputStallDuration;
        byte[] bArr2 = new byte[bArr.length];
        byte[] bArr3 = new byte[32];
        byte[] bArr4 = new byte[2];
        byte[] bArr5 = new byte[4];
        try {
            inputStream.read(bArr2);
            try {
                if (!java.util.Arrays.equals(bArr, bArr2)) {
                    throw new java.lang.IllegalStateException((java.lang.String) null);
                }
                toString = (getValidOutputFormatsForInputhNQ4ISI + 37) % 128;
                if (inputStream.read(bArr3) != 32) {
                    throw new java.lang.IllegalStateException((java.lang.String) null);
                }
                int i5 = toString + 119;
                getValidOutputFormatsForInputhNQ4ISI = i5 % 128;
                if (i5 % 2 != 0) {
                    if (inputStream.read(bArr5) == 5) {
                        int i6 = java.nio.ByteBuffer.wrap(bArr5).getInt();
                        byte[] bArr6 = new byte[i6];
                        if (inputStream.read(bArr6) != i6) {
                            throw new java.lang.IllegalStateException((java.lang.String) null);
                        }
                        if (inputStream.read(bArr4) != 2) {
                            throw new java.lang.IllegalStateException((java.lang.String) null);
                        }
                        int length = bArr.length + 32;
                        int i7 = (((length | 5) << 1) - (length ^ 5)) - 1;
                        int i8 = i7 & i6;
                        int i9 = (i7 | i6) & (~i8);
                        int i10 = -(-(i8 << 1));
                        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(((i9 | i10) << 1) - (i10 ^ i9));
                        allocate.put(bArr2);
                        allocate.put(bArr3);
                        allocate.put(bArr5);
                        allocate.put(bArr6);
                        short s2 = java.nio.ByteBuffer.wrap(bArr4).getShort();
                        byte[] array = allocate.array();
                        int i11 = toString;
                        int i12 = i11 + 35;
                        int i13 = i12 % 128;
                        getValidOutputFormatsForInputhNQ4ISI = i13;
                        int i14 = 0;
                        if (i12 % 2 != 0) {
                            getInputSizeshNQ4ISI = 0;
                        } else {
                            getInputSizeshNQ4ISI = (getOutputMinFrameDurationlomOqCM + 51) % 128;
                        }
                        if (array != null) {
                            int i15 = getOutputMinFrameDurationlomOqCM;
                            getInputSizeshNQ4ISI = (i15 + 71) % 128;
                            if (array.length != 0) {
                                int length2 = array.length;
                                int i16 = (i15 ^ 15) + ((i15 & 15) << 1);
                                getInputSizeshNQ4ISI = i16 % 128;
                                if (i16 % 2 != 0) {
                                    toString = (i13 + 95) % 128;
                                }
                                short s3 = 255;
                                short s4 = 255;
                                while (true) {
                                    if (length2 <= 0) {
                                        int i17 = getValidOutputFormatsForInputhNQ4ISI + 109;
                                        toString = i17 % 128;
                                        if (i17 % 2 != 0) {
                                            break;
                                        }
                                    }
                                    int i18 = getOutputMinFrameDurationlomOqCM;
                                    int i19 = ((i18 ^ 27) | (i18 & 27)) << 1;
                                    int i20 = -((i18 & (-28)) | ((~i18) & 27));
                                    getInputSizeshNQ4ISI = ((i19 & i20) + (i19 | i20)) % 128;
                                    int i21 = 20;
                                    if (length2 > 20) {
                                        toString = (getValidOutputFormatsForInputhNQ4ISI + 33) % 128;
                                        int i22 = i18 ^ 65;
                                        int i23 = (((i18 & 65) | i22) << 1) - i22;
                                        getInputSizeshNQ4ISI = i23 % 128;
                                        if (i23 % 2 == 0) {
                                            i21 = 61;
                                        }
                                    } else {
                                        toString = (getValidOutputFormatsForInputhNQ4ISI + 77) % 128;
                                        int i24 = i18 ^ 81;
                                        int i25 = ((i18 & 81) | i24) << 1;
                                        int i26 = -i24;
                                        getInputSizeshNQ4ISI = ((i25 ^ i26) + ((i25 & i26) << 1)) % 128;
                                        i21 = length2;
                                    }
                                    int i27 = -i21;
                                    length2 = (length2 ^ i27) + ((length2 & i27) << 1);
                                    int i28 = getInputSizeshNQ4ISI;
                                    getOutputMinFrameDurationlomOqCM = ((((i28 | 14) << 1) - (i28 ^ 14)) - 1) % 128;
                                    do {
                                        byte b = array[i14];
                                        int i29 = (s3 | b) << 1;
                                        int i30 = -(s3 ^ b);
                                        s3 = (short) ((i29 & i30) + (i30 | i29));
                                        int i31 = -(~(-(-s3)));
                                        s4 = (short) ((-2) - (~(((s4 | i31) << 1) - (s4 ^ i31))));
                                        int i32 = i14 ^ 1;
                                        i14 = (((i14 & 1) | i32) << 1) - i32;
                                        i21 = (((i21 | 68) << 1) - (i21 ^ 68)) - 69;
                                    } while (i21 > 0);
                                    int i33 = getOutputMinFrameDurationlomOqCM;
                                    int i34 = (i33 ^ 49) + ((i33 & 49) << 1);
                                    int i35 = i34 % 128;
                                    getInputSizeshNQ4ISI = i35;
                                    if (i34 % 2 == 0) {
                                        int i36 = s3 & 10573;
                                        int i37 = i36 | ((~i36) & (s3 | 10573));
                                        int i38 = -(s3 % 97);
                                        int i39 = ((i37 ^ i38) | (i37 & i38)) << 1;
                                        int i40 = -(((~i38) & i37) | ((~i37) & i38));
                                        s3 = (short) (((i39 | i40) << 1) - (i40 ^ i39));
                                        int i41 = s4 & 13745;
                                        s4 = (short) (((~i41) & ((s4 ^ 13745) | i41)) % (((s4 & 91) + (s4 | 91)) - 1));
                                    } else {
                                        int i42 = s3 & 255;
                                        int i43 = -(-(s3 >> 8));
                                        int i44 = ((~i43) & i42) | ((~i42) & i43);
                                        int i45 = -(-((i43 & i42) << 1));
                                        s3 = (short) (((i44 | i45) << 1) - (i45 ^ i44));
                                        int i46 = ((s4 & 255) - (~(-(~(-(-(s4 >> 8))))))) - 1;
                                        s4 = (short) ((~i46) + (i46 << 1));
                                    }
                                    int i47 = ((i35 | 29) << 1) - (i35 ^ 29);
                                    getOutputMinFrameDurationlomOqCM = i47 % 128;
                                    if (i47 % 2 == 0) {
                                        toString = (getValidOutputFormatsForInputhNQ4ISI + 27) % 128;
                                    }
                                }
                                int i48 = s3 & 255;
                                int i49 = s3 >> 8;
                                int i50 = i48 ^ i49;
                                int i51 = (i48 & i49) << 1;
                                short s5 = (short) ((i50 ^ i51) + ((i51 & i50) << 1));
                                int i52 = (s4 & 255) ^ (s4 >> 8);
                                int i53 = ((short) (((((r3 & r6) | i52) << 1) - (~(-i52))) - 1)) << 8;
                                s = (short) ((s5 ^ i53) | (s5 & i53));
                                int i54 = getOutputMinFrameDurationlomOqCM;
                                getInputSizeshNQ4ISI = (((i54 | 15) << 1) - (i54 ^ 15)) % 128;
                                if (s2 == s) {
                                    throw new java.lang.IllegalStateException((java.lang.String) null);
                                }
                                java.lang.String highSpeedVideoSizes = getHighSpeedVideoSizes(bArr6, bArr3);
                                if (inputStream != null) {
                                    int i55 = getInputSizeshNQ4ISI;
                                    int i56 = i55 & 43;
                                    int i57 = (i55 | 43) & (~i56);
                                    int i58 = -(-(i56 << 1));
                                    getOutputMinFrameDurationlomOqCM = (((i57 | i58) << 1) - (i57 ^ i58)) % 128;
                                    inputStream.close();
                                    int i59 = getInputSizeshNQ4ISI;
                                    int i60 = i59 & 15;
                                    int i61 = ((i59 ^ 15) | i60) << 1;
                                    int i62 = -((i59 | 15) & (~i60));
                                    int i63 = (i61 & i62) + (i62 | i61);
                                    getOutputMinFrameDurationlomOqCM = i63 % 128;
                                    if (i63 % 2 != 0) {
                                        toString = (getValidOutputFormatsForInputhNQ4ISI + 79) % 128;
                                    }
                                }
                                int i64 = getOutputMinFrameDurationlomOqCM + 85;
                                getInputSizeshNQ4ISI = i64 % 128;
                                if (i64 % 2 != 0) {
                                    return highSpeedVideoSizes;
                                }
                                throw null;
                            }
                        } else {
                            getValidOutputFormatsForInputhNQ4ISI = (i11 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                        }
                        int i65 = getInputSizeshNQ4ISI;
                        int i66 = i65 ^ 61;
                        int i67 = (i65 & 61) << 1;
                        int i68 = (i66 ^ i67) + ((i67 & i66) << 1);
                        getOutputMinFrameDurationlomOqCM = i68 % 128;
                        if (i68 % 2 != 0) {
                            int i69 = getValidOutputFormatsForInputhNQ4ISI + 113;
                            toString = i69 % 128;
                            int i70 = i69 % 2;
                        }
                        s = -1;
                        if (s2 == s) {
                        }
                    }
                    throw new java.lang.IllegalStateException((java.lang.String) null);
                }
            } catch (java.lang.Throwable th) {
                th = th;
                if (inputStream != null) {
                    inputStream.close();
                    int i71 = getInputSizeshNQ4ISI;
                    int i72 = (i71 | 71) << 1;
                    int i73 = -((i71 & (-72)) | ((~i71) & 71));
                    int i74 = ((i72 | i73) << 1) - (i73 ^ i72);
                    getOutputMinFrameDurationlomOqCM = i74 % 128;
                    if (i74 % 2 != 0) {
                        getValidOutputFormatsForInputhNQ4ISI = (toString + 67) % 128;
                    }
                }
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0053, code lost:
    
        if (r4 == r5) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x011b, code lost:
    
        if ((r12 >>> 8) != 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0140, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x012a, code lost:
    
        r11 = r11 + 57;
        util.h.xy.e.mb.toString = r11 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0132, code lost:
    
        if ((r11 % 2) != 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0139, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x013f, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0128, code lost:
    
        if ((r12 % 2) != 0) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.lang.String getHighResolutionOutputSizeshNQ4ISI(byte b, java.lang.String str, int i) {
        char c;
        char c2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        char[] cArr3 = getHighResolutionOutputSizeshNQ4ISI;
        char c3 = getHighSpeedVideoSizesFor;
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i--;
            cArr4[i] = (char) (cArr2[i] - b);
        }
        if (i > 1) {
            getInputSizeshNQ4ISI = (getOutputMinFrameDurationlomOqCM + 41) % 128;
            int i2 = 0;
            while (i2 < i) {
                int i3 = getInputSizeshNQ4ISI + 125;
                getOutputMinFrameDurationlomOqCM = i3 % 128;
                if (i3 % 2 != 0) {
                    c = cArr2[i2];
                    c2 = cArr2[i2 - 1];
                    if (c != c2) {
                        getValidOutputFormatsForInputhNQ4ISI = (toString + 87) % 128;
                        int m25285 = util.h.xy.b.b.m25285(c, c3);
                        int m25286 = util.h.xy.b.b.m25286(c, c3);
                        int m252852 = util.h.xy.b.b.m25285(c2, c3);
                        int m252862 = util.h.xy.b.b.m25286(c2, c3);
                        if (m25286 == m252862) {
                            int m25283 = util.h.xy.b.b.m25283(m25285, c3);
                            int m252832 = util.h.xy.b.b.m25283(m252852, c3);
                            int m25284 = util.h.xy.b.b.m25284(m25283, m25286, c3);
                            int m252842 = util.h.xy.b.b.m25284(m252832, m252862, c3);
                            cArr4[i2] = cArr3[m25284];
                            cArr4[i2 + 1] = cArr3[m252842];
                        } else if (m25285 == m252852) {
                            getValidOutputFormatsForInputhNQ4ISI = (toString + 37) % 128;
                            getInputSizeshNQ4ISI = (getOutputMinFrameDurationlomOqCM + 121) % 128;
                            int m252833 = util.h.xy.b.b.m25283(m25286, c3);
                            int m252834 = util.h.xy.b.b.m25283(m252862, c3);
                            int m252843 = util.h.xy.b.b.m25284(m25285, m252833, c3);
                            int m252844 = util.h.xy.b.b.m25284(m252852, m252834, c3);
                            cArr4[i2] = cArr3[m252843];
                            cArr4[i2 + 1] = cArr3[m252844];
                        } else {
                            int i4 = toString + 125;
                            getValidOutputFormatsForInputhNQ4ISI = i4 % 128;
                            if (i4 % 2 != 0) {
                                int i5 = 3 / 2;
                            }
                            int m252845 = util.h.xy.b.b.m25284(m25285, m252862, c3);
                            int m252846 = util.h.xy.b.b.m25284(m252852, m25286, c3);
                            cArr4[i2] = cArr3[m252845];
                            cArr4[i2 + 1] = cArr3[m252846];
                        }
                    }
                    cArr4[i2] = (char) (c - b);
                    cArr4[i2 + 1] = (char) (c2 - b);
                } else {
                    getValidOutputFormatsForInputhNQ4ISI = (toString + 121) % 128;
                    c = cArr2[i2];
                    c2 = cArr2[i2 + 1];
                }
                i2 += 2;
                int i6 = getValidOutputFormatsForInputhNQ4ISI + 83;
                toString = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = getInputSizeshNQ4ISI << 109;
                    getOutputMinFrameDurationlomOqCM = i7 * 10486;
                    int i8 = i7 / 2;
                } else {
                    getOutputMinFrameDurationlomOqCM = (getInputSizeshNQ4ISI + 121) % 128;
                }
            }
        }
        java.lang.String str2 = new java.lang.String(cArr4);
        int i9 = getValidOutputFormatsForInputhNQ4ISI;
        int i10 = i9 + 93;
        toString = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = getInputSizeshNQ4ISI;
            getOutputMinFrameDurationlomOqCM = (i11 >>> 67) / 31128;
        } else {
            int i12 = getInputSizeshNQ4ISI + 51;
            getOutputMinFrameDurationlomOqCM = i12 % 128;
        }
    }

    private static byte[] getHighSpeedVideoFpsRangesFor(byte[] bArr, byte[] bArr2, byte[] bArr3) throws javax.crypto.NoSuchPaddingException, java.security.NoSuchAlgorithmException, java.security.InvalidAlgorithmParameterException, java.security.InvalidKeyException, javax.crypto.BadPaddingException, javax.crypto.IllegalBlockSizeException, java.lang.IllegalArgumentException {
        toString = (getValidOutputFormatsForInputhNQ4ISI + 125) % 128;
        int i = getInputSizeshNQ4ISI;
        int i2 = (i & 6) + (i | 6);
        getOutputMinFrameDurationlomOqCM = ((~i2) + (i2 << 1)) % 128;
        java.security.Key highSpeedVideoSizes = getHighSpeedVideoSizes(bArr2);
        int i3 = getInputSizeshNQ4ISI;
        getOutputMinFrameDurationlomOqCM = (i3 + 111) % 128;
        int i4 = getValidOutputFormatsForInputhNQ4ISI + 33;
        toString = i4 % 128;
        getOutputMinFrameDurationlomOqCM = i4 % 2 == 0 ? (i3 + 93) >>> 13567 : (i3 + 15) % 128;
        try {
            java.lang.Object newInstance = java.lang.Class.forName(getHighSpeedVideoFpsRanges(new int[]{2026994046, -1799011872, -95648968, 1305823847, -1272322603, -793329123, 928454011, 125878725, -1218420232, 577879664, -1161511147, -1625371331, 1606268395, 1331278984, 189807035, 1402826527, -651948187, -2021830813}, 33).intern()).getDeclaredConstructor(byte[].class).newInstance(bArr3);
            java.lang.String intern = getHighSpeedVideoFpsRanges(new int[]{409843748, 487354266, 1705484148, 594338509, -1971182809, -722561108, 463082681, -1887349413, 971770325, 1003502988}, 20).intern();
            int i5 = getOutputMinFrameDurationlomOqCM + 1;
            int i6 = i5 % 128;
            getInputSizeshNQ4ISI = i6;
            if (i5 % 2 != 0) {
                getValidOutputFormatsForInputhNQ4ISI = (toString + 37) % 128;
            }
            int i7 = i6 & 81;
            int i8 = -(-(i6 | 81));
            getOutputMinFrameDurationlomOqCM = ((i7 ^ i8) + ((i7 & i8) << 1)) % 128;
            try {
                java.lang.Object invoke = java.lang.Class.forName(getHighSpeedVideoFpsRanges(new int[]{2026994046, -1799011872, -95648968, 1305823847, -1272322603, -793329123, 243937386, -18643653, -521889811, -1771155961}, 19).intern()).getMethod(getHighSpeedVideoFpsRanges(new int[]{-666922280, 2068790605, -23465000, 8359271, -243192995, 1592940693}, 11).intern(), java.lang.String.class).invoke(null, intern);
                int i9 = getInputSizeshNQ4ISI;
                int i10 = ((i9 & 47) + (i9 | 47)) % 128;
                getOutputMinFrameDurationlomOqCM = i10;
                getInputSizeshNQ4ISI = (i10 + 85) % 128;
                try {
                    java.lang.Object[] objArr = {2, highSpeedVideoSizes, newInstance};
                    java.lang.Class<?> cls = java.lang.Class.forName(getHighSpeedVideoFpsRanges(new int[]{2026994046, -1799011872, -95648968, 1305823847, -1272322603, -793329123, 243937386, -18643653, -521889811, -1771155961}, 19).intern());
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI(4 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), android.text.TextUtils.indexOf("", "") + 4, (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr2);
                    java.lang.String intern2 = getHighResolutionOutputSizeshNQ4ISI((byte) 39, ((java.lang.String) objArr2[0]).intern(), 4).intern();
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor("\ud8e4늭龽\ue0f1\ud88e\uee93❵\uf58dꦶ缅뗢昋㩩趈Ѣᢐ賩ɐ鋄褅ᵭ", 1 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr3);
                    cls.getMethod(intern2, java.lang.Integer.TYPE, java.lang.Class.forName((java.lang.String) objArr3[0]), java.security.spec.AlgorithmParameterSpec.class).invoke(invoke, objArr);
                    int i11 = getInputSizeshNQ4ISI;
                    int i12 = (((i11 | 119) << 1) - (i11 ^ 119)) % 128;
                    getOutputMinFrameDurationlomOqCM = i12;
                    int i13 = i12 & 85;
                    int i14 = -(-((i12 ^ 85) | i13));
                    getInputSizeshNQ4ISI = (((i13 | i14) << 1) - (i13 ^ i14)) % 128;
                    try {
                        java.lang.Class<?> cls2 = java.lang.Class.forName(getHighSpeedVideoFpsRanges(new int[]{2026994046, -1799011872, -95648968, 1305823847, -1272322603, -793329123, 243937386, -18643653, -521889811, -1771155961}, 19).intern());
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 7, android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 8, (char) (android.text.TextUtils.indexOf("", "", 0) + 40080), objArr4);
                        byte[] bArr4 = (byte[]) cls2.getMethod(getHighResolutionOutputSizeshNQ4ISI((byte) 65, ((java.lang.String) objArr4[0]).intern(), 7).intern(), byte[].class).invoke(invoke, bArr);
                        toString = (getValidOutputFormatsForInputhNQ4ISI + 67) % 128;
                        int i15 = getOutputMinFrameDurationlomOqCM;
                        int i16 = i15 & 91;
                        int i17 = -(-((i15 ^ 91) | i16));
                        getInputSizeshNQ4ISI = ((i16 & i17) + (i17 | i16)) % 128;
                        return bArr4;
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        int i18 = toString + 43;
                        getValidOutputFormatsForInputhNQ4ISI = i18 % 128;
                        if (i18 % 2 != 0) {
                            throw null;
                        }
                        throw th;
                    }
                } catch (java.lang.Throwable th2) {
                    java.lang.Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    getValidOutputFormatsForInputhNQ4ISI = (toString + 51) % 128;
                    throw cause2;
                }
            } catch (java.lang.Throwable th3) {
                java.lang.Throwable cause3 = th3.getCause();
                if (cause3 != null) {
                    getValidOutputFormatsForInputhNQ4ISI = (toString + 95) % 128;
                    throw cause3;
                }
                int i19 = getValidOutputFormatsForInputhNQ4ISI + 15;
                toString = i19 % 128;
                if (i19 % 2 == 0) {
                    throw null;
                }
                throw th3;
            }
        } catch (java.lang.Throwable th4) {
            java.lang.Throwable cause4 = th4.getCause();
            if (cause4 != null) {
                throw cause4;
            }
            getValidOutputFormatsForInputhNQ4ISI = (toString + 51) % 128;
            throw th4;
        }
    }

    private static java.security.Key getHighSpeedVideoSizes(byte[] bArr) throws java.lang.IllegalArgumentException {
        int i;
        int i2 = getOutputMinFrameDurationlomOqCM;
        int i3 = (i2 & 115) + (i2 | 115);
        getInputSizeshNQ4ISI = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = toString + 13;
            getValidOutputFormatsForInputhNQ4ISI = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 5 / 5;
            }
        }
        java.lang.String intern = getHighSpeedVideoFpsRanges(new int[]{1557176017, 1918524432}, 3).intern();
        int i6 = getValidOutputFormatsForInputhNQ4ISI + 59;
        toString = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = getInputSizeshNQ4ISI;
            int i8 = i7 & 105;
            int i9 = (i7 ^ 105) | i8;
            int i10 = -((i7 | 105) & (~i8));
            i = ((i9 ^ i10) * (i10 & i9)) - 6783;
        } else {
            int i11 = getInputSizeshNQ4ISI;
            int i12 = i11 & 67;
            int i13 = ((i11 ^ 67) | i12) << 1;
            int i14 = -((i11 | 67) & (~i12));
            i = ((i13 ^ i14) + ((i14 & i13) << 1)) % 128;
        }
        getOutputMinFrameDurationlomOqCM = i;
        int i15 = i & 93;
        getInputSizeshNQ4ISI = (((((i ^ 93) | i15) << 1) - (~(-((~i15) & (i | 93))))) - 1) % 128;
        try {
            java.security.Key key = (java.security.Key) java.lang.Class.forName(getHighSpeedVideoFpsRanges(new int[]{2026994046, -1799011872, -95648968, 1305823847, -1272322603, -793329123, 928454011, 125878725, -955397458, -1570602754, -877815854, -2023082419, 2062005655, 836156888, -1631715806, -1162454383}, 31).intern()).getDeclaredConstructor(byte[].class, java.lang.String.class).newInstance(bArr, intern);
            getValidOutputFormatsForInputhNQ4ISI = (toString + 51) % 128;
            int i16 = getInputSizeshNQ4ISI;
            getOutputMinFrameDurationlomOqCM = ((((i16 | 12) << 1) - (i16 ^ 12)) - 1) % 128;
            return key;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                int i17 = getValidOutputFormatsForInputhNQ4ISI + 79;
                toString = i17 % 128;
                if (i17 % 2 == 0) {
                    throw null;
                }
                throw cause;
            }
            int i18 = getValidOutputFormatsForInputhNQ4ISI + 19;
            toString = i18 % 128;
            if (i18 % 2 == 0) {
                throw null;
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x014e, code lost:
    
        if ((r9 * 3) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0160, code lost:
    
        util.h.xy.e.mb.toString = (r3 + 117) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x015e, code lost:
    
        if ((r9 % 2) == 0) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static byte[] getHighResolutionOutputSizeshNQ4ISI(byte[] bArr, byte[] bArr2) throws java.security.NoSuchAlgorithmException, java.security.InvalidKeyException {
        java.lang.String highResolutionOutputSizeshNQ4ISI;
        int i = getOutputMinFrameDurationlomOqCM;
        int i2 = i & 1;
        int i3 = -(-((i ^ 1) | i2));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        getInputSizeshNQ4ISI = i4 % 128;
        if (i4 % 2 == 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(android.graphics.Color.argb(0, 0, 0, 0) + 10, android.view.KeyEvent.normalizeMetaState(0) + 15, (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr);
            highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI((byte) 80, ((java.lang.String) objArr[0]).intern(), 87);
        } else {
            getValidOutputFormatsForInputhNQ4ISI = (toString + 69) % 128;
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 10, 15 - android.graphics.Color.argb(0, 0, 0, 0), (char) android.text.TextUtils.getTrimmedLength(""), objArr2);
            highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(com.google.common.base.Ascii.RS, ((java.lang.String) objArr2[0]).intern(), 10);
        }
        java.lang.String intern = highResolutionOutputSizeshNQ4ISI.intern();
        int i5 = getOutputMinFrameDurationlomOqCM;
        int i6 = i5 & 41;
        getInputSizeshNQ4ISI = ((((i5 | 41) & (~i6)) - (~(-(-(i6 << 1))))) - 1) % 128;
        try {
            java.lang.Object newInstance = java.lang.Class.forName(getHighSpeedVideoFpsRanges(new int[]{2026994046, -1799011872, -95648968, 1305823847, -1272322603, -793329123, 928454011, 125878725, -955397458, -1570602754, -877815854, -2023082419, 2062005655, 836156888, -1631715806, -1162454383}, 31).intern()).getDeclaredConstructor(byte[].class, java.lang.String.class).newInstance(bArr2, intern);
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 11, android.view.View.combineMeasuredStates(0, 0) + 15, (char) android.view.View.combineMeasuredStates(0, 0), objArr3);
            java.lang.String intern2 = getHighResolutionOutputSizeshNQ4ISI(com.google.common.base.Ascii.RS, ((java.lang.String) objArr3[0]).intern(), 10).intern();
            int i7 = getInputSizeshNQ4ISI;
            int i8 = i7 & 83;
            int i9 = (i7 ^ 83) | i8;
            int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
            getOutputMinFrameDurationlomOqCM = i10 % 128;
            if (i10 % 2 != 0) {
                getValidOutputFormatsForInputhNQ4ISI = (toString + 85) % 128;
            } else {
                toString = (getValidOutputFormatsForInputhNQ4ISI + 63) % 128;
            }
            try {
                java.lang.Object invoke = java.lang.Class.forName(getHighSpeedVideoFpsRanges(new int[]{2026994046, -1799011872, -95648968, 1305823847, -1272322603, -793329123, -378429370, -2043473959}, 16).intern()).getMethod(getHighSpeedVideoFpsRanges(new int[]{-666922280, 2068790605, -23465000, 8359271, -243192995, 1592940693}, 11).intern(), java.lang.String.class).invoke(null, intern2);
                int i11 = getValidOutputFormatsForInputhNQ4ISI;
                int i12 = i11 + 111;
                toString = i12 % 128;
                if (i12 % 2 == 0) {
                    int i13 = getOutputMinFrameDurationlomOqCM;
                    int i14 = i13 & 78;
                    int i15 = i14 / ((i13 ^ 78) | i14);
                    getInputSizeshNQ4ISI = i15 >>> 11405;
                } else {
                    int i16 = getOutputMinFrameDurationlomOqCM;
                    int i17 = i16 & 73;
                    int i18 = i17 + ((i16 ^ 73) | i17);
                    getInputSizeshNQ4ISI = i18 % 128;
                }
                int i19 = getInputSizeshNQ4ISI;
                int i20 = i19 & 37;
                int i21 = ((i19 ^ 37) | i20) << 1;
                int i22 = -((i19 | 37) & (~i20));
                getOutputMinFrameDurationlomOqCM = ((i21 & i22) + (i22 | i21)) % 128;
                try {
                    java.lang.Class<?> cls = java.lang.Class.forName(getHighSpeedVideoFpsRanges(new int[]{2026994046, -1799011872, -95648968, 1305823847, -1272322603, -793329123, -378429370, -2043473959}, 16).intern());
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI('4' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 4 - android.graphics.Color.red(0), (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), objArr4);
                    java.lang.String intern3 = getHighResolutionOutputSizeshNQ4ISI((byte) 39, ((java.lang.String) objArr4[0]).intern(), 4).intern();
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor("\ud8e4늭龽\ue0f1\ud88e\uee93❵\uf58dꦶ缅뗢昋㩩趈Ѣᢐ賩ɐ鋄褅ᵭ", (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 1, objArr5);
                    cls.getMethod(intern3, java.lang.Class.forName((java.lang.String) objArr5[0])).invoke(invoke, newInstance);
                    int i23 = getOutputMinFrameDurationlomOqCM;
                    int i24 = i23 & 95;
                    int i25 = (i23 | 95) & (~i24);
                    int i26 = -(-(i24 << 1));
                    int i27 = ((i25 | i26) << 1) - (i25 ^ i26);
                    getInputSizeshNQ4ISI = i27 % 128;
                    if (i27 % 2 != 0) {
                        getValidOutputFormatsForInputhNQ4ISI = (toString + 67) % 128;
                    }
                    try {
                        java.lang.Class<?> cls2 = java.lang.Class.forName(getHighSpeedVideoFpsRanges(new int[]{2026994046, -1799011872, -95648968, 1305823847, -1272322603, -793329123, -378429370, -2043473959}, 16).intern());
                        java.lang.Object[] objArr6 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 7, (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 9, (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 40081), objArr6);
                        byte[] bArr3 = (byte[]) cls2.getMethod(getHighResolutionOutputSizeshNQ4ISI((byte) 65, ((java.lang.String) objArr6[0]).intern(), 7).intern(), byte[].class).invoke(invoke, bArr);
                        int i28 = getInputSizeshNQ4ISI;
                        int i29 = (i28 & 63) + (i28 | 63);
                        getOutputMinFrameDurationlomOqCM = i29 % 128;
                        if (i29 % 2 == 0) {
                            return bArr3;
                        }
                        throw null;
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                } catch (java.lang.Throwable th2) {
                    java.lang.Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    toString = (getValidOutputFormatsForInputhNQ4ISI + 73) % 128;
                    throw cause2;
                }
            } catch (java.lang.Throwable th3) {
                java.lang.Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                toString = (getValidOutputFormatsForInputhNQ4ISI + 95) % 128;
                throw cause3;
            }
        } catch (java.lang.Throwable th4) {
            java.lang.Throwable cause4 = th4.getCause();
            if (cause4 != null) {
                int i30 = toString + 39;
                getValidOutputFormatsForInputhNQ4ISI = i30 % 128;
                if (i30 % 2 != 0) {
                    throw new java.lang.ArithmeticException();
                }
                throw cause4;
            }
            int i31 = toString + 79;
            getValidOutputFormatsForInputhNQ4ISI = i31 % 128;
            if (i31 % 2 != 0) {
                throw null;
            }
            throw th4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        if ((r0 % 2) != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0024, code lost:
    
        if ((r0 << 2) != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003e, code lost:
    
        Camera2StreamConfigurationMap(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0046, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003d, code lost:
    
        return Camera2StreamConfigurationMap(r2, r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static byte[] getHighSpeedVideoFpsRangesFor(byte[] bArr, byte[] bArr2) {
        int i = toString;
        getValidOutputFormatsForInputhNQ4ISI = (i + 101) % 128;
        int i2 = i + 105;
        getValidOutputFormatsForInputhNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = getOutputMinFrameDurationlomOqCM;
            int i4 = i3 ^ 45;
            int i5 = (((i3 & 45) | i4) << 1) - i4;
            getInputSizeshNQ4ISI = i5 << 32407;
        } else {
            int i6 = getOutputMinFrameDurationlomOqCM;
            int i7 = i6 ^ 59;
            int i8 = (((i6 & 59) | i7) << 1) - i7;
            getInputSizeshNQ4ISI = i8 % 128;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0040, code lost:
    
        if ((r2 % 2) != 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0025, code lost:
    
        if ((r0 >> 2) != 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0043, code lost:
    
        util.h.xy.e.mb.toString = (r1 + 29) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0067, code lost:
    
        if ((r1 % 2) == 0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static byte[] Camera2StreamConfigurationMap(byte[] bArr, byte[] bArr2) {
        int i = toString + 11;
        int i2 = i % 128;
        getValidOutputFormatsForInputhNQ4ISI = i2;
        if (i % 2 != 0) {
            int i3 = getInputSizeshNQ4ISI;
            int i4 = i3 & 111;
            int i5 = (i3 ^ 111) | i4;
            int i6 = -((i3 | 111) & (~i4));
            int i7 = (i5 & i6) << (i6 | i5);
            getOutputMinFrameDurationlomOqCM = i7 >>> 16625;
        } else {
            int i8 = getInputSizeshNQ4ISI;
            int i9 = i8 & 3;
            int i10 = ((i8 ^ 3) | i9) << 1;
            int i11 = -((i8 | 3) & (~i9));
            int i12 = (i10 & i11) + (i11 | i10);
            getOutputMinFrameDurationlomOqCM = i12 % 128;
        }
        byte[] bArr3 = new byte[bArr.length];
        int i13 = getInputSizeshNQ4ISI;
        int i14 = i13 & 19;
        int i15 = (i13 ^ 19) | i14;
        int i16 = (i14 & i15) + (i15 | i14);
        getOutputMinFrameDurationlomOqCM = i16 % 128;
        if (i16 % 2 != 0) {
            int i17 = i2 + 11;
            toString = i17 % 128;
        }
        getValidOutputFormatsForInputhNQ4ISI = (toString + 35) % 128;
        int i18 = 0;
        while (i18 < bArr.length) {
            int i19 = getOutputMinFrameDurationlomOqCM;
            int i20 = i19 ^ 37;
            int i21 = (i19 & 37) << 1;
            int i22 = (i20 ^ i21) + ((i20 & i21) << 1);
            getInputSizeshNQ4ISI = i22 % 128;
            if (i22 % 2 == 0) {
                byte b = bArr[i18];
                byte b2 = bArr2[i18 << bArr2.length];
                int i23 = b & b2;
                bArr3[i18] = (byte) (((b ^ b2) | i23) & (~i23));
                int i24 = (((i18 | (-43)) << 1) - (i18 ^ (-43))) - 1;
                int i25 = ((i24 ^ 76) | (i24 & 76)) << 1;
                int i26 = -((i24 & (-77)) | ((~i24) & 76));
                i18 = ((i25 | i26) << 1) - (i25 ^ i26);
            } else {
                toString = (getValidOutputFormatsForInputhNQ4ISI + 67) % 128;
                byte b3 = bArr[i18];
                byte b4 = bArr2[i18 % bArr2.length];
                bArr3[i18] = (byte) ((b3 & (~b4)) | ((~b3) & b4));
                int i27 = ((i18 ^ 100) | (i18 & 100)) << 1;
                int i28 = -((i18 & (-101)) | ((~i18) & 100));
                int i29 = ((i27 | i28) << 1) - (i28 ^ i27);
                i18 = (i29 & (-99)) + (i29 | (-99));
            }
            int i30 = i19 & 17;
            int i31 = (i19 | 17) & (~i30);
            int i32 = i30 << 1;
            getInputSizeshNQ4ISI = ((i31 & i32) + (i31 | i32)) % 128;
        }
        int i33 = toString;
        getValidOutputFormatsForInputhNQ4ISI = (i33 + 105) % 128;
        int i34 = getOutputMinFrameDurationlomOqCM;
        int i35 = i34 & 75;
        int i36 = (i34 ^ 75) | i35;
        int i37 = (i35 & i36) + (i36 | i35);
        getInputSizeshNQ4ISI = i37 % 128;
        if (i37 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        getValidOutputFormatsForInputhNQ4ISI = (i33 + 121) % 128;
        return bArr3;
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(byte[] bArr) {
        int i = getOutputMinFrameDurationlomOqCM;
        int i2 = (((i ^ 45) | (i & 45)) << 1) - ((i & (-46)) | ((~i) & 45));
        int i3 = i2 % 128;
        getInputSizeshNQ4ISI = i3;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        if (bArr != null) {
            int i4 = (toString + 43) % 128;
            getValidOutputFormatsForInputhNQ4ISI = i4;
            int i5 = (-2) - (~(((i3 | 54) << 1) - (i3 ^ 54)));
            getOutputMinFrameDurationlomOqCM = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = i4 + 7;
                toString = i6 % 128;
                if (i6 % 2 != 0) {
                    int length = bArr.length;
                    throw null;
                }
            }
            if (bArr.length > 0) {
                java.util.Arrays.fill(bArr, (byte) 0);
                int i7 = getInputSizeshNQ4ISI;
                int i8 = i7 ^ 33;
                int i9 = -(-((i7 & 33) << 1));
                int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
                getOutputMinFrameDurationlomOqCM = i10 % 128;
                getValidOutputFormatsForInputhNQ4ISI = (i10 % 2 != 0 ? toString + 81 : toString + 49) % 128;
            } else {
                toString = (i4 + 79) % 128;
            }
        }
        int i11 = getOutputMinFrameDurationlomOqCM;
        int i12 = ((i11 ^ 55) | (i11 & 55)) << 1;
        int i13 = -((i11 & (-56)) | ((~i11) & 55));
        getInputSizeshNQ4ISI = (((i12 | i13) << 1) - (i13 ^ i12)) % 128;
    }

    private static byte[] getOutputMinFrameDuration() {
        int i = getValidOutputFormatsForInputhNQ4ISI;
        toString = (i + 31) % 128;
        int i2 = getOutputMinFrameDurationlomOqCM + 85;
        getInputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = i + 37;
            toString = i3 % 128;
            if (i3 % 2 != 0) {
                byte[] bArr = new byte[1024];
                float scrollFriction = android.view.ViewConfiguration.getScrollFriction();
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI(1025 - (scrollFriction > 0.0f ? 1 : (scrollFriction == 0.0f ? 0 : -1)), 1060 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0), objArr);
                java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                int indexOf = android.text.TextUtils.indexOf("", "", 0);
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI(10 - indexOf, (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)) + 1048, (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr2);
                    java.lang.System.arraycopy(intern.getBytes(((java.lang.String) objArr2[0]).intern()), 0, bArr, 0, 1024);
                    int i4 = getInputSizeshNQ4ISI;
                    int i5 = i4 & 83;
                    int i6 = (i4 | 83) & (~i5);
                    int i7 = -(-(i5 << 1));
                    getOutputMinFrameDurationlomOqCM = (((i6 | i7) << 1) - (i6 ^ i7)) % 128;
                    return bArr;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
        } else {
            int i8 = i + 1;
            toString = i8 % 128;
            int i9 = i8 % 2;
        }
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        int maxKeyCode = android.view.KeyEvent.getMaxKeyCode();
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(1025 - (elapsedRealtime > 0L ? 1 : (elapsedRealtime == 0L ? 0 : -1)), (maxKeyCode >> 16) + org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_EXIF_INFO2, (char) android.view.View.MeasureSpec.getMode(0), objArr3);
        java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
        byte modifierMetaStateMask = (byte) android.view.KeyEvent.getModifierMetaStateMask();
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(9 - modifierMetaStateMask, 1050 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) android.view.View.getDefaultSize(0, 0), objArr4);
        java.lang.System.arraycopy(intern2.getBytes(((java.lang.String) objArr4[0]).intern()), 0, new byte[1024], 0, 1024);
        throw null;
    }

    private static byte[] getHighSpeedVideoFpsRanges() {
        int i = getInputSizeshNQ4ISI;
        int i2 = (((i | 52) << 1) - (i ^ 52)) - 1;
        getOutputMinFrameDurationlomOqCM = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                int i3 = getValidOutputFormatsForInputhNQ4ISI + 115;
                toString = i3 % 128;
                int i4 = i3 % 2;
                byte[] bArr = new byte[1024];
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI(1024 - android.graphics.Color.green(0), android.view.KeyEvent.keyCodeFromString("") + 2083, (char) ((-1) - android.graphics.ImageFormat.getBitsPerPixel(0)), objArr);
                java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                int deadChar = android.view.KeyEvent.getDeadChar(0, 0);
                toString = (getValidOutputFormatsForInputhNQ4ISI + 105) % 128;
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI(deadChar + 10, 1050 - (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)), (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr2);
                java.lang.System.arraycopy(intern.getBytes(((java.lang.String) objArr2[0]).intern()), 0, bArr, 0, 1024);
                return bArr;
            }
            int i5 = getValidOutputFormatsForInputhNQ4ISI;
            toString = (i5 + 115) % 128;
            toString = (i5 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
            byte[] bArr2 = new byte[1024];
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1024, (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 2084, (char) android.widget.ExpandableListView.getPackedPositionType(0L), objArr3);
            java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(android.view.KeyEvent.keyCodeFromString("") + 10, 1049 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue() + 1), objArr4);
            java.lang.System.arraycopy(intern2.getBytes(((java.lang.String) objArr4[0]).intern()), 0, bArr2, 0, 1024);
            throw null;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private static byte[] getHighSpeedVideoSizesFor() {
        getValidOutputFormatsForInputhNQ4ISI = (toString + 115) % 128;
        int i = getOutputMinFrameDurationlomOqCM;
        int i2 = i & 113;
        int i3 = -(-((i ^ 113) | i2));
        getInputSizeshNQ4ISI = ((i2 & i3) + (i3 | i2)) % 128;
        byte[] bArr = new byte[1024];
        int tapTimeout = android.view.ViewConfiguration.getTapTimeout();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI((tapTimeout >> 16) + 1024, (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 3107, (char) (android.widget.ExpandableListView.getPackedPositionGroup(0L) + 21803), objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        int fadingEdgeLength = android.view.ViewConfiguration.getFadingEdgeLength();
        int mode = android.view.View.MeasureSpec.getMode(0);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(10 - (fadingEdgeLength >> 16), mode + org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_GLOBAL_ALTITUDE, (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), objArr2);
        java.lang.System.arraycopy(intern.getBytes(((java.lang.String) objArr2[0]).intern()), 0, bArr, 0, 1024);
        int i4 = getOutputMinFrameDurationlomOqCM;
        int i5 = i4 & 37;
        int i6 = (i5 - (~((i4 ^ 37) | i5))) - 1;
        getInputSizeshNQ4ISI = i6 % 128;
        if (i6 % 2 != 0) {
            return bArr;
        }
        getValidOutputFormatsForInputhNQ4ISI = (toString + 77) % 128;
        throw null;
    }

    private static byte[] getHighResolutionOutputSizeshNQ4ISI() {
        getValidOutputFormatsForInputhNQ4ISI = (toString + 23) % 128;
        int i = getInputSizeshNQ4ISI;
        int i2 = i & 37;
        getOutputMinFrameDurationlomOqCM = (i2 + ((i ^ 37) | i2)) % 128;
        byte[] bArr = new byte[1024];
        int pressedStateDuration = android.view.ViewConfiguration.getPressedStateDuration();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI((pressedStateDuration >> 16) + 1024, android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 4131, (char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 47011), objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        int blue = android.graphics.Color.blue(0);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(10 - blue, 1049 - android.text.TextUtils.getOffsetBefore("", 0), (char) android.view.View.getDefaultSize(0, 0), objArr2);
        java.lang.System.arraycopy(intern.getBytes(((java.lang.String) objArr2[0]).intern()), 0, bArr, 0, 1024);
        int i3 = (toString + 27) % 128;
        getValidOutputFormatsForInputhNQ4ISI = i3;
        int i4 = i3 + 97;
        toString = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = getOutputMinFrameDurationlomOqCM;
            getInputSizeshNQ4ISI = ((i5 ^ 33) - ((i5 & 33) + 1)) >> 11650;
        } else {
            int i6 = getOutputMinFrameDurationlomOqCM;
            getInputSizeshNQ4ISI = ((i6 ^ 69) + ((i6 & 69) << 1)) % 128;
        }
        return bArr;
    }

    private static byte[] getHighSpeedVideoSizes() {
        int i = toString;
        int i2 = (i + 13) % 128;
        getValidOutputFormatsForInputhNQ4ISI = i2;
        int i3 = getOutputMinFrameDurationlomOqCM;
        int i4 = i3 & 63;
        int i5 = (i4 - (~(-(-((i3 ^ 63) | i4))))) - 1;
        getInputSizeshNQ4ISI = i5 % 128;
        try {
            if (i5 % 2 != 0) {
                int i6 = i + 89;
                getValidOutputFormatsForInputhNQ4ISI = i6 % 128;
                if (i6 % 2 == 0) {
                    byte[] bArr = new byte[688];
                    int intValue = ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue();
                    int deadChar = android.view.KeyEvent.getDeadChar(0, 0);
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI((intValue >> 22) + 688, deadChar + 5155, (char) (51037 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16)), objArr);
                    java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                    int maximumDrawingCacheSize = android.view.ViewConfiguration.getMaximumDrawingCacheSize();
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI((maximumDrawingCacheSize >> 24) + 10, 1049 - android.text.TextUtils.getTrimmedLength(""), (char) android.view.View.getDefaultSize(0, 0), objArr2);
                    java.lang.System.arraycopy(intern.getBytes(((java.lang.String) objArr2[0]).intern()), 0, bArr, 0, 688);
                    return bArr;
                }
            } else {
                toString = (i2 + 125) % 128;
            }
            byte[] bArr2 = new byte[688];
            int resolveSize = android.view.View.resolveSize(0, 0);
            long globalActionKeyTimeout = android.view.ViewConfiguration.getGlobalActionKeyTimeout();
            toString = (getValidOutputFormatsForInputhNQ4ISI + 61) % 128;
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(688 - resolveSize, (globalActionKeyTimeout > 0L ? 1 : (globalActionKeyTimeout == 0L ? 0 : -1)) + 5154, (char) (51037 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22)), objArr3);
            java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
            float minVolume = android.media.AudioTrack.getMinVolume();
            int axisFromString = android.view.MotionEvent.axisFromString("");
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(10 - (minVolume > 0.0f ? 1 : (minVolume == 0.0f ? 0 : -1)), axisFromString + org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_SLICES, (char) (android.view.ViewConfiguration.getTouchSlop() >> 8), objArr4);
            java.lang.System.arraycopy(intern2.getBytes(((java.lang.String) objArr4[0]).intern()), 0, bArr2, 0, 688);
            throw null;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private static byte[] getInputSizeshNQ4ISI() {
        int i = toString;
        int i2 = i + 37;
        getValidOutputFormatsForInputhNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = getInputSizeshNQ4ISI;
            getOutputMinFrameDurationlomOqCM = ((i3 ^ 103) << (i3 & 103)) + 23773;
        } else {
            int i4 = getInputSizeshNQ4ISI;
            getOutputMinFrameDurationlomOqCM = ((i4 ^ 15) + ((i4 & 15) << 1)) % 128;
        }
        int i5 = getOutputMinFrameDurationlomOqCM;
        int i6 = (i5 & 63) + (i5 | 63);
        getInputSizeshNQ4ISI = i6 % 128;
        if (i6 % 2 == 0) {
            getValidOutputFormatsForInputhNQ4ISI = (i + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        }
        byte[] bArr = new byte[1024];
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(1024 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 24, (char) ((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 19674), objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 9, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_SLICES, (char) (1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))), objArr2);
        java.lang.System.arraycopy(intern.getBytes(((java.lang.String) objArr2[0]).intern()), 0, bArr, 0, 1024);
        int i7 = getValidOutputFormatsForInputhNQ4ISI;
        toString = (i7 + 95) % 128;
        int i8 = getOutputMinFrameDurationlomOqCM;
        int i9 = (i8 ^ 55) + ((i8 & 55) << 1);
        getInputSizeshNQ4ISI = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = (i7 + 109) % 128;
            toString = i10;
            getValidOutputFormatsForInputhNQ4ISI = (i10 + 101) % 128;
            throw null;
        }
        byte[][] bArr2 = {bArr, getOutputMinFrameDuration(), getHighSpeedVideoFpsRanges(), getHighSpeedVideoSizesFor(), getHighResolutionOutputSizeshNQ4ISI(), getHighSpeedVideoSizes()};
        int i11 = (toString + 43) % 128;
        getValidOutputFormatsForInputhNQ4ISI = i11;
        int i12 = getOutputMinFrameDurationlomOqCM;
        int i13 = (i12 & 1) + (i12 | 1);
        getInputSizeshNQ4ISI = i13 % 128;
        if (i13 % 2 == 0) {
            toString = (i11 + 25) % 128;
            int i14 = 2 / 4;
        }
        int i15 = 0;
        int i16 = 0;
        while (i15 < 6) {
            int i17 = getOutputMinFrameDurationlomOqCM;
            int i18 = ((i17 & 84) + (i17 | 84)) - 1;
            getInputSizeshNQ4ISI = i18 % 128;
            if (i18 % 2 == 0) {
                getValidOutputFormatsForInputhNQ4ISI = (toString + 27) % 128;
            }
            i16 = (i16 - (~(-(~(-(-bArr2[i15].length)))))) - 2;
            int i19 = i15 & 1;
            int i20 = (i15 | 1) & (~i19);
            int i21 = -(-(i19 << 1));
            i15 = ((i20 | i21) << 1) - (i20 ^ i21);
            int i22 = i17 & 29;
            int i23 = ((((i17 ^ 29) | i22) << 1) - (~(-((i17 | 29) & (~i22))))) - 1;
            getInputSizeshNQ4ISI = i23 % 128;
            if (i23 % 2 == 0) {
                int i24 = 4 / 5;
            }
        }
        byte[] bArr3 = new byte[i16];
        int i25 = getInputSizeshNQ4ISI;
        int i26 = i25 & 89;
        int i27 = (i25 ^ 89) | i26;
        int i28 = (i26 ^ i27) + ((i27 & i26) << 1);
        getOutputMinFrameDurationlomOqCM = i28 % 128;
        if (i28 % 2 == 0) {
            getValidOutputFormatsForInputhNQ4ISI = (toString + 9) % 128;
        }
        int i29 = 0;
        int i30 = 0;
        while (i29 < 6) {
            int i31 = getInputSizeshNQ4ISI;
            getOutputMinFrameDurationlomOqCM = (((i31 ^ 64) + ((i31 & 64) << 1)) - 1) % 128;
            byte[] bArr4 = bArr2[i29];
            java.lang.System.arraycopy(bArr4, 0, bArr3, i30, bArr4.length);
            i30 = (i30 - (~(-(-bArr2[i29].length)))) - 1;
            int i32 = i29 & 1;
            int i33 = -(-((i29 ^ 1) | i32));
            i29 = (i33 ^ i32) + ((i33 & i32) << 1);
            int i34 = getInputSizeshNQ4ISI + 107;
            getOutputMinFrameDurationlomOqCM = i34 % 128;
            if (i34 % 2 == 0) {
                int i35 = toString;
                int i36 = i35 + 21;
                getValidOutputFormatsForInputhNQ4ISI = i36 % 128;
                if (i36 % 2 != 0) {
                    int i37 = 3 / 3;
                }
                getValidOutputFormatsForInputhNQ4ISI = (i35 + 119) % 128;
            }
        }
        int i38 = getValidOutputFormatsForInputhNQ4ISI;
        toString = (i38 + 63) % 128;
        int i39 = getOutputMinFrameDurationlomOqCM;
        int i40 = i39 & 89;
        int i41 = (((i39 ^ 89) | i40) << 1) - ((i39 | 89) & (~i40));
        getInputSizeshNQ4ISI = i41 % 128;
        if (i41 % 2 == 0) {
            throw null;
        }
        toString = (i38 + 107) % 128;
        return bArr3;
    }

    static void getHighSpeedVideoFpsRangesFor() {
        getOutputSizes = 2500680869644706935L;
    }

    static void Camera2StreamConfigurationMap() {
        char[] cArr = new char[5843];
        java.nio.ByteBuffer.wrap("<°¿æ:\u0018µJ\u009c\u0001\u001f]\u009aª\u0015÷\u0000\u0099\u0083Í\u00068\u0089n\rÃ\u0090=\u0013Â\u009c\r\u001fY\u009a£\u0015ð\u0091_\f¤\u008fï\u000bC\u0086»\u0001ïÐõSfÖ_Y\u0014Ý\u0018@[ÃaG\u0099Ê\u009dMªñ\u0014t\u0018÷8{\rþ.a\u0012å\nh»ë»oT\u0092h\u0015×\u00998\u001cñ\u009f®\u0003\u001b\u0086\"\t½\u008d,0~³;7qº\u000e=ò¡Q$:§/+\u001d®<ÑÑU\u0083Ø([ÅßdB¥ÅZIÌÌ\fO\róÀv\u0017ùy}|à2cúçxjÄíè\u0011Ð\u0094)\u0017Ú\u009b\u0012\u001eÖ\u0081*\u0005\f\u0088Å\u000b<\u008fò2÷µ\u00879\u0083¼K?p£Ý&Õ©\u0094-¸P¾ÓOWlÚÇ]ÏÁ¯D7ÇÞKSÎ\u0014q<õ x8ûH\u007f\u009eâQeÜéºl\u000bïI\u0013'\u0096s\u0019¾\u009d\u008d\u0000Ñ\u0083ñ\u0007±\u008a\u0001\rý±\u00994l·#;!¾3!/¥\u001a(Å«~/\u008dRPÕoYÅÜ\u008c_êÃeF\u008fÉ}M#ðªsÂ÷\u0096zÜýpa\u009eä\u0086g$ë¸nR\u0091ê\u0015)\u0098?\u001b+\u009f¢\u0002£\u0085\u0012\tÓ\u008cß\u000f\u0010³\u00136\u0003¹\u000e=æ e#ø§;*\u008f\u00adAÑøT\t×d[\tÞRAPÅôH.Ë&O\u001fòÖuüù\r|ôÿ\u000bc\u0016æÌiÁíL\u00108\u0093/\u0017j\u009a\u008f\u001dÜ\u0081Ò\u0004\t\u0087#\u000b·\u008e\u001d1\u008fµÝ8\b»\u0000?\f¢y%0©ä,\u0088¯tÓyVÛÙð]DÀ°CÄÇ½J¾Í*qgô²wPûL~\u0003á>eÈèîk\u0016ï4\u0012;\u0095\u001b\u0019ª\u009cÖ\u001f\u009e\u0083X\u0006+\u0089¨\r!°\u001f3\u0092·i:[½ô!\u001e¤ñ'\u0016«í.EQ~ÕÅXºÛ\\_{ÂJE\u0005É¹L\u001eÏ\u0010sÚö.yLýë`\u008cãþg\u0014ê\u008bm\u009e\u0091ï\u0014Û\u0097ß\u001bM\u009e\u009c\u0001\"\u00851\b¸\u008b=\u000eÄ²þ5&¸V<õ¿\u0093\"\u009b¦C)Ó¬6Ð\u009fSËÖ[Z*Ýÿ@&Ä©G»ÊjNHñ¸t\u000føÒ{#þ4bÙå¾h2ì1ow\u0092õ\u0016Î\u0099z\u001c~\u0080Í\u0003ê\u0086*\nÀ\u008dQ0l´c7/º\u0094>î¡Ð$Ä¨Y+\u0099®\u0013Ò\u0004U3Ø\u0087\\Åß\u009fB0ÆµI\u0099ÌÚp>ó\u008avYú2}\u0005à.dÙç¶j«îë\u0011Ò\u0094\u0011\u0018Ù\u009b9\u001e0\u0082À\u0005>\u00883\ft\u008fT2]¶?9\u0099¼¿ )£z&¹ª8-2PÍÔ\u0092W[Út^\u0089Á\u001aD\u008aÈ£KñÎ\nr>õ\u008fx\u0093ü¤\u007fÝâ´f\u008aéKl¦\u0090ð\u0013á\u0096ý\u001aö\u009d)\u0000þ\u0084\u001d\u0007\u0083\u008ad\u000eZ±\u007f4o¸\u001f;\u000e¾I\"õ¥Y(Q¬k/\u0018R¥Ö¸Y«Ü¨@\u0095Ã§F\u008eÊiM0ð\u0092t÷÷@zÒþ¿aîäÒhÚëwn+\u0092\t\u00150\u0098Y\u001cp\u009fS\u0002\u0080\u0086)\tý\u008c<0D³S6~º`=\u0018 \u0005$Á§0*ê®¹Ñ\u0089TÈØ6[ÉÞ\u0086BiÅ\u0015H)ÌjO\u0003òCv ùr|9à¬cºæäjÐí(\u0010G\u0094\u0090\u0017 \u009a\u009d\u001e\u008e\u0081!\u0004\u0006\u0088=\u000b\u0011\u008ep2¥µc8\u000b¼\u0002?8¢Ü&â©\u0015,§PzÓþVKÚ,]fÀ¡DéÇÂJ\u0010Î%q\fôXx¦û<~VâÊe[èúlNïu\u0012\u0092\u0096á\u0019Í\u009c\u008d\u0000º\u0083\u0004\u0006Ä\u008a-\rN°G4å·\u0096:\u0006¾¨!w¤o(?«\u0017.-R\u0005ÕöX\u0080Üo_ªÂÒFgÉ\u0081L&ðss\u0084öøzaý!`\u007fãýgºêÁm;\u0091t\u0014½\u0097ñ\u001bá\u009e¬\u0001Î\u0085;\bì\u008b\u0017\u000f\u009e²z5È¹S<Ë¿×#:¦\u0005)\u0002\u00adjÐ=SK×+ZÍÝxAçÄ\u009bGÂË\u001aN_ñwuïøÆ{¿ÿNbyåhi¤ìNo§\u0093B\u00162\u0099<\u001d\u0015\u0080Ô\u0003V\u0087\u0080\nû\u008d¶1ï´ø7ý»î>>¡\n%ý¨Ñ+È¯ÅÒ!U¦Ù½\\\u001aß\u0002C\\ÆýIôÍCp\u0017óOwïú\u0007}\u00adáÔdIç´k\u001cî¢\u0011ö\u00958\u0018\u0015\u009b\u009b\u001f4\u0082à\u0005¦\u0089-\f\u0003\u008fû3Ù¶ä9ÿ½¹ º£÷'\u0080ª\u0090-ñQqÔõWËÛ+^ÖÁìEMÈäKqÏ*ryõ@y!ü\u0095\u007fpãTfié\u008am3\u0090<\u0013\u0096\u0097±\u001aÀ\u009dÑ\u0001¹\u0084µ\u0007à\u008b3\u000eÅ±h5\u0001¸N;8¿A\"ù¥¯)\u0080¬\u000e/±SyÖÔY®ÝQ@¿Ã\u0085G\u0099Ê\u0098M1ñ\u009dtX÷Æ{)þÔaÎåBh\u0096ëaoõ\u0092\u0011\u0015h\u0099\u0012\u001c\n\u009fj\u0003\u0015\u0086³\tà\u008d\u000e0<³û7_º}=Ô¡¾$i§z+\u000e®EÑGUdØE[®ßSByÅ\u0001I\u0090Ì«O·ó=v\u008eù%}Uàpcvçüj\u0014íW\u0011$\u0094Ç\u0017\t\u009b\b\u001e-\u0081(\u0005n\u0088¯\u000bÞ\u008f\u00872\rµ;9ß¼\u000e?Õ£2&z©\\-¨P\u0017Ó\u0014WÍÚµ]ÇÁQDzÇòKüÎkq»õµx\u001dûT\u007f^âÖeJé4l\tï_\u0013A\u0096\u0004\u0019Ï\u009d¥\u00007\u0083?\u0007W\u008a\u0098\rü±(4i·\u001d;Á¾C!?¥\u0084(Ô«;/°RªÕãX\u0094ÜX_:ÂgF½É\u0092LððDsWö[z\u0005ýÁ`Ýä\u009bg;êjnª\u0091î\u0014ì\u0098¼\u001bé\u009e¨\u00023\u0085Î\ba\u008cq\u000fò²º6\t¹z<þ  #Ö¦m*#\u00ad£ÐáT1×yZÿÞrA¼Ä\u0006H\u001aË§N\u000fòyuáøH|®ÿÛbÒæ9iÈìÜ\u0010o\u0093Û\u0016Ö\u009aÏ\u001dN\u0080d\u0004à\u0087j\ná\u008e61L´é8Õ»\u0002>ÿ¢C%e¨h,Â¯ÖÒ@VJÙT\\\u009bÀÛC\u008dÆJJìÍrp\u0083ô²w\u0083úÌ~QáÄd\u009dèõk\u0084î\f\u0012/\u0095\u0000\u0018\u008e\u009ck\u001fÁ\u0082\u0003\u0006v\u0089\u0014\f½°¤3_¶\u0086:¹½\t \u0013¤Ï'8ªY.\u0080QöÔÛX\u0083Ûí^\u0097ÂvE9È\u001dL\u0001Ï\u0016r\u000fö«y\u009bü¹`\u0092ãÎf\u001eê÷m\u0003\u0090)\u0014\"\u00979\u001aµ\u009e¼\u0001\u0019\u0084@\b¦\u008b\u0097\u000eO²g5\u0099¸õ<Y¿¡\"¿¦\u0011)1¬kÐ\u0015S=ÖKZ«Ý¨@£Ä8G]ÊÐN¥ñ\u00adtÑø\u000f{úþib-åÌhÔìioG\u0092O\u0016§\u0099Ò\u001c|\u0080Ì\u0003m\u0086¥\n<\u008dÒ0B´\u001a7Ýº&>[¡î$Ý¨u+ ®¶Ò\u0001UmØp\\lß/B\u0012Æ\u0004IpÌ\\p-óàv9ú3}\u0001àkdpç\u0001jµîC\u0011_\u0094v\u0018\u009d\u009bf\u001eu\u0082\u0086\u0005i\u0088Ä\f9\u008fM2ý¶G9}¼\u001e \u0011£Á&´ª'-¦P7Ô<W`Úï^\u0082Á\u008aDØÈ\u0081KªÎbrñõ®x~üÍ\u007f¿â\u0017fÃé¯lÒ\u0090â\u0013¦\u0096]\u001aù\u009d}\u0000å\u009cH\u001f\u0007\u009aä\u0015Ó\u0091m\f\u0090\u008fÊ\u000bk\u0086\u0084\u0001Í\u009c\u009e\u001fO\u009a\u0005\u0015\u0014\u0091|\f\u0010\u008fs\u000bÌ\u0086v\u0001ø½,8\u008e»+7É²c-³©\u009f$Ì§n#\tÞ@YðÕ\u001eP'Ó\u0084ODÊ\u009cE\u00adÁ}|Îÿ\u009a{¹öÿq>íVh\u009aëYg8â\u0002\u009d¾\u0019Ë\u0094\u0091\u0017P\u0093Ã\u000e\u001e\u0089\u001b\u0005Ø\u0080½\u0003|¿±:5µv1\u0015¬ÿ/¸«P&\u0099¡\u0089]@Ø@[*×ªRdÍ\u0085IÙÄ\u008fGÐÃY~\u008eùDu\u008bð)sÐïjj\u0089å·a\u001e\u001cñ\u009f\u0001\u001b>\u0096¶\u0011÷\u008dá\b/\u008bü\u0007â\u00826=%¹\u001c4\u001d·«3\u0002®å)Ó¥§ ã£d_nÚ\u0081UÊÑZL¡Ï.KµÆùA\u000fý×x®û\u0013wNòãm²é,d{ç\u0001c\u0002\u001e\u0017\u0099:\u0015\u0015\u0090E\u0013\u0003\u008f¶\nÝ\u0085¥\u0001H¼ø?\u009b»`6ä±O-\u0083¨\u0002+Æ§ \"ZÝ\u008aY\u0088ÔûW\u008fÓ\u000eN ÉlE\u0019À\u0010C\u001fÿyzòõíq\u000bì1o\u0090ëÉfÓáE\u009d¥\u0018¬\u009bt\u0017â\u0092È\r_\u0089ð\u0004~\u0087\u0086\u0003\u0099¾S9bµ\u00070/³5/\u001cª+%â¡-\\Bß«[ÐÖÉQ\u009aÍ!H>Ë\u0084G³Â\u0007}rùÉt\u009b÷[sQî\\i½å³`\u0007ãq\u009fj\u001a9\u0095\u008a\u0011»\u008cô\u000fÖ\u008b\n\u0006\u0002\u0081ü=\u0005¸\\;8·Ö2;\u00adD)\u0003¤õ'Ù£±^\u000bÙÃUTÐ½SºÏ¹J\u0081Å\u001fAiüÿ\u007fºû-vöñim\u0080èÞkþçCb\u008f\u001d<\u0099l\u0014\u0010\u0097T\u0013`\u008eY\t°\u0085h\u0000Æ\u0083\u0080?ÿº\u00965Ï±<,\u0094¯È+Ü¦é!AÝ×X(Û\u0080W\u009cÒ°MòÉôDðÇ\u009bB`þ=yòô@pÉóÐniê_e\u0015à\u008a\u009c|\u001f\u0096\u009a]\u0016g\u0091Ë\f\u0090\u0088\u0005\u000b\u0088\u0086B\u0002&½¢8o´\u008b7Ô²Z.\u008f©¼$e ¶#èÞ\u0002ZþÕWP\u0087Ì\u00adO\u0005ÊÀFgÁà|Òøü{¢öGr-í\u0013hvä·góâÊ\u009e@\u0019º\u0094ã\u0010\r\u0093\u0016\u000e.\u008a(\u00053\u0080Ø<\u001a¿\u001e:\u001b¶!12¬â(\u008c«\u0019&d¢R]ªØ¿Ty×zR1Î\u009bIäÄ>@¦Ãý~\u0088ú\u001du¡ðÓlZï\u000ejåæ\u0083a·\u001cû\u0098ã\u001b!\u0096\"\u0012é\u008d-\bÒ\u0084¡\u0007À\u0082´>`¹X4\u0097°õ3í®c*\u0006¥\u0010 \u0005ÜÙ_ûÚ¦VBÑ¸LÆÈ[K·Æ\u0090B\u0001ý\u0013x\u0094ô(w\u0083òßnúéVd\u0017àýc{\u001en\u009aµ\u0015U\u0090r\f\u0083\u008fÌ\n²\u0086¶\u0001\u0082¼28|»ø6¨²ð-\u009f¨ë$§§)\"\u008dÞNY\u0097ÔÔPgÓ:NDÊ×EñÀ!|Ðÿ@z\u001cöçqeìXhLë\u0001fFâè\u009dó\u0018\u0018\u0094Ð\u00179\u0092¨\u000e\u007f\u00896\u00044\u0080\u0085\u0003/¾R:ãµ¿0M¬\u009d/Ìª»&\u001d¡Ê\\yØ\u0097[ôÖPR\u000fÍ\u0088H¡Ä{GWÂö~\u001aù÷t\rð snîYj×å\u0011`I\u001cä\u009f\u009d\u001a}\u0096S\u0011\u0004\u008c\b\bÄ\u008b«\u0006S\u0082ß=\n¸/4\u0098·\u008723®ª)µ¤w \u0098£j^\u0002ÚÉU\bÐ¨L\rÏ\u009aJ3Æ\u0096A\u000bü»x-ûÂv\u008dòÈmºè:d[çèbh\u001eë\u0099x\u0014ö\u0090í\u0013´\u008eÌ\n¢\u0085Õ\u0000¦¼ß?£ºT6Í±\u0012,°¯ê+¾¦*!#Ý\u0013X\u0005Û©W»Ò)MgÉñD¬Ç!C\u008aþxy$õ\u0090pYó\u008boÙê6eWá\f\u009c8\u001f#\u009bÎ\u0016³\u0091\u001a\rY\u0088}\u000b(\u0087½\u0002\u0015½?9\f´\u00017 ³Y.Æ©¡%E Þ#iß,Z@ÕMQþÌ\u0007OdË FÊÁÅ}\u001aøi{\u009a÷5r\u0080íöi\u0094ä2gzã\u0095\u009e\u009b\u0019ü\u0095\u0081\u0010=\u0093X\u000f¼\u008aG\u0005ç\u0081û<\u0080¿\u0016;\u0090¶k1S\u00ad¡(¿«5'\u009f¢À]°Ù.T[×\u0003SBÎ\rI£Å\u0005@@ÃZ\u007fÉú\u009buµñ\u007fl\u000eïÆk\u009fæ\u0088a4\u001d6\u0098\f\u001b\u0001\u0097½\u0012r\u008d\u0080\tY\u0084\"\u0007%\u0083½>Ý¹\u00925U°\u00153â¯$*\u000b¥\u000e!kÜ\u0017_ûÛ·V$ÑIM÷È\rKåÇ\u0000B\u008cý\u008fy9ôÉw¹ó\u0002nèé)età2cè\u001f½\u009aû\u0015\u000f\u0091Ü\f\\\u008fÄ\u000b\u009a\u0086ÿ\u0001£½$8\r»Þ7ò²3-c©q$\u001f§»#ÐÞ\u001dY\u008aÕÃPÒÓ\u000bO(Ê.E2Á¬|wÿ«{Ãö\u0086q=íåh\u0092ëñg¸âÇ\u009dy\u0019ø\u0094E\u0017Æ\u0093F\u000eÐ\u0089G\u0005\u0091\u0080\u009e\u0003ù¿ë:¢µ\u00991#¬%/q«â&\u0084¡É],Ø\u001f[F×éR¡ÍªI\u0017Ä\u0088GûÃV~òùQu#ð\u0018sºï\u0094j\u009bå%a~\u001ca\u009fÀ\u001b»\u0096V\u0011À\u008d`\bÙ\u008bj\u0007j\u0082w=8¹\u00074t·û3@®\u0003)&¥B t£N_\u0000Ú¹UºÑ\u0089LäÏÊK\u0084ÆRA\nýòx°ûvwºòûmSé9d/çôcú\u001e-\u0099ã\u0014î\u0090Ý\u0013þ\u008e\u000f\nH\u0085û\u0000-¼m?\u0019ºW6\"±\u0080,\r¨\r+C¦\u0093\"ýÝvXÏÔ\u0012W¿Ò\u0004NQÉðD{À@CÅþ\u0012z\rõ2p|ì+o7êäf¨áo\u009cÖ\u0018\u0012\u009by\u0016%\u0092¿\rR\u0088f\u00041\u0087.\u0002\u0083¾\u00859£´?0\u001e³8.\u009bªg%ì ³\\Bß¼ZCÖ\u0097Q®Ì_H¨ËvFRÂ\u0093}ûø\u0099tç÷ rÔî\u0017i¤ä¢`ßã¥\u009eþ\u001a\u001b\u0095ñ\u0010\u0086\u008c\u001f\u000f´\u008aV\u0006?\u0081´<«¸\u0097;;¶ã2Æ\u00adè(³¤)'/¢Ç^»Ù3T¢Ð(SÕÎ1JáÅ\u0081@\u009füK\u007fÄú1v!ñ\u0014lùè\u0087kõæ\u008eb'\u001d#\u0098\u0019\u0014Q\u0097ç\u0012Ï\u008eì\t\u0012\u0084+\u0000i\u0083î>Eº³5G°º,)¯\u0012*~¦Í!´Ü»XÑÛ¯V\u001aÒ\u0098M^È\u0097D2ÇÜBwþ\u0013yðô`paó}n\u0087êheäàp\u009c\u0016\u001fd\u009a¯\u0016\u0017\u0091ú\f\u0091\u0088ý\u000bo\u0086d\u0002P½/8%´\u009e7K²W.o©å$§ v#\u009bÞÏZ\u0011Õ6PÖÌ\u0006OÓÊ}F\u0088ÁW|öøL{\böfr)íîh\u0004äµgZâ \u009e\u0003\u0019\u0087\u0094J\u0010\u0088\u0093-\u000e×\u008aÇ\u0005\u000b\u0080ÿ<\u0004¿\u0007:t¶G1¬¬U(;«á&Ù¢¯]ÆØ\u0012Ty×NRIÎaI\\Ä>@ðÃ\u0013~\u0085ú¤unðâlÍï jyæ3aÊ\u001cd\u0098;\u001b°\u0096Õ\u0012T\u008dì\b£\u0084×\u0007Ç\u0082H>9¹Â4 °\u00913\u0014®ç*j¥B \u0084Ü\u007f_iÚïVùÑBL:\u009cì\u001f\u008c\u009aq\u0015à\u0091\n\f^\u008fh\u000b%\u0086\u0080\u0001)½78ª»þ7\u001d²;-\u0019©\u0015$ñ§ú#ôÞªYlÕÔP£ÓÉOzÊpEéÁº|ÿÿÏ{\u0093öäqAíxhbëægÚâÛ\u009dÔ\u0019Q\u0094x\u0017L\u0093\u0013\u000e©\u0089¯\u0005D\u0080I\u0003ö¿\u0005:Cµµ1\f¬s/q«}&Ë¡;]pØ%[ ×%R*Í?I·ÄÎG\u0004Ã\u0083~Ãù!uPðås&ïtj\u0014å\u0093aî\u001cå\u009fl\u001b·\u0096ô\u0011ñ\u008d°\b§\u008bü\u0007\u008e\u0082'=V¹{4p·\u00063¾®\u000f)1¥ü Â£ð_\u0013Ú\u0003UDÑ³LëÏíKªÆwAEý5xµû¯w\u0091ò\u0013m`éËdFç\u0091c·\u001eû\u0099B\u00150\u0090v\u0013´\u008fÌ\n\u001e\u0085\u0019\u0001\u009b¼f?s»\u00826E±K-\u0002¨\b+Õ§ø\"\u0086ÝjYdÔ\u0083WbÓ<NGÉÙEhÀ\u0080CÊÿjz{õ·qWì\u0011o\u008aëAf1á\u0007\u009dP\u0018i\u009bo\u0017h\u0092Æ\r\u009e\u0089ã\u0004(\u0087ý\u0003õ¾$9¤µ=0\u007f³e/\u0007ª1%\u0019¡Ç\\ìß\u0092[<ÖþQ2Í×H8ËùGoÂþ}[ù\u0019të÷\u0082s÷îùiÄåû`\u001dãü\u009f\u001f\u001aB\u00953\u0011Ý\u008cF\u000f¯\u008b\u0086\u0006\u009c\u0081\u000b=!¸\u0001;I·\u001b2è\u00adÿ)®¤a'¢£Î^ÔÙµU+ÐLSúÏ~J\u0002Å¼Arü¬\u007f¼ûºv\u001bñòm\u0016èhkGç:bä\u001dë\u0099$\u0014=\u0097¤\u0013\\\u008e\u0017\t4\u0085C\u0000ï\u0083ª?Ôº45\u0083±\u0013,2¯×+¹¦©!vÝôX\u0000ÛÈW\u001cÒùMhÉéDêÇ\u001fB1þþyúôWp+ó\u001fn1ê\u0099eUàg\u009c\u0083\u001f~\u009a\u001a\u0016\u0014\u0091\u007f\fc\u0088\u001a\u000b\u007f\u0086Þ\u0002\u001d½¶8Ö´07Î²½.\u001c©_$\t \\#¤Þ\u0017ZªÕñP\u0083Ì&O,Ê\u0099F~ÁC|\u001bø\u0080{=öMrUí\u0016h±ä\u009eg\u0095â\u0007\u009e£\u0019ë\u00941\u0010Ó\u0093@\u000eö\u008aì\u0005\u0082\u0080W<K¿C:\u0099¶f1D¬T(×«j&³¢Ù] Ø\u0013TÇ×\rR\u009cÎêI\\Äý@\u0019Ã\u0084~(úTu5ð5l³ï\u0004j8æ;a¼\u001c{\u0098t\u001b±\u0096\u00ad\u0012ê\u008d8\by\u0084)\u0007\u0099\u00824>ì¹V4<°C3×®Ù*÷¥Ò \u0019Üå_ÑÚÖVÍÑKL¸È(K\"Æ\u008bB\u0090ýixYô!w)ò\u0089n éÛd'à\ncX\u001e\u0001\u009a\f\u0015¼\u0090\u0003\f³\u008fÝ\nG\u0086(\u0001R¼t8!»I6*²\u0089-ý¨m$g§?\"9ÞSYcÔ%PFÓ¯N¯ÊãEqÀ1|Iÿ[zÓöÓqwìEh@ë)fÆâ*\u009dÏ\u0018¼\u0094Å\u0017ª\u0092ã\u000e\u0082\u0089Ó\u0004u\u0080\u0096\u0003(¾¶:\u000fµ®0ý¬C/¯ªÍ&\f¡!\\gØz[*ÖÏR=ÍÃHsÄoG\u0016ÂÞ~\\ù)t\u001fð`s\u0001îGjfå£`9\u001c~\u009f|\u001aq\u0096<\u0011¾\u008cÑ\b\"\u008b,\u0006\u0001\u0082¸=\u0006¸B4¦·}2Ý®y)Â¤¹ :£I^:ÚòUãÐ:L\u0017Ï_JÄÆªAAüBxTû§v\u008aò\u0092m\u0017è4dkç\u00adb6\u001e®\u0099*\u0014|\u0090â\u0013\u0096\u008eó\nÅ\u0085k\u0000~¼ò?\u0081º96\n±A,Í¯®+\u0086¦P!=Ý3XÇÛâWÜÒ\u0087M§ÉøD@Ç\u0083C\u0099þ)yÅõdpàó\u0098o\u008fêIe~á\u0086\u009c\u0014\u001f\u0088\u009bé\u0016+\u0091\u008e\r?\u0088e\u000b,\u0087Ð\u0002ò½¶9ª´\u000b7 ³C.\u0081©î%Ø \u008a#]ß7ZøÕMQ&ÌfO\u0014Ë<FVÁy}\u0097ø\u0088{,÷£r\u000eíXi\u0017ä0gÓãQ\u009e\u0018\u0019ð\u0095K\u0010ý\u0093\u0095\u000fA\u008a7\u0005\u0018\u0081è<²¿a;\u0002¶*1ó\u00adÇ(Â«\u0006'¡¢ó];ÙVT»×¶SXÎ\u0087IîÅp@\u0000ÃA\u007fýúQu\nñ\u001cl*ï/k\\æ6ao\u001dþ\u0098¯\u001bC\u0097@\u0012\u009a\u008d¤\t|\u0084z\u0007¥\u0083\u001e>l¹V5r°p3\u0084¯\u0001*é¥è!vÜä_9Û\u0012VµÑ MhÈ|KIÇCBBý\"y\u000fôðwÙóÎn\u0093é@e\u0000à3c>\u001fM\u009a\u009f\u0015\u0090\u0091\u0094\f¬\u008fý\u000bW\u0086Æ\u0001%½\b8\u008e»\u001d7\u0000²\u0019-s©\u001c$O§\u0007#íÞtY`ÕxP.ÓëO3ÊXETÁP|¯ÿõ{³ö\u00adqßí\u0006h\të\u0000gïâÒ\u009d§\u0019\u0083\u0094Ê\u0017\u0007\u0093B\u000eò\u0089&\u0005l\u0080?\u0003\u0019¿~:(µ?1p¬¦/\u0094«å&ð¡ô]îØ¯[o×LRÅÍÄI\u001dÄ-GãÃ_~rù¶uZð\u000esºï\u001djNåýa`\u001c[\u009f\u008e\u001bw\u00964\u0011d\u008d\u0013\bw\u008b\u0018\u0007\u008a\u0082f=Í¹ã4^·¿3K®=)¿¥ö X£¡_FÚÚUýÑ\nLöÏRKõÆ\u0019A'ý0x}ûRwJòem\u0086é\u0085d\u0010çþcd\u001eõ\u0099ú\u0014F\u0090ª\u0013z\u008e1\nÝ\u0085+\u0000D¼I?\"ºì6+±*,\u0089¨ +?¦\u008c\"\u009aÝ½XUÔzW^Ò\u0014N É·DâÀ¥CÖþ»zrõ5pîì\u0099oßêúf£á\u0017\u009c\u0095\u0018þ\u009bÕ\u0016\u0005\u0092E\r\u009b\u0088^\u0004\u0018\u0087\u0019\u0002Z¾f9¸´\u009300³5.¥ª\u009e%w \u0082\\3ß4Z=Ö>QãÌ¿H\u008bË\u008aFÅÂ}}\u0088ø\u000bt]÷Êrfî8iUäÓ`\u008fãý\u009e\u0003\u001a.\u0095ü\u0010È\u008cv\u000f\u0085\u008a\u008b\u0006¬\u0081\u008b<Á¸\u0083;ð¶«23\u00adF(\u0096¤\u000f'p¢~^\u000fÙ2TâÐ\u0084S\u007fÎ\u0080J{Å7@sü\u0093\u007fVúØv\rñ,lÎè»k\u0013æ®b\u008f\u001dz\u0098o\u0014¾\u0097Ø\u0012È\u008eD\tè\u0084@\u0000¡\u0083¸>'º¾5s°',U¯Ä*F¦:!ñÜzX\u009dÛ\u008eVXÒ\u001fM[È\u0083DÀÇýBùþ\ny\u0017ô}pÍó\u0088n\u0080ê\u0097e:à\u0099\u009c\u009a\u001fÞ\u009a&\u0016Ö\u0091d\fÀ\u0088r\u000bÂ\u0086´\u0002\n½\u000f8ë´\u00137\u0016²Ç.\u0003©I$Á '#KÞLZvÕ\u0088P\u0099Ì\u0004OsÊtFoÁ9|\u0097øk{)övr\u0007í±hQä\u001agwâ\u0092\u009e\u0017\u0019Ï\u0094å\u0010£\u0093\t\u000em\u008aD\u0005\u009c\u0080U<\u008b¿Z:\u0010¶þ1k¬Ï(Q«x&R¢Ü]±Ø\u001aT§×\u0089R\u0019ÎKIÿÄñ@\u001bÃ\u0083~\u009búcu\u0080ðÛléï_j{æ½a^\u001cb\u0098\u0099\u001bt\u0096Ò\u0012ö\u008dÆ\b·\u0084¯\u0007ð\u0082o>,¹ú4Ø°S3Ò®\u000e*²¥¨ 6ÜN_\u008aÚ*V\u0099ÑèL\u009cÉ{J2Ï\u000f@\u0099ÄÍYÀÚ\u0004^²Ó\u000bT\u0089èÝm¹î9b\u000fç\u0016x!üÞq\u0016ò vå\u008bë\fK\u0080»\u0005@\u0086\u0089\u001a\u0099\u009f\u0092\u0010¹\u0094Ó)©ª+.¡£Ú$&¸É=\u0004¾â2^·4È\u0080L3Á\u0014B`ÆÖ[ÁÜ£PÊÕ\u0001Víê2o;à¢d{ù\"z2þYsCô^\bû\u008d\u0013\u000eà\u0082v\u0007\u0012\u0098D\u001c_\u0091\u0014\u0012¸\u00965+\u009d¬¨ \u007f¥\u0091&èº\u0080?å°Ï4vI\u007fÊ\u0099N\u001cÃûD\u008eØ¼]=ÞËRs×\u0017h·ì\ba/â\u0089f]û\u001c|Úð£u\u009dö\u001b\n\"\u008f\u0003\u0000Ø\u0084Þ\u00199\u009a÷\u001eà\u00936\u0014P¨C-|®E\"D§\u001c8¾¼\u00811õ²Ê6\u0081KTÌ\u0084@¼ÅqFóÚ\u0001_\u0019Ð\u008dTnéëj5î\u0086cLäßxRý#~\u009fò\u001aw\u0099\u0088\u0099\f\u007f\u00816\u0002J\u0086¨\u001b\u009d\u009c\n\u0010Ö\u00957\u0016äªk/¬ ¦$\u009b¹H:6¾I3Ë´eÈÞM·Î_BÝÇ\u001eX\u008eÜ¥QÙÒËVtëÏlBà'e¬æ\u0014z)ÿµp\u008bôx\t®\u008a.\u000eV\u0083\u008e\u0004x\u0098\u0084\u001d\u001a\u009e½\u0012©\u0097\u0015(9¬¨!v¢å&¶»M<\u008f°B5&¶DÊ¢O1ÀõDuÙdZaÞ:SãÔ\u000bh?ísn\u008eâíg\u0081ø¬|Ëñ\u0085r\u0019öh\u000bÙ\u008cÊ\u0000_\u0085±\u0006\u0080\u009a¹\u001f\u0004\u0090x\u0014J©ä*A®\u0083#ò¤\u00158µ½\f>m²]7·H\u0019Ì\u0099A\u0013ÂäF©ÛA\\ÄÐ&U»Ö1jÓïb`òäçyÚúÌ~ÊóQtx\u0088N\rë\u008eh\u0002\u0019\u0087ö\u0018ã\u009cs\u0011\u0002\u0092\u0017\u0017\f«\u0002,\"¡\u001e%=¦\u0096;f¿\t0\u0084µ¹ÉãJÁÏòCbÄKYYÝ>^¥Ó\u000bWUè¤m¶áJbïç\u0003{\rüýq½õNvú\u008bl\u000fB\u0080\u0096\u0005©\u0099»\u001a)\u009f \u0013/\u0094\u0093)h\u00ad¤. £W'R¸\t=Ë±F2k·ÐËéL8ÁïE\u0013Æ¾[¨ß\u00adP,ÕìiiêÁo\u0091ã\u00add\\ù\\}ðþQsÔ÷Ë\b\u0000\u008d\u008e\u0001¢\u0082Î\u0007\r\u009bW\u001c\u0090\u0091\u0092\u0015è\u0096\u001e+¾¯\u0080 f¥Å9qº\u001f?v³ù40I?ÍðN»Ã¹G\tØì]\u001aÑ\u0093Rß×\u001ek\u0005ìÆaçåKfêûª\u007f®ð\u0017uÔ\u0089ª\nÃ\u008fµ\u0003Y\u0084Ú\u0019=\u009dl\u001e\u008c\u0093¤\u0017Ö¨ö-D¡~\"+§L;\f¼ý1&µ\u001a6»KÜÏ}@kÅgY3ÚÒ_ãÓìTzé9mKîïc\u009eç\u0002xÅýIqþò_w\u009f\u008b8\fK\u0081)\u0005~\u0086B\u001b²\u009fU\u0010\u008a\u0095·)\u008eª\u008c/Ò£\f$\u0019¹\u0082=Ï¾Ø3U·\u009dÈZMhÁ>BµÇÕ[fÜÙQÍÕöVVëPoÂàîe+ù@z\nÿísaôÓ\tk\u008dr\u000e\u0013\u0083\\\u00077\u0098\u008d\u001d\u00ad\u0091×\u0012\u008b\u0097ñ+b¬\u0095!¿¥¯&\u0080»G?ì°R5ÇI·ÊªO_ÃÆD Ù\u0004]ÖÞØSD×ÕhëíÄa\u008bâÝg\u001dû\u000f|tñ\u0014u\u001eö'\u000b?\u008fï\u00006\u0085\u001a\u0019_\u009aZ\u001f<\u0093ø\u0014r©\n-Þ®i#*§\u00988\u0006½L1§²§7\u00adKôÌ3AÀÅõFFÛý_\u0085ÐæU6é\u008ejÎï©c_äÔy\u0082úR~³ó¼t\u0087\u0088Î\r¿\u008eº\u0002\u0015\u0087P\u0018Q\u009cY\u0011E\u0092t\u0016\r«\u0090,Ï T%u¦\u008a:<¿r0#´5ÉIJ\u0083Î\fC\u0003Ä.X.Ý|^aÒèWÝè\nl·á\u008cbýæ\u009e{\u0098ü#pÝõÕvZ\u008aË\u000f½\u0080f\u0004P\u0099Ò\u001a\u009c\u009e4\u0013 \u0094¡(?\u00ad\u008b.7¢w'<¸\u001a<ò± 2$¶áË³LëÀ,EïÆPZ\u0089ß*PÇÔÎi\u0099êýn\u0018ã\u008bdËør}dþùr\n÷x\b©\u008c\u0094\u0001K\u0082V\u0006é\u009b)\u001c<\u0090\u001d\u0015ß\u0096²*\u0088¯X ú¤ß9\u0013º\u008e>ô³34vH\u0005Í\u0011NµÂìG]Øp\\ZÑ\u001cR\u0016Ö?k:ìù`4å\u0089f#úR\u007fÅð+t\u0086\u0089¿\n\b\u008e/\u0003\u0083\u0084U\u0018\u001b\u009dJ\u001e\u0013\u0092§\u0017ï¨ð,1¡9\"\"¦\u0098;É¼D03µÙ6}J\u001dÏÈ@cÄvY}ÚÏ^ÕÓùT¤ètmuî\u0098bæçYxHü\u001eqUò/vÆ\u008bÂ\f\u001f\u0080§\u0005×\u0086\u008b\u001a\u008d\u009f\t\u0010*\u0094û)=ª\u001e.\u0007£¯$¾¸Î=ú¾P2×·ÍÈÀLèÁÁBiÆD[çÜ\nP\u009eÕ\u001cVbêÌo;à:d.ùIz\u0012þXsðô\u0094\bÁ\u008d\u008a\u000en\u0082=\u0007¸\u0098¤\u001cá\u0091q\u0012¤\u0096p+\u0095¬ø =¥\u001b&¥ºD?q°Í4SIDÊ\fN\u001eÃ\u0097D÷Øû]\u001cÞÆRï×Åh¦ìÏaDâ~f,û+|Xð(u\u008fö\u0017\n¥\u008fí\u0000Ð\u0084\u000f\u0019n\u009a\u0084\u001e\u009c\u0093Ï\u0014W¨ã-k®K\"\u001c§\u00878\u0083¼o1·²\u00ad6\u0098K÷ÌoAúÅâF$Ûó_ÏÐYU\u0011éþjÀï)câä\u0080y\u001fýa~ùó\u0085wË\u0088\t\r«\u0081?\u0002f\u0087\u000e\u001bó\u009c\u0095\u0011M\u0095¥\u0016p«\u0000/\u009c }%\u008c¹\u0016:Û¿b3\u009e´PÉ\u008cM÷ÎbC\u009fÇàX\u0096Ý_Q\u008eÒFW¼ë0l@á&e\u009dæË{-ÿzprõ\u0000\tq\u008aÔ\u000f\r\u0083ò\u0004\n\u0099Ô\u001d]\u009e\u009f\u0013¿\u0097`(±\u00adá!Â¢ü'ì»\u0004<K±Ý5\u000b¶{ËqOÖÀ\u0006E=ÙaZbß\u001fS\u0015Ôçiíí\u000enÜãØgDøâ}/ñkrÃ÷)\u000bV\u008c%\u0001C\u0085\u0097\u0006_\u009bl\u001f\u000e\u0090Ó\u0015ÿ©M*Ò¯~#Ø¤è9ï½\u0001>ë³ð7ºHÁÍèA\rÂ¹GxÛâ\\\u0018ÑíU¾Ö®k\u0005ï{`}å\byiút\u007fUóat¦\u0089ö\ræ\u008e\u0097\u0003\u0087\u0087\u008f\u0018{\u009d0\u0011û\u0092À\u0017ë«Ý,-¡,%U¦Ç;\u009e¿\u00070Ðµ[ÉIJ\u008cÏ¿CÏÄ\u008fYÓÝ\u009d^\\ÓCW\u0099èjm2á\u0080bØçN{\u0007ü\u001dq÷õ¹vf\u008bÍ\u000fL\u0080ì\u0005e\u0099\u0016\u001a\u0017\u009fÌ\u0013\u0082\u0094X)\u0013\u00ad¥.ë£e'ª¸\u0091=Ü±p2ë·²Ë>L=ÁOE\u0098Æ#[sßæP¾Õ¡i\u0004ê_o\u0094ã\u001ddøùç}lþ\ts0÷¹\b=\u008d\u0019\u0001\u0098\u0082x\u0007ª\u009b.\u001cß\u0091*\u0015T\u0096Ü+:¯\u0012 ä¥s9Eºþ?Í³´4tI¸Í\u001bNbÃ\\G\u008bØ@]öÑ\u0090R8×?k\u001eì9a\u0091å\tfKû©\u007fYð\u000fuJ\u0089Q\nO\u008fø\u0003Ì\u0084[\u0019h+ë¨¿-\u008b¢;&z»}8ÿ¼\u00801æ¶i\në\u008fP\f\u001f\u0080¤\u0005\u0091\u009a-\u001e~\u0093Ô\u0010ô\u0094\u0012i°îÕb(çId\u0087ø<}¦ò¯v-Ë¸HèÌXA[Æ\u0090ZÛßÇ\\àÐ°U\u0083*X®¤#Ã P$Â¹X>K²¡7\u0090´\u0088\b|\u008du\u0002´\u0086h\u001b\u0019\u0098\u0003\u001c,\u0091A\u0016\u0099ê\u0099oAì!`\u0012å\u0097z þ\u0000sÛð\u000et\u0015É|NüÂIGKÄ²XCÝ\u0092RÖÖ\u008e«j(\u0013¬>!Ô¦\u0002:\u0001¿|<\u009d°x5i\u008a\u000b\u000e¾\u0083ã\u0000Á\u0084Ü\u0019\u0082\u009e\"\u0012ä\u0097®\u0014Zè\u001dm5â¬f¿û\u0005xÛüèqçöõJ\u009fÏxL\u008bÀrE%ÚÆ^DÓìP±Ô\u0001©Þ.\u0013¢\u0011'^¤\u001c8Ö½ò2ë¶\u0092\u000bï\u0088$\ft\u0081\u008d\u0006¶\u009aD\u001f\u001d\u009c \u0010S\u0095©j¯î¡c·à\u0088d!ù\u000b~Tòtwîô*H~Í\u0097BZÆÃ[FØæ\\-Ñ\u008dVé*)¯\u0083,\u0012 \u0088%4ºm>\u0004³³0P´\u0004\tª\u008e±\u0002#\u0087o\u0004,\u0098¨\u001d\u009b\u0092\u0083\u0016\u0003ë$hÏì\raræ\"z\u0014ÿ\u001d|\u0098ðeuìÊ\u000bNQÃo@\u009eÄÌY\u008aÞïRL×hTa(!\u00ad\u0000\"Ú¦,;Ð¸ú<\u0013±\u00866G\u008a\\\u000fî\u008cv\u0000Ó\u0085#\u001a7\u009eA\u0013©\u0090Ì\u0014÷écnUâ\u0089g=ä\u009exNý*r\u0086ö°K@È©LôÁ\u008eFÙÚq_\u001fÜDPõÕÏª\u008d.\u0097£\u000b r¤#9\u0088¾³2ã·\u007f4\u0092\u0088\u0089\r¶\u0082.\u0006}\u009b;\u0018¾\u009c\u0084\u0011ñ\u0096Ñj\u008fï\u0097l\u00adà¿eVúë~Só\u0090pªõ\"I\u0092ÎwC\u009dÇ]DÿÙæ]?ÒðW>+Í¨å-\u0083¡¹&\u0089»\u0082?\"¼õ1±µÓ\n\u0083\u008f\u0017\u0003\u0006\u0080Ñ\u0005¥\u0099U\u001e0\u0093¢\u0017r\u0094xi\u0098í\u0010b\u0090ç^{\u000bø\u001c}Zñ#v\u0082Ë·OlÌVA,ÅµZ¢ßÇS×Ð¬U°)_®à#U§\u000f$ý¹é=7²\u008b79\u008bý\b£\u008d\u000f\u0001á\u0086ö\u001b\u0094\u009fb\u001c;\u00911\u0015\u0010ê\u0004oäãÁ`\u009eå\u0088yJþás\u007f÷}t|ÉxMýÂ«GiÛ(XsÝ$QhÖ\u0087«a/%¬g!·¥\u0013:\f¿\u00873\t°Ê5(\u0089g\u000ex\u0083©\u0007ý\u0084ý\u0019\u008a\u009dÚ\u0012÷\u0097=kìè*m\u009dáûf\u008fû\u008e\u007fMü\u0099qaõ@J\u0007ÏFCÁÀÆE\u0011Ùb^¬Ó\u0014W\u0093Ô(©t-\u00ad¢\u0083'Õ»ª88½O1U¶?\u000b)\u008f©\fÚ\u0081\u0081\u0005\u0082\u009aÁ\u001fÞ\u0093ã\u0010\u0001\u0095 i9î\\cþç`d\u0016ùú}Ûò\u0006wYËºHaÍ:AvÆ\u0086[þß\u0018\\!ÑØU\u009b*Â¯D#\u0095 \u0095%>¹A>Ê³`7\u0085´>\ti\u008dÖ\u0002m\u0087I\u001b\"\u0098\u001a\u001da\u0091{\u0016ôë©oºì\u0011a\u0087åCz\u001dÿSs®ðòuyÉªN\u008aÃXGÝÄÿYðÝïR\u008c×9«³(x\u00ad\u0087!ñ¦Ú;È¿±<M±ä5¦\u008aç\u000f\u008e\u0083É\u0000À\u0085\n\u0019\r\u009eÐ\u00139\u0097U\u0014ÌéÁm\u0085â\u0092gçûóxÌýÎq_ö|K\u008bÏsL¥Á\bEºÚ-_<Ó6P\u0010Õ\u0010©¢.Æ£Ê'Y¤õ9.½@2Ã·T\u000b\u0013\u0088F\r\u0004\u0081\u0004\u0006¨\u009bÿ\u0018½\u009cÈ\u00118\u0096\u008djòï~l\u0016àÀe\u0003úF~ùóàp\u0095ô\u0088I\u0004ÎbBjÇ¤DAØI]TÒ\tV\u0088+\u0000¨Ñ,h¡\u0098&¸º¢?'¼À0pµ(\nC\u008eë\u0003'\u0080I\u0004\u0017\u0099Ò\u001eÂ\u0092¯\u0017\u0087\u0094lh\u0000íæbúæ«{åøÓ|\u0090ñÒvÄÊÑO^Ì¸@àÅ\u001aZ·Þ>SSÐ6TF)\r®Ë\"\u007f§0$\u001e¸¿=Ñ²56^\u008bû\b\u001b\u008c\u0085\u00019\u00863\u001aÊ\u009f_\u001c¸\u0090\u0001\u0015\u0002ê\u008an£ãD`\u0094ä\u0087yýþ\u00adr¼÷\u0014tòÈ>MõÂ}FAÛ\"XjÜaQ~Ö½ªy/ö¬I £¥§:®¾b3\u0099°ä4t\u00898\u000eI\u0082\u001e\u0007¿\u0084S\u0018ß\u009dî\u0012=\u0096îkyè\u008el¸á\u008cf6ú»\u007f\u0017üDpªõñJ©Î=CNÀ\u0014DKÙî^xÒüW\u0012ÔÇ¨¾-£¢Ò&Æ»ì8ð¼^1\u0000¶\u0003\nZ\u008fÛ\f\u0081\u0080f\u0005q\u009av\u001e\"\u0093é\u0010\u008d\u0094oi\u001dîXb\u0097çÅd^øl}Ãòjv\u0011Ë¾HâÌSACÆ¥Z\u007fß»\\\u000eÐ¥UÇ*+®ó#Î \u0099$©¹Å>'²A7\\´[\b\f\u008dí\u0002r\u0086A\u001bB\u0098â\u001cî\u0091Ð\u0016\u0094êBoÿì\u008a`ÍåÙzûþ¦sÐð©týÉ'NBÂQGkÄ>X\bÝ\u0016RûÖò«l( ¬û!f¦U:\u0089¿Ë<À°¸5Î\u008a·\u000e{\u0083È\u0000)\u0084ä\u0019V\u009eÐ\u0012ç\u0097§\u0014\u0018è&mCâíf2û+x\u001dü\u0097qzö\u0095JÙÏLL\u009bÀgE\u001bÚ\u0088^\u0097Ó\u0081P\u0082Ôv©Z.r£Ý'J¤\u008e9\u0091½½2\u007f·\u0086\u000b\u0082\u0088Ù\rR\u0081×\u0006Ç\u009bÇ\u001fÊ\u009c\n\u0011§\u0095zjðï¶c[à°e©ù,~\u0003óÙw]ô¯ItÍ®B§Çª[öØå]ÎÑEVZ+\u0081¯Å,Å¡ø%éº-?\u0013³]0¯µ¢\t¾\u008eJ\u0003õ\u0087\u008a\u0004Y\u0099\u0015\u001d\u001d\u0092½\u0017\në4hàí&a\u008dæ\u001c{Þÿ«|²ñ\tu\u008cÊ@O\u0086Ã±@\u0016Å,YQÞÜS[×ôT@)9\u00ad±\"<§y;ª¸\u009e=Ü±l6²\u008bd\u000f]\u008c9\u0001ì\u0085\u0095\u001aÙ\u009f®\u0013±\u0090\u009d\u0015AéÊnuã\u009eg\u009bä±y\u0080ý®r\u0088÷gK\u007fÈ\u0006M9Á\u009aF*Û`_0Ü\"QðÕTªÿ/\u0098£D \u008b¥Ã9ã¾Ø3¨·\n4\u0091\u0089e\rG\u0082k\u0007ã\u009bN\u0018Þ\u009dw\u0011ö\u0096\u001bkzï\u0096l(á\u0006eoúO\u007f\u009fó\u0005pýõÓI-Î\u001aC\u0081Ç¾D\u007fÙ\u001d]×Ò;WE+.¨H-ý¡c&ð»L?Þ¼21üµ[\n¬\u008fo\u0003Ç\u0080f\u0005D\u0099\u001c\u001e\u001c\u0093é\u0017=\u0094¦i\u0013í\u001abòçO{\u001eøµ}åñ\u0000v ËnOcÌZA\tÅ7Zlß\u008aSUÐ\u0089Uñ)\u0007®(#?§5$T¹\u0005=\u0096²n7§\u008b\u001c\bp\u008dn\u0001\u0000\u0086Ì\u001b\\\u009fÌ\u001cÍ\u0091Ã\u0015\u001aê\u0091oÍãÓ`\u0088å1yûþ\u0087sÚ÷¦tWÉçM\u0016Â\u0000G5ÛÕX\u0082Ý1QDÖK«v/o¬\u0019!Â¥\u0001:¯¿á3\u0089°Y5¼\u0089ù\u000e\u0087\u0083-\u00077\u0084´\u0019Â\u009dÊ\u0012£\u0097©kAè\u0010m:áªf\u0089û/[ÆØá]óÒÍV\u009dËÕH\"Ì¡AUÆMz\u0004ÿp|æð\u0082udêÜn/ãÚ`\u0089ä,\u0019T\u009e\u0089\u0012s\u0097æ\u00144\u0088¹\r\b\u0082Í\u0006G» 8?¼»1\t¶6*¹¯Ø,Â Ñ%NZ\u0085ÞüSÿÐ\u009aTIÉ0N©Â\u001eG\u009fÄõx\u0004ýMrÝöÿk»è\u0098l á¶f\u0081\u009a8\u001f\u0089\u009cV\u0010Ý\u0095\u0017\nJ\u008eõ\u0003\u0006\u0080x\u0004±¹\u0094>\u0019²M7\u009d´1(\u008b\u00ad\u0010\"6¦SÛOXéÜSQ£Ö¿J\"Ï<LLÀûE~ú&~yórpªô\u0003i5î;b,çÝdc\u0098-\u001d^\u0092\r\u0016¶\u008b\u009e\b>\u008cä\u0001N\u0086È:*¿><\b°75ïª'.-£\u0083 \u0081¤\u001aÙ\u0090^6Ò\u009fWÔÔ[H\u001bÍ\u0017B\u0005Æ\u000f{\bø:|\u008fñxv\u0019ê\u0088ofìï`¢åY\u001aå\u009eÒ\u0013\u009c\u0090\u0093\u0014\u00ad\u0089\r\u000eæ\u0082c\u0007ù\u0084\u00978h½·2e¶²+<¨Ò,G¡ô&eZ\u0016ßV\\ÆÐ%U\u0003ÊÎN\u0090Ã\u0086@AÄ\u0014y¿þñrÍ÷ìtÏèlm\u0011âÅf\u008b\u009b±\u0018\f\u009cÃ\u0011·\u0096V\n\u008b\u008fÄ\f\u001c\u0080\u0098\u0005\u0081ºI>¹³º0\u007f´j)ç® \"!§\u0012$zX\u0091Ý RöÖ\u0087K\u0005È\u0084L\u0081Á+Fyúc\u007fHükp\u009eõâj\u000eîúcGàªd¤\u0099\u0001\u001eª\u0092\u0019\u0017Ì\u0094g\bg\u008dû\u0002ý\u0086ä;\u009f¸Â<ä±N6YªÈ/p¬A \u0003¥\u009dÚ\\^¹ÓÄPÊÔ\u0007I¼ÎKB\u0097ÇhD\u0083ø5}Åò¶v]ë©hqìða\\æ¨\u001a¢\u009f\u0001\u001c\u009f\u0090ú\u0015É\u008a-\u000e\"\u0083ë\u0000\u001f\u0085¯9í¾\u008a3\"·Õ4\u0014©â-Ý¢\u009a'\u0010[ÌØ\u001b]BÑîVpËkOÌÌ\u008dA\bÅÒzvÿ\u0011s\u0084ð©u/é\u0013nmãÎg\bä\u0000\u0019x\u009d\u008d\u0012b\u0097Â\u000b\u0095\u0088ø\r\u0006\u0081Þ\u0006»»Ã? ¼\u00011vµ~*0¯3#\u0081 \u0089%yYèÞvS5×\u0015T7ÉlMpÂ\u008aGDû3x\u0083ý°q¥öÚk®ï(lrá\te%\u009a?\u001f\u0088\u00936\u0010ß\u0095\u0090\t2\u008e\u009e\u0003s\u0087Ì\u0004&¹Ä=2²h7n«\u0083(½\u00adu!q¦.Û\u0096_aÜ'Q\u0094Õ\"JÂÏVCßÀÇEýùJ~Mó\bw_ô i\u0001ítbdçQ\u001b'\u0098\u0087\u001dY\u0091Ì\u0016A\u008b@\u000fy\u008cê\u0001P\u0085G:Ì¿#3å°_5Õ©X.Æ£á'¸¤ÆÙt]kÒ\"WOËsHÝÍ\u0014A¯Æí{$ÿí|¹ñ\u008bu®ê\u0084o»ã\u000f`úå\u0090\u0019\\\u009e&\u0013\u0087\u0097\n\u0014\u0004\u0089A\rø\u0082ê\u0007ñ»*8\u0084½\u001b1\u0094¶l+W¯\u0006,ã¡ç%;Z=ß¢SYÐ\u0083U\u0007É[N\u008aÃÕGÌÄÊy3ý¸ra÷Ôk\u000fè¹m¯áufZ\u009b¶\u001f\u0087\u009cu\u0011\"\u0095\u001e\n\"\u008fµ\u0003Å\u0080\u009f\u0005\u0011¹/>¿³ì7Ä´Â)V\u00adÒ\"Å§\u0017Û2XAÝµQgÖêKdÏtLêÁ½ECúð\u007f]ó¨pºõ\u001ai\u0085îVcpç3d\u0011\u0099\u0080\u001dÝ\u0092z\u0017»\u008b(\b\u009b\u008d\u008d\u0001\u0099\u0086\u0087;±¿\u001b< ±S5iªÿ/\u0014£· þ¥\u000bÙp^\u009dÓáW\u001cÔòIãÍ\u0084BÉÇM{&øÕ}¥ñÉv£ëÜh\u0092ì\u0091a]æ\u0007\u001a\u0094\u009f>\u001c&\u0090/\u0015E\u008añ\u000eò\u0083©\u0000\\\u0084ï9t¾¹2#·!4\u000e¨¸-û¢\u009d&O[lØ\u008f\\ÚÑoVðÊ\u0004O\u008fÌ\u0080@ìÅùzEþLsnð¾t\u001cé\u000bn\râ«gþäX\u0018¾\u009dT\u0012\u0080\u0096\u0018\u000b=\u0088·\f\u0081\u0081x\u0006\u0094ºË?\u0097¼Ï0\u001aµ¹*\"®÷#J J$ÏYLÞ\u0006RQ×\u0094T\u001dÈlMÞÂjF=û$xÐü+q¹ö\u0089jÌïdl¿à eÜ\u009a\u0081\u001eÀ\u0093B\u0010Æ\u0094\u0007\t&\u008eK\u00029\u0087²\u0004¶¸Q=e²²6\u0089«Ú($¬\u000b!£¦iÚ»_õÜ\u0089PEÕòJÞÎÁC\u000fÀÃD\u000eù\u008a~LòÙw=ôÎhzíwbñæ\u008f\u001b\u008a\u0098/\u001cÊ\u0091Ë\u0016\u0085\u008aÇ\u000f\f\u008câ\u0000´\u0085¯:Ý¾B3%°³4K©¥.#¢¡'3¤ºØÀ]HÒëV\u008dËÕHfÌäA4Æýz\u0003ÿ\u008e|\u0084ð¯uXêønxã[`Ääu\u0019\u009a\u009eí\u00126\u0097®\u0014 \u00887\rÉ\u0082G\u0006n»Ó8\t¼¡1%¶Ý*F".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 5843);
        getOutputFormats = cArr;
        unwrapAs = -8100031384635564204L;
    }
}
