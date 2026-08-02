package util.h.xy.ej;

/* loaded from: classes18.dex */
public final class ra extends util.h.xy.ej.a {
    private static int Camera2StreamConfigurationMap = 14295483;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoFpsRangesFor = -408873039;
    private static short[] getHighSpeedVideoSizes = null;
    private static int getHighSpeedVideoSizesFor = 0;
    private static byte[] getInputSizeshNQ4ISI = {com.google.common.base.Ascii.EM, 17, -17, 78, -23, com.google.common.base.Ascii.EM, -25, -85, 89, -29, com.google.common.base.Ascii.GS, com.visa.cbp.getEncExpo.onUnminimized, -20, -29, -58, 83, com.google.common.base.Ascii.EM, -74, 94, com.google.common.base.Ascii.GS, 16, -30, com.visa.cbp.getEncExpo.onUnminimized, 19, -78, 76, -17, 19, -19, com.google.common.base.Ascii.SUB, -18, 13, -13, 19, -78, 94, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.US, -23, 9, -22, -25, 111, -105, 34, -35, -41, 59, 110, com.visa.cbp.getEncExpo.startTransaction, 46, 62, -126, 47, 99, -58, 41, kotlin.io.encoding.Base64.padSymbol, -105, 47, 110, Byte.MIN_VALUE, 45, -46, 36, 97, -105, -57, kotlin.io.encoding.Base64.padSymbol, -38, Byte.MAX_VALUE, -117, 56, -42, 108, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, -83, 85, -94, 84, -89, -86, 84, -92, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, com.google.common.base.Ascii.SYN, -13, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, 94, 17, -28, -88, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, 93, -90, 86, com.google.common.base.Ascii.SUB, -28, 94, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, 77, 81, 94, 117, -5, -6, -2, com.google.common.base.Ascii.FF, -86, 72, -7, 2, -83, 87, -12, 6, -7, 8, -22, -69, 85, 6, -4, -5, -4, 118, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, 48, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -58, com.visa.cbp.getEncExpo.IResultReceiver2, -126, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -56, 103, -99, 62, -52, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -62, 32, 113, -97, -52, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, com.visa.cbp.getEncExpo.kernelVersion, -52, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE};
    private static int getOutputFormats = 292131448;
    private static int getOutputMinFrameDuration = 1;
    private boolean getOutputSizes;
    private int[] getOutputMinFrameDurationlomOqCM = null;
    private int[] getInputFormats = null;
    private int[] getOutputStallDurationlomOqCM = null;

