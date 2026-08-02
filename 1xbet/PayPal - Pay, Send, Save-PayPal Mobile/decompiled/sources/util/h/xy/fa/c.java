package util.h.xy.fa;

/* loaded from: classes5.dex */
public final class c implements util.h.xy.fa.b {
    private static int Camera2StreamConfigurationMap = 0;
    private static byte[] getHighResolutionOutputSizeshNQ4ISI = {org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, -53, 37, -100, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, -53, -59, com.visa.cbp.getEncExpo.onUnminimized, 106, -35, -111, 100, 39, 43, -43, 41, -34, 33, -34, -44, 45, -47, -99, 117, -39, -43, 41, -55, -38, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, -55, 33, -35, -101, 100, 35, 37, -45, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -48, -35, 33, -35, 47, 38, -39, -117, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, -53, -59, com.visa.cbp.getEncExpo.onUnminimized, 106, -35, -111, 100, 39, 43, -43, 41, -34, 33, -34, -44, 45, -47, -99, 117, -39, -43, 41, -55, -38, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, -55, 33, -35, -101, 100, 35, 37, -45, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -48, -35, -40, 47, -33, -106, 99, -37, -102, 116, -35, -39, -40, -43, 38, -101, 33, 109, 38, -39, -108, 39, 36, -37, 37, -34, 38, 45, 37, -117, com.visa.cbp.getEncExpo.IResultReceiver2, 44, -43, 33, -47, 33, -108, 118, -37, -104, 19, 46, -43, com.visa.cbp.getEncExpo.registerForActivityResult, 116, -41, 42, -43, -40, 47, -105, 100, 35, 37, -45, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -48, -35, -39, -43, 41, -55, -38, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, -55, 33, -35, -101, 98, 47, -105, 118, -43, -37, 45, 32, -33, -106, 106, -47, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, -55, -99, 106, -43, com.visa.cbp.getEncExpo.registerForActivityResult, 99, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, -51, 33, -112, 116, -39, 38, -48, -107, 97, 33, -35, -35, 45, -44, 45, -47, -99, 108, -45, 44, -36, -34, 38, -39, -37, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, -53, 37, -112, 103, -40, -40, -40, -40, -40};
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes = 98021379;
    private static short[] getHighSpeedVideoSizesFor = null;
    private static int getInputFormats = 0;
    private static int getOutputFormats = -408873007;
    private static int getOutputMinFrameDuration = -303070731;

    /* renamed from: ˏ, reason: contains not printable characters */
    protected final byte[] f2211 = {48, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, 56, 57, 97, 98, 99, 100, 101, 102};

    /* renamed from: ˋ, reason: contains not printable characters */
    protected final byte[] f2210 = new byte[128];

