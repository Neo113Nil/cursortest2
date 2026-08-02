package com.payair.hce;

/* loaded from: classes4.dex */
public final class setOnContextClickListener {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static char IccPrivateKeyCrtComponentsJson;
    private static char RecordsJson;
    private static char SdkCoreBusinessLogicModuleImpl;
    private static char getAid;
    private static char[] getCiacDecline;
    private static int getCvrMaskAnd;
    private static int getGpoResponse;
    private final java.lang.String AlternateContactlessPaymentDataJson;
    private final byte[] DigitizedCardProfile;
    private final boolean SdkCoreAlternateContactlessPaymentDataImpl;
    private final boolean getProfileVersion;
    private final byte[] valueOf;
    private final byte[] values;
    private final byte writeReplace;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [int] */
    /* JADX WARN: Type inference failed for: r6v7, types: [int] */
    /* JADX WARN: Type inference failed for: r6v9 */
    private static void a(byte b, short s, byte b2, java.lang.Object[] objArr) {
        int i = 65 - (s * 2);
        byte[] bArr = $$a;
        int i2 = (b2 * 2) + 4;
        int i3 = b * 4;
        byte[] bArr2 = new byte[i3 + 35];
        int i4 = -1;
        byte b3 = i;
        if (bArr == null) {
            int i5 = (i2 + i) - 2;
            i2++;
            i4 = -1;
            b3 = i5;
        }
        while (true) {
            int i6 = i4 + 1;
            bArr2[i6] = b3;
            if (i6 == i3 + 34) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i7 = i2;
            b3 = (b3 + bArr[i2]) - 2;
            i2 = i7 + 1;
            i4 = i6;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(short s, int i, byte b, java.lang.Object[] objArr) {
        int i2;
        int i3 = (b * 2) + 4;
        int i4 = s * 3;
        byte[] bArr = $$d;
        int i5 = i + 107;
        byte[] bArr2 = new byte[1 - i4];
        if (bArr == null) {
            int i6 = i3;
            int i7 = 0;
            i5 += i3;
            i3 = i6 + 1;
            i2 = i7;
            bArr2[i2] = (byte) i5;
            if (i2 == 0 - i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i8 = i2 + 1;
            i6 = i3;
            i3 = bArr[i3];
            i7 = i8;
            i5 += i3;
            i3 = i6 + 1;
            i2 = i7;
            bArr2[i2] = (byte) i5;
            if (i2 == 0 - i4) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i5;
            if (i2 == 0 - i4) {
            }
        }
    }

    public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
        return valueOf(objArr);
    }

    public setOnContextClickListener(java.lang.String str, byte[] bArr, byte[] bArr2, byte[] bArr3, byte b, boolean z, boolean z2) {
        this.AlternateContactlessPaymentDataJson = str;
        this.valueOf = bArr;
        this.values = bArr2;
        this.DigitizedCardProfile = bArr3;
        this.writeReplace = b;
        this.getProfileVersion = z;
        this.SdkCoreAlternateContactlessPaymentDataImpl = z2;
    }

    public final byte[] values() {
        int i = getGpoResponse;
        getCvrMaskAnd = (i + 55) % 128;
        byte[] bArr = this.valueOf;
        getCvrMaskAnd = (i + 65) % 128;
        return bArr;
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.setOnContextClickListener setoncontextclicklistener = (com.payair.hce.setOnContextClickListener) objArr[0];
        int i = (getGpoResponse + 57) % 128;
        getCvrMaskAnd = i;
        byte[] bArr = setoncontextclicklistener.values;
        int i2 = i + 113;
        getGpoResponse = i2 % 128;
        if (i2 % 2 != 0) {
            return bArr;
        }
        throw new java.lang.ArithmeticException();
    }

    public final byte[] AlternateContactlessPaymentDataJson() {
        int i = getCvrMaskAnd + 69;
        getGpoResponse = i % 128;
        if (i % 2 != 0) {
            return this.DigitizedCardProfile;
        }
        throw null;
    }

    public final byte writeReplace() {
        int i = (getCvrMaskAnd + 89) % 128;
        getGpoResponse = i;
        byte b = this.writeReplace;
        getCvrMaskAnd = (i + 45) % 128;
        return b;
    }

    private static void b(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] cArr;
        if (str != null) {
            $10 = ($11 + 115) % 128;
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.payair.hce.getProductType getproducttype = new com.payair.hce.getProductType();
        char[] cArr3 = new char[cArr2.length];
        byte b = 0;
        getproducttype.AlternateContactlessPaymentDataJson = 0;
        char[] cArr4 = new char[2];
        while (getproducttype.AlternateContactlessPaymentDataJson < cArr2.length) {
            cArr4[b] = cArr2[getproducttype.AlternateContactlessPaymentDataJson];
            cArr4[1] = cArr2[getproducttype.AlternateContactlessPaymentDataJson + 1];
            int i2 = 58224;
            int i3 = b;
            while (i3 < 16) {
                $10 = ($11 + 89) % 128;
                char c = cArr4[1];
                char c2 = cArr4[b];
                char c3 = (char) (RecordsJson ^ 2144259807102049818L);
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[4];
                    objArr2[3] = java.lang.Integer.valueOf(SdkCoreBusinessLogicModuleImpl);
                    objArr2[2] = java.lang.Integer.valueOf(c2 >>> 5);
                    objArr2[1] = java.lang.Integer.valueOf(((c2 << 4) + c3) ^ (c2 + i2));
                    objArr2[b] = java.lang.Integer.valueOf(c);
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.ImageFormat.getBitsPerPixel(b) + 63, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1336, (char) android.text.TextUtils.getOffsetAfter("", b));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        d(b, 3, b, objArr3);
                        java.lang.String str2 = (java.lang.String) objArr3[b];
                        java.lang.Class<?>[] clsArr = new java.lang.Class[4];
                        clsArr[b] = java.lang.Integer.TYPE;
                        clsArr[1] = java.lang.Integer.TYPE;
                        clsArr[2] = java.lang.Integer.TYPE;
                        clsArr[3] = java.lang.Integer.TYPE;
                        obj = cls.getMethod(str2, clsArr);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj);
                    }
                    char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    cArr4[1] = charValue;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr4[b]), java.lang.Integer.valueOf(((charValue << 4) + ((char) (IccPrivateKeyCrtComponentsJson ^ 2144259807102049818L))) ^ r14), java.lang.Integer.valueOf(charValue >>> 5), java.lang.Integer.valueOf(getAid)};
                    int i4 = charValue + i2;
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(62 - android.view.View.MeasureSpec.getMode(0), 1335 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), (char) android.text.TextUtils.indexOf("", "", 0));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        d((short) 0, 3, (byte) 0, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj2);
                    }
                    cArr4[0] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                    i2 -= 40503;
                    i3++;
                    b = 0;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3[getproducttype.AlternateContactlessPaymentDataJson] = cArr4[0];
            cArr3[getproducttype.AlternateContactlessPaymentDataJson + 1] = cArr4[1];
            java.lang.Object[] objArr6 = {getproducttype, getproducttype};
            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1765331150);
            if (obj3 == null) {
                obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 54, (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 3542, (char) ((-1) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))))).getMethod("r", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1765331150, obj3);
            }
            ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
            b = 0;
        }
        objArr[0] = new java.lang.String(cArr3, 0, i);
    }

    private static void c(int[] iArr, java.lang.String str, boolean z, java.lang.Object[] objArr) {
        int i;
        java.lang.String str2 = str;
        byte[] bArr = str2;
        if (str2 != null) {
            int i2 = $10 + 111;
            $11 = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            bArr = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        com.payair.hce.getAccountType getaccounttype = new com.payair.hce.getAccountType();
        int i3 = 0;
        int i4 = iArr[0];
        int i5 = 1;
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        char[] cArr = getCiacDecline;
        if (cArr != null) {
            $10 = ($11 + 41) % 128;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i9 = 0;
            while (i9 < length) {
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[i5];
                    objArr2[i3] = java.lang.Integer.valueOf(cArr[i9]);
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(275265691);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.getSize(i3) + 29, (android.view.KeyEvent.getMaxKeyCode() >> 16) + 2807, (char) (android.view.KeyEvent.getMaxKeyCode() >> 16));
                        java.lang.Object[] objArr3 = new java.lang.Object[i5];
                        d((short) 0, 2, (byte) 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(275265691, obj);
                    }
                    cArr2[i9] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    i9++;
                    i3 = 0;
                    i5 = 1;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i6];
        java.lang.System.arraycopy(cArr, i4, cArr3, 0, i6);
        if (bArr2 != null) {
            $11 = ($10 + 41) % 128;
            char[] cArr4 = new char[i6];
            getaccounttype.writeReplace = 0;
            char c = 0;
            while (getaccounttype.writeReplace < i6) {
                if (bArr2[getaccounttype.writeReplace] == 1) {
                    int i10 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr3[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1969056788);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 2836, (char) (android.view.KeyEvent.getMaxKeyCode() >> 16));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        d((short) 0, 0, (byte) 0, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1969056788, obj2);
                    }
                    cArr4[i10] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                } else {
                    int i11 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(cArr3[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-2110984860);
                    if (obj3 == null) {
                        java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(42 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (-16774336) - android.graphics.Color.rgb(0, 0, 0), (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1));
                        byte length2 = (byte) $$d.length;
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        d((short) 0, length2, (byte) (length2 - 4), objArr7);
                        obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-2110984860, obj3);
                    }
                    cArr4[i11] = ((java.lang.Character) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).charValue();
                }
                c = cArr4[getaccounttype.writeReplace];
                java.lang.Object[] objArr8 = {getaccounttype, getaccounttype};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1714689752);
                if (obj4 == null) {
                    obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionType(0L) + 34, 212 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) android.graphics.Color.blue(0))).getMethod("l", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1714689752, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr8);
            }
            cArr3 = cArr4;
        }
        if (i8 > 0) {
            char[] cArr5 = new char[i6];
            i = 0;
            java.lang.System.arraycopy(cArr3, 0, cArr5, 0, i6);
            int i12 = i6 - i8;
            java.lang.System.arraycopy(cArr5, 0, cArr3, i12, i8);
            java.lang.System.arraycopy(cArr5, i8, cArr3, 0, i12);
            $10 = ($11 + 105) % 128;
        } else {
            i = 0;
        }
        if (z) {
            char[] cArr6 = new char[i6];
            while (true) {
                getaccounttype.writeReplace = i;
                if (getaccounttype.writeReplace >= i6) {
                    break;
                }
                cArr6[getaccounttype.writeReplace] = cArr3[(i6 - getaccounttype.writeReplace) - 1];
                i = getaccounttype.writeReplace + 1;
            }
            cArr3 = cArr6;
        }
        if (i7 > 0) {
            int i13 = 0;
            while (true) {
                getaccounttype.writeReplace = i13;
                if (getaccounttype.writeReplace >= i6) {
                    break;
                }
                int i14 = $10 + 107;
                $11 = i14 % 128;
                if (i14 % 2 == 0) {
                    cArr3[getaccounttype.writeReplace] = (char) (cArr3[getaccounttype.writeReplace] % iArr[2]);
                } else {
                    cArr3[getaccounttype.writeReplace] = (char) (cArr3[getaccounttype.writeReplace] - iArr[2]);
                }
                i13 = getaccounttype.writeReplace + 1;
            }
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        getCvrMaskAnd = 0;
        getGpoResponse = 1;
        IccPrivateKeyCrtComponentsJson = (char) 55438;
        getAid = (char) 13925;
        RecordsJson = (char) 40178;
        SdkCoreBusinessLogicModuleImpl = (char) 39069;
        getCiacDecline = new char[]{16781, 16821, 16706, 16740, 16766, 16762, 16737, 16739, 16725, 16717, 16708, 16719, 16717, 16726, 16707, 16714, 16727, 16764, 16737, 16745, 16726, 16824, 16712, 16740, 16766, 16762, 16737, 16739, 16725, 16717, 16711, 16892, 16802, 16812, 16790, 16812, 16809, 16808, 16810, 16808, 16791, 16793, 16809, 16809, 16810, 16808, 16805, 16802, 16893, 16808, 16802, 16812, 16790, 16812, 16809, 16808, 16810, 16808, 16793, 16789, 16804, 16804, 16827, 16679, 16683, 16657, 16652, 16655, 16684, 16681, 16676, 16683, 16684, 16676, 16644, 16646, 16681, 16648, 16758, 16671, 16661, 16686, 16657, 16659, 16657, 16670, 16666, 16685, 16685, 16687, 16686, 16684, 16887, 16802, 16805, 16829, 16826, 16804, 16809, 16804, 16806, 16800, 16715, 16580, 16576, 16579, 16606, 16599, 16600, 16591, 16586, 16604, 16578, 16857, 16769, 16800, 16771, 16782, 16784, 16806, 16804, 16809, 16804, 16826, 16829, 16805, 16813, 16809, 16807, 16805, 16830, 16802, 16808, 16775, 16774, 16807, 16800, 16831, 16802, 16807, 16831, 16887, 16704, 16745, 16723, 16714, 16708, 16749, 16724, 16720, 16745, 16748, 16781, 16715, 16710, 16710, 16708, 16710, 16711, 16709, 16829, 16829, 16708, 16732, 16707, 16712, 16712, 16715, 16719, 16711, 16709, 16772, 16722, 16724, 16732, 16728, 16729, 16729, 16720, 16749, 16725, 16714, 16800, 16810, 16812, 16824, 16829, 16719, 16749, 16725, 16730, 16822, 16717, 16744, 16720, 16723, 16749, 16722, 16730, 16722, 16718, 16825, 16725, 16725, 16731, 16715, 16587, 16585, 16581, 16587, 16585, 16580, 16578, 16590, 16657, 16641, 16671, 16683, 16587, 16580, 16589, 16584, 16587, 16580, 16589, 16588, 16581, 16587};
    }

    static void init$1() {
        $$d = new byte[]{com.google.common.base.Ascii.CAN, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, -20, -99};
        $$e = 68;
    }

    public static java.lang.Object[] values(android.content.Context context, int i, int i2) {
        int i3;
        int i4 = 0;
        int i5 = 1;
        try {
            if (context == null) {
                java.lang.Object[] objArr = {new int[]{i}, new int[]{i}, null, new int[1]};
                int i6 = ~i;
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf((((i | 219064964) * 140) - 1851905688) + (((~(219064964 | i6)) | 584144208) * (-280)) + (((~(i | (-584144209))) | (~(i6 | 785864020)) | 17345152) * 140))};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 51, 2713 - android.view.View.combineMeasuredStates(0, 0), (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16));
                    byte b = (byte) ($$a[14] - 1);
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    a(b, b, b, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj);
                }
                ((int[]) objArr[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                return objArr;
            }
            try {
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                b("⹐Ỳ䨠㩥\ude10쭵诧\u200b첃\ud9d5啴\u2ffc啵挸榛ᵰ˫ꨆザ윸귊탗蒷橑놅榝ꅮ\udc0d᪩窶啴\u2ffc垻\ue6bdᓆｪ\udf3aﶘ", android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - '\n', objArr4);
                java.lang.Object[] objArr5 = (java.lang.Object[]) java.lang.reflect.Array.newInstance(java.lang.Class.forName(((java.lang.String) objArr4[0]).intern()), 2);
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                b("\uf325忈렦º⦹檁枂\uf63b蟝\ue3be읝\u086d⯞㓒ᣢዿ詬訥렦º⦹檁枂\uf63b蟝\ue3be⬗駖䄠线馜Ყ", android.graphics.Color.blue(0) + 31, objArr6);
                try {
                    java.lang.Object[] objArr7 = {((java.lang.String) objArr6[0]).intern()};
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    b("⹐Ỳ䨠㩥\ude10쭵诧\u200b첃\ud9d5啴\u2ffc啵挸榛ᵰ˫ꨆザ윸귊탗蒷橑놅榝ꅮ\udc0d᪩窶啴\u2ffc垻\ue6bdᓆｪ\udf3aﶘ", (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 38, objArr8);
                    objArr5[0] = java.lang.Class.forName(((java.lang.String) objArr8[0]).intern()).getDeclaredConstructor(java.lang.String.class).newInstance(objArr7);
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    c(new int[]{0, 31, 68, 16}, "\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001", true, objArr9);
                    try {
                        java.lang.Object[] objArr10 = {((java.lang.String) objArr9[0]).intern()};
                        java.lang.Object[] objArr11 = new java.lang.Object[1];
                        b("⹐Ỳ䨠㩥\ude10쭵诧\u200b첃\ud9d5啴\u2ffc啵挸榛ᵰ˫ꨆザ윸귊탗蒷橑놅榝ꅮ\udc0d᪩窶啴\u2ffc垻\ue6bdᓆｪ\udf3aﶘ", 37 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr11);
                        objArr5[1] = java.lang.Class.forName(((java.lang.String) objArr11[0]).intern()).getDeclaredConstructor(java.lang.String.class).newInstance(objArr10);
                        try {
                            java.lang.Object[] objArr12 = new java.lang.Object[1];
                            b("㟓\uefdbᱦ⃫\ue0eaؚ巙榃鳋雺띘Ṉ\uf128䕆虣縱Ⓛᄠ띘Ṉ\ude82桊翶픁", 23 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), objArr12);
                            java.lang.Class<?> cls2 = java.lang.Class.forName(((java.lang.String) objArr12[0]).intern());
                            java.lang.Object[] objArr13 = new java.lang.Object[1];
                            c(new int[]{31, 17, 0, 16}, "\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001", false, objArr13);
                            java.lang.Object invoke = cls2.getMethod(((java.lang.String) objArr13[0]).intern(), null).invoke(context, null);
                            try {
                                java.lang.Object[] objArr14 = new java.lang.Object[1];
                                b("㟓\uefdbᱦ⃫\ue0eaؚ巙榃鳋雺띘Ṉ\uf128䕆虣縱Ⓛᄠ띘Ṉ\ude82桊翶픁", 23 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), objArr14);
                                java.lang.Class<?> cls3 = java.lang.Class.forName(((java.lang.String) objArr14[0]).intern());
                                java.lang.Object[] objArr15 = new java.lang.Object[1];
                                b("團\ue3c5둃荢秪\udecf⅑쳜團\ue3c5⨄ļ俳荻", android.widget.ExpandableListView.getPackedPositionGroup(0L) + 14, objArr15);
                                try {
                                    java.lang.Object[] objArr16 = {cls3.getMethod(((java.lang.String) objArr15[0]).intern(), null).invoke(context, null), 64};
                                    java.lang.Object[] objArr17 = new java.lang.Object[1];
                                    b("㟓\uefdbᱦ⃫\ue0eaؚ巙榃鳋雺띘Ṉ\uf128䕆虣縱弅橗罧癁秪\udecf⅑쳜團\ue3c5\uf749⬺眽樝團\ue3c5僾⃝", 33 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr17);
                                    java.lang.Class<?> cls4 = java.lang.Class.forName(((java.lang.String) objArr17[0]).intern());
                                    java.lang.Object[] objArr18 = new java.lang.Object[1];
                                    c(new int[]{48, 14, 0, 0}, "\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001", false, objArr18);
                                    java.lang.Object invoke2 = cls4.getMethod(((java.lang.String) objArr18[0]).intern(), java.lang.String.class, java.lang.Integer.TYPE).invoke(invoke, objArr16);
                                    java.lang.Object[] objArr19 = new java.lang.Object[1];
                                    c(new int[]{62, 30, 121, 27}, "\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000", false, objArr19);
                                    java.lang.Class<?> cls5 = java.lang.Class.forName(((java.lang.String) objArr19[0]).intern());
                                    java.lang.Object[] objArr20 = new java.lang.Object[1];
                                    c(new int[]{92, 10, 0, 10}, "\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000", true, objArr20);
                                    java.lang.Object[] objArr21 = (java.lang.Object[]) cls5.getField(((java.lang.String) objArr20[0]).intern()).get(invoke2);
                                    int length = objArr21.length;
                                    int i7 = 0;
                                    while (i7 < length) {
                                        java.lang.Object obj2 = objArr21[i7];
                                        java.lang.Object[] objArr22 = new java.lang.Object[i5];
                                        b("惉棾ꅮ\udc0d鶻\uf155", android.os.Process.getGidForName("") + 6, objArr22);
                                        try {
                                            java.lang.Object[] objArr23 = {((java.lang.String) objArr22[i4]).intern()};
                                            java.lang.Object[] objArr24 = new java.lang.Object[i5];
                                            b("⹐Ỳ䨠㩥\uf28e뫎叄\ue04e㜳씦ꃙ씩짳跌ଃ㧲钋⾌ᑣ穛⧭\uf6c9垘馣ꑞ̪戠볭\ueb8b鋙妏픆ﴻ䩻줄譆\udda6挒", 37 - android.widget.ExpandableListView.getPackedPositionType(0L), objArr24);
                                            java.lang.Class<?> cls6 = java.lang.Class.forName(((java.lang.String) objArr24[i4]).intern());
                                            java.lang.Object[] objArr25 = new java.lang.Object[1];
                                            c(new int[]{102, 11, 166, i4}, "\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000", true, objArr25);
                                            java.lang.Object invoke3 = cls6.getMethod(((java.lang.String) objArr25[0]).intern(), java.lang.String.class).invoke(null, objArr23);
                                            try {
                                                java.lang.Object[] objArr26 = new java.lang.Object[1];
                                                c(new int[]{113, 28, 0, 13}, "\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000", false, objArr26);
                                                java.lang.Class<?> cls7 = java.lang.Class.forName(((java.lang.String) objArr26[0]).intern());
                                                java.lang.Object[] objArr27 = objArr21;
                                                java.lang.Object[] objArr28 = new java.lang.Object[1];
                                                c(new int[]{141, 11, 49, 9}, "\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001", false, objArr28);
                                                try {
                                                    java.lang.Object[] objArr29 = {new java.io.ByteArrayInputStream((byte[]) cls7.getMethod(((java.lang.String) objArr28[0]).intern(), null).invoke(obj2, null))};
                                                    java.lang.Object[] objArr30 = new java.lang.Object[1];
                                                    b("⹐Ỳ䨠㩥\uf28e뫎叄\ue04e㜳씦ꃙ씩짳跌ଃ㧲钋⾌ᑣ穛⧭\uf6c9垘馣ꑞ̪戠볭\ueb8b鋙妏픆ﴻ䩻줄譆\udda6挒", android.text.TextUtils.getOffsetBefore("", 0) + 37, objArr30);
                                                    java.lang.Class<?> cls8 = java.lang.Class.forName(((java.lang.String) objArr30[0]).intern());
                                                    java.lang.Object[] objArr31 = new java.lang.Object[1];
                                                    c(new int[]{152, 19, 31, 0}, "\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001", false, objArr31);
                                                    java.lang.Object invoke4 = cls8.getMethod(((java.lang.String) objArr31[0]).intern(), java.io.InputStream.class).invoke(invoke3, objArr29);
                                                    int length2 = objArr5.length;
                                                    int i8 = 0;
                                                    for (int i9 = 2; i8 < i9; i9 = 2) {
                                                        java.lang.Object obj3 = objArr5[i8];
                                                        try {
                                                            java.lang.Object[] objArr32 = new java.lang.Object[1];
                                                            c(new int[]{171, 34, 48, 0}, "\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001", true, objArr32);
                                                            java.lang.Class<?> cls9 = java.lang.Class.forName(((java.lang.String) objArr32[0]).intern());
                                                            java.lang.Object[] objArr33 = new java.lang.Object[1];
                                                            c(new int[]{205, 23, 159, 0}, "\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000", true, objArr33);
                                                            if (obj3.equals(cls9.getMethod(((java.lang.String) objArr33[0]).intern(), null).invoke(invoke4, null))) {
                                                                java.lang.Object[] objArr34 = {new int[]{i}, new int[]{i ^ 1}, null, new int[1]};
                                                                try {
                                                                    java.lang.Object[] objArr35 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf((((~((-688352781) | i)) | 1004142528) * 398) + 414889008 + (((~((-688352781) | (~i))) | 1004142528) * 398))};
                                                                    java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                    if (obj4 == null) {
                                                                        java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), 2713 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (android.view.ViewConfiguration.getTouchSlop() >> 8));
                                                                        byte b2 = (byte) ($$a[14] - 1);
                                                                        java.lang.Object[] objArr36 = new java.lang.Object[1];
                                                                        a(b2, b2, b2, objArr36);
                                                                        obj4 = cls10.getMethod((java.lang.String) objArr36[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj4);
                                                                    }
                                                                    ((int[]) objArr34[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr35)).intValue();
                                                                    return objArr34;
                                                                } catch (java.lang.Throwable th) {
                                                                    java.lang.Throwable cause = th.getCause();
                                                                    if (cause != null) {
                                                                        throw cause;
                                                                    }
                                                                    throw th;
                                                                }
                                                            }
                                                            i8++;
                                                        } catch (java.lang.Throwable th2) {
                                                            java.lang.Throwable cause2 = th2.getCause();
                                                            if (cause2 != null) {
                                                                throw cause2;
                                                            }
                                                            throw th2;
                                                        }
                                                    }
                                                    i7++;
                                                    objArr21 = objArr27;
                                                    i4 = 0;
                                                    i5 = 1;
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
                                        } catch (java.lang.Throwable th5) {
                                            java.lang.Throwable cause5 = th5.getCause();
                                            if (cause5 != null) {
                                                throw cause5;
                                            }
                                            throw th5;
                                        }
                                    }
                                    i3 = i5;
                                } catch (java.lang.Throwable th6) {
                                    java.lang.Throwable cause6 = th6.getCause();
                                    if (cause6 != null) {
                                        throw cause6;
                                    }
                                    throw th6;
                                }
                            } catch (java.lang.Throwable th7) {
                                java.lang.Throwable cause7 = th7.getCause();
                                if (cause7 != null) {
                                    throw cause7;
                                }
                                throw th7;
                            }
                        } catch (java.lang.Throwable th8) {
                            java.lang.Throwable cause8 = th8.getCause();
                            if (cause8 != null) {
                                throw cause8;
                            }
                            throw th8;
                        }
                    } catch (java.lang.Throwable th9) {
                        java.lang.Throwable cause9 = th9.getCause();
                        if (cause9 != null) {
                            throw cause9;
                        }
                        throw th9;
                    }
                } catch (java.lang.Throwable th10) {
                    java.lang.Throwable cause10 = th10.getCause();
                    if (cause10 != null) {
                        throw cause10;
                    }
                    throw th10;
                }
            } catch (java.lang.Throwable unused) {
                i3 = 1;
            }
            int[] iArr = new int[i3];
            int[] iArr2 = new int[i3];
            iArr[0] = i;
            iArr2[0] = i;
            java.lang.Object[] objArr37 = {iArr, iArr2, null, new int[i3]};
            java.lang.Object[] objArr38 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf(((((~((-1179659) | (~i))) | (~(1003749326 | i))) * (-272)) - 22298728) + (((~((-168979467) | i)) | 167799808) * (-272)) + (((~(i | 168979466)) | 835949518) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE))};
            java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
            if (obj5 == null) {
                java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.os.Process.myPid() >> 22), 2713 - android.view.View.getDefaultSize(0, 0), (char) (1 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))));
                byte b3 = (byte) ($$a[14] - 1);
                java.lang.Object[] objArr39 = new java.lang.Object[1];
                a(b3, b3, b3, objArr39);
                obj5 = cls11.getMethod((java.lang.String) objArr39[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj5);
            }
            ((int[]) objArr37[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(null, objArr38)).intValue();
            return objArr37;
        } catch (java.lang.Throwable th11) {
            java.lang.Throwable cause11 = th11.getCause();
            if (cause11 != null) {
                throw cause11;
            }
            throw th11;
        }
    }

    static void init$0() {
        $$a = new byte[]{com.google.common.base.Ascii.SI, -31, 80, -73, 45, 10, -13, com.google.common.base.Ascii.SI, -2, -11, com.google.common.base.Ascii.NAK, -13, -32, 46, 1, 8, -17, 4, 19, -6, -5, 16, 2, -33, 19, com.google.common.base.Ascii.SUB, -10, -6, com.google.common.base.Ascii.VT, 8, -46, com.google.common.base.Ascii.US, com.google.common.base.Ascii.NAK, -17, -21, 43, -2, 1};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE;
    }

    public final byte[] valueOf() {
        return (byte[]) valueOf(new java.lang.Object[]{this}, -746463331, 746463331, java.lang.System.identityHashCode(this));
    }
}
