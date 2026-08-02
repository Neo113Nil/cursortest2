package com.payair.hce;

/* loaded from: classes4.dex */
public final class setOverScrollMode extends com.payair.hce.setOnSystemUiVisibilityChangeListener {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static char AlternateContactlessPaymentDataJson;
    private static char[] DigitizedCardProfile;
    private static char IccPrivateKeyCrtComponentsJson;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static int getProfileVersion;
    private static char valueOf;
    private static char values;
    private static char writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, int i, short s2, java.lang.Object[] objArr) {
        int i2;
        int i3;
        byte[] bArr = $$a;
        int i4 = 35 - (s2 * 2);
        int i5 = i + 4;
        int i6 = 718 - s;
        char[] cArr = new char[i4];
        if (bArr == null) {
            int i7 = i4;
            i3 = 0;
            i6 = (i6 + (-i7)) - 2;
            i2 = i3;
            i3 = i2 + 1;
            cArr[i2] = (char) i6;
            i5++;
            if (i3 == i4) {
                objArr[0] = new java.lang.String(cArr);
                return;
            }
            i7 = bArr[i5];
            i6 = (i6 + (-i7)) - 2;
            i2 = i3;
            i3 = i2 + 1;
            cArr[i2] = (char) i6;
            i5++;
            if (i3 == i4) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            cArr[i2] = (char) i6;
            i5++;
            if (i3 == i4) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(int i, int i2, short s, java.lang.Object[] objArr) {
        int i3;
        byte[] bArr = $$d;
        int i4 = 110 - s;
        int i5 = i2 * 4;
        int i6 = (i * 3) + 4;
        byte[] bArr2 = new byte[1 - i5];
        int i7 = 0 - i5;
        if (bArr == null) {
            int i8 = i4;
            i3 = 0;
            i4 = i7;
            i6++;
            i4 += i8;
            bArr2[i3] = (byte) i4;
            if (i3 == i7) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i8 = bArr[i6];
            i3++;
            i6++;
            i4 += i8;
            bArr2[i3] = (byte) i4;
            if (i3 == i7) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i4;
            if (i3 == i7) {
            }
        }
    }

    public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = i2 | i3;
        int i6 = (i * (-464)) + (i2 * (-929)) + (((~i5) | i4) * (-465)) + ((i2 | (~(i3 | i4))) * 930) + ((i4 | i5) * 465);
        return i6 != 1 ? i6 != 2 ? AlternateContactlessPaymentDataJson(objArr) : DigitizedCardProfile(objArr) : values(objArr);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setOverScrollMode(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.setOverScrollMode setoverscrollmode = (com.payair.hce.setOverScrollMode) objArr[0];
        com.payair.hce.communication.JsonResponse jsonResponse = (com.payair.hce.communication.JsonResponse) objArr[1];
        int i = getProfileVersion + 74;
        int i2 = (~i) + (i << 1);
        SdkCoreAlternateContactlessPaymentDataImpl = i2 % 128;
        if (i2 % 2 != 0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonResponse, "");
            super.AlternateContactlessPaymentDataJson(jsonResponse);
            return null;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonResponse, "");
        super.AlternateContactlessPaymentDataJson(jsonResponse);
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.setOverScrollMode setoverscrollmode = (com.payair.hce.setOverScrollMode) objArr[0];
        int i = getProfileVersion;
        int i2 = ((i | 39) << 1) - (i ^ 39);
        SdkCoreAlternateContactlessPaymentDataImpl = i2 % 128;
        if (i2 % 2 == 0) {
            super.values();
            throw null;
        }
        boolean values2 = super.values();
        int i3 = getProfileVersion;
        int i4 = (i3 ^ 71) + ((i3 & 71) << 1);
        SdkCoreAlternateContactlessPaymentDataImpl = i4 % 128;
        if (i4 % 2 != 0) {
            return java.lang.Boolean.valueOf(values2);
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.setOverScrollMode setoverscrollmode = (com.payair.hce.setOverScrollMode) objArr[0];
        com.payair.hce.communication.JsonResponse jsonResponse = (com.payair.hce.communication.JsonResponse) objArr[1];
        int i = SdkCoreAlternateContactlessPaymentDataImpl;
        int i2 = i & 45;
        int i3 = -(-((i ^ 45) | i2));
        int i4 = (i2 & i3) + (i3 | i2);
        getProfileVersion = i4 % 128;
        if (i4 % 2 == 0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonResponse, "");
            super.writeReplace(jsonResponse);
            return null;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonResponse, "");
        super.writeReplace(jsonResponse);
        throw new java.lang.ArithmeticException();
    }

    private static void b(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2 = $11 + 73;
        $10 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getProductType getproducttype = new com.payair.hce.getProductType();
        char[] cArr = new char[charArray.length];
        getproducttype.AlternateContactlessPaymentDataJson = 0;
        char[] cArr2 = new char[2];
        while (getproducttype.AlternateContactlessPaymentDataJson < charArray.length) {
            int i3 = $11 + 101;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                cArr2[0] = charArray[getproducttype.AlternateContactlessPaymentDataJson];
                cArr2[1] = charArray[getproducttype.AlternateContactlessPaymentDataJson >> 1];
            } else {
                cArr2[0] = charArray[getproducttype.AlternateContactlessPaymentDataJson];
                cArr2[1] = charArray[getproducttype.AlternateContactlessPaymentDataJson + 1];
            }
            int i4 = 58224;
            for (int i5 = 0; i5 < 16; i5++) {
                char c = cArr2[1];
                char c2 = cArr2[0];
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(c), java.lang.Integer.valueOf(((c2 << 4) + ((char) (AlternateContactlessPaymentDataJson ^ 2144259807102049818L))) ^ r15), java.lang.Integer.valueOf(c2 >>> 5), java.lang.Integer.valueOf(values)};
                    int i6 = c2 + i4;
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getTrimmedLength("") + 62, (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1334, (char) (android.view.ViewConfiguration.getTapTimeout() >> 16));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        d(0, 0, (short) 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj);
                    }
                    char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    cArr2[1] = charValue;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr2[0]), java.lang.Integer.valueOf(((charValue << 4) + ((char) (valueOf ^ 2144259807102049818L))) ^ r14), java.lang.Integer.valueOf(charValue >>> 5), java.lang.Integer.valueOf(writeReplace)};
                    int i7 = charValue + i4;
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(62 - android.graphics.Color.green(0), 1335 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), (char) (1 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        d(0, 0, (short) 0, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj2);
                    }
                    cArr2[0] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                    i4 -= 40503;
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
                obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 54, 3543 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (char) android.graphics.Color.alpha(0))).getMethod("r", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1765331150, obj3);
            }
            ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
        }
        objArr[0] = new java.lang.String(cArr, 0, i);
    }

    private static void c(int i, byte b, java.lang.String str, java.lang.Object[] objArr) {
        char[] cArr;
        int i2;
        long j;
        if (str != null) {
            $11 = ($10 + 45) % 128;
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.payair.hce.DigitizedCardJson12 digitizedCardJson12 = new com.payair.hce.DigitizedCardJson12();
        char[] cArr3 = DigitizedCardProfile;
        int i3 = 8;
        if (cArr3 != null) {
            int i4 = $11;
            $10 = (i4 + 103) % 128;
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            $10 = (i4 + 115) % 128;
            int i5 = 0;
            while (i5 < length) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr3[i5])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 49, 2508 - (android.view.ViewConfiguration.getTouchSlop() >> i3), (char) (6802 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        d(0, 0, (short) 45, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj);
                    }
                    cArr4[i5] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    i5++;
                    i3 = 8;
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
        java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(IccPrivateKeyCrtComponentsJson)};
        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
        long j2 = 0;
        if (obj2 == null) {
            java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 2508 - (android.os.Process.myPid() >> 22), (char) (6803 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))));
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            d(0, 0, (short) 45, objArr5);
            obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj2);
        }
        char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
        char[] cArr5 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr5[i2] = (char) (cArr2[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            $11 = ($10 + 53) % 128;
            digitizedCardJson12.values = 0;
            $11 = ($10 + 113) % 128;
            while (digitizedCardJson12.values < i2) {
                digitizedCardJson12.valueOf = cArr2[digitizedCardJson12.values];
                digitizedCardJson12.writeReplace = cArr2[digitizedCardJson12.values + 1];
                if (digitizedCardJson12.valueOf == digitizedCardJson12.writeReplace) {
                    int i6 = $11 + 87;
                    $10 = i6 % 128;
                    if (i6 % 2 != 0) {
                        cArr5[digitizedCardJson12.values] = (char) (digitizedCardJson12.valueOf - b);
                        cArr5[digitizedCardJson12.values + 1] = (char) (digitizedCardJson12.writeReplace >> b);
                    } else {
                        cArr5[digitizedCardJson12.values] = (char) (digitizedCardJson12.valueOf - b);
                        cArr5[digitizedCardJson12.values + 1] = (char) (digitizedCardJson12.writeReplace - b);
                    }
                    j = j2;
                } else {
                    java.lang.Object[] objArr6 = {digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1553139325);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - (android.os.Process.myPid() >> 22), (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 3595, (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16))).getMethod(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1553139325, obj3);
                    }
                    if (((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).intValue() == digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl) {
                        java.lang.Object[] objArr7 = {digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), java.lang.Integer.valueOf(charValue), digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12};
                        java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(737480198);
                        if (obj4 == null) {
                            j = 0;
                            java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), android.widget.ExpandableListView.getPackedPositionType(0L) + 2665, (char) (18889 - android.view.KeyEvent.getDeadChar(0, 0)));
                            java.lang.Object[] objArr8 = new java.lang.Object[1];
                            d(0, 0, (short) 37, objArr8);
                            obj4 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(737480198, obj4);
                        } else {
                            j = 0;
                        }
                        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr7)).intValue();
                        int i7 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                        int i8 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                        cArr5[digitizedCardJson12.values] = cArr3[intValue];
                        cArr5[digitizedCardJson12.values + 1] = cArr3[(i7 * charValue) + i8];
                    } else {
                        j = 0;
                        if (digitizedCardJson12.DigitizedCardProfile == digitizedCardJson12.AlternateContactlessPaymentDataJson) {
                            digitizedCardJson12.RecordsJson = ((digitizedCardJson12.RecordsJson + charValue) - 1) % charValue;
                            digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl = ((digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl + charValue) - 1) % charValue;
                            int i9 = digitizedCardJson12.DigitizedCardProfile;
                            int i10 = digitizedCardJson12.RecordsJson;
                            int i11 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                            int i12 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                            cArr5[digitizedCardJson12.values] = cArr3[(i9 * charValue) + i10];
                            cArr5[digitizedCardJson12.values + 1] = cArr3[(i11 * charValue) + i12];
                        } else {
                            int i13 = digitizedCardJson12.DigitizedCardProfile;
                            int i14 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                            int i15 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                            int i16 = digitizedCardJson12.RecordsJson;
                            cArr5[digitizedCardJson12.values] = cArr3[(i13 * charValue) + i14];
                            cArr5[digitizedCardJson12.values + 1] = cArr3[(i15 * charValue) + i16];
                            $11 = ($10 + 43) % 128;
                        }
                    }
                }
                digitizedCardJson12.values += 2;
                j2 = j;
            }
        }
        int i17 = 0;
        while (i17 < i) {
            int i18 = $11 + 7;
            $10 = i18 % 128;
            if (i18 % 2 != 0) {
                cArr5[i17] = (char) (cArr5[i17] ^ 25764);
                i17 += 57;
            } else {
                cArr5[i17] = (char) (cArr5[i17] ^ 13722);
                i17++;
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
        SdkCoreAlternateContactlessPaymentDataImpl = 1;
        valueOf = (char) 23533;
        writeReplace = (char) 17036;
        AlternateContactlessPaymentDataJson = (char) 43580;
        values = (char) 18502;
        DigitizedCardProfile = new char[]{12350, 12328, 12326, 12410, 12335, 12323, 12311, 12333, 12388, 12391, 12332, 12412, 12325, 12348, 12344, 12349, 12334, 12329, 12351, 12346, 12345, 12322, 12338, 12327, 12385, 12389, 12336, 12331, 12321, 12320, 12309, 12339, 12305, 12403, 12411, 12324};
        IccPrivateKeyCrtComponentsJson = (char) 1494;
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x14d8, code lost:
    
        if (((r2 ^ r4) | (r2 & r4)) == 477111747) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:473:0x2c87, code lost:
    
        if (r6 == null) goto L385;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x05d6, code lost:
    
        if (((r2 ^ r5) | (r2 & r5)) != 477111747) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:597:0x0abf, code lost:
    
        if (r2.equals((java.lang.String) r8[0]) != false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x07e3, code lost:
    
        if (((r2 & (((((-1475336896) | r5) * (-196)) - 249866186) + ((r5 | 1447712813) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE))) | (((int) r12) & (((((708987473 | r61) * 614) + 88756379) + ((((~((-1783363668) | r7)) | 708986961) | (~(1074377218 | r7))) * (-1228))) + (((~((-1074376707) | r7)) | (~(1783364179 | r7))) * 614)))) != (-1032769152)) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x08eb, code lost:
    
        if (((((int) (r12 >> 32)) & ((((((~((-799855358) | r61)) | 632062637) | r5) * (-470)) - 2141044920) + ((r5 | (~((-167792721) | r61))) * 470))) | (((((((~(1247104562 | r7)) | r8) * 1150) + 334239082) + ((r8 | (~((-190121848) | r7))) * (-575))) + (((~(1247104562 | r61)) | (~((-1247104563) | r7))) * 575)) & ((int) r12))) == 542074309) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:117:0x1799 A[Catch: all -> 0x42e6, TryCatch #1 {all -> 0x42e6, blocks: (B:3:0x0004, B:6:0x001c, B:7:0x005d, B:11:0x010d, B:13:0x0158, B:14:0x01a4, B:19:0x01ce, B:21:0x01e4, B:22:0x023b, B:32:0x02b4, B:34:0x02c7, B:35:0x0318, B:37:0x0342, B:39:0x0355, B:40:0x03a7, B:43:0x03be, B:45:0x03da, B:46:0x0434, B:50:0x04d4, B:52:0x04f2, B:53:0x0542, B:59:0x05e6, B:61:0x0603, B:62:0x0655, B:65:0x06e7, B:67:0x0705, B:68:0x0759, B:71:0x07e7, B:73:0x0805, B:74:0x085a, B:78:0x10d8, B:80:0x10eb, B:81:0x113b, B:91:0x11bc, B:93:0x11cf, B:94:0x121c, B:96:0x124b, B:98:0x125e, B:99:0x12b2, B:101:0x12bb, B:103:0x12d9, B:104:0x1328, B:108:0x13cf, B:110:0x13ed, B:111:0x1442, B:115:0x1786, B:117:0x1799, B:118:0x17ec, B:120:0x18a5, B:122:0x18b8, B:123:0x1909, B:131:0x19d1, B:133:0x1a20, B:134:0x1a7b, B:138:0x1ade, B:140:0x1af1, B:141:0x1b3b, B:143:0x1c27, B:145:0x1c3a, B:146:0x1c82, B:154:0x1d54, B:156:0x1da3, B:157:0x1df8, B:166:0x1f04, B:168:0x1f17, B:169:0x1f6b, B:176:0x2112, B:178:0x215e, B:179:0x21b5, B:202:0x2402, B:204:0x244a, B:205:0x249d, B:209:0x24cc, B:211:0x24df, B:212:0x252a, B:225:0x2709, B:227:0x271c, B:228:0x276c, B:236:0x2848, B:238:0x2890, B:239:0x28e8, B:243:0x2921, B:245:0x294a, B:246:0x29a6, B:252:0x2a7a, B:254:0x2acb, B:255:0x2b1a, B:284:0x2bad, B:286:0x2c06, B:287:0x2c5b, B:290:0x2c8c, B:292:0x2c9b, B:293:0x2ce7, B:297:0x2da9, B:299:0x2df9, B:300:0x2e4d, B:304:0x2e64, B:306:0x2e7d, B:307:0x2ec8, B:311:0x2f92, B:313:0x2fe3, B:314:0x3035, B:317:0x304b, B:319:0x305a, B:320:0x30a6, B:324:0x3160, B:326:0x31aa, B:327:0x31fc, B:330:0x3212, B:332:0x3221, B:333:0x3268, B:337:0x3329, B:339:0x3382, B:340:0x33d6, B:343:0x33ec, B:345:0x33fb, B:346:0x3441, B:350:0x34d3, B:352:0x3512, B:353:0x3561, B:357:0x3599, B:359:0x35c3, B:360:0x3626, B:364:0x36eb, B:366:0x3728, B:367:0x377b, B:371:0x37b7, B:373:0x37ca, B:374:0x381b, B:378:0x38c6, B:380:0x3911, B:381:0x3968, B:384:0x397e, B:386:0x398d, B:387:0x39db, B:391:0x3aa4, B:393:0x3af5, B:394:0x3b49, B:397:0x3b5f, B:399:0x3b6e, B:400:0x3bb9, B:404:0x3c70, B:406:0x3ca6, B:407:0x3cfe, B:410:0x3d14, B:412:0x3d23, B:413:0x3d70, B:417:0x3e05, B:419:0x3e52, B:420:0x3ea8, B:423:0x3ebe, B:425:0x3ecd, B:426:0x3f19, B:432:0x3fed, B:434:0x4031, B:435:0x4086, B:437:0x409b, B:439:0x40ae, B:440:0x40fa, B:442:0x4102, B:444:0x412f, B:445:0x418e, B:450:0x4223, B:452:0x4270, B:453:0x42c6, B:535:0x1fff, B:537:0x2012, B:538:0x2062, B:550:0x153e, B:552:0x1551, B:553:0x15a2, B:565:0x16ab, B:567:0x16f8, B:568:0x1750, B:577:0x090f, B:579:0x0922, B:580:0x0971, B:585:0x0add, B:587:0x0b1c, B:588:0x0b72, B:592:0x0a2f, B:594:0x0a42, B:595:0x0a94), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x18b8 A[Catch: all -> 0x42e6, TryCatch #1 {all -> 0x42e6, blocks: (B:3:0x0004, B:6:0x001c, B:7:0x005d, B:11:0x010d, B:13:0x0158, B:14:0x01a4, B:19:0x01ce, B:21:0x01e4, B:22:0x023b, B:32:0x02b4, B:34:0x02c7, B:35:0x0318, B:37:0x0342, B:39:0x0355, B:40:0x03a7, B:43:0x03be, B:45:0x03da, B:46:0x0434, B:50:0x04d4, B:52:0x04f2, B:53:0x0542, B:59:0x05e6, B:61:0x0603, B:62:0x0655, B:65:0x06e7, B:67:0x0705, B:68:0x0759, B:71:0x07e7, B:73:0x0805, B:74:0x085a, B:78:0x10d8, B:80:0x10eb, B:81:0x113b, B:91:0x11bc, B:93:0x11cf, B:94:0x121c, B:96:0x124b, B:98:0x125e, B:99:0x12b2, B:101:0x12bb, B:103:0x12d9, B:104:0x1328, B:108:0x13cf, B:110:0x13ed, B:111:0x1442, B:115:0x1786, B:117:0x1799, B:118:0x17ec, B:120:0x18a5, B:122:0x18b8, B:123:0x1909, B:131:0x19d1, B:133:0x1a20, B:134:0x1a7b, B:138:0x1ade, B:140:0x1af1, B:141:0x1b3b, B:143:0x1c27, B:145:0x1c3a, B:146:0x1c82, B:154:0x1d54, B:156:0x1da3, B:157:0x1df8, B:166:0x1f04, B:168:0x1f17, B:169:0x1f6b, B:176:0x2112, B:178:0x215e, B:179:0x21b5, B:202:0x2402, B:204:0x244a, B:205:0x249d, B:209:0x24cc, B:211:0x24df, B:212:0x252a, B:225:0x2709, B:227:0x271c, B:228:0x276c, B:236:0x2848, B:238:0x2890, B:239:0x28e8, B:243:0x2921, B:245:0x294a, B:246:0x29a6, B:252:0x2a7a, B:254:0x2acb, B:255:0x2b1a, B:284:0x2bad, B:286:0x2c06, B:287:0x2c5b, B:290:0x2c8c, B:292:0x2c9b, B:293:0x2ce7, B:297:0x2da9, B:299:0x2df9, B:300:0x2e4d, B:304:0x2e64, B:306:0x2e7d, B:307:0x2ec8, B:311:0x2f92, B:313:0x2fe3, B:314:0x3035, B:317:0x304b, B:319:0x305a, B:320:0x30a6, B:324:0x3160, B:326:0x31aa, B:327:0x31fc, B:330:0x3212, B:332:0x3221, B:333:0x3268, B:337:0x3329, B:339:0x3382, B:340:0x33d6, B:343:0x33ec, B:345:0x33fb, B:346:0x3441, B:350:0x34d3, B:352:0x3512, B:353:0x3561, B:357:0x3599, B:359:0x35c3, B:360:0x3626, B:364:0x36eb, B:366:0x3728, B:367:0x377b, B:371:0x37b7, B:373:0x37ca, B:374:0x381b, B:378:0x38c6, B:380:0x3911, B:381:0x3968, B:384:0x397e, B:386:0x398d, B:387:0x39db, B:391:0x3aa4, B:393:0x3af5, B:394:0x3b49, B:397:0x3b5f, B:399:0x3b6e, B:400:0x3bb9, B:404:0x3c70, B:406:0x3ca6, B:407:0x3cfe, B:410:0x3d14, B:412:0x3d23, B:413:0x3d70, B:417:0x3e05, B:419:0x3e52, B:420:0x3ea8, B:423:0x3ebe, B:425:0x3ecd, B:426:0x3f19, B:432:0x3fed, B:434:0x4031, B:435:0x4086, B:437:0x409b, B:439:0x40ae, B:440:0x40fa, B:442:0x4102, B:444:0x412f, B:445:0x418e, B:450:0x4223, B:452:0x4270, B:453:0x42c6, B:535:0x1fff, B:537:0x2012, B:538:0x2062, B:550:0x153e, B:552:0x1551, B:553:0x15a2, B:565:0x16ab, B:567:0x16f8, B:568:0x1750, B:577:0x090f, B:579:0x0922, B:580:0x0971, B:585:0x0add, B:587:0x0b1c, B:588:0x0b72, B:592:0x0a2f, B:594:0x0a42, B:595:0x0a94), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x19a9  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x1af1 A[Catch: all -> 0x42e6, TryCatch #1 {all -> 0x42e6, blocks: (B:3:0x0004, B:6:0x001c, B:7:0x005d, B:11:0x010d, B:13:0x0158, B:14:0x01a4, B:19:0x01ce, B:21:0x01e4, B:22:0x023b, B:32:0x02b4, B:34:0x02c7, B:35:0x0318, B:37:0x0342, B:39:0x0355, B:40:0x03a7, B:43:0x03be, B:45:0x03da, B:46:0x0434, B:50:0x04d4, B:52:0x04f2, B:53:0x0542, B:59:0x05e6, B:61:0x0603, B:62:0x0655, B:65:0x06e7, B:67:0x0705, B:68:0x0759, B:71:0x07e7, B:73:0x0805, B:74:0x085a, B:78:0x10d8, B:80:0x10eb, B:81:0x113b, B:91:0x11bc, B:93:0x11cf, B:94:0x121c, B:96:0x124b, B:98:0x125e, B:99:0x12b2, B:101:0x12bb, B:103:0x12d9, B:104:0x1328, B:108:0x13cf, B:110:0x13ed, B:111:0x1442, B:115:0x1786, B:117:0x1799, B:118:0x17ec, B:120:0x18a5, B:122:0x18b8, B:123:0x1909, B:131:0x19d1, B:133:0x1a20, B:134:0x1a7b, B:138:0x1ade, B:140:0x1af1, B:141:0x1b3b, B:143:0x1c27, B:145:0x1c3a, B:146:0x1c82, B:154:0x1d54, B:156:0x1da3, B:157:0x1df8, B:166:0x1f04, B:168:0x1f17, B:169:0x1f6b, B:176:0x2112, B:178:0x215e, B:179:0x21b5, B:202:0x2402, B:204:0x244a, B:205:0x249d, B:209:0x24cc, B:211:0x24df, B:212:0x252a, B:225:0x2709, B:227:0x271c, B:228:0x276c, B:236:0x2848, B:238:0x2890, B:239:0x28e8, B:243:0x2921, B:245:0x294a, B:246:0x29a6, B:252:0x2a7a, B:254:0x2acb, B:255:0x2b1a, B:284:0x2bad, B:286:0x2c06, B:287:0x2c5b, B:290:0x2c8c, B:292:0x2c9b, B:293:0x2ce7, B:297:0x2da9, B:299:0x2df9, B:300:0x2e4d, B:304:0x2e64, B:306:0x2e7d, B:307:0x2ec8, B:311:0x2f92, B:313:0x2fe3, B:314:0x3035, B:317:0x304b, B:319:0x305a, B:320:0x30a6, B:324:0x3160, B:326:0x31aa, B:327:0x31fc, B:330:0x3212, B:332:0x3221, B:333:0x3268, B:337:0x3329, B:339:0x3382, B:340:0x33d6, B:343:0x33ec, B:345:0x33fb, B:346:0x3441, B:350:0x34d3, B:352:0x3512, B:353:0x3561, B:357:0x3599, B:359:0x35c3, B:360:0x3626, B:364:0x36eb, B:366:0x3728, B:367:0x377b, B:371:0x37b7, B:373:0x37ca, B:374:0x381b, B:378:0x38c6, B:380:0x3911, B:381:0x3968, B:384:0x397e, B:386:0x398d, B:387:0x39db, B:391:0x3aa4, B:393:0x3af5, B:394:0x3b49, B:397:0x3b5f, B:399:0x3b6e, B:400:0x3bb9, B:404:0x3c70, B:406:0x3ca6, B:407:0x3cfe, B:410:0x3d14, B:412:0x3d23, B:413:0x3d70, B:417:0x3e05, B:419:0x3e52, B:420:0x3ea8, B:423:0x3ebe, B:425:0x3ecd, B:426:0x3f19, B:432:0x3fed, B:434:0x4031, B:435:0x4086, B:437:0x409b, B:439:0x40ae, B:440:0x40fa, B:442:0x4102, B:444:0x412f, B:445:0x418e, B:450:0x4223, B:452:0x4270, B:453:0x42c6, B:535:0x1fff, B:537:0x2012, B:538:0x2062, B:550:0x153e, B:552:0x1551, B:553:0x15a2, B:565:0x16ab, B:567:0x16f8, B:568:0x1750, B:577:0x090f, B:579:0x0922, B:580:0x0971, B:585:0x0add, B:587:0x0b1c, B:588:0x0b72, B:592:0x0a2f, B:594:0x0a42, B:595:0x0a94), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x1c3a A[Catch: all -> 0x42e6, TryCatch #1 {all -> 0x42e6, blocks: (B:3:0x0004, B:6:0x001c, B:7:0x005d, B:11:0x010d, B:13:0x0158, B:14:0x01a4, B:19:0x01ce, B:21:0x01e4, B:22:0x023b, B:32:0x02b4, B:34:0x02c7, B:35:0x0318, B:37:0x0342, B:39:0x0355, B:40:0x03a7, B:43:0x03be, B:45:0x03da, B:46:0x0434, B:50:0x04d4, B:52:0x04f2, B:53:0x0542, B:59:0x05e6, B:61:0x0603, B:62:0x0655, B:65:0x06e7, B:67:0x0705, B:68:0x0759, B:71:0x07e7, B:73:0x0805, B:74:0x085a, B:78:0x10d8, B:80:0x10eb, B:81:0x113b, B:91:0x11bc, B:93:0x11cf, B:94:0x121c, B:96:0x124b, B:98:0x125e, B:99:0x12b2, B:101:0x12bb, B:103:0x12d9, B:104:0x1328, B:108:0x13cf, B:110:0x13ed, B:111:0x1442, B:115:0x1786, B:117:0x1799, B:118:0x17ec, B:120:0x18a5, B:122:0x18b8, B:123:0x1909, B:131:0x19d1, B:133:0x1a20, B:134:0x1a7b, B:138:0x1ade, B:140:0x1af1, B:141:0x1b3b, B:143:0x1c27, B:145:0x1c3a, B:146:0x1c82, B:154:0x1d54, B:156:0x1da3, B:157:0x1df8, B:166:0x1f04, B:168:0x1f17, B:169:0x1f6b, B:176:0x2112, B:178:0x215e, B:179:0x21b5, B:202:0x2402, B:204:0x244a, B:205:0x249d, B:209:0x24cc, B:211:0x24df, B:212:0x252a, B:225:0x2709, B:227:0x271c, B:228:0x276c, B:236:0x2848, B:238:0x2890, B:239:0x28e8, B:243:0x2921, B:245:0x294a, B:246:0x29a6, B:252:0x2a7a, B:254:0x2acb, B:255:0x2b1a, B:284:0x2bad, B:286:0x2c06, B:287:0x2c5b, B:290:0x2c8c, B:292:0x2c9b, B:293:0x2ce7, B:297:0x2da9, B:299:0x2df9, B:300:0x2e4d, B:304:0x2e64, B:306:0x2e7d, B:307:0x2ec8, B:311:0x2f92, B:313:0x2fe3, B:314:0x3035, B:317:0x304b, B:319:0x305a, B:320:0x30a6, B:324:0x3160, B:326:0x31aa, B:327:0x31fc, B:330:0x3212, B:332:0x3221, B:333:0x3268, B:337:0x3329, B:339:0x3382, B:340:0x33d6, B:343:0x33ec, B:345:0x33fb, B:346:0x3441, B:350:0x34d3, B:352:0x3512, B:353:0x3561, B:357:0x3599, B:359:0x35c3, B:360:0x3626, B:364:0x36eb, B:366:0x3728, B:367:0x377b, B:371:0x37b7, B:373:0x37ca, B:374:0x381b, B:378:0x38c6, B:380:0x3911, B:381:0x3968, B:384:0x397e, B:386:0x398d, B:387:0x39db, B:391:0x3aa4, B:393:0x3af5, B:394:0x3b49, B:397:0x3b5f, B:399:0x3b6e, B:400:0x3bb9, B:404:0x3c70, B:406:0x3ca6, B:407:0x3cfe, B:410:0x3d14, B:412:0x3d23, B:413:0x3d70, B:417:0x3e05, B:419:0x3e52, B:420:0x3ea8, B:423:0x3ebe, B:425:0x3ecd, B:426:0x3f19, B:432:0x3fed, B:434:0x4031, B:435:0x4086, B:437:0x409b, B:439:0x40ae, B:440:0x40fa, B:442:0x4102, B:444:0x412f, B:445:0x418e, B:450:0x4223, B:452:0x4270, B:453:0x42c6, B:535:0x1fff, B:537:0x2012, B:538:0x2062, B:550:0x153e, B:552:0x1551, B:553:0x15a2, B:565:0x16ab, B:567:0x16f8, B:568:0x1750, B:577:0x090f, B:579:0x0922, B:580:0x0971, B:585:0x0add, B:587:0x0b1c, B:588:0x0b72, B:592:0x0a2f, B:594:0x0a42, B:595:0x0a94), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x1d16  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x1d2c  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x1ef6  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x20f5  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x21cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x23e9  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x24b3  */
    /* JADX WARN: Removed duplicated region for block: B:545:0x17ea  */
    /* JADX WARN: Removed duplicated region for block: B:576:0x08f3  */
    /* JADX WARN: Removed duplicated region for block: B:591:0x0a0b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x10eb A[Catch: all -> 0x42e6, TryCatch #1 {all -> 0x42e6, blocks: (B:3:0x0004, B:6:0x001c, B:7:0x005d, B:11:0x010d, B:13:0x0158, B:14:0x01a4, B:19:0x01ce, B:21:0x01e4, B:22:0x023b, B:32:0x02b4, B:34:0x02c7, B:35:0x0318, B:37:0x0342, B:39:0x0355, B:40:0x03a7, B:43:0x03be, B:45:0x03da, B:46:0x0434, B:50:0x04d4, B:52:0x04f2, B:53:0x0542, B:59:0x05e6, B:61:0x0603, B:62:0x0655, B:65:0x06e7, B:67:0x0705, B:68:0x0759, B:71:0x07e7, B:73:0x0805, B:74:0x085a, B:78:0x10d8, B:80:0x10eb, B:81:0x113b, B:91:0x11bc, B:93:0x11cf, B:94:0x121c, B:96:0x124b, B:98:0x125e, B:99:0x12b2, B:101:0x12bb, B:103:0x12d9, B:104:0x1328, B:108:0x13cf, B:110:0x13ed, B:111:0x1442, B:115:0x1786, B:117:0x1799, B:118:0x17ec, B:120:0x18a5, B:122:0x18b8, B:123:0x1909, B:131:0x19d1, B:133:0x1a20, B:134:0x1a7b, B:138:0x1ade, B:140:0x1af1, B:141:0x1b3b, B:143:0x1c27, B:145:0x1c3a, B:146:0x1c82, B:154:0x1d54, B:156:0x1da3, B:157:0x1df8, B:166:0x1f04, B:168:0x1f17, B:169:0x1f6b, B:176:0x2112, B:178:0x215e, B:179:0x21b5, B:202:0x2402, B:204:0x244a, B:205:0x249d, B:209:0x24cc, B:211:0x24df, B:212:0x252a, B:225:0x2709, B:227:0x271c, B:228:0x276c, B:236:0x2848, B:238:0x2890, B:239:0x28e8, B:243:0x2921, B:245:0x294a, B:246:0x29a6, B:252:0x2a7a, B:254:0x2acb, B:255:0x2b1a, B:284:0x2bad, B:286:0x2c06, B:287:0x2c5b, B:290:0x2c8c, B:292:0x2c9b, B:293:0x2ce7, B:297:0x2da9, B:299:0x2df9, B:300:0x2e4d, B:304:0x2e64, B:306:0x2e7d, B:307:0x2ec8, B:311:0x2f92, B:313:0x2fe3, B:314:0x3035, B:317:0x304b, B:319:0x305a, B:320:0x30a6, B:324:0x3160, B:326:0x31aa, B:327:0x31fc, B:330:0x3212, B:332:0x3221, B:333:0x3268, B:337:0x3329, B:339:0x3382, B:340:0x33d6, B:343:0x33ec, B:345:0x33fb, B:346:0x3441, B:350:0x34d3, B:352:0x3512, B:353:0x3561, B:357:0x3599, B:359:0x35c3, B:360:0x3626, B:364:0x36eb, B:366:0x3728, B:367:0x377b, B:371:0x37b7, B:373:0x37ca, B:374:0x381b, B:378:0x38c6, B:380:0x3911, B:381:0x3968, B:384:0x397e, B:386:0x398d, B:387:0x39db, B:391:0x3aa4, B:393:0x3af5, B:394:0x3b49, B:397:0x3b5f, B:399:0x3b6e, B:400:0x3bb9, B:404:0x3c70, B:406:0x3ca6, B:407:0x3cfe, B:410:0x3d14, B:412:0x3d23, B:413:0x3d70, B:417:0x3e05, B:419:0x3e52, B:420:0x3ea8, B:423:0x3ebe, B:425:0x3ecd, B:426:0x3f19, B:432:0x3fed, B:434:0x4031, B:435:0x4086, B:437:0x409b, B:439:0x40ae, B:440:0x40fa, B:442:0x4102, B:444:0x412f, B:445:0x418e, B:450:0x4223, B:452:0x4270, B:453:0x42c6, B:535:0x1fff, B:537:0x2012, B:538:0x2062, B:550:0x153e, B:552:0x1551, B:553:0x15a2, B:565:0x16ab, B:567:0x16f8, B:568:0x1750, B:577:0x090f, B:579:0x0922, B:580:0x0971, B:585:0x0add, B:587:0x0b1c, B:588:0x0b72, B:592:0x0a2f, B:594:0x0a42, B:595:0x0a94), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x1146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.Object[] AlternateContactlessPaymentDataJson$5f5b6fcf(int i, java.lang.Object obj, int i2) {
        char c;
        java.lang.String str;
        long j;
        long j2;
        java.lang.Object obj2;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.Object obj3;
        java.lang.String str4;
        long j3;
        java.lang.Object obj4;
        java.lang.String str5;
        java.lang.Object obj5;
        long j4;
        java.lang.Object obj6;
        long j5;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        java.lang.Throwable th;
        java.io.BufferedInputStream bufferedInputStream;
        long j6;
        java.lang.Object[] objArr;
        java.lang.Object[] objArr2;
        int parseInt;
        int i8;
        java.lang.Object obj7;
        int i9;
        char c2;
        try {
            java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1566620024);
            if (obj8 == null) {
                java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 26, 1838 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (char) ((-1) - android.os.Process.getGidForName("")));
                byte b = $$a[14];
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                a((short) (b + 1), b, r10[16], objArr3);
                obj8 = cls.getMethod((java.lang.String) objArr3[0], null);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1566620024, obj8);
            }
            long longValue = ((java.lang.Long) ((java.lang.reflect.Method) obj8).invoke(null, null)).longValue();
            long j7 = ~longValue;
            long j8 = i;
            long j9 = ~j8;
            long j10 = ~(j7 | j8);
            long j11 = (longValue * 246) + 293019867180L + (((~(j7 | j9)) | (~(j7 | (-1200901095)))) * (-245)) + ((-245) * j10) + ((j10 | (-1200901095)) * 245) + 2040980040;
            int i10 = ~i;
            int i11 = ((int) (j11 >> 32)) & ((((~((-1972604186) | i)) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING) - 1094398186) + (((~((-1972604186) | i10)) | (-1976802620)) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING));
            int i12 = (int) j11;
            int i13 = ~(1176015200 | i);
            int i14 = i12 & ((((~(1176015200 | i10)) | 159466505) * (-245)) + 2069062482 + (i13 * (-245)) + ((i13 | (-261211210)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE));
            if (((i11 ^ i14) | (i11 & i14)) != 0) {
                int i15 = getProfileVersion;
                SdkCoreAlternateContactlessPaymentDataImpl = (((i15 | 69) << 1) - (i15 ^ 69)) % 128;
                java.lang.Object[] objArr4 = {new int[]{i}, new int[]{(~(i & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_BRUSHSTROKE_VALUE)) & (i | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_BRUSHSTROKE_VALUE)}, null, new int[1]};
                java.lang.Object[] objArr5 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf((((-49281) | i10) * (-369)) + 457436974 + (((~((-736900982) | i10)) | (-27575462)) * (-369)) + (((~(i | 736900981)) | (-736950262) | (~((-27526182) | i10))) * 369))};
                java.lang.Object obj9 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                if (obj9 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 2713, (char) android.view.View.resolveSize(0, 0));
                    byte b2 = $$a[14];
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    a((short) 653, b2, (byte) (b2 + 1), objArr6);
                    obj9 = cls2.getMethod((java.lang.String) objArr6[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj9);
                }
                ((int[]) objArr4[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj9).invoke(null, objArr5)).intValue();
                return objArr4;
            }
            int i16 = -android.view.Gravity.getAbsoluteGravity(0, 0);
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            b("㮽łᦻ煘戒葈흖\uf5c2戒葈ᵕ龌", (i16 & 11) + (i16 | 11), objArr7);
            java.lang.Object[] objArr8 = {(java.lang.String) objArr7[0]};
            java.lang.Object obj10 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
            if (obj10 == null) {
                str = "";
                java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(39 - android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1920, (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16));
                byte b3 = $$a[14];
                c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                a((short) (b3 + 1), b3, r12[16], objArr9);
                obj10 = cls3.getMethod((java.lang.String) objArr9[0], java.lang.String.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj10);
            } else {
                c = '0';
                str = "";
            }
            java.lang.String str6 = (java.lang.String) ((java.lang.reflect.Method) obj10).invoke(null, objArr8);
            if (str6 != null) {
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                c(7 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (byte) (45 - android.os.Process.getGidForName(str)), "\u000f\u001a\u0005\u0017\u0016\u0013", objArr10);
                java.lang.String str7 = (java.lang.String) objArr10[0];
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                b("锾ם된葇쒃Ｚ⍆넅", 8 - (~(-(android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)))), objArr11);
                java.lang.String[] strArr = {str7, (java.lang.String) objArr11[0]};
                int i17 = 2;
                int i18 = 0;
                while (i18 < i17) {
                    if (str6.contains(strArr[i18])) {
                        getProfileVersion = (SdkCoreAlternateContactlessPaymentDataImpl + 47) % 128;
                        int offsetAfter = android.text.TextUtils.getOffsetAfter(str, 0);
                        int packedPositionChild = android.widget.ExpandableListView.getPackedPositionChild(0L);
                        java.lang.Object[] objArr12 = new java.lang.Object[1];
                        c(22 - (~offsetAfter), (byte) ((packedPositionChild & 19) + (packedPositionChild | 19)), "\u000f\r\u0007\u0014\u000f\r\f\u0016\f\u0005\u000b\u0014\u001d!\u0016\u0006\u001d\u000f\u0006\u0018\u0010\u0002㗺", objArr12);
                        java.lang.Object[] objArr13 = {(java.lang.String) objArr12[0]};
                        java.lang.Object obj11 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                        if (obj11 == null) {
                            java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.view.ViewConfiguration.getTouchSlop() >> 8), 1969 - android.text.AndroidCharacter.getMirror(c), (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1));
                            byte b4 = $$a[14];
                            java.lang.Object[] objArr14 = new java.lang.Object[1];
                            a((short) (b4 + 1), b4, r11[16], objArr14);
                            obj11 = cls4.getMethod((java.lang.String) objArr14[0], java.lang.String.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj11);
                        }
                        java.lang.Object invoke = ((java.lang.reflect.Method) obj11).invoke(null, objArr13);
                        int fadingEdgeLength = android.view.ViewConfiguration.getFadingEdgeLength();
                        int i19 = -(-android.text.TextUtils.indexOf(str, str, 0, 0));
                        java.lang.Object[] objArr15 = new java.lang.Object[1];
                        c((fadingEdgeLength >> 16) + 30, (byte) (((i19 | 16) << 1) - (i19 ^ 16)), "\u000f\r\u0007\u0014\u000f\r\f\u0016\f\u0005\u000e\u001a \u0013\u0001\u0005\u0014\u000b\u0015\u001d\u001e\u0017\t\u001c\f\u0005\u0014\f\u0002\u0010", objArr15);
                        java.lang.Object[] objArr16 = {(java.lang.String) objArr15[0]};
                        java.lang.Object obj12 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                        if (obj12 == null) {
                            java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(39 - android.graphics.ImageFormat.getBitsPerPixel(0), (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1920, (char) (1 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))));
                            byte b5 = $$a[14];
                            java.lang.Object[] objArr17 = new java.lang.Object[1];
                            a((short) (b5 + 1), b5, r11[16], objArr17);
                            obj12 = cls5.getMethod((java.lang.String) objArr17[0], java.lang.String.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj12);
                        }
                        java.lang.Object invoke2 = ((java.lang.reflect.Method) obj12).invoke(null, objArr16);
                        if (invoke != null) {
                            int i20 = SdkCoreAlternateContactlessPaymentDataImpl;
                            getProfileVersion = ((i20 ^ 115) + ((i20 & 115) << 1)) % 128;
                            java.lang.Object[] objArr18 = {invoke, 42};
                            java.lang.Object obj13 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                            if (obj13 == null) {
                                java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf(str, c) + 29, (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2594, (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                                byte b6 = $$a[14];
                                obj7 = invoke;
                                java.lang.Object[] objArr19 = new java.lang.Object[1];
                                a((short) (b6 + 1), b6, r10[16], objArr19);
                                obj13 = cls6.getMethod((java.lang.String) objArr19[0], java.lang.String.class, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj13);
                            } else {
                                obj7 = invoke;
                            }
                            long longValue2 = ((java.lang.Long) ((java.lang.reflect.Method) obj13).invoke(null, objArr18)).longValue();
                            long j12 = ~longValue2;
                            long j13 = (-1170825574) | j9;
                            j = j9;
                            j2 = j8;
                            long j14 = (242 * longValue2) + 565508751759L + (((~(j12 | (-1170825574))) | (~j13)) * (-241)) + ((1170825573 | longValue2) * (-482)) + (((~(longValue2 | j13)) | (~(1170825573 | j12))) * 241) + 86274951;
                            int i21 = ((int) (j14 >> 32)) & (((((~(1009683603 | i)) | (-2117049812)) * 345) - 484646000) + (((~(1009683603 | i10)) | 268992530) * 345) + ((~(2117049811 | i)) * 345));
                            int i22 = ~(2083032423 | i);
                            int i23 = ((int) j14) & ((((-774708463) | i22) * (-220)) + 744488531 + ((i22 | (-2116918768)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE) + 1046776030);
                            if (((i23 ^ i21) | (i21 & i23)) != 477111747) {
                            }
                            if (android.os.Build.VERSION.SDK_INT <= 33) {
                                int i24 = -(-(android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                                java.lang.Object[] objArr20 = new java.lang.Object[1];
                                b("栗걛䮩籵嗮쓤詇炃凿噅\ue9b1搽❌镙ᯬ\uedd8鍼梣䘣끃㟁䜅琤瞫㜴㸭ή뗏", (i24 & 27) + (i24 | 27), objArr20);
                                java.lang.Object[] objArr21 = {(java.lang.String) objArr20[0]};
                                java.lang.Object obj14 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1161224381);
                                if (obj14 == null) {
                                    java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.blue(0) + 36, 3161 - android.graphics.Color.alpha(0), (char) (33099 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16)));
                                    byte b7 = $$a[14];
                                    java.lang.Object[] objArr22 = new java.lang.Object[1];
                                    a((short) (b7 + 1), b7, r6[16], objArr22);
                                    obj14 = cls7.getMethod((java.lang.String) objArr22[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1161224381, obj14);
                                }
                                long j15 = ~((java.lang.Long) ((java.lang.reflect.Method) obj14).invoke(null, objArr21)).longValue();
                                long j16 = ~(j15 | j2);
                                long j17 = (((((r5 * 246) - 102687329240L) + (((~(j15 | 420849710)) | (~(j15 | j))) * (-245))) + ((-245) * j16)) + ((420849710 | j16) * 245)) - 1758517818;
                                int i25 = ((int) (j17 >> 32)) & ((((~(736749295 | i10)) | (~((-2120991590) | i))) * 959) + 1093761887 + (((~(736749295 | i)) | (~((-2120991590) | i10))) * 959));
                                int i26 = ((int) j17) & ((((~((-1794434159) | i10)) | 1063306727) * (-602)) + 1977065697 + (((~((-1794434159) | i)) | 710984806 | (~(2146756079 | i10))) * (-301)) + ((~(1063306727 | i10)) * 301));
                                if (((i25 ^ i26) | (i25 & i26)) == 1) {
                                    SdkCoreAlternateContactlessPaymentDataImpl = (getProfileVersion + 9) % 128;
                                    c2 = 0;
                                    i9 = 1;
                                    int[] iArr = new int[i9];
                                    int[] iArr2 = new int[i9];
                                    iArr[c2] = i;
                                    iArr2[c2] = (~(i & com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE)) & (i | com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE);
                                    java.lang.Object[] objArr23 = {iArr, iArr2, null, new int[i9]};
                                    java.lang.Object[] objArr24 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf(((~(i | 339477345)) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING) + 2140632599 + (((~(339477345 | i10)) | 336069472) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING))};
                                    java.lang.Object obj15 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                    if (obj15 == null) {
                                        java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionChild(0L) + 51, 2713 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), (char) android.view.KeyEvent.normalizeMetaState(0));
                                        byte b8 = $$a[14];
                                        java.lang.Object[] objArr25 = new java.lang.Object[1];
                                        a((short) 653, b8, (byte) (b8 + 1), objArr25);
                                        obj15 = cls8.getMethod((java.lang.String) objArr25[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj15);
                                    }
                                    ((int[]) objArr23[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj15).invoke(null, objArr24)).intValue();
                                    return objArr23;
                                }
                                int i27 = -android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                                java.lang.Object[] objArr26 = new java.lang.Object[1];
                                b("鯂⺢岽炋棂稼ㄴ鸏", ((i27 | 8) << 1) - (i27 ^ 8), objArr26);
                                java.lang.String str8 = (java.lang.String) objArr26[0];
                                int i28 = -(-android.graphics.Color.green(0));
                                int i29 = -(-(android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                java.lang.Object[] objArr27 = new java.lang.Object[1];
                                c((i28 & 6) + (i28 | 6), (byte) ((i29 ^ 10) + ((i29 & 10) << 1)), "\u001a\u000f\u0017\u0001\u001f\u000b", objArr27);
                                java.lang.String str9 = (java.lang.String) objArr27[0];
                                java.lang.Object[] objArr28 = new java.lang.Object[1];
                                c(8 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (byte) (116 - ((byte) android.view.KeyEvent.getModifierMetaStateMask())), "\u0011\u0016\u0013\u0015\u0002\u0010㙳", objArr28);
                                java.lang.String str10 = (java.lang.String) objArr28[0];
                                int resolveSize = android.view.View.resolveSize(0, 0);
                                java.lang.Object[] objArr29 = new java.lang.Object[1];
                                b("껩蔽갗؝桁쉘漤틲\ue2a4㐹", ((resolveSize | 9) << 1) - (resolveSize ^ 9), objArr29);
                                java.lang.String str11 = (java.lang.String) objArr29[0];
                                java.lang.Object[] objArr30 = new java.lang.Object[1];
                                b("먀뼜蟵炠샱絭", (-43) - (~android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), objArr30);
                                java.lang.String str12 = (java.lang.String) objArr30[0];
                                int lastIndexOf = android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                                int i30 = lastIndexOf * 659;
                                int i31 = ((i30 | (-9198)) << 1) - (i30 ^ (-9198));
                                int i32 = ~lastIndexOf;
                                int i33 = ~((i32 ^ 14) | (i32 & 14));
                                int i34 = ~((lastIndexOf ^ (-15)) | (lastIndexOf & (-15)));
                                int i35 = (i33 ^ i34) | (i33 & i34);
                                int i36 = ~((lastIndexOf ^ i) | (lastIndexOf & i));
                                int i37 = -(-(((i35 ^ i36) | (i35 & i36)) * (-658)));
                                int i38 = (i31 & i37) + (i37 | i31);
                                int i39 = i34 * 658;
                                int i40 = -(android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                java.lang.Object[] objArr31 = new java.lang.Object[1];
                                c((((i38 | i39) << 1) - (i39 ^ i38)) + (((i34 ^ i36) | (i36 & i34)) * 658), (byte) ((i40 & 117) + (i40 | 117)), "\u000b\u0005\u0000\u0001\n\u000f\u0005\u0002\u0013\u0006\u000e\u0014㙮", objArr31);
                                java.lang.String str13 = (java.lang.String) objArr31[0];
                                int i41 = -(-android.text.TextUtils.indexOf(str, str, 0, 0));
                                java.lang.Object[] objArr32 = new java.lang.Object[1];
                                b("쀽봕掉\ueeaa嚨馷", ((i41 | 5) << 1) - (i41 ^ 5), objArr32);
                                java.lang.String str14 = (java.lang.String) objArr32[0];
                                int i42 = -(-(android.view.ViewConfiguration.getTouchSlop() >> 8));
                                java.lang.Object[] objArr33 = new java.lang.Object[1];
                                b("ꙇ紖桁쉘혈圾", ((i42 | 6) << 1) - (i42 ^ 6), objArr33);
                                java.lang.String str15 = (java.lang.String) objArr33[0];
                                int i43 = -android.os.Process.getGidForName(str);
                                java.lang.Object[] objArr34 = new java.lang.Object[1];
                                b("씕핪", (i43 & 1) + (i43 | 1), objArr34);
                                java.lang.String str16 = (java.lang.String) objArr34[0];
                                int i44 = -(android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                java.lang.Object[] objArr35 = new java.lang.Object[1];
                                b("ໟᲄ⩫ᝑ桁쉘ᷞ頎嫑밾疄\uf381茞푹\uda09⳦", (i44 ^ 16) + ((i44 & 16) << 1), objArr35);
                                java.lang.String str17 = (java.lang.String) objArr35[0];
                                float scrollFriction = android.view.ViewConfiguration.getScrollFriction();
                                int i45 = -android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                                int i46 = i45 * (-589);
                                int i47 = ~(i10 | (-8));
                                int i48 = ~((i45 ^ (-8)) | (i45 & (-8)));
                                int i49 = (i47 ^ i48) | (i47 & i48);
                                int i50 = ~(i10 | i45);
                                int i51 = ~i45;
                                int i52 = (i51 ^ 7) | (i51 & 7);
                                int i53 = ((((i46 | 4137) << 1) - (i46 ^ 4137)) - (~(-(-((((i49 & i50) | (i49 ^ i50)) | (~((i52 ^ i) | (i52 & i)))) * 590))))) - 1;
                                int i54 = ~((i10 ^ (-8)) | (i10 & (-8)));
                                int i55 = -(-(((i54 ^ i48) | (i48 & i54) | i50) * (-1180)));
                                int i56 = (i53 ^ i55) + ((i55 & i53) << 1);
                                int i57 = ((~(i51 | i10)) | (~((i10 ^ 7) | (i10 & 7)))) * 590;
                                java.lang.Object[] objArr36 = new java.lang.Object[1];
                                c(8 - (~(scrollFriction > 0.0f ? 1 : (scrollFriction == 0.0f ? 0 : -1))), (byte) (((i56 | i57) << 1) - (i57 ^ i56)), "\u0000\u000e\u0006\u0001\u0019\t\u000e\n\u000f\f", objArr36);
                                java.lang.String str18 = (java.lang.String) objArr36[0];
                                int lastIndexOf2 = android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                java.lang.Object[] objArr37 = new java.lang.Object[1];
                                b("魪\udc62់吟ᦻῐ\ue534쑅", (lastIndexOf2 ^ 9) + ((lastIndexOf2 & 9) << 1), objArr37);
                                java.lang.String str19 = (java.lang.String) objArr37[0];
                                int i58 = -(-(android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16));
                                java.lang.Object[] objArr38 = new java.lang.Object[1];
                                b("魪\udc62\ue899嬅᧥励\ue9b1搽퐒ᔭ\u0015鰛", (i58 ^ 12) + ((i58 & 12) << 1), objArr38);
                                java.lang.String str20 = (java.lang.String) objArr38[0];
                                int keyRepeatTimeout = android.view.ViewConfiguration.getKeyRepeatTimeout();
                                int maxKeyCode = android.view.KeyEvent.getMaxKeyCode() >> 16;
                                int i59 = maxKeyCode * (-344);
                                int i60 = ~maxKeyCode;
                                int i61 = ~(i60 | i10);
                                int i62 = ~((maxKeyCode & (-6)) | (maxKeyCode ^ (-6)));
                                int i63 = (i59 ^ (-1720)) + ((i59 & (-1720)) << 1);
                                int i64 = (i60 ^ (-6)) | (i60 & (-6));
                                int i65 = ((i63 + (((~((i60 & i) | (i60 ^ i))) | (~i64)) * 345)) - (~(((i62 ^ i61) | (i61 & i62)) * 345))) - 1;
                                int i66 = -(-((~((i64 & i) | (i64 ^ i))) * 345));
                                java.lang.Object[] objArr39 = new java.lang.Object[1];
                                c((keyRepeatTimeout >> 16) + 14, (byte) ((i65 & i66) + (i66 | i65)), "\u0014\r\u0010\u0006\f\r㗻㗻\u0005\u0010\u0005\f\u0001\u0003", objArr39);
                                java.lang.String str21 = (java.lang.String) objArr39[0];
                                int i67 = -(-android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0));
                                int rgb = android.graphics.Color.rgb(0, 0, 0);
                                int i68 = rgb * 165;
                                int i69 = (1560279458 & i68) + (i68 | 1560279458) + (((~((16777226 ^ i10) | (16777226 & i10))) | rgb) * (-328));
                                int i70 = -(-(((rgb ^ i) | (rgb & i)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE));
                                int i71 = (i69 ^ i70) + ((i70 & i69) << 1);
                                int i72 = ~rgb;
                                int i73 = ~((i72 ^ (-16777227)) | ((-16777227) & i72));
                                int i74 = ~(((-16777227) ^ i) | ((-16777227) & i));
                                int i75 = (rgb ^ i10) | (rgb & i10);
                                int i76 = ((i73 ^ i74) | (i73 & i74) | (~((i75 ^ 16777226) | (16777226 & i75)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE;
                                java.lang.Object[] objArr40 = new java.lang.Object[1];
                                c(((i67 | 8) << 1) - (i67 ^ 8), (byte) ((i71 & i76) + (i76 | i71)), "\u0010\u0002\u0012\u0011\u0017\u001e㗸", objArr40);
                                java.lang.String str22 = (java.lang.String) objArr40[0];
                                int i77 = -android.view.View.getDefaultSize(0, 0);
                                int i78 = i77 * (-721);
                                int i79 = ~i77;
                                int i80 = ~(i79 | (-8));
                                int i81 = (i80 ^ i10) | (i80 & i10);
                                int i82 = ~(i77 | 7);
                                int i83 = -(-(((i81 ^ i82) | (i81 & i82)) * 1444));
                                int i84 = ~((i77 ^ 7) | (i77 & 7));
                                int i85 = ~(i77 | i);
                                int i86 = (i84 ^ i85) | (i84 & i85);
                                int i87 = ~((i ^ 7) | (i & 7));
                                int i88 = ((((((i78 | (-5047)) << 1) - (i78 ^ (-5047))) - (~i83)) - 1) - (~(-(-(((i86 & i87) | (i86 ^ i87)) * (-1444)))))) - 1;
                                int i89 = -(-(((~((i77 ^ (-8)) | (i77 & (-8)))) | (~(i79 | 7))) * 722));
                                java.lang.Object[] objArr41 = new java.lang.Object[1];
                                b("⍆넅懃皗뵵攆嚨馷", (i88 ^ i89) + ((i89 & i88) << 1), objArr41);
                                java.lang.String str23 = (java.lang.String) objArr41[0];
                                int i90 = -(-android.text.TextUtils.getCapsMode(str, 0, 0));
                                java.lang.Object[] objArr42 = new java.lang.Object[1];
                                b("࢜럞샱絭ǿ\ue337㪥둍", ((i90 | 7) << 1) - (i90 ^ 7), objArr42);
                                java.lang.String str24 = (java.lang.String) objArr42[0];
                                java.lang.Object[] objArr43 = new java.lang.Object[1];
                                c(2 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (byte) (74 - (~(-android.text.TextUtils.indexOf(str, str, 0)))), "㘴㘴", objArr43);
                                java.lang.String str25 = (java.lang.String) objArr43[0];
                                int i91 = -(android.view.ViewConfiguration.getScrollDefaultDelay() >> 16);
                                java.lang.Object[] objArr44 = new java.lang.Object[1];
                                b("嫑밾戒葈ꮣ窢ⵓ播述섥砶\uf606់吟䝼矙偒钄螙족", (i91 & 20) + (i91 | 20), objArr44);
                                java.lang.String str26 = (java.lang.String) objArr44[0];
                                int maxKeyCode2 = android.view.KeyEvent.getMaxKeyCode() >> 16;
                                int i92 = maxKeyCode2 * 829;
                                int i93 = (i92 & 4974) + (i92 | 4974);
                                int i94 = ~((~maxKeyCode2) | (-7));
                                int i95 = i10 | maxKeyCode2;
                                int i96 = ~((i95 ^ 6) | (i95 & 6));
                                int i97 = ((i94 ^ i96) | (i94 & i96)) * (-828);
                                int i98 = ((i93 | i97) << 1) - (i97 ^ i93);
                                int i99 = (maxKeyCode2 ^ 6) | (maxKeyCode2 & 6);
                                int i100 = -(-(((i99 ^ i10) | (i99 & i10)) * (-828)));
                                java.lang.Object[] objArr45 = new java.lang.Object[1];
                                b("嫑밾ᦻῐ閤\ud930", ((((i98 | i100) << 1) - (i100 ^ i98)) - (~(-(-((~(maxKeyCode2 | 6)) * 828))))) - 1, objArr45);
                                java.lang.String str27 = (java.lang.String) objArr45[0];
                                int i101 = -(android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                java.lang.Object[] objArr46 = new java.lang.Object[1];
                                b("躓ぎ", ((i101 | 2) << 1) - (i101 ^ 2), objArr46);
                                java.lang.String str28 = (java.lang.String) objArr46[0];
                                int pressedStateDuration = android.view.ViewConfiguration.getPressedStateDuration();
                                int i102 = -(-android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0));
                                java.lang.Object[] objArr47 = new java.lang.Object[1];
                                c((pressedStateDuration >> 16) + 16, (byte) (((i102 | 126) << 1) - (i102 ^ 126)), "\u0015\u001a\u0005\u000b\u0001\u0000\u001c\u0002\u000f\b\u0012\u0002\u0018\u0003\u0013\u0015", objArr47);
                                java.lang.String str29 = (java.lang.String) objArr47[0];
                                int i103 = -(-(android.os.Process.myPid() >> 22));
                                int i104 = -(android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                java.lang.Object[] objArr48 = new java.lang.Object[1];
                                c(8 - (~i103), (byte) ((i104 & 125) + (i104 | 125)), "\u0002\f\u001d\u000f\u0001\u0016\u0018\u0003㙯", objArr48);
                                java.lang.String str30 = (java.lang.String) objArr48[0];
                                int i105 = (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                int i106 = -android.text.TextUtils.indexOf(str, str, 0);
                                java.lang.Object[] objArr49 = new java.lang.Object[1];
                                c((i105 ^ 11) + ((i105 & 11) << 1), (byte) ((i106 ^ 88) + ((i106 & 88) << 1)), "\u0002\f\u001d\u000f\u0001\u0016\u0018\u0003\u0017\t", objArr49);
                                java.lang.String str31 = (java.lang.String) objArr49[0];
                                int i107 = -android.widget.ExpandableListView.getPackedPositionGroup(0L);
                                java.lang.Object[] objArr50 = new java.lang.Object[1];
                                b("鱩ힷⱮ⡬桁쉘登⊋ǿ\ue337ὰ㎪", ((i107 | 11) << 1) - (i107 ^ 11), objArr50);
                                java.lang.String str32 = (java.lang.String) objArr50[0];
                                java.lang.Object[] objArr51 = new java.lang.Object[1];
                                c(12 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (byte) (114 - android.view.View.resolveSize(0, 0)), "\u0017\u001e\u0011\u0003\"\u0011#\u0000\"\u000b㙧", objArr51);
                                java.lang.String str33 = (java.lang.String) objArr51[0];
                                int i108 = -android.view.Gravity.getAbsoluteGravity(0, 0);
                                int i109 = -android.view.View.resolveSizeAndState(0, 0, 0);
                                int i110 = (i109 * (-495)) - 37620;
                                int i111 = ~i109;
                                int i112 = ~(i111 | (-77));
                                int i113 = ~((i111 ^ i) | (i111 & i));
                                int i114 = ((i113 & i112) | (i112 ^ i113)) * 992;
                                int i115 = (i110 & i114) + (i110 | i114);
                                int i116 = ~(i111 | i);
                                int i117 = (i116 ^ i112) | (i112 & i116);
                                int i118 = i109 | i10;
                                int i119 = ~((i118 ^ 76) | (i118 & 76));
                                int i120 = -(-(((i119 ^ i117) | (i119 & i117)) * (-496)));
                                java.lang.Object[] objArr52 = new java.lang.Object[1];
                                c(((i108 | 15) << 1) - (i108 ^ 15), (byte) ((i115 & i120) + (i120 | i115) + (((i ^ 76) | (i & 76)) * 496)), "\u0017\u001e\u0011\u0003\"\u0011 \f\u0001\n#\u0000\"\u000b㙁", objArr52);
                                java.lang.String str34 = (java.lang.String) objArr52[0];
                                int capsMode = android.text.TextUtils.getCapsMode(str, 0, 0);
                                java.lang.Object[] objArr53 = new java.lang.Object[1];
                                b("窤\uefc0ⵓ播\udcbeృ䟹枀\ua635螯凂珖럆\udae7", (capsMode & 14) + (capsMode | 14), objArr53);
                                java.lang.String[] strArr2 = {str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, (java.lang.String) objArr53[0]};
                                java.lang.Object[] objArr54 = new java.lang.Object[1];
                                b("㮽łᦻ煘戒葈흖\uf5c2戒葈ᵕ龌", (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 11, objArr54);
                                java.lang.Object[] objArr55 = {(java.lang.String) objArr54[0]};
                                obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                if (obj2 == null) {
                                    java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.os.Process.myPid() >> 22), (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1920, (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                                    byte b9 = $$a[14];
                                    java.lang.Object[] objArr56 = new java.lang.Object[1];
                                    a((short) (b9 + 1), b9, r8[16], objArr56);
                                    obj2 = cls9.getMethod((java.lang.String) objArr56[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj2);
                                }
                                str2 = (java.lang.String) ((java.lang.reflect.Method) obj2).invoke(null, objArr55);
                                if (str2 != null) {
                                    int i121 = (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                    java.lang.Object[] objArr57 = new java.lang.Object[1];
                                    c((i121 ^ 5) + ((i121 & 5) << 1), (byte) ((android.view.ViewConfiguration.getTapTimeout() >> 16) + 46), "\u000f\u001a\u0005\u0017\u0016\u0013", objArr57);
                                    java.lang.String str35 = (java.lang.String) objArr57[0];
                                    java.lang.Object[] objArr58 = new java.lang.Object[1];
                                    b("锾ם된葇쒃Ｚ⍆넅", 7 - (~(-(-(android.view.ViewConfiguration.getTapTimeout() >> 16)))), objArr58);
                                    java.lang.String[] strArr3 = {str35, (java.lang.String) objArr58[0]};
                                    for (int i122 = 0; i122 < 2; i122++) {
                                        SdkCoreAlternateContactlessPaymentDataImpl = (getProfileVersion + 67) % 128;
                                        if (str2.contains(strArr3[i122])) {
                                            java.lang.Object[] objArr59 = new java.lang.Object[1];
                                            c(21 - (~(android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))), (byte) (18 - (android.view.ViewConfiguration.getTouchSlop() >> 8)), "\u000f\r\u0007\u0014\u000f\r\f\u0016\f\u0005\u000b\u0014\u001d!\u0016\u0006\u001d\u000f\u0006\u0018\u0010\u0002㗺", objArr59);
                                            java.lang.Object[] objArr60 = {(java.lang.String) objArr59[0]};
                                            java.lang.Object obj16 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                            if (obj16 == null) {
                                                java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myPid() >> 22) + 40, (android.view.ViewConfiguration.getTapTimeout() >> 16) + 1921, (char) android.view.View.getDefaultSize(0, 0));
                                                byte b10 = $$a[14];
                                                java.lang.Object[] objArr61 = new java.lang.Object[1];
                                                a((short) (b10 + 1), b10, r8[16], objArr61);
                                                obj16 = cls10.getMethod((java.lang.String) objArr61[0], java.lang.String.class);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj16);
                                            }
                                            java.lang.Object invoke3 = ((java.lang.reflect.Method) obj16).invoke(null, objArr60);
                                            int i123 = (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                            java.lang.Object[] objArr62 = new java.lang.Object[1];
                                            c((i123 ^ 30) + ((i123 & 30) << 1), (byte) (14 - (~(-((byte) android.view.KeyEvent.getModifierMetaStateMask())))), "\u000f\r\u0007\u0014\u000f\r\f\u0016\f\u0005\u000e\u001a \u0013\u0001\u0005\u0014\u000b\u0015\u001d\u001e\u0017\t\u001c\f\u0005\u0014\f\u0002\u0010", objArr62);
                                            java.lang.Object[] objArr63 = {(java.lang.String) objArr62[0]};
                                            java.lang.Object obj17 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                            if (obj17 == null) {
                                                java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(((android.os.Process.getThreadPriority(0) + 20) >> 6) + 40, 1922 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) ((-1) - android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                                                byte b11 = $$a[14];
                                                java.lang.Object[] objArr64 = new java.lang.Object[1];
                                                a((short) (b11 + 1), b11, r9[16], objArr64);
                                                obj17 = cls11.getMethod((java.lang.String) objArr64[0], java.lang.String.class);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj17);
                                            }
                                            java.lang.Object invoke4 = ((java.lang.reflect.Method) obj17).invoke(null, objArr63);
                                            if (invoke3 != null) {
                                                java.lang.Object[] objArr65 = {invoke3, 42};
                                                java.lang.Object obj18 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                                if (obj18 == null) {
                                                    java.lang.Class cls12 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 29, android.view.View.resolveSizeAndState(0, 0, 0) + 2594, (char) android.text.TextUtils.getOffsetBefore(str, 0));
                                                    byte b12 = $$a[14];
                                                    java.lang.Object[] objArr66 = new java.lang.Object[1];
                                                    a((short) (b12 + 1), b12, r8[16], objArr66);
                                                    obj18 = cls12.getMethod((java.lang.String) objArr66[0], java.lang.String.class, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj18);
                                                }
                                                long longValue3 = ((java.lang.Long) ((java.lang.reflect.Method) obj18).invoke(null, objArr65)).longValue();
                                                long j18 = ~longValue3;
                                                long j19 = ~((-275307976) | longValue3);
                                                str3 = str;
                                                long j20 = ((-721) * longValue3) + 198497050696L + ((j | (~(j18 | 275307975)) | j19) * 1444) + (((~(j2 | (-275307976))) | j19 | (~(longValue3 | j2))) * (-1444)) + (((~(275307975 | longValue3)) | (~((-275307976) | j18))) * 722) + 1532408500;
                                                int i124 = ((int) (j20 >> 32)) & (((((~((-440429912) | i)) | (~((-1877656323) | i10))) * com.visa.cbp.getCertUsage.getODAData) - 1686343195) + (((~((-1877656323) | i)) | (~((-440429912) | i10))) * com.visa.cbp.getCertUsage.getODAData));
                                                int i125 = ((int) j20) & (((((~((-20992002) | i10)) | (~((-707527169) | i))) * 988) - 271314287) + (((~(708707240 | i)) | (-729699242) | (~((-707527169) | i10))) * 988));
                                                if (((i124 ^ i125) | (i125 & i124)) != 477111747) {
                                                }
                                                int i126 = 0;
                                                for (int i127 = 0; i127 < 28; i127++) {
                                                    java.lang.String str36 = strArr2[i127];
                                                    int i128 = -android.graphics.Color.argb(0, 0, 0, 0);
                                                    int i129 = i128 * (-337);
                                                    int i130 = (i129 & 4068) + (i129 | 4068);
                                                    int i131 = ~i128;
                                                    int i132 = ~((i131 ^ i10) | (i131 & i10));
                                                    int i133 = ~(i128 | (-13));
                                                    int i134 = (i133 & i132) | (i132 ^ i133);
                                                    int i135 = ~((i128 ^ i) | (i128 & i));
                                                    int i136 = ((i134 & i135) | (i134 ^ i135)) * (-338);
                                                    int i137 = (i130 ^ i136) + ((i130 & i136) << 1);
                                                    int i138 = (~((i131 ^ 12) | (i131 & 12))) * 338;
                                                    int i139 = i128 | 12;
                                                    int i140 = ~((i139 ^ i) | (i139 & i));
                                                    java.lang.Object[] objArr67 = new java.lang.Object[1];
                                                    b("䪶瀷ㄴ鸏ǿ\ue337\uecea콣쨁鑰ىꕀ", (i137 & i138) + (i138 | i137) + (((i140 ^ i132) | (i140 & i132)) * 338), objArr67);
                                                    java.lang.Object[] objArr68 = {((java.lang.String) objArr67[0]).concat(java.lang.String.valueOf(str36))};
                                                    java.lang.Object obj19 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1161224381);
                                                    if (obj19 == null) {
                                                        java.lang.Class cls13 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (android.os.Process.myTid() >> 22) + 3161, (char) (android.widget.ExpandableListView.getPackedPositionType(0L) + 33099));
                                                        byte b13 = $$a[14];
                                                        java.lang.Object[] objArr69 = new java.lang.Object[1];
                                                        a((short) (b13 + 1), b13, r9[16], objArr69);
                                                        obj19 = cls13.getMethod((java.lang.String) objArr69[0], java.lang.String.class);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1161224381, obj19);
                                                    }
                                                    long longValue4 = ((java.lang.Long) ((java.lang.reflect.Method) obj19).invoke(null, objArr68)).longValue();
                                                    long j21 = ~longValue4;
                                                    long j22 = ~(longValue4 | j2);
                                                    int i141 = i126;
                                                    long j23 = ((((((-195) * longValue4) + 221281810785L) + (((~(j21 | (-565938135))) | j22) * (-196))) + (((-565938135) | longValue4) * 392)) + (((~(565938134 | j21)) | j22) * 196)) - 771729973;
                                                    int i142 = ((int) (j23 >> 32)) & ((((~((-1366866635) | i10)) | (~((-70359777) | i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) + 936313270 + (((~((-67174433) | i10)) | (~((-1363681291) | i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE));
                                                    int i143 = ((int) j23) & (((((~(1139163381 | i)) | 1377981505) * 398) - 1213217107) + (((~(1139163381 | i10)) | 1377981505) * 398));
                                                    int i144 = ((i142 ^ i143) | (i142 & i143)) == 0 ? 0 : 1;
                                                    int i145 = i144 * (-1975);
                                                    int i146 = i141 * com.paypal.oslo.feature.onboarding.signup.welcome.ui.state.WelcomeAnimationConstantsKt.TransferFrameEnd;
                                                    int i147 = (i145 & i146) + (i145 | i146);
                                                    int i148 = ~i144;
                                                    int i149 = ~((i148 ^ i141) | (i148 & i141));
                                                    int i150 = -(-(((i149 & i) | (i ^ i149)) * 988));
                                                    int i151 = ((i147 | i150) << 1) - (i150 ^ i147);
                                                    int i152 = ~i141;
                                                    int i153 = ~((i152 & i144) | (i152 ^ i144));
                                                    int i154 = ~(i144 | i10);
                                                    int i155 = -(-(((i154 ^ i153) | (i153 & i154)) * (-1976)));
                                                    int i156 = (i151 & i155) + (i155 | i151);
                                                    int i157 = ~((i152 & i) | (i152 ^ i));
                                                    int i158 = (i157 ^ i149) | (i149 & i157);
                                                    int i159 = ~(i10 | i141);
                                                    int i160 = ((i158 ^ i159) | (i158 & i159)) * 988;
                                                    i126 = (i156 & i160) + (i160 | i156);
                                                }
                                                if (i126 >= 25.2d) {
                                                    int i161 = SdkCoreAlternateContactlessPaymentDataImpl;
                                                    getProfileVersion = (((i161 | 103) << 1) - (i161 ^ 103)) % 128;
                                                    java.lang.Object[] objArr70 = {new int[]{i}, new int[]{(i & (-262)) | (i10 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE)}, null, new int[1]};
                                                    java.lang.Object[] objArr71 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf(((~(704507759 | i)) * (-301)) + 220274082 + (((~((-703440744) | i)) | (~(5884776 | i10))) * (-301)) + (((~(i | (-5884777))) | (-703440744)) * 301))};
                                                    java.lang.Object obj20 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                    if (obj20 == null) {
                                                        java.lang.Class cls14 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 50, (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 2712, (char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
                                                        byte b14 = $$a[14];
                                                        java.lang.Object[] objArr72 = new java.lang.Object[1];
                                                        a((short) 653, b14, (byte) (b14 + 1), objArr72);
                                                        obj20 = cls14.getMethod((java.lang.String) objArr72[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj20);
                                                    }
                                                    ((int[]) objArr70[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj20).invoke(null, objArr71)).intValue();
                                                    return objArr70;
                                                }
                                                int i162 = -(-android.graphics.Color.blue(0));
                                                java.lang.Object[] objArr73 = new java.lang.Object[1];
                                                b("䪶瀷ㄴ鸏縝갲\ue1b4廙̦럢샱絭\uf4af䔹\uf08b䞿댽\ufafe瓊ఛή뗏ᵕ龌", (i162 & 23) + (i162 | 23), objArr73);
                                                java.lang.Object[] objArr74 = {(java.lang.String) objArr73[0]};
                                                obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                                if (obj3 != null) {
                                                    str4 = str3;
                                                    java.lang.Class cls15 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 29, (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2807, (char) android.text.TextUtils.getOffsetBefore(str4, 0));
                                                    byte b15 = $$a[14];
                                                    java.lang.Object[] objArr75 = new java.lang.Object[1];
                                                    a((short) (b15 + 1), b15, r6[16], objArr75);
                                                    obj3 = cls15.getMethod((java.lang.String) objArr75[0], java.lang.String.class);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1729156627, obj3);
                                                } else {
                                                    str4 = str3;
                                                }
                                                long longValue5 = ((java.lang.Long) ((java.lang.reflect.Method) obj3).invoke(null, objArr74)).longValue();
                                                long j24 = ~longValue5;
                                                long j25 = (46 * longValue5) + 46184436954L + (((~(j24 | j)) | 1004009499) * (-90)) + (((~(longValue5 | 1004009499)) | (~(j24 | j2))) * (-45)) + (((~(j | 1004009499)) | j24 | (~(j2 | (-1004009500)))) * 45) + 286530568;
                                                int i163 = ((int) (j25 >> 32)) & ((((33817009 | i10) * 1324) - 818884594) + (((~(42340857 | i)) | (~(1394885553 | i))) * (-1324)) + 432064048);
                                                int i164 = ((int) j25) & (((((~(1353392105 | i10)) | 72622080) * 98) - 1761699848) + (((~(83834304 | i10)) | 1353392105 | (~((-83834305) | i))) * (-49)) + (((~(1353392105 | i)) | 11212224) * 49));
                                                j3 = (i163 ^ i164) | (i163 & i164);
                                                int i165 = -android.graphics.Color.rgb(0, 0, 0);
                                                java.lang.Object[] objArr76 = new java.lang.Object[1];
                                                b("괞贙㮽ł⨙\uecbe̦럢哢츈䪶瀷茞푹ᅇ\uedfa\uf605푼", ((-16777199) & i165) + (i165 | (-16777199)), objArr76);
                                                java.lang.Object[] objArr77 = {(java.lang.String) objArr76[0]};
                                                obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                                if (obj4 == null) {
                                                    java.lang.Class cls16 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(30 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2806, (char) (android.os.Process.myTid() >> 22));
                                                    byte b16 = $$a[14];
                                                    java.lang.Object[] objArr78 = new java.lang.Object[1];
                                                    a((short) (b16 + 1), b16, r6[16], objArr78);
                                                    obj4 = cls16.getMethod((java.lang.String) objArr78[0], java.lang.String.class);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1729156627, obj4);
                                                }
                                                long longValue6 = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr77)).longValue();
                                                long j26 = ~longValue6;
                                                str5 = str4;
                                                long j27 = (((-317) * longValue6) - 112529613790L) + (((~(j2 | 352757409)) | j26) * (-318)) + (((~(j26 | j2)) | (~(j | (-352757410) | longValue6))) * 318) + (((~(j26 | j | (-352757410))) | (~((-352757410) | longValue6 | j2))) * 318) + 1643297477;
                                                int i166 = ((int) (j27 >> 32)) & ((((~((-268453203) | i10)) * 130) - 1317600762) + (((~((-268453203) | i)) | (-2130440192)) * 130));
                                                int i167 = ~((-686231326) | i);
                                                int i168 = ((int) j27) & (((((~(753356701 | i10)) | (~((-750995085) | i))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL) - 754642723) + (((~(750995084 | i10)) | i167) * (-1040)) + ((i167 | (~(686231325 | i10)) | 2361617) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL));
                                                long j28 = (i166 ^ i168) | (i166 & i168);
                                                if (j3 <= 0 && j28 > 0 && j28 - 3 < j3) {
                                                    java.lang.Object[] objArr79 = {new int[]{i}, new int[]{(i & (-248)) | (i10 & 247)}, null, new int[1]};
                                                    java.lang.Object[] objArr80 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf((((~((-637506421) | i10)) | 71799632) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) + 1801722615 + ((~((-71799633) | i)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) + (((~(i | (-565706789))) | (~((-71819100) | i10)) | 19467) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE))};
                                                    java.lang.Object obj21 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                    if (obj21 == null) {
                                                        java.lang.Class cls17 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), 2713 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (1 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))));
                                                        byte b17 = $$a[14];
                                                        java.lang.Object[] objArr81 = new java.lang.Object[1];
                                                        a((short) 653, b17, (byte) (b17 + 1), objArr81);
                                                        obj21 = cls17.getMethod((java.lang.String) objArr81[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj21);
                                                    }
                                                    ((int[]) objArr79[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj21).invoke(null, objArr80)).intValue();
                                                    return objArr79;
                                                }
                                                int maxKeyCode3 = android.view.KeyEvent.getMaxKeyCode() >> 16;
                                                int i169 = maxKeyCode3 * (-244);
                                                int i170 = ((i169 | 5658) << 1) - (i169 ^ 5658);
                                                int i171 = ~((i10 ^ (-24)) | (i10 & (-24)));
                                                int i172 = ~((maxKeyCode3 & (-24)) | (maxKeyCode3 ^ (-24)));
                                                int i173 = -(-(((i171 ^ i172) | (i172 & i171)) * (-245)));
                                                int i174 = ~((i & (-24)) | (i ^ (-24)));
                                                java.lang.Object[] objArr82 = new java.lang.Object[1];
                                                b("䪶瀷ㄴ鸏縝갲\ue1b4廙̦럢샱絭\uf4af䔹\uf08b䞿댽\ufafe瓊ఛή뗏ᵕ龌", ((((i170 & i173) + (i173 | i170)) + ((~(i | (-24))) * (-245))) - (~(-(-(((maxKeyCode3 ^ i174) | (maxKeyCode3 & i174)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE))))) - 1, objArr82);
                                                java.lang.Object[] objArr83 = {(java.lang.String) objArr82[0]};
                                                obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                                if (obj5 == null) {
                                                    java.lang.Class cls18 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.ImageFormat.getBitsPerPixel(0) + 30, android.view.View.MeasureSpec.getSize(0) + 2807, (char) (android.os.Process.myTid() >> 22));
                                                    byte b18 = $$a[14];
                                                    java.lang.Object[] objArr84 = new java.lang.Object[1];
                                                    a((short) (b18 + 1), b18, r5[16], objArr84);
                                                    obj5 = cls18.getMethod((java.lang.String) objArr84[0], java.lang.String.class);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1729156627, obj5);
                                                }
                                                long longValue7 = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr83)).longValue();
                                                long j29 = ~((~longValue7) | 68359615);
                                                long j30 = ((-107) * longValue7) + 3759778825L + (((~(j | longValue7)) | (~((-68359616) | longValue7))) * (-108)) + (((~(j2 | (-68359616))) | j29 | (~(j | 68359615))) * 54) + ((j29 | j2) * 54) + 1222180452;
                                                int i175 = ((int) (j30 >> 32)) & ((((~(1621155191 | i10)) | (~(1236585693 | i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) + 1502737462 + (((~((-536875299) | i10)) | (~((-152305801) | i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE));
                                                int i176 = ((int) j30) & ((((~((-1882855690) | i)) | 445629279) * 56) + 1561536445 + (((~(445629279 | i10)) | (-1882855690)) * 56));
                                                j4 = (i175 ^ i176) | (i175 & i176);
                                                int i177 = -(android.view.ViewConfiguration.getEdgeSlop() >> 16);
                                                int i178 = ~i177;
                                                int i179 = ~((i178 ^ (-5)) | (i178 & (-5)) | i);
                                                int i180 = (i10 ^ i177) | (i10 & i177);
                                                int i181 = ~((i180 ^ 4) | (i180 & 4));
                                                int i182 = (i177 * (-317)) + 1276 + (((i179 ^ i181) | (i179 & i181)) * (-318));
                                                int i183 = ((~((i177 ^ (-5)) | (i177 & (-5)))) | (~(i177 | i))) * (-318);
                                                int i184 = ((i182 | i183) << 1) - (i183 ^ i182);
                                                int i185 = ((~(i178 | i)) | (-5)) * 318;
                                                int i186 = -(android.view.ViewConfiguration.getJumpTapTimeout() >> 16);
                                                java.lang.Object[] objArr85 = new java.lang.Object[1];
                                                c((i184 & i185) + (i185 | i184), (byte) ((i186 ^ 14) + ((i186 & 14) << 1)), "\u001c\r\u0001\u0010", objArr85);
                                                java.lang.Object[] objArr86 = {(java.lang.String) objArr85[0]};
                                                obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                                if (obj6 == null) {
                                                    java.lang.Class cls19 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - android.view.View.combineMeasuredStates(0, 0), 2806 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) android.view.KeyEvent.keyCodeFromString(str5));
                                                    byte b19 = $$a[14];
                                                    java.lang.Object[] objArr87 = new java.lang.Object[1];
                                                    a((short) (b19 + 1), b19, r8[16], objArr87);
                                                    obj6 = cls19.getMethod((java.lang.String) objArr87[0], java.lang.String.class);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1729156627, obj6);
                                                }
                                                long longValue8 = ((java.lang.Long) ((java.lang.reflect.Method) obj6).invoke(null, objArr86)).longValue();
                                                long j31 = longValue8 | j2;
                                                long j32 = (((-929) * longValue8) - 181303048192L) + (((~j31) | (-390739329)) * (-465)) + (((~(j2 | (-390739329))) | longValue8) * 930) + (((-390739329) | j31) * 465) + 899800739;
                                                j5 = (((int) (j32 >> 32)) & ((((((-1159992595) | i10) * 1444) - 1153123274) + ((((~(207822942 | i)) | (-1298609503)) | (~(1229403468 | i))) * (-1444))) - 3969852)) | (((int) j32) & (((((~(746922784 | i10)) | (-765801386)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) - 501357939) + ((~(765801385 | i)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) + (((~(690303625 | i10)) | 75497760 | (~((-18878602) | i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE)));
                                                if (j4 > 0 && j5 > 0) {
                                                    int i187 = getProfileVersion;
                                                    int i188 = ((i187 & 117) + (i187 | 117)) % 128;
                                                    SdkCoreAlternateContactlessPaymentDataImpl = i188;
                                                    if (j5 + 100 < j4) {
                                                        getProfileVersion = ((i188 ^ 67) + ((i188 & 67) << 1)) % 128;
                                                        java.lang.Object[] objArr88 = {new int[]{i}, new int[]{(~(i & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE)) & (i | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE)}, null, new int[1]};
                                                        java.lang.Object[] objArr89 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf((((~((-848016145) | i)) | (~((-138690625) | i))) * 69) + 1033275404 + (((~(i | (-917223349))) | 69207204 | (~((-207897829) | i))) * (-69)) + 156379895)};
                                                        java.lang.Object obj22 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                        if (obj22 == null) {
                                                            java.lang.Class cls20 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.getDeadChar(0, 0) + 50, 2712 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) ((-1) - android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)));
                                                            byte b20 = $$a[14];
                                                            java.lang.Object[] objArr90 = new java.lang.Object[1];
                                                            a((short) 653, b20, (byte) (b20 + 1), objArr90);
                                                            obj22 = cls20.getMethod((java.lang.String) objArr90[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj22);
                                                        }
                                                        ((int[]) objArr88[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj22).invoke(null, objArr89)).intValue();
                                                        return objArr88;
                                                    }
                                                }
                                                java.lang.Object[] objArr91 = new java.lang.Object[1];
                                                c(6 - (~(-android.widget.ExpandableListView.getPackedPositionType(0L))), (byte) (72 - android.text.TextUtils.indexOf(str5, str5, 0, 0)), "\u001a\u0013 \u0013\u0001\u0005㘿", objArr91);
                                                java.lang.String str37 = (java.lang.String) objArr91[0];
                                                java.lang.Object[] objArr92 = new java.lang.Object[1];
                                                b("䪶瀷ㄴ鸏ǿ\ue337\uecea콣쨁鑰곑펌", (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 10, objArr92);
                                                java.lang.String str38 = (java.lang.String) objArr92[0];
                                                java.lang.Object[] objArr93 = new java.lang.Object[1];
                                                b("䪶瀷ㄴ鸏ǿ\ue337\uecea콣촥爂ꈭ拋", 11 - (~(android.view.ViewConfiguration.getScrollDefaultDelay() >> 16)), objArr93);
                                                java.lang.String str39 = (java.lang.String) objArr93[0];
                                                int i189 = -(-(android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)));
                                                int i190 = -(-(android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                                                java.lang.Object[] objArr94 = new java.lang.Object[1];
                                                c(((i189 | 11) << 1) - (i189 ^ 11), (byte) ((i190 ^ 25) + ((i190 & 25) << 1)), "\u001a\u0013 \u0013\u0001\u0005\u0013\u001d\u0013\u0004\u000b\u0005", objArr94);
                                                java.lang.String str40 = (java.lang.String) objArr94[0];
                                                int i191 = -android.view.View.getDefaultSize(0, 0);
                                                int i192 = -android.graphics.Color.red(0);
                                                java.lang.Object[] objArr95 = new java.lang.Object[1];
                                                c((i191 ^ 11) + ((i191 & 11) << 1), (byte) ((i192 & 60) + (i192 | 60)), "\u001f\u0013\u0005\"\u0011\r\r\u001a\u0002\u0000㘰", objArr95);
                                                java.lang.String str41 = (java.lang.String) objArr95[0];
                                                java.lang.Object[] objArr96 = new java.lang.Object[1];
                                                c(4 - (~(-android.graphics.Color.green(0))), (byte) (57 - (~(-(-(android.view.ViewConfiguration.getScrollDefaultDelay() >> 16))))), "\u001a\u0013\u0002\u0000㘮", objArr96);
                                                java.lang.String str42 = (java.lang.String) objArr96[0];
                                                java.lang.Object[] objArr97 = new java.lang.Object[1];
                                                c(android.view.View.combineMeasuredStates(0, 0) + 4, (byte) (123 - (~(-(-android.view.KeyEvent.normalizeMetaState(0))))), "\u001c\u0001\u0005\f", objArr97);
                                                java.lang.String[] strArr4 = {str37, str38, str39, str40, str41, str42, (java.lang.String) objArr97[0]};
                                                i3 = 0;
                                                while (i3 < 7) {
                                                    int i193 = SdkCoreAlternateContactlessPaymentDataImpl + 59;
                                                    getProfileVersion = i193 % 128;
                                                    if (i193 % 2 != 0) {
                                                        java.lang.Object[] objArr98 = {strArr4[i3]};
                                                        java.lang.Object obj23 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2046560211);
                                                        if (obj23 == null) {
                                                            java.lang.Class cls21 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 1672, (char) (47940 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24)));
                                                            byte b21 = $$a[14];
                                                            java.lang.Object[] objArr99 = new java.lang.Object[1];
                                                            a((short) (b21 + 1), b21, r9[16], objArr99);
                                                            obj23 = cls21.getMethod((java.lang.String) objArr99[0], java.lang.String.class);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2046560211, obj23);
                                                        }
                                                        long longValue9 = ((java.lang.Long) ((java.lang.reflect.Method) obj23).invoke(null, objArr98)).longValue();
                                                        long j33 = ~((~longValue9) | j2);
                                                        long j34 = ((((((-574) * longValue9) - 271424667276L) + (((~(j | (-472865275))) | j33) * 1150)) + (((~(j | longValue9)) | j33) * (-575))) + (((~(j2 | (-472865275))) | (~(j | 472865274))) * 575)) - 2098395456;
                                                        int i194 = ((int) (j34 << 123)) & (((((-1202509355) | i) * 140) - 966750930) + (((~((-1202509355) | i10)) | 84148736) * (-280)) + (((~((-1655231531) | i10)) | 536870912 | (~((-84148737) | i))) * 140));
                                                        int i195 = ((int) j34) & (((((~((-10854466) | i)) | 150997000) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING) - 920431752) + ((~((-10854466) | i10)) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING));
                                                        i8 = i3;
                                                        if (((i194 ^ i195) | (i194 & i195)) != 0) {
                                                            i4 = i8 + 90;
                                                            break;
                                                        }
                                                        int i196 = ((i8 | 31) << 1) - (i8 ^ 31);
                                                        i3 = (i196 & (-30)) + (i196 | (-30));
                                                    } else {
                                                        java.lang.Object[] objArr100 = {strArr4[i3]};
                                                        java.lang.Object obj24 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2046560211);
                                                        if (obj24 == null) {
                                                            java.lang.Class cls22 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 28, 1672 - android.view.View.resolveSize(0, 0), (char) ((android.view.ViewConfiguration.getTouchSlop() >> 8) + 47940));
                                                            byte b22 = $$a[14];
                                                            java.lang.Object[] objArr101 = new java.lang.Object[1];
                                                            a((short) (b22 + 1), b22, r9[16], objArr101);
                                                            obj24 = cls22.getMethod((java.lang.String) objArr101[0], java.lang.String.class);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2046560211, obj24);
                                                        }
                                                        long longValue10 = ((java.lang.Long) ((java.lang.reflect.Method) obj24).invoke(null, objArr100)).longValue();
                                                        long j35 = ~longValue10;
                                                        long j36 = ~(250959460 | j35);
                                                        i8 = i3;
                                                        long j37 = ((((((-575) * longValue10) + 144301690075L) + (((~(j35 | j2)) | j36) * 576)) + (((~(250959460 | longValue10)) | (~((j35 | j) | (-250959461)))) * 576)) + (j36 * 576)) - 1374570721;
                                                        int i197 = ((int) (j37 >> 32)) & (((((~((-485625644) | i)) | 1922852054) * 56) - 487250046) + (((~(1922852054 | i10)) | (-485625644)) * 56));
                                                        int i198 = ~(1080758397 | i);
                                                        int i199 = ((int) j37) & ((((696355237 | i198) * (-658)) - 1394079377) + ((i198 | 696289664) * 658));
                                                        if (((i197 ^ i199) | (i197 & i199)) != 0) {
                                                            i4 = i8 + 90;
                                                            break;
                                                        }
                                                        int i1962 = ((i8 | 31) << 1) - (i8 ^ 31);
                                                        i3 = (i1962 & (-30)) + (i1962 | (-30));
                                                    }
                                                }
                                                i4 = 0;
                                                if (i4 == 0) {
                                                    java.lang.Object[] objArr102 = {new int[]{i}, new int[]{((~i4) & i) | (i4 & i10)}, null, new int[1]};
                                                    java.lang.Object[] objArr103 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf((((552221317 | i10) * (-757)) - 834729146) + ((~((-152371275) | i)) * 1514) + (((~(i | 704592591)) | (~((-157104203) | i10)) | 4732928) * 757))};
                                                    java.lang.Object obj25 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                    if (obj25 == null) {
                                                        java.lang.Class cls23 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 50, (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 2713, (char) ((-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())));
                                                        byte b23 = $$a[14];
                                                        java.lang.Object[] objArr104 = new java.lang.Object[1];
                                                        a((short) 653, b23, (byte) (b23 + 1), objArr104);
                                                        obj25 = cls23.getMethod((java.lang.String) objArr104[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj25);
                                                    }
                                                    ((int[]) objArr102[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj25).invoke(null, objArr103)).intValue();
                                                    return objArr102;
                                                }
                                                try {
                                                    objArr = new java.lang.Object[1];
                                                    b("㮽łﴤ鬺輸쳘된葇ᦻ煘䖻蠗뽢問", 12 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), objArr);
                                                } catch (java.lang.Exception unused) {
                                                }
                                                try {
                                                    java.lang.Object[] objArr105 = {(java.lang.String) objArr[0]};
                                                    java.lang.Object obj26 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                                    if (obj26 == null) {
                                                        java.lang.Class cls24 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), android.view.MotionEvent.axisFromString(str5) + 1922, (char) (1 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))));
                                                        byte b24 = $$a[14];
                                                        java.lang.Object[] objArr106 = new java.lang.Object[1];
                                                        a((short) (b24 + 1), b24, r5[16], objArr106);
                                                        obj26 = cls24.getMethod((java.lang.String) objArr106[0], java.lang.String.class);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj26);
                                                    }
                                                    java.lang.String str43 = (java.lang.String) ((java.lang.reflect.Method) obj26).invoke(null, objArr105);
                                                    try {
                                                        if (str43 != null) {
                                                            int defaultSize = android.view.View.getDefaultSize(0, 0);
                                                            int i200 = -(android.os.Process.myPid() >> 22);
                                                            java.lang.Object[] objArr107 = new java.lang.Object[1];
                                                            c(11 - defaultSize, (byte) ((i200 & 112) + (i200 | 112)), "\r#\u001d!\r\u0006\u0005\"\u0012\u0011㙮", objArr107);
                                                            java.lang.String[] strArr5 = {(java.lang.String) objArr107[0]};
                                                            for (int i201 = 0; i201 <= 0; i201++) {
                                                                if (!str43.contains(strArr5[i201])) {
                                                                }
                                                            }
                                                            i5 = 0;
                                                            if (i5 != 0) {
                                                                java.lang.Object[] objArr108 = {new int[]{i}, new int[]{i5 ^ i}, null, new int[1]};
                                                                java.lang.Object[] objArr109 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf((((~((-320732760) | i10)) * 979) - 1575210238) + ((388592760 | i) * (-979)) + (((~(i | (-320732760))) | (~(388592760 | i10))) * 979))};
                                                                java.lang.Object obj27 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                if (obj27 == null) {
                                                                    java.lang.Class cls25 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 49, android.view.View.MeasureSpec.getSize(0) + 2713, (char) android.graphics.Color.argb(0, 0, 0, 0));
                                                                    byte b25 = $$a[14];
                                                                    java.lang.Object[] objArr110 = new java.lang.Object[1];
                                                                    a((short) 653, b25, (byte) (b25 + 1), objArr110);
                                                                    obj27 = cls25.getMethod((java.lang.String) objArr110[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj27);
                                                                }
                                                                ((int[]) objArr108[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj27).invoke(null, objArr109)).intValue();
                                                                return objArr108;
                                                            }
                                                            java.lang.Object[] objArr111 = new java.lang.Object[1];
                                                            b("㮽łﴤ鬺輸쳘된葇ᦻ煘䖻蠗뽢問", 12 - (~(-(-(android.view.ViewConfiguration.getJumpTapTimeout() >> 16)))), objArr111);
                                                            java.lang.Object[] objArr112 = {(java.lang.String) objArr111[0]};
                                                            java.lang.Object obj28 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                                            if (obj28 == null) {
                                                                java.lang.Class cls26 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 40, android.view.KeyEvent.normalizeMetaState(0) + 1921, (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0));
                                                                byte b26 = $$a[14];
                                                                java.lang.Object[] objArr113 = new java.lang.Object[1];
                                                                a((short) (b26 + 1), b26, r5[16], objArr113);
                                                                obj28 = cls26.getMethod((java.lang.String) objArr113[0], java.lang.String.class);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj28);
                                                            }
                                                            java.lang.String str44 = (java.lang.String) ((java.lang.reflect.Method) obj28).invoke(null, objArr112);
                                                            if (str44 != null) {
                                                                int packedPositionChild2 = android.widget.ExpandableListView.getPackedPositionChild(0L);
                                                                int i202 = -(android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                                                java.lang.Object[] objArr114 = new java.lang.Object[1];
                                                                c(((packedPositionChild2 | 12) << 1) - (packedPositionChild2 ^ 12), (byte) (((i202 | 113) << 1) - (i202 ^ 113)), "\r#\u001d!\r\u0006\u0005\"\u0012\u0011㙮", objArr114);
                                                                java.lang.String[] strArr6 = {(java.lang.String) objArr114[0]};
                                                                int i203 = 0;
                                                                while (true) {
                                                                    if (i203 > 0) {
                                                                        java.lang.Object[] objArr115 = new java.lang.Object[1];
                                                                        b("썈쮌㩩犳낑햨ໟᲄ䅝\udc66藤鬙", 10 - (~(-android.text.TextUtils.indexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask))), objArr115);
                                                                        java.lang.String str45 = (java.lang.String) objArr115[0];
                                                                        int i204 = -(android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                                                        int i205 = -android.view.View.getDefaultSize(0, 0);
                                                                        java.lang.Object[] objArr116 = new java.lang.Object[1];
                                                                        c((i204 ^ 17) + ((i204 & 17) << 1), (byte) (((i205 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE) << 1) - (i205 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE)), "\u001c\r\u0018\u0003\u001c\u001a\u0000\u000e\u000f\u001d\u0001\u001a\u0002\u0000\u001f\u001d", objArr116);
                                                                        java.lang.String str46 = (java.lang.String) objArr116[0];
                                                                        int indexOf = android.text.TextUtils.indexOf(str5, str5, 0);
                                                                        int i206 = -android.text.TextUtils.indexOf(str5, str5, 0);
                                                                        java.lang.Object[] objArr117 = new java.lang.Object[1];
                                                                        c((indexOf & 17) + (indexOf | 17), (byte) ((i206 ^ 10) + ((i206 & 10) << 1)), "\u001c\r\u0018\u0003\u001c\u001a\u0000\u000e\u000f\u001d\u0001\u001a\u0013\u0004\u000b\u0005㖿", objArr117);
                                                                        java.lang.String str47 = (java.lang.String) objArr117[0];
                                                                        int i207 = -(-android.view.View.resolveSize(0, 0));
                                                                        java.lang.Object[] objArr118 = new java.lang.Object[1];
                                                                        b("䪶瀷쨁鑰ىꕀ", (i207 & 6) + (i207 | 6), objArr118);
                                                                        java.lang.String str48 = (java.lang.String) objArr118[0];
                                                                        int i208 = -android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                                                        java.lang.Object[] objArr119 = new java.lang.Object[1];
                                                                        b("䪶瀷ㄴ鸏ǿ\ue337\uecea콣쨁鑰ىꕀ", (i208 ^ 11) + ((i208 & 11) << 1), objArr119);
                                                                        java.lang.String str49 = (java.lang.String) objArr119[0];
                                                                        int size = android.view.View.MeasureSpec.getSize(0);
                                                                        java.lang.Object[] objArr120 = new java.lang.Object[1];
                                                                        b("䪶瀷ㄴ鸏ǿ\ue337\uecea콣쨁鑰ىꕀ\uf8a5ꦷ嶺\ude72膒흃", ((size | 17) << 1) - (size ^ 17), objArr120);
                                                                        java.lang.String str50 = (java.lang.String) objArr120[0];
                                                                        int absoluteGravity = android.view.Gravity.getAbsoluteGravity(0, 0);
                                                                        int i209 = -(-android.view.Gravity.getAbsoluteGravity(0, 0));
                                                                        java.lang.Object[] objArr121 = new java.lang.Object[1];
                                                                        c((absoluteGravity ^ 21) + ((absoluteGravity & 21) << 1), (byte) (((i209 | 103) << 1) - (i209 ^ 103)), "\u001a\u0013 \u0013\u0001\u0005\u0013\u001d\u0002\u0000\u001f\u001d\t\u001c\u0000\u0003\u0015\u001a\u0010\n㘜", objArr121);
                                                                        java.lang.String str51 = (java.lang.String) objArr121[0];
                                                                        int i210 = -android.view.View.getDefaultSize(0, 0);
                                                                        java.lang.Object[] objArr122 = new java.lang.Object[1];
                                                                        c((i210 ^ 16) + ((i210 & 16) << 1), (byte) (2 - (~(-android.view.View.getDefaultSize(0, 0)))), "\u001a\u0013 \u0013\u0001\u0005\u0013\u001d\u0016\u000e\u001c\u0013\u0002\u0000\u001f\u001d", objArr122);
                                                                        java.lang.String str52 = (java.lang.String) objArr122[0];
                                                                        int i211 = -(-(android.view.ViewConfiguration.getEdgeSlop() >> 16));
                                                                        java.lang.Object[] objArr123 = new java.lang.Object[1];
                                                                        b("䪶瀷ㄴ鸏ǿ\ue337\uecea콣⺌᠃တ鄠\u10ce⇮ꗱ윊✌剌驜態㮽ł៌ȸ膒흃", (i211 ^ 25) + ((i211 & 25) << 1), objArr123);
                                                                        java.lang.String str53 = (java.lang.String) objArr123[0];
                                                                        int i212 = -(android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                                                        java.lang.Object[] objArr124 = new java.lang.Object[1];
                                                                        b("䪶瀷ㄴ鸏ǿ\ue337\uecea콣霜땷ꈭ拋膒흃", (i212 & 14) + (i212 | 14), objArr124);
                                                                        java.lang.String str54 = (java.lang.String) objArr124[0];
                                                                        int i213 = -android.view.View.resolveSize(0, 0);
                                                                        java.lang.Object[] objArr125 = new java.lang.Object[1];
                                                                        b("魅厈넨屷킮嚬ꈭ拋膒흃", ((i213 | 9) << 1) - (i213 ^ 9), objArr125);
                                                                        java.lang.String str55 = (java.lang.String) objArr125[0];
                                                                        int fadingEdgeLength2 = android.view.ViewConfiguration.getFadingEdgeLength() >> 16;
                                                                        java.lang.Object[] objArr126 = new java.lang.Object[1];
                                                                        b("䪶瀷빢겚쨁鑰ىꕀ", (fadingEdgeLength2 ^ 8) + ((fadingEdgeLength2 & 8) << 1), objArr126);
                                                                        java.lang.String[] strArr7 = {str45, str46, str47, str48, str49, str50, str51, str52, str53, str54, str55, (java.lang.String) objArr126[0]};
                                                                        int i214 = 0;
                                                                        while (i214 < 12) {
                                                                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                                                            sb.append(strArr7[i214]);
                                                                            java.lang.Object[] objArr127 = new java.lang.Object[1];
                                                                            b("躓ぎ", 1 - (~(-android.text.TextUtils.getCapsMode(str5, 0, 0))), objArr127);
                                                                            sb.append((java.lang.String) objArr127[0]);
                                                                            java.lang.Object[] objArr128 = {sb.toString()};
                                                                            java.lang.Object obj29 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-604620973);
                                                                            if (obj29 == null) {
                                                                                java.lang.Class cls27 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 36, android.view.MotionEvent.axisFromString(str5) + 3162, (char) (33098 - android.text.TextUtils.indexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)));
                                                                                byte[] bArr = $$a;
                                                                                java.lang.Object[] objArr129 = new java.lang.Object[1];
                                                                                a((short) 618, bArr[23], bArr[16], objArr129);
                                                                                obj29 = cls27.getMethod((java.lang.String) objArr129[0], java.lang.String.class);
                                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-604620973, obj29);
                                                                            }
                                                                            long longValue11 = ((java.lang.Long) ((java.lang.reflect.Method) obj29).invoke(null, objArr128)).longValue();
                                                                            long j38 = ~longValue11;
                                                                            long j39 = (319 * longValue11) + 370986604165L + (((~(j | (-1170304745) | longValue11)) | (~(1170304744 | j38 | j2))) * (-318)) + (((~((-1170304745) | j38)) | (~(j2 | (-1170304745)))) * (-318)) + (((~(j2 | 1170304744)) | j38) * 318) + 2077775483;
                                                                            int i215 = ((int) (j39 >> 32)) & (((((~((-1525965315) | i)) | 88738903) * (-318)) - 482907786) + (((~(88738903 | i)) | (~((-84544598) | i10))) * 318) + (((~(1610509911 | i10)) | (~((-84544598) | i))) * 318));
                                                                            int i216 = ((int) j39) & ((((~(1593749503 | i10)) | (~((-136577426) | i10))) * (-184)) + 1019428157 + (((~(1583776669 | i10)) | 9972834 | (~((-146550260) | i10))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) + 3311272);
                                                                            if (((i215 ^ i216) | (i215 & i216)) != 0) {
                                                                                i6 = i214 + 110;
                                                                                break;
                                                                            }
                                                                            int i217 = ((i214 | (-22)) << 1) - (i214 ^ (-22));
                                                                            i214 = ((i217 | 23) << 1) - (i217 ^ 23);
                                                                        }
                                                                    } else {
                                                                        if (str44.contains(strArr6[i203])) {
                                                                            break;
                                                                        }
                                                                        i203++;
                                                                    }
                                                                }
                                                            }
                                                            i6 = 0;
                                                            if (i6 != 0) {
                                                                java.lang.Object[] objArr130 = {new int[]{i}, new int[]{(~(i6 & i)) & (i6 | i)}, null, new int[1]};
                                                                java.lang.Object[] objArr131 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf((((((-154563248) | i10) * 1444) - 322590975) + (((~(i | 415154876)) | ((~(294170643 | i)) | (-431944384))) * (-1444))) - 74485362)};
                                                                java.lang.Object obj30 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                if (obj30 == null) {
                                                                    java.lang.Class cls28 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.os.Process.myTid() >> 22), (android.view.ViewConfiguration.getTouchSlop() >> 8) + 2713, (char) ((-1) - android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)));
                                                                    byte b27 = $$a[14];
                                                                    java.lang.Object[] objArr132 = new java.lang.Object[1];
                                                                    a((short) 653, b27, (byte) (b27 + 1), objArr132);
                                                                    obj30 = cls28.getMethod((java.lang.String) objArr132[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj30);
                                                                }
                                                                ((int[]) objArr130[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj30).invoke(null, objArr131)).intValue();
                                                                return objArr130;
                                                            }
                                                            long[] jArr = {472001035};
                                                            int i218 = -android.widget.ExpandableListView.getPackedPositionChild(0L);
                                                            java.lang.Object[] objArr133 = new java.lang.Object[1];
                                                            b("괞贙㮽ł⨙\uecbe̦럢哢츈鐚劄登⊋螙족\uf605푼", (i218 ^ 16) + ((i218 & 16) << 1), objArr133);
                                                            java.lang.Object[] objArr134 = {(java.lang.String) objArr133[0], 5, java.lang.Long.valueOf(kotlinx.coroutines.internal.LockFreeTaskQueueCore.HEAD_MASK), jArr};
                                                            java.lang.Object obj31 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1441749806);
                                                            if (obj31 == null) {
                                                                java.lang.Class cls29 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson('U' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 3096 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (char) (android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1));
                                                                byte b28 = $$a[14];
                                                                java.lang.Object[] objArr135 = new java.lang.Object[1];
                                                                a((short) (b28 + 1), b28, r4[16], objArr135);
                                                                obj31 = cls29.getMethod((java.lang.String) objArr135[0], java.lang.String.class, java.lang.Integer.TYPE, java.lang.Long.TYPE, long[].class);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1441749806, obj31);
                                                            }
                                                            long j40 = ~((java.lang.Long) ((java.lang.reflect.Method) obj31).invoke(null, objArr134)).longValue();
                                                            long j41 = (-62644005) | j40;
                                                            long j42 = (((((r4 * (-344)) - 21549537376L) + (((~(j2 | (-62644005))) | (~j41)) * 345)) + (((~(j40 | 62644004)) | (~(j | (-62644005)))) * 345)) + ((~(j41 | j2)) * 345)) - 1973291914;
                                                            int i219 = ((int) (j42 >> 32)) & ((((~((-1614042642) | i)) | (~((-176816231) | i10))) * (-318)) + 1356217018 + (((~(1697939097 | i)) | (-1874755328)) * (-318)) + (((~((-1697939098) | i)) | 260712686) * 318));
                                                            int i220 = ((int) j42) & ((((340246668 | i) * 140) - 1955140831) + (((~(340246668 | i10)) | (-2113394367)) * (-280)) + (((~((-1777473079) | i10)) | 4325380 | (~(2113394366 | i))) * 140));
                                                            if (((i219 ^ i220) | (i219 & i220)) != 0) {
                                                                i7 = 240;
                                                            } else {
                                                                int i221 = SdkCoreAlternateContactlessPaymentDataImpl;
                                                                getProfileVersion = ((i221 & 81) + (i221 | 81)) % 128;
                                                                i7 = 0;
                                                            }
                                                            if (i7 != 0) {
                                                                java.lang.Object[] objArr136 = {new int[]{i}, new int[]{(~(i7 & i)) & (i7 | i)}, null, new int[1]};
                                                                java.lang.Object[] objArr137 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf((((~(i | 288497569)) | (~((-286266145) | i10)) | (-423059376)) * (-68)) + 1117856835 + ((~((-134561807) | i10)) * (-68)) + (((~((-288497570) | i10)) | (-420827951)) * 68))};
                                                                java.lang.Object obj32 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                if (obj32 == null) {
                                                                    java.lang.Class cls30 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.View.resolveSizeAndState(0, 0, 0), 2713 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
                                                                    byte b29 = $$a[14];
                                                                    java.lang.Object[] objArr138 = new java.lang.Object[1];
                                                                    a((short) 653, b29, (byte) (b29 + 1), objArr138);
                                                                    obj32 = cls30.getMethod((java.lang.String) objArr138[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj32);
                                                                }
                                                                ((int[]) objArr136[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj32).invoke(null, objArr137)).intValue();
                                                                return objArr136;
                                                            }
                                                            long[] jArr2 = {472001035};
                                                            java.lang.Object[] objArr139 = new java.lang.Object[1];
                                                            b("䪶瀷ㄴ鸏縝갲\ue1b4廙̦럢샱絭\uf4af䔹\uf08b䞿郮㗶샱絭퐌轉", 21 - (~android.view.View.getDefaultSize(0, 0)), objArr139);
                                                            try {
                                                                bufferedInputStream = new java.io.BufferedInputStream(new java.io.FileInputStream((java.lang.String) objArr139[0]));
                                                                j6 = 0;
                                                            } catch (java.io.IOException unused2) {
                                                                bufferedInputStream = null;
                                                            } catch (java.lang.Throwable th2) {
                                                                th = th2;
                                                                bufferedInputStream = null;
                                                            }
                                                            while (true) {
                                                                try {
                                                                    int read = bufferedInputStream.read();
                                                                    if (read != -1) {
                                                                        int i222 = SdkCoreAlternateContactlessPaymentDataImpl;
                                                                        int i223 = (i222 ^ 103) + ((i222 & 103) << 1);
                                                                        getProfileVersion = i223 % 128;
                                                                        j6 = i223 % 2 != 0 ? ((j6 << 5) % read) + kotlinx.coroutines.internal.LockFreeTaskQueueCore.HEAD_MASK : ((j6 << 5) ^ read) & kotlinx.coroutines.internal.LockFreeTaskQueueCore.HEAD_MASK;
                                                                        for (int i224 = 0; i224 <= 0; i224 = (i224 ^ 1) + ((i224 & 1) << 1)) {
                                                                            if (j6 == jArr2[i224]) {
                                                                                int i225 = ((i224 | 1) << 1) - (i224 ^ 1);
                                                                                try {
                                                                                    bufferedInputStream.close();
                                                                                } catch (java.lang.Exception unused3) {
                                                                                }
                                                                                if (i225 != 0) {
                                                                                    java.lang.Object[] objArr140 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE}, null, new int[1]};
                                                                                    java.lang.Object[] objArr141 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf((((~((-877704017) | i10)) | (~((-2361346) | i)) | (~(1048443857 | i))) * 765) + 301047087 + (((~((-880065362) | i10)) | 877704016) * 1530) + (((~(i | (-880065362))) | (~(1048443857 | i10))) * 765))};
                                                                                    java.lang.Object obj33 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                                    if (obj33 == null) {
                                                                                        java.lang.Class cls31 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 50, (android.view.ViewConfiguration.getTouchSlop() >> 8) + 2713, (char) android.view.KeyEvent.normalizeMetaState(0));
                                                                                        byte b30 = $$a[14];
                                                                                        java.lang.Object[] objArr142 = new java.lang.Object[1];
                                                                                        a((short) 653, b30, (byte) (b30 + 1), objArr142);
                                                                                        obj33 = cls31.getMethod((java.lang.String) objArr142[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj33);
                                                                                    }
                                                                                    ((int[]) objArr140[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj33).invoke(null, objArr141)).intValue();
                                                                                    return objArr140;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                } catch (java.io.IOException unused4) {
                                                                } catch (java.lang.Throwable th3) {
                                                                    th = th3;
                                                                    if (bufferedInputStream == null) {
                                                                        throw th;
                                                                    }
                                                                    try {
                                                                        bufferedInputStream.close();
                                                                        throw th;
                                                                    } catch (java.lang.Exception unused5) {
                                                                        throw th;
                                                                    }
                                                                }
                                                                try {
                                                                    bufferedInputStream.close();
                                                                    break;
                                                                } catch (java.lang.Exception unused6) {
                                                                }
                                                            }
                                                            java.lang.Object obj34 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(724989957);
                                                            if (obj34 == null) {
                                                                java.lang.Class cls32 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 31, 1890 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (3601 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))));
                                                                byte b31 = $$a[14];
                                                                java.lang.Object[] objArr143 = new java.lang.Object[1];
                                                                a((short) (b31 + 1), b31, r5[16], objArr143);
                                                                obj34 = cls32.getMethod((java.lang.String) objArr143[0], null);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(724989957, obj34);
                                                            }
                                                            long longValue12 = ((java.lang.Long) ((java.lang.reflect.Method) obj34).invoke(null, null)).longValue();
                                                            long j43 = ~((~longValue12) | (-782104324));
                                                            long j44 = ~(j2 | (-782104324));
                                                            long j45 = ((((((-657) * longValue12) - 515406749516L) + ((((~(longValue12 | 782104323)) | j43) | j44) * (-658))) + (658 * j43)) + ((j43 | j44) * 658)) - 1097144056;
                                                            int i226 = ((int) (j45 >> 32)) & ((((((~((-1429163850) | i)) | 2819649) | (~(1434406761 | i10))) * 886) - 679602576) + (((~(1429163849 | i10)) | 8062561) * (-1772)) + ((~(8062561 | i10)) * 886));
                                                            int i227 = ((int) j45) & (((((~((-599011134) | i10)) | (-2036237544)) * (-235)) - 1657469596) + (((~((-599011134) | i)) | (-2036237544)) * (-470)) + (((~((-554959910) | i)) | (-2080288768)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE));
                                                            if (((i226 ^ i227) | (i226 & i227)) != 0) {
                                                                int i228 = SdkCoreAlternateContactlessPaymentDataImpl;
                                                                getProfileVersion = ((i228 ^ 87) + ((i228 & 87) << 1)) % 128;
                                                                java.lang.Object[] objArr144 = {new int[]{(~(i & com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PLAID_LOGO_VALUE)) & (i | com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PLAID_LOGO_VALUE)}, new int[]{i7}, null, new int[1]};
                                                                java.lang.Object[] objArr145 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf(((((~(677078448 | i10)) | 27527183) * (-108)) - 1954328295) + (((~((-32247072) | i)) | 672358560 | (~(i10 | 32247071))) * 54) + ((i | 672358560) * 54))};
                                                                java.lang.Object obj35 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                if (obj35 == null) {
                                                                    java.lang.Class cls33 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson('b' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), android.graphics.ImageFormat.getBitsPerPixel(0) + 2714, (char) (android.os.Process.myTid() >> 22));
                                                                    byte b32 = $$a[14];
                                                                    java.lang.Object[] objArr146 = new java.lang.Object[1];
                                                                    a((short) 653, b32, (byte) (b32 + 1), objArr146);
                                                                    obj35 = cls33.getMethod((java.lang.String) objArr146[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj35);
                                                                }
                                                                ((int[]) objArr144[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj35).invoke(null, objArr145)).intValue();
                                                                return objArr144;
                                                            }
                                                            java.lang.Object[] objArr147 = {2};
                                                            java.lang.Object obj36 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(104106647);
                                                            if (obj36 == null) {
                                                                java.lang.Class cls34 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.view.KeyEvent.getMaxKeyCode() >> 16), android.graphics.Color.blue(0) + 2364, (char) android.text.TextUtils.getTrimmedLength(str5));
                                                                byte b33 = $$a[14];
                                                                java.lang.Object[] objArr148 = new java.lang.Object[1];
                                                                a((short) (b33 + 1), b33, r5[16], objArr148);
                                                                obj36 = cls34.getMethod((java.lang.String) objArr148[0], java.lang.Integer.TYPE);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(104106647, obj36);
                                                            }
                                                            long longValue13 = ((java.lang.Long) ((java.lang.reflect.Method) obj36).invoke(null, objArr147)).longValue();
                                                            long j46 = ~longValue13;
                                                            long j47 = 775783106 | j46;
                                                            long j48 = ((-622) * longValue13) + 484088658144L + ((~(j47 | j2)) * 623) + ((j | (~(longValue13 | (-775783107)))) * (-623)) + (((~j47) | (~(j46 | j2)) | (~(j2 | 775783106))) * 623) + 632127093;
                                                            if (((((int) (j48 >> 32)) & ((((~(800990444 | i)) | (-636235967)) * (-668)) + 956986946 + (((~((-636235967) | i)) | 800990444) * 1336) + (((-4198419) | i) * 668))) | (((int) j48) & (((((~(536370676 | i10)) | 536977921) * 98) - 1604765623) + (((~(900855733 | i10)) | 536370676 | (~((-900855734) | i))) * (-49)) + (((~(536370676 | i)) | 363877812) * 49)))) == 2) {
                                                                SdkCoreAlternateContactlessPaymentDataImpl = (getProfileVersion + 37) % 128;
                                                                java.lang.Object[] objArr149 = {new int[]{i}, new int[]{(i & (-271)) | (i10 & 270)}, null, new int[1]};
                                                                int i229 = ~(567920125 | i10);
                                                                java.lang.Object[] objArr150 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf(((((~(141405394 | i10)) | 563101997) * (-1188)) - 1734420143) + (((~(i | (-141405395))) | 563101997 | i229) * 594) + (((~((-141405395) | i10)) | 136587266 | i229) * 594))};
                                                                java.lang.Object obj37 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                if (obj37 == null) {
                                                                    java.lang.Class cls35 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionChild(0L) + 51, 2713 - android.widget.ExpandableListView.getPackedPositionType(0L), (char) android.graphics.Color.blue(0));
                                                                    byte b34 = $$a[14];
                                                                    java.lang.Object[] objArr151 = new java.lang.Object[1];
                                                                    a((short) 653, b34, (byte) (b34 + 1), objArr151);
                                                                    obj37 = cls35.getMethod((java.lang.String) objArr151[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj37);
                                                                }
                                                                ((int[]) objArr149[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj37).invoke(null, objArr150)).intValue();
                                                                return objArr149;
                                                            }
                                                            java.lang.Object obj38 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1411285061);
                                                            if (obj38 == null) {
                                                                java.lang.Class cls36 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 3197, (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16));
                                                                java.lang.Object[] objArr152 = new java.lang.Object[1];
                                                                a((short) 612, r4[23], (byte) (-$$a[21]), objArr152);
                                                                obj38 = cls36.getMethod((java.lang.String) objArr152[0], null);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1411285061, obj38);
                                                            }
                                                            long longValue14 = ((java.lang.Long) ((java.lang.reflect.Method) obj38).invoke(null, null)).longValue();
                                                            long j49 = ~longValue14;
                                                            long j50 = (longValue14 * 949) + 1848723112739L + (((~(j49 | j2)) | 1952189136) * (-948)) + ((~(1952189136 | j49 | j)) * (-948)) + ((j49 | (-1952189137)) * 948) + 2048434498;
                                                            if (((((int) (j50 >> 32)) & ((((((~((-2071852681) | i10)) | 634626269) | (~(2071852680 | i))) * (-564)) - 1117003166) + ((~(2147481309 | i)) * 1128) + (((~(634626269 | i10)) | 75628629) * 564))) | (((int) j50) & (((((~(2116291370 | i10)) | 679064960) * (-602)) - 2010556474) + (((~(2116291370 | i)) | 5878912 | (~((-1443105323) | i10))) * (-301)) + ((~(679064960 | i10)) * 301)))) != 0) {
                                                                SdkCoreAlternateContactlessPaymentDataImpl = (getProfileVersion + 95) % 128;
                                                                java.lang.Object[] objArr153 = {new int[]{i}, new int[]{(~(i & com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE)) & (i | com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE)}, null, new int[1]};
                                                                java.lang.Object[] objArr154 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf((((~((-33775471) | i)) | (-743100991)) * (-465)) + 111165807 + (((~((-743100991) | i)) | (-33775471)) * 930) + ((i | (-152111)) * 465))};
                                                                java.lang.Object obj39 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                if (obj39 == null) {
                                                                    java.lang.Class cls37 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myTid() >> 22) + 50, 2713 - android.text.TextUtils.getTrimmedLength(str5), (char) android.view.View.resolveSizeAndState(0, 0, 0));
                                                                    byte b35 = $$a[14];
                                                                    java.lang.Object[] objArr155 = new java.lang.Object[1];
                                                                    a((short) 653, b35, (byte) (b35 + 1), objArr155);
                                                                    obj39 = cls37.getMethod((java.lang.String) objArr155[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj39);
                                                                }
                                                                ((int[]) objArr153[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj39).invoke(null, objArr154)).intValue();
                                                                return objArr153;
                                                            }
                                                            java.lang.Object obj40 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(502613909);
                                                            if (obj40 == null) {
                                                                java.lang.Class cls38 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), android.widget.ExpandableListView.getPackedPositionType(0L) + 3197, (char) android.view.View.resolveSizeAndState(0, 0, 0));
                                                                byte b36 = $$a[14];
                                                                java.lang.Object[] objArr156 = new java.lang.Object[1];
                                                                a((short) (b36 + 1), b36, r4[16], objArr156);
                                                                obj40 = cls38.getMethod((java.lang.String) objArr156[0], null);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(502613909, obj40);
                                                            }
                                                            long longValue15 = ((java.lang.Long) ((java.lang.reflect.Method) obj40).invoke(null, null)).longValue();
                                                            long j51 = ~longValue15;
                                                            long j52 = ((302 * longValue15) - 44812245900L) + ((~(longValue15 | 149374153 | j2)) * (-301)) + (((~(j51 | j2)) | (~(j | 149374153))) * (-301)) + (((~(j2 | (-149374154))) | j51) * 301) + 803495737;
                                                            int i230 = ((int) (j52 >> 32)) & ((((~(1345727260 | i)) | (-1514110781) | (~((-1343630105) | i10))) * 886) + 522120572 + (((~((-1345727261) | i10)) | (-1512013625)) * (-1772)) + ((~((-1512013625) | i10)) * 886));
                                                            int i231 = ((int) j52) & (((((~(2129514841 | i10)) | (~((-1454145617) | i))) * (-831)) - 1303602658) + ((~(2146434047 | i)) * (-1662)) + (((~((-692288432) | i10)) | (~(692288431 | i)) | (~((-2129514842) | i))) * 831));
                                                            if (((i230 ^ i231) | (i230 & i231)) != 0) {
                                                                java.lang.Object[] objArr157 = {new int[]{i}, new int[]{(~(i & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE)) & (i | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE)}, null, new int[1]};
                                                                java.lang.Object[] objArr158 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf((((~((-473698276) | i)) | (~(235627244 | i10))) * (-1808)) + 1177172743 + (((~((-201851617) | i)) | (~(507473903 | i10))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN) + (((~(i | (-235627245))) | 271846659 | (~(473698275 | i10))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN))};
                                                                java.lang.Object obj41 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                if (obj41 == null) {
                                                                    java.lang.Class cls39 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.getSize(0) + 50, (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 2713, (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16));
                                                                    byte b37 = $$a[14];
                                                                    java.lang.Object[] objArr159 = new java.lang.Object[1];
                                                                    a((short) 653, b37, (byte) (b37 + 1), objArr159);
                                                                    obj41 = cls39.getMethod((java.lang.String) objArr159[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj41);
                                                                }
                                                                ((int[]) objArr157[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj41).invoke(null, objArr158)).intValue();
                                                                return objArr157;
                                                            }
                                                            java.lang.Object obj42 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1293945309);
                                                            if (obj42 == null) {
                                                                java.lang.Class cls40 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - android.graphics.Color.blue(0), (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 2836, (char) android.text.TextUtils.indexOf(str5, str5, 0));
                                                                byte b38 = $$a[14];
                                                                java.lang.Object[] objArr160 = new java.lang.Object[1];
                                                                a((short) (b38 + 1), b38, r4[16], objArr160);
                                                                obj42 = cls40.getMethod((java.lang.String) objArr160[0], null);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1293945309, obj42);
                                                            }
                                                            long longValue16 = ((java.lang.Long) ((java.lang.reflect.Method) obj42).invoke(null, null)).longValue();
                                                            long j53 = ((((((-55) * longValue16) - 62218391565L) + (((~(j2 | 1131243483)) | longValue16) * 56)) + ((~(1131243483 | longValue16)) * (-56))) + (((~(j | longValue16)) | 1131243483) * 56)) - 1937538238;
                                                            int i232 = ((int) (j53 >> 32)) & (((((~(209766374 | i)) | (-1856757752)) * (-283)) - 39207294) + ((~((-1646991378) | i)) * 283));
                                                            int i233 = ((int) j53) & ((((~((-748007691) | i10)) | (-2109733196)) * (-591)) + 1236851782 + (((-748007691) | i) * 591));
                                                            if (((i232 ^ i233) | (i232 & i233)) != 0) {
                                                                java.lang.Object[] objArr161 = {new int[]{i}, new int[]{(~(i & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE)) & (i | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE)}, null, new int[1]};
                                                                java.lang.Object[] objArr162 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf(((~(i | 318598304)) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING) + 1407641203 + (((~(318598304 | i10)) | 306709536) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING))};
                                                                java.lang.Object obj43 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                if (obj43 == null) {
                                                                    java.lang.Class cls41 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.KeyEvent.normalizeMetaState(0), android.graphics.Color.green(0) + 2713, (char) android.text.TextUtils.getOffsetAfter(str5, 0));
                                                                    byte b39 = $$a[14];
                                                                    java.lang.Object[] objArr163 = new java.lang.Object[1];
                                                                    a((short) 653, b39, (byte) (b39 + 1), objArr163);
                                                                    obj43 = cls41.getMethod((java.lang.String) objArr163[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj43);
                                                                }
                                                                ((int[]) objArr161[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj43).invoke(null, objArr162)).intValue();
                                                                return objArr161;
                                                            }
                                                            long[] jArr3 = {624887784092251L};
                                                            java.lang.Object[] objArr164 = new java.lang.Object[1];
                                                            b("괞贙㮽ł⨙\uecbe̦럢哢츈鐚劄登⊋螙족\uf605푼", 15 - (~(android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))), objArr164);
                                                            java.lang.Object[] objArr165 = {(java.lang.String) objArr164[0], 3, 2251799813685247L, jArr3};
                                                            java.lang.Object obj44 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1441749806);
                                                            if (obj44 == null) {
                                                                java.lang.Class cls42 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 36, (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 3096, (char) (1 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))));
                                                                byte b40 = $$a[14];
                                                                java.lang.Object[] objArr166 = new java.lang.Object[1];
                                                                a((short) (b40 + 1), b40, r4[16], objArr166);
                                                                obj44 = cls42.getMethod((java.lang.String) objArr166[0], java.lang.String.class, java.lang.Integer.TYPE, java.lang.Long.TYPE, long[].class);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1441749806, obj44);
                                                            }
                                                            long longValue17 = ((java.lang.Long) ((java.lang.reflect.Method) obj44).invoke(null, objArr165)).longValue();
                                                            long j54 = (-46630261) | longValue17;
                                                            long j55 = ((((((-753) * longValue17) + 35205846300L) + ((((~(j2 | (-46630261))) | (~j54)) | (~(longValue17 | j2))) * (-754))) + (((~(j54 | j2)) | (~((j | 46630260) | longValue17))) * (-754))) + ((j | (-46630261)) * 754)) - 1957278170;
                                                            int i234 = ((int) (j55 >> 32)) & ((((~((-1790352131) | i10)) | (-353125720)) * (-90)) + 1687905420 + (((~((-1790352131) | i)) | 352863317) * (-45)) + (((~(353125719 | i)) | (-1790352131) | (~((-353125720) | i10))) * 45));
                                                            int i235 = ((int) j55) & ((((~((-1055950945) | i)) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING) - 1182077251) + (((~((-1055950945) | i10)) | (-1056558442)) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING));
                                                            if (((i234 ^ i235) | (i234 & i235)) != 0) {
                                                                SdkCoreAlternateContactlessPaymentDataImpl = (getProfileVersion + 7) % 128;
                                                                java.lang.Object[] objArr167 = {new int[]{i}, new int[]{(i10 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_SOLID_VALUE) | (i & (-276))}, null, new int[1]};
                                                                int i236 = ~(i | 587528260);
                                                                java.lang.Object[] objArr168 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf((((((-121797260) | i236) * (-220)) + 400128077) + ((i236 | (-658963152)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE)) - 1773390606)};
                                                                java.lang.Object obj45 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                if (obj45 == null) {
                                                                    java.lang.Class cls43 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf(str5, str5) + 50, 2713 - android.view.View.getDefaultSize(0, 0), (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                                                                    byte b41 = $$a[14];
                                                                    java.lang.Object[] objArr169 = new java.lang.Object[1];
                                                                    a((short) 653, b41, (byte) (b41 + 1), objArr169);
                                                                    obj45 = cls43.getMethod((java.lang.String) objArr169[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj45);
                                                                }
                                                                ((int[]) objArr167[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj45).invoke(null, objArr168)).intValue();
                                                                return objArr167;
                                                            }
                                                            java.lang.Object[] objArr170 = new java.lang.Object[1];
                                                            c(10 - (~(-(android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)))), (byte) (68 - (~(-(android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))))), "\u001c\r\u0001\u0010\u001a\u001b\u0001\r\u0002\u0017㘶", objArr170);
                                                            java.lang.Object[] objArr171 = {(java.lang.String) objArr170[0]};
                                                            java.lang.Object obj46 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                                                            if (obj46 == null) {
                                                                java.lang.Class cls44 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), 3162 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (33099 - android.text.TextUtils.indexOf(str5, str5, 0, 0)));
                                                                java.lang.Object[] objArr172 = new java.lang.Object[1];
                                                                a((short) 612, r5[23], (byte) (-$$a[21]), objArr172);
                                                                obj46 = cls44.getMethod((java.lang.String) objArr172[0], java.lang.String.class);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, obj46);
                                                            }
                                                            long longValue18 = ((java.lang.Long) ((java.lang.reflect.Method) obj46).invoke(null, objArr171)).longValue();
                                                            long j56 = (((-520) * longValue18) - 508294482840L) + (((~(j | longValue18)) | (-973744220)) * (-1042)) + ((longValue18 | j2) * 521) + (((~(longValue18 | j | (-973744220))) | (~(973744219 | (~longValue18))) | (~(j2 | 973744219))) * 521) + 1969179123;
                                                            int i237 = (int) (j56 >> 32);
                                                            int i238 = ~((-25166851) | i);
                                                            int i239 = (int) j56;
                                                            int i240 = ~((-1866449991) | i10);
                                                            if (((i237 & (((69472512 | i238) * (-476)) + 1051885042 + (i238 * 952) + ((~((-25166851) | i10)) * 476))) | ((((152388612 | i240) * (-712)) + 994783661 + (((~((-152388613) | i10)) | (~((-1714061379) | i))) * (-712)) + ((i240 | (-429223581)) * 712)) & i239)) != 0) {
                                                                java.lang.Object[] objArr173 = {new int[]{i}, new int[]{(~(i & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_REPORT_CIRCLE_SOLID_VALUE)) & (i | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_REPORT_CIRCLE_SOLID_VALUE)}, null, new int[1]};
                                                                java.lang.Object[] objArr174 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf((((~((-224677196) | i)) | 207619328) * 345) + 805157336 + (((~((-224677196) | i10)) | 277028996) * 345) + ((~(i | (-207619329))) * 345))};
                                                                java.lang.Object obj47 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                if (obj47 == null) {
                                                                    java.lang.Class cls45 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 50, android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 2714, (char) (android.view.ViewConfiguration.getTapTimeout() >> 16));
                                                                    byte b42 = $$a[14];
                                                                    java.lang.Object[] objArr175 = new java.lang.Object[1];
                                                                    a((short) 653, b42, (byte) (b42 + 1), objArr175);
                                                                    obj47 = cls45.getMethod((java.lang.String) objArr175[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj47);
                                                                }
                                                                ((int[]) objArr173[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj47).invoke(null, objArr174)).intValue();
                                                                return objArr173;
                                                            }
                                                            java.lang.Object obj48 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(236031171);
                                                            if (obj48 == null) {
                                                                java.lang.Class cls46 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 27, 2185 - android.view.KeyEvent.getDeadChar(0, 0), (char) ((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 59513));
                                                                byte b43 = $$a[14];
                                                                java.lang.Object[] objArr176 = new java.lang.Object[1];
                                                                a((short) (b43 + 1), b43, r4[16], objArr176);
                                                                obj48 = cls46.getMethod((java.lang.String) objArr176[0], null);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(236031171, obj48);
                                                            }
                                                            long longValue19 = ((java.lang.Long) ((java.lang.reflect.Method) obj48).invoke(null, null)).longValue();
                                                            long j57 = ~longValue19;
                                                            long j58 = ~(j | longValue19);
                                                            long j59 = (((((517 * longValue19) + 10881601860L) + ((((~(j57 | j2)) | (~(j | (-21129324)))) | j58) * (-516))) + (((~((21129323 | j57) | j2)) | (~((j | 21129323) | longValue19))) * 516)) + (((~(longValue19 | 21129323)) | j58) * 516)) - 850961262;
                                                            int i241 = ((int) (j59 >> 32)) & (((((~((-1285670278) | i)) | 151556133) * (-366)) - 966697776) + (((~((-1151419777) | i)) | 17305632) * 366));
                                                            int i242 = ((int) j59) & (((((~((-1073807749) | i10)) | (~(2146131957 | i))) * (-302)) - 831666177) + ((~((-1073807749) | i)) * (-604)) + (((~(1072324209 | i)) | 360715281) * 302));
                                                            if (((i241 ^ i242) | (i241 & i242)) != 0) {
                                                                int i243 = getProfileVersion;
                                                                SdkCoreAlternateContactlessPaymentDataImpl = (((i243 | 115) << 1) - (i243 ^ 115)) % 128;
                                                                java.lang.Object[] objArr177 = {new int[]{i}, new int[]{(i & (-274)) | (i10 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE)}, null, new int[1]};
                                                                java.lang.Object[] objArr178 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf((((2450571 | r4) * (-814)) - 988837148) + (((~(399641396 | i)) | (~(i10 | (-309684124))) | 92407844) * 407) + (((~(i | (-399641397))) | 92407844 | (~(309684123 | i))) * 407))};
                                                                java.lang.Object obj49 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                if (obj49 == null) {
                                                                    java.lang.Class cls47 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 2712 - android.text.TextUtils.indexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0));
                                                                    byte b44 = $$a[14];
                                                                    java.lang.Object[] objArr179 = new java.lang.Object[1];
                                                                    a((short) 653, b44, (byte) (b44 + 1), objArr179);
                                                                    obj49 = cls47.getMethod((java.lang.String) objArr179[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj49);
                                                                }
                                                                ((int[]) objArr177[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj49).invoke(null, objArr178)).intValue();
                                                                return objArr177;
                                                            }
                                                            java.lang.Object obj50 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1050293330);
                                                            if (obj50 == null) {
                                                                java.lang.Class cls48 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 36, android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 2972, (char) (android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1));
                                                                byte b45 = $$a[14];
                                                                java.lang.Object[] objArr180 = new java.lang.Object[1];
                                                                a((short) (b45 + 1), b45, r4[16], objArr180);
                                                                obj50 = cls48.getMethod((java.lang.String) objArr180[0], null);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1050293330, obj50);
                                                            }
                                                            long longValue20 = ((java.lang.Long) ((java.lang.reflect.Method) obj50).invoke(null, null)).longValue();
                                                            long j60 = ((((((-301) * longValue20) - 62027013951L) + (((~((j | 204709616) | longValue20)) | (~(((-204709617) | longValue20) | j2))) * (-302))) + ((~((204709616 | longValue20) | j2)) * (-604))) + (((~(longValue20 | j2)) | (~((~longValue20) | (-204709617)))) * 302)) - 1647992147;
                                                            int i244 = ((int) (j60 >> 32)) & (((((~((-1436675) | i)) | 1337344) * 345) - 484646000) + (((~((-1436675) | i10)) | 1434452392) * 345) + ((~((-1337345) | i)) * 345));
                                                            int i245 = ((int) j60) & (((((-155117560) | r5) * 764) - 919414687) + (((~((-155117560) | i10)) | 18121285) * (-1528)) + (((~((-1282108851) | i10)) | 1163233861) * 764));
                                                            if (((i244 ^ i245) | (i244 & i245)) != 0) {
                                                                java.lang.Object[] objArr181 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE}, null, new int[1]};
                                                                java.lang.Object[] objArr182 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf(((r1 * 495) - 54179874) + (((~(1048928553 | i10)) | 713031968) * 495))};
                                                                java.lang.Object obj51 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                if (obj51 == null) {
                                                                    java.lang.Class cls49 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getCapsMode(str5, 0, 0) + 50, (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2712, (char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1));
                                                                    byte b46 = $$a[14];
                                                                    java.lang.Object[] objArr183 = new java.lang.Object[1];
                                                                    a((short) 653, b46, (byte) (b46 + 1), objArr183);
                                                                    obj51 = cls49.getMethod((java.lang.String) objArr183[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj51);
                                                                }
                                                                ((int[]) objArr181[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj51).invoke(null, objArr182)).intValue();
                                                                return objArr181;
                                                            }
                                                            java.lang.Object obj52 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1827153043);
                                                            if (obj52 == null) {
                                                                java.lang.Class cls50 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(25 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 2159 - (android.view.ViewConfiguration.getTouchSlop() >> 8), (char) (56400 - android.view.View.getDefaultSize(0, 0)));
                                                                byte b47 = $$a[14];
                                                                java.lang.Object[] objArr184 = new java.lang.Object[1];
                                                                a((short) (b47 + 1), b47, r4[16], objArr184);
                                                                obj52 = cls50.getMethod((java.lang.String) objArr184[0], null);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1827153043, obj52);
                                                            }
                                                            long longValue21 = ((java.lang.Long) ((java.lang.reflect.Method) obj52).invoke(null, null)).longValue();
                                                            long j61 = ((((334 * longValue21) - 503216776423L) + (((~(j | (-1515713184))) | (~(longValue21 | j2))) * 333)) + (((~(j | longValue21)) | (~(j2 | (-1515713184)))) * 333)) - 2081531203;
                                                            int i246 = ~(1064717738 | i10);
                                                            int i247 = ((int) (j61 >> 32)) & ((((~((-1060522017) | i)) | 372508672 | i246) * (-470)) + 422643114 + ((i246 | (~((-688013345) | i))) * 470));
                                                            int i248 = ((int) j61) & ((((~(1716709819 | i)) | 1141031066) * (-756)) + 1436300513 + ((1716709819 | i10) * 756));
                                                            if (((i247 ^ i248) | (i247 & i248)) != 0) {
                                                                java.lang.Object[] objArr185 = {new int[]{i}, new int[]{(i & (-281)) | (i10 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PERSON_CIRCLE_SOLID_VALUE)}, null, new int[1]};
                                                                java.lang.Object[] objArr186 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf(((((~((-354435083) | i10)) | (~((-266385) | i))) * (-302)) - 331411275) + ((~((-354435083) | i)) * (-604)) + (((~(i | (-354701467))) | (-1064293371)) * 302))};
                                                                java.lang.Object obj53 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                if (obj53 == null) {
                                                                    java.lang.Class cls51 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTapTimeout() >> 16) + 50, (android.os.Process.myPid() >> 22) + 2713, (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16));
                                                                    byte b48 = $$a[14];
                                                                    java.lang.Object[] objArr187 = new java.lang.Object[1];
                                                                    a((short) 653, b48, (byte) (b48 + 1), objArr187);
                                                                    obj53 = cls51.getMethod((java.lang.String) objArr187[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj53);
                                                                }
                                                                ((int[]) objArr185[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj53).invoke(null, objArr186)).intValue();
                                                                return objArr185;
                                                            }
                                                            java.lang.Object obj54 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(887063382);
                                                            if (obj54 == null) {
                                                                java.lang.Class cls52 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(35 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), 838 - android.graphics.Color.alpha(0), (char) (1 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))));
                                                                byte b49 = $$a[14];
                                                                java.lang.Object[] objArr188 = new java.lang.Object[1];
                                                                a((short) (b49 + 1), b49, r4[16], objArr188);
                                                                obj54 = cls52.getMethod((java.lang.String) objArr188[0], null);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(887063382, obj54);
                                                            }
                                                            long longValue22 = ((java.lang.Long) ((java.lang.reflect.Method) obj54).invoke(null, null)).longValue();
                                                            long j62 = ~((-499554615) | longValue22);
                                                            long j63 = ~longValue22;
                                                            long j64 = ~(499554614 | j63);
                                                            long j65 = (399 * longValue22) + 199322290986L + ((j62 | j64 | (~(j63 | j2))) * 398) + ((longValue22 | 499554614) * (-1194)) + (((~(j63 | j)) | j62 | j64) * 398) + 1461198288;
                                                            int i249 = ((int) (j65 >> 32)) & (((((~((-1567431365) | i)) | 285544516) * (-140)) - 639080990) + ((~((-1281886849) | i)) * 70) + (((~((-1290309521) | i)) | 293967188) * 70));
                                                            int i250 = ((int) j65) & (((((~((-385289320) | i10)) | (~(1822515729 | i10))) * (-867)) - 1972008908) + (((~((-385289320) | i)) | 307629158 | (~(1822515729 | i))) * (-1734)) + (((~((-307629159) | i10)) | (~((-77660162) | i)) | (~(2130144887 | i))) * 867));
                                                            int i251 = ((i250 ^ i249) | (i249 & i250)) != 0 ? (~(i & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_BANK_VALUE)) & (i | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_BANK_VALUE) : i;
                                                            if (i251 != i) {
                                                                java.lang.Object[] objArr189 = {new int[]{i}, new int[]{i251}, null, new int[1]};
                                                                java.lang.Object[] objArr190 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf((((~((-925429152) | i10)) | 69232783 | (~((-216103632) | i10))) * (-397)) + 1210663215 + ((i | (-1003067217)) * 397))};
                                                                java.lang.Object obj55 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                if (obj55 == null) {
                                                                    java.lang.Class cls53 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 2714, (char) ((-1) - android.graphics.ImageFormat.getBitsPerPixel(0)));
                                                                    byte b50 = $$a[14];
                                                                    java.lang.Object[] objArr191 = new java.lang.Object[1];
                                                                    a((short) 653, b50, (byte) (b50 + 1), objArr191);
                                                                    obj55 = cls53.getMethod((java.lang.String) objArr191[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj55);
                                                                }
                                                                ((int[]) objArr189[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj55).invoke(null, objArr190)).intValue();
                                                                java.lang.Object[] objArr192 = {objArr189};
                                                                java.lang.Object obj56 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(712501173);
                                                                if (obj56 == null) {
                                                                    java.lang.Class cls54 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(52 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 3238, (char) android.view.View.getDefaultSize(0, 0));
                                                                    byte b51 = $$a[14];
                                                                    java.lang.Object[] objArr193 = new java.lang.Object[1];
                                                                    a((short) 653, b51, (byte) (b51 + 1), objArr193);
                                                                    obj56 = cls54.getMethod((java.lang.String) objArr193[0], java.lang.Object[].class);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(712501173, obj56);
                                                                }
                                                                ((java.lang.reflect.Method) obj56).invoke(obj, objArr192);
                                                                return objArr189;
                                                            }
                                                            java.lang.Object[] objArr194 = {java.lang.Integer.valueOf(i), obj, java.lang.Integer.valueOf(i2), 0};
                                                            java.lang.Object obj57 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(97317038);
                                                            if (obj57 == null) {
                                                                obj57 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(30 - android.view.KeyEvent.normalizeMetaState(0), 3288 - android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)))).getDeclaredConstructor(java.lang.Integer.TYPE, (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(52 - android.view.View.resolveSize(0, 0), (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 3236, (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16)), java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(97317038, obj57);
                                                            }
                                                            java.lang.Object newInstance = ((java.lang.reflect.Constructor) obj57).newInstance(objArr194);
                                                            int i252 = getProfileVersion;
                                                            SdkCoreAlternateContactlessPaymentDataImpl = ((i252 & 43) + (i252 | 43)) % 128;
                                                            try {
                                                                java.lang.Object[] objArr195 = new java.lang.Object[1];
                                                                b("⤁齊跳숬锹魾叵ዚꋔ䰭땋돿홝퓻鯂⺢", 15 - (~(-(-(android.os.Process.myPid() >> 22)))), objArr195);
                                                                java.lang.Class<?> cls55 = java.lang.Class.forName((java.lang.String) objArr195[0]);
                                                                int size2 = android.view.View.MeasureSpec.getSize(0);
                                                                int i253 = (size2 * 960) - 9585;
                                                                int i254 = ~((i10 ^ (-6)) | (i10 & (-6)));
                                                                int i255 = ~((size2 ^ i) | (size2 & i));
                                                                int i256 = ((i254 ^ i255) | (i254 & i255)) * 959;
                                                                int i257 = (i253 ^ i256) + ((i253 & i256) << 1);
                                                                int i258 = ((i257 | 5754) << 1) - (i257 ^ 5754);
                                                                int i259 = ~((i & (-6)) | (i ^ (-6)));
                                                                int i260 = ~((size2 ^ i10) | (size2 & i10));
                                                                int i261 = ((i260 ^ i259) | (i260 & i259)) * 959;
                                                                java.lang.Object[] objArr196 = new java.lang.Object[1];
                                                                b("嫑밾戒葈뽢問", (i258 ^ i261) + ((i258 & i261) << 1), objArr196);
                                                                cls55.getMethod((java.lang.String) objArr196[0], null).invoke(newInstance, null);
                                                                java.lang.Object[] objArr197 = {new int[]{i}, new int[]{i}, null, new int[1]};
                                                                java.lang.Object[] objArr198 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf((((~((-416278119) | i)) | 273122400) * 336) + 1801722615 + (((~(i | 293047401)) | (-436203120)) * (-168)) + (((~(293047401 | i10)) | (-416278119)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE))};
                                                                java.lang.Object obj58 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                if (obj58 == null) {
                                                                    java.lang.Class cls56 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 50, 2713 - android.view.KeyEvent.normalizeMetaState(0), (char) ((-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())));
                                                                    byte b52 = $$a[14];
                                                                    java.lang.Object[] objArr199 = new java.lang.Object[1];
                                                                    a((short) 653, b52, (byte) (b52 + 1), objArr199);
                                                                    obj58 = cls56.getMethod((java.lang.String) objArr199[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj58);
                                                                }
                                                                ((int[]) objArr197[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj58).invoke(null, objArr198)).intValue();
                                                                return objArr197;
                                                            } catch (java.lang.Throwable th4) {
                                                                java.lang.Throwable cause = th4.getCause();
                                                                if (cause != null) {
                                                                    throw cause;
                                                                }
                                                                throw th4;
                                                            }
                                                        }
                                                        java.lang.Object[] objArr200 = {(java.lang.String) objArr2[0]};
                                                        java.lang.Object obj59 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                                        if (obj59 == null) {
                                                            java.lang.Class cls57 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.Gravity.getAbsoluteGravity(0, 0) + 40, android.view.View.resolveSizeAndState(0, 0, 0) + 1921, (char) (1 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))));
                                                            byte b53 = $$a[14];
                                                            java.lang.Object[] objArr201 = new java.lang.Object[1];
                                                            a((short) (b53 + 1), b53, r5[16], objArr201);
                                                            obj59 = cls57.getMethod((java.lang.String) objArr201[0], java.lang.String.class);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj59);
                                                        }
                                                        java.lang.Object invoke5 = ((java.lang.reflect.Method) obj59).invoke(null, objArr200);
                                                        if (invoke5 != null) {
                                                            int i262 = -(-android.view.View.resolveSizeAndState(0, 0, 0));
                                                            java.lang.Object[] objArr202 = new java.lang.Object[1];
                                                            c((i262 ^ 7) + ((i262 & 7) << 1), (byte) (67 - android.text.TextUtils.getOffsetBefore(str5, 0)), "\f\u0014㘷㘷\u000b\u0005㙀", objArr202);
                                                            if (invoke5.equals((java.lang.String) objArr202[0])) {
                                                                java.lang.Object[] objArr203 = new java.lang.Object[1];
                                                                b("鑼툝\ud9c9ꀣ깰錺꤄\ue702ھ䦲긭㗺㮽ł៌ȸ\ue3d0௸鎐웡募ꘇ\uf605푼", 22 - (~(-(-(android.view.ViewConfiguration.getTouchSlop() >> 8)))), objArr203);
                                                                try {
                                                                    java.lang.Object[] objArr204 = {(java.lang.String) objArr203[0]};
                                                                    java.lang.Object obj60 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                                                    if (obj60 == null) {
                                                                        java.lang.Class cls58 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(39 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), 1921 - android.view.KeyEvent.normalizeMetaState(0), (char) android.view.Gravity.getAbsoluteGravity(0, 0));
                                                                        byte b54 = $$a[14];
                                                                        java.lang.Object[] objArr205 = new java.lang.Object[1];
                                                                        a((short) (b54 + 1), b54, r5[16], objArr205);
                                                                        obj60 = cls58.getMethod((java.lang.String) objArr205[0], java.lang.String.class);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj60);
                                                                    }
                                                                    java.lang.String str56 = (java.lang.String) ((java.lang.reflect.Method) obj60).invoke(null, objArr204);
                                                                    if (str56 != null && (parseInt = java.lang.Integer.parseInt(str56)) != 0) {
                                                                        SdkCoreAlternateContactlessPaymentDataImpl = (getProfileVersion + 25) % 128;
                                                                        i5 = ((parseInt | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE) << 1) - (parseInt ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE);
                                                                        if (i5 != 0) {
                                                                        }
                                                                    }
                                                                } catch (java.lang.Throwable th5) {
                                                                    java.lang.Throwable cause2 = th5.getCause();
                                                                    if (cause2 != null) {
                                                                        throw cause2;
                                                                    }
                                                                    throw th5;
                                                                }
                                                            }
                                                        }
                                                        i5 = 0;
                                                        if (i5 != 0) {
                                                        }
                                                    } catch (java.lang.Throwable th6) {
                                                        java.lang.Throwable cause3 = th6.getCause();
                                                        if (cause3 != null) {
                                                            throw cause3;
                                                        }
                                                        throw th6;
                                                    }
                                                    int i263 = -(android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                                    objArr2 = new java.lang.Object[1];
                                                    b("ꈭ拋흖췌疄\uf381鮮⛂疄\uf381橊և픐孠\ue4cb\uea27饄ﹿ", (i263 & 18) + (i263 | 18), objArr2);
                                                } catch (java.lang.Throwable th7) {
                                                    java.lang.Throwable cause4 = th7.getCause();
                                                    if (cause4 != null) {
                                                        throw cause4;
                                                    }
                                                    throw th7;
                                                }
                                            } else {
                                                str3 = str;
                                            }
                                            if (invoke4 != null) {
                                                java.lang.Object[] objArr206 = {invoke4, 42};
                                                java.lang.Object obj61 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                                if (obj61 == null) {
                                                    java.lang.Class cls59 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), 2594 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (char) android.graphics.Color.red(0));
                                                    byte b55 = $$a[14];
                                                    java.lang.Object[] objArr207 = new java.lang.Object[1];
                                                    a((short) (b55 + 1), b55, r8[16], objArr207);
                                                    obj61 = cls59.getMethod((java.lang.String) objArr207[0], java.lang.String.class, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj61);
                                                }
                                                long longValue23 = ((java.lang.Long) ((java.lang.reflect.Method) obj61).invoke(null, objArr206)).longValue();
                                                long j66 = ~longValue23;
                                                long j67 = (((-282) * longValue23) - 133418169508L) + (((~(longValue23 | 469782286)) | (~(j2 | 469782286))) * (-283)) + ((~((-469782287) | j66)) * 283) + ((~(469782286 | j66 | j2)) * 283) + 1726882811;
                                                int i264 = ((int) (j67 >> 32)) & (((((~(1162818806 | i10)) | r4) * 1150) - 334238508) + (((~(1694922078 | i)) | (~((-1694922079) | i10))) * (-575)) + (((~(1162818806 | i)) | (~((-1162818807) | i10))) * 575));
                                                int i265 = ((int) j67) & ((((~(2122282927 | i10)) | (~((-1511020205) | i))) * 988) + 1301099021 + (((~(2048489133 | i)) | 73793794 | (~((-1511020205) | i10))) * 988));
                                            }
                                            int i1622 = -(-android.graphics.Color.blue(0));
                                            java.lang.Object[] objArr732 = new java.lang.Object[1];
                                            b("䪶瀷ㄴ鸏縝갲\ue1b4廙̦럢샱絭\uf4af䔹\uf08b䞿댽\ufafe瓊ఛή뗏ᵕ龌", (i1622 & 23) + (i1622 | 23), objArr732);
                                            java.lang.Object[] objArr742 = {(java.lang.String) objArr732[0]};
                                            obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                            if (obj3 != null) {
                                            }
                                            long longValue52 = ((java.lang.Long) ((java.lang.reflect.Method) obj3).invoke(null, objArr742)).longValue();
                                            long j242 = ~longValue52;
                                            long j252 = (46 * longValue52) + 46184436954L + (((~(j242 | j)) | 1004009499) * (-90)) + (((~(longValue52 | 1004009499)) | (~(j242 | j2))) * (-45)) + (((~(j | 1004009499)) | j242 | (~(j2 | (-1004009500)))) * 45) + 286530568;
                                            int i1632 = ((int) (j252 >> 32)) & ((((33817009 | i10) * 1324) - 818884594) + (((~(42340857 | i)) | (~(1394885553 | i))) * (-1324)) + 432064048);
                                            int i1642 = ((int) j252) & (((((~(1353392105 | i10)) | 72622080) * 98) - 1761699848) + (((~(83834304 | i10)) | 1353392105 | (~((-83834305) | i))) * (-49)) + (((~(1353392105 | i)) | 11212224) * 49));
                                            j3 = (i1632 ^ i1642) | (i1632 & i1642);
                                            int i1652 = -android.graphics.Color.rgb(0, 0, 0);
                                            java.lang.Object[] objArr762 = new java.lang.Object[1];
                                            b("괞贙㮽ł⨙\uecbe̦럢哢츈䪶瀷茞푹ᅇ\uedfa\uf605푼", ((-16777199) & i1652) + (i1652 | (-16777199)), objArr762);
                                            java.lang.Object[] objArr772 = {(java.lang.String) objArr762[0]};
                                            obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                            if (obj4 == null) {
                                            }
                                            long longValue62 = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr772)).longValue();
                                            long j262 = ~longValue62;
                                            str5 = str4;
                                            long j272 = (((-317) * longValue62) - 112529613790L) + (((~(j2 | 352757409)) | j262) * (-318)) + (((~(j262 | j2)) | (~(j | (-352757410) | longValue62))) * 318) + (((~(j262 | j | (-352757410))) | (~((-352757410) | longValue62 | j2))) * 318) + 1643297477;
                                            int i1662 = ((int) (j272 >> 32)) & ((((~((-268453203) | i10)) * 130) - 1317600762) + (((~((-268453203) | i)) | (-2130440192)) * 130));
                                            int i1672 = ~((-686231326) | i);
                                            int i1682 = ((int) j272) & (((((~(753356701 | i10)) | (~((-750995085) | i))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL) - 754642723) + (((~(750995084 | i10)) | i1672) * (-1040)) + ((i1672 | (~(686231325 | i10)) | 2361617) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL));
                                            long j282 = (i1662 ^ i1682) | (i1662 & i1682);
                                            if (j3 <= 0) {
                                            }
                                            int maxKeyCode32 = android.view.KeyEvent.getMaxKeyCode() >> 16;
                                            int i1692 = maxKeyCode32 * (-244);
                                            int i1702 = ((i1692 | 5658) << 1) - (i1692 ^ 5658);
                                            int i1712 = ~((i10 ^ (-24)) | (i10 & (-24)));
                                            int i1722 = ~((maxKeyCode32 & (-24)) | (maxKeyCode32 ^ (-24)));
                                            int i1732 = -(-(((i1712 ^ i1722) | (i1722 & i1712)) * (-245)));
                                            int i1742 = ~((i & (-24)) | (i ^ (-24)));
                                            java.lang.Object[] objArr822 = new java.lang.Object[1];
                                            b("䪶瀷ㄴ鸏縝갲\ue1b4廙̦럢샱絭\uf4af䔹\uf08b䞿댽\ufafe瓊ఛή뗏ᵕ龌", ((((i1702 & i1732) + (i1732 | i1702)) + ((~(i | (-24))) * (-245))) - (~(-(-(((maxKeyCode32 ^ i1742) | (maxKeyCode32 & i1742)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE))))) - 1, objArr822);
                                            java.lang.Object[] objArr832 = {(java.lang.String) objArr822[0]};
                                            obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                            if (obj5 == null) {
                                            }
                                            long longValue72 = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr832)).longValue();
                                            long j292 = ~((~longValue72) | 68359615);
                                            long j302 = ((-107) * longValue72) + 3759778825L + (((~(j | longValue72)) | (~((-68359616) | longValue72))) * (-108)) + (((~(j2 | (-68359616))) | j292 | (~(j | 68359615))) * 54) + ((j292 | j2) * 54) + 1222180452;
                                            int i1752 = ((int) (j302 >> 32)) & ((((~(1621155191 | i10)) | (~(1236585693 | i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) + 1502737462 + (((~((-536875299) | i10)) | (~((-152305801) | i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE));
                                            int i1762 = ((int) j302) & ((((~((-1882855690) | i)) | 445629279) * 56) + 1561536445 + (((~(445629279 | i10)) | (-1882855690)) * 56));
                                            j4 = (i1752 ^ i1762) | (i1752 & i1762);
                                            int i1772 = -(android.view.ViewConfiguration.getEdgeSlop() >> 16);
                                            int i1782 = ~i1772;
                                            int i1792 = ~((i1782 ^ (-5)) | (i1782 & (-5)) | i);
                                            int i1802 = (i10 ^ i1772) | (i10 & i1772);
                                            int i1812 = ~((i1802 ^ 4) | (i1802 & 4));
                                            int i1822 = (i1772 * (-317)) + 1276 + (((i1792 ^ i1812) | (i1792 & i1812)) * (-318));
                                            int i1832 = ((~((i1772 ^ (-5)) | (i1772 & (-5)))) | (~(i1772 | i))) * (-318);
                                            int i1842 = ((i1822 | i1832) << 1) - (i1832 ^ i1822);
                                            int i1852 = ((~(i1782 | i)) | (-5)) * 318;
                                            int i1862 = -(android.view.ViewConfiguration.getJumpTapTimeout() >> 16);
                                            java.lang.Object[] objArr852 = new java.lang.Object[1];
                                            c((i1842 & i1852) + (i1852 | i1842), (byte) ((i1862 ^ 14) + ((i1862 & 14) << 1)), "\u001c\r\u0001\u0010", objArr852);
                                            java.lang.Object[] objArr862 = {(java.lang.String) objArr852[0]};
                                            obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                            if (obj6 == null) {
                                            }
                                            long longValue82 = ((java.lang.Long) ((java.lang.reflect.Method) obj6).invoke(null, objArr862)).longValue();
                                            long j312 = longValue82 | j2;
                                            long j322 = (((-929) * longValue82) - 181303048192L) + (((~j312) | (-390739329)) * (-465)) + (((~(j2 | (-390739329))) | longValue82) * 930) + (((-390739329) | j312) * 465) + 899800739;
                                            j5 = (((int) (j322 >> 32)) & ((((((-1159992595) | i10) * 1444) - 1153123274) + ((((~(207822942 | i)) | (-1298609503)) | (~(1229403468 | i))) * (-1444))) - 3969852)) | (((int) j322) & (((((~(746922784 | i10)) | (-765801386)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) - 501357939) + ((~(765801385 | i)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) + (((~(690303625 | i10)) | 75497760 | (~((-18878602) | i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE)));
                                            if (j4 > 0) {
                                                int i1872 = getProfileVersion;
                                                int i1882 = ((i1872 & 117) + (i1872 | 117)) % 128;
                                                SdkCoreAlternateContactlessPaymentDataImpl = i1882;
                                                if (j5 + 100 < j4) {
                                                }
                                            }
                                            java.lang.Object[] objArr912 = new java.lang.Object[1];
                                            c(6 - (~(-android.widget.ExpandableListView.getPackedPositionType(0L))), (byte) (72 - android.text.TextUtils.indexOf(str5, str5, 0, 0)), "\u001a\u0013 \u0013\u0001\u0005㘿", objArr912);
                                            java.lang.String str372 = (java.lang.String) objArr912[0];
                                            java.lang.Object[] objArr922 = new java.lang.Object[1];
                                            b("䪶瀷ㄴ鸏ǿ\ue337\uecea콣쨁鑰곑펌", (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 10, objArr922);
                                            java.lang.String str382 = (java.lang.String) objArr922[0];
                                            java.lang.Object[] objArr932 = new java.lang.Object[1];
                                            b("䪶瀷ㄴ鸏ǿ\ue337\uecea콣촥爂ꈭ拋", 11 - (~(android.view.ViewConfiguration.getScrollDefaultDelay() >> 16)), objArr932);
                                            java.lang.String str392 = (java.lang.String) objArr932[0];
                                            int i1892 = -(-(android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)));
                                            int i1902 = -(-(android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                                            java.lang.Object[] objArr942 = new java.lang.Object[1];
                                            c(((i1892 | 11) << 1) - (i1892 ^ 11), (byte) ((i1902 ^ 25) + ((i1902 & 25) << 1)), "\u001a\u0013 \u0013\u0001\u0005\u0013\u001d\u0013\u0004\u000b\u0005", objArr942);
                                            java.lang.String str402 = (java.lang.String) objArr942[0];
                                            int i1912 = -android.view.View.getDefaultSize(0, 0);
                                            int i1922 = -android.graphics.Color.red(0);
                                            java.lang.Object[] objArr952 = new java.lang.Object[1];
                                            c((i1912 ^ 11) + ((i1912 & 11) << 1), (byte) ((i1922 & 60) + (i1922 | 60)), "\u001f\u0013\u0005\"\u0011\r\r\u001a\u0002\u0000㘰", objArr952);
                                            java.lang.String str412 = (java.lang.String) objArr952[0];
                                            java.lang.Object[] objArr962 = new java.lang.Object[1];
                                            c(4 - (~(-android.graphics.Color.green(0))), (byte) (57 - (~(-(-(android.view.ViewConfiguration.getScrollDefaultDelay() >> 16))))), "\u001a\u0013\u0002\u0000㘮", objArr962);
                                            java.lang.String str422 = (java.lang.String) objArr962[0];
                                            java.lang.Object[] objArr972 = new java.lang.Object[1];
                                            c(android.view.View.combineMeasuredStates(0, 0) + 4, (byte) (123 - (~(-(-android.view.KeyEvent.normalizeMetaState(0))))), "\u001c\u0001\u0005\f", objArr972);
                                            java.lang.String[] strArr42 = {str372, str382, str392, str402, str412, str422, (java.lang.String) objArr972[0]};
                                            i3 = 0;
                                            while (i3 < 7) {
                                            }
                                            i4 = 0;
                                            if (i4 == 0) {
                                            }
                                        }
                                    }
                                }
                                str3 = str;
                                int i16222 = -(-android.graphics.Color.blue(0));
                                java.lang.Object[] objArr7322 = new java.lang.Object[1];
                                b("䪶瀷ㄴ鸏縝갲\ue1b4廙̦럢샱絭\uf4af䔹\uf08b䞿댽\ufafe瓊ఛή뗏ᵕ龌", (i16222 & 23) + (i16222 | 23), objArr7322);
                                java.lang.Object[] objArr7422 = {(java.lang.String) objArr7322[0]};
                                obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                if (obj3 != null) {
                                }
                                long longValue522 = ((java.lang.Long) ((java.lang.reflect.Method) obj3).invoke(null, objArr7422)).longValue();
                                long j2422 = ~longValue522;
                                long j2522 = (46 * longValue522) + 46184436954L + (((~(j2422 | j)) | 1004009499) * (-90)) + (((~(longValue522 | 1004009499)) | (~(j2422 | j2))) * (-45)) + (((~(j | 1004009499)) | j2422 | (~(j2 | (-1004009500)))) * 45) + 286530568;
                                int i16322 = ((int) (j2522 >> 32)) & ((((33817009 | i10) * 1324) - 818884594) + (((~(42340857 | i)) | (~(1394885553 | i))) * (-1324)) + 432064048);
                                int i16422 = ((int) j2522) & (((((~(1353392105 | i10)) | 72622080) * 98) - 1761699848) + (((~(83834304 | i10)) | 1353392105 | (~((-83834305) | i))) * (-49)) + (((~(1353392105 | i)) | 11212224) * 49));
                                j3 = (i16322 ^ i16422) | (i16322 & i16422);
                                int i16522 = -android.graphics.Color.rgb(0, 0, 0);
                                java.lang.Object[] objArr7622 = new java.lang.Object[1];
                                b("괞贙㮽ł⨙\uecbe̦럢哢츈䪶瀷茞푹ᅇ\uedfa\uf605푼", ((-16777199) & i16522) + (i16522 | (-16777199)), objArr7622);
                                java.lang.Object[] objArr7722 = {(java.lang.String) objArr7622[0]};
                                obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                if (obj4 == null) {
                                }
                                long longValue622 = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr7722)).longValue();
                                long j2622 = ~longValue622;
                                str5 = str4;
                                long j2722 = (((-317) * longValue622) - 112529613790L) + (((~(j2 | 352757409)) | j2622) * (-318)) + (((~(j2622 | j2)) | (~(j | (-352757410) | longValue622))) * 318) + (((~(j2622 | j | (-352757410))) | (~((-352757410) | longValue622 | j2))) * 318) + 1643297477;
                                int i16622 = ((int) (j2722 >> 32)) & ((((~((-268453203) | i10)) * 130) - 1317600762) + (((~((-268453203) | i)) | (-2130440192)) * 130));
                                int i16722 = ~((-686231326) | i);
                                int i16822 = ((int) j2722) & (((((~(753356701 | i10)) | (~((-750995085) | i))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL) - 754642723) + (((~(750995084 | i10)) | i16722) * (-1040)) + ((i16722 | (~(686231325 | i10)) | 2361617) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL));
                                long j2822 = (i16622 ^ i16822) | (i16622 & i16822);
                                if (j3 <= 0) {
                                }
                                int maxKeyCode322 = android.view.KeyEvent.getMaxKeyCode() >> 16;
                                int i16922 = maxKeyCode322 * (-244);
                                int i17022 = ((i16922 | 5658) << 1) - (i16922 ^ 5658);
                                int i17122 = ~((i10 ^ (-24)) | (i10 & (-24)));
                                int i17222 = ~((maxKeyCode322 & (-24)) | (maxKeyCode322 ^ (-24)));
                                int i17322 = -(-(((i17122 ^ i17222) | (i17222 & i17122)) * (-245)));
                                int i17422 = ~((i & (-24)) | (i ^ (-24)));
                                java.lang.Object[] objArr8222 = new java.lang.Object[1];
                                b("䪶瀷ㄴ鸏縝갲\ue1b4廙̦럢샱絭\uf4af䔹\uf08b䞿댽\ufafe瓊ఛή뗏ᵕ龌", ((((i17022 & i17322) + (i17322 | i17022)) + ((~(i | (-24))) * (-245))) - (~(-(-(((maxKeyCode322 ^ i17422) | (maxKeyCode322 & i17422)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE))))) - 1, objArr8222);
                                java.lang.Object[] objArr8322 = {(java.lang.String) objArr8222[0]};
                                obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                if (obj5 == null) {
                                }
                                long longValue722 = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr8322)).longValue();
                                long j2922 = ~((~longValue722) | 68359615);
                                long j3022 = ((-107) * longValue722) + 3759778825L + (((~(j | longValue722)) | (~((-68359616) | longValue722))) * (-108)) + (((~(j2 | (-68359616))) | j2922 | (~(j | 68359615))) * 54) + ((j2922 | j2) * 54) + 1222180452;
                                int i17522 = ((int) (j3022 >> 32)) & ((((~(1621155191 | i10)) | (~(1236585693 | i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) + 1502737462 + (((~((-536875299) | i10)) | (~((-152305801) | i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE));
                                int i17622 = ((int) j3022) & ((((~((-1882855690) | i)) | 445629279) * 56) + 1561536445 + (((~(445629279 | i10)) | (-1882855690)) * 56));
                                j4 = (i17522 ^ i17622) | (i17522 & i17622);
                                int i17722 = -(android.view.ViewConfiguration.getEdgeSlop() >> 16);
                                int i17822 = ~i17722;
                                int i17922 = ~((i17822 ^ (-5)) | (i17822 & (-5)) | i);
                                int i18022 = (i10 ^ i17722) | (i10 & i17722);
                                int i18122 = ~((i18022 ^ 4) | (i18022 & 4));
                                int i18222 = (i17722 * (-317)) + 1276 + (((i17922 ^ i18122) | (i17922 & i18122)) * (-318));
                                int i18322 = ((~((i17722 ^ (-5)) | (i17722 & (-5)))) | (~(i17722 | i))) * (-318);
                                int i18422 = ((i18222 | i18322) << 1) - (i18322 ^ i18222);
                                int i18522 = ((~(i17822 | i)) | (-5)) * 318;
                                int i18622 = -(android.view.ViewConfiguration.getJumpTapTimeout() >> 16);
                                java.lang.Object[] objArr8522 = new java.lang.Object[1];
                                c((i18422 & i18522) + (i18522 | i18422), (byte) ((i18622 ^ 14) + ((i18622 & 14) << 1)), "\u001c\r\u0001\u0010", objArr8522);
                                java.lang.Object[] objArr8622 = {(java.lang.String) objArr8522[0]};
                                obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                if (obj6 == null) {
                                }
                                long longValue822 = ((java.lang.Long) ((java.lang.reflect.Method) obj6).invoke(null, objArr8622)).longValue();
                                long j3122 = longValue822 | j2;
                                long j3222 = (((-929) * longValue822) - 181303048192L) + (((~j3122) | (-390739329)) * (-465)) + (((~(j2 | (-390739329))) | longValue822) * 930) + (((-390739329) | j3122) * 465) + 899800739;
                                j5 = (((int) (j3222 >> 32)) & ((((((-1159992595) | i10) * 1444) - 1153123274) + ((((~(207822942 | i)) | (-1298609503)) | (~(1229403468 | i))) * (-1444))) - 3969852)) | (((int) j3222) & (((((~(746922784 | i10)) | (-765801386)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) - 501357939) + ((~(765801385 | i)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) + (((~(690303625 | i10)) | 75497760 | (~((-18878602) | i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE)));
                                if (j4 > 0) {
                                }
                                java.lang.Object[] objArr9122 = new java.lang.Object[1];
                                c(6 - (~(-android.widget.ExpandableListView.getPackedPositionType(0L))), (byte) (72 - android.text.TextUtils.indexOf(str5, str5, 0, 0)), "\u001a\u0013 \u0013\u0001\u0005㘿", objArr9122);
                                java.lang.String str3722 = (java.lang.String) objArr9122[0];
                                java.lang.Object[] objArr9222 = new java.lang.Object[1];
                                b("䪶瀷ㄴ鸏ǿ\ue337\uecea콣쨁鑰곑펌", (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 10, objArr9222);
                                java.lang.String str3822 = (java.lang.String) objArr9222[0];
                                java.lang.Object[] objArr9322 = new java.lang.Object[1];
                                b("䪶瀷ㄴ鸏ǿ\ue337\uecea콣촥爂ꈭ拋", 11 - (~(android.view.ViewConfiguration.getScrollDefaultDelay() >> 16)), objArr9322);
                                java.lang.String str3922 = (java.lang.String) objArr9322[0];
                                int i18922 = -(-(android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)));
                                int i19022 = -(-(android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                                java.lang.Object[] objArr9422 = new java.lang.Object[1];
                                c(((i18922 | 11) << 1) - (i18922 ^ 11), (byte) ((i19022 ^ 25) + ((i19022 & 25) << 1)), "\u001a\u0013 \u0013\u0001\u0005\u0013\u001d\u0013\u0004\u000b\u0005", objArr9422);
                                java.lang.String str4022 = (java.lang.String) objArr9422[0];
                                int i19122 = -android.view.View.getDefaultSize(0, 0);
                                int i19222 = -android.graphics.Color.red(0);
                                java.lang.Object[] objArr9522 = new java.lang.Object[1];
                                c((i19122 ^ 11) + ((i19122 & 11) << 1), (byte) ((i19222 & 60) + (i19222 | 60)), "\u001f\u0013\u0005\"\u0011\r\r\u001a\u0002\u0000㘰", objArr9522);
                                java.lang.String str4122 = (java.lang.String) objArr9522[0];
                                java.lang.Object[] objArr9622 = new java.lang.Object[1];
                                c(4 - (~(-android.graphics.Color.green(0))), (byte) (57 - (~(-(-(android.view.ViewConfiguration.getScrollDefaultDelay() >> 16))))), "\u001a\u0013\u0002\u0000㘮", objArr9622);
                                java.lang.String str4222 = (java.lang.String) objArr9622[0];
                                java.lang.Object[] objArr9722 = new java.lang.Object[1];
                                c(android.view.View.combineMeasuredStates(0, 0) + 4, (byte) (123 - (~(-(-android.view.KeyEvent.normalizeMetaState(0))))), "\u001c\u0001\u0005\f", objArr9722);
                                java.lang.String[] strArr422 = {str3722, str3822, str3922, str4022, str4122, str4222, (java.lang.String) objArr9722[0]};
                                i3 = 0;
                                while (i3 < 7) {
                                }
                                i4 = 0;
                                if (i4 == 0) {
                                }
                            } else {
                                int i266 = -(android.view.ViewConfiguration.getLongPressTimeout() >> 16);
                                java.lang.Object[] objArr208 = new java.lang.Object[1];
                                c(((i266 | 13) << 1) - (i266 ^ 13), (byte) (125 - android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), "\u000f\r\n\u000e\u0005\u0002\u0013\u0006\t\u0019\u0002\u0003㙽", objArr208);
                                java.lang.Object[] objArr209 = {(java.lang.String) objArr208[0]};
                                java.lang.Object obj62 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                if (obj62 == null) {
                                    java.lang.Class cls60 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.view.ViewConfiguration.getTouchSlop() >> 8), (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1921, (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1));
                                    byte b56 = $$a[14];
                                    java.lang.Object[] objArr210 = new java.lang.Object[1];
                                    a((short) (b56 + 1), b56, r6[16], objArr210);
                                    obj62 = cls60.getMethod((java.lang.String) objArr210[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj62);
                                }
                                java.lang.Object invoke6 = ((java.lang.reflect.Method) obj62).invoke(null, objArr209);
                                int resolveSize2 = android.view.View.resolveSize(0, 0);
                                int indexOf2 = android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                i9 = 1;
                                byte b57 = (byte) (((indexOf2 | 102) << 1) - (indexOf2 ^ 102));
                                java.lang.Object[] objArr211 = new java.lang.Object[1];
                                c(resolveSize2 + 1, b57, "㘐", objArr211);
                                c2 = 0;
                            }
                        } else {
                            j = j9;
                            obj7 = invoke;
                            j2 = j8;
                        }
                        if (invoke2 != null) {
                            java.lang.Object[] objArr212 = {invoke2, 42};
                            java.lang.Object obj63 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                            if (obj63 == null) {
                                java.lang.Class cls61 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf(str, str, 0) + 28, (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2594, (char) android.view.KeyEvent.getDeadChar(0, 0));
                                byte b58 = $$a[14];
                                java.lang.Object[] objArr213 = new java.lang.Object[1];
                                a((short) (b58 + 1), b58, r6[16], objArr213);
                                obj63 = cls61.getMethod((java.lang.String) objArr213[0], java.lang.String.class, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj63);
                            }
                            long longValue24 = ((java.lang.Long) ((java.lang.reflect.Method) obj63).invoke(null, objArr212)).longValue();
                            long j68 = ((382 * longValue24) - 64416702820L) + ((longValue24 | j2 | (-169517640)) * (-381)) + (((~((-169517640) | (~longValue24))) | (~(j | longValue24)) | (~(169517639 | longValue24))) * 381) + ((~(longValue24 | (-169517640))) * 381) + 1087582885;
                            int i267 = ((int) (j68 >> 32)) & (((~(954502220 | i10)) * 979) + 337183670 + (((-1903238665) | i) * (-979)) + (((~(954502220 | i)) | (~((-1903238665) | i10))) * 979));
                            int i268 = ((int) j68) & ((((-2067592886) | i) * (-859)) + 298022330 + (((~((-2067592886) | i10)) | (~((-75628811) | i))) * 859) + (((~((-630366476) | i10)) | 554737665) * 859));
                        }
                        if (obj7 != null) {
                            int i269 = SdkCoreAlternateContactlessPaymentDataImpl + 77;
                            getProfileVersion = i269 % 128;
                            if (i269 % 2 != 0) {
                                java.lang.Object[] objArr214 = {obj7, 25};
                                java.lang.Object obj64 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                if (obj64 == null) {
                                    java.lang.Class cls62 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 29, 2594 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (char) android.graphics.Color.green(0));
                                    byte b59 = $$a[14];
                                    java.lang.Object[] objArr215 = new java.lang.Object[1];
                                    a((short) (b59 + 1), b59, r6[16], objArr215);
                                    obj64 = cls62.getMethod((java.lang.String) objArr215[0], java.lang.String.class, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj64);
                                }
                                long longValue25 = ((java.lang.Long) ((java.lang.reflect.Method) obj64).invoke(null, objArr214)).longValue();
                                long j69 = (530 * longValue25) + 495030088018L + (((~(j | 934019032)) | (~(934019032 | longValue25))) * 529) + (((~longValue25) | (~(j2 | 934019032))) * 529) + 323081492;
                                int i270 = ((int) (j69 << 10)) & (((((~((-526709943) | i)) | 373579956) * 345) - 484646000) + (((~((-526709943) | i10)) | 536936512) * 345) + ((~((-373579957) | i)) * 345));
                                int i271 = ((int) j69) & ((((1145053253 | i) * 988) - 570004611) + (((~((-146087867) | i10)) | 2576) * (-1976)) + (((~(1291138543 | i)) | 1145053253 | (~((-1291138544) | i10))) * 988));
                                if (((i270 ^ i271) | (i270 & i271)) != -1032769152) {
                                }
                                if (android.os.Build.VERSION.SDK_INT <= 33) {
                                }
                            } else {
                                java.lang.Object[] objArr216 = {obj7, 42};
                                java.lang.Object obj65 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                if (obj65 == null) {
                                    java.lang.Class cls63 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - android.graphics.Color.argb(0, 0, 0, 0), 2595 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
                                    byte b60 = $$a[14];
                                    java.lang.Object[] objArr217 = new java.lang.Object[1];
                                    a((short) (b60 + 1), b60, r6[16], objArr217);
                                    obj65 = cls63.getMethod((java.lang.String) objArr217[0], java.lang.String.class, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj65);
                                }
                                long longValue26 = ((java.lang.Long) ((java.lang.reflect.Method) obj65).invoke(null, objArr216)).longValue();
                                long j70 = ~longValue26;
                                long j71 = ((-932) * longValue26) + 838772482362L + (((~(j | (-898043344))) | j70) * (-933)) + (((~(j70 | 898043343)) | (~(j70 | j))) * 933) + ((~(longValue26 | 898043343)) * 933) + 359057181;
                                int i272 = (int) (j71 >> 32);
                                int i273 = ~((-27624083) | i);
                            }
                            int i274 = -android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                            java.lang.Object[] objArr262 = new java.lang.Object[1];
                            b("鯂⺢岽炋棂稼ㄴ鸏", ((i274 | 8) << 1) - (i274 ^ 8), objArr262);
                            java.lang.String str82 = (java.lang.String) objArr262[0];
                            int i282 = -(-android.graphics.Color.green(0));
                            int i292 = -(-(android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                            java.lang.Object[] objArr272 = new java.lang.Object[1];
                            c((i282 & 6) + (i282 | 6), (byte) ((i292 ^ 10) + ((i292 & 10) << 1)), "\u001a\u000f\u0017\u0001\u001f\u000b", objArr272);
                            java.lang.String str92 = (java.lang.String) objArr272[0];
                            java.lang.Object[] objArr282 = new java.lang.Object[1];
                            c(8 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (byte) (116 - ((byte) android.view.KeyEvent.getModifierMetaStateMask())), "\u0011\u0016\u0013\u0015\u0002\u0010㙳", objArr282);
                            java.lang.String str102 = (java.lang.String) objArr282[0];
                            int resolveSize3 = android.view.View.resolveSize(0, 0);
                            java.lang.Object[] objArr292 = new java.lang.Object[1];
                            b("껩蔽갗؝桁쉘漤틲\ue2a4㐹", ((resolveSize3 | 9) << 1) - (resolveSize3 ^ 9), objArr292);
                            java.lang.String str112 = (java.lang.String) objArr292[0];
                            java.lang.Object[] objArr302 = new java.lang.Object[1];
                            b("먀뼜蟵炠샱絭", (-43) - (~android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), objArr302);
                            java.lang.String str122 = (java.lang.String) objArr302[0];
                            int lastIndexOf3 = android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                            int i302 = lastIndexOf3 * 659;
                            int i312 = ((i302 | (-9198)) << 1) - (i302 ^ (-9198));
                            int i322 = ~lastIndexOf3;
                            int i332 = ~((i322 ^ 14) | (i322 & 14));
                            int i342 = ~((lastIndexOf3 ^ (-15)) | (lastIndexOf3 & (-15)));
                            int i352 = (i332 ^ i342) | (i332 & i342);
                            int i362 = ~((lastIndexOf3 ^ i) | (lastIndexOf3 & i));
                            int i372 = -(-(((i352 ^ i362) | (i352 & i362)) * (-658)));
                            int i382 = (i312 & i372) + (i372 | i312);
                            int i392 = i342 * 658;
                            int i402 = -(android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16);
                            java.lang.Object[] objArr312 = new java.lang.Object[1];
                            c((((i382 | i392) << 1) - (i392 ^ i382)) + (((i342 ^ i362) | (i362 & i342)) * 658), (byte) ((i402 & 117) + (i402 | 117)), "\u000b\u0005\u0000\u0001\n\u000f\u0005\u0002\u0013\u0006\u000e\u0014㙮", objArr312);
                            java.lang.String str132 = (java.lang.String) objArr312[0];
                            int i412 = -(-android.text.TextUtils.indexOf(str, str, 0, 0));
                            java.lang.Object[] objArr322 = new java.lang.Object[1];
                            b("쀽봕掉\ueeaa嚨馷", ((i412 | 5) << 1) - (i412 ^ 5), objArr322);
                            java.lang.String str142 = (java.lang.String) objArr322[0];
                            int i422 = -(-(android.view.ViewConfiguration.getTouchSlop() >> 8));
                            java.lang.Object[] objArr332 = new java.lang.Object[1];
                            b("ꙇ紖桁쉘혈圾", ((i422 | 6) << 1) - (i422 ^ 6), objArr332);
                            java.lang.String str152 = (java.lang.String) objArr332[0];
                            int i432 = -android.os.Process.getGidForName(str);
                            java.lang.Object[] objArr342 = new java.lang.Object[1];
                            b("씕핪", (i432 & 1) + (i432 | 1), objArr342);
                            java.lang.String str162 = (java.lang.String) objArr342[0];
                            int i442 = -(android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                            java.lang.Object[] objArr352 = new java.lang.Object[1];
                            b("ໟᲄ⩫ᝑ桁쉘ᷞ頎嫑밾疄\uf381茞푹\uda09⳦", (i442 ^ 16) + ((i442 & 16) << 1), objArr352);
                            java.lang.String str172 = (java.lang.String) objArr352[0];
                            float scrollFriction2 = android.view.ViewConfiguration.getScrollFriction();
                            int i452 = -android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                            int i462 = i452 * (-589);
                            int i472 = ~(i10 | (-8));
                            int i482 = ~((i452 ^ (-8)) | (i452 & (-8)));
                            int i492 = (i472 ^ i482) | (i472 & i482);
                            int i502 = ~(i10 | i452);
                            int i512 = ~i452;
                            int i522 = (i512 ^ 7) | (i512 & 7);
                            int i532 = ((((i462 | 4137) << 1) - (i462 ^ 4137)) - (~(-(-((((i492 & i502) | (i492 ^ i502)) | (~((i522 ^ i) | (i522 & i)))) * 590))))) - 1;
                            int i542 = ~((i10 ^ (-8)) | (i10 & (-8)));
                            int i552 = -(-(((i542 ^ i482) | (i482 & i542) | i502) * (-1180)));
                            int i562 = (i532 ^ i552) + ((i552 & i532) << 1);
                            int i572 = ((~(i512 | i10)) | (~((i10 ^ 7) | (i10 & 7)))) * 590;
                            java.lang.Object[] objArr362 = new java.lang.Object[1];
                            c(8 - (~(scrollFriction2 > 0.0f ? 1 : (scrollFriction2 == 0.0f ? 0 : -1))), (byte) (((i562 | i572) << 1) - (i572 ^ i562)), "\u0000\u000e\u0006\u0001\u0019\t\u000e\n\u000f\f", objArr362);
                            java.lang.String str182 = (java.lang.String) objArr362[0];
                            int lastIndexOf22 = android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                            java.lang.Object[] objArr372 = new java.lang.Object[1];
                            b("魪\udc62់吟ᦻῐ\ue534쑅", (lastIndexOf22 ^ 9) + ((lastIndexOf22 & 9) << 1), objArr372);
                            java.lang.String str192 = (java.lang.String) objArr372[0];
                            int i582 = -(-(android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16));
                            java.lang.Object[] objArr382 = new java.lang.Object[1];
                            b("魪\udc62\ue899嬅᧥励\ue9b1搽퐒ᔭ\u0015鰛", (i582 ^ 12) + ((i582 & 12) << 1), objArr382);
                            java.lang.String str202 = (java.lang.String) objArr382[0];
                            int keyRepeatTimeout2 = android.view.ViewConfiguration.getKeyRepeatTimeout();
                            int maxKeyCode4 = android.view.KeyEvent.getMaxKeyCode() >> 16;
                            int i592 = maxKeyCode4 * (-344);
                            int i602 = ~maxKeyCode4;
                            int i612 = ~(i602 | i10);
                            int i622 = ~((maxKeyCode4 & (-6)) | (maxKeyCode4 ^ (-6)));
                            int i632 = (i592 ^ (-1720)) + ((i592 & (-1720)) << 1);
                            int i642 = (i602 ^ (-6)) | (i602 & (-6));
                            int i652 = ((i632 + (((~((i602 & i) | (i602 ^ i))) | (~i642)) * 345)) - (~(((i622 ^ i612) | (i612 & i622)) * 345))) - 1;
                            int i662 = -(-((~((i642 & i) | (i642 ^ i))) * 345));
                            java.lang.Object[] objArr392 = new java.lang.Object[1];
                            c((keyRepeatTimeout2 >> 16) + 14, (byte) ((i652 & i662) + (i662 | i652)), "\u0014\r\u0010\u0006\f\r㗻㗻\u0005\u0010\u0005\f\u0001\u0003", objArr392);
                            java.lang.String str212 = (java.lang.String) objArr392[0];
                            int i672 = -(-android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0));
                            int rgb2 = android.graphics.Color.rgb(0, 0, 0);
                            int i682 = rgb2 * 165;
                            int i692 = (1560279458 & i682) + (i682 | 1560279458) + (((~((16777226 ^ i10) | (16777226 & i10))) | rgb2) * (-328));
                            int i702 = -(-(((rgb2 ^ i) | (rgb2 & i)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE));
                            int i712 = (i692 ^ i702) + ((i702 & i692) << 1);
                            int i722 = ~rgb2;
                            int i732 = ~((i722 ^ (-16777227)) | ((-16777227) & i722));
                            int i742 = ~(((-16777227) ^ i) | ((-16777227) & i));
                            int i752 = (rgb2 ^ i10) | (rgb2 & i10);
                            int i762 = ((i732 ^ i742) | (i732 & i742) | (~((i752 ^ 16777226) | (16777226 & i752)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE;
                            java.lang.Object[] objArr402 = new java.lang.Object[1];
                            c(((i672 | 8) << 1) - (i672 ^ 8), (byte) ((i712 & i762) + (i762 | i712)), "\u0010\u0002\u0012\u0011\u0017\u001e㗸", objArr402);
                            java.lang.String str222 = (java.lang.String) objArr402[0];
                            int i772 = -android.view.View.getDefaultSize(0, 0);
                            int i782 = i772 * (-721);
                            int i792 = ~i772;
                            int i802 = ~(i792 | (-8));
                            int i812 = (i802 ^ i10) | (i802 & i10);
                            int i822 = ~(i772 | 7);
                            int i832 = -(-(((i812 ^ i822) | (i812 & i822)) * 1444));
                            int i842 = ~((i772 ^ 7) | (i772 & 7));
                            int i852 = ~(i772 | i);
                            int i862 = (i842 ^ i852) | (i842 & i852);
                            int i872 = ~((i ^ 7) | (i & 7));
                            int i882 = ((((((i782 | (-5047)) << 1) - (i782 ^ (-5047))) - (~i832)) - 1) - (~(-(-(((i862 & i872) | (i862 ^ i872)) * (-1444)))))) - 1;
                            int i892 = -(-(((~((i772 ^ (-8)) | (i772 & (-8)))) | (~(i792 | 7))) * 722));
                            java.lang.Object[] objArr412 = new java.lang.Object[1];
                            b("⍆넅懃皗뵵攆嚨馷", (i882 ^ i892) + ((i892 & i882) << 1), objArr412);
                            java.lang.String str232 = (java.lang.String) objArr412[0];
                            int i902 = -(-android.text.TextUtils.getCapsMode(str, 0, 0));
                            java.lang.Object[] objArr422 = new java.lang.Object[1];
                            b("࢜럞샱絭ǿ\ue337㪥둍", ((i902 | 7) << 1) - (i902 ^ 7), objArr422);
                            java.lang.String str242 = (java.lang.String) objArr422[0];
                            java.lang.Object[] objArr432 = new java.lang.Object[1];
                            c(2 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (byte) (74 - (~(-android.text.TextUtils.indexOf(str, str, 0)))), "㘴㘴", objArr432);
                            java.lang.String str252 = (java.lang.String) objArr432[0];
                            int i912 = -(android.view.ViewConfiguration.getScrollDefaultDelay() >> 16);
                            java.lang.Object[] objArr442 = new java.lang.Object[1];
                            b("嫑밾戒葈ꮣ窢ⵓ播述섥砶\uf606់吟䝼矙偒钄螙족", (i912 & 20) + (i912 | 20), objArr442);
                            java.lang.String str262 = (java.lang.String) objArr442[0];
                            int maxKeyCode22 = android.view.KeyEvent.getMaxKeyCode() >> 16;
                            int i922 = maxKeyCode22 * 829;
                            int i932 = (i922 & 4974) + (i922 | 4974);
                            int i942 = ~((~maxKeyCode22) | (-7));
                            int i952 = i10 | maxKeyCode22;
                            int i962 = ~((i952 ^ 6) | (i952 & 6));
                            int i972 = ((i942 ^ i962) | (i942 & i962)) * (-828);
                            int i982 = ((i932 | i972) << 1) - (i972 ^ i932);
                            int i992 = (maxKeyCode22 ^ 6) | (maxKeyCode22 & 6);
                            int i1002 = -(-(((i992 ^ i10) | (i992 & i10)) * (-828)));
                            java.lang.Object[] objArr452 = new java.lang.Object[1];
                            b("嫑밾ᦻῐ閤\ud930", ((((i982 | i1002) << 1) - (i1002 ^ i982)) - (~(-(-((~(maxKeyCode22 | 6)) * 828))))) - 1, objArr452);
                            java.lang.String str272 = (java.lang.String) objArr452[0];
                            int i1012 = -(android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                            java.lang.Object[] objArr462 = new java.lang.Object[1];
                            b("躓ぎ", ((i1012 | 2) << 1) - (i1012 ^ 2), objArr462);
                            java.lang.String str282 = (java.lang.String) objArr462[0];
                            int pressedStateDuration2 = android.view.ViewConfiguration.getPressedStateDuration();
                            int i1022 = -(-android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0));
                            java.lang.Object[] objArr472 = new java.lang.Object[1];
                            c((pressedStateDuration2 >> 16) + 16, (byte) (((i1022 | 126) << 1) - (i1022 ^ 126)), "\u0015\u001a\u0005\u000b\u0001\u0000\u001c\u0002\u000f\b\u0012\u0002\u0018\u0003\u0013\u0015", objArr472);
                            java.lang.String str292 = (java.lang.String) objArr472[0];
                            int i1032 = -(-(android.os.Process.myPid() >> 22));
                            int i1042 = -(android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16);
                            java.lang.Object[] objArr482 = new java.lang.Object[1];
                            c(8 - (~i1032), (byte) ((i1042 & 125) + (i1042 | 125)), "\u0002\f\u001d\u000f\u0001\u0016\u0018\u0003㙯", objArr482);
                            java.lang.String str302 = (java.lang.String) objArr482[0];
                            int i1052 = (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                            int i1062 = -android.text.TextUtils.indexOf(str, str, 0);
                            java.lang.Object[] objArr492 = new java.lang.Object[1];
                            c((i1052 ^ 11) + ((i1052 & 11) << 1), (byte) ((i1062 ^ 88) + ((i1062 & 88) << 1)), "\u0002\f\u001d\u000f\u0001\u0016\u0018\u0003\u0017\t", objArr492);
                            java.lang.String str312 = (java.lang.String) objArr492[0];
                            int i1072 = -android.widget.ExpandableListView.getPackedPositionGroup(0L);
                            java.lang.Object[] objArr502 = new java.lang.Object[1];
                            b("鱩ힷⱮ⡬桁쉘登⊋ǿ\ue337ὰ㎪", ((i1072 | 11) << 1) - (i1072 ^ 11), objArr502);
                            java.lang.String str322 = (java.lang.String) objArr502[0];
                            java.lang.Object[] objArr512 = new java.lang.Object[1];
                            c(12 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (byte) (114 - android.view.View.resolveSize(0, 0)), "\u0017\u001e\u0011\u0003\"\u0011#\u0000\"\u000b㙧", objArr512);
                            java.lang.String str332 = (java.lang.String) objArr512[0];
                            int i1082 = -android.view.Gravity.getAbsoluteGravity(0, 0);
                            int i1092 = -android.view.View.resolveSizeAndState(0, 0, 0);
                            int i1102 = (i1092 * (-495)) - 37620;
                            int i1112 = ~i1092;
                            int i1122 = ~(i1112 | (-77));
                            int i1132 = ~((i1112 ^ i) | (i1112 & i));
                            int i1142 = ((i1132 & i1122) | (i1122 ^ i1132)) * 992;
                            int i1152 = (i1102 & i1142) + (i1102 | i1142);
                            int i1162 = ~(i1112 | i);
                            int i1172 = (i1162 ^ i1122) | (i1122 & i1162);
                            int i1182 = i1092 | i10;
                            int i1192 = ~((i1182 ^ 76) | (i1182 & 76));
                            int i1202 = -(-(((i1192 ^ i1172) | (i1192 & i1172)) * (-496)));
                            java.lang.Object[] objArr522 = new java.lang.Object[1];
                            c(((i1082 | 15) << 1) - (i1082 ^ 15), (byte) ((i1152 & i1202) + (i1202 | i1152) + (((i ^ 76) | (i & 76)) * 496)), "\u0017\u001e\u0011\u0003\"\u0011 \f\u0001\n#\u0000\"\u000b㙁", objArr522);
                            java.lang.String str342 = (java.lang.String) objArr522[0];
                            int capsMode2 = android.text.TextUtils.getCapsMode(str, 0, 0);
                            java.lang.Object[] objArr532 = new java.lang.Object[1];
                            b("窤\uefc0ⵓ播\udcbeృ䟹枀\ua635螯凂珖럆\udae7", (capsMode2 & 14) + (capsMode2 | 14), objArr532);
                            java.lang.String[] strArr22 = {str82, str92, str102, str112, str122, str132, str142, str152, str162, str172, str182, str192, str202, str212, str222, str232, str242, str252, str262, str272, str282, str292, str302, str312, str322, str332, str342, (java.lang.String) objArr532[0]};
                            java.lang.Object[] objArr542 = new java.lang.Object[1];
                            b("㮽łᦻ煘戒葈흖\uf5c2戒葈ᵕ龌", (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 11, objArr542);
                            java.lang.Object[] objArr552 = {(java.lang.String) objArr542[0]};
                            obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                            if (obj2 == null) {
                            }
                            str2 = (java.lang.String) ((java.lang.reflect.Method) obj2).invoke(null, objArr552);
                            if (str2 != null) {
                            }
                            str3 = str;
                            int i162222 = -(-android.graphics.Color.blue(0));
                            java.lang.Object[] objArr73222 = new java.lang.Object[1];
                            b("䪶瀷ㄴ鸏縝갲\ue1b4廙̦럢샱絭\uf4af䔹\uf08b䞿댽\ufafe瓊ఛή뗏ᵕ龌", (i162222 & 23) + (i162222 | 23), objArr73222);
                            java.lang.Object[] objArr74222 = {(java.lang.String) objArr73222[0]};
                            obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                            if (obj3 != null) {
                            }
                            long longValue5222 = ((java.lang.Long) ((java.lang.reflect.Method) obj3).invoke(null, objArr74222)).longValue();
                            long j24222 = ~longValue5222;
                            long j25222 = (46 * longValue5222) + 46184436954L + (((~(j24222 | j)) | 1004009499) * (-90)) + (((~(longValue5222 | 1004009499)) | (~(j24222 | j2))) * (-45)) + (((~(j | 1004009499)) | j24222 | (~(j2 | (-1004009500)))) * 45) + 286530568;
                            int i163222 = ((int) (j25222 >> 32)) & ((((33817009 | i10) * 1324) - 818884594) + (((~(42340857 | i)) | (~(1394885553 | i))) * (-1324)) + 432064048);
                            int i164222 = ((int) j25222) & (((((~(1353392105 | i10)) | 72622080) * 98) - 1761699848) + (((~(83834304 | i10)) | 1353392105 | (~((-83834305) | i))) * (-49)) + (((~(1353392105 | i)) | 11212224) * 49));
                            j3 = (i163222 ^ i164222) | (i163222 & i164222);
                            int i165222 = -android.graphics.Color.rgb(0, 0, 0);
                            java.lang.Object[] objArr76222 = new java.lang.Object[1];
                            b("괞贙㮽ł⨙\uecbe̦럢哢츈䪶瀷茞푹ᅇ\uedfa\uf605푼", ((-16777199) & i165222) + (i165222 | (-16777199)), objArr76222);
                            java.lang.Object[] objArr77222 = {(java.lang.String) objArr76222[0]};
                            obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                            if (obj4 == null) {
                            }
                            long longValue6222 = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr77222)).longValue();
                            long j26222 = ~longValue6222;
                            str5 = str4;
                            long j27222 = (((-317) * longValue6222) - 112529613790L) + (((~(j2 | 352757409)) | j26222) * (-318)) + (((~(j26222 | j2)) | (~(j | (-352757410) | longValue6222))) * 318) + (((~(j26222 | j | (-352757410))) | (~((-352757410) | longValue6222 | j2))) * 318) + 1643297477;
                            int i166222 = ((int) (j27222 >> 32)) & ((((~((-268453203) | i10)) * 130) - 1317600762) + (((~((-268453203) | i)) | (-2130440192)) * 130));
                            int i167222 = ~((-686231326) | i);
                            int i168222 = ((int) j27222) & (((((~(753356701 | i10)) | (~((-750995085) | i))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL) - 754642723) + (((~(750995084 | i10)) | i167222) * (-1040)) + ((i167222 | (~(686231325 | i10)) | 2361617) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL));
                            long j28222 = (i166222 ^ i168222) | (i166222 & i168222);
                            if (j3 <= 0) {
                            }
                            int maxKeyCode3222 = android.view.KeyEvent.getMaxKeyCode() >> 16;
                            int i169222 = maxKeyCode3222 * (-244);
                            int i170222 = ((i169222 | 5658) << 1) - (i169222 ^ 5658);
                            int i171222 = ~((i10 ^ (-24)) | (i10 & (-24)));
                            int i172222 = ~((maxKeyCode3222 & (-24)) | (maxKeyCode3222 ^ (-24)));
                            int i173222 = -(-(((i171222 ^ i172222) | (i172222 & i171222)) * (-245)));
                            int i174222 = ~((i & (-24)) | (i ^ (-24)));
                            java.lang.Object[] objArr82222 = new java.lang.Object[1];
                            b("䪶瀷ㄴ鸏縝갲\ue1b4廙̦럢샱絭\uf4af䔹\uf08b䞿댽\ufafe瓊ఛή뗏ᵕ龌", ((((i170222 & i173222) + (i173222 | i170222)) + ((~(i | (-24))) * (-245))) - (~(-(-(((maxKeyCode3222 ^ i174222) | (maxKeyCode3222 & i174222)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE))))) - 1, objArr82222);
                            java.lang.Object[] objArr83222 = {(java.lang.String) objArr82222[0]};
                            obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                            if (obj5 == null) {
                            }
                            long longValue7222 = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr83222)).longValue();
                            long j29222 = ~((~longValue7222) | 68359615);
                            long j30222 = ((-107) * longValue7222) + 3759778825L + (((~(j | longValue7222)) | (~((-68359616) | longValue7222))) * (-108)) + (((~(j2 | (-68359616))) | j29222 | (~(j | 68359615))) * 54) + ((j29222 | j2) * 54) + 1222180452;
                            int i175222 = ((int) (j30222 >> 32)) & ((((~(1621155191 | i10)) | (~(1236585693 | i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) + 1502737462 + (((~((-536875299) | i10)) | (~((-152305801) | i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE));
                            int i176222 = ((int) j30222) & ((((~((-1882855690) | i)) | 445629279) * 56) + 1561536445 + (((~(445629279 | i10)) | (-1882855690)) * 56));
                            j4 = (i175222 ^ i176222) | (i175222 & i176222);
                            int i177222 = -(android.view.ViewConfiguration.getEdgeSlop() >> 16);
                            int i178222 = ~i177222;
                            int i179222 = ~((i178222 ^ (-5)) | (i178222 & (-5)) | i);
                            int i180222 = (i10 ^ i177222) | (i10 & i177222);
                            int i181222 = ~((i180222 ^ 4) | (i180222 & 4));
                            int i182222 = (i177222 * (-317)) + 1276 + (((i179222 ^ i181222) | (i179222 & i181222)) * (-318));
                            int i183222 = ((~((i177222 ^ (-5)) | (i177222 & (-5)))) | (~(i177222 | i))) * (-318);
                            int i184222 = ((i182222 | i183222) << 1) - (i183222 ^ i182222);
                            int i185222 = ((~(i178222 | i)) | (-5)) * 318;
                            int i186222 = -(android.view.ViewConfiguration.getJumpTapTimeout() >> 16);
                            java.lang.Object[] objArr85222 = new java.lang.Object[1];
                            c((i184222 & i185222) + (i185222 | i184222), (byte) ((i186222 ^ 14) + ((i186222 & 14) << 1)), "\u001c\r\u0001\u0010", objArr85222);
                            java.lang.Object[] objArr86222 = {(java.lang.String) objArr85222[0]};
                            obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                            if (obj6 == null) {
                            }
                            long longValue8222 = ((java.lang.Long) ((java.lang.reflect.Method) obj6).invoke(null, objArr86222)).longValue();
                            long j31222 = longValue8222 | j2;
                            long j32222 = (((-929) * longValue8222) - 181303048192L) + (((~j31222) | (-390739329)) * (-465)) + (((~(j2 | (-390739329))) | longValue8222) * 930) + (((-390739329) | j31222) * 465) + 899800739;
                            j5 = (((int) (j32222 >> 32)) & ((((((-1159992595) | i10) * 1444) - 1153123274) + ((((~(207822942 | i)) | (-1298609503)) | (~(1229403468 | i))) * (-1444))) - 3969852)) | (((int) j32222) & (((((~(746922784 | i10)) | (-765801386)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) - 501357939) + ((~(765801385 | i)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) + (((~(690303625 | i10)) | 75497760 | (~((-18878602) | i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE)));
                            if (j4 > 0) {
                            }
                            java.lang.Object[] objArr91222 = new java.lang.Object[1];
                            c(6 - (~(-android.widget.ExpandableListView.getPackedPositionType(0L))), (byte) (72 - android.text.TextUtils.indexOf(str5, str5, 0, 0)), "\u001a\u0013 \u0013\u0001\u0005㘿", objArr91222);
                            java.lang.String str37222 = (java.lang.String) objArr91222[0];
                            java.lang.Object[] objArr92222 = new java.lang.Object[1];
                            b("䪶瀷ㄴ鸏ǿ\ue337\uecea콣쨁鑰곑펌", (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 10, objArr92222);
                            java.lang.String str38222 = (java.lang.String) objArr92222[0];
                            java.lang.Object[] objArr93222 = new java.lang.Object[1];
                            b("䪶瀷ㄴ鸏ǿ\ue337\uecea콣촥爂ꈭ拋", 11 - (~(android.view.ViewConfiguration.getScrollDefaultDelay() >> 16)), objArr93222);
                            java.lang.String str39222 = (java.lang.String) objArr93222[0];
                            int i189222 = -(-(android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)));
                            int i190222 = -(-(android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                            java.lang.Object[] objArr94222 = new java.lang.Object[1];
                            c(((i189222 | 11) << 1) - (i189222 ^ 11), (byte) ((i190222 ^ 25) + ((i190222 & 25) << 1)), "\u001a\u0013 \u0013\u0001\u0005\u0013\u001d\u0013\u0004\u000b\u0005", objArr94222);
                            java.lang.String str40222 = (java.lang.String) objArr94222[0];
                            int i191222 = -android.view.View.getDefaultSize(0, 0);
                            int i192222 = -android.graphics.Color.red(0);
                            java.lang.Object[] objArr95222 = new java.lang.Object[1];
                            c((i191222 ^ 11) + ((i191222 & 11) << 1), (byte) ((i192222 & 60) + (i192222 | 60)), "\u001f\u0013\u0005\"\u0011\r\r\u001a\u0002\u0000㘰", objArr95222);
                            java.lang.String str41222 = (java.lang.String) objArr95222[0];
                            java.lang.Object[] objArr96222 = new java.lang.Object[1];
                            c(4 - (~(-android.graphics.Color.green(0))), (byte) (57 - (~(-(-(android.view.ViewConfiguration.getScrollDefaultDelay() >> 16))))), "\u001a\u0013\u0002\u0000㘮", objArr96222);
                            java.lang.String str42222 = (java.lang.String) objArr96222[0];
                            java.lang.Object[] objArr97222 = new java.lang.Object[1];
                            c(android.view.View.combineMeasuredStates(0, 0) + 4, (byte) (123 - (~(-(-android.view.KeyEvent.normalizeMetaState(0))))), "\u001c\u0001\u0005\f", objArr97222);
                            java.lang.String[] strArr4222 = {str37222, str38222, str39222, str40222, str41222, str42222, (java.lang.String) objArr97222[0]};
                            i3 = 0;
                            while (i3 < 7) {
                            }
                            i4 = 0;
                            if (i4 == 0) {
                            }
                        }
                        if (invoke2 != null) {
                            java.lang.Object[] objArr218 = {invoke2, 42};
                            java.lang.Object obj66 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                            if (obj66 == null) {
                                java.lang.Class cls64 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 2594 - (android.view.ViewConfiguration.getTouchSlop() >> 8), (char) (android.view.ViewConfiguration.getTapTimeout() >> 16));
                                byte b61 = $$a[14];
                                java.lang.Object[] objArr219 = new java.lang.Object[1];
                                a((short) (b61 + 1), b61, r6[16], objArr219);
                                obj66 = cls64.getMethod((java.lang.String) objArr219[0], java.lang.String.class, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj66);
                            }
                            long longValue27 = ((java.lang.Long) ((java.lang.reflect.Method) obj66).invoke(null, objArr218)).longValue();
                            long j72 = ~longValue27;
                            long j73 = ~(395968306 | j72 | j2);
                            long j74 = ((-712) * longValue27) + 282721370484L + (((~(longValue27 | (-395968307))) | (~(j | (-395968307))) | j73) * (-713)) + (j73 * 1426) + ((~(j72 | j)) * 713) + 861132218;
                            int i275 = ~(805163773 | i10);
                            int i276 = ~(190121847 | i);
                        }
                        int i2742 = -android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                        java.lang.Object[] objArr2622 = new java.lang.Object[1];
                        b("鯂⺢岽炋棂稼ㄴ鸏", ((i2742 | 8) << 1) - (i2742 ^ 8), objArr2622);
                        java.lang.String str822 = (java.lang.String) objArr2622[0];
                        int i2822 = -(-android.graphics.Color.green(0));
                        int i2922 = -(-(android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                        java.lang.Object[] objArr2722 = new java.lang.Object[1];
                        c((i2822 & 6) + (i2822 | 6), (byte) ((i2922 ^ 10) + ((i2922 & 10) << 1)), "\u001a\u000f\u0017\u0001\u001f\u000b", objArr2722);
                        java.lang.String str922 = (java.lang.String) objArr2722[0];
                        java.lang.Object[] objArr2822 = new java.lang.Object[1];
                        c(8 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (byte) (116 - ((byte) android.view.KeyEvent.getModifierMetaStateMask())), "\u0011\u0016\u0013\u0015\u0002\u0010㙳", objArr2822);
                        java.lang.String str1022 = (java.lang.String) objArr2822[0];
                        int resolveSize32 = android.view.View.resolveSize(0, 0);
                        java.lang.Object[] objArr2922 = new java.lang.Object[1];
                        b("껩蔽갗؝桁쉘漤틲\ue2a4㐹", ((resolveSize32 | 9) << 1) - (resolveSize32 ^ 9), objArr2922);
                        java.lang.String str1122 = (java.lang.String) objArr2922[0];
                        java.lang.Object[] objArr3022 = new java.lang.Object[1];
                        b("먀뼜蟵炠샱絭", (-43) - (~android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), objArr3022);
                        java.lang.String str1222 = (java.lang.String) objArr3022[0];
                        int lastIndexOf32 = android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                        int i3022 = lastIndexOf32 * 659;
                        int i3122 = ((i3022 | (-9198)) << 1) - (i3022 ^ (-9198));
                        int i3222 = ~lastIndexOf32;
                        int i3322 = ~((i3222 ^ 14) | (i3222 & 14));
                        int i3422 = ~((lastIndexOf32 ^ (-15)) | (lastIndexOf32 & (-15)));
                        int i3522 = (i3322 ^ i3422) | (i3322 & i3422);
                        int i3622 = ~((lastIndexOf32 ^ i) | (lastIndexOf32 & i));
                        int i3722 = -(-(((i3522 ^ i3622) | (i3522 & i3622)) * (-658)));
                        int i3822 = (i3122 & i3722) + (i3722 | i3122);
                        int i3922 = i3422 * 658;
                        int i4022 = -(android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        java.lang.Object[] objArr3122 = new java.lang.Object[1];
                        c((((i3822 | i3922) << 1) - (i3922 ^ i3822)) + (((i3422 ^ i3622) | (i3622 & i3422)) * 658), (byte) ((i4022 & 117) + (i4022 | 117)), "\u000b\u0005\u0000\u0001\n\u000f\u0005\u0002\u0013\u0006\u000e\u0014㙮", objArr3122);
                        java.lang.String str1322 = (java.lang.String) objArr3122[0];
                        int i4122 = -(-android.text.TextUtils.indexOf(str, str, 0, 0));
                        java.lang.Object[] objArr3222 = new java.lang.Object[1];
                        b("쀽봕掉\ueeaa嚨馷", ((i4122 | 5) << 1) - (i4122 ^ 5), objArr3222);
                        java.lang.String str1422 = (java.lang.String) objArr3222[0];
                        int i4222 = -(-(android.view.ViewConfiguration.getTouchSlop() >> 8));
                        java.lang.Object[] objArr3322 = new java.lang.Object[1];
                        b("ꙇ紖桁쉘혈圾", ((i4222 | 6) << 1) - (i4222 ^ 6), objArr3322);
                        java.lang.String str1522 = (java.lang.String) objArr3322[0];
                        int i4322 = -android.os.Process.getGidForName(str);
                        java.lang.Object[] objArr3422 = new java.lang.Object[1];
                        b("씕핪", (i4322 & 1) + (i4322 | 1), objArr3422);
                        java.lang.String str1622 = (java.lang.String) objArr3422[0];
                        int i4422 = -(android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                        java.lang.Object[] objArr3522 = new java.lang.Object[1];
                        b("ໟᲄ⩫ᝑ桁쉘ᷞ頎嫑밾疄\uf381茞푹\uda09⳦", (i4422 ^ 16) + ((i4422 & 16) << 1), objArr3522);
                        java.lang.String str1722 = (java.lang.String) objArr3522[0];
                        float scrollFriction22 = android.view.ViewConfiguration.getScrollFriction();
                        int i4522 = -android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                        int i4622 = i4522 * (-589);
                        int i4722 = ~(i10 | (-8));
                        int i4822 = ~((i4522 ^ (-8)) | (i4522 & (-8)));
                        int i4922 = (i4722 ^ i4822) | (i4722 & i4822);
                        int i5022 = ~(i10 | i4522);
                        int i5122 = ~i4522;
                        int i5222 = (i5122 ^ 7) | (i5122 & 7);
                        int i5322 = ((((i4622 | 4137) << 1) - (i4622 ^ 4137)) - (~(-(-((((i4922 & i5022) | (i4922 ^ i5022)) | (~((i5222 ^ i) | (i5222 & i)))) * 590))))) - 1;
                        int i5422 = ~((i10 ^ (-8)) | (i10 & (-8)));
                        int i5522 = -(-(((i5422 ^ i4822) | (i4822 & i5422) | i5022) * (-1180)));
                        int i5622 = (i5322 ^ i5522) + ((i5522 & i5322) << 1);
                        int i5722 = ((~(i5122 | i10)) | (~((i10 ^ 7) | (i10 & 7)))) * 590;
                        java.lang.Object[] objArr3622 = new java.lang.Object[1];
                        c(8 - (~(scrollFriction22 > 0.0f ? 1 : (scrollFriction22 == 0.0f ? 0 : -1))), (byte) (((i5622 | i5722) << 1) - (i5722 ^ i5622)), "\u0000\u000e\u0006\u0001\u0019\t\u000e\n\u000f\f", objArr3622);
                        java.lang.String str1822 = (java.lang.String) objArr3622[0];
                        int lastIndexOf222 = android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                        java.lang.Object[] objArr3722 = new java.lang.Object[1];
                        b("魪\udc62់吟ᦻῐ\ue534쑅", (lastIndexOf222 ^ 9) + ((lastIndexOf222 & 9) << 1), objArr3722);
                        java.lang.String str1922 = (java.lang.String) objArr3722[0];
                        int i5822 = -(-(android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16));
                        java.lang.Object[] objArr3822 = new java.lang.Object[1];
                        b("魪\udc62\ue899嬅᧥励\ue9b1搽퐒ᔭ\u0015鰛", (i5822 ^ 12) + ((i5822 & 12) << 1), objArr3822);
                        java.lang.String str2022 = (java.lang.String) objArr3822[0];
                        int keyRepeatTimeout22 = android.view.ViewConfiguration.getKeyRepeatTimeout();
                        int maxKeyCode42 = android.view.KeyEvent.getMaxKeyCode() >> 16;
                        int i5922 = maxKeyCode42 * (-344);
                        int i6022 = ~maxKeyCode42;
                        int i6122 = ~(i6022 | i10);
                        int i6222 = ~((maxKeyCode42 & (-6)) | (maxKeyCode42 ^ (-6)));
                        int i6322 = (i5922 ^ (-1720)) + ((i5922 & (-1720)) << 1);
                        int i6422 = (i6022 ^ (-6)) | (i6022 & (-6));
                        int i6522 = ((i6322 + (((~((i6022 & i) | (i6022 ^ i))) | (~i6422)) * 345)) - (~(((i6222 ^ i6122) | (i6122 & i6222)) * 345))) - 1;
                        int i6622 = -(-((~((i6422 & i) | (i6422 ^ i))) * 345));
                        java.lang.Object[] objArr3922 = new java.lang.Object[1];
                        c((keyRepeatTimeout22 >> 16) + 14, (byte) ((i6522 & i6622) + (i6622 | i6522)), "\u0014\r\u0010\u0006\f\r㗻㗻\u0005\u0010\u0005\f\u0001\u0003", objArr3922);
                        java.lang.String str2122 = (java.lang.String) objArr3922[0];
                        int i6722 = -(-android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0));
                        int rgb22 = android.graphics.Color.rgb(0, 0, 0);
                        int i6822 = rgb22 * 165;
                        int i6922 = (1560279458 & i6822) + (i6822 | 1560279458) + (((~((16777226 ^ i10) | (16777226 & i10))) | rgb22) * (-328));
                        int i7022 = -(-(((rgb22 ^ i) | (rgb22 & i)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE));
                        int i7122 = (i6922 ^ i7022) + ((i7022 & i6922) << 1);
                        int i7222 = ~rgb22;
                        int i7322 = ~((i7222 ^ (-16777227)) | ((-16777227) & i7222));
                        int i7422 = ~(((-16777227) ^ i) | ((-16777227) & i));
                        int i7522 = (rgb22 ^ i10) | (rgb22 & i10);
                        int i7622 = ((i7322 ^ i7422) | (i7322 & i7422) | (~((i7522 ^ 16777226) | (16777226 & i7522)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE;
                        java.lang.Object[] objArr4022 = new java.lang.Object[1];
                        c(((i6722 | 8) << 1) - (i6722 ^ 8), (byte) ((i7122 & i7622) + (i7622 | i7122)), "\u0010\u0002\u0012\u0011\u0017\u001e㗸", objArr4022);
                        java.lang.String str2222 = (java.lang.String) objArr4022[0];
                        int i7722 = -android.view.View.getDefaultSize(0, 0);
                        int i7822 = i7722 * (-721);
                        int i7922 = ~i7722;
                        int i8022 = ~(i7922 | (-8));
                        int i8122 = (i8022 ^ i10) | (i8022 & i10);
                        int i8222 = ~(i7722 | 7);
                        int i8322 = -(-(((i8122 ^ i8222) | (i8122 & i8222)) * 1444));
                        int i8422 = ~((i7722 ^ 7) | (i7722 & 7));
                        int i8522 = ~(i7722 | i);
                        int i8622 = (i8422 ^ i8522) | (i8422 & i8522);
                        int i8722 = ~((i ^ 7) | (i & 7));
                        int i8822 = ((((((i7822 | (-5047)) << 1) - (i7822 ^ (-5047))) - (~i8322)) - 1) - (~(-(-(((i8622 & i8722) | (i8622 ^ i8722)) * (-1444)))))) - 1;
                        int i8922 = -(-(((~((i7722 ^ (-8)) | (i7722 & (-8)))) | (~(i7922 | 7))) * 722));
                        java.lang.Object[] objArr4122 = new java.lang.Object[1];
                        b("⍆넅懃皗뵵攆嚨馷", (i8822 ^ i8922) + ((i8922 & i8822) << 1), objArr4122);
                        java.lang.String str2322 = (java.lang.String) objArr4122[0];
                        int i9022 = -(-android.text.TextUtils.getCapsMode(str, 0, 0));
                        java.lang.Object[] objArr4222 = new java.lang.Object[1];
                        b("࢜럞샱絭ǿ\ue337㪥둍", ((i9022 | 7) << 1) - (i9022 ^ 7), objArr4222);
                        java.lang.String str2422 = (java.lang.String) objArr4222[0];
                        java.lang.Object[] objArr4322 = new java.lang.Object[1];
                        c(2 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (byte) (74 - (~(-android.text.TextUtils.indexOf(str, str, 0)))), "㘴㘴", objArr4322);
                        java.lang.String str2522 = (java.lang.String) objArr4322[0];
                        int i9122 = -(android.view.ViewConfiguration.getScrollDefaultDelay() >> 16);
                        java.lang.Object[] objArr4422 = new java.lang.Object[1];
                        b("嫑밾戒葈ꮣ窢ⵓ播述섥砶\uf606់吟䝼矙偒钄螙족", (i9122 & 20) + (i9122 | 20), objArr4422);
                        java.lang.String str2622 = (java.lang.String) objArr4422[0];
                        int maxKeyCode222 = android.view.KeyEvent.getMaxKeyCode() >> 16;
                        int i9222 = maxKeyCode222 * 829;
                        int i9322 = (i9222 & 4974) + (i9222 | 4974);
                        int i9422 = ~((~maxKeyCode222) | (-7));
                        int i9522 = i10 | maxKeyCode222;
                        int i9622 = ~((i9522 ^ 6) | (i9522 & 6));
                        int i9722 = ((i9422 ^ i9622) | (i9422 & i9622)) * (-828);
                        int i9822 = ((i9322 | i9722) << 1) - (i9722 ^ i9322);
                        int i9922 = (maxKeyCode222 ^ 6) | (maxKeyCode222 & 6);
                        int i10022 = -(-(((i9922 ^ i10) | (i9922 & i10)) * (-828)));
                        java.lang.Object[] objArr4522 = new java.lang.Object[1];
                        b("嫑밾ᦻῐ閤\ud930", ((((i9822 | i10022) << 1) - (i10022 ^ i9822)) - (~(-(-((~(maxKeyCode222 | 6)) * 828))))) - 1, objArr4522);
                        java.lang.String str2722 = (java.lang.String) objArr4522[0];
                        int i10122 = -(android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        java.lang.Object[] objArr4622 = new java.lang.Object[1];
                        b("躓ぎ", ((i10122 | 2) << 1) - (i10122 ^ 2), objArr4622);
                        java.lang.String str2822 = (java.lang.String) objArr4622[0];
                        int pressedStateDuration22 = android.view.ViewConfiguration.getPressedStateDuration();
                        int i10222 = -(-android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0));
                        java.lang.Object[] objArr4722 = new java.lang.Object[1];
                        c((pressedStateDuration22 >> 16) + 16, (byte) (((i10222 | 126) << 1) - (i10222 ^ 126)), "\u0015\u001a\u0005\u000b\u0001\u0000\u001c\u0002\u000f\b\u0012\u0002\u0018\u0003\u0013\u0015", objArr4722);
                        java.lang.String str2922 = (java.lang.String) objArr4722[0];
                        int i10322 = -(-(android.os.Process.myPid() >> 22));
                        int i10422 = -(android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        java.lang.Object[] objArr4822 = new java.lang.Object[1];
                        c(8 - (~i10322), (byte) ((i10422 & 125) + (i10422 | 125)), "\u0002\f\u001d\u000f\u0001\u0016\u0018\u0003㙯", objArr4822);
                        java.lang.String str3022 = (java.lang.String) objArr4822[0];
                        int i10522 = (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                        int i10622 = -android.text.TextUtils.indexOf(str, str, 0);
                        java.lang.Object[] objArr4922 = new java.lang.Object[1];
                        c((i10522 ^ 11) + ((i10522 & 11) << 1), (byte) ((i10622 ^ 88) + ((i10622 & 88) << 1)), "\u0002\f\u001d\u000f\u0001\u0016\u0018\u0003\u0017\t", objArr4922);
                        java.lang.String str3122 = (java.lang.String) objArr4922[0];
                        int i10722 = -android.widget.ExpandableListView.getPackedPositionGroup(0L);
                        java.lang.Object[] objArr5022 = new java.lang.Object[1];
                        b("鱩ힷⱮ⡬桁쉘登⊋ǿ\ue337ὰ㎪", ((i10722 | 11) << 1) - (i10722 ^ 11), objArr5022);
                        java.lang.String str3222 = (java.lang.String) objArr5022[0];
                        java.lang.Object[] objArr5122 = new java.lang.Object[1];
                        c(12 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (byte) (114 - android.view.View.resolveSize(0, 0)), "\u0017\u001e\u0011\u0003\"\u0011#\u0000\"\u000b㙧", objArr5122);
                        java.lang.String str3322 = (java.lang.String) objArr5122[0];
                        int i10822 = -android.view.Gravity.getAbsoluteGravity(0, 0);
                        int i10922 = -android.view.View.resolveSizeAndState(0, 0, 0);
                        int i11022 = (i10922 * (-495)) - 37620;
                        int i11122 = ~i10922;
                        int i11222 = ~(i11122 | (-77));
                        int i11322 = ~((i11122 ^ i) | (i11122 & i));
                        int i11422 = ((i11322 & i11222) | (i11222 ^ i11322)) * 992;
                        int i11522 = (i11022 & i11422) + (i11022 | i11422);
                        int i11622 = ~(i11122 | i);
                        int i11722 = (i11622 ^ i11222) | (i11222 & i11622);
                        int i11822 = i10922 | i10;
                        int i11922 = ~((i11822 ^ 76) | (i11822 & 76));
                        int i12022 = -(-(((i11922 ^ i11722) | (i11922 & i11722)) * (-496)));
                        java.lang.Object[] objArr5222 = new java.lang.Object[1];
                        c(((i10822 | 15) << 1) - (i10822 ^ 15), (byte) ((i11522 & i12022) + (i12022 | i11522) + (((i ^ 76) | (i & 76)) * 496)), "\u0017\u001e\u0011\u0003\"\u0011 \f\u0001\n#\u0000\"\u000b㙁", objArr5222);
                        java.lang.String str3422 = (java.lang.String) objArr5222[0];
                        int capsMode22 = android.text.TextUtils.getCapsMode(str, 0, 0);
                        java.lang.Object[] objArr5322 = new java.lang.Object[1];
                        b("窤\uefc0ⵓ播\udcbeృ䟹枀\ua635螯凂珖럆\udae7", (capsMode22 & 14) + (capsMode22 | 14), objArr5322);
                        java.lang.String[] strArr222 = {str822, str922, str1022, str1122, str1222, str1322, str1422, str1522, str1622, str1722, str1822, str1922, str2022, str2122, str2222, str2322, str2422, str2522, str2622, str2722, str2822, str2922, str3022, str3122, str3222, str3322, str3422, (java.lang.String) objArr5322[0]};
                        java.lang.Object[] objArr5422 = new java.lang.Object[1];
                        b("㮽łᦻ煘戒葈흖\uf5c2戒葈ᵕ龌", (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 11, objArr5422);
                        java.lang.Object[] objArr5522 = {(java.lang.String) objArr5422[0]};
                        obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                        if (obj2 == null) {
                        }
                        str2 = (java.lang.String) ((java.lang.reflect.Method) obj2).invoke(null, objArr5522);
                        if (str2 != null) {
                        }
                        str3 = str;
                        int i1622222 = -(-android.graphics.Color.blue(0));
                        java.lang.Object[] objArr732222 = new java.lang.Object[1];
                        b("䪶瀷ㄴ鸏縝갲\ue1b4廙̦럢샱絭\uf4af䔹\uf08b䞿댽\ufafe瓊ఛή뗏ᵕ龌", (i1622222 & 23) + (i1622222 | 23), objArr732222);
                        java.lang.Object[] objArr742222 = {(java.lang.String) objArr732222[0]};
                        obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                        if (obj3 != null) {
                        }
                        long longValue52222 = ((java.lang.Long) ((java.lang.reflect.Method) obj3).invoke(null, objArr742222)).longValue();
                        long j242222 = ~longValue52222;
                        long j252222 = (46 * longValue52222) + 46184436954L + (((~(j242222 | j)) | 1004009499) * (-90)) + (((~(longValue52222 | 1004009499)) | (~(j242222 | j2))) * (-45)) + (((~(j | 1004009499)) | j242222 | (~(j2 | (-1004009500)))) * 45) + 286530568;
                        int i1632222 = ((int) (j252222 >> 32)) & ((((33817009 | i10) * 1324) - 818884594) + (((~(42340857 | i)) | (~(1394885553 | i))) * (-1324)) + 432064048);
                        int i1642222 = ((int) j252222) & (((((~(1353392105 | i10)) | 72622080) * 98) - 1761699848) + (((~(83834304 | i10)) | 1353392105 | (~((-83834305) | i))) * (-49)) + (((~(1353392105 | i)) | 11212224) * 49));
                        j3 = (i1632222 ^ i1642222) | (i1632222 & i1642222);
                        int i1652222 = -android.graphics.Color.rgb(0, 0, 0);
                        java.lang.Object[] objArr762222 = new java.lang.Object[1];
                        b("괞贙㮽ł⨙\uecbe̦럢哢츈䪶瀷茞푹ᅇ\uedfa\uf605푼", ((-16777199) & i1652222) + (i1652222 | (-16777199)), objArr762222);
                        java.lang.Object[] objArr772222 = {(java.lang.String) objArr762222[0]};
                        obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                        if (obj4 == null) {
                        }
                        long longValue62222 = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr772222)).longValue();
                        long j262222 = ~longValue62222;
                        str5 = str4;
                        long j272222 = (((-317) * longValue62222) - 112529613790L) + (((~(j2 | 352757409)) | j262222) * (-318)) + (((~(j262222 | j2)) | (~(j | (-352757410) | longValue62222))) * 318) + (((~(j262222 | j | (-352757410))) | (~((-352757410) | longValue62222 | j2))) * 318) + 1643297477;
                        int i1662222 = ((int) (j272222 >> 32)) & ((((~((-268453203) | i10)) * 130) - 1317600762) + (((~((-268453203) | i)) | (-2130440192)) * 130));
                        int i1672222 = ~((-686231326) | i);
                        int i1682222 = ((int) j272222) & (((((~(753356701 | i10)) | (~((-750995085) | i))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL) - 754642723) + (((~(750995084 | i10)) | i1672222) * (-1040)) + ((i1672222 | (~(686231325 | i10)) | 2361617) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL));
                        long j282222 = (i1662222 ^ i1682222) | (i1662222 & i1682222);
                        if (j3 <= 0) {
                        }
                        int maxKeyCode32222 = android.view.KeyEvent.getMaxKeyCode() >> 16;
                        int i1692222 = maxKeyCode32222 * (-244);
                        int i1702222 = ((i1692222 | 5658) << 1) - (i1692222 ^ 5658);
                        int i1712222 = ~((i10 ^ (-24)) | (i10 & (-24)));
                        int i1722222 = ~((maxKeyCode32222 & (-24)) | (maxKeyCode32222 ^ (-24)));
                        int i1732222 = -(-(((i1712222 ^ i1722222) | (i1722222 & i1712222)) * (-245)));
                        int i1742222 = ~((i & (-24)) | (i ^ (-24)));
                        java.lang.Object[] objArr822222 = new java.lang.Object[1];
                        b("䪶瀷ㄴ鸏縝갲\ue1b4廙̦럢샱絭\uf4af䔹\uf08b䞿댽\ufafe瓊ఛή뗏ᵕ龌", ((((i1702222 & i1732222) + (i1732222 | i1702222)) + ((~(i | (-24))) * (-245))) - (~(-(-(((maxKeyCode32222 ^ i1742222) | (maxKeyCode32222 & i1742222)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE))))) - 1, objArr822222);
                        java.lang.Object[] objArr832222 = {(java.lang.String) objArr822222[0]};
                        obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                        if (obj5 == null) {
                        }
                        long longValue72222 = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr832222)).longValue();
                        long j292222 = ~((~longValue72222) | 68359615);
                        long j302222 = ((-107) * longValue72222) + 3759778825L + (((~(j | longValue72222)) | (~((-68359616) | longValue72222))) * (-108)) + (((~(j2 | (-68359616))) | j292222 | (~(j | 68359615))) * 54) + ((j292222 | j2) * 54) + 1222180452;
                        int i1752222 = ((int) (j302222 >> 32)) & ((((~(1621155191 | i10)) | (~(1236585693 | i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) + 1502737462 + (((~((-536875299) | i10)) | (~((-152305801) | i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE));
                        int i1762222 = ((int) j302222) & ((((~((-1882855690) | i)) | 445629279) * 56) + 1561536445 + (((~(445629279 | i10)) | (-1882855690)) * 56));
                        j4 = (i1752222 ^ i1762222) | (i1752222 & i1762222);
                        int i1772222 = -(android.view.ViewConfiguration.getEdgeSlop() >> 16);
                        int i1782222 = ~i1772222;
                        int i1792222 = ~((i1782222 ^ (-5)) | (i1782222 & (-5)) | i);
                        int i1802222 = (i10 ^ i1772222) | (i10 & i1772222);
                        int i1812222 = ~((i1802222 ^ 4) | (i1802222 & 4));
                        int i1822222 = (i1772222 * (-317)) + 1276 + (((i1792222 ^ i1812222) | (i1792222 & i1812222)) * (-318));
                        int i1832222 = ((~((i1772222 ^ (-5)) | (i1772222 & (-5)))) | (~(i1772222 | i))) * (-318);
                        int i1842222 = ((i1822222 | i1832222) << 1) - (i1832222 ^ i1822222);
                        int i1852222 = ((~(i1782222 | i)) | (-5)) * 318;
                        int i1862222 = -(android.view.ViewConfiguration.getJumpTapTimeout() >> 16);
                        java.lang.Object[] objArr852222 = new java.lang.Object[1];
                        c((i1842222 & i1852222) + (i1852222 | i1842222), (byte) ((i1862222 ^ 14) + ((i1862222 & 14) << 1)), "\u001c\r\u0001\u0010", objArr852222);
                        java.lang.Object[] objArr862222 = {(java.lang.String) objArr852222[0]};
                        obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                        if (obj6 == null) {
                        }
                        long longValue82222 = ((java.lang.Long) ((java.lang.reflect.Method) obj6).invoke(null, objArr862222)).longValue();
                        long j312222 = longValue82222 | j2;
                        long j322222 = (((-929) * longValue82222) - 181303048192L) + (((~j312222) | (-390739329)) * (-465)) + (((~(j2 | (-390739329))) | longValue82222) * 930) + (((-390739329) | j312222) * 465) + 899800739;
                        j5 = (((int) (j322222 >> 32)) & ((((((-1159992595) | i10) * 1444) - 1153123274) + ((((~(207822942 | i)) | (-1298609503)) | (~(1229403468 | i))) * (-1444))) - 3969852)) | (((int) j322222) & (((((~(746922784 | i10)) | (-765801386)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) - 501357939) + ((~(765801385 | i)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) + (((~(690303625 | i10)) | 75497760 | (~((-18878602) | i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE)));
                        if (j4 > 0) {
                        }
                        java.lang.Object[] objArr912222 = new java.lang.Object[1];
                        c(6 - (~(-android.widget.ExpandableListView.getPackedPositionType(0L))), (byte) (72 - android.text.TextUtils.indexOf(str5, str5, 0, 0)), "\u001a\u0013 \u0013\u0001\u0005㘿", objArr912222);
                        java.lang.String str372222 = (java.lang.String) objArr912222[0];
                        java.lang.Object[] objArr922222 = new java.lang.Object[1];
                        b("䪶瀷ㄴ鸏ǿ\ue337\uecea콣쨁鑰곑펌", (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 10, objArr922222);
                        java.lang.String str382222 = (java.lang.String) objArr922222[0];
                        java.lang.Object[] objArr932222 = new java.lang.Object[1];
                        b("䪶瀷ㄴ鸏ǿ\ue337\uecea콣촥爂ꈭ拋", 11 - (~(android.view.ViewConfiguration.getScrollDefaultDelay() >> 16)), objArr932222);
                        java.lang.String str392222 = (java.lang.String) objArr932222[0];
                        int i1892222 = -(-(android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)));
                        int i1902222 = -(-(android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                        java.lang.Object[] objArr942222 = new java.lang.Object[1];
                        c(((i1892222 | 11) << 1) - (i1892222 ^ 11), (byte) ((i1902222 ^ 25) + ((i1902222 & 25) << 1)), "\u001a\u0013 \u0013\u0001\u0005\u0013\u001d\u0013\u0004\u000b\u0005", objArr942222);
                        java.lang.String str402222 = (java.lang.String) objArr942222[0];
                        int i1912222 = -android.view.View.getDefaultSize(0, 0);
                        int i1922222 = -android.graphics.Color.red(0);
                        java.lang.Object[] objArr952222 = new java.lang.Object[1];
                        c((i1912222 ^ 11) + ((i1912222 & 11) << 1), (byte) ((i1922222 & 60) + (i1922222 | 60)), "\u001f\u0013\u0005\"\u0011\r\r\u001a\u0002\u0000㘰", objArr952222);
                        java.lang.String str412222 = (java.lang.String) objArr952222[0];
                        java.lang.Object[] objArr962222 = new java.lang.Object[1];
                        c(4 - (~(-android.graphics.Color.green(0))), (byte) (57 - (~(-(-(android.view.ViewConfiguration.getScrollDefaultDelay() >> 16))))), "\u001a\u0013\u0002\u0000㘮", objArr962222);
                        java.lang.String str422222 = (java.lang.String) objArr962222[0];
                        java.lang.Object[] objArr972222 = new java.lang.Object[1];
                        c(android.view.View.combineMeasuredStates(0, 0) + 4, (byte) (123 - (~(-(-android.view.KeyEvent.normalizeMetaState(0))))), "\u001c\u0001\u0005\f", objArr972222);
                        java.lang.String[] strArr42222 = {str372222, str382222, str392222, str402222, str412222, str422222, (java.lang.String) objArr972222[0]};
                        i3 = 0;
                        while (i3 < 7) {
                        }
                        i4 = 0;
                        if (i4 == 0) {
                        }
                    } else {
                        i18++;
                        SdkCoreAlternateContactlessPaymentDataImpl = (getProfileVersion + 75) % 128;
                        i17 = 2;
                        c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
                    }
                }
            }
            j = j9;
            j2 = j8;
            int i27422 = -android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
            java.lang.Object[] objArr26222 = new java.lang.Object[1];
            b("鯂⺢岽炋棂稼ㄴ鸏", ((i27422 | 8) << 1) - (i27422 ^ 8), objArr26222);
            java.lang.String str8222 = (java.lang.String) objArr26222[0];
            int i28222 = -(-android.graphics.Color.green(0));
            int i29222 = -(-(android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
            java.lang.Object[] objArr27222 = new java.lang.Object[1];
            c((i28222 & 6) + (i28222 | 6), (byte) ((i29222 ^ 10) + ((i29222 & 10) << 1)), "\u001a\u000f\u0017\u0001\u001f\u000b", objArr27222);
            java.lang.String str9222 = (java.lang.String) objArr27222[0];
            java.lang.Object[] objArr28222 = new java.lang.Object[1];
            c(8 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (byte) (116 - ((byte) android.view.KeyEvent.getModifierMetaStateMask())), "\u0011\u0016\u0013\u0015\u0002\u0010㙳", objArr28222);
            java.lang.String str10222 = (java.lang.String) objArr28222[0];
            int resolveSize322 = android.view.View.resolveSize(0, 0);
            java.lang.Object[] objArr29222 = new java.lang.Object[1];
            b("껩蔽갗؝桁쉘漤틲\ue2a4㐹", ((resolveSize322 | 9) << 1) - (resolveSize322 ^ 9), objArr29222);
            java.lang.String str11222 = (java.lang.String) objArr29222[0];
            java.lang.Object[] objArr30222 = new java.lang.Object[1];
            b("먀뼜蟵炠샱絭", (-43) - (~android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), objArr30222);
            java.lang.String str12222 = (java.lang.String) objArr30222[0];
            int lastIndexOf322 = android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
            int i30222 = lastIndexOf322 * 659;
            int i31222 = ((i30222 | (-9198)) << 1) - (i30222 ^ (-9198));
            int i32222 = ~lastIndexOf322;
            int i33222 = ~((i32222 ^ 14) | (i32222 & 14));
            int i34222 = ~((lastIndexOf322 ^ (-15)) | (lastIndexOf322 & (-15)));
            int i35222 = (i33222 ^ i34222) | (i33222 & i34222);
            int i36222 = ~((lastIndexOf322 ^ i) | (lastIndexOf322 & i));
            int i37222 = -(-(((i35222 ^ i36222) | (i35222 & i36222)) * (-658)));
            int i38222 = (i31222 & i37222) + (i37222 | i31222);
            int i39222 = i34222 * 658;
            int i40222 = -(android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16);
            java.lang.Object[] objArr31222 = new java.lang.Object[1];
            c((((i38222 | i39222) << 1) - (i39222 ^ i38222)) + (((i34222 ^ i36222) | (i36222 & i34222)) * 658), (byte) ((i40222 & 117) + (i40222 | 117)), "\u000b\u0005\u0000\u0001\n\u000f\u0005\u0002\u0013\u0006\u000e\u0014㙮", objArr31222);
            java.lang.String str13222 = (java.lang.String) objArr31222[0];
            int i41222 = -(-android.text.TextUtils.indexOf(str, str, 0, 0));
            java.lang.Object[] objArr32222 = new java.lang.Object[1];
            b("쀽봕掉\ueeaa嚨馷", ((i41222 | 5) << 1) - (i41222 ^ 5), objArr32222);
            java.lang.String str14222 = (java.lang.String) objArr32222[0];
            int i42222 = -(-(android.view.ViewConfiguration.getTouchSlop() >> 8));
            java.lang.Object[] objArr33222 = new java.lang.Object[1];
            b("ꙇ紖桁쉘혈圾", ((i42222 | 6) << 1) - (i42222 ^ 6), objArr33222);
            java.lang.String str15222 = (java.lang.String) objArr33222[0];
            int i43222 = -android.os.Process.getGidForName(str);
            java.lang.Object[] objArr34222 = new java.lang.Object[1];
            b("씕핪", (i43222 & 1) + (i43222 | 1), objArr34222);
            java.lang.String str16222 = (java.lang.String) objArr34222[0];
            int i44222 = -(android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            java.lang.Object[] objArr35222 = new java.lang.Object[1];
            b("ໟᲄ⩫ᝑ桁쉘ᷞ頎嫑밾疄\uf381茞푹\uda09⳦", (i44222 ^ 16) + ((i44222 & 16) << 1), objArr35222);
            java.lang.String str17222 = (java.lang.String) objArr35222[0];
            float scrollFriction222 = android.view.ViewConfiguration.getScrollFriction();
            int i45222 = -android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
            int i46222 = i45222 * (-589);
            int i47222 = ~(i10 | (-8));
            int i48222 = ~((i45222 ^ (-8)) | (i45222 & (-8)));
            int i49222 = (i47222 ^ i48222) | (i47222 & i48222);
            int i50222 = ~(i10 | i45222);
            int i51222 = ~i45222;
            int i52222 = (i51222 ^ 7) | (i51222 & 7);
            int i53222 = ((((i46222 | 4137) << 1) - (i46222 ^ 4137)) - (~(-(-((((i49222 & i50222) | (i49222 ^ i50222)) | (~((i52222 ^ i) | (i52222 & i)))) * 590))))) - 1;
            int i54222 = ~((i10 ^ (-8)) | (i10 & (-8)));
            int i55222 = -(-(((i54222 ^ i48222) | (i48222 & i54222) | i50222) * (-1180)));
            int i56222 = (i53222 ^ i55222) + ((i55222 & i53222) << 1);
            int i57222 = ((~(i51222 | i10)) | (~((i10 ^ 7) | (i10 & 7)))) * 590;
            java.lang.Object[] objArr36222 = new java.lang.Object[1];
            c(8 - (~(scrollFriction222 > 0.0f ? 1 : (scrollFriction222 == 0.0f ? 0 : -1))), (byte) (((i56222 | i57222) << 1) - (i57222 ^ i56222)), "\u0000\u000e\u0006\u0001\u0019\t\u000e\n\u000f\f", objArr36222);
            java.lang.String str18222 = (java.lang.String) objArr36222[0];
            int lastIndexOf2222 = android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
            java.lang.Object[] objArr37222 = new java.lang.Object[1];
            b("魪\udc62់吟ᦻῐ\ue534쑅", (lastIndexOf2222 ^ 9) + ((lastIndexOf2222 & 9) << 1), objArr37222);
            java.lang.String str19222 = (java.lang.String) objArr37222[0];
            int i58222 = -(-(android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16));
            java.lang.Object[] objArr38222 = new java.lang.Object[1];
            b("魪\udc62\ue899嬅᧥励\ue9b1搽퐒ᔭ\u0015鰛", (i58222 ^ 12) + ((i58222 & 12) << 1), objArr38222);
            java.lang.String str20222 = (java.lang.String) objArr38222[0];
            int keyRepeatTimeout222 = android.view.ViewConfiguration.getKeyRepeatTimeout();
            int maxKeyCode422 = android.view.KeyEvent.getMaxKeyCode() >> 16;
            int i59222 = maxKeyCode422 * (-344);
            int i60222 = ~maxKeyCode422;
            int i61222 = ~(i60222 | i10);
            int i62222 = ~((maxKeyCode422 & (-6)) | (maxKeyCode422 ^ (-6)));
            int i63222 = (i59222 ^ (-1720)) + ((i59222 & (-1720)) << 1);
            int i64222 = (i60222 ^ (-6)) | (i60222 & (-6));
            int i65222 = ((i63222 + (((~((i60222 & i) | (i60222 ^ i))) | (~i64222)) * 345)) - (~(((i62222 ^ i61222) | (i61222 & i62222)) * 345))) - 1;
            int i66222 = -(-((~((i64222 & i) | (i64222 ^ i))) * 345));
            java.lang.Object[] objArr39222 = new java.lang.Object[1];
            c((keyRepeatTimeout222 >> 16) + 14, (byte) ((i65222 & i66222) + (i66222 | i65222)), "\u0014\r\u0010\u0006\f\r㗻㗻\u0005\u0010\u0005\f\u0001\u0003", objArr39222);
            java.lang.String str21222 = (java.lang.String) objArr39222[0];
            int i67222 = -(-android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0));
            int rgb222 = android.graphics.Color.rgb(0, 0, 0);
            int i68222 = rgb222 * 165;
            int i69222 = (1560279458 & i68222) + (i68222 | 1560279458) + (((~((16777226 ^ i10) | (16777226 & i10))) | rgb222) * (-328));
            int i70222 = -(-(((rgb222 ^ i) | (rgb222 & i)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE));
            int i71222 = (i69222 ^ i70222) + ((i70222 & i69222) << 1);
            int i72222 = ~rgb222;
            int i73222 = ~((i72222 ^ (-16777227)) | ((-16777227) & i72222));
            int i74222 = ~(((-16777227) ^ i) | ((-16777227) & i));
            int i75222 = (rgb222 ^ i10) | (rgb222 & i10);
            int i76222 = ((i73222 ^ i74222) | (i73222 & i74222) | (~((i75222 ^ 16777226) | (16777226 & i75222)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE;
            java.lang.Object[] objArr40222 = new java.lang.Object[1];
            c(((i67222 | 8) << 1) - (i67222 ^ 8), (byte) ((i71222 & i76222) + (i76222 | i71222)), "\u0010\u0002\u0012\u0011\u0017\u001e㗸", objArr40222);
            java.lang.String str22222 = (java.lang.String) objArr40222[0];
            int i77222 = -android.view.View.getDefaultSize(0, 0);
            int i78222 = i77222 * (-721);
            int i79222 = ~i77222;
            int i80222 = ~(i79222 | (-8));
            int i81222 = (i80222 ^ i10) | (i80222 & i10);
            int i82222 = ~(i77222 | 7);
            int i83222 = -(-(((i81222 ^ i82222) | (i81222 & i82222)) * 1444));
            int i84222 = ~((i77222 ^ 7) | (i77222 & 7));
            int i85222 = ~(i77222 | i);
            int i86222 = (i84222 ^ i85222) | (i84222 & i85222);
            int i87222 = ~((i ^ 7) | (i & 7));
            int i88222 = ((((((i78222 | (-5047)) << 1) - (i78222 ^ (-5047))) - (~i83222)) - 1) - (~(-(-(((i86222 & i87222) | (i86222 ^ i87222)) * (-1444)))))) - 1;
            int i89222 = -(-(((~((i77222 ^ (-8)) | (i77222 & (-8)))) | (~(i79222 | 7))) * 722));
            java.lang.Object[] objArr41222 = new java.lang.Object[1];
            b("⍆넅懃皗뵵攆嚨馷", (i88222 ^ i89222) + ((i89222 & i88222) << 1), objArr41222);
            java.lang.String str23222 = (java.lang.String) objArr41222[0];
            int i90222 = -(-android.text.TextUtils.getCapsMode(str, 0, 0));
            java.lang.Object[] objArr42222 = new java.lang.Object[1];
            b("࢜럞샱絭ǿ\ue337㪥둍", ((i90222 | 7) << 1) - (i90222 ^ 7), objArr42222);
            java.lang.String str24222 = (java.lang.String) objArr42222[0];
            java.lang.Object[] objArr43222 = new java.lang.Object[1];
            c(2 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (byte) (74 - (~(-android.text.TextUtils.indexOf(str, str, 0)))), "㘴㘴", objArr43222);
            java.lang.String str25222 = (java.lang.String) objArr43222[0];
            int i91222 = -(android.view.ViewConfiguration.getScrollDefaultDelay() >> 16);
            java.lang.Object[] objArr44222 = new java.lang.Object[1];
            b("嫑밾戒葈ꮣ窢ⵓ播述섥砶\uf606់吟䝼矙偒钄螙족", (i91222 & 20) + (i91222 | 20), objArr44222);
            java.lang.String str26222 = (java.lang.String) objArr44222[0];
            int maxKeyCode2222 = android.view.KeyEvent.getMaxKeyCode() >> 16;
            int i92222 = maxKeyCode2222 * 829;
            int i93222 = (i92222 & 4974) + (i92222 | 4974);
            int i94222 = ~((~maxKeyCode2222) | (-7));
            int i95222 = i10 | maxKeyCode2222;
            int i96222 = ~((i95222 ^ 6) | (i95222 & 6));
            int i97222 = ((i94222 ^ i96222) | (i94222 & i96222)) * (-828);
            int i98222 = ((i93222 | i97222) << 1) - (i97222 ^ i93222);
            int i99222 = (maxKeyCode2222 ^ 6) | (maxKeyCode2222 & 6);
            int i100222 = -(-(((i99222 ^ i10) | (i99222 & i10)) * (-828)));
            java.lang.Object[] objArr45222 = new java.lang.Object[1];
            b("嫑밾ᦻῐ閤\ud930", ((((i98222 | i100222) << 1) - (i100222 ^ i98222)) - (~(-(-((~(maxKeyCode2222 | 6)) * 828))))) - 1, objArr45222);
            java.lang.String str27222 = (java.lang.String) objArr45222[0];
            int i101222 = -(android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
            java.lang.Object[] objArr46222 = new java.lang.Object[1];
            b("躓ぎ", ((i101222 | 2) << 1) - (i101222 ^ 2), objArr46222);
            java.lang.String str28222 = (java.lang.String) objArr46222[0];
            int pressedStateDuration222 = android.view.ViewConfiguration.getPressedStateDuration();
            int i102222 = -(-android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0));
            java.lang.Object[] objArr47222 = new java.lang.Object[1];
            c((pressedStateDuration222 >> 16) + 16, (byte) (((i102222 | 126) << 1) - (i102222 ^ 126)), "\u0015\u001a\u0005\u000b\u0001\u0000\u001c\u0002\u000f\b\u0012\u0002\u0018\u0003\u0013\u0015", objArr47222);
            java.lang.String str29222 = (java.lang.String) objArr47222[0];
            int i103222 = -(-(android.os.Process.myPid() >> 22));
            int i104222 = -(android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16);
            java.lang.Object[] objArr48222 = new java.lang.Object[1];
            c(8 - (~i103222), (byte) ((i104222 & 125) + (i104222 | 125)), "\u0002\f\u001d\u000f\u0001\u0016\u0018\u0003㙯", objArr48222);
            java.lang.String str30222 = (java.lang.String) objArr48222[0];
            int i105222 = (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
            int i106222 = -android.text.TextUtils.indexOf(str, str, 0);
            java.lang.Object[] objArr49222 = new java.lang.Object[1];
            c((i105222 ^ 11) + ((i105222 & 11) << 1), (byte) ((i106222 ^ 88) + ((i106222 & 88) << 1)), "\u0002\f\u001d\u000f\u0001\u0016\u0018\u0003\u0017\t", objArr49222);
            java.lang.String str31222 = (java.lang.String) objArr49222[0];
            int i107222 = -android.widget.ExpandableListView.getPackedPositionGroup(0L);
            java.lang.Object[] objArr50222 = new java.lang.Object[1];
            b("鱩ힷⱮ⡬桁쉘登⊋ǿ\ue337ὰ㎪", ((i107222 | 11) << 1) - (i107222 ^ 11), objArr50222);
            java.lang.String str32222 = (java.lang.String) objArr50222[0];
            java.lang.Object[] objArr51222 = new java.lang.Object[1];
            c(12 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (byte) (114 - android.view.View.resolveSize(0, 0)), "\u0017\u001e\u0011\u0003\"\u0011#\u0000\"\u000b㙧", objArr51222);
            java.lang.String str33222 = (java.lang.String) objArr51222[0];
            int i108222 = -android.view.Gravity.getAbsoluteGravity(0, 0);
            int i109222 = -android.view.View.resolveSizeAndState(0, 0, 0);
            int i110222 = (i109222 * (-495)) - 37620;
            int i111222 = ~i109222;
            int i112222 = ~(i111222 | (-77));
            int i113222 = ~((i111222 ^ i) | (i111222 & i));
            int i114222 = ((i113222 & i112222) | (i112222 ^ i113222)) * 992;
            int i115222 = (i110222 & i114222) + (i110222 | i114222);
            int i116222 = ~(i111222 | i);
            int i117222 = (i116222 ^ i112222) | (i112222 & i116222);
            int i118222 = i109222 | i10;
            int i119222 = ~((i118222 ^ 76) | (i118222 & 76));
            int i120222 = -(-(((i119222 ^ i117222) | (i119222 & i117222)) * (-496)));
            java.lang.Object[] objArr52222 = new java.lang.Object[1];
            c(((i108222 | 15) << 1) - (i108222 ^ 15), (byte) ((i115222 & i120222) + (i120222 | i115222) + (((i ^ 76) | (i & 76)) * 496)), "\u0017\u001e\u0011\u0003\"\u0011 \f\u0001\n#\u0000\"\u000b㙁", objArr52222);
            java.lang.String str34222 = (java.lang.String) objArr52222[0];
            int capsMode222 = android.text.TextUtils.getCapsMode(str, 0, 0);
            java.lang.Object[] objArr53222 = new java.lang.Object[1];
            b("窤\uefc0ⵓ播\udcbeృ䟹枀\ua635螯凂珖럆\udae7", (capsMode222 & 14) + (capsMode222 | 14), objArr53222);
            java.lang.String[] strArr2222 = {str8222, str9222, str10222, str11222, str12222, str13222, str14222, str15222, str16222, str17222, str18222, str19222, str20222, str21222, str22222, str23222, str24222, str25222, str26222, str27222, str28222, str29222, str30222, str31222, str32222, str33222, str34222, (java.lang.String) objArr53222[0]};
            java.lang.Object[] objArr54222 = new java.lang.Object[1];
            b("㮽łᦻ煘戒葈흖\uf5c2戒葈ᵕ龌", (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 11, objArr54222);
            java.lang.Object[] objArr55222 = {(java.lang.String) objArr54222[0]};
            obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
            if (obj2 == null) {
            }
            str2 = (java.lang.String) ((java.lang.reflect.Method) obj2).invoke(null, objArr55222);
            if (str2 != null) {
            }
            str3 = str;
            int i16222222 = -(-android.graphics.Color.blue(0));
            java.lang.Object[] objArr7322222 = new java.lang.Object[1];
            b("䪶瀷ㄴ鸏縝갲\ue1b4廙̦럢샱絭\uf4af䔹\uf08b䞿댽\ufafe瓊ఛή뗏ᵕ龌", (i16222222 & 23) + (i16222222 | 23), objArr7322222);
            java.lang.Object[] objArr7422222 = {(java.lang.String) objArr7322222[0]};
            obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
            if (obj3 != null) {
            }
            long longValue522222 = ((java.lang.Long) ((java.lang.reflect.Method) obj3).invoke(null, objArr7422222)).longValue();
            long j2422222 = ~longValue522222;
            long j2522222 = (46 * longValue522222) + 46184436954L + (((~(j2422222 | j)) | 1004009499) * (-90)) + (((~(longValue522222 | 1004009499)) | (~(j2422222 | j2))) * (-45)) + (((~(j | 1004009499)) | j2422222 | (~(j2 | (-1004009500)))) * 45) + 286530568;
            int i16322222 = ((int) (j2522222 >> 32)) & ((((33817009 | i10) * 1324) - 818884594) + (((~(42340857 | i)) | (~(1394885553 | i))) * (-1324)) + 432064048);
            int i16422222 = ((int) j2522222) & (((((~(1353392105 | i10)) | 72622080) * 98) - 1761699848) + (((~(83834304 | i10)) | 1353392105 | (~((-83834305) | i))) * (-49)) + (((~(1353392105 | i)) | 11212224) * 49));
            j3 = (i16322222 ^ i16422222) | (i16322222 & i16422222);
            int i16522222 = -android.graphics.Color.rgb(0, 0, 0);
            java.lang.Object[] objArr7622222 = new java.lang.Object[1];
            b("괞贙㮽ł⨙\uecbe̦럢哢츈䪶瀷茞푹ᅇ\uedfa\uf605푼", ((-16777199) & i16522222) + (i16522222 | (-16777199)), objArr7622222);
            java.lang.Object[] objArr7722222 = {(java.lang.String) objArr7622222[0]};
            obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
            if (obj4 == null) {
            }
            long longValue622222 = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr7722222)).longValue();
            long j2622222 = ~longValue622222;
            str5 = str4;
            long j2722222 = (((-317) * longValue622222) - 112529613790L) + (((~(j2 | 352757409)) | j2622222) * (-318)) + (((~(j2622222 | j2)) | (~(j | (-352757410) | longValue622222))) * 318) + (((~(j2622222 | j | (-352757410))) | (~((-352757410) | longValue622222 | j2))) * 318) + 1643297477;
            int i16622222 = ((int) (j2722222 >> 32)) & ((((~((-268453203) | i10)) * 130) - 1317600762) + (((~((-268453203) | i)) | (-2130440192)) * 130));
            int i16722222 = ~((-686231326) | i);
            int i16822222 = ((int) j2722222) & (((((~(753356701 | i10)) | (~((-750995085) | i))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL) - 754642723) + (((~(750995084 | i10)) | i16722222) * (-1040)) + ((i16722222 | (~(686231325 | i10)) | 2361617) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL));
            long j2822222 = (i16622222 ^ i16822222) | (i16622222 & i16822222);
            if (j3 <= 0) {
            }
            int maxKeyCode322222 = android.view.KeyEvent.getMaxKeyCode() >> 16;
            int i16922222 = maxKeyCode322222 * (-244);
            int i17022222 = ((i16922222 | 5658) << 1) - (i16922222 ^ 5658);
            int i17122222 = ~((i10 ^ (-24)) | (i10 & (-24)));
            int i17222222 = ~((maxKeyCode322222 & (-24)) | (maxKeyCode322222 ^ (-24)));
            int i17322222 = -(-(((i17122222 ^ i17222222) | (i17222222 & i17122222)) * (-245)));
            int i17422222 = ~((i & (-24)) | (i ^ (-24)));
            java.lang.Object[] objArr8222222 = new java.lang.Object[1];
            b("䪶瀷ㄴ鸏縝갲\ue1b4廙̦럢샱絭\uf4af䔹\uf08b䞿댽\ufafe瓊ఛή뗏ᵕ龌", ((((i17022222 & i17322222) + (i17322222 | i17022222)) + ((~(i | (-24))) * (-245))) - (~(-(-(((maxKeyCode322222 ^ i17422222) | (maxKeyCode322222 & i17422222)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE))))) - 1, objArr8222222);
            java.lang.Object[] objArr8322222 = {(java.lang.String) objArr8222222[0]};
            obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
            if (obj5 == null) {
            }
            long longValue722222 = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr8322222)).longValue();
            long j2922222 = ~((~longValue722222) | 68359615);
            long j3022222 = ((-107) * longValue722222) + 3759778825L + (((~(j | longValue722222)) | (~((-68359616) | longValue722222))) * (-108)) + (((~(j2 | (-68359616))) | j2922222 | (~(j | 68359615))) * 54) + ((j2922222 | j2) * 54) + 1222180452;
            int i17522222 = ((int) (j3022222 >> 32)) & ((((~(1621155191 | i10)) | (~(1236585693 | i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) + 1502737462 + (((~((-536875299) | i10)) | (~((-152305801) | i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE));
            int i17622222 = ((int) j3022222) & ((((~((-1882855690) | i)) | 445629279) * 56) + 1561536445 + (((~(445629279 | i10)) | (-1882855690)) * 56));
            j4 = (i17522222 ^ i17622222) | (i17522222 & i17622222);
            int i17722222 = -(android.view.ViewConfiguration.getEdgeSlop() >> 16);
            int i17822222 = ~i17722222;
            int i17922222 = ~((i17822222 ^ (-5)) | (i17822222 & (-5)) | i);
            int i18022222 = (i10 ^ i17722222) | (i10 & i17722222);
            int i18122222 = ~((i18022222 ^ 4) | (i18022222 & 4));
            int i18222222 = (i17722222 * (-317)) + 1276 + (((i17922222 ^ i18122222) | (i17922222 & i18122222)) * (-318));
            int i18322222 = ((~((i17722222 ^ (-5)) | (i17722222 & (-5)))) | (~(i17722222 | i))) * (-318);
            int i18422222 = ((i18222222 | i18322222) << 1) - (i18322222 ^ i18222222);
            int i18522222 = ((~(i17822222 | i)) | (-5)) * 318;
            int i18622222 = -(android.view.ViewConfiguration.getJumpTapTimeout() >> 16);
            java.lang.Object[] objArr8522222 = new java.lang.Object[1];
            c((i18422222 & i18522222) + (i18522222 | i18422222), (byte) ((i18622222 ^ 14) + ((i18622222 & 14) << 1)), "\u001c\r\u0001\u0010", objArr8522222);
            java.lang.Object[] objArr8622222 = {(java.lang.String) objArr8522222[0]};
            obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
            if (obj6 == null) {
            }
            long longValue822222 = ((java.lang.Long) ((java.lang.reflect.Method) obj6).invoke(null, objArr8622222)).longValue();
            long j3122222 = longValue822222 | j2;
            long j3222222 = (((-929) * longValue822222) - 181303048192L) + (((~j3122222) | (-390739329)) * (-465)) + (((~(j2 | (-390739329))) | longValue822222) * 930) + (((-390739329) | j3122222) * 465) + 899800739;
            j5 = (((int) (j3222222 >> 32)) & ((((((-1159992595) | i10) * 1444) - 1153123274) + ((((~(207822942 | i)) | (-1298609503)) | (~(1229403468 | i))) * (-1444))) - 3969852)) | (((int) j3222222) & (((((~(746922784 | i10)) | (-765801386)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) - 501357939) + ((~(765801385 | i)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) + (((~(690303625 | i10)) | 75497760 | (~((-18878602) | i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE)));
            if (j4 > 0) {
            }
            java.lang.Object[] objArr9122222 = new java.lang.Object[1];
            c(6 - (~(-android.widget.ExpandableListView.getPackedPositionType(0L))), (byte) (72 - android.text.TextUtils.indexOf(str5, str5, 0, 0)), "\u001a\u0013 \u0013\u0001\u0005㘿", objArr9122222);
            java.lang.String str3722222 = (java.lang.String) objArr9122222[0];
            java.lang.Object[] objArr9222222 = new java.lang.Object[1];
            b("䪶瀷ㄴ鸏ǿ\ue337\uecea콣쨁鑰곑펌", (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 10, objArr9222222);
            java.lang.String str3822222 = (java.lang.String) objArr9222222[0];
            java.lang.Object[] objArr9322222 = new java.lang.Object[1];
            b("䪶瀷ㄴ鸏ǿ\ue337\uecea콣촥爂ꈭ拋", 11 - (~(android.view.ViewConfiguration.getScrollDefaultDelay() >> 16)), objArr9322222);
            java.lang.String str3922222 = (java.lang.String) objArr9322222[0];
            int i18922222 = -(-(android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)));
            int i19022222 = -(-(android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)));
            java.lang.Object[] objArr9422222 = new java.lang.Object[1];
            c(((i18922222 | 11) << 1) - (i18922222 ^ 11), (byte) ((i19022222 ^ 25) + ((i19022222 & 25) << 1)), "\u001a\u0013 \u0013\u0001\u0005\u0013\u001d\u0013\u0004\u000b\u0005", objArr9422222);
            java.lang.String str4022222 = (java.lang.String) objArr9422222[0];
            int i19122222 = -android.view.View.getDefaultSize(0, 0);
            int i19222222 = -android.graphics.Color.red(0);
            java.lang.Object[] objArr9522222 = new java.lang.Object[1];
            c((i19122222 ^ 11) + ((i19122222 & 11) << 1), (byte) ((i19222222 & 60) + (i19222222 | 60)), "\u001f\u0013\u0005\"\u0011\r\r\u001a\u0002\u0000㘰", objArr9522222);
            java.lang.String str4122222 = (java.lang.String) objArr9522222[0];
            java.lang.Object[] objArr9622222 = new java.lang.Object[1];
            c(4 - (~(-android.graphics.Color.green(0))), (byte) (57 - (~(-(-(android.view.ViewConfiguration.getScrollDefaultDelay() >> 16))))), "\u001a\u0013\u0002\u0000㘮", objArr9622222);
            java.lang.String str4222222 = (java.lang.String) objArr9622222[0];
            java.lang.Object[] objArr9722222 = new java.lang.Object[1];
            c(android.view.View.combineMeasuredStates(0, 0) + 4, (byte) (123 - (~(-(-android.view.KeyEvent.normalizeMetaState(0))))), "\u001c\u0001\u0005\f", objArr9722222);
            java.lang.String[] strArr422222 = {str3722222, str3822222, str3922222, str4022222, str4122222, str4222222, (java.lang.String) objArr9722222[0]};
            i3 = 0;
            while (i3 < 7) {
            }
            i4 = 0;
            if (i4 == 0) {
            }
        } catch (java.lang.Throwable th8) {
            java.lang.Throwable cause5 = th8.getCause();
            if (cause5 != null) {
                throw cause5;
            }
            throw th8;
        }
    }

    @Override // com.payair.hce.setOnSystemUiVisibilityChangeListener
    public final void writeReplace(com.payair.hce.communication.JsonResponse jsonResponse) {
        writeReplace(new java.lang.Object[]{this, jsonResponse}, -149956072, 149956072, java.lang.System.identityHashCode(this));
    }

    static void init$1() {
        $$d = new byte[]{64, -23, -58, -30};
        $$e = 152;
    }

    @Override // com.payair.hce.setOnSystemUiVisibilityChangeListener
    public final boolean values() {
        return ((java.lang.Boolean) writeReplace(new java.lang.Object[]{this}, 713463943, -713463942, java.lang.System.identityHashCode(this))).booleanValue();
    }

    static void init$0() {
        $$a = new byte[]{com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, 38, -82, -31, -45, -10, 13, -15, 2, com.google.common.base.Ascii.VT, -21, 13, 32, -46, -1, -8, 17, -4, -19, 6, 5, com.visa.cbp.getEncExpo.onUnminimized, -2, 33, -19, -26, 10, 6, -11, -8, 46, -31, -21, 17, com.google.common.base.Ascii.NAK, -43, 2, -1, -15, 10};
        $$b = 107;
    }

    @Override // com.payair.hce.setOnSystemUiVisibilityChangeListener
    public final void AlternateContactlessPaymentDataJson(com.payair.hce.communication.JsonResponse jsonResponse) {
        writeReplace(new java.lang.Object[]{this, jsonResponse}, 513179294, -513179292, java.lang.System.identityHashCode(this));
    }
}
