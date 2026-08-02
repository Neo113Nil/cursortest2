package com.payair.hce;

/* loaded from: classes4.dex */
public class getAllCmsCFormattedTransactionCredentials extends com.payair.hce.getReasonCode<java.lang.Long> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int DigitizedCardProfile;
    private static long valueOf;
    private static int values;

    private static void b(byte b, short s, short s2, java.lang.Object[] objArr) {
        byte[] bArr = $$a;
        int i = (b * 2) + 117;
        int i2 = (s2 * 4) + 4;
        int i3 = s * 4;
        byte[] bArr2 = new byte[i3 + 1];
        int i4 = -1;
        if (bArr == null) {
            i += -i2;
            i2++;
            i4 = -1;
        }
        while (true) {
            int i5 = i4 + 1;
            bArr2[i5] = (byte) i;
            if (i5 == i3) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i6 = i2;
            i += -bArr[i2];
            i2 = i6 + 1;
            i4 = i5;
        }
    }

    /* synthetic */ getAllCmsCFormattedTransactionCredentials(byte b) {
        this();
    }

    @Override // com.payair.hce.getReasonCode
    public final com.payair.hce.transactionCanBeResumed valueOf() {
        java.lang.Object obj;
        int i = values + 49;
        DigitizedCardProfile = i % 128;
        if (i % 2 != 0) {
            android.graphics.Color.red(0);
            java.lang.Object[] objArr = new java.lang.Object[1];
            a("攪攓ʌ뜯\udb52낮䁈憦", 0, objArr);
            obj = objArr[0];
        } else {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            a("攪攓ʌ뜯\udb52낮䁈憦", 1 - android.graphics.Color.red(0), objArr2);
            obj = objArr2[0];
        }
        return com.payair.hce.transactionCanBeResumed.values(((java.lang.String) obj).intern());
    }

    private getAllCmsCFormattedTransactionCredentials() {
        try {
            com.payair.hce.transactionCanBeResumed writeReplace = com.payair.hce.transactionCanBeResumed.writeReplace(4);
            super.valueOf(writeReplace);
            super.AlternateContactlessPaymentDataJson(java.lang.Long.valueOf(com.payair.hce.onRequestSessionCompleted.AlternateContactlessPaymentDataJson(writeReplace.valueOf())));
        } catch (com.payair.hce.postToastMessageOnUi unused) {
        }
    }

    public static com.payair.hce.setMobilePin<java.lang.Long> values() {
        com.payair.hce.setMobilePin<java.lang.Long> setmobilepin = new com.payair.hce.setMobilePin<java.lang.Long>() { // from class: com.payair.hce.getAllCmsCFormattedTransactionCredentials.1
            public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i, int i2, int i3) {
                return AlternateContactlessPaymentDataJson(objArr);
            }

            private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
                com.payair.hce.getAllCmsCFormattedTransactionCredentials.AnonymousClass1 anonymousClass1 = (com.payair.hce.getAllCmsCFormattedTransactionCredentials.AnonymousClass1) objArr[0];
                com.payair.hce.getAllCmsCFormattedTransactionCredentials getallcmscformattedtransactioncredentials = new com.payair.hce.getAllCmsCFormattedTransactionCredentials((byte) 0);
                int i = ~java.lang.System.identityHashCode(anonymousClass1);
                int i2 = (i ^ (-1499252995)) | (i & (-1499252995));
                int i3 = ~i2;
                int i4 = i3 & (i2 | i3);
                int i5 = i4 & 1495042306;
                int i6 = (i4 | 1495042306) & (~i5);
                int i7 = ((i6 ^ i5) | (i6 & i5)) * (-241);
                int i8 = ((i7 ^ (-163878404)) | (i7 & (-163878404))) << 1;
                int i9 = -(((~i7) & (-163878404)) | (163878403 & i7));
                int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
                int i11 = i2 & 1497205171;
                int i12 = (i2 | 1497205171) & (~i11);
                int i13 = ~((i12 ^ i11) | (i12 & i11));
                int i14 = ((~i13) & 2162865) | ((-2162866) & i13);
                int i15 = i13 & 2162865;
                int identityHashCode = java.lang.System.identityHashCode(anonymousClass1);
                int i16 = ~identityHashCode;
                int i17 = i16 & (-1993939942);
                int i18 = ((-1993939942) | i16) & (~i17);
                int i19 = ~((i18 ^ i17) | (i18 & i17));
                int i20 = ((~i19) & 1346900256) | (i19 & (-1346900257));
                int i21 = i19 & 1346900256;
                int i22 = -(~(-(-(((i21 ^ i20) | (i21 & i20)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE))));
                int i23 = (-2) - (~(((i22 | (-1591307065)) << 1) - (i22 ^ (-1591307065))));
                int i24 = (identityHashCode & 1346900256) | (i16 & (-1346900257));
                int i25 = identityHashCode & (-1346900257);
                int i26 = -(-((~((i24 ^ i25) | (i24 & i25))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE));
                int i27 = i23 | i26;
                int i28 = i27 << 1;
                int i29 = -((~(i23 & i26)) & i27);
                int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
                int i31 = i16 & (i16 | identityHashCode);
                int i32 = ((~i31) & 647056069) | ((-647056070) & i31);
                int i33 = i31 & 647056069;
                int i34 = ~((i33 ^ i32) | (i33 & i32));
                int i35 = i34 ^ (-1993956326);
                int i36 = i34 & (-1993956326);
                int i37 = (i36 ^ i35) | (i36 & i35);
                int i38 = identityHashCode ^ (-647039686);
                int i39 = identityHashCode & (-647039686);
                int i40 = ~((i39 ^ i38) | (i39 & i38));
                int i41 = ((~i40) & i37) | ((~i37) & i40);
                int i42 = i40 & i37;
                int i43 = ((i42 ^ i41) | (i42 & i41)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE;
                int i44 = i30 & i43;
                int i45 = (i43 | i30) & (~i44);
                int i46 = -(-(i44 << 1));
                if (((2127938309 & i10) | ((~i10) & (-2127938310))) + ((i10 & (-2127938310)) << 1) + (((i15 ^ i14) | (i15 & i14)) * 241) <= ((i45 | i46) << 1) - (i45 ^ i46)) {
                    return getallcmscformattedtransactioncredentials;
                }
                throw new java.lang.ArithmeticException();
            }

            @Override // com.payair.hce.setMobilePin
            public final com.payair.hce.getReasonCode<java.lang.Long> valueOf() {
                return (com.payair.hce.getReasonCode) writeReplace(new java.lang.Object[]{this}, -1179093047, 1179093047, java.lang.System.identityHashCode(this));
            }
        };
        DigitizedCardProfile = (values + 1) % 128;
        return setmobilepin;
    }

    private static void a(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] cArr;
        if (str != null) {
            int i2 = $11 + 73;
            $10 = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        com.payair.hce.getCardholderValidator getcardholdervalidator = new com.payair.hce.getCardholderValidator();
        char[] writeReplace = com.payair.hce.getCardholderValidator.writeReplace(valueOf ^ (-3824242241614154557L), cArr, i);
        getcardholdervalidator.valueOf = 4;
        $11 = ($10 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        while (getcardholdervalidator.valueOf < writeReplace.length) {
            getcardholdervalidator.DigitizedCardProfile = getcardholdervalidator.valueOf - 4;
            int i3 = getcardholdervalidator.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Long.valueOf(writeReplace[getcardholdervalidator.valueOf] ^ writeReplace[getcardholdervalidator.valueOf % 4]), java.lang.Long.valueOf(getcardholdervalidator.DigitizedCardProfile), java.lang.Long.valueOf(valueOf)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1178927836);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(41 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (android.view.KeyEvent.getMaxKeyCode() >> 16) + 1921, (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b((byte) 0, (short) 0, (short) 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1178927836, obj);
                }
                writeReplace[i3] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {getcardholdervalidator, getcardholdervalidator};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1228006564);
                if (obj2 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 429 - android.graphics.Color.red(0), (char) ((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 31610));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    b((byte) 1, (short) 0, (short) 0, objArr5);
                    obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1228006564, obj2);
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
        objArr[0] = new java.lang.String(writeReplace, 4, writeReplace.length - 4);
    }

    @Override // com.payair.hce.getReasonCode
    public final void valueOf(com.payair.hce.transactionCanBeResumed transactioncanberesumed) throws com.payair.hce.postToastMessageOnUi {
        values = (DigitizedCardProfile + 111) % 128;
        super.valueOf(transactioncanberesumed);
        super.AlternateContactlessPaymentDataJson(java.lang.Long.valueOf(com.payair.hce.onRequestSessionCompleted.AlternateContactlessPaymentDataJson(transactioncanberesumed.valueOf())));
        values = (DigitizedCardProfile + 19) % 128;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        DigitizedCardProfile = 0;
        values = 1;
        valueOf = -7893143604053819098L;
    }

    static void init$0() {
        $$a = new byte[]{71, -67, -2, -10};
        $$b = 42;
    }
}
