package util.h.xy.ep;

/* loaded from: classes18.dex */
public class b implements util.h.xy.ef.mb {
    private static byte[] Camera2StreamConfigurationMap = {-120, 59, -39, -60, 47, 32, -36, com.google.common.base.Ascii.EM, -100, 18, -12, -54, Byte.MAX_VALUE, -53, 43, -46, 45, -53, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, -117, 116, -39, 38, -48, -107, 116, -45, -111, 44, 16, 39, 36, -37, 37, -34, 38, 45, 37, -117, 99, 40, -47, -45, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -114, 108, -108, 106, -47, 37, 41, 40, -47, -45, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -114, 107, -107, 106, -43, 33, 44, -116, 117, -40, -42, 33, -108, 99, -37, -102, 116, -35, -39, -106, Byte.MAX_VALUE, com.visa.cbp.getEncExpo.startTransaction, 44, -107, 116, -45, -111, 44, 16, 39, 36, -37, 37, -34, 38, 45, 37, -117, 99, 40, -47, -45, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -114, 108, -108, 106, -47, 37, 41, 40, -47, -45, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, com.visa.cbp.getEncExpo.kernelVersion, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, -55, 34, 39, -35, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, -35, 33, -50, 48, -48, -37, -40, -45, -21, com.google.common.base.Ascii.RS, -36, -18, 17, 33, 32, -39, -54, 38, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, -50, 45, 33, -34, -43, -20, com.google.common.base.Ascii.US, 45, -37, 39, 43, -47, 44, -36, -44, 43, -118, 108, -108, 101, 34, -37, 37, -34, 38, 45, 37, -117, 108, -40, -45, 44, 34, -117, 105, 36, -117, 99, 40, -47, -45, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -114, 104, -120, 99, 39, -35, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, -35, 33, -40, -40, -40, -40};
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges = -455813435;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 1;
    private static int getHighSpeedVideoSizesFor = -408873007;
    private static int getInputSizeshNQ4ISI = 655022109;
    private static short[] getOutputFormats;
    private static int getOutputMinFrameDuration;
    private int getInputFormats;
    private java.math.BigInteger getOutputMinFrameDurationlomOqCM;
    private java.math.BigInteger getOutputSizes;
    private int getOutputSizeshNQ4ISI;
    private java.math.BigInteger getOutputStallDuration;
    private util.h.xy.ep.rc getOutputStallDurationlomOqCM;
    private java.math.BigInteger toString;

    private static void Camera2StreamConfigurationMap(int i, short s, byte b, int i2, int i3, java.lang.Object[] objArr) {
        int i4;
        util.h.xz.b.me meVar = new util.h.xz.b.me();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i5 = i2 + ((int) (getHighSpeedVideoSizesFor ^ (-2689713159175858216L)));
        boolean z = i5 == -1;
        if (z) {
            byte[] bArr = Camera2StreamConfigurationMap;
            if (bArr != null) {
                getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 21) % 128;
                int length = bArr.length;
                byte[] bArr2 = new byte[length];
                for (int i6 = 0; i6 < length; i6++) {
                    getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 87) % 128;
                    bArr2[i6] = (byte) (bArr[i6] ^ (-2689713159175858216L));
                }
                bArr = bArr2;
            }
            if (bArr != null) {
                getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 113) % 128;
                i5 = (byte) (((byte) (Camera2StreamConfigurationMap[((int) (getHighSpeedVideoFpsRanges ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getHighSpeedVideoSizesFor ^ (-2689713159175858216L))));
            } else {
                i5 = (short) (((short) (getOutputFormats[((int) (getHighSpeedVideoFpsRanges ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getHighSpeedVideoSizesFor ^ (-2689713159175858216L))));
            }
        }
        if (i5 > 0) {
            int i7 = (int) (getHighSpeedVideoFpsRanges ^ (-2689713159175858216L));
            if (z) {
                i4 = 1;
            } else {
                getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 15) % 128;
                i4 = 0;
            }
            meVar.f2647 = ((i + i5) - 2) + i7 + i4;
            meVar.f2644 = (char) (i3 + ((int) (getInputSizeshNQ4ISI ^ (-2689713159175858216L))));
            sb.append(meVar.f2644);
            meVar.f2646 = meVar.f2644;
            byte[] bArr3 = Camera2StreamConfigurationMap;
            if (bArr3 != null) {
                int length2 = bArr3.length;
                byte[] bArr4 = new byte[length2];
                for (int i8 = 0; i8 < length2; i8++) {
                    bArr4[i8] = (byte) (bArr3[i8] ^ (-2689713159175858216L));
                }
                bArr3 = bArr4;
            }
            boolean z2 = bArr3 != null;
            meVar.f2645 = 1;
            while (meVar.f2645 < i5) {
                if (z2) {
                    byte[] bArr5 = Camera2StreamConfigurationMap;
                    meVar.f2647 = meVar.f2647 - 1;
                    meVar.f2644 = (char) (meVar.f2646 + (((byte) (((byte) (bArr5[r9] ^ (-2689713159175858216L))) + s)) ^ b));
                } else {
                    short[] sArr = getOutputFormats;
                    meVar.f2647 = meVar.f2647 - 1;
                    meVar.f2644 = (char) (meVar.f2646 + (((short) (((short) (sArr[r9] ^ (-2689713159175858216L))) + s)) ^ b));
                }
                sb.append(meVar.f2644);
                meVar.f2646 = meVar.f2644;
                meVar.f2645++;
                getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 5) % 128;
            }
        }
        objArr[0] = sb.toString();
    }

    public int hashCode() {
        int i;
        int i2 = getOutputMinFrameDuration + 25;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            m26651().hashCode();
            m26649().hashCode();
            m26650();
            throw null;
        }
        int hashCode = m26651().hashCode();
        int hashCode2 = m26649().hashCode();
        if (m26650() != null) {
            i = m26650().hashCode();
        } else {
            getHighResolutionOutputSizeshNQ4ISI = (getOutputMinFrameDuration + 85) % 128;
            i = 0;
        }
        return (hashCode ^ hashCode2) ^ i;
    }

