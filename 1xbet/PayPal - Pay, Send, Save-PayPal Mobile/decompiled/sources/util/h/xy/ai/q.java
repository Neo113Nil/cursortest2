package util.h.xy.ai;

/* loaded from: classes18.dex */
public final class q {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static long getHighSpeedVideoSizes = 5078431093664702677L;
    private int getOutputFormats = 0;
    private util.h.xy.ai.q.ma getHighSpeedVideoSizesFor = null;
    private util.h.xy.ai.q.ma getOutputMinFrameDurationlomOqCM = null;
    private util.h.xy.ai.q.ma getOutputMinFrameDuration = null;
    private util.h.xy.ai.q.ma getOutputStallDuration = null;
    private util.h.xy.ai.q.ma getOutputStallDurationlomOqCM = null;
    private util.h.xy.ai.q.ma getInputSizeshNQ4ISI = null;
    private util.h.xy.ai.q.ma getOutputSizeshNQ4ISI = null;
    private util.h.xy.ai.q.ma getInputFormats = null;

    protected final void finalize() {
        int i = Camera2StreamConfigurationMap + 13;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 == 0) {
            m24809();
            int i2 = Camera2StreamConfigurationMap + 5;
            getHighSpeedVideoFpsRangesFor = i2 % 128;
            if (i2 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
            return;
        }
        m24809();
        throw null;
    }

    final class ma extends com.sun.jna.Memory {
        private static int getHighSpeedVideoFpsRanges = 0;
        private static int getHighSpeedVideoFpsRangesFor = 1;

        public ma(long j) {
            super(j);
        }

