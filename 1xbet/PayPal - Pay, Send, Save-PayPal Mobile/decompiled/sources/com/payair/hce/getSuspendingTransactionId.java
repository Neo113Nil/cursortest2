package com.payair.hce;

/* loaded from: classes4.dex */
public class getSuspendingTransactionId extends com.payair.hce.getOpenHelper {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static final int AlternateContactlessPaymentDataJson = 0;
    private static int DigitizedCardProfile;
    private static final byte[] valueOf = null;
    private static int values;
    private static int writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(short s, short s2, byte b, java.lang.Object[] objArr) {
        int i;
        int i2;
        int i3 = b + 4;
        byte[] bArr = $$a;
        int i4 = (s * 27) + 7;
        int i5 = (s2 * 19) + 99;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i6 = i3;
            i2 = 0;
            i5 += i3;
            i3 = i6;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i5;
            if (i2 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i7 = i3 + 1;
            i6 = i7;
            i3 = bArr[i7];
            i5 += i3;
            i3 = i6;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i5;
            if (i2 == i4) {
            }
        } else {
            i = 0;
            i2 = i + 1;
            bArr2[i] = (byte) i5;
            if (i2 == i4) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(int i, short s, short s2, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = 4 - (i * 2);
        int i5 = (s * 4) + 1;
        int i6 = (s2 * 3) + 115;
        byte[] bArr = $$d;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i7 = i5;
            i3 = 0;
            i4++;
            i6 += -i7;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i7 = bArr[i4];
            i4++;
            i6 += -i7;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i5) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i5) {
            }
        }
    }

    public getSuspendingTransactionId() {
    }

    public getSuspendingTransactionId(java.lang.String str) {
        super(str);
    }

    private static void b(boolean z, java.lang.String str, int i, int i2, int i3, java.lang.Object[] objArr) {
        char[] cArr;
        char[] cArr2;
        if (str != null) {
            $11 = ($10 + 81) % 128;
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr3 = cArr;
        com.payair.hce.DigitizedCardJson11 digitizedCardJson11 = new com.payair.hce.DigitizedCardJson11();
        char[] cArr4 = new char[i3];
        digitizedCardJson11.DigitizedCardProfile = 0;
        while (digitizedCardJson11.DigitizedCardProfile < i3) {
            $10 = ($11 + 105) % 128;
            digitizedCardJson11.values = cArr3[digitizedCardJson11.DigitizedCardProfile];
            cArr4[digitizedCardJson11.DigitizedCardProfile] = (char) (i + digitizedCardJson11.values);
            int i4 = digitizedCardJson11.DigitizedCardProfile;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr4[i4]), java.lang.Integer.valueOf(DigitizedCardProfile)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(414841307);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - android.graphics.Color.green(0), 2073 - android.text.TextUtils.indexOf("", ""), (char) (60037 - android.view.Gravity.getAbsoluteGravity(0, 0)));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    d(0, (short) 0, (short) 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(414841307, obj);
                }
                cArr4[i4] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 52, 3543 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj2);
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
        if (i2 > 0) {
            digitizedCardJson11.AlternateContactlessPaymentDataJson = i2;
            char[] cArr5 = new char[i3];
            java.lang.System.arraycopy(cArr4, 0, cArr5, 0, i3);
            java.lang.System.arraycopy(cArr5, 0, cArr4, i3 - digitizedCardJson11.AlternateContactlessPaymentDataJson, digitizedCardJson11.AlternateContactlessPaymentDataJson);
            java.lang.System.arraycopy(cArr5, digitizedCardJson11.AlternateContactlessPaymentDataJson, cArr4, 0, i3 - digitizedCardJson11.AlternateContactlessPaymentDataJson);
        }
        if (z) {
            int i5 = $10 + 107;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                cArr2 = new char[i3];
                digitizedCardJson11.DigitizedCardProfile = 1;
            } else {
                cArr2 = new char[i3];
                digitizedCardJson11.DigitizedCardProfile = 0;
            }
            while (digitizedCardJson11.DigitizedCardProfile < i3) {
                cArr2[digitizedCardJson11.DigitizedCardProfile] = cArr4[(i3 - digitizedCardJson11.DigitizedCardProfile) - 1];
                java.lang.Object[] objArr5 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson('e' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 3543 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
            }
            cArr4 = cArr2;
        }
        objArr[0] = new java.lang.String(cArr4);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0498 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void AlternateContactlessPaymentDataJson(long j, long j2) {
        char c;
        int i;
        java.lang.Object obj;
        java.lang.Object cls;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        com.payair.hce.unwrapOpenHelper unwrapopenhelper = new com.payair.hce.unwrapOpenHelper(j, j2);
        byte[] bArr = valueOf;
        char c2 = kotlin.text.Typography.less;
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(bArr[60], bArr[8], bArr[381], objArr);
        java.lang.String str = (java.lang.String) objArr[0];
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        short s = 264;
        a(com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_SHIELD_VALUE, (short) 264, (byte) (AlternateContactlessPaymentDataJson & 475), objArr2);
        try {
            java.lang.Object[] objArr3 = {(java.lang.String) objArr2[0]};
            char c3 = 19;
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            a(250, (short) 264, bArr[19], objArr4);
            java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr4[0]);
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            a(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE, (short) 279, bArr[200], objArr5);
            java.lang.String str2 = (java.lang.String) objArr5[0];
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            a(250, (short) 264, bArr[19], objArr6);
            java.lang.Object[] objArr7 = (java.lang.Object[]) cls2.getMethod(str2, java.lang.Class.forName((java.lang.String) objArr6[0])).invoke(str, objArr3);
            int[] iArr = new int[objArr7.length];
            int i2 = 0;
            while (i2 < objArr7.length) {
                java.lang.Object[] objArr8 = {objArr7[i2]};
                byte[] bArr2 = valueOf;
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                a(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_CONFIRMED_VALUE, (short) 283, bArr2[19], objArr9);
                java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr9[0]);
                byte b = bArr2[c2];
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                a(259, (short) 299, b, objArr10);
                java.lang.String str3 = (java.lang.String) objArr10[0];
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                a(250, (short) 264, bArr2[19], objArr11);
                java.lang.Object invoke = cls3.getMethod(str3, java.lang.Class.forName((java.lang.String) objArr11[0])).invoke(null, objArr8);
                java.lang.Object[] objArr12 = new java.lang.Object[1];
                a(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_CONFIRMED_VALUE, (short) 283, bArr2[19], objArr12);
                java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr12[0]);
                java.lang.Object[] objArr13 = new java.lang.Object[1];
                a(258, (short) 305, bArr2[53], objArr13);
                iArr[i2] = ((java.lang.Integer) cls4.getMethod((java.lang.String) objArr13[0], null).invoke(invoke, null)).intValue();
                i2++;
                c2 = kotlin.text.Typography.less;
            }
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                try {
                } catch (java.lang.Throwable th) {
                    th = th;
                    if (i4 >= 25) {
                    }
                    throw th;
                }
                switch (unwrapopenhelper.values(iArr[i3])) {
                    case -34:
                        i3 = 55;
                        c3 = 19;
                        s = 264;
                    case -33:
                        i3 = 80;
                        c3 = 19;
                        s = 264;
                    case -32:
                        unwrapopenhelper.values(33);
                        if (unwrapopenhelper.AlternateContactlessPaymentDataJson == 0) {
                            i3 = 79;
                            c3 = 19;
                            s = 264;
                        }
                        i3 = i4;
                        c3 = 19;
                        s = 264;
                    case -31:
                        i3 = 25;
                        c3 = 19;
                    case -30:
                        i3 = 70;
                        c3 = 19;
                        s = 264;
                    case -29:
                        unwrapopenhelper.values(33);
                        if (unwrapopenhelper.AlternateContactlessPaymentDataJson == 0) {
                            i3 = 69;
                            c3 = 19;
                            s = 264;
                        }
                        i3 = i4;
                        c3 = 19;
                        s = 264;
                    case -28:
                        unwrapopenhelper.DigitizedCardProfile = 1;
                        unwrapopenhelper.values(4);
                        unwrapopenhelper.values(11);
                        values = unwrapopenhelper.AlternateContactlessPaymentDataJson;
                        i3 = i4;
                        c3 = 19;
                        s = 264;
                    case -27:
                        i = writeReplace;
                        unwrapopenhelper.DigitizedCardProfile = i;
                        unwrapopenhelper.values(6);
                        i3 = i4;
                        c3 = 19;
                        s = 264;
                    case -26:
                        return;
                    case -25:
                        i3 = 60;
                        c3 = 19;
                    case -24:
                        i3 = 1;
                        c3 = 19;
                    case -23:
                        i3 = 58;
                        c3 = 19;
                        s = 264;
                    case -22:
                        byte b2 = $$a[34];
                        java.lang.Object[] objArr14 = new java.lang.Object[1];
                        c((byte) (b2 - 1), b2, (byte) 32, objArr14);
                        obj = objArr14[0];
                        cls = (java.lang.String) obj;
                        unwrapopenhelper.getProfileVersion = cls;
                        unwrapopenhelper.values(1);
                        i3 = i4;
                        c3 = 19;
                        s = 264;
                    case -21:
                        unwrapopenhelper.DigitizedCardProfile = 1;
                        unwrapopenhelper.values(4);
                        unwrapopenhelper.values(12);
                        cls = java.lang.Class.forName((java.lang.String) unwrapopenhelper.getAid);
                        unwrapopenhelper.getProfileVersion = cls;
                        unwrapopenhelper.values(1);
                        i3 = i4;
                        c3 = 19;
                        s = 264;
                    case -20:
                        try {
                            byte b3 = $$a[34];
                            java.lang.Object[] objArr15 = new java.lang.Object[1];
                            c(b3, (byte) (b3 - 1), r0[23], objArr15);
                            obj = objArr15[0];
                            cls = (java.lang.String) obj;
                            unwrapopenhelper.getProfileVersion = cls;
                            unwrapopenhelper.values(1);
                            i3 = i4;
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            if (i4 >= 25) {
                            }
                            throw th;
                        }
                        c3 = 19;
                        s = 264;
                        break;
                    case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID /* -19 */:
                        try {
                            unwrapopenhelper.DigitizedCardProfile = 3;
                            unwrapopenhelper.values(4);
                            unwrapopenhelper.values(12);
                            obj2 = unwrapopenhelper.getAid;
                            unwrapopenhelper.values(12);
                            obj3 = unwrapopenhelper.getAid;
                            unwrapopenhelper.values(12);
                        } catch (java.lang.Throwable th3) {
                            th = th3;
                        }
                        try {
                            java.lang.Object[] objArr16 = {obj3, unwrapopenhelper.getAid};
                            byte[] bArr3 = valueOf;
                            java.lang.Object[] objArr17 = new java.lang.Object[1];
                            a(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE, (short) 430, bArr3[c3], objArr17);
                            java.lang.Class<?> cls5 = java.lang.Class.forName((java.lang.String) objArr17[0]);
                            try {
                                java.lang.Object[] objArr18 = new java.lang.Object[1];
                                a(com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE, (short) 453, bArr3[53], objArr18);
                                java.lang.String str4 = (java.lang.String) objArr18[0];
                                java.lang.Object[] objArr19 = new java.lang.Object[1];
                                a(250, (short) 415, bArr3[c3], objArr19);
                                byte b4 = (byte) (-bArr3[297]);
                                java.lang.Object[] objArr20 = new java.lang.Object[1];
                                a(247, (short) 458, b4, objArr20);
                                cls = cls5.getMethod(str4, java.lang.Class.forName((java.lang.String) objArr19[0]), java.lang.Class.forName((java.lang.String) objArr20[0])).invoke(obj2, objArr16);
                                unwrapopenhelper.getProfileVersion = cls;
                                unwrapopenhelper.values(1);
                                i3 = i4;
                                c3 = 19;
                                s = 264;
                            } catch (java.lang.Throwable th4) {
                                th = th4;
                                try {
                                    java.lang.Throwable cause = th.getCause();
                                    if (cause == null) {
                                        throw th;
                                    }
                                    throw cause;
                                } catch (java.lang.Throwable th5) {
                                    th = th5;
                                    if (i4 >= 25) {
                                    }
                                    throw th;
                                }
                            }
                        } catch (java.lang.Throwable th6) {
                            th = th6;
                        }
                        break;
                    case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                        c = 249;
                        unwrapopenhelper.DigitizedCardProfile = 3;
                        unwrapopenhelper.values(4);
                        unwrapopenhelper.values(12);
                        java.lang.Class cls6 = (java.lang.Class) unwrapopenhelper.getAid;
                        unwrapopenhelper.values(12);
                        java.lang.String str5 = (java.lang.String) unwrapopenhelper.getAid;
                        unwrapopenhelper.values(12);
                        cls = cls6.getMethod(str5, (java.lang.Class[]) unwrapopenhelper.getAid);
                        unwrapopenhelper.getProfileVersion = cls;
                        unwrapopenhelper.values(1);
                        i3 = i4;
                        c3 = 19;
                        s = 264;
                    case -17:
                        c = 249;
                        java.lang.Object[] objArr21 = new java.lang.Object[1];
                        a(250, s, valueOf[c3], objArr21);
                        cls = java.lang.Class.forName((java.lang.String) objArr21[0]);
                        unwrapopenhelper.getProfileVersion = cls;
                        unwrapopenhelper.values(1);
                        i3 = i4;
                        c3 = 19;
                        s = 264;
                    case -16:
                        unwrapopenhelper.DigitizedCardProfile = 1;
                        unwrapopenhelper.values(4);
                        unwrapopenhelper.values(11);
                        unwrapopenhelper.getProfileVersion = new java.lang.Class[unwrapopenhelper.AlternateContactlessPaymentDataJson];
                        unwrapopenhelper.values(1);
                        i3 = i4;
                        c3 = 19;
                        s = 264;
                    case -15:
                        c = 249;
                        cls = "values";
                        unwrapopenhelper.getProfileVersion = cls;
                        unwrapopenhelper.values(1);
                        i3 = i4;
                        c3 = 19;
                        s = 264;
                    case -14:
                        c = 249;
                        cls = com.payair.hce.setLongClickable.class;
                        unwrapopenhelper.getProfileVersion = cls;
                        unwrapopenhelper.values(1);
                        i3 = i4;
                        c3 = 19;
                        s = 264;
                    case -13:
                        c = 249;
                        unwrapopenhelper.DigitizedCardProfile = 1;
                        unwrapopenhelper.values(4);
                        unwrapopenhelper.values(11);
                        int i5 = unwrapopenhelper.AlternateContactlessPaymentDataJson;
                        java.lang.Object[] objArr22 = new java.lang.Object[1];
                        a(250, (short) 415, valueOf[c3], objArr22);
                        cls = java.lang.reflect.Array.newInstance(java.lang.Class.forName((java.lang.String) objArr22[0]), i5);
                        unwrapopenhelper.getProfileVersion = cls;
                        unwrapopenhelper.values(1);
                        i3 = i4;
                        c3 = 19;
                        s = 264;
                    case -12:
                        unwrapopenhelper.values(16);
                        throw ((java.lang.Throwable) unwrapopenhelper.getAid);
                    case -11:
                        i3 = 23;
                    case -10:
                        i3 = 21;
                    case -9:
                        c = 249;
                        unwrapopenhelper.values(14);
                        if (unwrapopenhelper.AlternateContactlessPaymentDataJson == 0) {
                            i3 = 20;
                        } else {
                            i3 = i4;
                            c3 = 19;
                            s = 264;
                        }
                    case -8:
                        c = 249;
                        unwrapopenhelper.DigitizedCardProfile = 1;
                        unwrapopenhelper.values(4);
                        unwrapopenhelper.values(12);
                        cls = ((java.lang.Throwable) unwrapopenhelper.getAid).getCause();
                        unwrapopenhelper.getProfileVersion = cls;
                        unwrapopenhelper.values(1);
                        i3 = i4;
                        c3 = 19;
                        s = 264;
                    case -7:
                        i3 = 71;
                    case -6:
                        c = 249;
                        try {
                            unwrapopenhelper.DigitizedCardProfile = 1;
                            unwrapopenhelper.values(4);
                            unwrapopenhelper.values(12);
                            obj4 = unwrapopenhelper.getAid;
                        } catch (java.lang.Throwable th7) {
                            th = th7;
                            if ((i4 >= 25 || i4 > 41) && (i4 < 41 || i4 > 50)) {
                                throw th;
                            }
                            unwrapopenhelper.getProfileVersion = th;
                            unwrapopenhelper.values(37);
                            i3 = 15;
                            c3 = 19;
                            s = 264;
                        }
                        try {
                            byte[] bArr4 = valueOf;
                            java.lang.Object[] objArr23 = new java.lang.Object[1];
                            a(250, s, bArr4[c3], objArr23);
                            java.lang.Class<?> cls7 = java.lang.Class.forName((java.lang.String) objArr23[0]);
                            java.lang.Object[] objArr24 = new java.lang.Object[1];
                            a(com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE, (short) 410, bArr4[53], objArr24);
                            try {
                                cls = cls7.getMethod((java.lang.String) objArr24[0], null).invoke(obj4, null);
                                unwrapopenhelper.getProfileVersion = cls;
                                unwrapopenhelper.values(1);
                                i3 = i4;
                                c3 = 19;
                                s = 264;
                            } catch (java.lang.Throwable th8) {
                                th = th8;
                                java.lang.Throwable cause2 = th.getCause();
                                if (cause2 == null) {
                                    throw th;
                                }
                                throw cause2;
                            }
                        } catch (java.lang.Throwable th9) {
                            th = th9;
                        }
                    case -5:
                        c = 249;
                        unwrapopenhelper.DigitizedCardProfile = 5;
                        unwrapopenhelper.values(4);
                        unwrapopenhelper.values(11);
                        boolean z = unwrapopenhelper.AlternateContactlessPaymentDataJson != 0;
                        unwrapopenhelper.values(12);
                        java.lang.String str6 = (java.lang.String) unwrapopenhelper.getAid;
                        unwrapopenhelper.values(11);
                        int i6 = unwrapopenhelper.AlternateContactlessPaymentDataJson;
                        unwrapopenhelper.values(11);
                        int i7 = unwrapopenhelper.AlternateContactlessPaymentDataJson;
                        unwrapopenhelper.values(11);
                        java.lang.Object[] objArr25 = new java.lang.Object[1];
                        b(z, str6, i6, i7, unwrapopenhelper.AlternateContactlessPaymentDataJson, objArr25);
                        cls = (java.lang.String) objArr25[0];
                        unwrapopenhelper.getProfileVersion = cls;
                        unwrapopenhelper.values(1);
                        i3 = i4;
                        c3 = 19;
                        s = 264;
                    case -4:
                        try {
                            byte[] bArr5 = valueOf;
                            java.lang.Object[] objArr26 = new java.lang.Object[1];
                            a(236, (short) 365, bArr5[271], objArr26);
                            java.lang.Class<?> cls8 = java.lang.Class.forName((java.lang.String) objArr26[0]);
                            java.lang.Object[] objArr27 = new java.lang.Object[1];
                            c = 249;
                            try {
                                a(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_CONFIRMED_VALUE, (short) 394, bArr5[300], objArr27);
                                try {
                                    unwrapopenhelper.values = ((java.lang.Float) cls8.getMethod((java.lang.String) objArr27[0], null).invoke(null, null)).floatValue();
                                    unwrapopenhelper.values(9);
                                    i3 = i4;
                                } catch (java.lang.Throwable th10) {
                                    th = th10;
                                    if (i4 >= 25) {
                                    }
                                    throw th;
                                }
                                c3 = 19;
                                s = 264;
                            } catch (java.lang.Throwable th11) {
                                th = th11;
                                java.lang.Throwable cause3 = th.getCause();
                                if (cause3 == null) {
                                    throw th;
                                }
                                throw cause3;
                            }
                        } catch (java.lang.Throwable th12) {
                            th = th12;
                        }
                        break;
                    case -3:
                        unwrapopenhelper.DigitizedCardProfile = 1;
                        unwrapopenhelper.values(4);
                        unwrapopenhelper.values(5);
                        try {
                            java.lang.Object[] objArr28 = {java.lang.Long.valueOf(unwrapopenhelper.valueOf)};
                            byte[] bArr6 = valueOf;
                            java.lang.Object[] objArr29 = new java.lang.Object[1];
                            a(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE, (short) 312, bArr6[271], objArr29);
                            java.lang.Class<?> cls9 = java.lang.Class.forName((java.lang.String) objArr29[0]);
                            java.lang.Object[] objArr30 = new java.lang.Object[1];
                            a(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE, (short) 344, bArr6[300], objArr30);
                            i = ((java.lang.Integer) cls9.getMethod((java.lang.String) objArr30[0], java.lang.Long.TYPE).invoke(null, objArr28)).intValue();
                            unwrapopenhelper.DigitizedCardProfile = i;
                            unwrapopenhelper.values(6);
                            i3 = i4;
                            c3 = 19;
                            s = 264;
                        } catch (java.lang.Throwable th13) {
                            java.lang.Throwable cause4 = th13.getCause();
                            if (cause4 == null) {
                                throw th13;
                            }
                            throw cause4;
                        }
                    case -2:
                        cls = "\u0002\u0003￼";
                        unwrapopenhelper.getProfileVersion = cls;
                        unwrapopenhelper.values(1);
                        i3 = i4;
                        c3 = 19;
                        s = 264;
                    case -1:
                        i3 = 50;
                    default:
                        i3 = i4;
                        c3 = 19;
                        s = 264;
                }
            }
        } catch (java.lang.Throwable th14) {
            java.lang.Throwable cause5 = th14.getCause();
            if (cause5 == null) {
                throw th14;
            }
            throw cause5;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, short s, int i2, java.lang.Object[] objArr) {
        int i3;
        byte[] bArr = valueOf;
        int i4 = s + 4;
        int i5 = 118 - i2;
        byte[] bArr2 = new byte[266 - i];
        int i6 = 265 - i;
        if (bArr == null) {
            int i7 = i6;
            int i8 = 0;
            i5 = (-i5) + i7;
            i3 = i8;
            i4++;
            bArr2[i3] = (byte) i5;
            if (i3 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i9 = i3 + 1;
            i7 = i5;
            i5 = bArr[i4];
            i8 = i9;
            i5 = (-i5) + i7;
            i3 = i8;
            i4++;
            bArr2[i3] = (byte) i5;
            if (i3 == i6) {
            }
        } else {
            i3 = 0;
            i4++;
            bArr2[i3] = (byte) i5;
            if (i3 == i6) {
            }
        }
    }

    static void init$1() {
        $$d = new byte[]{107, 115, 84, 3};
        $$e = 155;
    }

    static void valueOf() {
        valueOf = new byte[]{124, -43, -124, -86, -4, 5, -6, 6, -1, -5, 6, -7, 7, -11, com.google.common.base.Ascii.VT, -1, -6, 7, -12, com.google.common.base.Ascii.FF, -1, -7, 8, -5, 1, 4, -11, com.google.common.base.Ascii.VT, -1, -6, 7, -12, com.google.common.base.Ascii.FF, -1, -8, 9, -1, -9, 10, -1, -10, com.google.common.base.Ascii.VT, -5, -2, 7, -1, -11, com.google.common.base.Ascii.FF, -5, -2, 7, -1, -12, 13, -1, -4, 1, 4, -1, -4, 0, 5, -5, -4, 9, -1, -4, -1, 6, -5, -6, com.google.common.base.Ascii.VT, -1, -4, -1, 6, -6, 6, -1, -4, -2, 7, -5, -7, com.google.common.base.Ascii.FF, -5, -8, 13, -6, 2, 4, -1, -4, -3, 8, -1, -4, -4, 9, -6, 6, -1, -4, -5, 10, -6, 1, 5, -1, -4, -6, com.google.common.base.Ascii.VT, -6, 0, 6, -1, -4, -7, com.google.common.base.Ascii.FF, -6, -1, 7, -1, -4, -8, 13, -5, -6, com.google.common.base.Ascii.VT, -1, -5, 2, 4, -1, -5, 1, 5, -1, -5, 0, 6, -6, -2, 8, -1, -4, -7, com.google.common.base.Ascii.FF, -6, -3, 9, -1, -4, -8, 13, -5, -6, com.google.common.base.Ascii.VT, -1, -5, -1, 7, -6, -4, 10, -6, -4, 10, -6, -5, com.google.common.base.Ascii.VT, -5, -6, com.google.common.base.Ascii.VT, -1, -5, -2, 8, -6, -4, 10, -6, -6, com.google.common.base.Ascii.FF, -1, -5, -3, 9, -6, -7, 13, -1, -5, -4, 10, -1, -5, -5, com.google.common.base.Ascii.VT, -7, 3, 4, -7, 2, 5, -7, 1, 6, -1, -5, -6, com.google.common.base.Ascii.FF, -6, -4, 10, -6, -5, com.google.common.base.Ascii.VT, -1, -5, -7, 13, -1, -6, 3, 4, -1, -6, 2, 5, -1, -6, 2, 5, -1, -5, -5, com.google.common.base.Ascii.VT, -7, -1, 8, -7, -2, 9, -6, -5, com.google.common.base.Ascii.VT, -1, -5, -6, com.google.common.base.Ascii.FF, -7, -3, 10, -1, -6, 1, 6, -1, -6, 0, 7, -1, -6, -1, 8, -1, -6, -1, 9, -21, com.google.common.base.Ascii.NAK, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -62, com.google.common.base.Ascii.VT, -13, 7, 57, -37, -33, 2, 9, -5, 7, 3, 4, 3, -11, 9, -21, com.google.common.base.Ascii.NAK, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -62, com.google.common.base.Ascii.VT, -13, 7, 57, -27, -37, -6, com.google.common.base.Ascii.SI, -2, 2, -13, com.google.common.base.Ascii.NAK, -11, -9, 16, com.google.common.base.Ascii.SYN, -23, -5, -6, com.google.common.base.Ascii.RS, -11, -11, -9, 16, -13, 10, -14, 3, 6, 5, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, -73, 14, 5, -3, 2, -15, 70, -23, -51, 8, com.google.common.base.Ascii.SI, -13, 10, 3, -1, -10, 7, com.google.common.base.Ascii.EM, -29, -10, -1, com.google.common.base.Ascii.RS, -19, 4, -18, 2, -15, 36, -17, -2, -8, 6, 1, com.google.common.base.Ascii.DC4, -31, -4, 10, -11, com.google.common.base.Ascii.VT, -6, 1, 43, -37, -1, -3, 8, -13, 10, -14, 3, 6, 5, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, -72, 13, 4, -18, 73, -40, -19, 4, -18, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -44, 1, 8, -3, 2, -14, 3, 17, -19, com.google.common.base.Ascii.VT, -6, 1, 2, -15, 33, com.visa.cbp.getEncExpo.onUnminimized, -15, 3, 3, 0, 38, -44, 9, 6, -17, com.google.common.base.Ascii.VT, -6, 1, -5, -6, com.google.common.base.Ascii.SI, -13, 4, 9, -21, com.google.common.base.Ascii.NAK, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -62, com.google.common.base.Ascii.VT, -13, 7, 57, -33, -19, -8, 5, 2, -17, 9, -21, com.google.common.base.Ascii.NAK, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -62, com.google.common.base.Ascii.VT, -13, 7, 57, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, 13, -1, -6, 7, 2, -17, 70, -31, -24, -15, com.google.common.base.Ascii.FF, -7, com.google.common.base.Ascii.VT, -5, -8, 7, 4, 6, com.google.common.base.Ascii.SI, -30, 9, -21, com.google.common.base.Ascii.NAK, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -62, com.google.common.base.Ascii.VT, -13, 7, 57, -33, -19, -8, 5, 2, -17, 57};
        AlternateContactlessPaymentDataJson = 110;
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        valueOf();
        writeReplace = 0;
        values = 1;
        DigitizedCardProfile = 1889207072;
    }

    static void init$0() {
        $$a = new byte[]{89, 16, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, -117, com.google.common.base.Ascii.FF, -2, -63, 66, -15, com.google.common.base.Ascii.CAN, -24, 8, 9, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, 58, -5, 2, -55, 69, -14, com.google.common.base.Ascii.SI, com.visa.cbp.getEncExpo.kernelVersion, 44, -1, 6, -15, 19, -4, com.visa.cbp.getEncExpo.kernelVersion, 41, -3, -6, 8, -10, 1, 10, -7, -21, com.google.common.base.Ascii.VT, 9, com.visa.cbp.getEncExpo.onUnminimized, -22, com.google.common.base.Ascii.ETB};
        $$b = 155;
    }
}
