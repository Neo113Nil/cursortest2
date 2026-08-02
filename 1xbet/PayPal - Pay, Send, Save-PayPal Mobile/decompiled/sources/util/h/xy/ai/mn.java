package util.h.xy.ai;

/* loaded from: classes18.dex */
public final class mn {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoSizes;
    private static int getHighSpeedVideoSizesFor;
    private static char[] getHighSpeedVideoFpsRangesFor = {64340, 64348, 64338, 64349, 64417, 64354, 64352, 64341, 64337, 64339, 64364, 64365, 64360, 64342, 64343, 64361, 64367};
    private static int getHighResolutionOutputSizeshNQ4ISI = -1074857023;
    private static boolean getInputFormats = true;
    private static boolean getInputSizeshNQ4ISI = true;
    private util.h.xy.ai.mn.ma getValidOutputFormatsForInputhNQ4ISI = null;
    private util.h.xy.ai.mn.ma unwrapAs = null;
    private util.h.xy.ai.mn.ma isOutputSupportedFor = null;
    private int coroutineBoundary = 0;
    private util.h.xy.ai.mn.ma getOutputSizeshNQ4ISI = null;
    private util.h.xy.ai.mn.ma getOutputStallDurationlomOqCM = null;
    private util.h.xy.ai.mn.ma getOutputFormats = null;
    private int ArtificialStackFrames = 0;
    private util.h.xy.ai.mn.ma isOutputSupportedForhNQ4ISI = null;
    private util.h.xy.ai.mn.ma getOutputMinFrameDuration = null;
    private util.h.xy.ai.mn.ma getOutputStallDuration = null;
    private util.h.xy.ai.mn.ma getOutputMinFrameDurationlomOqCM = null;
    private util.h.xy.ai.mn.ma toString = null;
    private util.h.xy.ai.mn.ma getOutputSizes = null;

    protected final void finalize() {
        getHighSpeedVideoSizesFor = (getHighSpeedVideoFpsRanges + 77) % 128;
        m24747();
        getHighSpeedVideoSizesFor = (getHighSpeedVideoFpsRanges + 117) % 128;
    }

    final class ma extends com.sun.jna.Memory {
        private static int getHighSpeedVideoFpsRanges = 0;
        private static int getHighSpeedVideoSizes = 1;

        public ma(long j) {
            super(j);
        }

        @Override // com.sun.jna.Memory
        public final void dispose() {
            int i = getHighSpeedVideoFpsRanges + 77;
            getHighSpeedVideoSizes = i % 128;
            if (i % 2 != 0) {
                super.dispose();
            } else {
                super.dispose();
                throw new java.lang.ArithmeticException();
            }
        }
    }

