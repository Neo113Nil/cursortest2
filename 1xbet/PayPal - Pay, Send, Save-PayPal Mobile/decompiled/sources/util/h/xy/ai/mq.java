package util.h.xy.ai;

/* loaded from: classes18.dex */
public final class mq {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes = -519467402;
    private static short[] getHighSpeedVideoSizesFor = null;
    private static int getInputFormats = -694729277;
    private static byte[] getOutputFormats = {35, 62, 62, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, 48, -13, 74, 44, 2, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, 1, 44, 5, -22, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, 60, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, 2, 32, com.google.common.base.Ascii.FF, 46, 2, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, 59, 62, -15, 74, 62, 42, 14, 44, 5, 41, com.google.common.base.Ascii.FF, 46, 14, -19, 65, kotlin.io.encoding.Base64.padSymbol, 40, -2, 65, kotlin.io.encoding.Base64.padSymbol, 40, 59, com.visa.cbp.getEncExpo.onUnminimized, 73, 62, 59, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE};
    private static int getOutputMinFrameDuration = -408872977;
    private int CoroutineDebuggingKt = 0;
    private util.h.xy.ai.mq.ma toString = null;
    private util.h.xy.ai.mq.ma coroutineBoundary = null;
    private util.h.xy.ai.mq.ma accessartificialFrame = null;
    private util.h.xy.ai.mq.ma unwrapAs = null;
    private util.h.xy.ai.mq.ma getOutputMinFrameDurationlomOqCM = null;
    private int coroutineCreation = 0;
    private util.h.xy.ai.mq.ma getInputSizeshNQ4ISI = null;
    private util.h.xy.ai.mq.ma getARTIFICIAL_FRAME_PACKAGE_NAME = null;
    private util.h.xy.ai.mq.ma getOutputStallDuration = null;
    private int getOutputSizes = 0;
    private util.h.xy.ai.mq.ma getOutputSizeshNQ4ISI = null;
    private util.h.xy.ai.mq.ma getOutputStallDurationlomOqCM = null;
    private util.h.xy.ai.mq.ma isOutputSupportedForhNQ4ISI = null;
    private util.h.xy.ai.mq.ma getValidOutputFormatsForInputhNQ4ISI = null;
    private util.h.xy.ai.mq.ma isOutputSupportedFor = null;
    private util.h.xy.ai.mq.ma ArtificialStackFrames = null;

