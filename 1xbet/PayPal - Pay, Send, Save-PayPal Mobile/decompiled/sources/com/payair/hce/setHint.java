package com.payair.hce;

/* loaded from: classes4.dex */
public class setHint implements com.payair.hce.setLineHeight {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static int DigitizedCardProfile;
    private static byte[] IccPrivateKeyCrtComponentsJson;
    private static char[] RecordsJson;
    private static short[] SdkCoreAlternateContactlessPaymentDataImpl;
    private static char getAid;
    private static int getGpoResponse;
    private static int getPaymentFci;
    private static int getProfileVersion;
    private static int values;
    private boolean AlternateContactlessPaymentDataJson;
    private int valueOf;
    private com.payair.hce.setHighlights writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, byte b, int i, java.lang.Object[] objArr) {
        int i2;
        int i3 = 39 - (b * 2);
        int i4 = 718 - s;
        byte[] bArr = $$a;
        char[] cArr = new char[35 - i];
        if (bArr == null) {
            int i5 = i3;
            int i6 = 0;
            i4 = (i3 + i4) - 2;
            i3 = i5;
            i2 = i6;
            int i7 = i3 + 1;
            cArr[i2] = (char) i4;
            if (i2 == 34 - i) {
                objArr[0] = new java.lang.String(cArr);
                return;
            }
            byte b2 = bArr[i7];
            i3 = i4;
            i4 = b2;
            i6 = i2 + 1;
            i5 = i7;
            i4 = (i3 + i4) - 2;
            i3 = i5;
            i2 = i6;
            int i72 = i3 + 1;
            cArr[i2] = (char) i4;
            if (i2 == 34 - i) {
            }
        } else {
            i2 = 0;
            int i722 = i3 + 1;
            cArr[i2] = (char) i4;
            if (i2 == 34 - i) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:4:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(short s, short s2, int i, java.lang.Object[] objArr) {
        int i2;
        int i3 = 104 - i;
        int i4 = 4 - (s * 3);
        int i5 = s2 * 3;
        byte[] bArr = $$d;
        byte[] bArr2 = new byte[i5 + 1];
        if (bArr == null) {
            int i6 = i3;
            i2 = 0;
            i3 = i5;
            i4++;
            i3 += i6;
            bArr2[i2] = (byte) i3;
            if (i2 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i2++;
            i6 = bArr[i4];
            i4++;
            i3 += i6;
            bArr2[i2] = (byte) i3;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            if (i2 == i5) {
            }
        }
    }

    setHint(boolean z, int i, com.payair.hce.setHighlights sethighlights) {
        this.AlternateContactlessPaymentDataJson = z;
        this.valueOf = i;
        this.writeReplace = sethighlights;
    }

    @Override // com.payair.hce.setTitleTextAppearance
    public final com.payair.hce.setEms RecordsJson() throws java.io.IOException {
        int i = getPaymentFci + 83;
        getGpoResponse = i % 128;
        com.payair.hce.setHighlights sethighlights = this.writeReplace;
        if (i % 2 != 0) {
            return sethighlights.DigitizedCardProfile(this.AlternateContactlessPaymentDataJson, this.valueOf);
        }
        sethighlights.DigitizedCardProfile(this.AlternateContactlessPaymentDataJson, this.valueOf);
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.setShadowLayer
    public final com.payair.hce.setEms getAid() {
        getPaymentFci = (getGpoResponse + 83) % 128;
        try {
            com.payair.hce.setEms RecordsJson2 = RecordsJson();
            getGpoResponse = (getPaymentFci + 41) % 128;
            return RecordsJson2;
        } catch (java.io.IOException e) {
            throw new com.payair.hce.setLines(e.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, int i3, byte b, short s, java.lang.Object[] objArr) {
        long j;
        int i4;
        int i5;
        com.payair.hce.getTrack2ConstructionData gettrack2constructiondata = new com.payair.hce.getTrack2ConstructionData();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        try {
            java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(DigitizedCardProfile)};
            java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
            if (obj == null) {
                obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 27, (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 29, (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj);
            }
            int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
            boolean z = intValue == -1;
            long j2 = 0;
            if (z) {
                byte[] bArr = IccPrivateKeyCrtComponentsJson;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    $10 = ($11 + 115) % 128;
                    int i6 = 0;
                    while (i6 < length) {
                        $11 = ($10 + 83) % 128;
                        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(bArr[i6])};
                        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609478628);
                        if (obj2 == null) {
                            obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(31 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), 5088 - android.view.View.resolveSizeAndState(0, 0, 0), (char) (1 - (android.os.SystemClock.elapsedRealtimeNanos() > j2 ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == j2 ? 0 : -1))))).getMethod("e", java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609478628, obj2);
                        }
                        bArr2[i6] = ((java.lang.Byte) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).byteValue();
                        i6++;
                        j2 = 0;
                    }
                    bArr = bArr2;
                }
                if (bArr == null) {
                    j = -4897270311952305750L;
                    intValue = (short) (((short) (SdkCoreAlternateContactlessPaymentDataImpl[i2 + ((int) (values ^ (-4897270311952305750L)))] ^ (-4897270311952305750L))) + ((int) (DigitizedCardProfile ^ (-4897270311952305750L))));
                    if (intValue > 0) {
                        int i7 = (int) (values ^ j);
                        if (z) {
                            $10 = ($11 + 25) % 128;
                            i5 = 1;
                        } else {
                            i5 = 0;
                        }
                        gettrack2constructiondata.writeReplace = ((i2 + intValue) - 2) + i7 + i5;
                        java.lang.Object[] objArr4 = {gettrack2constructiondata, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(getProfileVersion), sb};
                        java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-500696024);
                        if (obj3 == null) {
                            java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 27, (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 2364, (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                            java.lang.Object[] objArr5 = new java.lang.Object[1];
                            d((short) 0, (short) 0, 0, objArr5);
                            obj3 = cls.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-500696024, obj3);
                        }
                        ((java.lang.StringBuilder) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).append(gettrack2constructiondata.values);
                        gettrack2constructiondata.AlternateContactlessPaymentDataJson = gettrack2constructiondata.values;
                        byte[] bArr3 = IccPrivateKeyCrtComponentsJson;
                        if (bArr3 != null) {
                            int length2 = bArr3.length;
                            byte[] bArr4 = new byte[length2];
                            for (int i8 = 0; i8 < length2; i8++) {
                                bArr4[i8] = (byte) (bArr3[i8] ^ (-4897270311952305750L));
                            }
                            bArr3 = bArr4;
                        }
                        boolean z2 = bArr3 != null;
                        gettrack2constructiondata.DigitizedCardProfile = 1;
                        while (gettrack2constructiondata.DigitizedCardProfile < intValue) {
                            int i9 = $10;
                            $11 = (i9 + 79) % 128;
                            if (z2) {
                                $11 = (i9 + 57) % 128;
                                byte[] bArr5 = IccPrivateKeyCrtComponentsJson;
                                gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace - 1;
                                gettrack2constructiondata.values = (char) (gettrack2constructiondata.AlternateContactlessPaymentDataJson + (((byte) (((byte) (bArr5[r7] ^ (-4897270311952305750L))) + s)) ^ b));
                            } else {
                                short[] sArr = SdkCoreAlternateContactlessPaymentDataImpl;
                                gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace - 1;
                                gettrack2constructiondata.values = (char) (gettrack2constructiondata.AlternateContactlessPaymentDataJson + (((short) (((short) (sArr[r7] ^ (-4897270311952305750L))) + s)) ^ b));
                            }
                            sb.append(gettrack2constructiondata.values);
                            gettrack2constructiondata.AlternateContactlessPaymentDataJson = gettrack2constructiondata.values;
                            gettrack2constructiondata.DigitizedCardProfile++;
                        }
                    }
                    java.lang.String obj4 = sb.toString();
                    i4 = $10 + 99;
                    $11 = i4 % 128;
                    if (i4 % 2 != 0) {
                        throw null;
                    }
                    objArr[0] = obj4;
                    return;
                }
                byte[] bArr6 = IccPrivateKeyCrtComponentsJson;
                java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(values)};
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
                if (obj5 == null) {
                    obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTouchSlop() >> 8) + 27, android.view.View.getDefaultSize(0, 0) + 29, (char) (android.os.Process.myTid() >> 22))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj5);
                }
                intValue = (byte) (((byte) (bArr6[((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(null, objArr6)).intValue()] ^ (-4897270311952305750L))) + ((int) (DigitizedCardProfile ^ (-4897270311952305750L))));
            }
            j = -4897270311952305750L;
            if (intValue > 0) {
            }
            java.lang.String obj42 = sb.toString();
            i4 = $10 + 99;
            $11 = i4 % 128;
            if (i4 % 2 != 0) {
            }
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private static void c(java.lang.String str, int i, byte b, java.lang.Object[] objArr) {
        int i2;
        int length;
        char[] cArr;
        int i3 = $10 + 97;
        $11 = i3 % 128;
        int i4 = 2;
        if (i3 % 2 == 0) {
            throw null;
        }
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.DigitizedCardJson12 digitizedCardJson12 = new com.payair.hce.DigitizedCardJson12();
        char[] cArr2 = RecordsJson;
        if (cArr2 != null) {
            int i5 = $10 + 73;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                length = cArr2.length;
                cArr = new char[length];
            } else {
                length = cArr2.length;
                cArr = new char[length];
            }
            int i6 = 0;
            while (i6 < length) {
                int i7 = $10 + 117;
                $11 = i7 % 128;
                if (i7 % i4 == 0) {
                    try {
                        java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr2[i6])};
                        java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
                        if (obj == null) {
                            java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), 2508 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) ((android.view.ViewConfiguration.getTouchSlop() >> 8) + 6802));
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            d((short) 0, (short) 0, 39, objArr3);
                            obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj);
                        }
                        cArr[i6] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr2[i6])};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - android.widget.ExpandableListView.getPackedPositionChild(0L), android.graphics.Color.blue(0) + 2508, (char) ((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 6802));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        d((short) 0, (short) 0, 39, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj2);
                    }
                    cArr[i6] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                    i6++;
                }
                i4 = 2;
            }
            cArr2 = cArr;
        }
        java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(getAid)};
        java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
        if (obj3 == null) {
            java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 49, 2508 - android.widget.ExpandableListView.getPackedPositionType(0L), (char) (6802 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16)));
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            d((short) 0, (short) 0, 39, objArr7);
            obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj3);
        }
        char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).charValue();
        char[] cArr3 = new char[i];
        if (i % 2 != 0) {
            int i8 = $11 + 77;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                i2 = i + 94;
                cArr3[i2] = (char) (charArray[i2] >> b);
            } else {
                i2 = i - 1;
                cArr3[i2] = (char) (charArray[i2] - b);
            }
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            digitizedCardJson12.values = 0;
            while (digitizedCardJson12.values < i2) {
                digitizedCardJson12.valueOf = charArray[digitizedCardJson12.values];
                digitizedCardJson12.writeReplace = charArray[digitizedCardJson12.values + 1];
                if (digitizedCardJson12.valueOf == digitizedCardJson12.writeReplace) {
                    cArr3[digitizedCardJson12.values] = (char) (digitizedCardJson12.valueOf - b);
                    cArr3[digitizedCardJson12.values + 1] = (char) (digitizedCardJson12.writeReplace - b);
                } else {
                    java.lang.Object[] objArr8 = {digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12};
                    java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1553139325);
                    if (obj4 == null) {
                        obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - android.view.KeyEvent.keyCodeFromString(""), android.os.Process.getGidForName("") + 3597, (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)))).getMethod(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1553139325, obj4);
                    }
                    if (((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr8)).intValue() == digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl) {
                        $11 = ($10 + 113) % 128;
                        java.lang.Object[] objArr9 = {digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), java.lang.Integer.valueOf(charValue), digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12};
                        java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(737480198);
                        if (obj5 == null) {
                            java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), 2665 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (char) (android.widget.ExpandableListView.getPackedPositionType(0L) + 18889));
                            java.lang.Object[] objArr10 = new java.lang.Object[1];
                            d((short) 0, (short) 0, 31, objArr10);
                            obj5 = cls4.getMethod((java.lang.String) objArr10[0], java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(737480198, obj5);
                        }
                        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(null, objArr9)).intValue();
                        int i9 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                        int i10 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                        cArr3[digitizedCardJson12.values] = cArr2[intValue];
                        cArr3[digitizedCardJson12.values + 1] = cArr2[(i9 * charValue) + i10];
                    } else if (digitizedCardJson12.DigitizedCardProfile == digitizedCardJson12.AlternateContactlessPaymentDataJson) {
                        $11 = ($10 + 85) % 128;
                        digitizedCardJson12.RecordsJson = ((digitizedCardJson12.RecordsJson + charValue) - 1) % charValue;
                        digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl = ((digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl + charValue) - 1) % charValue;
                        int i11 = digitizedCardJson12.DigitizedCardProfile;
                        int i12 = digitizedCardJson12.RecordsJson;
                        int i13 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                        int i14 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                        cArr3[digitizedCardJson12.values] = cArr2[(i11 * charValue) + i12];
                        cArr3[digitizedCardJson12.values + 1] = cArr2[(i13 * charValue) + i14];
                    } else {
                        int i15 = digitizedCardJson12.DigitizedCardProfile;
                        int i16 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                        int i17 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                        int i18 = digitizedCardJson12.RecordsJson;
                        cArr3[digitizedCardJson12.values] = cArr2[(i15 * charValue) + i16];
                        cArr3[digitizedCardJson12.values + 1] = cArr2[(i17 * charValue) + i18];
                    }
                }
                digitizedCardJson12.values += 2;
            }
        }
        for (int i19 = 0; i19 < i; i19++) {
            cArr3[i19] = (char) (cArr3[i19] ^ 13722);
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        getPaymentFci = 0;
        getGpoResponse = 1;
        values = 132988973;
        DigitizedCardProfile = 520368588;
        getProfileVersion = 366800197;
        IccPrivateKeyCrtComponentsJson = new byte[]{19, 0, Byte.MAX_VALUE, 2, com.google.common.base.Ascii.FS, 33, com.google.common.base.Ascii.ESC, 106, 8, 106, 64, 98, 60, 18, 10, 99, 2, com.google.common.base.Ascii.US, -56, 68, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.NAK, 18, 1, com.google.common.base.Ascii.EM, 2, -36, 89, 6, 2, com.google.common.base.Ascii.DC4, -42, 78, 17, 3, -37, 65, 98, 60, 18, -38, 65, 98, 60, 18, -38, 83, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, 92, 41, 86, 3, 56, -107, 41, 36, 92, 41, 86, 35, com.google.common.base.Ascii.CAN, 101, -86, 85, 80, 33, 89, 32, 35, Byte.MAX_VALUE, 116, -46, 41, 97, -47, 115, 101, 74, com.google.common.base.Ascii.SI, 120, 41, 80, -29, -116, -126, -26, -87, -4, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, -31, -19, -28, -25, -85, -74, -108, 86, -31, -102, 85, -10, 116, -88, -109, -90, -116, -85, 87, -82, -87, -99, -8, -116, 82, -82, -33, com.google.common.base.Ascii.ETB, -109, -102, -94, -109, -88, com.visa.cbp.getEncExpo.registerForActivityResult, -26, 71, 84, 87, -82, -101, -93, -98, 8, -44, com.google.common.base.Ascii.SYN, 108, 6, 124, 108, -56, -46, 39, 94, 87, 44, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, 0, 99, 93, 41, 81, com.google.common.base.Ascii.CAN, 105, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, 83, 107, 122, -10, 106, com.visa.cbp.getEncExpo.kernelVersion, -60, -67, -67, -85, -30, -4, -32, -106, -23, -32, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, -81, 45, -85, -99, -13, -18, -109, -1, 35, 93, -21, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, -82, -17, -107, -29, -6, -53, -119, -72, -71, -70, 117, -83, 74, com.visa.cbp.getEncExpo.IResultReceiver2, -74, -91, 75, 110, -126, -91, 125, -83, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, 113, -90, com.google.common.base.Ascii.FF, -44, -35, 2, com.google.common.base.Ascii.ESC, 60, 32, 6, -33, com.google.common.base.Ascii.SI, -44, com.visa.cbp.getEncExpo.IResultReceiver2, -55, com.google.common.base.Ascii.EM, 40, -89, com.visa.cbp.getEncExpo.onUnminimized, -88, -3, -89, 94, -98, 88, -12, -9, -9, 81, -59, -84, -12, -3, 83, -125, 88, -30, -81, -10, -69, -83, -67, 48, -94, -95, -67, -28, -11, -12, -9, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, -8, -89, 102, 102, -39, 98, com.google.common.base.Ascii.CAN, 57, -52, 110, -42, 74, com.google.common.base.Ascii.ESC, 46, 108, -33, com.google.common.base.Ascii.EM, -51, com.visa.cbp.getEncExpo.onUnminimized, 59, -57, -50, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.FS, com.visa.cbp.getEncExpo.startTransaction, com.google.common.base.Ascii.US, 45, -54, 91, -57, -50, com.google.common.base.Ascii.SYN, -57, com.google.common.base.Ascii.FS, -51, 42, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.ESC, 18, com.visa.cbp.getEncExpo.kernelVersion, com.google.common.base.Ascii.ETB, -62, -7, 42, 10, -12, 2, 2, -47, com.google.common.base.Ascii.ETB, 0, -2, -2, 2, 4, -33, 36, -9, -86, -86, -86, -86, -86, -86, -86, -86, -86, -86, -86, -86, -86, -86, -86, -86, -86, -86, -86, -86, -86};
        RecordsJson = new char[]{12320, 12350, 12402, 12319, 12388, 12351, 12332, 12348, 12334, 12322, 12330, 12344, 13264, 12318, 12331, 12339, 12346, 12329, 12391, 12394, 12389, 12327, 12324, 12345, 12321, 12338, 12328, 12335, 12333, 12300, 12400, 12323, 12325, 12352, 12326, 12309};
        getAid = (char) 1494;
    }

    static void init$1() {
        $$d = new byte[]{com.google.common.base.Ascii.SI, -9, -99, 67};
        $$e = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x1ae0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x1ae1  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x20fb A[RETURN] */
    /* JADX WARN: Type inference failed for: r10v100 */
    /* JADX WARN: Type inference failed for: r10v108 */
    /* JADX WARN: Type inference failed for: r10v127 */
    /* JADX WARN: Type inference failed for: r10v92, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v93 */
    /* JADX WARN: Type inference failed for: r10v94 */
    /* JADX WARN: Type inference failed for: r10v95 */
    /* JADX WARN: Type inference failed for: r10v96 */
    /* JADX WARN: Type inference failed for: r10v97 */
    /* JADX WARN: Type inference failed for: r1v409 */
    /* JADX WARN: Type inference failed for: r1v416 */
    /* JADX WARN: Type inference failed for: r1v729 */
    /* JADX WARN: Type inference failed for: r4v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v289 */
    /* JADX WARN: Type inference failed for: r4v382 */
    /* JADX WARN: Type inference failed for: r4v398 */
    /* JADX WARN: Type inference failed for: r4v464 */
    /* JADX WARN: Type inference failed for: r5v194, types: [java.lang.reflect.Field] */
    /* JADX WARN: Type inference failed for: r5v20, types: [java.lang.reflect.Field] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.Object[] DigitizedCardProfile(android.content.Context context, int i, int i2, int i3) {
        java.lang.Integer num;
        java.lang.Integer num2;
        int i4;
        char c;
        java.lang.Object[] objArr;
        int i5;
        java.lang.Integer num3;
        java.lang.Object[] objArr2;
        char c2;
        java.lang.Integer num4;
        java.lang.Object[] objArr3;
        int i6;
        java.lang.Object[] objArr4;
        int i7;
        char c3;
        java.lang.Object[] objArr5;
        java.lang.Integer num5;
        int i8;
        java.lang.String str;
        java.lang.Integer num6;
        java.lang.Process exec;
        java.lang.Throwable th;
        java.lang.Throwable th2;
        java.lang.Integer num7;
        java.lang.Throwable th3;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.Integer num8;
        java.lang.String str5;
        java.lang.Integer num9;
        java.lang.String str6;
        java.lang.String str7;
        long j;
        java.lang.Object[] objArr6;
        int i9;
        java.lang.Object[] objArr7;
        int i10;
        java.lang.Object[] objArr8;
        int i11;
        int i12 = i;
        java.lang.Object[] objArr9 = new java.lang.Object[1];
        a((-181984398) - android.view.View.resolveSizeAndState(0, 0, 0), (-417952037) - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (-68) - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (byte) ((-102) - android.text.TextUtils.indexOf("", "")), (short) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 100), objArr9);
        java.lang.String intern = ((java.lang.String) objArr9[0]).intern();
        java.lang.Object[] objArr10 = new java.lang.Object[1];
        a((-181984395) - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), android.view.MotionEvent.axisFromString("") - 417952003, (-94) - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (byte) ((-31) - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), (short) (70 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0)), objArr10);
        java.lang.String intern2 = ((java.lang.String) objArr10[0]).intern();
        java.lang.Object[] objArr11 = new java.lang.Object[1];
        a((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 181984389, (-417951995) - android.view.Gravity.getAbsoluteGravity(0, 0), (-86) - android.view.KeyEvent.getDeadChar(0, 0), (byte) (android.text.TextUtils.getOffsetBefore("", 0) + 79), (short) (android.view.Gravity.getAbsoluteGravity(0, 0) - 65), objArr11);
        java.lang.String intern3 = ((java.lang.String) objArr11[0]).intern();
        java.lang.Integer num10 = -1347122530;
        try {
            if (context == null) {
                java.lang.Object[] objArr12 = new java.lang.Object[1];
                a(android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 56560, (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) - 417952135, (-90) - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (byte) (-android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), (short) (79 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16)), objArr12);
                java.lang.Object[] objArr13 = {((java.lang.String) objArr12[0]).intern()};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-604620973);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myTid() >> 22) + 36, 3161 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (android.graphics.Color.rgb(0, 0, 0) + 16810315));
                    java.lang.Object[] objArr14 = new java.lang.Object[1];
                    b((short) ($$b | com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PUSH_ATC_OUT_SIDE_PERMISSIBLE_RANGE), (byte) (-$$a[52]), 34, objArr14);
                    obj = cls.getMethod((java.lang.String) objArr14[0], java.lang.String.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-604620973, obj);
                }
                long j2 = ~((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr13)).longValue();
                long j3 = i12;
                long j4 = ~j3;
                long j5 = ((r9 * (-864)) - 878802063278L) + (((~(j4 | 1014782982)) | j2) * (-865)) + ((~((-1014782983) | j3)) * 865) + (((~(j2 | j4)) | (~((-1014782983) | j4))) * 865) + 1922253721;
                int i13 = (int) (j5 >> 32);
                int i14 = ~i12;
                if (((i13 & ((((~(1938890116 | i14)) | 71598160 | (~((-918850769) | i14))) * (-397)) + 1848832630 + ((1163235668 | i12) * 397))) | (((int) j5) & (((((-8471953) | i12) * (-676)) - 923138231) + (((~(2137666149 | i14)) | 8471952) * 676) + (((~((-720074737) | i14)) | 711602784 | (~(2146138101 | i12))) * 676)))) != 0) {
                    objArr6 = new java.lang.Object[]{new int[]{i12}, new int[]{i12 ^ 50}, null, null, new int[1]};
                    java.lang.Object[] objArr15 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((~((-34687489) | i12)) * 623) + 687662528 + ((537400392 | i14) * (-623)) + (((~((-263711521) | i12)) | 34687488 | (~(766424424 | i12))) * 623))};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num10);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.text.TextUtils.getTrimmedLength(""), 2713 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) android.graphics.Color.green(0));
                        j = j3;
                        java.lang.Object[] objArr16 = new java.lang.Object[1];
                        b((short) 653, (byte) (-$$a[52]), r8[41], objArr16);
                        obj2 = cls2.getMethod((java.lang.String) objArr16[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num10, obj2);
                    } else {
                        j = j3;
                    }
                    i9 = 0;
                    ((int[]) objArr6[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr15)).intValue();
                } else {
                    j = j3;
                    objArr6 = new java.lang.Object[]{new int[]{i12}, new int[]{i12}, null, null, new int[1]};
                    java.lang.Object[] objArr17 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf((((~((-981091559) | i14)) | 49044386) * 226) + 588891264 + (((~((-49044387) | i12)) | 8657664 | (~((-940704837) | i14))) * (-113)) + ((~((-981091559) | i12)) * 113))};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num10);
                    if (obj3 == null) {
                        java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 50, 2713 - android.widget.ExpandableListView.getPackedPositionType(0L), (char) android.view.View.resolveSizeAndState(0, 0, 0));
                        java.lang.Object[] objArr18 = new java.lang.Object[1];
                        b((short) 653, (byte) (-$$a[52]), r8[41], objArr18);
                        obj3 = cls3.getMethod((java.lang.String) objArr18[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num10, obj3);
                    }
                    i9 = 0;
                    ((int[]) objArr6[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr17)).intValue();
                }
                if (((int[]) objArr6[1])[i9] != i12) {
                    return objArr6;
                }
                java.lang.Object[] objArr19 = new java.lang.Object[1];
                c("\u0015\u0012\u0011\u0015\u0003\u0019\u0016\u0015\n\r\b!\u0015\u001c\u0005\u001d\u0011\u000f\u000f\u001d", 20 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (byte) (android.view.View.MeasureSpec.getSize(i9) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE), objArr19);
                java.lang.Object[] objArr20 = {((java.lang.String) objArr19[i9]).intern()};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-604620973);
                if (obj4 == null) {
                    java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(35 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), android.text.TextUtils.getOffsetAfter("", 0) + 3161, (char) (android.graphics.Color.alpha(0) + 33099));
                    java.lang.Object[] objArr21 = new java.lang.Object[1];
                    b((short) ($$b | com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PUSH_ATC_OUT_SIDE_PERMISSIBLE_RANGE), (byte) (-$$a[52]), 34, objArr21);
                    obj4 = cls4.getMethod((java.lang.String) objArr21[0], java.lang.String.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-604620973, obj4);
                }
                long longValue = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr20)).longValue();
                long j6 = 549559169 | j4;
                long j7 = (((-494) * longValue) - 271482229486L) + ((~(longValue | 549559169)) * (-495)) + (495 * j6) + (((~((~longValue) | (-549559170))) | (~j6)) * 495) + 357911569;
                if (((((int) (j7 >> 32)) & ((((~(188960846 | i12)) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING) - 97674602) + (((~(188960846 | i14)) | 172163148) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING))) | (((int) j7) & ((((1367966225 | i12) * 614) - 1454525041) + (((~(1393650653 | i14)) | 8945664 | (~((-43575757) | i14))) * (-1228)) + (((~(1402596317 | i14)) | (~((-34630093) | i14))) * 614)))) != 0) {
                    objArr7 = new java.lang.Object[]{new int[]{i12}, new int[]{i12 ^ 60}, null, null, new int[1]};
                    java.lang.Object[] objArr22 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~(542259029 | i12)) | 486819874) * (-140)) + 1518355260 + ((~(1029078903 | i12)) * 70) + (((~(487876915 | i12)) | 1028021862) * 70))};
                    java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num10);
                    if (obj5 == null) {
                        java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 2713 - android.view.KeyEvent.getDeadChar(0, 0), (char) android.view.KeyEvent.getDeadChar(0, 0));
                        java.lang.Object[] objArr23 = new java.lang.Object[1];
                        b((short) 653, (byte) (-$$a[52]), r6[41], objArr23);
                        obj5 = cls5.getMethod((java.lang.String) objArr23[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num10, obj5);
                    }
                    i10 = 0;
                    ((int[]) objArr7[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(null, objArr22)).intValue();
                } else {
                    objArr7 = new java.lang.Object[]{new int[]{i12}, new int[]{i12}, null, null, new int[1]};
                    java.lang.Object[] objArr24 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf((((((~((-392323609) | i14)) | 291651592) | (~(637812336 | i14))) * (-397)) - 1761173592) + ((828791912 | i12) * 397))};
                    java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num10);
                    if (obj6 == null) {
                        java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.Gravity.getAbsoluteGravity(0, 0), (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2712, (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                        java.lang.Object[] objArr25 = new java.lang.Object[1];
                        b((short) 653, (byte) (-$$a[52]), r6[41], objArr25);
                        obj6 = cls6.getMethod((java.lang.String) objArr25[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num10, obj6);
                    }
                    i10 = 0;
                    ((int[]) objArr7[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj6).invoke(null, objArr24)).intValue();
                }
                if (((int[]) objArr7[1])[i10] != i12) {
                    return objArr7;
                }
                java.lang.Object[] objArr26 = new java.lang.Object[1];
                a((-181984448) - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (-417952124) - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), android.graphics.Color.green(i10) - 66, (byte) ((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 117), (short) ((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) - 48), objArr26);
                java.lang.Object[] objArr27 = {((java.lang.String) objArr26[0]).intern()};
                java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                if (obj7 == null) {
                    java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 36, (android.view.KeyEvent.getMaxKeyCode() >> 16) + 3161, (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 33098));
                    byte[] bArr = $$a;
                    java.lang.Object[] objArr28 = new java.lang.Object[1];
                    b((short) 612, bArr[14], bArr[49], objArr28);
                    obj7 = cls7.getMethod((java.lang.String) objArr28[0], java.lang.String.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, obj7);
                }
                long longValue2 = ((java.lang.Long) ((java.lang.reflect.Method) obj7).invoke(null, objArr27)).longValue();
                long j8 = ~(972051786 | longValue2);
                long j9 = (((-69) * longValue2) - 69015676877L) + (((~(longValue2 | j)) | j8) * (-140)) + ((~((-972051787) | longValue2 | j)) * 70) + (((~((~longValue2) | (-972051787))) | j8 | (~(j | (-972051787)))) * 70) + 1967486690;
                if (((((int) (j9 >> 32)) & (((((-32777) | i12) * (-381)) - 910478110) + (((~((-73569375) | i14)) | 1584299607) * 381) + 12487656)) | (((int) j9) & ((((~(929438588 | i14)) | (-2012192766)) * (-160)) + 348159509 + (((~((-1928302298) | i14)) | 929438588) * 160)))) != 0) {
                    objArr8 = new java.lang.Object[]{new int[]{i12}, new int[]{i12 ^ 80}, null, null, new int[1]};
                    java.lang.Object[] objArr29 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~((-158355519) | i14)) | 24137738 | (~((-871780427) | i14))) * (-1136)) + 2031799880 + (((~((-158355519) | i12)) | (~((-871780427) | i12)) | (~(1005998206 | i14))) * (-568)) + (((~(158355518 | i14)) | (~(871780426 | i14)) | (~((-24137739) | i12))) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PUSH_INVALID_CONVERSATION))};
                    java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num10);
                    if (obj8 == null) {
                        java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "", 0, 0) + 50, (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 2714, (char) (android.os.Process.myTid() >> 22));
                        java.lang.Object[] objArr30 = new java.lang.Object[1];
                        b((short) 653, (byte) (-$$a[52]), r7[41], objArr30);
                        obj8 = cls8.getMethod((java.lang.String) objArr30[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num10, obj8);
                    }
                    i11 = 0;
                    ((int[]) objArr8[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj8).invoke(null, objArr29)).intValue();
                } else {
                    objArr8 = new java.lang.Object[]{new int[]{i12}, new int[]{i12}, null, null, new int[1]};
                    java.lang.Object[] objArr31 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf((((~(669709626 | i12)) | (-360426319)) * (-465)) + 875928358 + (((~((-360426319) | i12)) | 669709626) * 930) + (((-269552197) | i12) * 465))};
                    java.lang.Object obj9 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num10);
                    if (obj9 == null) {
                        java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.text.TextUtils.getTrimmedLength(""), 2712 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) android.view.KeyEvent.keyCodeFromString(""));
                        java.lang.Object[] objArr32 = new java.lang.Object[1];
                        b((short) 653, (byte) (-$$a[52]), r7[41], objArr32);
                        obj9 = cls9.getMethod((java.lang.String) objArr32[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num10, obj9);
                    }
                    i11 = 0;
                    ((int[]) objArr8[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj9).invoke(null, objArr31)).intValue();
                }
                if (((int[]) objArr8[1])[i11] != i12) {
                    return objArr8;
                }
                java.lang.Object[] objArr33 = new java.lang.Object[1];
                c("\u001a\u000e\r\u0002\u0014\u001a\u000e\u0014\u0002\r\u0017\u000e!\u0014\u0005\u0010#!\u0015\u001c\u0002\u0010\u0014\n\b# \u0007\u0002\n\u0002\u0011\u0004\n\u0016\u0011\u000f\f\u001a\u0015\t\u0013", 42 - android.text.TextUtils.getOffsetBefore("", i11), (byte) (android.view.KeyEvent.getDeadChar(i11, i11) + 67), objArr33);
                java.lang.Object[] objArr34 = {((java.lang.String) objArr33[i11]).intern()};
                java.lang.Object obj10 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                if (obj10 == null) {
                    java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(35 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), 3160 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 33098));
                    byte[] bArr2 = $$a;
                    java.lang.Object[] objArr35 = new java.lang.Object[1];
                    b((short) 612, bArr2[14], bArr2[49], objArr35);
                    obj10 = cls10.getMethod((java.lang.String) objArr35[0], java.lang.String.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, obj10);
                }
                long longValue3 = ((java.lang.Long) ((java.lang.reflect.Method) obj10).invoke(null, objArr34)).longValue();
                long j10 = ~longValue3;
                long j11 = ((-932) * longValue3) + 304131214190L + (((~(j4 | (-325622286))) | j10) * (-933)) + (((~(j10 | 325622285)) | (~(j10 | j4))) * 933) + ((~(longValue3 | 325622285)) * 933) + 669812618;
                int i15 = (int) (j11 >> 32);
                int i16 = ~(1428156907 | i12);
                if (((i15 & ((((~((-268502179) | i14)) | (~(895989162 | i12))) * (-302)) + 642889046 + ((~((-268502179) | i12)) * (-604)) + (((~(627486984 | i12)) | 86249736) * 302))) | (((int) j11) & ((((672129 | i16) * (-196)) - 1919631375) + ((i16 | 1427484778) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE)))) != 0) {
                    java.lang.Object[] objArr36 = {new int[]{i12}, new int[]{i12 ^ 90}, null, null, new int[1]};
                    java.lang.Object[] objArr37 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~((-1044271898) | i14)) | (~((-14135953) | i12))) * com.visa.cbp.getCertUsage.getODAData) + 767640499 + (((~(i12 | (-1044271898))) | (~(i14 | (-14135953)))) * com.visa.cbp.getCertUsage.getODAData))};
                    java.lang.Object obj11 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num10);
                    if (obj11 == null) {
                        java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.View.combineMeasuredStates(0, 0), android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 2665, (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16));
                        java.lang.Object[] objArr38 = new java.lang.Object[1];
                        b((short) 653, (byte) (-$$a[52]), r2[41], objArr38);
                        obj11 = cls11.getMethod((java.lang.String) objArr38[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num10, obj11);
                    }
                    ((int[]) objArr36[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj11).invoke(null, objArr37)).intValue();
                    return objArr36;
                }
                java.lang.Object[] objArr39 = {new int[]{i12}, new int[]{i12}, null, null, new int[1]};
                java.lang.Object[] objArr40 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf(((((~(572676005 | i12)) | (-457459940)) * (-465)) - 1248078133) + (((~((-457459940) | i12)) | 572676005) * 930) + ((i12 | (-423888963)) * 465))};
                java.lang.Object obj12 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num10);
                if (obj12 == null) {
                    java.lang.Class cls12 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "") + 50, 2713 - android.graphics.Color.red(0), (char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1));
                    java.lang.Object[] objArr41 = new java.lang.Object[1];
                    b((short) 653, (byte) (-$$a[52]), r2[41], objArr41);
                    obj12 = cls12.getMethod((java.lang.String) objArr41[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num10, obj12);
                }
                ((int[]) objArr39[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj12).invoke(null, objArr40)).intValue();
                return objArr39;
            }
            java.lang.Integer num11 = 16;
            try {
                java.lang.Object[] objArr42 = new java.lang.Object[1];
                a((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 181984397, (-417952088) - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (-78) - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (byte) (android.text.TextUtils.getOffsetBefore("", 0) - 60), (short) (63 - (android.view.ViewConfiguration.getScrollBarSize() >> 8)), objArr42);
                java.lang.Class<?> cls13 = java.lang.Class.forName(((java.lang.String) objArr42[0]).intern());
                java.lang.Object[] objArr43 = new java.lang.Object[1];
                a((-181984393) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (-417952067) - android.view.View.resolveSize(0, 0), (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) - 88, (byte) (39 - android.view.Gravity.getAbsoluteGravity(0, 0)), (short) (86 - android.graphics.Color.alpha(0)), objArr43);
                java.lang.String str8 = (java.lang.String) cls13.getMethod(((java.lang.String) objArr43[0]).intern(), null).invoke(context, null);
                java.lang.Object[] objArr44 = new java.lang.Object[1];
                a((-181984398) - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (-417952089) - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (-79) - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (byte) ((-59) - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), (short) (63 - (android.os.Process.myTid() >> 22)), objArr44);
                java.lang.Class<?> cls14 = java.lang.Class.forName(((java.lang.String) objArr44[0]).intern());
                java.lang.Object[] objArr45 = new java.lang.Object[1];
                a((-181984393) - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), android.view.View.MeasureSpec.getMode(0) - 417952054, (-84) - android.text.TextUtils.indexOf("", ""), (byte) (android.view.KeyEvent.normalizeMetaState(0) - 38), (short) ((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 39), objArr45);
                ?? invoke = cls14.getMethod(((java.lang.String) objArr45[0]).intern(), null).invoke(context, null);
                int indexOf = ((java.lang.String) java.lang.Class.forName(intern).getField(intern2).get(invoke)).indexOf(str8);
                if (indexOf > 0) {
                    java.lang.String str9 = (java.lang.String) java.lang.Class.forName(intern).getField(intern2).get(invoke);
                    if (str9.length() >= 16) {
                        int i17 = 0;
                        invoke = invoke;
                        for (int i18 = 16; i17 <= str9.length() - i18; i18 = 16) {
                            java.lang.Object[] objArr46 = {str9.substring(i17, i17 + 16), 931995};
                            java.lang.Object obj13 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                            if (obj13 == null) {
                                java.lang.Class cls15 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(((byte) android.view.KeyEvent.getModifierMetaStateMask()) + com.google.common.base.Ascii.GS, android.text.TextUtils.getOffsetBefore("", 0) + 2594, (char) android.view.View.combineMeasuredStates(0, 0));
                                short s = $$a[41];
                                byte b = (byte) s;
                                str7 = str9;
                                java.lang.Object[] objArr47 = new java.lang.Object[1];
                                b(s, b, (byte) (b | 34), objArr47);
                                obj13 = cls15.getMethod((java.lang.String) objArr47[0], java.lang.String.class, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj13);
                            } else {
                                str7 = str9;
                            }
                            long longValue4 = ((java.lang.Long) ((java.lang.reflect.Method) obj13).invoke(null, objArr46)).longValue();
                            int i19 = i17;
                            long j12 = ~longValue4;
                            num5 = num10;
                            long j13 = i12;
                            num2 = num11;
                            int i20 = indexOf;
                            java.lang.Object obj14 = invoke;
                            long j14 = ((-590) * longValue4) + 175488447888L + ((~(longValue4 | (-296433190))) * (-1182)) + (((~((~j13) | (-296433190) | j12)) | (~(longValue4 | 296433189))) * (-591)) + (((-296433190) | j13 | j12) * 591) + 960667335;
                            int i21 = ~i12;
                            int i22 = ~((-1416263553) | i12);
                            if (((((int) j14) & ((((~(1416263552 | i12)) | (-1434451882) | (~(20962857 | i12))) * (-880)) + 818884229 + (((~(1416263552 | i21)) | (-20962858) | i22) * (-880)) + (i22 * 880))) | (((int) (j14 >> 32)) & (((((~((-232857997) | i21)) | 1204368414) * 226) - 2055567968) + (((~((-136315265) | i21)) | (~((-1204368415) | i12)) | 1107825682) * (-113)) + ((~((-232857997) | i12)) * 113)))) == -725904754) {
                                objArr = new java.lang.Object[]{new int[1], new int[1], null, r4, new int[1]};
                                java.lang.String str10 = (java.lang.String) java.lang.Class.forName(intern).getField(intern2).get(obj14);
                                ((int[]) objArr[0])[0] = i12;
                                ((int[]) objArr[1])[0] = i12 ^ 20;
                                java.lang.Object[] objArr48 = {java.lang.Integer.valueOf(i3), num2, java.lang.Integer.valueOf((((~((-290462833) | i21)) | (~(996040700 | i12))) * (-302)) + 1926275752 + ((~((-290462833) | i12)) * (-604)) + (((~(705577868 | i12)) | 671482624) * 302))};
                                java.lang.Object obj15 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num5);
                                if (obj15 == null) {
                                    java.lang.Class cls16 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 50, (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 2713, (char) android.text.TextUtils.getOffsetBefore("", 0));
                                    java.lang.Object[] objArr49 = new java.lang.Object[1];
                                    b((short) 653, (byte) (-$$a[52]), r6[41], objArr49);
                                    obj15 = cls16.getMethod((java.lang.String) objArr49[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num5, obj15);
                                }
                                ((int[]) objArr[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj15).invoke(null, objArr48)).intValue();
                                i4 = i12;
                                num = num5;
                                i5 = 1;
                                c = 0;
                                if (((int[]) objArr[i5])[c] == i4) {
                                    return objArr;
                                }
                                int[] iArr = new int[i5];
                                int[] iArr2 = new int[i5];
                                iArr[c] = i4;
                                iArr2[c] = i4;
                                java.lang.Object[] objArr50 = {iArr, iArr2, null, null, new int[i5]};
                                int i23 = ~i4;
                                java.lang.Object[] objArr51 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf((((~((-440434817) | i23)) | (~((-537927681) | i23))) * (-184)) + 463683272 + (((~((-466321541) | i23)) | 25886724 | (~((-563814405) | i23))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) + 98262752)};
                                java.lang.Object obj16 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num);
                                if (obj16 == null) {
                                    java.lang.Class cls17 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), 2713 - (android.os.Process.myPid() >> 22), (char) (android.os.Process.getGidForName("") + 1));
                                    java.lang.Object[] objArr52 = new java.lang.Object[1];
                                    b((short) 653, (byte) (-$$a[52]), r5[41], objArr52);
                                    obj16 = cls17.getMethod((java.lang.String) objArr52[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num, obj16);
                                }
                                ((int[]) objArr50[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj16).invoke(null, objArr51)).intValue();
                                if (((int[]) objArr50[1])[0] != i4) {
                                    return objArr50;
                                }
                                if ((i2 & 1) == 0) {
                                    java.lang.Object[] objArr53 = new java.lang.Object[1];
                                    c("\t\u001a\r\u0001\u000f\u001d\"\u0011!##\r㘈", android.text.TextUtils.getOffsetBefore("", 0) + 13, (byte) (android.widget.ExpandableListView.getPackedPositionGroup(0L) + 37), objArr53);
                                    try {
                                        java.lang.Object[] objArr54 = {((java.lang.String) objArr53[0]).intern()};
                                        java.lang.Object[] objArr55 = new java.lang.Object[1];
                                        a((-181984398) - (android.view.KeyEvent.getMaxKeyCode() >> 16), android.view.KeyEvent.getDeadChar(0, 0) - 417952089, (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) - 79, (byte) ((android.view.ViewConfiguration.getTouchSlop() >> 8) - 60), (short) (63 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16)), objArr55);
                                        java.lang.Class<?> cls18 = java.lang.Class.forName(((java.lang.String) objArr55[0]).intern());
                                        java.lang.Object[] objArr56 = new java.lang.Object[1];
                                        a((-181984392) - android.graphics.Color.argb(0, 0, 0, 0), (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) - 417951927, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) - 85, (byte) ((android.os.Process.myPid() >> 22) + 16), (short) (108 - android.view.KeyEvent.keyCodeFromString("")), objArr56);
                                        java.lang.Object invoke2 = cls18.getMethod(((java.lang.String) objArr56[0]).intern(), java.lang.String.class).invoke(context, objArr54);
                                        if (invoke2 != null) {
                                            java.lang.Object[] objArr57 = new java.lang.Object[1];
                                            a((-181984398) - android.view.View.combineMeasuredStates(0, 0), (-417951912) - android.widget.ExpandableListView.getPackedPositionGroup(0L), (-65) - android.graphics.Color.alpha(0), (byte) ((-41) - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))), (short) ((-51) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), objArr57);
                                            java.lang.Class<?> cls19 = java.lang.Class.forName(((java.lang.String) objArr57[0]).intern());
                                            java.lang.Object[] objArr58 = new java.lang.Object[1];
                                            a((-181984392) - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) - 417951876, (-87) - (android.view.KeyEvent.getMaxKeyCode() >> 16), (byte) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 85), (short) (android.view.View.resolveSize(0, 0) - 35), objArr58);
                                            java.util.List list = (java.util.List) cls19.getMethod(((java.lang.String) objArr58[0]).intern(), null).invoke(invoke2, null);
                                            if (list != null) {
                                                for (java.lang.Object obj17 : list) {
                                                    java.lang.Object[] objArr59 = new java.lang.Object[1];
                                                    a((-181984398) - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (-417951862) - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 74, (byte) ((-38) - android.text.TextUtils.getCapsMode("", 0, 0)), (short) (android.view.MotionEvent.axisFromString("") + 112), objArr59);
                                                    java.lang.Class<?> cls20 = java.lang.Class.forName(((java.lang.String) objArr59[0]).intern());
                                                    java.lang.Object[] objArr60 = new java.lang.Object[1];
                                                    a((-181984392) - android.view.KeyEvent.normalizeMetaState(0), (android.view.ViewConfiguration.getTouchSlop() >> 8) - 417952067, (-88) - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (byte) ((android.view.ViewConfiguration.getTouchSlop() >> 8) + 39), (short) (android.view.View.resolveSize(0, 0) + 86), objArr60);
                                                    java.lang.String str11 = (java.lang.String) cls20.getMethod(((java.lang.String) objArr60[0]).intern(), null).invoke(obj17, null);
                                                    java.lang.Object[] objArr61 = new java.lang.Object[1];
                                                    a((android.view.KeyEvent.getMaxKeyCode() >> 16) - 181984398, android.text.TextUtils.getOffsetBefore("", 0) - 417951912, (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 65, (byte) (android.widget.ExpandableListView.getPackedPositionType(0L) - 42), (short) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) - 49), objArr61);
                                                    java.lang.Class<?> cls21 = java.lang.Class.forName(((java.lang.String) objArr61[0]).intern());
                                                    java.lang.Object[] objArr62 = new java.lang.Object[1];
                                                    a(android.graphics.Color.alpha(0) - 181984390, (-417951834) - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (-85) - android.graphics.Color.green(0), (byte) (((android.os.Process.getThreadPriority(0) + 20) >> 6) + 81), (short) (android.text.TextUtils.indexOf("", "", 0, 0) - 2), objArr62);
                                                    if (((java.lang.Boolean) cls21.getMethod(((java.lang.String) objArr62[0]).intern(), java.lang.String.class).invoke(invoke2, str11)).booleanValue()) {
                                                        if (str11.length() >= 20) {
                                                            int i24 = 0;
                                                            for (int i25 = 20; i24 <= str11.length() - i25; i25 = 20) {
                                                                java.lang.Object[] objArr63 = {str11.substring(i24, i24 + 20), 931995};
                                                                java.lang.Object obj18 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                                                if (obj18 == null) {
                                                                    java.lang.Class cls22 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 2594 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) android.view.View.resolveSizeAndState(0, 0, 0));
                                                                    short s2 = $$a[41];
                                                                    byte b2 = (byte) s2;
                                                                    java.lang.Object[] objArr64 = new java.lang.Object[1];
                                                                    b(s2, b2, (byte) (b2 | 34), objArr64);
                                                                    obj18 = cls22.getMethod((java.lang.String) objArr64[0], java.lang.String.class, java.lang.Integer.TYPE);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj18);
                                                                }
                                                                long longValue5 = ((java.lang.Long) ((java.lang.reflect.Method) obj18).invoke(null, objArr63)).longValue();
                                                                long j15 = i4;
                                                                long j16 = ~longValue5;
                                                                long j17 = ((302 * longValue5) - 372043537800L) + ((~(longValue5 | 1240145126 | j15)) * (-301)) + (((~(j16 | j15)) | (~((~j15) | 1240145126))) * (-301)) + ((j16 | (~((-1240145127) | j15))) * 301) + 16955398;
                                                                int i26 = 499805533 | i23;
                                                                if (((((int) j17) & (((~(2143223379 | i4)) * (-301)) + 1243785490 + (((~((-1069464596) | i4)) | (~(1788276290 | i23))) * (-301)) + (((~((-1788276291) | i4)) | (-1069464596)) * 301))) | (((int) (j17 >> 32)) & ((i26 * 495) + 860531382 + (((~i26) | 365586509) * 495)))) == 1245577864) {
                                                                    objArr5 = new java.lang.Object[]{new int[]{i4}, new int[]{i4 ^ 70}, null, null, new int[1]};
                                                                    java.lang.Object[] objArr65 = {java.lang.Integer.valueOf(i3), num2, java.lang.Integer.valueOf(((((~((-33643633) | i23)) | (~(536215422 | i4))) * (-302)) - 12104720) + ((~((-33643633) | i4)) * (-604)) + (((~(502571790 | i4)) | 8651268) * 302))};
                                                                    java.lang.Object obj19 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num);
                                                                    if (obj19 == null) {
                                                                        java.lang.Class cls23 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), 2713 - (android.view.ViewConfiguration.getTouchSlop() >> 8), (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16));
                                                                        java.lang.Object[] objArr66 = new java.lang.Object[1];
                                                                        b((short) 653, (byte) (-$$a[52]), r5[41], objArr66);
                                                                        obj19 = cls23.getMethod((java.lang.String) objArr66[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num, obj19);
                                                                    }
                                                                    c3 = 0;
                                                                    ((int[]) objArr5[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj19).invoke(null, objArr65)).intValue();
                                                                    if (((int[]) objArr5[1])[c3] != i4) {
                                                                        return objArr5;
                                                                    }
                                                                } else {
                                                                    i24++;
                                                                }
                                                            }
                                                        } else {
                                                            continue;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        java.lang.Object[] objArr67 = {new int[]{i4}, new int[]{i4}, null, null, new int[1]};
                                        java.lang.Object[] objArr68 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf((((~(830777363 | i23)) | 199358581) * (-328)) + 556670800 + ((199358581 | i4) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE) + (((~((-830777364) | i4)) | 25208849 | (~(1004927095 | i23))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE))};
                                        java.lang.Object obj20 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num);
                                        if (obj20 == null) {
                                            java.lang.Class cls24 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.normalizeMetaState(0) + 50, android.graphics.ImageFormat.getBitsPerPixel(0) + 2714, (char) android.view.KeyEvent.keyCodeFromString(""));
                                            java.lang.Object[] objArr69 = new java.lang.Object[1];
                                            b((short) 653, (byte) (-$$a[52]), r5[41], objArr69);
                                            obj20 = cls24.getMethod((java.lang.String) objArr69[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num, obj20);
                                        }
                                        c3 = 0;
                                        ((int[]) objArr67[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj20).invoke(null, objArr68)).intValue();
                                        objArr5 = objArr67;
                                        if (((int[]) objArr5[1])[c3] != i4) {
                                        }
                                    } catch (java.lang.Throwable th4) {
                                        java.lang.Throwable cause = th4.getCause();
                                        if (cause != null) {
                                            throw cause;
                                        }
                                        throw th4;
                                    }
                                }
                                java.lang.Object[] objArr70 = new java.lang.Object[1];
                                a((-181984448) - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 417952136, (-90) - android.graphics.Color.argb(0, 0, 0, 0), (byte) (1 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16)), (short) (78 - android.widget.ExpandableListView.getPackedPositionChild(0L)), objArr70);
                                java.lang.Object[] objArr71 = {((java.lang.String) objArr70[0]).intern()};
                                java.lang.Object obj21 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-604620973);
                                if (obj21 == null) {
                                    java.lang.Class cls25 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), 3161 - android.text.TextUtils.indexOf("", "", 0), (char) (33099 - android.graphics.Color.red(0)));
                                    java.lang.Object[] objArr72 = new java.lang.Object[1];
                                    b((short) ($$b | com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PUSH_ATC_OUT_SIDE_PERMISSIBLE_RANGE), (byte) (-$$a[52]), 34, objArr72);
                                    obj21 = cls25.getMethod((java.lang.String) objArr72[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-604620973, obj21);
                                }
                                long longValue6 = ((java.lang.Long) ((java.lang.reflect.Method) obj21).invoke(null, objArr71)).longValue();
                                long j18 = i4;
                                long j19 = ~j18;
                                java.lang.Integer num12 = num;
                                long j20 = (((-301) * longValue6) - 134624096850L) + (((~(longValue6 | (-444303950) | j18)) | (~(j19 | 444303949 | longValue6))) * (-302)) + ((~(444303949 | longValue6 | j18)) * (-604)) + (((~((~longValue6) | (-444303950))) | (~(longValue6 | j18))) * 302) + 1351774688;
                                if (((((int) (j20 >> 32)) & (((((~(1425429583 | i4)) | 27853386) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE) - 217318382) + (((~(1425429583 | i23)) | 27853386) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE))) | (((int) j20) & (((((~(1979031462 | i23)) | (~((-541805053) | i23))) * (-867)) - 1972008908) + (((~(1979031462 | i4)) | 671832 | (~((-541805053) | i4))) * (-1734)) + (((~((-671833) | i23)) | (~(1979703294 | i4)) | (~((-541133221) | i4))) * 867)))) != 0) {
                                    objArr2 = new java.lang.Object[]{new int[]{i4}, new int[]{i4 ^ 50}, null, null, new int[1]};
                                    java.lang.Object[] objArr73 = {java.lang.Integer.valueOf(i3), num2, java.lang.Integer.valueOf((((~(23092071 | i23)) * (-560)) - 2007636120) + ((~((-1007027201) | i4)) * (-560)) + (((~(1007043873 | i23)) | 23075398) * 560))};
                                    num3 = num12;
                                    java.lang.Object obj22 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num3);
                                    if (obj22 == null) {
                                        java.lang.Class cls26 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 2713 - android.graphics.Color.red(0), (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1));
                                        java.lang.Object[] objArr74 = new java.lang.Object[1];
                                        b((short) 653, (byte) (-$$a[52]), r7[41], objArr74);
                                        obj22 = cls26.getMethod((java.lang.String) objArr74[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num3, obj22);
                                    }
                                    c2 = 0;
                                    ((int[]) objArr2[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj22).invoke(null, objArr73)).intValue();
                                } else {
                                    num3 = num12;
                                    objArr2 = new java.lang.Object[]{new int[]{i4}, new int[]{i4}, null, null, new int[1]};
                                    int i27 = ~(1006501495 | i4);
                                    java.lang.Object[] objArr75 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf((((~((-166240882) | i23)) | 23634449 | i27) * (-502)) + 9727454 + ((i27 | (~((-142606433) | i23))) * 502))};
                                    java.lang.Object obj23 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num3);
                                    if (obj23 == null) {
                                        java.lang.Class cls27 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 49, android.text.TextUtils.indexOf("", "", 0) + 2713, (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16));
                                        java.lang.Object[] objArr76 = new java.lang.Object[1];
                                        b((short) 653, (byte) (-$$a[52]), r4[41], objArr76);
                                        obj23 = cls27.getMethod((java.lang.String) objArr76[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num3, obj23);
                                    }
                                    int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj23).invoke(null, objArr75)).intValue();
                                    c2 = 0;
                                    ((int[]) objArr2[4])[0] = intValue;
                                }
                                if (((int[]) objArr2[1])[c2] != i4) {
                                    return objArr2;
                                }
                                java.lang.Object[] objArr77 = new java.lang.Object[1];
                                c("\u0015\u0012\u0011\u0015\u0003\u0019\u0016\u0015\n\r\b!\u0015\u001c\u0005\u001d\u0011\u000f\u000f\u001d", 19 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (byte) ((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE), objArr77);
                                java.lang.Object[] objArr78 = {((java.lang.String) objArr77[0]).intern()};
                                java.lang.Object obj24 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-604620973);
                                if (obj24 == null) {
                                    java.lang.Class cls28 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 36, 3160 - android.view.MotionEvent.axisFromString(""), (char) (33099 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16)));
                                    java.lang.Object[] objArr79 = new java.lang.Object[1];
                                    b((short) ($$b | com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PUSH_ATC_OUT_SIDE_PERMISSIBLE_RANGE), (byte) (-$$a[52]), 34, objArr79);
                                    obj24 = cls28.getMethod((java.lang.String) objArr79[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-604620973, obj24);
                                }
                                long longValue7 = ((java.lang.Long) ((java.lang.reflect.Method) obj24).invoke(null, objArr78)).longValue();
                                long j21 = (-221378673) | longValue7;
                                java.lang.Integer num13 = num3;
                                long j22 = ((-753) * longValue7) + 167140897360L + (((~(j18 | (-221378673))) | (~j21) | (~(longValue7 | j18))) * (-754)) + (((~(j21 | j18)) | (~(longValue7 | 221378672 | j19))) * (-754)) + (((-221378673) | j19) * 754) + 686092066;
                                if (((((int) j22) & ((((~(50811417 | i4)) | (-1386414993)) * (-366)) + 287056937 + (((~((-1352663425) | i4)) | 17059849) * 366))) | (((int) (j22 >> 32)) & (((((~(1414856805 | i4)) | (-22369606)) * (-668)) - 1083849082) + (((~((-22369606) | i4)) | 1414856805) * 1336) + (((-16798977) | i4) * 668)))) != 0) {
                                    objArr3 = new java.lang.Object[]{new int[]{i4}, new int[]{i4 ^ 60}, null, null, new int[1]};
                                    java.lang.Object[] objArr80 = {java.lang.Integer.valueOf(i3), num2, java.lang.Integer.valueOf((((((~((-331260899) | i23)) | (~((-698875047) | i4))) * (-370)) - 71654120) + ((((~((-331260899) | i4)) | (~((-698875047) | i23))) | (-1002438631)) * (-370))) - 1535106014)};
                                    num4 = num13;
                                    java.lang.Object obj25 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num4);
                                    if (obj25 == null) {
                                        java.lang.Class cls29 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), android.graphics.Color.alpha(0) + 2713, (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16));
                                        java.lang.Object[] objArr81 = new java.lang.Object[1];
                                        b((short) 653, (byte) (-$$a[52]), r4[41], objArr81);
                                        obj25 = cls29.getMethod((java.lang.String) objArr81[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num4, obj25);
                                    }
                                    i6 = 0;
                                    ((int[]) objArr3[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj25).invoke(null, objArr80)).intValue();
                                } else {
                                    num4 = num13;
                                    objArr3 = new java.lang.Object[]{new int[]{i4}, new int[]{i4}, null, null, new int[1]};
                                    java.lang.Object[] objArr82 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf(((((~((-336169871) | i23)) | (~((-693966075) | i4))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) - 426155476) + (((~((-693376113) | i23)) | (~((-335579909) | i4))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE))};
                                    java.lang.Object obj26 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num4);
                                    if (obj26 == null) {
                                        java.lang.Class cls30 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.View.combineMeasuredStates(0, 0), (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2713, (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16));
                                        java.lang.Object[] objArr83 = new java.lang.Object[1];
                                        b((short) 653, (byte) (-$$a[52]), r4[41], objArr83);
                                        obj26 = cls30.getMethod((java.lang.String) objArr83[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num4, obj26);
                                    }
                                    i6 = 0;
                                    ((int[]) objArr3[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj26).invoke(null, objArr82)).intValue();
                                }
                                if (((int[]) objArr3[1])[i6] != i4) {
                                    return objArr3;
                                }
                                java.lang.Object[] objArr84 = new java.lang.Object[1];
                                a((-181984448) - android.widget.ExpandableListView.getPackedPositionGroup(0L), (-417952124) - android.text.TextUtils.getOffsetBefore("", i6), (-65) - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (byte) (117 - android.text.TextUtils.getOffsetAfter("", i6)), (short) ((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 48), objArr84);
                                java.lang.Object[] objArr85 = {((java.lang.String) objArr84[0]).intern()};
                                java.lang.Object obj27 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                                if (obj27 == null) {
                                    java.lang.Class cls31 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getTrimmedLength("") + 36, (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 3161, (char) (33099 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24)));
                                    byte[] bArr3 = $$a;
                                    java.lang.Object[] objArr86 = new java.lang.Object[1];
                                    b((short) 612, bArr3[14], bArr3[49], objArr86);
                                    obj27 = cls31.getMethod((java.lang.String) objArr86[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, obj27);
                                }
                                long longValue8 = ((java.lang.Long) ((java.lang.reflect.Method) obj27).invoke(null, objArr85)).longValue();
                                long j23 = ~longValue8;
                                long j24 = (((-565) * longValue8) - 150963958656L) + (((~(longValue8 | 266250367)) | (~(j18 | 266250367))) * (-566)) + ((~((-266250368) | j23)) * 566) + ((~(266250367 | j23 | j18)) * 566) + 1261685271;
                                if (((((int) j24) & ((((514508852 | i4) * 140) - 2130814079) + (((~(514508852 | i23)) | (-2130697727)) * (-280)) + (((~((-1951735263) | i23)) | 335546388 | (~(2130697726 | i4))) * 140))) | (((int) (j24 >> 32)) & (((((~((-671766069) | i23)) | (~(765460342 | i4))) * (-272)) - 1281620086) + (((~((-689929845) | i4)) | 18163776) * (-272)) + (((~(689929844 | i4)) | 747296566) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE)))) != 0) {
                                    objArr4 = new java.lang.Object[]{new int[]{i4}, new int[]{i4 ^ 80}, null, null, new int[1]};
                                    java.lang.Object[] objArr87 = {java.lang.Integer.valueOf(i3), num2, java.lang.Integer.valueOf(((((~((-424007882) | i4)) | (-1030086656)) * (-502)) - 199882204) + ((~((-423958593) | i23)) * (-502)) + (((~((-606128064) | i4)) | (-424007882)) * 502))};
                                    java.lang.Object obj28 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num4);
                                    if (obj28 == null) {
                                        java.lang.Class cls32 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 49, android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 2713, (char) android.text.TextUtils.getTrimmedLength(""));
                                        java.lang.Object[] objArr88 = new java.lang.Object[1];
                                        b((short) 653, (byte) (-$$a[52]), r6[41], objArr88);
                                        obj28 = cls32.getMethod((java.lang.String) objArr88[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num4, obj28);
                                    }
                                    i7 = 0;
                                    ((int[]) objArr4[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj28).invoke(null, objArr87)).intValue();
                                } else {
                                    objArr4 = new java.lang.Object[]{new int[]{i4}, new int[]{i4}, null, null, new int[1]};
                                    java.lang.Object[] objArr89 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf((((~(34919387 | i23)) | (-995483648)) * 529) + 511204786 + (((~(34919387 | i4)) | (-995216558)) * 529))};
                                    java.lang.Object obj29 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num4);
                                    if (obj29 == null) {
                                        java.lang.Class cls33 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.os.Process.getGidForName(""), (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 2712, (char) ((-1) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))));
                                        java.lang.Object[] objArr90 = new java.lang.Object[1];
                                        b((short) 653, (byte) (-$$a[52]), r6[41], objArr90);
                                        obj29 = cls33.getMethod((java.lang.String) objArr90[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num4, obj29);
                                    }
                                    i7 = 0;
                                    ((int[]) objArr4[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj29).invoke(null, objArr89)).intValue();
                                }
                                if (((int[]) objArr4[1])[i7] != i4) {
                                    return objArr4;
                                }
                                java.lang.Object[] objArr91 = new java.lang.Object[1];
                                c("\u001a\u000e\r\u0002\u0014\u001a\u000e\u0014\u0002\r\u0017\u000e!\u0014\u0005\u0010#!\u0015\u001c\u0002\u0010\u0014\n\b# \u0007\u0002\n\u0002\u0011\u0004\n\u0016\u0011\u000f\f\u001a\u0015\t\u0013", 42 - android.graphics.Color.alpha(i7), (byte) (67 - (android.view.ViewConfiguration.getEdgeSlop() >> 16)), objArr91);
                                java.lang.Object[] objArr92 = {((java.lang.String) objArr91[i7]).intern()};
                                java.lang.Object obj30 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                                if (obj30 == null) {
                                    java.lang.Class cls34 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - android.view.KeyEvent.normalizeMetaState(i7), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, i7) + 3162, (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 33098));
                                    byte[] bArr4 = $$a;
                                    java.lang.Object[] objArr93 = new java.lang.Object[1];
                                    b((short) 612, bArr4[14], bArr4[49], objArr93);
                                    obj30 = cls34.getMethod((java.lang.String) objArr93[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, obj30);
                                }
                                long longValue9 = ((java.lang.Long) ((java.lang.reflect.Method) obj30).invoke(null, objArr92)).longValue();
                                long j25 = j19 | 613597760;
                                long j26 = (((-494) * longValue9) - 303117293440L) + ((~(613597760 | longValue9)) * (-495)) + (495 * j25) + (((~((~longValue9) | (-613597761))) | (~j25)) * 495) + 381837143;
                                if (((((int) (j26 >> 32)) & (((((~(2129657599 | i23)) | (~((-604112897) | i23))) * (-184)) - 1019427974) + (((~(648272042 | i23)) | 1481385557 | (~((-2085498454) | i23))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) + 464651544)) | (((int) j26) & ((((602606453 | i4) * 140) - 477100835) + (((~(602606453 | i23)) | (-2080336768)) * (-280)) + (((~((-2039832864) | i23)) | 562102549 | (~(2080336767 | i4))) * 140)))) != 0) {
                                    java.lang.Object[] objArr94 = {new int[]{i4}, new int[]{i4 ^ 90}, null, null, new int[1]};
                                    java.lang.Object[] objArr95 = {java.lang.Integer.valueOf(i3), num2, java.lang.Integer.valueOf(((((~((-512172170) | i4)) | (~(517963775 | i23))) * (-318)) - 2104159972) + (((~(513243017 | i4)) | 4720758) * (-318)) + (((~((-513243018) | i4)) | (-516892928)) * 318))};
                                    java.lang.Object obj31 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num4);
                                    if (obj31 == null) {
                                        java.lang.Class cls35 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.graphics.Color.blue(0), 2713 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (char) android.text.TextUtils.indexOf("", "", 0));
                                        java.lang.Object[] objArr96 = new java.lang.Object[1];
                                        b((short) 653, (byte) (-$$a[52]), r4[41], objArr96);
                                        obj31 = cls35.getMethod((java.lang.String) objArr96[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num4, obj31);
                                    }
                                    ((int[]) objArr94[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj31).invoke(null, objArr95)).intValue();
                                    return objArr94;
                                }
                                java.lang.Object[] objArr97 = {new int[]{i4}, new int[]{i4}, null, null, new int[1]};
                                int i28 = ~(929472484 | i4);
                                java.lang.Object[] objArr98 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf((((~((-908496037) | i23)) | 100663460 | i28) * (-252)) + 627524088 + ((i28 | (~((-807832577) | i23))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE))};
                                java.lang.Object obj32 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num4);
                                if (obj32 == null) {
                                    java.lang.Class cls36 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 49, android.graphics.Color.green(0) + 2713, (char) (android.os.Process.getGidForName("") + 1));
                                    java.lang.Object[] objArr99 = new java.lang.Object[1];
                                    b((short) 653, (byte) (-$$a[52]), r3[41], objArr99);
                                    obj32 = cls36.getMethod((java.lang.String) objArr99[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num4, obj32);
                                }
                                ((int[]) objArr97[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj32).invoke(null, objArr98)).intValue();
                                return objArr97;
                            }
                            i17 = i19 + 1;
                            num10 = num5;
                            invoke = obj14;
                            str9 = str7;
                            indexOf = i20;
                            num11 = num2;
                        }
                    }
                    int i29 = indexOf;
                    java.lang.Integer num14 = invoke;
                    num5 = num10;
                    num2 = num11;
                    java.lang.String str12 = (java.lang.String) java.lang.Class.forName(intern).getField(intern2).get(num14);
                    if (str12.length() >= 6) {
                        int i30 = 0;
                        while (i30 <= str12.length() - 6) {
                            java.lang.Object[] objArr100 = {str12.substring(i30, i30 + 6), 931995};
                            java.lang.Object obj33 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                            if (obj33 == null) {
                                java.lang.Class cls37 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 2595, (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)));
                                short s3 = $$a[41];
                                byte b3 = (byte) s3;
                                java.lang.Object[] objArr101 = new java.lang.Object[1];
                                b(s3, b3, (byte) (b3 | 34), objArr101);
                                obj33 = cls37.getMethod((java.lang.String) objArr101[0], java.lang.String.class, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj33);
                            }
                            long longValue10 = ((java.lang.Long) ((java.lang.reflect.Method) obj33).invoke(null, objArr100)).longValue();
                            long j27 = ~longValue10;
                            long j28 = i12;
                            int i31 = i30;
                            java.lang.Integer num15 = num14;
                            long j29 = (((-500) * longValue10) - 598473327000L) + (((~(j27 | 1196946654)) | (~(longValue10 | (-1196946655) | j28))) * 501) + ((~(j27 | (-1196946655))) * 1002) + ((~((-1196946655) | (~j28) | longValue10)) * 501) + 60153870;
                            int i32 = ~i12;
                            int i33 = (-1701478285) | i32;
                            if (((((int) (j29 >> 32)) & ((((((~((-1845634145) | i32)) | 134349856) | (~((-408407734) | i32))) * 464) - 761152054) + (((-1711284289) | i12) * (-464)) + (((~((-408407734) | i12)) | 134349856) * 464))) | (((int) j29) & ((i33 * 495) + 1557458630 + (((~i33) | 176160866) * 495)))) == -2096167706) {
                                objArr = new java.lang.Object[]{new int[1], new int[1], null, r6, new int[1]};
                                java.lang.String str13 = (java.lang.String) java.lang.Class.forName(intern).getField(intern2).get(num15);
                                ((int[]) objArr[0])[0] = i12;
                                ((int[]) objArr[1])[0] = i12 ^ 20;
                                java.lang.Object[] objArr102 = {java.lang.Integer.valueOf(i3), num2, java.lang.Integer.valueOf((((((-28360979) | i32) * (-490)) + 1193349488) + (((~((-28430643) | i12)) | 69664) * 490)) - 1209326726)};
                                java.lang.Object obj34 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num5);
                                if (obj34 == null) {
                                    java.lang.Class cls38 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "") + 50, (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 2713, (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                                    java.lang.Object[] objArr103 = new java.lang.Object[1];
                                    b((short) 653, (byte) (-$$a[52]), r4[41], objArr103);
                                    obj34 = cls38.getMethod((java.lang.String) objArr103[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num5, obj34);
                                }
                                ((int[]) objArr[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj34).invoke(null, objArr102)).intValue();
                                i4 = i12;
                                num = num5;
                                i5 = 1;
                                c = 0;
                                if (((int[]) objArr[i5])[c] == i4) {
                                }
                            } else {
                                i30 = i31 + 1;
                                num14 = num15;
                            }
                        }
                    }
                    java.lang.Integer num16 = num14;
                    java.lang.String substring = ((java.lang.String) java.lang.Class.forName(intern).getField(intern2).get(num16)).substring(0, i29);
                    java.lang.Object[] objArr104 = new java.lang.Object[1];
                    a((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 181984449, android.text.TextUtils.indexOf("", "", 0, 0) - 417951998, (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 102, (byte) ((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 62), (short) (android.widget.ExpandableListView.getPackedPositionGroup(0L) - 11), objArr104);
                    int i34 = 0;
                    java.lang.String[] split = substring.split(((java.lang.String) objArr104[0]).intern());
                    int length = split.length;
                    int i35 = 0;
                    ?? r1 = split;
                    while (i35 < length) {
                        ?? r10 = r1[i35];
                        java.lang.Object obj35 = r1;
                        int i36 = length;
                        int i37 = i35;
                        java.lang.Object[] objArr105 = new java.lang.Object[1];
                        a((-181984404) - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(i34) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(i34) == 0.0d ? 0 : -1)), (-417951997) - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (-100) - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (byte) ((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 28), (short) ((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 109), objArr105);
                        if (r10.split(((java.lang.String) objArr105[0]).intern()).length > 1) {
                            i8 = 49 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1));
                            synchronized (((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(i8, 1581 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (char) android.graphics.Color.argb(0, 0, 0, 0)))) {
                                try {
                                    try {
                                        java.lang.Object[] objArr106 = new java.lang.Object[1];
                                        c("\u000f\u0016\u0016\u001f#\u0013\u0007\u0019\u0011\u000f\f\u001d\u0010\u001a\u001d\u0015", 16 - android.graphics.Color.blue(0), (byte) (127 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), objArr106);
                                        java.lang.String intern4 = ((java.lang.String) objArr106[0]).intern();
                                        try {
                                            java.lang.Runtime runtime = java.lang.Runtime.getRuntime();
                                            num6 = num5;
                                            try {
                                                try {
                                                    java.lang.Object[] objArr107 = new java.lang.Object[1];
                                                    a(android.os.Process.getGidForName("") - 181984379, android.widget.ExpandableListView.getPackedPositionType(0L) - 417951996, (-100) - android.text.TextUtils.indexOf("", "", 0), (byte) ((-5) - android.graphics.drawable.Drawable.resolveOpacity(0, 0)), (short) ((-106) - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), objArr107);
                                                    exec = runtime.exec(((java.lang.String) objArr107[0]).intern(), (java.lang.String[]) null, (java.io.File) null);
                                                } catch (java.lang.Exception unused) {
                                                }
                                                try {
                                                    java.lang.Object[] objArr108 = {exec.getInputStream()};
                                                    java.lang.Object obj36 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(40835744);
                                                    if (obj36 == null) {
                                                        try {
                                                            obj36 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(45 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 1507 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16))).getDeclaredConstructor(java.io.InputStream.class);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(40835744, obj36);
                                                        } catch (java.lang.Throwable th5) {
                                                            th = th5;
                                                            java.lang.Throwable cause2 = th.getCause();
                                                            if (cause2 != null) {
                                                                throw cause2;
                                                            }
                                                            throw th;
                                                        }
                                                    }
                                                    java.lang.Object newInstance = ((java.lang.reflect.Constructor) obj36).newInstance(objArr108);
                                                    try {
                                                        java.lang.Object[] objArr109 = {exec.getErrorStream()};
                                                        java.lang.Object obj37 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(40835744);
                                                        if (obj37 == null) {
                                                            try {
                                                                obj37 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.Gravity.getAbsoluteGravity(0, 0) + 44, 1507 - android.view.KeyEvent.getDeadChar(0, 0), (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1))).getDeclaredConstructor(java.io.InputStream.class);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(40835744, obj37);
                                                            } catch (java.lang.Throwable th6) {
                                                                th2 = th6;
                                                                java.lang.Throwable cause3 = th2.getCause();
                                                                if (cause3 != null) {
                                                                    throw cause3;
                                                                }
                                                                throw th2;
                                                            }
                                                        }
                                                        java.lang.Object newInstance2 = ((java.lang.reflect.Constructor) obj37).newInstance(objArr109);
                                                        java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(exec.getOutputStream());
                                                        try {
                                                            java.lang.Class<?> cls39 = java.lang.Class.forName(intern3);
                                                            try {
                                                                java.lang.Object[] objArr110 = new java.lang.Object[1];
                                                                a((-181984380) - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), ((byte) android.view.KeyEvent.getModifierMetaStateMask()) - 417951979, android.widget.ExpandableListView.getPackedPositionChild(0L) - 96, (byte) ((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 40), (short) (105 - android.widget.ExpandableListView.getPackedPositionType(0L)), objArr110);
                                                                cls39.getMethod(((java.lang.String) objArr110[0]).intern(), null).invoke(newInstance, null);
                                                                try {
                                                                    java.lang.Class<?> cls40 = java.lang.Class.forName(intern3);
                                                                    num7 = num16;
                                                                    try {
                                                                        java.lang.Object[] objArr111 = new java.lang.Object[1];
                                                                        a((-181984380) - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (android.view.ViewConfiguration.getLongPressTimeout() >> 16) - 417951980, (-97) - android.text.TextUtils.getTrimmedLength(""), (byte) (40 - (android.view.ViewConfiguration.getTapTimeout() >> 16)), (short) (105 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16)), objArr111);
                                                                        cls40.getMethod(((java.lang.String) objArr111[0]).intern(), null).invoke(newInstance2, null);
                                                                        try {
                                                                            try {
                                                                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                                                                sb.append(intern4);
                                                                                java.lang.Object[] objArr112 = new java.lang.Object[1];
                                                                                c("㗣", -android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (byte) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 84), objArr112);
                                                                                sb.append(((java.lang.String) objArr112[0]).intern());
                                                                                java.lang.String obj38 = sb.toString();
                                                                                java.lang.Object[] objArr113 = new java.lang.Object[1];
                                                                                c("\u0001\u000f\u0018\u0017㘏", 5 - android.text.TextUtils.indexOf("", "", 0, 0), (byte) ((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 109), objArr113);
                                                                                dataOutputStream.write(obj38.getBytes(((java.lang.String) objArr113[0]).intern()));
                                                                                dataOutputStream.flush();
                                                                                java.lang.Object[] objArr114 = new java.lang.Object[1];
                                                                                c("\u001c\u001a\u0001\u0007㗐", 4 - android.graphics.ImageFormat.getBitsPerPixel(0), (byte) (64 - android.widget.ExpandableListView.getPackedPositionType(0L)), objArr114);
                                                                                java.lang.String intern5 = ((java.lang.String) objArr114[0]).intern();
                                                                                java.lang.Object[] objArr115 = new java.lang.Object[1];
                                                                                c("\u0001\u000f\u0018\u0017㘏", android.graphics.ImageFormat.getBitsPerPixel(0) + 6, (byte) (109 - android.text.TextUtils.getOffsetBefore("", 0)), objArr115);
                                                                                dataOutputStream.write(intern5.getBytes(((java.lang.String) objArr115[0]).intern()));
                                                                                dataOutputStream.flush();
                                                                                try {
                                                                                    long nanoTime = java.lang.System.nanoTime();
                                                                                    long nanos = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(2000L);
                                                                                    java.lang.String str14 = r10;
                                                                                    while (true) {
                                                                                        try {
                                                                                            exec.exitValue();
                                                                                            str2 = intern2;
                                                                                            str = intern;
                                                                                            str4 = str14;
                                                                                            break;
                                                                                        } catch (java.lang.IllegalThreadStateException unused2) {
                                                                                            if (nanos > 0) {
                                                                                                try {
                                                                                                    str3 = intern2;
                                                                                                } catch (java.lang.InterruptedException e) {
                                                                                                    e = e;
                                                                                                    str2 = intern2;
                                                                                                } catch (java.lang.Throwable th7) {
                                                                                                    th = th7;
                                                                                                    str2 = intern2;
                                                                                                }
                                                                                                try {
                                                                                                    try {
                                                                                                        java.lang.Object[] objArr116 = {java.lang.Long.valueOf(java.lang.Math.min(java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(nanos) + 1, 3L))};
                                                                                                        java.lang.Class<?> cls41 = java.lang.Class.forName(intern3);
                                                                                                        str2 = str3;
                                                                                                        try {
                                                                                                            str = intern;
                                                                                                            str4 = str14;
                                                                                                            try {
                                                                                                                java.lang.Object[] objArr117 = new java.lang.Object[1];
                                                                                                                a(((android.os.Process.getThreadPriority(0) + 20) >> 6) - 181984380, (-417951976) - android.text.TextUtils.indexOf("", "", 0), (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 97, (byte) ((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 42), (short) ((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 68), objArr117);
                                                                                                                cls41.getMethod(((java.lang.String) objArr117[0]).intern(), java.lang.Long.TYPE).invoke(null, objArr116);
                                                                                                            } catch (java.lang.Throwable th8) {
                                                                                                                th = th8;
                                                                                                                java.lang.Throwable th9 = th;
                                                                                                                java.lang.Throwable cause4 = th9.getCause();
                                                                                                                if (cause4 != null) {
                                                                                                                    throw cause4;
                                                                                                                }
                                                                                                                throw th9;
                                                                                                            }
                                                                                                        } catch (java.lang.Throwable th10) {
                                                                                                            th = th10;
                                                                                                        }
                                                                                                    } catch (java.lang.Throwable th11) {
                                                                                                        th = th11;
                                                                                                    }
                                                                                                } catch (java.lang.InterruptedException e2) {
                                                                                                    e = e2;
                                                                                                    str2 = str3;
                                                                                                    throw e;
                                                                                                } catch (java.lang.Throwable th12) {
                                                                                                    th = th12;
                                                                                                    str2 = str3;
                                                                                                    th3 = th;
                                                                                                    try {
                                                                                                        exec.destroy();
                                                                                                        throw th3;
                                                                                                    } catch (java.lang.Exception unused3) {
                                                                                                        throw th3;
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                str2 = intern2;
                                                                                                str = intern;
                                                                                                str4 = str14;
                                                                                            }
                                                                                            try {
                                                                                                nanos = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(2000L) - (java.lang.System.nanoTime() - nanoTime);
                                                                                                if (nanos > 0) {
                                                                                                    intern = str;
                                                                                                    intern2 = str2;
                                                                                                    str14 = str4;
                                                                                                }
                                                                                            } catch (java.lang.InterruptedException e3) {
                                                                                                e = e3;
                                                                                                throw e;
                                                                                            } catch (java.lang.Throwable th13) {
                                                                                                th = th13;
                                                                                                th3 = th;
                                                                                                exec.destroy();
                                                                                                throw th3;
                                                                                            }
                                                                                        } catch (java.lang.InterruptedException e4) {
                                                                                            throw e4;
                                                                                        } catch (java.lang.Throwable th14) {
                                                                                            th3 = th14;
                                                                                            exec.destroy();
                                                                                            throw th3;
                                                                                        }
                                                                                    }
                                                                                } catch (java.lang.InterruptedException e5) {
                                                                                    e = e5;
                                                                                } catch (java.lang.Throwable th15) {
                                                                                    th = th15;
                                                                                }
                                                                            } catch (java.lang.Throwable th16) {
                                                                                th = th16;
                                                                            }
                                                                            try {
                                                                                try {
                                                                                    dataOutputStream.close();
                                                                                } catch (java.io.IOException unused4) {
                                                                                }
                                                                                try {
                                                                                    try {
                                                                                        java.lang.Class<?> cls42 = java.lang.Class.forName(intern3);
                                                                                        java.lang.Object[] objArr118 = new java.lang.Object[1];
                                                                                        c("\u0002\u001e\"\u0013", android.text.TextUtils.getCapsMode("", 0, 0) + 4, (byte) (android.view.View.resolveSizeAndState(0, 0, 0) + 117), objArr118);
                                                                                        cls42.getMethod(((java.lang.String) objArr118[0]).intern(), java.lang.Long.TYPE).invoke(newInstance, 100L);
                                                                                        try {
                                                                                            java.lang.Class<?> cls43 = java.lang.Class.forName(intern3);
                                                                                            java.lang.Object[] objArr119 = new java.lang.Object[1];
                                                                                            c("\u0002\u001e\"\u0013", 4 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (byte) ((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 117), objArr119);
                                                                                            cls43.getMethod(((java.lang.String) objArr119[0]).intern(), java.lang.Long.TYPE).invoke(newInstance2, 10L);
                                                                                            try {
                                                                                                try {
                                                                                                    exec.destroy();
                                                                                                } catch (java.lang.Exception unused5) {
                                                                                                }
                                                                                                try {
                                                                                                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                                                                                                    java.lang.Class cls44 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 45, 1507 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) android.view.Gravity.getAbsoluteGravity(0, 0));
                                                                                                    byte[] bArr5 = $$a;
                                                                                                    java.lang.Object[] objArr120 = new java.lang.Object[1];
                                                                                                    b((short) 650, bArr5[41], bArr5[7], objArr120);
                                                                                                    sb2.append(cls44.getField((java.lang.String) objArr120[0]).get(newInstance).toString());
                                                                                                    java.lang.Class cls45 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - android.view.KeyEvent.getDeadChar(0, 0), 1506 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                                                                                                    java.lang.Object[] objArr121 = new java.lang.Object[1];
                                                                                                    b((short) 650, bArr5[41], bArr5[7], objArr121);
                                                                                                    sb2.append(cls45.getField((java.lang.String) objArr121[0]).get(newInstance2).toString());
                                                                                                    java.lang.String obj39 = sb2.toString();
                                                                                                    java.lang.Object[] objArr122 = new java.lang.Object[1];
                                                                                                    c("㗣", 1 - android.view.View.resolveSize(0, 0), (byte) (82 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), objArr122);
                                                                                                    java.lang.String[] split2 = obj39.split(((java.lang.String) objArr122[0]).intern());
                                                                                                    int length2 = split2.length;
                                                                                                    int i38 = 0;
                                                                                                    while (i38 < length2) {
                                                                                                        java.lang.String str15 = split2[i38];
                                                                                                        java.lang.Object[] objArr123 = new java.lang.Object[1];
                                                                                                        c("\u0011\u000f\f\u001d\u0010\u001a\u0018!\u000e#\u0016\u0003\u001a\"\"\u001a!\u001c㘞", 20 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (byte) (105 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), objArr123);
                                                                                                        if (!str15.startsWith(((java.lang.String) objArr123[0]).intern())) {
                                                                                                            java.lang.Object[] objArr124 = new java.lang.Object[1];
                                                                                                            a(android.view.KeyEvent.normalizeMetaState(0) - 181984383, (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 417951946, (-83) - android.widget.ExpandableListView.getPackedPositionChild(0L), (byte) (android.view.Gravity.getAbsoluteGravity(0, 0) + 103), (short) ((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 118), objArr124);
                                                                                                            if (!str15.startsWith(((java.lang.String) objArr124[0]).intern())) {
                                                                                                                java.lang.Object[] objArr125 = new java.lang.Object[1];
                                                                                                                c("\u0011\u000f\f\u001d\u0010\u001a\u0018!", 8 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (byte) (89 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), objArr125);
                                                                                                                if (str15.startsWith(((java.lang.String) objArr125[0]).intern())) {
                                                                                                                    java.lang.Object[] objArr126 = new java.lang.Object[1];
                                                                                                                    a(android.view.View.MeasureSpec.makeMeasureSpec(0, 0) - 181984437, android.graphics.Color.green(0) - 417951927, (-101) - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (byte) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 7), (short) (android.view.View.MeasureSpec.getSize(0) - 4), objArr126);
                                                                                                                    java.lang.String[] split3 = str15.split(((java.lang.String) objArr126[0]).intern());
                                                                                                                    if (split3.length > 1) {
                                                                                                                        str6 = str4;
                                                                                                                        if (!split3[1].equalsIgnoreCase(str6)) {
                                                                                                                            num8 = num6;
                                                                                                                            str5 = str2;
                                                                                                                            num9 = num7;
                                                                                                                            i38++;
                                                                                                                            str4 = str6;
                                                                                                                            num6 = num8;
                                                                                                                            str2 = str5;
                                                                                                                            num7 = num9;
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        num8 = num6;
                                                                                                        str5 = str2;
                                                                                                        num9 = num7;
                                                                                                        str6 = str4;
                                                                                                        i38++;
                                                                                                        str4 = str6;
                                                                                                        num6 = num8;
                                                                                                        str2 = str5;
                                                                                                        num7 = num9;
                                                                                                    }
                                                                                                } catch (java.lang.Exception unused6) {
                                                                                                    java.lang.Object[] objArr127 = new java.lang.Object[1];
                                                                                                    a((-181984426) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 417951972, (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 75, (byte) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT), (short) (57 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16)), objArr127);
                                                                                                    throw new java.io.IOException(((java.lang.String) objArr127[0]).intern());
                                                                                                }
                                                                                            } catch (java.io.IOException unused7) {
                                                                                            }
                                                                                            i8 = i;
                                                                                            num16 = num6;
                                                                                            intern = str2;
                                                                                            r10 = num7;
                                                                                        } catch (java.lang.Throwable th17) {
                                                                                            java.lang.Throwable cause5 = th17.getCause();
                                                                                            if (cause5 != null) {
                                                                                                throw cause5;
                                                                                            }
                                                                                            throw th17;
                                                                                        }
                                                                                    } catch (java.lang.InterruptedException e6) {
                                                                                        e = e6;
                                                                                        throw e;
                                                                                    }
                                                                                } catch (java.lang.Throwable th18) {
                                                                                    java.lang.Throwable cause6 = th18.getCause();
                                                                                    if (cause6 != null) {
                                                                                        throw cause6;
                                                                                    }
                                                                                    throw th18;
                                                                                }
                                                                            } catch (java.lang.InterruptedException e7) {
                                                                                e = e7;
                                                                                throw e;
                                                                            } catch (java.lang.Throwable th19) {
                                                                                th = th19;
                                                                                th3 = th;
                                                                                exec.destroy();
                                                                                throw th3;
                                                                            }
                                                                        } catch (java.io.IOException unused8) {
                                                                            i8 = i;
                                                                            str = intern;
                                                                            num16 = num6;
                                                                            r10 = num7;
                                                                            intern = intern2;
                                                                            i35 = i37 + 1;
                                                                            num5 = num16;
                                                                            intern2 = intern;
                                                                            num16 = r10;
                                                                            i12 = i8;
                                                                            intern = str;
                                                                            r1 = obj35;
                                                                            length = i36;
                                                                            i34 = 0;
                                                                        } catch (java.lang.Exception unused9) {
                                                                            java.lang.Object[] objArr1272 = new java.lang.Object[1];
                                                                            a((-181984426) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 417951972, (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 75, (byte) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT), (short) (57 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16)), objArr1272);
                                                                            throw new java.io.IOException(((java.lang.String) objArr1272[0]).intern());
                                                                        }
                                                                    } catch (java.lang.Throwable th20) {
                                                                        th = th20;
                                                                        java.lang.Throwable th21 = th;
                                                                        java.lang.Throwable cause7 = th21.getCause();
                                                                        if (cause7 != null) {
                                                                            throw cause7;
                                                                        }
                                                                        throw th21;
                                                                    }
                                                                } catch (java.lang.Throwable th22) {
                                                                    th = th22;
                                                                }
                                                            } catch (java.lang.Throwable th23) {
                                                                th = th23;
                                                                java.lang.Throwable th24 = th;
                                                                java.lang.Throwable cause8 = th24.getCause();
                                                                if (cause8 != null) {
                                                                    throw cause8;
                                                                }
                                                                throw th24;
                                                            }
                                                        } catch (java.lang.Throwable th25) {
                                                            th = th25;
                                                        }
                                                    } catch (java.lang.Throwable th26) {
                                                        th2 = th26;
                                                    }
                                                } catch (java.lang.Throwable th27) {
                                                    th = th27;
                                                }
                                            } catch (java.io.IOException unused10) {
                                                i8 = i12;
                                                r10 = num16;
                                                str = intern;
                                                num16 = num6;
                                            } catch (java.lang.Exception unused11) {
                                            }
                                        } catch (java.lang.Exception unused12) {
                                        }
                                    } catch (java.io.IOException unused13) {
                                    }
                                } catch (java.io.IOException unused14) {
                                    i8 = i12;
                                    r10 = num16;
                                    str = intern;
                                    num16 = num5;
                                }
                            }
                            objArr = new java.lang.Object[]{new int[1], new int[1], null, r2, new int[1]};
                            java.lang.String str16 = (java.lang.String) java.lang.Class.forName(str).getField(str2).get(num7);
                            i4 = i;
                            ((int[]) objArr[0])[0] = i4;
                            ((int[]) objArr[1])[0] = i4 ^ 20;
                            int i39 = ~i4;
                            java.lang.Object[] objArr128 = {java.lang.Integer.valueOf(i3), num2, java.lang.Integer.valueOf((((((~((-63918569) | i4)) | 25641120) | (~(1004494824 | i39))) * 886) - 1321901288) + (((~(63918568 | i39)) | 966217376) * (-1772)) + ((~(i39 | 966217376)) * 886))};
                            num = num6;
                            java.lang.Object obj40 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num);
                            if (obj40 == null) {
                                java.lang.Class cls46 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 2714, (char) android.view.View.resolveSize(0, 0));
                                java.lang.Object[] objArr129 = new java.lang.Object[1];
                                b((short) 653, (byte) (-$$a[52]), r3[41], objArr129);
                                obj40 = cls46.getMethod((java.lang.String) objArr129[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num, obj40);
                            }
                            ((int[]) objArr[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj40).invoke(null, objArr128)).intValue();
                            i5 = 1;
                            c = 0;
                            if (((int[]) objArr[i5])[c] == i4) {
                            }
                        } else {
                            i8 = i12;
                            r10 = num16;
                            str = intern;
                            num16 = num5;
                            intern = intern2;
                        }
                        i35 = i37 + 1;
                        num5 = num16;
                        intern2 = intern;
                        num16 = r10;
                        i12 = i8;
                        intern = str;
                        r1 = obj35;
                        length = i36;
                        i34 = 0;
                    }
                    i4 = i12;
                    num = num5;
                } else {
                    num = num10;
                    num2 = 16;
                    i4 = i12;
                }
                java.lang.Object[] objArr130 = {new int[]{i4}, new int[]{i4}, null, null, new int[1]};
                java.lang.Object[] objArr131 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf(((((~((-670766337) | r1)) | 90898688) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) - 234010808) + ((~((-90898689) | i4)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) + (((~((~i4) | (-359369609))) | 268470920 | (~((-579867649) | i4))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE))};
                java.lang.Object obj41 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num);
                if (obj41 == null) {
                    java.lang.Class cls47 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 2713, (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1));
                    java.lang.Object[] objArr132 = new java.lang.Object[1];
                    b((short) 653, (byte) (-$$a[52]), r3[41], objArr132);
                    obj41 = cls47.getMethod((java.lang.String) objArr132[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num, obj41);
                }
                int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj41).invoke(null, objArr131)).intValue();
                c = 0;
                ((int[]) objArr130[4])[0] = intValue2;
                objArr = objArr130;
                i5 = 1;
                if (((int[]) objArr[i5])[c] == i4) {
                }
            } catch (java.lang.Throwable th28) {
                java.lang.Throwable cause9 = th28.getCause();
                if (cause9 != null) {
                    throw cause9;
                }
                throw th28;
            }
        } catch (java.lang.Throwable th29) {
            java.lang.Throwable cause10 = th29.getCause();
            if (cause10 != null) {
                throw cause10;
            }
            throw th29;
        }
    }

    static void init$0() {
        $$a = new byte[]{117, 72, 94, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, 45, 10, -13, com.google.common.base.Ascii.SI, -2, -11, com.google.common.base.Ascii.NAK, -13, -32, 46, 1, 8, -17, 4, 19, -6, -5, 16, 2, -33, 19, com.google.common.base.Ascii.SUB, -10, -6, com.google.common.base.Ascii.VT, 8, -46, com.google.common.base.Ascii.US, com.google.common.base.Ascii.NAK, -17, -21, 43, -2, 1, com.google.common.base.Ascii.SI, -10, 39, 0, 4, 13, -9, 19, -19, 1, -31, 32, 19, -12, -18, 36, -1, -7, 5, 5, -5};
        $$b = 66;
    }
}