    public boolean equals(java.lang.Object obj) {
        int i;
        if (obj instanceof util.h.xy.ep.b) {
            util.h.xy.ep.b bVar = (util.h.xy.ep.b) obj;
            if (m26650() != null) {
                getHighResolutionOutputSizeshNQ4ISI = (getOutputMinFrameDuration + 111) % 128;
                if (!m26650().equals(bVar.m26650())) {
                    i = getOutputMinFrameDuration + 25;
                }
            } else if (bVar.m26650() != null) {
                int i2 = getOutputMinFrameDuration + 3;
                getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
                if (i2 % 2 != 0) {
                    return false;
                }
                throw null;
            }
            if (bVar.m26651().equals(this.getOutputStallDuration)) {
                int i3 = getHighResolutionOutputSizeshNQ4ISI + 85;
                getOutputMinFrameDuration = i3 % 128;
                java.math.BigInteger m26649 = bVar.m26649();
                if (i3 % 2 != 0) {
                    m26649.equals(this.getOutputMinFrameDurationlomOqCM);
                    throw null;
                }
                if (m26649.equals(this.getOutputMinFrameDurationlomOqCM)) {
                    int i4 = getOutputMinFrameDuration + 31;
                    getHighResolutionOutputSizeshNQ4ISI = i4 % 128;
                    return i4 % 2 != 0;
                }
            }
            return false;
        }
        i = getOutputMinFrameDuration + 1;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        return false;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public java.math.BigInteger m26650() {
        int i = getHighResolutionOutputSizeshNQ4ISI + 43;
        getOutputMinFrameDuration = i % 128;
        java.math.BigInteger bigInteger = this.getOutputSizes;
        if (i % 2 == 0) {
            return bigInteger;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public java.math.BigInteger m26649() {
        int i = getOutputMinFrameDuration + 47;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            return this.getOutputMinFrameDurationlomOqCM;
        }
        throw null;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public java.math.BigInteger m26651() {
        int i = getOutputMinFrameDuration;
        getHighResolutionOutputSizeshNQ4ISI = (i + 75) % 128;
        java.math.BigInteger bigInteger = this.getOutputStallDuration;
        int i2 = i + 29;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            return bigInteger;
        }
        throw null;
    }

    public b(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, java.math.BigInteger bigInteger3, int i, int i2, java.math.BigInteger bigInteger4, util.h.xy.ep.rc rcVar) {
        if (i2 != 0) {
            if (i2 > bigInteger.bitLength()) {
                int edgeSlop = android.view.ViewConfiguration.getEdgeSlop();
                java.lang.Object[] objArr = new java.lang.Object[1];
                Camera2StreamConfigurationMap((-58048797) - (edgeSlop >> 16), (short) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 1), (byte) (android.view.ViewConfiguration.getScrollBarSize() >> 8), 44 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 1062482098 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr);
                throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
            }
            if (i2 < i) {
                int pressedStateDuration = android.view.ViewConfiguration.getPressedStateDuration();
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                Camera2StreamConfigurationMap((-58048746) - (pressedStateDuration >> 16), (short) android.graphics.Color.red(0), (byte) android.graphics.Color.argb(0, 0, 0, 0), ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 47, android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 12418, objArr2);
                throw new java.lang.IllegalArgumentException(((java.lang.String) objArr2[0]).intern());
            }
        }
        if (i > bigInteger.bitLength()) {
            double convertQuartSecToDecDegrees = android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0);
            try {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                Camera2StreamConfigurationMap((-58048692) - (convertQuartSecToDecDegrees > 0.0d ? 1 : (convertQuartSecToDecDegrees == 0.0d ? 0 : -1)), (short) (android.view.MotionEvent.axisFromString("") + 1), (byte) (1 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), android.text.TextUtils.getTrimmedLength("") + 31, 1062482091 - (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)), objArr3);
                if (!util.h.xy.fb.rc.m26853(((java.lang.String) objArr3[0]).intern())) {
                    int lastIndexOf = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    Camera2StreamConfigurationMap(lastIndexOf - 58048652, (short) android.graphics.Color.red(0), (byte) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1), android.graphics.Color.alpha(0) + 34, 1062482096 - android.text.TextUtils.getOffsetBefore("", 0), objArr4);
                    throw new java.lang.IllegalArgumentException(((java.lang.String) objArr4[0]).intern());
                }
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        this.getOutputMinFrameDurationlomOqCM = bigInteger2;
        this.getOutputStallDuration = bigInteger;
        this.getOutputSizes = bigInteger3;
        this.getOutputSizeshNQ4ISI = i;
        this.getInputFormats = i2;
        this.toString = bigInteger4;
        this.getOutputStallDurationlomOqCM = rcVar;
    }
}
