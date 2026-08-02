package util.h.xy.au;

/* loaded from: classes5.dex */
public final class mb implements com.gemalto.mfs.mwsdk.mobilegateway.MobileGatewayError {
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoSizes = 0;
    private static int getHighSpeedVideoSizesFor = 1;
    private static int getOutputMinFrameDuration;
    private java.lang.String getInputSizeshNQ4ISI;
    private int getOutputSizes;
    private int getOutputSizeshNQ4ISI;
    private com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode getOutputStallDuration;
    private java.lang.Exception getOutputStallDurationlomOqCM;
    private static char[] getInputFormats = {64397, 64391, 64410, 64389, 64446, 64425, 64430, 64424, 64427, 64405, 64407, 64404, 64401, 64426};
    private static int getHighResolutionOutputSizeshNQ4ISI = -1074856994;
    private static boolean getOutputFormats = true;
    private static boolean Camera2StreamConfigurationMap = true;
    private static int[] getHighSpeedVideoFpsRangesFor = {-199095633, 323542781, -264406267, 1370782473, -875662408, 902668271, -2062657718, 1196155196, 477589281, 1165808320, -1471457963, 439423014, 21390342, 723216019, -1118791116, -1493027149, 1601799511, -1162313316};

    public mb(com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode mGErrorCode, java.lang.String str) {
        this(mGErrorCode, -1, -1, str, null);
    }

    public mb(com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode mGErrorCode, int i, java.lang.String str) {
        this(mGErrorCode, -1, i, str, null);
    }

    public mb(java.lang.String str, java.lang.String str2) {
        this(com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.INTERNAL_ERROR, -1, -1, str2, null);
        getHighSpeedVideoFpsRanges(str);
    }

    public mb(java.lang.String str, int i, java.lang.String str2) {
        this(com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.INTERNAL_ERROR, -1, i, str2, null);
        getHighSpeedVideoFpsRanges(str);
    }

