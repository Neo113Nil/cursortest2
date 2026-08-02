package util.h.xy.bq;

/* loaded from: classes5.dex */
public abstract class b implements com.gemalto.mfs.mwsdk.payment.engine.PaymentService {
    private static char Camera2StreamConfigurationMap = 0;
    private static char getHighResolutionOutputSizeshNQ4ISI = 0;
    private static char getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 1;
    private static char getHighSpeedVideoSizesFor = 0;
    private static char[] getInputFormats = null;
    private static char getInputSizeshNQ4ISI = 0;
    private static char getOutputFormats = 0;
    private static final java.lang.String getOutputMinFrameDuration;
    private static char getOutputMinFrameDurationlomOqCM = 0;
    private static int getOutputSizes = 0;
    private static char getOutputSizeshNQ4ISI = 0;
    private static int getOutputStallDuration = 1;
    private static char getOutputStallDurationlomOqCM;

    /* renamed from: ʼ, reason: contains not printable characters */
    protected com.gemalto.mfs.mwsdk.dcm.PaymentType f992;

    /* renamed from: ˉ, reason: contains not printable characters */
    protected util.h.xy.d.d f995;

    /* renamed from: ͺ, reason: contains not printable characters */
    protected com.gemalto.mfs.mwsdk.dcm.DigitalizedCardStatus f996;

    /* renamed from: ι, reason: contains not printable characters */
    protected com.gemalto.mfs.mwsdk.payment.PaymentServiceListener f997;

    /* renamed from: ʽ, reason: contains not printable characters */
    protected util.h.xy.d.md f993 = null;
    private com.gemalto.mfs.mwsdk.payment.engine.TransactionContext unwrapAs = null;

    /* renamed from: ʿ, reason: contains not printable characters */
    protected util.h.xy.bq.b.a f994 = util.h.xy.bq.b.a.f999;

