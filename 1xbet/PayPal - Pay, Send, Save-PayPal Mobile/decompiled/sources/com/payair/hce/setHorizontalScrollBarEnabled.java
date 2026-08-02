package com.payair.hce;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
final class setHorizontalScrollBarEnabled {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final byte[] $$g = null;
    private static final int $$h = 0;
    private static int $10;
    private static int $11;
    private static char[] AlternateContactlessPaymentDataJson;
    private static char[] DigitizedCardProfile;
    private static int IccPrivateKeyCrtComponentsJson;
    private static char getAid;
    private static int getProfileVersion;
    private static final /* synthetic */ com.payair.hce.setHorizontalScrollBarEnabled[] valueOf;
    private static char values;
    public static final com.payair.hce.setHorizontalScrollBarEnabled writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, int i, int i2, java.lang.Object[] objArr) {
        int i3;
        int i4 = 38 - (s * 34);
        int i5 = i * 7;
        int i6 = (i2 * 18) + 65;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i5 + 35];
        int i7 = i5 + 34;
        if (bArr == null) {
            int i8 = i7;
            i3 = 0;
            i6 = (i6 + i8) - 2;
            i4++;
            bArr2[i3] = (byte) i6;
            if (i3 == i7) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i8 = bArr[i4];
            i3++;
            i6 = (i6 + i8) - 2;
            i4++;
            bArr2[i3] = (byte) i6;
            if (i3 == i7) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i6;
            if (i3 == i7) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(short s, byte b, short s2, java.lang.Object[] objArr) {
        int i;
        int i2;
        int i3 = s + 4;
        byte[] bArr = $$d;
        byte[] bArr2 = new byte[35 - s2];
        int i4 = 34 - s2;
        if (bArr == null) {
            int i5 = i3;
            int i6 = i4;
            i2 = 0;
            int i7 = i5;
            i = (i3 + (-i6)) - 1;
            i3 = i7;
            int i8 = i3 + 1;
            bArr2[i2] = (byte) i;
            if (i2 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i6 = bArr[i8];
            i2++;
            int i9 = i;
            i5 = i8;
            i3 = i9;
            int i72 = i5;
            i = (i3 + (-i6)) - 1;
            i3 = i72;
            int i82 = i3 + 1;
            bArr2[i2] = (byte) i;
            if (i2 == i4) {
            }
        } else {
            i = 118 - b;
            i2 = 0;
            int i822 = i3 + 1;
            bArr2[i2] = (byte) i;
            if (i2 == i4) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void e(byte b, short s, byte b2, java.lang.Object[] objArr) {
        int i;
        int i2;
        int i3 = 3 - (s * 3);
        int i4 = (b * 3) + 1;
        byte[] bArr = $$g;
        int i5 = 73 - (b2 * 8);
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i6 = i4;
            int i7 = 0;
            i5 = (-i5) + i6;
            i = i7;
            bArr2[i] = (byte) i5;
            i2 = i + 1;
            i3++;
            if (i2 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i6 = i5;
            i5 = bArr[i3];
            i7 = i2;
            i5 = (-i5) + i6;
            i = i7;
            bArr2[i] = (byte) i5;
            i2 = i + 1;
            i3++;
            if (i2 == i4) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i5;
            i2 = i + 1;
            i3++;
            if (i2 == i4) {
            }
        }
    }

    private setHorizontalScrollBarEnabled(java.lang.String str) {
    }

    private static /* synthetic */ com.payair.hce.setHorizontalScrollBarEnabled[] IccPrivateKeyCrtComponentsJson() {
        int i = getProfileVersion;
        IccPrivateKeyCrtComponentsJson = (i + 93) % 128;
        com.payair.hce.setHorizontalScrollBarEnabled[] sethorizontalscrollbarenabledArr = {writeReplace};
        IccPrivateKeyCrtComponentsJson = (i + 41) % 128;
        return sethorizontalscrollbarenabledArr;
    }

    public static com.payair.hce.setHorizontalScrollBarEnabled valueOf(java.lang.String str) {
        int i = IccPrivateKeyCrtComponentsJson + 75;
        getProfileVersion = i % 128;
        com.payair.hce.setHorizontalScrollBarEnabled sethorizontalscrollbarenabled = (com.payair.hce.setHorizontalScrollBarEnabled) java.lang.Enum.valueOf(com.payair.hce.setHorizontalScrollBarEnabled.class, str);
        if (i % 2 == 0) {
            return sethorizontalscrollbarenabled;
        }
        throw new java.lang.ArithmeticException();
    }

    public static com.payair.hce.setHorizontalScrollBarEnabled[] values() {
        int i = getProfileVersion + 27;
        IccPrivateKeyCrtComponentsJson = i % 128;
        com.payair.hce.setHorizontalScrollBarEnabled[] sethorizontalscrollbarenabledArr = valueOf;
        if (i % 2 != 0) {
            return (com.payair.hce.setHorizontalScrollBarEnabled[]) sethorizontalscrollbarenabledArr.clone();
        }
        throw null;
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        init$0();
        getProfileVersion = 0;
        IccPrivateKeyCrtComponentsJson = 1;
        writeReplace();
        DigitizedCardProfile();
        writeReplace = new com.payair.hce.setHorizontalScrollBarEnabled("INSTANCE");
        valueOf = IccPrivateKeyCrtComponentsJson();
        int i = getProfileVersion + 97;
        IccPrivateKeyCrtComponentsJson = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0390  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private java.lang.String RecordsJson() {
        char c;
        int intValue;
        java.lang.Object[] objArr;
        java.lang.Object[] objArr2;
        int i;
        int i2;
        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), android.graphics.Color.rgb(0, 0, 0) + 16777800, (char) ((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 24291));
        byte[] bArr = $$a;
        byte b = bArr[14];
        byte b2 = (byte) (b - 1);
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        a(b, b2, b2, objArr3);
        long j = cls.getField((java.lang.String) objArr3[0]).getLong(null);
        try {
            try {
                try {
                    if (j != -1) {
                        IccPrivateKeyCrtComponentsJson = (getProfileVersion + 7) % 128;
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        b(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 22, "\u0011\u0005\u0014\u0006\u0006\u0015\u0014\u0001\u0003\u0010\u0004\u0014\u0017\u000f\f\u0015\u0012\u0003\u000b\u0000\r\n", (byte) (11 - (android.view.KeyEvent.getMaxKeyCode() >> 16)), objArr4);
                        java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr4[0]);
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        b(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 16, "\u0014\f\u0012\u0000\u0011\u0017\u0018\u0006\u0014\u0011\u000b\f\u0012\u000b㙞", (byte) (95 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16)), objArr5);
                        if (j + 2040 >= ((java.lang.Long) cls2.getDeclaredMethod((java.lang.String) objArr5[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
                            java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getTrimmedLength("") + 51, (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 584, (char) ((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 24291));
                            byte b3 = bArr[14];
                            byte b4 = (byte) (b3 - 1);
                            byte b5 = b3;
                            java.lang.Object[] objArr6 = new java.lang.Object[1];
                            a(b4, b5, b5, objArr6);
                            try {
                                java.lang.Object[] objArr7 = {cls3.getField((java.lang.String) objArr6[0]).get(null), -805649121, 0};
                                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                                if (obj == null) {
                                    obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(30 - android.view.View.resolveSizeAndState(0, 0, 0), 4830 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) ((-1) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj);
                                }
                                objArr2 = (java.lang.Object[]) ((java.lang.reflect.Method) obj).invoke(null, objArr7);
                                int i3 = getProfileVersion + 103;
                                IccPrivateKeyCrtComponentsJson = i3 % 128;
                                if (i3 % 2 == 0) {
                                    int i4 = 5 / 2;
                                }
                                i = ((int[]) objArr2[1])[0];
                                i2 = ((int[]) objArr2[0])[0];
                                if (i2 != i) {
                                    int i5 = getProfileVersion + 59;
                                    IccPrivateKeyCrtComponentsJson = i5 % 128;
                                    if (i5 % 2 == 0) {
                                        java.lang.Object[] objArr8 = {objArr2, java.lang.Integer.valueOf(((int[]) objArr2[3])[0]), 1};
                                        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                                        if (obj2 == null) {
                                            obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 30, (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 4830, (char) ((-1) - android.widget.ExpandableListView.getPackedPositionChild(0L)))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj2);
                                        }
                                        ((java.lang.reflect.Method) obj2).invoke(null, objArr8);
                                    } else {
                                        java.lang.Object[] objArr9 = {objArr2, java.lang.Integer.valueOf(((int[]) objArr2[3])[0]), 0};
                                        java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                                        if (obj3 == null) {
                                            obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getTrimmedLength("") + 30, android.widget.ExpandableListView.getPackedPositionChild(0L) + 4831, (char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj3);
                                        }
                                        ((java.lang.reflect.Method) obj3).invoke(null, objArr9);
                                    }
                                } else {
                                    new java.util.ArrayList().add((java.lang.String) objArr2[2]);
                                    long j2 = i ^ i2;
                                    getProfileVersion = (IccPrivateKeyCrtComponentsJson + 73) % 128;
                                    try {
                                        java.lang.Object[] objArr10 = {java.lang.Long.valueOf(j2 ^ 8946007219292340224L), 2082904635L};
                                        java.lang.Object[] objArr11 = new java.lang.Object[1];
                                        c(r6[29], (byte) (-$$d[22]), r6[69], objArr11);
                                        java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr11[0]);
                                        java.lang.Object[] objArr12 = new java.lang.Object[1];
                                        c(r6[13], (byte) ($$e >>> 2), r6[69], objArr12);
                                        cls4.getMethod((java.lang.String) objArr12[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr10);
                                        java.lang.Object[] objArr13 = {objArr2, java.lang.Integer.valueOf(((int[]) objArr2[3])[0]), 0};
                                        java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                                        if (obj4 == null) {
                                            obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(30 - android.graphics.Color.argb(0, 0, 0, 0), (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 4830, (char) android.view.View.combineMeasuredStates(0, 0))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj4);
                                        }
                                        ((java.lang.reflect.Method) obj4).invoke(null, objArr13);
                                    } catch (java.lang.Throwable th) {
                                        java.lang.Throwable cause = th.getCause();
                                        if (cause != null) {
                                            throw cause;
                                        }
                                        throw th;
                                    }
                                }
                                return (java.lang.String) com.payair.hce.setLeft.values(new java.lang.Object[]{"LSSupport", "", ah_()}, 1992502504, -1992502503, (int) java.lang.System.currentTimeMillis());
                            } catch (java.lang.Throwable th2) {
                                java.lang.Throwable cause2 = th2.getCause();
                                if (cause2 != null) {
                                    throw cause2;
                                }
                                throw th2;
                            }
                        }
                        c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
                    } else {
                        c = '0';
                    }
                    java.lang.Object[] objArr14 = new java.lang.Object[1];
                    b(android.graphics.Color.green(0) + 22, "\u0011\u0005\u0014\u0006\u0006\u0015\u0014\u0001\u0003\u0010\u0004\u0014\u0017\u000f\f\u0015\u0012\u0003\u000b\u0000\r\n", (byte) (11 - android.text.TextUtils.indexOf("", "")), objArr14);
                    java.lang.Class<?> cls5 = java.lang.Class.forName((java.lang.String) objArr14[0]);
                    java.lang.Object[] objArr15 = new java.lang.Object[1];
                    b(15 - android.view.View.combineMeasuredStates(0, 0), "\u0014\f\u0012\u0000\u0011\u0017\u0018\u0006\u0014\u0011\u000b\f\u0012\u000b㙞", (byte) (95 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), objArr15);
                    long longValue = ((java.lang.Long) cls5.getDeclaredMethod((java.lang.String) objArr15[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                    java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 50, android.text.TextUtils.indexOf("", "", 0) + 584, (char) (24291 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16)));
                    byte b6 = bArr[14];
                    byte b7 = (byte) (b6 - 1);
                    java.lang.Object[] objArr16 = new java.lang.Object[1];
                    a(b6, b7, b7, objArr16);
                    cls6.getField((java.lang.String) objArr16[0]).set(null, java.lang.Long.valueOf(longValue));
                    objArr2 = objArr;
                    i = ((int[]) objArr2[1])[0];
                    i2 = ((int[]) objArr2[0])[0];
                    if (i2 != i) {
                    }
                    return (java.lang.String) com.payair.hce.setLeft.values(new java.lang.Object[]{"LSSupport", "", ah_()}, 1992502504, -1992502503, (int) java.lang.System.currentTimeMillis());
                } catch (java.lang.Throwable th3) {
                    java.lang.Throwable cause3 = th3.getCause();
                    if (cause3 != null) {
                        throw cause3;
                    }
                    throw th3;
                }
            } catch (java.lang.Exception unused) {
                throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
            }
            java.lang.Object[] objArr17 = {java.lang.Integer.valueOf(intValue), -805649121};
            byte[] bArr2 = $$d;
            java.lang.Object[] objArr18 = new java.lang.Object[1];
            c(bArr2[90], (byte) (-bArr2[22]), (byte) (bArr2[88] - 1), objArr18);
            java.lang.Class<?> cls7 = java.lang.Class.forName((java.lang.String) objArr18[0]);
            byte b8 = (byte) (bArr2[0] + 1);
            byte b9 = bArr2[69];
            java.lang.Object[] objArr19 = new java.lang.Object[1];
            c(b8, b9, (byte) (b9 | com.google.common.base.Ascii.GS), objArr19);
            objArr = (java.lang.Object[]) cls7.getMethod((java.lang.String) objArr19[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr17);
            java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetBefore("", 0) + 51, 584 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (24292 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))));
            byte b10 = bArr[14];
            byte b11 = (byte) (b10 - 1);
            byte b12 = b10;
            java.lang.Object[] objArr20 = new java.lang.Object[1];
            a(b11, b12, b12, objArr20);
            cls8.getField((java.lang.String) objArr20[0]).set(null, objArr);
        } catch (java.lang.Throwable th4) {
            java.lang.Throwable cause4 = th4.getCause();
            if (cause4 != null) {
                throw cause4;
            }
            throw th4;
        }
        java.lang.Object[] objArr21 = new java.lang.Object[1];
        b('@' - android.text.AndroidCharacter.getMirror(c), "\u0000\u0013\u0005\u0012\u0005\u000f\u0011\u0005\u0005\u0001\u0014\u0015\u0010\r\u0017\f", (byte) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 60), objArr21);
        java.lang.Class<?> cls9 = java.lang.Class.forName((java.lang.String) objArr21[0]);
        java.lang.Object[] objArr22 = new java.lang.Object[1];
        b((-16777200) - android.graphics.Color.rgb(0, 0, 0), "\u0015\u0001\u0002\f\u0010\u0015\n\u0015\u0000\u0011\u0013\u0012\u0015\u0003\u0016\u0017", (byte) ((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 94), objArr22);
        intValue = ((java.lang.Integer) cls9.getMethod((java.lang.String) objArr22[0], java.lang.Object.class).invoke(null, this)).intValue();
        IccPrivateKeyCrtComponentsJson = (getProfileVersion + 99) % 128;
    }

    private static java.lang.String getProfileVersion() {
        int i = IccPrivateKeyCrtComponentsJson + 3;
        getProfileVersion = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
        java.lang.String str = (java.lang.String) com.payair.hce.setLeft.values(new java.lang.Object[]{"CvmModel", "", ah_()}, 1992502504, -1992502503, (int) java.lang.System.currentTimeMillis());
        int i2 = IccPrivateKeyCrtComponentsJson + 69;
        getProfileVersion = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0138, code lost:
    
        if (r2.valueOf == r2.writeReplace) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0169, code lost:
    
        r15 = new java.lang.Object[13];
        r15[12] = r2;
        r15[11] = java.lang.Integer.valueOf(r5);
        r15[10] = r2;
        r15[9] = r2;
        r15[r11] = java.lang.Integer.valueOf(r5);
        r15[7] = r2;
        r15[r12] = r2;
        r15[5] = java.lang.Integer.valueOf(r5);
        r15[4] = r2;
        r15[3] = r2;
        r15[2] = java.lang.Integer.valueOf(r5);
        r15[1] = r2;
        r15[0] = r2;
        r4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1553139325);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01b2, code lost:
    
        if (r4 != null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01b4, code lost:
    
        r4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.argb(0, 0, 0, 0) + 29, 3597 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0 ? 0 : -1)), (char) android.text.TextUtils.getOffsetBefore("", 0))).getMethod(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1553139325, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0228, code lost:
    
        if (((java.lang.Integer) ((java.lang.reflect.Method) r4).invoke(null, r15)).intValue() != r2.SdkCoreAlternateContactlessPaymentDataImpl) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x022a, code lost:
    
        com.payair.hce.setHorizontalScrollBarEnabled.$10 = (com.payair.hce.setHorizontalScrollBarEnabled.$11 + 103) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0234, code lost:
    
        r11 = new java.lang.Object[]{r2, r2, java.lang.Integer.valueOf(r5), java.lang.Integer.valueOf(r5), r2, r2, java.lang.Integer.valueOf(r5), java.lang.Integer.valueOf(r5), r2, java.lang.Integer.valueOf(r5), r2};
        r4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(737480198);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0270, code lost:
    
        if (r4 != null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0272, code lost:
    
        r4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - (android.view.ViewConfiguration.getTapTimeout() >> 16), android.text.TextUtils.indexOf("", "", 0, 0) + 2665, (char) (18890 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0 ? 0 : -1))));
        r12 = new java.lang.Object[1];
        e((byte) 0, 0, (byte) 0, r12);
        r16 = 6;
        r19 = '\b';
        r4 = r4.getMethod((java.lang.String) r12[0], java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(737480198, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x02e3, code lost:
    
        r4 = ((java.lang.Integer) ((java.lang.reflect.Method) r4).invoke(null, r11)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x02f0, code lost:
    
        r11 = r2.AlternateContactlessPaymentDataJson;
        r14 = r2.SdkCoreAlternateContactlessPaymentDataImpl;
        r9[r2.values] = r3[r4];
        r9[r2.values + 1] = r3[(r11 * r5) + r14];
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0350, code lost:
    
        r2.values += 2;
        r12 = r16;
        r11 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x02df, code lost:
    
        r16 = 6;
        r19 = '\b';
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0304, code lost:
    
        r16 = 6;
        r19 = '\b';
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x030d, code lost:
    
        if (r2.DigitizedCardProfile != r2.AlternateContactlessPaymentDataJson) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x030f, code lost:
    
        r2.RecordsJson = ((r2.RecordsJson + r5) - 1) % r5;
        r2.SdkCoreAlternateContactlessPaymentDataImpl = ((r2.SdkCoreAlternateContactlessPaymentDataImpl + r5) - 1) % r5;
        r4 = r2.DigitizedCardProfile;
        r11 = r2.RecordsJson;
        r14 = r2.AlternateContactlessPaymentDataJson;
        r15 = r2.SdkCoreAlternateContactlessPaymentDataImpl;
        r9[r2.values] = r3[(r4 * r5) + r11];
        r9[r2.values + 1] = r3[(r14 * r5) + r15];
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0337, code lost:
    
        r4 = r2.DigitizedCardProfile;
        r11 = r2.SdkCoreAlternateContactlessPaymentDataImpl;
        r12 = r2.AlternateContactlessPaymentDataJson;
        r14 = r2.RecordsJson;
        r9[r2.values] = r3[(r4 * r5) + r11];
        r9[r2.values + 1] = r3[(r12 * r5) + r14];
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x014e, code lost:
    
        r9[r2.values] = (char) (r2.valueOf - r31);
        r9[r2.values + 1] = (char) (r2.writeReplace - r31);
        r19 = r11;
        r16 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x014c, code lost:
    
        if (r2.valueOf == r2.writeReplace) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, java.lang.String str, byte b, java.lang.Object[] objArr) {
        char[] cArr;
        int i2;
        int i3 = ($11 + 105) % 128;
        $10 = i3;
        if (str != null) {
            $11 = (i3 + 21) % 128;
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.payair.hce.DigitizedCardJson12 digitizedCardJson12 = new com.payair.hce.DigitizedCardJson12();
        char[] cArr3 = DigitizedCardProfile;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            for (int i4 = 0; i4 < length; i4++) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr3[i4])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getCapsMode("", 0, 0) + 49, (android.os.Process.myTid() >> 22) + 2508, (char) (android.text.TextUtils.indexOf("", "") + 6802));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        e((byte) 0, (short) 0, (byte) 1, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj);
                    }
                    cArr4[i4] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr4;
        }
        java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(getAid)};
        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
        char c = '\b';
        char c2 = 6;
        if (obj2 == null) {
            java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), 2508 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (char) (6802 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))));
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            e((byte) 0, (short) 0, (byte) 1, objArr5);
            obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj2);
        }
        char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
        char[] cArr5 = new char[i];
        if (i % 2 != 0) {
            $10 = ($11 + 117) % 128;
            i2 = i - 1;
            cArr5[i2] = (char) (cArr2[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            digitizedCardJson12.values = 0;
            $11 = ($10 + 97) % 128;
            while (digitizedCardJson12.values < i2) {
                int i5 = $10 + 35;
                $11 = i5 % 128;
                if (i5 % 2 == 0) {
                    digitizedCardJson12.valueOf = cArr2[digitizedCardJson12.values];
                    digitizedCardJson12.writeReplace = cArr2[digitizedCardJson12.values - 1];
                } else {
                    digitizedCardJson12.valueOf = cArr2[digitizedCardJson12.values];
                    digitizedCardJson12.writeReplace = cArr2[digitizedCardJson12.values + 1];
                }
            }
        }
        int i6 = 0;
        while (i6 < i) {
            int i7 = $10 + 45;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                cArr5[i6] = (char) (cArr5[i6] ^ 25437);
                i6 += 10;
            } else {
                cArr5[i6] = (char) (cArr5[i6] ^ 13722);
                i6++;
            }
        }
        objArr[0] = new java.lang.String(cArr5);
    }

    private static void d(byte b, java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] cArr;
        int i2;
        java.lang.Object obj;
        if (str != null) {
            $11 = ($10 + 111) % 128;
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.payair.hce.DigitizedCardJson12 digitizedCardJson12 = new com.payair.hce.DigitizedCardJson12();
        char[] cArr3 = AlternateContactlessPaymentDataJson;
        java.lang.Object obj2 = null;
        int i3 = 2;
        if (cArr3 != null) {
            $11 = ($10 + 79) % 128;
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                int i5 = $11 + 67;
                $10 = i5 % 128;
                if (i5 % i3 != 0) {
                    try {
                        java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr3[i4])};
                        java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
                        if (obj3 == null) {
                            java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), android.graphics.Color.alpha(0) + 2508, (char) (6802 - android.view.Gravity.getAbsoluteGravity(0, 0)));
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            e((byte) 0, (short) 0, (byte) 1, objArr3);
                            obj3 = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj3);
                        }
                        cArr4[i4] = ((java.lang.Character) ((java.lang.reflect.Method) obj3).invoke(null, objArr2)).charValue();
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr3[i4])};
                    java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
                    if (obj4 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.keyCodeFromString("") + 49, 2507 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (6802 - android.graphics.Color.red(0)));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        e((byte) 0, (short) 0, (byte) 1, objArr5);
                        obj4 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj4);
                    }
                    cArr4[i4] = ((java.lang.Character) ((java.lang.reflect.Method) obj4).invoke(null, objArr4)).charValue();
                    i4++;
                }
                i3 = 2;
            }
            $10 = ($11 + 37) % 128;
            cArr3 = cArr4;
        }
        java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(values)};
        java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
        if (obj5 == null) {
            java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.view.KeyEvent.normalizeMetaState(0), android.graphics.Color.red(0) + 2508, (char) ((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 6802));
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            e((byte) 0, (short) 0, (byte) 1, objArr7);
            obj5 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj5);
        }
        char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj5).invoke(null, objArr6)).charValue();
        char[] cArr5 = new char[i];
        if (i % 2 != 0) {
            $11 = ($10 + 113) % 128;
            i2 = i - 1;
            cArr5[i2] = (char) (cArr2[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i6 = 0;
            while (true) {
                digitizedCardJson12.values = i6;
                if (digitizedCardJson12.values >= i2) {
                    break;
                }
                digitizedCardJson12.valueOf = cArr2[digitizedCardJson12.values];
                digitizedCardJson12.writeReplace = cArr2[digitizedCardJson12.values + 1];
                if (digitizedCardJson12.valueOf == digitizedCardJson12.writeReplace) {
                    int i7 = $10 + 63;
                    $11 = i7 % 128;
                    if (i7 % 2 == 0) {
                        cArr5[digitizedCardJson12.values] = (char) (digitizedCardJson12.valueOf >> b);
                        int i8 = digitizedCardJson12.values;
                        throw new java.lang.ArithmeticException();
                    }
                    cArr5[digitizedCardJson12.values] = (char) (digitizedCardJson12.valueOf - b);
                    cArr5[digitizedCardJson12.values + 1] = (char) (digitizedCardJson12.writeReplace - b);
                    obj = obj2;
                } else {
                    java.lang.Object[] objArr8 = {digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12};
                    java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1553139325);
                    if (obj6 == null) {
                        obj6 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 29, 3596 - (android.os.Process.myTid() >> 22), (char) android.view.View.MeasureSpec.getMode(0))).getMethod(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1553139325, obj6);
                    }
                    if (((java.lang.Integer) ((java.lang.reflect.Method) obj6).invoke(null, objArr8)).intValue() == digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl) {
                        java.lang.Object[] objArr9 = {digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), java.lang.Integer.valueOf(charValue), digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12};
                        java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(737480198);
                        if (obj7 == null) {
                            java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - android.view.View.resolveSize(0, 0), 2665 - android.graphics.Color.argb(0, 0, 0, 0), (char) (18890 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))));
                            java.lang.Object[] objArr10 = new java.lang.Object[1];
                            e((byte) 0, (short) 0, (byte) 0, objArr10);
                            obj7 = cls4.getMethod((java.lang.String) objArr10[0], java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(737480198, obj7);
                        }
                        obj = null;
                        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj7).invoke(null, objArr9)).intValue();
                        int i9 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                        int i10 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                        cArr5[digitizedCardJson12.values] = cArr3[intValue];
                        cArr5[digitizedCardJson12.values + 1] = cArr3[(i9 * charValue) + i10];
                    } else {
                        obj = null;
                        if (digitizedCardJson12.DigitizedCardProfile == digitizedCardJson12.AlternateContactlessPaymentDataJson) {
                            $11 = ($10 + 103) % 128;
                            digitizedCardJson12.RecordsJson = ((digitizedCardJson12.RecordsJson + charValue) - 1) % charValue;
                            digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl = ((digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl + charValue) - 1) % charValue;
                            int i11 = digitizedCardJson12.DigitizedCardProfile;
                            int i12 = digitizedCardJson12.RecordsJson;
                            int i13 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                            int i14 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                            cArr5[digitizedCardJson12.values] = cArr3[(i11 * charValue) + i12];
                            cArr5[digitizedCardJson12.values + 1] = cArr3[(i13 * charValue) + i14];
                        } else {
                            int i15 = digitizedCardJson12.DigitizedCardProfile;
                            int i16 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                            int i17 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                            int i18 = digitizedCardJson12.RecordsJson;
                            cArr5[digitizedCardJson12.values] = cArr3[(i15 * charValue) + i16];
                            cArr5[digitizedCardJson12.values + 1] = cArr3[(i17 * charValue) + i18];
                        }
                    }
                }
                i6 = digitizedCardJson12.values + 2;
                obj2 = obj;
            }
        }
        int i19 = 0;
        while (i19 < i) {
            cArr5[i19] = (char) (cArr5[i19] ^ 13722);
            i19++;
            $11 = ($10 + 45) % 128;
        }
        objArr[0] = new java.lang.String(cArr5);
    }

    private static android.content.SharedPreferences ah_() {
        getProfileVersion = (IccPrivateKeyCrtComponentsJson + 115) % 128;
        android.content.Context context = (android.content.Context) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], -1451542343, 1451542366, (int) java.lang.System.currentTimeMillis());
        java.lang.Object[] objArr = new java.lang.Object[1];
        d((byte) (44 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), "\u0002\n㘃㘃\f\u0001\u0003\n\t\u0001\t\u000e\t\u0001\f\u000b\u0001\r", android.text.TextUtils.getOffsetBefore("", 0) + 18, objArr);
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences(((java.lang.String) objArr[0]).intern(), 0);
        int i = IccPrivateKeyCrtComponentsJson + 83;
        getProfileVersion = i % 128;
        if (i % 2 == 0) {
            return sharedPreferences;
        }
        throw new java.lang.ArithmeticException();
    }

    static com.payair.hce.suspendCardForToken AlternateContactlessPaymentDataJson() {
        int i = IccPrivateKeyCrtComponentsJson + 7;
        getProfileVersion = i % 128;
        if (i % 2 == 0) {
            getProfileVersion();
            return com.payair.hce.suspendCardForToken.valueOf;
        }
        getProfileVersion();
        com.payair.hce.suspendCardForToken suspendcardfortoken = com.payair.hce.suspendCardForToken.valueOf;
        throw new java.lang.ArithmeticException();
    }

    static boolean valueOf() {
        int i = getProfileVersion + 89;
        IccPrivateKeyCrtComponentsJson = i % 128;
        if (i % 2 == 0) {
            writeReplace.RecordsJson();
            throw null;
        }
        return writeReplace.RecordsJson().equalsIgnoreCase(org.apache.commons.imaging.formats.pnm.PnmImageParser.PARAM_VALUE_PNM_RAWBITS_YES);
    }

    static void init$2() {
        $$g = new byte[]{78, 115, -79, 115};
        $$h = 151;
    }

    static void init$1() {
        $$d = new byte[]{com.google.common.base.Ascii.ESC, -102, com.google.common.base.Ascii.SI, 46, -13, 1, 62, -67, 14, -25, com.google.common.base.Ascii.ETB, -9, -10, 67, -59, 4, -3, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, -58, 1, com.visa.cbp.getEncExpo.onUnminimized, 32, -19, 1, -19, 2, 8, -12, -6, 33, -25, -4, 13, com.google.common.base.Ascii.DC4, -12, -10, com.google.common.base.Ascii.SI, -15, -13, 1, 62, -67, 14, -25, com.google.common.base.Ascii.ETB, -9, -10, 67, -59, 4, -3, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, -66, -2, 10, -10, com.google.common.base.Ascii.RS, -36, 46, -48, com.google.common.base.Ascii.FF, 3, -20, 14, 32, -30, -20, 18, -2, 0, -19, 13, -44, -9, 14, -14, 3, com.google.common.base.Ascii.FF, -20, 14, 33, -45, 0, -7, 18, -3, -18, 7, 6, -15, -1, 34, -18, -25, com.google.common.base.Ascii.VT, 7, -10, -7, 47, -30, -20, 18, com.google.common.base.Ascii.SYN, -42, 3, 0};
        $$e = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PIN_VALUE;
    }

    static void writeReplace() {
        DigitizedCardProfile = new char[]{12388, 12325, 12290, 12346, 12320, 12344, 12333, 12324, 12348, 12312, 12326, 12350, 12329, 12327, 12321, 12331, 12323, 12322, 12345, 12389, 12339, 12334, 12335, 12297, 12313};
        getAid = (char) 1493;
    }

    static void DigitizedCardProfile() {
        int i = IccPrivateKeyCrtComponentsJson;
        getProfileVersion = (i + 63) % 128;
        AlternateContactlessPaymentDataJson = new char[]{12318, 12294, 12309, 12319, 12290, 12312, 12299, 12289, 12297, 12313, 12300, 12314, 12288, 12303, 12317, 12292};
        values = (char) 1492;
        int i2 = i + 73;
        getProfileVersion = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    static void init$0() {
        $$a = new byte[]{76, 91, 9, -2, 45, 10, -13, com.google.common.base.Ascii.SI, -2, -11, com.google.common.base.Ascii.NAK, -13, -32, 46, 1, 8, -17, 4, 19, -6, -5, 16, 2, -33, 19, com.google.common.base.Ascii.SUB, -10, -6, com.google.common.base.Ascii.VT, 8, -46, com.google.common.base.Ascii.US, com.google.common.base.Ascii.NAK, -17, -21, 43, -2, 1, 19, 9, -38, 46, 5, -11, -34, 45, 10, -13, com.google.common.base.Ascii.SI, -2, -11, com.google.common.base.Ascii.NAK, -13, -32, 46, 1, 8, -17, 4, 19, -6, -5, 16, 2, -33, 19, com.google.common.base.Ascii.SUB, -10, -6, com.google.common.base.Ascii.VT, 8, -46, com.google.common.base.Ascii.US, com.google.common.base.Ascii.NAK, -17, -22, 38, 5, -2};
        $$b = 231;
    }
}