    public mb(com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode mGErrorCode, int i, int i2, java.lang.String str, java.lang.Exception exc) {
        this.getOutputStallDuration = mGErrorCode;
        this.getOutputSizes = i;
        this.getOutputSizeshNQ4ISI = i2;
        this.getInputSizeshNQ4ISI = str;
        this.getOutputStallDurationlomOqCM = exc;
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes(((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6) + 127, "\u0084\u0083\u0082\u0081", objArr);
            java.lang.String intern = ((java.lang.String) objArr[0]).intern();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoSizes((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 127, "\u0085", objArr2);
            sb.append(((java.lang.String) objArr2[0]).intern());
            sb.append(mGErrorCode);
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoSizes(android.graphics.Color.argb(0, 0, 0, 0) + 127, "\u0085", objArr3);
            sb.append(((java.lang.String) objArr3[0]).intern());
            sb.append(i2);
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoSizes((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 126, "\u0085", objArr4);
            sb.append(((java.lang.String) objArr4[0]).intern());
            sb.append(util.h.xy.al.rc.m25022(this.getOutputStallDurationlomOqCM));
            util.h.xy.am.ma.m25029(intern, sb.toString());
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.MobileGatewayError
    public final com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode getSDKErrorCode() {
        int i = getOutputMinFrameDuration + 107;
        getHighSpeedVideoSizesFor = i % 128;
        if (i % 2 != 0) {
            return this.getOutputStallDuration;
        }
        throw null;
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.MobileGatewayError
    public final int getServerErrorCode() {
        int i = getHighSpeedVideoSizesFor;
        getOutputMinFrameDuration = (i + 63) % 128;
        int i2 = this.getOutputSizes;
        int i3 = i + 31;
        getOutputMinFrameDuration = i3 % 128;
        if (i3 % 2 == 0) {
            return i2;
        }
        throw null;
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.MobileGatewayError
    public final int getHTTPStatusCode() {
        int i = getOutputMinFrameDuration;
        int i2 = i + 115;
        getHighSpeedVideoSizesFor = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i3 = this.getOutputSizeshNQ4ISI;
        getHighSpeedVideoSizesFor = (i + 67) % 128;
        return i3;
    }

    private static void Camera2StreamConfigurationMap(int[] iArr, int i, java.lang.Object[] objArr) {
        int i2;
        int length;
        int[] iArr2;
        int length2;
        int[] iArr3;
        int i3;
        util.h.xz.b.c cVar = new util.h.xz.b.c();
        char[] cArr = new char[4];
        int i4 = 2;
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr4 = getHighSpeedVideoFpsRangesFor;
        if (iArr4 != null) {
            int i5 = getHighSpeedVideoFpsRanges + 11;
            getHighSpeedVideoSizes = i5 % 128;
            if (i5 % 2 != 0) {
                length2 = iArr4.length;
                iArr3 = new int[length2];
                i3 = 1;
            } else {
                length2 = iArr4.length;
                iArr3 = new int[length2];
                i3 = 0;
            }
            while (i3 < length2) {
                iArr3[i3] = (int) (iArr4[i3] ^ (-5569649899877129369L));
                i3++;
            }
            iArr4 = iArr3;
        }
        int length3 = iArr4.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = getHighSpeedVideoFpsRangesFor;
        if (iArr6 != null) {
            int i6 = getHighSpeedVideoFpsRanges + 61;
            getHighSpeedVideoSizes = i6 % 128;
            if (i6 % 2 != 0) {
                length = iArr6.length;
                iArr2 = new int[length];
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
            }
            int i7 = 0;
            while (i7 < length) {
                int i8 = getHighSpeedVideoSizes + 79;
                getHighSpeedVideoFpsRanges = i8 % 128;
                if (i8 % i4 == 0) {
                    iArr2[i7] = (int) (iArr6[i7] / (-5569649899877129369L));
                    throw new java.lang.ArithmeticException();
                }
                iArr2[i7] = (int) (iArr6[i7] ^ (-5569649899877129369L));
                i7++;
                length3 = length3;
                i4 = 2;
            }
            i2 = length3;
            iArr6 = iArr2;
        } else {
            i2 = length3;
        }
        java.lang.System.arraycopy(iArr6, 0, iArr5, 0, i2);
        cVar.f2626 = 0;
        while (cVar.f2626 < iArr.length) {
            cArr[0] = (char) (iArr[cVar.f2626] >> 16);
            cArr[1] = (char) iArr[cVar.f2626];
            cArr[2] = (char) (iArr[cVar.f2626 + 1] >> 16);
            cArr[3] = (char) iArr[cVar.f2626 + 1];
            cVar.f2627 = (cArr[0] << 16) + cArr[1];
            cVar.f2625 = (cArr[2] << 16) + cArr[3];
            util.h.xz.b.c.m27723(iArr5);
            int i9 = 0;
            while (i9 < 16) {
                cVar.f2627 ^= iArr5[i9];
                cVar.f2625 = util.h.xz.b.c.m27724(cVar.f2627) ^ cVar.f2625;
                int i10 = cVar.f2627;
                cVar.f2627 = cVar.f2625;
                cVar.f2625 = i10;
                i9++;
                getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 59) % 128;
            }
            int i11 = cVar.f2627;
            cVar.f2627 = cVar.f2625;
            cVar.f2625 = i11;
            cVar.f2625 ^= iArr5[16];
            cVar.f2627 ^= iArr5[17];
            int i12 = cVar.f2627;
            int i13 = cVar.f2625;
            cArr[0] = (char) (cVar.f2627 >>> 16);
            cArr[1] = (char) cVar.f2627;
            cArr[2] = (char) (cVar.f2625 >>> 16);
            cArr[3] = (char) cVar.f2625;
            util.h.xz.b.c.m27723(iArr5);
            cArr2[cVar.f2626 * 2] = cArr[0];
            cArr2[(cVar.f2626 * 2) + 1] = cArr[1];
            cArr2[(cVar.f2626 * 2) + 2] = cArr[2];
            cArr2[(cVar.f2626 * 2) + 3] = cArr[3];
            cVar.f2626 += 2;
        }
        objArr[0] = new java.lang.String(cArr2, 0, i);
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.MobileGatewayError
    public final java.lang.String getMessage() {
        int i = getHighSpeedVideoSizesFor;
        getOutputMinFrameDuration = (i + 101) % 128;
        java.lang.String str = this.getInputSizeshNQ4ISI;
        int i2 = i + 109;
        getOutputMinFrameDuration = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    private void getHighSpeedVideoFpsRanges(java.lang.String str) {
        int hashCode = str.hashCode();
        if (hashCode == 1537214) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 127, "\u0087\u0087\u0087\u0088", objArr);
            if (str.equals(((java.lang.String) objArr[0]).intern())) {
                int i = getHighSpeedVideoSizesFor + 109;
                getOutputMinFrameDuration = i % 128;
                if (i % 2 == 0) {
                    this.getOutputStallDuration = com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.RESOURCE_NOT_FOUND;
                    return;
                }
            }
        } else if (hashCode == 1626587) {
            int[] iArr = {-585985794, -894980865};
            getOutputMinFrameDuration = (getHighSpeedVideoSizesFor + 115) % 128;
            try {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                Camera2StreamConfigurationMap(iArr, ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6) + 4, objArr2);
                if (str.equals(((java.lang.String) objArr2[0]).intern())) {
                    getOutputMinFrameDuration = (getHighSpeedVideoSizesFor + 25) % 128;
                    this.getOutputStallDuration = com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.UNKONOWN_IDV_METHOD;
                    return;
                }
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        } else if (hashCode != 434844702) {
            switch (hashCode) {
                case 1507423:
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    getHighSpeedVideoSizes(127 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), "\u0087\u0087\u0087\u0086", objArr3);
                    if (str.equals(((java.lang.String) objArr3[0]).intern())) {
                        this.getOutputStallDuration = com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.FPAN_NOT_ELIGIBLE;
                        return;
                    }
                    break;
                case 1507424:
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    Camera2StreamConfigurationMap(new int[]{240744357, 1330957950}, 4 - (android.view.ViewConfiguration.getTapTimeout() >> 16), objArr4);
                    if (str.equals(((java.lang.String) objArr4[0]).intern())) {
                        this.getOutputStallDuration = com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.UNKNOWN_BIN;
                        return;
                    }
                    break;
                case 1507425:
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    getHighSpeedVideoSizes(android.text.TextUtils.getOffsetBefore("", 0) + 127, "\u0088\u0087\u0087\u0086", objArr5);
                    if (str.equals(((java.lang.String) objArr5[0]).intern())) {
                        getHighSpeedVideoSizesFor = (getOutputMinFrameDuration + 107) % 128;
                        this.getOutputStallDuration = com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.UNKNOWN_CARD_PRODUCT;
                        return;
                    }
                    break;
                case 1507426:
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    getHighSpeedVideoSizes((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 127, "\u0089\u0087\u0087\u0086", objArr6);
                    if (str.equals(((java.lang.String) objArr6[0]).intern())) {
                        getOutputMinFrameDuration = (getHighSpeedVideoSizesFor + 125) % 128;
                        this.getOutputStallDuration = com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.CARD_PRODUCT_NOT_SUPPORTED;
                        return;
                    }
                    break;
                case 1507427:
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    Camera2StreamConfigurationMap(new int[]{814872159, -1994347771}, 4 - android.view.Gravity.getAbsoluteGravity(0, 0), objArr7);
                    if (str.equals(((java.lang.String) objArr7[0]).intern())) {
                        getHighSpeedVideoSizesFor = (getOutputMinFrameDuration + 43) % 128;
                        this.getOutputStallDuration = com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.INCORRECT_CVV;
                        return;
                    }
                    break;
                case 1507428:
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    getHighSpeedVideoSizes(android.view.View.resolveSize(0, 0) + 127, "\u008a\u0087\u0087\u0086", objArr8);
                    if (str.equals(((java.lang.String) objArr8[0]).intern())) {
                        this.getOutputStallDuration = com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.CARD_ALREADY_PROVISIONED_IN_WALLET;
                        return;
                    }
                    break;
                case 1507429:
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    Camera2StreamConfigurationMap(new int[]{1693120128, 1962717715}, android.graphics.Color.rgb(0, 0, 0) + 16777220, objArr9);
                    if (str.equals(((java.lang.String) objArr9[0]).intern())) {
                        this.getOutputStallDuration = com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.DEVICE_NOT_ELIGIBLE;
                        return;
                    }
                    break;
                case 1507430:
                    java.lang.Object[] objArr10 = new java.lang.Object[1];
                    getHighSpeedVideoSizes(128 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), "\u008b\u0087\u0087\u0086", objArr10);
                    if (str.equals(((java.lang.String) objArr10[0]).intern())) {
                        this.getOutputStallDuration = com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.INVALID_CARD_DATA;
                        return;
                    }
                    break;
                default:
                    switch (hashCode) {
                        case 1567006:
                            java.lang.Object[] objArr11 = new java.lang.Object[1];
                            Camera2StreamConfigurationMap(new int[]{540815582, -250631746}, android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - ',', objArr11);
                            if (str.equals(((java.lang.String) objArr11[0]).intern())) {
                                this.getOutputStallDuration = com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.INCORRECT_AUTHENTICATION_TOKEN;
                                return;
                            }
                            break;
                        case 1567007:
                            java.lang.Object[] objArr12 = new java.lang.Object[1];
                            Camera2StreamConfigurationMap(new int[]{893848271, -361837499}, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 5, objArr12);
                            if (str.equals(((java.lang.String) objArr12[0]).intern())) {
                                this.getOutputStallDuration = com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.CARD_PROVISIONING_COUNT_EXCEEDED;
                                return;
                            }
                            break;
                        default:
                            switch (hashCode) {
                                case 1656378:
                                    java.lang.Object[] objArr13 = new java.lang.Object[1];
                                    getHighSpeedVideoSizes(126 - android.graphics.ImageFormat.getBitsPerPixel(0), "\u0087\u0087\u0087\u008c", objArr13);
                                    if (str.equals(((java.lang.String) objArr13[0]).intern())) {
                                        this.getOutputStallDuration = com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.INCORRECT_OTP;
                                        return;
                                    }
                                    break;
                                case 1656379:
                                    java.lang.Object[] objArr14 = new java.lang.Object[1];
                                    Camera2StreamConfigurationMap(new int[]{1618045492, 1026059488}, 4 - android.text.TextUtils.getTrimmedLength(""), objArr14);
                                    if (str.equals(((java.lang.String) objArr14[0]).intern())) {
                                        this.getOutputStallDuration = com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.INCORRECT_OTP_MAX_TRY_EXCEEDED;
                                        return;
                                    }
                                    break;
                                case 1656380:
                                    java.lang.Object[] objArr15 = new java.lang.Object[1];
                                    getHighSpeedVideoSizes(android.text.TextUtils.indexOf("", "", 0, 0) + 127, "\u0088\u0087\u0087\u008c", objArr15);
                                    if (str.equals(((java.lang.String) objArr15[0]).intern())) {
                                        this.getOutputStallDuration = com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.OTP_EXPIRED;
                                        return;
                                    }
                                    break;
                                case 1656381:
                                    java.lang.Object[] objArr16 = new java.lang.Object[1];
                                    Camera2StreamConfigurationMap(new int[]{1102092858, -217547644}, 4 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), objArr16);
                                    if (str.equals(((java.lang.String) objArr16[0]).intern())) {
                                        this.getOutputStallDuration = com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.IDV_METHOD_NOT_AVAILABLE;
                                        return;
                                    }
                                    break;
                                default:
                                    switch (hashCode) {
                                        case 1745751:
                                            java.lang.Object[] objArr17 = new java.lang.Object[1];
                                            Camera2StreamConfigurationMap(new int[]{-993824249, 1525326987}, 3 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr17);
                                            if (str.equals(((java.lang.String) objArr17[0]).intern())) {
                                                this.getOutputStallDuration = com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.UNEXPECTED_INTERNAL_ERROR;
                                                return;
                                            }
                                            break;
                                        case 1745752:
                                            java.lang.Object[] objArr18 = new java.lang.Object[1];
                                            getHighSpeedVideoSizes((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 127, "\u0086\u0087\u0087\u008d", objArr18);
                                            if (str.equals(((java.lang.String) objArr18[0]).intern())) {
                                                int i2 = getOutputMinFrameDuration + 107;
                                                getHighSpeedVideoSizesFor = i2 % 128;
                                                if (i2 % 2 != 0) {
                                                    this.getOutputStallDuration = com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.EXTERNAL_SYSTEM_UNAVAILABLE;
                                                    return;
                                                }
                                            }
                                            break;
                                        case 1745753:
                                            java.lang.Object[] objArr19 = new java.lang.Object[1];
                                            getHighSpeedVideoSizes(127 - android.view.View.MeasureSpec.getMode(0), "\u0088\u0087\u0087\u008d", objArr19);
                                            if (str.equals(((java.lang.String) objArr19[0]).intern())) {
                                                int i3 = getOutputMinFrameDuration + 45;
                                                getHighSpeedVideoSizesFor = i3 % 128;
                                                if (i3 % 2 != 0) {
                                                    this.getOutputStallDuration = com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.UNKNOWN_WALLET_PROVIDER_ID;
                                                    return;
                                                }
                                            }
                                            break;
                                        case 1745754:
                                            java.lang.Object[] objArr20 = new java.lang.Object[1];
                                            Camera2StreamConfigurationMap(new int[]{-58893045, 325189031}, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 5, objArr20);
                                            if (str.equals(((java.lang.String) objArr20[0]).intern())) {
                                                getHighSpeedVideoSizesFor = (getOutputMinFrameDuration + 41) % 128;
                                                this.getOutputStallDuration = com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.UNKNOWN_WALLET_ID;
                                                return;
                                            }
                                            break;
                                        case 1745755:
                                            java.lang.Object[] objArr21 = new java.lang.Object[1];
                                            getHighSpeedVideoSizes(128 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), "\u008e\u0087\u0087\u008d", objArr21);
                                            if (str.equals(((java.lang.String) objArr21[0]).intern())) {
                                                this.getOutputStallDuration = com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.UNKNOWN_DIGITAL_CARD_ID;
                                                return;
                                            }
                                            break;
                                        case 1745756:
                                            java.lang.Object[] objArr22 = new java.lang.Object[1];
                                            getHighSpeedVideoSizes(127 - android.view.View.MeasureSpec.getMode(0), "\u008a\u0087\u0087\u008d", objArr22);
                                            if (str.equals(((java.lang.String) objArr22[0]).intern())) {
                                                this.getOutputStallDuration = com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.UNKNOWN_CORRELATION_ID;
                                                return;
                                            }
                                            break;
                                        case 1745757:
                                            java.lang.Object[] objArr23 = new java.lang.Object[1];
                                            getHighSpeedVideoSizes(android.text.TextUtils.getOffsetAfter("", 0) + 127, "\u008c\u0087\u0087\u008d", objArr23);
                                            if (str.equals(((java.lang.String) objArr23[0]).intern())) {
                                                this.getOutputStallDuration = com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.CARD_STATE_DOES_NOT_ALLOW_REQUESTED_OPERATION;
                                                return;
                                            }
                                            break;
                                        case 1745758:
                                            java.lang.Object[] objArr24 = new java.lang.Object[1];
                                            Camera2StreamConfigurationMap(new int[]{708869390, 1103578227}, (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 4, objArr24);
                                            if (str.equals(((java.lang.String) objArr24[0]).intern())) {
                                                this.getOutputStallDuration = com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.OPERATION_ALREADY_ONGOING;
                                                return;
                                            }
                                            break;
                                        case 1745759:
                                            java.lang.Object[] objArr25 = new java.lang.Object[1];
                                            Camera2StreamConfigurationMap(new int[]{-1211243660, 2012061987}, (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 4, objArr25);
                                            if (str.equals(((java.lang.String) objArr25[0]).intern())) {
                                                this.getOutputStallDuration = com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.OPERATION_FAILED;
                                                return;
                                            }
                                            break;
                                        case 1745760:
                                            java.lang.Object[] objArr26 = new java.lang.Object[1];
                                            Camera2StreamConfigurationMap(new int[]{1544148131, -62791930}, 4 - android.view.View.resolveSize(0, 0), objArr26);
                                            if (str.equals(((java.lang.String) objArr26[0]).intern())) {
                                                this.getOutputStallDuration = com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.UNKNOWN_DEVICE_ID;
                                                return;
                                            }
                                            break;
                                        default:
                                            switch (hashCode) {
                                                case 1745782:
                                                    java.lang.Object[] objArr27 = new java.lang.Object[1];
                                                    Camera2StreamConfigurationMap(new int[]{1539543786, -1425768924}, 4 - android.graphics.Color.blue(0), objArr27);
                                                    if (str.equals(((java.lang.String) objArr27[0]).intern())) {
                                                        this.getOutputStallDuration = com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.MISSING_REQUIRED_PARAMETER;
                                                        return;
                                                    }
                                                    break;
                                                case 1745783:
                                                    java.lang.Object[] objArr28 = new java.lang.Object[1];
                                                    Camera2StreamConfigurationMap(new int[]{232765829, 1692731168}, (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 4, objArr28);
                                                    if (str.equals(((java.lang.String) objArr28[0]).intern())) {
                                                        this.getOutputStallDuration = com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.UNKNOWN_ISSUER_ID;
                                                        return;
                                                    }
                                                    break;
                                                case 1745784:
                                                    java.lang.Object[] objArr29 = new java.lang.Object[1];
                                                    getHighSpeedVideoSizes(126 - android.graphics.ImageFormat.getBitsPerPixel(0), "\u0088\u0086\u0087\u008d", objArr29);
                                                    if (str.equals(((java.lang.String) objArr29[0]).intern())) {
                                                        getOutputMinFrameDuration = (getHighSpeedVideoSizesFor + 111) % 128;
                                                        this.getOutputStallDuration = com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.UNKNOWN_CARD_ID;
                                                        return;
                                                    }
                                                    break;
                                                default:
                                                    switch (hashCode) {
                                                        case 47653683:
                                                            java.lang.Object[] objArr30 = new java.lang.Object[1];
                                                            Camera2StreamConfigurationMap(new int[]{-931436934, 577955476, 835316955, 1375496377}, (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 4, objArr30);
                                                            if (str.equals(((java.lang.String) objArr30[0]).intern())) {
                                                                this.getOutputStallDuration = com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.INVALID_ASSET_TYPE;
                                                                return;
                                                            }
                                                            break;
                                                        case 47653684:
                                                            java.lang.Object[] objArr31 = new java.lang.Object[1];
                                                            getHighSpeedVideoSizes(127 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), "\u0088\u0087\u0087\u0087\u0088", objArr31);
                                                            if (str.equals(((java.lang.String) objArr31[0]).intern())) {
                                                                this.getOutputStallDuration = com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.INVALID_ASSET_VERSION;
                                                                return;
                                                            }
                                                            break;
                                                        case 47653685:
                                                            java.lang.Object[] objArr32 = new java.lang.Object[1];
                                                            getHighSpeedVideoSizes(127 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), "\u0089\u0087\u0087\u0087\u0088", objArr32);
                                                            if (str.equals(((java.lang.String) objArr32[0]).intern())) {
                                                                this.getOutputStallDuration = com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.ASSET_NOT_AVAILABLE;
                                                                return;
                                                            }
                                                            break;
                                                    }
                                            }
                                    }
                            }
                    }
            }
        } else {
            java.lang.Object[] objArr33 = new java.lang.Object[1];
            Camera2StreamConfigurationMap(new int[]{-988592649, 2129963240, 374163185, -471806441, -1896926658, 1686790980}, 9 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr33);
            if (str.equals(((java.lang.String) objArr33[0]).intern())) {
                this.getOutputStallDuration = com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.INTERNAL_ERROR;
                return;
            }
        }
        this.getOutputStallDuration = com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.SERVER_ERROR;
        try {
            this.getOutputSizes = java.lang.Integer.parseInt(str);
        } catch (java.lang.NumberFormatException unused) {
            this.getOutputStallDuration = com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.INTERNAL_ERROR;
        }
    }

    private static void getHighSpeedVideoSizes(int i, java.lang.String str, java.lang.Object[] objArr) {
        byte[] bytes = str.getBytes("ISO-8859-1");
        util.h.xz.b.md mdVar = new util.h.xz.b.md();
        char[] cArr = getInputFormats;
        if (cArr != null) {
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 11) % 128;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i2 = 0; i2 < length; i2++) {
                cArr2[i2] = (char) (cArr[i2] ^ (-3299939579226817547L));
            }
            cArr = cArr2;
        }
        int i3 = (int) ((-3299939579226817547L) ^ getHighResolutionOutputSizeshNQ4ISI);
        if (!Camera2StreamConfigurationMap) {
            if (!getOutputFormats) {
                throw null;
            }
            throw null;
        }
        mdVar.f2642 = bytes.length;
        char[] cArr3 = new char[mdVar.f2642];
        mdVar.f2643 = 0;
        while (mdVar.f2643 < mdVar.f2642) {
            cArr3[mdVar.f2643] = (char) (cArr[bytes[(mdVar.f2642 - 1) - mdVar.f2643] + i] - i3);
            mdVar.f2643++;
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.MobileGatewayError
    public final java.lang.Exception getCausingException() {
        int i = getHighSpeedVideoSizesFor + 121;
        getOutputMinFrameDuration = i % 128;
        if (i % 2 == 0) {
            return this.getOutputStallDurationlomOqCM;
        }
        throw null;
    }
}