    private static void getHighSpeedVideoFpsRangesFor(int i, short s, byte b, int i2, int i3, java.lang.Object[] objArr) {
        int i4;
        boolean z;
        util.h.xz.b.me meVar = new util.h.xz.b.me();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i5 = i2 + ((int) (getHighSpeedVideoFpsRangesFor ^ (-2689713159175858216L)));
        boolean z2 = i5 == -1;
        if (z2) {
            byte[] bArr = getInputSizeshNQ4ISI;
            if (bArr != null) {
                int length = bArr.length;
                byte[] bArr2 = new byte[length];
                for (int i6 = 0; i6 < length; i6++) {
                    getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 9) % 128;
                    bArr2[i6] = (byte) (bArr[i6] ^ (-2689713159175858216L));
                }
                bArr = bArr2;
            }
            i5 = bArr != null ? (byte) (((byte) (getInputSizeshNQ4ISI[((int) (getOutputFormats ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getHighSpeedVideoFpsRangesFor ^ (-2689713159175858216L)))) : (short) (((short) (getHighSpeedVideoSizes[((int) (getOutputFormats ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getHighSpeedVideoFpsRangesFor ^ (-2689713159175858216L))));
        }
        if (i5 > 0) {
            int i7 = getHighSpeedVideoFpsRanges;
            getHighResolutionOutputSizeshNQ4ISI = (i7 + 79) % 128;
            int i8 = (int) (getOutputFormats ^ (-2689713159175858216L));
            if (z2) {
                getHighResolutionOutputSizeshNQ4ISI = (i7 + 97) % 128;
                i4 = 1;
            } else {
                i4 = 0;
            }
            meVar.f2647 = ((i + i5) - 2) + i8 + i4;
            meVar.f2644 = (char) (i3 + ((int) (Camera2StreamConfigurationMap ^ (-2689713159175858216L))));
            sb.append(meVar.f2644);
            meVar.f2646 = meVar.f2644;
            byte[] bArr3 = getInputSizeshNQ4ISI;
            if (bArr3 != null) {
                getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 61) % 128;
                int length2 = bArr3.length;
                byte[] bArr4 = new byte[length2];
                for (int i9 = 0; i9 < length2; i9++) {
                    getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 107) % 128;
                    bArr4[i9] = (byte) (bArr3[i9] ^ (-2689713159175858216L));
                }
                bArr3 = bArr4;
            }
            if (bArr3 != null) {
                getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 87) % 128;
                z = true;
            } else {
                z = false;
            }
            meVar.f2645 = 1;
            while (meVar.f2645 < i5) {
                if (z) {
                    byte[] bArr5 = getInputSizeshNQ4ISI;
                    meVar.f2647 = meVar.f2647 - 1;
                    meVar.f2644 = (char) (meVar.f2646 + (((byte) (((byte) (bArr5[r9] ^ (-2689713159175858216L))) + s)) ^ b));
                } else {
                    short[] sArr = getHighSpeedVideoSizes;
                    meVar.f2647 = meVar.f2647 - 1;
                    meVar.f2644 = (char) (meVar.f2646 + (((short) (((short) (sArr[r9] ^ (-2689713159175858216L))) + s)) ^ b));
                }
                sb.append(meVar.f2644);
                meVar.f2646 = meVar.f2644;
                meVar.f2645++;
            }
        }
        objArr[0] = sb.toString();
    }

    @Override // util.h.xy.ej.a, util.h.xy.ef.ra
    /* renamed from: ᐝ */
    public final void mo26557() {
        int i = getHighSpeedVideoSizesFor + 109;
        getOutputMinFrameDuration = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // util.h.xy.ej.a, util.h.xy.ef.ra
    /* renamed from: ˋ */
    public final int mo26555(byte[] bArr, int i, byte[] bArr2, int i2) {
        int[] iArr = this.getOutputMinFrameDurationlomOqCM;
        try {
            if (iArr == null) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6) + 154630826, (short) android.text.TextUtils.getOffsetBefore("", 0), (byte) ((-122) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (android.view.ViewConfiguration.getLongPressTimeout() >> 16) - 106, android.widget.ExpandableListView.getPackedPositionChild(0L) + 411355618, objArr);
                throw new java.lang.IllegalStateException(((java.lang.String) objArr[0]).intern());
            }
            if (i + 8 > bArr.length) {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(154630855 - android.graphics.Color.blue(0), (short) android.view.View.getDefaultSize(0, 0), (byte) (33 - android.view.View.getDefaultSize(0, 0)), (-106) - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), 411355653 - android.widget.ExpandableListView.getPackedPositionChild(0L), objArr2);
                throw new util.h.xy.ef.mc(((java.lang.String) objArr2[0]).intern());
            }
            if (i2 + 8 > bArr2.length) {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(android.view.MotionEvent.axisFromString("") + 154630878, (short) (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22), (byte) ((-21) - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16)), android.graphics.Color.green(0) - 106, (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 411355660, objArr3);
                throw new util.h.xy.ef.f(((java.lang.String) objArr3[0]).intern());
            }
            byte[] bArr3 = new byte[8];
            if (this.getOutputSizes) {
                m26594(iArr, bArr, i, bArr3, 0);
                m26594(this.getInputFormats, bArr3, 0, bArr3, 0);
                m26594(this.getOutputStallDurationlomOqCM, bArr3, 0, bArr2, i2);
            } else {
                m26594(this.getOutputStallDurationlomOqCM, bArr, i, bArr3, 0);
                m26594(this.getInputFormats, bArr3, 0, bArr3, 0);
                m26594(this.getOutputMinFrameDurationlomOqCM, bArr3, 0, bArr2, i2);
            }
            return 8;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    @Override // util.h.xy.ej.a, util.h.xy.ef.ra
    /* renamed from: ˋ */
    public final int mo26554() {
        int i = getHighSpeedVideoSizesFor + 107;
        int i2 = i % 128;
        getOutputMinFrameDuration = i2;
        int i3 = i % 2 == 0 ? 47 : 8;
        int i4 = i2 + 83;
        getHighSpeedVideoSizesFor = i4 % 128;
        if (i4 % 2 == 0) {
            return i3;
        }
        throw null;
    }

    @Override // util.h.xy.ej.a, util.h.xy.ef.ra
    /* renamed from: ˋ */
    public final void mo26556(boolean z, util.h.xy.ef.mb mbVar) {
        boolean z2 = true;
        if (!(mbVar instanceof util.h.xy.ep.mc)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 154630751, (short) (1 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), (byte) (android.graphics.ImageFormat.getBitsPerPixel(0) + 59), (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) - 106, android.widget.ExpandableListView.getPackedPositionType(0L) + 411355654, objArr);
            sb.append(((java.lang.String) objArr[0]).intern());
            sb.append(mbVar.getClass().getName());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        byte[] m26663 = ((util.h.xy.ep.mc) mbVar).m26663();
        if (m26663.length != 24) {
            int i = getHighSpeedVideoSizesFor + 33;
            getOutputMinFrameDuration = i % 128;
            if (i % 2 != 0 ? m26663.length != 16 : m26663.length != 21) {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(154630794 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (short) android.text.TextUtils.indexOf("", "", 0, 0), (byte) ((-13) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (-107) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 411355656, objArr2);
                throw new java.lang.IllegalArgumentException(((java.lang.String) objArr2[0]).intern());
            }
        }
        this.getOutputSizes = z;
        byte[] bArr = new byte[8];
        java.lang.System.arraycopy(m26663, 0, bArr, 0, 8);
        this.getOutputMinFrameDurationlomOqCM = m26595(z, bArr);
        byte[] bArr2 = new byte[8];
        java.lang.System.arraycopy(m26663, 8, bArr2, 0, 8);
        if (z) {
            z2 = false;
        } else {
            getHighSpeedVideoSizesFor = (getOutputMinFrameDuration + 115) % 128;
        }
        this.getInputFormats = m26595(z2, bArr2);
        if (m26663.length != 24) {
            this.getOutputStallDurationlomOqCM = this.getOutputMinFrameDurationlomOqCM;
            return;
        }
        int i2 = getOutputMinFrameDuration + 109;
        getHighSpeedVideoSizesFor = i2 % 128;
        if (i2 % 2 != 0) {
            byte[] bArr3 = new byte[20];
            java.lang.System.arraycopy(m26663, 105, bArr3, 0, 20);
            this.getOutputStallDurationlomOqCM = m26595(z, bArr3);
        } else {
            byte[] bArr4 = new byte[8];
            java.lang.System.arraycopy(m26663, 16, bArr4, 0, 8);
            this.getOutputStallDurationlomOqCM = m26595(z, bArr4);
        }
    }
}
