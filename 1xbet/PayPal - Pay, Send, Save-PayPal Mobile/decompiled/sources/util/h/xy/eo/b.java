package util.h.xy.eo;

/* loaded from: classes18.dex */
public final class b implements util.h.xy.eo.mb {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getOutputFormats = 1;
    private byte[] getInputSizeshNQ4ISI;
    private util.h.xy.ef.mb getOutputMinFrameDuration;
    private int getOutputMinFrameDurationlomOqCM;
    private byte[] getOutputSizes;
    private util.h.xy.ef.ra getOutputSizeshNQ4ISI;
    private byte[] getOutputStallDuration;
    private int getOutputStallDurationlomOqCM;
    private boolean isOutputSupportedFor;
    private static char[] getHighSpeedVideoFpsRangesFor = {42351, 42294, 42260, 42260, 42294, 42294, 42286, 42290, 42288, 42294, 42297, 42271, 42262, 42285, 42291, 42291, 42265, 42269, 42269, 42268, 42298, 42288, 42292, 42298, 42264, 42260, 42291, 42284, 42290, 42271, 42266, 42295, 42270, 42357, 42350, 42351, 42261, 42299, 42289, 42289, 42284, 42430, 42430, 42368, 42372, 42474, 42470, 42427, 42420, 42421, 42466, 42468, 42372, 42429, 42431, 42474, 42470, 42368, 42371, 42370, 42431, 42430, 42468, 42469, 42428, 42424, 42430, 42470, 42493, 42493, 42466, 42427, 42465, 42432, 42490, 42435, 42465, 42371, 42429, 42428, 42428, 42421, 42443, 42096, 42100, 42101, 42092, 42092, 42099, 42089, 42064, 42065, 42099, 42100, 42098, 42098, 42100, 42073, 42404, 42070, 42075, 42406, 42065, 42106, 42095, 42241, 42372, 42383, 42384, 42409, 42380, 42385, 42419, 42413, 42411, 42408, 42418, 42390, 42382, 42407, 42409, 42384, 42385, 42413, 42411, 42414, 42413, 42381, 42380, 42404, 42406, 42377, 42377, 42411, 42415, 42412, 42417, 42415, 42383, 42397, 42383, 42384, 42362, 42303, 42281, 42287, 42287, 42281, 42263, 42268, 42294, 42288, 42299, 42296, 42294, 42260, 42263, 42284, 42290, 42266, 42260, 42288, 42294, 42285, 42286, 42252, 42282, 42416, 42408, 42408, 42390, 42376, 42401, 42407, 42383, 42377, 42405, 42411, 42406, 42403, 42348, 42302, 42271, 42266, 42291, 42292, 42271, 42266, 42295, 42270, 42256, 42250, 42349, 42348, 42348, 42351, 42351, 42355, 42349, 42355, 42355, 42348, 42354, 42355, 42351, 42349, 42355, 42350, 42244, 42277, 42295, 42297, 42270, 42267, 42293, 42292, 42295, 42288, 42291, 42265, 42265, 42294, 42266, 42266, 42292, 42294, 42289, 42289, 42286, 42260, 42267, 42284, 42281, 42286, 42263};
    private static char[] getInputFormats = {38654, 50276, 13275, 24865, 56463, 3055, 31069, 54524, 527, 29043, 44231, 6729, 18854, 42763, 4725, 16833, 48949, 60041, 22973, 46912, 58034, 20485, 36762, 64233, 10315, 34786, 62737, 8311, 40859, 52509, 14514, 38873, 50445, 12426, 40008, 52978, 14667, 27555, 54785, 304, 29645, 56895, 2191, 31714, 42566, 4300, 17277, 44428, 6392, 19293, 46577, 57375, 21347, 48585, 59447, 23188, 29248, 8401, 55156, 34266, 14394, 61268, 40422, 12293, 59054, 38280, 18534, 65276, 44369, 17303, 63224, 42323, 23517, 3622, 48454, 21475, 1541, 46249, 27447};
    private static long getHighSpeedVideoSizes = -9116537268896477540L;
    private util.h.xy.eo.b.mb getHighSpeedVideoSizesFor = new util.h.xy.eo.b.mb();
    private util.h.xy.eo.b.mb isOutputSupportedForhNQ4ISI = new util.h.xy.eo.b.mb();

