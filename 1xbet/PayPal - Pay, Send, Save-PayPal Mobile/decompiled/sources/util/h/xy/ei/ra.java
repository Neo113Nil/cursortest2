package util.h.xy.ei;

/* loaded from: classes18.dex */
public final class ra implements util.h.xy.ef.ma {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1472112299;
    private static int getHighSpeedVideoFpsRanges = -408872971;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static byte[] getHighSpeedVideoSizes = {0, -21, -26, -17, 16, 5, -6, com.google.common.base.Ascii.DC4, 16, 81, -20, -81, 1, -23, -22, 83, -40, -24, -23, 16, 3, -17, -5, 7, -28, -24, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.FS, 37, -42, -28, 18, com.google.common.base.Ascii.GS, -10, -5, -14, 13, 73, -15, -78, com.google.common.base.Ascii.FS, -12, -9, 78, -59, -11, -12, 13, com.google.common.base.Ascii.RS, -14, -26, com.google.common.base.Ascii.SUB, -7, -11, 10, 1, 56, -53, -7, com.google.common.base.Ascii.SI, 66, -73, 74, -79, 83, -18, 17, -78, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, -75, 72, -72, -80, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, -18, 18, -79, -67, 73, -80, 73, -75, -117, Byte.MIN_VALUE, 100, Byte.MIN_VALUE, 57, -60, 117, -114, 33, -54, -104, 102, -120, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, -39, -118, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, com.visa.cbp.getEncExpo.IResultReceiver, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, -20, 16, -18, 18, -21, -29, 70, -69, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.FS, 83, -71, 16, com.google.common.base.Ascii.DC4, 91, -31, -85, -22, 19, -32, 17, -30, 18, com.google.common.base.Ascii.SUB, -21, com.google.common.base.Ascii.DC4, 81, -69, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.FS, 83, -78, com.google.common.base.Ascii.CAN, -21, -22, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, -72, com.google.common.base.Ascii.US, 92, -87, -32, 18, -31, com.google.common.base.Ascii.SUB, -19, 88, -72, com.google.common.base.Ascii.US, com.google.common.base.Ascii.DC4, -31, 65, -31, -90, 18, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.SYN, -23, -11, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.ETB, -28, -25, -24, 17, -31, -83, 81, -20, 16, -25, -18, com.google.common.base.Ascii.SYN, -20, com.google.common.base.Ascii.VT, -82, 81, -20, 3, 14, -3, -2, -15, 8, -8, -76, 72, -11, 9, -2, -9, -40, -40, -40, -40, -40, -40, -40};
    private static short[] getHighSpeedVideoSizesFor = null;
    private static int getInputFormats = 0;
    private static int getInputSizeshNQ4ISI = 63705512;
    private static int getOutputFormats = 1;
    private java.security.SecureRandom getOutputMinFrameDurationlomOqCM;
    private util.h.xy.ef.ma getOutputSizeshNQ4ISI;
    private boolean getOutputStallDuration;
    private boolean getOutputStallDurationlomOqCM;
    private boolean getValidOutputFormatsForInputhNQ4ISI;
    private byte[] isOutputSupportedFor;
    private int getOutputSizes = -1;
    private byte[] getOutputMinFrameDuration = null;

