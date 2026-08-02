package util.h.xy.ai;

/* loaded from: classes5.dex */
public final class mc {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static long getHighSpeedVideoSizes = 6842128812340576746L;
    private util.h.xy.ai.mc.a unwrapAs = null;
    private util.h.xy.ai.mc.a getOutputStallDurationlomOqCM = null;
    private int CoroutineDebuggingKt = 0;
    private util.h.xy.ai.mc.a getOutputStallDuration = null;
    private util.h.xy.ai.mc.a toString = null;
    private util.h.xy.ai.mc.a getOutputMinFrameDuration = null;
    private util.h.xy.ai.mc.a isOutputSupportedForhNQ4ISI = null;
    private util.h.xy.ai.mc.a ArtificialStackFrames = null;
    private int getHighSpeedVideoSizesFor = 0;
    private util.h.xy.ai.mc.a getOutputFormats = null;
    private util.h.xy.ai.mc.a getInputSizeshNQ4ISI = null;
    private util.h.xy.ai.mc.a getInputFormats = null;
    private int getOutputSizes = 0;
    private util.h.xy.ai.mc.a getOutputSizeshNQ4ISI = null;
    private util.h.xy.ai.mc.a getOutputMinFrameDurationlomOqCM = null;
    private util.h.xy.ai.mc.a coroutineCreation = null;
    private util.h.xy.ai.mc.a getValidOutputFormatsForInputhNQ4ISI = null;
    private util.h.xy.ai.mc.a isOutputSupportedFor = null;
    private util.h.xy.ai.mc.a accessartificialFrame = null;

