package util.h.xy.bu;

/* loaded from: classes5.dex */
public class mb implements com.gemalto.mfs.mwsdk.payment.PaymentBusinessService {
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static util.h.xy.bu.mb getHighSpeedVideoSizes;

    static {
        int i = getHighSpeedVideoFpsRanges + 51;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static util.h.xy.bu.mb m25666() {
        util.h.xy.bu.mb mbVar;
        synchronized (util.h.xy.bu.mb.class) {
            int i = getHighResolutionOutputSizeshNQ4ISI + 63;
            getHighSpeedVideoFpsRanges = i % 128;
            if (i % 2 != 0) {
                if (getHighSpeedVideoSizes == null) {
                    getHighSpeedVideoSizes = new util.h.xy.bu.mb();
                }
                mbVar = getHighSpeedVideoSizes;
            } else {
                throw new java.lang.NullPointerException();
            }
        }
        return mbVar;
    }

    private mb() {
    }

    @Override // com.gemalto.mfs.mwsdk.sdkconfig.BusinessService
    public void initialize() throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f280);
        sb.append(util.h.xy.al.ra.f439);
        util.h.xy.am.ma.m25027(str, sb.toString());
        util.h.xy.bu.ra raVar = util.h.xy.bu.ra.f1054;
        util.h.xy.bu.ra.Camera2StreamConfigurationMap();
        getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 99) % 128;
    }

    @Override // com.gemalto.mfs.mwsdk.payment.PaymentBusinessService
    public void activate(com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType, com.gemalto.mfs.mwsdk.payment.PaymentServiceListener paymentServiceListener) {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f280);
        sb.append(util.h.xy.al.ra.f326);
        util.h.xy.am.ma.m25027(str, sb.toString());
        util.h.xy.bu.b bVar = util.h.xy.bu.b.f1050;
        util.h.xy.bu.b.getHighResolutionOutputSizeshNQ4ISI = (util.h.xy.bu.b.getHighSpeedVideoSizes + 95) % 128;
        bVar.getHighSpeedVideoFpsRangesFor(null, paymentType, paymentServiceListener);
        util.h.xy.bu.b.getHighResolutionOutputSizeshNQ4ISI = (util.h.xy.bu.b.getHighSpeedVideoSizes + 45) % 128;
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = (i ^ 17) + ((i & 17) << 1);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    @Override // com.gemalto.mfs.mwsdk.payment.PaymentBusinessService
    public void activate(com.gemalto.mfs.mwsdk.dcm.DigitalizedCard digitalizedCard, com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType, com.gemalto.mfs.mwsdk.payment.PaymentServiceListener paymentServiceListener) {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f280);
        sb.append(util.h.xy.al.ra.f315);
        util.h.xy.am.ma.m25027(str, sb.toString());
        util.h.xy.bu.b.f1050.getHighSpeedVideoFpsRangesFor((util.h.xy.d.md) digitalizedCard, paymentType, paymentServiceListener);
        int i = getHighResolutionOutputSizeshNQ4ISI + 33;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // com.gemalto.mfs.mwsdk.payment.PaymentBusinessService
    @java.lang.Deprecated
    public void activateCard(java.lang.String str, com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType, com.gemalto.mfs.mwsdk.payment.PaymentServiceListener paymentServiceListener, com.gemalto.mfs.mwsdk.payment.engine.CardActivationListener cardActivationListener) {
        java.lang.String str2 = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f280);
        sb.append(util.h.xy.al.ra.f314);
        util.h.xy.am.ma.m25027(str2, sb.toString());
        activateNonDefaultCard(str, paymentType, paymentServiceListener, cardActivationListener);
        getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 29) % 128;
    }

    @Override // com.gemalto.mfs.mwsdk.payment.PaymentBusinessService
    public void activateNonDefaultCard(java.lang.String str, com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType, com.gemalto.mfs.mwsdk.payment.PaymentServiceListener paymentServiceListener, com.gemalto.mfs.mwsdk.payment.engine.CardActivationListener cardActivationListener) {
        java.lang.String str2 = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f280);
        sb.append(util.h.xy.al.ra.f394);
        util.h.xy.am.ma.m25027(str2, sb.toString());
        util.h.xy.bu.b.f1050.Camera2StreamConfigurationMap(str, paymentType, false, paymentServiceListener, cardActivationListener);
        int i = getHighSpeedVideoFpsRanges + 99;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.gemalto.mfs.mwsdk.payment.PaymentBusinessService
    public void activateNonDefaultCard(java.lang.String str, com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType, boolean z, com.gemalto.mfs.mwsdk.payment.PaymentServiceListener paymentServiceListener, com.gemalto.mfs.mwsdk.payment.engine.CardActivationListener cardActivationListener) {
        java.lang.String str2 = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f280);
        sb.append(util.h.xy.al.ra.f394);
        util.h.xy.am.ma.m25027(str2, sb.toString());
        util.h.xy.bu.b.f1050.Camera2StreamConfigurationMap(str, paymentType, z, paymentServiceListener, cardActivationListener);
        getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 43) % 128;
    }

    @Override // com.gemalto.mfs.mwsdk.payment.PaymentBusinessService
    public void deactivate() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f280);
        sb.append(util.h.xy.al.ra.f377);
        util.h.xy.am.ma.m25027(str, sb.toString());
        util.h.xy.bu.b bVar = util.h.xy.bu.b.f1050;
        int i = util.h.xy.bu.b.getHighResolutionOutputSizeshNQ4ISI + 37;
        util.h.xy.bu.b.getHighSpeedVideoSizes = i % 128;
        if (i % 2 != 0) {
            if (util.h.xy.ag.a.m24556().m24560()) {
                bVar.getHighSpeedVideoFpsRangesFor();
            } else {
                int i2 = util.h.xy.bu.b.getHighSpeedVideoSizes + 75;
                util.h.xy.bu.b.getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
                if (i2 % 2 != 0) {
                    throw null;
                }
            }
            int i3 = getHighResolutionOutputSizeshNQ4ISI;
            getHighSpeedVideoFpsRanges = ((i3 & 7) + (i3 | 7)) % 128;
            return;
        }
        util.h.xy.ag.a.m24556().m24560();
        throw new java.lang.ArithmeticException();
    }

    @Override // com.gemalto.mfs.mwsdk.payment.PaymentBusinessService
    public com.gemalto.mfs.mwsdk.payment.engine.PaymentService getActivatedPaymentService() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f280);
        sb.append(util.h.xy.al.ra.f370);
        util.h.xy.am.ma.m25027(str, sb.toString());
        com.gemalto.mfs.mwsdk.payment.engine.PaymentService m25639 = util.h.xy.bu.b.f1050.m25639();
        getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 61) % 128;
        return m25639;
    }

    @Override // com.gemalto.mfs.mwsdk.payment.PaymentBusinessService
    @java.lang.Deprecated
    @util.h.xy.a.a
    public void getAuthenticationFlowPriorToPayment(com.gemalto.mfs.mwsdk.payment.PaymentServiceListener paymentServiceListener, com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType) {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f280);
        sb.append(util.h.xy.al.ra.f395);
        util.h.xy.am.ma.m25027(str, sb.toString());
        startAuthentication(paymentServiceListener, paymentType);
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = (i ^ 55) + ((i & 55) << 1);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00bb, code lost:
    
        if (r5 == com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.DEVICE_KEYGUARD) goto L26;
     */
    @Override // com.gemalto.mfs.mwsdk.payment.PaymentBusinessService
    @util.h.xy.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void startAuthentication(com.gemalto.mfs.mwsdk.payment.PaymentServiceListener paymentServiceListener, com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType) {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f280);
        sb.append(util.h.xy.al.ra.f449);
        util.h.xy.am.ma.m25027(str, sb.toString());
        util.h.xy.bu.b bVar = util.h.xy.bu.b.f1050;
        util.h.xy.bu.b.getHighSpeedVideoSizes = (util.h.xy.bu.b.getHighResolutionOutputSizeshNQ4ISI + 31) % 128;
        if (paymentServiceListener == null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            util.h.xy.bu.b.getHighSpeedVideoSizes(new int[]{2004080613, -944061872, 345035845, -1762175475, 1456631790, -1975720927, -41505768, -1246305857, -957198732, -305377390, -764251324, -604220547}, 23 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), objArr);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
        }
        if (!(paymentServiceListener instanceof com.gemalto.mfs.mwsdk.payment.engine.ContactlessPaymentServiceListener)) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            util.h.xy.bu.b.Camera2StreamConfigurationMap("춼闃뾒䩬퐤⮨溵뷅ㅂ㎁ㄮ絈ﻼ鱃㖬둃俉㦽퀡ᣇ咙瘒租̤癛迯ߋ珱톱삍툾髒秇褼থ줉韢ｈ洆策\ue4c7鄤춽\udf52꣘毀秇褼\ue6b3┦魳윰\uda98䯶쌏㫾㑨\uf60c㱻ָݟ刍⒒\u09c9", 63 - android.text.TextUtils.getTrimmedLength(""), objArr2);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr2[0]).intern());
        }
        if (paymentType != com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS) {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            util.h.xy.bu.b.getHighSpeedVideoSizes(new int[]{1489067096, 1648697099, -477409293, 851509158, -1648962287, -1040468726, 898004521, -248954197, -503640884, -1439843546, -824779085, -1912827678, 735863582, -102221032, -635211248, -1285489042, 783134000, -2112730515, -1973043048, 698873467, 1306229082, 1129247978, 1477746808, -821408802, 234997401, -37040130, 909078269, -1168234736, 1815000075, 87542620, 1252246014, -993204214, 1004244612, 126147235, 53397756, 1506860092, 1461012795, -330450356, -1820509141, 1837422715}, (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 77, objArr3);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr3[0]).intern());
        }
        if (util.h.xy.ag.a.m24556().m24560()) {
            com.gemalto.mfs.mwsdk.payment.PaymentBusinessService paymentBusinessService = com.gemalto.mfs.mwsdk.payment.PaymentBusinessManager.getPaymentBusinessService();
            com.gemalto.mfs.mwsdk.payment.engine.PaymentService activatedPaymentService = paymentBusinessService.getActivatedPaymentService();
            if (activatedPaymentService != null) {
                util.h.xy.bu.b.getHighResolutionOutputSizeshNQ4ISI = (util.h.xy.bu.b.getHighSpeedVideoSizes + 69) % 128;
                com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode paymentServiceErrorCode = com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.PAYMENT_WRONG_STATE;
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                util.h.xy.bu.b.getHighSpeedVideoSizes(new int[]{1272950917, -1591616011, 514268192, 1634492526, -771639983, -2107867287, -578877037, 885070969, 694381175, -1212510809, -33434605, -1129956373, 438614326, -1618538314, -366761371, 1560426203, 698306516, 675811014, -1606274134, 627131049, 991865302, -445305139, 632992328, 242253820, 663413901, 606362977, -185552930, -1139428955, -863534223, -1507329436, -233347104, -1980365703, 1831620622, 682006949}, 65 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr4);
                util.h.xy.bf.ma.m25415(paymentServiceListener, paymentServiceErrorCode, ((java.lang.String) objArr4[0]).intern());
            } else {
                com.gemalto.mfs.mwsdk.payment.CHVerificationMethod result = com.gemalto.mfs.mwsdk.payment.chverification.CHVerificationManager.INSTANCE.getCVMethod().getResult();
                if (activatedPaymentService == null) {
                    if (result != com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.BIOMETRICS) {
                        int i = util.h.xy.bu.b.getHighSpeedVideoSizes + 25;
                        util.h.xy.bu.b.getHighResolutionOutputSizeshNQ4ISI = i % 128;
                        if (i % 2 != 0) {
                            com.gemalto.mfs.mwsdk.payment.CHVerificationMethod cHVerificationMethod = com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.DEVICE_KEYGUARD;
                            throw new java.lang.ArithmeticException();
                        }
                    }
                    bVar.m25640(true);
                    paymentBusinessService.activate(null, paymentType, paymentServiceListener);
                    activatedPaymentService = paymentBusinessService.getActivatedPaymentService();
                }
                if (activatedPaymentService != null && !util.h.xy.bf.mb.f938.m25426().m25391()) {
                    if (result != com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.WALLET_PIN) {
                        util.h.xy.bu.b.getHighResolutionOutputSizeshNQ4ISI = (util.h.xy.bu.b.getHighSpeedVideoSizes + 125) % 128;
                        if (result != com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.BIOMETRICS && result != com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.DEVICE_KEYGUARD) {
                            com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode paymentServiceErrorCode2 = com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.NO_DEFAULT_CHV_METHOD;
                            java.lang.Object[] objArr5 = new java.lang.Object[1];
                            util.h.xy.bu.b.getHighSpeedVideoSizes(new int[]{1474067581, -658745222, -1185391638, 339428589, 1487314411, 329467885, 1405577845, 865407287, -1949558742, -200513084, -1402573244, 1568755926, -635211248, -1285489042, -2006728621, -2065305617, -2134186390, 1756756542, -1248085046, 1535781570}, 41 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr5);
                            util.h.xy.bf.ma.m25415(paymentServiceListener, paymentServiceErrorCode2, ((java.lang.String) objArr5[0]).intern());
                        }
                    }
                    util.h.xy.bf.mb.f938.m25426().m25409();
                    if (activatedPaymentService instanceof util.h.xy.bq.a) {
                        util.h.xy.al.a.m25002(true);
                        ((util.h.xy.bq.a) activatedPaymentService).mo25547();
                    } else {
                        java.lang.Object[] objArr6 = new java.lang.Object[1];
                        util.h.xy.bu.b.Camera2StreamConfigurationMap("擞鋠㱻ָ窶㞢㟞烍셲狆䛅ह榦털", 14 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr6);
                        util.h.xy.bf.ma.m25415(paymentServiceListener, null, ((java.lang.String) objArr6[0]).intern());
                    }
                }
            }
        } else if (paymentServiceListener != null) {
            com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode paymentServiceErrorCode3 = com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.PAYMENT_NOT_ALLOWED_SDK_NOT_INITIALIZED;
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            util.h.xy.bu.b.getHighSpeedVideoSizes(new int[]{794071231, 1124419668, 101886589, -127323590, -1541244725, -1518335330, -1558935983, 103576075, -2134186390, 1756756542, -2028338404, 928983294, -98656299, 1647196798, -1007166568, 576935316}, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 33, objArr7);
            util.h.xy.bf.ma.m25415(paymentServiceListener, paymentServiceErrorCode3, ((java.lang.String) objArr7[0]).intern());
            util.h.xy.bu.b.getHighResolutionOutputSizeshNQ4ISI = (util.h.xy.bu.b.getHighSpeedVideoSizes + 53) % 128;
        }
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 1) % 128;
    }

    @Override // com.gemalto.mfs.mwsdk.sdkconfig.BusinessService
    public void reset() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f280);
        sb.append(util.h.xy.al.ra.f682);
        util.h.xy.am.ma.m25027(str, sb.toString());
        util.h.xy.bu.b.f1050.m25641(99);
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 95) % 128;
    }

    @Override // com.gemalto.mfs.mwsdk.payment.PaymentBusinessService
    @util.h.xy.a.a
    public void generateQRCodePaymentData(java.lang.String str, com.gemalto.mfs.mwsdk.payment.PaymentServiceListener paymentServiceListener) {
        java.lang.String str2 = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f280);
        sb.append(util.h.xy.al.ra.f399);
        util.h.xy.am.ma.m25027(str2, sb.toString());
        util.h.xy.bu.mc.f1053.m25667(str, paymentServiceListener);
        int i = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRanges = ((i & 111) + (i | 111)) % 128;
    }

    @Override // com.gemalto.mfs.mwsdk.payment.PaymentBusinessService
    public void generateApplicationCryptogram(com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType, com.gemalto.mfs.mwsdk.payment.engine.PaymentInputData paymentInputData, com.gemalto.mfs.mwsdk.payment.PaymentServiceListener paymentServiceListener) {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f280);
        sb.append(util.h.xy.al.ra.f339);
        util.h.xy.am.ma.m25027(str, sb.toString());
        if (paymentType == null) {
            throw new java.lang.IllegalArgumentException(util.h.xy.al.ra.f840);
        }
        if (paymentType == com.gemalto.mfs.mwsdk.dcm.PaymentType.DSRP) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 45) % 128;
            util.h.xy.bu.rc.f1055.m25678(null, paymentType, paymentInputData, paymentServiceListener);
            getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 125) % 128;
        } else {
            if (paymentType != com.gemalto.mfs.mwsdk.dcm.PaymentType.QR) {
                throw new java.lang.IllegalStateException(util.h.xy.al.ra.f836);
            }
            int i = getHighResolutionOutputSizeshNQ4ISI;
            getHighSpeedVideoFpsRanges = ((i & 43) + (i | 43)) % 128;
            util.h.xy.bu.mc.f1053.m25668(null, paymentType, paymentInputData, paymentServiceListener);
            int i2 = getHighSpeedVideoFpsRanges;
            getHighResolutionOutputSizeshNQ4ISI = (((i2 | 95) << 1) - (i2 ^ 95)) % 128;
        }
        int i3 = getHighSpeedVideoFpsRanges;
        getHighResolutionOutputSizeshNQ4ISI = ((i3 & 31) + (i3 | 31)) % 128;
    }

    @Override // com.gemalto.mfs.mwsdk.payment.PaymentBusinessService
    public void generateApplicationCryptogram(com.gemalto.mfs.mwsdk.dcm.DigitalizedCard digitalizedCard, com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType, com.gemalto.mfs.mwsdk.payment.engine.PaymentInputData paymentInputData, com.gemalto.mfs.mwsdk.payment.PaymentServiceListener paymentServiceListener) {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f280);
        sb.append(util.h.xy.al.ra.f417);
        util.h.xy.am.ma.m25027(str, sb.toString());
        util.h.xy.d.md mdVar = (util.h.xy.d.md) digitalizedCard;
        com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Boolean> m26211 = mdVar.m26211(paymentType);
        if (m26211.isSuccessful()) {
            int i = getHighSpeedVideoFpsRanges;
            int i2 = (i ^ 7) + ((i & 7) << 1);
            getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
            if (i2 % 2 != 0) {
                m26211.getResult();
                throw null;
            }
            if (m26211.getResult().booleanValue()) {
                int i3 = getHighResolutionOutputSizeshNQ4ISI;
                getHighSpeedVideoFpsRanges = ((i3 ^ 107) + ((i3 & 107) << 1)) % 128;
                mdVar = null;
            }
            if (paymentType == null) {
                throw new java.lang.IllegalArgumentException(util.h.xy.al.ra.f840);
            }
            if (paymentType == com.gemalto.mfs.mwsdk.dcm.PaymentType.DSRP) {
                int i4 = getHighSpeedVideoFpsRanges;
                getHighResolutionOutputSizeshNQ4ISI = ((i4 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) + (i4 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE)) % 128;
                util.h.xy.bu.rc.f1055.m25678(mdVar, paymentType, paymentInputData, paymentServiceListener);
            } else {
                if (paymentType != com.gemalto.mfs.mwsdk.dcm.PaymentType.QR) {
                    throw new java.lang.IllegalStateException(util.h.xy.al.ra.f836);
                }
                util.h.xy.bu.mc.f1053.m25668(mdVar, paymentType, paymentInputData, paymentServiceListener);
                int i5 = getHighResolutionOutputSizeshNQ4ISI;
                getHighSpeedVideoFpsRanges = (((i5 | 39) << 1) - (i5 ^ 39)) % 128;
            }
            int i6 = getHighResolutionOutputSizeshNQ4ISI;
            getHighSpeedVideoFpsRanges = ((i6 & 55) + (i6 | 55)) % 128;
        } else {
            util.h.xy.bf.ma.m25415(paymentServiceListener, com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.STORAGE_COMPONENT_ERROR, m26211.getErrorMessage());
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 121) % 128;
        }
        getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 55) % 128;
    }
}
