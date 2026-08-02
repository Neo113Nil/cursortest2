package util.h.xy.bv;

/* loaded from: classes5.dex */
public class ri extends util.h.xy.bv.rb {
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private byte[] Camera2StreamConfigurationMap;
    private java.util.List<util.h.xy.bv.ri.b> getHighSpeedVideoSizes;

    public final class ma {
        private static int getHighSpeedVideoFpsRanges = 1;
        private static int getHighSpeedVideoSizes;
        private byte[] Camera2StreamConfigurationMap;
        private byte[] getHighResolutionOutputSizeshNQ4ISI;
        private byte[] getHighSpeedVideoSizesFor;
        private byte[] getInputFormats;
        private byte[] getInputSizeshNQ4ISI;
        private byte[] getOutputFormats;
        private byte[] getOutputMinFrameDuration;
        private byte[] getOutputSizeshNQ4ISI;

        ma(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7, byte[] bArr8) {
            if (bArr != null) {
                this.getOutputMinFrameDuration = (byte[]) bArr.clone();
            }
            if (bArr4 != null) {
                this.getHighSpeedVideoSizesFor = (byte[]) bArr4.clone();
            }
            if (bArr5 != null) {
                this.Camera2StreamConfigurationMap = (byte[]) bArr5.clone();
            }
            if (bArr6 != null) {
                this.getInputFormats = (byte[]) bArr6.clone();
            }
            if (bArr7 != null) {
                this.getOutputSizeshNQ4ISI = (byte[]) bArr7.clone();
            }
            if (bArr8 != null) {
                this.getHighResolutionOutputSizeshNQ4ISI = (byte[]) bArr8.clone();
            }
            if (bArr2 != null) {
                this.getOutputFormats = (byte[]) bArr2.clone();
            }
            if (bArr3 != null) {
                this.getInputSizeshNQ4ISI = (byte[]) bArr3.clone();
            }
        }

        @util.h.xy.a.a
        /* renamed from: ˊ, reason: contains not printable characters */
        public final byte[] m25774() {
            int i = (getHighSpeedVideoFpsRanges + 83) % 128;
            getHighSpeedVideoSizes = i;
            byte[] bArr = this.getOutputMinFrameDuration;
            int i2 = (i ^ 101) + ((i & 101) << 1);
            getHighSpeedVideoFpsRanges = i2 % 128;
            if (i2 % 2 != 0) {
                return bArr;
            }
            throw null;
        }

        @util.h.xy.a.a
        /* renamed from: ˎ, reason: contains not printable characters */
        public final byte[] m25776() {
            int i = getHighSpeedVideoFpsRanges;
            getHighSpeedVideoSizes = (i + 117) % 128;
            byte[] bArr = this.getOutputFormats;
            getHighSpeedVideoSizes = ((i ^ 77) + ((i & 77) << 1)) % 128;
            return bArr;
        }

        @util.h.xy.a.a
        /* renamed from: ˋ, reason: contains not printable characters */
        public final byte[] m25775() {
            int i = getHighSpeedVideoSizes;
            int i2 = (i & 37) + (i | 37);
            int i3 = i2 % 128;
            getHighSpeedVideoFpsRanges = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            byte[] bArr = this.getInputSizeshNQ4ISI;
            int i4 = (i3 ^ 87) + ((i3 & 87) << 1);
            getHighSpeedVideoSizes = i4 % 128;
            if (i4 % 2 == 0) {
                return bArr;
            }
            throw null;
        }

        @util.h.xy.a.a
        /* renamed from: ˏ, reason: contains not printable characters */
        public final byte[] m25777() {
            int i = getHighSpeedVideoSizes;
            int i2 = (i ^ 115) + ((i & 115) << 1);
            getHighSpeedVideoFpsRanges = i2 % 128;
            if (i2 % 2 != 0) {
                return this.getHighSpeedVideoSizesFor;
            }
            throw null;
        }

        @util.h.xy.a.a
        /* renamed from: ᐝ, reason: contains not printable characters */
        public final byte[] m25778() {
            int i = getHighSpeedVideoSizes;
            int i2 = ((i | 9) << 1) - (i ^ 9);
            getHighSpeedVideoFpsRanges = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            byte[] bArr = this.Camera2StreamConfigurationMap;
            getHighSpeedVideoFpsRanges = ((i & 69) + (i | 69)) % 128;
            return bArr;
        }

