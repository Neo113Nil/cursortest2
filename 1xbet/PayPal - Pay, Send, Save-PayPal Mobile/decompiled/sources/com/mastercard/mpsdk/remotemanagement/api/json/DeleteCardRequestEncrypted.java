package com.mastercard.mpsdk.remotemanagement.api.json;

/* loaded from: classes4.dex */
public class DeleteCardRequestEncrypted extends com.mastercard.mpsdk.remotemanagement.api.json.CmsDApiRequestEncrypted {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AlternateContactlessPaymentDataJson;
    private static int[] DigitizedCardProfile;
    private static int valueOf;

    @com.payair.hce.setSelectionFromTop(valueOf = com.paypal.oslo.feature.taptopay.data.pushnotification.TapToPaySilentPushHandler.TOKEN_UNIQUE_REFERENCE_KEY)
    private java.lang.String tokenUniqueReference;

    @com.payair.hce.setSelectionFromTop(valueOf = "transactionCredentialsStatus")
    private com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus[] transactionCredentialsStatus;

    private static void b(int i, byte b, short s, java.lang.Object[] objArr) {
        int i2 = b * 4;
        int i3 = (s * 4) + 66;
        int i4 = 4 - (i * 4);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i2 + 1];
        int i5 = -1;
        if (bArr == null) {
            i5 = -1;
            i3 = i4 + i3;
            i4++;
        }
        while (true) {
            int i6 = i5 + 1;
            bArr2[i6] = (byte) i3;
            if (i6 == i2) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i7 = i3;
            i5 = i6;
            i3 = bArr[i4] + i7;
            i4++;
        }
    }

    public DeleteCardRequestEncrypted(java.lang.String str, java.lang.String str2, com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus[] singleUseKeyStatusArr) {
        super(str);
        this.tokenUniqueReference = str2;
        this.transactionCredentialsStatus = singleUseKeyStatusArr;
    }

    public java.lang.String getTokenUniqueReference() {
        int i = AlternateContactlessPaymentDataJson;
        valueOf = (i + 13) % 128;
        java.lang.String str = this.tokenUniqueReference;
        int i2 = i + 81;
        valueOf = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public void setTokenUniqueReference(java.lang.String str) {
        int i = (AlternateContactlessPaymentDataJson + 107) % 128;
        valueOf = i;
        this.tokenUniqueReference = str;
        AlternateContactlessPaymentDataJson = (i + 37) % 128;
    }

    public com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus[] getTransactionCredentialsStatus() {
        int i = AlternateContactlessPaymentDataJson + 17;
        valueOf = i % 128;
        com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus[] singleUseKeyStatusArr = this.transactionCredentialsStatus;
        if (i % 2 != 0) {
            return singleUseKeyStatusArr;
        }
        throw new java.lang.ArithmeticException();
    }

    public void setTransactionCredentialsStatus(com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus[] singleUseKeyStatusArr) {
        int i = valueOf + 93;
        AlternateContactlessPaymentDataJson = i % 128;
        if (i % 2 == 0) {
            this.transactionCredentialsStatus = singleUseKeyStatusArr;
        } else {
            this.transactionCredentialsStatus = singleUseKeyStatusArr;
            throw null;
        }
    }

    public java.lang.String buildAsJson() {
        com.payair.hce.setChildDivider setchilddivider = new com.payair.hce.setChildDivider();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(new int[]{1110533177, 1627528552, 1192659574, -2102089439}, android.graphics.Color.red(0) + 7, objArr);
        setchilddivider.valueOf(((java.lang.String) objArr[0]).intern());
        setchilddivider.AlternateContactlessPaymentDataJson(new com.payair.hce.getSystemServiceName(), java.lang.Void.TYPE);
        java.lang.String DigitizedCardProfile2 = setchilddivider.DigitizedCardProfile(this);
        AlternateContactlessPaymentDataJson = (valueOf + 47) % 128;
        return DigitizedCardProfile2;
    }

    private static void a(int[] iArr, int i, java.lang.Object[] objArr) {
        int i2;
        int length;
        int[] iArr2;
        int i3;
        int[] iArr3;
        com.payair.hce.isTransitSupported istransitsupported = new com.payair.hce.isTransitSupported();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr4 = DigitizedCardProfile;
        int i4 = 1;
        int i5 = 0;
        if (iArr4 != null) {
            $10 = ($11 + 125) % 128;
            int length2 = iArr4.length;
            int[] iArr5 = new int[length2];
            for (int i6 = 0; i6 < length2; i6++) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(iArr4[i6])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.alpha(0) + 27, 28 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) (1 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))))).getMethod("z", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj);
                    }
                    iArr5[i6] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr4 = iArr5;
        }
        int length3 = iArr4.length;
        int[] iArr6 = new int[length3];
        int[] iArr7 = DigitizedCardProfile;
        if (iArr7 != null) {
            int i7 = $11 + 53;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                length = iArr7.length;
                iArr2 = new int[length];
                i3 = 1;
            } else {
                length = iArr7.length;
                iArr2 = new int[length];
                i3 = 0;
            }
            while (i3 < length) {
                java.lang.Object[] objArr3 = new java.lang.Object[i4];
                objArr3[0] = java.lang.Integer.valueOf(iArr7[i3]);
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                if (obj2 == null) {
                    iArr3 = iArr7;
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.ImageFormat.getBitsPerPixel(0) + 28, android.os.Process.getGidForName("") + 30, (char) android.text.TextUtils.getTrimmedLength(""))).getMethod("z", java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj2);
                } else {
                    iArr3 = iArr7;
                }
                iArr2[i3] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
                i3++;
                iArr7 = iArr3;
                i4 = 1;
                i5 = 0;
            }
            i2 = i5;
            iArr7 = iArr2;
        } else {
            i2 = 0;
        }
        java.lang.System.arraycopy(iArr7, i2, iArr6, i2, length3);
        istransitsupported.valueOf = i2;
        while (istransitsupported.valueOf < iArr.length) {
            $11 = ($10 + 107) % 128;
            cArr[0] = (char) (iArr[istransitsupported.valueOf] >> 16);
            cArr[1] = (char) iArr[istransitsupported.valueOf];
            cArr[2] = (char) (iArr[istransitsupported.valueOf + 1] >> 16);
            cArr[3] = (char) iArr[istransitsupported.valueOf + 1];
            istransitsupported.DigitizedCardProfile = (cArr[0] << 16) + cArr[1];
            istransitsupported.values = (cArr[2] << 16) + cArr[3];
            com.payair.hce.isTransitSupported.values(iArr6);
            for (int i8 = 0; i8 < 16; i8++) {
                $11 = ($10 + 71) % 128;
                istransitsupported.DigitizedCardProfile ^= iArr6[i8];
                java.lang.Object[] objArr4 = {istransitsupported, java.lang.Integer.valueOf(com.payair.hce.isTransitSupported.writeReplace(istransitsupported.DigitizedCardProfile)), istransitsupported, istransitsupported};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1131271445);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 31, 5088 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) android.view.KeyEvent.keyCodeFromString(""))).getMethod("D", java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1131271445, obj3);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).intValue();
                istransitsupported.DigitizedCardProfile = istransitsupported.values;
                istransitsupported.values = intValue;
            }
            int i9 = istransitsupported.DigitizedCardProfile;
            istransitsupported.DigitizedCardProfile = istransitsupported.values;
            istransitsupported.values = i9;
            istransitsupported.values ^= iArr6[16];
            istransitsupported.DigitizedCardProfile ^= iArr6[17];
            int i10 = istransitsupported.DigitizedCardProfile;
            int i11 = istransitsupported.values;
            cArr[0] = (char) (istransitsupported.DigitizedCardProfile >>> 16);
            cArr[1] = (char) istransitsupported.DigitizedCardProfile;
            cArr[2] = (char) (istransitsupported.values >>> 16);
            cArr[3] = (char) istransitsupported.values;
            com.payair.hce.isTransitSupported.values(iArr6);
            cArr2[istransitsupported.valueOf * 2] = cArr[0];
            cArr2[(istransitsupported.valueOf * 2) + 1] = cArr[1];
            cArr2[(istransitsupported.valueOf * 2) + 2] = cArr[2];
            cArr2[(istransitsupported.valueOf * 2) + 3] = cArr[3];
            java.lang.Object[] objArr5 = {istransitsupported, istransitsupported};
            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-825681165);
            if (obj4 == null) {
                java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.graphics.Color.red(0) + 2923, (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 3038));
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                b(0, (byte) 0, (short) 0, objArr6);
                obj4 = cls.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-825681165, obj4);
            }
            ((java.lang.reflect.Method) obj4).invoke(null, objArr5);
        }
        objArr[0] = new java.lang.String(cArr2, 0, i);
    }

    public java.lang.String toString() {
        int i = AlternateContactlessPaymentDataJson + 115;
        valueOf = i % 128;
        if (i % 2 != 0) {
            java.util.Arrays.toString(this.transactionCredentialsStatus);
            java.lang.String simpleName = getClass().getSimpleName();
            valueOf = (AlternateContactlessPaymentDataJson + 87) % 128;
            return simpleName;
        }
        java.util.Arrays.toString(this.transactionCredentialsStatus);
        throw null;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        AlternateContactlessPaymentDataJson = 0;
        valueOf = 1;
        DigitizedCardProfile = new int[]{1406429514, 505164043, -443850275, -1586859840, -2146808216, 700542084, -1306938111, 524820733, 1861401820, 292297691, 1311492626, 1546369830, 284603236, -143468630, 690886717, -1674003067, 1201416736, 2018852932};
    }

    static void init$0() {
        $$a = new byte[]{5, -66, -84, -78};
        $$b = 231;
    }
}
