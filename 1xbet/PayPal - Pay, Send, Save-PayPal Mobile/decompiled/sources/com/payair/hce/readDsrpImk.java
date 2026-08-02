package com.payair.hce;

/* loaded from: classes4.dex */
public class readDsrpImk extends com.payair.hce.getReasonCode<java.lang.Byte> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static boolean AlternateContactlessPaymentDataJson;
    private static boolean DigitizedCardProfile;
    private static int RecordsJson;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static int valueOf;
    private static char[] values;

    public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr, int i, int i2, int i3) {
        SdkCoreAlternateContactlessPaymentDataImpl = (RecordsJson + 61) % 128;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        b(127 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), null, null, "\u0084\u0083\u0082\u0081", objArr2);
        com.payair.hce.transactionCanBeResumed values2 = com.payair.hce.transactionCanBeResumed.values(((java.lang.String) objArr2[0]).intern());
        RecordsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 83) % 128;
        return values2;
    }

    private static void a(short s, short s2, short s3, java.lang.Object[] objArr) {
        byte[] bArr = $$a;
        int i = s * 3;
        int i2 = (s2 * 3) + 118;
        int i3 = (s3 * 3) + 4;
        byte[] bArr2 = new byte[1 - i];
        int i4 = -1;
        if (bArr == null) {
            i2 += -i3;
            i3++;
            i4 = -1;
        }
        while (true) {
            int i5 = i4 + 1;
            bArr2[i5] = (byte) i2;
            if (i5 == 0 - i) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i6 = i3;
            i2 += -bArr[i3];
            i3 = i6 + 1;
            i4 = i5;
        }
    }

    /* synthetic */ readDsrpImk(byte b) {
        this();
    }

    private readDsrpImk() {
    }

    public static com.payair.hce.setMobilePin<java.lang.Byte> writeReplace() {
        com.payair.hce.setMobilePin<java.lang.Byte> setmobilepin = new com.payair.hce.setMobilePin<java.lang.Byte>() { // from class: com.payair.hce.readDsrpImk.2
            private static int values = 1;
            private static int writeReplace;

            public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr, int i, int i2, int i3) {
                com.payair.hce.readDsrpImk readdsrpimk = new com.payair.hce.readDsrpImk((byte) 0);
                int i4 = values;
                writeReplace = ((i4 & 79) + (i4 | 79)) % 128;
                return readdsrpimk;
            }

            @Override // com.payair.hce.setMobilePin
            public final com.payair.hce.getReasonCode<java.lang.Byte> valueOf() {
                return (com.payair.hce.getReasonCode) values(new java.lang.Object[]{this}, -1611416661, 1611416661, java.lang.System.identityHashCode(this));
            }
        };
        SdkCoreAlternateContactlessPaymentDataImpl = (RecordsJson + 55) % 128;
        return setmobilepin;
    }

    @Override // com.payair.hce.getReasonCode
    public final void valueOf(com.payair.hce.transactionCanBeResumed transactioncanberesumed) throws com.payair.hce.postToastMessageOnUi {
        SdkCoreAlternateContactlessPaymentDataImpl = (RecordsJson + 107) % 128;
        super.valueOf(transactioncanberesumed);
        super.AlternateContactlessPaymentDataJson(java.lang.Byte.valueOf(transactioncanberesumed.AlternateContactlessPaymentDataJson(0)));
        int i = SdkCoreAlternateContactlessPaymentDataImpl + 65;
        RecordsJson = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean DigitizedCardProfile() {
        SdkCoreAlternateContactlessPaymentDataImpl = (RecordsJson + 101) % 128;
        return com.payair.hce.onRequestSessionCompleted.AlternateContactlessPaymentDataJson(((java.lang.Byte) this.writeReplace).byteValue(), 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean AlternateContactlessPaymentDataJson() {
        byte byteValue;
        int i;
        int i2 = SdkCoreAlternateContactlessPaymentDataImpl + 59;
        RecordsJson = i2 % 128;
        if (i2 % 2 != 0) {
            byteValue = ((java.lang.Byte) this.writeReplace).byteValue();
            i = 0;
        } else {
            byteValue = ((java.lang.Byte) this.writeReplace).byteValue();
            i = 1;
        }
        boolean AlternateContactlessPaymentDataJson2 = com.payair.hce.onRequestSessionCompleted.AlternateContactlessPaymentDataJson(byteValue, i);
        int i3 = RecordsJson + 83;
        SdkCoreAlternateContactlessPaymentDataImpl = i3 % 128;
        if (i3 % 2 != 0) {
            return AlternateContactlessPaymentDataJson2;
        }
        throw new java.lang.ArithmeticException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean values() {
        RecordsJson = (SdkCoreAlternateContactlessPaymentDataImpl + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        if ((((java.lang.Byte) this.writeReplace).byteValue() & 3) != 0) {
            RecordsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 65) % 128;
            return true;
        }
        int i = SdkCoreAlternateContactlessPaymentDataImpl + 47;
        RecordsJson = i % 128;
        if (i % 2 == 0) {
            return false;
        }
        throw null;
    }

    private static void b(int i, int[] iArr, java.lang.String str, java.lang.String str2, java.lang.Object[] objArr) {
        java.lang.String str3 = str2;
        int i2 = $10;
        $11 = (i2 + 113) % 128;
        byte[] bArr = str3;
        if (str3 != null) {
            $11 = (i2 + 125) % 128;
            bArr = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getUmdGeneration getumdgeneration = new com.payair.hce.getUmdGeneration();
        char[] cArr = values;
        char c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i3 = 0;
            while (i3 < length) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i3])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54185069);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson('^' - android.text.AndroidCharacter.getMirror(c), 286 - android.text.TextUtils.indexOf("", ""), (char) (46337 - (android.view.ViewConfiguration.getScrollBarSize() >> 8)))).getMethod("y", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54185069, obj);
                    }
                    cArr2[i3] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    i3++;
                    $10 = ($11 + 59) % 128;
                    c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
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
        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(valueOf)};
        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54214860);
        if (obj2 == null) {
            obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "", 0) + 46, 286 - (android.os.Process.myPid() >> 22), (char) ((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 46337))).getMethod("x", java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54214860, obj2);
        }
        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
        if (!DigitizedCardProfile) {
            if (!AlternateContactlessPaymentDataJson) {
                getumdgeneration.values = iArr.length;
                char[] cArr3 = new char[getumdgeneration.values];
                getumdgeneration.valueOf = 0;
                $11 = ($10 + 109) % 128;
                while (getumdgeneration.valueOf < getumdgeneration.values) {
                    cArr3[getumdgeneration.valueOf] = (char) (cArr[iArr[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
                    getumdgeneration.valueOf++;
                }
                java.lang.String str4 = new java.lang.String(cArr3);
                $11 = ($10 + 115) % 128;
                objArr[0] = str4;
                return;
            }
            $10 = ($11 + 19) % 128;
            getumdgeneration.values = charArray.length;
            char[] cArr4 = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 0;
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                cArr4[getumdgeneration.valueOf] = (char) (cArr[charArray[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
                java.lang.Object[] objArr4 = {getumdgeneration, getumdgeneration};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
                if (obj3 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 1629, (char) android.text.TextUtils.getOffsetAfter("", 0));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    a((short) 0, (short) 0, (short) 0, objArr5);
                    obj3 = cls.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr4);
            }
            objArr[0] = new java.lang.String(cArr4);
            return;
        }
        $10 = ($11 + 27) % 128;
        getumdgeneration.values = bArr2.length;
        char[] cArr5 = new char[getumdgeneration.values];
        getumdgeneration.valueOf = 0;
        while (getumdgeneration.valueOf < getumdgeneration.values) {
            int i4 = $11 + 103;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                cArr5[getumdgeneration.valueOf] = (char) (cArr[bArr2[(getumdgeneration.values >> 1) % getumdgeneration.valueOf] * i] >>> intValue);
                java.lang.Object[] objArr6 = {getumdgeneration, getumdgeneration};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
                if (obj4 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - android.text.TextUtils.getTrimmedLength(""), android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1581, (char) android.view.View.combineMeasuredStates(0, 0));
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    a((short) 0, (short) 0, (short) 0, objArr7);
                    obj4 = cls2.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
            } else {
                cArr5[getumdgeneration.valueOf] = (char) (cArr[bArr2[(getumdgeneration.values - 1) - getumdgeneration.valueOf] + i] - intValue);
                java.lang.Object[] objArr8 = {getumdgeneration, getumdgeneration};
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
                if (obj5 == null) {
                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 43, 1629 - android.view.View.resolveSize(0, 0), (char) android.text.TextUtils.getCapsMode("", 0, 0));
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    a((short) 0, (short) 0, (short) 0, objArr9);
                    obj5 = cls3.getMethod((java.lang.String) objArr9[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj5);
                }
                ((java.lang.reflect.Method) obj5).invoke(null, objArr8);
            }
        }
        objArr[0] = new java.lang.String(cArr5);
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        RecordsJson = 0;
        SdkCoreAlternateContactlessPaymentDataImpl = 1;
        values = new char[]{11088, 11055, 11102, 11052};
        valueOf = -143185047;
        AlternateContactlessPaymentDataJson = true;
        DigitizedCardProfile = true;
    }

    static void init$0() {
        $$a = new byte[]{41, 86, 91, 57};
        $$b = 148;
    }

    @Override // com.payair.hce.getReasonCode
    public final com.payair.hce.transactionCanBeResumed valueOf() {
        return (com.payair.hce.transactionCanBeResumed) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -923434423, 923434423, java.lang.System.identityHashCode(this));
    }
}
