package util.h.xy.bu;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes18.dex */
public final class mc {
    private static char[] Camera2StreamConfigurationMap = null;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static char getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 1;
    private static char getHighSpeedVideoSizesFor;
    private static final /* synthetic */ util.h.xy.bu.mc[] getInputFormats;
    private static char getInputSizeshNQ4ISI;
    private static char getOutputFormats;
    private static final java.lang.String getOutputMinFrameDuration;
    private static int getOutputStallDurationlomOqCM;

    /* renamed from: ˏ, reason: contains not printable characters */
    public static final util.h.xy.bu.mc f1053;

    private mc(java.lang.String str) {
    }

    public static util.h.xy.bu.mc valueOf(java.lang.String str) {
        getOutputStallDurationlomOqCM = (getHighSpeedVideoFpsRanges + 29) % 128;
        util.h.xy.bu.mc mcVar = (util.h.xy.bu.mc) java.lang.Enum.valueOf(util.h.xy.bu.mc.class, str);
        int i = getHighSpeedVideoFpsRanges + 21;
        getOutputStallDurationlomOqCM = i % 128;
        if (i % 2 == 0) {
            return mcVar;
        }
        throw null;
    }

    public static util.h.xy.bu.mc[] values() {
        getOutputStallDurationlomOqCM = (getHighSpeedVideoFpsRanges + 81) % 128;
        util.h.xy.bu.mc[] mcVarArr = (util.h.xy.bu.mc[]) getInputFormats.clone();
        int i = getHighSpeedVideoFpsRanges + 55;
        getOutputStallDurationlomOqCM = i % 128;
        if (i % 2 == 0) {
            return mcVarArr;
        }
        throw null;
    }

