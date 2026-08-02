package com.payair.hce;

/* loaded from: classes4.dex */
public final class setMaximumPinTry {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AlternateContactlessPaymentDataJson;
    private static int getAid;
    private static com.payair.hce.setPinIvCvc3Track2 valueOf;
    private static int writeReplace;
    private com.payair.hce.access202 DigitizedCardProfile;
    private com.payair.hce.onDeleteCardCompleted values;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, byte b2, int i, java.lang.Object[] objArr) {
        int i2;
        byte[] bArr = $$a;
        int i3 = (b2 * 3) + 115;
        int i4 = (i * 4) + 4;
        int i5 = b * 4;
        byte[] bArr2 = new byte[i5 + 1];
        if (bArr == null) {
            i3 = i5;
            int i6 = i4;
            int i7 = 0;
            i4++;
            i3 += i6;
            i2 = i7;
            bArr2[i2] = (byte) i3;
            i7 = i2 + 1;
            if (i2 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i6 = bArr[i4];
            i4++;
            i3 += i6;
            i2 = i7;
            bArr2[i2] = (byte) i3;
            i7 = i2 + 1;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            i7 = i2 + 1;
            if (i2 == i5) {
            }
        }
    }

    public setMaximumPinTry(com.payair.hce.access202 access202Var, com.payair.hce.onDeleteCardCompleted ondeletecardcompleted) {
        this.DigitizedCardProfile = access202Var;
        this.values = ondeletecardcompleted;
    }

    public final com.payair.hce.access202 AlternateContactlessPaymentDataJson() {
        int i = AlternateContactlessPaymentDataJson + 103;
        getAid = i % 128;
        if (i % 2 != 0) {
            return this.DigitizedCardProfile;
        }
        throw null;
    }

    public final com.payair.hce.onDeleteCardCompleted writeReplace() {
        int i = getAid;
        AlternateContactlessPaymentDataJson = (i + 97) % 128;
        com.payair.hce.onDeleteCardCompleted ondeletecardcompleted = this.values;
        AlternateContactlessPaymentDataJson = (i + 101) % 128;
        return ondeletecardcompleted;
    }

    private static void a(boolean z, java.lang.String str, int i, int i2, int i3, java.lang.Object[] objArr) {
        char[] cArr;
        if (str != null) {
            int i4 = $10 + 121;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.payair.hce.DigitizedCardJson11 digitizedCardJson11 = new com.payair.hce.DigitizedCardJson11();
        char[] cArr3 = new char[i3];
        digitizedCardJson11.DigitizedCardProfile = 0;
        while (digitizedCardJson11.DigitizedCardProfile < i3) {
            $11 = ($10 + 117) % 128;
            digitizedCardJson11.values = cArr2[digitizedCardJson11.DigitizedCardProfile];
            cArr3[digitizedCardJson11.DigitizedCardProfile] = (char) (i + digitizedCardJson11.values);
            int i5 = digitizedCardJson11.DigitizedCardProfile;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr3[i5]), java.lang.Integer.valueOf(writeReplace)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(414841307);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(42 - android.os.Process.getGidForName(""), 2073 - android.view.View.combineMeasuredStates(0, 0), (char) (60036 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b((byte) 0, (byte) 0, 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(414841307, obj);
                }
                cArr3[i5] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(52 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), 3543 - android.view.View.MeasureSpec.getMode(0), (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj2);
                }
                ((java.lang.reflect.Method) obj2).invoke(null, objArr4);
                $10 = ($11 + 9) % 128;
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
            char[] cArr5 = new char[i3];
            digitizedCardJson11.DigitizedCardProfile = 0;
            while (digitizedCardJson11.DigitizedCardProfile < i3) {
                cArr5[digitizedCardJson11.DigitizedCardProfile] = cArr3[(i3 - digitizedCardJson11.DigitizedCardProfile) - 1];
                java.lang.Object[] objArr5 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.Gravity.getAbsoluteGravity(0, 0) + 53, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 3544, (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
            }
            cArr3 = cArr5;
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    public setMaximumPinTry() {
    }

    public static com.payair.hce.setPinIvCvc3Track2 valueOf() {
        getAid = (AlternateContactlessPaymentDataJson + 111) % 128;
        if (valueOf == null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            a(false, "\u000b\f\u0013\ufff0￦", (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE, 3 - android.text.TextUtils.indexOf("", ""), 5 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), objArr);
            valueOf = new com.payair.hce.onAuthenticateUser(((java.lang.String) objArr[0]).intern());
            AlternateContactlessPaymentDataJson = (getAid + 27) % 128;
        }
        com.payair.hce.setPinIvCvc3Track2 setpinivcvc3track2 = valueOf;
        AlternateContactlessPaymentDataJson = (getAid + 99) % 128;
        return setpinivcvc3track2;
    }

    public static void writeReplace(com.payair.hce.setPinIvCvc3Track2 setpinivcvc3track2) {
        int i = (getAid + 43) % 128;
        AlternateContactlessPaymentDataJson = i;
        valueOf = setpinivcvc3track2;
        getAid = (i + 107) % 128;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        AlternateContactlessPaymentDataJson = 0;
        getAid = 1;
        writeReplace = 1889207273;
    }

    static void init$0() {
        $$a = new byte[]{104, -39, -34, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus};
        $$b = 129;
    }
}
