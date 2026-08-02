package util.h.xy.ai;

/* loaded from: classes5.dex */
public final class rc {
    private static char[] Camera2StreamConfigurationMap = {29497, 17224, 5109, 57883, 45776, 33082, 20803, 8679, 61552, 49349, 38717, 26546, 14284, 1614, 54943, 42247, 30132, 17880, 5186, 58589, 47897, 35773, 23095, 10873, 64249, 51571, 39320, 26658, 14426, 2274, 57203, 44953, 32273, 20221, 7872, 60774, 48610, 35850, 23734, 2158, 14367, 26786, 39244, 51591, 64109, 10772, 23216, 35623, 48018, 60522, 7397, 19611, 32025, 44488, 56912, 3811, 16015, 28437, 40836, 49234, 61680, 8546, 20760, 33203, 45579, 58055, 4964, 17213, 29587, 42027, 54482, 1350, 13816, 26018, 38449, 50877, 63307, 10165, 22426, 38914, 51360, 63818, 10708, 8512, 4401, 16780, 45154, 57513, 54083, 826, 29598, 41481, 37564, 50518, 13762, 26029, 21592, 34019, 63339, 10191, 6069, 17954, 46723, 59757, 55765, 2137, 30769, 43221, 39688, 52194, 14941, 27197, 23209, 36113, 65019, 11385, 7373, 19632, 48920, 61385, 56941, 3806, 32422, 45357, 57747, 53363, 253, 29441, 41790, 37786, 49688, 13038, 25920};
    private static long getHighResolutionOutputSizeshNQ4ISI = -505634495827694488L;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes = 0;
    private static int getInputSizeshNQ4ISI = 1;
    private int getOutputMinFrameDurationlomOqCM = 0;
    private util.h.xy.ai.rc.ma getOutputStallDuration = null;
    private util.h.xy.ai.rc.ma coroutineCreation = null;
    private util.h.xy.ai.rc.ma isOutputSupportedForhNQ4ISI = null;
    private util.h.xy.ai.rc.ma isOutputSupportedFor = null;
    private util.h.xy.ai.rc.ma getInputFormats = null;
    private util.h.xy.ai.rc.ma getOutputFormats = null;
    private util.h.xy.ai.rc.ma toString = null;
    private int getHighSpeedVideoSizesFor = 0;
    private util.h.xy.ai.rc.ma CoroutineDebuggingKt = null;
    private util.h.xy.ai.rc.ma getOutputSizes = null;
    private util.h.xy.ai.rc.ma getOutputMinFrameDuration = null;
    private int getValidOutputFormatsForInputhNQ4ISI = 0;
    private util.h.xy.ai.rc.ma getOutputSizeshNQ4ISI = null;
    private util.h.xy.ai.rc.ma getOutputStallDurationlomOqCM = null;
    private util.h.xy.ai.rc.ma coroutineBoundary = null;
    private util.h.xy.ai.rc.ma unwrapAs = null;
    private util.h.xy.ai.rc.ma ArtificialStackFrames = null;
    private util.h.xy.ai.rc.ma accessartificialFrame = null;

