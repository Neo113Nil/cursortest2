package com.payair.hce;

/* loaded from: classes4.dex */
public final class setTextSelectHandleRight extends com.payair.hce.setTextSelectHandleLeft {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static long AlternateContactlessPaymentDataJson;
    private static int values;
    private static int writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, short s2, int i, java.lang.Object[] objArr) {
        int i2;
        int i3 = s2 * 4;
        int i4 = i + 112;
        byte[] bArr = $$a;
        int i5 = 4 - (s * 4);
        byte[] bArr2 = new byte[1 - i3];
        int i6 = 0 - i3;
        if (bArr == null) {
            int i7 = i4;
            i2 = 0;
            i4 = i6;
            i4 += i7;
            i5++;
            bArr2[i2] = (byte) i4;
            if (i2 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i2++;
            i7 = bArr[i5];
            i4 += i7;
            i5++;
            bArr2[i2] = (byte) i4;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            if (i2 == i6) {
            }
        }
    }

    @Override // com.payair.hce.setTextMetricsParams
    public final void AlternateContactlessPaymentDataJson(java.lang.Object obj) {
        java.lang.String intern;
        com.payair.hce.setSelection DigitizedCardProfile = DigitizedCardProfile();
        if (((java.lang.Boolean) obj).booleanValue()) {
            writeReplace = (values + 61) % 128;
            java.lang.Object[] objArr = new java.lang.Object[1];
            a("ᣄ✑杣Ɡ", android.view.MotionEvent.axisFromString("") + 16340, objArr);
            intern = ((java.lang.String) objArr[0]).intern();
        } else {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            a("ᣖ먦崲\uf026錉", 41718 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr2);
            intern = ((java.lang.String) objArr2[0]).intern();
            values = (writeReplace + 7) % 128;
        }
        com.payair.hce.setSelection.DigitizedCardProfile(new java.lang.Object[]{DigitizedCardProfile, intern}, 300113520, -300113519, java.lang.System.identityHashCode(DigitizedCardProfile));
    }

    private static void a(java.lang.String str, int i, java.lang.Object[] objArr) {
        $11 = ($10 + 23) % 128;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getDsrpData getdsrpdata = new com.payair.hce.getDsrpData();
        getdsrpdata.values = i;
        int length = charArray.length;
        long[] jArr = new long[length];
        getdsrpdata.valueOf = 0;
        $11 = ($10 + 63) % 128;
        while (getdsrpdata.valueOf < charArray.length) {
            $11 = ($10 + 41) % 128;
            int i2 = getdsrpdata.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(charArray[getdsrpdata.valueOf]), getdsrpdata, getdsrpdata};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2053068265);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(31 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1890, (char) (3600 - android.view.KeyEvent.getDeadChar(0, 0)));
                    byte b = (byte) ($$b - 5);
                    byte b2 = b;
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b(b, b2, (byte) (b2 + 1), objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2053068265, obj);
                }
                jArr[i2] = ((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue() ^ (AlternateContactlessPaymentDataJson ^ (-4761752123935132024L));
                java.lang.Object[] objArr4 = {getdsrpdata, getdsrpdata};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
                if (obj2 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(64 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1442, (char) (29682 - ((android.os.Process.getThreadPriority(0) + 20) >> 6)));
                    byte b3 = (byte) ($$b - 5);
                    byte b4 = b3;
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
        }
        char[] cArr = new char[length];
        getdsrpdata.valueOf = 0;
        while (getdsrpdata.valueOf < charArray.length) {
            int i3 = $11 + 61;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                cArr[getdsrpdata.valueOf] = (char) jArr[getdsrpdata.valueOf];
                java.lang.Object[] objArr6 = {getdsrpdata, getdsrpdata};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
                if (obj3 == null) {
                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(64 - android.graphics.Color.red(0), 1444 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 29683));
                    byte b5 = (byte) ($$b - 5);
                    byte b6 = b5;
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    b(b5, b6, b6, objArr7);
                    obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
                throw null;
            }
            cArr[getdsrpdata.valueOf] = (char) jArr[getdsrpdata.valueOf];
            java.lang.Object[] objArr8 = {getdsrpdata, getdsrpdata};
            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
            if (obj4 == null) {
                java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 16, 1443 - android.view.View.resolveSizeAndState(0, 0, 0), (char) (android.text.TextUtils.getOffsetBefore("", 0) + 29682));
                byte b7 = (byte) ($$b - 5);
                byte b8 = b7;
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                b(b7, b8, b8, objArr9);
                obj4 = cls4.getMethod((java.lang.String) objArr9[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj4);
            }
            ((java.lang.reflect.Method) obj4).invoke(null, objArr8);
        }
        objArr[0] = new java.lang.String(cArr);
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        values = 0;
        writeReplace = 1;
        AlternateContactlessPaymentDataJson = -8486957803405218248L;
    }

    static void init$0() {
        $$a = new byte[]{69, -73, 121, 3};
        $$b = 5;
    }
}
