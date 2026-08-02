package util.h.xy.ai;

/* loaded from: classes18.dex */
public final class rn {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighResolutionOutputSizeshNQ4ISI = 294925130;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static long getHighSpeedVideoFpsRangesFor = 2457411417541981002L;
    private static int getHighSpeedVideoSizes = 0;
    private static char getHighSpeedVideoSizesFor = 45935;
    private static int getOutputFormats;
    private int getOutputMinFrameDuration = 0;
    private util.h.xy.ai.rn.mb getOutputMinFrameDurationlomOqCM = null;
    private util.h.xy.ai.rn.mb getOutputSizes = null;
    private util.h.xy.ai.rn.mb getOutputStallDuration = null;
    private util.h.xy.ai.rn.mb getOutputStallDurationlomOqCM = null;
    private util.h.xy.ai.rn.mb getInputSizeshNQ4ISI = null;
    private util.h.xy.ai.rn.mb isOutputSupportedForhNQ4ISI = null;
    private util.h.xy.ai.rn.mb getInputFormats = null;
    private util.h.xy.ai.rn.mb getOutputSizeshNQ4ISI = null;

    protected final void finalize() {
        int i = Camera2StreamConfigurationMap + 109;
        getOutputFormats = i % 128;
        if (i % 2 == 0) {
            m24925();
        } else {
            m24925();
            throw new java.lang.ArithmeticException();
        }
    }

    final class mb extends com.sun.jna.Memory {
        private static int getHighResolutionOutputSizeshNQ4ISI = 0;
        private static int getHighSpeedVideoFpsRangesFor = 1;

        public mb(long j) {
            super(j);
        }