    protected final void finalize() {
        int i = getInputSizeshNQ4ISI + 101;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 == 0) {
            m24863();
            int i2 = getHighSpeedVideoSizes + 77;
            getInputSizeshNQ4ISI = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            return;
        }
        m24863();
        throw new java.lang.ArithmeticException();
    }

    final class ma extends com.sun.jna.Memory {
        private static int getHighSpeedVideoFpsRanges = 1;
        private static int getHighSpeedVideoFpsRangesFor;

        public ma(long j) {
            super(j);
        }

        @Override // com.sun.jna.Memory
        public final void dispose() {
            int i = getHighSpeedVideoFpsRangesFor;
            int i2 = (i ^ 79) + ((i & 79) << 1);
            getHighSpeedVideoFpsRanges = i2 % 128;
            if (i2 % 2 != 0) {
                super.dispose();
                int i3 = getHighSpeedVideoFpsRanges;
                getHighSpeedVideoFpsRangesFor = ((i3 ^ 15) + ((i3 & 15) << 1)) % 128;
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
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 27) % 128;
            jArr[rbVar.f2651] = (((char) (Camera2StreamConfigurationMap[rbVar.f2651 + i2] ^ 3446303986615426049L)) ^ (rbVar.f2651 * (3446303986615426049L ^ getHighResolutionOutputSizeshNQ4ISI))) ^ c;
            rbVar.f2651++;
        }
        char[] cArr = new char[i];
        rbVar.f2651 = 0;
        while (rbVar.f2651 < i) {
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 115) % 128;
            cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
            rbVar.f2651++;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    protected final void m24864() {
        util.h.xy.ai.rc.ma maVar = this.getOutputStallDuration;
        if (maVar != null) {
            int i = getHighSpeedVideoSizes + 49;
            getInputSizeshNQ4ISI = i % 128;
            try {
                if (i % 2 == 0) {
                    maVar.dispose();
                    this.getOutputStallDuration = null;
                    throw new java.lang.ArithmeticException();
                }
                maVar.dispose();
            } finally {
                this.getOutputStallDuration = null;
            }
        }
        util.h.xy.ai.rc.ma maVar2 = this.coroutineCreation;
        if (maVar2 != null) {
            int i2 = getHighSpeedVideoSizes + 5;
            getInputSizeshNQ4ISI = i2 % 128;
            try {
                if (i2 % 2 == 0) {
                    maVar2.dispose();
                    throw null;
                }
                maVar2.dispose();
            } finally {
                this.coroutineCreation = null;
            }
        }
        util.h.xy.ai.rc.ma maVar3 = this.isOutputSupportedForhNQ4ISI;
        if (maVar3 != null) {
            getInputSizeshNQ4ISI = (getHighSpeedVideoSizes + 97) % 128;
            try {
                maVar3.dispose();
                this.isOutputSupportedForhNQ4ISI = null;
                getHighSpeedVideoSizes = (getInputSizeshNQ4ISI + 35) % 128;
            } catch (java.lang.Throwable th) {
                this.isOutputSupportedForhNQ4ISI = null;
                throw th;
            }
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m24861(int i) {
        int i2 = getInputSizeshNQ4ISI;
        getHighSpeedVideoSizes = (i2 + 97) % 128;
        this.getOutputMinFrameDurationlomOqCM = i;
        util.h.xy.ai.rc.ma maVar = this.getOutputStallDuration;
        if (maVar != null) {
            int i3 = i2 + 89;
            getHighSpeedVideoSizes = i3 % 128;
            try {
                if (i3 % 2 != 0) {
                    maVar.dispose();
                    this.getOutputStallDuration = null;
                    throw new java.lang.ArithmeticException();
                }
                maVar.dispose();
            } finally {
                this.getOutputStallDuration = null;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE) * i;
        int i4 = getInputSizeshNQ4ISI + 77;
        getHighSpeedVideoSizes = i4 % 128;
        this.getOutputStallDuration = new util.h.xy.ai.rc.ma(nativeSize + (i4 % 2 != 0 ? 48 : 115));
        util.h.xy.ai.rc.ma maVar2 = this.coroutineCreation;
        if (maVar2 != null) {
            try {
                maVar2.dispose();
                this.coroutineCreation = null;
                int i5 = getInputSizeshNQ4ISI + 43;
                getHighSpeedVideoSizes = i5 % 128;
                int i6 = i5 % 2;
            } catch (java.lang.Throwable th) {
                this.coroutineCreation = null;
                throw th;
            }
        }
        util.h.xy.ai.rc.ma maVar3 = new util.h.xy.ai.rc.ma(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        this.coroutineCreation = maVar3;
        long nativeValue = com.sun.jna.Pointer.nativeValue(this.getOutputStallDuration);
        int i7 = getInputSizeshNQ4ISI + 19;
        getHighSpeedVideoSizes = i7 % 128;
        maVar3.setPointer(0L, new com.sun.jna.Pointer(nativeValue + (i7 % 2 != 0 ? 58 : 102)));
        util.h.xy.ai.rc.ma maVar4 = this.isOutputSupportedForhNQ4ISI;
        if (maVar4 != null) {
            try {
                maVar4.dispose();
            } finally {
                this.isOutputSupportedForhNQ4ISI = null;
            }
        }
        long nativeValue2 = com.sun.jna.Pointer.nativeValue(this.coroutineCreation);
        util.h.xy.ai.rc.ma maVar5 = new util.h.xy.ai.rc.ma(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        maVar5.setLong(0L, nativeValue2 ^ 1943052760);
        int i8 = getInputSizeshNQ4ISI + 11;
        getHighSpeedVideoSizes = i8 % 128;
        if (i8 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        this.isOutputSupportedForhNQ4ISI = maVar5;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m24862(byte[] bArr) throws java.io.IOException {
        int i = getInputSizeshNQ4ISI + 47;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 == 0) {
            m24861(bArr.length);
            util.h.xy.ai.rc.ma maVar = this.getOutputStallDuration;
            int i2 = getInputSizeshNQ4ISI + 19;
            getHighSpeedVideoSizes = i2 % 128;
            maVar.write(i2 % 2 != 0 ? 58 : 102, bArr, 0, bArr.length);
            return;
        }
        m24861(bArr.length);
        util.h.xy.ai.rc.ma maVar2 = this.getOutputStallDuration;
        int i3 = getInputSizeshNQ4ISI + 19;
        getHighSpeedVideoSizes = i3 % 128;
        int i4 = i3 % 2;
        maVar2.write(0L, bArr, 1, bArr.length);
    }

    private static int getHighResolutionOutputSizeshNQ4ISI() {
        int i = (getInputSizeshNQ4ISI + 63) % 128;
        getHighSpeedVideoSizes = i;
        int i2 = i + 65;
        getInputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            return 80;
        }
        throw null;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    protected final void m24858() {
        int i = getHighSpeedVideoSizes;
        int i2 = i + 17;
        getInputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        util.h.xy.ai.rc.ma maVar = this.isOutputSupportedFor;
        if (maVar != null) {
            int i3 = i + 25;
            getInputSizeshNQ4ISI = i3 % 128;
            try {
                if (i3 % 2 == 0) {
                    maVar.dispose();
                    throw null;
                }
                maVar.dispose();
            } finally {
                this.isOutputSupportedFor = null;
            }
        }
        util.h.xy.ai.rc.ma maVar2 = this.getInputFormats;
        if (maVar2 != null) {
            getInputSizeshNQ4ISI = (getHighSpeedVideoSizes + 73) % 128;
            try {
                maVar2.dispose();
                this.getInputFormats = null;
                getInputSizeshNQ4ISI = (getHighSpeedVideoSizes + 27) % 128;
            } catch (java.lang.Throwable th) {
                this.getInputFormats = null;
                throw th;
            }
        }
    }

    private util.h.xy.ai.rc.ma getHighResolutionOutputSizeshNQ4ISI(long j) {
        util.h.xy.ai.rc.ma maVar = new util.h.xy.ai.rc.ma(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        byte[] bArr = new byte[com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)];
        int i = 0;
        while (i < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)) {
            int i2 = i * 8;
            bArr[i] = (byte) (((255 << i2) & j) >> i2);
            i++;
            getHighSpeedVideoSizes = (getInputSizeshNQ4ISI + 25) % 128;
        }
        int i3 = 1032189231;
        for (int i4 = 0; i4 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i4++) {
            getHighSpeedVideoSizes = (getInputSizeshNQ4ISI + 31) % 128;
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

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m24859(int i) {
        int i2 = getInputSizeshNQ4ISI;
        int i3 = i2 + 3;
        getHighSpeedVideoSizes = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        util.h.xy.ai.rc.ma maVar = this.isOutputSupportedFor;
        if (maVar != null) {
            int i4 = i2 + 7;
            getHighSpeedVideoSizes = i4 % 128;
            try {
                if (i4 % 2 != 0) {
                    maVar.dispose();
                    throw null;
                }
                maVar.dispose();
            } finally {
                this.isOutputSupportedFor = null;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE);
        int i5 = getHighSpeedVideoSizes + 49;
        getInputSizeshNQ4ISI = i5 % 128;
        util.h.xy.ai.rc.ma maVar2 = new util.h.xy.ai.rc.ma(nativeSize + (i5 % 2 == 0 ? 104 : 107));
        this.isOutputSupportedFor = maVar2;
        getHighResolutionOutputSizeshNQ4ISI();
        maVar2.setInt(80L, i);
        util.h.xy.ai.rc.ma maVar3 = this.getInputFormats;
        if (maVar3 != null) {
            try {
                maVar3.dispose();
                this.getInputFormats = null;
                int i6 = getHighSpeedVideoSizes + 17;
                getInputSizeshNQ4ISI = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 5 / 5;
                }
            } catch (java.lang.Throwable th) {
                this.getInputFormats = null;
                throw th;
            }
        }
        long nativeValue = com.sun.jna.Pointer.nativeValue(this.isOutputSupportedFor);
        getHighResolutionOutputSizeshNQ4ISI();
        this.getInputFormats = getHighResolutionOutputSizeshNQ4ISI(nativeValue + 80);
    }

    private static int getHighSpeedVideoFpsRanges() {
        int i = (getInputSizeshNQ4ISI + 77) % 128;
        getHighSpeedVideoSizes = i;
        int i2 = i + 13;
        getInputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            return 90;
        }
        throw null;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    protected final void m24860() {
        util.h.xy.ai.rc.ma maVar = this.getOutputFormats;
        if (maVar != null) {
            getInputSizeshNQ4ISI = (getHighSpeedVideoSizes + 51) % 128;
            try {
                maVar.dispose();
            } finally {
                this.getOutputFormats = null;
            }
        }
        util.h.xy.ai.rc.ma maVar2 = this.toString;
        if (maVar2 != null) {
            getInputSizeshNQ4ISI = (getHighSpeedVideoSizes + 111) % 128;
            try {
                maVar2.dispose();
            } finally {
                this.toString = null;
            }
        }
        int i = getInputSizeshNQ4ISI + 43;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m24855(int i) {
        util.h.xy.ai.rc.ma maVar = this.getOutputFormats;
        if (maVar != null) {
            int i2 = getHighSpeedVideoSizes + 79;
            getInputSizeshNQ4ISI = i2 % 128;
            try {
                if (i2 % 2 == 0) {
                    maVar.dispose();
                    throw null;
                }
                maVar.dispose();
            } finally {
                this.getOutputFormats = null;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE);
        int i3 = getInputSizeshNQ4ISI + 39;
        getHighSpeedVideoSizes = i3 % 128;
        util.h.xy.ai.rc.ma maVar2 = new util.h.xy.ai.rc.ma(nativeSize + (i3 % 2 != 0 ? 63 : 105));
        this.getOutputFormats = maVar2;
        getHighSpeedVideoFpsRanges();
        maVar2.setInt(90L, i);
        util.h.xy.ai.rc.ma maVar3 = this.toString;
        if (maVar3 != null) {
            int i4 = getInputSizeshNQ4ISI + 71;
            getHighSpeedVideoSizes = i4 % 128;
            try {
                if (i4 % 2 != 0) {
                    maVar3.dispose();
                    throw null;
                }
                maVar3.dispose();
            } finally {
                this.toString = null;
            }
        }
        long nativeValue = com.sun.jna.Pointer.nativeValue(this.getOutputFormats);
        getHighSpeedVideoFpsRanges();
        util.h.xy.ai.rc.ma maVar4 = new util.h.xy.ai.rc.ma(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        maVar4.setLong(0L, 1100527363 ^ (nativeValue + 90));
        int i5 = getHighSpeedVideoSizes + 53;
        getInputSizeshNQ4ISI = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
        this.toString = maVar4;
    }

    private static int getHighSpeedVideoFpsRangesFor() {
        int i = getInputSizeshNQ4ISI;
        getHighSpeedVideoSizes = (i + 55) % 128;
        int i2 = i + 31;
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 == 0) {
            return 70;
        }
        throw null;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    protected final void m24854() {
        util.h.xy.ai.rc.ma maVar = this.CoroutineDebuggingKt;
        if (maVar != null) {
            try {
                maVar.dispose();
                this.CoroutineDebuggingKt = null;
                getInputSizeshNQ4ISI = (getHighSpeedVideoSizes + 99) % 128;
            } catch (java.lang.Throwable th) {
                this.CoroutineDebuggingKt = null;
                throw th;
            }
        }
        util.h.xy.ai.rc.ma maVar2 = this.getOutputSizes;
        if (maVar2 != null) {
            getHighSpeedVideoSizes = (getInputSizeshNQ4ISI + 79) % 128;
            try {
                maVar2.dispose();
            } finally {
                this.getOutputSizes = null;
            }
        }
        util.h.xy.ai.rc.ma maVar3 = this.getOutputMinFrameDuration;
        if (maVar3 != null) {
            try {
                maVar3.dispose();
                this.getOutputMinFrameDuration = null;
                getHighSpeedVideoSizes = (getInputSizeshNQ4ISI + 41) % 128;
            } catch (java.lang.Throwable th2) {
                this.getOutputMinFrameDuration = null;
                throw th2;
            }
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m24865(int i) {
        int i2 = (getHighSpeedVideoSizes + 43) % 128;
        getInputSizeshNQ4ISI = i2;
        this.getHighSpeedVideoSizesFor = i;
        util.h.xy.ai.rc.ma maVar = this.CoroutineDebuggingKt;
        if (maVar != null) {
            int i3 = i2 + 119;
            getHighSpeedVideoSizes = i3 % 128;
            try {
                if (i3 % 2 != 0) {
                    maVar.dispose();
                    throw null;
                }
                maVar.dispose();
            } finally {
                this.CoroutineDebuggingKt = null;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE) * i;
        int i4 = getInputSizeshNQ4ISI;
        getHighSpeedVideoSizes = (i4 + 47) % 128;
        getHighSpeedVideoSizes = (i4 + 33) % 128;
        this.CoroutineDebuggingKt = new util.h.xy.ai.rc.ma(nativeSize + 89);
        util.h.xy.ai.rc.ma maVar2 = this.getOutputSizes;
        if (maVar2 != null) {
            try {
                maVar2.dispose();
            } finally {
                this.getOutputSizes = null;
            }
        }
        util.h.xy.ai.rc.ma maVar3 = new util.h.xy.ai.rc.ma(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        this.getOutputSizes = maVar3;
        long nativeValue = com.sun.jna.Pointer.nativeValue(this.CoroutineDebuggingKt);
        getHighSpeedVideoFpsRangesFor();
        maVar3.setPointer(0L, new com.sun.jna.Pointer(nativeValue + 70));
        util.h.xy.ai.rc.ma maVar4 = this.getOutputMinFrameDuration;
        if (maVar4 != null) {
            try {
                maVar4.dispose();
            } finally {
                this.getOutputMinFrameDuration = null;
            }
        }
        long nativeValue2 = com.sun.jna.Pointer.nativeValue(this.getOutputSizes);
        util.h.xy.ai.rc.ma maVar5 = new util.h.xy.ai.rc.ma(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        maVar5.setLong(0L, nativeValue2 ^ 1475018009);
        int i5 = getHighSpeedVideoSizes + 31;
        getInputSizeshNQ4ISI = i5 % 128;
        if (i5 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        this.getOutputMinFrameDuration = maVar5;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final byte[] m24853() throws java.io.IOException {
        getHighSpeedVideoSizes = (getInputSizeshNQ4ISI + 21) % 128;
        util.h.xy.ai.rc.ma maVar = this.CoroutineDebuggingKt;
        if (maVar == null) {
            float minVolume = android.media.AudioTrack.getMinVolume();
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges((minVolume > 0.0f ? 1 : (minVolume == 0.0f ? 0 : -1)) + 39, android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24, (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 61270), objArr);
            throw new java.io.IOException(((java.lang.String) objArr[0]).intern());
        }
        byte[] bArr = new byte[this.getHighSpeedVideoSizesFor];
        getHighSpeedVideoFpsRangesFor();
        maVar.read(70L, bArr, 0, this.getHighSpeedVideoSizesFor);
        getHighSpeedVideoSizes = (getInputSizeshNQ4ISI + 79) % 128;
        return bArr;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m24856(byte[] bArr) throws java.io.IOException {
        getInputSizeshNQ4ISI = (getHighSpeedVideoSizes + 125) % 128;
        m24865(bArr.length);
        util.h.xy.ai.rc.ma maVar = this.CoroutineDebuggingKt;
        getHighSpeedVideoFpsRangesFor();
        maVar.write(70L, bArr, 0, bArr.length);
        int i = getHighSpeedVideoSizes + 63;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ι, reason: contains not printable characters */
    protected final void m24866() {
        util.h.xy.ai.rc.ma maVar = this.getOutputSizeshNQ4ISI;
        if (maVar != null) {
            getHighSpeedVideoSizes = (getInputSizeshNQ4ISI + 89) % 128;
            try {
                maVar.dispose();
            } finally {
                this.getOutputSizeshNQ4ISI = null;
            }
        }
        util.h.xy.ai.rc.ma maVar2 = this.getOutputStallDurationlomOqCM;
        if (maVar2 != null) {
            try {
                maVar2.dispose();
                this.getOutputStallDurationlomOqCM = null;
                getHighSpeedVideoSizes = (getInputSizeshNQ4ISI + 101) % 128;
            } catch (java.lang.Throwable th) {
                this.getOutputStallDurationlomOqCM = null;
                throw th;
            }
        }
        util.h.xy.ai.rc.ma maVar3 = this.coroutineBoundary;
        if (maVar3 != null) {
            try {
                maVar3.dispose();
            } finally {
                this.coroutineBoundary = null;
            }
        }
    }

    private util.h.xy.ai.rc.ma Camera2StreamConfigurationMap(long j) {
        util.h.xy.ai.rc.ma maVar = new util.h.xy.ai.rc.ma(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        byte[] bArr = new byte[com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)];
        getHighSpeedVideoSizes = (getInputSizeshNQ4ISI + 31) % 128;
        for (int i = 0; i < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i++) {
            int i2 = i * 8;
            bArr[i] = (byte) (((255 << i2) & j) >> i2);
        }
        int i3 = 1543356141;
        for (int i4 = 0; i4 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i4++) {
            getHighSpeedVideoSizes = (getInputSizeshNQ4ISI + 115) % 128;
            byte b = bArr[i4];
            bArr[i4] = (byte) (((byte) (i3 & 255)) ^ b);
            i3 = ((i3 << (i4 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))) | (i3 >>> (((com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8) - 1) - (i4 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))))) * (~(b & 255));
        }
        long j2 = 0;
        for (int i5 = 0; i5 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i5++) {
            getInputSizeshNQ4ISI = (getHighSpeedVideoSizes + 95) % 128;
            j2 |= (bArr[i5] & 255) << (i5 * 8);
        }
        maVar.setLong(0L, j2);
        return maVar;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m24852(int i) {
        int i2 = (getInputSizeshNQ4ISI + 101) % 128;
        getHighSpeedVideoSizes = i2;
        this.getValidOutputFormatsForInputhNQ4ISI = i;
        util.h.xy.ai.rc.ma maVar = this.getOutputSizeshNQ4ISI;
        if (maVar != null) {
            getInputSizeshNQ4ISI = (i2 + 33) % 128;
            try {
                maVar.dispose();
            } finally {
                this.getOutputSizeshNQ4ISI = null;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * i;
        int i3 = getHighSpeedVideoSizes + 25;
        int i4 = i3 % 128;
        getInputSizeshNQ4ISI = i4;
        int i5 = i3 % 2 == 0 ? 901 : 131;
        int i6 = i4 + 1;
        getHighSpeedVideoSizes = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
        this.getOutputSizeshNQ4ISI = new util.h.xy.ai.rc.ma(nativeSize + i5);
        util.h.xy.ai.rc.ma maVar2 = this.getOutputStallDurationlomOqCM;
        if (maVar2 != null) {
            int i7 = getHighSpeedVideoSizes + 83;
            getInputSizeshNQ4ISI = i7 % 128;
            try {
                if (i7 % 2 == 0) {
                    maVar2.dispose();
                    this.getOutputStallDurationlomOqCM = null;
                    throw new java.lang.ArithmeticException();
                }
                maVar2.dispose();
            } finally {
                this.getOutputStallDurationlomOqCM = null;
            }
        }
        util.h.xy.ai.rc.ma maVar3 = new util.h.xy.ai.rc.ma(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        this.getOutputStallDurationlomOqCM = maVar3;
        long nativeValue = com.sun.jna.Pointer.nativeValue(this.getOutputSizeshNQ4ISI);
        int i8 = getHighSpeedVideoSizes + 107;
        getInputSizeshNQ4ISI = i8 % 128;
        maVar3.setPointer(0L, new com.sun.jna.Pointer(nativeValue + (i8 % 2 == 0 ? 50 : 80)));
        util.h.xy.ai.rc.ma maVar4 = this.coroutineBoundary;
        if (maVar4 != null) {
            try {
                maVar4.dispose();
            } finally {
                this.coroutineBoundary = null;
            }
        }
        this.coroutineBoundary = Camera2StreamConfigurationMap(com.sun.jna.Pointer.nativeValue(this.getOutputStallDurationlomOqCM));
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public final int[] m24850() throws java.io.IOException {
        int i = getInputSizeshNQ4ISI + 47;
        int i2 = i % 128;
        getHighSpeedVideoSizes = i2;
        if (i % 2 != 0) {
            throw null;
        }
        util.h.xy.ai.rc.ma maVar = this.getOutputSizeshNQ4ISI;
        if (maVar == null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(44 - android.widget.ExpandableListView.getPackedPositionType(0L), 39 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (37889 - android.widget.ExpandableListView.getPackedPositionChild(0L)), objArr);
            throw new java.io.IOException(((java.lang.String) objArr[0]).intern());
        }
        int i3 = this.getValidOutputFormatsForInputhNQ4ISI;
        int[] iArr = new int[i3];
        int i4 = i2 + 107;
        getInputSizeshNQ4ISI = i4 % 128;
        maVar.read(i4 % 2 == 0 ? 50 : 80, iArr, 0, i3);
        int i5 = getHighSpeedVideoSizes + 29;
        getInputSizeshNQ4ISI = i5 % 128;
        if (i5 % 2 != 0) {
            return iArr;
        }
        throw null;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m24857(int[] iArr) throws java.io.IOException {
        getHighSpeedVideoSizes = (getInputSizeshNQ4ISI + 27) % 128;
        m24852(iArr.length);
        util.h.xy.ai.rc.ma maVar = this.getOutputSizeshNQ4ISI;
        int i = getHighSpeedVideoSizes + 107;
        getInputSizeshNQ4ISI = i % 128;
        maVar.write(i % 2 == 0 ? 50 : 80, iArr, 0, iArr.length);
        getHighSpeedVideoSizes = (getInputSizeshNQ4ISI + 55) % 128;
    }

    private static int getHighSpeedVideoSizes() {
        int i = getHighSpeedVideoSizes;
        int i2 = i + 31;
        getInputSizeshNQ4ISI = i2 % 128;
        int i3 = i2 % 2 == 0 ? 62 : 102;
        getInputSizeshNQ4ISI = (i + 125) % 128;
        return i3;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    protected final void m24849() {
        util.h.xy.ai.rc.ma maVar = this.unwrapAs;
        if (maVar != null) {
            int i = getHighSpeedVideoSizes + 25;
            getInputSizeshNQ4ISI = i % 128;
            try {
                if (i % 2 == 0) {
                    maVar.dispose();
                    this.unwrapAs = null;
                    throw new java.lang.ArithmeticException();
                }
                maVar.dispose();
            } finally {
                this.unwrapAs = null;
            }
        }
        util.h.xy.ai.rc.ma maVar2 = this.ArtificialStackFrames;
        if (maVar2 != null) {
            int i2 = getInputSizeshNQ4ISI + 55;
            getHighSpeedVideoSizes = i2 % 128;
            try {
                if (i2 % 2 != 0) {
                    maVar2.dispose();
                    throw null;
                }
                maVar2.dispose();
            } finally {
                this.ArtificialStackFrames = null;
            }
        }
        util.h.xy.ai.rc.ma maVar3 = this.accessartificialFrame;
        if (maVar3 != null) {
            getHighSpeedVideoSizes = (getInputSizeshNQ4ISI + 73) % 128;
            try {
                maVar3.dispose();
            } finally {
                this.accessartificialFrame = null;
            }
        }
    }

    private util.h.xy.ai.rc.ma getHighSpeedVideoFpsRanges(long j) {
        util.h.xy.ai.rc.ma maVar = new util.h.xy.ai.rc.ma(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        byte[] bArr = new byte[com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)];
        int i = 0;
        for (int i2 = 0; i2 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i2++) {
            int i3 = i2 * 8;
            bArr[i2] = (byte) (((255 << i3) & j) >> i3);
        }
        int i4 = 1874714628;
        for (int i5 = 0; i5 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i5++) {
            getInputSizeshNQ4ISI = (getHighSpeedVideoSizes + 125) % 128;
            byte b = bArr[i5];
            bArr[i5] = (byte) (((byte) (i4 & 255)) ^ b);
            i4 = ((i4 << (i5 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))) | (i4 >>> (((com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8) - 1) - (i5 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))))) * (~(b & 255));
        }
        long j2 = 0;
        while (i < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)) {
            int i6 = (getHighSpeedVideoSizes + 25) % 128;
            getInputSizeshNQ4ISI = i6;
            j2 |= (bArr[i] & 255) << (i * 8);
            i++;
            getHighSpeedVideoSizes = (i6 + 67) % 128;
        }
        maVar.setLong(0L, j2);
        return maVar;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public final int m24851() throws java.io.IOException {
        if (this.isOutputSupportedForhNQ4ISI != null && this.getInputFormats != null && this.toString != null && this.getOutputMinFrameDuration != null) {
            int i = (getInputSizeshNQ4ISI + 119) % 128;
            getHighSpeedVideoSizes = i;
            if (this.coroutineBoundary != null) {
                int i2 = i + 45;
                getInputSizeshNQ4ISI = i2 % 128;
                if (i2 % 2 == 0) {
                    throw new java.lang.ArithmeticException();
                }
                util.h.xy.ai.rc.ma maVar = this.unwrapAs;
                if (maVar != null) {
                    try {
                        maVar.dispose();
                    } finally {
                        this.unwrapAs = null;
                    }
                }
                int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE);
                int i3 = getInputSizeshNQ4ISI + 11;
                int i4 = i3 % 128;
                getHighSpeedVideoSizes = i4;
                int i5 = i3 % 2 != 0 ? 7720 : com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE;
                int i6 = i4 + 119;
                getInputSizeshNQ4ISI = i6 % 128;
                if (i6 % 2 == 0) {
                    throw null;
                }
                this.unwrapAs = new util.h.xy.ai.rc.ma(nativeSize + i5);
                util.h.xy.ai.rc.ma maVar2 = this.ArtificialStackFrames;
                if (maVar2 != null) {
                    getInputSizeshNQ4ISI = (getHighSpeedVideoSizes + 47) % 128;
                    try {
                        maVar2.dispose();
                        this.ArtificialStackFrames = null;
                        getHighSpeedVideoSizes = (getInputSizeshNQ4ISI + 33) % 128;
                    } catch (java.lang.Throwable th) {
                        this.ArtificialStackFrames = null;
                        throw th;
                    }
                }
                util.h.xy.ai.rc.ma maVar3 = new util.h.xy.ai.rc.ma(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
                this.ArtificialStackFrames = maVar3;
                maVar3.setPointer(0L, new com.sun.jna.Pointer(com.sun.jna.Pointer.nativeValue(this.unwrapAs) + getHighSpeedVideoSizes()));
                util.h.xy.ai.rc.ma maVar4 = this.accessartificialFrame;
                if (maVar4 != null) {
                    int i7 = getInputSizeshNQ4ISI + 35;
                    getHighSpeedVideoSizes = i7 % 128;
                    try {
                        if (i7 % 2 != 0) {
                            maVar4.dispose();
                            throw null;
                        }
                        maVar4.dispose();
                    } finally {
                        this.accessartificialFrame = null;
                    }
                }
                this.accessartificialFrame = getHighSpeedVideoFpsRanges(com.sun.jna.Pointer.nativeValue(this.ArtificialStackFrames));
                util.h.xy.ai.mf.getHighSpeedVideoFpsRangesFor._BAvwmAysqzVkeV6uRSb5XK(this.accessartificialFrame, this.isOutputSupportedForhNQ4ISI, this.getInputFormats, this.toString, this.getOutputMinFrameDuration, this.coroutineBoundary);
                int[] iArr = new int[1];
                this.unwrapAs.read(getHighSpeedVideoSizes(), iArr, 0, 1);
                int i8 = iArr[0];
                getHighSpeedVideoSizes = (getInputSizeshNQ4ISI + 47) % 128;
                return i8;
            }
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(51 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 83, (char) ((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 48428), objArr);
        throw new java.io.IOException(((java.lang.String) objArr[0]).intern());
    }

    /* renamed from: ͺ, reason: contains not printable characters */
    public final void m24863() {
        int i = getHighSpeedVideoSizes + 7;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            m24864();
            m24858();
            m24860();
            m24854();
            m24866();
            m24849();
            int i2 = getInputSizeshNQ4ISI + 33;
            getHighSpeedVideoSizes = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            return;
        }
        m24864();
        m24858();
        m24860();
        m24854();
        m24866();
        m24849();
        throw null;
    }
}