        @Override // com.sun.jna.Memory
        public final void dispose() {
            int i = getHighSpeedVideoFpsRanges + 59;
            getHighSpeedVideoFpsRangesFor = i % 128;
            if (i % 2 != 0) {
                super.dispose();
            } else {
                super.dispose();
                throw null;
            }
        }
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] charArray = str.toCharArray();
        util.h.xz.b.d dVar = new util.h.xz.b.d();
        dVar.f2628 = i;
        int length = charArray.length;
        long[] jArr = new long[length];
        dVar.f2629 = 0;
        while (dVar.f2629 < charArray.length) {
            jArr[dVar.f2629] = (charArray[dVar.f2629] ^ (dVar.f2629 * dVar.f2628)) ^ (getHighSpeedVideoSizes ^ (-7508379876853140581L));
            dVar.f2629++;
        }
        char[] cArr = new char[length];
        dVar.f2629 = 0;
        while (dVar.f2629 < charArray.length) {
            cArr[dVar.f2629] = (char) jArr[dVar.f2629];
            dVar.f2629++;
            int i2 = getHighSpeedVideoFpsRanges + 35;
            getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
            int i3 = i2 % 2;
        }
        java.lang.String str2 = new java.lang.String(cArr);
        int i4 = getHighSpeedVideoFpsRanges + 125;
        getHighResolutionOutputSizeshNQ4ISI = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        objArr[0] = str2;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    protected final void m24810() {
        int i = getHighSpeedVideoFpsRangesFor + 71;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        util.h.xy.ai.q.ma maVar = this.getHighSpeedVideoSizesFor;
        if (maVar != null) {
            try {
                maVar.dispose();
                this.getHighSpeedVideoSizesFor = null;
                int i2 = Camera2StreamConfigurationMap + 113;
                getHighSpeedVideoFpsRangesFor = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 2 / 2;
                }
            } catch (java.lang.Throwable th) {
                this.getHighSpeedVideoSizesFor = null;
                throw th;
            }
        }
        util.h.xy.ai.q.ma maVar2 = this.getOutputMinFrameDurationlomOqCM;
        if (maVar2 != null) {
            try {
                maVar2.dispose();
                this.getOutputMinFrameDurationlomOqCM = null;
                Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 75) % 128;
            } catch (java.lang.Throwable th2) {
                this.getOutputMinFrameDurationlomOqCM = null;
                throw th2;
            }
        }
        util.h.xy.ai.q.ma maVar3 = this.getOutputMinFrameDuration;
        if (maVar3 != null) {
            try {
                maVar3.dispose();
                this.getOutputMinFrameDuration = null;
                getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 121) % 128;
            } catch (java.lang.Throwable th3) {
                this.getOutputMinFrameDuration = null;
                throw th3;
            }
        }
    }

    private util.h.xy.ai.q.ma Camera2StreamConfigurationMap(long j) {
        util.h.xy.ai.q.ma maVar = new util.h.xy.ai.q.ma(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        byte[] bArr = new byte[com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)];
        int i = 0;
        for (int i2 = 0; i2 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i2++) {
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 39) % 128;
            int i3 = i2 * 8;
            bArr[i2] = (byte) (((255 << i3) & j) >> i3);
        }
        int i4 = 2025213877;
        for (int i5 = 0; i5 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i5++) {
            getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 5) % 128;
            byte b = bArr[i5];
            bArr[i5] = (byte) (((byte) (i4 & 255)) ^ b);
            i4 = ((i4 << (i5 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))) | (i4 >>> (((com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8) - 1) - (i5 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))))) * (~(b & 255));
        }
        long j2 = 0;
        while (i < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)) {
            int i6 = getHighSpeedVideoFpsRangesFor;
            int i7 = i6 + 71;
            Camera2StreamConfigurationMap = i7 % 128;
            if (i7 % 2 == 0) {
                j2 &= (bArr[i] & 29194) >> (i * 106);
                i += 3;
            } else {
                j2 |= (bArr[i] & 255) << (i * 8);
                i++;
            }
            Camera2StreamConfigurationMap = (i6 + 73) % 128;
        }
        maVar.setLong(0L, j2);
        getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 95) % 128;
        return maVar;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m24808(int i) {
        this.getOutputFormats = i;
        util.h.xy.ai.q.ma maVar = this.getHighSpeedVideoSizesFor;
        if (maVar != null) {
            int i2 = Camera2StreamConfigurationMap + 97;
            getHighSpeedVideoFpsRangesFor = i2 % 128;
            try {
                if (i2 % 2 == 0) {
                    maVar.dispose();
                } else {
                    maVar.dispose();
                    throw null;
                }
            } finally {
                this.getHighSpeedVideoSizesFor = null;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE) * i;
        int i3 = Camera2StreamConfigurationMap + 81;
        getHighSpeedVideoFpsRangesFor = i3 % 128;
        this.getHighSpeedVideoSizesFor = new util.h.xy.ai.q.ma(nativeSize + (i3 % 2 != 0 ? 109 : 107));
        util.h.xy.ai.q.ma maVar2 = this.getOutputMinFrameDurationlomOqCM;
        if (maVar2 != null) {
            try {
                maVar2.dispose();
                this.getOutputMinFrameDurationlomOqCM = null;
                getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 91) % 128;
            } catch (java.lang.Throwable th) {
                this.getOutputMinFrameDurationlomOqCM = null;
                throw th;
            }
        }
        util.h.xy.ai.q.ma maVar3 = new util.h.xy.ai.q.ma(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        this.getOutputMinFrameDurationlomOqCM = maVar3;
        long nativeValue = com.sun.jna.Pointer.nativeValue(this.getHighSpeedVideoSizesFor);
        int i4 = getHighSpeedVideoFpsRangesFor;
        Camera2StreamConfigurationMap = (i4 + 73) % 128;
        Camera2StreamConfigurationMap = (i4 + 59) % 128;
        maVar3.setPointer(0L, new com.sun.jna.Pointer(nativeValue + 84));
        util.h.xy.ai.q.ma maVar4 = this.getOutputMinFrameDuration;
        if (maVar4 != null) {
            try {
                maVar4.dispose();
            } finally {
                this.getOutputMinFrameDuration = null;
            }
        }
        this.getOutputMinFrameDuration = Camera2StreamConfigurationMap(com.sun.jna.Pointer.nativeValue(this.getOutputMinFrameDurationlomOqCM));
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m24806(com.sun.jna.Pointer pointer) {
        util.h.xy.ai.q.ma maVar;
        long j;
        int i = getHighSpeedVideoFpsRangesFor + 75;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 == 0) {
            m24808(com.sun.jna.Native.POINTER_SIZE);
            maVar = this.getOutputMinFrameDurationlomOqCM;
            j = 1;
        } else {
            m24808(com.sun.jna.Native.POINTER_SIZE);
            maVar = this.getOutputMinFrameDurationlomOqCM;
            j = 0;
        }
        maVar.setPointer(j, pointer);
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    protected final void m24807() {
        int i = Camera2StreamConfigurationMap + 55;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 == 0) {
            util.h.xy.ai.q.ma maVar = this.getOutputStallDuration;
            if (maVar != null) {
                try {
                    maVar.dispose();
                } finally {
                    this.getOutputStallDuration = null;
                }
            }
            util.h.xy.ai.q.ma maVar2 = this.getOutputStallDurationlomOqCM;
            if (maVar2 != null) {
                try {
                    maVar2.dispose();
                    this.getOutputStallDurationlomOqCM = null;
                    Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 53) % 128;
                    return;
                } catch (java.lang.Throwable th) {
                    this.getOutputStallDurationlomOqCM = null;
                    throw th;
                }
            }
            return;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m24812(int i) {
        util.h.xy.ai.q.ma maVar = this.getOutputStallDuration;
        if (maVar != null) {
            int i2 = getHighSpeedVideoFpsRangesFor + 101;
            Camera2StreamConfigurationMap = i2 % 128;
            try {
                if (i2 % 2 != 0) {
                    maVar.dispose();
                } else {
                    maVar.dispose();
                    this.getOutputStallDuration = null;
                    throw new java.lang.ArithmeticException();
                }
            } finally {
                this.getOutputStallDuration = null;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE);
        int i3 = getHighSpeedVideoFpsRangesFor + 75;
        int i4 = i3 % 128;
        Camera2StreamConfigurationMap = i4;
        int i5 = i3 % 2 == 0 ? 30964 : 131;
        int i6 = i4 + 17;
        getHighSpeedVideoFpsRangesFor = i6 % 128;
        if (i6 % 2 == 0) {
            util.h.xy.ai.q.ma maVar2 = new util.h.xy.ai.q.ma(nativeSize + i5);
            this.getOutputStallDuration = maVar2;
            int i7 = Camera2StreamConfigurationMap + 77;
            getHighSpeedVideoFpsRangesFor = i7 % 128;
            maVar2.setInt(i7 % 2 != 0 ? 41 : 98, i);
            util.h.xy.ai.q.ma maVar3 = this.getOutputStallDurationlomOqCM;
            if (maVar3 != null) {
                getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 47) % 128;
                try {
                    maVar3.dispose();
                } finally {
                    this.getOutputStallDurationlomOqCM = null;
                }
            }
            long nativeValue = com.sun.jna.Pointer.nativeValue(this.getOutputStallDuration);
            int i8 = Camera2StreamConfigurationMap + 77;
            getHighSpeedVideoFpsRangesFor = i8 % 128;
            long j = nativeValue + (i8 % 2 == 0 ? 98 : 41);
            util.h.xy.ai.q.ma maVar4 = new util.h.xy.ai.q.ma(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
            maVar4.setLong(0L, j ^ 1857776480);
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 11) % 128;
            this.getOutputStallDurationlomOqCM = maVar4;
            return;
        }
        throw null;
    }

    private static int getHighResolutionOutputSizeshNQ4ISI() {
        int i = Camera2StreamConfigurationMap;
        int i2 = i + 11;
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        int i3 = i2 % 2 != 0 ? 62 : 78;
        getHighSpeedVideoFpsRangesFor = (i + 71) % 128;
        return i3;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    protected final void m24811() {
        getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 53) % 128;
        util.h.xy.ai.q.ma maVar = this.getInputSizeshNQ4ISI;
        if (maVar != null) {
            try {
                maVar.dispose();
            } finally {
                this.getInputSizeshNQ4ISI = null;
            }
        }
        util.h.xy.ai.q.ma maVar2 = this.getOutputSizeshNQ4ISI;
        if (maVar2 != null) {
            int i = Camera2StreamConfigurationMap + 31;
            getHighSpeedVideoFpsRangesFor = i % 128;
            try {
                if (i % 2 != 0) {
                    maVar2.dispose();
                    throw null;
                }
                maVar2.dispose();
            } finally {
                this.getOutputSizeshNQ4ISI = null;
            }
        }
        util.h.xy.ai.q.ma maVar3 = this.getInputFormats;
        if (maVar3 != null) {
            try {
                maVar3.dispose();
            } finally {
                this.getInputFormats = null;
            }
        }
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 99) % 128;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final int m24805() throws java.io.IOException {
        if (this.getOutputMinFrameDuration == null || this.getOutputStallDurationlomOqCM == null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("팣裮撗쁅밺᠄\uf5d1凱ඊ\ue913䕽℅點窿횘뉔湬쨊ꟙϤﾞ孒㝲錞䢖ⓧ肉籚\ud86e됎ᇊ췤ꦚՒ\ue16b崿㪚雪犵⹉詮昼쏘뿺᯲\uf759卡༧\ue4cd䃿", 23510 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr);
            throw new java.io.IOException(((java.lang.String) objArr[0]).intern());
        }
        getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 117) % 128;
        util.h.xy.ai.q.ma maVar = this.getInputSizeshNQ4ISI;
        if (maVar != null) {
            try {
                maVar.dispose();
            } finally {
                this.getInputSizeshNQ4ISI = null;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE);
        int i = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRangesFor = (i + 121) % 128;
        getHighSpeedVideoFpsRangesFor = (i + 75) % 128;
        this.getInputSizeshNQ4ISI = new util.h.xy.ai.q.ma(nativeSize + 115);
        util.h.xy.ai.q.ma maVar2 = this.getOutputSizeshNQ4ISI;
        if (maVar2 != null) {
            int i2 = getHighSpeedVideoFpsRangesFor + 41;
            Camera2StreamConfigurationMap = i2 % 128;
            try {
                if (i2 % 2 == 0) {
                    maVar2.dispose();
                    throw null;
                }
                maVar2.dispose();
            } finally {
                this.getOutputSizeshNQ4ISI = null;
            }
        }
        util.h.xy.ai.q.ma maVar3 = new util.h.xy.ai.q.ma(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        this.getOutputSizeshNQ4ISI = maVar3;
        maVar3.setPointer(0L, new com.sun.jna.Pointer(com.sun.jna.Pointer.nativeValue(this.getInputSizeshNQ4ISI) + getHighResolutionOutputSizeshNQ4ISI()));
        util.h.xy.ai.q.ma maVar4 = this.getInputFormats;
        if (maVar4 != null) {
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 65) % 128;
            try {
                maVar4.dispose();
                this.getInputFormats = null;
                getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 59) % 128;
            } catch (java.lang.Throwable th) {
                this.getInputFormats = null;
                throw th;
            }
        }
        long nativeValue = com.sun.jna.Pointer.nativeValue(this.getOutputSizeshNQ4ISI);
        util.h.xy.ai.q.ma maVar5 = new util.h.xy.ai.q.ma(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        maVar5.setLong(0L, nativeValue ^ 1264029568);
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        this.getInputFormats = maVar5;
        util.h.xy.ai.rd.getHighSpeedVideoSizes._L5Yns3ZsrmnyXWG9UW52YjFTrr3c4ti3M(this.getInputFormats, this.getOutputMinFrameDuration, this.getOutputStallDurationlomOqCM);
        int[] iArr = new int[1];
        this.getInputSizeshNQ4ISI.read(getHighResolutionOutputSizeshNQ4ISI(), iArr, 0, 1);
        int i3 = iArr[0];
        int i4 = getHighSpeedVideoFpsRangesFor + 3;
        Camera2StreamConfigurationMap = i4 % 128;
        if (i4 % 2 != 0) {
            return i3;
        }
        throw null;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m24809() {
        getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 67) % 128;
        m24810();
        m24807();
        m24811();
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 103) % 128;
    }
}