    static /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI() {
        int i = (getOutputStallDuration + 65) % 128;
        getOutputSizes = i;
        java.lang.String str = getOutputMinFrameDuration;
        getOutputStallDuration = (i + 49) % 128;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0066, code lost:
    
        if (r7 != false) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ void getHighSpeedVideoSizes(util.h.xy.bq.b bVar, util.h.xy.d.d dVar, com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel profileChannel, boolean z, boolean z2) {
        util.h.xy.d.b m26923;
        boolean z3;
        com.gemalto.mfs.mwsdk.payment.engine.DeactivationStatus deactivationStatus;
        com.gemalto.mfs.mwsdk.payment.PaymentServiceListener paymentServiceListener;
        util.h.xy.f.b bVar2;
        com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType;
        int i = getOutputSizes + 69;
        int i2 = i % 128;
        getOutputStallDuration = i2;
        int i3 = i2 + 49;
        getOutputSizes = i3 % 128;
        int i4 = i3 % 2;
        util.h.xy.ag.a.m24556();
        if (i4 != 0) {
            throw null;
        }
        java.lang.String m26179 = z2 ? dVar.m26179() : dVar.m26180();
        util.h.xy.d.md mdVar = new util.h.xy.d.md(m26179);
        util.h.xy.k.ma.m26925();
        try {
            m26923 = util.h.xy.k.b.m26923(m26179);
            if (m26923.m26133() == util.h.xy.d.mg.f1144) {
                getOutputStallDuration = (getOutputSizes + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                z3 = true;
            } else {
                z3 = false;
            }
            m26923.m26139();
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused) {
            com.gemalto.mfs.mwsdk.payment.engine.DeactivationStatusCode deactivationStatusCode = com.gemalto.mfs.mwsdk.payment.engine.DeactivationStatusCode.DEACTIVATION_FAILED;
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((byte) (61 - (android.view.ViewConfiguration.getEdgeSlop() >> 16)), "\u0002\u000e\t\u0014\t\n\u001b\u0011\u0019\u0002\u0003\u000b\u0003\u0013\u000f\" \u0014\b\n\u0016\r\u0010\u0004\u0002\u0011\u0015\u0006\u001d\u0004\u000b\u0006㗸", android.text.TextUtils.getOffsetAfter("", 0) + 33, objArr);
            util.h.xy.bf.ma.m25419(bVar.f997, new com.gemalto.mfs.mwsdk.payment.engine.DeactivationStatus(deactivationStatusCode, ((java.lang.String) objArr[0]).intern()), bVar.f996, mdVar);
        }
        if (m26923.m26139() > 0) {
            int i5 = getOutputSizes + 77;
            int i6 = i5 % 128;
            getOutputStallDuration = i6;
            if (i5 % 2 == 0) {
                throw new java.lang.NullPointerException();
            }
            if (z) {
                int i7 = i6 + 89;
                getOutputSizes = i7 % 128;
                if (i7 % 2 != 0) {
                    throw new java.lang.NullPointerException();
                }
            }
            if (profileChannel == com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.CONTACTLESS) {
                bVar2 = util.h.xy.f.b.f2201;
                paymentType = com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS;
            } else {
                if (profileChannel == com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.QR) {
                    bVar2 = util.h.xy.f.b.f2201;
                } else {
                    if (profileChannel == com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.DSRP) {
                        bVar2 = util.h.xy.f.b.f2201;
                    } else if (profileChannel == com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.CONTACTLESS_AND_QR) {
                        util.h.xy.f.b.f2201.m26772(m26179, com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS, false, z2);
                        bVar2 = util.h.xy.f.b.f2201;
                    } else {
                        if (profileChannel != com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.CONTACTLESS_AND_DSRP) {
                            if (profileChannel == com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.CONTACTLESS_AND_DSRP_AND_QR) {
                                util.h.xy.f.b.f2201.m26772(m26179, com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS, false, z2);
                                util.h.xy.f.b.f2201.m26772(m26179, com.gemalto.mfs.mwsdk.dcm.PaymentType.QR, false, z2);
                                bVar2 = util.h.xy.f.b.f2201;
                            }
                            util.h.xy.k.b.m26923(m26179);
                            bVar.getHighSpeedVideoFpsRanges(dVar);
                            com.gemalto.mfs.mwsdk.payment.engine.DeactivationStatusCode deactivationStatusCode2 = com.gemalto.mfs.mwsdk.payment.engine.DeactivationStatusCode.DEACTIVATION_SUCCESS;
                            java.lang.Object[] objArr2 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRanges("\udab4ᄜ\ued4e\uf36d\uee97瞟\u17deؔ\uee97瞟쓍\uebe7宭杉䟐氥㎴\ue383縉ⓝ昑쮃", android.graphics.Color.red(0) + 21, objArr2);
                            util.h.xy.bf.ma.m25416(bVar.f997, new com.gemalto.mfs.mwsdk.payment.engine.DeactivationStatus(deactivationStatusCode2, ((java.lang.String) objArr2[0]).intern()), bVar.f996, mdVar);
                            if (i % 2 != 0) {
                                throw null;
                            }
                            getOutputSizes = (getOutputStallDuration + 41) % 128;
                            return;
                        }
                        util.h.xy.f.b.f2201.m26772(m26179, com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS, false, z2);
                        bVar2 = util.h.xy.f.b.f2201;
                    }
                    paymentType = com.gemalto.mfs.mwsdk.dcm.PaymentType.DSRP;
                }
                paymentType = com.gemalto.mfs.mwsdk.dcm.PaymentType.QR;
            }
            bVar2.m26772(m26179, paymentType, true, z2);
            util.h.xy.k.b.m26923(m26179);
            bVar.getHighSpeedVideoFpsRanges(dVar);
            com.gemalto.mfs.mwsdk.payment.engine.DeactivationStatusCode deactivationStatusCode22 = com.gemalto.mfs.mwsdk.payment.engine.DeactivationStatusCode.DEACTIVATION_SUCCESS;
            java.lang.Object[] objArr22 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("\udab4ᄜ\ued4e\uf36d\uee97瞟\u17deؔ\uee97瞟쓍\uebe7宭杉䟐氥㎴\ue383縉ⓝ昑쮃", android.graphics.Color.red(0) + 21, objArr22);
            util.h.xy.bf.ma.m25416(bVar.f997, new com.gemalto.mfs.mwsdk.payment.engine.DeactivationStatus(deactivationStatusCode22, ((java.lang.String) objArr22[0]).intern()), bVar.f996, mdVar);
            if (i % 2 != 0) {
            }
        }
        util.h.xy.k.b.m26918(m26179, m26923);
        util.h.xy.d.b m269232 = util.h.xy.k.b.m26923(m26179);
        bVar.getHighSpeedVideoFpsRanges(dVar);
        if (m269232.m26139() <= 0) {
            com.gemalto.mfs.mwsdk.payment.engine.DeactivationStatusCode deactivationStatusCode3 = com.gemalto.mfs.mwsdk.payment.engine.DeactivationStatusCode.DEACTIVATION_FAILED;
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("ꬡ蚱쩭\udbc5뵶\ua630瀲꣑镀﯂鮌欿݁\u008e꧁䮲鷃ጧ햓\udd6a昑쮃", 22 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr3);
            deactivationStatus = new com.gemalto.mfs.mwsdk.payment.engine.DeactivationStatus(deactivationStatusCode3, ((java.lang.String) objArr3[0]).intern());
            paymentServiceListener = bVar.f997;
        } else {
            if (z) {
                if (z3) {
                    com.gemalto.mfs.mwsdk.payment.engine.DeactivationStatusCode deactivationStatusCode4 = com.gemalto.mfs.mwsdk.payment.engine.DeactivationStatusCode.DEACTIVATION_SUCCESS;
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges("\udab4ᄜ\ued4e\uf36d\uee97瞟\u17deؔ\uee97瞟쓍\uebe7宭杉䟐氥㎴\ue383縉ⓝ昑쮃", (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 21, objArr4);
                    util.h.xy.bf.ma.m25416(bVar.f997, new com.gemalto.mfs.mwsdk.payment.engine.DeactivationStatus(deactivationStatusCode4, ((java.lang.String) objArr4[0]).intern()), bVar.f996, mdVar);
                } else {
                    com.gemalto.mfs.mwsdk.payment.engine.DeactivationStatusCode deactivationStatusCode5 = com.gemalto.mfs.mwsdk.payment.engine.DeactivationStatusCode.DEACTIVATION_FAILED;
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges("쮖뒘絩燪붭\ueaa6䊹礍ೡ鞹뽄弸댾ભ퓉\udadc䄲\ue796\uef5b걤絺毶禭珥陭慚쩭\udbc5뵶\ua630瀲꣑镀﯂䡦ئ鷁矧⨹凓顟隁⍗뭜顆⛢浖獑⛮㞂\udabb훌\uf2a2턡梚Უᡖꙟ䊙鼞Ὢ祿끼ᶟ鶸횋\uf4d2ꐫ\uf722톱逾怑筜\uf4d6ζ⋫\uda96乂䄲\ue796䊙鼞\ue16dῨ闅\u0ee0찙꺟ζ⋫穋띬\u0be0啀镀﯂\uf4d2ꐫ\uf722톱逾怑筜\uf4d6瑓ᔥ\udac8祤", 108 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr5);
                    deactivationStatus = new com.gemalto.mfs.mwsdk.payment.engine.DeactivationStatus(deactivationStatusCode5, ((java.lang.String) objArr5[0]).intern());
                    paymentServiceListener = bVar.f997;
                }
            }
            if (i % 2 != 0) {
            }
        }
        util.h.xy.bf.ma.m25419(paymentServiceListener, deactivationStatus, bVar.f996, mdVar);
        if (i % 2 != 0) {
        }
    }

    static {
        getHighSpeedVideoFpsRanges();
        Camera2StreamConfigurationMap();
        getOutputMinFrameDuration = util.h.xy.bq.b.class.getName();
        getOutputSizes = (getOutputStallDuration + 23) % 128;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    protected static final class a {
        private static int Camera2StreamConfigurationMap = 1;
        private static int getHighResolutionOutputSizeshNQ4ISI = 1;
        private static int getHighSpeedVideoFpsRanges;
        private static char[] getHighSpeedVideoFpsRangesFor;
        private static int getHighSpeedVideoSizes;
        private static final /* synthetic */ util.h.xy.bq.b.a[] getInputFormats;
        private static long getOutputFormats;

        /* renamed from: ˋ, reason: contains not printable characters */
        public static final util.h.xy.bq.b.a f998;

        /* renamed from: ˏ, reason: contains not printable characters */
        public static final util.h.xy.bq.b.a f999;

        /* renamed from: ᐝ, reason: contains not printable characters */
        public static final util.h.xy.bq.b.a f1000;

        private static void Camera2StreamConfigurationMap(int i, int i2, char c, java.lang.Object[] objArr) {
            util.h.xz.b.rb rbVar = new util.h.xz.b.rb();
            long[] jArr = new long[i];
            rbVar.f2651 = 0;
            while (rbVar.f2651 < i) {
                jArr[rbVar.f2651] = (((char) (getHighSpeedVideoFpsRangesFor[rbVar.f2651 + i2] ^ 3446303986615426049L)) ^ (rbVar.f2651 * (3446303986615426049L ^ getOutputFormats))) ^ c;
                rbVar.f2651++;
                getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 77) % 128;
            }
            char[] cArr = new char[i];
            rbVar.f2651 = 0;
            while (rbVar.f2651 < i) {
                Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 23) % 128;
                cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
                rbVar.f2651++;
            }
            objArr[0] = new java.lang.String(cArr);
        }

        private a(java.lang.String str, int i) {
        }

        public static util.h.xy.bq.b.a valueOf(java.lang.String str) {
            getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 51) % 128;
            util.h.xy.bq.b.a aVar = (util.h.xy.bq.b.a) java.lang.Enum.valueOf(util.h.xy.bq.b.a.class, str);
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 77) % 128;
            return aVar;
        }

        public static util.h.xy.bq.b.a[] values() {
            int i = getHighResolutionOutputSizeshNQ4ISI + 33;
            getHighSpeedVideoFpsRanges = i % 128;
            util.h.xy.bq.b.a[] aVarArr = getInputFormats;
            if (i % 2 == 0) {
                return (util.h.xy.bq.b.a[]) aVarArr.clone();
            }
            throw null;
        }

        static {
            Camera2StreamConfigurationMap();
            java.lang.Object[] objArr = new java.lang.Object[1];
            Camera2StreamConfigurationMap((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 7, android.graphics.Color.alpha(0), (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + com.google.firebase.FirebaseError.ERROR_APP_NOT_AUTHORIZED), objArr);
            util.h.xy.bq.b.a aVar = new util.h.xy.bq.b.a(((java.lang.String) objArr[0]).intern(), 0);
            f999 = aVar;
            int doubleTapTimeout = android.view.ViewConfiguration.getDoubleTapTimeout();
            try {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                Camera2StreamConfigurationMap(7 - (doubleTapTimeout >> 16), 8 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) ((((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)) + 48350), objArr2);
                util.h.xy.bq.b.a aVar2 = new util.h.xy.bq.b.a(((java.lang.String) objArr2[0]).intern(), 1);
                f1000 = aVar2;
                int jumpTapTimeout = android.view.ViewConfiguration.getJumpTapTimeout();
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                Camera2StreamConfigurationMap(9 - (jumpTapTimeout >> 16), android.graphics.Color.red(0) + 14, (char) ((-1) - android.graphics.ImageFormat.getBitsPerPixel(0)), objArr3);
                util.h.xy.bq.b.a aVar3 = new util.h.xy.bq.b.a(((java.lang.String) objArr3[0]).intern(), 2);
                f998 = aVar3;
                int i = (getHighSpeedVideoFpsRanges + 67) % 128;
                getHighResolutionOutputSizeshNQ4ISI = i;
                util.h.xy.bq.b.a[] aVarArr = {aVar, aVar2, aVar3};
                int i2 = i + 35;
                getHighSpeedVideoFpsRanges = i2 % 128;
                if (i2 % 2 == 0) {
                    getInputFormats = aVarArr;
                    return;
                }
                throw null;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }

        static void Camera2StreamConfigurationMap() {
            getHighSpeedVideoFpsRangesFor = new char[]{57041, 50857, 60979, 38831, 48942, 42172, 19516, 8333, 14581, 4193, 27121, 16758, 23264, 45664, 40000, 33853, 44203, 54581, 64939, 58939, 3759, 14141, 24509};
            getOutputFormats = 5653884476146353278L;
        }
    }

    private static void getHighSpeedVideoFpsRanges(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] charArray = str.toCharArray();
        util.h.xz.b.e eVar = new util.h.xz.b.e();
        char[] cArr = new char[charArray.length];
        eVar.f2630 = 0;
        char[] cArr2 = new char[2];
        while (eVar.f2630 < charArray.length) {
            int i2 = getHighSpeedVideoSizes + 83;
            getHighSpeedVideoFpsRangesFor = i2 % 128;
            if (i2 % 2 != 0) {
                cArr2[1] = charArray[eVar.f2630];
                cArr2[1] = charArray[eVar.f2630];
            } else {
                cArr2[0] = charArray[eVar.f2630];
                cArr2[1] = charArray[eVar.f2630 + 1];
            }
            int i3 = getHighSpeedVideoSizes + 5;
            getHighSpeedVideoFpsRangesFor = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 58224;
            for (int i6 = 0; i6 < 16; i6++) {
                getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 79) % 128;
                char c = cArr2[1];
                char c2 = cArr2[0];
                char c3 = (char) (c - (((c2 + i5) ^ ((c2 << 4) + ((char) (getOutputStallDurationlomOqCM ^ 3155153533016530592L)))) ^ ((c2 >>> 5) + ((char) (getHighResolutionOutputSizeshNQ4ISI ^ 3155153533016530592L)))));
                cArr2[1] = c3;
                cArr2[0] = (char) (c2 - ((((c3 << 4) + ((char) (getInputSizeshNQ4ISI ^ 3155153533016530592L))) ^ (c3 + i5)) ^ ((c3 >>> 5) + ((char) (getHighSpeedVideoSizesFor ^ 3155153533016530592L)))));
                i5 -= 40503;
            }
            cArr[eVar.f2630] = cArr2[0];
            cArr[eVar.f2630 + 1] = cArr2[1];
            eVar.f2630 += 2;
        }
        objArr[0] = new java.lang.String(cArr, 0, i);
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public void m25565(java.lang.String str) {
        getOutputStallDuration = (getOutputSizes + 71) % 128;
        this.f995 = util.h.xy.k.ra.f2243.m26950(str).getResult();
        int i = getOutputStallDuration + 47;
        getOutputSizes = i % 128;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    public b(com.gemalto.mfs.mwsdk.payment.PaymentServiceListener paymentServiceListener, boolean z) {
        this.f997 = null;
        this.f997 = paymentServiceListener;
        if (z) {
            this.f995 = m25559();
        }
    }

    @Override // com.gemalto.mfs.mwsdk.payment.engine.PaymentService
    public final com.gemalto.mfs.mwsdk.dcm.PaymentType getType() {
        getOutputStallDuration = (getOutputSizes + 115) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("丮漻瀙顪", 4 - android.view.View.resolveSize(0, 0), objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("븲\uf375쯴嫞㏷꒢", 6 - android.graphics.Color.red(0), objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        int i = getOutputStallDuration;
        int i2 = i + 121;
        getOutputSizes = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType = this.f992;
        getOutputSizes = (i + 77) % 128;
        return paymentType;
    }

    @Override // com.gemalto.mfs.mwsdk.payment.engine.PaymentService
    public final boolean isActivated() {
        getOutputSizes = (getOutputStallDuration + 71) % 128;
        boolean z = false;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("丮漻瀙顪", android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 4, objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor((byte) ((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 121), "\u0004\u0015\u000e\u0013\u000f\u0005", 6 - android.view.Gravity.getAbsoluteGravity(0, 0), objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        int i = getOutputStallDuration + 45;
        getOutputSizes = i % 128;
        if (i % 2 != 0) {
            util.h.xy.bq.b.a aVar = util.h.xy.bq.b.a.f998;
            throw null;
        }
        if (this.f994 == util.h.xy.bq.b.a.f998) {
            getOutputSizes = (getOutputStallDuration + 107) % 128;
            z = true;
        }
        int i2 = getOutputSizes + 37;
        getOutputStallDuration = i2 % 128;
        if (i2 % 2 != 0) {
            return z;
        }
        throw null;
    }

    @Override // com.gemalto.mfs.mwsdk.payment.engine.PaymentService
    public final com.gemalto.mfs.mwsdk.payment.PaymentServiceListener getPaymentServiceListener() {
        getOutputSizes = (getOutputStallDuration + 83) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("丮漻瀙顪", (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 4, objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("븲\uf375쯴嫞흷縩䑛ῳ", 7 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        com.gemalto.mfs.mwsdk.payment.PaymentServiceListener paymentServiceListener = this.f997;
        int i = getOutputStallDuration + 91;
        getOutputSizes = i % 128;
        if (i % 2 == 0) {
            return paymentServiceListener;
        }
        throw null;
    }

    @Override // com.gemalto.mfs.mwsdk.payment.engine.PaymentService
    public final com.gemalto.mfs.mwsdk.payment.engine.TransactionContext getTransactionContext() {
        java.lang.String intern;
        java.lang.Object obj;
        int i = getOutputSizes + 7;
        getOutputStallDuration = i % 128;
        if (i % 2 == 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("丮漻瀙顪", 2 >>> android.view.View.getDefaultSize(1, 0), objArr);
            intern = ((java.lang.String) objArr[0]).intern();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((byte) ((android.os.SystemClock.uptimeMillis() > 1L ? 1 : (android.os.SystemClock.uptimeMillis() == 1L ? 0 : -1)) + 14), "\u0004\u0015\u000e\u0013\f\u0000㘰", 99 << (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 1L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 1L ? 0 : -1)), objArr2);
            obj = objArr2[0];
        } else {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("丮漻瀙顪", 4 - android.view.View.getDefaultSize(0, 0), objArr3);
            intern = ((java.lang.String) objArr3[0]).intern();
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((byte) (88 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))), "\u0004\u0015\u000e\u0013\f\u0000㘰", (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 6, objArr4);
            obj = objArr4[0];
        }
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) obj).intern());
        util.h.xy.bq.md m25558 = m25558();
        getOutputSizes = (getOutputStallDuration + 13) % 128;
        return m25558;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public boolean mo25562(com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType, util.h.xy.d.md mdVar) {
        getOutputStallDuration = (getOutputSizes + 83) % 128;
        this.f993 = mdVar;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("丮漻瀙顪", 4 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("븲\uf375쯴嫞ₔ뜷", (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 4, objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        com.gemalto.mfs.mwsdk.SDKEnv.displaySDKVersion();
        this.f994 = util.h.xy.bq.b.a.f998;
        this.f992 = paymentType;
        m25563();
        int i = getOutputSizes + 9;
        getOutputStallDuration = i % 128;
        if (i % 2 != 0) {
            return true;
        }
        throw null;
    }

    /* renamed from: ˊ */
    public com.gemalto.mfs.mwsdk.payment.engine.TransactionContext mo25546(boolean z, boolean z2) {
        util.h.xy.bq.md mdVar;
        byte[] bArr;
        byte[] bArr2;
        boolean z3;
        util.h.xy.bk.mb mbVar;
        java.lang.String m26759;
        synchronized (this) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("丮漻瀙顪", 4 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr);
            java.lang.String intern = ((java.lang.String) objArr[0]).intern();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("븲\uf375쯴嫞윂쳳", (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 5, objArr2);
            util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
            mdVar = null;
            byte[] bArr3 = null;
            if (isActivated() && z) {
                getOutputSizes = (getOutputStallDuration + 107) % 128;
                boolean m25240 = util.h.xy.av.ra.m25240(util.h.xy.ag.a.m24556().m24558());
                util.h.xy.bq.md m25558 = m25558();
                if (m25558 != null) {
                    int i = getOutputSizes + 51;
                    getOutputStallDuration = i % 128;
                    if (i % 2 == 0) {
                        m25558.m25567();
                        m25558.m25570();
                        m25558.m25569();
                        throw new java.lang.ArithmeticException();
                    }
                    byte[] m25567 = m25558.m25567();
                    byte[] m25570 = m25558.m25570();
                    z3 = m25558.m25569();
                    bArr2 = m25570;
                    bArr = m25567;
                } else {
                    bArr = null;
                    bArr2 = null;
                    z3 = false;
                }
                m25557();
                this.f994 = util.h.xy.bq.b.a.f999;
                try {
                    bArr3 = z3 ? util.h.xy.ak.ma.f84.m24989() : util.h.xy.ak.ma.f84.m24984();
                } catch (java.lang.Exception unused) {
                }
                util.h.xy.d.c m26925 = util.h.xy.k.ma.m26925();
                util.h.xy.d.d m25559 = m25559();
                if (m25556(this.f992, this.f993) && bArr != null && bArr.length > 0) {
                    java.lang.String m26179 = z3 ? m25559.m26179() : m25559.m26180();
                    try {
                        m26759 = util.h.xy.f.b.f2201.m26759(m26179);
                    } catch (org.json.JSONException e) {
                        e.getMessage();
                    }
                    if (m26759 != null) {
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor((byte) (android.view.View.resolveSizeAndState(0, 0, 0) + 9), "\u0005\u0010\u000f\u0001", android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 4, objArr3);
                        if (m26759.equalsIgnoreCase(((java.lang.String) objArr3[0]).intern())) {
                            if (bArr2 != null) {
                                if (bArr2.length == 0) {
                                }
                            }
                            util.h.xy.ar.b.m25095(bArr);
                            util.h.xy.ar.b.m25095(bArr2);
                        }
                    }
                    com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Boolean> mo26158 = m26925.mo26158(m26179, bArr, bArr2);
                    if (!m25556(this.f992, this.f993)) {
                        java.lang.String tokenizedCardID = this.f993.getTokenizedCardID();
                        if (tokenizedCardID != null) {
                            util.h.xy.ak.ma.f84.m24986(tokenizedCardID, 4);
                        }
                    } else if (m26179 != null) {
                        util.h.xy.ak.ma.f84.m24986(m26179, 4);
                    }
                    if (mo26158.isSuccessful() && m26759 != null) {
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor((byte) (9 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), "\u0005\u0010\u000f\u0001", 4 - android.view.Gravity.getAbsoluteGravity(0, 0), objArr4);
                        if (m26759.equalsIgnoreCase(((java.lang.String) objArr4[0]).intern())) {
                            try {
                                util.h.xy.k.ra.f2243.m26970(m26179);
                            } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused2) {
                            }
                        }
                    }
                    util.h.xy.ar.b.m25095(bArr);
                    util.h.xy.ar.b.m25095(bArr2);
                }
                try {
                    try {
                        m25561(this.f995, com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.getProfileChannel(bArr3), m25240, z3);
                        if (m25558 != null && m25558.getDigitalizedCardStatus() == null) {
                            m25558.m25568(this.f996);
                        }
                        mbVar = util.h.xy.bk.mb.f982;
                    } catch (java.lang.Throwable th) {
                        if (m25558 != null && m25558.getDigitalizedCardStatus() == null) {
                            m25558.m25568(this.f996);
                        }
                        util.h.xy.bk.mb.f982.m25507();
                        throw th;
                    }
                } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException | org.json.JSONException e2) {
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges("ཛ唫㹚蓎퐗ꇌ", 6 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), objArr5);
                    util.h.xy.am.ma.m25029(((java.lang.String) objArr5[0]).intern(), util.h.xy.al.rc.m25022(e2));
                    e2.getMessage();
                    util.h.xy.d.md mdVar2 = new util.h.xy.d.md(m25559().m26180());
                    com.gemalto.mfs.mwsdk.payment.engine.DeactivationStatusCode deactivationStatusCode = com.gemalto.mfs.mwsdk.payment.engine.DeactivationStatusCode.DEACTIVATION_FAILED;
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges("豋䯥䈕闟絺毶福卆\uf5eb춚⎋\ude54㠫Ȳ稡㠗\uee97瞟؋췾쩭\udbc5뵶\ua630瀲꣑镀﯂鮌欿݁\u008e빏琺", android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 35, objArr6);
                    util.h.xy.bf.ma.m25419(this.f997, new com.gemalto.mfs.mwsdk.payment.engine.DeactivationStatus(deactivationStatusCode, ((java.lang.String) objArr6[0]).intern()), this.f996, mdVar2);
                    if (m25558 != null && m25558.getDigitalizedCardStatus() == null) {
                        m25558.m25568(this.f996);
                    }
                    mbVar = util.h.xy.bk.mb.f982;
                }
                mbVar.m25507();
                util.h.xy.bu.b.f1050.m25645();
                mdVar = m25558;
            } else if (isActivated()) {
                mdVar = m25558();
                m25557();
                this.f994 = util.h.xy.bq.b.a.f999;
                if (mdVar != null) {
                    getOutputSizes = (getOutputStallDuration + 119) % 128;
                    if (mdVar.getDigitalizedCardStatus() == null) {
                        mdVar.m25568(this.f996);
                        getOutputSizes = (getOutputStallDuration + 59) % 128;
                    }
                }
                util.h.xy.bk.mb.f982.m25507();
                util.h.xy.bu.b.f1050.m25645();
            }
            util.h.xy.bf.mb.f938.m25429();
            util.h.xy.bf.mb.f938.m25427(z2);
        }
        return mdVar;
    }

    private static void getHighSpeedVideoFpsRangesFor(byte b, java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2;
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 107) % 128;
        char[] charArray = str.toCharArray();
        util.h.xz.b.mc mcVar = new util.h.xz.b.mc();
        char[] cArr = getInputFormats;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                cArr2[i3] = (char) (cArr[i3] ^ 4042185467053315654L);
            }
            cArr = cArr2;
        }
        char c = (char) (4042185467053315654L ^ Camera2StreamConfigurationMap);
        char[] cArr3 = new char[i];
        if (i % 2 != 0) {
            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 45) % 128;
            i2 = i - 1;
            cArr3[i2] = (char) (charArray[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            mcVar.f2638 = 0;
            while (mcVar.f2638 < i2) {
                mcVar.f2641 = charArray[mcVar.f2638];
                mcVar.f2636 = charArray[mcVar.f2638 + 1];
                if (mcVar.f2641 == mcVar.f2636) {
                    cArr3[mcVar.f2638] = (char) (mcVar.f2641 - b);
                    cArr3[mcVar.f2638 + 1] = (char) (mcVar.f2636 - b);
                } else {
                    mcVar.f2639 = mcVar.f2641 / c;
                    mcVar.f2640 = mcVar.f2641 % c;
                    mcVar.f2637 = mcVar.f2636 / c;
                    mcVar.f2635 = mcVar.f2636 % c;
                    if (mcVar.f2640 == mcVar.f2635) {
                        mcVar.f2639 = ((mcVar.f2639 + c) - 1) % c;
                        mcVar.f2637 = ((mcVar.f2637 + c) - 1) % c;
                        int i4 = mcVar.f2639;
                        int i5 = mcVar.f2640;
                        int i6 = mcVar.f2637;
                        int i7 = mcVar.f2635;
                        cArr3[mcVar.f2638] = cArr[(i4 * c) + i5];
                        cArr3[mcVar.f2638 + 1] = cArr[(i6 * c) + i7];
                    } else if (mcVar.f2639 == mcVar.f2637) {
                        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 61) % 128;
                        mcVar.f2640 = ((mcVar.f2640 + c) - 1) % c;
                        mcVar.f2635 = ((mcVar.f2635 + c) - 1) % c;
                        int i8 = mcVar.f2639;
                        int i9 = mcVar.f2640;
                        int i10 = mcVar.f2637;
                        int i11 = mcVar.f2635;
                        cArr3[mcVar.f2638] = cArr[(i8 * c) + i9];
                        cArr3[mcVar.f2638 + 1] = cArr[(i10 * c) + i11];
                    } else {
                        int i12 = mcVar.f2639;
                        int i13 = mcVar.f2635;
                        int i14 = mcVar.f2637;
                        int i15 = mcVar.f2640;
                        cArr3[mcVar.f2638] = cArr[(i12 * c) + i13];
                        cArr3[mcVar.f2638 + 1] = cArr[(i14 * c) + i15];
                    }
                }
                mcVar.f2638 += 2;
            }
        }
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 79) % 128;
        for (int i16 = 0; i16 < i; i16++) {
            cArr3[i16] = (char) (cArr3[i16] ^ 13722);
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    protected void m25561(final util.h.xy.d.d dVar, final com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel profileChannel, final boolean z, final boolean z2) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException, org.json.JSONException {
        util.h.xy.d.b bVar;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("丮漻瀙顪", 4 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor((byte) ((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 105), "\u0004\u0015\u000e\u0013\u0005 \u0004\u0015", android.view.Gravity.getAbsoluteGravity(0, 0) + 8, objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        util.h.xy.d.c m26925 = util.h.xy.k.ma.m26925();
        com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType = this.f992;
        util.h.xy.d.b bVar2 = null;
        if (m25556(paymentType, this.f993)) {
            util.h.xy.d.b m26923 = util.h.xy.k.b.m26923(dVar.m26180());
            if (z2) {
                if (dVar.m26179() != null) {
                    getOutputStallDuration = (getOutputSizes + 103) % 128;
                    if (!dVar.m26179().isEmpty()) {
                        bVar2 = util.h.xy.k.b.m26923(dVar.m26179());
                    }
                }
                if (bVar2 != null) {
                    bVar2.m26139();
                    getHighSpeedVideoFpsRangesFor(paymentType, bVar2, dVar.m26179(), bVar2.m26132() - 1);
                }
                getHighSpeedVideoFpsRangesFor(true);
            } else {
                if (m26923 != null) {
                    m26923.m26139();
                    getHighSpeedVideoFpsRangesFor(paymentType, m26923, dVar.m26180(), m26923.m26132() - 1);
                }
                getHighSpeedVideoFpsRangesFor(false);
            }
            if (m26923 != null) {
                this.f996 = new util.h.xy.d.rf(m26923, bVar2, dVar);
                android.os.AsyncTask.execute(new java.lang.Runnable() { // from class: util.h.xy.bq.b.5
                    private static int getInputFormats = 1;
                    private static int getInputSizeshNQ4ISI;

                    @Override // java.lang.Runnable
                    public final void run() {
                        getInputFormats = (getInputSizeshNQ4ISI + 39) % 128;
                        util.h.xy.bq.b.getHighResolutionOutputSizeshNQ4ISI();
                        util.h.xy.bq.b.getHighSpeedVideoSizes(util.h.xy.bq.b.this, dVar, profileChannel, z, z2);
                        int i = getInputSizeshNQ4ISI;
                        int i2 = ((i | 81) << 1) - (i ^ 81);
                        getInputFormats = i2 % 128;
                        if (i2 % 2 == 0) {
                            throw null;
                        }
                    }
                });
            }
        } else {
            util.h.xy.d.b m269232 = util.h.xy.k.b.m26923(this.f993.getTokenizedCardID());
            getHighSpeedVideoFpsRangesFor(paymentType, m269232, this.f993.getTokenizedCardID(), m269232.m26132() - 1);
            com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.d.d> mo26170 = m26925.mo26170(this.f993.getTokenizedCardID());
            if (mo26170.getResult().m26179() != null) {
                int i = getOutputSizes + 93;
                getOutputStallDuration = i % 128;
                if (i % 2 != 0) {
                    bVar = util.h.xy.k.b.m26923(mo26170.getResult().m26179());
                } else {
                    util.h.xy.k.b.m26923(mo26170.getResult().m26179());
                    throw null;
                }
            } else {
                bVar = null;
            }
            this.f996 = new util.h.xy.d.rf(m269232, bVar, mo26170.getResult());
            if (m26925.mo26149(this.f993.getTokenizedCardID(), this.f992, true, z2).isSuccessful()) {
                com.gemalto.mfs.mwsdk.payment.engine.DeactivationStatusCode deactivationStatusCode = com.gemalto.mfs.mwsdk.payment.engine.DeactivationStatusCode.DEACTIVATION_SUCCESS;
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges("\udab4ᄜ\ued4e\uf36d\uee97瞟\u17deؔ\uee97瞟쓍\uebe7宭杉䟐氥㎴\ue383縉ⓝ昑쮃", 21 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr3);
                util.h.xy.bf.ma.m25416(this.f997, new com.gemalto.mfs.mwsdk.payment.engine.DeactivationStatus(deactivationStatusCode, ((java.lang.String) objArr3[0]).intern()), this.f996, new util.h.xy.d.md(this.f993.getTokenizedCardID()));
            } else {
                com.gemalto.mfs.mwsdk.payment.engine.DeactivationStatusCode deactivationStatusCode2 = com.gemalto.mfs.mwsdk.payment.engine.DeactivationStatusCode.DEACTIVATION_FAILED;
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges("豋䯥䈕闟絺毶福卆\uf5eb춚⎋\ude54㠫Ȳ稡㠗\uee97瞟؋췾䊹礍꡴槃ﺋ纘馦\uf5c8ｲp", 30 - android.text.TextUtils.getTrimmedLength(""), objArr4);
                util.h.xy.bf.ma.m25419(this.f997, new com.gemalto.mfs.mwsdk.payment.engine.DeactivationStatus(deactivationStatusCode2, ((java.lang.String) objArr4[0]).intern()), this.f996, new util.h.xy.d.md(this.f993.getTokenizedCardID()));
            }
            this.f993 = null;
        }
        getOutputSizes = (getOutputStallDuration + 63) % 128;
    }

    private static void getHighSpeedVideoFpsRangesFor(boolean z) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = (getOutputStallDuration + 109) % 128;
        getOutputSizes = i;
        if (z) {
            getOutputStallDuration = (i + 9) % 128;
            util.h.xy.f.b.f2201.m26784(util.h.xy.f.a.f2186);
            util.h.xy.f.b.f2201.m26784(util.h.xy.f.a.f2198);
            util.h.xy.f.b.f2201.m26784(util.h.xy.f.a.f2199);
            return;
        }
        util.h.xy.f.b.f2201.m26784(util.h.xy.f.a.f2192);
        util.h.xy.f.b.f2201.m26784(util.h.xy.f.a.f2185);
        util.h.xy.f.b.f2201.m26784(util.h.xy.f.a.f2190);
        getOutputStallDuration = (getOutputSizes + 63) % 128;
    }

    private void getHighSpeedVideoFpsRanges(util.h.xy.d.d dVar) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        util.h.xy.d.b bVar;
        util.h.xy.d.b m26923 = util.h.xy.k.b.m26923(dVar.m26180());
        if (m26923 != null) {
            m26923.m26139();
            m26923.m26143();
            if (dVar.m26179() == null || dVar.m26179().isEmpty()) {
                bVar = null;
            } else {
                int i = getOutputStallDuration + 51;
                getOutputSizes = i % 128;
                if (i % 2 == 0) {
                    bVar = util.h.xy.k.b.m26923(dVar.m26179());
                } else {
                    util.h.xy.k.b.m26923(dVar.m26179());
                    throw new java.lang.ArithmeticException();
                }
            }
            this.f996 = new util.h.xy.d.rf(m26923, bVar, dVar);
        }
        getOutputStallDuration = (getOutputSizes + 21) % 128;
    }

    private static void getHighSpeedVideoFpsRangesFor(com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType, util.h.xy.d.b bVar, java.lang.String str, int i) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("丮漻瀙顪", 4 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor((byte) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 108), "\u0004\u0015\u000e\u0013\u0003\u0001㙄㙄㘴", 9 - android.graphics.Color.blue(0), objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        util.h.xy.d.rb.a aVar = util.h.xy.d.rb.a.f1149;
        if (paymentType != com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS) {
            if (paymentType == com.gemalto.mfs.mwsdk.dcm.PaymentType.QR) {
                aVar = util.h.xy.d.rb.a.f1150;
            } else if (paymentType == com.gemalto.mfs.mwsdk.dcm.PaymentType.DSRP) {
                aVar = util.h.xy.d.rb.a.f1147;
            }
        } else {
            int i2 = getOutputStallDuration + 71;
            getOutputSizes = i2 % 128;
            if (i2 % 2 == 0) {
                aVar = util.h.xy.d.rb.a.f1146;
                getOutputSizes = (getOutputStallDuration + 69) % 128;
            } else {
                util.h.xy.d.rb.a aVar2 = util.h.xy.d.rb.a.f1146;
                throw new java.lang.ArithmeticException();
            }
        }
        util.h.xy.k.ra.f2243.m26957(i, bVar.m26133(), str.getBytes(), aVar);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    protected util.h.xy.bq.md m25558() {
        getOutputSizes = (getOutputStallDuration + 63) % 128;
        com.gemalto.mfs.mwsdk.payment.engine.TransactionContext transactionContext = this.unwrapAs;
        if (transactionContext != null) {
            return (util.h.xy.bq.md) transactionContext;
        }
        util.h.xy.bq.md mdVar = null;
        if (isActivated()) {
            try {
                byte[] m27598 = util.h.xy.v.b.f2439.m27598(new byte[0]);
                if (m27598 == null || m27598.length == 0) {
                    return null;
                }
                util.h.xy.ar.b.m25074(m27598);
                util.h.xy.bq.md mdVar2 = new util.h.xy.bq.md(m27598);
                try {
                    if (mdVar2.getScheme() == com.gemalto.mfs.mwsdk.payment.engine.CardScheme.MASTERCARD) {
                        mdVar = new util.h.xy.bq.d(m27598);
                        getOutputSizes = (getOutputStallDuration + 63) % 128;
                    } else {
                        mdVar = mdVar2;
                    }
                    mdVar.m25568(this.f996);
                    getOutputStallDuration = (getOutputSizes + 109) % 128;
                    return mdVar;
                } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
                    e = e;
                    mdVar = mdVar2;
                    e.getMessage();
                    return mdVar;
                }
            } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e2) {
                e = e2;
            }
        }
        return mdVar;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public void m25564(com.gemalto.mfs.mwsdk.payment.engine.TransactionContext transactionContext) {
        getOutputSizes = (getOutputStallDuration + 13) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("丮漻瀙顪", 4 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("븲\uf375쯴嫞㢻띜\u2d2b㮩", 8 - (android.view.ViewConfiguration.getTouchSlop() >> 8), objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        this.unwrapAs = transactionContext;
        getOutputSizes = (getOutputStallDuration + 13) % 128;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    protected final void m25560(com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode paymentServiceErrorCode, java.lang.String str) {
        int i = getOutputStallDuration + 37;
        getOutputSizes = i % 128;
        if (i % 2 == 0) {
            util.h.xy.bf.ma.m25415(this.f997, paymentServiceErrorCode, str);
        } else {
            util.h.xy.bf.ma.m25415(this.f997, paymentServiceErrorCode, str);
            throw null;
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    protected final void m25557() {
        getOutputStallDuration = (getOutputSizes + 111) % 128;
        try {
            int i = 16;
            int longPressTimeout = (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 26;
            char[] charArray = "\ue34e鬒鈓䖑踟\uf4de屴\uffdf褆笇鎳ᦨ瞉雳Ꙍ\uee5f鞉薚忣㿡ꮾꯇ鮥烫엜劳".toCharArray();
            util.h.xz.b.e eVar = new util.h.xz.b.e();
            char[] cArr = new char[charArray.length];
            eVar.f2630 = 0;
            char[] cArr2 = new char[2];
            while (eVar.f2630 < charArray.length) {
                cArr2[0] = charArray[eVar.f2630];
                cArr2[1] = charArray[eVar.f2630 + 1];
                int i2 = 58224;
                int i3 = 0;
                while (i3 < i) {
                    char c = cArr2[1];
                    char c2 = cArr2[0];
                    util.h.xz.b.e eVar2 = eVar;
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + ((char) (getOutputFormats ^ 3155153533016530592L)))) ^ ((c2 >>> 5) + ((char) (getOutputMinFrameDurationlomOqCM ^ 3155153533016530592L)))));
                    cArr2[1] = c3;
                    cArr2[0] = (char) (c2 - ((((c3 << 4) + ((char) (getHighSpeedVideoFpsRanges ^ 3155153533016530592L))) ^ (c3 + i2)) ^ ((c3 >>> 5) + ((char) (getOutputSizeshNQ4ISI ^ 3155153533016530592L)))));
                    i2 -= 40503;
                    i3++;
                    eVar = eVar2;
                    i = 16;
                }
                util.h.xz.b.e eVar3 = eVar;
                cArr[eVar3.f2630] = cArr2[0];
                cArr[eVar3.f2630 + 1] = cArr2[1];
                eVar3.f2630 += 2;
                eVar = eVar3;
                i = 16;
            }
            java.lang.String str = new java.lang.String(cArr, 0, longPressTimeout);
            java.lang.String str2 = str;
            byte[] bArr = new byte[16];
            ((java.security.SecureRandom) java.lang.Class.forName(str).getDeclaredConstructor(null).newInstance(null)).nextBytes(bArr);
            try {
                byte[] m27610 = util.h.xy.v.b.f2439.m27610(bArr);
                if (m27610 != null) {
                    int i4 = getOutputSizes + 67;
                    getOutputStallDuration = i4 % 128;
                    if (i4 % 2 != 0) {
                        util.h.xy.ar.b.m25074(m27610);
                    } else {
                        util.h.xy.ar.b.m25074(m27610);
                        throw null;
                    }
                }
            } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
                e.getMessage();
            }
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* renamed from: ͺ, reason: contains not printable characters */
    protected void m25563() {
        getOutputSizes = (getOutputStallDuration + 107) % 128;
        android.content.Context m24558 = util.h.xy.ag.a.m24556().m24558();
        if (util.h.xy.bf.mb.f938.m25426().m25406()) {
            getHighSpeedVideoFpsRanges(true);
        } else {
            getHighSpeedVideoFpsRanges(util.h.xy.al.c.m25004(m24558));
            getOutputStallDuration = (getOutputSizes + 29) % 128;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0016, code lost:
    
        r0[0] = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0014, code lost:
    
        if (r3 != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (r3 != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        r0[0] = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void getHighSpeedVideoFpsRanges(boolean z) {
        byte[] bArr;
        int i = getOutputStallDuration + 1;
        getOutputSizes = i % 128;
        if (i % 2 != 0) {
            bArr = new byte[1];
        } else {
            bArr = new byte[1];
        }
        try {
            util.h.xy.v.b.f2439.m27643(bArr);
            getOutputSizes = (getOutputStallDuration + 111) % 128;
        } catch (java.lang.Throwable th) {
            th.getMessage();
        }
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public util.h.xy.d.d m25559() {
        int i = getOutputSizes + 109;
        getOutputStallDuration = i % 128;
        if (i % 2 != 0) {
            if (this.f995 == null) {
                try {
                    this.f995 = util.h.xy.k.ra.f2243.m26956();
                    getOutputStallDuration = (getOutputSizes + 71) % 128;
                } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor((byte) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 97), "\f\u000f\u0017\u0000\u000e\u0014\r\u0004\u0007!\u0016!\u0014\u0016\u0011\u0002\f\u0014\b\u000f\u0016\u0013\u000b\u001b\u0014\t\u001d\u001b\r\b", 30 - android.graphics.Color.blue(0), objArr);
                    throw new util.h.xy.ab.b(((java.lang.String) objArr[0]).intern(), e);
                }
            }
            return this.f995;
        }
        throw null;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static boolean m25556(com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType, util.h.xy.d.md mdVar) {
        if (mdVar == null) {
            return true;
        }
        com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Boolean> m26211 = mdVar.m26211(paymentType);
        if (!m26211.isSuccessful() || m26211.getResult().booleanValue()) {
            return true;
        }
        int i = (getOutputSizes + 83) % 128;
        getOutputStallDuration = i;
        getOutputSizes = (i + 21) % 128;
        return false;
    }

    static void getHighSpeedVideoFpsRanges() {
        getHighSpeedVideoFpsRanges = (char) 16500;
        getOutputSizeshNQ4ISI = (char) 18463;
        getOutputFormats = (char) 59657;
        getOutputMinFrameDurationlomOqCM = (char) 28199;
    }

    static void Camera2StreamConfigurationMap() {
        getInputSizeshNQ4ISI = (char) 19356;
        getHighSpeedVideoSizesFor = (char) 23707;
        getOutputStallDurationlomOqCM = (char) 60149;
        getHighResolutionOutputSizeshNQ4ISI = (char) 44384;
        getInputFormats = new char[]{41880, 41904, 41865, 41885, 41866, 41913, 41883, 41915, 41902, 41980, 41893, 41903, 41892, 41871, 41906, 41908, 41917, 41877, 41896, 41900, 41970, 41907, 41868, 41890, 41895, 41981, 41909, 41894, 41911, 41899, 41864, 41919, 41881, 41912, 41905, 41887};
        Camera2StreamConfigurationMap = (char) 38464;
    }
}
