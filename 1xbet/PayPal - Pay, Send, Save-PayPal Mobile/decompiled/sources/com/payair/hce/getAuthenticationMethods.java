package com.payair.hce;

/* loaded from: classes4.dex */
public class getAuthenticationMethods extends java.lang.RuntimeException {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final byte[] $$j = null;
    private static final int $$k = 0;
    private static int $10;
    private static int $11;
    private static long DigitizedCardProfile;
    private static int valueOf;
    private static int values;
    private final com.payair.hce.getVisaProvisioningResponse AlternateContactlessPaymentDataJson;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(short s, short s2, byte b, java.lang.Object[] objArr) {
        int i;
        int i2 = 718 - s;
        byte[] bArr = $$d;
        int i3 = 42 - s2;
        char[] cArr = new char[b + 1];
        if (bArr == null) {
            int i4 = i3;
            int i5 = 0;
            i2 = (i3 + i2) - 2;
            i3 = i4;
            i = i5;
            cArr[i] = (char) i2;
            int i6 = i3 + 1;
            int i7 = i + 1;
            if (i == b) {
                objArr[0] = new java.lang.String(cArr);
                return;
            }
            byte b2 = bArr[i6];
            i3 = i2;
            i2 = b2;
            i4 = i6;
            i5 = i7;
            i2 = (i3 + i2) - 2;
            i3 = i4;
            i = i5;
            cArr[i] = (char) i2;
            int i62 = i3 + 1;
            int i72 = i + 1;
            if (i == b) {
            }
        } else {
            i = 0;
            cArr[i] = (char) i2;
            int i622 = i3 + 1;
            int i722 = i + 1;
            if (i == b) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void f(short s, int i, short s2, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = s2 * 3;
        int i5 = (s * 4) + 4;
        byte[] bArr = $$j;
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            i3 = i5;
            int i6 = i4;
            int i7 = 0;
            i5 += i6;
            i3++;
            i2 = i7;
            bArr2[i2] = (byte) i5;
            i7 = i2 + 1;
            if (i2 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i6 = bArr[i3];
            i5 += i6;
            i3++;
            i2 = i7;
            bArr2[i2] = (byte) i5;
            i7 = i2 + 1;
            if (i2 == i4) {
            }
        } else {
            int i8 = 119 - (i * 2);
            i2 = 0;
            i3 = i5;
            i5 = i8;
            bArr2[i2] = (byte) i5;
            i7 = i2 + 1;
            if (i2 == i4) {
            }
        }
    }

    public getAuthenticationMethods(java.lang.String str) {
        super(str);
        this.AlternateContactlessPaymentDataJson = com.payair.hce.getVisaProvisioningResponse.values;
    }

    public getAuthenticationMethods(java.lang.String str, com.payair.hce.getVisaProvisioningResponse getvisaprovisioningresponse) {
        super(str);
        this.AlternateContactlessPaymentDataJson = getvisaprovisioningresponse == null ? com.payair.hce.getVisaProvisioningResponse.values : getvisaprovisioningresponse;
    }

    private static void e(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] cArr;
        int i2 = $10;
        $11 = (i2 + 89) % 128;
        if (str != null) {
            int i3 = i2 + 107;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        com.payair.hce.getCardholderValidator getcardholdervalidator = new com.payair.hce.getCardholderValidator();
        char[] writeReplace = com.payair.hce.getCardholderValidator.writeReplace(DigitizedCardProfile ^ (-3824242241614154557L), cArr, i);
        getcardholdervalidator.valueOf = 4;
        while (getcardholdervalidator.valueOf < writeReplace.length) {
            getcardholdervalidator.DigitizedCardProfile = getcardholdervalidator.valueOf - 4;
            int i4 = getcardholdervalidator.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Long.valueOf(writeReplace[getcardholdervalidator.valueOf] ^ writeReplace[getcardholdervalidator.valueOf % 4]), java.lang.Long.valueOf(getcardholdervalidator.DigitizedCardProfile), java.lang.Long.valueOf(DigitizedCardProfile)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1178927836);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 40, android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 1921, (char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 1));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    f((short) 0, 1, (short) 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1178927836, obj);
                }
                writeReplace[i4] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {getcardholdervalidator, getcardholdervalidator};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1228006564);
                if (obj2 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 28, (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 429, (char) (android.view.MotionEvent.axisFromString("") + 31611));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    f((short) 0, 0, (short) 0, objArr5);
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
        values = 0;
        valueOf = 1;
        DigitizedCardProfile = -1751557224689864748L;
    }

