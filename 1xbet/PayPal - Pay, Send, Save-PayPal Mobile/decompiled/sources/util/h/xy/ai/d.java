package util.h.xy.ai;

/* loaded from: classes5.dex */
public final class d {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoFpsRangesFor = -1231763936;
    private static int getHighSpeedVideoSizes;
    private int unwrapAs = 0;
    private util.h.xy.ai.d.a toString = null;
    private util.h.xy.ai.d.a ArtificialStackFrames = null;
    private util.h.xy.ai.d.a getOutputStallDuration = null;
    private util.h.xy.ai.d.a getOutputSizes = null;
    private util.h.xy.ai.d.a getInputFormats = null;
    private util.h.xy.ai.d.a coroutineCreation = null;
    private util.h.xy.ai.d.a getValidOutputFormatsForInputhNQ4ISI = null;
    private int getInputSizeshNQ4ISI = 0;
    private util.h.xy.ai.d.a getHighSpeedVideoSizesFor = null;
    private util.h.xy.ai.d.a getOutputSizeshNQ4ISI = null;
    private util.h.xy.ai.d.a getOutputMinFrameDuration = null;
    private int getOutputStallDurationlomOqCM = 0;
    private util.h.xy.ai.d.a getOutputMinFrameDurationlomOqCM = null;
    private util.h.xy.ai.d.a getOutputFormats = null;
    private util.h.xy.ai.d.a isOutputSupportedFor = null;
    private util.h.xy.ai.d.a isOutputSupportedForhNQ4ISI = null;
    private util.h.xy.ai.d.a coroutineBoundary = null;
    private util.h.xy.ai.d.a accessartificialFrame = null;

