package util.h.xy.ai;

/* loaded from: classes5.dex */
public final class ma {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 1;
    private static char[] getHighResolutionOutputSizeshNQ4ISI = {40044, 19925, 16176, 59542, 55973, 33863, 30118, 9994, 4453, 49800, 44088, 40335, 20473, 14691, 60090, 54298, 34401, 30661, 8487, 4784, 64748, 44608, 40882, 18740, 15212, 58590, 54845, 34719, 29167, 9071, 3254, 65028, 43076, 39392, 19205, 13675, 59095, 53303, 33171, 59449, 14720, 19301, 40131, 44784, 61458, 499, 21343, 25904, 46813, 55405, 59866, 15276, 19766, 40687, 41039, 62004, 912, 21874, 26347, 34981, 55823, 60389, 15703, 20260, 37028, 41568, 62427, 1418, 22300, 30956, 35405, 56337, 60903, 16229, 16702, 37514, 42100, 62866, 1973, 10517, 31471, 35917, 56875, 62659, 9594, 22431, 32825, 45578, 60648, 7433, 20389, 31178, 43559, 50309, 62761, 10062, 20899, 33296, 48288, 61132, 8062, 18833, 31288, 37966, 50942, 63242, 8618, 21398, 35955, 48785, 61238, 6494, 19442, 25602, 38576, 49402, 61702, 9123, 24003, 36394, 47238, 59693, 7005, 13806, 26120, 37024, 49878, 62242, 11653, 24105, 34899, 47853, 60171};
    private static long getInputFormats = 457714117606985120L;
    private util.h.xy.ai.ma.b getOutputSizeshNQ4ISI = null;
    private util.h.xy.ai.ma.b getOutputStallDurationlomOqCM = null;
    private int coroutineCreation = 0;
    private util.h.xy.ai.ma.b getValidOutputFormatsForInputhNQ4ISI = null;
    private util.h.xy.ai.ma.b toString = null;
    private util.h.xy.ai.ma.b getOutputFormats = null;
    private util.h.xy.ai.ma.b ArtificialStackFrames = null;
    private util.h.xy.ai.ma.b getOutputMinFrameDuration = null;
    private int coroutineBoundary = 0;
    private util.h.xy.ai.ma.b getHighSpeedVideoSizesFor = null;
    private util.h.xy.ai.ma.b getInputSizeshNQ4ISI = null;
    private util.h.xy.ai.ma.b getOutputSizes = null;
    private int getOutputStallDuration = 0;
    private util.h.xy.ai.ma.b getOutputMinFrameDurationlomOqCM = null;
    private util.h.xy.ai.ma.b isOutputSupportedFor = null;
    private util.h.xy.ai.ma.b accessartificialFrame = null;
    private util.h.xy.ai.ma.b unwrapAs = null;
    private util.h.xy.ai.ma.b isOutputSupportedForhNQ4ISI = null;
    private util.h.xy.ai.ma.b CoroutineDebuggingKt = null;

