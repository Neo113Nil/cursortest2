package util.h.xy.dh;

/* loaded from: classes5.dex */
final class u extends java.io.InputStream {
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoFpsRangesFor;
    private static int getInputFormats;
    private final util.h.xy.dh.rm getHighSpeedVideoSizesFor;
    private java.io.InputStream getInputSizeshNQ4ISI;
    private boolean getOutputFormats = true;
    private static char[] Camera2StreamConfigurationMap = {41911, 41896, 41980, 41919, 41909, 41897, 41918, 41910, 41908, 41912, 41899, 41902, 41958, 41907, 41913, 41906};
    private static char getHighSpeedVideoSizes = 38466;

    private static void getHighSpeedVideoSizes(byte b, java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2;
        int i3 = getHighSpeedVideoFpsRanges + 125;
        getHighSpeedVideoFpsRangesFor = i3 % 128;
        if (i3 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        char[] charArray = str.toCharArray();
        util.h.xz.b.mc mcVar = new util.h.xz.b.mc();
        char[] cArr = Camera2StreamConfigurationMap;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 93) % 128;
            for (int i4 = 0; i4 < length; i4++) {
                cArr2[i4] = (char) (cArr[i4] ^ 4042185467053315654L);
            }
            cArr = cArr2;
        }
        char c = (char) (4042185467053315654L ^ getHighSpeedVideoSizes);
        char[] cArr3 = new char[i];
        if (i % 2 != 0) {
            int i5 = getHighSpeedVideoFpsRanges + 33;
            getHighSpeedVideoFpsRangesFor = i5 % 128;
            if (i5 % 2 != 0) {
                i2 = i + 32;
                cArr3[i2] = (char) (charArray[i2] >>> b);
            } else {
                i2 = i - 1;
                cArr3[i2] = (char) (charArray[i2] - b);
            }
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            mcVar.f2638 = 0;
            while (mcVar.f2638 < i2) {
                getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 29) % 128;
                mcVar.f2641 = charArray[mcVar.f2638];
                mcVar.f2636 = charArray[mcVar.f2638 + 1];
                if (mcVar.f2641 == mcVar.f2636) {
                    int i6 = getHighSpeedVideoFpsRanges + 19;
                    getHighSpeedVideoFpsRangesFor = i6 % 128;
                    if (i6 % 2 != 0) {
                        cArr3[mcVar.f2638] = (char) (mcVar.f2641 << b);
                        cArr3[mcVar.f2638 >> 1] = (char) (mcVar.f2636 * b);
                    } else {
                        cArr3[mcVar.f2638] = (char) (mcVar.f2641 - b);
                        cArr3[mcVar.f2638 + 1] = (char) (mcVar.f2636 - b);
                    }
                } else {
                    mcVar.f2639 = mcVar.f2641 / c;
                    mcVar.f2640 = mcVar.f2641 % c;
                    mcVar.f2637 = mcVar.f2636 / c;
                    mcVar.f2635 = mcVar.f2636 % c;
                    if (mcVar.f2640 == mcVar.f2635) {
                        mcVar.f2639 = ((mcVar.f2639 + c) - 1) % c;
                        mcVar.f2637 = ((mcVar.f2637 + c) - 1) % c;
                        int i7 = mcVar.f2639;
                        int i8 = mcVar.f2640;
                        int i9 = mcVar.f2637;
                        int i10 = mcVar.f2635;
                        cArr3[mcVar.f2638] = cArr[(i7 * c) + i8];
                        cArr3[mcVar.f2638 + 1] = cArr[(i9 * c) + i10];
                        getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 115) % 128;
                    } else if (mcVar.f2639 == mcVar.f2637) {
                        mcVar.f2640 = ((mcVar.f2640 + c) - 1) % c;
                        mcVar.f2635 = ((mcVar.f2635 + c) - 1) % c;
                        int i11 = mcVar.f2639;
                        int i12 = mcVar.f2640;
                        int i13 = mcVar.f2637;
                        int i14 = mcVar.f2635;
                        cArr3[mcVar.f2638] = cArr[(i11 * c) + i12];
                        cArr3[mcVar.f2638 + 1] = cArr[(i13 * c) + i14];
                    } else {
                        int i15 = mcVar.f2639;
                        int i16 = mcVar.f2635;
                        int i17 = mcVar.f2637;
                        int i18 = mcVar.f2640;
                        cArr3[mcVar.f2638] = cArr[(i15 * c) + i16];
                        cArr3[mcVar.f2638 + 1] = cArr[(i17 * c) + i18];
                    }
                }
                mcVar.f2638 += 2;
                getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 23) % 128;
            }
        }
        for (int i19 = 0; i19 < i; i19++) {
            cArr3[i19] = (char) (cArr3[i19] ^ 13722);
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    private util.h.xy.dh.mj getHighSpeedVideoFpsRanges() throws java.io.IOException {
        util.h.xy.dh.c m26346 = this.getHighSpeedVideoSizesFor.m26346();
        if (m26346 == null) {
            return null;
        }
        if (!(m26346 instanceof util.h.xy.dh.mj)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes((byte) ((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 28), "\u0007\r\u0003\f\u000e\t\u000e\u0003\u000e\u0005\u0006\u000f\u0000\u0002\u0006\u0002\u0003\u0007\u0001\t\r\u0003\u000f\n\r\n\u000e\u0000", 27 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr);
            sb.append(((java.lang.String) objArr[0]).intern());
            sb.append(m26346.getClass());
            throw new java.io.IOException(sb.toString());
        }
        int i = (getInputFormats + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i;
        util.h.xy.dh.mj mjVar = (util.h.xy.dh.mj) m26346;
        int i2 = i + 51;
        getInputFormats = i2 % 128;
        if (i2 % 2 == 0) {
            return mjVar;
        }
        throw null;
    }

    @Override // java.io.InputStream
    public final int read() throws java.io.IOException {
        int i = getInputFormats;
        getHighResolutionOutputSizeshNQ4ISI = (i + 89) % 128;
        if (this.getInputSizeshNQ4ISI == null) {
            if (!this.getOutputFormats) {
                int i2 = i + 75;
                getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
                if (i2 % 2 != 0) {
                    return -1;
                }
                throw new java.lang.ArithmeticException();
            }
            util.h.xy.dh.mj highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
            if (highSpeedVideoFpsRanges == null) {
                int i3 = getInputFormats + 47;
                getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
                if (i3 % 2 != 0) {
                    return -1;
                }
                throw null;
            }
            this.getOutputFormats = false;
            this.getInputSizeshNQ4ISI = highSpeedVideoFpsRanges.mo26280();
        }
        while (true) {
            int read = this.getInputSizeshNQ4ISI.read();
            if (read >= 0) {
                return read;
            }
            util.h.xy.dh.mj highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges();
            if (highSpeedVideoFpsRanges2 == null) {
                this.getInputSizeshNQ4ISI = null;
                return -1;
            }
            this.getInputSizeshNQ4ISI = highSpeedVideoFpsRanges2.mo26280();
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        int i3 = 0;
        if (this.getInputSizeshNQ4ISI == null) {
            if (!this.getOutputFormats) {
                int i4 = getHighResolutionOutputSizeshNQ4ISI + 99;
                getInputFormats = i4 % 128;
                if (i4 % 2 == 0) {
                    return -1;
                }
                throw null;
            }
            util.h.xy.dh.mj highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
            if (highSpeedVideoFpsRanges == null) {
                return -1;
            }
            this.getOutputFormats = false;
            this.getInputSizeshNQ4ISI = highSpeedVideoFpsRanges.mo26280();
        }
        getHighResolutionOutputSizeshNQ4ISI = (getInputFormats + 105) % 128;
        while (true) {
            int read = this.getInputSizeshNQ4ISI.read(bArr, i + i3, i2 - i3);
            if (read >= 0) {
                i3 += read;
                if (i3 == i2) {
                    getInputFormats = (getHighResolutionOutputSizeshNQ4ISI + 85) % 128;
                    return i3;
                }
            } else {
                util.h.xy.dh.mj highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges();
                if (highSpeedVideoFpsRanges2 == null) {
                    int i5 = getInputFormats;
                    int i6 = i5 + 125;
                    getHighResolutionOutputSizeshNQ4ISI = i6 % 128;
                    this.getInputSizeshNQ4ISI = null;
                    if (i6 % 2 == 0) {
                        if (i3 > 0) {
                            return i3;
                        }
                    } else if (i3 > 0) {
                        return i3;
                    }
                    getHighResolutionOutputSizeshNQ4ISI = (i5 + 63) % 128;
                    return -1;
                }
                this.getInputSizeshNQ4ISI = highSpeedVideoFpsRanges2.mo26280();
            }
        }
    }

    u(util.h.xy.dh.rm rmVar) {
        this.getHighSpeedVideoSizesFor = rmVar;
    }
}
