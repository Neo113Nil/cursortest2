package util.h.xy.ai;

/* loaded from: classes18.dex */
public final class re {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static char[] getHighSpeedVideoFpsRanges = {58937, 31823, 54011, 10602, 36812, 57873, 30881, 57146, 13640, 35754, 61035, 17547, 56072, 12685, 37925, 59986, 16580, 42863, 15772, 36924, 63157, 19750, 41797, 14836, 40049, 62092, 18718, 44971, 558, 39025, 65241, 21884, 44017, 3674, 25774, 64311, 20830, 47041, 2676, 32887, 6657, 46261, 20260, 59778, 33887, 7919, 47476, 21254, 60900, 34853, 8901, 48454, 22467, 62059, 35868, 9866, 49441, 23506, 63100, 37095, 11122, 50441, 24460, 64034, 38125, 12120, 51700, 25680, 65049, 39064, 13102, 52671, 26694, 725, 40313, 14104, 53657, 27758, 1726, 41283, 15350, 54885, 28692, 46850, 11636, 33728, 30801, 57079, 45866, 10650, 36353, 25715, 55953, 48962, 5561, 35371, 24793, 50459, 47996, 4605, 63040, 27838, 49440, 42883, 7180, 62057, 26878, 52511, 41909, 6182, 65174, 21259, 51576, 45049, 1116, 64219, 24360, 13724, 43531, '7', 59108, 23390, 12761, 38455, 3230, 57607, 18278, 15783, 37471, 2242, 60719, 17340, 14357};
    private static long getHighSpeedVideoFpsRangesFor = -7513205182262409617L;
    private static int getHighSpeedVideoSizes = 1;
    private static int getOutputFormats = 1;
    private int _BOUNDARY = 0;
    private util.h.xy.ai.re.b getValidOutputFormatsForInputhNQ4ISI = null;
    private util.h.xy.ai.re.b isOutputSupportedFor = null;
    private util.h.xy.ai.re.b getOutputStallDurationlomOqCM = null;
    private util.h.xy.ai.re.b isOutputSupportedForhNQ4ISI = null;
    private util.h.xy.ai.re.b getInputFormats = null;
    private int getHighSpeedVideoSizesFor = 0;
    private util.h.xy.ai.re.b CoroutineDebuggingKt = null;
    private util.h.xy.ai.re.b getInputSizeshNQ4ISI = null;
    private util.h.xy.ai.re.b kernelVersion = null;
    private util.h.xy.ai.re.b toString = null;
    private util.h.xy.ai.re.b getOutputStallDuration = null;
    private int getOutputSizeshNQ4ISI = 0;
    private util.h.xy.ai.re.b getOutputSizes = null;
    private util.h.xy.ai.re.b getOutputMinFrameDurationlomOqCM = null;
    private util.h.xy.ai.re.b accessartificialFrame = null;
    private util.h.xy.ai.re.b unwrapAs = null;
    private util.h.xy.ai.re.b _CREATION = null;
    private int getARTIFICIAL_FRAME_PACKAGE_NAME = 0;
    private util.h.xy.ai.re.b ArtificialStackFrames = null;
    private util.h.xy.ai.re.b coroutineBoundary = null;
    private util.h.xy.ai.re.b c = null;
    private int d = 0;
    private util.h.xy.ai.re.b coroutineCreation = null;
    private util.h.xy.ai.re.b getOutputMinFrameDuration = null;
    private util.h.xy.ai.re.b init = null;

    /* renamed from: a, reason: collision with root package name */
    private util.h.xy.ai.re.b f7075a = null;
    private util.h.xy.ai.re.b b = null;
    private util.h.xy.ai.re.b AMEXKernel = null;

    protected final void finalize() {
        getOutputFormats = (Camera2StreamConfigurationMap + 97) % 128;
        m24879();
        int i = Camera2StreamConfigurationMap + 67;
        getOutputFormats = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    final class b extends com.sun.jna.Memory {
        private static int Camera2StreamConfigurationMap = 1;
        private static int getHighSpeedVideoSizes;

        public b(long j) {
            super(j);
        }

        @Override // com.sun.jna.Memory
        public final void dispose() {
            getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 43) % 128;
            super.dispose();
            int i = getHighSpeedVideoSizes;
            int i2 = ((i | 103) << 1) - (i ^ 103);
            Camera2StreamConfigurationMap = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        }
    }

    private static int getHighSpeedVideoSizes() {
        int i = getOutputFormats;
        int i2 = i + 99;
        Camera2StreamConfigurationMap = i2 % 128;
        int i3 = i2 % 2 != 0 ? 24 : 76;
        Camera2StreamConfigurationMap = (i + 57) % 128;
        return i3;
    }

