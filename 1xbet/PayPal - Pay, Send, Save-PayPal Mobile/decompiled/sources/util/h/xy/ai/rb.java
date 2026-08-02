package util.h.xy.ai;

/* loaded from: classes5.dex */
public final class rb {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 0;
    private static int getInputSizeshNQ4ISI = 1;
    private static char[] getInputFormats = {64235, 64211, 64209, 64208, 64292, 64225, 64231, 64232, 64227, 64245, 64212, 64262, 64223, 64226, 64214, 64241, 64239, 64222, 64264, 64234, 64237, 64236, 64271, 64224, 64213};
    private static int getHighResolutionOutputSizeshNQ4ISI = -1074857148;
    private static boolean getHighSpeedVideoFpsRanges = true;
    private static boolean getOutputFormats = true;
    private int toString = 0;
    private util.h.xy.ai.rb.ma getValidOutputFormatsForInputhNQ4ISI = null;
    private util.h.xy.ai.rb.ma CoroutineDebuggingKt = null;
    private util.h.xy.ai.rb.ma isOutputSupportedForhNQ4ISI = null;
    private util.h.xy.ai.rb.ma ArtificialStackFrames = null;
    private util.h.xy.ai.rb.ma coroutineCreation = null;
    private int getOutputMinFrameDuration = 0;
    private util.h.xy.ai.rb.ma getHighSpeedVideoSizesFor = null;
    private util.h.xy.ai.rb.ma _BOUNDARY = null;
    private util.h.xy.ai.rb.ma getOutputSizeshNQ4ISI = null;
    private int getOutputSizes = 0;
    private util.h.xy.ai.rb.ma getOutputStallDurationlomOqCM = null;
    private util.h.xy.ai.rb.ma unwrapAs = null;
    private util.h.xy.ai.rb.ma getOutputStallDuration = null;
    private util.h.xy.ai.rb.ma getOutputMinFrameDurationlomOqCM = null;
    private util.h.xy.ai.rb.ma coroutineBoundary = null;
    private util.h.xy.ai.rb.ma isOutputSupportedFor = null;
    private util.h.xy.ai.rb.ma getARTIFICIAL_FRAME_PACKAGE_NAME = null;
    private util.h.xy.ai.rb.ma accessartificialFrame = null;

    protected final void finalize() {
        getInputSizeshNQ4ISI = (getHighSpeedVideoSizes + 101) % 128;
        m24848();
        getHighSpeedVideoSizes = (getInputSizeshNQ4ISI + 61) % 128;
    }

    final class ma extends com.sun.jna.Memory {
        private static int getHighResolutionOutputSizeshNQ4ISI = 1;
        private static int getHighSpeedVideoFpsRanges;

        public ma(long j) {
            super(j);
        }

        @Override // com.sun.jna.Memory
        public final void dispose() {
            int i = getHighResolutionOutputSizeshNQ4ISI;
            getHighSpeedVideoFpsRanges = ((i ^ 73) + ((i & 73) << 1)) % 128;
            super.dispose();
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 79) % 128;
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    protected final void m24845() {
        util.h.xy.ai.rb.ma maVar = this.getValidOutputFormatsForInputhNQ4ISI;
        if (maVar != null) {
            int i = getHighSpeedVideoSizes + 101;
            getInputSizeshNQ4ISI = i % 128;
            try {
                if (i % 2 == 0) {
                    maVar.dispose();
                    this.getValidOutputFormatsForInputhNQ4ISI = null;
                    throw new java.lang.ArithmeticException();
                }
                maVar.dispose();
            } finally {
                this.getValidOutputFormatsForInputhNQ4ISI = null;
            }
        }
        util.h.xy.ai.rb.ma maVar2 = this.CoroutineDebuggingKt;
        if (maVar2 != null) {
            getInputSizeshNQ4ISI = (getHighSpeedVideoSizes + 81) % 128;
            try {
                maVar2.dispose();
            } finally {
                this.CoroutineDebuggingKt = null;
            }
        }
        util.h.xy.ai.rb.ma maVar3 = this.isOutputSupportedForhNQ4ISI;
        if (maVar3 != null) {
            getHighSpeedVideoSizes = (getInputSizeshNQ4ISI + 19) % 128;
            try {
                maVar3.dispose();
            } finally {
                this.isOutputSupportedForhNQ4ISI = null;
            }
        }
    }