    private static void getHighSpeedVideoFpsRangesFor(int i, short s, byte b, int i2, int i3, java.lang.Object[] objArr) {
        int i4;
        boolean z;
        int length;
        byte[] bArr;
        util.h.xz.b.me meVar = new util.h.xz.b.me();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i5 = i2 + ((int) (getOutputFormats ^ (-2689713159175858216L)));
        if (i5 == -1) {
            getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 97) % 128;
            i4 = 1;
        } else {
            i4 = 0;
        }
        if (i4 != 0) {
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 23) % 128;
            byte[] bArr2 = getHighResolutionOutputSizeshNQ4ISI;
            if (bArr2 != null) {
                int length2 = bArr2.length;
                byte[] bArr3 = new byte[length2];
                for (int i6 = 0; i6 < length2; i6++) {
                    bArr3[i6] = (byte) (bArr2[i6] ^ (-2689713159175858216L));
                }
                bArr2 = bArr3;
            }
            i5 = bArr2 != null ? (byte) (((byte) (getHighResolutionOutputSizeshNQ4ISI[((int) (getHighSpeedVideoSizes ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getOutputFormats ^ (-2689713159175858216L)))) : (short) (((short) (getHighSpeedVideoSizesFor[((int) (getHighSpeedVideoSizes ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getOutputFormats ^ (-2689713159175858216L))));
        }
        if (i5 > 0) {
            meVar.f2647 = ((i + i5) - 2) + ((int) (getHighSpeedVideoSizes ^ (-2689713159175858216L))) + i4;
            meVar.f2644 = (char) (i3 + ((int) (getOutputMinFrameDuration ^ (-2689713159175858216L))));
            sb.append(meVar.f2644);
            meVar.f2646 = meVar.f2644;
            byte[] bArr4 = getHighResolutionOutputSizeshNQ4ISI;
            if (bArr4 != null) {
                int i7 = Camera2StreamConfigurationMap + 3;
                getHighSpeedVideoFpsRangesFor = i7 % 128;
                if (i7 % 2 == 0) {
                    length = bArr4.length;
                    bArr = new byte[length];
                } else {
                    length = bArr4.length;
                    bArr = new byte[length];
                }
                for (int i8 = 0; i8 < length; i8++) {
                    bArr[i8] = (byte) (bArr4[i8] ^ (-2689713159175858216L));
                }
                bArr4 = bArr;
            }
            if (bArr4 != null) {
                int i9 = (getHighSpeedVideoFpsRangesFor + 69) % 128;
                Camera2StreamConfigurationMap = i9;
                getHighSpeedVideoFpsRangesFor = (i9 + 59) % 128;
                z = true;
            } else {
                z = false;
            }
            meVar.f2645 = 1;
            while (meVar.f2645 < i5) {
                if (z) {
                    byte[] bArr5 = getHighResolutionOutputSizeshNQ4ISI;
                    meVar.f2647 = meVar.f2647 - 1;
                    meVar.f2644 = (char) (meVar.f2646 + (((byte) (((byte) (bArr5[r9] ^ (-2689713159175858216L))) + s)) ^ b));
                    int i10 = Camera2StreamConfigurationMap + 17;
                    getHighSpeedVideoFpsRangesFor = i10 % 128;
                    int i11 = i10 % 2;
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

    final byte[] getHighSpeedVideoSizes(java.lang.String str, int i, int i2) throws java.io.IOException {
        if (str == null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 495540345, (short) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1), (byte) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), android.text.TextUtils.getOffsetBefore("", 0) + 11, android.text.TextUtils.getTrimmedLength("") - 172922374, objArr);
            throw new java.lang.NullPointerException(((java.lang.String) objArr[0]).intern());
        }
        if (i < 0 || i2 < 0 || i > str.length() - i2) {
            try {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 495540364, (short) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1), (byte) (android.graphics.Color.rgb(0, 0, 0) + 16777216), 28 - ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue(), android.graphics.drawable.Drawable.resolveOpacity(0, 0) - 172922308, objArr2);
                throw new java.lang.IndexOutOfBoundsException(((java.lang.String) objArr2[0]).intern());
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        if ((i2 & 1) != 0) {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(495540401 - (android.view.ViewConfiguration.getTouchSlop() >> 8), (short) android.text.TextUtils.indexOf("", ""), (byte) (android.view.ViewConfiguration.getTouchSlop() >> 8), 51 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (-172922316) - android.view.View.resolveSize(0, 0), objArr3);
            throw new java.io.IOException(((java.lang.String) objArr3[0]).intern());
        }
        int i3 = i2 >>> 1;
        byte[] bArr = new byte[i3];
        int i4 = 0;
        while (i4 < i3) {
            int i5 = i + 2;
            int i6 = this.f2210[str.charAt(i + 1)] | (this.f2210[str.charAt(i)] << 4);
            if (i6 < 0) {
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(android.text.TextUtils.indexOf("", "", 0, 0) + 495540302, (short) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (byte) (1 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 34 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) - 172922307, objArr4);
                throw new java.io.IOException(((java.lang.String) objArr4[0]).intern());
            }
            bArr[i4] = (byte) i6;
            i4++;
            i = i5;
        }
        return bArr;
    }

    @Override // util.h.xy.fa.b
    /* renamed from: ˊ */
    public final int mo26794(java.lang.String str, java.io.OutputStream outputStream) throws java.io.IOException {
        byte[] bArr = new byte[36];
        int length = str.length();
        while (length > 0 && getHighSpeedVideoFpsRangesFor(str.charAt(length - 1))) {
            length--;
        }
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            while (i < length && getHighSpeedVideoFpsRangesFor(str.charAt(i))) {
                i++;
            }
            int i4 = i + 1;
            byte b = this.f2210[str.charAt(i)];
            while (i4 < length && getHighSpeedVideoFpsRangesFor(str.charAt(i4))) {
                i4++;
            }
            byte b2 = this.f2210[str.charAt(i4)];
            if ((b | b2) < 0) {
                try {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(495540301 - ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue(), (short) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), (byte) android.view.View.getDefaultSize(0, 0), 35 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (-172922308) - (android.view.KeyEvent.getMaxKeyCode() >> 16), objArr);
                    throw new java.io.IOException(((java.lang.String) objArr[0]).intern());
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            int i5 = i2 + 1;
            bArr[i2] = (byte) ((b << 4) | b2);
            if (i5 == 36) {
                outputStream.write(bArr);
                i2 = 0;
            } else {
                i2 = i5;
            }
            i3++;
            i = i4 + 1;
        }
        if (i2 > 0) {
            outputStream.write(bArr, 0, i2);
        }
        return i3;
    }

    @Override // util.h.xy.fa.b
    /* renamed from: ˊ */
    public final int mo26795(byte[] bArr, int i, int i2, java.io.OutputStream outputStream) throws java.io.IOException {
        byte[] bArr2;
        int i3;
        int i4;
        int i5 = getInputFormats + 77;
        getHighSpeedVideoFpsRanges = i5 % 128;
        if (i5 % 2 == 0) {
            bArr2 = new byte[68];
            i3 = i << i2;
            i4 = 1;
        } else {
            bArr2 = new byte[36];
            i3 = i2 + i;
            i4 = 0;
        }
        while (i3 > i && getHighSpeedVideoFpsRangesFor((char) bArr[i3 - 1])) {
            i3--;
        }
        int i6 = i4;
        while (i < i3) {
            while (i < i3) {
                int i7 = getHighSpeedVideoFpsRanges + 91;
                getInputFormats = i7 % 128;
                if (i7 % 2 != 0) {
                    getHighSpeedVideoFpsRangesFor((char) bArr[i]);
                    throw new java.lang.ArithmeticException();
                }
                if (!getHighSpeedVideoFpsRangesFor((char) bArr[i])) {
                    break;
                }
                i++;
            }
            int i8 = i + 1;
            byte b = this.f2210[bArr[i]];
            while (i8 < i3) {
                int i9 = getInputFormats + 31;
                getHighSpeedVideoFpsRanges = i9 % 128;
                if (i9 % 2 == 0) {
                    getHighSpeedVideoFpsRangesFor((char) bArr[i8]);
                    throw new java.lang.ArithmeticException();
                }
                if (!getHighSpeedVideoFpsRangesFor((char) bArr[i8])) {
                    break;
                }
                i8++;
            }
            byte b2 = this.f2210[bArr[i8]];
            if ((b | b2) < 0) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(android.text.TextUtils.getCapsMode("", 0, 0) + 495540261, (short) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1), (byte) android.graphics.drawable.Drawable.resolveOpacity(0, 0), 33 - android.graphics.Color.alpha(0), (-172922308) - android.view.KeyEvent.getDeadChar(0, 0), objArr);
                throw new java.io.IOException(((java.lang.String) objArr[0]).intern());
            }
            int i10 = i4 + 1;
            bArr2[i4] = (byte) ((b << 4) | b2);
            if (i10 == bArr2.length) {
                outputStream.write(bArr2);
                i4 = 0;
            } else {
                i4 = i10;
            }
            i6++;
            i = i8 + 1;
        }
        if (i4 > 0) {
            getInputFormats = (getHighSpeedVideoFpsRanges + 51) % 128;
            outputStream.write(bArr2, 0, i4);
        }
        getHighSpeedVideoFpsRanges = (getInputFormats + 69) % 128;
        return i6;
    }

    private static boolean getHighSpeedVideoFpsRangesFor(char c) {
        int i = getInputFormats + 27;
        int i2 = i % 128;
        getHighSpeedVideoFpsRanges = i2;
        if (i % 2 == 0) {
            if (c == 'o') {
                return true;
            }
        } else if (c == '\n') {
            return true;
        }
        if (c == '\r' || c == '\t') {
            return true;
        }
        int i3 = i2 + 69;
        getInputFormats = i3 % 128;
        return i3 % 2 != 0 ? c == '>' : c == ' ';
    }

    @Override // util.h.xy.fa.b
    /* renamed from: ˋ */
    public final int mo26796(byte[] bArr, int i, int i2, java.io.OutputStream outputStream) throws java.io.IOException {
        int i3 = (getHighSpeedVideoFpsRanges + 55) % 128;
        getInputFormats = i3;
        if (i2 < 0) {
            int i4 = (i3 + 105) % 128;
            getHighSpeedVideoFpsRanges = i4;
            getInputFormats = (i4 + 47) % 128;
            return 0;
        }
        byte[] bArr2 = new byte[72];
        int i5 = i2;
        while (i5 > 0) {
            getHighSpeedVideoFpsRanges = (getInputFormats + 65) % 128;
            int min = java.lang.Math.min(36, i5);
            outputStream.write(bArr2, 0, m26798(bArr, i, min, bArr2, 0));
            i += min;
            i5 -= min;
        }
        return i2 * 2;
    }

    @Override // util.h.xy.fa.b
    /* renamed from: ˎ */
    public final int mo26797(int i) {
        int i2 = getInputFormats + 79;
        getHighSpeedVideoFpsRanges = i2 % 128;
        return i2 % 2 == 0 ? i + 2 : i * 2;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final int m26798(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws java.io.IOException {
        int i4;
        int i5;
        int i6 = getInputFormats;
        getHighSpeedVideoFpsRanges = (i6 + 71) % 128;
        int i7 = i6 + 33;
        getHighSpeedVideoFpsRanges = i7 % 128;
        int i8 = i7 % 2;
        int i9 = i;
        int i10 = i3;
        while (i9 < i2 + i) {
            int i11 = getHighSpeedVideoFpsRanges + 91;
            getInputFormats = i11 % 128;
            if (i11 % 2 != 0) {
                i4 = i9 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                byte b = bArr[i9];
                byte[] bArr3 = this.f2211;
                bArr2[i10] = bArr3[(b & 1196) % 5];
                i5 = i10 + 14;
                bArr2[i10 + 4] = bArr3[b & 4];
            } else {
                i4 = i9 + 1;
                byte b2 = bArr[i9];
                byte[] bArr4 = this.f2211;
                bArr2[i10] = bArr4[(b2 & 255) >>> 4];
                i5 = i10 + 2;
                bArr2[i10 + 1] = bArr4[b2 & com.google.common.base.Ascii.SI];
            }
            i9 = i4;
            i10 = i5;
        }
        return i10 - i3;
    }

    public c() {
        m26799();
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    protected final void m26799() {
        int i = getHighSpeedVideoFpsRanges;
        getInputFormats = (i + 51) % 128;
        getInputFormats = (i + 61) % 128;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            byte[] bArr = this.f2210;
            if (i3 >= bArr.length) {
                break;
            }
            bArr[i3] = -1;
            i3++;
        }
        while (true) {
            byte[] bArr2 = this.f2211;
            if (i2 >= bArr2.length) {
                byte[] bArr3 = this.f2210;
                bArr3[65] = bArr3[97];
                bArr3[66] = bArr3[98];
                bArr3[67] = bArr3[99];
                bArr3[68] = bArr3[100];
                bArr3[69] = bArr3[101];
                bArr3[70] = bArr3[102];
                return;
            }
            getHighSpeedVideoFpsRanges = (getInputFormats + 13) % 128;
            this.f2210[bArr2[i2]] = (byte) i2;
            i2++;
        }
    }
}
