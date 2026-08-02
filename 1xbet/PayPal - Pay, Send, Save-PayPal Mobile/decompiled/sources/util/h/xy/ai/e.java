package util.h.xy.ai;

/* loaded from: classes18.dex */
public final class e {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static long getHighSpeedVideoFpsRangesFor = 2457411417541981002L;
    private static int getHighSpeedVideoSizes = 0;
    private static char getInputFormats = 5212;
    private static int getOutputMinFrameDuration = 294925130;
    private int CoroutineDebuggingKt = 0;
    private util.h.xy.ai.e.ma toString = null;
    private util.h.xy.ai.e.ma isOutputSupportedForhNQ4ISI = null;
    private util.h.xy.ai.e.ma _CREATION = null;
    private util.h.xy.ai.e.ma isOutputSupportedFor = null;
    private util.h.xy.ai.e.ma getOutputFormats = null;
    private int kernelVersion = 0;
    private util.h.xy.ai.e.ma getHighSpeedVideoSizesFor = null;
    private util.h.xy.ai.e.ma getOutputStallDurationlomOqCM = null;
    private util.h.xy.ai.e.ma coroutineBoundary = null;
    private util.h.xy.ai.e.ma getValidOutputFormatsForInputhNQ4ISI = null;
    private util.h.xy.ai.e.ma getOutputSizes = null;
    private int getOutputMinFrameDurationlomOqCM = 0;
    private util.h.xy.ai.e.ma getOutputStallDuration = null;
    private util.h.xy.ai.e.ma getOutputSizeshNQ4ISI = null;

    /* renamed from: a, reason: collision with root package name */
    private util.h.xy.ai.e.ma f7071a = null;
    private util.h.xy.ai.e.ma getARTIFICIAL_FRAME_PACKAGE_NAME = null;
    private util.h.xy.ai.e.ma unwrapAs = null;
    private int accessartificialFrame = 0;
    private util.h.xy.ai.e.ma b = null;
    private util.h.xy.ai.e.ma ArtificialStackFrames = null;
    private util.h.xy.ai.e.ma coroutineCreation = null;
    private int getInputSizeshNQ4ISI = 0;
    private util.h.xy.ai.e.ma resetTransaction = null;
    private util.h.xy.ai.e.ma init = null;
    private util.h.xy.ai.e.ma _BOUNDARY = null;
    private util.h.xy.ai.e.ma c = null;
    private util.h.xy.ai.e.ma AMEXKernel = null;
    private util.h.xy.ai.e.ma d = null;

