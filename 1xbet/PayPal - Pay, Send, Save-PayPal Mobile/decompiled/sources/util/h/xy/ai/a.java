package util.h.xy.ai;

/* loaded from: classes5.dex */
public final class a {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoFpsRangesFor = 294925130;
    private static char getHighSpeedVideoSizes = 39853;
    private static int getInputFormats = 1;
    private static long getOutputMinFrameDuration = 2457411417541981002L;
    private util.h.xy.ai.a.ma getOutputStallDurationlomOqCM = null;
    private util.h.xy.ai.a.ma CoroutineDebuggingKt = null;
    private int isOutputSupportedFor = 0;
    private util.h.xy.ai.a.ma toString = null;
    private util.h.xy.ai.a.ma getValidOutputFormatsForInputhNQ4ISI = null;
    private util.h.xy.ai.a.ma getInputSizeshNQ4ISI = null;
    private util.h.xy.ai.a.ma coroutineCreation = null;
    private util.h.xy.ai.a.ma getOutputFormats = null;
    private int getHighSpeedVideoSizesFor = 0;
    private util.h.xy.ai.a.ma _BOUNDARY = null;
    private util.h.xy.ai.a.ma getOutputSizeshNQ4ISI = null;
    private util.h.xy.ai.a.ma getOutputMinFrameDurationlomOqCM = null;
    private int getOutputSizes = 0;
    private util.h.xy.ai.a.ma isOutputSupportedForhNQ4ISI = null;
    private util.h.xy.ai.a.ma getOutputStallDuration = null;
    private util.h.xy.ai.a.ma unwrapAs = null;
    private util.h.xy.ai.a.ma coroutineBoundary = null;
    private util.h.xy.ai.a.ma ArtificialStackFrames = null;
    private util.h.xy.ai.a.ma accessartificialFrame = null;