    private static int getHighSpeedVideoSizes() {
        int i = getHighSpeedVideoFpsRanges + 121;
        int i2 = i % 128;
        getHighSpeedVideoSizesFor = i2;
        int i3 = i % 2 != 0 ? 52 : 84;
        int i4 = i2 + 111;
        getHighSpeedVideoFpsRanges = i4 % 128;
        if (i4 % 2 != 0) {
            return i3;
        }
        throw null;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    protected final void m24736() {
        int i = getHighSpeedVideoSizesFor;
        getHighSpeedVideoFpsRanges = (i + 9) % 128;
        util.h.xy.ai.mn.ma maVar = this.getValidOutputFormatsForInputhNQ4ISI;
        if (maVar != null) {
            int i2 = i + 15;
            getHighSpeedVideoFpsRanges = i2 % 128;
            try {
                if (i2 % 2 != 0) {
                    maVar.dispose();
                } else {
                    maVar.dispose();
                    throw null;
                }
            } finally {
                this.getValidOutputFormatsForInputhNQ4ISI = null;
            }
        }
        util.h.xy.ai.mn.ma maVar2 = this.unwrapAs;
        if (maVar2 != null) {
            try {
                maVar2.dispose();
            } finally {
                this.unwrapAs = null;
            }
        }
        util.h.xy.ai.mn.ma maVar3 = this.isOutputSupportedFor;
        if (maVar3 != null) {
            try {
                maVar3.dispose();
            } finally {
                this.isOutputSupportedFor = null;
            }
        }
    }

    private util.h.xy.ai.mn.ma Camera2StreamConfigurationMap(long j) {
        util.h.xy.ai.mn.ma maVar = new util.h.xy.ai.mn.ma(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        byte[] bArr = new byte[com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)];
        for (int i = 0; i < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i++) {
            int i2 = i * 8;
            bArr[i] = (byte) (((255 << i2) & j) >> i2);
        }
        int i3 = 724432700;
        for (int i4 = 0; i4 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i4++) {
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizesFor + 121) % 128;
            byte b = bArr[i4];
            bArr[i4] = (byte) (((byte) (i3 & 255)) ^ b);
            i3 = ((i3 << (i4 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))) | (i3 >>> (((com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8) - 1) - (i4 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))))) * (~(b & 255));
        }
        long j2 = 0;
        for (int i5 = 0; i5 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i5++) {
            getHighSpeedVideoSizesFor = (getHighSpeedVideoFpsRanges + 17) % 128;
            j2 |= (bArr[i5] & 255) << (i5 * 8);
        }
        maVar.setLong(0L, j2);
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizesFor + 5) % 128;
        return maVar;
    }

    private static void Camera2StreamConfigurationMap(int i, java.lang.String str, java.lang.Object[] objArr) {
        int i2 = (Camera2StreamConfigurationMap + 59) % 128;
        getHighSpeedVideoSizes = i2;
        int i3 = i2 + 49;
        Camera2StreamConfigurationMap = i3 % 128;
        if (i3 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        byte[] bytes = str.getBytes("ISO-8859-1");
        util.h.xz.b.md mdVar = new util.h.xz.b.md();
        char[] cArr = getHighSpeedVideoFpsRangesFor;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i4 = 0; i4 < length; i4++) {
                cArr2[i4] = (char) (cArr[i4] ^ (-3299939579226817547L));
            }
            Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 35) % 128;
            cArr = cArr2;
        }
        int i5 = (int) ((-3299939579226817547L) ^ getHighResolutionOutputSizeshNQ4ISI);
        if (!getInputSizeshNQ4ISI) {
            if (!getInputFormats) {
                throw null;
            }
            getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 47) % 128;
            throw null;
        }
        getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 61) % 128;
        mdVar.f2642 = bytes.length;
        char[] cArr3 = new char[mdVar.f2642];
        mdVar.f2643 = 0;
        while (mdVar.f2643 < mdVar.f2642) {
            cArr3[mdVar.f2643] = (char) (cArr[bytes[(mdVar.f2642 - 1) - mdVar.f2643] + i] - i5);
            mdVar.f2643++;
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m24741() {
        util.h.xy.ai.mn.ma maVar = this.getValidOutputFormatsForInputhNQ4ISI;
        if (maVar != null) {
            try {
                maVar.dispose();
                this.getValidOutputFormatsForInputhNQ4ISI = null;
                getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizesFor + 69) % 128;
            } catch (java.lang.Throwable th) {
                this.getValidOutputFormatsForInputhNQ4ISI = null;
                throw th;
            }
        }
        int i = com.sun.jna.Native.POINTER_SIZE;
        int i2 = getHighSpeedVideoFpsRanges + 115;
        getHighSpeedVideoSizesFor = i2 % 128;
        this.getValidOutputFormatsForInputhNQ4ISI = new util.h.xy.ai.mn.ma(i + (i2 % 2 != 0 ? 72 : 101));
        util.h.xy.ai.mn.ma maVar2 = this.unwrapAs;
        if (maVar2 != null) {
            int i3 = getHighSpeedVideoFpsRanges + 71;
            getHighSpeedVideoSizesFor = i3 % 128;
            try {
                if (i3 % 2 == 0) {
                    maVar2.dispose();
                } else {
                    maVar2.dispose();
                    this.unwrapAs = null;
                    throw new java.lang.ArithmeticException();
                }
            } finally {
                this.unwrapAs = null;
            }
        }
        util.h.xy.ai.mn.ma maVar3 = new util.h.xy.ai.mn.ma(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        this.unwrapAs = maVar3;
        maVar3.setPointer(0L, new com.sun.jna.Pointer(com.sun.jna.Pointer.nativeValue(this.getValidOutputFormatsForInputhNQ4ISI) + getHighSpeedVideoSizes()));
        util.h.xy.ai.mn.ma maVar4 = this.isOutputSupportedFor;
        if (maVar4 != null) {
            try {
                maVar4.dispose();
            } finally {
                this.isOutputSupportedFor = null;
            }
        }
        this.isOutputSupportedFor = Camera2StreamConfigurationMap(com.sun.jna.Pointer.nativeValue(this.unwrapAs));
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final com.sun.jna.Pointer m24739() {
        int i = getHighSpeedVideoSizesFor;
        int i2 = i + 65;
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        if (this.getValidOutputFormatsForInputhNQ4ISI == null) {
            int i3 = i + 53;
            getHighSpeedVideoFpsRanges = i3 % 128;
            if (i3 % 2 != 0) {
                m24741();
            } else {
                m24741();
                throw null;
            }
        }
        com.sun.jna.Pointer pointer = this.getValidOutputFormatsForInputhNQ4ISI.getPointer(getHighSpeedVideoSizes());
        getHighSpeedVideoSizesFor = (getHighSpeedVideoFpsRanges + 29) % 128;
        return pointer;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    protected final void m24745() {
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizesFor + 91) % 128;
        util.h.xy.ai.mn.ma maVar = this.getOutputSizeshNQ4ISI;
        if (maVar != null) {
            try {
                maVar.dispose();
            } finally {
                this.getOutputSizeshNQ4ISI = null;
            }
        }
        util.h.xy.ai.mn.ma maVar2 = this.getOutputStallDurationlomOqCM;
        if (maVar2 != null) {
            int i = getHighSpeedVideoSizesFor + 119;
            getHighSpeedVideoFpsRanges = i % 128;
            try {
                if (i % 2 == 0) {
                    maVar2.dispose();
                    this.getOutputStallDurationlomOqCM = null;
                    throw new java.lang.ArithmeticException();
                }
                maVar2.dispose();
            } finally {
                this.getOutputStallDurationlomOqCM = null;
            }
        }
        util.h.xy.ai.mn.ma maVar3 = this.getOutputFormats;
        if (maVar3 != null) {
            try {
                maVar3.dispose();
            } finally {
                this.getOutputFormats = null;
            }
        }
        int i2 = getHighSpeedVideoFpsRanges + 89;
        getHighSpeedVideoSizesFor = i2 % 128;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m24746(int i) {
        int i2 = (getHighSpeedVideoSizesFor + 41) % 128;
        getHighSpeedVideoFpsRanges = i2;
        this.coroutineBoundary = i;
        util.h.xy.ai.mn.ma maVar = this.getOutputSizeshNQ4ISI;
        if (maVar != null) {
            int i3 = i2 + 41;
            getHighSpeedVideoSizesFor = i3 % 128;
            try {
                if (i3 % 2 != 0) {
                    maVar.dispose();
                    this.getOutputSizeshNQ4ISI = null;
                    throw new java.lang.ArithmeticException();
                }
                maVar.dispose();
            } finally {
                this.getOutputSizeshNQ4ISI = null;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE) * i;
        int i4 = getHighSpeedVideoSizesFor + 57;
        getHighSpeedVideoFpsRanges = i4 % 128;
        this.getOutputSizeshNQ4ISI = new util.h.xy.ai.mn.ma(nativeSize + (i4 % 2 == 0 ? 7845 : 153));
        util.h.xy.ai.mn.ma maVar2 = this.getOutputStallDurationlomOqCM;
        if (maVar2 != null) {
            try {
                maVar2.dispose();
            } finally {
                this.getOutputStallDurationlomOqCM = null;
            }
        }
        util.h.xy.ai.mn.ma maVar3 = new util.h.xy.ai.mn.ma(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        this.getOutputStallDurationlomOqCM = maVar3;
        long nativeValue = com.sun.jna.Pointer.nativeValue(this.getOutputSizeshNQ4ISI);
        int i5 = getHighSpeedVideoSizesFor + 105;
        getHighSpeedVideoFpsRanges = i5 % 128;
        maVar3.setPointer(0L, new com.sun.jna.Pointer(nativeValue + (i5 % 2 == 0 ? 31 : 102)));
        util.h.xy.ai.mn.ma maVar4 = this.getOutputFormats;
        if (maVar4 != null) {
            try {
                maVar4.dispose();
            } finally {
                this.getOutputFormats = null;
            }
        }
        long nativeValue2 = com.sun.jna.Pointer.nativeValue(this.getOutputStallDurationlomOqCM);
        util.h.xy.ai.mn.ma maVar5 = new util.h.xy.ai.mn.ma(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        maVar5.setLong(0L, nativeValue2 ^ 30979539);
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizesFor + 7) % 128;
        this.getOutputFormats = maVar5;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m24743(com.sun.jna.Pointer pointer) {
        util.h.xy.ai.mn.ma maVar;
        long j;
        int i = getHighSpeedVideoFpsRanges + 35;
        getHighSpeedVideoSizesFor = i % 128;
        if (i % 2 != 0) {
            m24746(com.sun.jna.Native.POINTER_SIZE);
            maVar = this.getOutputStallDurationlomOqCM;
            j = 1;
        } else {
            m24746(com.sun.jna.Native.POINTER_SIZE);
            maVar = this.getOutputStallDurationlomOqCM;
            j = 0;
        }
        maVar.setPointer(j, pointer);
    }

    private static int Camera2StreamConfigurationMap() {
        int i = getHighSpeedVideoSizesFor;
        int i2 = i + 69;
        getHighSpeedVideoFpsRanges = i2 % 128;
        int i3 = i2 % 2 == 0 ? 61 : 72;
        int i4 = i + 11;
        getHighSpeedVideoFpsRanges = i4 % 128;
        if (i4 % 2 != 0) {
            return i3;
        }
        throw null;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    protected final void m24738() {
        int i = getHighSpeedVideoSizesFor + 97;
        int i2 = i % 128;
        getHighSpeedVideoFpsRanges = i2;
        if (i % 2 == 0) {
            throw null;
        }
        util.h.xy.ai.mn.ma maVar = this.isOutputSupportedForhNQ4ISI;
        if (maVar != null) {
            getHighSpeedVideoSizesFor = (i2 + 19) % 128;
            try {
                maVar.dispose();
                this.isOutputSupportedForhNQ4ISI = null;
                getHighSpeedVideoSizesFor = (getHighSpeedVideoFpsRanges + 119) % 128;
            } catch (java.lang.Throwable th) {
                this.isOutputSupportedForhNQ4ISI = null;
                throw th;
            }
        }
        util.h.xy.ai.mn.ma maVar2 = this.getOutputMinFrameDuration;
        if (maVar2 != null) {
            int i3 = getHighSpeedVideoSizesFor + 71;
            getHighSpeedVideoFpsRanges = i3 % 128;
            try {
                if (i3 % 2 == 0) {
                    maVar2.dispose();
                    throw null;
                }
                maVar2.dispose();
            } finally {
                this.getOutputMinFrameDuration = null;
            }
        }
        util.h.xy.ai.mn.ma maVar3 = this.getOutputStallDuration;
        if (maVar3 != null) {
            try {
                maVar3.dispose();
            } finally {
                this.getOutputStallDuration = null;
            }
        }
    }

    private util.h.xy.ai.mn.ma getHighSpeedVideoFpsRanges(long j) {
        util.h.xy.ai.mn.ma maVar = new util.h.xy.ai.mn.ma(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        byte[] bArr = new byte[com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)];
        int i = 0;
        while (i < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)) {
            int i2 = (getHighSpeedVideoSizesFor + 121) % 128;
            getHighSpeedVideoFpsRanges = i2;
            int i3 = i * 8;
            bArr[i] = (byte) (((255 << i3) & j) >> i3);
            i++;
            getHighSpeedVideoSizesFor = (i2 + 33) % 128;
        }
        int i4 = 99317671;
        for (int i5 = 0; i5 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i5++) {
            byte b = bArr[i5];
            bArr[i5] = (byte) (((byte) (i4 & 255)) ^ b);
            i4 = ((i4 << (i5 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))) | (i4 >>> (((com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8) - 1) - (i5 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))))) * (~(b & 255));
        }
        long j2 = 0;
        for (int i6 = 0; i6 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i6++) {
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizesFor + 39) % 128;
            j2 |= (bArr[i6] & 255) << (i6 * 8);
        }
        maVar.setLong(0L, j2);
        return maVar;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m24742(int i) {
        int i2 = getHighSpeedVideoSizesFor;
        int i3 = i2 + 31;
        getHighSpeedVideoFpsRanges = i3 % 128;
        if (i3 % 2 == 0) {
            this.ArtificialStackFrames = i;
            throw null;
        }
        this.ArtificialStackFrames = i;
        util.h.xy.ai.mn.ma maVar = this.isOutputSupportedForhNQ4ISI;
        if (maVar != null) {
            int i4 = i2 + 17;
            getHighSpeedVideoFpsRanges = i4 % 128;
            try {
                if (i4 % 2 == 0) {
                    maVar.dispose();
                    this.isOutputSupportedForhNQ4ISI = null;
                    throw new java.lang.ArithmeticException();
                }
                maVar.dispose();
            } finally {
                this.isOutputSupportedForhNQ4ISI = null;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE) * i;
        int i5 = getHighSpeedVideoSizesFor + 115;
        getHighSpeedVideoFpsRanges = i5 % 128;
        this.isOutputSupportedForhNQ4ISI = new util.h.xy.ai.mn.ma(nativeSize + (i5 % 2 == 0 ? 81 : 111));
        util.h.xy.ai.mn.ma maVar2 = this.getOutputMinFrameDuration;
        if (maVar2 != null) {
            try {
                maVar2.dispose();
                this.getOutputMinFrameDuration = null;
                getHighSpeedVideoSizesFor = (getHighSpeedVideoFpsRanges + 115) % 128;
            } catch (java.lang.Throwable th) {
                this.getOutputMinFrameDuration = null;
                throw th;
            }
        }
        util.h.xy.ai.mn.ma maVar3 = new util.h.xy.ai.mn.ma(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        this.getOutputMinFrameDuration = maVar3;
        maVar3.setPointer(0L, new com.sun.jna.Pointer(com.sun.jna.Pointer.nativeValue(this.isOutputSupportedForhNQ4ISI) + Camera2StreamConfigurationMap()));
        util.h.xy.ai.mn.ma maVar4 = this.getOutputStallDuration;
        if (maVar4 != null) {
            try {
                maVar4.dispose();
            } finally {
                this.getOutputStallDuration = null;
            }
        }
        this.getOutputStallDuration = getHighSpeedVideoFpsRanges(com.sun.jna.Pointer.nativeValue(this.getOutputMinFrameDuration));
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m24740(java.lang.String str) throws java.io.IOException {
        int i = getHighSpeedVideoSizesFor + 67;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 != 0) {
            m24737(str, java.nio.charset.Charset.defaultCharset());
        } else {
            m24737(str, java.nio.charset.Charset.defaultCharset());
            throw null;
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    protected final void m24737(java.lang.String str, java.nio.charset.Charset charset) throws java.io.IOException {
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizesFor + 77) % 128;
        byte[] bytes = str.getBytes(charset);
        m24742(bytes.length + 1);
        this.isOutputSupportedForhNQ4ISI.write(Camera2StreamConfigurationMap(), bytes, 0, bytes.length);
        this.isOutputSupportedForhNQ4ISI.setByte(bytes.length + Camera2StreamConfigurationMap(), (byte) 0);
        int i = getHighSpeedVideoSizesFor + 23;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    protected final void m24735() {
        int i = getHighSpeedVideoSizesFor;
        getHighSpeedVideoFpsRanges = (i + 43) % 128;
        util.h.xy.ai.mn.ma maVar = this.getOutputMinFrameDurationlomOqCM;
        if (maVar != null) {
            int i2 = i + 15;
            getHighSpeedVideoFpsRanges = i2 % 128;
            try {
                if (i2 % 2 == 0) {
                    maVar.dispose();
                    throw null;
                }
                maVar.dispose();
            } finally {
                this.getOutputMinFrameDurationlomOqCM = null;
            }
        }
        util.h.xy.ai.mn.ma maVar2 = this.toString;
        if (maVar2 != null) {
            getHighSpeedVideoSizesFor = (getHighSpeedVideoFpsRanges + 95) % 128;
            try {
                maVar2.dispose();
            } finally {
                this.toString = null;
            }
        }
        util.h.xy.ai.mn.ma maVar3 = this.getOutputSizes;
        if (maVar3 != null) {
            try {
                maVar3.dispose();
                this.getOutputSizes = null;
                getHighSpeedVideoSizesFor = (getHighSpeedVideoFpsRanges + 101) % 128;
            } catch (java.lang.Throwable th) {
                this.getOutputSizes = null;
                throw th;
            }
        }
    }

    /* renamed from: ͺ, reason: contains not printable characters */
    public final int m24744() throws java.io.IOException {
        if (this.isOutputSupportedFor != null && this.getOutputFormats != null) {
            int i = getHighSpeedVideoFpsRanges;
            int i2 = i + 69;
            getHighSpeedVideoSizesFor = i2 % 128;
            if (i2 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
            if (this.getOutputStallDuration != null) {
                getHighSpeedVideoSizesFor = (i + 85) % 128;
                util.h.xy.ai.mn.ma maVar = this.getOutputMinFrameDurationlomOqCM;
                if (maVar != null) {
                    try {
                        maVar.dispose();
                    } finally {
                        this.getOutputMinFrameDurationlomOqCM = null;
                    }
                }
                int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE);
                int i3 = (getHighSpeedVideoSizesFor + 69) % 128;
                getHighSpeedVideoFpsRanges = i3;
                getHighSpeedVideoSizesFor = (i3 + 51) % 128;
                this.getOutputMinFrameDurationlomOqCM = new util.h.xy.ai.mn.ma(nativeSize + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
                util.h.xy.ai.mn.ma maVar2 = this.toString;
                if (maVar2 != null) {
                    getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizesFor + 71) % 128;
                    try {
                        maVar2.dispose();
                    } finally {
                        this.toString = null;
                    }
                }
                util.h.xy.ai.mn.ma maVar3 = new util.h.xy.ai.mn.ma(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
                this.toString = maVar3;
                long nativeValue = com.sun.jna.Pointer.nativeValue(this.getOutputMinFrameDurationlomOqCM);
                int i4 = getHighSpeedVideoFpsRanges + 93;
                getHighSpeedVideoSizesFor = i4 % 128;
                maVar3.setPointer(0L, new com.sun.jna.Pointer(nativeValue + (i4 % 2 != 0 ? 26 : 84)));
                util.h.xy.ai.mn.ma maVar4 = this.getOutputSizes;
                if (maVar4 != null) {
                    try {
                        maVar4.dispose();
                    } finally {
                        this.getOutputSizes = null;
                    }
                }
                long nativeValue2 = com.sun.jna.Pointer.nativeValue(this.toString);
                util.h.xy.ai.mn.ma maVar5 = new util.h.xy.ai.mn.ma(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
                maVar5.setLong(0L, nativeValue2 ^ 656094568);
                int i5 = getHighSpeedVideoSizesFor + 117;
                getHighSpeedVideoFpsRanges = i5 % 128;
                if (i5 % 2 == 0) {
                    throw new java.lang.ArithmeticException();
                }
                this.getOutputSizes = maVar5;
                util.h.xy.ai.mi.getHighSpeedVideoFpsRanges._LwnbKq4C3Hfj9aWfEWKt8Gf6BuR8xEG9L(this.getOutputSizes, this.isOutputSupportedFor, this.getOutputFormats, this.getOutputStallDuration);
                int[] iArr = new int[1];
                util.h.xy.ai.mn.ma maVar6 = this.getOutputMinFrameDurationlomOqCM;
                int i6 = getHighSpeedVideoFpsRanges + 93;
                getHighSpeedVideoSizesFor = i6 % 128;
                maVar6.read(i6 % 2 == 0 ? 84 : 26, iArr, 0, 1);
                int i7 = iArr[0];
                getHighSpeedVideoSizesFor = (getHighSpeedVideoFpsRanges + 19) % 128;
                return i7;
            }
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        Camera2StreamConfigurationMap((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 126, "\u0084\u0083\u008a\u008d\u0091\u0085\u0083\u008c\u008e\u0090\u0084\u008b\u0081\u0085\u008f\u008e\u008d\u0084\u0087\u008a\u0087\u0088\u0086\u008b\u008c\u0085\u0083\u008a\u008b\u0084\u008b\u0081\u0087\u008a\u0087\u0089\u0085\u0088\u0088\u0087\u0085\u0088\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr);
        throw new java.io.IOException(((java.lang.String) objArr[0]).intern());
    }

    /* renamed from: ι, reason: contains not printable characters */
    public final void m24747() {
        getHighSpeedVideoSizesFor = (getHighSpeedVideoFpsRanges + 3) % 128;
        m24736();
        m24745();
        m24738();
        m24735();
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizesFor + 27) % 128;
    }
}
