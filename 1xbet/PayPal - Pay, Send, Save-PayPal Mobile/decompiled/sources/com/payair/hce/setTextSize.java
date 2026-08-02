package com.payair.hce;

/* loaded from: classes4.dex */
public final class setTextSize extends com.payair.hce.setLineBreakStyle {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AlternateContactlessPaymentDataJson;
    private static long DigitizedCardProfile;
    private static int valueOf;
    private static char values;
    private static int writeReplace;

    private static void b(short s, short s2, short s3, java.lang.Object[] objArr) {
        int i = s3 + 4;
        int i2 = s2 + 102;
        byte[] bArr = $$a;
        int i3 = s * 2;
        byte[] bArr2 = new byte[i3 + 1];
        int i4 = -1;
        if (bArr == null) {
            i2 = i3 + i;
            i = i;
            i4 = -1;
        }
        while (true) {
            int i5 = i4 + 1;
            bArr2[i5] = (byte) i2;
            int i6 = i + 1;
            if (i5 == i3) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            } else {
                i2 += bArr[i6];
                i = i6;
                i4 = i5;
            }
        }
    }

    @Override // com.payair.hce.setLineBreakStyle
    protected final java.lang.Class valueOf(java.lang.Object obj) {
        AlternateContactlessPaymentDataJson = (valueOf + 39) % 128;
        java.lang.Class<?> values2 = values(obj);
        int i = valueOf + 23;
        AlternateContactlessPaymentDataJson = i % 128;
        if (i % 2 != 0) {
            return values2;
        }
        throw null;
    }

    private static java.lang.Class<?> values(java.lang.Object obj) {
        valueOf = (AlternateContactlessPaymentDataJson + 69) % 128;
        try {
            java.lang.Class<?> cls = obj.getClass();
            int scrollBarFadeDuration = android.view.ViewConfiguration.getScrollBarFadeDuration();
            java.lang.Object[] objArr = new java.lang.Object[1];
            a("\u0000\u0000\u0000\u0000", "㞩姇鼻諰〉굲쓲塯땊͠\ufae6癈\u2d9f䊓昅焝潎ۧŎ醻朿较坄ꊳ蛱뇟梞", "䑗홧휢⊬", 584476484 + (scrollBarFadeDuration >> 16), (char) (44247 - android.graphics.Color.red(0)), objArr);
            java.lang.Object invoke = cls.getMethod(((java.lang.String) objArr[0]).intern(), new java.lang.Class[0]).invoke(obj, new java.lang.Object[0]);
            java.lang.Class<?> cls2 = invoke.getClass();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            a("\u0000\u0000\u0000\u0000", "澒άű昅禁锝Ӗ뗸\uefcf쓦뭫\uffbf䇱\udf54纩\uf657㾇쉝", "鶡꾰緕ꚯ", android.view.KeyEvent.normalizeMetaState(0), (char) (44925 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16)), objArr2);
            return (java.lang.Class) cls2.getMethod(((java.lang.String) objArr2[0]).intern(), new java.lang.Class[0]).invoke(invoke, new java.lang.Object[0]);
        } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused) {
            java.lang.Class<?> cls3 = obj.getClass();
            AlternateContactlessPaymentDataJson = (valueOf + 11) % 128;
            return cls3;
        }
    }

    private static void a(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, char c, java.lang.Object[] objArr) {
        char[] cArr;
        int i2 = $10 + 87;
        $11 = i2 % 128;
        java.lang.Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        char[] charArray = str3 != null ? str3.toCharArray() : str3;
        if (str2 != null) {
            int i3 = $10 + 103;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            cArr = str2.toCharArray();
        } else {
            cArr = str2;
        }
        char[] cArr2 = cArr;
        char[] charArray2 = str != null ? str.toCharArray() : str;
        com.payair.hce.getWalletData getwalletdata = new com.payair.hce.getWalletData();
        int length = charArray.length;
        char[] cArr3 = new char[length];
        int length2 = charArray2.length;
        char[] cArr4 = new char[length2];
        java.lang.System.arraycopy(charArray, 0, cArr3, 0, length);
        java.lang.System.arraycopy(charArray2, 0, cArr4, 0, length2);
        cArr3[0] = (char) (cArr3[0] ^ c);
        cArr4[2] = (char) (cArr4[2] + ((char) i));
        int length3 = cArr2.length;
        char[] cArr5 = new char[length3];
        getwalletdata.writeReplace = 0;
        while (getwalletdata.writeReplace < length3) {
            $11 = ($10 + 59) % 128;
            try {
                java.lang.Object[] objArr2 = {getwalletdata};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-800817016);
                if (obj2 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.MotionEvent.axisFromString("") + 72, android.view.MotionEvent.axisFromString("") + 1180, (char) (android.os.Process.getGidForName("") + 1));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b((short) 0, (short) 0, (short) -1, objArr3);
                    obj2 = cls.getMethod((java.lang.String) objArr3[0], java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-800817016, obj2);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(obj, objArr2)).intValue();
                java.lang.Object[] objArr4 = {getwalletdata};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(811305766);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 31, 3443 - android.graphics.Color.red(0), (char) (3831 - android.view.View.resolveSize(0, 0)))).getMethod("g", java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(811305766, obj3);
                }
                int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(obj, objArr4)).intValue();
                java.lang.Object[] objArr5 = {getwalletdata, java.lang.Integer.valueOf(cArr3[getwalletdata.writeReplace % 4] * 32718), java.lang.Integer.valueOf(cArr4[intValue])};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2107355451);
                if (obj4 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(26 - android.view.View.MeasureSpec.getMode(0), android.view.KeyEvent.normalizeMetaState(0) + 1864, (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 41774));
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    b((short) 0, (short) 3, (short) -1, objArr6);
                    obj4 = cls2.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2107355451, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr5);
                java.lang.Object[] objArr7 = {java.lang.Integer.valueOf(cArr3[intValue2] * 32718), java.lang.Integer.valueOf(cArr4[intValue])};
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(140076502);
                if (obj5 == null) {
                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 28, 3133 - android.view.KeyEvent.keyCodeFromString(""), (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                    byte length4 = (byte) $$a.length;
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    b((short) 0, length4, (byte) (length4 - 5), objArr8);
                    obj5 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(140076502, obj5);
                }
                cArr4[intValue2] = ((java.lang.Character) ((java.lang.reflect.Method) obj5).invoke(null, objArr7)).charValue();
                cArr3[intValue2] = getwalletdata.values;
                cArr5[getwalletdata.writeReplace] = (char) ((((cArr2[getwalletdata.writeReplace] ^ cArr3[intValue2]) ^ (DigitizedCardProfile ^ 1263759066225628708L)) ^ ((int) (writeReplace ^ 1263759066225628708L))) ^ ((char) (values ^ 1263759066225628708L)));
                getwalletdata.writeReplace++;
                obj = null;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        java.lang.String str4 = new java.lang.String(cArr5);
        int i4 = $10 + 21;
        $11 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        objArr[0] = str4;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        valueOf = 0;
        AlternateContactlessPaymentDataJson = 1;
        DigitizedCardProfile = 1263759066225628708L;
        writeReplace = -804334044;
        values = (char) 37821;
    }

    static void init$0() {
        $$a = new byte[]{org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, -107, com.google.common.base.Ascii.SUB, -98};
        $$b = 204;
    }
}
