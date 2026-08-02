package com.payair.hce;

/* loaded from: classes4.dex */
public final class getQueryExecutor {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int DigitizedCardProfile;
    private static int RecordsJson;
    private static long values;
    private byte[] AlternateContactlessPaymentDataJson;
    private final com.payair.hce.findFragmentById valueOf;
    private int writeReplace;

    private static void b(int i, byte b, int i2, java.lang.Object[] objArr) {
        int i3 = i2 + 112;
        int i4 = b * 4;
        int i5 = 3 - (i * 4);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i4 + 1];
        int i6 = -1;
        if (bArr == null) {
            i3 = i5 + (-i3);
            i5 = i5;
        }
        while (true) {
            i6++;
            int i7 = i5 + 1;
            bArr2[i6] = (byte) i3;
            if (i6 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            } else {
                i3 += -bArr[i7];
                i5 = i7;
            }
        }
    }

    public getQueryExecutor(com.payair.hce.findFragmentById findfragmentbyid) {
        this.valueOf = findfragmentbyid;
    }

    public final void values(com.payair.hce.getMCallbacksannotations getmcallbacksannotations) {
        RecordsJson = (DigitizedCardProfile + 55) % 128;
        DigitizedCardProfile();
        this.valueOf.values(true, getmcallbacksannotations);
        this.AlternateContactlessPaymentDataJson = new byte[this.valueOf.DigitizedCardProfile() + 1];
        this.writeReplace = 0;
        DigitizedCardProfile = (RecordsJson + 83) % 128;
    }

    private static void a(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2 = $10 + 97;
        $11 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getDsrpData getdsrpdata = new com.payair.hce.getDsrpData();
        getdsrpdata.values = i;
        int length = charArray.length;
        long[] jArr = new long[length];
        getdsrpdata.valueOf = 0;
        while (getdsrpdata.valueOf < charArray.length) {
            int i3 = $10 + 71;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = getdsrpdata.valueOf;
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(charArray[getdsrpdata.valueOf]), getdsrpdata, getdsrpdata};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2053068265);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(31 - android.graphics.Color.blue(0), android.view.View.resolveSize(0, 0) + 1890, (char) (3600 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8)));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b(0, (byte) 0, 1, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2053068265, obj);
                    }
                    jArr[i4] = ((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue() - (values ^ (-4761752123935132024L));
                    java.lang.Object[] objArr4 = {getdsrpdata, getdsrpdata};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(64 - android.text.TextUtils.getCapsMode("", 0, 0), (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1443, (char) ((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 29682));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        b(0, (byte) 0, 0, objArr5);
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
                int i5 = getdsrpdata.valueOf;
                java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(charArray[getdsrpdata.valueOf]), getdsrpdata, getdsrpdata};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2053068265);
                if (obj3 == null) {
                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(31 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), 1890 - android.widget.ExpandableListView.getPackedPositionType(0L), (char) ((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 3600));
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    b(0, (byte) 0, 1, objArr7);
                    obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2053068265, obj3);
                }
                jArr[i5] = ((java.lang.Long) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).longValue() ^ (values ^ (-4761752123935132024L));
                java.lang.Object[] objArr8 = {getdsrpdata, getdsrpdata};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
                if (obj4 == null) {
                    java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.KeyEvent.getMaxKeyCode() >> 16) + 64, 1443 - android.graphics.Color.red(0), (char) (29682 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16)));
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    b(0, (byte) 0, 0, objArr9);
                    obj4 = cls4.getMethod((java.lang.String) objArr9[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr8);
            }
            $11 = ($10 + 89) % 128;
        }
        char[] cArr = new char[length];
        getdsrpdata.valueOf = 0;
        while (getdsrpdata.valueOf < charArray.length) {
            cArr[getdsrpdata.valueOf] = (char) jArr[getdsrpdata.valueOf];
            java.lang.Object[] objArr10 = {getdsrpdata, getdsrpdata};
            java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
            if (obj5 == null) {
                java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 65, android.view.View.getDefaultSize(0, 0) + 1443, (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 29681));
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                b(0, (byte) 0, 0, objArr11);
                obj5 = cls5.getMethod((java.lang.String) objArr11[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj5);
            }
            ((java.lang.reflect.Method) obj5).invoke(null, objArr10);
        }
        objArr[0] = new java.lang.String(cArr);
    }

    public final void valueOf(byte[] bArr, int i) {
        int i2 = DigitizedCardProfile;
        int i3 = i2 + 17;
        RecordsJson = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (i == 0) {
            RecordsJson = (i2 + 7) % 128;
            return;
        }
        if (i < 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            a("ዟΤ\u3040⚰垌䐁竢殒頢軘뿆갮슐\uf377\ue027ᛌݭ㐁⪷孱䠍绱潓鰍늴ꍘ퇢웟\uf74c\ue5ec\u1a9c଼㧈⺍彯", 4441 - android.text.TextUtils.indexOf("", "", 0), objArr);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
        }
        int i4 = this.writeReplace;
        byte[] bArr2 = this.AlternateContactlessPaymentDataJson;
        if (i4 + i > bArr2.length) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            a("ዽ馿ц냼㾭꩟团\udddd䡐\uf4fc揚\uee51髺Ƙ谽㣠ꞟ刨\udea2䖄\uf035糌\ueb95阬˓覆㑪ꃅ⽷\uda28䚎쵹砓\ue4c5鍵ṙ諆ㅠ밄⣽흧䈚캪畩\ue00d沥", (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 35671, objArr2);
            throw new com.payair.hce.getInvalidationTracker(((java.lang.String) objArr2[0]).intern());
        }
        java.lang.System.arraycopy(bArr, 0, bArr2, i4, i);
        this.writeReplace += i;
    }

    public final byte[] values() throws com.payair.hce.getSuspendingTransactionId {
        DigitizedCardProfile = (RecordsJson + 59) % 128;
        byte[] writeReplace = this.valueOf.writeReplace(this.AlternateContactlessPaymentDataJson, 0, this.writeReplace);
        DigitizedCardProfile();
        DigitizedCardProfile = (RecordsJson + 97) % 128;
        return writeReplace;
    }

    private void DigitizedCardProfile() {
        if (this.AlternateContactlessPaymentDataJson != null) {
            RecordsJson = (DigitizedCardProfile + 39) % 128;
            int i = 0;
            while (true) {
                byte[] bArr = this.AlternateContactlessPaymentDataJson;
                if (i >= bArr.length) {
                    break;
                }
                int i2 = DigitizedCardProfile + 57;
                RecordsJson = i2 % 128;
                if (i2 % 2 == 0) {
                    bArr[i] = 0;
                    i += 120;
                } else {
                    bArr[i] = 0;
                    i++;
                }
            }
        }
        this.writeReplace = 0;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        DigitizedCardProfile = 0;
        RecordsJson = 1;
        values = -2205608810128776172L;
    }

    static void init$0() {
        $$a = new byte[]{76, 91, 9, -2};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE;
    }
}
