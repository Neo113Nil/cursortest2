package util.h.xy.dh;

/* loaded from: classes5.dex */
public final class ap implements util.h.xy.dh.mb {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoSizes = 1;
    private static int getOutputMinFrameDuration = 1;
    private int getInputFormats = 0;
    private final util.h.xy.dh.ba getOutputFormats;
    private static char[] getHighResolutionOutputSizeshNQ4ISI = {41909, 41908, 41902, 41899, 41968, 41892, 41918, 41905, 41964, 41906, 41900, 41881, 41875, 41916, 41894, 41897, 41963, 41886, 41958, 41030, 41913, 41919, 41907, 41915, 41903, 41896, 41031, 41912, 41893, 41969, 41877, 41904, 41914, 41917, 41980, 41898};
    private static char getHighSpeedVideoFpsRangesFor = 38464;

    private static void getHighResolutionOutputSizeshNQ4ISI(byte b, java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2;
        char[] charArray = str.toCharArray();
        util.h.xz.b.mc mcVar = new util.h.xz.b.mc();
        char[] cArr = getHighResolutionOutputSizeshNQ4ISI;
        if (cArr != null) {
            getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 69) % 128;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i3 = 0;
            while (i3 < length) {
                int i4 = Camera2StreamConfigurationMap + 35;
                getHighSpeedVideoSizes = i4 % 128;
                if (i4 % 2 == 0) {
                    cArr2[i3] = (char) (cArr[i3] & 4042185467053315654L);
                    i3--;
                } else {
                    cArr2[i3] = (char) (cArr[i3] ^ 4042185467053315654L);
                    i3++;
                }
            }
            cArr = cArr2;
        }
        char c = (char) (4042185467053315654L ^ getHighSpeedVideoFpsRangesFor);
        char[] cArr3 = new char[i];
        if (i % 2 != 0) {
            getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 5) % 128;
            i2 = i - 1;
            cArr3[i2] = (char) (charArray[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 89) % 128;
            mcVar.f2638 = 0;
            while (mcVar.f2638 < i2) {
                mcVar.f2641 = charArray[mcVar.f2638];
                mcVar.f2636 = charArray[mcVar.f2638 + 1];
                if (mcVar.f2641 == mcVar.f2636) {
                    cArr3[mcVar.f2638] = (char) (mcVar.f2641 - b);
                    cArr3[mcVar.f2638 + 1] = (char) (mcVar.f2636 - b);
                } else {
                    mcVar.f2639 = mcVar.f2641 / c;
                    mcVar.f2640 = mcVar.f2641 % c;
                    mcVar.f2637 = mcVar.f2636 / c;
                    mcVar.f2635 = mcVar.f2636 % c;
                    if (mcVar.f2640 == mcVar.f2635) {
                        Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 43) % 128;
                        mcVar.f2639 = ((mcVar.f2639 + c) - 1) % c;
                        mcVar.f2637 = ((mcVar.f2637 + c) - 1) % c;
                        int i5 = mcVar.f2639;
                        int i6 = mcVar.f2640;
                        int i7 = mcVar.f2637;
                        int i8 = mcVar.f2635;
                        cArr3[mcVar.f2638] = cArr[(i5 * c) + i6];
                        cArr3[mcVar.f2638 + 1] = cArr[(i7 * c) + i8];
                    } else if (mcVar.f2639 == mcVar.f2637) {
                        getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 81) % 128;
                        mcVar.f2640 = ((mcVar.f2640 + c) - 1) % c;
                        mcVar.f2635 = ((mcVar.f2635 + c) - 1) % c;
                        int i9 = mcVar.f2639;
                        int i10 = mcVar.f2640;
                        int i11 = mcVar.f2637;
                        int i12 = mcVar.f2635;
                        cArr3[mcVar.f2638] = cArr[(i9 * c) + i10];
                        cArr3[mcVar.f2638 + 1] = cArr[(i11 * c) + i12];
                    } else {
                        int i13 = mcVar.f2639;
                        int i14 = mcVar.f2635;
                        int i15 = mcVar.f2637;
                        int i16 = mcVar.f2640;
                        cArr3[mcVar.f2638] = cArr[(i13 * c) + i14];
                        cArr3[mcVar.f2638 + 1] = cArr[(i15 * c) + i16];
                    }
                }
                mcVar.f2638 += 2;
            }
        }
        int i17 = 0;
        while (i17 < i) {
            int i18 = getHighSpeedVideoSizes + 39;
            Camera2StreamConfigurationMap = i18 % 128;
            if (i18 % 2 != 0) {
                cArr3[i17] = (char) (cArr3[i17] ^ 26595);
                i17 += 18;
            } else {
                cArr3[i17] = (char) (cArr3[i17] ^ 13722);
                i17++;
            }
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    @Override // util.h.xy.dh.c
    /* renamed from: ʾ */
    public final util.h.xy.dh.mi mo26279() {
        getHighSpeedVideoFpsRanges = (getOutputMinFrameDuration + 5) % 128;
        try {
            util.h.xy.dh.mi mo26278 = mo26278();
            int i = getHighSpeedVideoFpsRanges + 87;
            getOutputMinFrameDuration = i % 128;
            if (i % 2 != 0) {
                return mo26278;
            }
            throw null;
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI((byte) (42 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16)), "\u0000\u0012\u0011\u000b\u0016\u0015\u0007\u001c\u0004\u0012\n!\u0016\u0017\u000b!\u001a\b\u0018\u0001\u000b\u0015\u001e\u001c\u001a\u0001\u0015 \n\u001f\u001c\u0013\u001e\n\u001d\u001a\u0016  \u0003\u0003 \u0018\u0016㗤", android.widget.ExpandableListView.getPackedPositionGroup(0L) + 45, objArr);
            sb.append(((java.lang.String) objArr[0]).intern());
            sb.append(e.getMessage());
            throw new util.h.xy.dh.ri(sb.toString(), e);
        }
    }

    @Override // util.h.xy.dh.aw
    /* renamed from: ʼ */
    public final util.h.xy.dh.mi mo26278() throws java.io.IOException {
        int i = getHighSpeedVideoFpsRanges + 55;
        getOutputMinFrameDuration = i % 128;
        byte[] highSpeedVideoSizes = this.getOutputFormats.getHighSpeedVideoSizes();
        if (i % 2 != 0) {
            return util.h.xy.dh.ma.getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoSizes);
        }
        util.h.xy.dh.ma.getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoSizes);
        throw new java.lang.ArithmeticException();
    }

    @Override // util.h.xy.dh.mb
    /* renamed from: ʻ, reason: contains not printable characters */
    public final int mo26281() {
        int i = getOutputMinFrameDuration;
        getHighSpeedVideoFpsRanges = (i + 89) % 128;
        int i2 = this.getInputFormats;
        int i3 = i + 83;
        getHighSpeedVideoFpsRanges = i3 % 128;
        if (i3 % 2 == 0) {
            return i2;
        }
        throw null;
    }

    @Override // util.h.xy.dh.mb
    /* renamed from: ͺ, reason: contains not printable characters */
    public final java.io.InputStream mo26282() throws java.io.IOException {
        int i = (getHighSpeedVideoFpsRanges + 107) % 128;
        getOutputMinFrameDuration = i;
        getHighSpeedVideoFpsRanges = (i + 51) % 128;
        int highSpeedVideoFpsRangesFor = this.getOutputFormats.getHighSpeedVideoFpsRangesFor();
        if (highSpeedVideoFpsRangesFor <= 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI((byte) (85 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16)), "\u0016\u0017\u0007\u001b\u0015\b\u001c\u001f\u0017\u0016\u001a\u0013\u001a\u0019!\u0016\u0003\u000f\n\u0015\u001c\u001f\b\u0012 \u0016\b\u000b\u001a\u001d", 30 - (android.view.ViewConfiguration.getTapTimeout() >> 16), objArr);
            throw new java.lang.IllegalStateException(((java.lang.String) objArr[0]).intern());
        }
        int read = this.getOutputFormats.read();
        this.getInputFormats = read;
        if (read > 0) {
            getOutputMinFrameDuration = (getHighSpeedVideoFpsRanges + 121) % 128;
            if (highSpeedVideoFpsRangesFor < 2) {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI((byte) (68 - (android.view.ViewConfiguration.getEdgeSlop() >> 16)), "\u0014\u001a\u0004\u0014# \u0015\b\u0013\u001d\u0004\u001f!\u0003\u001b\u001f!\u0004\u0001\u0018\u0004\u001f\n\u0015\u000b\u001b\u0014\u001a\u0004\u0014\u0004\u0010\u0003!\u001e\n\u0001\u0018㘭", 38 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr2);
                throw new java.lang.IllegalStateException(((java.lang.String) objArr2[0]).intern());
            }
            if (read > 7) {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI((byte) (97 - android.view.KeyEvent.getDeadChar(0, 0)), "\t\"\u001c!\f\u0006\u001a\u0019!\u0016\u0003\u000f\n\u0015\u001c\u001f\b\u0012#\u0016\b\u001a\u001f\u001b\u001a\b\u001f\u001c\u0003\u001f\n!\u0016\u0004\u0014\u0004# \u0012\u001a\u001c\u001e\u001f\u0007\u0003\u000f \n", 48 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), objArr3);
                throw new java.lang.IllegalStateException(((java.lang.String) objArr3[0]).intern());
            }
        }
        util.h.xy.dh.ba baVar = this.getOutputFormats;
        int i2 = getOutputMinFrameDuration;
        getHighSpeedVideoFpsRanges = (i2 + 47) % 128;
        getHighSpeedVideoFpsRanges = (i2 + 25) % 128;
        return baVar;
    }

    ap(util.h.xy.dh.ba baVar) {
        this.getOutputFormats = baVar;
    }
}