        @util.h.xy.a.a
        /* renamed from: ʼ, reason: contains not printable characters */
        public final byte[] m25772() {
            int i = getHighSpeedVideoSizes;
            int i2 = ((i & 29) + (i | 29)) % 128;
            getHighSpeedVideoFpsRanges = i2;
            byte[] bArr = this.getInputFormats;
            int i3 = (i2 & 49) + (i2 | 49);
            getHighSpeedVideoSizes = i3 % 128;
            if (i3 % 2 == 0) {
                return bArr;
            }
            throw null;
        }

        @util.h.xy.a.a
        /* renamed from: ʽ, reason: contains not printable characters */
        public final byte[] m25773() {
            int i = getHighSpeedVideoSizes;
            int i2 = (i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) + ((i & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1);
            getHighSpeedVideoFpsRanges = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            byte[] bArr = this.getOutputSizeshNQ4ISI;
            int i3 = (i ^ 117) + ((i & 117) << 1);
            getHighSpeedVideoFpsRanges = i3 % 128;
            if (i3 % 2 != 0) {
                return bArr;
            }
            throw null;
        }

        @util.h.xy.a.a
        /* renamed from: ʻ, reason: contains not printable characters */
        public final byte[] m25771() {
            int i = getHighSpeedVideoFpsRanges;
            getHighSpeedVideoSizes = ((i & 75) + (i | 75)) % 128;
            byte[] bArr = this.getHighResolutionOutputSizeshNQ4ISI;
            int i2 = i + 69;
            getHighSpeedVideoSizes = i2 % 128;
            if (i2 % 2 == 0) {
                return bArr;
            }
            throw null;
        }

        @util.h.xy.a.a
        /* renamed from: ι, reason: contains not printable characters */
        public final void m25779() {
            int i = getHighSpeedVideoFpsRanges;
            getHighSpeedVideoSizes = ((i ^ 1) + ((i & 1) << 1)) % 128;
            util.h.xy.ar.b.m25100(this.getOutputMinFrameDuration, this.getOutputFormats, this.getHighSpeedVideoSizesFor, this.Camera2StreamConfigurationMap, this.getInputFormats, this.getOutputSizeshNQ4ISI, this.getHighResolutionOutputSizeshNQ4ISI);
            int i2 = getHighSpeedVideoFpsRanges;
            int i3 = (i2 & 17) + (i2 | 17);
            getHighSpeedVideoSizes = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
        }
    }

    public final class b {
        private static int getHighSpeedVideoFpsRanges = 1;
        private static int getHighSpeedVideoFpsRangesFor;
        private util.h.xy.bv.ri.ma getHighResolutionOutputSizeshNQ4ISI;
        private byte[] getHighSpeedVideoSizes;

        public b(byte[] bArr, util.h.xy.bv.ri.ma maVar) {
            this.getHighSpeedVideoSizes = (byte[]) bArr.clone();
            this.getHighResolutionOutputSizeshNQ4ISI = maVar;
        }

        @util.h.xy.a.a
        /* renamed from: ˎ, reason: contains not printable characters */
        public final byte[] m25769() {
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 69) % 128;
            byte[] bArr = (byte[]) this.getHighSpeedVideoSizes.clone();
            int i = getHighSpeedVideoFpsRangesFor;
            int i2 = (i ^ 33) + ((i & 33) << 1);
            getHighSpeedVideoFpsRanges = i2 % 128;
            if (i2 % 2 != 0) {
                return bArr;
            }
            throw null;
        }

