package util.h.xy.fa;

/* loaded from: classes5.dex */
public final class ra implements util.h.xy.fa.b {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 127193635;
    private static short[] getHighSpeedVideoSizes = null;
    private static int getHighSpeedVideoSizesFor = 0;
    private static byte[] getInputSizeshNQ4ISI = {75, 97, 123, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, 74, 124, -81, 64, com.visa.cbp.getEncExpo.IResultReceiver2, 125, 48, Byte.MIN_VALUE, 115, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, -70, 125, 65, 107, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, 116, 71, 116, 106, 67, com.visa.cbp.getEncExpo.IResultReceiver, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -117, Byte.MAX_VALUE, 107, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, 111, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 77, 111, 71, 115, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, -70, 121, 123, 105, 73, 118, 115, -93, 121, 83, 10, -94, 84, -121, 88, 120, 85, 8, -112, 93, 5, -110, 92, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, com.google.common.base.Ascii.VT, -30, 121, com.google.common.base.Ascii.ETB, -110, 85, 89, 67, -89, 76, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, 76, 66, 91, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, com.google.common.base.Ascii.VT, -29, 87, 67, -89, 71, 72, -91, 71, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, 75, 9, -110, 81, 83, 65, -95, 78, 75, -40, -40};
    private static int getOutputFormats = -408872981;
    private static int getOutputMinFrameDuration = 971968963;

