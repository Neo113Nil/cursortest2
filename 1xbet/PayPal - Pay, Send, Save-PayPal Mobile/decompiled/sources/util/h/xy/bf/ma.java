package util.h.xy.bf;

/* loaded from: classes5.dex */
public final class ma {
    private static int Camera2StreamConfigurationMap = 0;
    private static final java.lang.String getHighSpeedVideoFpsRanges = "ma";
    private static int getHighSpeedVideoSizes = 77;

    static /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor() {
        int i = getHighSpeedVideoSizes;
        int i2 = (i & 57) + (i | 57);
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 == 0) {
            return getHighSpeedVideoFpsRanges;
        }
        throw null;
    }

    static {
        int i = 77 % 2;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static void m25418(final com.gemalto.mfs.mwsdk.payment.PaymentServiceListener paymentServiceListener) {
        int i = Camera2StreamConfigurationMap;
        getHighSpeedVideoSizes = ((i ^ 27) + ((i & 27) << 1)) % 128;
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: util.h.xy.bf.ma.6
            private static int Camera2StreamConfigurationMap = 1;
            private static long getHighResolutionOutputSizeshNQ4ISI = -3923368974154871235L;
            private static int getHighSpeedVideoFpsRangesFor = 0;
            private static int getHighSpeedVideoSizes = 0;
            private static int getInputFormats = 1;

            private static void Camera2StreamConfigurationMap(java.lang.String str, int i2, java.lang.Object[] objArr) {
                char[] charArray = str.toCharArray();
                util.h.xz.b.a aVar = new util.h.xz.b.a();
                char[] m27721 = util.h.xz.b.a.m27721(getHighResolutionOutputSizeshNQ4ISI ^ 7817488252581312552L, charArray, i2);
                aVar.f2623 = 4;
                int i3 = Camera2StreamConfigurationMap + 105;
                getHighSpeedVideoSizes = i3 % 128;
                int i4 = i3 % 2;
                while (aVar.f2623 < m27721.length) {
                    aVar.f2624 = aVar.f2623 - 4;
                    m27721[aVar.f2623] = (char) ((m27721[aVar.f2623] ^ m27721[aVar.f2623 % 4]) ^ (aVar.f2624 * (getHighResolutionOutputSizeshNQ4ISI ^ 7817488252581312552L)));
                    aVar.f2623++;
                    Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 95) % 128;
                }
                objArr[0] = new java.lang.String(m27721, 4, m27721.length - 4);
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = (getHighSpeedVideoFpsRangesFor + 31) % 128;
                getInputFormats = i2;
                try {
                    if (!(com.gemalto.mfs.mwsdk.payment.PaymentServiceListener.this instanceof com.gemalto.mfs.mwsdk.payment.engine.ContactlessPaymentServiceListener)) {
                        util.h.xy.bf.ma.getHighSpeedVideoFpsRangesFor();
                        getHighSpeedVideoFpsRangesFor = (getInputFormats + 121) % 128;
                        return;
                    }
                    int i3 = i2 + 103;
                    getHighSpeedVideoFpsRangesFor = i3 % 128;
                    if (i3 % 2 != 0) {
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        Camera2StreamConfigurationMap("橭模ٜ〙쨌꙯\uf289僵", 0 - android.view.View.MeasureSpec.getSize(1), objArr);
                        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        Camera2StreamConfigurationMap("괡굠爵䑭ꀠ채뫂甥簏ᣓ\ue412扮᷆铜벡", 1 << android.text.TextUtils.getOffsetBefore("", 1), objArr2);
                        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
                    } else {
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        Camera2StreamConfigurationMap("橭模ٜ〙쨌꙯\uf289僵", android.view.View.MeasureSpec.getSize(0) + 1, objArr3);
                        java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        Camera2StreamConfigurationMap("괡굠爵䑭ꀠ채뫂甥簏ᣓ\ue412扮᷆铜벡", 1 - android.text.TextUtils.getOffsetBefore("", 0), objArr4);
                        util.h.xy.am.ma.m25027(intern2, ((java.lang.String) objArr4[0]).intern());
                    }
                    ((com.gemalto.mfs.mwsdk.payment.engine.ContactlessPaymentServiceListener) com.gemalto.mfs.mwsdk.payment.PaymentServiceListener.this).onTransactionStarted();
                } catch (java.lang.Throwable th) {
                    util.h.xy.bf.ma.getHighSpeedVideoFpsRangesFor();
                    th.getMessage();
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    Camera2StreamConfigurationMap("橭模ٜ〙쨌꙯\uf289僵", android.graphics.Color.green(0) + 1, objArr5);
                    java.lang.String intern3 = ((java.lang.String) objArr5[0]).intern();
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    Camera2StreamConfigurationMap("ểẂ鮱귩⑵䠑窗웇開\ud886恇ꈻ긤絘㣴訤", (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 1, objArr6);
                    util.h.xy.am.ma.m25027(intern3, ((java.lang.String) objArr6[0]).intern());
                }
            }
        };
        int i2 = Camera2StreamConfigurationMap + 71;
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 != 0) {
            getHighSpeedVideoSizes(runnable);
            int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
            int i3 = ~((currentTimeMillis ^ (-1476131854)) | (currentTimeMillis & (-1476131854)));
            int i4 = ((i3 ^ (-589105142)) | (i3 & (-589105142))) * (-658);
            int i5 = (i4 & 2106163326) + (i4 | 2106163326);
            int i6 = ~(currentTimeMillis | (-1476131854));
            int currentTimeMillis2 = (int) java.lang.System.currentTimeMillis();
            int i7 = ~currentTimeMillis2;
            int i8 = -(-(((~((i7 ^ (-2018590804)) | (i7 & (-2018590804)))) | 1822781544) * (-602)));
            int i9 = ((i8 | (-645290270)) << 1) - (i8 ^ (-645290270));
            int i10 = ~((currentTimeMillis2 ^ (-2018590804)) | (currentTimeMillis2 & (-2018590804)));
            int i11 = (i10 ^ 1744912448) | (i10 & 1744912448);
            int i12 = (2018590803 ^ i7) | (i7 & 2018590803);
            int i13 = ~((i12 ^ 1822781544) | (i12 & 1822781544));
            int i14 = -(-(((i11 ^ i13) | (i11 & i13)) * (-301)));
            if ((i5 ^ 794920080) + ((794920080 & i5) << 1) + (((i6 ^ 1424160776) | (i6 & 1424160776)) * 658) <= (((i9 | i14) << 1) - (i14 ^ i9)) + ((~(i7 | 1822781544)) * 301)) {
                throw null;
            }
            return;
        }
        throw null;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static void m25424(com.gemalto.mfs.mwsdk.payment.PaymentServiceListener paymentServiceListener) {
        int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
        int i = ~currentTimeMillis;
        int i2 = (~(i | (-1559751707))) | 208898064;
        int i3 = ~((i ^ 1904506350) | (i & 1904506350));
        int i4 = -(-(((i2 ^ i3) | (i2 & i3)) * (-1136)));
        int i5 = ((i4 | 1403102611) << 1) - (i4 ^ 1403102611);
        int i6 = ~(((-1559751707) ^ currentTimeMillis) | (currentTimeMillis & (-1559751707)));
        int i7 = ~((currentTimeMillis ^ 1904506350) | (1904506350 & currentTimeMillis));
        int i8 = (i6 ^ i7) | (i6 & i7);
        int i9 = (1559751706 & i) | (i ^ 1559751706);
        int i10 = ~((i9 & (-1904506351)) | (i9 ^ (-1904506351)));
        int i11 = ((i8 ^ i10) | (i8 & i10)) * (-568);
        int i12 = ~i9;
        int i13 = ~((i ^ (-1904506351)) | (i & (-1904506351)));
        int i14 = (i13 ^ i12) | (i13 & i12);
        int i15 = ~((currentTimeMillis ^ (-208898065)) | (currentTimeMillis & (-208898065)));
        int currentTimeMillis2 = (int) java.lang.System.currentTimeMillis();
        int i16 = ((~((currentTimeMillis2 ^ (-1045200377)) | (currentTimeMillis2 & (-1045200377)))) | 1011630568 | (~((currentTimeMillis2 ^ (-2093957616)) | (currentTimeMillis2 & (-2093957616))))) * (-754);
        int i17 = ~currentTimeMillis2;
        int i18 = (1045200376 ^ i17) | (i17 & 1045200376);
        if ((((i5 | i11) << 1) - (i11 ^ i5)) + (((i15 ^ i14) | (i15 & i14)) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PUSH_INVALID_CONVERSATION) > (((((i16 | (-650611368)) << 1) - ((-650611368) ^ i16)) + (((~(((-1011630569) ^ currentTimeMillis2) | (currentTimeMillis2 & (-1011630569)))) | (~((i18 & (-2093957616)) | (i18 ^ (-2093957616))))) * (-754))) - (~(-(-((i17 | (-1045200377)) * 754))))) - 1) {
            getHighSpeedVideoSizes(getHighSpeedVideoFpsRanges(paymentServiceListener));
        } else {
            getHighSpeedVideoSizes(getHighSpeedVideoFpsRanges(paymentServiceListener));
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static void m25417(com.gemalto.mfs.mwsdk.payment.PaymentServiceListener paymentServiceListener, com.gemalto.mfs.mwsdk.payment.engine.TransactionContext transactionContext) {
        int i = Camera2StreamConfigurationMap + 97;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 != 0) {
            util.h.xy.bu.rb.m25675();
            util.h.xy.bf.mc.f939.m25442();
            getHighSpeedVideoSizes(getHighResolutionOutputSizeshNQ4ISI(paymentServiceListener, transactionContext));
            int i2 = Camera2StreamConfigurationMap;
            int i3 = (i2 ^ 77) + ((i2 & 77) << 1);
            getHighSpeedVideoSizes = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            return;
        }
        util.h.xy.bu.rb.m25675();
        util.h.xy.bf.mc.f939.m25442();
        getHighSpeedVideoSizes(getHighResolutionOutputSizeshNQ4ISI(paymentServiceListener, transactionContext));
        throw null;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static void m25416(com.gemalto.mfs.mwsdk.payment.PaymentServiceListener paymentServiceListener, com.gemalto.mfs.mwsdk.payment.engine.DeactivationStatus deactivationStatus, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardStatus digitalizedCardStatus, com.gemalto.mfs.mwsdk.dcm.DigitalizedCard digitalizedCard) {
        int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
        int i = ~currentTimeMillis;
        int i2 = ~(i | (-49655223));
        int i3 = -(-(((i2 ^ 1557768948) | (i2 & 1557768948)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE));
        int i4 = (i3 & 577935364) + (i3 | 577935364);
        int i5 = (i ^ (-49655223)) | (i & (-49655223));
        int i6 = ~((i5 ^ 1557768948) | (i5 & 1557768948));
        int i7 = ~((1593683958 ^ currentTimeMillis) | (currentTimeMillis & 1593683958));
        int i8 = -(-(((i6 ^ i7) | (i6 & i7)) * (-519)));
        int i9 = ~((currentTimeMillis ^ 1557768948) | (currentTimeMillis & 1557768948));
        int currentTimeMillis2 = (int) java.lang.System.currentTimeMillis();
        int i10 = -(-(((currentTimeMillis2 ^ 9048087) | (currentTimeMillis2 & 9048087)) * 988));
        int i11 = (i10 ^ (-1507615809)) + ((i10 & (-1507615809)) << 1);
        int i12 = ~currentTimeMillis2;
        int i13 = i11 + (((~((-1449258721) | i12)) | 304098816) * (-1976));
        int i14 = ~((currentTimeMillis2 ^ 1154207991) | (currentTimeMillis2 & 1154207991));
        int i15 = (i14 ^ 9048087) | (i14 & 9048087);
        int i16 = ~(((-1154207992) ^ i12) | (i12 & (-1154207992)));
        int i17 = ((i15 ^ i16) | (i16 & i15)) * 988;
        if ((i4 ^ i8) + ((i8 & i4) << 1) + (((i9 ^ 49655222) | (i9 & 49655222)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE) <= ((i13 | i17) << 1) - (i17 ^ i13)) {
            getHighSpeedVideoSizes(getHighSpeedVideoFpsRangesFor(paymentServiceListener, deactivationStatus, digitalizedCardStatus, digitalizedCard));
        } else {
            getHighSpeedVideoSizes(getHighSpeedVideoFpsRangesFor(paymentServiceListener, deactivationStatus, digitalizedCardStatus, digitalizedCard));
            throw null;
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static void m25423(com.gemalto.mfs.mwsdk.payment.PaymentServiceListener paymentServiceListener) {
        int i = getHighSpeedVideoSizes;
        int i2 = (i & 109) + (i | 109);
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 == 0) {
            util.h.xy.bu.rb.m25675();
            util.h.xy.bf.mc.f939.m25442();
            getHighSpeedVideoSizes(getHighResolutionOutputSizeshNQ4ISI(paymentServiceListener));
        } else {
            util.h.xy.bu.rb.m25675();
            util.h.xy.bf.mc.f939.m25442();
            getHighSpeedVideoSizes(getHighResolutionOutputSizeshNQ4ISI(paymentServiceListener));
            throw null;
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static void m25421(final com.gemalto.mfs.mwsdk.payment.PaymentServiceListener paymentServiceListener, final int i) {
        int i2 = Camera2StreamConfigurationMap;
        int i3 = (i2 ^ 13) + ((i2 & 13) << 1);
        getHighSpeedVideoSizes = i3 % 128;
        if (i3 % 2 != 0) {
            java.lang.Runnable runnable = new java.lang.Runnable() { // from class: util.h.xy.bf.ma.9
                private static int getHighResolutionOutputSizeshNQ4ISI = 0;
                private static int getHighSpeedVideoFpsRanges = 0;
                private static int getHighSpeedVideoFpsRangesFor = 1;
                private static int getHighSpeedVideoSizesFor = 1;
                private static long getInputSizeshNQ4ISI = -4693294741051972334L;

                private static void getHighSpeedVideoFpsRanges(java.lang.String str, int i4, java.lang.Object[] objArr) {
                    char[] charArray = str.toCharArray();
                    util.h.xz.b.d dVar = new util.h.xz.b.d();
                    dVar.f2628 = i4;
                    int length = charArray.length;
                    long[] jArr = new long[length];
                    dVar.f2629 = 0;
                    while (dVar.f2629 < charArray.length) {
                        jArr[dVar.f2629] = (charArray[dVar.f2629] ^ (dVar.f2629 * dVar.f2628)) ^ (getInputSizeshNQ4ISI ^ (-7508379876853140581L));
                        dVar.f2629++;
                        getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 113) % 128;
                    }
                    char[] cArr = new char[length];
                    dVar.f2629 = 0;
                    while (dVar.f2629 < charArray.length) {
                        cArr[dVar.f2629] = (char) jArr[dVar.f2629];
                        dVar.f2629++;
                        getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 51) % 128;
                    }
                    objArr[0] = new java.lang.String(cArr);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i4 = getHighSpeedVideoSizesFor;
                    int i5 = i4 + 101;
                    getHighResolutionOutputSizeshNQ4ISI = i5 % 128;
                    try {
                        if (i5 % 2 != 0) {
                            throw new java.lang.ArithmeticException();
                        }
                        com.gemalto.mfs.mwsdk.payment.PaymentServiceListener paymentServiceListener2 = com.gemalto.mfs.mwsdk.payment.PaymentServiceListener.this;
                        if (paymentServiceListener2 != null) {
                            int i6 = i4 + 63;
                            getHighResolutionOutputSizeshNQ4ISI = i6 % 128;
                            if (i6 % 2 != 0) {
                                throw null;
                            }
                            if (paymentServiceListener2 instanceof com.gemalto.mfs.mwsdk.payment.engine.ContactlessPaymentServiceListener) {
                                java.lang.Object[] objArr = new java.lang.Object[1];
                                getHighSpeedVideoFpsRanges("囅힚呆픃", 33091 - android.view.View.resolveSizeAndState(0, 0, 0), objArr);
                                java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 55) % 128;
                                try {
                                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                                    getHighSpeedVideoFpsRanges("囈⩅꿅⌤ꓝ㡟뷃ㄠ닎㙔诗ཌྷ胀", (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22) + 31873, objArr2);
                                    util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
                                    com.gemalto.mfs.mwsdk.payment.engine.ContactlessPaymentServiceListener contactlessPaymentServiceListener = (com.gemalto.mfs.mwsdk.payment.engine.ContactlessPaymentServiceListener) com.gemalto.mfs.mwsdk.payment.PaymentServiceListener.this;
                                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                                    getHighSpeedVideoFpsRanges("囊\uefe5ⓡ緮닠쯥ï姵黾\ud7fc沷ꗜ輸㎎䣳臫웪ᾚ哗\uedd1⋆箖납즩\u0ea4䞬鳧햴檲ꎭ\uf8a7ㇵ盉辺쒃ᶅ劄\ueb95\u209e秜뺜\uf79dಁ䕭騭퍺桫ꅡ\ue639㽾瑺赦쉼᭵偎\ue90c⹏杇뱆\uf54aਝ䍊顜턔ᘽ꼢\ue42a㵠爷謣쀺ᤸ帴霠ⱶ", android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 47364, objArr3);
                                    contactlessPaymentServiceListener.onTransactionInterrupted(1, ((java.lang.String) objArr3[0]).intern(), i);
                                    return;
                                } catch (java.lang.Throwable th) {
                                    java.lang.Throwable cause = th.getCause();
                                    if (cause == null) {
                                        throw th;
                                    }
                                    throw cause;
                                }
                            }
                        }
                        util.h.xy.bf.ma.getHighSpeedVideoFpsRangesFor();
                    } catch (java.lang.Throwable th2) {
                        util.h.xy.bf.ma.getHighSpeedVideoFpsRangesFor();
                        th2.getMessage();
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRanges("囅힚呆픃", (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 33091, objArr4);
                        java.lang.String intern2 = ((java.lang.String) objArr4[0]).intern();
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRanges("囈\ueefd⚵縌똽쿇ޓ弨霎Ⳝ擧벵\uf460\u0c29", android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 47162, objArr5);
                        util.h.xy.am.ma.m25027(intern2, ((java.lang.String) objArr5[0]).intern());
                    }
                }
            };
            getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 15) % 128;
            getHighSpeedVideoSizes(runnable);
            Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 15) % 128;
            return;
        }
        java.lang.Runnable runnable2 = new java.lang.Runnable() { // from class: util.h.xy.bf.ma.9
            private static int getHighResolutionOutputSizeshNQ4ISI = 0;
            private static int getHighSpeedVideoFpsRanges = 0;
            private static int getHighSpeedVideoFpsRangesFor = 1;
            private static int getHighSpeedVideoSizesFor = 1;
            private static long getInputSizeshNQ4ISI = -4693294741051972334L;

            private static void getHighSpeedVideoFpsRanges(java.lang.String str, int i4, java.lang.Object[] objArr) {
                char[] charArray = str.toCharArray();
                util.h.xz.b.d dVar = new util.h.xz.b.d();
                dVar.f2628 = i4;
                int length = charArray.length;
                long[] jArr = new long[length];
                dVar.f2629 = 0;
                while (dVar.f2629 < charArray.length) {
                    jArr[dVar.f2629] = (charArray[dVar.f2629] ^ (dVar.f2629 * dVar.f2628)) ^ (getInputSizeshNQ4ISI ^ (-7508379876853140581L));
                    dVar.f2629++;
                    getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 113) % 128;
                }
                char[] cArr = new char[length];
                dVar.f2629 = 0;
                while (dVar.f2629 < charArray.length) {
                    cArr[dVar.f2629] = (char) jArr[dVar.f2629];
                    dVar.f2629++;
                    getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 51) % 128;
                }
                objArr[0] = new java.lang.String(cArr);
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i4 = getHighSpeedVideoSizesFor;
                int i5 = i4 + 101;
                getHighResolutionOutputSizeshNQ4ISI = i5 % 128;
                try {
                    if (i5 % 2 != 0) {
                        throw new java.lang.ArithmeticException();
                    }
                    com.gemalto.mfs.mwsdk.payment.PaymentServiceListener paymentServiceListener2 = com.gemalto.mfs.mwsdk.payment.PaymentServiceListener.this;
                    if (paymentServiceListener2 != null) {
                        int i6 = i4 + 63;
                        getHighResolutionOutputSizeshNQ4ISI = i6 % 128;
                        if (i6 % 2 != 0) {
                            throw null;
                        }
                        if (paymentServiceListener2 instanceof com.gemalto.mfs.mwsdk.payment.engine.ContactlessPaymentServiceListener) {
                            java.lang.Object[] objArr = new java.lang.Object[1];
                            getHighSpeedVideoFpsRanges("囅힚呆픃", 33091 - android.view.View.resolveSizeAndState(0, 0, 0), objArr);
                            java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 55) % 128;
                            try {
                                java.lang.Object[] objArr2 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRanges("囈⩅꿅⌤ꓝ㡟뷃ㄠ닎㙔诗ཌྷ胀", (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22) + 31873, objArr2);
                                util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
                                com.gemalto.mfs.mwsdk.payment.engine.ContactlessPaymentServiceListener contactlessPaymentServiceListener = (com.gemalto.mfs.mwsdk.payment.engine.ContactlessPaymentServiceListener) com.gemalto.mfs.mwsdk.payment.PaymentServiceListener.this;
                                java.lang.Object[] objArr3 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRanges("囊\uefe5ⓡ緮닠쯥ï姵黾\ud7fc沷ꗜ輸㎎䣳臫웪ᾚ哗\uedd1⋆箖납즩\u0ea4䞬鳧햴檲ꎭ\uf8a7ㇵ盉辺쒃ᶅ劄\ueb95\u209e秜뺜\uf79dಁ䕭騭퍺桫ꅡ\ue639㽾瑺赦쉼᭵偎\ue90c⹏杇뱆\uf54aਝ䍊顜턔ᘽ꼢\ue42a㵠爷謣쀺ᤸ帴霠ⱶ", android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 47364, objArr3);
                                contactlessPaymentServiceListener.onTransactionInterrupted(1, ((java.lang.String) objArr3[0]).intern(), i);
                                return;
                            } catch (java.lang.Throwable th) {
                                java.lang.Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        }
                    }
                    util.h.xy.bf.ma.getHighSpeedVideoFpsRangesFor();
                } catch (java.lang.Throwable th2) {
                    util.h.xy.bf.ma.getHighSpeedVideoFpsRangesFor();
                    th2.getMessage();
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges("囅힚呆픃", (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 33091, objArr4);
                    java.lang.String intern2 = ((java.lang.String) objArr4[0]).intern();
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges("囈\ueefd⚵縌똽쿇ޓ弨霎Ⳝ擧벵\uf460\u0c29", android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 47162, objArr5);
                    util.h.xy.am.ma.m25027(intern2, ((java.lang.String) objArr5[0]).intern());
                }
            }
        };
        getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 15) % 128;
        getHighSpeedVideoSizes(runnable2);
        throw null;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static void m25422(final java.lang.String str, final com.gemalto.mfs.mwsdk.payment.PaymentServiceListener paymentServiceListener) {
        int i = getHighSpeedVideoSizes;
        int i2 = (i ^ 23) + ((i & 23) << 1);
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 == 0) {
            util.h.xy.bu.rb.m25675();
            util.h.xy.bf.mc.f939.m25442();
            java.lang.Runnable runnable = new java.lang.Runnable() { // from class: util.h.xy.bf.ma.11
                private static int Camera2StreamConfigurationMap = 0;
                private static int getHighSpeedVideoFpsRanges = 1;
                private static int getHighSpeedVideoFpsRangesFor = 0;
                private static int getHighSpeedVideoSizesFor = 1;
                private static int getInputFormats = 670323751;
                private static int getInputSizeshNQ4ISI = -408873045;
                private static byte[] getOutputFormats = {56, 7, 18, 1, 118, 125, 35, 97, 108, 2, 33, 99, 4, 7, 76, 117, com.visa.cbp.getEncExpo.IResultReceiver, 116, -113, 118, -30, 107, -113, 92, -104, -38, -27, 70, com.visa.cbp.getEncExpo.registerForActivityResult, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -53, 111, -32, 67, -100, 118, 118, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -36, -102, -29, 3, -36, -26, 68, -116, 106, -30, 70, 117, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, 38, -100, 3, -36, -98, 109, 118, -28, 126, -6, -8, -115, -108, -38, -104, -125, -7, -40, -102, -5, -2, -40, -40, -40, -40};
                private static int getOutputMinFrameDuration = -350250072;
                private static short[] getOutputSizeshNQ4ISI;

                private static void getHighSpeedVideoFpsRanges(int i3, short s, byte b, int i4, int i5, java.lang.Object[] objArr) {
                    int i6;
                    int length;
                    byte[] bArr;
                    util.h.xz.b.me meVar = new util.h.xz.b.me();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    int i7 = i4 + ((int) (getInputSizeshNQ4ISI ^ (-2689713159175858216L)));
                    if (i7 == -1) {
                        getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 77) % 128;
                        i6 = 1;
                    } else {
                        i6 = 0;
                    }
                    if (i6 != 0) {
                        byte[] bArr2 = getOutputFormats;
                        if (bArr2 != null) {
                            int i8 = getHighSpeedVideoFpsRangesFor + 63;
                            int i9 = i8 % 128;
                            getHighSpeedVideoFpsRanges = i9;
                            if (i8 % 2 == 0) {
                                length = bArr2.length;
                                bArr = new byte[length];
                            } else {
                                length = bArr2.length;
                                bArr = new byte[length];
                            }
                            getHighSpeedVideoFpsRangesFor = (i9 + 67) % 128;
                            int i10 = 0;
                            while (i10 < length) {
                                int i11 = getHighSpeedVideoFpsRangesFor;
                                getHighSpeedVideoFpsRanges = (i11 + 65) % 128;
                                bArr[i10] = (byte) (bArr2[i10] ^ (-2689713159175858216L));
                                i10++;
                                getHighSpeedVideoFpsRanges = (i11 + 121) % 128;
                            }
                            bArr2 = bArr;
                        }
                        if (bArr2 != null) {
                            i7 = (byte) (((byte) (getOutputFormats[((int) (getOutputMinFrameDuration ^ (-2689713159175858216L))) + i3] ^ (-2689713159175858216L))) + ((int) (getInputSizeshNQ4ISI ^ (-2689713159175858216L))));
                            int i12 = getHighSpeedVideoFpsRanges + 101;
                            getHighSpeedVideoFpsRangesFor = i12 % 128;
                            int i13 = i12 % 2;
                        } else {
                            i7 = (short) (((short) (getOutputSizeshNQ4ISI[((int) (getOutputMinFrameDuration ^ (-2689713159175858216L))) + i3] ^ (-2689713159175858216L))) + ((int) (getInputSizeshNQ4ISI ^ (-2689713159175858216L))));
                        }
                    }
                    if (i7 > 0) {
                        getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 25) % 128;
                        meVar.f2647 = ((i3 + i7) - 2) + ((int) (getOutputMinFrameDuration ^ (-2689713159175858216L))) + i6;
                        meVar.f2644 = (char) (i5 + ((int) (getInputFormats ^ (-2689713159175858216L))));
                        sb.append(meVar.f2644);
                        meVar.f2646 = meVar.f2644;
                        byte[] bArr3 = getOutputFormats;
                        if (bArr3 != null) {
                            int length2 = bArr3.length;
                            byte[] bArr4 = new byte[length2];
                            for (int i14 = 0; i14 < length2; i14++) {
                                bArr4[i14] = (byte) (bArr3[i14] ^ (-2689713159175858216L));
                            }
                            bArr3 = bArr4;
                        }
                        boolean z = bArr3 != null;
                        meVar.f2645 = 1;
                        while (meVar.f2645 < i7) {
                            if (z) {
                                byte[] bArr5 = getOutputFormats;
                                meVar.f2647 = meVar.f2647 - 1;
                                meVar.f2644 = (char) (meVar.f2646 + (((byte) (((byte) (bArr5[r9] ^ (-2689713159175858216L))) + s)) ^ b));
                            } else {
                                short[] sArr = getOutputSizeshNQ4ISI;
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

                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        if (com.gemalto.mfs.mwsdk.payment.PaymentServiceListener.this != null) {
                            java.lang.Object[] objArr = new java.lang.Object[1];
                            getHighSpeedVideoFpsRanges((-213814384) - android.view.View.combineMeasuredStates(0, 0), (short) (41 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), (byte) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) - 15), (-110) - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 1068153933 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), objArr);
                            java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                            getHighSpeedVideoSizesFor = (Camera2StreamConfigurationMap + 87) % 128;
                            try {
                                java.lang.Object[] objArr2 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRanges((-213814381) - ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6), (short) (android.graphics.ImageFormat.getBitsPerPixel(0) - 68), (byte) ((-106) - android.graphics.Color.argb(0, 0, 0, 0)), (-103) - android.graphics.Color.red(0), (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1068153922, objArr2);
                                util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
                                com.gemalto.mfs.mwsdk.payment.PaymentServiceListener paymentServiceListener2 = com.gemalto.mfs.mwsdk.payment.PaymentServiceListener.this;
                                com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode paymentServiceErrorCode = com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.NO_DEFAULT_CARD;
                                java.lang.String str2 = str;
                                if (str2 == null) {
                                    getHighSpeedVideoSizesFor = (Camera2StreamConfigurationMap + 33) % 128;
                                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                                    getHighSpeedVideoFpsRanges((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) - 213814370, (short) ((-120) - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16)), (byte) (55 - (android.view.ViewConfiguration.getEdgeSlop() >> 16)), (-69) - android.widget.ExpandableListView.getPackedPositionChild(0L), 1068153942 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), objArr3);
                                    str2 = ((java.lang.String) objArr3[0]).intern();
                                    int i3 = getHighSpeedVideoSizesFor + 101;
                                    Camera2StreamConfigurationMap = i3 % 128;
                                    int i4 = i3 % 2;
                                }
                                paymentServiceListener2.onError(util.h.xy.bf.mc.m25434(paymentServiceErrorCode, str2));
                            } catch (java.lang.Throwable th) {
                                java.lang.Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        } else {
                            util.h.xy.bf.ma.getHighSpeedVideoFpsRangesFor();
                        }
                        Camera2StreamConfigurationMap = (getHighSpeedVideoSizesFor + 15) % 128;
                    } catch (java.lang.Throwable th2) {
                        util.h.xy.bf.ma.getHighSpeedVideoFpsRangesFor();
                        th2.getMessage();
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRanges((-213814383) - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (short) (43 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (byte) ((android.view.KeyEvent.getMaxKeyCode() >> 16) - 16), (-110) - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1068153934, objArr4);
                        java.lang.String intern2 = ((java.lang.String) objArr4[0]).intern();
                        try {
                            java.lang.Object[] objArr5 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRanges((-213814324) - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (short) (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue() - 59), (byte) ((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) - 26), (-103) - ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue(), 1068153922 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), objArr5);
                            util.h.xy.am.ma.m25027(intern2, ((java.lang.String) objArr5[0]).intern());
                        } catch (java.lang.Throwable th3) {
                            java.lang.Throwable cause2 = th3.getCause();
                            if (cause2 == null) {
                                throw th3;
                            }
                            throw cause2;
                        }
                    }
                }
            };
            int i3 = getHighSpeedVideoSizes;
            Camera2StreamConfigurationMap = ((i3 & 51) + (i3 | 51)) % 128;
            getHighSpeedVideoSizes(runnable);
            int i4 = Camera2StreamConfigurationMap;
            int i5 = (i4 & 77) + (i4 | 77);
            getHighSpeedVideoSizes = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
            return;
        }
        util.h.xy.bu.rb.m25675();
        util.h.xy.bf.mc.f939.m25442();
        java.lang.Runnable runnable2 = new java.lang.Runnable() { // from class: util.h.xy.bf.ma.11
            private static int Camera2StreamConfigurationMap = 0;
            private static int getHighSpeedVideoFpsRanges = 1;
            private static int getHighSpeedVideoFpsRangesFor = 0;
            private static int getHighSpeedVideoSizesFor = 1;
            private static int getInputFormats = 670323751;
            private static int getInputSizeshNQ4ISI = -408873045;
            private static byte[] getOutputFormats = {56, 7, 18, 1, 118, 125, 35, 97, 108, 2, 33, 99, 4, 7, 76, 117, com.visa.cbp.getEncExpo.IResultReceiver, 116, -113, 118, -30, 107, -113, 92, -104, -38, -27, 70, com.visa.cbp.getEncExpo.registerForActivityResult, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -53, 111, -32, 67, -100, 118, 118, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -36, -102, -29, 3, -36, -26, 68, -116, 106, -30, 70, 117, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, 38, -100, 3, -36, -98, 109, 118, -28, 126, -6, -8, -115, -108, -38, -104, -125, -7, -40, -102, -5, -2, -40, -40, -40, -40};
            private static int getOutputMinFrameDuration = -350250072;
            private static short[] getOutputSizeshNQ4ISI;

            private static void getHighSpeedVideoFpsRanges(int i32, short s, byte b, int i42, int i52, java.lang.Object[] objArr) {
                int i6;
                int length;
                byte[] bArr;
                util.h.xz.b.me meVar = new util.h.xz.b.me();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                int i7 = i42 + ((int) (getInputSizeshNQ4ISI ^ (-2689713159175858216L)));
                if (i7 == -1) {
                    getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 77) % 128;
                    i6 = 1;
                } else {
                    i6 = 0;
                }
                if (i6 != 0) {
                    byte[] bArr2 = getOutputFormats;
                    if (bArr2 != null) {
                        int i8 = getHighSpeedVideoFpsRangesFor + 63;
                        int i9 = i8 % 128;
                        getHighSpeedVideoFpsRanges = i9;
                        if (i8 % 2 == 0) {
                            length = bArr2.length;
                            bArr = new byte[length];
                        } else {
                            length = bArr2.length;
                            bArr = new byte[length];
                        }
                        getHighSpeedVideoFpsRangesFor = (i9 + 67) % 128;
                        int i10 = 0;
                        while (i10 < length) {
                            int i11 = getHighSpeedVideoFpsRangesFor;
                            getHighSpeedVideoFpsRanges = (i11 + 65) % 128;
                            bArr[i10] = (byte) (bArr2[i10] ^ (-2689713159175858216L));
                            i10++;
                            getHighSpeedVideoFpsRanges = (i11 + 121) % 128;
                        }
                        bArr2 = bArr;
                    }
                    if (bArr2 != null) {
                        i7 = (byte) (((byte) (getOutputFormats[((int) (getOutputMinFrameDuration ^ (-2689713159175858216L))) + i32] ^ (-2689713159175858216L))) + ((int) (getInputSizeshNQ4ISI ^ (-2689713159175858216L))));
                        int i12 = getHighSpeedVideoFpsRanges + 101;
                        getHighSpeedVideoFpsRangesFor = i12 % 128;
                        int i13 = i12 % 2;
                    } else {
                        i7 = (short) (((short) (getOutputSizeshNQ4ISI[((int) (getOutputMinFrameDuration ^ (-2689713159175858216L))) + i32] ^ (-2689713159175858216L))) + ((int) (getInputSizeshNQ4ISI ^ (-2689713159175858216L))));
                    }
                }
                if (i7 > 0) {
                    getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 25) % 128;
                    meVar.f2647 = ((i32 + i7) - 2) + ((int) (getOutputMinFrameDuration ^ (-2689713159175858216L))) + i6;
                    meVar.f2644 = (char) (i52 + ((int) (getInputFormats ^ (-2689713159175858216L))));
                    sb.append(meVar.f2644);
                    meVar.f2646 = meVar.f2644;
                    byte[] bArr3 = getOutputFormats;
                    if (bArr3 != null) {
                        int length2 = bArr3.length;
                        byte[] bArr4 = new byte[length2];
                        for (int i14 = 0; i14 < length2; i14++) {
                            bArr4[i14] = (byte) (bArr3[i14] ^ (-2689713159175858216L));
                        }
                        bArr3 = bArr4;
                    }
                    boolean z = bArr3 != null;
                    meVar.f2645 = 1;
                    while (meVar.f2645 < i7) {
                        if (z) {
                            byte[] bArr5 = getOutputFormats;
                            meVar.f2647 = meVar.f2647 - 1;
                            meVar.f2644 = (char) (meVar.f2646 + (((byte) (((byte) (bArr5[r9] ^ (-2689713159175858216L))) + s)) ^ b));
                        } else {
                            short[] sArr = getOutputSizeshNQ4ISI;
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

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    if (com.gemalto.mfs.mwsdk.payment.PaymentServiceListener.this != null) {
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        getHighSpeedVideoFpsRanges((-213814384) - android.view.View.combineMeasuredStates(0, 0), (short) (41 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), (byte) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) - 15), (-110) - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 1068153933 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), objArr);
                        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                        getHighSpeedVideoSizesFor = (Camera2StreamConfigurationMap + 87) % 128;
                        try {
                            java.lang.Object[] objArr2 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRanges((-213814381) - ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6), (short) (android.graphics.ImageFormat.getBitsPerPixel(0) - 68), (byte) ((-106) - android.graphics.Color.argb(0, 0, 0, 0)), (-103) - android.graphics.Color.red(0), (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1068153922, objArr2);
                            util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
                            com.gemalto.mfs.mwsdk.payment.PaymentServiceListener paymentServiceListener2 = com.gemalto.mfs.mwsdk.payment.PaymentServiceListener.this;
                            com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode paymentServiceErrorCode = com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.NO_DEFAULT_CARD;
                            java.lang.String str2 = str;
                            if (str2 == null) {
                                getHighSpeedVideoSizesFor = (Camera2StreamConfigurationMap + 33) % 128;
                                java.lang.Object[] objArr3 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRanges((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) - 213814370, (short) ((-120) - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16)), (byte) (55 - (android.view.ViewConfiguration.getEdgeSlop() >> 16)), (-69) - android.widget.ExpandableListView.getPackedPositionChild(0L), 1068153942 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), objArr3);
                                str2 = ((java.lang.String) objArr3[0]).intern();
                                int i32 = getHighSpeedVideoSizesFor + 101;
                                Camera2StreamConfigurationMap = i32 % 128;
                                int i42 = i32 % 2;
                            }
                            paymentServiceListener2.onError(util.h.xy.bf.mc.m25434(paymentServiceErrorCode, str2));
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        util.h.xy.bf.ma.getHighSpeedVideoFpsRangesFor();
                    }
                    Camera2StreamConfigurationMap = (getHighSpeedVideoSizesFor + 15) % 128;
                } catch (java.lang.Throwable th2) {
                    util.h.xy.bf.ma.getHighSpeedVideoFpsRangesFor();
                    th2.getMessage();
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges((-213814383) - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (short) (43 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (byte) ((android.view.KeyEvent.getMaxKeyCode() >> 16) - 16), (-110) - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1068153934, objArr4);
                    java.lang.String intern2 = ((java.lang.String) objArr4[0]).intern();
                    try {
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRanges((-213814324) - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (short) (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue() - 59), (byte) ((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) - 26), (-103) - ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue(), 1068153922 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), objArr5);
                        util.h.xy.am.ma.m25027(intern2, ((java.lang.String) objArr5[0]).intern());
                    } catch (java.lang.Throwable th3) {
                        java.lang.Throwable cause2 = th3.getCause();
                        if (cause2 == null) {
                            throw th3;
                        }
                        throw cause2;
                    }
                }
            }
        };
        int i6 = getHighSpeedVideoSizes;
        Camera2StreamConfigurationMap = ((i6 & 51) + (i6 | 51)) % 128;
        getHighSpeedVideoSizes(runnable2);
        throw null;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static void m25420(com.gemalto.mfs.mwsdk.payment.PaymentServiceListener paymentServiceListener) {
        int i = Camera2StreamConfigurationMap;
        int i2 = (i ^ 103) + ((i & 103) << 1);
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 != 0) {
            util.h.xy.bu.rb.m25675();
            util.h.xy.bf.mc.f939.m25442();
            getHighSpeedVideoSizes(getHighSpeedVideoSizes(paymentServiceListener));
            int i3 = Camera2StreamConfigurationMap + 1;
            getHighSpeedVideoSizes = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            return;
        }
        util.h.xy.bu.rb.m25675();
        util.h.xy.bf.mc.f939.m25442();
        getHighSpeedVideoSizes(getHighSpeedVideoSizes(paymentServiceListener));
        throw null;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static void m25415(final com.gemalto.mfs.mwsdk.payment.PaymentServiceListener paymentServiceListener, final com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode paymentServiceErrorCode, final java.lang.String str) {
        int i = getHighSpeedVideoSizes;
        Camera2StreamConfigurationMap = ((i & 101) + (i | 101)) % 128;
        util.h.xy.bu.rb.m25675();
        util.h.xy.bf.mc.f939.m25442();
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: util.h.xy.bf.ma.13
            private static int Camera2StreamConfigurationMap = 0;
            private static int getHighSpeedVideoFpsRangesFor = 1;
            private static int getInputSizeshNQ4ISI = 0;
            private static int getOutputMinFrameDuration = 1;
            private static char[] getHighSpeedVideoSizesFor = {41874, 41884, 41886, 41880, 41881, 41887, 41970, 41875, 41868, 41872, 41873, 41877, 41882, 41883, 41885, 41871};
            private static char getOutputFormats = 38466;

            /* JADX WARN: Code restructure failed: missing block: B:25:0x0096, code lost:
            
                if (r0.f2641 == r0.f2636) goto L31;
             */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x00bf, code lost:
            
                r0.f2639 = r0.f2641 / r2;
                r0.f2640 = r0.f2641 % r2;
                r0.f2637 = r0.f2636 / r2;
                r0.f2635 = r0.f2636 % r2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:27:0x00d7, code lost:
            
                if (r0.f2640 != r0.f2635) goto L35;
             */
            /* JADX WARN: Code restructure failed: missing block: B:28:0x00d9, code lost:
            
                util.h.xy.bf.ma.AnonymousClass13.getHighSpeedVideoFpsRangesFor = (util.h.xy.bf.ma.AnonymousClass13.Camera2StreamConfigurationMap + 15) % 128;
                r0.f2639 = ((r0.f2639 + r2) - 1) % r2;
                r0.f2637 = ((r0.f2637 + r2) - 1) % r2;
                r7 = r0.f2639;
                r8 = r0.f2640;
                r9 = r0.f2637;
                r10 = r0.f2635;
                r3[r0.f2638] = r1[(r7 * r2) + r8];
                r3[r0.f2638 + 1] = r1[(r9 * r2) + r10];
             */
            /* JADX WARN: Code restructure failed: missing block: B:32:0x010d, code lost:
            
                if (r0.f2639 != r0.f2637) goto L38;
             */
            /* JADX WARN: Code restructure failed: missing block: B:33:0x010f, code lost:
            
                util.h.xy.bf.ma.AnonymousClass13.getHighSpeedVideoFpsRangesFor = (util.h.xy.bf.ma.AnonymousClass13.Camera2StreamConfigurationMap + 33) % 128;
                r0.f2640 = ((r0.f2640 + r2) - 1) % r2;
                r0.f2635 = ((r0.f2635 + r2) - 1) % r2;
                r7 = r0.f2639;
                r8 = r0.f2640;
                r9 = r0.f2637;
                r10 = r0.f2635;
                r3[r0.f2638] = r1[(r7 * r2) + r8];
                r3[r0.f2638 + 1] = r1[(r9 * r2) + r10];
             */
            /* JADX WARN: Code restructure failed: missing block: B:35:0x013f, code lost:
            
                r7 = r0.f2639;
                r8 = r0.f2635;
                r9 = r0.f2637;
                r10 = r0.f2640;
                r3[r0.f2638] = r1[(r7 * r2) + r8];
                r3[r0.f2638 + 1] = r1[(r9 * r2) + r10];
             */
            /* JADX WARN: Code restructure failed: missing block: B:37:0x00ac, code lost:
            
                r3[r0.f2638] = (char) (r0.f2641 - r12);
                r3[r0.f2638 + 1] = (char) (r0.f2636 - r12);
             */
            /* JADX WARN: Code restructure failed: missing block: B:40:0x00aa, code lost:
            
                if (r0.f2641 == r0.f2636) goto L31;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static void getHighSpeedVideoFpsRangesFor(byte b, java.lang.String str2, int i2, java.lang.Object[] objArr) {
                int i3;
                int i4 = getHighSpeedVideoFpsRangesFor + 61;
                int i5 = i4 % 128;
                Camera2StreamConfigurationMap = i5;
                if (i4 % 2 != 0) {
                    throw new java.lang.ArithmeticException();
                }
                int i6 = i5 + 99;
                getHighSpeedVideoFpsRangesFor = i6 % 128;
                if (i6 % 2 == 0) {
                    throw null;
                }
                char[] charArray = str2.toCharArray();
                util.h.xz.b.mc mcVar = new util.h.xz.b.mc();
                char[] cArr = getHighSpeedVideoSizesFor;
                if (cArr != null) {
                    int length = cArr.length;
                    char[] cArr2 = new char[length];
                    for (int i7 = 0; i7 < length; i7++) {
                        cArr2[i7] = (char) (cArr[i7] ^ 4042185467053315654L);
                    }
                    cArr = cArr2;
                }
                char c = (char) (4042185467053315654L ^ getOutputFormats);
                char[] cArr3 = new char[i2];
                if (i2 % 2 != 0) {
                    int i8 = getHighSpeedVideoFpsRangesFor + 59;
                    Camera2StreamConfigurationMap = i8 % 128;
                    if (i8 % 2 != 0) {
                        i3 = i2 + 39;
                        cArr3[i3] = (char) (charArray[i3] - b);
                    } else {
                        i3 = i2 - 1;
                        cArr3[i3] = (char) (charArray[i3] - b);
                    }
                } else {
                    i3 = i2;
                }
                if (i3 > 1) {
                    mcVar.f2638 = 0;
                    Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 91) % 128;
                    while (mcVar.f2638 < i3) {
                        int i9 = Camera2StreamConfigurationMap + 59;
                        getHighSpeedVideoFpsRangesFor = i9 % 128;
                        if (i9 % 2 == 0) {
                            mcVar.f2641 = charArray[mcVar.f2638];
                            mcVar.f2636 = charArray[mcVar.f2638 >>> 1];
                        } else {
                            mcVar.f2641 = charArray[mcVar.f2638];
                            mcVar.f2636 = charArray[mcVar.f2638 + 1];
                        }
                        mcVar.f2638 += 2;
                    }
                }
                for (int i10 = 0; i10 < i2; i10++) {
                    cArr3[i10] = (char) (cArr3[i10] ^ 13722);
                }
                objArr[0] = new java.lang.String(cArr3);
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = getOutputMinFrameDuration + 83;
                getInputSizeshNQ4ISI = i2 % 128;
                try {
                    if (i2 % 2 == 0) {
                        if (com.gemalto.mfs.mwsdk.payment.PaymentServiceListener.this != null) {
                            util.h.xy.bf.ma.getHighSpeedVideoFpsRangesFor();
                            java.lang.Object[] objArr = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor((byte) (android.graphics.Color.blue(0) + 102), "\n\t\t\u0007", 5 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr);
                            java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                            java.lang.Object[] objArr2 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor((byte) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 76), "\u0002\u000e\u0002\u0004\u000b\f\n\u0005\u0004\u0005", 10 - android.text.TextUtils.indexOf("", "", 0, 0), objArr2);
                            util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
                            com.gemalto.mfs.mwsdk.payment.PaymentServiceListener.this.onError(util.h.xy.bf.mc.m25434(paymentServiceErrorCode, str));
                            return;
                        }
                        util.h.xy.bf.ma.getHighSpeedVideoFpsRangesFor();
                        return;
                    }
                    throw new java.lang.ArithmeticException();
                } catch (java.lang.Throwable th) {
                    util.h.xy.bf.ma.getHighSpeedVideoFpsRangesFor();
                    th.getMessage();
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor((byte) (android.view.KeyEvent.getDeadChar(0, 0) + 102), "\n\t\t\u0007", 4 - android.widget.ExpandableListView.getPackedPositionGroup(0L), objArr3);
                    java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
                    try {
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor((byte) (56 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16)), "\u0002\u000e\u0002\u0004\u000b\f\n\u0005\u0004\u0005㘗", ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6) + 11, objArr4);
                        util.h.xy.am.ma.m25027(intern2, ((java.lang.String) objArr4[0]).intern());
                        int i3 = getInputSizeshNQ4ISI + 87;
                        getOutputMinFrameDuration = i3 % 128;
                        int i4 = i3 % 2;
                    } catch (java.lang.Throwable th2) {
                        java.lang.Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                }
            }
        };
        int i2 = getHighSpeedVideoSizes + 27;
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 == 0) {
            getHighSpeedVideoSizes(runnable);
            int i3 = Camera2StreamConfigurationMap;
            getHighSpeedVideoSizes = (((i3 | 47) << 1) - (i3 ^ 47)) % 128;
            return;
        }
        throw null;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static void m25419(final com.gemalto.mfs.mwsdk.payment.PaymentServiceListener paymentServiceListener, final com.gemalto.mfs.mwsdk.payment.engine.DeactivationStatus deactivationStatus, final com.gemalto.mfs.mwsdk.dcm.DigitalizedCardStatus digitalizedCardStatus, final com.gemalto.mfs.mwsdk.dcm.DigitalizedCard digitalizedCard) {
        int i = getHighSpeedVideoSizes;
        Camera2StreamConfigurationMap = ((i & 37) + (i | 37)) % 128;
        util.h.xy.bu.rb.m25675();
        util.h.xy.bf.mc.f939.m25442();
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: util.h.xy.bf.ma.5
            private static int getHighSpeedVideoFpsRangesFor = 0;
            private static int getInputFormats = 1;
            private static char[] getInputSizeshNQ4ISI = {42364, 42267, 42257, 42259, 42365, 42266, 42256, 42339, 42338, 42252, 42258, 42336, 42341, 42266, 42256, 42263, 42367, 42263, 42253, 42338, 42336, 42258, 42252, 42338, 42339, 42256, 42266, 42367, 42260, 42263, 42270, 42266, 42256, 42339, 42338, 42252, 42258, 42336, 42255, 42487, 42434, 42435, 42477, 42479, 42493, 42434, 42483, 42485, 42489, 42491};
            private static int getOutputFormats = 1;
            private static int getOutputMinFrameDuration;

            private static void getHighSpeedVideoFpsRanges(boolean z, int[] iArr, java.lang.String str, java.lang.Object[] objArr) {
                int i2;
                int length;
                char[] cArr;
                int i3;
                byte[] bytes = str.getBytes("ISO-8859-1");
                util.h.xz.b.ma maVar = new util.h.xz.b.ma();
                int i4 = iArr[0];
                int i5 = iArr[1];
                int i6 = iArr[2];
                int i7 = iArr[3];
                char[] cArr2 = getInputSizeshNQ4ISI;
                if (cArr2 != null) {
                    int i8 = getHighSpeedVideoFpsRangesFor + 91;
                    getInputFormats = i8 % 128;
                    if (i8 % 2 == 0) {
                        length = cArr2.length;
                        cArr = new char[length];
                        i3 = 1;
                    } else {
                        length = cArr2.length;
                        cArr = new char[length];
                        i3 = 0;
                    }
                    while (i3 < length) {
                        cArr[i3] = (char) (cArr2[i3] ^ (-8125198844289309347L));
                        i3++;
                    }
                    cArr2 = cArr;
                }
                char[] cArr3 = new char[i5];
                java.lang.System.arraycopy(cArr2, i4, cArr3, 0, i5);
                if (bytes != null) {
                    char[] cArr4 = new char[i5];
                    maVar.f2631 = 0;
                    char c = 0;
                    while (maVar.f2631 < i5) {
                        getInputFormats = (getHighSpeedVideoFpsRangesFor + 85) % 128;
                        if (bytes[maVar.f2631] == 1) {
                            cArr4[maVar.f2631] = (char) (((cArr3[maVar.f2631] * 2) + 1) - c);
                        } else {
                            cArr4[maVar.f2631] = (char) ((cArr3[maVar.f2631] * 2) - c);
                        }
                        c = cArr4[maVar.f2631];
                        maVar.f2631++;
                    }
                    cArr3 = cArr4;
                }
                if (i7 > 0) {
                    char[] cArr5 = new char[i5];
                    java.lang.System.arraycopy(cArr3, 0, cArr5, 0, i5);
                    int i9 = i5 - i7;
                    java.lang.System.arraycopy(cArr5, 0, cArr3, i9, i7);
                    java.lang.System.arraycopy(cArr5, i7, cArr3, 0, i9);
                }
                if (z) {
                    char[] cArr6 = new char[i5];
                    maVar.f2631 = 0;
                    while (maVar.f2631 < i5) {
                        int i10 = getHighSpeedVideoFpsRangesFor + 95;
                        getInputFormats = i10 % 128;
                        if (i10 % 2 == 0) {
                            cArr6[maVar.f2631] = cArr3[i5 << maVar.f2631];
                            i2 = maVar.f2631 >>> 1;
                        } else {
                            cArr6[maVar.f2631] = cArr3[(i5 - maVar.f2631) - 1];
                            i2 = maVar.f2631 + 1;
                        }
                        maVar.f2631 = i2;
                    }
                    cArr3 = cArr6;
                }
                if (i6 > 0) {
                    maVar.f2631 = 0;
                    while (maVar.f2631 < i5) {
                        cArr3[maVar.f2631] = (char) (cArr3[maVar.f2631] - iArr[2]);
                        maVar.f2631++;
                    }
                }
                objArr[0] = new java.lang.String(cArr3);
            }

            @Override // java.lang.Runnable
            public final void run() {
                com.gemalto.mfs.mwsdk.payment.engine.RemotePaymentServiceListener remotePaymentServiceListener;
                com.gemalto.mfs.mwsdk.payment.engine.DeactivationStatus deactivationStatus2;
                int i2 = (getOutputMinFrameDuration + 85) % 128;
                getOutputFormats = i2;
                try {
                    com.gemalto.mfs.mwsdk.payment.PaymentServiceListener paymentServiceListener2 = com.gemalto.mfs.mwsdk.payment.PaymentServiceListener.this;
                    if (paymentServiceListener2 instanceof com.gemalto.mfs.mwsdk.payment.engine.ContactlessPaymentServiceListener) {
                        getOutputMinFrameDuration = (i2 + 77) % 128;
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        getHighSpeedVideoFpsRanges(true, new int[]{0, 4, 0, 0}, "\u0001\u0000\u0001\u0000", objArr);
                        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRanges(false, new int[]{4, 12, 0, 0}, "\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000", objArr2);
                        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
                        ((com.gemalto.mfs.mwsdk.payment.engine.ContactlessPaymentServiceListener) com.gemalto.mfs.mwsdk.payment.PaymentServiceListener.this).onNextTransactionReady(deactivationStatus, digitalizedCardStatus, digitalizedCard);
                    } else if (paymentServiceListener2 instanceof com.gemalto.mfs.mwsdk.payment.engine.QRCodePaymentServiceListener) {
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRanges(true, new int[]{0, 4, 0, 0}, "\u0001\u0000\u0001\u0000", objArr3);
                        java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRanges(true, new int[]{16, 11, 0, 0}, "\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000", objArr4);
                        util.h.xy.am.ma.m25027(intern2, ((java.lang.String) objArr4[0]).intern());
                        ((com.gemalto.mfs.mwsdk.payment.engine.QRCodePaymentServiceListener) com.gemalto.mfs.mwsdk.payment.PaymentServiceListener.this).onNextTransactionReady(deactivationStatus, digitalizedCardStatus, digitalizedCard);
                    } else if (paymentServiceListener2 instanceof com.gemalto.mfs.mwsdk.payment.engine.RemotePaymentServiceListener) {
                        int i3 = i2 + 21;
                        getOutputMinFrameDuration = i3 % 128;
                        if (i3 % 2 != 0) {
                            java.lang.Object[] objArr5 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRanges(true, new int[]{0, 4, 0, 0}, "\u0001\u0000\u0001\u0000", objArr5);
                            java.lang.String intern3 = ((java.lang.String) objArr5[0]).intern();
                            java.lang.Object[] objArr6 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRanges(true, new int[]{27, 11, 0, 3}, "\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000", objArr6);
                            util.h.xy.am.ma.m25027(intern3, ((java.lang.String) objArr6[0]).intern());
                            remotePaymentServiceListener = (com.gemalto.mfs.mwsdk.payment.engine.RemotePaymentServiceListener) com.gemalto.mfs.mwsdk.payment.PaymentServiceListener.this;
                            deactivationStatus2 = deactivationStatus;
                        } else {
                            java.lang.Object[] objArr7 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRanges(true, new int[]{0, 4, 0, 0}, "\u0001\u0000\u0001\u0000", objArr7);
                            java.lang.String intern4 = ((java.lang.String) objArr7[0]).intern();
                            java.lang.Object[] objArr8 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRanges(false, new int[]{27, 11, 0, 3}, "\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000", objArr8);
                            util.h.xy.am.ma.m25027(intern4, ((java.lang.String) objArr8[0]).intern());
                            remotePaymentServiceListener = (com.gemalto.mfs.mwsdk.payment.engine.RemotePaymentServiceListener) com.gemalto.mfs.mwsdk.payment.PaymentServiceListener.this;
                            deactivationStatus2 = deactivationStatus;
                        }
                        remotePaymentServiceListener.onNextTransactionReady(deactivationStatus2, digitalizedCardStatus, digitalizedCard);
                    } else {
                        util.h.xy.bf.ma.getHighSpeedVideoFpsRangesFor();
                        deactivationStatus.getMessage();
                    }
                } catch (java.lang.Throwable th) {
                    util.h.xy.bf.ma.getHighSpeedVideoFpsRangesFor();
                    th.getMessage();
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges(true, new int[]{0, 4, 0, 0}, "\u0001\u0000\u0001\u0000", objArr9);
                    java.lang.String intern5 = ((java.lang.String) objArr9[0]).intern();
                    java.lang.Object[] objArr10 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges(true, new int[]{38, 12, 97, 10}, "\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0000", objArr10);
                    util.h.xy.am.ma.m25027(intern5, ((java.lang.String) objArr10[0]).intern());
                }
                int i4 = getOutputFormats + 21;
                getOutputMinFrameDuration = i4 % 128;
                if (i4 % 2 != 0) {
                    throw null;
                }
            }
        };
        int i2 = getHighSpeedVideoSizes;
        Camera2StreamConfigurationMap = ((i2 ^ 85) + ((i2 & 85) << 1)) % 128;
        getHighSpeedVideoSizes(runnable);
        int i3 = Camera2StreamConfigurationMap;
        int i4 = ((i3 | 81) << 1) - (i3 ^ 81);
        getHighSpeedVideoSizes = i4 % 128;
        if (i4 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static void m25425(final com.gemalto.mfs.mwsdk.payment.PaymentServiceListener paymentServiceListener, final int i) {
        Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        util.h.xy.bu.rb.m25675();
        util.h.xy.bf.mc.f939.m25442();
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: util.h.xy.bf.ma.3
            private static int Camera2StreamConfigurationMap = 1;
            private static long getHighResolutionOutputSizeshNQ4ISI = 2457411417541981002L;
            private static int getHighSpeedVideoFpsRanges = 0;
            private static int getHighSpeedVideoSizesFor = 1;
            private static int getInputSizeshNQ4ISI = 0;
            private static char getOutputFormats = 28342;
            private static int getOutputMinFrameDuration = 294925130;

            private static void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, char c, int i2, java.lang.String str2, java.lang.String str3, java.lang.Object[] objArr) {
                int i3 = (getHighSpeedVideoFpsRanges + 67) % 128;
                Camera2StreamConfigurationMap = i3;
                int i4 = i3 + 37;
                getHighSpeedVideoFpsRanges = i4 % 128;
                if (i4 % 2 != 0) {
                    throw new java.lang.ArithmeticException();
                }
                char[] charArray = str3.toCharArray();
                char[] charArray2 = str2.toCharArray();
                char[] charArray3 = str.toCharArray();
                util.h.xz.b.rc rcVar = new util.h.xz.b.rc();
                int length = charArray2.length;
                char[] cArr = new char[length];
                int length2 = charArray.length;
                char[] cArr2 = new char[length2];
                java.lang.System.arraycopy(charArray2, 0, cArr, 0, length);
                java.lang.System.arraycopy(charArray, 0, cArr2, 0, length2);
                cArr[0] = (char) (cArr[0] ^ c);
                cArr2[2] = (char) (cArr2[2] + ((char) i2));
                int length3 = charArray3.length;
                char[] cArr3 = new char[length3];
                rcVar.f2652 = 0;
                while (rcVar.f2652 < length3) {
                    getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 115) % 128;
                    int i5 = (rcVar.f2652 + 2) % 4;
                    int i6 = (rcVar.f2652 + 3) % 4;
                    rcVar.f2653 = (char) (((cArr[rcVar.f2652 % 4] * 32718) + cArr2[i5]) % 65535);
                    cArr2[i6] = (char) (((cArr[i6] * 32718) + cArr2[i5]) / 65535);
                    cArr[i6] = rcVar.f2653;
                    cArr3[rcVar.f2652] = (char) ((((cArr[i6] ^ charArray3[rcVar.f2652]) ^ (getHighResolutionOutputSizeshNQ4ISI ^ 2457411417541981002L)) ^ ((int) (getOutputMinFrameDuration ^ 2457411417541981002L))) ^ ((char) (getOutputFormats ^ 2457411417541981002L)));
                    rcVar.f2652++;
                }
                objArr[0] = new java.lang.String(cArr3);
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = getInputSizeshNQ4ISI + 23;
                getHighSpeedVideoSizesFor = i2 % 128;
                try {
                    if (i2 % 2 != 0) {
                        if (com.gemalto.mfs.mwsdk.payment.PaymentServiceListener.this != null) {
                            char argb = (char) (android.graphics.Color.argb(0, 0, 0, 0) + 13516);
                            int i3 = getHighSpeedVideoSizesFor + 101;
                            getInputSizeshNQ4ISI = i3 % 128;
                            if (i3 % 2 != 0) {
                                int i4 = 5 / 2;
                            }
                            try {
                                java.lang.Object[] objArr = new java.lang.Object[1];
                                getHighResolutionOutputSizeshNQ4ISI("緉㓃\udbbe⎃", argb, (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6, "え讆찴젴", "\u0000\u0000\u0000\u0000", objArr);
                                java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                                java.lang.Object[] objArr2 = new java.lang.Object[1];
                                getHighResolutionOutputSizeshNQ4ISI("睃䰱\udc54耈镆\uaacc罚㪡䕀僚꜈", (char) android.view.View.resolveSize(0, 0), 2119968118 + (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), "盖尥噾엀", "\u0000\u0000\u0000\u0000", objArr2);
                                util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
                                com.gemalto.mfs.mwsdk.payment.PaymentServiceListener.this.onError(util.h.xy.bf.mc.m25432(i));
                                return;
                            } catch (java.lang.Throwable th) {
                                java.lang.Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        }
                        util.h.xy.bf.ma.getHighSpeedVideoFpsRangesFor();
                        return;
                    }
                    throw null;
                } catch (java.lang.Throwable th2) {
                    util.h.xy.bf.ma.getHighSpeedVideoFpsRangesFor();
                    th2.getMessage();
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI("緉㓃\udbbe⎃", (char) ((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 13516), 1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), "え讆찴젴", "\u0000\u0000\u0000\u0000", objArr3);
                    java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI("帰\uf566鸥ꃭῙ\uf242臚娨ꑖ\udf37酂䗟", (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), 1 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), "㘻娬킢ラ", "\u0000\u0000\u0000\u0000", objArr4);
                    util.h.xy.am.ma.m25027(intern2, ((java.lang.String) objArr4[0]).intern());
                }
            }
        };
        int i2 = getHighSpeedVideoSizes;
        Camera2StreamConfigurationMap = (((i2 | 3) << 1) - (i2 ^ 3)) % 128;
        getHighSpeedVideoSizes(runnable);
        Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 23) % 128;
    }

    private static void getHighSpeedVideoSizes(java.lang.Runnable runnable) {
        int i = getHighSpeedVideoSizes + 111;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 != 0) {
            util.h.xy.ag.a.m24556().m24558();
            throw null;
        }
        if (util.h.xy.ag.a.m24556().m24558() != null) {
            getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 71) % 128;
            util.h.xy.ag.a.m24556().m24557(runnable);
            getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 111) % 128;
        } else {
            util.h.xy.ag.a m24556 = util.h.xy.ag.a.m24556();
            final com.gemalto.mfs.mwsdk.payment.engine.ContactlessPaymentServiceListener m25413 = util.h.xy.bf.c.f934.m25413();
            java.lang.Runnable runnable2 = new java.lang.Runnable() { // from class: util.h.xy.bf.ma.10
                private static int Camera2StreamConfigurationMap = 0;
                private static char getHighSpeedVideoFpsRanges = 63981;
                private static int getHighSpeedVideoFpsRangesFor = 0;
                private static int getHighSpeedVideoSizes = 1;
                private static char getInputFormats = 29999;
                private static int getInputSizeshNQ4ISI = 1;
                private static char getOutputFormats = 26174;
                private static char getOutputMinFrameDuration = 36944;

                private static void getHighSpeedVideoSizes(java.lang.String str, int i2, java.lang.Object[] objArr) {
                    int i3 = (getHighSpeedVideoFpsRangesFor + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                    getHighSpeedVideoSizes = i3;
                    getHighSpeedVideoFpsRangesFor = (i3 + 87) % 128;
                    char[] charArray = str.toCharArray();
                    util.h.xz.b.e eVar = new util.h.xz.b.e();
                    char[] cArr = new char[charArray.length];
                    eVar.f2630 = 0;
                    char[] cArr2 = new char[2];
                    while (eVar.f2630 < charArray.length) {
                        cArr2[0] = charArray[eVar.f2630];
                        cArr2[1] = charArray[eVar.f2630 + 1];
                        int i4 = 58224;
                        for (int i5 = 0; i5 < 16; i5++) {
                            char c = cArr2[1];
                            char c2 = cArr2[0];
                            char c3 = (char) (c - (((c2 + i4) ^ ((c2 << 4) + ((char) (getInputFormats ^ 3155153533016530592L)))) ^ ((c2 >>> 5) + ((char) (getOutputFormats ^ 3155153533016530592L)))));
                            cArr2[1] = c3;
                            cArr2[0] = (char) (c2 - ((((c3 << 4) + ((char) (getHighSpeedVideoFpsRanges ^ 3155153533016530592L))) ^ (c3 + i4)) ^ ((c3 >>> 5) + ((char) (getOutputMinFrameDuration ^ 3155153533016530592L)))));
                            i4 -= 40503;
                        }
                        cArr[eVar.f2630] = cArr2[0];
                        cArr[eVar.f2630 + 1] = cArr2[1];
                        eVar.f2630 += 2;
                    }
                    objArr[0] = new java.lang.String(cArr, 0, i2);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    getInputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 115) % 128;
                    try {
                        if (com.gemalto.mfs.mwsdk.payment.PaymentServiceListener.this == null) {
                            util.h.xy.bf.ma.getHighSpeedVideoFpsRangesFor();
                            Camera2StreamConfigurationMap = (getInputSizeshNQ4ISI + 61) % 128;
                            return;
                        }
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        getHighSpeedVideoSizes("憒鬬\ueabc\uf2db", 4 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr);
                        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        getHighSpeedVideoSizes("썰ꉹ失혡⚡횄\udcbe焌舣\ue92c쾉峝", android.view.View.MeasureSpec.getSize(0) + 12, objArr2);
                        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
                        com.gemalto.mfs.mwsdk.payment.PaymentServiceListener paymentServiceListener = com.gemalto.mfs.mwsdk.payment.PaymentServiceListener.this;
                        com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode paymentServiceErrorCode = com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.NULL_CONTEXT;
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        getHighSpeedVideoSizes("煉囃땏ꘓẑꐸ莞糡莙ͪ츎Œ⾂릾덗靇鬬寬뎨祱\u0ff0˒\uf2e3\uddd6꺒┌ʺ䔎ᢤ鮯\uf06aㇻ\uf2e3\uddd6蛂셙땏ꘓẑꐸ莞糡莙ͪᢤ鮯쇥虣\uf5cb殕ꇠꐪﾈ\udc59\uf2e3\uddd6顺䳷㥵\udf9d", 59 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), objArr3);
                        paymentServiceListener.onError(util.h.xy.bf.mc.m25434(paymentServiceErrorCode, ((java.lang.String) objArr3[0]).intern()));
                    } catch (java.lang.Throwable th) {
                        util.h.xy.bf.ma.getHighSpeedVideoFpsRangesFor();
                        th.getMessage();
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        getHighSpeedVideoSizes("憒鬬\ueabc\uf2db", android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - ',', objArr4);
                        java.lang.String intern2 = ((java.lang.String) objArr4[0]).intern();
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        getHighSpeedVideoSizes("썰ꉹ失혡⚡횄\udcbe焌舣\ue92c쾉峝涘폳", 13 - android.text.TextUtils.getOffsetAfter("", 0), objArr5);
                        util.h.xy.am.ma.m25027(intern2, ((java.lang.String) objArr5[0]).intern());
                    }
                }
            };
            getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 105) % 128;
            m24556.m24557(runnable2);
        }
        int i2 = Camera2StreamConfigurationMap;
        int i3 = ((i2 | 91) << 1) - (i2 ^ 91);
        getHighSpeedVideoSizes = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    private static java.lang.Runnable getHighSpeedVideoFpsRanges(final com.gemalto.mfs.mwsdk.payment.PaymentServiceListener paymentServiceListener) {
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: util.h.xy.bf.ma.4
            private static int getHighResolutionOutputSizeshNQ4ISI = 0;
            private static int getHighSpeedVideoFpsRanges = 0;
            private static int getHighSpeedVideoFpsRangesFor = 1;
            private static int getHighSpeedVideoSizes = 1;
            private static int getHighSpeedVideoSizesFor = -1231763967;

            private static void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, int i, int i2, int i3, boolean z, java.lang.Object[] objArr) {
                int i4 = (getHighSpeedVideoFpsRangesFor + 81) % 128;
                getHighSpeedVideoFpsRanges = i4;
                int i5 = i4 + 101;
                getHighSpeedVideoFpsRangesFor = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
                char[] charArray = str.toCharArray();
                util.h.xz.b.ra raVar = new util.h.xz.b.ra();
                char[] cArr = new char[i];
                raVar.f2649 = 0;
                while (raVar.f2649 < i) {
                    raVar.f2650 = charArray[raVar.f2649];
                    cArr[raVar.f2649] = (char) (raVar.f2650 + i3);
                    int i6 = raVar.f2649;
                    cArr[i6] = (char) (cArr[i6] - ((int) (getHighSpeedVideoSizesFor ^ (-4839292868003314026L))));
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
                    getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 59) % 128;
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
                    if (!(com.gemalto.mfs.mwsdk.payment.PaymentServiceListener.this instanceof com.gemalto.mfs.mwsdk.payment.engine.ContactlessPaymentServiceListener)) {
                        util.h.xy.bf.ma.getHighSpeedVideoFpsRangesFor();
                    } else {
                        getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 81) % 128;
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI("\ufff9\u0002\u0006\uffff", 4 - android.view.View.resolveSizeAndState(0, 0, 0), 1 - android.view.View.MeasureSpec.getSize(0), (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 225, false, objArr);
                        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI("\r\n￨\b\u0007\ufffb�\u000e\u0000\t￨\u0006", 12 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), android.view.View.resolveSize(0, 0) + 6, (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE, true, objArr2);
                        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
                        ((com.gemalto.mfs.mwsdk.payment.engine.ContactlessPaymentServiceListener) com.gemalto.mfs.mwsdk.payment.PaymentServiceListener.this).onFirstTapCompleted();
                    }
                } catch (java.lang.Throwable th) {
                    util.h.xy.bf.ma.getHighSpeedVideoFpsRangesFor();
                    th.getMessage();
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI("\ufff9\u0002\u0006\uffff", android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 4, -android.view.MotionEvent.axisFromString(""), (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 225, false, objArr3);
                    java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI("￨\u0006\r\n￨\b\u0007\ufffb\uffff�\u000e\u0000\t", 13 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), 8 - android.view.View.getDefaultSize(0, 0), (android.view.ViewConfiguration.getTapTimeout() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE, true, objArr4);
                    util.h.xy.am.ma.m25027(intern2, ((java.lang.String) objArr4[0]).intern());
                }
                int i = getHighResolutionOutputSizeshNQ4ISI + 19;
                getHighSpeedVideoSizes = i % 128;
                if (i % 2 == 0) {
                    throw new java.lang.ArithmeticException();
                }
            }
        };
        int i = Camera2StreamConfigurationMap;
        getHighSpeedVideoSizes = ((i ^ 45) + ((i & 45) << 1)) % 128;
        return runnable;
    }

    private static java.lang.Runnable getHighResolutionOutputSizeshNQ4ISI(final com.gemalto.mfs.mwsdk.payment.PaymentServiceListener paymentServiceListener) {
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: util.h.xy.bf.ma.7
            private static char Camera2StreamConfigurationMap = 15743;
            private static int getHighResolutionOutputSizeshNQ4ISI = 1;
            private static int getHighSpeedVideoFpsRanges = 0;
            private static int getHighSpeedVideoFpsRangesFor = 1;
            private static char getHighSpeedVideoSizesFor = 49569;
            private static char getInputFormats = 31687;
            private static char getInputSizeshNQ4ISI = 15232;
            private static int getOutputMinFrameDuration;

            private static void Camera2StreamConfigurationMap(java.lang.String str, int i, java.lang.Object[] objArr) {
                char[] charArray = str.toCharArray();
                util.h.xz.b.e eVar = new util.h.xz.b.e();
                char[] cArr = new char[charArray.length];
                eVar.f2630 = 0;
                char[] cArr2 = new char[2];
                while (eVar.f2630 < charArray.length) {
                    int i2 = getHighSpeedVideoFpsRanges + 13;
                    getHighSpeedVideoFpsRangesFor = i2 % 128;
                    if (i2 % 2 == 0) {
                        cArr2[0] = charArray[eVar.f2630];
                        cArr2[0] = charArray[eVar.f2630];
                    } else {
                        cArr2[0] = charArray[eVar.f2630];
                        cArr2[1] = charArray[eVar.f2630 + 1];
                    }
                    int i3 = 58224;
                    int i4 = 0;
                    while (i4 < 16) {
                        char c = cArr2[1];
                        char c2 = cArr2[0];
                        char c3 = (char) (c - (((c2 + i3) ^ ((c2 << 4) + ((char) (getInputFormats ^ 3155153533016530592L)))) ^ ((c2 >>> 5) + ((char) (getHighSpeedVideoSizesFor ^ 3155153533016530592L)))));
                        cArr2[1] = c3;
                        cArr2[0] = (char) (c2 - ((((c3 << 4) + ((char) (Camera2StreamConfigurationMap ^ 3155153533016530592L))) ^ (c3 + i3)) ^ ((c3 >>> 5) + ((char) (getInputSizeshNQ4ISI ^ 3155153533016530592L)))));
                        i3 -= 40503;
                        i4++;
                        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 45) % 128;
                    }
                    cArr[eVar.f2630] = cArr2[0];
                    cArr[eVar.f2630 + 1] = cArr2[1];
                    eVar.f2630 += 2;
                    getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 79) % 128;
                }
                objArr[0] = new java.lang.String(cArr, 0, i);
            }

            @Override // java.lang.Runnable
            public final void run() {
                java.lang.String intern;
                int i;
                getHighResolutionOutputSizeshNQ4ISI = (getOutputMinFrameDuration + 101) % 128;
                try {
                    com.gemalto.mfs.mwsdk.sdkconfig.SDKController.getInstance().getSDKServiceState();
                    com.gemalto.mfs.mwsdk.sdkconfig.SDKServiceState sDKServiceState = com.gemalto.mfs.mwsdk.sdkconfig.SDKServiceState.STATE_INITIALIZED;
                    if (com.gemalto.mfs.mwsdk.payment.PaymentServiceListener.this == null) {
                        util.h.xy.bf.ma.getHighSpeedVideoFpsRangesFor();
                        return;
                    }
                    int i2 = getHighResolutionOutputSizeshNQ4ISI + 63;
                    getOutputMinFrameDuration = i2 % 128;
                    if (i2 % 2 != 0) {
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        Camera2StreamConfigurationMap("慮ꖈ\uf1a5㿴", 2 / android.widget.ExpandableListView.getPackedPositionChild(0L), objArr);
                        intern = ((java.lang.String) objArr[0]).intern();
                        i = 103;
                    } else {
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        Camera2StreamConfigurationMap("慮ꖈ\uf1a5㿴", android.widget.ExpandableListView.getPackedPositionChild(0L) + 5, objArr2);
                        intern = ((java.lang.String) objArr2[0]).intern();
                        i = 12;
                    }
                    try {
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        Camera2StreamConfigurationMap("ூ졪䮹\ue474甆苟䮹\ue474髈\ueb6b볼鿘", i + ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue(), objArr3);
                        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr3[0]).intern());
                        com.gemalto.mfs.mwsdk.payment.PaymentServiceListener paymentServiceListener2 = com.gemalto.mfs.mwsdk.payment.PaymentServiceListener.this;
                        com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode paymentServiceErrorCode = com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.POS_COMM_DISCONNECTED;
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        Camera2StreamConfigurationMap("\uec4d\udb6d殉᷒\uf252降䵍껉㛖濫誧䙳浜ꬓ㬭ϰ裏\uf1d0ꭧ䮅㉳ᣥ㊹镙ᬜ\ufffa䏧墅㨰鞰꩔ᢲ溳忣旚\ue64f맫䂈ꫳۧ\ue875ર⥎\ue2ed✘㭫\uf252降꩔ᢲ\uf58c륮\ue7a8䑙ꭧ䮅㉳ᣥ㊹镙ᬜ\ufffa誧䙳ꭅꙥ㵞\ue50e\ue875ર饀\uee4f", android.view.Gravity.getAbsoluteGravity(0, 0) + 72, objArr4);
                        paymentServiceListener2.onError(util.h.xy.bf.mc.m25434(paymentServiceErrorCode, ((java.lang.String) objArr4[0]).intern()));
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } catch (java.lang.Throwable th2) {
                    util.h.xy.bf.ma.getHighSpeedVideoFpsRangesFor();
                    th2.getMessage();
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    Camera2StreamConfigurationMap("慮ꖈ\uf1a5㿴", 5 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr5);
                    java.lang.String intern2 = ((java.lang.String) objArr5[0]).intern();
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    Camera2StreamConfigurationMap("쮔敗륍\uf5a1槙眑\udbb9每⁜랓봟熑볼鿘", (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 12, objArr6);
                    util.h.xy.am.ma.m25027(intern2, ((java.lang.String) objArr6[0]).intern());
                }
            }
        };
        int i = Camera2StreamConfigurationMap + 45;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 != 0) {
            return runnable;
        }
        throw new java.lang.ArithmeticException();
    }

    private static java.lang.Runnable getHighSpeedVideoSizes(final com.gemalto.mfs.mwsdk.payment.PaymentServiceListener paymentServiceListener) {
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: util.h.xy.bf.ma.8
            private static int getHighResolutionOutputSizeshNQ4ISI = 1;
            private static int getHighSpeedVideoFpsRanges = 1;
            private static int getHighSpeedVideoSizes;
            private static int getInputSizeshNQ4ISI;
            private static char[] getInputFormats = {41896, 41918, 41904, 41913, 41880, 41914, 41902, 41868, 41910, 41908, 41877, 41970, 41912, 41917, 41873, 41916, 41874, 41897, 41907, 41909, 41893, 41906, 41872, 41919, 41900, 41887, 41871, 41885, 41915, 41905, 41903, 41879, 41894, 41881, 41980, 41911};
            private static char Camera2StreamConfigurationMap = 38464;

            private static void getHighSpeedVideoFpsRanges(byte b, java.lang.String str, int i, java.lang.Object[] objArr) {
                int i2;
                int i3 = getHighSpeedVideoFpsRanges + 61;
                getHighSpeedVideoSizes = i3 % 128;
                if (i3 % 2 != 0) {
                    throw null;
                }
                char[] charArray = str.toCharArray();
                util.h.xz.b.mc mcVar = new util.h.xz.b.mc();
                char[] cArr = getInputFormats;
                if (cArr != null) {
                    int length = cArr.length;
                    char[] cArr2 = new char[length];
                    for (int i4 = 0; i4 < length; i4++) {
                        cArr2[i4] = (char) (cArr[i4] ^ 4042185467053315654L);
                    }
                    cArr = cArr2;
                }
                char c = (char) (4042185467053315654L ^ Camera2StreamConfigurationMap);
                char[] cArr3 = new char[i];
                if (i % 2 != 0) {
                    i2 = i - 1;
                    cArr3[i2] = (char) (charArray[i2] - b);
                } else {
                    i2 = i;
                }
                if (i2 > 1) {
                    int i5 = getHighSpeedVideoSizes + 125;
                    getHighSpeedVideoFpsRanges = i5 % 128;
                    if (i5 % 2 == 0) {
                        mcVar.f2638 = 1;
                    } else {
                        mcVar.f2638 = 0;
                    }
                    while (mcVar.f2638 < i2) {
                        getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 39) % 128;
                        mcVar.f2641 = charArray[mcVar.f2638];
                        mcVar.f2636 = charArray[mcVar.f2638 + 1];
                        if (mcVar.f2641 == mcVar.f2636) {
                            int i6 = getHighSpeedVideoFpsRanges + 13;
                            getHighSpeedVideoSizes = i6 % 128;
                            if (i6 % 2 != 0) {
                                cArr3[mcVar.f2638] = (char) (mcVar.f2641 - b);
                                cArr3[mcVar.f2638] = (char) (mcVar.f2636 / b);
                            } else {
                                cArr3[mcVar.f2638] = (char) (mcVar.f2641 - b);
                                cArr3[mcVar.f2638 + 1] = (char) (mcVar.f2636 - b);
                            }
                        } else {
                            mcVar.f2639 = mcVar.f2641 / c;
                            mcVar.f2640 = mcVar.f2641 % c;
                            mcVar.f2637 = mcVar.f2636 / c;
                            mcVar.f2635 = mcVar.f2636 % c;
                            if (mcVar.f2640 == mcVar.f2635) {
                                mcVar.f2639 = ((mcVar.f2639 + c) - 1) % c;
                                mcVar.f2637 = ((mcVar.f2637 + c) - 1) % c;
                                int i7 = mcVar.f2639;
                                int i8 = mcVar.f2640;
                                int i9 = mcVar.f2637;
                                int i10 = mcVar.f2635;
                                cArr3[mcVar.f2638] = cArr[(i7 * c) + i8];
                                cArr3[mcVar.f2638 + 1] = cArr[(i9 * c) + i10];
                            } else if (mcVar.f2639 == mcVar.f2637) {
                                mcVar.f2640 = ((mcVar.f2640 + c) - 1) % c;
                                mcVar.f2635 = ((mcVar.f2635 + c) - 1) % c;
                                int i11 = mcVar.f2639;
                                int i12 = mcVar.f2640;
                                int i13 = mcVar.f2637;
                                int i14 = mcVar.f2635;
                                cArr3[mcVar.f2638] = cArr[(i11 * c) + i12];
                                cArr3[mcVar.f2638 + 1] = cArr[(i13 * c) + i14];
                            } else {
                                int i15 = mcVar.f2639;
                                int i16 = mcVar.f2635;
                                int i17 = mcVar.f2637;
                                int i18 = mcVar.f2640;
                                cArr3[mcVar.f2638] = cArr[(i15 * c) + i16];
                                cArr3[mcVar.f2638 + 1] = cArr[(i17 * c) + i18];
                                int i19 = getHighSpeedVideoSizes + 39;
                                getHighSpeedVideoFpsRanges = i19 % 128;
                                if (i19 % 2 == 0) {
                                    int i20 = 2 / 3;
                                }
                            }
                        }
                        mcVar.f2638 += 2;
                    }
                }
                for (int i21 = 0; i21 < i; i21++) {
                    cArr3[i21] = (char) (cArr3[i21] ^ 13722);
                }
                objArr[0] = new java.lang.String(cArr3);
            }

            @Override // java.lang.Runnable
            public final void run() {
                getInputSizeshNQ4ISI = (getHighResolutionOutputSizeshNQ4ISI + 95) % 128;
                try {
                    if (com.gemalto.mfs.mwsdk.payment.PaymentServiceListener.this == null) {
                        util.h.xy.bf.ma.getHighSpeedVideoFpsRangesFor();
                        return;
                    }
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges((byte) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 68), "\u0013\n\u0007\u001c", (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 4, objArr);
                    java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges((byte) (30 - android.graphics.ImageFormat.getBitsPerPixel(0)), "\u001a\u000f\u0011\n\b\u0019\u0017\n\u001c\u000e\t\"", 12 - android.view.Gravity.getAbsoluteGravity(0, 0), objArr2);
                    util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
                    com.gemalto.mfs.mwsdk.payment.PaymentServiceListener paymentServiceListener2 = com.gemalto.mfs.mwsdk.payment.PaymentServiceListener.this;
                    com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode paymentServiceErrorCode = com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.PAYMENT_NOT_ALLOWED_SDK_NOT_INITIALIZED;
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges((byte) (android.view.KeyEvent.normalizeMetaState(0) + 73), "\u001c\u0002 ##\u0017\u0000\u0006\u001f\u0004\u0004!\u0014\u0016\u0012\u0001\u0019\u0013\u0001\u0014!\u0002\u0010\u001e\u0002\u0004\u0000\u0017\t\u0000\u001e\u001c\u000e\u0013\u001b\u0005\u0012\u0003#\u0016\u0017\f\u0000\u000e\u001f\u0004\u0004!\u0012\u0018\u001b\t", android.graphics.Color.argb(0, 0, 0, 0) + 52, objArr3);
                    paymentServiceListener2.onError(util.h.xy.bf.mc.m25434(paymentServiceErrorCode, ((java.lang.String) objArr3[0]).intern()));
                    getHighResolutionOutputSizeshNQ4ISI = (getInputSizeshNQ4ISI + 69) % 128;
                } catch (java.lang.Throwable th) {
                    util.h.xy.bf.ma.getHighSpeedVideoFpsRangesFor();
                    th.getMessage();
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges((byte) (android.widget.ExpandableListView.getPackedPositionType(0L) + 67), "\u0013\n\u0007\u001c", 4 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr4);
                    java.lang.String intern2 = ((java.lang.String) objArr4[0]).intern();
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges((byte) (android.widget.ExpandableListView.getPackedPositionGroup(0L) + 76), "\u001a\u000f\u0011\n\b\u0019\u0017\n\u001c\u000e\t\"㘫", 13 - android.graphics.Color.green(0), objArr5);
                    util.h.xy.am.ma.m25027(intern2, ((java.lang.String) objArr5[0]).intern());
                }
            }
        };
        int i = Camera2StreamConfigurationMap;
        int i2 = (i & 85) + (i | 85);
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 != 0) {
            return runnable;
        }
        throw null;
    }

    private static java.lang.Runnable getHighSpeedVideoFpsRangesFor(final com.gemalto.mfs.mwsdk.payment.PaymentServiceListener paymentServiceListener, final com.gemalto.mfs.mwsdk.payment.engine.DeactivationStatus deactivationStatus, final com.gemalto.mfs.mwsdk.dcm.DigitalizedCardStatus digitalizedCardStatus, final com.gemalto.mfs.mwsdk.dcm.DigitalizedCard digitalizedCard) {
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: util.h.xy.bf.ma.2
            private static int getHighResolutionOutputSizeshNQ4ISI = 0;
            private static int[] getHighSpeedVideoSizesFor = {-1268028435, 90359, 445552276, -1556295938, -1022199801, 1047770986, 492485513, -2054691647, -1573828012, 86777999, 1158893105, -1179315765, 1861867250, 23448564, -451418466, -16214595, -1099556348, 1025378273};
            private static int getInputFormats = 1;
            private static int getInputSizeshNQ4ISI = 1;
            private static int getOutputFormats;

            private static void getHighSpeedVideoFpsRanges(int[] iArr, int i, java.lang.Object[] objArr) {
                util.h.xz.b.c cVar = new util.h.xz.b.c();
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length * 2];
                int[] iArr2 = getHighSpeedVideoSizesFor;
                if (iArr2 != null) {
                    getInputSizeshNQ4ISI = (getHighResolutionOutputSizeshNQ4ISI + 31) % 128;
                    int length = iArr2.length;
                    int[] iArr3 = new int[length];
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr3[i2] = (int) (iArr2[i2] ^ (-5569649899877129369L));
                    }
                    iArr2 = iArr3;
                }
                int length2 = iArr2.length;
                int[] iArr4 = new int[length2];
                int[] iArr5 = getHighSpeedVideoSizesFor;
                if (iArr5 != null) {
                    int length3 = iArr5.length;
                    int[] iArr6 = new int[length3];
                    int i3 = 0;
                    while (i3 < length3) {
                        int i4 = getInputSizeshNQ4ISI + 15;
                        getHighResolutionOutputSizeshNQ4ISI = i4 % 128;
                        if (i4 % 2 != 0) {
                            iArr6[i3] = (int) (iArr5[i3] - 5569649899877129369L);
                        } else {
                            iArr6[i3] = (int) (iArr5[i3] ^ (-5569649899877129369L));
                            i3++;
                        }
                    }
                    iArr5 = iArr6;
                }
                java.lang.System.arraycopy(iArr5, 0, iArr4, 0, length2);
                cVar.f2626 = 0;
                getHighResolutionOutputSizeshNQ4ISI = (getInputSizeshNQ4ISI + 93) % 128;
                while (cVar.f2626 < iArr.length) {
                    cArr[0] = (char) (iArr[cVar.f2626] >> 16);
                    cArr[1] = (char) iArr[cVar.f2626];
                    cArr[2] = (char) (iArr[cVar.f2626 + 1] >> 16);
                    cArr[3] = (char) iArr[cVar.f2626 + 1];
                    cVar.f2627 = (cArr[0] << 16) + cArr[1];
                    cVar.f2625 = (cArr[2] << 16) + cArr[3];
                    util.h.xz.b.c.m27723(iArr4);
                    for (int i5 = 0; i5 < 16; i5++) {
                        cVar.f2627 ^= iArr4[i5];
                        cVar.f2625 = util.h.xz.b.c.m27724(cVar.f2627) ^ cVar.f2625;
                        int i6 = cVar.f2627;
                        cVar.f2627 = cVar.f2625;
                        cVar.f2625 = i6;
                    }
                    int i7 = cVar.f2627;
                    cVar.f2627 = cVar.f2625;
                    cVar.f2625 = i7;
                    cVar.f2625 ^= iArr4[16];
                    cVar.f2627 ^= iArr4[17];
                    int i8 = cVar.f2627;
                    int i9 = cVar.f2625;
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
                objArr[0] = new java.lang.String(cArr2, 0, i);
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i = 6;
                try {
                    com.gemalto.mfs.mwsdk.payment.PaymentServiceListener paymentServiceListener2 = com.gemalto.mfs.mwsdk.payment.PaymentServiceListener.this;
                    if (paymentServiceListener2 instanceof com.gemalto.mfs.mwsdk.payment.engine.ContactlessPaymentServiceListener) {
                        getInputFormats = (getOutputFormats + 41) % 128;
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        getHighSpeedVideoFpsRanges(new int[]{1174639632, -248601900}, 4 - android.view.KeyEvent.normalizeMetaState(0), objArr);
                        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRanges(new int[]{-1925336048, 1945324399, -1518901307, 1931067302, 1883083920, -957465333}, 13 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr2);
                        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
                        ((com.gemalto.mfs.mwsdk.payment.engine.ContactlessPaymentServiceListener) com.gemalto.mfs.mwsdk.payment.PaymentServiceListener.this).onNextTransactionReady(deactivationStatus, digitalizedCardStatus, digitalizedCard);
                    } else if (paymentServiceListener2 instanceof com.gemalto.mfs.mwsdk.payment.engine.QRCodePaymentServiceListener) {
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRanges(new int[]{1174639632, -248601900}, (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 4, objArr3);
                        java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRanges(new int[]{-1925336048, 1945324399, -1518901307, 1931067302, -1219857745, 254806225}, 12 - android.text.TextUtils.getTrimmedLength(""), objArr4);
                        util.h.xy.am.ma.m25027(intern2, ((java.lang.String) objArr4[0]).intern());
                        ((com.gemalto.mfs.mwsdk.payment.engine.QRCodePaymentServiceListener) com.gemalto.mfs.mwsdk.payment.PaymentServiceListener.this).onNextTransactionReady(deactivationStatus, digitalizedCardStatus, digitalizedCard);
                    } else if (paymentServiceListener2 instanceof com.gemalto.mfs.mwsdk.payment.engine.RemotePaymentServiceListener) {
                        getOutputFormats = (getInputFormats + 99) % 128;
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRanges(new int[]{1174639632, -248601900}, (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 4, objArr5);
                        java.lang.String intern3 = ((java.lang.String) objArr5[0]).intern();
                        java.lang.Object[] objArr6 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRanges(new int[]{-1925336048, 1945324399, -1518901307, 1931067302, 1394940176, -2104386761, -2136081022, 338345019}, 13 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), objArr6);
                        util.h.xy.am.ma.m25027(intern3, ((java.lang.String) objArr6[0]).intern());
                        ((com.gemalto.mfs.mwsdk.payment.engine.RemotePaymentServiceListener) com.gemalto.mfs.mwsdk.payment.PaymentServiceListener.this).onNextTransactionReady(deactivationStatus, digitalizedCardStatus, digitalizedCard);
                        i = (getInputFormats + 37) % 128;
                        getOutputFormats = i;
                    } else {
                        util.h.xy.bf.ma.getHighSpeedVideoFpsRangesFor();
                    }
                } catch (java.lang.Throwable th) {
                    util.h.xy.bf.ma.getHighSpeedVideoFpsRangesFor();
                    th.getMessage();
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges(new int[]{1174639632, -248601900}, (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 3, objArr7);
                    java.lang.String intern4 = ((java.lang.String) objArr7[0]).intern();
                    int[] iArr = new int[i];
                    // fill-array-data instruction
                    iArr[0] = -1925336048;
                    iArr[1] = 1945324399;
                    iArr[2] = -1518901307;
                    iArr[3] = 1931067302;
                    iArr[4] = 686589548;
                    iArr[5] = -42177992;
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges(iArr, (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 12, objArr8);
                    util.h.xy.am.ma.m25027(intern4, ((java.lang.String) objArr8[0]).intern());
                }
                int i2 = getOutputFormats + 101;
                getInputFormats = i2 % 128;
                if (i2 % 2 == 0) {
                    throw null;
                }
            }
        };
        int i = getHighSpeedVideoSizes;
        int i2 = (i & 27) + (i | 27);
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 == 0) {
            return runnable;
        }
        throw null;
    }

    private static java.lang.Runnable getHighResolutionOutputSizeshNQ4ISI(final com.gemalto.mfs.mwsdk.payment.PaymentServiceListener paymentServiceListener, final com.gemalto.mfs.mwsdk.payment.engine.TransactionContext transactionContext) {
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: util.h.xy.bf.ma.1
            private static int getHighResolutionOutputSizeshNQ4ISI = 1;
            private static int getHighSpeedVideoSizes = 0;
            private static int getHighSpeedVideoSizesFor = 0;
            private static int getOutputMinFrameDuration = 1;
            private static char[] Camera2StreamConfigurationMap = {40013, 36821, 47936, 42702, 40000, 36808, 47943, 42659, 53825, 64966, 59733, 5299, 'n', 13297, 24426, 40000, 36808, 47943, 42659, 53825, 64966, 59733, 5299, 'n', 13297, 24426, 19176};
            private static long getOutputFormats = -990818065707528315L;

            private static void getHighSpeedVideoFpsRangesFor(int i, int i2, char c, java.lang.Object[] objArr) {
                util.h.xz.b.rb rbVar = new util.h.xz.b.rb();
                long[] jArr = new long[i];
                rbVar.f2651 = 0;
                while (rbVar.f2651 < i) {
                    getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 101) % 128;
                    jArr[rbVar.f2651] = (((char) (Camera2StreamConfigurationMap[rbVar.f2651 + i2] ^ 3446303986615426049L)) ^ (rbVar.f2651 * (3446303986615426049L ^ getOutputFormats))) ^ c;
                    rbVar.f2651++;
                }
                char[] cArr = new char[i];
                rbVar.f2651 = 0;
                while (rbVar.f2651 < i) {
                    getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 63) % 128;
                    cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
                    rbVar.f2651++;
                }
                java.lang.String str = new java.lang.String(cArr);
                int i3 = getHighResolutionOutputSizeshNQ4ISI + 95;
                getHighSpeedVideoSizes = i3 % 128;
                if (i3 % 2 != 0) {
                    throw new java.lang.ArithmeticException();
                }
                objArr[0] = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i = getOutputMinFrameDuration + 63;
                getHighSpeedVideoSizesFor = i % 128;
                try {
                    if (i % 2 != 0) {
                        throw new java.lang.NullPointerException();
                    }
                    com.gemalto.mfs.mwsdk.payment.PaymentServiceListener paymentServiceListener2 = com.gemalto.mfs.mwsdk.payment.PaymentServiceListener.this;
                    if (paymentServiceListener2 instanceof com.gemalto.mfs.mwsdk.payment.engine.ContactlessPaymentServiceListener) {
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor(4 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), android.text.TextUtils.getTrimmedLength(""), (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
                        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                        byte modifierMetaStateMask = (byte) android.view.KeyEvent.getModifierMetaStateMask();
                        float complexToFraction = android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f);
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor(modifierMetaStateMask + com.google.common.base.Ascii.FF, 4 - (complexToFraction > 0.0f ? 1 : (complexToFraction == 0.0f ? 0 : -1)), (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), objArr2);
                        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
                        ((com.gemalto.mfs.mwsdk.payment.engine.ContactlessPaymentServiceListener) com.gemalto.mfs.mwsdk.payment.PaymentServiceListener.this).onTransactionCompleted(transactionContext);
                    } else if (paymentServiceListener2 == null) {
                        util.h.xy.bf.ma.getHighSpeedVideoFpsRangesFor();
                        int i2 = getOutputMinFrameDuration + 45;
                        getHighSpeedVideoSizesFor = i2 % 128;
                        if (i2 % 2 != 0) {
                            int i3 = 4 / 5;
                        }
                    } else {
                        util.h.xy.bf.ma.getHighSpeedVideoFpsRangesFor();
                    }
                    getHighSpeedVideoSizesFor = (getOutputMinFrameDuration + 91) % 128;
                } catch (java.lang.Throwable th) {
                    util.h.xy.bf.ma.getHighSpeedVideoFpsRangesFor();
                    th.getMessage();
                    long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor((elapsedRealtime > 0L ? 1 : (elapsedRealtime == 0L ? 0 : -1)) + 3, android.view.ViewConfiguration.getTapTimeout() >> 16, (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr3);
                    java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
                    int size = android.view.View.MeasureSpec.getSize(0);
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(size + 12, android.view.View.MeasureSpec.getMode(0) + 15, (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr4);
                    util.h.xy.am.ma.m25027(intern2, ((java.lang.String) objArr4[0]).intern());
                }
            }
        };
        int i = getHighSpeedVideoSizes;
        int i2 = (i & 55) + (i | 55);
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 == 0) {
            return runnable;
        }
        throw null;
    }
}
