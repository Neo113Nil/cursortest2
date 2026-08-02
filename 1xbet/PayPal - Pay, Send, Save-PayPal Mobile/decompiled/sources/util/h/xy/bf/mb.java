package util.h.xy.bf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes5.dex */
public final class mb {
    private static int Camera2StreamConfigurationMap = 0;
    private static char getHighResolutionOutputSizeshNQ4ISI = 0;
    private static char[] getHighSpeedVideoFpsRanges = null;
    private static char getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 1;
    private static char getHighSpeedVideoSizesFor = 0;
    private static int getInputFormats = 0;
    private static long getInputSizeshNQ4ISI = 0;
    private static final /* synthetic */ util.h.xy.bf.mb[] getOutputFormats;
    private static int getOutputMinFrameDuration = 1;
    private static final java.lang.String getOutputSizeshNQ4ISI;
    private static char getOutputStallDuration;

    /* renamed from: ˊ, reason: contains not printable characters */
    public static final util.h.xy.bf.mb f938;
    private util.h.xy.bf.b getOutputStallDurationlomOqCM = null;
    private util.h.xy.bf.a getOutputMinFrameDurationlomOqCM = new util.h.xy.bf.a();

    private mb(java.lang.String str) {
    }

    public static util.h.xy.bf.mb valueOf(java.lang.String str) {
        int i = getOutputMinFrameDuration + 53;
        getInputFormats = i % 128;
        util.h.xy.bf.mb mbVar = (util.h.xy.bf.mb) java.lang.Enum.valueOf(util.h.xy.bf.mb.class, str);
        if (i % 2 == 0) {
            return mbVar;
        }
        throw new java.lang.ArithmeticException();
    }

    public static util.h.xy.bf.mb[] values() {
        int i = getOutputMinFrameDuration + 63;
        getInputFormats = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
        util.h.xy.bf.mb[] mbVarArr = (util.h.xy.bf.mb[]) getOutputFormats.clone();
        getOutputMinFrameDuration = (getInputFormats + 89) % 128;
        return mbVarArr;
    }

