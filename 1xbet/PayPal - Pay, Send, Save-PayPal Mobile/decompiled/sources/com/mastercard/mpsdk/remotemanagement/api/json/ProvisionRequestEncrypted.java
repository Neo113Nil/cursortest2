package com.mastercard.mpsdk.remotemanagement.api.json;

/* loaded from: classes4.dex */
public class ProvisionRequestEncrypted extends com.mastercard.mpsdk.remotemanagement.api.json.CmsDApiRequestEncrypted {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AlternateContactlessPaymentDataJson;
    private static int values;
    private static int writeReplace;

    @com.payair.hce.setSelectionFromTop(valueOf = com.paypal.oslo.feature.taptopay.data.pushnotification.TapToPaySilentPushHandler.TOKEN_UNIQUE_REFERENCE_KEY)
    private java.lang.String tokenUniqueReference;

    private static void b(short s, int i, short s2, java.lang.Object[] objArr) {
        byte[] bArr = $$a;
        int i2 = s * 2;
        int i3 = (i * 3) + 115;
        int i4 = 3 - (s2 * 2);
        byte[] bArr2 = new byte[1 - i2];
        int i5 = 0 - i2;
        int i6 = -1;
        if (bArr == null) {
            i3 = i5 + i4;
            i4 = i4;
            i6 = -1;
        }
        while (true) {
            int i7 = i6 + 1;
            int i8 = i4 + 1;
            bArr2[i7] = (byte) i3;
            if (i7 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            } else {
                i3 += bArr[i8];
                i4 = i8;
                i6 = i7;
            }
        }
    }

    @Override // com.mastercard.mpsdk.remotemanagement.api.json.CmsDApiRequestEncrypted
    public /* synthetic */ com.mastercard.mpsdk.remotemanagement.api.json.CmsDApiRequestEncrypted setRequestId(java.lang.String str) {
        writeReplace = (AlternateContactlessPaymentDataJson + 33) % 128;
        com.mastercard.mpsdk.remotemanagement.api.json.ProvisionRequestEncrypted requestId = setRequestId(str);
        int i = AlternateContactlessPaymentDataJson + 73;
        writeReplace = i % 128;
        if (i % 2 == 0) {
            return requestId;
        }
        throw new java.lang.ArithmeticException();
    }

    public ProvisionRequestEncrypted(java.lang.String str, java.lang.String str2) {
        super(str);
        this.tokenUniqueReference = str2;
    }

