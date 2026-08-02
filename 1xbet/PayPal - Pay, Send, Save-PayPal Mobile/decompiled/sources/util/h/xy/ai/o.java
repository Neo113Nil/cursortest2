package util.h.xy.ai;

/* loaded from: classes18.dex */
public final class o {
    private static char[] Camera2StreamConfigurationMap = {42336, 42463, 42463, 42460, 42453, 42242, 42245, 42279, 42279, 42272, 42273, 42274, 42274, 42461, 42457, 42463, 42457, 42240, 42241, 42274, 42463, 42457, 42460, 42274, 42460, 42242, 42244, 42272, 42462, 42453, 42452, 42459, 42458, 42455, 42452, 42301, 42250, 42277, 42273, 42463, 42241, 42251, 42273, 42463, 42241, 42243, 42275, 42274, 42274, 42272};
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes;
    private int getOutputMinFrameDurationlomOqCM = 0;
    private util.h.xy.ai.o.ma getOutputSizes = null;
    private util.h.xy.ai.o.ma getOutputStallDuration = null;
    private util.h.xy.ai.o.ma getInputFormats = null;
    private int getOutputSizeshNQ4ISI = 0;
    private util.h.xy.ai.o.ma getInputSizeshNQ4ISI = null;
    private util.h.xy.ai.o.ma getOutputFormats = null;
    private util.h.xy.ai.o.ma getOutputMinFrameDuration = null;
    private util.h.xy.ai.o.ma getOutputStallDurationlomOqCM = null;
    private util.h.xy.ai.o.ma isOutputSupportedFor = null;
    private util.h.xy.ai.o.ma getHighSpeedVideoSizesFor = null;