    /* renamed from: ˎ, reason: contains not printable characters */
    protected final byte[] f2213 = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 113, 114, 115, 116, 117, 118, com.visa.cbp.getEncExpo.IResultReceiver, 120, 121, 122, 48, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, 56, 57, 43, 47};

    /* renamed from: ˋ, reason: contains not printable characters */
    protected byte f2212 = kotlin.io.encoding.Base64.padSymbol;

    /* renamed from: ˏ, reason: contains not printable characters */
    protected final byte[] f2214 = new byte[128];

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ba, code lost:
    
        if (r3 != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00cb, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c9, code lost:
    
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c7, code lost:
    
        if (r3 != false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void getHighResolutionOutputSizeshNQ4ISI(int i, short s, byte b, int i2, int i3, java.lang.Object[] objArr) {
        boolean z;
        int i4;
        int i5;
        util.h.xz.b.me meVar = new util.h.xz.b.me();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i6 = i2 + ((int) (getOutputFormats ^ (-2689713159175858216L)));
        if (i6 == -1) {
            getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 23) % 128;
            z = true;
        } else {
            getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 51) % 128;
            z = false;
        }
        if (z) {
            byte[] bArr = getInputSizeshNQ4ISI;
            if (bArr != null) {
                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 97) % 128;
                int length = bArr.length;
                byte[] bArr2 = new byte[length];
                for (int i7 = 0; i7 < length; i7++) {
                    bArr2[i7] = (byte) (bArr[i7] ^ (-2689713159175858216L));
                }
                bArr = bArr2;
            }
            if (bArr != null) {
                int i8 = getHighResolutionOutputSizeshNQ4ISI + 119;
                getHighSpeedVideoFpsRanges = i8 % 128;
                i6 = (byte) (i8 % 2 != 0 ? ((byte) (getInputSizeshNQ4ISI[((int) (getOutputMinFrameDuration - 2689713159175858216L)) * i] + 2689713159175858216L)) >>> ((int) (getOutputFormats * (-2689713159175858216L))) : ((byte) (getInputSizeshNQ4ISI[((int) (getOutputMinFrameDuration ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getOutputFormats ^ (-2689713159175858216L))));
            } else {
                i6 = (short) (((short) (getHighSpeedVideoSizes[((int) (getOutputMinFrameDuration ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getOutputFormats ^ (-2689713159175858216L))));
            }
        }
        if (i6 > 0) {
            int i9 = getHighSpeedVideoFpsRanges + 19;
            getHighResolutionOutputSizeshNQ4ISI = i9 % 128;
            if (i9 % 2 == 0) {
                i4 = ((i % i6) << 5) >>> ((int) (getOutputMinFrameDuration + 2689713159175858216L));
            } else {
                i4 = ((i + i6) - 2) + ((int) (getOutputMinFrameDuration ^ (-2689713159175858216L)));
            }
            meVar.f2647 = i4 + i5;
            meVar.f2644 = (char) (i3 + ((int) (getHighSpeedVideoFpsRangesFor ^ (-2689713159175858216L))));
            sb.append(meVar.f2644);
            meVar.f2646 = meVar.f2644;
            byte[] bArr3 = getInputSizeshNQ4ISI;
            if (bArr3 != null) {
                int length2 = bArr3.length;
                byte[] bArr4 = new byte[length2];
                getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 49) % 128;
                for (int i10 = 0; i10 < length2; i10++) {
                    bArr4[i10] = (byte) (bArr3[i10] ^ (-2689713159175858216L));
                }
                bArr3 = bArr4;
            }
            boolean z2 = bArr3 != null;
            meVar.f2645 = 1;
            while (meVar.f2645 < i6) {
                if (z2) {
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

    private static int Camera2StreamConfigurationMap(java.lang.String str, int i, int i2) {
        while (i < i2) {
            getHighSpeedVideoSizesFor = (Camera2StreamConfigurationMap + 65) % 128;
            if (!getHighSpeedVideoFpsRanges(str.charAt(i))) {
                break;
            }
            int i3 = Camera2StreamConfigurationMap + 33;
            getHighSpeedVideoSizesFor = i3 % 128;
            i = i3 % 2 != 0 ? i + 56 : i + 1;
        }
        int i4 = getHighSpeedVideoSizesFor + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        Camera2StreamConfigurationMap = i4 % 128;
        if (i4 % 2 != 0) {
            return i;
        }
        throw new java.lang.ArithmeticException();
    }

    private int getHighSpeedVideoFpsRangesFor(java.io.OutputStream outputStream, char c, char c2, char c3, char c4) throws java.io.IOException {
        char c5 = this.f2212;
        if (c3 == c5) {
            if (c4 != c5) {
                int maxKeyCode = android.view.KeyEvent.getMaxKeyCode();
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI((maxKeyCode >> 16) + 565312017, (short) (114 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), (byte) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (android.view.ViewConfiguration.getTapTimeout() >> 16) + 1, 533346925 - android.view.MotionEvent.axisFromString(""), objArr);
                throw new java.io.IOException(((java.lang.String) objArr[0]).intern());
            }
            byte[] bArr = this.f2214;
            byte b = bArr[c];
            byte b2 = bArr[c2];
            if ((b | b2) >= 0) {
                outputStream.write((b << 2) | (b2 >> 4));
                return 1;
            }
            long zoomControlsTimeout = android.view.ViewConfiguration.getZoomControlsTimeout();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI((zoomControlsTimeout > 0L ? 1 : (zoomControlsTimeout == 0L ? 0 : -1)) + 565312016, (short) (114 - android.widget.ExpandableListView.getPackedPositionGroup(0L)), (byte) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 533346925 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), objArr2);
            throw new java.io.IOException(((java.lang.String) objArr2[0]).intern());
        }
        if (c4 == c5) {
            byte[] bArr2 = this.f2214;
            byte b3 = bArr2[c];
            byte b4 = bArr2[c2];
            byte b5 = bArr2[c3];
            if ((b3 | b4 | b5) >= 0) {
                outputStream.write((b3 << 2) | (b4 >> 4));
                outputStream.write((b5 >> 2) | (b4 << 4));
                return 2;
            }
            int alpha = android.graphics.Color.alpha(0);
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(565312017 - alpha, (short) ((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 114), (byte) android.view.View.MeasureSpec.makeMeasureSpec(0, 0), 1 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), android.widget.ExpandableListView.getPackedPositionGroup(0L) + 533346926, objArr3);
            throw new java.io.IOException(((java.lang.String) objArr3[0]).intern());
        }
        byte[] bArr3 = this.f2214;
        byte b6 = bArr3[c];
        byte b7 = bArr3[c2];
        byte b8 = bArr3[c3];
        byte b9 = bArr3[c4];
        if ((b6 | b7 | b8 | b9) >= 0) {
            outputStream.write((b6 << 2) | (b7 >> 4));
            outputStream.write((b7 << 4) | (b8 >> 2));
            outputStream.write((b8 << 6) | b9);
            return 3;
        }
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        try {
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI((elapsedRealtime > 0L ? 1 : (elapsedRealtime == 0L ? 0 : -1)) + 565312016, (short) (114 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16)), (byte) android.view.View.MeasureSpec.getMode(0), 1 - android.graphics.Color.alpha(0), 533346927 - (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)), objArr4);
            throw new java.io.IOException(((java.lang.String) objArr4[0]).intern());
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    @Override // util.h.xy.fa.b
    /* renamed from: ˊ */
    public final int mo26794(java.lang.String str, java.io.OutputStream outputStream) throws java.io.IOException {
        Camera2StreamConfigurationMap = (getHighSpeedVideoSizesFor + 65) % 128;
        byte[] bArr = new byte[54];
        int length = str.length();
        while (length > 0) {
            int i = getHighSpeedVideoSizesFor + 71;
            Camera2StreamConfigurationMap = i % 128;
            if (i % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            if (!getHighSpeedVideoFpsRanges(str.charAt(length - 1))) {
                break;
            }
            length--;
        }
        if (length == 0) {
            getHighSpeedVideoSizesFor = (Camera2StreamConfigurationMap + 79) % 128;
            return 0;
        }
        int i2 = length;
        int i3 = 0;
        while (i2 > 0 && i3 != 4) {
            int i4 = getHighSpeedVideoSizesFor + 73;
            Camera2StreamConfigurationMap = i4 % 128;
            if (i4 % 2 == 0) {
                if (getHighSpeedVideoFpsRanges(str.charAt(i2 >> 1))) {
                    i2--;
                }
                i3++;
                i2--;
            } else {
                if (getHighSpeedVideoFpsRanges(str.charAt(i2 - 1))) {
                    i2--;
                }
                i3++;
                i2--;
            }
        }
        int Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(str, 0, i2);
        int i5 = 0;
        int i6 = 0;
        while (Camera2StreamConfigurationMap2 < i2) {
            byte b = this.f2214[str.charAt(Camera2StreamConfigurationMap2)];
            int Camera2StreamConfigurationMap3 = Camera2StreamConfigurationMap(str, Camera2StreamConfigurationMap2 + 1, i2);
            byte b2 = this.f2214[str.charAt(Camera2StreamConfigurationMap3)];
            int Camera2StreamConfigurationMap4 = Camera2StreamConfigurationMap(str, Camera2StreamConfigurationMap3 + 1, i2);
            byte b3 = this.f2214[str.charAt(Camera2StreamConfigurationMap4)];
            int Camera2StreamConfigurationMap5 = Camera2StreamConfigurationMap(str, Camera2StreamConfigurationMap4 + 1, i2);
            byte b4 = this.f2214[str.charAt(Camera2StreamConfigurationMap5)];
            if ((b | b2 | b3 | b4) < 0) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 565311973, (short) ((-16777126) - android.graphics.Color.rgb(0, 0, 0)), (byte) android.view.KeyEvent.getDeadChar(0, 0), (-6) - android.view.KeyEvent.keyCodeFromString(""), android.graphics.Color.blue(0) + 533346926, objArr);
                throw new java.io.IOException(((java.lang.String) objArr[0]).intern());
            }
            bArr[i5] = (byte) ((b << 2) | (b2 >> 4));
            bArr[i5 + 1] = (byte) ((b2 << 4) | (b3 >> 2));
            int i7 = i5 + 3;
            bArr[i5 + 2] = (byte) ((b3 << 6) | b4);
            i6 += 3;
            if (i7 == 54) {
                outputStream.write(bArr);
                i5 = 0;
            } else {
                i5 = i7;
            }
            Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(str, Camera2StreamConfigurationMap5 + 1, i2);
        }
        if (i5 > 0) {
            outputStream.write(bArr, 0, i5);
        }
        int Camera2StreamConfigurationMap6 = Camera2StreamConfigurationMap(str, Camera2StreamConfigurationMap2, length);
        int Camera2StreamConfigurationMap7 = Camera2StreamConfigurationMap(str, Camera2StreamConfigurationMap6 + 1, length);
        int Camera2StreamConfigurationMap8 = Camera2StreamConfigurationMap(str, Camera2StreamConfigurationMap7 + 1, length);
        return i6 + getHighSpeedVideoFpsRangesFor(outputStream, str.charAt(Camera2StreamConfigurationMap6), str.charAt(Camera2StreamConfigurationMap7), str.charAt(Camera2StreamConfigurationMap8), str.charAt(Camera2StreamConfigurationMap(str, Camera2StreamConfigurationMap8 + 1, length)));
    }

    private static int getHighResolutionOutputSizeshNQ4ISI(byte[] bArr, int i, int i2) {
        while (i < i2 && getHighSpeedVideoFpsRanges((char) bArr[i])) {
            int i3 = (getHighSpeedVideoSizesFor + 51) % 128;
            Camera2StreamConfigurationMap = i3;
            i++;
            getHighSpeedVideoSizesFor = (i3 + 71) % 128;
        }
        return i;
    }

    @Override // util.h.xy.fa.b
    /* renamed from: ˊ */
    public final int mo26795(byte[] bArr, int i, int i2, java.io.OutputStream outputStream) throws java.io.IOException {
        byte[] bArr2 = new byte[54];
        int i3 = i + i2;
        while (i3 > i && getHighSpeedVideoFpsRanges((char) bArr[i3 - 1])) {
            i3--;
            getHighSpeedVideoSizesFor = (Camera2StreamConfigurationMap + 101) % 128;
        }
        if (i3 == 0) {
            return 0;
        }
        int i4 = i3;
        int i5 = 0;
        while (i4 > i && i5 != 4) {
            int i6 = Camera2StreamConfigurationMap + 91;
            getHighSpeedVideoSizesFor = i6 % 128;
            if (i6 % 2 != 0) {
                if (getHighSpeedVideoFpsRanges((char) bArr[i4 << 1])) {
                    i4--;
                }
                i5++;
                i4--;
            } else {
                if (getHighSpeedVideoFpsRanges((char) bArr[i4 - 1])) {
                    i4--;
                }
                i5++;
                i4--;
            }
        }
        int highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(bArr, i, i4);
        int i7 = 0;
        int i8 = 0;
        while (highResolutionOutputSizeshNQ4ISI < i4) {
            getHighSpeedVideoSizesFor = (Camera2StreamConfigurationMap + 5) % 128;
            byte b = this.f2214[bArr[highResolutionOutputSizeshNQ4ISI]];
            int highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI(bArr, highResolutionOutputSizeshNQ4ISI + 1, i4);
            byte b2 = this.f2214[bArr[highResolutionOutputSizeshNQ4ISI2]];
            int highResolutionOutputSizeshNQ4ISI3 = getHighResolutionOutputSizeshNQ4ISI(bArr, highResolutionOutputSizeshNQ4ISI2 + 1, i4);
            byte b3 = this.f2214[bArr[highResolutionOutputSizeshNQ4ISI3]];
            int highResolutionOutputSizeshNQ4ISI4 = getHighResolutionOutputSizeshNQ4ISI(bArr, highResolutionOutputSizeshNQ4ISI3 + 1, i4);
            byte b4 = this.f2214[bArr[highResolutionOutputSizeshNQ4ISI4]];
            if ((b | b2 | b3 | b4) < 0) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 565311972, (short) (89 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), (byte) android.view.Gravity.getAbsoluteGravity(0, 0), (-7) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), 533346926 - android.view.Gravity.getAbsoluteGravity(0, 0), objArr);
                throw new java.io.IOException(((java.lang.String) objArr[0]).intern());
            }
            bArr2[i7] = (byte) ((b << 2) | (b2 >> 4));
            bArr2[i7 + 1] = (byte) ((b2 << 4) | (b3 >> 2));
            int i9 = i7 + 3;
            bArr2[i7 + 2] = (byte) ((b3 << 6) | b4);
            if (i9 == 54) {
                int i10 = getHighSpeedVideoSizesFor + 121;
                Camera2StreamConfigurationMap = i10 % 128;
                outputStream.write(bArr2);
                i7 = i10 % 2 == 0 ? 1 : 0;
            } else {
                i7 = i9;
            }
            i8 += 3;
            highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(bArr, highResolutionOutputSizeshNQ4ISI4 + 1, i4);
        }
        if (i7 > 0) {
            outputStream.write(bArr2, 0, i7);
        }
        int highResolutionOutputSizeshNQ4ISI5 = getHighResolutionOutputSizeshNQ4ISI(bArr, highResolutionOutputSizeshNQ4ISI, i3);
        int highResolutionOutputSizeshNQ4ISI6 = getHighResolutionOutputSizeshNQ4ISI(bArr, highResolutionOutputSizeshNQ4ISI5 + 1, i3);
        int highResolutionOutputSizeshNQ4ISI7 = getHighResolutionOutputSizeshNQ4ISI(bArr, highResolutionOutputSizeshNQ4ISI6 + 1, i3);
        return i8 + getHighSpeedVideoFpsRangesFor(outputStream, (char) bArr[highResolutionOutputSizeshNQ4ISI5], (char) bArr[highResolutionOutputSizeshNQ4ISI6], (char) bArr[highResolutionOutputSizeshNQ4ISI7], (char) bArr[getHighResolutionOutputSizeshNQ4ISI(bArr, highResolutionOutputSizeshNQ4ISI7 + 1, i3)]);
    }

    private static boolean getHighSpeedVideoFpsRanges(char c) {
        if (c == '\n') {
            return true;
        }
        int i = getHighSpeedVideoSizesFor + 45;
        int i2 = i % 128;
        Camera2StreamConfigurationMap = i2;
        if (i % 2 == 0) {
            if (c == 'x') {
                return true;
            }
        } else if (c == '\r') {
            return true;
        }
        getHighSpeedVideoSizesFor = (i2 + 105) % 128;
        if (c == '\t' || c == ' ') {
            return true;
        }
        getHighSpeedVideoSizesFor = (i2 + 95) % 128;
        return false;
    }

    @Override // util.h.xy.fa.b
    /* renamed from: ˋ */
    public final int mo26796(byte[] bArr, int i, int i2, java.io.OutputStream outputStream) throws java.io.IOException {
        if (i2 < 0) {
            int i3 = getHighSpeedVideoSizesFor + 67;
            Camera2StreamConfigurationMap = i3 % 128;
            return i3 % 2 == 0 ? 1 : 0;
        }
        byte[] bArr2 = new byte[72];
        int i4 = i2;
        while (i4 > 0) {
            getHighSpeedVideoSizesFor = (Camera2StreamConfigurationMap + 3) % 128;
            int min = java.lang.Math.min(54, i4);
            outputStream.write(bArr2, 0, m26812(bArr, i, min, bArr2, 0));
            i += min;
            i4 -= min;
        }
        return ((i2 + 2) / 3) * 4;
    }

    @Override // util.h.xy.fa.b
    /* renamed from: ˎ */
    public final int mo26797(int i) {
        int i2 = (getHighSpeedVideoSizesFor + 97) % 128;
        Camera2StreamConfigurationMap = i2;
        int i3 = (i + 2) / 3;
        int i4 = i2 + 17;
        getHighSpeedVideoSizesFor = i4 % 128;
        if (i4 % 2 == 0) {
            return i3 * 4;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final int m26812(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws java.io.IOException {
        int i4 = i;
        int i5 = i3;
        while (i4 < (i + i2) - 2) {
            getHighSpeedVideoSizesFor = (Camera2StreamConfigurationMap + 29) % 128;
            byte b = bArr[i4];
            int i6 = bArr[i4 + 1] & 255;
            int i7 = i4 + 3;
            byte b2 = bArr[i4 + 2];
            byte[] bArr3 = this.f2213;
            bArr2[i5] = bArr3[(b >>> 2) & 63];
            bArr2[i5 + 1] = bArr3[((b << 4) | (i6 >>> 4)) & 63];
            bArr2[i5 + 2] = bArr3[((i6 << 2) | ((b2 & 255) >>> 6)) & 63];
            bArr2[i5 + 3] = bArr3[b2 & 63];
            i5 += 4;
            i4 = i7;
        }
        int i8 = i2 - (i4 - i);
        if (i8 == 1) {
            int i9 = bArr[i4] & 255;
            byte[] bArr4 = this.f2213;
            bArr2[i5] = bArr4[(i9 >>> 2) & 63];
            bArr2[i5 + 1] = bArr4[(i9 << 4) & 63];
            byte b3 = this.f2212;
            bArr2[i5 + 2] = b3;
            bArr2[i5 + 3] = b3;
            i5 += 4;
        } else if (i8 == 2) {
            int i10 = bArr[i4] & 255;
            int i11 = bArr[i4 + 1] & 255;
            byte[] bArr5 = this.f2213;
            bArr2[i5] = bArr5[(i10 >>> 2) & 63];
            bArr2[i5 + 1] = bArr5[((i10 << 4) | (i11 >>> 4)) & 63];
            bArr2[i5 + 2] = bArr5[(i11 << 2) & 63];
            bArr2[i5 + 3] = this.f2212;
            getHighSpeedVideoSizesFor = (Camera2StreamConfigurationMap + 7) % 128;
            i5 += 4;
        }
        return i5 - i3;
    }

    public ra() {
        m26813();
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    protected final void m26813() {
        int i = Camera2StreamConfigurationMap + 15;
        getHighSpeedVideoSizesFor = i % 128;
        int i2 = 0;
        int i3 = i % 2 != 0 ? 1 : 0;
        while (true) {
            byte[] bArr = this.f2214;
            if (i3 >= bArr.length) {
                break;
            }
            bArr[i3] = -1;
            i3++;
            Camera2StreamConfigurationMap = (getHighSpeedVideoSizesFor + 61) % 128;
        }
        while (true) {
            byte[] bArr2 = this.f2213;
            if (i2 >= bArr2.length) {
                return;
            }
            this.f2214[bArr2[i2]] = (byte) i2;
            i2++;
            getHighSpeedVideoSizesFor = (Camera2StreamConfigurationMap + 81) % 128;
        }
    }
}
