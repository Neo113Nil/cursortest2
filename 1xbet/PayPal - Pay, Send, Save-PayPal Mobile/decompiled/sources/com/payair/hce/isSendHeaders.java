package com.payair.hce;

/* loaded from: classes4.dex */
public class isSendHeaders extends java.lang.Exception {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static int DigitizedCardProfile;
    private static long valueOf;
    private static int values;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, short s, java.lang.Object[] objArr) {
        int i3;
        int i4 = 42 - s;
        byte[] bArr = $$a;
        int i5 = 718 - i2;
        char[] cArr = new char[35 - i];
        if (bArr == null) {
            int i6 = i4;
            int i7 = 0;
            i5 = (i5 + i4) - 2;
            i4 = i6;
            i3 = i7;
            int i8 = i4 + 1;
            cArr[i3] = (char) i5;
            i7 = i3 + 1;
            if (i3 == 34 - i) {
                objArr[0] = new java.lang.String(cArr);
                return;
            }
            i6 = i8;
            i4 = bArr[i8];
            i5 = (i5 + i4) - 2;
            i4 = i6;
            i3 = i7;
            int i82 = i4 + 1;
            cArr[i3] = (char) i5;
            i7 = i3 + 1;
            if (i3 == 34 - i) {
            }
        } else {
            i3 = 0;
            int i822 = i4 + 1;
            cArr[i3] = (char) i5;
            i7 = i3 + 1;
            if (i3 == 34 - i) {
            }
        }
    }

    private static void c(short s, int i, int i2, java.lang.Object[] objArr) {
        int i3 = 119 - (i * 2);
        byte[] bArr = $$d;
        int i4 = s + 4;
        int i5 = i2 * 2;
        byte[] bArr2 = new byte[i5 + 1];
        int i6 = -1;
        if (bArr == null) {
            i3 = (-i3) + i5;
            i6 = -1;
        }
        while (true) {
            int i7 = i6 + 1;
            i4++;
            bArr2[i7] = (byte) i3;
            if (i7 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            } else {
                i3 = (-bArr[i4]) + i3;
                i6 = i7;
            }
        }
    }

    public isSendHeaders(java.lang.String str) {
        super(str);
    }

    private static void b(java.lang.String str, int i, java.lang.Object[] objArr) {
        $11 = ($10 + 87) % 128;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getCardholderValidator getcardholdervalidator = new com.payair.hce.getCardholderValidator();
        char[] writeReplace = com.payair.hce.getCardholderValidator.writeReplace(valueOf ^ (-3824242241614154557L), charArray, i);
        getcardholdervalidator.valueOf = 4;
        while (getcardholdervalidator.valueOf < writeReplace.length) {
            $11 = ($10 + 15) % 128;
            getcardholdervalidator.DigitizedCardProfile = getcardholdervalidator.valueOf - 4;
            int i2 = getcardholdervalidator.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Long.valueOf(writeReplace[getcardholdervalidator.valueOf] ^ writeReplace[getcardholdervalidator.valueOf % 4]), java.lang.Long.valueOf(getcardholdervalidator.DigitizedCardProfile), java.lang.Long.valueOf(valueOf)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1178927836);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.os.Process.getGidForName("") + 41, 1921 - android.graphics.Color.alpha(0), (char) ((-1) - android.widget.ExpandableListView.getPackedPositionChild(0L)));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    c((short) -1, 1, 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1178927836, obj);
                }
                writeReplace[i2] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {getcardholdervalidator, getcardholdervalidator};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1228006564);
                if (obj2 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 28, 429 - (android.view.ViewConfiguration.getTapTimeout() >> 16), (char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 31562));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    c((short) -1, 0, 0, objArr5);
                    obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1228006564, obj2);
                }
                ((java.lang.reflect.Method) obj2).invoke(null, objArr4);
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new java.lang.String(writeReplace, 4, writeReplace.length - 4);
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        DigitizedCardProfile = 0;
        values = 1;
        valueOf = 8535463423542957886L;
    }

    static void init$1() {
        $$d = new byte[]{104, -39, -34, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus};
        $$e = 141;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0391, code lost:
    
        if (r0.contains(r5.getField((java.lang.String) r13[0]).get(null)) != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x05f2, code lost:
    
        if (r5.equals(((java.lang.String) r7[0]).intern()) != false) goto L73;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.Object[] AlternateContactlessPaymentDataJson(android.content.Context context, int i, int i2) {
        java.lang.Object[] objArr;
        byte[] bArr;
        try {
            if (context == null) {
                java.lang.Object[] objArr2 = {new int[]{i}, new int[]{i}, null, new int[1]};
                java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf(((((~(r6 | (-33637779))) | (~(i | (-67502114)))) * 497) - 1039757935) + (((~(i | (-33637779))) | (~((~i) | (-903789094))) | 836286980) * 497))};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 51, 2714 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
                    byte b = (byte) ($$a[14] - 1);
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    a(b, (short) (b | 653), (short) 39, objArr4);
                    obj = cls.getMethod((java.lang.String) objArr4[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj);
                }
                ((int[]) objArr2[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr3)).intValue();
                return objArr2;
            }
            DigitizedCardProfile = (values + 41) % 128;
            try {
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                b("竳窒凎矱䙈㉝끯淍\uf568ꉖ⁻ﶍ數퉄遽\u0de3핊䉹S鶵䕠\uf26c灕ⷻ땒扷\ue03b", (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 1, objArr5);
                java.lang.Class<?> cls2 = java.lang.Class.forName(((java.lang.String) objArr5[0]).intern());
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                b("#D콓텖䇙곋ᛘ橯辧㳒蛔者ᾨ䳗㛀੯꾐\udce4ꛉ驤㾕泱", android.graphics.Color.red(0) + 1, objArr6);
                java.lang.Object invoke = cls2.getMethod(((java.lang.String) objArr6[0]).intern(), null).invoke(context, null);
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                b("\ueabb\ueada쇽楙뿳ꉮ껇鑶攠㉥㻓ж\uf530䉷軕\uf458䔂퉊ỻ搎픛扝溽푵┏\uf24cﺋ䐡땠ȩ亟㐵ո鈺\udeb6ꐾ镽∏", (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 1, objArr7);
                java.lang.Class<?> cls3 = java.lang.Class.forName(((java.lang.String) objArr7[0]).intern());
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                b("퐑푷淧茸\ud837\u0e76䒣\uf3a7宖", 1 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), objArr8);
                if ((cls3.getField(((java.lang.String) objArr8[0]).intern()).getInt(invoke) & 2) != 0) {
                    values = (DigitizedCardProfile + 55) % 128;
                    objArr = new java.lang.Object[]{new int[]{i}, new int[]{i ^ 1}, null, new int[1]};
                    java.lang.Object[] objArr9 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf(((~(1023335343 | i)) * 623) + 375442856 + (((~i) | 9755520) * (-623)) + (((~(14080939 | i)) | (-1023335344) | (~(1019009924 | i))) * 623))};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    if (obj2 == null) {
                        java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 2713 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (char) android.view.KeyEvent.keyCodeFromString(""));
                        byte b2 = (byte) ($$a[14] - 1);
                        java.lang.Object[] objArr10 = new java.lang.Object[1];
                        a(b2, (short) (b2 | 653), (short) 39, objArr10);
                        obj2 = cls4.getMethod((java.lang.String) objArr10[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj2);
                    }
                    ((int[]) objArr[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr9)).intValue();
                } else {
                    objArr = new java.lang.Object[]{new int[]{i}, new int[]{i}, null, new int[1]};
                    int i3 = ~i;
                    java.lang.Object[] objArr11 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf((((~((-467684600) | i3)) | (-537244386)) * (-983)) + 1344643082 + (((~(i3 | (-537244386))) | 537244160) * 983))};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    if (obj3 == null) {
                        java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.KeyEvent.getMaxKeyCode() >> 16) + 50, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 2714, (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16));
                        byte b3 = (byte) ($$a[14] - 1);
                        java.lang.Object[] objArr12 = new java.lang.Object[1];
                        a(b3, (short) (b3 | 653), (short) 39, objArr12);
                        obj3 = cls5.getMethod((java.lang.String) objArr12[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj3);
                    }
                    ((int[]) objArr[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr11)).intValue();
                }
                if (((int[]) objArr[1])[0] != i) {
                    return objArr;
                }
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-2058003131);
                if (obj4 == null) {
                    java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 32, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1739, (char) (5826 - android.widget.ExpandableListView.getPackedPositionGroup(0L)));
                    byte b4 = (byte) ($$a[14] - 1);
                    java.lang.Object[] objArr13 = new java.lang.Object[1];
                    a(b4, (short) (b4 | 653), (short) 39, objArr13);
                    obj4 = cls6.getMethod((java.lang.String) objArr13[0], null);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-2058003131, obj4);
                }
                java.util.Set set = (java.util.Set) ((java.lang.reflect.Method) obj4).invoke(null, null);
                java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(32 - android.view.MotionEvent.axisFromString(""), 1738 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (char) (5874 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                byte[] bArr2 = $$a;
                byte b5 = (byte) (bArr2[14] - 1);
                java.lang.Object[] objArr14 = new java.lang.Object[1];
                a(b5, (short) (b5 | 653), (short) 39, objArr14);
                if (!set.contains(cls7.getField((java.lang.String) objArr14[0]).get(null))) {
                    java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 34, 1738 - android.view.KeyEvent.keyCodeFromString(""), (char) (5827 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))));
                    java.lang.Object[] objArr15 = new java.lang.Object[1];
                    a(29, 600, (byte) (-bArr2[20]), objArr15);
                }
                if (android.os.Build.VERSION.SDK_INT == 30) {
                    java.lang.Object[] objArr16 = {new int[]{i}, new int[]{i}, null, new int[1]};
                    int i4 = ~i;
                    java.lang.Object[] objArr17 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf((((~(i4 | (-762663373))) | 553996736 | (~(242265612 | i4))) * (-397)) + 551037400 + ((i | 587595712) * 397))};
                    java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    if (obj5 == null) {
                        java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 2712 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) android.view.View.MeasureSpec.getSize(0));
                        byte b6 = (byte) (bArr2[14] - 1);
                        java.lang.Object[] objArr18 = new java.lang.Object[1];
                        a(b6, (short) (b6 | 653), (short) 39, objArr18);
                        obj5 = cls9.getMethod((java.lang.String) objArr18[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj5);
                    }
                    ((int[]) objArr16[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(null, objArr17)).intValue();
                    return objArr16;
                }
                if (android.os.Build.VERSION.SDK_INT > 33) {
                    DigitizedCardProfile = (values + 73) % 128;
                    java.lang.Object[] objArr19 = new java.lang.Object[1];
                    b("ꪶꪙ垷\ud887㮢㐯Ἁံ╭ꐯ輇耠딪푽㼉瀑ԁ䐊꽼\ue015锃\uf418\udf38倂攕搗佛쁵\uf56b鐬ｇ끮", android.view.KeyEvent.getDeadChar(0, 0) + 1, objArr19);
                    try {
                        java.lang.Object[] objArr20 = {((java.lang.String) objArr19[0]).intern()};
                        java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1161224381);
                        if (obj6 == null) {
                            java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 36, (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 3161, (char) (33099 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))));
                            short s = (short) (bArr2[14] - 1);
                            java.lang.Object[] objArr21 = new java.lang.Object[1];
                            a(34, s, (byte) s, objArr21);
                            obj6 = cls10.getMethod((java.lang.String) objArr21[0], java.lang.String.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1161224381, obj6);
                        }
                        long longValue = ((java.lang.Long) ((java.lang.reflect.Method) obj6).invoke(null, objArr20)).longValue();
                        long j = i;
                        bArr = bArr2;
                        long j2 = ~j;
                        long j3 = j2 | (-305301696);
                        long j4 = (((((370 * longValue) + 112961627150L) + (((longValue | 305301695) | j2) * (-369))) + (((~j3) | longValue) * (-369))) + ((((~((~longValue) | 305301695)) | (~(j | 305301695))) | (~(longValue | j3))) * 369)) - 1642969803;
                        int i5 = ~i;
                        if (((((int) j4) & ((((((~r6) | 713168000) * (-828)) - 1754753727) + ((2144572885 | i5) * (-828))) - 1884856360)) | (((int) (j4 >> 32)) & ((((1553868637 | r9) * 764) - 972451746) + (((~(1553868637 | i5)) | (-1593833472)) * (-1528)) + (((~((-116642227) | i5)) | (-1517156080)) * 764)))) == 1) {
                            values = (DigitizedCardProfile + 57) % 128;
                            java.lang.Object[] objArr22 = {new int[]{i}, new int[]{i ^ 10}, null, new int[1]};
                            int i6 = ~i;
                            java.lang.Object[] objArr23 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf(((559696197 | i6) * (-757)) + 1754384434 + ((~((-444708499) | i)) * 1514) + (((~(i | 1004404695)) | (~(i6 | (-445232788))) | 524289) * 757))};
                            java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj7 == null) {
                                java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 50, (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2712, (char) ((-1) - android.widget.ExpandableListView.getPackedPositionChild(0L)));
                                byte b7 = (byte) (bArr[14] - 1);
                                java.lang.Object[] objArr24 = new java.lang.Object[1];
                                a(b7, (short) (b7 | 653), (short) 39, objArr24);
                                obj7 = cls11.getMethod((java.lang.String) objArr24[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj7);
                            }
                            ((int[]) objArr22[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj7).invoke(null, objArr23)).intValue();
                            return objArr22;
                        }
                        java.lang.Object[] objArr25 = {new int[]{i}, new int[]{i}, null, new int[1]};
                        int i7 = ~((-135644049) | i);
                        java.lang.Object[] objArr26 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf(((868236292 | i7) * (-476)) + 1826486152 + (i7 * 952) + ((~((~i) | (-135644049))) * 476))};
                        java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                        if (obj8 == null) {
                            java.lang.Class cls12 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.graphics.Color.red(0), (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2713, (char) android.graphics.Color.green(0));
                            byte b8 = (byte) ($$a[14] - 1);
                            java.lang.Object[] objArr27 = new java.lang.Object[1];
                            a(b8, (short) (b8 | 653), (short) 39, objArr27);
                            obj8 = cls12.getMethod((java.lang.String) objArr27[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj8);
                        }
                        ((int[]) objArr25[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj8).invoke(null, objArr26)).intValue();
                        return objArr25;
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
                bArr = bArr2;
                java.lang.Object[] objArr28 = new java.lang.Object[1];
                b("ዡናᧉ콿㔆穛ࢫẕ鵰\uea5a飤躊൮驍⣿纵뵘", (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr28);
                try {
                    java.lang.Object[] objArr29 = {((java.lang.String) objArr28[0]).intern()};
                    java.lang.Object obj9 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                    if (obj9 == null) {
                        java.lang.Class cls13 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 41, 1922 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (android.view.ViewConfiguration.getTapTimeout() >> 16));
                        short s2 = (short) (bArr[14] - 1);
                        java.lang.Object[] objArr30 = new java.lang.Object[1];
                        a(34, s2, (byte) s2, objArr30);
                        obj9 = cls13.getMethod((java.lang.String) objArr30[0], java.lang.String.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj9);
                    }
                    java.lang.Object invoke2 = ((java.lang.reflect.Method) obj9).invoke(null, objArr29);
                    java.lang.Object[] objArr31 = new java.lang.Object[1];
                    b("霝霬헖\u0efc☄", 1 - android.text.TextUtils.getTrimmedLength(""), objArr31);
                } catch (java.lang.Throwable th2) {
                    java.lang.Throwable cause2 = th2.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th2;
                }
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

    static void init$0() {
        $$a = new byte[]{92, -25, 4, -11, 45, 10, -13, com.google.common.base.Ascii.SI, -2, -11, com.google.common.base.Ascii.NAK, -13, -32, 46, 1, 8, -17, 4, 19, -6, -5, 16, 2, -33, 19, com.google.common.base.Ascii.SUB, -10, -6, com.google.common.base.Ascii.VT, 8, -46, com.google.common.base.Ascii.US, com.google.common.base.Ascii.NAK, -17, -21, 43, -2, 1, -19, 13, com.google.common.base.Ascii.VT, -14, 16};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE;
    }
}
