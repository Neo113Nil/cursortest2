package com.payair.hce;

/* loaded from: classes4.dex */
final class getResponseId {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int RecordsJson;
    private static int valueOf;
    private static int values;
    private java.lang.String AlternateContactlessPaymentDataJson;
    private java.lang.String DigitizedCardProfile;
    private java.lang.String writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, short s, byte b, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = 1 - (i * 2);
        int i5 = 115 - (s * 3);
        int i6 = b + 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i7 = i6;
            i3 = 0;
            i5 += i6;
            i6 = i7;
            i2 = i3;
            int i8 = i6 + 1;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i7 = i8;
            i6 = bArr[i8];
            i5 += i6;
            i6 = i7;
            i2 = i3;
            int i82 = i6 + 1;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i4) {
            }
        } else {
            i2 = 0;
            int i822 = i6 + 1;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i4) {
            }
        }
    }

    public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i, int i2, int i3) {
        byte[] bArr = (byte[]) objArr[0];
        byte[] bArr2 = (byte[]) objArr[1];
        int i4 = (RecordsJson + 67) % 128;
        valueOf = i4;
        int length = bArr2.length < 8 ? bArr2.length : 8;
        RecordsJson = (i4 + 91) % 128;
        for (int i5 = 0; i5 < length; i5++) {
            bArr[i5] = (byte) (bArr[i5] ^ bArr2[i5]);
            int i6 = i5 + 8;
            bArr[i6] = (byte) (bArr[i6] ^ bArr2[i5]);
        }
        return bArr;
    }

    getResponseId() {
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(false, "\u0000\u0000\u0000\u0001", android.text.TextUtils.getOffsetBefore("", 0) + 204, android.view.KeyEvent.keyCodeFromString("") + 4, 4 - android.view.View.combineMeasuredStates(0, 0), objArr);
        this.AlternateContactlessPaymentDataJson = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(true, "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", (-16777012) - android.graphics.Color.rgb(0, 0, 0), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), android.view.KeyEvent.keyCodeFromString("") + 8, objArr2);
        this.DigitizedCardProfile = ((java.lang.String) objArr2[0]).intern();
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        a(true, "\u000b\t\ufff7\u0000\t\u0000\ufffe\t\n\b\uffff\ufff8\ufffa\ufffe\r\ufffa\ufff8\ufffa\ufffb\ufff7\ufff9￼\ufff8\f\u0000\u0000\ufff9\u000b\b�\uffff\u0000", 213 - android.graphics.Color.blue(0), 26 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 31, objArr3);
        this.writeReplace = ((java.lang.String) objArr3[0]).intern();
    }

    public final com.payair.hce.getResponseId AlternateContactlessPaymentDataJson(java.lang.String str) {
        int i = (valueOf + 79) % 128;
        RecordsJson = i;
        this.AlternateContactlessPaymentDataJson = str;
        int i2 = i + 29;
        valueOf = i2 % 128;
        if (i2 % 2 == 0) {
            return this;
        }
        throw new java.lang.ArithmeticException();
    }

    public final com.payair.hce.getResponseId writeReplace(java.lang.String str) {
        int i = RecordsJson;
        valueOf = (i + 115) % 128;
        this.writeReplace = str;
        valueOf = (i + 51) % 128;
        return this;
    }

    public final java.lang.String AlternateContactlessPaymentDataJson() {
        com.payair.hce.setPendingAction writeReplace = com.payair.hce.getPendingAction.writeReplace();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.AlternateContactlessPaymentDataJson);
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(true, "���\u0013\u0013�������", 206 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), android.os.Process.getGidForName("") + 6, (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 12, objArr);
        sb.append(((java.lang.String) objArr[0]).intern());
        java.lang.String obj = sb.toString();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(this.AlternateContactlessPaymentDataJson);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(false, "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", 204 - (android.view.ViewConfiguration.getTouchSlop() >> 8), (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), android.graphics.Color.alpha(0) + 12, objArr2);
        sb2.append(((java.lang.String) objArr2[0]).intern());
        java.lang.String obj2 = sb2.toString();
        try {
            java.lang.String DigitizedCardProfile = writeReplace.DigitizedCardProfile(obj, this.writeReplace);
            java.lang.String DigitizedCardProfile2 = writeReplace.DigitizedCardProfile(obj2, this.writeReplace);
            RecordsJson = (valueOf + 91) % 128;
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(DigitizedCardProfile);
            sb3.append(DigitizedCardProfile2);
            return sb3.toString();
        } catch (com.payair.hce.setVersion e) {
            e.printStackTrace();
            return null;
        }
    }

    public final java.lang.String values(java.lang.String str) {
        valueOf = (RecordsJson + 79) % 128;
        try {
            byte[] decodeHex = org.apache.commons.codec.binary.Hex.decodeHex(str.toCharArray());
            byte[] decodeHex2 = org.apache.commons.codec.binary.Hex.decodeHex(writeReplace().toCharArray());
            RecordsJson = (valueOf + 45) % 128;
            return new java.lang.String(org.apache.commons.codec.binary.Hex.encodeHex((byte[]) writeReplace(new java.lang.Object[]{decodeHex2, values(decodeHex)}, -2103958808, 2103958808, (int) java.lang.System.currentTimeMillis())));
        } catch (org.apache.commons.codec.DecoderException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static void a(boolean z, java.lang.String str, int i, int i2, int i3, java.lang.Object[] objArr) {
        char[] cArr;
        if (str != null) {
            $10 = ($11 + 17) % 128;
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.payair.hce.DigitizedCardJson11 digitizedCardJson11 = new com.payair.hce.DigitizedCardJson11();
        char[] cArr3 = new char[i3];
        digitizedCardJson11.DigitizedCardProfile = 0;
        $11 = ($10 + 43) % 128;
        while (digitizedCardJson11.DigitizedCardProfile < i3) {
            digitizedCardJson11.values = cArr2[digitizedCardJson11.DigitizedCardProfile];
            cArr3[digitizedCardJson11.DigitizedCardProfile] = (char) (i + digitizedCardJson11.values);
            int i4 = digitizedCardJson11.DigitizedCardProfile;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr3[i4]), java.lang.Integer.valueOf(values)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(414841307);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.ImageFormat.getBitsPerPixel(0) + 44, 2073 - android.view.View.MeasureSpec.getSize(0), (char) (60037 - android.graphics.Color.alpha(0)));
                    byte b = $$a[1];
                    byte b2 = (byte) (b + 1);
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b(b2, b2, b, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(414841307, obj);
                }
                cArr3[i4] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(52 - android.graphics.ImageFormat.getBitsPerPixel(0), (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 3542, (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj2);
                }
                ((java.lang.reflect.Method) obj2).invoke(null, objArr4);
                $10 = ($11 + 111) % 128;
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
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(53 - android.text.TextUtils.getCapsMode("", 0, 0), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 3544, (char) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
            }
            $10 = ($11 + 75) % 128;
            cArr3 = cArr5;
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    public final java.lang.String writeReplace() {
        com.payair.hce.setPendingAction writeReplace = com.payair.hce.getPendingAction.writeReplace();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.AlternateContactlessPaymentDataJson);
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(true, "\ufffb\ufffb\ufffb\u0011", 210 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 4, android.graphics.ImageFormat.getBitsPerPixel(0) + 5, objArr);
        sb.append(((java.lang.String) objArr[0]).intern());
        sb.append(this.DigitizedCardProfile);
        java.lang.String obj = sb.toString();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(this.AlternateContactlessPaymentDataJson);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(false, "\u0011\ufffb\ufffb\ufffb", 209 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), 3 - android.view.KeyEvent.getDeadChar(0, 0), 4 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), objArr2);
        sb2.append(((java.lang.String) objArr2[0]).intern());
        sb2.append(this.DigitizedCardProfile);
        java.lang.String obj2 = sb2.toString();
        try {
            java.lang.String DigitizedCardProfile = writeReplace.DigitizedCardProfile(obj, this.writeReplace);
            java.lang.String DigitizedCardProfile2 = writeReplace.DigitizedCardProfile(obj2, this.writeReplace);
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(DigitizedCardProfile.toUpperCase());
            sb3.append(DigitizedCardProfile2.toUpperCase());
            java.lang.String obj3 = sb3.toString();
            valueOf = (RecordsJson + 61) % 128;
            return obj3;
        } catch (com.payair.hce.setVersion e) {
            e.printStackTrace();
            return null;
        }
    }

    private static byte[] values(byte[] bArr) {
        int i = RecordsJson;
        valueOf = (i + 125) % 128;
        byte[] bArr2 = new byte[bArr.length];
        valueOf = (i + 121) % 128;
        int i2 = 0;
        while (i2 < bArr.length) {
            int i3 = RecordsJson + 67;
            valueOf = i3 % 128;
            if (i3 % 2 != 0) {
                bArr2[i2] = bArr[i2];
                i2 += 82;
            } else {
                bArr2[i2] = (byte) (bArr[i2] << 1);
                i2++;
            }
        }
        return bArr2;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        valueOf = 0;
        RecordsJson = 1;
        values = 1889207293;
    }

    private static byte[] AlternateContactlessPaymentDataJson(byte[] bArr, byte[] bArr2) {
        return (byte[]) writeReplace(new java.lang.Object[]{bArr, bArr2}, -2103958808, 2103958808, (int) java.lang.System.currentTimeMillis());
    }

    static void init$0() {
        $$a = new byte[]{18, -1, 36, -56};
        $$b = 110;
    }
}
