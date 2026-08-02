package util.h.xy.bq;

/* loaded from: classes18.dex */
public class mb extends util.h.xy.bq.a {
    private static final byte[] Camera2StreamConfigurationMap = null;
    private static final int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes = 0;
    private static short[] getHighSpeedVideoSizesFor = null;
    private static int getInputFormats = 0;
    private static int getInputSizeshNQ4ISI = 0;
    private static final java.lang.String getOutputFormats;
    private static int getOutputMinFrameDuration = 0;
    private static char getOutputMinFrameDurationlomOqCM = 0;
    private static int getOutputSizes = 1;
    private static int getOutputSizeshNQ4ISI;
    private static long getOutputStallDuration;
    private static long getOutputStallDurationlomOqCM;
    private static int isOutputSupportedForhNQ4ISI;
    private static byte[] toString;
    private boolean getValidOutputFormatsForInputhNQ4ISI;
    private util.h.xy.aa.mc isOutputSupportedFor;

    private static void getHighSpeedVideoFpsRangesFor(java.lang.Object[] objArr) {
        int i;
        char[] cArr = new char[1];
        if (Camera2StreamConfigurationMap == null) {
            int i2 = getOutputSizes + 91;
            getOutputSizeshNQ4ISI = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            i = -4;
        } else {
            i = 715;
        }
        cArr[0] = (char) i;
        objArr[0] = new java.lang.String(cArr);
        int i3 = getOutputSizeshNQ4ISI + 65;
        getOutputSizes = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    private static void getHighSpeedVideoSizes(java.lang.String str, int i, java.lang.Object[] objArr) {
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 41) % 128;
        char[] charArray = str.toCharArray();
        util.h.xz.b.a aVar = new util.h.xz.b.a();
        char[] m27721 = util.h.xz.b.a.m27721(getOutputStallDuration ^ 7817488252581312552L, charArray, i);
        aVar.f2623 = 4;
        while (aVar.f2623 < m27721.length) {
            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 35) % 128;
            aVar.f2624 = aVar.f2623 - 4;
            m27721[aVar.f2623] = (char) ((m27721[aVar.f2623] ^ m27721[aVar.f2623 % 4]) ^ (aVar.f2624 * (getOutputStallDuration ^ 7817488252581312552L)));
            aVar.f2623++;
            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 29) % 128;
        }
        objArr[0] = new java.lang.String(m27721, 4, m27721.length - 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0283 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0284  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(util.h.xy.bq.mb mbVar, com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType, long j, com.gemalto.mfs.mwsdk.cdcvm.DeviceCVMVerifyListener deviceCVMVerifyListener) {
        byte[] m25521;
        int m24554;
        byte[] m25545;
        int m245542;
        int i = getOutputSizeshNQ4ISI + 61;
        getOutputSizes = i % 128;
        if (paymentType == com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS) {
            mbVar.f991 = true;
            mbVar.m25550(mbVar, j);
            util.h.xy.ag.a.m24556().m24557(new java.lang.Runnable() { // from class: util.h.xy.bq.mb.3
                private static int[] Camera2StreamConfigurationMap = {679954922, 1034593925, -825399703, 1422558425, 1867085326, 896702130, 1357722148, -1416207372, 533086141, -2067656181, 529207153, 904062006, 1939100788, -54176405, -1679243901, -1288896536, -1543432813, -1556006573};
                private static int getHighResolutionOutputSizeshNQ4ISI = 1;
                private static int getHighSpeedVideoFpsRanges = 0;
                private static int getHighSpeedVideoSizes = 1;
                private static int getInputSizeshNQ4ISI;

                private static void getHighSpeedVideoSizes(int[] iArr, int i2, java.lang.Object[] objArr) {
                    util.h.xz.b.c cVar = new util.h.xz.b.c();
                    char[] cArr = new char[4];
                    char[] cArr2 = new char[iArr.length * 2];
                    int[] iArr2 = Camera2StreamConfigurationMap;
                    if (iArr2 != null) {
                        int length = iArr2.length;
                        int[] iArr3 = new int[length];
                        int i3 = 0;
                        while (i3 < length) {
                            iArr3[i3] = (int) (iArr2[i3] ^ (-5569649899877129369L));
                            i3++;
                            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 69) % 128;
                        }
                        iArr2 = iArr3;
                    }
                    int length2 = iArr2.length;
                    int[] iArr4 = new int[length2];
                    int[] iArr5 = Camera2StreamConfigurationMap;
                    if (iArr5 != null) {
                        int length3 = iArr5.length;
                        int[] iArr6 = new int[length3];
                        for (int i4 = 0; i4 < length3; i4++) {
                            iArr6[i4] = (int) (iArr5[i4] ^ (-5569649899877129369L));
                        }
                        iArr5 = iArr6;
                    }
                    java.lang.System.arraycopy(iArr5, 0, iArr4, 0, length2);
                    cVar.f2626 = 0;
                    while (cVar.f2626 < iArr.length) {
                        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 47) % 128;
                        cArr[0] = (char) (iArr[cVar.f2626] >> 16);
                        cArr[1] = (char) iArr[cVar.f2626];
                        cArr[2] = (char) (iArr[cVar.f2626 + 1] >> 16);
                        cArr[3] = (char) iArr[cVar.f2626 + 1];
                        cVar.f2627 = (cArr[0] << 16) + cArr[1];
                        cVar.f2625 = (cArr[2] << 16) + cArr[3];
                        util.h.xz.b.c.m27723(iArr4);
                        getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 13) % 128;
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
                    objArr[0] = new java.lang.String(cArr2, 0, i2);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    getHighSpeedVideoSizes = (getInputSizeshNQ4ISI + 111) % 128;
                    try {
                        util.h.xy.bq.mb.getOutputMinFrameDuration();
                        com.gemalto.mfs.mwsdk.payment.engine.ContactlessPaymentServiceListener contactlessPaymentServiceListener = (com.gemalto.mfs.mwsdk.payment.engine.ContactlessPaymentServiceListener) util.h.xy.bq.mb.this.getPaymentServiceListener();
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        getHighSpeedVideoSizes(new int[]{1264441310, 69966992}, 4 - android.view.View.resolveSizeAndState(0, 0, 0), objArr);
                        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        getHighSpeedVideoSizes(new int[]{-400890967, 1995626168, 659022491, -57605669, -1300178535, 1101326815, 336428452, -1826462600}, 13 - android.view.View.combineMeasuredStates(0, 0), objArr2);
                        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
                        if (contactlessPaymentServiceListener != null) {
                            contactlessPaymentServiceListener.onReadyToTap(util.h.xy.bq.mb.this);
                        } else {
                            util.h.xy.bq.mb.getOutputMinFrameDuration();
                            getHighSpeedVideoSizes = (getInputSizeshNQ4ISI + 117) % 128;
                        }
                    } catch (java.lang.Throwable th) {
                        util.h.xy.bq.mb.getOutputMinFrameDuration();
                        th.getMessage();
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        getHighSpeedVideoSizes(new int[]{1264441310, 69966992}, 3 - android.view.MotionEvent.axisFromString(""), objArr3);
                        java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        getHighSpeedVideoSizes(new int[]{-400890967, 1995626168, 659022491, -57605669, -1300178535, 1101326815, 173419065, -788692169}, 15 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr4);
                        util.h.xy.am.ma.m25027(intern2, ((java.lang.String) objArr4[0]).intern());
                    }
                }
            });
            int i2 = getOutputSizes;
            int i3 = i2 + 117;
            getOutputSizeshNQ4ISI = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            getOutputSizeshNQ4ISI = (i2 + 17) % 128;
        } else if (paymentType == com.gemalto.mfs.mwsdk.dcm.PaymentType.QR) {
            try {
                m25521 = util.h.xy.bo.a.m25521(util.h.xy.bu.c.f1051.m25648());
                m24554 = util.h.xy.af.mb.m24551().m24554();
            } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(e.getMessage());
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoSizes("撻ࡈ撛膐籶\ue776徸", android.view.ViewConfiguration.getScrollDefaultDelay() >> 16, objArr);
                sb.append(((java.lang.String) objArr[0]).intern());
                sb.append(e.getmErrorCode());
                final com.gemalto.mfs.mwsdk.sdkconfig.SDKError<com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode> m25434 = util.h.xy.bf.mc.m25434(com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.QR_CODE_INPUT_INVALID, sb.toString());
                util.h.xy.ag.a.m24556().m24557(new java.lang.Runnable() { // from class: util.h.xy.bq.mb.8
                    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
                    private static int getHighSpeedVideoFpsRanges = 0;
                    private static int getHighSpeedVideoSizes = 0;
                    private static char getHighSpeedVideoSizesFor = 28661;
                    private static char getInputFormats = 17122;
                    private static char getInputSizeshNQ4ISI = 5572;
                    private static int getOutputFormats = 1;
                    private static char getOutputMinFrameDuration = 30598;

                    private static void getHighSpeedVideoSizes(java.lang.String str, int i4, java.lang.Object[] objArr2) {
                        int i5 = getHighResolutionOutputSizeshNQ4ISI + 73;
                        getHighSpeedVideoFpsRanges = i5 % 128;
                        if (i5 % 2 != 0) {
                            throw new java.lang.ArithmeticException();
                        }
                        char[] charArray = str.toCharArray();
                        util.h.xz.b.e eVar = new util.h.xz.b.e();
                        char[] cArr = new char[charArray.length];
                        eVar.f2630 = 0;
                        char[] cArr2 = new char[2];
                        while (eVar.f2630 < charArray.length) {
                            cArr2[0] = charArray[eVar.f2630];
                            cArr2[1] = charArray[eVar.f2630 + 1];
                            int i6 = 58224;
                            for (int i7 = 0; i7 < 16; i7++) {
                                getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 17) % 128;
                                char c = cArr2[1];
                                char c2 = cArr2[0];
                                char c3 = (char) (c - (((c2 + i6) ^ ((c2 << 4) + ((char) (getInputSizeshNQ4ISI ^ 3155153533016530592L)))) ^ ((c2 >>> 5) + ((char) (getOutputMinFrameDuration ^ 3155153533016530592L)))));
                                cArr2[1] = c3;
                                cArr2[0] = (char) (c2 - ((((c3 << 4) + ((char) (getInputFormats ^ 3155153533016530592L))) ^ (c3 + i6)) ^ ((c3 >>> 5) + ((char) (getHighSpeedVideoSizesFor ^ 3155153533016530592L)))));
                                i6 -= 40503;
                            }
                            cArr[eVar.f2630] = cArr2[0];
                            cArr[eVar.f2630 + 1] = cArr2[1];
                            eVar.f2630 += 2;
                        }
                        objArr2[0] = new java.lang.String(cArr, 0, i4);
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        getHighSpeedVideoSizes = (getOutputFormats + 59) % 128;
                        try {
                            com.gemalto.mfs.mwsdk.payment.engine.QRCodePaymentServiceListener qRCodePaymentServiceListener = (com.gemalto.mfs.mwsdk.payment.engine.QRCodePaymentServiceListener) util.h.xy.bq.mb.this.getPaymentServiceListener();
                            java.lang.Object[] objArr2 = new java.lang.Object[1];
                            getHighSpeedVideoSizes("ꐣ\udcf1誙㎬", 3 - android.widget.ExpandableListView.getPackedPositionChild(0L), objArr2);
                            java.lang.String intern = ((java.lang.String) objArr2[0]).intern();
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            getHighSpeedVideoSizes("\uea1a풓櫛잷悍颒㎿蹔窮ﾭ\udb1a壧㼊臡", 12 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), objArr3);
                            util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr3[0]).intern());
                            if (qRCodePaymentServiceListener == null) {
                                util.h.xy.bq.mb.getOutputMinFrameDuration();
                            } else {
                                int i4 = getHighSpeedVideoSizes + 111;
                                getOutputFormats = i4 % 128;
                                if (i4 % 2 == 0) {
                                    qRCodePaymentServiceListener.onError(m25434);
                                    throw new java.lang.NullPointerException();
                                }
                                qRCodePaymentServiceListener.onError(m25434);
                            }
                        } catch (java.lang.Throwable th) {
                            util.h.xy.bq.mb.getOutputMinFrameDuration();
                            th.getMessage();
                            java.lang.Object[] objArr4 = new java.lang.Object[1];
                            getHighSpeedVideoSizes("ꐣ\udcf1誙㎬", 4 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), objArr4);
                            java.lang.String intern2 = ((java.lang.String) objArr4[0]).intern();
                            java.lang.Object[] objArr5 = new java.lang.Object[1];
                            getHighSpeedVideoSizes("\uea1a풓櫛잷悍颒㎿蹔窮ﾭ\udb1a壧䜠储", android.view.Gravity.getAbsoluteGravity(0, 0) + 14, objArr5);
                            util.h.xy.am.ma.m25027(intern2, ((java.lang.String) objArr5[0]).intern());
                        }
                        getOutputFormats = (getHighSpeedVideoSizes + 85) % 128;
                    }
                });
                getOutputSizeshNQ4ISI = (getOutputSizes + 115) % 128;
                util.h.xy.bu.b.f1050.m25641(99);
                if (i % 2 == 0) {
                }
            }
            if (m24554 != -91) {
                final com.gemalto.mfs.mwsdk.sdkconfig.SDKError<com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode> m25432 = util.h.xy.bf.mc.m25432(m24554);
                util.h.xy.ag.a.m24556().m24557(new java.lang.Runnable() { // from class: util.h.xy.bq.mb.8
                    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
                    private static int getHighSpeedVideoFpsRanges = 0;
                    private static int getHighSpeedVideoSizes = 0;
                    private static char getHighSpeedVideoSizesFor = 28661;
                    private static char getInputFormats = 17122;
                    private static char getInputSizeshNQ4ISI = 5572;
                    private static int getOutputFormats = 1;
                    private static char getOutputMinFrameDuration = 30598;

                    private static void getHighSpeedVideoSizes(java.lang.String str, int i4, java.lang.Object[] objArr2) {
                        int i5 = getHighResolutionOutputSizeshNQ4ISI + 73;
                        getHighSpeedVideoFpsRanges = i5 % 128;
                        if (i5 % 2 != 0) {
                            throw new java.lang.ArithmeticException();
                        }
                        char[] charArray = str.toCharArray();
                        util.h.xz.b.e eVar = new util.h.xz.b.e();
                        char[] cArr = new char[charArray.length];
                        eVar.f2630 = 0;
                        char[] cArr2 = new char[2];
                        while (eVar.f2630 < charArray.length) {
                            cArr2[0] = charArray[eVar.f2630];
                            cArr2[1] = charArray[eVar.f2630 + 1];
                            int i6 = 58224;
                            for (int i7 = 0; i7 < 16; i7++) {
                                getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 17) % 128;
                                char c = cArr2[1];
                                char c2 = cArr2[0];
                                char c3 = (char) (c - (((c2 + i6) ^ ((c2 << 4) + ((char) (getInputSizeshNQ4ISI ^ 3155153533016530592L)))) ^ ((c2 >>> 5) + ((char) (getOutputMinFrameDuration ^ 3155153533016530592L)))));
                                cArr2[1] = c3;
                                cArr2[0] = (char) (c2 - ((((c3 << 4) + ((char) (getInputFormats ^ 3155153533016530592L))) ^ (c3 + i6)) ^ ((c3 >>> 5) + ((char) (getHighSpeedVideoSizesFor ^ 3155153533016530592L)))));
                                i6 -= 40503;
                            }
                            cArr[eVar.f2630] = cArr2[0];
                            cArr[eVar.f2630 + 1] = cArr2[1];
                            eVar.f2630 += 2;
                        }
                        objArr2[0] = new java.lang.String(cArr, 0, i4);
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        getHighSpeedVideoSizes = (getOutputFormats + 59) % 128;
                        try {
                            com.gemalto.mfs.mwsdk.payment.engine.QRCodePaymentServiceListener qRCodePaymentServiceListener = (com.gemalto.mfs.mwsdk.payment.engine.QRCodePaymentServiceListener) util.h.xy.bq.mb.this.getPaymentServiceListener();
                            java.lang.Object[] objArr2 = new java.lang.Object[1];
                            getHighSpeedVideoSizes("ꐣ\udcf1誙㎬", 3 - android.widget.ExpandableListView.getPackedPositionChild(0L), objArr2);
                            java.lang.String intern = ((java.lang.String) objArr2[0]).intern();
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            getHighSpeedVideoSizes("\uea1a풓櫛잷悍颒㎿蹔窮ﾭ\udb1a壧㼊臡", 12 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), objArr3);
                            util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr3[0]).intern());
                            if (qRCodePaymentServiceListener == null) {
                                util.h.xy.bq.mb.getOutputMinFrameDuration();
                            } else {
                                int i4 = getHighSpeedVideoSizes + 111;
                                getOutputFormats = i4 % 128;
                                if (i4 % 2 == 0) {
                                    qRCodePaymentServiceListener.onError(m25432);
                                    throw new java.lang.NullPointerException();
                                }
                                qRCodePaymentServiceListener.onError(m25432);
                            }
                        } catch (java.lang.Throwable th) {
                            util.h.xy.bq.mb.getOutputMinFrameDuration();
                            th.getMessage();
                            java.lang.Object[] objArr4 = new java.lang.Object[1];
                            getHighSpeedVideoSizes("ꐣ\udcf1誙㎬", 4 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), objArr4);
                            java.lang.String intern2 = ((java.lang.String) objArr4[0]).intern();
                            java.lang.Object[] objArr5 = new java.lang.Object[1];
                            getHighSpeedVideoSizes("\uea1a풓櫛잷悍颒㎿蹔窮ﾭ\udb1a壧䜠储", android.view.Gravity.getAbsoluteGravity(0, 0) + 14, objArr5);
                            util.h.xy.am.ma.m25027(intern2, ((java.lang.String) objArr5[0]).intern());
                        }
                        getOutputFormats = (getHighSpeedVideoSizes + 85) % 128;
                    }
                });
                getOutputSizeshNQ4ISI = (getOutputSizes + 115) % 128;
                util.h.xy.bu.b.f1050.m25641(99);
                if (i % 2 == 0) {
                    throw new java.lang.ArithmeticException();
                }
                return;
            }
            int i4 = getOutputSizeshNQ4ISI + 61;
            getOutputSizes = i4 % 128;
            if (i4 % 2 == 0) {
                util.h.xy.bu.c.f1051.m25652();
                util.h.xy.bo.a.m25519(m25521);
                throw null;
            }
            util.h.xy.bu.c.f1051.m25652();
            com.gemalto.mfs.mwsdk.payment.engine.qrcode.QRCodeData m25519 = util.h.xy.bo.a.m25519(m25521);
            if (m25519 == null) {
                getOutputSizeshNQ4ISI = (getOutputSizes + 9) % 128;
                com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode paymentServiceErrorCode = com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.QR_CODE_OUTPUT_INVALID;
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoSizes("幍㶨帜昵\ud9b2틾렝ᓽ\ue232雘ﱈ傎☉嫭ど鳿橝ỵ瑾\ud8ae깣\ue283ꠉ擞\uf26bꚝ\uec01ꂇ㙉", (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr2);
                final com.gemalto.mfs.mwsdk.sdkconfig.SDKError<com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode> m254342 = util.h.xy.bf.mc.m25434(paymentServiceErrorCode, ((java.lang.String) objArr2[0]).intern());
                util.h.xy.ag.a.m24556().m24557(new java.lang.Runnable() { // from class: util.h.xy.bq.mb.8
                    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
                    private static int getHighSpeedVideoFpsRanges = 0;
                    private static int getHighSpeedVideoSizes = 0;
                    private static char getHighSpeedVideoSizesFor = 28661;
                    private static char getInputFormats = 17122;
                    private static char getInputSizeshNQ4ISI = 5572;
                    private static int getOutputFormats = 1;
                    private static char getOutputMinFrameDuration = 30598;

                    private static void getHighSpeedVideoSizes(java.lang.String str, int i42, java.lang.Object[] objArr22) {
                        int i5 = getHighResolutionOutputSizeshNQ4ISI + 73;
                        getHighSpeedVideoFpsRanges = i5 % 128;
                        if (i5 % 2 != 0) {
                            throw new java.lang.ArithmeticException();
                        }
                        char[] charArray = str.toCharArray();
                        util.h.xz.b.e eVar = new util.h.xz.b.e();
                        char[] cArr = new char[charArray.length];
                        eVar.f2630 = 0;
                        char[] cArr2 = new char[2];
                        while (eVar.f2630 < charArray.length) {
                            cArr2[0] = charArray[eVar.f2630];
                            cArr2[1] = charArray[eVar.f2630 + 1];
                            int i6 = 58224;
                            for (int i7 = 0; i7 < 16; i7++) {
                                getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 17) % 128;
                                char c = cArr2[1];
                                char c2 = cArr2[0];
                                char c3 = (char) (c - (((c2 + i6) ^ ((c2 << 4) + ((char) (getInputSizeshNQ4ISI ^ 3155153533016530592L)))) ^ ((c2 >>> 5) + ((char) (getOutputMinFrameDuration ^ 3155153533016530592L)))));
                                cArr2[1] = c3;
                                cArr2[0] = (char) (c2 - ((((c3 << 4) + ((char) (getInputFormats ^ 3155153533016530592L))) ^ (c3 + i6)) ^ ((c3 >>> 5) + ((char) (getHighSpeedVideoSizesFor ^ 3155153533016530592L)))));
                                i6 -= 40503;
                            }
                            cArr[eVar.f2630] = cArr2[0];
                            cArr[eVar.f2630 + 1] = cArr2[1];
                            eVar.f2630 += 2;
                        }
                        objArr22[0] = new java.lang.String(cArr, 0, i42);
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        getHighSpeedVideoSizes = (getOutputFormats + 59) % 128;
                        try {
                            com.gemalto.mfs.mwsdk.payment.engine.QRCodePaymentServiceListener qRCodePaymentServiceListener = (com.gemalto.mfs.mwsdk.payment.engine.QRCodePaymentServiceListener) util.h.xy.bq.mb.this.getPaymentServiceListener();
                            java.lang.Object[] objArr22 = new java.lang.Object[1];
                            getHighSpeedVideoSizes("ꐣ\udcf1誙㎬", 3 - android.widget.ExpandableListView.getPackedPositionChild(0L), objArr22);
                            java.lang.String intern = ((java.lang.String) objArr22[0]).intern();
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            getHighSpeedVideoSizes("\uea1a풓櫛잷悍颒㎿蹔窮ﾭ\udb1a壧㼊臡", 12 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), objArr3);
                            util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr3[0]).intern());
                            if (qRCodePaymentServiceListener == null) {
                                util.h.xy.bq.mb.getOutputMinFrameDuration();
                            } else {
                                int i42 = getHighSpeedVideoSizes + 111;
                                getOutputFormats = i42 % 128;
                                if (i42 % 2 == 0) {
                                    qRCodePaymentServiceListener.onError(m254342);
                                    throw new java.lang.NullPointerException();
                                }
                                qRCodePaymentServiceListener.onError(m254342);
                            }
                        } catch (java.lang.Throwable th) {
                            util.h.xy.bq.mb.getOutputMinFrameDuration();
                            th.getMessage();
                            java.lang.Object[] objArr4 = new java.lang.Object[1];
                            getHighSpeedVideoSizes("ꐣ\udcf1誙㎬", 4 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), objArr4);
                            java.lang.String intern2 = ((java.lang.String) objArr4[0]).intern();
                            java.lang.Object[] objArr5 = new java.lang.Object[1];
                            getHighSpeedVideoSizes("\uea1a풓櫛잷悍颒㎿蹔窮ﾭ\udb1a壧䜠储", android.view.Gravity.getAbsoluteGravity(0, 0) + 14, objArr5);
                            util.h.xy.am.ma.m25027(intern2, ((java.lang.String) objArr5[0]).intern());
                        }
                        getOutputFormats = (getHighSpeedVideoSizes + 85) % 128;
                    }
                });
                getOutputSizeshNQ4ISI = (getOutputSizes + 115) % 128;
                util.h.xy.bu.b.f1050.m25641(99);
            } else {
                mbVar.m25553(m25519);
                if (util.h.xy.bf.mb.f938.m25426() != null) {
                    util.h.xy.bf.mb.f938.m25426().m25390(true);
                }
                final com.gemalto.mfs.mwsdk.payment.engine.TransactionContext m25641 = util.h.xy.bu.b.f1050.m25641(100);
                util.h.xy.ag.a.m24556().m24557(new java.lang.Runnable() { // from class: util.h.xy.bq.mb.2
                    private static int Camera2StreamConfigurationMap = 0;
                    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
                    private static int getHighSpeedVideoFpsRangesFor = 0;
                    private static int getInputSizeshNQ4ISI = 1;
                    private static char[] getOutputFormats = {42246, 42476, 42482, 42476, 42356, 42252, 42253, 42252, 42262, 42260, 42339, 42269, 42252, 42259, 42252, 42257, 42270, 42367, 42262, 42252, 42253, 42252, 42262, 42260, 42339, 42269, 42252, 42259, 42252, 42257, 42270};

                    private static void getHighSpeedVideoFpsRangesFor(int[] iArr, java.lang.String str, java.lang.Object[] objArr3) {
                        byte[] bytes = str.getBytes("ISO-8859-1");
                        util.h.xz.b.ma maVar = new util.h.xz.b.ma();
                        int i5 = iArr[0];
                        int i6 = iArr[1];
                        int i7 = iArr[2];
                        int i8 = iArr[3];
                        char[] cArr = getOutputFormats;
                        if (cArr != null) {
                            int length = cArr.length;
                            char[] cArr2 = new char[length];
                            for (int i9 = 0; i9 < length; i9++) {
                                cArr2[i9] = (char) (cArr[i9] ^ (-8125198844289309347L));
                            }
                            cArr = cArr2;
                        }
                        char[] cArr3 = new char[i6];
                        java.lang.System.arraycopy(cArr, i5, cArr3, 0, i6);
                        if (bytes != null) {
                            Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 17) % 128;
                            char[] cArr4 = new char[i6];
                            maVar.f2631 = 0;
                            char c = 0;
                            while (maVar.f2631 < i6) {
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
                        if (i8 > 0) {
                            Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 27) % 128;
                            char[] cArr5 = new char[i6];
                            java.lang.System.arraycopy(cArr3, 0, cArr5, 0, i6);
                            int i10 = i6 - i8;
                            java.lang.System.arraycopy(cArr5, 0, cArr3, i10, i8);
                            java.lang.System.arraycopy(cArr5, i8, cArr3, 0, i10);
                        }
                        char[] cArr6 = new char[i6];
                        maVar.f2631 = 0;
                        while (maVar.f2631 < i6) {
                            cArr6[maVar.f2631] = cArr3[(i6 - maVar.f2631) - 1];
                            maVar.f2631++;
                        }
                        if (i7 > 0) {
                            Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 85) % 128;
                            maVar.f2631 = 0;
                            while (maVar.f2631 < i6) {
                                cArr6[maVar.f2631] = (char) (cArr6[maVar.f2631] - iArr[2]);
                                maVar.f2631++;
                            }
                        }
                        objArr3[0] = new java.lang.String(cArr6);
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            com.gemalto.mfs.mwsdk.payment.engine.QRCodePaymentServiceListener qRCodePaymentServiceListener = (com.gemalto.mfs.mwsdk.payment.engine.QRCodePaymentServiceListener) util.h.xy.bq.mb.this.getPaymentServiceListener();
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor(new int[]{0, 4, 99, 0}, "\u0000\u0000\u0001\u0000", objArr3);
                            java.lang.String intern = ((java.lang.String) objArr3[0]).intern();
                            java.lang.Object[] objArr4 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor(new int[]{4, 13, 0, 0}, "\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001", objArr4);
                            util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr4[0]).intern());
                            if (qRCodePaymentServiceListener == null) {
                                util.h.xy.bq.mb.getOutputMinFrameDuration();
                            } else {
                                getInputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 11) % 128;
                                qRCodePaymentServiceListener.onDataReadyForPayment(util.h.xy.bq.mb.this, m25641);
                                getInputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 45) % 128;
                            }
                            getHighSpeedVideoFpsRangesFor = (getInputSizeshNQ4ISI + 93) % 128;
                        } catch (java.lang.Throwable th) {
                            util.h.xy.bq.mb.getOutputMinFrameDuration();
                            th.getMessage();
                            java.lang.Object[] objArr5 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor(new int[]{0, 4, 99, 0}, "\u0000\u0000\u0001\u0000", objArr5);
                            java.lang.String intern2 = ((java.lang.String) objArr5[0]).intern();
                            java.lang.Object[] objArr6 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor(new int[]{17, 14, 0, 0}, "\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001", objArr6);
                            util.h.xy.am.ma.m25027(intern2, ((java.lang.String) objArr6[0]).intern());
                        }
                    }
                });
                int i5 = getOutputSizeshNQ4ISI + 113;
                getOutputSizes = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }
        } else if (paymentType == com.gemalto.mfs.mwsdk.dcm.PaymentType.DSRP) {
            try {
                m25545 = util.h.xy.bp.ra.m25545(util.h.xy.bu.c.f1051.m25654());
                util.h.xy.bu.c.f1051.m25649();
                m245542 = util.h.xy.af.mb.m24551().m24554();
            } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused) {
                com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode paymentServiceErrorCode2 = com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.REMOTE_PAYMENT_OUTPUT_INVALID;
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighSpeedVideoSizes("ꬴ禎ꭦத\u2e6eᔲ헁\ue30dᝐ儢醜Ꜣ퍵鴎巡欧齪\ud913ᦼ⼶嬕╣얍錂܍慴臜坜쌻굃䷬᭴輥\ue94b\u09b5\udf76", android.view.ViewConfiguration.getDoubleTapTimeout() >> 16, objArr3);
                mbVar.Camera2StreamConfigurationMap(util.h.xy.bf.mc.m25434(paymentServiceErrorCode2, ((java.lang.String) objArr3[0]).intern()));
                util.h.xy.bu.b.f1050.m25641(99);
                if (i % 2 == 0) {
                }
            }
            if (m245542 != -91) {
                mbVar.Camera2StreamConfigurationMap(util.h.xy.bf.mc.m25432(m245542));
                util.h.xy.bu.b.f1050.m25641(99);
                if (i % 2 == 0) {
                }
            } else {
                com.gemalto.mfs.mwsdk.payment.engine.remote.RemotePaymentOutputData m25543 = util.h.xy.bp.ra.m25543(m25545);
                if (m25543 == null) {
                    int i6 = getOutputSizes + 121;
                    getOutputSizeshNQ4ISI = i6 % 128;
                    if (i6 % 2 != 0) {
                        com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode paymentServiceErrorCode3 = com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.REMOTE_PAYMENT_OUTPUT_INVALID;
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        getHighSpeedVideoSizes("ꬴ禎ꭦத\u2e6eᔲ헁\ue30dᝐ儢醜Ꜣ퍵鴎巡欧齪\ud913ᦼ⼶嬕╣얍錂܍慴臜坜쌻굃䷬᭴輥\ue94b\u09b5\udf76", android.view.KeyEvent.getMaxKeyCode() / 54, objArr4);
                        mbVar.Camera2StreamConfigurationMap(util.h.xy.bf.mc.m25434(paymentServiceErrorCode3, ((java.lang.String) objArr4[0]).intern()));
                        util.h.xy.bu.b.f1050.m25641(80);
                    } else {
                        com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode paymentServiceErrorCode4 = com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.REMOTE_PAYMENT_OUTPUT_INVALID;
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        getHighSpeedVideoSizes("ꬴ禎ꭦத\u2e6eᔲ헁\ue30dᝐ儢醜Ꜣ퍵鴎巡欧齪\ud913ᦼ⼶嬕╣얍錂܍慴臜坜쌻굃䷬᭴輥\ue94b\u09b5\udf76", android.view.KeyEvent.getMaxKeyCode() >> 16, objArr5);
                        mbVar.Camera2StreamConfigurationMap(util.h.xy.bf.mc.m25434(paymentServiceErrorCode4, ((java.lang.String) objArr5[0]).intern()));
                        util.h.xy.bu.b.f1050.m25641(99);
                    }
                } else {
                    mbVar.m25554(m25543);
                    if (util.h.xy.bf.mb.f938.m25426() != null) {
                        getOutputSizes = (getOutputSizeshNQ4ISI + 121) % 128;
                        util.h.xy.bf.mb.f938.m25426().m25390(true);
                    }
                    final com.gemalto.mfs.mwsdk.payment.engine.TransactionContext m256412 = util.h.xy.bu.b.f1050.m25641(100);
                    util.h.xy.ag.a.m24556().m24557(new java.lang.Runnable() { // from class: util.h.xy.bq.mb.6
                        private static int Camera2StreamConfigurationMap = 1;
                        private static int getHighSpeedVideoFpsRanges = 0;
                        private static int getHighSpeedVideoSizes = 0;
                        private static int getInputSizeshNQ4ISI = 1;
                        private static int[] getOutputFormats = {-1933803767, -203278242, -1361939964, 1052335292, 394922404, -754324949, 480918474, 1050551194, -1102577483, 1334710433, 1259266968, 1883224272, 1813530156, -742574764, -1637375585, -421689227, -30232367, -1598779581};

                        private static void getHighResolutionOutputSizeshNQ4ISI(int[] iArr, int i7, java.lang.Object[] objArr6) {
                            int i8;
                            int length;
                            int[] iArr2;
                            int i9;
                            int i10;
                            util.h.xz.b.c cVar = new util.h.xz.b.c();
                            char[] cArr = new char[4];
                            int i11 = 2;
                            char[] cArr2 = new char[iArr.length * 2];
                            int[] iArr3 = getOutputFormats;
                            if (iArr3 != null) {
                                int length2 = iArr3.length;
                                int[] iArr4 = new int[length2];
                                for (int i12 = 0; i12 < length2; i12++) {
                                    getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 31) % 128;
                                    iArr4[i12] = (int) (iArr3[i12] ^ (-5569649899877129369L));
                                }
                                iArr3 = iArr4;
                            }
                            int length3 = iArr3.length;
                            int[] iArr5 = new int[length3];
                            int[] iArr6 = getOutputFormats;
                            if (iArr6 != null) {
                                int i13 = getHighSpeedVideoSizes + 9;
                                Camera2StreamConfigurationMap = i13 % 128;
                                if (i13 % 2 == 0) {
                                    length = iArr6.length;
                                    iArr2 = new int[length];
                                    i9 = 1;
                                } else {
                                    length = iArr6.length;
                                    iArr2 = new int[length];
                                    i9 = 0;
                                }
                                while (i9 < length) {
                                    int i14 = getHighSpeedVideoSizes + 117;
                                    Camera2StreamConfigurationMap = i14 % 128;
                                    if (i14 % i11 == 0) {
                                        i10 = length3;
                                        iArr2[i9] = (int) (iArr6[i9] ^ (-5569649899877129369L));
                                        i9 = 0;
                                    } else {
                                        i10 = length3;
                                        iArr2[i9] = (int) (iArr6[i9] ^ (-5569649899877129369L));
                                        i9++;
                                    }
                                    length3 = i10;
                                    i11 = 2;
                                }
                                i8 = length3;
                                iArr6 = iArr2;
                            } else {
                                i8 = length3;
                            }
                            java.lang.System.arraycopy(iArr6, 0, iArr5, 0, i8);
                            cVar.f2626 = 0;
                            int i15 = Camera2StreamConfigurationMap + 65;
                            getHighSpeedVideoSizes = i15 % 128;
                            if (i15 % 2 != 0) {
                                int i16 = 2 / 4;
                            }
                            while (cVar.f2626 < iArr.length) {
                                getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 7) % 128;
                                cArr[0] = (char) (iArr[cVar.f2626] >> 16);
                                cArr[1] = (char) iArr[cVar.f2626];
                                cArr[2] = (char) (iArr[cVar.f2626 + 1] >> 16);
                                cArr[3] = (char) iArr[cVar.f2626 + 1];
                                cVar.f2627 = (cArr[0] << 16) + cArr[1];
                                cVar.f2625 = (cArr[2] << 16) + cArr[3];
                                util.h.xz.b.c.m27723(iArr5);
                                for (int i17 = 0; i17 < 16; i17++) {
                                    cVar.f2627 ^= iArr5[i17];
                                    cVar.f2625 = util.h.xz.b.c.m27724(cVar.f2627) ^ cVar.f2625;
                                    int i18 = cVar.f2627;
                                    cVar.f2627 = cVar.f2625;
                                    cVar.f2625 = i18;
                                }
                                int i19 = cVar.f2627;
                                cVar.f2627 = cVar.f2625;
                                cVar.f2625 = i19;
                                cVar.f2625 ^= iArr5[16];
                                cVar.f2627 ^= iArr5[17];
                                int i20 = cVar.f2627;
                                int i21 = cVar.f2625;
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
                            objArr6[0] = new java.lang.String(cArr2, 0, i7);
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            getInputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 103) % 128;
                            try {
                                com.gemalto.mfs.mwsdk.payment.engine.RemotePaymentServiceListener remotePaymentServiceListener = (com.gemalto.mfs.mwsdk.payment.engine.RemotePaymentServiceListener) util.h.xy.bq.mb.this.getPaymentServiceListener();
                                java.lang.Object[] objArr6 = new java.lang.Object[1];
                                getHighResolutionOutputSizeshNQ4ISI(new int[]{1549017954, -2111646533}, 3 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr6);
                                java.lang.String intern = ((java.lang.String) objArr6[0]).intern();
                                java.lang.Object[] objArr7 = new java.lang.Object[1];
                                getHighResolutionOutputSizeshNQ4ISI(new int[]{-17092677, -1494262717, 319224799, -862640633, -1539083208, -2106621383, 1934770905, -1584327044}, (android.view.ViewConfiguration.getTapTimeout() >> 16) + 15, objArr7);
                                util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr7[0]).intern());
                                if (remotePaymentServiceListener != null) {
                                    remotePaymentServiceListener.onDataReadyForPayment(util.h.xy.bq.mb.this, m256412);
                                } else {
                                    util.h.xy.bq.mb.getOutputMinFrameDuration();
                                    getInputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 89) % 128;
                                }
                            } catch (java.lang.Throwable th) {
                                util.h.xy.bq.mb.getOutputMinFrameDuration();
                                th.getMessage();
                                java.lang.Object[] objArr8 = new java.lang.Object[1];
                                getHighResolutionOutputSizeshNQ4ISI(new int[]{1549017954, -2111646533}, android.graphics.Color.rgb(0, 0, 0) + 16777220, objArr8);
                                java.lang.String intern2 = ((java.lang.String) objArr8[0]).intern();
                                java.lang.Object[] objArr9 = new java.lang.Object[1];
                                getHighResolutionOutputSizeshNQ4ISI(new int[]{-17092677, -1494262717, 319224799, -862640633, -1539083208, -2106621383, -1674177350, 1813651122}, 16 - (android.view.KeyEvent.getMaxKeyCode() >> 16), objArr9);
                                util.h.xy.am.ma.m25027(intern2, ((java.lang.String) objArr9[0]).intern());
                            }
                        }
                    });
                    int i7 = getOutputSizes + 103;
                    getOutputSizeshNQ4ISI = i7 % 128;
                    if (i7 % 2 != 0) {
                        throw null;
                    }
                }
            }
        }
        if (deviceCVMVerifyListener != null) {
            getOutputSizes = (getOutputSizeshNQ4ISI + 47) % 128;
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            Camera2StreamConfigurationMap("\u0002\u0006\uffff\ufff9", android.text.TextUtils.getCapsMode("", 0, 0) + 4, android.widget.ExpandableListView.getPackedPositionType(0L) + 4, 228 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), objArr6);
            java.lang.String intern = ((java.lang.String) objArr6[0]).intern();
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            getHighSpeedVideoSizes("鬸ﲝ魼ﰓ\ude30Ꮪ≋፯✆埁晈坭\ue34b鯵ꨕ魓꽞\udffa", ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1, objArr7);
            util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr7[0]).intern());
            deviceCVMVerifyListener.onVerifySuccess();
        }
        if (i % 2 == 0) {
        }
    }

    static /* synthetic */ util.h.xy.aa.mc getHighSpeedVideoSizes(util.h.xy.bq.mb mbVar) {
        int i = getOutputSizes;
        int i2 = i + 107;
        getOutputSizeshNQ4ISI = i2 % 128;
        util.h.xy.aa.mc mcVar = mbVar.isOutputSupportedFor;
        if (i2 % 2 != 0) {
            throw null;
        }
        getOutputSizeshNQ4ISI = (i + 119) % 128;
        return mcVar;
    }

    static /* synthetic */ java.lang.String getOutputMinFrameDuration() {
        int i = getOutputSizeshNQ4ISI;
        getOutputSizes = (i + 95) % 128;
        java.lang.String str = getOutputFormats;
        getOutputSizes = (i + 5) % 128;
        return str;
    }

    static {
        getInputFormats();
        getHighSpeedVideoSizesFor();
        getHighSpeedVideoSizes();
        getOutputFormats = util.h.xy.bq.mb.class.getName();
        int i = getOutputSizeshNQ4ISI + 35;
        getOutputSizes = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public mb(com.gemalto.mfs.mwsdk.payment.PaymentServiceListener paymentServiceListener, util.h.xy.bw.mb mbVar, com.gemalto.mfs.mwsdk.payment.CHVerificationMethod cHVerificationMethod, boolean z) {
        super(paymentServiceListener, mbVar, z);
        this.getValidOutputFormatsForInputhNQ4ISI = false;
        this.isOutputSupportedFor = null;
        this.f990 = cHVerificationMethod;
    }

    private static void getHighSpeedVideoSizes(java.lang.String str, char c, int i, java.lang.String str2, java.lang.String str3, java.lang.Object[] objArr) {
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
        cArr2[2] = (char) (cArr2[2] + ((char) i));
        int length3 = charArray3.length;
        char[] cArr3 = new char[length3];
        rcVar.f2652 = 0;
        while (rcVar.f2652 < length3) {
            int i2 = (rcVar.f2652 + 2) % 4;
            int i3 = (rcVar.f2652 + 3) % 4;
            rcVar.f2653 = (char) (((cArr[rcVar.f2652 % 4] * 32718) + cArr2[i2]) % 65535);
            cArr2[i3] = (char) (((cArr[i3] * 32718) + cArr2[i2]) / 65535);
            cArr[i3] = rcVar.f2653;
            cArr3[rcVar.f2652] = (char) ((((cArr[i3] ^ charArray3[rcVar.f2652]) ^ (getOutputStallDurationlomOqCM ^ 2457411417541981002L)) ^ ((int) (getInputSizeshNQ4ISI ^ 2457411417541981002L))) ^ ((char) (getOutputMinFrameDurationlomOqCM ^ 2457411417541981002L)));
            rcVar.f2652++;
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    private static void Camera2StreamConfigurationMap(java.lang.String str, int i, int i2, int i3, java.lang.Object[] objArr) {
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 93) % 128;
        char[] charArray = str.toCharArray();
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 73) % 128;
        char[] cArr = charArray;
        util.h.xz.b.ra raVar = new util.h.xz.b.ra();
        char[] cArr2 = new char[i];
        raVar.f2649 = 0;
        int i4 = getHighSpeedVideoFpsRangesFor + 51;
        getHighSpeedVideoSizes = i4 % 128;
        int i5 = i4 % 2;
        while (raVar.f2649 < i) {
            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 59) % 128;
            raVar.f2650 = cArr[raVar.f2649];
            cArr2[raVar.f2649] = (char) (raVar.f2650 + i3);
            int i6 = raVar.f2649;
            cArr2[i6] = (char) (cArr2[i6] - ((int) (getInputFormats ^ (-4839292868003314026L))));
            raVar.f2649++;
        }
        if (i2 > 0) {
            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 67) % 128;
            raVar.f2648 = i2;
            char[] cArr3 = new char[i];
            java.lang.System.arraycopy(cArr2, 0, cArr3, 0, i);
            java.lang.System.arraycopy(cArr3, 0, cArr2, i - raVar.f2648, raVar.f2648);
            java.lang.System.arraycopy(cArr3, raVar.f2648, cArr2, 0, i - raVar.f2648);
        }
        objArr[0] = new java.lang.String(cArr2);
    }

    @Override // util.h.xy.bq.a
    @util.h.xy.a.a
    final java.lang.Object Camera2StreamConfigurationMap(com.gemalto.mfs.mwsdk.payment.CHVerificationMethod cHVerificationMethod) {
        int i = getOutputSizeshNQ4ISI + 39;
        getOutputSizes = i % 128;
        if (i % 2 != 0) {
            if (!this.getValidOutputFormatsForInputhNQ4ISI) {
                com.gemalto.mfs.mwsdk.payment.PaymentServiceListener paymentServiceListener = getPaymentServiceListener();
                com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode paymentServiceErrorCode = com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.OPERATION_NOT_ALLOWED;
                java.lang.Object[] objArr = new java.lang.Object[1];
                Camera2StreamConfigurationMap("\u001e\b\u0010\u001b\u0010\u0015\u000eￇ\r\u0016\u0019ￇ\u001b\u000f\fￇ\n\u001d\u0014ￇ\u0010\u0015\u0017\u001c\u001bￕ\ufffb\u000f\fￇ\ufffa￫\ufff2ￇ\u0010\u001aￇ\u0015\u0016\u001bￇ", 40 - android.view.MotionEvent.axisFromString(""), 25 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), 242 - android.widget.ExpandableListView.getPackedPositionChild(0L), objArr);
                util.h.xy.bf.ma.m25415(paymentServiceListener, paymentServiceErrorCode, ((java.lang.String) objArr[0]).intern());
                int i2 = getOutputSizes + 1;
                getOutputSizeshNQ4ISI = i2 % 128;
                int i3 = i2 % 2;
            }
            if (com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.BIOMETRICS != cHVerificationMethod && com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.DEVICE_KEYGUARD != cHVerificationMethod) {
                return null;
            }
            util.h.xy.aa.c cVar = new util.h.xy.aa.c() { // from class: util.h.xy.bq.mb.1
                private static int Camera2StreamConfigurationMap = 1;
                private static int getHighResolutionOutputSizeshNQ4ISI = 0;
                private static int getHighSpeedVideoFpsRanges = 1;
                private static int getHighSpeedVideoSizes = 0;
                private static long getOutputMinFrameDuration = -2809521532071395280L;

                private static void getHighSpeedVideoFpsRanges(java.lang.String str, int i4, java.lang.Object[] objArr2) {
                    int i5 = getHighSpeedVideoFpsRanges + 13;
                    getHighResolutionOutputSizeshNQ4ISI = i5 % 128;
                    if (i5 % 2 != 0) {
                        throw new java.lang.ArithmeticException();
                    }
                    char[] charArray = str.toCharArray();
                    getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 119) % 128;
                    util.h.xz.b.a aVar = new util.h.xz.b.a();
                    char[] m27721 = util.h.xz.b.a.m27721(getOutputMinFrameDuration ^ 7817488252581312552L, charArray, i4);
                    aVar.f2623 = 4;
                    while (aVar.f2623 < m27721.length) {
                        getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 1) % 128;
                        aVar.f2624 = aVar.f2623 - 4;
                        m27721[aVar.f2623] = (char) ((m27721[aVar.f2623] ^ m27721[aVar.f2623 % 4]) ^ (aVar.f2624 * (getOutputMinFrameDuration ^ 7817488252581312552L)));
                        aVar.f2623++;
                    }
                    objArr2[0] = new java.lang.String(m27721, 4, m27721.length - 4);
                }

                /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
                
                    if (util.h.xy.bq.mb.getHighSpeedVideoSizes(r2.getHighSpeedVideoFpsRangesFor).m24523() == null) goto L11;
                 */
                @Override // util.h.xy.aa.c
                /* renamed from: ˏ */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void mo24518(boolean z, long j) {
                    if (util.h.xy.bq.mb.getHighSpeedVideoSizes(util.h.xy.bq.mb.this) != null) {
                        int i4 = getHighSpeedVideoSizes + 27;
                        Camera2StreamConfigurationMap = i4 % 128;
                        if (i4 % 2 == 0) {
                            util.h.xy.bq.mb.getHighSpeedVideoSizes(util.h.xy.bq.mb.this).m24523();
                            throw null;
                        }
                    }
                    if (!z) {
                        return;
                    }
                    util.h.xy.bq.mb.getOutputMinFrameDuration();
                    util.h.xy.bq.mb.getOutputMinFrameDuration();
                    com.gemalto.mfs.mwsdk.payment.CHVerificationMethod cHVerificationMethod2 = util.h.xy.bq.mb.this.f990;
                    util.h.xy.bq.mb.getOutputMinFrameDuration();
                    util.h.xy.bq.mb.this.Camera2StreamConfigurationMap(z, j);
                    util.h.xy.bq.mb.getOutputMinFrameDuration();
                    Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 75) % 128;
                }

                @Override // util.h.xy.aa.c
                /* renamed from: ˋ */
                public final void mo24517() {
                    int i4 = Camera2StreamConfigurationMap + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                    getHighSpeedVideoSizes = i4 % 128;
                    if (i4 % 2 == 0) {
                        if (util.h.xy.bq.mb.getHighSpeedVideoSizes(util.h.xy.bq.mb.this) == null || util.h.xy.bq.mb.getHighSpeedVideoSizes(util.h.xy.bq.mb.this).m24523() == null) {
                            util.h.xy.bq.mb.getOutputMinFrameDuration();
                            return;
                        }
                        getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 87) % 128;
                        util.h.xy.bq.mb.getOutputMinFrameDuration();
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRanges("䗌흅疁䖀\uef0dᮃ\u05f8뎈", 1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr2);
                        java.lang.String intern = ((java.lang.String) objArr2[0]).intern();
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRanges("뇥ꢶᔤ놡郯ⵆ敇蔠凁낍䗢ꖢ焋倬▂䐈", android.graphics.ImageFormat.getBitsPerPixel(0) + 1, objArr3);
                        util.h.xy.am.ma.m25029(intern, ((java.lang.String) objArr3[0]).intern());
                        util.h.xy.bq.mb.getHighSpeedVideoSizes(util.h.xy.bq.mb.this).m24523().onVerifyFailed();
                        return;
                    }
                    util.h.xy.bq.mb.getHighSpeedVideoSizes(util.h.xy.bq.mb.this);
                    throw null;
                }
            };
            if (com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.BIOMETRICS == cHVerificationMethod) {
                util.h.xy.bw.mb mbVar = m25549();
                util.h.xy.aa.mb.ra raVar = new util.h.xy.aa.mb.ra() { // from class: util.h.xy.bq.mb.4
                    private static int Camera2StreamConfigurationMap = 1;
                    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
                    private static int getHighSpeedVideoFpsRanges;
                    private static int getHighSpeedVideoSizesFor;
                    private static char[] getHighSpeedVideoSizes = {41970, 41968, 41868, 41971, 41882, 41983, 41969, 41866, 41982, 41871, 41872, 41876, 41887, 41880, 41877, 41881};
                    private static char getOutputMinFrameDuration = 38466;

                    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x0044  */
                    @Override // util.h.xy.aa.mb.ra
                    /* renamed from: ˊ */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void mo24519(int i4, java.lang.CharSequence charSequence) {
                        if (util.h.xy.bq.mb.getHighSpeedVideoSizes(util.h.xy.bq.mb.this) != null) {
                            Camera2StreamConfigurationMap = (getHighSpeedVideoSizesFor + 59) % 128;
                            if (util.h.xy.bq.mb.getHighSpeedVideoSizes(util.h.xy.bq.mb.this).m24523() != null) {
                                Camera2StreamConfigurationMap = (getHighSpeedVideoSizesFor + 39) % 128;
                                util.h.xy.bq.mb.getOutputMinFrameDuration();
                                util.h.xy.bq.mb.getHighSpeedVideoSizes(util.h.xy.bq.mb.this).m24523();
                                if (util.h.xy.bq.mb.getHighSpeedVideoSizes(util.h.xy.bq.mb.this) == null) {
                                    getHighSpeedVideoSizesFor = (Camera2StreamConfigurationMap + 13) % 128;
                                    if (util.h.xy.bq.mb.getHighSpeedVideoSizes(util.h.xy.bq.mb.this).m24523() != null) {
                                        util.h.xy.v.mc mcVar = new util.h.xy.v.mc(java.lang.Integer.valueOf(i4), charSequence.toString());
                                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                                        getHighSpeedVideoFpsRanges((byte) (115 - android.view.KeyEvent.keyCodeFromString("")), "\u000e\u0006\u000f\r", 3 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr2);
                                        java.lang.String intern = ((java.lang.String) objArr2[0]).intern();
                                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                                        getHighSpeedVideoFpsRanges((byte) (114 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), "\u000e\r\u0001\n\u0001\f\u000f\u0004\b\u0002\u0005\u0004㙑", 13 - android.text.TextUtils.indexOf("", "", 0), objArr3);
                                        util.h.xy.am.ma.m25029(intern, ((java.lang.String) objArr3[0]).intern());
                                        util.h.xy.bq.mb.getHighSpeedVideoSizes(util.h.xy.bq.mb.this).m24523().onVerifyError(mcVar);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                        }
                        util.h.xy.bq.mb.getOutputMinFrameDuration();
                        getHighSpeedVideoSizesFor = (Camera2StreamConfigurationMap + 71) % 128;
                        if (util.h.xy.bq.mb.getHighSpeedVideoSizes(util.h.xy.bq.mb.this) == null) {
                        }
                    }

                    @Override // util.h.xy.aa.mb.ra
                    /* renamed from: ˎ */
                    public final void mo24521(int i4, java.lang.CharSequence charSequence) {
                        int i5 = Camera2StreamConfigurationMap + 57;
                        getHighSpeedVideoSizesFor = i5 % 128;
                        if (i5 % 2 != 0) {
                            util.h.xy.bq.mb.getHighSpeedVideoSizes(util.h.xy.bq.mb.this);
                            throw new java.lang.ArithmeticException();
                        }
                        if (util.h.xy.bq.mb.getHighSpeedVideoSizes(util.h.xy.bq.mb.this) == null || util.h.xy.bq.mb.getHighSpeedVideoSizes(util.h.xy.bq.mb.this).m24523() == null) {
                            util.h.xy.bq.mb.getOutputMinFrameDuration();
                        } else {
                            getHighSpeedVideoSizesFor = (Camera2StreamConfigurationMap + 59) % 128;
                            util.h.xy.bq.mb.getOutputMinFrameDuration();
                            util.h.xy.bq.mb.getHighSpeedVideoSizes(util.h.xy.bq.mb.this).m24523();
                        }
                        if (util.h.xy.bq.mb.getHighSpeedVideoSizes(util.h.xy.bq.mb.this) != null) {
                            getHighSpeedVideoSizesFor = (Camera2StreamConfigurationMap + 23) % 128;
                            if (util.h.xy.bq.mb.getHighSpeedVideoSizes(util.h.xy.bq.mb.this).m24523() != null) {
                                Camera2StreamConfigurationMap = (getHighSpeedVideoSizesFor + 115) % 128;
                                java.lang.Object[] objArr2 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRanges((byte) (115 - (android.view.ViewConfiguration.getScrollBarSize() >> 8)), "\u000e\u0006\u000f\r", (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 4, objArr2);
                                java.lang.String intern = ((java.lang.String) objArr2[0]).intern();
                                java.lang.Object[] objArr3 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRanges((byte) (android.graphics.Color.alpha(0) + 39), "\u000e\r\u0001\n\u0001\f\u000f\u0004\b\u0002\u0005\u0004㗹", 13 - android.view.KeyEvent.normalizeMetaState(0), objArr3);
                                util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr3[0]).intern());
                                util.h.xy.bq.mb.getHighSpeedVideoSizes(util.h.xy.bq.mb.this).m24523().onVerifyHelp(i4, charSequence);
                            }
                        }
                    }

                    @Override // util.h.xy.aa.mb.ra
                    /* renamed from: ᐝ */
                    public final void mo24522(boolean z, long j) {
                        if (util.h.xy.bq.mb.getHighSpeedVideoSizes(util.h.xy.bq.mb.this) == null || util.h.xy.bq.mb.getHighSpeedVideoSizes(util.h.xy.bq.mb.this).m24523() == null) {
                            util.h.xy.bq.mb.getOutputMinFrameDuration();
                            if (util.h.xy.bq.mb.this.f990 != null) {
                                int i4 = Camera2StreamConfigurationMap + 51;
                                getHighSpeedVideoSizesFor = i4 % 128;
                                if (i4 % 2 == 0) {
                                    util.h.xy.bq.mb.getOutputMinFrameDuration();
                                    com.gemalto.mfs.mwsdk.payment.CHVerificationMethod cHVerificationMethod2 = util.h.xy.bq.mb.this.f990;
                                } else {
                                    util.h.xy.bq.mb.getOutputMinFrameDuration();
                                    com.gemalto.mfs.mwsdk.payment.CHVerificationMethod cHVerificationMethod3 = util.h.xy.bq.mb.this.f990;
                                    throw new java.lang.ArithmeticException();
                                }
                            }
                        } else {
                            int i5 = getHighSpeedVideoSizesFor + 119;
                            Camera2StreamConfigurationMap = i5 % 128;
                            if (i5 % 2 != 0) {
                                util.h.xy.bq.mb.getOutputMinFrameDuration();
                                util.h.xy.bq.mb.getHighSpeedVideoSizes(util.h.xy.bq.mb.this).m24523();
                                if (util.h.xy.bq.mb.this.f990 != null) {
                                    util.h.xy.bq.mb.getOutputMinFrameDuration();
                                    com.gemalto.mfs.mwsdk.payment.CHVerificationMethod cHVerificationMethod4 = util.h.xy.bq.mb.this.f990;
                                }
                            } else {
                                util.h.xy.bq.mb.getOutputMinFrameDuration();
                                util.h.xy.bq.mb.getHighSpeedVideoSizes(util.h.xy.bq.mb.this).m24523();
                                com.gemalto.mfs.mwsdk.payment.CHVerificationMethod cHVerificationMethod5 = util.h.xy.bq.mb.this.f990;
                                throw new java.lang.ArithmeticException();
                            }
                        }
                        if ((util.h.xy.bq.mb.getHighSpeedVideoSizes(util.h.xy.bq.mb.this) != null && util.h.xy.bq.mb.getHighSpeedVideoSizes(util.h.xy.bq.mb.this).m24523() != null) || z) {
                            util.h.xy.bq.mb.this.Camera2StreamConfigurationMap(z, j);
                        }
                        int i6 = getHighSpeedVideoSizesFor + 113;
                        Camera2StreamConfigurationMap = i6 % 128;
                        if (i6 % 2 == 0) {
                            throw new java.lang.ArithmeticException();
                        }
                    }

                    /* JADX WARN: Removed duplicated region for block: B:10:0x008f  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x008e A[RETURN] */
                    @Override // util.h.xy.aa.mb.ra
                    /* renamed from: ˋ */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void mo24520() {
                        int i4;
                        if (util.h.xy.bq.mb.getHighSpeedVideoSizes(util.h.xy.bq.mb.this) != null) {
                            getHighSpeedVideoSizesFor = (Camera2StreamConfigurationMap + 41) % 128;
                            if (util.h.xy.bq.mb.getHighSpeedVideoSizes(util.h.xy.bq.mb.this).m24523() != null) {
                                Camera2StreamConfigurationMap = (getHighSpeedVideoSizesFor + 63) % 128;
                                util.h.xy.bq.mb.getOutputMinFrameDuration();
                                util.h.xy.bq.mb.getHighSpeedVideoSizes(util.h.xy.bq.mb.this).m24523();
                                java.lang.Object[] objArr2 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRanges((byte) (114 - android.graphics.ImageFormat.getBitsPerPixel(0)), "\u000e\u0006\u000f\r", (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 4, objArr2);
                                java.lang.String intern = ((java.lang.String) objArr2[0]).intern();
                                java.lang.Object[] objArr3 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRanges((byte) (110 - android.text.TextUtils.getOffsetBefore("", 0)), "\u000e\r\u0001\n\u0001\f\u000f\u0004\b\u0002\u0005\u0004㙊", 13 - android.view.KeyEvent.normalizeMetaState(0), objArr3);
                                util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr3[0]).intern());
                                util.h.xy.bq.mb.getHighSpeedVideoSizes(util.h.xy.bq.mb.this).m24523().onVerifyFailed();
                                i4 = Camera2StreamConfigurationMap + 85;
                                getHighSpeedVideoSizesFor = i4 % 128;
                                if (i4 % 2 == 0) {
                                    throw new java.lang.ArithmeticException();
                                }
                                return;
                            }
                        }
                        util.h.xy.bq.mb.getOutputMinFrameDuration();
                        i4 = Camera2StreamConfigurationMap + 85;
                        getHighSpeedVideoSizesFor = i4 % 128;
                        if (i4 % 2 == 0) {
                        }
                    }

                    private static void getHighSpeedVideoFpsRanges(byte b, java.lang.String str, int i4, java.lang.Object[] objArr2) {
                        int i5;
                        getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 1) % 128;
                        char[] charArray = str.toCharArray();
                        util.h.xz.b.mc mcVar = new util.h.xz.b.mc();
                        char[] cArr = getHighSpeedVideoSizes;
                        if (cArr != null) {
                            int length = cArr.length;
                            char[] cArr2 = new char[length];
                            for (int i6 = 0; i6 < length; i6++) {
                                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 69) % 128;
                                cArr2[i6] = (char) (cArr[i6] ^ 4042185467053315654L);
                            }
                            cArr = cArr2;
                        }
                        char c = (char) (4042185467053315654L ^ getOutputMinFrameDuration);
                        char[] cArr3 = new char[i4];
                        if (i4 % 2 != 0) {
                            i5 = i4 - 1;
                            cArr3[i5] = (char) (charArray[i5] - b);
                        } else {
                            i5 = i4;
                        }
                        if (i5 > 1) {
                            mcVar.f2638 = 0;
                            while (mcVar.f2638 < i5) {
                                mcVar.f2641 = charArray[mcVar.f2638];
                                mcVar.f2636 = charArray[mcVar.f2638 + 1];
                                if (mcVar.f2641 == mcVar.f2636) {
                                    int i7 = getHighResolutionOutputSizeshNQ4ISI + 73;
                                    getHighSpeedVideoFpsRanges = i7 % 128;
                                    if (i7 % 2 != 0) {
                                        cArr3[mcVar.f2638] = (char) (mcVar.f2641 << b);
                                        cArr3[mcVar.f2638 >>> 1] = (char) (mcVar.f2636 % b);
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
                                        int i8 = mcVar.f2639;
                                        int i9 = mcVar.f2640;
                                        int i10 = mcVar.f2637;
                                        int i11 = mcVar.f2635;
                                        cArr3[mcVar.f2638] = cArr[(i8 * c) + i9];
                                        cArr3[mcVar.f2638 + 1] = cArr[(i10 * c) + i11];
                                    } else if (mcVar.f2639 == mcVar.f2637) {
                                        mcVar.f2640 = ((mcVar.f2640 + c) - 1) % c;
                                        mcVar.f2635 = ((mcVar.f2635 + c) - 1) % c;
                                        int i12 = mcVar.f2639;
                                        int i13 = mcVar.f2640;
                                        int i14 = mcVar.f2637;
                                        int i15 = mcVar.f2635;
                                        cArr3[mcVar.f2638] = cArr[(i12 * c) + i13];
                                        cArr3[mcVar.f2638 + 1] = cArr[(i14 * c) + i15];
                                    } else {
                                        int i16 = mcVar.f2639;
                                        int i17 = mcVar.f2635;
                                        int i18 = mcVar.f2637;
                                        int i19 = mcVar.f2640;
                                        cArr3[mcVar.f2638] = cArr[(i16 * c) + i17];
                                        cArr3[mcVar.f2638 + 1] = cArr[(i18 * c) + i19];
                                    }
                                }
                                mcVar.f2638 += 2;
                            }
                        }
                        for (int i20 = 0; i20 < i4; i20++) {
                            cArr3[i20] = (char) (cArr3[i20] ^ 13722);
                        }
                        objArr2[0] = new java.lang.String(cArr3);
                    }
                };
                getOutputSizeshNQ4ISI = (getOutputSizes + 81) % 128;
                this.isOutputSupportedFor = (util.h.xy.aa.a) mbVar.mo25784(cHVerificationMethod, raVar, cVar);
            } else {
                this.isOutputSupportedFor = (util.h.xy.aa.rc) m25549().mo25784(cHVerificationMethod, cVar);
            }
            util.h.xy.aa.mc mcVar = this.isOutputSupportedFor;
            getOutputSizes = (getOutputSizeshNQ4ISI + 101) % 128;
            return mcVar;
        }
        throw new java.lang.ArithmeticException();
    }

    private static void getHighSpeedVideoSizes(int i, short s, byte b, int i2, int i3, java.lang.Object[] objArr) {
        util.h.xz.b.me meVar = new util.h.xz.b.me();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i4 = i2 + ((int) (getHighSpeedVideoFpsRanges ^ (-2689713159175858216L)));
        int i5 = i4 == -1 ? 1 : 0;
        if (i5 != 0) {
            byte[] bArr = toString;
            if (bArr != null) {
                int length = bArr.length;
                byte[] bArr2 = new byte[length];
                for (int i6 = 0; i6 < length; i6++) {
                    bArr2[i6] = (byte) (bArr[i6] ^ (-2689713159175858216L));
                }
                bArr = bArr2;
            }
            if (bArr != null) {
                i4 = (byte) (((byte) (toString[((int) (isOutputSupportedForhNQ4ISI ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getHighSpeedVideoFpsRanges ^ (-2689713159175858216L))));
            } else {
                i4 = (short) (((short) (getHighSpeedVideoSizesFor[((int) (isOutputSupportedForhNQ4ISI ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getHighSpeedVideoFpsRanges ^ (-2689713159175858216L))));
            }
        }
        if (i4 > 0) {
            meVar.f2647 = ((i + i4) - 2) + ((int) (isOutputSupportedForhNQ4ISI ^ (-2689713159175858216L))) + i5;
            meVar.f2644 = (char) (i3 + ((int) (getOutputMinFrameDuration ^ (-2689713159175858216L))));
            sb.append(meVar.f2644);
            meVar.f2646 = meVar.f2644;
            byte[] bArr3 = toString;
            if (bArr3 != null) {
                int length2 = bArr3.length;
                byte[] bArr4 = new byte[length2];
                for (int i7 = 0; i7 < length2; i7++) {
                    bArr4[i7] = (byte) (bArr3[i7] ^ (-2689713159175858216L));
                }
                bArr3 = bArr4;
            }
            boolean z = bArr3 != null;
            meVar.f2645 = 1;
            while (meVar.f2645 < i4) {
                if (z) {
                    byte[] bArr5 = toString;
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

    @util.h.xy.a.a
    final void Camera2StreamConfigurationMap(final boolean z, long j) {
        long j2;
        com.gemalto.mfs.mwsdk.payment.PaymentBusinessService paymentBusinessService = com.gemalto.mfs.mwsdk.payment.PaymentBusinessManager.getPaymentBusinessService();
        if (paymentBusinessService != null) {
            com.gemalto.mfs.mwsdk.payment.engine.PaymentService activatedPaymentService = paymentBusinessService.getActivatedPaymentService();
            if (activatedPaymentService == null) {
                util.h.xy.aa.mc mcVar = this.isOutputSupportedFor;
                if (mcVar == null || mcVar.m24523() == null) {
                    return;
                }
                java.lang.Object[] objArr = new java.lang.Object[1];
                Camera2StreamConfigurationMap("\uffc0\t\u0013\uffc0\u000e\u000f\uffc0\u0001\u0003\u0014\t\u0016\u0001\u0014\u0005\u0004\uffc0\u0010\u0001\u0019\r\u0005\u000e\u0014\uffc0\u0013\u0005\u0012\u0016\t\u0003\u0005\ufff4\b\u0005\u0012\u0005", 37 - android.view.KeyEvent.normalizeMetaState(0), 32 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 251 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr);
                util.h.xy.v.mc mcVar2 = new util.h.xy.v.mc(-102, ((java.lang.String) objArr[0]).intern());
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                Camera2StreamConfigurationMap("\u0002\u0006\uffff\ufff9", (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 4, (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 3, 228 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr2);
                java.lang.String intern = ((java.lang.String) objArr2[0]).intern();
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighSpeedVideoSizes("\uf79c쵄\uf7d8虭\ue9b8∃堵ⓧ䮢昘ᰶ惥迯ꨬ큫곚쏭\uee20鐆\ue8c1", android.view.View.getDefaultSize(0, 0), objArr3);
                util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr3[0]).intern());
                this.isOutputSupportedFor.m24523().onVerifyError(mcVar2);
                return;
            }
            if (j == -1) {
                int i = getOutputSizeshNQ4ISI + 71;
                getOutputSizes = i % 128;
                if (i % 2 == 0) {
                    throw null;
                }
                j2 = f987;
            } else if (j >= 0) {
                long currentTimeMillis = java.lang.System.currentTimeMillis() - j;
                if (currentTimeMillis > f987) {
                    com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode paymentServiceErrorCode = com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.USER_NOT_AUTHENTICATED;
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    Camera2StreamConfigurationMap("\u0002\u000b\u0011\u0006\u0000\ufffe\u0011\u0006\f\u000bﾽ\u0002\u0015\u0000\u0002\u0002\u0001\u0010ﾽ￨\u0002\u0016\ufff3\ufffe\t\u0006\u0001\u0006\u0011\u0016￭\u0002\u000f\u0006\f\u0001\ufff2\u0010\u0002\u000fﾽ\ufffe\u0012\u0011\u0005", 45 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), 36 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 301 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr4);
                    m25560(paymentServiceErrorCode, ((java.lang.String) objArr4[0]).intern());
                    return;
                }
                j2 = f987 - currentTimeMillis;
                getOutputSizeshNQ4ISI = (getOutputSizes + 61) % 128;
            } else {
                com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode paymentServiceErrorCode2 = com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.USER_NOT_AUTHENTICATED;
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                Camera2StreamConfigurationMap("\u0005\u0002\u000b\u0011\u0006\u0000\ufffe\u0011\u0006\f\u000bﾽ\ufff1\u0006\n\u0002\ufff0\u0011\ufffe\n\r￦\u000b\u0013\ufffe\t\u0006\u0001ﾽ\t\ufffe\u0010\u0011\uffde\u0012\u0011", (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 36, (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 21, 253 - android.graphics.Color.argb(0, 0, 0, 0), objArr5);
                m25560(paymentServiceErrorCode2, ((java.lang.String) objArr5[0]).intern());
                return;
            }
            final com.gemalto.mfs.mwsdk.dcm.PaymentType type = activatedPaymentService.getType();
            int outputFormats = getOutputFormats();
            if (outputFormats != -91) {
                util.h.xy.aa.mc mcVar3 = this.isOutputSupportedFor;
                if (mcVar3 != null && mcVar3.m24523() != null) {
                    java.util.HashMap hashMap = new java.util.HashMap();
                    hashMap.put(util.h.xy.al.b.f183, util.h.xy.ar.b.m25093(outputFormats));
                    util.h.xy.v.mc mcVar4 = new util.h.xy.v.mc(-104, util.h.xy.ar.b.m25093(outputFormats), null, hashMap);
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    Camera2StreamConfigurationMap("\u0002\u0006\uffff\ufff9", 5 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 3 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), 227 - android.view.MotionEvent.axisFromString(""), objArr6);
                    java.lang.String intern2 = ((java.lang.String) objArr6[0]).intern();
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    Camera2StreamConfigurationMap("\u000e￩\u0003\ufffe￼\u000e\u0007￩\uffff\u000e\u0000\uffff\ufffe\u000b", 14 - (android.view.ViewConfiguration.getTouchSlop() >> 8), android.text.TextUtils.getOffsetBefore("", 0) + 11, android.text.TextUtils.indexOf("", "", 0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, objArr7);
                    util.h.xy.am.ma.m25027(intern2, ((java.lang.String) objArr7[0]).intern());
                    this.isOutputSupportedFor.m24523().onVerifyError(mcVar4);
                    util.h.xy.bu.rb.m25675();
                    util.h.xy.bf.mc.f939.m25442();
                    return;
                }
                util.h.xy.bf.ma.m25425(getPaymentServiceListener(), outputFormats);
                return;
            }
            final android.os.Handler handler = new android.os.Handler(android.os.Looper.myLooper());
            final com.gemalto.mfs.mwsdk.cdcvm.DeviceCVMVerifyListener m24523 = this.isOutputSupportedFor.m24523();
            m25563();
            final long j3 = j2;
            new util.h.xy.bt.ra(type, this.f993, util.h.xy.bt.ra.a.f1044, new util.h.xy.bt.a() { // from class: util.h.xy.bq.mb.5
                private static int getHighSpeedVideoSizesFor = 0;
                private static int getInputFormats = 1;
                private static int getOutputFormats = 1;
                private static int getOutputMinFrameDuration = 0;
                private static long getOutputStallDuration = -8550065902598138002L;
                private boolean getOutputStallDurationlomOqCM = false;
                private int getOutputSizeshNQ4ISI = 0;
                private java.lang.String getOutputMinFrameDurationlomOqCM = "";
                private java.lang.Throwable getOutputSizes = null;

                private static void getHighSpeedVideoFpsRanges(java.lang.String str, int i2, java.lang.Object[] objArr8) {
                    int i3 = getInputFormats + 67;
                    getOutputMinFrameDuration = i3 % 128;
                    if (i3 % 2 != 0) {
                        throw null;
                    }
                    char[] charArray = str.toCharArray();
                    util.h.xz.b.d dVar = new util.h.xz.b.d();
                    dVar.f2628 = i2;
                    int length = charArray.length;
                    long[] jArr = new long[length];
                    dVar.f2629 = 0;
                    while (dVar.f2629 < charArray.length) {
                        jArr[dVar.f2629] = (charArray[dVar.f2629] ^ (dVar.f2629 * dVar.f2628)) ^ (getOutputStallDuration ^ (-7508379876853140581L));
                        dVar.f2629++;
                    }
                    char[] cArr = new char[length];
                    dVar.f2629 = 0;
                    while (dVar.f2629 < charArray.length) {
                        int i4 = getInputFormats + 49;
                        getOutputMinFrameDuration = i4 % 128;
                        if (i4 % 2 != 0) {
                            cArr[dVar.f2629] = (char) jArr[dVar.f2629];
                            int i5 = dVar.f2629;
                            throw new java.lang.ArithmeticException();
                        }
                        cArr[dVar.f2629] = (char) jArr[dVar.f2629];
                        dVar.f2629++;
                    }
                    java.lang.String str2 = new java.lang.String(cArr);
                    getInputFormats = (getOutputMinFrameDuration + 125) % 128;
                    objArr8[0] = str2;
                }

                @Override // util.h.xy.bt.a
                /* renamed from: ˏ */
                public final void mo25464(int i2, java.lang.String str, java.lang.Throwable th) {
                    int i3 = (getOutputFormats + 3) % 128;
                    getHighSpeedVideoSizesFor = i3;
                    if (!this.getOutputStallDurationlomOqCM) {
                        this.getOutputStallDurationlomOqCM = true;
                        this.getOutputSizeshNQ4ISI = i2;
                        this.getOutputMinFrameDurationlomOqCM = str;
                        this.getOutputSizes = th;
                        return;
                    }
                    int i4 = i3 + 83;
                    getOutputFormats = i4 % 128;
                    if (i4 % 2 == 0) {
                        throw null;
                    }
                }

                @Override // util.h.xy.bt.a
                /* renamed from: ˏ, reason: contains not printable characters */
                public final void mo25566() {
                    if (this.getOutputStallDurationlomOqCM) {
                        if (util.h.xy.bq.mb.getHighSpeedVideoSizes(util.h.xy.bq.mb.this) != null) {
                            int i2 = getOutputFormats + 105;
                            getHighSpeedVideoSizesFor = i2 % 128;
                            if (i2 % 2 != 0) {
                                util.h.xy.bq.mb.getHighSpeedVideoSizes(util.h.xy.bq.mb.this).m24523();
                                throw null;
                            }
                            if (util.h.xy.bq.mb.getHighSpeedVideoSizes(util.h.xy.bq.mb.this).m24523() != null) {
                                util.h.xy.v.mc mcVar5 = new util.h.xy.v.mc(-103, this.getOutputMinFrameDurationlomOqCM);
                                java.lang.Object[] objArr8 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRanges("撹ಈ듦就", 26669 - android.graphics.Color.green(0), objArr8);
                                java.lang.String intern3 = ((java.lang.String) objArr8[0]).intern();
                                java.lang.Object[] objArr9 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRanges("撱\ue5e9昛\ue0bb憧\ue266沌\ued2d湞\ue8ee業\ueba1瓊\uf575瞂", 33119 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr9);
                                util.h.xy.am.ma.m25027(intern3, ((java.lang.String) objArr9[0]).intern());
                                util.h.xy.bq.mb.getHighSpeedVideoSizes(util.h.xy.bq.mb.this).m24523().onVerifyError(mcVar5);
                                getHighSpeedVideoSizesFor = (getOutputFormats + 79) % 128;
                                return;
                            }
                        }
                        util.h.xy.bq.mb.getOutputMinFrameDuration();
                        util.h.xy.bu.b.m25638(this.getOutputSizeshNQ4ISI, this.getOutputMinFrameDurationlomOqCM, util.h.xy.bq.mb.this.f997);
                        return;
                    }
                    util.h.xy.bq.mb.getOutputMinFrameDuration();
                    handler.post(new java.lang.Runnable() { // from class: util.h.xy.bq.mb.5.4
                        private static int Camera2StreamConfigurationMap = 0;
                        private static int getHighSpeedVideoFpsRanges = 1;

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i3 = Camera2StreamConfigurationMap;
                            getHighSpeedVideoFpsRanges = ((i3 & 111) + (i3 | 111)) % 128;
                            util.h.xy.bq.mb.getHighResolutionOutputSizeshNQ4ISI(util.h.xy.bq.mb.this, type, j3, m24523);
                            int i4 = getHighSpeedVideoFpsRanges + 13;
                            Camera2StreamConfigurationMap = i4 % 128;
                            if (i4 % 2 != 0) {
                                throw null;
                            }
                        }
                    });
                }
            }).m25628();
            return;
        }
        util.h.xy.aa.mc mcVar5 = this.isOutputSupportedFor;
        if (mcVar5 == null || mcVar5.m24523() == null) {
            return;
        }
        java.lang.Object[] objArr8 = new java.lang.Object[1];
        Camera2StreamConfigurationMap("\b\u0011\u0017ￃ￥\u0018\u0016\f\u0011\b\u0016\u0016ￃ\u0016\b\u0015\u0019\f\u0006\bￃ\f\u0016ￃ\ufff1\ufff8\uffef\uffef\ufff3\u0004\u001c\u0010", 32 - (android.view.ViewConfiguration.getTouchSlop() >> 8), ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + com.google.common.base.Ascii.GS, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, objArr8);
        util.h.xy.v.mc mcVar6 = new util.h.xy.v.mc(-101, ((java.lang.String) objArr8[0]).intern());
        java.lang.Object[] objArr9 = new java.lang.Object[1];
        Camera2StreamConfigurationMap("\u0002\u0006\uffff\ufff9", (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 5, 4 - android.view.View.MeasureSpec.getMode(0), android.view.MotionEvent.axisFromString("") + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE, objArr9);
        java.lang.String intern3 = ((java.lang.String) objArr9[0]).intern();
        java.lang.Object[] objArr10 = new java.lang.Object[1];
        Camera2StreamConfigurationMap("\ufffe�\n\r￨\u0002�\ufffb\r\u0006￨\n￼\r\uffff", 15 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), 15 - android.text.TextUtils.getCapsMode("", 0, 0), 224 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr10);
        util.h.xy.am.ma.m25027(intern3, ((java.lang.String) objArr10[0]).intern());
        this.isOutputSupportedFor.m24523().onVerifyError(mcVar6);
    }

    @Override // util.h.xy.bq.b
    /* renamed from: ˎ */
    public boolean mo25562(com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType, util.h.xy.d.md mdVar) {
        getOutputSizes = (getOutputSizeshNQ4ISI + 33) % 128;
        com.gemalto.mfs.mwsdk.payment.CHVerificationMethod cHVerificationMethod = this.f990;
        this.f993 = mdVar;
        boolean z = super.mo25562(paymentType, mdVar);
        getOutputSizes = (getOutputSizeshNQ4ISI + 37) % 128;
        return z;
    }

    private void Camera2StreamConfigurationMap(final com.gemalto.mfs.mwsdk.sdkconfig.SDKError<com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode> sDKError) {
        util.h.xy.ag.a.m24556().m24557(new java.lang.Runnable() { // from class: util.h.xy.bq.mb.7
            private static int getHighResolutionOutputSizeshNQ4ISI = 1;
            private static int getHighSpeedVideoFpsRanges = 0;
            private static int getHighSpeedVideoFpsRangesFor = 1;
            private static int getInputFormats = 0;
            private static int getOutputMinFrameDuration = -1231763738;

            private static void getHighSpeedVideoSizes(java.lang.String str, int i, int i2, int i3, boolean z, java.lang.Object[] objArr) {
                int i4 = (getHighResolutionOutputSizeshNQ4ISI + 5) % 128;
                getHighSpeedVideoFpsRanges = i4;
                int i5 = i4 + 87;
                getHighResolutionOutputSizeshNQ4ISI = i5 % 128;
                if (i5 % 2 == 0) {
                    throw new java.lang.ArithmeticException();
                }
                char[] charArray = str.toCharArray();
                util.h.xz.b.ra raVar = new util.h.xz.b.ra();
                char[] cArr = new char[i];
                raVar.f2649 = 0;
                while (raVar.f2649 < i) {
                    raVar.f2650 = charArray[raVar.f2649];
                    cArr[raVar.f2649] = (char) (raVar.f2650 + i3);
                    int i6 = raVar.f2649;
                    cArr[i6] = (char) (cArr[i6] - ((int) (getOutputMinFrameDuration ^ (-4839292868003314026L))));
                    raVar.f2649++;
                }
                if (i2 > 0) {
                    getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 119) % 128;
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
                getInputFormats = (getHighSpeedVideoFpsRangesFor + 57) % 128;
                try {
                    com.gemalto.mfs.mwsdk.payment.engine.RemotePaymentServiceListener remotePaymentServiceListener = (com.gemalto.mfs.mwsdk.payment.engine.RemotePaymentServiceListener) util.h.xy.bq.mb.this.getPaymentServiceListener();
                    try {
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        getHighSpeedVideoSizes("\ufffb\u0002\ufffe\u0005", 4 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 4, 189 - ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue(), true, objArr);
                        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        getHighSpeedVideoSizes("\b\u0007\u0005\ufff9\ufff8\u000b\u0002\u0005\b￣\u0004\ufff9\u0007\u0005\ufff9", (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 15, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 4, (android.view.KeyEvent.getMaxKeyCode() >> 16) + 187, false, objArr2);
                        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
                        if (remotePaymentServiceListener == null) {
                            util.h.xy.bq.mb.getOutputMinFrameDuration();
                        } else {
                            getInputFormats = (getHighSpeedVideoFpsRangesFor + 87) % 128;
                            remotePaymentServiceListener.onError(sDKError);
                        }
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } catch (java.lang.Throwable th2) {
                    util.h.xy.bq.mb.getOutputMinFrameDuration();
                    th2.getMessage();
                    try {
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        getHighSpeedVideoSizes("\ufffb\u0002\ufffe\u0005", android.view.View.getDefaultSize(0, 0) + 4, ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue() + 4, 190 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), true, objArr3);
                        java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        getHighSpeedVideoSizes("\ufffa\u0006\b\ufffa\u0005￤\t\u0006\u0003\f\ufff9\ufffa\ufffb\u0006\b\t", (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22) + 16, android.text.TextUtils.getCapsMode("", 0, 0) + 12, 186 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22), true, objArr4);
                        util.h.xy.am.ma.m25027(intern2, ((java.lang.String) objArr4[0]).intern());
                    } catch (java.lang.Throwable th3) {
                        java.lang.Throwable cause2 = th3.getCause();
                        if (cause2 == null) {
                            throw th3;
                        }
                        throw cause2;
                    }
                }
            }
        });
        int i = getOutputSizeshNQ4ISI + 61;
        getOutputSizes = i % 128;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        if (r2.f992 == com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (r2.f992 == com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        m25551();
        m25548();
        util.h.xy.bq.mb.getOutputSizeshNQ4ISI = (util.h.xy.bq.mb.getOutputSizes + 113) % 128;
     */
    @Override // util.h.xy.bq.a
    /* renamed from: ˊ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo25547() {
        int i = getOutputSizeshNQ4ISI + 95;
        getOutputSizes = i % 128;
        if (i % 2 == 0) {
            this.getValidOutputFormatsForInputhNQ4ISI = false;
        } else {
            this.getValidOutputFormatsForInputhNQ4ISI = true;
        }
        util.h.xy.ag.a.m24556().m24557(new java.lang.Runnable() { // from class: util.h.xy.bq.mb.10
            private static char[] Camera2StreamConfigurationMap = {42251, 42482, 42472, 42474, 42356, 42260, 42261, 42339, 42336, 42252, 42257, 42270, 42340, 42269, 42252, 42260, 42270, 42340, 42277, 42283, 42280, 42294, 42295, 42275, 42276, 42285, 42299, 42288, 42275, 42283, 42285};
            private static int getHighResolutionOutputSizeshNQ4ISI = 0;
            private static int getHighSpeedVideoFpsRanges = 0;
            private static int getHighSpeedVideoFpsRangesFor = 1;
            private static int getInputSizeshNQ4ISI = 1;

            private static void getHighSpeedVideoFpsRangesFor(int[] iArr, java.lang.String str, java.lang.Object[] objArr) {
                byte[] bytes = str.getBytes("ISO-8859-1");
                util.h.xz.b.ma maVar = new util.h.xz.b.ma();
                int i2 = iArr[0];
                int i3 = iArr[1];
                int i4 = iArr[2];
                int i5 = iArr[3];
                char[] cArr = Camera2StreamConfigurationMap;
                if (cArr != null) {
                    int length = cArr.length;
                    char[] cArr2 = new char[length];
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
                    getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 79) % 128;
                    char c = 0;
                    while (maVar.f2631 < i3) {
                        int i7 = getHighSpeedVideoFpsRanges + 47;
                        getHighSpeedVideoFpsRangesFor = i7 % 128;
                        if (i7 % 2 != 0 ? bytes[maVar.f2631] != 1 : bytes[maVar.f2631] != 1) {
                            cArr4[maVar.f2631] = (char) ((cArr3[maVar.f2631] * 2) - c);
                        } else {
                            getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 109) % 128;
                            cArr4[maVar.f2631] = (char) (((cArr3[maVar.f2631] * 2) + 1) - c);
                        }
                        c = cArr4[maVar.f2631];
                        maVar.f2631++;
                    }
                    cArr3 = cArr4;
                }
                if (i5 > 0) {
                    getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 49) % 128;
                    char[] cArr5 = new char[i3];
                    java.lang.System.arraycopy(cArr3, 0, cArr5, 0, i3);
                    int i8 = i3 - i5;
                    java.lang.System.arraycopy(cArr5, 0, cArr3, i8, i5);
                    java.lang.System.arraycopy(cArr5, i5, cArr3, 0, i8);
                }
                char[] cArr6 = new char[i3];
                maVar.f2631 = 0;
                while (maVar.f2631 < i3) {
                    cArr6[maVar.f2631] = cArr3[(i3 - maVar.f2631) - 1];
                    maVar.f2631++;
                }
                if (i4 > 0) {
                    getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 59) % 128;
                    maVar.f2631 = 0;
                    while (maVar.f2631 < i3) {
                        cArr6[maVar.f2631] = (char) (cArr6[maVar.f2631] - iArr[2]);
                        maVar.f2631++;
                    }
                }
                objArr[0] = new java.lang.String(cArr6);
            }

            @Override // java.lang.Runnable
            public final void run() {
                getInputSizeshNQ4ISI = (getHighResolutionOutputSizeshNQ4ISI + 63) % 128;
                try {
                    util.h.xy.bq.mb.getOutputMinFrameDuration();
                    util.h.xy.bq.mb.getOutputMinFrameDuration();
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(new int[]{0, 4, 105, 4}, "\u0000\u0000\u0001\u0000", objArr);
                    java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(new int[]{4, 13, 0, 0}, "\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001", objArr2);
                    util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
                    util.h.xy.f.b.f2201.m26746();
                    com.gemalto.mfs.mwsdk.payment.PaymentServiceListener paymentServiceListener = util.h.xy.bq.mb.this.getPaymentServiceListener();
                    if (paymentServiceListener == null) {
                        util.h.xy.bq.mb.getOutputMinFrameDuration();
                    } else {
                        getInputSizeshNQ4ISI = (getHighResolutionOutputSizeshNQ4ISI + 125) % 128;
                        util.h.xy.bq.mb mbVar = util.h.xy.bq.mb.this;
                        paymentServiceListener.onAuthenticationRequired(mbVar, mbVar.f990, util.h.xy.bq.a.f987);
                    }
                } catch (java.lang.Throwable th) {
                    util.h.xy.bq.mb.getOutputMinFrameDuration();
                    th.getMessage();
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(new int[]{0, 4, 105, 4}, "\u0000\u0000\u0001\u0000", objArr3);
                    java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(new int[]{17, 14, 45, 0}, "\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001", objArr4);
                    util.h.xy.am.ma.m25027(intern2, ((java.lang.String) objArr4[0]).intern());
                }
                getHighResolutionOutputSizeshNQ4ISI = (getInputSizeshNQ4ISI + 97) % 128;
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x001c, code lost:
    
        if (r4.isOutputSupportedFor != null) goto L10;
     */
    @Override // util.h.xy.bq.a, util.h.xy.bq.b
    /* renamed from: ˊ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.gemalto.mfs.mwsdk.payment.engine.TransactionContext mo25546(boolean z, boolean z2) {
        com.gemalto.mfs.mwsdk.payment.engine.TransactionContext mo25546;
        synchronized (this) {
            int i = getOutputSizeshNQ4ISI + 37;
            getOutputSizes = i % 128;
            if (i % 2 == 0) {
                util.h.xy.al.a.m25002(true);
                if (this.isOutputSupportedFor != null) {
                    this.isOutputSupportedFor.setDeviceCVMVerifyListener(null);
                    this.isOutputSupportedFor = null;
                }
                if (util.h.xy.bf.mb.f938.m25426() != null) {
                    if (util.h.xy.bf.mb.f938.m25426().m25393()) {
                        int i2 = getOutputSizeshNQ4ISI + 7;
                        getOutputSizes = i2 % 128;
                        if (i2 % 2 == 0) {
                            mo25546 = super.mo25546(z, z2);
                            util.h.xy.bf.mb.f938.m25426().m25390(true);
                        } else {
                            mo25546 = super.mo25546(z, z2);
                            util.h.xy.bf.mb.f938.m25426().m25390(false);
                        }
                        int i3 = getOutputSizes + 57;
                        getOutputSizeshNQ4ISI = i3 % 128;
                        int i4 = i3 % 2;
                    } else {
                        mo25546 = super.mo25546(false, z2);
                    }
                } else {
                    mo25546 = super.mo25546(z, z2);
                }
            } else {
                util.h.xy.al.a.m25002(false);
            }
        }
        return mo25546;
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x07fa  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x07fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int getOutputFormats() {
        byte[] bArr;
        byte b;
        java.lang.Object[] objArr;
        java.lang.Object obj;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoSizes(android.view.KeyEvent.getDeadChar(0, 0) + 152821636, (short) ((-45) - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), (byte) ('E' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), (-46) - android.view.View.resolveSizeAndState(0, 0, 0), (android.os.Process.myPid() >> 22) + 1424593134, objArr2);
        java.lang.String str = (java.lang.String) objArr2[0];
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighSpeedVideoSizes("Ო뇕䤄䳭\uedfc⌗絹\ue362퐼첐끛뛱٠鵬土竹\uf369⩄塊熬᠔渎設", (char) ((android.os.Process.getThreadPriority(0) + 20) >> 6), android.view.Gravity.getAbsoluteGravity(0, 0) - 677610985, "ᜤ鱺擗槗", "䊕\uda53巅匣", objArr3);
        java.lang.String str2 = (java.lang.String) objArr3[0];
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        getHighSpeedVideoSizes("繭\uf7bcꄛ⪥矰䭻\uec33\ue133髖责飨쩅柙ɒ뤯里痨鸴〉鞛\ue8f8ꂜ\ueb1e賠\ue1be맭", (char) (61317 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1, "绿㵉藩ᷯ", "䊕\uda53巅匣", objArr4);
        java.lang.String str3 = (java.lang.String) objArr4[0];
        util.h.xy.al.rb.m25017(util.h.xy.v.ra.f2617);
        try {
            ((java.security.SecureRandom) java.lang.Class.forName(str3).getDeclaredConstructor(null).newInstance(null)).nextBytes(new byte[131]);
            byte[] bArr2 = new byte[128];
            byte[] bArr3 = new byte[3];
            byte[] m25017 = util.h.xy.al.rb.m25017(util.h.xy.v.ra.f2617);
            byte[] bArr4 = new byte[131];
            ((java.security.SecureRandom) java.lang.Class.forName(str3).getDeclaredConstructor(null).newInstance(null)).nextBytes(bArr4);
            util.h.xy.a.ra raVar = new util.h.xy.a.ra();
            raVar.m24514(util.h.xy.aa.a.class);
            raVar.m24514(util.h.xy.ar.b.class);
            raVar.m24514(util.h.xy.ap.ra.class);
            raVar.m24514(util.h.xy.ap.ma.class);
            raVar.m24514(util.h.xy.ad.a.class);
            raVar.m24514(util.h.xy.bp.ra.class);
            raVar.m24514(util.h.xy.bu.mc.class);
            try {
                raVar.m24514(java.lang.Class.forName(str).getMethod(util.h.xy.al.b.f118, java.lang.String.class));
            } catch (java.lang.Exception unused) {
            }
            try {
                raVar.m24514(java.lang.Class.forName(str).getMethod(util.h.xy.al.b.f99, java.lang.String.class, java.lang.Class.class));
            } catch (java.lang.Exception unused2) {
            }
            try {
                raVar.m24514(java.lang.Class.forName(str).getMethod(util.h.xy.al.b.f180, java.lang.String.class, java.security.KeyStore.ProtectionParameter.class));
            } catch (java.lang.Exception unused3) {
            }
            try {
                raVar.m24514(java.lang.Class.forName(str).getMethod(util.h.xy.al.b.f172, java.lang.String.class));
            } catch (java.lang.Exception unused4) {
            }
            try {
                raVar.m24514(java.lang.Class.forName(str).getMethod(util.h.xy.al.b.f172, java.lang.String.class, java.lang.String.class));
            } catch (java.lang.Exception unused5) {
            }
            try {
                raVar.m24514(java.lang.Class.forName(str).getMethod(util.h.xy.al.b.f172, java.lang.String.class, java.security.Provider.class));
            } catch (java.lang.Exception unused6) {
            }
            try {
                raVar.m24514(java.lang.Class.forName(str).getMethod(util.h.xy.al.b.f174, java.lang.String.class, char[].class));
            } catch (java.lang.Exception unused7) {
            }
            try {
                raVar.m24514(java.lang.Class.forName(str).getMethod(util.h.xy.al.b.f130, new java.lang.Class[0]));
            } catch (java.lang.Exception unused8) {
            }
            try {
                raVar.m24514(java.lang.Class.forName(str).getMethod(util.h.xy.al.b.f195, new java.lang.Class[0]));
            } catch (java.lang.Exception unused9) {
            }
            try {
                raVar.m24514(java.lang.Class.forName(str).getMethod(util.h.xy.al.b.f95, java.lang.String.class));
            } catch (java.lang.Exception unused10) {
            }
            try {
                raVar.m24514(java.lang.Class.forName(str).getMethod(util.h.xy.al.b.f185, java.lang.String.class));
            } catch (java.lang.Exception unused11) {
            }
            try {
                raVar.m24514(java.lang.Class.forName(str).getMethod(util.h.xy.al.b.f197, java.io.InputStream.class, char[].class));
            } catch (java.lang.Exception unused12) {
            }
            try {
                raVar.m24514(java.lang.Class.forName(str).getMethod(util.h.xy.al.b.f197, java.security.KeyStore.LoadStoreParameter.class));
            } catch (java.lang.Exception unused13) {
            }
            try {
                java.lang.Class<?> cls = java.lang.Class.forName(str);
                java.lang.String str4 = util.h.xy.al.b.f193;
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                getHighSpeedVideoSizes((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 152821658, (short) ((-57) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (byte) ((-87) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), android.view.View.MeasureSpec.getMode(0) - 46, 1424593134 - android.widget.ExpandableListView.getPackedPositionGroup(0L), objArr5);
                raVar.m24514(cls.getMethod(str4, java.lang.String.class, java.lang.Class.forName((java.lang.String) objArr5[0])));
            } catch (java.lang.Exception unused14) {
            }
            try {
                raVar.m24514(java.lang.Class.forName(str).getMethod(util.h.xy.al.b.f119, java.lang.String.class, java.security.KeyStore.Entry.class, java.security.KeyStore.ProtectionParameter.class));
            } catch (java.lang.Exception unused15) {
            }
            try {
                java.lang.Class<?> cls2 = java.lang.Class.forName(str);
                java.lang.String str5 = util.h.xy.al.b.f108;
                java.lang.Class<?>[] clsArr = new java.lang.Class[3];
                clsArr[0] = java.lang.String.class;
                clsArr[1] = byte[].class;
                bArr = bArr3;
                try {
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    getHighSpeedVideoSizes("㢯쀩\u009f뀑鷵█譜볐㑅ꟸ仨뉒癵ꕔ◀῁梉旔≣㤊\udf96⥈\udf71ऺⱚᬔ䢃➘膄灪팙硵⮩", (char) (android.graphics.Color.rgb(0, 0, 0) + 16777216), (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1446614312, "⤹㦕慖䪲", "䊕\uda53巅匣", objArr6);
                    clsArr[2] = java.lang.Class.forName((java.lang.String) objArr6[0]);
                    raVar.m24514(cls2.getMethod(str5, clsArr));
                } catch (java.lang.Exception unused16) {
                }
            } catch (java.lang.Exception unused17) {
                bArr = bArr3;
            }
            try {
                java.lang.Class<?> cls3 = java.lang.Class.forName(str);
                java.lang.String str6 = util.h.xy.al.b.f108;
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                getHighSpeedVideoSizes((android.view.ViewConfiguration.getTapTimeout() >> 16) + 152821688, (short) (android.view.View.MeasureSpec.makeMeasureSpec(0, 0) - 22), (byte) ((-22) - android.widget.ExpandableListView.getPackedPositionChild(0L)), (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) - 46, 1424593134 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr7);
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                getHighSpeedVideoSizes("㢯쀩\u009f뀑鷵█譜볐㑅ꟸ仨뉒癵ꕔ◀῁梉旔≣㤊\udf96⥈\udf71ऺⱚᬔ䢃➘膄灪팙硵⮩", (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 1446614313, "⤹㦕慖䪲", "䊕\uda53巅匣", objArr8);
                raVar.m24514(cls3.getMethod(str6, java.lang.String.class, java.lang.Class.forName((java.lang.String) objArr7[0]), char[].class, java.lang.Class.forName((java.lang.String) objArr8[0])));
            } catch (java.lang.Exception unused18) {
            }
            try {
                raVar.m24514(java.lang.Class.forName(str).getMethod(util.h.xy.al.b.f96, new java.lang.Class[0]));
            } catch (java.lang.Exception unused19) {
            }
            try {
                raVar.m24514(java.lang.Class.forName(str).getMethod(util.h.xy.al.b.f107, java.security.KeyStore.LoadStoreParameter.class));
            } catch (java.lang.Exception unused20) {
            }
            try {
                raVar.m24514(java.lang.Class.forName(str).getMethod(util.h.xy.al.b.f107, java.io.OutputStream.class, char[].class));
            } catch (java.lang.Exception unused21) {
            }
            try {
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                getHighSpeedVideoSizes(android.graphics.Color.alpha(0) + 152821705, (short) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - '\\'), (byte) ((-13) - (android.os.Process.myPid() >> 22)), (-46) - android.graphics.Color.red(0), 1424593134 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr9);
                raVar.m24514(java.lang.Class.forName((java.lang.String) objArr9[0]).getMethod(util.h.xy.al.b.f191, new java.lang.Class[0]));
            } catch (java.lang.Exception unused22) {
            }
            try {
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                getHighSpeedVideoSizes((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 152821705, (short) ((-44) - android.text.TextUtils.indexOf("", "")), (byte) ((-13) - (android.view.KeyEvent.getMaxKeyCode() >> 16)), (-46) - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 1424593134 - android.text.TextUtils.indexOf("", ""), objArr10);
                raVar.m24514(java.lang.Class.forName((java.lang.String) objArr10[0]).getMethod(util.h.xy.al.b.f198, new java.lang.Class[0]));
            } catch (java.lang.Exception unused23) {
            }
            try {
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                getHighSpeedVideoSizes(152821705 - android.view.View.MeasureSpec.getSize(0), (short) ((android.view.ViewConfiguration.getEdgeSlop() >> 16) - 44), (byte) ((-14) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 47, 1424593134 - android.text.TextUtils.indexOf("", "", 0, 0), objArr11);
                raVar.m24514(java.lang.Class.forName((java.lang.String) objArr11[0]).getMethod(util.h.xy.al.b.f181, new java.lang.Class[0]));
            } catch (java.lang.Exception unused24) {
            }
            try {
                java.lang.Object[] objArr12 = new java.lang.Object[1];
                getHighSpeedVideoSizes((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 152821704, (short) ((-43) - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (byte) ((-13) - (android.view.ViewConfiguration.getTouchSlop() >> 8)), (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 46, (android.view.ViewConfiguration.getTouchSlop() >> 8) + 1424593134, objArr12);
                raVar.m24514(java.lang.Class.forName((java.lang.String) objArr12[0]).getMethod(util.h.xy.al.b.f186, new java.lang.Class[0]));
            } catch (java.lang.Exception unused25) {
            }
            try {
                java.lang.Object[] objArr13 = new java.lang.Object[1];
                getHighSpeedVideoSizes("ຟꨦ쮐纯侓催੨ﮖ혯뿹爑鳸⧢ᛕ亀⟓奠鎄夯\uf06eﻶ\uef95ꈆ犲ጎ⢠뫾흳쪚\ued37軔픕营觾㟮⾃좬", (char) android.view.View.MeasureSpec.getMode(0), (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) - 301861640, "\uf85eǴ⏮錻", "䊕\uda53巅匣", objArr13);
                raVar.m24514(java.lang.Class.forName((java.lang.String) objArr13[0]).getMethod(util.h.xy.al.b.f175, new java.lang.Class[0]));
            } catch (java.lang.Exception unused26) {
            }
            try {
                java.lang.Object[] objArr14 = new java.lang.Object[1];
                getHighSpeedVideoSizes("ຟꨦ쮐纯侓催੨ﮖ혯뿹爑鳸⧢ᛕ亀⟓奠鎄夯\uf06eﻶ\uef95ꈆ犲ጎ⢠뫾흳쪚\ued37軔픕营觾㟮⾃좬", (char) android.view.View.combineMeasuredStates(0, 0), (android.view.ViewConfiguration.getScrollBarSize() >> 8) - 301861640, "\uf85eǴ⏮錻", "䊕\uda53巅匣", objArr14);
                raVar.m24514(java.lang.Class.forName((java.lang.String) objArr14[0]).getMethod(util.h.xy.al.b.f158, new java.lang.Class[0]));
            } catch (java.lang.Exception unused27) {
            }
            try {
                java.lang.Object[] objArr15 = new java.lang.Object[1];
                getHighSpeedVideoSizes("ຟꨦ쮐纯侓催੨ﮖ혯뿹爑鳸⧢ᛕ亀⟓奠鎄夯\uf06eﻶ\uef95ꈆ犲ጎ⢠뫾흳쪚\ued37軔픕营觾㟮⾃좬", (char) android.text.TextUtils.indexOf("", "", 0, 0), (-301861640) - android.text.TextUtils.indexOf("", ""), "\uf85eǴ⏮錻", "䊕\uda53巅匣", objArr15);
                raVar.m24514(java.lang.Class.forName((java.lang.String) objArr15[0]).getMethod(util.h.xy.al.b.f186, new java.lang.Class[0]));
            } catch (java.lang.Exception unused28) {
            }
            try {
                java.lang.Object[] objArr16 = new java.lang.Object[1];
                getHighSpeedVideoSizes((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 152821743, (short) (47 - android.text.TextUtils.indexOf("", "")), (byte) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 109), (android.view.ViewConfiguration.getPressedStateDuration() >> 16) - 46, (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 1424593125, objArr16);
                raVar.m24514(java.lang.Class.forName((java.lang.String) objArr16[0]).getMethod(util.h.xy.al.b.f94, new java.lang.Class[0]));
            } catch (java.lang.Exception unused29) {
            }
            try {
                raVar.m24514(java.lang.Class.forName(str2).getMethod(util.h.xy.al.b.f172, java.lang.String.class, java.lang.String.class));
            } catch (java.lang.Exception unused30) {
            }
            try {
                raVar.m24514(java.lang.Class.forName(str2).getMethod(util.h.xy.al.b.f172, java.lang.String.class, java.security.Provider.class));
            } catch (java.lang.Exception unused31) {
            }
            try {
                raVar.m24514(java.lang.Class.forName(str2).getMethod(util.h.xy.al.b.f172, java.lang.String.class));
            } catch (java.lang.Exception unused32) {
            }
            try {
                java.lang.Class<?> cls4 = java.lang.Class.forName(str2);
                java.lang.String str7 = util.h.xy.al.b.f190;
                java.lang.Object[] objArr17 = new java.lang.Object[1];
                getHighSpeedVideoSizes((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 152821759, (short) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 29), (byte) ((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) - 100), android.widget.ExpandableListView.getPackedPositionChild(0L) - 45, (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1424593133, objArr17);
                raVar.m24514(cls4.getMethod(str7, java.lang.Class.forName((java.lang.String) objArr17[0])));
            } catch (java.lang.Exception unused33) {
            }
            try {
                java.lang.Class<?> cls5 = java.lang.Class.forName(str2);
                java.lang.String str8 = util.h.xy.al.b.f190;
                java.lang.Object[] objArr18 = new java.lang.Object[1];
                getHighSpeedVideoSizes(android.widget.ExpandableListView.getPackedPositionChild(0L) + 152821760, (short) ('}' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), (byte) (android.graphics.Color.argb(0, 0, 0, 0) - 100), android.text.TextUtils.indexOf("", "", 0) - 46, 1424593134 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr18);
                raVar.m24514(cls5.getMethod(str8, java.lang.Class.forName((java.lang.String) objArr18[0]), java.lang.Class.forName(str3)));
            } catch (java.lang.Exception unused34) {
            }
            try {
                raVar.m24514(java.lang.Class.forName(str2).getMethod(util.h.xy.al.b.f196, byte[].class));
            } catch (java.lang.Exception unused35) {
            }
            try {
                raVar.m24514(java.lang.Class.forName(str2).getMethod(util.h.xy.al.b.f194, new java.lang.Class[0]));
            } catch (java.lang.Exception unused36) {
            }
            try {
                raVar.m24514(android.provider.Settings.Secure.class.getMethod(util.h.xy.al.b.f106, android.content.ContentResolver.class, java.lang.String.class));
            } catch (java.lang.Exception unused37) {
            }
            try {
                raVar.m24514(java.lang.Class.forName(str3).getMethod(util.h.xy.al.b.f133, byte[].class));
            } catch (java.lang.Exception unused38) {
            }
            try {
                raVar.m24514(java.lang.Class.forName(str3).getMethod(util.h.xy.al.b.f140, java.lang.Integer.TYPE));
            } catch (java.lang.Exception unused39) {
            }
            try {
                raVar.m24514(java.util.Random.class.getMethod(util.h.xy.al.b.f125, new java.lang.Class[0]));
            } catch (java.lang.Exception unused40) {
            }
            int i = -90;
            try {
                byte[] m27594 = util.h.xy.v.b.f2439.m27594(bArr4, util.h.xy.a.ma.m24504(raVar));
                i = util.h.xy.af.mb.m24551().m24553(m27594[0]);
                if (i != -91 && i == 111) {
                    int i2 = getOutputSizeshNQ4ISI + 53;
                    getOutputSizes = i2 % 128;
                    try {
                        if (i2 % 2 == 0) {
                            ((java.security.SecureRandom) java.lang.Class.forName(str3).getDeclaredConstructor(null).newInstance(null)).nextInt();
                            util.h.xy.ag.a.m24556().m24558();
                            throw new java.lang.ArithmeticException();
                        }
                        int nextInt = ((java.security.SecureRandom) java.lang.Class.forName(str3).getDeclaredConstructor(null).newInstance(null)).nextInt();
                        android.content.Context m24558 = util.h.xy.ag.a.m24556().m24558();
                        int i3 = getOutputSizes + 67;
                        getOutputSizeshNQ4ISI = i3 % 128;
                        try {
                            if (i3 % 2 != 0) {
                                objArr = new java.lang.Object[4];
                                objArr[0] = java.lang.Integer.valueOf(nextInt);
                                objArr[1] = m24558;
                                obj = util.h.xy.dd.b.f1176.get(-1119310920);
                                if (obj != null) {
                                    i = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr)).intValue() != nextInt ? -91 : com.visa.cbp.sdk.facade.data.Constants.ROOT_DETECTED;
                                }
                                java.lang.Class cls6 = (java.lang.Class) util.h.xy.dd.b.m26271((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, (char) ((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 47455), android.text.TextUtils.getOffsetAfter("", 0) + 21);
                                java.lang.Object[] objArr19 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRangesFor(objArr19);
                                java.lang.String str9 = (java.lang.String) objArr19[0];
                                java.lang.Object[] objArr20 = new java.lang.Object[1];
                                getHighSpeedVideoSizes("ꉣ펤䅦抅\ueefa粑䝫ﴒ㳼ɬ촬\ue125ꁑ걅㝙뜺攁\uef03㱫䑊ᐺ\ud81e츩", (char) ((-1) - android.widget.ExpandableListView.getPackedPositionChild(0L)), (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 790334409, "짠ᮋ逯짗", "䊕\uda53巅匣", objArr20);
                                obj = cls6.getMethod(str9, java.lang.Class.forName((java.lang.String) objArr20[0]), java.lang.Integer.TYPE);
                                util.h.xy.dd.b.f1176.put(-1119310920, obj);
                                if (((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr)).intValue() != nextInt) {
                                }
                            } else {
                                objArr = new java.lang.Object[]{m24558, java.lang.Integer.valueOf(nextInt)};
                                obj = util.h.xy.dd.b.f1176.get(-1119310920);
                                if (obj != null) {
                                    if (((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr)).intValue() != nextInt) {
                                    }
                                }
                                java.lang.Class cls62 = (java.lang.Class) util.h.xy.dd.b.m26271((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, (char) ((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 47455), android.text.TextUtils.getOffsetAfter("", 0) + 21);
                                java.lang.Object[] objArr192 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRangesFor(objArr192);
                                java.lang.String str92 = (java.lang.String) objArr192[0];
                                java.lang.Object[] objArr202 = new java.lang.Object[1];
                                getHighSpeedVideoSizes("ꉣ펤䅦抅\ueefa粑䝫ﴒ㳼ɬ촬\ue125ꁑ걅㝙뜺攁\uef03㱫䑊ᐺ\ud81e츩", (char) ((-1) - android.widget.ExpandableListView.getPackedPositionChild(0L)), (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 790334409, "짠ᮋ逯짗", "䊕\uda53巅匣", objArr202);
                                obj = cls62.getMethod(str92, java.lang.Class.forName((java.lang.String) objArr202[0]), java.lang.Integer.TYPE);
                                util.h.xy.dd.b.f1176.put(-1119310920, obj);
                                if (((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr)).intValue() != nextInt) {
                                }
                            }
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th;
                        }
                    } catch (java.lang.Throwable th2) {
                        java.lang.Throwable cause2 = th2.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th2;
                    }
                }
                if (i == -91) {
                    getOutputSizes = (getOutputSizeshNQ4ISI + 111) % 128;
                    int i4 = 131;
                    byte[] bArr5 = new byte[131];
                    int i5 = 0;
                    while (i5 < i4) {
                        int i6 = i5 + 1;
                        bArr5[i5] = m27594[i6];
                        i5 = i6;
                        i4 = 131;
                    }
                    for (int i7 = 0; i7 < i4; i7++) {
                        byte b2 = (byte) (bArr5[i7] ^ m25017[i7]);
                        bArr5[i7] = b2;
                        bArr5[i7] = (byte) (b2 ^ bArr4[i7]);
                    }
                    for (int i8 = 0; i8 < 128; i8++) {
                        bArr2[i8] = bArr5[i8];
                    }
                    for (int i9 = 0; i9 < 3; i9++) {
                        bArr[i9] = bArr5[i9 + 128];
                    }
                    int i10 = (getOutputSizes + 115) % 128;
                    getOutputSizeshNQ4ISI = i10;
                    byte b3 = bArr[0];
                    if (b3 != 0 || bArr[1] != 0 || bArr[2] != 0) {
                        int i11 = i10 + 95;
                        int i12 = i11 % 128;
                        getOutputSizes = i12;
                        if (i11 % 2 != 0 ? b3 >= 0 : b3 >= 0) {
                            int i13 = i12 + 111;
                            int i14 = i13 % 128;
                            getOutputSizeshNQ4ISI = i14;
                            if (i13 % 2 == 0 ? bArr[1] >= 0 : b3 >= 0) {
                                byte b4 = bArr[2];
                                if (b4 >= 0 && b3 != (b = bArr[1]) && b != b4 && b3 != b4) {
                                    byte b5 = bArr2[b3];
                                    byte b6 = bArr2[b];
                                    byte b7 = bArr2[b4];
                                    if (b5 < b6 && b5 >= 0 && b5 <= 100) {
                                        int i15 = i14 + 95;
                                        getOutputSizes = i15 % 128;
                                        if (i15 % 2 == 0) {
                                            throw new java.lang.NullPointerException();
                                        }
                                        if (b6 >= 0) {
                                            int i16 = (i14 + 39) % 128;
                                            getOutputSizes = i16;
                                            if (b6 <= 100) {
                                                int i17 = i16 + 115;
                                                int i18 = i17 % 128;
                                                getOutputSizeshNQ4ISI = i18;
                                                if (i17 % 2 != 0) {
                                                    throw new java.lang.ArithmeticException();
                                                }
                                                if (b7 >= 0 && b7 <= 100) {
                                                    if (b7 < b5) {
                                                        return 801;
                                                    }
                                                    if (b7 >= b6) {
                                                        return -91;
                                                    }
                                                    if (b7 >= b5 && b7 < b6) {
                                                        int i19 = i18 + 109;
                                                        getOutputSizes = i19 % 128;
                                                        if (i19 % 2 == 0) {
                                                            int i20 = 4 / 5;
                                                        }
                                                        try {
                                                            int nextInt2 = ((java.security.SecureRandom) java.lang.Class.forName(str3).getDeclaredConstructor(null).newInstance(null)).nextInt();
                                                            try {
                                                                java.lang.Object[] objArr21 = {util.h.xy.ag.a.m24556().m24558(), java.lang.Integer.valueOf(nextInt2)};
                                                                java.lang.Object obj2 = util.h.xy.dd.b.f1176.get(-1119310920);
                                                                if (obj2 == null) {
                                                                    java.lang.Class cls7 = (java.lang.Class) util.h.xy.dd.b.m26271((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, (char) (47455 - android.text.TextUtils.getOffsetAfter("", 0)), 20 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
                                                                    java.lang.Object[] objArr22 = new java.lang.Object[1];
                                                                    getHighSpeedVideoFpsRangesFor(objArr22);
                                                                    java.lang.String str10 = (java.lang.String) objArr22[0];
                                                                    java.lang.Object[] objArr23 = new java.lang.Object[1];
                                                                    getHighSpeedVideoSizes("ꉣ펤䅦抅\ueefa粑䝫ﴒ㳼ɬ촬\ue125ꁑ걅㝙뜺攁\uef03㱫䑊ᐺ\ud81e츩", (char) android.text.TextUtils.indexOf("", "", 0), 790334410 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), "짠ᮋ逯짗", "䊕\uda53巅匣", objArr23);
                                                                    obj2 = cls7.getMethod(str10, java.lang.Class.forName((java.lang.String) objArr23[0]), java.lang.Integer.TYPE);
                                                                    util.h.xy.dd.b.f1176.put(-1119310920, obj2);
                                                                }
                                                                if (((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr21)).intValue() != nextInt2) {
                                                                    return com.visa.cbp.sdk.facade.data.Constants.ROOT_DETECTED;
                                                                }
                                                                return -91;
                                                            } catch (java.lang.Throwable th3) {
                                                                java.lang.Throwable cause3 = th3.getCause();
                                                                if (cause3 != null) {
                                                                    throw cause3;
                                                                }
                                                                throw th3;
                                                            }
                                                        } catch (java.lang.Throwable th4) {
                                                            java.lang.Throwable cause4 = th4.getCause();
                                                            if (cause4 != null) {
                                                                throw cause4;
                                                            }
                                                            throw th4;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException | java.io.UnsupportedEncodingException e) {
                e.getMessage();
            }
            return i;
        } catch (java.lang.Throwable th5) {
            java.lang.Throwable cause5 = th5.getCause();
            if (cause5 != null) {
                throw cause5;
            }
            throw th5;
        }
    }

    static void getInputFormats() {
        getOutputStallDurationlomOqCM = 8158595561072062943L;
        getInputSizeshNQ4ISI = 294925130;
        getOutputMinFrameDurationlomOqCM = (char) 13130;
        isOutputSupportedForhNQ4ISI = 289748900;
        getHighSpeedVideoFpsRanges = -408872971;
        getOutputMinFrameDuration = 1287092388;
        toString = new byte[]{org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, -53, -101, -61, -71, 36, -10, -28, -19, com.google.common.base.Ascii.NAK, -27, -109, -41, -51, -20, com.visa.cbp.getEncExpo.startTransaction, -52, -91, -35, -13, -11, -41, 41, 75, 41, 84, 80, 57, 87, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, 56, 7, com.google.common.base.Ascii.CAN, 47, -112, 56, 7, 56, com.google.common.base.Ascii.SI, -113, 63, 1, 77, 87, 40, 84, 72, -1, 71, -95, 47, 77, 60, -51, -33, -44, -84, -36, 46, -22, -12, -41, -13, -9, com.google.common.base.Ascii.FS, -28, -50, -52, -22, 33, -8, -31, -7, -34, -77, -53, -51, com.visa.cbp.getEncExpo.registerForActivityResult, -10, -44, -100, -14, -24, 37, -45, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, -12, -60, -20, 38, -115, -53, -51, -62, -86, -6, -4, -24, -30, -43, -31, -11, 58, -78, -100, -54, -24, 59, -75, -106, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, -8, -111, 126, -29, -40, -83, -66, -67, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, -23, -79, -20, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -29, -31, -11, -8, -102, -14, -100, -58, -87, -87, 4, -108, -110, -58, -52, com.visa.cbp.getEncExpo.registerForActivityResult, -51, -7, 84, -36, -14, -28, -58};
    }

    static void getHighSpeedVideoSizesFor() {
        getInputFormats = -1231763956;
        getOutputStallDuration = 1553989426879731500L;
    }

    static void getHighSpeedVideoSizes() {
        int i = getOutputSizes;
        getOutputSizeshNQ4ISI = (i + 101) % 128;
        Camera2StreamConfigurationMap = new byte[]{120, 100, com.visa.cbp.getEncExpo.startTransaction, -9};
        getHighResolutionOutputSizeshNQ4ISI = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE;
        getOutputSizeshNQ4ISI = (i + 103) % 128;
    }
}
