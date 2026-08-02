package com.payair.hce;

/* loaded from: classes4.dex */
public final class ReplenishRequestEncrypted implements com.payair.hce.getTransactionCredentials {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static long DigitizedCardProfile;
    private static int valueOf;
    private static int values;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, short s, byte b, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = b + 112;
        int i5 = i + 4;
        byte[] bArr = $$a;
        int i6 = (s * 4) + 1;
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i7 = i6;
            i3 = 0;
            i4 += -i7;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            i5++;
            if (i3 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i7 = bArr[i5];
            i4 += -i7;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            i5++;
            if (i3 == i6) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            i5++;
            if (i3 == i6) {
            }
        }
    }

    @Override // com.payair.hce.getTransactionCredentials
    public final java.lang.String DigitizedCardProfile(com.payair.hce.ReplenishResponseEncrypted[] replenishResponseEncryptedArr) {
        int length = replenishResponseEncryptedArr.length;
        com.payair.hce.setPaymentAppProviderId[] setpaymentappprovideridArr = new com.payair.hce.setPaymentAppProviderId[length];
        int i = 0;
        while (i < replenishResponseEncryptedArr.length) {
            com.payair.hce.setPaymentAppProviderId setpaymentappproviderid = new com.payair.hce.setPaymentAppProviderId();
            com.payair.hce.getPaymentAppInstanceId getpaymentappinstanceid = new com.payair.hce.getPaymentAppInstanceId();
            com.payair.hce.ReplenishResponseEncrypted replenishResponseEncrypted = replenishResponseEncryptedArr[i];
            com.payair.hce.getIccKek geticckek = (com.payair.hce.getIccKek) com.payair.hce.ReplenishResponseEncrypted.writeReplace(new java.lang.Object[]{replenishResponseEncrypted}, 1219330914, -1219330912, java.lang.System.identityHashCode(replenishResponseEncrypted));
            getpaymentappinstanceid.valueOf = geticckek.AlternateContactlessPaymentDataJson();
            getpaymentappinstanceid.DigitizedCardProfile = geticckek.values();
            getpaymentappinstanceid.IccPrivateKeyCrtComponentsJson = geticckek.RecordsJson().substring(16, 32);
            getpaymentappinstanceid.AlternateContactlessPaymentDataJson = geticckek.DigitizedCardProfile();
            getpaymentappinstanceid.RecordsJson = geticckek.getProfileVersion();
            getpaymentappinstanceid.values = geticckek.writeReplace();
            getpaymentappinstanceid.writeReplace = geticckek.valueOf();
            getpaymentappinstanceid.SdkCoreAlternateContactlessPaymentDataImpl = geticckek.getAid();
            setpaymentappproviderid.valueOf = getpaymentappinstanceid;
            com.payair.hce.ReplenishResponseEncrypted replenishResponseEncrypted2 = replenishResponseEncryptedArr[i];
            setpaymentappproviderid.AlternateContactlessPaymentDataJson = (java.lang.String) com.payair.hce.ReplenishResponseEncrypted.writeReplace(new java.lang.Object[]{replenishResponseEncrypted2}, -273286356, 273286357, java.lang.System.identityHashCode(replenishResponseEncrypted2));
            setpaymentappprovideridArr[i] = setpaymentappproviderid;
            i++;
            valueOf = (values + 89) % 128;
        }
        com.payair.hce.setChildDivider setchilddivider = new com.payair.hce.setChildDivider();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("搧懄澠痔珰秽䜔", (android.view.KeyEvent.getMaxKeyCode() >> 16) + 1511, objArr);
        setchilddivider.valueOf(((java.lang.String) objArr[0]).intern());
        if (length != 1) {
            return setchilddivider.DigitizedCardProfile(setpaymentappprovideridArr);
        }
        java.lang.String DigitizedCardProfile2 = setchilddivider.DigitizedCardProfile(setpaymentappprovideridArr[0]);
        int i2 = valueOf + 49;
        values = i2 % 128;
        if (i2 % 2 == 0) {
            return DigitizedCardProfile2;
        }
        throw new java.lang.ArithmeticException();
    }

    private static void a(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] cArr;
        if (str != null) {
            $10 = ($11 + 33) % 128;
            cArr = str.toCharArray();
            $10 = ($11 + 55) % 128;
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.payair.hce.getDsrpData getdsrpdata = new com.payair.hce.getDsrpData();
        getdsrpdata.values = i;
        int length = cArr2.length;
        long[] jArr = new long[length];
        getdsrpdata.valueOf = 0;
        while (getdsrpdata.valueOf < cArr2.length) {
            int i2 = $10 + 45;
            $11 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = getdsrpdata.valueOf;
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr2[getdsrpdata.valueOf]), getdsrpdata, getdsrpdata};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2053068265);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.KeyEvent.getMaxKeyCode() >> 16) + 31, android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 1890, (char) (3600 - android.text.TextUtils.indexOf("", "", 0)));
                        byte b = (byte) ($$a[3] + 1);
                        byte b2 = (byte) (b + 1);
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b(b, b2, (byte) (b2 + 1), objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2053068265, obj);
                    }
                    jArr[i3] = ((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue() * (DigitizedCardProfile % (-4761752123935132024L));
                    java.lang.Object[] objArr4 = {getdsrpdata, getdsrpdata};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 65, 1443 - android.text.TextUtils.indexOf("", ""), (char) (android.view.MotionEvent.axisFromString("") + 29683));
                        byte b3 = (byte) ($$a[3] + 1);
                        byte b4 = (byte) (b3 + 1);
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        b(b3, b4, b4, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj2);
                    }
                    ((java.lang.reflect.Method) obj2).invoke(null, objArr4);
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i4 = getdsrpdata.valueOf;
                java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(cArr2[getdsrpdata.valueOf]), getdsrpdata, getdsrpdata};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2053068265);
                if (obj3 == null) {
                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.red(0) + 31, 1890 - android.text.TextUtils.indexOf("", "", 0, 0), (char) (android.widget.ExpandableListView.getPackedPositionType(0L) + 3600));
                    byte b5 = (byte) ($$a[3] + 1);
                    byte b6 = (byte) (b5 + 1);
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    b(b5, b6, (byte) (b6 + 1), objArr7);
                    obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2053068265, obj3);
                }
                jArr[i4] = ((java.lang.Long) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).longValue() ^ (DigitizedCardProfile ^ (-4761752123935132024L));
                java.lang.Object[] objArr8 = {getdsrpdata, getdsrpdata};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
                if (obj4 == null) {
                    java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.ImageFormat.getBitsPerPixel(0) + 65, (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1443, (char) (android.widget.ExpandableListView.getPackedPositionGroup(0L) + 29682));
                    byte b7 = (byte) ($$a[3] + 1);
                    byte b8 = (byte) (b7 + 1);
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    b(b7, b8, b8, objArr9);
                    obj4 = cls4.getMethod((java.lang.String) objArr9[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr8);
            }
        }
        char[] cArr3 = new char[length];
        getdsrpdata.valueOf = 0;
        while (getdsrpdata.valueOf < cArr2.length) {
            int i5 = $11 + 97;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                cArr3[getdsrpdata.valueOf] = (char) jArr[getdsrpdata.valueOf];
                java.lang.Object[] objArr10 = {getdsrpdata, getdsrpdata};
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
                if (obj5 == null) {
                    java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(64 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), android.widget.ExpandableListView.getPackedPositionChild(0L) + 1444, (char) (29681 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)));
                    byte b9 = (byte) ($$a[3] + 1);
                    byte b10 = (byte) (b9 + 1);
                    java.lang.Object[] objArr11 = new java.lang.Object[1];
                    b(b9, b10, b10, objArr11);
                    obj5 = cls5.getMethod((java.lang.String) objArr11[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj5);
                }
                ((java.lang.reflect.Method) obj5).invoke(null, objArr10);
                throw new java.lang.ArithmeticException();
            }
            cArr3[getdsrpdata.valueOf] = (char) jArr[getdsrpdata.valueOf];
            java.lang.Object[] objArr12 = {getdsrpdata, getdsrpdata};
            java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
            if (obj6 == null) {
                java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(64 - android.graphics.Color.green(0), 1443 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (29681 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                byte b11 = (byte) ($$a[3] + 1);
                byte b12 = (byte) (b11 + 1);
                java.lang.Object[] objArr13 = new java.lang.Object[1];
                b(b11, b12, b12, objArr13);
                obj6 = cls6.getMethod((java.lang.String) objArr13[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj6);
            }
            ((java.lang.reflect.Method) obj6).invoke(null, objArr12);
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        values = 0;
        valueOf = 1;
        DigitizedCardProfile = 4073529907679203973L;
    }

    static void init$0() {
        $$a = new byte[]{76, 91, 9, -2};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE;
    }
}