    protected final void finalize() {
        int i = Camera2StreamConfigurationMap + 109;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            m24635();
        } else {
            m24635();
            throw null;
        }
    }

    final class a extends com.sun.jna.Memory {
        private static int getHighSpeedVideoFpsRangesFor = 1;
        private static int getHighSpeedVideoSizes;

        public a(long j) {
            super(j);
        }

        @Override // com.sun.jna.Memory
        public final void dispose() {
            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 37) % 128;
            super.dispose();
            int i = getHighSpeedVideoFpsRangesFor + 91;
            getHighSpeedVideoSizes = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    protected final void m24643() {
        getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 67) % 128;
        util.h.xy.ai.d.a aVar = this.toString;
        if (aVar != null) {
            try {
                aVar.dispose();
            } finally {
                this.toString = null;
            }
        }
        util.h.xy.ai.d.a aVar2 = this.ArtificialStackFrames;
        if (aVar2 != null) {
            try {
                aVar2.dispose();
            } finally {
                this.ArtificialStackFrames = null;
            }
        }
        util.h.xy.ai.d.a aVar3 = this.getOutputStallDuration;
        if (aVar3 != null) {
            getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 1) % 128;
            try {
                aVar3.dispose();
            } finally {
                this.getOutputStallDuration = null;
            }
        }
    }

    private static void getHighSpeedVideoSizes(java.lang.String str, int i, int i2, int i3, boolean z, java.lang.Object[] objArr) {
        int i4;
        char[] charArray = str.toCharArray();
        util.h.xz.b.ra raVar = new util.h.xz.b.ra();
        char[] cArr = new char[i];
        raVar.f2649 = 0;
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 33) % 128;
        while (raVar.f2649 < i) {
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 45) % 128;
            raVar.f2650 = charArray[raVar.f2649];
            cArr[raVar.f2649] = (char) (raVar.f2650 + i3);
            int i5 = raVar.f2649;
            cArr[i5] = (char) (cArr[i5] - ((int) (getHighSpeedVideoFpsRangesFor ^ (-4839292868003314026L))));
            raVar.f2649++;
        }
        if (i2 > 0) {
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 49) % 128;
            raVar.f2648 = i2;
            char[] cArr2 = new char[i];
            java.lang.System.arraycopy(cArr, 0, cArr2, 0, i);
            java.lang.System.arraycopy(cArr2, 0, cArr, i - raVar.f2648, raVar.f2648);
            java.lang.System.arraycopy(cArr2, raVar.f2648, cArr, 0, i - raVar.f2648);
        }
        if (z) {
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 125) % 128;
            char[] cArr3 = new char[i];
            raVar.f2649 = 0;
            while (raVar.f2649 < i) {
                int i6 = getHighSpeedVideoFpsRanges + 77;
                getHighSpeedVideoSizes = i6 % 128;
                if (i6 % 2 != 0) {
                    cArr3[raVar.f2649] = cArr[(i / raVar.f2649) + 1];
                    i4 = raVar.f2649;
                } else {
                    cArr3[raVar.f2649] = cArr[(i - raVar.f2649) - 1];
                    i4 = raVar.f2649 + 1;
                }
                raVar.f2649 = i4;
            }
            cArr = cArr3;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    private util.h.xy.ai.d.a Camera2StreamConfigurationMap(long j) {
        util.h.xy.ai.d.a aVar = new util.h.xy.ai.d.a(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        byte[] bArr = new byte[com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)];
        int i = 0;
        for (int i2 = 0; i2 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i2++) {
            int i3 = i2 * 8;
            bArr[i2] = (byte) (((255 << i3) & j) >> i3);
        }
        int i4 = 1297616884;
        for (int i5 = 0; i5 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i5++) {
            Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 125) % 128;
            byte b = bArr[i5];
            bArr[i5] = (byte) (((byte) (i4 & 255)) ^ b);
            i4 = ((i4 << (i5 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))) | (i4 >>> (((com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8) - 1) - (i5 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))))) * (~(b & 255));
        }
        long j2 = 0;
        while (i < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)) {
            int i6 = getHighResolutionOutputSizeshNQ4ISI + 19;
            Camera2StreamConfigurationMap = i6 % 128;
            if (i6 % 2 != 0) {
                j2 -= (bArr[i] & 18450) << (i << 15);
                i += 43;
            } else {
                j2 |= (bArr[i] & 255) << (i * 8);
                i++;
            }
        }
        aVar.setLong(0L, j2);
        return aVar;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m24644(int i) {
        int i2 = getHighResolutionOutputSizeshNQ4ISI + 109;
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 != 0) {
            this.unwrapAs = i;
            throw new java.lang.ArithmeticException();
        }
        this.unwrapAs = i;
        util.h.xy.ai.d.a aVar = this.toString;
        if (aVar != null) {
            try {
                aVar.dispose();
            } finally {
                this.toString = null;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE) * i;
        int i3 = Camera2StreamConfigurationMap;
        getHighResolutionOutputSizeshNQ4ISI = (i3 + 89) % 128;
        getHighResolutionOutputSizeshNQ4ISI = (i3 + 99) % 128;
        this.toString = new util.h.xy.ai.d.a(nativeSize + 121);
        util.h.xy.ai.d.a aVar2 = this.ArtificialStackFrames;
        if (aVar2 != null) {
            Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 47) % 128;
            try {
                aVar2.dispose();
                this.ArtificialStackFrames = null;
                Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 73) % 128;
            } catch (java.lang.Throwable th) {
                this.ArtificialStackFrames = null;
                throw th;
            }
        }
        util.h.xy.ai.d.a aVar3 = new util.h.xy.ai.d.a(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        this.ArtificialStackFrames = aVar3;
        long nativeValue = com.sun.jna.Pointer.nativeValue(this.toString);
        int i4 = (Camera2StreamConfigurationMap + 55) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i4;
        Camera2StreamConfigurationMap = (i4 + 49) % 128;
        aVar3.setPointer(0L, new com.sun.jna.Pointer(nativeValue + 80));
        util.h.xy.ai.d.a aVar4 = this.getOutputStallDuration;
        if (aVar4 != null) {
            Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 77) % 128;
            try {
                aVar4.dispose();
            } finally {
                this.getOutputStallDuration = null;
            }
        }
        this.getOutputStallDuration = Camera2StreamConfigurationMap(com.sun.jna.Pointer.nativeValue(this.ArtificialStackFrames));
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m24638(byte[] bArr) throws java.io.IOException {
        Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 23) % 128;
        m24644(bArr.length);
        util.h.xy.ai.d.a aVar = this.toString;
        int i = (Camera2StreamConfigurationMap + 55) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i;
        Camera2StreamConfigurationMap = (i + 49) % 128;
        aVar.write(80L, bArr, 0, bArr.length);
        int i2 = Camera2StreamConfigurationMap + 43;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private static int getHighSpeedVideoFpsRangesFor() {
        int i = Camera2StreamConfigurationMap;
        int i2 = i + 49;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        int i3 = i2 % 2 == 0 ? 81 : 86;
        getHighResolutionOutputSizeshNQ4ISI = (i + 33) % 128;
        return i3;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    protected final void m24640() {
        getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 43) % 128;
        util.h.xy.ai.d.a aVar = this.getOutputSizes;
        if (aVar != null) {
            try {
                aVar.dispose();
            } finally {
                this.getOutputSizes = null;
            }
        }
        util.h.xy.ai.d.a aVar2 = this.getInputFormats;
        if (aVar2 != null) {
            try {
                aVar2.dispose();
            } finally {
                this.getInputFormats = null;
            }
        }
        int i = getHighResolutionOutputSizeshNQ4ISI + 101;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m24641(int i) {
        int i2 = Camera2StreamConfigurationMap;
        getHighResolutionOutputSizeshNQ4ISI = (i2 + 59) % 128;
        util.h.xy.ai.d.a aVar = this.getOutputSizes;
        if (aVar != null) {
            getHighResolutionOutputSizeshNQ4ISI = (i2 + 55) % 128;
            try {
                aVar.dispose();
            } finally {
                this.getOutputSizes = null;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE);
        int i3 = Camera2StreamConfigurationMap + 21;
        getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
        util.h.xy.ai.d.a aVar2 = new util.h.xy.ai.d.a(nativeSize + (i3 % 2 == 0 ? 106 : 113));
        this.getOutputSizes = aVar2;
        aVar2.setInt(getHighSpeedVideoFpsRangesFor(), i);
        util.h.xy.ai.d.a aVar3 = this.getInputFormats;
        if (aVar3 != null) {
            getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 115) % 128;
            try {
                aVar3.dispose();
            } finally {
                this.getInputFormats = null;
            }
        }
        long nativeValue = com.sun.jna.Pointer.nativeValue(this.getOutputSizes) + getHighSpeedVideoFpsRangesFor();
        util.h.xy.ai.d.a aVar4 = new util.h.xy.ai.d.a(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        aVar4.setLong(0L, nativeValue ^ 673108839);
        getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 37) % 128;
        this.getInputFormats = aVar4;
    }

    private static int getHighSpeedVideoSizes() {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = i + 73;
        Camera2StreamConfigurationMap = i2 % 128;
        int i3 = i2 % 2 != 0 ? 33 : 100;
        Camera2StreamConfigurationMap = (i + 63) % 128;
        return i3;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    protected final void m24645() {
        util.h.xy.ai.d.a aVar = this.coroutineCreation;
        if (aVar != null) {
            getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 121) % 128;
            try {
                aVar.dispose();
            } finally {
                this.coroutineCreation = null;
            }
        }
        util.h.xy.ai.d.a aVar2 = this.getValidOutputFormatsForInputhNQ4ISI;
        if (aVar2 != null) {
            int i = Camera2StreamConfigurationMap + 55;
            getHighResolutionOutputSizeshNQ4ISI = i % 128;
            try {
                if (i % 2 != 0) {
                    aVar2.dispose();
                } else {
                    aVar2.dispose();
                    this.getValidOutputFormatsForInputhNQ4ISI = null;
                    throw new java.lang.ArithmeticException();
                }
            } finally {
                this.getValidOutputFormatsForInputhNQ4ISI = null;
            }
        }
    }

    private util.h.xy.ai.d.a getHighSpeedVideoSizes(long j) {
        util.h.xy.ai.d.a aVar = new util.h.xy.ai.d.a(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        byte[] bArr = new byte[com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)];
        int i = 0;
        for (int i2 = 0; i2 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i2++) {
            getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 125) % 128;
            int i3 = i2 * 8;
            bArr[i2] = (byte) (((255 << i3) & j) >> i3);
        }
        getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 13) % 128;
        int i4 = 1434293148;
        for (int i5 = 0; i5 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i5++) {
            getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 79) % 128;
            byte b = bArr[i5];
            bArr[i5] = (byte) (((byte) (i4 & 255)) ^ b);
            i4 = ((i4 << (i5 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))) | (i4 >>> (((com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8) - 1) - (i5 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))))) * (~(b & 255));
        }
        long j2 = 0;
        while (i < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)) {
            int i6 = Camera2StreamConfigurationMap;
            getHighResolutionOutputSizeshNQ4ISI = (i6 + 67) % 128;
            j2 |= (bArr[i] & 255) << (i * 8);
            i++;
            getHighResolutionOutputSizeshNQ4ISI = (i6 + 93) % 128;
        }
        aVar.setLong(0L, j2);
        return aVar;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m24649(int i) {
        int i2 = Camera2StreamConfigurationMap;
        getHighResolutionOutputSizeshNQ4ISI = (i2 + 23) % 128;
        util.h.xy.ai.d.a aVar = this.coroutineCreation;
        if (aVar != null) {
            int i3 = i2 + 113;
            getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
            try {
                if (i3 % 2 != 0) {
                    aVar.dispose();
                } else {
                    aVar.dispose();
                    this.coroutineCreation = null;
                    throw new java.lang.ArithmeticException();
                }
            } finally {
                this.coroutineCreation = null;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE);
        int i4 = Camera2StreamConfigurationMap;
        getHighResolutionOutputSizeshNQ4ISI = (i4 + 67) % 128;
        getHighResolutionOutputSizeshNQ4ISI = (i4 + 11) % 128;
        util.h.xy.ai.d.a aVar2 = new util.h.xy.ai.d.a(nativeSize + 117);
        this.coroutineCreation = aVar2;
        aVar2.setInt(getHighSpeedVideoSizes(), i);
        util.h.xy.ai.d.a aVar3 = this.getValidOutputFormatsForInputhNQ4ISI;
        if (aVar3 != null) {
            try {
                aVar3.dispose();
            } finally {
                this.getValidOutputFormatsForInputhNQ4ISI = null;
            }
        }
        this.getValidOutputFormatsForInputhNQ4ISI = getHighSpeedVideoSizes(com.sun.jna.Pointer.nativeValue(this.coroutineCreation) + getHighSpeedVideoSizes());
    }

    private static int getHighResolutionOutputSizeshNQ4ISI() {
        int i = (Camera2StreamConfigurationMap + 111) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i;
        int i2 = i + 77;
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 == 0) {
            return 96;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    protected final void m24648() {
        getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 75) % 128;
        util.h.xy.ai.d.a aVar = this.getHighSpeedVideoSizesFor;
        if (aVar != null) {
            try {
                aVar.dispose();
            } finally {
                this.getHighSpeedVideoSizesFor = null;
            }
        }
        util.h.xy.ai.d.a aVar2 = this.getOutputSizeshNQ4ISI;
        if (aVar2 != null) {
            Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 27) % 128;
            try {
                aVar2.dispose();
            } finally {
                this.getOutputSizeshNQ4ISI = null;
            }
        }
        util.h.xy.ai.d.a aVar3 = this.getOutputMinFrameDuration;
        if (aVar3 != null) {
            Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 77) % 128;
            try {
                aVar3.dispose();
            } finally {
                this.getOutputMinFrameDuration = null;
            }
        }
        Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 63) % 128;
    }

    private util.h.xy.ai.d.a getHighSpeedVideoFpsRanges(long j) {
        util.h.xy.ai.d.a aVar = new util.h.xy.ai.d.a(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        byte[] bArr = new byte[com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)];
        int i = 0;
        while (i < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)) {
            int i2 = getHighResolutionOutputSizeshNQ4ISI + 15;
            Camera2StreamConfigurationMap = i2 % 128;
            if (i2 % 2 != 0) {
                bArr[i] = (byte) ((j / (255 << (i - 111))) << (i % 5));
                i += 92;
            } else {
                int i3 = i * 8;
                bArr[i] = (byte) (((255 << i3) & j) >> i3);
                i++;
            }
        }
        Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 33) % 128;
        int i4 = 1433686164;
        for (int i5 = 0; i5 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i5++) {
            getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 15) % 128;
            byte b = bArr[i5];
            bArr[i5] = (byte) (((byte) (i4 & 255)) ^ b);
            i4 = ((i4 << (i5 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))) | (i4 >>> (((com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8) - 1) - (i5 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))))) * (~(b & 255));
        }
        long j2 = 0;
        for (int i6 = 0; i6 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i6++) {
            j2 |= (bArr[i6] & 255) << (i6 * 8);
        }
        aVar.setLong(0L, j2);
        return aVar;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m24637(int i) {
        int i2 = Camera2StreamConfigurationMap + 73;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            this.getInputSizeshNQ4ISI = i;
            util.h.xy.ai.d.a aVar = this.getHighSpeedVideoSizesFor;
            if (aVar != null) {
                try {
                    aVar.dispose();
                } finally {
                    this.getHighSpeedVideoSizesFor = null;
                }
            }
            int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE) * i;
            int i3 = getHighResolutionOutputSizeshNQ4ISI + 15;
            Camera2StreamConfigurationMap = i3 % 128;
            this.getHighSpeedVideoSizesFor = new util.h.xy.ai.d.a(nativeSize + (i3 % 2 != 0 ? 4684 : 149));
            util.h.xy.ai.d.a aVar2 = this.getOutputSizeshNQ4ISI;
            if (aVar2 != null) {
                try {
                    aVar2.dispose();
                } finally {
                    this.getOutputSizeshNQ4ISI = null;
                }
            }
            util.h.xy.ai.d.a aVar3 = new util.h.xy.ai.d.a(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
            this.getOutputSizeshNQ4ISI = aVar3;
            long nativeValue = com.sun.jna.Pointer.nativeValue(this.getHighSpeedVideoSizesFor);
            getHighResolutionOutputSizeshNQ4ISI();
            aVar3.setPointer(0L, new com.sun.jna.Pointer(nativeValue + 96));
            util.h.xy.ai.d.a aVar4 = this.getOutputMinFrameDuration;
            if (aVar4 != null) {
                int i4 = Camera2StreamConfigurationMap + 53;
                getHighResolutionOutputSizeshNQ4ISI = i4 % 128;
                try {
                    if (i4 % 2 != 0) {
                        aVar4.dispose();
                    } else {
                        aVar4.dispose();
                        throw null;
                    }
                } finally {
                    this.getOutputMinFrameDuration = null;
                }
            }
            this.getOutputMinFrameDuration = getHighSpeedVideoFpsRanges(com.sun.jna.Pointer.nativeValue(this.getOutputSizeshNQ4ISI));
            return;
        }
        this.getInputSizeshNQ4ISI = i;
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final byte[] m24639() throws java.io.IOException {
        util.h.xy.ai.d.a aVar = this.getHighSpeedVideoSizesFor;
        if (aVar == null) {
            try {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoSizes("\u0001\u000e\uffef\u0005\u0016\u0001ﾼ\u0002\u0005\u000e\u000f\u0010\t\u0011\u000f\u0010ﾼ\uffff�\b\bﾼ\u000f\u0001\u0010￫\u0011\u0010\f\u0011\u0010\uffde\u0015\u0010\u0001\uffde\u0011\u0002\u0002", (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 38, 13 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 282 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22), false, objArr);
                throw new java.io.IOException(((java.lang.String) objArr[0]).intern());
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        byte[] bArr = new byte[this.getInputSizeshNQ4ISI];
        getHighResolutionOutputSizeshNQ4ISI();
        aVar.read(96L, bArr, 0, this.getInputSizeshNQ4ISI);
        return bArr;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m24650(byte[] bArr) throws java.io.IOException {
        getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 47) % 128;
        m24637(bArr.length);
        util.h.xy.ai.d.a aVar = this.getHighSpeedVideoSizesFor;
        getHighResolutionOutputSizeshNQ4ISI();
        aVar.write(96L, bArr, 0, bArr.length);
        Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 55) % 128;
    }

    /* renamed from: ι, reason: contains not printable characters */
    protected final void m24651() {
        getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 113) % 128;
        util.h.xy.ai.d.a aVar = this.getOutputMinFrameDurationlomOqCM;
        if (aVar != null) {
            try {
                aVar.dispose();
            } finally {
                this.getOutputMinFrameDurationlomOqCM = null;
            }
        }
        util.h.xy.ai.d.a aVar2 = this.getOutputFormats;
        if (aVar2 != null) {
            try {
                aVar2.dispose();
                this.getOutputFormats = null;
                getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 43) % 128;
            } catch (java.lang.Throwable th) {
                this.getOutputFormats = null;
                throw th;
            }
        }
        util.h.xy.ai.d.a aVar3 = this.isOutputSupportedFor;
        if (aVar3 != null) {
            try {
                aVar3.dispose();
            } finally {
                this.isOutputSupportedFor = null;
            }
        }
        int i = getHighResolutionOutputSizeshNQ4ISI + 101;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m24646(int i) {
        getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 115) % 128;
        this.getOutputStallDurationlomOqCM = i;
        util.h.xy.ai.d.a aVar = this.getOutputMinFrameDurationlomOqCM;
        if (aVar != null) {
            try {
                aVar.dispose();
            } finally {
                this.getOutputMinFrameDurationlomOqCM = null;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * i;
        int i2 = getHighResolutionOutputSizeshNQ4ISI + 99;
        Camera2StreamConfigurationMap = i2 % 128;
        this.getOutputMinFrameDurationlomOqCM = new util.h.xy.ai.d.a(nativeSize + (i2 % 2 != 0 ? 118 : 111));
        util.h.xy.ai.d.a aVar2 = this.getOutputFormats;
        if (aVar2 != null) {
            try {
                aVar2.dispose();
            } finally {
                this.getOutputFormats = null;
            }
        }
        util.h.xy.ai.d.a aVar3 = new util.h.xy.ai.d.a(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        this.getOutputFormats = aVar3;
        long nativeValue = com.sun.jna.Pointer.nativeValue(this.getOutputMinFrameDurationlomOqCM);
        int i3 = (getHighResolutionOutputSizeshNQ4ISI + 37) % 128;
        Camera2StreamConfigurationMap = i3;
        getHighResolutionOutputSizeshNQ4ISI = (i3 + 77) % 128;
        aVar3.setPointer(0L, new com.sun.jna.Pointer(nativeValue + 70));
        util.h.xy.ai.d.a aVar4 = this.isOutputSupportedFor;
        if (aVar4 != null) {
            int i4 = getHighResolutionOutputSizeshNQ4ISI + 43;
            Camera2StreamConfigurationMap = i4 % 128;
            try {
                if (i4 % 2 == 0) {
                    aVar4.dispose();
                } else {
                    aVar4.dispose();
                    throw null;
                }
            } finally {
                this.isOutputSupportedFor = null;
            }
        }
        long nativeValue2 = com.sun.jna.Pointer.nativeValue(this.getOutputFormats);
        util.h.xy.ai.d.a aVar5 = new util.h.xy.ai.d.a(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        aVar5.setLong(0L, nativeValue2 ^ 47386826);
        int i5 = Camera2StreamConfigurationMap + 31;
        getHighResolutionOutputSizeshNQ4ISI = i5 % 128;
        if (i5 % 2 != 0) {
            this.isOutputSupportedFor = aVar5;
            return;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ͺ, reason: contains not printable characters */
    public final int[] m24647() throws java.io.IOException {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = i + 37;
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 == 0) {
            util.h.xy.ai.d.a aVar = this.getOutputMinFrameDurationlomOqCM;
            if (aVar == null) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoSizes("\u0010\u0003\n\u0001￨\u0010\u0011\f\u0010\u0011￫\u0010\u0001\u000fﾼ\b\b�\uffffﾼ\u0010\u000f\u0011\t\u0010\u000f\u000e\u0005\u0002ﾼ\u0001\u0016\u0005\uffef\u000e\u0001\u0002\u0002\u0011\uffde\u0010\n￥\u0004", 45 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 24 - android.view.View.MeasureSpec.getMode(0), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_BANK_VALUE, true, objArr);
                throw new java.io.IOException(((java.lang.String) objArr[0]).intern());
            }
            int i3 = this.getOutputStallDurationlomOqCM;
            int[] iArr = new int[i3];
            int i4 = (i + 37) % 128;
            Camera2StreamConfigurationMap = i4;
            getHighResolutionOutputSizeshNQ4ISI = (i4 + 77) % 128;
            aVar.read(70L, iArr, 0, i3);
            int i5 = Camera2StreamConfigurationMap + 11;
            getHighResolutionOutputSizeshNQ4ISI = i5 % 128;
            if (i5 % 2 != 0) {
                return iArr;
            }
            throw null;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m24642(int[] iArr) throws java.io.IOException {
        Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 65) % 128;
        m24646(iArr.length);
        util.h.xy.ai.d.a aVar = this.getOutputMinFrameDurationlomOqCM;
        int i = (getHighResolutionOutputSizeshNQ4ISI + 37) % 128;
        Camera2StreamConfigurationMap = i;
        getHighResolutionOutputSizeshNQ4ISI = (i + 77) % 128;
        aVar.write(70L, iArr, 0, iArr.length);
        getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 95) % 128;
    }

    private static int Camera2StreamConfigurationMap() {
        int i = getHighResolutionOutputSizeshNQ4ISI + 83;
        int i2 = i % 128;
        Camera2StreamConfigurationMap = i2;
        int i3 = i % 2 != 0 ? 76 : 78;
        getHighResolutionOutputSizeshNQ4ISI = (i2 + 63) % 128;
        return i3;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    protected final void m24636() {
        getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 5) % 128;
        util.h.xy.ai.d.a aVar = this.isOutputSupportedForhNQ4ISI;
        if (aVar != null) {
            try {
                aVar.dispose();
                this.isOutputSupportedForhNQ4ISI = null;
                getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 11) % 128;
            } catch (java.lang.Throwable th) {
                this.isOutputSupportedForhNQ4ISI = null;
                throw th;
            }
        }
        util.h.xy.ai.d.a aVar2 = this.coroutineBoundary;
        if (aVar2 != null) {
            try {
                aVar2.dispose();
            } finally {
                this.coroutineBoundary = null;
            }
        }
        util.h.xy.ai.d.a aVar3 = this.accessartificialFrame;
        if (aVar3 != null) {
            int i = Camera2StreamConfigurationMap + 49;
            getHighResolutionOutputSizeshNQ4ISI = i % 128;
            try {
                if (i % 2 != 0) {
                    aVar3.dispose();
                } else {
                    aVar3.dispose();
                    throw null;
                }
            } finally {
                this.accessartificialFrame = null;
            }
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public final int m24634() throws java.io.IOException {
        if (this.getOutputStallDuration != null) {
            int i = (getHighResolutionOutputSizeshNQ4ISI + 25) % 128;
            Camera2StreamConfigurationMap = i;
            if (this.getInputFormats != null) {
                getHighResolutionOutputSizeshNQ4ISI = (i + 63) % 128;
                if (this.getValidOutputFormatsForInputhNQ4ISI != null && this.getOutputMinFrameDuration != null && this.isOutputSupportedFor != null) {
                    util.h.xy.ai.d.a aVar = this.isOutputSupportedForhNQ4ISI;
                    if (aVar != null) {
                        try {
                            aVar.dispose();
                            this.isOutputSupportedForhNQ4ISI = null;
                            int i2 = Camera2StreamConfigurationMap + 39;
                            getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
                            int i3 = i2 % 2;
                        } catch (java.lang.Throwable th) {
                            this.isOutputSupportedForhNQ4ISI = null;
                            throw th;
                        }
                    }
                    int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE);
                    int i4 = Camera2StreamConfigurationMap;
                    getHighResolutionOutputSizeshNQ4ISI = (i4 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                    int i5 = i4 + 47;
                    getHighResolutionOutputSizeshNQ4ISI = i5 % 128;
                    if (i5 % 2 == 0) {
                        throw null;
                    }
                    this.isOutputSupportedForhNQ4ISI = new util.h.xy.ai.d.a(nativeSize + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
                    util.h.xy.ai.d.a aVar2 = this.coroutineBoundary;
                    if (aVar2 != null) {
                        try {
                            aVar2.dispose();
                        } finally {
                            this.coroutineBoundary = null;
                        }
                    }
                    util.h.xy.ai.d.a aVar3 = new util.h.xy.ai.d.a(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
                    this.coroutineBoundary = aVar3;
                    aVar3.setPointer(0L, new com.sun.jna.Pointer(com.sun.jna.Pointer.nativeValue(this.isOutputSupportedForhNQ4ISI) + Camera2StreamConfigurationMap()));
                    util.h.xy.ai.d.a aVar4 = this.accessartificialFrame;
                    if (aVar4 != null) {
                        try {
                            aVar4.dispose();
                        } finally {
                            this.accessartificialFrame = null;
                        }
                    }
                    long nativeValue = com.sun.jna.Pointer.nativeValue(this.coroutineBoundary);
                    util.h.xy.ai.d.a aVar5 = new util.h.xy.ai.d.a(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
                    aVar5.setLong(0L, nativeValue ^ 536432575);
                    int i6 = Camera2StreamConfigurationMap + 107;
                    getHighResolutionOutputSizeshNQ4ISI = i6 % 128;
                    if (i6 % 2 == 0) {
                        throw null;
                    }
                    this.accessartificialFrame = aVar5;
                    util.h.xy.ai.mh.getHighSpeedVideoFpsRanges._GAsBZSW9wcqnjKQm7VncWr(this.accessartificialFrame, this.getOutputStallDuration, this.getInputFormats, this.getValidOutputFormatsForInputhNQ4ISI, this.getOutputMinFrameDuration, this.isOutputSupportedFor);
                    int[] iArr = new int[1];
                    this.isOutputSupportedForhNQ4ISI.read(Camera2StreamConfigurationMap(), iArr, 0, 1);
                    int i7 = iArr[0];
                    Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 85) % 128;
                    return i7;
                }
            }
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoSizes("\u000eﾾ\n\n\uffffﾾ\n\n\uffff\u0001ﾾ\u0012\u0011\u0013\u000b\u0012\u0011\u0010\u0007\u0004ﾾ\u0011\u0002\r\u0006\u0012\u0003\u000bﾾ\f\r\u0007\u0012\uffff\u0010\uffff\n\u0001\u0003\u0002ﾾ\u0011\u0010\u0003\u0012\u0003\u000b\uffff\u0010\uffff", android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 51, (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 15, 280 - android.text.TextUtils.getOffsetBefore("", 0), true, objArr);
        throw new java.io.IOException(((java.lang.String) objArr[0]).intern());
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public final void m24635() {
        getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 67) % 128;
        m24643();
        m24640();
        m24645();
        m24648();
        m24651();
        m24636();
        Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 81) % 128;
    }
}