    private static void getHighSpeedVideoFpsRangesFor(int i, int i2, char c, java.lang.Object[] objArr) {
        util.h.xz.b.rb rbVar = new util.h.xz.b.rb();
        long[] jArr = new long[i];
        rbVar.f2651 = 0;
        while (rbVar.f2651 < i) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 73) % 128;
            jArr[rbVar.f2651] = (((char) (getHighSpeedVideoFpsRanges[rbVar.f2651 + i2] ^ 3446303986615426049L)) ^ (rbVar.f2651 * (3446303986615426049L ^ getHighSpeedVideoFpsRangesFor))) ^ c;
            rbVar.f2651++;
        }
        char[] cArr = new char[i];
        rbVar.f2651 = 0;
        while (rbVar.f2651 < i) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 23) % 128;
            cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
            rbVar.f2651++;
        }
        java.lang.String str = new java.lang.String(cArr);
        getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 79) % 128;
        objArr[0] = str;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    protected final void m24877() {
        util.h.xy.ai.re.b bVar = this.getValidOutputFormatsForInputhNQ4ISI;
        if (bVar != null) {
            try {
                bVar.dispose();
                this.getValidOutputFormatsForInputhNQ4ISI = null;
                getOutputFormats = (Camera2StreamConfigurationMap + 69) % 128;
            } catch (java.lang.Throwable th) {
                this.getValidOutputFormatsForInputhNQ4ISI = null;
                throw th;
            }
        }
        util.h.xy.ai.re.b bVar2 = this.isOutputSupportedFor;
        if (bVar2 != null) {
            try {
                bVar2.dispose();
            } finally {
                this.isOutputSupportedFor = null;
            }
        }
        util.h.xy.ai.re.b bVar3 = this.getOutputStallDurationlomOqCM;
        if (bVar3 != null) {
            try {
                bVar3.dispose();
            } finally {
                this.getOutputStallDurationlomOqCM = null;
            }
        }
        int i = getOutputFormats + 103;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m24878(int i) {
        int i2 = Camera2StreamConfigurationMap + 57;
        getOutputFormats = i2 % 128;
        if (i2 % 2 != 0) {
            this._BOUNDARY = i;
            util.h.xy.ai.re.b bVar = this.getValidOutputFormatsForInputhNQ4ISI;
            if (bVar != null) {
                try {
                    bVar.dispose();
                } finally {
                    this.getValidOutputFormatsForInputhNQ4ISI = null;
                }
            }
            int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE) * i;
            int i3 = (getOutputFormats + 19) % 128;
            Camera2StreamConfigurationMap = i3;
            getOutputFormats = (i3 + 95) % 128;
            this.getValidOutputFormatsForInputhNQ4ISI = new util.h.xy.ai.re.b(nativeSize + 105);
            util.h.xy.ai.re.b bVar2 = this.isOutputSupportedFor;
            if (bVar2 != null) {
                Camera2StreamConfigurationMap = (getOutputFormats + 85) % 128;
                try {
                    bVar2.dispose();
                } finally {
                    this.isOutputSupportedFor = null;
                }
            }
            util.h.xy.ai.re.b bVar3 = new util.h.xy.ai.re.b(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
            this.isOutputSupportedFor = bVar3;
            bVar3.setPointer(0L, new com.sun.jna.Pointer(com.sun.jna.Pointer.nativeValue(this.getValidOutputFormatsForInputhNQ4ISI) + getHighSpeedVideoSizes()));
            util.h.xy.ai.re.b bVar4 = this.getOutputStallDurationlomOqCM;
            if (bVar4 != null) {
                try {
                    bVar4.dispose();
                } finally {
                    this.getOutputStallDurationlomOqCM = null;
                }
            }
            long nativeValue = com.sun.jna.Pointer.nativeValue(this.isOutputSupportedFor);
            util.h.xy.ai.re.b bVar5 = new util.h.xy.ai.re.b(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
            byte[] bArr = new byte[com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)];
            Camera2StreamConfigurationMap = (getOutputFormats + 45) % 128;
            int i4 = 0;
            while (i4 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)) {
                int i5 = Camera2StreamConfigurationMap + 113;
                getOutputFormats = i5 % 128;
                if (i5 % 2 == 0) {
                    bArr[i4] = (byte) (((255 << (i4 << 105)) * nativeValue) << (i4 << 62));
                    i4 += 5;
                } else {
                    int i6 = i4 * 8;
                    bArr[i4] = (byte) (((255 << i6) & nativeValue) >> i6);
                    i4++;
                }
            }
            int i7 = 1570362428;
            for (int i8 = 0; i8 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i8++) {
                byte b2 = bArr[i8];
                bArr[i8] = (byte) (((byte) (i7 & 255)) ^ b2);
                i7 = ((i7 << (i8 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))) | (i7 >>> (((com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8) - 1) - (i8 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))))) * (~(b2 & 255));
            }
            long j = 0;
            for (int i9 = 0; i9 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i9++) {
                j |= (bArr[i9] & 255) << (i9 * 8);
            }
            bVar5.setLong(0L, j);
            int i10 = Camera2StreamConfigurationMap + 115;
            getOutputFormats = i10 % 128;
            if (i10 % 2 != 0) {
                this.getOutputStallDurationlomOqCM = bVar5;
                return;
            }
            throw null;
        }
        this._BOUNDARY = i;
        throw null;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m24889(byte[] bArr) throws java.io.IOException {
        Camera2StreamConfigurationMap = (getOutputFormats + 75) % 128;
        m24878(bArr.length);
        this.getValidOutputFormatsForInputhNQ4ISI.write(getHighSpeedVideoSizes(), bArr, 0, bArr.length);
        getOutputFormats = (Camera2StreamConfigurationMap + 71) % 128;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    protected final void m24880() {
        int i = getOutputFormats + 105;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 == 0) {
            util.h.xy.ai.re.b bVar = this.isOutputSupportedForhNQ4ISI;
            if (bVar != null) {
                try {
                    bVar.dispose();
                    this.isOutputSupportedForhNQ4ISI = null;
                    Camera2StreamConfigurationMap = (getOutputFormats + 27) % 128;
                } catch (java.lang.Throwable th) {
                    this.isOutputSupportedForhNQ4ISI = null;
                    throw th;
                }
            }
            util.h.xy.ai.re.b bVar2 = this.getInputFormats;
            if (bVar2 != null) {
                try {
                    bVar2.dispose();
                    this.getInputFormats = null;
                    getOutputFormats = (Camera2StreamConfigurationMap + 77) % 128;
                    return;
                } catch (java.lang.Throwable th2) {
                    this.getInputFormats = null;
                    throw th2;
                }
            }
            return;
        }
        throw null;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m24884(int i) {
        util.h.xy.ai.re.b bVar = this.isOutputSupportedForhNQ4ISI;
        if (bVar != null) {
            getOutputFormats = (Camera2StreamConfigurationMap + 43) % 128;
            try {
                bVar.dispose();
            } finally {
                this.isOutputSupportedForhNQ4ISI = null;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE);
        int i2 = getOutputFormats + 117;
        Camera2StreamConfigurationMap = i2 % 128;
        util.h.xy.ai.re.b bVar2 = new util.h.xy.ai.re.b(nativeSize + (i2 % 2 != 0 ? 4 : 111));
        this.isOutputSupportedForhNQ4ISI = bVar2;
        int i3 = getOutputFormats + 19;
        Camera2StreamConfigurationMap = i3 % 128;
        bVar2.setInt(i3 % 2 != 0 ? 57 : 70, i);
        util.h.xy.ai.re.b bVar3 = this.getInputFormats;
        if (bVar3 != null) {
            int i4 = getOutputFormats + 17;
            Camera2StreamConfigurationMap = i4 % 128;
            try {
                if (i4 % 2 != 0) {
                    bVar3.dispose();
                    throw null;
                }
                bVar3.dispose();
            } finally {
                this.getInputFormats = null;
            }
        }
        long nativeValue = com.sun.jna.Pointer.nativeValue(this.isOutputSupportedForhNQ4ISI);
        int i5 = getOutputFormats + 19;
        Camera2StreamConfigurationMap = i5 % 128;
        long j = nativeValue + (i5 % 2 == 0 ? 70 : 57);
        util.h.xy.ai.re.b bVar4 = new util.h.xy.ai.re.b(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        bVar4.setLong(0L, j ^ 47386826);
        getOutputFormats = (Camera2StreamConfigurationMap + 95) % 128;
        this.getInputFormats = bVar4;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    protected final void m24883() {
        getOutputFormats = (Camera2StreamConfigurationMap + 65) % 128;
        util.h.xy.ai.re.b bVar = this.CoroutineDebuggingKt;
        if (bVar != null) {
            try {
                bVar.dispose();
            } finally {
                this.CoroutineDebuggingKt = null;
            }
        }
        util.h.xy.ai.re.b bVar2 = this.getInputSizeshNQ4ISI;
        if (bVar2 != null) {
            int i = Camera2StreamConfigurationMap + 51;
            getOutputFormats = i % 128;
            try {
                if (i % 2 == 0) {
                    bVar2.dispose();
                    this.getInputSizeshNQ4ISI = null;
                    throw new java.lang.ArithmeticException();
                }
                bVar2.dispose();
                this.getInputSizeshNQ4ISI = null;
                Camera2StreamConfigurationMap = (getOutputFormats + 13) % 128;
            } catch (java.lang.Throwable th) {
                this.getInputSizeshNQ4ISI = null;
                throw th;
            }
        }
        util.h.xy.ai.re.b bVar3 = this.kernelVersion;
        if (bVar3 != null) {
            getOutputFormats = (Camera2StreamConfigurationMap + 35) % 128;
            try {
                bVar3.dispose();
            } finally {
                this.kernelVersion = null;
            }
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m24888(int i) {
        this.getHighSpeedVideoSizesFor = i;
        util.h.xy.ai.re.b bVar = this.CoroutineDebuggingKt;
        if (bVar != null) {
            Camera2StreamConfigurationMap = (getOutputFormats + 47) % 128;
            try {
                bVar.dispose();
            } finally {
                this.CoroutineDebuggingKt = null;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE) * i;
        int i2 = Camera2StreamConfigurationMap + 113;
        int i3 = i2 % 128;
        getOutputFormats = i3;
        int i4 = i2 % 2 == 0 ? 12551 : 149;
        getOutputFormats = i3;
        this.CoroutineDebuggingKt = new util.h.xy.ai.re.b(nativeSize + i4);
        util.h.xy.ai.re.b bVar2 = this.getInputSizeshNQ4ISI;
        if (bVar2 != null) {
            try {
                bVar2.dispose();
            } finally {
                this.getInputSizeshNQ4ISI = null;
            }
        }
        util.h.xy.ai.re.b bVar3 = new util.h.xy.ai.re.b(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        this.getInputSizeshNQ4ISI = bVar3;
        long nativeValue = com.sun.jna.Pointer.nativeValue(this.CoroutineDebuggingKt);
        int i5 = getOutputFormats;
        Camera2StreamConfigurationMap = (i5 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        Camera2StreamConfigurationMap = (i5 + 17) % 128;
        bVar3.setPointer(0L, new com.sun.jna.Pointer(nativeValue + 96));
        util.h.xy.ai.re.b bVar4 = this.kernelVersion;
        if (bVar4 != null) {
            try {
                bVar4.dispose();
            } finally {
                this.kernelVersion = null;
            }
        }
        long nativeValue2 = com.sun.jna.Pointer.nativeValue(this.getInputSizeshNQ4ISI);
        util.h.xy.ai.re.b bVar5 = new util.h.xy.ai.re.b(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        byte[] bArr = new byte[com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)];
        int i6 = 0;
        while (i6 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)) {
            int i7 = getOutputFormats + 69;
            Camera2StreamConfigurationMap = i7 % 128;
            if (i7 % 2 != 0) {
                bArr[i6] = (byte) ((nativeValue2 / (255 >>> (i6 * 40))) >>> (i6 * 16));
                i6 += 33;
            } else {
                int i8 = i6 * 8;
                bArr[i6] = (byte) (((255 << i8) & nativeValue2) >> i8);
                i6++;
            }
        }
        int i9 = 1433686164;
        for (int i10 = 0; i10 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i10++) {
            getOutputFormats = (Camera2StreamConfigurationMap + 87) % 128;
            byte b2 = bArr[i10];
            bArr[i10] = (byte) (((byte) (i9 & 255)) ^ b2);
            i9 = ((i9 << (i10 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))) | (i9 >>> (((com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8) - 1) - (i10 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))))) * (~(b2 & 255));
        }
        long j = 0;
        for (int i11 = 0; i11 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i11++) {
            j |= (bArr[i11] & 255) << (i11 * 8);
        }
        bVar5.setLong(0L, j);
        int i12 = getOutputFormats;
        int i13 = i12 + 63;
        Camera2StreamConfigurationMap = i13 % 128;
        if (i13 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        this.kernelVersion = bVar5;
        Camera2StreamConfigurationMap = (i12 + 107) % 128;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m24885(byte[] bArr) throws java.io.IOException {
        int i = getOutputFormats + 89;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 != 0) {
            m24888(bArr.length);
            util.h.xy.ai.re.b bVar = this.CoroutineDebuggingKt;
            int i2 = getOutputFormats;
            Camera2StreamConfigurationMap = (i2 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
            Camera2StreamConfigurationMap = (i2 + 17) % 128;
            int i3 = 0 % 96;
            bVar.write(0L, bArr, 0, bArr.length);
        } else {
            m24888(bArr.length);
            util.h.xy.ai.re.b bVar2 = this.CoroutineDebuggingKt;
            int i4 = getOutputFormats;
            Camera2StreamConfigurationMap = (i4 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
            Camera2StreamConfigurationMap = (i4 + 17) % 128;
            bVar2.write(96L, bArr, 0, bArr.length);
        }
        Camera2StreamConfigurationMap = (getOutputFormats + 117) % 128;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    protected final void m24887() {
        util.h.xy.ai.re.b bVar = this.toString;
        if (bVar != null) {
            getOutputFormats = (Camera2StreamConfigurationMap + 29) % 128;
            try {
                bVar.dispose();
                this.toString = null;
                getOutputFormats = (Camera2StreamConfigurationMap + 95) % 128;
            } catch (java.lang.Throwable th) {
                this.toString = null;
                throw th;
            }
        }
        util.h.xy.ai.re.b bVar2 = this.getOutputStallDuration;
        if (bVar2 != null) {
            try {
                bVar2.dispose();
            } finally {
                this.getOutputStallDuration = null;
            }
        }
        getOutputFormats = (Camera2StreamConfigurationMap + 69) % 128;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m24875(int i) {
        util.h.xy.ai.re.b bVar = this.toString;
        if (bVar != null) {
            getOutputFormats = (Camera2StreamConfigurationMap + 3) % 128;
            try {
                bVar.dispose();
            } finally {
                this.toString = null;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE);
        int i2 = getOutputFormats + 95;
        Camera2StreamConfigurationMap = i2 % 128;
        util.h.xy.ai.re.b bVar2 = new util.h.xy.ai.re.b(nativeSize + (i2 % 2 != 0 ? 93 : 117));
        this.toString = bVar2;
        int i3 = Camera2StreamConfigurationMap + 3;
        getOutputFormats = i3 % 128;
        bVar2.setInt(i3 % 2 == 0 ? 116 : 100, i);
        util.h.xy.ai.re.b bVar3 = this.getOutputStallDuration;
        if (bVar3 != null) {
            try {
                bVar3.dispose();
                this.getOutputStallDuration = null;
                Camera2StreamConfigurationMap = (getOutputFormats + 63) % 128;
            } catch (java.lang.Throwable th) {
                this.getOutputStallDuration = null;
                throw th;
            }
        }
        long nativeValue = com.sun.jna.Pointer.nativeValue(this.toString);
        int i4 = Camera2StreamConfigurationMap + 3;
        getOutputFormats = i4 % 128;
        long j = nativeValue + (i4 % 2 != 0 ? 100 : 116);
        util.h.xy.ai.re.b bVar4 = new util.h.xy.ai.re.b(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        byte[] bArr = new byte[com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)];
        int i5 = 0;
        while (i5 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)) {
            int i6 = getOutputFormats + 103;
            Camera2StreamConfigurationMap = i6 % 128;
            if (i6 % 2 != 0) {
                bArr[i5] = (byte) (((255 >> (i5 % 68)) & j) >>> (i5 % 91));
                i5 += 25;
            } else {
                int i7 = i5 * 8;
                bArr[i5] = (byte) (((255 << i7) & j) >> i7);
                i5++;
            }
        }
        int i8 = 1434293148;
        for (int i9 = 0; i9 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i9++) {
            byte b2 = bArr[i9];
            bArr[i9] = (byte) (((byte) (i8 & 255)) ^ b2);
            i8 = ((i8 << (i9 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))) | (i8 >>> (((com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8) - 1) - (i9 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))))) * (~(b2 & 255));
        }
        long j2 = 0;
        for (int i10 = 0; i10 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i10++) {
            j2 |= (bArr[i10] & 255) << (i10 * 8);
        }
        bVar4.setLong(0L, j2);
        int i11 = getOutputFormats + 87;
        Camera2StreamConfigurationMap = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
        this.getOutputStallDuration = bVar4;
    }

    private static int getHighSpeedVideoFpsRanges() {
        int i = getOutputFormats;
        Camera2StreamConfigurationMap = (i + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        int i2 = i + 125;
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 == 0) {
            return 86;
        }
        throw null;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    protected final void m24874() {
        getOutputFormats = (Camera2StreamConfigurationMap + 103) % 128;
        util.h.xy.ai.re.b bVar = this.getOutputSizes;
        if (bVar != null) {
            try {
                bVar.dispose();
            } finally {
                this.getOutputSizes = null;
            }
        }
        util.h.xy.ai.re.b bVar2 = this.getOutputMinFrameDurationlomOqCM;
        if (bVar2 != null) {
            try {
                bVar2.dispose();
            } finally {
                this.getOutputMinFrameDurationlomOqCM = null;
            }
        }
        util.h.xy.ai.re.b bVar3 = this.accessartificialFrame;
        if (bVar3 != null) {
            try {
                bVar3.dispose();
            } finally {
                this.accessartificialFrame = null;
            }
        }
        int i = getOutputFormats + 89;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m24881(int i) {
        int i2 = getOutputFormats + 53;
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 != 0) {
            this.getOutputSizeshNQ4ISI = i;
            throw new java.lang.ArithmeticException();
        }
        this.getOutputSizeshNQ4ISI = i;
        util.h.xy.ai.re.b bVar = this.getOutputSizes;
        if (bVar != null) {
            try {
                bVar.dispose();
            } finally {
                this.getOutputSizes = null;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE) * i;
        int i3 = getOutputFormats;
        Camera2StreamConfigurationMap = (i3 + 25) % 128;
        int i4 = i3 + 109;
        Camera2StreamConfigurationMap = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        this.getOutputSizes = new util.h.xy.ai.re.b(nativeSize + 113);
        util.h.xy.ai.re.b bVar2 = this.getOutputMinFrameDurationlomOqCM;
        if (bVar2 != null) {
            try {
                bVar2.dispose();
            } finally {
                this.getOutputMinFrameDurationlomOqCM = null;
            }
        }
        util.h.xy.ai.re.b bVar3 = new util.h.xy.ai.re.b(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        this.getOutputMinFrameDurationlomOqCM = bVar3;
        long nativeValue = com.sun.jna.Pointer.nativeValue(this.getOutputSizes);
        getHighSpeedVideoFpsRanges();
        bVar3.setPointer(0L, new com.sun.jna.Pointer(nativeValue + 86));
        util.h.xy.ai.re.b bVar4 = this.accessartificialFrame;
        if (bVar4 != null) {
            try {
                bVar4.dispose();
            } finally {
                this.accessartificialFrame = null;
            }
        }
        long nativeValue2 = com.sun.jna.Pointer.nativeValue(this.getOutputMinFrameDurationlomOqCM);
        util.h.xy.ai.re.b bVar5 = new util.h.xy.ai.re.b(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        bVar5.setLong(0L, nativeValue2 ^ 673108839);
        int i5 = getOutputFormats;
        Camera2StreamConfigurationMap = (i5 + 7) % 128;
        this.accessartificialFrame = bVar5;
        int i6 = i5 + 115;
        Camera2StreamConfigurationMap = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m24876(byte[] bArr) throws java.io.IOException {
        getOutputFormats = (Camera2StreamConfigurationMap + 65) % 128;
        m24881(bArr.length);
        util.h.xy.ai.re.b bVar = this.getOutputSizes;
        getHighSpeedVideoFpsRanges();
        bVar.write(86L, bArr, 0, bArr.length);
        int i = Camera2StreamConfigurationMap + 117;
        getOutputFormats = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private static int getHighSpeedVideoFpsRangesFor() {
        int i = (Camera2StreamConfigurationMap + 73) % 128;
        getOutputFormats = i;
        int i2 = i + 33;
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 == 0) {
            return 80;
        }
        throw null;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    protected final void m24867() {
        util.h.xy.ai.re.b bVar = this.unwrapAs;
        if (bVar != null) {
            try {
                bVar.dispose();
                this.unwrapAs = null;
                Camera2StreamConfigurationMap = (getOutputFormats + 119) % 128;
            } catch (java.lang.Throwable th) {
                this.unwrapAs = null;
                throw th;
            }
        }
        util.h.xy.ai.re.b bVar2 = this._CREATION;
        if (bVar2 != null) {
            Camera2StreamConfigurationMap = (getOutputFormats + 31) % 128;
            try {
                bVar2.dispose();
                this._CREATION = null;
                Camera2StreamConfigurationMap = (getOutputFormats + 103) % 128;
            } catch (java.lang.Throwable th2) {
                this._CREATION = null;
                throw th2;
            }
        }
    }

    private util.h.xy.ai.re.b getHighSpeedVideoFpsRangesFor(long j) {
        util.h.xy.ai.re.b bVar = new util.h.xy.ai.re.b(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        byte[] bArr = new byte[com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)];
        Camera2StreamConfigurationMap = (getOutputFormats + 113) % 128;
        for (int i = 0; i < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i++) {
            int i2 = i * 8;
            bArr[i] = (byte) (((255 << i2) & j) >> i2);
        }
        int i3 = 1297616884;
        for (int i4 = 0; i4 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i4++) {
            byte b2 = bArr[i4];
            bArr[i4] = (byte) (((byte) (i3 & 255)) ^ b2);
            i3 = ((i3 << (i4 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))) | (i3 >>> (((com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8) - 1) - (i4 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))))) * (~(b2 & 255));
        }
        long j2 = 0;
        for (int i5 = 0; i5 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i5++) {
            j2 |= (bArr[i5] & 255) << (i5 * 8);
        }
        bVar.setLong(0L, j2);
        int i6 = Camera2StreamConfigurationMap + 99;
        getOutputFormats = i6 % 128;
        if (i6 % 2 != 0) {
            return bVar;
        }
        throw null;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public final void m24870(int i) {
        int i2 = Camera2StreamConfigurationMap;
        getOutputFormats = (i2 + 71) % 128;
        util.h.xy.ai.re.b bVar = this.unwrapAs;
        if (bVar != null) {
            int i3 = i2 + 119;
            getOutputFormats = i3 % 128;
            try {
                if (i3 % 2 == 0) {
                    bVar.dispose();
                    throw null;
                }
                bVar.dispose();
            } finally {
                this.unwrapAs = null;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE);
        int i4 = (getOutputFormats + 85) % 128;
        Camera2StreamConfigurationMap = i4;
        getOutputFormats = (i4 + 33) % 128;
        util.h.xy.ai.re.b bVar2 = new util.h.xy.ai.re.b(nativeSize + 121);
        this.unwrapAs = bVar2;
        getHighSpeedVideoFpsRangesFor();
        bVar2.setInt(80L, i);
        util.h.xy.ai.re.b bVar3 = this._CREATION;
        if (bVar3 != null) {
            int i5 = getOutputFormats + 69;
            Camera2StreamConfigurationMap = i5 % 128;
            try {
                if (i5 % 2 != 0) {
                    bVar3.dispose();
                    this._CREATION = null;
                    throw new java.lang.ArithmeticException();
                }
                bVar3.dispose();
            } finally {
                this._CREATION = null;
            }
        }
        long nativeValue = com.sun.jna.Pointer.nativeValue(this.unwrapAs);
        getHighSpeedVideoFpsRangesFor();
        this._CREATION = getHighSpeedVideoFpsRangesFor(nativeValue + 80);
    }

    private static int Camera2StreamConfigurationMap() {
        int i = getOutputFormats;
        Camera2StreamConfigurationMap = (i + 119) % 128;
        int i2 = i + 101;
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 == 0) {
            return 66;
        }
        throw null;
    }

    /* renamed from: ι, reason: contains not printable characters */
    protected final void m24891() {
        int i = Camera2StreamConfigurationMap;
        getOutputFormats = (i + 35) % 128;
        util.h.xy.ai.re.b bVar = this.ArtificialStackFrames;
        if (bVar != null) {
            getOutputFormats = (i + 65) % 128;
            try {
                bVar.dispose();
            } finally {
                this.ArtificialStackFrames = null;
            }
        }
        util.h.xy.ai.re.b bVar2 = this.coroutineBoundary;
        if (bVar2 != null) {
            try {
                bVar2.dispose();
            } finally {
                this.coroutineBoundary = null;
            }
        }
        util.h.xy.ai.re.b bVar3 = this.c;
        if (bVar3 != null) {
            try {
                bVar3.dispose();
                this.c = null;
                getOutputFormats = (Camera2StreamConfigurationMap + 53) % 128;
            } catch (java.lang.Throwable th) {
                this.c = null;
                throw th;
            }
        }
    }

    /* renamed from: ι, reason: contains not printable characters */
    public final void m24892(int i) {
        this.getARTIFICIAL_FRAME_PACKAGE_NAME = i;
        util.h.xy.ai.re.b bVar = this.ArtificialStackFrames;
        if (bVar != null) {
            int i2 = getOutputFormats + 69;
            Camera2StreamConfigurationMap = i2 % 128;
            try {
                if (i2 % 2 != 0) {
                    bVar.dispose();
                    this.ArtificialStackFrames = null;
                    throw new java.lang.ArithmeticException();
                }
                bVar.dispose();
            } finally {
                this.ArtificialStackFrames = null;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE) * i;
        int i3 = getOutputFormats;
        int i4 = i3 + 83;
        Camera2StreamConfigurationMap = i4 % 128;
        int i5 = i4 % 2 != 0 ? 109 : 117;
        Camera2StreamConfigurationMap = (i3 + 97) % 128;
        this.ArtificialStackFrames = new util.h.xy.ai.re.b(nativeSize + i5);
        util.h.xy.ai.re.b bVar2 = this.coroutineBoundary;
        if (bVar2 != null) {
            Camera2StreamConfigurationMap = (getOutputFormats + 69) % 128;
            try {
                bVar2.dispose();
            } finally {
                this.coroutineBoundary = null;
            }
        }
        util.h.xy.ai.re.b bVar3 = new util.h.xy.ai.re.b(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        this.coroutineBoundary = bVar3;
        long nativeValue = com.sun.jna.Pointer.nativeValue(this.ArtificialStackFrames);
        Camera2StreamConfigurationMap();
        bVar3.setPointer(0L, new com.sun.jna.Pointer(nativeValue + 66));
        util.h.xy.ai.re.b bVar4 = this.c;
        if (bVar4 != null) {
            try {
                bVar4.dispose();
            } finally {
                this.c = null;
            }
        }
        long nativeValue2 = com.sun.jna.Pointer.nativeValue(this.coroutineBoundary);
        util.h.xy.ai.re.b bVar5 = new util.h.xy.ai.re.b(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        bVar5.setLong(0L, nativeValue2 ^ 536432575);
        Camera2StreamConfigurationMap = (getOutputFormats + 47) % 128;
        this.c = bVar5;
    }

    /* renamed from: ͺ, reason: contains not printable characters */
    public final byte[] m24886() throws java.io.IOException {
        int i = getOutputFormats + 47;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 == 0) {
            util.h.xy.ai.re.b bVar = this.ArtificialStackFrames;
            if (bVar == null) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(39 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), android.view.View.MeasureSpec.getMode(0), (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 31318), objArr);
                throw new java.io.IOException(((java.lang.String) objArr[0]).intern());
            }
            byte[] bArr = new byte[this.getARTIFICIAL_FRAME_PACKAGE_NAME];
            Camera2StreamConfigurationMap();
            bVar.read(66L, bArr, 0, this.getARTIFICIAL_FRAME_PACKAGE_NAME);
            int i2 = getOutputFormats + 35;
            Camera2StreamConfigurationMap = i2 % 128;
            if (i2 % 2 == 0) {
                return bArr;
            }
            throw null;
        }
        throw null;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m24882(byte[] bArr) throws java.io.IOException {
        getOutputFormats = (Camera2StreamConfigurationMap + 121) % 128;
        m24892(bArr.length);
        util.h.xy.ai.re.b bVar = this.ArtificialStackFrames;
        Camera2StreamConfigurationMap();
        bVar.write(66L, bArr, 0, bArr.length);
        Camera2StreamConfigurationMap = (getOutputFormats + 33) % 128;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    protected final void m24869() {
        util.h.xy.ai.re.b bVar = this.coroutineCreation;
        if (bVar != null) {
            getOutputFormats = (Camera2StreamConfigurationMap + 17) % 128;
            try {
                bVar.dispose();
            } finally {
                this.coroutineCreation = null;
            }
        }
        util.h.xy.ai.re.b bVar2 = this.getOutputMinFrameDuration;
        if (bVar2 != null) {
            getOutputFormats = (Camera2StreamConfigurationMap + 29) % 128;
            try {
                bVar2.dispose();
            } finally {
                this.getOutputMinFrameDuration = null;
            }
        }
        util.h.xy.ai.re.b bVar3 = this.init;
        if (bVar3 != null) {
            try {
                bVar3.dispose();
            } finally {
                this.init = null;
            }
        }
        getOutputFormats = (Camera2StreamConfigurationMap + 95) % 128;
    }

    private util.h.xy.ai.re.b getHighSpeedVideoFpsRanges(long j) {
        util.h.xy.ai.re.b bVar = new util.h.xy.ai.re.b(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        byte[] bArr = new byte[com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)];
        getOutputFormats = (Camera2StreamConfigurationMap + 1) % 128;
        for (int i = 0; i < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i++) {
            int i2 = i * 8;
            bArr[i] = (byte) (((255 << i2) & j) >> i2);
        }
        int i3 = 2104042736;
        for (int i4 = 0; i4 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i4++) {
            getOutputFormats = (Camera2StreamConfigurationMap + 55) % 128;
            byte b2 = bArr[i4];
            bArr[i4] = (byte) (((byte) (i3 & 255)) ^ b2);
            i3 = ((i3 << (i4 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))) | (i3 >>> (((com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8) - 1) - (i4 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))))) * (~(b2 & 255));
        }
        long j2 = 0;
        for (int i5 = 0; i5 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i5++) {
            j2 |= (bArr[i5] & 255) << (i5 * 8);
        }
        bVar.setLong(0L, j2);
        return bVar;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public final void m24868(int i) {
        this.d = i;
        util.h.xy.ai.re.b bVar = this.coroutineCreation;
        if (bVar != null) {
            int i2 = Camera2StreamConfigurationMap + 5;
            getOutputFormats = i2 % 128;
            try {
                if (i2 % 2 == 0) {
                    bVar.dispose();
                    throw null;
                }
                bVar.dispose();
            } finally {
                this.coroutineCreation = null;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * i;
        int i3 = getOutputFormats + 105;
        int i4 = i3 % 128;
        Camera2StreamConfigurationMap = i4;
        int i5 = i3 % 2 != 0 ? 100 : 93;
        getOutputFormats = (i4 + 75) % 128;
        this.coroutineCreation = new util.h.xy.ai.re.b(nativeSize + i5);
        util.h.xy.ai.re.b bVar2 = this.getOutputMinFrameDuration;
        if (bVar2 != null) {
            int i6 = Camera2StreamConfigurationMap + 11;
            getOutputFormats = i6 % 128;
            try {
                if (i6 % 2 == 0) {
                    bVar2.dispose();
                    throw null;
                }
                bVar2.dispose();
            } finally {
                this.getOutputMinFrameDuration = null;
            }
        }
        util.h.xy.ai.re.b bVar3 = new util.h.xy.ai.re.b(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        this.getOutputMinFrameDuration = bVar3;
        long nativeValue = com.sun.jna.Pointer.nativeValue(this.coroutineCreation);
        int i7 = Camera2StreamConfigurationMap;
        getOutputFormats = (i7 + 105) % 128;
        getOutputFormats = (i7 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        bVar3.setPointer(0L, new com.sun.jna.Pointer(nativeValue + 72));
        util.h.xy.ai.re.b bVar4 = this.init;
        if (bVar4 != null) {
            try {
                bVar4.dispose();
            } finally {
                this.init = null;
            }
        }
        this.init = getHighSpeedVideoFpsRanges(com.sun.jna.Pointer.nativeValue(this.getOutputMinFrameDuration));
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public final int[] m24871() throws java.io.IOException {
        int i = getOutputFormats + 41;
        int i2 = i % 128;
        Camera2StreamConfigurationMap = i2;
        if (i % 2 != 0) {
            throw null;
        }
        util.h.xy.ai.re.b bVar = this.coroutineCreation;
        if (bVar == null) {
            float complexToFraction = android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f);
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(44 - (complexToFraction > 0.0f ? 1 : (complexToFraction == 0.0f ? 0 : -1)), 38 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (7194 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), objArr);
            throw new java.io.IOException(((java.lang.String) objArr[0]).intern());
        }
        int i3 = this.d;
        int[] iArr = new int[i3];
        getOutputFormats = (i2 + 105) % 128;
        getOutputFormats = (i2 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        bVar.read(72L, iArr, 0, i3);
        int i4 = Camera2StreamConfigurationMap + 75;
        getOutputFormats = i4 % 128;
        if (i4 % 2 != 0) {
            return iArr;
        }
        throw null;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m24890(int[] iArr) throws java.io.IOException {
        getOutputFormats = (Camera2StreamConfigurationMap + 111) % 128;
        m24868(iArr.length);
        util.h.xy.ai.re.b bVar = this.coroutineCreation;
        int i = Camera2StreamConfigurationMap;
        getOutputFormats = (i + 105) % 128;
        getOutputFormats = (i + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        bVar.write(72L, iArr, 0, iArr.length);
        int i2 = Camera2StreamConfigurationMap + 11;
        getOutputFormats = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private static int getHighResolutionOutputSizeshNQ4ISI() {
        int i = Camera2StreamConfigurationMap;
        getOutputFormats = (i + 85) % 128;
        int i2 = i + 61;
        getOutputFormats = i2 % 128;
        if (i2 % 2 != 0) {
            return 76;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    protected final void m24873() {
        getOutputFormats = (Camera2StreamConfigurationMap + 31) % 128;
        util.h.xy.ai.re.b bVar = this.f7075a;
        if (bVar != null) {
            try {
                bVar.dispose();
                this.f7075a = null;
                Camera2StreamConfigurationMap = (getOutputFormats + 55) % 128;
            } catch (java.lang.Throwable th) {
                this.f7075a = null;
                throw th;
            }
        }
        util.h.xy.ai.re.b bVar2 = this.b;
        if (bVar2 != null) {
            try {
                bVar2.dispose();
            } finally {
                this.b = null;
            }
        }
        util.h.xy.ai.re.b bVar3 = this.AMEXKernel;
        if (bVar3 != null) {
            int i = getOutputFormats + 73;
            Camera2StreamConfigurationMap = i % 128;
            try {
                if (i % 2 == 0) {
                    bVar3.dispose();
                } else {
                    bVar3.dispose();
                    this.AMEXKernel = null;
                    throw new java.lang.ArithmeticException();
                }
            } finally {
                this.AMEXKernel = null;
            }
        }
    }

    private util.h.xy.ai.re.b getHighResolutionOutputSizeshNQ4ISI(long j) {
        util.h.xy.ai.re.b bVar = new util.h.xy.ai.re.b(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        byte[] bArr = new byte[com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)];
        int i = 0;
        for (int i2 = 0; i2 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i2++) {
            int i3 = i2 * 8;
            bArr[i2] = (byte) (((255 << i3) & j) >> i3);
        }
        int i4 = 184063090;
        int i5 = 0;
        while (i5 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)) {
            getOutputFormats = (Camera2StreamConfigurationMap + 29) % 128;
            byte b2 = bArr[i5];
            bArr[i5] = (byte) (((byte) (i4 & 255)) ^ b2);
            i4 = ((i4 << (i5 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))) | (i4 >>> (((com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8) - 1) - (i5 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))))) * (~(b2 & 255));
            i5++;
            Camera2StreamConfigurationMap = (getOutputFormats + 55) % 128;
        }
        long j2 = 0;
        while (i < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)) {
            int i6 = getOutputFormats + 81;
            Camera2StreamConfigurationMap = i6 % 128;
            if (i6 % 2 != 0) {
                j2 -= (bArr[i] & 7308) << (i + 101);
                i += 66;
            } else {
                j2 |= (bArr[i] & 255) << (i * 8);
                i++;
            }
        }
        bVar.setLong(0L, j2);
        return bVar;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public final int m24872() throws java.io.IOException {
        if (this.getOutputStallDurationlomOqCM != null && this.getInputFormats != null) {
            int i = Camera2StreamConfigurationMap;
            int i2 = i + 85;
            getOutputFormats = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            if (this.kernelVersion != null) {
                int i3 = i + 59;
                getOutputFormats = i3 % 128;
                if (i3 % 2 == 0) {
                    throw null;
                }
                if (this.getOutputStallDuration != null && this.accessartificialFrame != null && this._CREATION != null && this.c != null && this.init != null) {
                    int i4 = i + 103;
                    getOutputFormats = i4 % 128;
                    if (i4 % 2 == 0) {
                        throw null;
                    }
                    util.h.xy.ai.re.b bVar = this.f7075a;
                    if (bVar != null) {
                        try {
                            bVar.dispose();
                        } finally {
                            this.f7075a = null;
                        }
                    }
                    int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE);
                    int i5 = getOutputFormats;
                    Camera2StreamConfigurationMap = (i5 + 113) % 128;
                    int i6 = i5 + 57;
                    Camera2StreamConfigurationMap = i6 % 128;
                    if (i6 % 2 != 0) {
                        throw new java.lang.ArithmeticException();
                    }
                    this.f7075a = new util.h.xy.ai.re.b(nativeSize + 127);
                    util.h.xy.ai.re.b bVar2 = this.b;
                    if (bVar2 != null) {
                        try {
                            bVar2.dispose();
                        } finally {
                            this.b = null;
                        }
                    }
                    util.h.xy.ai.re.b bVar3 = new util.h.xy.ai.re.b(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
                    this.b = bVar3;
                    long nativeValue = com.sun.jna.Pointer.nativeValue(this.f7075a);
                    getHighResolutionOutputSizeshNQ4ISI();
                    bVar3.setPointer(0L, new com.sun.jna.Pointer(nativeValue + 76));
                    util.h.xy.ai.re.b bVar4 = this.AMEXKernel;
                    if (bVar4 != null) {
                        try {
                            bVar4.dispose();
                            this.AMEXKernel = null;
                            Camera2StreamConfigurationMap = (getOutputFormats + 63) % 128;
                        } catch (java.lang.Throwable th) {
                            this.AMEXKernel = null;
                            throw th;
                        }
                    }
                    this.AMEXKernel = getHighResolutionOutputSizeshNQ4ISI(com.sun.jna.Pointer.nativeValue(this.b));
                    util.h.xy.ai.g.getHighSpeedVideoFpsRanges._GAsBZSW9wcr9aMZUp2FTw4(this.AMEXKernel, this.getOutputStallDurationlomOqCM, this.getInputFormats, this.kernelVersion, this.getOutputStallDuration, this.accessartificialFrame, this._CREATION, this.c, this.init);
                    int[] iArr = new int[1];
                    util.h.xy.ai.re.b bVar5 = this.f7075a;
                    getHighResolutionOutputSizeshNQ4ISI();
                    bVar5.read(76L, iArr, 0, 1);
                    return iArr[0];
                }
            }
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 50, (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 83, (char) (11118 - android.view.View.MeasureSpec.getMode(0)), objArr);
        throw new java.io.IOException(((java.lang.String) objArr[0]).intern());
    }

    /* renamed from: ˌ, reason: contains not printable characters */
    public final void m24879() {
        int i = Camera2StreamConfigurationMap + 67;
        getOutputFormats = i % 128;
        if (i % 2 != 0) {
            m24877();
            m24880();
            m24883();
            m24887();
            m24874();
            m24867();
            m24891();
            m24869();
            m24873();
            Camera2StreamConfigurationMap = (getOutputFormats + 59) % 128;
            return;
        }
        m24877();
        m24880();
        m24883();
        m24887();
        m24874();
        m24867();
        m24891();
        m24869();
        m24873();
        throw new java.lang.ArithmeticException();
    }
}