    static {
        getHighSpeedVideoFpsRangesFor();
        java.lang.Object[] objArr = new java.lang.Object[1];
        Camera2StreamConfigurationMap("伤ꎴ蹂ฮ똥룞\uf2b7㒺", 8 - android.view.KeyEvent.getDeadChar(0, 0), objArr);
        util.h.xy.bu.mc mcVar = new util.h.xy.bu.mc(((java.lang.String) objArr[0]).intern());
        f1053 = mcVar;
        int i = getOutputStallDurationlomOqCM;
        int i2 = i + 69;
        getHighSpeedVideoFpsRanges = i2 % 128;
        int i3 = i2 % 2;
        util.h.xy.bu.mc[] mcVarArr = {mcVar};
        int i4 = i + 51;
        int i5 = i4 % 128;
        getHighSpeedVideoFpsRanges = i5;
        if (i4 % 2 != 0) {
            getInputFormats = mcVarArr;
            getOutputMinFrameDuration = "mc";
            getOutputStallDurationlomOqCM = (i5 + 57) % 128;
            return;
        }
        throw null;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m25667(java.lang.String str, com.gemalto.mfs.mwsdk.payment.PaymentServiceListener paymentServiceListener) {
        int i = getOutputStallDurationlomOqCM;
        getHighSpeedVideoFpsRanges = (i + 85) % 128;
        if (str != null) {
            int i2 = i + 15;
            getHighSpeedVideoFpsRanges = i2 % 128;
            if (i2 % 2 != 0) {
                if (!str.isEmpty()) {
                    if (paymentServiceListener == null) {
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(false, new int[]{0, 23, 0, 10}, "\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000", objArr);
                        throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
                    }
                    if (!(paymentServiceListener instanceof com.gemalto.mfs.mwsdk.payment.engine.QRCodePaymentServiceListener)) {
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        Camera2StreamConfigurationMap("ՙ刅⎹봅쭝ᗔ䡾鉝忡鸯籂襙潶瀭葛鿴Տ孁ፄ阩⯛㦷偏떄Ǎ⛏⯏欫佶眄\ue66c跴꼤빥葛鿴ᖮᾥ㾘ؐ쭝ᗔ\uda4a큠䡾鉝潶瀭쯚Ɥՙ刅⎹봅쭝ᗔ䡾鉝", 58 - android.view.View.combineMeasuredStates(0, 0), objArr2);
                        throw new java.lang.IllegalArgumentException(((java.lang.String) objArr2[0]).intern());
                    }
                    if (!util.h.xy.v.c.m27646().m27647()) {
                        if (paymentServiceListener != null) {
                            int i3 = getHighSpeedVideoFpsRanges + 17;
                            getOutputStallDurationlomOqCM = i3 % 128;
                            int i4 = i3 % 2;
                            com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode paymentServiceErrorCode = com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.PAYMENT_NOT_ALLOWED_SDK_NOT_INITIALIZED;
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            getHighResolutionOutputSizeshNQ4ISI(true, new int[]{23, 32, 0, 24}, "\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001", objArr3);
                            paymentServiceListener.onError(util.h.xy.bf.mc.m25434(paymentServiceErrorCode, ((java.lang.String) objArr3[0]).intern()));
                        }
                        int i5 = getHighSpeedVideoFpsRanges + 31;
                        getOutputStallDurationlomOqCM = i5 % 128;
                        if (i5 % 2 != 0) {
                            throw new java.lang.ArithmeticException();
                        }
                        return;
                    }
                    getHighSpeedVideoFpsRangesFor(null, str, paymentServiceListener);
                    return;
                }
            } else {
                throw new java.lang.ArithmeticException();
            }
        }
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        Camera2StreamConfigurationMap("\ue66c跴ᰑ枅⺡鍘⯏欫ꞈ尪㾘ؐ쭝ᗔ\u0098ꔌ踌ᩈ߱頍\u0098ꔌ빎㙛ɤ髾ᰑ枅麔\uf382맟\ufbc8\u0098ꔌℲʢ龍쌠ꁣ獶ค䫏愻䚇蔮Ý\u05ee䰏婠㯈", (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 50, objArr4);
        throw new java.lang.IllegalArgumentException(((java.lang.String) objArr4[0]).intern());
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m25668(util.h.xy.d.md mdVar, com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType, com.gemalto.mfs.mwsdk.payment.engine.PaymentInputData paymentInputData, com.gemalto.mfs.mwsdk.payment.PaymentServiceListener paymentServiceListener) {
        if (paymentInputData == null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            Camera2StreamConfigurationMap("\ue66c跴ᰑ枅⺡鍘⯏欫ꞈ尪㾘ؐ쭝ᗔ\u0098ꔌ踌ᩈ߱頍\u0098ꔌ빎㙛ɤ髾ᰑ枅麔\uf382맟\ufbc8\u0098ꔌℲʢ龍쌠ꁣ獶ค䫏愻䚇蔮Ý\u05ee䰏婠㯈", (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 50, objArr);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
        }
        if (paymentType != com.gemalto.mfs.mwsdk.dcm.PaymentType.QR) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            Camera2StreamConfigurationMap("衣⁃Ｍ\uf1d9\udb60몷Տ孁ᖮᾥ㾘ؐ쭝ᗔ\u0098ꔌ쯴㜗鎝㙼", 20 - android.text.TextUtils.indexOf("", "", 0), objArr2);
            throw new java.lang.IllegalStateException(((java.lang.String) objArr2[0]).intern());
        }
        if (paymentServiceListener == null) {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(false, new int[]{0, 23, 0, 10}, "\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000", objArr3);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr3[0]).intern());
        }
        java.lang.String str = null;
        if (!(paymentServiceListener instanceof com.gemalto.mfs.mwsdk.payment.engine.QRCodePaymentServiceListener)) {
            try {
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                Camera2StreamConfigurationMap("ՙ刅⎹봅쭝ᗔ䡾鉝忡鸯籂襙潶瀭葛鿴Տ孁ፄ阩⯛㦷偏떄Ǎ⛏⯏欫佶眄\ue66c跴꼤빥葛鿴ᖮᾥ㾘ؐ쭝ᗔ\uda4a큠䡾鉝潶瀭쯚Ɥՙ刅⎹봅쭝ᗔ䡾鉝", 58 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22), objArr4);
                throw new java.lang.IllegalArgumentException(((java.lang.String) objArr4[0]).intern());
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        util.h.xy.bq.rc rcVar = (util.h.xy.bq.rc) paymentInputData;
        if (rcVar.m25574() == null || rcVar.m25574().length == 0) {
            com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode paymentServiceErrorCode = com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.QR_CODE_INPUT_INVALID;
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(false, new int[]{55, 31, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE, 0}, "\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001", objArr5);
            getHighSpeedVideoSizes(paymentServiceListener, paymentServiceErrorCode, ((java.lang.String) objArr5[0]).intern());
            return;
        }
        if (!util.h.xy.v.c.m27646().m27647()) {
            if (paymentServiceListener != null) {
                com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode paymentServiceErrorCode2 = com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.PAYMENT_NOT_ALLOWED_SDK_NOT_INITIALIZED;
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI(true, new int[]{23, 32, 0, 24}, "\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001", objArr6);
                paymentServiceListener.onError(util.h.xy.bf.mc.m25434(paymentServiceErrorCode2, ((java.lang.String) objArr6[0]).intern()));
                return;
            }
            return;
        }
        java.lang.String valueOf = java.lang.String.valueOf((int) rcVar.m25581());
        if (valueOf.length() == 3) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(false, new int[]{86, 1, com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE, 0}, "\u0001", objArr7);
            sb.append(((java.lang.String) objArr7[0]).intern());
            sb.append(valueOf);
            valueOf = sb.toString();
        } else if (valueOf.length() == 1) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            java.lang.Object[] objArr8 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(false, new int[]{87, 3, 21, 1}, "\u0001\u0000\u0000", objArr8);
            sb2.append(((java.lang.String) objArr8[0]).intern());
            sb2.append(valueOf);
            valueOf = sb2.toString();
        }
        byte[] m25582 = rcVar.m25582();
        if (m25582 != null && m25582.length != 0) {
            str = new java.lang.String(rcVar.m25582());
        }
        getHighSpeedVideoFpsRangesFor(mdVar, getHighResolutionOutputSizeshNQ4ISI(new java.lang.String(rcVar.m25574()), rcVar.m25573(), valueOf, str), paymentServiceListener);
    }

