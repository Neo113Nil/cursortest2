package com.payair.hce;

/* loaded from: classes4.dex */
public final class setVerticalScrollbarThumbDrawable extends java.lang.Enum<com.payair.hce.setVerticalScrollbarThumbDrawable> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int[] AlternateContactlessPaymentDataJson;
    private static int DigitizedCardProfile;
    private static final char[] values;
    private static int writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, short s, int i, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = 66 - (b * 4);
        int i5 = 4 - (s * 2);
        int i6 = 1 - (i * 4);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i7 = i5;
            i4 = i6;
            int i8 = 0;
            i4 += -i5;
            i5 = i7 + 1;
            i2 = i8;
            bArr2[i2] = (byte) i4;
            i3 = i2 + 1;
            if (i3 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i7 = i5;
            i5 = bArr[i5];
            i8 = i3;
            i4 += -i5;
            i5 = i7 + 1;
            i2 = i8;
            bArr2[i2] = (byte) i4;
            i3 = i2 + 1;
            if (i3 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            i3 = i2 + 1;
            if (i3 == i6) {
            }
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        DigitizedCardProfile = 0;
        writeReplace = 1;
        AlternateContactlessPaymentDataJson();
        values = new char[]{com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        int i = DigitizedCardProfile + 115;
        writeReplace = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private static void a(int[] iArr, int i, java.lang.Object[] objArr) {
        int[] iArr2;
        int i2;
        com.payair.hce.isTransitSupported istransitsupported = new com.payair.hce.isTransitSupported();
        char[] cArr = new char[4];
        int i3 = 2;
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = AlternateContactlessPaymentDataJson;
        int i4 = 1;
        int i5 = 0;
        if (iArr3 != null) {
            $11 = ($10 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
            int length = iArr3.length;
            int[] iArr4 = new int[length];
            int i6 = 0;
            while (i6 < length) {
                int i7 = $11 + 53;
                $10 = i7 % 128;
                if (i7 % i3 != 0) {
                    try {
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        objArr2[i5] = java.lang.Integer.valueOf(iArr3[i6]);
                        java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                        if (obj == null) {
                            obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - android.view.KeyEvent.keyCodeFromString(""), 28 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, i5, i5), (char) (1 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))))).getMethod("z", java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj);
                        }
                        iArr4[i6] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(iArr3[i6])};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                    if (obj2 == null) {
                        obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 27, 29 - android.view.KeyEvent.normalizeMetaState(0), (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8))).getMethod("z", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj2);
                    }
                    iArr4[i6] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
                    i6++;
                }
                i3 = 2;
                i5 = 0;
            }
            iArr3 = iArr4;
        }
        int length2 = iArr3.length;
        int[] iArr5 = new int[length2];
        int[] iArr6 = AlternateContactlessPaymentDataJson;
        if (iArr6 != null) {
            int length3 = iArr6.length;
            int[] iArr7 = new int[length3];
            int i8 = 0;
            while (i8 < length3) {
                java.lang.Object[] objArr4 = new java.lang.Object[i4];
                objArr4[0] = java.lang.Integer.valueOf(iArr6[i8]);
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                if (obj3 == null) {
                    iArr2 = iArr6;
                    i2 = length3;
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.os.Process.myPid() >> 22), 30 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)))).getMethod("z", java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj3);
                } else {
                    iArr2 = iArr6;
                    i2 = length3;
                }
                iArr7[i8] = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).intValue();
                i8++;
                length3 = i2;
                iArr6 = iArr2;
                i4 = 1;
            }
            iArr6 = iArr7;
        }
        java.lang.System.arraycopy(iArr6, 0, iArr5, 0, length2);
        istransitsupported.valueOf = 0;
        while (istransitsupported.valueOf < iArr.length) {
            $11 = ($10 + 27) % 128;
            cArr[0] = (char) (iArr[istransitsupported.valueOf] >> 16);
            cArr[1] = (char) iArr[istransitsupported.valueOf];
            cArr[2] = (char) (iArr[istransitsupported.valueOf + 1] >> 16);
            cArr[3] = (char) iArr[istransitsupported.valueOf + 1];
            istransitsupported.DigitizedCardProfile = (cArr[0] << 16) + cArr[1];
            istransitsupported.values = (cArr[2] << 16) + cArr[3];
            com.payair.hce.isTransitSupported.values(iArr5);
            for (int i9 = 0; i9 < 16; i9++) {
                istransitsupported.DigitizedCardProfile ^= iArr5[i9];
                java.lang.Object[] objArr5 = {istransitsupported, java.lang.Integer.valueOf(com.payair.hce.isTransitSupported.writeReplace(istransitsupported.DigitizedCardProfile)), istransitsupported, istransitsupported};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1131271445);
                if (obj4 == null) {
                    obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 31, 5088 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0))).getMethod("D", java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1131271445, obj4);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr5)).intValue();
                istransitsupported.DigitizedCardProfile = istransitsupported.values;
                istransitsupported.values = intValue;
            }
            int i10 = istransitsupported.DigitizedCardProfile;
            istransitsupported.DigitizedCardProfile = istransitsupported.values;
            istransitsupported.values = i10;
            istransitsupported.values ^= iArr5[16];
            istransitsupported.DigitizedCardProfile ^= iArr5[17];
            int i11 = istransitsupported.DigitizedCardProfile;
            int i12 = istransitsupported.values;
            cArr[0] = (char) (istransitsupported.DigitizedCardProfile >>> 16);
            cArr[1] = (char) istransitsupported.DigitizedCardProfile;
            cArr[2] = (char) (istransitsupported.values >>> 16);
            cArr[3] = (char) istransitsupported.values;
            com.payair.hce.isTransitSupported.values(iArr5);
            cArr2[istransitsupported.valueOf * 2] = cArr[0];
            cArr2[(istransitsupported.valueOf * 2) + 1] = cArr[1];
            cArr2[(istransitsupported.valueOf * 2) + 2] = cArr[2];
            cArr2[(istransitsupported.valueOf * 2) + 3] = cArr[3];
            java.lang.Object[] objArr6 = {istransitsupported, istransitsupported};
            java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-825681165);
            if (obj5 == null) {
                java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionType(0L) + 49, android.text.TextUtils.indexOf("", "", 0) + 2923, (char) ((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 3037));
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                b((byte) 0, (short) 0, 0, objArr7);
                obj5 = cls.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-825681165, obj5);
            }
            ((java.lang.reflect.Method) obj5).invoke(null, objArr6);
        }
        objArr[0] = new java.lang.String(cArr2, 0, i);
    }

    public static byte[] writeReplace(java.lang.String str) {
        int i = writeReplace + 105;
        int i2 = i % 128;
        DigitizedCardProfile = i2;
        if (i % 2 != 0) {
            throw null;
        }
        if (str != null) {
            int i3 = i2 + 45;
            writeReplace = i3 % 128;
            if (i3 % 2 != 0) {
                if (!str.isEmpty()) {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    a(new int[]{-1827676961, 2001064287}, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 3, objArr);
                    if (!str.equals(((java.lang.String) objArr[0]).intern())) {
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        a(new int[]{-1827676961, 2001064287}, 1 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr2);
                        if (str.startsWith(((java.lang.String) objArr2[0]).intern())) {
                            writeReplace = (DigitizedCardProfile + 55) % 128;
                            str = str.substring(2);
                        }
                        int length = str.length() / 2;
                        byte[] bArr = new byte[length];
                        for (int i4 = 0; i4 < length; i4++) {
                            int i5 = i4 << 1;
                            bArr[i4] = (byte) java.lang.Integer.parseInt(str.substring(i5, i5 + 2), 16);
                        }
                        return bArr;
                    }
                }
            } else {
                throw null;
            }
        }
        return new byte[0];
    }

    public static byte[] valueOf(java.lang.String str) {
        int i = 0;
        if (str != null) {
            int i2 = DigitizedCardProfile + 1;
            writeReplace = i2 % 128;
            if (i2 % 2 != 0) {
                if (!str.isEmpty()) {
                    writeReplace = (DigitizedCardProfile + 107) % 128;
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    a(new int[]{-1827676961, 2001064287}, 2 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr);
                    if (!str.equals(((java.lang.String) objArr[0]).intern())) {
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        a(new int[]{-1827676961, 2001064287}, android.view.KeyEvent.normalizeMetaState(0) + 2, objArr2);
                        if (str.startsWith(((java.lang.String) objArr2[0]).intern())) {
                            int i3 = DigitizedCardProfile + 115;
                            writeReplace = i3 % 128;
                            str = i3 % 2 == 0 ? str.substring(3) : str.substring(2);
                        }
                        if (str.length() % 2 != 0) {
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            a(new int[]{1594351696, -1816913904}, android.view.View.MeasureSpec.getSize(0) + 1, objArr3);
                            str = ((java.lang.String) objArr3[0]).intern().concat(java.lang.String.valueOf(str));
                        }
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        a(new int[]{1718425922, 2105063376, -1850734026, -1310794691, 924292257, -114696241, 1183945888, -841773566, 1324677411, -648791732}, (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 19, objArr4);
                        if (!java.util.regex.Pattern.compile(((java.lang.String) objArr4[0]).intern(), 2).matcher(str).matches()) {
                            java.lang.Object[] objArr5 = new java.lang.Object[1];
                            a(new int[]{247418951, -8209359, -727910807, 1865097878, -1232116990, -1641470362, 84029281, -773214918, 1647322904, 2140717152}, (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 20, objArr5);
                            java.lang.StringBuilder sb = new java.lang.StringBuilder(((java.lang.String) objArr5[0]).intern());
                            sb.append(str);
                            java.lang.Object[] objArr6 = new java.lang.Object[1];
                            a(new int[]{-862383914, -760020265}, -(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr6);
                            sb.append(((java.lang.String) objArr6[0]).intern());
                            throw new java.lang.IllegalArgumentException(sb.toString());
                        }
                        int length = str.length();
                        byte[] bArr = new byte[length / 2];
                        while (i < length) {
                            int i4 = writeReplace + 119;
                            DigitizedCardProfile = i4 % 128;
                            if (i4 % 2 != 0) {
                                bArr[i * 2] = (byte) ((java.lang.Character.digit(str.charAt(i), 46) % 2) / java.lang.Character.digit(str.charAt(i + 7), 96));
                                i += 10;
                            } else {
                                bArr[i / 2] = (byte) ((java.lang.Character.digit(str.charAt(i), 16) << 4) + java.lang.Character.digit(str.charAt(i + 1), 16));
                                i += 2;
                            }
                        }
                        return bArr;
                    }
                }
            } else {
                throw new java.lang.ArithmeticException();
            }
        }
        return new byte[0];
    }

    public static java.lang.String DigitizedCardProfile(byte[] bArr) {
        int i = writeReplace;
        int i2 = i + 43;
        DigitizedCardProfile = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (bArr == null) {
            DigitizedCardProfile = (i + 63) % 128;
            return "";
        }
        try {
            char[] cArr = new char[bArr.length << 1];
            int i3 = 0;
            int i4 = 0;
            while (i4 < bArr.length) {
                byte b = bArr[i4];
                char[] cArr2 = values;
                cArr[i3] = cArr2[(b >>> 4) & 15];
                int i5 = i3 + 2;
                cArr[i3 + 1] = cArr2[b & com.google.common.base.Ascii.SI];
                i4++;
                i3 = i5;
            }
            writeReplace = (DigitizedCardProfile + 61) % 128;
            return new java.lang.String(cArr);
        } catch (java.lang.Exception unused) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            a(new int[]{-1677749308, 1378319796, -727910807, 1865097878, -2084976238, 4182381, 341443160, -1920500811}, (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 12, objArr);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
        }
    }

    static void AlternateContactlessPaymentDataJson() {
        AlternateContactlessPaymentDataJson = new int[]{-1142822517, -820385309, 964203366, -402453375, -694102809, 1185839015, 282906731, 1179352452, 113069735, -1128483560, 318562290, 694026449, -881311091, 1245745280, 1527926844, -750232041, -2065645810, -138407047};
    }

    static void init$0() {
        $$a = new byte[]{7, -117, -88, 7};
        $$b = 108;
    }
}
