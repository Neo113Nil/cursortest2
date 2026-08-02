package util.h.xy.cw;

/* loaded from: classes5.dex */
final class ra extends util.h.xy.cw.b {
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static short[] getHighSpeedVideoSizesFor = null;
    private static int getInputFormats = 0;
    private static int getInputSizeshNQ4ISI = 0;
    private static int getOutputFormats = 1;
    private static byte[] getOutputMinFrameDuration;
    private static int getOutputMinFrameDurationlomOqCM;
    private static final byte[] getOutputSizes;
    private static int getOutputSizeshNQ4ISI;
    private static final java.lang.String getOutputStallDurationlomOqCM;
    private util.h.xy.da.a getOutputStallDuration;
    private final util.h.xy.cw.rc getValidOutputFormatsForInputhNQ4ISI;

    static {
        getHighResolutionOutputSizeshNQ4ISI();
        byte[] bArr = {76, 101, 118, 101, 108, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE};
        getOutputSizes = bArr;
        getOutputStallDurationlomOqCM = new java.lang.String(bArr);
        int i = getOutputFormats + 45;
        getOutputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    ra(java.lang.String str) throws util.h.xy.da.b {
        super(str);
        this.getValidOutputFormatsForInputhNQ4ISI = new util.h.xy.cw.rc(getHighSpeedVideoSizesFor());
    }

    @Override // util.h.xy.da.ra
    /* renamed from: ˏ */
    public final void mo26073(util.h.xy.da.mb mbVar) throws util.h.xy.da.b {
        if (mo26080()) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(913579711 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (short) ((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) - 49), (byte) (android.graphics.Color.green(0) - 30), android.widget.ExpandableListView.getPackedPositionGroup(0L) + 62, (android.view.KeyEvent.getMaxKeyCode() >> 16) - 1562498580, objArr);
            throw new util.h.xy.da.b(((java.lang.String) objArr[0]).intern());
        }
        if (!(mbVar instanceof util.h.xy.cw.mb)) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges((android.view.KeyEvent.getMaxKeyCode() >> 16) + 913579781, (short) (android.text.TextUtils.indexOf("", "") + 108), (byte) ((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) - 12), android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 64, android.graphics.Color.argb(0, 0, 0, 0) - 1562498591, objArr2);
            throw new util.h.xy.da.b(((java.lang.String) objArr2[0]).intern(), 10901);
        }
        synchronized (getHighSpeedVideoFpsRanges) {
            util.h.xy.da.a m26089 = ((util.h.xy.cw.mb) mbVar).m26089();
            if (m26089 == null) {
                m26089 = util.h.xy.da.a.f1153;
            }
            this.getOutputStallDuration = m26089;
            util.h.xy.cw.rc rcVar = this.getValidOutputFormatsForInputhNQ4ISI;
            java.lang.String highSpeedVideoSizesFor = getHighSpeedVideoSizesFor();
            util.h.xy.cw.rc.getHighSpeedVideoSizesFor = (util.h.xy.cw.rc.getInputSizeshNQ4ISI + 59) % 128;
            if (util.h.xy.cy.ra.m26123()) {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                util.h.xy.cw.rc.Camera2StreamConfigurationMap((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 26, (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) android.text.TextUtils.getOffsetBefore("", 0), objArr3);
                throw new util.h.xy.da.b(((java.lang.String) objArr3[0]).intern());
            }
            byte[] highResolutionOutputSizeshNQ4ISI = rcVar.getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoSizesFor, mbVar);
            try {
                byte[] bArr = util.h.xy.cw.rc.getHighSpeedVideoSizes;
                util.h.xy.cw.rc.getHighSpeedVideoSizesFor = (util.h.xy.cw.rc.getInputSizeshNQ4ISI + 43) % 128;
                rcVar.Camera2StreamConfigurationMap(highResolutionOutputSizeshNQ4ISI, bArr);
                util.h.xy.cw.rc.getInputSizeshNQ4ISI = (util.h.xy.cw.rc.getHighSpeedVideoSizesFor + 1) % 128;
                util.h.xy.cy.ma.m26113(highResolutionOutputSizeshNQ4ISI);
                int i = util.h.xy.cw.rc.getHighSpeedVideoSizesFor + 93;
                util.h.xy.cw.rc.getInputSizeshNQ4ISI = i % 128;
                if (i % 2 == 0) {
                    int i2 = 3 / 3;
                }
                this.Camera2StreamConfigurationMap = true;
            } catch (java.lang.Throwable th) {
                util.h.xy.cy.ma.m26113(highResolutionOutputSizeshNQ4ISI);
                throw th;
            }
        }
    }

    @Override // util.h.xy.cw.b
    protected final java.lang.String getHighSpeedVideoSizes() {
        int i = getOutputSizeshNQ4ISI + 3;
        int i2 = i % 128;
        getOutputFormats = i2;
        if (i % 2 == 0) {
            throw null;
        }
        java.lang.String str = getOutputStallDurationlomOqCM;
        int i3 = i2 + 79;
        getOutputSizeshNQ4ISI = i3 % 128;
        if (i3 % 2 == 0) {
            return str;
        }
        throw null;
    }

    @Override // util.h.xy.cw.b
    protected final byte[] getHighSpeedVideoFpsRanges(byte[] bArr) throws util.h.xy.da.b {
        int i = getOutputSizeshNQ4ISI + 37;
        getOutputFormats = i % 128;
        util.h.xy.cw.rc rcVar = this.getValidOutputFormatsForInputhNQ4ISI;
        if (i % 2 != 0) {
            util.h.xy.cw.rc.getHighSpeedVideoSizesFor = (util.h.xy.cw.rc.getInputSizeshNQ4ISI + 107) % 128;
            return rcVar.getHighSpeedVideoFpsRanges(bArr, false);
        }
        util.h.xy.cw.rc.getHighSpeedVideoSizesFor = (util.h.xy.cw.rc.getInputSizeshNQ4ISI + 107) % 128;
        rcVar.getHighSpeedVideoFpsRanges(bArr, false);
        throw null;
    }

    @Override // util.h.xy.cw.b
    protected final byte[] getHighSpeedVideoFpsRangesFor(byte[] bArr) throws util.h.xy.da.b {
        getOutputSizeshNQ4ISI = (getOutputFormats + 103) % 128;
        util.h.xy.cw.rc rcVar = this.getValidOutputFormatsForInputhNQ4ISI;
        util.h.xy.cw.rc.getInputSizeshNQ4ISI = (util.h.xy.cw.rc.getHighSpeedVideoSizesFor + 1) % 128;
        byte[] highResolutionOutputSizeshNQ4ISI = rcVar.getHighResolutionOutputSizeshNQ4ISI(bArr, false);
        util.h.xy.cw.rc.getInputSizeshNQ4ISI = (util.h.xy.cw.rc.getHighSpeedVideoSizesFor + 9) % 128;
        getOutputFormats = (getOutputSizeshNQ4ISI + 63) % 128;
        return highResolutionOutputSizeshNQ4ISI;
    }

    @Override // util.h.xy.cw.b
    protected final byte[] getHighResolutionOutputSizeshNQ4ISI(byte[] bArr) throws util.h.xy.da.b {
        getOutputSizeshNQ4ISI = (getOutputFormats + 119) % 128;
        util.h.xy.cw.rc rcVar = this.getValidOutputFormatsForInputhNQ4ISI;
        int i = util.h.xy.cw.rc.getHighSpeedVideoSizesFor + 109;
        util.h.xy.cw.rc.getInputSizeshNQ4ISI = i % 128;
        byte[] highSpeedVideoFpsRanges = rcVar.getHighSpeedVideoFpsRanges(bArr, i % 2 != 0);
        getOutputSizeshNQ4ISI = (getOutputFormats + 107) % 128;
        return highSpeedVideoFpsRanges;
    }

    @Override // util.h.xy.cw.b
    protected final byte[] Camera2StreamConfigurationMap(byte[] bArr) throws util.h.xy.da.b {
        int i = getOutputFormats + 55;
        getOutputSizeshNQ4ISI = i % 128;
        util.h.xy.cw.rc rcVar = this.getValidOutputFormatsForInputhNQ4ISI;
        if (i % 2 == 0) {
            return rcVar.getHighResolutionOutputSizeshNQ4ISI(bArr);
        }
        rcVar.getHighResolutionOutputSizeshNQ4ISI(bArr);
        throw null;
    }

    @Override // util.h.xy.cw.b
    protected final int getHighSpeedVideoFpsRangesFor() {
        int i = (getOutputFormats + 115) % 128;
        getOutputSizeshNQ4ISI = i;
        getOutputFormats = (i + 7) % 128;
        return Integer.MAX_VALUE;
    }

    @Override // util.h.xy.cw.b
    protected final void Camera2StreamConfigurationMap() throws util.h.xy.da.b {
        getOutputSizeshNQ4ISI = (getOutputFormats + 79) % 128;
        util.h.xy.cw.rc rcVar = this.getValidOutputFormatsForInputhNQ4ISI;
        getHighSpeedVideoSizesFor();
        rcVar.Camera2StreamConfigurationMap();
        getOutputSizeshNQ4ISI = (getOutputFormats + 109) % 128;
    }

    @Override // util.h.xy.cw.b
    protected final void getHighSpeedVideoFpsRanges() {
        int i = getOutputFormats + 37;
        getOutputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            this.getValidOutputFormatsForInputhNQ4ISI.getHighResolutionOutputSizeshNQ4ISI();
            getOutputSizeshNQ4ISI = (getOutputFormats + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        } else {
            this.getValidOutputFormatsForInputhNQ4ISI.getHighResolutionOutputSizeshNQ4ISI();
            throw null;
        }
    }

    private static void getHighSpeedVideoFpsRanges(int i, short s, byte b, int i2, int i3, java.lang.Object[] objArr) {
        util.h.xz.b.me meVar = new util.h.xz.b.me();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i4 = i2 + ((int) (getInputFormats ^ (-2689713159175858216L)));
        int i5 = i4 == -1 ? 1 : 0;
        if (i5 != 0) {
            int i6 = getHighSpeedVideoFpsRangesFor + 71;
            getHighResolutionOutputSizeshNQ4ISI = i6 % 128;
            if (i6 % 2 == 0) {
                throw null;
            }
            byte[] bArr = getOutputMinFrameDuration;
            if (bArr != null) {
                int length = bArr.length;
                byte[] bArr2 = new byte[length];
                for (int i7 = 0; i7 < length; i7++) {
                    bArr2[i7] = (byte) (bArr[i7] ^ (-2689713159175858216L));
                }
                bArr = bArr2;
            }
            i4 = bArr != null ? (byte) (((byte) (getOutputMinFrameDuration[((int) (getInputSizeshNQ4ISI ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getInputFormats ^ (-2689713159175858216L)))) : (short) (((short) (getHighSpeedVideoSizesFor[((int) (getInputSizeshNQ4ISI ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getInputFormats ^ (-2689713159175858216L))));
        }
        if (i4 > 0) {
            meVar.f2647 = ((i + i4) - 2) + ((int) (getInputSizeshNQ4ISI ^ (-2689713159175858216L))) + i5;
            meVar.f2644 = (char) (i3 + ((int) (getOutputMinFrameDurationlomOqCM ^ (-2689713159175858216L))));
            sb.append(meVar.f2644);
            meVar.f2646 = meVar.f2644;
            byte[] bArr3 = getOutputMinFrameDuration;
            if (bArr3 != null) {
                int i8 = (getHighResolutionOutputSizeshNQ4ISI + 11) % 128;
                getHighSpeedVideoFpsRangesFor = i8;
                int length2 = bArr3.length;
                byte[] bArr4 = new byte[length2];
                getHighResolutionOutputSizeshNQ4ISI = (i8 + 45) % 128;
                for (int i9 = 0; i9 < length2; i9++) {
                    bArr4[i9] = (byte) (bArr3[i9] ^ (-2689713159175858216L));
                }
                bArr3 = bArr4;
            }
            boolean z = bArr3 != null;
            meVar.f2645 = 1;
            getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 47) % 128;
            while (meVar.f2645 < i4) {
                int i10 = (getHighSpeedVideoFpsRangesFor + 73) % 128;
                getHighResolutionOutputSizeshNQ4ISI = i10;
                if (z) {
                    getHighSpeedVideoFpsRangesFor = (i10 + 15) % 128;
                    byte[] bArr5 = getOutputMinFrameDuration;
                    meVar.f2647 = meVar.f2647 - 1;
                    meVar.f2644 = (char) (meVar.f2646 + (((byte) (((byte) (bArr5[r9] ^ (-2689713159175858216L))) + s)) ^ b));
                } else {
                    short[] sArr = getHighSpeedVideoSizesFor;
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

    static void getHighResolutionOutputSizeshNQ4ISI() {
        getInputSizeshNQ4ISI = 774567576;
        getInputFormats = -408873008;
        getOutputMinFrameDurationlomOqCM = -1165966928;
        getOutputMinFrameDuration = new byte[]{-107, -51, -26, -54, -110, -52, 58, 82, -120, -97, 63, -89, -52, -52, -60, -54, 13, 82, com.visa.cbp.getEncExpo.registerForActivityResult, com.visa.cbp.getEncExpo.kernelVersion, -54, -60, 10, 82, com.visa.cbp.getEncExpo.registerForActivityResult, -7, -105, -108, -9, -37, com.visa.cbp.getEncExpo.registerForActivityResult, -124, com.visa.cbp.getEncExpo.registerForActivityResult, -7, -106, -52, -104, -6, -120, com.google.common.base.Ascii.SI, 87, -106, -98, -60, -112, -52, 6, -82, com.visa.cbp.getEncExpo.onUnminimized, -54, -105, -102, -51, -62, com.google.common.base.Ascii.FF, 89, -60, -112, -52, 6, 92, -110, 63, 84, -108, com.visa.cbp.getEncExpo.startTransaction, -101, -50, -11, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, 75, -119, 4, 120, 83, 76, -93, -110, 1, 123, -20, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, 85, 81, 120, 83, 76, -125, -84, 59, 84, 121, 93, 77, 80, 87, -94, 124, 123, 92, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, -73, -77, 59, 66, -90, -115, 66, 59, 84, 121, 93, 77, 80, 87, 66, -29, 1, 123, 92, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, 87, -109, com.google.common.base.Ascii.FF, 80, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, -106, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, 83, -105, 4, 123, 69, 75, 107, 72, -67, -40, -40};
    }
}
