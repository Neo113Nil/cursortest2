package com.payair.hce;

/* loaded from: classes4.dex */
public final class setImeOptions extends com.payair.hce.setJustificationMode {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static int AlternateContactlessPaymentDataJson;
    private static int IccPrivateKeyCrtComponentsJson;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static boolean getAid;
    private static char[] valueOf;
    private static boolean writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void i(byte b, byte b2, byte b3, java.lang.Object[] objArr) {
        int i;
        int i2;
        int i3 = (b2 * 2) + 4;
        int i4 = (b * 3) + 118;
        int i5 = (b3 * 2) + 1;
        byte[] bArr = $$d;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i6 = i3;
            i2 = 0;
            i4 += -i3;
            i3 = i6 + 1;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i6 = i3;
            i3 = bArr[i3];
            i4 += -i3;
            i3 = i6 + 1;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i5) {
            }
        } else {
            i = 0;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i5) {
            }
        }
    }

    public static com.payair.hce.setImeOptions AlternateContactlessPaymentDataJson(java.lang.Object obj) {
        if (obj != null) {
            int i = (IccPrivateKeyCrtComponentsJson + 121) % 128;
            SdkCoreAlternateContactlessPaymentDataImpl = i;
            if (!(obj instanceof com.payair.hce.setImeOptions)) {
                if (obj instanceof com.payair.hce.setTitle) {
                    com.payair.hce.setTitle settitle = (com.payair.hce.setTitle) obj;
                    com.payair.hce.setImeOptions setimeoptions = new com.payair.hce.setImeOptions(settitle.DigitizedCardProfile, settitle.values);
                    int i2 = IccPrivateKeyCrtComponentsJson + 47;
                    SdkCoreAlternateContactlessPaymentDataImpl = i2 % 128;
                    if (i2 % 2 != 0) {
                        return setimeoptions;
                    }
                    throw null;
                }
                if (!(obj instanceof byte[])) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    h(null, null, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 128, "\u0088\u008e\u0081\u0083\u0082\u008d\u008a\u008c\u0082\u008b\u008a\u0081\u0087\u0088\u0082\u0086\u0088\u008a\u0083\u0081\u0091\u0090\u0084\u0088\u008f\u008d\u0087\u0081\u008f\u008f\u0086", objArr);
                    sb.append(((java.lang.String) objArr[0]).intern());
                    sb.append(obj.getClass().getName());
                    throw new java.lang.IllegalArgumentException(sb.toString());
                }
                int i3 = i + 87;
                IccPrivateKeyCrtComponentsJson = i3 % 128;
                try {
                    if (i3 % 2 == 0) {
                        return (com.payair.hce.setImeOptions) writeReplace((byte[]) obj);
                    }
                    throw new java.lang.ArithmeticException();
                } catch (java.lang.Exception e) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    h(null, null, 127 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), "\u0088\u008e\u0081\u0083\u0082\u008d\u008a\u008c\u0082\u008b\u008a\u0081\u0087\u0088\u0082\u0086\u0088\u0089\u0084\u0089\u0089\u0081\u0088\u0087\u0082\u0086\u0085\u0084\u0083\u0082\u0081", objArr2);
                    sb2.append(((java.lang.String) objArr2[0]).intern());
                    sb2.append(e.toString());
                    throw new java.lang.IllegalArgumentException(sb2.toString());
                }
            }
        }
        return (com.payair.hce.setImeOptions) obj;
    }

    public setImeOptions(byte[] bArr, int i) {
        super(bArr, i);
    }

    @Override // com.payair.hce.setEms
    final boolean writeReplace() {
        IccPrivateKeyCrtComponentsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 115) % 128;
        return false;
    }

    @Override // com.payair.hce.setEms
    final int AlternateContactlessPaymentDataJson() {
        int i = SdkCoreAlternateContactlessPaymentDataImpl + 5;
        IccPrivateKeyCrtComponentsJson = i % 128;
        if (i % 2 == 0) {
            int length = this.DigitizedCardProfile.length + 1;
            return ((java.lang.Integer) com.payair.hce.setNavigationIcon.DigitizedCardProfile(new java.lang.Object[]{java.lang.Integer.valueOf(length)}, -1174070258, 1174070259, length)).intValue() + 1 + this.DigitizedCardProfile.length + 1;
        }
        int length2 = this.DigitizedCardProfile.length;
        int length3 = this.DigitizedCardProfile.length;
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.setJustificationMode, com.payair.hce.setEms
    final void values(com.payair.hce.setMaxLines setmaxlines) throws java.io.IOException {
        int i = SdkCoreAlternateContactlessPaymentDataImpl + 57;
        IccPrivateKeyCrtComponentsJson = i % 128;
        if (i % 2 != 0) {
            byte[] writeReplace2 = writeReplace(this.DigitizedCardProfile, this.values);
            int length = writeReplace2.length >> 1;
            byte[] bArr = new byte[length];
            bArr[1] = (byte) values();
            java.lang.System.arraycopy(writeReplace2, 0, bArr, 0, length << 1);
            setmaxlines.AlternateContactlessPaymentDataJson(2, bArr);
            return;
        }
        byte[] writeReplace3 = writeReplace(this.DigitizedCardProfile, this.values);
        int length2 = writeReplace3.length;
        byte[] bArr2 = new byte[length2 + 1];
        bArr2[0] = (byte) values();
        java.lang.System.arraycopy(writeReplace3, 0, bArr2, 1, length2);
        setmaxlines.AlternateContactlessPaymentDataJson(3, bArr2);
    }

    private static void h(int[] iArr, java.lang.String str, int i, java.lang.String str2, java.lang.Object[] objArr) {
        int i2;
        java.lang.String str3 = str2;
        byte[] bArr = str3;
        if (str3 != null) {
            byte[] bytes = str3.getBytes("ISO-8859-1");
            $11 = ($10 + 89) % 128;
            bArr = bytes;
        }
        byte[] bArr2 = bArr;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getUmdGeneration getumdgeneration = new com.payair.hce.getUmdGeneration();
        char[] cArr = valueOf;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            $11 = ($10 + 35) % 128;
            for (int i3 = 0; i3 < length; i3++) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i3])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54185069);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 46, 286 - android.graphics.Color.argb(0, 0, 0, 0), (char) (46337 - ((android.os.Process.getThreadPriority(0) + 20) >> 6)))).getMethod("y", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54185069, obj);
                    }
                    cArr2[i3] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
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
        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(AlternateContactlessPaymentDataJson)};
        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54214860);
        if (obj2 == null) {
            obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(46 - android.text.TextUtils.getTrimmedLength(""), android.text.TextUtils.getOffsetBefore("", 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_DARK_APPEARANCE_VALUE, (char) (46385 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)))).getMethod("x", java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54214860, obj2);
        }
        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
        if (getAid) {
            $11 = ($10 + 35) % 128;
            getumdgeneration.values = bArr2.length;
            char[] cArr3 = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 0;
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                int i4 = $10 + 13;
                $11 = i4 % 128;
                if (i4 % 2 == 0) {
                    cArr3[getumdgeneration.valueOf] = (char) (cArr[bArr2[getumdgeneration.values % getumdgeneration.valueOf] >>> i] << intValue);
                    java.lang.Object[] objArr4 = {getumdgeneration, getumdgeneration};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
                    if (obj3 == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), android.text.TextUtils.getOffsetBefore("", 0) + 1629, (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        i((byte) 0, (byte) 0, (byte) 0, objArr5);
                        obj3 = cls.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj3);
                    }
                    ((java.lang.reflect.Method) obj3).invoke(null, objArr4);
                } else {
                    cArr3[getumdgeneration.valueOf] = (char) (cArr[bArr2[(getumdgeneration.values - 1) - getumdgeneration.valueOf] + i] - intValue);
                    java.lang.Object[] objArr6 = {getumdgeneration, getumdgeneration};
                    java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
                    if (obj4 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), 1629 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1));
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        i((byte) 0, (byte) 0, (byte) 0, objArr7);
                        obj4 = cls2.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj4);
                    }
                    ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
                }
            }
            objArr[0] = new java.lang.String(cArr3);
            return;
        }
        if (!writeReplace) {
            getumdgeneration.values = iArr.length;
            char[] cArr4 = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 0;
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                int i5 = $10 + 27;
                $11 = i5 % 128;
                if (i5 % 2 == 0) {
                    cArr4[getumdgeneration.valueOf] = (char) (cArr[iArr[(getumdgeneration.values + 1) % getumdgeneration.valueOf] >> i] * intValue);
                    i2 = getumdgeneration.valueOf - 1;
                } else {
                    cArr4[getumdgeneration.valueOf] = (char) (cArr[iArr[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
                    i2 = getumdgeneration.valueOf + 1;
                }
                getumdgeneration.valueOf = i2;
            }
            objArr[0] = new java.lang.String(cArr4);
            return;
        }
        $10 = ($11 + 121) % 128;
        getumdgeneration.values = charArray.length;
        char[] cArr5 = new char[getumdgeneration.values];
        getumdgeneration.valueOf = 0;
        while (getumdgeneration.valueOf < getumdgeneration.values) {
            cArr5[getumdgeneration.valueOf] = (char) (cArr[charArray[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
            java.lang.Object[] objArr8 = {getumdgeneration, getumdgeneration};
            java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
            if (obj5 == null) {
                java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 44, 1628 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1));
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                i((byte) 0, (byte) 0, (byte) 0, objArr9);
                obj5 = cls3.getMethod((java.lang.String) objArr9[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj5);
            }
            ((java.lang.reflect.Method) obj5).invoke(null, objArr8);
        }
        objArr[0] = new java.lang.String(cArr5);
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        IccPrivateKeyCrtComponentsJson = 0;
        SdkCoreAlternateContactlessPaymentDataImpl = 1;
        valueOf = new char[]{10756, 10783, 10754, 10782, 10757, 10776, 10758, 10817, 10771, 10773, 10808, 10770, 10752, 10795, 10781, 10755, 10779};
        AlternateContactlessPaymentDataJson = -143185311;
        writeReplace = true;
        getAid = true;
    }

    static void init$0() {
        $$d = new byte[]{45, -88, -122, 76};
        $$e = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_QUESTION_VALUE;
    }
}
