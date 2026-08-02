package util.h.xy.ai;

/* loaded from: classes18.dex */
public final class rl {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static long getHighSpeedVideoFpsRanges = 8247865933062040373L;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes = 1;
    private util.h.xy.ai.rl.a getOutputStallDurationlomOqCM = null;
    private util.h.xy.ai.rl.a getValidOutputFormatsForInputhNQ4ISI = null;
    private util.h.xy.ai.rl.a isOutputSupportedForhNQ4ISI = null;
    private int getOutputSizes = 0;
    private util.h.xy.ai.rl.a coroutineBoundary = null;
    private util.h.xy.ai.rl.a getInputSizeshNQ4ISI = null;
    private util.h.xy.ai.rl.a getInputFormats = null;
    private int _BOUNDARY = 0;
    private util.h.xy.ai.rl.a getOutputMinFrameDuration = null;
    private util.h.xy.ai.rl.a coroutineCreation = null;
    private util.h.xy.ai.rl.a getOutputStallDuration = null;
    private int getOutputSizeshNQ4ISI = 0;
    private util.h.xy.ai.rl.a getOutputMinFrameDurationlomOqCM = null;
    private util.h.xy.ai.rl.a getOutputFormats = null;
    private util.h.xy.ai.rl.a unwrapAs = null;
    private int getARTIFICIAL_FRAME_PACKAGE_NAME = 0;
    private util.h.xy.ai.rl.a ArtificialStackFrames = null;
    private util.h.xy.ai.rl.a _CREATION = null;
    private util.h.xy.ai.rl.a toString = null;
    private util.h.xy.ai.rl.a isOutputSupportedFor = null;
    private util.h.xy.ai.rl.a CoroutineDebuggingKt = null;
    private util.h.xy.ai.rl.a getHighSpeedVideoSizesFor = null;
    private util.h.xy.ai.rl.a b = null;
    private util.h.xy.ai.rl.a kernelVersion = null;
    private util.h.xy.ai.rl.a accessartificialFrame = null;

    /* renamed from: a, reason: collision with root package name */
    private util.h.xy.ai.rl.a f7076a = null;

    public interface ra extends com.sun.jna.Library {

        public interface mb extends com.sun.jna.Callback {
            void callback(int i, com.sun.jna.Pointer pointer, com.sun.jna.Pointer pointer2, int i2, com.sun.jna.Pointer pointer3);
        }
    }

    protected final void finalize() {
        int i = getHighSpeedVideoFpsRangesFor + 103;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 == 0) {
            m24905();
            int i2 = Camera2StreamConfigurationMap + 67;
            getHighSpeedVideoFpsRangesFor = i2 % 128;
            if (i2 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            return;
        }
        m24905();
        throw new java.lang.ArithmeticException();
    }

    final class a extends com.sun.jna.Memory {
        private static int getHighSpeedVideoFpsRanges = 1;
        private static int getHighSpeedVideoSizes;

        public a(long j) {
            super(j);
        }

        @Override // com.sun.jna.Memory
        public final void dispose() {
            int i = getHighSpeedVideoFpsRanges;
            int i2 = (i & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) + (i | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
            getHighSpeedVideoSizes = i2 % 128;
            if (i2 % 2 == 0) {
                super.dispose();
                int i3 = getHighSpeedVideoFpsRanges;
                int i4 = (i3 ^ 29) + ((i3 & 29) << 1);
                getHighSpeedVideoSizes = i4 % 128;
                if (i4 % 2 != 0) {
                    throw null;
                }
                return;
            }
            super.dispose();
            throw new java.lang.ArithmeticException();
        }
    }

