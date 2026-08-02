package com.payair.hce;

/* loaded from: classes4.dex */
public final class onDeleteCardFailed {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char[] SdkCoreAlternateContactlessPaymentDataImpl;
    private static int SdkCoreBusinessLogicModuleImpl;
    private static boolean getAid;
    private static boolean getCiacDecline;
    private static char getCvrMaskAnd;
    private static char[] getGpoResponse;
    private static int getPaymentFci;
    private static int getProfileVersion;
    private byte[] AlternateContactlessPaymentDataJson;
    private com.payair.hce.getTokenPan DigitizedCardProfile;
    private byte[] IccPrivateKeyCrtComponentsJson;
    private byte[] RecordsJson;
    private byte[] valueOf;
    private java.lang.Byte values;
    private byte[] writeReplace;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Type inference failed for: r8v2, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, byte b2, short s, java.lang.Object[] objArr) {
        int i;
        int i2;
        ?? r8 = (s * 8) + 65;
        int i3 = 4 - (b2 * 2);
        byte[] bArr = $$a;
        int i4 = b * 2;
        byte[] bArr2 = new byte[1 - i4];
        if (bArr == null) {
            byte b3 = r8;
            i = 0;
            int i5 = i3;
            int i6 = i5 + 1;
            i2 = i3 + (-b3);
            i3 = i6;
            bArr2[i] = (byte) i2;
            if (i == 0 - i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            b3 = bArr[i3];
            i++;
            int i7 = i2;
            i5 = i3;
            i3 = i7;
            int i62 = i5 + 1;
            i2 = i3 + (-b3);
            i3 = i62;
            bArr2[i] = (byte) i2;
            if (i == 0 - i4) {
            }
        } else {
            i = 0;
            i2 = r8;
            bArr2[i] = (byte) i2;
            if (i == 0 - i4) {
            }
        }
    }

    public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i, int i2, int i3) {
        return valueOf(objArr);
    }

    public final byte[] values() {
        int i = SdkCoreBusinessLogicModuleImpl + 53;
        int i2 = i % 128;
        getPaymentFci = i2;
        if (i % 2 != 0) {
            throw null;
        }
        byte[] bArr = this.valueOf;
        int i3 = i2 + 59;
        SdkCoreBusinessLogicModuleImpl = i3 % 128;
        if (i3 % 2 != 0) {
            return bArr;
        }
        throw null;
    }

    public final byte[] AlternateContactlessPaymentDataJson() {
        int i = getPaymentFci + 85;
        SdkCoreBusinessLogicModuleImpl = i % 128;
        byte[] bArr = this.AlternateContactlessPaymentDataJson;
        if (i % 2 != 0) {
            return bArr;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.onDeleteCardFailed ondeletecardfailed = (com.payair.hce.onDeleteCardFailed) objArr[0];
        int i = getPaymentFci + 95;
        SdkCoreBusinessLogicModuleImpl = i % 128;
        java.lang.Byte b = ondeletecardfailed.values;
        if (i % 2 != 0) {
            return b;
        }
        throw null;
    }

    public final byte[] valueOf() {
        int i = SdkCoreBusinessLogicModuleImpl + 71;
        getPaymentFci = i % 128;
        byte[] bArr = this.writeReplace;
        if (i % 2 == 0) {
            return bArr;
        }
        throw new java.lang.ArithmeticException();
    }

    public final com.payair.hce.getTokenPan writeReplace() {
        int i = (getPaymentFci + 39) % 128;
        SdkCoreBusinessLogicModuleImpl = i;
        com.payair.hce.getTokenPan gettokenpan = this.DigitizedCardProfile;
        getPaymentFci = (i + 99) % 128;
        return gettokenpan;
    }

    public final byte[] RecordsJson() {
        int i = (getPaymentFci + 93) % 128;
        SdkCoreBusinessLogicModuleImpl = i;
        byte[] bArr = this.IccPrivateKeyCrtComponentsJson;
        getPaymentFci = (i + 27) % 128;
        return bArr;
    }

    public final byte[] IccPrivateKeyCrtComponentsJson() {
        int i = getPaymentFci + 119;
        SdkCoreBusinessLogicModuleImpl = i % 128;
        if (i % 2 != 0) {
            return this.RecordsJson;
        }
        throw null;
    }

    public final java.lang.String toString() {
        com.payair.hce.setMaximumPinTry.valueOf();
        android.view.View.resolveSizeAndState(0, 0, 0);
        android.view.ViewConfiguration.getEdgeSlop();
        android.view.MotionEvent.axisFromString("");
        new java.lang.Object[]{com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(this.valueOf).writeReplace()};
        android.graphics.drawable.Drawable.resolveOpacity(0, 0);
        new java.lang.Object[]{com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(this.AlternateContactlessPaymentDataJson).writeReplace()};
        android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
        android.os.Process.getElapsedCpuTime();
        new java.lang.Object[]{null};
        android.view.View.MeasureSpec.getSize(0);
        android.widget.ExpandableListView.getPackedPositionForChild(0, 0);
        new java.lang.Object[]{com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(this.writeReplace).writeReplace()};
        android.graphics.Color.blue(0);
        new java.lang.Object[]{this.DigitizedCardProfile};
        android.widget.ExpandableListView.getPackedPositionGroup(0L);
        android.view.ViewConfiguration.getJumpTapTimeout();
        new java.lang.Object[]{new com.payair.hce.onRequestSessionFailed(this.IccPrivateKeyCrtComponentsJson).DigitizedCardProfile()};
        android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        new java.lang.Object[]{null};
        android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
        android.view.View.resolveSizeAndState(0, 0, 0);
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("\u0014\u001d\u0017\u0014\u0011\u0019\u0017\u0001\u0005\u0014\u0014\u0003㙜", android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 13, (byte) (97 - (android.view.ViewConfiguration.getScrollBarSize() >> 8)), objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        SdkCoreBusinessLogicModuleImpl = (getPaymentFci + 121) % 128;
        return intern;
    }

    private static void a(java.lang.String str, int i, byte b, java.lang.Object[] objArr) {
        int i2;
        java.lang.Object obj;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.DigitizedCardJson12 digitizedCardJson12 = new com.payair.hce.DigitizedCardJson12();
        char[] cArr = getGpoResponse;
        java.lang.Object obj2 = null;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            $10 = ($11 + 81) % 128;
            for (int i3 = 0; i3 < length; i3++) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i3])};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
                    if (obj3 == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.view.View.MeasureSpec.getMode(0), 2508 - android.text.TextUtils.getCapsMode("", 0, 0), (char) (6802 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1))));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b((byte) 0, (byte) 0, (short) 0, objArr3);
                        obj3 = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj3);
                    }
                    cArr2[i3] = ((java.lang.Character) ((java.lang.reflect.Method) obj3).invoke(null, objArr2)).charValue();
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
        java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(getCvrMaskAnd)};
        java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
        if (obj4 == null) {
            java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 2508, (char) (android.widget.ExpandableListView.getPackedPositionGroup(0L) + 6802));
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            b((byte) 0, (byte) 0, (short) 0, objArr5);
            obj4 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj4);
        }
        char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj4).invoke(null, objArr4)).charValue();
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
                digitizedCardJson12.valueOf = charArray[digitizedCardJson12.values];
                digitizedCardJson12.writeReplace = charArray[digitizedCardJson12.values + 1];
                if (digitizedCardJson12.valueOf == digitizedCardJson12.writeReplace) {
                    cArr3[digitizedCardJson12.values] = (char) (digitizedCardJson12.valueOf - b);
                    cArr3[digitizedCardJson12.values + 1] = (char) (digitizedCardJson12.writeReplace - b);
                    obj = obj2;
                } else {
                    java.lang.Object[] objArr6 = {digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12};
                    java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1553139325);
                    if (obj5 == null) {
                        obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - android.view.View.resolveSize(0, 0), 3596 - android.graphics.Color.alpha(0), (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16))).getMethod(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1553139325, obj5);
                    }
                    if (((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(null, objArr6)).intValue() == digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl) {
                        $10 = ($11 + 35) % 128;
                        java.lang.Object[] objArr7 = {digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), java.lang.Integer.valueOf(charValue), digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12};
                        java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(737480198);
                        if (obj6 == null) {
                            java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 2665 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), (char) ((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 18889));
                            java.lang.Object[] objArr8 = new java.lang.Object[1];
                            b((byte) 0, (byte) 0, (short) 1, objArr8);
                            obj6 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(737480198, obj6);
                        }
                        obj = null;
                        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj6).invoke(null, objArr7)).intValue();
                        int i4 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                        int i5 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                        cArr3[digitizedCardJson12.values] = cArr[intValue];
                        cArr3[digitizedCardJson12.values + 1] = cArr[(i4 * charValue) + i5];
                    } else {
                        obj = null;
                        if (digitizedCardJson12.DigitizedCardProfile == digitizedCardJson12.AlternateContactlessPaymentDataJson) {
                            digitizedCardJson12.RecordsJson = ((digitizedCardJson12.RecordsJson + charValue) - 1) % charValue;
                            digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl = ((digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl + charValue) - 1) % charValue;
                            int i6 = digitizedCardJson12.DigitizedCardProfile;
                            int i7 = digitizedCardJson12.RecordsJson;
                            int i8 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                            int i9 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                            cArr3[digitizedCardJson12.values] = cArr[(i6 * charValue) + i7];
                            cArr3[digitizedCardJson12.values + 1] = cArr[(i8 * charValue) + i9];
                        } else {
                            int i10 = digitizedCardJson12.DigitizedCardProfile;
                            int i11 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                            int i12 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                            int i13 = digitizedCardJson12.RecordsJson;
                            cArr3[digitizedCardJson12.values] = cArr[(i10 * charValue) + i11];
                            cArr3[digitizedCardJson12.values + 1] = cArr[(i12 * charValue) + i13];
                            $11 = ($10 + 107) % 128;
                        }
                    }
                }
                digitizedCardJson12.values += 2;
                obj2 = obj;
            }
        }
        int i14 = 0;
        while (i14 < i) {
            int i15 = $11 + 49;
            $10 = i15 % 128;
            if (i15 % 2 != 0) {
                cArr3[i14] = (char) (cArr3[i14] ^ 31358);
                i14 += 18;
            } else {
                cArr3[i14] = (char) (cArr3[i14] ^ 13722);
                i14++;
            }
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getPaymentFci = 0;
        SdkCoreBusinessLogicModuleImpl = 1;
        SdkCoreAlternateContactlessPaymentDataImpl = new char[]{10760, 10814, 10773, 10772, 10989, 10801, 10990, 10991, 10804, 10987, 10976, 10977, 10780, 10808, 10984, 10768, 10782, 10980, 10986, 10769, 10832, 10770, 10753};
        getProfileVersion = -143185283;
        getAid = true;
        getCiacDecline = true;
        getGpoResponse = new char[]{12319, 12298, 12350, 12296, 12299, 12351, 12294, 12290, 12329, 12326, 12327, 12297, 12288, 12291, 12328, 12399, 12323, 12334, 12311, 12346, 12407, 12331, 12344, 12302, 12293, 12295, 12345, 12335, 12289, 12324, 12292, 12318, 12300, 12339, 12325, 12305};
        getCvrMaskAnd = (char) 1494;
    }

    static void init$0() {
        $$a = new byte[]{120, 91, -87, 14};
        $$b = 24;
    }

    public final java.lang.Byte DigitizedCardProfile() {
        return (java.lang.Byte) writeReplace(new java.lang.Object[]{this}, 724539993, -724539993, java.lang.System.identityHashCode(this));
    }
}
