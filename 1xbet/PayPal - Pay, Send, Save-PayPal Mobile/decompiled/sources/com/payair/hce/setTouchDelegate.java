package com.payair.hce;

/* loaded from: classes4.dex */
public class setTouchDelegate implements com.payair.hce.setUpMCBP {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static char AlternateContactlessPaymentDataJson;
    private static char DigitizedCardProfile;
    private static int RecordsJson;
    private static char SdkCoreAlternateContactlessPaymentDataImpl;
    private static int getAid;
    private static char valueOf;
    private final android.os.PowerManager values;
    private final boolean writeReplace = false;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, byte b, short s, java.lang.Object[] objArr) {
        int i2;
        int i3 = 718 - i;
        int i4 = b + 4;
        byte[] bArr = $$a;
        char[] cArr = new char[35 - s];
        if (bArr == null) {
            int i5 = i4;
            int i6 = 0;
            i3 = (i3 + (-i4)) - 2;
            i4 = i5;
            i2 = i6;
            int i7 = i4 + 1;
            cArr[i2] = (char) i3;
            if (i2 == 34 - s) {
                objArr[0] = new java.lang.String(cArr);
                return;
            }
            int i8 = i2 + 1;
            i5 = i7;
            i4 = bArr[i7];
            i6 = i8;
            i3 = (i3 + (-i4)) - 2;
            i4 = i5;
            i2 = i6;
            int i72 = i4 + 1;
            cArr[i2] = (char) i3;
            if (i2 == 34 - s) {
            }
        } else {
            i2 = 0;
            int i722 = i4 + 1;
            cArr[i2] = (char) i3;
            if (i2 == 34 - s) {
            }
        }
    }

    private static void c(int i, short s, int i2, java.lang.Object[] objArr) {
        int i3 = (i * 3) + 4;
        byte[] bArr = $$d;
        int i4 = s * 2;
        int i5 = (i2 * 2) + 110;
        byte[] bArr2 = new byte[i4 + 1];
        int i6 = -1;
        if (bArr == null) {
            i3++;
            i5 = i4 + (-i3);
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i5;
            if (i6 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            } else {
                int i7 = bArr[i3];
                i3++;
                i5 += -i7;
            }
        }
    }

    public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i, int i2, int i3) {
        com.payair.hce.setTouchDelegate settouchdelegate = (com.payair.hce.setTouchDelegate) objArr[0];
        int i4 = RecordsJson;
        getAid = ((i4 & 81) + (i4 | 81)) % 128;
        boolean isInteractive = settouchdelegate.values.isInteractive();
        int i5 = getAid;
        int i6 = i5 & 69;
        int i7 = (i5 ^ 69) | i6;
        RecordsJson = ((i6 & i7) + (i7 | i6)) % 128;
        return java.lang.Boolean.valueOf(isInteractive);
    }

    setTouchDelegate(android.content.Context context, boolean z) {
        this.values = (android.os.PowerManager) context.getSystemService("power");
    }

    @Override // com.payair.hce.setUpMCBP
    public boolean values() {
        int i = getAid;
        int i2 = ((i ^ 109) + ((i & 109) << 1)) % 128;
        RecordsJson = i2;
        if (!this.writeReplace) {
            int i3 = i2 & 115;
            int i4 = ((i2 | 115) & (~i3)) + (i3 << 1);
            getAid = i4 % 128;
            if (i4 % 2 != 0) {
                if (!((java.lang.Boolean) writeReplace(new java.lang.Object[]{this}, 89034096, -89034096, java.lang.System.identityHashCode(this))).booleanValue()) {
                    int i5 = RecordsJson;
                    int i6 = i5 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                    int i7 = ((((i5 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) | i6) << 1) - (~(-((~i6) & (i5 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE))))) - 1;
                    getAid = i7 % 128;
                    boolean z = i7 % 2 == 0;
                    getAid = (((i5 | 75) << 1) - (i5 ^ 75)) % 128;
                    return z;
                }
            } else {
                throw null;
            }
        }
        int i8 = getAid;
        int i9 = i8 & 21;
        int i10 = (i8 ^ 21) | i9;
        int i11 = (i9 & i10) + (i10 | i9);
        RecordsJson = i11 % 128;
        if (i11 % 2 == 0) {
            return true;
        }
        throw null;
    }

    private static void b(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2 = $10 + 107;
        $11 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getProductType getproducttype = new com.payair.hce.getProductType();
        char[] cArr = new char[charArray.length];
        getproducttype.AlternateContactlessPaymentDataJson = 0;
        char[] cArr2 = new char[2];
        while (getproducttype.AlternateContactlessPaymentDataJson < charArray.length) {
            cArr2[0] = charArray[getproducttype.AlternateContactlessPaymentDataJson];
            cArr2[1] = charArray[getproducttype.AlternateContactlessPaymentDataJson + 1];
            $11 = ($10 + 77) % 128;
            int i3 = 58224;
            for (int i4 = 0; i4 < 16; i4++) {
                char c = cArr2[1];
                char c2 = cArr2[0];
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(c), java.lang.Integer.valueOf(((c2 << 4) + ((char) (DigitizedCardProfile ^ 2144259807102049818L))) ^ r15), java.lang.Integer.valueOf(c2 >>> 5), java.lang.Integer.valueOf(SdkCoreAlternateContactlessPaymentDataImpl)};
                    int i5 = c2 + i3;
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(62 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), 1334 - android.view.MotionEvent.axisFromString(""), (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1));
                        byte b = (byte) ($$e - 4);
                        byte b2 = b;
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        c(b, b2, b2, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj);
                    }
                    char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    cArr2[1] = charValue;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr2[0]), java.lang.Integer.valueOf(((charValue << 4) + ((char) (AlternateContactlessPaymentDataJson ^ 2144259807102049818L))) ^ r13), java.lang.Integer.valueOf(charValue >>> 5), java.lang.Integer.valueOf(valueOf)};
                    int i6 = charValue + i3;
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 61, 1335 - android.graphics.Color.green(0), (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16));
                        byte b3 = (byte) ($$e - 4);
                        byte b4 = b3;
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        c(b3, b4, b4, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj2);
                    }
                    cArr2[0] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                    i3 -= 40503;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr[getproducttype.AlternateContactlessPaymentDataJson] = cArr2[0];
            cArr[getproducttype.AlternateContactlessPaymentDataJson + 1] = cArr2[1];
            java.lang.Object[] objArr6 = {getproducttype, getproducttype};
            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1765331150);
            if (obj3 == null) {
                obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(53 - android.view.KeyEvent.keyCodeFromString(""), 3543 - android.graphics.Color.green(0), (char) android.text.TextUtils.getCapsMode("", 0, 0))).getMethod("r", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1765331150, obj3);
            }
            ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
        }
        objArr[0] = new java.lang.String(cArr, 0, i);
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        RecordsJson = 0;
        getAid = 1;
        AlternateContactlessPaymentDataJson = (char) 36277;
        valueOf = (char) 6450;
        DigitizedCardProfile = (char) 42321;
        SdkCoreAlternateContactlessPaymentDataImpl = (char) 47680;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x047c, code lost:
    
        if (r0.contains(r2.getField((java.lang.String) r13[0]).get(null)) != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0744, code lost:
    
        if (r3 != false) goto L78;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r1v35, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r2v100 */
    /* JADX WARN: Type inference failed for: r2v101 */
    /* JADX WARN: Type inference failed for: r2v102 */
    /* JADX WARN: Type inference failed for: r2v103 */
    /* JADX WARN: Type inference failed for: r2v132, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v137, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r2v138 */
    /* JADX WARN: Type inference failed for: r2v83 */
    /* JADX WARN: Type inference failed for: r2v84 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.Object[] DigitizedCardProfile(android.content.Context context, int i, int i2) {
        java.lang.Object[] objArr;
        ?? r2;
        java.lang.Integer num;
        byte[] bArr;
        int i3 = RecordsJson;
        int i4 = (((i3 | 119) << 1) - (i3 ^ 119)) % 128;
        getAid = i4;
        java.lang.Integer num2 = -1347122530;
        try {
            if (context == null) {
                RecordsJson = ((i4 ^ 45) + ((i4 & 45) << 1)) % 128;
                java.lang.Object[] objArr2 = {new int[]{i}, new int[]{i}, null, new int[1]};
                int i5 = ~i;
                java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf((((~((-192358067) | i5)) | (~(i5 | (-812570919)))) * (-867)) + 399997024 + (((~(i | (-192358067))) | (~((-812570919) | i)) | 6684706) * (-1734)) + (((~(i | (-805886213))) | (~(i5 | (-6684707))) | (~((-185673361) | i))) * 867))};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num2);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), 2712 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                    byte b = $$a[14];
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    a(653, b, (byte) (b + 1), objArr4);
                    obj = cls.getMethod((java.lang.String) objArr4[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num2, obj);
                }
                ((int[]) objArr2[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr3)).intValue();
                return objArr2;
            }
            getAid = (((i3 | 111) << 1) - (i3 ^ 111)) % 128;
            try {
                int i6 = -(android.view.ViewConfiguration.getLongPressTimeout() >> 16);
                int i7 = -(-(i6 * 306));
                int i8 = (i7 ^ androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS) + ((i7 & androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS) << 1);
                int i9 = (i8 & 7038) + (i8 | 7038);
                int i10 = ~((i6 ^ 23) | (i6 & 23));
                int i11 = ~((i6 ^ i) | (i6 & i));
                int i12 = -(-(((i10 ^ i11) | (i10 & i11)) * 305));
                int i13 = ~i;
                int i14 = ~((i6 & i13) | (i6 ^ i13));
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                b("㟊\ue299怬䬁硌뢡\udabb\udac3㷞潐鹷䳴䚑毰鷏ක\uf3ceꝂ鹷䳴姈\ue816\u0bd3茩", ((((i9 | i12) << 1) - (i9 ^ i12)) - (~(((i14 & (-24)) | (i14 ^ (-24))) * 305))) - 1, objArr5);
                java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr5[0]);
                int i15 = -(android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16);
                int i16 = (i15 * 677) - 12150;
                int i17 = i15 | i;
                int i18 = ((i17 & (-19)) | (i17 ^ (-19))) * (-676);
                int i19 = ((i16 | i18) << 1) - (i16 ^ i18);
                int i20 = ~((i15 & (-19)) | (i15 ^ (-19)));
                int i21 = ~(i13 | i15);
                int i22 = -(-(((i20 & i21) | (i20 ^ i21)) * 676));
                int i23 = ~i15;
                int i24 = ~((i23 & (-19)) | (i23 ^ (-19)));
                int i25 = ~((i13 ^ (-19)) | (i13 & (-19)));
                int i26 = (i24 ^ i25) | (i24 & i25);
                int i27 = i15 | 18;
                int i28 = ~((i27 ^ i) | (i27 & i));
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                b("\ue941퐱\u2cf8䈕膢潚癌㜄䩆聟䨭턗Ꮤᔄ\ueb6a봘㐽뜱", ((((i19 | i22) << 1) - (i22 ^ i19)) - (~(((i28 ^ i26) | (i26 & i28)) * 676))) - 1, objArr6);
                java.lang.Object invoke = cls2.getMethod((java.lang.String) objArr6[0], null).invoke(context, null);
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                b("㟊\ue299怬䬁硌뢡\udabb\udac3㷞潐鹷䳴䚑毰鷏ක㠨Ⴐ擗坛膢潚癌㜄䩆聟䨭턗Ꮤᔄ\ueb6a봘㐽뜱", 33 - (~(-android.graphics.Color.green(0))), objArr7);
                java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr7[0]);
                int minimumFlingVelocity = android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16;
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                b("깕懑\uf57b秨\udbf9䃔", (minimumFlingVelocity ^ 5) + ((minimumFlingVelocity & 5) << 1), objArr8);
                if ((cls3.getField((java.lang.String) objArr8[0]).getInt(invoke) & 2) != 0) {
                    int i29 = RecordsJson + 111;
                    int i30 = i29 % 128;
                    getAid = i30;
                    if (i29 % 2 == 0) {
                        int i31 = 5 / 5;
                    }
                    RecordsJson = ((i30 ^ 9) + ((i30 & 9) << 1)) % 128;
                    objArr = new java.lang.Object[]{new int[]{i}, new int[]{(~(i & 1)) & (i | 1)}, null, new int[1]};
                    java.lang.Object[] objArr9 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf((((~(936339162 | i13)) | 68589822) * (-328)) + 427957992 + ((68589822 | i) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE) + (((~((-936339163) | i)) | 67502298 | (~(937426686 | i13))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE))};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num2);
                    if (obj2 == null) {
                        java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2712, (char) (1 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))));
                        byte b2 = $$a[14];
                        java.lang.Object[] objArr10 = new java.lang.Object[1];
                        a(653, b2, (byte) (b2 + 1), objArr10);
                        obj2 = cls4.getMethod((java.lang.String) objArr10[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num2, obj2);
                    }
                    ((int[]) objArr[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr9)).intValue();
                    RecordsJson = (getAid + 83) % 128;
                } else {
                    objArr = new java.lang.Object[]{new int[]{i}, new int[]{i}, null, new int[1]};
                    int i32 = ~(261113795 | i);
                    java.lang.Object[] objArr11 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf(((600178646 | i32) * (-658)) + 1000239228 + ((i32 | 541440020) * 658))};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num2);
                    if (obj3 == null) {
                        java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 51, 2713 - android.graphics.Color.red(0), (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16));
                        byte b3 = $$a[14];
                        java.lang.Object[] objArr12 = new java.lang.Object[1];
                        a(653, b3, (byte) (b3 + 1), objArr12);
                        obj3 = cls5.getMethod((java.lang.String) objArr12[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num2, obj3);
                    }
                    ((int[]) objArr[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr11)).intValue();
                }
                if (((int[]) objArr[1])[0] != i) {
                    int i33 = (getAid + 63) % 128;
                    RecordsJson = i33;
                    getAid = ((i33 ^ 25) + ((i33 & 25) << 1)) % 128;
                    return objArr;
                }
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-2058003131);
                if (obj4 == null) {
                    java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - android.view.KeyEvent.getDeadChar(0, 0), ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 1738, (char) ((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 5826));
                    byte b4 = $$a[14];
                    java.lang.Object[] objArr13 = new java.lang.Object[1];
                    a(653, b4, (byte) (b4 + 1), objArr13);
                    obj4 = cls6.getMethod((java.lang.String) objArr13[0], null);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-2058003131, obj4);
                }
                java.util.Set set = (java.util.Set) ((java.lang.reflect.Method) obj4).invoke(null, null);
                java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - android.view.KeyEvent.normalizeMetaState(0), 1738 - android.text.TextUtils.indexOf("", "", 0), (char) (5826 - android.text.TextUtils.getOffsetBefore("", 0)));
                byte[] bArr2 = $$a;
                byte b5 = bArr2[14];
                java.lang.Object[] objArr14 = new java.lang.Object[1];
                a(653, b5, (byte) (b5 + 1), objArr14);
                if (!set.contains(cls7.getField((java.lang.String) objArr14[0]).get(null))) {
                    java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 33, android.graphics.Color.rgb(0, 0, 0) + 16778954, (char) (5826 - (android.view.ViewConfiguration.getScrollBarSize() >> 8)));
                    byte b6 = bArr2[23];
                    java.lang.Object[] objArr15 = new java.lang.Object[1];
                    a(600, b6, (byte) (b6 - 4), objArr15);
                }
                if (android.os.Build.VERSION.SDK_INT == 30) {
                    java.lang.Object[] objArr16 = {new int[]{i}, new int[]{i}, null, new int[1]};
                    java.lang.Object[] objArr17 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf(((~(i | (-839493633))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL) + 931137972 + (((~((-839493633) | i13)) | 26236420) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL))};
                    java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num2);
                    if (obj5 == null) {
                        java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.Gravity.getAbsoluteGravity(0, 0), 2713 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (android.os.Process.myPid() >> 22));
                        byte b7 = bArr2[14];
                        java.lang.Object[] objArr18 = new java.lang.Object[1];
                        a(653, b7, (byte) (b7 + 1), objArr18);
                        obj5 = cls9.getMethod((java.lang.String) objArr18[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num2, obj5);
                    }
                    ((int[]) objArr16[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(null, objArr17)).intValue();
                    getAid = (RecordsJson + 121) % 128;
                    return objArr16;
                }
                try {
                    r2 = 33;
                } catch (java.lang.Exception unused) {
                    r2 = 0;
                }
                if (android.os.Build.VERSION.SDK_INT > 33) {
                    r2 = new java.lang.Object[1];
                    b("Ⰹ倸衤狁獦쏂쫩䦋揋仦嬳型\ud969覵㝦급譬્䃀潸檸鳸郺쀿\ue799\ue974\ue280⛚", android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 20, r2);
                    try {
                        java.lang.Object[] objArr19 = {(java.lang.String) r2[0]};
                        java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1161224381);
                        if (obj6 == null) {
                            java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 3161, (char) (android.view.View.resolveSizeAndState(0, 0, 0) + 33099));
                            short s = (short) (bArr2[14] + 1);
                            byte b8 = (byte) (s | 38);
                            java.lang.Object[] objArr20 = new java.lang.Object[1];
                            a(s, b8, (byte) (b8 - 4), objArr20);
                            obj6 = cls10.getMethod((java.lang.String) objArr20[0], java.lang.String.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1161224381, obj6);
                        }
                        r2 = (java.lang.reflect.Method) obj6;
                        long longValue = ((java.lang.Long) r2.invoke(null, objArr19)).longValue();
                        long j = ~longValue;
                        r2 = 0;
                        long j2 = i;
                        num = num2;
                        bArr = bArr2;
                        long j3 = ((((((-500) * longValue) + 469555000) + (((~(j | (-939110))) | (~((longValue | 939109) | j2))) * 501)) + ((~(939109 | j)) * 1002)) + ((~((939109 | (~j2)) | longValue)) * 501)) - 1336728998;
                        int i34 = ((int) (j3 >> 32)) & ((((~(1832874525 | i)) | (-1024866360)) * (-366)) + 1156156970 + (((~((-268437539) | i)) | 1076445704) * 366));
                        int i35 = ((int) j3) & ((((~(1733654989 | i)) * (-301)) - 1321979762) + (((~((-1129413002) | i)) | (~(1728327884 | i13))) * (-301)) + (((~((-1728327885) | i)) | (-1129413002)) * 301));
                        if (((i35 ^ i34) | (i34 & i35)) == 1) {
                            getAid = (RecordsJson + 99) % 128;
                        }
                        num2 = num;
                        java.lang.Object[] objArr21 = {new int[]{i}, new int[]{i}, null, new int[1]};
                        ?? r4 = {java.lang.Integer.valueOf(i2), r2, java.lang.Integer.valueOf((((~((-808404042) | i13)) | (~((-196524944) | i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) + 946219018 + (((~(i | (-805913665))) | (~((-194034567) | i13))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE))};
                        java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num2);
                        if (obj7 == null) {
                            java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 2712, (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1));
                            byte b9 = $$a[14];
                            java.lang.Object[] objArr22 = new java.lang.Object[1];
                            a(653, b9, (byte) (b9 + 1), objArr22);
                            obj7 = cls11.getMethod((java.lang.String) objArr22[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num2, obj7);
                        }
                        ((int[]) objArr21[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj7).invoke(null, r4)).intValue();
                        return objArr21;
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
                num = num2;
                bArr = bArr2;
                r2 = 0;
                int i36 = (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                int i37 = (i36 * (-919)) - 12866;
                int i38 = ~i36;
                int i39 = (i38 ^ (-15)) | (i38 & (-15));
                int i40 = ~((i39 & i) | (i39 ^ i));
                int i41 = i13 | (-15);
                int i42 = ~((i41 ^ i36) | (i41 & i36));
                int i43 = ((i40 ^ i42) | (i40 & i42)) * 920;
                int i44 = (i37 & i43) + (i37 | i43);
                int i45 = -(-(((~(i38 | (-15))) | (~((i38 ^ i13) | (i38 & i13)))) * 920));
                int i46 = ~((i39 & i13) | (i39 ^ i13));
                int i47 = ~(i38 | 14 | i);
                int i48 = (i47 ^ i46) | (i46 & i47);
                int i49 = ~(i36 | (-15) | i);
                java.lang.Object[] objArr23 = new java.lang.Object[1];
                b("\uf71e蒟裱ⰴ譬્䃀潸檸鳸郺쀿巁\uf511", (((i44 & i45) + (i45 | i44)) - (~(((i49 ^ i48) | (i49 & i48)) * 920))) - 1, objArr23);
                try {
                    java.lang.Object[] objArr24 = {(java.lang.String) objArr23[0]};
                    java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                    if (obj8 == null) {
                        java.lang.Class cls12 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (android.view.ViewConfiguration.getTouchSlop() >> 8) + 1921, (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                        short s2 = (short) (bArr[14] + 1);
                        byte b10 = (byte) (s2 | 38);
                        java.lang.Object[] objArr25 = new java.lang.Object[1];
                        a(s2, b10, (byte) (b10 - 4), objArr25);
                        obj8 = cls12.getMethod((java.lang.String) objArr25[0], java.lang.String.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj8);
                    }
                    java.lang.Object invoke2 = ((java.lang.reflect.Method) obj8).invoke(null, objArr24);
                    java.lang.Object[] objArr26 = new java.lang.Object[1];
                    b("淝ꏀ", 0 - (~(-android.text.TextUtils.getOffsetAfter("", 0))), objArr26);
                    boolean equals = invoke2.equals((java.lang.String) objArr26[0]);
                    getAid = (RecordsJson + 109) % 128;
                } catch (java.lang.Throwable th2) {
                    num2 = num;
                    try {
                        java.lang.Throwable cause2 = th2.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th2;
                    } catch (java.lang.Exception unused2) {
                    }
                }
                getAid = (RecordsJson + 17) % 128;
                java.lang.Object[] objArr27 = {new int[]{i}, new int[]{(~(i & 10)) & (i | 10)}, null, new int[1]};
                java.lang.Object[] objArr28 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf(((1024568681 | i) * (-859)) + 331760822 + (((~(i | (-1007681642))) | (~(1024568681 | i13))) * 859) + (((~(19639696 | i13)) | (-1027321338)) * 859))};
                java.lang.Integer num3 = num;
                java.lang.Object obj9 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num3);
                if (obj9 == null) {
                    java.lang.Class cls13 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.combineMeasuredStates(0, 0) + 50, (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2713, (char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
                    byte b11 = bArr[14];
                    java.lang.Object[] objArr29 = new java.lang.Object[1];
                    a(653, b11, (byte) (b11 + 1), objArr29);
                    obj9 = cls13.getMethod((java.lang.String) objArr29[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num3, obj9);
                }
                ((int[]) objArr27[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj9).invoke(null, objArr28)).intValue();
                int i50 = getAid + 99;
                RecordsJson = i50 % 128;
                if (i50 % 2 == 0) {
                    return objArr27;
                }
                throw new java.lang.ArithmeticException();
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

    static void init$1() {
        $$d = new byte[]{5, -66, -84, -78};
        $$e = 4;
    }

    private boolean AlternateContactlessPaymentDataJson() {
        return ((java.lang.Boolean) writeReplace(new java.lang.Object[]{this}, 89034096, -89034096, java.lang.System.identityHashCode(this))).booleanValue();
    }

    static void init$0() {
        $$a = new byte[]{com.visa.cbp.getEncExpo.IResultReceiver, -50, -127, 91, -45, -10, 13, -15, 2, com.google.common.base.Ascii.VT, -21, 13, 32, -46, -1, -8, 17, -4, -19, 6, 5, com.visa.cbp.getEncExpo.onUnminimized, -2, 33, -19, -26, 10, 6, -11, -8, 46, -31, -21, 17, com.google.common.base.Ascii.NAK, -43, 2, -1, 19, -13, -11, 14, com.visa.cbp.getEncExpo.onUnminimized};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE;
    }
}
