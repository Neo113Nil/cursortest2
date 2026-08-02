package util.h.xy.bf;

/* loaded from: classes18.dex */
public final class ra {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighResolutionOutputSizeshNQ4ISI = 36;
    private static final java.lang.String getHighSpeedVideoSizes = "ra";

    static /* synthetic */ java.lang.String Camera2StreamConfigurationMap() {
        int i = Camera2StreamConfigurationMap;
        int i2 = ((i ^ 31) + ((i & 31) << 1)) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i2;
        java.lang.String str = getHighSpeedVideoSizes;
        Camera2StreamConfigurationMap = (((i2 | 59) << 1) - (i2 ^ 59)) % 128;
        return str;
    }

    /* renamed from: util.h.xy.bf.ra$2, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass2 {
        private static int getHighResolutionOutputSizeshNQ4ISI = 0;
        static final /* synthetic */ int[] getHighSpeedVideoFpsRanges;
        private static int getHighSpeedVideoFpsRangesFor = 1;

        static {
            int[] iArr = new int[com.gemalto.mfs.mwsdk.sdkconfig.SDKServiceState.values().length];
            getHighSpeedVideoFpsRanges = iArr;
            try {
                iArr[com.gemalto.mfs.mwsdk.sdkconfig.SDKServiceState.STATE_NOT_INITIALIZED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.gemalto.mfs.mwsdk.sdkconfig.SDKServiceState.STATE_INITIALIZING_IN_PROGRESS.ordinal()] = 2;
                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 3) % 128;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.gemalto.mfs.mwsdk.sdkconfig.SDKServiceState.STATE_INITIALIZED.ordinal()] = 3;
                int i = getHighResolutionOutputSizeshNQ4ISI;
                getHighSpeedVideoFpsRangesFor = ((i ^ 125) + ((i & 125) << 1)) % 128;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 77) % 128;
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static byte[] m25448(final com.gemalto.mfs.mwsdk.payment.PaymentServiceListener paymentServiceListener) {
        int i = Camera2StreamConfigurationMap;
        int i2 = (i ^ 91) + ((i & 91) << 1);
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            final com.gemalto.mfs.mwsdk.sdkconfig.SDKServiceState sDKServiceState = com.gemalto.mfs.mwsdk.sdkconfig.SDKController.getInstance().getSDKServiceState();
            int i3 = util.h.xy.bf.ra.AnonymousClass2.getHighSpeedVideoFpsRanges[sDKServiceState.ordinal()];
            if (i3 == 1 || i3 == 2) {
                util.h.xy.ag.a.m24556().m24557(new java.lang.Runnable() { // from class: util.h.xy.bf.ra.3
                    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
                    private static int getHighSpeedVideoFpsRangesFor = 1;
                    private static int getHighSpeedVideoSizes = 0;
                    private static int getHighSpeedVideoSizesFor = -1231763885;
                    private static int getOutputMinFrameDuration = 1;

                    @Override // java.lang.Runnable
                    public final void run() {
                        com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode paymentServiceErrorCode;
                        java.lang.String intern;
                        com.gemalto.mfs.mwsdk.payment.engine.ContactlessPaymentServiceListener contactlessPaymentServiceListener = (com.gemalto.mfs.mwsdk.payment.engine.ContactlessPaymentServiceListener) com.gemalto.mfs.mwsdk.payment.PaymentServiceListener.this;
                        if (contactlessPaymentServiceListener == null) {
                            util.h.xy.bf.ra.Camera2StreamConfigurationMap();
                            return;
                        }
                        getOutputMinFrameDuration = (getHighSpeedVideoSizes + 101) % 128;
                        util.h.xy.bf.ra.Camera2StreamConfigurationMap();
                        if (com.gemalto.mfs.mwsdk.sdkconfig.SDKServiceState.STATE_NOT_INITIALIZED == sDKServiceState) {
                            paymentServiceErrorCode = com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.PAYMENT_NOT_ALLOWED_SDK_NOT_INITIALIZED;
                            int edgeSlop = android.view.ViewConfiguration.getEdgeSlop();
                            getOutputMinFrameDuration = (getHighSpeedVideoSizes + 59) % 128;
                            try {
                                java.lang.Object[] objArr = new java.lang.Object[1];
                                getHighSpeedVideoFpsRangesFor("\uffef￨\ufff7ￄ\u0017\u0005ￄ\b\t\u001b\u0013\u0010\u0010\u0005ￄ\u0018\u0013\u0012ￄ\u0017\rￄ\u0018\u0012\t\u0011\u001d\u0005\u0014ￄ\b\t\u001e\r\u0010\u0005\r\u0018\r\u0012\rￄ\u0018\u0013\u0012ￄ\u0017\rￄ", (edgeSlop >> 16) + 49, 29 - ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6), 288 - android.view.MotionEvent.axisFromString(""), true, objArr);
                                intern = ((java.lang.String) objArr[0]).intern();
                            } catch (java.lang.Throwable th) {
                                java.lang.Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        } else {
                            paymentServiceErrorCode = com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.PAYMENT_NOT_ALLOWED_SDK_INIT_ONGOING;
                            java.lang.Object[] objArr2 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor("\u0012\u0003\u001b\u000f\u0007\u0010\u0016ￂ\u000b\u0015ￂ\u0010\u0011\u0016ￂ\u0003\u000e\u000e\u0011\u0019\u0007\u0006ￂ\u0003\u0015ￂ\ufff5￦￭ￂ￫\u0010\u000b\u0016\u000b\u0003\u000e\u000b\u001c\u0003\u0016\u000b\u0011\u0010ￂ\u000b\u0015ￂ\u0011\u0010\t\u0011\u000b\u0010\t", 55 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), 54 - android.view.MotionEvent.axisFromString(""), 290 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), false, objArr2);
                            intern = ((java.lang.String) objArr2[0]).intern();
                        }
                        util.h.xy.bf.ra.Camera2StreamConfigurationMap();
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor("\ufff9\u0002\u0006\uffff", (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 4, (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1, (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE, false, objArr3);
                        java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor("￼\u0000\u000e\u0003￩\u000e\t\u0004￩\n\u0000", android.text.TextUtils.getOffsetAfter("", 0) + 11, 10 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), 265 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), false, objArr4);
                        util.h.xy.am.ma.m25027(intern2, ((java.lang.String) objArr4[0]).intern());
                        util.h.xy.bf.ma.m25415(contactlessPaymentServiceListener, paymentServiceErrorCode, intern);
                        getHighSpeedVideoSizes = (getOutputMinFrameDuration + 31) % 128;
                    }

                    private static void getHighSpeedVideoFpsRangesFor(java.lang.String str, int i4, int i5, int i6, boolean z, java.lang.Object[] objArr) {
                        char[] charArray = str.toCharArray();
                        util.h.xz.b.ra raVar = new util.h.xz.b.ra();
                        char[] cArr = new char[i4];
                        raVar.f2649 = 0;
                        while (raVar.f2649 < i4) {
                            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 65) % 128;
                            raVar.f2650 = charArray[raVar.f2649];
                            cArr[raVar.f2649] = (char) (raVar.f2650 + i6);
                            int i7 = raVar.f2649;
                            cArr[i7] = (char) (cArr[i7] - ((int) (getHighSpeedVideoSizesFor ^ (-4839292868003314026L))));
                            raVar.f2649++;
                        }
                        if (i5 > 0) {
                            raVar.f2648 = i5;
                            char[] cArr2 = new char[i4];
                            java.lang.System.arraycopy(cArr, 0, cArr2, 0, i4);
                            java.lang.System.arraycopy(cArr2, 0, cArr, i4 - raVar.f2648, raVar.f2648);
                            java.lang.System.arraycopy(cArr2, raVar.f2648, cArr, 0, i4 - raVar.f2648);
                            int i8 = getHighSpeedVideoFpsRangesFor + 37;
                            getHighResolutionOutputSizeshNQ4ISI = i8 % 128;
                            int i9 = i8 % 2;
                        }
                        if (z) {
                            char[] cArr3 = new char[i4];
                            raVar.f2649 = 0;
                            while (raVar.f2649 < i4) {
                                int i10 = getHighResolutionOutputSizeshNQ4ISI + 89;
                                getHighSpeedVideoFpsRangesFor = i10 % 128;
                                if (i10 % 2 == 0) {
                                    cArr3[raVar.f2649] = cArr[i4 << raVar.f2649];
                                    int i11 = raVar.f2649;
                                    throw new java.lang.ArithmeticException();
                                }
                                cArr3[raVar.f2649] = cArr[(i4 - raVar.f2649) - 1];
                                raVar.f2649++;
                            }
                            cArr = cArr3;
                        }
                        objArr[0] = new java.lang.String(cArr);
                    }
                });
                byte[] bArr = {105, -123};
                int i4 = Camera2StreamConfigurationMap + 17;
                getHighResolutionOutputSizeshNQ4ISI = i4 % 128;
                if (i4 % 2 == 0) {
                    return bArr;
                }
                throw null;
            }
            int i5 = getHighResolutionOutputSizeshNQ4ISI;
            Camera2StreamConfigurationMap = ((i5 & 89) + (i5 | 89)) % 128;
            return null;
        }
        int i6 = util.h.xy.bf.ra.AnonymousClass2.getHighSpeedVideoFpsRanges[com.gemalto.mfs.mwsdk.sdkconfig.SDKController.getInstance().getSDKServiceState().ordinal()];
        throw null;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static byte[] m25444(com.gemalto.mfs.mwsdk.payment.PaymentServiceListener paymentServiceListener, boolean z) {
        int i = Camera2StreamConfigurationMap;
        int i2 = (i ^ 63) + ((i & 63) << 1);
        int i3 = i2 % 128;
        getHighResolutionOutputSizeshNQ4ISI = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (!z) {
            int i4 = i3 + 93;
            Camera2StreamConfigurationMap = i4 % 128;
            if (i4 % 2 != 0) {
                if (!util.h.xy.al.c.m25004(util.h.xy.ag.a.m24556().m24558())) {
                    byte[] bArr = {106, -126};
                    int i5 = getHighResolutionOutputSizeshNQ4ISI + 77;
                    Camera2StreamConfigurationMap = i5 % 128;
                    if (i5 % 2 != 0) {
                        return bArr;
                    }
                    throw null;
                }
            } else {
                util.h.xy.al.c.m25004(util.h.xy.ag.a.m24556().m24558());
                throw null;
            }
        }
        int i6 = Camera2StreamConfigurationMap;
        int i7 = (i6 ^ 79) + ((i6 & 79) << 1);
        getHighResolutionOutputSizeshNQ4ISI = i7 % 128;
        if (i7 % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static byte[] m25443(final com.gemalto.mfs.mwsdk.payment.PaymentServiceListener paymentServiceListener) {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = ((i | 115) << 1) - (i ^ 115);
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 != 0) {
            if (!util.h.xy.p.a.m27020()) {
                util.h.xy.ag.a.m24556().m24557(new java.lang.Runnable() { // from class: util.h.xy.bf.ra.1
                    private static int Camera2StreamConfigurationMap = 1;
                    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
                    private static int[] getHighSpeedVideoFpsRanges = {-1683597275, -645382379, 1256534528, 1461213350, 1086343960, -762925514, 1370397186, 1177553108, 323233391, 523199318, 1175862146, -1809830834, 728411690, 1450007533, -572011068, 900225136, -1432312996, 454606723};
                    private static int getHighSpeedVideoSizes;
                    private static int getOutputMinFrameDuration;

                    private static void getHighResolutionOutputSizeshNQ4ISI(int[] iArr, int i3, java.lang.Object[] objArr) {
                        util.h.xz.b.c cVar = new util.h.xz.b.c();
                        char[] cArr = new char[4];
                        char[] cArr2 = new char[iArr.length * 2];
                        int[] iArr2 = getHighSpeedVideoFpsRanges;
                        if (iArr2 != null) {
                            int length = iArr2.length;
                            int[] iArr3 = new int[length];
                            int i4 = 0;
                            while (i4 < length) {
                                int i5 = Camera2StreamConfigurationMap;
                                int i6 = i5 + 107;
                                getHighSpeedVideoSizes = i6 % 128;
                                if (i6 % 2 != 0) {
                                    iArr3[i4] = (int) (iArr2[i4] * (-5569649899877129369L));
                                    i4 <<= 1;
                                } else {
                                    iArr3[i4] = (int) (iArr2[i4] ^ (-5569649899877129369L));
                                    i4++;
                                }
                                getHighSpeedVideoSizes = (i5 + 9) % 128;
                            }
                            iArr2 = iArr3;
                        }
                        int length2 = iArr2.length;
                        int[] iArr4 = new int[length2];
                        int[] iArr5 = getHighSpeedVideoFpsRanges;
                        if (iArr5 != null) {
                            Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 3) % 128;
                            int length3 = iArr5.length;
                            int[] iArr6 = new int[length3];
                            int i7 = 0;
                            while (i7 < length3) {
                                iArr6[i7] = (int) (iArr5[i7] ^ (-5569649899877129369L));
                                i7++;
                                length3 = length3;
                            }
                            iArr5 = iArr6;
                        }
                        java.lang.System.arraycopy(iArr5, 0, iArr4, 0, length2);
                        cVar.f2626 = 0;
                        while (cVar.f2626 < iArr.length) {
                            Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 59) % 128;
                            cArr[0] = (char) (iArr[cVar.f2626] >> 16);
                            cArr[1] = (char) iArr[cVar.f2626];
                            cArr[2] = (char) (iArr[cVar.f2626 + 1] >> 16);
                            cArr[3] = (char) iArr[cVar.f2626 + 1];
                            cVar.f2627 = (cArr[0] << 16) + cArr[1];
                            cVar.f2625 = (cArr[2] << 16) + cArr[3];
                            util.h.xz.b.c.m27723(iArr4);
                            for (int i8 = 0; i8 < 16; i8++) {
                                cVar.f2627 ^= iArr4[i8];
                                cVar.f2625 = util.h.xz.b.c.m27724(cVar.f2627) ^ cVar.f2625;
                                int i9 = cVar.f2627;
                                cVar.f2627 = cVar.f2625;
                                cVar.f2625 = i9;
                            }
                            int i10 = cVar.f2627;
                            cVar.f2627 = cVar.f2625;
                            cVar.f2625 = i10;
                            cVar.f2625 ^= iArr4[16];
                            cVar.f2627 ^= iArr4[17];
                            int i11 = cVar.f2627;
                            int i12 = cVar.f2625;
                            cArr[0] = (char) (cVar.f2627 >>> 16);
                            cArr[1] = (char) cVar.f2627;
                            cArr[2] = (char) (cVar.f2625 >>> 16);
                            cArr[3] = (char) cVar.f2625;
                            util.h.xz.b.c.m27723(iArr4);
                            cArr2[cVar.f2626 * 2] = cArr[0];
                            cArr2[(cVar.f2626 * 2) + 1] = cArr[1];
                            cArr2[(cVar.f2626 * 2) + 2] = cArr[2];
                            cArr2[(cVar.f2626 * 2) + 3] = cArr[3];
                            cVar.f2626 += 2;
                        }
                        objArr[0] = new java.lang.String(cArr2, 0, i3);
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i3 = getOutputMinFrameDuration + 89;
                        int i4 = i3 % 128;
                        getHighResolutionOutputSizeshNQ4ISI = i4;
                        if (i3 % 2 != 0) {
                            com.gemalto.mfs.mwsdk.payment.engine.ContactlessPaymentServiceListener contactlessPaymentServiceListener = (com.gemalto.mfs.mwsdk.payment.engine.ContactlessPaymentServiceListener) com.gemalto.mfs.mwsdk.payment.PaymentServiceListener.this;
                            if (contactlessPaymentServiceListener == null) {
                                util.h.xy.bf.ra.Camera2StreamConfigurationMap();
                                getHighResolutionOutputSizeshNQ4ISI = (getOutputMinFrameDuration + 83) % 128;
                            } else {
                                getOutputMinFrameDuration = (i4 + 105) % 128;
                                util.h.xy.bf.ra.Camera2StreamConfigurationMap();
                                util.h.xy.bf.ra.Camera2StreamConfigurationMap();
                                java.lang.Object[] objArr = new java.lang.Object[1];
                                getHighResolutionOutputSizeshNQ4ISI(new int[]{1057259338, 221903477}, 4 - android.graphics.Color.blue(0), objArr);
                                java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                                java.lang.Object[] objArr2 = new java.lang.Object[1];
                                getHighResolutionOutputSizeshNQ4ISI(new int[]{287041702, -225642146, 1951017679, 769169507, -293166054, -2020231691}, 11 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr2);
                                util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
                                com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode paymentServiceErrorCode = com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.PAYMENT_NOT_ALLOWED_UPGRADE_NEEDED;
                                java.lang.Object[] objArr3 = new java.lang.Object[1];
                                getHighResolutionOutputSizeshNQ4ISI(new int[]{-2072259371, -1676858249, -2059199523, 1374133743, -2012867282, 2087290262, -1823985704, 1501106358, -1204389583, -278311336, -67813543, -96546868, 1470548090, -167812640, 102578002, -1547357735, -22133572, -1816544419, -2117472907, 2079628328, -805798619, -1583991305, 205615868, -96076122, 2120048805, 1439430717, 672223742, 1071942256, -1848135119, -322516677, -1174969074, 424335460}, 63 - android.text.TextUtils.getTrimmedLength(""), objArr3);
                                util.h.xy.bf.ma.m25415(contactlessPaymentServiceListener, paymentServiceErrorCode, ((java.lang.String) objArr3[0]).intern());
                            }
                            int i5 = getOutputMinFrameDuration + 83;
                            getHighResolutionOutputSizeshNQ4ISI = i5 % 128;
                            if (i5 % 2 == 0) {
                                throw null;
                            }
                            return;
                        }
                        throw null;
                    }
                });
                return new byte[]{105, -123};
            }
            int i3 = Camera2StreamConfigurationMap + 3;
            getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
            if (i3 % 2 == 0) {
                return null;
            }
            throw new java.lang.ArithmeticException();
        }
        util.h.xy.p.a.m27020();
        throw null;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static void m25445() {
        getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 53) % 128;
        try {
            if (util.h.xy.al.c.m25003()) {
                Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 89) % 128;
                util.h.xy.al.a.m25002(true);
                Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 41) % 128;
            }
        } catch (java.lang.Exception e) {
            e.getMessage();
        }
        int i = Camera2StreamConfigurationMap + 19;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static byte[] m25446(com.gemalto.mfs.mwsdk.payment.PaymentServiceListener paymentServiceListener) {
        new java.util.HashMap();
        com.gemalto.mfs.mwsdk.payment.engine.ContactlessPaymentServiceListener contactlessPaymentServiceListener = (com.gemalto.mfs.mwsdk.payment.engine.ContactlessPaymentServiceListener) paymentServiceListener;
        int m24554 = util.h.xy.af.mb.m24551().m24554();
        if (m24554 == -91) {
            int i = Camera2StreamConfigurationMap;
            getHighResolutionOutputSizeshNQ4ISI = ((i & 43) + (i | 43)) % 128;
            return null;
        }
        int i2 = Camera2StreamConfigurationMap;
        getHighResolutionOutputSizeshNQ4ISI = ((i2 ^ 57) + ((i2 & 57) << 1)) % 128;
        util.h.xy.bf.ma.m25425(contactlessPaymentServiceListener, m24554);
        byte[] bArr = {105, -123};
        int i3 = Camera2StreamConfigurationMap;
        getHighResolutionOutputSizeshNQ4ISI = (((i3 | 83) << 1) - (i3 ^ 83)) % 128;
        return bArr;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static byte[] m25447(java.lang.Exception exc, com.gemalto.mfs.mwsdk.payment.PaymentServiceListener paymentServiceListener) {
        int i = Camera2StreamConfigurationMap;
        getHighResolutionOutputSizeshNQ4ISI = ((i ^ 99) + ((i & 99) << 1)) % 128;
        exc.getMessage();
        util.h.xy.bf.ma.m25415((com.gemalto.mfs.mwsdk.payment.engine.ContactlessPaymentServiceListener) paymentServiceListener, com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.INTERNAL_ERROR, exc.getMessage());
        byte[] bArr = util.h.xy.bf.b.f925;
        int i2 = Camera2StreamConfigurationMap + 9;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            return bArr;
        }
        throw null;
    }
}