        @util.h.xy.a.a
        /* renamed from: ˏ, reason: contains not printable characters */
        public final util.h.xy.bv.ri.ma m25770() {
            int identityHashCode = java.lang.System.identityHashCode(this);
            int i = ~((identityHashCode ^ 74569031) | (identityHashCode & 74569031));
            int i2 = -(-(((i ^ 1636573240) | (i & 1636573240)) * 345));
            int i3 = ((i2 | 1293055016) << 1) - (i2 ^ 1293055016);
            int i4 = ~(74569031 | (~identityHashCode));
            int i5 = ((i4 ^ 7393537) | (i4 & 7393537)) * 345;
            int identityHashCode2 = java.lang.System.identityHashCode(this);
            int i6 = ~identityHashCode2;
            int i7 = ~(i6 | (-2130881616));
            int i8 = ~((identityHashCode2 ^ 1529765231) | (identityHashCode2 & 1529765231));
            int i9 = (-690350932) - (~(-(-(((i7 ^ i8) | (i7 & i8)) * 959))));
            int i10 = (i9 & (-888963152)) + ((-888963152) | i9);
            int i11 = ((~((identityHashCode2 & (-2130881616)) | (identityHashCode2 ^ (-2130881616)))) | (~((i6 ^ 1529765231) | (i6 & 1529765231)))) * 959;
            if ((((i3 & i5) + (i5 | i3)) - (~((~(identityHashCode | (-1636573241))) * 345))) - 1 <= (i10 ^ i11) + ((i11 & i10) << 1)) {
                throw null;
            }
            util.h.xy.bv.ri.ma maVar = this.getHighResolutionOutputSizeshNQ4ISI;
            int i12 = getHighSpeedVideoFpsRangesFor + 101;
            getHighSpeedVideoFpsRanges = i12 % 128;
            if (i12 % 2 != 0) {
                return maVar;
            }
            throw null;
        }

        @util.h.xy.a.a
        /* renamed from: ˋ, reason: contains not printable characters */
        public final void m25768() {
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 111) % 128;
            util.h.xy.ar.b.m25095(this.getHighSpeedVideoSizes);
            this.getHighResolutionOutputSizeshNQ4ISI.m25779();
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 91) % 128;
        }
    }

    public ri(int i) {
        super(i);
    }

    @util.h.xy.a.a
    /* renamed from: ʻ, reason: contains not printable characters */
    public byte[] m25763() {
        getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 101) % 128;
        byte[] bArr = (byte[]) this.Camera2StreamConfigurationMap.clone();
        int i = getHighSpeedVideoFpsRangesFor + 81;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            return bArr;
        }
        throw null;
    }

    @util.h.xy.a.a
    /* renamed from: ˏ, reason: contains not printable characters */
    public void m25767(byte[] bArr) {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = (i & 57) + (i | 57);
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 != 0) {
            this.Camera2StreamConfigurationMap = (byte[]) bArr.clone();
            int i3 = getHighSpeedVideoFpsRangesFor + 103;
            getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
            if (i3 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
            return;
        }
        this.Camera2StreamConfigurationMap = (byte[]) bArr.clone();
        throw new java.lang.ArithmeticException();
    }

    @util.h.xy.a.a
    /* renamed from: ʼ, reason: contains not printable characters */
    public java.util.List<util.h.xy.bv.ri.b> m25764() {
        int i = getHighResolutionOutputSizeshNQ4ISI + 41;
        getHighSpeedVideoFpsRangesFor = i % 128;
        java.util.List<util.h.xy.bv.ri.b> list = this.getHighSpeedVideoSizes;
        if (i % 2 != 0) {
            return list;
        }
        throw new java.lang.ArithmeticException();
    }

    @util.h.xy.a.a
    /* renamed from: ˎ, reason: contains not printable characters */
    public void m25766(java.util.List<util.h.xy.bv.ri.b> list) {
        int i = (getHighSpeedVideoFpsRangesFor + 125) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i;
        this.getHighSpeedVideoSizes = list;
        getHighSpeedVideoFpsRangesFor = (((i | 21) << 1) - (i ^ 21)) % 128;
    }

    @util.h.xy.a.a
    /* renamed from: ʽ, reason: contains not printable characters */
    public void m25765() {
        int i = getHighSpeedVideoFpsRangesFor;
        getHighResolutionOutputSizeshNQ4ISI = (((i | 43) << 1) - (i ^ 43)) % 128;
        util.h.xy.ar.b.m25095(this.Camera2StreamConfigurationMap);
        java.util.List<util.h.xy.bv.ri.b> list = this.getHighSpeedVideoSizes;
        if (list != null) {
            int i2 = getHighResolutionOutputSizeshNQ4ISI + 7;
            getHighSpeedVideoFpsRangesFor = i2 % 128;
            if (i2 % 2 == 0) {
                list.iterator();
                throw null;
            }
            java.util.Iterator<util.h.xy.bv.ri.b> it = list.iterator();
            while (it.hasNext()) {
                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 25) % 128;
                it.next().m25768();
            }
        }
        int i3 = getHighResolutionOutputSizeshNQ4ISI + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        getHighSpeedVideoFpsRangesFor = i3 % 128;
        if (i3 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }
}
