package util.h.xy.ai;

/* loaded from: classes18.dex */
public final class mo {
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static int getOutputMinFrameDuration = 1;
    private static char[] getInputSizeshNQ4ISI = {64120, 64096, 64102, 64097, 64181, 64118, 64116, 64121, 64101, 64103, 64112, 64113, 64124, 64122, 64123, 64125, 64115};
    private static int getHighSpeedVideoSizes = -1074857259;
    private static boolean Camera2StreamConfigurationMap = true;
    private static boolean getHighSpeedVideoSizesFor = true;
    private int isOutputSupportedFor = 0;
    private util.h.xy.ai.mo.mb CoroutineDebuggingKt = null;
    private util.h.xy.ai.mo.mb toString = null;
    private util.h.xy.ai.mo.mb ArtificialStackFrames = null;
    private int b = 0;
    private util.h.xy.ai.mo.mb getOutputStallDurationlomOqCM = null;
    private util.h.xy.ai.mo.mb getOutputFormats = null;
    private util.h.xy.ai.mo.mb init = null;
    private int coroutineBoundary = 0;
    private util.h.xy.ai.mo.mb getOutputMinFrameDurationlomOqCM = null;
    private util.h.xy.ai.mo.mb getOutputSizes = null;
    private util.h.xy.ai.mo.mb getOutputStallDuration = null;
    private int getOutputSizeshNQ4ISI = 0;
    private util.h.xy.ai.mo.mb getValidOutputFormatsForInputhNQ4ISI = null;
    private util.h.xy.ai.mo.mb isOutputSupportedForhNQ4ISI = null;
    private util.h.xy.ai.mo.mb unwrapAs = null;
    private int getARTIFICIAL_FRAME_PACKAGE_NAME = 0;

    /* renamed from: a, reason: collision with root package name */
    private util.h.xy.ai.mo.mb f7073a = null;
    private util.h.xy.ai.mo.mb coroutineCreation = null;
    private util.h.xy.ai.mo.mb _CREATION = null;
    private int accessartificialFrame = 0;
    private util.h.xy.ai.mo.mb d = null;
    private util.h.xy.ai.mo.mb kernelVersion = null;
    private util.h.xy.ai.mo.mb _BOUNDARY = null;
    private util.h.xy.ai.mo.mb getInputFormats = null;
    private util.h.xy.ai.mo.mb c = null;
    private util.h.xy.ai.mo.mb AMEXKernel = null;

    protected final void finalize() {
        getOutputMinFrameDuration = (getHighSpeedVideoFpsRanges + 67) % 128;
        m24749();
        getOutputMinFrameDuration = (getHighSpeedVideoFpsRanges + 105) % 128;
    }

    final class mb extends com.sun.jna.Memory {
        private static int Camera2StreamConfigurationMap = 0;
        private static int getHighSpeedVideoFpsRanges = 1;

        public mb(long j) {
            super(j);
        }

