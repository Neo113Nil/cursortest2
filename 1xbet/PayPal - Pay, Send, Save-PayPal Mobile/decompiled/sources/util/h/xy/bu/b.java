package util.h.xy.bu;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes5.dex */
public final class b {
    private static int Camera2StreamConfigurationMap = 0;
    static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static char getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    static int getHighSpeedVideoSizes = 1;
    private static char getHighSpeedVideoSizesFor;
    private static final /* synthetic */ util.h.xy.bu.b[] getInputFormats;
    private static final java.lang.String getInputSizeshNQ4ISI;
    private static int[] getOutputFormats;
    private static char getOutputMinFrameDuration;
    private static char getOutputSizes;

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static final util.h.xy.bu.b f1050;
    private transient com.gemalto.mfs.mwsdk.payment.engine.PaymentService getOutputMinFrameDurationlomOqCM;
    private boolean getOutputStallDuration = false;

    private b(java.lang.String str) {
    }

    static /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges() {
        int i = getHighResolutionOutputSizeshNQ4ISI + 21;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 != 0) {
            return getInputSizeshNQ4ISI;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0085, code lost:
    
        if (r19 == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0093, code lost:
    
        r1 = util.h.xy.ag.a.m24556().m24558();
        r7 = new java.lang.Object[1];
        Camera2StreamConfigurationMap("⑈\uefdb棉㯖➙㊎\ud869쿦쐴镶哓•\udc64鲱", android.text.TextUtils.getOffsetAfter("", 0) + 14, r7);
        r6 = ((java.lang.String) r7[0]).intern();
        r8 = new java.lang.Object[1];
        Camera2StreamConfigurationMap("糊ꁧ軔띜", (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 4, r8);
        util.h.xy.av.ra.m25239(r1, r6, ((java.lang.String) r8[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0091, code lost:
    
        if (r19 == false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ void getHighSpeedVideoFpsRanges(util.h.xy.bu.b bVar, java.lang.String str, com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType, boolean z, com.gemalto.mfs.mwsdk.payment.PaymentServiceListener paymentServiceListener, com.gemalto.mfs.mwsdk.payment.engine.CardActivationListener cardActivationListener) {
        getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 125) % 128;
        if (paymentServiceListener == null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes(new int[]{2004080613, -944061872, 345035845, -1762175475, 1456631790, -1975720927, -41505768, -1246305857, -957198732, -305377390, -764251324, -604220547}, 22 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
        }
        if (cardActivationListener == null) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            Camera2StreamConfigurationMap("춼闃뾒䩬퐤⮨溵뷅ⴱ䫁䢳뮰濶쩩\uf6f1姻␁\u1f47싎ផ擞愔⡖㥫ᇸᲲ쳫頕䱾\uece2䠻쉙ﯙ鑰蜦\uf1ca넮ᛗ", (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 37, objArr2);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr2[0]).intern());
        }
        try {
            if (bVar.getOutputMinFrameDurationlomOqCM != null) {
                if (util.h.xy.k.ra.f2243.m26968(str)) {
                    int i = getHighSpeedVideoSizes + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                    getHighResolutionOutputSizeshNQ4ISI = i % 128;
                    int i2 = i % 2;
                    getHighSpeedVideoFpsRanges(cardActivationListener, paymentServiceListener, paymentType);
                    if (i2 != 0) {
                        throw null;
                    }
                } else {
                    ((util.h.xy.bq.a) bVar.getOutputMinFrameDurationlomOqCM).mo25546(false, util.h.xy.bf.mb.f938.m25426().m25391());
                    boolean[] zArr = {true};
                    if (util.h.xy.m.mb.m26975(util.h.xy.ag.a.m24556().m24558()).mo26171(str, paymentType).isSuccessful()) {
                        int i3 = getHighResolutionOutputSizeshNQ4ISI + 79;
                        getHighSpeedVideoSizes = i3 % 128;
                        if (i3 % 2 == 0) {
                            zArr[0] = true;
                            ((util.h.xy.bq.b) bVar.getOutputMinFrameDurationlomOqCM).m25565(str);
                        } else {
                            zArr[0] = true;
                            ((util.h.xy.bq.b) bVar.getOutputMinFrameDurationlomOqCM).m25565(str);
                        }
                    } else {
                        zArr[0] = false;
                        if (cardActivationListener != null) {
                            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 71) % 128;
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            getHighSpeedVideoSizes(new int[]{1294549764, 1768204077}, 4 - (android.view.KeyEvent.getMaxKeyCode() >> 16), objArr3);
                            java.lang.String intern = ((java.lang.String) objArr3[0]).intern();
                            java.lang.Object[] objArr4 = new java.lang.Object[1];
                            getHighSpeedVideoSizes(new int[]{393980681, 243149336, -896548388, -1761932836, -1772545113, 759016055, 727314669, 215694683}, 13 - ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6), objArr4);
                            util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr4[0]).intern());
                            cardActivationListener.onCardActivated(com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.CARD_SET_DEFAULT_FAILED);
                        }
                    }
                    if (zArr[0]) {
                        bVar.getHighSpeedVideoFpsRangesFor(null, paymentType, cardActivationListener, paymentServiceListener);
                    }
                }
            } else if (cardActivationListener != null) {
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                getHighSpeedVideoSizes(new int[]{1294549764, 1768204077}, (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)) + 3, objArr5);
                java.lang.String intern2 = ((java.lang.String) objArr5[0]).intern();
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                getHighSpeedVideoSizes(new int[]{393980681, 243149336, -896548388, -1761932836, 1803113894, -526686293, 727314669, 215694683}, (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 12, objArr6);
                util.h.xy.am.ma.m25027(intern2, ((java.lang.String) objArr6[0]).intern());
                cardActivationListener.onCardActivated(com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.CARD_ACTIVATION_FAILED);
            }
            int i4 = getHighSpeedVideoSizes + 77;
            getHighResolutionOutputSizeshNQ4ISI = i4 % 128;
            if (i4 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public static util.h.xy.bu.b valueOf(java.lang.String str) {
        getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 57) % 128;
        util.h.xy.bu.b bVar = (util.h.xy.bu.b) java.lang.Enum.valueOf(util.h.xy.bu.b.class, str);
        int i = getHighSpeedVideoSizes + 111;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            return bVar;
        }
        throw null;
    }

    public static util.h.xy.bu.b[] values() {
        getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 109) % 128;
        util.h.xy.bu.b[] bVarArr = (util.h.xy.bu.b[]) getInputFormats.clone();
        int i = getHighSpeedVideoSizes + 15;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            return bVarArr;
        }
        throw null;
    }