    private static void Camera2StreamConfigurationMap(int i, short s, byte b, int i2, int i3, java.lang.Object[] objArr) {
        int i4;
        int length;
        byte[] bArr;
        int i5;
        util.h.xz.b.me meVar = new util.h.xz.b.me();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i6 = i2 + ((int) (getHighSpeedVideoFpsRanges ^ (-2689713159175858216L)));
        boolean z = i6 == -1;
        if (z) {
            byte[] bArr2 = getHighSpeedVideoSizes;
            if (bArr2 != null) {
                int length2 = bArr2.length;
                byte[] bArr3 = new byte[length2];
                for (int i7 = 0; i7 < length2; i7++) {
                    Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 125) % 128;
                    bArr3[i7] = (byte) (bArr2[i7] ^ (-2689713159175858216L));
                }
                bArr2 = bArr3;
            }
            i6 = bArr2 != null ? (byte) (((byte) (getHighSpeedVideoSizes[((int) (getHighResolutionOutputSizeshNQ4ISI ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getHighSpeedVideoFpsRanges ^ (-2689713159175858216L)))) : (short) (((short) (getHighSpeedVideoSizesFor[((int) (getHighResolutionOutputSizeshNQ4ISI ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getHighSpeedVideoFpsRanges ^ (-2689713159175858216L))));
        }
        if (i6 > 0) {
            int i8 = (int) (getHighResolutionOutputSizeshNQ4ISI ^ (-2689713159175858216L));
            if (z) {
                getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 83) % 128;
                i4 = 1;
            } else {
                i4 = 0;
            }
            meVar.f2647 = ((i + i6) - 2) + i8 + i4;
            meVar.f2644 = (char) (i3 + ((int) (getInputSizeshNQ4ISI ^ (-2689713159175858216L))));
            sb.append(meVar.f2644);
            meVar.f2646 = meVar.f2644;
            byte[] bArr4 = getHighSpeedVideoSizes;
            if (bArr4 != null) {
                int i9 = getHighSpeedVideoFpsRangesFor + 91;
                Camera2StreamConfigurationMap = i9 % 128;
                if (i9 % 2 != 0) {
                    length = bArr4.length;
                    bArr = new byte[length];
                    i5 = 1;
                } else {
                    length = bArr4.length;
                    bArr = new byte[length];
                    i5 = 0;
                }
                while (i5 < length) {
                    bArr[i5] = (byte) (bArr4[i5] ^ (-2689713159175858216L));
                    i5++;
                }
                bArr4 = bArr;
            }
            boolean z2 = bArr4 != null;
            meVar.f2645 = 1;
            while (meVar.f2645 < i6) {
                if (z2) {
                    byte[] bArr5 = getHighSpeedVideoSizes;
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

    private byte[] getHighSpeedVideoFpsRangesFor(byte[] bArr, int i, int i2) throws util.h.xy.ef.md {
        if (!this.getValidOutputFormatsForInputhNQ4ISI) {
            try {
                java.lang.Object[] objArr = new java.lang.Object[1];
                Camera2StreamConfigurationMap((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22) + 1340100338, (short) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1), (byte) ((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 51), ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue() + 14, 462617091 - android.text.TextUtils.getOffsetBefore("", 0), objArr);
                throw new util.h.xy.ef.md(((java.lang.String) objArr[0]).intern());
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        byte[] mo26545 = this.getOutputSizeshNQ4ISI.mo26545(bArr, i, i2);
        byte[] bArr2 = this.getOutputMinFrameDuration;
        if (bArr2 == null) {
            bArr2 = new byte[this.getOutputSizes];
            this.getOutputMinFrameDurationlomOqCM.nextBytes(bArr2);
        }
        if (this.getOutputStallDuration & (mo26545.length != this.getOutputSizeshNQ4ISI.mo26544())) {
            mo26545 = this.isOutputSupportedFor;
        }
        int i3 = this.getOutputSizes;
        int i4 = mo26545[0] ^ 2;
        int length = mo26545.length;
        int i5 = i3 + 1;
        for (int i6 = 1; i6 < length - i5; i6++) {
            getOutputFormats = (getInputFormats + 27) % 128;
            byte b = mo26545[i6];
            int i7 = b | (b >> 1);
            int i8 = i7 | (i7 >> 2);
            i4 |= ((i8 | (i8 >> 4)) & 1) - 1;
        }
        int i9 = mo26545[mo26545.length - i5] | i4;
        int i10 = i9 | (i9 >> 1);
        int i11 = i10 | (i10 >> 2);
        int i12 = getInputFormats + 23;
        getOutputFormats = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
        int i13 = ~(((i11 | (i11 >> 4)) & 1) - 1);
        byte[] bArr3 = new byte[this.getOutputSizes];
        int i14 = 0;
        while (true) {
            int i15 = this.getOutputSizes;
            if (i14 >= i15) {
                util.h.xy.fb.a.m26826(mo26545, (byte) 0);
                return bArr3;
            }
            bArr3[i14] = (byte) ((mo26545[(mo26545.length - i15) + i14] & (~i13)) | (bArr2[i14] & i13));
            i14++;
        }
    }

    private byte[] getHighResolutionOutputSizeshNQ4ISI(byte[] bArr, int i, int i2) throws util.h.xy.ef.md {
        int i3;
        if (i2 > mo26542()) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            Camera2StreamConfigurationMap(1340100319 - android.text.TextUtils.getOffsetBefore("", 0), (short) (1 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (byte) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 131), (-25) - android.view.KeyEvent.getDeadChar(0, 0), 462617080 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
        }
        int mo26542 = this.getOutputSizeshNQ4ISI.mo26542();
        byte[] bArr2 = new byte[mo26542];
        if (this.getValidOutputFormatsForInputhNQ4ISI) {
            int i4 = getOutputFormats + 79;
            getInputFormats = i4 % 128;
            if (i4 % 2 != 0) {
                bArr2[0] = 1;
                i3 = 0;
            } else {
                bArr2[0] = 1;
                i3 = 1;
            }
            while (i3 != (mo26542 - i2) - 1) {
                bArr2[i3] = -1;
                i3++;
            }
        } else {
            this.getOutputMinFrameDurationlomOqCM.nextBytes(bArr2);
            bArr2[0] = 2;
            getOutputFormats = (getInputFormats + 29) % 128;
            for (int i5 = 1; i5 != (mo26542 - i2) - 1; i5++) {
                while (bArr2[i5] == 0) {
                    bArr2[i5] = (byte) this.getOutputMinFrameDurationlomOqCM.nextInt();
                }
            }
        }
        int i6 = mo26542 - i2;
        bArr2[i6 - 1] = 0;
        java.lang.System.arraycopy(bArr, i, bArr2, i6, i2);
        return this.getOutputSizeshNQ4ISI.mo26545(bArr2, 0, mo26542);
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0082, code lost:
    
        if (r6 != 1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c9  */
    @Override // util.h.xy.ef.ma
    /* renamed from: ᐝ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] mo26545(byte[] bArr, int i, int i2) throws util.h.xy.ef.md {
        boolean z;
        boolean z2;
        boolean z3;
        byte[] bArr2;
        boolean z4;
        boolean z5;
        int i3 = getInputFormats;
        int i4 = i3 + 91;
        int i5 = i4 % 128;
        getOutputFormats = i5;
        if (i4 % 2 == 0) {
            throw null;
        }
        if (this.getOutputStallDurationlomOqCM) {
            int i6 = i5 + 33;
            getInputFormats = i6 % 128;
            if (i6 % 2 == 0) {
                return getHighResolutionOutputSizeshNQ4ISI(bArr, i, i2);
            }
            getHighResolutionOutputSizeshNQ4ISI(bArr, i, i2);
            throw null;
        }
        int i7 = (i3 + 43) % 128;
        getOutputFormats = i7;
        if (this.getOutputSizes != -1) {
            getInputFormats = (i7 + 109) % 128;
            bArr2 = getHighSpeedVideoFpsRangesFor(bArr, i, i2);
        } else {
            byte[] mo26545 = this.getOutputSizeshNQ4ISI.mo26545(bArr, i, i2);
            boolean z6 = this.getOutputStallDuration;
            if (mo26545.length != this.getOutputSizeshNQ4ISI.mo26544()) {
                z = true;
            } else {
                getInputFormats = (getOutputFormats + 35) % 128;
                z = false;
            }
            if (mo26545.length < mo26544()) {
                getOutputFormats = (getInputFormats + 17) % 128;
                mo26545 = this.isOutputSupportedFor;
            }
            byte b = mo26545[0];
            if (this.getValidOutputFormatsForInputhNQ4ISI) {
                if (b != 2) {
                    getOutputFormats = (getInputFormats + 115) % 128;
                    z2 = true;
                }
                z2 = false;
            }
            int i8 = -1;
            boolean z7 = false;
            for (int i9 = 1; i9 != mo26545.length; i9++) {
                int i10 = getOutputFormats + 37;
                int i11 = i10 % 128;
                getInputFormats = i11;
                if (i10 % 2 != 0) {
                    byte b2 = mo26545[i9];
                    throw new java.lang.ArithmeticException();
                }
                byte b3 = mo26545[i9];
                if ((b3 == 0) & (i8 < 0)) {
                    i8 = i9;
                }
                if (b == 1) {
                    int i12 = i11 + 45;
                    getOutputFormats = i12 % 128;
                    if (i12 % 2 != 0) {
                        z4 = true;
                        boolean z8 = i8 >= 0;
                        if (b3 == -1) {
                            getInputFormats = (getOutputFormats + 21) % 128;
                            z5 = true;
                        } else {
                            getInputFormats = (getOutputFormats + 23) % 128;
                            z5 = false;
                        }
                        z7 |= z5 & z4 & z8;
                    }
                } else {
                    int i13 = i11 + 125;
                    getOutputFormats = i13 % 128;
                    if (i13 % 2 == 0) {
                        int i14 = 3 / 3;
                    }
                }
                z4 = false;
                if (i8 >= 0) {
                }
                if (b3 == -1) {
                }
                z7 |= z5 & z4 & z8;
            }
            int i15 = (z7 ? -1 : i8) + 1;
            if (i15 < 10) {
                getInputFormats = (getOutputFormats + 29) % 128;
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3 || z2) {
                util.h.xy.fb.a.m26826(mo26545, (byte) 0);
                java.lang.Object[] objArr = new java.lang.Object[1];
                Camera2StreamConfigurationMap(android.view.KeyEvent.keyCodeFromString("") + 1340100395, (short) (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (byte) (60 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16)), (-30) - android.view.View.MeasureSpec.getSize(0), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 462617075, objArr);
                throw new util.h.xy.ef.md(((java.lang.String) objArr[0]).intern());
            }
            if (z6 && z) {
                util.h.xy.fb.a.m26826(mo26545, (byte) 0);
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                Camera2StreamConfigurationMap(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1340100410, (short) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (byte) (android.text.TextUtils.getOffsetBefore("", 0) + 37), android.text.TextUtils.getCapsMode("", 0, 0) - 25, 462617073 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr2);
                throw new util.h.xy.ef.md(((java.lang.String) objArr2[0]).intern());
            }
            int length = mo26545.length - i15;
            byte[] bArr3 = new byte[length];
            java.lang.System.arraycopy(mo26545, i15, bArr3, 0, length);
            bArr2 = bArr3;
        }
        getOutputFormats = (getInputFormats + 71) % 128;
        return bArr2;
    }

    @Override // util.h.xy.ef.ma
    /* renamed from: ᐝ */
    public final int mo26544() {
        getInputFormats = (getOutputFormats + 119) % 128;
        int mo26544 = this.getOutputSizeshNQ4ISI.mo26544();
        if (this.getOutputStallDurationlomOqCM) {
            return mo26544;
        }
        getInputFormats = (getOutputFormats + 63) % 128;
        return mo26544 - 10;
    }

    @Override // util.h.xy.ef.ma
    /* renamed from: ˊ */
    public final int mo26542() {
        int i = getOutputFormats + 31;
        getInputFormats = i % 128;
        if (i % 2 != 0) {
            this.getOutputSizeshNQ4ISI.mo26542();
            throw new java.lang.ArithmeticException();
        }
        int mo26542 = this.getOutputSizeshNQ4ISI.mo26542();
        if (!this.getOutputStallDurationlomOqCM) {
            return mo26542;
        }
        int i2 = mo26542 - 10;
        getOutputFormats = (getInputFormats + 87) % 128;
        return i2;
    }

    @Override // util.h.xy.ef.ma
    /* renamed from: ˊ */
    public final void mo26543(boolean z, util.h.xy.ef.mb mbVar) {
        util.h.xy.ep.mb mbVar2;
        if (mbVar instanceof util.h.xy.ep.me) {
            util.h.xy.ep.me meVar = (util.h.xy.ep.me) mbVar;
            this.getOutputMinFrameDurationlomOqCM = meVar.m26667();
            mbVar2 = (util.h.xy.ep.mb) meVar.m26666();
        } else {
            mbVar2 = (util.h.xy.ep.mb) mbVar;
            if (!mbVar2.m26662() && z) {
                int i = getInputFormats + 41;
                getOutputFormats = i % 128;
                if (i % 2 == 0) {
                    this.getOutputMinFrameDurationlomOqCM = util.h.xy.ef.rb.m26558();
                    throw null;
                }
                this.getOutputMinFrameDurationlomOqCM = util.h.xy.ef.rb.m26558();
            }
        }
        this.getOutputSizeshNQ4ISI.mo26543(z, mbVar);
        this.getValidOutputFormatsForInputhNQ4ISI = mbVar2.m26662();
        this.getOutputStallDurationlomOqCM = z;
        this.isOutputSupportedFor = new byte[this.getOutputSizeshNQ4ISI.mo26544()];
        if (this.getOutputSizes <= 0 || this.getOutputMinFrameDuration != null) {
            return;
        }
        int i2 = getOutputFormats + 49;
        getInputFormats = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this.getOutputMinFrameDurationlomOqCM != null) {
            return;
        }
        int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        java.lang.Object[] objArr = new java.lang.Object[1];
        Camera2StreamConfigurationMap(1340100297 - makeMeasureSpec, (short) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (byte) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 99), (-22) - android.graphics.drawable.Drawable.resolveOpacity(0, 0), android.text.TextUtils.indexOf("", "", 0) + 462617077, objArr);
        throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
    }

    public ra(util.h.xy.ef.ma maVar) {
        int i;
        this.getOutputSizeshNQ4ISI = maVar;
        boolean z = false;
        java.lang.Object[] objArr = new java.lang.Object[1];
        Camera2StreamConfigurationMap(1340100236 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (short) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (byte) ((-55) - android.view.KeyEvent.normalizeMetaState(0)), (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) - 12, 462617087 - android.view.View.resolveSize(0, 0), objArr);
        if (util.h.xy.fb.rc.m26852(((java.lang.String) objArr[0]).intern(), true)) {
            i = getOutputFormats + 3;
        } else {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            Camera2StreamConfigurationMap((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 1340100269, (short) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (byte) (android.view.View.combineMeasuredStates(0, 0) - 44), (-16) - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), android.graphics.Color.argb(0, 0, 0, 0) + 462617087, objArr2);
            if (util.h.xy.fb.rc.m26852(((java.lang.String) objArr2[0]).intern(), false)) {
                getOutputFormats = (getInputFormats + 51) % 128;
            } else {
                int i2 = (getOutputFormats + 93) % 128;
                getInputFormats = i2;
                getOutputFormats = (i2 + 63) % 128;
                z = true;
            }
            i = getOutputFormats + 43;
        }
        getInputFormats = i % 128;
        this.getOutputStallDuration = z;
    }
}
