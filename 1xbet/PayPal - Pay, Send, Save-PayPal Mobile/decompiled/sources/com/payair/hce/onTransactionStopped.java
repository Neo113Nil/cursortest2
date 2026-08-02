package com.payair.hce;

/* loaded from: classes4.dex */
public abstract class onTransactionStopped {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final byte[] $$j = null;
    private static final int $$k = 0;
    private static int $10;
    private static int $11;
    private static int AlternateContactlessPaymentDataJson;
    private static char DigitizedCardProfile;
    private static int valueOf;
    private static int values;
    private static char[] writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(int i, short s, int i2, java.lang.Object[] objArr) {
        int i3;
        int i4;
        int i5 = s + 4;
        byte[] bArr = $$d;
        int i6 = (i * 2) + 1;
        char[] cArr = new char[i6];
        if (bArr == null) {
            int i7 = i6;
            int i8 = i5;
            i4 = 0;
            int i9 = i8;
            i3 = (i5 + (-i7)) - 2;
            i5 = i9;
            int i10 = i5 + 1;
            cArr[i4] = (char) i3;
            i4++;
            if (i4 == i6) {
                objArr[0] = new java.lang.String(cArr);
                return;
            }
            i7 = bArr[i10];
            int i11 = i3;
            i8 = i10;
            i5 = i11;
            int i92 = i8;
            i3 = (i5 + (-i7)) - 2;
            i5 = i92;
            int i102 = i5 + 1;
            cArr[i4] = (char) i3;
            i4++;
            if (i4 == i6) {
            }
        } else {
            i3 = 718 - i2;
            i4 = 0;
            int i1022 = i5 + 1;
            cArr[i4] = (char) i3;
            i4++;
            if (i4 == i6) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Type inference failed for: r8v2, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void g(byte b, short s, byte b2, java.lang.Object[] objArr) {
        int i;
        int i2;
        ?? r8 = 115 - (b2 * 2);
        int i3 = s + 4;
        byte[] bArr = $$j;
        int i4 = b * 3;
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            byte b3 = r8;
            i = 0;
            int i5 = i3;
            int i6 = i5;
            i2 = i3 + (-b3);
            i3 = i6;
            bArr2[i] = (byte) i2;
            if (i == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i++;
            int i7 = i3 + 1;
            b3 = bArr[i7];
            int i8 = i2;
            i5 = i7;
            i3 = i8;
            int i62 = i5;
            i2 = i3 + (-b3);
            i3 = i62;
            bArr2[i] = (byte) i2;
            if (i == i4) {
            }
        } else {
            i = 0;
            i2 = r8;
            bArr2[i] = (byte) i2;
            if (i == i4) {
            }
        }
    }

    public abstract boolean DigitizedCardProfile() throws com.payair.hce.getAtcCount;

    public void values() {
        int i = valueOf + 55;
        AlternateContactlessPaymentDataJson = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private static void f(int i, boolean z, java.lang.String str, int i2, int i3, java.lang.Object[] objArr) {
        char[] cArr;
        $10 = ($11 + 33) % 128;
        if (str != null) {
            cArr = str.toCharArray();
            $10 = ($11 + 97) % 128;
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.payair.hce.DigitizedCardJson11 digitizedCardJson11 = new com.payair.hce.DigitizedCardJson11();
        char[] cArr3 = new char[i];
        digitizedCardJson11.DigitizedCardProfile = 0;
        while (digitizedCardJson11.DigitizedCardProfile < i) {
            $11 = ($10 + 57) % 128;
            digitizedCardJson11.values = cArr2[digitizedCardJson11.DigitizedCardProfile];
            cArr3[digitizedCardJson11.DigitizedCardProfile] = (char) (i2 + digitizedCardJson11.values);
            int i4 = digitizedCardJson11.DigitizedCardProfile;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr3[i4]), java.lang.Integer.valueOf(values)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(414841307);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionType(0L) + 43, android.graphics.ImageFormat.getBitsPerPixel(0) + 2074, (char) (((android.os.Process.getThreadPriority(0) + 20) >> 6) + 60037));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    g((byte) 0, (short) -1, (byte) 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(414841307, obj);
                }
                cArr3[i4] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 53, 3543 - android.view.Gravity.getAbsoluteGravity(0, 0), (char) android.view.KeyEvent.getDeadChar(0, 0))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
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
        if (i3 > 0) {
            digitizedCardJson11.AlternateContactlessPaymentDataJson = i3;
            char[] cArr4 = new char[i];
            java.lang.System.arraycopy(cArr3, 0, cArr4, 0, i);
            java.lang.System.arraycopy(cArr4, 0, cArr3, i - digitizedCardJson11.AlternateContactlessPaymentDataJson, digitizedCardJson11.AlternateContactlessPaymentDataJson);
            java.lang.System.arraycopy(cArr4, digitizedCardJson11.AlternateContactlessPaymentDataJson, cArr3, 0, i - digitizedCardJson11.AlternateContactlessPaymentDataJson);
        }
        if (z) {
            char[] cArr5 = new char[i];
            digitizedCardJson11.DigitizedCardProfile = 0;
            while (digitizedCardJson11.DigitizedCardProfile < i) {
                cArr5[digitizedCardJson11.DigitizedCardProfile] = cArr3[(i - digitizedCardJson11.DigitizedCardProfile) - 1];
                java.lang.Object[] objArr5 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTapTimeout() >> 16) + 53, (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3543, (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
            }
            cArr3 = cArr5;
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0187, code lost:
    
        if (r2.valueOf == r2.writeReplace) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01b5, code lost:
    
        r8 = new java.lang.Object[]{r2, r2, java.lang.Integer.valueOf(r4), r2, r2, java.lang.Integer.valueOf(r4), r2, r2, java.lang.Integer.valueOf(r4), r2, r2, java.lang.Integer.valueOf(r4), r2};
        r5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1553139325);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0203, code lost:
    
        if (r5 != null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0205, code lost:
    
        r5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), 3596 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0))).getMethod(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1553139325, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0281, code lost:
    
        if (((java.lang.Integer) ((java.lang.reflect.Method) r5).invoke(null, r8)).intValue() != r2.SdkCoreAlternateContactlessPaymentDataImpl) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0285, code lost:
    
        r8 = new java.lang.Object[]{r2, r2, java.lang.Integer.valueOf(r4), java.lang.Integer.valueOf(r4), r2, r2, java.lang.Integer.valueOf(r4), java.lang.Integer.valueOf(r4), r2, java.lang.Integer.valueOf(r4), r2};
        r5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(737480198);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x02c1, code lost:
    
        if (r5 != null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x02c3, code lost:
    
        r5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), 2664 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (18889 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8)));
        r10 = new java.lang.Object[1];
        r14 = 65535;
        g((byte) 0, -1, com.google.common.base.Ascii.NAK, r10);
        r5 = r5.getMethod((java.lang.String) r10[0], java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(737480198, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0336, code lost:
    
        r5 = ((java.lang.Integer) ((java.lang.reflect.Method) r5).invoke(null, r8)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0343, code lost:
    
        r8 = r2.AlternateContactlessPaymentDataJson;
        r13 = r2.SdkCoreAlternateContactlessPaymentDataImpl;
        r6[r2.values] = r3[r5];
        r6[r2.values + 1] = r3[(r8 * r4) + r13];
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x03a8, code lost:
    
        r2.values += 2;
        r5 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0335, code lost:
    
        r14 = 65535;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0357, code lost:
    
        r14 = 65535;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x035d, code lost:
    
        if (r2.DigitizedCardProfile != r2.AlternateContactlessPaymentDataJson) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x035f, code lost:
    
        com.payair.hce.onTransactionStopped.$10 = (com.payair.hce.onTransactionStopped.$11 + 63) % 128;
        r2.RecordsJson = ((r2.RecordsJson + r4) - 1) % r4;
        r2.SdkCoreAlternateContactlessPaymentDataImpl = ((r2.SdkCoreAlternateContactlessPaymentDataImpl + r4) - 1) % r4;
        r5 = r2.DigitizedCardProfile;
        r8 = r2.RecordsJson;
        r13 = r2.AlternateContactlessPaymentDataJson;
        r15 = r2.SdkCoreAlternateContactlessPaymentDataImpl;
        r6[r2.values] = r3[(r5 * r4) + r8];
        r6[r2.values + 1] = r3[(r13 * r4) + r15];
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x038f, code lost:
    
        r5 = r2.DigitizedCardProfile;
        r8 = r2.SdkCoreAlternateContactlessPaymentDataImpl;
        r10 = r2.AlternateContactlessPaymentDataJson;
        r13 = r2.RecordsJson;
        r6[r2.values] = r3[(r5 * r4) + r8];
        r6[r2.values + 1] = r3[(r10 * r4) + r13];
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x019d, code lost:
    
        r6[r2.values] = (char) (r2.valueOf - r29);
        r6[r2.values + 1] = (char) (r2.writeReplace - r29);
        r14 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x019b, code lost:
    
        if (r2.valueOf == r2.writeReplace) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void e(java.lang.String str, int i, byte b, java.lang.Object[] objArr) {
        int i2;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.DigitizedCardJson12 digitizedCardJson12 = new com.payair.hce.DigitizedCardJson12();
        char[] cArr = writeReplace;
        char c = 65535;
        char c2 = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
        int i3 = 2;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                int i5 = $10 + 105;
                $11 = i5 % 128;
                if (i5 % i3 == 0) {
                    try {
                        java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i4])};
                        java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
                        if (obj == null) {
                            java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.AndroidCharacter.getMirror(c2) + 1, (android.os.Process.myTid() >> 22) + 2508, (char) (android.text.TextUtils.indexOf("", "") + 6802));
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            g((byte) 0, (short) -1, com.google.common.base.Ascii.EM, objArr3);
                            obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj);
                        }
                        cArr2[i4] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr[i4])};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), android.text.TextUtils.indexOf("", "", 0) + 2508, (char) (6802 - android.view.View.resolveSizeAndState(0, 0, 0)));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        g((byte) 0, (short) -1, com.google.common.base.Ascii.EM, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj2);
                    }
                    cArr2[i4] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                    i4++;
                }
                c2 = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
                i3 = 2;
            }
            cArr = cArr2;
        }
        java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(DigitizedCardProfile)};
        java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
        if (obj3 == null) {
            java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 50, android.graphics.Color.red(0) + 2508, (char) (android.text.TextUtils.getOffsetBefore("", 0) + 6802));
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            g((byte) 0, (short) -1, com.google.common.base.Ascii.EM, objArr7);
            obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj3);
        }
        char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).charValue();
        char[] cArr3 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr3[i2] = (char) (charArray[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            digitizedCardJson12.values = 0;
            while (digitizedCardJson12.values < i2) {
                int i6 = $10 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                $11 = i6 % 128;
                if (i6 % 2 == 0) {
                    digitizedCardJson12.valueOf = charArray[digitizedCardJson12.values];
                    digitizedCardJson12.writeReplace = charArray[digitizedCardJson12.values];
                } else {
                    digitizedCardJson12.valueOf = charArray[digitizedCardJson12.values];
                    digitizedCardJson12.writeReplace = charArray[digitizedCardJson12.values + 1];
                }
            }
        }
        int i7 = 0;
        while (i7 < i) {
            int i8 = $10 + 45;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                cArr3[i7] = (char) (cArr3[i7] ^ 18991);
                i7 += 18;
            } else {
                cArr3[i7] = (char) (cArr3[i7] ^ 13722);
                i7++;
            }
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        valueOf = 0;
        AlternateContactlessPaymentDataJson = 1;
        writeReplace = new char[]{12327, 12322, 12347, 12326, 12334, 12389, 12391, 12331, 12325, 12332, 12345, 12330, 12335, 12411, 12412, 12388, 12350, 12323, 12351, 12328, 12329, 12333, 12346, 12344, 12349, 12336, 12339, 13264, 12409, 12338, 12324, 12318, 12309, 12348, 12320, 13265};
        DigitizedCardProfile = (char) 1494;
        values = 1889207286;
    }

    static void init$1() {
        $$j = new byte[]{com.google.common.base.Ascii.RS, 5, -83, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE};
        $$k = 11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:154:0x156a, code lost:
    
        if (((((int) r6) & (((((~(1778351541 | r13)) * 52) + 1089976569) + (((~(1239379364 | r13)) | ((~((-1618361522) | r13)) | 538972177)) * (-52))) + (((~((-1239379365) | r13)) | 159990020) * 52))) | (((int) (r6 >> 32)) & ((((((~((-1300668978) | r61)) | 134390321) * 104) - 2005432166) + ((~(1302836089 | r13)) * (-104))) + ((136557433 | r61) * 104)))) == 477111747) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x22c5, code lost:
    
        if (((((int) (r6 >> 32)) & ((((((-361859863) | r61) * 140) - 1852219298) + (((~((-361859863) | r13)) | 17924096) * (-280))) + ((((~(1799086273 | r13)) | (-2143022040)) | (~((-17924097) | r61))) * 140))) | (((int) r6) & ((((((~(239982493 | r61)) | (-1331560350)) * 1504) + 1320243365) + ((~((-1091577857) | r61)) * (-1504))) - 1545463312))) == 0) goto L286;
     */
    /* JADX WARN: Code restructure failed: missing block: B:509:0x2d9a, code lost:
    
        if (r9 == null) goto L376;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x06ca, code lost:
    
        if (((((int) r2) & (((((~((-930935490) | r13)) | (-1926805397)) * (-983)) + 10042726) + (((~((-1926805397) | r13)) | 1082131732) * 983))) | (((int) (r2 >> 32)) & (((((~((-1194022609) | r61)) | (-1663718277)) * 56) - 416969606) + (((~((-1663718277) | r13)) | (-1194022609)) * 56)))) != 477111747) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:582:0x0ae5, code lost:
    
        if (r6.equals(((java.lang.String) r12[0]).intern()) != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x07e2, code lost:
    
        if (((((int) r2) & ((((((~(1406208052 | r13)) | 542017) | (~((-31018358) | r13))) * (-397)) - 2141869483) + ((1376273729 | r61) * 397))) | (((int) (r2 >> 32)) & ((((((~(1264592403 | r13)) | 345342016) * 98) + 58366128) + ((((~(1593148481 | r13)) | 1264592403) | (~((-1593148482) | r61))) * (-49))) + (((~(1264592403 | r61)) | 1247806465) * 49)))) != (-1032769152)) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0908, code lost:
    
        if (((((int) r2) & ((((((~((-1154949735) | r61)) | (-1711253488)) * (-502)) - 1575710801) + ((~((-8462337) | r13)) * (-502))) + (((~((-1702791152) | r61)) | (-1154949735)) * 502))) | (((int) (r2 >> 32)) & ((((((~(1795854457 | r13)) | (~(1061886427 | r13))) * (-867)) + 1972008040) + ((((~(1795854457 | r61)) | (-2135661052)) | (~(1061886427 | r61))) * (-1734))) + ((((~(2135661051 | r13)) | (~((-339806595) | r61))) | (~((-1073774625) | r61))) * 867)))) == 542074309) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x1572  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x16d6  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x2444  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x2514  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.Object[] AlternateContactlessPaymentDataJson$4956fc2a(int i, java.lang.Object obj) {
        java.lang.String str;
        int i2;
        int i3;
        int i4;
        java.lang.Throwable th;
        java.io.BufferedInputStream bufferedInputStream;
        java.io.BufferedInputStream bufferedInputStream2;
        long j;
        java.lang.Object invoke;
        int parseInt;
        java.lang.String[] strArr;
        int i5;
        int i6;
        int i7;
        java.lang.Object obj2;
        try {
            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1566620024);
            if (obj3 == null) {
                java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 27, (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1838, (char) android.view.KeyEvent.getDeadChar(0, 0));
                byte b = $$d[14];
                byte b2 = (byte) (b + 1);
                byte b3 = b;
                java.lang.Object[] objArr = new java.lang.Object[1];
                d(b2, b3, (short) (b3 + 1), objArr);
                obj3 = cls.getMethod((java.lang.String) objArr[0], null);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1566620024, obj3);
            }
            long longValue = ((java.lang.Long) ((java.lang.reflect.Method) obj3).invoke(null, null)).longValue();
            long j2 = ~((~longValue) | (-834233420));
            long j3 = i;
            long j4 = ~(j3 | (-834233420));
            long j5 = (((-657) * longValue) - 549759823780L) + (((~(longValue | 834233419)) | j2 | j4) * (-658)) + (658 * j2) + ((j4 | j2) * 658) + 1674312365;
            int i8 = ~i;
            if (((((((r14 | 273940480) * (-712)) - 737176038) + (((~(i8 | (-273940481))) | (~(i | (-176177290)))) * (-712)) + (((-1887344181) | (~((-450117770) | i8))) * 712)) & ((int) (j5 >> 32))) | (((int) j5) & (((1449917050 | i8) * 1444) + 1153123995 + (((~((-1452223639) | i)) | 1443571730 | (~(14997228 | i))) * (-1444)) + 1131909402))) != 0) {
                java.lang.Object[] objArr2 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_BRUSHSTROKE_VALUE}, null, new int[1]};
                int i9 = ~(304663993 | i);
                java.lang.Object[] objArr3 = {-579990794, 16, java.lang.Integer.valueOf((((~((-1013989514) | i8)) | i9) * 1150) + 869045214 + ((i9 | (~((-304663994) | i8))) * (-575)) + (((~(i | (-1013989514))) | (~(1013989513 | i8))) * 575))};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                if (obj4 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), 2713 - android.text.TextUtils.indexOf("", ""), (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                    byte[] bArr = $$d;
                    byte b4 = bArr[16];
                    byte b5 = bArr[14];
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    d(b4, b5, (short) (b5 & 653), objArr4);
                    obj4 = cls2.getMethod((java.lang.String) objArr4[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj4);
                }
                ((int[]) objArr2[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr3)).intValue();
                return objArr2;
            }
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            e("\u0014\u000b\r\u0003\u000b\u0013\u0000\u001c\u000b\u0013㙕", 11 - android.text.TextUtils.getOffsetAfter("", 0), (byte) (86 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0)), objArr5);
            java.lang.Object[] objArr6 = {((java.lang.String) objArr5[0]).intern()};
            java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
            if (obj5 == null) {
                java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.view.ViewConfiguration.getTouchSlop() >> 8), (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1920, (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                byte b6 = $$d[14];
                byte b7 = (byte) (b6 + 1);
                byte b8 = b6;
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                d(b7, b8, (short) (b8 + 1), objArr7);
                obj5 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.String.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj5);
            }
            java.lang.Object invoke2 = ((java.lang.reflect.Method) obj5).invoke(null, objArr6);
            if (invoke2 != null) {
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                f(android.text.TextUtils.indexOf("", "") + 6, false, "\ufff9\ufffe\u000b\b\ufff7\u0004", 256 - android.widget.ExpandableListView.getPackedPositionChild(0L), android.view.KeyEvent.keyCodeFromString("") + 3, objArr8);
                java.lang.String intern = ((java.lang.String) objArr8[0]).intern();
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                f(8 - android.view.View.MeasureSpec.getSize(0), false, "\ufffe�\u0005\u0002\ufffa￼\uffff\t", android.view.KeyEvent.getDeadChar(0, 0) + 257, (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1, objArr9);
                java.lang.Object[] objArr10 = {invoke2, new java.lang.String[]{intern, ((java.lang.String) objArr9[0]).intern()}};
                java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1831766780);
                if (obj6 == null) {
                    java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 43, (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2879, (char) (android.os.Process.myTid() >> 22));
                    byte b9 = $$d[14];
                    byte b10 = (byte) (b9 + 1);
                    byte b11 = b9;
                    java.lang.Object[] objArr11 = new java.lang.Object[1];
                    d(b10, b11, (short) (b11 + 1), objArr11);
                    obj6 = cls4.getMethod((java.lang.String) objArr11[0], java.lang.String.class, java.lang.String[].class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1831766780, obj6);
                }
                long longValue2 = ((java.lang.Long) ((java.lang.reflect.Method) obj6).invoke(null, objArr10)).longValue();
                long j6 = ~(1126005082 | longValue2);
                long j7 = ~longValue2;
                long j8 = ~j3;
                java.lang.String str2 = "";
                long j9 = (((((989 * longValue2) + 2223860038925L) + ((j3 | j6) * 988)) + (((~(j7 | (-1126005083))) | (~(j8 | (-1126005083)))) * (-1976))) + ((((~(j7 | j3)) | j6) | (~(longValue2 | j8))) * 988)) - 902706696;
                if (((((int) j9) & ((((~(1135201490 | i)) | 33589458) * (-502)) + 1214929955 + ((~((-268435462) | i8)) * (-502)) + (((~(302024919 | i)) | 1135201490) * 502))) | (((int) (j9 >> 32)) & ((((135532818 | i8) * (-192)) - 1788177110) + (((~(1226063283 | i8)) | (-1767210420)) * (-384)) + (((~(1767210419 | i)) | (~((-541147137) | i8)) | (~((-1090530466) | i))) * 192)))) != 0) {
                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                    f(23 - android.graphics.Color.green(0), true, "�\b\u000b\tￇ\b\u000b\u000b\ufffe\u000b\u000e\r￼\ufffa\uffff\u000e\u0007\ufffa\u0006ￇ\r￼\u000e", android.text.TextUtils.indexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 255, android.text.TextUtils.lastIndexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 8, objArr12);
                    java.lang.Object[] objArr13 = {((java.lang.String) objArr12[0]).intern()};
                    java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                    if (obj7 == null) {
                        java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.green(0) + 40, 1921 - android.view.KeyEvent.getDeadChar(0, 0), (char) (1 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))));
                        byte b12 = $$d[14];
                        byte b13 = (byte) (b12 + 1);
                        byte b14 = b12;
                        java.lang.Object[] objArr14 = new java.lang.Object[1];
                        d(b13, b14, (short) (b14 + 1), objArr14);
                        obj7 = cls5.getMethod((java.lang.String) objArr14[0], java.lang.String.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj7);
                    }
                    java.lang.Object invoke3 = ((java.lang.reflect.Method) obj7).invoke(null, objArr13);
                    java.lang.Object[] objArr15 = new java.lang.Object[1];
                    f(30 - android.view.View.getDefaultSize(0, 0), true, "\u0006\ufffe\r\f\u0012\fￇ\r￼\u000e�\b\u000b\tￇ\b\u000b\u000b\ufffe\u000b\u000e\r￼\ufffa\uffff\u000e\u0007\ufffa\u0006ￇ", (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 17, objArr15);
                    java.lang.Object[] objArr16 = {((java.lang.String) objArr15[0]).intern()};
                    java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                    if (obj8 == null) {
                        java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.getMode(0) + 40, android.view.MotionEvent.axisFromString(str2) + 1922, (char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 1));
                        byte b15 = $$d[14];
                        byte b16 = (byte) (b15 + 1);
                        byte b17 = b15;
                        java.lang.Object[] objArr17 = new java.lang.Object[1];
                        d(b16, b17, (short) (b17 + 1), objArr17);
                        obj8 = cls6.getMethod((java.lang.String) objArr17[0], java.lang.String.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj8);
                    }
                    java.lang.Object invoke4 = ((java.lang.reflect.Method) obj8).invoke(null, objArr16);
                    if (invoke3 != null) {
                        java.lang.Object[] objArr18 = {invoke3, 42};
                        java.lang.Object obj9 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                        if (obj9 == null) {
                            java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 28, 2594 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (char) android.text.TextUtils.indexOf(str2, str2, 0));
                            byte b18 = $$d[14];
                            byte b19 = (byte) (b18 + 1);
                            byte b20 = b18;
                            obj2 = invoke3;
                            java.lang.Object[] objArr19 = new java.lang.Object[1];
                            d(b19, b20, (short) (b20 + 1), objArr19);
                            obj9 = cls7.getMethod((java.lang.String) objArr19[0], java.lang.String.class, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj9);
                        } else {
                            obj2 = invoke3;
                        }
                        long longValue3 = ((java.lang.Long) ((java.lang.reflect.Method) obj9).invoke(null, objArr18)).longValue();
                        long j10 = ~longValue3;
                        long j11 = ~(j10 | 209397149 | j3);
                        long j12 = ((-475) * longValue3) + 99882440073L + (((~(longValue3 | (-209397150))) | j11) * (-476)) + (j11 * 952) + ((~(j10 | j8 | 209397149)) * 476) + 1047703375;
                        int i10 = ~(299210187 | i);
                        if (((((int) j12) & (((((~(299210187 | i8)) | 1107307028) * (-245)) - 2088178044) + (i10 * (-245)) + ((i10 | (-1138016223)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE))) | (((int) (j12 >> 32)) & (((((-1519167712) | i) * 140) - 1114227166) + (((~((-1519167712) | i8)) | 268740746) * (-280)) + (((~((-1338573174) | i8)) | 88146208 | (~((-268740747) | i))) * 140)))) != 477111747) {
                        }
                        str2 = str2;
                        if (android.os.Build.VERSION.SDK_INT > 33) {
                            str = str2;
                            java.lang.Object[] objArr20 = new java.lang.Object[1];
                            f(android.text.TextUtils.getOffsetAfter(str, 0) + 28, true, "\r\u000e\u000e\uffd1\u0016\u000b\u0010\u000b\uffd1\u0005\u0016\u0007\uffd1\u0005\u0014\uffd0\u0007\u000e\u0004\u0003\t\t\u0017\u0004\u0007\u0006ￏ\u0006", 244 - android.view.MotionEvent.axisFromString(str), 13 - android.view.View.resolveSize(0, 0), objArr20);
                            java.lang.Object[] objArr21 = {((java.lang.String) objArr20[0]).intern()};
                            java.lang.Object obj10 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1161224381);
                            if (obj10 == null) {
                                java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 35, ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, (char) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 33098));
                                byte b21 = $$d[14];
                                byte b22 = (byte) (b21 + 1);
                                byte b23 = b21;
                                java.lang.Object[] objArr22 = new java.lang.Object[1];
                                d(b22, b23, (short) (b23 + 1), objArr22);
                                obj10 = cls8.getMethod((java.lang.String) objArr22[0], java.lang.String.class);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1161224381, obj10);
                            }
                            long longValue4 = ((java.lang.Long) ((java.lang.reflect.Method) obj10).invoke(null, objArr21)).longValue();
                            long j13 = (((((565 * longValue4) - 31674936807L) + ((((~((~longValue4) | j8)) | (-56260990)) | (~(longValue4 | j3))) * (-564))) + ((~(((-56260990) | longValue4) | j3)) * 1128)) + (((~(longValue4 | 56260989)) | (~(j8 | (-56260990)))) * 564)) - 1393929097;
                            if (((((int) (j13 >> 32)) & ((((405833299 | i8) * 1324) - 818884594) + (((~(1030803287 | i)) | (~(406423123 | i))) * (-1324)) + 1803735128)) | (((int) j13) & (((~((-268764162) | i8)) * (-783)) + 1082194059 + (((~(1839748076 | i8)) | (-1017992810)) * 783)))) == 1) {
                                AlternateContactlessPaymentDataJson = (valueOf + 85) % 128;
                                AlternateContactlessPaymentDataJson = (valueOf + 85) % 128;
                                java.lang.Object[] objArr23 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE}, null, new int[1]};
                                java.lang.Object[] objArr24 = {-579990794, 16, java.lang.Integer.valueOf(((((~((-387924887) | i8)) | 319292176) * 446) - 2117243347) + (((~(i | (-68632711))) | 2108457) * 446) + 670389728)};
                                java.lang.Object obj11 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                if (obj11 == null) {
                                    java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 2713, (char) android.view.View.getDefaultSize(0, 0));
                                    byte[] bArr2 = $$d;
                                    byte b24 = bArr2[16];
                                    byte b25 = bArr2[14];
                                    java.lang.Object[] objArr25 = new java.lang.Object[1];
                                    d(b24, b25, (short) (b25 & 653), objArr25);
                                    obj11 = cls9.getMethod((java.lang.String) objArr25[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj11);
                                }
                                ((int[]) objArr23[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj11).invoke(null, objArr24)).intValue();
                                return objArr23;
                            }
                        } else {
                            str = str2;
                            java.lang.Object[] objArr26 = new java.lang.Object[1];
                            f(12 - android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), true, "\u0002\t\uffff\ufffe\u0004\u0004\u0012\uffff\u0002\u0001ￋ\f\u000f", (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 250, 12 - android.os.Process.getGidForName(str), objArr26);
                            java.lang.Object[] objArr27 = {((java.lang.String) objArr26[0]).intern()};
                            java.lang.Object obj12 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                            if (obj12 == null) {
                                java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.getSize(0) + 40, android.widget.ExpandableListView.getPackedPositionType(0L) + 1921, (char) android.text.TextUtils.indexOf(str, str, 0, 0));
                                byte b26 = $$d[14];
                                byte b27 = (byte) (b26 + 1);
                                byte b28 = b26;
                                java.lang.Object[] objArr28 = new java.lang.Object[1];
                                d(b27, b28, (short) (b28 + 1), objArr28);
                                obj12 = cls10.getMethod((java.lang.String) objArr28[0], java.lang.String.class);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj12);
                            }
                            java.lang.Object invoke5 = ((java.lang.reflect.Method) obj12).invoke(null, objArr27);
                            java.lang.Object[] objArr29 = new java.lang.Object[1];
                            e("㘄", android.text.TextUtils.indexOf(str, str, 0, 0) + 1, (byte) (90 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), objArr29);
                        }
                    } else {
                        obj2 = invoke3;
                    }
                    if (invoke4 != null) {
                        java.lang.Object[] objArr30 = {invoke4, 42};
                        java.lang.Object obj13 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                        if (obj13 == null) {
                            java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.ImageFormat.getBitsPerPixel(0) + 29, 2594 - android.text.TextUtils.indexOf(str2, str2, 0), (char) android.view.KeyEvent.keyCodeFromString(str2));
                            byte b29 = $$d[14];
                            byte b30 = (byte) (b29 + 1);
                            byte b31 = b29;
                            java.lang.Object[] objArr31 = new java.lang.Object[1];
                            d(b30, b31, (short) (b31 + 1), objArr31);
                            obj13 = cls11.getMethod((java.lang.String) objArr31[0], java.lang.String.class, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj13);
                        }
                        long longValue5 = ((java.lang.Long) ((java.lang.reflect.Method) obj13).invoke(null, objArr30)).longValue();
                        long j14 = ~longValue5;
                        long j15 = (302 * longValue5) + 253444329000L + ((~(longValue5 | (-844814430) | j3)) * (-301)) + (((~(j8 | (-844814430))) | (~(j14 | j3))) * (-301)) + (((~(844814429 | j3)) | j14) * 301) + 2101914954;
                    }
                    if (obj2 != null) {
                        java.lang.Object[] objArr32 = {obj2, 42};
                        java.lang.Object obj14 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                        if (obj14 == null) {
                            java.lang.Class cls12 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - android.view.View.combineMeasuredStates(0, 0), android.os.Process.getGidForName(str2) + 2595, (char) (android.view.KeyEvent.getMaxKeyCode() >> 16));
                            byte b32 = $$d[14];
                            byte b33 = (byte) (b32 + 1);
                            byte b34 = b32;
                            java.lang.Object[] objArr33 = new java.lang.Object[1];
                            d(b33, b34, (short) (b34 + 1), objArr33);
                            obj14 = cls12.getMethod((java.lang.String) objArr33[0], java.lang.String.class, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj14);
                        }
                        long longValue6 = ((java.lang.Long) ((java.lang.reflect.Method) obj14).invoke(null, objArr32)).longValue();
                        long j16 = ~longValue6;
                        long j17 = ((-675) * longValue6) + 237356455906L + ((j3 | 350600378 | j16) * (-676)) + (((~(j16 | 350600378)) | (~(j8 | 350600378))) * 676) + (((~((-350600379) | j16)) | (~(j16 | j8)) | (~(longValue6 | 350600378 | j3))) * 676) + 906500146;
                    }
                    if (invoke4 != null) {
                        java.lang.Object[] objArr34 = {invoke4, 42};
                        java.lang.Object obj15 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                        if (obj15 == null) {
                            java.lang.Class cls13 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.red(0) + 28, android.graphics.Color.rgb(0, 0, 0) + 16779810, (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                            byte b35 = $$d[14];
                            byte b36 = (byte) (b35 + 1);
                            byte b37 = b35;
                            java.lang.Object[] objArr35 = new java.lang.Object[1];
                            d(b36, b37, (short) (b37 + 1), objArr35);
                            obj15 = cls13.getMethod((java.lang.String) objArr35[0], java.lang.String.class, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj15);
                        }
                        long longValue7 = ((java.lang.Long) ((java.lang.reflect.Method) obj15).invoke(null, objArr34)).longValue();
                        long j18 = ~longValue7;
                        str2 = str2;
                        long j19 = ((-209) * longValue7) + 72690939651L + ((~(j18 | 347803538)) * 210) + (((~(j18 | j8)) | (~(j3 | 347803538))) * 210) + (((~(j18 | (-347803539) | j3)) | (~(347803538 | j8 | longValue7))) * 210) + 1604904063;
                    } else {
                        str = str2;
                    }
                }
                str = str2;
            } else {
                str = "";
            }
            java.lang.Object[] objArr36 = new java.lang.Object[1];
            f((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 8, true, "\ufffa￼\ufff9\u000b\u0011�\u0003\ufff7", 255 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 2, objArr36);
            java.lang.String intern2 = ((java.lang.String) objArr36[0]).intern();
            java.lang.Object[] objArr37 = new java.lang.Object[1];
            f(6 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), true, "\u0004\uffff\u0006\b\ufff7�", 257 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), 5 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), objArr37);
            java.lang.String intern3 = ((java.lang.String) objArr37[0]).intern();
            java.lang.Object[] objArr38 = new java.lang.Object[1];
            e("\u0005\u0001\u0016\u0006\u0011\u0012㘕", android.graphics.Color.blue(0) + 7, (byte) ((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 23), objArr38);
            java.lang.String intern4 = ((java.lang.String) objArr38[0]).intern();
            java.lang.Object[] objArr39 = new java.lang.Object[1];
            f(android.text.TextUtils.indexOf(str, str) + 9, true, "\ufffa\u000b\u0007\ufffa\b\ufff7\ufff9￼\u0007", 258 - android.text.TextUtils.indexOf(str, str), android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 8, objArr39);
            java.lang.String intern5 = ((java.lang.String) objArr39[0]).intern();
            java.lang.Object[] objArr40 = new java.lang.Object[1];
            f(5 - android.os.Process.getGidForName(str), true, "\ufffb\u0004￼\u0001\u0001\u0004", android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 256, 4 - (android.view.ViewConfiguration.getTouchSlop() >> 8), objArr40);
            java.lang.String intern6 = ((java.lang.String) objArr40[0]).intern();
            java.lang.Object[] objArr41 = new java.lang.Object[1];
            e("\f#\f\u0011\n\u0000\r\u0012\u0013\u0016\u0011\u0015㘺", 13 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (byte) (65 - android.text.TextUtils.getCapsMode(str, 0, 0)), objArr41);
            java.lang.String intern7 = ((java.lang.String) objArr41[0]).intern();
            java.lang.Object[] objArr42 = new java.lang.Object[1];
            f((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 6, true, "\ufffa\u0001\u0000\u0005\u0000", 262 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), -android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr42);
            java.lang.String intern8 = ((java.lang.String) objArr42[0]).intern();
            java.lang.Object[] objArr43 = new java.lang.Object[1];
            f(6 - android.graphics.Color.green(0), false, "\u0004\u0011\u0005ￒ\b\u000f", 248 - android.view.KeyEvent.getDeadChar(0, 0), android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 5, objArr43);
            java.lang.String intern9 = ((java.lang.String) objArr43[0]).intern();
            java.lang.Object[] objArr44 = new java.lang.Object[1];
            f(3 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), true, "\u0007\ufff9", 262 - android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 2 - android.view.View.resolveSize(0, 0), objArr44);
            java.lang.String intern10 = ((java.lang.String) objArr44[0]).intern();
            java.lang.Object[] objArr45 = new java.lang.Object[1];
            e("\u0002\t\u0016\u0017\u0011\u0012\u000b\u0010\u0010\u0016\u0010\t\r\n\u0016\u0011", 17 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (byte) (61 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), objArr45);
            java.lang.String intern11 = ((java.lang.String) objArr45[0]).intern();
            java.lang.Object[] objArr46 = new java.lang.Object[1];
            e("\u0002\t\u0016\u000f\t\u0013\u0003\u0010\u0012\u0015", 10 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (byte) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 59), objArr46);
            java.lang.String intern12 = ((java.lang.String) objArr46[0]).intern();
            java.lang.Object[] objArr47 = new java.lang.Object[1];
            f(9 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), true, "\u0002\ufff5\u0006\ufff7\u0003\u0006\u0004\uffff", 259 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), 7 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), objArr47);
            java.lang.String intern13 = ((java.lang.String) objArr47[0]).intern();
            java.lang.Object[] objArr48 = new java.lang.Object[1];
            f(android.text.TextUtils.indexOf(str, str) + 12, true, "\ufff9\ufffb\u0002\u0002\u0005\ufff9￼\u0005\b\u0006\ufffa\n", 258 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 11 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr48);
            java.lang.String intern14 = ((java.lang.String) objArr48[0]).intern();
            java.lang.Object[] objArr49 = new java.lang.Object[1];
            e("\u0017\u0012\t\n\u001a\u000e㘶㘶\u000e\u0012\u000e\u0016\u000f\u0004", android.text.TextUtils.indexOf(str, str, 0) + 14, (byte) (64 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16)), objArr49);
            java.lang.String intern15 = ((java.lang.String) objArr49[0]).intern();
            java.lang.Object[] objArr50 = new java.lang.Object[1];
            e("\u0012\u0011\u0002\u0006\u0018\u0000㗮", android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 8, (byte) (android.os.Process.getGidForName(str) + 1), objArr50);
            java.lang.String intern16 = ((java.lang.String) objArr50[0]).intern();
            java.lang.Object[] objArr51 = new java.lang.Object[1];
            e("\u0007\u0004\u0006\u001a\u0001\u0006㙋", 7 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (byte) (97 - (android.view.ViewConfiguration.getTapTimeout() >> 16)), objArr51);
            java.lang.String intern17 = ((java.lang.String) objArr51[0]).intern();
            java.lang.Object[] objArr52 = new java.lang.Object[1];
            e("\b\u0004\u0005\u000f\u0011\r㘒", android.view.MotionEvent.axisFromString(str) + 8, (byte) ((android.view.KeyEvent.getMaxKeyCode() >> 16) + 105), objArr52);
            java.lang.String intern18 = ((java.lang.String) objArr52[0]).intern();
            java.lang.Object[] objArr53 = new java.lang.Object[1];
            e("㘢㘢", android.view.View.resolveSize(0, 0) + 2, (byte) ('i' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), objArr53);
            java.lang.String intern19 = ((java.lang.String) objArr53[0]).intern();
            java.lang.Object[] objArr54 = new java.lang.Object[1];
            f(20 - (android.view.KeyEvent.getMaxKeyCode() >> 16), false, "\u0000\ufff6￼\ufffa\u0003\t\b\t\ufff6\u0007\t\ufff4\f\ufffe\t�\ufff4\u0001\u0004\ufff8", android.graphics.Color.blue(0) + 258, 5 - android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr54);
            java.lang.String intern20 = ((java.lang.String) objArr54[0]).intern();
            java.lang.Object[] objArr55 = new java.lang.Object[1];
            e("\u0010\u0016\u0013\u000b\u0012\u000e", 5 - android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (byte) (4 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), objArr55);
            java.lang.String intern21 = ((java.lang.String) objArr55[0]).intern();
            java.lang.Object[] objArr56 = new java.lang.Object[1];
            f(2 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), false, "\uffff\u0001", 267 - android.graphics.Color.red(0), android.widget.ExpandableListView.getPackedPositionType(0L) + 2, objArr56);
            java.lang.String intern22 = ((java.lang.String) objArr56[0]).intern();
            java.lang.Object[] objArr57 = new java.lang.Object[1];
            e("\u000b\b#\f\u0011\f\u0018\r\u0012\u000b\u0010\u0016\n\r\u0016\u0006", (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 16, (byte) (1 - android.widget.ExpandableListView.getPackedPositionType(0L)), objArr57);
            java.lang.String intern23 = ((java.lang.String) objArr57[0]).intern();
            java.lang.Object[] objArr58 = new java.lang.Object[1];
            f(8 - android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), false, "\ufffe\n\b\ufff7\ufff9\ufffb\u0006\ufff7\n", 257 - (android.view.ViewConfiguration.getTapTimeout() >> 16), 1 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), objArr58);
            java.lang.String intern24 = ((java.lang.String) objArr58[0]).intern();
            java.lang.Object[] objArr59 = new java.lang.Object[1];
            f(10 - android.view.View.MeasureSpec.getMode(0), false, "\r￼\ufffe\u0000\u000b￼\u000f\u0003\uffd1\u000f", android.view.View.MeasureSpec.getSize(0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, 9 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), objArr59);
            java.lang.String intern25 = ((java.lang.String) objArr59[0]).intern();
            java.lang.Object[] objArr60 = new java.lang.Object[1];
            e("\u0011\u0016\b\u0013\u0011\u0012\u0006\u0014\u0011\r㘙", 12 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (byte) ((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 109), objArr60);
            java.lang.String intern26 = ((java.lang.String) objArr60[0]).intern();
            java.lang.Object[] objArr61 = new java.lang.Object[1];
            e("\u0018\u0000\u001d\f\"\u0000#\u000e!\u0006㙜", (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 10, (byte) (104 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))), objArr61);
            java.lang.String intern27 = ((java.lang.String) objArr61[0]).intern();
            java.lang.Object[] objArr62 = new java.lang.Object[1];
            e("\u0018\u0000\u001d\f\"\u0000#\u0014\u000f\u0012#\u000e!\u0006㘄", (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 15, (byte) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 16), objArr62);
            java.lang.String intern28 = ((java.lang.String) objArr62[0]).intern();
            java.lang.Object[] objArr63 = new java.lang.Object[1];
            f(14 - android.text.TextUtils.getTrimmedLength(str), false, "\b\u0001\n￼\u0001\ufff7\ufff2\u0006\f\u0000\ufff5\u0002\uffff\u0006", android.view.KeyEvent.normalizeMetaState(0) + com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE, (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 13, objArr63);
            java.lang.String[] strArr2 = {intern2, intern3, intern4, intern5, intern6, intern7, intern8, intern9, intern10, intern11, intern12, intern13, intern14, intern15, intern16, intern17, intern18, intern19, intern20, intern21, intern22, intern23, intern24, intern25, intern26, intern27, intern28, ((java.lang.String) objArr63[0]).intern()};
            java.lang.Object[] objArr64 = new java.lang.Object[1];
            e("\u0014\u000b\r\u0003\u000b\u0013\u0000\u001c\u000b\u0013㙕", 11 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (byte) ((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 86), objArr64);
            java.lang.Object[] objArr65 = {((java.lang.String) objArr64[0]).intern()};
            java.lang.Object obj16 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
            if (obj16 == null) {
                java.lang.Class cls14 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 39, (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1921, (char) (android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1));
                byte b38 = $$d[14];
                byte b39 = (byte) (b38 + 1);
                byte b40 = b38;
                java.lang.Object[] objArr66 = new java.lang.Object[1];
                d(b39, b40, (short) (b40 + 1), objArr66);
                obj16 = cls14.getMethod((java.lang.String) objArr66[0], java.lang.String.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj16);
            }
            java.lang.String str3 = (java.lang.String) ((java.lang.reflect.Method) obj16).invoke(null, objArr65);
            if (str3 != null) {
                java.lang.Object[] objArr67 = new java.lang.Object[1];
                f(android.view.View.resolveSize(0, 0) + 6, false, "\ufff9\ufffe\u000b\b\ufff7\u0004", (-16776959) - android.graphics.Color.rgb(0, 0, 0), 2 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), objArr67);
                java.lang.String intern29 = ((java.lang.String) objArr67[0]).intern();
                java.lang.Object[] objArr68 = new java.lang.Object[1];
                f(7 - android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), false, "\ufffe�\u0005\u0002\ufffa￼\uffff\t", 257 - android.view.View.getDefaultSize(0, 0), (-16777215) - android.graphics.Color.rgb(0, 0, 0), objArr68);
                int i11 = 0;
                java.lang.String[] strArr3 = {intern29, ((java.lang.String) objArr68[0]).intern()};
                int i12 = 0;
                int i13 = 2;
                while (true) {
                    if (i12 >= i13) {
                        break;
                    }
                    if (str3.contains(strArr3[i12])) {
                        java.lang.Object[] objArr69 = new java.lang.Object[1];
                        f(22 - android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, i11), true, "�\b\u000b\tￇ\b\u000b\u000b\ufffe\u000b\u000e\r￼\ufffa\uffff\u000e\u0007\ufffa\u0006ￇ\r￼\u000e", android.view.KeyEvent.getDeadChar(i11, i11) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, android.graphics.drawable.Drawable.resolveOpacity(i11, i11) + 7, objArr69);
                        java.lang.Object[] objArr70 = {((java.lang.String) objArr69[0]).intern()};
                        java.lang.Object obj17 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                        if (obj17 == null) {
                            java.lang.Class cls15 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1921, (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                            byte b41 = $$d[14];
                            byte b42 = (byte) (b41 + 1);
                            byte b43 = b41;
                            java.lang.Object[] objArr71 = new java.lang.Object[1];
                            d(b42, b43, (short) (b43 + 1), objArr71);
                            obj17 = cls15.getMethod((java.lang.String) objArr71[0], java.lang.String.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj17);
                        }
                        java.lang.Object invoke6 = ((java.lang.reflect.Method) obj17).invoke(null, objArr70);
                        java.lang.Object[] objArr72 = new java.lang.Object[1];
                        f(29 - android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), true, "\u0006\ufffe\r\f\u0012\fￇ\r￼\u000e�\b\u000b\tￇ\b\u000b\u000b\ufffe\u000b\u000e\r￼\ufffa\uffff\u000e\u0007\ufffa\u0006ￇ", android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 255, 17 - (android.view.ViewConfiguration.getTapTimeout() >> 16), objArr72);
                        java.lang.Object[] objArr73 = {((java.lang.String) objArr72[0]).intern()};
                        java.lang.Object obj18 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                        if (obj18 == null) {
                            java.lang.Class cls16 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.graphics.Color.green(0), android.os.Process.getGidForName(str) + 1922, (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0));
                            byte b44 = $$d[14];
                            byte b45 = (byte) (b44 + 1);
                            byte b46 = b44;
                            java.lang.Object[] objArr74 = new java.lang.Object[1];
                            d(b45, b46, (short) (b46 + 1), objArr74);
                            obj18 = cls16.getMethod((java.lang.String) objArr74[0], java.lang.String.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj18);
                        }
                        java.lang.Object invoke7 = ((java.lang.reflect.Method) obj18).invoke(null, objArr73);
                        if (invoke6 != null) {
                            java.lang.Object[] objArr75 = {invoke6, 42};
                            java.lang.Object obj19 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                            if (obj19 == null) {
                                java.lang.Class cls17 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 28, android.view.View.getDefaultSize(0, 0) + 2594, (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16));
                                byte b47 = $$d[14];
                                byte b48 = (byte) (b47 + 1);
                                byte b49 = b47;
                                java.lang.Object[] objArr76 = new java.lang.Object[1];
                                d(b48, b49, (short) (b49 + 1), objArr76);
                                obj19 = cls17.getMethod((java.lang.String) objArr76[0], java.lang.String.class, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj19);
                            }
                            long longValue8 = ((java.lang.Long) ((java.lang.reflect.Method) obj19).invoke(null, objArr75)).longValue();
                            long j20 = (471 * longValue8) + 284126311092L + (((~((~j3) | (-1203925048))) | longValue8) * (-235)) + (((~((-1203925048) | j3)) | longValue8) * (-470)) + (((~((~longValue8) | 1203925047)) | (~(longValue8 | (-1203925048) | j3))) * 235) + 53175477;
                            if (((((int) (j20 >> 32)) & ((((~((-135530753) | i8)) * 433) - 1384573186) + (((~(1496602976 | i)) | 1361137908) * (-433)) + (((~(1361137908 | i)) | 1361072224) * 433))) | (((int) j20) & (((((~((-642406913) | i)) | (-794819498)) * (-756)) - 697023679) + (((-642406913) | i8) * 756)))) == 477111747) {
                                strArr = strArr2;
                                i6 = 0;
                                for (i5 = 0; i5 < 28; i5++) {
                                    valueOf = (AlternateContactlessPaymentDataJson + 85) % 128;
                                    java.lang.String str4 = strArr[i5];
                                    java.lang.Object[] objArr77 = new java.lang.Object[1];
                                    e("\u0004\u000b\u001c\b\u0011\r\u0001\u0000\u0017\r#\u0000", (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 11, (byte) ((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 91), objArr77);
                                    java.lang.Object[] objArr78 = {((java.lang.String) objArr77[0]).intern().concat(java.lang.String.valueOf(str4))};
                                    java.lang.Object obj20 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1161224381);
                                    if (obj20 == null) {
                                        java.lang.Class cls18 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(35 - android.widget.ExpandableListView.getPackedPositionChild(0L), android.view.View.resolveSize(0, 0) + 3161, (char) ((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 33099));
                                        byte b50 = $$d[14];
                                        byte b51 = (byte) (b50 + 1);
                                        byte b52 = b50;
                                        java.lang.Object[] objArr79 = new java.lang.Object[1];
                                        d(b51, b52, (short) (b52 + 1), objArr79);
                                        obj20 = cls18.getMethod((java.lang.String) objArr79[0], java.lang.String.class);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1161224381, obj20);
                                    }
                                    long longValue9 = ((java.lang.Long) ((java.lang.reflect.Method) obj20).invoke(null, objArr78)).longValue();
                                    long j21 = ~longValue9;
                                    long j22 = j21 | (-317103419);
                                    long j23 = ~j3;
                                    long j24 = ((((((-496) * longValue9) - 157283295328L) + ((~j22) * 497)) + (((~(j22 | j3)) | (~((j21 | j23) | 317103418))) * 497)) + ((((~((-317103419) | j23)) | (~(longValue9 | (-317103419)))) | (~((j21 | 317103418) | j3))) * 497)) - 1654771526;
                                    if (((((int) (j24 >> 32)) & ((((~(1810823903 | i8)) | (~((-178268761) | i))) * 988) + 1112610550 + (((~(195328732 | i)) | 1615495171 | (~((-178268761) | i8))) * 988))) | (((int) j24) & (((((~(433818899 | i8)) | (~((-432703507) | i))) * (-831)) - 555493230) + ((~((-570704005) | i)) * (-1662)) + (((~(1003407510 | i8)) | (~((-1003407511) | i)) | (~((-433818900) | i))) * 831)))) == 0) {
                                        AlternateContactlessPaymentDataJson = (valueOf + 119) % 128;
                                        i7 = 0;
                                    } else {
                                        i7 = 1;
                                    }
                                    i6 += i7;
                                }
                                if (i6 >= 25.2d) {
                                    java.lang.Object[] objArr80 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE}, null, new int[1]};
                                    java.lang.Object[] objArr81 = {-579990794, 16, java.lang.Integer.valueOf(((((810026000 | i8) * 1324) - 712732795) + (((~(i | 811492379)) | (~((-102166860) | i))) * (-1324))) - 1605508982)};
                                    java.lang.Object obj21 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                    if (obj21 == null) {
                                        java.lang.Class cls19 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTapTimeout() >> 16) + 50, 2712 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16));
                                        byte[] bArr3 = $$d;
                                        byte b53 = bArr3[16];
                                        byte b54 = bArr3[14];
                                        java.lang.Object[] objArr82 = new java.lang.Object[1];
                                        d(b53, b54, (short) (b54 & 653), objArr82);
                                        obj21 = cls19.getMethod((java.lang.String) objArr82[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj21);
                                    }
                                    ((int[]) objArr80[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj21).invoke(null, objArr81)).intValue();
                                    return objArr80;
                                }
                            }
                        }
                        if (invoke7 != null) {
                            int i14 = valueOf + 61;
                            AlternateContactlessPaymentDataJson = i14 % 128;
                            if (i14 % 2 == 0) {
                                java.lang.Object[] objArr83 = {invoke7, 72};
                                java.lang.Object obj22 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                if (obj22 == null) {
                                    java.lang.Class cls20 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), 2594 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) android.view.KeyEvent.keyCodeFromString(str));
                                    byte b55 = $$d[14];
                                    byte b56 = (byte) (b55 + 1);
                                    byte b57 = b55;
                                    java.lang.Object[] objArr84 = new java.lang.Object[1];
                                    d(b56, b57, (short) (b57 + 1), objArr84);
                                    obj22 = cls20.getMethod((java.lang.String) objArr84[0], java.lang.String.class, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj22);
                                }
                                long longValue10 = ((java.lang.Long) ((java.lang.reflect.Method) obj22).invoke(null, objArr83)).longValue();
                                long j25 = ~longValue10;
                                strArr = strArr2;
                                long j26 = (((-661) * longValue10) - 367149798068L) + (((~j3) | (~(j25 | (-555445989)))) * 1324) + (((~(555445988 | j3)) | (~(longValue10 | j3))) * (-1324)) + (((~(longValue10 | (-555445989))) | (~(555445988 | j25))) * 662) + 701654536;
                                if (((((int) j26) & (((((~(1509848118 | i8)) | 66057) * (-108)) - 1520300521) + (((~((-1347892768) | i)) | 162021408 | (~(1347892767 | i8))) * 54) + ((162021408 | i) * 54))) | (((int) (j26 >>> 15)) & (((317085996 | i) * 140) + 753328754 + (((~(317085996 | i8)) | 1073849426) * (-280)) + (((~(1120140414 | i8)) | 270795008 | (~((-1073849427) | i))) * 140)))) == 477111747) {
                                    i6 = 0;
                                    while (i5 < 28) {
                                    }
                                    if (i6 >= 25.2d) {
                                    }
                                }
                            } else {
                                strArr = strArr2;
                                java.lang.Object[] objArr85 = {invoke7, 42};
                                java.lang.Object obj23 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                if (obj23 == null) {
                                    java.lang.Class cls21 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.MotionEvent.axisFromString(str) + 29, 2594 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0));
                                    byte b58 = $$d[14];
                                    byte b59 = (byte) (b58 + 1);
                                    byte b60 = b58;
                                    java.lang.Object[] objArr86 = new java.lang.Object[1];
                                    d(b59, b60, (short) (b60 + 1), objArr86);
                                    obj23 = cls21.getMethod((java.lang.String) objArr86[0], java.lang.String.class, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj23);
                                }
                                long j27 = ~((java.lang.Long) ((java.lang.reflect.Method) obj23).invoke(null, objArr85)).longValue();
                                long j28 = ~j3;
                                long j29 = ((r6 * (-1917)) - 601461425280L) + (((~(j3 | (-626522318))) | (~(j27 | j28))) * 959) + ((-959) * j27) + (((~(j27 | j3)) | (~(j28 | (-626522318)))) * 959) + 1883622842;
                            }
                        }
                    } else {
                        i12++;
                        i11 = 0;
                        i13 = 2;
                    }
                }
            }
            java.lang.Object[] objArr87 = new java.lang.Object[1];
            e("\u0004\u000b\u001c\b\u0003\u000b\u000b\u0004\u0006\u0010\u0005\u000f\u0000\u0018#\u000b\u0012\u0000\n\t\u0012\u0015㙠", android.text.TextUtils.getTrimmedLength(str) + 23, (byte) (97 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), objArr87);
            java.lang.Object[] objArr88 = {((java.lang.String) objArr87[0]).intern()};
            java.lang.Object obj24 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
            if (obj24 == null) {
                java.lang.Class cls22 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), android.os.Process.getGidForName(str) + 2808, (char) android.graphics.Color.red(0));
                byte b61 = $$d[14];
                byte b62 = (byte) (b61 + 1);
                byte b63 = b61;
                java.lang.Object[] objArr89 = new java.lang.Object[1];
                d(b62, b63, (short) (b63 + 1), objArr89);
                obj24 = cls22.getMethod((java.lang.String) objArr89[0], java.lang.String.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1729156627, obj24);
            }
            long longValue11 = ((java.lang.Long) ((java.lang.reflect.Method) obj24).invoke(null, objArr88)).longValue();
            long j30 = ~longValue11;
            long j31 = ~j3;
            long j32 = ~(j31 | 461265059 | longValue11);
            long j33 = (471 * longValue11) + 217255842789L + ((longValue11 | 461265059) * (-470)) + (((~(j30 | j3)) | (~((-461265060) | j30)) | j32) * (-470)) + ((j32 | (~(461265059 | j30 | j3))) * 470) + 829275008;
            long j34 = (((int) j33) & ((((~((-55378769) | i)) | 1492605178) * (-318)) + 1195396991 + (((~(1492605178 | i)) | (~((-1488083115) | i8))) * 318) + (((~(1543461882 | i8)) | (~((-1488083115) | i))) * 318))) | (((int) (j33 >> 32)) & ((((~((-1196674767) | i)) | 106071756) * 336) + 501358106 + (((~(240551644 | i)) | (-1331154655)) * (-168)) + (((~(240551644 | i8)) | (-1196674767)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE)));
            java.lang.Object[] objArr90 = new java.lang.Object[1];
            f((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 17, false, "\u0011ￍ\u000e\u0010\r\u0001ￍ\u0011\u0003\n\u0004ￍ\u0011\u0012\uffff\u0012\u0013", 249 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), -android.view.MotionEvent.axisFromString(str), objArr90);
            java.lang.Object[] objArr91 = {((java.lang.String) objArr90[0]).intern()};
            java.lang.Object obj25 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
            if (obj25 == null) {
                java.lang.Class cls23 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 29, (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2807, (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16));
                byte b64 = $$d[14];
                byte b65 = (byte) (b64 + 1);
                byte b66 = b64;
                java.lang.Object[] objArr92 = new java.lang.Object[1];
                d(b65, b66, (short) (b66 + 1), objArr92);
                obj25 = cls23.getMethod((java.lang.String) objArr92[0], java.lang.String.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1729156627, obj25);
            }
            long longValue12 = ((java.lang.Long) ((java.lang.reflect.Method) obj25).invoke(null, objArr91)).longValue();
            long j35 = ~longValue12;
            long j36 = (319 * longValue12) + 113177273066L + (((~(j31 | (-357026098) | longValue12)) | (~(j35 | 357026097 | j3))) * (-318)) + (((~((-357026098) | j35)) | (~(j3 | (-357026098)))) * (-318)) + (((~(j3 | 357026097)) | j35) * 318) + 1647566165;
            int i15 = ~((-1239344839) | i8);
            long j37 = (((int) j36) & (((((((~(197881571 | i8)) | (-1272966888)) | (~(1239344838 | i8))) | (~((-164259523) | i))) * (-84)) - 1905160647) + (((~(1239344838 | i)) | (-197881572) | i15) * (-84)) + ((i15 | 164259522) * 84))) | (((int) (j36 >> 32)) & (((((~((-879488581) | i8)) | (~(897576806 | i))) * (-831)) - 1770839988) + ((~((-339838977) | i)) * (-1662)) + (((~((-557737831) | i8)) | (~(557737830 | i)) | (~(879488580 | i))) * 831)));
            if (j34 > 0 && j37 > 0 && j37 - 3 < j34) {
                java.lang.Object[] objArr93 = {new int[]{i}, new int[]{i ^ 247}, null, new int[1]};
                java.lang.Object[] objArr94 = {-579990794, 16, java.lang.Integer.valueOf((((~(i | 744290323)) | (-34964804)) * 56) + 2053975943 + (((~((-34964804) | i8)) | 744290323) * 56))};
                java.lang.Object obj26 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                if (obj26 == null) {
                    java.lang.Class cls24 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 2713 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                    byte[] bArr4 = $$d;
                    byte b67 = bArr4[16];
                    byte b68 = bArr4[14];
                    java.lang.Object[] objArr95 = new java.lang.Object[1];
                    d(b67, b68, (short) (b68 & 653), objArr95);
                    obj26 = cls24.getMethod((java.lang.String) objArr95[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj26);
                }
                ((int[]) objArr93[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj26).invoke(null, objArr94)).intValue();
                return objArr93;
            }
            java.lang.Object[] objArr96 = new java.lang.Object[1];
            e("\u0004\u000b\u001c\b\u0003\u000b\u000b\u0004\u0006\u0010\u0005\u000f\u0000\u0018#\u000b\u0012\u0000\n\t\u0012\u0015㙠", android.widget.ExpandableListView.getPackedPositionChild(0L) + 24, (byte) (android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 98), objArr96);
            java.lang.Object[] objArr97 = {((java.lang.String) objArr96[0]).intern()};
            java.lang.Object obj27 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
            if (obj27 == null) {
                java.lang.Class cls25 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.alpha(0) + 29, 2806 - android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) android.view.View.resolveSizeAndState(0, 0, 0));
                byte b69 = $$d[14];
                byte b70 = (byte) (b69 + 1);
                byte b71 = b69;
                java.lang.Object[] objArr98 = new java.lang.Object[1];
                d(b70, b71, (short) (b71 + 1), objArr98);
                obj27 = cls25.getMethod((java.lang.String) objArr98[0], java.lang.String.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1729156627, obj27);
            }
            long longValue13 = ((java.lang.Long) ((java.lang.reflect.Method) obj27).invoke(null, objArr97)).longValue();
            long j38 = (530 * longValue13) + 247711353358L + (((~(longValue13 | 467379910)) | (~(j31 | 467379910))) * 529) + (((~longValue13) | (~(j3 | 467379910))) * 529) + 823160157;
            long j39 = (((int) (j38 >> 32)) & (((((~((-1092476693) | i8)) | (-344749719)) * (-865)) - 319002776) + ((~(1092476692 | i)) * 865) + (((~(1092476692 | i8)) | (~((-344749719) | i8))) * 865))) | (((int) j38) & (((2116900341 | i8) * (-369)) + 802172634 + (((~((-2116572661) | i8)) | 741168225) * (-369)) + (((~(2116572660 | i)) | 327681 | (~((-1375732117) | i8))) * 369)));
            java.lang.Object[] objArr99 = new java.lang.Object[1];
            f((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 4, true, "\n\tￔ\u001b", 242 - android.graphics.Color.red(0), android.text.TextUtils.getOffsetBefore(str, 0) + 3, objArr99);
            java.lang.Object[] objArr100 = {((java.lang.String) objArr99[0]).intern()};
            java.lang.Object obj28 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
            if (obj28 == null) {
                java.lang.Class cls26 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 30, 2807 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) android.view.View.MeasureSpec.getMode(0));
                byte b72 = $$d[14];
                byte b73 = (byte) (b72 + 1);
                byte b74 = b72;
                java.lang.Object[] objArr101 = new java.lang.Object[1];
                d(b73, b74, (short) (b74 + 1), objArr101);
                obj28 = cls26.getMethod((java.lang.String) objArr101[0], java.lang.String.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1729156627, obj28);
            }
            long longValue14 = ((java.lang.Long) ((java.lang.reflect.Method) obj28).invoke(null, objArr100)).longValue();
            long j40 = ~longValue14;
            long j41 = ((832 * longValue14) - 437481437270L) + (((~(longValue14 | 527086069 | j3)) | (~(j40 | j31))) * (-831)) + ((~(527086069 | j40 | j3)) * (-1662)) + (((~(j31 | (-527086070))) | (~(j3 | 527086069)) | (~(longValue14 | j3))) * 831) + 763453998;
            long j42 = (((int) j41) & (((((~((-1226282036) | i)) | (-1631458851)) * (-318)) - 1434434701) + (((~((-1631458851) | i)) | (~(1765774899 | i8))) * 318) + (((~((-539492865) | i8)) | (~(1765774899 | i))) * 318))) | (((int) (j41 >> 32)) & ((((~((-790194968) | i8)) | 638609939) * 446) + 384374654 + (((~((-151585029) | i)) | 8421504) * 446) + 1352191258));
            if (j39 > 0 && j42 > 0) {
                valueOf = (AlternateContactlessPaymentDataJson + 111) % 128;
                if (j42 + 100 < j39) {
                    java.lang.Object[] objArr102 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE}, null, new int[1]};
                    java.lang.Object[] objArr103 = {-579990794, 16, java.lang.Integer.valueOf((((~((-761839814) | i)) | 18890949 | (~((-52514294) | i))) * (-754)) + 551998869 + (((~(i | (-18890950))) | (~((-33623345) | i8))) * (-754)) + (((-761839814) | i8) * 754))};
                    java.lang.Object obj29 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    if (obj29 == null) {
                        java.lang.Class cls27 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getCapsMode(str, 0, 0) + 50, 2713 - android.graphics.Color.red(0), (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                        byte[] bArr5 = $$d;
                        byte b75 = bArr5[16];
                        byte b76 = bArr5[14];
                        java.lang.Object[] objArr104 = new java.lang.Object[1];
                        d(b75, b76, (short) (b76 & 653), objArr104);
                        obj29 = cls27.getMethod((java.lang.String) objArr104[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj29);
                    }
                    ((int[]) objArr102[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj29).invoke(null, objArr103)).intValue();
                    return objArr102;
                }
            }
            java.lang.Object[] objArr105 = new java.lang.Object[1];
            f(6 - android.os.Process.getGidForName(str), true, "\ufffe\r\f\u0012\f\uffc8\u0006", 254 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), 5 - android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr105);
            java.lang.String intern30 = ((java.lang.String) objArr105[0]).intern();
            java.lang.Object[] objArr106 = new java.lang.Object[1];
            e("\u0004\u000b\u001c\b\u0011\r\u0001\u0000\u0017\r㘘", 11 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (byte) (android.text.TextUtils.indexOf(str, str, 0) + 36), objArr106);
            java.lang.String intern31 = ((java.lang.String) objArr106[0]).intern();
            java.lang.Object[] objArr107 = new java.lang.Object[1];
            e("\u0004\u000b\u001c\b\u0011\r\u0001\u0000\u0007\u0016\f#", (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 11, (byte) ((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 101), objArr107);
            java.lang.String intern32 = ((java.lang.String) objArr107[0]).intern();
            java.lang.Object[] objArr108 = new java.lang.Object[1];
            f(12 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), true, "\u000f\u0015\u000fￋ\n\u0005\ufffe\u0014ￋ\t\u0001\u0010", 250 - android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 3, objArr108);
            java.lang.String intern33 = ((java.lang.String) objArr108[0]).intern();
            java.lang.Object[] objArr109 = new java.lang.Object[1];
            f(11 - (android.view.KeyEvent.getMaxKeyCode() >> 16), true, "\u0005\u0016ￏ\u000e\t\u0002ￏ\u0012\u000f\u0004\u000e", 247 - android.text.TextUtils.indexOf(str, str, 0, 0), 3 - (android.view.KeyEvent.getMaxKeyCode() >> 16), objArr109);
            java.lang.String intern34 = ((java.lang.String) objArr109[0]).intern();
            java.lang.Object[] objArr110 = new java.lang.Object[1];
            f(android.graphics.Color.rgb(0, 0, 0) + 16777221, true, "\u000f\n\u0003\u0014\uffd0", (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE, android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 6, objArr110);
            java.lang.String intern35 = ((java.lang.String) objArr110[0]).intern();
            java.lang.Object[] objArr111 = new java.lang.Object[1];
            e("\u0000\u0011\u000e\u0016", (android.os.Process.myPid() >> 22) + 4, (byte) (107 - android.widget.ExpandableListView.getPackedPositionGroup(0L)), objArr111);
            java.lang.String[] strArr4 = {intern30, intern31, intern32, intern33, intern34, intern35, ((java.lang.String) objArr111[0]).intern()};
            int i16 = 0;
            while (true) {
                if (i16 >= 7) {
                    i2 = 0;
                    break;
                }
                java.lang.Object[] objArr112 = {strArr4[i16]};
                java.lang.Object obj30 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2046560211);
                if (obj30 == null) {
                    java.lang.Class cls28 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.getDefaultSize(0, 0) + 27, 1672 - (android.os.Process.myPid() >> 22), (char) (47940 - android.view.KeyEvent.normalizeMetaState(0)));
                    byte b77 = $$d[14];
                    byte b78 = (byte) (b77 + 1);
                    byte b79 = b77;
                    java.lang.Object[] objArr113 = new java.lang.Object[1];
                    d(b78, b79, (short) (b79 + 1), objArr113);
                    obj30 = cls28.getMethod((java.lang.String) objArr113[0], java.lang.String.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2046560211, obj30);
                }
                long j43 = ~((java.lang.Long) ((java.lang.reflect.Method) obj30).invoke(null, objArr112)).longValue();
                java.lang.String[] strArr5 = strArr4;
                long j44 = (((((r9 * (-1917)) - 202054421760L) + (((~(j43 | j31)) | (~(j3 | (-210473356)))) * 959)) + ((-959) * j43)) + (((~(j43 | j3)) | (~(j31 | (-210473356)))) * 959)) - 1415056826;
                if (((((int) (j44 >> 32)) & (((r4 * 495) - 881820471) + (((~(2068144698 | i8)) | 1514431024) * 495))) | (((int) j44) & ((((-719349632) | i8) * (-757)) + 1742791164 + ((~((-2097494) | i)) * 1514) + (((~(717876778 | i8)) | (-719974272) | (~((-717252139) | i))) * 757)))) != 0) {
                    i2 = i16 + 90;
                    break;
                }
                i16++;
                strArr4 = strArr5;
            }
            if (i2 != 0) {
                java.lang.Object[] objArr114 = {new int[]{i}, new int[]{i2 ^ i}, null, new int[1]};
                int i17 = ~(i | 633798655);
                java.lang.Object[] objArr115 = {-579990794, 16, java.lang.Integer.valueOf((((((~((-92698355) | i8)) | 75526864) | i17) * (-252)) - 1732741233) + ((i17 | (~((-17171491) | i8))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE))};
                java.lang.Object obj31 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                if (obj31 == null) {
                    java.lang.Class cls29 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), android.view.Gravity.getAbsoluteGravity(0, 0) + 2713, (char) android.graphics.Color.red(0));
                    byte[] bArr6 = $$d;
                    byte b80 = bArr6[16];
                    byte b81 = bArr6[14];
                    java.lang.Object[] objArr116 = new java.lang.Object[1];
                    d(b80, b81, (short) (b81 & 653), objArr116);
                    obj31 = cls29.getMethod((java.lang.String) objArr116[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj31);
                }
                ((int[]) objArr114[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj31).invoke(null, objArr115)).intValue();
                return objArr114;
            }
            try {
                java.lang.Object[] objArr117 = new java.lang.Object[1];
                f((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 13, false, "\u0012\u0006\t\u0001ￋ\u0005\f\u0010\u0011\u000f\fￋ\uffff", android.graphics.Color.rgb(0, 0, 0) + 16777466, 9 - (android.view.KeyEvent.getMaxKeyCode() >> 16), objArr117);
                try {
                    java.lang.Object[] objArr118 = {((java.lang.String) objArr117[0]).intern()};
                    java.lang.Object obj32 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                    if (obj32 == null) {
                        java.lang.Class cls30 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.normalizeMetaState(0) + 40, 1920 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) android.view.View.combineMeasuredStates(0, 0));
                        byte b82 = $$d[14];
                        byte b83 = (byte) (b82 + 1);
                        byte b84 = b82;
                        java.lang.Object[] objArr119 = new java.lang.Object[1];
                        d(b83, b84, (short) (b84 + 1), objArr119);
                        obj32 = cls30.getMethod((java.lang.String) objArr119[0], java.lang.String.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj32);
                    }
                    java.lang.Object invoke8 = ((java.lang.reflect.Method) obj32).invoke(null, objArr118);
                    if (invoke8 != null) {
                        java.lang.Object[] objArr120 = new java.lang.Object[1];
                        f(11 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), true, "\u0004\ufff7\u000f\ufff9\ufffa\u0005\u0003\u0004\ufffb�\u0005", 257 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), 5 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr120);
                        try {
                            java.lang.Object[] objArr121 = {invoke8, new java.lang.String[]{((java.lang.String) objArr120[0]).intern()}};
                            java.lang.Object obj33 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1831766780);
                            if (obj33 == null) {
                                java.lang.Class cls31 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - android.text.TextUtils.getTrimmedLength(str), 2880 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (android.os.Process.myTid() >> 22));
                                byte b85 = $$d[14];
                                byte b86 = (byte) (b85 + 1);
                                byte b87 = b85;
                                java.lang.Object[] objArr122 = new java.lang.Object[1];
                                d(b86, b87, (short) (b87 + 1), objArr122);
                                obj33 = cls31.getMethod((java.lang.String) objArr122[0], java.lang.String.class, java.lang.String[].class);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1831766780, obj33);
                            }
                            long longValue15 = ((java.lang.Long) ((java.lang.reflect.Method) obj33).invoke(null, objArr121)).longValue();
                            long j45 = ((((((-215) * longValue15) - 193545849252L) + ((~(j3 | (-891916356))) * 216)) + ((((-891916356) | (~longValue15)) | j31) * (-216))) + ((longValue15 | (~(j31 | (-891916356)))) * 216)) - 1136795423;
                        } catch (java.lang.Throwable th2) {
                            java.lang.Throwable cause = th2.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th2;
                        }
                    }
                    java.lang.Object[] objArr123 = new java.lang.Object[1];
                    f(android.graphics.Color.alpha(0) + 18, true, "\uffff\u0012\u000fￊ\u0010\u0005\n\u0005\n\u000b\t\u0001�\u0000\ufffb\u0011\u000fￊ", 250 - android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), android.view.View.resolveSizeAndState(0, 0, 0) + 8, objArr123);
                    try {
                        java.lang.Object[] objArr124 = {((java.lang.String) objArr123[0]).intern()};
                        java.lang.Object obj34 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                        if (obj34 == null) {
                            java.lang.Class cls32 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.alpha(0) + 40, (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1920, (char) (android.os.Process.myTid() >> 22));
                            byte b88 = $$d[14];
                            byte b89 = (byte) (b88 + 1);
                            byte b90 = b88;
                            java.lang.Object[] objArr125 = new java.lang.Object[1];
                            d(b89, b90, (short) (b90 + 1), objArr125);
                            obj34 = cls32.getMethod((java.lang.String) objArr125[0], java.lang.String.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj34);
                        }
                        invoke = ((java.lang.reflect.Method) obj34).invoke(null, objArr124);
                    } catch (java.lang.Throwable th3) {
                        java.lang.Throwable cause2 = th3.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th3;
                    }
                } catch (java.lang.Throwable th4) {
                    java.lang.Throwable cause3 = th4.getCause();
                    if (cause3 != null) {
                        throw cause3;
                    }
                    throw th4;
                }
            } catch (java.lang.Exception unused) {
            }
            if (invoke != null) {
                java.lang.Object[] objArr126 = new java.lang.Object[1];
                e("\u0012\u0013㙞㙞\f#㙧", 6 - android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (byte) (107 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))), objArr126);
                if (invoke.equals(((java.lang.String) objArr126[0]).intern())) {
                    java.lang.Object[] objArr127 = new java.lang.Object[1];
                    e("\u0012\u0010\u0016\u000b\u0010\u000b\u0011\u0010\b\u001c\t\u0010\u0014\u000b\n\u000e\u001f\b㗾㗾\u0010\u0006㗮", android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 24, (byte) (5 - android.text.TextUtils.indexOf(str, str, 0)), objArr127);
                    try {
                        java.lang.Object[] objArr128 = {((java.lang.String) objArr127[0]).intern()};
                        java.lang.Object obj35 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                        if (obj35 == null) {
                            java.lang.Class cls33 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(39 - android.graphics.ImageFormat.getBitsPerPixel(0), android.graphics.Color.red(0) + 1921, (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16));
                            byte b91 = $$d[14];
                            byte b92 = (byte) (b91 + 1);
                            byte b93 = b91;
                            java.lang.Object[] objArr129 = new java.lang.Object[1];
                            d(b92, b93, (short) (b93 + 1), objArr129);
                            obj35 = cls33.getMethod((java.lang.String) objArr129[0], java.lang.String.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj35);
                        }
                        java.lang.String str5 = (java.lang.String) ((java.lang.reflect.Method) obj35).invoke(null, objArr128);
                        if (str5 != null && (parseInt = java.lang.Integer.parseInt(str5)) != 0) {
                            i3 = parseInt + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE;
                            if (i3 == 0) {
                                java.lang.Object[] objArr130 = {new int[]{i}, new int[]{i3 ^ i}, null, new int[1]};
                                java.lang.Object[] objArr131 = {-579990794, 16, java.lang.Integer.valueOf(((~((-289819175) | i8)) * 433) + 1989818306 + (((~(293559206 | i)) | (-1002884727)) * (-433)) + (((~(i | (-1002884727))) | 3740032) * 433))};
                                java.lang.Object obj36 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                if (obj36 == null) {
                                    java.lang.Class cls34 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf(str, str) + 50, 2713 - android.text.TextUtils.getOffsetAfter(str, 0), (char) android.graphics.Color.red(0));
                                    byte[] bArr7 = $$d;
                                    byte b94 = bArr7[16];
                                    byte b95 = bArr7[14];
                                    java.lang.Object[] objArr132 = new java.lang.Object[1];
                                    d(b94, b95, (short) (b95 & 653), objArr132);
                                    obj36 = cls34.getMethod((java.lang.String) objArr132[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj36);
                                }
                                ((int[]) objArr130[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj36).invoke(null, objArr131)).intValue();
                                return objArr130;
                            }
                            java.lang.Object[] objArr133 = new java.lang.Object[1];
                            f(android.graphics.Color.green(0) + 13, false, "\u0012\u0006\t\u0001ￋ\u0005\f\u0010\u0011\u000f\fￋ\uffff", 250 - android.widget.ExpandableListView.getPackedPositionType(0L), 9 - android.view.View.getDefaultSize(0, 0), objArr133);
                            java.lang.Object[] objArr134 = {((java.lang.String) objArr133[0]).intern()};
                            java.lang.Object obj37 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                            if (obj37 == null) {
                                java.lang.Class cls35 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(39 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1921, (char) android.view.Gravity.getAbsoluteGravity(0, 0));
                                byte b96 = $$d[14];
                                byte b97 = (byte) (b96 + 1);
                                byte b98 = b96;
                                java.lang.Object[] objArr135 = new java.lang.Object[1];
                                d(b97, b98, (short) (b98 + 1), objArr135);
                                obj37 = cls35.getMethod((java.lang.String) objArr135[0], java.lang.String.class);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj37);
                            }
                            java.lang.String str6 = (java.lang.String) ((java.lang.reflect.Method) obj37).invoke(null, objArr134);
                            if (str6 != null) {
                                java.lang.Object[] objArr136 = new java.lang.Object[1];
                                f(11 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), true, "\u0004\ufff7\u000f\ufff9\ufffa\u0005\u0003\u0004\ufffb�\u0005", 257 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 4 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), objArr136);
                                java.lang.String[] strArr6 = {((java.lang.String) objArr136[0]).intern()};
                                int i18 = 0;
                                while (true) {
                                    if (i18 > 0) {
                                        java.lang.Object[] objArr137 = new java.lang.Object[1];
                                        f(android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 13, false, "\b\u0013ￖￖ\u000b\b\u001b\bￖ\u0013\u0016\n", 240 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), 3 - android.text.TextUtils.indexOf(str, str), objArr137);
                                        java.lang.String intern36 = ((java.lang.String) objArr137[0]).intern();
                                        java.lang.Object[] objArr138 = new java.lang.Object[1];
                                        f((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 16, false, "\u0016\n\b\u0013ￖ\t\u0010\u0015ￖￖ\u000b\b\u001b\bￖ\u0013", (android.view.ViewConfiguration.getScrollBarSize() >> 8) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE, (android.view.KeyEvent.getMaxKeyCode() >> 16) + 9, objArr138);
                                        java.lang.String intern37 = ((java.lang.String) objArr138[0]).intern();
                                        java.lang.Object[] objArr139 = new java.lang.Object[1];
                                        f(android.text.TextUtils.indexOf(str, str) + 17, false, "\u0014\b\u0006\u0011ￔ\u001d\u0007\u000e\u0013ￔￔ\t\u0006\u0019\u0006ￔ\u0011", android.widget.ExpandableListView.getPackedPositionGroup(0L) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE, (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 10, objArr139);
                                        java.lang.String intern38 = ((java.lang.String) objArr139[0]).intern();
                                        java.lang.Object[] objArr140 = new java.lang.Object[1];
                                        e("\u0004\u000b\u0017\r#\u0000", (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 5, (byte) ((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 108), objArr140);
                                        java.lang.String intern39 = ((java.lang.String) objArr140[0]).intern();
                                        java.lang.Object[] objArr141 = new java.lang.Object[1];
                                        e("\u0004\u000b\u001c\b\u0011\r\u0001\u0000\u0017\r#\u0000", 12 - android.widget.ExpandableListView.getPackedPositionType(0L), (byte) (91 - android.view.KeyEvent.getDeadChar(0, 0)), objArr141);
                                        java.lang.String intern40 = ((java.lang.String) objArr141[0]).intern();
                                        java.lang.Object[] objArr142 = new java.lang.Object[1];
                                        f(18 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), true, "ￔￔ\u0019\u001d\nￓￔ\u0013\u000e\u0007ￔ\u0012\n\u0019\u0018\u001e\u0018", 242 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 1 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), objArr142);
                                        java.lang.String intern41 = ((java.lang.String) objArr142[0]).intern();
                                        java.lang.Object[] objArr143 = new java.lang.Object[1];
                                        f(21 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), true, "\u0007\u0002\u0014\r\n\u0002\u0007\uffd0\u000f\n\u0003\uffd0\u000e\u0006\u0015\u0014\u001a\u0014\uffd0\uffd0\u0006", (android.view.ViewConfiguration.getEdgeSlop() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE, 19 - android.text.TextUtils.getOffsetBefore(str, 0), objArr143);
                                        java.lang.String intern42 = ((java.lang.String) objArr143[0]).intern();
                                        java.lang.Object[] objArr144 = new java.lang.Object[1];
                                        f(16 - android.widget.ExpandableListView.getPackedPositionGroup(0L), true, "\u000b\u0004\u001a\uffd1\u0006\u0015\uffd1\u000f\u0007\u0016\u0015\u001b\u0015\uffd1\uffd1\u0010", (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE, (-16777202) - android.graphics.Color.rgb(0, 0, 0), objArr144);
                                        java.lang.String intern43 = ((java.lang.String) objArr144[0]).intern();
                                        java.lang.Object[] objArr145 = new java.lang.Object[1];
                                        f(android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 25, false, "\u0014\u001a\u0014\u0015\u0006\u000e\uffd0\u0016\u0014\u0013\uffd0\u0018\u0006ￎ\u000f\u0006\u0006\u0005ￎ\u0013\u0010\u0010\u0015\uffd0\uffd0", 247 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), android.view.View.MeasureSpec.getMode(0) + 24, objArr145);
                                        java.lang.String intern44 = ((java.lang.String) objArr145[0]).intern();
                                        java.lang.Object[] objArr146 = new java.lang.Object[1];
                                        f(13 - android.view.View.resolveSize(0, 0), false, "\u0018\u0002\t\u000eￏￏ\u0013\u0019\u0013\u0014\u0005\rￏ", android.view.KeyEvent.getDeadChar(0, 0) + 247, (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 5, objArr146);
                                        java.lang.String intern45 = ((java.lang.String) objArr146[0]).intern();
                                        java.lang.Object[] objArr147 = new java.lang.Object[1];
                                        e("\u0000\u0017\u000b\u0016\u0001\u0017\f#㘚", (-16777207) - android.graphics.Color.rgb(0, 0, 0), (byte) (102 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), objArr147);
                                        java.lang.String intern46 = ((java.lang.String) objArr147[0]).intern();
                                        java.lang.Object[] objArr148 = new java.lang.Object[1];
                                        f(8 - android.text.TextUtils.indexOf(str, str), true, "ￚ \u001eￚￚ\u0019\u0014\r", android.widget.ExpandableListView.getPackedPositionType(0L) + 236, (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 4, objArr148);
                                        java.lang.String[] strArr7 = {intern36, intern37, intern38, intern39, intern40, intern41, intern42, intern43, intern44, intern45, intern46, ((java.lang.String) objArr148[0]).intern()};
                                        for (int i19 = 0; i19 < 12; i19++) {
                                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                            sb.append(strArr7[i19]);
                                            java.lang.Object[] objArr149 = new java.lang.Object[1];
                                            f((android.view.ViewConfiguration.getTouchSlop() >> 8) + 2, false, "\uffff\u0001", 267 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 2, objArr149);
                                            sb.append(((java.lang.String) objArr149[0]).intern());
                                            java.lang.Object[] objArr150 = {sb.toString()};
                                            java.lang.Object obj38 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-604620973);
                                            if (obj38 == null) {
                                                java.lang.Class cls36 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(35 - android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), android.graphics.Color.rgb(0, 0, 0) + 16780377, (char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 33098));
                                                java.lang.Object[] objArr151 = new java.lang.Object[1];
                                                d((byte) ($$d[14] + 1), r10[23], 618, objArr151);
                                                obj38 = cls36.getMethod((java.lang.String) objArr151[0], java.lang.String.class);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-604620973, obj38);
                                            }
                                            long longValue16 = ((java.lang.Long) ((java.lang.reflect.Method) obj38).invoke(null, objArr150)).longValue();
                                            long j46 = ~longValue16;
                                            long j47 = j31 | 636150233;
                                            long j48 = ((-903) * longValue16) + 575715960865L + (((~(j3 | (-636150234))) | (~(j31 | longValue16))) * (-1808)) + (((~((-636150234) | j46 | j3)) | (~(j47 | longValue16))) * 904) + (((~j47) | (~((-636150234) | longValue16)) | (~(j46 | j3))) * 904) + 271320505;
                                            if (((((int) j48) & ((((~((-1244148717) | i)) | 1076376168) * 345) + 484646344 + (((~((-1244148717) | i8)) | 537216001) * 345) + ((~((-1076376169) | i)) * 345))) | (((int) (j48 >> 32)) & ((((((~((-1504354476) | i8)) | (~((-542113857) | i))) | (~(2113596395 | i))) * 765) - 709526935) + (((~((-2046468332) | i8)) | 1504354475) * 1530) + (((~((-2046468332) | i)) | (~(2113596395 | i8))) * 765)))) != 0) {
                                                i4 = i19 + 110;
                                                break;
                                            }
                                        }
                                    } else {
                                        if (str6.contains(strArr6[i18])) {
                                            break;
                                        }
                                        i18++;
                                    }
                                }
                            }
                            i4 = 0;
                            if (i4 != 0) {
                                java.lang.Object[] objArr152 = {new int[]{i}, new int[]{i4 ^ i}, null, new int[1]};
                                java.lang.Object[] objArr153 = {-579990794, 16, java.lang.Integer.valueOf((((~(627458567 | i)) | 8466632) * (-140)) + 1172618133 + ((~(635925199 | i)) * 70) + (((~(i | 81866952)) | 562524879) * 70))};
                                java.lang.Object obj39 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                if (obj39 == null) {
                                    java.lang.Class cls37 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 50, 2761 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) android.text.TextUtils.getTrimmedLength(str));
                                    byte[] bArr8 = $$d;
                                    byte b99 = bArr8[16];
                                    byte b100 = bArr8[14];
                                    java.lang.Object[] objArr154 = new java.lang.Object[1];
                                    d(b99, b100, (short) (b100 & 653), objArr154);
                                    obj39 = cls37.getMethod((java.lang.String) objArr154[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj39);
                                }
                                ((int[]) objArr152[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj39).invoke(null, objArr153)).intValue();
                                return objArr152;
                            }
                            long[] jArr = {472001035};
                            java.lang.Object[] objArr155 = new java.lang.Object[1];
                            e("\u0004\u0017\u0014\u000b\u0017\u0002\u0006\u0010\t\u000f\u0000\u0001\u0006\u0014\"\f㘀", android.view.KeyEvent.normalizeMetaState(0) + 17, (byte) (android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 24), objArr155);
                            java.lang.Object[] objArr156 = {((java.lang.String) objArr155[0]).intern(), 5, java.lang.Long.valueOf(kotlinx.coroutines.internal.LockFreeTaskQueueCore.HEAD_MASK), jArr};
                            java.lang.Object obj40 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1441749806);
                            if (obj40 == null) {
                                java.lang.Class cls38 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - android.graphics.ImageFormat.getBitsPerPixel(0), android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 3048, (char) (1 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))));
                                byte b101 = $$d[14];
                                byte b102 = (byte) (b101 + 1);
                                byte b103 = b101;
                                java.lang.Object[] objArr157 = new java.lang.Object[1];
                                d(b102, b103, (short) (b103 + 1), objArr157);
                                obj40 = cls38.getMethod((java.lang.String) objArr157[0], java.lang.String.class, java.lang.Integer.TYPE, java.lang.Long.TYPE, long[].class);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1441749806, obj40);
                            }
                            long longValue17 = ((java.lang.Long) ((java.lang.reflect.Method) obj40).invoke(null, objArr156)).longValue();
                            long j49 = (((((603 * longValue17) - 575233547492L) + (((~(j31 | 1904746845)) | longValue17) * (-602))) + ((((~((~longValue17) | 1904746845)) | (~(j3 | 1904746845))) | (~((j31 | (-1904746846)) | longValue17))) * (-301))) + ((~(j31 | longValue17)) * 301)) - 5901064;
                            int i20 = ((((int) (j49 >> 32)) & (((((~(636033290 | i8)) * (-560)) + (-562549302)) + ((~((-167781537) | i)) * (-560))) + (((~(801193120 | i8)) | 2621706) * 560))) | (((int) j49) & ((((((~((-668544633) | i)) | (~((-2105771043) | i8))) * (-1808)) + (-1716757075)) + (((~((-39332441) | i)) | (~((-1476558851) | i8))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN)) + ((((~(2105771042 | i)) | 629212192) | (~(668544632 | i8))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN)))) != 0 ? com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE : 0;
                            if (i20 != 0) {
                                java.lang.Object[] objArr158 = {new int[]{i}, new int[]{i20 ^ i}, null, new int[1]};
                                java.lang.Object[] objArr159 = {-579990794, 16, java.lang.Integer.valueOf((((~(i | 823323088)) | (-113997569)) * 56) + 1856603527 + (((~((-113997569) | i8)) | 823323088) * 56))};
                                java.lang.Object obj41 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                if (obj41 == null) {
                                    java.lang.Class cls39 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.widget.ExpandableListView.getPackedPositionType(0L), 2712 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (char) (android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1));
                                    byte[] bArr9 = $$d;
                                    byte b104 = bArr9[16];
                                    byte b105 = bArr9[14];
                                    java.lang.Object[] objArr160 = new java.lang.Object[1];
                                    d(b104, b105, (short) (b105 & 653), objArr160);
                                    obj41 = cls39.getMethod((java.lang.String) objArr160[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj41);
                                }
                                ((int[]) objArr158[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj41).invoke(null, objArr159)).intValue();
                                return objArr158;
                            }
                            long[] jArr2 = {472001035};
                            java.lang.Object[] objArr161 = new java.lang.Object[1];
                            f(21 - android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), true, "ￌ\u0016\u0000\u0006\t\f\rￌ\u0015\u0012\u000b\u0006\t\u0002\u0010ￌ\u0010\u0003ￌ\u0010\u0016\u0010", android.view.MotionEvent.axisFromString(str) + 251, 1 - android.text.TextUtils.getOffsetBefore(str, 0), objArr161);
                            try {
                                bufferedInputStream2 = new java.io.BufferedInputStream(new java.io.FileInputStream(((java.lang.String) objArr161[0]).intern()));
                                j = 0;
                            } catch (java.io.IOException unused2) {
                                bufferedInputStream2 = null;
                            } catch (java.lang.Throwable th5) {
                                th = th5;
                                bufferedInputStream = null;
                            }
                            while (true) {
                                try {
                                    int read = bufferedInputStream2.read();
                                    if (read != -1) {
                                        j = kotlinx.coroutines.internal.LockFreeTaskQueueCore.HEAD_MASK & (read ^ (j << 5));
                                        for (int i21 = 0; i21 <= 0; i21++) {
                                            if (j == jArr2[i21]) {
                                                int i22 = i21 + 1;
                                                try {
                                                    bufferedInputStream2.close();
                                                } catch (java.lang.Exception unused3) {
                                                }
                                                if (i22 != 0) {
                                                    java.lang.Object[] objArr162 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE}, null, new int[1]};
                                                    java.lang.Object[] objArr163 = {-579990794, 16, java.lang.Integer.valueOf((((~(84271534 | i8)) | (-793638399)) * 98) + 609551339 + (((~((-793597055) | i8)) | 84271534 | (~(793597054 | i))) * (-49)) + (((~(i | 84271534)) | 41344) * 49))};
                                                    java.lang.Object obj42 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                    if (obj42 == null) {
                                                        java.lang.Class cls40 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 49, (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2713, (char) (android.view.KeyEvent.getMaxKeyCode() >> 16));
                                                        byte[] bArr10 = $$d;
                                                        byte b106 = bArr10[16];
                                                        byte b107 = bArr10[14];
                                                        java.lang.Object[] objArr164 = new java.lang.Object[1];
                                                        d(b106, b107, (short) (b107 & 653), objArr164);
                                                        obj42 = cls40.getMethod((java.lang.String) objArr164[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj42);
                                                    }
                                                    ((int[]) objArr162[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj42).invoke(null, objArr163)).intValue();
                                                    return objArr162;
                                                }
                                            }
                                        }
                                    }
                                } catch (java.io.IOException unused4) {
                                } catch (java.lang.Throwable th6) {
                                    th = th6;
                                    bufferedInputStream = bufferedInputStream2;
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
                                    bufferedInputStream2.close();
                                    break;
                                } catch (java.lang.Exception unused6) {
                                }
                            }
                            java.lang.Object obj43 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(724989957);
                            if (obj43 == null) {
                                java.lang.Class cls41 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(30 - android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), 1890 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (3600 - android.widget.ExpandableListView.getPackedPositionType(0L)));
                                byte b108 = $$d[14];
                                byte b109 = (byte) (b108 + 1);
                                byte b110 = b108;
                                java.lang.Object[] objArr165 = new java.lang.Object[1];
                                d(b109, b110, (short) (b110 + 1), objArr165);
                                obj43 = cls41.getMethod((java.lang.String) objArr165[0], null);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(724989957, obj43);
                            }
                            long longValue18 = ((java.lang.Long) ((java.lang.reflect.Method) obj43).invoke(null, null)).longValue();
                            long j50 = (((((421 * longValue18) + 194540421631L) + ((~(longValue18 | j3)) * 420)) + ((464296948 | longValue18) * (-420))) + (((~(464296948 | (~longValue18))) | (~(j31 | longValue18))) * 420)) - 1414951431;
                            if (((((int) (j50 >> 32)) & (((((~((-1594147) | i)) | 1438820557) * (-756)) - 530950550) + (((-1594147) | i8) * 756))) | (((int) j50) & ((((~((-926220301) | i)) | 857735176) * 345) + 484646344 + (((~((-926220301) | i8)) | 1073785409) * 345) + ((~((-857735177) | i)) * 345)))) != 0) {
                                java.lang.Object[] objArr166 = {new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PLAID_LOGO_VALUE}, new int[]{i20}, null, new int[1]};
                                java.lang.Object[] objArr167 = {-579990794, 16, java.lang.Integer.valueOf((((~((-235747135) | i8)) | 33883182) * 98) + 811447252 + (((~((-473578386) | i8)) | (-235747135) | (~(473578385 | i))) * (-49)) + (((~(i | (-235747135))) | (-507461568)) * 49))};
                                java.lang.Object obj44 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                if (obj44 == null) {
                                    java.lang.Class cls42 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 2713, (char) (android.view.KeyEvent.getMaxKeyCode() >> 16));
                                    byte[] bArr11 = $$d;
                                    byte b111 = bArr11[16];
                                    byte b112 = bArr11[14];
                                    java.lang.Object[] objArr168 = new java.lang.Object[1];
                                    d(b111, b112, (short) (b112 & 653), objArr168);
                                    obj44 = cls42.getMethod((java.lang.String) objArr168[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj44);
                                }
                                ((int[]) objArr166[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj44).invoke(null, objArr167)).intValue();
                                return objArr166;
                            }
                            java.lang.Object[] objArr169 = {2};
                            java.lang.Object obj45 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(104106647);
                            if (obj45 == null) {
                                java.lang.Class cls43 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (android.os.Process.myTid() >> 22) + 2364, (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                byte b113 = $$d[14];
                                byte b114 = (byte) (b113 + 1);
                                byte b115 = b113;
                                java.lang.Object[] objArr170 = new java.lang.Object[1];
                                d(b114, b115, (short) (b115 + 1), objArr170);
                                obj45 = cls43.getMethod((java.lang.String) objArr170[0], java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(104106647, obj45);
                            }
                            long longValue19 = ((java.lang.Long) ((java.lang.reflect.Method) obj45).invoke(null, objArr169)).longValue();
                            long j51 = ~longValue19;
                            long j52 = ~((-640111724) | longValue19);
                            long j53 = ((longValue19 * 371) - 237481449604L) + (((~(j3 | 640111723)) | (~(j51 | j31))) * (-370)) + (((~(j51 | j3)) | (~(j31 | 640111723)) | j52) * (-370)) + (j52 * 370) + 2048021923;
                            if (((((int) j53) & ((((~(1609411574 | i8)) | (~((-1456209969) | i))) * (-302)) + 267604851 + ((~(1609411574 | i)) * (-604)) + (((~(153201606 | i)) | 134218048) * 302))) | (((int) (j53 >> 32)) & ((((~((-1658451932) | i8)) | (~(221225520 | i))) * 1900) + 1871737038 + (((~(1658451931 | i)) | (~((-221225521) | i8))) * (-950)) + (((~(1658451931 | i8)) | (~((-221225521) | i))) * 950)))) == 2) {
                                java.lang.Object[] objArr171 = {new int[]{i}, new int[]{i ^ 270}, null, new int[1]};
                                java.lang.Object[] objArr172 = {-579990794, 16, java.lang.Integer.valueOf((((~(i | (-466205771))) | 172602368) * 576) + 159719695 + (((~((-293603403) | i8)) | 70517381) * 576) + 634716160)};
                                java.lang.Object obj46 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                if (obj46 == null) {
                                    java.lang.Class cls44 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 51, (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2713, (char) android.view.View.MeasureSpec.getSize(0));
                                    byte[] bArr12 = $$d;
                                    byte b116 = bArr12[16];
                                    byte b117 = bArr12[14];
                                    java.lang.Object[] objArr173 = new java.lang.Object[1];
                                    d(b116, b117, (short) (b117 & 653), objArr173);
                                    obj46 = cls44.getMethod((java.lang.String) objArr173[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj46);
                                }
                                ((int[]) objArr171[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj46).invoke(null, objArr172)).intValue();
                                return objArr171;
                            }
                            java.lang.Object obj47 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1411285061);
                            if (obj47 == null) {
                                java.lang.Class cls45 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.graphics.Color.red(0), 3196 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) (android.graphics.Color.rgb(0, 0, 0) + 16777216));
                                java.lang.Object[] objArr174 = new java.lang.Object[1];
                                d((byte) (-$$d[14]), r6[23], androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_ID, objArr174);
                                obj47 = cls45.getMethod((java.lang.String) objArr174[0], null);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1411285061, obj47);
                            }
                            long longValue20 = ((java.lang.Long) ((java.lang.reflect.Method) obj47).invoke(null, null)).longValue();
                            long j54 = ~longValue20;
                            long j55 = j31 | 1975065401;
                            long j56 = ((242 * longValue20) - 953956589166L) + (((~(j54 | 1975065401)) | (~j55)) * (-241)) + (((-1975065402) | longValue20) * (-482)) + (((~((-1975065402) | j54)) | (~(longValue20 | j55))) * 241) + 2071310763;
                            if (((((int) j56) & (((100017116 | i) * (-859)) + 515360134 + (((~(100017116 | i8)) | (~((-72745561) | i))) * 859) + (((~(1537243526 | i8)) | (-1609989087)) * 859))) | (((int) (j56 >> 32)) & (((~((-1159831889) | i8)) * 433) + 2010073118 + (((~((-272915504) | i)) | (-1164310908)) * (-433)) + (((~((-1164310908) | i)) | (-1432747392)) * 433)))) != 0) {
                                java.lang.Object[] objArr175 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE}, null, new int[1]};
                                java.lang.Object[] objArr176 = {-579990794, 16, java.lang.Integer.valueOf(((i8 | (-2094)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) + 73188871 + (((~(422958674 | i8)) | (-136596016)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE))};
                                java.lang.Object obj48 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                if (obj48 == null) {
                                    java.lang.Class cls46 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.os.Process.myPid() >> 22), android.view.KeyEvent.getDeadChar(0, 0) + 2713, (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16));
                                    byte[] bArr13 = $$d;
                                    byte b118 = bArr13[16];
                                    byte b119 = bArr13[14];
                                    java.lang.Object[] objArr177 = new java.lang.Object[1];
                                    d(b118, b119, (short) (b119 & 653), objArr177);
                                    obj48 = cls46.getMethod((java.lang.String) objArr177[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj48);
                                }
                                ((int[]) objArr175[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj48).invoke(null, objArr176)).intValue();
                                return objArr175;
                            }
                            java.lang.Object obj49 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(502613909);
                            if (obj49 == null) {
                                java.lang.Class cls47 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 40, (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 3197, (char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1));
                                byte b120 = $$d[14];
                                byte b121 = (byte) (b120 + 1);
                                byte b122 = b120;
                                java.lang.Object[] objArr178 = new java.lang.Object[1];
                                d(b121, b122, (short) (b122 + 1), objArr178);
                                obj49 = cls47.getMethod((java.lang.String) objArr178[0], null);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(502613909, obj49);
                            }
                            long longValue21 = ((java.lang.Long) ((java.lang.reflect.Method) obj49).invoke(null, null)).longValue();
                            long j57 = j31 | (-1024093666);
                            long j58 = ((-494) * longValue21) + 505902271004L + ((~((-1024093666) | longValue21)) * (-495)) + (495 * j57) + (((~((~longValue21) | 1024093665)) | (~j57)) * 495) + 1976963556;
                            int i23 = (int) (j58 >> 32);
                            int i24 = (int) j58;
                            int i25 = ~((-1621580524) | i8);
                            if (((i23 & (((((-797571822) | i) * (-859)) - 618468600) + (((~((-797571822) | i8)) | (~(2144075759 | i))) * 859) + (((~(2060169063 | i8)) | 83906696) * 859))) | (i24 & (((((151520512 | i25) | (~(1621580523 | i))) * (-338)) - 1762900907) + ((i25 | (~(1773101035 | i))) * 338)))) != 0) {
                                java.lang.Object[] objArr179 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE}, null, new int[1]};
                                java.lang.Object[] objArr180 = {-579990794, 16, java.lang.Integer.valueOf(((((~((-69484718) | i8)) | (~((-26422275) | i8))) * (-184)) - 957551097) + (((~((-376193982) | i8)) | 306709264 | (~((-333131539) | i8))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) + 1066946888)};
                                java.lang.Object obj50 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                if (obj50 == null) {
                                    java.lang.Class cls48 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 51, 2713 - android.text.TextUtils.getOffsetBefore(str, 0), (char) ((-1) - android.widget.ExpandableListView.getPackedPositionChild(0L)));
                                    byte[] bArr14 = $$d;
                                    byte b123 = bArr14[16];
                                    byte b124 = bArr14[14];
                                    java.lang.Object[] objArr181 = new java.lang.Object[1];
                                    d(b123, b124, (short) (b124 & 653), objArr181);
                                    obj50 = cls48.getMethod((java.lang.String) objArr181[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj50);
                                }
                                ((int[]) objArr179[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj50).invoke(null, objArr180)).intValue();
                                return objArr179;
                            }
                            java.lang.Object obj51 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1293945309);
                            if (obj51 == null) {
                                java.lang.Class cls49 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), android.graphics.ImageFormat.getBitsPerPixel(0) + 2837, (char) android.view.View.MeasureSpec.getSize(0));
                                byte b125 = $$d[14];
                                byte b126 = (byte) (b125 + 1);
                                byte b127 = b125;
                                java.lang.Object[] objArr182 = new java.lang.Object[1];
                                d(b126, b127, (short) (b127 + 1), objArr182);
                                obj51 = cls49.getMethod((java.lang.String) objArr182[0], null);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1293945309, obj51);
                            }
                            long longValue22 = ((java.lang.Long) ((java.lang.reflect.Method) obj51).invoke(null, null)).longValue();
                            long j59 = ~longValue22;
                            long j60 = 758086354 | j59;
                            long j61 = j31 | (-758086355);
                            long j62 = (((((569 * longValue22) - 431351135995L) + ((((~j60) | (~(j31 | 758086354))) | (~(j59 | j31))) * (-1136))) + ((((~(j3 | 758086354)) | (~(j59 | j3))) | (~(j61 | longValue22))) * (-568))) + ((((~j61) | (~(j31 | longValue22))) | (~(j60 | j3))) * 568)) - 48208400;
                            if (((((int) j62) & ((((((~((-1165263720) | i)) | 1147142758) | (~(1710598127 | i8))) * 886) - 1886364861) + (((~(1165263719 | i8)) | 1692477166) * (-1772)) + ((~(1692477166 | i8)) * 886))) | (((int) (j62 >> 32)) & ((((~(1147120150 | i8)) | 564133928 | (~((-1710620735) | i8))) * (-397)) + 1185788842 + ((564767272 | i) * 397)))) != 0) {
                                java.lang.Object[] objArr183 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE}, null, new int[1]};
                                java.lang.Object[] objArr184 = {-579990794, 16, java.lang.Integer.valueOf((((~((-21434406) | i)) | android.R.color.system_neutral1_600) * (-140)) + 1823321137 + ((~((-4263937) | i)) * 70) + (((~(i | 730759925)) | (-717853393)) * 70))};
                                java.lang.Object obj52 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                if (obj52 == null) {
                                    java.lang.Class cls50 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.os.Process.myPid() >> 22), 2713 - android.view.Gravity.getAbsoluteGravity(0, 0), (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16));
                                    byte[] bArr15 = $$d;
                                    byte b128 = bArr15[16];
                                    byte b129 = bArr15[14];
                                    java.lang.Object[] objArr185 = new java.lang.Object[1];
                                    d(b128, b129, (short) (b129 & 653), objArr185);
                                    obj52 = cls50.getMethod((java.lang.String) objArr185[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj52);
                                }
                                ((int[]) objArr183[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj52).invoke(null, objArr184)).intValue();
                                return objArr183;
                            }
                            long[] jArr3 = {624887784092251L};
                            java.lang.Object[] objArr186 = new java.lang.Object[1];
                            e("\u0004\u0017\u0014\u000b\u0017\u0002\u0006\u0010\t\u000f\u0000\u0001\u0006\u0014\"\f㘀", 17 - android.text.TextUtils.getTrimmedLength(str), (byte) (23 - android.text.TextUtils.indexOf(str, str, 0)), objArr186);
                            java.lang.Object[] objArr187 = {((java.lang.String) objArr186[0]).intern(), 3, 2251799813685247L, jArr3};
                            java.lang.Object obj53 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1441749806);
                            if (obj53 == null) {
                                java.lang.Class cls51 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(37 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), android.text.TextUtils.getOffsetBefore(str, 0) + 3096, (char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1));
                                byte b130 = $$d[14];
                                byte b131 = (byte) (b130 + 1);
                                byte b132 = b130;
                                java.lang.Object[] objArr188 = new java.lang.Object[1];
                                d(b131, b132, (short) (b132 + 1), objArr188);
                                obj53 = cls51.getMethod((java.lang.String) objArr188[0], java.lang.String.class, java.lang.Integer.TYPE, java.lang.Long.TYPE, long[].class);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1441749806, obj53);
                            }
                            long longValue23 = ((java.lang.Long) ((java.lang.reflect.Method) obj53).invoke(null, objArr187)).longValue();
                            long j63 = ~longValue23;
                            long j64 = ((((((-163) * longValue23) - 33192416070L) + (((~(j31 | longValue23)) | (-201166158)) * (-328))) + ((j3 | (-201166158)) * 164)) + (((~(longValue23 | (j31 | (-201166158)))) | ((~(j63 | j3)) | (~(201166157 | j63)))) * 164)) - 1709481752;
                            if (((((int) (j64 >> 32)) & (((((~((-268435723) | i8)) | (~((-84557825) | i8))) * (-184)) - 1019427974) + (((~(1336931493 | i8)) | (-1605367216) | (~(1520809391 | i8))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) + 1491478704)) | (((int) j64) & (((((-2011158459) | r6) * (-814)) - 2133275568) + (((~(555663624 | i)) | (~(1992890034 | i8)) | 537395200) * 407) + (((~((-555663625) | i)) | 537395200 | (~((-1992890035) | i))) * 407)))) != 0) {
                                valueOf = (AlternateContactlessPaymentDataJson + 31) % 128;
                                java.lang.Object[] objArr189 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_SOLID_VALUE}, null, new int[1]};
                                int i26 = ~(i | 769262966);
                                java.lang.Object[] objArr190 = {-579990794, 16, java.lang.Integer.valueOf((((-776509393) | i26) * (-658)) + 864801915 + ((i26 | (-802854903)) * 658))};
                                java.lang.Object obj54 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                if (obj54 == null) {
                                    java.lang.Class cls52 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 2713, (char) (android.os.Process.myTid() >> 22));
                                    byte[] bArr16 = $$d;
                                    byte b133 = bArr16[16];
                                    byte b134 = bArr16[14];
                                    java.lang.Object[] objArr191 = new java.lang.Object[1];
                                    d(b133, b134, (short) (b134 & 653), objArr191);
                                    obj54 = cls52.getMethod((java.lang.String) objArr191[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj54);
                                }
                                ((int[]) objArr189[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj54).invoke(null, objArr190)).intValue();
                                return objArr189;
                            }
                            java.lang.Object[] objArr192 = new java.lang.Object[1];
                            f(11 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), true, "\u0007\u0005\u0017\u0018ￍ\u0014\u0003\u0002ￍ\t\u0011", (android.os.Process.myTid() >> 22) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_CONFIRMED_VALUE, 9 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr192);
                            java.lang.Object[] objArr193 = {((java.lang.String) objArr192[0]).intern()};
                            java.lang.Object obj55 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1161224381);
                            if (obj55 == null) {
                                java.lang.Class cls53 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), 3160 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) ((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 33099));
                                byte b135 = $$d[14];
                                byte b136 = (byte) (b135 + 1);
                                byte b137 = b135;
                                java.lang.Object[] objArr194 = new java.lang.Object[1];
                                d(b136, b137, (short) (b137 + 1), objArr194);
                                obj55 = cls53.getMethod((java.lang.String) objArr194[0], java.lang.String.class);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1161224381, obj55);
                            }
                            long longValue24 = ((java.lang.Long) ((java.lang.reflect.Method) obj55).invoke(null, objArr193)).longValue();
                            long j65 = ~longValue24;
                            long j66 = ~(287785228 | j65);
                            long j67 = ((((((-445) * longValue24) + 128064426905L) + (((~(j65 | j31)) | j66) * 446)) + (((~(longValue24 | 287785228)) | (~((j65 | (-287785229)) | j3))) * 446)) + (j66 * 446)) - 1049882879;
                            if (((((int) (j67 >> 32)) & (((((~((-2099137105) | i8)) | (-661910694)) * (-235)) - 1047174058) + (((~((-2099137105) | i)) | (-661910694)) * (-470)) + (((~((-621953025) | i)) | (-2139094774)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE))) | (((int) j67) & ((((~(501418783 | i8)) * 979) - 1502141404) + (((-935807627) | i) * (-979)) + (((~(501418783 | i)) | (~((-935807627) | i8))) * 979)))) != 0) {
                                java.lang.Object[] objArr195 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_REPORT_CIRCLE_SOLID_VALUE}, null, new int[1]};
                                java.lang.Object[] objArr196 = {-579990794, 16, java.lang.Integer.valueOf((((~((-432538461) | i8)) | 276787059) * (-602)) + 1176468073 + (((~(i | (-432538461))) | 273154896 | (~(436170623 | i8))) * (-301)) + ((~(276787059 | i8)) * 301))};
                                java.lang.Object obj56 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                if (obj56 == null) {
                                    java.lang.Class cls54 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.green(0) + 50, (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 2713, (char) (android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1));
                                    byte[] bArr17 = $$d;
                                    byte b138 = bArr17[16];
                                    byte b139 = bArr17[14];
                                    java.lang.Object[] objArr197 = new java.lang.Object[1];
                                    d(b138, b139, (short) (b139 & 653), objArr197);
                                    obj56 = cls54.getMethod((java.lang.String) objArr197[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj56);
                                }
                                ((int[]) objArr195[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj56).invoke(null, objArr196)).intValue();
                                return objArr195;
                            }
                            AlternateContactlessPaymentDataJson = (valueOf + 87) % 128;
                            java.lang.Object obj57 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(236031171);
                            if (obj57 == null) {
                                java.lang.Class cls55 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 29, 2186 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (android.os.Process.getGidForName(str) + 59514));
                                byte b140 = $$d[14];
                                byte b141 = (byte) (b140 + 1);
                                byte b142 = b140;
                                java.lang.Object[] objArr198 = new java.lang.Object[1];
                                d(b141, b142, (short) (b142 + 1), objArr198);
                                obj57 = cls55.getMethod((java.lang.String) objArr198[0], null);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(236031171, obj57);
                            }
                            long longValue25 = ((java.lang.Long) ((java.lang.reflect.Method) obj57).invoke(null, null)).longValue();
                            long j68 = ~longValue25;
                            long j69 = (((((longValue25 * (-858)) + 985058441120L) + ((j3 | 1145416792) * (-859))) + (((~((j68 | (-1145416793)) | j3)) | (~(j31 | 1145416792))) * 859)) + (((~(j68 | j31)) | (~(j68 | 1145416792))) * 859)) - 2017507378;
                            if (((((int) (j69 >> 32)) & (((((-11179590) | i8) * (-490)) - 283471254) + (((~((-352228966) | i)) | 341049376) * 490) + 927196164)) | (((int) j69) & ((((~((-1781834456) | i8)) | 705994881) * 98) + 1216463653 + (((~((-1075906431) | i8)) | (-1781834456) | (~(1075906430 | i))) * (-49)) + (((~((-1781834456) | i)) | (-1781901312)) * 49)))) != 0) {
                                java.lang.Object[] objArr199 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE}, null, new int[1]};
                                int i27 = ~(605642952 | i8);
                                java.lang.Object[] objArr200 = {-579990794, 16, java.lang.Integer.valueOf((((~((-605642953) | i)) | (~(103682567 | i8)) | i27) * (-516)) + 2022846419 + (((~(i | (-67633153))) | (~((-36049416) | i8))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR) + ((36049415 | i27) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR))};
                                java.lang.Object obj58 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                if (obj58 == null) {
                                    java.lang.Class cls56 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.getDefaultSize(0, 0) + 50, 2712 - android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16));
                                    byte[] bArr18 = $$d;
                                    byte b143 = bArr18[16];
                                    byte b144 = bArr18[14];
                                    java.lang.Object[] objArr201 = new java.lang.Object[1];
                                    d(b143, b144, (short) (b144 & 653), objArr201);
                                    obj58 = cls56.getMethod((java.lang.String) objArr201[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj58);
                                }
                                ((int[]) objArr199[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj58).invoke(null, objArr200)).intValue();
                                return objArr199;
                            }
                            java.lang.Object obj59 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1050293330);
                            if (obj59 == null) {
                                java.lang.Class cls57 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(37 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 2972 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                                byte b145 = $$d[14];
                                byte b146 = (byte) (b145 + 1);
                                byte b147 = b145;
                                java.lang.Object[] objArr202 = new java.lang.Object[1];
                                d(b146, b147, (short) (b147 + 1), objArr202);
                                obj59 = cls57.getMethod((java.lang.String) objArr202[0], null);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1050293330, obj59);
                            }
                            long longValue26 = ((java.lang.Long) ((java.lang.reflect.Method) obj59).invoke(null, null)).longValue();
                            long j70 = ~longValue26;
                            long j71 = (((((984 * longValue26) + 3363938869770L) + ((j70 | (-1711928178)) * 983)) + (((~(j70 | j31)) | 1711928177) * (-983))) + (((~(longValue26 | 1711928177)) | (~(j31 | 1711928177))) * 983)) - 140773586;
                            int i28 = (-1409652493) | i8;
                            if (((((int) (j71 >> 32)) & (((((1644336845 | i8) * 1324) - 818884594) + (((~(1929551581 | i)) | (~((-492325171) | i))) * (-1324))) - 1592420000)) | (((int) j71) & ((i28 * 495) + 1171467974 + (((~i28) | (-1436925854)) * 495)))) != 0) {
                                java.lang.Object[] objArr203 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE}, null, new int[1]};
                                java.lang.Object[] objArr204 = {-579990794, 16, java.lang.Integer.valueOf((((17178638 | i8) * (-192)) - 539128305) + (((~(51328574 | i8)) | 743475456) * (-384)) + (((~(i | (-743475457))) | (~(794804030 | i8)) | (~((-34149937) | i))) * 192))};
                                java.lang.Object obj60 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                if (obj60 == null) {
                                    java.lang.Class cls58 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 49, (android.view.KeyEvent.getMaxKeyCode() >> 16) + 2713, (char) android.graphics.Color.blue(0));
                                    byte[] bArr19 = $$d;
                                    byte b148 = bArr19[16];
                                    byte b149 = bArr19[14];
                                    java.lang.Object[] objArr205 = new java.lang.Object[1];
                                    d(b148, b149, (short) (b149 & 653), objArr205);
                                    obj60 = cls58.getMethod((java.lang.String) objArr205[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj60);
                                }
                                ((int[]) objArr203[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj60).invoke(null, objArr204)).intValue();
                                return objArr203;
                            }
                            java.lang.Object obj61 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1827153043);
                            if (obj61 == null) {
                                java.lang.Class cls59 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 26, 2158 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) (56399 - android.graphics.ImageFormat.getBitsPerPixel(0)));
                                byte b150 = $$d[14];
                                byte b151 = (byte) (b150 + 1);
                                byte b152 = b150;
                                java.lang.Object[] objArr206 = new java.lang.Object[1];
                                d(b151, b152, (short) (b152 + 1), objArr206);
                                obj61 = cls59.getMethod((java.lang.String) objArr206[0], null);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1827153043, obj61);
                            }
                            long longValue27 = ((java.lang.Long) ((java.lang.reflect.Method) obj61).invoke(null, null)).longValue();
                            long j72 = ~longValue27;
                            long j73 = ~(j31 | 1498426492 | longValue27);
                            long j74 = (((((471 * longValue27) + 705758877732L) + ((longValue27 | 1498426492) * (-470))) + ((((~(j72 | j3)) | (~((-1498426493) | j72))) | j73) * (-470))) + (((~((1498426492 | j72) | j3)) | j73) * 470)) - 2064244512;
                            if (((((int) j74) & ((((((~((-1113063435) | i)) | (~(1744677451 | i))) * 69) + 1408776528) + ((((~((-1138264139) | i)) | 25200704) | (~(1719476747 | i))) * (-69))) - 1107154363)) | (((int) (j74 >> 32)) & ((((~((-780631814) | i)) | (-2077109072)) * 56) + 1259220834 + (((~((-2077109072) | i8)) | (-780631814)) * 56)))) != 0) {
                                java.lang.Object[] objArr207 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PERSON_CIRCLE_SOLID_VALUE}, null, new int[1]};
                                java.lang.Object[] objArr208 = {-579990794, 16, java.lang.Integer.valueOf((((~((-685573944) | i8)) | (~(704606143 | i))) * (-831)) + 927898608 + ((~((-680854568) | i)) * (-1662)) + (((~(i | 23751576)) | (~((-23751577) | i8)) | (~(685573943 | i))) * 831))};
                                java.lang.Object obj62 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                if (obj62 == null) {
                                    java.lang.Class cls60 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.View.getDefaultSize(0, 0), 2714 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (android.view.ViewConfiguration.getTouchSlop() >> 8));
                                    byte[] bArr20 = $$d;
                                    byte b153 = bArr20[16];
                                    byte b154 = bArr20[14];
                                    java.lang.Object[] objArr209 = new java.lang.Object[1];
                                    d(b153, b154, (short) (b154 & 653), objArr209);
                                    obj62 = cls60.getMethod((java.lang.String) objArr209[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj62);
                                }
                                ((int[]) objArr207[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj62).invoke(null, objArr208)).intValue();
                                return objArr207;
                            }
                            java.lang.Object obj63 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(887063382);
                            if (obj63 == null) {
                                java.lang.Class cls61 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(35 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (android.os.Process.myTid() >> 22) + 838, (char) android.view.KeyEvent.keyCodeFromString(str));
                                byte b155 = $$d[14];
                                byte b156 = (byte) (b155 + 1);
                                byte b157 = b155;
                                java.lang.Object[] objArr210 = new java.lang.Object[1];
                                d(b156, b157, (short) (b157 + 1), objArr210);
                                obj63 = cls61.getMethod((java.lang.String) objArr210[0], null);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(887063382, obj63);
                            }
                            long j75 = ~((java.lang.Long) ((java.lang.reflect.Method) obj63).invoke(null, null)).longValue();
                            long j76 = ((r4 * 949) - 290060543004L) + (((~(j75 | j3)) | (-306294133)) * (-948)) + ((~((-306294133) | j75 | j31)) * (-948)) + ((j75 | 306294132) * 948) + 1654458770;
                            int i29 = ((((int) j76) & (((((~((-267868196) | i8)) | 95574018) * (-160)) + 878952981) + (((~(1169358214 | i8)) | (-267868196)) * 160))) | (((int) (j76 >> 32)) & ((((((~((-2124115309) | i8)) | (~(686888897 | i))) | (~((-686888898) | i8))) * 959) + 78519445) + ((((~((-2124115309) | i)) | (~(686888897 | i8))) | (~((-686888898) | i))) * 959)))) != 0 ? i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_BANK_VALUE : i;
                            if (i29 != i) {
                                java.lang.Object[] objArr211 = {new int[]{i}, new int[]{i29}, null, new int[1]};
                                java.lang.Object[] objArr212 = {-579990794, 16, java.lang.Integer.valueOf((((((~(i | (-120034966))) | (-589290555)) * (-948)) - 1763341365) + ((~((-50828305) | i8)) * (-948))) - 1183406136)};
                                java.lang.Object obj64 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                if (obj64 == null) {
                                    java.lang.Class cls62 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), 2712 - android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (1 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))));
                                    byte[] bArr21 = $$d;
                                    byte b158 = bArr21[16];
                                    byte b159 = bArr21[14];
                                    java.lang.Object[] objArr213 = new java.lang.Object[1];
                                    d(b158, b159, (short) (b159 & 653), objArr213);
                                    obj64 = cls62.getMethod((java.lang.String) objArr213[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj64);
                                }
                                ((int[]) objArr211[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj64).invoke(null, objArr212)).intValue();
                                java.lang.Object[] objArr214 = {objArr211};
                                java.lang.Object obj65 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(712501173);
                                if (obj65 == null) {
                                    java.lang.Class cls63 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 52, 3236 - android.widget.ExpandableListView.getPackedPositionChild(0L), (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16));
                                    byte[] bArr22 = $$d;
                                    byte b160 = bArr22[16];
                                    byte b161 = bArr22[14];
                                    java.lang.Object[] objArr215 = new java.lang.Object[1];
                                    d(b160, b161, (short) (b161 & 653), objArr215);
                                    obj65 = cls63.getMethod((java.lang.String) objArr215[0], java.lang.Object[].class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(712501173, obj65);
                                }
                                ((java.lang.reflect.Method) obj65).invoke(obj, objArr214);
                                return objArr211;
                            }
                            java.lang.Object[] objArr216 = {java.lang.Integer.valueOf(i), obj, -579990794, 0};
                            java.lang.Object obj66 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(97317038);
                            if (obj66 == null) {
                                obj66 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 30, 3289 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16))).getDeclaredConstructor(java.lang.Integer.TYPE, (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(52 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), 3237 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (char) android.view.View.MeasureSpec.getMode(0)), java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(97317038, obj66);
                            }
                            java.lang.Object newInstance = ((java.lang.reflect.Constructor) obj66).newInstance(objArr216);
                            AlternateContactlessPaymentDataJson = (valueOf + 79) % 128;
                            try {
                                java.lang.Object[] objArr217 = new java.lang.Object[1];
                                e("\u001f\n\u001f\t\u0015\t\u0006\u001f\u001b\u0015\u0001\u0007\u0012\u0011\n\u0001", 17 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (byte) (android.text.TextUtils.indexOf(str, str, 0) + 34), objArr217);
                                java.lang.Class<?> cls64 = java.lang.Class.forName(((java.lang.String) objArr217[0]).intern());
                                java.lang.Object[] objArr218 = new java.lang.Object[1];
                                e("\u0010\u0016\u000b\u0013㗮", (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 5, (byte) android.view.KeyEvent.normalizeMetaState(0), objArr218);
                                cls64.getMethod(((java.lang.String) objArr218[0]).intern(), null).invoke(newInstance, null);
                                java.lang.Object[] objArr219 = {new int[]{i}, new int[]{i}, null, new int[1]};
                                java.lang.Object[] objArr220 = {-579990794, 0, java.lang.Integer.valueOf((((~(287941534 | i8)) | (~((-997267055) | i))) * (-370)) + 1166762493 + (((~(i | 287941534)) | (~((-997267055) | i8)) | 565648) * (-370)) + 209289760)};
                                java.lang.Object obj67 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                if (obj67 == null) {
                                    java.lang.Class cls65 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), 2714 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) android.view.KeyEvent.normalizeMetaState(0));
                                    byte[] bArr23 = $$d;
                                    byte b162 = bArr23[16];
                                    byte b163 = bArr23[14];
                                    java.lang.Object[] objArr221 = new java.lang.Object[1];
                                    d(b162, b163, (short) (b163 & 653), objArr221);
                                    obj67 = cls65.getMethod((java.lang.String) objArr221[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj67);
                                }
                                ((int[]) objArr219[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj67).invoke(null, objArr220)).intValue();
                                return objArr219;
                            } catch (java.lang.Throwable th7) {
                                java.lang.Throwable cause4 = th7.getCause();
                                if (cause4 != null) {
                                    throw cause4;
                                }
                                throw th7;
                            }
                        }
                    } catch (java.lang.Throwable th8) {
                        java.lang.Throwable cause5 = th8.getCause();
                        if (cause5 != null) {
                            throw cause5;
                        }
                        throw th8;
                    }
                }
            }
            i3 = 0;
            if (i3 == 0) {
            }
        } catch (java.lang.Throwable th9) {
            java.lang.Throwable cause6 = th9.getCause();
            if (cause6 != null) {
                throw cause6;
            }
            throw th9;
        }
    }

    static void init$0() {
        $$d = new byte[]{5, -77, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, -4, -45, -10, 13, -15, 2, com.google.common.base.Ascii.VT, -21, 13, 32, -46, -1, -8, 17, -4, -19, 6, 5, com.visa.cbp.getEncExpo.onUnminimized, -2, 33, -19, -26, 10, 6, -11, -8, 46, -31, -21, 17, com.google.common.base.Ascii.NAK, -43, 2, -1, -15, 10};
        $$e = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE;
    }
}
