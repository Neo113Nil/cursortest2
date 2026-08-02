package util.h.xy.ai;

/* loaded from: classes18.dex */
public final class rp {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getInputSizeshNQ4ISI = 1;
    private static int getOutputMinFrameDuration;
    private static char[] getHighSpeedVideoFpsRangesFor = {64307, 64315, 64313, 64312, 64396, 64329, 64335, 64304, 64316, 64318, 64331, 64328, 64311, 64317, 64306, 64308, 64330};
    private static int getHighSpeedVideoFpsRanges = -1074857044;
    private static boolean getHighSpeedVideoSizes = true;
    private static boolean getOutputFormats = true;
    private int isOutputSupportedForhNQ4ISI = 0;
    private util.h.xy.ai.rp.ra getOutputSizes = null;
    private util.h.xy.ai.rp.ra toString = null;
    private util.h.xy.ai.rp.ra getOutputMinFrameDurationlomOqCM = null;
    private int getOutputStallDuration = 0;
    private util.h.xy.ai.rp.ra getHighSpeedVideoSizesFor = null;
    private util.h.xy.ai.rp.ra isOutputSupportedFor = null;
    private util.h.xy.ai.rp.ra getValidOutputFormatsForInputhNQ4ISI = null;
    private util.h.xy.ai.rp.ra getOutputSizeshNQ4ISI = null;
    private util.h.xy.ai.rp.ra getInputFormats = null;
    private util.h.xy.ai.rp.ra getOutputStallDurationlomOqCM = null;

    protected final void finalize() {
        getInputSizeshNQ4ISI = (getOutputMinFrameDuration + 55) % 128;
        m24938();
        getInputSizeshNQ4ISI = (getOutputMinFrameDuration + 25) % 128;
    }

    final class ra extends com.sun.jna.Memory {
        private static int getHighResolutionOutputSizeshNQ4ISI = 1;
        private static int getHighSpeedVideoFpsRanges;

        public ra(long j) {
            super(j);
        }

        @Override // com.sun.jna.Memory
        public final void dispose() {
            int i = getHighSpeedVideoFpsRanges + 93;
            getHighResolutionOutputSizeshNQ4ISI = i % 128;
            if (i % 2 != 0) {
                super.dispose();
                int i2 = getHighSpeedVideoFpsRanges;
                int i3 = (i2 & 37) + (i2 | 37);
                getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
                if (i3 % 2 == 0) {
                    throw null;
                }
                return;
            }
            super.dispose();
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    protected final void m24944() {
        int i = getOutputMinFrameDuration;
        int i2 = i + 111;
        getInputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            util.h.xy.ai.rp.ra raVar = this.getOutputSizes;
            if (raVar != null) {
                getInputSizeshNQ4ISI = (i + 45) % 128;
                try {
                    raVar.dispose();
                } finally {
                    this.getOutputSizes = null;
                }
            }
            util.h.xy.ai.rp.ra raVar2 = this.toString;
            if (raVar2 != null) {
                try {
                    raVar2.dispose();
                } finally {
                    this.toString = null;
                }
            }
            util.h.xy.ai.rp.ra raVar3 = this.getOutputMinFrameDurationlomOqCM;
            if (raVar3 != null) {
                try {
                    raVar3.dispose();
                    return;
                } finally {
                    this.getOutputMinFrameDurationlomOqCM = null;
                }
            }
            return;
        }
        throw null;
    }