    protected final void finalize() {
        int i = getHighSpeedVideoFpsRangesFor + 15;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 != 0) {
            m24698();
        } else {
            m24698();
            throw null;
        }
    }

    final class b extends com.sun.jna.Memory {
        private static int Camera2StreamConfigurationMap = 1;
        private static int getHighSpeedVideoFpsRangesFor;

        public b(long j) {
            super(j);
        }

        @Override // com.sun.jna.Memory
        public final void dispose() {
            int i = getHighSpeedVideoFpsRangesFor + 107;
            Camera2StreamConfigurationMap = i % 128;
            if (i % 2 != 0) {
                super.dispose();
            } else {
                super.dispose();
                throw null;
            }
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    protected final void m24684() {
        util.h.xy.ai.ma.b bVar = this.getOutputSizeshNQ4ISI;
        if (bVar != null) {
            int i = getHighSpeedVideoFpsRangesFor + 45;
            getHighSpeedVideoSizes = i % 128;
            try {
                if (i % 2 == 0) {
                    bVar.dispose();
                    this.getOutputSizeshNQ4ISI = null;
                    throw new java.lang.ArithmeticException();
                }
                bVar.dispose();
            } finally {
                this.getOutputSizeshNQ4ISI = null;
            }
        }
        util.h.xy.ai.ma.b bVar2 = this.getOutputStallDurationlomOqCM;
        if (bVar2 != null) {
            int i2 = getHighSpeedVideoFpsRangesFor + 83;
            getHighSpeedVideoSizes = i2 % 128;
            try {
                if (i2 % 2 != 0) {
                    bVar2.dispose();
                } else {
                    bVar2.dispose();
                    throw null;
                }
            } finally {
                this.getOutputStallDurationlomOqCM = null;
            }
        }
    }

    private static void Camera2StreamConfigurationMap(int i, int i2, char c, java.lang.Object[] objArr) {
        util.h.xz.b.rb rbVar = new util.h.xz.b.rb();
        long[] jArr = new long[i];
        rbVar.f2651 = 0;
        int i3 = Camera2StreamConfigurationMap + 93;
        while (true) {
            getHighSpeedVideoFpsRanges = i3 % 128;
            if (rbVar.f2651 >= i) {
                break;
            }
            jArr[rbVar.f2651] = (((char) (getHighResolutionOutputSizeshNQ4ISI[rbVar.f2651 + i2] ^ 3446303986615426049L)) ^ (rbVar.f2651 * (3446303986615426049L ^ getInputFormats))) ^ c;
            rbVar.f2651++;
            i3 = Camera2StreamConfigurationMap + 43;
        }
        char[] cArr = new char[i];
        rbVar.f2651 = 0;
        while (rbVar.f2651 < i) {
            getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 31) % 128;
            cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
            rbVar.f2651++;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m24693(int i) {
        util.h.xy.ai.ma.b bVar = this.getOutputSizeshNQ4ISI;
        if (bVar != null) {
            int i2 = getHighSpeedVideoFpsRangesFor + 101;
            getHighSpeedVideoSizes = i2 % 128;
            try {
                if (i2 % 2 == 0) {
                    bVar.dispose();
                    throw null;
                }
                bVar.dispose();
            } finally {
                this.getOutputSizeshNQ4ISI = null;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE);
        int i3 = (getHighSpeedVideoSizes + 41) % 128;
        getHighSpeedVideoFpsRangesFor = i3;
        getHighSpeedVideoSizes = (i3 + 95) % 128;
        util.h.xy.ai.ma.b bVar2 = new util.h.xy.ai.ma.b(nativeSize + 121);
        this.getOutputSizeshNQ4ISI = bVar2;
        int i4 = getHighSpeedVideoSizes;
        getHighSpeedVideoFpsRangesFor = (i4 + 69) % 128;
        getHighSpeedVideoFpsRangesFor = (i4 + 19) % 128;
        bVar2.setInt(80L, i);
        util.h.xy.ai.ma.b bVar3 = this.getOutputStallDurationlomOqCM;
        if (bVar3 != null) {
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 73) % 128;
            try {
                bVar3.dispose();
            } finally {
                this.getOutputStallDurationlomOqCM = null;
            }
        }
        long nativeValue = com.sun.jna.Pointer.nativeValue(this.getOutputSizeshNQ4ISI);
        int i5 = getHighSpeedVideoSizes;
        getHighSpeedVideoFpsRangesFor = (i5 + 69) % 128;
        getHighSpeedVideoFpsRangesFor = (i5 + 19) % 128;
        long j = nativeValue + 80;
        util.h.xy.ai.ma.b bVar4 = new util.h.xy.ai.ma.b(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        byte[] bArr = new byte[com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)];
        int i6 = 0;
        while (i6 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)) {
            int i7 = getHighSpeedVideoSizes + 19;
            int i8 = i7 % 128;
            getHighSpeedVideoFpsRangesFor = i8;
            if (i7 % 2 != 0) {
                bArr[i6] = (byte) ((j - (255 >> (i6 / 51))) << (i6 * 62));
                i6 += 112;
            } else {
                int i9 = i6 * 8;
                bArr[i6] = (byte) (((255 << i9) & j) >> i9);
                i6++;
            }
            getHighSpeedVideoSizes = (i8 + 117) % 128;
        }
        int i10 = 1807877756;
        for (int i11 = 0; i11 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i11++) {
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 21) % 128;
            byte b2 = bArr[i11];
            bArr[i11] = (byte) (((byte) (i10 & 255)) ^ b2);
            i10 = ((i10 << (i11 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))) | (i10 >>> (((com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8) - 1) - (i11 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))))) * (~(b2 & 255));
        }
        long j2 = 0;
        for (int i12 = 0; i12 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i12++) {
            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 33) % 128;
            j2 |= (bArr[i12] & 255) << (i12 * 8);
        }
        bVar4.setLong(0L, j2);
        this.getOutputStallDurationlomOqCM = bVar4;
        int i13 = getHighSpeedVideoFpsRangesFor + 5;
        getHighSpeedVideoSizes = i13 % 128;
        if (i13 % 2 == 0) {
            throw null;
        }
    }

    private static int getHighSpeedVideoSizes() {
        int i = getHighSpeedVideoFpsRangesFor + 89;
        int i2 = i % 128;
        getHighSpeedVideoSizes = i2;
        int i3 = i % 2 == 0 ? 3 : 74;
        int i4 = i2 + 67;
        getHighSpeedVideoFpsRangesFor = i4 % 128;
        if (i4 % 2 == 0) {
            return i3;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    protected final void m24690() {
        util.h.xy.ai.ma.b bVar = this.getValidOutputFormatsForInputhNQ4ISI;
        if (bVar != null) {
            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 21) % 128;
            try {
                bVar.dispose();
            } finally {
                this.getValidOutputFormatsForInputhNQ4ISI = null;
            }
        }
        util.h.xy.ai.ma.b bVar2 = this.toString;
        if (bVar2 != null) {
            int i = getHighSpeedVideoFpsRangesFor + 45;
            getHighSpeedVideoSizes = i % 128;
            try {
                if (i % 2 == 0) {
                    bVar2.dispose();
                    throw null;
                }
                bVar2.dispose();
            } finally {
                this.toString = null;
            }
        }
        util.h.xy.ai.ma.b bVar3 = this.getOutputFormats;
        if (bVar3 != null) {
            int i2 = getHighSpeedVideoSizes + 25;
            getHighSpeedVideoFpsRangesFor = i2 % 128;
            try {
                if (i2 % 2 == 0) {
                    bVar3.dispose();
                } else {
                    bVar3.dispose();
                    this.getOutputFormats = null;
                    throw new java.lang.ArithmeticException();
                }
            } finally {
                this.getOutputFormats = null;
            }
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m24691(int i) {
        this.coroutineCreation = i;
        util.h.xy.ai.ma.b bVar = this.getValidOutputFormatsForInputhNQ4ISI;
        if (bVar != null) {
            int i2 = getHighSpeedVideoSizes + 37;
            getHighSpeedVideoFpsRangesFor = i2 % 128;
            try {
                if (i2 % 2 != 0) {
                    bVar.dispose();
                    this.getValidOutputFormatsForInputhNQ4ISI = null;
                    throw new java.lang.ArithmeticException();
                }
                bVar.dispose();
            } finally {
                this.getValidOutputFormatsForInputhNQ4ISI = null;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE) * i;
        int i3 = getHighSpeedVideoFpsRangesFor;
        int i4 = i3 + 13;
        getHighSpeedVideoSizes = i4 % 128;
        int i5 = i4 % 2 == 0 ? 108 : 103;
        int i6 = i3 + 9;
        getHighSpeedVideoSizes = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
        this.getValidOutputFormatsForInputhNQ4ISI = new util.h.xy.ai.ma.b(nativeSize + i5);
        util.h.xy.ai.ma.b bVar2 = this.toString;
        if (bVar2 != null) {
            try {
                bVar2.dispose();
            } finally {
                this.toString = null;
            }
        }
        util.h.xy.ai.ma.b bVar3 = new util.h.xy.ai.ma.b(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        this.toString = bVar3;
        bVar3.setPointer(0L, new com.sun.jna.Pointer(com.sun.jna.Pointer.nativeValue(this.getValidOutputFormatsForInputhNQ4ISI) + getHighSpeedVideoSizes()));
        util.h.xy.ai.ma.b bVar4 = this.getOutputFormats;
        if (bVar4 != null) {
            int i7 = getHighSpeedVideoSizes + 89;
            getHighSpeedVideoFpsRangesFor = i7 % 128;
            try {
                if (i7 % 2 != 0) {
                    bVar4.dispose();
                    this.getOutputFormats = null;
                    throw new java.lang.ArithmeticException();
                }
                bVar4.dispose();
            } finally {
                this.getOutputFormats = null;
            }
        }
        long nativeValue = com.sun.jna.Pointer.nativeValue(this.toString);
        util.h.xy.ai.ma.b bVar5 = new util.h.xy.ai.ma.b(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        bVar5.setLong(0L, nativeValue ^ 1415302072);
        int i8 = getHighSpeedVideoFpsRangesFor;
        int i9 = i8 + 41;
        getHighSpeedVideoSizes = i9 % 128;
        if (i9 % 2 == 0) {
            throw null;
        }
        this.getOutputFormats = bVar5;
        getHighSpeedVideoSizes = (i8 + 17) % 128;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m24689(byte[] bArr) throws java.io.IOException {
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 61) % 128;
        m24691(bArr.length);
        this.getValidOutputFormatsForInputhNQ4ISI.write(getHighSpeedVideoSizes(), bArr, 0, bArr.length);
        int i = getHighSpeedVideoFpsRangesFor + 21;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private static int getHighSpeedVideoFpsRangesFor() {
        int i = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoSizes = (i + 119) % 128;
        int i2 = i + 109;
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 != 0) {
            return 92;
        }
        throw null;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    protected final void m24687() {
        int i = getHighSpeedVideoFpsRangesFor + 11;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 != 0) {
            util.h.xy.ai.ma.b bVar = this.ArtificialStackFrames;
            if (bVar != null) {
                try {
                    bVar.dispose();
                } finally {
                    this.ArtificialStackFrames = null;
                }
            }
            util.h.xy.ai.ma.b bVar2 = this.getOutputMinFrameDuration;
            if (bVar2 != null) {
                int i2 = getHighSpeedVideoSizes + 65;
                getHighSpeedVideoFpsRangesFor = i2 % 128;
                try {
                    if (i2 % 2 == 0) {
                        bVar2.dispose();
                        return;
                    } else {
                        bVar2.dispose();
                        this.getOutputMinFrameDuration = null;
                        throw new java.lang.ArithmeticException();
                    }
                } finally {
                    this.getOutputMinFrameDuration = null;
                }
            }
            return;
        }
        throw new java.lang.ArithmeticException();
    }

    private util.h.xy.ai.ma.b getHighSpeedVideoFpsRangesFor(long j) {
        util.h.xy.ai.ma.b bVar = new util.h.xy.ai.ma.b(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        byte[] bArr = new byte[com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)];
        int i = 0;
        for (int i2 = 0; i2 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i2++) {
            int i3 = i2 * 8;
            bArr[i2] = (byte) (((255 << i3) & j) >> i3);
        }
        int i4 = 285509138;
        int i5 = 0;
        while (i5 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)) {
            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 37) % 128;
            byte b2 = bArr[i5];
            bArr[i5] = (byte) (((byte) (i4 & 255)) ^ b2);
            i4 = ((i4 << (i5 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))) | (i4 >>> (((com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8) - 1) - (i5 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))))) * (~(b2 & 255));
            i5++;
            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 13) % 128;
        }
        long j2 = 0;
        while (i < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)) {
            int i6 = getHighSpeedVideoSizes + 29;
            getHighSpeedVideoFpsRangesFor = i6 % 128;
            if (i6 % 2 != 0) {
                j2 &= (bArr[i] & com.visa.cbp.getEncExpo.IResultReceiver) >>> (i << 56);
                i += 9;
            } else {
                j2 |= (bArr[i] & 255) << (i * 8);
                i++;
            }
        }
        bVar.setLong(0L, j2);
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 109) % 128;
        return bVar;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m24685(int i) {
        int i2 = getHighSpeedVideoSizes + 75;
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        util.h.xy.ai.ma.b bVar = this.ArtificialStackFrames;
        if (bVar != null) {
            try {
                bVar.dispose();
            } finally {
                this.ArtificialStackFrames = null;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE);
        int i3 = getHighSpeedVideoSizes + 71;
        int i4 = i3 % 128;
        getHighSpeedVideoFpsRangesFor = i4;
        int i5 = i3 % 2 != 0 ? 64 : 109;
        int i6 = i4 + 33;
        getHighSpeedVideoSizes = i6 % 128;
        if (i6 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        util.h.xy.ai.ma.b bVar2 = new util.h.xy.ai.ma.b(nativeSize + i5);
        this.ArtificialStackFrames = bVar2;
        getHighSpeedVideoFpsRangesFor();
        bVar2.setInt(92L, i);
        util.h.xy.ai.ma.b bVar3 = this.getOutputMinFrameDuration;
        if (bVar3 != null) {
            int i7 = getHighSpeedVideoSizes + 41;
            getHighSpeedVideoFpsRangesFor = i7 % 128;
            try {
                if (i7 % 2 != 0) {
                    bVar3.dispose();
                    throw null;
                }
                bVar3.dispose();
                this.getOutputMinFrameDuration = null;
                int i8 = getHighSpeedVideoFpsRangesFor + 87;
                getHighSpeedVideoSizes = i8 % 128;
                int i9 = i8 % 2;
            } finally {
                this.getOutputMinFrameDuration = null;
            }
        }
        long nativeValue = com.sun.jna.Pointer.nativeValue(this.ArtificialStackFrames);
        getHighSpeedVideoFpsRangesFor();
        this.getOutputMinFrameDuration = getHighSpeedVideoFpsRangesFor(nativeValue + 92);
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    protected final void m24692() {
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 89) % 128;
        util.h.xy.ai.ma.b bVar = this.getHighSpeedVideoSizesFor;
        if (bVar != null) {
            try {
                bVar.dispose();
                this.getHighSpeedVideoSizesFor = null;
                int i = getHighSpeedVideoFpsRangesFor + 15;
                getHighSpeedVideoSizes = i % 128;
                int i2 = i % 2;
            } catch (java.lang.Throwable th) {
                this.getHighSpeedVideoSizesFor = null;
                throw th;
            }
        }
        util.h.xy.ai.ma.b bVar2 = this.getInputSizeshNQ4ISI;
        if (bVar2 != null) {
            try {
                bVar2.dispose();
            } finally {
                this.getInputSizeshNQ4ISI = null;
            }
        }
        util.h.xy.ai.ma.b bVar3 = this.getOutputSizes;
        if (bVar3 != null) {
            try {
                bVar3.dispose();
            } finally {
                this.getOutputSizes = null;
            }
        }
    }

    private util.h.xy.ai.ma.b getHighResolutionOutputSizeshNQ4ISI(long j) {
        util.h.xy.ai.ma.b bVar = new util.h.xy.ai.ma.b(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        byte[] bArr = new byte[com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)];
        int i = 0;
        for (int i2 = 0; i2 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i2++) {
            int i3 = i2 * 8;
            bArr[i2] = (byte) (((255 << i3) & j) >> i3);
        }
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 75) % 128;
        int i4 = 390490424;
        for (int i5 = 0; i5 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i5++) {
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 79) % 128;
            byte b2 = bArr[i5];
            bArr[i5] = (byte) (((byte) (i4 & 255)) ^ b2);
            i4 = ((i4 << (i5 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))) | (i4 >>> (((com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8) - 1) - (i5 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))))) * (~(b2 & 255));
        }
        long j2 = 0;
        while (i < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)) {
            int i6 = getHighSpeedVideoFpsRangesFor + 1;
            getHighSpeedVideoSizes = i6 % 128;
            if (i6 % 2 == 0) {
                j2 *= (bArr[i] & com.visa.cbp.getEncExpo.addOnTrimMemoryListener) >>> (i * 51);
                i += 79;
            } else {
                j2 |= (bArr[i] & 255) << (i * 8);
                i++;
            }
        }
        bVar.setLong(0L, j2);
        return bVar;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m24688(int i) {
        this.coroutineBoundary = i;
        util.h.xy.ai.ma.b bVar = this.getHighSpeedVideoSizesFor;
        if (bVar != null) {
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 109) % 128;
            try {
                bVar.dispose();
            } finally {
                this.getHighSpeedVideoSizesFor = null;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE) * i;
        int i2 = getHighSpeedVideoFpsRangesFor;
        int i3 = i2 + 105;
        getHighSpeedVideoSizes = i3 % 128;
        int i4 = i3 % 2 == 0 ? 25 : 125;
        getHighSpeedVideoSizes = (i2 + 37) % 128;
        this.getHighSpeedVideoSizesFor = new util.h.xy.ai.ma.b(nativeSize + i4);
        util.h.xy.ai.ma.b bVar2 = this.getInputSizeshNQ4ISI;
        if (bVar2 != null) {
            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 9) % 128;
            try {
                bVar2.dispose();
                this.getInputSizeshNQ4ISI = null;
                getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 3) % 128;
            } catch (java.lang.Throwable th) {
                this.getInputSizeshNQ4ISI = null;
                throw th;
            }
        }
        util.h.xy.ai.ma.b bVar3 = new util.h.xy.ai.ma.b(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        this.getInputSizeshNQ4ISI = bVar3;
        long nativeValue = com.sun.jna.Pointer.nativeValue(this.getHighSpeedVideoSizesFor);
        int i5 = getHighSpeedVideoFpsRangesFor + 25;
        getHighSpeedVideoSizes = i5 % 128;
        bVar3.setPointer(0L, new com.sun.jna.Pointer(nativeValue + (i5 % 2 == 0 ? 29 : 80)));
        util.h.xy.ai.ma.b bVar4 = this.getOutputSizes;
        if (bVar4 != null) {
            int i6 = getHighSpeedVideoFpsRangesFor + 7;
            getHighSpeedVideoSizes = i6 % 128;
            try {
                if (i6 % 2 == 0) {
                    bVar4.dispose();
                    throw null;
                }
                bVar4.dispose();
            } finally {
                this.getOutputSizes = null;
            }
        }
        this.getOutputSizes = getHighResolutionOutputSizeshNQ4ISI(com.sun.jna.Pointer.nativeValue(this.getInputSizeshNQ4ISI));
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final byte[] m24697() throws java.io.IOException {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = i + 81;
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        util.h.xy.ai.ma.b bVar = this.getHighSpeedVideoSizesFor;
        if (bVar == null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            Camera2StreamConfigurationMap((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 39, (-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr);
            throw new java.io.IOException(((java.lang.String) objArr[0]).intern());
        }
        int i3 = this.coroutineBoundary;
        byte[] bArr = new byte[i3];
        int i4 = i + 25;
        getHighSpeedVideoSizes = i4 % 128;
        bVar.read(i4 % 2 == 0 ? 29 : 80, bArr, 0, i3);
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 35) % 128;
        return bArr;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m24686(byte[] bArr) throws java.io.IOException {
        int i = getHighSpeedVideoSizes + 43;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 != 0) {
            m24688(bArr.length);
            util.h.xy.ai.ma.b bVar = this.getHighSpeedVideoSizesFor;
            int i2 = getHighSpeedVideoFpsRangesFor + 25;
            getHighSpeedVideoSizes = i2 % 128;
            bVar.write(0 - (i2 % 2 != 0 ? 80 : 29), bArr, 1, bArr.length);
            return;
        }
        m24688(bArr.length);
        util.h.xy.ai.ma.b bVar2 = this.getHighSpeedVideoSizesFor;
        int i3 = getHighSpeedVideoFpsRangesFor + 25;
        getHighSpeedVideoSizes = i3 % 128;
        bVar2.write(i3 % 2 != 0 ? 80 : 29, bArr, 0, bArr.length);
    }

    private static int Camera2StreamConfigurationMap() {
        int i = getHighSpeedVideoSizes + 113;
        int i2 = i % 128;
        getHighSpeedVideoFpsRangesFor = i2;
        int i3 = i % 2 != 0 ? 95 : 98;
        int i4 = i2 + 39;
        getHighSpeedVideoSizes = i4 % 128;
        if (i4 % 2 != 0) {
            return i3;
        }
        throw null;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    protected final void m24682() {
        util.h.xy.ai.ma.b bVar = this.getOutputMinFrameDurationlomOqCM;
        if (bVar != null) {
            try {
                bVar.dispose();
            } finally {
                this.getOutputMinFrameDurationlomOqCM = null;
            }
        }
        util.h.xy.ai.ma.b bVar2 = this.isOutputSupportedFor;
        if (bVar2 != null) {
            int i = getHighSpeedVideoFpsRangesFor + 53;
            getHighSpeedVideoSizes = i % 128;
            try {
                if (i % 2 == 0) {
                    bVar2.dispose();
                    throw null;
                }
                bVar2.dispose();
            } finally {
                this.isOutputSupportedFor = null;
            }
        }
        util.h.xy.ai.ma.b bVar3 = this.accessartificialFrame;
        if (bVar3 != null) {
            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 49) % 128;
            try {
                bVar3.dispose();
                this.accessartificialFrame = null;
                getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 103) % 128;
            } catch (java.lang.Throwable th) {
                this.accessartificialFrame = null;
                throw th;
            }
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m24696(int i) {
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 7) % 128;
        this.getOutputStallDuration = i;
        util.h.xy.ai.ma.b bVar = this.getOutputMinFrameDurationlomOqCM;
        if (bVar != null) {
            try {
                bVar.dispose();
            } finally {
                this.getOutputMinFrameDurationlomOqCM = null;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * i;
        int i2 = getHighSpeedVideoSizes + 71;
        int i3 = i2 % 128;
        getHighSpeedVideoFpsRangesFor = i3;
        int i4 = i2 % 2 != 0 ? 7247 : com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE;
        int i5 = i3 + 53;
        getHighSpeedVideoSizes = i5 % 128;
        if (i5 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        this.getOutputMinFrameDurationlomOqCM = new util.h.xy.ai.ma.b(nativeSize + i4);
        util.h.xy.ai.ma.b bVar2 = this.isOutputSupportedFor;
        if (bVar2 != null) {
            try {
                bVar2.dispose();
                this.isOutputSupportedFor = null;
                getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 113) % 128;
            } catch (java.lang.Throwable th) {
                this.isOutputSupportedFor = null;
                throw th;
            }
        }
        util.h.xy.ai.ma.b bVar3 = new util.h.xy.ai.ma.b(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        this.isOutputSupportedFor = bVar3;
        bVar3.setPointer(0L, new com.sun.jna.Pointer(com.sun.jna.Pointer.nativeValue(this.getOutputMinFrameDurationlomOqCM) + Camera2StreamConfigurationMap()));
        util.h.xy.ai.ma.b bVar4 = this.accessartificialFrame;
        if (bVar4 != null) {
            try {
                bVar4.dispose();
            } finally {
                this.accessartificialFrame = null;
            }
        }
        long nativeValue = com.sun.jna.Pointer.nativeValue(this.isOutputSupportedFor);
        util.h.xy.ai.ma.b bVar5 = new util.h.xy.ai.ma.b(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        bVar5.setLong(0L, nativeValue ^ 1408181137);
        int i6 = getHighSpeedVideoFpsRangesFor + 107;
        getHighSpeedVideoSizes = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
        this.accessartificialFrame = bVar5;
    }

    /* renamed from: ͺ, reason: contains not printable characters */
    public final int[] m24695() throws java.io.IOException {
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 49) % 128;
        util.h.xy.ai.ma.b bVar = this.getOutputMinFrameDurationlomOqCM;
        if (bVar == null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            Camera2StreamConfigurationMap((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 44, android.text.TextUtils.getTrimmedLength("") + 39, (char) (android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 29781), objArr);
            throw new java.io.IOException(((java.lang.String) objArr[0]).intern());
        }
        int[] iArr = new int[this.getOutputStallDuration];
        bVar.read(Camera2StreamConfigurationMap(), iArr, 0, this.getOutputStallDuration);
        int i = getHighSpeedVideoFpsRangesFor + 23;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 != 0) {
            return iArr;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m24694(int[] iArr) throws java.io.IOException {
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 75) % 128;
        m24696(iArr.length);
        this.getOutputMinFrameDurationlomOqCM.write(Camera2StreamConfigurationMap(), iArr, 0, iArr.length);
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 47) % 128;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    protected final void m24681() {
        util.h.xy.ai.ma.b bVar = this.unwrapAs;
        if (bVar != null) {
            int i = getHighSpeedVideoFpsRangesFor + 83;
            getHighSpeedVideoSizes = i % 128;
            try {
                if (i % 2 == 0) {
                    bVar.dispose();
                    this.unwrapAs = null;
                    throw new java.lang.ArithmeticException();
                }
                bVar.dispose();
            } finally {
                this.unwrapAs = null;
            }
        }
        util.h.xy.ai.ma.b bVar2 = this.isOutputSupportedForhNQ4ISI;
        if (bVar2 != null) {
            int i2 = getHighSpeedVideoSizes + 71;
            getHighSpeedVideoFpsRangesFor = i2 % 128;
            try {
                if (i2 % 2 != 0) {
                    bVar2.dispose();
                    this.isOutputSupportedForhNQ4ISI = null;
                    throw new java.lang.ArithmeticException();
                }
                bVar2.dispose();
            } finally {
                this.isOutputSupportedForhNQ4ISI = null;
            }
        }
        util.h.xy.ai.ma.b bVar3 = this.CoroutineDebuggingKt;
        if (bVar3 != null) {
            try {
                bVar3.dispose();
            } finally {
                this.CoroutineDebuggingKt = null;
            }
        }
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 115) % 128;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public final int m24683() throws java.io.IOException {
        int i = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoSizes = (i + 109) % 128;
        if (this.getOutputStallDurationlomOqCM != null) {
            int i2 = (i + 121) % 128;
            getHighSpeedVideoSizes = i2;
            if (this.getOutputFormats != null && this.getOutputMinFrameDuration != null && this.getOutputSizes != null) {
                int i3 = i2 + 57;
                getHighSpeedVideoFpsRangesFor = i3 % 128;
                if (i3 % 2 != 0) {
                    throw null;
                }
                if (this.accessartificialFrame != null) {
                    util.h.xy.ai.ma.b bVar = this.unwrapAs;
                    if (bVar != null) {
                        try {
                            bVar.dispose();
                            this.unwrapAs = null;
                            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 97) % 128;
                        } catch (java.lang.Throwable th) {
                            this.unwrapAs = null;
                            throw th;
                        }
                    }
                    int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE);
                    int i4 = getHighSpeedVideoFpsRangesFor + 83;
                    getHighSpeedVideoSizes = i4 % 128;
                    this.unwrapAs = new util.h.xy.ai.ma.b(nativeSize + (i4 % 2 == 0 ? 88 : 99));
                    util.h.xy.ai.ma.b bVar2 = this.isOutputSupportedForhNQ4ISI;
                    if (bVar2 != null) {
                        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 7) % 128;
                        try {
                            bVar2.dispose();
                        } finally {
                            this.isOutputSupportedForhNQ4ISI = null;
                        }
                    }
                    util.h.xy.ai.ma.b bVar3 = new util.h.xy.ai.ma.b(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
                    this.isOutputSupportedForhNQ4ISI = bVar3;
                    long nativeValue = com.sun.jna.Pointer.nativeValue(this.unwrapAs);
                    int i5 = getHighSpeedVideoFpsRangesFor + 73;
                    getHighSpeedVideoSizes = i5 % 128;
                    bVar3.setPointer(0L, new com.sun.jna.Pointer(nativeValue + (i5 % 2 == 0 ? 58 : 78)));
                    util.h.xy.ai.ma.b bVar4 = this.CoroutineDebuggingKt;
                    if (bVar4 != null) {
                        int i6 = getHighSpeedVideoSizes + 109;
                        getHighSpeedVideoFpsRangesFor = i6 % 128;
                        try {
                            if (i6 % 2 != 0) {
                                bVar4.dispose();
                                throw null;
                            }
                            bVar4.dispose();
                        } finally {
                            this.CoroutineDebuggingKt = null;
                        }
                    }
                    long nativeValue2 = com.sun.jna.Pointer.nativeValue(this.isOutputSupportedForhNQ4ISI);
                    util.h.xy.ai.ma.b bVar5 = new util.h.xy.ai.ma.b(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
                    bVar5.setLong(0L, nativeValue2 ^ 790187043);
                    getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 9) % 128;
                    this.CoroutineDebuggingKt = bVar5;
                    util.h.xy.ai.i.Camera2StreamConfigurationMap._EFCoEKTUsesSSwpAKUhiws(this.CoroutineDebuggingKt, this.getOutputStallDurationlomOqCM, this.getOutputFormats, this.getOutputMinFrameDuration, this.getOutputSizes, this.accessartificialFrame);
                    int[] iArr = new int[1];
                    util.h.xy.ai.ma.b bVar6 = this.unwrapAs;
                    int i7 = getHighSpeedVideoFpsRangesFor + 73;
                    getHighSpeedVideoSizes = i7 % 128;
                    bVar6.read(i7 % 2 != 0 ? 78 : 58, iArr, 0, 1);
                    return iArr[0];
                }
            }
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        Camera2StreamConfigurationMap(50 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), 82 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) (26799 - android.view.Gravity.getAbsoluteGravity(0, 0)), objArr);
        throw new java.io.IOException(((java.lang.String) objArr[0]).intern());
    }

    /* renamed from: ι, reason: contains not printable characters */
    public final void m24698() {
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 71) % 128;
        m24684();
        m24690();
        m24687();
        m24692();
        m24682();
        m24681();
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 35) % 128;
    }
}