    public java.lang.String getTokenUniqueReference() {
        int i = (AlternateContactlessPaymentDataJson + 79) % 128;
        writeReplace = i;
        java.lang.String str = this.tokenUniqueReference;
        int i2 = i + 59;
        AlternateContactlessPaymentDataJson = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    public com.mastercard.mpsdk.remotemanagement.api.json.ProvisionRequestEncrypted setTokenUniqueReference(java.lang.String str) {
        int i = (writeReplace + 89) % 128;
        AlternateContactlessPaymentDataJson = i;
        this.tokenUniqueReference = str;
        int i2 = i + 113;
        writeReplace = i2 % 128;
        if (i2 % 2 == 0) {
            return this;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.mastercard.mpsdk.remotemanagement.api.json.CmsDApiRequestEncrypted
    public java.lang.String getRequestId() {
        int i = writeReplace + 11;
        AlternateContactlessPaymentDataJson = i % 128;
        java.lang.String str = this.requestId;
        if (i % 2 != 0) {
            return str;
        }
        throw null;
    }

    @Override // com.mastercard.mpsdk.remotemanagement.api.json.CmsDApiRequestEncrypted
    public com.mastercard.mpsdk.remotemanagement.api.json.ProvisionRequestEncrypted setRequestId(java.lang.String str) {
        AlternateContactlessPaymentDataJson = (writeReplace + 53) % 128;
        this.requestId = str;
        int i = AlternateContactlessPaymentDataJson + 13;
        writeReplace = i % 128;
        if (i % 2 == 0) {
            return this;
        }
        throw new java.lang.ArithmeticException();
    }

    public java.lang.String buildAsJson() {
        com.payair.hce.setChildDivider setchilddivider = new com.payair.hce.setChildDivider();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(true, "ￖￒ\u001b\u001b\t\u0014\u000b", 215 - android.view.KeyEvent.getDeadChar(0, 0), 2 - android.view.View.getDefaultSize(0, 0), 8 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr);
        setchilddivider.valueOf(((java.lang.String) objArr[0]).intern());
        setchilddivider.AlternateContactlessPaymentDataJson(new com.payair.hce.getSystemServiceName(), java.lang.Void.TYPE);
        java.lang.String DigitizedCardProfile = setchilddivider.DigitizedCardProfile(this);
        AlternateContactlessPaymentDataJson = (writeReplace + 53) % 128;
        return DigitizedCardProfile;
    }

    public java.lang.String toString() {
        int i = writeReplace + 87;
        AlternateContactlessPaymentDataJson = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        java.lang.String simpleName = getClass().getSimpleName();
        int i2 = AlternateContactlessPaymentDataJson + 15;
        writeReplace = i2 % 128;
        if (i2 % 2 == 0) {
            return simpleName;
        }
        throw new java.lang.ArithmeticException();
    }

    private static void a(boolean z, java.lang.String str, int i, int i2, int i3, java.lang.Object[] objArr) {
        char[] cArr;
        int i4 = $11 + 39;
        $10 = i4 % 128;
        int i5 = 2;
        if (i4 % 2 != 0) {
            throw null;
        }
        if (str != null) {
            cArr = str.toCharArray();
            $11 = ($10 + 53) % 128;
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.payair.hce.DigitizedCardJson11 digitizedCardJson11 = new com.payair.hce.DigitizedCardJson11();
        char[] cArr3 = new char[i3];
        digitizedCardJson11.DigitizedCardProfile = 0;
        while (digitizedCardJson11.DigitizedCardProfile < i3) {
            $10 = ($11 + 125) % 128;
            digitizedCardJson11.values = cArr2[digitizedCardJson11.DigitizedCardProfile];
            cArr3[digitizedCardJson11.DigitizedCardProfile] = (char) (i + digitizedCardJson11.values);
            int i6 = digitizedCardJson11.DigitizedCardProfile;
            char c = cArr3[i6];
            try {
                java.lang.Object[] objArr2 = new java.lang.Object[i5];
                objArr2[1] = java.lang.Integer.valueOf(values);
                objArr2[0] = java.lang.Integer.valueOf(c);
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(414841307);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 43, 2073 - android.view.KeyEvent.getDeadChar(0, 0), (char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 60036));
                    byte b = $$a[0];
                    byte b2 = b;
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b(b, b2, b2, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(414841307, obj);
                }
                cArr3[i6] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(54 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), android.view.MotionEvent.axisFromString("") + 3544, (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj2);
                }
                ((java.lang.reflect.Method) obj2).invoke(null, objArr4);
                i5 = 2;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i2 > 0) {
            digitizedCardJson11.AlternateContactlessPaymentDataJson = i2;
            char[] cArr4 = new char[i3];
            java.lang.System.arraycopy(cArr3, 0, cArr4, 0, i3);
            java.lang.System.arraycopy(cArr4, 0, cArr3, i3 - digitizedCardJson11.AlternateContactlessPaymentDataJson, digitizedCardJson11.AlternateContactlessPaymentDataJson);
            java.lang.System.arraycopy(cArr4, digitizedCardJson11.AlternateContactlessPaymentDataJson, cArr3, 0, i3 - digitizedCardJson11.AlternateContactlessPaymentDataJson);
        }
        if (z) {
            int i7 = $10 + 43;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            char[] cArr5 = new char[i3];
            digitizedCardJson11.DigitizedCardProfile = 0;
            while (digitizedCardJson11.DigitizedCardProfile < i3) {
                int i9 = $11 + 93;
                $10 = i9 % 128;
                if (i9 % 2 != 0) {
                    cArr5[digitizedCardJson11.DigitizedCardProfile] = cArr3[i3 % digitizedCardJson11.DigitizedCardProfile];
                    java.lang.Object[] objArr5 = {digitizedCardJson11, digitizedCardJson11};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(53 - android.view.KeyEvent.keyCodeFromString(""), 3543 - android.graphics.Color.blue(0), (char) android.text.TextUtils.getOffsetAfter("", 0))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj3);
                    }
                    ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
                } else {
                    cArr5[digitizedCardJson11.DigitizedCardProfile] = cArr3[(i3 - digitizedCardJson11.DigitizedCardProfile) - 1];
                    java.lang.Object[] objArr6 = {digitizedCardJson11, digitizedCardJson11};
                    java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                    if (obj4 == null) {
                        obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(53 - android.graphics.Color.green(0), 3542 - android.view.MotionEvent.axisFromString(""), (char) android.graphics.Color.blue(0))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj4);
                    }
                    ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
                }
            }
            cArr3 = cArr5;
        }
        java.lang.String str2 = new java.lang.String(cArr3);
        $11 = ($10 + 19) % 128;
        objArr[0] = str2;
    }

    public static void j(java.lang.Object obj, java.lang.Object obj2) {
        try {
            java.lang.Object[] objArr = {obj, obj2};
            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
            if (obj3 == null) {
                java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.os.Process.getGidForName("") + 44, 1629 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (char) android.text.TextUtils.indexOf("", "", 0));
                byte b = $$a[0];
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                b(b, (byte) (b + 1), b, objArr2);
                obj3 = cls.getMethod((java.lang.String) objArr2[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj3);
            }
            ((java.lang.reflect.Method) obj3).invoke(null, objArr);
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        writeReplace = 0;
        AlternateContactlessPaymentDataJson = 1;
        values = 1889207070;
    }

    static void init$0() {
        $$a = new byte[]{0, -59, 44, -8};
        $$b = 59;
    }
}
