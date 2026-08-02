package util.h.xy.eo;

/* loaded from: classes18.dex */
public final class d extends util.h.xy.ef.mf implements util.h.xy.ef.mg {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static char[] getHighSpeedVideoFpsRanges = {42317, 42352, 42249, 42298, 42297, 42291, 42263, 42260, 42294, 42289, 42295, 42302, 42294, 42289, 42270, 42266, 42291, 42266, 42342, 42258, 42345, 42260, 42289, 42294, 42288, 42290, 42286, 42294, 42294, 42260, 42271, 42297, 42292, 42291, 42267, 42348, 42267, 42259, 42268, 42269, 42254, 42262, 42249, 42492, 42492, 42456, 42241, 42283, 42495, 42364, 42262, 42254, 42269, 42268, 42259, 42267, 42348, 42267, 42291, 42292, 42297, 42271, 42260, 42294, 42294, 42286, 42290, 42288, 42294, 42289, 42260, 42345, 42258, 42342, 42266, 42295, 42270, 42269, 42295, 42263, 42267, 42293, 42302, 42295, 42286, 42250, 42352, 42358, 42258, 42245, 42291, 42291, 42301, 42296, 42287, 42294, 42289, 42289, 42292, 42298, 42292, 42292, 42245, 42341, 42260, 42289, 42294, 42288, 42290, 42286, 42294, 42294, 42260, 42271, 42297, 42292, 42291, 42267, 42348, 42267, 42259, 42268, 42269, 42254, 42262, 42348, 42268, 42263, 42281, 42287, 42290, 42294, 42295, 42289, 42299, 42298, 42285, 42260, 42266, 42290, 42284, 42263, 42260, 42294, 42296, 42299, 42288, 42346, 42287, 42281, 42287, 42287, 42281, 42263, 42268, 42294, 42288, 42299, 42296, 42294, 42260, 42263, 42284, 42290, 42266, 42260, 42288, 42294, 42285, 42286, 42343, 42284, 42284, 42287, 42244, 42341, 42260, 42299, 42295, 42298, 42292, 42260, 42270, 42295, 42266, 42263, 42281, 42287, 42266, 42271, 42297, 42292, 42291, 42267, 42348, 42267, 42259, 42268, 42269, 42254, 42262, 42348, 42266, 42294, 42265, 42260, 42294};
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes;
    private byte[] getHighSpeedVideoSizesFor;
    private int getInputFormats;
    private byte[] getInputSizeshNQ4ISI;
    private final int getOutputFormats;
    private final util.h.xy.ef.ra getOutputMinFrameDuration;
    private byte[] getOutputSizes;

