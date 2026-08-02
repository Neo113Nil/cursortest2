package com.payair.hce;

/* loaded from: classes4.dex */
public class readContactlessImk extends com.payair.hce.getReasonCode<java.lang.String> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char AlternateContactlessPaymentDataJson;
    private static long DigitizedCardProfile;
    private static int IccPrivateKeyCrtComponentsJson;
    private static int valueOf;
    private static int values;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, int i, short s2, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = 3 - (s * 4);
        byte[] bArr = $$a;
        int i5 = i * 4;
        int i6 = s2 + 102;
        byte[] bArr2 = new byte[1 - i5];
        if (bArr == null) {
            int i7 = i4;
            int i8 = 0;
            i4 += i6;
            i3 = i7;
            i2 = i8;
            bArr2[i2] = (byte) i4;
            if (i2 == 0 - i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i9 = i3 + 1;
            int i10 = i2 + 1;
            i7 = i9;
            i6 = bArr[i9];
            i8 = i10;
            i4 += i6;
            i3 = i7;
            i2 = i8;
            bArr2[i2] = (byte) i4;
            if (i2 == 0 - i5) {
            }
        } else {
            i2 = 0;
            i3 = i4;
            i4 = i6;
            bArr2[i2] = (byte) i4;
            if (i2 == 0 - i5) {
            }
        }
    }

    /* synthetic */ readContactlessImk(byte b) {
        this();
    }

    @Override // com.payair.hce.getReasonCode
    public final com.payair.hce.transactionCanBeResumed valueOf() {
        java.lang.Object obj;
        int i = values + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        IccPrivateKeyCrtComponentsJson = i % 128;
        if (i % 2 == 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            a("\udb45ᕶ⢁\udb74", "ጄ풊｝蝤", "რ㸂䨊᧺", android.view.View.MeasureSpec.getMode(1), (char) (android.view.KeyEvent.getDeadChar(1, 0) + 64074), objArr);
            obj = objArr[0];
        } else {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            a("\udb45ᕶ⢁\udb74", "ጄ풊｝蝤", "რ㸂䨊᧺", android.view.View.MeasureSpec.getMode(0), (char) (android.view.KeyEvent.getDeadChar(0, 0) + 64074), objArr2);
            obj = objArr2[0];
        }
        return com.payair.hce.transactionCanBeResumed.values(((java.lang.String) obj).intern());
    }

    private readContactlessImk() {
        try {
            com.payair.hce.transactionCanBeResumed writeReplace = com.payair.hce.transactionCanBeResumed.writeReplace(2);
            super.valueOf(writeReplace);
            super.AlternateContactlessPaymentDataJson(writeReplace.writeReplace());
        } catch (com.payair.hce.postToastMessageOnUi unused) {
        }
    }

    public static com.payair.hce.setMobilePin<java.lang.String> DigitizedCardProfile() {
        com.payair.hce.setMobilePin<java.lang.String> setmobilepin = new com.payair.hce.setMobilePin<java.lang.String>() { // from class: com.payair.hce.readContactlessImk.1
            private static int AlternateContactlessPaymentDataJson = 0;
            private static int writeReplace = 1;

            public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
                com.payair.hce.readContactlessImk readcontactlessimk = new com.payair.hce.readContactlessImk((byte) 0);
                int i4 = writeReplace;
                int i5 = i4 & 25;
                AlternateContactlessPaymentDataJson = ((((i4 ^ 25) | i5) << 1) - ((i4 | 25) & (~i5))) % 128;
                return readcontactlessimk;
            }

            @Override // com.payair.hce.setMobilePin
            public final com.payair.hce.getReasonCode<java.lang.String> valueOf() {
                return (com.payair.hce.getReasonCode) DigitizedCardProfile(new java.lang.Object[]{this}, -11693930, 11693930, java.lang.System.identityHashCode(this));
            }
        };
        IccPrivateKeyCrtComponentsJson = (values + 19) % 128;
        return setmobilepin;
    }

    @Override // com.payair.hce.getReasonCode
    public final void valueOf(com.payair.hce.transactionCanBeResumed transactioncanberesumed) throws com.payair.hce.postToastMessageOnUi {
        values = (IccPrivateKeyCrtComponentsJson + 121) % 128;
        super.valueOf(transactioncanberesumed);
        super.AlternateContactlessPaymentDataJson(transactioncanberesumed.writeReplace());
        values = (IccPrivateKeyCrtComponentsJson + 117) % 128;
    }

    private static void a(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, char c, java.lang.Object[] objArr) {
        char[] cArr;
        char c2;
        $10 = ($11 + 61) % 128;
        char[] charArray = str3 != null ? str3.toCharArray() : str3;
        if (str2 != null) {
            cArr = str2.toCharArray();
            $11 = ($10 + 81) % 128;
        } else {
            cArr = str2;
        }
        char[] cArr2 = cArr;
        char[] charArray2 = str != null ? str.toCharArray() : str;
        com.payair.hce.getWalletData getwalletdata = new com.payair.hce.getWalletData();
        int length = charArray.length;
        char[] cArr3 = new char[length];
        int length2 = charArray2.length;
        char[] cArr4 = new char[length2];
        java.lang.System.arraycopy(charArray, 0, cArr3, 0, length);
        java.lang.System.arraycopy(charArray2, 0, cArr4, 0, length2);
        cArr3[0] = (char) (cArr3[0] ^ c);
        cArr4[2] = (char) (cArr4[2] + ((char) i));
        int length3 = cArr2.length;
        char[] cArr5 = new char[length3];
        getwalletdata.writeReplace = 0;
        while (getwalletdata.writeReplace < length3) {
            try {
                java.lang.Object[] objArr2 = {getwalletdata};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-800817016);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(71 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), 1179 - android.text.TextUtils.indexOf("", ""), (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b((short) 0, 0, (short) 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-800817016, obj);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                java.lang.Object[] objArr4 = {getwalletdata};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(811305766);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(30 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), 3443 - android.graphics.Color.argb(0, 0, 0, 0), (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 3832))).getMethod("g", java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(811305766, obj2);
                }
                int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).intValue();
                java.lang.Object[] objArr5 = {getwalletdata, java.lang.Integer.valueOf(cArr3[getwalletdata.writeReplace % 4] * 32718), java.lang.Integer.valueOf(cArr4[intValue])};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2107355451);
                if (obj3 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(26 - android.view.KeyEvent.keyCodeFromString(""), (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 1864, (char) (41774 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)));
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    b((short) 0, 0, (short) 3, objArr6);
                    obj3 = cls2.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2107355451, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
                java.lang.Object[] objArr7 = {java.lang.Integer.valueOf(cArr3[intValue2] * 32718), java.lang.Integer.valueOf(cArr4[intValue])};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(140076502);
                if (obj4 == null) {
                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.getSize(0) + 28, android.view.KeyEvent.keyCodeFromString("") + 3133, (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16));
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    b((short) 0, 0, (byte) $$a.length, objArr8);
                    java.lang.String str4 = (java.lang.String) objArr8[0];
                    c2 = 2;
                    obj4 = cls3.getMethod(str4, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(140076502, obj4);
                } else {
                    c2 = 2;
                }
                cArr4[intValue2] = ((java.lang.Character) ((java.lang.reflect.Method) obj4).invoke(null, objArr7)).charValue();
                cArr3[intValue2] = getwalletdata.values;
                cArr5[getwalletdata.writeReplace] = (char) ((((cArr3[intValue2] ^ cArr2[getwalletdata.writeReplace]) ^ (DigitizedCardProfile ^ 1263759066225628708L)) ^ ((int) (valueOf ^ 1263759066225628708L))) ^ ((char) (AlternateContactlessPaymentDataJson ^ 1263759066225628708L)));
                getwalletdata.writeReplace++;
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
        init$0();
        $10 = 0;
        $11 = 1;
        values = 0;
        IccPrivateKeyCrtComponentsJson = 1;
        DigitizedCardProfile = -3819634478830580383L;
        valueOf = -804334044;
        AlternateContactlessPaymentDataJson = (char) 54820;
    }

    static void init$0() {
        $$a = new byte[]{com.google.common.base.Ascii.SI, -31, 80, -73};
        $$b = 175;
    }
}
