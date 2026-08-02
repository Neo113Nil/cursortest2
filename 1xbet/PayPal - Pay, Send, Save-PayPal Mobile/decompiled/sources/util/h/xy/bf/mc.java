package util.h.xy.bf;

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
/* loaded from: classes5.dex */
public final class mc {
    private static char[] Camera2StreamConfigurationMap = null;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static final /* synthetic */ util.h.xy.bf.mc[] getHighSpeedVideoFpsRanges;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 1;
    private static android.os.CountDownTimer getHighSpeedVideoSizesFor;
    private static int getInputFormats;
    private static java.util.Timer getInputSizeshNQ4ISI;
    private static final java.lang.String getOutputFormats;

    /* renamed from: ˎ, reason: contains not printable characters */
    public static final util.h.xy.bf.mc f939;

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static final byte[] f940;
    private boolean getOutputMinFrameDuration = false;

    private mc(java.lang.String str) {
    }

    static /* synthetic */ boolean Camera2StreamConfigurationMap(util.h.xy.bf.mc mcVar) {
        int i = getHighSpeedVideoSizes + 99;
        getInputFormats = i % 128;
        boolean z = mcVar.getOutputMinFrameDuration;
        if (i % 2 == 0) {
            return z;
        }
        throw new java.lang.ArithmeticException();
    }

