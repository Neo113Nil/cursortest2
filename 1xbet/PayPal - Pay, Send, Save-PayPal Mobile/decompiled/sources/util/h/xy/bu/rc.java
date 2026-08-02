package util.h.xy.bu;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ˋ' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes18.dex */
public final class rc {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static final /* synthetic */ util.h.xy.bu.rc[] getHighSpeedVideoFpsRangesFor;
    private static final java.lang.String getHighSpeedVideoSizes;
    private static int getHighSpeedVideoSizesFor = 1;
    private static long getInputFormats;
    private static char[] getOutputMinFrameDuration;

    /* renamed from: ˋ, reason: contains not printable characters */
    public static final util.h.xy.bu.rc f1055;

    private rc(java.lang.String str) {
    }

    public static util.h.xy.bu.rc valueOf(java.lang.String str) {
        Camera2StreamConfigurationMap = (getHighSpeedVideoSizesFor + 99) % 128;
        util.h.xy.bu.rc rcVar = (util.h.xy.bu.rc) java.lang.Enum.valueOf(util.h.xy.bu.rc.class, str);
        Camera2StreamConfigurationMap = (getHighSpeedVideoSizesFor + 107) % 128;
        return rcVar;
    }

    public static util.h.xy.bu.rc[] values() {
        int i = Camera2StreamConfigurationMap + 93;
        getHighSpeedVideoSizesFor = i % 128;
        util.h.xy.bu.rc[] rcVarArr = getHighSpeedVideoFpsRangesFor;
        if (i % 2 != 0) {
            return (util.h.xy.bu.rc[]) rcVarArr.clone();
        }
        throw null;
    }

