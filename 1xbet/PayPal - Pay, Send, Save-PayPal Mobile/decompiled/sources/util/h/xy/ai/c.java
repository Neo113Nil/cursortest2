package util.h.xy.ai;

/* loaded from: classes5.dex */
public final class c {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static int getOutputFormats = 1;
    private static char[] getHighSpeedVideoSizes = {40044, 25860, 28306, 28709, 31201, 17234, 17600, 20093, 22509, 22737, 8722, 11188, 11573, 14078, 14420, 485, 2929, 3076, 5525, 7955, 57528, 59973, 62404, 62803, 65268, 51095, 51463, 53940, 54323, 56802, 42824, 43243, 45668, 47953, 48263, 34360, 36787, 37186, 39637, 40044, 25860, 28306, 28709, 31201, 17234, 17600, 20093, 22509, 22737, 8722, 11188, 11573, 14078, 14420, 485, 2929, 3076, 5525, 7965, 57508, 59999, 62406, 62821, 65257, 51128, 51471, 53925, 54275, 56772, 42823, 43255, 45668, 47875, 48306, 34360, 36795, 37204, 39553, 40055, 26088, 28291, 28690, 31141, 40044, 25860, 28306, 28709, 31201, 17234, 17600, 20093, 22509, 22737, 8704, 11197, 11565, 13969, 14417, 496, 2931, 3088, 5516, 7988, 57525, 59988, 62419, 62818, 65185, 51093, 51460, 53938, 54317, 56784, 42835, 43248, 45685, 47896, 48270, 34367, 36833, 37212, 39620, 40037, 26089, 28318, 28677, 31138, 17249, 17623, 20040, 22499, 22898, 8709};
    private static long getHighSpeedVideoFpsRanges = 41688071052879217L;
    private int getOutputMinFrameDurationlomOqCM = 0;
    private util.h.xy.ai.c.mb accessartificialFrame = null;
    private util.h.xy.ai.c.mb toString = null;
    private util.h.xy.ai.c.mb getOutputStallDurationlomOqCM = null;
    private util.h.xy.ai.c.mb getValidOutputFormatsForInputhNQ4ISI = null;
    private util.h.xy.ai.c.mb unwrapAs = null;
    private int getInputSizeshNQ4ISI = 0;
    private util.h.xy.ai.c.mb ArtificialStackFrames = null;
    private util.h.xy.ai.c.mb getOutputMinFrameDuration = null;
    private util.h.xy.ai.c.mb getInputFormats = null;
    private int getOutputSizes = 0;
    private util.h.xy.ai.c.mb isOutputSupportedForhNQ4ISI = null;
    private util.h.xy.ai.c.mb getOutputStallDuration = null;
    private util.h.xy.ai.c.mb getOutputSizeshNQ4ISI = null;
    private util.h.xy.ai.c.mb getHighSpeedVideoSizesFor = null;
    private util.h.xy.ai.c.mb CoroutineDebuggingKt = null;
    private util.h.xy.ai.c.mb coroutineCreation = null;
    private util.h.xy.ai.c.mb isOutputSupportedFor = null;
    private util.h.xy.ai.c.mb coroutineBoundary = null;

    protected final void finalize() {
        getOutputFormats = (getHighResolutionOutputSizeshNQ4ISI + 7) % 128;
        m24617();
        getHighResolutionOutputSizeshNQ4ISI = (getOutputFormats + 59) % 128;
    }

    final class mb extends com.sun.jna.Memory {
        private static int getHighSpeedVideoFpsRangesFor = 0;
        private static int getHighSpeedVideoSizes = 1;

        public mb(long j) {
            super(j);
        }

        @Override // com.sun.jna.Memory
        public final void dispose() {
            int i = getHighSpeedVideoSizes + 93;
            getHighSpeedVideoFpsRangesFor = i % 128;
            if (i % 2 == 0) {
                super.dispose();
                int i2 = getHighSpeedVideoFpsRangesFor;
                getHighSpeedVideoSizes = ((i2 ^ 63) + ((i2 & 63) << 1)) % 128;
                return;
            }
            super.dispose();
            throw null;
        }
    }