        @Override // com.sun.jna.Memory
        public final void dispose() {
            int i = getHighSpeedVideoFpsRanges;
            Camera2StreamConfigurationMap = ((i & 81) + (i | 81)) % 128;
            super.dispose();
            int i2 = getHighSpeedVideoFpsRanges;
            Camera2StreamConfigurationMap = ((i2 ^ 99) + ((i2 & 99) << 1)) % 128;
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    protected final void m24762() {
        int i = getHighSpeedVideoFpsRanges + 17;
        getOutputMinFrameDuration = i % 128;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        util.h.xy.ai.mo.mb mbVar = this.CoroutineDebuggingKt;
        if (mbVar != null) {
            try {
                mbVar.dispose();
            } finally {
                this.CoroutineDebuggingKt = null;
            }
        }
        util.h.xy.ai.mo.mb mbVar2 = this.toString;
        if (mbVar2 != null) {
            try {
                mbVar2.dispose();
                this.toString = null;
                getOutputMinFrameDuration = (getHighSpeedVideoFpsRanges + 45) % 128;
            } catch (java.lang.Throwable th) {
                this.toString = null;
                throw th;
            }
        }
        util.h.xy.ai.mo.mb mbVar3 = this.ArtificialStackFrames;
        if (mbVar3 != null) {
            int i2 = getOutputMinFrameDuration + 99;
            getHighSpeedVideoFpsRanges = i2 % 128;
            try {
                if (i2 % 2 == 0) {
                    mbVar3.dispose();
                } else {
                    mbVar3.dispose();
                    throw null;
                }
            } finally {
                this.ArtificialStackFrames = null;
            }
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m24763(int i) {
        int i2 = getHighSpeedVideoFpsRanges + 87;
        getOutputMinFrameDuration = i2 % 128;
        if (i2 % 2 == 0) {
            this.isOutputSupportedFor = i;
            throw null;
        }
        this.isOutputSupportedFor = i;
        util.h.xy.ai.mo.mb mbVar = this.CoroutineDebuggingKt;
        if (mbVar != null) {
            try {
                mbVar.dispose();
            } finally {
                this.CoroutineDebuggingKt = null;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE) * i;
        int i3 = getOutputMinFrameDuration;
        getHighSpeedVideoFpsRanges = (i3 + 61) % 128;
        getHighSpeedVideoFpsRanges = (i3 + 9) % 128;
        this.CoroutineDebuggingKt = new util.h.xy.ai.mo.mb(nativeSize + 125);
        util.h.xy.ai.mo.mb mbVar2 = this.toString;
        if (mbVar2 != null) {
            try {
                mbVar2.dispose();
                this.toString = null;
                int i4 = getHighSpeedVideoFpsRanges + 67;
                getOutputMinFrameDuration = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 3 / 3;
                }
            } catch (java.lang.Throwable th) {
                this.toString = null;
                throw th;
            }
        }
        util.h.xy.ai.mo.mb mbVar3 = new util.h.xy.ai.mo.mb(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        this.toString = mbVar3;
        long nativeValue = com.sun.jna.Pointer.nativeValue(this.CoroutineDebuggingKt);
        int i6 = getOutputMinFrameDuration;
        getHighSpeedVideoFpsRanges = (i6 + 17) % 128;
        getHighSpeedVideoFpsRanges = (i6 + 21) % 128;
        mbVar3.setPointer(0L, new com.sun.jna.Pointer(nativeValue + 70));
        util.h.xy.ai.mo.mb mbVar4 = this.ArtificialStackFrames;
        if (mbVar4 != null) {
            getOutputMinFrameDuration = (getHighSpeedVideoFpsRanges + 25) % 128;
            try {
                mbVar4.dispose();
            } finally {
                this.ArtificialStackFrames = null;
            }
        }
        long nativeValue2 = com.sun.jna.Pointer.nativeValue(this.toString);
        util.h.xy.ai.mo.mb mbVar5 = new util.h.xy.ai.mo.mb(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        mbVar5.setLong(0L, nativeValue2 ^ 1730241655);
        int i7 = getOutputMinFrameDuration + 105;
        getHighSpeedVideoFpsRanges = i7 % 128;
        if (i7 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        this.ArtificialStackFrames = mbVar5;
    }

    private static void Camera2StreamConfigurationMap(int i, java.lang.String str, java.lang.Object[] objArr) {
        int i2 = getHighResolutionOutputSizeshNQ4ISI + 121;
        int i3 = i2 % 128;
        getHighSpeedVideoFpsRangesFor = i3;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        int i4 = i3 + 75;
        getHighResolutionOutputSizeshNQ4ISI = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        byte[] bytes = str.getBytes("ISO-8859-1");
        util.h.xz.b.md mdVar = new util.h.xz.b.md();
        char[] cArr = getInputSizeshNQ4ISI;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                cArr2[i5] = (char) (cArr[i5] ^ (-3299939579226817547L));
                i5++;
                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 37) % 128;
            }
            cArr = cArr2;
        }
        int i6 = (int) ((-3299939579226817547L) ^ getHighSpeedVideoSizes);
        if (!getHighSpeedVideoSizesFor) {
            if (!Camera2StreamConfigurationMap) {
                throw null;
            }
            throw null;
        }
        mdVar.f2642 = bytes.length;
        char[] cArr3 = new char[mdVar.f2642];
        mdVar.f2643 = 0;
        while (mdVar.f2643 < mdVar.f2642) {
            cArr3[mdVar.f2643] = (char) (cArr[bytes[(mdVar.f2642 - 1) - mdVar.f2643] + i] - i6);
            mdVar.f2643++;
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m24754(com.sun.jna.Pointer pointer) {
        getOutputMinFrameDuration = (getHighSpeedVideoFpsRanges + 15) % 128;
        m24763(com.sun.jna.Native.POINTER_SIZE);
        this.toString.setPointer(0L, pointer);
        getHighSpeedVideoFpsRanges = (getOutputMinFrameDuration + 77) % 128;
    }

    private static int getHighSpeedVideoSizes() {
        int i = getOutputMinFrameDuration;
        int i2 = i + 61;
        getHighSpeedVideoFpsRanges = i2 % 128;
        int i3 = i2 % 2 != 0 ? 49 : 74;
        getHighSpeedVideoFpsRanges = (i + 15) % 128;
        return i3;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    protected final void m24757() {
        int i = (getHighSpeedVideoFpsRanges + 35) % 128;
        getOutputMinFrameDuration = i;
        util.h.xy.ai.mo.mb mbVar = this.getOutputStallDurationlomOqCM;
        if (mbVar != null) {
            int i2 = i + 115;
            getHighSpeedVideoFpsRanges = i2 % 128;
            try {
                if (i2 % 2 != 0) {
                    mbVar.dispose();
                    this.getOutputStallDurationlomOqCM = null;
                    throw new java.lang.ArithmeticException();
                }
                mbVar.dispose();
            } finally {
                this.getOutputStallDurationlomOqCM = null;
            }
        }
        util.h.xy.ai.mo.mb mbVar2 = this.getOutputFormats;
        if (mbVar2 != null) {
            try {
                mbVar2.dispose();
            } finally {
                this.getOutputFormats = null;
            }
        }
        util.h.xy.ai.mo.mb mbVar3 = this.init;
        if (mbVar3 != null) {
            try {
                mbVar3.dispose();
                this.init = null;
                getOutputMinFrameDuration = (getHighSpeedVideoFpsRanges + 63) % 128;
            } catch (java.lang.Throwable th) {
                this.init = null;
                throw th;
            }
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m24775(int i) {
        int i2 = getOutputMinFrameDuration + 101;
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 != 0) {
            this.b = i;
            throw null;
        }
        this.b = i;
        util.h.xy.ai.mo.mb mbVar = this.getOutputStallDurationlomOqCM;
        if (mbVar != null) {
            try {
                mbVar.dispose();
            } finally {
                this.getOutputStallDurationlomOqCM = null;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE) * i;
        int i3 = getOutputMinFrameDuration;
        getHighSpeedVideoFpsRanges = (i3 + 109) % 128;
        int i4 = i3 + 23;
        getHighSpeedVideoFpsRanges = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        this.getOutputStallDurationlomOqCM = new util.h.xy.ai.mo.mb(nativeSize + 87);
        util.h.xy.ai.mo.mb mbVar2 = this.getOutputFormats;
        if (mbVar2 != null) {
            int i5 = getHighSpeedVideoFpsRanges + 107;
            getOutputMinFrameDuration = i5 % 128;
            try {
                if (i5 % 2 == 0) {
                    mbVar2.dispose();
                    throw null;
                }
                mbVar2.dispose();
            } finally {
                this.getOutputFormats = null;
            }
        }
        util.h.xy.ai.mo.mb mbVar3 = new util.h.xy.ai.mo.mb(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        this.getOutputFormats = mbVar3;
        mbVar3.setPointer(0L, new com.sun.jna.Pointer(com.sun.jna.Pointer.nativeValue(this.getOutputStallDurationlomOqCM) + getHighSpeedVideoSizes()));
        util.h.xy.ai.mo.mb mbVar4 = this.init;
        if (mbVar4 != null) {
            int i6 = getOutputMinFrameDuration + 111;
            getHighSpeedVideoFpsRanges = i6 % 128;
            try {
                if (i6 % 2 != 0) {
                    mbVar4.dispose();
                    throw null;
                }
                mbVar4.dispose();
            } finally {
                this.init = null;
            }
        }
        long nativeValue = com.sun.jna.Pointer.nativeValue(this.getOutputFormats);
        util.h.xy.ai.mo.mb mbVar5 = new util.h.xy.ai.mo.mb(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        mbVar5.setLong(0L, nativeValue ^ 129928986);
        getOutputMinFrameDuration = (getHighSpeedVideoFpsRanges + 79) % 128;
        this.init = mbVar5;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m24760(java.lang.String str) throws java.io.IOException {
        int i = getOutputMinFrameDuration + 83;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 == 0) {
            m24766(str, java.nio.charset.Charset.defaultCharset());
        } else {
            m24766(str, java.nio.charset.Charset.defaultCharset());
            throw null;
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    protected final void m24766(java.lang.String str, java.nio.charset.Charset charset) throws java.io.IOException {
        getOutputMinFrameDuration = (getHighSpeedVideoFpsRanges + 113) % 128;
        byte[] bytes = str.getBytes(charset);
        m24775(bytes.length + 1);
        this.getOutputStallDurationlomOqCM.write(getHighSpeedVideoSizes(), bytes, 0, bytes.length);
        this.getOutputStallDurationlomOqCM.setByte(bytes.length + getHighSpeedVideoSizes(), (byte) 0);
        getHighSpeedVideoFpsRanges = (getOutputMinFrameDuration + 87) % 128;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m24769(com.sun.jna.Pointer pointer) {
        util.h.xy.ai.mo.mb mbVar;
        long j;
        int i = getOutputMinFrameDuration + 51;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 != 0) {
            m24775(com.sun.jna.Native.POINTER_SIZE);
            mbVar = this.getOutputFormats;
            j = 1;
        } else {
            m24775(com.sun.jna.Native.POINTER_SIZE);
            mbVar = this.getOutputFormats;
            j = 0;
        }
        mbVar.setPointer(j, pointer);
        int i2 = getHighSpeedVideoFpsRanges + 117;
        getOutputMinFrameDuration = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private static int getHighSpeedVideoFpsRangesFor() {
        int i = getOutputMinFrameDuration + 39;
        int i2 = i % 128;
        getHighSpeedVideoFpsRanges = i2;
        int i3 = i % 2 != 0 ? 111 : 100;
        int i4 = i2 + 49;
        getOutputMinFrameDuration = i4 % 128;
        if (i4 % 2 != 0) {
            return i3;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    protected final void m24767() {
        int i = getOutputMinFrameDuration + 91;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 == 0) {
            util.h.xy.ai.mo.mb mbVar = this.getOutputMinFrameDurationlomOqCM;
            if (mbVar != null) {
                try {
                    mbVar.dispose();
                    this.getOutputMinFrameDurationlomOqCM = null;
                    getHighSpeedVideoFpsRanges = (getOutputMinFrameDuration + 7) % 128;
                } catch (java.lang.Throwable th) {
                    this.getOutputMinFrameDurationlomOqCM = null;
                    throw th;
                }
            }
            util.h.xy.ai.mo.mb mbVar2 = this.getOutputSizes;
            if (mbVar2 != null) {
                try {
                    mbVar2.dispose();
                    this.getOutputSizes = null;
                    getHighSpeedVideoFpsRanges = (getOutputMinFrameDuration + 107) % 128;
                } catch (java.lang.Throwable th2) {
                    this.getOutputSizes = null;
                    throw th2;
                }
            }
            util.h.xy.ai.mo.mb mbVar3 = this.getOutputStallDuration;
            if (mbVar3 != null) {
                try {
                    mbVar3.dispose();
                    this.getOutputStallDuration = null;
                    getOutputMinFrameDuration = (getHighSpeedVideoFpsRanges + 81) % 128;
                    return;
                } catch (java.lang.Throwable th3) {
                    this.getOutputStallDuration = null;
                    throw th3;
                }
            }
            return;
        }
        throw null;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m24753(int i) {
        this.coroutineBoundary = i;
        util.h.xy.ai.mo.mb mbVar = this.getOutputMinFrameDurationlomOqCM;
        if (mbVar != null) {
            try {
                mbVar.dispose();
            } finally {
                this.getOutputMinFrameDurationlomOqCM = null;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE) * i;
        int i2 = getHighSpeedVideoFpsRanges;
        getOutputMinFrameDuration = (i2 + 37) % 128;
        int i3 = i2 + 77;
        getOutputMinFrameDuration = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        this.getOutputMinFrameDurationlomOqCM = new util.h.xy.ai.mo.mb(nativeSize + 113);
        util.h.xy.ai.mo.mb mbVar2 = this.getOutputSizes;
        if (mbVar2 != null) {
            getHighSpeedVideoFpsRanges = (getOutputMinFrameDuration + 113) % 128;
            try {
                mbVar2.dispose();
            } finally {
                this.getOutputSizes = null;
            }
        }
        util.h.xy.ai.mo.mb mbVar3 = new util.h.xy.ai.mo.mb(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        this.getOutputSizes = mbVar3;
        mbVar3.setPointer(0L, new com.sun.jna.Pointer(com.sun.jna.Pointer.nativeValue(this.getOutputMinFrameDurationlomOqCM) + getHighSpeedVideoFpsRangesFor()));
        util.h.xy.ai.mo.mb mbVar4 = this.getOutputStallDuration;
        if (mbVar4 != null) {
            getOutputMinFrameDuration = (getHighSpeedVideoFpsRanges + 99) % 128;
            try {
                mbVar4.dispose();
            } finally {
                this.getOutputStallDuration = null;
            }
        }
        long nativeValue = com.sun.jna.Pointer.nativeValue(this.getOutputSizes);
        util.h.xy.ai.mo.mb mbVar5 = new util.h.xy.ai.mo.mb(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        byte[] bArr = new byte[com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)];
        getHighSpeedVideoFpsRanges = (getOutputMinFrameDuration + 5) % 128;
        int i4 = 0;
        while (i4 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)) {
            int i5 = i4 * 8;
            bArr[i4] = (byte) (((255 << i5) & nativeValue) >> i5);
            i4++;
            getHighSpeedVideoFpsRanges = (getOutputMinFrameDuration + 101) % 128;
        }
        int i6 = 1624933508;
        for (int i7 = 0; i7 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i7++) {
            byte b = bArr[i7];
            bArr[i7] = (byte) (((byte) (i6 & 255)) ^ b);
            i6 = ((i6 << (i7 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))) | (i6 >>> (((com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8) - 1) - (i7 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))))) * (~(b & 255));
        }
        long j = 0;
        for (int i8 = 0; i8 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i8++) {
            getOutputMinFrameDuration = (getHighSpeedVideoFpsRanges + 53) % 128;
            j |= (bArr[i8] & 255) << (i8 * 8);
        }
        mbVar5.setLong(0L, j);
        this.getOutputStallDuration = mbVar5;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m24770(java.lang.String str) throws java.io.IOException {
        int i = getHighSpeedVideoFpsRanges + 73;
        getOutputMinFrameDuration = i % 128;
        if (i % 2 != 0) {
            m24761(str, java.nio.charset.Charset.defaultCharset());
        } else {
            m24761(str, java.nio.charset.Charset.defaultCharset());
            throw null;
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    protected final void m24761(java.lang.String str, java.nio.charset.Charset charset) throws java.io.IOException {
        getHighSpeedVideoFpsRanges = (getOutputMinFrameDuration + 81) % 128;
        byte[] bytes = str.getBytes(charset);
        m24753(bytes.length + 1);
        this.getOutputMinFrameDurationlomOqCM.write(getHighSpeedVideoFpsRangesFor(), bytes, 0, bytes.length);
        this.getOutputMinFrameDurationlomOqCM.setByte(bytes.length + getHighSpeedVideoFpsRangesFor(), (byte) 0);
        getOutputMinFrameDuration = (getHighSpeedVideoFpsRanges + 85) % 128;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m24764(com.sun.jna.Pointer pointer) {
        getOutputMinFrameDuration = (getHighSpeedVideoFpsRanges + 103) % 128;
        m24753(com.sun.jna.Native.POINTER_SIZE);
        this.getOutputSizes.setPointer(0L, pointer);
        int i = getHighSpeedVideoFpsRanges + 105;
        getOutputMinFrameDuration = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    protected final void m24752() {
        getHighSpeedVideoFpsRanges = (getOutputMinFrameDuration + 79) % 128;
        util.h.xy.ai.mo.mb mbVar = this.getValidOutputFormatsForInputhNQ4ISI;
        if (mbVar != null) {
            try {
                mbVar.dispose();
            } finally {
                this.getValidOutputFormatsForInputhNQ4ISI = null;
            }
        }
        util.h.xy.ai.mo.mb mbVar2 = this.isOutputSupportedForhNQ4ISI;
        if (mbVar2 != null) {
            int i = getOutputMinFrameDuration + 31;
            getHighSpeedVideoFpsRanges = i % 128;
            try {
                if (i % 2 != 0) {
                    mbVar2.dispose();
                    throw null;
                }
                mbVar2.dispose();
                this.isOutputSupportedForhNQ4ISI = null;
                getOutputMinFrameDuration = (getHighSpeedVideoFpsRanges + 97) % 128;
            } finally {
                this.isOutputSupportedForhNQ4ISI = null;
            }
        }
        util.h.xy.ai.mo.mb mbVar3 = this.unwrapAs;
        if (mbVar3 != null) {
            try {
                mbVar3.dispose();
                this.unwrapAs = null;
                getOutputMinFrameDuration = (getHighSpeedVideoFpsRanges + 33) % 128;
            } catch (java.lang.Throwable th) {
                this.unwrapAs = null;
                throw th;
            }
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m24758(int i) {
        getHighSpeedVideoFpsRanges = (getOutputMinFrameDuration + 75) % 128;
        this.getOutputSizeshNQ4ISI = i;
        util.h.xy.ai.mo.mb mbVar = this.getValidOutputFormatsForInputhNQ4ISI;
        if (mbVar != null) {
            try {
                mbVar.dispose();
                this.getValidOutputFormatsForInputhNQ4ISI = null;
                getOutputMinFrameDuration = (getHighSpeedVideoFpsRanges + 17) % 128;
            } catch (java.lang.Throwable th) {
                this.getValidOutputFormatsForInputhNQ4ISI = null;
                throw th;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE) * i;
        int i2 = getHighSpeedVideoFpsRanges;
        int i3 = i2 + 27;
        getOutputMinFrameDuration = i3 % 128;
        int i4 = i3 % 2 == 0 ? 73 : 83;
        int i5 = i2 + 119;
        getOutputMinFrameDuration = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
        this.getValidOutputFormatsForInputhNQ4ISI = new util.h.xy.ai.mo.mb(nativeSize + i4);
        util.h.xy.ai.mo.mb mbVar2 = this.isOutputSupportedForhNQ4ISI;
        if (mbVar2 != null) {
            getOutputMinFrameDuration = (getHighSpeedVideoFpsRanges + 93) % 128;
            try {
                mbVar2.dispose();
            } finally {
                this.isOutputSupportedForhNQ4ISI = null;
            }
        }
        util.h.xy.ai.mo.mb mbVar3 = new util.h.xy.ai.mo.mb(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        this.isOutputSupportedForhNQ4ISI = mbVar3;
        long nativeValue = com.sun.jna.Pointer.nativeValue(this.getValidOutputFormatsForInputhNQ4ISI);
        int i6 = (getOutputMinFrameDuration + 75) % 128;
        getHighSpeedVideoFpsRanges = i6;
        getOutputMinFrameDuration = (i6 + 57) % 128;
        mbVar3.setPointer(0L, new com.sun.jna.Pointer(nativeValue + 66));
        util.h.xy.ai.mo.mb mbVar4 = this.unwrapAs;
        if (mbVar4 != null) {
            try {
                mbVar4.dispose();
            } finally {
                this.unwrapAs = null;
            }
        }
        long nativeValue2 = com.sun.jna.Pointer.nativeValue(this.isOutputSupportedForhNQ4ISI);
        util.h.xy.ai.mo.mb mbVar5 = new util.h.xy.ai.mo.mb(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        mbVar5.setLong(0L, nativeValue2 ^ 634933752);
        int i7 = getOutputMinFrameDuration + 89;
        getHighSpeedVideoFpsRanges = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
        this.unwrapAs = mbVar5;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m24755(java.lang.String str) throws java.io.IOException {
        int i = getHighSpeedVideoFpsRanges + 27;
        getOutputMinFrameDuration = i % 128;
        if (i % 2 != 0) {
            m24756(str, java.nio.charset.Charset.defaultCharset());
        } else {
            m24756(str, java.nio.charset.Charset.defaultCharset());
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    protected final void m24756(java.lang.String str, java.nio.charset.Charset charset) throws java.io.IOException {
        util.h.xy.ai.mo.mb mbVar;
        int i;
        int i2 = getOutputMinFrameDuration + 69;
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 != 0) {
            byte[] bytes = str.getBytes(charset);
            m24758(bytes.length);
            util.h.xy.ai.mo.mb mbVar2 = this.getValidOutputFormatsForInputhNQ4ISI;
            int i3 = (getOutputMinFrameDuration + 75) % 128;
            getHighSpeedVideoFpsRanges = i3;
            getOutputMinFrameDuration = (i3 + 57) % 128;
            mbVar2.write(66L, bytes, 0, bytes.length);
            mbVar = this.getValidOutputFormatsForInputhNQ4ISI;
            int length = bytes.length;
            int i4 = (getOutputMinFrameDuration + 75) % 128;
            getHighSpeedVideoFpsRanges = i4;
            getOutputMinFrameDuration = (i4 + 57) % 128;
            i = length << 66;
        } else {
            byte[] bytes2 = str.getBytes(charset);
            m24758(bytes2.length + 1);
            util.h.xy.ai.mo.mb mbVar3 = this.getValidOutputFormatsForInputhNQ4ISI;
            int i5 = (getOutputMinFrameDuration + 75) % 128;
            getHighSpeedVideoFpsRanges = i5;
            getOutputMinFrameDuration = (i5 + 57) % 128;
            mbVar3.write(66L, bytes2, 0, bytes2.length);
            mbVar = this.getValidOutputFormatsForInputhNQ4ISI;
            int length2 = bytes2.length;
            int i6 = (getOutputMinFrameDuration + 75) % 128;
            getHighSpeedVideoFpsRanges = i6;
            getOutputMinFrameDuration = (i6 + 57) % 128;
            i = length2 + 66;
        }
        mbVar.setByte(i, (byte) 0);
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m24759(com.sun.jna.Pointer pointer) {
        getOutputMinFrameDuration = (getHighSpeedVideoFpsRanges + 45) % 128;
        m24758(com.sun.jna.Native.POINTER_SIZE);
        this.isOutputSupportedForhNQ4ISI.setPointer(0L, pointer);
        getOutputMinFrameDuration = (getHighSpeedVideoFpsRanges + 95) % 128;
    }

    private static int getHighSpeedVideoFpsRanges() {
        int i = getOutputMinFrameDuration + 93;
        int i2 = i % 128;
        getHighSpeedVideoFpsRanges = i2;
        int i3 = i % 2 != 0 ? 101 : 92;
        int i4 = i2 + 97;
        getOutputMinFrameDuration = i4 % 128;
        if (i4 % 2 != 0) {
            return i3;
        }
        throw null;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    protected final void m24774() {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = i + 23;
        getOutputMinFrameDuration = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        util.h.xy.ai.mo.mb mbVar = this.f7073a;
        if (mbVar != null) {
            int i3 = i + 99;
            getOutputMinFrameDuration = i3 % 128;
            try {
                if (i3 % 2 == 0) {
                    mbVar.dispose();
                    throw null;
                }
                mbVar.dispose();
            } finally {
                this.f7073a = null;
            }
        }
        util.h.xy.ai.mo.mb mbVar2 = this.coroutineCreation;
        if (mbVar2 != null) {
            try {
                mbVar2.dispose();
            } finally {
                this.coroutineCreation = null;
            }
        }
        util.h.xy.ai.mo.mb mbVar3 = this._CREATION;
        if (mbVar3 != null) {
            int i4 = getHighSpeedVideoFpsRanges + 3;
            getOutputMinFrameDuration = i4 % 128;
            try {
                if (i4 % 2 != 0) {
                    mbVar3.dispose();
                } else {
                    mbVar3.dispose();
                    this._CREATION = null;
                    throw new java.lang.ArithmeticException();
                }
            } finally {
                this._CREATION = null;
            }
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m24768(int i) {
        this.getARTIFICIAL_FRAME_PACKAGE_NAME = i;
        util.h.xy.ai.mo.mb mbVar = this.f7073a;
        if (mbVar != null) {
            try {
                mbVar.dispose();
            } finally {
                this.f7073a = null;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE) * i;
        int i2 = getOutputMinFrameDuration;
        int i3 = i2 + 93;
        getHighSpeedVideoFpsRanges = i3 % 128;
        int i4 = i3 % 2 != 0 ? 102 : 109;
        getHighSpeedVideoFpsRanges = (i2 + 45) % 128;
        this.f7073a = new util.h.xy.ai.mo.mb(nativeSize + i4);
        util.h.xy.ai.mo.mb mbVar2 = this.coroutineCreation;
        if (mbVar2 != null) {
            getOutputMinFrameDuration = (getHighSpeedVideoFpsRanges + 77) % 128;
            try {
                mbVar2.dispose();
            } finally {
                this.coroutineCreation = null;
            }
        }
        util.h.xy.ai.mo.mb mbVar3 = new util.h.xy.ai.mo.mb(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        this.coroutineCreation = mbVar3;
        mbVar3.setPointer(0L, new com.sun.jna.Pointer(com.sun.jna.Pointer.nativeValue(this.f7073a) + getHighSpeedVideoFpsRanges()));
        util.h.xy.ai.mo.mb mbVar4 = this._CREATION;
        if (mbVar4 != null) {
            getHighSpeedVideoFpsRanges = (getOutputMinFrameDuration + 93) % 128;
            try {
                mbVar4.dispose();
            } finally {
                this._CREATION = null;
            }
        }
        long nativeValue = com.sun.jna.Pointer.nativeValue(this.coroutineCreation);
        util.h.xy.ai.mo.mb mbVar5 = new util.h.xy.ai.mo.mb(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        byte[] bArr = new byte[com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)];
        getOutputMinFrameDuration = (getHighSpeedVideoFpsRanges + 109) % 128;
        int i5 = 0;
        for (int i6 = 0; i6 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i6++) {
            int i7 = i6 * 8;
            bArr[i6] = (byte) (((255 << i7) & nativeValue) >> i7);
        }
        int i8 = 2129938274;
        for (int i9 = 0; i9 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i9++) {
            byte b = bArr[i9];
            bArr[i9] = (byte) (((byte) (i8 & 255)) ^ b);
            i8 = ((i8 << (i9 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))) | (i8 >>> (((com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8) - 1) - (i9 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))))) * (~(b & 255));
        }
        getHighSpeedVideoFpsRanges = (getOutputMinFrameDuration + 111) % 128;
        long j = 0;
        while (i5 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)) {
            int i10 = (getOutputMinFrameDuration + 89) % 128;
            getHighSpeedVideoFpsRanges = i10;
            j |= (bArr[i5] & 255) << (i5 * 8);
            i5++;
            getOutputMinFrameDuration = (i10 + 25) % 128;
        }
        mbVar5.setLong(0L, j);
        this._CREATION = mbVar5;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m24765(java.lang.String str) throws java.io.IOException {
        getHighSpeedVideoFpsRanges = (getOutputMinFrameDuration + 25) % 128;
        m24771(str, java.nio.charset.Charset.defaultCharset());
        getHighSpeedVideoFpsRanges = (getOutputMinFrameDuration + 107) % 128;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    protected final void m24771(java.lang.String str, java.nio.charset.Charset charset) throws java.io.IOException {
        int i = getOutputMinFrameDuration + 119;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 != 0) {
            byte[] bytes = str.getBytes(charset);
            m24768(bytes.length >> 1);
            this.f7073a.write(0 / getHighSpeedVideoFpsRanges(), bytes, 1, bytes.length);
            this.f7073a.setByte(bytes.length / getHighSpeedVideoFpsRanges(), (byte) 1);
        } else {
            byte[] bytes2 = str.getBytes(charset);
            m24768(bytes2.length + 1);
            this.f7073a.write(getHighSpeedVideoFpsRanges(), bytes2, 0, bytes2.length);
            this.f7073a.setByte(bytes2.length + getHighSpeedVideoFpsRanges(), (byte) 0);
        }
        getHighSpeedVideoFpsRanges = (getOutputMinFrameDuration + 105) % 128;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m24776(com.sun.jna.Pointer pointer) {
        getHighSpeedVideoFpsRanges = (getOutputMinFrameDuration + 9) % 128;
        m24768(com.sun.jna.Native.POINTER_SIZE);
        this.coroutineCreation.setPointer(0L, pointer);
        getHighSpeedVideoFpsRanges = (getOutputMinFrameDuration + 47) % 128;
    }

    private static int getHighResolutionOutputSizeshNQ4ISI() {
        int i = getOutputMinFrameDuration + 49;
        int i2 = i % 128;
        getHighSpeedVideoFpsRanges = i2;
        int i3 = i % 2 != 0 ? 93 : 96;
        int i4 = i2 + 7;
        getOutputMinFrameDuration = i4 % 128;
        if (i4 % 2 != 0) {
            return i3;
        }
        throw null;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    protected final void m24748() {
        util.h.xy.ai.mo.mb mbVar = this.d;
        if (mbVar != null) {
            try {
                mbVar.dispose();
            } finally {
                this.d = null;
            }
        }
        util.h.xy.ai.mo.mb mbVar2 = this.kernelVersion;
        if (mbVar2 != null) {
            int i = getOutputMinFrameDuration + 39;
            getHighSpeedVideoFpsRanges = i % 128;
            try {
                if (i % 2 == 0) {
                    mbVar2.dispose();
                } else {
                    mbVar2.dispose();
                    throw null;
                }
            } finally {
                this.kernelVersion = null;
            }
        }
        util.h.xy.ai.mo.mb mbVar3 = this._BOUNDARY;
        if (mbVar3 != null) {
            try {
                mbVar3.dispose();
                this._BOUNDARY = null;
                getOutputMinFrameDuration = (getHighSpeedVideoFpsRanges + 25) % 128;
            } catch (java.lang.Throwable th) {
                this._BOUNDARY = null;
                throw th;
            }
        }
    }

    /* renamed from: ͺ, reason: contains not printable characters */
    public final void m24773(int i) {
        this.accessartificialFrame = i;
        util.h.xy.ai.mo.mb mbVar = this.d;
        if (mbVar != null) {
            int i2 = getHighSpeedVideoFpsRanges + 35;
            getOutputMinFrameDuration = i2 % 128;
            try {
                if (i2 % 2 == 0) {
                    mbVar.dispose();
                    throw null;
                }
                mbVar.dispose();
            } finally {
                this.d = null;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE) * i;
        int i3 = getHighSpeedVideoFpsRanges;
        getOutputMinFrameDuration = (i3 + 43) % 128;
        int i4 = i3 + 121;
        getOutputMinFrameDuration = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        this.d = new util.h.xy.ai.mo.mb(nativeSize + 115);
        util.h.xy.ai.mo.mb mbVar2 = this.kernelVersion;
        if (mbVar2 != null) {
            int i5 = getHighSpeedVideoFpsRanges + 79;
            getOutputMinFrameDuration = i5 % 128;
            try {
                if (i5 % 2 == 0) {
                    mbVar2.dispose();
                    throw null;
                }
                mbVar2.dispose();
            } finally {
                this.kernelVersion = null;
            }
        }
        util.h.xy.ai.mo.mb mbVar3 = new util.h.xy.ai.mo.mb(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        this.kernelVersion = mbVar3;
        mbVar3.setPointer(0L, new com.sun.jna.Pointer(com.sun.jna.Pointer.nativeValue(this.d) + getHighResolutionOutputSizeshNQ4ISI()));
        util.h.xy.ai.mo.mb mbVar4 = this._BOUNDARY;
        if (mbVar4 != null) {
            try {
                mbVar4.dispose();
                this._BOUNDARY = null;
                getHighSpeedVideoFpsRanges = (getOutputMinFrameDuration + 69) % 128;
            } catch (java.lang.Throwable th) {
                this._BOUNDARY = null;
                throw th;
            }
        }
        long nativeValue = com.sun.jna.Pointer.nativeValue(this.kernelVersion);
        util.h.xy.ai.mo.mb mbVar5 = new util.h.xy.ai.mo.mb(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        byte[] bArr = new byte[com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)];
        for (int i6 = 0; i6 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i6++) {
            getHighSpeedVideoFpsRanges = (getOutputMinFrameDuration + 29) % 128;
            int i7 = i6 * 8;
            bArr[i6] = (byte) (((255 << i7) & nativeValue) >> i7);
        }
        int i8 = 529625605;
        for (int i9 = 0; i9 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i9++) {
            byte b = bArr[i9];
            bArr[i9] = (byte) (((byte) (i8 & 255)) ^ b);
            i8 = ((i8 << (i9 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))) | (i8 >>> (((com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8) - 1) - (i9 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))))) * (~(b & 255));
        }
        getHighSpeedVideoFpsRanges = (getOutputMinFrameDuration + 7) % 128;
        long j = 0;
        for (int i10 = 0; i10 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i10++) {
            j |= (bArr[i10] & 255) << (i10 * 8);
        }
        mbVar5.setLong(0L, j);
        this._BOUNDARY = mbVar5;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m24777(java.lang.String str) throws java.io.IOException {
        getOutputMinFrameDuration = (getHighSpeedVideoFpsRanges + 45) % 128;
        m24778(str, java.nio.charset.Charset.defaultCharset());
        int i = getHighSpeedVideoFpsRanges + 11;
        getOutputMinFrameDuration = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    protected final void m24778(java.lang.String str, java.nio.charset.Charset charset) throws java.io.IOException {
        util.h.xy.ai.mo.mb mbVar;
        int length;
        int i = getOutputMinFrameDuration + 117;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 != 0) {
            byte[] bytes = str.getBytes(charset);
            m24773(bytes.length % 1);
            util.h.xy.ai.mo.mb mbVar2 = this.d;
            getHighResolutionOutputSizeshNQ4ISI();
            mbVar2.write(0L, bytes, 0, bytes.length);
            mbVar = this.d;
            length = bytes.length;
        } else {
            byte[] bytes2 = str.getBytes(charset);
            m24773(bytes2.length + 1);
            this.d.write(getHighResolutionOutputSizeshNQ4ISI(), bytes2, 0, bytes2.length);
            mbVar = this.d;
            length = bytes2.length;
        }
        mbVar.setByte(length + getHighResolutionOutputSizeshNQ4ISI(), (byte) 0);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public final void m24750(com.sun.jna.Pointer pointer) {
        util.h.xy.ai.mo.mb mbVar;
        long j;
        int i = getHighSpeedVideoFpsRanges + 87;
        getOutputMinFrameDuration = i % 128;
        if (i % 2 == 0) {
            m24773(com.sun.jna.Native.POINTER_SIZE);
            mbVar = this.kernelVersion;
            j = 1;
        } else {
            m24773(com.sun.jna.Native.POINTER_SIZE);
            mbVar = this.kernelVersion;
            j = 0;
        }
        mbVar.setPointer(j, pointer);
        int i2 = getOutputMinFrameDuration + 117;
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    protected final void m24751() {
        int i = getHighSpeedVideoFpsRanges + 65;
        int i2 = i % 128;
        getOutputMinFrameDuration = i2;
        if (i % 2 == 0) {
            throw null;
        }
        util.h.xy.ai.mo.mb mbVar = this.getInputFormats;
        if (mbVar != null) {
            int i3 = i2 + 5;
            getHighSpeedVideoFpsRanges = i3 % 128;
            try {
                if (i3 % 2 != 0) {
                    mbVar.dispose();
                    throw null;
                }
                mbVar.dispose();
            } finally {
                this.getInputFormats = null;
            }
        }
        util.h.xy.ai.mo.mb mbVar2 = this.c;
        if (mbVar2 != null) {
            try {
                mbVar2.dispose();
            } finally {
                this.c = null;
            }
        }
        util.h.xy.ai.mo.mb mbVar3 = this.AMEXKernel;
        if (mbVar3 != null) {
            int i4 = getOutputMinFrameDuration + 13;
            getHighSpeedVideoFpsRanges = i4 % 128;
            try {
                if (i4 % 2 != 0) {
                    mbVar3.dispose();
                    throw null;
                }
                mbVar3.dispose();
                this.AMEXKernel = null;
                getOutputMinFrameDuration = (getHighSpeedVideoFpsRanges + 9) % 128;
            } finally {
                this.AMEXKernel = null;
            }
        }
    }

    private util.h.xy.ai.mo.mb getHighSpeedVideoSizes(long j) {
        util.h.xy.ai.mo.mb mbVar = new util.h.xy.ai.mo.mb(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        byte[] bArr = new byte[com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)];
        int i = 0;
        for (int i2 = 0; i2 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i2++) {
            getOutputMinFrameDuration = (getHighSpeedVideoFpsRanges + 11) % 128;
            int i3 = i2 * 8;
            bArr[i2] = (byte) (((255 << i3) & j) >> i3);
        }
        int i4 = 235237133;
        for (int i5 = 0; i5 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i5++) {
            byte b = bArr[i5];
            bArr[i5] = (byte) (((byte) (i4 & 255)) ^ b);
            i4 = ((i4 << (i5 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))) | (i4 >>> (((com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8) - 1) - (i5 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))))) * (~(b & 255));
        }
        long j2 = 0;
        while (i < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)) {
            int i6 = getOutputMinFrameDuration + 67;
            getHighSpeedVideoFpsRanges = i6 % 128;
            if (i6 % 2 != 0) {
                j2 |= (bArr[i] & 339) >>> (i - 102);
                i += 17;
            } else {
                j2 |= (bArr[i] & 255) << (i * 8);
                i++;
            }
        }
        mbVar.setLong(0L, j2);
        return mbVar;
    }

    /* renamed from: ͺ, reason: contains not printable characters */
    public final int m24772() throws java.io.IOException {
        if (this.ArtificialStackFrames != null && this.init != null && this.getOutputStallDuration != null && this.unwrapAs != null) {
            getHighSpeedVideoFpsRanges = (getOutputMinFrameDuration + 15) % 128;
            if (this._CREATION != null && this._BOUNDARY != null) {
                util.h.xy.ai.mo.mb mbVar = this.getInputFormats;
                if (mbVar != null) {
                    try {
                        mbVar.dispose();
                        this.getInputFormats = null;
                        getHighSpeedVideoFpsRanges = (getOutputMinFrameDuration + 119) % 128;
                    } catch (java.lang.Throwable th) {
                        this.getInputFormats = null;
                        throw th;
                    }
                }
                int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE);
                int i = getHighSpeedVideoFpsRanges + 81;
                int i2 = i % 128;
                getOutputMinFrameDuration = i2;
                int i3 = i % 2 == 0 ? 39 : 103;
                int i4 = i2 + 89;
                getHighSpeedVideoFpsRanges = i4 % 128;
                if (i4 % 2 != 0) {
                    throw null;
                }
                this.getInputFormats = new util.h.xy.ai.mo.mb(nativeSize + i3);
                util.h.xy.ai.mo.mb mbVar2 = this.c;
                if (mbVar2 != null) {
                    try {
                        mbVar2.dispose();
                    } finally {
                        this.c = null;
                    }
                }
                util.h.xy.ai.mo.mb mbVar3 = new util.h.xy.ai.mo.mb(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
                this.c = mbVar3;
                long nativeValue = com.sun.jna.Pointer.nativeValue(this.getInputFormats);
                int i5 = (getOutputMinFrameDuration + 85) % 128;
                getHighSpeedVideoFpsRanges = i5;
                getOutputMinFrameDuration = (i5 + 21) % 128;
                mbVar3.setPointer(0L, new com.sun.jna.Pointer(nativeValue + 70));
                util.h.xy.ai.mo.mb mbVar4 = this.AMEXKernel;
                if (mbVar4 != null) {
                    getHighSpeedVideoFpsRanges = (getOutputMinFrameDuration + 105) % 128;
                    try {
                        mbVar4.dispose();
                    } finally {
                        this.AMEXKernel = null;
                    }
                }
                this.AMEXKernel = getHighSpeedVideoSizes(com.sun.jna.Pointer.nativeValue(this.c));
                util.h.xy.ai.rm.getHighSpeedVideoSizes._L5Yns3Zsrmo1zo4pbrjsSX1g9fSgXUYef(this.AMEXKernel, this.ArtificialStackFrames, this.init, this.getOutputStallDuration, this.unwrapAs, this._CREATION, this._BOUNDARY);
                int[] iArr = new int[1];
                util.h.xy.ai.mo.mb mbVar5 = this.getInputFormats;
                int i6 = (getOutputMinFrameDuration + 85) % 128;
                getHighSpeedVideoFpsRanges = i6;
                getOutputMinFrameDuration = (i6 + 21) % 128;
                mbVar5.read(70L, iArr, 0, 1);
                return iArr[0];
            }
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        Camera2StreamConfigurationMap(127 - android.view.View.MeasureSpec.getSize(0), "\u0084\u0083\u008a\u008d\u0091\u0085\u0083\u008c\u008e\u0090\u0084\u008b\u0081\u0085\u008f\u008e\u008d\u0084\u0087\u008a\u0087\u0088\u0086\u008b\u008c\u0085\u0083\u008a\u008b\u0084\u008b\u0081\u0087\u008a\u0087\u0089\u0085\u0088\u0088\u0087\u0085\u0088\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr);
        throw new java.io.IOException(((java.lang.String) objArr[0]).intern());
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public final void m24749() {
        getOutputMinFrameDuration = (getHighSpeedVideoFpsRanges + 5) % 128;
        m24762();
        m24757();
        m24767();
        m24752();
        m24774();
        m24748();
        m24751();
        getHighSpeedVideoFpsRanges = (getOutputMinFrameDuration + 91) % 128;
    }
}