    static {
        getHighSpeedVideoFpsRangesFor();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(false, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE, 8, 0, 7}, "\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000", objArr);
        util.h.xy.bu.rc rcVar = new util.h.xy.bu.rc(((java.lang.String) objArr[0]).intern());
        f1055 = rcVar;
        int i = (Camera2StreamConfigurationMap + 39) % 128;
        getHighSpeedVideoSizesFor = i;
        Camera2StreamConfigurationMap = (i + 79) % 128;
        getHighSpeedVideoFpsRangesFor = new util.h.xy.bu.rc[]{rcVar};
        getHighSpeedVideoSizes = "rc";
        Camera2StreamConfigurationMap = (i + 41) % 128;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0175  */
    @util.h.xy.a.a
    /* renamed from: ˋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m25678(util.h.xy.d.md mdVar, com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType, com.gemalto.mfs.mwsdk.payment.engine.PaymentInputData paymentInputData, com.gemalto.mfs.mwsdk.payment.PaymentServiceListener paymentServiceListener) {
        com.gemalto.mfs.mwsdk.payment.engine.PaymentService activatedPaymentService;
        int i = Camera2StreamConfigurationMap + 41;
        getHighSpeedVideoSizesFor = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        if (paymentInputData == null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(false, new int[]{0, 49, 81, 0}, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001", objArr);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
        }
        if (paymentServiceListener == null) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("픿酑嶖᧦쐺聪䳔ଌ\uf70b뎳翼㨤\ue699ꋓ椝픶醡巭᠕쒌胚伸୭", android.view.Gravity.getAbsoluteGravity(0, 0) + 17483, objArr2);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr2[0]).intern());
        }
        if (paymentType != com.gemalto.mfs.mwsdk.dcm.PaymentType.DSRP) {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(false, new int[]{81, 20, 0, 0}, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001", objArr3);
            throw new java.lang.IllegalStateException(((java.lang.String) objArr3[0]).intern());
        }
        int i2 = getHighSpeedVideoSizesFor + 125;
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (!(paymentServiceListener instanceof com.gemalto.mfs.mwsdk.payment.engine.RemotePaymentServiceListener)) {
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("픿붃в\ueccc睲\udfe0Ꚁम醛硢샻ꮏ㈩髟浉\uf5e1岇❺迂ᙀﻨ䆋⠹남ᬋ\ue3e0䪜\udd70ꖮఆ铏羑옾꺥ㅕ駽悧쬏厼㩑苾ᖜﰝ䒓⽚럤ṻ\ue10d䦠큟룝͡\uea14犪앐귂㑮鼐", 26778 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr4);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr4[0]).intern());
        }
        if (!util.h.xy.v.c.m27646().m27647()) {
            if (paymentServiceListener != null) {
                getHighSpeedVideoSizesFor = (Camera2StreamConfigurationMap + 113) % 128;
                com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode paymentServiceErrorCode = com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.PAYMENT_NOT_ALLOWED_SDK_NOT_INITIALIZED;
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(true, new int[]{49, 32, 0, 0}, "\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001", objArr5);
                paymentServiceListener.onError(util.h.xy.bf.mc.m25434(paymentServiceErrorCode, ((java.lang.String) objArr5[0]).intern()));
                return;
            }
            return;
        }
        util.h.xy.bq.rc rcVar = (util.h.xy.bq.rc) paymentInputData;
        int i3 = Camera2StreamConfigurationMap + 1;
        getHighSpeedVideoSizesFor = i3 % 128;
        if (i3 % 2 == 0) {
            util.h.xy.bp.ra.m25544(rcVar);
            throw null;
        }
        byte[] m25544 = util.h.xy.bp.ra.m25544(rcVar);
        if (m25544 == null || m25544.length <= 0) {
            util.h.xy.bu.b bVar = util.h.xy.bu.b.f1050;
            com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode paymentServiceErrorCode2 = com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.REMOTE_PAYMENT_INPUT_INVALID;
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("픡骭䩨㨭\uebeb宱\u0b31מּ\ua8caᢙ졐렟槙\ud978襩绯⺭鹨丠㿦\uefcf彀ༀﳊ겚ᰐ췤붹洧\udd32苶犢∳鈞䏄㎎\ue356匐", ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, objArr6);
            bVar.getHighSpeedVideoSizes(paymentServiceListener, paymentServiceErrorCode2, ((java.lang.String) objArr6[0]).intern());
        } else if (mdVar == null) {
            util.h.xy.bu.b bVar2 = util.h.xy.bu.b.f1050;
            com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Boolean> highSpeedVideoSizes = util.h.xy.bu.b.getHighSpeedVideoSizes(com.gemalto.mfs.mwsdk.dcm.PaymentType.DSRP);
            if (!highSpeedVideoSizes.getResult().booleanValue()) {
                highSpeedVideoSizes.getErrorMessage();
                if (highSpeedVideoSizes.getErrorCode() == com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.NO_DEFAULT_CARD.ordinal()) {
                    util.h.xy.bu.b.f1050.getHighSpeedVideoSizes(paymentServiceListener, com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.NO_DEFAULT_CARD, highSpeedVideoSizes.getErrorMessage());
                } else if (highSpeedVideoSizes.getErrorCode() == com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.ERROR_READING_PAYMENT_CHANNEL.ordinal()) {
                    getHighSpeedVideoSizesFor = (Camera2StreamConfigurationMap + 25) % 128;
                    util.h.xy.bu.b.f1050.getHighSpeedVideoSizes(paymentServiceListener, com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.ERROR_READING_PAYMENT_CHANNEL, highSpeedVideoSizes.getErrorMessage());
                    Camera2StreamConfigurationMap = (getHighSpeedVideoSizesFor + 47) % 128;
                } else if (highSpeedVideoSizes.getErrorCode() == com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.REMOTE_PAYMENT_NOT_SUPPORTED.ordinal()) {
                    util.h.xy.bu.b.f1050.getHighSpeedVideoSizes(paymentServiceListener, com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.REMOTE_PAYMENT_NOT_SUPPORTED, highSpeedVideoSizes.getErrorMessage());
                }
            }
            com.gemalto.mfs.mwsdk.payment.PaymentBusinessService paymentBusinessService = com.gemalto.mfs.mwsdk.payment.PaymentBusinessManager.getPaymentBusinessService();
            activatedPaymentService = paymentBusinessService.getActivatedPaymentService();
            if (activatedPaymentService == null) {
                util.h.xy.bu.b bVar3 = util.h.xy.bu.b.f1050;
                com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode paymentServiceErrorCode3 = com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.REMOTE_PAYMENT_WRONG_STATE;
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(true, new int[]{101, 66, com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE, 0}, "\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001", objArr7);
                bVar3.getHighSpeedVideoSizes(paymentServiceListener, paymentServiceErrorCode3, ((java.lang.String) objArr7[0]).intern());
            } else {
                if (util.h.xy.bf.mb.f938.m25426() != null) {
                    int i4 = Camera2StreamConfigurationMap + 47;
                    getHighSpeedVideoSizesFor = i4 % 128;
                    if (i4 % 2 == 0) {
                        util.h.xy.bf.mb.f938.m25426().m25390(true);
                    } else {
                        util.h.xy.bf.mb.f938.m25426().m25390(false);
                    }
                }
                if (activatedPaymentService == null) {
                    paymentBusinessService.activate(mdVar, com.gemalto.mfs.mwsdk.dcm.PaymentType.DSRP, paymentServiceListener);
                }
                com.gemalto.mfs.mwsdk.payment.engine.PaymentService activatedPaymentService2 = paymentBusinessService.getActivatedPaymentService();
                if (activatedPaymentService2 == null) {
                    util.h.xy.bu.c.f1051.m25649();
                } else {
                    com.gemalto.mfs.mwsdk.payment.CHVerificationMethod result = com.gemalto.mfs.mwsdk.payment.chverification.CHVerificationManager.INSTANCE.getCVMethod().getResult();
                    if (result == com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.WALLET_PIN) {
                        if (activatedPaymentService2 instanceof util.h.xy.bq.rd) {
                            util.h.xy.bu.c.f1051.m25651(m25544);
                            util.h.xy.bu.c.f1051.m25647(mdVar);
                            ((util.h.xy.bq.rd) activatedPaymentService2).mo25547();
                        } else {
                            util.h.xy.bu.c.f1051.m25649();
                            util.h.xy.bu.b bVar4 = util.h.xy.bu.b.f1050;
                            java.lang.Object[] objArr8 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor(false, new int[]{167, 14, 86, 0}, "\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001", objArr8);
                            bVar4.getHighSpeedVideoSizes(paymentServiceListener, (com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode) null, ((java.lang.String) objArr8[0]).intern());
                        }
                    } else if (result != com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.BIOMETRICS && result != com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.DEVICE_KEYGUARD) {
                        util.h.xy.bu.c.f1051.m25649();
                        util.h.xy.bu.b bVar5 = util.h.xy.bu.b.f1050;
                        com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode paymentServiceErrorCode4 = com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.NO_DEFAULT_CHV_METHOD;
                        java.lang.Object[] objArr9 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor(false, new int[]{181, 40, 0, 0}, "\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001", objArr9);
                        bVar5.getHighSpeedVideoSizes(paymentServiceListener, paymentServiceErrorCode4, ((java.lang.String) objArr9[0]).intern());
                    } else if (activatedPaymentService2 instanceof util.h.xy.bq.mb) {
                        util.h.xy.bu.c.f1051.m25651(m25544);
                        util.h.xy.bu.c.f1051.m25647(mdVar);
                        ((util.h.xy.bq.mb) activatedPaymentService2).mo25547();
                    } else {
                        util.h.xy.bu.c.f1051.m25649();
                        util.h.xy.bu.b bVar6 = util.h.xy.bu.b.f1050;
                        java.lang.Object[] objArr10 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor(false, new int[]{167, 14, 86, 0}, "\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001", objArr10);
                        bVar6.getHighSpeedVideoSizes(paymentServiceListener, (com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode) null, ((java.lang.String) objArr10[0]).intern());
                    }
                }
            }
        } else {
            com.gemalto.mfs.mwsdk.utils.async.AsyncResult<com.gemalto.mfs.mwsdk.dcm.DigitalizedCardDetails> m26209 = mdVar.m26209();
            if (m26209.isSuccessful()) {
                getHighSpeedVideoSizesFor = (Camera2StreamConfigurationMap + 79) % 128;
                if (m26209.getResult() != null) {
                    if (!m26209.getResult().isPaymentTypeSupported(com.gemalto.mfs.mwsdk.dcm.PaymentType.DSRP)) {
                        util.h.xy.bu.b bVar7 = util.h.xy.bu.b.f1050;
                        com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode paymentServiceErrorCode5 = com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.REMOTE_PAYMENT_NOT_SUPPORTED;
                        try {
                            java.lang.Object[] objArr11 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor("픴膕簛⢻蜡玘⹊髻煹Ⱀ飅眲⎨鹕䫒Ⅎ鷭䡣✉鏎丬㪽酉䷚㡴银䎁㹆\ueaa4䄥㷝\ue847䓰㍨\uefe8媚ㅏ\ueda8堨㓃\ue346忱੫\ue102巇ࠤ\ue4b8卂࿆", (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22) + 21647, objArr11);
                            bVar7.getHighSpeedVideoSizes(paymentServiceListener, paymentServiceErrorCode5, ((java.lang.String) objArr11[0]).intern());
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    com.gemalto.mfs.mwsdk.payment.PaymentBusinessService paymentBusinessService2 = com.gemalto.mfs.mwsdk.payment.PaymentBusinessManager.getPaymentBusinessService();
                    activatedPaymentService = paymentBusinessService2.getActivatedPaymentService();
                    if (activatedPaymentService == null) {
                    }
                }
            }
            util.h.xy.bu.b.f1050.getHighSpeedVideoSizes(paymentServiceListener, com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.ERROR_READING_PAYMENT_CHANNEL, m26209.getErrorMessage());
        }
        getHighSpeedVideoSizesFor = (Camera2StreamConfigurationMap + 43) % 128;
    }

    private static void getHighSpeedVideoFpsRangesFor(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2 = getHighResolutionOutputSizeshNQ4ISI + 125;
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        char[] charArray = str.toCharArray();
        util.h.xz.b.d dVar = new util.h.xz.b.d();
        dVar.f2628 = i;
        int length = charArray.length;
        long[] jArr = new long[length];
        dVar.f2629 = 0;
        while (dVar.f2629 < charArray.length) {
            jArr[dVar.f2629] = (charArray[dVar.f2629] ^ (dVar.f2629 * dVar.f2628)) ^ (getInputFormats ^ (-7508379876853140581L));
            dVar.f2629++;
            int i3 = getHighSpeedVideoFpsRanges + 3;
            getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 2 / 4;
            }
        }
        char[] cArr = new char[length];
        dVar.f2629 = 0;
        while (dVar.f2629 < charArray.length) {
            cArr[dVar.f2629] = (char) jArr[dVar.f2629];
            dVar.f2629++;
        }
        java.lang.String str2 = new java.lang.String(cArr);
        getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 7) % 128;
        objArr[0] = str2;
    }

    private static void getHighSpeedVideoFpsRangesFor(boolean z, int[] iArr, java.lang.String str, java.lang.Object[] objArr) {
        int i = getHighSpeedVideoFpsRanges + 65;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        byte[] bytes = str.getBytes("ISO-8859-1");
        util.h.xz.b.ma maVar = new util.h.xz.b.ma();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = getOutputMinFrameDuration;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 31) % 128;
            for (int i6 = 0; i6 < length; i6++) {
                cArr2[i6] = (char) (cArr[i6] ^ (-8125198844289309347L));
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i3];
        java.lang.System.arraycopy(cArr, i2, cArr3, 0, i3);
        if (bytes != null) {
            char[] cArr4 = new char[i3];
            maVar.f2631 = 0;
            int i7 = getHighSpeedVideoFpsRanges + 29;
            getHighResolutionOutputSizeshNQ4ISI = i7 % 128;
            int i8 = i7 % 2;
            char c = 0;
            while (maVar.f2631 < i3) {
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
        if (i5 > 0) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 63) % 128;
            char[] cArr5 = new char[i3];
            java.lang.System.arraycopy(cArr3, 0, cArr5, 0, i3);
            int i9 = i3 - i5;
            java.lang.System.arraycopy(cArr5, 0, cArr3, i9, i5);
            java.lang.System.arraycopy(cArr5, i5, cArr3, 0, i9);
        }
        if (z) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 49) % 128;
            char[] cArr6 = new char[i3];
            maVar.f2631 = 0;
            while (maVar.f2631 < i3) {
                cArr6[maVar.f2631] = cArr3[(i3 - maVar.f2631) - 1];
                maVar.f2631++;
            }
            cArr3 = cArr6;
        }
        if (i4 > 0) {
            maVar.f2631 = 0;
            while (maVar.f2631 < i3) {
                cArr3[maVar.f2631] = (char) (cArr3[maVar.f2631] - iArr[2]);
                maVar.f2631++;
            }
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static void getHighSpeedVideoFpsRangesFor() {
        getOutputMinFrameDuration = new char[]{42252, 42481, 42471, 42466, 42399, 42464, 42446, 42436, 42468, 42467, 42393, 42471, 42471, 42399, 42438, 42440, 42465, 42397, 42398, 42392, 42438, 42446, 42478, 42470, 42470, 42444, 42447, 42478, 42469, 42466, 42466, 42399, 42438, 42447, 42473, 42446, 42437, 42399, 42396, 42464, 42442, 42437, 42396, 42439, 42446, 42471, 42466, 42398, 42394, 42351, 42297, 42290, 42284, 42295, 42299, 42296, 42291, 42291, 42294, 42294, 42265, 42263, 42284, 42291, 42266, 42260, 42291, 42265, 42263, 42284, 42292, 42292, 42291, 42290, 42291, 42291, 42292, 42268, 42340, 42252, 42260, 42361, 42246, 42287, 42294, 42299, 42295, 42299, 42271, 42341, 42245, 42288, 42286, 42292, 42292, 42284, 42263, 42343, 42299, 42281, 42295, 42454, 42048, 42054, 42054, 42105, 42407, 42409, 42054, 42050, 42108, 42104, 42401, 42378, 42378, 42406, 42111, 42049, 42048, 42109, 42404, 42407, 42050, 42052, 42050, 42406, 42406, 42054, 42412, 42414, 42056, 42048, 42054, 42049, 42109, 42050, 42049, 42062, 42412, 42414, 42057, 42415, 42414, 42052, 42108, 42110, 42049, 42051, 42407, 42414, 42056, 42058, 42109, 42104, 42049, 42048, 42407, 42406, 42111, 42055, 42055, 42105, 42051, 42052, 42404, 42405, 42066, 42258, 42476, 42394, 42399, 42396, 42395, 42464, 42465, 42433, 42453, 42476, 42389, 42395, 42395, 42367, 42249, 42296, 42302, 42294, 42285, 42285, 42263, 42348, 42264, 42258, 42240, 42294, 42288, 42298, 42298, 42299, 42303, 42295, 42291, 42289, 42291, 42266, 42267, 42292, 42289, 42291, 42294, 42292, 42271, 42265, 42291, 42260, 42266, 42291, 42284, 42263, 42260, 42289, 42289, 42362, 42253, 42254, 42263, 42266, 42261, 42265, 42266};
        getInputFormats = -4058077414559258904L;
    }
}