    protected final void finalize() {
        getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        m24734();
        Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 19) % 128;
    }

    final class a extends com.sun.jna.Memory {
        private static int getHighSpeedVideoFpsRanges = 1;
        private static int getHighSpeedVideoFpsRangesFor;

        public a(long j) {
            super(j);
        }

        @Override // com.sun.jna.Memory
        public final void dispose() {
            int i = getHighSpeedVideoFpsRangesFor;
            getHighSpeedVideoFpsRanges = ((i ^ 1) + ((i & 1) << 1)) % 128;
            super.dispose();
            int i2 = getHighSpeedVideoFpsRangesFor;
            getHighSpeedVideoFpsRanges = ((i2 & 115) + (i2 | 115)) % 128;
        }
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2;
        int i3 = getHighSpeedVideoFpsRanges + 41;
        getHighSpeedVideoFpsRangesFor = i3 % 128;
        if (i3 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        char[] charArray = str.toCharArray();
        util.h.xz.b.d dVar = new util.h.xz.b.d();
        dVar.f2628 = i;
        int length = charArray.length;
        long[] jArr = new long[length];
        dVar.f2629 = 0;
        while (dVar.f2629 < charArray.length) {
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 63) % 128;
            jArr[dVar.f2629] = (charArray[dVar.f2629] ^ (dVar.f2629 * dVar.f2628)) ^ (getHighSpeedVideoSizes ^ (-7508379876853140581L));
            dVar.f2629++;
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 93) % 128;
        }
        char[] cArr = new char[length];
        dVar.f2629 = 0;
        while (dVar.f2629 < charArray.length) {
            int i4 = getHighSpeedVideoFpsRanges + 65;
            getHighSpeedVideoFpsRangesFor = i4 % 128;
            if (i4 % 2 != 0) {
                cArr[dVar.f2629] = (char) jArr[dVar.f2629];
                i2 = dVar.f2629 >>> 1;
            } else {
                cArr[dVar.f2629] = (char) jArr[dVar.f2629];
                i2 = dVar.f2629 + 1;
            }
            dVar.f2629 = i2;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    protected final void m24720() {
        int i = getHighResolutionOutputSizeshNQ4ISI + 61;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        util.h.xy.ai.mc.a aVar = this.unwrapAs;
        if (aVar != null) {
            try {
                aVar.dispose();
                this.unwrapAs = null;
                getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 67) % 128;
            } catch (java.lang.Throwable th) {
                this.unwrapAs = null;
                throw th;
            }
        }
        util.h.xy.ai.mc.a aVar2 = this.getOutputStallDurationlomOqCM;
        if (aVar2 != null) {
            Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 43) % 128;
            try {
                aVar2.dispose();
            } finally {
                this.getOutputStallDurationlomOqCM = null;
            }
        }
        getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 121) % 128;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m24728(int i) {
        int i2 = Camera2StreamConfigurationMap + 47;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            util.h.xy.ai.mc.a aVar = this.unwrapAs;
            if (aVar != null) {
                try {
                    aVar.dispose();
                    this.unwrapAs = null;
                    Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 9) % 128;
                } catch (java.lang.Throwable th) {
                    this.unwrapAs = null;
                    throw th;
                }
            }
            int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE);
            int i3 = (getHighResolutionOutputSizeshNQ4ISI + 21) % 128;
            Camera2StreamConfigurationMap = i3;
            int i4 = i3 + 45;
            getHighResolutionOutputSizeshNQ4ISI = i4 % 128;
            if (i4 % 2 == 0) {
                util.h.xy.ai.mc.a aVar2 = new util.h.xy.ai.mc.a(nativeSize + 113);
                this.unwrapAs = aVar2;
                int i5 = Camera2StreamConfigurationMap;
                getHighResolutionOutputSizeshNQ4ISI = (i5 + 75) % 128;
                getHighResolutionOutputSizeshNQ4ISI = (i5 + 35) % 128;
                aVar2.setInt(86L, i);
                util.h.xy.ai.mc.a aVar3 = this.getOutputStallDurationlomOqCM;
                if (aVar3 != null) {
                    try {
                        aVar3.dispose();
                    } finally {
                        this.getOutputStallDurationlomOqCM = null;
                    }
                }
                long nativeValue = com.sun.jna.Pointer.nativeValue(this.unwrapAs);
                int i6 = Camera2StreamConfigurationMap;
                getHighResolutionOutputSizeshNQ4ISI = (i6 + 75) % 128;
                getHighResolutionOutputSizeshNQ4ISI = (i6 + 35) % 128;
                util.h.xy.ai.mc.a aVar4 = new util.h.xy.ai.mc.a(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
                aVar4.setLong(0L, (nativeValue + 86) ^ 673108839);
                getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 95) % 128;
                this.getOutputStallDurationlomOqCM = aVar4;
                return;
            }
            throw new java.lang.ArithmeticException();
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    protected final void m24732() {
        util.h.xy.ai.mc.a aVar = this.getOutputStallDuration;
        if (aVar != null) {
            int i = Camera2StreamConfigurationMap + 33;
            getHighResolutionOutputSizeshNQ4ISI = i % 128;
            try {
                if (i % 2 != 0) {
                    aVar.dispose();
                    throw null;
                }
                aVar.dispose();
                this.getOutputStallDuration = null;
                Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 13) % 128;
            } finally {
                this.getOutputStallDuration = null;
            }
        }
        util.h.xy.ai.mc.a aVar2 = this.toString;
        if (aVar2 != null) {
            getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 97) % 128;
            try {
                aVar2.dispose();
            } finally {
                this.toString = null;
            }
        }
        util.h.xy.ai.mc.a aVar3 = this.getOutputMinFrameDuration;
        if (aVar3 != null) {
            try {
                aVar3.dispose();
            } finally {
                this.getOutputMinFrameDuration = null;
            }
        }
    }

    private util.h.xy.ai.mc.a Camera2StreamConfigurationMap(long j) {
        util.h.xy.ai.mc.a aVar = new util.h.xy.ai.mc.a(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        byte[] bArr = new byte[com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)];
        for (int i = 0; i < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i++) {
            int i2 = i * 8;
            bArr[i] = (byte) (((255 << i2) & j) >> i2);
        }
        int i3 = 1297616884;
        int i4 = 0;
        while (i4 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)) {
            getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
            byte b = bArr[i4];
            bArr[i4] = (byte) (((byte) (i3 & 255)) ^ b);
            i3 = ((i3 << (i4 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))) | (i3 >>> (((com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8) - 1) - (i4 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))))) * (~(b & 255));
            i4++;
            Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 29) % 128;
        }
        long j2 = 0;
        for (int i5 = 0; i5 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i5++) {
            j2 |= (bArr[i5] & 255) << (i5 * 8);
        }
        aVar.setLong(0L, j2);
        return aVar;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m24724(int i) {
        getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 19) % 128;
        this.CoroutineDebuggingKt = i;
        util.h.xy.ai.mc.a aVar = this.getOutputStallDuration;
        if (aVar != null) {
            try {
                aVar.dispose();
            } finally {
                this.getOutputStallDuration = null;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE) * i;
        int i2 = (getHighResolutionOutputSizeshNQ4ISI + 33) % 128;
        Camera2StreamConfigurationMap = i2;
        int i3 = i2 + 125;
        getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
        if (i3 % 2 == 0) {
            this.getOutputStallDuration = new util.h.xy.ai.mc.a(nativeSize + 121);
            util.h.xy.ai.mc.a aVar2 = this.toString;
            if (aVar2 != null) {
                try {
                    aVar2.dispose();
                } finally {
                    this.toString = null;
                }
            }
            util.h.xy.ai.mc.a aVar3 = new util.h.xy.ai.mc.a(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
            this.toString = aVar3;
            long nativeValue = com.sun.jna.Pointer.nativeValue(this.getOutputStallDuration);
            int i4 = getHighResolutionOutputSizeshNQ4ISI + 13;
            Camera2StreamConfigurationMap = i4 % 128;
            aVar3.setPointer(0L, new com.sun.jna.Pointer(nativeValue + (i4 % 2 == 0 ? 57 : 80)));
            util.h.xy.ai.mc.a aVar4 = this.getOutputMinFrameDuration;
            if (aVar4 != null) {
                Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 79) % 128;
                try {
                    aVar4.dispose();
                } finally {
                    this.getOutputMinFrameDuration = null;
                }
            }
            this.getOutputMinFrameDuration = Camera2StreamConfigurationMap(com.sun.jna.Pointer.nativeValue(this.toString));
            return;
        }
        throw null;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m24722(byte[] bArr) throws java.io.IOException {
        getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 53) % 128;
        m24724(bArr.length);
        util.h.xy.ai.mc.a aVar = this.getOutputStallDuration;
        int i = getHighResolutionOutputSizeshNQ4ISI + 13;
        Camera2StreamConfigurationMap = i % 128;
        aVar.write(i % 2 == 0 ? 57 : 80, bArr, 0, bArr.length);
        Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 23) % 128;
    }

    private static int getHighSpeedVideoFpsRangesFor() {
        int i = Camera2StreamConfigurationMap;
        getHighResolutionOutputSizeshNQ4ISI = (i + 29) % 128;
        int i2 = i + 1;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            return 66;
        }
        throw null;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    protected final void m24723() {
        int i = Camera2StreamConfigurationMap;
        getHighResolutionOutputSizeshNQ4ISI = (i + 85) % 128;
        util.h.xy.ai.mc.a aVar = this.isOutputSupportedForhNQ4ISI;
        if (aVar != null) {
            getHighResolutionOutputSizeshNQ4ISI = (i + 63) % 128;
            try {
                aVar.dispose();
            } finally {
                this.isOutputSupportedForhNQ4ISI = null;
            }
        }
        util.h.xy.ai.mc.a aVar2 = this.ArtificialStackFrames;
        if (aVar2 != null) {
            getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 113) % 128;
            try {
                aVar2.dispose();
            } finally {
                this.ArtificialStackFrames = null;
            }
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m24726(int i) {
        util.h.xy.ai.mc.a aVar = this.isOutputSupportedForhNQ4ISI;
        if (aVar != null) {
            try {
                aVar.dispose();
                this.isOutputSupportedForhNQ4ISI = null;
                getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 29) % 128;
            } catch (java.lang.Throwable th) {
                this.isOutputSupportedForhNQ4ISI = null;
                throw th;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE);
        int i2 = Camera2StreamConfigurationMap + 75;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        util.h.xy.ai.mc.a aVar2 = new util.h.xy.ai.mc.a(nativeSize + (i2 % 2 != 0 ? 27 : 117));
        this.isOutputSupportedForhNQ4ISI = aVar2;
        getHighSpeedVideoFpsRangesFor();
        aVar2.setInt(66L, i);
        util.h.xy.ai.mc.a aVar3 = this.ArtificialStackFrames;
        if (aVar3 != null) {
            int i3 = getHighResolutionOutputSizeshNQ4ISI + 95;
            Camera2StreamConfigurationMap = i3 % 128;
            try {
                if (i3 % 2 != 0) {
                    aVar3.dispose();
                } else {
                    aVar3.dispose();
                    throw null;
                }
            } finally {
                this.ArtificialStackFrames = null;
            }
        }
        long nativeValue = com.sun.jna.Pointer.nativeValue(this.isOutputSupportedForhNQ4ISI);
        getHighSpeedVideoFpsRangesFor();
        util.h.xy.ai.mc.a aVar4 = new util.h.xy.ai.mc.a(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        aVar4.setLong(0L, 536432575 ^ (nativeValue + 66));
        int i4 = getHighResolutionOutputSizeshNQ4ISI + 55;
        Camera2StreamConfigurationMap = i4 % 128;
        if (i4 % 2 != 0) {
            this.ArtificialStackFrames = aVar4;
            return;
        }
        throw null;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    protected final void m24725() {
        util.h.xy.ai.mc.a aVar = this.getOutputFormats;
        if (aVar != null) {
            int i = getHighResolutionOutputSizeshNQ4ISI + 101;
            Camera2StreamConfigurationMap = i % 128;
            try {
                if (i % 2 == 0) {
                    aVar.dispose();
                    throw null;
                }
                aVar.dispose();
            } finally {
                this.getOutputFormats = null;
            }
        }
        util.h.xy.ai.mc.a aVar2 = this.getInputSizeshNQ4ISI;
        if (aVar2 != null) {
            try {
                aVar2.dispose();
            } finally {
                this.getInputSizeshNQ4ISI = null;
            }
        }
        util.h.xy.ai.mc.a aVar3 = this.getInputFormats;
        if (aVar3 != null) {
            int i2 = Camera2StreamConfigurationMap + 47;
            getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
            try {
                if (i2 % 2 != 0) {
                    aVar3.dispose();
                    throw null;
                }
                aVar3.dispose();
                this.getInputFormats = null;
                Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 59) % 128;
            } finally {
                this.getInputFormats = null;
            }
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m24721(int i) {
        this.getHighSpeedVideoSizesFor = i;
        util.h.xy.ai.mc.a aVar = this.getOutputFormats;
        if (aVar != null) {
            try {
                aVar.dispose();
            } finally {
                this.getOutputFormats = null;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE) * i;
        int i2 = Camera2StreamConfigurationMap;
        getHighResolutionOutputSizeshNQ4ISI = (i2 + 125) % 128;
        getHighResolutionOutputSizeshNQ4ISI = (i2 + 29) % 128;
        this.getOutputFormats = new util.h.xy.ai.mc.a(nativeSize + 121);
        util.h.xy.ai.mc.a aVar2 = this.getInputSizeshNQ4ISI;
        if (aVar2 != null) {
            try {
                aVar2.dispose();
                this.getInputSizeshNQ4ISI = null;
                Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 29) % 128;
            } catch (java.lang.Throwable th) {
                this.getInputSizeshNQ4ISI = null;
                throw th;
            }
        }
        util.h.xy.ai.mc.a aVar3 = new util.h.xy.ai.mc.a(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        this.getInputSizeshNQ4ISI = aVar3;
        long nativeValue = com.sun.jna.Pointer.nativeValue(this.getOutputFormats);
        int i3 = getHighResolutionOutputSizeshNQ4ISI + 3;
        Camera2StreamConfigurationMap = i3 % 128;
        aVar3.setPointer(0L, new com.sun.jna.Pointer(nativeValue + (i3 % 2 == 0 ? 46 : 104)));
        util.h.xy.ai.mc.a aVar4 = this.getInputFormats;
        if (aVar4 != null) {
            Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 75) % 128;
            try {
                aVar4.dispose();
            } finally {
                this.getInputFormats = null;
            }
        }
        long nativeValue2 = com.sun.jna.Pointer.nativeValue(this.getInputSizeshNQ4ISI);
        util.h.xy.ai.mc.a aVar5 = new util.h.xy.ai.mc.a(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        byte[] bArr = new byte[com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)];
        int i4 = 0;
        int i5 = 0;
        while (i5 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)) {
            int i6 = Camera2StreamConfigurationMap + 105;
            getHighResolutionOutputSizeshNQ4ISI = i6 % 128;
            if (i6 % 2 != 0) {
                bArr[i5] = (byte) (((255 >>> (i5 * 95)) + nativeValue2) << (i5 << 14));
                i5 += 79;
            } else {
                int i7 = i5 * 8;
                bArr[i5] = (byte) (((255 << i7) & nativeValue2) >> i7);
                i5++;
            }
        }
        int i8 = 184063090;
        for (int i9 = 0; i9 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i9++) {
            byte b = bArr[i9];
            bArr[i9] = (byte) (((byte) (i8 & 255)) ^ b);
            i8 = ((i8 << (i9 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))) | (i8 >>> (((com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8) - 1) - (i9 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))))) * (~(b & 255));
        }
        long j = 0;
        while (i4 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)) {
            int i10 = getHighResolutionOutputSizeshNQ4ISI + 91;
            Camera2StreamConfigurationMap = i10 % 128;
            if (i10 % 2 == 0) {
                j %= (bArr[i4] & 2207) >> (i4 >>> 76);
                i4 += 44;
            } else {
                j |= (bArr[i4] & 255) << (i4 * 8);
                i4++;
            }
        }
        aVar5.setLong(0L, j);
        this.getInputFormats = aVar5;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final byte[] m24730() throws java.io.IOException {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = i + 121;
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 != 0) {
            util.h.xy.ai.mc.a aVar = this.getOutputFormats;
            if (aVar == null) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("눜\uf2ef㏔烄뇽\uf685㞒瑰땅晴㬬砍뤁六㻞翀벱ﶟ⊃捂ꁔ\ue142☦朮ꐌ\ue4e4◉櫝ꮷ\ue8bd⦒湾꽴\uec1aⴡ刹錏폵ყ", (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 16619, objArr);
                throw new java.io.IOException(((java.lang.String) objArr[0]).intern());
            }
            int i3 = this.getHighSpeedVideoSizesFor;
            byte[] bArr = new byte[i3];
            int i4 = i + 3;
            Camera2StreamConfigurationMap = i4 % 128;
            aVar.read(i4 % 2 == 0 ? 46 : 104, bArr, 0, i3);
            int i5 = getHighResolutionOutputSizeshNQ4ISI + 95;
            Camera2StreamConfigurationMap = i5 % 128;
            if (i5 % 2 != 0) {
                return bArr;
            }
            throw new java.lang.ArithmeticException();
        }
        throw null;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m24727(byte[] bArr) throws java.io.IOException {
        getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 7) % 128;
        m24721(bArr.length);
        util.h.xy.ai.mc.a aVar = this.getOutputFormats;
        int i = getHighResolutionOutputSizeshNQ4ISI + 3;
        Camera2StreamConfigurationMap = i % 128;
        aVar.write(i % 2 == 0 ? 46 : 104, bArr, 0, bArr.length);
        Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
    }

    private static int getHighSpeedVideoSizes() {
        int i = (Camera2StreamConfigurationMap + 51) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i;
        int i2 = i + 115;
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 != 0) {
            return 76;
        }
        throw null;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    protected final void m24719() {
        int i = Camera2StreamConfigurationMap + 49;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        util.h.xy.ai.mc.a aVar = this.getOutputSizeshNQ4ISI;
        if (aVar != null) {
            try {
                aVar.dispose();
            } finally {
                this.getOutputSizeshNQ4ISI = null;
            }
        }
        util.h.xy.ai.mc.a aVar2 = this.getOutputMinFrameDurationlomOqCM;
        if (aVar2 != null) {
            try {
                aVar2.dispose();
            } finally {
                this.getOutputMinFrameDurationlomOqCM = null;
            }
        }
        util.h.xy.ai.mc.a aVar3 = this.coroutineCreation;
        if (aVar3 != null) {
            int i2 = getHighResolutionOutputSizeshNQ4ISI + 117;
            Camera2StreamConfigurationMap = i2 % 128;
            try {
                if (i2 % 2 == 0) {
                    aVar3.dispose();
                    throw null;
                }
                aVar3.dispose();
            } finally {
                this.coroutineCreation = null;
            }
        }
        int i3 = getHighResolutionOutputSizeshNQ4ISI + 31;
        Camera2StreamConfigurationMap = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m24733(int i) {
        this.getOutputSizes = i;
        util.h.xy.ai.mc.a aVar = this.getOutputSizeshNQ4ISI;
        if (aVar != null) {
            int i2 = getHighResolutionOutputSizeshNQ4ISI + 87;
            Camera2StreamConfigurationMap = i2 % 128;
            try {
                if (i2 % 2 != 0) {
                    aVar.dispose();
                } else {
                    aVar.dispose();
                    throw null;
                }
            } finally {
                this.getOutputSizeshNQ4ISI = null;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * i;
        int i3 = getHighResolutionOutputSizeshNQ4ISI;
        Camera2StreamConfigurationMap = (i3 + 31) % 128;
        Camera2StreamConfigurationMap = (i3 + 117) % 128;
        this.getOutputSizeshNQ4ISI = new util.h.xy.ai.mc.a(nativeSize + 105);
        util.h.xy.ai.mc.a aVar2 = this.getOutputMinFrameDurationlomOqCM;
        if (aVar2 != null) {
            try {
                aVar2.dispose();
            } finally {
                this.getOutputMinFrameDurationlomOqCM = null;
            }
        }
        util.h.xy.ai.mc.a aVar3 = new util.h.xy.ai.mc.a(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        this.getOutputMinFrameDurationlomOqCM = aVar3;
        long nativeValue = com.sun.jna.Pointer.nativeValue(this.getOutputSizeshNQ4ISI);
        getHighSpeedVideoSizes();
        aVar3.setPointer(0L, new com.sun.jna.Pointer(nativeValue + 76));
        util.h.xy.ai.mc.a aVar4 = this.coroutineCreation;
        if (aVar4 != null) {
            try {
                aVar4.dispose();
            } finally {
                this.coroutineCreation = null;
            }
        }
        long nativeValue2 = com.sun.jna.Pointer.nativeValue(this.getOutputMinFrameDurationlomOqCM);
        util.h.xy.ai.mc.a aVar5 = new util.h.xy.ai.mc.a(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        byte[] bArr = new byte[com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)];
        int i4 = 0;
        while (i4 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)) {
            int i5 = (Camera2StreamConfigurationMap + 55) % 128;
            getHighResolutionOutputSizeshNQ4ISI = i5;
            int i6 = i4 * 8;
            bArr[i4] = (byte) (((255 << i6) & nativeValue2) >> i6);
            i4++;
            Camera2StreamConfigurationMap = (i5 + 47) % 128;
        }
        int i7 = 1570362428;
        for (int i8 = 0; i8 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i8++) {
            getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 65) % 128;
            byte b = bArr[i8];
            bArr[i8] = (byte) (((byte) (i7 & 255)) ^ b);
            i7 = ((i7 << (i8 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))) | (i7 >>> (((com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8) - 1) - (i8 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))))) * (~(b & 255));
        }
        long j = 0;
        for (int i9 = 0; i9 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i9++) {
            j |= (bArr[i9] & 255) << (i9 * 8);
        }
        aVar5.setLong(0L, j);
        this.coroutineCreation = aVar5;
        getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 95) % 128;
    }

    /* renamed from: ͺ, reason: contains not printable characters */
    public final int[] m24731() throws java.io.IOException {
        Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 85) % 128;
        util.h.xy.ai.mc.a aVar = this.getOutputSizeshNQ4ISI;
        if (aVar == null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("눜悙\u1738엒\uf825꼃嶾灖⛵헔蠠뺫浙χ㚒\ue536鯑乩紏\u139a왐\uf4feꭨ帞ಡ⍭퇭蒊묟槍ᱱ㌔\ue1b4鐾䫸祯Ⱏ슥\uf11fꟼ媐द㿀퉚", (android.view.ViewConfiguration.getTapTimeout() >> 16) + 53917, objArr);
            throw new java.io.IOException(((java.lang.String) objArr[0]).intern());
        }
        int[] iArr = new int[this.getOutputSizes];
        getHighSpeedVideoSizes();
        aVar.read(76L, iArr, 0, this.getOutputSizes);
        int i = Camera2StreamConfigurationMap + 1;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            return iArr;
        }
        throw null;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m24729(int[] iArr) throws java.io.IOException {
        int i = Camera2StreamConfigurationMap + 85;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            m24733(iArr.length);
            util.h.xy.ai.mc.a aVar = this.getOutputSizeshNQ4ISI;
            getHighSpeedVideoSizes();
            aVar.write(0L, iArr, 1, iArr.length);
            return;
        }
        m24733(iArr.length);
        util.h.xy.ai.mc.a aVar2 = this.getOutputSizeshNQ4ISI;
        getHighSpeedVideoSizes();
        aVar2.write(76L, iArr, 0, iArr.length);
    }

    private static int Camera2StreamConfigurationMap() {
        int i = (getHighResolutionOutputSizeshNQ4ISI + 63) % 128;
        Camera2StreamConfigurationMap = i;
        int i2 = i + 75;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            return 68;
        }
        throw null;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    protected final void m24718() {
        util.h.xy.ai.mc.a aVar = this.getValidOutputFormatsForInputhNQ4ISI;
        if (aVar != null) {
            getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 47) % 128;
            try {
                aVar.dispose();
            } finally {
                this.getValidOutputFormatsForInputhNQ4ISI = null;
            }
        }
        util.h.xy.ai.mc.a aVar2 = this.isOutputSupportedFor;
        if (aVar2 != null) {
            try {
                aVar2.dispose();
            } finally {
                this.isOutputSupportedFor = null;
            }
        }
        util.h.xy.ai.mc.a aVar3 = this.accessartificialFrame;
        if (aVar3 != null) {
            try {
                aVar3.dispose();
                this.accessartificialFrame = null;
                Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 63) % 128;
            } catch (java.lang.Throwable th) {
                this.accessartificialFrame = null;
                throw th;
            }
        }
        getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 93) % 128;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public final int m24717() throws java.io.IOException {
        if (this.getOutputStallDurationlomOqCM != null && this.getOutputMinFrameDuration != null) {
            int i = (getHighResolutionOutputSizeshNQ4ISI + 29) % 128;
            Camera2StreamConfigurationMap = i;
            if (this.ArtificialStackFrames != null) {
                int i2 = i + 3;
                getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
                if (i2 % 2 != 0) {
                    throw null;
                }
                if (this.getInputFormats != null) {
                    int i3 = i + 71;
                    getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
                    if (i3 % 2 != 0) {
                        throw null;
                    }
                    if (this.coroutineCreation != null) {
                        int i4 = i + 121;
                        getHighResolutionOutputSizeshNQ4ISI = i4 % 128;
                        if (i4 % 2 != 0) {
                            throw null;
                        }
                        util.h.xy.ai.mc.a aVar = this.getValidOutputFormatsForInputhNQ4ISI;
                        if (aVar != null) {
                            try {
                                aVar.dispose();
                            } finally {
                                this.getValidOutputFormatsForInputhNQ4ISI = null;
                            }
                        }
                        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE);
                        int i5 = Camera2StreamConfigurationMap;
                        getHighResolutionOutputSizeshNQ4ISI = (i5 + 105) % 128;
                        int i6 = i5 + 109;
                        getHighResolutionOutputSizeshNQ4ISI = i6 % 128;
                        if (i6 % 2 != 0) {
                            throw null;
                        }
                        this.getValidOutputFormatsForInputhNQ4ISI = new util.h.xy.ai.mc.a(nativeSize + 103);
                        util.h.xy.ai.mc.a aVar2 = this.isOutputSupportedFor;
                        if (aVar2 != null) {
                            Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 101) % 128;
                            try {
                                aVar2.dispose();
                            } finally {
                                this.isOutputSupportedFor = null;
                            }
                        }
                        util.h.xy.ai.mc.a aVar3 = new util.h.xy.ai.mc.a(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
                        this.isOutputSupportedFor = aVar3;
                        long nativeValue = com.sun.jna.Pointer.nativeValue(this.getValidOutputFormatsForInputhNQ4ISI);
                        Camera2StreamConfigurationMap();
                        aVar3.setPointer(0L, new com.sun.jna.Pointer(nativeValue + 68));
                        util.h.xy.ai.mc.a aVar4 = this.accessartificialFrame;
                        if (aVar4 != null) {
                            getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 109) % 128;
                            try {
                                aVar4.dispose();
                                this.accessartificialFrame = null;
                                Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 47) % 128;
                            } catch (java.lang.Throwable th) {
                                this.accessartificialFrame = null;
                                throw th;
                            }
                        }
                        long nativeValue2 = com.sun.jna.Pointer.nativeValue(this.isOutputSupportedFor);
                        util.h.xy.ai.mc.a aVar5 = new util.h.xy.ai.mc.a(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
                        byte[] bArr = new byte[com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)];
                        for (int i7 = 0; i7 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i7++) {
                            int i8 = i7 * 8;
                            bArr[i7] = (byte) (((255 << i8) & nativeValue2) >> i8);
                        }
                        Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 67) % 128;
                        int i9 = 1434293148;
                        for (int i10 = 0; i10 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i10++) {
                            byte b = bArr[i10];
                            bArr[i10] = (byte) (((byte) (i9 & 255)) ^ b);
                            i9 = ((i9 << (i10 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))) | (i9 >>> (((com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8) - 1) - (i10 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))))) * (~(b & 255));
                        }
                        Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 89) % 128;
                        long j = 0;
                        for (int i11 = 0; i11 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i11++) {
                            j |= (bArr[i11] & 255) << (i11 * 8);
                        }
                        aVar5.setLong(0L, j);
                        this.accessartificialFrame = aVar5;
                        util.h.xy.ai.mg.getHighResolutionOutputSizeshNQ4ISI._GAsBZSW9wcqffkqT9Wjo5r(this.accessartificialFrame, this.getOutputStallDurationlomOqCM, this.getOutputMinFrameDuration, this.ArtificialStackFrames, this.getInputFormats, this.coroutineCreation);
                        int[] iArr = new int[1];
                        util.h.xy.ai.mc.a aVar6 = this.getValidOutputFormatsForInputhNQ4ISI;
                        Camera2StreamConfigurationMap();
                        aVar6.read(68L, iArr, 0, 1);
                        return iArr[0];
                    }
                }
            }
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI("눜᪱\ue368䠚ႅ鍊䘮⻮\uf7b5尌│跚婡⍠诧傋㥓蘕溦㝻鰡操춍驁抩쮸遶礅쇑꺑眵\udffb꒥്\uda14ꊠଥ퀵룊Ɩ\uee51뛣ᾧ\ue465䵍ᗆ\ue29e䬸Ᏺ\uf8a0", android.widget.ExpandableListView.getPackedPositionType(0L) + 43189, objArr);
        throw new java.io.IOException(((java.lang.String) objArr[0]).intern());
    }

    /* renamed from: ι, reason: contains not printable characters */
    public final void m24734() {
        int i = Camera2StreamConfigurationMap + 23;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            m24720();
            m24732();
            m24723();
            m24725();
            m24719();
            m24718();
            getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 43) % 128;
            return;
        }
        m24720();
        m24732();
        m24723();
        m24725();
        m24719();
        m24718();
        throw new java.lang.ArithmeticException();
    }
}