    static void init$1() {
        $$j = new byte[]{com.google.common.base.Ascii.US, -55, -84, 106};
        $$k = 8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0355, code lost:
    
        if (r0.contains(r2.getField((java.lang.String) r15[0]).get(null)) != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x05c8, code lost:
    
        if (r0.equals(((java.lang.String) r4[0]).intern()) != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0520, code lost:
    
        if (((r0 & ((((((~(1918480176 | r4)) | (~(939260708 | r4))) * (-867)) + 1972008040) + ((((~(1918480176 | r27)) | (-2013003573)) | (~(939260708 | r27))) * (-1734))) + ((((~(r4 | 2013003572)) | (~((-94523397) | r27))) | (~((-1073742865) | r27))) * 867))) | (((int) r2) & ((((((~((-1345576039) | r27)) | 1342276644) * (-140)) + 438224359) + ((~((-3299395) | r27)) * 70)) + (((~((-91650372) | r27)) | 1430627621) * 70)))) == 1) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x06f7 A[Catch: all -> 0x00bb, TryCatch #6 {all -> 0x00bb, blocks: (B:5:0x003b, B:7:0x0071, B:8:0x00a8, B:18:0x015e, B:20:0x018c, B:21:0x01c9, B:26:0x0292, B:28:0x02a3, B:29:0x02db, B:57:0x06b6, B:59:0x06f7, B:60:0x0734, B:49:0x05e8, B:51:0x0631, B:52:0x067a, B:96:0x0371, B:98:0x03ac, B:99:0x03ed, B:103:0x01f2, B:105:0x0233, B:106:0x0277), top: B:2:0x0024 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.Object[] AlternateContactlessPaymentDataJson(android.content.Context context, int i, int i2) {
        java.lang.Object[] objArr;
        java.lang.Integer num;
        java.lang.Integer num2;
        java.lang.Object obj;
        java.lang.Integer num3;
        int i3 = values;
        valueOf = (i3 + 27) % 128;
        try {
            if (context == null) {
                java.lang.Object[] objArr2 = {new int[]{i}, new int[]{i}, null, new int[1]};
                int i4 = ~i;
                java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf((((~(i4 | (-420691317))) | 419511568 | (~(584237668 | i4))) * (-397)) + 1459168728 + ((i | 1002569488) * 397))};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                if (obj2 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.alpha(0) + 50, android.graphics.Color.red(0) + 2713, (char) android.text.TextUtils.indexOf("", ""));
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    d((short) 653, (short) 39, (byte) 34, objArr4);
                    obj2 = cls.getMethod((java.lang.String) objArr4[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj2);
                }
                ((int[]) objArr2[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
                return objArr2;
            }
            valueOf = (i3 + 87) % 128;
            try {
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                e("ﰱ뾍\uf46aﱐ렡ꓴ술\ue916适㢗嚄֮⓪䰭\ufae2醨륀\udfc8轜⹖䴂獥\u139a뫠\ue198蜖\ua7e4", ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 1, objArr5);
                java.lang.Class<?> cls2 = java.lang.Class.forName(((java.lang.String) objArr5[0]).intern());
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                e("휱赓\uf504흖弇阡썞ฃ묝\u0a50埢\ue2cf\u0fea绽ﮖ皓鉊\ued16踏줰昧䆻", (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr6);
                java.lang.Object invoke = cls2.getMethod(((java.lang.String) objArr6[0]).intern(), null).invoke(context, null);
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                e("\udcc5撆憊\udca4ᣒ翿埀䧥냶\ue39c썤ꕝО霦漂ㅛ馴Ӄ᪼躥淅ꡬ蘺ᨦ셹尕㈜瞪嚎쇘ꆨ쏖⨮畳䵱彵빃ᤞ", android.view.KeyEvent.keyCodeFromString("") + 1, objArr7);
                java.lang.Class<?> cls3 = java.lang.Class.forName(((java.lang.String) objArr7[0]).intern());
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                e("\ue9c6Ⅱ拙\ue9a0Ԋ㨚咖吨藩", (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 1, objArr8);
                if ((cls3.getField(((java.lang.String) objArr8[0]).intern()).getInt(invoke) & 2) != 0) {
                    valueOf = (values + 45) % 128;
                    objArr = new java.lang.Object[]{new int[]{i}, new int[]{i ^ 1}, null, new int[1]};
                    int i5 = ~(84101983 | i);
                    java.lang.Object[] objArr9 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf((((i5 | 16861958) * (-196)) - 279237556) + ((i5 | 67240025) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE))};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    if (obj3 == null) {
                        java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getTouchSlop() >> 8), 2713 - android.graphics.Color.green(0), (char) android.view.View.getDefaultSize(0, 0));
                        java.lang.Object[] objArr10 = new java.lang.Object[1];
                        d((short) 653, (short) 39, (byte) 34, objArr10);
                        obj3 = cls4.getMethod((java.lang.String) objArr10[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj3);
                    }
                    ((int[]) objArr[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr9)).intValue();
                } else {
                    objArr = new java.lang.Object[]{new int[]{i}, new int[]{i}, null, new int[1]};
                    java.lang.Object[] objArr11 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf(((((~((-997719506) | r2)) | 6684673) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) - 319415784) + ((~((-6684674) | i)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) + (((~((~i) | (-7209480))) | 524806 | (~((-991034833) | i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE))};
                    java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    if (obj4 == null) {
                        java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 50, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 2714, (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16));
                        java.lang.Object[] objArr12 = new java.lang.Object[1];
                        d((short) 653, (short) 39, (byte) 34, objArr12);
                        obj4 = cls5.getMethod((java.lang.String) objArr12[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj4);
                    }
                    ((int[]) objArr[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr11)).intValue();
                }
                if (((int[]) objArr[1])[0] != i) {
                    return objArr;
                }
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-2058003131);
                if (obj5 == null) {
                    java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), 1738 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (char) (5826 - android.view.KeyEvent.normalizeMetaState(0)));
                    java.lang.Object[] objArr13 = new java.lang.Object[1];
                    d((short) 653, (short) 39, (byte) 34, objArr13);
                    obj5 = cls6.getMethod((java.lang.String) objArr13[0], null);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-2058003131, obj5);
                }
                java.util.Set set = (java.util.Set) ((java.lang.reflect.Method) obj5).invoke(null, null);
                java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.normalizeMetaState(0) + 33, 1737 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) (5826 - (android.os.Process.myTid() >> 22)));
                java.lang.Object[] objArr14 = new java.lang.Object[1];
                d((short) 653, (short) 39, (byte) 34, objArr14);
                if (!set.contains(cls7.getField((java.lang.String) objArr14[0]).get(null))) {
                    java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - android.text.TextUtils.indexOf("", "", 0, 0), 1738 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (5826 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16)));
                    byte b = $$d[0];
                    java.lang.Object[] objArr15 = new java.lang.Object[1];
                    d((short) 600, b, b, objArr15);
                }
                if (android.os.Build.VERSION.SDK_INT == 30) {
                    java.lang.Object[] objArr16 = {new int[]{i}, new int[]{i}, null, new int[1]};
                    java.lang.Object[] objArr17 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf(((((~(699390392 | i)) | 303048192) * (-140)) - 794893240) + ((~(1002438584 | i)) * 70) + (((~(i | 305538592)) | 999948184) * 70))};
                    java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    if (obj6 == null) {
                        java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 51, (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 2713, (char) android.view.View.resolveSize(0, 0));
                        java.lang.Object[] objArr18 = new java.lang.Object[1];
                        d((short) 653, (short) 39, (byte) 34, objArr18);
                        obj6 = cls9.getMethod((java.lang.String) objArr18[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj6);
                    }
                    ((int[]) objArr16[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj6).invoke(null, objArr17)).intValue();
                    return objArr16;
                }
                try {
                    try {
                        if (android.os.Build.VERSION.SDK_INT > 33) {
                            try {
                                java.lang.Object[] objArr19 = new java.lang.Object[1];
                                e("\ud908閗\uef0e\ud927\ue604軥\ud954뜢땻ኍ䷪富Ǆ晷\ue184쾕鱷\uf5d8鑡瀹栝奲ࣥ\ue4d6쒣괕벖襹卅ゆ⼪㴊", android.graphics.Color.alpha(0) + 1, objArr19);
                                try {
                                    java.lang.Object[] objArr20 = {((java.lang.String) objArr19[0]).intern()};
                                    java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1161224381);
                                    if (obj7 == null) {
                                        java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - android.view.KeyEvent.keyCodeFromString(""), android.graphics.Color.blue(0) + 3161, (char) (33099 - android.graphics.Color.blue(0)));
                                        short s = (short) ($$d[14] - 1);
                                        byte b2 = (byte) s;
                                        java.lang.Object[] objArr21 = new java.lang.Object[1];
                                        d(s, b2, b2, objArr21);
                                        obj7 = cls10.getMethod((java.lang.String) objArr21[0], java.lang.String.class);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1161224381, obj7);
                                    }
                                    long longValue = ((java.lang.Long) ((java.lang.reflect.Method) obj7).invoke(null, objArr20)).longValue();
                                    long j = i;
                                    long j2 = ~j;
                                    num3 = -1347122530;
                                    long j3 = ~((~longValue) | j);
                                    num2 = 0;
                                    long j4 = ((((((-574) * longValue) - 157653422794L) + (((~(j2 | (-274657532))) | j3) * 1150)) + ((j3 | (~(j2 | longValue))) * (-575))) + (((~((-274657532) | j)) | (~(274657531 | j2))) * 575)) - 1612325639;
                                    int i6 = (int) (j4 >> 32);
                                    int i7 = ~i;
                                } catch (java.lang.Throwable th) {
                                    java.lang.Throwable cause = th.getCause();
                                    if (cause != null) {
                                        throw cause;
                                    }
                                    throw th;
                                }
                            } catch (java.lang.Exception unused) {
                                num2 = 0;
                                num = -1347122530;
                                java.lang.Object[] objArr22 = {new int[]{i}, new int[]{i}, null, new int[1]};
                                java.lang.Object[] objArr23 = {java.lang.Integer.valueOf(i2), num2, java.lang.Integer.valueOf((((~((-470417410) | i)) | (~(534511575 | i))) * 69) + 882311626 + (((~(i | (-470453010))) | 35600 | (~(534475975 | i))) * (-69)) + 125073758)};
                                obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num);
                                if (obj == null) {
                                }
                                ((int[]) objArr22[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr23)).intValue();
                                return objArr22;
                            }
                        } else {
                            num3 = -1347122530;
                            num2 = 0;
                            java.lang.Object[] objArr24 = new java.lang.Object[1];
                            e("ꕰ㽊\uf0f3ꔂ嵬\u2432웳్쥉롛刌\ue0aa綯쳤ﹷ瓽\ue001", -android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr24);
                            try {
                                java.lang.Object[] objArr25 = {((java.lang.String) objArr24[0]).intern()};
                                java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                if (obj8 == null) {
                                    java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.view.View.combineMeasuredStates(0, 0), android.graphics.Color.alpha(0) + 1921, (char) android.graphics.Color.blue(0));
                                    short s2 = (short) ($$d[14] - 1);
                                    byte b3 = (byte) s2;
                                    java.lang.Object[] objArr26 = new java.lang.Object[1];
                                    d(s2, b3, b3, objArr26);
                                    obj8 = cls11.getMethod((java.lang.String) objArr26[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj8);
                                }
                                java.lang.Object invoke2 = ((java.lang.reflect.Method) obj8).invoke(null, objArr25);
                                java.lang.Object[] objArr27 = new java.lang.Object[1];
                                e("驜⪝꺾驭ጕ", (-16777215) - android.graphics.Color.rgb(0, 0, 0), objArr27);
                            } catch (java.lang.Throwable th2) {
                                num = -1347122530;
                                try {
                                    java.lang.Throwable cause2 = th2.getCause();
                                    if (cause2 != null) {
                                        throw cause2;
                                    }
                                    throw th2;
                                } catch (java.lang.Exception unused2) {
                                    java.lang.Object[] objArr222 = {new int[]{i}, new int[]{i}, null, new int[1]};
                                    java.lang.Object[] objArr232 = {java.lang.Integer.valueOf(i2), num2, java.lang.Integer.valueOf((((~((-470417410) | i)) | (~(534511575 | i))) * 69) + 882311626 + (((~(i | (-470453010))) | 35600 | (~(534475975 | i))) * (-69)) + 125073758)};
                                    obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num);
                                    if (obj == null) {
                                        java.lang.Class cls12 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.combineMeasuredStates(0, 0) + 50, android.text.TextUtils.getTrimmedLength("") + 2713, (char) android.text.TextUtils.indexOf("", "", 0));
                                        java.lang.Object[] objArr28 = new java.lang.Object[1];
                                        d((short) 653, (short) 39, (byte) 34, objArr28);
                                        obj = cls12.getMethod((java.lang.String) objArr28[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num, obj);
                                    }
                                    ((int[]) objArr222[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr232)).intValue();
                                    return objArr222;
                                }
                            }
                        }
                        java.lang.Object[] objArr29 = {new int[]{i}, new int[]{i ^ 10}, null, new int[1]};
                        int i8 = ~((-1011325367) | i);
                        int i9 = ~i;
                        java.lang.Object[] objArr30 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf(((4299156 | i8) * (-280)) + 1752052936 + ((i8 | (~(6396381 | i))) * 140) + (((~(i | (-1007026211))) | (~((-4299157) | i9)) | (~(1013422591 | i9))) * 140))};
                        java.lang.Integer num4 = num3;
                        java.lang.Object obj9 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num4);
                        if (obj9 == null) {
                            java.lang.Class cls13 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 50, 2713 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (char) ((android.os.Process.getThreadPriority(0) + 20) >> 6));
                            java.lang.Object[] objArr31 = new java.lang.Object[1];
                            d((short) 653, (short) 39, (byte) 34, objArr31);
                            obj9 = cls13.getMethod((java.lang.String) objArr31[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num4, obj9);
                        }
                        ((int[]) objArr29[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj9).invoke(null, objArr30)).intValue();
                        return objArr29;
                    } catch (java.lang.Exception unused3) {
                    }
                } catch (java.lang.Exception unused4) {
                    num = -1347122530;
                    num2 = 0;
                }
            } catch (java.lang.Throwable th3) {
                java.lang.Throwable cause3 = th3.getCause();
                if (cause3 != null) {
                    throw cause3;
                }
                throw th3;
            }
            num = num3;
            java.lang.Object[] objArr2222 = {new int[]{i}, new int[]{i}, null, new int[1]};
            java.lang.Object[] objArr2322 = {java.lang.Integer.valueOf(i2), num2, java.lang.Integer.valueOf((((~((-470417410) | i)) | (~(534511575 | i))) * 69) + 882311626 + (((~(i | (-470453010))) | 35600 | (~(534475975 | i))) * (-69)) + 125073758)};
            obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num);
            if (obj == null) {
            }
            ((int[]) objArr2222[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2322)).intValue();
            return objArr2222;
        } catch (java.lang.Throwable th4) {
            java.lang.Throwable cause4 = th4.getCause();
            if (cause4 != null) {
                throw cause4;
            }
            throw th4;
        }
    }

    static void init$0() {
        $$d = new byte[]{5, 98, 33, 67, 45, 10, -13, com.google.common.base.Ascii.SI, -2, -11, com.google.common.base.Ascii.NAK, -13, -32, 46, 1, 8, -17, 4, 19, -6, -5, 16, 2, -33, 19, com.google.common.base.Ascii.SUB, -10, -6, com.google.common.base.Ascii.VT, 8, -46, com.google.common.base.Ascii.US, com.google.common.base.Ascii.NAK, -17, -21, 43, -2, 1, -19, 13, com.google.common.base.Ascii.VT, -14, 16};
        $$e = 226;
    }
}
