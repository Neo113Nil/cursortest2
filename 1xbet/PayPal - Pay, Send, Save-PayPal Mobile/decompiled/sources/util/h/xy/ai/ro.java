package util.h.xy.ai;

/* loaded from: classes18.dex */
public final class ro {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static long getHighSpeedVideoFpsRanges = 4923361682078853765L;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 1;
    private int getOutputMinFrameDurationlomOqCM = 0;
    private util.h.xy.ai.ro.a getOutputSizeshNQ4ISI = null;
    private util.h.xy.ai.ro.a getOutputFormats = null;
    private util.h.xy.ai.ro.a getOutputStallDuration = null;
    private util.h.xy.ai.ro.a getInputSizeshNQ4ISI = null;
    private util.h.xy.ai.ro.a getOutputMinFrameDuration = null;
    private util.h.xy.ai.ro.a getOutputStallDurationlomOqCM = null;
    private util.h.xy.ai.ro.a getValidOutputFormatsForInputhNQ4ISI = null;
    private util.h.xy.ai.ro.a getInputFormats = null;
    private util.h.xy.ai.ro.a getHighSpeedVideoSizesFor = null;
    private util.h.xy.ai.ro.a getOutputSizes = null;

    protected final void finalize() {
        int i = getHighResolutionOutputSizeshNQ4ISI + 111;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 == 0) {
            m24928();
        } else {
            m24928();
            throw new java.lang.ArithmeticException();
        }
    }

    final class a extends com.sun.jna.Memory {
        private static int Camera2StreamConfigurationMap = 0;
        private static int getHighSpeedVideoSizes = 1;

        public a(long j) {
            super(j);
        }

        @Override // com.sun.jna.Memory
        public final void dispose() {
            int i = Camera2StreamConfigurationMap;
            getHighSpeedVideoSizes = (((i | 75) << 1) - (i ^ 75)) % 128;
            super.dispose();
            int i2 = Camera2StreamConfigurationMap;
            getHighSpeedVideoSizes = ((i2 & 111) + (i2 | 111)) % 128;
        }
    }

    private static void Camera2StreamConfigurationMap(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2 = Camera2StreamConfigurationMap;
        int i3 = i2 + 101;
        getHighSpeedVideoSizes = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        getHighSpeedVideoSizes = (i2 + 121) % 128;
        char[] charArray = str.toCharArray();
        util.h.xz.b.d dVar = new util.h.xz.b.d();
        dVar.f2628 = i;
        int length = charArray.length;
        long[] jArr = new long[length];
        dVar.f2629 = 0;
        Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 95) % 128;
        while (dVar.f2629 < charArray.length) {
            jArr[dVar.f2629] = (charArray[dVar.f2629] ^ (dVar.f2629 * dVar.f2628)) ^ (getHighSpeedVideoFpsRanges ^ (-7508379876853140581L));
            dVar.f2629++;
        }
        char[] cArr = new char[length];
        dVar.f2629 = 0;
        while (dVar.f2629 < charArray.length) {
            getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 31) % 128;
            cArr[dVar.f2629] = (char) jArr[dVar.f2629];
            dVar.f2629++;
            getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 75) % 128;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    protected final void m24931() {
        int i = (getHighSpeedVideoFpsRangesFor + 105) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i;
        util.h.xy.ai.ro.a aVar = this.getOutputSizeshNQ4ISI;
        if (aVar != null) {
            getHighSpeedVideoFpsRangesFor = (i + 91) % 128;
            try {
                aVar.dispose();
            } finally {
                this.getOutputSizeshNQ4ISI = null;
            }
        }
        util.h.xy.ai.ro.a aVar2 = this.getOutputFormats;
        if (aVar2 != null) {
            try {
                aVar2.dispose();
            } finally {
                this.getOutputFormats = null;
            }
        }
        util.h.xy.ai.ro.a aVar3 = this.getOutputStallDuration;
        if (aVar3 != null) {
            getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 73) % 128;
            try {
                aVar3.dispose();
            } finally {
                this.getOutputStallDuration = null;
            }
        }
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 7) % 128;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m24930(int i) {
        int i2 = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRangesFor = (i2 + 101) % 128;
        this.getOutputMinFrameDurationlomOqCM = i;
        util.h.xy.ai.ro.a aVar = this.getOutputSizeshNQ4ISI;
        if (aVar != null) {
            getHighSpeedVideoFpsRangesFor = (i2 + 57) % 128;
            try {
                aVar.dispose();
            } finally {
                this.getOutputSizeshNQ4ISI = null;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE) * i;
        int i3 = getHighResolutionOutputSizeshNQ4ISI;
        int i4 = i3 + 53;
        getHighSpeedVideoFpsRangesFor = i4 % 128;
        int i5 = i4 % 2 != 0 ? 86 : 125;
        getHighSpeedVideoFpsRangesFor = (i3 + 11) % 128;
        this.getOutputSizeshNQ4ISI = new util.h.xy.ai.ro.a(nativeSize + i5);
        util.h.xy.ai.ro.a aVar2 = this.getOutputFormats;
        if (aVar2 != null) {
            int i6 = getHighResolutionOutputSizeshNQ4ISI + 31;
            getHighSpeedVideoFpsRangesFor = i6 % 128;
            try {
                if (i6 % 2 != 0) {
                    aVar2.dispose();
                    throw null;
                }
                aVar2.dispose();
            } finally {
                this.getOutputFormats = null;
            }
        }
        util.h.xy.ai.ro.a aVar3 = new util.h.xy.ai.ro.a(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        this.getOutputFormats = aVar3;
        long nativeValue = com.sun.jna.Pointer.nativeValue(this.getOutputSizeshNQ4ISI);
        int i7 = getHighSpeedVideoFpsRangesFor + 81;
        getHighResolutionOutputSizeshNQ4ISI = i7 % 128;
        aVar3.setPointer(0L, new com.sun.jna.Pointer(nativeValue + (i7 % 2 == 0 ? 44 : 86)));
        util.h.xy.ai.ro.a aVar4 = this.getOutputStallDuration;
        if (aVar4 != null) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 65) % 128;
            try {
                aVar4.dispose();
            } finally {
                this.getOutputStallDuration = null;
            }
        }
        long nativeValue2 = com.sun.jna.Pointer.nativeValue(this.getOutputFormats);
        util.h.xy.ai.ro.a aVar5 = new util.h.xy.ai.ro.a(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        aVar5.setLong(0L, nativeValue2 ^ 1415113691);
        getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 103) % 128;
        this.getOutputStallDuration = aVar5;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m24937(com.sun.jna.Pointer pointer) {
        getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 119) % 128;
        m24930(com.sun.jna.Native.POINTER_SIZE);
        this.getOutputFormats.setPointer(0L, pointer);
    }

    private static int getHighResolutionOutputSizeshNQ4ISI() {
        int i = (getHighResolutionOutputSizeshNQ4ISI + 73) % 128;
        getHighSpeedVideoFpsRangesFor = i;
        int i2 = i + 103;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            return 104;
        }
        throw null;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    protected final void m24929() {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRangesFor = (i + 69) % 128;
        util.h.xy.ai.ro.a aVar = this.getInputSizeshNQ4ISI;
        if (aVar != null) {
            int i2 = i + 95;
            getHighSpeedVideoFpsRangesFor = i2 % 128;
            try {
                if (i2 % 2 != 0) {
                    aVar.dispose();
                    this.getInputSizeshNQ4ISI = null;
                    throw new java.lang.ArithmeticException();
                }
                aVar.dispose();
            } finally {
                this.getInputSizeshNQ4ISI = null;
            }
        }
        util.h.xy.ai.ro.a aVar2 = this.getOutputMinFrameDuration;
        if (aVar2 != null) {
            try {
                aVar2.dispose();
            } finally {
                this.getOutputMinFrameDuration = null;
            }
        }
        int i3 = getHighResolutionOutputSizeshNQ4ISI + 91;
        getHighSpeedVideoFpsRangesFor = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    private util.h.xy.ai.ro.a getHighSpeedVideoFpsRanges(long j) {
        util.h.xy.ai.ro.a aVar = new util.h.xy.ai.ro.a(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        byte[] bArr = new byte[com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)];
        for (int i = 0; i < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i++) {
            getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 13) % 128;
            int i2 = i * 8;
            bArr[i] = (byte) (((255 << i2) & j) >> i2);
        }
        int i3 = 32211390;
        for (int i4 = 0; i4 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i4++) {
            byte b = bArr[i4];
            bArr[i4] = (byte) (((byte) (i3 & 255)) ^ b);
            i3 = ((i3 << (i4 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))) | (i3 >>> (((com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8) - 1) - (i4 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))))) * (~(b & 255));
        }
        int i5 = getHighResolutionOutputSizeshNQ4ISI + 5;
        getHighSpeedVideoFpsRangesFor = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 3 / 3;
        }
        long j2 = 0;
        for (int i7 = 0; i7 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i7++) {
            j2 |= (bArr[i7] & 255) << (i7 * 8);
        }
        aVar.setLong(0L, j2);
        return aVar;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m24932(int i) {
        util.h.xy.ai.ro.a aVar = this.getInputSizeshNQ4ISI;
        if (aVar != null) {
            int i2 = getHighResolutionOutputSizeshNQ4ISI + 99;
            getHighSpeedVideoFpsRangesFor = i2 % 128;
            try {
                if (i2 % 2 == 0) {
                    aVar.dispose();
                } else {
                    aVar.dispose();
                    this.getInputSizeshNQ4ISI = null;
                    throw new java.lang.ArithmeticException();
                }
            } finally {
                this.getInputSizeshNQ4ISI = null;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE);
        int i3 = getHighSpeedVideoFpsRangesFor + 65;
        getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
        util.h.xy.ai.ro.a aVar2 = new util.h.xy.ai.ro.a(nativeSize + (i3 % 2 == 0 ? 51 : 121));
        this.getInputSizeshNQ4ISI = aVar2;
        getHighResolutionOutputSizeshNQ4ISI();
        aVar2.setInt(104L, i);
        util.h.xy.ai.ro.a aVar3 = this.getOutputMinFrameDuration;
        if (aVar3 != null) {
            try {
                aVar3.dispose();
                this.getOutputMinFrameDuration = null;
                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 65) % 128;
            } catch (java.lang.Throwable th) {
                this.getOutputMinFrameDuration = null;
                throw th;
            }
        }
        long nativeValue = com.sun.jna.Pointer.nativeValue(this.getInputSizeshNQ4ISI);
        getHighResolutionOutputSizeshNQ4ISI();
        this.getOutputMinFrameDuration = getHighSpeedVideoFpsRanges(nativeValue + 104);
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    protected final void m24936() {
        util.h.xy.ai.ro.a aVar = this.getOutputStallDurationlomOqCM;
        if (aVar != null) {
            int i = getHighResolutionOutputSizeshNQ4ISI + 49;
            getHighSpeedVideoFpsRangesFor = i % 128;
            try {
                if (i % 2 != 0) {
                    aVar.dispose();
                    throw null;
                }
                aVar.dispose();
            } finally {
                this.getOutputStallDurationlomOqCM = null;
            }
        }
        util.h.xy.ai.ro.a aVar2 = this.getValidOutputFormatsForInputhNQ4ISI;
        if (aVar2 != null) {
            getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 9) % 128;
            try {
                aVar2.dispose();
            } finally {
                this.getValidOutputFormatsForInputhNQ4ISI = null;
            }
        }
        getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 105) % 128;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m24934(int i) {
        util.h.xy.ai.ro.a aVar = this.getOutputStallDurationlomOqCM;
        if (aVar != null) {
            int i2 = getHighSpeedVideoFpsRangesFor + 19;
            getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
            try {
                if (i2 % 2 != 0) {
                    aVar.dispose();
                } else {
                    aVar.dispose();
                    this.getOutputStallDurationlomOqCM = null;
                    throw new java.lang.ArithmeticException();
                }
            } finally {
                this.getOutputStallDurationlomOqCM = null;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE);
        int i3 = getHighSpeedVideoFpsRangesFor;
        getHighResolutionOutputSizeshNQ4ISI = (i3 + 121) % 128;
        int i4 = i3 + 7;
        getHighResolutionOutputSizeshNQ4ISI = i4 % 128;
        if (i4 % 2 != 0) {
            util.h.xy.ai.ro.a aVar2 = new util.h.xy.ai.ro.a(nativeSize + 107);
            this.getOutputStallDurationlomOqCM = aVar2;
            int i5 = getHighResolutionOutputSizeshNQ4ISI + 61;
            getHighSpeedVideoFpsRangesFor = i5 % 128;
            aVar2.setInt(i5 % 2 != 0 ? 97 : 90, i);
            util.h.xy.ai.ro.a aVar3 = this.getValidOutputFormatsForInputhNQ4ISI;
            if (aVar3 != null) {
                try {
                    aVar3.dispose();
                    this.getValidOutputFormatsForInputhNQ4ISI = null;
                    int i6 = getHighSpeedVideoFpsRangesFor + 95;
                    getHighResolutionOutputSizeshNQ4ISI = i6 % 128;
                    int i7 = i6 % 2;
                } catch (java.lang.Throwable th) {
                    this.getValidOutputFormatsForInputhNQ4ISI = null;
                    throw th;
                }
            }
            long nativeValue = com.sun.jna.Pointer.nativeValue(this.getOutputStallDurationlomOqCM);
            int i8 = getHighResolutionOutputSizeshNQ4ISI + 61;
            getHighSpeedVideoFpsRangesFor = i8 % 128;
            long j = nativeValue + (i8 % 2 == 0 ? 90 : 97);
            util.h.xy.ai.ro.a aVar4 = new util.h.xy.ai.ro.a(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
            aVar4.setLong(0L, j ^ 1527215912);
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 25) % 128;
            this.getValidOutputFormatsForInputhNQ4ISI = aVar4;
            return;
        }
        throw null;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    protected final void m24933() {
        util.h.xy.ai.ro.a aVar = this.getInputFormats;
        if (aVar != null) {
            int i = getHighResolutionOutputSizeshNQ4ISI + 73;
            getHighSpeedVideoFpsRangesFor = i % 128;
            try {
                if (i % 2 != 0) {
                    aVar.dispose();
                    throw null;
                }
                aVar.dispose();
            } finally {
                this.getInputFormats = null;
            }
        }
        util.h.xy.ai.ro.a aVar2 = this.getHighSpeedVideoSizesFor;
        if (aVar2 != null) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 91) % 128;
            try {
                aVar2.dispose();
            } finally {
                this.getHighSpeedVideoSizesFor = null;
            }
        }
        util.h.xy.ai.ro.a aVar3 = this.getOutputSizes;
        if (aVar3 != null) {
            int i2 = getHighResolutionOutputSizeshNQ4ISI + 15;
            getHighSpeedVideoFpsRangesFor = i2 % 128;
            try {
                if (i2 % 2 == 0) {
                    aVar3.dispose();
                } else {
                    aVar3.dispose();
                    this.getOutputSizes = null;
                    throw new java.lang.ArithmeticException();
                }
            } finally {
                this.getOutputSizes = null;
            }
        }
    }

    private util.h.xy.ai.ro.a Camera2StreamConfigurationMap(long j) {
        util.h.xy.ai.ro.a aVar = new util.h.xy.ai.ro.a(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        byte[] bArr = new byte[com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)];
        for (int i = 0; i < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i++) {
            int i2 = i * 8;
            bArr[i] = (byte) (((255 << i2) & j) >> i2);
        }
        int i3 = 2067592816;
        for (int i4 = 0; i4 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i4++) {
            getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 73) % 128;
            byte b = bArr[i4];
            bArr[i4] = (byte) (((byte) (i3 & 255)) ^ b);
            i3 = ((i3 << (i4 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))) | (i3 >>> (((com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8) - 1) - (i4 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))))) * (~(b & 255));
        }
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 109) % 128;
        long j2 = 0;
        for (int i5 = 0; i5 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i5++) {
            j2 |= (bArr[i5] & 255) << (i5 * 8);
        }
        aVar.setLong(0L, j2);
        return aVar;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final int m24935() throws java.io.IOException {
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 107) % 128;
        if (this.getOutputStallDuration == null || this.getOutputMinFrameDuration == null || this.getValidOutputFormatsForInputhNQ4ISI == null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            Camera2StreamConfigurationMap("女䕘愋ෳ⧲햂\uf04d鰗룪ꓵ䂁潃ଖ㞩펤ﾂ驜蘜ꋥ亲檖॔㔎퇸ﷶ馁葕ꀜ䳦梸ᒖ㍒\udf0aﯤ\ue7b7莉긒䨬盩ኯ㺎\udd5a襤\ue5fc臺궏䡝琱ჽ㲩", android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 7171, objArr);
            throw new java.io.IOException(((java.lang.String) objArr[0]).intern());
        }
        util.h.xy.ai.ro.a aVar = this.getInputFormats;
        if (aVar != null) {
            try {
                aVar.dispose();
                this.getInputFormats = null;
                getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 77) % 128;
            } catch (java.lang.Throwable th) {
                this.getInputFormats = null;
                throw th;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE);
        int i = getHighSpeedVideoFpsRangesFor;
        getHighResolutionOutputSizeshNQ4ISI = (i + 107) % 128;
        int i2 = i + 7;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        this.getInputFormats = new util.h.xy.ai.ro.a(nativeSize + 97);
        util.h.xy.ai.ro.a aVar2 = this.getHighSpeedVideoSizesFor;
        if (aVar2 != null) {
            int i3 = getHighSpeedVideoFpsRangesFor + 3;
            getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
            try {
                if (i3 % 2 == 0) {
                    aVar2.dispose();
                    throw null;
                }
                aVar2.dispose();
            } finally {
                this.getHighSpeedVideoSizesFor = null;
            }
        }
        util.h.xy.ai.ro.a aVar3 = new util.h.xy.ai.ro.a(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        this.getHighSpeedVideoSizesFor = aVar3;
        long nativeValue = com.sun.jna.Pointer.nativeValue(this.getInputFormats);
        int i4 = getHighResolutionOutputSizeshNQ4ISI + 61;
        getHighSpeedVideoFpsRangesFor = i4 % 128;
        aVar3.setPointer(0L, new com.sun.jna.Pointer(nativeValue + (i4 % 2 != 0 ? 1 : 74)));
        util.h.xy.ai.ro.a aVar4 = this.getOutputSizes;
        if (aVar4 != null) {
            try {
                aVar4.dispose();
            } finally {
                this.getOutputSizes = null;
            }
        }
        this.getOutputSizes = Camera2StreamConfigurationMap(com.sun.jna.Pointer.nativeValue(this.getHighSpeedVideoSizesFor));
        util.h.xy.ai.mk.getHighSpeedVideoFpsRangesFor._L5Yns3ZsrmnxXQXWLWBCCznmG2r172eoY(this.getOutputSizes, this.getOutputStallDuration, this.getOutputMinFrameDuration, this.getValidOutputFormatsForInputhNQ4ISI);
        int[] iArr = new int[1];
        util.h.xy.ai.ro.a aVar5 = this.getInputFormats;
        int i5 = getHighResolutionOutputSizeshNQ4ISI + 61;
        getHighSpeedVideoFpsRangesFor = i5 % 128;
        aVar5.read(i5 % 2 == 0 ? 74 : 1, iArr, 0, 1);
        return iArr[0];
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public final void m24928() {
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 59) % 128;
        m24931();
        m24929();
        m24936();
        m24933();
        int i = getHighSpeedVideoFpsRangesFor + 89;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }
}
