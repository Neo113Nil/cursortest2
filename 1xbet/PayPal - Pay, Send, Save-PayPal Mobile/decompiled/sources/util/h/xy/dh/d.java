package util.h.xy.dh;

/* loaded from: classes5.dex */
public final class d {
    static int Camera2StreamConfigurationMap = 0;
    static final util.h.xy.dh.c[] getHighSpeedVideoFpsRanges;
    static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getInputFormats = 1;
    private static int getInputSizeshNQ4ISI;
    private static char getOutputFormats;
    private static char[] getOutputMinFrameDuration;
    util.h.xy.dh.c[] getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoSizes;
    private boolean getHighSpeedVideoSizesFor;

    private static void getHighSpeedVideoSizes(byte b, java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2;
        getInputSizeshNQ4ISI = (getInputFormats + 125) % 128;
        char[] charArray = str.toCharArray();
        util.h.xz.b.mc mcVar = new util.h.xz.b.mc();
        char[] cArr = getOutputMinFrameDuration;
        if (cArr != null) {
            getInputFormats = (getInputSizeshNQ4ISI + 101) % 128;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                cArr2[i3] = (char) (cArr[i3] ^ 4042185467053315654L);
            }
            cArr = cArr2;
        }
        char c = (char) (4042185467053315654L ^ getOutputFormats);
        char[] cArr3 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr3[i2] = (char) (charArray[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            mcVar.f2638 = 0;
            int i4 = getInputFormats + 55;
            getInputSizeshNQ4ISI = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 3 / 4;
            }
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
                        mcVar.f2639 = ((mcVar.f2639 + c) - 1) % c;
                        mcVar.f2637 = ((mcVar.f2637 + c) - 1) % c;
                        int i6 = mcVar.f2639;
                        int i7 = mcVar.f2640;
                        int i8 = mcVar.f2637;
                        int i9 = mcVar.f2635;
                        cArr3[mcVar.f2638] = cArr[(i6 * c) + i7];
                        cArr3[mcVar.f2638 + 1] = cArr[(i8 * c) + i9];
                    } else if (mcVar.f2639 == mcVar.f2637) {
                        mcVar.f2640 = ((mcVar.f2640 + c) - 1) % c;
                        mcVar.f2635 = ((mcVar.f2635 + c) - 1) % c;
                        int i10 = mcVar.f2639;
                        int i11 = mcVar.f2640;
                        int i12 = mcVar.f2637;
                        int i13 = mcVar.f2635;
                        cArr3[mcVar.f2638] = cArr[(i10 * c) + i11];
                        cArr3[mcVar.f2638 + 1] = cArr[(i12 * c) + i13];
                    } else {
                        int i14 = mcVar.f2639;
                        int i15 = mcVar.f2635;
                        int i16 = mcVar.f2637;
                        int i17 = mcVar.f2640;
                        cArr3[mcVar.f2638] = cArr[(i14 * c) + i15];
                        cArr3[mcVar.f2638 + 1] = cArr[(i16 * c) + i17];
                    }
                }
                mcVar.f2638 += 2;
            }
        }
        for (int i18 = 0; i18 < i; i18++) {
            cArr3[i18] = (char) (cArr3[i18] ^ 13722);
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static {
        getHighResolutionOutputSizeshNQ4ISI();
        getHighSpeedVideoFpsRanges = new util.h.xy.dh.c[0];
        int i = getHighSpeedVideoFpsRangesFor + 1;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    static util.h.xy.dh.c[] getHighSpeedVideoFpsRangesFor(util.h.xy.dh.c[] cVarArr) {
        util.h.xy.dh.c[] cVarArr2;
        if (cVarArr.length <= 0) {
            int i = (Camera2StreamConfigurationMap + 51) % 128;
            getHighSpeedVideoFpsRangesFor = i;
            cVarArr2 = getHighSpeedVideoFpsRanges;
            int i2 = i + 95;
            Camera2StreamConfigurationMap = i2 % 128;
            int i3 = i2 % 2;
        } else {
            cVarArr2 = (util.h.xy.dh.c[]) cVarArr.clone();
        }
        int i4 = Camera2StreamConfigurationMap + 47;
        getHighSpeedVideoFpsRangesFor = i4 % 128;
        if (i4 % 2 != 0) {
            return cVarArr2;
        }
        throw null;
    }

    final util.h.xy.dh.c[] getHighSpeedVideoFpsRangesFor() {
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 35) % 128;
            return getHighSpeedVideoFpsRanges;
        }
        util.h.xy.dh.c[] cVarArr = this.getHighResolutionOutputSizeshNQ4ISI;
        if (cVarArr.length != i) {
            util.h.xy.dh.c[] cVarArr2 = new util.h.xy.dh.c[i];
            java.lang.System.arraycopy(cVarArr, 0, cVarArr2, 0, i);
            getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 125) % 128;
            return cVarArr2;
        }
        int i2 = getHighSpeedVideoFpsRangesFor + 15;
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 != 0) {
            this.getHighSpeedVideoSizesFor = false;
            return cVarArr;
        }
        this.getHighSpeedVideoSizesFor = true;
        return cVarArr;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final int m26288() {
        int i = getHighSpeedVideoFpsRangesFor;
        Camera2StreamConfigurationMap = (i + 115) % 128;
        int i2 = this.getHighSpeedVideoSizes;
        int i3 = i + 81;
        Camera2StreamConfigurationMap = i3 % 128;
        if (i3 % 2 == 0) {
            return i2;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final util.h.xy.dh.c m26289(int i) {
        int i2 = getHighSpeedVideoFpsRangesFor;
        Camera2StreamConfigurationMap = (i2 + 21) % 128;
        if (i < this.getHighSpeedVideoSizes) {
            util.h.xy.dh.c cVar = this.getHighResolutionOutputSizeshNQ4ISI[i];
            int i3 = i2 + 87;
            Camera2StreamConfigurationMap = i3 % 128;
            if (i3 % 2 == 0) {
                return cVar;
            }
            throw null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(i);
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoSizes((byte) ((android.view.ViewConfiguration.getTouchSlop() >> 8) + 96), "\u0011\u0018\u0013\u000f", 4 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr);
        sb.append(((java.lang.String) objArr[0]).intern());
        sb.append(this.getHighSpeedVideoSizes);
        throw new java.lang.ArrayIndexOutOfBoundsException(sb.toString());
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m26290(util.h.xy.dh.c cVar) {
        int i = Camera2StreamConfigurationMap + 15;
        int i2 = i % 128;
        getHighSpeedVideoFpsRangesFor = i2;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        if (cVar == null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes((byte) (93 - android.text.TextUtils.indexOf("", "", 0)), "\u0010\u0011\u0015\u000f\u0010\u0015\u0015\u0003\u0010\u000f\n\u000b㙑㙑\u0001\u0006\u0011\u0004\u0011\u000f\u0003\u0012㙓㙓", 24 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
            throw new java.lang.NullPointerException(((java.lang.String) objArr[0]).intern());
        }
        util.h.xy.dh.c[] cVarArr = this.getHighResolutionOutputSizeshNQ4ISI;
        int length = cVarArr.length;
        int i3 = this.getHighSpeedVideoSizes + 1;
        if ((i3 > length) | this.getHighSpeedVideoSizesFor) {
            int i4 = i2 + 5;
            Camera2StreamConfigurationMap = i4 % 128;
            Camera2StreamConfigurationMap = (i2 + 59) % 128;
            util.h.xy.dh.c[] cVarArr2 = new util.h.xy.dh.c[java.lang.Math.max(cVarArr.length, (i3 >> 1) + i3)];
            java.lang.System.arraycopy(this.getHighResolutionOutputSizeshNQ4ISI, 0, cVarArr2, 0, this.getHighSpeedVideoSizes);
            this.getHighResolutionOutputSizeshNQ4ISI = cVarArr2;
            this.getHighSpeedVideoSizesFor = false;
            getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 107) % 128;
            if (i4 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
        }
        this.getHighResolutionOutputSizeshNQ4ISI[this.getHighSpeedVideoSizes] = cVar;
        this.getHighSpeedVideoSizes = i3;
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 77) % 128;
    }

    public d(int i) {
        if (i < 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes((byte) (30 - android.text.TextUtils.getOffsetBefore("", 0)), "\u0012\u0000\u0003\b\u0002\u0004\u000f\u0000\u0014\u000e\u0000\u000e\r\u0004\u0002\u0010\u0010\u000f\f\u000e\u0006\u0003\u0012\u0018\u0001\u0006\u0011\u0004\u0011\u000f\u0015\u0012\u0005\f\u0002\u0004\u0001\u000f", (android.view.ViewConfiguration.getTouchSlop() >> 8) + 38, objArr);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
        }
        this.getHighResolutionOutputSizeshNQ4ISI = i == 0 ? getHighSpeedVideoFpsRanges : new util.h.xy.dh.c[i];
        this.getHighSpeedVideoSizes = 0;
        this.getHighSpeedVideoSizesFor = false;
    }

    public d() {
        this(10);
    }

    static void getHighResolutionOutputSizeshNQ4ISI() {
        getOutputMinFrameDuration = new char[]{41898, 41896, 41918, 41909, 41900, 41910, 41899, 41915, 41903, 41911, 41917, 41905, 41908, 41897, 41919, 41979, 41913, 41893, 41953, 41980, 41904, 41907, 41954, 41906, 41887};
        getOutputFormats = (char) 38467;
    }
}
