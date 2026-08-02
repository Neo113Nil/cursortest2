package util.h.xy.ai;

/* loaded from: classes5.dex */
public final class ra {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static char getHighSpeedVideoFpsRanges = 29885;
    private static char getHighSpeedVideoFpsRangesFor = 4445;
    private static int getHighSpeedVideoSizes = 1;
    private static int getHighSpeedVideoSizesFor = 0;
    private static char getInputSizeshNQ4ISI = 20950;
    private static char getOutputMinFrameDuration = 19173;
    private int ArtificialStackFrames = 0;
    private util.h.xy.ai.ra.a isOutputSupportedFor = null;
    private util.h.xy.ai.ra.a getValidOutputFormatsForInputhNQ4ISI = null;
    private util.h.xy.ai.ra.a unwrapAs = null;
    private util.h.xy.ai.ra.a coroutineBoundary = null;
    private util.h.xy.ai.ra.a getInputFormats = null;
    private util.h.xy.ai.ra.a getOutputFormats = null;
    private util.h.xy.ai.ra.a _CREATION = null;
    private int coroutineCreation = 0;
    private util.h.xy.ai.ra.a getOutputSizes = null;
    private util.h.xy.ai.ra.a getOutputSizeshNQ4ISI = null;
    private util.h.xy.ai.ra.a getOutputStallDuration = null;
    private int getOutputMinFrameDurationlomOqCM = 0;
    private util.h.xy.ai.ra.a getOutputStallDurationlomOqCM = null;
    private util.h.xy.ai.ra.a isOutputSupportedForhNQ4ISI = null;
    private util.h.xy.ai.ra.a CoroutineDebuggingKt = null;
    private util.h.xy.ai.ra.a accessartificialFrame = null;

    /* renamed from: a, reason: collision with root package name */
    private util.h.xy.ai.ra.a f7074a = null;
    private util.h.xy.ai.ra.a toString = null;

    protected final void finalize() {
        int i = Camera2StreamConfigurationMap + 27;
        getHighSpeedVideoSizesFor = i % 128;
        if (i % 2 == 0) {
            m24815();
        } else {
            m24815();
            throw null;
        }
    }

    final class a extends com.sun.jna.Memory {
        private static int Camera2StreamConfigurationMap = 1;
        private static int getHighSpeedVideoFpsRangesFor;

        public a(long j) {
            super(j);
        }