    private static void getHighSpeedVideoFpsRangesFor(int i, java.lang.String str, java.lang.Object[] objArr) {
        int length;
        char[] cArr;
        byte[] bytes = str.getBytes("ISO-8859-1");
        util.h.xz.b.md mdVar = new util.h.xz.b.md();
        char[] cArr2 = getHighSpeedVideoFpsRangesFor;
        if (cArr2 != null) {
            int i2 = Camera2StreamConfigurationMap + 63;
            getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
            if (i2 % 2 == 0) {
                length = cArr2.length;
                cArr = new char[length];
            } else {
                length = cArr2.length;
                cArr = new char[length];
            }
            for (int i3 = 0; i3 < length; i3++) {
                cArr[i3] = (char) (cArr2[i3] ^ (-3299939579226817547L));
            }
            cArr2 = cArr;
        }
        int i4 = (int) ((-3299939579226817547L) ^ getHighSpeedVideoFpsRanges);
        if (!getOutputFormats) {
            if (!getHighSpeedVideoSizes) {
                throw null;
            }
            getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 85) % 128;
            throw null;
        }
        Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 103) % 128;
        mdVar.f2642 = bytes.length;
        char[] cArr3 = new char[mdVar.f2642];
        mdVar.f2643 = 0;
        while (mdVar.f2643 < mdVar.f2642) {
            cArr3[mdVar.f2643] = (char) (cArr2[bytes[(mdVar.f2642 - 1) - mdVar.f2643] + i] - i4);
            mdVar.f2643++;
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m24939(int i) {
        int i2 = (getOutputMinFrameDuration + 61) % 128;
        getInputSizeshNQ4ISI = i2;
        this.isOutputSupportedForhNQ4ISI = i;
        util.h.xy.ai.rp.ra raVar = this.getOutputSizes;
        if (raVar != null) {
            getOutputMinFrameDuration = (i2 + 61) % 128;
            try {
                raVar.dispose();
                this.getOutputSizes = null;
                getInputSizeshNQ4ISI = (getOutputMinFrameDuration + 95) % 128;
            } catch (java.lang.Throwable th) {
                this.getOutputSizes = null;
                throw th;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE) * i;
        int i3 = getOutputMinFrameDuration + 89;
        getInputSizeshNQ4ISI = i3 % 128;
        this.getOutputSizes = new util.h.xy.ai.rp.ra(nativeSize + (i3 % 2 == 0 ? 81 : 107));
        util.h.xy.ai.rp.ra raVar2 = this.toString;
        if (raVar2 != null) {
            getInputSizeshNQ4ISI = (getOutputMinFrameDuration + 15) % 128;
            try {
                raVar2.dispose();
            } finally {
                this.toString = null;
            }
        }
        util.h.xy.ai.rp.ra raVar3 = new util.h.xy.ai.rp.ra(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        this.toString = raVar3;
        long nativeValue = com.sun.jna.Pointer.nativeValue(this.getOutputSizes);
        int i4 = (getOutputMinFrameDuration + 51) % 128;
        getInputSizeshNQ4ISI = i4;
        int i5 = i4 + 61;
        getOutputMinFrameDuration = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
        raVar3.setPointer(0L, new com.sun.jna.Pointer(nativeValue + 80));
        util.h.xy.ai.rp.ra raVar4 = this.getOutputMinFrameDurationlomOqCM;
        if (raVar4 != null) {
            try {
                raVar4.dispose();
            } finally {
                this.getOutputMinFrameDurationlomOqCM = null;
            }
        }
        long nativeValue2 = com.sun.jna.Pointer.nativeValue(this.toString);
        util.h.xy.ai.rp.ra raVar5 = new util.h.xy.ai.rp.ra(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        byte[] bArr = new byte[com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)];
        for (int i6 = 0; i6 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i6++) {
            int i7 = i6 * 8;
            bArr[i6] = (byte) (((255 << i7) & nativeValue2) >> i7);
        }
        getOutputMinFrameDuration = (getInputSizeshNQ4ISI + 101) % 128;
        int i8 = 23277569;
        for (int i9 = 0; i9 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i9++) {
            getInputSizeshNQ4ISI = (getOutputMinFrameDuration + 121) % 128;
            byte b = bArr[i9];
            bArr[i9] = (byte) (((byte) (i8 & 255)) ^ b);
            i8 = ((i8 << (i9 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))) | (i8 >>> (((com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8) - 1) - (i9 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))))) * (~(b & 255));
        }
        long j = 0;
        for (int i10 = 0; i10 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i10++) {
            getOutputMinFrameDuration = (getInputSizeshNQ4ISI + 13) % 128;
            j |= (bArr[i10] & 255) << (i10 * 8);
        }
        raVar5.setLong(0L, j);
        this.getOutputMinFrameDurationlomOqCM = raVar5;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m24947(com.sun.jna.Pointer pointer) {
        getOutputMinFrameDuration = (getInputSizeshNQ4ISI + 21) % 128;
        m24939(com.sun.jna.Native.POINTER_SIZE);
        this.toString.setPointer(0L, pointer);
        int i = getOutputMinFrameDuration + 43;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    protected final void m24943() {
        util.h.xy.ai.rp.ra raVar = this.getHighSpeedVideoSizesFor;
        if (raVar != null) {
            try {
                raVar.dispose();
            } finally {
                this.getHighSpeedVideoSizesFor = null;
            }
        }
        util.h.xy.ai.rp.ra raVar2 = this.isOutputSupportedFor;
        if (raVar2 != null) {
            try {
                raVar2.dispose();
            } finally {
                this.isOutputSupportedFor = null;
            }
        }
        util.h.xy.ai.rp.ra raVar3 = this.getValidOutputFormatsForInputhNQ4ISI;
        if (raVar3 != null) {
            int i = getOutputMinFrameDuration + 87;
            getInputSizeshNQ4ISI = i % 128;
            try {
                if (i % 2 != 0) {
                    raVar3.dispose();
                } else {
                    raVar3.dispose();
                    throw null;
                }
            } finally {
                this.getValidOutputFormatsForInputhNQ4ISI = null;
            }
        }
        int i2 = getOutputMinFrameDuration + 51;
        getInputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    private util.h.xy.ai.rp.ra getHighSpeedVideoFpsRanges(long j) {
        util.h.xy.ai.rp.ra raVar = new util.h.xy.ai.rp.ra(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        byte[] bArr = new byte[com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)];
        for (int i = 0; i < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i++) {
            getInputSizeshNQ4ISI = (getOutputMinFrameDuration + 19) % 128;
            int i2 = i * 8;
            bArr[i] = (byte) (((255 << i2) & j) >> i2);
        }
        int i3 = 98409775;
        for (int i4 = 0; i4 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i4++) {
            byte b = bArr[i4];
            bArr[i4] = (byte) (((byte) (i3 & 255)) ^ b);
            i3 = ((i3 << (i4 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))) | (i3 >>> (((com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8) - 1) - (i4 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))))) * (~(b & 255));
        }
        getOutputMinFrameDuration = (getInputSizeshNQ4ISI + 93) % 128;
        long j2 = 0;
        for (int i5 = 0; i5 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i5++) {
            j2 |= (bArr[i5] & 255) << (i5 * 8);
        }
        raVar.setLong(0L, j2);
        return raVar;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m24941(int i) {
        this.getOutputStallDuration = i;
        util.h.xy.ai.rp.ra raVar = this.getHighSpeedVideoSizesFor;
        if (raVar != null) {
            int i2 = getOutputMinFrameDuration + 111;
            getInputSizeshNQ4ISI = i2 % 128;
            try {
                if (i2 % 2 == 0) {
                    raVar.dispose();
                    this.getHighSpeedVideoSizesFor = null;
                    throw new java.lang.ArithmeticException();
                }
                raVar.dispose();
            } finally {
                this.getHighSpeedVideoSizesFor = null;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE) * i;
        int i3 = getInputSizeshNQ4ISI + 33;
        getOutputMinFrameDuration = i3 % 128;
        this.getHighSpeedVideoSizesFor = new util.h.xy.ai.rp.ra(nativeSize + (i3 % 2 != 0 ? 62 : com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE));
        util.h.xy.ai.rp.ra raVar2 = this.isOutputSupportedFor;
        if (raVar2 != null) {
            getOutputMinFrameDuration = (getInputSizeshNQ4ISI + 33) % 128;
            try {
                raVar2.dispose();
            } finally {
                this.isOutputSupportedFor = null;
            }
        }
        util.h.xy.ai.rp.ra raVar3 = new util.h.xy.ai.rp.ra(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        this.isOutputSupportedFor = raVar3;
        long nativeValue = com.sun.jna.Pointer.nativeValue(this.getHighSpeedVideoSizesFor);
        int i4 = (getInputSizeshNQ4ISI + 33) % 128;
        getOutputMinFrameDuration = i4;
        getInputSizeshNQ4ISI = (i4 + 117) % 128;
        raVar3.setPointer(0L, new com.sun.jna.Pointer(nativeValue + 84));
        util.h.xy.ai.rp.ra raVar4 = this.getValidOutputFormatsForInputhNQ4ISI;
        if (raVar4 != null) {
            int i5 = getOutputMinFrameDuration + 5;
            getInputSizeshNQ4ISI = i5 % 128;
            try {
                if (i5 % 2 == 0) {
                    raVar4.dispose();
                    throw null;
                }
                raVar4.dispose();
            } finally {
                this.getValidOutputFormatsForInputhNQ4ISI = null;
            }
        }
        this.getValidOutputFormatsForInputhNQ4ISI = getHighSpeedVideoFpsRanges(com.sun.jna.Pointer.nativeValue(this.isOutputSupportedFor));
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m24945(java.lang.String str) throws java.io.IOException {
        getOutputMinFrameDuration = (getInputSizeshNQ4ISI + 125) % 128;
        m24942(str, java.nio.charset.Charset.defaultCharset());
        int i = getInputSizeshNQ4ISI + 63;
        getOutputMinFrameDuration = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    protected final void m24942(java.lang.String str, java.nio.charset.Charset charset) throws java.io.IOException {
        int i = getInputSizeshNQ4ISI + 93;
        getOutputMinFrameDuration = i % 128;
        if (i % 2 != 0) {
            int length = str.getBytes(charset).length;
            throw new java.lang.ArithmeticException();
        }
        byte[] bytes = str.getBytes(charset);
        m24941(bytes.length + 1);
        util.h.xy.ai.rp.ra raVar = this.getHighSpeedVideoSizesFor;
        int i2 = (getInputSizeshNQ4ISI + 33) % 128;
        getOutputMinFrameDuration = i2;
        getInputSizeshNQ4ISI = (i2 + 117) % 128;
        raVar.write(84L, bytes, 0, bytes.length);
        util.h.xy.ai.rp.ra raVar2 = this.getHighSpeedVideoSizesFor;
        int length2 = bytes.length;
        int i3 = (getInputSizeshNQ4ISI + 33) % 128;
        getOutputMinFrameDuration = i3;
        getInputSizeshNQ4ISI = (i3 + 117) % 128;
        raVar2.setByte(length2 + 84, (byte) 0);
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    protected final void m24940() {
        util.h.xy.ai.rp.ra raVar = this.getOutputSizeshNQ4ISI;
        if (raVar != null) {
            getInputSizeshNQ4ISI = (getOutputMinFrameDuration + 99) % 128;
            try {
                raVar.dispose();
            } finally {
                this.getOutputSizeshNQ4ISI = null;
            }
        }
        util.h.xy.ai.rp.ra raVar2 = this.getInputFormats;
        if (raVar2 != null) {
            try {
                raVar2.dispose();
                this.getInputFormats = null;
                getInputSizeshNQ4ISI = (getOutputMinFrameDuration + 93) % 128;
            } catch (java.lang.Throwable th) {
                this.getInputFormats = null;
                throw th;
            }
        }
        util.h.xy.ai.rp.ra raVar3 = this.getOutputStallDurationlomOqCM;
        if (raVar3 != null) {
            try {
                raVar3.dispose();
            } finally {
                this.getOutputStallDurationlomOqCM = null;
            }
        }
        int i = getInputSizeshNQ4ISI + 77;
        getOutputMinFrameDuration = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final int m24946() throws java.io.IOException {
        if (this.getOutputMinFrameDurationlomOqCM == null || this.getValidOutputFormatsForInputhNQ4ISI == null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 127, "\u0084\u0083\u008a\u008d\u0091\u0085\u0083\u008c\u008e\u0090\u0084\u008b\u0081\u0085\u008f\u008e\u008d\u0084\u0087\u008a\u0087\u0088\u0086\u008b\u008c\u0085\u0083\u008a\u008b\u0084\u008b\u0081\u0087\u008a\u0087\u0089\u0085\u0088\u0088\u0087\u0085\u0088\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr);
            throw new java.io.IOException(((java.lang.String) objArr[0]).intern());
        }
        util.h.xy.ai.rp.ra raVar = this.getOutputSizeshNQ4ISI;
        if (raVar != null) {
            try {
                raVar.dispose();
            } finally {
                this.getOutputSizeshNQ4ISI = null;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE);
        int i = getInputSizeshNQ4ISI + 29;
        getOutputMinFrameDuration = i % 128;
        this.getOutputSizeshNQ4ISI = new util.h.xy.ai.rp.ra(nativeSize + (i % 2 != 0 ? 12 : 109));
        util.h.xy.ai.rp.ra raVar2 = this.getInputFormats;
        if (raVar2 != null) {
            try {
                raVar2.dispose();
            } finally {
                this.getInputFormats = null;
            }
        }
        util.h.xy.ai.rp.ra raVar3 = new util.h.xy.ai.rp.ra(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        this.getInputFormats = raVar3;
        long nativeValue = com.sun.jna.Pointer.nativeValue(this.getOutputSizeshNQ4ISI);
        int i2 = (getInputSizeshNQ4ISI + 83) % 128;
        getOutputMinFrameDuration = i2;
        getInputSizeshNQ4ISI = (i2 + 125) % 128;
        raVar3.setPointer(0L, new com.sun.jna.Pointer(nativeValue + 82));
        util.h.xy.ai.rp.ra raVar4 = this.getOutputStallDurationlomOqCM;
        if (raVar4 != null) {
            int i3 = getInputSizeshNQ4ISI + 31;
            getOutputMinFrameDuration = i3 % 128;
            try {
                if (i3 % 2 != 0) {
                    raVar4.dispose();
                    throw null;
                }
                raVar4.dispose();
            } finally {
                this.getOutputStallDurationlomOqCM = null;
            }
        }
        long nativeValue2 = com.sun.jna.Pointer.nativeValue(this.getInputFormats);
        util.h.xy.ai.rp.ra raVar5 = new util.h.xy.ai.rp.ra(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        raVar5.setLong(0L, nativeValue2 ^ 2102423084);
        int i4 = getOutputMinFrameDuration + 31;
        getInputSizeshNQ4ISI = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        this.getOutputStallDurationlomOqCM = raVar5;
        util.h.xy.ai.k.getHighSpeedVideoSizes._6ufZmPaXWTRzowJggBajU22MamziJYuUoJUGnmwkNJ2vy6i2W9V1yZv(this.getOutputStallDurationlomOqCM, this.getOutputMinFrameDurationlomOqCM, this.getValidOutputFormatsForInputhNQ4ISI);
        int[] iArr = new int[1];
        util.h.xy.ai.rp.ra raVar6 = this.getOutputSizeshNQ4ISI;
        int i5 = (getInputSizeshNQ4ISI + 83) % 128;
        getOutputMinFrameDuration = i5;
        getInputSizeshNQ4ISI = (i5 + 125) % 128;
        raVar6.read(82L, iArr, 0, 1);
        int i6 = iArr[0];
        int i7 = getOutputMinFrameDuration + 57;
        getInputSizeshNQ4ISI = i7 % 128;
        if (i7 % 2 != 0) {
            return i6;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m24938() {
        int i = getInputSizeshNQ4ISI + 101;
        getOutputMinFrameDuration = i % 128;
        if (i % 2 == 0) {
            m24944();
            m24943();
            m24940();
        } else {
            m24944();
            m24943();
            m24940();
            throw null;
        }
    }
}