    protected final void finalize() {
        int i = getInputFormats + 111;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            m24580();
            getInputFormats = (getHighResolutionOutputSizeshNQ4ISI + 97) % 128;
        } else {
            m24580();
            throw null;
        }
    }

    final class ma extends com.sun.jna.Memory {
        private static int Camera2StreamConfigurationMap = 0;
        private static int getHighResolutionOutputSizeshNQ4ISI = 1;

        public ma(long j) {
            super(j);
        }

        @Override // com.sun.jna.Memory
        public final void dispose() {
            getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 55) % 128;
            super.dispose();
            Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 33) % 128;
        }
    }

    private static int getHighSpeedVideoFpsRanges() {
        int i = getInputFormats + 101;
        int i2 = i % 128;
        getHighResolutionOutputSizeshNQ4ISI = i2;
        int i3 = i % 2 != 0 ? 35 : 80;
        getInputFormats = (i2 + 81) % 128;
        return i3;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    protected final void m24574() {
        getHighResolutionOutputSizeshNQ4ISI = (getInputFormats + 23) % 128;
        util.h.xy.ai.a.ma maVar = this.getOutputStallDurationlomOqCM;
        if (maVar != null) {
            try {
                maVar.dispose();
            } finally {
                this.getOutputStallDurationlomOqCM = null;
            }
        }
        util.h.xy.ai.a.ma maVar2 = this.CoroutineDebuggingKt;
        if (maVar2 != null) {
            getHighResolutionOutputSizeshNQ4ISI = (getInputFormats + 31) % 128;
            try {
                maVar2.dispose();
            } finally {
                this.CoroutineDebuggingKt = null;
            }
        }
        getInputFormats = (getHighResolutionOutputSizeshNQ4ISI + 49) % 128;
    }

    private util.h.xy.ai.a.ma getHighSpeedVideoSizes(long j) {
        util.h.xy.ai.a.ma maVar = new util.h.xy.ai.a.ma(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        byte[] bArr = new byte[com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)];
        for (int i = 0; i < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i++) {
            int i2 = i * 8;
            bArr[i] = (byte) (((255 << i2) & j) >> i2);
        }
        int i3 = 1032189231;
        for (int i4 = 0; i4 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i4++) {
            getHighResolutionOutputSizeshNQ4ISI = (getInputFormats + 101) % 128;
            byte b = bArr[i4];
            bArr[i4] = (byte) (((byte) (i3 & 255)) ^ b);
            i3 = ((i3 << (i4 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))) | (i3 >>> (((com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8) - 1) - (i4 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))))) * (~(b & 255));
        }
        int i5 = getInputFormats + 121;
        getHighResolutionOutputSizeshNQ4ISI = i5 % 128;
        int i6 = i5 % 2;
        long j2 = 0;
        for (int i7 = 0; i7 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i7++) {
            j2 |= (bArr[i7] & 255) << (i7 * 8);
        }
        maVar.setLong(0L, j2);
        return maVar;
    }

    private static void getHighSpeedVideoSizes(java.lang.String str, char c, int i, java.lang.String str2, java.lang.String str3, java.lang.Object[] objArr) {
        int i2 = getHighSpeedVideoFpsRanges + 95;
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        char[] charArray = str3.toCharArray();
        int i3 = Camera2StreamConfigurationMap + 121;
        getHighSpeedVideoFpsRanges = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        char[] charArray2 = str2.toCharArray();
        char[] charArray3 = str.toCharArray();
        int i4 = getHighSpeedVideoFpsRanges + 3;
        Camera2StreamConfigurationMap = i4 % 128;
        int i5 = i4 % 2;
        util.h.xz.b.rc rcVar = new util.h.xz.b.rc();
        int length = charArray2.length;
        char[] cArr = new char[length];
        int length2 = charArray.length;
        char[] cArr2 = new char[length2];
        java.lang.System.arraycopy(charArray2, 0, cArr, 0, length);
        java.lang.System.arraycopy(charArray, 0, cArr2, 0, length2);
        cArr[0] = (char) (cArr[0] ^ c);
        cArr2[2] = (char) (cArr2[2] + ((char) i));
        int length3 = charArray3.length;
        char[] cArr3 = new char[length3];
        rcVar.f2652 = 0;
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 33) % 128;
        while (rcVar.f2652 < length3) {
            int i6 = (rcVar.f2652 + 2) % 4;
            int i7 = (rcVar.f2652 + 3) % 4;
            rcVar.f2653 = (char) (((cArr[rcVar.f2652 % 4] * 32718) + cArr2[i6]) % 65535);
            cArr2[i7] = (char) (((cArr[i7] * 32718) + cArr2[i6]) / 65535);
            cArr[i7] = rcVar.f2653;
            cArr3[rcVar.f2652] = (char) ((((cArr[i7] ^ r3[rcVar.f2652]) ^ (getOutputMinFrameDuration ^ 2457411417541981002L)) ^ ((int) (getHighSpeedVideoFpsRangesFor ^ 2457411417541981002L))) ^ ((char) (getHighSpeedVideoSizes ^ 2457411417541981002L)));
            rcVar.f2652++;
            getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 81) % 128;
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m24575(int i) {
        int i2 = getHighResolutionOutputSizeshNQ4ISI + 33;
        getInputFormats = i2 % 128;
        if (i2 % 2 != 0) {
            util.h.xy.ai.a.ma maVar = this.getOutputStallDurationlomOqCM;
            if (maVar != null) {
                try {
                    maVar.dispose();
                } finally {
                    this.getOutputStallDurationlomOqCM = null;
                }
            }
            int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE);
            int i3 = getInputFormats;
            getHighResolutionOutputSizeshNQ4ISI = (i3 + 77) % 128;
            int i4 = i3 + 15;
            getHighResolutionOutputSizeshNQ4ISI = i4 % 128;
            if (i4 % 2 == 0) {
                util.h.xy.ai.a.ma maVar2 = new util.h.xy.ai.a.ma(nativeSize + 107);
                this.getOutputStallDurationlomOqCM = maVar2;
                maVar2.setInt(getHighSpeedVideoFpsRanges(), i);
                util.h.xy.ai.a.ma maVar3 = this.CoroutineDebuggingKt;
                if (maVar3 != null) {
                    getInputFormats = (getHighResolutionOutputSizeshNQ4ISI + 79) % 128;
                    try {
                        maVar3.dispose();
                    } finally {
                        this.CoroutineDebuggingKt = null;
                    }
                }
                this.CoroutineDebuggingKt = getHighSpeedVideoSizes(com.sun.jna.Pointer.nativeValue(this.getOutputStallDurationlomOqCM) + getHighSpeedVideoFpsRanges());
                return;
            }
            throw null;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    protected final void m24581() {
        int i = getInputFormats + 69;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
        util.h.xy.ai.a.ma maVar = this.toString;
        if (maVar != null) {
            try {
                maVar.dispose();
            } finally {
                this.toString = null;
            }
        }
        util.h.xy.ai.a.ma maVar2 = this.getValidOutputFormatsForInputhNQ4ISI;
        if (maVar2 != null) {
            getInputFormats = (getHighResolutionOutputSizeshNQ4ISI + 85) % 128;
            try {
                maVar2.dispose();
            } finally {
                this.getValidOutputFormatsForInputhNQ4ISI = null;
            }
        }
        util.h.xy.ai.a.ma maVar3 = this.getInputSizeshNQ4ISI;
        if (maVar3 != null) {
            getInputFormats = (getHighResolutionOutputSizeshNQ4ISI + 115) % 128;
            try {
                maVar3.dispose();
            } finally {
                this.getInputSizeshNQ4ISI = null;
            }
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m24578(int i) {
        this.isOutputSupportedFor = i;
        util.h.xy.ai.a.ma maVar = this.toString;
        if (maVar != null) {
            getInputFormats = (getHighResolutionOutputSizeshNQ4ISI + 111) % 128;
            try {
                maVar.dispose();
            } finally {
                this.toString = null;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE) * i;
        int i2 = (getHighResolutionOutputSizeshNQ4ISI + 23) % 128;
        getInputFormats = i2;
        int i3 = i2 + 65;
        getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
        if (i3 % 2 == 0) {
            this.toString = new util.h.xy.ai.a.ma(nativeSize + 115);
            util.h.xy.ai.a.ma maVar2 = this.getValidOutputFormatsForInputhNQ4ISI;
            if (maVar2 != null) {
                try {
                    maVar2.dispose();
                    this.getValidOutputFormatsForInputhNQ4ISI = null;
                    getInputFormats = (getHighResolutionOutputSizeshNQ4ISI + 15) % 128;
                } catch (java.lang.Throwable th) {
                    this.getValidOutputFormatsForInputhNQ4ISI = null;
                    throw th;
                }
            }
            util.h.xy.ai.a.ma maVar3 = new util.h.xy.ai.a.ma(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
            this.getValidOutputFormatsForInputhNQ4ISI = maVar3;
            long nativeValue = com.sun.jna.Pointer.nativeValue(this.toString);
            int i4 = (getInputFormats + 83) % 128;
            getHighResolutionOutputSizeshNQ4ISI = i4;
            getInputFormats = (i4 + 35) % 128;
            maVar3.setPointer(0L, new com.sun.jna.Pointer(nativeValue + 102));
            util.h.xy.ai.a.ma maVar4 = this.getInputSizeshNQ4ISI;
            if (maVar4 != null) {
                getInputFormats = (getHighResolutionOutputSizeshNQ4ISI + 43) % 128;
                try {
                    maVar4.dispose();
                } finally {
                    this.getInputSizeshNQ4ISI = null;
                }
            }
            long nativeValue2 = com.sun.jna.Pointer.nativeValue(this.getValidOutputFormatsForInputhNQ4ISI);
            util.h.xy.ai.a.ma maVar5 = new util.h.xy.ai.a.ma(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
            maVar5.setLong(0L, nativeValue2 ^ 1943052760);
            getHighResolutionOutputSizeshNQ4ISI = (getInputFormats + 119) % 128;
            this.getInputSizeshNQ4ISI = maVar5;
            return;
        }
        throw null;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m24579(byte[] bArr) throws java.io.IOException {
        getHighResolutionOutputSizeshNQ4ISI = (getInputFormats + 23) % 128;
        m24578(bArr.length);
        util.h.xy.ai.a.ma maVar = this.toString;
        int i = (getInputFormats + 83) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i;
        getInputFormats = (i + 35) % 128;
        maVar.write(102L, bArr, 0, bArr.length);
        int i2 = getHighResolutionOutputSizeshNQ4ISI + 11;
        getInputFormats = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    protected final void m24570() {
        int i = (getHighResolutionOutputSizeshNQ4ISI + 107) % 128;
        getInputFormats = i;
        util.h.xy.ai.a.ma maVar = this.coroutineCreation;
        if (maVar != null) {
            int i2 = i + 73;
            getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
            try {
                if (i2 % 2 != 0) {
                    maVar.dispose();
                    throw null;
                }
                maVar.dispose();
            } finally {
                this.coroutineCreation = null;
            }
        }
        util.h.xy.ai.a.ma maVar2 = this.getOutputFormats;
        if (maVar2 != null) {
            int i3 = getHighResolutionOutputSizeshNQ4ISI + 39;
            getInputFormats = i3 % 128;
            try {
                if (i3 % 2 == 0) {
                    maVar2.dispose();
                    this.getOutputFormats = null;
                    throw new java.lang.ArithmeticException();
                }
                maVar2.dispose();
            } finally {
                this.getOutputFormats = null;
            }
        }
        int i4 = getHighResolutionOutputSizeshNQ4ISI + 113;
        getInputFormats = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private util.h.xy.ai.a.ma getHighSpeedVideoFpsRangesFor(long j) {
        util.h.xy.ai.a.ma maVar = new util.h.xy.ai.a.ma(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        byte[] bArr = new byte[com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)];
        getHighResolutionOutputSizeshNQ4ISI = (getInputFormats + 113) % 128;
        for (int i = 0; i < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i++) {
            getHighResolutionOutputSizeshNQ4ISI = (getInputFormats + 75) % 128;
            int i2 = i * 8;
            bArr[i] = (byte) (((255 << i2) & j) >> i2);
        }
        int i3 = 1874714628;
        for (int i4 = 0; i4 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i4++) {
            byte b = bArr[i4];
            bArr[i4] = (byte) (((byte) (i3 & 255)) ^ b);
            i3 = ((i3 << (i4 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))) | (i3 >>> (((com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8) - 1) - (i4 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))))) * (~(b & 255));
        }
        long j2 = 0;
        for (int i5 = 0; i5 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i5++) {
            j2 |= (bArr[i5] & 255) << (i5 * 8);
        }
        maVar.setLong(0L, j2);
        return maVar;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m24571(int i) {
        util.h.xy.ai.a.ma maVar = this.coroutineCreation;
        if (maVar != null) {
            int i2 = getInputFormats + 97;
            getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
            try {
                if (i2 % 2 == 0) {
                    maVar.dispose();
                } else {
                    maVar.dispose();
                    throw null;
                }
            } finally {
                this.coroutineCreation = null;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE);
        int i3 = getHighResolutionOutputSizeshNQ4ISI;
        getInputFormats = (i3 + 113) % 128;
        getInputFormats = (i3 + 71) % 128;
        util.h.xy.ai.a.ma maVar2 = new util.h.xy.ai.a.ma(nativeSize + 117);
        this.coroutineCreation = maVar2;
        int i4 = (getInputFormats + 11) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i4;
        getInputFormats = (i4 + 57) % 128;
        maVar2.setInt(92L, i);
        util.h.xy.ai.a.ma maVar3 = this.getOutputFormats;
        if (maVar3 != null) {
            try {
                maVar3.dispose();
            } finally {
                this.getOutputFormats = null;
            }
        }
        long nativeValue = com.sun.jna.Pointer.nativeValue(this.coroutineCreation);
        int i5 = (getInputFormats + 11) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i5;
        getInputFormats = (i5 + 57) % 128;
        this.getOutputFormats = getHighSpeedVideoFpsRangesFor(nativeValue + 92);
        int i6 = getInputFormats + 17;
        getHighResolutionOutputSizeshNQ4ISI = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    private static int getHighSpeedVideoSizes() {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        getInputFormats = (i + 29) % 128;
        int i2 = i + 1;
        getInputFormats = i2 % 128;
        if (i2 % 2 != 0) {
            return 68;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    protected final void m24577() {
        int i = getHighResolutionOutputSizeshNQ4ISI + 95;
        getInputFormats = i % 128;
        if (i % 2 != 0) {
            util.h.xy.ai.a.ma maVar = this._BOUNDARY;
            if (maVar != null) {
                try {
                    maVar.dispose();
                } finally {
                    this._BOUNDARY = null;
                }
            }
            util.h.xy.ai.a.ma maVar2 = this.getOutputSizeshNQ4ISI;
            if (maVar2 != null) {
                try {
                    maVar2.dispose();
                    this.getOutputSizeshNQ4ISI = null;
                    getInputFormats = (getHighResolutionOutputSizeshNQ4ISI + 9) % 128;
                } catch (java.lang.Throwable th) {
                    this.getOutputSizeshNQ4ISI = null;
                    throw th;
                }
            }
            util.h.xy.ai.a.ma maVar3 = this.getOutputMinFrameDurationlomOqCM;
            if (maVar3 != null) {
                try {
                    maVar3.dispose();
                    return;
                } finally {
                    this.getOutputMinFrameDurationlomOqCM = null;
                }
            }
            return;
        }
        throw null;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m24582(int i) {
        this.getHighSpeedVideoSizesFor = i;
        util.h.xy.ai.a.ma maVar = this._BOUNDARY;
        if (maVar != null) {
            try {
                maVar.dispose();
            } finally {
                this._BOUNDARY = null;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE) * i;
        int i2 = getHighResolutionOutputSizeshNQ4ISI;
        getInputFormats = (i2 + 27) % 128;
        getInputFormats = (i2 + 9) % 128;
        this._BOUNDARY = new util.h.xy.ai.a.ma(nativeSize + 121);
        util.h.xy.ai.a.ma maVar2 = this.getOutputSizeshNQ4ISI;
        if (maVar2 != null) {
            int i3 = getInputFormats + 71;
            getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
            try {
                if (i3 % 2 == 0) {
                    maVar2.dispose();
                } else {
                    maVar2.dispose();
                    throw null;
                }
            } finally {
                this.getOutputSizeshNQ4ISI = null;
            }
        }
        util.h.xy.ai.a.ma maVar3 = new util.h.xy.ai.a.ma(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        this.getOutputSizeshNQ4ISI = maVar3;
        long nativeValue = com.sun.jna.Pointer.nativeValue(this._BOUNDARY);
        getHighSpeedVideoSizes();
        maVar3.setPointer(0L, new com.sun.jna.Pointer(nativeValue + 68));
        util.h.xy.ai.a.ma maVar4 = this.getOutputMinFrameDurationlomOqCM;
        if (maVar4 != null) {
            try {
                maVar4.dispose();
                this.getOutputMinFrameDurationlomOqCM = null;
                getInputFormats = (getHighResolutionOutputSizeshNQ4ISI + 87) % 128;
            } catch (java.lang.Throwable th) {
                this.getOutputMinFrameDurationlomOqCM = null;
                throw th;
            }
        }
        long nativeValue2 = com.sun.jna.Pointer.nativeValue(this.getOutputSizeshNQ4ISI);
        util.h.xy.ai.a.ma maVar5 = new util.h.xy.ai.a.ma(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        byte[] bArr = new byte[com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)];
        int i4 = 0;
        while (i4 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)) {
            int i5 = getHighResolutionOutputSizeshNQ4ISI + 119;
            getInputFormats = i5 % 128;
            if (i5 % 2 == 0) {
                bArr[i4] = (byte) (((255 << (i4 >>> 89)) + nativeValue2) >> (i4 / 68));
                i4 += 17;
            } else {
                int i6 = i4 * 8;
                bArr[i4] = (byte) (((255 << i6) & nativeValue2) >> i6);
                i4++;
            }
        }
        int i7 = 700830744;
        for (int i8 = 0; i8 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i8++) {
            getInputFormats = (getHighResolutionOutputSizeshNQ4ISI + 111) % 128;
            byte b = bArr[i8];
            bArr[i8] = (byte) (((byte) (i7 & 255)) ^ b);
            i7 = ((i7 << (i8 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))) | (i7 >>> (((com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8) - 1) - (i8 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))))) * (~(b & 255));
        }
        long j = 0;
        for (int i9 = 0; i9 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i9++) {
            j |= (bArr[i9] & 255) << (i9 * 8);
        }
        maVar5.setLong(0L, j);
        this.getOutputMinFrameDurationlomOqCM = maVar5;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final byte[] m24573() throws java.io.IOException {
        int i = getHighResolutionOutputSizeshNQ4ISI + 105;
        getInputFormats = i % 128;
        if (i % 2 != 0) {
            util.h.xy.ai.a.ma maVar = this._BOUNDARY;
            if (maVar == null) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoSizes("Ⱉ订餯럿⺕賺嚮띕꧇뛥䁐防铃嘹䝤戢캆\u1f4e攥鏕炝쒏甔襐麿㮪趒\udc60뒒읬ܡ辿㊂㵂ฺ㠙ʡ✍緅", (char) (40360 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16)), (-2088495340) - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), "ጰ萗ꢃ宝", "\u0000\u0000\u0000\u0000", objArr);
                throw new java.io.IOException(((java.lang.String) objArr[0]).intern());
            }
            byte[] bArr = new byte[this.getHighSpeedVideoSizesFor];
            getHighSpeedVideoSizes();
            maVar.read(68L, bArr, 0, this.getHighSpeedVideoSizesFor);
            int i2 = getHighResolutionOutputSizeshNQ4ISI + 1;
            getInputFormats = i2 % 128;
            if (i2 % 2 != 0) {
                return bArr;
            }
            throw new java.lang.ArithmeticException();
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m24583(byte[] bArr) throws java.io.IOException {
        int i = getHighResolutionOutputSizeshNQ4ISI + 79;
        getInputFormats = i % 128;
        if (i % 2 == 0) {
            m24582(bArr.length);
            util.h.xy.ai.a.ma maVar = this._BOUNDARY;
            getHighSpeedVideoSizes();
            maVar.write(69L, bArr, 0, bArr.length);
            return;
        }
        m24582(bArr.length);
        util.h.xy.ai.a.ma maVar2 = this._BOUNDARY;
        getHighSpeedVideoSizes();
        maVar2.write(68L, bArr, 0, bArr.length);
    }

    private static int getHighSpeedVideoFpsRangesFor() {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        getInputFormats = (i + 55) % 128;
        int i2 = i + 125;
        getInputFormats = i2 % 128;
        if (i2 % 2 != 0) {
            return 98;
        }
        throw null;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    protected final void m24567() {
        util.h.xy.ai.a.ma maVar = this.isOutputSupportedForhNQ4ISI;
        if (maVar != null) {
            getHighResolutionOutputSizeshNQ4ISI = (getInputFormats + 27) % 128;
            try {
                maVar.dispose();
            } finally {
                this.isOutputSupportedForhNQ4ISI = null;
            }
        }
        util.h.xy.ai.a.ma maVar2 = this.getOutputStallDuration;
        if (maVar2 != null) {
            getHighResolutionOutputSizeshNQ4ISI = (getInputFormats + 9) % 128;
            try {
                maVar2.dispose();
                this.getOutputStallDuration = null;
                getInputFormats = (getHighResolutionOutputSizeshNQ4ISI + 75) % 128;
            } catch (java.lang.Throwable th) {
                this.getOutputStallDuration = null;
                throw th;
            }
        }
        util.h.xy.ai.a.ma maVar3 = this.unwrapAs;
        if (maVar3 != null) {
            getHighResolutionOutputSizeshNQ4ISI = (getInputFormats + 125) % 128;
            try {
                maVar3.dispose();
            } finally {
                this.unwrapAs = null;
            }
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m24572(int i) {
        int i2 = getHighResolutionOutputSizeshNQ4ISI + 17;
        getInputFormats = i2 % 128;
        if (i2 % 2 != 0) {
            this.getOutputSizes = i;
            util.h.xy.ai.a.ma maVar = this.isOutputSupportedForhNQ4ISI;
            if (maVar != null) {
                try {
                    maVar.dispose();
                } finally {
                    this.isOutputSupportedForhNQ4ISI = null;
                }
            }
            int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * i;
            int i3 = getInputFormats;
            int i4 = i3 + 69;
            getHighResolutionOutputSizeshNQ4ISI = i4 % 128;
            int i5 = i4 % 2 != 0 ? 52 : 119;
            getHighResolutionOutputSizeshNQ4ISI = (i3 + 27) % 128;
            this.isOutputSupportedForhNQ4ISI = new util.h.xy.ai.a.ma(nativeSize + i5);
            util.h.xy.ai.a.ma maVar2 = this.getOutputStallDuration;
            if (maVar2 != null) {
                try {
                    maVar2.dispose();
                } finally {
                    this.getOutputStallDuration = null;
                }
            }
            util.h.xy.ai.a.ma maVar3 = new util.h.xy.ai.a.ma(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
            this.getOutputStallDuration = maVar3;
            long nativeValue = com.sun.jna.Pointer.nativeValue(this.isOutputSupportedForhNQ4ISI);
            getHighSpeedVideoFpsRangesFor();
            maVar3.setPointer(0L, new com.sun.jna.Pointer(nativeValue + 98));
            util.h.xy.ai.a.ma maVar4 = this.unwrapAs;
            if (maVar4 != null) {
                try {
                    maVar4.dispose();
                    this.unwrapAs = null;
                    int i6 = getInputFormats + 125;
                    getHighResolutionOutputSizeshNQ4ISI = i6 % 128;
                    int i7 = i6 % 2;
                } catch (java.lang.Throwable th) {
                    this.unwrapAs = null;
                    throw th;
                }
            }
            long nativeValue2 = com.sun.jna.Pointer.nativeValue(this.getOutputStallDuration);
            util.h.xy.ai.a.ma maVar5 = new util.h.xy.ai.a.ma(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
            maVar5.setLong(0L, nativeValue2 ^ 632492612);
            int i8 = getHighResolutionOutputSizeshNQ4ISI + 99;
            getInputFormats = i8 % 128;
            if (i8 % 2 != 0) {
                this.unwrapAs = maVar5;
                return;
            }
            throw new java.lang.ArithmeticException();
        }
        this.getOutputSizes = i;
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public final int[] m24568() throws java.io.IOException {
        getHighResolutionOutputSizeshNQ4ISI = (getInputFormats + 27) % 128;
        util.h.xy.ai.a.ma maVar = this.isOutputSupportedForhNQ4ISI;
        if (maVar == null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes("䓼᰻咛ﻵ㬕遲෮䀔輍\ue6d7ऐڡ\uf368瀽厃꼛嵡襠忁䚼\udbf3É⿑ƚ䛓⟰谨萅㌾䥅\b팳䎁龄ⴉ쩬뽰놭呰諭穌ۋ창ᗭ", (char) (42756 - android.graphics.ImageFormat.getBitsPerPixel(0)), (-1) - android.view.MotionEvent.axisFromString(""), "ꗾỗՈ嚧", "\u0000\u0000\u0000\u0000", objArr);
            throw new java.io.IOException(((java.lang.String) objArr[0]).intern());
        }
        int[] iArr = new int[this.getOutputSizes];
        getHighSpeedVideoFpsRangesFor();
        maVar.read(98L, iArr, 0, this.getOutputSizes);
        getHighResolutionOutputSizeshNQ4ISI = (getInputFormats + 89) % 128;
        return iArr;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m24576(int[] iArr) throws java.io.IOException {
        getInputFormats = (getHighResolutionOutputSizeshNQ4ISI + 121) % 128;
        m24572(iArr.length);
        util.h.xy.ai.a.ma maVar = this.isOutputSupportedForhNQ4ISI;
        getHighSpeedVideoFpsRangesFor();
        maVar.write(98L, iArr, 0, iArr.length);
        getInputFormats = (getHighResolutionOutputSizeshNQ4ISI + 33) % 128;
    }

    private static int Camera2StreamConfigurationMap() {
        int i = getInputFormats;
        getHighResolutionOutputSizeshNQ4ISI = (i + 83) % 128;
        int i2 = i + 35;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            return 96;
        }
        throw null;
    }

    /* renamed from: ι, reason: contains not printable characters */
    protected final void m24584() {
        int i = getInputFormats + 69;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            util.h.xy.ai.a.ma maVar = this.coroutineBoundary;
            if (maVar != null) {
                try {
                    maVar.dispose();
                } finally {
                    this.coroutineBoundary = null;
                }
            }
            util.h.xy.ai.a.ma maVar2 = this.ArtificialStackFrames;
            if (maVar2 != null) {
                try {
                    maVar2.dispose();
                } finally {
                    this.ArtificialStackFrames = null;
                }
            }
            util.h.xy.ai.a.ma maVar3 = this.accessartificialFrame;
            if (maVar3 != null) {
                getHighResolutionOutputSizeshNQ4ISI = (getInputFormats + 111) % 128;
                try {
                    maVar3.dispose();
                    return;
                } finally {
                    this.accessartificialFrame = null;
                }
            }
            return;
        }
        throw null;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public final int m24569() throws java.io.IOException {
        if (this.CoroutineDebuggingKt != null) {
            int i = (getInputFormats + 53) % 128;
            getHighResolutionOutputSizeshNQ4ISI = i;
            if (this.getInputSizeshNQ4ISI != null && this.getOutputFormats != null && this.getOutputMinFrameDurationlomOqCM != null) {
                getInputFormats = (i + 53) % 128;
                if (this.unwrapAs != null) {
                    util.h.xy.ai.a.ma maVar = this.coroutineBoundary;
                    if (maVar != null) {
                        try {
                            maVar.dispose();
                        } finally {
                            this.coroutineBoundary = null;
                        }
                    }
                    int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE);
                    int i2 = getInputFormats + 89;
                    getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
                    this.coroutineBoundary = new util.h.xy.ai.a.ma(nativeSize + (i2 % 2 != 0 ? 28414 : 147));
                    util.h.xy.ai.a.ma maVar2 = this.ArtificialStackFrames;
                    if (maVar2 != null) {
                        int i3 = getHighResolutionOutputSizeshNQ4ISI + 3;
                        getInputFormats = i3 % 128;
                        try {
                            if (i3 % 2 == 0) {
                                maVar2.dispose();
                                throw null;
                            }
                            maVar2.dispose();
                        } finally {
                            this.ArtificialStackFrames = null;
                        }
                    }
                    util.h.xy.ai.a.ma maVar3 = new util.h.xy.ai.a.ma(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
                    this.ArtificialStackFrames = maVar3;
                    long nativeValue = com.sun.jna.Pointer.nativeValue(this.coroutineBoundary);
                    Camera2StreamConfigurationMap();
                    maVar3.setPointer(0L, new com.sun.jna.Pointer(nativeValue + 96));
                    util.h.xy.ai.a.ma maVar4 = this.accessartificialFrame;
                    if (maVar4 != null) {
                        getInputFormats = (getHighResolutionOutputSizeshNQ4ISI + 17) % 128;
                        try {
                            maVar4.dispose();
                        } finally {
                            this.accessartificialFrame = null;
                        }
                    }
                    long nativeValue2 = com.sun.jna.Pointer.nativeValue(this.ArtificialStackFrames);
                    util.h.xy.ai.a.ma maVar5 = new util.h.xy.ai.a.ma(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
                    maVar5.setLong(0L, nativeValue2 ^ 1100527363);
                    int i4 = getHighResolutionOutputSizeshNQ4ISI + 77;
                    getInputFormats = i4 % 128;
                    if (i4 % 2 == 0) {
                        throw null;
                    }
                    this.accessartificialFrame = maVar5;
                    util.h.xy.ai.j.getHighSpeedVideoFpsRanges._BAvwmAysqzVKuWkvnn1nEt(this.accessartificialFrame, this.CoroutineDebuggingKt, this.getInputSizeshNQ4ISI, this.getOutputFormats, this.getOutputMinFrameDurationlomOqCM, this.unwrapAs);
                    int[] iArr = new int[1];
                    util.h.xy.ai.a.ma maVar6 = this.coroutineBoundary;
                    Camera2StreamConfigurationMap();
                    maVar6.read(96L, iArr, 0, 1);
                    return iArr[0];
                }
            }
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoSizes("ꏆބ\u0a7e붑鳖ⷀ\uef04梊\ued36\uee8aષ輑\uef61\ueeff퉝솪흶쵆摽꩒⽞땬༆ಂ鼛\uf43cﰒ⸐䩡楼耀\ue14a榠냼덟遈숀훖㩕䃅\u05fd\uf817醙᜶\uf5f7䕍닆責찘넆", (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), "\udb91袠ᷴ㑘", "\u0000\u0000\u0000\u0000", objArr);
        throw new java.io.IOException(((java.lang.String) objArr[0]).intern());
    }

    /* renamed from: ͺ, reason: contains not printable characters */
    public final void m24580() {
        int i = getInputFormats + 73;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            m24574();
            m24581();
            m24570();
            m24577();
            m24567();
            m24584();
            int i2 = getHighResolutionOutputSizeshNQ4ISI + 61;
            getInputFormats = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            return;
        }
        m24574();
        m24581();
        m24570();
        m24577();
        m24567();
        m24584();
        throw null;
    }
}
