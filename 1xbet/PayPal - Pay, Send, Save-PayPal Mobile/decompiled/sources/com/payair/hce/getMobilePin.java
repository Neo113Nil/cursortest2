package com.payair.hce;

/* loaded from: classes4.dex */
public class getMobilePin extends com.payair.hce.getReasonCode<com.payair.hce.transactionCanBeResumed> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char[] AlternateContactlessPaymentDataJson;
    private static boolean DigitizedCardProfile;
    private static int getAid;
    private static int getProfileVersion;
    private static int valueOf;
    private static boolean values;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:4:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, short s, int i2, java.lang.Object[] objArr) {
        int i3;
        int i4 = 118 - (i2 * 3);
        int i5 = 3 - (s * 4);
        int i6 = i * 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i6];
        if (bArr == null) {
            int i7 = i4;
            int i8 = 0;
            int i9 = i5;
            int i10 = i5 + i7;
            i3 = i8;
            int i11 = i9;
            i4 = i10;
            i5 = i11;
            bArr2[i3] = (byte) i4;
            i8 = i3 + 1;
            if (i3 == 0 - i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i12 = i5 + 1;
            int i13 = i4;
            i9 = i12;
            i5 = bArr[i12];
            i7 = i13;
            int i102 = i5 + i7;
            i3 = i8;
            int i112 = i9;
            i4 = i102;
            i5 = i112;
            bArr2[i3] = (byte) i4;
            i8 = i3 + 1;
            if (i3 == 0 - i6) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i4;
            i8 = i3 + 1;
            if (i3 == 0 - i6) {
            }
        }
    }

    /* synthetic */ getMobilePin(byte b) {
        this();
    }

    @Override // com.payair.hce.getReasonCode
    public final com.payair.hce.transactionCanBeResumed valueOf() {
        getProfileVersion = (getAid + 33) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(127 - android.view.View.getDefaultSize(0, 0), null, null, "\u0084\u0083\u0082\u0081", objArr);
        com.payair.hce.transactionCanBeResumed values2 = com.payair.hce.transactionCanBeResumed.values(((java.lang.String) objArr[0]).intern());
        getProfileVersion = (getAid + 89) % 128;
        return values2;
    }

    private getMobilePin() {
    }

    public static com.payair.hce.setMobilePin<com.payair.hce.transactionCanBeResumed> DigitizedCardProfile() {
        com.payair.hce.setMobilePin<com.payair.hce.transactionCanBeResumed> setmobilepin = new com.payair.hce.setMobilePin<com.payair.hce.transactionCanBeResumed>() { // from class: com.payair.hce.getMobilePin.4
            private static int DigitizedCardProfile = 1;
            private static int writeReplace;

            public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr, int i, int i2, int i3) {
                com.payair.hce.getMobilePin getmobilepin = new com.payair.hce.getMobilePin((byte) 0);
                int i4 = writeReplace;
                int i5 = i4 ^ 13;
                int i6 = ((i4 & 13) | i5) << 1;
                int i7 = -i5;
                DigitizedCardProfile = (((i6 | i7) << 1) - (i6 ^ i7)) % 128;
                return getmobilepin;
            }

            @Override // com.payair.hce.setMobilePin
            public final com.payair.hce.getReasonCode<com.payair.hce.transactionCanBeResumed> valueOf() {
                return (com.payair.hce.getReasonCode) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -2134642144, 2134642144, java.lang.System.identityHashCode(this));
            }
        };
        getProfileVersion = (getAid + 35) % 128;
        return setmobilepin;
    }

    @Override // com.payair.hce.getReasonCode
    public final void valueOf(com.payair.hce.transactionCanBeResumed transactioncanberesumed) throws com.payair.hce.postToastMessageOnUi {
        getProfileVersion = (getAid + 107) % 128;
        super.valueOf(transactioncanberesumed);
        super.AlternateContactlessPaymentDataJson(transactioncanberesumed);
        getAid = (getProfileVersion + 49) % 128;
    }

    private static void a(int i, int[] iArr, java.lang.String str, java.lang.String str2, java.lang.Object[] objArr) {
        java.lang.String str3 = str2;
        byte[] bArr = str3;
        if (str3 != null) {
            bArr = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getUmdGeneration getumdgeneration = new com.payair.hce.getUmdGeneration();
        char[] cArr = AlternateContactlessPaymentDataJson;
        int i2 = 2;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i3 = 0;
            while (i3 < length) {
                int i4 = $11 + 67;
                $10 = i4 % 128;
                if (i4 % i2 != 0) {
                    try {
                        java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i3])};
                        java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54185069);
                        if (obj == null) {
                            obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 46, (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_DARK_APPEARANCE_VALUE, (char) ((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 46337))).getMethod("y", java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54185069, obj);
                        }
                        cArr2[i3] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                        i3 >>>= 1;
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(cArr[i3])};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54185069);
                    if (obj2 == null) {
                        obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 46, 286 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (46337 - (android.os.Process.myPid() >> 22)))).getMethod("y", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54185069, obj2);
                    }
                    cArr2[i3] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).charValue();
                    i3++;
                }
                $11 = ($10 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                i2 = 2;
            }
            cArr = cArr2;
        }
        java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(valueOf)};
        java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54214860);
        if (obj3 == null) {
            obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(46 - android.view.KeyEvent.keyCodeFromString(""), android.view.KeyEvent.getDeadChar(0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_DARK_APPEARANCE_VALUE, (char) (46336 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)))).getMethod("x", java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54214860, obj3);
        }
        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).intValue();
        if (DigitizedCardProfile) {
            $11 = ($10 + 73) % 128;
            getumdgeneration.values = bArr2.length;
            char[] cArr3 = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 0;
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                $10 = ($11 + 115) % 128;
                cArr3[getumdgeneration.valueOf] = (char) (cArr[bArr2[(getumdgeneration.values - 1) - getumdgeneration.valueOf] + i] - intValue);
                java.lang.Object[] objArr5 = {getumdgeneration, getumdgeneration};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
                if (obj4 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), 1629 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    b(0, (short) 0, 0, objArr6);
                    obj4 = cls.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr5);
            }
            objArr[0] = new java.lang.String(cArr3);
            return;
        }
        if (!values) {
            getumdgeneration.values = iArr.length;
            char[] cArr4 = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 0;
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                $10 = ($11 + 43) % 128;
                cArr4[getumdgeneration.valueOf] = (char) (cArr[iArr[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
                getumdgeneration.valueOf++;
            }
            objArr[0] = new java.lang.String(cArr4);
            return;
        }
        $10 = ($11 + 81) % 128;
        getumdgeneration.values = charArray.length;
        char[] cArr5 = new char[getumdgeneration.values];
        getumdgeneration.valueOf = 0;
        while (getumdgeneration.valueOf < getumdgeneration.values) {
            cArr5[getumdgeneration.valueOf] = (char) (cArr[charArray[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
            java.lang.Object[] objArr7 = {getumdgeneration, getumdgeneration};
            java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
            if (obj5 == null) {
                java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.green(0) + 43, (android.os.Process.myPid() >> 22) + 1629, (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)));
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                b(0, (short) 0, 0, objArr8);
                obj5 = cls2.getMethod((java.lang.String) objArr8[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj5);
            }
            ((java.lang.reflect.Method) obj5).invoke(null, objArr7);
        }
        java.lang.String str4 = new java.lang.String(cArr5);
        int i5 = $11 + 115;
        $10 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
        objArr[0] = str4;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getAid = 0;
        getProfileVersion = 1;
        AlternateContactlessPaymentDataJson = new char[]{10793, 10788, 10834, 10789};
        valueOf = -143185298;
        values = true;
        DigitizedCardProfile = true;
    }

    static void init$0() {
        $$a = new byte[]{com.visa.cbp.getEncExpo.IResultReceiver2, 75, 70, 2};
        $$b = 171;
    }
}