    private static void Camera2StreamConfigurationMap(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2;
        int i3 = getHighResolutionOutputSizeshNQ4ISI + 79;
        getHighSpeedVideoSizes = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        char[] charArray = str.toCharArray();
        util.h.xz.b.e eVar = new util.h.xz.b.e();
        char[] cArr = new char[charArray.length];
        eVar.f2630 = 0;
        char[] cArr2 = new char[2];
        while (eVar.f2630 < charArray.length) {
            int i4 = getHighResolutionOutputSizeshNQ4ISI + 53;
            getHighSpeedVideoSizes = i4 % 128;
            int i5 = 58224;
            if (i4 % 2 == 0) {
                cArr2[0] = charArray[eVar.f2630];
                cArr2[1] = charArray[eVar.f2630];
                i2 = 1;
            } else {
                cArr2[0] = charArray[eVar.f2630];
                cArr2[1] = charArray[eVar.f2630 + 1];
                i2 = 0;
            }
            while (i2 < 16) {
                char c = cArr2[1];
                char c2 = cArr2[0];
                char c3 = (char) (c - (((c2 + i5) ^ ((c2 << 4) + ((char) (getOutputFormats ^ 3155153533016530592L)))) ^ ((c2 >>> 5) + ((char) (getHighSpeedVideoFpsRangesFor ^ 3155153533016530592L)))));
                cArr2[1] = c3;
                cArr2[0] = (char) (c2 - ((((c3 << 4) + ((char) (getHighSpeedVideoSizesFor ^ 3155153533016530592L))) ^ (c3 + i5)) ^ ((c3 >>> 5) + ((char) (getInputSizeshNQ4ISI ^ 3155153533016530592L)))));
                i5 -= 40503;
                i2++;
            }
            cArr[eVar.f2630] = cArr2[0];
            cArr[eVar.f2630 + 1] = cArr2[1];
            eVar.f2630 += 2;
        }
        objArr[0] = new java.lang.String(cArr, 0, i);
    }

