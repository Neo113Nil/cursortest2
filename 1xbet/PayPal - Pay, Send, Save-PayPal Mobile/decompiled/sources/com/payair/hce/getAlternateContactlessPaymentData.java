package com.payair.hce;

/* loaded from: classes4.dex */
public abstract class getAlternateContactlessPaymentData {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static long AlternateContactlessPaymentDataJson;
    private static long DigitizedCardProfile;
    private static int RecordsJson;
    private static int getProfileVersion;
    private static int valueOf;
    private static char values;
    public static com.payair.hce.getAlternateContactlessPaymentData writeReplace;

    private static void a(int i, int i2, int i3, java.lang.Object[] objArr) {
        int i4 = (i * 34) + 5;
        int i5 = i3 + 65;
        byte[] bArr = $$a;
        int i6 = i2 * 2;
        char[] cArr = new char[i6 + 1];
        int i7 = -1;
        if (bArr == null) {
            i7 = -1;
            i5 = (i5 + (-i4)) - 2;
            i4++;
        }
        while (true) {
            int i8 = i7 + 1;
            cArr[i8] = (char) i5;
            if (i8 == i6) {
                objArr[0] = new java.lang.String(cArr);
                return;
            }
            int i9 = i5;
            i7 = i8;
            i5 = (i9 + (-bArr[i4])) - 2;
            i4++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(byte b, int i, byte b2, java.lang.Object[] objArr) {
        int i2;
        int i3 = b * 4;
        int i4 = (b2 * 3) + 4;
        int i5 = i + 102;
        byte[] bArr = $$d;
        byte[] bArr2 = new byte[1 - i3];
        int i6 = 0 - i3;
        if (bArr == null) {
            int i7 = i6;
            i2 = 0;
            i5 += -i7;
            i4++;
            bArr2[i2] = (byte) i5;
            if (i2 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i2++;
            i7 = bArr[i4];
            i5 += -i7;
            i4++;
            bArr2[i2] = (byte) i5;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i5;
            if (i2 == i6) {
            }
        }
    }

    public abstract void values(com.payair.hce.getAckAutomaticallyResetByApplication getackautomaticallyresetbyapplication) throws java.io.IOException;

    private static void c(java.lang.String str, int i, java.lang.Object[] objArr) {
        $11 = ($10 + 61) % 128;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getDsrpData getdsrpdata = new com.payair.hce.getDsrpData();
        getdsrpdata.values = i;
        int length = charArray.length;
        long[] jArr = new long[length];
        getdsrpdata.valueOf = 0;
        $11 = ($10 + 111) % 128;
        while (getdsrpdata.valueOf < charArray.length) {
            int i2 = getdsrpdata.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(charArray[getdsrpdata.valueOf]), getdsrpdata, getdsrpdata};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2053068265);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 30, (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1889, (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 3599));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    d((byte) 0, (byte) (-$$d[2]), (byte) 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2053068265, obj);
                }
                jArr[i2] = ((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue() ^ (AlternateContactlessPaymentDataJson ^ (-4761752123935132024L));
                java.lang.Object[] objArr4 = {getdsrpdata, getdsrpdata};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
                if (obj2 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(63 - android.graphics.ImageFormat.getBitsPerPixel(0), (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 1443, (char) (29682 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16)));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    d((byte) 0, 10, (byte) 0, objArr5);
                    obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj2);
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
        char[] cArr = new char[length];
        getdsrpdata.valueOf = 0;
        $10 = ($11 + 47) % 128;
        while (getdsrpdata.valueOf < charArray.length) {
            $10 = ($11 + 13) % 128;
            cArr[getdsrpdata.valueOf] = (char) jArr[getdsrpdata.valueOf];
            java.lang.Object[] objArr6 = {getdsrpdata, getdsrpdata};
            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
            if (obj3 == null) {
                java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.getSize(0) + 64, android.text.TextUtils.indexOf("", "") + 1443, (char) (29682 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16)));
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                d((byte) 0, 10, (byte) 0, objArr7);
                obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj3);
            }
            ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
        }
        objArr[0] = new java.lang.String(cArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void b(java.lang.String str, char c, java.lang.String str2, java.lang.String str3, int i, java.lang.Object[] objArr) {
        char[] cArr;
        char c2;
        int i2 = $11 + 97;
        $10 = i2 % 128;
        java.lang.Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        char[] charArray = str3 != null ? str3.toCharArray() : str3;
        if (str2 != 0) {
            int i3 = $10 + 27;
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
        int length = charArray2.length;
        char[] cArr3 = new char[length];
        int length2 = charArray.length;
        char[] cArr4 = new char[length2];
        byte b = 0;
        java.lang.System.arraycopy(charArray2, 0, cArr3, 0, length);
        java.lang.System.arraycopy(charArray, 0, cArr4, 0, length2);
        cArr3[0] = (char) (cArr3[0] ^ c);
        cArr4[2] = (char) (cArr4[2] + ((char) i));
        int length3 = cArr2.length;
        char[] cArr5 = new char[length3];
        getwalletdata.writeReplace = 0;
        while (getwalletdata.writeReplace < length3) {
            $11 = ($10 + 23) % 128;
            try {
                java.lang.Object[] objArr2 = {getwalletdata};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-800817016);
                if (obj2 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(71 - (android.util.TypedValue.complexToFloat(b) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(b) == 0.0f ? 0 : -1)), android.text.TextUtils.getOffsetAfter("", b) + 1179, (char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    d(b, b, b, objArr3);
                    java.lang.String str4 = (java.lang.String) objArr3[b];
                    java.lang.Class<?>[] clsArr = new java.lang.Class[1];
                    clsArr[b] = java.lang.Object.class;
                    obj2 = cls.getMethod(str4, clsArr);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-800817016, obj2);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(obj, objArr2)).intValue();
                java.lang.Object[] objArr4 = {getwalletdata};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(811305766);
                if (obj3 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(30 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 3443, (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, b) + 3832));
                    java.lang.Class<?>[] clsArr2 = new java.lang.Class[1];
                    clsArr2[b] = java.lang.Object.class;
                    obj3 = cls2.getMethod("g", clsArr2);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(811305766, obj3);
                }
                int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).intValue();
                char c3 = cArr3[getwalletdata.writeReplace % 4];
                java.lang.Object[] objArr5 = new java.lang.Object[3];
                objArr5[2] = java.lang.Integer.valueOf(cArr4[intValue]);
                objArr5[1] = java.lang.Integer.valueOf(c3 * 32718);
                objArr5[b] = getwalletdata;
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2107355451);
                if (obj4 == null) {
                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(26 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), 1864 - android.view.KeyEvent.normalizeMetaState(b), (char) (41775 - android.widget.ExpandableListView.getPackedPositionType(0L)));
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    d(b, 3, b, objArr6);
                    java.lang.String str5 = (java.lang.String) objArr6[b];
                    java.lang.Class<?>[] clsArr3 = new java.lang.Class[3];
                    clsArr3[b] = java.lang.Object.class;
                    clsArr3[1] = java.lang.Integer.TYPE;
                    clsArr3[2] = java.lang.Integer.TYPE;
                    obj4 = cls3.getMethod(str5, clsArr3);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2107355451, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr5);
                char c4 = cArr3[intValue2];
                java.lang.Object[] objArr7 = new java.lang.Object[2];
                objArr7[1] = java.lang.Integer.valueOf(cArr4[intValue]);
                objArr7[b] = java.lang.Integer.valueOf(c4 * 32718);
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(140076502);
                if (obj5 == null) {
                    java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 28, 3133 - (android.view.ViewConfiguration.getTapTimeout() >> 16), (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, b)));
                    byte length4 = (byte) $$d.length;
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    d(b, length4, (byte) (length4 - 4), objArr8);
                    java.lang.String str6 = (java.lang.String) objArr8[b];
                    c2 = 2;
                    java.lang.Class<?>[] clsArr4 = new java.lang.Class[2];
                    clsArr4[b] = java.lang.Integer.TYPE;
                    clsArr4[1] = java.lang.Integer.TYPE;
                    obj5 = cls4.getMethod(str6, clsArr4);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(140076502, obj5);
                } else {
                    c2 = 2;
                }
                cArr4[intValue2] = ((java.lang.Character) ((java.lang.reflect.Method) obj5).invoke(null, objArr7)).charValue();
                cArr3[intValue2] = getwalletdata.values;
                cArr5[getwalletdata.writeReplace] = (char) ((((int) (valueOf ^ 1263759066225628708L)) ^ ((cArr3[intValue2] ^ cArr2[getwalletdata.writeReplace]) ^ (DigitizedCardProfile ^ 1263759066225628708L))) ^ ((char) (values ^ 1263759066225628708L)));
                getwalletdata.writeReplace++;
                obj = null;
                b = 0;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new java.lang.String(cArr5);
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        getProfileVersion = 0;
        RecordsJson = 1;
        DigitizedCardProfile = 8098727600312155167L;
        valueOf = -804334044;
        values = (char) 54820;
        AlternateContactlessPaymentDataJson = 2396278143739013164L;
    }

    static void init$1() {
        $$d = new byte[]{32, 19, -11, 104};
        $$e = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PINWHEEL_LOGO_VALUE;
    }

    static void init$0() {
        $$a = new byte[]{0, Byte.MIN_VALUE, -48, 115, 10, -45, -10, 13, -15, 2, com.google.common.base.Ascii.VT, -21, 13, 32, -46, -1, -8, 17, -4, -19, 6, 5, com.visa.cbp.getEncExpo.onUnminimized, -2, 33, -19, -26, 10, 6, -11, -8, 46, -31, -21, 17, com.google.common.base.Ascii.NAK, -43, 2, -1, -15, 10};
        $$b = 175;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type update terminated with stack overflow, arg: (r10v432 ?? I:int), method size: 17854
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public static java.lang.Object[] writeReplace$4956fc2a(int r64, java.lang.Object r65) {
        /*
            Method dump skipped, instructions count: 17854
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.payair.hce.getAlternateContactlessPaymentData.writeReplace$4956fc2a(int, java.lang.Object):java.lang.Object[]");
    }
}