    protected final void finalize() {
        getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 89) % 128;
        m24665();
        getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 31) % 128;
    }

    final class ma extends com.sun.jna.Memory {
        private static int getHighResolutionOutputSizeshNQ4ISI = 0;
        private static int getHighSpeedVideoFpsRanges = 1;

        public ma(long j) {
            super(j);
        }

        @Override // com.sun.jna.Memory
        public final void dispose() {
            int i = getHighSpeedVideoFpsRanges;
            int i2 = ((i | 51) << 1) - (i ^ 51);
            getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
            if (i2 % 2 == 0) {
                super.dispose();
            } else {
                super.dispose();
                throw null;
            }
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    protected final void m24669() {
        int i = getHighSpeedVideoFpsRanges;
        Camera2StreamConfigurationMap = (i + 121) % 128;
        util.h.xy.ai.e.ma maVar = this.toString;
        if (maVar != null) {
            Camera2StreamConfigurationMap = (i + 63) % 128;
            try {
                maVar.dispose();
            } finally {
                this.toString = null;
            }
        }
        util.h.xy.ai.e.ma maVar2 = this.isOutputSupportedForhNQ4ISI;
        if (maVar2 != null) {
            int i2 = Camera2StreamConfigurationMap + 75;
            getHighSpeedVideoFpsRanges = i2 % 128;
            try {
                if (i2 % 2 == 0) {
                    maVar2.dispose();
                    this.isOutputSupportedForhNQ4ISI = null;
                    throw new java.lang.ArithmeticException();
                }
                maVar2.dispose();
            } finally {
                this.isOutputSupportedForhNQ4ISI = null;
            }
        }
        util.h.xy.ai.e.ma maVar3 = this._CREATION;
        if (maVar3 != null) {
            int i3 = Camera2StreamConfigurationMap + 105;
            getHighSpeedVideoFpsRanges = i3 % 128;
            try {
                if (i3 % 2 != 0) {
                    maVar3.dispose();
                } else {
                    maVar3.dispose();
                    throw null;
                }
            } finally {
                this._CREATION = null;
            }
        }
    }

    private util.h.xy.ai.e.ma getHighSpeedVideoSizes(long j) {
        util.h.xy.ai.e.ma maVar = new util.h.xy.ai.e.ma(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        byte[] bArr = new byte[com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)];
        int i = 0;
        for (int i2 = 0; i2 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i2++) {
            int i3 = i2 * 8;
            bArr[i2] = (byte) (((255 << i3) & j) >> i3);
        }
        getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 55) % 128;
        int i4 = 184063090;
        for (int i5 = 0; i5 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i5++) {
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 67) % 128;
            byte b = bArr[i5];
            bArr[i5] = (byte) (((byte) (i4 & 255)) ^ b);
            i4 = ((i4 << (i5 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))) | (i4 >>> (((com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8) - 1) - (i5 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))))) * (~(b & 255));
        }
        long j2 = 0;
        while (i < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)) {
            j2 |= (bArr[i] & 255) << (i * 8);
            i++;
            getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        }
        maVar.setLong(0L, j2);
        return maVar;
    }

    private static void getHighSpeedVideoSizes(java.lang.String str, char c, int i, java.lang.String str2, java.lang.String str3, java.lang.Object[] objArr) {
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 55) % 128;
        char[] charArray = str3.toCharArray();
        char[] charArray2 = str2.toCharArray();
        char[] charArray3 = str.toCharArray();
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
        while (rcVar.f2652 < length3) {
            getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 59) % 128;
            int i2 = (rcVar.f2652 + 2) % 4;
            int i3 = (rcVar.f2652 + 3) % 4;
            rcVar.f2653 = (char) (((cArr[rcVar.f2652 % 4] * 32718) + cArr2[i2]) % 65535);
            cArr2[i3] = (char) (((cArr[i3] * 32718) + cArr2[i2]) / 65535);
            cArr[i3] = rcVar.f2653;
            cArr3[rcVar.f2652] = (char) ((((cArr[i3] ^ charArray3[rcVar.f2652]) ^ (getHighSpeedVideoFpsRangesFor ^ 2457411417541981002L)) ^ ((int) (getOutputMinFrameDuration ^ 2457411417541981002L))) ^ ((char) (getInputFormats ^ 2457411417541981002L)));
            rcVar.f2652++;
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m24660(int i) {
        getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 69) % 128;
        this.CoroutineDebuggingKt = i;
        util.h.xy.ai.e.ma maVar = this.toString;
        if (maVar != null) {
            try {
                maVar.dispose();
            } finally {
                this.toString = null;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE) * i;
        int i2 = (getHighSpeedVideoFpsRanges + 37) % 128;
        Camera2StreamConfigurationMap = i2;
        int i3 = i2 + 53;
        getHighSpeedVideoFpsRanges = i3 % 128;
        if (i3 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        this.toString = new util.h.xy.ai.e.ma(nativeSize + 121);
        util.h.xy.ai.e.ma maVar2 = this.isOutputSupportedForhNQ4ISI;
        if (maVar2 != null) {
            int i4 = Camera2StreamConfigurationMap + 49;
            getHighSpeedVideoFpsRanges = i4 % 128;
            try {
                if (i4 % 2 == 0) {
                    maVar2.dispose();
                    this.isOutputSupportedForhNQ4ISI = null;
                    throw new java.lang.ArithmeticException();
                }
                maVar2.dispose();
            } finally {
                this.isOutputSupportedForhNQ4ISI = null;
            }
        }
        util.h.xy.ai.e.ma maVar3 = new util.h.xy.ai.e.ma(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        this.isOutputSupportedForhNQ4ISI = maVar3;
        long nativeValue = com.sun.jna.Pointer.nativeValue(this.toString);
        int i5 = Camera2StreamConfigurationMap + 77;
        getHighSpeedVideoFpsRanges = i5 % 128;
        maVar3.setPointer(0L, new com.sun.jna.Pointer(nativeValue + (i5 % 2 == 0 ? 52 : 104)));
        util.h.xy.ai.e.ma maVar4 = this._CREATION;
        if (maVar4 != null) {
            int i6 = Camera2StreamConfigurationMap + 3;
            getHighSpeedVideoFpsRanges = i6 % 128;
            try {
                if (i6 % 2 == 0) {
                    maVar4.dispose();
                    throw null;
                }
                maVar4.dispose();
            } finally {
                this._CREATION = null;
            }
        }
        this._CREATION = getHighSpeedVideoSizes(com.sun.jna.Pointer.nativeValue(this.isOutputSupportedForhNQ4ISI));
        getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 37) % 128;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m24668(byte[] bArr) throws java.io.IOException {
        getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 101) % 128;
        m24660(bArr.length);
        util.h.xy.ai.e.ma maVar = this.toString;
        int i = Camera2StreamConfigurationMap + 77;
        getHighSpeedVideoFpsRanges = i % 128;
        maVar.write(i % 2 == 0 ? 52 : 104, bArr, 0, bArr.length);
        getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 117) % 128;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    protected final void m24662() {
        util.h.xy.ai.e.ma maVar = this.isOutputSupportedFor;
        if (maVar != null) {
            try {
                maVar.dispose();
            } finally {
                this.isOutputSupportedFor = null;
            }
        }
        util.h.xy.ai.e.ma maVar2 = this.getOutputFormats;
        if (maVar2 != null) {
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 95) % 128;
            try {
                maVar2.dispose();
                this.getOutputFormats = null;
                int i = getHighSpeedVideoFpsRanges + 115;
                Camera2StreamConfigurationMap = i % 128;
                if (i % 2 != 0) {
                    int i2 = 2 / 5;
                }
            } catch (java.lang.Throwable th) {
                this.getOutputFormats = null;
                throw th;
            }
        }
    }

    private util.h.xy.ai.e.ma Camera2StreamConfigurationMap(long j) {
        util.h.xy.ai.e.ma maVar = new util.h.xy.ai.e.ma(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        byte[] bArr = new byte[com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)];
        int i = getHighSpeedVideoFpsRanges + 101;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 != 0) {
            int i2 = 3 / 5;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i4++) {
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 105) % 128;
            int i5 = i4 * 8;
            bArr[i4] = (byte) (((255 << i5) & j) >> i5);
        }
        int i6 = 1433686164;
        for (int i7 = 0; i7 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i7++) {
            byte b = bArr[i7];
            bArr[i7] = (byte) (((byte) (i6 & 255)) ^ b);
            i6 = ((i6 << (i7 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))) | (i6 >>> (((com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8) - 1) - (i7 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))))) * (~(b & 255));
        }
        long j2 = 0;
        while (i3 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)) {
            j2 |= (bArr[i3] & 255) << (i3 * 8);
            i3++;
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 107) % 128;
        }
        maVar.setLong(0L, j2);
        return maVar;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m24667(int i) {
        int i2 = Camera2StreamConfigurationMap + 43;
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 != 0) {
            util.h.xy.ai.e.ma maVar = this.isOutputSupportedFor;
            if (maVar != null) {
                try {
                    maVar.dispose();
                    this.isOutputSupportedFor = null;
                    getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 87) % 128;
                } catch (java.lang.Throwable th) {
                    this.isOutputSupportedFor = null;
                    throw th;
                }
            }
            int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE);
            int i3 = (Camera2StreamConfigurationMap + 109) % 128;
            getHighSpeedVideoFpsRanges = i3;
            Camera2StreamConfigurationMap = (i3 + 107) % 128;
            util.h.xy.ai.e.ma maVar2 = new util.h.xy.ai.e.ma(nativeSize + 149);
            this.isOutputSupportedFor = maVar2;
            int i4 = (Camera2StreamConfigurationMap + 21) % 128;
            getHighSpeedVideoFpsRanges = i4;
            Camera2StreamConfigurationMap = (i4 + 37) % 128;
            maVar2.setInt(96L, i);
            util.h.xy.ai.e.ma maVar3 = this.getOutputFormats;
            if (maVar3 != null) {
                getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 83) % 128;
                try {
                    maVar3.dispose();
                } finally {
                    this.getOutputFormats = null;
                }
            }
            long nativeValue = com.sun.jna.Pointer.nativeValue(this.isOutputSupportedFor);
            int i5 = (Camera2StreamConfigurationMap + 21) % 128;
            getHighSpeedVideoFpsRanges = i5;
            Camera2StreamConfigurationMap = (i5 + 37) % 128;
            this.getOutputFormats = Camera2StreamConfigurationMap(nativeValue + 96);
            return;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    protected final void m24673() {
        util.h.xy.ai.e.ma maVar = this.getHighSpeedVideoSizesFor;
        if (maVar != null) {
            int i = getHighSpeedVideoFpsRanges + 41;
            Camera2StreamConfigurationMap = i % 128;
            try {
                if (i % 2 != 0) {
                    maVar.dispose();
                    this.getHighSpeedVideoSizesFor = null;
                    throw new java.lang.ArithmeticException();
                }
                maVar.dispose();
            } finally {
                this.getHighSpeedVideoSizesFor = null;
            }
        }
        util.h.xy.ai.e.ma maVar2 = this.getOutputStallDurationlomOqCM;
        if (maVar2 != null) {
            getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 107) % 128;
            try {
                maVar2.dispose();
                this.getOutputStallDurationlomOqCM = null;
                Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 15) % 128;
            } catch (java.lang.Throwable th) {
                this.getOutputStallDurationlomOqCM = null;
                throw th;
            }
        }
        util.h.xy.ai.e.ma maVar3 = this.coroutineBoundary;
        if (maVar3 != null) {
            try {
                maVar3.dispose();
            } finally {
                this.coroutineBoundary = null;
            }
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m24663(int i) {
        this.kernelVersion = i;
        util.h.xy.ai.e.ma maVar = this.getHighSpeedVideoSizesFor;
        if (maVar != null) {
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 103) % 128;
            try {
                maVar.dispose();
            } finally {
                this.getHighSpeedVideoSizesFor = null;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE) * i;
        int i2 = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRanges = (i2 + 83) % 128;
        int i3 = i2 + 115;
        getHighSpeedVideoFpsRanges = i3 % 128;
        if (i3 % 2 != 0) {
            this.getHighSpeedVideoSizesFor = new util.h.xy.ai.e.ma(nativeSize + 111);
            util.h.xy.ai.e.ma maVar2 = this.getOutputStallDurationlomOqCM;
            if (maVar2 != null) {
                try {
                    maVar2.dispose();
                    this.getOutputStallDurationlomOqCM = null;
                    getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 107) % 128;
                } catch (java.lang.Throwable th) {
                    this.getOutputStallDurationlomOqCM = null;
                    throw th;
                }
            }
            util.h.xy.ai.e.ma maVar3 = new util.h.xy.ai.e.ma(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
            this.getOutputStallDurationlomOqCM = maVar3;
            long nativeValue = com.sun.jna.Pointer.nativeValue(this.getHighSpeedVideoSizesFor);
            int i4 = (Camera2StreamConfigurationMap + 67) % 128;
            getHighSpeedVideoFpsRanges = i4;
            Camera2StreamConfigurationMap = (i4 + 85) % 128;
            maVar3.setPointer(0L, new com.sun.jna.Pointer(nativeValue + 70));
            util.h.xy.ai.e.ma maVar4 = this.coroutineBoundary;
            if (maVar4 != null) {
                try {
                    maVar4.dispose();
                } finally {
                    this.coroutineBoundary = null;
                }
            }
            long nativeValue2 = com.sun.jna.Pointer.nativeValue(this.getOutputStallDurationlomOqCM);
            util.h.xy.ai.e.ma maVar5 = new util.h.xy.ai.e.ma(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
            maVar5.setLong(0L, nativeValue2 ^ 47386826);
            int i5 = Camera2StreamConfigurationMap + 105;
            getHighSpeedVideoFpsRanges = i5 % 128;
            if (i5 % 2 != 0) {
                this.coroutineBoundary = maVar5;
                return;
            }
            throw null;
        }
        throw null;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m24675(byte[] bArr) throws java.io.IOException {
        int i = getHighSpeedVideoFpsRanges + 11;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 != 0) {
            m24663(bArr.length);
            util.h.xy.ai.e.ma maVar = this.getHighSpeedVideoSizesFor;
            int i2 = (Camera2StreamConfigurationMap + 67) % 128;
            getHighSpeedVideoFpsRanges = i2;
            Camera2StreamConfigurationMap = (i2 + 85) % 128;
            maVar.write(0L, bArr, 1, bArr.length);
        } else {
            m24663(bArr.length);
            util.h.xy.ai.e.ma maVar2 = this.getHighSpeedVideoSizesFor;
            int i3 = (Camera2StreamConfigurationMap + 67) % 128;
            getHighSpeedVideoFpsRanges = i3;
            Camera2StreamConfigurationMap = (i3 + 85) % 128;
            maVar2.write(70L, bArr, 0, bArr.length);
        }
        getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 81) % 128;
    }

    private static int getHighSpeedVideoSizes() {
        int i = Camera2StreamConfigurationMap;
        int i2 = i + 5;
        getHighSpeedVideoFpsRanges = i2 % 128;
        int i3 = i2 % 2 == 0 ? 78 : 86;
        getHighSpeedVideoFpsRanges = (i + 117) % 128;
        return i3;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    protected final void m24659() {
        util.h.xy.ai.e.ma maVar = this.getValidOutputFormatsForInputhNQ4ISI;
        if (maVar != null) {
            int i = Camera2StreamConfigurationMap + 71;
            getHighSpeedVideoFpsRanges = i % 128;
            try {
                if (i % 2 == 0) {
                    maVar.dispose();
                    throw null;
                }
                maVar.dispose();
                this.getValidOutputFormatsForInputhNQ4ISI = null;
                getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 99) % 128;
            } finally {
                this.getValidOutputFormatsForInputhNQ4ISI = null;
            }
        }
        util.h.xy.ai.e.ma maVar2 = this.getOutputSizes;
        if (maVar2 != null) {
            try {
                maVar2.dispose();
            } finally {
                this.getOutputSizes = null;
            }
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m24670(int i) {
        util.h.xy.ai.e.ma maVar = this.getValidOutputFormatsForInputhNQ4ISI;
        if (maVar != null) {
            try {
                maVar.dispose();
                this.getValidOutputFormatsForInputhNQ4ISI = null;
                getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 9) % 128;
            } catch (java.lang.Throwable th) {
                this.getValidOutputFormatsForInputhNQ4ISI = null;
                throw th;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE);
        int i2 = getHighSpeedVideoFpsRanges + 53;
        Camera2StreamConfigurationMap = i2 % 128;
        util.h.xy.ai.e.ma maVar2 = new util.h.xy.ai.e.ma(nativeSize + (i2 % 2 != 0 ? 51 : 113));
        this.getValidOutputFormatsForInputhNQ4ISI = maVar2;
        maVar2.setInt(getHighSpeedVideoSizes(), i);
        util.h.xy.ai.e.ma maVar3 = this.getOutputSizes;
        if (maVar3 != null) {
            try {
                maVar3.dispose();
                this.getOutputSizes = null;
                getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 43) % 128;
            } catch (java.lang.Throwable th2) {
                this.getOutputSizes = null;
                throw th2;
            }
        }
        long nativeValue = com.sun.jna.Pointer.nativeValue(this.getValidOutputFormatsForInputhNQ4ISI) + getHighSpeedVideoSizes();
        util.h.xy.ai.e.ma maVar4 = new util.h.xy.ai.e.ma(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        maVar4.setLong(0L, nativeValue ^ 673108839);
        getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 97) % 128;
        this.getOutputSizes = maVar4;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    protected final void m24666() {
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 9) % 128;
        util.h.xy.ai.e.ma maVar = this.getOutputStallDuration;
        if (maVar != null) {
            try {
                maVar.dispose();
                this.getOutputStallDuration = null;
                Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 61) % 128;
            } catch (java.lang.Throwable th) {
                this.getOutputStallDuration = null;
                throw th;
            }
        }
        util.h.xy.ai.e.ma maVar2 = this.getOutputSizeshNQ4ISI;
        if (maVar2 != null) {
            try {
                maVar2.dispose();
            } finally {
                this.getOutputSizeshNQ4ISI = null;
            }
        }
        util.h.xy.ai.e.ma maVar3 = this.f7071a;
        if (maVar3 != null) {
            try {
                maVar3.dispose();
            } finally {
                this.f7071a = null;
            }
        }
    }

    private util.h.xy.ai.e.ma getHighResolutionOutputSizeshNQ4ISI(long j) {
        util.h.xy.ai.e.ma maVar = new util.h.xy.ai.e.ma(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        byte[] bArr = new byte[com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)];
        for (int i = 0; i < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i++) {
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 111) % 128;
            int i2 = i * 8;
            bArr[i] = (byte) (((255 << i2) & j) >> i2);
        }
        int i3 = 1434293148;
        for (int i4 = 0; i4 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i4++) {
            getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 107) % 128;
            byte b = bArr[i4];
            bArr[i4] = (byte) (((byte) (i3 & 255)) ^ b);
            i3 = ((i3 << (i4 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))) | (i3 >>> (((com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8) - 1) - (i4 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))))) * (~(b & 255));
        }
        long j2 = 0;
        for (int i5 = 0; i5 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i5++) {
            getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 101) % 128;
            j2 |= (bArr[i5] & 255) << (i5 * 8);
        }
        maVar.setLong(0L, j2);
        return maVar;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m24674(int i) {
        this.getOutputMinFrameDurationlomOqCM = i;
        util.h.xy.ai.e.ma maVar = this.getOutputStallDuration;
        if (maVar != null) {
            int i2 = getHighSpeedVideoFpsRanges + 25;
            Camera2StreamConfigurationMap = i2 % 128;
            try {
                if (i2 % 2 != 0) {
                    maVar.dispose();
                    throw null;
                }
                maVar.dispose();
            } finally {
                this.getOutputStallDuration = null;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE) * i;
        int i3 = (Camera2StreamConfigurationMap + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        getHighSpeedVideoFpsRanges = i3;
        int i4 = i3 + 7;
        Camera2StreamConfigurationMap = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        this.getOutputStallDuration = new util.h.xy.ai.e.ma(nativeSize + 117);
        util.h.xy.ai.e.ma maVar2 = this.getOutputSizeshNQ4ISI;
        if (maVar2 != null) {
            int i5 = Camera2StreamConfigurationMap + 25;
            getHighSpeedVideoFpsRanges = i5 % 128;
            try {
                if (i5 % 2 == 0) {
                    maVar2.dispose();
                    throw null;
                }
                maVar2.dispose();
            } finally {
                this.getOutputSizeshNQ4ISI = null;
            }
        }
        util.h.xy.ai.e.ma maVar3 = new util.h.xy.ai.e.ma(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        this.getOutputSizeshNQ4ISI = maVar3;
        long nativeValue = com.sun.jna.Pointer.nativeValue(this.getOutputStallDuration);
        int i6 = getHighSpeedVideoFpsRanges + 99;
        Camera2StreamConfigurationMap = i6 % 128;
        maVar3.setPointer(0L, new com.sun.jna.Pointer(nativeValue + (i6 % 2 != 0 ? 38 : 100)));
        util.h.xy.ai.e.ma maVar4 = this.f7071a;
        if (maVar4 != null) {
            try {
                maVar4.dispose();
            } finally {
                this.f7071a = null;
            }
        }
        this.f7071a = getHighResolutionOutputSizeshNQ4ISI(com.sun.jna.Pointer.nativeValue(this.getOutputSizeshNQ4ISI));
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m24661(byte[] bArr) throws java.io.IOException {
        int i = Camera2StreamConfigurationMap + 89;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 == 0) {
            m24674(bArr.length);
            util.h.xy.ai.e.ma maVar = this.getOutputStallDuration;
            int i2 = getHighSpeedVideoFpsRanges + 99;
            Camera2StreamConfigurationMap = i2 % 128;
            maVar.write(i2 % 2 == 0 ? 100 : 38, bArr, 0, bArr.length);
        } else {
            m24674(bArr.length);
            util.h.xy.ai.e.ma maVar2 = this.getOutputStallDuration;
            int i3 = getHighSpeedVideoFpsRanges + 99;
            Camera2StreamConfigurationMap = i3 % 128;
            maVar2.write(i3 % 2 == 0 ? 100 : 38, bArr, 0, bArr.length);
        }
        getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 3) % 128;
    }

    private static int getHighSpeedVideoFpsRangesFor() {
        int i = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRanges = (i + 11) % 128;
        int i2 = i + 125;
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 != 0) {
            return 66;
        }
        throw null;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    protected final void m24652() {
        int i = getHighSpeedVideoFpsRanges;
        Camera2StreamConfigurationMap = (i + 63) % 128;
        util.h.xy.ai.e.ma maVar = this.getARTIFICIAL_FRAME_PACKAGE_NAME;
        if (maVar != null) {
            Camera2StreamConfigurationMap = (i + 97) % 128;
            try {
                maVar.dispose();
            } finally {
                this.getARTIFICIAL_FRAME_PACKAGE_NAME = null;
            }
        }
        util.h.xy.ai.e.ma maVar2 = this.unwrapAs;
        if (maVar2 != null) {
            int i2 = Camera2StreamConfigurationMap + 1;
            getHighSpeedVideoFpsRanges = i2 % 128;
            try {
                if (i2 % 2 == 0) {
                    maVar2.dispose();
                    throw null;
                }
                maVar2.dispose();
                this.unwrapAs = null;
                getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 35) % 128;
            } finally {
                this.unwrapAs = null;
            }
        }
    }

    /* renamed from: ι, reason: contains not printable characters */
    public final void m24676(int i) {
        util.h.xy.ai.e.ma maVar = this.getARTIFICIAL_FRAME_PACKAGE_NAME;
        if (maVar != null) {
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 19) % 128;
            try {
                maVar.dispose();
            } finally {
                this.getARTIFICIAL_FRAME_PACKAGE_NAME = null;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE);
        int i2 = (Camera2StreamConfigurationMap + 109) % 128;
        getHighSpeedVideoFpsRanges = i2;
        Camera2StreamConfigurationMap = (i2 + 37) % 128;
        util.h.xy.ai.e.ma maVar2 = new util.h.xy.ai.e.ma(nativeSize + 117);
        this.getARTIFICIAL_FRAME_PACKAGE_NAME = maVar2;
        getHighSpeedVideoFpsRangesFor();
        maVar2.setInt(66L, i);
        util.h.xy.ai.e.ma maVar3 = this.unwrapAs;
        if (maVar3 != null) {
            try {
                maVar3.dispose();
                this.unwrapAs = null;
                getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 53) % 128;
            } catch (java.lang.Throwable th) {
                this.unwrapAs = null;
                throw th;
            }
        }
        long nativeValue = com.sun.jna.Pointer.nativeValue(this.getARTIFICIAL_FRAME_PACKAGE_NAME);
        getHighSpeedVideoFpsRangesFor();
        util.h.xy.ai.e.ma maVar4 = new util.h.xy.ai.e.ma(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        maVar4.setLong(0L, 536432575 ^ (nativeValue + 66));
        int i3 = Camera2StreamConfigurationMap + 83;
        getHighSpeedVideoFpsRanges = i3 % 128;
        if (i3 % 2 != 0) {
            this.unwrapAs = maVar4;
            return;
        }
        throw null;
    }

    /* renamed from: ͺ, reason: contains not printable characters */
    protected final void m24672() {
        util.h.xy.ai.e.ma maVar = this.b;
        if (maVar != null) {
            getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 41) % 128;
            try {
                maVar.dispose();
            } finally {
                this.b = null;
            }
        }
        util.h.xy.ai.e.ma maVar2 = this.ArtificialStackFrames;
        if (maVar2 != null) {
            try {
                maVar2.dispose();
            } finally {
                this.ArtificialStackFrames = null;
            }
        }
        util.h.xy.ai.e.ma maVar3 = this.coroutineCreation;
        if (maVar3 != null) {
            try {
                maVar3.dispose();
            } finally {
                this.coroutineCreation = null;
            }
        }
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 61) % 128;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public final void m24655(int i) {
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 107) % 128;
        this.accessartificialFrame = i;
        util.h.xy.ai.e.ma maVar = this.b;
        if (maVar != null) {
            try {
                maVar.dispose();
            } finally {
                this.b = null;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE) * i;
        int i2 = getHighSpeedVideoFpsRanges + 115;
        Camera2StreamConfigurationMap = i2 % 128;
        this.b = new util.h.xy.ai.e.ma(nativeSize + (i2 % 2 != 0 ? com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE : 121));
        util.h.xy.ai.e.ma maVar2 = this.ArtificialStackFrames;
        if (maVar2 != null) {
            int i3 = getHighSpeedVideoFpsRanges + 101;
            Camera2StreamConfigurationMap = i3 % 128;
            try {
                if (i3 % 2 == 0) {
                    maVar2.dispose();
                } else {
                    maVar2.dispose();
                    throw null;
                }
            } finally {
                this.ArtificialStackFrames = null;
            }
        }
        util.h.xy.ai.e.ma maVar3 = new util.h.xy.ai.e.ma(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        this.ArtificialStackFrames = maVar3;
        long nativeValue = com.sun.jna.Pointer.nativeValue(this.b);
        int i4 = Camera2StreamConfigurationMap + 5;
        getHighSpeedVideoFpsRanges = i4 % 128;
        maVar3.setPointer(0L, new com.sun.jna.Pointer(nativeValue + (i4 % 2 == 0 ? 7 : 80)));
        util.h.xy.ai.e.ma maVar4 = this.coroutineCreation;
        if (maVar4 != null) {
            try {
                maVar4.dispose();
            } finally {
                this.coroutineCreation = null;
            }
        }
        long nativeValue2 = com.sun.jna.Pointer.nativeValue(this.ArtificialStackFrames);
        util.h.xy.ai.e.ma maVar5 = new util.h.xy.ai.e.ma(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        byte[] bArr = new byte[com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)];
        for (int i5 = 0; i5 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i5++) {
            int i6 = i5 * 8;
            bArr[i5] = (byte) (((255 << i6) & nativeValue2) >> i6);
        }
        int i7 = 1297616884;
        for (int i8 = 0; i8 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i8++) {
            getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 17) % 128;
            byte b = bArr[i8];
            bArr[i8] = (byte) (((byte) (i7 & 255)) ^ b);
            i7 = ((i7 << (i8 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))) | (i7 >>> (((com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8) - 1) - (i8 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))))) * (~(b & 255));
        }
        long j = 0;
        for (int i9 = 0; i9 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i9++) {
            getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 21) % 128;
            j |= (bArr[i9] & 255) << (i9 * 8);
        }
        maVar5.setLong(0L, j);
        this.coroutineCreation = maVar5;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public final byte[] m24656() throws java.io.IOException {
        int i = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRanges = (i + 59) % 128;
        util.h.xy.ai.e.ma maVar = this.b;
        if (maVar == null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes("쁳\uee71\ue57c璄盋䰩మ№䃾怆탐㛹ᠼ\ueaa4頴ᶓ鍈蝉ꙓ꼪ɀ旅찍ꢵ谔껵㩘\uea9e៧锝푓ੜ췔㐱뭈뺐쿔村\ue2c9", (char) (50278 - android.graphics.Color.red(0)), 1728069594 - android.graphics.Color.argb(0, 0, 0, 0), "\uda5b?晧\uaac4", "\u0000\u0000\u0000\u0000", objArr);
            throw new java.io.IOException(((java.lang.String) objArr[0]).intern());
        }
        int i2 = this.accessartificialFrame;
        byte[] bArr = new byte[i2];
        int i3 = i + 5;
        getHighSpeedVideoFpsRanges = i3 % 128;
        maVar.read(i3 % 2 == 0 ? 7 : 80, bArr, 0, i2);
        int i4 = getHighSpeedVideoFpsRanges + 29;
        Camera2StreamConfigurationMap = i4 % 128;
        if (i4 % 2 == 0) {
            return bArr;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m24671(byte[] bArr) throws java.io.IOException {
        int i = getHighSpeedVideoFpsRanges + 125;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 != 0) {
            m24655(bArr.length);
            util.h.xy.ai.e.ma maVar = this.b;
            int i2 = Camera2StreamConfigurationMap + 5;
            getHighSpeedVideoFpsRanges = i2 % 128;
            maVar.write(1 - (i2 % 2 != 0 ? 80 : 7), bArr, 1, bArr.length);
            return;
        }
        m24655(bArr.length);
        util.h.xy.ai.e.ma maVar2 = this.b;
        int i3 = Camera2StreamConfigurationMap + 5;
        getHighSpeedVideoFpsRanges = i3 % 128;
        maVar2.write(i3 % 2 != 0 ? 80 : 7, bArr, 0, bArr.length);
    }

    private static int getHighResolutionOutputSizeshNQ4ISI() {
        int i = Camera2StreamConfigurationMap;
        int i2 = i + 121;
        getHighSpeedVideoFpsRanges = i2 % 128;
        int i3 = i2 % 2 == 0 ? 10 : 98;
        getHighSpeedVideoFpsRanges = (i + 11) % 128;
        return i3;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    protected final void m24654() {
        util.h.xy.ai.e.ma maVar = this.resetTransaction;
        if (maVar != null) {
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 39) % 128;
            try {
                maVar.dispose();
            } finally {
                this.resetTransaction = null;
            }
        }
        util.h.xy.ai.e.ma maVar2 = this.init;
        if (maVar2 != null) {
            int i = getHighSpeedVideoFpsRanges + 63;
            Camera2StreamConfigurationMap = i % 128;
            try {
                if (i % 2 == 0) {
                    maVar2.dispose();
                } else {
                    maVar2.dispose();
                    this.init = null;
                    throw new java.lang.ArithmeticException();
                }
            } finally {
                this.init = null;
            }
        }
        util.h.xy.ai.e.ma maVar3 = this._BOUNDARY;
        if (maVar3 != null) {
            try {
                maVar3.dispose();
            } finally {
                this._BOUNDARY = null;
            }
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public final void m24653(int i) {
        this.getInputSizeshNQ4ISI = i;
        util.h.xy.ai.e.ma maVar = this.resetTransaction;
        if (maVar != null) {
            try {
                maVar.dispose();
            } finally {
                this.resetTransaction = null;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * i;
        int i2 = (Camera2StreamConfigurationMap + 39) % 128;
        getHighSpeedVideoFpsRanges = i2;
        int i3 = i2 + 101;
        Camera2StreamConfigurationMap = i3 % 128;
        if (i3 % 2 == 0) {
            this.resetTransaction = new util.h.xy.ai.e.ma(nativeSize + 129);
            util.h.xy.ai.e.ma maVar2 = this.init;
            if (maVar2 != null) {
                getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 61) % 128;
                try {
                    maVar2.dispose();
                } finally {
                    this.init = null;
                }
            }
            util.h.xy.ai.e.ma maVar3 = new util.h.xy.ai.e.ma(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
            this.init = maVar3;
            maVar3.setPointer(0L, new com.sun.jna.Pointer(com.sun.jna.Pointer.nativeValue(this.resetTransaction) + getHighResolutionOutputSizeshNQ4ISI()));
            util.h.xy.ai.e.ma maVar4 = this._BOUNDARY;
            if (maVar4 != null) {
                try {
                    maVar4.dispose();
                } finally {
                    this._BOUNDARY = null;
                }
            }
            long nativeValue = com.sun.jna.Pointer.nativeValue(this.init);
            util.h.xy.ai.e.ma maVar5 = new util.h.xy.ai.e.ma(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
            maVar5.setLong(0L, nativeValue ^ 1342858427);
            int i4 = Camera2StreamConfigurationMap + 65;
            int i5 = i4 % 128;
            getHighSpeedVideoFpsRanges = i5;
            if (i4 % 2 != 0) {
                this._BOUNDARY = maVar5;
                Camera2StreamConfigurationMap = (i5 + 45) % 128;
                return;
            }
            throw null;
        }
        throw null;
    }

    /* renamed from: ι, reason: contains not printable characters */
    public final int[] m24677() throws java.io.IOException {
        getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 95) % 128;
        util.h.xy.ai.e.ma maVar = this.resetTransaction;
        if (maVar == null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes("櫬\uf7a0徉ꅯ궐\ue277\udbec䩑\u0d99쨸\ue110鑃䝿ዺ\uf70d樄崀역Н驧罰읽绚ꩱꨨ爑迷￥\ue09cফ\ueb21閤䜗䚈ꑿ\ue5e7䵾\uf73d띯馃㺖\uecc6\udcb9\ue21f", (char) (21200 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), (-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), "뗹ඤ텗\ue852", "\u0000\u0000\u0000\u0000", objArr);
            throw new java.io.IOException(((java.lang.String) objArr[0]).intern());
        }
        int[] iArr = new int[this.getInputSizeshNQ4ISI];
        maVar.read(getHighResolutionOutputSizeshNQ4ISI(), iArr, 0, this.getInputSizeshNQ4ISI);
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 103) % 128;
        return iArr;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m24664(int[] iArr) throws java.io.IOException {
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 49) % 128;
        m24653(iArr.length);
        this.resetTransaction.write(getHighResolutionOutputSizeshNQ4ISI(), iArr, 0, iArr.length);
        int i = Camera2StreamConfigurationMap + 105;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    protected final void m24657() {
        util.h.xy.ai.e.ma maVar = this.c;
        if (maVar != null) {
            int i = getHighSpeedVideoFpsRanges + 45;
            Camera2StreamConfigurationMap = i % 128;
            try {
                if (i % 2 != 0) {
                    maVar.dispose();
                    throw null;
                }
                maVar.dispose();
            } finally {
                this.c = null;
            }
        }
        util.h.xy.ai.e.ma maVar2 = this.AMEXKernel;
        if (maVar2 != null) {
            getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 5) % 128;
            try {
                maVar2.dispose();
            } finally {
                this.AMEXKernel = null;
            }
        }
        util.h.xy.ai.e.ma maVar3 = this.d;
        if (maVar3 != null) {
            getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 37) % 128;
            try {
                maVar3.dispose();
            } finally {
                this.d = null;
            }
        }
        int i2 = Camera2StreamConfigurationMap + 87;
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private util.h.xy.ai.e.ma getHighSpeedVideoFpsRangesFor(long j) {
        util.h.xy.ai.e.ma maVar = new util.h.xy.ai.e.ma(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        byte[] bArr = new byte[com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)];
        int i = 0;
        while (i < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)) {
            int i2 = getHighSpeedVideoFpsRanges + 101;
            Camera2StreamConfigurationMap = i2 % 128;
            if (i2 % 2 != 0) {
                bArr[i] = (byte) (((255 << (i << 109)) | j) >> (i >> 103));
                i += 75;
            } else {
                int i3 = i * 8;
                bArr[i] = (byte) (((255 << i3) & j) >> i3);
                i++;
            }
        }
        int i4 = 1570362428;
        for (int i5 = 0; i5 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i5++) {
            getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 107) % 128;
            byte b = bArr[i5];
            bArr[i5] = (byte) (((byte) (i4 & 255)) ^ b);
            i4 = ((i4 << (i5 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))) | (i4 >>> (((com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8) - 1) - (i5 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))))) * (~(b & 255));
        }
        long j2 = 0;
        for (int i6 = 0; i6 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i6++) {
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 87) % 128;
            j2 |= (bArr[i6] & 255) << (i6 * 8);
        }
        maVar.setLong(0L, j2);
        return maVar;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public final int m24658() throws java.io.IOException {
        if (this._CREATION != null) {
            int i = Camera2StreamConfigurationMap + 81;
            int i2 = i % 128;
            getHighSpeedVideoFpsRanges = i2;
            if (i % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            if (this.getOutputFormats != null && this.coroutineBoundary != null) {
                int i3 = i2 + 25;
                Camera2StreamConfigurationMap = i3 % 128;
                if (i3 % 2 != 0) {
                    throw null;
                }
                if (this.getOutputSizes != null && this.f7071a != null && this.unwrapAs != null && this.coroutineCreation != null && this._BOUNDARY != null) {
                    int i4 = (i2 + 105) % 128;
                    Camera2StreamConfigurationMap = i4;
                    getHighSpeedVideoFpsRanges = (i4 + 75) % 128;
                    util.h.xy.ai.e.ma maVar = this.c;
                    if (maVar != null) {
                        try {
                            maVar.dispose();
                        } finally {
                            this.c = null;
                        }
                    }
                    int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE);
                    int i5 = getHighSpeedVideoFpsRanges + 35;
                    int i6 = i5 % 128;
                    Camera2StreamConfigurationMap = i6;
                    int i7 = i5 % 2 != 0 ? 86 : 107;
                    getHighSpeedVideoFpsRanges = (i6 + 51) % 128;
                    this.c = new util.h.xy.ai.e.ma(nativeSize + i7);
                    util.h.xy.ai.e.ma maVar2 = this.AMEXKernel;
                    if (maVar2 != null) {
                        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 81) % 128;
                        try {
                            maVar2.dispose();
                        } finally {
                            this.AMEXKernel = null;
                        }
                    }
                    util.h.xy.ai.e.ma maVar3 = new util.h.xy.ai.e.ma(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
                    this.AMEXKernel = maVar3;
                    long nativeValue = com.sun.jna.Pointer.nativeValue(this.c);
                    int i8 = (Camera2StreamConfigurationMap + 17) % 128;
                    getHighSpeedVideoFpsRanges = i8;
                    Camera2StreamConfigurationMap = (i8 + 53) % 128;
                    maVar3.setPointer(0L, new com.sun.jna.Pointer(nativeValue + 84));
                    util.h.xy.ai.e.ma maVar4 = this.d;
                    if (maVar4 != null) {
                        try {
                            maVar4.dispose();
                        } finally {
                            this.d = null;
                        }
                    }
                    this.d = getHighSpeedVideoFpsRangesFor(com.sun.jna.Pointer.nativeValue(this.AMEXKernel));
                    util.h.xy.ai.rf.getHighSpeedVideoSizes._GAsBZSW9wcqmQdWd2MwwWT(this.d, this._CREATION, this.getOutputFormats, this.coroutineBoundary, this.getOutputSizes, this.f7071a, this.unwrapAs, this.coroutineCreation, this._BOUNDARY);
                    int[] iArr = new int[1];
                    util.h.xy.ai.e.ma maVar5 = this.c;
                    int i9 = (Camera2StreamConfigurationMap + 17) % 128;
                    getHighSpeedVideoFpsRanges = i9;
                    Camera2StreamConfigurationMap = (i9 + 53) % 128;
                    maVar5.read(84L, iArr, 0, 1);
                    return iArr[0];
                }
            }
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoSizes("ﵞ鬋푙韟踴䏪阖\uec11䐐ꃊ箓㠆㵀\u1c4cਅ㭓꣱\ue11e诎\uf44f\u17fa䗾궯\ud7aeﰨ\ue695ڷ솧庝슏顢\u8bcf9橱ὃ῍뿡뤠蠞⤀\udae9쟡ꁫ\ue9d5뺨\uf85a徎ꠣ會䵢", (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), android.view.KeyEvent.normalizeMetaState(0), "\uec13빧⺙\u1afb", "\u0000\u0000\u0000\u0000", objArr);
        throw new java.io.IOException(((java.lang.String) objArr[0]).intern());
    }

    /* renamed from: ˌ, reason: contains not printable characters */
    public final void m24665() {
        int i = getHighSpeedVideoFpsRanges + 53;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 == 0) {
            m24669();
            m24662();
            m24673();
            m24659();
            m24666();
            m24652();
            m24672();
            m24654();
            m24657();
            int i2 = Camera2StreamConfigurationMap + 105;
            getHighSpeedVideoFpsRanges = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            return;
        }
        m24669();
        m24662();
        m24673();
        m24659();
        m24666();
        m24652();
        m24672();
        m24654();
        m24657();
        throw null;
    }
}