        @Override // com.sun.jna.Memory
        public final void dispose() {
            int i = Camera2StreamConfigurationMap;
            int i2 = (i ^ 19) + ((i & 19) << 1);
            getHighSpeedVideoFpsRangesFor = i2 % 128;
            if (i2 % 2 == 0) {
                super.dispose();
            } else {
                super.dispose();
                throw null;
            }
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    protected final void m24824() {
        Camera2StreamConfigurationMap = (getHighSpeedVideoSizesFor + 29) % 128;
        util.h.xy.ai.ra.a aVar = this.isOutputSupportedFor;
        if (aVar != null) {
            try {
                aVar.dispose();
            } finally {
                this.isOutputSupportedFor = null;
            }
        }
        util.h.xy.ai.ra.a aVar2 = this.getValidOutputFormatsForInputhNQ4ISI;
        if (aVar2 != null) {
            try {
                aVar2.dispose();
            } finally {
                this.getValidOutputFormatsForInputhNQ4ISI = null;
            }
        }
        util.h.xy.ai.ra.a aVar3 = this.unwrapAs;
        if (aVar3 != null) {
            try {
                aVar3.dispose();
                this.unwrapAs = null;
                getHighSpeedVideoSizesFor = (Camera2StreamConfigurationMap + 43) % 128;
            } catch (java.lang.Throwable th) {
                this.unwrapAs = null;
                throw th;
            }
        }
        int i = Camera2StreamConfigurationMap + 25;
        getHighSpeedVideoSizesFor = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private static void getHighSpeedVideoFpsRanges(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2;
        int i3 = (getHighSpeedVideoSizes + 87) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i3;
        int i4 = i3 + 67;
        getHighSpeedVideoSizes = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        char[] charArray = str.toCharArray();
        util.h.xz.b.e eVar = new util.h.xz.b.e();
        char[] cArr = new char[charArray.length];
        eVar.f2630 = 0;
        char[] cArr2 = new char[2];
        while (eVar.f2630 < charArray.length) {
            int i5 = getHighSpeedVideoSizes + 23;
            getHighResolutionOutputSizeshNQ4ISI = i5 % 128;
            int i6 = 58224;
            if (i5 % 2 != 0) {
                cArr2[0] = charArray[eVar.f2630];
                cArr2[0] = charArray[eVar.f2630];
                i2 = 1;
            } else {
                cArr2[0] = charArray[eVar.f2630];
                cArr2[1] = charArray[eVar.f2630 + 1];
                i2 = 0;
            }
            while (i2 < 16) {
                char c = cArr2[1];
                char c2 = cArr2[0];
                char c3 = (char) (c - (((c2 + i6) ^ ((c2 << 4) + ((char) (getHighSpeedVideoFpsRanges ^ 3155153533016530592L)))) ^ ((c2 >>> 5) + ((char) (getOutputMinFrameDuration ^ 3155153533016530592L)))));
                cArr2[1] = c3;
                cArr2[0] = (char) (c2 - ((((c3 << 4) + ((char) (getInputSizeshNQ4ISI ^ 3155153533016530592L))) ^ (c3 + i6)) ^ ((c3 >>> 5) + ((char) (getHighSpeedVideoFpsRangesFor ^ 3155153533016530592L)))));
                i6 -= 40503;
                i2++;
            }
            cArr[eVar.f2630] = cArr2[0];
            cArr[eVar.f2630 + 1] = cArr2[1];
            eVar.f2630 += 2;
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 17) % 128;
        }
        objArr[0] = new java.lang.String(cArr, 0, i);
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m24822(int i) {
        int i2 = getHighSpeedVideoSizesFor + 87;
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 != 0) {
            this.ArtificialStackFrames = i;
            util.h.xy.ai.ra.a aVar = this.isOutputSupportedFor;
            if (aVar != null) {
                try {
                    aVar.dispose();
                } finally {
                    this.isOutputSupportedFor = null;
                }
            }
            int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE) * i;
            int i3 = (getHighSpeedVideoSizesFor + 23) % 128;
            Camera2StreamConfigurationMap = i3;
            getHighSpeedVideoSizesFor = (i3 + 7) % 128;
            this.isOutputSupportedFor = new util.h.xy.ai.ra.a(nativeSize + 103);
            util.h.xy.ai.ra.a aVar2 = this.getValidOutputFormatsForInputhNQ4ISI;
            if (aVar2 != null) {
                try {
                    aVar2.dispose();
                } finally {
                    this.getValidOutputFormatsForInputhNQ4ISI = null;
                }
            }
            util.h.xy.ai.ra.a aVar3 = new util.h.xy.ai.ra.a(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
            this.getValidOutputFormatsForInputhNQ4ISI = aVar3;
            long nativeValue = com.sun.jna.Pointer.nativeValue(this.isOutputSupportedFor);
            int i4 = Camera2StreamConfigurationMap;
            getHighSpeedVideoSizesFor = (i4 + 87) % 128;
            getHighSpeedVideoSizesFor = (i4 + 21) % 128;
            aVar3.setPointer(0L, new com.sun.jna.Pointer(nativeValue + 74));
            util.h.xy.ai.ra.a aVar4 = this.unwrapAs;
            if (aVar4 != null) {
                try {
                    aVar4.dispose();
                } finally {
                    this.unwrapAs = null;
                }
            }
            long nativeValue2 = com.sun.jna.Pointer.nativeValue(this.getValidOutputFormatsForInputhNQ4ISI);
            util.h.xy.ai.ra.a aVar5 = new util.h.xy.ai.ra.a(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
            aVar5.setLong(0L, nativeValue2 ^ 1415302072);
            int i5 = Camera2StreamConfigurationMap;
            int i6 = i5 + 7;
            getHighSpeedVideoSizesFor = i6 % 128;
            if (i6 % 2 == 0) {
                this.unwrapAs = aVar5;
                getHighSpeedVideoSizesFor = (i5 + 53) % 128;
                return;
            }
            throw new java.lang.ArithmeticException();
        }
        this.ArtificialStackFrames = i;
        throw null;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m24823(byte[] bArr) throws java.io.IOException {
        int i = getHighSpeedVideoSizesFor + 107;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 == 0) {
            m24822(bArr.length);
            util.h.xy.ai.ra.a aVar = this.isOutputSupportedFor;
            int i2 = Camera2StreamConfigurationMap;
            getHighSpeedVideoSizesFor = (i2 + 87) % 128;
            getHighSpeedVideoSizesFor = (i2 + 21) % 128;
            int i3 = 1 / 74;
            aVar.write(0L, bArr, 1, bArr.length);
        } else {
            m24822(bArr.length);
            util.h.xy.ai.ra.a aVar2 = this.isOutputSupportedFor;
            int i4 = Camera2StreamConfigurationMap;
            getHighSpeedVideoSizesFor = (i4 + 87) % 128;
            getHighSpeedVideoSizesFor = (i4 + 21) % 128;
            aVar2.write(74L, bArr, 0, bArr.length);
        }
        int i5 = Camera2StreamConfigurationMap + 85;
        getHighSpeedVideoSizesFor = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    protected final void m24816() {
        util.h.xy.ai.ra.a aVar = this.coroutineBoundary;
        if (aVar != null) {
            try {
                aVar.dispose();
                this.coroutineBoundary = null;
                getHighSpeedVideoSizesFor = (Camera2StreamConfigurationMap + 107) % 128;
            } catch (java.lang.Throwable th) {
                this.coroutineBoundary = null;
                throw th;
            }
        }
        util.h.xy.ai.ra.a aVar2 = this.getInputFormats;
        if (aVar2 != null) {
            int i = Camera2StreamConfigurationMap + 111;
            getHighSpeedVideoSizesFor = i % 128;
            try {
                if (i % 2 == 0) {
                    aVar2.dispose();
                } else {
                    aVar2.dispose();
                    throw null;
                }
            } finally {
                this.getInputFormats = null;
            }
        }
    }

    private util.h.xy.ai.ra.a getHighSpeedVideoFpsRanges(long j) {
        util.h.xy.ai.ra.a aVar = new util.h.xy.ai.ra.a(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        byte[] bArr = new byte[com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)];
        int i = 0;
        while (i < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)) {
            int i2 = getHighSpeedVideoSizesFor + 101;
            Camera2StreamConfigurationMap = i2 % 128;
            if (i2 % 2 == 0) {
                bArr[i] = (byte) (((255 << (i % 61)) | j) >>> (i - 33));
                i += 93;
            } else {
                int i3 = i * 8;
                bArr[i] = (byte) (((255 << i3) & j) >> i3);
                i++;
            }
        }
        int i4 = 1807877756;
        for (int i5 = 0; i5 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i5++) {
            getHighSpeedVideoSizesFor = (Camera2StreamConfigurationMap + 55) % 128;
            byte b = bArr[i5];
            bArr[i5] = (byte) (((byte) (i4 & 255)) ^ b);
            i4 = ((i4 << (i5 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))) | (i4 >>> (((com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8) - 1) - (i5 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))))) * (~(b & 255));
        }
        long j2 = 0;
        for (int i6 = 0; i6 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i6++) {
            Camera2StreamConfigurationMap = (getHighSpeedVideoSizesFor + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
            j2 |= (bArr[i6] & 255) << (i6 * 8);
        }
        aVar.setLong(0L, j2);
        return aVar;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m24828(int i) {
        getHighSpeedVideoSizesFor = (Camera2StreamConfigurationMap + 59) % 128;
        util.h.xy.ai.ra.a aVar = this.coroutineBoundary;
        if (aVar != null) {
            try {
                aVar.dispose();
            } finally {
                this.coroutineBoundary = null;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE);
        int i2 = getHighSpeedVideoSizesFor + 41;
        Camera2StreamConfigurationMap = i2 % 128;
        util.h.xy.ai.ra.a aVar2 = new util.h.xy.ai.ra.a(nativeSize + (i2 % 2 == 0 ? 10 : 121));
        this.coroutineBoundary = aVar2;
        int i3 = Camera2StreamConfigurationMap + 49;
        getHighSpeedVideoSizesFor = i3 % 128;
        aVar2.setInt(i3 % 2 != 0 ? 57 : 80, i);
        util.h.xy.ai.ra.a aVar3 = this.getInputFormats;
        if (aVar3 != null) {
            int i4 = Camera2StreamConfigurationMap + 91;
            getHighSpeedVideoSizesFor = i4 % 128;
            try {
                if (i4 % 2 == 0) {
                    aVar3.dispose();
                } else {
                    aVar3.dispose();
                    throw null;
                }
            } finally {
                this.getInputFormats = null;
            }
        }
        long nativeValue = com.sun.jna.Pointer.nativeValue(this.coroutineBoundary);
        int i5 = Camera2StreamConfigurationMap + 49;
        getHighSpeedVideoSizesFor = i5 % 128;
        this.getInputFormats = getHighSpeedVideoFpsRanges(nativeValue + (i5 % 2 == 0 ? 80 : 57));
    }

    private static int getHighSpeedVideoSizes() {
        int i = getHighSpeedVideoSizesFor;
        int i2 = i + 45;
        Camera2StreamConfigurationMap = i2 % 128;
        int i3 = i2 % 2 == 0 ? 48 : 102;
        Camera2StreamConfigurationMap = (i + 23) % 128;
        return i3;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    protected final void m24821() {
        int i = Camera2StreamConfigurationMap + 59;
        getHighSpeedVideoSizesFor = i % 128;
        if (i % 2 == 0) {
            util.h.xy.ai.ra.a aVar = this.getOutputFormats;
            if (aVar != null) {
                try {
                    aVar.dispose();
                } finally {
                    this.getOutputFormats = null;
                }
            }
            util.h.xy.ai.ra.a aVar2 = this._CREATION;
            if (aVar2 != null) {
                Camera2StreamConfigurationMap = (getHighSpeedVideoSizesFor + 1) % 128;
                try {
                    aVar2.dispose();
                    return;
                } finally {
                    this._CREATION = null;
                }
            }
            return;
        }
        throw null;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m24819(int i) {
        util.h.xy.ai.ra.a aVar = this.getOutputFormats;
        if (aVar != null) {
            int i2 = getHighSpeedVideoSizesFor + 69;
            Camera2StreamConfigurationMap = i2 % 128;
            try {
                if (i2 % 2 == 0) {
                    aVar.dispose();
                    throw null;
                }
                aVar.dispose();
            } finally {
                this.getOutputFormats = null;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE);
        int i3 = Camera2StreamConfigurationMap + 23;
        getHighSpeedVideoSizesFor = i3 % 128;
        util.h.xy.ai.ra.a aVar2 = new util.h.xy.ai.ra.a(nativeSize + (i3 % 2 != 0 ? 24417 : 153));
        this.getOutputFormats = aVar2;
        aVar2.setInt(getHighSpeedVideoSizes(), i);
        util.h.xy.ai.ra.a aVar3 = this._CREATION;
        if (aVar3 != null) {
            int i4 = getHighSpeedVideoSizesFor + 71;
            Camera2StreamConfigurationMap = i4 % 128;
            try {
                if (i4 % 2 == 0) {
                    aVar3.dispose();
                    throw null;
                }
                aVar3.dispose();
            } finally {
                this._CREATION = null;
            }
        }
        long nativeValue = com.sun.jna.Pointer.nativeValue(this.getOutputFormats) + getHighSpeedVideoSizes();
        util.h.xy.ai.ra.a aVar4 = new util.h.xy.ai.ra.a(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        aVar4.setLong(0L, nativeValue ^ 790187043);
        int i5 = Camera2StreamConfigurationMap + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        getHighSpeedVideoSizesFor = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
        this._CREATION = aVar4;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    protected final void m24818() {
        util.h.xy.ai.ra.a aVar = this.getOutputSizes;
        if (aVar != null) {
            getHighSpeedVideoSizesFor = (Camera2StreamConfigurationMap + 23) % 128;
            try {
                aVar.dispose();
            } finally {
                this.getOutputSizes = null;
            }
        }
        util.h.xy.ai.ra.a aVar2 = this.getOutputSizeshNQ4ISI;
        if (aVar2 != null) {
            try {
                aVar2.dispose();
            } finally {
                this.getOutputSizeshNQ4ISI = null;
            }
        }
        util.h.xy.ai.ra.a aVar3 = this.getOutputStallDuration;
        if (aVar3 != null) {
            getHighSpeedVideoSizesFor = (Camera2StreamConfigurationMap + 57) % 128;
            try {
                aVar3.dispose();
            } finally {
                this.getOutputStallDuration = null;
            }
        }
        int i = getHighSpeedVideoSizesFor + 31;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m24825(int i) {
        int i2 = (getHighSpeedVideoSizesFor + 3) % 128;
        Camera2StreamConfigurationMap = i2;
        this.coroutineCreation = i;
        util.h.xy.ai.ra.a aVar = this.getOutputSizes;
        if (aVar != null) {
            getHighSpeedVideoSizesFor = (i2 + 125) % 128;
            try {
                aVar.dispose();
                this.getOutputSizes = null;
                getHighSpeedVideoSizesFor = (Camera2StreamConfigurationMap + 97) % 128;
            } catch (java.lang.Throwable th) {
                this.getOutputSizes = null;
                throw th;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE) * i;
        int i3 = (getHighSpeedVideoSizesFor + 83) % 128;
        Camera2StreamConfigurationMap = i3;
        getHighSpeedVideoSizesFor = (i3 + 121) % 128;
        this.getOutputSizes = new util.h.xy.ai.ra.a(nativeSize + 83);
        util.h.xy.ai.ra.a aVar2 = this.getOutputSizeshNQ4ISI;
        if (aVar2 != null) {
            try {
                aVar2.dispose();
            } finally {
                this.getOutputSizeshNQ4ISI = null;
            }
        }
        util.h.xy.ai.ra.a aVar3 = new util.h.xy.ai.ra.a(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        this.getOutputSizeshNQ4ISI = aVar3;
        long nativeValue = com.sun.jna.Pointer.nativeValue(this.getOutputSizes);
        int i4 = getHighSpeedVideoSizesFor + 119;
        Camera2StreamConfigurationMap = i4 % 128;
        aVar3.setPointer(0L, new com.sun.jna.Pointer(nativeValue + (i4 % 2 == 0 ? 50 : 70)));
        util.h.xy.ai.ra.a aVar4 = this.getOutputStallDuration;
        if (aVar4 != null) {
            try {
                aVar4.dispose();
            } finally {
                this.getOutputStallDuration = null;
            }
        }
        long nativeValue2 = com.sun.jna.Pointer.nativeValue(this.getOutputSizeshNQ4ISI);
        util.h.xy.ai.ra.a aVar5 = new util.h.xy.ai.ra.a(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        aVar5.setLong(0L, nativeValue2 ^ 2033296166);
        getHighSpeedVideoSizesFor = (Camera2StreamConfigurationMap + 105) % 128;
        this.getOutputStallDuration = aVar5;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final byte[] m24829() throws java.io.IOException {
        int i = (Camera2StreamConfigurationMap + 55) % 128;
        getHighSpeedVideoSizesFor = i;
        util.h.xy.ai.ra.a aVar = this.getOutputSizes;
        if (aVar == null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("밯\ue451ಯ䧢빽梧\ud8af鄏┶\uf874敖壟蝏\u169e닻Θ뎬ﾴ指\ue2f7枸‒䁢羯\uea90\ue7f4\uea2f\u2b74鱳\uf5a7佣\uf389샥\uf2e4旓뼣Ὦ坆燶讓", android.graphics.Color.green(0) + 39, objArr);
            throw new java.io.IOException(((java.lang.String) objArr[0]).intern());
        }
        int i2 = this.coroutineCreation;
        byte[] bArr = new byte[i2];
        int i3 = i + 119;
        Camera2StreamConfigurationMap = i3 % 128;
        aVar.read(i3 % 2 == 0 ? 50 : 70, bArr, 0, i2);
        int i4 = getHighSpeedVideoSizesFor + 49;
        Camera2StreamConfigurationMap = i4 % 128;
        if (i4 % 2 != 0) {
            return bArr;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m24820(byte[] bArr) throws java.io.IOException {
        int i = getHighSpeedVideoSizesFor + 43;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 == 0) {
            m24825(bArr.length);
            util.h.xy.ai.ra.a aVar = this.getOutputSizes;
            int i2 = getHighSpeedVideoSizesFor + 119;
            Camera2StreamConfigurationMap = i2 % 128;
            int i3 = 1 % (i2 % 2 != 0 ? 70 : 50);
            aVar.write(1L, bArr, 0, bArr.length);
        } else {
            m24825(bArr.length);
            util.h.xy.ai.ra.a aVar2 = this.getOutputSizes;
            int i4 = getHighSpeedVideoSizesFor + 119;
            Camera2StreamConfigurationMap = i4 % 128;
            aVar2.write(i4 % 2 != 0 ? 70 : 50, bArr, 0, bArr.length);
        }
        int i5 = getHighSpeedVideoSizesFor + 85;
        Camera2StreamConfigurationMap = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ͺ, reason: contains not printable characters */
    protected final void m24827() {
        int i = (Camera2StreamConfigurationMap + 63) % 128;
        getHighSpeedVideoSizesFor = i;
        util.h.xy.ai.ra.a aVar = this.getOutputStallDurationlomOqCM;
        if (aVar != null) {
            int i2 = i + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
            Camera2StreamConfigurationMap = i2 % 128;
            try {
                if (i2 % 2 != 0) {
                    aVar.dispose();
                } else {
                    aVar.dispose();
                    throw null;
                }
            } finally {
                this.getOutputStallDurationlomOqCM = null;
            }
        }
        util.h.xy.ai.ra.a aVar2 = this.isOutputSupportedForhNQ4ISI;
        if (aVar2 != null) {
            try {
                aVar2.dispose();
            } finally {
                this.isOutputSupportedForhNQ4ISI = null;
            }
        }
        util.h.xy.ai.ra.a aVar3 = this.CoroutineDebuggingKt;
        if (aVar3 != null) {
            try {
                aVar3.dispose();
            } finally {
                this.CoroutineDebuggingKt = null;
            }
        }
    }

    private util.h.xy.ai.ra.a getHighResolutionOutputSizeshNQ4ISI(long j) {
        util.h.xy.ai.ra.a aVar = new util.h.xy.ai.ra.a(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        byte[] bArr = new byte[com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)];
        int i = 0;
        int i2 = 0;
        while (i2 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)) {
            int i3 = (Camera2StreamConfigurationMap + 93) % 128;
            getHighSpeedVideoSizesFor = i3;
            int i4 = i2 * 8;
            bArr[i2] = (byte) (((255 << i4) & j) >> i4);
            i2++;
            Camera2StreamConfigurationMap = (i3 + 87) % 128;
        }
        int i5 = 1015605453;
        for (int i6 = 0; i6 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i6++) {
            byte b = bArr[i6];
            bArr[i6] = (byte) (((byte) (i5 & 255)) ^ b);
            i5 = ((i5 << (i6 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))) | (i5 >>> (((com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8) - 1) - (i6 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))))) * (~(b & 255));
        }
        long j2 = 0;
        while (i < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)) {
            j2 |= (bArr[i] & 255) << (i * 8);
            i++;
            Camera2StreamConfigurationMap = (getHighSpeedVideoSizesFor + 37) % 128;
        }
        aVar.setLong(0L, j2);
        return aVar;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m24817(int i) {
        int i2 = Camera2StreamConfigurationMap + 97;
        getHighSpeedVideoSizesFor = i2 % 128;
        if (i2 % 2 == 0) {
            this.getOutputMinFrameDurationlomOqCM = i;
            util.h.xy.ai.ra.a aVar = this.getOutputStallDurationlomOqCM;
            if (aVar != null) {
                try {
                    aVar.dispose();
                } finally {
                    this.getOutputStallDurationlomOqCM = null;
                }
            }
            int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * i;
            int i3 = Camera2StreamConfigurationMap;
            getHighSpeedVideoSizesFor = (i3 + 107) % 128;
            int i4 = i3 + 95;
            getHighSpeedVideoSizesFor = i4 % 128;
            if (i4 % 2 == 0) {
                this.getOutputStallDurationlomOqCM = new util.h.xy.ai.ra.a(nativeSize + 115);
                util.h.xy.ai.ra.a aVar2 = this.isOutputSupportedForhNQ4ISI;
                if (aVar2 != null) {
                    int i5 = Camera2StreamConfigurationMap + 49;
                    getHighSpeedVideoSizesFor = i5 % 128;
                    try {
                        if (i5 % 2 != 0) {
                            aVar2.dispose();
                            throw null;
                        }
                        aVar2.dispose();
                        this.isOutputSupportedForhNQ4ISI = null;
                        getHighSpeedVideoSizesFor = (Camera2StreamConfigurationMap + 71) % 128;
                    } finally {
                        this.isOutputSupportedForhNQ4ISI = null;
                    }
                }
                util.h.xy.ai.ra.a aVar3 = new util.h.xy.ai.ra.a(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
                this.isOutputSupportedForhNQ4ISI = aVar3;
                long nativeValue = com.sun.jna.Pointer.nativeValue(this.getOutputStallDurationlomOqCM);
                int i6 = (getHighSpeedVideoSizesFor + 125) % 128;
                Camera2StreamConfigurationMap = i6;
                getHighSpeedVideoSizesFor = (i6 + 101) % 128;
                aVar3.setPointer(0L, new com.sun.jna.Pointer(nativeValue + 92));
                util.h.xy.ai.ra.a aVar4 = this.CoroutineDebuggingKt;
                if (aVar4 != null) {
                    try {
                        aVar4.dispose();
                    } finally {
                        this.CoroutineDebuggingKt = null;
                    }
                }
                this.CoroutineDebuggingKt = getHighResolutionOutputSizeshNQ4ISI(com.sun.jna.Pointer.nativeValue(this.isOutputSupportedForhNQ4ISI));
                return;
            }
            throw null;
        }
        this.getOutputMinFrameDurationlomOqCM = i;
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ι, reason: contains not printable characters */
    public final int[] m24830() throws java.io.IOException {
        int i = getHighSpeedVideoSizesFor;
        Camera2StreamConfigurationMap = (i + 95) % 128;
        util.h.xy.ai.ra.a aVar = this.getOutputStallDurationlomOqCM;
        if (aVar == null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("밯\ue451ಯ䧢빽梧\ud8af鄏┶\uf874敖壟蝏\u169e닻Θ뎬ﾴ䪜葤ꘟ䂚燾\ue321뻴ດ祧䴜鞒\ue7c2榵⏉\uddbb몭疉\uf547螂\uf6fd御籓쿚ᘒಯ䧢", 44 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr);
            throw new java.io.IOException(((java.lang.String) objArr[0]).intern());
        }
        int i2 = this.getOutputMinFrameDurationlomOqCM;
        int[] iArr = new int[i2];
        int i3 = (i + 125) % 128;
        Camera2StreamConfigurationMap = i3;
        getHighSpeedVideoSizesFor = (i3 + 101) % 128;
        aVar.read(92L, iArr, 0, i2);
        getHighSpeedVideoSizesFor = (Camera2StreamConfigurationMap + 93) % 128;
        return iArr;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m24826(int[] iArr) throws java.io.IOException {
        int i = Camera2StreamConfigurationMap + 65;
        getHighSpeedVideoSizesFor = i % 128;
        if (i % 2 != 0) {
            m24817(iArr.length);
            util.h.xy.ai.ra.a aVar = this.getOutputStallDurationlomOqCM;
            int i2 = (getHighSpeedVideoSizesFor + 125) % 128;
            Camera2StreamConfigurationMap = i2;
            getHighSpeedVideoSizesFor = (i2 + 101) % 128;
            aVar.write(92L, iArr, 1, iArr.length);
        } else {
            m24817(iArr.length);
            util.h.xy.ai.ra.a aVar2 = this.getOutputStallDurationlomOqCM;
            int i3 = (getHighSpeedVideoSizesFor + 125) % 128;
            Camera2StreamConfigurationMap = i3;
            getHighSpeedVideoSizesFor = (i3 + 101) % 128;
            aVar2.write(92L, iArr, 0, iArr.length);
        }
        Camera2StreamConfigurationMap = (getHighSpeedVideoSizesFor + 113) % 128;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    protected final void m24813() {
        int i = getHighSpeedVideoSizesFor;
        Camera2StreamConfigurationMap = (i + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        util.h.xy.ai.ra.a aVar = this.accessartificialFrame;
        if (aVar != null) {
            Camera2StreamConfigurationMap = (i + 19) % 128;
            try {
                aVar.dispose();
                this.accessartificialFrame = null;
                getHighSpeedVideoSizesFor = (Camera2StreamConfigurationMap + 71) % 128;
            } catch (java.lang.Throwable th) {
                this.accessartificialFrame = null;
                throw th;
            }
        }
        util.h.xy.ai.ra.a aVar2 = this.f7074a;
        if (aVar2 != null) {
            int i2 = Camera2StreamConfigurationMap + 63;
            getHighSpeedVideoSizesFor = i2 % 128;
            try {
                if (i2 % 2 != 0) {
                    aVar2.dispose();
                    throw null;
                }
                aVar2.dispose();
            } finally {
                this.f7074a = null;
            }
        }
        util.h.xy.ai.ra.a aVar3 = this.toString;
        if (aVar3 != null) {
            try {
                aVar3.dispose();
            } finally {
                this.toString = null;
            }
        }
    }

    private util.h.xy.ai.ra.a getHighSpeedVideoFpsRangesFor(long j) {
        util.h.xy.ai.ra.a aVar = new util.h.xy.ai.ra.a(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        byte[] bArr = new byte[com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)];
        for (int i = 0; i < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i++) {
            int i2 = i * 8;
            bArr[i] = (byte) (((255 << i2) & j) >> i2);
        }
        int i3 = 285509138;
        for (int i4 = 0; i4 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i4++) {
            Camera2StreamConfigurationMap = (getHighSpeedVideoSizesFor + 23) % 128;
            byte b = bArr[i4];
            bArr[i4] = (byte) (((byte) (i3 & 255)) ^ b);
            i3 = ((i3 << (i4 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))) | (i3 >>> (((com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8) - 1) - (i4 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))))) * (~(b & 255));
        }
        Camera2StreamConfigurationMap = (getHighSpeedVideoSizesFor + 33) % 128;
        long j2 = 0;
        for (int i5 = 0; i5 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i5++) {
            j2 |= (bArr[i5] & 255) << (i5 * 8);
        }
        aVar.setLong(0L, j2);
        int i6 = Camera2StreamConfigurationMap + 19;
        getHighSpeedVideoSizesFor = i6 % 128;
        if (i6 % 2 == 0) {
            return aVar;
        }
        throw null;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public final int m24814() throws java.io.IOException {
        if (this.unwrapAs != null) {
            int i = getHighSpeedVideoSizesFor;
            int i2 = i + 65;
            Camera2StreamConfigurationMap = i2 % 128;
            if (i2 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            if (this.getInputFormats != null) {
                int i3 = (i + 91) % 128;
                Camera2StreamConfigurationMap = i3;
                if (this._CREATION != null) {
                    int i4 = i3 + 115;
                    getHighSpeedVideoSizesFor = i4 % 128;
                    if (i4 % 2 != 0) {
                        throw null;
                    }
                    if (this.getOutputStallDuration != null && this.CoroutineDebuggingKt != null) {
                        util.h.xy.ai.ra.a aVar = this.accessartificialFrame;
                        if (aVar != null) {
                            try {
                                aVar.dispose();
                            } finally {
                                this.accessartificialFrame = null;
                            }
                        }
                        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE);
                        int i5 = getHighSpeedVideoSizesFor;
                        int i6 = i5 + 67;
                        Camera2StreamConfigurationMap = i6 % 128;
                        int i7 = i6 % 2 == 0 ? 9221 : 135;
                        int i8 = i5 + 63;
                        Camera2StreamConfigurationMap = i8 % 128;
                        if (i8 % 2 == 0) {
                            throw new java.lang.ArithmeticException();
                        }
                        this.accessartificialFrame = new util.h.xy.ai.ra.a(nativeSize + i7);
                        util.h.xy.ai.ra.a aVar2 = this.f7074a;
                        if (aVar2 != null) {
                            try {
                                aVar2.dispose();
                            } finally {
                                this.f7074a = null;
                            }
                        }
                        util.h.xy.ai.ra.a aVar3 = new util.h.xy.ai.ra.a(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
                        this.f7074a = aVar3;
                        long nativeValue = com.sun.jna.Pointer.nativeValue(this.accessartificialFrame);
                        int i9 = getHighSpeedVideoSizesFor;
                        Camera2StreamConfigurationMap = (i9 + 105) % 128;
                        Camera2StreamConfigurationMap = (i9 + 21) % 128;
                        aVar3.setPointer(0L, new com.sun.jna.Pointer(nativeValue + 86));
                        util.h.xy.ai.ra.a aVar4 = this.toString;
                        if (aVar4 != null) {
                            getHighSpeedVideoSizesFor = (Camera2StreamConfigurationMap + 41) % 128;
                            try {
                                aVar4.dispose();
                            } finally {
                                this.toString = null;
                            }
                        }
                        this.toString = getHighSpeedVideoFpsRangesFor(com.sun.jna.Pointer.nativeValue(this.f7074a));
                        util.h.xy.ai.md.Camera2StreamConfigurationMap._EFCoEKTUses2xrNi72s9N8(this.toString, this.unwrapAs, this.getInputFormats, this._CREATION, this.getOutputStallDuration, this.CoroutineDebuggingKt);
                        int[] iArr = new int[1];
                        util.h.xy.ai.ra.a aVar5 = this.accessartificialFrame;
                        int i10 = getHighSpeedVideoSizesFor;
                        Camera2StreamConfigurationMap = (i10 + 105) % 128;
                        Camera2StreamConfigurationMap = (i10 + 21) % 128;
                        aVar5.read(86L, iArr, 0, 1);
                        return iArr[0];
                    }
                }
            }
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("밯\ue451ಯ䧢빽梧\ud8af鄏┶\uf874\ud8af鄏┶\uf874델笴ӕ噸〮츜瞹뿠Ὦ坆鑾塨颶ꖠ窛詽ӕ噸傐怢䰛뫀줧띩耑鎳ヴᓲ皆\ud995御籓쿚ᘒಯ䧢", 49 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr);
        throw new java.io.IOException(((java.lang.String) objArr[0]).intern());
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public final void m24815() {
        int i = Camera2StreamConfigurationMap + 117;
        getHighSpeedVideoSizesFor = i % 128;
        if (i % 2 == 0) {
            m24824();
            m24816();
            m24821();
            m24818();
            m24827();
            m24813();
            return;
        }
        m24824();
        m24816();
        m24821();
        m24818();
        m24827();
        m24813();
        throw null;
    }
}
