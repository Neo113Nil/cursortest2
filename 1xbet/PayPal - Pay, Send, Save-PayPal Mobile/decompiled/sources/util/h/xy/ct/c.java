package util.h.xy.ct;

/* loaded from: classes5.dex */
public final class c {
    private static int Camera2StreamConfigurationMap = 0;
    private static char[] getHighResolutionOutputSizeshNQ4ISI = null;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static char getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 1;
    private static final byte[] getHighSpeedVideoSizesFor;
    private static final byte[] getInputFormats;
    private static final byte[] getInputSizeshNQ4ISI;
    private static byte[] getOutputFormats;
    private static final byte[] getOutputMinFrameDuration;
    private static final java.lang.String getOutputMinFrameDurationlomOqCM;
    private static int getOutputSizes;

    static {
        getHighResolutionOutputSizeshNQ4ISI();
        getOutputMinFrameDurationlomOqCM = util.h.xy.ct.c.class.getName();
        getOutputFormats = null;
        getInputFormats = new byte[]{-82, -35, -97, -57, 114, -66, 85, -101, -124, 48, 4, -73, -51, 65, 123, -8, 9, -35, -44, -110, 72, -102, -54, 107, com.visa.cbp.getEncExpo.IResultReceiver2, -97, -74, -21, 97, -42, 38, -98};
        getHighSpeedVideoSizesFor = new byte[]{100, 108, com.google.common.base.Ascii.RS, -110, 83, 13, 104, com.google.common.base.Ascii.RS, com.visa.cbp.getEncExpo.kernelVersion, -14, 125, -52, 8, -94, -4, 86, -53, -118, 57, -92, -63, -86, 63, 85, 83, -77, -58, 16, -82, 93, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy};
        getOutputMinFrameDuration = new byte[]{com.visa.cbp.getEncExpo.IResultReceiver, 88, -39, 42, -56, -7, -4, -97, 105, -27, -98, 73, -37, 111, 35, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.US, com.google.common.base.Ascii.VT, 124, -40, -74, -21, -106, 101, -23, -41, -22, com.google.common.base.Ascii.GS, 7, -44, -126, -23};
        getInputSizeshNQ4ISI = new byte[]{71, com.google.common.base.Ascii.ETB, 6, -120, -50, -38, 40, -19, 39, -51, com.google.common.base.Ascii.SUB, -36, com.google.common.base.Ascii.FF, -30, -19, 72, 5, -19, 59, 74, -77, 3, 19, com.visa.cbp.getEncExpo.registerForActivityResult, 70, 64, 84, -13, 87, -100, -106, 4};
        getOutputSizes = (getHighSpeedVideoSizes + 43) % 128;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static util.h.xy.cs.mb m26039(byte[] bArr, byte[] bArr2, util.h.xy.cp.ma maVar, util.h.xy.ct.mb mbVar) throws util.h.xy.cm.ma {
        if (!util.h.xy.cv.ra.m26070(bArr2)) {
            int i = getOutputSizes + 107;
            getHighSpeedVideoSizes = i % 128;
            if (i % 2 != 0) {
                if (!util.h.xy.cv.ra.m26070(bArr) && maVar != null) {
                    util.h.xy.cs.mb highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(bArr, bArr2, maVar, mbVar);
                    getOutputSizes = (getHighSpeedVideoSizes + 23) % 128;
                    return highSpeedVideoFpsRanges;
                }
            } else {
                util.h.xy.cv.ra.m26070(bArr);
                throw new java.lang.ArithmeticException();
            }
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoSizes((byte) ('M' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), "\u0016\u000b\u001b!\u0019\f\u0018\u000e\u001c\u000b\n\u001e\u000e\r\u0001\u0013\f\u000b!\u0010\r \u001f\u0001\n\u001e\u0019\u000f\u001c\u0005\u0003\u0019\u0010\u001f\u000f\u0018\u0011\u0001\u000f\u000e\u0004\n㘓㘓\u000e\u0011 \u000f\u001f\u0010\u0010\u000f \u0010\"\u0007\u0018\t!\u0010\u000f\u0007\u0006\u0015㗑", 66 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr);
        throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static util.h.xy.cs.mb m26038(byte[] bArr, byte[] bArr2) {
        if (util.h.xy.cv.ra.m26070(bArr2) || util.h.xy.cv.ra.m26070(bArr)) {
            try {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoSizes((byte) (5 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), "\u0016\u000b\u001b!\u000e\r\u0001\u0013\u0018\u000e\u001c\u000b\n\u001e\u0011\u0019\u0005\u0002\u0019\u000f\u001e\u0010\u0019\u000f\u0002\u0011\u0010\u001f\u0003\u0016\u0013\u000f\u000f\"\u0010 \u000e\u0010\u0010 \r \t\u001c\n\u001e\u0010\u000e\u0015\u000b\u0018\u0006", (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22) + 52, objArr);
                throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        return getHighSpeedVideoFpsRanges(bArr, bArr2);
    }

    private static util.h.xy.cs.mb getHighSpeedVideoFpsRanges(byte[] bArr, byte[] bArr2, util.h.xy.cp.ma maVar, util.h.xy.ct.mb mbVar) throws util.h.xy.cm.ma {
        int i = getHighSpeedVideoSizes + 25;
        getOutputSizes = i % 128;
        byte[] bArr3 = new byte[i % 2 != 0 ? (bArr.length >>> getInputFormats.length) >> bArr2.length : bArr.length + getInputFormats.length + bArr2.length];
        int i2 = 0;
        while (true) {
            try {
                byte[] bArr4 = getInputFormats;
                if (i2 >= bArr4.length) {
                    java.lang.System.arraycopy(bArr2, 0, bArr3, bArr4.length, bArr2.length);
                    java.lang.System.arraycopy(bArr, 0, bArr3, bArr4.length + bArr2.length, bArr.length);
                    byte[] m25965 = util.h.xy.cm.mb.m25965(maVar.m25993(mbVar), bArr3, 3);
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    getHighSpeedVideoSizes((byte) (119 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))), "\u0015\b㘿", 3 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr);
                    return new util.h.xy.cs.mb(m25965, ((java.lang.String) objArr[0]).intern(), true);
                }
                int i3 = getOutputSizes + 93;
                getHighSpeedVideoSizes = i3 % 128;
                if (i3 % 2 == 0) {
                    bArr3[i2] = (byte) (bArr4[i2] ^ getHighSpeedVideoSizesFor[i2]);
                    i2 += 101;
                } else {
                    bArr3[i2] = (byte) (bArr4[i2] ^ getHighSpeedVideoSizesFor[i2]);
                    i2++;
                }
            } finally {
                util.h.xy.cv.ra.m26066(bArr3);
            }
        }
    }

    private static util.h.xy.cs.mb getHighSpeedVideoFpsRanges(byte[] bArr, byte[] bArr2) {
        byte[] bArr3;
        byte[] mo26023;
        byte[] bArr4 = new byte[bArr.length + getOutputMinFrameDuration.length + bArr2.length];
        int i = 0;
        while (true) {
            try {
                try {
                    bArr3 = getOutputMinFrameDuration;
                    if (i >= bArr3.length) {
                        break;
                    }
                    bArr4[i] = (byte) (bArr3[i] ^ getInputSizeshNQ4ISI[i]);
                    i++;
                } catch (java.io.IOException e) {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    getHighSpeedVideoSizes((byte) ((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 120), "#\b\u0014\u0013㙗", (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 5, objArr);
                    util.h.xy.am.ma.m25029(((java.lang.String) objArr[0]).intern(), util.h.xy.ch.ma.m25927(e));
                    util.h.xy.cv.ra.m26066(bArr4);
                    util.h.xy.cv.ra.m26066(getOutputFormats);
                    getOutputSizes = (getHighSpeedVideoSizes + 65) % 128;
                    return null;
                }
            } catch (java.lang.Throwable th) {
                util.h.xy.cv.ra.m26066(bArr4);
                util.h.xy.cv.ra.m26066(getOutputFormats);
                throw th;
            }
        }
        java.lang.System.arraycopy(bArr2, 0, bArr4, bArr3.length, bArr2.length);
        java.lang.System.arraycopy(bArr, 0, bArr4, bArr3.length + bArr2.length, bArr.length);
        synchronized (util.h.xy.ct.c.class) {
            try {
                util.h.xy.cs.b m26021 = util.h.xy.cs.a.m26021();
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoSizes((byte) (100 - android.text.TextUtils.indexOf("", "")), "\u0014\u0013", 2 - android.graphics.Color.blue(0), objArr2);
                if (!m26021.mo26025(((java.lang.String) objArr2[0]).intern())) {
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    getHighSpeedVideoSizes((byte) (android.widget.ExpandableListView.getPackedPositionType(0L) + 100), "\u0014\u0013", android.view.View.resolveSize(0, 0) + 2, objArr3);
                    m26021.mo26026(((java.lang.String) objArr3[0]).intern());
                }
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                getHighSpeedVideoSizes((byte) (100 - android.view.View.MeasureSpec.getMode(0)), "\u0014\u0013", (android.view.KeyEvent.getMaxKeyCode() >> 16) + 2, objArr4);
                mo26023 = m26021.mo26023(((java.lang.String) objArr4[0]).intern());
                getOutputFormats = mo26023;
            } catch (util.h.xy.ct.mc e2) {
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                getHighSpeedVideoSizes((byte) (47 - android.view.View.combineMeasuredStates(0, 0)), "#\b\u0015\u0013㘎", 5 - android.view.Gravity.getAbsoluteGravity(0, 0), objArr5);
                util.h.xy.am.ma.m25029(((java.lang.String) objArr5[0]).intern(), util.h.xy.ch.ma.m25927(e2));
            }
            if (mo26023 == null) {
                try {
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    getHighSpeedVideoSizes((byte) ((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 80), "\u0014\f\u0013\u0010\r \u001e\r㘸", 9 - ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6), objArr6);
                    throw new util.h.xy.ct.mc(((java.lang.String) objArr6[0]).intern());
                } catch (java.lang.Throwable th2) {
                    java.lang.Throwable cause = th2.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th2;
                }
            }
        }
        byte[] m25965 = util.h.xy.cm.mb.m25965(getOutputFormats, bArr4, 3);
        java.lang.Object[] objArr7 = new java.lang.Object[1];
        getHighSpeedVideoSizes((byte) ((android.view.ViewConfiguration.getTouchSlop() >> 8) + 118), "\u0015\b㘿", (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 3, objArr7);
        util.h.xy.cs.mb mbVar = new util.h.xy.cs.mb(m25965, ((java.lang.String) objArr7[0]).intern(), true);
        util.h.xy.cv.ra.m26066(bArr4);
        util.h.xy.cv.ra.m26066(getOutputFormats);
        getOutputSizes = (getHighSpeedVideoSizes + 21) % 128;
        return mbVar;
    }

    private static void getHighSpeedVideoSizes(byte b, java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2;
        char[] charArray = str.toCharArray();
        util.h.xz.b.mc mcVar = new util.h.xz.b.mc();
        char[] cArr = getHighResolutionOutputSizeshNQ4ISI;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                cArr2[i3] = (char) (cArr[i3] ^ 4042185467053315654L);
            }
            cArr = cArr2;
        }
        char c = (char) (4042185467053315654L ^ getHighSpeedVideoFpsRangesFor);
        char[] cArr3 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr3[i2] = (char) (charArray[i2] - b);
            getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 65) % 128;
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            mcVar.f2638 = 0;
            while (mcVar.f2638 < i2) {
                Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 23) % 128;
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
                        int i4 = mcVar.f2639;
                        int i5 = mcVar.f2640;
                        int i6 = mcVar.f2637;
                        int i7 = mcVar.f2635;
                        cArr3[mcVar.f2638] = cArr[(i4 * c) + i5];
                        cArr3[mcVar.f2638 + 1] = cArr[(i6 * c) + i7];
                    } else if (mcVar.f2639 == mcVar.f2637) {
                        mcVar.f2640 = ((mcVar.f2640 + c) - 1) % c;
                        mcVar.f2635 = ((mcVar.f2635 + c) - 1) % c;
                        int i8 = mcVar.f2639;
                        int i9 = mcVar.f2640;
                        int i10 = mcVar.f2637;
                        int i11 = mcVar.f2635;
                        cArr3[mcVar.f2638] = cArr[(i8 * c) + i9];
                        cArr3[mcVar.f2638 + 1] = cArr[(i10 * c) + i11];
                    } else {
                        int i12 = mcVar.f2639;
                        int i13 = mcVar.f2635;
                        int i14 = mcVar.f2637;
                        int i15 = mcVar.f2640;
                        cArr3[mcVar.f2638] = cArr[(i12 * c) + i13];
                        cArr3[mcVar.f2638 + 1] = cArr[(i14 * c) + i15];
                    }
                }
                mcVar.f2638 += 2;
            }
        }
        getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 33) % 128;
        for (int i16 = 0; i16 < i; i16++) {
            cArr3[i16] = (char) (cArr3[i16] ^ 13722);
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    private c() {
    }

    static void getHighResolutionOutputSizeshNQ4ISI() {
        getHighResolutionOutputSizeshNQ4ISI = new char[]{41970, 41903, 41983, 41982, 41897, 41918, 41909, 41979, 41969, 41881, 41917, 41883, 41907, 41980, 41913, 41915, 41899, 41914, 41879, 41873, 41885, 41904, 41893, 41871, 41968, 41900, 41912, 41896, 41971, 41905, 41981, 41902, 41870, 41908, 41906, 41978};
        getHighSpeedVideoFpsRangesFor = (char) 38464;
    }
}