    static /* synthetic */ java.lang.String getHighSpeedVideoSizes() {
        int i = (getInputFormats + 35) % 128;
        getHighSpeedVideoSizes = i;
        java.lang.String str = getOutputFormats;
        int i2 = i + 33;
        getInputFormats = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    static /* synthetic */ boolean getHighSpeedVideoSizes(util.h.xy.bf.mc mcVar) {
        int i = getInputFormats + 23;
        getHighSpeedVideoSizes = i % 128;
        mcVar.getOutputMinFrameDuration = false;
        if (i % 2 != 0) {
            return false;
        }
        throw null;
    }

    public static util.h.xy.bf.mc valueOf(java.lang.String str) {
        int i = getInputFormats + 33;
        getHighSpeedVideoSizes = i % 128;
        util.h.xy.bf.mc mcVar = (util.h.xy.bf.mc) java.lang.Enum.valueOf(util.h.xy.bf.mc.class, str);
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        getHighSpeedVideoSizes = (getInputFormats + 69) % 128;
        return mcVar;
    }

    public static util.h.xy.bf.mc[] values() {
        int i = getInputFormats + 29;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        util.h.xy.bf.mc[] mcVarArr = (util.h.xy.bf.mc[]) getHighSpeedVideoFpsRanges.clone();
        getInputFormats = (getHighSpeedVideoSizes + 99) % 128;
        return mcVarArr;
    }

    static {
        getHighSpeedVideoFpsRangesFor();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(false, new int[]{121, 8, 161, 0}, "\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000", objArr);
        util.h.xy.bf.mc mcVar = new util.h.xy.bf.mc(((java.lang.String) objArr[0]).intern());
        f939 = mcVar;
        int i = (getHighSpeedVideoSizes + 39) % 128;
        getInputFormats = i;
        int i2 = (i + 99) % 128;
        getHighSpeedVideoSizes = i2;
        getHighSpeedVideoFpsRanges = new util.h.xy.bf.mc[]{mcVar};
        f940 = new byte[]{106, -126};
        getOutputFormats = "mc";
        int i3 = i2 + 99;
        getInputFormats = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    static boolean Camera2StreamConfigurationMap() {
        getHighSpeedVideoSizes = (getInputFormats + 3) % 128;
        boolean highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
        getHighSpeedVideoSizes = (getInputFormats + 107) % 128;
        return highSpeedVideoFpsRanges;
    }

    private static boolean getHighSpeedVideoFpsRanges() {
        boolean z;
        util.h.xy.bu.mb mbVar;
        util.h.xy.m.mb mbVar2;
        int i = getInputFormats + 121;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 != 0) {
            z = false;
            if (util.h.xy.ag.a.m24556().m24558() == null) {
                return false;
            }
        } else {
            if (util.h.xy.ag.a.m24556().m24558() == null) {
                return true;
            }
            z = true;
        }
        try {
            mbVar = util.h.xy.bu.mb.m25666();
            mbVar2 = util.h.xy.m.mb.m26975(util.h.xy.ag.a.m24556().m24558());
        } catch (util.h.xy.ab.b unused) {
            mbVar = null;
            mbVar2 = null;
        }
        if (mbVar != null) {
            int i2 = (getInputFormats + 29) % 128;
            getHighSpeedVideoSizes = i2;
            if (mbVar2 != null) {
                getInputFormats = (i2 + 47) % 128;
                return true;
            }
        }
        return z;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static void m25435(com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType, com.gemalto.mfs.mwsdk.payment.PaymentServiceListener paymentServiceListener) {
        int i = getInputFormats + 17;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 != 0) {
            com.gemalto.mfs.mwsdk.payment.PaymentBusinessManager.getPaymentBusinessService().activate(null, paymentType, paymentServiceListener);
            int i2 = getHighSpeedVideoSizes + 89;
            getInputFormats = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            return;
        }
        com.gemalto.mfs.mwsdk.payment.PaymentBusinessManager.getPaymentBusinessService().activate(null, paymentType, paymentServiceListener);
        throw null;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static com.gemalto.mfs.mwsdk.sdkconfig.SDKError<com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode> m25434(com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode paymentServiceErrorCode, java.lang.String str) {
        int i = getInputFormats + 25;
        getHighSpeedVideoSizes = i % 128;
        com.gemalto.mfs.mwsdk.sdkconfig.SDKError<com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode> m25431 = m25431(paymentServiceErrorCode, str, null, null);
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        int i2 = getInputFormats + 25;
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 != 0) {
            return m25431;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static com.gemalto.mfs.mwsdk.sdkconfig.SDKError<com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode> m25431(com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode paymentServiceErrorCode, java.lang.String str, java.lang.Throwable th, com.gemalto.mfs.mwsdk.payment.engine.TransactionContext transactionContext) {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(true, new int[]{0, 18, 156, 0}, "\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000", objArr);
        hashMap.put(((java.lang.String) objArr[0]).intern(), transactionContext);
        util.h.xy.v.mc mcVar = new util.h.xy.v.mc(paymentServiceErrorCode, str, th, hashMap);
        getInputFormats = (getHighSpeedVideoSizes + 15) % 128;
        return mcVar;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static com.gemalto.mfs.mwsdk.sdkconfig.SDKError<com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode> m25432(int i) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(util.h.xy.al.b.f183, util.h.xy.ar.b.m25093(i));
        util.h.xy.v.mc mcVar = new util.h.xy.v.mc(com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.DEVICE_SUSPICIOUS, util.h.xy.ar.b.m25093(i), null, hashMap);
        getHighSpeedVideoSizes = (getInputFormats + 31) % 128;
        return mcVar;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m25441(com.gemalto.mfs.mwsdk.payment.engine.TransactionContext transactionContext) {
        com.gemalto.mfs.mwsdk.payment.engine.ContactlessPaymentServiceListener m25413 = util.h.xy.bf.c.f934.m25413();
        com.gemalto.mfs.mwsdk.payment.PaymentBusinessService paymentBusinessService = com.gemalto.mfs.mwsdk.payment.PaymentBusinessManager.getPaymentBusinessService();
        com.gemalto.mfs.mwsdk.payment.engine.PaymentService activatedPaymentService = paymentBusinessService.getActivatedPaymentService();
        util.h.xy.al.a.m25002(true);
        if (activatedPaymentService != null) {
            int i = getHighSpeedVideoSizes + 83;
            getInputFormats = i % 128;
            if (i % 2 != 0) {
                com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode paymentServiceErrorCode = com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.PAYMENT_WRONG_STATE;
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(false, new int[]{18, 65, 0, 51}, "\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001", objArr);
                getHighSpeedVideoSizes(m25413, paymentServiceErrorCode, ((java.lang.String) objArr[0]).intern());
                return;
            }
            com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode paymentServiceErrorCode2 = com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.PAYMENT_WRONG_STATE;
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(false, new int[]{18, 65, 0, 51}, "\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001", objArr2);
            getHighSpeedVideoSizes(m25413, paymentServiceErrorCode2, ((java.lang.String) objArr2[0]).intern());
            return;
        }
        if (activatedPaymentService == null) {
            int i2 = getInputFormats + 103;
            getHighSpeedVideoSizes = i2 % 128;
            if (i2 % 2 != 0) {
                paymentBusinessService.activate(null, com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS, m25413);
                activatedPaymentService = paymentBusinessService.getActivatedPaymentService();
            } else {
                paymentBusinessService.activate(null, com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS, m25413);
                paymentBusinessService.getActivatedPaymentService();
                throw null;
            }
        }
        if (activatedPaymentService == null) {
            return;
        }
        ((util.h.xy.bq.b) activatedPaymentService).m25564(transactionContext);
        com.gemalto.mfs.mwsdk.payment.CHVerificationMethod result = com.gemalto.mfs.mwsdk.payment.chverification.CHVerificationManager.INSTANCE.getCVMethod().getResult();
        if (result == com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.WALLET_PIN || result == com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.BIOMETRICS || result == com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.DEVICE_KEYGUARD) {
            ((util.h.xy.bq.a) activatedPaymentService).mo25547();
            return;
        }
        com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode paymentServiceErrorCode3 = com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.NO_DEFAULT_CHV_METHOD;
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(true, new int[]{83, 38, 33, 19}, "\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001", objArr3);
        getHighSpeedVideoSizes(m25413, paymentServiceErrorCode3, ((java.lang.String) objArr3[0]).intern());
        getInputFormats = (getHighSpeedVideoSizes + 63) % 128;
    }

    private void getHighSpeedVideoSizes(final com.gemalto.mfs.mwsdk.payment.PaymentServiceListener paymentServiceListener, final com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode paymentServiceErrorCode, final java.lang.String str) {
        util.h.xy.bu.rb.m25675();
        m25442();
        util.h.xy.ag.a.m24556().m24557(new java.lang.Runnable() { // from class: util.h.xy.bf.mc.2
            private static int getHighSpeedVideoFpsRangesFor = 0;
            private static int getInputSizeshNQ4ISI = 1;
            private static int getOutputFormats = 0;
            private static int getOutputMinFrameDuration = 1;
            private static char[] getInputFormats = {24235, 20104, 32464, 28185, 40000, 35950, 48170, 44178, 56493, 52585, 64823, 60822, 7593, 3705, 15922};
            private static long getHighSpeedVideoSizesFor = 475686285755911230L;

            private static void getHighSpeedVideoSizes(int i, int i2, char c, java.lang.Object[] objArr) {
                util.h.xz.b.rb rbVar = new util.h.xz.b.rb();
                long[] jArr = new long[i];
                rbVar.f2651 = 0;
                while (rbVar.f2651 < i) {
                    jArr[rbVar.f2651] = (((char) (getInputFormats[rbVar.f2651 + i2] ^ 3446303986615426049L)) ^ (rbVar.f2651 * (3446303986615426049L ^ getHighSpeedVideoSizesFor))) ^ c;
                    rbVar.f2651++;
                    getHighSpeedVideoFpsRangesFor = (getOutputMinFrameDuration + 65) % 128;
                }
                char[] cArr = new char[i];
                rbVar.f2651 = 0;
                getHighSpeedVideoFpsRangesFor = (getOutputMinFrameDuration + 43) % 128;
                while (rbVar.f2651 < i) {
                    cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
                    rbVar.f2651++;
                }
                objArr[0] = new java.lang.String(cArr);
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i = getOutputFormats + 49;
                getInputSizeshNQ4ISI = i % 128;
                if (i % 2 == 0) {
                    throw null;
                }
                util.h.xy.bf.mc.getHighSpeedVideoSizes();
                int indexOf = android.text.TextUtils.indexOf("", "", 0);
                byte modifierMetaStateMask = (byte) android.view.KeyEvent.getModifierMetaStateMask();
                getOutputFormats = (getInputSizeshNQ4ISI + 113) % 128;
                try {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    getHighSpeedVideoSizes(indexOf + 4, modifierMetaStateMask + 1, (char) (((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6) + 49894), objArr);
                    java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    getHighSpeedVideoSizes(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 11, 4 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22), (char) (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22), objArr2);
                    util.h.xy.am.ma.m25029(intern, ((java.lang.String) objArr2[0]).intern());
                    paymentServiceListener.onError(util.h.xy.bf.mc.m25434(paymentServiceErrorCode, str));
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
        });
        int i = getHighSpeedVideoSizes + 81;
        getInputFormats = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private static void getHighSpeedVideoFpsRangesFor(boolean z, int[] iArr, java.lang.String str, java.lang.Object[] objArr) {
        byte[] bytes = str.getBytes("ISO-8859-1");
        util.h.xz.b.ma maVar = new util.h.xz.b.ma();
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        char[] cArr = Camera2StreamConfigurationMap;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i5 = 0; i5 < length; i5++) {
                getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 29) % 128;
                cArr2[i5] = (char) (cArr[i5] ^ (-8125198844289309347L));
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i2];
        java.lang.System.arraycopy(cArr, i, cArr3, 0, i2);
        if (bytes != null) {
            getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 5) % 128;
            char[] cArr4 = new char[i2];
            maVar.f2631 = 0;
            char c = 0;
            while (maVar.f2631 < i2) {
                getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 29) % 128;
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
        if (i4 > 0) {
            char[] cArr5 = new char[i2];
            java.lang.System.arraycopy(cArr3, 0, cArr5, 0, i2);
            int i6 = i2 - i4;
            java.lang.System.arraycopy(cArr5, 0, cArr3, i6, i4);
            java.lang.System.arraycopy(cArr5, i4, cArr3, 0, i6);
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 105) % 128;
        }
        if (z) {
            getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 97) % 128;
            char[] cArr6 = new char[i2];
            maVar.f2631 = 0;
            while (maVar.f2631 < i2) {
                cArr6[maVar.f2631] = cArr3[(i2 - maVar.f2631) - 1];
                maVar.f2631++;
            }
            cArr3 = cArr6;
        }
        if (i3 > 0) {
            maVar.f2631 = 0;
            while (maVar.f2631 < i2) {
                cArr3[maVar.f2631] = (char) (cArr3[maVar.f2631] - iArr[2]);
                maVar.f2631++;
            }
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static boolean m25433() {
        getHighSpeedVideoSizes = (getInputFormats + 83) % 128;
        if (util.h.xy.av.ra.m25240(util.h.xy.ag.a.m24556().m24558())) {
            getHighSpeedVideoSizes = (getInputFormats + 43) % 128;
            return true;
        }
        getInputFormats = (getHighSpeedVideoSizes + 65) % 128;
        return false;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static void m25436(com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode paymentServiceErrorCode, java.lang.String str) {
        util.h.xy.bk.ma.m25504().m25505(util.h.xy.bk.b.f979, new util.h.xy.bk.ra(m25434(paymentServiceErrorCode, str)));
        getHighSpeedVideoSizes = (getInputFormats + 101) % 128;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m25438(long j, final int i) {
        getHighSpeedVideoSizesFor = new android.os.CountDownTimer(j) { // from class: util.h.xy.bf.mc.5
            private static int getHighSpeedVideoFpsRanges = 1;
            private static int getHighSpeedVideoFpsRangesFor;

            @Override // android.os.CountDownTimer
            public final void onTick(long j2) {
                int i2 = getHighSpeedVideoFpsRanges + 81;
                getHighSpeedVideoFpsRangesFor = i2 % 128;
                if (i2 % 2 == 0) {
                    util.h.xy.bf.mc.getHighSpeedVideoSizes();
                } else {
                    util.h.xy.bf.mc.getHighSpeedVideoSizes();
                    throw null;
                }
            }

            @Override // android.os.CountDownTimer
            public final void onFinish() {
                int i2 = getHighSpeedVideoFpsRanges + 105;
                getHighSpeedVideoFpsRangesFor = i2 % 128;
                if (i2 % 2 == 0) {
                    util.h.xy.bf.mc.getHighSpeedVideoSizes();
                    util.h.xy.bf.mc.Camera2StreamConfigurationMap(util.h.xy.bf.mc.this);
                    if (util.h.xy.bf.mc.Camera2StreamConfigurationMap(util.h.xy.bf.mc.this)) {
                        if (com.gemalto.mfs.mwsdk.payment.PaymentSettings.getDisableDeactivationOnPosDisconnect() == 0) {
                            int i3 = getHighSpeedVideoFpsRanges;
                            int i4 = (i3 ^ 79) + ((i3 & 79) << 1);
                            getHighSpeedVideoFpsRangesFor = i4 % 128;
                            if (i4 % 2 == 0) {
                                util.h.xy.bu.b.f1050.m25641(i);
                            } else {
                                util.h.xy.bu.b.f1050.m25641(i);
                                throw new java.lang.ArithmeticException();
                            }
                        }
                        util.h.xy.bf.ma.m25423(util.h.xy.bf.c.f934.m25413());
                        util.h.xy.bf.mc.getHighSpeedVideoSizes(util.h.xy.bf.mc.this);
                        int i5 = getHighSpeedVideoFpsRanges;
                        getHighSpeedVideoFpsRangesFor = ((i5 & 37) + (i5 | 37)) % 128;
                        return;
                    }
                    return;
                }
                util.h.xy.bf.mc.getHighSpeedVideoSizes();
                util.h.xy.bf.mc.Camera2StreamConfigurationMap(util.h.xy.bf.mc.this);
                util.h.xy.bf.mc.Camera2StreamConfigurationMap(util.h.xy.bf.mc.this);
                throw null;
            }
        }.start();
        getHighSpeedVideoSizes = (getInputFormats + 25) % 128;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m25442() {
        int i = (getInputFormats + 117) % 128;
        getHighSpeedVideoSizes = i;
        android.os.CountDownTimer countDownTimer = getHighSpeedVideoSizesFor;
        if (countDownTimer != null) {
            int i2 = i + 101;
            getInputFormats = i2 % 128;
            this.getOutputMinFrameDuration = i2 % 2 != 0;
            countDownTimer.cancel();
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m25439(boolean z) {
        int i = (getInputFormats + 117) % 128;
        getHighSpeedVideoSizes = i;
        this.getOutputMinFrameDuration = z;
        getInputFormats = (i + 117) % 128;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m25440(long j) {
        java.util.TimerTask timerTask = new java.util.TimerTask() { // from class: util.h.xy.bf.mc.4
            private static int getHighSpeedVideoFpsRangesFor = 1;
            private static int getHighSpeedVideoSizes;

            @Override // java.util.TimerTask, java.lang.Runnable
            public final void run() {
                getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 95) % 128;
                util.h.xy.bf.mc.getHighSpeedVideoSizes();
                util.h.xy.bf.mb.f938.m25426().m25392(false);
                getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 61) % 128;
            }
        };
        java.util.Timer timer = new java.util.Timer();
        getInputSizeshNQ4ISI = timer;
        timer.schedule(timerTask, j);
        int i = getInputFormats + 43;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m25437() {
        java.util.Timer timer = getInputSizeshNQ4ISI;
        if (timer != null) {
            getInputFormats = (getHighSpeedVideoSizes + 19) % 128;
            timer.cancel();
            getHighSpeedVideoSizes = (getInputFormats + 95) % 128;
        }
    }

    static void getHighSpeedVideoFpsRangesFor() {
        Camera2StreamConfigurationMap = new char[]{42453, 42063, 42071, 42069, 42064, 42071, 42408, 42409, 42071, 42069, 42071, 42074, 42403, 42075, 42065, 42078, 42072, 42402, 42342, 42290, 42299, 42297, 42271, 42365, 42260, 42288, 42294, 42287, 42285, 42293, 42271, 42268, 42302, 42271, 42269, 42303, 42294, 42291, 42290, 42294, 42295, 42289, 42297, 42271, 42269, 42295, 42263, 42263, 42291, 42293, 42291, 42260, 42261, 42290, 42289, 42294, 42284, 42253, 42271, 42297, 42285, 42291, 42295, 42270, 42340, 42302, 42295, 42295, 42289, 42244, 42243, 42266, 42341, 42245, 42288, 42286, 42292, 42292, 42284, 42263, 42340, 42241, 42294, 42264, 42450, 42454, 42462, 42458, 42453, 42453, 42451, 42449, 42275, 42285, 42299, 42273, 42444, 42444, 42449, 42457, 42459, 42280, 42272, 42448, 42448, 42295, 42294, 42447, 42450, 42293, 42295, 42450, 42296, 42302, 42455, 42449, 42450, 42448, 42279, 42275, 42450, 42280, 42417, 42412, 42409, 42422, 42421, 42420, 42424};
    }
}
