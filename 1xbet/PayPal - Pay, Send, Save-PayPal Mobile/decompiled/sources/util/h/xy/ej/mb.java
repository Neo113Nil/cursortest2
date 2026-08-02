package util.h.xy.ej;

/* loaded from: classes18.dex */
public final class mb implements util.h.xy.ef.ra {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes = 1;
    private static byte[] getInputSizeshNQ4ISI;
    private boolean getOutputFormats;
    private int[] getOutputMinFrameDuration;

    private static void Camera2StreamConfigurationMap(java.lang.String str, int i, int i2, int i3, boolean z, java.lang.Object[] objArr) {
        int i4 = getHighSpeedVideoFpsRangesFor + 109;
        Camera2StreamConfigurationMap = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        char[] charArray = str.toCharArray();
        util.h.xz.b.ra raVar = new util.h.xz.b.ra();
        char[] cArr = new char[i];
        raVar.f2649 = 0;
        while (raVar.f2649 < i) {
            raVar.f2650 = charArray[raVar.f2649];
            cArr[raVar.f2649] = (char) (raVar.f2650 + i3);
            int i5 = raVar.f2649;
            cArr[i5] = (char) (cArr[i5] - ((int) (getHighSpeedVideoFpsRanges ^ (-4839292868003314026L))));
            raVar.f2649++;
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 87) % 128;
        }
        if (i2 > 0) {
            getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 15) % 128;
            raVar.f2648 = i2;
            char[] cArr2 = new char[i];
            java.lang.System.arraycopy(cArr, 0, cArr2, 0, i);
            java.lang.System.arraycopy(cArr2, 0, cArr, i - raVar.f2648, raVar.f2648);
            java.lang.System.arraycopy(cArr2, raVar.f2648, cArr, 0, i - raVar.f2648);
        }
        if (z) {
            char[] cArr3 = new char[i];
            raVar.f2649 = 0;
            while (raVar.f2649 < i) {
                cArr3[raVar.f2649] = cArr[(i - raVar.f2649) - 1];
                raVar.f2649++;
            }
            cArr = cArr3;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    static {
        getHighSpeedVideoSizes();
        getInputSizeshNQ4ISI = new byte[]{-39, 120, -7, -60, com.google.common.base.Ascii.EM, -35, -75, -19, 40, -23, -3, 121, 74, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, -40, -99, -58, 126, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, -125, 43, 118, 83, -114, 98, 76, 100, -120, 68, -117, -5, -94, com.google.common.base.Ascii.ETB, -102, 89, -11, -121, -77, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, 19, 97, 69, 109, -115, 9, -127, 125, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, -67, -113, 64, -21, -122, -73, 123, com.google.common.base.Ascii.VT, com.visa.cbp.getEncExpo.onUnminimized, -107, 33, 34, 92, 107, 78, -126, 84, -42, 101, -109, -50, com.visa.cbp.getEncExpo.IResultReceiver2, -78, com.google.common.base.Ascii.FS, 115, 86, com.visa.cbp.getEncExpo.startTransaction, com.google.common.base.Ascii.DC4, -89, -116, -15, -36, 18, 117, -54, com.google.common.base.Ascii.US, 59, -66, -28, -47, 66, kotlin.io.encoding.Base64.padSymbol, -44, 48, -93, 60, -74, 38, 111, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, 14, -38, 70, 105, 7, 87, 39, -14, com.google.common.base.Ascii.GS, -101, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, -108, 67, 3, -8, 17, -57, -10, -112, -17, 62, -25, 6, -61, -43, 47, -56, 102, com.google.common.base.Ascii.RS, -41, 8, -24, -22, -34, Byte.MIN_VALUE, 82, -18, -9, -124, -86, 114, -84, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, 77, 106, 42, -106, com.google.common.base.Ascii.SUB, -46, 113, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, com.google.common.base.Ascii.NAK, 73, 116, 75, -97, -48, 94, 4, com.google.common.base.Ascii.CAN, -92, -20, -62, -32, 65, 110, com.google.common.base.Ascii.SI, 81, -53, -52, 36, -111, -81, 80, -95, -12, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 57, com.visa.cbp.getEncExpo.registerForActivityResult, 124, 58, -123, 35, -72, -76, 122, -4, 2, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, 91, 37, 85, -105, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, 45, 93, -6, -104, -29, -118, -110, -82, 5, -33, 41, 16, 103, 108, -70, -55, -45, 0, -26, com.visa.cbp.getEncExpo.kernelVersion, -31, -98, -88, 44, 99, com.google.common.base.Ascii.SYN, 1, 63, 88, -30, -119, -87, 13, 56, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, com.google.common.base.Ascii.ESC, -85, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -1, -80, -69, 72, com.google.common.base.Ascii.FF, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, -71, -79, -51, 46, -59, -13, -37, 71, -27, -91, -100, com.visa.cbp.getEncExpo.IResultReceiver, 10, -90, 32, 104, -2, Byte.MAX_VALUE, -63, -83};
        int i = getHighResolutionOutputSizeshNQ4ISI + 79;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    private static int getHighSpeedVideoFpsRangesFor(int i, int i2) {
        int i3;
        int i4;
        int i5 = getHighResolutionOutputSizeshNQ4ISI + 5;
        getHighSpeedVideoSizes = i5 % 128;
        int i6 = i & 65535;
        if (i5 % 2 == 0) {
            i3 = i6 + i2;
            i4 = i6 + (3 % i2);
        } else {
            i3 = i6 << i2;
            i4 = i6 >> (16 - i2);
        }
        return i4 | i3;
    }

    @Override // util.h.xy.ef.ra
    /* renamed from: ˋ */
    public final int mo26555(byte[] bArr, int i, byte[] bArr2, int i2) {
        int i3 = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoSizes = (i3 + 37) % 128;
        if (this.getOutputMinFrameDuration == null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            Camera2StreamConfigurationMap("\f\n\u0011\bￃￕ￦\ufff5\u0007\b\u0016\f\u000f\u0004\f\u0017\f\u0011\fￃ\u0017\u0012\u0011ￃ\b\u0011", 26 - android.graphics.Color.red(0), 8 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 127 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), true, objArr);
            throw new java.lang.IllegalStateException(((java.lang.String) objArr[0]).intern());
        }
        if (i + 8 > bArr.length) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            Camera2StreamConfigurationMap("\u0006\u0011\u000f\f\u0005\u0010ﾽ\f\f\u0011ﾽ\u000f\u0002\u0003\u0003\u0012\uffffﾽ\u0011\u0012\r\u000b", (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 21, android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - '/', android.view.View.MeasureSpec.getSize(0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE, true, objArr2);
            throw new util.h.xy.ef.mc(((java.lang.String) objArr2[0]).intern());
        }
        if (i2 + 8 > bArr2.length) {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            Camera2StreamConfigurationMap("\u000bﾼ\u000f\u0004\u000b\u000e\u0010\u000b\u0011\u0010\f\u0011\u0010ﾼ\ufffe\u0011\u0002\u0002\u0001\u000eﾼ\u0010\u000b", 23 - android.view.Gravity.getAbsoluteGravity(0, 0), 7 - android.view.View.MeasureSpec.getSize(0), (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 134, false, objArr3);
            throw new util.h.xy.ef.f(((java.lang.String) objArr3[0]).intern());
        }
        int i4 = 44;
        if (this.getOutputFormats) {
            getHighSpeedVideoSizes = (i3 + 35) % 128;
            getHighSpeedVideoSizes = (i3 + 35) % 128;
            int i5 = ((bArr[i + 7] & 255) << 8) + (bArr[i + 6] & 255);
            int i6 = ((bArr[i + 5] & 255) << 8) + (bArr[i + 4] & 255);
            int i7 = ((bArr[i + 3] & 255) << 8) + (bArr[i + 2] & 255);
            int i8 = ((bArr[i + 1] & 255) << 8) + (bArr[i] & 255);
            for (int i9 = 0; i9 <= 16; i9 += 4) {
                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 61) % 128;
                i8 = getHighSpeedVideoFpsRangesFor(i8 + ((~i5) & i7) + (i6 & i5) + this.getOutputMinFrameDuration[i9], 1);
                i7 = getHighSpeedVideoFpsRangesFor(i7 + ((~i8) & i6) + (i5 & i8) + this.getOutputMinFrameDuration[i9 + 1], 2);
                i6 = getHighSpeedVideoFpsRangesFor(i6 + ((~i7) & i5) + (i8 & i7) + this.getOutputMinFrameDuration[i9 + 2], 3);
                i5 = getHighSpeedVideoFpsRangesFor(i5 + ((~i6) & i8) + (i7 & i6) + this.getOutputMinFrameDuration[i9 + 3], 5);
            }
            int[] iArr = this.getOutputMinFrameDuration;
            int i10 = i8 + iArr[i5 & 63];
            int i11 = i7 + iArr[i10 & 63];
            int i12 = i6 + iArr[i11 & 63];
            int i13 = i5 + iArr[i12 & 63];
            for (int i14 = 20; i14 <= 40; i14 += 4) {
                i10 = getHighSpeedVideoFpsRangesFor(i10 + ((~i13) & i11) + (i12 & i13) + this.getOutputMinFrameDuration[i14], 1);
                i11 = getHighSpeedVideoFpsRangesFor(i11 + ((~i10) & i12) + (i13 & i10) + this.getOutputMinFrameDuration[i14 + 1], 2);
                i12 = getHighSpeedVideoFpsRangesFor(i12 + ((~i11) & i13) + (i10 & i11) + this.getOutputMinFrameDuration[i14 + 2], 3);
                i13 = getHighSpeedVideoFpsRangesFor(i13 + ((~i12) & i10) + (i11 & i12) + this.getOutputMinFrameDuration[i14 + 3], 5);
            }
            int[] iArr2 = this.getOutputMinFrameDuration;
            int i15 = i10 + iArr2[i13 & 63];
            int i16 = i11 + iArr2[i15 & 63];
            int i17 = i12 + iArr2[i16 & 63];
            int i18 = i13 + iArr2[i17 & 63];
            while (i4 < 64) {
                i15 = getHighSpeedVideoFpsRangesFor(i15 + ((~i18) & i16) + (i17 & i18) + this.getOutputMinFrameDuration[i4], 1);
                i16 = getHighSpeedVideoFpsRangesFor(i16 + ((~i15) & i17) + (i18 & i15) + this.getOutputMinFrameDuration[i4 + 1], 2);
                i17 = getHighSpeedVideoFpsRangesFor(i17 + ((~i16) & i18) + (i15 & i16) + this.getOutputMinFrameDuration[i4 + 2], 3);
                i18 = getHighSpeedVideoFpsRangesFor(i18 + ((~i17) & i15) + (i16 & i17) + this.getOutputMinFrameDuration[i4 + 3], 5);
                i4 += 4;
                getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 75) % 128;
            }
            bArr2[i2] = (byte) i15;
            bArr2[i2 + 1] = (byte) (i15 >> 8);
            bArr2[i2 + 2] = (byte) i16;
            bArr2[i2 + 3] = (byte) (i16 >> 8);
            bArr2[i2 + 4] = (byte) i17;
            bArr2[i2 + 5] = (byte) (i17 >> 8);
            bArr2[i2 + 6] = (byte) i18;
            bArr2[i2 + 7] = (byte) (i18 >> 8);
        } else {
            getHighSpeedVideoSizes = (i3 + 81) % 128;
            int i19 = ((bArr[i + 7] & 255) << 8) + (bArr[i + 6] & 255);
            int i20 = ((bArr[i + 5] & 255) << 8) + (bArr[i + 4] & 255);
            int i21 = ((bArr[i + 3] & 255) << 8) + (bArr[i + 2] & 255);
            int i22 = ((bArr[i + 1] & 255) << 8) + (bArr[i] & 255);
            int i23 = 60;
            while (i23 >= i4) {
                i19 = getHighSpeedVideoFpsRangesFor(i19, 11) - ((((~i20) & i22) + (i21 & i20)) + this.getOutputMinFrameDuration[i23 + 3]);
                i20 = getHighSpeedVideoFpsRangesFor(i20, 13) - ((((~i21) & i19) + (i22 & i21)) + this.getOutputMinFrameDuration[i23 + 2]);
                i21 = getHighSpeedVideoFpsRangesFor(i21, 14) - ((((~i22) & i20) + (i19 & i22)) + this.getOutputMinFrameDuration[i23 + 1]);
                i22 = getHighSpeedVideoFpsRangesFor(i22, 15) - ((((~i19) & i21) + (i20 & i19)) + this.getOutputMinFrameDuration[i23]);
                i23 -= 4;
                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 23) % 128;
                i4 = 44;
            }
            int[] iArr3 = this.getOutputMinFrameDuration;
            int i24 = i19 - iArr3[i20 & 63];
            int i25 = i20 - iArr3[i21 & 63];
            int i26 = i21 - iArr3[i22 & 63];
            int i27 = i22 - iArr3[i24 & 63];
            int i28 = getHighSpeedVideoSizes + 61;
            getHighResolutionOutputSizeshNQ4ISI = i28 % 128;
            int i29 = i28 % 2;
            for (int i30 = 40; i30 >= 20; i30 -= 4) {
                i24 = getHighSpeedVideoFpsRangesFor(i24, 11) - ((((~i25) & i27) + (i26 & i25)) + this.getOutputMinFrameDuration[i30 + 3]);
                i25 = getHighSpeedVideoFpsRangesFor(i25, 13) - ((((~i26) & i24) + (i27 & i26)) + this.getOutputMinFrameDuration[i30 + 2]);
                i26 = getHighSpeedVideoFpsRangesFor(i26, 14) - ((((~i27) & i25) + (i24 & i27)) + this.getOutputMinFrameDuration[i30 + 1]);
                i27 = getHighSpeedVideoFpsRangesFor(i27, 15) - ((((~i24) & i26) + (i25 & i24)) + this.getOutputMinFrameDuration[i30]);
            }
            int[] iArr4 = this.getOutputMinFrameDuration;
            int i31 = i24 - iArr4[i25 & 63];
            int i32 = i25 - iArr4[i26 & 63];
            int i33 = i26 - iArr4[i27 & 63];
            int i34 = i27 - iArr4[i31 & 63];
            for (int i35 = 16; i35 >= 0; i35 -= 4) {
                getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 1) % 128;
                i31 = getHighSpeedVideoFpsRangesFor(i31, 11) - ((((~i32) & i34) + (i33 & i32)) + this.getOutputMinFrameDuration[i35 + 3]);
                i32 = getHighSpeedVideoFpsRangesFor(i32, 13) - ((((~i33) & i31) + (i34 & i33)) + this.getOutputMinFrameDuration[i35 + 2]);
                i33 = getHighSpeedVideoFpsRangesFor(i33, 14) - ((((~i34) & i32) + (i31 & i34)) + this.getOutputMinFrameDuration[i35 + 1]);
                i34 = getHighSpeedVideoFpsRangesFor(i34, 15) - ((((~i31) & i33) + (i32 & i31)) + this.getOutputMinFrameDuration[i35]);
            }
            bArr2[i2] = (byte) i34;
            bArr2[i2 + 1] = (byte) (i34 >> 8);
            bArr2[i2 + 2] = (byte) i33;
            bArr2[i2 + 3] = (byte) (i33 >> 8);
            bArr2[i2 + 4] = (byte) i32;
            bArr2[i2 + 5] = (byte) (i32 >> 8);
            bArr2[i2 + 6] = (byte) i31;
            bArr2[i2 + 7] = (byte) (i31 >> 8);
        }
        return 8;
    }

    @Override // util.h.xy.ef.ra
    /* renamed from: ˋ */
    public final int mo26554() {
        int i = getHighSpeedVideoSizes + 113;
        int i2 = i % 128;
        getHighResolutionOutputSizeshNQ4ISI = i2;
        int i3 = i % 2 != 0 ? 85 : 8;
        getHighSpeedVideoSizes = (i2 + 33) % 128;
        return i3;
    }

    @Override // util.h.xy.ef.ra
    /* renamed from: ᐝ */
    public final void mo26557() {
        int i = getHighSpeedVideoSizes + 107;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    @Override // util.h.xy.ef.ra
    /* renamed from: ˋ */
    public final void mo26556(boolean z, util.h.xy.ef.mb mbVar) {
        int i = getHighResolutionOutputSizeshNQ4ISI + 1;
        int i2 = i % 128;
        getHighSpeedVideoSizes = i2;
        this.getOutputFormats = z;
        boolean z2 = mbVar instanceof util.h.xy.ep.rd;
        if (i % 2 == 0) {
            throw null;
        }
        if (z2) {
            getHighResolutionOutputSizeshNQ4ISI = (i2 + 97) % 128;
            util.h.xy.ep.rd rdVar = (util.h.xy.ep.rd) mbVar;
            this.getOutputMinFrameDuration = getHighResolutionOutputSizeshNQ4ISI(rdVar.m26663(), rdVar.m26678());
        } else {
            if (mbVar instanceof util.h.xy.ep.mc) {
                byte[] m26663 = ((util.h.xy.ep.mc) mbVar).m26663();
                this.getOutputMinFrameDuration = getHighResolutionOutputSizeshNQ4ISI(m26663, m26663.length * 8);
                return;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.Object[] objArr = new java.lang.Object[1];
            Camera2StreamConfigurationMap("\u0010ￇ\uffd9￪\ufff9ￇ\u0016\u001bￇ\u000b\f\u001a\u001a\b\u0017ￇ\u0019\f\u001b\f\u0014\b\u0019\b\u0017ￇ\u000b\u0010\u0013\b\u001d\u0015\u0010ￇￔￇ\u001b\u0010\u0015", android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 40, 33 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 123 - android.view.KeyEvent.getDeadChar(0, 0), true, objArr);
            sb.append(((java.lang.String) objArr[0]).intern());
            sb.append(mbVar.getClass().getName());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
    }

    private static int[] getHighResolutionOutputSizeshNQ4ISI(byte[] bArr, int i) {
        getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 97) % 128;
        int[] iArr = new int[128];
        for (int i2 = 0; i2 != bArr.length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        int length = bArr.length;
        if (length < 128) {
            int i3 = getHighResolutionOutputSizeshNQ4ISI + 47;
            getHighSpeedVideoSizes = i3 % 128;
            int i4 = i3 % 2 == 0 ? iArr[length] : iArr[length - 1];
            int i5 = 0;
            while (true) {
                i4 = getInputSizeshNQ4ISI[(i4 + iArr[i5]) & 255] & 255;
                int i6 = length + 1;
                iArr[length] = i4;
                if (i6 >= 128) {
                    break;
                }
                i5++;
                length = i6;
            }
        }
        int i7 = (i + 7) >> 3;
        int i8 = 128 - i7;
        int i9 = getInputSizeshNQ4ISI[(255 >> ((-i) & 7)) & iArr[i8]] & 255;
        iArr[i8] = i9;
        for (int i10 = 127 - i7; i10 >= 0; i10--) {
            getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 121) % 128;
            i9 = getInputSizeshNQ4ISI[i9 ^ iArr[i10 + i7]] & 255;
            iArr[i10] = i9;
        }
        int[] iArr2 = new int[64];
        getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 19) % 128;
        for (int i11 = 0; i11 != 64; i11++) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 113) % 128;
            int i12 = i11 * 2;
            iArr2[i11] = iArr[i12] + (iArr[i12 + 1] << 8);
        }
        return iArr2;
    }

    static void getHighSpeedVideoSizes() {
        getHighSpeedVideoFpsRanges = -1231763788;
    }
}