    private static void getHighSpeedVideoFpsRanges(int i, int i2, char c, java.lang.Object[] objArr) {
        util.h.xz.b.rb rbVar = new util.h.xz.b.rb();
        long[] jArr = new long[i];
        rbVar.f2651 = 0;
        while (rbVar.f2651 < i) {
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 35) % 128;
            jArr[rbVar.f2651] = (((char) (getHighSpeedVideoSizes[rbVar.f2651 + i2] ^ 3446303986615426049L)) ^ (rbVar.f2651 * (3446303986615426049L ^ getHighSpeedVideoFpsRanges))) ^ c;
            rbVar.f2651++;
        }
        char[] cArr = new char[i];
        rbVar.f2651 = 0;
        while (rbVar.f2651 < i) {
            cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
            rbVar.f2651++;
        }
        java.lang.String str = new java.lang.String(cArr);
        getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 13) % 128;
        objArr[0] = str;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    protected final void m24630() {
        util.h.xy.ai.c.mb mbVar = this.accessartificialFrame;
        if (mbVar != null) {
            int i = getOutputFormats + 91;
            getHighResolutionOutputSizeshNQ4ISI = i % 128;
            try {
                if (i % 2 != 0) {
                    mbVar.dispose();
                    throw null;
                }
                mbVar.dispose();
            } finally {
                this.accessartificialFrame = null;
            }
        }
        util.h.xy.ai.c.mb mbVar2 = this.toString;
        if (mbVar2 != null) {
            try {
                mbVar2.dispose();
                this.toString = null;
                getOutputFormats = (getHighResolutionOutputSizeshNQ4ISI + 17) % 128;
            } catch (java.lang.Throwable th) {
                this.toString = null;
                throw th;
            }
        }
        util.h.xy.ai.c.mb mbVar3 = this.getOutputStallDurationlomOqCM;
        if (mbVar3 != null) {
            getHighResolutionOutputSizeshNQ4ISI = (getOutputFormats + 63) % 128;
            try {
                mbVar3.dispose();
            } finally {
                this.getOutputStallDurationlomOqCM = null;
            }
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m24620(int i) {
        getHighResolutionOutputSizeshNQ4ISI = (getOutputFormats + 65) % 128;
        this.getOutputMinFrameDurationlomOqCM = i;
        util.h.xy.ai.c.mb mbVar = this.accessartificialFrame;
        if (mbVar != null) {
            try {
                mbVar.dispose();
            } finally {
                this.accessartificialFrame = null;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE) * i;
        int i2 = getHighResolutionOutputSizeshNQ4ISI + 13;
        getOutputFormats = i2 % 128;
        this.accessartificialFrame = new util.h.xy.ai.c.mb(nativeSize + (i2 % 2 == 0 ? 49 : 117));
        util.h.xy.ai.c.mb mbVar2 = this.toString;
        if (mbVar2 != null) {
            getHighResolutionOutputSizeshNQ4ISI = (getOutputFormats + 93) % 128;
            try {
                mbVar2.dispose();
            } finally {
                this.toString = null;
            }
        }
        util.h.xy.ai.c.mb mbVar3 = new util.h.xy.ai.c.mb(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        this.toString = mbVar3;
        long nativeValue = com.sun.jna.Pointer.nativeValue(this.accessartificialFrame);
        int i3 = getOutputFormats;
        getHighResolutionOutputSizeshNQ4ISI = (i3 + 81) % 128;
        getHighResolutionOutputSizeshNQ4ISI = (i3 + 15) % 128;
        mbVar3.setPointer(0L, new com.sun.jna.Pointer(nativeValue + 66));
        util.h.xy.ai.c.mb mbVar4 = this.getOutputStallDurationlomOqCM;
        if (mbVar4 != null) {
            try {
                mbVar4.dispose();
            } finally {
                this.getOutputStallDurationlomOqCM = null;
            }
        }
        long nativeValue2 = com.sun.jna.Pointer.nativeValue(this.toString);
        util.h.xy.ai.c.mb mbVar5 = new util.h.xy.ai.c.mb(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        mbVar5.setLong(0L, nativeValue2 ^ 536432575);
        getOutputFormats = (getHighResolutionOutputSizeshNQ4ISI + 111) % 128;
        this.getOutputStallDurationlomOqCM = mbVar5;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m24632(byte[] bArr) throws java.io.IOException {
        util.h.xy.ai.c.mb mbVar;
        long j;
        int i = getOutputFormats + 21;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            m24620(bArr.length);
            mbVar = this.accessartificialFrame;
            int i2 = getOutputFormats;
            getHighResolutionOutputSizeshNQ4ISI = (i2 + 81) % 128;
            getHighResolutionOutputSizeshNQ4ISI = (i2 + 15) % 128;
            j = 0;
        } else {
            m24620(bArr.length);
            mbVar = this.accessartificialFrame;
            int i3 = getOutputFormats;
            getHighResolutionOutputSizeshNQ4ISI = (i3 + 81) % 128;
            getHighResolutionOutputSizeshNQ4ISI = (i3 + 15) % 128;
            j = 66;
        }
        mbVar.write(j, bArr, 0, bArr.length);
        int i4 = getHighResolutionOutputSizeshNQ4ISI + 37;
        getOutputFormats = i4 % 128;
        if (i4 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    private static int Camera2StreamConfigurationMap() {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        getOutputFormats = (i + 117) % 128;
        int i2 = i + 85;
        getOutputFormats = i2 % 128;
        if (i2 % 2 != 0) {
            return 100;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    protected final void m24621() {
        util.h.xy.ai.c.mb mbVar = this.getValidOutputFormatsForInputhNQ4ISI;
        if (mbVar != null) {
            try {
                mbVar.dispose();
            } finally {
                this.getValidOutputFormatsForInputhNQ4ISI = null;
            }
        }
        util.h.xy.ai.c.mb mbVar2 = this.unwrapAs;
        if (mbVar2 != null) {
            getHighResolutionOutputSizeshNQ4ISI = (getOutputFormats + 117) % 128;
            try {
                mbVar2.dispose();
            } finally {
                this.unwrapAs = null;
            }
        }
        int i = getOutputFormats + 45;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    private util.h.xy.ai.c.mb getHighSpeedVideoFpsRangesFor(long j) {
        util.h.xy.ai.c.mb mbVar = new util.h.xy.ai.c.mb(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        byte[] bArr = new byte[com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)];
        getHighResolutionOutputSizeshNQ4ISI = (getOutputFormats + 117) % 128;
        for (int i = 0; i < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i++) {
            int i2 = i * 8;
            bArr[i] = (byte) (((255 << i2) & j) >> i2);
        }
        int i3 = 1434293148;
        for (int i4 = 0; i4 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i4++) {
            getOutputFormats = (getHighResolutionOutputSizeshNQ4ISI + 57) % 128;
            byte b = bArr[i4];
            bArr[i4] = (byte) (((byte) (i3 & 255)) ^ b);
            i3 = ((i3 << (i4 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))) | (i3 >>> (((com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8) - 1) - (i4 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))))) * (~(b & 255));
        }
        long j2 = 0;
        for (int i5 = 0; i5 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i5++) {
            getOutputFormats = (getHighResolutionOutputSizeshNQ4ISI + 99) % 128;
            j2 |= (bArr[i5] & 255) << (i5 * 8);
        }
        mbVar.setLong(0L, j2);
        return mbVar;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m24627(int i) {
        util.h.xy.ai.c.mb mbVar = this.getValidOutputFormatsForInputhNQ4ISI;
        if (mbVar != null) {
            int i2 = getOutputFormats + 113;
            getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
            try {
                if (i2 % 2 != 0) {
                    mbVar.dispose();
                    this.getValidOutputFormatsForInputhNQ4ISI = null;
                    throw new java.lang.ArithmeticException();
                }
                mbVar.dispose();
            } finally {
                this.getValidOutputFormatsForInputhNQ4ISI = null;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE);
        int i3 = getOutputFormats;
        getHighResolutionOutputSizeshNQ4ISI = (i3 + 69) % 128;
        getHighResolutionOutputSizeshNQ4ISI = (i3 + 115) % 128;
        util.h.xy.ai.c.mb mbVar2 = new util.h.xy.ai.c.mb(nativeSize + 117);
        this.getValidOutputFormatsForInputhNQ4ISI = mbVar2;
        Camera2StreamConfigurationMap();
        mbVar2.setInt(100L, i);
        util.h.xy.ai.c.mb mbVar3 = this.unwrapAs;
        if (mbVar3 != null) {
            int i4 = getHighResolutionOutputSizeshNQ4ISI + 117;
            getOutputFormats = i4 % 128;
            try {
                if (i4 % 2 == 0) {
                    mbVar3.dispose();
                    throw null;
                }
                mbVar3.dispose();
            } finally {
                this.unwrapAs = null;
            }
        }
        long nativeValue = com.sun.jna.Pointer.nativeValue(this.getValidOutputFormatsForInputhNQ4ISI);
        Camera2StreamConfigurationMap();
        this.unwrapAs = getHighSpeedVideoFpsRangesFor(nativeValue + 100);
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    protected final void m24619() {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        getOutputFormats = (i + 77) % 128;
        util.h.xy.ai.c.mb mbVar = this.ArtificialStackFrames;
        if (mbVar != null) {
            getOutputFormats = (i + 87) % 128;
            try {
                mbVar.dispose();
            } finally {
                this.ArtificialStackFrames = null;
            }
        }
        util.h.xy.ai.c.mb mbVar2 = this.getOutputMinFrameDuration;
        if (mbVar2 != null) {
            try {
                mbVar2.dispose();
            } finally {
                this.getOutputMinFrameDuration = null;
            }
        }
        util.h.xy.ai.c.mb mbVar3 = this.getInputFormats;
        if (mbVar3 != null) {
            int i2 = getOutputFormats + 1;
            getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
            try {
                if (i2 % 2 == 0) {
                    mbVar3.dispose();
                } else {
                    mbVar3.dispose();
                    throw null;
                }
            } finally {
                this.getInputFormats = null;
            }
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m24625(int i) {
        this.getInputSizeshNQ4ISI = i;
        util.h.xy.ai.c.mb mbVar = this.ArtificialStackFrames;
        if (mbVar != null) {
            int i2 = getOutputFormats + 107;
            getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
            try {
                if (i2 % 2 != 0) {
                    mbVar.dispose();
                    throw null;
                }
                mbVar.dispose();
            } finally {
                this.ArtificialStackFrames = null;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE) * i;
        int i3 = getOutputFormats + 19;
        getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
        this.ArtificialStackFrames = new util.h.xy.ai.c.mb(nativeSize + (i3 % 2 != 0 ? 60 : 113));
        util.h.xy.ai.c.mb mbVar2 = this.getOutputMinFrameDuration;
        if (mbVar2 != null) {
            int i4 = getOutputFormats + 59;
            getHighResolutionOutputSizeshNQ4ISI = i4 % 128;
            try {
                if (i4 % 2 != 0) {
                    mbVar2.dispose();
                    throw null;
                }
                mbVar2.dispose();
            } finally {
                this.getOutputMinFrameDuration = null;
            }
        }
        util.h.xy.ai.c.mb mbVar3 = new util.h.xy.ai.c.mb(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        this.getOutputMinFrameDuration = mbVar3;
        long nativeValue = com.sun.jna.Pointer.nativeValue(this.ArtificialStackFrames);
        int i5 = getOutputFormats + 77;
        getHighResolutionOutputSizeshNQ4ISI = i5 % 128;
        mbVar3.setPointer(0L, new com.sun.jna.Pointer(nativeValue + (i5 % 2 == 0 ? 86 : 60)));
        util.h.xy.ai.c.mb mbVar4 = this.getInputFormats;
        if (mbVar4 != null) {
            try {
                mbVar4.dispose();
                this.getInputFormats = null;
                getHighResolutionOutputSizeshNQ4ISI = (getOutputFormats + 95) % 128;
            } catch (java.lang.Throwable th) {
                this.getInputFormats = null;
                throw th;
            }
        }
        long nativeValue2 = com.sun.jna.Pointer.nativeValue(this.getOutputMinFrameDuration);
        util.h.xy.ai.c.mb mbVar5 = new util.h.xy.ai.c.mb(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        mbVar5.setLong(0L, nativeValue2 ^ 673108839);
        getHighResolutionOutputSizeshNQ4ISI = (getOutputFormats + 15) % 128;
        this.getInputFormats = mbVar5;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final byte[] m24628() throws java.io.IOException {
        util.h.xy.ai.c.mb mbVar = this.ArtificialStackFrames;
        if (mbVar != null) {
            int i = this.getInputSizeshNQ4ISI;
            byte[] bArr = new byte[i];
            int i2 = getOutputFormats + 77;
            getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
            mbVar.read(i2 % 2 != 0 ? 60 : 86, bArr, 0, i);
            return bArr;
        }
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue() + 40, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1, (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0), objArr);
            throw new java.io.IOException(((java.lang.String) objArr[0]).intern());
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m24626(byte[] bArr) throws java.io.IOException {
        getOutputFormats = (getHighResolutionOutputSizeshNQ4ISI + 53) % 128;
        m24625(bArr.length);
        util.h.xy.ai.c.mb mbVar = this.ArtificialStackFrames;
        int i = getOutputFormats + 77;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        mbVar.write(i % 2 != 0 ? 60 : 86, bArr, 0, bArr.length);
        int i2 = getOutputFormats + 93;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    protected final void m24624() {
        int i = getOutputFormats + 47;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            util.h.xy.ai.c.mb mbVar = this.isOutputSupportedForhNQ4ISI;
            if (mbVar != null) {
                try {
                    mbVar.dispose();
                    this.isOutputSupportedForhNQ4ISI = null;
                    getHighResolutionOutputSizeshNQ4ISI = (getOutputFormats + 49) % 128;
                } catch (java.lang.Throwable th) {
                    this.isOutputSupportedForhNQ4ISI = null;
                    throw th;
                }
            }
            util.h.xy.ai.c.mb mbVar2 = this.getOutputStallDuration;
            if (mbVar2 != null) {
                try {
                    mbVar2.dispose();
                } finally {
                    this.getOutputStallDuration = null;
                }
            }
            util.h.xy.ai.c.mb mbVar3 = this.getOutputSizeshNQ4ISI;
            if (mbVar3 != null) {
                getHighResolutionOutputSizeshNQ4ISI = (getOutputFormats + 55) % 128;
                try {
                    mbVar3.dispose();
                    return;
                } finally {
                    this.getOutputSizeshNQ4ISI = null;
                }
            }
            return;
        }
        throw null;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m24631(int i) {
        int i2 = getOutputFormats + 9;
        int i3 = i2 % 128;
        getHighResolutionOutputSizeshNQ4ISI = i3;
        if (i2 % 2 != 0) {
            this.getOutputSizes = i;
            throw null;
        }
        this.getOutputSizes = i;
        util.h.xy.ai.c.mb mbVar = this.isOutputSupportedForhNQ4ISI;
        if (mbVar != null) {
            getOutputFormats = (i3 + 43) % 128;
            try {
                mbVar.dispose();
                this.isOutputSupportedForhNQ4ISI = null;
                getOutputFormats = (getHighResolutionOutputSizeshNQ4ISI + 3) % 128;
            } catch (java.lang.Throwable th) {
                this.isOutputSupportedForhNQ4ISI = null;
                throw th;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * i;
        int i4 = getHighResolutionOutputSizeshNQ4ISI + 1;
        int i5 = i4 % 128;
        getOutputFormats = i5;
        int i6 = i4 % 2 == 0 ? 76 : 111;
        getHighResolutionOutputSizeshNQ4ISI = (i5 + 39) % 128;
        this.isOutputSupportedForhNQ4ISI = new util.h.xy.ai.c.mb(nativeSize + i6);
        util.h.xy.ai.c.mb mbVar2 = this.getOutputStallDuration;
        if (mbVar2 != null) {
            try {
                mbVar2.dispose();
                this.getOutputStallDuration = null;
                getOutputFormats = (getHighResolutionOutputSizeshNQ4ISI + 93) % 128;
            } catch (java.lang.Throwable th2) {
                this.getOutputStallDuration = null;
                throw th2;
            }
        }
        util.h.xy.ai.c.mb mbVar3 = new util.h.xy.ai.c.mb(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        this.getOutputStallDuration = mbVar3;
        long nativeValue = com.sun.jna.Pointer.nativeValue(this.isOutputSupportedForhNQ4ISI);
        int i7 = (getHighResolutionOutputSizeshNQ4ISI + 109) % 128;
        getOutputFormats = i7;
        getHighResolutionOutputSizeshNQ4ISI = (i7 + 47) % 128;
        mbVar3.setPointer(0L, new com.sun.jna.Pointer(nativeValue + 70));
        util.h.xy.ai.c.mb mbVar4 = this.getOutputSizeshNQ4ISI;
        if (mbVar4 != null) {
            try {
                mbVar4.dispose();
            } finally {
                this.getOutputSizeshNQ4ISI = null;
            }
        }
        long nativeValue2 = com.sun.jna.Pointer.nativeValue(this.getOutputStallDuration);
        util.h.xy.ai.c.mb mbVar5 = new util.h.xy.ai.c.mb(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        mbVar5.setLong(0L, nativeValue2 ^ 47386826);
        int i8 = (getHighResolutionOutputSizeshNQ4ISI + 43) % 128;
        getOutputFormats = i8;
        this.getOutputSizeshNQ4ISI = mbVar5;
        int i9 = i8 + 67;
        getHighResolutionOutputSizeshNQ4ISI = i9 % 128;
        if (i9 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ͺ, reason: contains not printable characters */
    public final int[] m24629() throws java.io.IOException {
        int i = getOutputFormats + 11;
        int i2 = i % 128;
        getHighResolutionOutputSizeshNQ4ISI = i2;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        util.h.xy.ai.c.mb mbVar = this.isOutputSupportedForhNQ4ISI;
        if (mbVar == null) {
            int tapTimeout = android.view.ViewConfiguration.getTapTimeout();
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges((tapTimeout >> 16) + 44, 39 - android.text.TextUtils.getOffsetAfter("", 0), (char) android.graphics.Color.blue(0), objArr);
            throw new java.io.IOException(((java.lang.String) objArr[0]).intern());
        }
        int i3 = this.getOutputSizes;
        int[] iArr = new int[i3];
        int i4 = (i2 + 109) % 128;
        getOutputFormats = i4;
        getHighResolutionOutputSizeshNQ4ISI = (i4 + 47) % 128;
        mbVar.read(70L, iArr, 0, i3);
        int i5 = getHighResolutionOutputSizeshNQ4ISI + 27;
        getOutputFormats = i5 % 128;
        if (i5 % 2 != 0) {
            return iArr;
        }
        throw null;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m24623(int[] iArr) throws java.io.IOException {
        int i = getHighResolutionOutputSizeshNQ4ISI + 29;
        getOutputFormats = i % 128;
        if (i % 2 == 0) {
            m24631(iArr.length);
            util.h.xy.ai.c.mb mbVar = this.isOutputSupportedForhNQ4ISI;
            int i2 = (getHighResolutionOutputSizeshNQ4ISI + 109) % 128;
            getOutputFormats = i2;
            getHighResolutionOutputSizeshNQ4ISI = (i2 + 47) % 128;
            mbVar.write(0L, iArr, 1, iArr.length);
        } else {
            m24631(iArr.length);
            util.h.xy.ai.c.mb mbVar2 = this.isOutputSupportedForhNQ4ISI;
            int i3 = (getHighResolutionOutputSizeshNQ4ISI + 109) % 128;
            getOutputFormats = i3;
            getHighResolutionOutputSizeshNQ4ISI = (i3 + 47) % 128;
            mbVar2.write(70L, iArr, 0, iArr.length);
        }
        getHighResolutionOutputSizeshNQ4ISI = (getOutputFormats + 23) % 128;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    protected final void m24616() {
        util.h.xy.ai.c.mb mbVar = this.getHighSpeedVideoSizesFor;
        if (mbVar != null) {
            try {
                mbVar.dispose();
                this.getHighSpeedVideoSizesFor = null;
                getHighResolutionOutputSizeshNQ4ISI = (getOutputFormats + 57) % 128;
            } catch (java.lang.Throwable th) {
                this.getHighSpeedVideoSizesFor = null;
                throw th;
            }
        }
        util.h.xy.ai.c.mb mbVar2 = this.CoroutineDebuggingKt;
        if (mbVar2 != null) {
            try {
                mbVar2.dispose();
                this.CoroutineDebuggingKt = null;
                getHighResolutionOutputSizeshNQ4ISI = (getOutputFormats + 39) % 128;
            } catch (java.lang.Throwable th2) {
                this.CoroutineDebuggingKt = null;
                throw th2;
            }
        }
    }

    private util.h.xy.ai.c.mb Camera2StreamConfigurationMap(long j) {
        util.h.xy.ai.c.mb mbVar = new util.h.xy.ai.c.mb(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        byte[] bArr = new byte[com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)];
        for (int i = 0; i < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i++) {
            int i2 = i * 8;
            bArr[i] = (byte) (((255 << i2) & j) >> i2);
        }
        getOutputFormats = (getHighResolutionOutputSizeshNQ4ISI + 53) % 128;
        int i3 = 1433686164;
        for (int i4 = 0; i4 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i4++) {
            byte b = bArr[i4];
            bArr[i4] = (byte) (((byte) (i3 & 255)) ^ b);
            i3 = ((i3 << (i4 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))) | (i3 >>> (((com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8) - 1) - (i4 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))))) * (~(b & 255));
        }
        int i5 = getHighResolutionOutputSizeshNQ4ISI + 15;
        getOutputFormats = i5 % 128;
        int i6 = i5 % 2;
        long j2 = 0;
        for (int i7 = 0; i7 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i7++) {
            j2 |= (bArr[i7] & 255) << (i7 * 8);
        }
        mbVar.setLong(0L, j2);
        return mbVar;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m24622(int i) {
        util.h.xy.ai.c.mb mbVar = this.getHighSpeedVideoSizesFor;
        if (mbVar != null) {
            getHighResolutionOutputSizeshNQ4ISI = (getOutputFormats + 67) % 128;
            try {
                mbVar.dispose();
            } finally {
                this.getHighSpeedVideoSizesFor = null;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE);
        int i2 = getHighResolutionOutputSizeshNQ4ISI + 1;
        int i3 = i2 % 128;
        getOutputFormats = i3;
        int i4 = i2 % 2 == 0 ? 17375 : 149;
        int i5 = i3 + 1;
        getHighResolutionOutputSizeshNQ4ISI = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
        util.h.xy.ai.c.mb mbVar2 = new util.h.xy.ai.c.mb(nativeSize + i4);
        this.getHighSpeedVideoSizesFor = mbVar2;
        int i6 = getHighResolutionOutputSizeshNQ4ISI;
        getOutputFormats = (i6 + 93) % 128;
        getOutputFormats = (i6 + 1) % 128;
        mbVar2.setInt(96L, i);
        util.h.xy.ai.c.mb mbVar3 = this.CoroutineDebuggingKt;
        if (mbVar3 != null) {
            try {
                mbVar3.dispose();
                this.CoroutineDebuggingKt = null;
                getOutputFormats = (getHighResolutionOutputSizeshNQ4ISI + 69) % 128;
            } catch (java.lang.Throwable th) {
                this.CoroutineDebuggingKt = null;
                throw th;
            }
        }
        long nativeValue = com.sun.jna.Pointer.nativeValue(this.getHighSpeedVideoSizesFor);
        int i7 = getHighResolutionOutputSizeshNQ4ISI;
        getOutputFormats = (i7 + 93) % 128;
        getOutputFormats = (i7 + 1) % 128;
        this.CoroutineDebuggingKt = Camera2StreamConfigurationMap(nativeValue + 96);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    protected final void m24618() {
        util.h.xy.ai.c.mb mbVar = this.coroutineCreation;
        if (mbVar != null) {
            int i = getHighResolutionOutputSizeshNQ4ISI + 113;
            getOutputFormats = i % 128;
            try {
                if (i % 2 != 0) {
                    mbVar.dispose();
                } else {
                    mbVar.dispose();
                    this.coroutineCreation = null;
                    throw new java.lang.ArithmeticException();
                }
            } finally {
                this.coroutineCreation = null;
            }
        }
        util.h.xy.ai.c.mb mbVar2 = this.isOutputSupportedFor;
        if (mbVar2 != null) {
            try {
                mbVar2.dispose();
                this.isOutputSupportedFor = null;
                getOutputFormats = (getHighResolutionOutputSizeshNQ4ISI + 3) % 128;
            } catch (java.lang.Throwable th) {
                this.isOutputSupportedFor = null;
                throw th;
            }
        }
        util.h.xy.ai.c.mb mbVar3 = this.coroutineBoundary;
        if (mbVar3 != null) {
            try {
                mbVar3.dispose();
            } finally {
                this.coroutineBoundary = null;
            }
        }
    }

    /* renamed from: ι, reason: contains not printable characters */
    public final int m24633() throws java.io.IOException {
        if (this.getOutputStallDurationlomOqCM == null || this.unwrapAs == null || this.getInputFormats == null || this.getOutputSizeshNQ4ISI == null || this.CoroutineDebuggingKt == null) {
            try {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(51 - (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)), (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 83, (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr);
                throw new java.io.IOException(((java.lang.String) objArr[0]).intern());
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        util.h.xy.ai.c.mb mbVar = this.coroutineCreation;
        if (mbVar != null) {
            try {
                mbVar.dispose();
            } finally {
                this.coroutineCreation = null;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE);
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = i + 45;
        getOutputFormats = i2 % 128;
        int i3 = i2 % 2 == 0 ? 22621 : com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE;
        getOutputFormats = (i + 1) % 128;
        this.coroutineCreation = new util.h.xy.ai.c.mb(nativeSize + i3);
        util.h.xy.ai.c.mb mbVar2 = this.isOutputSupportedFor;
        if (mbVar2 != null) {
            try {
                mbVar2.dispose();
            } finally {
                this.isOutputSupportedFor = null;
            }
        }
        util.h.xy.ai.c.mb mbVar3 = new util.h.xy.ai.c.mb(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        this.isOutputSupportedFor = mbVar3;
        long nativeValue = com.sun.jna.Pointer.nativeValue(this.coroutineCreation);
        int i4 = (getOutputFormats + 39) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i4;
        getOutputFormats = (i4 + 73) % 128;
        mbVar3.setPointer(0L, new com.sun.jna.Pointer(nativeValue + 90));
        util.h.xy.ai.c.mb mbVar4 = this.coroutineBoundary;
        if (mbVar4 != null) {
            try {
                mbVar4.dispose();
            } finally {
                this.coroutineBoundary = null;
            }
        }
        long nativeValue2 = com.sun.jna.Pointer.nativeValue(this.isOutputSupportedFor);
        util.h.xy.ai.c.mb mbVar5 = new util.h.xy.ai.c.mb(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        byte[] bArr = new byte[com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)];
        int i5 = 0;
        while (i5 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)) {
            int i6 = i5 * 8;
            bArr[i5] = (byte) (((255 << i6) & nativeValue2) >> i6);
            i5++;
            getHighResolutionOutputSizeshNQ4ISI = (getOutputFormats + 21) % 128;
        }
        int i7 = 1297616884;
        for (int i8 = 0; i8 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i8++) {
            byte b = bArr[i8];
            bArr[i8] = (byte) (((byte) (i7 & 255)) ^ b);
            i7 = ((i7 << (i8 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))) | (i7 >>> (((com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8) - 1) - (i8 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))))) * (~(b & 255));
        }
        long j = 0;
        for (int i9 = 0; i9 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i9++) {
            getOutputFormats = (getHighResolutionOutputSizeshNQ4ISI + 47) % 128;
            j |= (bArr[i9] & 255) << (i9 * 8);
        }
        mbVar5.setLong(0L, j);
        this.coroutineBoundary = mbVar5;
        util.h.xy.ai.rh.Camera2StreamConfigurationMap._GAsBZSW9wcqpxeenbXvtsW(this.coroutineBoundary, this.getOutputStallDurationlomOqCM, this.unwrapAs, this.getInputFormats, this.getOutputSizeshNQ4ISI, this.CoroutineDebuggingKt);
        int[] iArr = new int[1];
        util.h.xy.ai.c.mb mbVar6 = this.coroutineCreation;
        int i10 = (getOutputFormats + 39) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i10;
        getOutputFormats = (i10 + 73) % 128;
        mbVar6.read(90L, iArr, 0, 1);
        return iArr[0];
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public final void m24617() {
        int i = getOutputFormats + 23;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            m24630();
            m24621();
            m24619();
            m24624();
            m24616();
            m24618();
            return;
        }
        m24630();
        m24621();
        m24619();
        m24624();
        m24616();
        m24618();
        throw null;
    }
}
