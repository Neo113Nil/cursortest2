package com.payair.hce;

/* loaded from: classes4.dex */
public final class startDeviceAuthenticationForRegistration {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AlternateContactlessPaymentDataJson;
    private static int DigitizedCardProfile;
    private static int writeReplace;
    private final byte[] valueOf;
    private final byte values;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, short s2, int i, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = s2 * 3;
        byte[] bArr = $$a;
        int i5 = i + 4;
        byte[] bArr2 = new byte[1 - i4];
        int i6 = 0 - i4;
        if (bArr == null) {
            int i7 = i6;
            i3 = i5;
            i2 = 0;
            i5 += -i7;
            bArr2[i2] = (byte) i5;
            if (i2 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i3++;
            i7 = bArr[i3];
            i2++;
            i5 += -i7;
            bArr2[i2] = (byte) i5;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            i5 = 115 - (s * 4);
            i3 = i5;
            bArr2[i2] = (byte) i5;
            if (i2 == i6) {
            }
        }
    }

    public startDeviceAuthenticationForRegistration(byte[] bArr, byte b) {
        this.valueOf = bArr;
        this.values = b;
    }

    public final byte[] valueOf() {
        int i = (DigitizedCardProfile + 97) % 128;
        AlternateContactlessPaymentDataJson = i;
        byte[] bArr = this.valueOf;
        DigitizedCardProfile = (i + 99) % 128;
        return bArr;
    }

    public final byte AlternateContactlessPaymentDataJson() {
        int i = DigitizedCardProfile;
        AlternateContactlessPaymentDataJson = (i + 87) % 128;
        byte b = this.values;
        AlternateContactlessPaymentDataJson = (i + 93) % 128;
        return b;
    }

    public final boolean equals(java.lang.Object obj) {
        AlternateContactlessPaymentDataJson = (DigitizedCardProfile + 111) % 128;
        com.payair.hce.startDeviceAuthenticationForRegistration startdeviceauthenticationforregistration = (com.payair.hce.startDeviceAuthenticationForRegistration) obj;
        if (!java.util.Arrays.equals(valueOf(), startdeviceauthenticationforregistration.valueOf())) {
            return false;
        }
        int i = DigitizedCardProfile + 15;
        AlternateContactlessPaymentDataJson = i % 128;
        if (i % 2 != 0) {
            return AlternateContactlessPaymentDataJson() == startdeviceauthenticationforregistration.AlternateContactlessPaymentDataJson();
        }
        AlternateContactlessPaymentDataJson();
        startdeviceauthenticationforregistration.AlternateContactlessPaymentDataJson();
        throw null;
    }

    public final java.lang.String toString() {
        DigitizedCardProfile = (AlternateContactlessPaymentDataJson + 27) % 128;
        com.payair.hce.setMaximumPinTry.valueOf();
        android.graphics.PointF.length(0.0f, 0.0f);
        android.media.AudioTrack.getMaxVolume();
        android.view.ViewConfiguration.getScrollBarSize();
        new java.lang.Object[]{com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(this.valueOf).writeReplace(), java.lang.Byte.valueOf(this.values)};
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(false, "\f\u0013\uffde\t\u0006\uffdf\b\u000e", 198 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 2 - (android.view.KeyEvent.getMaxKeyCode() >> 16), 8 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        int i = DigitizedCardProfile + 121;
        AlternateContactlessPaymentDataJson = i % 128;
        if (i % 2 != 0) {
            return intern;
        }
        throw new java.lang.ArithmeticException();
    }

    private static void a(boolean z, java.lang.String str, int i, int i2, int i3, java.lang.Object[] objArr) {
        char[] cArr;
        if (str != null) {
            int i4 = $11 + 75;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
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
            digitizedCardJson11.values = cArr2[digitizedCardJson11.DigitizedCardProfile];
            cArr3[digitizedCardJson11.DigitizedCardProfile] = (char) (i + digitizedCardJson11.values);
            int i5 = digitizedCardJson11.DigitizedCardProfile;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr3[i5]), java.lang.Integer.valueOf(writeReplace)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(414841307);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 42, 2073 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (android.view.View.getDefaultSize(0, 0) + 60037));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b((short) 0, (short) 0, -1, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(414841307, obj);
                }
                cArr3[i5] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(53 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), 3543 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj2);
                }
                ((java.lang.reflect.Method) obj2).invoke(null, objArr4);
                $11 = ($10 + 59) % 128;
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
            $10 = ($11 + 45) % 128;
            while (digitizedCardJson11.DigitizedCardProfile < i3) {
                int i6 = $10 + 91;
                $11 = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = digitizedCardJson11.DigitizedCardProfile;
                    int i8 = digitizedCardJson11.DigitizedCardProfile;
                    throw new java.lang.ArithmeticException();
                }
                cArr5[digitizedCardJson11.DigitizedCardProfile] = cArr3[(i3 - digitizedCardJson11.DigitizedCardProfile) - 1];
                java.lang.Object[] objArr5 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(53 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), android.widget.ExpandableListView.getPackedPositionType(0L) + 3543, (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
            }
            cArr3 = cArr5;
        }
        java.lang.String str2 = new java.lang.String(cArr3);
        int i9 = $10 + 37;
        $11 = i9 % 128;
        if (i9 % 2 == 0) {
            throw null;
        }
        objArr[0] = str2;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        DigitizedCardProfile = 0;
        AlternateContactlessPaymentDataJson = 1;
        writeReplace = 1889207041;
    }

    static void init$0() {
        $$a = new byte[]{94, 87, -25, Byte.MAX_VALUE};
        $$b = 52;
    }
}
