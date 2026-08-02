package util.h.xy.ai;

/* loaded from: classes18.dex */
public final class m {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighSpeedVideoSizes = 1;
    private util.h.xy.ai.m.mb getHighResolutionOutputSizeshNQ4ISI = null;
    private util.h.xy.ai.m.mb getHighSpeedVideoFpsRangesFor = null;
    private util.h.xy.ai.m.mb getHighSpeedVideoFpsRanges = null;

    protected final void finalize() {
        int i = Camera2StreamConfigurationMap;
        int i2 = (i & 81) + (i | 81);
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 != 0) {
            m24680();
        } else {
            m24680();
            throw null;
        }
    }

    final class mb extends com.sun.jna.Memory {
        private static int Camera2StreamConfigurationMap = 1;
        private static int getHighResolutionOutputSizeshNQ4ISI;

        public mb(long j) {
            super(j);
        }

        @Override // com.sun.jna.Memory
        public final void dispose() {
            int i = Camera2StreamConfigurationMap;
            int i2 = ((i | 13) << 1) - (i ^ 13);
            getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
            if (i2 % 2 == 0) {
                super.dispose();
            } else {
                super.dispose();
                throw null;
            }
        }
    }

    private static int getHighSpeedVideoFpsRanges() {
        int i = Camera2StreamConfigurationMap;
        int i2 = ((i | 73) << 1) - (i ^ 73);
        int i3 = i2 % 128;
        getHighSpeedVideoSizes = i3;
        int i4 = i2 % 2 == 0 ? 46 : 76;
        Camera2StreamConfigurationMap = (i3 + 21) % 128;
        return i4;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    protected final void m24679() {
        int i = getHighSpeedVideoSizes;
        int i2 = ((i & 9) + (i | 9)) % 128;
        Camera2StreamConfigurationMap = i2;
        util.h.xy.ai.m.mb mbVar = this.getHighResolutionOutputSizeshNQ4ISI;
        if (mbVar != null) {
            int i3 = i2 + 63;
            getHighSpeedVideoSizes = i3 % 128;
            try {
                if (i3 % 2 == 0) {
                    mbVar.dispose();
                    this.getHighResolutionOutputSizeshNQ4ISI = null;
                    throw new java.lang.ArithmeticException();
                }
                mbVar.dispose();
                this.getHighResolutionOutputSizeshNQ4ISI = null;
                int i4 = Camera2StreamConfigurationMap;
                getHighSpeedVideoSizes = ((i4 ^ 111) + ((i4 & 111) << 1)) % 128;
            } catch (java.lang.Throwable th) {
                this.getHighResolutionOutputSizeshNQ4ISI = null;
                throw th;
            }
        }
        util.h.xy.ai.m.mb mbVar2 = this.getHighSpeedVideoFpsRangesFor;
        if (mbVar2 != null) {
            int i5 = getHighSpeedVideoSizes + 55;
            Camera2StreamConfigurationMap = i5 % 128;
            try {
                if (i5 % 2 != 0) {
                    mbVar2.dispose();
                    throw null;
                }
                mbVar2.dispose();
                this.getHighSpeedVideoFpsRangesFor = null;
                getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 63) % 128;
            } finally {
                this.getHighSpeedVideoFpsRangesFor = null;
            }
        }
        util.h.xy.ai.m.mb mbVar3 = this.getHighSpeedVideoFpsRanges;
        if (mbVar3 != null) {
            int i6 = getHighSpeedVideoSizes;
            int i7 = ((i6 | 11) << 1) - (i6 ^ 11);
            Camera2StreamConfigurationMap = i7 % 128;
            try {
                if (i7 % 2 == 0) {
                    mbVar3.dispose();
                } else {
                    mbVar3.dispose();
                    this.getHighSpeedVideoFpsRanges = null;
                    throw new java.lang.ArithmeticException();
                }
            } finally {
                this.getHighSpeedVideoFpsRanges = null;
            }
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final int m24678() throws java.io.IOException {
        int i = Camera2StreamConfigurationMap + 85;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        util.h.xy.ai.m.mb mbVar = this.getHighResolutionOutputSizeshNQ4ISI;
        if (mbVar != null) {
            try {
                mbVar.dispose();
            } finally {
                this.getHighResolutionOutputSizeshNQ4ISI = null;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE);
        int i2 = getHighSpeedVideoSizes;
        int i3 = ((i2 ^ 7) + ((i2 & 7) << 1)) % 128;
        Camera2StreamConfigurationMap = i3;
        int i4 = i3 + 59;
        getHighSpeedVideoSizes = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        int identityHashCode = java.lang.System.identityHashCode(this);
        int i5 = (nativeSize * 1435) - 76612;
        int i6 = -(-((nativeSize | (-108)) * (-1434)));
        int i7 = (i5 & i6) + (i5 | i6);
        int i8 = ~identityHashCode;
        int i9 = ~((i8 & nativeSize) | (i8 ^ nativeSize));
        int i10 = ~(nativeSize | 107);
        int i11 = (i9 ^ i10) | (i9 & i10);
        int i12 = ~nativeSize;
        int i13 = (i12 ^ (-108)) | (i12 & (-108));
        int i14 = ~((i13 & identityHashCode) | (i13 ^ identityHashCode));
        int i15 = -(-(((i11 ^ i14) | (i11 & i14)) * 717));
        int i16 = ((i7 | i15) << 1) - (i15 ^ i7);
        int i17 = ~((i8 ^ i13) | (i13 & i8));
        int i18 = (i17 ^ i10) | (i10 & i17);
        int i19 = ~((nativeSize ^ identityHashCode) | (nativeSize & identityHashCode));
        int i20 = -(-(((i19 ^ i18) | (i19 & i18)) * 717));
        this.getHighResolutionOutputSizeshNQ4ISI = new util.h.xy.ai.m.mb((i16 & i20) + (i20 | i16));
        util.h.xy.ai.m.mb mbVar2 = this.getHighSpeedVideoFpsRangesFor;
        if (mbVar2 != null) {
            int i21 = Camera2StreamConfigurationMap;
            getHighSpeedVideoSizes = ((i21 ^ 41) + ((i21 & 41) << 1)) % 128;
            try {
                mbVar2.dispose();
            } finally {
                this.getHighSpeedVideoFpsRangesFor = null;
            }
        }
        util.h.xy.ai.m.mb mbVar3 = new util.h.xy.ai.m.mb(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        this.getHighSpeedVideoFpsRangesFor = mbVar3;
        mbVar3.setPointer(0L, new com.sun.jna.Pointer(com.sun.jna.Pointer.nativeValue(this.getHighResolutionOutputSizeshNQ4ISI) + getHighSpeedVideoFpsRanges()));
        util.h.xy.ai.m.mb mbVar4 = this.getHighSpeedVideoFpsRanges;
        if (mbVar4 != null) {
            int i22 = getHighSpeedVideoSizes + 73;
            Camera2StreamConfigurationMap = i22 % 128;
            try {
                if (i22 % 2 != 0) {
                    mbVar4.dispose();
                    throw null;
                }
                mbVar4.dispose();
            } finally {
                this.getHighSpeedVideoFpsRanges = null;
            }
        }
        long nativeValue = com.sun.jna.Pointer.nativeValue(this.getHighSpeedVideoFpsRangesFor);
        util.h.xy.ai.m.mb mbVar5 = new util.h.xy.ai.m.mb(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        mbVar5.setLong(0L, nativeValue ^ 611229145);
        Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 1) % 128;
        this.getHighSpeedVideoFpsRanges = mbVar5;
        util.h.xy.ai.rk.getHighSpeedVideoSizes._VXTcgisUsrRw8jW8YWcEix(this.getHighSpeedVideoFpsRanges);
        int[] iArr = new int[1];
        util.h.xy.ai.m.mb mbVar6 = this.getHighResolutionOutputSizeshNQ4ISI;
        int highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
        int identityHashCode2 = java.lang.System.identityHashCode(this);
        int i23 = highSpeedVideoFpsRanges * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE;
        int i24 = ~highSpeedVideoFpsRanges;
        int i25 = ~identityHashCode2;
        int i26 = i25 | (i25 ^ (-1));
        int i27 = (~(i24 | (~i24))) | (~i26);
        int i28 = ~(highSpeedVideoFpsRanges | identityHashCode2);
        int i29 = ((i27 ^ i28) | (i27 & i28)) * (-252);
        int i30 = ((i23 | i29) << 1) - (i23 ^ i29);
        int i31 = -(-(highSpeedVideoFpsRanges * (-252)));
        int i32 = ~((i26 ^ highSpeedVideoFpsRanges) | (i26 & highSpeedVideoFpsRanges));
        int i33 = ~((highSpeedVideoFpsRanges ^ identityHashCode2) | (highSpeedVideoFpsRanges & identityHashCode2));
        mbVar6.read((i30 & i31) + (i30 | i31) + (((i33 ^ i32) | (i33 & i32)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE), iArr, 0, 1);
        int i34 = iArr[0];
        int i35 = getHighSpeedVideoSizes + 87;
        Camera2StreamConfigurationMap = i35 % 128;
        if (i35 % 2 == 0) {
            return i34;
        }
        throw null;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m24680() {
        int i = getHighSpeedVideoSizes;
        Camera2StreamConfigurationMap = (((i | 19) << 1) - (i ^ 19)) % 128;
        m24679();
        int i2 = getHighSpeedVideoSizes;
        Camera2StreamConfigurationMap = ((i2 ^ 95) + ((i2 & 95) << 1)) % 128;
    }
}
