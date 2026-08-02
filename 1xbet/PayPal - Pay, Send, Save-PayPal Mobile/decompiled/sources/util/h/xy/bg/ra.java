package util.h.xy.bg;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ˎ' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes18.dex */
public final class ra {
    private static int Camera2StreamConfigurationMap = 1;
    private static final /* synthetic */ util.h.xy.bg.ra[] getHighResolutionOutputSizeshNQ4ISI;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static final java.lang.String getHighSpeedVideoFpsRangesFor;
    private static int getHighSpeedVideoSizes;
    private static int getInputFormats;
    private static int getOutputMinFrameDuration;

    /* renamed from: ˎ, reason: contains not printable characters */
    public static final util.h.xy.bg.ra f945;

    private ra(java.lang.String str) {
    }

    static /* synthetic */ java.lang.String getHighSpeedVideoSizes() {
        int i = Camera2StreamConfigurationMap;
        getInputFormats = (i + 79) % 128;
        java.lang.String str = getHighSpeedVideoFpsRangesFor;
        int i2 = i + 49;
        getInputFormats = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    public static util.h.xy.bg.ra valueOf(java.lang.String str) {
        int i = Camera2StreamConfigurationMap + 93;
        getInputFormats = i % 128;
        util.h.xy.bg.ra raVar = (util.h.xy.bg.ra) java.lang.Enum.valueOf(util.h.xy.bg.ra.class, str);
        if (i % 2 == 0) {
            return raVar;
        }
        throw new java.lang.ArithmeticException();
    }

    public static util.h.xy.bg.ra[] values() {
        getInputFormats = (Camera2StreamConfigurationMap + 23) % 128;
        util.h.xy.bg.ra[] raVarArr = (util.h.xy.bg.ra[]) getHighResolutionOutputSizeshNQ4ISI.clone();
        int i = getInputFormats + 25;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 != 0) {
            return raVarArr;
        }
        throw null;
    }