    private static void getHighSpeedVideoSizes(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] charArray = str.toCharArray();
        util.h.xz.b.d dVar = new util.h.xz.b.d();
        dVar.f2628 = i;
        int length = charArray.length;
        long[] jArr = new long[length];
        dVar.f2629 = 0;
        while (dVar.f2629 < charArray.length) {
            getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 93) % 128;
            jArr[dVar.f2629] = (charArray[dVar.f2629] ^ (dVar.f2629 * dVar.f2628)) ^ (getHighSpeedVideoFpsRanges ^ (-7508379876853140581L));
            dVar.f2629++;
        }
        char[] cArr = new char[length];
        dVar.f2629 = 0;
        while (dVar.f2629 < charArray.length) {
            cArr[dVar.f2629] = (char) jArr[dVar.f2629];
            dVar.f2629++;
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 109) % 128;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    private static int getHighSpeedVideoSizes() {
        int i = Camera2StreamConfigurationMap + 73;
        int i2 = i % 128;
        getHighSpeedVideoFpsRangesFor = i2;
        int i3 = i % 2 == 0 ? 126 : 78;
        Camera2StreamConfigurationMap = (i2 + 125) % 128;
        return i3;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    protected final void m24906() {
        util.h.xy.ai.rl.a aVar = this.getOutputStallDurationlomOqCM;
        if (aVar != null) {
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 121) % 128;
            try {
                aVar.dispose();
            } finally {
                this.getOutputStallDurationlomOqCM = null;
            }
        }
        util.h.xy.ai.rl.a aVar2 = this.getValidOutputFormatsForInputhNQ4ISI;
        if (aVar2 != null) {
            getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 13) % 128;
            try {
                aVar2.dispose();
            } finally {
                this.getValidOutputFormatsForInputhNQ4ISI = null;
            }
        }
        util.h.xy.ai.rl.a aVar3 = this.isOutputSupportedForhNQ4ISI;
        if (aVar3 != null) {
            try {
                aVar3.dispose();
                this.isOutputSupportedForhNQ4ISI = null;
                getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 79) % 128;
            } catch (java.lang.Throwable th) {
                this.isOutputSupportedForhNQ4ISI = null;
                throw th;
            }
        }
        int i = getHighSpeedVideoFpsRangesFor + 113;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m24910() {
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 97) % 128;
        util.h.xy.ai.rl.a aVar = this.getOutputStallDurationlomOqCM;
        if (aVar != null) {
            try {
                aVar.dispose();
            } finally {
                this.getOutputStallDurationlomOqCM = null;
            }
        }
        int i = com.sun.jna.Native.POINTER_SIZE;
        getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 61) % 128;
        this.getOutputStallDurationlomOqCM = new util.h.xy.ai.rl.a(i + 117);
        util.h.xy.ai.rl.a aVar2 = this.getValidOutputFormatsForInputhNQ4ISI;
        if (aVar2 != null) {
            int i2 = getHighSpeedVideoFpsRangesFor + 99;
            Camera2StreamConfigurationMap = i2 % 128;
            try {
                if (i2 % 2 == 0) {
                    aVar2.dispose();
                } else {
                    aVar2.dispose();
                    throw null;
                }
            } finally {
                this.getValidOutputFormatsForInputhNQ4ISI = null;
            }
        }
        util.h.xy.ai.rl.a aVar3 = new util.h.xy.ai.rl.a(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        this.getValidOutputFormatsForInputhNQ4ISI = aVar3;
        aVar3.setPointer(0L, new com.sun.jna.Pointer(com.sun.jna.Pointer.nativeValue(this.getOutputStallDurationlomOqCM) + getHighSpeedVideoSizes()));
        util.h.xy.ai.rl.a aVar4 = this.isOutputSupportedForhNQ4ISI;
        if (aVar4 != null) {
            try {
                aVar4.dispose();
            } finally {
                this.isOutputSupportedForhNQ4ISI = null;
            }
        }
        long nativeValue = com.sun.jna.Pointer.nativeValue(this.getValidOutputFormatsForInputhNQ4ISI);
        util.h.xy.ai.rl.a aVar5 = new util.h.xy.ai.rl.a(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        aVar5.setLong(0L, nativeValue ^ 509380577);
        int i3 = Camera2StreamConfigurationMap + 49;
        getHighSpeedVideoFpsRangesFor = i3 % 128;
        if (i3 % 2 != 0) {
            this.isOutputSupportedForhNQ4ISI = aVar5;
            return;
        }
        throw null;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final com.sun.jna.Pointer m24897() {
        getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 107) % 128;
        if (this.getOutputStallDurationlomOqCM == null) {
            m24910();
        }
        com.sun.jna.Pointer pointer = this.getOutputStallDurationlomOqCM.getPointer(getHighSpeedVideoSizes());
        int i = Camera2StreamConfigurationMap + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 != 0) {
            return pointer;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    protected final void m24902() {
        int i = getHighSpeedVideoFpsRangesFor + 109;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 == 0) {
            util.h.xy.ai.rl.a aVar = this.coroutineBoundary;
            if (aVar != null) {
                try {
                    aVar.dispose();
                } finally {
                    this.coroutineBoundary = null;
                }
            }
            util.h.xy.ai.rl.a aVar2 = this.getInputSizeshNQ4ISI;
            if (aVar2 != null) {
                int i2 = getHighSpeedVideoFpsRangesFor + 77;
                Camera2StreamConfigurationMap = i2 % 128;
                try {
                    if (i2 % 2 == 0) {
                        aVar2.dispose();
                    } else {
                        aVar2.dispose();
                        throw null;
                    }
                } finally {
                    this.getInputSizeshNQ4ISI = null;
                }
            }
            util.h.xy.ai.rl.a aVar3 = this.getInputFormats;
            if (aVar3 != null) {
                try {
                    aVar3.dispose();
                    return;
                } finally {
                    this.getInputFormats = null;
                }
            }
            return;
        }
        throw null;
    }

    private util.h.xy.ai.rl.a getHighSpeedVideoFpsRangesFor(long j) {
        util.h.xy.ai.rl.a aVar = new util.h.xy.ai.rl.a(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        byte[] bArr = new byte[com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)];
        int i = 0;
        for (int i2 = 0; i2 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i2++) {
            int i3 = i2 * 8;
            bArr[i2] = (byte) (((255 << i3) & j) >> i3);
        }
        getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 17) % 128;
        int i4 = 2111212283;
        for (int i5 = 0; i5 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i5++) {
            getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 83) % 128;
            byte b = bArr[i5];
            bArr[i5] = (byte) (((byte) (i4 & 255)) ^ b);
            i4 = ((i4 << (i5 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))) | (i4 >>> (((com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8) - 1) - (i5 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))))) * (~(b & 255));
        }
        long j2 = 0;
        while (i < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)) {
            int i6 = getHighSpeedVideoFpsRangesFor + 89;
            Camera2StreamConfigurationMap = i6 % 128;
            if (i6 % 2 != 0) {
                j2 ^= (bArr[i] & 30248) >> (i - 65);
                i += 61;
            } else {
                j2 |= (bArr[i] & 255) << (i * 8);
                i++;
            }
        }
        aVar.setLong(0L, j2);
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 79) % 128;
        return aVar;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m24907(int i) {
        this.getOutputSizes = i;
        util.h.xy.ai.rl.a aVar = this.coroutineBoundary;
        if (aVar != null) {
            getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 47) % 128;
            try {
                aVar.dispose();
            } finally {
                this.coroutineBoundary = null;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE) * i;
        int i2 = (Camera2StreamConfigurationMap + 89) % 128;
        getHighSpeedVideoFpsRangesFor = i2;
        Camera2StreamConfigurationMap = (i2 + 67) % 128;
        this.coroutineBoundary = new util.h.xy.ai.rl.a(nativeSize + 143);
        util.h.xy.ai.rl.a aVar2 = this.getInputSizeshNQ4ISI;
        if (aVar2 != null) {
            getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 73) % 128;
            try {
                aVar2.dispose();
            } finally {
                this.getInputSizeshNQ4ISI = null;
            }
        }
        util.h.xy.ai.rl.a aVar3 = new util.h.xy.ai.rl.a(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        this.getInputSizeshNQ4ISI = aVar3;
        long nativeValue = com.sun.jna.Pointer.nativeValue(this.coroutineBoundary);
        int i3 = getHighSpeedVideoFpsRangesFor;
        Camera2StreamConfigurationMap = (i3 + 75) % 128;
        int i4 = i3 + 21;
        Camera2StreamConfigurationMap = i4 % 128;
        if (i4 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        aVar3.setPointer(0L, new com.sun.jna.Pointer(nativeValue + 100));
        util.h.xy.ai.rl.a aVar4 = this.getInputFormats;
        if (aVar4 != null) {
            int i5 = Camera2StreamConfigurationMap + 47;
            getHighSpeedVideoFpsRangesFor = i5 % 128;
            try {
                if (i5 % 2 == 0) {
                    aVar4.dispose();
                    throw null;
                }
                aVar4.dispose();
            } finally {
                this.getInputFormats = null;
            }
        }
        this.getInputFormats = getHighSpeedVideoFpsRangesFor(com.sun.jna.Pointer.nativeValue(this.getInputSizeshNQ4ISI));
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m24913(com.sun.jna.Pointer pointer) {
        getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 109) % 128;
        m24907(com.sun.jna.Native.POINTER_SIZE);
        this.getInputSizeshNQ4ISI.setPointer(0L, pointer);
        int i = Camera2StreamConfigurationMap + 85;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    private static int getHighResolutionOutputSizeshNQ4ISI() {
        int i = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRangesFor = (i + 69) % 128;
        int i2 = i + 43;
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 != 0) {
            return 66;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    protected final void m24917() {
        util.h.xy.ai.rl.a aVar = this.getOutputMinFrameDuration;
        if (aVar != null) {
            try {
                aVar.dispose();
                this.getOutputMinFrameDuration = null;
                Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 89) % 128;
            } catch (java.lang.Throwable th) {
                this.getOutputMinFrameDuration = null;
                throw th;
            }
        }
        util.h.xy.ai.rl.a aVar2 = this.coroutineCreation;
        if (aVar2 != null) {
            getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 125) % 128;
            try {
                aVar2.dispose();
            } finally {
                this.coroutineCreation = null;
            }
        }
        util.h.xy.ai.rl.a aVar3 = this.getOutputStallDuration;
        if (aVar3 != null) {
            try {
                aVar3.dispose();
            } finally {
                this.getOutputStallDuration = null;
            }
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m24898(int i) {
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 63) % 128;
        this._BOUNDARY = i;
        util.h.xy.ai.rl.a aVar = this.getOutputMinFrameDuration;
        if (aVar != null) {
            try {
                aVar.dispose();
            } finally {
                this.getOutputMinFrameDuration = null;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE) * i;
        int i2 = getHighSpeedVideoFpsRangesFor;
        int i3 = i2 + 47;
        Camera2StreamConfigurationMap = i3 % 128;
        int i4 = i3 % 2 != 0 ? 6 : 109;
        Camera2StreamConfigurationMap = (i2 + 31) % 128;
        this.getOutputMinFrameDuration = new util.h.xy.ai.rl.a(nativeSize + i4);
        util.h.xy.ai.rl.a aVar2 = this.coroutineCreation;
        if (aVar2 != null) {
            try {
                aVar2.dispose();
            } finally {
                this.coroutineCreation = null;
            }
        }
        util.h.xy.ai.rl.a aVar3 = new util.h.xy.ai.rl.a(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        this.coroutineCreation = aVar3;
        long nativeValue = com.sun.jna.Pointer.nativeValue(this.getOutputMinFrameDuration);
        getHighResolutionOutputSizeshNQ4ISI();
        aVar3.setPointer(0L, new com.sun.jna.Pointer(nativeValue + 66));
        util.h.xy.ai.rl.a aVar4 = this.getOutputStallDuration;
        if (aVar4 != null) {
            int i5 = getHighSpeedVideoFpsRangesFor + 119;
            Camera2StreamConfigurationMap = i5 % 128;
            try {
                if (i5 % 2 == 0) {
                    aVar4.dispose();
                } else {
                    aVar4.dispose();
                    this.getOutputStallDuration = null;
                    throw new java.lang.ArithmeticException();
                }
            } finally {
                this.getOutputStallDuration = null;
            }
        }
        long nativeValue2 = com.sun.jna.Pointer.nativeValue(this.coroutineCreation);
        util.h.xy.ai.rl.a aVar5 = new util.h.xy.ai.rl.a(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        aVar5.setLong(0L, nativeValue2 ^ 1814338827);
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 23) % 128;
        this.getOutputStallDuration = aVar5;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m24914(java.lang.String str) throws java.io.IOException {
        int i = getHighSpeedVideoFpsRangesFor + 55;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 == 0) {
            m24901(str, java.nio.charset.Charset.defaultCharset());
            getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 97) % 128;
        } else {
            m24901(str, java.nio.charset.Charset.defaultCharset());
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    protected final void m24901(java.lang.String str, java.nio.charset.Charset charset) throws java.io.IOException {
        int i = getHighSpeedVideoFpsRangesFor + 95;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 != 0) {
            byte[] bytes = str.getBytes(charset);
            m24898(bytes.length);
            util.h.xy.ai.rl.a aVar = this.getOutputMinFrameDuration;
            getHighResolutionOutputSizeshNQ4ISI();
            aVar.write(66L, bytes, 1, bytes.length);
            this.getOutputMinFrameDuration.setByte(bytes.length << getHighResolutionOutputSizeshNQ4ISI(), (byte) 1);
        } else {
            byte[] bytes2 = str.getBytes(charset);
            m24898(bytes2.length + 1);
            util.h.xy.ai.rl.a aVar2 = this.getOutputMinFrameDuration;
            getHighResolutionOutputSizeshNQ4ISI();
            aVar2.write(66L, bytes2, 0, bytes2.length);
            this.getOutputMinFrameDuration.setByte(bytes2.length + getHighResolutionOutputSizeshNQ4ISI(), (byte) 0);
        }
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 9) % 128;
    }

    private static int Camera2StreamConfigurationMap() {
        int i = Camera2StreamConfigurationMap;
        int i2 = i + 79;
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        int i3 = i2 % 2 == 0 ? 117 : 74;
        getHighSpeedVideoFpsRangesFor = (i + 21) % 128;
        return i3;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    protected final void m24894() {
        int i = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRangesFor = (i + 37) % 128;
        util.h.xy.ai.rl.a aVar = this.getOutputMinFrameDurationlomOqCM;
        if (aVar != null) {
            getHighSpeedVideoFpsRangesFor = (i + 83) % 128;
            try {
                aVar.dispose();
            } finally {
                this.getOutputMinFrameDurationlomOqCM = null;
            }
        }
        util.h.xy.ai.rl.a aVar2 = this.getOutputFormats;
        if (aVar2 != null) {
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 27) % 128;
            try {
                aVar2.dispose();
            } finally {
                this.getOutputFormats = null;
            }
        }
        util.h.xy.ai.rl.a aVar3 = this.unwrapAs;
        if (aVar3 != null) {
            try {
                aVar3.dispose();
            } finally {
                this.unwrapAs = null;
            }
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m24911(int i) {
        this.getOutputSizeshNQ4ISI = i;
        util.h.xy.ai.rl.a aVar = this.getOutputMinFrameDurationlomOqCM;
        if (aVar != null) {
            try {
                aVar.dispose();
            } finally {
                this.getOutputMinFrameDurationlomOqCM = null;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE) * i;
        int i2 = getHighSpeedVideoFpsRangesFor + 75;
        int i3 = i2 % 128;
        Camera2StreamConfigurationMap = i3;
        int i4 = i2 % 2 != 0 ? 48 : 113;
        int i5 = i3 + 93;
        getHighSpeedVideoFpsRangesFor = i5 % 128;
        if (i5 % 2 != 0) {
            this.getOutputMinFrameDurationlomOqCM = new util.h.xy.ai.rl.a(nativeSize + i4);
            util.h.xy.ai.rl.a aVar2 = this.getOutputFormats;
            if (aVar2 != null) {
                try {
                    aVar2.dispose();
                } finally {
                    this.getOutputFormats = null;
                }
            }
            util.h.xy.ai.rl.a aVar3 = new util.h.xy.ai.rl.a(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
            this.getOutputFormats = aVar3;
            aVar3.setPointer(0L, new com.sun.jna.Pointer(com.sun.jna.Pointer.nativeValue(this.getOutputMinFrameDurationlomOqCM) + Camera2StreamConfigurationMap()));
            util.h.xy.ai.rl.a aVar4 = this.unwrapAs;
            if (aVar4 != null) {
                int i6 = getHighSpeedVideoFpsRangesFor + 69;
                Camera2StreamConfigurationMap = i6 % 128;
                try {
                    if (i6 % 2 == 0) {
                        aVar4.dispose();
                    } else {
                        aVar4.dispose();
                        throw null;
                    }
                } finally {
                    this.unwrapAs = null;
                }
            }
            long nativeValue = com.sun.jna.Pointer.nativeValue(this.getOutputFormats);
            util.h.xy.ai.rl.a aVar5 = new util.h.xy.ai.rl.a(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
            aVar5.setLong(0L, nativeValue ^ 1093194709);
            int i7 = Camera2StreamConfigurationMap + 105;
            int i8 = i7 % 128;
            getHighSpeedVideoFpsRangesFor = i8;
            if (i7 % 2 != 0) {
                this.unwrapAs = aVar5;
                Camera2StreamConfigurationMap = (i8 + 69) % 128;
                return;
            }
            throw new java.lang.ArithmeticException();
        }
        throw null;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m24904(java.lang.String str) throws java.io.IOException {
        int i = Camera2StreamConfigurationMap + 17;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 != 0) {
            m24915(str, java.nio.charset.Charset.defaultCharset());
            int i2 = Camera2StreamConfigurationMap + 121;
            getHighSpeedVideoFpsRangesFor = i2 % 128;
            if (i2 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            return;
        }
        m24915(str, java.nio.charset.Charset.defaultCharset());
        throw null;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    protected final void m24915(java.lang.String str, java.nio.charset.Charset charset) throws java.io.IOException {
        int i = getHighSpeedVideoFpsRangesFor + 55;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 != 0) {
            byte[] bytes = str.getBytes(charset);
            m24911(bytes.length - 1);
            this.getOutputMinFrameDurationlomOqCM.write(1 >>> Camera2StreamConfigurationMap(), bytes, 0, bytes.length);
            this.getOutputMinFrameDurationlomOqCM.setByte(bytes.length * Camera2StreamConfigurationMap(), (byte) 1);
            return;
        }
        byte[] bytes2 = str.getBytes(charset);
        m24911(bytes2.length + 1);
        this.getOutputMinFrameDurationlomOqCM.write(Camera2StreamConfigurationMap(), bytes2, 0, bytes2.length);
        this.getOutputMinFrameDurationlomOqCM.setByte(bytes2.length + Camera2StreamConfigurationMap(), (byte) 0);
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m24899(com.sun.jna.Pointer pointer) {
        util.h.xy.ai.rl.a aVar;
        long j;
        int i = Camera2StreamConfigurationMap + 43;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 == 0) {
            m24911(com.sun.jna.Native.POINTER_SIZE);
            aVar = this.getOutputFormats;
            j = 1;
        } else {
            m24911(com.sun.jna.Native.POINTER_SIZE);
            aVar = this.getOutputFormats;
            j = 0;
        }
        aVar.setPointer(j, pointer);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    protected final void m24895() {
        int i = getHighSpeedVideoFpsRangesFor + 39;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
        util.h.xy.ai.rl.a aVar = this.ArtificialStackFrames;
        if (aVar != null) {
            try {
                aVar.dispose();
            } finally {
                this.ArtificialStackFrames = null;
            }
        }
        util.h.xy.ai.rl.a aVar2 = this._CREATION;
        if (aVar2 != null) {
            try {
                aVar2.dispose();
                this._CREATION = null;
                Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 115) % 128;
            } catch (java.lang.Throwable th) {
                this._CREATION = null;
                throw th;
            }
        }
        util.h.xy.ai.rl.a aVar3 = this.toString;
        if (aVar3 != null) {
            int i2 = Camera2StreamConfigurationMap + 3;
            getHighSpeedVideoFpsRangesFor = i2 % 128;
            try {
                if (i2 % 2 != 0) {
                    aVar3.dispose();
                } else {
                    aVar3.dispose();
                    throw null;
                }
            } finally {
                this.toString = null;
            }
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m24918(int i) {
        this.getARTIFICIAL_FRAME_PACKAGE_NAME = i;
        util.h.xy.ai.rl.a aVar = this.ArtificialStackFrames;
        if (aVar != null) {
            int i2 = Camera2StreamConfigurationMap + 27;
            getHighSpeedVideoFpsRangesFor = i2 % 128;
            try {
                if (i2 % 2 == 0) {
                    aVar.dispose();
                    throw null;
                }
                aVar.dispose();
            } finally {
                this.ArtificialStackFrames = null;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE) * i;
        int i3 = (getHighSpeedVideoFpsRangesFor + 33) % 128;
        Camera2StreamConfigurationMap = i3;
        getHighSpeedVideoFpsRangesFor = (i3 + 121) % 128;
        this.ArtificialStackFrames = new util.h.xy.ai.rl.a(nativeSize + 119);
        util.h.xy.ai.rl.a aVar2 = this._CREATION;
        if (aVar2 != null) {
            getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 23) % 128;
            try {
                aVar2.dispose();
            } finally {
                this._CREATION = null;
            }
        }
        util.h.xy.ai.rl.a aVar3 = new util.h.xy.ai.rl.a(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        this._CREATION = aVar3;
        long nativeValue = com.sun.jna.Pointer.nativeValue(this.ArtificialStackFrames);
        int i4 = Camera2StreamConfigurationMap + 51;
        getHighSpeedVideoFpsRangesFor = i4 % 128;
        aVar3.setPointer(0L, new com.sun.jna.Pointer(nativeValue + (i4 % 2 == 0 ? com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE : 80)));
        util.h.xy.ai.rl.a aVar4 = this.toString;
        if (aVar4 != null) {
            try {
                aVar4.dispose();
            } finally {
                this.toString = null;
            }
        }
        long nativeValue2 = com.sun.jna.Pointer.nativeValue(this._CREATION);
        util.h.xy.ai.rl.a aVar5 = new util.h.xy.ai.rl.a(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        byte[] bArr = new byte[com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)];
        int i5 = 0;
        while (i5 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)) {
            int i6 = i5 * 8;
            bArr[i5] = (byte) (((255 << i6) & nativeValue2) >> i6);
            i5++;
            getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 73) % 128;
        }
        int i7 = 796321253;
        int i8 = 0;
        while (i8 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)) {
            byte b = bArr[i8];
            bArr[i8] = (byte) (((byte) (i7 & 255)) ^ b);
            i7 = ((i7 << (i8 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))) | (i7 >>> (((com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8) - 1) - (i8 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))))) * (~(b & 255));
            i8++;
            int i9 = getHighSpeedVideoFpsRangesFor + 115;
            Camera2StreamConfigurationMap = i9 % 128;
            int i10 = i9 % 2;
        }
        long j = 0;
        for (int i11 = 0; i11 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i11++) {
            j |= (bArr[i11] & 255) << (i11 * 8);
        }
        aVar5.setLong(0L, j);
        int i12 = getHighSpeedVideoFpsRangesFor;
        int i13 = i12 + 21;
        Camera2StreamConfigurationMap = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
        this.toString = aVar5;
        Camera2StreamConfigurationMap = (i12 + 91) % 128;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m24900(java.lang.String str) throws java.io.IOException {
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 113) % 128;
        m24909(str, java.nio.charset.Charset.defaultCharset());
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 103) % 128;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    protected final void m24909(java.lang.String str, java.nio.charset.Charset charset) throws java.io.IOException {
        util.h.xy.ai.rl.a aVar;
        int length;
        int i = getHighSpeedVideoFpsRangesFor + 1;
        Camera2StreamConfigurationMap = i % 128;
        int i2 = i % 2;
        int i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE;
        if (i2 != 0) {
            byte[] bytes = str.getBytes(charset);
            m24918(bytes.length);
            util.h.xy.ai.rl.a aVar2 = this.ArtificialStackFrames;
            int i4 = Camera2StreamConfigurationMap + 51;
            getHighSpeedVideoFpsRangesFor = i4 % 128;
            int i5 = i4 % 2;
            aVar2.write(0L, bytes, 1, bytes.length);
            aVar = this.ArtificialStackFrames;
            length = bytes.length;
        } else {
            byte[] bytes2 = str.getBytes(charset);
            m24918(bytes2.length + 1);
            util.h.xy.ai.rl.a aVar3 = this.ArtificialStackFrames;
            int i6 = Camera2StreamConfigurationMap + 51;
            getHighSpeedVideoFpsRangesFor = i6 % 128;
            aVar3.write(i6 % 2 == 0 ? 124 : 80, bytes2, 0, bytes2.length);
            aVar = this.ArtificialStackFrames;
            length = bytes2.length;
        }
        int i7 = Camera2StreamConfigurationMap + 51;
        getHighSpeedVideoFpsRangesFor = i7 % 128;
        if (i7 % 2 != 0) {
            i3 = 80;
        }
        aVar.setByte(length + i3, (byte) 0);
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m24908(com.sun.jna.Pointer pointer) {
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 121) % 128;
        m24918(com.sun.jna.Native.POINTER_SIZE);
        this._CREATION.setPointer(0L, pointer);
        getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
    }

    /* renamed from: ͺ, reason: contains not printable characters */
    protected final void m24916() {
        int i = getHighSpeedVideoFpsRangesFor;
        Camera2StreamConfigurationMap = (i + 93) % 128;
        util.h.xy.ai.rl.a aVar = this.isOutputSupportedFor;
        if (aVar != null) {
            int i2 = i + 109;
            Camera2StreamConfigurationMap = i2 % 128;
            try {
                if (i2 % 2 == 0) {
                    aVar.dispose();
                } else {
                    aVar.dispose();
                    throw null;
                }
            } finally {
                this.isOutputSupportedFor = null;
            }
        }
        util.h.xy.ai.rl.a aVar2 = this.CoroutineDebuggingKt;
        if (aVar2 != null) {
            try {
                aVar2.dispose();
            } finally {
                this.CoroutineDebuggingKt = null;
            }
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m24903(int i) {
        int i2 = getHighSpeedVideoFpsRangesFor + 35;
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        util.h.xy.ai.rl.a aVar = this.isOutputSupportedFor;
        if (aVar != null) {
            try {
                aVar.dispose();
            } finally {
                this.isOutputSupportedFor = null;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE);
        int i3 = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRangesFor = (i3 + 89) % 128;
        int i4 = i3 + 75;
        getHighSpeedVideoFpsRangesFor = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        util.h.xy.ai.rl.a aVar2 = new util.h.xy.ai.rl.a(nativeSize + 143);
        this.isOutputSupportedFor = aVar2;
        int i5 = getHighSpeedVideoFpsRangesFor;
        Camera2StreamConfigurationMap = (i5 + 1) % 128;
        Camera2StreamConfigurationMap = (i5 + 81) % 128;
        aVar2.setInt(102L, i);
        util.h.xy.ai.rl.a aVar3 = this.CoroutineDebuggingKt;
        if (aVar3 != null) {
            int i6 = getHighSpeedVideoFpsRangesFor + 45;
            Camera2StreamConfigurationMap = i6 % 128;
            try {
                if (i6 % 2 != 0) {
                    aVar3.dispose();
                    throw null;
                }
                aVar3.dispose();
            } finally {
                this.CoroutineDebuggingKt = null;
            }
        }
        long nativeValue = com.sun.jna.Pointer.nativeValue(this.isOutputSupportedFor);
        int i7 = getHighSpeedVideoFpsRangesFor;
        Camera2StreamConfigurationMap = (i7 + 1) % 128;
        Camera2StreamConfigurationMap = (i7 + 81) % 128;
        util.h.xy.ai.rl.a aVar4 = new util.h.xy.ai.rl.a(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        aVar4.setLong(0L, (nativeValue + 102) ^ 250669312);
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 83) % 128;
        this.CoroutineDebuggingKt = aVar4;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    protected final void m24893() {
        util.h.xy.ai.rl.a aVar = this.getHighSpeedVideoSizesFor;
        if (aVar != null) {
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 65) % 128;
            try {
                aVar.dispose();
                this.getHighSpeedVideoSizesFor = null;
                getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
            } catch (java.lang.Throwable th) {
                this.getHighSpeedVideoSizesFor = null;
                throw th;
            }
        }
        util.h.xy.ai.rl.a aVar2 = this.b;
        if (aVar2 != null) {
            try {
                aVar2.dispose();
            } finally {
                this.b = null;
            }
        }
        getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 93) % 128;
    }

    private util.h.xy.ai.rl.a getHighSpeedVideoSizes(long j) {
        util.h.xy.ai.rl.a aVar = new util.h.xy.ai.rl.a(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        byte[] bArr = new byte[com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)];
        int i = 0;
        while (i < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)) {
            int i2 = getHighSpeedVideoFpsRangesFor + 53;
            Camera2StreamConfigurationMap = i2 % 128;
            if (i2 % 2 != 0) {
                bArr[i] = (byte) (((255 >>> (i * 18)) * j) >>> (i - 121));
                i += 51;
            } else {
                int i3 = i * 8;
                bArr[i] = (byte) (((255 << i3) & j) >> i3);
                i++;
            }
        }
        int i4 = 2101279503;
        for (int i5 = 0; i5 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i5++) {
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 105) % 128;
            byte b = bArr[i5];
            bArr[i5] = (byte) (((byte) (i4 & 255)) ^ b);
            i4 = ((i4 << (i5 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))) | (i4 >>> (((com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8) - 1) - (i5 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))))) * (~(b & 255));
        }
        long j2 = 0;
        for (int i6 = 0; i6 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i6++) {
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 3) % 128;
            j2 |= (bArr[i6] & 255) << (i6 * 8);
        }
        aVar.setLong(0L, j2);
        return aVar;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m24912(com.sun.jna.Callback callback) {
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 43) % 128;
        util.h.xy.ai.rl.a aVar = this.getHighSpeedVideoSizesFor;
        if (aVar != null) {
            try {
                aVar.dispose();
            } finally {
                this.getHighSpeedVideoSizesFor = null;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE);
        int i = (getHighSpeedVideoFpsRangesFor + 85) % 128;
        Camera2StreamConfigurationMap = i;
        int i2 = i + 99;
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 != 0) {
            util.h.xy.ai.rl.a aVar2 = new util.h.xy.ai.rl.a(nativeSize + 111);
            this.getHighSpeedVideoSizesFor = aVar2;
            int i3 = getHighSpeedVideoFpsRangesFor + 13;
            Camera2StreamConfigurationMap = i3 % 128;
            aVar2.setPointer(i3 % 2 != 0 ? 54 : 68, com.sun.jna.CallbackReference.getFunctionPointer(callback));
            util.h.xy.ai.rl.a aVar3 = this.b;
            if (aVar3 != null) {
                int i4 = Camera2StreamConfigurationMap + 19;
                getHighSpeedVideoFpsRangesFor = i4 % 128;
                try {
                    if (i4 % 2 == 0) {
                        aVar3.dispose();
                        throw null;
                    }
                    aVar3.dispose();
                    this.b = null;
                    getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 41) % 128;
                } finally {
                    this.b = null;
                }
            }
            long nativeValue = com.sun.jna.Pointer.nativeValue(this.getHighSpeedVideoSizesFor);
            int i5 = getHighSpeedVideoFpsRangesFor + 13;
            Camera2StreamConfigurationMap = i5 % 128;
            this.b = getHighSpeedVideoSizes(nativeValue + (i5 % 2 == 0 ? 68 : 54));
            return;
        }
        throw null;
    }

    private static int getHighSpeedVideoFpsRanges() {
        int i = Camera2StreamConfigurationMap + 1;
        int i2 = i % 128;
        getHighSpeedVideoFpsRangesFor = i2;
        int i3 = i % 2 != 0 ? 102 : 1;
        Camera2StreamConfigurationMap = (i2 + 21) % 128;
        return i3;
    }

    /* renamed from: ι, reason: contains not printable characters */
    protected final void m24919() {
        getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 71) % 128;
        util.h.xy.ai.rl.a aVar = this.kernelVersion;
        if (aVar != null) {
            try {
                aVar.dispose();
                this.kernelVersion = null;
                int i = Camera2StreamConfigurationMap + 113;
                getHighSpeedVideoFpsRangesFor = i % 128;
                if (i % 2 == 0) {
                    int i2 = 5 / 2;
                }
            } catch (java.lang.Throwable th) {
                this.kernelVersion = null;
                throw th;
            }
        }
        util.h.xy.ai.rl.a aVar2 = this.accessartificialFrame;
        if (aVar2 != null) {
            int i3 = Camera2StreamConfigurationMap + 17;
            getHighSpeedVideoFpsRangesFor = i3 % 128;
            try {
                if (i3 % 2 == 0) {
                    aVar2.dispose();
                    throw null;
                }
                aVar2.dispose();
            } finally {
                this.accessartificialFrame = null;
            }
        }
        util.h.xy.ai.rl.a aVar3 = this.f7076a;
        if (aVar3 != null) {
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 19) % 128;
            try {
                aVar3.dispose();
            } finally {
                this.f7076a = null;
            }
        }
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public final int m24896() throws java.io.IOException {
        if (this.isOutputSupportedForhNQ4ISI != null && this.getInputFormats != null && this.getOutputStallDuration != null && this.unwrapAs != null && this.toString != null && this.CoroutineDebuggingKt != null) {
            int i = getHighSpeedVideoFpsRangesFor;
            int i2 = i + 23;
            Camera2StreamConfigurationMap = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            if (this.b != null) {
                util.h.xy.ai.rl.a aVar = this.kernelVersion;
                if (aVar != null) {
                    int i3 = i + 125;
                    Camera2StreamConfigurationMap = i3 % 128;
                    try {
                        if (i3 % 2 != 0) {
                            aVar.dispose();
                            throw null;
                        }
                        aVar.dispose();
                    } finally {
                        this.kernelVersion = null;
                    }
                }
                int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE);
                int i4 = Camera2StreamConfigurationMap + 7;
                getHighSpeedVideoFpsRangesFor = i4 % 128;
                this.kernelVersion = new util.h.xy.ai.rl.a(nativeSize + (i4 % 2 == 0 ? 10165 : 149));
                util.h.xy.ai.rl.a aVar2 = this.accessartificialFrame;
                if (aVar2 != null) {
                    try {
                        aVar2.dispose();
                        this.accessartificialFrame = null;
                        getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 41) % 128;
                    } catch (java.lang.Throwable th) {
                        this.accessartificialFrame = null;
                        throw th;
                    }
                }
                util.h.xy.ai.rl.a aVar3 = new util.h.xy.ai.rl.a(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
                this.accessartificialFrame = aVar3;
                aVar3.setPointer(0L, new com.sun.jna.Pointer(com.sun.jna.Pointer.nativeValue(this.kernelVersion) + getHighSpeedVideoFpsRanges()));
                util.h.xy.ai.rl.a aVar4 = this.f7076a;
                if (aVar4 != null) {
                    getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 21) % 128;
                    try {
                        aVar4.dispose();
                    } finally {
                        this.f7076a = null;
                    }
                }
                long nativeValue = com.sun.jna.Pointer.nativeValue(this.accessartificialFrame);
                util.h.xy.ai.rl.a aVar5 = new util.h.xy.ai.rl.a(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
                byte[] bArr = new byte[com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)];
                for (int i5 = 0; i5 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i5++) {
                    int i6 = i5 * 8;
                    bArr[i5] = (byte) (((255 << i6) & nativeValue) >> i6);
                }
                int i7 = 806254033;
                for (int i8 = 0; i8 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i8++) {
                    getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 23) % 128;
                    byte b = bArr[i8];
                    bArr[i8] = (byte) (((byte) (i7 & 255)) ^ b);
                    i7 = ((i7 << (i8 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))) | (i7 >>> (((com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8) - 1) - (i8 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))))) * (~(b & 255));
                }
                getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 95) % 128;
                int i9 = 0;
                long j = 0;
                while (i9 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)) {
                    j |= (bArr[i9] & 255) << (i9 * 8);
                    i9++;
                    Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 33) % 128;
                }
                aVar5.setLong(0L, j);
                this.f7076a = aVar5;
                util.h.xy.ai.me.getHighSpeedVideoFpsRanges._LwnbKq4C3Hfia7jCEY9EyNdtScmMgpsrj(this.f7076a, this.isOutputSupportedForhNQ4ISI, this.getInputFormats, this.getOutputStallDuration, this.unwrapAs, this.toString, this.CoroutineDebuggingKt, this.b);
                int[] iArr = new int[1];
                this.kernelVersion.read(getHighSpeedVideoFpsRanges(), iArr, 0, 1);
                return iArr[0];
            }
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoSizes("壃ꔰꌋꄛ꼢굚ꭍꦯ랚뗍돡뇛뿆뱡먄렊虬葔艅肺躆貌諮裀隆錹鄕鼄鵶魐饖\ue7ba\ue5ba\ue38c\ue1f7\uefe1\ued82\uea34\ue829\uf617\uf47e\uf262\uf044ﺤﳪ慎\uf8fd웹쓍섡", (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 65003, objArr);
        throw new java.io.IOException(((java.lang.String) objArr[0]).intern());
    }

    /* renamed from: ˌ, reason: contains not printable characters */
    public final void m24905() {
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 3) % 128;
        m24906();
        m24902();
        m24917();
        m24894();
        m24895();
        m24916();
        m24893();
        m24919();
        getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 91) % 128;
    }
}