    private util.h.xy.ai.rb.ma getHighResolutionOutputSizeshNQ4ISI(long j) {
        util.h.xy.ai.rb.ma maVar = new util.h.xy.ai.rb.ma(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        byte[] bArr = new byte[com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)];
        int i = 0;
        while (i < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)) {
            int i2 = getHighSpeedVideoSizes + 87;
            getInputSizeshNQ4ISI = i2 % 128;
            if (i2 % 2 == 0) {
                bArr[i] = (byte) (((255 >>> (i * 43)) & j) << (i + 8));
                i += 106;
            } else {
                int i3 = i * 8;
                bArr[i] = (byte) (((255 << i3) & j) >> i3);
                i++;
            }
        }
        getHighSpeedVideoSizes = (getInputSizeshNQ4ISI + 99) % 128;
        int i4 = 1874714628;
        for (int i5 = 0; i5 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i5++) {
            getHighSpeedVideoSizes = (getInputSizeshNQ4ISI + 105) % 128;
            byte b = bArr[i5];
            bArr[i5] = (byte) (((byte) (i4 & 255)) ^ b);
            i4 = ((i4 << (i5 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))) | (i4 >>> (((com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8) - 1) - (i5 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))))) * (~(b & 255));
        }
        long j2 = 0;
        for (int i6 = 0; i6 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i6++) {
            j2 |= (bArr[i6] & 255) << (i6 * 8);
        }
        maVar.setLong(0L, j2);
        return maVar;
    }

    private static void getHighSpeedVideoFpsRangesFor(int i, java.lang.String str, java.lang.Object[] objArr) {
        int i2;
        int i3 = getHighSpeedVideoFpsRangesFor + 73;
        Camera2StreamConfigurationMap = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        byte[] bytes = str.getBytes("ISO-8859-1");
        util.h.xz.b.md mdVar = new util.h.xz.b.md();
        char[] cArr = getInputFormats;
        if (cArr != null) {
            getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 43) % 128;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i4 = 0; i4 < length; i4++) {
                cArr2[i4] = (char) (cArr[i4] ^ (-3299939579226817547L));
            }
            cArr = cArr2;
        }
        int i5 = (int) ((-3299939579226817547L) ^ getHighResolutionOutputSizeshNQ4ISI);
        if (!getOutputFormats) {
            if (!getHighSpeedVideoFpsRanges) {
                throw null;
            }
            throw null;
        }
        mdVar.f2642 = bytes.length;
        char[] cArr3 = new char[mdVar.f2642];
        mdVar.f2643 = 0;
        while (mdVar.f2643 < mdVar.f2642) {
            int i6 = Camera2StreamConfigurationMap + 1;
            getHighSpeedVideoFpsRangesFor = i6 % 128;
            if (i6 % 2 != 0) {
                cArr3[mdVar.f2643] = (char) (cArr[bytes[mdVar.f2642 / mdVar.f2643] + i] * i5);
                i2 = mdVar.f2643 >>> 1;
            } else {
                cArr3[mdVar.f2643] = (char) (cArr[bytes[(mdVar.f2642 - 1) - mdVar.f2643] + i] - i5);
                i2 = mdVar.f2643 + 1;
            }
            mdVar.f2643 = i2;
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m24835(int i) {
        int i2 = getHighSpeedVideoSizes + 125;
        getInputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            this.toString = i;
            throw null;
        }
        this.toString = i;
        util.h.xy.ai.rb.ma maVar = this.getValidOutputFormatsForInputhNQ4ISI;
        if (maVar != null) {
            try {
                maVar.dispose();
            } finally {
                this.getValidOutputFormatsForInputhNQ4ISI = null;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE) * i;
        int i3 = getHighSpeedVideoSizes;
        getInputSizeshNQ4ISI = (i3 + 43) % 128;
        int i4 = i3 + 113;
        getInputSizeshNQ4ISI = i4 % 128;
        if (i4 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        this.getValidOutputFormatsForInputhNQ4ISI = new util.h.xy.ai.rb.ma(nativeSize + 117);
        util.h.xy.ai.rb.ma maVar2 = this.CoroutineDebuggingKt;
        if (maVar2 != null) {
            getHighSpeedVideoSizes = (getInputSizeshNQ4ISI + 63) % 128;
            try {
                maVar2.dispose();
            } finally {
                this.CoroutineDebuggingKt = null;
            }
        }
        util.h.xy.ai.rb.ma maVar3 = new util.h.xy.ai.rb.ma(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        this.CoroutineDebuggingKt = maVar3;
        long nativeValue = com.sun.jna.Pointer.nativeValue(this.getValidOutputFormatsForInputhNQ4ISI);
        int i5 = (getHighSpeedVideoSizes + 89) % 128;
        getInputSizeshNQ4ISI = i5;
        getHighSpeedVideoSizes = (i5 + 81) % 128;
        maVar3.setPointer(0L, new com.sun.jna.Pointer(nativeValue + 92));
        util.h.xy.ai.rb.ma maVar4 = this.isOutputSupportedForhNQ4ISI;
        if (maVar4 != null) {
            try {
                maVar4.dispose();
                this.isOutputSupportedForhNQ4ISI = null;
                getInputSizeshNQ4ISI = (getHighSpeedVideoSizes + 69) % 128;
            } catch (java.lang.Throwable th) {
                this.isOutputSupportedForhNQ4ISI = null;
                throw th;
            }
        }
        this.isOutputSupportedForhNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(com.sun.jna.Pointer.nativeValue(this.CoroutineDebuggingKt));
        getHighSpeedVideoSizes = (getInputSizeshNQ4ISI + 43) % 128;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m24847(byte[] bArr) throws java.io.IOException {
        int i = getHighSpeedVideoSizes + 77;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            m24835(bArr.length);
            util.h.xy.ai.rb.ma maVar = this.getValidOutputFormatsForInputhNQ4ISI;
            int i2 = (getHighSpeedVideoSizes + 89) % 128;
            getInputSizeshNQ4ISI = i2;
            getHighSpeedVideoSizes = (i2 + 81) % 128;
            maVar.write(268435456L, bArr, 0, bArr.length);
        } else {
            m24835(bArr.length);
            util.h.xy.ai.rb.ma maVar2 = this.getValidOutputFormatsForInputhNQ4ISI;
            int i3 = (getHighSpeedVideoSizes + 89) % 128;
            getInputSizeshNQ4ISI = i3;
            getHighSpeedVideoSizes = (i3 + 81) % 128;
            maVar2.write(92L, bArr, 0, bArr.length);
        }
        int i4 = getHighSpeedVideoSizes + 119;
        getInputSizeshNQ4ISI = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    protected final void m24834() {
        util.h.xy.ai.rb.ma maVar = this.ArtificialStackFrames;
        if (maVar != null) {
            int i = getInputSizeshNQ4ISI + 113;
            getHighSpeedVideoSizes = i % 128;
            try {
                if (i % 2 != 0) {
                    maVar.dispose();
                    this.ArtificialStackFrames = null;
                    throw new java.lang.ArithmeticException();
                }
                maVar.dispose();
                this.ArtificialStackFrames = null;
                getHighSpeedVideoSizes = (getInputSizeshNQ4ISI + 117) % 128;
            } catch (java.lang.Throwable th) {
                this.ArtificialStackFrames = null;
                throw th;
            }
        }
        util.h.xy.ai.rb.ma maVar2 = this.coroutineCreation;
        if (maVar2 != null) {
            getInputSizeshNQ4ISI = (getHighSpeedVideoSizes + 91) % 128;
            try {
                maVar2.dispose();
            } finally {
                this.coroutineCreation = null;
            }
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m24840(int i) {
        int i2 = getInputSizeshNQ4ISI;
        getHighSpeedVideoSizes = (i2 + 1) % 128;
        util.h.xy.ai.rb.ma maVar = this.ArtificialStackFrames;
        if (maVar != null) {
            getHighSpeedVideoSizes = (i2 + 117) % 128;
            try {
                maVar.dispose();
            } finally {
                this.ArtificialStackFrames = null;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE);
        int i3 = (getHighSpeedVideoSizes + 121) % 128;
        getInputSizeshNQ4ISI = i3;
        getHighSpeedVideoSizes = (i3 + 25) % 128;
        util.h.xy.ai.rb.ma maVar2 = new util.h.xy.ai.rb.ma(nativeSize + 105);
        this.ArtificialStackFrames = maVar2;
        int i4 = getInputSizeshNQ4ISI + 39;
        getHighSpeedVideoSizes = i4 % 128;
        maVar2.setInt(i4 % 2 != 0 ? 25 : 90, i);
        util.h.xy.ai.rb.ma maVar3 = this.coroutineCreation;
        if (maVar3 != null) {
            getInputSizeshNQ4ISI = (getHighSpeedVideoSizes + 117) % 128;
            try {
                maVar3.dispose();
            } finally {
                this.coroutineCreation = null;
            }
        }
        long nativeValue = com.sun.jna.Pointer.nativeValue(this.ArtificialStackFrames);
        int i5 = getInputSizeshNQ4ISI + 39;
        getHighSpeedVideoSizes = i5 % 128;
        long j = nativeValue + (i5 % 2 == 0 ? 90 : 25);
        util.h.xy.ai.rb.ma maVar4 = new util.h.xy.ai.rb.ma(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        maVar4.setLong(0L, j ^ 1100527363);
        int i6 = getHighSpeedVideoSizes + 11;
        getInputSizeshNQ4ISI = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
        this.coroutineCreation = maVar4;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    protected final void m24841() {
        util.h.xy.ai.rb.ma maVar = this.getHighSpeedVideoSizesFor;
        if (maVar != null) {
            int i = getHighSpeedVideoSizes + 19;
            getInputSizeshNQ4ISI = i % 128;
            try {
                if (i % 2 == 0) {
                    maVar.dispose();
                    this.getHighSpeedVideoSizesFor = null;
                    throw new java.lang.ArithmeticException();
                }
                maVar.dispose();
            } finally {
                this.getHighSpeedVideoSizesFor = null;
            }
        }
        util.h.xy.ai.rb.ma maVar2 = this._BOUNDARY;
        if (maVar2 != null) {
            int i2 = getInputSizeshNQ4ISI + 1;
            getHighSpeedVideoSizes = i2 % 128;
            try {
                if (i2 % 2 != 0) {
                    maVar2.dispose();
                    this._BOUNDARY = null;
                    throw new java.lang.ArithmeticException();
                }
                maVar2.dispose();
            } finally {
                this._BOUNDARY = null;
            }
        }
        util.h.xy.ai.rb.ma maVar3 = this.getOutputSizeshNQ4ISI;
        if (maVar3 != null) {
            int i3 = getHighSpeedVideoSizes + 37;
            getInputSizeshNQ4ISI = i3 % 128;
            try {
                if (i3 % 2 != 0) {
                    maVar3.dispose();
                } else {
                    maVar3.dispose();
                    throw null;
                }
            } finally {
                this.getOutputSizeshNQ4ISI = null;
            }
        }
    }

    private util.h.xy.ai.rb.ma Camera2StreamConfigurationMap(long j) {
        util.h.xy.ai.rb.ma maVar = new util.h.xy.ai.rb.ma(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        byte[] bArr = new byte[com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)];
        getInputSizeshNQ4ISI = (getHighSpeedVideoSizes + 79) % 128;
        int i = 0;
        int i2 = 0;
        while (i2 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)) {
            int i3 = getInputSizeshNQ4ISI + 83;
            getHighSpeedVideoSizes = i3 % 128;
            if (i3 % 2 != 0) {
                bArr[i2] = (byte) ((j / (255 >> (i2 * 86))) << (i2 >>> 105));
                i2 += 59;
            } else {
                int i4 = i2 * 8;
                bArr[i2] = (byte) (((255 << i4) & j) >> i4);
                i2++;
            }
        }
        int i5 = 1032189231;
        for (int i6 = 0; i6 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i6++) {
            byte b = bArr[i6];
            bArr[i6] = (byte) (((byte) (i5 & 255)) ^ b);
            i5 = ((i5 << (i6 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))) | (i5 >>> (((com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8) - 1) - (i6 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))))) * (~(b & 255));
        }
        long j2 = 0;
        while (i < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)) {
            int i7 = getInputSizeshNQ4ISI + 35;
            getHighSpeedVideoSizes = i7 % 128;
            if (i7 % 2 != 0) {
                j2 -= (bArr[i] & 7160) << (i * 71);
                i += 6;
            } else {
                j2 |= (bArr[i] & 255) << (i * 8);
                i++;
            }
        }
        maVar.setLong(0L, j2);
        return maVar;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m24842(int i) {
        this.getOutputMinFrameDuration = i;
        util.h.xy.ai.rb.ma maVar = this.getHighSpeedVideoSizesFor;
        if (maVar != null) {
            int i2 = getHighSpeedVideoSizes + 1;
            getInputSizeshNQ4ISI = i2 % 128;
            try {
                if (i2 % 2 == 0) {
                    maVar.dispose();
                    this.getHighSpeedVideoSizesFor = null;
                    throw new java.lang.ArithmeticException();
                }
                maVar.dispose();
            } finally {
                this.getHighSpeedVideoSizesFor = null;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE) * i;
        int i3 = getHighSpeedVideoSizes;
        getInputSizeshNQ4ISI = (i3 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        int i4 = i3 + 13;
        getInputSizeshNQ4ISI = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        this.getHighSpeedVideoSizesFor = new util.h.xy.ai.rb.ma(nativeSize + 107);
        util.h.xy.ai.rb.ma maVar2 = this._BOUNDARY;
        if (maVar2 != null) {
            int i5 = getInputSizeshNQ4ISI + 25;
            getHighSpeedVideoSizes = i5 % 128;
            try {
                if (i5 % 2 != 0) {
                    maVar2.dispose();
                    throw null;
                }
                maVar2.dispose();
                this._BOUNDARY = null;
                getInputSizeshNQ4ISI = (getHighSpeedVideoSizes + 41) % 128;
            } finally {
                this._BOUNDARY = null;
            }
        }
        util.h.xy.ai.rb.ma maVar3 = new util.h.xy.ai.rb.ma(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        this._BOUNDARY = maVar3;
        long nativeValue = com.sun.jna.Pointer.nativeValue(this.getHighSpeedVideoSizesFor);
        int i6 = getHighSpeedVideoSizes + 19;
        getInputSizeshNQ4ISI = i6 % 128;
        maVar3.setPointer(0L, new com.sun.jna.Pointer(nativeValue + (i6 % 2 == 0 ? 103 : 80)));
        util.h.xy.ai.rb.ma maVar4 = this.getOutputSizeshNQ4ISI;
        if (maVar4 != null) {
            int i7 = getHighSpeedVideoSizes + 15;
            getInputSizeshNQ4ISI = i7 % 128;
            try {
                if (i7 % 2 == 0) {
                    maVar4.dispose();
                    throw null;
                }
                maVar4.dispose();
            } finally {
                this.getOutputSizeshNQ4ISI = null;
            }
        }
        this.getOutputSizeshNQ4ISI = Camera2StreamConfigurationMap(com.sun.jna.Pointer.nativeValue(this._BOUNDARY));
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final byte[] m24838() throws java.io.IOException {
        int i = getInputSizeshNQ4ISI + 21;
        int i2 = i % 128;
        getHighSpeedVideoSizes = i2;
        if (i % 2 != 0) {
            throw null;
        }
        util.h.xy.ai.rb.ma maVar = this.getHighSpeedVideoSizesFor;
        if (maVar == null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(127 - android.graphics.Color.argb(0, 0, 0, 0), "\u0084\u0083\u008f\u0091\u008e\u0085\u0089\u0092\u0091\u0090\u008f\u0089\u008e\u008e\u0082\u008c\u0089\u0084\u008d\u008c\u0084\u0082\u008b\u0084\u0082\u008a\u0084\u0089\u0083\u0085\u0088\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr);
            throw new java.io.IOException(((java.lang.String) objArr[0]).intern());
        }
        int i3 = this.getOutputMinFrameDuration;
        byte[] bArr = new byte[i3];
        int i4 = i2 + 19;
        getInputSizeshNQ4ISI = i4 % 128;
        maVar.read(i4 % 2 == 0 ? 103 : 80, bArr, 0, i3);
        int i5 = getHighSpeedVideoSizes + 37;
        getInputSizeshNQ4ISI = i5 % 128;
        if (i5 % 2 != 0) {
            return bArr;
        }
        throw null;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m24836(byte[] bArr) throws java.io.IOException {
        int i = getHighSpeedVideoSizes + 73;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            m24842(bArr.length);
            util.h.xy.ai.rb.ma maVar = this.getHighSpeedVideoSizesFor;
            int i2 = getHighSpeedVideoSizes + 19;
            getInputSizeshNQ4ISI = i2 % 128;
            maVar.write(i2 % 2 != 0 ? 80 : 103, bArr, 0, bArr.length);
            return;
        }
        m24842(bArr.length);
        util.h.xy.ai.rb.ma maVar2 = this.getHighSpeedVideoSizesFor;
        int i3 = getHighSpeedVideoSizes + 19;
        getInputSizeshNQ4ISI = i3 % 128;
        int i4 = 0 % (i3 % 2 != 0 ? 80 : 103);
        maVar2.write(0L, bArr, 1, bArr.length);
    }

    private static int getHighResolutionOutputSizeshNQ4ISI() {
        int i = getInputSizeshNQ4ISI + 93;
        int i2 = i % 128;
        getHighSpeedVideoSizes = i2;
        int i3 = i % 2 != 0 ? 115 : 80;
        int i4 = i2 + 15;
        getInputSizeshNQ4ISI = i4 % 128;
        if (i4 % 2 != 0) {
            return i3;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    protected final void m24839() {
        util.h.xy.ai.rb.ma maVar = this.getOutputStallDurationlomOqCM;
        if (maVar != null) {
            try {
                maVar.dispose();
                this.getOutputStallDurationlomOqCM = null;
                getHighSpeedVideoSizes = (getInputSizeshNQ4ISI + 65) % 128;
            } catch (java.lang.Throwable th) {
                this.getOutputStallDurationlomOqCM = null;
                throw th;
            }
        }
        util.h.xy.ai.rb.ma maVar2 = this.unwrapAs;
        if (maVar2 != null) {
            getHighSpeedVideoSizes = (getInputSizeshNQ4ISI + 119) % 128;
            try {
                maVar2.dispose();
            } finally {
                this.unwrapAs = null;
            }
        }
        util.h.xy.ai.rb.ma maVar3 = this.getOutputStallDuration;
        if (maVar3 != null) {
            int i = getInputSizeshNQ4ISI + 61;
            getHighSpeedVideoSizes = i % 128;
            try {
                if (i % 2 == 0) {
                    maVar3.dispose();
                } else {
                    maVar3.dispose();
                    this.getOutputStallDuration = null;
                    throw new java.lang.ArithmeticException();
                }
            } finally {
                this.getOutputStallDuration = null;
            }
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m24837(int i) {
        int i2 = getInputSizeshNQ4ISI;
        getHighSpeedVideoSizes = (i2 + 107) % 128;
        this.getOutputSizes = i;
        util.h.xy.ai.rb.ma maVar = this.getOutputStallDurationlomOqCM;
        if (maVar != null) {
            getHighSpeedVideoSizes = (i2 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
            try {
                maVar.dispose();
            } finally {
                this.getOutputStallDurationlomOqCM = null;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * i;
        int i3 = getInputSizeshNQ4ISI + 87;
        getHighSpeedVideoSizes = i3 % 128;
        this.getOutputStallDurationlomOqCM = new util.h.xy.ai.rb.ma(nativeSize + (i3 % 2 != 0 ? 25768 : 131));
        util.h.xy.ai.rb.ma maVar2 = this.unwrapAs;
        if (maVar2 != null) {
            try {
                maVar2.dispose();
            } finally {
                this.unwrapAs = null;
            }
        }
        util.h.xy.ai.rb.ma maVar3 = new util.h.xy.ai.rb.ma(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        this.unwrapAs = maVar3;
        maVar3.setPointer(0L, new com.sun.jna.Pointer(com.sun.jna.Pointer.nativeValue(this.getOutputStallDurationlomOqCM) + getHighResolutionOutputSizeshNQ4ISI()));
        util.h.xy.ai.rb.ma maVar4 = this.getOutputStallDuration;
        if (maVar4 != null) {
            getInputSizeshNQ4ISI = (getHighSpeedVideoSizes + 97) % 128;
            try {
                maVar4.dispose();
            } finally {
                this.getOutputStallDuration = null;
            }
        }
        long nativeValue = com.sun.jna.Pointer.nativeValue(this.unwrapAs);
        util.h.xy.ai.rb.ma maVar5 = new util.h.xy.ai.rb.ma(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        byte[] bArr = new byte[com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)];
        for (int i4 = 0; i4 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i4++) {
            int i5 = i4 * 8;
            bArr[i4] = (byte) (((255 << i5) & nativeValue) >> i5);
        }
        int i6 = 1543356141;
        int i7 = 0;
        while (i7 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)) {
            byte b = bArr[i7];
            bArr[i7] = (byte) (((byte) (i6 & 255)) ^ b);
            i6 = ((i6 << (i7 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))) | (i6 >>> (((com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8) - 1) - (i7 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))))) * (~(b & 255));
            i7++;
            getInputSizeshNQ4ISI = (getHighSpeedVideoSizes + 83) % 128;
        }
        long j = 0;
        for (int i8 = 0; i8 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i8++) {
            getHighSpeedVideoSizes = (getInputSizeshNQ4ISI + 85) % 128;
            j |= (bArr[i8] & 255) << (i8 * 8);
        }
        maVar5.setLong(0L, j);
        this.getOutputStallDuration = maVar5;
    }

    /* renamed from: ͺ, reason: contains not printable characters */
    public final int[] m24844() throws java.io.IOException {
        int i = getHighSpeedVideoSizes + 23;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            util.h.xy.ai.rb.ma maVar = this.getOutputStallDurationlomOqCM;
            if (maVar == null) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(android.graphics.Color.argb(0, 0, 0, 0) + 127, "\u0084\u0083\u008f\u0091\u008e\u0085\u0089\u0092\u0091\u0090\u008f\u0089\u008e\u008e\u0082\u008c\u0084\u0094\u0097\u0096\u0084\u0095\u0094\u0089\u0093\u0084\u0082\u008b\u0084\u0082\u008a\u0084\u0089\u0083\u0085\u0088\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr);
                throw new java.io.IOException(((java.lang.String) objArr[0]).intern());
            }
            int[] iArr = new int[this.getOutputSizes];
            maVar.read(getHighResolutionOutputSizeshNQ4ISI(), iArr, 0, this.getOutputSizes);
            int i2 = getHighSpeedVideoSizes + 47;
            getInputSizeshNQ4ISI = i2 % 128;
            if (i2 % 2 != 0) {
                return iArr;
            }
            throw null;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m24843(int[] iArr) throws java.io.IOException {
        getHighSpeedVideoSizes = (getInputSizeshNQ4ISI + 25) % 128;
        m24837(iArr.length);
        this.getOutputStallDurationlomOqCM.write(getHighResolutionOutputSizeshNQ4ISI(), iArr, 0, iArr.length);
        getInputSizeshNQ4ISI = (getHighSpeedVideoSizes + 31) % 128;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    protected final void m24833() {
        int i = getHighSpeedVideoSizes;
        int i2 = i + 101;
        getInputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        util.h.xy.ai.rb.ma maVar = this.getOutputMinFrameDurationlomOqCM;
        if (maVar != null) {
            int i3 = i + 21;
            getInputSizeshNQ4ISI = i3 % 128;
            try {
                if (i3 % 2 == 0) {
                    maVar.dispose();
                    throw null;
                }
                maVar.dispose();
            } finally {
                this.getOutputMinFrameDurationlomOqCM = null;
            }
        }
        util.h.xy.ai.rb.ma maVar2 = this.coroutineBoundary;
        if (maVar2 != null) {
            getHighSpeedVideoSizes = (getInputSizeshNQ4ISI + 19) % 128;
            try {
                maVar2.dispose();
            } finally {
                this.coroutineBoundary = null;
            }
        }
        int i4 = getHighSpeedVideoSizes + 51;
        getInputSizeshNQ4ISI = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m24846(int i) {
        int i2 = getHighSpeedVideoSizes + 97;
        getInputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        util.h.xy.ai.rb.ma maVar = this.getOutputMinFrameDurationlomOqCM;
        if (maVar != null) {
            try {
                maVar.dispose();
                this.getOutputMinFrameDurationlomOqCM = null;
                getHighSpeedVideoSizes = (getInputSizeshNQ4ISI + 23) % 128;
            } catch (java.lang.Throwable th) {
                this.getOutputMinFrameDurationlomOqCM = null;
                throw th;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE);
        int i3 = getInputSizeshNQ4ISI + 83;
        int i4 = i3 % 128;
        getHighSpeedVideoSizes = i4;
        int i5 = i3 % 2 != 0 ? 103 : 89;
        getInputSizeshNQ4ISI = (i4 + 23) % 128;
        util.h.xy.ai.rb.ma maVar2 = new util.h.xy.ai.rb.ma(nativeSize + i5);
        this.getOutputMinFrameDurationlomOqCM = maVar2;
        int i6 = getHighSpeedVideoSizes + 117;
        getInputSizeshNQ4ISI = i6 % 128;
        maVar2.setInt(i6 % 2 == 0 ? 31 : 70, i);
        util.h.xy.ai.rb.ma maVar3 = this.coroutineBoundary;
        if (maVar3 != null) {
            getInputSizeshNQ4ISI = (getHighSpeedVideoSizes + 23) % 128;
            try {
                maVar3.dispose();
            } finally {
                this.coroutineBoundary = null;
            }
        }
        long nativeValue = com.sun.jna.Pointer.nativeValue(this.getOutputMinFrameDurationlomOqCM);
        int i7 = getHighSpeedVideoSizes + 117;
        getInputSizeshNQ4ISI = i7 % 128;
        long j = nativeValue + (i7 % 2 != 0 ? 70 : 31);
        util.h.xy.ai.rb.ma maVar4 = new util.h.xy.ai.rb.ma(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        maVar4.setLong(0L, j ^ 1475018009);
        getInputSizeshNQ4ISI = (getHighSpeedVideoSizes + 11) % 128;
        this.coroutineBoundary = maVar4;
    }

    private static int Camera2StreamConfigurationMap() {
        int i = (getInputSizeshNQ4ISI + 119) % 128;
        getHighSpeedVideoSizes = i;
        int i2 = i + 115;
        getInputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            return 94;
        }
        throw null;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    protected final void m24831() {
        util.h.xy.ai.rb.ma maVar = this.isOutputSupportedFor;
        if (maVar != null) {
            try {
                maVar.dispose();
                this.isOutputSupportedFor = null;
                getHighSpeedVideoSizes = (getInputSizeshNQ4ISI + 63) % 128;
            } catch (java.lang.Throwable th) {
                this.isOutputSupportedFor = null;
                throw th;
            }
        }
        util.h.xy.ai.rb.ma maVar2 = this.getARTIFICIAL_FRAME_PACKAGE_NAME;
        if (maVar2 != null) {
            try {
                maVar2.dispose();
            } finally {
                this.getARTIFICIAL_FRAME_PACKAGE_NAME = null;
            }
        }
        util.h.xy.ai.rb.ma maVar3 = this.accessartificialFrame;
        if (maVar3 != null) {
            getHighSpeedVideoSizes = (getInputSizeshNQ4ISI + 25) % 128;
            try {
                maVar3.dispose();
            } finally {
                this.accessartificialFrame = null;
            }
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public final int m24832() throws java.io.IOException {
        if (this.isOutputSupportedForhNQ4ISI != null) {
            int i = getHighSpeedVideoSizes;
            getInputSizeshNQ4ISI = (i + 35) % 128;
            if (this.coroutineCreation != null) {
                int i2 = i + 49;
                int i3 = i2 % 128;
                getInputSizeshNQ4ISI = i3;
                if (i2 % 2 == 0) {
                    throw null;
                }
                if (this.getOutputSizeshNQ4ISI != null) {
                    getHighSpeedVideoSizes = (i3 + 101) % 128;
                    if (this.getOutputStallDuration != null && this.coroutineBoundary != null) {
                        int i4 = i3 + 67;
                        getHighSpeedVideoSizes = i4 % 128;
                        if (i4 % 2 != 0) {
                            throw null;
                        }
                        util.h.xy.ai.rb.ma maVar = this.isOutputSupportedFor;
                        if (maVar != null) {
                            try {
                                maVar.dispose();
                            } finally {
                                this.isOutputSupportedFor = null;
                            }
                        }
                        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE);
                        int i5 = getInputSizeshNQ4ISI + 109;
                        getHighSpeedVideoSizes = i5 % 128;
                        this.isOutputSupportedFor = new util.h.xy.ai.rb.ma(nativeSize + (i5 % 2 != 0 ? 72 : 117));
                        util.h.xy.ai.rb.ma maVar2 = this.getARTIFICIAL_FRAME_PACKAGE_NAME;
                        if (maVar2 != null) {
                            try {
                                maVar2.dispose();
                            } finally {
                                this.getARTIFICIAL_FRAME_PACKAGE_NAME = null;
                            }
                        }
                        util.h.xy.ai.rb.ma maVar3 = new util.h.xy.ai.rb.ma(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
                        this.getARTIFICIAL_FRAME_PACKAGE_NAME = maVar3;
                        long nativeValue = com.sun.jna.Pointer.nativeValue(this.isOutputSupportedFor);
                        Camera2StreamConfigurationMap();
                        maVar3.setPointer(0L, new com.sun.jna.Pointer(nativeValue + 94));
                        util.h.xy.ai.rb.ma maVar4 = this.accessartificialFrame;
                        if (maVar4 != null) {
                            int i6 = getInputSizeshNQ4ISI + 25;
                            getHighSpeedVideoSizes = i6 % 128;
                            try {
                                if (i6 % 2 != 0) {
                                    maVar4.dispose();
                                    throw null;
                                }
                                maVar4.dispose();
                                this.accessartificialFrame = null;
                                getHighSpeedVideoSizes = (getInputSizeshNQ4ISI + 93) % 128;
                            } finally {
                                this.accessartificialFrame = null;
                            }
                        }
                        long nativeValue2 = com.sun.jna.Pointer.nativeValue(this.getARTIFICIAL_FRAME_PACKAGE_NAME);
                        util.h.xy.ai.rb.ma maVar5 = new util.h.xy.ai.rb.ma(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
                        maVar5.setLong(0L, nativeValue2 ^ 1943052760);
                        int i7 = getHighSpeedVideoSizes + 11;
                        getInputSizeshNQ4ISI = i7 % 128;
                        if (i7 % 2 == 0) {
                            throw new java.lang.ArithmeticException();
                        }
                        this.accessartificialFrame = maVar5;
                        util.h.xy.ai.ri.getHighSpeedVideoFpsRanges._BAvwmAysqzVm1rYZ1PJ4ge(this.accessartificialFrame, this.isOutputSupportedForhNQ4ISI, this.coroutineCreation, this.getOutputSizeshNQ4ISI, this.getOutputStallDuration, this.coroutineBoundary);
                        int[] iArr = new int[1];
                        util.h.xy.ai.rb.ma maVar6 = this.isOutputSupportedFor;
                        Camera2StreamConfigurationMap();
                        maVar6.read(94L, iArr, 0, 1);
                        return iArr[0];
                    }
                }
            }
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(android.graphics.Color.rgb(0, 0, 0) + 16777343, "\u0084\u0083\u008f\u0091\u008e\u0085\u0083\u0098\u0099\u0096\u0084\u0089\u0081\u0085\u0094\u0099\u0091\u0084\u0087\u008f\u0087\u0088\u0086\u0089\u0098\u0085\u0083\u008f\u0089\u0084\u0089\u0081\u0087\u008f\u0087\u008b\u0085\u0088\u0088\u0087\u0085\u0088\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr);
        throw new java.io.IOException(((java.lang.String) objArr[0]).intern());
    }

    /* renamed from: ι, reason: contains not printable characters */
    public final void m24848() {
        getInputSizeshNQ4ISI = (getHighSpeedVideoSizes + 27) % 128;
        m24845();
        m24834();
        m24841();
        m24839();
        m24833();
        m24831();
        getHighSpeedVideoSizes = (getInputSizeshNQ4ISI + 61) % 128;
    }
}