    @util.h.xy.a.a
    private void getHighSpeedVideoFpsRangesFor(util.h.xy.d.md mdVar, java.lang.String str, com.gemalto.mfs.mwsdk.payment.PaymentServiceListener paymentServiceListener) {
        getHighSpeedVideoFpsRanges = (getOutputStallDurationlomOqCM + 107) % 128;
        if (mdVar != null) {
            com.gemalto.mfs.mwsdk.utils.async.AsyncResult<com.gemalto.mfs.mwsdk.dcm.DigitalizedCardDetails> m26209 = mdVar.m26209();
            if (m26209.isSuccessful()) {
                int i = getOutputStallDurationlomOqCM + 93;
                getHighSpeedVideoFpsRanges = i % 128;
                if (i % 2 == 0) {
                    m26209.getResult();
                    throw null;
                }
                if (m26209.getResult() != null) {
                    if (!m26209.getResult().isPaymentTypeSupported(com.gemalto.mfs.mwsdk.dcm.PaymentType.QR)) {
                        int i2 = getHighSpeedVideoFpsRanges + 3;
                        getOutputStallDurationlomOqCM = i2 % 128;
                        if (i2 % 2 != 0) {
                            util.h.xy.bu.b bVar = util.h.xy.bu.b.f1050;
                            com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode paymentServiceErrorCode = com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.QR_CODE_PAYMENT_NOT_SUPPORTED;
                            java.lang.Object[] objArr = new java.lang.Object[1];
                            Camera2StreamConfigurationMap("稅\ue286\ude98\uef7a䘝脢ꌤ癄શ褡푪獗韰瓬〳⪡맟\ufbc8\u0098ꔌ높屡䂜灐愻䚇\u0098ꔌ턑ُ㫪珺墽缟ｎ暢忡鸯ㄎ䫋곇沃ῇ氚\ue9b8鏆㇆趈\udec0⌳", 114 % (android.media.AudioTrack.getMaxVolume() > 2.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 2.0f ? 0 : -1)), objArr);
                            bVar.getHighSpeedVideoSizes(paymentServiceListener, paymentServiceErrorCode, ((java.lang.String) objArr[0]).intern());
                            return;
                        }
                        util.h.xy.bu.b bVar2 = util.h.xy.bu.b.f1050;
                        com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode paymentServiceErrorCode2 = com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.QR_CODE_PAYMENT_NOT_SUPPORTED;
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        Camera2StreamConfigurationMap("稅\ue286\ude98\uef7a䘝脢ꌤ癄શ褡푪獗韰瓬〳⪡맟\ufbc8\u0098ꔌ높屡䂜灐愻䚇\u0098ꔌ턑ُ㫪珺墽缟ｎ暢忡鸯ㄎ䫋곇沃ῇ氚\ue9b8鏆㇆趈\udec0⌳", (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 48, objArr2);
                        bVar2.getHighSpeedVideoSizes(paymentServiceListener, paymentServiceErrorCode2, ((java.lang.String) objArr2[0]).intern());
                        return;
                    }
                }
            }
            util.h.xy.bu.b.f1050.getHighSpeedVideoSizes(paymentServiceListener, com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.ERROR_READING_PAYMENT_CHANNEL, m26209.getErrorMessage());
            return;
        }
        util.h.xy.bu.b bVar3 = util.h.xy.bu.b.f1050;
        com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Boolean> highSpeedVideoSizes = util.h.xy.bu.b.getHighSpeedVideoSizes(com.gemalto.mfs.mwsdk.dcm.PaymentType.QR);
        if (!highSpeedVideoSizes.getResult().booleanValue()) {
            highSpeedVideoSizes.getErrorMessage();
            if (highSpeedVideoSizes.getErrorCode() != com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.NO_DEFAULT_CARD.ordinal()) {
                if (highSpeedVideoSizes.getErrorCode() == com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.QR_CODE_PAYMENT_NOT_SUPPORTED.ordinal() || highSpeedVideoSizes.getErrorCode() == com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.ERROR_READING_PAYMENT_CHANNEL.ordinal()) {
                    getHighSpeedVideoSizes(paymentServiceListener, com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.QR_CODE_PAYMENT_NOT_SUPPORTED, highSpeedVideoSizes.getErrorMessage());
                    return;
                }
                return;
            }
            int i3 = getHighSpeedVideoFpsRanges + 29;
            getOutputStallDurationlomOqCM = i3 % 128;
            if (i3 % 2 == 0) {
                getHighSpeedVideoSizes(paymentServiceListener, com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.NO_DEFAULT_CARD, highSpeedVideoSizes.getErrorMessage());
                return;
            } else {
                getHighSpeedVideoSizes(paymentServiceListener, com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.NO_DEFAULT_CARD, highSpeedVideoSizes.getErrorMessage());
                throw null;
            }
        }
        com.gemalto.mfs.mwsdk.payment.PaymentBusinessService paymentBusinessService = com.gemalto.mfs.mwsdk.payment.PaymentBusinessManager.getPaymentBusinessService();
        com.gemalto.mfs.mwsdk.payment.engine.PaymentService activatedPaymentService = paymentBusinessService.getActivatedPaymentService();
        if (activatedPaymentService != null) {
            int i4 = getHighSpeedVideoFpsRanges + 105;
            getOutputStallDurationlomOqCM = i4 % 128;
            if (i4 % 2 != 0) {
                com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode paymentServiceErrorCode3 = com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.QR_CODE_WRONG_STATE;
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI(false, new int[]{90, 66, 0, 16}, "\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000", objArr3);
                getHighSpeedVideoSizes(paymentServiceListener, paymentServiceErrorCode3, ((java.lang.String) objArr3[0]).intern());
                return;
            }
            com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode paymentServiceErrorCode4 = com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.QR_CODE_WRONG_STATE;
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(false, new int[]{90, 66, 0, 16}, "\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000", objArr4);
            getHighSpeedVideoSizes(paymentServiceListener, paymentServiceErrorCode4, ((java.lang.String) objArr4[0]).intern());
            return;
        }
        if (util.h.xy.bf.mb.f938.m25426() != null) {
            util.h.xy.bf.mb.f938.m25426().m25390(false);
        }
        byte[] m25522 = util.h.xy.bo.a.m25522(str, mdVar);
        util.h.xy.bu.c.f1051.m25653(m25522);
        util.h.xy.bu.c.f1051.m25647(mdVar);
        if (m25522 == null) {
            com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode paymentServiceErrorCode5 = com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.QR_CODE_INPUT_INVALID;
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(false, new int[]{55, 31, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE, 0}, "\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001", objArr5);
            getHighSpeedVideoSizes(paymentServiceListener, paymentServiceErrorCode5, ((java.lang.String) objArr5[0]).intern());
            return;
        }
        if (activatedPaymentService == null) {
            int i5 = getHighSpeedVideoFpsRanges + 65;
            getOutputStallDurationlomOqCM = i5 % 128;
            if (i5 % 2 != 0) {
                paymentBusinessService.activate(mdVar, com.gemalto.mfs.mwsdk.dcm.PaymentType.QR, paymentServiceListener);
                throw new java.lang.ArithmeticException();
            }
            paymentBusinessService.activate(mdVar, com.gemalto.mfs.mwsdk.dcm.PaymentType.QR, paymentServiceListener);
            getOutputStallDurationlomOqCM = (getHighSpeedVideoFpsRanges + 109) % 128;
        }
        com.gemalto.mfs.mwsdk.payment.engine.PaymentService activatedPaymentService2 = paymentBusinessService.getActivatedPaymentService();
        if (activatedPaymentService2 == null) {
            getOutputStallDurationlomOqCM = (getHighSpeedVideoFpsRanges + 61) % 128;
            util.h.xy.bu.c.f1051.m25652();
            return;
        }
        com.gemalto.mfs.mwsdk.payment.CHVerificationMethod result = com.gemalto.mfs.mwsdk.payment.chverification.CHVerificationManager.INSTANCE.getCVMethod().getResult();
        if (result == com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.WALLET_PIN) {
            if (activatedPaymentService2 instanceof util.h.xy.bq.rd) {
                ((util.h.xy.bq.rd) activatedPaymentService2).mo25547();
                return;
            }
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(true, new int[]{156, 14, 0, 0}, "\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001", objArr6);
            getHighSpeedVideoSizes(paymentServiceListener, null, ((java.lang.String) objArr6[0]).intern());
            util.h.xy.bu.c.f1051.m25652();
            return;
        }
        if (result != com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.BIOMETRICS && result != com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.DEVICE_KEYGUARD) {
            com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode paymentServiceErrorCode6 = com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.NO_DEFAULT_CHV_METHOD;
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            Camera2StreamConfigurationMap("㶧櫾⊀ᳫꁣ獶\u0098ꔌ릙薂㤑峂兢\uf158⬶\ue933ꌤ癄ಈ꿊륈⇕᪦၂뒿龀幵瑔Տ孁\udcd6䢜龍쌠혵錈鑪梥뒿龀", (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 40, objArr7);
            getHighSpeedVideoSizes(paymentServiceListener, paymentServiceErrorCode6, ((java.lang.String) objArr7[0]).intern());
            util.h.xy.bu.c.f1051.m25652();
            return;
        }
        if (!(activatedPaymentService2 instanceof util.h.xy.bq.mb)) {
            java.lang.Object[] objArr8 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(true, new int[]{156, 14, 0, 0}, "\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001", objArr8);
            getHighSpeedVideoSizes(paymentServiceListener, null, ((java.lang.String) objArr8[0]).intern());
            util.h.xy.bu.c.f1051.m25652();
            return;
        }
        int i6 = getHighSpeedVideoFpsRanges + 51;
        getOutputStallDurationlomOqCM = i6 % 128;
        if (i6 % 2 == 0) {
            ((util.h.xy.bq.mb) activatedPaymentService2).mo25547();
        } else {
            ((util.h.xy.bq.mb) activatedPaymentService2).mo25547();
            throw null;
        }
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(boolean z, int[] iArr, java.lang.String str, java.lang.Object[] objArr) {
        int i;
        int i2;
        int i3;
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 43) % 128;
        byte[] bytes = str.getBytes("ISO-8859-1");
        util.h.xz.b.ma maVar = new util.h.xz.b.ma();
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr = Camera2StreamConfigurationMap;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                int i9 = getHighResolutionOutputSizeshNQ4ISI + 25;
                getHighSpeedVideoSizes = i9 % 128;
                if (i9 % 2 == 0) {
                    i3 = i7;
                    cArr2[i8] = (char) (cArr[i8] % (-8125198844289309347L));
                    i8 %= 1;
                } else {
                    i3 = i7;
                    cArr2[i8] = (char) (cArr[i8] ^ (-8125198844289309347L));
                    i8++;
                }
                i7 = i3;
            }
            i = i7;
            cArr = cArr2;
        } else {
            i = i7;
        }
        char[] cArr3 = new char[i5];
        java.lang.System.arraycopy(cArr, i4, cArr3, 0, i5);
        if (bytes != null) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 15) % 128;
            char[] cArr4 = new char[i5];
            maVar.f2631 = 0;
            char c = 0;
            while (maVar.f2631 < i5) {
                int i10 = getHighSpeedVideoSizes + 63;
                getHighResolutionOutputSizeshNQ4ISI = i10 % 128;
                if (i10 % 2 == 0 ? bytes[maVar.f2631] != 1 : bytes[maVar.f2631] != 0) {
                    cArr4[maVar.f2631] = (char) ((cArr3[maVar.f2631] * 2) - c);
                } else {
                    cArr4[maVar.f2631] = (char) (((cArr3[maVar.f2631] * 2) + 1) - c);
                }
                c = cArr4[maVar.f2631];
                maVar.f2631++;
            }
            cArr3 = cArr4;
        }
        if (i > 0) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 53) % 128;
            char[] cArr5 = new char[i5];
            java.lang.System.arraycopy(cArr3, 0, cArr5, 0, i5);
            int i11 = i5 - i;
            int i12 = i;
            java.lang.System.arraycopy(cArr5, 0, cArr3, i11, i12);
            java.lang.System.arraycopy(cArr5, i12, cArr3, 0, i11);
        }
        if (z) {
            getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 95) % 128;
            char[] cArr6 = new char[i5];
            maVar.f2631 = 0;
            while (maVar.f2631 < i5) {
                cArr6[maVar.f2631] = cArr3[(i5 - maVar.f2631) - 1];
                maVar.f2631++;
            }
            cArr3 = cArr6;
        }
        if (i6 > 0) {
            maVar.f2631 = 0;
            while (maVar.f2631 < i5) {
                int i13 = getHighSpeedVideoSizes + 3;
                getHighResolutionOutputSizeshNQ4ISI = i13 % 128;
                if (i13 % 2 != 0) {
                    cArr3[maVar.f2631] = (char) (cArr3[maVar.f2631] * iArr[5]);
                    i2 = maVar.f2631;
                } else {
                    cArr3[maVar.f2631] = (char) (cArr3[maVar.f2631] - iArr[2]);
                    i2 = maVar.f2631 + 1;
                }
                maVar.f2631 = i2;
            }
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    private static java.lang.String getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            int i = getOutputStallDurationlomOqCM + 13;
            getHighSpeedVideoFpsRanges = i % 128;
            if (i % 2 != 0) {
                jSONObject.put(util.h.xy.al.ra.f286, str);
                if (str2 != null) {
                    jSONObject.put(util.h.xy.al.ra.f306, str2);
                    getHighSpeedVideoFpsRanges = (getOutputStallDurationlomOqCM + 43) % 128;
                }
                if (str3 != null) {
                    jSONObject.put(util.h.xy.al.ra.f383, str3);
                }
                if (str4 != null && str4.length() > 0) {
                    jSONObject.put(util.h.xy.al.ra.f333, str4);
                }
                return jSONObject.toString();
            }
            jSONObject.put(util.h.xy.al.ra.f286, str);
            throw new java.lang.ArithmeticException();
        } catch (org.json.JSONException unused) {
            return "";
        }
    }

    private void getHighSpeedVideoSizes(final com.gemalto.mfs.mwsdk.payment.PaymentServiceListener paymentServiceListener, final com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode paymentServiceErrorCode, final java.lang.String str) {
        util.h.xy.ag.a.m24556().m24557(new java.lang.Runnable() { // from class: util.h.xy.bu.mc.3
            private static int getHighSpeedVideoFpsRanges = 0;
            private static short[] getHighSpeedVideoSizesFor = null;
            private static int getInputFormats = 1;
            private static int getInputSizeshNQ4ISI = 815311521;
            private static byte[] getOutputFormats = {60, 13, 14, -13, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -27, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, -6, -28, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -11, -26, 2, -31, -20};
            private static int getOutputMinFrameDuration = 1;
            private static int getOutputSizes = -70796959;
            private static int getOutputStallDuration = 0;
            private static int getOutputStallDurationlomOqCM = -408872968;

            private static void getHighResolutionOutputSizeshNQ4ISI(int i, short s, byte b, int i2, int i3, java.lang.Object[] objArr) {
                int i4;
                int length;
                byte[] bArr;
                util.h.xz.b.me meVar = new util.h.xz.b.me();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                int i5 = i2 + ((int) (getOutputStallDurationlomOqCM ^ (-2689713159175858216L)));
                if (i5 == -1) {
                    getInputFormats = (getHighSpeedVideoFpsRanges + 111) % 128;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                if (i4 != 0) {
                    byte[] bArr2 = getOutputFormats;
                    if (bArr2 != null) {
                        int length2 = bArr2.length;
                        byte[] bArr3 = new byte[length2];
                        for (int i6 = 0; i6 < length2; i6++) {
                            bArr3[i6] = (byte) (bArr2[i6] ^ (-2689713159175858216L));
                        }
                        bArr2 = bArr3;
                    }
                    i5 = bArr2 != null ? (byte) (((byte) (getOutputFormats[((int) (getOutputSizes ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getOutputStallDurationlomOqCM ^ (-2689713159175858216L)))) : (short) (((short) (getHighSpeedVideoSizesFor[((int) (getOutputSizes ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getOutputStallDurationlomOqCM ^ (-2689713159175858216L))));
                }
                if (i5 > 0) {
                    meVar.f2647 = ((i + i5) - 2) + ((int) (getOutputSizes ^ (-2689713159175858216L))) + i4;
                    meVar.f2644 = (char) (i3 + ((int) (getInputSizeshNQ4ISI ^ (-2689713159175858216L))));
                    sb.append(meVar.f2644);
                    meVar.f2646 = meVar.f2644;
                    byte[] bArr4 = getOutputFormats;
                    if (bArr4 != null) {
                        int i7 = getHighSpeedVideoFpsRanges + 3;
                        getInputFormats = i7 % 128;
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
                        getHighSpeedVideoFpsRanges = (getInputFormats + 3) % 128;
                        bArr4 = bArr;
                    }
                    boolean z = bArr4 != null;
                    meVar.f2645 = 1;
                    getHighSpeedVideoFpsRanges = (getInputFormats + 21) % 128;
                    while (meVar.f2645 < i5) {
                        if (z) {
                            byte[] bArr5 = getOutputFormats;
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

            @Override // java.lang.Runnable
            public final void run() {
                int tapTimeout;
                byte b;
                short s;
                int i;
                int i2 = getOutputStallDuration + 115;
                getOutputMinFrameDuration = i2 % 128;
                if (i2 % 2 == 0) {
                    int indexOf = android.text.TextUtils.indexOf((java.lang.CharSequence) "", '(');
                    short indexOf2 = (short) (android.text.TextUtils.indexOf("", io.ktor.util.date.GMTDateParser.MINUTES, 1) + 1);
                    byte b2 = (byte) (47 >> (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                    tapTimeout = 44 / (android.view.ViewConfiguration.getTapTimeout() >> 41);
                    i = indexOf - 476491448;
                    s = indexOf2;
                    b = b2;
                } else {
                    int indexOf3 = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                    short indexOf4 = (short) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1);
                    byte b3 = (byte) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 46);
                    tapTimeout = (android.view.ViewConfiguration.getTapTimeout() >> 16) - 33;
                    b = b3;
                    s = indexOf4;
                    i = indexOf3 - 476491448;
                }
                try {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI(i, s, b, tapTimeout, (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22) + 684081875, objArr);
                    java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI((-476491444) - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (short) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), (byte) ((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) - 53), (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) - 33, 684081880 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr2);
                    util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
                    paymentServiceListener.onError(util.h.xy.bf.mc.m25434(paymentServiceErrorCode, str));
                    int i3 = getOutputMinFrameDuration + 89;
                    getOutputStallDuration = i3 % 128;
                    if (i3 % 2 != 0) {
                        throw null;
                    }
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
        });
        int i = getHighSpeedVideoFpsRanges + 97;
        getOutputStallDurationlomOqCM = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    static void getHighSpeedVideoFpsRangesFor() {
        getHighSpeedVideoSizesFor = (char) 26452;
        getInputSizeshNQ4ISI = (char) 21469;
        getOutputFormats = (char) 52426;
        getHighSpeedVideoFpsRangesFor = (char) 35404;
        Camera2StreamConfigurationMap = new char[]{42346, 42284, 42263, 42268, 42302, 42271, 42266, 42284, 42285, 42289, 42241, 42247, 42291, 42286, 42289, 42292, 42292, 42294, 42260, 42268, 42303, 42298, 42291, 42345, 42294, 42294, 42265, 42263, 42284, 42291, 42266, 42260, 42291, 42265, 42263, 42284, 42292, 42292, 42291, 42290, 42291, 42291, 42292, 42268, 42340, 42252, 42260, 42254, 42297, 42290, 42284, 42295, 42299, 42296, 42291, 42273, 42404, 42428, 42372, 42076, 42060, 42065, 42423, 42417, 42062, 42058, 42055, 42049, 42415, 42423, 42071, 42063, 42063, 42421, 42417, 42059, 42412, 42418, 42059, 42052, 42415, 42414, 42062, 42067, 42063, 42067, 42289, 42367, 42264, 42264, 42346, 42284, 42263, 42363, 42363, 42262, 42281, 42285, 42291, 42295, 42270, 42260, 42286, 42295, 42295, 42289, 42244, 42243, 42266, 42261, 42293, 42288, 42286, 42292, 42292, 42284, 42263, 42260, 42289, 42294, 42281, 42290, 42299, 42297, 42271, 42260, 42288, 42294, 42287, 42285, 42293, 42271, 42268, 42302, 42271, 42269, 42303, 42294, 42291, 42290, 42294, 42295, 42289, 42297, 42271, 42269, 42295, 42263, 42263, 42291, 42293, 42291, 42260, 42261, 42290, 42289, 42340, 42285, 42285, 42287, 42246, 42351, 42267, 42299, 42298, 42285, 42294, 42289, 42284, 42246};
    }
}