        @Override // com.sun.jna.Memory
        public final void dispose() {
            int i = getHighSpeedVideoFpsRangesFor;
            getHighResolutionOutputSizeshNQ4ISI = ((i & 23) + (i | 23)) % 128;
            super.dispose();
            int i2 = getHighSpeedVideoFpsRangesFor;
            int i3 = ((i2 | 61) << 1) - (i2 ^ 61);
            getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    protected final void m24920() {
        int i = getOutputFormats + 75;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        util.h.xy.ai.rn.mb mbVar = this.getOutputMinFrameDurationlomOqCM;
        if (mbVar != null) {
            try {
                mbVar.dispose();
            } finally {
                this.getOutputMinFrameDurationlomOqCM = null;
            }
        }
        util.h.xy.ai.rn.mb mbVar2 = this.getOutputSizes;
        if (mbVar2 != null) {
            try {
                mbVar2.dispose();
                this.getOutputSizes = null;
                getOutputFormats = (Camera2StreamConfigurationMap + 29) % 128;
            } catch (java.lang.Throwable th) {
                this.getOutputSizes = null;
                throw th;
            }
        }
        util.h.xy.ai.rn.mb mbVar3 = this.getOutputStallDuration;
        if (mbVar3 != null) {
            int i2 = Camera2StreamConfigurationMap + 31;
            getOutputFormats = i2 % 128;
            try {
                if (i2 % 2 == 0) {
                    mbVar3.dispose();
                } else {
                    mbVar3.dispose();
                    throw null;
                }
            } finally {
                this.getOutputStallDuration = null;
            }
        }
    }

    private static void getHighSpeedVideoFpsRangesFor(java.lang.String str, char c, int i, java.lang.String str2, java.lang.String str3, java.lang.Object[] objArr) {
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 13) % 128;
        char[] charArray = str3.toCharArray();
        char[] charArray2 = str2.toCharArray();
        int i2 = (getHighSpeedVideoFpsRanges + 107) % 128;
        getHighSpeedVideoSizes = i2;
        char[] cArr = charArray2;
        int i3 = i2 + 5;
        getHighSpeedVideoFpsRanges = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        char[] charArray3 = str.toCharArray();
        util.h.xz.b.rc rcVar = new util.h.xz.b.rc();
        int length = cArr.length;
        char[] cArr2 = new char[length];
        int length2 = charArray.length;
        char[] cArr3 = new char[length2];
        java.lang.System.arraycopy(cArr, 0, cArr2, 0, length);
        java.lang.System.arraycopy(charArray, 0, cArr3, 0, length2);
        cArr2[0] = (char) (cArr2[0] ^ c);
        cArr3[2] = (char) (cArr3[2] + ((char) i));
        int length3 = charArray3.length;
        char[] cArr4 = new char[length3];
        rcVar.f2652 = 0;
        while (rcVar.f2652 < length3) {
            int i4 = (rcVar.f2652 + 2) % 4;
            int i5 = (rcVar.f2652 + 3) % 4;
            rcVar.f2653 = (char) (((cArr2[rcVar.f2652 % 4] * 32718) + cArr3[i4]) % 65535);
            cArr3[i5] = (char) (((cArr2[i5] * 32718) + cArr3[i4]) / 65535);
            cArr2[i5] = rcVar.f2653;
            cArr4[rcVar.f2652] = (char) ((((cArr2[i5] ^ charArray3[rcVar.f2652]) ^ (getHighSpeedVideoFpsRangesFor ^ 2457411417541981002L)) ^ ((int) (getHighResolutionOutputSizeshNQ4ISI ^ 2457411417541981002L))) ^ ((char) (getHighSpeedVideoSizesFor ^ 2457411417541981002L)));
            rcVar.f2652++;
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 115) % 128;
        }
        objArr[0] = new java.lang.String(cArr4);
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m24924(int i) {
        getOutputFormats = (Camera2StreamConfigurationMap + 55) % 128;
        this.getOutputMinFrameDuration = i;
        util.h.xy.ai.rn.mb mbVar = this.getOutputMinFrameDurationlomOqCM;
        if (mbVar != null) {
            try {
                mbVar.dispose();
            } finally {
                this.getOutputMinFrameDurationlomOqCM = null;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE) * i;
        int i2 = getOutputFormats;
        Camera2StreamConfigurationMap = (i2 + 61) % 128;
        int i3 = i2 + 117;
        Camera2StreamConfigurationMap = i3 % 128;
        if (i3 % 2 != 0) {
            this.getOutputMinFrameDurationlomOqCM = new util.h.xy.ai.rn.mb(nativeSize + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
            util.h.xy.ai.rn.mb mbVar2 = this.getOutputSizes;
            if (mbVar2 != null) {
                try {
                    mbVar2.dispose();
                } finally {
                    this.getOutputSizes = null;
                }
            }
            util.h.xy.ai.rn.mb mbVar3 = new util.h.xy.ai.rn.mb(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
            this.getOutputSizes = mbVar3;
            long nativeValue = com.sun.jna.Pointer.nativeValue(this.getOutputMinFrameDurationlomOqCM);
            int i4 = getOutputFormats;
            Camera2StreamConfigurationMap = (i4 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
            int i5 = i4 + 51;
            Camera2StreamConfigurationMap = i5 % 128;
            if (i5 % 2 != 0) {
                mbVar3.setPointer(0L, new com.sun.jna.Pointer(nativeValue + 94));
                util.h.xy.ai.rn.mb mbVar4 = this.getOutputStallDuration;
                if (mbVar4 != null) {
                    int i6 = Camera2StreamConfigurationMap + 53;
                    getOutputFormats = i6 % 128;
                    try {
                        if (i6 % 2 == 0) {
                            mbVar4.dispose();
                        } else {
                            mbVar4.dispose();
                            this.getOutputStallDuration = null;
                            throw new java.lang.ArithmeticException();
                        }
                    } finally {
                        this.getOutputStallDuration = null;
                    }
                }
                long nativeValue2 = com.sun.jna.Pointer.nativeValue(this.getOutputSizes);
                util.h.xy.ai.rn.mb mbVar5 = new util.h.xy.ai.rn.mb(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
                mbVar5.setLong(0L, nativeValue2 ^ 208838066);
                Camera2StreamConfigurationMap = (getOutputFormats + 35) % 128;
                this.getOutputStallDuration = mbVar5;
                return;
            }
            throw null;
        }
        throw null;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m24927(com.sun.jna.Pointer pointer) {
        Camera2StreamConfigurationMap = (getOutputFormats + 83) % 128;
        m24924(com.sun.jna.Native.POINTER_SIZE);
        this.getOutputSizes.setPointer(0L, pointer);
        int i = getOutputFormats + 37;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    protected final void m24926() {
        getOutputFormats = (Camera2StreamConfigurationMap + 119) % 128;
        util.h.xy.ai.rn.mb mbVar = this.getOutputStallDurationlomOqCM;
        if (mbVar != null) {
            try {
                mbVar.dispose();
                this.getOutputStallDurationlomOqCM = null;
                getOutputFormats = (Camera2StreamConfigurationMap + 25) % 128;
            } catch (java.lang.Throwable th) {
                this.getOutputStallDurationlomOqCM = null;
                throw th;
            }
        }
        util.h.xy.ai.rn.mb mbVar2 = this.getInputSizeshNQ4ISI;
        if (mbVar2 != null) {
            try {
                mbVar2.dispose();
            } finally {
                this.getInputSizeshNQ4ISI = null;
            }
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m24921(int i) {
        getOutputFormats = (Camera2StreamConfigurationMap + 15) % 128;
        util.h.xy.ai.rn.mb mbVar = this.getOutputStallDurationlomOqCM;
        if (mbVar != null) {
            try {
                mbVar.dispose();
            } finally {
                this.getOutputStallDurationlomOqCM = null;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE);
        int i2 = Camera2StreamConfigurationMap;
        getOutputFormats = (i2 + 59) % 128;
        getOutputFormats = (i2 + 9) % 128;
        util.h.xy.ai.rn.mb mbVar2 = new util.h.xy.ai.rn.mb(nativeSize + 131);
        this.getOutputStallDurationlomOqCM = mbVar2;
        int i3 = getOutputFormats + 69;
        Camera2StreamConfigurationMap = i3 % 128;
        mbVar2.setInt(i3 % 2 == 0 ? 26 : 90, i);
        util.h.xy.ai.rn.mb mbVar3 = this.getInputSizeshNQ4ISI;
        if (mbVar3 != null) {
            int i4 = Camera2StreamConfigurationMap + 55;
            getOutputFormats = i4 % 128;
            try {
                if (i4 % 2 == 0) {
                    mbVar3.dispose();
                } else {
                    mbVar3.dispose();
                    throw null;
                }
            } finally {
                this.getInputSizeshNQ4ISI = null;
            }
        }
        long nativeValue = com.sun.jna.Pointer.nativeValue(this.getOutputStallDurationlomOqCM);
        int i5 = getOutputFormats + 69;
        Camera2StreamConfigurationMap = i5 % 128;
        long j = nativeValue + (i5 % 2 != 0 ? 90 : 26);
        util.h.xy.ai.rn.mb mbVar4 = new util.h.xy.ai.rn.mb(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        mbVar4.setLong(0L, 1482101338 ^ j);
        int i6 = getOutputFormats + 45;
        Camera2StreamConfigurationMap = i6 % 128;
        if (i6 % 2 != 0) {
            this.getInputSizeshNQ4ISI = mbVar4;
            return;
        }
        throw null;
    }

    private static int getHighSpeedVideoFpsRangesFor() {
        int i = getOutputFormats;
        int i2 = i + 113;
        Camera2StreamConfigurationMap = i2 % 128;
        int i3 = i2 % 2 == 0 ? 106 : 98;
        int i4 = i + 3;
        Camera2StreamConfigurationMap = i4 % 128;
        if (i4 % 2 != 0) {
            return i3;
        }
        throw null;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    protected final void m24923() {
        int i = Camera2StreamConfigurationMap + 23;
        getOutputFormats = i % 128;
        if (i % 2 == 0) {
            util.h.xy.ai.rn.mb mbVar = this.isOutputSupportedForhNQ4ISI;
            if (mbVar != null) {
                try {
                    mbVar.dispose();
                } finally {
                    this.isOutputSupportedForhNQ4ISI = null;
                }
            }
            util.h.xy.ai.rn.mb mbVar2 = this.getInputFormats;
            if (mbVar2 != null) {
                try {
                    mbVar2.dispose();
                } finally {
                    this.getInputFormats = null;
                }
            }
            util.h.xy.ai.rn.mb mbVar3 = this.getOutputSizeshNQ4ISI;
            if (mbVar3 != null) {
                getOutputFormats = (Camera2StreamConfigurationMap + 27) % 128;
                try {
                    mbVar3.dispose();
                } finally {
                    this.getOutputSizeshNQ4ISI = null;
                }
            }
            getOutputFormats = (Camera2StreamConfigurationMap + 55) % 128;
            return;
        }
        throw null;
    }

    private util.h.xy.ai.rn.mb getHighSpeedVideoFpsRangesFor(long j) {
        util.h.xy.ai.rn.mb mbVar = new util.h.xy.ai.rn.mb(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        byte[] bArr = new byte[com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)];
        getOutputFormats = (Camera2StreamConfigurationMap + 5) % 128;
        for (int i = 0; i < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i++) {
            int i2 = i * 8;
            bArr[i] = (byte) (((255 << i2) & j) >> i2);
        }
        int i3 = 1338631000;
        for (int i4 = 0; i4 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i4++) {
            byte b = bArr[i4];
            bArr[i4] = (byte) (((byte) (i3 & 255)) ^ b);
            i3 = ((i3 << (i4 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))) | (i3 >>> (((com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8) - 1) - (i4 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))))) * (~(b & 255));
        }
        getOutputFormats = (Camera2StreamConfigurationMap + 27) % 128;
        long j2 = 0;
        for (int i5 = 0; i5 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i5++) {
            j2 |= (bArr[i5] & 255) << (i5 * 8);
        }
        mbVar.setLong(0L, j2);
        return mbVar;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final int m24922() throws java.io.IOException {
        int i = getOutputFormats;
        int i2 = i + 77;
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this.getOutputStallDuration == null || this.getInputSizeshNQ4ISI == null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("⯘ꈴ⸷擾\uf8e5鶅\ud96c矯낸缎걖떖⪘ዮᓾั눏陞뷖\u0e6b腅꽉跋椲⺶\ude9c瘷㽊\u1cff꽂븲극쟾㷥㼯䊊檇⇔뙸蝬ꄿ祿\uea23〈펨ﻩ\udf70ݏ叾㿈", (char) android.view.View.MeasureSpec.getSize(0), android.text.TextUtils.getOffsetAfter("", 0), "迭≟㺓迊", "\u0000\u0000\u0000\u0000", objArr);
            throw new java.io.IOException(((java.lang.String) objArr[0]).intern());
        }
        util.h.xy.ai.rn.mb mbVar = this.isOutputSupportedForhNQ4ISI;
        if (mbVar != null) {
            Camera2StreamConfigurationMap = (i + 29) % 128;
            try {
                mbVar.dispose();
            } finally {
                this.isOutputSupportedForhNQ4ISI = null;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE);
        int i3 = (Camera2StreamConfigurationMap + 67) % 128;
        getOutputFormats = i3;
        int i4 = i3 + 97;
        Camera2StreamConfigurationMap = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        this.isOutputSupportedForhNQ4ISI = new util.h.xy.ai.rn.mb(nativeSize + 147);
        util.h.xy.ai.rn.mb mbVar2 = this.getInputFormats;
        if (mbVar2 != null) {
            int i5 = Camera2StreamConfigurationMap + 15;
            getOutputFormats = i5 % 128;
            try {
                if (i5 % 2 != 0) {
                    mbVar2.dispose();
                    throw null;
                }
                mbVar2.dispose();
            } finally {
                this.getInputFormats = null;
            }
        }
        util.h.xy.ai.rn.mb mbVar3 = new util.h.xy.ai.rn.mb(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        this.getInputFormats = mbVar3;
        mbVar3.setPointer(0L, new com.sun.jna.Pointer(com.sun.jna.Pointer.nativeValue(this.isOutputSupportedForhNQ4ISI) + getHighSpeedVideoFpsRangesFor()));
        util.h.xy.ai.rn.mb mbVar4 = this.getOutputSizeshNQ4ISI;
        if (mbVar4 != null) {
            try {
                mbVar4.dispose();
            } finally {
                this.getOutputSizeshNQ4ISI = null;
            }
        }
        this.getOutputSizeshNQ4ISI = getHighSpeedVideoFpsRangesFor(com.sun.jna.Pointer.nativeValue(this.getInputFormats));
        util.h.xy.ai.rj.getHighSpeedVideoSizes._L5Yns3ZsrmnyXWG9UW52YjQtpEAi4mYMB(this.getOutputSizeshNQ4ISI, this.getOutputStallDuration, this.getInputSizeshNQ4ISI);
        int[] iArr = new int[1];
        this.isOutputSupportedForhNQ4ISI.read(getHighSpeedVideoFpsRangesFor(), iArr, 0, 1);
        return iArr[0];
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m24925() {
        getOutputFormats = (Camera2StreamConfigurationMap + 117) % 128;
        m24920();
        m24926();
        m24923();
        int i = getOutputFormats + 67;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }
}