    static {
        Camera2StreamConfigurationMap();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("\ufffb\ufff9\u0004\ufff7\n\t\u0004\uffff", (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 7, android.view.View.resolveSize(0, 0) + 8, 111 - android.view.View.resolveSizeAndState(0, 0, 0), true, objArr);
        util.h.xy.bg.ra raVar = new util.h.xy.bg.ra(((java.lang.String) objArr[0]).intern());
        f945 = raVar;
        int i = (getInputFormats + 111) % 128;
        Camera2StreamConfigurationMap = i;
        getInputFormats = (i + 107) % 128;
        getHighResolutionOutputSizeshNQ4ISI = new util.h.xy.bg.ra[]{raVar};
        getHighSpeedVideoFpsRangesFor = "ra";
        int i2 = i + 79;
        getInputFormats = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final byte[] m25460(util.h.xy.bf.a aVar) {
        com.gemalto.mfs.mwsdk.payment.engine.PaymentService activatedPaymentService;
        int i = getInputFormats + 11;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 == 0) {
            aVar.m25397();
            throw new java.lang.ArithmeticException();
        }
        if (!aVar.m25397()) {
            com.gemalto.mfs.mwsdk.payment.PaymentBusinessService paymentBusinessService = com.gemalto.mfs.mwsdk.payment.PaymentBusinessManager.getPaymentBusinessService();
            if (paymentBusinessService == null || (activatedPaymentService = paymentBusinessService.getActivatedPaymentService()) == null) {
                return null;
            }
            if (!(activatedPaymentService instanceof util.h.xy.bq.rd)) {
                int i2 = Camera2StreamConfigurationMap + 91;
                getInputFormats = i2 % 128;
                if (i2 % 2 != 0) {
                    throw new java.lang.ArithmeticException();
                }
                if (!(activatedPaymentService instanceof util.h.xy.bq.mb)) {
                    return null;
                }
            }
            ((util.h.xy.bq.a) activatedPaymentService).m25552();
            return null;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        util.h.xy.bf.ra.m25445();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("\u0012\u000f￦\u0005\f\u0004\u000e\u0001\bￚ\u0013\u0013\u0005\u0003\u000f\u0012\ufff0\u0005\u0012\ufff0ￚ\u0004\u0001\u0005\u0012\b\ufff4\ufff5￤\ufff0￡\u0004\u0005\u000b\u0003\u000f￬\u0005\u0003\t\u0016\u0005￤", 43 - android.view.Gravity.getAbsoluteGravity(0, 0), 30 - android.graphics.ImageFormat.getBitsPerPixel(0), android.graphics.Color.red(0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE, true, objArr);
        util.h.xy.bh.mb.m25480(((java.lang.String) objArr[0]).intern(), currentTimeMillis);
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        byte[] m25444 = util.h.xy.bf.ra.m25444(util.h.xy.bf.c.f934.m25413(), aVar.m25406());
        if (m25444 != null) {
            return m25444;
        }
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("\u0005ￛ\ufff1\u0013\u0006\ufff1\u0013\u0010\u0004\u0006\u0014\u0014ￛ￥\u0006\u0017\n\u0004\u0006\ufff4\u0004\u0013\u0006\u0006\u000f\ufff0\u0007\u0007￢\ufff1￥\ufff6\ufff5\t\u0013\u0006\u0002", 37 - android.text.TextUtils.indexOf("", "", 0), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 29, 132 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), false, objArr2);
        util.h.xy.bh.mb.m25480(((java.lang.String) objArr2[0]).intern(), currentTimeMillis2);
        getInputFormats = (Camera2StreamConfigurationMap + 93) % 128;
        return null;
    }

    private static void getHighSpeedVideoFpsRanges(java.lang.String str, int i, int i2, int i3, boolean z, java.lang.Object[] objArr) {
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 79) % 128;
        char[] charArray = str.toCharArray();
        util.h.xz.b.ra raVar = new util.h.xz.b.ra();
        char[] cArr = new char[i];
        raVar.f2649 = 0;
        while (raVar.f2649 < i) {
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 107) % 128;
            raVar.f2650 = charArray[raVar.f2649];
            cArr[raVar.f2649] = (char) (raVar.f2650 + i3);
            int i4 = raVar.f2649;
            cArr[i4] = (char) (cArr[i4] - ((int) (getOutputMinFrameDuration ^ (-4839292868003314026L))));
            raVar.f2649++;
        }
        if (i2 > 0) {
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

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m25463(util.h.xy.bf.a aVar) {
        Camera2StreamConfigurationMap = (getInputFormats + 33) % 128;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        util.h.xy.bk.mb.f982.m25507();
        util.h.xy.bt.mb.EnumC0263mb.f1040.m25626(util.h.xy.bt.mb.ma.f1038);
        util.h.xy.bt.ra.EnumC0264ra.f1049.m25629(util.h.xy.bt.ra.mb.f1046);
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("\u0012\u0011\ufffe\u0011\ufff0\u0011\u000b\u0002\u000f\u0002\u0003\u0003\u0006￡\u0011\u0002\u0010ￗ\u0010\u0010\u0002\u0000\f\u000f￭\u000b\f\u0006\u0011\ufffe\u0013\u0006\u0011\u0000\uffdeￗ\u0001\ufffe\u0002\u000f\u0005\ufff1\ufff2￡￭\uffde\u0010", 48 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 45 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 136, true, objArr);
        util.h.xy.bh.mb.m25480(((java.lang.String) objArr[0]).intern(), currentTimeMillis2);
        try {
            if (!util.h.xy.bg.a.f944.m25454().await(200L, java.util.concurrent.TimeUnit.MILLISECONDS)) {
                return;
            }
            try {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges("\u000e\t\u0014￬\u0001\u0014\u0003\b￡\ufff0￤\ufff5\ufff4\b\u0012\u0005\u0001\u0004ￚ\u0017\u0001\t\u0014￦\u000f\u0012￮\u0001\u0014\t\u0016\u0005￩", 34 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)) + 7, 134 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), false, objArr2);
                util.h.xy.bh.mb.m25480(((java.lang.String) objArr2[0]).intern(), currentTimeMillis2);
                long currentTimeMillis3 = java.lang.System.currentTimeMillis();
                if (new util.h.xy.bt.mb(com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS, null, util.h.xy.bt.mb.ra.f1041, new util.h.xy.bt.a() { // from class: util.h.xy.bg.ra.1
                    private static int getHighSpeedVideoFpsRangesFor = 0;
                    private static int getHighSpeedVideoSizes = 1;

                    @Override // util.h.xy.bt.a
                    /* renamed from: ˏ, reason: contains not printable characters */
                    public final void mo25464(int i, java.lang.String str, java.lang.Throwable th) {
                        int i2;
                        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 79) % 128;
                        if (i == 1) {
                            util.h.xy.bf.mc.m25436(com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.NO_DEFAULT_CARD, str);
                            util.h.xy.bt.mb.EnumC0263mb.f1040.m25626(util.h.xy.bt.mb.ma.f1039);
                            int i3 = getHighSpeedVideoFpsRangesFor;
                            i2 = (i3 & 77) + (i3 | 77);
                        } else {
                            if (i != 2) {
                                if (i == 3) {
                                    util.h.xy.bf.mc.m25436(com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.OPERATION_NOT_ALLOWED, str);
                                }
                                int i4 = getHighSpeedVideoSizes;
                                getHighSpeedVideoFpsRangesFor = ((i4 & 1) + (i4 | 1)) % 128;
                            }
                            util.h.xy.bf.mc.m25436(com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.UNSUPPORTED_CARD_TYPE, str);
                            int i5 = getHighSpeedVideoFpsRangesFor;
                            i2 = ((i5 | 111) << 1) - (i5 ^ 111);
                        }
                        getHighSpeedVideoSizes = i2 % 128;
                        int i42 = getHighSpeedVideoSizes;
                        getHighSpeedVideoFpsRangesFor = ((i42 & 1) + (i42 | 1)) % 128;
                    }
                }).m25625()) {
                    int i = Camera2StreamConfigurationMap + 93;
                    getInputFormats = i % 128;
                    if (i % 2 != 0) {
                        util.h.xy.bm.b.f983.m25513(util.h.xy.f.a.f2193);
                        throw null;
                    }
                    if (util.h.xy.bm.b.f983.m25513(util.h.xy.f.a.f2193)) {
                        new util.h.xy.bt.b().m25622(null);
                        getInputFormats = (Camera2StreamConfigurationMap + 71) % 128;
                    }
                }
                int scrollBarSize = android.view.ViewConfiguration.getScrollBarSize();
                int capsMode = android.text.TextUtils.getCapsMode("", 0, 0);
                Camera2StreamConfigurationMap = (getInputFormats + 125) % 128;
                try {
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges("\u0012\u0005\u0001\u0004ￚ￡\u0003\u0014\t\u0016\u0001\u0014\t\u000f\u000e\ufff0\u0012\u000f\u0003\u0005\u0013\u0013ￚ\t\u0013￦\t\f\u0005￤\u0001\u0014\u0001￣\u0001\u0003\b\u0005\u0004￡\ufff0￤\ufff5\ufff4\b", 45 - (scrollBarSize >> 8), capsMode + 39, 133 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22), false, objArr3);
                    util.h.xy.bh.mb.m25480(((java.lang.String) objArr3[0]).intern(), currentTimeMillis3);
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges("\u0011\u0004\u0000\u0003\uffd9￠\u0002\u0013\b\u0015\u0000\u0013\b\u000e\r\uffef\u0011\u000e\u0002\u0004\u0012\u0012￠\uffef￣\ufff4\ufff3\u0007", 28 - android.view.View.MeasureSpec.getMode(0), 22 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), android.view.View.resolveSizeAndState(0, 0, 0) + 134, false, objArr4);
                    util.h.xy.bh.mb.m25480(((java.lang.String) objArr4[0]).intern(), currentTimeMillis);
                } catch (java.lang.Throwable th) {
                    th = th;
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
            }
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m25462() {
        int i = getInputFormats + 87;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 == 0) {
            util.h.xy.bt.mb.EnumC0263mb.f1040.m25627();
            util.h.xy.bt.mb.ma maVar = util.h.xy.bt.mb.ma.f1037;
            throw null;
        }
        if (util.h.xy.bt.mb.EnumC0263mb.f1040.m25627() == util.h.xy.bt.mb.ma.f1037) {
            new util.h.xy.bt.ra(com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS, null, util.h.xy.bt.ra.a.f1043, new util.h.xy.bt.a() { // from class: util.h.xy.bg.ra.4
                private static int Camera2StreamConfigurationMap = 1;
                private static int getHighSpeedVideoSizes;

                @Override // util.h.xy.bt.a
                /* renamed from: ˏ */
                public final void mo25464(int i2, java.lang.String str, java.lang.Throwable th) {
                    Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 15) % 128;
                    switch (i2) {
                        case 1:
                            util.h.xy.bf.mc.m25436(com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.PAYMENT_WRONG_STATE, str);
                            break;
                        case 2:
                            util.h.xy.bf.mc.m25436(com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.UNSUPPORTED_CARD_TYPE, str);
                            int i3 = getHighSpeedVideoSizes + 85;
                            Camera2StreamConfigurationMap = i3 % 128;
                            if (i3 % 2 == 0) {
                                int i4 = 4 / 5;
                                break;
                            }
                            break;
                        case 3:
                            util.h.xy.bf.mc.m25436(com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.OPERATION_NOT_ALLOWED, str);
                            break;
                        case 4:
                            util.h.xy.bf.mc.m25436(com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.CARD_NOT_EXISTING, str);
                            break;
                        case 5:
                            util.h.xy.bk.ma.m25504().m25505(util.h.xy.bk.b.f981, new util.h.xy.bk.ra(java.lang.Boolean.FALSE));
                            break;
                        case 6:
                            util.h.xy.bf.mc.m25436(com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.KEY_STORE_INACCESSIBLE, str);
                            break;
                    }
                    Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 89) % 128;
                }
            }).m25628();
        } else {
            com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode paymentServiceErrorCode = com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.NO_DEFAULT_CARD;
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("\u0011\u0018\u000e\r\u001a\u0001ￌ￦\u0001\ufff0￼￭ \u001f\uffdd\u0011\u001e\u001cￌ￼\ufff2￼\u001a\u001b\ufffa\t\uffdeￜￜ\uffd9\ufff1\ufff0\ufffb\uffef\u0007ￌￍ\u0010\u001e\r\u000fￌ \u0018!\r\u0012\u0011\u0010ￌ\u0011\u0014 ￌ\u0011 \r\"\u0015 \u000f\rￌ\u001b ￌ", android.graphics.ImageFormat.getBitsPerPixel(0) + 67, (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 25, android.graphics.Color.red(0) + 121, true, objArr);
            util.h.xy.bf.mc.m25436(paymentServiceErrorCode, ((java.lang.String) objArr[0]).intern());
            getInputFormats = (Camera2StreamConfigurationMap + 13) % 128;
        }
        int i2 = getInputFormats + 103;
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m25461() {
        util.h.xy.bg.a.f944.m25457(new java.util.concurrent.CountDownLatch(1));
        java.lang.Thread thread = new java.lang.Thread(new java.lang.Runnable() { // from class: util.h.xy.bg.ra.3
            private static int getHighResolutionOutputSizeshNQ4ISI = 1;
            private static int getHighSpeedVideoFpsRanges = 0;
            private static int getHighSpeedVideoFpsRangesFor = -1231763929;
            private static int getHighSpeedVideoSizes = 1;
            private static int getInputFormats;

            private static void Camera2StreamConfigurationMap(java.lang.String str, int i, int i2, int i3, boolean z, java.lang.Object[] objArr) {
                int i4 = getHighResolutionOutputSizeshNQ4ISI + 33;
                getHighSpeedVideoFpsRanges = i4 % 128;
                if (i4 % 2 != 0) {
                    throw new java.lang.ArithmeticException();
                }
                char[] charArray = str.toCharArray();
                util.h.xz.b.ra raVar = new util.h.xz.b.ra();
                char[] cArr = new char[i];
                raVar.f2649 = 0;
                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 57) % 128;
                while (raVar.f2649 < i) {
                    getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 45) % 128;
                    raVar.f2650 = charArray[raVar.f2649];
                    cArr[raVar.f2649] = (char) (raVar.f2650 + i3);
                    int i5 = raVar.f2649;
                    cArr[i5] = (char) (cArr[i5] - ((int) (getHighSpeedVideoFpsRangesFor ^ (-4839292868003314026L))));
                    raVar.f2649++;
                }
                if (i2 > 0) {
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

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    if (!util.h.xy.bg.a.f944.m25450().await(200L, java.util.concurrent.TimeUnit.MILLISECONDS)) {
                        util.h.xy.bg.ra.getHighSpeedVideoSizes();
                        return;
                    }
                    if (util.h.xy.bt.mb.EnumC0263mb.f1040.m25627() == util.h.xy.bt.mb.ma.f1037) {
                        long currentTimeMillis = java.lang.System.currentTimeMillis();
                        util.h.xy.bg.ra.getHighSpeedVideoSizes();
                        new util.h.xy.bt.ma(com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS, null, util.h.xy.bt.ra.a.f1043, new util.h.xy.bt.a() { // from class: util.h.xy.bg.ra.3.5
                            private static int Camera2StreamConfigurationMap = 0;
                            private static int getHighSpeedVideoSizes = 1;

                            @Override // util.h.xy.bt.a
                            /* renamed from: ˏ */
                            public final void mo25464(int i, java.lang.String str, java.lang.Throwable th) {
                                int i2 = getHighSpeedVideoSizes;
                                Camera2StreamConfigurationMap = (((i2 | 27) << 1) - (i2 ^ 27)) % 128;
                            }
                        }).m25623();
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        Camera2StreamConfigurationMap("\u0003\u0000\u0004\u0011\u0007\ufff3\n\u0002\u0004\u0007￢\ufff2￪￠\u0003\u0000\u0004\u0011\u0007\ufff3\u0012\u0006\u0000\u000b￥\u0004\u0015\b\u0013\u0000￭\u0013\u0000\u0004\u0011\u0002\uffd9", 37 - android.view.View.resolveSizeAndState(0, 0, 0), android.view.MotionEvent.axisFromString("") + 15, android.graphics.drawable.Drawable.resolveOpacity(0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_BRUSHSTROKE_VALUE, true, objArr);
                        util.h.xy.bh.mb.m25480(((java.lang.String) objArr[0]).intern(), currentTimeMillis);
                        util.h.xy.bg.ra.getHighSpeedVideoSizes();
                        int i = getInputFormats + 67;
                        getHighSpeedVideoSizes = i % 128;
                        int i2 = i % 2;
                    } else {
                        com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode paymentServiceErrorCode = com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.NO_DEFAULT_CARD;
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        Camera2StreamConfigurationMap(" \u0017\u001fￋ\u000e\f\u001d\u000fￌￋ\u0006￮\ufffa\uffef\ufff0\uffd8ￛￛ\uffdd\b\ufff9\u001a\u0019\ufffb\ufff1\ufffbￋ\u001b\u001a\u001e\u001fￜ\u001e\u001f￬\ufffb\uffef\u0000￥ￋ\u0000\u0019\f\r\u0017\u0010ￋ\u001f\u001aￋ\f\u000e\u001f\u0014!\f\u001f\u0010ￋ\u001f\u0013\u0010ￋ\u000f\u0010\u0011\f", android.view.View.combineMeasuredStates(0, 0) + 67, 19 - android.view.MotionEvent.axisFromString(""), 261 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), false, objArr2);
                        util.h.xy.bf.mc.m25436(paymentServiceErrorCode, ((java.lang.String) objArr2[0]).intern());
                    }
                    util.h.xy.bg.a.f944.m25459().countDown();
                    int i3 = getHighSpeedVideoSizes + 61;
                    getInputFormats = i3 % 128;
                    if (i3 % 2 != 0) {
                        throw null;
                    }
                } catch (java.lang.InterruptedException unused) {
                    util.h.xy.bg.ra.getHighSpeedVideoSizes();
                }
            }
        });
        thread.setUncaughtExceptionHandler(new java.lang.Thread.UncaughtExceptionHandler() { // from class: util.h.xy.bg.ra.5
            private static int getHighSpeedVideoFpsRangesFor = 0;
            private static int getHighSpeedVideoSizes = 1;

            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(java.lang.Thread thread2, java.lang.Throwable th) {
                int i = getHighSpeedVideoSizes + 111;
                getHighSpeedVideoFpsRangesFor = i % 128;
                if (i % 2 != 0) {
                    util.h.xy.bf.mc.m25436(com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.PAYMENT_WRONG_STATE, th.getMessage());
                    util.h.xy.bg.a.f944.m25459().countDown();
                    throw new java.lang.ArithmeticException();
                }
                util.h.xy.bf.mc.m25436(com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.PAYMENT_WRONG_STATE, th.getMessage());
                util.h.xy.bg.a.f944.m25459().countDown();
                int i2 = getHighSpeedVideoFpsRangesFor;
                getHighSpeedVideoSizes = ((i2 & 117) + (i2 | 117)) % 128;
            }
        });
        thread.setPriority(10);
        thread.start();
        int i = getInputFormats + 9;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    static void Camera2StreamConfigurationMap() {
        getOutputMinFrameDuration = -1231763789;
    }
}