    protected final void finalize() {
        int i = getHighSpeedVideoFpsRanges + 15;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 != 0) {
            m24794();
        } else {
            m24794();
            throw new java.lang.ArithmeticException();
        }
    }

    final class ma extends com.sun.jna.Memory {
        private static int getHighSpeedVideoFpsRanges = 0;
        private static int getHighSpeedVideoSizes = 1;

        public ma(long j) {
            super(j);
        }

        @Override // com.sun.jna.Memory
        public final void dispose() {
            int i = getHighSpeedVideoSizes + 109;
            getHighSpeedVideoFpsRanges = i % 128;
            if (i % 2 == 0) {
                super.dispose();
            } else {
                super.dispose();
                throw new java.lang.ArithmeticException();
            }
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    protected final void m24784() {
        util.h.xy.ai.mq.ma maVar = this.toString;
        if (maVar != null) {
            try {
                maVar.dispose();
            } finally {
                this.toString = null;
            }
        }
        util.h.xy.ai.mq.ma maVar2 = this.coroutineBoundary;
        if (maVar2 != null) {
            try {
                maVar2.dispose();
                this.coroutineBoundary = null;
                getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 105) % 128;
            } catch (java.lang.Throwable th) {
                this.coroutineBoundary = null;
                throw th;
            }
        }
        util.h.xy.ai.mq.ma maVar3 = this.accessartificialFrame;
        if (maVar3 != null) {
            int i = getHighSpeedVideoFpsRangesFor + 79;
            getHighSpeedVideoFpsRanges = i % 128;
            try {
                if (i % 2 == 0) {
                    maVar3.dispose();
                } else {
                    maVar3.dispose();
                    this.accessartificialFrame = null;
                    throw new java.lang.ArithmeticException();
                }
            } finally {
                this.accessartificialFrame = null;
            }
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m24785(int i) {
        this.CoroutineDebuggingKt = i;
        util.h.xy.ai.mq.ma maVar = this.toString;
        if (maVar != null) {
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 33) % 128;
            try {
                maVar.dispose();
            } finally {
                this.toString = null;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE) * i;
        int i2 = getHighSpeedVideoFpsRanges + 117;
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        this.toString = new util.h.xy.ai.mq.ma(nativeSize + (i2 % 2 == 0 ? 95 : 113));
        util.h.xy.ai.mq.ma maVar2 = this.coroutineBoundary;
        if (maVar2 != null) {
            int i3 = getHighSpeedVideoFpsRangesFor + 69;
            getHighSpeedVideoFpsRanges = i3 % 128;
            try {
                if (i3 % 2 != 0) {
                    maVar2.dispose();
                    this.coroutineBoundary = null;
                    throw new java.lang.ArithmeticException();
                }
                maVar2.dispose();
            } finally {
                this.coroutineBoundary = null;
            }
        }
        util.h.xy.ai.mq.ma maVar3 = new util.h.xy.ai.mq.ma(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        this.coroutineBoundary = maVar3;
        long nativeValue = com.sun.jna.Pointer.nativeValue(this.toString);
        int i4 = (getHighSpeedVideoFpsRanges + 97) % 128;
        getHighSpeedVideoFpsRangesFor = i4;
        getHighSpeedVideoFpsRanges = (i4 + 111) % 128;
        maVar3.setPointer(0L, new com.sun.jna.Pointer(nativeValue + 74));
        util.h.xy.ai.mq.ma maVar4 = this.accessartificialFrame;
        if (maVar4 != null) {
            try {
                maVar4.dispose();
            } finally {
                this.accessartificialFrame = null;
            }
        }
        long nativeValue2 = com.sun.jna.Pointer.nativeValue(this.coroutineBoundary);
        util.h.xy.ai.mq.ma maVar5 = new util.h.xy.ai.mq.ma(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        maVar5.setLong(0L, nativeValue2 ^ 648899891);
        int i5 = (getHighSpeedVideoFpsRangesFor + 49) % 128;
        getHighSpeedVideoFpsRanges = i5;
        this.accessartificialFrame = maVar5;
        int i6 = i5 + 77;
        getHighSpeedVideoFpsRangesFor = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m24789(com.sun.jna.Pointer pointer) {
        util.h.xy.ai.mq.ma maVar;
        long j;
        int i = getHighSpeedVideoFpsRangesFor + 121;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 != 0) {
            m24785(com.sun.jna.Native.POINTER_SIZE);
            maVar = this.coroutineBoundary;
            j = 1;
        } else {
            m24785(com.sun.jna.Native.POINTER_SIZE);
            maVar = this.coroutineBoundary;
            j = 0;
        }
        maVar.setPointer(j, pointer);
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 33) % 128;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    protected final void m24787() {
        int i = getHighSpeedVideoFpsRanges + 47;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 != 0) {
            util.h.xy.ai.mq.ma maVar = this.unwrapAs;
            if (maVar != null) {
                try {
                    maVar.dispose();
                } finally {
                    this.unwrapAs = null;
                }
            }
            util.h.xy.ai.mq.ma maVar2 = this.getOutputMinFrameDurationlomOqCM;
            if (maVar2 != null) {
                try {
                    maVar2.dispose();
                    this.getOutputMinFrameDurationlomOqCM = null;
                    getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 95) % 128;
                    return;
                } catch (java.lang.Throwable th) {
                    this.getOutputMinFrameDurationlomOqCM = null;
                    throw th;
                }
            }
            return;
        }
        throw null;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m24781(int i) {
        int i2 = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoFpsRanges = (i2 + 121) % 128;
        util.h.xy.ai.mq.ma maVar = this.unwrapAs;
        if (maVar != null) {
            getHighSpeedVideoFpsRanges = (i2 + 85) % 128;
            try {
                maVar.dispose();
            } finally {
                this.unwrapAs = null;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE);
        int i3 = getHighSpeedVideoFpsRanges;
        getHighSpeedVideoFpsRangesFor = (i3 + 53) % 128;
        getHighSpeedVideoFpsRangesFor = (i3 + 97) % 128;
        util.h.xy.ai.mq.ma maVar2 = new util.h.xy.ai.mq.ma(nativeSize + 101);
        this.unwrapAs = maVar2;
        int i4 = getHighSpeedVideoFpsRanges;
        getHighSpeedVideoFpsRangesFor = (i4 + 71) % 128;
        getHighSpeedVideoFpsRangesFor = (i4 + 41) % 128;
        maVar2.setInt(82L, i);
        util.h.xy.ai.mq.ma maVar3 = this.getOutputMinFrameDurationlomOqCM;
        if (maVar3 != null) {
            try {
                maVar3.dispose();
            } finally {
                this.getOutputMinFrameDurationlomOqCM = null;
            }
        }
        long nativeValue = com.sun.jna.Pointer.nativeValue(this.unwrapAs);
        int i5 = getHighSpeedVideoFpsRanges;
        getHighSpeedVideoFpsRangesFor = (i5 + 71) % 128;
        getHighSpeedVideoFpsRangesFor = (i5 + 41) % 128;
        util.h.xy.ai.mq.ma maVar4 = new util.h.xy.ai.mq.ma(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        maVar4.setLong(0L, (nativeValue + 82) ^ 1669987641);
        int i6 = getHighSpeedVideoFpsRanges + 11;
        getHighSpeedVideoFpsRangesFor = i6 % 128;
        if (i6 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        this.getOutputMinFrameDurationlomOqCM = maVar4;
    }

    private static int getHighSpeedVideoFpsRangesFor() {
        int i = getHighSpeedVideoFpsRanges + 51;
        int i2 = i % 128;
        getHighSpeedVideoFpsRangesFor = i2;
        int i3 = i % 2 == 0 ? 90 : 104;
        getHighSpeedVideoFpsRanges = (i2 + 105) % 128;
        return i3;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    protected final void m24786() {
        int i = getHighSpeedVideoFpsRanges + 63;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        util.h.xy.ai.mq.ma maVar = this.getInputSizeshNQ4ISI;
        if (maVar != null) {
            try {
                maVar.dispose();
            } finally {
                this.getInputSizeshNQ4ISI = null;
            }
        }
        util.h.xy.ai.mq.ma maVar2 = this.getARTIFICIAL_FRAME_PACKAGE_NAME;
        if (maVar2 != null) {
            int i2 = getHighSpeedVideoFpsRangesFor + 103;
            getHighSpeedVideoFpsRanges = i2 % 128;
            try {
                if (i2 % 2 != 0) {
                    maVar2.dispose();
                    throw null;
                }
                maVar2.dispose();
            } finally {
                this.getARTIFICIAL_FRAME_PACKAGE_NAME = null;
            }
        }
        util.h.xy.ai.mq.ma maVar3 = this.getOutputStallDuration;
        if (maVar3 != null) {
            try {
                maVar3.dispose();
            } finally {
                this.getOutputStallDuration = null;
            }
        }
    }

    private util.h.xy.ai.mq.ma getHighSpeedVideoFpsRangesFor(long j) {
        util.h.xy.ai.mq.ma maVar = new util.h.xy.ai.mq.ma(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        byte[] bArr = new byte[com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)];
        int i = 0;
        int i2 = 0;
        while (i2 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)) {
            int i3 = getHighSpeedVideoFpsRanges;
            int i4 = i3 + 93;
            getHighSpeedVideoFpsRangesFor = i4 % 128;
            if (i4 % 2 == 0) {
                bArr[i2] = (byte) ((j - (255 << (i2 + 48))) >> (i2 << 61));
                i2 += 63;
            } else {
                int i5 = i2 * 8;
                bArr[i2] = (byte) (((255 << i5) & j) >> i5);
                i2++;
            }
            getHighSpeedVideoFpsRangesFor = (i3 + 85) % 128;
        }
        int i6 = 543591744;
        for (int i7 = 0; i7 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i7++) {
            byte b = bArr[i7];
            bArr[i7] = (byte) (((byte) (i6 & 255)) ^ b);
            i6 = ((i6 << (i7 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))) | (i6 >>> (((com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8) - 1) - (i7 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))))) * (~(b & 255));
        }
        long j2 = 0;
        while (i < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)) {
            j2 |= (bArr[i] & 255) << (i * 8);
            i++;
            int i8 = getHighSpeedVideoFpsRangesFor + 55;
            getHighSpeedVideoFpsRanges = i8 % 128;
            int i9 = i8 % 2;
        }
        maVar.setLong(0L, j2);
        return maVar;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m24788(int i) {
        int i2 = getHighSpeedVideoFpsRangesFor + 35;
        int i3 = i2 % 128;
        getHighSpeedVideoFpsRanges = i3;
        if (i2 % 2 != 0) {
            this.coroutineCreation = i;
            throw new java.lang.ArithmeticException();
        }
        this.coroutineCreation = i;
        util.h.xy.ai.mq.ma maVar = this.getInputSizeshNQ4ISI;
        if (maVar != null) {
            getHighSpeedVideoFpsRangesFor = (i3 + 121) % 128;
            try {
                maVar.dispose();
            } finally {
                this.getInputSizeshNQ4ISI = null;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE) * i;
        int i4 = getHighSpeedVideoFpsRanges + 61;
        getHighSpeedVideoFpsRangesFor = i4 % 128;
        this.getInputSizeshNQ4ISI = new util.h.xy.ai.mq.ma(nativeSize + (i4 % 2 == 0 ? com.google.firebase.FirebaseError.ERROR_INVALID_API_KEY : 145));
        util.h.xy.ai.mq.ma maVar2 = this.getARTIFICIAL_FRAME_PACKAGE_NAME;
        if (maVar2 != null) {
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 79) % 128;
            try {
                maVar2.dispose();
            } finally {
                this.getARTIFICIAL_FRAME_PACKAGE_NAME = null;
            }
        }
        util.h.xy.ai.mq.ma maVar3 = new util.h.xy.ai.mq.ma(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        this.getARTIFICIAL_FRAME_PACKAGE_NAME = maVar3;
        maVar3.setPointer(0L, new com.sun.jna.Pointer(com.sun.jna.Pointer.nativeValue(this.getInputSizeshNQ4ISI) + getHighSpeedVideoFpsRangesFor()));
        util.h.xy.ai.mq.ma maVar4 = this.getOutputStallDuration;
        if (maVar4 != null) {
            try {
                maVar4.dispose();
            } finally {
                this.getOutputStallDuration = null;
            }
        }
        this.getOutputStallDuration = getHighSpeedVideoFpsRangesFor(com.sun.jna.Pointer.nativeValue(this.getARTIFICIAL_FRAME_PACKAGE_NAME));
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 7) % 128;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m24792(java.lang.String str) throws java.io.IOException {
        int i = getHighSpeedVideoFpsRangesFor + 3;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 == 0) {
            m24783(str, java.nio.charset.Charset.defaultCharset());
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 107) % 128;
        } else {
            m24783(str, java.nio.charset.Charset.defaultCharset());
            throw null;
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    protected final void m24783(java.lang.String str, java.nio.charset.Charset charset) throws java.io.IOException {
        int i = getHighSpeedVideoFpsRangesFor + 17;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 != 0) {
            byte[] bytes = str.getBytes(charset);
            int length = bytes.length;
            m24788(0);
            this.getInputSizeshNQ4ISI.write(getHighSpeedVideoFpsRangesFor(), bytes, 1, bytes.length);
            this.getInputSizeshNQ4ISI.setByte(bytes.length % getHighSpeedVideoFpsRangesFor(), (byte) 1);
        } else {
            byte[] bytes2 = str.getBytes(charset);
            m24788(bytes2.length + 1);
            this.getInputSizeshNQ4ISI.write(getHighSpeedVideoFpsRangesFor(), bytes2, 0, bytes2.length);
            this.getInputSizeshNQ4ISI.setByte(bytes2.length + getHighSpeedVideoFpsRangesFor(), (byte) 0);
        }
        int i2 = getHighSpeedVideoFpsRangesFor + 87;
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    protected final void m24780() {
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 75) % 128;
        util.h.xy.ai.mq.ma maVar = this.getOutputSizeshNQ4ISI;
        if (maVar != null) {
            try {
                maVar.dispose();
            } finally {
                this.getOutputSizeshNQ4ISI = null;
            }
        }
        util.h.xy.ai.mq.ma maVar2 = this.getOutputStallDurationlomOqCM;
        if (maVar2 != null) {
            int i = getHighSpeedVideoFpsRanges + 35;
            getHighSpeedVideoFpsRangesFor = i % 128;
            try {
                if (i % 2 == 0) {
                    maVar2.dispose();
                    throw null;
                }
                maVar2.dispose();
            } finally {
                this.getOutputStallDurationlomOqCM = null;
            }
        }
        util.h.xy.ai.mq.ma maVar3 = this.isOutputSupportedForhNQ4ISI;
        if (maVar3 != null) {
            int i2 = getHighSpeedVideoFpsRangesFor + 43;
            getHighSpeedVideoFpsRanges = i2 % 128;
            try {
                if (i2 % 2 != 0) {
                    maVar3.dispose();
                    throw null;
                }
                maVar3.dispose();
            } finally {
                this.isOutputSupportedForhNQ4ISI = null;
            }
        }
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 57) % 128;
    }

    private util.h.xy.ai.mq.ma getHighResolutionOutputSizeshNQ4ISI(long j) {
        util.h.xy.ai.mq.ma maVar = new util.h.xy.ai.mq.ma(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        byte[] bArr = new byte[com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)];
        int i = 0;
        while (i < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)) {
            int i2 = i * 8;
            bArr[i] = (byte) (((255 << i2) & j) >> i2);
            i++;
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 47) % 128;
        }
        int i3 = 587801964;
        for (int i4 = 0; i4 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i4++) {
            byte b = bArr[i4];
            bArr[i4] = (byte) (((byte) (i3 & 255)) ^ b);
            i3 = ((i3 << (i4 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))) | (i3 >>> (((com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8) - 1) - (i4 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))))) * (~(b & 255));
        }
        long j2 = 0;
        for (int i5 = 0; i5 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i5++) {
            j2 |= (bArr[i5] & 255) << (i5 * 8);
        }
        maVar.setLong(0L, j2);
        int i6 = getHighSpeedVideoFpsRanges + 95;
        getHighSpeedVideoFpsRangesFor = i6 % 128;
        if (i6 % 2 != 0) {
            return maVar;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m24791(int i) {
        this.getOutputSizes = i;
        util.h.xy.ai.mq.ma maVar = this.getOutputSizeshNQ4ISI;
        if (maVar != null) {
            int i2 = getHighSpeedVideoFpsRangesFor + 39;
            getHighSpeedVideoFpsRanges = i2 % 128;
            try {
                if (i2 % 2 != 0) {
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
        int i3 = getHighSpeedVideoFpsRangesFor + 83;
        getHighSpeedVideoFpsRanges = i3 % 128;
        this.getOutputSizeshNQ4ISI = new util.h.xy.ai.mq.ma(nativeSize + (i3 % 2 != 0 ? 19 : 93));
        util.h.xy.ai.mq.ma maVar2 = this.getOutputStallDurationlomOqCM;
        if (maVar2 != null) {
            try {
                maVar2.dispose();
            } finally {
                this.getOutputStallDurationlomOqCM = null;
            }
        }
        util.h.xy.ai.mq.ma maVar3 = new util.h.xy.ai.mq.ma(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        this.getOutputStallDurationlomOqCM = maVar3;
        long nativeValue = com.sun.jna.Pointer.nativeValue(this.getOutputSizeshNQ4ISI);
        int i4 = getHighSpeedVideoFpsRanges + 115;
        getHighSpeedVideoFpsRangesFor = i4 % 128;
        maVar3.setPointer(0L, new com.sun.jna.Pointer(nativeValue + (i4 % 2 == 0 ? 61 : 76)));
        util.h.xy.ai.mq.ma maVar4 = this.isOutputSupportedForhNQ4ISI;
        if (maVar4 != null) {
            try {
                maVar4.dispose();
                this.isOutputSupportedForhNQ4ISI = null;
                getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 115) % 128;
            } catch (java.lang.Throwable th) {
                this.isOutputSupportedForhNQ4ISI = null;
                throw th;
            }
        }
        this.isOutputSupportedForhNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(com.sun.jna.Pointer.nativeValue(this.getOutputStallDurationlomOqCM));
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m24782(java.lang.String str) throws java.io.IOException {
        int i = getHighSpeedVideoFpsRangesFor + 109;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 == 0) {
            m24793(str, java.nio.charset.Charset.defaultCharset());
            int i2 = getHighSpeedVideoFpsRangesFor + 49;
            getHighSpeedVideoFpsRanges = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            return;
        }
        m24793(str, java.nio.charset.Charset.defaultCharset());
        throw null;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    protected final void m24793(java.lang.String str, java.nio.charset.Charset charset) throws java.io.IOException {
        int i = getHighSpeedVideoFpsRangesFor + 75;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 != 0) {
            byte[] bytes = str.getBytes(charset);
            m24791(bytes.length - 1);
            util.h.xy.ai.mq.ma maVar = this.getOutputSizeshNQ4ISI;
            int i2 = getHighSpeedVideoFpsRanges + 115;
            getHighSpeedVideoFpsRangesFor = i2 % 128;
            maVar.write(i2 % 2 == 0 ? 61 : 76, bytes, 0, bytes.length);
            util.h.xy.ai.mq.ma maVar2 = this.getOutputSizeshNQ4ISI;
            int length = bytes.length;
            int i3 = getHighSpeedVideoFpsRanges + 115;
            getHighSpeedVideoFpsRangesFor = i3 % 128;
            maVar2.setByte(length >> (i3 % 2 != 0 ? 76 : 61), (byte) 1);
            return;
        }
        byte[] bytes2 = str.getBytes(charset);
        m24791(bytes2.length + 1);
        util.h.xy.ai.mq.ma maVar3 = this.getOutputSizeshNQ4ISI;
        int i4 = getHighSpeedVideoFpsRanges + 115;
        getHighSpeedVideoFpsRangesFor = i4 % 128;
        maVar3.write(i4 % 2 == 0 ? 61 : 76, bytes2, 0, bytes2.length);
        util.h.xy.ai.mq.ma maVar4 = this.getOutputSizeshNQ4ISI;
        int length2 = bytes2.length;
        int i5 = getHighSpeedVideoFpsRanges + 115;
        getHighSpeedVideoFpsRangesFor = i5 % 128;
        maVar4.setByte(length2 + (i5 % 2 != 0 ? 76 : 61), (byte) 0);
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    protected final void m24790() {
        util.h.xy.ai.mq.ma maVar = this.getValidOutputFormatsForInputhNQ4ISI;
        if (maVar != null) {
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 79) % 128;
            try {
                maVar.dispose();
            } finally {
                this.getValidOutputFormatsForInputhNQ4ISI = null;
            }
        }
        util.h.xy.ai.mq.ma maVar2 = this.isOutputSupportedFor;
        if (maVar2 != null) {
            int i = getHighSpeedVideoFpsRanges + 55;
            getHighSpeedVideoFpsRangesFor = i % 128;
            try {
                if (i % 2 == 0) {
                    maVar2.dispose();
                    throw null;
                }
                maVar2.dispose();
            } finally {
                this.isOutputSupportedFor = null;
            }
        }
        util.h.xy.ai.mq.ma maVar3 = this.ArtificialStackFrames;
        if (maVar3 != null) {
            int i2 = getHighSpeedVideoFpsRangesFor + 111;
            getHighSpeedVideoFpsRanges = i2 % 128;
            try {
                if (i2 % 2 == 0) {
                    maVar3.dispose();
                } else {
                    maVar3.dispose();
                    throw null;
                }
            } finally {
                this.ArtificialStackFrames = null;
            }
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public final int m24779() throws java.io.IOException {
        boolean z;
        int i;
        int i2;
        boolean z2;
        int i3 = 0;
        if (this.accessartificialFrame != null) {
            int i4 = getHighSpeedVideoFpsRangesFor + 9;
            getHighSpeedVideoFpsRanges = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            if (this.getOutputMinFrameDurationlomOqCM != null && this.getOutputStallDuration != null && this.isOutputSupportedForhNQ4ISI != null) {
                util.h.xy.ai.mq.ma maVar = this.getValidOutputFormatsForInputhNQ4ISI;
                if (maVar != null) {
                    try {
                        maVar.dispose();
                    } finally {
                        this.getValidOutputFormatsForInputhNQ4ISI = null;
                    }
                }
                int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE);
                int i5 = getHighSpeedVideoFpsRangesFor;
                getHighSpeedVideoFpsRanges = (i5 + 23) % 128;
                getHighSpeedVideoFpsRanges = (i5 + 125) % 128;
                this.getValidOutputFormatsForInputhNQ4ISI = new util.h.xy.ai.mq.ma(nativeSize + 111);
                util.h.xy.ai.mq.ma maVar2 = this.isOutputSupportedFor;
                if (maVar2 != null) {
                    int i6 = getHighSpeedVideoFpsRanges + 51;
                    getHighSpeedVideoFpsRangesFor = i6 % 128;
                    try {
                        if (i6 % 2 == 0) {
                            maVar2.dispose();
                            throw null;
                        }
                        maVar2.dispose();
                        this.isOutputSupportedFor = null;
                        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 31) % 128;
                    } finally {
                        this.isOutputSupportedFor = null;
                    }
                }
                util.h.xy.ai.mq.ma maVar3 = new util.h.xy.ai.mq.ma(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
                this.isOutputSupportedFor = maVar3;
                long nativeValue = com.sun.jna.Pointer.nativeValue(this.getValidOutputFormatsForInputhNQ4ISI);
                int i7 = getHighSpeedVideoFpsRanges + 111;
                getHighSpeedVideoFpsRangesFor = i7 % 128;
                maVar3.setPointer(0L, new com.sun.jna.Pointer(nativeValue + (i7 % 2 == 0 ? 79 : 94)));
                util.h.xy.ai.mq.ma maVar4 = this.ArtificialStackFrames;
                if (maVar4 != null) {
                    int i8 = getHighSpeedVideoFpsRanges + 117;
                    getHighSpeedVideoFpsRangesFor = i8 % 128;
                    try {
                        if (i8 % 2 == 0) {
                            maVar4.dispose();
                            throw null;
                        }
                        maVar4.dispose();
                    } finally {
                        this.ArtificialStackFrames = null;
                    }
                }
                long nativeValue2 = com.sun.jna.Pointer.nativeValue(this.isOutputSupportedFor);
                util.h.xy.ai.mq.ma maVar5 = new util.h.xy.ai.mq.ma(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
                byte[] bArr = new byte[com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)];
                int i9 = 0;
                while (i9 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)) {
                    int i10 = i9 * 8;
                    bArr[i9] = (byte) (((255 << i10) & nativeValue2) >> i10);
                    i9++;
                    getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 121) % 128;
                }
                int i11 = 1775295788;
                for (int i12 = 0; i12 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i12++) {
                    getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 117) % 128;
                    byte b = bArr[i12];
                    bArr[i12] = (byte) (((byte) (i11 & 255)) ^ b);
                    i11 = ((i11 << (i12 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))) | (i11 >>> (((com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8) - 1) - (i12 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))))) * (~(b & 255));
                }
                int i13 = 0;
                long j = 0;
                while (i13 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)) {
                    j |= (bArr[i13] & 255) << (i13 * 8);
                    i13++;
                    getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 75) % 128;
                }
                maVar5.setLong(0L, j);
                int i14 = getHighSpeedVideoFpsRangesFor + 3;
                getHighSpeedVideoFpsRanges = i14 % 128;
                if (i14 % 2 != 0) {
                    throw null;
                }
                this.ArtificialStackFrames = maVar5;
                util.h.xy.ai.rg.getHighSpeedVideoFpsRanges._9siYbfHsXjYsBQHpS7pAt7dN9pwftfR26(this.ArtificialStackFrames, this.accessartificialFrame, this.getOutputMinFrameDurationlomOqCM, this.getOutputStallDuration, this.isOutputSupportedForhNQ4ISI);
                int[] iArr = new int[1];
                util.h.xy.ai.mq.ma maVar6 = this.getValidOutputFormatsForInputhNQ4ISI;
                int i15 = getHighSpeedVideoFpsRanges + 111;
                getHighSpeedVideoFpsRangesFor = i15 % 128;
                maVar6.read(i15 % 2 != 0 ? 94 : 79, iArr, 0, 1);
                return iArr[0];
            }
        }
        int keyCodeFromString = android.view.KeyEvent.keyCodeFromString("");
        short s = (short) ((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 27);
        byte edgeSlop = (byte) (android.view.ViewConfiguration.getEdgeSlop() >> 16);
        int offsetBefore = android.text.TextUtils.getOffsetBefore("", 0);
        java.lang.Object[] objArr = new java.lang.Object[1];
        int i16 = keyCodeFromString - 825643547;
        int tapTimeout = (android.view.ViewConfiguration.getTapTimeout() >> 16) - 111712577;
        util.h.xz.b.me meVar = new util.h.xz.b.me();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i17 = ((-56) - offsetBefore) + ((int) (getOutputMinFrameDuration ^ (-2689713159175858216L)));
        if (i17 == -1) {
            getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 15) % 128;
            z = true;
        } else {
            z = false;
        }
        if (z) {
            getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 69) % 128;
            byte[] bArr2 = getOutputFormats;
            if (bArr2 != null) {
                int length = bArr2.length;
                byte[] bArr3 = new byte[length];
                while (i3 < length) {
                    bArr3[i3] = (byte) (bArr2[i3] ^ (-2689713159175858216L));
                    i3++;
                    bArr2 = bArr2;
                }
                bArr2 = bArr3;
            }
            i17 = bArr2 != null ? (byte) (((byte) (getOutputFormats[((int) (getInputFormats ^ (-2689713159175858216L))) + i16] ^ (-2689713159175858216L))) + ((int) (getOutputMinFrameDuration ^ (-2689713159175858216L)))) : (short) (((short) (getHighSpeedVideoSizesFor[((int) (getInputFormats ^ (-2689713159175858216L))) + i16] ^ (-2689713159175858216L))) + ((int) (getOutputMinFrameDuration ^ (-2689713159175858216L))));
        }
        if (i17 > 0) {
            int i18 = (int) (getInputFormats ^ (-2689713159175858216L));
            if (z) {
                getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 101) % 128;
                i = 1;
            } else {
                i = 0;
            }
            meVar.f2647 = ((i16 + i17) - 2) + i18 + i;
            meVar.f2644 = (char) (tapTimeout + ((int) (getHighSpeedVideoSizes ^ (-2689713159175858216L))));
            sb.append(meVar.f2644);
            meVar.f2646 = meVar.f2644;
            byte[] bArr4 = getOutputFormats;
            if (bArr4 != null) {
                int length2 = bArr4.length;
                byte[] bArr5 = new byte[length2];
                for (int i19 = 0; i19 < length2; i19++) {
                    Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 1) % 128;
                    bArr5[i19] = (byte) (bArr4[i19] ^ (-2689713159175858216L));
                }
                bArr4 = bArr5;
            }
            if (bArr4 != null) {
                Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 89) % 128;
                i2 = 1;
                z2 = true;
            } else {
                i2 = 1;
                z2 = false;
            }
            while (true) {
                meVar.f2645 = i2;
                if (meVar.f2645 >= i17) {
                    break;
                }
                int i20 = Camera2StreamConfigurationMap + 91;
                getHighResolutionOutputSizeshNQ4ISI = i20 % 128;
                if (i20 % 2 == 0) {
                    throw new java.lang.ArithmeticException();
                }
                if (z2) {
                    byte[] bArr6 = getOutputFormats;
                    meVar.f2647 = meVar.f2647 - 1;
                    meVar.f2644 = (char) (meVar.f2646 + (((byte) (((byte) (bArr6[r2] ^ (-2689713159175858216L))) + s)) ^ edgeSlop));
                } else {
                    short[] sArr = getHighSpeedVideoSizesFor;
                    meVar.f2647 = meVar.f2647 - 1;
                    meVar.f2644 = (char) (meVar.f2646 + (((short) (((short) (sArr[r2] ^ (-2689713159175858216L))) + s)) ^ edgeSlop));
                    Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 121) % 128;
                }
                sb.append(meVar.f2644);
                meVar.f2646 = meVar.f2644;
                i2 = meVar.f2645 + 1;
            }
        }
        objArr[0] = sb.toString();
        throw new java.io.IOException(((java.lang.String) objArr[0]).intern());
    }

    /* renamed from: ι, reason: contains not printable characters */
    public final void m24794() {
        int i = getHighSpeedVideoFpsRangesFor + 43;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 == 0) {
            m24784();
            m24787();
            m24786();
            m24780();
            m24790();
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 33) % 128;
            return;
        }
        m24784();
        m24787();
        m24786();
        m24780();
        m24790();
        throw null;
    }
}