    static {
        getHighSpeedVideoSizes();
        java.lang.Object[] objArr = new java.lang.Object[1];
        Camera2StreamConfigurationMap("漺訣ᷚᏻ턀炥ￜ溠", android.graphics.ImageFormat.getBitsPerPixel(0) + 9, objArr);
        util.h.xy.bu.b bVar = new util.h.xy.bu.b(((java.lang.String) objArr[0]).intern());
        f1050 = bVar;
        int i = (getHighResolutionOutputSizeshNQ4ISI + 93) % 128;
        getHighSpeedVideoSizes = i;
        util.h.xy.bu.b[] bVarArr = {bVar};
        int i2 = i + 7;
        int i3 = i2 % 128;
        getHighResolutionOutputSizeshNQ4ISI = i3;
        if (i2 % 2 == 0) {
            getInputFormats = bVarArr;
            getInputSizeshNQ4ISI = util.h.xy.cb.b.f1091;
            getHighSpeedVideoSizes = (i3 + 51) % 128;
            return;
        }
        throw new java.lang.ArithmeticException();
    }

    final void getHighSpeedVideoFpsRangesFor(util.h.xy.d.md mdVar, com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType, com.gemalto.mfs.mwsdk.payment.PaymentServiceListener paymentServiceListener) {
        com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode paymentServiceErrorCode;
        java.lang.Object obj;
        getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 91) % 128;
        if (util.h.xy.ag.a.m24556().m24560()) {
            m25641(99);
            getHighSpeedVideoFpsRangesFor(mdVar, paymentType, null, paymentServiceListener);
            return;
        }
        int i = (getHighResolutionOutputSizeshNQ4ISI + 17) % 128;
        getHighSpeedVideoSizes = i;
        if (paymentServiceListener != null) {
            int i2 = i + 113;
            getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
            if (i2 % 2 != 0) {
                paymentServiceErrorCode = com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.PAYMENT_NOT_ALLOWED_SDK_NOT_INITIALIZED;
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoSizes(new int[]{794071231, 1124419668, 101886589, -127323590, -1541244725, -1518335330, -1558935983, 103576075, -2134186390, 1756756542, -2028338404, 928983294, -98656299, 1647196798, -1007166568, 576935316}, 51 >>> android.graphics.Color.argb(0, 0, 1, 1), objArr);
                obj = objArr[0];
            } else {
                paymentServiceErrorCode = com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.PAYMENT_NOT_ALLOWED_SDK_NOT_INITIALIZED;
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoSizes(new int[]{794071231, 1124419668, 101886589, -127323590, -1541244725, -1518335330, -1558935983, 103576075, -2134186390, 1756756542, -2028338404, 928983294, -98656299, 1647196798, -1007166568, 576935316}, 32 - android.graphics.Color.argb(0, 0, 0, 0), objArr2);
                obj = objArr2[0];
            }
            util.h.xy.bf.ma.m25415(paymentServiceListener, paymentServiceErrorCode, ((java.lang.String) obj).intern());
        }
    }

    static void getHighSpeedVideoSizes(int[] iArr, int i, java.lang.Object[] objArr) {
        util.h.xz.b.c cVar = new util.h.xz.b.c();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = getOutputFormats;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            for (int i2 = 0; i2 < length; i2++) {
                Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 23) % 128;
                iArr3[i2] = (int) (iArr2[i2] ^ (-5569649899877129369L));
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = getOutputFormats;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i3 = 0;
            while (i3 < length3) {
                int i4 = Camera2StreamConfigurationMap + 27;
                getHighSpeedVideoFpsRangesFor = i4 % 128;
                if (i4 % 2 == 0) {
                    iArr6[i3] = (int) (iArr5[i3] + 5569649899877129369L);
                    i3 %= 1;
                } else {
                    iArr6[i3] = (int) (iArr5[i3] ^ (-5569649899877129369L));
                    i3++;
                }
            }
            iArr5 = iArr6;
        }
        java.lang.System.arraycopy(iArr5, 0, iArr4, 0, length2);
        cVar.f2626 = 0;
        while (cVar.f2626 < iArr.length) {
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 11) % 128;
            cArr[0] = (char) (iArr[cVar.f2626] >> 16);
            cArr[1] = (char) iArr[cVar.f2626];
            cArr[2] = (char) (iArr[cVar.f2626 + 1] >> 16);
            cArr[3] = (char) iArr[cVar.f2626 + 1];
            cVar.f2627 = (cArr[0] << 16) + cArr[1];
            cVar.f2625 = (cArr[2] << 16) + cArr[3];
            util.h.xz.b.c.m27723(iArr4);
            for (int i5 = 0; i5 < 16; i5++) {
                getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 85) % 128;
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

    final void Camera2StreamConfigurationMap(final java.lang.String str, final com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType, final boolean z, final com.gemalto.mfs.mwsdk.payment.PaymentServiceListener paymentServiceListener, final com.gemalto.mfs.mwsdk.payment.engine.CardActivationListener cardActivationListener) {
        if (!util.h.xy.ag.a.m24556().m24560()) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 93) % 128;
            if (paymentServiceListener != null) {
                com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode paymentServiceErrorCode = com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.PAYMENT_NOT_ALLOWED_SDK_NOT_INITIALIZED;
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoSizes(new int[]{794071231, 1124419668, 101886589, -127323590, -1541244725, -1518335330, -1558935983, 103576075, -2134186390, 1756756542, -2028338404, 928983294, -98656299, 1647196798, -1007166568, 576935316}, 32 - android.view.KeyEvent.keyCodeFromString(""), objArr);
                util.h.xy.bf.ma.m25415(paymentServiceListener, paymentServiceErrorCode, ((java.lang.String) objArr[0]).intern());
                return;
            }
            return;
        }
        if (str != null) {
            new java.lang.Thread(new java.lang.Runnable() { // from class: util.h.xy.bu.b.3
                private static int getInputSizeshNQ4ISI = 0;
                private static int getOutputFormats = 1;

                @Override // java.lang.Runnable
                public final void run() {
                    int i = getOutputFormats;
                    getInputSizeshNQ4ISI = ((i & 97) + (i | 97)) % 128;
                    util.h.xy.bu.b.getHighSpeedVideoFpsRanges(util.h.xy.bu.b.this, str, paymentType, z, paymentServiceListener, cardActivationListener);
                    int i2 = getInputSizeshNQ4ISI;
                    getOutputFormats = ((i2 ^ 23) + ((i2 & 23) << 1)) % 128;
                }
            }).start();
            return;
        }
        int i = getHighSpeedVideoSizes + 27;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
        if (paymentServiceListener != null) {
            com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode paymentServiceErrorCode2 = com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.CARD_NOT_EXISTING;
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            Camera2StreamConfigurationMap("솚⠨溵뷅ߋ珱ᇸᲲߋ珱濶쩩ⴱ䫁ᇸᲲ禙\uf08bㅂ㎁ﺽ붟\uec55淼秇褼冬䁬榦털ꩁ⟳옵曚ㅂ㎁춽\udf52꣘毀秇褼", 42 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr2);
            util.h.xy.bf.ma.m25415(paymentServiceListener, paymentServiceErrorCode2, ((java.lang.String) objArr2[0]).intern());
        }
    }

    static void Camera2StreamConfigurationMap(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2 = Camera2StreamConfigurationMap + 83;
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        char[] charArray = str.toCharArray();
        util.h.xz.b.e eVar = new util.h.xz.b.e();
        char[] cArr = new char[charArray.length];
        eVar.f2630 = 0;
        char[] cArr2 = new char[2];
        while (eVar.f2630 < charArray.length) {
            int i3 = Camera2StreamConfigurationMap + 67;
            getHighSpeedVideoFpsRangesFor = i3 % 128;
            if (i3 % 2 == 0) {
                cArr2[0] = charArray[eVar.f2630];
                cArr2[1] = charArray[eVar.f2630 - 1];
            } else {
                cArr2[0] = charArray[eVar.f2630];
                cArr2[1] = charArray[eVar.f2630 + 1];
            }
            int i4 = 58224;
            int i5 = 0;
            while (i5 < 16) {
                char c = cArr2[1];
                char c2 = cArr2[0];
                char c3 = (char) (c - (((c2 + i4) ^ ((c2 << 4) + ((char) (getHighSpeedVideoSizesFor ^ 3155153533016530592L)))) ^ ((c2 >>> 5) + ((char) (getOutputMinFrameDuration ^ 3155153533016530592L)))));
                cArr2[1] = c3;
                cArr2[0] = (char) (c2 - ((((c3 << 4) + ((char) (getOutputSizes ^ 3155153533016530592L))) ^ (c3 + i4)) ^ ((c3 >>> 5) + ((char) (getHighSpeedVideoFpsRanges ^ 3155153533016530592L)))));
                i4 -= 40503;
                i5++;
                Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 101) % 128;
            }
            cArr[eVar.f2630] = cArr2[0];
            cArr[eVar.f2630 + 1] = cArr2[1];
            eVar.f2630 += 2;
            getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 91) % 128;
        }
        objArr[0] = new java.lang.String(cArr, 0, i);
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final com.gemalto.mfs.mwsdk.payment.engine.PaymentService m25639() {
        int i = getHighResolutionOutputSizeshNQ4ISI + 81;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 != 0) {
            if (m25643()) {
                return this.getOutputMinFrameDurationlomOqCM;
            }
            int i2 = getHighResolutionOutputSizeshNQ4ISI + 15;
            getHighSpeedVideoSizes = i2 % 128;
            if (i2 % 2 != 0) {
                return null;
            }
            throw null;
        }
        m25643();
        throw null;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final com.gemalto.mfs.mwsdk.payment.engine.PaymentService m25642() {
        int i = (getHighSpeedVideoSizes + 115) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i;
        com.gemalto.mfs.mwsdk.payment.engine.PaymentService paymentService = this.getOutputMinFrameDurationlomOqCM;
        getHighSpeedVideoSizes = (i + 113) % 128;
        return paymentService;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final com.gemalto.mfs.mwsdk.payment.engine.TransactionContext m25641(int i) {
        com.gemalto.mfs.mwsdk.payment.engine.TransactionContext transactionContext;
        com.gemalto.mfs.mwsdk.payment.engine.TransactionContext transactionContext2;
        boolean z;
        synchronized (this) {
            int i2 = getHighSpeedVideoSizes + 3;
            getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
            if (i2 % 2 != 0) {
                throw new java.lang.NullPointerException();
            }
            com.gemalto.mfs.mwsdk.payment.engine.PaymentService paymentService = this.getOutputMinFrameDurationlomOqCM;
            transactionContext = null;
            if (paymentService != null) {
                if (paymentService.isActivated()) {
                    if (i != 0) {
                        int i3 = (getHighResolutionOutputSizeshNQ4ISI + 55) % 128;
                        getHighSpeedVideoSizes = i3;
                        z = true;
                        if (i != 1) {
                            getHighResolutionOutputSizeshNQ4ISI = (i3 + 43) % 128;
                            transactionContext2 = ((util.h.xy.bq.b) this.getOutputMinFrameDurationlomOqCM).mo25546(z, false);
                        }
                    }
                    z = false;
                    transactionContext2 = ((util.h.xy.bq.b) this.getOutputMinFrameDurationlomOqCM).mo25546(z, false);
                } else {
                    transactionContext2 = null;
                }
                this.getOutputMinFrameDurationlomOqCM = null;
                f1050.m25645();
                transactionContext = transactionContext2;
            }
            util.h.xy.bf.mb.f938.m25429();
            util.h.xy.bf.mb.f938.m25427(false);
        }
        return transactionContext;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final boolean m25643() {
        int i = getHighSpeedVideoSizes + 29;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
        com.gemalto.mfs.mwsdk.payment.engine.PaymentService paymentService = this.getOutputMinFrameDurationlomOqCM;
        if (paymentService == null) {
            return false;
        }
        boolean isActivated = paymentService.isActivated();
        int i2 = getHighResolutionOutputSizeshNQ4ISI + 125;
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 != 0) {
            return isActivated;
        }
        throw null;
    }

    private void getHighSpeedVideoFpsRangesFor(util.h.xy.d.md mdVar, com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType, com.gemalto.mfs.mwsdk.payment.engine.CardActivationListener cardActivationListener, final com.gemalto.mfs.mwsdk.payment.PaymentServiceListener paymentServiceListener) {
        boolean z = false;
        if (paymentServiceListener == null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes(new int[]{2004080613, -944061872, 345035845, -1762175475, 1456631790, -1975720927, -41505768, -1246305857, -957198732, -305377390, -764251324, -604220547}, (-16777193) - android.graphics.Color.rgb(0, 0, 0), objArr);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
        }
        if (util.h.xy.bq.b.m25556(paymentType, mdVar) || paymentType == com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS) {
            if (mdVar != null && util.h.xy.k.ra.f2243.m26940(mdVar.getTokenizedCardID()).booleanValue()) {
                z = true;
            }
            if (!getHighSpeedVideoSizes(z, paymentType, paymentServiceListener)) {
                int i = getHighSpeedVideoSizes + 83;
                getHighResolutionOutputSizeshNQ4ISI = i % 128;
                if (i % 2 != 0) {
                    throw new java.lang.ArithmeticException();
                }
                return;
            }
        }
        boolean m25624 = new util.h.xy.bt.mb(paymentType, mdVar, util.h.xy.bt.mb.ra.f1042, new util.h.xy.bt.a() { // from class: util.h.xy.bu.b.4
            private static int Camera2StreamConfigurationMap = 0;
            private static int getHighResolutionOutputSizeshNQ4ISI = 1;
            private boolean getInputFormats = false;
            private int getInputSizeshNQ4ISI = 0;
            private java.lang.String getHighSpeedVideoFpsRanges = "";
            private java.lang.Throwable getOutputFormats = null;

            @Override // util.h.xy.bt.a
            /* renamed from: ˏ */
            public final void mo25464(int i2, java.lang.String str, java.lang.Throwable th) {
                int i3 = getHighResolutionOutputSizeshNQ4ISI;
                Camera2StreamConfigurationMap = (i3 + 75) % 128;
                if (this.getInputFormats) {
                    return;
                }
                this.getInputFormats = true;
                this.getInputSizeshNQ4ISI = i2;
                this.getHighSpeedVideoFpsRanges = str;
                this.getOutputFormats = th;
                Camera2StreamConfigurationMap = (i3 + 85) % 128;
            }

            @Override // util.h.xy.bt.a
            /* renamed from: ˏ */
            public final void mo25566() {
                int i2 = getHighResolutionOutputSizeshNQ4ISI;
                Camera2StreamConfigurationMap = (((i2 | 99) << 1) - (i2 ^ 99)) % 128;
                if (this.getInputFormats) {
                    int i3 = i2 + 17;
                    Camera2StreamConfigurationMap = i3 % 128;
                    if (i3 % 2 != 0) {
                        throw new java.lang.ArithmeticException();
                    }
                    int i4 = this.getInputSizeshNQ4ISI;
                    if (i4 == 1) {
                        util.h.xy.bf.ma.m25415(paymentServiceListener, com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.CARD_ACTIVATION_FAILED, this.getHighSpeedVideoFpsRanges);
                        Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 39) % 128;
                    } else {
                        if (i4 != 2) {
                            if (i4 != 3) {
                                return;
                            }
                            util.h.xy.bf.ma.m25415(paymentServiceListener, com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.OPERATION_NOT_ALLOWED, this.getHighSpeedVideoFpsRanges);
                            Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 65) % 128;
                            return;
                        }
                        util.h.xy.bu.b.getHighSpeedVideoFpsRanges();
                        util.h.xy.bf.ma.m25415(paymentServiceListener, com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.UNSUPPORTED_CARD_TYPE, this.getHighSpeedVideoFpsRanges);
                        int i5 = Camera2StreamConfigurationMap;
                        getHighResolutionOutputSizeshNQ4ISI = (((i5 | 51) << 1) - (i5 ^ 51)) % 128;
                    }
                }
            }
        }).m25624(paymentServiceListener, cardActivationListener);
        if (m25624 && paymentType == com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS) {
            getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 45) % 128;
            if (util.h.xy.f.b.f2201.m26755(util.h.xy.f.a.f2193)) {
                new util.h.xy.bt.b().m25622(null);
            }
        }
        if (m25624) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 85) % 128;
            if (!m25644()) {
                new util.h.xy.bt.ra(paymentType, mdVar, util.h.xy.bt.ra.a.f1045, new util.h.xy.bt.a() { // from class: util.h.xy.bu.b.2
                    private static int Camera2StreamConfigurationMap = 0;
                    private static int getHighSpeedVideoFpsRanges = 1;
                    private boolean getOutputMinFrameDuration = false;
                    private int getHighResolutionOutputSizeshNQ4ISI = 0;
                    private java.lang.String getHighSpeedVideoSizesFor = "";
                    private java.lang.Throwable getInputSizeshNQ4ISI = null;

                    @Override // util.h.xy.bt.a
                    /* renamed from: ˏ */
                    public final void mo25464(int i2, java.lang.String str, java.lang.Throwable th) {
                        int i3 = getHighSpeedVideoFpsRanges;
                        int i4 = (((i3 | 55) << 1) - (i3 ^ 55)) % 128;
                        Camera2StreamConfigurationMap = i4;
                        if (!this.getOutputMinFrameDuration) {
                            getHighSpeedVideoFpsRanges = ((i4 & 61) + (i4 | 61)) % 128;
                            if (i2 != 7) {
                                this.getOutputMinFrameDuration = true;
                                this.getHighResolutionOutputSizeshNQ4ISI = i2;
                                this.getHighSpeedVideoSizesFor = str;
                                this.getInputSizeshNQ4ISI = th;
                                return;
                            }
                        }
                        int i5 = getHighSpeedVideoFpsRanges;
                        int i6 = ((i5 | 109) << 1) - (i5 ^ 109);
                        Camera2StreamConfigurationMap = i6 % 128;
                        if (i6 % 2 != 0) {
                            throw null;
                        }
                    }

                    @Override // util.h.xy.bt.a
                    /* renamed from: ˏ */
                    public final void mo25566() {
                        int i2 = getHighSpeedVideoFpsRanges;
                        Camera2StreamConfigurationMap = (i2 + 57) % 128;
                        if (this.getOutputMinFrameDuration) {
                            int i3 = ((i2 | 101) << 1) - (i2 ^ 101);
                            Camera2StreamConfigurationMap = i3 % 128;
                            if (i3 % 2 == 0) {
                                util.h.xy.bu.b.m25638(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizesFor, paymentServiceListener);
                            } else {
                                util.h.xy.bu.b.m25638(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizesFor, paymentServiceListener);
                                throw null;
                            }
                        }
                        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 67) % 128;
                    }
                }).m25628();
            }
        }
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 51) % 128;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static void m25638(int i, java.lang.String str, com.gemalto.mfs.mwsdk.payment.PaymentServiceListener paymentServiceListener) {
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 117) % 128;
        switch (i) {
            case 1:
                util.h.xy.bf.ma.m25415(paymentServiceListener, com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.PAYMENT_WRONG_STATE, str);
                break;
            case 2:
                util.h.xy.bf.ma.m25415(paymentServiceListener, com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.UNSUPPORTED_CARD_TYPE, str);
                break;
            case 3:
                util.h.xy.bf.ma.m25415(paymentServiceListener, com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.OPERATION_NOT_ALLOWED, str);
                break;
            case 4:
                new util.h.xy.bl.ra().m25511(null);
                util.h.xy.bf.ma.m25415(paymentServiceListener, com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.CARD_NOT_EXISTING, str);
                break;
            case 5:
                new util.h.xy.bl.ra().m25511(null);
                util.h.xy.bf.ma.m25415(paymentServiceListener, com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.BIOFP_CONDITION_NOT_SATISFIED, str);
                break;
            case 6:
                util.h.xy.bf.ma.m25415(paymentServiceListener, com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.KEY_STORE_INACCESSIBLE, str);
                break;
            case 7:
                util.h.xy.bf.ma.m25415(paymentServiceListener, com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.USER_NOT_AUTHENTICATED, str);
                break;
            default:
                util.h.xy.bf.ma.m25415(paymentServiceListener, com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.INTERNAL_ERROR, str);
                break;
        }
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 19) % 128;
    }

    final void getHighSpeedVideoFpsRangesFor() {
        int i = getHighResolutionOutputSizeshNQ4ISI + 7;
        int i2 = i % 128;
        getHighSpeedVideoSizes = i2;
        if (i % 2 != 0) {
            if (this.getOutputMinFrameDurationlomOqCM == null) {
                util.h.xy.bf.mb.f938.m25429();
                util.h.xy.bf.mb.f938.m25427(false);
            } else {
                int i3 = i2 + 65;
                getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
                m25641(i3 % 2 != 0 ? 21 : 99);
                f1050.m25645();
            }
            android.content.Context m24558 = util.h.xy.ag.a.m24556().m24558();
            if (util.h.xy.av.ra.m25240(m24558)) {
                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 65) % 128;
                java.lang.Object[] objArr = new java.lang.Object[1];
                Camera2StreamConfigurationMap("⑈\uefdb棉㯖➙㊎\ud869쿦쐴镶哓•\udc64鲱", 14 - android.view.View.resolveSize(0, 0), objArr);
                util.h.xy.av.ra.m25235(m24558, ((java.lang.String) objArr[0]).intern());
                return;
            }
            return;
        }
        throw null;
    }

    private static void getHighSpeedVideoFpsRanges(com.gemalto.mfs.mwsdk.payment.engine.CardActivationListener cardActivationListener, com.gemalto.mfs.mwsdk.payment.PaymentServiceListener paymentServiceListener, com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType) {
        int i = getHighSpeedVideoSizes + 105;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
        try {
            if (cardActivationListener != null) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoSizes(new int[]{1294549764, 1768204077}, (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 4, objArr);
                java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                int[] iArr = {393980681, 243149336, 1662406675, 1721577677, 1803113894, -526686293};
                int i2 = getHighSpeedVideoSizes + 29;
                getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
                if (i2 % 2 != 0) {
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    getHighSpeedVideoSizes(iArr, 11 >>> (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)), objArr2);
                    util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
                    cardActivationListener.onCardActivated(com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.SUCCESS);
                    return;
                }
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighSpeedVideoSizes(iArr, (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)) + 11, objArr3);
                util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr3[0]).intern());
                cardActivationListener.onCardActivated(com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.SUCCESS);
                return;
            }
            if (paymentType == com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS) {
                com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode paymentServiceErrorCode = com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.CARD_ACTIVATION_LISTENER_NOT_IMPLEMENTED;
                int[] iArr2 = {-1039810213, 728330865, -1059184605, 536194261, 1535009264, 1187834219, -1199248797, 299201422, 215821473, -1524592387, 2048170743, -198420643, 2004080613, -944061872, 345035845, -1762175475, 2033612303, 1822301270, 1179996575, -435908595, -1049765069, -290701878, 2022060968, -160935517, 1471327869, -1956183208, -757077686, -1952522079, -380108936, -587141916, 698306516, 675811014, -1590946848, -537647715};
                getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 37) % 128;
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                getHighSpeedVideoSizes(iArr2, 68 - ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6), objArr4);
                util.h.xy.bf.ma.m25415(paymentServiceListener, paymentServiceErrorCode, ((java.lang.String) objArr4[0]).intern());
            }
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    final void getHighSpeedVideoSizes(final com.gemalto.mfs.mwsdk.payment.PaymentServiceListener paymentServiceListener, final com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode paymentServiceErrorCode, final java.lang.String str) {
        util.h.xy.bu.rb.m25675();
        util.h.xy.bf.mc.f939.m25442();
        util.h.xy.ag.a.m24556().m24557(new java.lang.Runnable() { // from class: util.h.xy.bu.b.5
            private static int getHighSpeedVideoFpsRanges = 0;
            private static int getHighSpeedVideoSizesFor = 1;
            private static short[] getInputFormats = null;
            private static byte[] getInputSizeshNQ4ISI = {42, 41, 36, 38, -15, 41, 39, com.visa.cbp.getEncExpo.onUnminimized, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, 37, -63, 34, -40, -40};
            private static int getOutputFormats = -408873052;
            private static int getOutputMinFrameDuration = -394322838;
            private static int getOutputMinFrameDurationlomOqCM = 237635637;
            private static int getOutputSizes = 1;
            private static int getOutputStallDurationlomOqCM;

            /* JADX WARN: Code restructure failed: missing block: B:19:0x0097, code lost:
            
                if (r3 != false) goto L24;
             */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x00ae, code lost:
            
                r3 = 0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:46:0x00a6, code lost:
            
                util.h.xy.bu.b.AnonymousClass5.getHighSpeedVideoFpsRanges = (r8 + 103) % 128;
                r3 = 1;
             */
            /* JADX WARN: Code restructure failed: missing block: B:48:0x00a4, code lost:
            
                if (r3 != false) goto L24;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static void getHighSpeedVideoFpsRangesFor(int i, short s, byte b, int i2, int i3, java.lang.Object[] objArr) {
                boolean z;
                int i4;
                int i5;
                boolean z2;
                int length;
                byte[] bArr;
                int i6;
                util.h.xz.b.me meVar = new util.h.xz.b.me();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                int i7 = i2 + ((int) (getOutputFormats ^ (-2689713159175858216L)));
                if (i7 == -1) {
                    getHighSpeedVideoSizesFor = (getHighSpeedVideoFpsRanges + 61) % 128;
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    byte[] bArr2 = getInputSizeshNQ4ISI;
                    if (bArr2 != null) {
                        int length2 = bArr2.length;
                        byte[] bArr3 = new byte[length2];
                        for (int i8 = 0; i8 < length2; i8++) {
                            bArr3[i8] = (byte) (bArr2[i8] ^ (-2689713159175858216L));
                        }
                        bArr2 = bArr3;
                    }
                    if (bArr2 != null) {
                        int i9 = getHighSpeedVideoFpsRanges;
                        getHighSpeedVideoSizesFor = (i9 + 21) % 128;
                        getHighSpeedVideoSizesFor = (i9 + 93) % 128;
                        i7 = (byte) (((byte) (getInputSizeshNQ4ISI[((int) (getOutputMinFrameDuration ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getOutputFormats ^ (-2689713159175858216L))));
                    } else {
                        i7 = (short) (((short) (getInputFormats[((int) (getOutputMinFrameDuration ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getOutputFormats ^ (-2689713159175858216L))));
                    }
                }
                if (i7 > 0) {
                    int i10 = getHighSpeedVideoSizesFor;
                    int i11 = i10 + 125;
                    getHighSpeedVideoFpsRanges = i11 % 128;
                    if (i11 % 2 != 0) {
                        i4 = ((i + i7) * 4) - ((int) (getOutputMinFrameDuration + 2689713159175858216L));
                    } else {
                        i4 = ((i + i7) - 2) + ((int) (getOutputMinFrameDuration ^ (-2689713159175858216L)));
                    }
                    meVar.f2647 = i4 + i5;
                    meVar.f2644 = (char) (i3 + ((int) (getOutputMinFrameDurationlomOqCM ^ (-2689713159175858216L))));
                    sb.append(meVar.f2644);
                    meVar.f2646 = meVar.f2644;
                    byte[] bArr4 = getInputSizeshNQ4ISI;
                    if (bArr4 != null) {
                        int i12 = getHighSpeedVideoSizesFor + 41;
                        getHighSpeedVideoFpsRanges = i12 % 128;
                        if (i12 % 2 != 0) {
                            length = bArr4.length;
                            bArr = new byte[length];
                            i6 = 1;
                        } else {
                            length = bArr4.length;
                            bArr = new byte[length];
                            i6 = 0;
                        }
                        while (i6 < length) {
                            bArr[i6] = (byte) (bArr4[i6] ^ (-2689713159175858216L));
                            i6++;
                        }
                        bArr4 = bArr;
                    }
                    if (bArr4 != null) {
                        getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizesFor + 35) % 128;
                        z2 = true;
                    } else {
                        getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizesFor + 73) % 128;
                        z2 = false;
                    }
                    meVar.f2645 = 1;
                    while (meVar.f2645 < i7) {
                        getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizesFor + 93) % 128;
                        if (z2) {
                            byte[] bArr5 = getInputSizeshNQ4ISI;
                            meVar.f2647 = meVar.f2647 - 1;
                            meVar.f2644 = (char) (meVar.f2646 + (((byte) (((byte) (bArr5[r9] ^ (-2689713159175858216L))) + s)) ^ b));
                        } else {
                            short[] sArr = getInputFormats;
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
                getOutputStallDurationlomOqCM = (getOutputSizes + 31) % 128;
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) - 266210226, (short) ((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 8), (byte) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), (-119) - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), 376758367 - android.text.TextUtils.getTrimmedLength(""), objArr);
                java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                getOutputStallDurationlomOqCM = (getOutputSizes + 65) % 128;
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor((-266210224) - ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue(), (short) ((-8) - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), (byte) android.view.View.resolveSizeAndState(0, 0, 0), android.view.Gravity.getAbsoluteGravity(0, 0) - 114, 376758371 - android.text.TextUtils.indexOf("", "", 0), objArr2);
                    util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
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
        int i = getHighResolutionOutputSizeshNQ4ISI + 85;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    static com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Boolean> getHighSpeedVideoSizes(com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType) {
        getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 19) % 128;
        try {
            byte[] m24984 = util.h.xy.ak.ma.f84.m24984();
            if (m24984 != null && m24984.length != 0) {
                if (!java.util.Arrays.equals(m24984, com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.QR.getCode()) && !java.util.Arrays.equals(m24984, com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.CONTACTLESS_AND_QR.getCode()) && !java.util.Arrays.equals(m24984, com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.CONTACTLESS_AND_DSRP_AND_QR.getCode())) {
                    if (!java.util.Arrays.equals(m24984, com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.DSRP.getCode()) && !java.util.Arrays.equals(m24984, com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.CONTACTLESS_AND_DSRP.getCode()) && !java.util.Arrays.equals(m24984, com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.CONTACTLESS_AND_DSRP_AND_QR.getCode())) {
                        com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode paymentServiceErrorCode = com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.QR_CODE_PAYMENT_NOT_SUPPORTED;
                        if (paymentType == com.gemalto.mfs.mwsdk.dcm.PaymentType.DSRP) {
                            paymentServiceErrorCode = com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.REMOTE_PAYMENT_NOT_SUPPORTED;
                        }
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        getHighSpeedVideoSizes(new int[]{1474067581, -658745222, -1185391638, 339428589, -1484006421, -1616059718, 1145947244, -2095094455, 2028147267, -31357283, -33216076, 1332341445, 975064577, 706816952, 445652957, 13985003, -1653304387, -1206735766, 1568455568, 949540264, 514268192, 1634492526, -1085241070, -197859276, 1114970660, 205085133}, 52 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr);
                        util.h.xy.an.ra raVar = new util.h.xy.an.ra(java.lang.Boolean.FALSE, true, ((java.lang.String) objArr[0]).intern(), paymentServiceErrorCode.ordinal());
                        int i = getHighResolutionOutputSizeshNQ4ISI + 97;
                        getHighSpeedVideoSizes = i % 128;
                        if (i % 2 != 0) {
                            return raVar;
                        }
                        throw null;
                    }
                    return new util.h.xy.an.ra(java.lang.Boolean.TRUE, true, null);
                }
                com.gemalto.mfs.mwsdk.utils.async.AsyncResult<com.gemalto.mfs.mwsdk.dcm.DigitalizedCardDetails> m26209 = ((util.h.xy.d.md) util.h.xy.k.ra.f2243.m26963(new java.lang.String(util.h.xy.t.mb.f2417.m27446(), util.h.xy.h.a.f2221))).m26209();
                if (m26209.isSuccessful()) {
                    java.lang.String scheme = m26209.getResult().getScheme();
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    getHighSpeedVideoSizes(new int[]{-1978414488, -1162395220, 1625717290, 1589985834, 195119995, -1475526321}, (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 9, objArr2);
                    if (scheme.equalsIgnoreCase(((java.lang.String) objArr2[0]).intern()) && paymentType == com.gemalto.mfs.mwsdk.dcm.PaymentType.QR) {
                        com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode paymentServiceErrorCode2 = com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.QR_CODE_PAYMENT_NOT_SUPPORTED;
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        getHighSpeedVideoSizes(new int[]{1474067581, -658745222, -1185391638, 339428589, -1484006421, -1616059718, 1145947244, -2095094455, 2028147267, -31357283, -33216076, 1332341445, 975064577, 706816952, 445652957, 13985003, -1653304387, -1206735766, 1568455568, 949540264, 514268192, 1634492526, -1085241070, -197859276, 1114970660, 205085133}, android.text.TextUtils.getOffsetBefore("", 0) + 51, objArr3);
                        return new util.h.xy.an.ra(java.lang.Boolean.FALSE, true, ((java.lang.String) objArr3[0]).intern(), paymentServiceErrorCode2.ordinal());
                    }
                }
                return new util.h.xy.an.ra(java.lang.Boolean.TRUE, true, null);
            }
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            Camera2StreamConfigurationMap("㛶앹６\uec7d擞愔\uf6f1姻\ue6af頯㮃⧱뺤朝\ueb81\u0af3濶쩩\uf6f1姻\uec55淼Ⴍ\uf5db", 24 - android.text.TextUtils.getOffsetAfter("", 0), objArr4);
            return new util.h.xy.an.ra(java.lang.Boolean.FALSE, true, ((java.lang.String) objArr4[0]).intern(), com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.NO_DEFAULT_CARD.ordinal());
        } catch (java.lang.Exception e) {
            e.getMessage();
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            getHighSpeedVideoSizes(new int[]{-1715322958, 208270270, -1555740825, 335963905, 234562554, 534946893, 1943827134, -1429209399, 1992612476, -948080869, -1230915127, 1621306552, 2090229084, 1072582747, -1185391638, 339428589, 1303037845, 1349733168, 234562554, 534946893, 644587336, 1405477154, 1694357483, -962590095}, 47 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr5);
            return new util.h.xy.an.ra(java.lang.Boolean.FALSE, true, ((java.lang.String) objArr5[0]).intern(), com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.ERROR_READING_PAYMENT_CHANNEL.ordinal());
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m25646(util.h.xy.bu.ma maVar) {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = i + 51;
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (maVar != null) {
            getHighSpeedVideoSizes = (i + 37) % 128;
            this.getOutputMinFrameDurationlomOqCM = maVar.m25665();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f0, code lost:
    
        if (util.h.xy.f.b.f2201.m26755(util.h.xy.f.a.f2190) == false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean getHighSpeedVideoSizes(boolean z, com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType, com.gemalto.mfs.mwsdk.payment.PaymentServiceListener paymentServiceListener) {
        util.h.xy.f.b bVar;
        com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType2;
        if (!util.h.xy.u.c.m27500(paymentType, z)) {
            com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode paymentServiceErrorCode = com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.NO_DEFAULT_CARD;
            java.lang.Object[] objArr = new java.lang.Object[1];
            Camera2StreamConfigurationMap("釠́ᛍ쭓㟞烍ⴱ䫁옵曚闒と癛迯廓鼉榦털ߋ珱থ줉誠㽞ʬඈ誠㽞넙퐕\ue299\uea88렡鎊ゑ➚ߋ珱街찍䊆珩䱾\uece2䠻쉙ﯙ鑰ߋ珱鵞毵ߋ珱㖬둃６\uec7d擞愔\uf6f1姻\ue6af頯㮃⧱\ude12㷰風\ue82b\uf061맖㳧Ḥឌ㿌终㮠", android.view.View.getDefaultSize(0, 0) + 78, objArr);
            util.h.xy.bf.ma.m25415(paymentServiceListener, paymentServiceErrorCode, ((java.lang.String) objArr[0]).intern());
            return false;
        }
        try {
            java.lang.String m26922 = util.h.xy.k.b.m26922(paymentType);
            if (!util.h.xy.u.c.m27504(m26922, z)) {
                getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 7) % 128;
                util.h.xy.d.b m26923 = util.h.xy.k.b.m26923(m26922);
                if (m26923 == null) {
                    int i = getHighResolutionOutputSizeshNQ4ISI + 5;
                    getHighSpeedVideoSizes = i % 128;
                    if (i % 2 == 0) {
                        com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode paymentServiceErrorCode2 = com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.CARD_OUT_OF_PAYMENT_KEYS;
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        getHighSpeedVideoSizes(new int[]{-1348199891, -488593489, -250721183, -393769540, -68357775, -150508735, 703374591, -970817423, 1604307027, -851595125, 514268192, 1634492526, 1053772524, -357674820}, 6 >> (android.view.ViewConfiguration.getScrollBarFadeDuration() / 57), objArr2);
                        util.h.xy.bf.ma.m25415(paymentServiceListener, paymentServiceErrorCode2, ((java.lang.String) objArr2[0]).intern());
                        return true;
                    }
                    com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode paymentServiceErrorCode3 = com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.CARD_OUT_OF_PAYMENT_KEYS;
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    getHighSpeedVideoSizes(new int[]{-1348199891, -488593489, -250721183, -393769540, -68357775, -150508735, 703374591, -970817423, 1604307027, -851595125, 514268192, 1634492526, 1053772524, -357674820}, (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 26, objArr3);
                    util.h.xy.bf.ma.m25415(paymentServiceListener, paymentServiceErrorCode3, ((java.lang.String) objArr3[0]).intern());
                    return false;
                }
                if (m26923.m26136() == com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState.SUSPENDED) {
                    com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode paymentServiceErrorCode4 = com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.CARD_SUSPENDED;
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    getHighSpeedVideoSizes(new int[]{-1314513311, -807996297, -319969203, 769276767, 802709618, -350130068, 2112538505, -142466814, 1849367352, -851939614}, 17 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr4);
                    util.h.xy.bf.ma.m25415(paymentServiceListener, paymentServiceErrorCode4, ((java.lang.String) objArr4[0]).intern());
                    return false;
                }
                if (m26923.m26139() > 0) {
                    int i2 = getHighResolutionOutputSizeshNQ4ISI + 21;
                    getHighSpeedVideoSizes = i2 % 128;
                    if (i2 % 2 == 0) {
                        m26923.m26139();
                        util.h.xy.f.b.f2201.m26755(util.h.xy.f.a.f2192);
                        throw new java.lang.ArithmeticException();
                    }
                    m26923.m26139();
                    if (util.h.xy.f.b.f2201.m26755(util.h.xy.f.a.f2192) && util.h.xy.f.b.f2201.m26755(util.h.xy.f.a.f2185)) {
                        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 25) % 128;
                    }
                    if (z) {
                        if (util.h.xy.f.b.f2201.m26755(util.h.xy.f.a.f2184)) {
                            int i3 = getHighSpeedVideoSizes + 5;
                            getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
                            if (i3 % 2 != 0) {
                                util.h.xy.f.b.f2201.m26755(util.h.xy.f.a.f2186);
                                throw new java.lang.NullPointerException();
                            }
                            if (!util.h.xy.f.b.f2201.m26755(util.h.xy.f.a.f2186)) {
                                int i4 = getHighSpeedVideoSizes + 5;
                                getHighResolutionOutputSizeshNQ4ISI = i4 % 128;
                                if (i4 % 2 != 0) {
                                    bVar = util.h.xy.f.b.f2201;
                                    paymentType2 = com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS;
                                } else {
                                    bVar = util.h.xy.f.b.f2201;
                                    paymentType2 = com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS;
                                }
                            }
                        }
                        if (util.h.xy.f.b.f2201.m26755(util.h.xy.f.a.f2194) && !util.h.xy.f.b.f2201.m26755(util.h.xy.f.a.f2198)) {
                            bVar = util.h.xy.f.b.f2201;
                            paymentType2 = com.gemalto.mfs.mwsdk.dcm.PaymentType.QR;
                        } else if (util.h.xy.f.b.f2201.m26755(util.h.xy.f.a.f2191)) {
                            int i5 = getHighSpeedVideoSizes + 95;
                            getHighResolutionOutputSizeshNQ4ISI = i5 % 128;
                            if (i5 % 2 != 0) {
                                util.h.xy.f.b.f2201.m26755(util.h.xy.f.a.f2199);
                                throw null;
                            }
                            if (!util.h.xy.f.b.f2201.m26755(util.h.xy.f.a.f2199)) {
                                bVar = util.h.xy.f.b.f2201;
                                paymentType2 = com.gemalto.mfs.mwsdk.dcm.PaymentType.DSRP;
                            }
                        }
                    } else if (util.h.xy.f.b.f2201.m26755(util.h.xy.f.a.f2189) && !util.h.xy.f.b.f2201.m26755(util.h.xy.f.a.f2192)) {
                        bVar = util.h.xy.f.b.f2201;
                        paymentType2 = com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS;
                    } else if (util.h.xy.f.b.f2201.m26755(util.h.xy.f.a.f2200) && !util.h.xy.f.b.f2201.m26755(util.h.xy.f.a.f2185)) {
                        int i6 = getHighSpeedVideoSizes + 7;
                        getHighResolutionOutputSizeshNQ4ISI = i6 % 128;
                        if (i6 % 2 != 0) {
                            util.h.xy.f.b.f2201.m26772(m26922, com.gemalto.mfs.mwsdk.dcm.PaymentType.QR, false, z);
                        } else {
                            bVar = util.h.xy.f.b.f2201;
                            paymentType2 = com.gemalto.mfs.mwsdk.dcm.PaymentType.QR;
                        }
                    } else if (util.h.xy.f.b.f2201.m26755(util.h.xy.f.a.f2187) && !util.h.xy.f.b.f2201.m26755(util.h.xy.f.a.f2190)) {
                        getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 31) % 128;
                        util.h.xy.f.b.f2201.m26772(m26922, com.gemalto.mfs.mwsdk.dcm.PaymentType.DSRP, true, z);
                        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 63) % 128;
                    }
                    bVar.m26772(m26922, paymentType2, true, z);
                } else {
                    if (m26923.m26139() <= 0) {
                        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 43) % 128;
                        com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode paymentServiceErrorCode5 = com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.CARD_OUT_OF_PAYMENT_KEYS;
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        getHighSpeedVideoSizes(new int[]{-1348199891, -488593489, -250721183, -393769540, -68357775, -150508735, 703374591, -970817423, 1604307027, -851595125, 514268192, 1634492526, 1053772524, -357674820}, 26 - (android.view.ViewConfiguration.getTouchSlop() >> 8), objArr5);
                        util.h.xy.bf.ma.m25415(paymentServiceListener, paymentServiceErrorCode5, ((java.lang.String) objArr5[0]).intern());
                        return false;
                    }
                    m26923.m26136();
                    m26923.m26139();
                    getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 111) % 128;
                }
            }
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
            e.getMessage();
            com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode paymentServiceErrorCode6 = com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.INTERNAL_ERROR;
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            getHighSpeedVideoSizes(new int[]{-26174863, -983523765, -1294125849, -1944283302, 1431457841, 1032291992, 1945183406, -64273127, 1214800824, -544911847, 963213267, 1945171404, 730764609, 70877825, -1607975678, -116807427}, android.view.View.resolveSize(0, 0) + 32, objArr6);
            util.h.xy.bf.ma.m25415(paymentServiceListener, paymentServiceErrorCode6, ((java.lang.String) objArr6[0]).intern());
        }
        return true;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m25645() {
        int i = getHighResolutionOutputSizeshNQ4ISI + 85;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 == 0) {
            this.getOutputStallDuration = false;
        } else {
            this.getOutputStallDuration = false;
        }
    }

    /* renamed from: ͺ, reason: contains not printable characters */
    public final boolean m25644() {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoSizes = (i + 71) % 128;
        boolean z = this.getOutputStallDuration;
        getHighSpeedVideoSizes = (i + 105) % 128;
        return z;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m25640(boolean z) {
        int i = getHighSpeedVideoSizes + 25;
        int i2 = i % 128;
        getHighResolutionOutputSizeshNQ4ISI = i2;
        if (i % 2 == 0) {
            this.getOutputStallDuration = z;
            getHighSpeedVideoSizes = (i2 + 85) % 128;
        } else {
            this.getOutputStallDuration = z;
            throw null;
        }
    }

    static void getHighSpeedVideoSizes() {
        getOutputFormats = new int[]{-893434233, 1242192786, -275184255, -1858623445, -479787720, 527129617, -198374568, 854377935, 1858064312, -115625368, 1527212016, 854492185, -19315584, 1991715242, 2042512383, 978412286, -710087493, 896830347};
        getOutputSizes = (char) 41653;
        getHighSpeedVideoFpsRanges = (char) 54104;
        getHighSpeedVideoSizesFor = (char) 6296;
        getOutputMinFrameDuration = (char) 42099;
    }
}