    protected final void finalize() {
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 103) % 128;
        m24804();
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 23) % 128;
    }

    final class ma extends com.sun.jna.Memory {
        private static int Camera2StreamConfigurationMap = 0;
        private static int getHighSpeedVideoFpsRangesFor = 1;

        public ma(long j) {
            super(j);
        }

        @Override // com.sun.jna.Memory
        public final void dispose() {
            int i = Camera2StreamConfigurationMap;
            getHighSpeedVideoFpsRangesFor = ((i & 13) + (i | 13)) % 128;
            super.dispose();
            int i2 = Camera2StreamConfigurationMap;
            int i3 = (i2 & 89) + (i2 | 89);
            getHighSpeedVideoFpsRangesFor = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    protected final void m24801() {
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 7) % 128;
        util.h.xy.ai.o.ma maVar = this.getOutputSizes;
        if (maVar != null) {
            try {
                maVar.dispose();
                this.getOutputSizes = null;
                getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 65) % 128;
            } catch (java.lang.Throwable th) {
                this.getOutputSizes = null;
                throw th;
            }
        }
        util.h.xy.ai.o.ma maVar2 = this.getOutputStallDuration;
        if (maVar2 != null) {
            try {
                maVar2.dispose();
            } finally {
                this.getOutputStallDuration = null;
            }
        }
        util.h.xy.ai.o.ma maVar3 = this.getInputFormats;
        if (maVar3 != null) {
            int i = getHighSpeedVideoSizes + 5;
            getHighSpeedVideoFpsRangesFor = i % 128;
            try {
                if (i % 2 != 0) {
                    maVar3.dispose();
                } else {
                    maVar3.dispose();
                    throw null;
                }
            } finally {
                this.getInputFormats = null;
            }
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m24798(int i) {
        this.getOutputMinFrameDurationlomOqCM = i;
        util.h.xy.ai.o.ma maVar = this.getOutputSizes;
        if (maVar != null) {
            int i2 = getHighSpeedVideoFpsRangesFor + 9;
            getHighSpeedVideoSizes = i2 % 128;
            try {
                if (i2 % 2 == 0) {
                    maVar.dispose();
                } else {
                    maVar.dispose();
                    throw null;
                }
            } finally {
                this.getOutputSizes = null;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE) * i;
        int i3 = (getHighSpeedVideoSizes + 17) % 128;
        getHighSpeedVideoFpsRangesFor = i3;
        int i4 = i3 + 51;
        getHighSpeedVideoSizes = i4 % 128;
        if (i4 % 2 == 0) {
            this.getOutputSizes = new util.h.xy.ai.o.ma(nativeSize + 113);
            util.h.xy.ai.o.ma maVar2 = this.getOutputStallDuration;
            if (maVar2 != null) {
                getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 117) % 128;
                try {
                    maVar2.dispose();
                } finally {
                    this.getOutputStallDuration = null;
                }
            }
            util.h.xy.ai.o.ma maVar3 = new util.h.xy.ai.o.ma(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
            this.getOutputStallDuration = maVar3;
            long nativeValue = com.sun.jna.Pointer.nativeValue(this.getOutputSizes);
            int i5 = getHighSpeedVideoFpsRangesFor + 37;
            getHighSpeedVideoSizes = i5 % 128;
            maVar3.setPointer(0L, new com.sun.jna.Pointer(nativeValue + (i5 % 2 != 0 ? 57 : 74)));
            util.h.xy.ai.o.ma maVar4 = this.getInputFormats;
            if (maVar4 != null) {
                try {
                    maVar4.dispose();
                } finally {
                    this.getInputFormats = null;
                }
            }
            long nativeValue2 = com.sun.jna.Pointer.nativeValue(this.getOutputStallDuration);
            util.h.xy.ai.o.ma maVar5 = new util.h.xy.ai.o.ma(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
            maVar5.setLong(0L, nativeValue2 ^ 1360433681);
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 103) % 128;
            this.getInputFormats = maVar5;
            return;
        }
        throw null;
    }

    private static void Camera2StreamConfigurationMap(int[] iArr, java.lang.String str, java.lang.Object[] objArr) {
        int i = getHighResolutionOutputSizeshNQ4ISI + 99;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
        byte[] bytes = str.getBytes("ISO-8859-1");
        util.h.xz.b.ma maVar = new util.h.xz.b.ma();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = Camera2StreamConfigurationMap;
        if (cArr != null) {
            getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 49) % 128;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i6 = 0; i6 < length; i6++) {
                getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                cArr2[i6] = (char) (cArr[i6] ^ (-8125198844289309347L));
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i3];
        java.lang.System.arraycopy(cArr, i2, cArr3, 0, i3);
        if (bytes != null) {
            char[] cArr4 = new char[i3];
            maVar.f2631 = 0;
            char c = 0;
            while (maVar.f2631 < i3) {
                if (bytes[maVar.f2631] == 1) {
                    cArr4[maVar.f2631] = (char) (((cArr3[maVar.f2631] * 2) + 1) - c);
                } else {
                    cArr4[maVar.f2631] = (char) ((cArr3[maVar.f2631] * 2) - c);
                }
                c = cArr4[maVar.f2631];
                maVar.f2631++;
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            char[] cArr5 = new char[i3];
            java.lang.System.arraycopy(cArr3, 0, cArr5, 0, i3);
            int i7 = i3 - i5;
            java.lang.System.arraycopy(cArr5, 0, cArr3, i7, i5);
            java.lang.System.arraycopy(cArr5, i5, cArr3, 0, i7);
        }
        if (i4 > 0) {
            maVar.f2631 = 0;
            while (maVar.f2631 < i3) {
                int i8 = getHighSpeedVideoFpsRanges + 67;
                getHighResolutionOutputSizeshNQ4ISI = i8 % 128;
                if (i8 % 2 == 0) {
                    cArr3[maVar.f2631] = (char) (cArr3[maVar.f2631] * iArr[3]);
                    int i9 = maVar.f2631;
                    throw new java.lang.ArithmeticException();
                }
                cArr3[maVar.f2631] = (char) (cArr3[maVar.f2631] - iArr[2]);
                maVar.f2631++;
            }
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m24803(com.sun.jna.Pointer pointer) {
        util.h.xy.ai.o.ma maVar;
        long j;
        int i = getHighSpeedVideoSizes + 35;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 == 0) {
            m24798(com.sun.jna.Native.POINTER_SIZE);
            maVar = this.getOutputStallDuration;
            j = 1;
        } else {
            m24798(com.sun.jna.Native.POINTER_SIZE);
            maVar = this.getOutputStallDuration;
            j = 0;
        }
        maVar.setPointer(j, pointer);
        int i2 = getHighSpeedVideoFpsRangesFor + 19;
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    protected final void m24799() {
        util.h.xy.ai.o.ma maVar = this.getInputSizeshNQ4ISI;
        if (maVar != null) {
            try {
                maVar.dispose();
                this.getInputSizeshNQ4ISI = null;
                getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 77) % 128;
            } catch (java.lang.Throwable th) {
                this.getInputSizeshNQ4ISI = null;
                throw th;
            }
        }
        util.h.xy.ai.o.ma maVar2 = this.getOutputFormats;
        if (maVar2 != null) {
            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 15) % 128;
            try {
                maVar2.dispose();
            } finally {
                this.getOutputFormats = null;
            }
        }
        util.h.xy.ai.o.ma maVar3 = this.getOutputMinFrameDuration;
        if (maVar3 != null) {
            try {
                maVar3.dispose();
            } finally {
                this.getOutputMinFrameDuration = null;
            }
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m24802(int i) {
        this.getOutputSizeshNQ4ISI = i;
        util.h.xy.ai.o.ma maVar = this.getInputSizeshNQ4ISI;
        if (maVar != null) {
            try {
                maVar.dispose();
            } finally {
                this.getInputSizeshNQ4ISI = null;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE) * i;
        int i2 = getHighSpeedVideoFpsRangesFor;
        int i3 = i2 + 59;
        getHighSpeedVideoSizes = i3 % 128;
        int i4 = i3 % 2 != 0 ? 118 : 95;
        getHighSpeedVideoSizes = (i2 + 15) % 128;
        this.getInputSizeshNQ4ISI = new util.h.xy.ai.o.ma(nativeSize + i4);
        util.h.xy.ai.o.ma maVar2 = this.getOutputFormats;
        if (maVar2 != null) {
            int i5 = getHighSpeedVideoSizes + 79;
            getHighSpeedVideoFpsRangesFor = i5 % 128;
            try {
                if (i5 % 2 == 0) {
                    maVar2.dispose();
                    this.getOutputFormats = null;
                    throw new java.lang.ArithmeticException();
                }
                maVar2.dispose();
            } finally {
                this.getOutputFormats = null;
            }
        }
        util.h.xy.ai.o.ma maVar3 = new util.h.xy.ai.o.ma(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        this.getOutputFormats = maVar3;
        long nativeValue = com.sun.jna.Pointer.nativeValue(this.getInputSizeshNQ4ISI);
        int i6 = getHighSpeedVideoFpsRangesFor + 69;
        getHighSpeedVideoSizes = i6 % 128;
        maVar3.setPointer(0L, new com.sun.jna.Pointer(nativeValue + (i6 % 2 != 0 ? 3 : 78)));
        util.h.xy.ai.o.ma maVar4 = this.getOutputMinFrameDuration;
        if (maVar4 != null) {
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 19) % 128;
            try {
                maVar4.dispose();
            } finally {
                this.getOutputMinFrameDuration = null;
            }
        }
        long nativeValue2 = com.sun.jna.Pointer.nativeValue(this.getOutputFormats);
        util.h.xy.ai.o.ma maVar5 = new util.h.xy.ai.o.ma(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        maVar5.setLong(0L, nativeValue2 ^ 1688675254);
        int i7 = getHighSpeedVideoFpsRangesFor + 65;
        getHighSpeedVideoSizes = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
        this.getOutputMinFrameDuration = maVar5;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m24796(java.lang.String str) throws java.io.IOException {
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 113) % 128;
        m24800(str, java.nio.charset.Charset.defaultCharset());
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 31) % 128;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    protected final void m24800(java.lang.String str, java.nio.charset.Charset charset) throws java.io.IOException {
        util.h.xy.ai.o.ma maVar;
        int i;
        int i2 = getHighSpeedVideoFpsRangesFor + 3;
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 != 0) {
            byte[] bytes = str.getBytes(charset);
            m24802(bytes.length + 1);
            util.h.xy.ai.o.ma maVar2 = this.getInputSizeshNQ4ISI;
            int i3 = getHighSpeedVideoFpsRangesFor + 69;
            getHighSpeedVideoSizes = i3 % 128;
            int i4 = i3 % 2;
            maVar2.write(0L, bytes, 1, bytes.length);
            maVar = this.getInputSizeshNQ4ISI;
            int length = bytes.length;
            int i5 = getHighSpeedVideoFpsRangesFor + 69;
            getHighSpeedVideoSizes = i5 % 128;
            i = length * (i5 % 2 == 0 ? 78 : 3);
        } else {
            byte[] bytes2 = str.getBytes(charset);
            m24802(bytes2.length + 1);
            util.h.xy.ai.o.ma maVar3 = this.getInputSizeshNQ4ISI;
            int i6 = getHighSpeedVideoFpsRangesFor + 69;
            getHighSpeedVideoSizes = i6 % 128;
            maVar3.write(i6 % 2 != 0 ? 3 : 78, bytes2, 0, bytes2.length);
            maVar = this.getInputSizeshNQ4ISI;
            int length2 = bytes2.length;
            int i7 = getHighSpeedVideoFpsRangesFor + 69;
            getHighSpeedVideoSizes = i7 % 128;
            i = length2 + (i7 % 2 == 0 ? 78 : 3);
        }
        maVar.setByte(i, (byte) 0);
        int i8 = getHighSpeedVideoFpsRangesFor + 119;
        getHighSpeedVideoSizes = i8 % 128;
        if (i8 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    protected final void m24795() {
        util.h.xy.ai.o.ma maVar = this.getOutputStallDurationlomOqCM;
        if (maVar != null) {
            try {
                maVar.dispose();
            } finally {
                this.getOutputStallDurationlomOqCM = null;
            }
        }
        util.h.xy.ai.o.ma maVar2 = this.isOutputSupportedFor;
        if (maVar2 != null) {
            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 99) % 128;
            try {
                maVar2.dispose();
            } finally {
                this.isOutputSupportedFor = null;
            }
        }
        util.h.xy.ai.o.ma maVar3 = this.getHighSpeedVideoSizesFor;
        if (maVar3 != null) {
            try {
                maVar3.dispose();
            } finally {
                this.getHighSpeedVideoSizesFor = null;
            }
        }
        int i = getHighSpeedVideoSizes + 77;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private util.h.xy.ai.o.ma getHighResolutionOutputSizeshNQ4ISI(long j) {
        util.h.xy.ai.o.ma maVar = new util.h.xy.ai.o.ma(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        byte[] bArr = new byte[com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)];
        int i = 0;
        while (i < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)) {
            int i2 = getHighSpeedVideoSizes + 1;
            getHighSpeedVideoFpsRangesFor = i2 % 128;
            if (i2 % 2 == 0) {
                bArr[i] = (byte) ((j / (255 >> (i + 27))) << (i / 18));
                i += 10;
            } else {
                int i3 = i * 8;
                bArr[i] = (byte) (((255 << i3) & j) >> i3);
                i++;
            }
        }
        int i4 = 1063560225;
        int i5 = 0;
        while (i5 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)) {
            byte b = bArr[i5];
            bArr[i5] = (byte) (((byte) (i4 & 255)) ^ b);
            i4 = ((i4 << (i5 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))) | (i4 >>> (((com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8) - 1) - (i5 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))))) * (~(b & 255));
            i5++;
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 21) % 128;
        }
        long j2 = 0;
        for (int i6 = 0; i6 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i6++) {
            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 75) % 128;
            j2 |= (bArr[i6] & 255) << (i6 * 8);
        }
        maVar.setLong(0L, j2);
        return maVar;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final int m24797() throws java.io.IOException {
        int i = getHighSpeedVideoFpsRangesFor + 33;
        int i2 = i % 128;
        getHighSpeedVideoSizes = i2;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        if (this.getInputFormats != null) {
            getHighSpeedVideoFpsRangesFor = (i2 + 9) % 128;
            if (this.getOutputMinFrameDuration != null) {
                int i3 = i2 + 105;
                getHighSpeedVideoFpsRangesFor = i3 % 128;
                if (i3 % 2 == 0) {
                    throw null;
                }
                util.h.xy.ai.o.ma maVar = this.getOutputStallDurationlomOqCM;
                if (maVar != null) {
                    try {
                        maVar.dispose();
                    } finally {
                        this.getOutputStallDurationlomOqCM = null;
                    }
                }
                int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE);
                int i4 = getHighSpeedVideoSizes + 125;
                getHighSpeedVideoFpsRangesFor = i4 % 128;
                this.getOutputStallDurationlomOqCM = new util.h.xy.ai.o.ma(nativeSize + (i4 % 2 == 0 ? 59 : 125));
                util.h.xy.ai.o.ma maVar2 = this.isOutputSupportedFor;
                if (maVar2 != null) {
                    try {
                        maVar2.dispose();
                    } finally {
                        this.isOutputSupportedFor = null;
                    }
                }
                util.h.xy.ai.o.ma maVar3 = new util.h.xy.ai.o.ma(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
                this.isOutputSupportedFor = maVar3;
                long nativeValue = com.sun.jna.Pointer.nativeValue(this.getOutputStallDurationlomOqCM);
                int i5 = getHighSpeedVideoSizes + 121;
                getHighSpeedVideoFpsRangesFor = i5 % 128;
                maVar3.setPointer(0L, new com.sun.jna.Pointer(nativeValue + (i5 % 2 == 0 ? 79 : 96)));
                util.h.xy.ai.o.ma maVar4 = this.getHighSpeedVideoSizesFor;
                if (maVar4 != null) {
                    getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 71) % 128;
                    try {
                        maVar4.dispose();
                    } finally {
                        this.getHighSpeedVideoSizesFor = null;
                    }
                }
                this.getHighSpeedVideoSizesFor = getHighResolutionOutputSizeshNQ4ISI(com.sun.jna.Pointer.nativeValue(this.isOutputSupportedFor));
                util.h.xy.ai.l.getHighSpeedVideoFpsRangesFor._SqrNKXzQoV5wHLXuPvqkRa(this.getHighSpeedVideoSizesFor, this.getInputFormats, this.getOutputMinFrameDuration);
                int[] iArr = new int[1];
                util.h.xy.ai.o.ma maVar5 = this.getOutputStallDurationlomOqCM;
                int i6 = getHighSpeedVideoSizes + 121;
                getHighSpeedVideoFpsRangesFor = i6 % 128;
                maVar5.read(i6 % 2 != 0 ? 96 : 79, iArr, 0, 1);
                return iArr[0];
            }
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        Camera2StreamConfigurationMap(new int[]{0, 50, 22, 31}, "\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000", objArr);
        throw new java.io.IOException(((java.lang.String) objArr[0]).intern());
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m24804() {
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 41) % 128;
        m24801();
        m24799();
        m24795();
        int i = getHighSpeedVideoFpsRangesFor + 93;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }
}