    static {
        getHighSpeedVideoSizes();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoSizes("쀧䲗㗗쪒䷚僼䮃쩹", 7 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr);
        util.h.xy.bf.mb mbVar = new util.h.xy.bf.mb(((java.lang.String) objArr[0]).intern());
        f938 = mbVar;
        int i = (getOutputMinFrameDuration + 35) % 128;
        getInputFormats = i;
        util.h.xy.bf.mb[] mbVarArr = {mbVar};
        int i2 = i + 43;
        getOutputMinFrameDuration = i2 % 128;
        if (i2 % 2 != 0) {
            getOutputFormats = mbVarArr;
            getOutputSizeshNQ4ISI = util.h.xy.bf.mb.class.getName();
            getInputFormats = (getOutputMinFrameDuration + 27) % 128;
            return;
        }
        throw null;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final util.h.xy.bf.a m25426() {
        int i = (getOutputMinFrameDuration + 111) % 128;
        getInputFormats = i;
        util.h.xy.bf.a aVar = this.getOutputMinFrameDurationlomOqCM;
        getOutputMinFrameDuration = (i + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        return aVar;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final com.gemalto.mfs.mwsdk.payment.engine.TransactionContext m25430(int i) {
        int i2 = getOutputMinFrameDuration + 33;
        int i3 = i2 % 128;
        getInputFormats = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        util.h.xy.bf.b bVar = this.getOutputStallDurationlomOqCM;
        if (bVar != null) {
            getOutputMinFrameDuration = (i3 + 87) % 128;
            if (bVar instanceof util.h.xy.bf.rb) {
                com.gemalto.mfs.mwsdk.payment.engine.TransactionContext mo25449 = ((util.h.xy.bf.rb) bVar).mo25449(i);
                getOutputMinFrameDuration = (getInputFormats + 51) % 128;
                return mo25449;
            }
        }
        return null;
    }

    private static void Camera2StreamConfigurationMap(int i, int i2, char c, java.lang.Object[] objArr) {
        util.h.xz.b.rb rbVar = new util.h.xz.b.rb();
        long[] jArr = new long[i];
        rbVar.f2651 = 0;
        while (rbVar.f2651 < i) {
            getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 13) % 128;
            jArr[rbVar.f2651] = (((char) (getHighSpeedVideoFpsRanges[rbVar.f2651 + i2] ^ 3446303986615426049L)) ^ (rbVar.f2651 * (3446303986615426049L ^ getInputSizeshNQ4ISI))) ^ c;
            rbVar.f2651++;
        }
        char[] cArr = new char[i];
        rbVar.f2651 = 0;
        while (rbVar.f2651 < i) {
            Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 63) % 128;
            cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
            rbVar.f2651++;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0089, code lost:
    
        if (r22.containsKey(((java.lang.String) r13[0]).intern()) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a5, code lost:
    
        r13 = new java.lang.Object[1];
        getHighSpeedVideoSizes("擶嚥㗌ȁ蛜孼蕩怃搒ዉ᎔鰦揍憡썕ᡷ췄盱淀풉㲻\uf015\ue597㥧⯜绅癜쉹蛜孼讼ᠦ졬綱", android.view.View.MeasureSpec.getMode(0) + 33, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00bc, code lost:
    
        if (r22.getBoolean(((java.lang.String) r13[0]).intern()) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00be, code lost:
    
        util.h.xy.bf.mb.getOutputMinFrameDuration = (util.h.xy.bf.mb.getInputFormats + 71) % 128;
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x02a9, code lost:
    
        if (getHighResolutionOutputSizeshNQ4ISI() == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x016a, code lost:
    
        r13 = new java.lang.Object[1];
        Camera2StreamConfigurationMap(android.graphics.Color.blue(0) + 11, (android.os.SystemClock.elapsedRealtime() > 0 ? 1 : (android.os.SystemClock.elapsedRealtime() == 0 ? 0 : -1)) + 64, (char) android.view.KeyEvent.getDeadChar(0, 0), r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0190, code lost:
    
        if (r22.getBoolean(((java.lang.String) r13[0]).intern()) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0132, code lost:
    
        if (r22.containsKey(((java.lang.String) r5[0]).intern()) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x00a3, code lost:
    
        if (r22.containsKey(((java.lang.String) r13[0]).intern()) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x010b, code lost:
    
        if (r22.containsKey(((java.lang.String) r11[0]).intern()) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0134, code lost:
    
        r5 = util.h.xy.bf.mb.getInputFormats + 61;
        util.h.xy.bf.mb.getOutputMinFrameDuration = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x013d, code lost:
    
        if ((r5 % 2) != 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x013f, code lost:
    
        r13 = new java.lang.Object[1];
        Camera2StreamConfigurationMap(android.graphics.Color.blue(1) * 97, 101 >> (android.os.SystemClock.elapsedRealtime() > 0 ? 1 : (android.os.SystemClock.elapsedRealtime() == 0 ? 0 : -1)), (char) android.view.KeyEvent.getDeadChar(0, 1), r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0167, code lost:
    
        if (r22.getBoolean(((java.lang.String) r13[0]).intern()) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0192, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x028d, code lost:
    
        if ((r11 instanceof util.h.xy.bf.e) != false) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:195:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01f4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x031a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03cc  */
    @util.h.xy.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final byte[] Camera2StreamConfigurationMap(byte[] bArr, android.os.Bundle bundle) {
        boolean z;
        com.gemalto.mfs.mwsdk.payment.experience.PaymentExperience m25604;
        com.gemalto.mfs.mwsdk.payment.CHVerificationMethod m25516;
        util.h.xy.bf.b bVar;
        byte[] bArr2;
        int i;
        int i2;
        byte b;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoSizes("饐Ǥ딹逫", android.text.TextUtils.indexOf("", "", 0, 0) + 3, objArr);
        util.h.xy.am.ma.m25031(((java.lang.String) objArr[0]).intern(), util.h.xy.ar.b.m25074(bArr));
        util.h.xy.bf.mc.f939.m25439(false);
        util.h.xy.bf.mc.f939.m25442();
        if (!util.h.xy.ag.a.m24556().m24560()) {
            util.h.xy.bf.ma.m25420(util.h.xy.bf.c.f934.m25413());
            return util.h.xy.bf.b.f932;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.getOutputMinFrameDurationlomOqCM.m25396(this.getOutputStallDurationlomOqCM == null && util.h.xy.bu.b.f1050.m25639() == null);
        util.h.xy.bf.a aVar = this.getOutputMinFrameDurationlomOqCM;
        if (bundle != null) {
            int i3 = getOutputMinFrameDuration + 55;
            getInputFormats = i3 % 128;
            if (i3 % 2 != 0) {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoSizes("擶嚥㗌ȁ蛜孼蕩怃搒ዉ᎔鰦揍憡썕ᡷ췄盱淀풉㲻\uf015\ue597㥧⯜绅癜쉹蛜孼讼ᠦ졬綱", 59 / android.view.View.MeasureSpec.getSize(0), objArr2);
            } else {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighSpeedVideoSizes("擶嚥㗌ȁ蛜孼蕩怃搒ዉ᎔鰦揍憡썕ᡷ췄盱淀풉㲻\uf015\ue597㥧⯜绅癜쉹蛜孼讼ᠦ졬綱", 33 - android.view.View.MeasureSpec.getSize(0), objArr3);
            }
            aVar.m25405(r11);
            this.getOutputMinFrameDurationlomOqCM.m25397();
            if (bundle != null) {
                int i4 = getOutputMinFrameDuration + 73;
                getInputFormats = i4 % 128;
                if (i4 % 2 != 0) {
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    Camera2StreamConfigurationMap(115 >> (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 112 >> android.text.TextUtils.indexOf((java.lang.CharSequence) "", '2', 0), (char) android.text.TextUtils.getOffsetBefore("", 0), objArr4);
                } else {
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    Camera2StreamConfigurationMap((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 10, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 66, (char) android.text.TextUtils.getOffsetBefore("", 0), objArr5);
                }
                m25604 = util.h.xy.br.ma.m25604(util.h.xy.ag.a.m24556().m24558(), z);
                if (m25604 != com.gemalto.mfs.mwsdk.payment.experience.PaymentExperience.ONE_TAP_REQUIRES_SDK_INITIALIZED && com.gemalto.mfs.mwsdk.sdkconfig.SDKController.getInstance().getSDKServiceState() != com.gemalto.mfs.mwsdk.sdkconfig.SDKServiceState.STATE_INITIALIZED) {
                    com.gemalto.mfs.mwsdk.payment.engine.ContactlessPaymentServiceListener m25413 = util.h.xy.bf.c.f934.m25413();
                    com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode paymentServiceErrorCode = com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.OPERATION_NOT_ALLOWED;
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    getHighSpeedVideoSizes("葑狇㡂蓮뮽뤑脇冶甌蜎땛쮥瞣냜\ue058츄㲻\uf015搒ዉ\uf8c6曎脇冶ﰝ\uea11礶擁⼣ﭓ實⚝坱觢迧嫵쎏\ue2c4莗虈ඩ꿼㒝\ueb1c\ud90b뇷舧ՂႤ醉蟧对슻ᔩ", android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 5, objArr6);
                    util.h.xy.bf.ma.m25415(m25413, paymentServiceErrorCode, ((java.lang.String) objArr6[0]).intern());
                    return util.h.xy.bf.b.f932;
                }
                boolean z2 = !z || m25604 == com.gemalto.mfs.mwsdk.payment.experience.PaymentExperience.TWO_TAP_ALWAYS;
                m25516 = util.h.xy.bm.ma.f984.m25516();
                if (m25516 == com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.NONE) {
                    z2 = false;
                }
                if (this.getOutputMinFrameDurationlomOqCM.m25397() && z2) {
                    if (m25428(util.h.xy.bf.d.f937)) {
                        return util.h.xy.bf.b.f932;
                    }
                    util.h.xy.bk.mb.f982.m25507();
                    if (this.getOutputStallDurationlomOqCM == null) {
                        int i5 = getOutputMinFrameDuration + 47;
                        getInputFormats = i5 % 128;
                        if (i5 % 2 != 0) {
                            java.lang.Object[] objArr7 = new java.lang.Object[1];
                            Camera2StreamConfigurationMap(75 >>> (android.view.ViewConfiguration.getTouchSlop() * 68), android.view.View.MeasureSpec.getSize(1), (char) (12516 >>> (android.view.ViewConfiguration.getPressedStateDuration() << 84)), objArr7);
                            util.h.xy.bf.ma.m25422(((java.lang.String) objArr7[0]).intern(), util.h.xy.bf.c.f934.m25413());
                            return util.h.xy.bf.b.f932;
                        }
                        java.lang.Object[] objArr8 = new java.lang.Object[1];
                        Camera2StreamConfigurationMap((android.view.ViewConfiguration.getTouchSlop() >> 8) + 25, android.view.View.MeasureSpec.getSize(0), (char) (32703 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16)), objArr8);
                        util.h.xy.bf.ma.m25422(((java.lang.String) objArr8[0]).intern(), util.h.xy.bf.c.f934.m25413());
                        return util.h.xy.bf.b.f932;
                    }
                }
                int i6 = getOutputMinFrameDuration;
                getInputFormats = (i6 + 17) % 128;
                bVar = this.getOutputStallDurationlomOqCM;
                if (bVar != null) {
                    if (!(bVar instanceof util.h.xy.bg.b)) {
                        getInputFormats = (i6 + 89) % 128;
                    }
                    getOutputMinFrameDuration = (getInputFormats + 41) % 128;
                    if (this.getOutputStallDurationlomOqCM != null) {
                        getOutputMinFrameDuration = (getInputFormats + 89) % 128;
                        com.gemalto.mfs.mwsdk.payment.engine.ContactlessPaymentServiceListener m254132 = util.h.xy.bf.c.f934.m25413();
                        com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode paymentServiceErrorCode2 = com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.NO_APDU_PROCESSOR_FOUND;
                        java.lang.Object[] objArr9 = new java.lang.Object[1];
                        Camera2StreamConfigurationMap(android.graphics.Color.red(0) + 40, (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 25, (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 28898), objArr9);
                        util.h.xy.bf.ma.m25415(m254132, paymentServiceErrorCode2, ((java.lang.String) objArr9[0]).intern());
                        return util.h.xy.bf.b.f932;
                    }
                    try {
                        java.lang.Object[] objArr10 = new java.lang.Object[1];
                        getHighSpeedVideoSizes("퍑ォ懲Ꞥ夵瀫癜쉹升\u1755\ued1e흦᳘숼ക탑\uf44d㞏언뀝耄\uea7e莗虈\uf2ba◜ඩ꿼뭚\uf3ad\uee9b䣒襶㨶䲳氂\uddde\ude27允㜸", 40 - ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6), objArr10);
                        util.h.xy.bh.mb.m25480(((java.lang.String) objArr10[0]).intern(), currentTimeMillis);
                        byte[] G_ = this.getOutputStallDurationlomOqCM.G_(bArr, bundle);
                        if (G_ != null) {
                            return G_;
                        }
                        byte[] H_ = this.getOutputStallDurationlomOqCM.H_(bArr, bundle);
                        if (H_ == null) {
                            return null;
                        }
                        int i7 = (getInputFormats + 29) % 128;
                        getOutputMinFrameDuration = i7;
                        if (H_.length == 3) {
                            int i8 = i7 + 119;
                            int i9 = i8 % 128;
                            getInputFormats = i9;
                            if (i8 % 2 == 0 ? (b = H_[0]) != 3 : (b = H_[1]) != 2) {
                                if (b == 16) {
                                    getInputFormats = (i7 + 43) % 128;
                                } else if (b != 17) {
                                    if (b == 18) {
                                        getOutputMinFrameDuration = (i9 + 91) % 128;
                                    } else {
                                        if (b != 19) {
                                            bArr2 = new byte[]{H_[1], H_[2]};
                                            i = getOutputMinFrameDuration + 73;
                                            getInputFormats = i % 128;
                                            if (i % 2 == 0) {
                                                java.util.Arrays.equals(bArr2, util.h.xy.bf.b.f932);
                                                throw null;
                                            }
                                            if (!java.util.Arrays.equals(bArr2, util.h.xy.bf.b.f932) && !java.util.Arrays.equals(bArr2, util.h.xy.bf.b.f926) && !java.util.Arrays.equals(bArr2, util.h.xy.bf.b.f927)) {
                                                getOutputMinFrameDuration = (getInputFormats + 57) % 128;
                                                if (!java.util.Arrays.equals(bArr2, util.h.xy.bf.b.f925)) {
                                                    int i10 = (getOutputMinFrameDuration + 53) % 128;
                                                    getInputFormats = i10;
                                                    int i11 = i10 + 39;
                                                    getOutputMinFrameDuration = i11 % 128;
                                                    byte[] bArr3 = util.h.xy.bf.b.f933;
                                                    if (i11 % 2 == 0) {
                                                        java.util.Arrays.equals(H_, bArr3);
                                                        throw null;
                                                    }
                                                    if (java.util.Arrays.equals(H_, bArr3)) {
                                                        com.gemalto.mfs.mwsdk.payment.engine.PaymentService m25639 = util.h.xy.bu.b.f1050.m25639();
                                                        if (m25639 != null) {
                                                            int i12 = getOutputMinFrameDuration + 47;
                                                            getInputFormats = i12 % 128;
                                                            if (i12 % 2 != 0) {
                                                                m25639.isActivated();
                                                                throw null;
                                                            }
                                                            if (m25639.isActivated() && (m25639 instanceof util.h.xy.bq.b)) {
                                                                int i13 = getInputFormats + 99;
                                                                getOutputMinFrameDuration = i13 % 128;
                                                                if (i13 % 2 == 0) {
                                                                    ((util.h.xy.bq.b) m25639).mo25546(true, false);
                                                                } else {
                                                                    ((util.h.xy.bq.b) m25639).mo25546(false, false);
                                                                }
                                                                com.gemalto.mfs.mwsdk.payment.engine.ContactlessPaymentServiceListener m254133 = util.h.xy.bf.c.f934.m25413();
                                                                com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode paymentServiceErrorCode3 = com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.INTERNAL_ERROR;
                                                                java.lang.Object[] objArr11 = new java.lang.Object[1];
                                                                getHighSpeedVideoSizes("擶嚥㗌ȁ蛜孼᧫䬣ꜷ센撚\uf84dᐯ魄ﶯ쭰駱龘樇\ue196瘥\uf4ab鴧⎙ᇗ肢", android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 26, objArr11);
                                                                util.h.xy.bf.ma.m25415(m254133, paymentServiceErrorCode3, ((java.lang.String) objArr11[0]).intern());
                                                                util.h.xy.ar.b.m25074(bArr2);
                                                                return new byte[]{111, 0};
                                                            }
                                                        }
                                                        m25429();
                                                        m25427(false);
                                                        com.gemalto.mfs.mwsdk.payment.engine.ContactlessPaymentServiceListener m2541332 = util.h.xy.bf.c.f934.m25413();
                                                        com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode paymentServiceErrorCode32 = com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.INTERNAL_ERROR;
                                                        java.lang.Object[] objArr112 = new java.lang.Object[1];
                                                        getHighSpeedVideoSizes("擶嚥㗌ȁ蛜孼᧫䬣ꜷ센撚\uf84dᐯ魄ﶯ쭰駱龘樇\ue196瘥\uf4ab鴧⎙ᇗ肢", android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 26, objArr112);
                                                        util.h.xy.bf.ma.m25415(m2541332, paymentServiceErrorCode32, ((java.lang.String) objArr112[0]).intern());
                                                        util.h.xy.ar.b.m25074(bArr2);
                                                        return new byte[]{111, 0};
                                                    }
                                                    int i14 = getInputFormats + 13;
                                                    getOutputMinFrameDuration = i14 % 128;
                                                    if (i14 % 2 == 0) {
                                                        java.util.Arrays.equals(bArr2, util.h.xy.bf.b.f929);
                                                        throw null;
                                                    }
                                                    boolean equals = java.util.Arrays.equals(bArr2, util.h.xy.bf.b.f929);
                                                    int i15 = getInputFormats + 111;
                                                    int i16 = i15 % 128;
                                                    getOutputMinFrameDuration = i16;
                                                    if (i15 % 2 == 0) {
                                                        throw null;
                                                    }
                                                    if (equals) {
                                                        getInputFormats = (i16 + 121) % 128;
                                                        com.gemalto.mfs.mwsdk.payment.engine.PaymentService m256392 = util.h.xy.bu.b.f1050.m25639();
                                                        if (m256392 != null && m256392.isActivated() && (m256392 instanceof util.h.xy.bq.b)) {
                                                            ((util.h.xy.bq.b) m256392).mo25546(false, false);
                                                        } else {
                                                            m25429();
                                                            m25427(false);
                                                        }
                                                        com.gemalto.mfs.mwsdk.payment.engine.ContactlessPaymentServiceListener m254134 = util.h.xy.bf.c.f934.m25413();
                                                        com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode paymentServiceErrorCode4 = com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.INTERNAL_ERROR;
                                                        java.lang.Object[] objArr12 = new java.lang.Object[1];
                                                        getHighSpeedVideoSizes("౾捉\ue597㥧壺肀擶嚥썕ᡷ莗虈곯ﲣ礶擁蔉⽮茘虗슻ᔩ", ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + com.google.common.base.Ascii.SYN, objArr12);
                                                        util.h.xy.bf.ma.m25415(m254134, paymentServiceErrorCode4, ((java.lang.String) objArr12[0]).intern());
                                                        util.h.xy.ar.b.m25074(bArr2);
                                                        return bArr2;
                                                    }
                                                    if (java.util.Arrays.equals(H_, util.h.xy.bf.b.f924)) {
                                                        int i17 = getInputFormats + 35;
                                                        getOutputMinFrameDuration = i17 % 128;
                                                        i2 = i17 % 2 == 0 ? 12470 : com.visa.cbp.sdk.facade.data.Constants.HOOK_DETECTED;
                                                    } else if (java.util.Arrays.equals(H_, util.h.xy.bf.b.f923)) {
                                                        getInputFormats = (getOutputMinFrameDuration + 73) % 128;
                                                        i2 = com.visa.cbp.sdk.facade.data.Constants.SUPER_USER_PERMISSION_DETECTED;
                                                    } else if (java.util.Arrays.equals(H_, util.h.xy.bf.b.f922)) {
                                                        int i18 = getOutputMinFrameDuration + 51;
                                                        getInputFormats = i18 % 128;
                                                        if (i18 % 2 != 0) {
                                                            int i19 = 4 / 5;
                                                        }
                                                        i2 = 801;
                                                    } else {
                                                        i2 = java.util.Arrays.equals(H_, util.h.xy.bf.b.f931) ? 803 : -91;
                                                    }
                                                    if (-91 != i2) {
                                                        com.gemalto.mfs.mwsdk.payment.engine.PaymentService m256393 = util.h.xy.bu.b.f1050.m25639();
                                                        if (m256393 != null && m256393.isActivated() && (m256393 instanceof util.h.xy.bq.b)) {
                                                            ((util.h.xy.bq.b) m256393).mo25546(false, false);
                                                        } else {
                                                            m25429();
                                                            m25427(false);
                                                        }
                                                        util.h.xy.bf.ma.m25425(util.h.xy.bf.c.f934.m25413(), i2);
                                                        util.h.xy.ar.b.m25074(bArr2);
                                                        return new byte[]{105, -123};
                                                    }
                                                    byte[] I_ = this.getOutputStallDurationlomOqCM.I_(bArr, bundle, H_);
                                                    if (this.getOutputMinFrameDurationlomOqCM.m25397()) {
                                                        int i20 = getInputFormats + 121;
                                                        getOutputMinFrameDuration = i20 % 128;
                                                        if (i20 % 2 == 0) {
                                                            throw null;
                                                        }
                                                        util.h.xy.bf.b bVar2 = this.getOutputStallDurationlomOqCM;
                                                        if (bVar2 != null && (bVar2 instanceof util.h.xy.bg.b) && m25516 != com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.NONE) {
                                                            util.h.xy.bf.ma.m25418(util.h.xy.bf.c.f934.m25413());
                                                        }
                                                    }
                                                    getOutputMinFrameDuration = (getInputFormats + 87) % 128;
                                                    return I_;
                                                }
                                            }
                                            m25429();
                                            m25427(false);
                                            util.h.xy.ar.b.m25074(bArr2);
                                            return bArr2;
                                        }
                                        int i21 = i7 + 79;
                                        getInputFormats = i21 % 128;
                                        if (i21 % 2 != 0) {
                                            throw new java.lang.ArithmeticException();
                                        }
                                    }
                                }
                            }
                        }
                        bArr2 = H_;
                        i = getOutputMinFrameDuration + 73;
                        getInputFormats = i % 128;
                        if (i % 2 == 0) {
                        }
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
                if (bVar != null) {
                    int i22 = getInputFormats + 21;
                    getOutputMinFrameDuration = i22 % 128;
                    if (i22 % 2 == 0) {
                        getHighResolutionOutputSizeshNQ4ISI();
                        throw null;
                    }
                }
                this.getOutputMinFrameDurationlomOqCM.m25391();
                this.getOutputMinFrameDurationlomOqCM.m25408();
                getOutputMinFrameDuration = (getInputFormats + 119) % 128;
                if (!m25428(util.h.xy.bf.d.f935)) {
                    int i23 = getOutputMinFrameDuration + 97;
                    getInputFormats = i23 % 128;
                    if (i23 % 2 == 0) {
                        return util.h.xy.bf.b.f932;
                    }
                    byte[] bArr4 = util.h.xy.bf.b.f932;
                    throw null;
                }
                if (this.getOutputStallDurationlomOqCM != null) {
                }
            }
            z = false;
            m25604 = util.h.xy.br.ma.m25604(util.h.xy.ag.a.m24556().m24558(), z);
            if (m25604 != com.gemalto.mfs.mwsdk.payment.experience.PaymentExperience.ONE_TAP_REQUIRES_SDK_INITIALIZED) {
            }
            if (z) {
            }
            m25516 = util.h.xy.bm.ma.f984.m25516();
            if (m25516 == com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.NONE) {
            }
            if (this.getOutputMinFrameDurationlomOqCM.m25397()) {
                if (m25428(util.h.xy.bf.d.f937)) {
                }
            }
            int i62 = getOutputMinFrameDuration;
            getInputFormats = (i62 + 17) % 128;
            bVar = this.getOutputStallDurationlomOqCM;
            if (bVar != null) {
            }
            if (bVar != null) {
            }
            this.getOutputMinFrameDurationlomOqCM.m25391();
            this.getOutputMinFrameDurationlomOqCM.m25408();
            getOutputMinFrameDuration = (getInputFormats + 119) % 128;
            if (!m25428(util.h.xy.bf.d.f935)) {
            }
            if (this.getOutputStallDurationlomOqCM != null) {
            }
        }
        boolean z3 = false;
        aVar.m25405(z3);
        this.getOutputMinFrameDurationlomOqCM.m25397();
        if (bundle != null) {
        }
        z = false;
        m25604 = util.h.xy.br.ma.m25604(util.h.xy.ag.a.m24556().m24558(), z);
        if (m25604 != com.gemalto.mfs.mwsdk.payment.experience.PaymentExperience.ONE_TAP_REQUIRES_SDK_INITIALIZED) {
        }
        if (z) {
        }
        m25516 = util.h.xy.bm.ma.f984.m25516();
        if (m25516 == com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.NONE) {
        }
        if (this.getOutputMinFrameDurationlomOqCM.m25397()) {
        }
        int i622 = getOutputMinFrameDuration;
        getInputFormats = (i622 + 17) % 128;
        bVar = this.getOutputStallDurationlomOqCM;
        if (bVar != null) {
        }
        if (bVar != null) {
        }
        this.getOutputMinFrameDurationlomOqCM.m25391();
        this.getOutputMinFrameDurationlomOqCM.m25408();
        getOutputMinFrameDuration = (getInputFormats + 119) % 128;
        if (!m25428(util.h.xy.bf.d.f935)) {
        }
        if (this.getOutputStallDurationlomOqCM != null) {
        }
    }

    private static void getHighSpeedVideoSizes(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2 = Camera2StreamConfigurationMap + 9;
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        char[] charArray = str.toCharArray();
        util.h.xz.b.e eVar = new util.h.xz.b.e();
        char[] cArr = new char[charArray.length];
        eVar.f2630 = 0;
        char[] cArr2 = new char[2];
        while (eVar.f2630 < charArray.length) {
            cArr2[0] = charArray[eVar.f2630];
            cArr2[1] = charArray[eVar.f2630 + 1];
            getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 73) % 128;
            int i3 = 58224;
            int i4 = 0;
            while (i4 < 16) {
                char c = cArr2[1];
                char c2 = cArr2[0];
                char c3 = (char) (c - (((c2 + i3) ^ ((c2 << 4) + ((char) (getHighSpeedVideoFpsRangesFor ^ 3155153533016530592L)))) ^ ((c2 >>> 5) + ((char) (getOutputStallDuration ^ 3155153533016530592L)))));
                cArr2[1] = c3;
                cArr2[0] = (char) (c2 - ((((c3 << 4) + ((char) (getHighResolutionOutputSizeshNQ4ISI ^ 3155153533016530592L))) ^ (c3 + i3)) ^ ((c3 >>> 5) + ((char) (getHighSpeedVideoSizesFor ^ 3155153533016530592L)))));
                i3 -= 40503;
                i4++;
                getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 113) % 128;
            }
            cArr[eVar.f2630] = cArr2[0];
            cArr[eVar.f2630 + 1] = cArr2[1];
            eVar.f2630 += 2;
            getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 35) % 128;
        }
        objArr[0] = new java.lang.String(cArr, 0, i);
    }

    private boolean getHighResolutionOutputSizeshNQ4ISI() {
        if (!this.getOutputMinFrameDurationlomOqCM.m25391()) {
            int i = getInputFormats + 55;
            getOutputMinFrameDuration = i % 128;
            if (i % 2 != 0) {
                if (!this.getOutputMinFrameDurationlomOqCM.m25408()) {
                    return false;
                }
            } else {
                this.getOutputMinFrameDurationlomOqCM.m25408();
                throw null;
            }
        }
        this.getOutputMinFrameDurationlomOqCM.m25391();
        this.getOutputMinFrameDurationlomOqCM.m25408();
        getOutputMinFrameDuration = (getInputFormats + 37) % 128;
        return true;
    }

    /* renamed from: util.h.xy.bf.mb$3, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] getHighResolutionOutputSizeshNQ4ISI;
        private static int getHighSpeedVideoFpsRangesFor = 0;
        private static int getHighSpeedVideoSizes = 1;

        static {
            int[] iArr = new int[util.h.xy.bf.d.values().length];
            getHighResolutionOutputSizeshNQ4ISI = iArr;
            try {
                iArr[util.h.xy.bf.d.f937.ordinal()] = 1;
                int i = getHighSpeedVideoSizes;
                getHighSpeedVideoFpsRangesFor = ((i & 5) + (i | 5)) % 128;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[util.h.xy.bf.d.f935.ordinal()] = 2;
                int i2 = getHighSpeedVideoFpsRangesFor;
                int i3 = ((i2 | 101) << 1) - (i2 ^ 101);
                getHighSpeedVideoSizes = i3 % 128;
                int i4 = i3 % 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[util.h.xy.bf.d.f936.ordinal()] = 3;
                int i5 = getHighSpeedVideoFpsRangesFor;
                int i6 = (i5 ^ 75) + ((i5 & 75) << 1);
                getHighSpeedVideoSizes = i6 % 128;
                int i7 = i6 % 2;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            int i8 = getHighSpeedVideoSizes;
            int i9 = (i8 ^ 31) + ((i8 & 31) << 1);
            getHighSpeedVideoFpsRangesFor = i9 % 128;
            if (i9 % 2 != 0) {
                throw null;
            }
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final boolean m25428(util.h.xy.bf.d dVar) {
        int i = getInputFormats + 7;
        getOutputMinFrameDuration = i % 128;
        if (i % 2 != 0) {
            int i2 = util.h.xy.bf.mb.AnonymousClass3.getHighResolutionOutputSizeshNQ4ISI[dVar.ordinal()];
            if (i2 == 1) {
                try {
                    getHighSpeedVideoSizes(util.h.xy.bi.b.f957.m25493(this.getOutputMinFrameDurationlomOqCM));
                } catch (com.gemalto.mfs.mwsdk.exception.CPSKeyStoreException e) {
                    util.h.xy.bf.ma.m25415(util.h.xy.bf.c.f934.m25413(), com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.KEY_STORE_INACCESSIBLE, util.h.xy.al.rc.m25019(e));
                    return false;
                }
            } else if (i2 == 2) {
                getHighSpeedVideoSizes(new util.h.xy.bg.b(this.getOutputMinFrameDurationlomOqCM));
                getOutputMinFrameDuration = (getInputFormats + 67) % 128;
            } else if (i2 == 3) {
                getHighSpeedVideoSizes(null);
            }
            return true;
        }
        int i3 = util.h.xy.bf.mb.AnonymousClass3.getHighResolutionOutputSizeshNQ4ISI[dVar.ordinal()];
        throw new java.lang.ArithmeticException();
    }

    private void getHighSpeedVideoSizes(util.h.xy.bf.b bVar) {
        int i = (getOutputMinFrameDuration + 71) % 128;
        getInputFormats = i;
        if (bVar != null) {
            getOutputMinFrameDuration = (i + 65) % 128;
            bVar.mo25411();
        }
        this.getOutputStallDurationlomOqCM = bVar;
        int i2 = getOutputMinFrameDuration + 21;
        getInputFormats = i2 % 128;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m25429() {
        int i = getOutputMinFrameDuration + 73;
        getInputFormats = i % 128;
        if (i % 2 == 0) {
            m25428(util.h.xy.bf.d.f936);
        } else {
            m25428(util.h.xy.bf.d.f936);
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m25427(boolean z) {
        getOutputMinFrameDuration = (getInputFormats + 89) % 128;
        this.getOutputMinFrameDurationlomOqCM.m25410(z);
        int i = getInputFormats + 3;
        getOutputMinFrameDuration = i % 128;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    static void getHighSpeedVideoSizes() {
        getHighResolutionOutputSizeshNQ4ISI = (char) 6548;
        getHighSpeedVideoSizesFor = (char) 56448;
        getHighSpeedVideoFpsRangesFor = (char) 17363;
        getOutputStallDuration = (char) 39258;
        getHighSpeedVideoFpsRanges = new char[]{58333, 26236, 59554, 29417, 62727, 32579, 49536, 19454, 52822, 20629, 56013, 23859, 42840, 10650, 46047, 13922, 47293, 746, 34063, 3929, 37330, 7123, 40561, 57507, 27386, 60588, 26938, 59308, 32134, 64110, 28725, 52989, 17603, 49418, 24575, 54699, 21084, 43027, 9946, 48275, 14644, 47072, 3557, 35418, 24, 40667, 5263, 37180, 61373, 26010, 57937, 30737, 63182, 19605, 51516, 18352, 56767, 23152, 53260, 11916, 42118, 8505, 49136, 13729, 45677, 40017, 6640, 38719, 3338, 35512, 252, 48682, 13410, 45525, 12043, 42307};
        getInputSizeshNQ4ISI = -3908561546407110218L;
    }
}