    private static void getHighSpeedVideoFpsRanges(int i, int i2, char c, java.lang.Object[] objArr) {
        util.h.xz.b.rb rbVar = new util.h.xz.b.rb();
        long[] jArr = new long[i];
        rbVar.f2651 = 0;
        while (rbVar.f2651 < i) {
            getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 75) % 128;
            jArr[rbVar.f2651] = (((char) (getInputFormats[rbVar.f2651 + i2] ^ 3446303986615426049L)) ^ (rbVar.f2651 * (3446303986615426049L ^ getHighSpeedVideoSizes))) ^ c;
            rbVar.f2651++;
        }
        char[] cArr = new char[i];
        rbVar.f2651 = 0;
        while (rbVar.f2651 < i) {
            cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
            rbVar.f2651++;
        }
        java.lang.String str = new java.lang.String(cArr);
        getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 53) % 128;
        objArr[0] = str;
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(boolean z, int[] iArr, java.lang.String str, java.lang.Object[] objArr) {
        int i;
        int i2;
        byte[] bytes = str.getBytes("ISO-8859-1");
        util.h.xz.b.ma maVar = new util.h.xz.b.ma();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = 2;
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr = getHighSpeedVideoFpsRangesFor;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                int i9 = getHighResolutionOutputSizeshNQ4ISI + 13;
                Camera2StreamConfigurationMap = i9 % 128;
                if (i9 % i5 == 0) {
                    i2 = i6;
                    cArr2[i8] = (char) (cArr[i8] % (-8125198844289309347L));
                    i8--;
                } else {
                    i2 = i6;
                    cArr2[i8] = (char) (cArr[i8] ^ (-8125198844289309347L));
                    i8++;
                }
                i6 = i2;
                i5 = 2;
            }
            i = i6;
            cArr = cArr2;
        } else {
            i = i6;
        }
        char[] cArr3 = new char[i4];
        java.lang.System.arraycopy(cArr, i3, cArr3, 0, i4);
        if (bytes != null) {
            char[] cArr4 = new char[i4];
            maVar.f2631 = 0;
            char c = 0;
            while (maVar.f2631 < i4) {
                if (bytes[maVar.f2631] == 1) {
                    getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 105) % 128;
                    cArr4[maVar.f2631] = (char) (((cArr3[maVar.f2631] * 2) + 1) - c);
                } else {
                    cArr4[maVar.f2631] = (char) ((cArr3[maVar.f2631] * 2) - c);
                }
                c = cArr4[maVar.f2631];
                maVar.f2631++;
            }
            cArr3 = cArr4;
        }
        if (i7 > 0) {
            getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 47) % 128;
            char[] cArr5 = new char[i4];
            java.lang.System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i10 = i4 - i7;
            java.lang.System.arraycopy(cArr5, 0, cArr3, i10, i7);
            java.lang.System.arraycopy(cArr5, i7, cArr3, 0, i10);
            getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 43) % 128;
        }
        if (z) {
            getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 93) % 128;
            char[] cArr6 = new char[i4];
            maVar.f2631 = 0;
            while (maVar.f2631 < i4) {
                cArr6[maVar.f2631] = cArr3[(i4 - maVar.f2631) - 1];
                maVar.f2631++;
            }
            cArr3 = cArr6;
        }
        if (i > 0) {
            getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 95) % 128;
            maVar.f2631 = 0;
            while (maVar.f2631 < i4) {
                cArr3[maVar.f2631] = (char) (cArr3[maVar.f2631] - iArr[2]);
                maVar.f2631++;
            }
        }
        java.lang.String str2 = new java.lang.String(cArr3);
        Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 61) % 128;
        objArr[0] = str2;
    }

    private boolean getHighResolutionOutputSizeshNQ4ISI() {
        if (Camera2StreamConfigurationMap() <= 0) {
            return false;
        }
        int i = (getOutputFormats + 107) % 128;
        getHighSpeedVideoFpsRanges = i;
        getOutputFormats = (i + 43) % 128;
        return true;
    }

    private int Camera2StreamConfigurationMap() {
        int length;
        getHighSpeedVideoFpsRanges = (getOutputFormats + 55) % 128;
        int size = this.getHighSpeedVideoSizesFor.size();
        byte[] bArr = this.getOutputSizes;
        if (bArr == null) {
            int i = getOutputFormats + 19;
            getHighSpeedVideoFpsRanges = i % 128;
            length = i % 2 != 0 ? 1 : 0;
        } else {
            length = bArr.length;
        }
        return size + length;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0018, code lost:
    
        if ((r4 & 15) == 0) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int getHighSpeedVideoSizes(boolean z, int i) {
        int i2 = getOutputFormats;
        getHighSpeedVideoFpsRanges = (i2 + 35) % 128;
        if (z) {
            if (i >= 32 && i <= 128) {
                getHighSpeedVideoFpsRanges = (i2 + 73) % 128;
            }
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(false, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE, 55, 0, 29}, "\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000", objArr);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
        }
        return i >>> 3;
    }

    private int getHighSpeedVideoFpsRangesFor(byte[] bArr, int i, int i2, byte[] bArr2) {
        int i3;
        util.h.xy.ek.a aVar = new util.h.xy.ek.a(this.getOutputSizeshNQ4ISI, this.getOutputStallDurationlomOqCM * 8);
        aVar.mo26546(this.getOutputMinFrameDuration);
        byte[] bArr3 = new byte[16];
        if (getHighResolutionOutputSizeshNQ4ISI()) {
            bArr3[0] = (byte) (bArr3[0] | 64);
        }
        byte mo26547 = (byte) (bArr3[0] | ((((aVar.mo26547() - 2) / 2) & 7) << 3));
        bArr3[0] = mo26547;
        byte[] bArr4 = this.getOutputStallDuration;
        bArr3[0] = (byte) (mo26547 | ((14 - bArr4.length) & 7));
        java.lang.System.arraycopy(bArr4, 0, bArr3, 1, bArr4.length);
        int i4 = i2;
        int i5 = 1;
        while (i4 > 0) {
            bArr3[16 - i5] = (byte) (i4 & 255);
            i4 >>>= 8;
            i5++;
        }
        aVar.mo26550(bArr3, 0, 16);
        if (getHighResolutionOutputSizeshNQ4ISI()) {
            int Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap();
            if (Camera2StreamConfigurationMap2 < 65280) {
                int i6 = getHighSpeedVideoFpsRanges + 41;
                getOutputFormats = i6 % 128;
                aVar.mo26549((byte) (i6 % 2 == 0 ? Camera2StreamConfigurationMap2 >> 113 : Camera2StreamConfigurationMap2 >> 8));
                aVar.mo26549((byte) Camera2StreamConfigurationMap2);
                i3 = 2;
            } else {
                aVar.mo26549((byte) -1);
                aVar.mo26549((byte) -2);
                aVar.mo26549((byte) (Camera2StreamConfigurationMap2 >> 24));
                aVar.mo26549((byte) (Camera2StreamConfigurationMap2 >> 16));
                aVar.mo26549((byte) (Camera2StreamConfigurationMap2 >> 8));
                aVar.mo26549((byte) Camera2StreamConfigurationMap2);
                i3 = 6;
            }
            byte[] bArr5 = this.getOutputSizes;
            if (bArr5 != null) {
                getHighSpeedVideoFpsRanges = (getOutputFormats + 63) % 128;
                aVar.mo26550(bArr5, 0, bArr5.length);
            }
            if (this.getHighSpeedVideoSizesFor.size() > 0) {
                aVar.mo26550(this.getHighSpeedVideoSizesFor.getHighSpeedVideoFpsRangesFor(), 0, this.getHighSpeedVideoSizesFor.size());
            }
            int i7 = (i3 + Camera2StreamConfigurationMap2) % 16;
            if (i7 != 0) {
                int i8 = getOutputFormats + 91;
                getHighSpeedVideoFpsRanges = i8 % 128;
                if (i8 % 2 != 0) {
                    throw new java.lang.ArithmeticException();
                }
                while (i7 != 16) {
                    getHighSpeedVideoFpsRanges = (getOutputFormats + 41) % 128;
                    aVar.mo26549((byte) 0);
                    i7++;
                }
            }
        }
        aVar.mo26550(bArr, i, i2);
        return aVar.mo26548(bArr2, 0);
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final int m26636(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws java.lang.IllegalStateException, util.h.xy.ef.md, util.h.xy.ef.mc {
        int i4;
        int i5 = (getHighSpeedVideoFpsRanges + 113) % 128;
        getOutputFormats = i5;
        if (this.getOutputMinFrameDuration == null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(true, new int[]{82, 23, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ALERT_WARNING_VALUE, 19}, "\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001", objArr);
            throw new java.lang.IllegalStateException(((java.lang.String) objArr[0]).intern());
        }
        byte[] bArr3 = this.getOutputStallDuration;
        int length = bArr3.length;
        int i6 = 15 - length;
        if (i6 < 4) {
            int i7 = i5 + 9;
            getHighSpeedVideoFpsRanges = i7 % 128;
            if (i7 % 2 == 0 ? i2 >= (1 << (i6 * 8)) : i2 >= 0 - (102 - length)) {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI(true, new int[]{105, 37, 138, 0}, "\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000", objArr2);
                throw new java.lang.IllegalStateException(((java.lang.String) objArr2[0]).intern());
            }
        }
        byte[] bArr4 = new byte[this.getOutputMinFrameDurationlomOqCM];
        bArr4[0] = (byte) ((14 - length) & 7);
        java.lang.System.arraycopy(bArr3, 0, bArr4, 1, bArr3.length);
        util.h.xy.eo.d dVar = new util.h.xy.eo.d(this.getOutputSizeshNQ4ISI);
        dVar.mo26556(this.isOutputSupportedFor, new util.h.xy.ep.e(this.getOutputMinFrameDuration, bArr4));
        if (!this.isOutputSupportedFor) {
            int i8 = this.getOutputStallDurationlomOqCM;
            if (i2 < i8) {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI(false, new int[]{166, 14, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE, 0}, "\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000", objArr3);
                throw new util.h.xy.ef.md(((java.lang.String) objArr3[0]).intern());
            }
            int i9 = i2 - i8;
            if (bArr2.length < i9 + i3) {
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI(false, new int[]{142, 24, 0, 0}, "\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000", objArr4);
                throw new util.h.xy.ef.f(((java.lang.String) objArr4[0]).intern());
            }
            int i10 = i + i9;
            java.lang.System.arraycopy(bArr, i10, this.getInputSizeshNQ4ISI, 0, i8);
            byte[] bArr5 = this.getInputSizeshNQ4ISI;
            dVar.mo26555(bArr5, 0, bArr5, 0);
            int i11 = this.getOutputStallDurationlomOqCM;
            while (true) {
                byte[] bArr6 = this.getInputSizeshNQ4ISI;
                if (i11 == bArr6.length) {
                    break;
                }
                getOutputFormats = (getHighSpeedVideoFpsRanges + 31) % 128;
                bArr6[i11] = 0;
                i11++;
            }
            int i12 = i;
            int i13 = i3;
            while (true) {
                i4 = this.getOutputMinFrameDurationlomOqCM;
                if (i12 >= i10 - i4) {
                    break;
                }
                dVar.mo26555(bArr, i12, bArr2, i13);
                int i14 = this.getOutputMinFrameDurationlomOqCM;
                i13 += i14;
                i12 += i14;
            }
            byte[] bArr7 = new byte[i4];
            int i15 = i9 - (i12 - i);
            java.lang.System.arraycopy(bArr, i12, bArr7, 0, i15);
            dVar.mo26555(bArr7, 0, bArr7, 0);
            java.lang.System.arraycopy(bArr7, 0, bArr2, i13, i15);
            byte[] bArr8 = new byte[this.getOutputMinFrameDurationlomOqCM];
            getHighSpeedVideoFpsRangesFor(bArr2, i3, i9, bArr8);
            if (util.h.xy.fb.a.m26827(this.getInputSizeshNQ4ISI, bArr8)) {
                return i9;
            }
            int combineMeasuredStates = android.view.View.combineMeasuredStates(0, 0);
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(23 - combineMeasuredStates, 56 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 60973), objArr5);
            throw new util.h.xy.ef.md(((java.lang.String) objArr5[0]).intern());
        }
        int i16 = this.getOutputStallDurationlomOqCM + i2;
        if (bArr2.length < i16 + i3) {
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(false, new int[]{142, 24, 0, 0}, "\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000", objArr6);
            throw new util.h.xy.ef.f(((java.lang.String) objArr6[0]).intern());
        }
        getHighSpeedVideoFpsRangesFor(bArr, i, i2, this.getInputSizeshNQ4ISI);
        byte[] bArr9 = new byte[this.getOutputMinFrameDurationlomOqCM];
        dVar.mo26555(this.getInputSizeshNQ4ISI, 0, bArr9, 0);
        int i17 = getHighSpeedVideoFpsRanges + 101;
        getOutputFormats = i17 % 128;
        int i18 = i17 % 2;
        int i19 = i;
        int i20 = i3;
        while (true) {
            int i21 = i + i2;
            int i22 = this.getOutputMinFrameDurationlomOqCM;
            if (i19 >= i21 - i22) {
                byte[] bArr10 = new byte[i22];
                int i23 = i21 - i19;
                java.lang.System.arraycopy(bArr, i19, bArr10, 0, i23);
                dVar.mo26555(bArr10, 0, bArr10, 0);
                java.lang.System.arraycopy(bArr10, 0, bArr2, i20, i23);
                java.lang.System.arraycopy(bArr9, 0, bArr2, i3 + i2, this.getOutputStallDurationlomOqCM);
                getOutputFormats = (getHighSpeedVideoFpsRanges + 47) % 128;
                return i16;
            }
            dVar.mo26555(bArr, i19, bArr2, i20);
            int i24 = this.getOutputMinFrameDurationlomOqCM;
            i20 += i24;
            i19 += i24;
        }
    }

    @Override // util.h.xy.eo.ma
    /* renamed from: ˋ, reason: contains not printable characters */
    public final int mo26638(int i) {
        int size = i + this.isOutputSupportedForhNQ4ISI.size();
        if (this.isOutputSupportedFor) {
            return size + this.getOutputStallDurationlomOqCM;
        }
        int i2 = this.getOutputStallDurationlomOqCM;
        if (size < i2) {
            getOutputFormats = (getHighSpeedVideoFpsRanges + 31) % 128;
            return 0;
        }
        getHighSpeedVideoFpsRanges = (getOutputFormats + 83) % 128;
        return size - i2;
    }

    @Override // util.h.xy.eo.ma
    /* renamed from: ˎ, reason: contains not printable characters */
    public final int mo26640(int i) {
        int i2 = (getOutputFormats + 97) % 128;
        getHighSpeedVideoFpsRanges = i2;
        int i3 = i2 + 95;
        getOutputFormats = i3 % 128;
        if (i3 % 2 != 0) {
            return 0;
        }
        throw null;
    }

    @Override // util.h.xy.eo.ma
    /* renamed from: ˎ, reason: contains not printable characters */
    public final byte[] mo26641() {
        int i = getOutputFormats + 69;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 != 0) {
            int i2 = this.getOutputStallDurationlomOqCM;
            byte[] bArr = new byte[i2];
            java.lang.System.arraycopy(this.getInputSizeshNQ4ISI, 0, bArr, 0, i2);
            return bArr;
        }
        int i3 = this.getOutputStallDurationlomOqCM;
        byte[] bArr2 = new byte[i3];
        java.lang.System.arraycopy(this.getInputSizeshNQ4ISI, 0, bArr2, 0, i3);
        return bArr2;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m26639() {
        int i = getHighSpeedVideoFpsRanges + 35;
        getOutputFormats = i % 128;
        this.getOutputSizeshNQ4ISI.mo26557();
        this.getHighSpeedVideoSizesFor.reset();
        this.isOutputSupportedForhNQ4ISI.reset();
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // util.h.xy.eo.ma
    /* renamed from: ᐝ, reason: contains not printable characters */
    public final int mo26642(byte[] bArr, int i) throws java.lang.IllegalStateException, util.h.xy.ef.md {
        int i2 = getOutputFormats + 119;
        getHighSpeedVideoFpsRanges = i2 % 128;
        int m26636 = i2 % 2 != 0 ? m26636(this.isOutputSupportedForhNQ4ISI.getHighSpeedVideoFpsRangesFor(), 1, this.isOutputSupportedForhNQ4ISI.size(), bArr, i) : m26636(this.isOutputSupportedForhNQ4ISI.getHighSpeedVideoFpsRangesFor(), 0, this.isOutputSupportedForhNQ4ISI.size(), bArr, i);
        m26639();
        return m26636;
    }

    final class mb extends java.io.ByteArrayOutputStream {
        private static int Camera2StreamConfigurationMap = 0;
        private static int getHighResolutionOutputSizeshNQ4ISI = 1;

        public final byte[] getHighSpeedVideoFpsRangesFor() {
            int i = getHighResolutionOutputSizeshNQ4ISI + 115;
            Camera2StreamConfigurationMap = i % 128;
            byte[] bArr = this.buf;
            if (i % 2 == 0) {
                return bArr;
            }
            throw new java.lang.ArithmeticException();
        }

        public mb() {
        }
    }

    @Override // util.h.xy.eo.ma
    /* renamed from: ᐝ, reason: contains not printable characters */
    public final int mo26643(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws util.h.xy.ef.mc, java.lang.IllegalStateException {
        int i4 = getOutputFormats + 13;
        getHighSpeedVideoFpsRanges = i4 % 128;
        if (i4 % 2 == 0 ? bArr.length >= i + i2 : bArr.length >= i * i2) {
            this.isOutputSupportedForhNQ4ISI.write(bArr, i, i2);
            int i5 = getOutputFormats + 71;
            getHighSpeedVideoFpsRanges = i5 % 128;
            if (i5 % 2 == 0) {
                return 0;
            }
            throw null;
        }
        int resolveOpacity = android.graphics.drawable.Drawable.resolveOpacity(0, 0);
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(22 - resolveOpacity, (android.view.ViewConfiguration.getTapTimeout() >> 16) + 34, (char) android.text.TextUtils.indexOf("", ""), objArr);
        throw new util.h.xy.ef.mc(((java.lang.String) objArr[0]).intern());
    }

    @Override // util.h.xy.eo.ma
    /* renamed from: ˊ, reason: contains not printable characters */
    public final void mo26637(boolean z, util.h.xy.ef.mb mbVar) throws java.lang.IllegalArgumentException {
        util.h.xy.ef.mb m26659;
        this.isOutputSupportedFor = z;
        if (mbVar instanceof util.h.xy.ep.ra) {
            util.h.xy.ep.ra raVar = (util.h.xy.ep.ra) mbVar;
            this.getOutputStallDuration = raVar.m26670();
            this.getOutputSizes = raVar.m26668();
            this.getOutputStallDurationlomOqCM = getHighSpeedVideoSizes(z, raVar.m26671());
            m26659 = raVar.m26669();
        } else {
            if (!(mbVar instanceof util.h.xy.ep.e)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                try {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges(34 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6, (char) ((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2710), objArr);
                    sb.append(((java.lang.String) objArr[0]).intern());
                    sb.append(mbVar.getClass().getName());
                    throw new java.lang.IllegalArgumentException(sb.toString());
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            util.h.xy.ep.e eVar = (util.h.xy.ep.e) mbVar;
            this.getOutputStallDuration = eVar.m26658();
            this.getOutputSizes = null;
            this.getOutputStallDurationlomOqCM = getHighSpeedVideoSizes(z, 64);
            m26659 = eVar.m26659();
        }
        if (m26659 != null) {
            this.getOutputMinFrameDuration = m26659;
        }
        byte[] bArr = this.getOutputStallDuration;
        if (bArr != null && bArr.length >= 7 && bArr.length <= 13) {
            m26639();
        } else {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(false, new int[]{40, 42, 117, 0}, "\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001", objArr2);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr2[0]).intern());
        }
    }

    public b(util.h.xy.ef.ra raVar) {
        this.getOutputSizeshNQ4ISI = raVar;
        int mo26554 = raVar.mo26554();
        this.getOutputMinFrameDurationlomOqCM = mo26554;
        this.getInputSizeshNQ4ISI = new byte[mo26554];
        if (mo26554 == 16) {
            return;
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(false, new int[]{0, 40, 0, 36}, "\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000", objArr);
        throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
    }
}