    private static void getHighSpeedVideoFpsRanges(boolean z, int[] iArr, java.lang.String str, java.lang.Object[] objArr) {
        int i;
        int i2;
        byte[] bytes = str.getBytes("ISO-8859-1");
        util.h.xz.b.ma maVar = new util.h.xz.b.ma();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = getHighSpeedVideoFpsRanges;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 15) % 128;
            int i7 = 0;
            while (i7 < length) {
                int i8 = Camera2StreamConfigurationMap + 71;
                getHighResolutionOutputSizeshNQ4ISI = i8 % 128;
                if (i8 % 2 == 0) {
                    i2 = i6;
                    cArr2[i7] = (char) (cArr[i7] % (-8125198844289309347L));
                } else {
                    i2 = i6;
                    cArr2[i7] = (char) (cArr[i7] ^ (-8125198844289309347L));
                    i7++;
                }
                i6 = i2;
            }
            i = i6;
            getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 55) % 128;
            cArr = cArr2;
        } else {
            i = i6;
        }
        char[] cArr3 = new char[i4];
        java.lang.System.arraycopy(cArr, i3, cArr3, 0, i4);
        if (bytes != null) {
            char[] cArr4 = new char[i4];
            maVar.f2631 = 0;
            int i9 = Camera2StreamConfigurationMap + 45;
            getHighResolutionOutputSizeshNQ4ISI = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 4 / 5;
            }
            char c = 0;
            while (maVar.f2631 < i4) {
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
        if (i > 0) {
            char[] cArr5 = new char[i4];
            java.lang.System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i11 = i4 - i;
            int i12 = i;
            java.lang.System.arraycopy(cArr5, 0, cArr3, i11, i12);
            java.lang.System.arraycopy(cArr5, i12, cArr3, 0, i11);
        }
        if (z) {
            getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 9) % 128;
            char[] cArr6 = new char[i4];
            maVar.f2631 = 0;
            while (maVar.f2631 < i4) {
                cArr6[maVar.f2631] = cArr3[(i4 - maVar.f2631) - 1];
                maVar.f2631++;
            }
            cArr3 = cArr6;
        }
        if (i5 > 0) {
            getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 3) % 128;
            maVar.f2631 = 0;
            while (maVar.f2631 < i4) {
                cArr3[maVar.f2631] = (char) (cArr3[maVar.f2631] - iArr[2]);
                maVar.f2631++;
            }
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    @Override // util.h.xy.ef.ra
    /* renamed from: ᐝ */
    public final void mo26557() {
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 63) % 128;
        util.h.xy.fb.a.m26826(this.getHighSpeedVideoSizesFor, (byte) 0);
        byte[] bArr = this.getInputSizeshNQ4ISI;
        java.lang.System.arraycopy(bArr, 0, this.getHighSpeedVideoSizesFor, 0, bArr.length);
        this.getOutputMinFrameDuration.mo26557();
        this.getInputFormats = 0;
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 25) % 128;
    }

    private void getHighSpeedVideoFpsRanges() {
        byte b;
        int i = getHighSpeedVideoSizes;
        getHighSpeedVideoFpsRangesFor = (i + 41) % 128;
        int length = this.getHighSpeedVideoSizesFor.length;
        int i2 = i + 105;
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 4 / 3;
        }
        do {
            length--;
            if (length < 0) {
                break;
            }
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 7) % 128;
            byte[] bArr = this.getHighSpeedVideoSizesFor;
            b = (byte) (bArr[length] + 1);
            bArr[length] = b;
        } while (b == 0);
        byte[] bArr2 = this.getInputSizeshNQ4ISI;
        if (length >= bArr2.length || bArr2.length >= this.getOutputFormats) {
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 93) % 128;
        } else {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(true, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE, 37, 0, 5}, "\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001", objArr);
            throw new java.lang.IllegalStateException(((java.lang.String) objArr[0]).intern());
        }
    }

    @Override // util.h.xy.ef.mf
    /* renamed from: ˋ */
    public final byte mo26551(byte b) throws util.h.xy.ef.mc, java.lang.IllegalStateException {
        int i = getHighSpeedVideoSizes + 73;
        int i2 = i % 128;
        getHighSpeedVideoFpsRangesFor = i2;
        if (i % 2 == 0) {
            throw null;
        }
        int i3 = this.getInputFormats;
        if (i3 != 0) {
            byte[] bArr = this.getOutputSizes;
            int i4 = i3 + 1;
            this.getInputFormats = i4;
            byte b2 = (byte) (b ^ bArr[i3]);
            if (i4 == this.getHighSpeedVideoSizesFor.length) {
                this.getInputFormats = 0;
                getHighSpeedVideoFpsRanges();
            }
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 107) % 128;
            return b2;
        }
        int i5 = i2 + 21;
        getHighSpeedVideoSizes = i5 % 128;
        util.h.xy.ef.ra raVar = this.getOutputMinFrameDuration;
        byte[] bArr2 = this.getHighSpeedVideoSizesFor;
        if (i5 % 2 != 0) {
            raVar.mo26555(bArr2, 0, this.getOutputSizes, 0);
            byte[] bArr3 = this.getOutputSizes;
            int i6 = this.getInputFormats;
            this.getInputFormats = i6;
            return (byte) (b ^ bArr3[i6]);
        }
        raVar.mo26555(bArr2, 0, this.getOutputSizes, 0);
        byte[] bArr4 = this.getOutputSizes;
        int i7 = this.getInputFormats;
        this.getInputFormats = i7 + 1;
        return (byte) (b ^ bArr4[i7]);
    }

    @Override // util.h.xy.ef.mf, util.h.xy.ef.rg
    /* renamed from: ᐝ */
    public final int mo26553(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws util.h.xy.ef.mc {
        byte b;
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 83) % 128;
        if (i + i2 > bArr.length) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(true, new int[]{125, 22, 0, 7}, "\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001", objArr);
            throw new util.h.xy.ef.mc(((java.lang.String) objArr[0]).intern());
        }
        if (i3 + i2 > bArr2.length) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(false, new int[]{147, 23, 0, 0}, "\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000", objArr2);
            throw new util.h.xy.ef.f(((java.lang.String) objArr2[0]).intern());
        }
        int i4 = 0;
        while (i4 < i2) {
            int i5 = this.getInputFormats;
            if (i5 == 0) {
                this.getOutputMinFrameDuration.mo26555(this.getHighSpeedVideoSizesFor, 0, this.getOutputSizes, 0);
                byte b2 = bArr[i + i4];
                byte[] bArr3 = this.getOutputSizes;
                int i6 = this.getInputFormats;
                this.getInputFormats = i6 + 1;
                b = (byte) (b2 ^ bArr3[i6]);
            } else {
                byte b3 = bArr[i + i4];
                byte[] bArr4 = this.getOutputSizes;
                int i7 = i5 + 1;
                this.getInputFormats = i7;
                b = (byte) (bArr4[i5] ^ b3);
                if (i7 == this.getHighSpeedVideoSizesFor.length) {
                    int i8 = getHighSpeedVideoSizes + 103;
                    getHighSpeedVideoFpsRangesFor = i8 % 128;
                    if (i8 % 2 == 0) {
                        this.getInputFormats = 1;
                    } else {
                        this.getInputFormats = 0;
                    }
                    getHighSpeedVideoFpsRanges();
                }
            }
            bArr2[i3 + i4] = b;
            i4++;
            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 85) % 128;
        }
        return i2;
    }

    @Override // util.h.xy.ef.ra
    /* renamed from: ˋ */
    public final int mo26555(byte[] bArr, int i, byte[] bArr2, int i2) throws util.h.xy.ef.mc, java.lang.IllegalStateException {
        if (this.getInputFormats != 0) {
            int i3 = getHighSpeedVideoSizes + 19;
            getHighSpeedVideoFpsRangesFor = i3 % 128;
            int i4 = this.getOutputFormats;
            if (i3 % 2 == 0) {
                mo26553(bArr, i, i4, bArr2, i2);
                throw null;
            }
            mo26553(bArr, i, i4, bArr2, i2);
        } else {
            int i5 = this.getOutputFormats;
            int i6 = 0;
            if (i + i5 > bArr.length) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(true, new int[]{125, 22, 0, 7}, "\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001", objArr);
                throw new util.h.xy.ef.mc(((java.lang.String) objArr[0]).intern());
            }
            if (i5 + i2 > bArr2.length) {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(false, new int[]{147, 23, 0, 0}, "\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000", objArr2);
                throw new util.h.xy.ef.f(((java.lang.String) objArr2[0]).intern());
            }
            this.getOutputMinFrameDuration.mo26555(this.getHighSpeedVideoSizesFor, 0, this.getOutputSizes, 0);
            while (i6 < this.getOutputFormats) {
                bArr2[i2 + i6] = (byte) (bArr[i + i6] ^ this.getOutputSizes[i6]);
                i6++;
                getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 15) % 128;
            }
            getHighSpeedVideoFpsRanges();
        }
        return this.getOutputFormats;
    }

    @Override // util.h.xy.ef.ra
    /* renamed from: ˋ */
    public final int mo26554() {
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 13) % 128;
        int mo26554 = this.getOutputMinFrameDuration.mo26554();
        int i = getHighSpeedVideoSizes + 79;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 != 0) {
            return mo26554;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // util.h.xy.ef.ra
    /* renamed from: ˋ */
    public final void mo26556(boolean z, util.h.xy.ef.mb mbVar) throws java.lang.IllegalArgumentException {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = i + 9;
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (!(mbVar instanceof util.h.xy.ep.e)) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(true, new int[]{87, 38, 0, 0}, "\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001", objArr);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
        }
        int i3 = i + 69;
        getHighSpeedVideoSizes = i3 % 128;
        util.h.xy.ep.e eVar = (util.h.xy.ep.e) mbVar;
        if (i3 % 2 != 0) {
            byte[] m26821 = util.h.xy.fb.a.m26821(eVar.m26658());
            this.getInputSizeshNQ4ISI = m26821;
            int length = m26821.length;
            throw null;
        }
        byte[] m268212 = util.h.xy.fb.a.m26821(eVar.m26658());
        this.getInputSizeshNQ4ISI = m268212;
        int i4 = this.getOutputFormats;
        if (i4 < m268212.length) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(true, new int[]{0, 42, 0, 0}, "\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001", objArr2);
            sb.append(((java.lang.String) objArr2[0]).intern());
            sb.append(this.getOutputFormats);
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(false, new int[]{42, 7, 53, 4}, "\u0001\u0001\u0000\u0001\u0000\u0000\u0001", objArr3);
            sb.append(((java.lang.String) objArr3[0]).intern());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        int i5 = i4 / 2;
        if (8 > i5) {
            int i6 = getHighSpeedVideoFpsRangesFor + 117;
            getHighSpeedVideoSizes = i6 % 128;
            if (i6 % 2 != 0) {
                i5 = i4 << 4;
            }
        } else {
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 105) % 128;
            i5 = 8;
        }
        if (i4 - m268212.length <= i5) {
            if (eVar.m26659() != null) {
                getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 71) % 128;
                this.getOutputMinFrameDuration.mo26556(true, eVar.m26659());
            }
            mo26557();
            int i7 = getHighSpeedVideoFpsRangesFor + 31;
            getHighSpeedVideoSizes = i7 % 128;
            if (i7 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
            return;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(false, new int[]{49, 38, 0, 0}, "\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0000", objArr4);
        sb2.append(((java.lang.String) objArr4[0]).intern());
        sb2.append(this.getOutputFormats - i5);
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(false, new int[]{42, 7, 53, 4}, "\u0001\u0001\u0000\u0001\u0000\u0000\u0001", objArr5);
        sb2.append(((java.lang.String) objArr5[0]).intern());
        throw new java.lang.IllegalArgumentException(sb2.toString());
    }

    public d(util.h.xy.ef.ra raVar) {
        super(raVar);
        this.getOutputMinFrameDuration = raVar;
        int mo26554 = raVar.mo26554();
        this.getOutputFormats = mo26554;
        this.getInputSizeshNQ4ISI = new byte[mo26554];
        this.getHighSpeedVideoSizesFor = new byte[mo26554];
        this.getOutputSizes = new byte[mo26554];
        this.getInputFormats = 0;
    }
}
